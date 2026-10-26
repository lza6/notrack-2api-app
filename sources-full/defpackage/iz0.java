package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class iz0 extends mq3 implements oe1 {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iz0(int i, int i2, so0 so0Var) {
        super(i, so0Var);
        this.c = i2;
    }

    @Override // defpackage.oe1
    public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
        int i = this.c;
        w84 w84Var = w84.a;
        int i2 = 3;
        switch (i) {
            case 0:
                long j = ((ln2) obj2).a;
                new iz0(i2, 0, (so0) obj3).invokeSuspend(w84Var);
                break;
            case 1:
                ((Number) obj2).floatValue();
                new iz0(i2, 1, (so0) obj3).invokeSuspend(w84Var);
                break;
            default:
                long j2 = ((ln2) obj2).a;
                new iz0(i2, 2, (so0) obj3).invokeSuspend(w84Var);
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
            case 1:
                g13.O(obj);
                break;
            default:
                g13.O(obj);
                break;
        }
        return w84Var;
    }
}
