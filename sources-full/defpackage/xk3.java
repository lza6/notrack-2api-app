package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xk3 extends nn3 {
    public int c;

    public xk3(long j, int i) {
        super(j);
        this.c = i;
    }

    @Override // defpackage.nn3
    public final void a(nn3 nn3Var) {
        nn3Var.getClass();
        this.c = ((xk3) nn3Var).c;
    }

    @Override // defpackage.nn3
    public final nn3 b() {
        return c(vk3.k().g());
    }

    @Override // defpackage.nn3
    public final nn3 c(long j) {
        return new xk3(j, this.c);
    }
}
