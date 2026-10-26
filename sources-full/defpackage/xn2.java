package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xn2 extends mq3 implements oe1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xn2(Object obj, so0 so0Var, int i) {
        super(3, so0Var);
        this.c = i;
        this.d = obj;
    }

    @Override // defpackage.oe1
    public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
        int i = this.c;
        w84 w84Var = w84.a;
        Object obj4 = this.d;
        switch (i) {
            case 0:
                new xn2((l43) obj4, (so0) obj3, 0).invokeSuspend(w84Var);
                break;
            default:
                ((Number) obj2).floatValue();
                new xn2((uj3) obj4, (so0) obj3, 1).invokeSuspend(w84Var);
                break;
        }
        return w84Var;
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.c;
        w84 w84Var = w84.a;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                g13.O(obj);
                ((l43) obj2).c = true;
                break;
            default:
                g13.O(obj);
                ((uj3) obj2).l.invoke();
                break;
        }
        return w84Var;
    }
}
