package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final enum y34 extends e44 {
    public y34() {
        super("BogusDoctype", 65);
    }

    @Override // defpackage.e44
    public final void d(o14 o14Var, p30 p30Var) {
        char cD = p30Var.d();
        z14 z14Var = e44.c;
        if (cD == '>') {
            o14Var.j();
            o14Var.c = z14Var;
        } else {
            if (cD != 65535) {
                return;
            }
            o14Var.j();
            o14Var.c = z14Var;
        }
    }
}
