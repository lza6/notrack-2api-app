package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vo3 extends uz0 {
    public final float a;
    public final float b;
    public final int c;
    public final int d;

    public vo3(int i, float f, int i2, float f2, int i3) {
        f2 = (i3 & 2) != 0 ? 4.0f : f2;
        i = (i3 & 4) != 0 ? 0 : i;
        i2 = (i3 & 8) != 0 ? 0 : i2;
        this.a = f;
        this.b = f2;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vo3)) {
            return false;
        }
        vo3 vo3Var = (vo3) obj;
        return this.a == vo3Var.a && this.b == vo3Var.b && this.c == vo3Var.c && this.d == vo3Var.d;
    }

    public final int hashCode() {
        return fq2.e(this.d, fq2.e(this.c, fq2.d(this.b, Float.hashCode(this.a) * 31, 31), 31), 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Stroke(width=");
        sb.append(this.a);
        sb.append(", miter=");
        sb.append(this.b);
        sb.append(", cap=");
        String str2 = "Unknown";
        int i = this.c;
        if (i == 0) {
            str = "Butt";
        } else if (i == 1) {
            str = "Round";
        } else {
            str = i == 2 ? "Square" : "Unknown";
        }
        sb.append((Object) str);
        sb.append(", join=");
        int i2 = this.d;
        if (i2 == 0) {
            str2 = "Miter";
        } else if (i2 == 1) {
            str2 = "Round";
        } else if (i2 == 2) {
            str2 = "Bevel";
        }
        sb.append((Object) str2);
        sb.append(", pathEffect=null)");
        return sb.toString();
    }
}
