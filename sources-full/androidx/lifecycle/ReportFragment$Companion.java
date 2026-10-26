package androidx.lifecycle;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;
import defpackage.f32;
import defpackage.n32;
import defpackage.p32;

/* JADX INFO: loaded from: classes.dex */
public abstract class ReportFragment$Companion {
    /* JADX WARN: Multi-variable type inference failed */
    public static void dispatch$lifecycle_runtime_release(Activity activity, f32 f32Var) {
        p32 p32VarH;
        f32Var.getClass();
        if (!(activity instanceof n32) || (p32VarH = ((n32) activity).h()) == null) {
            return;
        }
        p32VarH.e(f32Var);
    }

    public static void injectIfNeededIn(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            a.C0001a.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new a.C0001a());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new a(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
