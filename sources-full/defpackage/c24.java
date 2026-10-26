package defpackage;

import kotlin.text.Typography;

/* JADX INFO: loaded from: classes.dex */
public final enum c24 extends e44 {
    public c24() {
        super("ScriptDataEscaped", 21);
    }

    @Override // defpackage.e44
    public final void d(o14 o14Var, p30 p30Var) {
        if (p30Var.j()) {
            o14Var.l(this);
            o14Var.c = e44.c;
            return;
        }
        char cI = p30Var.i();
        if (cI == 0) {
            o14Var.m(this);
            p30Var.a();
            o14Var.f((char) 65533);
        } else if (cI == '-') {
            o14Var.f('-');
            o14Var.a(e44.D);
        } else if (cI != '<') {
            o14Var.h(p30Var.g('-', Typography.less, 0));
        } else {
            o14Var.a(e44.F);
        }
    }
}
