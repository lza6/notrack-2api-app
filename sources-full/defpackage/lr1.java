package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lr1 extends g63 {
    public int c;
    public final /* synthetic */ ne1 d;
    public final /* synthetic */ so0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lr1(so0 so0Var, so0 so0Var2, ne1 ne1Var) {
        super(so0Var);
        this.d = ne1Var;
        this.h = so0Var2;
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                u41.r("This coroutine had already completed");
                return null;
            }
            this.c = 2;
            g13.O(obj);
            return obj;
        }
        this.c = 1;
        g13.O(obj);
        ne1 ne1Var = this.d;
        ne1Var.getClass();
        y64.l(2, ne1Var);
        return ne1Var.invoke(this.h, this);
    }
}
