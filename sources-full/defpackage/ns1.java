package defpackage;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class ns1 implements nn1 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater d = AtomicIntegerFieldUpdater.newUpdater(ns1.class, "_isCompleting$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(ns1.class, Object.class, "_rootCause$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater l;
    public static final /* synthetic */ long m;
    public static final /* synthetic */ long n;
    private volatile /* synthetic */ Object _exceptionsHolder$volatile;
    private volatile /* synthetic */ int _isCompleting$volatile = 0;
    private volatile /* synthetic */ Object _rootCause$volatile;
    public final yl2 c;

    static {
        Unsafe unsafe = u00.a;
        n = unsafe.objectFieldOffset(ns1.class.getDeclaredField("_rootCause$volatile"));
        l = AtomicReferenceFieldUpdater.newUpdater(ns1.class, Object.class, "_exceptionsHolder$volatile");
        m = unsafe.objectFieldOffset(ns1.class.getDeclaredField("_exceptionsHolder$volatile"));
    }

    public ns1(yl2 yl2Var, Throwable th) {
        this.c = yl2Var;
        this._rootCause$volatile = th;
    }

    @Override // defpackage.nn1
    public final boolean a() {
        return e() == null;
    }

    public final void b(Throwable th) {
        Throwable thE = e();
        if (thE == null) {
            i(th);
            return;
        }
        if (th == thE) {
            return;
        }
        Object objD = d();
        if (objD == null) {
            h(th);
            return;
        }
        if (!(objD instanceof Throwable)) {
            if (objD instanceof ArrayList) {
                ((ArrayList) objD).add(th);
                return;
            } else {
                m51.u(objD, "State is ");
                return;
            }
        }
        if (th == objD) {
            return;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(objD);
        arrayList.add(th);
        h(arrayList);
    }

    @Override // defpackage.nn1
    public final yl2 c() {
        return this.c;
    }

    public final Object d() {
        l.getClass();
        return u00.a.getObjectVolatile(this, m);
    }

    public final Throwable e() {
        h.getClass();
        return (Throwable) u00.a.getObjectVolatile(this, n);
    }

    public final boolean f() {
        return e() != null;
    }

    public final ArrayList g(Throwable th) {
        ArrayList arrayList;
        Object objD = d();
        if (objD == null) {
            arrayList = new ArrayList(4);
        } else if (objD instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(objD);
            arrayList = arrayList2;
        } else {
            if (!(objD instanceof ArrayList)) {
                m51.u(objD, "State is ");
                return null;
            }
            arrayList = (ArrayList) objD;
        }
        Throwable thE = e();
        if (thE != null) {
            arrayList.add(0, thE);
        }
        if (th != null && !th.equals(thE)) {
            arrayList.add(th);
        }
        h(py.o);
        return arrayList;
    }

    public final void h(Object obj) {
        l.getClass();
        u00.a.putObjectVolatile(this, m, obj);
    }

    public final void i(Throwable th) {
        h.getClass();
        u00.a.putObjectVolatile(this, n, th);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Finishing[cancelling=");
        sb.append(f());
        sb.append(", completing=");
        sb.append(d.get(this) == 1);
        sb.append(", rootCause=");
        sb.append(e());
        sb.append(", exceptions=");
        sb.append(d());
        sb.append(", list=");
        sb.append(this.c);
        sb.append(']');
        return sb.toString();
    }
}
