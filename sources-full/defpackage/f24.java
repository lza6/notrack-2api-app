package defpackage;

import kotlin.text.Typography;

/* JADX INFO: loaded from: classes.dex */
public final enum f24 extends e44 {
    public f24() {
        super("ScriptDataEscapedLessthanSign", 24);
    }

    @Override // defpackage.e44
    public final void d(o14 o14Var, p30 p30Var) {
        if (p30Var.o()) {
            o14Var.e();
            o14Var.h.append(p30Var.i());
            o14Var.h("<" + p30Var.i());
            o14Var.a(e44.I);
            return;
        }
        if (p30Var.m('/')) {
            o14Var.e();
            o14Var.a(e44.G);
        } else {
            o14Var.f(Typography.less);
            o14Var.c = e44.C;
        }
    }
}
