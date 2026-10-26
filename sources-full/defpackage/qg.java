package defpackage;

import android.window.OnBackInvokedCallback;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qg implements OnBackInvokedCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ je1 b;

    public /* synthetic */ qg(je1 je1Var, int i) {
        this.a = i;
        this.b = je1Var;
    }

    public final void onBackInvoked() {
        int i = this.a;
        je1 je1Var = this.b;
        switch (i) {
            case 0:
                if (je1Var != null) {
                    je1Var.invoke();
                }
                break;
            case 1:
                je1Var.invoke();
                break;
            default:
                je1Var.invoke();
                break;
        }
    }
}
