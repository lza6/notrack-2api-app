package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class ee extends be0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ ViewGroup l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ee(ViewGroup viewGroup, int i) {
        super(1);
        this.h = i;
        this.l = viewGroup;
    }

    @Override // defpackage.be0
    public final wg4 m(wg4 wg4Var) {
        int i = this.h;
        ViewGroup viewGroup = this.l;
        switch (i) {
            case 0:
                return ((bd4) viewGroup).n(wg4Var);
            default:
                tv0 tv0Var = (tv0) viewGroup;
                if (tv0Var.l) {
                    return wg4Var;
                }
                View childAt = tv0Var.getChildAt(0);
                int iMax = Math.max(0, childAt.getLeft());
                int iMax2 = Math.max(0, childAt.getTop());
                int iMax3 = Math.max(0, tv0Var.getWidth() - childAt.getRight());
                int iMax4 = Math.max(0, tv0Var.getHeight() - childAt.getBottom());
                return (iMax == 0 && iMax2 == 0 && iMax3 == 0 && iMax4 == 0) ? wg4Var : wg4Var.a.n(iMax, iMax2, iMax3, iMax4);
        }
    }

    @Override // defpackage.be0
    public final mi4 n(mi4 mi4Var) {
        int i = this.h;
        ViewGroup viewGroup = this.l;
        switch (i) {
            case 0:
                xo1 xo1Var = (xo1) ((bd4) viewGroup).G.N.c;
                if (!xo1Var.z()) {
                    return mi4Var;
                }
                long jM = g13.M(xo1Var.L(0L));
                int i2 = (int) (jM >> 32);
                if (i2 < 0) {
                    i2 = 0;
                }
                int i3 = (int) (jM & 4294967295L);
                if (i3 < 0) {
                    i3 = 0;
                }
                long J = y64.u(xo1Var).J();
                int i4 = (int) (J >> 32);
                int i5 = (int) (J & 4294967295L);
                long j = xo1Var.h;
                long jM2 = g13.M(xo1Var.L((((long) Float.floatToRawIntBits((int) (j >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L)));
                int i6 = i4 - ((int) (jM2 >> 32));
                if (i6 < 0) {
                    i6 = 0;
                }
                int i7 = i5 - ((int) (4294967295L & jM2));
                int i8 = i7 >= 0 ? i7 : 0;
                return (i2 == 0 && i3 == 0 && i6 == 0 && i8 == 0) ? mi4Var : new mi4(me.m((pp1) mi4Var.d, i2, i3, i6, i8), 11, me.m((pp1) mi4Var.h, i2, i3, i6, i8));
            default:
                tv0 tv0Var = (tv0) viewGroup;
                if (tv0Var.l) {
                    return mi4Var;
                }
                View childAt = tv0Var.getChildAt(0);
                int iMax = Math.max(0, childAt.getLeft());
                int iMax2 = Math.max(0, childAt.getTop());
                int iMax3 = Math.max(0, tv0Var.getWidth() - childAt.getRight());
                int iMax4 = Math.max(0, tv0Var.getHeight() - childAt.getBottom());
                if (iMax == 0 && iMax2 == 0 && iMax3 == 0 && iMax4 == 0) {
                    return mi4Var;
                }
                pp1 pp1VarB = pp1.b(iMax, iMax2, iMax3, iMax4);
                int i9 = pp1VarB.a;
                pp1 pp1Var = (pp1) mi4Var.d;
                int i10 = pp1VarB.b;
                int i11 = pp1VarB.c;
                int i12 = pp1VarB.d;
                return new mi4(wg4.a(pp1Var, i9, i10, i11, i12), 11, wg4.a((pp1) mi4Var.h, i9, i10, i11, i12));
        }
    }
}
