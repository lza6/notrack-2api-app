package defpackage;

import androidx.compose.ui.platform.Clipboard;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.platform.TextToolbarStatus;
import androidx.compose.ui.text.input.OffsetMapping$Companion;

/* JADX INFO: loaded from: classes.dex */
public final class xw3 {
    public final q84 a;
    public z22 d;
    public je1 g;
    public Clipboard h;
    public gq0 i;
    public TextToolbar j;
    public lh1 k;
    public za1 l;
    public final ft2 m;
    public final ft2 n;
    public long o;
    public Integer p;
    public long q;
    public final ft2 r;
    public final ft2 s;
    public int t;
    public ey3 u;
    public th3 v;
    public final tw3 w;
    public final sk3 x;
    public nn2 b = xa4.a;
    public le1 c = pv3.o;
    public final ft2 e = cl3.d(new ey3((String) null, 0, 7));
    public de4 f = OffsetMapping$Companion.getNone();

    public xw3(q84 q84Var) {
        this.a = q84Var;
        Boolean bool = Boolean.TRUE;
        this.m = cl3.d(bool);
        this.n = cl3.d(bool);
        this.o = 0L;
        this.q = 0L;
        this.r = cl3.d(null);
        this.s = cl3.d(null);
        this.t = -1;
        this.u = new ey3((String) null, 0L, 7);
        this.w = new tw3(this, 1);
        this.x = new sk3(7, this);
    }

    public static final long a(xw3 xw3Var, ey3 ey3Var, long j, boolean z, boolean z2, gd3 gd3Var, boolean z3) {
        yy3 yy3VarD;
        char c;
        lh1 lh1Var;
        z22 z22Var = xw3Var.d;
        if (z22Var == null || (yy3VarD = z22Var.d()) == null) {
            return jz3.b;
        }
        nn2 nn2Var = xw3Var.b;
        long j2 = ey3Var.b;
        hg hgVar = ey3Var.a;
        int i = jz3.c;
        long jD = p23.d(nn2Var.o((int) (j2 >> 32)), xw3Var.b.o((int) (j2 & 4294967295L)));
        boolean z4 = false;
        int iB = yy3VarD.b(j, false);
        int i2 = (z2 || z) ? iB : (int) (jD >> 32);
        int i3 = (!z2 || z) ? iB : (int) (jD & 4294967295L);
        th3 th3Var = xw3Var.v;
        int i4 = -1;
        if (z || th3Var == null) {
            c = ' ';
        } else {
            c = ' ';
            int i5 = xw3Var.t;
            if (i5 != -1) {
                i4 = i5;
            }
        }
        th3 th3VarD = p23.D(yy3VarD.a, i2, i3, i4, jD, z, z2);
        if (th3VarD.g(th3Var)) {
            xw3Var.v = th3VarD;
            xw3Var.t = iB;
            fd3 fd3VarA = gd3Var.a(th3VarD);
            long jD2 = p23.d(xw3Var.b.n(fd3VarA.a.b), xw3Var.b.n(fd3VarA.b.b));
            if (!jz3.b(jD2, j2)) {
                boolean z5 = jz3.g(jD2) != jz3.g(j2) && jz3.b(p23.d((int) (4294967295L & jD2), (int) (jD2 >> c)), j2);
                boolean z6 = jz3.c(jD2) && jz3.c(j2);
                if (z3 && hgVar.d.length() > 0 && !z5 && !z6 && (lh1Var = xw3Var.k) != null) {
                    lh1Var.mo63x70bb4fce(9);
                }
                xw3Var.c.invoke(c(hgVar, jD2));
                if (!z3) {
                    xw3Var.q(!jz3.c(jD2));
                }
                z22 z22Var2 = xw3Var.d;
                if (z22Var2 != null) {
                    z22Var2.q.setValue(Boolean.valueOf(z3));
                }
                z22 z22Var3 = xw3Var.d;
                if (z22Var3 != null) {
                    z22Var3.m.setValue(Boolean.valueOf(!jz3.c(jD2) && ax3.a(xw3Var, true)));
                }
                z22 z22Var4 = xw3Var.d;
                if (z22Var4 != null) {
                    z22Var4.n.setValue(Boolean.valueOf(!jz3.c(jD2) && ax3.a(xw3Var, false)));
                }
                z22 z22Var5 = xw3Var.d;
                if (z22Var5 == null) {
                    return jD2;
                }
                if (jz3.c(jD2) && ax3.a(xw3Var, true)) {
                    z4 = true;
                }
                z22Var5.o.setValue(Boolean.valueOf(z4));
                return jD2;
            }
        }
        return j2;
    }

