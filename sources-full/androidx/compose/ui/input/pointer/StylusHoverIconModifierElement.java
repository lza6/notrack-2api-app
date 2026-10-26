package androidx.compose.ui.input.pointer;

import androidx.compose.ui.platform.InspectorInfo;
import defpackage.cp3;
import defpackage.kr1;
import defpackage.nc;
import defpackage.of2;
import defpackage.tf2;
import defpackage.ud2;
import defpackage.vx0;
import defpackage.y64;

/* JADX INFO: loaded from: classes.dex */
public final class StylusHoverIconModifierElement extends tf2 {
    public final vx0 c;

    public StylusHoverIconModifierElement(vx0 vx0Var) {
        this.c = vx0Var;
    }

    @Override // defpackage.tf2
    public final of2 create() {
        return new cp3(y64.k, this.c);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StylusHoverIconModifierElement)) {
            return false;
        }
        StylusHoverIconModifierElement stylusHoverIconModifierElement = (StylusHoverIconModifierElement) obj;
        nc ncVar = y64.k;
        return ncVar.equals(ncVar) && kr1.n(this.c, stylusHoverIconModifierElement.c);
    }

    public final int hashCode() {
        int iK = ud2.k(1022 * 31, 31, false);
        vx0 vx0Var = this.c;
        return iK + (vx0Var != null ? vx0Var.hashCode() : 0);
    }

    @Override // defpackage.tf2
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("stylusHoverIcon");
        inspectorInfo.getProperties().set("icon", y64.k);
        inspectorInfo.getProperties().set("overrideDescendants", Boolean.FALSE);
        inspectorInfo.getProperties().set("touchBoundsExpansion", this.c);
    }

    public final String toString() {
        return "StylusHoverIconModifierElement(icon=" + y64.k + ", overrideDescendants=false, touchBoundsExpansion=" + this.c + ')';
    }

    @Override // defpackage.tf2
    public final void update(of2 of2Var) {
        cp3 cp3Var = (cp3) of2Var;
        nc ncVar = y64.k;
        if (!kr1.n(cp3Var.d, ncVar)) {
            cp3Var.d = ncVar;
            if (cp3Var.h) {
                cp3Var.x0();
            }
        }
        cp3Var.c = this.c;
    }
}
