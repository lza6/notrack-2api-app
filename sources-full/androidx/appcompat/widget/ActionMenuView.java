package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import defpackage.d3;
import defpackage.f3;
import defpackage.g3;
import defpackage.g42;
import defpackage.g44;
import defpackage.gc2;
import defpackage.h3;
import defpackage.h42;
import defpackage.hc2;
import defpackage.i3;
import defpackage.j3;
import defpackage.jb;
import defpackage.mc2;
import defpackage.pd2;
import defpackage.t73;
import defpackage.yd4;
import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuView extends h42 implements gc2, pd2 {
    public boolean A;
    public g3 B;
    public g44 C;
    public boolean D;
    public int E;
    public final int F;
    public final int G;
    public j3 H;
    public hc2 x;
    public Context y;
    public int z;

    public ActionMenuView(Context context) {
        this(context, null);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.F = (int) (56.0f * f);
        this.G = (int) (f * 4.0f);
        this.y = context;
        this.z = 0;
    }

    public static i3 i() {
        i3 i3Var = new i3(-2, -2);
        i3Var.a = false;
        ((LinearLayout.LayoutParams) i3Var).gravity = 16;
        return i3Var;
    }

    public static i3 j(ViewGroup.LayoutParams layoutParams) {
        i3 i3Var;
        if (layoutParams == null) {
            return i();
        }
        if (layoutParams instanceof i3) {
            i3 i3Var2 = (i3) layoutParams;
            i3Var = new i3(i3Var2);
            i3Var.a = i3Var2.a;
        } else {
            i3Var = new i3(layoutParams);
        }
        if (((LinearLayout.LayoutParams) i3Var).gravity <= 0) {
            ((LinearLayout.LayoutParams) i3Var).gravity = 16;
        }
        return i3Var;
    }

    @Override // defpackage.gc2
    public final boolean a(mc2 mc2Var) {
        return this.x.q(mc2Var, null, 0);
    }

    @Override // defpackage.pd2
    public final void b(hc2 hc2Var) {
        this.x = hc2Var;
    }

    @Override // defpackage.h42, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof i3;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // defpackage.h42
    /* JADX INFO: renamed from: e */
    public final /* bridge */ /* synthetic */ g42 generateDefaultLayoutParams() {
        return i();
    }

    @Override // defpackage.h42
    /* JADX INFO: renamed from: f */
    public final g42 generateLayoutParams(AttributeSet attributeSet) {
        return new i3(getContext(), attributeSet);
    }

    @Override // defpackage.h42
    /* JADX INFO: renamed from: g */
    public final /* bridge */ /* synthetic */ g42 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return j(layoutParams);
    }

    @Override // defpackage.h42, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return i();
    }

    @Override // defpackage.h42, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new i3(getContext(), attributeSet);
    }

    @Override // defpackage.h42, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return j(layoutParams);
    }

    public Menu getMenu() {
        if (this.x == null) {
            Context context = getContext();
            hc2 hc2Var = new hc2(context);
            this.x = hc2Var;
            hc2Var.e = new jb(3, this);
            g3 g3Var = new g3(context);
            this.B = g3Var;
            g3Var.t = true;
            g3Var.u = true;
            g3Var.m = new t73(19);
            this.x.b(g3Var, this.y);
            g3 g3Var2 = this.B;
            g3Var2.p = this;
            this.x = g3Var2.h;
        }
        return this.x;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        g3 g3Var = this.B;
        f3 f3Var = g3Var.q;
        if (f3Var != null) {
            return f3Var.getDrawable();
        }
        if (g3Var.s) {
            return g3Var.r;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.z;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public final boolean k(int i) {
        boolean zB = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof h3)) {
            zB = ((h3) childAt).b();
        }
        return (i <= 0 || !(childAt2 instanceof h3)) ? zB : ((h3) childAt2).c() | zB;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        g3 g3Var = this.B;
        if (g3Var != null) {
            g3Var.f();
            if (this.B.k()) {
                this.B.g();
                this.B.l();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g3 g3Var = this.B;
        if (g3Var != null) {
            g3Var.g();
            d3 d3Var = g3Var.B;
            if (d3Var == null || !d3Var.b()) {
                return;
            }
            d3Var.i.dismiss();
        }
    }

    @Override // defpackage.h42, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width;
        int paddingLeft;
        if (!this.D) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i5 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i6 = i3 - i;
        int paddingRight = (i6 - getPaddingRight()) - getPaddingLeft();
        boolean z2 = yd4.a;
        boolean z3 = getLayoutDirection() == 1;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                i3 i3Var = (i3) childAt.getLayoutParams();
                if (i3Var.a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (k(i9)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z3) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) i3Var).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) i3Var).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i10 = i5 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i10, width, measuredHeight + i10);
                    paddingRight -= measuredWidth;
                    i7 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) i3Var).leftMargin) + ((LinearLayout.LayoutParams) i3Var).rightMargin;
                    k(i9);
                    i8++;
                }
            }
        }
        if (childCount == 1 && i7 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i11 = (i6 / 2) - (measuredWidth2 / 2);
            int i12 = i5 - (measuredHeight2 / 2);
            childAt2.layout(i11, i12, measuredWidth2 + i11, measuredHeight2 + i12);
            return;
        }
        int i13 = i8 - (i7 ^ 1);
        int iMax = Math.max(0, i13 > 0 ? paddingRight / i13 : 0);
        if (z3) {
            int width2 = getWidth() - getPaddingRight();
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt3 = getChildAt(i14);
                i3 i3Var2 = (i3) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !i3Var2.a) {
                    int i15 = width2 - ((LinearLayout.LayoutParams) i3Var2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i16 = i5 - (measuredHeight3 / 2);
                    childAt3.layout(i15 - measuredWidth3, i16, i15, measuredHeight3 + i16);
                    width2 = i15 - ((measuredWidth3 + ((LinearLayout.LayoutParams) i3Var2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt4 = getChildAt(i17);
            i3 i3Var3 = (i3) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !i3Var3.a) {
                int i18 = paddingLeft2 + ((LinearLayout.LayoutParams) i3Var3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i19 = i5 - (measuredHeight4 / 2);
                childAt4.layout(i18, i19, i18 + measuredWidth4, measuredHeight4 + i19);
                paddingLeft2 = measuredWidth4 + ((LinearLayout.LayoutParams) i3Var3).rightMargin + iMax + i18;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v41 */
    @Override // defpackage.h42, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        ?? r11;
        int i5;
        int i6;
        hc2 hc2Var;
        boolean z = this.D;
        boolean z2 = View.MeasureSpec.getMode(i) == 1073741824;
        this.D = z2;
        if (z != z2) {
            this.E = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.D && (hc2Var = this.x) != null && size != this.E) {
            this.E = size;
            hc2Var.p(true);
        }
        int childCount = getChildCount();
        if (!this.D || childCount <= 0) {
            for (int i7 = 0; i7 < childCount; i7++) {
                i3 i3Var = (i3) getChildAt(i7).getLayoutParams();
                ((LinearLayout.LayoutParams) i3Var).rightMargin = 0;
                ((LinearLayout.LayoutParams) i3Var).leftMargin = 0;
            }
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i);
        int size3 = View.MeasureSpec.getSize(i2);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingBottom, -2);
        int i8 = size2 - paddingRight;
        int i9 = this.F;
        int i10 = i8 / i9;
        int i11 = i8 % i9;
        if (i10 == 0) {
            setMeasuredDimension(i8, 0);
            return;
        }
        int i12 = (i11 / i10) + i9;
        int childCount2 = getChildCount();
        int iMax = 0;
        int i13 = 0;
        int iMax2 = 0;
        int i14 = 0;
        boolean z3 = false;
        int i15 = 0;
        long j = 0;
        while (true) {
            i3 = this.G;
            if (i14 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i14);
            int i16 = size3;
            int i17 = paddingBottom;
            if (childAt.getVisibility() == 8) {
                i5 = i12;
            } else {
                boolean z4 = childAt instanceof ActionMenuItemView;
                i13++;
                if (z4) {
                    childAt.setPadding(i3, 0, i3, 0);
                }
                i3 i3Var2 = (i3) childAt.getLayoutParams();
                i3Var2.f = false;
                i3Var2.c = 0;
                i3Var2.b = 0;
                i3Var2.d = false;
                ((LinearLayout.LayoutParams) i3Var2).leftMargin = 0;
                ((LinearLayout.LayoutParams) i3Var2).rightMargin = 0;
                i3Var2.e = z4 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i18 = i3Var2.a ? 1 : i10;
                i3 i3Var3 = (i3) childAt.getLayoutParams();
                int i19 = i10;
                i5 = i12;
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - i17, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z4 ? (ActionMenuItemView) childAt : null;
                boolean z5 = (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
                boolean z6 = z5;
                if (i18 <= 0 || (z5 && i18 < 2)) {
                    i6 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i5 * i18, Integer.MIN_VALUE), iMakeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i6 = measuredWidth / i5;
                    if (measuredWidth % i5 != 0) {
                        i6++;
                    }
                    if (z6 && i6 < 2) {
                        i6 = 2;
                    }
                }
                i3Var3.d = !i3Var3.a && z6;
                i3Var3.b = i6;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i6 * i5, 1073741824), iMakeMeasureSpec);
                iMax2 = Math.max(iMax2, i6);
                if (i3Var2.d) {
                    i15++;
                }
                if (i3Var2.a) {
                    z3 = true;
                }
                i10 = i19 - i6;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (i6 == 1) {
                    j |= (long) (1 << i14);
                }
            }
            i14++;
            size3 = i16;
            paddingBottom = i17;
            i12 = i5;
        }
        int i20 = size3;
        int i21 = i10;
        int i22 = i12;
        boolean z7 = z3 && i13 == 2;
        int i23 = i21;
        boolean z8 = false;
        while (true) {
            if (i15 <= 0 || i23 <= 0) {
                i4 = iMax;
                break;
            }
            int i24 = IntCompanionObject.MAX_VALUE;
            long j2 = 0;
            int i25 = 0;
            int i26 = 0;
            while (i26 < childCount2) {
                int i27 = iMax;
                i3 i3Var4 = (i3) getChildAt(i26).getLayoutParams();
                boolean z9 = z7;
                if (i3Var4.d) {
                    int i28 = i3Var4.b;
                    if (i28 < i24) {
                        j2 = 1 << i26;
                        i24 = i28;
                        i25 = 1;
                    } else if (i28 == i24) {
                        j2 |= 1 << i26;
                        i25++;
                    }
                }
                i26++;
                z7 = z9;
                iMax = i27;
            }
            i4 = iMax;
            boolean z10 = z7;
            j |= j2;
            if (i25 > i23) {
                break;
            }
            int i29 = i24 + 1;
            int i30 = 0;
            while (i30 < childCount2) {
                View childAt2 = getChildAt(i30);
                i3 i3Var5 = (i3) childAt2.getLayoutParams();
                boolean z11 = z3;
                long j3 = 1 << i30;
                if ((j2 & j3) != 0) {
                    if (z10 && i3Var5.e) {
                        r11 = 1;
                        r11 = 1;
                        if (i23 == 1) {
                            childAt2.setPadding(i3 + i22, 0, i3, 0);
                        }
                    } else {
                        r11 = 1;
                    }
                    i3Var5.b += r11;
                    i3Var5.f = r11;
                    i23--;
                } else if (i3Var5.b == i29) {
                    j |= j3;
                }
                i30++;
                z3 = z11;
            }
            z7 = z10;
            iMax = i4;
            z8 = true;
        }
        boolean z12 = !z3 && i13 == 1;
        if (i23 > 0 && j != 0 && (i23 < i13 - 1 || z12 || iMax2 > 1)) {
            float fBitCount = Long.bitCount(j);
            if (!z12) {
                if ((j & 1) != 0 && !((i3) getChildAt(0).getLayoutParams()).e) {
                    fBitCount -= 0.5f;
                }
                int i31 = childCount2 - 1;
                if ((j & ((long) (1 << i31))) != 0 && !((i3) getChildAt(i31).getLayoutParams()).e) {
                    fBitCount -= 0.5f;
                }
            }
            int i32 = fBitCount > 0.0f ? (int) ((i23 * i22) / fBitCount) : 0;
            boolean z13 = z8;
            for (int i33 = 0; i33 < childCount2; i33++) {
                if ((j & ((long) (1 << i33))) != 0) {
                    View childAt3 = getChildAt(i33);
                    i3 i3Var6 = (i3) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        i3Var6.c = i32;
                        i3Var6.f = true;
                        if (i33 == 0 && !i3Var6.e) {
                            ((LinearLayout.LayoutParams) i3Var6).leftMargin = (-i32) / 2;
                        }
                        z13 = true;
                    } else if (i3Var6.a) {
                        i3Var6.c = i32;
                        i3Var6.f = true;
                        ((LinearLayout.LayoutParams) i3Var6).rightMargin = (-i32) / 2;
                        z13 = true;
                    } else {
                        if (i33 != 0) {
                            ((LinearLayout.LayoutParams) i3Var6).leftMargin = i32 / 2;
                        }
                        if (i33 != childCount2 - 1) {
                            ((LinearLayout.LayoutParams) i3Var6).rightMargin = i32 / 2;
                        }
                    }
                }
            }
            z8 = z13;
        }
        if (z8) {
            for (int i34 = 0; i34 < childCount2; i34++) {
                View childAt4 = getChildAt(i34);
                i3 i3Var7 = (i3) childAt4.getLayoutParams();
                if (i3Var7.f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((i3Var7.b * i22) + i3Var7.c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i8, mode != 1073741824 ? i4 : i20);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.B.y = z;
    }

    public void setOnMenuItemClickListener(j3 j3Var) {
        this.H = j3Var;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        g3 g3Var = this.B;
        f3 f3Var = g3Var.q;
        if (f3Var != null) {
            f3Var.setImageDrawable(drawable);
        } else {
            g3Var.s = true;
            g3Var.r = drawable;
        }
    }

    public void setOverflowReserved(boolean z) {
        this.A = z;
    }

    public void setPopupTheme(int i) {
        if (this.z != i) {
            this.z = i;
            if (i == 0) {
                this.y = getContext();
            } else {
                this.y = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(g3 g3Var) {
        this.B = g3Var;
        g3Var.p = this;
        this.x = g3Var.h;
    }
}
