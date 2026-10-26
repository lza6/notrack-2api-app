package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cz1 extends ww1 implements oe1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ s02 d;
    public final /* synthetic */ long h;
    public final /* synthetic */ int l;
    public final /* synthetic */ int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cz1(s02 s02Var, long j, int i, int i2, int i3) {
        super(3);
        this.c = i3;
        this.d = s02Var;
        this.h = j;
        this.l = i;
        this.m = i2;
    }

    @Override // defpackage.oe1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.c;
        a31 a31Var = a31.c;
        int i2 = this.m;
        int i3 = this.l;
        long j = this.h;
        s02 s02Var = this.d;
        switch (i) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                int iIntValue2 = ((Number) obj2).intValue();
                int iG = wm0.g(j, iIntValue + i3);
                int iF = wm0.f(j, iIntValue2 + i2);
                return s02Var.d.s(iG, iF, a31Var, (le1) obj3);
            default:
                int iIntValue3 = ((Number) obj).intValue();
                int iIntValue4 = ((Number) obj2).intValue();
                int iG2 = wm0.g(j, iIntValue3 + i3);
                int iF2 = wm0.f(j, iIntValue4 + i2);
                return s02Var.d.s(iG2, iF2, a31Var, (le1) obj3);
        }
    }
}
