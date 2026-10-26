package defpackage;

import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class ef implements is0 {
    public final wm1 a;
    public final jq2 b;
    public final boolean c;

    public ef(wm1 wm1Var, jq2 jq2Var, boolean z) {
        this.a = wm1Var;
        this.b = jq2Var;
        this.c = z;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.is0
    public final Object a(so0 so0Var) throws Throwable {
        af afVar;
        l43 l43Var;
        Object objS;
        l43 l43Var2;
        if (so0Var instanceof af) {
            afVar = (af) so0Var;
            int i = afVar.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                afVar.m = i - Integer.MIN_VALUE;
            } else {
                afVar = new af(this, (uo0) so0Var);
            }
        } else {
            afVar = new af(this, (uo0) so0Var);
        }
        Object obj = afVar.h;
        int i2 = afVar.m;
        hq0 hq0Var = hq0.c;
        if (i2 == 0) {
            g13.O(obj);
            l43Var = new l43();
            ye yeVar = new ye(this, 0, l43Var);
            afVar.c = this;
            afVar.d = l43Var;
            afVar.m = 1;
            objS = yh4.S(yeVar, afVar);
            if (objS != hq0Var) {
            }
            return hq0Var;
        }
        if (i2 == 1) {
            l43 l43Var3 = afVar.d;
            ef efVar = (ef) afVar.c;
            g13.O(obj);
            l43Var = l43Var3;
            this = efVar;
            objS = obj;
        } else {
            if (i2 != 2) {
                u41.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            l43Var2 = (l43) afVar.c;
            g13.O(obj);
        }
        return new bs0(vl0.u((Drawable) obj), l43Var2.c);
        afVar.c = l43Var;
        afVar.d = null;
        afVar.m = 2;
        Object objB = this.b((Drawable) objS, afVar);
        if (objB != hq0Var) {
            l43 l43Var4 = l43Var;
            obj = objB;
            l43Var2 = l43Var4;
            return new bs0(vl0.u((Drawable) obj), l43Var2.c);
        }
        return hq0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(Drawable drawable, uo0 uo0Var) throws Throwable {
        cf cfVar;
        if (uo0Var instanceof cf) {
            cfVar = (cf) uo0Var;
            int i = cfVar.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                cfVar.m = i - Integer.MIN_VALUE;
            } else {
                cfVar = new cf(this, uo0Var);
            }
        } else {
            cfVar = new cf(this, uo0Var);
        }
        Object obj = cfVar.h;
        int i2 = cfVar.m;
        if (i2 == 0) {
            g13.O(obj);
            if (!d1.u(drawable)) {
                return drawable;
            }
            AnimatedImageDrawable animatedImageDrawableD = d1.d(drawable);
            f61 f61Var = yo4.i;
            jq2 jq2Var = this.b;
            animatedImageDrawableD.setRepeatCount(((Number) y64.A(jq2Var, f61Var)).intValue());
            je1 je1Var = (je1) y64.A(jq2Var, yo4.k);
            je1 je1Var2 = (je1) y64.A(jq2Var, yo4.l);
            if (je1Var != null || je1Var2 != null) {
                jt0 jt0Var = sw0.a;
                eh1 eh1Var = i92.a.l;
                df dfVar = new df(drawable, je1Var, je1Var2, null, 0);
                cfVar.c = this;
                cfVar.d = drawable;
                cfVar.m = 1;
                Object objY = py.Y(eh1Var, dfVar, cfVar);
                hq0 hq0Var = hq0.c;
                if (objY == hq0Var) {
                    return hq0Var;
                }
                drawable = drawable;
            }
        } else {
            if (i2 != 1) {
                u41.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            drawable = cfVar.d;
            this = cfVar.c;
            g13.O(obj);
        }
        return new oa3(drawable, this.b.c);
    }
}
