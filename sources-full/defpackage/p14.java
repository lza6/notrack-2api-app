package defpackage;

import app.template.extension.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final enum p14 extends e44 {
    public p14() {
        super("TagName", 9);
    }

    @Override // defpackage.e44
    public final void d(o14 o14Var, p30 p30Var) {
        int i;
        char c;
        p30Var.b();
        int i2 = p30Var.e;
        int i3 = p30Var.c;
        char[] cArr = p30Var.a;
        while (true) {
            i = p30Var.e;
            if (i >= i3 || (c = cArr[i]) == '\t' || c == '\n' || c == '\r' || c == '\f' || c == ' ' || c == '/' || c == '>' || c == 0) {
                break;
            } else {
                p30Var.e = i + 1;
            }
        }
        o14Var.i.g(i > i2 ? p30.c(cArr, p30Var.h, i2, i - i2) : BuildConfig.VERSION_NAME);
        char cD = p30Var.d();
        if (cD == 0) {
            o14Var.i.g(e44.A0);
            return;
        }
        if (cD != ' ') {
            if (cD == '/') {
                o14Var.c = e44.W;
                return;
            }
            z14 z14Var = e44.c;
            if (cD == '>') {
                o14Var.k();
                o14Var.c = z14Var;
                return;
            }
            if (cD == 65535) {
                o14Var.l(this);
                o14Var.c = z14Var;
                return;
            } else if (cD != '\t' && cD != '\n' && cD != '\f' && cD != '\r') {
                m14 m14Var = o14Var.i;
                m14Var.getClass();
                m14Var.g(String.valueOf(cD));
                return;
            }
        }
        o14Var.c = e44.O;
    }
}
