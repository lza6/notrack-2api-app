package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pq0 {
    public final int a;
    public final float b;
    public final float c;
    public final float d;

    public pq0(int i, float f, float f2, float f3) {
        this.a = i;
        this.b = f;
        this.c = f2;
        this.d = f3;
    }

    public static pq0 a(pq0 pq0Var, int i, float f, float f2, float f3, int i2) {
        if ((i2 & 1) != 0) {
            i = pq0Var.a;
        }
        if ((i2 & 2) != 0) {
            f = pq0Var.b;
        }
        if ((i2 & 4) != 0) {
            f2 = pq0Var.c;
        }
        if ((i2 & 8) != 0) {
            f3 = pq0Var.d;
        }
        pq0Var.getClass();
        return new pq0(i, f, f2, f3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pq0)) {
            return false;
        }
        pq0 pq0Var = (pq0) obj;
        return this.a == pq0Var.a && Float.compare(this.b, pq0Var.b) == 0 && Float.compare(this.c, pq0Var.c) == 0 && Float.compare(this.d, pq0Var.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + fq2.d(this.c, fq2.d(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return "CropState(rot=" + this.a + ", zoom=" + this.b + ", tx=" + this.c + ", ty=" + this.d + ")";
    }
}
