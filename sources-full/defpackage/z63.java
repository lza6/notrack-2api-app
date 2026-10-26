package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class z63 extends mq3 implements ne1 {
    public final /* synthetic */ int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ a73 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z63(a73 a73Var, so0 so0Var, int i) {
        super(2, so0Var);
        this.c = i;
        this.h = a73Var;
    }

    @Override // defpackage.wr
    public final so0 create(Object obj, so0 so0Var) {
        int i = this.c;
        a73 a73Var = this.h;
        switch (i) {
            case 0:
                z63 z63Var = new z63(a73Var, so0Var, 0);
                z63Var.d = obj;
                return z63Var;
            default:
                z63 z63Var2 = new z63(a73Var, so0Var, 1);
                z63Var2.d = obj;
                return z63Var2;
        }
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.c;
        w84 w84Var = w84.a;
        gq0 gq0Var = (gq0) obj;
        so0 so0Var = (so0) obj2;
        switch (i) {
            case 0:
                break;
        }
        return ((z63) create(gq0Var, so0Var)).invokeSuspend(w84Var);
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.c;
        a73 a73Var = this.h;
        so0 so0Var = null;
        int i2 = 3;
        switch (i) {
            case 0:
                g13.O(obj);
                gq0 gq0Var = (gq0) this.d;
                py.F(gq0Var, null, null, new y63(a73Var, so0Var, 0), 3);
                py.F(gq0Var, null, null, new y63(a73Var, so0Var, 1), 3);
                return py.F(gq0Var, null, null, new y63(a73Var, so0Var, 2), 3);
            default:
                g13.O(obj);
                return py.F((gq0) this.d, null, null, new y63(a73Var, so0Var, i2), 3);
        }
    }
}
