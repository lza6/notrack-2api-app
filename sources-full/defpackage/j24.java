package defpackage;

import kotlin.text.Typography;

/* JADX INFO: loaded from: classes.dex */
public final enum j24 extends e44 {
    public j24() {
        super("ScriptDataDoubleEscaped", 28);
    }

    @Override // defpackage.e44
    public final void d(o14 o14Var, p30 p30Var) {
        char cI = p30Var.i();
        if (cI == 0) {
            o14Var.m(this);
            p30Var.a();
            o14Var.f((char) 65533);
        } else if (cI == '-') {
            o14Var.f(cI);
            o14Var.a(e44.K);
        } else if (cI == '<') {
            o14Var.f(cI);
            o14Var.a(e44.M);
        } else if (cI != 65535) {
            o14Var.h(p30Var.g('-', Typography.less, 0));
        } else {
            o14Var.l(this);
            o14Var.c = e44.c;
        }
    }
}
