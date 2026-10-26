package com.pairip.licensecheck;

import android.app.ActivityManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class LicenseClient implements ServiceConnection {
    private static final String BACKGROUND_SERVICE_INTERFACE_CLASS_NAME = "com.android.vending.licensing.IBackgroundLicensingService";
    private static final int ERROR_INVALID_PACKAGE_NAME = 3;
    private static final int EVENTUAL_SHUTDOWN_DELAY_MILLIS = 30000;
    private static final String EXTRA_END_CUSTOM_TRIAL = "end_custom_trial";
    private static final int FIRST_ISOLATED_UID = 99000;
    private static final int FLAG_RPC_CALL = 0;
    private static final int LAST_ISOLATED_UID = 99999;
    private static final int LICENSED = 0;
    private static final int MAX_RETRIES = 3;
    private static final int MILLIS_PER_SEC = 1000;
    private static final long MIN_TRIAL_END_INTERVAL_MILLIS = 3000;
    private static final int NOT_LICENSED = 2;
    private static final String PAYLOAD_PAYWALL = "PAYWALL_INTENT";
    private static final int PER_USER_RANGE = 100000;
    private static final int REPEATED_CHECK_RETRY_DELAY_MILLIS = 300000;
    private static final int RETRY_DELAY_MILLIS = 2000;
    private static final String SERVICE_INTERFACE_CLASS_NAME = "com.android.vending.licensing.ILicensingService";
    private static final String SERVICE_PACKAGE = "com.android.vending";
    private static final String TAG = "LicenseClient";
    private static final int TRANSACTION_CHECK_LICENSE_V2 = 2;
    private static final int TRANSACTION_REPORT_SUCCESSFUL_LICENSE_CHECK = 3;
    protected static boolean backgroundLicensingServiceEnabled = true;
    protected static boolean customTrialEndTriggered = false;
    protected static boolean eventualShutdownEnabled = true;
    public static boolean gracefulShutdownEnabled = true;
    private static final Handler handler;
    private static LicenseClient instance = null;
    protected static long lastTrialEndElapsedRealtimeMillis = 0;
    protected static String licensePubKey = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEArqZw4sh78o+jxGRPoQm2YlUhkHsgXRXqD71fIiZlptE/i7a+KU4NN6oSZmryqLlWcQy+rADvAMsLcCb4YbiBFv2f495xQwL/FpMMRcHAZKAOs1eWm6OvJzT5rO9Eow6WiYVqv6sQ7WyuGSaJxdTrZtwWU2CncYZKwcUjb+xCs9JkuXocANkHIaDTtNd8RV+ZDooZR14tD8F2Rn/I/EuIb8QPolkDJq99wU7tAyH4+VSdCSruT4JD+f4Srnn7C+H8KCINmErUciXyQY+Bnx+dKJDgyEIZ+PojcHqD4hXDB1cvfNkHLZd/KTmiCW2/8gQkjTlD38hbhVYv+FHzRD4DcQIDAQAB";
    protected static boolean localCheckEnabled = true;
    protected static ImmediateTaskExecutor mainThreadRunner = null;
    protected static String packageName = "ai.notrack.app";
    protected static Bundle responsePayload;
    private final Context context;
    protected static boolean repeatedCheckEnabled = false;
    protected static Runnable exitAction = new Runnable() { // from class: com.pairip.licensecheck.LicenseClient.1
        @Override // java.lang.Runnable
        public void run() {
            System.exit(0);
        }
    };
    protected static LicenseCheckState licenseCheckState = LicenseCheckState.CHECK_REQUIRED;
    protected static ImmediateTaskExecutor backgroundRunner = new ImmediateTaskExecutor() { // from class: com.pairip.licensecheck.LicenseClient$$ExternalSyntheticLambda5
        @Override // com.pairip.licensecheck.LicenseClient.ImmediateTaskExecutor
        public final void run(Runnable runnable) {
            new Thread(runnable).start();
        }
    };
    protected DelayedTaskExecutor delayedTaskExecutor = new DelayedTaskExecutorImpl();
    protected int retryNum = 0;
    protected boolean isBound = false;
    protected boolean waitingForRepeatedCheck = false;
    private long repeatedCheckStartElapsedRealtime = 0;

    public interface DelayedTaskExecutor {
        void schedule(Runnable task, long delayMillis);
    }

    private static class DelayedTaskExecutorImpl implements DelayedTaskExecutor {
        private final Handler handler;

        private DelayedTaskExecutorImpl() {
            this.handler = new Handler(Looper.getMainLooper());
        }

        @Override // com.pairip.licensecheck.LicenseClient.DelayedTaskExecutor
        public void schedule(Runnable task, long delayMillis) {
            this.handler.postDelayed(task, delayMillis);
        }
    }

    public interface ImmediateTaskExecutor {
        void run(Runnable task);
    }

    public enum LicenseCheckState {
        CHECK_REQUIRED,
        FULL_CHECK_OK,
        LOCAL_CHECK_OK,
        LOCAL_CHECK_REPORTED,
        REPEATED_CHECK_REQUIRED
    }

    static {
        final Handler handler2 = new Handler(Looper.getMainLooper());
        handler = handler2;
        Objects.requireNonNull(handler2);
        mainThreadRunner = new ImmediateTaskExecutor() { // from class: com.pairip.licensecheck.LicenseClient$$ExternalSyntheticLambda6
            @Override // com.pairip.licensecheck.LicenseClient.ImmediateTaskExecutor
            public final void run(Runnable runnable) {
                handler2.post(runnable);
            }
        };
        customTrialEndTriggered = false;
        lastTrialEndElapsedRealtimeMillis = 0L;
    }

    public LicenseClient(Context context) {
        this.context = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: bindToLicensingService, reason: merged with bridge method [inline-methods] */
    public void lambda$retryOrThrow$1(boolean useBackgroundService) {
        unbindFromLicensingService();
        Log.d(TAG, useBackgroundService ? "Connecting to the background licensing service..." : "Connecting to the main licensing service...");
        String str = useBackgroundService ? BACKGROUND_SERVICE_INTERFACE_CLASS_NAME : SERVICE_INTERFACE_CLASS_NAME;
        Intent action = new Intent(str).setPackage(SERVICE_PACKAGE).setAction(str);
        boolean z = useBackgroundService || isLocalCheckPassed();
        try {
            if (this.context.bindService(action, this, 1)) {
                this.isBound = true;
            } else {
                retryOrThrow(new LicenseCheckException("Could not bind with the licensing service: ".concat(str)), z, useBackgroundService);
            }
        } catch (SecurityException e) {
            retryOrThrow(new LicenseCheckException("Not allowed to bind with the licensing service: ".concat(str), e), z, useBackgroundService);
        }
    }

    public static void checkLicense(final Context context) {
        if (context == null) {
            Log.w(TAG, "Cannot check license with null context.");
        } else if (isIsolatedProcess()) {
            Log.i(TAG, "Skipping license check in isolated process.");
        } else {
            mainThreadRunner.run(new Runnable() { // from class: com.pairip.licensecheck.LicenseClient$$ExternalSyntheticLambda7
                @Override // java.lang.Runnable
                public final void run() {
                    LicenseClient.getInstance(context).initializeLicenseCheck();
                }
            });
        }
    }

    private void checkLicenseInternal(IBinder licensingServiceBinder) throws LicenseCheckException, RemoteException {
        if (licensingServiceBinder == null) {
            retryOrThrow(new LicenseCheckException("Received a null binder."));
            return;
        }
        if (licensingServiceBinder.getInterfaceDescriptor().equals(BACKGROUND_SERVICE_INTERFACE_CLASS_NAME)) {
            throw new LicenseCheckException("Background licensing service does not support full license check.");
        }
        Log.d(TAG, "Sending request to licensing service...");
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                try {
                    populateInputDataForLicenseCheckV2(parcelObtain, licensingServiceBinder);
                    if (!licensingServiceBinder.transact(2, parcelObtain, parcelObtain2, 0)) {
                        handleError(new LicenseCheckException("Licensing service could not process request."));
                    }
                } catch (RemoteException e) {
                    handleError(new LicenseCheckException("Error when calling licensing service.", e));
                }
            } catch (DeadObjectException e2) {
                retryOrThrow(new LicenseCheckException("Licensing service process died.", e2));
            }
        } finally {
            parcelObtain.recycle();
            parcelObtain2.recycle();
            Log.d(TAG, "Request to licensing service sent.");
        }
    }

    private Intent createCloseAppIntentOrExitIfAppInBackground() {
        if (!isForeground()) {
            exitAction.run();
        }
        Intent intent = new Intent(this.context, (Class<?>) LicenseActivity.class);
        if (gracefulShutdownEnabled) {
            intent.addFlags(65536);
        } else {
            intent.addFlags(67108864);
            intent.addFlags(32768);
        }
        intent.addFlags(268435456);
        return intent;
    }

    private static ILicenseV2ResultListener createResultListener(LicenseClient client) {
        return new ILicenseV2ResultListener.Stub() { // from class: com.pairip.licensecheck.LicenseClient.2
            @Override // com.pairip.licensecheck.ILicenseV2ResultListener
            public void verifyLicense(int responseCode, Bundle responsePayload2) {
                LicenseClient.this.processResponse(responseCode, responsePayload2);
            }
        };
    }

    private static synchronized LicenseClient getInstance(Context context) {
        LicenseClient licenseClient;
        licenseClient = instance;
        if (licenseClient == null) {
            licenseClient = new LicenseClient(context);
            instance = licenseClient;
        }
        return licenseClient;
    }

    public static String getLicensePubKey() {
        return licensePubKey;
    }

    private void handleError(final LicenseCheckException ex) {
        mainThreadRunner.run(new Runnable() { // from class: com.pairip.licensecheck.LicenseClient$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$handleError$0(ex);
            }
        });
    }

    private void initiateFreshLicensingServiceConnection(boolean useBackgroundService) {
        this.retryNum = 0;
        lambda$retryOrThrow$1(useBackgroundService);
    }

    private boolean isForeground() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return runningAppProcessInfo.importance <= 100;
    }

    private static boolean isIsolatedProcess() {
        if (Build.VERSION.SDK_INT >= 28) {
            return Process.isIsolated();
        }
        int iMyUid = Process.myUid() % 100000;
        return iMyUid >= FIRST_ISOLATED_UID && iMyUid <= LAST_ISOLATED_UID;
    }

    private static boolean isLocalCheckPassed() {
        return licenseCheckState.equals(LicenseCheckState.LOCAL_CHECK_OK) || licenseCheckState.equals(LicenseCheckState.LOCAL_CHECK_REPORTED);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$handleError$0(LicenseCheckException licenseCheckException) {
        Log.e(TAG, "Error while checking license: " + Log.getStackTraceString(licenseCheckException));
        unbindFromLicensingService();
        if (licenseCheckState.equals(LicenseCheckState.FULL_CHECK_OK) || isLocalCheckPassed()) {
            return;
        }
        startErrorDialogActivity();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initializeLicenseCheck$0() {
        final boolean zPerformLocalInstallerCheck = performLocalInstallerCheck();
        mainThreadRunner.run(new Runnable() { // from class: com.pairip.licensecheck.LicenseClient$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$initializeLicenseCheck$1(zPerformLocalInstallerCheck);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:6:0x000c  */
    public /* synthetic */ void lambda$initializeLicenseCheck$1(boolean z) {
        boolean z2;
        if (z) {
            licenseCheckState = LicenseCheckState.LOCAL_CHECK_OK;
            if (backgroundLicensingServiceEnabled) {
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        initiateFreshLicensingServiceConnection(z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onServiceConnected$0(IBinder iBinder) {
        try {
            checkLicenseInternal(iBinder);
        } catch (RemoteException e) {
            handleError(new LicenseCheckException("Error when getting interface descriptor.", e));
        } catch (LicenseCheckException e2) {
            handleError(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onServiceConnected$1(IBinder iBinder) {
        try {
            reportSuccessfulLicenseCheck(iBinder);
        } catch (Exception e) {
            Log.e(TAG, "Error while reporting license check: " + Log.getStackTraceString(e));
            mainThreadRunner.run(new LicenseClient$$ExternalSyntheticLambda0(this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processResponse$0(RepeatedCheckMetadata repeatedCheckMetadata, Bundle bundle) {
        if (repeatedCheckMetadata != null) {
            licenseCheckState = LicenseCheckState.REPEATED_CHECK_REQUIRED;
            this.repeatedCheckStartElapsedRealtime = getElapsedRealtimeMillis();
            scheduleRepeatedLicenseCheck(repeatedCheckMetadata);
        } else {
            licenseCheckState = LicenseCheckState.FULL_CHECK_OK;
        }
        responsePayload = bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$retryOrThrow$0(boolean z, LicenseCheckException licenseCheckException, boolean z2) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$scheduleRepeatedLicenseCheck$0(RepeatedCheckMetadata repeatedCheckMetadata) {
        long elapsedRealtimeMillis = getElapsedRealtimeMillis() - this.repeatedCheckStartElapsedRealtime;
        if (getCurrentTimeMillis() >= repeatedCheckMetadata.getTimeToRetryMillis() || elapsedRealtimeMillis >= repeatedCheckMetadata.getDurationToRetryMillis()) {
            this.waitingForRepeatedCheck = false;
            initiateFreshLicensingServiceConnection(false);
        } else {
            Log.d(TAG, "Repeated license check is rescheduled.");
            scheduleRepeatedLicenseCheck(repeatedCheckMetadata);
        }
    }

    private boolean performLocalInstallerCheck() {
        return true;
    }

    private void populateInputDataForLicenseCheckV2(Parcel inputData, IBinder licensingService) throws RemoteException {
        inputData.writeInterfaceToken(licensingService.getInterfaceDescriptor());
        inputData.writeString(packageName);
        inputData.writeStrongBinder(createResultListener(this).asBinder());
        Bundle bundle = new Bundle();
        if (customTrialEndTriggered) {
            bundle.putBoolean(EXTRA_END_CUSTOM_TRIAL, true);
        }
        if (bundle.isEmpty()) {
            inputData.writeInt(0);
        } else {
            inputData.writeInt(1);
            bundle.writeToParcel(inputData, 0);
        }
    }

    private void populateInputDataForReportAutoVerifiedLicense(Parcel inputData, IBinder licensingService) throws RemoteException {
        inputData.writeInterfaceToken(licensingService.getInterfaceDescriptor());
        inputData.writeString(packageName);
        inputData.writeInt(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processResponse(int responseCode, Bundle responsePayload2) {
    }

    private void retryOrThrow(LicenseCheckException error) {
        retryOrThrow(error, false, false);
    }

    private void retryOrThrow(final LicenseCheckException error, final boolean ignoreErrorOnFinalFailure, final boolean useBackgroundService) {
        mainThreadRunner.run(new Runnable() { // from class: com.pairip.licensecheck.LicenseClient$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$retryOrThrow$0(useBackgroundService, error, ignoreErrorOnFinalFailure);
            }
        });
    }

    private void scheduleAppShutdown() {
        if (eventualShutdownEnabled) {
            this.delayedTaskExecutor.schedule(exitAction, 30000L);
        }
    }

    private void scheduleRepeatedLicenseCheck(final RepeatedCheckMetadata repeatedCheckMetadata) {
        long jMin = Math.min(Math.min(repeatedCheckMetadata.getDurationToRetryMillis(), Math.max(0L, repeatedCheckMetadata.getTimeToRetryMillis() - getCurrentTimeMillis())), 300000L);
        if (!this.waitingForRepeatedCheck) {
            this.waitingForRepeatedCheck = true;
        }
        this.delayedTaskExecutor.schedule(new Runnable() { // from class: com.pairip.licensecheck.LicenseClient$$ExternalSyntheticLambda14
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$scheduleRepeatedLicenseCheck$0(repeatedCheckMetadata);
            }
        }, jMin);
        Log.d(TAG, String.format("Repeated license check is scheduled in %d ms...", Long.valueOf(jMin)));
    }

    private void startErrorDialogActivity() {
        Intent intentCreateCloseAppIntentOrExitIfAppInBackground = createCloseAppIntentOrExitIfAppInBackground();
        intentCreateCloseAppIntentOrExitIfAppInBackground.putExtra(LicenseActivity.ACTIVITY_TYPE_ARG_NAME, LicenseActivity.ActivityType.ERROR_DIALOG);
        scheduleAppShutdown();
        this.context.startActivity(intentCreateCloseAppIntentOrExitIfAppInBackground);
    }

    private void startPaywallActivity(PendingIntent paywallIntent) {
    }

    static void stopTrial(final Context context) {
        if (context == null) {
            Log.w(TAG, "Cannot trigger trial end with null context.");
        } else if (isIsolatedProcess()) {
            Log.i(TAG, "Skipping trial end in isolated process.");
        } else {
            mainThreadRunner.run(new Runnable() { // from class: com.pairip.licensecheck.LicenseClient$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    LicenseClient.getInstance(context).handleTrialEnd();
                }
            });
        }
    }

    protected long getCurrentTimeMillis() {
        return System.currentTimeMillis();
    }

    protected long getElapsedRealtimeMillis() {
        return SystemClock.elapsedRealtime();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void handleTrialEnd() {
        long elapsedRealtimeMillis = getElapsedRealtimeMillis();
        long j = lastTrialEndElapsedRealtimeMillis;
        long j2 = elapsedRealtimeMillis - j;
        if (j > 0 && j2 < MIN_TRIAL_END_INTERVAL_MILLIS) {
            Log.w(TAG, String.format("Trial end trigger throttled. Ignoring request (sent %d ms ago).", Long.valueOf(j2)));
            return;
        }
        Log.i(TAG, "Trial end event triggered; initiating full license check.");
        lastTrialEndElapsedRealtimeMillis = elapsedRealtimeMillis;
        customTrialEndTriggered = true;
        licenseCheckState = LicenseCheckState.CHECK_REQUIRED;
        this.waitingForRepeatedCheck = false;
        initiateFreshLicensingServiceConnection(false);
    }

    public void initializeLicenseCheck() {
        licenseCheckState = LicenseCheckState.LOCAL_CHECK_OK;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, final IBinder licensingServiceBinder) {
        Log.d(TAG, "Connected to the licensing service.");
        int iOrdinal = licenseCheckState.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    backgroundRunner.run(new Runnable() { // from class: com.pairip.licensecheck.LicenseClient$$ExternalSyntheticLambda10
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f$0.lambda$onServiceConnected$1(licensingServiceBinder);
                        }
                    });
                    return;
                } else if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        return;
                    }
                }
            }
            unbindFromLicensingService();
            return;
        }
        backgroundRunner.run(new Runnable() { // from class: com.pairip.licensecheck.LicenseClient$$ExternalSyntheticLambda9
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$onServiceConnected$0(licensingServiceBinder);
            }
        });
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        boolean z = false;
        this.isBound = false;
        if (licenseCheckState.equals(LicenseCheckState.REPEATED_CHECK_REQUIRED) && this.waitingForRepeatedCheck) {
            Log.d(TAG, "Ignoring service disconnection in REPEATED_CHECK_REQUIRED state.");
            return;
        }
        Log.w(TAG, "Unexpectedly disconnected from the licensing service.");
        boolean zIsLocalCheckPassed = isLocalCheckPassed();
        if (zIsLocalCheckPassed && backgroundLicensingServiceEnabled) {
            z = true;
        }
        retryOrThrow(new LicenseCheckException("Licensing service unexpectedly disconnected."), zIsLocalCheckPassed, z);
    }

    public void reportSuccessfulLicenseCheck(IBinder licensingServiceBinder) throws LicenseCheckException {
        ImmediateTaskExecutor immediateTaskExecutor;
        LicenseClient$$ExternalSyntheticLambda0 licenseClient$$ExternalSyntheticLambda0;
        if (licensingServiceBinder == null) {
            retryOrThrow(new LicenseCheckException("Received a null binder."), true, backgroundLicensingServiceEnabled);
            return;
        }
        Log.d(TAG, "Sending request to license reporting service...");
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            populateInputDataForReportAutoVerifiedLicense(parcelObtain, licensingServiceBinder);
            if (licensingServiceBinder.transact(3, parcelObtain, parcelObtain2, 0)) {
                mainThreadRunner.run(new Runnable() { // from class: com.pairip.licensecheck.LicenseClient$$ExternalSyntheticLambda12
                    @Override // java.lang.Runnable
                    public final void run() {
                        LicenseClient.licenseCheckState = LicenseClient.LicenseCheckState.LOCAL_CHECK_REPORTED;
                    }
                });
            } else {
                Log.e(TAG, "Error sending request to license reporting service.");
            }
            parcelObtain.recycle();
            parcelObtain2.recycle();
            immediateTaskExecutor = mainThreadRunner;
            licenseClient$$ExternalSyntheticLambda0 = new LicenseClient$$ExternalSyntheticLambda0(this);
        } catch (RemoteException e) {
            Log.e(TAG, "Error when calling licensing service." + String.valueOf(e));
            parcelObtain.recycle();
            parcelObtain2.recycle();
            immediateTaskExecutor = mainThreadRunner;
            licenseClient$$ExternalSyntheticLambda0 = new LicenseClient$$ExternalSyntheticLambda0(this);
        } catch (DeadObjectException e2) {
            retryOrThrow(new LicenseCheckException("Licensing service process died.", e2), true, backgroundLicensingServiceEnabled);
            parcelObtain.recycle();
            parcelObtain2.recycle();
            immediateTaskExecutor = mainThreadRunner;
            licenseClient$$ExternalSyntheticLambda0 = new LicenseClient$$ExternalSyntheticLambda0(this);
        } finally {
            parcelObtain.recycle();
            parcelObtain2.recycle();
            mainThreadRunner.run(new LicenseClient$$ExternalSyntheticLambda0(this));
            Log.d(TAG, "Request to licensing reporting service sent.");
        }
        immediateTaskExecutor.run(licenseClient$$ExternalSyntheticLambda0);
    }

    protected void unbindFromLicensingService() {
        if (this.isBound) {
            this.isBound = false;
            try {
                this.context.unbindService(this);
            } catch (RuntimeException e) {
                Log.e(TAG, "Failed to unbind from licensing service.", e);
            }
        }
    }
}
