package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class oy2 extends uo0 {
    public py2 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ py2 h;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oy2(py2 py2Var, uo0 uo0Var) {
        super(uo0Var);
        this.h = py2Var;
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.l |= Integer.MIN_VALUE;
        return this.h.d(this);
    }
}
