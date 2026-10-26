package defpackage;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import com.google.android.gms.common.api.GoogleApiActivity;

/* JADX INFO: loaded from: classes.dex */
public final class vf1 extends wf1 {
    public static final Object b = new Object();
    public static final vf1 c = new vf1();

    public static AlertDialog d(Activity activity, int i, uk4 uk4Var, DialogInterface.OnCancelListener onCancelListener) {
        String string;
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(activity, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(activity);
        }
        builder.setMessage(jk4.b(activity, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        Resources resources = activity.getResources();
        if (i == 1) {
            string = resources.getString(ai.notrack.app.R.string.common_google_play_services_install_button);
        } else if (i != 2) {
            string = i != 3 ? resources.getString(R.string.ok) : resources.getString(ai.notrack.app.R.string.common_google_play_services_enable_button);
        } else {
            string = resources.getString(ai.notrack.app.R.string.common_google_play_services_update_button);
        }
        if (string != null) {
            builder.setPositiveButton(string, uk4Var);
        }
        String strC = jk4.c(activity, i);
        if (strC != null) {
            builder.setTitle(strC);
        }
        Log.w("GoogleApiAvailability", ud2.m(i, "Creating dialog for Google Play services availability issue. ConnectionResult="), new IllegalArgumentException());
        return builder.create();
    }

    public static void e(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof zh) {
                nd1 nd1Var = ((zc1) ((zh) activity).C.c).x;
                tp3 tp3Var = new tp3();
                g13.t(alertDialog, "Cannot display null dialog");
                alertDialog.setOnCancelListener(null);
                alertDialog.setOnDismissListener(null);
                tp3Var.s0 = alertDialog;
                if (onCancelListener != null) {
                    tp3Var.t0 = onCancelListener;
                }
                tp3Var.p0 = false;
                tp3Var.q0 = true;
                nd1Var.getClass();
                er erVar = new er(nd1Var);
                erVar.o = true;
                erVar.f(0, tp3Var, str);
                erVar.e(false, true);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        r41 r41Var = new r41();
        g13.t(alertDialog, "Cannot display null dialog");
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        r41Var.c = alertDialog;
        if (onCancelListener != null) {
            r41Var.d = onCancelListener;
        }
        r41Var.show(fragmentManager, str);
    }

    public final void c(GoogleApiActivity googleApiActivity, int i, GoogleApiActivity googleApiActivity2) {
        AlertDialog alertDialogD = d(googleApiActivity, i, new pk4(super.a(i, googleApiActivity, "d"), googleApiActivity), googleApiActivity2);
        if (alertDialogD == null) {
            return;
        }
        e(googleApiActivity, alertDialogD, "GooglePlayServicesErrorDialog", googleApiActivity2);
    }

    public final void f(Context context, int i, PendingIntent pendingIntent) {
        int i2;
        Log.w("GoogleApiAvailability", ud2.q("GMS core API Availability. ConnectionResult=", ", tag=null", i), new IllegalArgumentException());
        if (i == 18) {
            new rk4(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            if (i == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String strE = i == 6 ? jk4.e(context, "common_google_play_services_resolution_required_title") : jk4.c(context, i);
        if (strE == null) {
            strE = context.getResources().getString(ai.notrack.app.R.string.common_google_play_services_notification_ticker);
        }
        String strD = (i == 6 || i == 19) ? jk4.d(context, "common_google_play_services_resolution_required_text", jk4.a(context)) : jk4.b(context, i);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        g13.s(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        mm2 mm2Var = new mm2(context, null);
        mm2Var.k = true;
        mm2Var.p.flags |= 16;
        mm2Var.e = mm2.b(strE);
        bi4 bi4Var = new bi4();
        bi4Var.d = mm2.b(strD);
        mm2Var.c(bi4Var);
        PackageManager packageManager = context.getPackageManager();
        if (gm4.n == null) {
            gm4.n = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        if (gm4.n.booleanValue()) {
            mm2Var.p.icon = context.getApplicationInfo().icon;
            mm2Var.h = 2;
            if (gm4.I(context)) {
                mm2Var.b.add(new lm2(resources.getString(ai.notrack.app.R.string.common_open_on_phone), pendingIntent));
            } else {
                mm2Var.g = pendingIntent;
            }
        } else {
            mm2Var.p.icon = R.drawable.stat_sys_warning;
            mm2Var.p.tickerText = mm2.b(resources.getString(ai.notrack.app.R.string.common_google_play_services_notification_ticker));
            mm2Var.p.when = System.currentTimeMillis();
            mm2Var.g = pendingIntent;
            mm2Var.f = mm2.b(strD);
        }
        if (sf3.J()) {
            if (!sf3.J()) {
                throw new IllegalStateException();
            }
            synchronized (b) {
            }
            NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
            String string = context.getResources().getString(ai.notrack.app.R.string.common_google_play_services_notification_channel_name);
            if (notificationChannel == null) {
                notificationManager.createNotificationChannel(ap.d(string));
            } else if (!string.contentEquals(notificationChannel.getName())) {
                notificationChannel.setName(string);
                notificationManager.createNotificationChannel(notificationChannel);
            }
            mm2Var.n = "com.google.android.gms.availability";
        }
        Notification notificationA = mm2Var.a();
        if (i == 1 || i == 2 || i == 3) {
            ag1.a.set(false);
            i2 = 10436;
        } else {
            i2 = 39789;
        }
        notificationManager.notify(i2, notificationA);
    }

    public final void g(Activity activity, l32 l32Var, int i, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog alertDialogD = d(activity, i, new tk4(super.a(i, activity, "d"), l32Var), onCancelListener);
        if (alertDialogD == null) {
            return;
        }
        e(activity, alertDialogD, "GooglePlayServicesErrorDialog", onCancelListener);
    }
}
