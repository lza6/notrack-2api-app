package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class u30 extends mq3 implements ne1 {
    public final /* synthetic */ int c;
    public Object d;
    public int h;
    public final /* synthetic */ boolean l;
    public final /* synthetic */ mi2 m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u30(mi2 mi2Var, boolean z, gh2 gh2Var, so0 so0Var) {
        super(2, so0Var);
        this.c = 2;
        this.m = mi2Var;
        this.l = z;
        this.n = gh2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u30(boolean z, dt2 dt2Var, float[] fArr, so0 so0Var, int i) {
        super(2, so0Var);
        this.c = i;
        this.l = z;
        this.m = dt2Var;
        this.n = fArr;
    }

    @Override // defpackage.wr
    public final so0 create(Object obj, so0 so0Var) {
        switch (this.c) {
            case 0:
                return new u30(this.l, (dt2) this.m, (float[]) this.n, so0Var, 0);
            case 1:
                return new u30(this.l, (dt2) this.m, (float[]) this.n, so0Var, 1);
            default:
                return new u30(this.m, this.l, (gh2) this.n, so0Var);
        }
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.c;
        w84 w84Var = w84.a;
        gq0 gq0Var = (gq0) obj;
        so0 so0Var = (so0) obj2;
        switch (i) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((u30) create(gq0Var, so0Var)).invokeSuspend(w84Var);
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) throws Throwable {
        final p43 p43Var;
        le1 le1Var;
        final p43 p43Var2;
        le1 le1Var2;
        int i = this.c;
        w84 w84Var = w84.a;
        Object obj2 = this.n;
        boolean z = this.l;
        hq0 hq0Var = hq0.c;
        mi2 mi2Var = this.m;
        final int i2 = 1;
        switch (i) {
            case 0:
                final dt2 dt2Var = (dt2) mi2Var;
                int i3 = this.h;
                if (i3 == 0) {
                    g13.O(obj);
                    if (z) {
                        Set set = v30.a;
                        dt2Var.h(1L);
                        return w84Var;
                    }
                    p43Var = new p43();
                } else {
                    if (i3 != 1) {
                        u41.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p43Var = (p43) this.d;
                    g13.O(obj);
                }
                do {
                    final float[] fArr = (float[]) obj2;
                    final int i4 = 0;
                    le1Var = new le1() { // from class: t30
                        @Override // defpackage.le1
                        public final Object invoke(Object obj3) {
                            float fMin;
                            int i5 = i4;
                            w84 w84Var2 = w84.a;
                            dt2 dt2Var2 = dt2Var;
                            float[] fArr2 = fArr;
                            p43 p43Var3 = p43Var;
                            switch (i5) {
                                case 0:
                                    long jLongValue = ((Long) obj3).longValue();
                                    long j = p43Var3.c;
                                    fMin = j != 0 ? Math.min(3.0f, (jLongValue - j) / 1.6666667E7f) : 1.0f;
                                    p43Var3.c = jLongValue;
                                    fArr2[0] = fArr2[0] + fMin;
                                    fArr2[1] = fMin;
                                    Set set2 = v30.a;
                                    dt2Var2.h(jLongValue);
                                    break;
                                default:
                                    long jLongValue2 = ((Long) obj3).longValue();
                                    long j2 = p43Var3.c;
                                    fMin = j2 != 0 ? Math.min(3.0f, (jLongValue2 - j2) / 1.6666667E7f) : 1.0f;
                                    p43Var3.c = jLongValue2;
                                    fArr2[0] = fArr2[0] + fMin;
                                    fArr2[1] = fMin;
                                    dt2Var2.h(jLongValue2);
                                    break;
                            }
                            return w84Var2;
                        }
                    };
                    this.d = p43Var;
                    this.h = 1;
                } while (yo4.z(getContext()).withFrameNanos(le1Var, this) != hq0Var);
                return hq0Var;
            case 1:
                final dt2 dt2Var2 = (dt2) mi2Var;
                int i5 = this.h;
                if (i5 == 0) {
                    g13.O(obj);
                    if (z) {
                        dt2Var2.h(1L);
                        return w84Var;
                    }
                    p43Var2 = new p43();
                } else {
                    if (i5 != 1) {
                        u41.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p43Var2 = (p43) this.d;
                    g13.O(obj);
                }
                do {
                    final float[] fArr2 = (float[]) obj2;
                    le1Var2 = new le1() { // from class: t30
                        @Override // defpackage.le1
                        public final Object invoke(Object obj3) {
                            float fMin;
                            int i6 = i2;
                            w84 w84Var2 = w84.a;
                            dt2 dt2Var3 = dt2Var2;
                            float[] fArr3 = fArr2;
                            p43 p43Var3 = p43Var2;
                            switch (i6) {
                                case 0:
                                    long jLongValue = ((Long) obj3).longValue();
                                    long j = p43Var3.c;
                                    fMin = j != 0 ? Math.min(3.0f, (jLongValue - j) / 1.6666667E7f) : 1.0f;
                                    p43Var3.c = jLongValue;
                                    fArr3[0] = fArr3[0] + fMin;
                                    fArr3[1] = fMin;
                                    Set set2 = v30.a;
                                    dt2Var3.h(jLongValue);
                                    break;
                                default:
                                    long jLongValue2 = ((Long) obj3).longValue();
                                    long j2 = p43Var3.c;
                                    fMin = j2 != 0 ? Math.min(3.0f, (jLongValue2 - j2) / 1.6666667E7f) : 1.0f;
                                    p43Var3.c = jLongValue2;
                                    fArr3[0] = fArr3[0] + fMin;
                                    fArr3[1] = fMin;
                                    dt2Var3.h(jLongValue2);
                                    break;
                            }
                            return w84Var2;
                        }
                    };
                    this.d = p43Var2;
                    this.h = 1;
                } while (yo4.z(getContext()).withFrameNanos(le1Var2, this) != hq0Var);
                return hq0Var;
            default:
                int i6 = this.h;
                if (i6 == 0) {
                    g13.O(obj);
                    ry2 ry2Var = (ry2) mi2Var.getValue();
                    if (ry2Var == null) {
                        return w84Var;
                    }
                    gh2 gh2Var = (gh2) obj2;
                    tq1 sy2Var = z ? new sy2(ry2Var) : new qy2(ry2Var);
                    if (gh2Var != null) {
                        this.d = mi2Var;
                        this.h = 1;
                        if (((hh2) gh2Var).a(sy2Var, this) == hq0Var) {
                            return hq0Var;
                        }
                    }
                } else {
                    if (i6 != 1) {
                        u41.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mi2Var = (mi2) this.d;
                    g13.O(obj);
                }
                mi2Var.setValue(null);
                return w84Var;
        }
    }
}
