package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class wg4 {
    public static final wg4 b;
    public final tg4 a;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            b = sg4.q;
        } else {
            b = tg4.b;
        }
    }

    public wg4(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.a = new sg4(this, windowInsets);
            return;
        }
        if (i >= 29) {
            this.a = new rg4(this, windowInsets);
        } else if (i >= 28) {
            this.a = new qg4(this, windowInsets);
        } else {
            this.a = new pg4(this, windowInsets);
        }
    }

    public wg4(wg4 wg4Var) {
        if (wg4Var == null) {
            this.a = new tg4(this);
            return;
        }
        tg4 tg4Var = wg4Var.a;
        int i = Build.VERSION.SDK_INT;
        if (i >= 30 && (tg4Var instanceof sg4)) {
            this.a = new sg4(this, (sg4) tg4Var);
        } else if (i >= 29 && (tg4Var instanceof rg4)) {
            this.a = new rg4(this, (rg4) tg4Var);
        } else if (i >= 28 && (tg4Var instanceof qg4)) {
            this.a = new qg4(this, (qg4) tg4Var);
        } else if (tg4Var instanceof pg4) {
            this.a = new pg4(this, (pg4) tg4Var);
        } else if (tg4Var instanceof og4) {
            this.a = new og4(this, (og4) tg4Var);
        } else {
            this.a = new tg4(this);
        }
        tg4Var.e(this);
    }

    public static pp1 a(pp1 pp1Var, int i, int i2, int i3, int i4) {
        int iMax = Math.max(0, pp1Var.a - i);
        int iMax2 = Math.max(0, pp1Var.b - i2);
        int iMax3 = Math.max(0, pp1Var.c - i3);
        int iMax4 = Math.max(0, pp1Var.d - i4);
        return (iMax == i && iMax2 == i2 && iMax3 == i3 && iMax4 == i4) ? pp1Var : pp1.b(iMax, iMax2, iMax3, iMax4);
    }

    public static wg4 c(WindowInsets windowInsets, View view) {
        windowInsets.getClass();
        wg4 wg4Var = new wg4(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = zc4.a;
            wg4 wg4VarA = tc4.a(view);
            tg4 tg4Var = wg4Var.a;
            tg4Var.t(wg4VarA);
            tg4Var.d(view.getRootView());
        }
        return wg4Var;
    }

    public final WindowInsets b() {
        tg4 tg4Var = this.a;
        if (tg4Var instanceof og4) {
            return ((og4) tg4Var).c;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof wg4) {
            return Objects.equals(this.a, ((wg4) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        tg4 tg4Var = this.a;
        if (tg4Var == null) {
            return 0;
        }
        return tg4Var.hashCode();
    }
}
