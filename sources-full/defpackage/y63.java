package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class y63 extends mq3 implements ne1 {
    public final /* synthetic */ int c;
    public int d;
    public final /* synthetic */ a73 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y63(a73 a73Var, so0 so0Var, int i) {
        super(2, so0Var);
        this.c = i;
        this.h = a73Var;
    }

    @Override // defpackage.wr
    public final so0 create(Object obj, so0 so0Var) {
        int i = this.c;
        a73 a73Var = this.h;
        switch (i) {
            case 0:
                return new y63(a73Var, so0Var, 0);
            case 1:
                return new y63(a73Var, so0Var, 1);
            case 2:
                return new y63(a73Var, so0Var, 2);
            default:
                return new y63(a73Var, so0Var, 3);
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
        }
        return ((y63) create(gq0Var, so0Var)).invokeSuspend(w84Var);
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.c;
        w84 w84Var = w84.a;
        a73 a73Var = this.h;
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
                ue ueVar = a73Var.f;
                Float f = new Float(1.0f);
                t64 t64VarO0 = kr1.o0(75, 0, c11.d, 2);
                this.d = 1;
                return ue.c(ueVar, f, t64VarO0, this, 12) == hq0Var ? hq0Var : w84Var;
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
                ue ueVar2 = a73Var.g;
                Float f2 = new Float(1.0f);
                t64 t64VarO1 = kr1.o0(225, 0, c11.a, 2);
                this.d = 1;
                return ue.c(ueVar2, f2, t64VarO1, this, 12) == hq0Var ? hq0Var : w84Var;
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
                ue ueVar3 = a73Var.h;
                Float f3 = new Float(1.0f);
                t64 t64VarO2 = kr1.o0(225, 0, c11.d, 2);
                this.d = 1;
                return ue.c(ueVar3, f3, t64VarO2, this, 12) == hq0Var ? hq0Var : w84Var;
            default:
                int i5 = this.d;
                if (i5 != 0) {
                    if (i5 == 1) {
                        g13.O(obj);
                        return w84Var;
                    }
                    u41.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g13.O(obj);
                ue ueVar4 = a73Var.f;
                Float f4 = new Float(0.0f);
                t64 t64VarO3 = kr1.o0(150, 0, c11.d, 2);
                this.d = 1;
                return ue.c(ueVar4, f4, t64VarO3, this, 12) == hq0Var ? hq0Var : w84Var;
        }
    }
}
