package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import defpackage.ci4;
import defpackage.f32;
import defpackage.i32;
import defpackage.j32;
import defpackage.ko1;
import defpackage.oz2;
import defpackage.pz2;
import defpackage.u41;
import defpackage.z21;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements ko1 {
    @Override // defpackage.ko1
    public final List a() {
        return z21.c;
    }

    @Override // defpackage.ko1
    public final Object b(Context context) {
        context.getClass();
        ci4 ci4VarA = ci4.A(context);
        ci4VarA.getClass();
        if (!((HashSet) ci4VarA.h).contains(ProcessLifecycleInitializer.class)) {
            u41.r("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
            return null;
        }
        if (!j32.a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new i32());
        }
        pz2 pz2Var = pz2.q;
        pz2Var.getClass();
        pz2Var.m = new Handler();
        pz2Var.n.e(f32.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        applicationContext2.getClass();
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new oz2(pz2Var));
        return pz2Var;
    }
}
