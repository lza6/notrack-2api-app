package defpackage;

import androidx.appcompat.widget.Toolbar;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f44 implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ Toolbar d;

    public /* synthetic */ f44(Toolbar toolbar, int i) {
        this.c = i;
        this.d = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        Toolbar toolbar = this.d;
        switch (i) {
            case 0:
                i44 i44Var = toolbar.T;
                mc2 mc2Var = i44Var == null ? null : i44Var.d;
                if (mc2Var != null) {
                    mc2Var.collapseActionView();
                }
                break;
            default:
                toolbar.m();
                break;
        }
    }
}
