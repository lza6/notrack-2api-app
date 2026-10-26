package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yf extends cg {
    public float a;

    public yf(float f) {
        this.a = f;
    }

    @Override // defpackage.cg
    public final float a(int i) {
        if (i == 0) {
            return this.a;
        }
        return 0.0f;
    }

    @Override // defpackage.cg
    public final int b() {
        return 1;
    }

    @Override // defpackage.cg
    public final cg c() {
        return new yf(0.0f);
    }

    @Override // defpackage.cg
    public final void d() {
        this.a = 0.0f;
    }

    @Override // defpackage.cg
    public final void e(float f, int i) {
        if (i == 0) {
            this.a = f;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof yf) && ((yf) obj).a == this.a;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "AnimationVector1D: value = " + this.a;
    }
}
