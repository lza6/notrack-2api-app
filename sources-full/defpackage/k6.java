package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class k6 extends s4 {
    public final int h;
    public final int i;
    public final int j;
    public final d5 k;

    public k6(int i, int i2, int i3, d5 d5Var) {
        this.h = i;
        this.i = i2;
        this.j = i3;
        this.k = d5Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k6)) {
            return false;
        }
        k6 k6Var = (k6) obj;
        return k6Var.h == this.h && k6Var.i == this.i && k6Var.j == this.j && k6Var.k == this.k;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.h), Integer.valueOf(this.i), Integer.valueOf(this.j), this.k);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AesGcm Parameters (variant: ");
        sb.append(this.k);
        sb.append(", ");
        sb.append(this.i);
        sb.append("-byte IV, ");
        sb.append(this.j);
        sb.append("-byte tag, and ");
        return fq2.q(sb, this.h, "-byte key)");
    }
}
