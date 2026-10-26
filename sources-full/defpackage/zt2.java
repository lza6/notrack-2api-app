package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zt2 extends ju2 {
    public final float c;
    public final float d;
    public final float e;
    public final boolean f;
    public final boolean g;
    public final float h;
    public final float i;

    public zt2(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
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
        if (!(obj instanceof zt2)) {
            return false;
        }
        zt2 zt2Var = (zt2) obj;
        return Float.compare(this.c, zt2Var.c) == 0 && Float.compare(this.d, zt2Var.d) == 0 && Float.compare(this.e, zt2Var.e) == 0 && this.f == zt2Var.f && this.g == zt2Var.g && Float.compare(this.h, zt2Var.h) == 0 && Float.compare(this.i, zt2Var.i) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.i) + fq2.d(this.h, ud2.k(ud2.k(fq2.d(this.e, fq2.d(this.d, Float.hashCode(this.c) * 31, 31), 31), 31, this.f), 31, this.g), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeArcTo(horizontalEllipseRadius=");
        sb.append(this.c);
        sb.append(", verticalEllipseRadius=");
        sb.append(this.d);
        sb.append(", theta=");
        sb.append(this.e);
        sb.append(", isMoreThanHalf=");
        sb.append(this.f);
        sb.append(", isPositiveArc=");
        sb.append(this.g);
        sb.append(", arcStartDx=");
        sb.append(this.h);
        sb.append(", arcStartDy=");
        return fq2.o(sb, this.i, ')');
    }
}
