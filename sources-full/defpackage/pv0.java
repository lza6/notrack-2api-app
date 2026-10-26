package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;

/* JADX INFO: loaded from: classes.dex */
public final class pv0 implements DialogInterface.OnCancelListener {
    public final /* synthetic */ sv0 c;

    public pv0(sv0 sv0Var) {
        this.c = sv0Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        sv0 sv0Var = this.c;
        Dialog dialog = sv0Var.n0;
        if (dialog != null) {
            sv0Var.onCancel(dialog);
        }
    }
}
