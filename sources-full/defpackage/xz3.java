package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xz3 {
    public static final zf3 i = new zf3(7);
    public final int a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final long f;
    public final boolean g;
    public final yt3 h;

    public xz3(int i2, String str, String str2, long j, long j2, long j3, boolean z, int i3) {
        j3 = (i3 & 32) != 0 ? System.currentTimeMillis() : j3;
        z = (i3 & 64) != 0 ? true : z;
        this.a = i2;
        this.b = str;
        this.c = str2;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = z;
        if (str.length() == 0 && str2.length() == 0) {
            u41.k("Either pre or post text must not be empty");
            throw null;
        }
        this.h = (str.length() != 0 || str2.length() <= 0) ? (str.length() <= 0 || str2.length() != 0) ? yt3.h : yt3.d : yt3.c;
    }

    public final vt3 a() {
        yt3 yt3Var = this.h;
        yt3 yt3Var2 = yt3.d;
        vt3 vt3Var = vt3.l;
        if (yt3Var != yt3Var2) {
            return vt3Var;
        }
        long j = this.e;
        if (!jz3.c(j)) {
            return vt3Var;
        }
        long j2 = this.d;
        if (jz3.c(j2)) {
            return ((int) (j2 >> 32)) > ((int) (j >> 32)) ? vt3.c : vt3.d;
        }
        return (((int) (j2 >> 32)) == ((int) (j >> 32)) && ((int) (j2 >> 32)) == this.a) ? vt3.h : vt3Var;
    }
}
