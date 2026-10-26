package androidx.core.widget;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.InputDevice;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import defpackage.ad4;
import defpackage.e11;
import defpackage.gc4;
import defpackage.h61;
import defpackage.hc4;
import defpackage.jk2;
import defpackage.kk2;
import defpackage.lk2;
import defpackage.m1;
import defpackage.mk2;
import defpackage.ok2;
import defpackage.oy;
import defpackage.p11;
import defpackage.p23;
import defpackage.sc4;
import defpackage.sz0;
import defpackage.u41;
import defpackage.yv0;
import defpackage.zc4;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import kotlin.KotlinVersion;
import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements ok2 {
    public static final float J = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final jk2 K = new jk2();
    public static final int[] L = {R.attr.fillViewport};
    public final int[] A;
    public final int[] B;
    public int C;
    public int D;
    public lk2 E;
    public final h61 F;
    public final mk2 G;
    public float H;
    public final yv0 I;
    public final float c;
    public long d;
    public final Rect h;
    public final OverScroller l;
    public final EdgeEffect m;
    public final EdgeEffect n;
    public int o;
    public boolean p;
    public boolean q;
    public View r;
    public boolean s;
    public VelocityTracker t;
    public boolean u;
    public boolean v;
    public final int w;
    public final int x;
    public final int y;
    public int z;

    public NestedScrollView(Context context) {
        this(context, null);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ai.notrack.app.R.attr.nestedScrollViewStyle);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.h = new Rect();
        this.p = true;
        this.q = false;
        this.r = null;
        this.s = false;
        this.v = true;
        this.z = -1;
        this.A = new int[2];
        this.B = new int[2];
        this.I = new yv0(getContext(), new sz0(this));
        int i2 = Build.VERSION.SDK_INT;
        this.m = i2 >= 31 ? e11.a(context, attributeSet) : new EdgeEffect(context);
        this.n = i2 >= 31 ? e11.a(context, attributeSet) : new EdgeEffect(context);
        this.c = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.l = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.w = viewConfiguration.getScaledTouchSlop();
        this.x = viewConfiguration.getScaledMinimumFlingVelocity();
        this.y = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, L, i, 0);
        setFillViewport(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        this.F = new h61();
        this.G = new mk2(this);
        setNestedScrollingEnabled(true);
        zc4.h(this, K);
    }

    public static boolean m(View view, NestedScrollView nestedScrollView) {
        if (view == nestedScrollView) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && m((View) parent, nestedScrollView);
    }

    @Override // defpackage.nk2
    public final void a(View view, View view2, int i, int i2) {
        h61 h61Var = this.F;
        if (i2 == 1) {
            h61Var.b = i;
        } else {
            h61Var.a = i;
        }
        w(i2);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
        } else {
            u41.r("ScrollView can host only one direct child");
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
        } else {
            u41.r("ScrollView can host only one direct child");
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
        } else {
            u41.r("ScrollView can host only one direct child");
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
        } else {
            u41.r("ScrollView can host only one direct child");
        }
    }

    @Override // defpackage.nk2
    public final void b(View view, int i) {
        h61 h61Var = this.F;
        if (i == 1) {
            h61Var.b = 0;
        } else {
            h61Var.a = 0;
        }
        y(i);
    }

    @Override // defpackage.nk2
    public final void c(int i, int i2, int[] iArr, int i3) {
        f(i, i2, iArr, i3);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0079  */
    /* JADX WARN: Code duplicated, block: B:23:0x0086  */
    /* JADX WARN: Code duplicated, block: B:25:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:32:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:35:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e4  */
    @Override // android.view.View
    public final void computeScroll() {
        int iRound;
        int[] iArr;
        int i;
        int scrollRange;
        int overScrollMode;
        OverScroller overScroller = this.l;
        if (overScroller.isFinished()) {
            return;
        }
        overScroller.computeScrollOffset();
        int currY = overScroller.getCurrY();
        int i2 = currY - this.D;
        int height = getHeight();
        EdgeEffect edgeEffect = this.m;
        EdgeEffect edgeEffect2 = this.n;
        if (i2 <= 0 || p23.z(edgeEffect) == 0.0f) {
            if (i2 < 0 && p23.z(edgeEffect2) != 0.0f) {
                float f = height;
                iRound = Math.round(p23.P(edgeEffect2, (i2 * 4.0f) / f, 0.5f) * (f / 4.0f));
                if (iRound != i2) {
                    edgeEffect2.finish();
                }
            }
            this.D = currY;
            iArr = this.B;
            iArr[1] = 0;
            f(0, i2, iArr, 1);
            i = i2 - iArr[1];
            scrollRange = getScrollRange();
            if (oy.a()) {
                p11.a(this, Math.abs(overScroller.getCurrVelocity()));
            }
            if (i != 0) {
                int scrollY = getScrollY();
                q(i, getScrollX(), scrollY, scrollRange);
                int scrollY2 = getScrollY() - scrollY;
                int i3 = i - scrollY2;
                iArr[1] = 0;
                this.G.d(0, scrollY2, 0, i3, this.A, 1, iArr);
                i = i3 - iArr[1];
            }
            if (i != 0) {
                overScrollMode = getOverScrollMode();
                if (overScrollMode != 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    if (i < 0) {
                        if (edgeEffect.isFinished()) {
                            edgeEffect.onAbsorb((int) overScroller.getCurrVelocity());
                        }
                    } else if (edgeEffect2.isFinished()) {
                        edgeEffect2.onAbsorb((int) overScroller.getCurrVelocity());
                    }
                }
                overScroller.abortAnimation();
                y(1);
            }
            if (overScroller.isFinished()) {
                y(1);
            } else {
                postInvalidateOnAnimation();
            }
        }
        iRound = Math.round(p23.P(edgeEffect, ((-i2) * 4.0f) / height, 0.5f) * ((-height) / 4.0f));
        if (iRound != i2) {
            edgeEffect.finish();
        }
        i2 -= iRound;
        this.D = currY;
        iArr = this.B;
        iArr[1] = 0;
        f(0, i2, iArr, 1);
        i = i2 - iArr[1];
        scrollRange = getScrollRange();
        if (oy.a()) {
            p11.a(this, Math.abs(overScroller.getCurrVelocity()));
        }
        if (i != 0) {
            int scrollY3 = getScrollY();
            q(i, getScrollX(), scrollY3, scrollRange);
            int scrollY4 = getScrollY() - scrollY3;
            int i4 = i - scrollY4;
            iArr[1] = 0;
            this.G.d(0, scrollY4, 0, i4, this.A, 1, iArr);
            i = i4 - iArr[1];
        }
        if (i != 0) {
            overScrollMode = getOverScrollMode();
            if (overScrollMode != 0) {
                if (i < 0) {
                    if (edgeEffect.isFinished()) {
                        edgeEffect.onAbsorb((int) overScroller.getCurrVelocity());
                    }
                } else if (edgeEffect2.isFinished()) {
                    edgeEffect2.onAbsorb((int) overScroller.getCurrVelocity());
                }
            } else if (i < 0) {
                if (edgeEffect.isFinished()) {
                    edgeEffect.onAbsorb((int) overScroller.getCurrVelocity());
                }
            } else if (edgeEffect2.isFinished()) {
                edgeEffect2.onAbsorb((int) overScroller.getCurrVelocity());
            }
            overScroller.abortAnimation();
            y(1);
        }
        if (overScroller.isFinished()) {
            postInvalidateOnAnimation();
        } else {
            y(1);
        }
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int iMax = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        return scrollY > iMax ? (scrollY - iMax) + bottom : bottom;
    }

    public final boolean d(int i) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus == null || !n(viewFindNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            t(maxScrollAmount, 0, 1, true);
        } else {
            Rect rect = this.h;
            viewFindNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(viewFindNextFocus, rect);
            t(e(rect), 0, 1, true);
            viewFindNextFocus.requestFocus(i);
        }
        if (viewFindFocus != null && viewFindFocus.isFocused() && !n(viewFindFocus, 0, getHeight())) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || g(keyEvent);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.G.a(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.G.b(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.G.c(i, i2, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.G.d(i, i2, i3, i4, iArr, 0, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.m;
        int paddingLeft2 = 0;
        if (!edgeEffect.isFinished()) {
            int iSave = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int iMin = Math.min(0, scrollY);
            if (getClipToPadding()) {
                width -= getPaddingRight() + getPaddingLeft();
                paddingLeft = getPaddingLeft();
            } else {
                paddingLeft = 0;
            }
            if (getClipToPadding()) {
                height -= getPaddingBottom() + getPaddingTop();
                iMin += getPaddingTop();
            }
            canvas.translate(paddingLeft, iMin);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect2 = this.n;
        if (edgeEffect2.isFinished()) {
            return;
        }
        int iSave2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int iMax = Math.max(getScrollRange(), scrollY) + height2;
        if (getClipToPadding()) {
            width2 -= getPaddingRight() + getPaddingLeft();
            paddingLeft2 = getPaddingLeft();
        }
        if (getClipToPadding()) {
            height2 -= getPaddingBottom() + getPaddingTop();
            iMax -= getPaddingBottom();
        }
        canvas.translate(paddingLeft2 - width2, iMax);
        canvas.rotate(180.0f, width2, 0.0f);
        edgeEffect2.setSize(width2, height2);
        if (edgeEffect2.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(iSave2);
    }

    public final int e(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i2 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i - verticalFadingEdgeLength : i;
        int i3 = rect.bottom;
        if (i3 > i2 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i2, (childAt.getBottom() + layoutParams.bottomMargin) - i);
        }
        if (rect.top >= scrollY || i3 >= i2) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i2 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    public final void f(int i, int i2, int[] iArr, int i3) {
        this.G.c(i, i2, i3, iArr, null);
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0098  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ab  */
    public final boolean g(KeyEvent keyEvent) {
        View viewFindFocus;
        View viewFindNextFocus;
        this.h.setEmpty();
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                if (keyEvent.getAction() == 0) {
                    int keyCode = keyEvent.getKeyCode();
                    if (keyCode == 19) {
                        return keyEvent.isAltPressed() ? l(33) : d(33);
                    }
                    if (keyCode == 20) {
                        return keyEvent.isAltPressed() ? l(130) : d(130);
                    }
                    if (keyCode == 62) {
                        r(keyEvent.isShiftPressed() ? 33 : 130);
                        return false;
                    }
                    if (keyCode == 92) {
                        return l(33);
                    }
                    if (keyCode == 93) {
                        return l(130);
                    }
                    if (keyCode == 122) {
                        r(33);
                        return false;
                    }
                    if (keyCode == 123) {
                        r(130);
                        return false;
                    }
                }
            } else if (isFocused() && keyEvent.getKeyCode() != 4) {
                viewFindFocus = findFocus();
                if (viewFindFocus == this) {
                    viewFindFocus = null;
                }
                viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
                if (viewFindNextFocus == null && viewFindNextFocus != this && viewFindNextFocus.requestFocus(130)) {
                    return true;
                }
            }
        } else if (isFocused()) {
            viewFindFocus = findFocus();
            if (viewFindFocus == this) {
                viewFindFocus = null;
            }
            viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
            if (viewFindNextFocus == null) {
            }
        }
        return false;
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        h61 h61Var = this.F;
        return h61Var.b | h61Var.a;
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public float getVerticalScrollFactorCompat() {
        if (this.H == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                u41.r("Expected theme to define listPreferredItemHeight.");
                return 0.0f;
            }
            this.H = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.H;
    }

    @Override // defpackage.ok2
    public final void h(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        o(i4, i5, iArr);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.G.f(0);
    }

    @Override // defpackage.nk2
    public final void i(View view, int i, int i2, int i3, int i4, int i5) {
        o(i4, i5, null);
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.G.d;
    }

    @Override // defpackage.nk2
    public final boolean j(View view, View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    public final void k(int i) {
        if (getChildCount() > 0) {
            this.l.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, IntCompanionObject.MAX_VALUE, 0, 0);
            w(1);
            this.D = getScrollY();
            postInvalidateOnAnimation();
            if (oy.a()) {
                p11.a(this, Math.abs(this.l.getCurrVelocity()));
            }
        }
    }

    public final boolean l(int i) {
        int childCount;
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.h;
        rect.top = 0;
        rect.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return s(i, rect.top, rect.bottom);
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public final boolean n(View view, int i, int i2) {
        Rect rect = this.h;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i >= getScrollY() && rect.top - i <= getScrollY() + i2;
    }

    public final void o(int i, int i2, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.G.d(0, scrollY2, 0, i - scrollY2, null, i2, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.q = false;
    }

    /* JADX WARN: Code duplicated, block: B:134:0x029c  */
    /* JADX WARN: Code duplicated, block: B:135:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:137:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:49:0x00db  */
    /* JADX WARN: Code duplicated, block: B:70:0x0126  */
    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue;
        int i;
        int width;
        boolean z;
        int i2;
        int scaledMinimumFlingVelocity;
        int scaledMaximumFlingVelocity;
        boolean z2;
        float yVelocity;
        float f;
        long j;
        float f2;
        int i3;
        float fSqrt;
        float f3;
        if (motionEvent.getAction() != 8 || this.s) {
            return false;
        }
        if ((motionEvent.getSource() & 2) == 2) {
            i = 9;
            axisValue = motionEvent.getAxisValue(9);
            width = (int) motionEvent.getX();
        } else if ((motionEvent.getSource() & 4194304) == 4194304) {
            axisValue = motionEvent.getAxisValue(26);
            width = getWidth() / 2;
            i = 26;
        } else {
            axisValue = 0.0f;
            i = 0;
            width = 0;
        }
        if (axisValue == 0.0f) {
            return false;
        }
        t(-((int) (getVerticalScrollFactorCompat() * axisValue)), width, 1, (motionEvent.getSource() & 8194) == 8194);
        if (i == 0) {
            return true;
        }
        yv0 yv0Var = this.I;
        NestedScrollView nestedScrollView = (NestedScrollView) yv0Var.b.c;
        int[] iArr = yv0Var.h;
        int source = motionEvent.getSource();
        int deviceId = motionEvent.getDeviceId();
        if (yv0Var.f == source && yv0Var.g == deviceId && yv0Var.e == i) {
            z = true;
            z2 = false;
            i2 = 0;
        } else {
            Context context = yv0Var.a;
            z = true;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int deviceId2 = motionEvent.getDeviceId();
            int source2 = motionEvent.getSource();
            i2 = 0;
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 34) {
                Method method = ad4.a;
                scaledMinimumFlingVelocity = m1.f(viewConfiguration, deviceId2, i, source2);
            } else {
                Method method2 = ad4.a;
                InputDevice device = InputDevice.getDevice(deviceId2);
                if (device == null || device.getMotionRange(i, source2) == null) {
                    scaledMinimumFlingVelocity = IntCompanionObject.MAX_VALUE;
                } else {
                    Resources resources = context.getResources();
                    int identifier = (source2 == 4194304 && i == 26) ? resources.getIdentifier("config_viewMinRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                    Objects.requireNonNull(viewConfiguration);
                    if (identifier == -1) {
                        scaledMinimumFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
                    } else if (identifier == 0 || (scaledMinimumFlingVelocity = resources.getDimensionPixelSize(identifier)) < 0) {
                        scaledMinimumFlingVelocity = IntCompanionObject.MAX_VALUE;
                    }
                }
            }
            iArr[0] = scaledMinimumFlingVelocity;
            int deviceId3 = motionEvent.getDeviceId();
            int source3 = motionEvent.getSource();
            if (i4 >= 34) {
                scaledMaximumFlingVelocity = m1.e(viewConfiguration, deviceId3, i, source3);
            } else {
                InputDevice device2 = InputDevice.getDevice(deviceId3);
                if (device2 == null || device2.getMotionRange(i, source3) == null) {
                    scaledMaximumFlingVelocity = Integer.MIN_VALUE;
                } else {
                    Resources resources2 = context.getResources();
                    int identifier2 = (source3 == 4194304 && i == 26) ? resources2.getIdentifier("config_viewMaxRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                    Objects.requireNonNull(viewConfiguration);
                    if (identifier2 == -1) {
                        scaledMaximumFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
                    } else if (identifier2 == 0 || (scaledMaximumFlingVelocity = resources2.getDimensionPixelSize(identifier2)) < 0) {
                        scaledMaximumFlingVelocity = Integer.MIN_VALUE;
                    }
                }
            }
            iArr[1] = scaledMaximumFlingVelocity;
            yv0Var.f = source;
            yv0Var.g = deviceId;
            yv0Var.e = i;
            z2 = true;
        }
        int i5 = iArr[i2];
        VelocityTracker velocityTracker = yv0Var.c;
        if (i5 == Integer.MAX_VALUE) {
            if (velocityTracker == null) {
                return z;
            }
            velocityTracker.recycle();
            yv0Var.c = null;
            return z;
        }
        if (velocityTracker == null) {
            yv0Var.c = VelocityTracker.obtain();
        }
        VelocityTracker velocityTracker2 = yv0Var.c;
        Map map = gc4.a;
        velocityTracker2.addMovement(motionEvent);
        if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
            Map map2 = gc4.a;
            if (!map2.containsKey(velocityTracker2)) {
                map2.put(velocityTracker2, new hc4());
            }
            hc4 hc4Var = (hc4) map2.get(velocityTracker2);
            long[] jArr = hc4Var.b;
            long eventTime = motionEvent.getEventTime();
            if (hc4Var.d != 0 && eventTime - jArr[hc4Var.e] > 40) {
                hc4Var.d = i2;
                hc4Var.c = 0.0f;
            }
            int i6 = (hc4Var.e + 1) % 20;
            hc4Var.e = i6;
            int i7 = hc4Var.d;
            if (i7 != 20) {
                hc4Var.d = i7 + 1;
            }
            hc4Var.a[i6] = motionEvent.getAxisValue(26);
            jArr[hc4Var.e] = eventTime;
        }
        float f4 = Float.MAX_VALUE;
        velocityTracker2.computeCurrentVelocity(1000, Float.MAX_VALUE);
        hc4 hc4Var2 = (hc4) gc4.a.get(velocityTracker2);
        if (hc4Var2 != null) {
            float[] fArr = hc4Var2.a;
            long[] jArr2 = hc4Var2.b;
            int i8 = hc4Var2.d;
            if (i8 < 2) {
                f2 = Float.MAX_VALUE;
            } else {
                int i9 = hc4Var2.e;
                int i10 = ((i9 + 20) - (i8 - 1)) % 20;
                long j2 = jArr2[i9];
                while (true) {
                    j = jArr2[i10];
                    long j3 = j2 - j;
                    f2 = f4;
                    i3 = hc4Var2.d;
                    if (j3 <= 100) {
                        break;
                    }
                    hc4Var2.d = i3 - 1;
                    i10 = (i10 + 1) % 20;
                    f4 = f2;
                }
                if (i3 >= 2) {
                    if (i3 == 2) {
                        int i11 = (i10 + 1) % 20;
                        long j4 = jArr2[i11];
                        if (j != j4) {
                            z2 = z2;
                            fSqrt = fArr[i11] / (j4 - j);
                        }
                    } else {
                        float f5 = 0.0f;
                        int i12 = 0;
                        int i13 = 0;
                        while (true) {
                            if (i12 >= hc4Var2.d - 1) {
                                break;
                            }
                            int i14 = i12 + i10;
                            long j5 = jArr2[i14 % 20];
                            int i15 = (i14 + 1) % 20;
                            if (jArr2[i15] != j5) {
                                i13++;
                                float fSqrt2 = (f5 < 0.0f ? -1.0f : 1.0f) * ((float) Math.sqrt(2.0f * Math.abs(f5)));
                                float f6 = fArr[i15] / (jArr2[i15] - j5);
                                float fAbs = (Math.abs(f6) * (f6 - fSqrt2)) + f5;
                                if (i13 == z) {
                                    fAbs *= 0.5f;
                                }
                                f5 = fAbs;
                            }
                            i12++;
                            z2 = z2;
                            z = true;
                        }
                        z2 = z2;
                        float f7 = f5;
                        fSqrt = ((float) Math.sqrt(Math.abs(f7) * 2.0f)) * (f7 < 0.0f ? -1.0f : 1.0f);
                    }
                    f3 = fSqrt * 1000.0f;
                    hc4Var2.c = f3;
                    if (f3 < (-Math.abs(f2))) {
                        hc4Var2.c = -Math.abs(f2);
                    } else if (hc4Var2.c > Math.abs(f2)) {
                        hc4Var2.c = Math.abs(f2);
                    }
                }
            }
            fSqrt = 0.0f;
            f3 = fSqrt * 1000.0f;
            hc4Var2.c = f3;
            if (f3 < (-Math.abs(f2))) {
                hc4Var2.c = -Math.abs(f2);
            } else if (hc4Var2.c > Math.abs(f2)) {
                hc4Var2.c = Math.abs(f2);
            }
        } else {
            z2 = z2;
        }
        if (Build.VERSION.SDK_INT >= 34) {
            yVelocity = m1.b(velocityTracker2, i);
        } else if (i == 0) {
            yVelocity = velocityTracker2.getXVelocity();
        } else if (i == 1) {
            yVelocity = velocityTracker2.getYVelocity();
        } else {
            hc4 hc4Var3 = (hc4) gc4.a.get(velocityTracker2);
            yVelocity = (hc4Var3 == null || i != 26) ? 0.0f : hc4Var3.c;
        }
        float f8 = yVelocity * (-nestedScrollView.getVerticalScrollFactorCompat());
        float fSignum = Math.signum(f8);
        if (z2 || (fSignum != Math.signum(yv0Var.d) && fSignum != 0.0f)) {
            nestedScrollView.l.abortAnimation();
        }
        if (Math.abs(f8) < iArr[0]) {
            return true;
        }
        int i16 = iArr[1];
        float fMax = Math.max(-i16, Math.min(f8, i16));
        if (fMax == 0.0f) {
            f = 0.0f;
        } else {
            nestedScrollView.l.abortAnimation();
            nestedScrollView.k((int) fMax);
            f = fMax;
        }
        yv0Var.d = f;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0083  */
    /* JADX WARN: Code duplicated, block: B:36:0x008b  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:62:0x0115  */
    /* JADX WARN: Code duplicated, block: B:70:0x0129  */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        VelocityTracker velocityTracker2;
        int action = motionEvent.getAction();
        boolean z = true;
        if (action == 2 && this.s) {
            return true;
        }
        int i = action & KotlinVersion.MAX_COMPONENT_VALUE;
        if (i == 0) {
            int y = (int) motionEvent.getY();
            int x = (int) motionEvent.getX();
            int childCount = getChildCount();
            OverScroller overScroller = this.l;
            if (childCount > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y < childAt.getTop() - scrollY || y >= childAt.getBottom() - scrollY || x < childAt.getLeft() || x >= childAt.getRight()) {
                    if (!x(motionEvent) && overScroller.isFinished()) {
                        z = false;
                    }
                    this.s = z;
                    velocityTracker = this.t;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                        this.t = null;
                    }
                } else {
                    this.o = y;
                    this.z = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker3 = this.t;
                    if (velocityTracker3 == null) {
                        this.t = VelocityTracker.obtain();
                    } else {
                        velocityTracker3.clear();
                    }
                    this.t.addMovement(motionEvent);
                    overScroller.computeScrollOffset();
                    if (!x(motionEvent) && overScroller.isFinished()) {
                        z = false;
                    }
                    this.s = z;
                    w(0);
                }
            } else {
                if (!x(motionEvent)) {
                    z = false;
                }
                this.s = z;
                velocityTracker = this.t;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.t = null;
                }
            }
        } else if (i == 1) {
            this.s = false;
            this.z = -1;
            velocityTracker2 = this.t;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.t = null;
            }
            if (this.l.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            y(0);
        } else if (i == 2) {
            int i2 = this.z;
            if (i2 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i2);
                if (iFindPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + i2 + " in onInterceptTouchEvent");
                } else {
                    int y2 = (int) motionEvent.getY(iFindPointerIndex);
                    if (Math.abs(y2 - this.o) > this.w && (2 & getNestedScrollAxes()) == 0) {
                        this.s = true;
                        this.o = y2;
                        if (this.t == null) {
                            this.t = VelocityTracker.obtain();
                        }
                        this.t.addMovement(motionEvent);
                        this.C = 0;
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                }
            }
        } else if (i == 3) {
            this.s = false;
            this.z = -1;
            velocityTracker2 = this.t;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.t = null;
            }
            if (this.l.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            y(0);
        } else if (i == 6) {
            p(motionEvent);
        }
        return this.s;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredHeight;
        super.onLayout(z, i, i2, i3, i4);
        int i5 = 0;
        this.p = false;
        View view = this.r;
        if (view != null && m(view, this)) {
            View view2 = this.r;
            Rect rect = this.h;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iE = e(rect);
            if (iE != 0) {
                scrollBy(0, iE);
            }
        }
        this.r = null;
        if (!this.q) {
            if (this.E != null) {
                scrollTo(getScrollX(), this.E.c);
                this.E = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                measuredHeight = 0;
            }
            int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < measuredHeight && scrollY >= 0) {
                i5 = paddingTop + scrollY > measuredHeight ? measuredHeight - paddingTop : scrollY;
            }
            if (i5 != scrollY) {
                scrollTo(getScrollX(), i5);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.q = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.u && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(0.0f, f2, true);
        k((int) f2);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return this.G.b(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        f(i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        o(i4, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        a(view, view2, i, 0);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        View viewFindNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        if (viewFindNextFocus != null && n(viewFindNextFocus, 0, getHeight())) {
            return viewFindNextFocus.requestFocus(i, rect);
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof lk2)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        lk2 lk2Var = (lk2) parcelable;
        super.onRestoreInstanceState(lk2Var.getSuperState());
        this.E = lk2Var;
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        lk2 lk2Var = new lk2(super.onSaveInstanceState());
        lk2Var.c = getScrollY();
        return lk2Var;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !n(viewFindFocus, 0, i4)) {
            return;
        }
        Rect rect = this.h;
        viewFindFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(viewFindFocus, rect);
        int iE = e(rect);
        if (iE != 0) {
            if (this.v) {
                v(0, iE, false);
            } else {
                scrollBy(0, iE);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return j(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        b(view, 0);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        if (this.t == null) {
            this.t = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.C = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        float f = 0.0f;
        motionEventObtain.offsetLocation(0.0f, this.C);
        if (actionMasked != 0) {
            EdgeEffect edgeEffect = this.m;
            EdgeEffect edgeEffect2 = this.n;
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.t;
                velocityTracker.computeCurrentVelocity(1000, this.y);
                int yVelocity = (int) velocityTracker.getYVelocity(this.z);
                if (Math.abs(yVelocity) >= this.x) {
                    if (p23.z(edgeEffect) != 0.0f) {
                        if (u(edgeEffect, yVelocity)) {
                            edgeEffect.onAbsorb(yVelocity);
                        } else {
                            k(-yVelocity);
                        }
                    } else if (p23.z(edgeEffect2) != 0.0f) {
                        int i = -yVelocity;
                        if (u(edgeEffect2, i)) {
                            edgeEffect2.onAbsorb(i);
                        } else {
                            k(i);
                        }
                    } else {
                        int i2 = -yVelocity;
                        float f2 = i2;
                        if (!this.G.b(0.0f, f2)) {
                            dispatchNestedFling(0.0f, f2, true);
                            k(i2);
                        }
                    }
                } else if (this.l.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.z = -1;
                this.s = false;
                VelocityTracker velocityTracker2 = this.t;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.t = null;
                }
                y(0);
                edgeEffect.onRelease();
                edgeEffect2.onRelease();
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.z);
                if (iFindPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.z + " in onTouchEvent");
                } else {
                    int y = (int) motionEvent.getY(iFindPointerIndex);
                    int i3 = this.o - y;
                    float x = motionEvent.getX(iFindPointerIndex) / getWidth();
                    float height = i3 / getHeight();
                    if (p23.z(edgeEffect) != 0.0f) {
                        float f3 = -p23.P(edgeEffect, -height, x);
                        if (p23.z(edgeEffect) == 0.0f) {
                            edgeEffect.onRelease();
                        }
                        f = f3;
                    } else if (p23.z(edgeEffect2) != 0.0f) {
                        float fP = p23.P(edgeEffect2, height, 1.0f - x);
                        if (p23.z(edgeEffect2) == 0.0f) {
                            edgeEffect2.onRelease();
                        }
                        f = fP;
                    }
                    int iRound = Math.round(f * getHeight());
                    if (iRound != 0) {
                        invalidate();
                    }
                    int i4 = i3 - iRound;
                    if (!this.s) {
                        int iAbs = Math.abs(i4);
                        int i5 = this.w;
                        if (iAbs > i5) {
                            ViewParent parent2 = getParent();
                            if (parent2 != null) {
                                parent2.requestDisallowInterceptTouchEvent(true);
                            }
                            this.s = true;
                            i4 = i4 > 0 ? i4 - i5 : i4 + i5;
                        }
                    }
                    if (this.s) {
                        int iT = t(i4, (int) motionEvent.getX(iFindPointerIndex), 0, false);
                        this.o = y - iT;
                        this.C += iT;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.s && getChildCount() > 0) {
                    if (this.l.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                        postInvalidateOnAnimation();
                    }
                }
                this.z = -1;
                this.s = false;
                VelocityTracker velocityTracker3 = this.t;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.t = null;
                }
                y(0);
                edgeEffect.onRelease();
                edgeEffect2.onRelease();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.o = (int) motionEvent.getY(actionIndex);
                this.z = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                p(motionEvent);
                this.o = (int) motionEvent.getY(motionEvent.findPointerIndex(this.z));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.s && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            OverScroller overScroller = this.l;
            if (!overScroller.isFinished()) {
                overScroller.abortAnimation();
                y(1);
            }
            int y2 = (int) motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            this.o = y2;
            this.z = pointerId;
            w(0);
        }
        VelocityTracker velocityTracker4 = this.t;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    public final void p(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.z) {
            int i = actionIndex == 0 ? 1 : 0;
            this.o = (int) motionEvent.getY(i);
            this.z = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.t;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final boolean q(int i, int i2, int i3, int i4) {
        int i5;
        boolean z;
        int i6;
        boolean z2;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i7 = i3 + i;
        if (i2 <= 0 && i2 >= 0) {
            i5 = i2;
            z = false;
        } else {
            i5 = 0;
            z = true;
        }
        if (i7 <= i4) {
            if (i7 < 0) {
                i6 = 0;
            } else {
                i6 = i7;
                z2 = false;
            }
            if (z2 && !this.G.f(1)) {
                this.l.springBack(i5, i6, 0, 0, 0, getScrollRange());
            }
            super.scrollTo(i5, i6);
            return !z || z2;
        }
        i6 = i4;
        z2 = true;
        if (z2) {
            this.l.springBack(i5, i6, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(i5, i6);
        if (z) {
        }
    }

    public final void r(int i) {
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.h;
        if (z) {
            rect.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                if (rect.top + height > paddingBottom) {
                    rect.top = paddingBottom - height;
                }
            }
        } else {
            int scrollY = getScrollY() - height;
            rect.top = scrollY;
            if (scrollY < 0) {
                rect.top = 0;
            }
        }
        int i2 = rect.top;
        int i3 = height + i2;
        rect.bottom = i3;
        s(i, i2, i3);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (this.p) {
            this.r = view2;
        } else {
            Rect rect = this.h;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iE = e(rect);
            if (iE != 0) {
                scrollBy(0, iE);
            }
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int iE = e(rect);
        boolean z2 = iE != 0;
        if (z2) {
            if (z) {
                scrollBy(0, iE);
                return z2;
            }
            v(0, iE, false);
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        VelocityTracker velocityTracker;
        if (z && (velocityTracker = this.t) != null) {
            velocityTracker.recycle();
            this.t = null;
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.p = true;
        super.requestLayout();
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0068  */
    public final boolean s(int i, int i2, int i3) {
        boolean z;
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = height + scrollY;
        boolean z2 = i == 33;
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z3 = false;
        for (int i5 = 0; i5 < size; i5++) {
            View view2 = focusables.get(i5);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i2 < bottom && top < i3) {
                boolean z4 = i2 < top && bottom < i3;
                if (view == null) {
                    view = view2;
                    z3 = z4;
                } else {
                    boolean z5 = (z2 && top < view.getTop()) || (!z2 && bottom > view.getBottom());
                    if (z3) {
                        if (z4 && z5) {
                            view = view2;
                        }
                    } else if (z4) {
                        view = view2;
                        z3 = true;
                    } else if (z5) {
                        view = view2;
                    }
                }
            }
        }
        if (view == null) {
            view = this;
        }
        if (i2 < scrollY || i3 > i4) {
            t(z2 ? i2 - scrollY : i3 - i4, 0, 1, true);
            z = true;
        } else {
            z = false;
        }
        if (view != findFocus()) {
            view.requestFocus(i);
        }
        return z;
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i < 0) {
                i = 0;
            } else if (width + i > width2) {
                i = width2 - width;
            }
            if (height >= height2 || i2 < 0) {
                i2 = 0;
            } else if (height + i2 > height2) {
                i2 = height2 - height;
            }
            if (i == getScrollX() && i2 == getScrollY()) {
                return;
            }
            super.scrollTo(i, i2);
        }
    }

    public void setFillViewport(boolean z) {
        if (z != this.u) {
            this.u = z;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        mk2 mk2Var = this.G;
        if (mk2Var.d) {
            View view = mk2Var.c;
            WeakHashMap weakHashMap = zc4.a;
            sc4.j(view);
        }
        mk2Var.d = z;
    }

    public void setOnScrollChangeListener(kk2 kk2Var) {
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.v = z;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return this.G.g(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        y(0);
    }

    public final int t(int i, int i2, int i3, boolean z) {
        int i4;
        int i5;
        boolean z2;
        VelocityTracker velocityTracker;
        if (i3 == 1) {
            w(i3);
        }
        boolean zC = this.G.c(0, i, i3, this.B, this.A);
        int[] iArr = this.A;
        int[] iArr2 = this.B;
        if (zC) {
            i4 = i - iArr2[1];
            i5 = iArr[1];
        } else {
            i4 = i;
            i5 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        int overScrollMode = getOverScrollMode();
        boolean z3 = (overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) && !z;
        boolean z4 = q(i4, 0, scrollY, scrollRange) && !this.G.f(i3);
        int scrollY2 = getScrollY() - scrollY;
        iArr2[1] = 0;
        this.G.d(0, scrollY2, 0, i4 - scrollY2, this.A, i3, iArr2);
        int i6 = i5 + iArr[1];
        int i7 = i4 - iArr2[1];
        int i8 = scrollY + i7;
        EdgeEffect edgeEffect = this.n;
        EdgeEffect edgeEffect2 = this.m;
        if (i8 < 0) {
            if (z3) {
                p23.P(edgeEffect2, (-i7) / getHeight(), i2 / getWidth());
                if (!edgeEffect.isFinished()) {
                    edgeEffect.onRelease();
                }
            }
        } else if (i8 > scrollRange && z3) {
            p23.P(edgeEffect, i7 / getHeight(), 1.0f - (i2 / getWidth()));
            if (!edgeEffect2.isFinished()) {
                edgeEffect2.onRelease();
            }
        }
        if (edgeEffect2.isFinished() && edgeEffect.isFinished()) {
            z2 = z4;
        } else {
            postInvalidateOnAnimation();
            z2 = false;
        }
        if (z2 && i3 == 0 && (velocityTracker = this.t) != null) {
            velocityTracker.clear();
        }
        if (i3 == 1) {
            y(i3);
            edgeEffect2.onRelease();
            edgeEffect.onRelease();
        }
        return i6;
    }

    public final boolean u(EdgeEffect edgeEffect, int i) {
        if (i > 0) {
            return true;
        }
        float fZ = p23.z(edgeEffect) * getHeight();
        float fAbs = Math.abs(-i) * 0.35f;
        float f = this.c * 0.015f;
        double dLog = Math.log(fAbs / f);
        double d = J;
        return ((float) (Math.exp((d / (d - 1.0d)) * dLog) * ((double) f))) < fZ;
    }

    public final void v(int i, int i2, boolean z) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.d > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int iMax = Math.max(0, Math.min(i2 + scrollY, Math.max(0, height - height2))) - scrollY;
            this.l.startScroll(getScrollX(), scrollY, 0, iMax, 250);
            if (z) {
                w(1);
            } else {
                y(1);
            }
            this.D = getScrollY();
            postInvalidateOnAnimation();
        } else {
            OverScroller overScroller = this.l;
            if (!overScroller.isFinished()) {
                overScroller.abortAnimation();
                y(1);
            }
            scrollBy(i, i2);
        }
        this.d = AnimationUtils.currentAnimationTimeMillis();
    }

    public final void w(int i) {
        this.G.g(2, i);
    }

    public final boolean x(MotionEvent motionEvent) {
        boolean z;
        EdgeEffect edgeEffect = this.m;
        if (p23.z(edgeEffect) != 0.0f) {
            p23.P(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z = true;
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.n;
        if (p23.z(edgeEffect2) == 0.0f) {
            return z;
        }
        p23.P(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    public final void y(int i) {
        this.G.h(i);
    }
}
