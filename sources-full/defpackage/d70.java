package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d70 implements ne1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int h;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    public /* synthetic */ d70(Object obj, Object obj2, int i, int i2, int i3) {
        this.c = i3;
        this.l = obj;
        this.m = obj2;
        this.d = i;
        this.h = i2;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.c;
        w84 w84Var = w84.a;
        int i2 = this.h;
        int i3 = this.d;
        Object obj3 = this.m;
        Object obj4 = this.l;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                wa0.EmptyState((le1) obj4, (ne1) obj3, (ck0) obj, sf3.V(i3 | 1), i2);
                break;
            case 1:
                ((Integer) obj2).getClass();
                wa0.ChatScreen((hb0) obj4, (vw2) obj3, (ck0) obj, sf3.V(i3 | 1), i2);
                break;
            default:
                ((Integer) obj2).getClass();
                f04.NotrackAiTheme((g04) obj4, (ne1) obj3, (ck0) obj, sf3.V(i3 | 1), i2);
                break;
        }
        return w84Var;
    }
}
