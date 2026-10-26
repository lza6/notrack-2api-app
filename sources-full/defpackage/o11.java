package defpackage;

import app.template.extension.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class o11 {
    public final bk a;
    public int b;
    public int c;
    public int d;
    public int e;

    public o11(hg hgVar, long j) {
        String str = hgVar.d;
        bk bkVar = new bk();
        bkVar.d = str;
        bkVar.b = -1;
        bkVar.c = -1;
        this.a = bkVar;
        this.b = jz3.f(j);
        this.c = jz3.e(j);
        this.d = -1;
        this.e = -1;
        int iF = jz3.f(j);
        int iE = jz3.e(j);
        if (iF < 0 || iF > str.length()) {
            m51.h(str.length(), ud2.s("start (", ") offset is outside of text region ", iF));
            throw null;
        }
        if (iE < 0 || iE > str.length()) {
            m51.h(str.length(), ud2.s("end (", ") offset is outside of text region ", iE));
            throw null;
        }
        if (iF <= iE) {
            return;
        }
        u41.k(ud2.l(iF, iE, "Do not set reversed range: ", " > "));
        throw null;
    }

    public final void a(int i, int i2) {
        long jD = p23.d(i, i2);
        this.a.r(i, i2, BuildConfig.VERSION_NAME);
        long jW = sf3.W(p23.d(this.b, this.c), jD);
        h(jz3.f(jW));
        g(jz3.e(jW));
        int i3 = this.d;
        if (i3 != -1) {
            long jW2 = sf3.W(p23.d(i3, this.e), jD);
            if (jz3.c(jW2)) {
                this.d = -1;
                this.e = -1;
            } else {
                this.d = jz3.f(jW2);
                this.e = jz3.e(jW2);
            }
        }
    }

    public final char b(int i) {
        bk bkVar = this.a;
        ze1 ze1Var = (ze1) bkVar.e;
        if (ze1Var != null && i >= bkVar.b) {
            int iA = ze1Var.b - ze1Var.a();
            int i2 = bkVar.b;
            if (i >= iA + i2) {
                return ((String) bkVar.d).charAt(i - ((iA - bkVar.c) + i2));
            }
            int i3 = i - i2;
            int i4 = ze1Var.d;
            char[] cArr = ze1Var.c;
            return i3 < i4 ? cArr[i3] : cArr[(i3 - i4) + ze1Var.e];
        }
        return ((String) bkVar.d).charAt(i);
    }

    public final jz3 c() {
        int i = this.d;
        if (i != -1) {
            return new jz3(p23.d(i, this.e));
        }
        return null;
    }

    public final void d(int i, int i2, String str) {
        bk bkVar = this.a;
        if (i < 0 || i > bkVar.g()) {
            m51.h(bkVar.g(), ud2.s("start (", ") offset is outside of text region ", i));
            return;
        }
        if (i2 < 0 || i2 > bkVar.g()) {
            m51.h(bkVar.g(), ud2.s("end (", ") offset is outside of text region ", i2));
        } else {
            if (i > i2) {
                u41.k(ud2.l(i, i2, "Do not set reversed range: ", " > "));
                return;
            }
            bkVar.r(i, i2, str);
            h(str.length() + i);
            g(str.length() + i);
            this.d = -1;
            this.e = -1;
        }
    }

    public final void e(int i, int i2) {
        bk bkVar = this.a;
        if (i < 0 || i > bkVar.g()) {
            m51.h(bkVar.g(), ud2.s("start (", ") offset is outside of text region ", i));
        } else if (i2 < 0 || i2 > bkVar.g()) {
            m51.h(bkVar.g(), ud2.s("end (", ") offset is outside of text region ", i2));
        } else if (i >= i2) {
            u41.k(ud2.l(i, i2, "Do not set reversed or empty range: ", " > "));
        } else {
            this.d = i;
            this.e = i2;
        }
    }

    public final void f(int i, int i2) {
        bk bkVar = this.a;
        if (i < 0 || i > bkVar.g()) {
            m51.h(bkVar.g(), ud2.s("start (", ") offset is outside of text region ", i));
        } else if (i2 < 0 || i2 > bkVar.g()) {
            m51.h(bkVar.g(), ud2.s("end (", ") offset is outside of text region ", i2));
        } else if (i > i2) {
            u41.k(ud2.l(i, i2, "Do not set reversed range: ", " > "));
        } else {
            h(i);
            g(i2);
        }
    }

    public final void g(int i) {
        if (!(i >= 0)) {
            qo1.a("Cannot set selectionEnd to a negative value: " + i);
        }
        this.c = i;
    }

    public final void h(int i) {
        if (!(i >= 0)) {
            qo1.a("Cannot set selectionStart to a negative value: " + i);
        }
        this.b = i;
    }

    public final String toString() {
        return this.a.toString();
    }
}
