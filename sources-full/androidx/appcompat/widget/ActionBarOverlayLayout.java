package androidx.appcompat.widget;

import ai.notrack.app.R;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import defpackage.g3;
import defpackage.h61;
import defpackage.hc2;
import defpackage.i44;
import defpackage.jg4;
import defpackage.js0;
import defpackage.lg4;
import defpackage.md2;
import defpackage.mg4;
import defpackage.ng4;
import defpackage.nk2;
import defpackage.o44;
import defpackage.ok2;
import defpackage.pp1;
import defpackage.qc4;
import defpackage.qd4;
import defpackage.sc4;
import defpackage.tg4;
import defpackage.u41;
import defpackage.v2;
import defpackage.w2;
import defpackage.wg4;
import defpackage.x2;
import defpackage.y2;
import defpackage.y64;
import defpackage.z2;
import defpackage.zc4;
import defpackage.zf4;
import java.util.WeakHashMap;
import kotlin.jvm.internal.IntCompanionObject;
import org.scilab.forge.jlatexmath.FontInfo;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements nk2, ok2 {
    public static final int[] K = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};
    public static final wg4 L;
    public static final Rect M;
    public wg4 A;
    public wg4 B;
    public x2 C;
    public OverScroller D;
    public ViewPropertyAnimator E;
    public final v2 F;
    public final w2 G;
    public final w2 H;
    public final h61 I;
    public final z2 J;
    public int c;
    public int d;
    public ContentFrameLayout h;
    public ActionBarContainer l;
    public js0 m;
    public Drawable n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public int s;
    public int t;
    public final Rect u;
    public final Rect v;
    public final Rect w;
    public final Rect x;
    public wg4 y;
    public wg4 z;

    static {
        ng4 lg4Var;
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            lg4Var = new mg4();
        } else {
            lg4Var = i >= 29 ? new lg4() : new jg4();
        }
        lg4Var.g(pp1.b(0, 1, 0, 1));
        L = lg4Var.b();
        M = new Rect();
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = 0;
        this.u = new Rect();
        this.v = new Rect();
        this.w = new Rect();
        this.x = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        wg4 wg4Var = wg4.b;
        this.y = wg4Var;
        this.z = wg4Var;
        this.A = wg4Var;
        this.B = wg4Var;
        this.F = new v2(this);
        this.G = new w2(this, 0);
        this.H = new w2(this, 1);
        f(context);
        this.I = new h61();
        z2 z2Var = new z2(context);
        z2Var.setWillNotDraw(true);
        this.J = z2Var;
        addView(z2Var);
    }

    public static boolean d(View view, Rect rect, boolean z) {
        boolean z2;
        y2 y2Var = (y2) view.getLayoutParams();
        int i = ((ViewGroup.MarginLayoutParams) y2Var).leftMargin;
        int i2 = rect.left;
        if (i != i2) {
            ((ViewGroup.MarginLayoutParams) y2Var).leftMargin = i2;
            z2 = true;
        } else {
            z2 = false;
        }
        int i3 = ((ViewGroup.MarginLayoutParams) y2Var).topMargin;
        int i4 = rect.top;
        if (i3 != i4) {
            ((ViewGroup.MarginLayoutParams) y2Var).topMargin = i4;
            z2 = true;
        }
        int i5 = ((ViewGroup.MarginLayoutParams) y2Var).rightMargin;
        int i6 = rect.right;
        if (i5 != i6) {
            ((ViewGroup.MarginLayoutParams) y2Var).rightMargin = i6;
            z2 = true;
        }
        if (z) {
            int i7 = ((ViewGroup.MarginLayoutParams) y2Var).bottomMargin;
            int i8 = rect.bottom;
            if (i7 != i8) {
                ((ViewGroup.MarginLayoutParams) y2Var).bottomMargin = i8;
                return true;
            }
        }
        return z2;
    }

    @Override // defpackage.nk2
    public final void a(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // defpackage.nk2
    public final void b(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // defpackage.nk2
    public final void c(int i, int i2, int[] iArr, int i3) {
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof y2;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int translationY;
        super.draw(canvas);
        if (this.n != null) {
            if (this.l.getVisibility() == 0) {
                translationY = (int) (this.l.getTranslationY() + this.l.getBottom() + 0.5f);
            } else {
                translationY = 0;
            }
            this.n.setBounds(0, translationY, getWidth(), this.n.getIntrinsicHeight() + translationY);
            this.n.draw(canvas);
        }
    }

    public final void e() {
        removeCallbacks(this.G);
        removeCallbacks(this.H);
        ViewPropertyAnimator viewPropertyAnimator = this.E;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void f(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(K);
        this.c = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.n = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.D = new OverScroller(context);
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    public final void g(int i) {
        k();
        if (i == 2) {
            ((o44) this.m).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i == 5) {
            ((o44) this.m).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else {
            if (i != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new y2(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new y2(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new y2(layoutParams);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.l;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        h61 h61Var = this.I;
        return h61Var.b | h61Var.a;
    }

    public CharSequence getTitle() {
        k();
        return ((o44) this.m).a.getTitle();
    }

    @Override // defpackage.ok2
    public final void h(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        i(view, i, i2, i3, i4, i5);
    }

    @Override // defpackage.nk2
    public final void i(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // defpackage.nk2
    public final boolean j(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    public final void k() {
        js0 wrapper;
        if (this.h == null) {
            this.h = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.l = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback callbackFindViewById = findViewById(R.id.action_bar);
            if (callbackFindViewById instanceof js0) {
                wrapper = (js0) callbackFindViewById;
            } else {
                if (!(callbackFindViewById instanceof Toolbar)) {
                    u41.r("Can't make a decor toolbar out of ".concat(callbackFindViewById.getClass().getSimpleName()));
                    return;
                }
                wrapper = ((Toolbar) callbackFindViewById).getWrapper();
            }
            this.m = wrapper;
        }
    }

    public final void l(Menu menu, md2 md2Var) {
        k();
        o44 o44Var = (o44) this.m;
        Toolbar toolbar = o44Var.a;
        if (o44Var.m == null) {
            o44Var.m = new g3(toolbar.getContext());
        }
        g3 g3Var = o44Var.m;
        g3Var.m = md2Var;
        hc2 hc2Var = (hc2) menu;
        if (hc2Var == null && toolbar.c == null) {
            return;
        }
        toolbar.f();
        hc2 hc2Var2 = toolbar.c.x;
        if (hc2Var2 == hc2Var) {
            return;
        }
        if (hc2Var2 != null) {
            hc2Var2.r(toolbar.S);
            hc2Var2.r(toolbar.T);
        }
        if (toolbar.T == null) {
            toolbar.T = new i44(toolbar);
        }
        g3Var.y = true;
        Context context = toolbar.r;
        if (hc2Var != null) {
            hc2Var.b(g3Var, context);
            hc2Var.b(toolbar.T, toolbar.r);
        } else {
            g3Var.h(context, null);
            toolbar.T.h(toolbar.r, null);
            g3Var.f();
            toolbar.T.f();
        }
        toolbar.c.setPopupTheme(toolbar.s);
        toolbar.c.setPresenter(g3Var);
        toolbar.S = g3Var;
        toolbar.t();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        k();
        wg4 wg4VarC = wg4.c(windowInsets, this);
        tg4 tg4Var = wg4VarC.a;
        boolean zD = d(this.l, new Rect(tg4Var.l().a, tg4Var.l().b, tg4Var.l().c, tg4Var.l().d), false);
        WeakHashMap weakHashMap = zc4.a;
        Rect rect = this.u;
        sc4.b(this, wg4VarC, rect);
        wg4 wg4VarN = tg4Var.n(rect.left, rect.top, rect.right, rect.bottom);
        this.y = wg4VarN;
        boolean z = true;
        if (!this.z.equals(wg4VarN)) {
            this.z = this.y;
            zD = true;
        }
        Rect rect2 = this.v;
        if (rect2.equals(rect)) {
            z = zD;
        } else {
            rect2.set(rect);
        }
        if (z) {
            requestLayout();
        }
        return tg4Var.a().a.c().a.b().b();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        f(getContext());
        WeakHashMap weakHashMap = zc4.a;
        qc4.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                y2 y2Var = (y2) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) y2Var).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) y2Var).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:24:0x00df  */
    /* JADX WARN: Code duplicated, block: B:25:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:27:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:28:0x00ef  */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int measuredHeight;
        wg4 wg4Var;
        int i3;
        ng4 jg4Var;
        k();
        measureChildWithMargins(this.l, i, 0, i2, 0);
        y2 y2Var = (y2) this.l.getLayoutParams();
        int iMax = Math.max(0, this.l.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) y2Var).leftMargin + ((ViewGroup.MarginLayoutParams) y2Var).rightMargin);
        int iMax2 = Math.max(0, this.l.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) y2Var).topMargin + ((ViewGroup.MarginLayoutParams) y2Var).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.l.getMeasuredState());
        WeakHashMap weakHashMap = zc4.a;
        boolean z = (getWindowSystemUiVisibility() & FontInfo.NUMBER_OF_CHAR_CODES) != 0;
        if (z) {
            measuredHeight = this.c;
            if (this.p && this.l.getTabContainer() != null) {
                measuredHeight += this.c;
            }
        } else {
            measuredHeight = this.l.getVisibility() != 8 ? this.l.getMeasuredHeight() : 0;
        }
        Rect rect = this.u;
        Rect rect2 = this.w;
        rect2.set(rect);
        this.A = this.y;
        if (this.o || z) {
            pp1 pp1VarB = pp1.b(this.A.a.l().a, this.A.a.l().b + measuredHeight, this.A.a.l().c, this.A.a.l().d);
            wg4Var = this.A;
            i3 = Build.VERSION.SDK_INT;
            if (i3 >= 30) {
                jg4Var = new mg4(wg4Var);
            } else if (i3 >= 29) {
                jg4Var = new lg4(wg4Var);
            } else {
                jg4Var = new jg4(wg4Var);
            }
            jg4Var.g(pp1VarB);
            this.A = jg4Var.b();
        } else {
            z2 z2Var = this.J;
            wg4 wg4Var2 = L;
            Rect rect3 = this.x;
            sc4.b(z2Var, wg4Var2, rect3);
            if (rect3.equals(M)) {
                pp1 pp1VarB2 = pp1.b(this.A.a.l().a, this.A.a.l().b + measuredHeight, this.A.a.l().c, this.A.a.l().d);
                wg4Var = this.A;
                i3 = Build.VERSION.SDK_INT;
                if (i3 >= 30) {
                    jg4Var = new mg4(wg4Var);
                } else if (i3 >= 29) {
                    jg4Var = new lg4(wg4Var);
                } else {
                    jg4Var = new jg4(wg4Var);
                }
                jg4Var.g(pp1VarB2);
                this.A = jg4Var.b();
            } else {
                rect2.top += measuredHeight;
                rect2.bottom = rect2.bottom;
                this.A = this.A.a.n(0, measuredHeight, 0, 0);
            }
        }
        d(this.h, rect2, true);
        if (!this.B.equals(this.A)) {
            wg4 wg4Var3 = this.A;
            this.B = wg4Var3;
            ContentFrameLayout contentFrameLayout = this.h;
            WindowInsets windowInsetsB = wg4Var3.b();
            if (windowInsetsB != null) {
                WindowInsets windowInsetsA = qc4.a(contentFrameLayout, windowInsetsB);
                if (!windowInsetsA.equals(windowInsetsB)) {
                    wg4.c(windowInsetsA, contentFrameLayout);
                }
            }
        }
        measureChildWithMargins(this.h, i, 0, i2, 0);
        y2 y2Var2 = (y2) this.h.getLayoutParams();
        int iMax3 = Math.max(iMax, this.h.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) y2Var2).leftMargin + ((ViewGroup.MarginLayoutParams) y2Var2).rightMargin);
        int iMax4 = Math.max(iMax2, this.h.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) y2Var2).topMargin + ((ViewGroup.MarginLayoutParams) y2Var2).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.h.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + iMax3, getSuggestedMinimumWidth()), i, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax4, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.q || !z) {
            return false;
        }
        this.D.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, IntCompanionObject.MAX_VALUE);
        if (this.D.getFinalY() > this.l.getHeight()) {
            e();
            this.H.run();
        } else {
            e();
            this.G.run();
        }
        this.r = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.s + i2;
        this.s = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        zf4 zf4Var;
        qd4 qd4Var;
        this.I.a = i;
        this.s = getActionBarHideOffset();
        e();
        x2 x2Var = this.C;
        if (x2Var == null || (qd4Var = (zf4Var = (zf4) x2Var).s) == null) {
            return;
        }
        qd4Var.a();
        zf4Var.s = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.l.getVisibility() != 0) {
            return false;
        }
        return this.q;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.q || this.r) {
            return;
        }
        if (this.s <= this.l.getHeight()) {
            e();
            postDelayed(this.G, 600L);
        } else {
            e();
            postDelayed(this.H, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        k();
        int i2 = this.t ^ i;
        this.t = i;
        boolean z = (i & 4) == 0;
        boolean z2 = (i & FontInfo.NUMBER_OF_CHAR_CODES) != 0;
        x2 x2Var = this.C;
        if (x2Var != null) {
            zf4 zf4Var = (zf4) x2Var;
            zf4Var.o = !z2;
            if (z || !z2) {
                if (zf4Var.p) {
                    zf4Var.p = false;
                    zf4Var.f(true);
                }
            } else if (!zf4Var.p) {
                zf4Var.p = true;
                zf4Var.f(true);
            }
        }
        if ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) == 0 || this.C == null) {
            return;
        }
        WeakHashMap weakHashMap = zc4.a;
        qc4.c(this);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.d = i;
        x2 x2Var = this.C;
        if (x2Var != null) {
            ((zf4) x2Var).n = i;
        }
    }

    public void setActionBarHideOffset(int i) {
        e();
        this.l.setTranslationY(-Math.max(0, Math.min(i, this.l.getHeight())));
    }

    public void setActionBarVisibilityCallback(x2 x2Var) {
        this.C = x2Var;
        if (getWindowToken() != null) {
            ((zf4) this.C).n = this.d;
            int i = this.t;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                WeakHashMap weakHashMap = zc4.a;
                qc4.c(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.p = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.q) {
            this.q = z;
            if (z) {
                return;
            }
            e();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i) {
        k();
        o44 o44Var = (o44) this.m;
        o44Var.d = i != 0 ? y64.y(o44Var.a.getContext(), i) : null;
        o44Var.c();
    }

    public void setIcon(Drawable drawable) {
        k();
        o44 o44Var = (o44) this.m;
        o44Var.d = drawable;
        o44Var.c();
    }

    public void setLogo(int i) {
        k();
        o44 o44Var = (o44) this.m;
        o44Var.e = i != 0 ? y64.y(o44Var.a.getContext(), i) : null;
        o44Var.c();
    }

    public void setOverlayMode(boolean z) {
        this.o = z;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    public void setWindowCallback(Window.Callback callback) {
        k();
        ((o44) this.m).k = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        k();
        o44 o44Var = (o44) this.m;
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

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
