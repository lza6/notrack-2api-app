package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fu0 implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ gu0 d;

    public /* synthetic */ fu0(gu0 gu0Var, int i) {
        this.c = i;
        this.d = gu0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        gu0 gu0Var = this.d;
        switch (i) {
            case 0:
                gu0.a(gu0Var);
                break;
            default:
                gu0.c(gu0Var);
                break;
        }
    }
}
