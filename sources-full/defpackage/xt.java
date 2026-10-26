package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xt implements z7 {
    public final float a;

    public xt(float f) {
        this.a = f;
    }

    public final int a(int i, int i2) {
        return Math.round((1.0f + this.a) * ((i2 - i) / 2.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xt) && Float.compare(this.a, ((xt) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return fq2.o(new StringBuilder("Vertical(bias="), this.a, ')');
    }
}
