package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yj0 extends mq3 implements ne1 {
    public boolean c;
    public int d;
    public /* synthetic */ float h;
    public final /* synthetic */ zj0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yj0(zj0 zj0Var, so0 so0Var) {
        super(2, so0Var);
        this.l = zj0Var;
    }

    @Override // defpackage.wr
    public final so0 create(Object obj, so0 so0Var) {
        yj0 yj0Var = new yj0(this.l, so0Var);
        yj0Var.h = ((Number) obj).floatValue();
        return yj0Var;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        return ((yj0) create(Float.valueOf(((Number) obj).floatValue()), (so0) obj2)).invokeSuspend(w84.a);
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean z;
        int i = this.d;
        if (i == 0) {
            g13.O(obj);
            float f = this.h;
            zj0 zj0Var = this.l;
            Object objG = zj0Var.a.d.c.g(te3.e);
            ne1 ne1Var = (ne1) (objG != null ? objG : null);
            if (ne1Var == null) {
                throw fq2.i("Required value was null.");
            }
            boolean z2 = ((fb3) zj0Var.a.d.d(cf3.t)).c;
            if (z2) {
                f = -f;
            }
            ln2 ln2Var = new ln2((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L));
            this.c = z2;
            this.d = 1;
            obj = ne1Var.invoke(ln2Var, this);
            hq0 hq0Var = hq0.c;
            if (obj == hq0Var) {
                return hq0Var;
            }
            z = z2;
        } else {
            if (i != 1) {
                u41.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = this.c;
            g13.O(obj);
        }
        long j = ((ln2) obj).a;
        return new Float(z ? -Float.intBitsToFloat((int) (j & 4294967295L)) : Float.intBitsToFloat((int) (j & 4294967295L)));
    }
}
