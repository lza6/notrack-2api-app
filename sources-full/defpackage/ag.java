package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ag extends cg {
    public float a;
    public float b;
    public float c;

    public ag(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    @Override // defpackage.cg
    public final float a(int i) {
        if (i == 0) {
            return this.a;
        }
        if (i == 1) {
            return this.b;
        }
        if (i != 2) {
            return 0.0f;
        }
        return this.c;
    }

    @Override // defpackage.cg
    public final int b() {
        return 3;
    }

    @Override // defpackage.cg
    public final cg c() {
        return new ag(0.0f, 0.0f, 0.0f);
    }

    @Override // defpackage.cg
    public final void d() {
        this.a = 0.0f;
        this.b = 0.0f;
        this.c = 0.0f;
    }

    @Override // defpackage.cg
    public final void e(float f, int i) {
        if (i == 0) {
            this.a = f;
        } else if (i == 1) {
            this.b = f;
        } else {
            if (i != 2) {
                return;
            }
            this.c = f;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ag)) {
            return false;
        }
        ag agVar = (ag) obj;
        return agVar.a == this.a && agVar.b == this.b && agVar.c == this.c;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + fq2.d(this.b, Float.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return "AnimationVector3D: v1 = " + this.a + ", v2 = " + this.b + ", v3 = " + this.c;
    }
}
