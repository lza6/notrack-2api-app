package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class q13 extends ww1 implements ne1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object h;
    public final /* synthetic */ ne1 l;
    public final /* synthetic */ int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q13(long j, Object obj, ne1 ne1Var, int i, int i2) {
        super(2);
        this.c = i2;
        this.d = j;
        this.h = obj;
        this.l = ne1Var;
        this.m = i;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.c;
        w84 w84Var = w84.a;
        int i2 = this.m;
        Object obj3 = this.h;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                int iV = sf3.V(i2 | 1);
                long j = this.d;
                r13.m1803xc0df08af(j, (uz3) obj3, this.l, (ck0) obj, iV);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iV2 = sf3.V(i2 | 1);
                long j2 = this.d;
                ov3.m1794xaca17d46(j2, (uz3) obj3, this.l, (ck0) obj, iV2);
                break;
            default:
                ((Number) obj2).intValue();
                int iV3 = sf3.V(i2 | 1);
                long j3 = this.d;
                s52.m1808x7650f522(j3, (n74) obj3, this.l, (ck0) obj, iV3);
                break;
        }
        return w84Var;
    }
}
