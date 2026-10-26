package androidx.compose.foundation.text.input.internal;

import androidx.compose.ui.platform.InspectorInfo;
import defpackage.az3;
import defpackage.gh2;
import defpackage.hu3;
import defpackage.ki2;
import defpackage.kr1;
import defpackage.ls;
import defpackage.nu3;
import defpackage.of2;
import defpackage.py;
import defpackage.sq3;
import defpackage.tf2;
import defpackage.ud2;
import defpackage.wx3;
import defpackage.y64;
import defpackage.ym3;
import defpackage.yv1;

/* JADX INFO: loaded from: classes.dex */
public final class TextFieldDecoratorModifier extends tf2 {
    public final c c;
    public final az3 d;
    public final wx3 h;
    public final boolean l;
    public final boolean m;
    public final yv1 n;
    public final boolean o;
    public final gh2 p;
    public final boolean q;
    public final ki2 r;

    public TextFieldDecoratorModifier(c cVar, az3 az3Var, wx3 wx3Var, boolean z, boolean z2, yv1 yv1Var, boolean z3, gh2 gh2Var, boolean z4, ki2 ki2Var) {
        this.c = cVar;
        this.d = az3Var;
        this.h = wx3Var;
        this.l = z;
        this.m = z2;
        this.n = yv1Var;
        this.o = z3;
        this.p = gh2Var;
        this.q = z4;
        this.r = ki2Var;
    }

    @Override // defpackage.tf2
    public final of2 create() {
        return new nu3(this.c, this.d, this.h, this.l, this.m, this.n, this.o, this.p, this.q, this.r);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextFieldDecoratorModifier)) {
            return false;
        }
        TextFieldDecoratorModifier textFieldDecoratorModifier = (TextFieldDecoratorModifier) obj;
        return kr1.n(this.c, textFieldDecoratorModifier.c) && kr1.n(this.d, textFieldDecoratorModifier.d) && kr1.n(this.h, textFieldDecoratorModifier.h) && this.l == textFieldDecoratorModifier.l && this.m == textFieldDecoratorModifier.m && this.n.equals(textFieldDecoratorModifier.n) && this.o == textFieldDecoratorModifier.o && kr1.n(this.p, textFieldDecoratorModifier.p) && this.q == textFieldDecoratorModifier.q && kr1.n(this.r, textFieldDecoratorModifier.r);
    }

    public final int hashCode() {
        int iK = ud2.k((this.p.hashCode() + ud2.k((this.n.hashCode() + ud2.k(ud2.k((this.h.hashCode() + ((this.d.hashCode() + (this.c.hashCode() * 31)) * 31)) * 961, 31, this.l), 31, this.m)) * 961, 31, this.o)) * 31, 31, this.q);
        ki2 ki2Var = this.r;
        return iK + (ki2Var == null ? 0 : ki2Var.hashCode());
    }

    @Override // defpackage.tf2
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
    }

    public final String toString() {
        return "TextFieldDecoratorModifier(textFieldState=" + this.c + ", textLayoutState=" + this.d + ", textFieldSelectionState=" + this.h + ", filter=null, enabled=" + this.l + ", readOnly=" + this.m + ", keyboardOptions=" + this.n + ", keyboardActionHandler=null, singleLine=" + this.o + ", interactionSource=" + this.p + ", isPassword=" + this.q + ", stylusHandwritingTrigger=" + this.r + ')';
    }

    @Override // defpackage.tf2
    public final void update(of2 of2Var) {
        ym3 ym3Var;
        nu3 nu3Var = (nu3) of2Var;
        sq3 sq3Var = nu3Var.u;
        boolean z = nu3Var.n;
        boolean z2 = z && !nu3Var.o;
        c cVar = nu3Var.h;
        yv1 yv1Var = nu3Var.p;
        wx3 wx3Var = nu3Var.m;
        gh2 gh2Var = nu3Var.r;
        boolean z3 = nu3Var.s;
        ki2 ki2Var = nu3Var.t;
        boolean z4 = this.l;
        boolean z5 = this.m;
        boolean z6 = z4 && !z5;
        c cVar2 = this.c;
        nu3Var.h = cVar2;
        nu3Var.l = this.d;
        wx3 wx3Var2 = this.h;
        nu3Var.m = wx3Var2;
        nu3Var.n = z4;
        nu3Var.o = z5;
        yv1 yv1Var2 = this.n;
        nu3Var.p = yv1Var2;
        nu3Var.q = this.o;
        gh2 gh2Var2 = this.p;
        nu3Var.r = gh2Var2;
        boolean z7 = this.q;
        nu3Var.s = z7;
        ki2 ki2Var2 = this.r;
        nu3Var.t = ki2Var2;
        if (z6 != z2 || !kr1.n(cVar2, cVar) || !yv1Var2.equals(yv1Var) || !kr1.n(ki2Var2, ki2Var)) {
            if (z6 && nu3Var.A0()) {
                nu3Var.D0(false);
            } else if (!z6) {
                nu3Var.z0();
            }
        }
        if (z4 != z || z6 != z2 || yv1Var2.a() != yv1Var.a() || z7 != z3) {
            y64.M(nu3Var).D();
        }
        if (!kr1.n(wx3Var2, wx3Var)) {
            sq3Var.x0();
            if (nu3Var.isAttached()) {
                wx3Var2.m = nu3Var.E;
                if (nu3Var.A0() && (ym3Var = nu3Var.z) != null) {
                    ym3Var.c(null);
                    nu3Var.z = py.F(nu3Var.getCoroutineScope(), null, null, new ls(wx3Var2, null, 3), 3);
                }
            }
            wx3Var2.l = new hu3(nu3Var, 13);
        }
        if (kr1.n(gh2Var2, gh2Var)) {
            return;
        }
        sq3Var.x0();
    }
}
