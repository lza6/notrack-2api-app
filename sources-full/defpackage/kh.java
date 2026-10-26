package defpackage;

import androidx.compose.material3.a;

/* JADX INFO: loaded from: classes.dex */
public final class kh extends mq3 implements oe1 {
    public final /* synthetic */ int c;
    public int d;
    public /* synthetic */ float h;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kh(Object obj, so0 so0Var, int i) {
        super(3, so0Var);
        this.c = i;
        this.l = obj;
    }

    @Override // defpackage.oe1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.c;
        w84 w84Var = w84.a;
        Object obj4 = this.l;
        float fFloatValue = ((Number) obj2).floatValue();
        so0 so0Var = (so0) obj3;
        switch (i) {
            case 0:
                kh khVar = new kh((v44) obj4, so0Var, 0);
                khVar.h = fFloatValue;
                return khVar.invokeSuspend(w84Var);
            case 1:
                kh khVar2 = new kh((v44) obj4, so0Var, 1);
                khVar2.h = fFloatValue;
                return khVar2.invokeSuspend(w84Var);
            default:
                kh khVar3 = new kh((kw) obj4, so0Var, 2);
                khVar3.h = fFloatValue;
                return khVar3.invokeSuspend(w84Var);
        }
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.c;
        w84 w84Var = w84.a;
        Object obj2 = this.l;
        hq0 hq0Var = hq0.c;
        switch (i) {
            case 0:
                v44 v44Var = (v44) obj2;
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
                float f = this.h;
                w44 w44VarC = v44Var.c();
                zr0 zr0VarD = v44Var.d();
                wf wfVarA = v44Var.a();
                this.d = 1;
                return wh.d(w44VarC, f, zr0VarD, wfVarA, this) == hq0Var ? hq0Var : w84Var;
            case 1:
                v44 v44Var2 = (v44) obj2;
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
                float f2 = this.h;
                w44 w44VarC2 = v44Var2.c();
                zr0 zr0VarD2 = v44Var2.d();
                wf wfVarA2 = v44Var2.a();
                this.d = 1;
                return wh.d(w44VarC2, f2, zr0VarD2, wfVarA2, this) == hq0Var ? hq0Var : w84Var;
            default:
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
                float f3 = this.h;
                ci4 ci4Var = (ci4) ((kw) obj2);
                a aVar = (a) ci4Var.d;
                zr0 zr0Var = (zr0) ci4Var.l;
                wf wfVar = (wf) ci4Var.h;
                this.d = 1;
                return wh.e(aVar, f3, zr0Var, wfVar, this) == hq0Var ? hq0Var : w84Var;
        }
    }
}
