package defpackage;

import androidx.compose.ui.graphics.vector.ImageVector$Companion;

/* JADX INFO: loaded from: classes.dex */
public final class ym1 {
    public static final ImageVector$Companion k;
    public static int l;
    public static final ImageVector$Companion m;
    public final String a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final ob4 f;
    public final long g;
    public final int h;
    public final boolean i;
    public final int j;

    static {
        ImageVector$Companion imageVector$Companion = new ImageVector$Companion();
        k = imageVector$Companion;
        m = imageVector$Companion;
    }

    public ym1(String str, float f, float f2, float f3, float f4, ob4 ob4Var, long j, int i, boolean z) {
        int i2;
        synchronized (m) {
            i2 = l;
            l = i2 + 1;
        }
        this.a = str;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = ob4Var;
        this.g = j;
        this.h = i;
        this.i = z;
        this.j = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ym1)) {
            return false;
        }
        ym1 ym1Var = (ym1) obj;
        return kr1.n(this.a, ym1Var.a) && rx0.a(this.b, ym1Var.b) && rx0.a(this.c, ym1Var.c) && this.d == ym1Var.d && this.e == ym1Var.e && this.f.equals(ym1Var.f) && re0.c(this.g, ym1Var.g) && this.h == ym1Var.h && this.i == ym1Var.i;
    }

    public final int hashCode() {
        int iHashCode = (this.f.hashCode() + fq2.d(this.e, fq2.d(this.d, fq2.d(this.c, fq2.d(this.b, this.a.hashCode() * 31, 31), 31), 31), 31)) * 31;
        int i = re0.j;
        return Boolean.hashCode(this.i) + fq2.e(this.h, ud2.h(iHashCode, 31, this.g), 31);
    }
}
