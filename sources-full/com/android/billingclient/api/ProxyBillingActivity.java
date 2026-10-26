package com.android.billingclient.api;

import android.app.Activity;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import defpackage.eu;
import defpackage.fq2;
import defpackage.fu;
import defpackage.fy2;
import defpackage.go4;
import defpackage.gr4;
import defpackage.jr1;
import defpackage.kr4;
import defpackage.lr4;
import defpackage.tm4;
import defpackage.to4;
import defpackage.wr4;
import defpackage.xr4;

/* JADX INFO: loaded from: classes.dex */
public class ProxyBillingActivity extends Activity {
    public ResultReceiver c;
    public boolean d;
    public boolean h;
    public int l;
    public long m;
    public boolean n;
    public to4 o;
    public fy2 p;

    public static int a(Intent intent, int i) {
        if (intent != null) {
            if (intent.getExtras() == null) {
                return 22;
            }
            return i == 5 ? 139 : 1;
        }
        if (i == -1) {
            return 113;
        }
        if (i == 0) {
            return 114;
        }
        if (i != 3) {
            return i != 4 ? 117 : 116;
        }
        return 115;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x004c  */
    public final Intent b(boolean z, int i, long j) {
        fu fuVar;
        Intent intentC = c();
        gr4 gr4Var = gr4.BROADCAST_ACTION_UNSPECIFIED;
        if (z) {
            to4 to4Var = this.o;
            if (to4Var != null && (fuVar = to4Var.a) != null) {
                intentC.putExtra("RESPONSE_CODE", fuVar.a);
                intentC.putExtra("DEBUG_MESSAGE", fuVar.c);
            } else if (to4Var == null || to4Var.b) {
                intentC.putExtra("RESPONSE_CODE", 6);
                intentC.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
                eu euVarA = fu.a();
                euVarA.c = 6;
                euVarA.h = "An internal error occurred.";
                intentC.putExtra("FAILURE_LOGGING_PAYLOAD", go4.b(i, 2, euVarA.m(), null, gr4Var).b());
            } else {
                intentC.putExtra("RESPONSE_CODE", 3);
                intentC.putExtra("DEBUG_MESSAGE", "Play Store is blocked.");
                eu euVarA2 = fu.a();
                euVarA2.c = 3;
                euVarA2.h = "Play Store is blocked.";
                intentC.putExtra("FAILURE_LOGGING_PAYLOAD", go4.b(142, 2, euVarA2.m(), null, gr4Var).b());
            }
        } else {
            intentC.putExtra("RESPONSE_CODE", 6);
            intentC.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
            eu euVarA3 = fu.a();
            euVarA3.c = 6;
            euVarA3.h = "An internal error occurred.";
            intentC.putExtra("FAILURE_LOGGING_PAYLOAD", go4.b(i, 2, euVarA3.m(), null, gr4Var).b());
        }
        intentC.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
        intentC.putExtra("billingClientTransactionId", j);
        intentC.putExtra("wasServiceAutoReconnected", this.n);
        return intentC;
    }

    public final Intent c() {
        Intent intent = new Intent("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intent.setPackage(getApplicationContext().getPackageName());
        return intent;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x003e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0040  */
    /* JADX WARN: Code duplicated, block: B:29:0x006d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x006f  */
    /* JADX WARN: Code duplicated, block: B:31:0x0070 A[PHI: r11
  0x0070: PHI (r11v1 int) = (r11v0 int), (r11v16 int) binds: [B:28:0x006b, B:30:0x006f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:33:0x008c  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:50:0x0110  */
    /* JADX WARN: Code duplicated, block: B:6:0x0012  */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Instruction removed from duplicated block: B:31:0x0070, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:33:0x008c, please report this as an issue */
    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        boolean z;
        int i3;
        int i4;
        String string;
        Intent intentC;
        boolean z2;
        int i5;
        ResultReceiver resultReceiver;
        Bundle extras;
        super.onActivityResult(i, i2, intent);
        if (i == 100) {
            if (intent == null) {
                z = false;
            } else {
                z = true;
            }
            i3 = tm4.e(intent, "ProxyBillingActivity").a;
            i4 = -1;
            if (i2 != -1) {
                tm4.h("ProxyBillingActivity", "Activity finished with resultCode " + i2 + " and billing's responseCode: " + i3);
                i4 = i2;
            } else if (i3 != 0) {
                i2 = -1;
                tm4.h("ProxyBillingActivity", "Activity finished with resultCode " + i2 + " and billing's responseCode: " + i3);
                i4 = i2;
            }
            if (true != z) {
                tm4.h("ProxyBillingActivity", "Got null data with resultCode " + i4 + "!");
            } else if (intent.getExtras() == null) {
                tm4.h("ProxyBillingActivity", "Got null bundle!");
            }
            if (fq2.b(a(intent, i4), 1)) {
                string = intent.getExtras().getString("ALTERNATIVE_BILLING_USER_CHOICE_DATA");
                if (string != null) {
                    Intent intent2 = new Intent("com.android.vending.billing.ALTERNATIVE_BILLING");
                    intent2.setPackage(getApplicationContext().getPackageName());
                    intent2.putExtra("ALTERNATIVE_BILLING_USER_CHOICE_DATA", string);
                    intent2.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                    intentC = intent2;
                } else {
                    intentC = c();
                    intentC.putExtras(intent.getExtras());
                    intentC.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                }
                intentC.putExtra("billingClientTransactionId", this.m);
                intentC.putExtra("wasServiceAutoReconnected", this.n);
            } else {
                int iA = a(intent, i4);
                long j = this.m;
                if (intent == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                intentC = b(z2, iA, j);
            }
            if (i == 110) {
                intentC.putExtra("IS_FIRST_PARTY_PURCHASE", true);
            }
            sendBroadcast(intentC);
        } else if (i == 110) {
            if (intent == null) {
                z = false;
            } else {
                z = true;
            }
            i3 = tm4.e(intent, "ProxyBillingActivity").a;
            i4 = -1;
            if (i2 != -1) {
                tm4.h("ProxyBillingActivity", "Activity finished with resultCode " + i2 + " and billing's responseCode: " + i3);
                i4 = i2;
            } else if (i3 != 0) {
                i2 = -1;
                tm4.h("ProxyBillingActivity", "Activity finished with resultCode " + i2 + " and billing's responseCode: " + i3);
                i4 = i2;
            }
            if (true != z) {
                tm4.h("ProxyBillingActivity", "Got null data with resultCode " + i4 + "!");
            } else if (intent.getExtras() == null) {
                tm4.h("ProxyBillingActivity", "Got null bundle!");
            }
            if (fq2.b(a(intent, i4), 1)) {
                int iA2 = a(intent, i4);
                long j2 = this.m;
                if (intent == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                intentC = b(z2, iA2, j2);
            } else {
                string = intent.getExtras().getString("ALTERNATIVE_BILLING_USER_CHOICE_DATA");
                if (string != null) {
                    Intent intent3 = new Intent("com.android.vending.billing.ALTERNATIVE_BILLING");
                    intent3.setPackage(getApplicationContext().getPackageName());
                    intent3.putExtra("ALTERNATIVE_BILLING_USER_CHOICE_DATA", string);
                    intent3.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                    intentC = intent3;
                } else {
                    intentC = c();
                    intentC.putExtras(intent.getExtras());
                    intentC.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                }
                intentC.putExtra("billingClientTransactionId", this.m);
                intentC.putExtra("wasServiceAutoReconnected", this.n);
            }
            if (i == 110) {
                intentC.putExtra("IS_FIRST_PARTY_PURCHASE", true);
            }
            sendBroadcast(intentC);
        } else if (i == 101) {
            int i6 = tm4.a;
            if (intent == null) {
                tm4.h("ProxyBillingActivity", "Got null intent!");
                intent = null;
            } else {
                Bundle extras2 = intent.getExtras();
                if (extras2 == null) {
                    tm4.h("ProxyBillingActivity", "Unexpected null bundle received!");
                } else {
                    i5 = extras2.getInt("IN_APP_MESSAGE_RESPONSE_CODE", 0);
                }
                resultReceiver = this.c;
                if (resultReceiver != null) {
                    if (intent == null) {
                        extras = null;
                    } else {
                        extras = intent.getExtras();
                    }
                    resultReceiver.send(i5, extras);
                }
            }
            i5 = 0;
            resultReceiver = this.c;
            if (resultReceiver != null) {
                if (intent == null) {
                    extras = null;
                } else {
                    extras = intent.getExtras();
                }
                resultReceiver.send(i5, extras);
            }
        } else {
            tm4.h("ProxyBillingActivity", "Got onActivityResult with wrong requestCode: " + i + "; skipping...");
        }
        this.d = false;
        to4 to4Var = this.o;
        if (to4Var != null) {
            to4Var.a = null;
        }
        finish();
    }

    /* JADX WARN: Code duplicated, block: B:78:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:79:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:81:0x01d2  */
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        boolean zContainsKey;
        int i;
        PendingIntent pendingIntent;
        ProxyBillingActivity proxyBillingActivity;
        IntentSender.SendIntentException sendIntentException;
        ResultReceiver resultReceiver;
        Intent intentB;
        Bundle bundle2;
        Bundle bundle3;
        super.onCreate(bundle);
        if (bundle == null) {
            zContainsKey = getIntent() == null ? false : getIntent().hasExtra("IN_APP_MESSAGE_INTENT");
        } else {
            zContainsKey = bundle.containsKey("in_app_message_result_receiver");
        }
        if (!zContainsKey) {
            try {
                i = getPackageManager().getPackageInfo(getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException e) {
                tm4.i("ProxyBillingActivity", "Failed to get package info for current package.", e);
                i = -1;
            }
            if (this.p == null) {
                Context applicationContext = getApplicationContext();
                kr4 kr4VarZ = lr4.z();
                kr4VarZ.g(getPackageName());
                kr4VarZ.h();
                kr4VarZ.d(i);
                kr4VarZ.c(Build.VERSION.SDK_INT);
                kr4VarZ.f();
                this.p = new fy2(applicationContext, (lr4) kr4VarZ.a());
            }
            synchronized (this) {
                try {
                    this.o = new to4(this.p);
                    IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.IN_APP_BILLING_RESULT_UPDATE_ACTION");
                    intentFilter.addAction("com.android.vending.billing.PLAY_BILLING_ACTIVITY_CREATED_ACTION");
                    jr1.G(this, this.o, intentFilter);
                } catch (NoSuchMethodError | RuntimeException e2) {
                    this.o = null;
                    boolean z = e2 instanceof NoSuchMethodError;
                    fy2 fy2Var = this.p;
                    if (z) {
                        wr4 wr4VarP = xr4.p();
                        wr4VarP.b();
                        xr4.q((xr4) wr4VarP.d, 2);
                        fy2Var.r((xr4) wr4VarP.a());
                    } else {
                        wr4 wr4VarP2 = xr4.p();
                        wr4VarP2.b();
                        xr4.q((xr4) wr4VarP2.d, 1);
                        fy2Var.r((xr4) wr4VarP2.a());
                    }
                    tm4.i("ProxyBillingActivity", "Failed to register receiver.", e2);
                }
            }
        }
        if (bundle != null) {
            tm4.g("ProxyBillingActivity", "Launching Play Store billing flow from savedInstanceState");
            this.d = bundle.getBoolean("send_cancelled_broadcast_if_finished", false);
            if (bundle.containsKey("in_app_message_result_receiver")) {
                this.c = (ResultReceiver) bundle.getParcelable("in_app_message_result_receiver");
            }
            this.h = bundle.getBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false);
            this.l = bundle.getInt("activity_code", 100);
            if (bundle.containsKey("billingClientTransactionId")) {
                this.m = bundle.getLong("billingClientTransactionId");
            }
            if (bundle.containsKey("wasServiceAutoReconnected")) {
                this.n = bundle.getBoolean("wasServiceAutoReconnected");
                return;
            }
            return;
        }
        tm4.g("ProxyBillingActivity", "Launching Play Store billing flow");
        this.l = 100;
        if (getIntent().hasExtra("BUY_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("BUY_INTENT");
            if (getIntent().hasExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT") && getIntent().getBooleanExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false)) {
                this.h = true;
                this.l = 110;
            }
        } else if (getIntent().hasExtra("IN_APP_MESSAGE_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("IN_APP_MESSAGE_INTENT");
            this.c = (ResultReceiver) getIntent().getParcelableExtra("in_app_message_result_receiver");
            this.l = 101;
        } else {
            pendingIntent = null;
        }
        if (getIntent().hasExtra("billingClientTransactionId")) {
            this.m = getIntent().getLongExtra("billingClientTransactionId", 0L);
        }
        if (getIntent().hasExtra("wasServiceAutoReconnected")) {
            this.n = getIntent().getBooleanExtra("wasServiceAutoReconnected", false);
        }
        try {
            this.d = true;
            int i2 = Build.VERSION.SDK_INT;
            try {
                try {
                    if (i2 < 36) {
                        if (i2 >= 34) {
                            bundle3 = ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle();
                        } else {
                            bundle2 = null;
                        }
                        proxyBillingActivity = this;
                        proxyBillingActivity.startIntentSenderForResult(pendingIntent.getIntentSender(), this.l, new Intent(), 0, 0, 0, bundle2);
                        return;
                    }
                    bundle3 = ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(3).toBundle();
                    proxyBillingActivity.startIntentSenderForResult(pendingIntent.getIntentSender(), this.l, new Intent(), 0, 0, 0, bundle2);
                    return;
                } catch (IntentSender.SendIntentException e3) {
                    e = e3;
                    sendIntentException = e;
                    tm4.i("ProxyBillingActivity", "Got exception while trying to start a purchase flow.", sendIntentException);
                    resultReceiver = proxyBillingActivity.c;
                    if (resultReceiver != null) {
                        resultReceiver.send(0, null);
                    } else {
                        intentB = proxyBillingActivity.b(false, 137, proxyBillingActivity.m);
                        if (proxyBillingActivity.h) {
                            intentB.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                        }
                        proxyBillingActivity.sendBroadcast(intentB);
                    }
                    proxyBillingActivity.d = false;
                    proxyBillingActivity.finish();
                }
                bundle2 = bundle3;
                proxyBillingActivity = this;
            } catch (IntentSender.SendIntentException e4) {
                sendIntentException = e4;
                proxyBillingActivity = this;
                tm4.i("ProxyBillingActivity", "Got exception while trying to start a purchase flow.", sendIntentException);
                resultReceiver = proxyBillingActivity.c;
                if (resultReceiver != null) {
                    resultReceiver.send(0, null);
                } else {
                    intentB = proxyBillingActivity.b(false, 137, proxyBillingActivity.m);
                    if (proxyBillingActivity.h) {
                        intentB.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                    }
                    proxyBillingActivity.sendBroadcast(intentB);
                }
                proxyBillingActivity.d = false;
                proxyBillingActivity.finish();
            }
        } catch (IntentSender.SendIntentException e5) {
            e = e5;
            proxyBillingActivity = this;
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        fu fuVar;
        super.onDestroy();
        to4 to4Var = this.o;
        if (to4Var != null) {
            fuVar = to4Var.a;
            try {
                unregisterReceiver(to4Var);
            } catch (RuntimeException e) {
                tm4.i("ProxyBillingActivity", "Failed to unregister receiver.", e);
            }
        } else {
            fuVar = null;
        }
        if (isFinishing() && this.d) {
            Intent intentC = c();
            if (fuVar != null) {
                intentC.putExtra("RESPONSE_CODE", fuVar.a);
                intentC.putExtra("DEBUG_MESSAGE", fuVar.c);
            } else {
                intentC.putExtra("RESPONSE_CODE", 1);
                intentC.putExtra("DEBUG_MESSAGE", "Billing dialog closed.");
            }
            if (this.h) {
                intentC.putExtra("IS_FIRST_PARTY_PURCHASE", true);
            }
            int i = this.l;
            if (i == 110 || i == 100) {
                intentC.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                intentC.putExtra("billingClientTransactionId", this.m);
            }
            sendBroadcast(intentC);
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.c;
        if (resultReceiver != null) {
            bundle.putParcelable("in_app_message_result_receiver", resultReceiver);
        }
        bundle.putBoolean("send_cancelled_broadcast_if_finished", this.d);
        bundle.putBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", this.h);
        bundle.putInt("activity_code", this.l);
        bundle.putLong("billingClientTransactionId", this.m);
        bundle.putBoolean("wasServiceAutoReconnected", this.n);
    }
}
