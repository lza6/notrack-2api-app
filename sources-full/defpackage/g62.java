package defpackage;

import android.database.DataSetObserver;

/* JADX INFO: loaded from: classes.dex */
public final class g62 extends DataSetObserver {
    public final /* synthetic */ j62 a;

    public g62(j62 j62Var) {
        this.a = j62Var;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        j62 j62Var = this.a;
        if (j62Var.G.isShowing()) {
            j62Var.show();
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.a.dismiss();
    }
}
