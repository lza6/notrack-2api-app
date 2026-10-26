package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yk3 extends nn3 {
    public long c;

    public yk3(long j, long j2) {
        super(j);
        this.c = j2;
    }

    @Override // defpackage.nn3
    public final void a(nn3 nn3Var) {
        nn3Var.getClass();
        this.c = ((yk3) nn3Var).c;
    }

    @Override // defpackage.nn3
    public final nn3 b() {
        return c(vk3.k().g());
    }

    @Override // defpackage.nn3
    public final nn3 c(long j) {
        return new yk3(j, this.c);
    }
}
