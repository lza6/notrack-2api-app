package defpackage;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class xm3 extends k3 implements fc2 {
    public Context h;
    public ActionBarContextView l;
    public bv0 m;
    public WeakReference n;
    public boolean o;
    public hc2 p;

    @Override // defpackage.k3
    public final void a() {
        if (this.o) {
            return;
        }
        this.o = true;
        this.m.D(this);
    }

    @Override // defpackage.k3
    public final View b() {
        WeakReference weakReference = this.n;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // defpackage.k3
    public final hc2 c() {
        return this.p;
    }

    @Override // defpackage.k3
    public final MenuInflater d() {
        return new wp3(this.l.getContext());
    }

    @Override // defpackage.fc2
    public final boolean e(hc2 hc2Var, MenuItem menuItem) {
        return ((ir3) this.m.d).d0(this, menuItem);
    }

    @Override // defpackage.k3
    public final CharSequence f() {
        return this.l.getSubtitle();
    }

    @Override // defpackage.k3
    public final CharSequence g() {
        return this.l.getTitle();
    }

    @Override // defpackage.k3
    public final void h() {
        this.m.E(this, this.p);
    }

    @Override // defpackage.k3
    public final boolean i() {
        return this.l.A;
    }

    @Override // defpackage.k3
    public final void j(View view) {
        this.l.setCustomView(view);
        this.n = view != null ? new WeakReference(view) : null;
    }

    @Override // defpackage.k3
    public final void k(int i) {
        m(this.h.getString(i));
    }

    @Override // defpackage.fc2
    public final void l(hc2 hc2Var) {
        h();
        g3 g3Var = this.l.l;
        if (g3Var != null) {
            g3Var.l();
        }
    }

    @Override // defpackage.k3
    public final void m(CharSequence charSequence) {
        this.l.setSubtitle(charSequence);
    }

    @Override // defpackage.k3
    public final void n(int i) {
        o(this.h.getString(i));
    }

    @Override // defpackage.k3
    public final void o(CharSequence charSequence) {
        this.l.setTitle(charSequence);
    }

    @Override // defpackage.k3
    public final void p(boolean z) {
        this.d = z;
        this.l.setTitleOptional(z);
    }
}
