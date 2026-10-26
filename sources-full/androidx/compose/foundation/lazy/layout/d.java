package androidx.compose.foundation.lazy.layout;

import defpackage.ck0;
import defpackage.g12;
import defpackage.je1;
import defpackage.nq2;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public static final androidx.compose.ui.c lazyLayoutSemantics(androidx.compose.ui.c cVar, je1 je1Var, g12 g12Var, nq2 nq2Var, boolean z, boolean z2, ck0 ck0Var, int i) {
        return cVar.then(new LazyLayoutSemanticsModifier(je1Var, g12Var, nq2Var, z, z2));
    }
}
