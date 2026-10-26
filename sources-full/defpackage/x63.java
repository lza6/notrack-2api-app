package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class x63 extends uo0 {
    public a73 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ a73 h;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x63(a73 a73Var, uo0 uo0Var) {
        super(uo0Var);
        this.h = a73Var;
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.l |= Integer.MIN_VALUE;
        return this.h.a(this);
    }
}
