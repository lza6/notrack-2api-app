package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public class r41 extends DialogFragment {
    public Dialog c;
    public DialogInterface.OnCancelListener d;
    public AlertDialog h;

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.d;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.c;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.h == null) {
            Activity activity = getActivity();
            g13.s(activity);
            this.h = new AlertDialog.Builder(activity).create();
        }
        return this.h;
    }
}
