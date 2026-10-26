package com.credited;

import android.content.Context;
import android.view.View;
import android.widget.CheckBox;

/* JADX INFO: loaded from: classes.dex */
public class url implements View.OnClickListener {
    private CheckBox cb;
    private Context ctx;

    static {
        System.loadLibrary("null");
    }

    public url(Context context) {
        this.cb = null;
        this.ctx = null;
    }

    public url(CheckBox checkBox, Context context) {
        this.cb = checkBox;
        this.ctx = context;
    }

    private static native void openTg(url urlVar);

    private static void savePref(url urlVar) {
        urlVar.ctx.getSharedPreferences("prefs", 0).edit().putBoolean("dont_show", true).apply();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        CheckBox checkBox = this.cb;
        if (checkBox != null && checkBox.isChecked()) {
            savePref(this);
        }
        openTg(this);
    }
}
