package defpackage;

import ai.notrack.app.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class an3 extends dd2 implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public boolean B;
    public final Context d;
    public final hc2 h;
    public final ec2 l;
    public final boolean m;
    public final int n;
    public final int o;
    public final jd2 p;
    public PopupWindow.OnDismissListener s;
    public View t;
    public View u;
    public md2 v;
    public ViewTreeObserver w;
    public boolean x;
    public boolean y;
    public int z;
    public final qj q = new qj(3, this);
    public final e20 r = new e20(this, 1);
    public int A = 0;

    public an3(Context context, hc2 hc2Var, View view, int i, boolean z) {
        this.d = context;
        this.h = hc2Var;
        this.m = z;
        this.l = new ec2(hc2Var, LayoutInflater.from(context), z, R.layout.abc_popup_menu_item_layout);
        this.o = i;
        Resources resources = context.getResources();
        this.n = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.t = view;
        this.p = new jd2(context, null, i);
        hc2Var.b(this, context);
    }

    @Override // defpackage.mh3
    public final boolean a() {
        return !this.x && this.p.G.isShowing();
    }

    @Override // defpackage.nd2
    public final void b(hc2 hc2Var, boolean z) {
        if (hc2Var != this.h) {
            return;
        }
        dismiss();
        md2 md2Var = this.v;
        if (md2Var != null) {
            md2Var.b(hc2Var, z);
        }
    }

    @Override // defpackage.nd2
    public final void d(md2 md2Var) {
        this.v = md2Var;
    }

    @Override // defpackage.mh3
    public final void dismiss() {
        if (a()) {
            this.p.dismiss();
        }
    }

    @Override // defpackage.nd2
    public final void f() {
        this.y = false;
        ec2 ec2Var = this.l;
        if (ec2Var != null) {
            ec2Var.notifyDataSetChanged();
        }
    }

    @Override // defpackage.mh3
    public final p01 g() {
        return this.p.h;
    }

    @Override // defpackage.nd2
    public final boolean i(ep3 ep3Var) {
        boolean z;
        if (ep3Var.hasVisibleItems()) {
            fd2 fd2Var = new fd2(this.d, ep3Var, this.u, this.m, this.o, 0);
            md2 md2Var = this.v;
            fd2Var.h = md2Var;
            dd2 dd2Var = fd2Var.i;
            if (dd2Var != null) {
                dd2Var.d(md2Var);
            }
            int size = ep3Var.f.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    z = false;
                    break;
                }
                MenuItem item = ep3Var.getItem(i);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
                i++;
            }
            fd2Var.g = z;
            dd2 dd2Var2 = fd2Var.i;
            if (dd2Var2 != null) {
                dd2Var2.n(z);
            }
            fd2Var.j = this.s;
            this.s = null;
            this.h.c(false);
            jd2 jd2Var = this.p;
            int width = jd2Var.n;
            int iM = jd2Var.m();
            if ((Gravity.getAbsoluteGravity(this.A, this.t.getLayoutDirection()) & 7) == 5) {
                width += this.t.getWidth();
            }
            if (!fd2Var.b()) {
                if (fd2Var.e != null) {
                    fd2Var.d(width, iM, true, true);
                }
            }
            md2 md2Var2 = this.v;
            if (md2Var2 != null) {
                md2Var2.q(ep3Var);
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.nd2
    public final boolean j() {
        return false;
    }

    @Override // defpackage.dd2
    public final void k(hc2 hc2Var) {
    }

    @Override // defpackage.dd2
    public final void m(View view) {
        this.t = view;
    }

    @Override // defpackage.dd2
    public final void n(boolean z) {
        this.l.c = z;
    }

    @Override // defpackage.dd2
    public final void o(int i) {
        this.A = i;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.x = true;
        this.h.c(true);
        ViewTreeObserver viewTreeObserver = this.w;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.w = this.u.getViewTreeObserver();
            }
            this.w.removeGlobalOnLayoutListener(this.q);
            this.w = null;
        }
        this.u.removeOnAttachStateChangeListener(this.r);
        PopupWindow.OnDismissListener onDismissListener = this.s;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // defpackage.dd2
    public final void p(int i) {
        this.p.n = i;
    }

    @Override // defpackage.dd2
    public final void q(PopupWindow.OnDismissListener onDismissListener) {
        this.s = onDismissListener;
    }

    @Override // defpackage.dd2
    public final void r(boolean z) {
        this.B = z;
    }

    @Override // defpackage.dd2
    public final void s(int i) {
        this.p.i(i);
    }

    @Override // defpackage.mh3
    public final void show() {
        View view;
        if (a()) {
            return;
        }
        if (this.x || (view = this.t) == null) {
            u41.r("StandardMenuPopup cannot be used without an anchor");
            return;
        }
        this.u = view;
        jd2 jd2Var = this.p;
        jj jjVar = jd2Var.G;
        jj jjVar2 = jd2Var.G;
        jjVar.setOnDismissListener(this);
        jd2Var.x = this;
        jd2Var.F = true;
        jjVar2.setFocusable(true);
        View view2 = this.u;
        boolean z = this.w == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.w = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.q);
        }
        view2.addOnAttachStateChangeListener(this.r);
        jd2Var.w = view2;
        jd2Var.t = this.A;
        boolean z2 = this.y;
        Context context = this.d;
        ec2 ec2Var = this.l;
        if (!z2) {
            this.z = dd2.l(ec2Var, context, this.n);
            this.y = true;
        }
        jd2Var.q(this.z);
        jjVar2.setInputMethodMode(2);
        Rect rect = this.c;
        jd2Var.E = rect != null ? new Rect(rect) : null;
        jd2Var.show();
        p01 p01Var = jd2Var.h;
        p01Var.setOnKeyListener(this);
        if (this.B) {
            hc2 hc2Var = this.h;
            if (hc2Var.m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) p01Var, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(hc2Var.m);
                }
                frameLayout.setEnabled(false);
                p01Var.addHeaderView(frameLayout, null, false);
            }
        }
        jd2Var.o(ec2Var);
        jd2Var.show();
    }
}
