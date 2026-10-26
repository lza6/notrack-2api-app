package androidx.compose.foundation.text.input.internal;

import defpackage.fe0;
import defpackage.je1;
import defpackage.se3;
import defpackage.ww1;

/* JADX INFO: loaded from: classes.dex */
public final class b extends ww1 implements je1 {
    public final /* synthetic */ c c;
    public final /* synthetic */ fe0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, fe0 fe0Var) {
        super(0);
        this.c = cVar;
        this.d = fe0Var;
    }

    @Override // defpackage.je1
    public final Object invoke() {
        c cVar = this.c;
        return TransformedTextFieldState$Companion.access$calculateTransformedText(cVar.a.b(), this.d, (se3) cVar.d.getValue());
    }
}
