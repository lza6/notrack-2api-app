package defpackage;

import androidx.compose.foundation.layout.a;
import androidx.compose.ui.Alignment$Companion;

/* JADX INFO: loaded from: classes.dex */
public final class jr2 extends ww1 implements le1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ nv2 h;
    public final /* synthetic */ nv2 l;
    public final /* synthetic */ nv2 m;
    public final /* synthetic */ nv2 n;
    public final /* synthetic */ nv2 o;
    public final /* synthetic */ nv2 p;
    public final /* synthetic */ nv2 q;
    public final /* synthetic */ nv2 r;
    public final /* synthetic */ nv2 s;
    public final /* synthetic */ kr2 t;
    public final /* synthetic */ xb2 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jr2(int i, int i2, nv2 nv2Var, nv2 nv2Var2, nv2 nv2Var3, nv2 nv2Var4, nv2 nv2Var5, nv2 nv2Var6, nv2 nv2Var7, nv2 nv2Var8, nv2 nv2Var9, kr2 kr2Var, xb2 xb2Var) {
        super(1);
        this.c = i;
        this.d = i2;
        this.h = nv2Var;
        this.l = nv2Var2;
        this.m = nv2Var3;
        this.n = nv2Var4;
        this.o = nv2Var5;
        this.p = nv2Var6;
        this.q = nv2Var7;
        this.r = nv2Var8;
        this.s = nv2Var9;
        this.t = kr2Var;
        this.u = xb2Var;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        float f;
        mv2 mv2Var = (mv2) obj;
        kr2 kr2Var = this.t;
        float f2 = kr2Var.c;
        boolean z = kr2Var.b;
        xb2 xb2Var = this.u;
        float density = xb2Var.getDensity();
        dx1 layoutDirection = xb2Var.getLayoutDirection();
        hs2 hs2Var = kr2Var.d;
        int i = ir2.b;
        mv2.e(mv2Var, this.r, 0L);
        float f3 = ov3.b;
        nv2 nv2Var = this.s;
        int i2 = this.c - (nv2Var != null ? nv2Var.d : 0);
        int iR = gb2.R(hs2Var.d() * density);
        int iR2 = gb2.R(a.f(hs2Var, layoutDirection) * density);
        float f4 = ov3.c * density;
        nv2 nv2Var2 = this.h;
        if (nv2Var2 != null) {
            mv2.f(mv2Var, nv2Var2, 0, Alignment$Companion.getCenterVertically().a(nv2Var2.d, i2));
        }
        nv2 nv2Var3 = this.p;
        if (nv2Var3 != null) {
            int iG = g13.G(f2, z ? Alignment$Companion.getCenterVertically().a(nv2Var3.d, i2) : iR, -(nv2Var3.d / 2));
            if (nv2Var2 == null) {
                f = 0.0f;
            } else {
                f = (1.0f - f2) * (nv2Var2.c - f4);
            }
            mv2.f(mv2Var, nv2Var3, gb2.R(f) + iR2, iG);
        }
        nv2 nv2Var4 = this.m;
        if (nv2Var4 != null) {
            mv2.f(mv2Var, nv2Var4, nv2Var2 != null ? nv2Var2.c : 0, ir2.c(z, i2, iR, nv2Var3, nv2Var4));
        }
        int i3 = (nv2Var2 != null ? nv2Var2.c : 0) + (nv2Var4 != null ? nv2Var4.c : 0);
        nv2 nv2Var5 = this.o;
        mv2.f(mv2Var, nv2Var5, i3, ir2.c(z, i2, iR, nv2Var3, nv2Var5));
        nv2 nv2Var6 = this.q;
        if (nv2Var6 != null) {
            mv2.f(mv2Var, nv2Var6, i3, ir2.c(z, i2, iR, nv2Var3, nv2Var6));
        }
        int i4 = this.d;
        nv2 nv2Var7 = this.l;
        nv2 nv2Var8 = this.n;
        if (nv2Var8 != null) {
            mv2.f(mv2Var, nv2Var8, (i4 - (nv2Var7 != null ? nv2Var7.c : 0)) - nv2Var8.c, ir2.c(z, i2, iR, nv2Var3, nv2Var8));
        }
        if (nv2Var7 != null) {
            mv2.f(mv2Var, nv2Var7, i4 - nv2Var7.c, Alignment$Companion.getCenterVertically().a(nv2Var7.d, i2));
        }
        if (nv2Var != null) {
            mv2.f(mv2Var, nv2Var, 0, i2);
        }
        return w84.a;
    }
}
