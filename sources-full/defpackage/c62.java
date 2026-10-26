package defpackage;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: loaded from: classes.dex */
public final class c62 implements AdapterView.OnItemSelectedListener {
    public final /* synthetic */ j62 c;

    public c62(j62 j62Var) {
        this.c = j62Var;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        p01 p01Var;
        if (i == -1 || (p01Var = this.c.h) == null) {
            return;
        }
        p01Var.setListSelectionHidden(false);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
