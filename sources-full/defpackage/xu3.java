package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xu3 {
    public static final xu3 f = new xu3(false, 9205357640488583168L, 0.0f, u53.c, false);
    public final boolean a;
    public final long b;
    public final float c;
    public final u53 d;
    public final boolean e;

    public xu3(boolean z, long j, float f2, u53 u53Var, boolean z2) {
        this.a = z;
        this.b = j;
        this.c = f2;
        this.d = u53Var;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xu3)) {
            return false;
        }
        xu3 xu3Var = (xu3) obj;
        return this.a == xu3Var.a && ln2.c(this.b, xu3Var.b) && Float.compare(this.c, xu3Var.c) == 0 && this.d == xu3Var.d && this.e == xu3Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + fq2.d(this.c, ud2.h(Boolean.hashCode(this.a) * 31, 31, this.b), 31)) * 31);
    }

    public final String toString() {
        return "TextFieldHandleState(visible=" + this.a + ", position=" + ((Object) ln2.k(this.b)) + ", lineHeight=" + this.c + ", direction=" + this.d + ", handlesCrossed=" + this.e + ')';
    }
}
