package androidx.compose.ui;

import defpackage.bk0;
import defpackage.ck0;
import defpackage.ne1;
import defpackage.nf2;
import defpackage.oe1;
import defpackage.ww1;
import defpackage.y64;

/* JADX INFO: loaded from: classes.dex */
public final class a extends ww1 implements ne1 {
    public final /* synthetic */ ck0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ck0 ck0Var) {
        super(2);
        this.c = ck0Var;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        c cVar = (c) obj;
        c cVarC = (nf2) obj2;
        if (cVarC instanceof bk0) {
            oe1 oe1Var = ((bk0) cVarC).c;
            oe1Var.getClass();
            y64.l(3, oe1Var);
            Modifier$Companion modifier$Companion = c.i;
            Modifier$Companion modifier$Companion2 = Modifier$Companion.$$INSTANCE;
            ck0 ck0Var = this.c;
            cVarC = b.c(ck0Var, (c) oe1Var.invoke(modifier$Companion2, ck0Var, 0));
        }
        return cVar.then(cVarC);
    }
}
