package defpackage;

import androidx.work.OverwritingInputMerger;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.uuid.Uuid;
import org.scilab.forge.jlatexmath.FontInfo;

/* JADX INFO: loaded from: classes.dex */
public final class hi4 {
    public static final /* synthetic */ int y = 0;
    public final String a;
    public int b;
    public final String c;
    public final String d;
    public final or0 e;
    public final or0 f;
    public long g;
    public long h;
    public long i;
    public tm0 j;
    public final int k;
    public final int l;
    public final long m;
    public long n;
    public final long o;
    public final long p;
    public boolean q;
    public final int r;
    public final int s;
    public final int t;
    public final long u;
    public final int v;
    public final int w;
    public String x;

    static {
        v72.h("WorkSpec");
    }

    public hi4(String str, int i, String str2, String str3, or0 or0Var, or0 or0Var2, long j, long j2, long j3, tm0 tm0Var, int i2, int i3, long j4, long j5, long j6, long j7, boolean z, int i4, int i5, int i6, long j8, int i7, int i8, String str4) {
        str.getClass();
        if (i == 0) {
            throw null;
        }
        str2.getClass();
        str3.getClass();
        or0Var.getClass();
        or0Var2.getClass();
        tm0Var.getClass();
        if (i3 == 0 || i4 == 0) {
            throw null;
        }
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = str3;
        this.e = or0Var;
        this.f = or0Var2;
        this.g = j;
        this.h = j2;
        this.i = j3;
        this.j = tm0Var;
        this.k = i2;
        this.l = i3;
        this.m = j4;
        this.n = j5;
        this.o = j6;
        this.p = j7;
        this.q = z;
        this.r = i4;
        this.s = i5;
        this.t = i6;
        this.u = j8;
        this.v = i7;
        this.w = i8;
        this.x = str4;
    }

