package defpackage;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class oz2 extends v21 {
    final /* synthetic */ pz2 this$0;

    public static final class a extends v21 {
        final /* synthetic */ pz2 this$0;

        public a(pz2 pz2Var) {
            this.this$0 = pz2Var;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            activity.getClass();
            this.this$0.c();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            activity.getClass();
            pz2 pz2Var = this.this$0;
            int i = pz2Var.c + 1;
            pz2Var.c = i;
            if (i == 1 && pz2Var.l) {
                pz2Var.n.e(f32.ON_START);
                pz2Var.l = false;
            }
        }
    }

    public oz2(pz2 pz2Var) {
        this.this$0 = pz2Var;
    }

    @Override // defpackage.v21, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        if (Build.VERSION.SDK_INT < 29) {
            int i = androidx.lifecycle.a.d;
            Fragment fragmentFindFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            fragmentFindFragmentByTag.getClass();
            ((androidx.lifecycle.a) fragmentFindFragmentByTag).c = this.this$0.p;
        }
    }

    @Override // defpackage.v21, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        activity.getClass();
        pz2 pz2Var = this.this$0;
        int i = pz2Var.d - 1;
        pz2Var.d = i;
        if (i == 0) {
            Handler handler = pz2Var.m;
            handler.getClass();
            handler.postDelayed(pz2Var.o, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        nz2.a(activity, new a(this.this$0));
    }

    @Override // defpackage.v21, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        activity.getClass();
        pz2 pz2Var = this.this$0;
        int i = pz2Var.c - 1;
        pz2Var.c = i;
        if (i == 0 && pz2Var.h) {
            pz2Var.n.e(f32.ON_STOP);
            pz2Var.l = true;
        }
    }
}
