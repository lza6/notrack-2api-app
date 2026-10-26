package defpackage;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class oi4 {
    public static final String e = v72.h("WorkTimer");
    public final jb a;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final Object d = new Object();

    public oi4(jb jbVar) {
        this.a = jbVar;
    }

    public final void a(vh4 vh4Var) {
        synchronized (this.d) {
            try {
                if (((ni4) this.b.remove(vh4Var)) != null) {
                    v72.f().c(e, "Stopping timer for " + vh4Var);
                    this.c.remove(vh4Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
