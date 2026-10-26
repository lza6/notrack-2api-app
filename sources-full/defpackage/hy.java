package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hy extends uo0 {
    public /* synthetic */ Object c;
    public final /* synthetic */ jy d;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hy(jy jyVar, uo0 uo0Var) {
        super(uo0Var);
        this.d = jyVar;
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.c = obj;
        this.h |= Integer.MIN_VALUE;
        Object objI = jy.I(this.d, this);
        return objI == hq0.c ? objI : new h30(objI);
    }
}
