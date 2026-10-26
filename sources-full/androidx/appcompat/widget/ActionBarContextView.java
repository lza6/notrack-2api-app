package androidx.appcompat.widget;

import ai.notrack.app.R;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.d3;
import defpackage.e;
import defpackage.g23;
import defpackage.g3;
import defpackage.hc2;
import defpackage.k3;
import defpackage.pd2;
import defpackage.pd4;
import defpackage.u2;
import defpackage.u41;
import defpackage.y64;
import defpackage.yd4;
import defpackage.zc4;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {
    public boolean A;
    public final int B;
    public final e c;
    public final Context d;
    public ActionMenuView h;
    public g3 l;
    public int m;
    public pd4 n;
    public boolean o;
    public boolean p;
    public CharSequence q;
    public CharSequence r;
    public View s;
    public View t;
    public View u;
    public LinearLayout v;
    public TextView w;
    public TextView x;
    public final int y;
    public final int z;

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.actionModeStyle);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i) {
        int resourceId;
        super(context, attributeSet, i);
        e eVar = new e();
        eVar.c = this;
        eVar.a = false;
        this.c = eVar;
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.d = context;
        } else {
            this.d = new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g23.d, i, 0);
        setBackground((!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(0) : y64.y(context, resourceId));
        this.y = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.z = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        this.m = typedArrayObtainStyledAttributes.getLayoutDimension(3, 0);
        this.B = typedArrayObtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static int f(View view, int i, int i2) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, i - view.getMeasuredWidth());
    }

    public static int g(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = ((i3 - measuredHeight) / 2) + i2;
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    public final void c(k3 k3Var) {
        View view = this.s;
        int i = 0;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.B, (ViewGroup) this, false);
            this.s = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.s);
        }
        View viewFindViewById = this.s.findViewById(R.id.action_mode_close_button);
        this.t = viewFindViewById;
        viewFindViewById.setOnClickListener(new u2(i, k3Var));
        hc2 hc2VarC = k3Var.c();
        g3 g3Var = this.l;
        if (g3Var != null) {
            g3Var.g();
            d3 d3Var = g3Var.B;
            if (d3Var != null && d3Var.b()) {
                d3Var.i.dismiss();
            }
        }
        g3 g3Var2 = new g3(getContext());
        this.l = g3Var2;
        g3Var2.t = true;
        g3Var2.u = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        hc2VarC.b(this.l, this.d);
        g3 g3Var3 = this.l;
        pd2 pd2Var = g3Var3.p;
        if (pd2Var == null) {
            pd2 pd2Var2 = (pd2) g3Var3.l.inflate(g3Var3.n, (ViewGroup) this, false);
            g3Var3.p = pd2Var2;
            pd2Var2.b(g3Var3.h);
            g3Var3.f();
        }
        pd2 pd2Var3 = g3Var3.p;
        if (pd2Var != pd2Var3) {
            ((ActionMenuView) pd2Var3).setPresenter(g3Var3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) pd2Var3;
        this.h = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.h, layoutParams);
    }

    public final void d() {
        if (this.v == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.v = linearLayout;
            this.w = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.x = (TextView) this.v.findViewById(R.id.action_bar_subtitle);
            int i = this.y;
            if (i != 0) {
                this.w.setTextAppearance(getContext(), i);
            }
            int i2 = this.z;
            if (i2 != 0) {
                this.x.setTextAppearance(getContext(), i2);
            }
        }
        this.w.setText(this.q);
        this.x.setText(this.r);
        boolean zIsEmpty = TextUtils.isEmpty(this.q);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.r);
        this.x.setVisibility(!zIsEmpty2 ? 0 : 8);
        this.v.setVisibility((zIsEmpty && zIsEmpty2) ? 8 : 0);
        if (this.v.getParent() == null) {
            addView(this.v);
        }
    }

    public final void e() {
        removeAllViews();
        this.u = null;
        this.h = null;
        this.l = null;
        View view = this.t;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        return this.n != null ? this.c.b : getVisibility();
    }

    public int getContentHeight() {
        return this.m;
    }

    public CharSequence getSubtitle() {
        return this.r;
    }

    public CharSequence getTitle() {
        return this.q;
    }

    @Override // android.view.View
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i) {
        if (i != getVisibility()) {
            pd4 pd4Var = this.n;
            if (pd4Var != null) {
                pd4Var.b();
            }
            super.setVisibility(i);
        }
    }

    public final pd4 i(long j, int i) {
        pd4 pd4Var = this.n;
        if (pd4Var != null) {
            pd4Var.b();
        }
        e eVar = this.c;
        if (i != 0) {
            pd4 pd4VarA = zc4.a(this);
            pd4VarA.a(0.0f);
            pd4VarA.c(j);
            ((ActionBarContextView) eVar.c).n = pd4VarA;
            eVar.b = i;
            pd4VarA.d(eVar);
            return pd4VarA;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        pd4 pd4VarA2 = zc4.a(this);
        pd4VarA2.a(1.0f);
        pd4VarA2.c(j);
        ((ActionBarContextView) eVar.c).n = pd4VarA2;
        eVar.b = i;
        pd4VarA2.d(eVar);
        return pd4VarA2;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        int i;
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, g23.a, R.attr.actionBarStyle, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(13, 0));
        typedArrayObtainStyledAttributes.recycle();
        g3 g3Var = this.l;
        if (g3Var != null) {
            Configuration configuration2 = g3Var.d.getResources().getConfiguration();
            int i2 = configuration2.screenWidthDp;
            int i3 = configuration2.screenHeightDp;
            if (configuration2.smallestScreenWidthDp > 600 || i2 > 600 || ((i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960))) {
                i = 5;
            } else if (i2 >= 500 || ((i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640))) {
                i = 4;
            } else {
                i = i2 >= 360 ? 3 : 2;
            }
            g3Var.x = i;
            hc2 hc2Var = g3Var.h;
            if (hc2Var != null) {
                hc2Var.p(true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g3 g3Var = this.l;
        if (g3Var != null) {
            g3Var.g();
            d3 d3Var = this.l.B;
            if (d3Var == null || !d3Var.b()) {
                return;
            }
            d3Var.i.dismiss();
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.p = false;
        }
        if (!this.p) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.p = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.p = false;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2 = yd4.a;
        boolean z3 = getLayoutDirection() == 1;
        int paddingRight = z3 ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.s;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.s.getLayoutParams();
            int i5 = z3 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = z3 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i7 = z3 ? paddingRight - i5 : paddingRight + i5;
            int iG = g(this.s, i7, paddingTop, paddingTop2, z3) + i7;
            paddingRight = z3 ? iG - i6 : iG + i6;
        }
        LinearLayout linearLayout = this.v;
        if (linearLayout != null && this.u == null && linearLayout.getVisibility() != 8) {
            paddingRight += g(this.v, paddingRight, paddingTop, paddingTop2, z3);
        }
        View view2 = this.u;
        if (view2 != null) {
            g(view2, paddingRight, paddingTop, paddingTop2, z3);
        }
        int paddingLeft = z3 ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.h;
        if (actionMenuView != null) {
            g(actionMenuView, paddingLeft, paddingTop, paddingTop2, !z3);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            u41.r(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
            return;
        }
        if (View.MeasureSpec.getMode(i2) == 0) {
            u41.r(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = this.m;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i2);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingBottom;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.s;
        if (view != null) {
            int iF = f(view, paddingLeft, iMakeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.s.getLayoutParams();
            paddingLeft = iF - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.h;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = f(this.h, paddingLeft, iMakeMeasureSpec);
        }
        LinearLayout linearLayout = this.v;
        if (linearLayout != null && this.u == null) {
            if (this.A) {
                this.v.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.v.getMeasuredWidth();
                boolean z = measuredWidth <= paddingLeft;
                if (z) {
                    paddingLeft -= measuredWidth;
                }
                this.v.setVisibility(z ? 0 : 8);
            } else {
                paddingLeft = f(linearLayout, paddingLeft, iMakeMeasureSpec);
            }
        }
        View view2 = this.u;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i3 = layoutParams.width;
            int i4 = i3 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i3 >= 0) {
                paddingLeft = Math.min(i3, paddingLeft);
            }
            int i5 = layoutParams.height;
            int i6 = i5 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i5 >= 0) {
                iMin = Math.min(i5, iMin);
            }
            this.u.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i4), View.MeasureSpec.makeMeasureSpec(iMin, i6));
        }
        if (this.m > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            int measuredHeight = getChildAt(i8).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i7) {
                i7 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i7);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.o = false;
        }
        if (!this.o) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.o = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.o = false;
        return true;
    }

    public void setContentHeight(int i) {
        this.m = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.u;
        if (view2 != null) {
            removeView(view2);
        }
        this.u = view;
        if (view != null && (linearLayout = this.v) != null) {
            removeView(linearLayout);
            this.v = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.r = charSequence;
        d();
    }

    public void setTitle(CharSequence charSequence) {
        this.q = charSequence;
        d();
        zc4.i(this, charSequence);
    }

    public void setTitleOptional(boolean z) {
        if (z != this.A) {
            requestLayout();
        }
        this.A = z;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
