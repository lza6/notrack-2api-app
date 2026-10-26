package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class eu2 extends ju2 {
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public eu2(float f, float f2, float f3, float f4) {
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
        if (!(obj instanceof eu2)) {
            return false;
        }
        eu2 eu2Var = (eu2) obj;
        return Float.compare(this.c, eu2Var.c) == 0 && Float.compare(this.d, eu2Var.d) == 0 && Float.compare(this.e, eu2Var.e) == 0 && Float.compare(this.f, eu2Var.f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f) + fq2.d(this.e, fq2.d(this.d, Float.hashCode(this.c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeQuadTo(dx1=");
        sb.append(this.c);
        sb.append(", dy1=");
        sb.append(this.d);
        sb.append(", dx2=");
        sb.append(this.e);
        sb.append(", dy2=");
        return fq2.o(sb, this.f, ')');
    }
}
