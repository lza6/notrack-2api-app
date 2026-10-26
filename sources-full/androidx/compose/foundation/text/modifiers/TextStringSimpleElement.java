package androidx.compose.foundation.text.modifiers;

import androidx.compose.ui.platform.InspectorInfo;
import defpackage.fq2;
import defpackage.kb1;
import defpackage.kr1;
import defpackage.of2;
import defpackage.tf2;
import defpackage.tz3;
import defpackage.ud2;
import defpackage.uz3;
import defpackage.vs2;
import defpackage.xe0;
import defpackage.y64;

/* JADX INFO: loaded from: classes.dex */
public final class TextStringSimpleElement extends tf2 {
    public final String c;
    public final uz3 d;
    public final kb1 h;
    public final int l;
    public final boolean m;
    public final int n;
    public final int o;
    public final xe0 p;

    public TextStringSimpleElement(String str, uz3 uz3Var, kb1 kb1Var, int i, boolean z, int i2, int i3, xe0 xe0Var) {
        this.c = str;
        this.d = uz3Var;
        this.h = kb1Var;
        this.l = i;
        this.m = z;
        this.n = i2;
        this.o = i3;
        this.p = xe0Var;
    }

    @Override // defpackage.tf2
    public final of2 create() {
        tz3 tz3Var = new tz3();
        tz3Var.c = this.c;
        tz3Var.d = this.d;
        tz3Var.h = this.h;
        tz3Var.l = this.l;
        tz3Var.m = this.m;
        tz3Var.n = this.n;
        tz3Var.o = this.o;
        tz3Var.p = this.p;
        return tz3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextStringSimpleElement)) {
            return false;
        }
        TextStringSimpleElement textStringSimpleElement = (TextStringSimpleElement) obj;
        return kr1.n(this.p, textStringSimpleElement.p) && kr1.n(this.c, textStringSimpleElement.c) && kr1.n(this.d, textStringSimpleElement.d) && kr1.n(this.h, textStringSimpleElement.h) && this.l == textStringSimpleElement.l && this.m == textStringSimpleElement.m && this.n == textStringSimpleElement.n && this.o == textStringSimpleElement.o;
    }

    public final int hashCode() {
        int iK = (((ud2.k(fq2.e(this.l, (this.h.hashCode() + ((this.d.hashCode() + (this.c.hashCode() * 31)) * 31)) * 31, 31), 31, this.m) + this.n) * 31) + this.o) * 31;
        xe0 xe0Var = this.p;
        return iK + (xe0Var != null ? xe0Var.hashCode() : 0);
    }

    @Override // defpackage.tf2
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0026  */
    @Override // defpackage.tf2
    public final void update(of2 of2Var) {
        boolean z;
        tz3 tz3Var = (tz3) of2Var;
        xe0 xe0Var = tz3Var.p;
        xe0 xe0Var2 = this.p;
        boolean zN = kr1.n(xe0Var2, xe0Var);
        tz3Var.p = xe0Var2;
        boolean z2 = false;
        boolean z3 = true;
        uz3 uz3Var = this.d;
        if (zN) {
            uz3 uz3Var2 = tz3Var.d;
            if (uz3Var == uz3Var2) {
                uz3Var.getClass();
            } else if (!uz3Var.a.b(uz3Var2.a)) {
                z = true;
            }
            z = false;
        } else {
            z = true;
        }
        String str = tz3Var.c;
        String str2 = this.c;
        if (!kr1.n(str, str2)) {
            tz3Var.c = str2;
            tz3Var.t = null;
            z2 = true;
        }
        boolean z4 = !tz3Var.d.c(uz3Var);
        tz3Var.d = uz3Var;
        int i = tz3Var.o;
        int i2 = this.o;
        if (i != i2) {
            tz3Var.o = i2;
            z4 = true;
        }
        int i3 = tz3Var.n;
        int i4 = this.n;
        if (i3 != i4) {
            tz3Var.n = i4;
            z4 = true;
        }
        boolean z5 = tz3Var.m;
        boolean z6 = this.m;
        if (z5 != z6) {
            tz3Var.m = z6;
            z4 = true;
        }
        kb1 kb1Var = tz3Var.h;
        kb1 kb1Var2 = this.h;
        if (!kr1.n(kb1Var, kb1Var2)) {
            tz3Var.h = kb1Var2;
            z4 = true;
        }
        int i5 = tz3Var.l;
        int i6 = this.l;
        if (i5 == i6) {
            z3 = z4;
        } else {
            tz3Var.l = i6;
        }
        if (z2 || z3) {
            vs2 vs2VarW0 = tz3Var.w0();
            String str3 = tz3Var.c;
            uz3 uz3Var3 = tz3Var.d;
            kb1 kb1Var3 = tz3Var.h;
            int i7 = tz3Var.l;
            boolean z7 = tz3Var.m;
            int i8 = tz3Var.n;
            int i9 = tz3Var.o;
            vs2VarW0.a = str3;
            vs2VarW0.b = uz3Var3;
            vs2VarW0.c = kb1Var3;
            vs2VarW0.d = i7;
            vs2VarW0.e = z7;
            vs2VarW0.f = i8;
            vs2VarW0.g = i9;
            vs2VarW0.b();
        }
        if (tz3Var.isAttached()) {
            if (z2 || (z && tz3Var.s != null)) {
                y64.M(tz3Var).D();
            }
            if (z2 || z3) {
                y64.M(tz3Var).C();
                kr1.O(tz3Var);
            }
            if (z) {
                kr1.O(tz3Var);
            }
        }
    }
}
