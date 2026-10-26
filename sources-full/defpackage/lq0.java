package defpackage;

import androidx.work.CoroutineWorker;

/* JADX INFO: loaded from: classes.dex */
public final class lq0 extends mq3 implements ne1 {
    public final /* synthetic */ int c;
    public int d;
    public final /* synthetic */ CoroutineWorker h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lq0(CoroutineWorker coroutineWorker, so0 so0Var, int i) {
        super(2, so0Var);
        this.c = i;
        this.h = coroutineWorker;
    }

    @Override // defpackage.wr
    public final so0 create(Object obj, so0 so0Var) {
        int i = this.c;
        CoroutineWorker coroutineWorker = this.h;
        switch (i) {
            case 0:
                return new lq0(coroutineWorker, so0Var, 0);
            default:
                return new lq0(coroutineWorker, so0Var, 1);
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
                ((lq0) create(gq0Var, so0Var)).invokeSuspend(w84Var);
                return w84Var;
            default:
                return ((lq0) create(gq0Var, so0Var)).invokeSuspend(w84Var);
        }
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) throws Throwable {
        switch (this.c) {
            case 0:
                int i = this.d;
                if (i == 0) {
                    g13.O(obj);
                    this.d = 1;
                    u41.r("Not implemented");
                } else {
                    if (i == 1) {
                        g13.O(obj);
                        return obj;
                    }
                    u41.r("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            default:
                int i2 = this.d;
                if (i2 != 0) {
                    if (i2 == 1) {
                        g13.O(obj);
                        return obj;
                    }
                    u41.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g13.O(obj);
                this.d = 1;
                Object objC = this.h.c(this);
                hq0 hq0Var = hq0.c;
                return objC == hq0Var ? hq0Var : objC;
        }
    }
}
