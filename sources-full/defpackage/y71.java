package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class y71 {
    public final float a;
    public final float b;

    public y71(float f, wu0 wu0Var) {
        this.a = f;
        float density = wu0Var.getDensity();
        float f2 = z71.a;
        this.b = density * 386.0878f * 160.0f * 0.84f;
    }

    public final x71 a(float f) {
        double dB = b(f);
        double d = z71.a;
        double d2 = d - 1.0d;
        return new x71(f, (float) (Math.exp((d / d2) * dB) * ((double) (this.a * this.b))), (long) (Math.exp(dB / d2) * 1000.0d));
    }

    public final double b(float f) {
        float[] fArr = fb.a;
        return Math.log(((double) (Math.abs(f) * 0.35f)) / ((double) (this.a * this.b)));
    }
}
