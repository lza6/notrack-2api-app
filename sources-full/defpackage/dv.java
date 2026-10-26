package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dv extends uo0 {
    public kf3 c;
    public int d;
    public /* synthetic */ Object h;
    public final /* synthetic */ ev l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dv(ev evVar, uo0 uo0Var) {
        super(uo0Var);
        this.l = evVar;
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.a(this);
    }
}
