package defpackage;

import androidx.compose.foundation.text.input.internal.c;
import app.template.extension.BuildConfig;
import okhttp3.Protocol$Companion;

/* JADX INFO: loaded from: classes.dex */
public final class kw3 {
    public final c a;
    public final xy3 b;
    public final boolean c;
    public final float d;
    public final lw3 e;
    public final au3 f;
    public final se3 g;
    public long h;
    public qf4 i;
    public final String j;

    public kw3(c cVar, xy3 xy3Var, boolean z, float f, lw3 lw3Var) {
        this.a = cVar;
        this.b = xy3Var;
        this.c = z;
        this.d = f;
        this.e = lw3Var;
        pk3 currentThreadSnapshot = Protocol$Companion.getCurrentThreadSnapshot();
        le1 le1VarE = currentThreadSnapshot != null ? currentThreadSnapshot.e() : null;
        pk3 pk3VarMakeCurrentNonObservable = Protocol$Companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            au3 au3VarD = cVar.d();
            this.f = au3VarD;
            this.g = (se3) cVar.d.getValue();
            Protocol$Companion.restoreNonObservable(currentThreadSnapshot, pk3VarMakeCurrentNonObservable, le1VarE);
            this.h = au3VarD.h;
            this.j = au3VarD.d.toString();
        } catch (Throwable th) {
            Protocol$Companion.restoreNonObservable(currentThreadSnapshot, pk3VarMakeCurrentNonObservable, le1VarE);
            throw th;
        }
    }

    public final void a() {
        if (this.j.length() > 0) {
            au3 au3Var = this.f;
            boolean zC = jz3.c(au3Var.h);
            c cVar = this.a;
            if (zC) {
                c.i(cVar, BuildConfig.VERSION_NAME, p23.d((int) (au3Var.h >> 32), (int) (this.h & 4294967295L)), !this.c, 4);
            } else {
                cVar.c();
            }
            this.h = this.a.d().h;
            this.i = qf4.c;
        }
    }

    public final boolean b() {
        xy3 xy3Var = this.b;
        if (xy3Var == null) {
            return true;
        }
        long j = this.h;
        int i = jz3.c;
        return xy3Var.h((int) (j & 4294967295L)) == u53.c;
    }

    public final int c(xy3 xy3Var, int i) {
        long j = this.h;
        int i2 = jz3.c;
        int i3 = (int) (j & 4294967295L);
        lw3 lw3Var = this.e;
        if (Float.isNaN(lw3Var.a)) {
            lw3Var.a = xy3Var.c(i3).a;
        }
        pg2 pg2Var = xy3Var.b;
        int iD = pg2Var.d(i3) + i;
        if (iD < 0) {
            return 0;
        }
        if (iD >= pg2Var.f) {
            return this.j.length();
        }
        float fB = pg2Var.b(iD) - 1.0f;
        float f = lw3Var.a;
        if ((b() && f >= xy3Var.f(iD)) || (!b() && f <= xy3Var.e(iD))) {
            return pg2Var.c(iD, true);
        }
        return pg2Var.g((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(fB)) & 4294967295L));
    }

    public final int d(int i) {
        long j = this.f.h;
        int i2 = jz3.c;
        int i3 = (int) (j & 4294967295L);
        xy3 xy3Var = this.b;
        if (xy3Var != null) {
            pg2 pg2Var = xy3Var.b;
            float f = this.d;
            if (!Float.isNaN(f)) {
                h43 h43VarI = xy3Var.c(i3).i(0.0f, f * i);
                float f2 = h43VarI.d;
                float f3 = h43VarI.b;
                float fB = pg2Var.b(pg2Var.e(f3));
                if (Math.abs(f3 - fB) > Math.abs(f2 - fB)) {
                    return pg2Var.g(h43VarI.e());
                }
                return pg2Var.g((((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(h43VarI.a) << 32));
            }
        }
        return i3;
    }

    public final void e() {
        String str = this.j;
        if (str.length() > 0) {
            long j = this.h;
            int i = jz3.c;
            int i2 = (int) (j & 4294967295L);
            xy3 xy3Var = this.b;
            long jP = g13.p(xy3Var != null ? c(xy3Var, 1) : str.length(), i2, this.a);
            int i3 = (int) (jP >> 32);
            qf4 qf4VarJ = jr1.j(jP);
            if (i3 != i2 || !jz3.c(this.h)) {
                this.h = p23.d(i3, i3);
            }
            if (qf4VarJ != null) {
                this.i = qf4VarJ;
            }
        }
    }

    public final void f() {
        if (this.j.length() > 0) {
            long j = this.h;
            int i = jz3.c;
            int i2 = (int) (j & 4294967295L);
            long jP = g13.p(d(1), i2, this.a);
            int i3 = (int) (jP >> 32);
            qf4 qf4VarJ = jr1.j(jP);
            if (i3 != i2 || !jz3.c(this.h)) {
                this.h = p23.d(i3, i3);
            }
            if (qf4VarJ != null) {
                this.i = qf4VarJ;
            }
        }
    }

    public final void g() {
        this.e.a = Float.NaN;
        String str = this.j;
        if (str.length() > 0) {
            long j = this.h;
            int i = jz3.c;
            int i2 = (int) (j & 4294967295L);
            long jP = g13.p(sf3.y(i2, str), i2, this.a);
            int i3 = (int) (jP >> 32);
            qf4 qf4VarJ = jr1.j(jP);
            if (i3 != i2 || !jz3.c(this.h)) {
                this.h = p23.d(i3, i3);
            }
            if (qf4VarJ != null) {
                this.i = qf4VarJ;
            }
        }
    }

    public final void h() {
        this.e.a = Float.NaN;
        String str = this.j;
        if (str.length() > 0) {
            long j = this.h;
            int i = (int) (4294967295L & j);
            int iY = yh4.y(jz3.e(j), str);
            if (iY == jz3.e(this.h) && iY != str.length()) {
                iY = yh4.y(iY + 1, str);
            }
            long jP = g13.p(iY, i, this.a);
            int i2 = (int) (jP >> 32);
            qf4 qf4VarJ = jr1.j(jP);
            if (i2 != i || !jz3.c(this.h)) {
                this.h = p23.d(i2, i2);
            }
            if (qf4VarJ != null) {
                this.i = qf4VarJ;
            }
        }
    }

    public final void i() {
        int length;
        this.e.a = Float.NaN;
        String str = this.j;
        if (str.length() > 0) {
            long j = this.h;
            int i = jz3.c;
            int i2 = (int) (j & 4294967295L);
            xy3 xy3Var = this.b;
            if (xy3Var != null) {
                int i3 = i2;
                while (true) {
                    au3 au3Var = this.f;
                    if (i3 < au3Var.d.length()) {
                        int length2 = str.length() - 1;
                        if (i3 <= length2) {
                            length2 = i3;
                        }
                        long j2 = xy3Var.j(length2);
                        int i4 = jz3.c;
                        int i5 = (int) (j2 & 4294967295L);
                        if (i5 > i3) {
                            length = i5;
                            break;
                        }
                        i3++;
                    } else {
                        length = au3Var.d.length();
                        break;
                    }
                }
            } else {
                length = str.length();
            }
            long jP = g13.p(length, i2, this.a);
            int i6 = (int) (jP >> 32);
            qf4 qf4VarJ = jr1.j(jP);
            if (i6 != i2 || !jz3.c(this.h)) {
                this.h = p23.d(i6, i6);
            }
            if (qf4VarJ != null) {
                this.i = qf4VarJ;
            }
        }
    }

    public final void j() {
        this.e.a = Float.NaN;
        String str = this.j;
        if (str.length() > 0) {
            long j = this.h;
            int i = jz3.c;
            int i2 = (int) (j & 4294967295L);
            long jP = g13.p(sf3.z(i2, str), i2, this.a);
            int i3 = (int) (jP >> 32);
            qf4 qf4VarJ = jr1.j(jP);
            if (i3 != i2 || !jz3.c(this.h)) {
                this.h = p23.d(i3, i3);
            }
            if (qf4VarJ != null) {
                this.i = qf4VarJ;
            }
        }
    }

    public final void k() {
        this.e.a = Float.NaN;
        String str = this.j;
        if (str.length() > 0) {
            long j = this.h;
            int i = (int) (4294967295L & j);
            int iZ = yh4.z(jz3.f(j), str);
            if (iZ == jz3.f(this.h) && iZ != 0) {
                iZ = yh4.z(iZ - 1, str);
            }
            long jP = g13.p(iZ, i, this.a);
            int i2 = (int) (jP >> 32);
            qf4 qf4VarJ = jr1.j(jP);
            if (i2 != i || !jz3.c(this.h)) {
                this.h = p23.d(i2, i2);
            }
            if (qf4VarJ != null) {
                this.i = qf4VarJ;
            }
        }
    }

    public final void l() {
        this.e.a = Float.NaN;
        String str = this.j;
        if (str.length() > 0) {
            long j = this.h;
            int i = jz3.c;
            int i2 = (int) (j & 4294967295L);
            int i3 = 0;
            xy3 xy3Var = this.b;
            if (xy3Var != null) {
                for (int i4 = i2; i4 > 0; i4--) {
                    int length = str.length() - 1;
                    if (i4 <= length) {
                        length = i4;
                    }
                    long j2 = xy3Var.j(length);
                    int i5 = jz3.c;
                    int i6 = (int) (j2 >> 32);
                    if (i6 < i4) {
                        i3 = i6;
                        break;
                    }
                }
            }
            long jP = g13.p(i3, i2, this.a);
            int i7 = (int) (jP >> 32);
            qf4 qf4VarJ = jr1.j(jP);
            if (i7 != i2 || !jz3.c(this.h)) {
                this.h = p23.d(i7, i7);
            }
            if (qf4VarJ != null) {
                this.i = qf4VarJ;
            }
        }
    }

    public final void m() {
        this.e.a = Float.NaN;
        String str = this.j;
        if (str.length() > 0) {
            long j = this.h;
            int i = jz3.c;
            int i2 = (int) (j & 4294967295L);
            long jP = g13.p(str.length(), i2, this.a);
            int i3 = (int) (jP >> 32);
            qf4 qf4VarJ = jr1.j(jP);
            if (i3 != i2 || !jz3.c(this.h)) {
                this.h = p23.d(i3, i3);
            }
            if (qf4VarJ != null) {
                this.i = qf4VarJ;
            }
        }
    }

    public final void n() {
        this.e.a = Float.NaN;
        if (this.j.length() > 0) {
            long j = this.h;
            int i = jz3.c;
            int i2 = (int) (j & 4294967295L);
            long jP = g13.p(0, i2, this.a);
            int i3 = (int) (jP >> 32);
            qf4 qf4VarJ = jr1.j(jP);
            if (i3 != i2 || !jz3.c(this.h)) {
                this.h = p23.d(i3, i3);
            }
            if (qf4VarJ != null) {
                this.i = qf4VarJ;
            }
        }
    }

    public final void o() {
        int length;
        this.e.a = Float.NaN;
        String str = this.j;
        if (str.length() > 0) {
            long j = this.h;
            int i = jz3.c;
            int i2 = (int) (4294967295L & j);
            xy3 xy3Var = this.b;
            if (xy3Var != null) {
                pg2 pg2Var = xy3Var.b;
                length = pg2Var.c(pg2Var.d(jz3.e(j)), true);
            } else {
                length = str.length();
            }
            long jP = g13.p(length, i2, this.a);
            int i3 = (int) (jP >> 32);
            qf4 qf4VarJ = jr1.j(jP);
            if (i3 != i2 || !jz3.c(this.h)) {
                this.h = p23.d(i3, i3);
            }
            if (qf4VarJ != null) {
                this.i = qf4VarJ;
            }
        }
    }

    public final void p() {
        int iG;
        this.e.a = Float.NaN;
        if (this.j.length() > 0) {
            long j = this.h;
            int i = jz3.c;
            int i2 = (int) (4294967295L & j);
            xy3 xy3Var = this.b;
            if (xy3Var != null) {
                iG = xy3Var.g(xy3Var.b.d(jz3.f(j)));
            } else {
                iG = 0;
            }
            long jP = g13.p(iG, i2, this.a);
            int i3 = (int) (jP >> 32);
            qf4 qf4VarJ = jr1.j(jP);
            if (i3 != i2 || !jz3.c(this.h)) {
                this.h = p23.d(i3, i3);
            }
            if (qf4VarJ != null) {
                this.i = qf4VarJ;
            }
        }
    }

    public final void q() {
        if (this.j.length() > 0) {
            long j = this.h;
            int i = jz3.c;
            int i2 = (int) (j & 4294967295L);
            xy3 xy3Var = this.b;
            long jP = g13.p(xy3Var != null ? c(xy3Var, -1) : 0, i2, this.a);
            int i3 = (int) (jP >> 32);
            qf4 qf4VarJ = jr1.j(jP);
            if (i3 != i2 || !jz3.c(this.h)) {
                this.h = p23.d(i3, i3);
            }
            if (qf4VarJ != null) {
                this.i = qf4VarJ;
            }
        }
    }

    public final void r() {
        if (this.j.length() > 0) {
            long j = this.h;
            int i = jz3.c;
            int i2 = (int) (j & 4294967295L);
            long jP = g13.p(d(-1), i2, this.a);
            int i3 = (int) (jP >> 32);
            qf4 qf4VarJ = jr1.j(jP);
            if (i3 != i2 || !jz3.c(this.h)) {
                this.h = p23.d(i3, i3);
            }
            if (qf4VarJ != null) {
                this.i = qf4VarJ;
            }
        }
    }

    public final void s() {
        if (this.j.length() > 0) {
            long j = this.f.h;
            int i = jz3.c;
            this.h = p23.d((int) (j >> 32), (int) (this.h & 4294967295L));
        }
    }
}
