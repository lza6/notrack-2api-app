package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pc extends ww1 implements je1 {
    public final /* synthetic */ rx2 c;
    public final /* synthetic */ je1 d;
    public final /* synthetic */ ux2 h;
    public final /* synthetic */ String l;
    public final /* synthetic */ dx1 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pc(rx2 rx2Var, je1 je1Var, ux2 ux2Var, String str, dx1 dx1Var) {
        super(0);
        this.c = rx2Var;
        this.d = je1Var;
        this.h = ux2Var;
        this.l = str;
        this.m = dx1Var;
    }

    @Override // defpackage.je1
    public final Object invoke() {
        this.c.c(this.d, this.h, this.l, this.m);
        return w84.a;
    }
}
