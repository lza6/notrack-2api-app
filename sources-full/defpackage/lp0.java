package defpackage;

import androidx.compose.ui.platform.SoftwareKeyboardController;

/* JADX INFO: loaded from: classes.dex */
public final class lp0 extends ww1 implements le1 {
    public final /* synthetic */ z22 c;
    public final /* synthetic */ za1 d;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ boolean l;
    public final /* synthetic */ xw3 m;
    public final /* synthetic */ nn2 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lp0(z22 z22Var, za1 za1Var, boolean z, boolean z2, xw3 xw3Var, nn2 nn2Var) {
        super(1);
        this.c = z22Var;
        this.d = za1Var;
        this.h = z;
        this.l = z2;
        this.m = xw3Var;
        this.n = nn2Var;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        SoftwareKeyboardController softwareKeyboardController;
        long j = ((ln2) obj).a;
        z22 z22Var = this.c;
        if (!z22Var.b()) {
            za1.b(this.d);
        } else if (!this.h && (softwareKeyboardController = z22Var.c) != null) {
            softwareKeyboardController.show();
        }
        if (z22Var.b() && this.l) {
            if (z22Var.a() != ch1.d) {
                yy3 yy3VarD = z22Var.d();
                if (yy3VarD != null) {
                    fp1 fp1Var = z22Var.d;
                    ip0 ip0Var = z22Var.v;
                    int iN = this.n.n(yy3VarD.b(j, true));
                    ip0Var.invoke(ey3.a((ey3) fp1Var.c, null, p23.d(iN, iN), 5));
                    if (((hg) z22Var.a.b).d.length() > 0) {
                        z22Var.k.setValue(ch1.h);
                    }
                }
            } else {
                this.m.e(new ln2(j));
            }
        }
        return w84.a;
    }
}
