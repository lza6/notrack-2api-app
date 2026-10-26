package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k4 implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ je1 d;

    public /* synthetic */ k4(je1 je1Var, int i) {
        this.c = i;
        this.d = je1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        je1 je1Var = this.d;
        switch (i) {
            case 0:
                je1Var.invoke();
                break;
            case 1:
                je1Var.invoke();
                break;
            case 2:
                je1Var.invoke();
                break;
            default:
                je1Var.invoke();
                break;
        }
    }
}
