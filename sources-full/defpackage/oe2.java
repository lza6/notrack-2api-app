package defpackage;

import android.window.BackEvent;

/* JADX INFO: loaded from: classes.dex */
public final class oe2 extends mq3 implements ne1 {
    public final /* synthetic */ int c;
    public int d;
    public final /* synthetic */ ue h;
    public final /* synthetic */ BackEvent l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oe2(ue ueVar, BackEvent backEvent, so0 so0Var, int i) {
        super(2, so0Var);
        this.c = i;
        this.h = ueVar;
        this.l = backEvent;
    }

    @Override // defpackage.wr
    public final so0 create(Object obj, so0 so0Var) {
        switch (this.c) {
            case 0:
                return new oe2(this.h, this.l, so0Var, 0);
            default:
                return new oe2(this.h, this.l, so0Var, 1);
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
        return ((oe2) create(gq0Var, so0Var)).invokeSuspend(w84Var);
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.c;
        w84 w84Var = w84.a;
        ue ueVar = this.h;
        hq0 hq0Var = hq0.c;
        switch (i) {
            case 0:
                int i2 = this.d;
                if (i2 == 0) {
                    g13.O(obj);
                    Float f = new Float(dy2.a.b(this.l.getProgress()));
                    this.d = 1;
                    return ueVar.e(this, f) == hq0Var ? hq0Var : w84Var;
                }
                if (i2 == 1) {
                    g13.O(obj);
                    return w84Var;
                }
                u41.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                int i3 = this.d;
                if (i3 == 0) {
                    g13.O(obj);
                    Float f2 = new Float(dy2.a.b(this.l.getProgress()));
                    this.d = 1;
                    return ueVar.e(this, f2) == hq0Var ? hq0Var : w84Var;
                }
                if (i3 == 1) {
                    g13.O(obj);
                    return w84Var;
                }
                u41.r("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
