package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class by2 extends yn2 {
    public gq0 d;
    public ne1 e;
    public cr1 f;

    @Override // defpackage.yn2
    public final void a() {
        cr1 cr1Var = this.f;
        if (cr1Var != null) {
            cr1Var.b();
        }
        cr1 cr1Var2 = this.f;
        if (cr1Var2 == null) {
            return;
        }
        cr1Var2.a = false;
    }

    @Override // defpackage.yn2
    public final void b() {
        cr1 cr1Var = this.f;
        if (cr1Var != null && !cr1Var.a) {
            cr1Var.b();
            this.f = null;
        }
        if (this.f == null) {
            this.f = new cr1(this.d, false, this.e, this);
        }
        cr1 cr1Var2 = this.f;
        if (cr1Var2 != null) {
            ((jy) cr1Var2.b).g(null);
        }
        cr1 cr1Var3 = this.f;
        if (cr1Var3 == null) {
            return;
        }
        cr1Var3.a = false;
    }

    @Override // defpackage.yn2
    public final void c(zq zqVar) {
        zqVar.getClass();
        cr1 cr1Var = this.f;
        if (cr1Var != null) {
            ((jy) cr1Var.b).i(zqVar);
        }
    }

    @Override // defpackage.yn2
    public final void d(zq zqVar) {
        zqVar.getClass();
        cr1 cr1Var = this.f;
        if (cr1Var != null) {
            cr1Var.b();
        }
        if (this.a) {
            this.f = new cr1(this.d, true, this.e, this);
        }
    }
}
