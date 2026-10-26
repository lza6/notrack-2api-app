package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ey1 extends rx1 {
    public final /* synthetic */ iy1 b;
    public final /* synthetic */ ne1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ey1(iy1 iy1Var, ne1 ne1Var, String str) {
        super(str);
        this.b = iy1Var;
        this.c = ne1Var;
    }

    @Override // defpackage.vb2
    public final wb2 c(xb2 xb2Var, List list, long j) {
        iy1 iy1Var = this.b;
        cy1 cy1Var = iy1Var.p;
        cy1Var.c = xb2Var.getLayoutDirection();
        cy1Var.d = xb2Var.getDensity();
        cy1Var.h = xb2Var.l();
        boolean zR = xb2Var.r();
        ne1 ne1Var = this.c;
        if (zR || iy1Var.c.p == null) {
            iy1Var.l = 0;
            wb2 wb2Var = (wb2) ne1Var.invoke(cy1Var, new um0(j));
            return new dy1(wb2Var, iy1Var, iy1Var.l, wb2Var, 1);
        }
        iy1Var.m = 0;
        wb2 wb2Var2 = (wb2) ne1Var.invoke(iy1Var.q, new um0(j));
        return new dy1(wb2Var2, iy1Var, iy1Var.m, wb2Var2, 0);
    }
}
