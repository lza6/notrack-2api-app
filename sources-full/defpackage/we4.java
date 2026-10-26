package defpackage;

import kotlin.uuid.Uuid;
import org.scilab.forge.jlatexmath.FontInfo;

/* JADX INFO: loaded from: classes.dex */
public final class we4 {
    public final boolean a;
    public final String b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final double f;
    public final double g;
    public final float h;
    public final String i;

    public /* synthetic */ we4(String str, int i, float f, String str2, int i2) {
        this((i2 & 1) == 0, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? -1 : i, (i2 & 8) == 0, false, 0.0d, 0.0d, (i2 & Uuid.SIZE_BITS) != 0 ? 1.0f : f, (i2 & FontInfo.NUMBER_OF_CHAR_CODES) != 0 ? null : str2);
    }

    public we4(boolean z, String str, int i, boolean z2, boolean z3, double d, double d2, float f, String str2) {
        this.a = z;
        this.b = str;
        this.c = i;
        this.d = z2;
        this.e = z3;
        this.f = d;
        this.g = d2;
        this.h = f;
        this.i = str2;
    }

    public static we4 a(we4 we4Var, boolean z, boolean z2, double d, double d2, float f, String str, int i) {
        boolean z3 = we4Var.a;
        String str2 = we4Var.b;
        int i2 = we4Var.c;
        if ((i & 8) != 0) {
            z = we4Var.d;
        }
        boolean z4 = z;
        if ((i & 16) != 0) {
            z2 = we4Var.e;
        }
        boolean z5 = z2;
        double d3 = (i & 32) != 0 ? we4Var.f : d;
        double d4 = (i & 64) != 0 ? we4Var.g : d2;
        float f2 = (i & Uuid.SIZE_BITS) != 0 ? we4Var.h : f;
        String str3 = (i & FontInfo.NUMBER_OF_CHAR_CODES) != 0 ? we4Var.i : str;
        we4Var.getClass();
        return new we4(z3, str2, i2, z4, z5, d3, d4, f2, str3);
    }

    public final String b() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof we4)) {
            return false;
        }
        we4 we4Var = (we4) obj;
        return this.a == we4Var.a && kr1.n(this.b, we4Var.b) && this.c == we4Var.c && this.d == we4Var.d && this.e == we4Var.e && Double.compare(this.f, we4Var.f) == 0 && Double.compare(this.g, we4Var.g) == 0 && Float.compare(this.h, we4Var.h) == 0 && kr1.n(this.i, we4Var.i);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        String str = this.b;
        int iD = fq2.d(this.h, (Double.hashCode(this.g) + ((Double.hashCode(this.f) + ud2.k(ud2.k(fq2.e(this.c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.d), 31, this.e)) * 31)) * 31, 31);
        String str2 = this.i;
        return iD + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "State(active=" + this.a + ", messageId=" + this.b + ", answerIndex=" + this.c + ", busy=" + this.d + ", paused=" + this.e + ", playedSeconds=" + this.f + ", totalSeconds=" + this.g + ", rate=" + this.h + ", voiceName=" + this.i + ")";
    }
}
