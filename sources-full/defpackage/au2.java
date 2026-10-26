package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class au2 extends ju2 {
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;

    public au2(float f, float f2, float f3, float f4, float f5, float f6) {
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
        if (!(obj instanceof au2)) {
            return false;
        }
        au2 au2Var = (au2) obj;
        return Float.compare(this.c, au2Var.c) == 0 && Float.compare(this.d, au2Var.d) == 0 && Float.compare(this.e, au2Var.e) == 0 && Float.compare(this.f, au2Var.f) == 0 && Float.compare(this.g, au2Var.g) == 0 && Float.compare(this.h, au2Var.h) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.h) + fq2.d(this.g, fq2.d(this.f, fq2.d(this.e, fq2.d(this.d, Float.hashCode(this.c) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeCurveTo(dx1=");
        sb.append(this.c);
        sb.append(", dy1=");
        sb.append(this.d);
        sb.append(", dx2=");
        sb.append(this.e);
        sb.append(", dy2=");
        sb.append(this.f);
        sb.append(", dx3=");
        sb.append(this.g);
        sb.append(", dy3=");
        return fq2.o(sb, this.h, ')');
    }
}
