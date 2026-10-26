package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class eb {
    public final float a;
    public final float b;

    public eb(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eb)) {
            return false;
        }
        eb ebVar = (eb) obj;
        return Float.compare(this.a, ebVar.a) == 0 && Float.compare(this.b, ebVar.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FlingResult(distanceCoefficient=");
        sb.append(this.a);
        sb.append(", velocityCoefficient=");
        return fq2.o(sb, this.b, ')');
    }
}
