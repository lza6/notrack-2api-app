package defpackage;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okhttp3.Protocol$Companion;
import okio.Options$Companion;

/* JADX INFO: loaded from: classes.dex */
public final class ot3 extends of2 implements lx1, rz0, xe3 {
    public hg c;
    public uz3 d;
    public kb1 h;
    public le1 l;
    public int m;
    public boolean n;
    public int o;
    public int p;
    public List q;
    public le1 r;
    public sd3 s;
    public xe0 t;
    public le1 u;
    public Map v;
    public rg2 w;
    public nt3 x;
    public mt3 y;

    public ot3(hg hgVar, uz3 uz3Var, kb1 kb1Var, le1 le1Var, int i, boolean z, int i2, int i3, List list, le1 le1Var2, sd3 sd3Var, xe0 xe0Var, le1 le1Var3) {
        this.c = hgVar;
        this.d = uz3Var;
        this.h = kb1Var;
        this.l = le1Var;
        this.m = i;
        this.n = z;
        this.o = i2;
        this.p = i3;
        this.q = list;
        this.r = le1Var2;
        this.s = sd3Var;
        this.t = xe0Var;
        this.u = le1Var3;
    }

    public static final void v0(ot3 ot3Var) {
        y64.M(ot3Var).D();
        y64.M(ot3Var).C();
        kr1.O(ot3Var);
    }

    public final boolean A0(uz3 uz3Var, List list, int i, int i2, boolean z, kb1 kb1Var, int i3) {
        boolean z2 = !this.d.c(uz3Var);
        this.d = uz3Var;
        if (!kr1.n(this.q, list)) {
            this.q = list;
            z2 = true;
        }
        if (this.p != i) {
            this.p = i;
            z2 = true;
        }
        if (this.o != i2) {
            this.o = i2;
            z2 = true;
        }
        if (this.n != z) {
            this.n = z;
            z2 = true;
        }
        if (!kr1.n(this.h, kb1Var)) {
            this.h = kb1Var;
            z2 = true;
        }
        if (this.m == i3) {
            return z2;
        }
        this.m = i3;
        return true;
    }

    public final boolean B0(hg hgVar) {
        boolean zN = kr1.n(this.c.d, hgVar.d);
        boolean z = (zN && kr1.n(this.c.c, hgVar.c)) ? false : true;
        if (z) {
            this.c = hgVar;
        }
        if (!zN) {
            this.y = null;
        }
        return z;
    }

