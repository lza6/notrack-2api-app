package defpackage;

import ai.notrack.app.R;
import android.os.Build;
import android.view.View;
import androidx.compose.foundation.layout.WindowInsetsHolder$Companion;
import java.util.WeakHashMap;
import kotlin.uuid.Uuid;

/* JADX INFO: loaded from: classes.dex */
public final class ch4 {
    public static final WindowInsetsHolder$Companion x = new WindowInsetsHolder$Companion();
    public static final WeakHashMap y = new WeakHashMap();
    public final se a = WindowInsetsHolder$Companion.access$systemInsets(4, "captionBar");
    public final se b;
    public final se c;
    public final se d;
    public final se e;
    public final se f;
    public final se g;
    public final se h;
    public final se i;
    public final cb4 j;
    public final v84 k;
    public final v84 l;
    public final v84 m;
    public final cb4 n;
    public final cb4 o;
    public final cb4 p;
    public final cb4 q;
    public final cb4 r;
    public final cb4 s;
    public final cb4 t;
    public final boolean u;
    public int v;
    public final qp1 w;

    public ch4(View view) {
        se seVarAccess$systemInsets = WindowInsetsHolder$Companion.access$systemInsets(Uuid.SIZE_BITS, "displayCutout");
        this.b = seVarAccess$systemInsets;
        se seVarAccess$systemInsets2 = WindowInsetsHolder$Companion.access$systemInsets(8, "ime");
        this.c = seVarAccess$systemInsets2;
        se seVarAccess$systemInsets3 = WindowInsetsHolder$Companion.access$systemInsets(32, "mandatorySystemGestures");
        this.d = seVarAccess$systemInsets3;
        this.e = WindowInsetsHolder$Companion.access$systemInsets(2, "navigationBars");
        this.f = WindowInsetsHolder$Companion.access$systemInsets(1, "statusBars");
        se seVarAccess$systemInsets4 = WindowInsetsHolder$Companion.access$systemInsets(7, "systemBars");
        this.g = seVarAccess$systemInsets4;
        se seVarAccess$systemInsets5 = WindowInsetsHolder$Companion.access$systemInsets(16, "systemGestures");
        this.h = seVarAccess$systemInsets5;
        se seVarAccess$systemInsets6 = WindowInsetsHolder$Companion.access$systemInsets(64, "tappableElement");
        this.i = seVarAccess$systemInsets6;
        cb4 cb4Var = new cb4(new up1(0, 0, 0, 0), "waterfall");
        this.j = cb4Var;
        v84 v84Var = new v84(new v84(seVarAccess$systemInsets4, seVarAccess$systemInsets2), seVarAccess$systemInsets);
        this.k = v84Var;
        v84 v84Var2 = new v84(new v84(new v84(seVarAccess$systemInsets6, seVarAccess$systemInsets3), seVarAccess$systemInsets5), cb4Var);
        this.l = v84Var2;
        this.m = new v84(v84Var, v84Var2);
        this.n = WindowInsetsHolder$Companion.access$valueInsetsIgnoringVisibility(4, "captionBarIgnoringVisibility");
        this.o = WindowInsetsHolder$Companion.access$valueInsetsIgnoringVisibility(2, "navigationBarsIgnoringVisibility");
        this.p = WindowInsetsHolder$Companion.access$valueInsetsIgnoringVisibility(1, "statusBarsIgnoringVisibility");
        this.q = WindowInsetsHolder$Companion.access$valueInsetsIgnoringVisibility(7, "systemBarsIgnoringVisibility");
        this.r = WindowInsetsHolder$Companion.access$valueInsetsIgnoringVisibility(64, "tappableElementIgnoringVisibility");
        this.s = WindowInsetsHolder$Companion.access$valueInsetsIgnoringVisibility(8, "imeAnimationTarget");
        this.t = WindowInsetsHolder$Companion.access$valueInsetsIgnoringVisibility(8, "imeAnimationSource");
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        Object tag = view2 != null ? view2.getTag(R.id.consume_window_insets_tag) : null;
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        this.u = bool != null ? bool.booleanValue() : true;
        this.w = new qp1(this);
    }

    public static void a(ch4 ch4Var, wg4 wg4Var) {
        boolean z = false;
        ch4Var.a.g(wg4Var, 0);
        ch4Var.c.g(wg4Var, 0);
        ch4Var.b.g(wg4Var, 0);
        ch4Var.e.g(wg4Var, 0);
        ch4Var.f.g(wg4Var, 0);
        ch4Var.g.g(wg4Var, 0);
        ch4Var.h.g(wg4Var, 0);
        ch4Var.i.g(wg4Var, 0);
        ch4Var.d.g(wg4Var, 0);
        ch4Var.n.f(nh4.a(wg4Var.a.h(4)));
        ch4Var.o.f(nh4.a(wg4Var.a.h(2)));
        ch4Var.p.f(nh4.a(wg4Var.a.h(1)));
        ch4Var.q.f(nh4.a(wg4Var.a.h(7)));
        ch4Var.r.f(nh4.a(wg4Var.a.h(64)));
        tw0 tw0VarF = wg4Var.a.f();
        if (tw0VarF != null) {
            ch4Var.j.f(nh4.a(Build.VERSION.SDK_INT >= 30 ? pp1.c(k1.d(tw0VarF.a)) : pp1.e));
        }
        synchronized (vk3.b) {
            gi2 gi2Var = vk3.i.h;
            if (gi2Var != null && gi2Var.h()) {
                z = true;
            }
        }
        if (z) {
            vk3.a();
        }
    }
}
