package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class vf2 {
    public final d5 a;
    public final int b;
    public final String c;
    public final String d;

    public vf2(d5 d5Var, int i, String str, String str2) {
        this.a = d5Var;
        this.b = i;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof vf2)) {
            return false;
        }
        vf2 vf2Var = (vf2) obj;
        return this.a == vf2Var.a && this.b == vf2Var.b && this.c.equals(vf2Var.c) && this.d.equals(vf2Var.d);
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.b), this.c, this.d);
    }

    public final String toString() {
        return "(status=" + this.a + ", keyId=" + this.b + ", keyType='" + this.c + "', keyPrefix='" + this.d + "')";
    }
}