    /* JADX WARN: Failed to calculate best type for var: r6v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v10 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v10 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v11 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v11 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r8v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v1 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v10 ??, new type: long
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    @Override // defpackage.rz0
    public final void L(defpackage.wx1 r27) {
        /*
            Method dump skipped, instruction units count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ot3.L(wx1):void");
    }

    @Override // defpackage.lx1
    public final int P(m82 m82Var, qb2 qb2Var, int i) {
        return g13.q(y0(m82Var).d(m82Var.getLayoutDirection()).a());
    }

    @Override // defpackage.xe3
    public final void applySemantics(gf3 gf3Var) {
        nt3 nt3Var = this.x;
        if (nt3Var == null) {
            nt3Var = new nt3(this, 0);
            this.x = nt3Var;
        }
        hg hgVar = this.c;
        pu1[] pu1VarArr = ef3.a;
        ue3 ue3Var = (ue3) gf3Var;
        ue3Var.j(cf3.z, kr1.T(hgVar));
        mt3 mt3Var = this.y;
        if (mt3Var != null) {
            hg hgVar2 = mt3Var.b;
            ff3 ff3Var = cf3.A;
            pu1[] pu1VarArr2 = ef3.a;
            pu1 pu1Var = pu1VarArr2[14];
            ff3Var.a(gf3Var, hgVar2);
            boolean z = mt3Var.c;
            ff3 ff3Var2 = cf3.B;
            pu1 pu1Var2 = pu1VarArr2[15];
            ff3Var2.a(gf3Var, Boolean.valueOf(z));
        }
        ue3Var.j(te3.k, new z0(null, new nt3(this, 1)));
        ue3Var.j(te3.l, new z0(null, new nt3(this, 2)));
        ue3Var.j(te3.m, new z0(null, new i43(11, this)));
        ef3.d(gf3Var, nt3Var);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x008a  */
    @Override // defpackage.lx1
    public final wb2 d(xb2 xb2Var, qb2 qb2Var, long j) {
        boolean z;
        rg2 rg2VarY0 = y0(xb2Var);
        dx1 layoutDirection = xb2Var.getLayoutDirection();
        if (rg2VarY0.f > 1) {
            he2 he2Var = rg2VarY0.h;
            uz3 uz3Var = rg2VarY0.k;
            wu0 wu0Var = rg2VarY0.j;
            wu0Var.getClass();
            he2 he2VarFrom = Options$Companion.from(he2Var, layoutDirection, uz3Var, wu0Var, rg2VarY0.b);
            rg2VarY0.h = he2VarFrom;
            j = he2VarFrom.a(j, rg2VarY0.f);
        }
        xy3 xy3Var = rg2VarY0.n;
        if (xy3Var == null) {
            rg2VarY0.n = rg2VarY0.e(layoutDirection, j, rg2VarY0.b(j, layoutDirection));
            z = true;
        } else {
            pg2 pg2Var = xy3Var.b;
            wy3 wy3Var = xy3Var.a;
            if (pg2Var.a.b()) {
                rg2VarY0.n = rg2VarY0.e(layoutDirection, j, rg2VarY0.b(j, layoutDirection));
                z = true;
            } else {
                dx1 dx1Var = wy3Var.h;
                long j2 = wy3Var.j;
                if (layoutDirection == dx1Var && (um0.b(j, j2) || (um0.h(j) == um0.h(j2) && um0.j(j) == um0.j(j2) && um0.g(j) >= pg2Var.e && !pg2Var.c))) {
                    xy3 xy3Var2 = rg2VarY0.n;
                    xy3Var2.getClass();
                    if (um0.b(j, xy3Var2.a.j)) {
                        z = false;
                    } else {
                        xy3 xy3Var3 = rg2VarY0.n;
                        xy3Var3.getClass();
                        rg2VarY0.n = rg2VarY0.e(layoutDirection, j, xy3Var3.b);
                    }
                } else {
                    rg2VarY0.n = rg2VarY0.e(layoutDirection, j, rg2VarY0.b(j, layoutDirection));
                }
                z = true;
            }
        }
        xy3 xy3Var4 = rg2VarY0.n;
        if (xy3Var4 == null) {
            u41.r("You must call layoutWithConstraints first");
            return null;
        }
        long j3 = xy3Var4.c;
        xy3Var4.b.a.b();
        if (z) {
            y64.K(this, 2).W0();
            le1 le1Var = this.l;
            if (le1Var != null) {
                le1Var.invoke(xy3Var4);
            }
            sd3 sd3Var = this.s;
            if (sd3Var != null) {
                xy3 xy3Var5 = (xy3) sd3Var.l.d;
                if (xy3Var5 != null && !kr1.n(xy3Var5.a.a, xy3Var4.a.a)) {
                    qe3 qe3Var = sd3Var.d;
                    long j4 = sd3Var.c;
                    od3 od3Var = qe3Var.i;
                    if (od3Var != null) {
                        od3Var.invoke(Long.valueOf(j4));
                    }
                }
                sd3Var.l = fp1.d(sd3Var.l, null, xy3Var4, 1);
            }
            Map linkedHashMap = this.v;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap(2);
            }
            linkedHashMap.put(d8.a, Integer.valueOf(Math.round(xy3Var4.d)));
            linkedHashMap.put(d8.b, Integer.valueOf(Math.round(xy3Var4.e)));
            this.v = linkedHashMap;
        }
        le1 le1Var2 = this.r;
        if (le1Var2 != null) {
            le1Var2.invoke(xy3Var4.f);
        }
        int i = (int) (j3 >> 32);
        int i2 = (int) (j3 & 4294967295L);
        nv2 nv2VarC = qb2Var.c(Protocol$Companion.m1784x4c29bdda(i, i, i2, i2));
        Map map = this.v;
        map.getClass();
        return xb2Var.s(i, i2, map, new xc(nv2VarC, 14));
    }

    @Override // defpackage.lx1
    public final int e(m82 m82Var, qb2 qb2Var, int i) {
        return g13.q(y0(m82Var).d(m82Var.getLayoutDirection()).c());
    }

    @Override // defpackage.of2
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // defpackage.lx1
    public final int m(m82 m82Var, qb2 qb2Var, int i) {
        return y0(m82Var).a(i, m82Var.getLayoutDirection());
    }

    public final void w0(boolean z, boolean z2, boolean z3, boolean z4) {
        if (z2 || z3 || z4) {
            x0().f(this.c, this.d, this.h, this.m, this.n, this.o, this.p, this.q);
        }
        if (isAttached()) {
            if (z2 || (z && this.x != null)) {
                y64.M(this).D();
            }
            if (z2 || z3 || z4) {
                y64.M(this).C();
                kr1.O(this);
            }
            if (z) {
                kr1.O(this);
            }
        }
    }

    public final rg2 x0() {
        if (this.w == null) {
            this.w = new rg2(this.c, this.d, this.h, this.m, this.n, this.o, this.p, this.q);
        }
        rg2 rg2Var = this.w;
        rg2Var.getClass();
        return rg2Var;
    }

    public final rg2 y0(wu0 wu0Var) {
        rg2 rg2Var;
        mt3 mt3Var = this.y;
        if (mt3Var != null && mt3Var.c && (rg2Var = mt3Var.d) != null) {
            rg2Var.c(wu0Var);
            return rg2Var;
        }
        rg2 rg2VarX0 = x0();
        rg2VarX0.c(wu0Var);
        return rg2VarX0;
    }

    @Override // defpackage.lx1
    public final int z(m82 m82Var, qb2 qb2Var, int i) {
        return y0(m82Var).a(i, m82Var.getLayoutDirection());
    }

    public final boolean z0(le1 le1Var, le1 le1Var2, sd3 sd3Var, le1 le1Var3) {
        boolean z;
        if (this.l != le1Var) {
            this.l = le1Var;
            z = true;
        } else {
            z = false;
        }
        if (this.r != le1Var2) {
            this.r = le1Var2;
            z = true;
        }
        if (!kr1.n(this.s, sd3Var)) {
            this.s = sd3Var;
            z = true;
        }
        if (this.u == le1Var3) {
            return z;
        }
        this.u = le1Var3;
        return true;
    }
}
