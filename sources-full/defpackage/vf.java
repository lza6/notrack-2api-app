package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vf {
    public final w64 a;
    public final Object b;
    public final long c;
    public final je1 d;
    public final ft2 e;
    public cg f;
    public long g;
    public long h = Long.MIN_VALUE;
    public final ft2 i = cl3.d(Boolean.TRUE);

    public vf(Object obj, w64 w64Var, cg cgVar, long j, Object obj2, long j2, je1 je1Var) {
        this.a = w64Var;
        this.b = obj2;
        this.c = j2;
        this.d = je1Var;
        this.e = cl3.d(obj);
        this.f = gb2.t(cgVar);
        this.g = j;
    }

    public final void a() {
        this.i.setValue(Boolean.FALSE);
        this.d.invoke();
    }
}
