package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class c42 {
    public static final c42 c = new c42(z32.c, 17);
    public final float a;
    public final int b;

    public c42(float f, int i) {
        this.a = f;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c42)) {
            return false;
        }
        c42 c42Var = (c42) obj;
        float f = c42Var.a;
        float f2 = z32.b;
        return Float.compare(this.a, f) == 0 && this.b == c42Var.b;
    }

    public final int hashCode() {
        float f = z32.b;
        return Integer.hashCode(0) + fq2.e(this.b, Float.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("LineHeightStyle(alignment=");
        sb.append((Object) z32.b(this.a));
        sb.append(", trim=");
        int i = this.b;
        if (i == 1) {
            str = "LineHeightStyle.Trim.FirstLineTop";
        } else if (i == 16) {
            str = "LineHeightStyle.Trim.LastLineBottom";
        } else if (i == 17) {
            str = "LineHeightStyle.Trim.Both";
        } else {
            str = i == 0 ? "LineHeightStyle.Trim.None" : "Invalid";
        }
        sb.append((Object) str);
        sb.append(",mode=Mode(value=0))");
        return sb.toString();
    }
}
