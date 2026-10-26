package defpackage;

import kotlin.text.Typography;

/* JADX INFO: loaded from: classes.dex */
public final enum l34 extends e44 {
    public l34() {
        super("AfterDoctypeName", 53);
    }

    @Override // defpackage.e44
    public final void d(o14 o14Var, p30 p30Var) {
        i14 i14Var = o14Var.m;
        boolean zJ = p30Var.j();
        z14 z14Var = e44.c;
        if (zJ) {
            o14Var.l(this);
            i14Var.getClass();
            o14Var.j();
            o14Var.c = z14Var;
            return;
        }
        if (p30Var.n('\t', '\n', '\r', '\f', ' ')) {
            p30Var.a();
            return;
        }
        if (p30Var.m(Typography.greater)) {
            o14Var.j();
            o14Var.a(z14Var);
            return;
        }
        if (p30Var.l("PUBLIC")) {
            i14Var.getClass();
            o14Var.c = e44.j0;
        } else if (p30Var.l("SYSTEM")) {
            i14Var.getClass();
            o14Var.c = e44.p0;
        } else {
            o14Var.m(this);
            i14Var.getClass();
            o14Var.a(e44.u0);
        }
    }
}
