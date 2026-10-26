package defpackage;

import kotlin.text.Typography;

/* JADX INFO: loaded from: classes.dex */
public final enum k24 extends e44 {
    public k24() {
        super("CharacterReferenceInData", 1);
    }

    @Override // defpackage.e44
    public final void d(o14 o14Var, p30 p30Var) {
        int[] iArrC = o14Var.c(null, false);
        if (iArrC == null) {
            o14Var.f(Typography.amp);
        } else {
            o14Var.h(new String(iArrC, 0, iArrC.length));
        }
        o14Var.c = e44.c;
    }
}
