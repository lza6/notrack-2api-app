package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yr0 implements rf {
    public final ir3 a;
    public final w64 b;
    public final Object c;
    public final cg d;
    public final cg e;
    public final cg f;
    public final Object g;
    public final long h;

    public yr0(zr0 zr0Var, w64 w64Var, Object obj, cg cgVar) {
        ir3 ir3Var = new ir3(((as0) zr0Var).a);
        this.a = ir3Var;
        this.b = w64Var;
        this.c = obj;
        x64 x64Var = (x64) w64Var;
        cg cgVar2 = (cg) x64Var.a.invoke(obj);
        this.d = cgVar2;
        this.e = gb2.t(cgVar);
        this.g = x64Var.b.invoke(ir3Var.X(cgVar2, cgVar));
        if (((cg) ir3Var.h) == null) {
            ir3Var.h = cgVar2.c();
        }
        cg cgVar3 = (cg) ir3Var.h;
        if (cgVar3 == null) {
            kr1.n0("velocityVector");
            throw null;
        }
        int iB = cgVar3.b();
        long jMax = 0;
        for (int i = 0; i < iB; i++) {
            sk3 sk3Var = (sk3) ir3Var.c;
            cgVar2.getClass();
            jMax = Math.max(jMax, ((long) (Math.exp(((y71) sk3Var.d).b(cgVar.a(i)) / (((double) z71.a) - 1.0d)) * 1000.0d)) * 1000000);
        }
        this.h = jMax;
        cg cgVarT = gb2.t(this.a.Y(jMax, this.d, cgVar));
        this.f = cgVarT;
        int iB2 = cgVarT.b();
        for (int i2 = 0; i2 < iB2; i2++) {
            cg cgVar4 = this.f;
            float fA = cgVar4.a(i2);
            this.a.getClass();
            this.a.getClass();
            cgVar4.e(py.w(fA, -0.0f, 0.0f), i2);
        }
    }

    @Override // defpackage.rf
    public final boolean a() {
        return false;
    }

    @Override // defpackage.rf
    public final Object b(long j) {
        if (g(j)) {
            return this.g;
        }
        le1 le1Var = ((x64) this.b).b;
        ir3 ir3Var = this.a;
        cg cgVar = (cg) ir3Var.d;
        cg cgVar2 = this.d;
        if (cgVar == null) {
            ir3Var.d = cgVar2.c();
        }
        cg cgVar3 = (cg) ir3Var.d;
        if (cgVar3 == null) {
            kr1.n0("valueVector");
            throw null;
        }
        int iB = cgVar3.b();
        int i = 0;
        while (true) {
            cg cgVar4 = (cg) ir3Var.d;
            if (i >= iB) {
                if (cgVar4 != null) {
                    return le1Var.invoke(cgVar4);
                }
                kr1.n0("valueVector");
                throw null;
            }
            if (cgVar4 == null) {
                kr1.n0("valueVector");
                throw null;
            }
            sk3 sk3Var = (sk3) ir3Var.c;
            float fA = cgVar2.a(i);
            long j2 = j / 1000000;
            x71 x71VarA = ((y71) sk3Var.d).a(this.e.a(i));
            long j3 = x71VarA.c;
            cgVar4.e((Math.signum(x71VarA.a) * x71VarA.b * fb.a(j3 > 0 ? j2 / j3 : 1.0f).a) + fA, i);
            i++;
        }
    }

    @Override // defpackage.rf
    public final long c() {
        return this.h;
    }

    @Override // defpackage.rf
    public final w64 d() {
        return this.b;
    }

    @Override // defpackage.rf
    public final Object e() {
        return this.g;
    }

    @Override // defpackage.rf
    public final cg f(long j) {
        if (g(j)) {
            return this.f;
        }
        return this.a.Y(j, this.d, this.e);
    }
}
