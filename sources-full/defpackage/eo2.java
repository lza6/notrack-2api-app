package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class eo2 implements k32, q00 {
    public final h32 c;
    public final yn2 d;
    public fo2 h;
    public final /* synthetic */ go2 l;

    public eo2(go2 go2Var, h32 h32Var, yn2 yn2Var) {
        yn2Var.getClass();
        this.l = go2Var;
        this.c = h32Var;
        this.d = yn2Var;
        h32Var.a(this);
    }

    @Override // defpackage.q00
    public final void cancel() {
        this.c.b(this);
        yn2 yn2Var = this.d;
        yn2Var.getClass();
        yn2Var.b.remove(this);
        fo2 fo2Var = this.h;
        if (fo2Var != null) {
            fo2Var.cancel();
        }
        this.h = null;
    }

    @Override // defpackage.k32
    public final void onStateChanged(n32 n32Var, f32 f32Var) {
        if (f32Var != f32.ON_START) {
            if (f32Var != f32.ON_STOP) {
                if (f32Var == f32.ON_DESTROY) {
                    cancel();
                    return;
                }
                return;
            } else {
                fo2 fo2Var = this.h;
                if (fo2Var != null) {
                    fo2Var.cancel();
                    return;
                }
                return;
            }
        }
        yn2 yn2Var = this.d;
        yn2Var.getClass();
        go2 go2Var = this.l;
        go2Var.b.addLast(yn2Var);
        fo2 fo2Var2 = new fo2(go2Var, yn2Var);
        yn2Var.b.add(fo2Var2);
        go2Var.e();
        yn2Var.c = new ia0(0, go2Var, go2.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 12);
        this.h = fo2Var2;
    }
}
