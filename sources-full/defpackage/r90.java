package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r90 implements ne1 {
    public final /* synthetic */ boolean c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float h;
    public final /* synthetic */ ah2 l;

    public /* synthetic */ r90(boolean z, float f, float f2, ah2 ah2Var) {
        this.c = z;
        this.d = f;
        this.h = f2;
        this.l = ah2Var;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        dx2 dx2Var = (dx2) obj;
        float fFloatValue = ((Float) obj2).floatValue();
        dx2Var.getClass();
        dx2Var.a();
        if (this.c) {
            fFloatValue = -fFloatValue;
        }
        bt2 bt2Var = (bt2) this.l;
        bt2Var.h(py.w(bt2Var.f() + fFloatValue, -this.d, this.h));
        return w84.a;
    }
}
