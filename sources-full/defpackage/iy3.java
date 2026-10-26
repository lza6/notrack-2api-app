package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class iy3 {
    public static final iy3 c = new iy3(1.0f, 0.0f);
    public final float a;
    public final float b;

    public iy3(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iy3)) {
            return false;
        }
        iy3 iy3Var = (iy3) obj;
        return this.a == iy3Var.a && this.b == iy3Var.b;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextGeometricTransform(scaleX=");
        sb.append(this.a);
        sb.append(", skewX=");
        return fq2.o(sb, this.b, ')');
    }
}
