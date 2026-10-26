package androidx.compose.foundation.text.input.internal;

import defpackage.rb;
import defpackage.xw3;
import defpackage.z22;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final androidx.compose.ui.c a(androidx.compose.ui.c cVar, rb rbVar, z22 z22Var, xw3 xw3Var) {
        return cVar.then(new LegacyAdaptingPlatformTextInputModifier(rbVar, z22Var, xw3Var));
    }
}
