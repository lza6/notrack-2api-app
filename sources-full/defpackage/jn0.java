package defpackage;

import androidx.compose.foundation.gestures.BringIntoViewSpec$Companion;
import androidx.compose.foundation.gestures.a;

/* JADX INFO: loaded from: classes.dex */
public final class jn0 extends of2 implements ax1, wk0 {
    public nq2 c;
    public final oc3 d;
    public boolean h;
    public cx1 m;
    public boolean n;
    public boolean o;
    public boolean q;
    public final jx l = new jx(0);
    public long p = 0;

    public jn0(nq2 nq2Var, oc3 oc3Var, boolean z) {
        this.c = nq2Var;
        this.d = oc3Var;
        this.h = z;
    }

    public static final float v0(jn0 jn0Var, a aVar) {
        float f;
        h43 h43Var;
        int iCompare;
        if (qq1.a(jn0Var.p, 0L)) {
            return 0.0f;
        }
        oi2 oi2Var = jn0Var.l.a;
        int i = oi2Var.h - 1;
        Object[] objArr = oi2Var.c;
        if (i < objArr.length) {
            h43Var = null;
            while (true) {
                if (i < 0) {
                    f = 0.0f;
                    break;
                }
                h43 h43Var2 = (h43) ((in0) objArr[i]).a.invoke();
                if (h43Var2 != null) {
                    long jD = h43Var2.d();
                    long jW = y64.W(jn0Var.p);
                    f = 0.0f;
                    int iOrdinal = jn0Var.c.ordinal();
                    if (iOrdinal == 0) {
                        iCompare = Float.compare(Float.intBitsToFloat((int) (jD & 4294967295L)), Float.intBitsToFloat((int) (jW & 4294967295L)));
                    } else {
                        if (iOrdinal != 1) {
                            u41.e();
                            return 0.0f;
                        }
                        iCompare = Float.compare(Float.intBitsToFloat((int) (jD >> 32)), Float.intBitsToFloat((int) (jW >> 32)));
                    }
                    if (iCompare > 0) {
                        if (h43Var != null) {
                            break;
                        }
                        h43Var = h43Var2;
                        break;
                    }
                    h43Var = h43Var2;
                }
                i--;
            }
        } else {
            f = 0.0f;
            h43Var = null;
        }
        if (h43Var == null) {
            h43 h43VarW0 = jn0Var.n ? jn0Var.w0() : null;
            if (h43VarW0 == null) {
                return f;
            }
            h43Var = h43VarW0;
        }
        long jW2 = y64.W(jn0Var.p);
        int iOrdinal2 = jn0Var.c.ordinal();
        if (iOrdinal2 == 0) {
            float f2 = h43Var.b;
            return aVar.a(f2, h43Var.d - f2, Float.intBitsToFloat((int) (jW2 & 4294967295L)));
        }
        if (iOrdinal2 == 1) {
            float f3 = h43Var.a;
            return aVar.a(f3, h43Var.c - f3, Float.intBitsToFloat((int) (jW2 >> 32)));
        }
        u41.e();
        return f;
    }

    @Override // defpackage.of2
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // defpackage.ax1
    public final void q(long j) {
        int iZ;
        h43 h43VarW0;
        long j2 = this.p;
        this.p = j;
        int iOrdinal = this.c.ordinal();
        if (iOrdinal == 0) {
            iZ = kr1.z((int) (j & 4294967295L), (int) (4294967295L & j2));
        } else {
            if (iOrdinal != 1) {
                u41.e();
                return;
            }
            iZ = kr1.z((int) (j >> 32), (int) (j2 >> 32));
        }
        if (iZ >= 0 || this.q || this.n || (h43VarW0 = w0()) == null || !x0(j2, h43VarW0)) {
            return;
        }
        this.o = true;
    }

    public final h43 w0() {
        if (isAttached()) {
            wl2 wl2VarL = y64.L(this);
            cx1 cx1Var = this.m;
            if (cx1Var != null) {
                if (!cx1Var.z()) {
                    cx1Var = null;
                }
                if (cx1Var != null) {
                    return wl2VarL.G(cx1Var, false);
                }
            }
        }
        return null;
    }

    public final boolean x0(long j, h43 h43Var) {
        long jZ0 = z0(j, h43Var);
        return Math.abs(Float.intBitsToFloat((int) (jZ0 >> 32))) <= 0.5f && Math.abs(Float.intBitsToFloat((int) (jZ0 & 4294967295L))) <= 0.5f;
    }

    public final void y0() {
        a aVar = (a) gm4.t(this, ux.a);
        if (this.q) {
            so1.c("launchAnimation called when previous animation was running");
        }
        a.a.getClass();
        s94 s94Var = new s94(BringIntoViewSpec$Companion.DefaultScrollAnimationSpec);
        py.F(getCoroutineScope(), null, jq0.l, new qb(this, s94Var, aVar, (so0) null, 12), 1);
    }

    public final long z0(long j, h43 h43Var) {
        long jW = y64.W(j);
        int iOrdinal = this.c.ordinal();
        if (iOrdinal == 0) {
            a aVar = (a) gm4.t(this, ux.a);
            float f = h43Var.b;
            float fA = aVar.a(f, h43Var.d - f, Float.intBitsToFloat((int) (jW & 4294967295L)));
            return (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fA)) & 4294967295L);
        }
        if (iOrdinal != 1) {
            u41.e();
            return 0L;
        }
        a aVar2 = (a) gm4.t(this, ux.a);
        float f2 = h43Var.a;
        return (((long) Float.floatToRawIntBits(aVar2.a(f2, h43Var.c - f2, Float.intBitsToFloat((int) (jW >> 32))))) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
    }
}
