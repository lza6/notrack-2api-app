package defpackage;

import androidx.compose.ui.platform.PlatformTextInputModifierNodeKt;

/* JADX INFO: loaded from: classes.dex */
public final class iu3 extends mq3 implements ne1 {
    public final /* synthetic */ int c;
    public int d;
    public final /* synthetic */ nu3 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iu3(nu3 nu3Var, so0 so0Var, int i) {
        super(2, so0Var);
        this.c = i;
        this.h = nu3Var;
    }

    @Override // defpackage.wr
    public final so0 create(Object obj, so0 so0Var) {
        int i = this.c;
        nu3 nu3Var = this.h;
        switch (i) {
            case 0:
                return new iu3(nu3Var, so0Var, 0);
            case 1:
                return new iu3(nu3Var, so0Var, 1);
            case 2:
                return new iu3(nu3Var, so0Var, 2);
            case 3:
                return new iu3(nu3Var, so0Var, 3);
            case 4:
                return new iu3(nu3Var, so0Var, 4);
            default:
                return new iu3(nu3Var, so0Var, 5);
        }
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = this.c;
        w84 w84Var = w84.a;
        gq0 gq0Var = (gq0) obj;
        so0 so0Var = (so0) obj2;
        switch (i) {
            case 0:
                return ((iu3) create(gq0Var, so0Var)).invokeSuspend(w84Var);
            case 1:
                return ((iu3) create(gq0Var, so0Var)).invokeSuspend(w84Var);
            case 2:
                return ((iu3) create(gq0Var, so0Var)).invokeSuspend(w84Var);
            case 3:
                return ((iu3) create(gq0Var, so0Var)).invokeSuspend(w84Var);
            case 4:
                return ((iu3) create(gq0Var, so0Var)).invokeSuspend(w84Var);
            default:
                ((iu3) create(gq0Var, so0Var)).invokeSuspend(w84Var);
                return hq0.c;
        }
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.c;
        w84 w84Var = w84.a;
        nu3 nu3Var = this.h;
        hq0 hq0Var = hq0.c;
        so0 so0Var = null;
        switch (i) {
            case 0:
                int i2 = this.d;
                if (i2 != 0) {
                    if (i2 == 1) {
                        g13.O(obj);
                        return w84Var;
                    }
                    u41.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g13.O(obj);
                this.d = 1;
                Object objA = new pm0(2, new pm0(1, cl3.e(new hu3(nu3Var, 7)))).a(new nb(6, nu3Var), this);
                if (objA != hq0Var) {
                    objA = w84Var;
                }
                return objA == hq0Var ? hq0Var : w84Var;
            case 1:
                int i3 = this.d;
                if (i3 == 0) {
                    g13.O(obj);
                    wx3 wx3Var = nu3Var.m;
                    this.d = 1;
                    return wx3Var.g(this) == hq0Var ? hq0Var : w84Var;
                }
                if (i3 == 1) {
                    g13.O(obj);
                    return w84Var;
                }
                u41.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 2:
                int i4 = this.d;
                if (i4 == 0) {
                    g13.O(obj);
                    wx3 wx3Var2 = nu3Var.m;
                    this.d = 1;
                    return wx3Var2.t(this) == hq0Var ? hq0Var : w84Var;
                }
                if (i4 == 1) {
                    g13.O(obj);
                    return w84Var;
                }
                u41.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 3:
                int i5 = this.d;
                if (i5 == 0) {
                    g13.O(obj);
                    wx3 wx3Var3 = nu3Var.m;
                    this.d = 1;
                    return wx3Var3.f(true, this) == hq0Var ? hq0Var : w84Var;
                }
                if (i5 == 1) {
                    g13.O(obj);
                    return w84Var;
                }
                u41.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 4:
                int i6 = this.d;
                if (i6 == 0) {
                    g13.O(obj);
                    wx3 wx3Var4 = nu3Var.m;
                    this.d = 1;
                    return wx3Var4.y(this) == hq0Var ? hq0Var : w84Var;
                }
                if (i6 == 1) {
                    g13.O(obj);
                    return w84Var;
                }
                u41.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                int i7 = this.d;
                if (i7 != 0) {
                    if (i7 != 1) {
                        u41.r("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        g13.O(obj);
                    }
                    return null;
                }
                g13.O(obj);
                hl3 hl3Var = new hl3(nu3Var, so0Var, 4);
                this.d = 1;
                if (PlatformTextInputModifierNodeKt.establishTextInputSession(nu3Var, hl3Var, this) == hq0Var) {
                    return hq0Var;
                }
                u41.p();
                return null;
        }
    }
}
