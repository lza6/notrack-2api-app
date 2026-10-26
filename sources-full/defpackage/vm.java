package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vm extends uo0 {
    public pm1 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ wm h;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vm(wm wmVar, uo0 uo0Var) {
        super(uo0Var);
        this.h = wmVar;
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.l |= Integer.MIN_VALUE;
        return this.h.a(null, null, this);
    }
}
