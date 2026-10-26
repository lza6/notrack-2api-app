package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class s6 extends s4 {
    public final int h;
    public final d5 i;

    public s6(int i, d5 d5Var) {
        this.h = i;
        this.i = d5Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof s6)) {
            return false;
        }
        s6 s6Var = (s6) obj;
        return s6Var.h == this.h && s6Var.i == this.i;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.h), this.i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AesGcmSiv Parameters (variant: ");
        sb.append(this.i);
        sb.append(", ");
        return fq2.q(sb, this.h, "-byte key)");
    }
}
