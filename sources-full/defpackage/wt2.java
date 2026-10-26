package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wt2 extends ju2 {
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public wt2(float f, float f2, float f3, float f4) {
        super(1);
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wt2)) {
            return false;
        }
        wt2 wt2Var = (wt2) obj;
        return Float.compare(this.c, wt2Var.c) == 0 && Float.compare(this.d, wt2Var.d) == 0 && Float.compare(this.e, wt2Var.e) == 0 && Float.compare(this.f, wt2Var.f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f) + fq2.d(this.e, fq2.d(this.d, Float.hashCode(this.c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QuadTo(x1=");
        sb.append(this.c);
        sb.append(", y1=");
        sb.append(this.d);
        sb.append(", x2=");
        sb.append(this.e);
        sb.append(", y2=");
        return fq2.o(sb, this.f, ')');
    }
}
