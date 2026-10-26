package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class a94 extends zp0 {
    public static final a94 c = new a94();

    @Override // defpackage.zp0
    public final void dispatch(xp0 xp0Var, Runnable runnable) {
        jt0.d.c.c(runnable, true, false);
    }

    @Override // defpackage.zp0
    public final void dispatchYield(xp0 xp0Var, Runnable runnable) {
        jt0.d.c.c(runnable, true, true);
    }

    @Override // defpackage.zp0
    public final zp0 limitedParallelism(int i, String str) {
        y64.o(i);
        if (i >= ft3.d) {
            return str != null ? new aj2(this, str) : this;
        }
        return super.limitedParallelism(i, str);
    }

    @Override // defpackage.zp0
    public final String toString() {
        return "Dispatchers.IO";
    }
}
