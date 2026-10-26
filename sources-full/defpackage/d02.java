package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class d02 {
    public final int a;
    public final int b;

    public d02(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (!(i >= 0)) {
            so1.a("negative start index");
        }
        if (i2 >= i) {
            return;
        }
        so1.a("end index greater than start");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d02)) {
            return false;
        }
        d02 d02Var = (d02) obj;
        return this.a == d02Var.a && this.b == d02Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Interval(start=");
        sb.append(this.a);
        sb.append(", end=");
        return fq2.p(sb, this.b, ')');
    }
}
