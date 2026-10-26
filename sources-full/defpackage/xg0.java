package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xg0 extends n4 implements ne1 {
    public final /* synthetic */ int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xg0(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.p = i3;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.p;
        w84 w84Var = w84.a;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                ((yg0) obj3).a((ck0) obj, ((Number) obj2).intValue());
                break;
            default:
                fc3 fc3Var = (fc3) obj3;
                py.F(fc3Var.u.c(), null, null, new cc3(fc3Var, ((dc4) obj).a, null, 2), 3);
                break;
        }
        return w84Var;
    }
}
