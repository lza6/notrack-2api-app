package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class e42 implements dc1 {
    public final float a;

    public e42(float f) {
        this.a = f;
    }

    @Override // defpackage.dc1
    public final float a(float f) {
        return f / this.a;
    }

    @Override // defpackage.dc1
    public final float b(float f) {
        return f * this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e42) && Float.compare(this.a, ((e42) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return fq2.o(new StringBuilder("LinearFontScaleConverter(fontScale="), this.a, ')');
    }
}
