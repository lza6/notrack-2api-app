package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zr {
    public final float a;

    public /* synthetic */ zr(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zr) {
            return Float.compare(this.a, ((zr) obj).a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "BaselineShift(multiplier=" + this.a + ')';
    }
}
