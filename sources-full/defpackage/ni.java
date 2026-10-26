package defpackage;

import ai.notrack.app.R;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import kotlin.io.ConstantsKt;

/* JADX INFO: loaded from: classes.dex */
public final class ni implements wn2, hn0, md2 {
    public final /* synthetic */ int c;
    public final /* synthetic */ zi d;

    public /* synthetic */ ni(zi ziVar, int i) {
        this.c = i;
        this.d = ziVar;
    }

    @Override // defpackage.md2
    public void b(hc2 hc2Var, boolean z) {
        yi yiVar;
        int i = this.c;
        zi ziVar = this.d;
        switch (i) {
            case 2:
                ziVar.u(hc2Var);
                break;
            default:
                hc2 hc2VarK = hc2Var.k();
                int i2 = 0;
                boolean z2 = hc2VarK != hc2Var;
                if (z2) {
                    hc2Var = hc2VarK;
                }
                yi[] yiVarArr = ziVar.S;
                int length = yiVarArr != null ? yiVarArr.length : 0;
                while (true) {
                    if (i2 >= length) {
                        yiVar = null;
                    } else {
                        yiVar = yiVarArr[i2];
                        if (yiVar == null || yiVar.h != hc2Var) {
                            i2++;
                        }
                    }
                }
                if (yiVar != null) {
                    if (!z2) {
                        ziVar.v(yiVar, z);
                    } else {
                        ziVar.t(yiVar.a, yiVar, hc2VarK);
                        ziVar.v(yiVar, true);
                    }
                }
                break;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // defpackage.wn2
    public wg4 f(View view, wg4 wg4Var) {
        int i;
        boolean z;
        wg4 wg4VarB;
        ng4 lg4Var;
        boolean z2;
        boolean z3;
        tg4 tg4Var = wg4Var.a;
        int i2 = tg4Var.l().b;
        zi ziVar = this.d;
        Context context = ziVar.s;
        int i3 = tg4Var.l().b;
        ActionBarContextView actionBarContextView = ziVar.C;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            i = 0;
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ziVar.C.getLayoutParams();
            if (ziVar.C.isShown()) {
                if (ziVar.j0 == null) {
                    ziVar.j0 = new Rect();
                    ziVar.k0 = new Rect();
                }
                Rect rect = ziVar.j0;
                Rect rect2 = ziVar.k0;
                rect.set(tg4Var.l().a, tg4Var.l().b, tg4Var.l().c, tg4Var.l().d);
                ViewGroup viewGroup = ziVar.H;
                if (Build.VERSION.SDK_INT >= 29) {
                    boolean z4 = yd4.a;
                    xd4.a(viewGroup, rect, rect2);
                    z3 = true;
                } else {
                    if (yd4.a) {
                        z3 = true;
                    } else {
                        yd4.a = true;
                        try {
                            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                            yd4.b = declaredMethod;
                            if (declaredMethod.isAccessible()) {
                                z3 = true;
                            } else {
                                z3 = true;
                                try {
                                    yd4.b.setAccessible(true);
                                } catch (NoSuchMethodException unused) {
                                    Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
                                }
                            }
                        } catch (NoSuchMethodException unused2) {
                            z3 = true;
                        }
                    }
                    Method method = yd4.b;
                    if (method != null) {
                        try {
                            method.invoke(viewGroup, rect, rect2);
                        } catch (Exception e) {
                            Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e);
                        }
                    }
                }
                int i4 = rect.top;
                int i5 = rect.left;
                int i6 = rect.right;
                ViewGroup viewGroup2 = ziVar.H;
                WeakHashMap weakHashMap = zc4.a;
                wg4 wg4VarA = tc4.a(viewGroup2);
                int i7 = wg4VarA == null ? 0 : wg4VarA.a.l().a;
                int i8 = wg4VarA == null ? 0 : wg4VarA.a.l().c;
                if (marginLayoutParams.topMargin == i4 && marginLayoutParams.leftMargin == i5 && marginLayoutParams.rightMargin == i6) {
                    z2 = false;
                } else {
                    marginLayoutParams.topMargin = i4;
                    marginLayoutParams.leftMargin = i5;
                    marginLayoutParams.rightMargin = i6;
                    z2 = z3;
                }
                if (i4 <= 0 || ziVar.J != null) {
                    View view2 = ziVar.J;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i9 = marginLayoutParams2.height;
                        int i10 = marginLayoutParams.topMargin;
                        if (i9 != i10 || marginLayoutParams2.leftMargin != i7 || marginLayoutParams2.rightMargin != i8) {
                            marginLayoutParams2.height = i10;
                            marginLayoutParams2.leftMargin = i7;
                            marginLayoutParams2.rightMargin = i8;
                            ziVar.J.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view3 = new View(context);
                    ziVar.J = view3;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = i7;
                    layoutParams.rightMargin = i8;
                    ziVar.H.addView(ziVar.J, -1, layoutParams);
                }
                View view4 = ziVar.J;
                boolean z5 = view4 != null ? z3 : false;
                if (z5 && view4.getVisibility() != 0) {
                    View view5 = ziVar.J;
                    view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? context.getColor(R.color.abc_decor_view_status_guard_light) : context.getColor(R.color.abc_decor_view_status_guard));
                }
                if (!ziVar.O && z5) {
                    i3 = 0;
                }
                z = z5;
                i = 0;
            } else {
                i = 0;
                if (marginLayoutParams.topMargin != 0) {
                    marginLayoutParams.topMargin = 0;
                    z2 = true;
                    z = false;
                } else {
                    z = false;
                    z2 = false;
                }
            }
            if (z2) {
                ziVar.C.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = ziVar.J;
        if (view6 != null) {
            view6.setVisibility(z ? i : 8);
        }
        if (i2 != i3) {
            int i11 = tg4Var.l().a;
            int i12 = tg4Var.l().c;
            int i13 = tg4Var.l().d;
            int i14 = Build.VERSION.SDK_INT;
            if (i14 >= 30) {
                lg4Var = new mg4(wg4Var);
            } else {
                lg4Var = i14 >= 29 ? new lg4(wg4Var) : new jg4(wg4Var);
            }
            lg4Var.g(pp1.b(i11, i3, i12, i13));
            wg4VarB = lg4Var.b();
        } else {
            wg4VarB = wg4Var;
        }
        WeakHashMap weakHashMap2 = zc4.a;
        WindowInsets windowInsetsB = wg4VarB.b();
        if (windowInsetsB == null) {
            return wg4VarB;
        }
        WindowInsets windowInsetsB2 = qc4.b(view, windowInsetsB);
        return !windowInsetsB2.equals(windowInsetsB) ? wg4.c(windowInsetsB2, view) : wg4VarB;
    }

    @Override // defpackage.md2
    public boolean q(hc2 hc2Var) {
        Window.Callback callback;
        int i = this.c;
        zi ziVar = this.d;
        switch (i) {
            case 2:
                Window.Callback callback2 = ziVar.t.getCallback();
                if (callback2 != null) {
                    callback2.onMenuOpened(108, hc2Var);
                }
                break;
            default:
                if (hc2Var == hc2Var.k() && ziVar.M && (callback = ziVar.t.getCallback()) != null && !ziVar.X) {
                    callback.onMenuOpened(108, hc2Var);
                }
                break;
        }
        return true;
    }
}
