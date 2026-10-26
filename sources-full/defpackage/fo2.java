package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fo2 implements q00 {
    public final yn2 c;
    public final /* synthetic */ go2 d;

    public fo2(go2 go2Var, yn2 yn2Var) {
        yn2Var.getClass();
        this.d = go2Var;
        this.c = yn2Var;
    }

    @Override // defpackage.q00
    public final void cancel() {
        go2 go2Var = this.d;
        kl klVar = go2Var.b;
        yn2 yn2Var = this.c;
        klVar.remove(yn2Var);
        if (kr1.n(go2Var.c, yn2Var)) {
            yn2Var.a();
            go2Var.c = null;
        }
        yn2Var.getClass();
        yn2Var.b.remove(this);
        je1 je1Var = yn2Var.c;
        if (je1Var != null) {
            je1Var.invoke();
        }
        yn2Var.c = null;
    }
}
