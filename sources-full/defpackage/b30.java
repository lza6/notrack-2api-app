package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class b30 extends mq3 implements ne1 {
    public final /* synthetic */ int c = 0;
    public int d;
    public /* synthetic */ Object h;
    public final /* synthetic */ e30 l;
    public final /* synthetic */ l81 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b30(e30 e30Var, l81 l81Var, Object obj, so0 so0Var) {
        super(2, so0Var);
        this.l = e30Var;
        this.m = l81Var;
        this.h = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b30(e30 e30Var, l81 l81Var, so0 so0Var) {
        super(2, so0Var);
        this.l = e30Var;
        this.m = l81Var;
    }

    @Override // defpackage.wr
    public final so0 create(Object obj, so0 so0Var) {
        int i = this.c;
        l81 l81Var = this.m;
        e30 e30Var = this.l;
        switch (i) {
            case 0:
                return new b30(e30Var, l81Var, this.h, so0Var);
            default:
                b30 b30Var = new b30(e30Var, l81Var, so0Var);
                b30Var.h = obj;
                return b30Var;
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
        return ((b30) create(gq0Var, so0Var)).invokeSuspend(w84Var);
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.c;
        w84 w84Var = w84.a;
        hq0 hq0Var = hq0.c;
        switch (i) {
            case 0:
                int i2 = this.d;
                if (i2 != 0) {
                    if (i2 == 1) {
                        g13.O(obj);
                        return w84Var;
                    }
                    u41.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g13.O(obj);
                oe1 oe1Var = this.l.m;
                Object obj2 = this.h;
                this.d = 1;
                return oe1Var.invoke(this.m, obj2, this) == hq0Var ? hq0Var : w84Var;
            default:
                int i3 = this.d;
                if (i3 != 0) {
                    if (i3 == 1) {
                        g13.O(obj);
                        return w84Var;
                    }
                    u41.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g13.O(obj);
                gq0 gq0Var = (gq0) this.h;
                q43 q43Var = new q43();
                e30 e30Var = this.l;
                k81 k81Var = e30Var.l;
                d30 d30Var = new d30(q43Var, gq0Var, e30Var, this.m, 0);
                this.d = 1;
                return k81Var.a(d30Var, this) == hq0Var ? hq0Var : w84Var;
        }
    }
}
