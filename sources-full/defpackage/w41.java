package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class w41 extends y41 {
    public final t00 h;
    public final /* synthetic */ a51 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w41(a51 a51Var, long j, t00 t00Var) {
        super(j);
        this.l = a51Var;
        this.h = t00Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.h.E(this.l);
    }

    @Override // defpackage.y41
    public final String toString() {
        return super.toString() + this.h;
    }
}
