package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qs3 implements rf {
    public final xb4 a;
    public final w64 b;
    public final Object c;
    public final Object d;
    public final cg e;
    public final cg f;
    public final cg g;
    public long h;
    public cg i;

    public qs3(wf wfVar, w64 w64Var, Object obj, Object obj2, cg cgVar) {
        this.a = wfVar.a(w64Var);
        this.b = w64Var;
        this.c = obj2;
        this.d = obj;
        x64 x64Var = (x64) w64Var;
        this.e = (cg) x64Var.a.invoke(obj);
        le1 le1Var = x64Var.a;
        this.f = (cg) le1Var.invoke(obj2);
        this.g = cgVar != null ? gb2.t(cgVar) : ((cg) le1Var.invoke(obj)).c();
        this.h = -1L;
    }

    @Override // defpackage.rf
    public final boolean a() {
        return this.a.a();
    }

    @Override // defpackage.rf
    public final Object b(long j) {
        if (g(j)) {
            return this.c;
        }
        cg cgVarU = this.a.u(j, this.e, this.f, this.g);
        int iB = cgVarU.b();
        for (int i = 0; i < iB; i++) {
            if (Float.isNaN(cgVarU.a(i))) {
                ay2.b("AnimationVector cannot contain a NaN. " + cgVarU + ". Animation: " + this + ", playTimeNanos: " + j);
            }
        }
        return ((x64) this.b).b.invoke(cgVarU);
    }

    @Override // defpackage.rf
    public final long c() {
        if (this.h < 0) {
            this.h = this.a.b(this.e, this.f, this.g);
        }
        return this.h;
    }

    @Override // defpackage.rf
    public final w64 d() {
        return this.b;
    }

    @Override // defpackage.rf
    public final Object e() {
        return this.c;
    }

    @Override // defpackage.rf
    public final cg f(long j) {
        if (!g(j)) {
            return this.a.s(j, this.e, this.f, this.g);
        }
        cg cgVar = this.i;
        if (cgVar != null) {
            return cgVar;
        }
        cg cgVarW = this.a.w(this.e, this.f, this.g);
        this.i = cgVarW;
        return cgVarW;
    }

    public final String toString() {
        return "TargetBasedAnimation: " + this.d + " -> " + this.c + ",initial velocity: " + this.g + ", duration: " + (c() / 1000000) + " ms,animationSpec: " + this.a;
    }
}
