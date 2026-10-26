package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xu0 implements wu0 {
    public final float c;
    public final float d;

    public xu0(float f, float f2) {
        this.c = f;
        this.d = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xu0)) {
            return false;
        }
        xu0 xu0Var = (xu0) obj;
        return Float.compare(this.c, xu0Var.c) == 0 && Float.compare(this.d, xu0Var.d) == 0;
    }

    @Override // defpackage.wu0
    public final float getDensity() {
        return this.c;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + (Float.hashCode(this.c) * 31);
    }

    @Override // defpackage.wu0
    public final float l() {
        return this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DensityImpl(density=");
        sb.append(this.c);
        sb.append(", fontScale=");
        return fq2.o(sb, this.d, ')');
    }
}
