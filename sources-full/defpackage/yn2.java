package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class yn2 {
    public boolean a;
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();
    public je1 c;

    public yn2(boolean z) {
        this.a = z;
    }

    public void a() {
    }

    public abstract void b();

    public void c(zq zqVar) {
        zqVar.getClass();
    }

    public void d(zq zqVar) {
        zqVar.getClass();
    }

    public final void e() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((q00) it.next()).cancel();
        }
    }
}
