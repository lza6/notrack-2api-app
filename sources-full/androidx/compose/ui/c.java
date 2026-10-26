package androidx.compose.ui;

import defpackage.le1;
import defpackage.ne1;
import defpackage.uf0;

/* JADX INFO: loaded from: classes.dex */
public interface c {
    public static final Modifier$Companion i = Modifier$Companion.$$INSTANCE;

    boolean all(le1 le1Var);

    Object foldIn(Object obj, ne1 ne1Var);

    default c then(c cVar) {
        return cVar == Modifier$Companion.$$INSTANCE ? this : new uf0(this, cVar);
    }
}
