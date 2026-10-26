package defpackage;

import kotlin.text.Typography;

/* JADX INFO: loaded from: classes.dex */
public final enum v24 extends e44 {
    public v24() {
        super("Rcdata", 2);
    }

    @Override // defpackage.e44
    public final void d(o14 o14Var, p30 p30Var) {
        char cI = p30Var.i();
        if (cI == 0) {
            o14Var.m(this);
            p30Var.a();
            o14Var.f((char) 65533);
        } else {
            if (cI == '&') {
                o14Var.a(e44.l);
                return;
            }
            if (cI == '<') {
                o14Var.a(e44.r);
            } else if (cI != 65535) {
                o14Var.h(p30Var.g(Typography.amp, Typography.less, 0));
            } else {
                o14Var.g(new j14());
            }
        }
    }
}
