package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class lu2 implements xf2 {
    public final xf2 c;
    public final hw0 d = new hw0();

    public lu2(xf2 xf2Var) {
        this.c = xf2Var;
    }

    @Override // defpackage.xp0
    public final Object fold(Object obj, ne1 ne1Var) {
        return ne1Var.invoke(obj, this);
    }

    @Override // defpackage.xp0
    public final vp0 get(wp0 wp0Var) {
        return y64.w(this, wp0Var);
    }

    @Override // defpackage.xp0
    public final xp0 minusKey(wp0 wp0Var) {
        return y64.H(this, wp0Var);
    }

    @Override // defpackage.xp0
    public final xp0 plus(xp0 xp0Var) {
        return y64.I(this, xp0Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.xf2
    public final Object withFrameNanos(le1 le1Var, so0 so0Var) throws Throwable {
        ku2 ku2Var;
        boolean z;
        Object objS;
        if (so0Var instanceof ku2) {
            ku2Var = (ku2) so0Var;
            int i = ku2Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                ku2Var.m = i - Integer.MIN_VALUE;
            } else {
                ku2Var = new ku2(this, so0Var);
            }
        } else {
            ku2Var = new ku2(this, so0Var);
        }
        Object obj = ku2Var.h;
        hq0 hq0Var = hq0.c;
        int i2 = ku2Var.m;
        if (i2 == 0) {
            g13.O(obj);
            hw0 hw0Var = this.d;
            ku2Var.c = this;
            ku2Var.d = le1Var;
            ku2Var.m = 1;
            synchronized (hw0Var.c) {
                z = hw0Var.b;
            }
            if (z) {
                objS = w84.a;
            } else {
                t00 t00Var = new t00(1, gm4.G(ku2Var));
                t00Var.u();
                synchronized (hw0Var.c) {
                    ((ArrayList) hw0Var.a).add(t00Var);
                }
                t00Var.w(new rc(hw0Var, 23, t00Var));
                objS = t00Var.s();
                if (objS != hq0Var) {
                    objS = w84.a;
                }
            }
            if (objS != hq0Var) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                g13.O(obj);
                return obj;
            }
            u41.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        le1Var = ku2Var.d;
        this = ku2Var.c;
        g13.O(obj);
        xf2 xf2Var = this.c;
        ku2Var.c = null;
        ku2Var.d = null;
        ku2Var.m = 2;
        Object objWithFrameNanos = xf2Var.withFrameNanos(le1Var, ku2Var);
        return objWithFrameNanos == hq0Var ? hq0Var : objWithFrameNanos;
    }
}
