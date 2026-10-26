package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class f62 implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ j62 d;

    public /* synthetic */ f62(j62 j62Var, int i) {
        this.c = i;
        this.d = j62Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        j62 j62Var = this.d;
        switch (i) {
            case 0:
                p01 p01Var = j62Var.h;
                if (p01Var != null) {
                    p01Var.setListSelectionHidden(true);
                    p01Var.requestLayout();
                }
                break;
            default:
                p01 p01Var2 = j62Var.h;
                if (p01Var2 != null && p01Var2.isAttachedToWindow() && j62Var.h.getCount() > j62Var.h.getChildCount() && j62Var.h.getChildCount() <= j62Var.u) {
                    j62Var.G.setInputMethodMode(2);
                    j62Var.show();
                    break;
                }
                break;
        }
    }
}
