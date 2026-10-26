package defpackage;

import app.template.extension.BuildConfig;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class un4 implements mo4 {
    public static final Object l = new Object();
    public static final lo4 m = new lo4(oo4.class);
    public static final boolean n;
    public static final lh4 o;
    public volatile Object c;
    public volatile pn4 d;
    public volatile tn4 h;

    static {
        boolean z;
        lh4 rn4Var;
        Throwable th;
        Throwable th2;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        n = z;
        String property = System.getProperty("java.runtime.name", BuildConfig.VERSION_NAME);
        Throwable th3 = null;
        if (property == null || property.contains("Android")) {
            try {
                rn4Var = new sn4();
            } catch (Error | Exception e) {
                try {
                    rn4Var = new qn4();
                } catch (Error | Exception e2) {
                    th3 = e2;
                    rn4Var = new rn4();
                }
                th = th3;
                th2 = e;
            }
        } else {
            try {
                rn4Var = new qn4();
            } catch (NoClassDefFoundError unused2) {
                rn4Var = new rn4();
            }
        }
        th = null;
        th2 = null;
        o = rn4Var;
        if (th != null) {
            lo4 lo4Var = m;
            Logger loggerA = lo4Var.a();
            Level level = Level.SEVERE;
            loggerA.logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            lo4Var.a().logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "AtomicReferenceFieldUpdaterAtomicHelper is broken!", th);
        }
    }

    public final void c(tn4 tn4Var) {
        tn4Var.a = null;
        while (true) {
            tn4 tn4Var2 = this.h;
            if (tn4Var2 != tn4.c) {
                tn4 tn4Var3 = null;
                while (tn4Var2 != null) {
                    tn4 tn4Var4 = tn4Var2.b;
                    if (tn4Var2.a != null) {
                        tn4Var3 = tn4Var2;
                    } else if (tn4Var3 != null) {
                        tn4Var3.b = tn4Var4;
                        if (tn4Var3.a == null) {
                        }
                    } else if (!o.h(this, tn4Var2, tn4Var4)) {
                    }
                    tn4Var2 = tn4Var4;
                }
                return;
            }
            return;
        }
    }

    public abstract Throwable d();
}
