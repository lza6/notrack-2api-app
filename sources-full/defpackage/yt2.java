package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yt2 extends ju2 {
    public final float c;
    public final float d;

    public yt2(float f, float f2) {
        super(1);
        this.c = f;
        this.d = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yt2)) {
            return false;
        }
        yt2 yt2Var = (yt2) obj;
        return Float.compare(this.c, yt2Var.c) == 0 && Float.compare(this.d, yt2Var.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + (Float.hashCode(this.c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReflectiveQuadTo(x=");
        sb.append(this.c);
        sb.append(", y=");
        return fq2.o(sb, this.d, ')');
    }
}
