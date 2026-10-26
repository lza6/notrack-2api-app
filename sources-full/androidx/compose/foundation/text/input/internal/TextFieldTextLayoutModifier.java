package androidx.compose.foundation.text.input.internal;

import androidx.compose.ui.platform.InspectorInfo;
import defpackage.aw3;
import defpackage.az3;
import defpackage.bw3;
import defpackage.cy3;
import defpackage.kr1;
import defpackage.ne1;
import defpackage.of2;
import defpackage.tf2;
import defpackage.ud2;
import defpackage.uz3;
import defpackage.yv1;

/* JADX INFO: loaded from: classes.dex */
public final class TextFieldTextLayoutModifier extends tf2 {
    public final az3 c;
    public final c d;
    public final uz3 h;
    public final boolean l;
    public final ne1 m;
    public final yv1 n;

    public TextFieldTextLayoutModifier(az3 az3Var, c cVar, uz3 uz3Var, boolean z, ne1 ne1Var, yv1 yv1Var) {
        this.c = az3Var;
        this.d = cVar;
        this.h = uz3Var;
        this.l = z;
        this.m = ne1Var;
        this.n = yv1Var;
    }

    @Override // defpackage.tf2
    public final of2 create() {
        cy3 cy3Var = new cy3();
        az3 az3Var = this.c;
        cy3Var.c = az3Var;
        boolean z = this.l;
        cy3Var.d = z;
        az3Var.b = this.m;
        boolean z2 = !z;
        bw3 bw3Var = az3Var.a;
        bw3Var.getClass();
        bw3Var.c.setValue(new aw3(this.d, this.h, z, z2, this.n.c == 4));
        return cy3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextFieldTextLayoutModifier)) {
            return false;
        }
        TextFieldTextLayoutModifier textFieldTextLayoutModifier = (TextFieldTextLayoutModifier) obj;
        return kr1.n(this.c, textFieldTextLayoutModifier.c) && kr1.n(this.d, textFieldTextLayoutModifier.d) && kr1.n(this.h, textFieldTextLayoutModifier.h) && this.l == textFieldTextLayoutModifier.l && kr1.n(this.m, textFieldTextLayoutModifier.m) && this.n.equals(textFieldTextLayoutModifier.n);
    }

    public final int hashCode() {
        int iK = ud2.k((this.h.hashCode() + ((this.d.hashCode() + (this.c.hashCode() * 31)) * 31)) * 31, 31, this.l);
        ne1 ne1Var = this.m;
        return this.n.hashCode() + ((iK + (ne1Var == null ? 0 : ne1Var.hashCode())) * 31);
    }

    @Override // defpackage.tf2
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
    }

    public final String toString() {
        return "TextFieldTextLayoutModifier(textLayoutState=" + this.c + ", textFieldState=" + this.d + ", textStyle=" + this.h + ", singleLine=" + this.l + ", onTextLayout=" + this.m + ", keyboardOptions=" + this.n + ')';
    }

    @Override // defpackage.tf2
    public final void update(of2 of2Var) {
        cy3 cy3Var = (cy3) of2Var;
        az3 az3Var = this.c;
        cy3Var.c = az3Var;
        az3Var.b = this.m;
        boolean z = this.l;
        cy3Var.d = z;
        boolean z2 = !z;
        bw3 bw3Var = az3Var.a;
        bw3Var.getClass();
        bw3Var.c.setValue(new aw3(this.d, this.h, z, z2, this.n.c == 4));
    }
}
