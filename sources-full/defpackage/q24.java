package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final enum q24 extends e44 {
    public q24() {
        super("AttributeName", 34);
    }

    @Override // defpackage.e44
    public final void d(o14 o14Var, p30 p30Var) {
        String strH = p30Var.h(e44.y0);
        m14 m14Var = o14Var.i;
        String str = m14Var.d;
        if (str != null) {
            strH = str.concat(strH);
        }
        m14Var.d = strH;
        char cD = p30Var.d();
        if (cD == 0) {
            o14Var.m(this);
            o14Var.i.c((char) 65533);
            return;
        }
        if (cD != ' ') {
            if (cD != '\"' && cD != '\'') {
                if (cD == '/') {
                    o14Var.c = e44.W;
                    return;
                }
                z14 z14Var = e44.c;
                if (cD == 65535) {
                    o14Var.l(this);
                    o14Var.c = z14Var;
                    return;
                }
                if (cD != '\t' && cD != '\n' && cD != '\f' && cD != '\r') {
                    switch (cD) {
                        case '<':
                            break;
                        case '=':
                            o14Var.c = e44.R;
                            break;
                        case '>':
                            o14Var.k();
                            o14Var.c = z14Var;
                            break;
                        default:
                            o14Var.i.c(cD);
                            break;
                    }
                    return;
                }
            }
            o14Var.m(this);
            o14Var.i.c(cD);
            return;
        }
        o14Var.c = e44.Q;
    }
}
