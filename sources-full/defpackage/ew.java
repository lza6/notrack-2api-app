package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ew extends ww1 implements le1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long h;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ew(Object obj, long j, long j2, Object obj2, int i) {
        super(1);
        this.c = i;
        this.l = obj;
        this.d = j;
        this.h = j2;
        this.m = obj2;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        int i = this.c;
        w84 w84Var = w84.a;
        Object obj2 = this.m;
        Object obj3 = this.l;
        switch (i) {
            case 0:
                wx1 wx1Var = (wx1) obj;
                wx1Var.a();
                tz0.T(wx1Var, (yx) obj3, this.d, this.h, 0.0f, (uz0) obj2, 104);
                break;
            default:
                mv2 mv2Var = (mv2) obj;
                nv2 nv2Var = (nv2) obj3;
                long j = this.d;
                long j2 = this.h;
                mv2Var.getClass();
                mv2.a(mv2Var, nv2Var);
                nv2Var.i0(iq1.c((((long) (((int) (j >> 32)) + ((int) (j2 >> 32)))) << 32) | (((long) (((int) (j & 4294967295L)) + ((int) (j2 & 4294967295L)))) & 4294967295L), nv2Var.m), 0.0f, (ie) obj2);
                break;
        }
        return w84Var;
    }
}
