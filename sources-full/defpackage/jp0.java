package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jp0 extends ww1 implements le1 {
    public final /* synthetic */ z22 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ ly3 l;
    public final /* synthetic */ ey3 m;
    public final /* synthetic */ in1 n;
    public final /* synthetic */ nn2 o;
    public final /* synthetic */ xw3 p;
    public final /* synthetic */ gq0 q;
    public final /* synthetic */ kx r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jp0(z22 z22Var, boolean z, boolean z2, ly3 ly3Var, ey3 ey3Var, in1 in1Var, nn2 nn2Var, xw3 xw3Var, gq0 gq0Var, kx kxVar) {
        super(1);
        this.c = z22Var;
        this.d = z;
        this.h = z2;
        this.l = ly3Var;
        this.m = ey3Var;
        this.n = in1Var;
        this.o = nn2Var;
        this.p = xw3Var;
        this.q = gq0Var;
        this.r = kxVar;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        yy3 yy3VarD;
        cb1 cb1Var = (cb1) obj;
        z22 z22Var = this.c;
        if (z22Var.b() != cb1Var.b()) {
            z22Var.f.setValue(Boolean.valueOf(cb1Var.b()));
            boolean zB = z22Var.b();
            nn2 nn2Var = this.o;
            ey3 ey3Var = this.m;
            if (zB && this.d && !this.h) {
                qp0.d(this.l, z22Var, ey3Var, this.n, nn2Var);
            } else {
                qp0.c(z22Var);
            }
            if (cb1Var.b() && (yy3VarD = z22Var.d()) != null) {
                py.F(this.q, null, null, new pb(this.r, ey3Var, z22Var, yy3VarD, nn2Var, null, 6), 3);
            }
            if (!cb1Var.b()) {
                this.p.e(null);
            }
        }
        return w84.a;
    }
}
