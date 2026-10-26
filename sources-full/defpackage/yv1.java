package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yv1 {
    public static final yv1 g = new yv1(0, 127);
    public final int a;
    public final Boolean b;
    public final int c;
    public final int d;
    public final Boolean e;
    public final g72 f;

    public /* synthetic */ yv1(int i, int i2) {
        this((i2 & 1) != 0 ? -1 : 3, null, (i2 & 4) != 0 ? 0 : 7, (i2 & 8) != 0 ? -1 : i, null, null);
    }

    public yv1(int i, Boolean bool, int i2, int i3, Boolean bool2, g72 g72Var) {
        this.a = i;
        this.b = bool;
        this.c = i2;
        this.d = i3;
        this.e = bool2;
        this.f = g72Var;
    }

    public final int a() {
        int i = this.d;
        en1 en1Var = new en1(i);
        if (i == -1) {
            en1Var = null;
        }
        if (en1Var != null) {
            return en1Var.a;
        }
        return 1;
    }

    public final boolean b() {
        return this.a == -1 && this.b == null && this.c == 0 && this.d == -1 && this.e == null && this.f == null;
    }

    public final in1 c(boolean z) {
        int i = this.a;
        xv1 xv1Var = new xv1(i);
        if (i == -1) {
            xv1Var = null;
        }
        int i2 = xv1Var != null ? xv1Var.a : 0;
        Boolean bool = this.b;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : true;
        int i3 = this.c;
        zv1 zv1Var = i3 != 0 ? new zv1(i3) : null;
        int i4 = zv1Var != null ? zv1Var.a : 1;
        int iA = a();
        g72 g72Var = this.f;
        if (g72Var == null) {
            g72Var = g72.h;
        }
        return new in1(z, i2, zBooleanValue, i4, iA, g72Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yv1)) {
            return false;
        }
        yv1 yv1Var = (yv1) obj;
        return this.a == yv1Var.a && kr1.n(this.b, yv1Var.b) && this.c == yv1Var.c && this.d == yv1Var.d && kr1.n(this.e, yv1Var.e) && kr1.n(this.f, yv1Var.f);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        Boolean bool = this.b;
        int iE = fq2.e(this.d, fq2.e(this.c, (iHashCode + (bool != null ? bool.hashCode() : 0)) * 31, 31), 961);
        Boolean bool2 = this.e;
        int iHashCode2 = (iE + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        g72 g72Var = this.f;
        return iHashCode2 + (g72Var != null ? g72Var.c.hashCode() : 0);
    }

    public final String toString() {
        return "KeyboardOptions(capitalization=" + ((Object) xv1.a(this.a)) + ", autoCorrectEnabled=" + this.b + ", keyboardType=" + ((Object) zv1.a(this.c)) + ", imeAction=" + ((Object) en1.a(this.d)) + ", platformImeOptions=nullshowKeyboardOnFocus=" + this.e + ", hintLocales=" + this.f + ')';
    }
}
