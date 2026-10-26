package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ut implements y7 {
    public final float a;

    public ut(float f) {
        this.a = f;
    }

    @Override // defpackage.y7
    public final int a(int i, int i2, dx1 dx1Var) {
        return Math.round((1.0f + this.a) * ((i2 - i) / 2.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ut) && Float.compare(this.a, ((ut) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return fq2.o(new StringBuilder("Horizontal(bias="), this.a, ')');
    }
}
