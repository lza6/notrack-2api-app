package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hg2 extends uo0 {
    public lv0 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ lv0 h;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hg2(lv0 lv0Var, uo0 uo0Var) {
        super(uo0Var);
        this.h = lv0Var;
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.l |= Integer.MIN_VALUE;
        return this.h.i(null, null, this);
    }
}
