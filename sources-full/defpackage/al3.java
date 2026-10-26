package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class al3 extends nn3 {
    public Object c;

    public al3(Object obj, long j) {
        super(j);
        this.c = obj;
    }

    @Override // defpackage.nn3
    public final void a(nn3 nn3Var) {
        nn3Var.getClass();
        this.c = ((al3) nn3Var).c;
    }

    @Override // defpackage.nn3
    public final nn3 b() {
        return new al3(this.c, vk3.k().g());
    }

    @Override // defpackage.nn3
    public final nn3 c(long j) {
        return new al3(this.c, vk3.k().g());
    }
}
