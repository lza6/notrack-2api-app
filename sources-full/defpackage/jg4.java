package defpackage;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public final class jg4 extends ng4 {
    public static Field e;
    public static boolean f;
    public static Constructor g;
    public static boolean h;
    public WindowInsets c;
    public pp1 d;

    public jg4() {
        this.c = i();
    }

    public jg4(wg4 wg4Var) {
        super(wg4Var);
        this.c = wg4Var.b();
    }

    private static WindowInsets i() {
        if (!f) {
            try {
                e = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e2) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e2);
            }
            f = true;
        }
        Field field = e;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e3) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e3);
            }
        }
        if (!h) {
            try {
                g = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e4) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e4);
            }
            h = true;
        }
        Constructor constructor = g;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e5) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e5);
            }
        }
        return null;
    }

    @Override // defpackage.ng4
    public wg4 b() {
        a();
        wg4 wg4VarC = wg4.c(this.c, null);
        pp1[] pp1VarArr = this.b;
        tg4 tg4Var = wg4VarC.a;
        tg4Var.r(pp1VarArr);
        tg4Var.u(this.d);
        return wg4VarC;
    }

    @Override // defpackage.ng4
    public void e(pp1 pp1Var) {
        this.d = pp1Var;
    }

    @Override // defpackage.ng4
    public void g(pp1 pp1Var) {
        WindowInsets windowInsets = this.c;
        if (windowInsets != null) {
            this.c = windowInsets.replaceSystemWindowInsets(pp1Var.a, pp1Var.b, pp1Var.c, pp1Var.d);
        }
    }
}
