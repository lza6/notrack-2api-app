package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cu2 extends ju2 {
    public final float c;
    public final float d;

    public cu2(float f, float f2) {
        super(3);
        this.c = f;
        this.d = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cu2)) {
            return false;
        }
        cu2 cu2Var = (cu2) obj;
        return Float.compare(this.c, cu2Var.c) == 0 && Float.compare(this.d, cu2Var.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + (Float.hashCode(this.c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeLineTo(dx=");
        sb.append(this.c);
        sb.append(", dy=");
        return fq2.o(sb, this.d, ')');
    }
}
