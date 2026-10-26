package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vk2 extends uo0 {
    public dy c;
    public /* synthetic */ Object d;
    public final /* synthetic */ xk2 h;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vk2(xk2 xk2Var, uo0 uo0Var) {
        super(uo0Var);
        this.h = xk2Var;
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.l |= Integer.MIN_VALUE;
        return xk2.b(this.h, null, this);
    }
}
