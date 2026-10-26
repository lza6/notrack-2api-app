package defpackage;

import android.view.MenuItem;

/* JADX INFO: loaded from: classes.dex */
public final class pc2 implements MenuItem.OnActionExpandListener {
    public final MenuItem.OnActionExpandListener a;
    public final /* synthetic */ qc2 b;

    public pc2(qc2 qc2Var, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.b = qc2Var;
        this.a = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.a.onMenuItemActionCollapse(this.b.h(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.a.onMenuItemActionExpand(this.b.h(menuItem));
    }
}
