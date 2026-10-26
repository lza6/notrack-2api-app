package defpackage;

import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes.dex */
public final class ed2 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ fd2 c;

    public ed2(fd2 fd2Var) {
        this.c = fd2Var;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.c.c();
    }
}
