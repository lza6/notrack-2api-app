package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final enum m24 extends e44 {
    public m24() {
        super("ScriptDataDoubleEscapedDashDash", 30);
    }

    @Override // defpackage.e44
    public final void d(o14 o14Var, p30 p30Var) {
        char cD = p30Var.d();
        j24 j24Var = e44.J;
        if (cD == 0) {
            o14Var.m(this);
            o14Var.f((char) 65533);
            o14Var.c = j24Var;
            return;
        }
        if (cD == '-') {
            o14Var.f(cD);
            return;
        }
        if (cD == '<') {
            o14Var.f(cD);
            o14Var.c = e44.M;
        } else if (cD == '>') {
            o14Var.f(cD);
            o14Var.c = e44.n;
        } else if (cD != 65535) {
            o14Var.f(cD);
            o14Var.c = j24Var;
        } else {
            o14Var.l(this);
            o14Var.c = e44.c;
        }
    }
}
