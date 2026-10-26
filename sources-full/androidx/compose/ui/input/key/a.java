package androidx.compose.ui.input.key;

import androidx.compose.ui.c;
import defpackage.le1;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final c a(c cVar, le1 le1Var) {
        return cVar.then(new KeyInputElement(le1Var, null));
    }

    public static final c b(c cVar, le1 le1Var) {
        return cVar.then(new KeyInputElement(null, le1Var));
    }
}
