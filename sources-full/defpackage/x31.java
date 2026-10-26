package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class x31 extends uo0 {
    public j33 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ y31 h;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x31(y31 y31Var, uo0 uo0Var) {
        super(uo0Var);
        this.h = y31Var;
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.l |= Integer.MIN_VALUE;
        return this.h.d(null, this);
    }
}
