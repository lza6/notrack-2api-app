package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class y81 extends uo0 {
    public s8 c;
    public Object d;
    public /* synthetic */ Object h;
    public final /* synthetic */ s8 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y81(s8 s8Var, so0 so0Var) {
        super(so0Var);
        this.l = s8Var;
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.emit(null, this);
    }
}
