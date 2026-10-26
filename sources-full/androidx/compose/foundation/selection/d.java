package androidx.compose.foundation.selection;

import androidx.compose.runtime.Composer$Companion;
import defpackage.ck0;
import defpackage.e14;
import defpackage.fq2;
import defpackage.gh2;
import defpackage.je1;
import defpackage.kk0;
import defpackage.n73;
import defpackage.oe1;
import defpackage.vn1;
import defpackage.ww1;

/* JADX INFO: loaded from: classes.dex */
public final class d extends ww1 implements oe1 {
    public final /* synthetic */ vn1 c;
    public final /* synthetic */ e14 d;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ n73 l;
    public final /* synthetic */ je1 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(vn1 vn1Var, e14 e14Var, boolean z, n73 n73Var, je1 je1Var) {
        super(3);
        this.c = vn1Var;
        this.d = e14Var;
        this.h = z;
        this.l = n73Var;
        this.m = je1Var;
    }

    public final androidx.compose.ui.c invoke(androidx.compose.ui.c cVar, ck0 ck0Var, int i) {
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.a0(-1525724089);
        Object objP = kk0Var.P();
        if (objP == Composer$Companion.getEmpty()) {
            objP = fq2.j(kk0Var);
        }
        gh2 gh2Var = (gh2) objP;
        androidx.compose.ui.c cVarThen = androidx.compose.foundation.d.a(androidx.compose.ui.c.i, gh2Var, this.c).then(new TriStateToggleableElement(this.d, gh2Var, null, this.h, this.l, this.m));
        kk0Var.r(false);
        return cVarThen;
    }

    @Override // defpackage.oe1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((androidx.compose.ui.c) obj, (ck0) obj2, ((Number) obj3).intValue());
    }
}
