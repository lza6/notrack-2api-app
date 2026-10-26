package defpackage;

import ai.notrack.app.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import app.template.extension.BuildConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class bd1 extends FrameLayout {
    public final ArrayList c;
    public final ArrayList d;
    public View.OnApplyWindowInsetsListener h;
    public boolean l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bd1(Context context, AttributeSet attributeSet, nd1 nd1Var) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.l = true;
        String classAttribute = attributeSet.getClassAttribute();
        int i = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f23.b, 0, 0);
        classAttribute = classAttribute == null ? typedArrayObtainStyledAttributes.getString(0) : classAttribute;
        String string = typedArrayObtainStyledAttributes.getString(1);
        typedArrayObtainStyledAttributes.recycle();
        int id = getId();
        xc1 xc1VarC = nd1Var.C(id);
        if (classAttribute != null && xc1VarC == null) {
            if (id == -1) {
                u41.r(fq2.n("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : BuildConfig.VERSION_NAME));
                throw null;
            }
            hd1 hd1VarH = nd1Var.H();
            context.getClassLoader();
            xc1 xc1VarA = hd1VarH.a(classAttribute);
            xc1VarA.getClass();
            xc1VarA.F = id;
            xc1VarA.G = id;
            xc1VarA.H = string;
            xc1VarA.B = nd1Var;
            zc1 zc1Var = nd1Var.w;
            xc1VarA.C = zc1Var;
            xc1VarA.M = true;
            if ((zc1Var == null ? null : zc1Var.u) != null) {
                xc1VarA.M = true;
            }
            er erVar = new er(nd1Var);
            erVar.o = true;
            xc1VarA.N = this;
            xc1VarA.x = true;
            erVar.f(getId(), xc1VarA, string);
            if (erVar.g) {
                u41.r("This transaction is already being added to the back stack");
                throw null;
            }
            nd1 nd1Var2 = erVar.q;
            if (nd1Var2.w != null && !nd1Var2.J) {
                nd1Var2.z(true);
                er erVar2 = nd1Var2.h;
                if (erVar2 != null) {
                    erVar2.r = false;
                    erVar2.d();
                    if (nd1.K(3)) {
                        Log.d("FragmentManager", "Reversing mTransitioningOp " + nd1Var2.h + " as part of execSingleAction for action " + erVar);
                    }
                    nd1Var2.h.e(false, false);
                    nd1Var2.h.a(nd1Var2.L, nd1Var2.M);
                    ArrayList arrayList = nd1Var2.h.a;
                    int size = arrayList.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj = arrayList.get(i2);
                        i2++;
                        xc1 xc1Var = ((xd1) obj).b;
                        if (xc1Var != null) {
                            xc1Var.u = false;
                        }
                    }
                    nd1Var2.h = null;
                }
                erVar.a(nd1Var2.L, nd1Var2.M);
                nd1Var2.b = true;
                try {
                    nd1Var2.W(nd1Var2.L, nd1Var2.M);
                    nd1Var2.d();
                    nd1Var2.h0();
                    nd1Var2.v();
                    ((HashMap) nd1Var2.c.d).values().removeAll(Collections.singleton(null));
                } catch (Throwable th) {
                    nd1Var2.d();
                    throw th;
                }
            }
        }
        ArrayList arrayListR = nd1Var.c.R();
        int size2 = arrayListR.size();
        while (i < size2) {
            Object obj2 = arrayListR.get(i);
            i++;
            int i3 = ((ud1) obj2).c.G;
            getId();
        }
    }

    public final void a(View view) {
        if (this.d.contains(view)) {
            this.c.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof xc1 ? (xc1) tag : null) != null) {
            super.addView(view, i, layoutParams);
        } else {
            u41.i(view, " is not associated with a Fragment.", "Views added to a FragmentContainerView must be associated with a Fragment. View ");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        wg4 wg4VarC;
        windowInsets.getClass();
        wg4 wg4VarC2 = wg4.c(windowInsets, null);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.h;
        if (onApplyWindowInsetsListener != null) {
            WindowInsets windowInsetsOnApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
            windowInsetsOnApplyWindowInsets.getClass();
            wg4VarC = wg4.c(windowInsetsOnApplyWindowInsets, null);
        } else {
            WeakHashMap weakHashMap = zc4.a;
            WindowInsets windowInsetsB = wg4VarC2.b();
            if (windowInsetsB != null) {
                WindowInsets windowInsetsB2 = qc4.b(this, windowInsetsB);
                if (!windowInsetsB2.equals(windowInsetsB)) {
                    wg4VarC2 = wg4.c(windowInsetsB2, this);
                }
            }
            wg4VarC = wg4VarC2;
        }
        if (!wg4VarC.a.o()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                WeakHashMap weakHashMap2 = zc4.a;
                WindowInsets windowInsetsB3 = wg4VarC.b();
                if (windowInsetsB3 != null) {
                    WindowInsets windowInsetsA = qc4.a(childAt, windowInsetsB3);
                    if (!windowInsetsA.equals(windowInsetsB3)) {
                        wg4.c(windowInsetsA, childAt);
                    }
                }
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.getClass();
        if (this.l) {
            ArrayList arrayList = this.c;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                super.drawChild(canvas, (View) obj, getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        canvas.getClass();
        view.getClass();
        if (this.l) {
            ArrayList arrayList = this.c;
            if (!arrayList.isEmpty() && arrayList.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        view.getClass();
        this.d.remove(view);
        if (this.c.remove(view)) {
            this.l = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends xc1> F getFragment() {
        xc1 xc1Var;
        zh zhVar;
        nd1 nd1VarI;
        View view = this;
        while (true) {
            if (view == null) {
                xc1Var = null;
                break;
            }
            Object tag = view.getTag(R.id.fragment_container_view_tag);
            xc1Var = tag instanceof xc1 ? (xc1) tag : null;
            if (xc1Var != null) {
                break;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        if (xc1Var == null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    zhVar = null;
                    break;
                }
                if (context instanceof zh) {
                    zhVar = (zh) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (zhVar == null) {
                m51.j(this, " is not within a subclass of FragmentActivity.", "View ");
                return null;
            }
            nd1VarI = ((zc1) zhVar.C.c).x;
        } else {
            if (!xc1Var.p()) {
                throw new IllegalStateException("The Fragment " + xc1Var + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
            nd1VarI = xc1Var.i();
        }
        return (F) nd1VarI.C(getId());
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        windowInsets.getClass();
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                super.removeAllViewsInLayout();
                return;
            } else {
                View childAt = getChildAt(childCount);
                childAt.getClass();
                a(childAt);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        view.getClass();
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        View childAt = getChildAt(i);
        childAt.getClass();
        a(childAt);
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        view.getClass();
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            childAt.getClass();
            a(childAt);
        }
        super.removeViews(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            childAt.getClass();
            a(childAt);
        }
        super.removeViewsInLayout(i, i2);
    }

    public final void setDrawDisappearingViewsLast(boolean z) {
        this.l = z;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        onApplyWindowInsetsListener.getClass();
        this.h = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        view.getClass();
        if (view.getParent() == this) {
            this.d.add(view);
        }
        super.startViewTransition(view);
    }
}
