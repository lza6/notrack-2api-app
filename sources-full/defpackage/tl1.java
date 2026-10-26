package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class tl1 extends ww1 implements oe1 {
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tl1(float f, float f2) {
        super(3);
        this.c = f;
        this.d = f2;
    }

    @Override // defpackage.oe1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        xb2 xb2Var = (xb2) obj;
        qb2 qb2Var = (qb2) obj2;
        long j = ((um0) obj3).a;
        int i = (int) this.c;
        int i2 = (int) this.d;
        if (!((i2 >= 0) & (i >= 0))) {
            ro1.a("width and height must be >= 0");
        }
        nv2 nv2VarC = qb2Var.c(wm0.h(i, i, i2, i2));
        return xb2Var.s(nv2VarC.c, nv2VarC.d, a31.c, new xc(nv2VarC, 8));
    }
}
