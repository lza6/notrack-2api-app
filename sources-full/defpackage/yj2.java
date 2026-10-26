package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yj2 extends ww1 implements le1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ rh2 h;
    public final /* synthetic */ gj l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yj2(int i, int i2, rh2 rh2Var, gj gjVar) {
        super(1);
        this.c = i;
        this.d = i2;
        this.h = rh2Var;
        this.l = gjVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x002b  */
    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        Object ct0Var;
        dr1 dr1Var = (dr1) obj;
        le1 key = dr1Var.c.getKey();
        int i = dr1Var.a;
        int iMax = Math.max(this.c, i);
        int iMin = Math.min(this.d, (dr1Var.b + i) - 1);
        if (iMax <= iMin) {
            while (true) {
                if (key == null) {
                    ct0Var = new ct0(iMax);
                } else {
                    ct0Var = key.invoke(Integer.valueOf(iMax - i));
                    if (ct0Var == null) {
                        ct0Var = new ct0(iMax);
                    }
                }
                this.h.h(iMax, ct0Var);
                gj gjVar = this.l;
                ((Object[]) gjVar.d)[iMax - gjVar.b] = ct0Var;
                if (iMax == iMin) {
                    break;
                }
                iMax++;
            }
        }
        return w84.a;
    }
}
