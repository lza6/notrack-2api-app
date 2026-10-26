package defpackage;

import android.os.Build;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class qp1 extends be0 implements Runnable, wn2, View.OnAttachStateChangeListener {
    public final ch4 h;
    public boolean l;
    public boolean m;
    public wg4 n;

    public qp1(ch4 ch4Var) {
        super(!ch4Var.u ? 1 : 0);
        this.h = ch4Var;
    }

    @Override // defpackage.wn2
    public final wg4 f(View view, wg4 wg4Var) {
        this.n = wg4Var;
        ch4 ch4Var = this.h;
        cb4 cb4Var = ch4Var.s;
        tg4 tg4Var = wg4Var.a;
        cb4Var.f(nh4.a(tg4Var.g(8)));
        if (this.l) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.m) {
            ch4Var.t.f(nh4.a(tg4Var.g(8)));
            ch4.a(ch4Var, wg4Var);
        }
        return ch4Var.u ? wg4.b : wg4Var;
    }

    @Override // defpackage.be0
    public final void k(ig4 ig4Var) {
        this.l = false;
        this.m = false;
        wg4 wg4Var = this.n;
        if (ig4Var.a.a() != 0 && wg4Var != null) {
            tg4 tg4Var = wg4Var.a;
            ch4 ch4Var = this.h;
            ch4Var.t.f(nh4.a(tg4Var.g(8)));
            ch4Var.s.f(nh4.a(tg4Var.g(8)));
            ch4.a(ch4Var, wg4Var);
        }
        this.n = null;
    }

    @Override // defpackage.be0
    public final void l() {
        this.l = true;
        this.m = true;
    }

    @Override // defpackage.be0
    public final wg4 m(wg4 wg4Var) {
        ch4 ch4Var = this.h;
        ch4.a(ch4Var, wg4Var);
        return ch4Var.u ? wg4.b : wg4Var;
    }

    @Override // defpackage.be0
    public final mi4 n(mi4 mi4Var) {
        this.l = false;
        return mi4Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.requestApplyInsets();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.l) {
            this.l = false;
            this.m = false;
            wg4 wg4Var = this.n;
            if (wg4Var != null) {
                ch4 ch4Var = this.h;
                ch4Var.t.f(nh4.a(wg4Var.a.g(8)));
                ch4.a(ch4Var, wg4Var);
                this.n = null;
            }
        }
    }
}
