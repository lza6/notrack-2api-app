package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class uw0 implements a53 {
    public final le1 c;
    public vw0 d;

    public uw0(le1 le1Var) {
        this.c = le1Var;
    }

    @Override // defpackage.a53
    public final void a() {
        this.d = (vw0) this.c.invoke(r11.a);
    }

    @Override // defpackage.a53
    public final void b() {
    }

    @Override // defpackage.a53
    public final void d() {
        vw0 vw0Var = this.d;
        if (vw0Var != null) {
            vw0Var.dispose();
        }
        this.d = null;
    }
}
