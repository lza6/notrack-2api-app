package defpackage;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.LocaleList;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import kotlin.io.ConstantsKt;
import kotlin.uuid.Uuid;

/* JADX INFO: loaded from: classes.dex */
public final class zi extends li implements fc2, LayoutInflater.Factory2 {
    public static final ph3 o0 = new ph3(0);
    public static final int[] p0 = {R.attr.windowBackground};
    public static final boolean q0 = !"robolectric".equals(Build.FINGERPRINT);
    public ni A;
    public k3 B;
    public ActionBarContextView C;
    public PopupWindow D;
    public mi E;
    public boolean G;
    public ViewGroup H;
    public TextView I;
    public View J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public yi[] S;
    public yi T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean X;
    public Configuration Y;
    public final int Z;
    public int a0;
    public int b0;
    public boolean c0;
    public ui d0;
    public ui e0;
    public boolean f0;
    public int g0;
    public boolean i0;
    public Rect j0;
    public Rect k0;
    public sk l0;
    public OnBackInvokedDispatcher m0;
    public OnBackInvokedCallback n0;
    public final Object r;
    public final Context s;
    public Window t;
    public ti u;
    public zf4 v;
    public wp3 w;
    public CharSequence x;
    public ActionBarOverlayLayout y;
    public ni z;
    public pd4 F = null;
    public final mi h0 = new mi(this, 0);

