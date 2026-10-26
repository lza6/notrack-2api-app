package androidx.compose.foundation.text.handwriting;

import androidx.compose.ui.c;
import androidx.compose.ui.input.pointer.StylusHoverIconModifierElement;
import defpackage.bp3;
import defpackage.je1;
import defpackage.vx0;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final vx0 a = new vx0();

    public static final c a(c cVar, boolean z, boolean z2, je1 je1Var) {
        if (!z || !bp3.a) {
            return cVar;
        }
        if (z2) {
            cVar = cVar.then(new StylusHoverIconModifierElement(a));
        }
        return cVar.then(new StylusHandwritingElement(je1Var));
    }
}
