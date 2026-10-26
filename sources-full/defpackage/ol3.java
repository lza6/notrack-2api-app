package defpackage;

import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class ol3 {
    public final le1 a;
    public boolean c;
    public f4 h;
    public nl3 i;
    public final AtomicReference b = new AtomicReference(null);
    public final ea d = new ea(15, this);
    public final pj2 e = new pj2(18, this);
    public final oi2 f = new oi2(0, new nl3[16]);
    public final Object g = new Object();
    public long j = -1;

    public ol3(le1 le1Var) {
        this.a = le1Var;
    }

    public static final boolean a(ol3 ol3Var) {
        boolean z;
        Set set;
        Set set2;
        synchronized (ol3Var.g) {
            z = ol3Var.c;
        }
        if (z) {
            return false;
        }
        boolean z2 = false;
        while (true) {
            AtomicReference atomicReference = ol3Var.b;
            while (true) {
                Object obj = atomicReference.get();
                set = null;
                Object obj2 = null;
                Object objSubList = null;
                if (obj == null) {
                    break;
                }
                if (obj instanceof Set) {
                    set2 = (Set) obj;
                } else {
                    if (!(obj instanceof List)) {
                        mk0.d("Unexpected notification");
                        u41.p();
                        return false;
                    }
                    List list = (List) obj;
                    Set set3 = (Set) list.get(0);
                    if (list.size() == 2) {
                        objSubList = list.get(1);
                    } else if (list.size() > 2) {
                        objSubList = list.subList(1, list.size());
                    }
                    set2 = set3;
                    obj2 = objSubList;
                }
                do {
                    if (atomicReference.compareAndSet(obj, obj2)) {
                        set = set2;
                        break;
                    }
                } while (atomicReference.get() == obj);
            }
            if (set == null) {
                return z2;
            }
            synchronized (ol3Var.g) {
                oi2 oi2Var = ol3Var.f;
                Object[] objArr = oi2Var.c;
                int i = oi2Var.h;
                for (int i2 = 0; i2 < i; i2++) {
                    z2 = ((nl3) objArr[i2]).b(set) || z2;
                }
            }
        }
    }

    public final void b() {
        synchronized (this.g) {
            oi2 oi2Var = this.f;
            Object[] objArr = oi2Var.c;
            int i = oi2Var.h;
            for (int i2 = 0; i2 < i; i2++) {
                nl3 nl3Var = (nl3) objArr[i2];
                nl3Var.e.a();
                nl3Var.f.a();
                nl3Var.k.a();
                nl3Var.l.clear();
            }
        }
    }

    public final void c(Object obj, le1 le1Var, je1 je1Var) {
        Object obj2;
        nl3 nl3Var;
        synchronized (this.g) {
            oi2 oi2Var = this.f;
            Object[] objArr = oi2Var.c;
            int i = oi2Var.h;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    obj2 = null;
                    break;
                }
                obj2 = objArr[i2];
                if (((nl3) obj2).a == le1Var) {
                    break;
                } else {
                    i2++;
                }
            }
            nl3Var = (nl3) obj2;
            if (nl3Var == null) {
                le1Var.getClass();
                y64.l(1, le1Var);
                nl3Var = new nl3(le1Var);
                oi2Var.c(nl3Var);
            }
        }
        nl3 nl3Var2 = this.i;
        long j = this.j;
        if (j != -1 && j != py.A()) {
            zx2.a("Detected multithreaded access to SnapshotStateObserver: previousThreadId=" + j + "), currentThread={id=" + py.A() + ", name=" + Thread.currentThread().getName() + "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
        }
        try {
            this.i = nl3Var;
            this.j = py.A();
            nl3Var.a(obj, this.e, je1Var);
        } finally {
            this.i = nl3Var2;
            this.j = j;
        }
    }

    public final void d() {
        ea eaVar = this.d;
        iy2 iy2Var = vk3.a;
        vk3.f(ba3.F);
        synchronized (vk3.b) {
            vk3.g = ke0.I0(vk3.g, eaVar);
        }
        this.h = new f4(7, eaVar);
    }
}
