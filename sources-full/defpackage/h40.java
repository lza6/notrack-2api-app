package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h40 implements le1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ le1 d;
    public final /* synthetic */ tt h;

    public /* synthetic */ h40(le1 le1Var, tt ttVar, int i) {
        this.c = i;
        this.d = le1Var;
        this.h = ttVar;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        int i = this.c;
        w84 w84Var = w84.a;
        le1 le1Var = this.d;
        switch (i) {
            case 0:
                le1Var.invoke(tt.b(this.h, null, null, ((Integer) obj).intValue(), null, null, 0, 59));
                break;
            case 1:
                String str = (String) obj;
                str.getClass();
                le1Var.invoke(tt.b(this.h, null, null, 0, null, str, 0, 47));
                break;
            default:
                le1Var.invoke(tt.b(this.h, null, null, 0, null, null, ((Integer) obj).intValue(), 31));
                break;
        }
        return w84Var;
    }
}
