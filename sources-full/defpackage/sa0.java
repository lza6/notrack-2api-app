package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class sa0 extends mq3 implements ne1 {
    public final /* synthetic */ int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ za1 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sa0(za1 za1Var, so0 so0Var, int i) {
        super(2, so0Var);
        this.c = i;
        this.h = za1Var;
    }

    @Override // defpackage.wr
    public final so0 create(Object obj, so0 so0Var) {
        switch (this.c) {
            case 0:
                sa0 sa0Var = new sa0(this.h, so0Var, 0);
                sa0Var.d = obj;
                return sa0Var;
            default:
                sa0 sa0Var2 = new sa0(this.h, so0Var, 1);
                sa0Var2.d = obj;
                return sa0Var2;
        }
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = this.c;
        w84 w84Var = w84.a;
        gq0 gq0Var = (gq0) obj;
        so0 so0Var = (so0) obj2;
        switch (i) {
            case 0:
                ((sa0) create(gq0Var, so0Var)).invokeSuspend(w84Var);
                break;
            default:
                ((sa0) create(gq0Var, so0Var)).invokeSuspend(w84Var);
                break;
        }
        return w84Var;
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.c;
        w84 w84Var = w84.a;
        za1 za1Var = this.h;
        switch (i) {
            case 0:
                g13.O(obj);
                try {
                    za1.b(za1Var);
                } catch (Throwable unused) {
                }
                break;
            default:
                g13.O(obj);
                try {
                    za1.b(za1Var);
                } catch (Throwable unused2) {
                }
                break;
        }
        return w84Var;
        return w84Var;
    }
}
