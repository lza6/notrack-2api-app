package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class a13 extends ww1 implements le1 {
    public final /* synthetic */ float c;
    public final /* synthetic */ od0 d;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a13(float f, od0 od0Var, int i) {
        super(1);
        this.c = f;
        this.d = od0Var;
        this.h = i;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        Float fValueOf = Float.valueOf(this.c);
        od0 od0Var = this.d;
        ef3.i((gf3) obj, new h03(((Number) py.z(fValueOf, od0Var)).floatValue(), od0Var, this.h));
        return w84.a;
    }
}
