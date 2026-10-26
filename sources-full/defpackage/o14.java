package defpackage;

import java.util.Arrays;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes.dex */
public final class o14 {
    public static final char[] r;
    public static final int[] s;
    public final p30 a;
    public final ht2 b;
    public n14 d;
    public m14 i;
    public final l14 j;
    public final k14 k;
    public final g14 l;
    public final i14 m;
    public final h14 n;
    public String o;
    public final int[] p;
    public final int[] q;
    public e44 c = e44.c;
    public boolean e = false;
    public String f = null;
    public final StringBuilder g = new StringBuilder(1024);
    public final StringBuilder h = new StringBuilder(1024);

    static {
        char[] cArr = {'\t', '\n', '\r', '\f', ' ', Typography.less, Typography.amp};
        r = cArr;
        s = new int[]{8364, 129, 8218, 402, 8222, 8230, 8224, 8225, 710, 8240, 352, 8249, 338, 141, 381, 143, 144, 8216, 8217, 8220, 8221, 8226, 8211, 8212, 732, 8482, 353, 8250, 339, 157, 382, 376};
        Arrays.sort(cArr);
    }

    public o14(p30 p30Var, ht2 ht2Var) {
        l14 l14Var = new l14(2);
        l14Var.j = new kn();
        this.j = l14Var;
        this.k = new k14(3);
        this.l = new g14(5);
        this.m = new i14();
        this.n = new h14();
        this.p = new int[1];
        this.q = new int[2];
        this.a = p30Var;
        this.b = ht2Var;
    }

    public final void a(e44 e44Var) {
        this.a.a();
        this.c = e44Var;
    }

    public final void b(String str) {
        ht2 ht2Var = this.b;
        if (ht2Var.size() < 0) {
            p30 p30Var = this.a;
            ht2Var.add(new du(p30Var.f + p30Var.e, "Invalid character reference: %s", new Object[]{str}));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
    
        if (java.util.Arrays.binarySearch(defpackage.o14.r, r4[r1.e]) >= 0) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int[] c(java.lang.Character r18, boolean r19) {
        /*
            Method dump skipped, instruction units count: 493
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o14.c(java.lang.Character, boolean):int[]");
    }

    public final m14 d(boolean z) {
        m14 m14Var;
        if (z) {
            m14Var = this.j;
            m14Var.a();
        } else {
            m14Var = this.k;
            m14Var.a();
        }
        this.i = m14Var;
        return m14Var;
    }

    public final void e() {
        n14.b(this.h);
    }

    public final void f(char c) {
        h(String.valueOf(c));
    }

    public final void g(n14 n14Var) {
        if (this.e) {
            u41.k("There is an unread token pending!");
            return;
        }
        this.d = n14Var;
        this.e = true;
        int i = n14Var.a;
        if (i == 2) {
            this.o = ((l14) n14Var).b;
            return;
        }
        if (i != 3 || ((k14) n14Var).j == null) {
            return;
        }
        ht2 ht2Var = this.b;
        if (ht2Var.size() < 0) {
            p30 p30Var = this.a;
            int i2 = p30Var.f + p30Var.e;
            du duVar = new du(1);
            duVar.b = i2;
            duVar.c = "Attributes incorrectly present on end tag";
            ht2Var.add(duVar);
        }
    }

    public final void h(String str) {
        if (this.f == null) {
            this.f = str;
            return;
        }
        StringBuilder sb = this.g;
        if (sb.length() == 0) {
            sb.append(this.f);
        }
        sb.append(str);
    }

    public final void i() {
        g(this.n);
    }

    public final void j() {
        g(this.m);
    }

    public final void k() {
        m14 m14Var = this.i;
        if (m14Var.d != null) {
            m14Var.i();
        }
        g(this.i);
    }

    public final void l(e44 e44Var) {
        ht2 ht2Var = this.b;
        if (ht2Var.size() < 0) {
            p30 p30Var = this.a;
            ht2Var.add(new du(p30Var.f + p30Var.e, "Unexpectedly reached end of file (EOF) in input state [%s]", new Object[]{e44Var}));
        }
    }

    public final void m(e44 e44Var) {
        ht2 ht2Var = this.b;
        if (ht2Var.size() < 0) {
            p30 p30Var = this.a;
            ht2Var.add(new du(p30Var.f + p30Var.e, "Unexpected character '%s' in input state [%s]", new Object[]{Character.valueOf(p30Var.i()), e44Var}));
        }
    }

    public final boolean n() {
        return this.o != null && this.i.h().equalsIgnoreCase(this.o);
    }
}
