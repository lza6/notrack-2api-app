package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class du2 extends ju2 {
    public final float c;
    public final float d;

    public du2(float f, float f2) {
        super(3);
        this.c = f;
        this.d = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof du2)) {
            return false;
        }
        du2 du2Var = (du2) obj;
        return Float.compare(this.c, du2Var.c) == 0 && Float.compare(this.d, du2Var.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + (Float.hashCode(this.c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeMoveTo(dx=");
        sb.append(this.c);
        sb.append(", dy=");
        return fq2.o(sb, this.d, ')');
    }
}
