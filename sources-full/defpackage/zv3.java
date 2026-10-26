package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zv3 {
    public static final sb3 g = new sb3(6);
    public final xb2 a;
    public final dx1 b;
    public final kb1 c;
    public final long d;
    public final float e;
    public final float f;

    public zv3(xb2 xb2Var, dx1 dx1Var, kb1 kb1Var, long j) {
        this.a = xb2Var;
        this.b = dx1Var;
        this.c = kb1Var;
        this.d = j;
        this.e = xb2Var.getDensity();
        this.f = xb2Var.l();
    }

    public final String toString() {
        return "MeasureInputs(density=" + this.a + ", densityValue=" + this.e + ", fontScale=" + this.f + ", layoutDirection=" + this.b + ", fontFamilyResolver=" + this.c + ", constraints=" + ((Object) um0.l(this.d)) + ')';
    }
}
