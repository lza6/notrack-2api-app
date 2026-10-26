package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class da0 extends mq3 implements ne1 {
    public final /* synthetic */ int c;
    public int d;
    public final /* synthetic */ h01 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ da0(h01 h01Var, so0 so0Var, int i) {
        super(2, so0Var);
        this.c = i;
        this.h = h01Var;
    }

    @Override // defpackage.wr
    public final so0 create(Object obj, so0 so0Var) {
        int i = this.c;
        h01 h01Var = this.h;
        switch (i) {
            case 0:
                return new da0(h01Var, so0Var, 0);
            case 1:
                return new da0(h01Var, so0Var, 1);
            case 2:
                return new da0(h01Var, so0Var, 2);
            case 3:
                return new da0(h01Var, so0Var, 3);
            case 4:
                return new da0(h01Var, so0Var, 4);
            case 5:
                return new da0(h01Var, so0Var, 5);
            case 6:
                return new da0(h01Var, so0Var, 6);
            default:
                return new da0(h01Var, so0Var, 7);
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
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
        }
        return ((da0) create(gq0Var, so0Var)).invokeSuspend(w84Var);
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.c;
        w84 w84Var = w84.a;
        h01 h01Var = this.h;
        hq0 hq0Var = hq0.c;
        switch (i) {
            case 0:
                int i2 = this.d;
                if (i2 == 0) {
                    g13.O(obj);
                    this.d = 1;
                    return h01Var.b(this) == hq0Var ? hq0Var : w84Var;
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
                    this.d = 1;
                    return h01Var.b(this) == hq0Var ? hq0Var : w84Var;
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
                    this.d = 1;
                    return h01Var.b(this) == hq0Var ? hq0Var : w84Var;
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
                    this.d = 1;
                    return h01Var.b(this) == hq0Var ? hq0Var : w84Var;
                }
                if (i5 == 1) {
                    g13.O(obj);
                    return w84Var;
                }
                u41.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 4:
                int i6 = this.d;
                if (i6 != 0) {
                    if (i6 == 1) {
                        g13.O(obj);
                        return w84Var;
                    }
                    u41.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g13.O(obj);
                this.d = 1;
                h01Var.getClass();
                Object objA = h01.a(h01Var, i01.d, this);
                if (objA != hq0Var) {
                    objA = w84Var;
                }
                return objA == hq0Var ? hq0Var : w84Var;
            case 5:
                int i7 = this.d;
                if (i7 == 0) {
                    g13.O(obj);
                    this.d = 1;
                    return h01Var.b(this) == hq0Var ? hq0Var : w84Var;
                }
                if (i7 == 1) {
                    g13.O(obj);
                    return w84Var;
                }
                u41.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 6:
                int i8 = this.d;
                if (i8 == 0) {
                    g13.O(obj);
                    this.d = 1;
                    return h01Var.b(this) == hq0Var ? hq0Var : w84Var;
                }
                if (i8 == 1) {
                    g13.O(obj);
                    return w84Var;
                }
                u41.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                int i9 = this.d;
                if (i9 == 0) {
                    g13.O(obj);
                    this.d = 1;
                    return h01Var.b(this) == hq0Var ? hq0Var : w84Var;
                }
                if (i9 == 1) {
                    g13.O(obj);
                    return w84Var;
                }
                u41.r("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
