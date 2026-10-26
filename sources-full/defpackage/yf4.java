package defpackage;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class yf4 extends k3 implements fc2 {
    public final Context h;
    public final hc2 l;
    public bv0 m;
    public WeakReference n;
    public final /* synthetic */ zf4 o;

    public yf4(zf4 zf4Var, Context context, bv0 bv0Var) {
        this.o = zf4Var;
        this.h = context;
        this.m = bv0Var;
        hc2 hc2Var = new hc2(context);
        hc2Var.l = 1;
        this.l = hc2Var;
        hc2Var.e = this;
    }

    @Override // defpackage.k3
    public final void a() {
        zf4 zf4Var = this.o;
        if (zf4Var.i != this) {
            return;
        }
        if (zf4Var.p) {
            zf4Var.j = this;
            zf4Var.k = this.m;
        } else {
            this.m.D(this);
        }
        this.m = null;
        zf4Var.a(false);
        ActionBarContextView actionBarContextView = zf4Var.f;
        if (actionBarContextView.s == null) {
            actionBarContextView.e();
        }
        zf4Var.c.setHideOnContentScrollEnabled(zf4Var.u);
        zf4Var.i = null;
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
        return this.l;
    }

    @Override // defpackage.k3
    public final MenuInflater d() {
        return new wp3(this.h);
    }

    @Override // defpackage.fc2
    public final boolean e(hc2 hc2Var, MenuItem menuItem) {
        bv0 bv0Var = this.m;
        if (bv0Var != null) {
            return ((ir3) bv0Var.d).d0(this, menuItem);
        }
        return false;
    }

    @Override // defpackage.k3
    public final CharSequence f() {
        return this.o.f.getSubtitle();
    }

    @Override // defpackage.k3
    public final CharSequence g() {
        return this.o.f.getTitle();
    }

    @Override // defpackage.k3
    public final void h() {
        if (this.o.i != this) {
            return;
        }
        hc2 hc2Var = this.l;
        hc2Var.w();
        try {
            this.m.E(this, hc2Var);
        } finally {
            hc2Var.v();
        }
    }

    @Override // defpackage.k3
    public final boolean i() {
        return this.o.f.A;
    }

    @Override // defpackage.k3
    public final void j(View view) {
        this.o.f.setCustomView(view);
        this.n = new WeakReference(view);
    }

    @Override // defpackage.k3
    public final void k(int i) {
        m(this.o.a.getResources().getString(i));
    }

    @Override // defpackage.fc2
    public final void l(hc2 hc2Var) {
        if (this.m == null) {
            return;
        }
        h();
        g3 g3Var = this.o.f.l;
        if (g3Var != null) {
            g3Var.l();
        }
    }

    @Override // defpackage.k3
    public final void m(CharSequence charSequence) {
        this.o.f.setSubtitle(charSequence);
    }

    @Override // defpackage.k3
    public final void n(int i) {
        o(this.o.a.getResources().getString(i));
    }

    @Override // defpackage.k3
    public final void o(CharSequence charSequence) {
        this.o.f.setTitle(charSequence);
    }

    @Override // defpackage.k3
    public final void p(boolean z) {
        this.d = z;
        this.o.f.setTitleOptional(z);
    }
}
