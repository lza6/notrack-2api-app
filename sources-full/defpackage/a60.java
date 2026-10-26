package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class a60 extends uo0 {
    public /* synthetic */ Object c;
    public final /* synthetic */ e60 d;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a60(e60 e60Var, uo0 uo0Var) {
        super(uo0Var);
        this.d = e60Var;
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.c = obj;
        this.h |= Integer.MIN_VALUE;
        Object objG = this.d.g(null, this);
        return objG == hq0.c ? objG : new j63(objG);
    }
}
