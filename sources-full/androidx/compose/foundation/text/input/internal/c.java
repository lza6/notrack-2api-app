package androidx.compose.foundation.text.input.internal;

import app.template.extension.BuildConfig;
import defpackage.au3;
import defpackage.ay3;
import defpackage.cl3;
import defpackage.fe0;
import defpackage.ft2;
import defpackage.fv0;
import defpackage.g13;
import defpackage.g54;
import defpackage.gm4;
import defpackage.h54;
import defpackage.hg;
import defpackage.hq0;
import defpackage.jz3;
import defpackage.kr1;
import defpackage.oi2;
import defpackage.p23;
import defpackage.qf4;
import defpackage.rq1;
import defpackage.se3;
import defpackage.sg2;
import defpackage.t00;
import defpackage.u41;
import defpackage.uo0;
import defpackage.wu3;
import defpackage.xd;
import defpackage.y64;
import defpackage.zt3;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public final ay3 a;
    public final fe0 b;
    public final fv0 c;
    public final ft2 d;

    public c(ay3 ay3Var, fe0 fe0Var) {
        this.a = ay3Var;
        this.b = fe0Var;
        this.c = fe0Var != null ? cl3.b(new b(this, fe0Var)) : null;
        qf4 qf4Var = qf4.c;
        this.d = cl3.d(new se3(qf4Var, qf4Var));
    }

    public static void h(c cVar, CharSequence charSequence, boolean z, int i) {
        boolean z2 = (i & 2) == 0;
        wu3 wu3Var = (i & 4) != 0 ? wu3.c : wu3.d;
        if ((i & 8) != 0) {
            z = true;
        }
        ay3 ay3Var = cVar.a;
        ay3Var.b.a().f();
        zt3 zt3Var = ay3Var.b;
        if (z2) {
            zt3Var.e(null);
        }
        long j = zt3Var.l;
        zt3Var.c(jz3.f(j), jz3.e(j), charSequence);
        int length = charSequence.length() + jz3.f(j);
        y64.P(zt3Var, length, length);
        cVar.l(zt3Var);
        ay3.a(ay3Var, z, wu3Var);
    }

    public static void i(c cVar, String str, long j, boolean z, int i) {
        if ((i & 8) != 0) {
            z = true;
        }
        ay3 ay3Var = cVar.a;
        ay3Var.b.a().f();
        zt3 zt3Var = ay3Var.b;
        long jE = cVar.e(j);
        zt3Var.c(jz3.f(jE), jz3.e(jE), str);
        int length = str.length() + jz3.f(jE);
        y64.P(zt3Var, length, length);
        cVar.l(zt3Var);
        ay3.a(ay3Var, z, wu3.c);
    }

    public final void a() {
        ay3 ay3Var = this.a;
        ay3Var.b.a().f();
        zt3 zt3Var = ay3Var.b;
        int iE = jz3.e(zt3Var.l);
        y64.P(zt3Var, iE, iE);
        ay3.a(ay3Var, true, wu3.c);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final void b(xd xdVar, uo0 uo0Var) throws Throwable {
        h54 h54Var;
        if (uo0Var instanceof h54) {
            h54Var = (h54) uo0Var;
            int i = h54Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                h54Var.h = i - Integer.MIN_VALUE;
            } else {
                h54Var = new h54(this, uo0Var);
            }
        } else {
            h54Var = new h54(this, uo0Var);
        }
        Object obj = h54Var.c;
        int i2 = h54Var.h;
        if (i2 == 0) {
            g13.O(obj);
            h54Var.h = 1;
            t00 t00Var = new t00(1, gm4.G(h54Var));
            t00Var.u();
            this.a.f.c(xdVar);
            t00Var.w(new sg2(this, 19, xdVar));
            if (t00Var.s() == hq0.c) {
                return;
            }
        } else {
            if (i2 != 1) {
                u41.r("call to 'resume' before 'invoke' with coroutine");
                return;
            }
            g13.O(obj);
        }
        u41.p();
    }

    public final void c() {
        ay3 ay3Var = this.a;
        ay3Var.b.a().f();
        zt3 zt3Var = ay3Var.b;
        zt3Var.c(jz3.f(zt3Var.l), jz3.e(zt3Var.l), BuildConfig.VERSION_NAME);
        int iF = jz3.f(zt3Var.l);
        y64.P(zt3Var, iF, iF);
        l(zt3Var);
        ay3.a(ay3Var, true, wu3.d);
    }

    public final au3 d() {
        g54 g54Var;
        fv0 fv0Var = this.c;
        return (fv0Var == null || (g54Var = (g54) fv0Var.getValue()) == null) ? this.a.b() : g54Var.a;
    }

    public final long e(long j) {
        g54 g54Var;
        fv0 fv0Var = this.c;
        rq1 rq1Var = (fv0Var == null || (g54Var = (g54) fv0Var.getValue()) == null) ? null : g54Var.b;
        if (rq1Var == null) {
            return j;
        }
        int i = jz3.c;
        long jA = rq1Var.a((int) (j >> 32), false);
        long jA2 = jz3.c(j) ? jA : rq1Var.a((int) (4294967295L & j), false);
        int iMin = Math.min(jz3.f(jA), jz3.f(jA2));
        int iMax = Math.max(jz3.e(jA), jz3.e(jA2));
        return jz3.g(j) ? p23.d(iMax, iMin) : p23.d(iMin, iMax);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return kr1.n(this.a, cVar.a) && kr1.n(this.b, cVar.b);
    }

    public final long f(long j) {
        g54 g54Var;
        fv0 fv0Var = this.c;
        rq1 rq1Var = (fv0Var == null || (g54Var = (g54) fv0Var.getValue()) == null) ? null : g54Var.b;
        return rq1Var != null ? TransformedTextFieldState$Companion.m6x2def8c82(j, rq1Var, (se3) this.d.getValue()) : j;
    }

    public final void g(hg hgVar) {
        ay3 ay3Var = this.a;
        ay3Var.b.a().f();
        zt3 zt3Var = ay3Var.b;
        zt3Var.c(0, zt3Var.d.length(), BuildConfig.VERSION_NAME);
        zt3Var.append(hgVar.d);
        l(zt3Var);
        ay3.a(ay3Var, true, wu3.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        fe0 fe0Var = this.b;
        return (iHashCode + (fe0Var != null ? fe0Var.hashCode() : 0)) * 31;
    }

    public final void j(long j) {
        k(e(j));
    }

    public final void k(long j) {
        ay3 ay3Var = this.a;
        ay3Var.b.a().f();
        zt3 zt3Var = ay3Var.b;
        int i = jz3.c;
        y64.P(zt3Var, (int) (j >> 32), (int) (j & 4294967295L));
        ay3.a(ay3Var, true, wu3.c);
    }

    public final void l(zt3 zt3Var) {
        if (((oi2) zt3Var.a().d).h <= 0 || !jz3.c(zt3Var.l)) {
            return;
        }
        qf4 qf4Var = qf4.c;
        this.d.setValue(new se3(qf4Var, qf4Var));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransformedTextFieldState(textFieldState=");
        ay3 ay3Var = this.a;
        sb.append(ay3Var);
        sb.append(", outputTransformation=null, outputTransformedText=null, codepointTransformation=");
        sb.append(this.b);
        sb.append(", codepointTransformedText=");
        sb.append(this.c);
        sb.append(", outputText=\"");
        sb.append((Object) ay3Var.b());
        sb.append("\", visualText=\"");
        sb.append((Object) d());
        sb.append("\")");
        return sb.toString();
    }
}
