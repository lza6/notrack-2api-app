package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hu implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ qu d;

    public /* synthetic */ hu(qu quVar, int i) {
        this.c = i;
        this.d = quVar;
    }

    public /* synthetic */ hu(qu quVar, int i, CharSequence charSequence) {
        this.c = 1;
        this.d = quVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        qu quVar = this.d;
        switch (i) {
            case 0:
                quVar.c0.v = false;
                break;
            case 1:
                av avVar = quVar.c0;
                if (avVar.c == null) {
                    avVar.c = new xu();
                }
                avVar.c.getClass();
                break;
            default:
                av avVar2 = quVar.c0;
                if (avVar2.c == null) {
                    avVar2.c = new xu();
                }
                avVar2.c.getClass();
                break;
        }
    }
}
