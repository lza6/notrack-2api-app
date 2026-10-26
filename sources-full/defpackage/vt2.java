package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vt2 extends ju2 {
    public final float c;
    public final float d;

    public vt2(float f, float f2) {
        super(3);
        this.c = f;
        this.d = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vt2)) {
            return false;
        }
        vt2 vt2Var = (vt2) obj;
        return Float.compare(this.c, vt2Var.c) == 0 && Float.compare(this.d, vt2Var.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + (Float.hashCode(this.c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MoveTo(x=");
        sb.append(this.c);
        sb.append(", y=");
        return fq2.o(sb, this.d, ')');
    }
}
