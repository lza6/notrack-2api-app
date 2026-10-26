package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class rb implements iw2 {
    public t22 a;
    public ym3 b;
    public a32 c;
    public ah3 d;

    @Override // defpackage.iw2
    public final void a(ey3 ey3Var, in1 in1Var, ie ieVar, ip0 ip0Var) {
        j(new h4(ey3Var, this, in1Var, ieVar, ip0Var, 1));
    }

    @Override // defpackage.iw2
    public final void b() {
        j(null);
    }

    @Override // defpackage.iw2
    public final void c(ey3 ey3Var, ey3 ey3Var2) {
        a32 a32Var = this.c;
        if (a32Var != null) {
            boolean z = (jz3.b(a32Var.h.b, ey3Var2.b) && kr1.n(a32Var.h.c, ey3Var2.c)) ? false : true;
            a32Var.h = ey3Var2;
            int size = a32Var.j.size();
            for (int i = 0; i < size; i++) {
                f43 f43Var = (f43) ((WeakReference) a32Var.j.get(i)).get();
                if (f43Var != null) {
                    f43Var.g = ey3Var2;
                }
            }
            u22 u22Var = a32Var.m;
            synchronized (u22Var.c) {
                u22Var.j = null;
                u22Var.l = null;
                u22Var.k = null;
                u22Var.m = null;
                u22Var.n = null;
            }
            if (kr1.n(ey3Var, ey3Var2)) {
                if (z) {
                    fp1 fp1Var = a32Var.b;
                    int iF = jz3.f(ey3Var2.b);
                    int iE = jz3.e(ey3Var2.b);
                    jz3 jz3Var = a32Var.h.c;
                    int iF2 = jz3Var != null ? jz3.f(jz3Var.a) : -1;
                    jz3 jz3Var2 = a32Var.h.c;
                    fp1Var.f().updateSelection((View) fp1Var.c, iF, iE, iF2, jz3Var2 != null ? jz3.e(jz3Var2.a) : -1);
                    return;
                }
                return;
            }
            if (ey3Var != null && (!kr1.n(ey3Var.a.d, ey3Var2.a.d) || (jz3.b(ey3Var.b, ey3Var2.b) && !kr1.n(ey3Var.c, ey3Var2.c)))) {
                fp1 fp1Var2 = a32Var.b;
                fp1Var2.f().restartInput((View) fp1Var2.c);
                return;
            }
            int size2 = a32Var.j.size();
            for (int i2 = 0; i2 < size2; i2++) {
                f43 f43Var2 = (f43) ((WeakReference) a32Var.j.get(i2)).get();
                if (f43Var2 != null) {
                    ey3 ey3Var3 = a32Var.h;
                    fp1 fp1Var3 = a32Var.b;
                    if (f43Var2.k) {
                        f43Var2.g = ey3Var3;
                        if (f43Var2.i) {
                            fp1Var3.f().updateExtractedText((View) fp1Var3.c, f43Var2.h, vl0.l(ey3Var3));
                        }
                        jz3 jz3Var3 = ey3Var3.c;
                        long j = ey3Var3.b;
                        int iF3 = jz3Var3 != null ? jz3.f(jz3Var3.a) : -1;
                        jz3 jz3Var4 = ey3Var3.c;
                        fp1Var3.f().updateSelection((View) fp1Var3.c, jz3.f(j), jz3.e(j), iF3, jz3Var4 != null ? jz3.e(jz3Var4.a) : -1);
                    }
                }
            }
        }
    }

    @Override // defpackage.iw2
    public final void d() {
        SoftwareKeyboardController softwareKeyboardController;
        t22 t22Var = this.a;
        if (t22Var == null || (softwareKeyboardController = (SoftwareKeyboardController) gm4.t(t22Var, CompositionLocalsKt.getLocalSoftwareKeyboardController())) == null) {
            return;
        }
        softwareKeyboardController.show();
    }

    @Override // defpackage.iw2
    public final void e(ey3 ey3Var, nn2 nn2Var, xy3 xy3Var, pj2 pj2Var, h43 h43Var, h43 h43Var2) {
        a32 a32Var = this.c;
        if (a32Var != null) {
            u22 u22Var = a32Var.m;
            synchronized (u22Var.c) {
                try {
                    u22Var.j = ey3Var;
                    u22Var.l = nn2Var;
                    u22Var.k = xy3Var;
                    u22Var.m = h43Var;
                    u22Var.n = h43Var2;
                    if (u22Var.e || u22Var.d) {
                        u22Var.a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // defpackage.iw2
    public final void f() {
        SoftwareKeyboardController softwareKeyboardController;
        t22 t22Var = this.a;
        if (t22Var == null || (softwareKeyboardController = (SoftwareKeyboardController) gm4.t(t22Var, CompositionLocalsKt.getLocalSoftwareKeyboardController())) == null) {
            return;
        }
        softwareKeyboardController.hide();
    }

    @Override // defpackage.iw2
    public final void g() throws Throwable {
        ym3 ym3Var = this.b;
        if (ym3Var != null) {
            ym3Var.c(null);
        }
        this.b = null;
        ki2 ki2VarI = i();
        if (ki2VarI != null) {
            ((ah3) ki2VarI).c();
        }
    }

    @Override // defpackage.iw2
    public final void h(h43 h43Var) {
        Rect rect;
        a32 a32Var = this.c;
        if (a32Var != null) {
            a32Var.l = new Rect(gb2.R(h43Var.a), gb2.R(h43Var.b), gb2.R(h43Var.c), gb2.R(h43Var.d));
            if (!a32Var.j.isEmpty() || (rect = a32Var.l) == null) {
                return;
            }
            a32Var.a.requestRectangleOnScreen(new Rect(rect));
        }
    }

    public final ki2 i() {
        ah3 ah3Var = this.d;
        if (ah3Var != null) {
            return ah3Var;
        }
        if (!bp3.a) {
            return null;
        }
        ah3 ah3VarH = xr0.H(0, 2, fy.h);
        this.d = ah3VarH;
        return ah3VarH;
    }

    public final void j(h4 h4Var) {
        t22 t22Var = this.a;
        if (t22Var == null) {
            return;
        }
        ym3 ym3VarF = null;
        qb qbVar = new qb(h4Var, this, t22Var, ym3VarF, 0);
        if (t22Var.isAttached()) {
            ym3VarF = py.F(t22Var.getCoroutineScope(), null, jq0.l, new k(t22Var, qbVar, ym3VarF, 18), 1);
        }
        this.b = ym3VarF;
    }

    public final void k(t22 t22Var) {
        if (!(this.a == t22Var)) {
            so1.c("Expected textInputModifierNode to be " + t22Var + " but was " + this.a);
        }
        this.a = null;
    }
}
