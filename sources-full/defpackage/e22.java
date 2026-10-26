package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class e22 extends mq3 implements ne1 {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e22(int i, int i2, so0 so0Var) {
        super(i, so0Var);
        this.c = i2;
    }

    @Override // defpackage.wr
    public final so0 create(Object obj, so0 so0Var) {
        switch (this.c) {
            case 0:
                return new e22(2, 0, so0Var);
            default:
                return new e22(2, 1, so0Var);
        }
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = this.c;
        w84 w84Var = w84.a;
        switch (i) {
            case 0:
                ((e22) create((pb3) obj, (so0) obj2)).invokeSuspend(w84Var);
                break;
            default:
                ((e22) create((ix2) obj, (so0) obj2)).invokeSuspend(w84Var);
                break;
        }
        return w84Var;
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.c;
        w84 w84Var = w84.a;
        switch (i) {
            case 0:
                g13.O(obj);
                break;
            default:
                g13.O(obj);
                break;
        }
        return w84Var;
    }
}
