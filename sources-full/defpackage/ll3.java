package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ll3 extends nn3 {
    public k0 c;
    public int d;
    public int e;

    public ll3(long j, k0 k0Var) {
        super(j);
        this.c = k0Var;
    }

    @Override // defpackage.nn3
    public final void a(nn3 nn3Var) {
        synchronized (jr1.e) {
            nn3Var.getClass();
            this.c = ((ll3) nn3Var).c;
            this.d = ((ll3) nn3Var).d;
            this.e = ((ll3) nn3Var).e;
        }
    }

    @Override // defpackage.nn3
    public final nn3 b() {
        return c(vk3.k().g());
    }

    @Override // defpackage.nn3
    public final nn3 c(long j) {
        return new ll3(j, this.c);
    }
}
