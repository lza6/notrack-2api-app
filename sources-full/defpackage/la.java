package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class la extends ww1 implements le1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ float d;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ la(float f, Object obj, Object obj2, int i) {
        super(1);
        this.c = i;
        this.d = f;
        this.h = obj;
        this.l = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public la(nv2 nv2Var, r04 r04Var, float f) {
        super(1);
        this.c = 2;
        this.h = nv2Var;
        this.l = r04Var;
        this.d = f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public la(s94 s94Var, float f, le1 le1Var) {
        super(1);
        this.c = 3;
        this.h = s94Var;
        this.d = f;
        this.l = le1Var;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:25:0x00a7 A[PHI: r0
  0x00a7: PHI (r0v11 float) = (r0v10 float), (r0v17 float) binds: [B:29:0x00bb, B:23:0x00a3] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        float fFloatValue;
        int i = this.c;
        float f = 0.0f;
        w84 w84Var = w84.a;
        Object obj2 = this.l;
        float f2 = this.d;
        Object obj3 = this.h;
        switch (i) {
            case 0:
                wx1 wx1Var = (wx1) obj;
                wx1Var.a();
                bm1 bm1Var = (bm1) obj3;
                jv jvVar = (jv) obj2;
                a10 a10Var = wx1Var.c;
                ci4 ci4Var = a10Var.d;
                long jC = ci4Var.C();
                ci4Var.y().l();
                try {
                    jb jbVar = (jb) ci4Var.d;
                    jbVar.B(f2, 0.0f);
                    jbVar.z(45.0f);
                    a10Var.d(bm1Var, jvVar);
                    return w84Var;
                } finally {
                    fq2.x(ci4Var, jC);
                }
            case 1:
                vf vfVar = (vf) obj;
                n43 n43Var = (n43) obj3;
                if (f2 > 0.0f) {
                    fFloatValue = ((Number) vfVar.e.getValue()).floatValue();
                    if (fFloatValue > f2) {
                        f = f2;
                    } else {
                        f = fFloatValue;
                    }
                } else if (f2 < 0.0f) {
                    fFloatValue = ((Number) vfVar.e.getValue()).floatValue();
                    if (fFloatValue < f2) {
                        f = f2;
                    } else {
                        f = fFloatValue;
                    }
                }
                float f3 = f - n43Var.c;
                if (f3 != ((pb3) ((c22) obj2).b).a(f3) || f != ((Number) vfVar.e.getValue()).floatValue()) {
                    vfVar.a();
                }
                n43Var.c += f3;
                return w84Var;
            case 2:
                mv2 mv2Var = (mv2) obj;
                nv2 nv2Var = (nv2) obj3;
                ue ueVar = ((r04) obj2).l;
                mv2.f(mv2Var, nv2Var, ueVar != null ? (int) ((Number) ueVar.d()).floatValue() : (int) f2, 0);
                return w84Var;
            default:
                long jLongValue = ((Number) obj).longValue();
                s94 s94Var = (s94) obj3;
                if (s94Var.b == Long.MIN_VALUE) {
                    s94Var.b = jLongValue;
                }
                float f4 = s94Var.e;
                yf yfVar = new yf(f4);
                yf yfVar2 = s94.f;
                long jB = f2 == 0.0f ? s94Var.a.b(new yf(f4), yfVar2, s94Var.c) : gb2.S((jLongValue - s94Var.b) / f2);
                float f5 = ((yf) s94Var.a.u(jB, yfVar, yfVar2, s94Var.c)).a;
                s94Var.c = (yf) s94Var.a.s(jB, yfVar, yfVar2, s94Var.c);
                s94Var.b = jLongValue;
                float f6 = s94Var.e - f5;
                s94Var.e = f5;
                ((le1) obj2).invoke(Float.valueOf(f6));
                return w84Var;
        }
    }
}
