package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class j62 implements mh3 {
    public static final Method H;
    public static final Method I;
    public final Handler C;
    public Rect E;
    public boolean F;
    public final jj G;
    public final Context c;
    public ListAdapter d;
    public p01 h;
    public int n;
    public int o;
    public boolean q;
    public boolean r;
    public boolean s;
    public g62 v;
    public View w;
    public AdapterView.OnItemClickListener x;
    public final int l = -2;
    public int m = -2;
    public final int p = 1002;
    public int t = 0;
    public final int u = IntCompanionObject.MAX_VALUE;
    public final f62 y = new f62(this, 1);
    public final i62 z = new i62(this);
    public final h62 A = new h62(this);
    public final f62 B = new f62(this, 0);
    public final Rect D = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                H = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                I = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public j62(Context context, AttributeSet attributeSet, int i) {
        int resourceId;
        this.c = context;
        this.C = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g23.o, i, 0);
        this.n = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.o = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.q = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        jj jjVar = new jj(context, attributeSet, i, 0);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, g23.s, i, 0);
        if (typedArrayObtainStyledAttributes2.hasValue(2)) {
            jjVar.setOverlapAnchor(typedArrayObtainStyledAttributes2.getBoolean(2, false));
        }
        jjVar.setBackgroundDrawable((!typedArrayObtainStyledAttributes2.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes2.getDrawable(0) : y64.y(context, resourceId));
        typedArrayObtainStyledAttributes2.recycle();
        this.G = jjVar;
        jjVar.setInputMethodMode(1);
    }

    @Override // defpackage.mh3
    public final boolean a() {
        return this.G.isShowing();
    }

    public final int b() {
        return this.n;
    }

    public final Drawable c() {
        return this.G.getBackground();
    }

    @Override // defpackage.mh3
    public final void dismiss() {
        jj jjVar = this.G;
        jjVar.dismiss();
        jjVar.setContentView(null);
        this.h = null;
        this.C.removeCallbacks(this.y);
    }

    public final void e(Drawable drawable) {
        this.G.setBackgroundDrawable(drawable);
    }

    @Override // defpackage.mh3
    public final p01 g() {
        return this.h;
    }

    public final void i(int i) {
        this.o = i;
        this.q = true;
    }

    public final void k(int i) {
        this.n = i;
    }

    public final int m() {
        if (this.q) {
            return this.o;
        }
        return 0;
    }

    public void o(ListAdapter listAdapter) {
        g62 g62Var = this.v;
        if (g62Var == null) {
            this.v = new g62(this);
        } else {
            ListAdapter listAdapter2 = this.d;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(g62Var);
            }
        }
        this.d = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.v);
        }
        p01 p01Var = this.h;
        if (p01Var != null) {
            p01Var.setAdapter(this.d);
        }
    }

    public p01 p(Context context, boolean z) {
        return new p01(context, z);
    }

    public final void q(int i) {
        Drawable background = this.G.getBackground();
        if (background == null) {
            this.m = i;
            return;
        }
        Rect rect = this.D;
        background.getPadding(rect);
        this.m = rect.left + rect.right + i;
    }

    @Override // defpackage.mh3
    public final void show() {
        int i;
        int iMakeMeasureSpec;
        int paddingBottom;
        p01 p01Var;
        p01 p01Var2 = this.h;
        Context context = this.c;
        jj jjVar = this.G;
        if (p01Var2 == null) {
            p01 p01VarP = p(context, !this.F);
            this.h = p01VarP;
            p01VarP.setAdapter(this.d);
            this.h.setOnItemClickListener(this.x);
            this.h.setFocusable(true);
            this.h.setFocusableInTouchMode(true);
            this.h.setOnItemSelectedListener(new c62(this));
            this.h.setOnScrollListener(this.A);
            jjVar.setContentView(this.h);
        }
        Drawable background = jjVar.getBackground();
        Rect rect = this.D;
        if (background != null) {
            background.getPadding(rect);
            int i2 = rect.top;
            i = rect.bottom + i2;
            if (!this.q) {
                this.o = -i2;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        int iA = d62.a(jjVar, this.w, this.o, jjVar.getInputMethodMode() == 2);
        int i3 = this.l;
        if (i3 == -1) {
            paddingBottom = iA + i;
        } else {
            int i4 = this.m;
            if (i4 != -2) {
                iMakeMeasureSpec = i4 != -1 ? View.MeasureSpec.makeMeasureSpec(i4, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824);
            } else {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE);
            }
            int iA2 = this.h.a(iMakeMeasureSpec, iA);
            paddingBottom = iA2 + (iA2 > 0 ? this.h.getPaddingBottom() + this.h.getPaddingTop() + i : 0);
        }
        boolean z = jjVar.getInputMethodMode() == 2;
        jjVar.setWindowLayoutType(this.p);
        if (jjVar.isShowing()) {
            if (this.w.isAttachedToWindow()) {
                int width = this.m;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.w.getWidth();
                }
                if (i3 == -1) {
                    i3 = z ? paddingBottom : -1;
                    int i5 = this.m;
                    if (z) {
                        jjVar.setWidth(i5 == -1 ? -1 : 0);
                        jjVar.setHeight(0);
                    } else {
                        jjVar.setWidth(i5 == -1 ? -1 : 0);
                        jjVar.setHeight(-1);
                    }
                } else if (i3 == -2) {
                    i3 = paddingBottom;
                }
                jjVar.setOutsideTouchable(true);
                int i6 = width;
                View view = this.w;
                int i7 = this.n;
                int i8 = this.o;
                int i9 = i6 < 0 ? -1 : i6;
                if (i3 < 0) {
                    i3 = -1;
                }
                jjVar.update(view, i7, i8, i9, i3);
                return;
            }
            return;
        }
        int width2 = this.m;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.w.getWidth();
        }
        if (i3 == -1) {
            i3 = -1;
        } else if (i3 == -2) {
            i3 = paddingBottom;
        }
        jjVar.setWidth(width2);
        jjVar.setHeight(i3);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = H;
            if (method != null) {
                try {
                    method.invoke(jjVar, Boolean.TRUE);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            e62.b(jjVar, true);
        }
        jjVar.setOutsideTouchable(true);
        jjVar.setTouchInterceptor(this.z);
        if (this.s) {
            jjVar.setOverlapAnchor(this.r);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = I;
            if (method2 != null) {
                try {
                    method2.invoke(jjVar, this.E);
                } catch (Exception e) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                }
            }
        } else {
            e62.a(jjVar, this.E);
        }
        jjVar.showAsDropDown(this.w, this.n, this.o, this.t);
        this.h.setSelection(-1);
        if ((!this.F || this.h.isInTouchMode()) && (p01Var = this.h) != null) {
            p01Var.setListSelectionHidden(true);
            p01Var.requestLayout();
        }
        if (this.F) {
            return;
        }
        this.C.post(this.B);
    }
}
