package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yt implements a8 {
    public final float a;
    public final float b;

    public yt(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.a8
    public final long a(long j, long j2, dx1 dx1Var) {
        float f = (((int) (j2 >> 32)) - ((int) (j >> 32))) / 2.0f;
        float f2 = (((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f;
        dx1 dx1Var2 = dx1.c;
        float f3 = this.a;
        if (dx1Var != dx1Var2) {
            f3 *= -1.0f;
        }
        float f4 = (1.0f + this.b) * f2;
        int iRound = Math.round((f3 + 1.0f) * f);
        return (((long) Math.round(f4)) & 4294967295L) | (((long) iRound) << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yt)) {
            return false;
        }
        yt ytVar = (yt) obj;
        return Float.compare(this.a, ytVar.a) == 0 && Float.compare(this.b, ytVar.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BiasAlignment(horizontalBias=");
        sb.append(this.a);
        sb.append(", verticalBias=");
        return fq2.o(sb, this.b, ')');
    }
}
