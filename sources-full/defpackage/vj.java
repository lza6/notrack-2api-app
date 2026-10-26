package defpackage;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes.dex */
public final class vj implements PopupWindow.OnDismissListener {
    public final /* synthetic */ qj c;
    public final /* synthetic */ wj d;

    public vj(wj wjVar, qj qjVar) {
        this.d = wjVar;
        this.c = qjVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.d.N.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.c);
        }
    }
}
