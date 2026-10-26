package androidx.compose.foundation;

import androidx.compose.runtime.Composer$Companion;
import defpackage.ck0;
import defpackage.fq2;
import defpackage.gh2;
import defpackage.je1;
import defpackage.kk0;
import defpackage.n73;
import defpackage.oe1;
import defpackage.vn1;
import defpackage.ww1;

/* JADX INFO: loaded from: classes.dex */
public final class b extends ww1 implements oe1 {
    public final /* synthetic */ vn1 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ String h;
    public final /* synthetic */ n73 l;
    public final /* synthetic */ je1 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(vn1 vn1Var, boolean z, String str, n73 n73Var, je1 je1Var) {
        super(3);
        this.c = vn1Var;
        this.d = z;
        this.h = str;
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
        androidx.compose.ui.c cVarThen = d.a(androidx.compose.ui.c.i, gh2Var, this.c).then(new ClickableElement(gh2Var, null, this.d, this.h, this.l, this.m));
        kk0Var.r(false);
        return cVarThen;
    }

    @Override // defpackage.oe1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((androidx.compose.ui.c) obj, (ck0) obj2, ((Number) obj3).intValue());
    }
}
