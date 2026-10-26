package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class v62 extends w62 implements k32 {
    public final xc1 m;
    public final /* synthetic */ ih2 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v62(ih2 ih2Var, xc1 xc1Var, in2 in2Var) {
        super(ih2Var, in2Var);
        this.n = ih2Var;
        this.m = xc1Var;
    }

    @Override // defpackage.w62
    public final void b() {
        this.m.V.b(this);
    }

    @Override // defpackage.w62
    public final boolean c(xc1 xc1Var) {
        return this.m == xc1Var;
    }

    @Override // defpackage.w62
    public final boolean d() {
        return this.m.V.c.compareTo(g32.l) >= 0;
    }

    @Override // defpackage.k32
    public final void onStateChanged(n32 n32Var, f32 f32Var) {
        xc1 xc1Var = this.m;
        g32 g32Var = xc1Var.V.c;
        if (g32Var == g32.c) {
            ih2.a("removeObserver");
            w62 w62Var = (w62) this.n.b.d(this.c);
            if (w62Var == null) {
                return;
            }
            w62Var.b();
            w62Var.a(false);
            return;
        }
        g32 g32Var2 = null;
        while (g32Var2 != g32Var) {
            a(d());
            g32Var2 = g32Var;
            g32Var = xc1Var.V.c;
        }
    }
}
