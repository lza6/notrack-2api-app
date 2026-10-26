package defpackage;

import kotlin.text.Typography;

/* JADX INFO: loaded from: classes.dex */
public final enum d44 extends e44 {
    public d44() {
        super("EndTagOpen", 8);
    }

    @Override // defpackage.e44
    public final void d(o14 o14Var, p30 p30Var) {
        boolean zJ = p30Var.j();
        z14 z14Var = e44.c;
        if (zJ) {
            o14Var.l(this);
            o14Var.h("</");
            o14Var.c = z14Var;
        } else if (p30Var.o()) {
            o14Var.d(false);
            o14Var.c = e44.q;
        } else if (p30Var.m(Typography.greater)) {
            o14Var.m(this);
            o14Var.a(z14Var);
        } else {
            o14Var.m(this);
            o14Var.a(e44.X);
        }
    }
}
