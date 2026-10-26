package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wt implements y7 {
    public final float a;

    public wt(float f) {
        this.a = f;
    }

    @Override // defpackage.y7
    public final int a(int i, int i2, dx1 dx1Var) {
        float f = (i2 - i) / 2.0f;
        dx1 dx1Var2 = dx1.c;
        float f2 = this.a;
        if (dx1Var != dx1Var2) {
            f2 *= -1.0f;
        }
        return Math.round((1.0f + f2) * f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wt) && Float.compare(this.a, ((wt) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return fq2.o(new StringBuilder("Horizontal(bias="), this.a, ')');
    }
}
