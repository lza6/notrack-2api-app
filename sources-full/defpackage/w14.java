package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final enum w14 extends e44 {
    public w14() {
        super("ScriptDataLessthanSign", 16);
    }

    @Override // defpackage.e44
    public final void d(o14 o14Var, p30 p30Var) {
        char cD = p30Var.d();
        if (cD == '!') {
            o14Var.h("<!");
            o14Var.c = e44.A;
        } else if (cD == '/') {
            o14Var.e();
            o14Var.c = e44.y;
        } else {
            o14Var.h("<");
            p30Var.q();
            o14Var.c = e44.n;
        }
    }
}
