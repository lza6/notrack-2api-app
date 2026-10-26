package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class ms2 {
    public bc c;
    public boolean d;
    public te0 h;
    public float l = 1.0f;
    public dx1 m = dx1.c;

    public boolean c(float f) {
        return false;
    }

    public boolean e(te0 te0Var) {
        return false;
    }

    public void f(dx1 dx1Var) {
    }

    public final void g(tz0 tz0Var, long j, float f, te0 te0Var) {
        if (this.l != f) {
            if (!c(f)) {
                bc bcVarF = this.c;
                if (f == 1.0f) {
                    if (bcVarF != null) {
                        bcVarF.d(f);
                    }
                    this.d = false;
                } else {
                    if (bcVarF == null) {
                        bcVarF = vl0.f();
                        this.c = bcVarF;
                    }
                    bcVarF.d(f);
                    this.d = true;
                }
            }
            this.l = f;
        }
        if (!kr1.n(this.h, te0Var)) {
            if (!e(te0Var)) {
                bc bcVarF2 = this.c;
                if (te0Var == null) {
                    if (bcVarF2 != null) {
                        bcVarF2.g(null);
                    }
                    this.d = false;
                } else {
                    if (bcVarF2 == null) {
                        bcVarF2 = vl0.f();
                        this.c = bcVarF2;
                    }
                    bcVarF2.g(te0Var);
                    this.d = true;
                }
            }
            this.h = te0Var;
        }
        dx1 layoutDirection = tz0Var.getLayoutDirection();
        if (this.m != layoutDirection) {
            f(layoutDirection);
            this.m = layoutDirection;
        }
        int i = (int) (j >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (tz0Var.b() >> 32)) - Float.intBitsToFloat(i);
        int i2 = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (tz0Var.b() & 4294967295L)) - Float.intBitsToFloat(i2);
        ((jb) tz0Var.A().d).x(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2);
        if (f > 0.0f) {
            try {
                if (Float.intBitsToFloat(i) > 0.0f && Float.intBitsToFloat(i2) > 0.0f) {
                    if (this.d) {
                        float fIntBitsToFloat3 = Float.intBitsToFloat(i);
                        h43 h43VarA = xp1.a(0L, (((long) Float.floatToRawIntBits(Float.intBitsToFloat(i2))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat3) << 32));
                        y00 y00VarY = tz0Var.A().y();
                        bc bcVarF3 = this.c;
                        if (bcVarF3 == null) {
                            bcVarF3 = vl0.f();
                            this.c = bcVarF3;
                        }
                        try {
                            y00VarY.s(h43VarA, bcVarF3);
                            i(tz0Var);
                            y00VarY.i();
                        } catch (Throwable th) {
                            y00VarY.i();
                            throw th;
                        }
                    } else {
                        i(tz0Var);
                    }
                }
            } catch (Throwable th2) {
                ((jb) tz0Var.A().d).x(-0.0f, -0.0f, -fIntBitsToFloat, -fIntBitsToFloat2);
                throw th2;
            }
        }
        ((jb) tz0Var.A().d).x(-0.0f, -0.0f, -fIntBitsToFloat, -fIntBitsToFloat2);
    }

    public abstract long h();

    public abstract void i(tz0 tz0Var);
}
