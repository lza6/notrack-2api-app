package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class od0 implements pd0 {
    public final float a;
    public final float b;

    public od0(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean a(Comparable comparable, Comparable comparable2) {
        return ((Number) comparable).floatValue() <= ((Number) comparable2).floatValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof od0)) {
            return false;
        }
        float f = this.a;
        float f2 = this.b;
        if (f > f2) {
            od0 od0Var = (od0) obj;
            if (od0Var.a > od0Var.b) {
                return true;
            }
        }
        od0 od0Var2 = (od0) obj;
        return f == od0Var2.a && f2 == od0Var2.b;
    }

    public final int hashCode() {
        float f = this.a;
        float f2 = this.b;
        if (f > f2) {
            return -1;
        }
        return Float.hashCode(f2) + (Float.hashCode(f) * 31);
    }

    public final String toString() {
        return this.a + ".." + this.b;
    }
}
