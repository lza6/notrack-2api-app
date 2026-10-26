package defpackage;

import kotlin.text.Typography;

/* JADX INFO: loaded from: classes.dex */
public final enum w24 extends e44 {
    public w24() {
        super("AttributeValue_unquoted", 39);
    }

    @Override // defpackage.e44
    public final void d(o14 o14Var, p30 p30Var) {
        String strH = p30Var.h(e44.z0);
        if (strH.length() > 0) {
            o14Var.i.e(strH);
        }
        char cD = p30Var.d();
        if (cD == 0) {
            o14Var.m(this);
            o14Var.i.d((char) 65533);
            return;
        }
        if (cD != ' ') {
            if (cD != '\"' && cD != '`') {
                z14 z14Var = e44.c;
                if (cD == 65535) {
                    o14Var.l(this);
                    o14Var.c = z14Var;
                    return;
                }
                if (cD != '\t' && cD != '\n' && cD != '\f' && cD != '\r') {
                    if (cD == '&') {
                        int[] iArrC = o14Var.c(Character.valueOf(Typography.greater), true);
                        m14 m14Var = o14Var.i;
                        if (iArrC != null) {
                            m14Var.f(iArrC);
                            return;
                        } else {
                            m14Var.d(Typography.amp);
                            return;
                        }
                    }
                    if (cD != '\'') {
                        switch (cD) {
                            case '<':
                            case '=':
                                break;
                            case '>':
                                o14Var.k();
                                o14Var.c = z14Var;
                                break;
                            default:
                                o14Var.i.d(cD);
                                break;
                        }
                        return;
                    }
                }
            }
            o14Var.m(this);
            o14Var.i.d(cD);
            return;
        }
        o14Var.c = e44.O;
    }
}
