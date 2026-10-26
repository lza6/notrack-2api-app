package defpackage;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;

/* JADX INFO: loaded from: classes.dex */
public final class sj implements yj, DialogInterface.OnClickListener {
    public g7 c;
    public tj d;
    public CharSequence h;
    public final /* synthetic */ zj l;

    public sj(zj zjVar) {
        this.l = zjVar;
    }

    @Override // defpackage.yj
    public final boolean a() {
        g7 g7Var = this.c;
        if (g7Var != null) {
            return g7Var.isShowing();
        }
        return false;
    }

    @Override // defpackage.yj
    public final int b() {
        return 0;
    }

    @Override // defpackage.yj
    public final Drawable c() {
        return null;
    }

    @Override // defpackage.yj
    public final void d(CharSequence charSequence) {
        this.h = charSequence;
    }

    @Override // defpackage.yj
    public final void dismiss() {
        g7 g7Var = this.c;
        if (g7Var != null) {
            g7Var.dismiss();
            this.c = null;
        }
    }

    @Override // defpackage.yj
    public final void e(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.yj
    public final void i(int i) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.yj
    public final void j(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.yj
    public final void k(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.yj
    public final void l(int i, int i2) {
        if (this.d == null) {
            return;
        }
        zj zjVar = this.l;
        kn4 kn4Var = new kn4(zjVar.getPopupContext());
        c7 c7Var = (c7) kn4Var.c;
        CharSequence charSequence = this.h;
        if (charSequence != null) {
            c7Var.d = charSequence;
        }
        tj tjVar = this.d;
        int selectedItemPosition = zjVar.getSelectedItemPosition();
        c7Var.i = tjVar;
        c7Var.j = this;
        c7Var.m = selectedItemPosition;
        c7Var.l = true;
        g7 g7VarF = kn4Var.f();
        this.c = g7VarF;
        AlertController$RecycleListView alertController$RecycleListView = g7VarF.n.e;
        alertController$RecycleListView.setTextDirection(i);
        alertController$RecycleListView.setTextAlignment(i2);
        this.c.show();
    }

    @Override // defpackage.yj
    public final int m() {
        return 0;
    }

    @Override // defpackage.yj
    public final CharSequence n() {
        return this.h;
    }

    @Override // defpackage.yj
    public final void o(ListAdapter listAdapter) {
        this.d = (tj) listAdapter;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        zj zjVar = this.l;
        zjVar.setSelection(i);
        if (zjVar.getOnItemClickListener() != null) {
            zjVar.performItemClick(null, i, this.d.getItemId(i));
        }
        dismiss();
    }
}
