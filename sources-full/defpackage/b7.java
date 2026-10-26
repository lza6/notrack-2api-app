package defpackage;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: loaded from: classes.dex */
public final class b7 implements AdapterView.OnItemClickListener {
    public final /* synthetic */ f7 c;
    public final /* synthetic */ c7 d;

    public b7(c7 c7Var, f7 f7Var) {
        this.d = c7Var;
        this.c = f7Var;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        c7 c7Var = this.d;
        DialogInterface.OnClickListener onClickListener = c7Var.j;
        f7 f7Var = this.c;
        onClickListener.onClick(f7Var.b, i);
        if (c7Var.l) {
            return;
        }
        f7Var.b.dismiss();
    }
}
