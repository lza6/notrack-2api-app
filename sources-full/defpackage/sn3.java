package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class sn3 extends uo0 {
    public kf3 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ ev h;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sn3(ev evVar, uo0 uo0Var) {
        super(uo0Var);
        this.h = evVar;
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.l |= Integer.MIN_VALUE;
        return this.h.a(this);
    }
}
