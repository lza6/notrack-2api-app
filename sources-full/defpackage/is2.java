package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class is2 implements hs2 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public is2(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        if (!((f >= 0.0f) & (f2 >= 0.0f) & (f3 >= 0.0f)) || !(f4 >= 0.0f)) {
            no1.a("Padding must be non-negative");
        }
    }

    @Override // defpackage.hs2
    public final float a(dx1 dx1Var) {
        return dx1Var == dx1.c ? this.a : this.c;
    }

    @Override // defpackage.hs2
    public final float b(dx1 dx1Var) {
        return dx1Var == dx1.c ? this.c : this.a;
    }

    @Override // defpackage.hs2
    public final float c() {
        return this.d;
    }

    @Override // defpackage.hs2
    public final float d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof is2)) {
            return false;
        }
        is2 is2Var = (is2) obj;
        return rx0.a(this.a, is2Var.a) && rx0.a(this.b, is2Var.b) && rx0.a(this.c, is2Var.c) && rx0.a(this.d, is2Var.d);
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + fq2.d(this.c, fq2.d(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return "PaddingValues(start=" + ((Object) rx0.b(this.a)) + ", top=" + ((Object) rx0.b(this.b)) + ", end=" + ((Object) rx0.b(this.c)) + ", bottom=" + ((Object) rx0.b(this.d)) + ')';
    }
}
