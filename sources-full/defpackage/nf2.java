package defpackage;

import androidx.compose.ui.c;

/* JADX INFO: loaded from: classes.dex */
public interface nf2 extends c {
    @Override // androidx.compose.ui.c
    default boolean all(le1 le1Var) {
        return ((Boolean) le1Var.invoke(this)).booleanValue();
    }

    @Override // androidx.compose.ui.c
    default Object foldIn(Object obj, ne1 ne1Var) {
        return ne1Var.invoke(obj, this);
    }
}
