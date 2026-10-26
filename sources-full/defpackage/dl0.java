package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dl0 extends o13 {
    public final /* synthetic */ int b = 1;
    public final Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dl0(je1 je1Var) {
        super(je1Var);
        t73 t73Var = t73.A;
        this.c = t73Var;
    }

    public dl0(le1 le1Var) {
        super(d4.x);
        this.c = new el0(le1Var);
    }

    @Override // defpackage.vk0
    public bb4 a() {
        switch (this.b) {
            case 0:
                return (el0) this.c;
            default:
                return super.a();
        }
    }

    @Override // defpackage.o13
    public final s13 c(Object obj) {
        switch (this.b) {
            case 0:
                return new s13(this, obj, obj == null, null, null, null, true);
            default:
                return new s13(this, obj, obj == null, (bl3) this.c, null, null, true);
        }
    }
}
