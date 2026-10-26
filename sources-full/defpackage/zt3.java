package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zt3 implements Appendable {
    public final rq1 c;
    public final jt2 d;
    public mi4 h;
    public long l;
    public jz3 m;
    public oi2 n;
    public ps2 o;

    /* JADX WARN: Multi-variable type inference failed */
    public zt3(au3 au3Var, mi4 mi4Var, rq1 rq1Var, int i) {
        oi2 oi2Var = null;
        mi4Var = (i & 2) != 0 ? null : mi4Var;
        this.c = (i & 8) != 0 ? null : rq1Var;
        jt2 jt2Var = new jt2();
        jt2Var.c = au3Var;
        jt2Var.h = -1;
        jt2Var.l = -1;
        this.d = jt2Var;
        this.h = mi4Var != null ? new mi4(mi4Var) : null;
        long j = au3Var.h;
        List list = au3Var.c;
        this.l = j;
        this.m = au3Var.l;
        if (list != null && !list.isEmpty()) {
            int size = list.size();
            pj2 pj2Var = new pj2(21, au3Var);
            gg[] ggVarArr = new gg[size];
            for (int i2 = 0; i2 < size; i2++) {
                ggVarArr[i2] = pj2Var.invoke(Integer.valueOf(i2));
            }
            oi2Var = new oi2(size, ggVarArr);
        }
        this.n = oi2Var;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0022  */
    public static au3 g(zt3 zt3Var, long j, jz3 jz3Var, int i) {
        List list;
        if ((i & 1) != 0) {
            j = zt3Var.l;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            jz3Var = zt3Var.m;
        }
        jz3 jz3Var2 = jz3Var;
        oi2 oi2Var = zt3Var.n;
        if (oi2Var != null) {
            List listH = oi2Var.h();
            if (((th2) listH).isEmpty()) {
                list = null;
            } else {
                list = listH;
            }
        } else {
            list = null;
        }
        return new au3(zt3Var.d.toString(), j2, jz3Var2, list, 8);
    }

    public final mi4 a() {
        mi4 mi4Var = this.h;
        if (mi4Var != null) {
            return mi4Var;
        }
        mi4 mi4Var2 = new mi4((mi4) null);
        this.h = mi4Var2;
        return mi4Var2;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c) {
        jt2 jt2Var = this.d;
        b(jt2Var.length(), jt2Var.length(), 1);
        int length = jt2Var.length();
        int length2 = jt2Var.length();
        String strValueOf = String.valueOf(c);
        jt2Var.a(length, length2, strValueOf.length(), strValueOf);
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        if (charSequence != null) {
            jt2 jt2Var = this.d;
            b(jt2Var.length(), jt2Var.length(), charSequence.length());
            jt2Var.a(jt2Var.length(), jt2Var.length(), charSequence.length(), charSequence);
        }
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        if (charSequence != null) {
            jt2 jt2Var = this.d;
            b(jt2Var.length(), jt2Var.length(), i2 - i);
            int length = jt2Var.length();
            int length2 = jt2Var.length();
            CharSequence charSequenceSubSequence = charSequence.subSequence(i, i2);
            jt2Var.a(length, length2, charSequenceSubSequence.length(), charSequenceSubSequence);
        }
        return this;
    }

    public final void b(int i, int i2, int i3) {
        int i4;
        mi4 mi4VarA = a();
        if (i != i2 || i3 != 0) {
            int iMin = Math.min(i, i2);
            int iMax = Math.max(i, i2);
            int i5 = i3 - (iMax - iMin);
            int i6 = 0;
            u20 u20Var = null;
            boolean z = false;
            while (true) {
                oi2 oi2Var = (oi2) mi4VarA.d;
                if (i6 >= oi2Var.h) {
                    break;
                }
                u20 u20Var2 = (u20) oi2Var.c[i6];
                int i7 = u20Var2.a;
                if ((iMin > i7 || i7 > iMax) && ((iMin > (i4 = u20Var2.b) || i4 > iMax) && ((iMin > i4 || i7 > iMin) && (iMax > i4 || i7 > iMax)))) {
                    if (i7 > iMax && !z) {
                        mi4VarA.c(u20Var, iMin, iMax, i5);
                        z = true;
                    }
                    if (z) {
                        u20Var2.a += i5;
                        u20Var2.b += i5;
                    }
                    ((oi2) mi4VarA.h).c(u20Var2);
                } else if (u20Var == null) {
                    u20Var = u20Var2;
                } else {
                    u20Var.b = u20Var2.b;
                    u20Var.d = u20Var2.d;
                }
                i6++;
            }
            if (!z) {
                mi4VarA.c(u20Var, iMin, iMax, i5);
            }
            oi2 oi2Var2 = (oi2) mi4VarA.d;
            mi4VarA.d = (oi2) mi4VarA.h;
            mi4VarA.h = oi2Var2;
            oi2Var2.i();
        }
        rq1 rq1Var = this.c;
        if (rq1Var != null) {
            rq1Var.i(i, i2, i3);
        }
        this.l = y64.g(this.l, i, i2, i3);
    }

    public final void c(int i, int i2, CharSequence charSequence) {
        int length = charSequence.length();
        if (i > i2) {
            so1.a("Expected start=" + i + " <= end=" + i2);
        }
        if (length < 0) {
            so1.a("Expected textStart=0 <= textEnd=" + length);
        }
        b(i, i2, length);
        this.d.a(i, i2, length, charSequence);
        e(null);
        this.o = null;
    }

    public final void d(int i, int i2, List list) {
        jt2 jt2Var = this.d;
        if (i < 0 || i > jt2Var.length()) {
            m51.h(jt2Var.length(), ud2.s("start (", ") offset is outside of text region ", i));
            return;
        }
        if (i2 < 0 || i2 > jt2Var.length()) {
            m51.h(jt2Var.length(), ud2.s("end (", ") offset is outside of text region ", i2));
            return;
        }
        if (i >= i2) {
            u41.k(ud2.l(i, i2, "Do not set reversed or empty range: ", " > "));
            return;
        }
        e(new jz3(p23.d(i, i2)));
        oi2 oi2Var = this.n;
        if (oi2Var != null) {
            oi2Var.i();
        }
        if (list == null || list.isEmpty()) {
            return;
        }
        if (this.n == null) {
            this.n = new oi2(0, new gg[16]);
        }
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            gg ggVar = (gg) list.get(i3);
            oi2 oi2Var2 = this.n;
            if (oi2Var2 != null) {
                oi2Var2.c(gg.a(ggVar, null, ggVar.b + i, ggVar.c + i, 9));
            }
        }
    }

    public final void e(jz3 jz3Var) {
        if (jz3Var != null && !jz3.c(jz3Var.a)) {
            this.m = jz3Var;
            return;
        }
        this.m = null;
        oi2 oi2Var = this.n;
        if (oi2Var != null) {
            oi2Var.i();
        }
    }

    public final void f(long j) {
        long jD = p23.d(0, this.d.length());
        if (!jz3.a(jD, j)) {
            so1.a("Expected " + ((Object) jz3.h(j)) + " to be in " + ((Object) jz3.h(jD)));
        }
        this.l = j;
        this.o = null;
    }

    public final String toString() {
        return this.d.toString();
    }
}
