package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class us0 extends mq3 implements ne1 {
    public final /* synthetic */ int c = 0;
    public n43 d;
    public int h;
    public final /* synthetic */ float l;
    public Object m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ pb3 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public us0(float f, vs0 vs0Var, c22 c22Var, so0 so0Var) {
        super(2, so0Var);
        this.l = f;
        this.n = vs0Var;
        this.o = c22Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public us0(hk3 hk3Var, float f, le1 le1Var, pb3 pb3Var, so0 so0Var) {
        super(2, so0Var);
        this.m = hk3Var;
        this.l = f;
        this.n = le1Var;
        this.o = pb3Var;
    }

    @Override // defpackage.wr
    public final so0 create(Object obj, so0 so0Var) {
        int i = this.c;
        Object obj2 = this.n;
        switch (i) {
            case 0:
                c22 c22Var = (c22) this.o;
                return new us0(this.l, (vs0) obj2, c22Var, so0Var);
            default:
                pb3 pb3Var = this.o;
                return new us0((hk3) this.m, this.l, (le1) obj2, pb3Var, so0Var);
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
        }
        return ((us0) create(gq0Var, so0Var)).invokeSuspend(w84Var);
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) throws Throwable {
        n43 n43Var;
        xf xfVar;
        n43 n43Var2;
        Object objB;
        int i = this.c;
        hq0 hq0Var = hq0.c;
        float f = this.l;
        Object obj2 = this.n;
        switch (i) {
            case 0:
                int i2 = this.h;
                if (i2 != 0) {
                    if (i2 != 1) {
                        u41.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xfVar = (xf) this.m;
                    n43Var = this.d;
                    try {
                        g13.O(obj);
                    } catch (CancellationException unused) {
                        n43Var.c = ((Number) xfVar.b()).floatValue();
                    }
                    f = n43Var.c;
                    break;
                } else {
                    g13.O(obj);
                    if (Math.abs(f) > 1.0f) {
                        n43Var = new n43();
                        n43Var.c = f;
                        n43 n43Var3 = new n43();
                        xf xfVarA = av1.a(0.0f, f, 28);
                        try {
                            vs0 vs0Var = (vs0) obj2;
                            zr0 zr0Var = vs0Var.a;
                            ie ieVar = new ie(n43Var3, (c22) this.o, n43Var, vs0Var);
                            this.d = n43Var;
                            this.m = xfVarA;
                            this.h = 1;
                            if (vl0.p(xfVarA, zr0Var, false, ieVar, this) == hq0Var) {
                                return hq0Var;
                            }
                        } catch (CancellationException unused2) {
                            xfVar = xfVarA;
                            n43Var.c = ((Number) xfVar.b()).floatValue();
                        }
                        f = n43Var.c;
                    }
                }
                return new Float(f);
            default:
                le1 le1Var = (le1) obj2;
                hk3 hk3Var = (hk3) this.m;
                mk3 mk3Var = hk3Var.a;
                int i3 = this.h;
                if (i3 == 0) {
                    g13.O(obj);
                    zr0 zr0Var2 = hk3Var.b;
                    x64 x64Var = mb4.a;
                    float fA = mk3Var.a(((yf) new ir3(((as0) zr0Var2).a).X(new yf(0.0f), new yf(f))).a);
                    if (Float.isNaN(fA)) {
                        so1.c("calculateApproachOffset returned NaN. Please use a valid value.");
                    }
                    n43Var2 = new n43();
                    float fSignum = Math.signum(f) * Math.abs(fA);
                    n43Var2.c = fSignum;
                    le1Var.invoke(new Float(fSignum));
                    float f2 = n43Var2.c;
                    ek3 ek3Var = new ek3(n43Var2, le1Var, 1);
                    this.d = n43Var2;
                    this.h = 1;
                    objB = hk3.b(hk3Var, this.o, f2, this.l, ek3Var, this);
                    if (objB != hq0Var) {
                    }
                    return hq0Var;
                }
                if (i3 != 1) {
                    if (i3 == 2) {
                        g13.O(obj);
                        return obj;
                    }
                    u41.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                n43 n43Var4 = this.d;
                g13.O(obj);
                n43Var2 = n43Var4;
                objB = obj;
                xf xfVar2 = (xf) objB;
                float fB = mk3Var.b(((Number) xfVar2.b()).floatValue());
                if (Float.isNaN(fB)) {
                    so1.c("calculateSnapOffset returned NaN. Please use a valid value.");
                }
                n43Var2.c = fB;
                xf xfVarK = av1.k(xfVar2, 0.0f, 0.0f, 30);
                tm3 tm3Var = hk3Var.c;
                ek3 ek3Var2 = new ek3(n43Var2, le1Var, 0);
                this.d = null;
                this.h = 2;
                Object objC = lk3.c(this.o, fB, fB, xfVarK, tm3Var, ek3Var2, this);
                if (objC != hq0Var) {
                    return objC;
                }
                return hq0Var;
        }
    }
}
