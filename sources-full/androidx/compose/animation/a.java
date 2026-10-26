package androidx.compose.animation;

import androidx.compose.ui.Alignment$Companion;
import androidx.compose.ui.c;
import defpackage.t64;
import defpackage.xr0;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static c a(c cVar, t64 t64Var) {
        return xr0.O(cVar).then(new SizeAnimationModifierElement(t64Var, Alignment$Companion.getTopStart()));
    }
}
