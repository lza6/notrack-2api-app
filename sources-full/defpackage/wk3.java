package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wk3 extends nn3 {
    public float c;

    public wk3(float f, long j) {
        super(j);
        this.c = f;
    }

    @Override // defpackage.nn3
    public final void a(nn3 nn3Var) {
        nn3Var.getClass();
        this.c = ((wk3) nn3Var).c;
    }

    @Override // defpackage.nn3
    public final nn3 b() {
        return c(vk3.k().g());
    }

    @Override // defpackage.nn3
    public final nn3 c(long j) {
        return new wk3(this.c, j);
    }
}
