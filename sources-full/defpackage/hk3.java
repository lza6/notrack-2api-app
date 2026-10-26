package defpackage;

import androidx.compose.foundation.gestures.b;

/* JADX INFO: loaded from: classes.dex */
public final class hk3 implements rs3 {
    public final mk3 a;
    public final zr0 b;
    public final tm3 c;
    public final gw0 d = b.b;

    public hk3(mk3 mk3Var, zr0 zr0Var, tm3 tm3Var) {
        this.a = mk3Var;
        this.b = zr0Var;
        this.c = tm3Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public static final Object b(hk3 hk3Var, pb3 pb3Var, float f, float f2, ek3 ek3Var, uo0 uo0Var) throws Throwable {
        gk3 gk3Var;
        yk sk3Var;
        if (uo0Var instanceof gk3) {
            gk3Var = (gk3) uo0Var;
            int i = gk3Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                gk3Var.h = i - Integer.MIN_VALUE;
            } else {
                gk3Var = new gk3(hk3Var, uo0Var);
            }
        } else {
            gk3Var = new gk3(hk3Var, uo0Var);
        }
        gk3 gk3Var2 = gk3Var;
        Object objC = gk3Var2.c;
        int i2 = gk3Var2.h;
        if (i2 == 0) {
            g13.O(objC);
            if (Math.abs(f) == 0.0f || Math.abs(f2) == 0.0f) {
                return av1.a(f, f2, 28);
            }
            gk3Var2.h = 1;
            zr0 zr0Var = hk3Var.b;
            x64 x64Var = mb4.a;
            if (Math.abs(((yf) new ir3(((as0) zr0Var).a).X(new yf(0.0f), new yf(f2))).a) >= Math.abs(f)) {
                sk3Var = new jb(23, zr0Var);
            } else {
                sk3Var = new sk3(4, hk3Var.c);
            }
            objC = sk3Var.c(pb3Var, new Float(f), new Float(f2), ek3Var, gk3Var2);
            hq0 hq0Var = hq0.c;
            if (objC == hq0Var) {
                return hq0Var;
            }
        } else {
            if (i2 != 1) {
                u41.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            g13.O(objC);
        }
        return ((tf) objC).b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(pb3 pb3Var, float f, le1 le1Var, uo0 uo0Var) throws Throwable {
        dk3 dk3Var;
        le1 le1Var2;
        if (uo0Var instanceof dk3) {
            dk3Var = (dk3) uo0Var;
            int i = dk3Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                dk3Var.l = i - Integer.MIN_VALUE;
            } else {
                dk3Var = new dk3(this, uo0Var);
            }
        } else {
            dk3Var = new dk3(this, uo0Var);
        }
        Object objY = dk3Var.d;
        int i2 = dk3Var.l;
        if (i2 == 0) {
            g13.O(objY);
            us0 us0Var = new us0(this, f, le1Var, pb3Var, null);
            dk3Var.c = le1Var;
            dk3Var.l = 1;
            objY = py.Y(this.d, us0Var, dk3Var);
            hq0 hq0Var = hq0.c;
            if (objY == hq0Var) {
                return hq0Var;
            }
            le1Var2 = le1Var;
        } else {
            if (i2 != 1) {
                u41.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            le1Var2 = dk3Var.c;
            g13.O(objY);
        }
        tf tfVar = (tf) objY;
        le1Var2.invoke(new Float(0.0f));
        return tfVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(c22 c22Var, float f, ba3 ba3Var, uo0 uo0Var) throws Throwable {
        fk3 fk3Var;
        if (uo0Var instanceof fk3) {
            fk3Var = (fk3) uo0Var;
            int i = fk3Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                fk3Var.h = i - Integer.MIN_VALUE;
            } else {
                fk3Var = new fk3(this, uo0Var);
            }
        } else {
            fk3Var = new fk3(this, uo0Var);
        }
        Object objC = fk3Var.c;
        int i2 = fk3Var.h;
        if (i2 == 0) {
            g13.O(objC);
            fk3Var.h = 1;
            objC = c(c22Var, f, ba3Var, fk3Var);
            Object obj = hq0.c;
            if (objC == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                u41.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            g13.O(objC);
        }
        tf tfVar = (tf) objC;
        return new Float(tfVar.a.floatValue() != 0.0f ? ((Number) tfVar.b.b()).floatValue() : 0.0f);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof hk3)) {
            return false;
        }
        hk3 hk3Var = (hk3) obj;
        return hk3Var.c.equals(this.c) && kr1.n(hk3Var.b, this.b) && kr1.n(hk3Var.a, this.a);
    }

    public final int hashCode() {
        return this.a.hashCode() + ((this.b.hashCode() + (this.c.hashCode() * 31)) * 31);
    }
}
