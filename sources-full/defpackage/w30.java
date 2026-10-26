package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w30 implements ne1 {
    public final /* synthetic */ int c = 1;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int h;
    public final /* synthetic */ Object l;

    public /* synthetic */ w30(int i, le1 le1Var, boolean z) {
        this.d = z;
        this.l = le1Var;
        this.h = i;
    }

    public /* synthetic */ w30(String str, int i, boolean z) {
        this.l = str;
        this.d = z;
        this.h = i;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.c;
        w84 w84Var = w84.a;
        int i2 = this.h;
        Object obj3 = this.l;
        boolean z = this.d;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                z30.a((String) obj3, z, (ck0) obj, i2);
                break;
            default:
                ((Integer) obj2).getClass();
                uv2.c(z, (le1) obj3, (ck0) obj, i2);
                break;
        }
        return w84Var;
    }
}
