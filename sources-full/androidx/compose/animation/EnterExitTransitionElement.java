package androidx.compose.animation;

import androidx.compose.ui.platform.InspectorInfo;
import defpackage.hg1;
import defpackage.j41;
import defpackage.je1;
import defpackage.k41;
import defpackage.k54;
import defpackage.kr1;
import defpackage.o54;
import defpackage.of2;
import defpackage.tf2;
import defpackage.x51;

/* JADX INFO: loaded from: classes.dex */
final class EnterExitTransitionElement extends tf2 {
    public final o54 c;
    public final k54 d;
    public final k54 h;
    public final k54 l;
    public final k41 m;
    public final x51 n;
    public final je1 o;
    public final hg1 p;

    public EnterExitTransitionElement(o54 o54Var, k54 k54Var, k54 k54Var2, k54 k54Var3, k41 k41Var, x51 x51Var, je1 je1Var, hg1 hg1Var) {
        this.c = o54Var;
        this.d = k54Var;
        this.h = k54Var2;
        this.l = k54Var3;
        this.m = k41Var;
        this.n = x51Var;
        this.o = je1Var;
        this.p = hg1Var;
    }

    @Override // defpackage.tf2
    public final of2 create() {
        return new j41(this.c, this.d, this.h, this.l, this.m, this.n, this.o, this.p);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EnterExitTransitionElement)) {
            return false;
        }
        EnterExitTransitionElement enterExitTransitionElement = (EnterExitTransitionElement) obj;
        return kr1.n(this.c, enterExitTransitionElement.c) && kr1.n(this.d, enterExitTransitionElement.d) && kr1.n(this.h, enterExitTransitionElement.h) && kr1.n(this.l, enterExitTransitionElement.l) && this.m.equals(enterExitTransitionElement.m) && kr1.n(this.n, enterExitTransitionElement.n) && kr1.n(this.o, enterExitTransitionElement.o) && kr1.n(this.p, enterExitTransitionElement.p);
    }

    public final int hashCode() {
        int iHashCode = this.c.hashCode() * 31;
        k54 k54Var = this.d;
        int iHashCode2 = (iHashCode + (k54Var == null ? 0 : k54Var.hashCode())) * 31;
        k54 k54Var2 = this.h;
        int iHashCode3 = (iHashCode2 + (k54Var2 == null ? 0 : k54Var2.hashCode())) * 31;
        k54 k54Var3 = this.l;
        return this.p.hashCode() + ((this.o.hashCode() + ((this.n.hashCode() + ((this.m.hashCode() + ((iHashCode3 + (k54Var3 != null ? k54Var3.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }

    @Override // defpackage.tf2
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("enterExitTransition");
        inspectorInfo.getProperties().set("transition", this.c);
        inspectorInfo.getProperties().set("sizeAnimation", this.d);
        inspectorInfo.getProperties().set("offsetAnimation", this.h);
        inspectorInfo.getProperties().set("slideAnimation", this.l);
        inspectorInfo.getProperties().set("enter", this.m);
        inspectorInfo.getProperties().set("exit", this.n);
        inspectorInfo.getProperties().set("graphicsLayerBlock", this.p);
    }

    public final String toString() {
        return "EnterExitTransitionElement(transition=" + this.c + ", sizeAnimation=" + this.d + ", offsetAnimation=" + this.h + ", slideAnimation=" + this.l + ", enter=" + this.m + ", exit=" + this.n + ", isEnabled=" + this.o + ", graphicsLayerBlock=" + this.p + ')';
    }

    @Override // defpackage.tf2
    public final void update(of2 of2Var) {
        j41 j41Var = (j41) of2Var;
        j41Var.c = this.c;
        j41Var.d = this.d;
        j41Var.h = this.h;
        j41Var.l = this.l;
        j41Var.m = this.m;
        j41Var.n = this.n;
        j41Var.o = this.o;
        j41Var.p = this.p;
    }
}
