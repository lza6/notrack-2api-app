package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class t91 extends ww1 implements le1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ oi2 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t91(int i, oi2 oi2Var) {
        super(1);
        this.c = i;
        this.d = oi2Var;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        int i = this.c;
        oi2 oi2Var = this.d;
        switch (i) {
            case 0:
                Object[] objArr = oi2Var.c;
                int i2 = oi2Var.h;
                for (int i3 = 0; i3 < i2; i3++) {
                    ((wb2) objArr[i3]).b();
                }
                return w84.a;
            default:
                oi2Var.c((nf2) obj);
                return Boolean.TRUE;
        }
    }
}
