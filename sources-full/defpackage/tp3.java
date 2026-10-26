package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;

/* JADX INFO: loaded from: classes.dex */
public class tp3 extends sv0 {
    public Dialog s0;
    public DialogInterface.OnCancelListener t0;
    public AlertDialog u0;

    @Override // defpackage.sv0
    public final Dialog J() {
        Dialog dialog = this.s0;
        if (dialog != null) {
            return dialog;
        }
        this.j0 = false;
        if (this.u0 == null) {
            Context contextJ = j();
            g13.s(contextJ);
            this.u0 = new AlertDialog.Builder(contextJ).create();
        }
        return this.u0;
    }

    @Override // defpackage.sv0, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.t0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
