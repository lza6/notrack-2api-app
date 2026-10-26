package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final enum b34 extends e44 {
    public b34() {
        super("CommentStart", 44);
    }

    @Override // defpackage.e44
    public final void d(o14 o14Var, p30 p30Var) {
        h14 h14Var = o14Var.n;
        char cD = p30Var.d();
        d34 d34Var = e44.b0;
        if (cD == 0) {
            o14Var.m(this);
            h14Var.b.append((char) 65533);
            o14Var.c = d34Var;
            return;
        }
        if (cD == '-') {
            o14Var.c = e44.a0;
            return;
        }
        z14 z14Var = e44.c;
        if (cD == '>') {
            o14Var.m(this);
            o14Var.i();
            o14Var.c = z14Var;
        } else if (cD != 65535) {
            h14Var.b.append(cD);
            o14Var.c = d34Var;
        } else {
            o14Var.l(this);
            o14Var.i();
            o14Var.c = z14Var;
        }
    }
}
