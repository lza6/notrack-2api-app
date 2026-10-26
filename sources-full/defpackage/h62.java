package defpackage;

import android.widget.AbsListView;

/* JADX INFO: loaded from: classes.dex */
public final class h62 implements AbsListView.OnScrollListener {
    public final /* synthetic */ j62 a;

    public h62(j62 j62Var) {
        this.a = j62Var;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        j62 j62Var = this.a;
        f62 f62Var = j62Var.y;
        jj jjVar = j62Var.G;
        if (i != 1 || jjVar.getInputMethodMode() == 2 || jjVar.getContentView() == null) {
            return;
        }
        j62Var.C.removeCallbacks(f62Var);
        f62Var.run();
    }
}
