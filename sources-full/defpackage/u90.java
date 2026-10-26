package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class u90 extends mq3 implements ne1 {
    public final /* synthetic */ int c;
    public int d;
    public float h;
    public /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u90(float f, lh1 lh1Var, ah2 ah2Var, so0 so0Var) {
        super(2, so0Var);
        this.c = 0;
        this.h = f;
        this.l = lh1Var;
        this.m = ah2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u90(Object obj, float f, Object obj2, so0 so0Var, int i) {
        super(2, so0Var);
        this.c = i;
        this.l = obj;
        this.h = f;
        this.m = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u90(o54 o54Var, so0 so0Var) {
        super(2, so0Var);
        this.c = 3;
        this.m = o54Var;
    }

    @Override // defpackage.wr
    public final so0 create(Object obj, so0 so0Var) {
        int i = this.c;
        Object obj2 = this.m;
        switch (i) {
            case 0:
                return new u90(this.h, (lh1) this.l, (ah2) obj2, so0Var);
            case 1:
                return new u90((sd) this.l, this.h, (wf) obj2, so0Var, 1);
            case 2:
                return new u90((du3) this.l, this.h, (h43) obj2, so0Var, 2);
            default:
                u90 u90Var = new u90((o54) obj2, so0Var);
                u90Var.l = obj;
                return u90Var;
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
        return ((u90) create(gq0Var, so0Var)).invokeSuspend(w84Var);
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) throws Throwable {
        float fL;
        gq0 gq0Var;
        int i = this.c;
        w84 w84Var = w84.a;
        Object obj2 = this.m;
        hq0 hq0Var = hq0.c;
        switch (i) {
            case 0:
                float f = this.h;
                ah2 ah2Var = (ah2) obj2;
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
                if (f != 0.0f) {
                    ((lh1) this.l).mo63x70bb4fce(0);
                }
                float f2 = ((bt2) ah2Var).f();
                s90 s90Var = new s90(ah2Var, 1);
                this.d = 1;
                return vl0.m(f2, f, 0.0f, kr1.l0(7, null), s90Var, this) == hq0Var ? hq0Var : w84Var;
            case 1:
                int i3 = this.d;
                if (i3 == 0) {
                    g13.O(obj);
                    this.d = 1;
                    return ue.c((ue) ((sd) this.l).c, new Float(this.h), (wf) obj2, this, 12) == hq0Var ? hq0Var : w84Var;
                }
                if (i3 == 1) {
                    g13.O(obj);
                    return w84Var;
                }
                u41.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 2:
                du3 du3Var = (du3) this.l;
                int i4 = this.d;
                if (i4 == 0) {
                    g13.O(obj);
                    rb3 rb3Var = du3Var.r;
                    float fCeil = this.h;
                    if (!Float.isNaN(fCeil) && !Float.isInfinite(fCeil)) {
                        fCeil = (float) (fCeil > 0.0f ? Math.ceil(fCeil) : Math.floor(fCeil));
                    }
                    this.d = 1;
                    if (jr1.I(rb3Var, fCeil, this) != hq0Var) {
                    }
                    return hq0Var;
                }
                if (i4 != 1) {
                    if (i4 == 2) {
                        g13.O(obj);
                        return w84Var;
                    }
                    u41.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g13.O(obj);
                this.d = 2;
                if (du3Var.m.h.a((h43) obj2, this) != hq0Var) {
                    return w84Var;
                }
                return hq0Var;
            default:
                int i5 = this.d;
                if (i5 == 0) {
                    g13.O(obj);
                    gq0 gq0Var2 = (gq0) this.l;
                    fL = vl0.L(gq0Var2.getCoroutineContext());
                    gq0Var = gq0Var2;
                } else {
                    if (i5 != 1) {
                        u41.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fL = this.h;
                    gq0Var = (gq0) this.l;
                    g13.O(obj);
                }
                while (yo4.F(gq0Var)) {
                    kc0 kc0Var = new kc0((o54) obj2, fL);
                    this.l = gq0Var;
                    this.h = fL;
                    this.d = 1;
                    if (yo4.z(getContext()).withFrameNanos(kc0Var, this) == hq0Var) {
                        return hq0Var;
                    }
                }
                return w84Var;
        }
    }
}
