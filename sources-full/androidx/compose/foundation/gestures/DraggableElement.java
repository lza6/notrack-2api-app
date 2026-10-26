package androidx.compose.foundation.gestures;

import androidx.compose.ui.platform.InspectorInfo;
import defpackage.gh2;
import defpackage.iz0;
import defpackage.kr1;
import defpackage.mz0;
import defpackage.nq2;
import defpackage.nz0;
import defpackage.oe1;
import defpackage.of2;
import defpackage.sx;
import defpackage.tf2;
import defpackage.ud2;

/* JADX INFO: loaded from: classes.dex */
public final class DraggableElement extends tf2 {
    public final nz0 c;
    public final nq2 d;
    public final boolean h;
    public final gh2 l;
    public final boolean m;
    public final oe1 n;
    public final oe1 o;
    public final boolean p;

    public DraggableElement(nz0 nz0Var, nq2 nq2Var, boolean z, gh2 gh2Var, boolean z2, iz0 iz0Var, oe1 oe1Var, boolean z3) {
        this.c = nz0Var;
        this.d = nq2Var;
        this.h = z;
        this.l = gh2Var;
        this.m = z2;
        this.n = iz0Var;
        this.o = oe1Var;
        this.p = z3;
    }

    @Override // defpackage.tf2
    public final of2 create() {
        sx sxVar = sx.w;
        boolean z = this.h;
        gh2 gh2Var = this.l;
        nq2 nq2Var = this.d;
        mz0 mz0Var = new mz0(sxVar, z, gh2Var, nq2Var);
        mz0Var.s = this.c;
        mz0Var.t = nq2Var;
        mz0Var.u = this.m;
        mz0Var.v = this.n;
        mz0Var.w = this.o;
        mz0Var.x = this.p;
        return mz0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DraggableElement.class != obj.getClass()) {
            return false;
        }
        DraggableElement draggableElement = (DraggableElement) obj;
        return kr1.n(this.c, draggableElement.c) && this.d == draggableElement.d && this.h == draggableElement.h && kr1.n(this.l, draggableElement.l) && this.m == draggableElement.m && kr1.n(this.n, draggableElement.n) && kr1.n(this.o, draggableElement.o) && this.p == draggableElement.p;
    }

    public final int hashCode() {
        int iK = ud2.k((this.d.hashCode() + (this.c.hashCode() * 31)) * 31, 31, this.h);
        gh2 gh2Var = this.l;
        return Boolean.hashCode(this.p) + ((this.o.hashCode() + ((this.n.hashCode() + ud2.k((iK + (gh2Var != null ? gh2Var.hashCode() : 0)) * 31, 31, this.m)) * 31)) * 31);
    }

    @Override // defpackage.tf2
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("draggable");
        inspectorInfo.getProperties().set("orientation", this.d);
        inspectorInfo.getProperties().set("enabled", Boolean.valueOf(this.h));
        inspectorInfo.getProperties().set("reverseDirection", Boolean.valueOf(this.p));
        inspectorInfo.getProperties().set("interactionSource", this.l);
        inspectorInfo.getProperties().set("startDragImmediately", Boolean.valueOf(this.m));
        inspectorInfo.getProperties().set("onDragStarted", this.n);
        inspectorInfo.getProperties().set("onDragStopped", this.o);
        inspectorInfo.getProperties().set("state", this.c);
    }

    @Override // defpackage.tf2
    public final void update(of2 of2Var) {
        boolean z;
        boolean z2;
        mz0 mz0Var = (mz0) of2Var;
        sx sxVar = sx.w;
        nz0 nz0Var = mz0Var.s;
        nz0 nz0Var2 = this.c;
        if (kr1.n(nz0Var, nz0Var2)) {
            z = false;
        } else {
            mz0Var.s = nz0Var2;
            z = true;
        }
        nq2 nq2Var = mz0Var.t;
        nq2 nq2Var2 = this.d;
        if (nq2Var != nq2Var2) {
            mz0Var.t = nq2Var2;
            z = true;
        }
        boolean z3 = mz0Var.x;
        boolean z4 = this.p;
        if (z3 != z4) {
            mz0Var.x = z4;
            z2 = true;
        } else {
            z2 = z;
        }
        mz0Var.v = this.n;
        mz0Var.w = this.o;
        mz0Var.u = this.m;
        mz0Var.G0(sxVar, this.h, this.l, nq2Var2, z2);
    }
}
