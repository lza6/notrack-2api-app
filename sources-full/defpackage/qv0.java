package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;

/* JADX INFO: loaded from: classes.dex */
public final class qv0 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ sv0 c;

    public qv0(sv0 sv0Var) {
        this.c = sv0Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        sv0 sv0Var = this.c;
        Dialog dialog = sv0Var.n0;
        if (dialog != null) {
            sv0Var.onDismiss(dialog);
        }
    }
}
