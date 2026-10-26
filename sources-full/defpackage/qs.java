package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qs implements pn2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wx3 b;

    public /* synthetic */ qs(wx3 wx3Var, int i) {
        this.a = i;
        this.b = wx3Var;
    }

    @Override // defpackage.pn2
    public final long a() {
        switch (this.a) {
            case 0:
                return this.b.k(true).b;
            case 1:
                return this.b.p(true, true).b;
            default:
                return this.b.p(false, true).b;
        }
    }
}
