package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d10 implements le1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object h;

    public /* synthetic */ d10(int i, Object obj, boolean z) {
        this.c = i;
        this.d = z;
        this.h = obj;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        int i = this.c;
        Object obj2 = this.h;
        boolean z = this.d;
        switch (i) {
            case 0:
                le1 le1Var = (le1) obj2;
                String str = (String) obj;
                str.getClass();
                if (!z) {
                    le1Var.invoke(str);
                }
                return w84.a;
            default:
                String str2 = (String) obj;
                str2.getClass();
                return Boolean.valueOf(w40.w(z, (qt) obj2, "pt", str2));
        }
    }
}
