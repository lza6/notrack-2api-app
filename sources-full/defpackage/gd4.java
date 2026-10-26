package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class gd4 {
    public final hd4 a = new hd4();

    public final void a(String str, AutoCloseable autoCloseable) {
        AutoCloseable autoCloseable2;
        hd4 hd4Var = this.a;
        if (hd4Var != null) {
            if (hd4Var.d) {
                hd4.a(autoCloseable);
                return;
            }
            synchronized (hd4Var.a) {
                autoCloseable2 = (AutoCloseable) hd4Var.b.put(str, autoCloseable);
            }
            hd4.a(autoCloseable2);
        }
    }

    public final void b() {
        hd4 hd4Var = this.a;
        if (hd4Var != null && !hd4Var.d) {
            hd4Var.d = true;
            synchronized (hd4Var.a) {
                try {
                    Iterator it = hd4Var.b.values().iterator();
                    while (it.hasNext()) {
                        hd4.a((AutoCloseable) it.next());
                    }
                    Iterator it2 = hd4Var.c.iterator();
                    while (it2.hasNext()) {
                        hd4.a((AutoCloseable) it2.next());
                    }
                    hd4Var.c.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        d();
    }

    public final AutoCloseable c(String str) {
        AutoCloseable autoCloseable;
        hd4 hd4Var = this.a;
        if (hd4Var == null) {
            return null;
        }
        synchronized (hd4Var.a) {
            autoCloseable = (AutoCloseable) hd4Var.b.get(str);
        }
        return autoCloseable;
    }

    public void d() {
    }
}
