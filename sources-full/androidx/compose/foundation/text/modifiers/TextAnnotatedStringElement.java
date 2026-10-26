package androidx.compose.foundation.text.modifiers;

import androidx.compose.ui.platform.InspectorInfo;
import defpackage.fq2;
import defpackage.hg;
import defpackage.kb1;
import defpackage.kr1;
import defpackage.le1;
import defpackage.of2;
import defpackage.ot3;
import defpackage.tf2;
import defpackage.ud2;
import defpackage.uz3;
import defpackage.xe0;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class TextAnnotatedStringElement extends tf2 {
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
    public final xe0 s;
    public final le1 t;

    public TextAnnotatedStringElement(hg hgVar, uz3 uz3Var, kb1 kb1Var, le1 le1Var, int i, boolean z, int i2, int i3, List list, le1 le1Var2, xe0 xe0Var, le1 le1Var3) {
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
        this.s = xe0Var;
        this.t = le1Var3;
    }

    @Override // defpackage.tf2
    public final of2 create() {
        return new ot3(this.c, this.d, this.h, this.l, this.m, this.n, this.o, this.p, this.q, this.r, null, this.s, this.t);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextAnnotatedStringElement)) {
            return false;
        }
        TextAnnotatedStringElement textAnnotatedStringElement = (TextAnnotatedStringElement) obj;
        return kr1.n(this.s, textAnnotatedStringElement.s) && kr1.n(this.c, textAnnotatedStringElement.c) && kr1.n(this.d, textAnnotatedStringElement.d) && kr1.n(this.q, textAnnotatedStringElement.q) && kr1.n(this.h, textAnnotatedStringElement.h) && this.l == textAnnotatedStringElement.l && this.t == textAnnotatedStringElement.t && this.m == textAnnotatedStringElement.m && this.n == textAnnotatedStringElement.n && this.o == textAnnotatedStringElement.o && this.p == textAnnotatedStringElement.p && this.r == textAnnotatedStringElement.r;
    }

    public final int hashCode() {
        int iHashCode = (this.h.hashCode() + ((this.d.hashCode() + (this.c.hashCode() * 31)) * 31)) * 31;
        le1 le1Var = this.l;
        int iK = (((ud2.k(fq2.e(this.m, (iHashCode + (le1Var != null ? le1Var.hashCode() : 0)) * 31, 31), 31, this.n) + this.o) * 31) + this.p) * 31;
        List list = this.q;
        int iHashCode2 = (iK + (list != null ? list.hashCode() : 0)) * 31;
        le1 le1Var2 = this.r;
        int iHashCode3 = (iHashCode2 + (le1Var2 != null ? le1Var2.hashCode() : 0)) * 961;
        xe0 xe0Var = this.s;
        int iHashCode4 = (iHashCode3 + (xe0Var != null ? xe0Var.hashCode() : 0)) * 31;
        le1 le1Var3 = this.t;
        return iHashCode4 + (le1Var3 != null ? le1Var3.hashCode() : 0);
    }

    @Override // defpackage.tf2
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0025  */
    @Override // defpackage.tf2
    public final void update(of2 of2Var) {
        boolean z;
        ot3 ot3Var = (ot3) of2Var;
        xe0 xe0Var = ot3Var.t;
        xe0 xe0Var2 = this.s;
        boolean zN = kr1.n(xe0Var2, xe0Var);
        ot3Var.t = xe0Var2;
        if (zN) {
            uz3 uz3Var = ot3Var.d;
            uz3 uz3Var2 = this.d;
            if (uz3Var2 == uz3Var) {
                uz3Var2.getClass();
            } else if (!uz3Var2.a.b(uz3Var.a)) {
                z = true;
            }
            z = false;
        } else {
            z = true;
        }
        ot3Var.w0(z, ot3Var.B0(this.c), ot3Var.A0(this.d, this.q, this.p, this.o, this.n, this.h, this.m), ot3Var.z0(this.l, this.r, null, this.t));
    }
}
