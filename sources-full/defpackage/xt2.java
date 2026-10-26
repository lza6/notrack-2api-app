package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xt2 extends ju2 {
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public xt2(float f, float f2, float f3, float f4) {
        super(2);
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xt2)) {
            return false;
        }
        xt2 xt2Var = (xt2) obj;
        return Float.compare(this.c, xt2Var.c) == 0 && Float.compare(this.d, xt2Var.d) == 0 && Float.compare(this.e, xt2Var.e) == 0 && Float.compare(this.f, xt2Var.f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f) + fq2.d(this.e, fq2.d(this.d, Float.hashCode(this.c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReflectiveCurveTo(x1=");
        sb.append(this.c);
        sb.append(", y1=");
        sb.append(this.d);
        sb.append(", x2=");
        sb.append(this.e);
        sb.append(", y2=");
        return fq2.o(sb, this.f, ')');
    }
}
