package defpackage;

import android.graphics.Rect;
import android.view.Choreographer;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.ui.platform.AndroidComposeView;
import app.template.extension.BuildConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ny3 implements iw2 {
    public final View a;
    public final ci4 b;
    public final oy3 c;
    public boolean d;
    public le1 e;
    public le1 f;
    public ey3 g;
    public in1 h;
    public final ArrayList i;
    public final ly1 j;
    public Rect k;
    public final ar0 l;
    public final oi2 m;
    public m3 n;

    public ny3(View view, AndroidComposeView androidComposeView) {
        ci4 ci4Var = new ci4(view);
        oy3 oy3Var = new oy3(Choreographer.getInstance());
        this.a = view;
        this.b = ci4Var;
        this.c = oy3Var;
        this.e = pv3.q;
        this.f = pv3.r;
        this.g = new ey3(BuildConfig.VERSION_NAME, jz3.b, 4);
        this.h = in1.g;
        this.i = new ArrayList();
        this.j = yo4.H(q22.d, new i43(13, this));
        this.l = new ar0(androidComposeView, ci4Var);
        this.m = new oi2(0, new my3[16]);
    }

    @Override // defpackage.iw2
    public final void a(ey3 ey3Var, in1 in1Var, ie ieVar, ip0 ip0Var) {
        this.d = true;
        this.g = ey3Var;
        this.h = in1Var;
        this.e = ieVar;
        this.f = ip0Var;
        i(my3.c);
    }

    @Override // defpackage.iw2
    public final void b() {
        i(my3.c);
    }

    @Override // defpackage.iw2
    public final void c(ey3 ey3Var, ey3 ey3Var2) {
        boolean z = (jz3.b(this.g.b, ey3Var2.b) && kr1.n(this.g.c, ey3Var2.c)) ? false : true;
        this.g = ey3Var2;
        int size = this.i.size();
        for (int i = 0; i < size; i++) {
            e43 e43Var = (e43) ((WeakReference) this.i.get(i)).get();
            if (e43Var != null) {
                e43Var.d = ey3Var2;
            }
        }
        ar0 ar0Var = this.l;
        synchronized (ar0Var.c) {
            ar0Var.j = null;
            ar0Var.l = null;
            ar0Var.k = null;
            ar0Var.m = sx.s;
            ar0Var.n = null;
            ar0Var.o = null;
        }
        if (kr1.n(ey3Var, ey3Var2)) {
            if (z) {
                ci4 ci4Var = this.b;
                int iF = jz3.f(ey3Var2.b);
                int iE = jz3.e(ey3Var2.b);
                jz3 jz3Var = this.g.c;
                int iF2 = jz3Var != null ? jz3.f(jz3Var.a) : -1;
                jz3 jz3Var2 = this.g.c;
                ((InputMethodManager) ((ly1) ci4Var.h).getValue()).updateSelection((View) ci4Var.d, iF, iE, iF2, jz3Var2 != null ? jz3.e(jz3Var2.a) : -1);
                return;
            }
            return;
        }
        if (ey3Var != null && (!kr1.n(ey3Var.a.d, ey3Var2.a.d) || (jz3.b(ey3Var.b, ey3Var2.b) && !kr1.n(ey3Var.c, ey3Var2.c)))) {
            ci4 ci4Var2 = this.b;
            ((InputMethodManager) ((ly1) ci4Var2.h).getValue()).restartInput((View) ci4Var2.d);
            return;
        }
        int size2 = this.i.size();
        for (int i2 = 0; i2 < size2; i2++) {
            e43 e43Var2 = (e43) ((WeakReference) this.i.get(i2)).get();
            if (e43Var2 != null) {
                ey3 ey3Var3 = this.g;
                ci4 ci4Var3 = this.b;
                if (e43Var2.h) {
                    e43Var2.d = ey3Var3;
                    if (e43Var2.f) {
                        ((InputMethodManager) ((ly1) ci4Var3.h).getValue()).updateExtractedText((View) ci4Var3.d, e43Var2.e, gb2.Z(ey3Var3));
                    }
                    jz3 jz3Var3 = ey3Var3.c;
                    long j = ey3Var3.b;
                    int iF3 = jz3Var3 != null ? jz3.f(jz3Var3.a) : -1;
                    jz3 jz3Var4 = ey3Var3.c;
                    ((InputMethodManager) ((ly1) ci4Var3.h).getValue()).updateSelection((View) ci4Var3.d, jz3.f(j), jz3.e(j), iF3, jz3Var4 != null ? jz3.e(jz3Var4.a) : -1);
                }
            }
        }
    }

    @Override // defpackage.iw2
    public final void d() {
        i(my3.h);
    }

    @Override // defpackage.iw2
    public final void e(ey3 ey3Var, nn2 nn2Var, xy3 xy3Var, pj2 pj2Var, h43 h43Var, h43 h43Var2) {
        ar0 ar0Var = this.l;
        synchronized (ar0Var.c) {
            try {
                ar0Var.j = ey3Var;
                ar0Var.l = nn2Var;
                ar0Var.k = xy3Var;
                ar0Var.m = pj2Var;
                ar0Var.n = h43Var;
                ar0Var.o = h43Var2;
                if (ar0Var.e || ar0Var.d) {
                    ar0Var.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.iw2
    public final void f() {
        i(my3.l);
    }

    @Override // defpackage.iw2
    public final void g() {
        this.d = false;
        this.e = pv3.s;
        this.f = pv3.t;
        this.k = null;
        i(my3.d);
    }

    @Override // defpackage.iw2
    public final void h(h43 h43Var) {
        Rect rect;
        this.k = new Rect(gb2.R(h43Var.a), gb2.R(h43Var.b), gb2.R(h43Var.c), gb2.R(h43Var.d));
        if (!this.i.isEmpty() || (rect = this.k) == null) {
            return;
        }
        this.a.requestRectangleOnScreen(new Rect(rect));
    }

    public final void i(my3 my3Var) {
        this.m.c(my3Var);
        if (this.n == null) {
            m3 m3Var = new m3(13, this);
            this.c.execute(m3Var);
            this.n = m3Var;
        }
    }
}
