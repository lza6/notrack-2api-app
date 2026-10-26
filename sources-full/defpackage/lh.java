package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lh extends ww1 implements le1 {
    public final /* synthetic */ nv2 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ nv2 h;
    public final /* synthetic */ el l;
    public final /* synthetic */ long m;
    public final /* synthetic */ nv2 n;
    public final /* synthetic */ xb2 o;
    public final /* synthetic */ gl p;
    public final /* synthetic */ int q;
    public final /* synthetic */ int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lh(nv2 nv2Var, int i, nv2 nv2Var2, el elVar, long j, nv2 nv2Var3, xb2 xb2Var, gl glVar, int i2, int i3) {
        super(1);
        this.c = nv2Var;
        this.d = i;
        this.h = nv2Var2;
        this.l = elVar;
        this.m = j;
        this.n = nv2Var3;
        this.o = xb2Var;
        this.p = glVar;
        this.q = i2;
        this.r = i3;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        int iH;
        int iH2;
        mv2 mv2Var = (mv2) obj;
        nv2 nv2Var = this.c;
        int i = nv2Var.d;
        int i2 = this.d;
        int iMax = 0;
        mv2.f(mv2Var, nv2Var, 0, (i2 - i) / 2);
        el elVar = this.l;
        bg1 bg1Var = hl.e;
        boolean zN = kr1.n(elVar, bg1Var);
        nv2 nv2Var2 = this.n;
        nv2 nv2Var3 = this.h;
        long j = this.m;
        if (zN) {
            int iH3 = um0.h(j);
            int i3 = nv2Var3.c;
            iH = (iH3 - i3) / 2;
            int i4 = nv2Var.c;
            if (iH < i4) {
                iH2 = i4 - iH;
            } else if (i3 + iH > um0.h(j) - nv2Var2.c) {
                iH2 = (um0.h(j) - nv2Var2.c) - (nv2Var3.c + iH);
            }
            iH += iH2;
        } else {
            iH = kr1.n(elVar, hl.b) ? (um0.h(j) - nv2Var3.c) - nv2Var2.c : Math.max(this.o.O(wh.g), nv2Var.c);
        }
        gl glVar = this.p;
        if (kr1.n(glVar, bg1Var)) {
            iMax = (i2 - nv2Var3.d) / 2;
        } else if (kr1.n(glVar, hl.d)) {
            int i5 = nv2Var3.d;
            int i6 = this.q;
            if (i6 == 0) {
                iMax = i2 - i5;
            } else {
                int iG = i6 - (i5 - this.r);
                int i7 = i5 + iG;
                if (i7 > um0.g(j)) {
                    iG -= i7 - um0.g(j);
                }
                iMax = (i2 - nv2Var3.d) - Math.max(0, iG);
            }
        }
        mv2.f(mv2Var, nv2Var3, iH, iMax);
        mv2.f(mv2Var, nv2Var2, um0.h(j) - nv2Var2.c, (i2 - nv2Var2.d) / 2);
        return w84.a;
    }
}
