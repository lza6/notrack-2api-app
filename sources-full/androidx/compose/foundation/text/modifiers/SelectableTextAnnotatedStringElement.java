package androidx.compose.foundation.text.modifiers;

import androidx.compose.ui.platform.InspectorInfo;
import defpackage.av1;
import defpackage.dd3;
import defpackage.fq2;
import defpackage.hg;
import defpackage.kb1;
import defpackage.kr1;
import defpackage.le1;
import defpackage.of2;
import defpackage.ot3;
import defpackage.sd3;
import defpackage.tf2;
import defpackage.ud2;
import defpackage.uz3;
import defpackage.xe0;
import defpackage.y64;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class SelectableTextAnnotatedStringElement extends tf2 {
    public final hg c;
    public final uz3 d;
    public final kb1 h;
    public final le1 l;
    public final int m;
    public final boolean n;
    public final int o;
    public final int p;
    public final List q;
    public final le1 r;
    public final sd3 s;
    public final xe0 t;

    public SelectableTextAnnotatedStringElement(hg hgVar, uz3 uz3Var, kb1 kb1Var, le1 le1Var, int i, boolean z, int i2, int i3, List list, le1 le1Var2, sd3 sd3Var, xe0 xe0Var) {
        this.c = hgVar;
        this.d = uz3Var;
        this.h = kb1Var;
        this.l = le1Var;
        this.m = i;
        this.n = z;
        this.o = i2;
        this.p = i3;
        this.q = list;
        this.r = le1Var2;
        this.s = sd3Var;
        this.t = xe0Var;
    }

    @Override // defpackage.tf2
    public final of2 create() {
        return new dd3(this.c, this.d, this.h, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectableTextAnnotatedStringElement)) {
            return false;
        }
        SelectableTextAnnotatedStringElement selectableTextAnnotatedStringElement = (SelectableTextAnnotatedStringElement) obj;
        return kr1.n(this.t, selectableTextAnnotatedStringElement.t) && kr1.n(this.c, selectableTextAnnotatedStringElement.c) && kr1.n(this.d, selectableTextAnnotatedStringElement.d) && kr1.n(this.q, selectableTextAnnotatedStringElement.q) && kr1.n(this.h, selectableTextAnnotatedStringElement.h) && this.l == selectableTextAnnotatedStringElement.l && this.m == selectableTextAnnotatedStringElement.m && this.n == selectableTextAnnotatedStringElement.n && this.o == selectableTextAnnotatedStringElement.o && this.p == selectableTextAnnotatedStringElement.p && this.r == selectableTextAnnotatedStringElement.r && kr1.n(this.s, selectableTextAnnotatedStringElement.s);
    }

    public final int hashCode() {
        int iHashCode = (this.h.hashCode() + ((this.d.hashCode() + (this.c.hashCode() * 31)) * 31)) * 31;
        le1 le1Var = this.l;
        int iK = (((ud2.k(fq2.e(this.m, (iHashCode + (le1Var != null ? le1Var.hashCode() : 0)) * 31, 31), 31, this.n) + this.o) * 31) + this.p) * 31;
        List list = this.q;
        int iHashCode2 = (iK + (list != null ? list.hashCode() : 0)) * 31;
        le1 le1Var2 = this.r;
        int iHashCode3 = (iHashCode2 + (le1Var2 != null ? le1Var2.hashCode() : 0)) * 31;
        sd3 sd3Var = this.s;
        int iHashCode4 = (iHashCode3 + (sd3Var != null ? sd3Var.hashCode() : 0)) * 961;
        xe0 xe0Var = this.t;
        return iHashCode4 + (xe0Var != null ? xe0Var.hashCode() : 0);
    }

    @Override // defpackage.tf2
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
    }

    public final String toString() {
        return "SelectableTextAnnotatedStringElement(text=" + ((Object) this.c) + ", style=" + this.d + ", fontFamilyResolver=" + this.h + ", onTextLayout=" + this.l + ", overflow=" + ((Object) av1.N(this.m)) + ", softWrap=" + this.n + ", maxLines=" + this.o + ", minLines=" + this.p + ", placeholders=" + this.q + ", onPlaceholderLayout=" + this.r + ", selectionController=" + this.s + ", color=" + this.t + ", autoSize=null)";
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0026  */
    @Override // defpackage.tf2
    public final void update(of2 of2Var) {
        boolean z;
        dd3 dd3Var = (dd3) of2Var;
        ot3 ot3Var = dd3Var.l;
        xe0 xe0Var = ot3Var.t;
        xe0 xe0Var2 = this.t;
        boolean zN = kr1.n(xe0Var2, xe0Var);
        ot3Var.t = xe0Var2;
        uz3 uz3Var = this.d;
        if (zN) {
            uz3 uz3Var2 = ot3Var.d;
            if (uz3Var == uz3Var2) {
                uz3Var.getClass();
            } else if (!uz3Var.a.b(uz3Var2.a)) {
                z = true;
            }
            z = false;
        } else {
            z = true;
        }
        boolean zB0 = ot3Var.B0(this.c);
        boolean zA0 = dd3Var.l.A0(uz3Var, this.q, this.p, this.o, this.n, this.h, this.m);
        le1 le1Var = this.l;
        le1 le1Var2 = this.r;
        sd3 sd3Var = this.s;
        ot3Var.w0(z, zB0, zA0, ot3Var.z0(le1Var, le1Var2, sd3Var, null));
        dd3Var.h = sd3Var;
        y64.M(dd3Var).C();
    }
}
