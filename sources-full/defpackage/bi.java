package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import java.net.Proxy;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class bi {
    public int a;
    public final Object b;
    public final Object c;
    public Object d;
    public Object e;
    public Object f;

    public bi(View view) {
        this.a = -1;
        this.b = view;
        this.c = bj.a();
    }

    public bi(o4 o4Var, sz0 sz0Var, y23 y23Var) {
        List listK;
        sz0Var.getClass();
        this.b = o4Var;
        this.c = sz0Var;
        z21 z21Var = z21.c;
        this.d = z21Var;
        this.e = z21Var;
        this.f = new ArrayList();
        tk1 tk1Var = o4Var.h;
        tk1Var.getClass();
        URI uriG = tk1Var.g();
        if (uriG.getHost() == null) {
            listK = ka4.k(Proxy.NO_PROXY);
        } else {
            List<Proxy> listSelect = o4Var.g.select(uriG);
            listK = (listSelect == null || listSelect.isEmpty()) ? ka4.k(Proxy.NO_PROXY) : ka4.w(listSelect);
        }
        this.d = listK;
        this.a = 0;
    }

    public void a() {
        View view = (View) this.b;
        Drawable background = view.getBackground();
        if (background != null) {
            if (((ol0) this.d) != null) {
                if (((ol0) this.f) == null) {
                    this.f = new ol0();
                }
                ol0 ol0Var = (ol0) this.f;
                ol0Var.c = null;
                ol0Var.b = false;
                ol0Var.d = null;
                ol0Var.a = false;
                WeakHashMap weakHashMap = zc4.a;
                ColorStateList colorStateListC = sc4.c(view);
                if (colorStateListC != null) {
                    ol0Var.b = true;
                    ol0Var.c = colorStateListC;
                }
                PorterDuff.Mode modeD = sc4.d(view);
                if (modeD != null) {
                    ol0Var.a = true;
                    ol0Var.d = modeD;
                }
                if (ol0Var.b || ol0Var.a) {
                    bj.d(background, ol0Var, view.getDrawableState());
                    return;
                }
            }
            ol0 ol0Var2 = (ol0) this.e;
            if (ol0Var2 != null) {
                bj.d(background, ol0Var2, view.getDrawableState());
                return;
            }
            ol0 ol0Var3 = (ol0) this.d;
            if (ol0Var3 != null) {
                bj.d(background, ol0Var3, view.getDrawableState());
            }
        }
    }

    public ColorStateList b() {
        ol0 ol0Var = (ol0) this.e;
        if (ol0Var != null) {
            return (ColorStateList) ol0Var.c;
        }
        return null;
    }

    public PorterDuff.Mode c() {
        ol0 ol0Var = (ol0) this.e;
        if (ol0Var != null) {
            return (PorterDuff.Mode) ol0Var.d;
        }
        return null;
    }

    public boolean d() {
        return this.a < ((List) this.d).size() || !((ArrayList) this.f).isEmpty();
    }

    public void e(AttributeSet attributeSet, int i) {
        ColorStateList colorStateListG;
        View view = (View) this.b;
        Context context = view.getContext();
        int[] iArr = g23.y;
        iy2 iy2VarL = iy2.l(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) iy2VarL.h;
        View view2 = (View) this.b;
        zc4.g(view2, view2.getContext(), iArr, attributeSet, (TypedArray) iy2VarL.h, i);
        try {
            if (typedArray.hasValue(0)) {
                this.a = typedArray.getResourceId(0, -1);
                bj bjVar = (bj) this.c;
                Context context2 = view.getContext();
                int i2 = this.a;
                synchronized (bjVar) {
                    colorStateListG = bjVar.a.g(context2, i2);
                }
                if (colorStateListG != null) {
                    h(colorStateListG);
                }
            }
            if (typedArray.hasValue(1)) {
                sc4.e(view, iy2VarL.d(1));
            }
            if (typedArray.hasValue(2)) {
                sc4.f(view, b01.b(typedArray.getInt(2, -1), null));
            }
            iy2VarL.n();
        } catch (Throwable th) {
            iy2VarL.n();
            throw th;
        }
    }

    public void f() {
        this.a = -1;
        h(null);
        a();
    }

    public void g(int i) {
        ColorStateList colorStateListG;
        this.a = i;
        bj bjVar = (bj) this.c;
        if (bjVar != null) {
            Context context = ((View) this.b).getContext();
            synchronized (bjVar) {
                colorStateListG = bjVar.a.g(context, i);
            }
        } else {
            colorStateListG = null;
        }
        h(colorStateListG);
        a();
    }

    public void h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((ol0) this.d) == null) {
                this.d = new ol0();
            }
            ol0 ol0Var = (ol0) this.d;
            ol0Var.c = colorStateList;
            ol0Var.b = true;
        } else {
            this.d = null;
        }
        a();
    }

    public void i(ColorStateList colorStateList) {
        if (((ol0) this.e) == null) {
            this.e = new ol0();
        }
        ol0 ol0Var = (ol0) this.e;
        ol0Var.c = colorStateList;
        ol0Var.b = true;
        a();
    }

    public void j(PorterDuff.Mode mode) {
        if (((ol0) this.e) == null) {
            this.e = new ol0();
        }
        ol0 ol0Var = (ol0) this.e;
        ol0Var.d = mode;
        ol0Var.a = true;
        a();
    }
}
