package defpackage;

import androidx.compose.foundation.gestures.b;

/* JADX INFO: loaded from: classes.dex */
public final class cc3 extends mq3 implements ne1 {
    public final /* synthetic */ int c;
    public int d;
    public final /* synthetic */ fc3 h;
    public /* synthetic */ long l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cc3(fc3 fc3Var, long j, so0 so0Var, int i) {
        super(2, so0Var);
        this.c = i;
        this.h = fc3Var;
        this.l = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cc3(fc3 fc3Var, so0 so0Var) {
        super(2, so0Var);
        this.c = 3;
        this.h = fc3Var;
    }

    @Override // defpackage.wr
    public final so0 create(Object obj, so0 so0Var) {
        switch (this.c) {
            case 0:
                return new cc3(this.h, this.l, so0Var, 0);
            case 1:
                return new cc3(this.h, this.l, so0Var, 1);
            case 2:
                return new cc3(this.h, this.l, so0Var, 2);
            default:
                cc3 cc3Var = new cc3(this.h, so0Var);
                cc3Var.l = ((ln2) obj).a;
                return cc3Var;
        }
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.c;
        w84 w84Var = w84.a;
        switch (i) {
            case 0:
                return ((cc3) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
            case 1:
                return ((cc3) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
            case 2:
                return ((cc3) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
            default:
                long j = ((ln2) obj).a;
                cc3 cc3Var = new cc3(this.h, (so0) obj2);
                cc3Var.l = j;
                return cc3Var.invokeSuspend(w84Var);
        }
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.c;
        w84 w84Var = w84.a;
        fc3 fc3Var = this.h;
        hq0 hq0Var = hq0.c;
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
                oc3 oc3Var = fc3Var.x;
                long j = this.l;
                this.d = 1;
                return oc3Var.c(j, false, this) == hq0Var ? hq0Var : w84Var;
            case 1:
                int i3 = this.d;
                if (i3 != 0) {
                    if (i3 == 1) {
                        g13.O(obj);
                        return w84Var;
                    }
                    u41.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g13.O(obj);
                oc3 oc3Var2 = fc3Var.x;
                dc3 dc3Var = new dc3(this.l, null);
                this.d = 1;
                return oc3Var2.f(ri2.d, dc3Var, this) == hq0Var ? hq0Var : w84Var;
            case 2:
                int i4 = this.d;
                if (i4 != 0) {
                    if (i4 == 1) {
                        g13.O(obj);
                        return w84Var;
                    }
                    u41.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g13.O(obj);
                oc3 oc3Var3 = fc3Var.x;
                long j2 = this.l;
                this.d = 1;
                return oc3Var3.c(j2, true, this) == hq0Var ? hq0Var : w84Var;
            default:
                int i5 = this.d;
                if (i5 != 0) {
                    if (i5 == 1) {
                        g13.O(obj);
                        return obj;
                    }
                    u41.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g13.O(obj);
                long j3 = this.l;
                oc3 oc3Var4 = fc3Var.x;
                this.d = 1;
                Object objA = b.a(oc3Var4, j3, this);
                return objA == hq0Var ? hq0Var : objA;
        }
    }
}
