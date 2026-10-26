package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;

/* JADX INFO: loaded from: classes.dex */
public final class vp3 {
    public CharSequence A;
    public CharSequence B;
    public final /* synthetic */ wp3 E;
    public final Menu a;
    public boolean h;
    public int i;
    public int j;
    public CharSequence k;
    public CharSequence l;
    public int m;
    public char n;
    public int o;
    public char p;
    public int q;
    public int r;
    public boolean s;
    public boolean t;
    public boolean u;
    public int v;
    public int w;
    public String x;
    public String y;
    public nc2 z;
    public ColorStateList C = null;
    public PorterDuff.Mode D = null;
    public int b = 0;
    public int c = 0;
    public int d = 0;
    public int e = 0;
    public boolean f = true;
    public boolean g = true;

    public vp3(wp3 wp3Var, Menu menu) {
        this.E = wp3Var;
        this.a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.E.c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e);
            return null;
        }
    }

    public final void b(MenuItem menuItem) {
        wp3 wp3Var = this.E;
        Context context = wp3Var.c;
        boolean z = false;
        menuItem.setChecked(this.s).setVisible(this.t).setEnabled(this.u).setCheckable(this.r >= 1).setTitleCondensed(this.l).setIcon(this.m);
        int i = this.v;
        if (i >= 0) {
            menuItem.setShowAsAction(i);
        }
        if (this.y != null) {
            if (context.isRestricted()) {
                u41.r("The android:onClick attribute cannot be used within a restricted context");
                return;
            }
            if (wp3Var.d == null) {
                wp3Var.d = wp3.a(context);
            }
            Object obj = wp3Var.d;
            String str = this.y;
            up3 up3Var = new up3();
            up3Var.b = obj;
            Class<?> cls = obj.getClass();
            try {
                up3Var.c = cls.getMethod(str, up3.d);
                menuItem.setOnMenuItemClickListener(up3Var);
            } catch (Exception e) {
                StringBuilder sbS = fq2.s("Couldn't resolve menu item onClick handler ", str, " in class ");
                sbS.append(cls.getName());
                InflateException inflateException = new InflateException(sbS.toString());
                inflateException.initCause(e);
                throw inflateException;
            }
        }
        if (this.r >= 2) {
            if (menuItem instanceof mc2) {
                mc2 mc2Var = (mc2) menuItem;
                mc2Var.x = (mc2Var.x & (-5)) | 4;
            } else if (menuItem instanceof qc2) {
                qc2 qc2Var = (qc2) menuItem;
                xp3 xp3Var = qc2Var.c;
                try {
                    if (qc2Var.d == null) {
                        qc2Var.d = xp3Var.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    qc2Var.d.invoke(xp3Var, Boolean.TRUE);
                } catch (Exception e2) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e2);
                }
            }
        }
        String str2 = this.x;
        if (str2 != null) {
            menuItem.setActionView((View) a(str2, wp3.e, wp3Var.a));
            z = true;
        }
        int i2 = this.w;
        if (i2 > 0) {
            if (z) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i2);
            }
        }
        nc2 nc2Var = this.z;
        if (nc2Var != null) {
            if (menuItem instanceof xp3) {
                ((xp3) menuItem).a(nc2Var);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.A;
        boolean z2 = menuItem instanceof xp3;
        if (z2) {
            ((xp3) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            df0.l(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.B;
        if (z2) {
            ((xp3) menuItem).setTooltipText(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            df0.t(menuItem, charSequence2);
        }
        char c = this.n;
        int i3 = this.o;
        if (z2) {
            ((xp3) menuItem).setAlphabeticShortcut(c, i3);
        } else if (Build.VERSION.SDK_INT >= 26) {
            df0.j(menuItem, c, i3);
        }
        char c2 = this.p;
        int i4 = this.q;
        if (z2) {
            ((xp3) menuItem).setNumericShortcut(c2, i4);
        } else if (Build.VERSION.SDK_INT >= 26) {
            df0.p(menuItem, c2, i4);
        }
        PorterDuff.Mode mode = this.D;
        if (mode != null) {
            if (z2) {
                ((xp3) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                df0.o(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.C;
        if (colorStateList != null) {
            if (z2) {
                ((xp3) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                df0.n(menuItem, colorStateList);
            }
        }
    }
}
