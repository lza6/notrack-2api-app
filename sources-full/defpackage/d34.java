package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final enum d34 extends e44 {
    public d34() {
        super("Comment", 46);
    }

    @Override // defpackage.e44
    public final void d(o14 o14Var, p30 p30Var) {
        h14 h14Var = o14Var.n;
        char cI = p30Var.i();
        if (cI == 0) {
            o14Var.m(this);
            p30Var.a();
            h14Var.b.append((char) 65533);
        } else if (cI == '-') {
            o14Var.a(e44.c0);
        } else {
            if (cI != 65535) {
                h14Var.b.append(p30Var.g('-', 0));
                return;
            }
            o14Var.l(this);
            o14Var.i();
            o14Var.c = e44.c;
        }
    }
}
