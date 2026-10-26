package defpackage;

import android.app.ActivityOptions;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.window.OnBackInvokedDispatcher;
import kotlin.time.DurationKt;

/* JADX INFO: loaded from: classes.dex */
public abstract class l1 {
    public static PackageInfo a(PackageManager packageManager, Context context) {
        return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
    }

    public static Object b(String str, Bundle bundle) {
        return bundle.getParcelable(str, q3.class);
    }

    public static String c(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getUniqueId();
    }

    public static boolean d(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isTextSelectable();
    }

    public static final void e(rx2 rx2Var, qg qgVar) {
        OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
        if (qgVar == null || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = rx2Var.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        onBackInvokedDispatcherFindOnBackInvokedDispatcher.registerOnBackInvokedCallback(DurationKt.NANOS_IN_MILLIS, qgVar);
    }

    public static final void f(rx2 rx2Var, qg qgVar) {
        OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
        if (qgVar == null || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = rx2Var.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        onBackInvokedDispatcherFindOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(qgVar);
    }

    public static void g(ActivityOptions activityOptions, boolean z) {
        activityOptions.setPendingIntentBackgroundActivityLaunchAllowed(z);
    }
}
