package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final enum y24 extends e44 {
    public y24() {
        super("SelfClosingStartTag", 41);
    }

    @Override // defpackage.e44
    public final void d(o14 o14Var, p30 p30Var) {
        char cD = p30Var.d();
        z14 z14Var = e44.c;
        if (cD == '>') {
            o14Var.i.i = true;
            o14Var.k();
            o14Var.c = z14Var;
        } else if (cD == 65535) {
            o14Var.l(this);
            o14Var.c = z14Var;
        } else {
            o14Var.m(this);
            p30Var.q();
            o14Var.c = e44.O;
        }
    }
}
