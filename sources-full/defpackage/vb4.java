package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class vb4 extends qb4 {
    public final String c;
    public final List d;
    public final int h;
    public final yx l;
    public final float m;
    public final yx n;
    public final float o;
    public final float p;
    public final int q;
    public final int r;
    public final float s;
    public final float t;
    public final float u;
    public final float v;

    public vb4(String str, List list, int i, yx yxVar, float f, yx yxVar2, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7) {
        this.c = str;
        this.d = list;
        this.h = i;
        this.l = yxVar;
        this.m = f;
        this.n = yxVar2;
        this.o = f2;
        this.p = f3;
        this.q = i2;
        this.r = i3;
        this.s = f4;
        this.t = f5;
        this.u = f6;
        this.v = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || vb4.class != obj.getClass()) {
            return false;
        }
        vb4 vb4Var = (vb4) obj;
        return this.c.equals(vb4Var.c) && kr1.n(this.l, vb4Var.l) && this.m == vb4Var.m && kr1.n(this.n, vb4Var.n) && this.o == vb4Var.o && this.p == vb4Var.p && this.q == vb4Var.q && this.r == vb4Var.r && this.s == vb4Var.s && this.t == vb4Var.t && this.u == vb4Var.u && this.v == vb4Var.v && this.h == vb4Var.h && kr1.n(this.d, vb4Var.d);
    }

    public final int hashCode() {
        int iJ = ud2.j(this.c.hashCode() * 31, 31, this.d);
        yx yxVar = this.l;
        int iD = fq2.d(this.m, (iJ + (yxVar != null ? yxVar.hashCode() : 0)) * 31, 31);
        yx yxVar2 = this.n;
        return Integer.hashCode(this.h) + fq2.d(this.v, fq2.d(this.u, fq2.d(this.t, fq2.d(this.s, fq2.e(this.r, fq2.e(this.q, fq2.d(this.p, fq2.d(this.o, (iD + (yxVar2 != null ? yxVar2.hashCode() : 0)) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }
}
