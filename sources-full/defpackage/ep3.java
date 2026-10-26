package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class ep3 extends hc2 implements SubMenu {
    public final mc2 A;
    public final hc2 z;

    public ep3(Context context, hc2 hc2Var, mc2 mc2Var) {
        super(context);
        this.z = hc2Var;
        this.A = mc2Var;
    }

    @Override // defpackage.hc2
    public final boolean d(mc2 mc2Var) {
        return this.z.d(mc2Var);
    }

    @Override // defpackage.hc2
    public final boolean e(hc2 hc2Var, MenuItem menuItem) {
        return super.e(hc2Var, menuItem) || this.z.e(hc2Var, menuItem);
    }

    @Override // defpackage.hc2
    public final boolean f(mc2 mc2Var) {
        return this.z.f(mc2Var);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.A;
    }

    @Override // defpackage.hc2
    public final String j() {
        mc2 mc2Var = this.A;
        int i = mc2Var != null ? mc2Var.a : 0;
        if (i == 0) {
            return null;
        }
        return ud2.m(i, "android:menu:actionviewstates:");
    }

    @Override // defpackage.hc2
    public final hc2 k() {
        return this.z.k();
    }

    @Override // defpackage.hc2
    public final boolean m() {
        return this.z.m();
    }

    @Override // defpackage.hc2
    public final boolean n() {
        return this.z.n();
    }

    @Override // defpackage.hc2
    public final boolean o() {
        return this.z.o();
    }

    @Override // defpackage.hc2, android.view.Menu
    public final void setGroupDividerEnabled(boolean z) {
        this.z.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        u(0, null, i, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        u(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        u(i, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        u(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        u(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.A.setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.A.setIcon(drawable);
        return this;
    }

    @Override // defpackage.hc2, android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.z.setQwertyMode(z);
    }
}
