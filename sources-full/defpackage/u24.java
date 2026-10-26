package defpackage;

import kotlin.text.Typography;

/* JADX INFO: loaded from: classes.dex */
public final enum u24 extends e44 {
    public u24() {
        super("AttributeValue_singleQuoted", 38);
    }

    @Override // defpackage.e44
    public final void d(o14 o14Var, p30 p30Var) {
        String strG = p30Var.g(e44.w0);
        int length = strG.length();
        m14 m14Var = o14Var.i;
        if (length > 0) {
            m14Var.e(strG);
        } else {
            m14Var.g = true;
        }
        char cD = p30Var.d();
        if (cD == 0) {
            o14Var.m(this);
            o14Var.i.d((char) 65533);
            return;
        }
        if (cD == 65535) {
            o14Var.l(this);
            o14Var.c = e44.c;
            return;
        }
        if (cD != '&') {
            if (cD != '\'') {
                o14Var.i.d(cD);
                return;
            } else {
                o14Var.c = e44.V;
                return;
            }
        }
        int[] iArrC = o14Var.c('\'', true);
        m14 m14Var2 = o14Var.i;
        if (iArrC != null) {
            m14Var2.f(iArrC);
        } else {
            m14Var2.d(Typography.amp);
        }
    }
}
