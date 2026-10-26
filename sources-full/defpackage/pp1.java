package defpackage;

import android.graphics.Insets;

/* JADX INFO: loaded from: classes.dex */
public final class pp1 {
    public static final pp1 e = new pp1(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public pp1(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public static pp1 a(pp1 pp1Var, pp1 pp1Var2) {
        return b(Math.max(pp1Var.a, pp1Var2.a), Math.max(pp1Var.b, pp1Var2.b), Math.max(pp1Var.c, pp1Var2.c), Math.max(pp1Var.d, pp1Var2.d));
    }

    public static pp1 b(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? e : new pp1(i, i2, i3, i4);
    }

    public static pp1 c(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final Insets d() {
        return vk.b(this.a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || pp1.class != obj.getClass()) {
            return false;
        }
        pp1 pp1Var = (pp1) obj;
        return this.d == pp1Var.d && this.a == pp1Var.a && this.c == pp1Var.c && this.b == pp1Var.b;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Insets{left=");
        sb.append(this.a);
        sb.append(", top=");
        sb.append(this.b);
        sb.append(", right=");
        sb.append(this.c);
        sb.append(", bottom=");
        return fq2.p(sb, this.d, '}');
    }
}
