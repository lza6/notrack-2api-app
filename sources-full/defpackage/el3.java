package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class el3 extends mq3 implements ne1 {
    public final /* synthetic */ int c;
    public int d;
    public /* synthetic */ Object h;
    public final /* synthetic */ ne1 l;
    public final /* synthetic */ mi2 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ el3(ne1 ne1Var, mi2 mi2Var, so0 so0Var, int i) {
        super(2, so0Var);
        this.c = i;
        this.l = ne1Var;
        this.m = mi2Var;
    }

    @Override // defpackage.wr
    public final so0 create(Object obj, so0 so0Var) {
        switch (this.c) {
            case 0:
                el3 el3Var = new el3(this.l, this.m, so0Var, 0);
                el3Var.h = obj;
                return el3Var;
            case 1:
                el3 el3Var2 = new el3(this.l, this.m, so0Var, 1);
                el3Var2.h = obj;
                return el3Var2;
            case 2:
                el3 el3Var3 = new el3(this.l, this.m, so0Var, 2);
                el3Var3.h = obj;
                return el3Var3;
            case 3:
                el3 el3Var4 = new el3(this.l, this.m, so0Var, 3);
                el3Var4.h = obj;
                return el3Var4;
            default:
                el3 el3Var5 = new el3(this.l, this.m, so0Var, 4);
                el3Var5.h = obj;
                return el3Var5;
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
            case 2:
                break;
            case 3:
                break;
        }
        return ((el3) create(gq0Var, so0Var)).invokeSuspend(w84Var);
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.c;
        w84 w84Var = w84.a;
        mi2 mi2Var = this.m;
        ne1 ne1Var = this.l;
        hq0 hq0Var = hq0.c;
        switch (i) {
            case 0:
                int i2 = this.d;
                if (i2 == 0) {
                    g13.O(obj);
                    vz2 vz2Var = new vz2(mi2Var, ((gq0) this.h).getCoroutineContext());
                    this.d = 1;
                    return ne1Var.invoke(vz2Var, this) == hq0Var ? hq0Var : w84Var;
                }
                if (i2 == 1) {
                    g13.O(obj);
                    return w84Var;
                }
                u41.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                int i3 = this.d;
                if (i3 == 0) {
                    g13.O(obj);
                    vz2 vz2Var2 = new vz2(mi2Var, ((gq0) this.h).getCoroutineContext());
                    this.d = 1;
                    return ne1Var.invoke(vz2Var2, this) == hq0Var ? hq0Var : w84Var;
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
                    vz2 vz2Var3 = new vz2(mi2Var, ((gq0) this.h).getCoroutineContext());
                    this.d = 1;
                    return ne1Var.invoke(vz2Var3, this) == hq0Var ? hq0Var : w84Var;
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
                    vz2 vz2Var4 = new vz2(mi2Var, ((gq0) this.h).getCoroutineContext());
                    this.d = 1;
                    return ne1Var.invoke(vz2Var4, this) == hq0Var ? hq0Var : w84Var;
                }
                if (i5 == 1) {
                    g13.O(obj);
                    return w84Var;
                }
                u41.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                int i6 = this.d;
                if (i6 == 0) {
                    g13.O(obj);
                    vz2 vz2Var5 = new vz2(mi2Var, ((gq0) this.h).getCoroutineContext());
                    this.d = 1;
                    return ne1Var.invoke(vz2Var5, this) == hq0Var ? hq0Var : w84Var;
                }
                if (i6 == 1) {
                    g13.O(obj);
                    return w84Var;
                }
                u41.r("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
