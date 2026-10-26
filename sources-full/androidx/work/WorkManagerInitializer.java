package androidx.work;

import android.content.Context;
import defpackage.bg1;
import defpackage.jl0;
import defpackage.ko1;
import defpackage.v72;
import defpackage.wh4;
import defpackage.yh4;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class WorkManagerInitializer implements ko1 {
    public static final String a = v72.h("WrkMgrInitializer");

    @Override // defpackage.ko1
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // defpackage.ko1
    public final Object b(Context context) {
        v72.f().c(a, "Initializing WorkManager with default configuration.");
        jl0 jl0Var = new jl0(new bg1(29));
        context.getClass();
        synchronized (wh4.m) {
            try {
                wh4 wh4Var = wh4.k;
                if (wh4Var != null && wh4.l != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
                if (wh4Var == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (wh4.l == null) {
                        wh4.l = yh4.u(applicationContext, jl0Var);
                    }
                    wh4.k = wh4.l;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return wh4.a(context);
    }
}
