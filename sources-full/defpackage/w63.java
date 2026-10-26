package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class w63 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public w63(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w63)) {
            return false;
        }
        w63 w63Var = (w63) obj;
        return this.a == w63Var.a && this.b == w63Var.b && this.c == w63Var.c && this.d == w63Var.d;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + fq2.d(this.c, fq2.d(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RippleAlpha(draggedAlpha=");
        sb.append(this.a);
        sb.append(", focusedAlpha=");
        sb.append(this.b);
        sb.append(", hoveredAlpha=");
        sb.append(this.c);
        sb.append(", pressedAlpha=");
        return fq2.o(sb, this.d, ')');
    }
}
