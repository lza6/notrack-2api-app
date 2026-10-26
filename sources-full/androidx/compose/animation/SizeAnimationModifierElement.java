package androidx.compose.animation;

import androidx.compose.ui.platform.InspectorInfo;
import defpackage.ei3;
import defpackage.of2;
import defpackage.t64;
import defpackage.tf2;
import defpackage.yt;

/* JADX INFO: loaded from: classes.dex */
final class SizeAnimationModifierElement extends tf2 {
    public final t64 c;
    public final yt d;

    public SizeAnimationModifierElement(t64 t64Var, yt ytVar) {
        this.c = t64Var;
        this.d = ytVar;
    }

    @Override // defpackage.tf2
    public final of2 create() {
        return new ei3(this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SizeAnimationModifierElement)) {
            return false;
        }
        SizeAnimationModifierElement sizeAnimationModifierElement = (SizeAnimationModifierElement) obj;
        return this.c.equals(sizeAnimationModifierElement.c) && this.d.equals(sizeAnimationModifierElement.d);
    }

    public final int hashCode() {
        return (this.d.hashCode() + (this.c.hashCode() * 31)) * 31;
    }

    @Override // defpackage.tf2
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("animateContentSize");
        inspectorInfo.getProperties().set("animationSpec", this.c);
        inspectorInfo.getProperties().set("alignment", this.d);
        inspectorInfo.getProperties().set("finishedListener", null);
    }

    public final String toString() {
        return "SizeAnimationModifierElement(animationSpec=" + this.c + ", alignment=" + this.d + ", finishedListener=null)";
    }

    @Override // defpackage.tf2
    public final void update(of2 of2Var) {
        ei3 ei3Var = (ei3) of2Var;
        ei3Var.c = this.c;
        ei3Var.d = this.d;
    }
}
