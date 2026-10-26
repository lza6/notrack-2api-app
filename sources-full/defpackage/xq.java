package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xq extends uo0 {
    public t00 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ yq h;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xq(yq yqVar, uo0 uo0Var) {
        super(uo0Var);
        this.h = yqVar;
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.l |= Integer.MIN_VALUE;
        return this.h.b(this);
    }
}
