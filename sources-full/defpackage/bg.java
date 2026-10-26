package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bg extends cg {
    public float a;
    public float b;
    public float c;
    public float d;

    public bg(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    @Override // defpackage.cg
    public final float a(int i) {
        if (i == 0) {
            return this.a;
        }
        if (i == 1) {
            return this.b;
        }
        if (i == 2) {
            return this.c;
        }
        if (i != 3) {
            return 0.0f;
        }
        return this.d;
    }

    @Override // defpackage.cg
    public final int b() {
        return 4;
    }

    @Override // defpackage.cg
    public final cg c() {
        return new bg(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // defpackage.cg
    public final void d() {
        this.a = 0.0f;
        this.b = 0.0f;
        this.c = 0.0f;
        this.d = 0.0f;
    }

    @Override // defpackage.cg
    public final void e(float f, int i) {
        if (i == 0) {
            this.a = f;
            return;
        }
        if (i == 1) {
            this.b = f;
        } else if (i == 2) {
            this.c = f;
        } else {
            if (i != 3) {
                return;
            }
            this.d = f;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bg)) {
            return false;
        }
        bg bgVar = (bg) obj;
        return bgVar.a == this.a && bgVar.b == this.b && bgVar.c == this.c && bgVar.d == this.d;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + fq2.d(this.c, fq2.d(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return "AnimationVector4D: v1 = " + this.a + ", v2 = " + this.b + ", v3 = " + this.c + ", v4 = " + this.d;
    }
}
