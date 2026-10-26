package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wz {
    public final wy3 a;

    public wz(wy3 wy3Var) {
        this.a = wy3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wz)) {
            return false;
        }
        wy3 wy3Var = this.a;
        hg hgVar = wy3Var.a;
        wy3 wy3Var2 = ((wz) obj).a;
        return kr1.n(hgVar, wy3Var2.a) && wy3Var.b.c(wy3Var2.b) && kr1.n(wy3Var.c, wy3Var2.c) && wy3Var.d == wy3Var2.d && wy3Var.e == wy3Var2.e && wy3Var.f == wy3Var2.f && kr1.n(wy3Var.g, wy3Var2.g) && wy3Var.h == wy3Var2.h && wy3Var.i == wy3Var2.i && um0.b(wy3Var.j, wy3Var2.j);
    }

    public final int hashCode() {
        wy3 wy3Var = this.a;
        int iHashCode = wy3Var.a.hashCode() * 31;
        uz3 uz3Var = wy3Var.b;
        em3 em3Var = uz3Var.a;
        long j = em3Var.b;
        zz3[] zz3VarArr = yz3.b;
        int iHashCode2 = Long.hashCode(j) * 31;
        ic1 ic1Var = em3Var.c;
        int i = (iHashCode2 + (ic1Var != null ? ic1Var.c : 0)) * 31;
        gc1 gc1Var = em3Var.d;
        int iHashCode3 = (i + (gc1Var != null ? Integer.hashCode(gc1Var.a) : 0)) * 31;
        hc1 hc1Var = em3Var.e;
        int iHashCode4 = (iHashCode3 + (hc1Var != null ? Integer.hashCode(hc1Var.a) : 0)) * 31;
        lb1 lb1Var = em3Var.f;
        int iHashCode5 = (iHashCode4 + (lb1Var != null ? lb1Var.hashCode() : 0)) * 31;
        String str = em3Var.g;
        int iH = ud2.h((iHashCode5 + (str != null ? str.hashCode() : 0)) * 31, 31, em3Var.h);
        zr zrVar = em3Var.i;
        int iHashCode6 = (iH + (zrVar != null ? Float.hashCode(zrVar.a) : 0)) * 31;
        iy3 iy3Var = em3Var.j;
        int iHashCode7 = (iHashCode6 + (iy3Var != null ? iy3Var.hashCode() : 0)) * 31;
        g72 g72Var = em3Var.k;
        int iHashCode8 = (iHashCode7 + (g72Var != null ? g72Var.c.hashCode() : 0)) * 31;
        long j2 = em3Var.l;
        int i2 = re0.j;
        int iH2 = ud2.h(iHashCode8, 31, j2);
        hw2 hw2Var = em3Var.o;
        int iHashCode9 = (uz3Var.b.hashCode() + ((iH2 + (hw2Var != null ? hw2Var.hashCode() : 0)) * 31)) * 31;
        jw2 jw2Var = uz3Var.c;
        return Long.hashCode(wy3Var.j) + ((wy3Var.i.hashCode() + ((wy3Var.h.hashCode() + ((wy3Var.g.hashCode() + fq2.e(wy3Var.f, ud2.k((ud2.j((iHashCode9 + (jw2Var != null ? jw2Var.hashCode() : 0) + iHashCode) * 31, 31, wy3Var.c) + wy3Var.d) * 31, 31, wy3Var.e), 31)) * 31)) * 31)) * 31);
    }
}
