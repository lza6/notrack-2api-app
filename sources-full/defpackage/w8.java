package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class w8 extends uo0 {
    public ji4 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ ji4 h;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w8(ji4 ji4Var, so0 so0Var) {
        super(so0Var);
        this.h = ji4Var;
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.l |= Integer.MIN_VALUE;
        return this.h.b(null, null, null, this);
    }
}
