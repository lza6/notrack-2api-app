package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class mp0 extends ww1 implements ne1 {
    public final /* synthetic */ xw3 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mp0(xw3 xw3Var, boolean z, int i) {
        super(2);
        this.c = xw3Var;
        this.d = z;
        this.h = i;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iV = sf3.V(this.h | 1);
        qp0.SelectionToolbarAndHandles(this.c, this.d, (ck0) obj, iV);
        return w84.a;
    }
}
