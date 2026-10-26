package defpackage;

import android.content.Context;
import android.net.Uri;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import java.util.concurrent.CancellationException;
import notrack.ai.data.avatars.AvatarItem;

/* JADX INFO: loaded from: classes.dex */
public final class q8 extends mq3 implements ne1 {
    public final /* synthetic */ int c;
    public int d;
    public /* synthetic */ Object h;
    public Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q8(Object obj, Object obj2, Object obj3, so0 so0Var, int i) {
        super(2, so0Var);
        this.c = i;
        this.l = obj;
        this.h = obj2;
        this.m = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q8(Object obj, Object obj2, so0 so0Var, int i) {
        super(2, so0Var);
        this.c = i;
        this.l = obj;
        this.m = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q8(Object obj, Object obj2, so0 so0Var, int i, boolean z) {
        super(2, so0Var);
        this.c = i;
        this.h = obj;
        this.m = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q8(Object obj, ne1 ne1Var, so0 so0Var, int i) {
        super(2, so0Var);
        this.c = i;
        this.m = obj;
        this.l = ne1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q8(mt0 mt0Var, ri2 ri2Var, ne1 ne1Var, so0 so0Var) {
        super(2, so0Var);
        this.c = 18;
        this.h = mt0Var;
        this.m = ri2Var;
        this.l = ne1Var;
    }

    private final Object a(Object obj) throws Throwable {
        f00 f00Var = (f00) this.m;
        int i = this.d;
        try {
            if (i == 0) {
                g13.O(obj);
                gq0 gq0Var = (gq0) this.h;
                ne1 ne1Var = (ne1) this.l;
                this.d = 1;
                obj = ne1Var.invoke(gq0Var, this);
                hq0 hq0Var = hq0.c;
                if (obj == hq0Var) {
                    return hq0Var;
                }
            } else {
                if (i != 1) {
                    u41.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g13.O(obj);
            }
            f00Var.a(obj);
        } catch (CancellationException unused) {
            f00Var.d = true;
            i00 i00Var = f00Var.b;
            if (i00Var != null && i00Var.d.cancel(true)) {
                f00Var.a = null;
                f00Var.b = null;
                f00Var.c = null;
            }
        } catch (Throwable th) {
            f00Var.b(th);
        }
        return w84.a;
    }

    private final Object h(Object obj) throws Throwable {
        pm1 pm1Var = (pm1) this.m;
        g33 g33Var = (g33) this.l;
        gq0 gq0Var = (gq0) this.h;
        int i = this.d;
        int i2 = 1;
        so0 so0Var = null;
        if (i != 0) {
            if (i == 1) {
                g13.O(obj);
                return obj;
            }
            u41.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        g13.O(obj);
        yt0 yt0VarO = py.o(gq0Var, (xp0) g33Var.a.c.getValue(), new e33(g33Var, pm1Var, so0Var, i2));
        ps3 ps3Var = pm1Var.c;
        this.h = null;
        this.d = 1;
        Object objN = yt0VarO.n(this);
        hq0 hq0Var = hq0.c;
        return objN == hq0Var ? hq0Var : objN;
    }

    private final Object i(Object obj) throws Throwable {
        int i = this.d;
        if (i != 0) {
            if (i == 1) {
                g13.O(obj);
                return w84.a;
            }
            u41.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        g13.O(obj);
        gq0 gq0Var = (gq0) this.h;
        c43 c43Var = (c43) this.l;
        xf2 xf2Var = (xf2) this.m;
        this.d = 1;
        c43Var.invoke(gq0Var, xf2Var, this);
        return hq0.c;
    }

    private final Object j(Object obj) throws Throwable {
        int i = this.d;
        if (i != 0) {
            if (i == 1) {
                g13.O(obj);
                return w84.a;
            }
            u41.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        g13.O(obj);
        gq0 gq0Var = (gq0) this.h;
        ah3 ah3Var = ((hh2) ((uq1) this.l)).a;
        ha0 ha0Var = new ha0((f73) this.m, 6, gq0Var);
        this.d = 1;
        ah3Var.getClass();
        ah3.p(ah3Var, ha0Var, this);
        return hq0.c;
    }

    private final Object k(Object obj) throws Throwable {
        int i = this.d;
        if (i == 0) {
            g13.O(obj);
            mc3 mc3Var = (mc3) this.h;
            az0 az0Var = (az0) this.l;
            sg2 sg2Var = new sg2(mc3Var, 6, (oc3) this.m);
            this.d = 1;
            Object objInvoke = az0Var.invoke(sg2Var, this);
            hq0 hq0Var = hq0.c;
            if (objInvoke == hq0Var) {
                return hq0Var;
            }
        } else {
            if (i != 1) {
                u41.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            g13.O(obj);
        }
        return w84.a;
    }

    private final Object l(Object obj) throws Throwable {
        int i = this.d;
        if (i == 0) {
            g13.O(obj);
            pb3 pb3Var = (pb3) this.h;
            oc3 oc3Var = (oc3) this.m;
            oc3Var.j = pb3Var;
            ne1 ne1Var = (ne1) this.l;
            mc3 mc3Var = oc3Var.k;
            this.d = 1;
            Object objInvoke = ne1Var.invoke(mc3Var, this);
            hq0 hq0Var = hq0.c;
            if (objInvoke == hq0Var) {
                return hq0Var;
            }
        } else {
            if (i != 1) {
                u41.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            g13.O(obj);
        }
        return w84.a;
    }

    private final Object n(Object obj) throws Throwable {
        int i = this.d;
        if (i == 0) {
            g13.O(obj);
            gq0 gq0Var = (gq0) this.h;
            pm0 pm0VarE = cl3.e(new ap0((gn3) this.l, 6));
            ha0 ha0Var = new ha0((ue) this.m, 8, gq0Var);
            this.d = 1;
            Object objA = pm0VarE.a(ha0Var, this);
            hq0 hq0Var = hq0.c;
            if (objA == hq0Var) {
                return hq0Var;
            }
        } else {
            if (i != 1) {
                u41.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            g13.O(obj);
        }
        return w84.a;
    }

    @Override // defpackage.wr
    public final so0 create(Object obj, so0 so0Var) {
        int i = this.c;
        Object obj2 = this.m;
        switch (i) {
            case 0:
                return new q8((ne1) this.l, this.h, (gq0) obj2, so0Var, 0);
            case 1:
                q8 q8Var = new q8(obj2, (ne1) this.l, so0Var, 1);
                q8Var.h = obj;
                return q8Var;
            case 2:
                q8 q8Var2 = new q8((oe1) this.l, (ji4) obj2, so0Var, 2);
                q8Var2.h = obj;
                return q8Var2;
            case 3:
                q8 q8Var3 = new q8((pe1) this.l, (ji4) obj2, so0Var, 3);
                q8Var3.h = obj;
                return q8Var3;
            case 4:
                q8 q8Var4 = new q8((o54) this.l, (gn3) obj2, so0Var, 4);
                q8Var4.h = obj;
                return q8Var4;
            case 5:
                return new q8(this.h, obj2, so0Var, 5, false);
            case 6:
                return new q8((qx) this.l, (wl2) this.h, (c9) obj2, so0Var, 6);
            case 7:
                q8 q8Var5 = new q8((l81) this.l, (y20) obj2, so0Var, 7);
                q8Var5.h = obj;
                return q8Var5;
            case 8:
                q8 q8Var6 = new q8((String) this.l, (e60) obj2, so0Var, 8);
                q8Var6.h = obj;
                return q8Var6;
            case 9:
                q8 q8Var7 = new q8((String) this.l, (za1) obj2, so0Var, 9);
                q8Var7.h = obj;
                return q8Var7;
            case 10:
                return new q8((Context) this.l, (hb0) this.h, (Uri) obj2, so0Var, 10);
            case 11:
                return new q8((hb0) this.l, (String) this.h, (byte[]) obj2, so0Var, 11);
            case 12:
                return new q8((hb0) this.l, (String) this.h, (AvatarItem) obj2, so0Var, 12);
            case 13:
                q8 q8Var8 = new q8((hb0) this.l, (tw2) obj2, so0Var, 13);
                q8Var8.h = obj;
                return q8Var8;
            case 14:
                return new q8((a73) this.l, (yf0) this.h, (ry2) obj2, so0Var, 14);
            case 15:
                return new q8(this.h, obj2, so0Var, 15, false);
            case 16:
                return new q8(this.h, obj2, so0Var, 16, false);
            case 17:
                q8 q8Var9 = new q8(obj2, (ne1) this.l, so0Var, 17);
                q8Var9.h = obj;
                return q8Var9;
            case 18:
                return new q8((mt0) this.h, (ri2) obj2, (ne1) this.l, so0Var);
            case 19:
                q8 q8Var10 = new q8((az0) this.l, (mz0) obj2, so0Var, 19);
                q8Var10.h = obj;
                return q8Var10;
            case AndroidComposeViewAccessibilityDelegateCompat.AccessibilitySliderStepsCount /* 20 */:
                return new q8((gh2) this.l, (tq1) this.h, (yw0) obj2, so0Var, 20);
            case 21:
                q8 q8Var11 = new q8((ne1) this.l, (f00) obj2, so0Var, 21);
                q8Var11.h = obj;
                return q8Var11;
            case 22:
                q8 q8Var12 = new q8((tm0) this.l, (fl2) obj2, so0Var, 22);
                q8Var12.h = obj;
                return q8Var12;
            case 23:
                q8 q8Var13 = new q8((g33) this.l, (pm1) obj2, so0Var, 23);
                q8Var13.h = obj;
                return q8Var13;
            case 24:
                q8 q8Var14 = new q8((c43) this.l, (xf2) obj2, so0Var, 24);
                q8Var14.h = obj;
                return q8Var14;
            case 25:
                q8 q8Var15 = new q8((uq1) this.l, (f73) obj2, so0Var, 25);
                q8Var15.h = obj;
                return q8Var15;
            case 26:
                q8 q8Var16 = new q8((az0) this.l, (oc3) obj2, so0Var, 26);
                q8Var16.h = obj;
                return q8Var16;
            case 27:
                q8 q8Var17 = new q8(obj2, (ne1) this.l, so0Var, 27);
                q8Var17.h = obj;
                return q8Var17;
            case 28:
                q8 q8Var18 = new q8((gn3) this.l, (ue) obj2, so0Var, 28);
                q8Var18.h = obj;
                return q8Var18;
            default:
                return new q8((iy2) this.l, (l43) this.h, (fz0) obj2, so0Var, 29);
        }
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.c;
        w84 w84Var = w84.a;
        switch (i) {
            case 0:
                return ((q8) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
            case 1:
                return ((q8) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
            case 2:
                return ((q8) create((r92) obj, (so0) obj2)).invokeSuspend(w84Var);
            case 3:
                return ((q8) create((ps2) obj, (so0) obj2)).invokeSuspend(w84Var);
            case 4:
                return ((q8) create((vz2) obj, (so0) obj2)).invokeSuspend(w84Var);
            case 5:
                return ((q8) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
            case 6:
                return ((q8) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
            case 7:
                return ((q8) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
            case 8:
                return ((q8) create((wz2) obj, (so0) obj2)).invokeSuspend(w84Var);
            case 9:
                return ((q8) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
            case 10:
                return ((q8) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
            case 11:
                return ((q8) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
            case 12:
                return ((q8) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
            case 13:
                return ((q8) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
            case 14:
                return ((q8) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
            case 15:
                return ((q8) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
            case 16:
                return ((q8) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
            case 17:
                return ((q8) create((pb3) obj, (so0) obj2)).invokeSuspend(w84Var);
            case 18:
                return ((q8) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
            case 19:
                return ((q8) create((a9) obj, (so0) obj2)).invokeSuspend(w84Var);
            case AndroidComposeViewAccessibilityDelegateCompat.AccessibilitySliderStepsCount /* 20 */:
                return ((q8) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
            case 21:
                return ((q8) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
            case 22:
                return ((q8) create((wz2) obj, (so0) obj2)).invokeSuspend(w84Var);
            case 23:
                return ((q8) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
            case 24:
                return ((q8) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
            case 25:
                return ((q8) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
            case 26:
                return ((q8) create((mc3) obj, (so0) obj2)).invokeSuspend(w84Var);
            case 27:
                return ((q8) create((pb3) obj, (so0) obj2)).invokeSuspend(w84Var);
            case 28:
                return ((q8) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
            default:
                return ((q8) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:320:0x09c3  */
    /* JADX WARN: Code duplicated, block: B:344:0x0a2b  */
    /* JADX WARN: Code duplicated, block: B:346:0x0a40  */
    /* JADX WARN: Code duplicated, block: B:348:0x0a44  */
    /* JADX WARN: Code duplicated, block: B:350:0x0a4c  */
    /* JADX WARN: Code duplicated, block: B:353:0x0a5e  */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x0a05, code lost:
    
        if (r1 == r8) goto L340;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [so0] */
    /* JADX WARN: Type inference failed for: r10v1, types: [ms2] */
    /* JADX WARN: Type inference failed for: r10v24 */
    @Override // defpackage.wr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r99) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2960
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q8.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
