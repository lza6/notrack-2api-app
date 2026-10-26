package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import defpackage.f32;
import defpackage.pz2;
import defpackage.sz0;

/* JADX INFO: loaded from: classes.dex */
public class a extends Fragment {
    public static final /* synthetic */ int d = 0;
    public sz0 c;

    /* JADX INFO: renamed from: androidx.lifecycle.a$a, reason: collision with other inner class name */
    public static final class C0001a implements Application.ActivityLifecycleCallbacks {
        public static final ReportFragment$LifecycleCallbacks$Companion Companion = new ReportFragment$LifecycleCallbacks$Companion();

        public static final void registerIn(Activity activity) {
            Companion.getClass();
            activity.getClass();
            activity.registerActivityLifecycleCallbacks(new C0001a());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            activity.getClass();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            activity.getClass();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            activity.getClass();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            activity.getClass();
            int i = a.d;
            ReportFragment$Companion.dispatch$lifecycle_runtime_release(activity, f32.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            activity.getClass();
            int i = a.d;
            ReportFragment$Companion.dispatch$lifecycle_runtime_release(activity, f32.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            activity.getClass();
            int i = a.d;
            ReportFragment$Companion.dispatch$lifecycle_runtime_release(activity, f32.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            activity.getClass();
            int i = a.d;
            ReportFragment$Companion.dispatch$lifecycle_runtime_release(activity, f32.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            activity.getClass();
            int i = a.d;
            ReportFragment$Companion.dispatch$lifecycle_runtime_release(activity, f32.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            activity.getClass();
            int i = a.d;
            ReportFragment$Companion.dispatch$lifecycle_runtime_release(activity, f32.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            activity.getClass();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            activity.getClass();
            bundle.getClass();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            activity.getClass();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            activity.getClass();
        }
    }

    public final void a(f32 f32Var) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            activity.getClass();
            ReportFragment$Companion.dispatch$lifecycle_runtime_release(activity, f32Var);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(f32.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        a(f32.ON_DESTROY);
        this.c = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        a(f32.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        sz0 sz0Var = this.c;
        if (sz0Var != null) {
            ((pz2) sz0Var.c).c();
        }
        a(f32.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        sz0 sz0Var = this.c;
        if (sz0Var != null) {
            pz2 pz2Var = (pz2) sz0Var.c;
            int i = pz2Var.c + 1;
            pz2Var.c = i;
            if (i == 1 && pz2Var.l) {
                pz2Var.n.e(f32.ON_START);
                pz2Var.l = false;
            }
        }
        a(f32.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        a(f32.ON_STOP);
    }
}
