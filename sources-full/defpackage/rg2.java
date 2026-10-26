package defpackage;

import java.util.List;
import kotlin.jvm.internal.IntCompanionObject;
import okio.Options$Companion;

/* JADX INFO: loaded from: classes.dex */
public final class rg2 {
    public hg a;
    public kb1 b;
    public int c;
    public boolean d;
    public int e;
    public int f;
    public List g;
    public he2 h;
    public wu0 j;
    public uz3 k;
    public vu l;
    public dx1 m;
    public xy3 n;
    public long i = to1.a;
    public int o = -1;
    public int p = -1;

    public rg2(hg hgVar, uz3 uz3Var, kb1 kb1Var, int i, boolean z, int i2, int i3, List list) {
        this.a = hgVar;
        this.b = kb1Var;
        this.c = i;
        this.d = z;
        this.e = i2;
        this.f = i3;
        this.g = list;
        this.k = uz3Var;
    }

    public final int a(int i, dx1 dx1Var) {
        int i2 = this.o;
        int i3 = this.p;
        if (i == i2 && i2 != -1) {
            return i3;
        }
        long jA = wm0.a(0, i, 0, IntCompanionObject.MAX_VALUE);
        if (this.f > 1) {
            he2 he2Var = this.h;
            uz3 uz3Var = this.k;
            wu0 wu0Var = this.j;
            wu0Var.getClass();
            he2 he2VarFrom = Options$Companion.from(he2Var, dx1Var, uz3Var, wu0Var, this.b);
            this.h = he2VarFrom;
            jA = he2VarFrom.a(jA, this.f);
        }
        int iQ = g13.q(b(jA, dx1Var).e);
        int i4 = um0.i(jA);
        if (iQ < i4) {
            iQ = i4;
        }
        this.o = i;
        this.p = iQ;
        return iQ;
    }

    public final pg2 b(long j, dx1 dx1Var) {
        vu vuVarD = d(dx1Var);
        long jV = gm4.v(j, this.d, this.c, vuVarD.c());
        boolean z = this.d;
        int i = this.c;
        int i2 = this.e;
        return new pg2(vuVarD, jV, ((z || !(i == 2 || i == 4 || i == 5)) && i2 >= 1) ? i2 : 1, i);
    }

    public final void c(wu0 wu0Var) {
        long jA;
        wu0 wu0Var2 = this.j;
        if (wu0Var != null) {
            int i = to1.b;
            jA = to1.a(wu0Var.getDensity(), wu0Var.l());
        } else {
            jA = to1.a;
        }
        if (wu0Var2 == null) {
            this.j = wu0Var;
            this.i = jA;
        } else if (wu0Var == null || this.i != jA) {
            this.j = wu0Var;
            this.i = jA;
            this.l = null;
            this.n = null;
            this.p = -1;
            this.o = -1;
        }
    }

    public final vu d(dx1 dx1Var) {
        vu vuVar = this.l;
        if (vuVar == null || dx1Var != this.m || vuVar.b()) {
            this.m = dx1Var;
            hg hgVar = this.a;
            uz3 uz3VarQ = yh4.Q(this.k, dx1Var);
            wu0 wu0Var = this.j;
            wu0Var.getClass();
            kb1 kb1Var = this.b;
            List list = this.g;
            if (list == null) {
                list = z21.c;
            }
            vuVar = new vu(hgVar, uz3VarQ, list, wu0Var, kb1Var);
        }
        this.l = vuVar;
        return vuVar;
    }

    public final xy3 e(dx1 dx1Var, long j, pg2 pg2Var) {
        float fMin = Math.min(pg2Var.a.c(), pg2Var.d);
        hg hgVar = this.a;
        uz3 uz3Var = this.k;
        List list = this.g;
        if (list == null) {
            list = z21.c;
        }
        int i = this.e;
        boolean z = this.d;
        int i2 = this.c;
        wu0 wu0Var = this.j;
        wu0Var.getClass();
        return new xy3(new wy3(hgVar, uz3Var, list, i, z, i2, wu0Var, dx1Var, this.b, j), pg2Var, wm0.d(j, (((long) g13.q(fMin)) << 32) | (((long) g13.q(pg2Var.e)) & 4294967295L)));
    }

    public final void f(hg hgVar, uz3 uz3Var, kb1 kb1Var, int i, boolean z, int i2, int i3, List list) {
        this.a = hgVar;
        boolean zC = uz3Var.c(this.k);
        this.k = uz3Var;
        if (!zC) {
            this.l = null;
            this.n = null;
            this.p = -1;
            this.o = -1;
        }
        this.b = kb1Var;
        this.c = i;
        this.d = z;
        this.e = i2;
        this.f = i3;
        this.g = list;
        this.l = null;
        this.n = null;
        this.p = -1;
        this.o = -1;
    }
}