    public /* synthetic */ hi4(String str, int i, String str2, String str3, or0 or0Var, or0 or0Var2, long j, long j2, long j3, tm0 tm0Var, int i2, int i3, long j4, long j5, long j6, long j7, boolean z, int i4, int i5, long j8, int i6, int i7, String str4, int i8) {
        this(str, (i8 & 2) != 0 ? 1 : i, str2, (i8 & 8) != 0 ? OverwritingInputMerger.class.getName() : str3, (i8 & 16) != 0 ? or0.b : or0Var, (i8 & 32) != 0 ? or0.b : or0Var2, (i8 & 64) != 0 ? 0L : j, (i8 & Uuid.SIZE_BITS) != 0 ? 0L : j2, (i8 & FontInfo.NUMBER_OF_CHAR_CODES) != 0 ? 0L : j3, (i8 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? tm0.j : tm0Var, (i8 & 1024) != 0 ? 0 : i2, (i8 & 2048) != 0 ? 1 : i3, (i8 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? 30000L : j4, (i8 & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? -1L : j5, (i8 & 16384) == 0 ? j6 : 0L, (32768 & i8) != 0 ? -1L : j7, (65536 & i8) != 0 ? false : z, (131072 & i8) != 0 ? 1 : i4, (262144 & i8) != 0 ? 0 : i5, 0, (1048576 & i8) != 0 ? Long.MAX_VALUE : j8, (2097152 & i8) != 0 ? 0 : i6, (4194304 & i8) != 0 ? -256 : i7, (i8 & 8388608) != 0 ? null : str4);
    }

    public static hi4 b(hi4 hi4Var, String str, int i, String str2, or0 or0Var, int i2, long j, int i3, int i4, long j2, int i5, int i6) {
        String str3 = (i6 & 1) != 0 ? hi4Var.a : str;
        int i7 = (i6 & 2) != 0 ? hi4Var.b : i;
        String str4 = (i6 & 4) != 0 ? hi4Var.c : str2;
        String str5 = hi4Var.d;
        or0 or0Var2 = (i6 & 16) != 0 ? hi4Var.e : or0Var;
        or0 or0Var3 = hi4Var.f;
        long j3 = hi4Var.g;
        long j4 = hi4Var.h;
        long j5 = hi4Var.i;
        tm0 tm0Var = hi4Var.j;
        int i8 = (i6 & 1024) != 0 ? hi4Var.k : i2;
        int i9 = hi4Var.l;
        long j6 = hi4Var.m;
        long j7 = (i6 & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? hi4Var.n : j;
        long j8 = hi4Var.o;
        long j9 = hi4Var.p;
        boolean z = hi4Var.q;
        int i10 = hi4Var.r;
        int i11 = (i6 & 262144) != 0 ? hi4Var.s : i3;
        int i12 = (i6 & 524288) != 0 ? hi4Var.t : i4;
        long j10 = (i6 & 1048576) != 0 ? hi4Var.u : j2;
        int i13 = (i6 & 2097152) != 0 ? hi4Var.v : i5;
        int i14 = hi4Var.w;
        String str6 = hi4Var.x;
        hi4Var.getClass();
        str3.getClass();
        if (i7 == 0) {
            throw null;
        }
        str4.getClass();
        str5.getClass();
        or0Var2.getClass();
        or0Var3.getClass();
        tm0Var.getClass();
        if (i9 == 0 || i10 == 0) {
            throw null;
        }
        return new hi4(str3, i7, str4, str5, or0Var2, or0Var3, j3, j4, j5, tm0Var, i8, i9, j6, j7, j8, j9, z, i10, i11, i12, j10, i13, i14, str6);
    }

    public final long a() {
        int i = this.b;
        int i2 = this.k;
        boolean z = i == 1 && i2 > 0;
        long j = this.n;
        boolean zD = d();
        long j2 = this.g;
        long j3 = this.i;
        long j4 = this.h;
        int i3 = this.l;
        if (i3 == 0) {
            throw null;
        }
        long j5 = this.u;
        int i4 = this.s;
        if (j5 != LongCompanionObject.MAX_VALUE && zD) {
            if (i4 != 0) {
                long j6 = j + 900000;
                if (j5 < j6) {
                    return j6;
                }
            }
            return j5;
        }
        if (!z) {
            if (!zD) {
                return j == -1 ? LongCompanionObject.MAX_VALUE : j + j2;
            }
            long j7 = i4 == 0 ? j + j2 : j + j4;
            return (j3 == j4 || i4 != 0) ? j7 : (j4 - j3) + j7;
        }
        long j8 = this.m;
        long jScalb = i3 == 2 ? j8 * ((long) i2) : (long) Math.scalb(j8, i2 - 1);
        if (jScalb > 18000000) {
            jScalb = 18000000;
        }
        return j + jScalb;
    }

    public final boolean c() {
        return !kr1.n(tm0.j, this.j);
    }

    public final boolean d() {
        return this.h != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hi4)) {
            return false;
        }
        hi4 hi4Var = (hi4) obj;
        return kr1.n(this.a, hi4Var.a) && this.b == hi4Var.b && kr1.n(this.c, hi4Var.c) && kr1.n(this.d, hi4Var.d) && kr1.n(this.e, hi4Var.e) && kr1.n(this.f, hi4Var.f) && this.g == hi4Var.g && this.h == hi4Var.h && this.i == hi4Var.i && kr1.n(this.j, hi4Var.j) && this.k == hi4Var.k && this.l == hi4Var.l && this.m == hi4Var.m && this.n == hi4Var.n && this.o == hi4Var.o && this.p == hi4Var.p && this.q == hi4Var.q && this.r == hi4Var.r && this.s == hi4Var.s && this.t == hi4Var.t && this.u == hi4Var.u && this.v == hi4Var.v && this.w == hi4Var.w && kr1.n(this.x, hi4Var.x);
    }

    public final int hashCode() {
        int iE = fq2.e(this.w, fq2.e(this.v, ud2.h(fq2.e(this.t, fq2.e(this.s, (fq2.z(this.r) + ud2.k(ud2.h(ud2.h(ud2.h(ud2.h((fq2.z(this.l) + fq2.e(this.k, (this.j.hashCode() + ud2.h(ud2.h(ud2.h((this.f.hashCode() + ((this.e.hashCode() + ud2.i(ud2.i((fq2.z(this.b) + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d)) * 31)) * 31, 31, this.g), 31, this.h), 31, this.i)) * 31, 31)) * 31, 31, this.m), 31, this.n), 31, this.o), 31, this.p), 31, this.q)) * 31, 31), 31), 31, this.u), 31), 31);
        String str = this.x;
        return iE + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return ud2.r(new StringBuilder("{WorkSpec: "), this.a, '}');
    }
}
