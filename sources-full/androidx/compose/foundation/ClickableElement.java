package androidx.compose.foundation;

import androidx.compose.ui.platform.InspectorInfo;
import defpackage.ao1;
import defpackage.gd0;
import defpackage.gh2;
import defpackage.je1;
import defpackage.kr1;
import defpackage.n73;
import defpackage.of2;
import defpackage.tf2;
import defpackage.ud2;

/* JADX INFO: loaded from: classes.dex */
final class ClickableElement extends tf2 {
    public final gh2 c;
    public final ao1 d;
    public final boolean h;
    public final String l;
    public final n73 m;
    public final je1 n;

    public ClickableElement(gh2 gh2Var, ao1 ao1Var, boolean z, String str, n73 n73Var, je1 je1Var) {
        this.c = gh2Var;
        this.d = ao1Var;
        this.h = z;
        this.l = str;
        this.m = n73Var;
        this.n = je1Var;
    }

    @Override // defpackage.tf2
    public final of2 create() {
        return new gd0(this.c, this.d, this.h, this.l, this.m, this.n);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ClickableElement.class != obj.getClass()) {
            return false;
        }
        ClickableElement clickableElement = (ClickableElement) obj;
        return kr1.n(this.c, clickableElement.c) && kr1.n(this.d, clickableElement.d) && this.h == clickableElement.h && kr1.n(this.l, clickableElement.l) && kr1.n(this.m, clickableElement.m) && this.n == clickableElement.n;
    }

    public final int hashCode() {
        gh2 gh2Var = this.c;
        int iHashCode = (gh2Var != null ? gh2Var.hashCode() : 0) * 31;
        ao1 ao1Var = this.d;
        int iK = ud2.k((iHashCode + (ao1Var != null ? ao1Var.hashCode() : 0)) * 31, 31, this.h);
        String str = this.l;
        int iHashCode2 = (iK + (str != null ? str.hashCode() : 0)) * 31;
        n73 n73Var = this.m;
        return this.n.hashCode() + ((iHashCode2 + (n73Var != null ? Integer.hashCode(n73Var.a) : 0)) * 31);
    }

    @Override // defpackage.tf2
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("clickable");
        inspectorInfo.getProperties().set("enabled", Boolean.valueOf(this.h));
        inspectorInfo.getProperties().set("onClick", this.n);
        inspectorInfo.getProperties().set("onClickLabel", this.l);
        inspectorInfo.getProperties().set("role", this.m);
        inspectorInfo.getProperties().set("interactionSource", this.c);
        inspectorInfo.getProperties().set("indicationNodeFactory", this.d);
    }

    @Override // defpackage.tf2
    public final void update(of2 of2Var) {
        ((gd0) of2Var).F0(this.c, this.d, this.h, this.l, this.m, this.n);
    }
}
