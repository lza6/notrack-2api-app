package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gu2 extends ju2 {
    public final float c;
    public final float d;

    public gu2(float f, float f2) {
        super(1);
        this.c = f;
        this.d = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gu2)) {
            return false;
        }
        gu2 gu2Var = (gu2) obj;
        return Float.compare(this.c, gu2Var.c) == 0 && Float.compare(this.d, gu2Var.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + (Float.hashCode(this.c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeReflectiveQuadTo(dx=");
        sb.append(this.c);
        sb.append(", dy=");
        return fq2.o(sb, this.d, ')');
    }
}
