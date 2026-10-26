package com.credited;

import android.app.AlertDialog;
import android.view.View;

/* JADX INFO: renamed from: com.credited.null, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
class Cnull implements View.OnClickListener {
    private static AlertDialog dialog;

    public static void setDialog(AlertDialog alertDialog) {
        dialog = alertDialog;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        AlertDialog alertDialog = dialog;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }
}
