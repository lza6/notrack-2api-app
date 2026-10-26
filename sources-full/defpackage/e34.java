package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final enum e34 extends e44 {
    public e34() {
        super("CommentEndDash", 47);
    }

    @Override // defpackage.e44
    public final void d(o14 o14Var, p30 p30Var) {
        h14 h14Var = o14Var.n;
        char cD = p30Var.d();
        d34 d34Var = e44.b0;
        if (cD == 0) {
            o14Var.m(this);
            StringBuilder sb = h14Var.b;
            sb.append('-');
            sb.append((char) 65533);
            o14Var.c = d34Var;
            return;
        }
        if (cD == '-') {
            o14Var.c = e44.d0;
            return;
        }
        if (cD == 65535) {
            o14Var.l(this);
            o14Var.i();
            o14Var.c = e44.c;
        } else {
            StringBuilder sb2 = h14Var.b;
            sb2.append('-');
            sb2.append(cD);
            o14Var.c = d34Var;
        }
    }
}
