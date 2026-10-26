package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class e63 {
    public l53 a;
    public n13 b;
    public String d;
    public hh1 e;
    public m33 g;
    public f63 h;
    public f63 i;
    public f63 j;
    public long k;
    public long l;
    public sd m;
    public int c = -1;
    public sh1 f = new sh1();

    public static void b(f63 f63Var, String str) {
        if (f63Var != null) {
            if (f63Var.o != null) {
                u41.h(str.concat(".body != null"));
                return;
            }
            if (f63Var.p != null) {
                u41.h(str.concat(".networkResponse != null"));
            } else if (f63Var.q != null) {
                u41.h(str.concat(".cacheResponse != null"));
            } else {
                if (f63Var.r == null) {
                    return;
                }
                u41.h(str.concat(".priorResponse != null"));
            }
        }
    }

    public final f63 a() {
        int i = this.c;
        if (i < 0) {
            m51.p(this.c, "code < 0: ");
            return null;
        }
        l53 l53Var = this.a;
        if (l53Var == null) {
            u41.r("request == null");
            return null;
        }
        n13 n13Var = this.b;
        if (n13Var == null) {
            u41.r("protocol == null");
            return null;
        }
        String str = this.d;
        if (str != null) {
            return new f63(l53Var, n13Var, str, i, this.e, this.f.c(), this.g, this.h, this.i, this.j, this.k, this.l, this.m);
        }
        u41.r("message == null");
        return null;
    }
}
