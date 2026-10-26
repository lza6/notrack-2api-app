package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class n3 implements Application.ActivityLifecycleCallbacks {
    public Object c;
    public Activity d;
    public final int h;
    public boolean l = false;
    public boolean m = false;
    public boolean n = false;

    public n3(Activity activity) {
        this.d = activity;
        this.h = activity.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.d == activity) {
            this.d = null;
            this.m = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (!this.m || this.n || this.l) {
            return;
        }
        Object obj = this.c;
        try {
            Object obj2 = o3.c.get(activity);
            if (obj2 == obj && activity.hashCode() == this.h) {
                o3.g.postAtFrontOfQueue(new io4(o3.b.get(activity), 4, obj2));
                this.n = true;
                this.c = null;
            }
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.d == activity) {
            this.l = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
