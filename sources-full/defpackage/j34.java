package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final enum j34 extends e44 {
    public j34() {
        super("BeforeDoctypeName", 51);
    }

    @Override // defpackage.e44
    public final void d(o14 o14Var, p30 p30Var) {
        i14 i14Var = o14Var.m;
        boolean zO = p30Var.o();
        k34 k34Var = e44.h0;
        if (zO) {
            i14Var.a();
            o14Var.c = k34Var;
            return;
        }
        char cD = p30Var.d();
        if (cD == 0) {
            o14Var.m(this);
            i14Var.a();
            i14Var.b.append((char) 65533);
            o14Var.c = k34Var;
            return;
        }
        if (cD != ' ') {
            if (cD == 65535) {
                o14Var.l(this);
                i14Var.a();
                i14Var.getClass();
                o14Var.j();
                o14Var.c = e44.c;
                return;
            }
            if (cD == '\t' || cD == '\n' || cD == '\f' || cD == '\r') {
                return;
            }
            i14Var.a();
            i14Var.b.append(cD);
            o14Var.c = k34Var;
        }
    }
}
