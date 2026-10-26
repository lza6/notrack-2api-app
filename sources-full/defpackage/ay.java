package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ay implements hy3 {
    public final ng3 a;
    public final float b;

    public ay(ng3 ng3Var, float f) {
        this.a = ng3Var;
        this.b = f;
    }

    @Override // defpackage.hy3
    public final long a() {
        int i = re0.j;
        return re0.i;
    }

    @Override // defpackage.hy3
    public final yx b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ay)) {
            return false;
        }
        ay ayVar = (ay) obj;
        return kr1.n(this.a, ayVar.a) && Float.compare(this.b, ayVar.b) == 0;
    }

    @Override // defpackage.hy3
    public final float getAlpha() {
        return this.b;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BrushStyle(value=");
        sb.append(this.a);
        sb.append(", alpha=");
        return fq2.o(sb, this.b, ')');
    }
}
