package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class q7 extends ww1 implements ne1 {
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ ne1 h;
    public final /* synthetic */ int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q7(float f, float f2, ne1 ne1Var, int i) {
        super(2);
        this.c = f;
        this.d = f2;
        this.h = ne1Var;
        this.l = i;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iV = sf3.V(this.l | 1);
        x7.m1873xc3391bf9(this.c, this.d, this.h, (ck0) obj, iV);
        return w84.a;
    }
}
