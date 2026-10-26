package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ic1 implements Comparable {
    public static final ic1 d;
    public static final ic1 h;
    public static final ic1 l;
    public static final ic1 m;
    public static final ic1 n;
    public static final ic1 o;
    public final int c;

    static {
        ic1 ic1Var = new ic1(100);
        ic1 ic1Var2 = new ic1(200);
        ic1 ic1Var3 = new ic1(300);
        ic1 ic1Var4 = new ic1(400);
        ic1 ic1Var5 = new ic1(500);
        ic1 ic1Var6 = new ic1(600);
        d = ic1Var6;
        ic1 ic1Var7 = new ic1(700);
        ic1 ic1Var8 = new ic1(800);
        ic1 ic1Var9 = new ic1(900);
        h = ic1Var4;
        l = ic1Var5;
        m = ic1Var6;
        n = ic1Var7;
        o = ic1Var8;
        kr1.U(ic1Var, ic1Var2, ic1Var3, ic1Var4, ic1Var5, ic1Var6, ic1Var7, ic1Var8, ic1Var9);
    }

    public ic1(int i) {
        this.c = i;
        boolean z = false;
        if (1 <= i && i < 1001) {
            z = true;
        }
        if (z) {
            return;
        }
        qo1.a("Font weight can be in range [1, 1000]. Current value: " + i);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return kr1.z(this.c, ((ic1) obj).c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ic1) {
            return this.c == ((ic1) obj).c;
        }
        return false;
    }

    public final int hashCode() {
        return this.c;
    }

    public final String toString() {
        return fq2.p(new StringBuilder("FontWeight(weight="), this.c, ')');
    }
}
