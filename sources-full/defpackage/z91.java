package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class z91 extends ww1 implements le1 {
    public final /* synthetic */ int[] c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int h;
    public final /* synthetic */ int l;
    public final /* synthetic */ nv2[] m;
    public final /* synthetic */ aa1 n;
    public final /* synthetic */ int o;
    public final /* synthetic */ dx1 p;
    public final /* synthetic */ int[] q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z91(int[] iArr, int i, int i2, int i3, nv2[] nv2VarArr, aa1 aa1Var, int i4, dx1 dx1Var, int[] iArr2) {
        super(1);
        this.c = iArr;
        this.d = i;
        this.h = i2;
        this.l = i3;
        this.m = nv2VarArr;
        this.n = aa1Var;
        this.o = i4;
        this.p = dx1Var;
        this.q = iArr2;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        py pyVar;
        mv2 mv2Var = (mv2) obj;
        int[] iArr = this.c;
        int i = iArr != null ? iArr[this.d] : 0;
        int i2 = this.h;
        for (int i3 = i2; i3 < this.l; i3++) {
            nv2 nv2Var = this.m[i3];
            nv2Var.getClass();
            Object objI = nv2Var.i();
            d83 d83Var = objI instanceof d83 ? (d83) objI : null;
            aa1 aa1Var = this.n;
            if (d83Var == null || (pyVar = d83Var.c) == null) {
                pyVar = aa1Var.e;
            }
            int iM = pyVar.m(this.o - aa1Var.h(nv2Var), this.p) + i;
            boolean z = aa1Var.a;
            int[] iArr2 = this.q;
            if (z) {
                mv2.d(mv2Var, nv2Var, iArr2[i3 - i2], iM);
            } else {
                mv2.d(mv2Var, nv2Var, iM, iArr2[i3 - i2]);
            }
        }
        return w84.a;
    }
}
