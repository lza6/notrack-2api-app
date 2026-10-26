package androidx.compose.ui;

import defpackage.bk0;
import defpackage.ck0;
import defpackage.kk0;
import defpackage.le1;
import defpackage.oe1;
import defpackage.sx;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final c a(c cVar, le1 le1Var, oe1 oe1Var) {
        return cVar.then(new bk0(le1Var, oe1Var));
    }

    public static final c c(ck0 ck0Var, c cVar) {
        if (cVar.all(sx.p)) {
            return cVar;
        }
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.b0(1219399079);
        Modifier$Companion modifier$Companion = c.i;
        c cVar2 = (c) cVar.foldIn(Modifier$Companion.$$INSTANCE, new a(kk0Var));
        kk0Var.r(false);
        return cVar2;
    }

    public static final c d(ck0 ck0Var, c cVar) {
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.a0(439770924);
        c cVarC = c(kk0Var, cVar);
        kk0Var.r(false);
        return cVarC;
    }
}
