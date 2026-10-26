package defpackage;

import app.template.extension.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final enum z14 extends e44 {
    public z14() {
        super("Data", 0);
    }

    @Override // defpackage.e44
    public final void d(o14 o14Var, p30 p30Var) {
        int i;
        char c;
        char cI = p30Var.i();
        if (cI == 0) {
            o14Var.m(this);
            o14Var.f(p30Var.d());
            return;
        }
        if (cI == '&') {
            o14Var.a(e44.d);
            return;
        }
        if (cI == '<') {
            o14Var.a(e44.o);
            return;
        }
        if (cI == 65535) {
            o14Var.g(new j14());
            return;
        }
        p30Var.b();
        int i2 = p30Var.e;
        int i3 = p30Var.c;
        char[] cArr = p30Var.a;
        while (true) {
            i = p30Var.e;
            if (i >= i3 || (c = cArr[i]) == '&' || c == '<' || c == 0) {
                break;
            } else {
                p30Var.e = i + 1;
            }
        }
        o14Var.h(i > i2 ? p30.c(cArr, p30Var.h, i2, i - i2) : BuildConfig.VERSION_NAME);
    }
}
