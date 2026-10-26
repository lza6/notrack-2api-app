package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class e5 extends s4 {
    public final int h;
    public final int i;
    public final d5 j;

    public e5(int i, int i2, d5 d5Var) {
        this.h = i;
        this.i = i2;
        this.j = d5Var;
    }

    public final int R() {
        d5 d5Var = d5.n;
        int i = this.i;
        d5 d5Var2 = this.j;
        if (d5Var2 == d5Var) {
            return i;
        }
        if (d5Var2 != d5.h && d5Var2 != d5.l && d5Var2 != d5.m) {
            u41.r("Unknown variant");
            return 0;
        }
        return i + 5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e5)) {
            return false;
        }
        e5 e5Var = (e5) obj;
        return e5Var.h == this.h && e5Var.R() == R() && e5Var.j == this.j;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.h), Integer.valueOf(this.i), this.j);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AES-CMAC Parameters (variant: ");
        sb.append(this.j);
        sb.append(", ");
        sb.append(this.i);
        sb.append("-byte tags, and ");
        return fq2.q(sb, this.h, "-byte key)");
    }
}