    public zi(Context context, Window window, di diVar, Object obj) {
        zh zhVar = null;
        this.Z = -100;
        this.s = context;
        this.r = obj;
        if (obj instanceof Dialog) {
            while (context != null) {
                if (!(context instanceof zh)) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                } else {
                    zhVar = (zh) context;
                    break;
                }
            }
            if (zhVar != null) {
                this.Z = ((zi) zhVar.m()).Z;
            }
        }
        if (this.Z == -100) {
            String name = this.r.getClass().getName();
            ph3 ph3Var = o0;
            Integer num = (Integer) ph3Var.get(name);
            if (num != null) {
                this.Z = num.intValue();
                ph3Var.remove(this.r.getClass().getName());
            }
        }
        if (window != null) {
            r(window);
        }
        bj.c();
    }

    public static i72 s(Context context) {
        i72 i72Var;
        i72 i72Var2;
        if (Build.VERSION.SDK_INT >= 33 || (i72Var = li.h) == null) {
            return null;
        }
        j72 j72Var = i72Var.a;
        i72 i72VarB = qi.b(context.getApplicationContext().getResources().getConfiguration());
        if (j72Var.a.isEmpty()) {
            i72Var2 = i72.b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i = 0;
            while (i < i72VarB.a.a.size() + j72Var.a.size()) {
                Locale localeB = i < j72Var.a.size() ? i72Var.b(i) : i72VarB.b(i - j72Var.a.size());
                if (localeB != null) {
                    linkedHashSet.add(localeB);
                }
                i++;
            }
            i72Var2 = new i72(new j72(new LocaleList((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]))));
        }
        return i72Var2.a.a.isEmpty() ? i72VarB : i72Var2;
    }

    public static Configuration w(Context context, int i, i72 i72Var, Configuration configuration, boolean z) {
        int i2;
        if (i == 1) {
            i2 = 16;
        } else if (i != 2) {
            i2 = z ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        } else {
            i2 = 32;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & (-49));
        if (i72Var != null) {
            qi.d(configuration2, i72Var);
        }
        return configuration2;
    }

    public final void A() {
        if (this.t == null) {
            Object obj = this.r;
            if (obj instanceof Activity) {
                r(((Activity) obj).getWindow());
            }
        }
        if (this.t != null) {
            return;
        }
        u41.r("We have not been given a Window");
    }

    public final wi B(Context context) {
        if (this.d0 == null) {
            if (iy2.m == null) {
                Context applicationContext = context.getApplicationContext();
                iy2.m = new iy2(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.d0 = new ui(this, iy2.m);
        }
        return this.d0;
    }

    public final yi C(int i) {
        yi[] yiVarArr = this.S;
        if (yiVarArr == null || yiVarArr.length <= i) {
            yi[] yiVarArr2 = new yi[i + 1];
            if (yiVarArr != null) {
                System.arraycopy(yiVarArr, 0, yiVarArr2, 0, yiVarArr.length);
            }
            this.S = yiVarArr2;
            yiVarArr = yiVarArr2;
        }
        yi yiVar = yiVarArr[i];
        if (yiVar != null) {
            return yiVar;
        }
        yi yiVar2 = new yi();
        yiVar2.a = i;
        yiVar2.n = false;
        yiVarArr[i] = yiVar2;
        return yiVar2;
    }

    public final void D() {
        z();
        if (this.M && this.v == null) {
            Object obj = this.r;
            if (obj instanceof Activity) {
                this.v = new zf4((Activity) obj, this.N);
            } else if (obj instanceof Dialog) {
                this.v = new zf4((Dialog) obj);
            }
            zf4 zf4Var = this.v;
            if (zf4Var != null) {
                zf4Var.d(this.i0);
            }
        }
    }

    public final void E(int i) {
        this.g0 = (1 << i) | this.g0;
        if (this.f0) {
            return;
        }
        View decorView = this.t.getDecorView();
        WeakHashMap weakHashMap = zc4.a;
        decorView.postOnAnimation(this.h0);
        this.f0 = true;
    }

    public final int F(Context context, int i) {
        if (i != -100) {
            if (i != -1) {
                if (i != 0) {
                    if (i != 1 && i != 2) {
                        if (i != 3) {
                            u41.r("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                            return 0;
                        }
                        if (this.e0 == null) {
                            this.e0 = new ui(this, context);
                        }
                        return this.e0.g();
                    }
                } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    return B(context).g();
                }
            }
            return i;
        }
        return -1;
    }

    public final boolean G() {
        js0 js0Var;
        i44 i44Var;
        boolean z = this.U;
        this.U = false;
        yi yiVarC = C(0);
        if (!yiVarC.m) {
            k3 k3Var = this.B;
            if (k3Var != null) {
                k3Var.a();
                return true;
            }
            D();
            zf4 zf4Var = this.v;
            if (zf4Var == null || (js0Var = zf4Var.e) == null || (i44Var = ((o44) js0Var).a.T) == null || i44Var.d == null) {
                return false;
            }
            i44 i44Var2 = ((o44) js0Var).a.T;
            mc2 mc2Var = i44Var2 == null ? null : i44Var2.d;
            if (mc2Var != null) {
                mc2Var.collapseActionView();
            }
        } else if (!z) {
            v(yiVarC, true);
            return true;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0176, code lost:
    
        if (r2.n.getCount() > 0) goto L88;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void H(defpackage.yi r18, android.view.KeyEvent r19) {
        /*
            Method dump skipped, instruction units count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zi.H(yi, android.view.KeyEvent):void");
    }

    public final boolean I(yi yiVar, int i, KeyEvent keyEvent) {
        hc2 hc2Var;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((yiVar.k || J(yiVar, keyEvent)) && (hc2Var = yiVar.h) != null) {
            return hc2Var.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:68:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:79:0x010e  */
    public final boolean J(yi yiVar, KeyEvent keyEvent) {
        hc2 hc2Var;
        ActionBarOverlayLayout actionBarOverlayLayout;
        ActionBarOverlayLayout actionBarOverlayLayout2;
        Resources.Theme themeNewTheme;
        ActionBarOverlayLayout actionBarOverlayLayout3;
        ActionBarOverlayLayout actionBarOverlayLayout4;
        if (!this.X) {
            boolean z = yiVar.k;
            int i = yiVar.a;
            if (z) {
                return true;
            }
            yi yiVar2 = this.T;
            if (yiVar2 != null && yiVar2 != yiVar) {
                v(yiVar2, false);
            }
            Window.Callback callback = this.t.getCallback();
            if (callback != null) {
                yiVar.g = callback.onCreatePanelView(i);
            }
            boolean z2 = i == 0 || i == 108;
            if (z2 && (actionBarOverlayLayout4 = this.y) != null) {
                actionBarOverlayLayout4.k();
                ((o44) actionBarOverlayLayout4.m).l = true;
            }
            if (yiVar.g == null) {
                hc2 hc2Var2 = yiVar.h;
                if (hc2Var2 == null || yiVar.o) {
                    if (hc2Var2 == null) {
                        Context context = this.s;
                        if ((i == 0 || i == 108) && this.y != null) {
                            TypedValue typedValue = new TypedValue();
                            Resources.Theme theme = context.getTheme();
                            theme.resolveAttribute(ai.notrack.app.R.attr.actionBarTheme, typedValue, true);
                            if (typedValue.resourceId != 0) {
                                themeNewTheme = context.getResources().newTheme();
                                themeNewTheme.setTo(theme);
                                themeNewTheme.applyStyle(typedValue.resourceId, true);
                                themeNewTheme.resolveAttribute(ai.notrack.app.R.attr.actionBarWidgetTheme, typedValue, true);
                            } else {
                                theme.resolveAttribute(ai.notrack.app.R.attr.actionBarWidgetTheme, typedValue, true);
                                themeNewTheme = null;
                            }
                            if (typedValue.resourceId != 0) {
                                if (themeNewTheme == null) {
                                    themeNewTheme = context.getResources().newTheme();
                                    themeNewTheme.setTo(theme);
                                }
                                themeNewTheme.applyStyle(typedValue.resourceId, true);
                            }
                            if (themeNewTheme != null) {
                                ro0 ro0Var = new ro0(context, 0);
                                ro0Var.getTheme().setTo(themeNewTheme);
                                context = ro0Var;
                            }
                        }
                        hc2 hc2Var3 = new hc2(context);
                        hc2Var3.e = this;
                        hc2 hc2Var4 = yiVar.h;
                        if (hc2Var3 != hc2Var4) {
                            if (hc2Var4 != null) {
                                hc2Var4.r(yiVar.i);
                            }
                            yiVar.h = hc2Var3;
                            b62 b62Var = yiVar.i;
                            if (b62Var != null) {
                                hc2Var3.b(b62Var, hc2Var3.a);
                            }
                        }
                        if (yiVar.h != null) {
                            if (z2 && (actionBarOverlayLayout2 = this.y) != null) {
                                if (this.z == null) {
                                    this.z = new ni(this, 2);
                                }
                                actionBarOverlayLayout2.l(yiVar.h, this.z);
                            }
                            yiVar.h.w();
                            if (callback.onCreatePanelMenu(i, yiVar.h)) {
                                yiVar.o = false;
                            } else {
                                hc2Var = yiVar.h;
                                if (hc2Var != null) {
                                    if (hc2Var != null) {
                                        hc2Var.r(yiVar.i);
                                    }
                                    yiVar.h = null;
                                }
                                if (z2 && (actionBarOverlayLayout = this.y) != null) {
                                    actionBarOverlayLayout.l(null, this.z);
                                }
                            }
                        }
                    } else {
                        if (z2) {
                            if (this.z == null) {
                                this.z = new ni(this, 2);
                            }
                            actionBarOverlayLayout2.l(yiVar.h, this.z);
                        }
                        yiVar.h.w();
                        if (callback.onCreatePanelMenu(i, yiVar.h)) {
                            hc2Var = yiVar.h;
                            if (hc2Var != null) {
                                if (hc2Var != null) {
                                    hc2Var.r(yiVar.i);
                                }
                                yiVar.h = null;
                            }
                            if (z2) {
                                actionBarOverlayLayout.l(null, this.z);
                            }
                        } else {
                            yiVar.o = false;
                        }
                    }
                }
                yiVar.h.w();
                Bundle bundle = yiVar.p;
                if (bundle != null) {
                    yiVar.h.s(bundle);
                    yiVar.p = null;
                }
                if (!callback.onPreparePanel(0, yiVar.g, yiVar.h)) {
                    if (z2 && (actionBarOverlayLayout3 = this.y) != null) {
                        actionBarOverlayLayout3.l(null, this.z);
                    }
                    yiVar.h.v();
                    return false;
                }
                yiVar.h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
                yiVar.h.v();
            }
            yiVar.k = true;
            yiVar.l = false;
            this.T = yiVar;
            return true;
        }
        return false;
    }

    public final void K() {
        if (this.G) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void L() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z = false;
            if (this.m0 != null && (C(0).m || this.B != null)) {
                z = true;
            }
            if (z && this.n0 == null) {
                this.n0 = si.b(this.m0, this);
            } else {
                if (z || (onBackInvokedCallback = this.n0) == null) {
                    return;
                }
                si.c(this.m0, onBackInvokedCallback);
                this.n0 = null;
            }
        }
    }

    @Override // defpackage.li
    public final void d() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.s);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(this);
        } else {
            if (layoutInflaterFrom.getFactory2() instanceof zi) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x002a  */
    @Override // defpackage.fc2
    public final boolean e(hc2 hc2Var, MenuItem menuItem) {
        yi yiVar;
        Window.Callback callback = this.t.getCallback();
        if (callback != null && !this.X) {
            hc2 hc2VarK = hc2Var.k();
            yi[] yiVarArr = this.S;
            int length = yiVarArr != null ? yiVarArr.length : 0;
            for (int i = 0; i < length; i++) {
                yiVar = yiVarArr[i];
                if (yiVar != null && yiVar.h == hc2VarK) {
                    if (yiVar != null) {
                        return callback.onMenuItemSelected(yiVar.a, menuItem);
                    }
                }
            }
            yiVar = null;
            if (yiVar != null) {
                return callback.onMenuItemSelected(yiVar.a, menuItem);
            }
        }
        return false;
    }

    @Override // defpackage.li
    public final void g() {
        String strT;
        this.V = true;
        q(false, true);
        A();
        Object obj = this.r;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    strT = xp1.t(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e) {
                    throw new IllegalArgumentException(e);
                }
            } catch (IllegalArgumentException unused) {
                strT = null;
            }
            if (strT != null) {
                zf4 zf4Var = this.v;
                if (zf4Var == null) {
                    this.i0 = true;
                } else {
                    zf4Var.d(true);
                }
            }
            synchronized (li.p) {
                li.i(this);
                li.o.add(new WeakReference(this));
            }
        }
        this.Y = new Configuration(this.s.getResources().getConfiguration());
        this.W = true;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004d  */
    @Override // defpackage.li
    public final void h() {
        if (this.r instanceof Activity) {
            synchronized (li.p) {
                li.i(this);
            }
        }
        if (this.f0) {
            this.t.getDecorView().removeCallbacks(this.h0);
        }
        this.X = true;
        if (this.Z != -100) {
            Object obj = this.r;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                o0.put(this.r.getClass().getName(), Integer.valueOf(this.Z));
            } else {
                o0.remove(this.r.getClass().getName());
            }
        } else {
            o0.remove(this.r.getClass().getName());
        }
        ui uiVar = this.d0;
        if (uiVar != null) {
            uiVar.c();
        }
        ui uiVar2 = this.e0;
        if (uiVar2 != null) {
            uiVar2.c();
        }
    }

    @Override // defpackage.li
    public final boolean j(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i = 108;
        } else if (i == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i = 109;
        }
        if (this.Q && i == 108) {
            return false;
        }
        if (this.M && i == 1) {
            this.M = false;
        }
        if (i == 1) {
            K();
            this.Q = true;
            return true;
        }
        if (i == 2) {
            K();
            this.K = true;
            return true;
        }
        if (i == 5) {
            K();
            this.L = true;
            return true;
        }
        if (i == 10) {
            K();
            this.O = true;
            return true;
        }
        if (i == 108) {
            K();
            this.M = true;
            return true;
        }
        if (i != 109) {
            return this.t.requestFeature(i);
        }
        K();
        this.N = true;
        return true;
    }

    @Override // defpackage.li
    public final void k(int i) {
        z();
        ViewGroup viewGroup = (ViewGroup) this.H.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.s).inflate(i, viewGroup);
        this.u.a(this.t.getCallback());
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
    
        if (r6.k() != false) goto L20;
     */
    @Override // defpackage.fc2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(defpackage.hc2 r6) {
        /*
            Method dump skipped, instruction units count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zi.l(hc2):void");
    }

    @Override // defpackage.li
    public final void m(View view) {
        z();
        ViewGroup viewGroup = (ViewGroup) this.H.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.u.a(this.t.getCallback());
    }

    @Override // defpackage.li
    public final void n(View view, ViewGroup.LayoutParams layoutParams) {
        z();
        ViewGroup viewGroup = (ViewGroup) this.H.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.u.a(this.t.getCallback());
    }

    @Override // defpackage.li
    public final void o(CharSequence charSequence) {
        this.x = charSequence;
        ActionBarOverlayLayout actionBarOverlayLayout = this.y;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setWindowTitle(charSequence);
            return;
        }
        zf4 zf4Var = this.v;
        if (zf4Var == null) {
            TextView textView = this.I;
            if (textView != null) {
                textView.setText(charSequence);
                return;
            }
            return;
        }
        o44 o44Var = (o44) zf4Var.e;
        if (o44Var.g) {
            return;
        }
        Toolbar toolbar = o44Var.a;
        o44Var.h = charSequence;
        if ((o44Var.b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (o44Var.g) {
                zc4.i(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View ljVar;
        View view2 = null;
        if (this.l0 == null) {
            int[] iArr = g23.j;
            Context context2 = this.s;
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            String string = typedArrayObtainStyledAttributes.getString(116);
            typedArrayObtainStyledAttributes.recycle();
            if (string == null) {
                this.l0 = new sk();
            } else {
                try {
                    this.l0 = (sk) context2.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.l0 = new sk();
                }
            }
        }
        sk skVar = this.l0;
        int i = nb4.a;
        skVar.getClass();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, g23.x, 0, 0);
        byte b = 4;
        int resourceId = typedArrayObtainStyledAttributes2.getResourceId(4, 0);
        if (resourceId != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        typedArrayObtainStyledAttributes2.recycle();
        Context ro0Var = (resourceId == 0 || ((context instanceof ro0) && ((ro0) context).a == resourceId)) ? context : new ro0(context, resourceId);
        str.getClass();
        switch (str.hashCode()) {
            case -1946472170:
                b = !str.equals("RatingBar") ? (byte) -1 : (byte) 0;
                break;
            case -1455429095:
                b = !str.equals("CheckedTextView") ? (byte) -1 : (byte) 1;
                break;
            case -1346021293:
                b = !str.equals("MultiAutoCompleteTextView") ? (byte) -1 : (byte) 2;
                break;
            case -938935918:
                b = !str.equals("TextView") ? (byte) -1 : (byte) 3;
                break;
            case -937446323:
                if (!str.equals("ImageButton")) {
                    b = -1;
                }
                break;
            case -658531749:
                b = !str.equals("SeekBar") ? (byte) -1 : (byte) 5;
                break;
            case -339785223:
                b = !str.equals("Spinner") ? (byte) -1 : (byte) 6;
                break;
            case 776382189:
                b = !str.equals("RadioButton") ? (byte) -1 : (byte) 7;
                break;
            case 799298502:
                b = !str.equals("ToggleButton") ? (byte) -1 : (byte) 8;
                break;
            case 1125864064:
                b = !str.equals("ImageView") ? (byte) -1 : (byte) 9;
                break;
            case 1413872058:
                b = !str.equals("AutoCompleteTextView") ? (byte) -1 : (byte) 10;
                break;
            case 1601505219:
                b = !str.equals("CheckBox") ? (byte) -1 : (byte) 11;
                break;
            case 1666676343:
                b = !str.equals("EditText") ? (byte) -1 : (byte) 12;
                break;
            case 2001146706:
                b = !str.equals("Button") ? (byte) -1 : (byte) 13;
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                ljVar = new lj(ro0Var, attributeSet);
                break;
            case 1:
                ljVar = new fi(ro0Var, attributeSet);
                break;
            case 2:
                ljVar = new ij(ro0Var, attributeSet);
                break;
            case 3:
                ljVar = new kk(ro0Var, attributeSet);
                break;
            case 4:
                ljVar = new fj(ro0Var, attributeSet, ai.notrack.app.R.attr.imageButtonStyle);
                break;
            case 5:
                ljVar = new nj(ro0Var, attributeSet);
                break;
            case 6:
                ljVar = new zj(ro0Var, attributeSet);
                break;
            case 7:
                ljVar = new kj(ro0Var, attributeSet);
                break;
            case 8:
                ljVar = new qk(ro0Var, attributeSet);
                break;
            case 9:
                ljVar = new hj(ro0Var, attributeSet, 0);
                break;
            case 10:
                ljVar = new ai(ro0Var, attributeSet, ai.notrack.app.R.attr.autoCompleteTextViewStyle);
                break;
            case 11:
                ljVar = new ei(ro0Var, attributeSet);
                break;
            case 12:
                ljVar = new dj(ro0Var, attributeSet);
                break;
            case 13:
                ljVar = new ci(ro0Var, attributeSet);
                break;
            default:
                ljVar = null;
                break;
        }
        if (ljVar == null && context != ro0Var) {
            Object[] objArr = skVar.a;
            if (str.equals("view")) {
                str = attributeSet.getAttributeValue(null, "class");
            }
            try {
                objArr[0] = ro0Var;
                objArr[1] = attributeSet;
                if (-1 == str.indexOf(46)) {
                    int i2 = 0;
                    while (true) {
                        String[] strArr = sk.g;
                        if (i2 < 3) {
                            View viewA = skVar.a(ro0Var, str, strArr[i2]);
                            if (viewA != null) {
                                objArr[0] = null;
                                objArr[1] = null;
                                view2 = viewA;
                            } else {
                                i2++;
                            }
                        } else {
                            objArr[0] = null;
                            objArr[1] = null;
                        }
                    }
                } else {
                    View viewA2 = skVar.a(ro0Var, str, null);
                    objArr[0] = null;
                    objArr[1] = null;
                    view2 = viewA2;
                }
            } catch (Exception unused) {
                objArr[0] = null;
                objArr[1] = null;
            } catch (Throwable th2) {
                objArr[0] = null;
                objArr[1] = null;
                throw th2;
            }
            ljVar = view2;
        }
        if (ljVar != null) {
            Context context3 = ljVar.getContext();
            if ((context3 instanceof ContextWrapper) && ljVar.hasOnClickListeners()) {
                TypedArray typedArrayObtainStyledAttributes3 = context3.obtainStyledAttributes(attributeSet, sk.c);
                String string2 = typedArrayObtainStyledAttributes3.getString(0);
                if (string2 != null) {
                    ljVar.setOnClickListener(new rk(ljVar, string2));
                }
                typedArrayObtainStyledAttributes3.recycle();
            }
            if (Build.VERSION.SDK_INT <= 28) {
                TypedArray typedArrayObtainStyledAttributes4 = ro0Var.obtainStyledAttributes(attributeSet, sk.d);
                if (typedArrayObtainStyledAttributes4.hasValue(0)) {
                    boolean z = typedArrayObtainStyledAttributes4.getBoolean(0, false);
                    WeakHashMap weakHashMap = zc4.a;
                    new oc4(ai.notrack.app.R.id.tag_accessibility_heading, Boolean.class, 0, 28, 2).f(ljVar, Boolean.valueOf(z));
                }
                typedArrayObtainStyledAttributes4.recycle();
                TypedArray typedArrayObtainStyledAttributes5 = ro0Var.obtainStyledAttributes(attributeSet, sk.e);
                if (typedArrayObtainStyledAttributes5.hasValue(0)) {
                    zc4.i(ljVar, typedArrayObtainStyledAttributes5.getString(0));
                }
                typedArrayObtainStyledAttributes5.recycle();
                TypedArray typedArrayObtainStyledAttributes6 = ro0Var.obtainStyledAttributes(attributeSet, sk.f);
                if (typedArrayObtainStyledAttributes6.hasValue(0)) {
                    boolean z2 = typedArrayObtainStyledAttributes6.getBoolean(0, false);
                    WeakHashMap weakHashMap2 = zc4.a;
                    new oc4(ai.notrack.app.R.id.tag_screen_reader_focusable, Boolean.class, 0, 28, 0).f(ljVar, Boolean.valueOf(z2));
                }
                typedArrayObtainStyledAttributes6.recycle();
            }
        }
        return ljVar;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    /* JADX WARN: Code duplicated, block: B:70:0x00f7  */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean q(boolean z, boolean z2) {
        int i;
        boolean z3;
        Object obj;
        Object obj2;
        int i2 = 0;
        if (this.X) {
            return false;
        }
        int i3 = this.Z;
        if (i3 == -100) {
            i3 = li.d;
        }
        Context context = this.s;
        int iF = F(context, i3);
        int i4 = Build.VERSION.SDK_INT;
        LongSparseArray longSparseArray = null;
        i72 i72VarS = i4 < 33 ? s(context) : null;
        if (!z2 && i72VarS != null) {
            i72VarS = qi.b(context.getResources().getConfiguration());
        }
        Configuration configurationW = w(context, iF, i72VarS, null, false);
        boolean z4 = this.c0;
        boolean z5 = true;
        Object obj3 = this.r;
        if (z4 || !(obj3 instanceof Activity)) {
            this.c0 = true;
            i = this.b0;
        } else {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                i = 0;
            } else {
                try {
                    ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, obj3.getClass()), i4 >= 29 ? 269221888 : 786432);
                    if (activityInfo != null) {
                        this.b0 = activityInfo.configChanges;
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e);
                    this.b0 = 0;
                }
                this.c0 = true;
                i = this.b0;
            }
        }
        Configuration configuration = this.Y;
        if (configuration == null) {
            configuration = context.getResources().getConfiguration();
        }
        int i5 = configuration.uiMode & 48;
        int i6 = configurationW.uiMode & 48;
        i72 i72VarB = qi.b(configuration);
        i72 i72VarB2 = i72VarS == null ? null : qi.b(configurationW);
        int i7 = i5 != i6 ? ConstantsKt.MINIMUM_BLOCK_SIZE : 0;
        if (i72VarB2 != null && !i72VarB.equals(i72VarB2)) {
            i7 |= 8196;
        }
        if (((~i) & i7) != 0 && z && this.V && ((q0 || this.W) && (obj3 instanceof Activity))) {
            Activity activity = (Activity) obj3;
            if (activity.isChild()) {
                z3 = false;
            } else {
                int i8 = Build.VERSION.SDK_INT;
                if (i8 >= 31 && (i7 & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0) {
                    activity.getWindow().getDecorView().setLayoutDirection(configurationW.getLayoutDirection());
                }
                if (i8 >= 28) {
                    activity.recreate();
                } else {
                    new Handler(activity.getMainLooper()).post(new m3(i2, activity));
                }
                z3 = true;
            }
        } else {
            z3 = false;
        }
        if (z3 || i7 == 0) {
            z5 = z3;
        } else {
            i2 = (i7 & i) == i7 ? 1 : 0;
            Resources resources = context.getResources();
            Configuration configuration2 = new Configuration(resources.getConfiguration());
            configuration2.uiMode = (resources.getConfiguration().uiMode & (-49)) | i6;
            if (i72VarB2 != null) {
                qi.d(configuration2, i72VarB2);
            }
            resources.updateConfiguration(configuration2, null);
            int i9 = Build.VERSION.SDK_INT;
            if (i9 < 26 && i9 < 28) {
                if (!gb2.n) {
                    try {
                        Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                        gb2.m = declaredField;
                        declaredField.setAccessible(true);
                    } catch (NoSuchFieldException e2) {
                        Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e2);
                    }
                    gb2.n = true;
                }
                Field field = gb2.m;
                if (field != null) {
                    try {
                        obj = field.get(resources);
                    } catch (IllegalAccessException e3) {
                        Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e3);
                        obj = null;
                    }
                    if (obj != null) {
                        if (!gb2.h) {
                            try {
                                Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                                gb2.g = declaredField2;
                                declaredField2.setAccessible(true);
                            } catch (NoSuchFieldException e4) {
                                Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e4);
                            }
                            gb2.h = true;
                        }
                        Field field2 = gb2.g;
                        if (field2 != null) {
                            try {
                                obj2 = field2.get(obj);
                            } catch (IllegalAccessException e5) {
                                Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e5);
                                obj2 = null;
                            }
                        } else {
                            obj2 = null;
                        }
                        if (obj2 != null) {
                            if (!gb2.j) {
                                try {
                                    gb2.i = Class.forName("android.content.res.ThemedResourceCache");
                                } catch (ClassNotFoundException e6) {
                                    Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e6);
                                }
                                gb2.j = true;
                            }
                            Class cls = gb2.i;
                            if (cls != null) {
                                if (!gb2.l) {
                                    try {
                                        Field declaredField3 = cls.getDeclaredField("mUnthemedEntries");
                                        gb2.k = declaredField3;
                                        declaredField3.setAccessible(true);
                                    } catch (NoSuchFieldException e7) {
                                        Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e7);
                                    }
                                    gb2.l = true;
                                }
                                Field field3 = gb2.k;
                                if (field3 != null) {
                                    try {
                                        longSparseArray = (LongSparseArray) field3.get(obj2);
                                    } catch (IllegalAccessException e8) {
                                        Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e8);
                                    }
                                    if (longSparseArray != null) {
                                        longSparseArray.clear();
                                    }
                                }
                            }
                        }
                    }
                }
            }
            int i10 = this.a0;
            if (i10 != 0) {
                context.setTheme(i10);
                context.getTheme().applyStyle(this.a0, true);
            }
            if (i2 != 0 && (obj3 instanceof Activity)) {
                Activity activity2 = (Activity) obj3;
                if (activity2 instanceof n32) {
                    if (((n32) activity2).h().c.compareTo(g32.h) >= 0) {
                        activity2.onConfigurationChanged(configuration2);
                    }
                } else if (this.W && !this.X) {
                    activity2.onConfigurationChanged(configuration2);
                }
            }
        }
        if (i72VarB2 != null) {
            qi.c(qi.b(context.getResources().getConfiguration()));
        }
        if (i3 == 0) {
            B(context).l();
        } else {
            ui uiVar = this.d0;
            if (uiVar != null) {
                uiVar.c();
            }
        }
        ui uiVar2 = this.e0;
        if (i3 == 3) {
            if (uiVar2 == null) {
                this.e0 = new ui(this, context);
            }
            this.e0.l();
        } else if (uiVar2 != null) {
            uiVar2.c();
        }
        return z5;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0074  */
    public final void r(Window window) {
        Drawable drawableE;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        int resourceId;
        if (this.t != null) {
            u41.r("AppCompat has already installed itself into the Window");
            return;
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof ti) {
            u41.r("AppCompat has already installed itself into the Window");
            return;
        }
        ti tiVar = new ti(this, callback);
        this.u = tiVar;
        window.setCallback(tiVar);
        Context context = this.s;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, p0);
        if (!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) {
            drawableE = null;
        } else {
            bj bjVarA = bj.a();
            synchronized (bjVarA) {
                drawableE = bjVarA.a.e(context, resourceId, true);
            }
        }
        if (drawableE != null) {
            window.setBackgroundDrawable(drawableE);
        }
        typedArrayObtainStyledAttributes.recycle();
        this.t = window;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.m0) != null) {
            return;
        }
        Object obj = this.r;
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.n0) != null) {
            si.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.n0 = null;
        }
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if (activity.getWindow() != null) {
                this.m0 = si.a(activity);
            } else {
                this.m0 = null;
            }
        } else {
            this.m0 = null;
        }
        L();
    }

    public final void t(int i, yi yiVar, hc2 hc2Var) {
        if (hc2Var == null) {
            if (yiVar == null && i >= 0) {
                yi[] yiVarArr = this.S;
                if (i < yiVarArr.length) {
                    yiVar = yiVarArr[i];
                }
            }
            if (yiVar != null) {
                hc2Var = yiVar.h;
            }
        }
        if ((yiVar == null || yiVar.m) && !this.X) {
            ti tiVar = this.u;
            Window.Callback callback = this.t.getCallback();
            tiVar.getClass();
            try {
                tiVar.l = true;
                callback.onPanelClosed(i, hc2Var);
            } finally {
                tiVar.l = false;
            }
        }
    }

    /* JADX WARN: Failed to analyze thrown exceptions
    java.util.ConcurrentModificationException
    	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1013)
    	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:967)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:130)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:178)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:178)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:178)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
     */
    public final void u(hc2 hc2Var) {
        g3 g3Var;
        if (this.R) {
            return;
        }
        this.R = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.y;
        actionBarOverlayLayout.k();
        ActionMenuView actionMenuView = ((o44) actionBarOverlayLayout.m).a.c;
        if (actionMenuView != null && (g3Var = actionMenuView.B) != null) {
            g3Var.g();
            d3 d3Var = g3Var.B;
            if (d3Var != null && d3Var.b()) {
                d3Var.i.dismiss();
            }
        }
        Window.Callback callback = this.t.getCallback();
        if (callback != null && !this.X) {
            callback.onPanelClosed(108, hc2Var);
        }
        this.R = false;
    }

    public final void v(yi yiVar, boolean z) {
        xi xiVar;
        ActionBarOverlayLayout actionBarOverlayLayout;
        g3 g3Var;
        if (z && yiVar.a == 0 && (actionBarOverlayLayout = this.y) != null) {
            actionBarOverlayLayout.k();
            ActionMenuView actionMenuView = ((o44) actionBarOverlayLayout.m).a.c;
            if (actionMenuView != null && (g3Var = actionMenuView.B) != null && g3Var.k()) {
                u(yiVar.h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.s.getSystemService("window");
        if (windowManager != null && yiVar.m && (xiVar = yiVar.e) != null) {
            windowManager.removeView(xiVar);
            if (z) {
                t(yiVar.a, yiVar, null);
            }
        }
        yiVar.k = false;
        yiVar.l = false;
        yiVar.m = false;
        yiVar.f = null;
        yiVar.n = true;
        if (this.T == yiVar) {
            this.T = null;
        }
        if (yiVar.a == 0) {
            L();
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x013f  */
    /* JADX WARN: Code duplicated, block: B:104:0x0146 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:21:0x003f  */
    /* JADX WARN: Code duplicated, block: B:23:0x004a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x004c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0050  */
    /* JADX WARN: Code duplicated, block: B:28:0x0056  */
    /* JADX WARN: Code duplicated, block: B:30:0x005e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0062  */
    /* JADX WARN: Code duplicated, block: B:35:0x006b  */
    /* JADX WARN: Code duplicated, block: B:38:0x006f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x007b  */
    /* JADX WARN: Code duplicated, block: B:46:0x0085  */
    /* JADX WARN: Code duplicated, block: B:78:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:80:0x0101  */
    /* JADX WARN: Code duplicated, block: B:91:0x011b  */
    /* JADX WARN: Code duplicated, block: B:95:0x0125  */
    /* JADX WARN: Code duplicated, block: B:97:0x0133  */
    /* JADX WARN: Code duplicated, block: B:99:0x0137  */
    public final boolean x(KeyEvent keyEvent) {
        View decorView;
        int keyCode;
        yi yiVarC;
        ActionBarOverlayLayout actionBarOverlayLayout;
        Context context;
        boolean z;
        boolean z2;
        boolean zJ;
        AudioManager audioManager;
        Toolbar toolbar;
        ActionMenuView actionMenuView;
        g3 g3Var;
        g3 g3Var2;
        g3 g3Var3;
        yi yiVarC2;
        Object obj = this.r;
        if ((!(obj instanceof zu1) && !(obj instanceof g7)) || (decorView = this.t.getDecorView()) == null || !av1.n(decorView, keyEvent)) {
            if (keyEvent.getKeyCode() == 82) {
                ti tiVar = this.u;
                Window.Callback callback = this.t.getCallback();
                tiVar.getClass();
                try {
                    tiVar.h = true;
                    boolean zDispatchKeyEvent = callback.dispatchKeyEvent(keyEvent);
                    tiVar.h = false;
                    if (!zDispatchKeyEvent) {
                        keyCode = keyEvent.getKeyCode();
                        if (keyEvent.getAction() == 0) {
                            if (keyCode != 4) {
                                this.U = (keyEvent.getFlags() & Uuid.SIZE_BITS) != 0;
                                return false;
                            }
                            if (keyCode == 82) {
                                if (keyEvent.getRepeatCount() == 0) {
                                    yiVarC2 = C(0);
                                    if (!yiVarC2.m) {
                                        J(yiVarC2, keyEvent);
                                        return true;
                                    }
                                }
                            }
                            return false;
                        }
                        if (keyCode != 4) {
                            if (keyCode == 82) {
                                if (this.B == null) {
                                    yiVarC = C(0);
                                    actionBarOverlayLayout = this.y;
                                    context = this.s;
                                    if (actionBarOverlayLayout != null) {
                                        actionBarOverlayLayout.k();
                                        toolbar = ((o44) actionBarOverlayLayout.m).a;
                                        if (toolbar.getVisibility() == 0 || (actionMenuView = toolbar.c) == null || !actionMenuView.A || ViewConfiguration.get(context).hasPermanentMenuKey()) {
                                            z = yiVarC.m;
                                            if (!z || yiVarC.l) {
                                                v(yiVarC, true);
                                                z2 = z;
                                            } else {
                                                if (yiVarC.k) {
                                                    if (yiVarC.o) {
                                                        yiVarC.k = false;
                                                        zJ = J(yiVarC, keyEvent);
                                                    } else {
                                                        zJ = true;
                                                    }
                                                    if (zJ) {
                                                        H(yiVarC, keyEvent);
                                                        z2 = true;
                                                    }
                                                }
                                                z2 = false;
                                            }
                                        } else {
                                            ActionBarOverlayLayout actionBarOverlayLayout2 = this.y;
                                            actionBarOverlayLayout2.k();
                                            ActionMenuView actionMenuView2 = ((o44) actionBarOverlayLayout2.m).a.c;
                                            if (actionMenuView2 == null || (g3Var2 = actionMenuView2.B) == null || !g3Var2.k()) {
                                                if (!this.X && J(yiVarC, keyEvent)) {
                                                    ActionBarOverlayLayout actionBarOverlayLayout3 = this.y;
                                                    actionBarOverlayLayout3.k();
                                                    ActionMenuView actionMenuView3 = ((o44) actionBarOverlayLayout3.m).a.c;
                                                    if (actionMenuView3 != null && (g3Var = actionMenuView3.B) != null && g3Var.l()) {
                                                        z2 = true;
                                                    }
                                                }
                                                z2 = false;
                                            } else {
                                                ActionBarOverlayLayout actionBarOverlayLayout4 = this.y;
                                                actionBarOverlayLayout4.k();
                                                ActionMenuView actionMenuView4 = ((o44) actionBarOverlayLayout4.m).a.c;
                                                if (actionMenuView4 == null || (g3Var3 = actionMenuView4.B) == null || !g3Var3.g()) {
                                                    z2 = false;
                                                } else {
                                                    z2 = true;
                                                }
                                            }
                                        }
                                    } else {
                                        z = yiVarC.m;
                                        if (z) {
                                        }
                                        v(yiVarC, true);
                                        z2 = z;
                                    }
                                    if (z2) {
                                        audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
                                        if (audioManager != null) {
                                            audioManager.playSoundEffect(0);
                                            return true;
                                        }
                                        Log.w("AppCompatDelegate", "Couldn't get audio manager");
                                        return true;
                                    }
                                }
                            }
                            return false;
                        }
                        if (G()) {
                            return false;
                        }
                    }
                } catch (Throwable th) {
                    tiVar.h = false;
                    throw th;
                }
            } else {
                keyCode = keyEvent.getKeyCode();
                if (keyEvent.getAction() == 0) {
                    if (keyCode != 4) {
                        this.U = (keyEvent.getFlags() & Uuid.SIZE_BITS) != 0;
                        return false;
                    }
                    if (keyCode == 82) {
                        if (keyEvent.getRepeatCount() == 0) {
                            yiVarC2 = C(0);
                            if (!yiVarC2.m) {
                                J(yiVarC2, keyEvent);
                                return true;
                            }
                        }
                    }
                    return false;
                }
                if (keyCode != 4) {
                    if (keyCode == 82) {
                        if (this.B == null) {
                            yiVarC = C(0);
                            actionBarOverlayLayout = this.y;
                            context = this.s;
                            if (actionBarOverlayLayout != null) {
                                actionBarOverlayLayout.k();
                                toolbar = ((o44) actionBarOverlayLayout.m).a;
                                if (toolbar.getVisibility() == 0) {
                                    z = yiVarC.m;
                                    if (z) {
                                    }
                                    v(yiVarC, true);
                                    z2 = z;
                                } else {
                                    z = yiVarC.m;
                                    if (z) {
                                    }
                                    v(yiVarC, true);
                                    z2 = z;
                                }
                            } else {
                                z = yiVarC.m;
                                if (z) {
                                }
                                v(yiVarC, true);
                                z2 = z;
                            }
                            if (z2) {
                                audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
                                if (audioManager != null) {
                                    audioManager.playSoundEffect(0);
                                    return true;
                                }
                                Log.w("AppCompatDelegate", "Couldn't get audio manager");
                                return true;
                            }
                        }
                    }
                    return false;
                }
                if (G()) {
                    return false;
                }
            }
        }
        return true;
    }

    public final void y(int i) {
        yi yiVarC = C(i);
        if (yiVarC.h != null) {
            Bundle bundle = new Bundle();
            yiVarC.h.t(bundle);
            if (bundle.size() > 0) {
                yiVarC.p = bundle;
            }
            yiVarC.h.w();
            yiVarC.h.clear();
        }
        yiVarC.o = true;
        yiVarC.n = true;
        if ((i == 108 || i == 0) && this.y != null) {
            yi yiVarC2 = C(0);
            yiVarC2.k = false;
            J(yiVarC2, null);
        }
    }

    public final void z() {
        ViewGroup viewGroup;
        if (this.G) {
            return;
        }
        Context context = this.s;
        int[] iArr = g23.j;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!typedArrayObtainStyledAttributes.hasValue(117)) {
            typedArrayObtainStyledAttributes.recycle();
            u41.r("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
            return;
        }
        int i = 0;
        int i2 = 1;
        if (typedArrayObtainStyledAttributes.getBoolean(126, false)) {
            j(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(117, false)) {
            j(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(118, false)) {
            j(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(119, false)) {
            j(10);
        }
        this.P = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        A();
        this.t.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        if (this.Q) {
            viewGroup = this.O ? (ViewGroup) layoutInflaterFrom.inflate(ai.notrack.app.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(ai.notrack.app.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.P) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(ai.notrack.app.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.N = false;
            this.M = false;
        } else if (this.M) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(ai.notrack.app.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new ro0(context, typedValue.resourceId) : context).inflate(ai.notrack.app.R.layout.abc_screen_toolbar, (ViewGroup) null);
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) viewGroup.findViewById(ai.notrack.app.R.id.decor_content_parent);
            this.y = actionBarOverlayLayout;
            actionBarOverlayLayout.setWindowCallback(this.t.getCallback());
            if (this.N) {
                this.y.g(109);
            }
            if (this.K) {
                this.y.g(2);
            }
            if (this.L) {
                this.y.g(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.M + ", windowActionBarOverlay: " + this.N + ", android:windowIsFloating: " + this.P + ", windowActionModeOverlay: " + this.O + ", windowNoTitle: " + this.Q + " }");
        }
        ni niVar = new ni(this, i);
        WeakHashMap weakHashMap = zc4.a;
        sc4.i(viewGroup, niVar);
        if (this.y == null) {
            this.I = (TextView) viewGroup.findViewById(ai.notrack.app.R.id.title);
        }
        boolean z = yd4.a;
        try {
            Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(viewGroup, null);
        } catch (IllegalAccessException e) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e2) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e2);
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(ai.notrack.app.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.t.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.t.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new ni(this, i2));
        this.H = viewGroup;
        Object obj = this.r;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.x;
        if (!TextUtils.isEmpty(title)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.y;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setWindowTitle(title);
            } else {
                zf4 zf4Var = this.v;
                if (zf4Var != null) {
                    o44 o44Var = (o44) zf4Var.e;
                    if (!o44Var.g) {
                        Toolbar toolbar = o44Var.a;
                        o44Var.h = title;
                        if ((o44Var.b & 8) != 0) {
                            toolbar.setTitle(title);
                            if (o44Var.g) {
                                zc4.i(toolbar.getRootView(), title);
                            }
                        }
                    }
                } else {
                    TextView textView = this.I;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.H.findViewById(R.id.content);
        View decorView = this.t.getDecorView();
        contentFrameLayout2.o.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        if (contentFrameLayout2.isLaidOut()) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(iArr);
        typedArrayObtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
        typedArrayObtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
        if (typedArrayObtainStyledAttributes2.hasValue(122)) {
            typedArrayObtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(123)) {
            typedArrayObtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(120)) {
            typedArrayObtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(121)) {
            typedArrayObtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.G = true;
        yi yiVarC = C(0);
        if (this.X || yiVarC.h != null) {
            return;
        }
        E(108);
    }
}
