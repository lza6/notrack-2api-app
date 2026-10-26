package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zf extends cg {
    public float a;
    public float b;

    public zf(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.cg
    public final float a(int i) {
        if (i == 0) {
            return this.a;
        }
        if (i != 1) {
            return 0.0f;
        }
        return this.b;
    }

    @Override // defpackage.cg
    public final int b() {
        return 2;
    }

    @Override // defpackage.cg
    public final cg c() {
        return new zf(0.0f, 0.0f);
    }

    @Override // defpackage.cg
    public final void d() {
        this.a = 0.0f;
        this.b = 0.0f;
    }

    @Override // defpackage.cg
    public final void e(float f, int i) {
        if (i == 0) {
            this.a = f;
        } else {
            if (i != 1) {
                return;
            }
            this.b = f;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zf)) {
            return false;
        }
        zf zfVar = (zf) obj;
        return zfVar.a == this.a && zfVar.b == this.b;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "AnimationVector2D: v1 = " + this.a + ", v2 = " + this.b;
    }
}
