package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b70 implements ne1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int h;
    public final /* synthetic */ Object l;
    public final /* synthetic */ se1 m;

    public /* synthetic */ b70(Object obj, boolean z, se1 se1Var, int i, int i2) {
        this.c = i2;
        this.l = obj;
        this.d = z;
        this.m = se1Var;
        this.h = i;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.c;
        w84 w84Var = w84.a;
        int i2 = this.h;
        se1 se1Var = this.m;
        boolean z = this.d;
        Object obj3 = this.l;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                wa0.k0((String) obj3, z, (je1) se1Var, (ck0) obj, i2);
                break;
            default:
                ((Integer) obj2).getClass();
                uv2.e((uw2) obj3, z, (le1) se1Var, (ck0) obj, i2);
                break;
        }
        return w84Var;
    }
}
