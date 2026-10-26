package androidx.compose.ui.layout;

import androidx.compose.ui.c;
import defpackage.fx1;
import defpackage.le1;
import defpackage.oe1;
import defpackage.qb2;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final Object a(qb2 qb2Var) {
        Object objI = qb2Var.i();
        fx1 fx1Var = objI instanceof fx1 ? (fx1) objI : null;
        if (fx1Var != null) {
            return fx1Var.c;
        }
        return null;
    }

    public static final c b(c cVar, oe1 oe1Var) {
        return cVar.then(new LayoutElement(oe1Var));
    }

    public static final c c(c cVar, Object obj) {
        return cVar.then(new LayoutIdElement(obj));
    }

    public static final c d(c cVar, le1 le1Var) {
        return cVar.then(new OnGloballyPositionedElement(le1Var));
    }

    public static final c e(c cVar, le1 le1Var) {
        return cVar.then(new OnSizeChangedModifier(le1Var));
    }
}
