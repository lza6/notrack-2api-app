package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xf implements gn3 {
    public final w64 c;
    public final ft2 d;
    public cg h;
    public long l;
    public long m;
    public boolean n;

    public /* synthetic */ xf(w64 w64Var, Object obj, cg cgVar, int i) {
        this(w64Var, obj, (i & 4) != 0 ? null : cgVar, Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    public xf(w64 w64Var, Object obj, cg cgVar, long j, long j2, boolean z) {
        cg cgVarT;
        this.c = w64Var;
        this.d = cl3.d(obj);
        if (cgVar != null) {
            cgVarT = gb2.t(cgVar);
        } else {
            cgVarT = (cg) ((x64) w64Var).a.invoke(obj);
            cgVarT.d();
        }
        this.h = cgVarT;
        this.l = j;
        this.m = j2;
        this.n = z;
    }

    public final Object b() {
        return ((x64) this.c).b.invoke(this.h);
    }

    @Override // defpackage.gn3
    public final Object getValue() {
        return this.d.getValue();
    }

    public final String toString() {
        return "AnimationState(value=" + this.d.getValue() + ", velocity=" + b() + ", isRunning=" + this.n + ", lastFrameTimeNanos=" + this.l + ", finishedTimeNanos=" + this.m + ')';
    }
}
