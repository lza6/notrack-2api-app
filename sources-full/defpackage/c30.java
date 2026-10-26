package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class c30 extends uo0 {
    public d30 c;
    public Object d;
    public /* synthetic */ Object h;
    public final /* synthetic */ d30 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c30(d30 d30Var, so0 so0Var) {
        super(so0Var);
        this.l = d30Var;
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.emit(null, this);
    }
}
