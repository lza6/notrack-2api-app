package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qx2 extends ww1 implements je1 {
    public final /* synthetic */ p43 c;
    public final /* synthetic */ rx2 d;
    public final /* synthetic */ mq1 h;
    public final /* synthetic */ long l;
    public final /* synthetic */ long m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qx2(p43 p43Var, rx2 rx2Var, mq1 mq1Var, long j, long j2) {
        super(0);
        this.c = p43Var;
        this.d = rx2Var;
        this.h = mq1Var;
        this.l = j;
        this.m = j2;
    }

    @Override // defpackage.je1
    public final Object invoke() {
        rx2 rx2Var = this.d;
        this.c.c = rx2Var.getPositionProvider().a(this.h, this.l, rx2Var.getParentLayoutDirection(), this.m);
        return w84.a;
    }
}
