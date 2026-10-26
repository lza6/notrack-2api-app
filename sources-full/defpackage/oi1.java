package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class oi1 extends s4 {
    public final int h;
    public final int i;
    public final d5 j;
    public final d5 k;

    public oi1(int i, int i2, d5 d5Var, d5 d5Var2) {
        this.h = i;
        this.i = i2;
        this.j = d5Var;
        this.k = d5Var2;
    }

    public final int R() {
        d5 d5Var = d5.I;
        int i = this.i;
        d5 d5Var2 = this.j;
        if (d5Var2 == d5Var) {
            return i;
        }
        if (d5Var2 != d5.F && d5Var2 != d5.G && d5Var2 != d5.H) {
            u41.r("Unknown variant");
            return 0;
        }
        return i + 5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof oi1)) {
            return false;
        }
        oi1 oi1Var = (oi1) obj;
        return oi1Var.h == this.h && oi1Var.R() == R() && oi1Var.j == this.j && oi1Var.k == this.k;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.h), Integer.valueOf(this.i), this.j, this.k);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HMAC Parameters (variant: ");
        sb.append(this.j);
        sb.append(", hashType: ");
        sb.append(this.k);
        sb.append(", ");
        sb.append(this.i);
        sb.append("-byte tags, and ");
        return fq2.q(sb, this.h, "-byte key)");
    }
}
