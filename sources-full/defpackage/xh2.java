package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xh2 extends h63 implements ne1 {
    public gf1 d;
    public yh2 h;
    public long[] l;
    public int m;
    public int n;
    public /* synthetic */ Object o;
    public final /* synthetic */ yh2 p;
    public final /* synthetic */ gf1 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xh2(yh2 yh2Var, gf1 gf1Var, so0 so0Var) {
        super(2, so0Var);
        this.p = yh2Var;
        this.q = gf1Var;
    }

    @Override // defpackage.wr
    public final so0 create(Object obj, so0 so0Var) {
        xh2 xh2Var = new xh2(this.p, this.q, so0Var);
        xh2Var.o = obj;
        return xh2Var;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        return ((xh2) create((qf3) obj, (so0) obj2)).invokeSuspend(w84.a);
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) throws Throwable {
        qf3 qf3Var;
        yh2 yh2Var;
        long[] jArr;
        int i;
        gf1 gf1Var;
        int i2 = this.n;
        if (i2 == 0) {
            g13.O(obj);
            qf3Var = (qf3) this.o;
            yh2Var = this.p;
            wh2 wh2Var = yh2Var.d;
            jArr = wh2Var.c;
            i = wh2Var.e;
            gf1Var = this.q;
        } else {
            if (i2 != 1) {
                u41.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.m;
            jArr = this.l;
            yh2Var = this.h;
            gf1Var = this.d;
            qf3Var = (qf3) this.o;
            g13.O(obj);
        }
        if (i == Integer.MAX_VALUE) {
            return w84.a;
        }
        int i3 = (int) ((jArr[i] >> 31) & 2147483647L);
        gf1Var.d = i;
        Object obj2 = yh2Var.d.b[i];
        this.o = qf3Var;
        this.d = gf1Var;
        this.h = yh2Var;
        this.l = jArr;
        this.m = i3;
        this.n = 1;
        qf3Var.b(this, obj2);
        return hq0.c;
    }
}
