package defpackage;

import androidx.compose.foundation.layout.c;
import androidx.compose.ui.platform.SemanticsNodeCopy;

/* JADX INFO: loaded from: classes.dex */
public final class da extends ww1 implements ne1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ da(Object obj, int i, Object obj2) {
        super(2);
        this.c = i;
        this.d = obj;
        this.h = obj2;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.c;
        w84 w84Var = w84.a;
        Object obj3 = this.h;
        Object obj4 = this.d;
        switch (i) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                ze3 ze3Var = (ze3) obj2;
                fa faVar = (fa) obj3;
                if (!((SemanticsNodeCopy) obj4).getChildren().b(ze3Var.g)) {
                    faVar.h(ze3Var, iIntValue);
                    faVar.p.i(w84Var);
                }
                return w84Var;
            case 1:
                jp3 jp3Var = (jp3) obj;
                long j = ((um0) obj2).a;
                return ((vb2) obj4).c(jp3Var, jp3Var.b0(w84Var, new yg0(-1945019079, new ax((oe1) obj3, new c(jp3Var, j)), true)), j);
            case 2:
                long j2 = ((ln2) obj2).a;
                yo4.g((q33) obj4, (dx2) obj);
                jy jyVar = ((bz0) obj3).o;
                if (jyVar != null) {
                    jyVar.i(new cy0(j2));
                }
                return w84Var;
            case 3:
                wu0 wu0Var = (wu0) obj;
                long j3 = ((um0) obj2).a;
                if (um0.h(j3) == Integer.MAX_VALUE) {
                    so1.a("LazyVerticalGrid's width should be bound by parent.");
                }
                int iH = um0.h(j3);
                el elVar = (el) obj3;
                int[] iArrN0 = ke0.N0(((qg1) ((rg1) obj4)).a(iH, wu0Var.O(elVar.a())));
                int[] iArr = new int[iArrN0.length];
                elVar.h(wu0Var, iH, iArrN0, dx1.c, iArr);
                return new oz1(iArrN0, iArr);
            case 4:
                wu0 wu0Var2 = (wu0) obj;
                long j4 = ((um0) obj2).a;
                if (um0.g(j4) == Integer.MAX_VALUE) {
                    so1.a("LazyHorizontalGrid's height should be bound by parent.");
                }
                int iG = um0.g(j4);
                gl glVar = (gl) obj3;
                int[] iArrN1 = ke0.N0(((qg1) ((rg1) obj4)).a(iG, wu0Var2.O(glVar.a())));
                int[] iArr2 = new int[iArrN1.length];
                glVar.k(wu0Var2, iG, iArrN1, iArr2);
                return new oz1(iArrN1, iArr2);
            case 5:
                return (wb2) ((ne1) obj3).invoke(new s02((n02) obj4, (jp3) obj), new um0(((um0) obj2).a));
            default:
                y00 y00Var = (y00) obj;
                gg1 gg1Var = (gg1) obj2;
                wl2 wl2Var = (wl2) obj4;
                ux1 ux1Var = wl2Var.t;
                if (ux1Var.G()) {
                    wl2Var.J = y00Var;
                    wl2Var.I = gg1Var;
                    as2 snapshotObserver = xx1.a(ux1Var).getSnapshotObserver();
                    n63 n63Var = wl2.O;
                    snapshotObserver.a(wl2Var, fl1.K, (tl2) obj3);
                    wl2Var.M = false;
                } else {
                    wl2Var.M = true;
                }
                return w84Var;
        }
    }
}
