package defpackage;

import java.io.Serializable;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class s11 {
    public static final long[] e = new long[0];
    public long a;
    public final Object b;
    public final Object c;
    public final Serializable d;

    public s11(et3 et3Var) {
        et3Var.getClass();
        TimeUnit.MINUTES.getClass();
        this.a = 300000000000L;
        this.b = et3Var.e();
        this.c = new gk1(this, fq2.r(new StringBuilder(), ka4.h, " ConnectionPool"));
        this.d = new ConcurrentLinkedQueue();
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.io.Serializable, long[]] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.io.Serializable, long[]] */
    public s11(tf3 tf3Var, ca0 ca0Var) {
        tf3Var.getClass();
        this.b = tf3Var;
        this.c = ca0Var;
        int iD = tf3Var.d();
        if (iD <= 64) {
            this.a = iD != 64 ? (-1) << iD : 0L;
            this.d = e;
            return;
        }
        this.a = 0L;
        int i = (iD - 1) >>> 6;
        ?? r3 = new long[i];
        if ((iD & 63) != 0) {
            r3[i - 1] = (-1) << iD;
        }
        this.d = r3;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x002c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x0031 A[SYNTHETIC] */
    public boolean a(o4 o4Var, y23 y23Var, ArrayList arrayList, boolean z) {
        Iterator it = ((ConcurrentLinkedQueue) this.d).iterator();
        while (true) {
            if (!it.hasNext()) {
                return false;
            }
            a33 a33Var = (a33) it.next();
            a33Var.getClass();
            synchronized (a33Var) {
                if (z) {
                    try {
                        if (!(a33Var.g != null)) {
                            continue;
                        } else if (a33Var.h(o4Var, arrayList)) {
                            y23Var.b(a33Var);
                            return true;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                } else if (a33Var.h(o4Var, arrayList)) {
                    y23Var.b(a33Var);
                    return true;
                }
            }
        }
    }

    public int b(a33 a33Var, long j) {
        byte[] bArr = ka4.a;
        ArrayList arrayList = a33Var.p;
        int i = 0;
        while (i < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                String str = "A connection to " + a33Var.b.a.h + " was leaked. Did you forget to close a response body?";
                vv2 vv2Var = vv2.a;
                vv2.a.j(((w23) reference).a, str);
                arrayList.remove(i);
                a33Var.j = true;
                if (arrayList.isEmpty()) {
                    a33Var.q = j - this.a;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }
}
