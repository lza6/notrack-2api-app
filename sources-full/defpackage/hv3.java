package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hv3 extends ww1 implements ne1 {
    public final /* synthetic */ long c;
    public final /* synthetic */ ne1 d;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hv3(long j, ne1 ne1Var, int i) {
        super(2);
        this.c = j;
        this.d = ne1Var;
        this.h = i;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iV = sf3.V(this.h | 1);
        ov3.m1795x841d322b(this.c, this.d, (ck0) obj, iV);
        return w84.a;
    }
}
