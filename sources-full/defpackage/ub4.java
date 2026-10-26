package defpackage;

import androidx.compose.runtime.Composer$Companion;
import androidx.compose.ui.platform.CompositionLocalsKt;
import java.util.List;
import java.util.Map;
import kotlin.uuid.Uuid;

/* JADX INFO: loaded from: classes.dex */
public abstract class ub4 {
    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    /* JADX WARN: Code duplicated, block: B:27:0x004a  */
    /* JADX WARN: Code duplicated, block: B:30:0x0052 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0054  */
    /* JADX WARN: Code duplicated, block: B:32:0x0057  */
    /* JADX WARN: Code duplicated, block: B:36:0x0067  */
    /* JADX WARN: Code duplicated, block: B:38:0x0071  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:42:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:44:0x0112  */
    /* JADX WARN: Code duplicated, block: B:46:0x011f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0129  */
    /* JADX WARN: Code duplicated, block: B:54:? A[RETURN, SYNTHETIC] */
    public static final void RenderVectorGroup(ob4 ob4Var, Map<String, ? extends kb4> map, ck0 ck0Var, int i, int i2) {
        int i3;
        Map<String, ? extends kb4> map2;
        boolean z;
        boolean z2;
        boolean z3;
        Map<String, ? extends kb4> map3;
        w33 w33VarV;
        Map<String, ? extends kb4> map4;
        boolean z4;
        boolean z5;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(-446179233);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = i | (kk0Var.h(ob4Var) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                map2 = map;
                i3 |= kk0Var.j(map2) ? 32 : 16;
            }
            z = false;
            z2 = true;
            if ((i3 & 19) != 18) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (kk0Var.S(i3 & 1, z3)) {
                if (i4 != 0) {
                    map4 = a31.c;
                } else {
                    map4 = map2;
                }
                ob4Var.getClass();
                for (qb4 qb4Var : ob4Var.r) {
                    if (qb4Var instanceof vb4) {
                        kk0Var.a0(-23302778);
                        vb4 vb4Var = (vb4) qb4Var;
                        String str = vb4Var.c;
                        map4.get(str);
                        boolean z6 = z;
                        kk0 kk0Var2 = kk0Var;
                        jb4.m218x77b63753(vb4Var.d, vb4Var.h, str, vb4Var.l, vb4Var.m, vb4Var.n, vb4Var.o, vb4Var.p, vb4Var.q, vb4Var.r, vb4Var.s, vb4Var.t, vb4Var.u, vb4Var.v, kk0Var2, 0, 0, 0);
                        kk0Var = kk0Var2;
                        kk0Var.r(z6);
                        z2 = true;
                        z = z6;
                    } else {
                        z4 = z;
                        if (qb4Var instanceof ob4) {
                            kk0Var.a0(-21889209);
                            ob4 ob4Var2 = (ob4) qb4Var;
                            map4.get(ob4Var2.c);
                            z5 = true;
                            jb4.Group(ob4Var2.c, ob4Var2.d, ob4Var2.h, ob4Var2.l, ob4Var2.m, ob4Var2.n, ob4Var2.o, ob4Var2.p, ob4Var2.q, zg0.rememberComposableLambda(1450046638, true, new sb4(ob4Var2, map4), kk0Var, 54), kk0Var, 805306368, 0);
                            kk0Var.r(z4);
                        } else {
                            z5 = true;
                            kk0Var.a0(-20884003);
                            kk0Var.r(z4);
                        }
                        z = z4;
                        z2 = z5;
                    }
                }
                map3 = map4;
            } else {
                kk0Var.V();
                map3 = map2;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new va(ob4Var, map3, i, i2, 4));
            }
        }
        i3 |= 48;
        map2 = map;
        z = false;
        z2 = true;
        if ((i3 & 19) != 18) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (kk0Var.S(i3 & 1, z3)) {
            if (i4 != 0) {
                map4 = a31.c;
            } else {
                map4 = map2;
            }
            ob4Var.getClass();
            while (r20.hasNext()) {
                if (qb4Var instanceof vb4) {
                    kk0Var.a0(-23302778);
                    vb4 vb4Var2 = (vb4) qb4Var;
                    String str2 = vb4Var2.c;
                    map4.get(str2);
                    boolean z7 = z;
                    kk0 kk0Var3 = kk0Var;
                    jb4.m218x77b63753(vb4Var2.d, vb4Var2.h, str2, vb4Var2.l, vb4Var2.m, vb4Var2.n, vb4Var2.o, vb4Var2.p, vb4Var2.q, vb4Var2.r, vb4Var2.s, vb4Var2.t, vb4Var2.u, vb4Var2.v, kk0Var3, 0, 0, 0);
                    kk0Var = kk0Var3;
                    kk0Var.r(z7);
                    z2 = true;
                    z = z7;
                } else {
                    z4 = z;
                    if (qb4Var instanceof ob4) {
                        kk0Var.a0(-21889209);
                        ob4 ob4Var3 = (ob4) qb4Var;
                        map4.get(ob4Var3.c);
                        z5 = true;
                        jb4.Group(ob4Var3.c, ob4Var3.d, ob4Var3.h, ob4Var3.l, ob4Var3.m, ob4Var3.n, ob4Var3.o, ob4Var3.p, ob4Var3.q, zg0.rememberComposableLambda(1450046638, true, new sb4(ob4Var3, map4), kk0Var, 54), kk0Var, 805306368, 0);
                        kk0Var.r(z4);
                    } else {
                        z5 = true;
                        kk0Var.a0(-20884003);
                        kk0Var.r(z4);
                    }
                    z = z4;
                    z2 = z5;
                }
            }
            map3 = map4;
        } else {
            kk0Var.V();
            map3 = map2;
        }
        w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new va(ob4Var, map3, i, i2, 4));
        }
    }

    public static final void a(rb4 rb4Var, long j, long j2, String str, te0 te0Var, boolean z) {
        rb4Var.n.setValue(new bi3(j));
        rb4Var.o.setValue(Boolean.valueOf(z));
        fb4 fb4Var = rb4Var.p;
        fb4Var.g.setValue(te0Var);
        fb4Var.i.setValue(new bi3(j2));
        fb4Var.c = str;
    }

    public static final void b(ug1 ug1Var, ob4 ob4Var) {
        List list = ob4Var.r;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            qb4 qb4Var = (qb4) list.get(i);
            if (qb4Var instanceof vb4) {
                ot2 ot2Var = new ot2();
                vb4 vb4Var = (vb4) qb4Var;
                ot2Var.d = vb4Var.d;
                ot2Var.n = true;
                ot2Var.c();
                ot2Var.s.f(vb4Var.h);
                ot2Var.c();
                ot2Var.c();
                ot2Var.b = vb4Var.l;
                ot2Var.c();
                ot2Var.c = vb4Var.m;
                ot2Var.c();
                ot2Var.g = vb4Var.n;
                ot2Var.c();
                ot2Var.e = vb4Var.o;
                ot2Var.c();
                ot2Var.f = vb4Var.p;
                ot2Var.o = true;
                ot2Var.c();
                ot2Var.h = vb4Var.q;
                ot2Var.o = true;
                ot2Var.c();
                ot2Var.i = vb4Var.r;
                ot2Var.o = true;
                ot2Var.c();
                ot2Var.j = vb4Var.s;
                ot2Var.o = true;
                ot2Var.c();
                ot2Var.k = vb4Var.t;
                ot2Var.p = true;
                ot2Var.c();
                ot2Var.l = vb4Var.u;
                ot2Var.p = true;
                ot2Var.c();
                ot2Var.m = vb4Var.v;
                ot2Var.p = true;
                ot2Var.c();
                ug1Var.e(i, ot2Var);
            } else if (qb4Var instanceof ob4) {
                ug1 ug1Var2 = new ug1();
                ob4 ob4Var2 = (ob4) qb4Var;
                ug1Var2.k = ob4Var2.c;
                ug1Var2.c();
                ug1Var2.l = ob4Var2.d;
                ug1Var2.s = true;
                ug1Var2.c();
                ug1Var2.o = ob4Var2.m;
                ug1Var2.s = true;
                ug1Var2.c();
                ug1Var2.p = ob4Var2.n;
                ug1Var2.s = true;
                ug1Var2.c();
                ug1Var2.q = ob4Var2.o;
                ug1Var2.s = true;
                ug1Var2.c();
                ug1Var2.r = ob4Var2.p;
                ug1Var2.s = true;
                ug1Var2.c();
                ug1Var2.m = ob4Var2.h;
                ug1Var2.s = true;
                ug1Var2.c();
                ug1Var2.n = ob4Var2.l;
                ug1Var2.s = true;
                ug1Var2.c();
                ug1Var2.f = ob4Var2.q;
                ug1Var2.g = true;
                ug1Var2.c();
                b(ug1Var2, ob4Var2);
                ug1Var.e(i, ug1Var2);
            }
        }
    }

    public static final long c(float f, float f2, long j) {
        if (Float.isNaN(f)) {
            f = Float.intBitsToFloat((int) (j >> 32));
        }
        if (Float.isNaN(f2)) {
            f2 = Float.intBitsToFloat((int) (j & 4294967295L));
        }
        return (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static final rb4 rememberVectorPainter(ym1 ym1Var, ck0 ck0Var, int i) {
        kk0 kk0Var = (kk0) ck0Var;
        wu0 wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
        boolean zG = kk0Var.g((((long) Float.floatToRawIntBits(wu0Var.getDensity())) & 4294967295L) | (((long) Float.floatToRawIntBits(ym1Var.j)) << 32));
        Object objP = kk0Var.P();
        if (zG || objP == Composer$Companion.getEmpty()) {
            ug1 ug1Var = new ug1();
            b(ug1Var, ym1Var.f);
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(wu0Var.w(ym1Var.b))) << 32) | (((long) Float.floatToRawIntBits(wu0Var.w(ym1Var.c))) & 4294967295L);
            long jC = c(ym1Var.d, ym1Var.e, jFloatToRawIntBits);
            rb4 rb4Var = new rb4(ug1Var);
            String str = ym1Var.a;
            long j = ym1Var.g;
            a(rb4Var, jFloatToRawIntBits, jC, str, j != 16 ? new jv(j, ym1Var.h) : null, ym1Var.i);
            kk0Var.l0(rb4Var);
            objP = rb4Var;
        }
        return (rb4) objP;
    }

    @cv0
    /* JADX INFO: renamed from: rememberVectorPainter-mlNsNFs, reason: not valid java name */
    public static final rb4 m1815x4e9584e5(float f, float f2, float f3, float f4, String str, long j, int i, pe1 pe1Var, ck0 ck0Var, int i2, int i3) {
        long j2;
        float f5 = (i3 & 4) != 0 ? Float.NaN : f3;
        float f6 = (i3 & 8) != 0 ? Float.NaN : f4;
        String str2 = (i3 & 16) != 0 ? "VectorRootGroup" : str;
        if ((i3 & 32) != 0) {
            int i4 = re0.j;
            j2 = re0.i;
        } else {
            j2 = j;
        }
        return m1816xeef57832(f, f2, f5, f6, str2, j2, (i3 & 64) != 0 ? 5 : i, false, pe1Var, ck0Var, (i2 & 14) | 12582912 | (i2 & 112) | (i2 & 896) | (i2 & 7168) | (57344 & i2) | (458752 & i2) | (3670016 & i2) | ((i2 << 3) & 234881024), 0);
    }

    /* JADX INFO: renamed from: rememberVectorPainter-vIP8VLU, reason: not valid java name */
    public static final rb4 m1816xeef57832(float f, float f2, float f3, float f4, String str, long j, int i, boolean z, pe1 pe1Var, ck0 ck0Var, int i2, int i3) {
        Object obj;
        float f5 = (i3 & 4) != 0 ? Float.NaN : f3;
        float f6 = (i3 & 8) == 0 ? f4 : Float.NaN;
        String str2 = (i3 & 16) != 0 ? "VectorRootGroup" : str;
        long j2 = (i3 & 32) != 0 ? re0.i : j;
        int i4 = (i3 & 64) != 0 ? 5 : i;
        boolean z2 = (i3 & Uuid.SIZE_BITS) != 0 ? false : z;
        kk0 kk0Var = (kk0) ck0Var;
        wu0 wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(wu0Var.w(f))) << 32) | (((long) Float.floatToRawIntBits(wu0Var.w(f2))) & 4294967295L);
        long jC = c(f5, f6, jFloatToRawIntBits);
        boolean z3 = z2;
        boolean z4 = ((((3670016 & i2) ^ 1572864) > 1048576 && kk0Var.f(i4)) || (i2 & 1572864) == 1048576) | ((((458752 & i2) ^ 196608) > 131072 && kk0Var.g(j2)) || (i2 & 196608) == 131072);
        Object objP = kk0Var.P();
        if (z4 || objP == Composer$Companion.getEmpty()) {
            objP = j2 != 16 ? new jv(j2, i4) : null;
            kk0Var.l0(objP);
        }
        te0 te0Var = (te0) objP;
        kk0Var.a0(-1837507429);
        Object objP2 = kk0Var.P();
        if (objP2 == Composer$Companion.getEmpty()) {
            objP2 = new rb4(new ug1());
            kk0Var.l0(objP2);
        }
        rb4 rb4Var = (rb4) objP2;
        a(rb4Var, jFloatToRawIntBits, jC, str2, te0Var, z3);
        qk0 qk0VarRememberCompositionContext = rj0.rememberCompositionContext(kk0Var, 0);
        boolean z5 = ((((i2 & 7168) ^ 3072) > 2048 && kk0Var.e(f6)) || (i2 & 3072) == 2048) | ((((i2 & 896) ^ 384) > 256 && kk0Var.e(f5)) || (i2 & 384) == 256) | ((((234881024 & i2) ^ 100663296) > 67108864 && kk0Var.h(pe1Var)) || (i2 & 100663296) == 67108864);
        Object objP3 = kk0Var.P();
        if (z5 || objP3 == Composer$Companion.getEmpty()) {
            obj = objP3;
            pk0 pk0Var = rb4Var.q;
            pk0 tk0Var = (pk0Var == null || pk0Var.isDisposed()) ? new tk0(qk0VarRememberCompositionContext, new db4(rb4Var.p.b)) : pk0Var;
            tk0Var.setContent(new yg0(2008312779, new tb4(pe1Var, jC), true));
            kk0Var.l0(tk0Var);
            obj = tk0Var;
        }
        obj = objP3;
        pk0 pk0Var2 = (pk0) obj;
        rb4Var.q = pk0Var2;
        boolean zJ = kk0Var.j(pk0Var2);
        Object objP4 = kk0Var.P();
        if (zJ || objP4 == Composer$Companion.getEmpty()) {
            objP4 = new pj2(25, pk0Var2);
            kk0Var.l0(objP4);
        }
        r11.DisposableEffect(rb4Var, (le1) objP4, kk0Var, 0);
        kk0Var.r(false);
        return rb4Var;
    }
}
