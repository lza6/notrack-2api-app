package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t40 implements ne1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ int h;
    public final /* synthetic */ Object l;

    public /* synthetic */ t40(int i, int i2, Object obj, Object obj2) {
        this.c = i2;
        this.l = obj;
        this.d = obj2;
        this.h = i;
    }

    public /* synthetic */ t40(String str, ne1 ne1Var, int i) {
        this.c = 1;
        this.d = str;
        this.l = ne1Var;
        this.h = i;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.c;
        w84 w84Var = w84.a;
        int i2 = this.h;
        Object obj3 = this.d;
        Object obj4 = this.l;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                w40.q((ym1) obj4, (String) obj3, (ck0) obj, i2);
                return w84Var;
            case 1:
                ((Integer) obj2).getClass();
                w40.a((String) obj3, (ne1) obj4, (ck0) obj, i2);
                return w84Var;
            case 2:
                ((Integer) obj2).getClass();
                wa0.U0((je1) obj3, (le1) obj4, (ck0) obj, i2);
                return w84Var;
            case 3:
                return wa0.ChatDrawer$lambda$740((je1) obj4, (mi2) obj3, i2, (ck0) obj, ((Integer) obj2).intValue());
            default:
                ((Integer) obj2).getClass();
                h92.c((je1) obj4, (je1) obj3, (ck0) obj, i2);
                return w84Var;
        }
    }
}
