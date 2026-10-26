package defpackage;

import java.util.List;
import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public final class ce0 {
    public int a;
    public int b;
    public int c;
    public final Object d;

    public ce0(be0 be0Var) {
        this.c = 0;
        zq1.a(be0Var, "input");
        this.d = be0Var;
        be0Var.d = this;
    }

    public ce0(hq2 hq2Var) {
        this.d = hq2Var;
    }

    public static void y(int i) throws sr1 {
        if ((i & 3) != 0) {
            throw sr1.f();
        }
    }

    public static void z(int i) throws sr1 {
        if ((i & 7) != 0) {
            throw sr1.f();
        }
    }

    public int a() {
        int i = this.c;
        if (i != 0) {
            this.a = i;
            this.c = 0;
        } else {
            this.a = ((be0) this.d).G();
        }
        int i2 = this.a;
        return (i2 == 0 || i2 == this.b) ? IntCompanionObject.MAX_VALUE : i2 >>> 3;
    }

    public int b(int i) {
        return ((hq2) this.d).m[this.b + i];
    }

    public Object c(int i) {
        return ((hq2) this.d).o[this.c + i];
    }

    public void d(Object obj, za3 za3Var, b61 b61Var) {
        int i = this.b;
        this.b = ((this.a >>> 3) << 3) | 4;
        try {
            za3Var.i(obj, this, b61Var);
            if (this.a != this.b) {
                throw sr1.f();
            }
            this.b = i;
        } catch (Throwable th) {
            this.b = i;
            throw th;
        }
    }

    public void e(Object obj, za3 za3Var, b61 b61Var) throws sr1 {
        be0 be0Var = (be0) this.d;
        int iH = be0Var.H();
        if (be0Var.c >= 100) {
            throw new sr1("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int iQ = be0Var.q(iH);
        be0Var.c++;
        za3Var.i(obj, this, b61Var);
        be0Var.b(0);
        be0Var.c--;
        be0Var.o(iQ);
    }

    public void f(List list) throws sr1 {
        int iG;
        int iG2;
        be0 be0Var = (be0) this.d;
        boolean z = list instanceof aw;
        int i = this.a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Boolean.valueOf(be0Var.r()));
                    if (be0Var.h()) {
                        return;
                    } else {
                        iG = be0Var.G();
                    }
                } while (iG == this.a);
                this.c = iG;
                return;
            }
            if (i2 != 2) {
                throw sr1.c();
            }
            int iG3 = be0Var.g() + be0Var.H();
            do {
                list.add(Boolean.valueOf(be0Var.r()));
            } while (be0Var.g() < iG3);
            w(iG3);
            return;
        }
        aw awVar = (aw) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                awVar.d(be0Var.r());
                if (be0Var.h()) {
                    return;
                } else {
                    iG2 = be0Var.G();
                }
            } while (iG2 == this.a);
            this.c = iG2;
            return;
        }
        if (i3 != 2) {
            throw sr1.c();
        }
        int iG4 = be0Var.g() + be0Var.H();
        do {
            awVar.d(be0Var.r());
        } while (be0Var.g() < iG4);
        w(iG4);
    }

    public mz g() throws rr1 {
        x(2);
        return ((be0) this.d).s();
    }

    public void h(List list) throws rr1 {
        int iG;
        be0 be0Var = (be0) this.d;
        if ((this.a & 7) != 2) {
            throw sr1.c();
        }
        do {
            list.add(g());
            if (be0Var.h()) {
                return;
            } else {
                iG = be0Var.G();
            }
        } while (iG == this.a);
        this.c = iG;
    }

    public void i(List list) throws sr1 {
        int iG;
        int iG2;
        be0 be0Var = (be0) this.d;
        boolean z = list instanceof kx0;
        int i = this.a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 1) {
                do {
                    list.add(Double.valueOf(be0Var.t()));
                    if (be0Var.h()) {
                        return;
                    } else {
                        iG = be0Var.G();
                    }
                } while (iG == this.a);
                this.c = iG;
                return;
            }
            if (i2 != 2) {
                throw sr1.c();
            }
            int iH = be0Var.H();
            z(iH);
            int iG3 = be0Var.g() + iH;
            do {
                list.add(Double.valueOf(be0Var.t()));
            } while (be0Var.g() < iG3);
            return;
        }
        kx0 kx0Var = (kx0) list;
        int i3 = i & 7;
        if (i3 == 1) {
            do {
                kx0Var.d(be0Var.t());
                if (be0Var.h()) {
                    return;
                } else {
                    iG2 = be0Var.G();
                }
            } while (iG2 == this.a);
            this.c = iG2;
            return;
        }
        if (i3 != 2) {
            throw sr1.c();
        }
        int iH2 = be0Var.H();
        z(iH2);
        int iG4 = be0Var.g() + iH2;
        do {
            kx0Var.d(be0Var.t());
        } while (be0Var.g() < iG4);
    }

    public void j(List list) throws sr1 {
        int iG;
        int iG2;
        be0 be0Var = (be0) this.d;
        boolean z = list instanceof bq1;
        int i = this.a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(be0Var.u()));
                    if (be0Var.h()) {
                        return;
                    } else {
                        iG = be0Var.G();
                    }
                } while (iG == this.a);
                this.c = iG;
                return;
            }
            if (i2 != 2) {
                throw sr1.c();
            }
            int iG3 = be0Var.g() + be0Var.H();
            do {
                list.add(Integer.valueOf(be0Var.u()));
            } while (be0Var.g() < iG3);
            w(iG3);
            return;
        }
        bq1 bq1Var = (bq1) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                bq1Var.d(be0Var.u());
                if (be0Var.h()) {
                    return;
                } else {
                    iG2 = be0Var.G();
                }
            } while (iG2 == this.a);
            this.c = iG2;
            return;
        }
        if (i3 != 2) {
            throw sr1.c();
        }
        int iG4 = be0Var.g() + be0Var.H();
        do {
            bq1Var.d(be0Var.u());
        } while (be0Var.g() < iG4);
        w(iG4);
    }

    public void k(List list) throws sr1 {
        int iG;
        int iG2;
        be0 be0Var = (be0) this.d;
        boolean z = list instanceof bq1;
        int i = this.a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 2) {
                int iH = be0Var.H();
                y(iH);
                int iG3 = be0Var.g() + iH;
                do {
                    list.add(Integer.valueOf(be0Var.v()));
                } while (be0Var.g() < iG3);
                return;
            }
            if (i2 != 5) {
                throw sr1.c();
            }
            do {
                list.add(Integer.valueOf(be0Var.v()));
                if (be0Var.h()) {
                    return;
                } else {
                    iG = be0Var.G();
                }
            } while (iG == this.a);
            this.c = iG;
            return;
        }
        bq1 bq1Var = (bq1) list;
        int i3 = i & 7;
        if (i3 == 2) {
            int iH2 = be0Var.H();
            y(iH2);
            int iG4 = be0Var.g() + iH2;
            do {
                bq1Var.d(be0Var.v());
            } while (be0Var.g() < iG4);
            return;
        }
        if (i3 != 5) {
            throw sr1.c();
        }
        do {
            bq1Var.d(be0Var.v());
            if (be0Var.h()) {
                return;
            } else {
                iG2 = be0Var.G();
            }
        } while (iG2 == this.a);
        this.c = iG2;
    }

    public void l(List list) throws sr1 {
        int iG;
        int iG2;
        be0 be0Var = (be0) this.d;
        boolean z = list instanceof x72;
        int i = this.a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 1) {
                do {
                    list.add(Long.valueOf(be0Var.w()));
                    if (be0Var.h()) {
                        return;
                    } else {
                        iG = be0Var.G();
                    }
                } while (iG == this.a);
                this.c = iG;
                return;
            }
            if (i2 != 2) {
                throw sr1.c();
            }
            int iH = be0Var.H();
            z(iH);
            int iG3 = be0Var.g() + iH;
            do {
                list.add(Long.valueOf(be0Var.w()));
            } while (be0Var.g() < iG3);
            return;
        }
        x72 x72Var = (x72) list;
        int i3 = i & 7;
        if (i3 == 1) {
            do {
                x72Var.d(be0Var.w());
                if (be0Var.h()) {
                    return;
                } else {
                    iG2 = be0Var.G();
                }
            } while (iG2 == this.a);
            this.c = iG2;
            return;
        }
        if (i3 != 2) {
            throw sr1.c();
        }
        int iH2 = be0Var.H();
        z(iH2);
        int iG4 = be0Var.g() + iH2;
        do {
            x72Var.d(be0Var.w());
        } while (be0Var.g() < iG4);
    }

    public void m(List list) throws sr1 {
        int iG;
        int iG2;
        be0 be0Var = (be0) this.d;
        boolean z = list instanceof e81;
        int i = this.a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 2) {
                int iH = be0Var.H();
                y(iH);
                int iG3 = be0Var.g() + iH;
                do {
                    list.add(Float.valueOf(be0Var.x()));
                } while (be0Var.g() < iG3);
                return;
            }
            if (i2 != 5) {
                throw sr1.c();
            }
            do {
                list.add(Float.valueOf(be0Var.x()));
                if (be0Var.h()) {
                    return;
                } else {
                    iG = be0Var.G();
                }
            } while (iG == this.a);
            this.c = iG;
            return;
        }
        e81 e81Var = (e81) list;
        int i3 = i & 7;
        if (i3 == 2) {
            int iH2 = be0Var.H();
            y(iH2);
            int iG4 = be0Var.g() + iH2;
            do {
                e81Var.d(be0Var.x());
            } while (be0Var.g() < iG4);
            return;
        }
        if (i3 != 5) {
            throw sr1.c();
        }
        do {
            e81Var.d(be0Var.x());
            if (be0Var.h()) {
                return;
            } else {
                iG2 = be0Var.G();
            }
        } while (iG2 == this.a);
        this.c = iG2;
    }

    public void n(List list) throws sr1 {
        int iG;
        int iG2;
        be0 be0Var = (be0) this.d;
        boolean z = list instanceof bq1;
        int i = this.a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(be0Var.y()));
                    if (be0Var.h()) {
                        return;
                    } else {
                        iG = be0Var.G();
                    }
                } while (iG == this.a);
                this.c = iG;
                return;
            }
            if (i2 != 2) {
                throw sr1.c();
            }
            int iG3 = be0Var.g() + be0Var.H();
            do {
                list.add(Integer.valueOf(be0Var.y()));
            } while (be0Var.g() < iG3);
            w(iG3);
            return;
        }
        bq1 bq1Var = (bq1) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                bq1Var.d(be0Var.y());
                if (be0Var.h()) {
                    return;
                } else {
                    iG2 = be0Var.G();
                }
            } while (iG2 == this.a);
            this.c = iG2;
            return;
        }
        if (i3 != 2) {
            throw sr1.c();
        }
        int iG4 = be0Var.g() + be0Var.H();
        do {
            bq1Var.d(be0Var.y());
        } while (be0Var.g() < iG4);
        w(iG4);
    }

    public void o(List list) throws sr1 {
        int iG;
        int iG2;
        be0 be0Var = (be0) this.d;
        boolean z = list instanceof x72;
        int i = this.a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(be0Var.z()));
                    if (be0Var.h()) {
                        return;
                    } else {
                        iG = be0Var.G();
                    }
                } while (iG == this.a);
                this.c = iG;
                return;
            }
            if (i2 != 2) {
                throw sr1.c();
            }
            int iG3 = be0Var.g() + be0Var.H();
            do {
                list.add(Long.valueOf(be0Var.z()));
            } while (be0Var.g() < iG3);
            w(iG3);
            return;
        }
        x72 x72Var = (x72) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                x72Var.d(be0Var.z());
                if (be0Var.h()) {
                    return;
                } else {
                    iG2 = be0Var.G();
                }
            } while (iG2 == this.a);
            this.c = iG2;
            return;
        }
        if (i3 != 2) {
            throw sr1.c();
        }
        int iG4 = be0Var.g() + be0Var.H();
        do {
            x72Var.d(be0Var.z());
        } while (be0Var.g() < iG4);
        w(iG4);
    }

    public void p(List list) throws sr1 {
        int iG;
        int iG2;
        be0 be0Var = (be0) this.d;
        boolean z = list instanceof bq1;
        int i = this.a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 2) {
                int iH = be0Var.H();
                y(iH);
                int iG3 = be0Var.g() + iH;
                do {
                    list.add(Integer.valueOf(be0Var.A()));
                } while (be0Var.g() < iG3);
                return;
            }
            if (i2 != 5) {
                throw sr1.c();
            }
            do {
                list.add(Integer.valueOf(be0Var.A()));
                if (be0Var.h()) {
                    return;
                } else {
                    iG = be0Var.G();
                }
            } while (iG == this.a);
            this.c = iG;
            return;
        }
        bq1 bq1Var = (bq1) list;
        int i3 = i & 7;
        if (i3 == 2) {
            int iH2 = be0Var.H();
            y(iH2);
            int iG4 = be0Var.g() + iH2;
            do {
                bq1Var.d(be0Var.A());
            } while (be0Var.g() < iG4);
            return;
        }
        if (i3 != 5) {
            throw sr1.c();
        }
        do {
            bq1Var.d(be0Var.A());
            if (be0Var.h()) {
                return;
            } else {
                iG2 = be0Var.G();
            }
        } while (iG2 == this.a);
        this.c = iG2;
    }

    public void q(List list) throws sr1 {
        int iG;
        int iG2;
        be0 be0Var = (be0) this.d;
        boolean z = list instanceof x72;
        int i = this.a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 1) {
                do {
                    list.add(Long.valueOf(be0Var.B()));
                    if (be0Var.h()) {
                        return;
                    } else {
                        iG = be0Var.G();
                    }
                } while (iG == this.a);
                this.c = iG;
                return;
            }
            if (i2 != 2) {
                throw sr1.c();
            }
            int iH = be0Var.H();
            z(iH);
            int iG3 = be0Var.g() + iH;
            do {
                list.add(Long.valueOf(be0Var.B()));
            } while (be0Var.g() < iG3);
            return;
        }
        x72 x72Var = (x72) list;
        int i3 = i & 7;
        if (i3 == 1) {
            do {
                x72Var.d(be0Var.B());
                if (be0Var.h()) {
                    return;
                } else {
                    iG2 = be0Var.G();
                }
            } while (iG2 == this.a);
            this.c = iG2;
            return;
        }
        if (i3 != 2) {
            throw sr1.c();
        }
        int iH2 = be0Var.H();
        z(iH2);
        int iG4 = be0Var.g() + iH2;
        do {
            x72Var.d(be0Var.B());
        } while (be0Var.g() < iG4);
    }

    public void r(List list) throws sr1 {
        int iG;
        int iG2;
        be0 be0Var = (be0) this.d;
        boolean z = list instanceof bq1;
        int i = this.a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(be0Var.C()));
                    if (be0Var.h()) {
                        return;
                    } else {
                        iG = be0Var.G();
                    }
                } while (iG == this.a);
                this.c = iG;
                return;
            }
            if (i2 != 2) {
                throw sr1.c();
            }
            int iG3 = be0Var.g() + be0Var.H();
            do {
                list.add(Integer.valueOf(be0Var.C()));
            } while (be0Var.g() < iG3);
            w(iG3);
            return;
        }
        bq1 bq1Var = (bq1) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                bq1Var.d(be0Var.C());
                if (be0Var.h()) {
                    return;
                } else {
                    iG2 = be0Var.G();
                }
            } while (iG2 == this.a);
            this.c = iG2;
            return;
        }
        if (i3 != 2) {
            throw sr1.c();
        }
        int iG4 = be0Var.g() + be0Var.H();
        do {
            bq1Var.d(be0Var.C());
        } while (be0Var.g() < iG4);
        w(iG4);
    }

    public void s(List list) throws sr1 {
        int iG;
        int iG2;
        be0 be0Var = (be0) this.d;
        boolean z = list instanceof x72;
        int i = this.a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(be0Var.D()));
                    if (be0Var.h()) {
                        return;
                    } else {
                        iG = be0Var.G();
                    }
                } while (iG == this.a);
                this.c = iG;
                return;
            }
            if (i2 != 2) {
                throw sr1.c();
            }
            int iG3 = be0Var.g() + be0Var.H();
            do {
                list.add(Long.valueOf(be0Var.D()));
            } while (be0Var.g() < iG3);
            w(iG3);
            return;
        }
        x72 x72Var = (x72) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                x72Var.d(be0Var.D());
                if (be0Var.h()) {
                    return;
                } else {
                    iG2 = be0Var.G();
                }
            } while (iG2 == this.a);
            this.c = iG2;
            return;
        }
        if (i3 != 2) {
            throw sr1.c();
        }
        int iG4 = be0Var.g() + be0Var.H();
        do {
            x72Var.d(be0Var.D());
        } while (be0Var.g() < iG4);
        w(iG4);
    }

    public void t(List list, boolean z) throws rr1 {
        String strE;
        int iG;
        int iG2;
        be0 be0Var = (be0) this.d;
        if ((this.a & 7) != 2) {
            throw sr1.c();
        }
        if ((list instanceof p22) && !z) {
            p22 p22Var = (p22) list;
            do {
                p22Var.c(g());
                if (be0Var.h()) {
                    return;
                } else {
                    iG2 = be0Var.G();
                }
            } while (iG2 == this.a);
            this.c = iG2;
            return;
        }
        do {
            if (z) {
                x(2);
                strE = be0Var.F();
            } else {
                x(2);
                strE = be0Var.E();
            }
            list.add(strE);
            if (be0Var.h()) {
                return;
            } else {
                iG = be0Var.G();
            }
        } while (iG == this.a);
        this.c = iG;
    }

    public void u(List list) throws sr1 {
        int iG;
        int iG2;
        be0 be0Var = (be0) this.d;
        boolean z = list instanceof bq1;
        int i = this.a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(be0Var.H()));
                    if (be0Var.h()) {
                        return;
                    } else {
                        iG = be0Var.G();
                    }
                } while (iG == this.a);
                this.c = iG;
                return;
            }
            if (i2 != 2) {
                throw sr1.c();
            }
            int iG3 = be0Var.g() + be0Var.H();
            do {
                list.add(Integer.valueOf(be0Var.H()));
            } while (be0Var.g() < iG3);
            w(iG3);
            return;
        }
        bq1 bq1Var = (bq1) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                bq1Var.d(be0Var.H());
                if (be0Var.h()) {
                    return;
                } else {
                    iG2 = be0Var.G();
                }
            } while (iG2 == this.a);
            this.c = iG2;
            return;
        }
        if (i3 != 2) {
            throw sr1.c();
        }
        int iG4 = be0Var.g() + be0Var.H();
        do {
            bq1Var.d(be0Var.H());
        } while (be0Var.g() < iG4);
        w(iG4);
    }

    public void v(List list) throws sr1 {
        int iG;
        int iG2;
        be0 be0Var = (be0) this.d;
        boolean z = list instanceof x72;
        int i = this.a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(be0Var.I()));
                    if (be0Var.h()) {
                        return;
                    } else {
                        iG = be0Var.G();
                    }
                } while (iG == this.a);
                this.c = iG;
                return;
            }
            if (i2 != 2) {
                throw sr1.c();
            }
            int iG3 = be0Var.g() + be0Var.H();
            do {
                list.add(Long.valueOf(be0Var.I()));
            } while (be0Var.g() < iG3);
            w(iG3);
            return;
        }
        x72 x72Var = (x72) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                x72Var.d(be0Var.I());
                if (be0Var.h()) {
                    return;
                } else {
                    iG2 = be0Var.G();
                }
            } while (iG2 == this.a);
            this.c = iG2;
            return;
        }
        if (i3 != 2) {
            throw sr1.c();
        }
        int iG4 = be0Var.g() + be0Var.H();
        do {
            x72Var.d(be0Var.I());
        } while (be0Var.g() < iG4);
        w(iG4);
    }

    public void w(int i) throws sr1 {
        if (((be0) this.d).g() != i) {
            throw sr1.g();
        }
    }

    public void x(int i) throws rr1 {
        if ((this.a & 7) != i) {
            throw sr1.c();
        }
    }
}
