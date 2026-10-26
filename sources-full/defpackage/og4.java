package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class og4 extends tg4 {
    public static boolean h;
    public static Method i;
    public static Class j;
    public static Field k;
    public static Field l;
    public final WindowInsets c;
    public pp1[] d;
    public pp1 e;
    public wg4 f;
    public pp1 g;

    public og4(wg4 wg4Var, WindowInsets windowInsets) {
        super(wg4Var);
        this.e = null;
        this.c = windowInsets;
    }

    public og4(wg4 wg4Var, og4 og4Var) {
        this(wg4Var, new WindowInsets(og4Var.c));
    }

    private static void A() {
        try {
            i = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            j = cls;
            k = cls.getDeclaredField("mVisibleInsets");
            l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            k.setAccessible(true);
            l.setAccessible(true);
        } catch (ReflectiveOperationException e) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
        }
        h = true;
    }

    private pp1 v(int i2, boolean z) {
        pp1 pp1VarA = pp1.e;
        for (int i3 = 1; i3 <= 256; i3 <<= 1) {
            if ((i2 & i3) != 0) {
                pp1VarA = pp1.a(pp1VarA, w(i3, z));
            }
        }
        return pp1VarA;
    }

    private pp1 x() {
        wg4 wg4Var = this.f;
        return wg4Var != null ? wg4Var.a.j() : pp1.e;
    }

    private pp1 y(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            j93.k("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            return null;
        }
        if (!h) {
            A();
        }
        Method method = i;
        if (method != null && j != null && k != null) {
            try {
                Object objInvoke = method.invoke(view, null);
                if (objInvoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) k.get(l.get(objInvoke));
                if (rect != null) {
                    return pp1.b(rect.left, rect.top, rect.right, rect.bottom);
                }
                return null;
            } catch (ReflectiveOperationException e) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
            }
        }
        return null;
    }

    @Override // defpackage.tg4
    public void d(View view) {
        pp1 pp1VarY = y(view);
        if (pp1VarY == null) {
            pp1VarY = pp1.e;
        }
        s(pp1VarY);
    }

    @Override // defpackage.tg4
    public void e(wg4 wg4Var) {
        wg4Var.a.t(this.f);
        wg4Var.a.s(this.g);
    }

    @Override // defpackage.tg4
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return Objects.equals(this.g, ((og4) obj).g);
        }
        return false;
    }

    @Override // defpackage.tg4
    public pp1 g(int i2) {
        return v(i2, false);
    }

    @Override // defpackage.tg4
    public pp1 h(int i2) {
        return v(i2, true);
    }

    @Override // defpackage.tg4
    public final pp1 l() {
        if (this.e == null) {
            WindowInsets windowInsets = this.c;
            this.e = pp1.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.e;
    }

    @Override // defpackage.tg4
    public wg4 n(int i2, int i3, int i4, int i5) {
        ng4 lg4Var;
        wg4 wg4VarC = wg4.c(this.c, null);
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 30) {
            lg4Var = new mg4(wg4VarC);
        } else {
            lg4Var = i6 >= 29 ? new lg4(wg4VarC) : new jg4(wg4VarC);
        }
        lg4Var.g(wg4.a(l(), i2, i3, i4, i5));
        lg4Var.e(wg4.a(j(), i2, i3, i4, i5));
        return lg4Var.b();
    }

    @Override // defpackage.tg4
    public boolean p() {
        return this.c.isRound();
    }

    @Override // defpackage.tg4
    public boolean q(int i2) {
        for (int i3 = 1; i3 <= 256; i3 <<= 1) {
            if ((i2 & i3) != 0 && !z(i3)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.tg4
    public void r(pp1[] pp1VarArr) {
        this.d = pp1VarArr;
    }

    @Override // defpackage.tg4
    public void s(pp1 pp1Var) {
        this.g = pp1Var;
    }

    @Override // defpackage.tg4
    public void t(wg4 wg4Var) {
        this.f = wg4Var;
    }

    public pp1 w(int i2, boolean z) {
        pp1 pp1VarJ;
        int i3;
        if (i2 == 1) {
            return z ? pp1.b(0, Math.max(x().b, l().b), 0, 0) : pp1.b(0, l().b, 0, 0);
        }
        if (i2 == 2) {
            if (z) {
                pp1 pp1VarX = x();
                pp1 pp1VarJ2 = j();
                return pp1.b(Math.max(pp1VarX.a, pp1VarJ2.a), 0, Math.max(pp1VarX.c, pp1VarJ2.c), Math.max(pp1VarX.d, pp1VarJ2.d));
            }
            pp1 pp1VarL = l();
            wg4 wg4Var = this.f;
            pp1VarJ = wg4Var != null ? wg4Var.a.j() : null;
            int iMin = pp1VarL.d;
            if (pp1VarJ != null) {
                iMin = Math.min(iMin, pp1VarJ.d);
            }
            return pp1.b(pp1VarL.a, 0, pp1VarL.c, iMin);
        }
        pp1 pp1Var = pp1.e;
        if (i2 == 8) {
            pp1[] pp1VarArr = this.d;
            pp1VarJ = pp1VarArr != null ? pp1VarArr[ug4.a(8)] : null;
            if (pp1VarJ != null) {
                return pp1VarJ;
            }
            pp1 pp1VarL2 = l();
            pp1 pp1VarX2 = x();
            int i4 = pp1VarL2.d;
            if (i4 > pp1VarX2.d) {
                return pp1.b(0, 0, 0, i4);
            }
            pp1 pp1Var2 = this.g;
            if (pp1Var2 != null && !pp1Var2.equals(pp1Var) && (i3 = this.g.d) > pp1VarX2.d) {
                return pp1.b(0, 0, 0, i3);
            }
        } else {
            if (i2 == 16) {
                return k();
            }
            if (i2 == 32) {
                return i();
            }
            if (i2 == 64) {
                return m();
            }
            if (i2 == 128) {
                wg4 wg4Var2 = this.f;
                tw0 tw0VarF = wg4Var2 != null ? wg4Var2.a.f() : f();
                if (tw0VarF != null) {
                    int i5 = Build.VERSION.SDK_INT;
                    return pp1.b(i5 >= 28 ? og.j(tw0VarF.a) : 0, i5 >= 28 ? og.l(tw0VarF.a) : 0, i5 >= 28 ? og.k(tw0VarF.a) : 0, i5 >= 28 ? og.i(tw0VarF.a) : 0);
                }
            }
        }
        return pp1Var;
    }

    public boolean z(int i2) {
        if (i2 != 1 && i2 != 2) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 8 && i2 != 128) {
                return true;
            }
        }
        return !w(i2, false).equals(pp1.e);
    }
}
