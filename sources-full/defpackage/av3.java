package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class av3 extends ww1 implements ne1 {
    public final /* synthetic */ uz3 c;
    public final /* synthetic */ uz3 d;
    public final /* synthetic */ float h;
    public final /* synthetic */ gn3 l;
    public final /* synthetic */ ne1 m;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ gn3 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public av3(uz3 uz3Var, uz3 uz3Var2, float f, gn3 gn3Var, ne1 ne1Var, boolean z, gn3 gn3Var2) {
        super(2);
        this.c = uz3Var;
        this.d = uz3Var2;
        this.h = f;
        this.l = gn3Var;
        this.m = ne1Var;
        this.n = z;
        this.o = gn3Var2;
    }

    @Override // defpackage.ne1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((ck0) obj, ((Number) obj2).intValue());
        return w84.a;
    }

    public final void invoke(ck0 ck0Var, int i) {
        hw2 hw2Var;
        fw2 fw2Var;
        if ((i & 3) == 2) {
            kk0 kk0Var = (kk0) ck0Var;
            if (kk0Var.F()) {
                kk0Var.V();
                return;
            }
        }
        uz3 uz3Var = this.c;
        em3 em3Var = uz3Var.a;
        uz3 uz3Var2 = this.d;
        em3 em3Var2 = uz3Var2.a;
        hy3 hy3Var = fm3.d;
        hy3 hy3Var2 = em3Var.a;
        hy3 hy3Var3 = em3Var2.a;
        boolean z = hy3Var2 instanceof ay;
        hy3 ayVar = fy3.a;
        float f = this.h;
        if (!z && !(hy3Var3 instanceof ay)) {
            long jI = gb2.I(hy3Var2.a(), hy3Var3.a(), f);
            if (jI != 16) {
                ayVar = new gf0(jI);
            }
        } else if (z && (hy3Var3 instanceof ay)) {
            ay ayVar2 = (ay) hy3Var2;
            ay ayVar3 = (ay) hy3Var3;
            yx yxVar = (yx) fm3.b(ayVar2.a, ayVar3.a, f);
            float F = g13.F(ayVar2.b, ayVar3.b, f);
            if (yxVar != null) {
                if (yxVar instanceof vl3) {
                    long J = p23.J(F, ((vl3) yxVar).a);
                    if (J != 16) {
                        ayVar = new gf0(J);
                    }
                } else {
                    if (!(yxVar instanceof ng3)) {
                        u41.e();
                        return;
                    }
                    ayVar = new ay((ng3) yxVar, F);
                }
            }
        } else {
            ayVar = (hy3) fm3.b(hy3Var2, hy3Var3, f);
        }
        hy3 hy3Var4 = ayVar;
        lb1 lb1Var = (lb1) fm3.b(em3Var.f, em3Var2.f, f);
        long jC = fm3.c(em3Var.b, em3Var2.b, f);
        ic1 ic1Var = em3Var.c;
        if (ic1Var == null) {
            ic1Var = ic1.h;
        }
        ic1 ic1Var2 = em3Var2.c;
        if (ic1Var2 == null) {
            ic1Var2 = ic1.h;
        }
        ic1 ic1Var3 = new ic1(py.x(g13.G(f, ic1Var.c, ic1Var2.c), 1, 1000));
        gc1 gc1Var = (gc1) fm3.b(em3Var.d, em3Var2.d, f);
        hc1 hc1Var = (hc1) fm3.b(em3Var.e, em3Var2.e, f);
        String str = (String) fm3.b(em3Var.g, em3Var2.g, f);
        long jC2 = fm3.c(em3Var.h, em3Var2.h, f);
        zr zrVar = em3Var.i;
        float f2 = zrVar != null ? zrVar.a : 0.0f;
        zr zrVar2 = em3Var2.i;
        float F2 = g13.F(f2, zrVar2 != null ? zrVar2.a : 0.0f, f);
        iy3 iy3Var = em3Var.j;
        iy3 iy3Var2 = iy3.c;
        if (iy3Var == null) {
            iy3Var = iy3Var2;
        }
        iy3 iy3Var3 = em3Var2.j;
        if (iy3Var3 != null) {
            iy3Var2 = iy3Var3;
        }
        iy3 iy3Var4 = new iy3(g13.F(iy3Var.a, iy3Var2.a, f), g13.F(iy3Var.b, iy3Var2.b, f));
        g72 g72Var = (g72) fm3.b(em3Var.k, em3Var2.k, f);
        long jI2 = gb2.I(em3Var.l, em3Var2.l, f);
        tt3 tt3Var = (tt3) fm3.b(em3Var.m, em3Var2.m, f);
        pg3 pg3Var = em3Var.n;
        if (pg3Var == null) {
            pg3Var = new pg3();
        }
        pg3 pg3Var2 = em3Var2.n;
        if (pg3Var2 == null) {
            pg3Var2 = new pg3();
        }
        pg3 pg3Var3 = new pg3(gb2.I(pg3Var.a, pg3Var2.a, f), y64.G(pg3Var.b, pg3Var2.b, f), g13.F(pg3Var.c, pg3Var2.c, f));
        hw2 hw2Var2 = em3Var.o;
        hw2 hw2Var3 = em3Var2.o;
        if (hw2Var2 == null && hw2Var3 == null) {
            hw2Var = null;
        } else {
            if (hw2Var2 == null) {
                hw2Var2 = hw2.a;
            }
            hw2Var = hw2Var2;
        }
        em3 em3Var3 = new em3(hy3Var4, jC, ic1Var3, gc1Var, hc1Var, lb1Var, str, jC2, new zr(F2), iy3Var4, g72Var, jI2, tt3Var, pg3Var3, hw2Var, (uz0) fm3.b(em3Var.p, em3Var2.p, f));
        xs2 xs2Var = uz3Var.b;
        xs2 xs2Var2 = uz3Var2.b;
        int i2 = ys2.b;
        int i3 = ((jt3) fm3.b(new jt3(xs2Var.a), new jt3(xs2Var2.a), f)).a;
        int i4 = ((wt3) fm3.b(new wt3(xs2Var.b), new wt3(xs2Var2.b), f)).a;
        long jC3 = fm3.c(xs2Var.c, xs2Var2.c, f);
        ky3 ky3Var = xs2Var.d;
        if (ky3Var == null) {
            ky3Var = ky3.c;
        }
        ky3 ky3Var2 = xs2Var2.d;
        if (ky3Var2 == null) {
            ky3Var2 = ky3.c;
        }
        ky3 ky3Var3 = new ky3(fm3.c(ky3Var.a, ky3Var2.a, f), fm3.c(ky3Var.b, ky3Var2.b, f));
        fw2 fw2Var2 = xs2Var.e;
        fw2 fw2Var3 = xs2Var2.e;
        if (fw2Var2 == null && fw2Var3 == null) {
            fw2Var = null;
        } else {
            fw2 fw2Var4 = fw2.b;
            if (fw2Var2 == null) {
                fw2Var2 = fw2Var4;
            }
            boolean z2 = fw2Var2.a;
            if (fw2Var3 == null) {
                fw2Var3 = fw2Var4;
            }
            boolean z3 = fw2Var3.a;
            if (z2 != z3) {
                ((l21) fm3.b(new l21(), new l21(), f)).getClass();
                fw2Var2 = new fw2(0, ((Boolean) fm3.b(Boolean.valueOf(z2), Boolean.valueOf(z3), f)).booleanValue());
            }
            fw2Var = fw2Var2;
        }
        uz3 uz3Var3 = new uz3(em3Var3, new xs2(i3, i4, jC3, ky3Var3, fw2Var, (c42) fm3.b(xs2Var.f, xs2Var2.f, f), ((x32) fm3.b(new x32(xs2Var.g), new x32(xs2Var2.g), f)).a, ((vk1) fm3.b(new vk1(xs2Var.h), new vk1(xs2Var2.h), f)).a, (hz3) fm3.b(xs2Var.i, xs2Var2.i, f)));
        if (this.n) {
            uz3Var3 = uz3.a(uz3Var3, ((re0) this.o.getValue()).a, 0L, null, null, 0L, 0, 0L, null, null, 16777214);
        }
        ov3.m1794xaca17d46(((re0) this.l.getValue()).a, uz3Var3, this.m, ck0Var, 0);
    }
}
