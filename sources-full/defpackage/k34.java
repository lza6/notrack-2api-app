package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final enum k34 extends e44 {
    public k34() {
        super("DoctypeName", 52);
    }

    @Override // defpackage.e44
    public final void d(o14 o14Var, p30 p30Var) {
        i14 i14Var = o14Var.m;
        if (p30Var.o()) {
            i14Var.b.append(p30Var.e());
            return;
        }
        char cD = p30Var.d();
        if (cD == 0) {
            o14Var.m(this);
            i14Var.b.append((char) 65533);
            return;
        }
        if (cD != ' ') {
            z14 z14Var = e44.c;
            if (cD == '>') {
                o14Var.j();
                o14Var.c = z14Var;
                return;
            }
            if (cD == 65535) {
                o14Var.l(this);
                i14Var.getClass();
                o14Var.j();
                o14Var.c = z14Var;
                return;
            }
            if (cD != '\t' && cD != '\n' && cD != '\f' && cD != '\r') {
                i14Var.b.append(cD);
                return;
            }
        }
        o14Var.c = e44.i0;
    }
}
