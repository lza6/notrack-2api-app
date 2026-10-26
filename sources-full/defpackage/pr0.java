package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pr0 {
    public long a;
    public float b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pr0)) {
            return false;
        }
        pr0 pr0Var = (pr0) obj;
        return this.a == pr0Var.a && Float.compare(this.b, pr0Var.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataPointAtTime(time=");
        sb.append(this.a);
        sb.append(", dataPoint=");
        return fq2.o(sb, this.b, ')');
    }
}
