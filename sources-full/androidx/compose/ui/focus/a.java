package androidx.compose.ui.focus;

import androidx.compose.ui.c;
import defpackage.le1;
import defpackage.za1;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final c a(c cVar, za1 za1Var) {
        return cVar.then(new FocusRequesterElement(za1Var));
    }

    public static final c b(c cVar, le1 le1Var) {
        return cVar.then(new FocusChangedElement(le1Var));
    }
}
