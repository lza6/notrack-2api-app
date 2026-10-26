package defpackage;

import android.widget.TextView;
import io.noties.markwon.ext.tables.TableRowSpan$Cell;
import io.noties.markwon.ext.tables.a;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class bs3 implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ TableRowSpan$Cell h;
    public final /* synthetic */ a l;

    public bs3(a aVar, int i, int i2, TableRowSpan$Cell tableRowSpan$Cell) {
        this.l = aVar;
        this.c = i;
        this.d = i2;
        this.h = tableRowSpan$Cell;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a aVar = this.l;
        bv0 bv0Var = aVar.r;
        if (bv0Var != null) {
            ArrayList arrayList = aVar.d;
            int i = this.c;
            arrayList.remove(i);
            aVar.a(i, this.d, this.h);
            TextView textView = (TextView) bv0Var.h;
            im imVar = (im) bv0Var.d;
            textView.removeCallbacks(imVar);
            textView.post(imVar);
        }
    }
}
