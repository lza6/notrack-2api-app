package defpackage;

import ai.notrack.app.R;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.widget.PopupWindow;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ViewStubCompat;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class ti implements Window.Callback {
    public final Window.Callback c;
    public boolean d;
    public boolean h;
    public boolean l;
    public final /* synthetic */ zi m;

    public ti(zi ziVar, Window.Callback callback) {
        this.m = ziVar;
        if (callback != null) {
            this.c = callback;
        } else {
            u41.k("Window callback may not be null");
            throw null;
        }
    }

    public final void a(Window.Callback callback) {
        try {
            this.d = true;
            callback.onContentChanged();
        } finally {
            this.d = false;
        }
    }

    public final boolean b(int i, Menu menu) {
        return this.c.onMenuOpened(i, menu);
    }

    public final void c(int i, Menu menu) {
        this.c.onPanelClosed(i, menu);
    }

    public final void d(List list, Menu menu, int i) {
        vf4.a(this.c, list, menu, i);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.c.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z = this.h;
        Window.Callback callback = this.c;
        if (z) {
            return callback.dispatchKeyEvent(keyEvent);
        }
        return this.m.x(keyEvent) || callback.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003c  */
    /* JADX WARN: Code duplicated, block: B:26:0x0051  */
    /* JADX WARN: Code duplicated, block: B:28:0x0055  */
    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        yi yiVar;
        boolean zI;
        hc2 hc2Var;
        boolean zPerformShortcut;
        if (!this.c.dispatchKeyShortcutEvent(keyEvent)) {
            int keyCode = keyEvent.getKeyCode();
            zi ziVar = this.m;
            ziVar.D();
            zf4 zf4Var = ziVar.v;
            if (zf4Var == null) {
                yiVar = ziVar.T;
                if (yiVar != null || !ziVar.I(yiVar, keyEvent.getKeyCode(), keyEvent)) {
                    if (ziVar.T == null) {
                        yi yiVarC = ziVar.C(0);
                        ziVar.J(yiVarC, keyEvent);
                        zI = ziVar.I(yiVarC, keyEvent.getKeyCode(), keyEvent);
                        yiVarC.k = false;
                        if (zI) {
                        }
                    }
                    return false;
                }
                yi yiVar2 = ziVar.T;
                if (yiVar2 != null) {
                    yiVar2.l = true;
                    return true;
                }
            } else {
                yf4 yf4Var = zf4Var.i;
                if (yf4Var == null || (hc2Var = yf4Var.l) == null) {
                    zPerformShortcut = false;
                } else {
                    hc2Var.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
                    zPerformShortcut = hc2Var.performShortcut(keyCode, keyEvent, 0);
                }
                if (!zPerformShortcut) {
                    yiVar = ziVar.T;
                    if (yiVar != null) {
                        if (ziVar.T == null) {
                            yi yiVarC2 = ziVar.C(0);
                            ziVar.J(yiVarC2, keyEvent);
                            zI = ziVar.I(yiVarC2, keyEvent.getKeyCode(), keyEvent);
                            yiVarC2.k = false;
                            if (zI) {
                            }
                        }
                        return false;
                    }
                    if (ziVar.T == null) {
                        yi yiVarC3 = ziVar.C(0);
                        ziVar.J(yiVarC3, keyEvent);
                        zI = ziVar.I(yiVarC3, keyEvent.getKeyCode(), keyEvent);
                        yiVarC3.k = false;
                        if (zI) {
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.c.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.c.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.c.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.c.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.c.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.c.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.d) {
            this.c.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof hc2)) {
            return this.c.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        return this.c.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.c.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.c.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        b(i, menu);
        if (i == 108) {
            zi ziVar = this.m;
            ziVar.D();
            zf4 zf4Var = ziVar.v;
            if (zf4Var != null) {
                ArrayList arrayList = zf4Var.m;
                if (true != zf4Var.l) {
                    zf4Var.l = true;
                    if (arrayList.size() > 0) {
                        arrayList.get(0).getClass();
                        m51.t();
                        return false;
                    }
                }
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        if (this.l) {
            this.c.onPanelClosed(i, menu);
            return;
        }
        c(i, menu);
        zi ziVar = this.m;
        if (i != 108) {
            if (i == 0) {
                yi yiVarC = ziVar.C(i);
                if (yiVarC.m) {
                    ziVar.v(yiVarC, false);
                    return;
                }
                return;
            }
            return;
        }
        ziVar.D();
        zf4 zf4Var = ziVar.v;
        if (zf4Var != null) {
            ArrayList arrayList = zf4Var.m;
            if (zf4Var.l) {
                zf4Var.l = false;
                if (arrayList.size() <= 0) {
                    return;
                }
                arrayList.get(0).getClass();
                m51.t();
            }
        }
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z) {
        wf4.a(this.c, z);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        hc2 hc2Var = menu instanceof hc2 ? (hc2) menu : null;
        if (i == 0 && hc2Var == null) {
            return false;
        }
        if (hc2Var != null) {
            hc2Var.x = true;
        }
        boolean zOnPreparePanel = this.c.onPreparePanel(i, view, menu);
        if (hc2Var != null) {
            hc2Var.x = false;
        }
        return zOnPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        hc2 hc2Var = this.m.C(0).h;
        if (hc2Var != null) {
            d(list, hc2Var, i);
        } else {
            d(list, menu, i);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.c.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return uf4.a(this.c, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.c.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        this.c.onWindowFocusChanged(z);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        ViewGroup viewGroup;
        zi ziVar = this.m;
        Context context = ziVar.s;
        if (i != 0) {
            return uf4.b(this.c, callback, i);
        }
        ir3 ir3Var = new ir3();
        ir3Var.d = context;
        ir3Var.c = callback;
        ir3Var.h = new ArrayList();
        ir3Var.l = new ph3(0);
        k3 k3Var = ziVar.B;
        if (k3Var != null) {
            k3Var.a();
        }
        bv0 bv0Var = new bv0(ziVar, 2, ir3Var);
        ziVar.D();
        zf4 zf4Var = ziVar.v;
        int i2 = 1;
        if (zf4Var != null) {
            yf4 yf4Var = zf4Var.i;
            if (yf4Var != null) {
                yf4Var.a();
            }
            zf4Var.c.setHideOnContentScrollEnabled(false);
            zf4Var.f.e();
            yf4 yf4Var2 = new yf4(zf4Var, zf4Var.f.getContext(), bv0Var);
            hc2 hc2Var = yf4Var2.l;
            hc2Var.w();
            try {
                boolean zE0 = ((ir3) yf4Var2.m.d).e0(yf4Var2, hc2Var);
                hc2Var.v();
                if (zE0) {
                    zf4Var.i = yf4Var2;
                    yf4Var2.h();
                    zf4Var.f.c(yf4Var2);
                    zf4Var.a(true);
                } else {
                    yf4Var2 = null;
                }
                ziVar.B = yf4Var2;
            } catch (Throwable th) {
                hc2Var.v();
                throw th;
            }
        }
        if (ziVar.B == null) {
            pd4 pd4Var = ziVar.F;
            if (pd4Var != null) {
                pd4Var.b();
            }
            k3 k3Var2 = ziVar.B;
            if (k3Var2 != null) {
                k3Var2.a();
            }
            if (ziVar.C == null) {
                if (ziVar.P) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = context.getTheme();
                    theme.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme themeNewTheme = context.getResources().newTheme();
                        themeNewTheme.setTo(theme);
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                        ro0 ro0Var = new ro0(context, 0);
                        ro0Var.getTheme().setTo(themeNewTheme);
                        context = ro0Var;
                    }
                    ziVar.C = new ActionBarContextView(context);
                    PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, R.attr.actionModePopupWindowStyle);
                    ziVar.D = popupWindow;
                    popupWindow.setWindowLayoutType(2);
                    ziVar.D.setContentView(ziVar.C);
                    ziVar.D.setWidth(-1);
                    context.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
                    ziVar.C.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                    ziVar.D.setHeight(-2);
                    ziVar.E = new mi(ziVar, i2);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) ziVar.H.findViewById(R.id.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        ziVar.D();
                        zf4 zf4Var2 = ziVar.v;
                        Context contextB = zf4Var2 != null ? zf4Var2.b() : null;
                        if (contextB != null) {
                            context = contextB;
                        }
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(context));
                        ziVar.C = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (ziVar.C != null) {
                pd4 pd4Var2 = ziVar.F;
                if (pd4Var2 != null) {
                    pd4Var2.b();
                }
                ziVar.C.e();
                Context context2 = ziVar.C.getContext();
                ActionBarContextView actionBarContextView = ziVar.C;
                xm3 xm3Var = new xm3();
                xm3Var.h = context2;
                xm3Var.l = actionBarContextView;
                xm3Var.m = bv0Var;
                hc2 hc2Var2 = new hc2(actionBarContextView.getContext());
                hc2Var2.l = 1;
                xm3Var.p = hc2Var2;
                hc2Var2.e = xm3Var;
                if (((ir3) bv0Var.d).e0(xm3Var, hc2Var2)) {
                    xm3Var.h();
                    ziVar.C.c(xm3Var);
                    ziVar.B = xm3Var;
                    boolean z = ziVar.G && (viewGroup = ziVar.H) != null && viewGroup.isLaidOut();
                    ActionBarContextView actionBarContextView2 = ziVar.C;
                    if (z) {
                        actionBarContextView2.setAlpha(0.0f);
                        pd4 pd4VarA = zc4.a(ziVar.C);
                        pd4VarA.a(1.0f);
                        ziVar.F = pd4VarA;
                        pd4VarA.d(new oi(i2, ziVar));
                    } else {
                        actionBarContextView2.setAlpha(1.0f);
                        ziVar.C.setVisibility(0);
                        if (ziVar.C.getParent() instanceof View) {
                            View view = (View) ziVar.C.getParent();
                            WeakHashMap weakHashMap = zc4.a;
                            qc4.c(view);
                        }
                    }
                    if (ziVar.D != null) {
                        ziVar.t.getDecorView().post(ziVar.E);
                    }
                } else {
                    ziVar.B = null;
                }
            }
            ziVar.L();
            ziVar.B = ziVar.B;
        }
        ziVar.L();
        k3 k3Var3 = ziVar.B;
        if (k3Var3 != null) {
            return ir3Var.Q(k3Var3);
        }
        return null;
    }
}
