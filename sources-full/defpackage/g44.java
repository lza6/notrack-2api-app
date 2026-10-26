package defpackage;

import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class g44 implements j3, fc2 {
    public final /* synthetic */ Toolbar c;

    public /* synthetic */ g44(Toolbar toolbar) {
        this.c = toolbar;
    }

    @Override // defpackage.fc2
    public boolean e(hc2 hc2Var, MenuItem menuItem) {
        return false;
    }

    @Override // defpackage.fc2
    public void l(hc2 hc2Var) {
        Toolbar toolbar = this.c;
        g3 g3Var = toolbar.c.B;
        if (g3Var == null || !g3Var.k()) {
            Iterator it = ((CopyOnWriteArrayList) toolbar.O.h).iterator();
            while (it.hasNext()) {
                ((gd1) it.next()).a.t();
            }
        }
    }
}
