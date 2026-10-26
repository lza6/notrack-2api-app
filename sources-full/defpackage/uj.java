package defpackage;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: loaded from: classes.dex */
public final class uj implements AdapterView.OnItemClickListener {
    public final /* synthetic */ wj c;

    public uj(wj wjVar) {
        this.c = wjVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        wj wjVar = this.c;
        zj zjVar = wjVar.N;
        zjVar.setSelection(i);
        if (zjVar.getOnItemClickListener() != null) {
            zjVar.performItemClick(view, i, wjVar.K.getItemId(i));
        }
        wjVar.dismiss();
    }
}
