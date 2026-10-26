package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final enum x24 extends e44 {
    public x24() {
        super("AfterAttributeValue_quoted", 40);
    }

    @Override // defpackage.e44
    public final void d(o14 o14Var, p30 p30Var) {
        char cD = p30Var.d();
        p24 p24Var = e44.O;
        if (cD == '\t' || cD == '\n' || cD == '\f' || cD == '\r' || cD == ' ') {
            o14Var.c = p24Var;
            return;
        }
        if (cD == '/') {
            o14Var.c = e44.W;
            return;
        }
        z14 z14Var = e44.c;
        if (cD == '>') {
            o14Var.k();
            o14Var.c = z14Var;
        } else if (cD == 65535) {
            o14Var.l(this);
            o14Var.c = z14Var;
        } else {
            o14Var.m(this);
            p30Var.q();
            o14Var.c = p24Var;
        }
    }
}
