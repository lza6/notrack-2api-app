package defpackage;

import androidx.compose.foundation.gestures.a;

/* JADX INFO: loaded from: classes.dex */
public final class oh extends ww1 implements je1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oh(Object obj, Object obj2, Object obj3, int i) {
        super(0);
        this.c = i;
        this.d = obj;
        this.h = obj2;
        this.l = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oh(kk0 kk0Var, s20 s20Var, wj3 wj3Var, jg2 jg2Var) {
        super(0);
        this.c = 2;
        this.d = kk0Var;
        this.h = s20Var;
        this.l = wj3Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.je1
    public final Object invoke() {
        w44 w44VarC;
        h43 h43VarW0;
        int i = this.c;
        jq0 jq0Var = jq0.l;
        int i2 = 3;
        w84 w84Var = w84.a;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object obj = this.l;
        Object obj2 = this.h;
        Object obj3 = this.d;
        switch (i) {
            case 0:
                n43 n43Var = (n43) obj;
                n43 n43Var2 = (n43) obj2;
                v44 v44Var = (v44) obj3;
                if (!kr1.m((v44Var == null || (w44VarC = v44Var.c()) == null) ? null : Float.valueOf(w44VarC.a.f()), n43Var2.c - n43Var.c)) {
                    w44 w44VarC2 = v44Var != null ? v44Var.c() : null;
                    if (w44VarC2 != null) {
                        w44VarC2.a.h(n43Var2.c - n43Var.c);
                    }
                }
                return w84Var;
            case 1:
                qx qxVar = (qx) obj3;
                h43 h43VarV0 = qx.v0(qxVar, (wl2) obj2, (c9) obj);
                if (h43VarV0 == null) {
                    return null;
                }
                jn0 jn0Var = qxVar.c;
                if (qq1.a(jn0Var.p, 0L)) {
                    so1.c("Expected BringIntoViewRequester to not be used before parents are placed.");
                }
                return h43VarV0.j(jn0Var.z0(jn0Var.p, h43VarV0) ^ (-9223372034707292160L));
            case 2:
                kk0 kk0Var = (kk0) obj3;
                dk0 dk0Var = kk0Var.L;
                s20 s20Var = (s20) obj2;
                wj3 wj3Var = (wj3) obj;
                s20 s20Var2 = dk0Var.b;
                try {
                    dk0Var.b = s20Var;
                    wj3 wj3Var2 = kk0Var.F;
                    int[] iArr = kk0Var.n;
                    dh2 dh2Var = kk0Var.u;
                    kk0Var.n = null;
                    kk0Var.u = null;
                    try {
                        kk0Var.F = wj3Var;
                        boolean z = dk0Var.e;
                        try {
                            dk0Var.e = false;
                            throw null;
                        } catch (Throwable th) {
                            dk0Var.e = z;
                            throw th;
                        }
                    } catch (Throwable th2) {
                        kk0Var.F = wj3Var2;
                        kk0Var.n = iArr;
                        kk0Var.u = dh2Var;
                        throw th2;
                    }
                } catch (Throwable th3) {
                    dk0Var.b = s20Var2;
                    throw th3;
                }
            case 3:
                jn0 jn0Var2 = (jn0) obj3;
                jx jxVar = jn0Var2.l;
                while (true) {
                    oi2 oi2Var = jxVar.a;
                    int i3 = oi2Var.h;
                    if (i3 != 0) {
                        if (i3 == 0) {
                            j93.g("MutableVector is empty.");
                            return null;
                        }
                        h43 h43Var = (h43) ((in0) oi2Var.c[i3 - 1]).a.invoke();
                        if (h43Var == null ? true : jn0Var2.x0(jn0Var2.p, h43Var)) {
                            oi2 oi2Var2 = jxVar.a;
                            ((in0) oi2Var2.m(oi2Var2.h - 1)).b.resumeWith(w84Var);
                        }
                    }
                }
                if (jn0Var2.n && (h43VarW0 = jn0Var2.w0()) != null && jn0Var2.x0(jn0Var2.p, h43VarW0)) {
                    jn0Var2.n = false;
                }
                ((s94) obj2).e = jn0.v0(jn0Var2, (a) obj);
                return w84Var;
            case 4:
                py.F((gq0) obj3, null, jq0Var, new q8(obj2, obj, (so0) null, 15, false), 1);
                return w84Var;
            case 5:
                py.F((gq0) obj3, null, jq0Var, new q8(obj2, obj, (so0) null, 16, false), 1);
                return w84Var;
            case 6:
                q12 q12Var = (q12) ((fv0) obj3).getValue();
                g22 g22Var = (g22) obj2;
                return new t12(g22Var, q12Var, (c02) obj, new gj((lq1) g22Var.d.f.getValue(), q12Var));
            case 7:
                hh3 hh3Var = (hh3) obj3;
                if (((Boolean) ((le1) hh3Var.c.d).invoke(ih3.c)).booleanValue()) {
                    py.F((gq0) obj2, null, null, new ve2(hh3Var, objArr == true ? 1 : 0, i2), 3).A(new ye2(hh3Var, (je1) obj, 0));
                }
                return w84Var;
            case 8:
                if (((Boolean) ((le1) ((hh3) obj3).c.d).invoke(ih3.d)).booleanValue()) {
                    py.F((gq0) obj2, null, null, new ve2((hh3) obj, objArr2 == true ? 1 : 0, 4), 3);
                }
                return Boolean.TRUE;
            default:
                yh4 yh4Var = ((j20) obj3).b;
                yh4Var.getClass();
                return yh4Var.q(((o4) obj).h.d, ((hh1) obj2).a());
        }
    }
}
