package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hd3 extends ww1 implements je1 {
    public final /* synthetic */ bd3 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int h;
    public final /* synthetic */ fe3 l;
    public final /* synthetic */ ly1 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hd3(bd3 bd3Var, int i, int i2, fe3 fe3Var, ly1 ly1Var) {
        super(0);
        this.c = bd3Var;
        this.d = i;
        this.h = i2;
        this.l = fe3Var;
        this.m = ly1Var;
    }

    @Override // defpackage.je1
    public final Object invoke() {
        int iIntValue = ((Number) this.m.getValue()).intValue();
        fe3 fe3Var = this.l;
        boolean zA = fe3Var.a();
        boolean z = fe3Var.k() == sq0.c;
        bd3 bd3Var = this.c;
        xy3 xy3Var = bd3Var.f;
        int i = this.d;
        long j = xy3Var.j(i);
        xy3 xy3Var2 = bd3Var.f;
        pg2 pg2Var = xy3Var2.b;
        int i2 = jz3.c;
        int iG = (int) (j >> 32);
        int iD = pg2Var.d(iG);
        int i3 = pg2Var.f;
        if (iD != iIntValue) {
            iG = iIntValue >= i3 ? xy3Var2.g(i3 - 1) : xy3Var2.g(iIntValue);
        }
        int iC = (int) (j & 4294967295L);
        if (pg2Var.d(iC) != iIntValue) {
            iC = iIntValue >= i3 ? pg2Var.c(i3 - 1, false) : pg2Var.c(iIntValue, false);
        }
        int i4 = this.h;
        if (iG == i4) {
            return bd3Var.a(iC);
        }
        if (iC == i4) {
            return bd3Var.a(iG);
        }
        if (!(zA ^ z) ? i >= iG : i > iC) {
            iG = iC;
        }
        return bd3Var.a(iG);
    }
}
