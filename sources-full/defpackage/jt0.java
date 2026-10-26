package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jt0 extends j51 {
    public static final jt0 d;
    public fq0 c;

    static {
        int i = ft3.c;
        int i2 = ft3.d;
        long j = ft3.e;
        String str = ft3.a;
        jt0 jt0Var = new jt0();
        jt0Var.c = new fq0(i, i2, j, str);
        d = jt0Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // defpackage.zp0
    public final void dispatch(xp0 xp0Var, Runnable runnable) {
        fq0.h(this.c, runnable, 6);
    }

    @Override // defpackage.zp0
    public final void dispatchYield(xp0 xp0Var, Runnable runnable) {
        fq0.h(this.c, runnable, 2);
    }

    @Override // defpackage.zp0
    public final zp0 limitedParallelism(int i, String str) {
        y64.o(i);
        if (i >= ft3.c) {
            return str != null ? new aj2(this, str) : this;
        }
        return super.limitedParallelism(i, str);
    }

    @Override // defpackage.zp0
    public final String toString() {
        return "Dispatchers.Default";
    }
}
