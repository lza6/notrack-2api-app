package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class qd implements Application.ActivityLifecycleCallbacks {
    public final double c;
    public final /* synthetic */ sd d;

    public qd(sd sdVar, g33 g33Var) {
        this.d = sdVar;
        d33 d33Var = g33Var.a;
        f61 f61Var = jm1.a;
        Object obj = d33Var.b.n.a.get(jm1.d);
        this.c = ((Number) (obj == null ? Double.valueOf(1.0d) : obj)).doubleValue();
    }

    public final void a(Context context) {
        long j;
        double d = this.c;
        if (d == 1.0d) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        ((Application) applicationContext).registerActivityLifecycleCallbacks(this);
        sd sdVar = this.d;
        g33 g33Var = (g33) ((WeakReference) sdVar.b).get();
        if (g33Var == null) {
            sdVar.g();
            return;
        }
        k33 k33VarC = g33Var.c();
        if (k33VarC != null) {
            synchronized (k33VarC.c) {
                j = k33VarC.a.a;
            }
            k33VarC.a((long) (d * j));
        }
    }

    public final void b(Context context) {
        long j;
        if (this.c == 1.0d) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        ((Application) applicationContext).unregisterActivityLifecycleCallbacks(this);
        sd sdVar = this.d;
        g33 g33Var = (g33) ((WeakReference) sdVar.b).get();
        if (g33Var == null) {
            sdVar.g();
            return;
        }
        k33 k33VarC = g33Var.c();
        if (k33VarC != null) {
            synchronized (k33VarC.c) {
                j = k33VarC.a.a;
            }
            k33VarC.a(j);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        b(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
