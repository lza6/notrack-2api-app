package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final enum s14 extends e44 {
    public s14() {
        super("RCDATAEndTagName", 12);
    }

    public static void e(o14 o14Var, p30 p30Var) {
        o14Var.h("</".concat(o14Var.h.toString()));
        p30Var.q();
        o14Var.c = e44.h;
    }

    @Override // defpackage.e44
    public final void d(o14 o14Var, p30 p30Var) {
        if (p30Var.o()) {
            String strE = p30Var.e();
            o14Var.i.g(strE);
            o14Var.h.append(strE);
            return;
        }
        char cD = p30Var.d();
        if (cD == '\t' || cD == '\n' || cD == '\f' || cD == '\r' || cD == ' ') {
            if (o14Var.n()) {
                o14Var.c = e44.O;
                return;
            } else {
                e(o14Var, p30Var);
                return;
            }
        }
        if (cD == '/') {
            if (o14Var.n()) {
                o14Var.c = e44.W;
                return;
            } else {
                e(o14Var, p30Var);
                return;
            }
        }
        if (cD != '>') {
            e(o14Var, p30Var);
        } else if (!o14Var.n()) {
            e(o14Var, p30Var);
        } else {
            o14Var.k();
            o14Var.c = e44.c;
        }
    }
}
