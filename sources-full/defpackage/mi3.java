package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class mi3 extends ww1 implements ne1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ ii3 d;
    public final /* synthetic */ boolean h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mi3(ii3 ii3Var, boolean z, int i) {
        super(2);
        this.c = i;
        this.d = ii3Var;
        this.h = z;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.c;
        w84 w84Var = w84.a;
        boolean z = this.h;
        ii3 ii3Var = this.d;
        switch (i) {
            case 0:
                long j = ((ln2) obj2).a;
                ni3 ni3Var = ni3.a;
                ni3.a((tz0) obj, j, ii3Var.b(z, true));
                break;
            default:
                long j2 = ((ln2) obj2).a;
                ni3 ni3Var2 = ni3.a;
                ni3.a((tz0) obj, j2, ii3Var.b(z, true));
                break;
        }
        return w84Var;
    }
}
