package defpackage;

import androidx.compose.material3.b;

/* JADX INFO: loaded from: classes.dex */
public final class q04 extends mq3 implements ne1 {
    public final /* synthetic */ int c;
    public int d;
    public final /* synthetic */ r04 h;
    public final /* synthetic */ float l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q04(r04 r04Var, float f, so0 so0Var, int i) {
        super(2, so0Var);
        this.c = i;
        this.h = r04Var;
        this.l = f;
    }

    @Override // defpackage.wr
    public final so0 create(Object obj, so0 so0Var) {
        int i = this.c;
        float f = this.l;
        r04 r04Var = this.h;
        switch (i) {
            case 0:
                return new q04(r04Var, f, so0Var, 0);
            default:
                return new q04(r04Var, f, so0Var, 1);
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
        return ((q04) create(gq0Var, so0Var)).invokeSuspend(w84Var);
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.c;
        w84 w84Var = w84.a;
        float f = this.l;
        hq0 hq0Var = hq0.c;
        r04 r04Var = this.h;
        switch (i) {
            case 0:
                int i2 = this.d;
                if (i2 == 0) {
                    g13.O(obj);
                    ue ueVar = r04Var.m;
                    if (ueVar == null) {
                        return w84Var;
                    }
                    Float f2 = new Float(f);
                    wf wfVar = r04Var.h ? b.b : b.c;
                    this.d = 1;
                    obj = ue.c(ueVar, f2, wfVar, this, 12);
                    if (obj == hq0Var) {
                        return hq0Var;
                    }
                } else {
                    if (i2 != 1) {
                        u41.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    g13.O(obj);
                }
                return w84Var;
            default:
                int i3 = this.d;
                if (i3 == 0) {
                    g13.O(obj);
                    ue ueVar2 = r04Var.l;
                    if (ueVar2 == null) {
                        return w84Var;
                    }
                    Float f3 = new Float(f);
                    wf wfVar2 = r04Var.h ? b.b : b.c;
                    this.d = 1;
                    obj = ue.c(ueVar2, f3, wfVar2, this, 12);
                    if (obj == hq0Var) {
                        return hq0Var;
                    }
                } else {
                    if (i3 != 1) {
                        u41.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    g13.O(obj);
                }
                return w84Var;
        }
    }
}
