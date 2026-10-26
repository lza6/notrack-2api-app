package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes.dex */
public final class i30 extends vc3 {
    public final jy g;
    public final /* synthetic */ AtomicReferenceArray h;

    public i30(long j, i30 i30Var, jy jyVar, int i) {
        super(j, i30Var, i);
        this.g = jyVar;
        this.h = new AtomicReferenceArray(ly.b * 2);
    }

    @Override // defpackage.vc3
    public final int k() {
        return ly.b;
    }

    @Override // defpackage.vc3
    public final void l(int i, xp0 xp0Var) {
        jy jyVar;
        int i2 = ly.b;
        boolean z = i >= i2;
        if (z) {
            i -= i2;
        }
        this.h.get(i * 2);
        while (true) {
            Object objP = p(i);
            boolean z2 = objP instanceof kf4;
            jyVar = this.g;
            if (z2 || (objP instanceof lf4)) {
                if (o(objP, i, z ? ly.j : ly.k)) {
                    r(i, null);
                    q(i, !z);
                    if (z) {
                        jyVar.getClass();
                        return;
                    }
                    return;
                }
            } else {
                if (objP == ly.j || objP == ly.k) {
                    break;
                }
                if (objP != ly.g && objP != ly.f) {
                    if (objP == ly.i || objP == ly.d || objP == ly.l) {
                        return;
                    }
                    m51.u(objP, "unexpected state: ");
                    return;
                }
            }
        }
        r(i, null);
        if (z) {
            jyVar.getClass();
        }
    }

    public final boolean o(Object obj, int i, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i2 = (i * 2) + 1;
        do {
            atomicReferenceArray = this.h;
            if (atomicReferenceArray.compareAndSet(i2, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i2) == obj);
        return false;
    }

    public final Object p(int i) {
        return this.h.get((i * 2) + 1);
    }

    public final void q(int i, boolean z) {
        if (z) {
            jy jyVar = this.g;
            jyVar.getClass();
            jyVar.R((this.e * ((long) ly.b)) + ((long) i));
        }
        m();
    }

    public final void r(int i, Object obj) {
        this.h.set(i * 2, obj);
    }

    public final void s(int i, Object obj) {
        this.h.set((i * 2) + 1, obj);
    }
}
