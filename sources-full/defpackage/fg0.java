package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fg0 implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ qg0 d;

    public /* synthetic */ fg0(qg0 qg0Var, int i) {
        this.c = i;
        this.d = qg0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        qg0 qg0Var = this.d;
        switch (i) {
            case 0:
                qg0Var.invalidateOptionsMenu();
                return;
            default:
                try {
                    super/*android.app.Activity*/.onBackPressed();
                    return;
                } catch (IllegalStateException e) {
                    if (!kr1.n(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        throw e;
                    }
                    return;
                } catch (NullPointerException e2) {
                    if (!kr1.n(e2.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                        throw e2;
                    }
                    return;
                }
        }
    }
}
