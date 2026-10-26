package defpackage;

import kotlin.text.Typography;

/* JADX INFO: loaded from: classes.dex */
public final enum c44 extends e44 {
    public c44() {
        super("TagOpen", 7);
    }

    @Override // defpackage.e44
    public final void d(o14 o14Var, p30 p30Var) {
        char cI = p30Var.i();
        if (cI == '!') {
            o14Var.a(e44.Y);
            return;
        }
        if (cI == '/') {
            o14Var.a(e44.p);
            return;
        }
        if (cI == '?') {
            o14Var.a(e44.X);
            return;
        }
        if (p30Var.o()) {
            o14Var.d(true);
            o14Var.c = e44.q;
        } else {
            o14Var.m(this);
            o14Var.f(Typography.less);
            o14Var.c = e44.c;
        }
    }
}
