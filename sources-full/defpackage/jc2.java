package defpackage;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public final class jc2 implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, md2 {
    public ep3 c;
    public g7 d;
    public b62 h;

    @Override // defpackage.md2
    public final void b(hc2 hc2Var, boolean z) {
        g7 g7Var;
        if ((z || hc2Var == this.c) && (g7Var = this.d) != null) {
            g7Var.dismiss();
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        ep3 ep3Var = this.c;
        b62 b62Var = this.h;
        if (b62Var.n == null) {
            b62Var.n = new a62(b62Var);
        }
        ep3Var.q(b62Var.n.getItem(i), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.h.b(this.c, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        ep3 ep3Var = this.c;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.d.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.d.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                ep3Var.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return ep3Var.performShortcut(i, keyEvent, 0);
    }

    @Override // defpackage.md2
    public final boolean q(hc2 hc2Var) {
        return false;
    }
}
