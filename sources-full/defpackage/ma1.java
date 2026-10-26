package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ma1 extends mq3 implements ne1 {
    public final /* synthetic */ int c;
    public int d;
    public final /* synthetic */ uq1 h;
    public final /* synthetic */ mi2 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ma1(uq1 uq1Var, mi2 mi2Var, so0 so0Var, int i) {
        super(2, so0Var);
        this.c = i;
        this.h = uq1Var;
        this.l = mi2Var;
    }

    @Override // defpackage.wr
    public final so0 create(Object obj, so0 so0Var) {
        switch (this.c) {
            case 0:
                return new ma1(this.h, this.l, so0Var, 0);
            default:
                return new ma1(this.h, this.l, so0Var, 1);
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
        return ((ma1) create(gq0Var, so0Var)).invokeSuspend(w84Var);
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.c;
        mi2 mi2Var = this.l;
        uq1 uq1Var = this.h;
        w84 w84Var = w84.a;
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
                ArrayList arrayList = new ArrayList();
                ah3 ah3Var = ((hh2) uq1Var).a;
                la1 la1Var = new la1(arrayList, mi2Var, 0);
                this.d = 1;
                ah3Var.getClass();
                ah3.p(ah3Var, la1Var, this);
                return hq0Var;
            default:
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
                ArrayList arrayList2 = new ArrayList();
                ah3 ah3Var2 = ((hh2) uq1Var).a;
                la1 la1Var2 = new la1(arrayList2, mi2Var, 1);
                this.d = 1;
                ah3Var2.getClass();
                ah3.p(ah3Var2, la1Var2, this);
                return hq0Var;
        }
    }
}