    public static ey3 c(hg hgVar, long j) {
        return new ey3(hgVar, j, (jz3) null);
    }

    public final ym3 b(boolean z) {
        gq0 gq0Var = this.i;
        if (gq0Var == null) {
            return null;
        }
        return py.F(gq0Var, null, jq0.l, new sw3(this, z, null), 1);
    }

    public final void d() {
        gq0 gq0Var = this.i;
        if (gq0Var != null) {
            py.F(gq0Var, null, jq0.l, new uw3(this, null, 0), 1);
        }
    }

    public final void e(ln2 ln2Var) {
        if (!jz3.c(k().b)) {
            z22 z22Var = this.d;
            yy3 yy3VarD = z22Var != null ? z22Var.d() : null;
            int iE = (ln2Var == null || yy3VarD == null) ? jz3.e(k().b) : this.b.n(yy3VarD.b(ln2Var.a, true));
            this.c.invoke(ey3.a(k(), null, p23.d(iE, iE), 5));
        }
        o((ln2Var == null || k().a.d.length() <= 0) ? ch1.c : ch1.h);
        q(false);
    }

    public final void f(boolean z) {
        za1 za1Var;
        z22 z22Var = this.d;
        if (z22Var != null && !z22Var.b() && (za1Var = this.l) != null) {
            za1.b(za1Var);
        }
        this.u = k();
        q(z);
        o(ch1.d);
    }

    public final ln2 g() {
        return (ln2) this.s.getValue();
    }

    public final boolean h() {
        return ((Boolean) this.m.getValue()).booleanValue();
    }

    public final boolean i() {
        return ((Boolean) this.n.getValue()).booleanValue();
    }

    public final long j(boolean z) {
        yy3 yy3VarD;
        long j;
        z22 z22Var = this.d;
        if (z22Var == null || (yy3VarD = z22Var.d()) == null) {
            return 9205357640488583168L;
        }
        xy3 xy3Var = yy3VarD.a;
        z22 z22Var2 = this.d;
        hg hgVar = z22Var2 != null ? (hg) z22Var2.a.b : null;
        if (hgVar == null) {
            return 9205357640488583168L;
        }
        if (!kr1.n(hgVar.d, xy3Var.a.a.d)) {
            return 9205357640488583168L;
        }
        ey3 ey3VarK = k();
        if (z) {
            long j2 = ey3VarK.b;
            int i = jz3.c;
            j = j2 >> 32;
        } else {
            long j3 = ey3VarK.b;
            int i2 = jz3.c;
            j = j3 & 4294967295L;
        }
        return y64.C(xy3Var, this.b.o((int) j), z, jz3.g(k().b));
    }

    public final ey3 k() {
        return (ey3) this.e.getValue();
    }

    public final void l() {
        TextToolbar textToolbar;
        TextToolbar textToolbar2 = this.j;
        if ((textToolbar2 != null ? textToolbar2.getStatus() : null) != TextToolbarStatus.Shown || (textToolbar = this.j) == null) {
            return;
        }
        textToolbar.hide();
    }

    public final void m() {
        gq0 gq0Var = this.i;
        if (gq0Var != null) {
            py.F(gq0Var, null, jq0.l, new uw3(this, null, 1), 1);
        }
    }

    public final void n() {
        ey3 ey3VarC = c(k().a, p23.d(0, k().a.d.length()));
        this.c.invoke(ey3VarC);
        this.u = ey3.a(this.u, null, ey3VarC.b, 5);
        f(true);
    }

    public final void o(ch1 ch1Var) {
        z22 z22Var = this.d;
        if (z22Var != null) {
            if (z22Var.a() == ch1Var) {
                z22Var = null;
            }
            if (z22Var != null) {
                z22Var.k.setValue(ch1Var);
            }
        }
    }

    public final void p() {
        gq0 gq0Var = this.i;
        if (gq0Var != null) {
            py.F(gq0Var, null, jq0.l, new il3(this, null), 1);
        }
    }

    public final void q(boolean z) {
        z22 z22Var = this.d;
        if (z22Var != null) {
            z22Var.l.setValue(Boolean.valueOf(z));
        }
        if (z) {
            p();
        } else {
            l();
        }
    }
}
