package defpackage;

import java.util.List;
import kotlin.jvm.internal.IntCompanionObject;
import okhttp3.Protocol$Companion;

/* JADX INFO: loaded from: classes.dex */
public final class dp0 implements vb2 {
    public final /* synthetic */ z22 a;
    public final /* synthetic */ le1 b;
    public final /* synthetic */ ey3 c;
    public final /* synthetic */ nn2 d;
    public final /* synthetic */ wu0 e;
    public final /* synthetic */ int f;

    public dp0(z22 z22Var, le1 le1Var, ey3 ey3Var, nn2 nn2Var, wu0 wu0Var, int i) {
        this.a = z22Var;
        this.b = le1Var;
        this.c = ey3Var;
        this.d = nn2Var;
        this.e = wu0Var;
        this.f = i;
    }

    @Override // defpackage.vb2
    public final int b(er1 er1Var, List list, int i) {
        z22 z22Var = this.a;
        z22Var.a.d(er1Var.getLayoutDirection());
        vu vuVar = (vu) z22Var.a.g;
        if (vuVar != null) {
            return g13.q(vuVar.c());
        }
        u41.r("layoutIntrinsics must be called first");
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:65:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:67:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:68:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:70:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:73:0x0200  */
    /* JADX WARN: Code duplicated, block: B:74:0x020b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3, types: [cx1] */
    @Override // defpackage.vb2
    public final wb2 c(xb2 xb2Var, List list, long j) {
        xy3 xy3Var;
        wb2 wb2Var;
        xy3 xy3Var2;
        xy3 xy3Var3;
        dp0 dp0Var;
        z22 z22Var;
        int i;
        int iQ;
        ?? r14;
        z22 z22Var2 = this.a;
        pk3 currentThreadSnapshot = Protocol$Companion.getCurrentThreadSnapshot();
        le1 le1VarE = currentThreadSnapshot != null ? currentThreadSnapshot.e() : null;
        pk3 pk3VarMakeCurrentNonObservable = Protocol$Companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            yy3 yy3VarD = z22Var2.d();
            Protocol$Companion.restoreNonObservable(currentThreadSnapshot, pk3VarMakeCurrentNonObservable, le1VarE);
            xy3 xy3Var4 = yy3VarD != null ? yy3VarD.a : null;
            lv0 lv0Var = z22Var2.a;
            dx1 layoutDirection = xb2Var.getLayoutDirection();
            boolean z = lv0Var.a;
            int iX = IntCompanionObject.MAX_VALUE;
            if (xy3Var4 != null) {
                pg2 pg2Var = xy3Var4.b;
                wy3 wy3Var = xy3Var4.a;
                hg hgVar = (hg) lv0Var.b;
                uz3 uz3Var = (uz3) lv0Var.c;
                List list2 = (List) lv0Var.f;
                wu0 wu0Var = (wu0) lv0Var.d;
                wb2Var = null;
                kb1 kb1Var = (kb1) lv0Var.e;
                if (!pg2Var.a.b()) {
                    hg hgVar2 = wy3Var.a;
                    xy3 xy3Var5 = xy3Var4;
                    long j2 = wy3Var.j;
                    if (kr1.n(hgVar2, hgVar) && wy3Var.b.c(uz3Var) && kr1.n(wy3Var.c, list2) && wy3Var.d == Integer.MAX_VALUE && wy3Var.e == z && wy3Var.f == 1 && kr1.n(wy3Var.g, wu0Var) && wy3Var.h == layoutDirection && kr1.n(wy3Var.i, kb1Var) && um0.j(j) == um0.j(j2) && (!z || (um0.h(j) == um0.h(j2) && um0.g(j) == um0.g(j2)))) {
                        xy3Var3 = new xy3(new wy3(wy3Var.a, (uz3) lv0Var.c, wy3Var.c, wy3Var.d, wy3Var.e, wy3Var.f, wy3Var.g, wy3Var.h, wy3Var.i, j), pg2Var, wm0.d(j, (((long) g13.q(pg2Var.e)) & 4294967295L) | (((long) g13.q(pg2Var.d)) << 32)));
                        xy3Var2 = xy3Var5;
                    } else {
                        xy3Var = xy3Var5;
                    }
                    long j3 = xy3Var3.c;
                    Integer numValueOf = Integer.valueOf((int) (j3 >> 32));
                    Integer numValueOf2 = Integer.valueOf((int) (j3 & 4294967295L));
                    int iIntValue = numValueOf.intValue();
                    int iIntValue2 = numValueOf2.intValue();
                    if (kr1.n(xy3Var2, xy3Var3)) {
                        dp0Var = this;
                        z22Var = z22Var2;
                        i = 0;
                    } else {
                        if (yy3VarD != 0) {
                            r14 = yy3VarD.c;
                        } else {
                            r14 = wb2Var;
                        }
                        z22Var = z22Var2;
                        z22Var.i.setValue(new yy3(xy3Var3, r14));
                        i = 0;
                        z22Var.p = false;
                        dp0Var = this;
                        dp0Var.b.invoke(xy3Var3);
                        qp0.e(z22Var, dp0Var.c, dp0Var.d);
                    }
                    if (dp0Var.f == 1) {
                        iQ = g13.q(xy3Var3.b.b(i));
                    } else {
                        iQ = i;
                    }
                    z22Var.g.setValue(new rx0(dp0Var.e.q0(iQ)));
                    return xb2Var.s(iIntValue, iIntValue2, y92.T(new ps2(d8.a, Integer.valueOf(Math.round(xy3Var3.d))), new ps2(d8.b, Integer.valueOf(Math.round(xy3Var3.e)))), sx.r);
                }
                xy3Var = xy3Var4;
            } else {
                xy3Var = xy3Var4;
                wb2Var = null;
            }
            lv0Var.d(layoutDirection);
            int iJ = um0.j(j);
            if (z && um0.d(j)) {
                iX = um0.h(j);
            }
            if (iJ != iX) {
                vu vuVar = (vu) lv0Var.g;
                if (vuVar == null) {
                    u41.r("layoutIntrinsics must be called first");
                    return wb2Var;
                }
                iX = py.x(g13.q(vuVar.c()), iJ, iX);
            }
            vu vuVar2 = (vu) lv0Var.g;
            if (vuVar2 == null) {
                u41.r("layoutIntrinsics must be called first");
                return wb2Var;
            }
            pg2 pg2Var2 = new pg2(vuVar2, Protocol$Companion.m1784x4c29bdda(0, iX, 0, um0.g(j)), IntCompanionObject.MAX_VALUE, 1);
            xy3Var2 = xy3Var;
            xy3Var3 = new xy3(new wy3((hg) lv0Var.b, (uz3) lv0Var.c, (List) lv0Var.f, IntCompanionObject.MAX_VALUE, lv0Var.a, 1, (wu0) lv0Var.d, layoutDirection, (kb1) lv0Var.e, j), pg2Var2, wm0.d(j, (((long) g13.q(pg2Var2.d)) << 32) | (((long) g13.q(pg2Var2.e)) & 4294967295L)));
            long j4 = xy3Var3.c;
            Integer numValueOf3 = Integer.valueOf((int) (j4 >> 32));
            Integer numValueOf4 = Integer.valueOf((int) (j4 & 4294967295L));
            int iIntValue3 = numValueOf3.intValue();
            int iIntValue4 = numValueOf4.intValue();
            if (kr1.n(xy3Var2, xy3Var3)) {
                if (yy3VarD != 0) {
                    r14 = yy3VarD.c;
                } else {
                    r14 = wb2Var;
                }
                z22Var = z22Var2;
                z22Var.i.setValue(new yy3(xy3Var3, r14));
                i = 0;
                z22Var.p = false;
                dp0Var = this;
                dp0Var.b.invoke(xy3Var3);
                qp0.e(z22Var, dp0Var.c, dp0Var.d);
            } else {
                dp0Var = this;
                z22Var = z22Var2;
                i = 0;
            }
            if (dp0Var.f == 1) {
                iQ = g13.q(xy3Var3.b.b(i));
            } else {
                iQ = i;
            }
            z22Var.g.setValue(new rx0(dp0Var.e.q0(iQ)));
            return xb2Var.s(iIntValue3, iIntValue4, y92.T(new ps2(d8.a, Integer.valueOf(Math.round(xy3Var3.d))), new ps2(d8.b, Integer.valueOf(Math.round(xy3Var3.e)))), sx.r);
        } catch (Throwable th) {
            Protocol$Companion.restoreNonObservable(currentThreadSnapshot, pk3VarMakeCurrentNonObservable, le1VarE);
            throw th;
        }
    }
}
