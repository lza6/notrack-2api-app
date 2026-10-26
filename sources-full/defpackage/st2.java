package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class st2 extends ju2 {
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;

    public st2(float f, float f2, float f3, float f4, float f5, float f6) {
        super(2);
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
        this.g = f5;
        this.h = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof st2)) {
            return false;
        }
        st2 st2Var = (st2) obj;
        return Float.compare(this.c, st2Var.c) == 0 && Float.compare(this.d, st2Var.d) == 0 && Float.compare(this.e, st2Var.e) == 0 && Float.compare(this.f, st2Var.f) == 0 && Float.compare(this.g, st2Var.g) == 0 && Float.compare(this.h, st2Var.h) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.h) + fq2.d(this.g, fq2.d(this.f, fq2.d(this.e, fq2.d(this.d, Float.hashCode(this.c) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CurveTo(x1=");
        sb.append(this.c);
        sb.append(", y1=");
        sb.append(this.d);
        sb.append(", x2=");
        sb.append(this.e);
        sb.append(", y2=");
        sb.append(this.f);
        sb.append(", x3=");
        sb.append(this.g);
        sb.append(", y3=");
        return fq2.o(sb, this.h, ')');
    }
}
