package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zm1 {
    public final ym1 a;
    public final int b;

    public zm1(ym1 ym1Var, int i) {
        this.a = ym1Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zm1)) {
            return false;
        }
        zm1 zm1Var = (zm1) obj;
        return this.a.equals(zm1Var.a) && this.b == zm1Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImageVectorEntry(imageVector=");
        sb.append(this.a);
        sb.append(", configFlags=");
        return fq2.p(sb, this.b, ')');
    }
}
