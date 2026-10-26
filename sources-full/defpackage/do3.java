package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class do3 {
    public final wu a;
    public final rs1 b;
    public final gj4 c;
    public final do3[] d;
    public final zf3 e;
    public final ws1 f;
    public boolean g;
    public String h;
    public String i;

    public do3(wu wuVar, rs1 rs1Var, gj4 gj4Var, do3[] do3VarArr) {
        wuVar.getClass();
        this.a = wuVar;
        this.b = rs1Var;
        this.c = gj4Var;
        this.d = do3VarArr;
        this.e = rs1Var.b;
        this.f = rs1Var.a;
        int iOrdinal = gj4Var.ordinal();
        if (do3VarArr != null) {
            do3 do3Var = do3VarArr[iOrdinal];
            if (do3Var == null && do3Var == this) {
                return;
            }
            do3VarArr[iOrdinal] = this;
        }
    }

    public final do3 a(tf3 tf3Var) {
        do3 do3Var;
        tf3Var.getClass();
        rs1 rs1Var = this.b;
        gj4 gj4VarB = hj4.b(rs1Var, tf3Var);
        char c = gj4VarB.c;
        wu wuVar = this.a;
        wuVar.g(c);
        wuVar.a = true;
        String str = this.h;
        if (str != null) {
            String strB = this.i;
            if (strB == null) {
                strB = tf3Var.b();
            }
            wuVar.e();
            wuVar.k(str);
            wuVar.g(':');
            t(strB);
            this.h = null;
            this.i = null;
        }
        if (this.c == gj4VarB) {
            return this;
        }
        do3[] do3VarArr = this.d;
        return (do3VarArr == null || (do3Var = do3VarArr[gj4VarB.ordinal()]) == null) ? new do3(wuVar, rs1Var, gj4VarB, do3VarArr) : do3Var;
    }

    public final void b(boolean z) {
        if (this.g) {
            t(String.valueOf(z));
        } else {
            ((kn4) this.a.b).p(String.valueOf(z));
        }
    }

    public final void c(tf3 tf3Var, int i, boolean z) {
        tf3Var.getClass();
        g(tf3Var, i);
        b(z);
    }

    public final void d(byte b) {
        if (this.g) {
            t(String.valueOf((int) b));
        } else {
            this.a.f(b);
        }
    }

    public final void e(char c) {
        t(String.valueOf(c));
    }

    public final void f(double d) {
        boolean z = this.g;
        wu wuVar = this.a;
        if (z) {
            t(String.valueOf(d));
        } else {
            ((kn4) wuVar.b).p(String.valueOf(d));
        }
        if (Double.isInfinite(d) || Double.isNaN(d)) {
            throw vl0.b(Double.valueOf(d), ((kn4) wuVar.b).toString());
        }
    }

    public final void g(tf3 tf3Var, int i) {
        tf3Var.getClass();
        int iOrdinal = this.c.ordinal();
        wu wuVar = this.a;
        boolean z = true;
        if (iOrdinal == 1) {
            if (!wuVar.a) {
                wuVar.g(',');
            }
            wuVar.e();
            return;
        }
        if (iOrdinal == 2) {
            if (wuVar.a) {
                this.g = true;
                wuVar.e();
                return;
            }
            if (i % 2 == 0) {
                wuVar.g(',');
                wuVar.e();
            } else {
                wuVar.g(':');
                wuVar.l();
                z = false;
            }
            this.g = z;
            return;
        }
        if (iOrdinal != 3) {
            if (!wuVar.a) {
                wuVar.g(',');
            }
            wuVar.e();
            ot1.a(this.b, tf3Var);
            t(tf3Var.e(i));
            wuVar.g(':');
            wuVar.l();
            return;
        }
        if (i == 0) {
            this.g = true;
        }
        if (i == 1) {
            wuVar.g(',');
            wuVar.l();
            this.g = false;
        }
    }

    public final void h(float f) {
        boolean z = this.g;
        wu wuVar = this.a;
        if (z) {
            t(String.valueOf(f));
        } else {
            ((kn4) wuVar.b).p(String.valueOf(f));
        }
        if (Float.isInfinite(f) || Float.isNaN(f)) {
            throw vl0.b(Float.valueOf(f), ((kn4) wuVar.b).toString());
        }
    }

    public final do3 i(tf3 tf3Var) {
        tf3Var.getClass();
        boolean zA = eo3.a(tf3Var);
        gj4 gj4Var = this.c;
        rs1 rs1Var = this.b;
        wu ek0Var = this.a;
        if (zA) {
            if (!(ek0Var instanceof fk0)) {
                ek0Var = new fk0((kn4) ek0Var.b, this.g);
            }
            return new do3(ek0Var, rs1Var, gj4Var, null);
        }
        if (tf3Var.isInline() && tf3Var.equals(et1.a)) {
            if (!(ek0Var instanceof ek0)) {
                ek0Var = new ek0((kn4) ek0Var.b, this.g);
            }
            return new do3(ek0Var, rs1Var, gj4Var, null);
        }
        if (this.h != null) {
            this.i = tf3Var.b();
        }
        return this;
    }

    public final do3 j(yy2 yy2Var, int i) {
        yy2Var.getClass();
        g(yy2Var, i);
        return i(yy2Var.i(i));
    }

    public final void k(int i) {
        if (this.g) {
            t(String.valueOf(i));
        } else {
            this.a.h(i);
        }
    }

    public final void l(int i, int i2, tf3 tf3Var) {
        tf3Var.getClass();
        g(tf3Var, i);
        k(i2);
    }

    public final void m(long j) {
        if (this.g) {
            t(String.valueOf(j));
        } else {
            this.a.i(j);
        }
    }

    public final void n(tf3 tf3Var, int i, long j) {
        tf3Var.getClass();
        g(tf3Var, i);
        m(j);
    }

    public final void o() {
        wu wuVar = this.a;
        wuVar.getClass();
        ((kn4) wuVar.b).p("null");
    }

    public final void p(tf3 tf3Var, int i, qu1 qu1Var, Object obj) {
        tf3Var.getClass();
        qu1Var.getClass();
        if (obj != null || this.f.c) {
            tf3Var.getClass();
            qu1Var.getClass();
            g(tf3Var, i);
            if (qu1Var.getDescriptor().g()) {
                r(qu1Var, obj);
            } else if (obj == null) {
                o();
            } else {
                r(qu1Var, obj);
            }
        }
    }

    public final void q(tf3 tf3Var, int i, qu1 qu1Var, Object obj) {
        tf3Var.getClass();
        qu1Var.getClass();
        g(tf3Var, i);
        r(qu1Var, obj);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003b  */
    public final void r(qu1 qu1Var, Object obj) {
        String strW;
        qu1Var.getClass();
        rs1 rs1Var = this.b;
        boolean z = qu1Var instanceof rc3;
        uc0 uc0Var = rs1Var.a.g;
        if (!z) {
            int iOrdinal = uc0Var.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    yo4 yo4VarC = qu1Var.getDescriptor().c();
                    strW = (kr1.n(yo4VarC, zo3.n) || kr1.n(yo4VarC, zo3.q)) ? kr1.w(rs1Var, qu1Var.getDescriptor()) : null;
                } else if (iOrdinal != 2) {
                    u41.e();
                    return;
                }
            }
        } else if (uc0Var != uc0.c) {
        }
        if (z) {
            rc3 rc3Var = (rc3) qu1Var;
            if (obj == null) {
                j93.i(rc3Var.getDescriptor(), " should always be non-null. Please report issue to the kotlinx.serialization tracker.", "Value for serializer ");
                return;
            }
            qu1 qu1VarS = av1.s(rc3Var, this, obj);
            if (strW != null && z) {
                tf3 descriptor = qu1VarS.getDescriptor();
                descriptor.getClass();
                if (gb2.n(descriptor).contains(strW)) {
                    StringBuilder sbT = fq2.t("Sealed class '", qu1VarS.getDescriptor().b(), "' cannot be serialized as base class '", rc3Var.getDescriptor().b(), "' because it has property name that conflicts with JSON class discriminator '");
                    sbT.append(strW);
                    sbT.append("'. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism");
                    throw new IllegalStateException(sbT.toString().toString());
                }
            }
            yo4 yo4VarC2 = qu1VarS.getDescriptor().c();
            yo4VarC2.getClass();
            if (yo4VarC2 instanceof yf3) {
                u41.r("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
                return;
            } else if (yo4VarC2 instanceof cz2) {
                u41.r("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
                return;
            } else {
                if (yo4VarC2 instanceof nx2) {
                    u41.r("Actual serializer for polymorphic cannot be polymorphic itself");
                    return;
                }
                qu1Var = qu1VarS;
            }
        }
        if (strW != null) {
            String strB = qu1Var.getDescriptor().b();
            this.h = strW;
            this.i = strB;
        }
        qu1Var.serialize(this, obj);
    }

    public final void s(short s) {
        if (this.g) {
            t(String.valueOf((int) s));
        } else {
            this.a.j(s);
        }
    }

    public final void t(String str) {
        str.getClass();
        this.a.k(str);
    }

    public final void u(tf3 tf3Var, int i, String str) {
        tf3Var.getClass();
        str.getClass();
        g(tf3Var, i);
        t(str);
    }

    public final void v(tf3 tf3Var) {
        tf3Var.getClass();
        wu wuVar = this.a;
        wuVar.getClass();
        wuVar.a = false;
        wuVar.g(this.c.d);
    }

    public final boolean w(tf3 tf3Var) {
        tf3Var.getClass();
        return this.f.a;
    }
}
