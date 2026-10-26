package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class f12 extends ww1 implements le1 {
    public final /* synthetic */ c22 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ float h;
    public final /* synthetic */ n43 l;
    public final /* synthetic */ l43 m;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ float o;
    public final /* synthetic */ o43 p;
    public final /* synthetic */ int q;
    public final /* synthetic */ q43 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f12(c22 c22Var, int i, float f, n43 n43Var, l43 l43Var, boolean z, float f2, o43 o43Var, int i2, q43 q43Var) {
        super(1);
        this.c = c22Var;
        this.d = i;
        this.h = f;
        this.l = n43Var;
        this.m = l43Var;
        this.n = z;
        this.o = f2;
        this.p = o43Var;
        this.q = i2;
        this.r = q43Var;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:41:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:9:0x002e A[PHI: r3
  0x002e: PHI (r3v20 float) = (r3v7 float), (r3v24 float) binds: [B:11:0x003e, B:7:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        float fFloatValue;
        vf vfVar = (vf) obj;
        c22 c22Var = this.c;
        g22 g22Var = (g22) c22Var.c;
        int i = this.d;
        boolean zV = xp1.v(c22Var, i);
        l43 l43Var = this.m;
        boolean z = this.n;
        if (!zV) {
            float f = this.h;
            if (f > 0.0f) {
                fFloatValue = ((Number) vfVar.e.getValue()).floatValue();
                if (fFloatValue <= f) {
                    f = fFloatValue;
                }
            } else {
                fFloatValue = ((Number) vfVar.e.getValue()).floatValue();
                if (fFloatValue >= f) {
                    f = fFloatValue;
                }
            }
            n43 n43Var = this.l;
            float f2 = f - n43Var.c;
            float fA = ((pb3) c22Var.b).a(f2);
            if (xp1.v(c22Var, i) || xp1.b(z, c22Var, i)) {
                if (xp1.b(z, c22Var, i)) {
                    g22Var.j(i, 0, true);
                    l43Var.c = false;
                    vfVar.a();
                } else if (xp1.v(c22Var, i)) {
                    throw new zr1(c22.b(c22Var, i), (xf) this.r.c);
                }
            } else if (f2 == fA) {
                n43Var.c += f2;
                float f3 = this.o;
                if (z) {
                    if (((Number) vfVar.e.getValue()).floatValue() > f3) {
                        vfVar.a();
                    }
                } else if (((Number) vfVar.e.getValue()).floatValue() < (-f3)) {
                    vfVar.a();
                }
                int i2 = this.p.c;
                int i3 = this.q;
                if (z) {
                    if (i2 >= 2 && i - c22Var.d() > i3) {
                        g22Var.j(i - i3, 0, true);
                    }
                } else if (i2 >= 2 && c22Var.c() - i > i3) {
                    g22Var.j(i3 + i, 0, true);
                }
                if (xp1.b(z, c22Var, i)) {
                    g22Var.j(i, 0, true);
                    l43Var.c = false;
                    vfVar.a();
                } else if (xp1.v(c22Var, i)) {
                    throw new zr1(c22.b(c22Var, i), (xf) this.r.c);
                }
            } else {
                vfVar.a();
                l43Var.c = false;
            }
        } else if (xp1.b(z, c22Var, i)) {
            g22Var.j(i, 0, true);
            l43Var.c = false;
            vfVar.a();
        } else if (xp1.v(c22Var, i)) {
            throw new zr1(c22.b(c22Var, i), (xf) this.r.c);
        }
        return w84.a;
    }
}
