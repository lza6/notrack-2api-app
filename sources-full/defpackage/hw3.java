package defpackage;

import androidx.compose.ui.Alignment$Companion;

/* JADX INFO: loaded from: classes.dex */
public final class hw3 extends ww1 implements le1 {
    public final /* synthetic */ nv2 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int h;
    public final /* synthetic */ nv2 l;
    public final /* synthetic */ nv2 m;
    public final /* synthetic */ nv2 n;
    public final /* synthetic */ nv2 o;
    public final /* synthetic */ nv2 p;
    public final /* synthetic */ nv2 q;
    public final /* synthetic */ nv2 r;
    public final /* synthetic */ nv2 s;
    public final /* synthetic */ iw3 t;
    public final /* synthetic */ int u;
    public final /* synthetic */ xb2 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hw3(nv2 nv2Var, int i, int i2, nv2 nv2Var2, nv2 nv2Var3, nv2 nv2Var4, nv2 nv2Var5, nv2 nv2Var6, nv2 nv2Var7, nv2 nv2Var8, nv2 nv2Var9, iw3 iw3Var, int i3, xb2 xb2Var) {
        super(1);
        this.c = nv2Var;
        this.d = i;
        this.h = i2;
        this.l = nv2Var2;
        this.m = nv2Var3;
        this.n = nv2Var4;
        this.o = nv2Var5;
        this.p = nv2Var6;
        this.q = nv2Var7;
        this.r = nv2Var8;
        this.s = nv2Var9;
        this.t = iw3Var;
        this.u = i3;
        this.v = xb2Var;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        boolean z;
        mv2 mv2Var = (mv2) obj;
        iw3 iw3Var = this.t;
        boolean z2 = iw3Var.a;
        xb2 xb2Var = this.v;
        nv2 nv2Var = this.s;
        nv2 nv2Var2 = this.q;
        nv2 nv2Var3 = this.p;
        nv2 nv2Var4 = this.o;
        nv2 nv2Var5 = this.n;
        nv2 nv2Var6 = this.m;
        int i = this.h;
        nv2 nv2Var7 = this.c;
        int i2 = this.d;
        nv2 nv2Var8 = this.l;
        nv2 nv2Var9 = this.r;
        if (nv2Var7 != null) {
            int i3 = nv2Var7.d;
            int i4 = this.u;
            int i5 = i3 + i4;
            float f = iw3Var.b;
            float density = xb2Var.getDensity();
            mv2.e(mv2Var, nv2Var9, 0L);
            float f2 = ov3.b;
            int i6 = i - (nv2Var != null ? nv2Var.d : 0);
            if (nv2Var5 != null) {
                mv2.f(mv2Var, nv2Var5, 0, Alignment$Companion.getCenterVertically().a(nv2Var5.d, i6));
            }
            int iA = z2 ? Alignment$Companion.getCenterVertically().a(nv2Var7.d, i6) : gb2.R(ov3.b * density);
            mv2.f(mv2Var, nv2Var7, nv2Var5 != null ? nv2Var5.c : 0, iA - gb2.R((iA - i4) * f));
            if (nv2Var3 != null) {
                mv2.f(mv2Var, nv2Var3, nv2Var5 != null ? nv2Var5.c : 0, i5);
            }
            int i7 = (nv2Var5 != null ? nv2Var5.c : 0) + (nv2Var3 != null ? nv2Var3.c : 0);
            mv2.f(mv2Var, nv2Var8, i7, i5);
            if (nv2Var6 != null) {
                mv2.f(mv2Var, nv2Var6, i7, i5);
            }
            if (nv2Var2 != null) {
                mv2.f(mv2Var, nv2Var2, (i2 - (nv2Var4 != null ? nv2Var4.c : 0)) - nv2Var2.c, i5);
            }
            if (nv2Var4 != null) {
                mv2.f(mv2Var, nv2Var4, i2 - nv2Var4.c, Alignment$Companion.getCenterVertically().a(nv2Var4.d, i6));
            }
            if (nv2Var != null) {
                mv2.f(mv2Var, nv2Var, 0, i6);
            }
        } else {
            float density2 = xb2Var.getDensity();
            hs2 hs2Var = iw3Var.c;
            mv2.e(mv2Var, nv2Var9, 0L);
            float f3 = ov3.b;
            int i8 = i - (nv2Var != null ? nv2Var.d : 0);
            int iR = gb2.R(hs2Var.d() * density2);
            if (nv2Var5 != null) {
                mv2.f(mv2Var, nv2Var5, 0, Alignment$Companion.getCenterVertically().a(nv2Var5.d, i8));
            }
            if (nv2Var3 != null) {
                z = z2;
                mv2.f(mv2Var, nv2Var3, nv2Var5 != null ? nv2Var5.c : 0, xv3.b(z, i8, iR, nv2Var3));
            } else {
                z = z2;
            }
            int i9 = (nv2Var5 != null ? nv2Var5.c : 0) + (nv2Var3 != null ? nv2Var3.c : 0);
            mv2.f(mv2Var, nv2Var8, i9, xv3.b(z, i8, iR, nv2Var8));
            if (nv2Var6 != null) {
                mv2.f(mv2Var, nv2Var6, i9, xv3.b(z, i8, iR, nv2Var6));
            }
            if (nv2Var2 != null) {
                mv2.f(mv2Var, nv2Var2, (i2 - (nv2Var4 != null ? nv2Var4.c : 0)) - nv2Var2.c, xv3.b(z, i8, iR, nv2Var2));
            }
            if (nv2Var4 != null) {
                mv2.f(mv2Var, nv2Var4, i2 - nv2Var4.c, Alignment$Companion.getCenterVertically().a(nv2Var4.d, i8));
            }
            if (nv2Var != null) {
                mv2.f(mv2Var, nv2Var, 0, i8);
            }
        }
        return w84.a;
    }
}
