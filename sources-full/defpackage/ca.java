package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ca extends uo0 {
    public fa c;
    public gy d;
    public /* synthetic */ Object h;
    public final /* synthetic */ fa l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ca(fa faVar, so0 so0Var) {
        super(so0Var);
        this.l = faVar;
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.a(this);
    }
}
