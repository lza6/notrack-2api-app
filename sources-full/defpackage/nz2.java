package defpackage;

import android.app.Activity;
import android.app.Application;

/* JADX INFO: loaded from: classes.dex */
public abstract class nz2 {
    public static final void a(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activity.getClass();
        activityLifecycleCallbacks.getClass();
        activity.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
    }
}
