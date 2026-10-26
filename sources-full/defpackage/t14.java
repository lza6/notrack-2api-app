package defpackage;

import kotlin.text.Typography;

/* JADX INFO: loaded from: classes.dex */
public final enum t14 extends e44 {
    public t14() {
        super("RawtextLessthanSign", 13);
    }

    @Override // defpackage.e44
    public final void d(o14 o14Var, p30 p30Var) {
        if (p30Var.m('/')) {
            o14Var.e();
            o14Var.a(e44.v);
        } else {
            o14Var.f(Typography.less);
            o14Var.c = e44.m;
        }
    }
}
