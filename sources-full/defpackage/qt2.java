package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qt2 extends ju2 {
    public final float c;
    public final float d;
    public final float e;
    public final boolean f;
    public final boolean g;
    public final float h;
    public final float i;

    public qt2(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        super(3);
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = z;
        this.g = z2;
        this.h = f4;
        this.i = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qt2)) {
            return false;
        }
        qt2 qt2Var = (qt2) obj;
        return Float.compare(this.c, qt2Var.c) == 0 && Float.compare(this.d, qt2Var.d) == 0 && Float.compare(this.e, qt2Var.e) == 0 && this.f == qt2Var.f && this.g == qt2Var.g && Float.compare(this.h, qt2Var.h) == 0 && Float.compare(this.i, qt2Var.i) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.i) + fq2.d(this.h, ud2.k(ud2.k(fq2.d(this.e, fq2.d(this.d, Float.hashCode(this.c) * 31, 31), 31), 31, this.f), 31, this.g), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ArcTo(horizontalEllipseRadius=");
        sb.append(this.c);
        sb.append(", verticalEllipseRadius=");
        sb.append(this.d);
        sb.append(", theta=");
        sb.append(this.e);
        sb.append(", isMoreThanHalf=");
        sb.append(this.f);
        sb.append(", isPositiveArc=");
        sb.append(this.g);
        sb.append(", arcStartX=");
        sb.append(this.h);
        sb.append(", arcStartY=");
        return fq2.o(sb, this.i, ')');
    }
}
