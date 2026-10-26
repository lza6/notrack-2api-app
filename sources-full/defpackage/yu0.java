package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yu0 implements wu0 {
    public final float c;
    public final float d;
    public final dc1 h;

    public yu0(float f, float f2, dc1 dc1Var) {
        this.c = f;
        this.d = f2;
        this.h = dc1Var;
    }

    @Override // defpackage.wu0
    public final float E(long j) {
        if (zz3.a(yz3.b(j), 4294967296L)) {
            return this.h.b(yz3.c(j));
        }
        u41.r("Only Sp can convert to Px");
        return 0.0f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yu0)) {
            return false;
        }
        yu0 yu0Var = (yu0) obj;
        return Float.compare(this.c, yu0Var.c) == 0 && Float.compare(this.d, yu0Var.d) == 0 && this.h.equals(yu0Var.h);
    }

    @Override // defpackage.wu0
    public final float getDensity() {
        return this.c;
    }

    public final int hashCode() {
        return this.h.hashCode() + fq2.d(this.d, Float.hashCode(this.c) * 31, 31);
    }

    @Override // defpackage.wu0
    public final float l() {
        return this.d;
    }

    @Override // defpackage.wu0
    public final long t(float f) {
        return gm4.L(this.h.a(f), 4294967296L);
    }

    public final String toString() {
        return "DensityWithConverter(density=" + this.c + ", fontScale=" + this.d + ", converter=" + this.h + ')';
    }
}
