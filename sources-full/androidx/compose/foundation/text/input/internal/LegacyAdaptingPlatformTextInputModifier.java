package androidx.compose.foundation.text.input.internal;

import androidx.compose.ui.platform.InspectorInfo;
import defpackage.kr1;
import defpackage.of2;
import defpackage.rb;
import defpackage.so1;
import defpackage.t22;
import defpackage.tf2;
import defpackage.xw3;
import defpackage.z22;

/* JADX INFO: loaded from: classes.dex */
final class LegacyAdaptingPlatformTextInputModifier extends tf2 {
    public final rb c;
    public final z22 d;
    public final xw3 h;

    public LegacyAdaptingPlatformTextInputModifier(rb rbVar, z22 z22Var, xw3 xw3Var) {
        this.c = rbVar;
        this.d = z22Var;
        this.h = xw3Var;
    }

    @Override // defpackage.tf2
    public final of2 create() {
        return new t22(this.c, this.d, this.h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LegacyAdaptingPlatformTextInputModifier) {
            LegacyAdaptingPlatformTextInputModifier legacyAdaptingPlatformTextInputModifier = (LegacyAdaptingPlatformTextInputModifier) obj;
            return kr1.n(this.c, legacyAdaptingPlatformTextInputModifier.c) && this.d == legacyAdaptingPlatformTextInputModifier.d && this.h == legacyAdaptingPlatformTextInputModifier.h;
        }
        return false;
    }

    public final int hashCode() {
        return this.h.hashCode() + ((this.d.hashCode() + (this.c.hashCode() * 31)) * 31);
    }

    @Override // defpackage.tf2
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
    }

    public final String toString() {
        return "LegacyAdaptingPlatformTextInputModifier(serviceAdapter=" + this.c + ", legacyTextFieldState=" + this.d + ", textFieldSelectionManager=" + this.h + ')';
    }

    @Override // defpackage.tf2
    public final void update(of2 of2Var) throws Throwable {
        t22 t22Var = (t22) of2Var;
        if (t22Var.isAttached()) {
            t22Var.c.g();
            t22Var.c.k(t22Var);
        }
        t22Var.c = this.c;
        if (t22Var.isAttached()) {
            rb rbVar = t22Var.c;
            if (rbVar.a != null) {
                so1.c("Expected textInputModifierNode to be null");
            }
            rbVar.a = t22Var;
        }
        t22Var.d = this.d;
        t22Var.h = this.h;
    }
}
