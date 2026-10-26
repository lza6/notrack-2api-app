package defpackage;

import androidx.compose.ui.Alignment$Companion;

/* JADX INFO: loaded from: classes.dex */
public final class r52 extends ww1 implements le1 {
    public final /* synthetic */ nv2 c;
    public final /* synthetic */ nv2 d;
    public final /* synthetic */ int h;
    public final /* synthetic */ boolean l;
    public final /* synthetic */ int m;
    public final /* synthetic */ nv2 n;
    public final /* synthetic */ nv2 o;
    public final /* synthetic */ nv2 p;
    public final /* synthetic */ int q;
    public final /* synthetic */ int r;
    public final /* synthetic */ int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r52(nv2 nv2Var, nv2 nv2Var2, int i, boolean z, int i2, nv2 nv2Var3, nv2 nv2Var4, nv2 nv2Var5, int i3, int i4, int i5) {
        super(1);
        this.c = nv2Var;
        this.d = nv2Var2;
        this.h = i;
        this.l = z;
        this.m = i2;
        this.n = nv2Var3;
        this.o = nv2Var4;
        this.p = nv2Var5;
        this.q = i3;
        this.r = i4;
        this.s = i5;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        mv2 mv2Var = (mv2) obj;
        int i = this.h;
        int i2 = this.q;
        int iA = this.m;
        boolean z = this.l;
        nv2 nv2Var = this.c;
        if (nv2Var != null) {
            mv2.f(mv2Var, nv2Var, i, z ? iA : Alignment$Companion.getCenterVertically().a(nv2Var.d, i2));
        }
        nv2 nv2Var2 = this.d;
        if (nv2Var2 != null) {
            mv2.f(mv2Var, nv2Var2, (this.r - this.s) - nv2Var2.c, z ? iA : Alignment$Companion.getCenterVertically().a(nv2Var2.d, i2));
        }
        float f = ov3.b;
        int i3 = i + (nv2Var != null ? nv2Var.c : 0);
        nv2 nv2Var3 = this.p;
        nv2 nv2Var4 = this.o;
        nv2 nv2Var5 = this.n;
        if (!z) {
            iA = Alignment$Companion.getCenterVertically().a((nv2Var5 != null ? nv2Var5.d : 0) + (nv2Var4 != null ? nv2Var4.d : 0) + (nv2Var3 != null ? nv2Var3.d : 0), i2);
        }
        if (nv2Var4 != null) {
            mv2.f(mv2Var, nv2Var4, i3, iA);
        }
        int i4 = iA + (nv2Var4 != null ? nv2Var4.d : 0);
        if (nv2Var5 != null) {
            mv2.f(mv2Var, nv2Var5, i3, i4);
        }
        int i5 = i4 + (nv2Var5 != null ? nv2Var5.d : 0);
        if (nv2Var3 != null) {
            mv2.f(mv2Var, nv2Var3, i3, i5);
        }
        return w84.a;
    }
}
