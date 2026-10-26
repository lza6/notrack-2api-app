package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class y73 implements rg3 {
    public final up0 c;
    public final up0 d;
    public final up0 h;
    public final up0 l;

    public y73(up0 up0Var, up0 up0Var2, up0 up0Var3, up0 up0Var4) {
        this.c = up0Var;
        this.d = up0Var2;
        this.h = up0Var3;
        this.l = up0Var4;
    }

    public static y73 a(y73 y73Var, sx0 sx0Var, sx0 sx0Var2, sx0 sx0Var3, int i) {
        up0 up0Var = sx0Var;
        if ((i & 1) != 0) {
            up0Var = y73Var.c;
        }
        up0 up0Var2 = y73Var.d;
        up0 up0Var3 = sx0Var2;
        if ((i & 4) != 0) {
            up0Var3 = y73Var.h;
        }
        y73Var.getClass();
        return new y73(up0Var, up0Var2, up0Var3, sx0Var3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y73)) {
            return false;
        }
        y73 y73Var = (y73) obj;
        return kr1.n(this.c, y73Var.c) && this.d.equals(y73Var.d) && kr1.n(this.h, y73Var.h) && this.l.equals(y73Var.l);
    }

    public final int hashCode() {
        return this.l.hashCode() + ((this.h.hashCode() + ((this.d.hashCode() + (this.c.hashCode() * 31)) * 31)) * 31);
    }

    @Override // defpackage.rg3
    public final rq2 l(long j, dx1 dx1Var, wu0 wu0Var) {
        float fA = this.c.a(j, wu0Var);
        float fA2 = this.d.a(j, wu0Var);
        float fA3 = this.h.a(j, wu0Var);
        float fA4 = this.l.a(j, wu0Var);
        float fC = bi3.c(j);
        float f = fA + fA4;
        if (f > fC) {
            float f2 = fC / f;
            fA *= f2;
            fA4 *= f2;
        }
        float f3 = fA2 + fA3;
        if (f3 > fC) {
            float f4 = fC / f3;
            fA2 *= f4;
            fA3 *= f4;
        }
        if (fA < 0.0f || fA2 < 0.0f || fA3 < 0.0f || fA4 < 0.0f) {
            so1.a("Corner size in Px can't be negative(topStart = " + fA + ", topEnd = " + fA2 + ", bottomEnd = " + fA3 + ", bottomStart = " + fA4 + ")!");
        }
        if (fA + fA2 + fA3 + fA4 == 0.0f) {
            return new pq2(xp1.a(0L, j));
        }
        h43 h43VarA = xp1.a(0L, j);
        dx1 dx1Var2 = dx1.c;
        float f5 = dx1Var == dx1Var2 ? fA : fA2;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L);
        if (dx1Var == dx1Var2) {
            fA = fA2;
        }
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fA)) << 32) | (((long) Float.floatToRawIntBits(fA)) & 4294967295L);
        float f6 = dx1Var == dx1Var2 ? fA3 : fA4;
        long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(f6)) << 32) | (((long) Float.floatToRawIntBits(f6)) & 4294967295L);
        if (dx1Var != dx1Var2) {
            fA4 = fA3;
        }
        return new qq2(new x73(h43VarA.a, h43VarA.b, h43VarA.c, h43VarA.d, jFloatToRawIntBits, jFloatToRawIntBits2, jFloatToRawIntBits3, (((long) Float.floatToRawIntBits(fA4)) << 32) | (((long) Float.floatToRawIntBits(fA4)) & 4294967295L)));
    }

    public final String toString() {
        return "RoundedCornerShape(topStart = " + this.c + ", topEnd = " + this.d + ", bottomEnd = " + this.h + ", bottomStart = " + this.l + ')';
    }
}
