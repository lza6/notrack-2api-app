package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class px extends mq3 implements ne1 {
    public /* synthetic */ Object c;
    public final /* synthetic */ qx d;
    public final /* synthetic */ wl2 h;
    public final /* synthetic */ c9 l;
    public final /* synthetic */ oh m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public px(qx qxVar, wl2 wl2Var, c9 c9Var, oh ohVar, so0 so0Var) {
        super(2, so0Var);
        this.d = qxVar;
        this.h = wl2Var;
        this.l = c9Var;
        this.m = ohVar;
    }

    @Override // defpackage.wr
    public final so0 create(Object obj, so0 so0Var) {
        px pxVar = new px(this.d, this.h, this.l, this.m, so0Var);
        pxVar.c = obj;
        return pxVar;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        return ((px) create((gq0) obj, (so0) obj2)).invokeSuspend(w84.a);
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) throws Throwable {
        g13.O(obj);
        gq0 gq0Var = (gq0) this.c;
        c9 c9Var = this.l;
        qx qxVar = this.d;
        py.F(gq0Var, null, null, new q8(qxVar, this.h, c9Var, (so0) null, 6), 3);
        return py.F(gq0Var, null, null, new k(qxVar, this.m, null, 7), 3);
    }
}
