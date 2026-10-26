package androidx.appcompat.widget;

import ai.notrack.app.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import defpackage.ci4;
import defpackage.f44;
import defpackage.fj;
import defpackage.g23;
import defpackage.g3;
import defpackage.g44;
import defpackage.gd1;
import defpackage.h44;
import defpackage.hc2;
import defpackage.hj;
import defpackage.i44;
import defpackage.i83;
import defpackage.im;
import defpackage.iy2;
import defpackage.j44;
import defpackage.js0;
import defpackage.k44;
import defpackage.kk;
import defpackage.l44;
import defpackage.m44;
import defpackage.mc2;
import defpackage.o44;
import defpackage.u2;
import defpackage.wp3;
import defpackage.xp1;
import defpackage.y64;
import defpackage.yd4;
import defpackage.zc4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends ViewGroup {
    public int A;
    public i83 B;
    public int C;
    public int D;
    public final int E;
    public CharSequence F;
    public CharSequence G;
    public ColorStateList H;
    public ColorStateList I;
    public boolean J;
    public boolean K;
    public final ArrayList L;
    public final ArrayList M;
    public final int[] N;
    public final ci4 O;
    public ArrayList P;
    public final g44 Q;
    public o44 R;
    public g3 S;
    public i44 T;
    public boolean U;
    public OnBackInvokedCallback V;
    public OnBackInvokedDispatcher W;
    public boolean a0;
    public final im b0;
    public ActionMenuView c;
    public kk d;
    public kk h;
    public fj l;
    public hj m;
    public final Drawable n;
    public final CharSequence o;
    public fj p;
    public View q;
    public Context r;
    public int s;
    public int t;
    public int u;
    public final int v;
    public final int w;
    public int x;
    public int y;
    public int z;

    public Toolbar(Context context) {
        this(context, null);
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.E = 8388627;
        this.L = new ArrayList();
        this.M = new ArrayList();
        this.N = new int[2];
        this.O = new ci4(new f44(this, 1));
        this.P = new ArrayList();
        this.Q = new g44(this);
        this.b0 = new im(13, this);
        Context context2 = getContext();
        int[] iArr = g23.w;
        iy2 iy2VarL = iy2.l(context2, attributeSet, iArr, i);
        zc4.g(this, context, iArr, attributeSet, (TypedArray) iy2VarL.h, i);
        TypedArray typedArray = (TypedArray) iy2VarL.h;
        this.t = typedArray.getResourceId(28, 0);
        this.u = typedArray.getResourceId(19, 0);
        this.E = typedArray.getInteger(0, 8388627);
        this.v = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.A = dimensionPixelOffset;
        this.z = dimensionPixelOffset;
        this.y = dimensionPixelOffset;
        this.x = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.x = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.y = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.z = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.A = dimensionPixelOffset5;
        }
        this.w = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        d();
        i83 i83Var = this.B;
        i83Var.h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            i83Var.e = dimensionPixelSize;
            i83Var.a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            i83Var.f = dimensionPixelSize2;
            i83Var.b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            i83Var.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.C = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.D = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.n = iy2VarL.e(4);
        this.o = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.r = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable drawableE = iy2VarL.e(16);
        if (drawableE != null) {
            setNavigationIcon(drawableE);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable drawableE2 = iy2VarL.e(11);
        if (drawableE2 != null) {
            setLogo(drawableE2);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(iy2VarL.d(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(iy2VarL.d(20));
        }
        if (typedArray.hasValue(14)) {
            getMenuInflater().inflate(typedArray.getResourceId(14, 0), getMenu());
        }
        iy2VarL.n();
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i = 0; i < menu.size(); i++) {
            arrayList.add(menu.getItem(i));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new wp3(getContext());
    }

    public static j44 h() {
        j44 j44Var = new j44(-2, -2);
        j44Var.b = 0;
        j44Var.a = 8388627;
        return j44Var;
    }

    public static j44 i(ViewGroup.LayoutParams layoutParams) {
        boolean z = layoutParams instanceof j44;
        if (z) {
            j44 j44Var = (j44) layoutParams;
            j44 j44Var2 = new j44(j44Var);
            j44Var2.b = 0;
            j44Var2.b = j44Var.b;
            return j44Var2;
        }
        if (z) {
            j44 j44Var3 = new j44((j44) layoutParams);
            j44Var3.b = 0;
            return j44Var3;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            j44 j44Var4 = new j44(layoutParams);
            j44Var4.b = 0;
            return j44Var4;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        j44 j44Var5 = new j44(marginLayoutParams);
        j44Var5.b = 0;
        ((ViewGroup.MarginLayoutParams) j44Var5).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) j44Var5).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) j44Var5).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) j44Var5).bottomMargin = marginLayoutParams.bottomMargin;
        return j44Var5;
    }

    public static int k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(ArrayList arrayList, int i) {
        boolean z = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection());
        arrayList.clear();
        if (!z) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                j44 j44Var = (j44) childAt.getLayoutParams();
                if (j44Var.b == 0 && s(childAt)) {
                    int i3 = j44Var.a;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i3, layoutDirection) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = layoutDirection == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i4 = childCount - 1; i4 >= 0; i4--) {
            View childAt2 = getChildAt(i4);
            j44 j44Var2 = (j44) childAt2.getLayoutParams();
            if (j44Var2.b == 0 && s(childAt2)) {
                int i5 = j44Var2.a;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i5, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    public final void b(View view, boolean z) {
        j44 j44VarI;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            j44VarI = h();
        } else {
            j44VarI = !checkLayoutParams(layoutParams) ? i(layoutParams) : (j44) layoutParams;
        }
        j44VarI.b = 1;
        if (!z || this.q == null) {
            addView(view, j44VarI);
        } else {
            view.setLayoutParams(j44VarI);
            this.M.add(view);
        }
    }

    public final void c() {
        if (this.p == null) {
            fj fjVar = new fj(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.p = fjVar;
            fjVar.setImageDrawable(this.n);
            this.p.setContentDescription(this.o);
            j44 j44VarH = h();
            j44VarH.a = (this.v & 112) | 8388611;
            j44VarH.b = 2;
            this.p.setLayoutParams(j44VarH);
            this.p.setOnClickListener(new u2(2, this));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof j44);
    }

    public final void d() {
        if (this.B == null) {
            i83 i83Var = new i83();
            i83Var.a = 0;
            i83Var.b = 0;
            i83Var.c = Integer.MIN_VALUE;
            i83Var.d = Integer.MIN_VALUE;
            i83Var.e = 0;
            i83Var.f = 0;
            i83Var.g = false;
            i83Var.h = false;
            this.B = i83Var;
        }
    }

    public final void e() {
        f();
        ActionMenuView actionMenuView = this.c;
        if (actionMenuView.x == null) {
            hc2 hc2Var = (hc2) actionMenuView.getMenu();
            if (this.T == null) {
                this.T = new i44(this);
            }
            this.c.setExpandedActionViewsExclusive(true);
            hc2Var.b(this.T, this.r);
            t();
        }
    }

    public final void f() {
        if (this.c == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.c = actionMenuView;
            actionMenuView.setPopupTheme(this.s);
            this.c.setOnMenuItemClickListener(this.Q);
            ActionMenuView actionMenuView2 = this.c;
            g44 g44Var = new g44(this);
            actionMenuView2.getClass();
            actionMenuView2.C = g44Var;
            j44 j44VarH = h();
            j44VarH.a = (this.v & 112) | 8388613;
            this.c.setLayoutParams(j44VarH);
            b(this.c, false);
        }
    }

    public final void g() {
        if (this.l == null) {
            this.l = new fj(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            j44 j44VarH = h();
            j44VarH.a = (this.v & 112) | 8388611;
            this.l.setLayoutParams(j44VarH);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return h();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        j44 j44Var = new j44(context, attributeSet);
        j44Var.a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g23.b);
        j44Var.a = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        j44Var.b = 0;
        return j44Var;
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    public CharSequence getCollapseContentDescription() {
        fj fjVar = this.p;
        if (fjVar != null) {
            return fjVar.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        fj fjVar = this.p;
        if (fjVar != null) {
            return fjVar.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        i83 i83Var = this.B;
        if (i83Var != null) {
            return i83Var.g ? i83Var.a : i83Var.b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.D;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        i83 i83Var = this.B;
        if (i83Var != null) {
            return i83Var.a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        i83 i83Var = this.B;
        if (i83Var != null) {
            return i83Var.b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        i83 i83Var = this.B;
        if (i83Var != null) {
            return i83Var.g ? i83Var.b : i83Var.a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.C;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        hc2 hc2Var;
        ActionMenuView actionMenuView = this.c;
        return (actionMenuView == null || (hc2Var = actionMenuView.x) == null || !hc2Var.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.D, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.C, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        hj hjVar = this.m;
        if (hjVar != null) {
            return hjVar.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        hj hjVar = this.m;
        if (hjVar != null) {
            return hjVar.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.c.getMenu();
    }

    public View getNavButtonView() {
        return this.l;
    }

    public CharSequence getNavigationContentDescription() {
        fj fjVar = this.l;
        if (fjVar != null) {
            return fjVar.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        fj fjVar = this.l;
        if (fjVar != null) {
            return fjVar.getDrawable();
        }
        return null;
    }

    public g3 getOuterActionMenuPresenter() {
        return this.S;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.c.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.r;
    }

    public int getPopupTheme() {
        return this.s;
    }

    public CharSequence getSubtitle() {
        return this.G;
    }

    public final TextView getSubtitleTextView() {
        return this.h;
    }

    public CharSequence getTitle() {
        return this.F;
    }

    public int getTitleMarginBottom() {
        return this.A;
    }

    public int getTitleMarginEnd() {
        return this.y;
    }

    public int getTitleMarginStart() {
        return this.x;
    }

    public int getTitleMarginTop() {
        return this.z;
    }

    public final TextView getTitleTextView() {
        return this.d;
    }

    public js0 getWrapper() {
        Drawable drawable;
        if (this.R == null) {
            o44 o44Var = new o44();
            o44Var.n = 0;
            o44Var.a = this;
            o44Var.h = getTitle();
            o44Var.i = getSubtitle();
            o44Var.g = o44Var.h != null;
            o44Var.f = getNavigationIcon();
            iy2 iy2VarL = iy2.l(getContext(), null, g23.a, R.attr.actionBarStyle);
            TypedArray typedArray = (TypedArray) iy2VarL.h;
            o44Var.o = iy2VarL.e(15);
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                o44Var.g = true;
                o44Var.h = text;
                if ((o44Var.b & 8) != 0) {
                    setTitle(text);
                    if (o44Var.g) {
                        zc4.i(getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                o44Var.i = text2;
                if ((o44Var.b & 8) != 0) {
                    setSubtitle(text2);
                }
            }
            Drawable drawableE = iy2VarL.e(20);
            if (drawableE != null) {
                o44Var.e = drawableE;
                o44Var.c();
            }
            Drawable drawableE2 = iy2VarL.e(17);
            if (drawableE2 != null) {
                o44Var.d = drawableE2;
                o44Var.c();
            }
            if (o44Var.f == null && (drawable = o44Var.o) != null) {
                o44Var.f = drawable;
                if ((o44Var.b & 4) != 0) {
                    setNavigationIcon(drawable);
                } else {
                    setNavigationIcon((Drawable) null);
                }
            }
            o44Var.a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View viewInflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
                View view = o44Var.c;
                if (view != null && (o44Var.b & 16) != 0) {
                    removeView(view);
                }
                o44Var.c = viewInflate;
                if (viewInflate != null && (o44Var.b & 16) != 0) {
                    addView(viewInflate);
                }
                o44Var.a(o44Var.b | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                layoutParams.height = layoutDimension;
                setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                int iMax = Math.max(dimensionPixelOffset, 0);
                int iMax2 = Math.max(dimensionPixelOffset2, 0);
                d();
                this.B.a(iMax, iMax2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = getContext();
                this.t = resourceId2;
                kk kkVar = this.d;
                if (kkVar != null) {
                    kkVar.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = getContext();
                this.u = resourceId3;
                kk kkVar2 = this.h;
                if (kkVar2 != null) {
                    kkVar2.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                setPopupTheme(resourceId4);
            }
            iy2VarL.n();
            if (R.string.abc_action_bar_up_description != o44Var.n) {
                o44Var.n = R.string.abc_action_bar_up_description;
                if (TextUtils.isEmpty(getNavigationContentDescription())) {
                    int i = o44Var.n;
                    o44Var.j = i != 0 ? getContext().getString(i) : null;
                    o44Var.b();
                }
            }
            o44Var.j = getNavigationContentDescription();
            setNavigationOnClickListener(new m44(o44Var));
            this.R = o44Var;
        }
        return this.R;
    }

    public final int j(View view, int i) {
        j44 j44Var = (j44) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i3 = j44Var.a & 112;
        if (i3 != 16 && i3 != 48 && i3 != 80) {
            i3 = this.E & 112;
        }
        if (i3 == 48) {
            return getPaddingTop() - i2;
        }
        if (i3 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) j44Var).bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i4 = ((ViewGroup.MarginLayoutParams) j44Var).topMargin;
        if (iMax < i4) {
            iMax = i4;
        } else {
            int i5 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i6 = ((ViewGroup.MarginLayoutParams) j44Var).bottomMargin;
            if (i5 < i6) {
                iMax = Math.max(0, iMax - (i6 - i5));
            }
        }
        return paddingTop + iMax;
    }

    public final void m() {
        ArrayList arrayList = this.P;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            getMenu().removeItem(((MenuItem) obj).getItemId());
        }
        getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.O.h).iterator();
        while (it.hasNext()) {
            ((gd1) it.next()).a.k();
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.P = currentMenuItems2;
    }

    public final boolean n(View view) {
        return view.getParent() == this || this.M.contains(view);
    }

    public final int o(View view, int i, int i2, int[] iArr) {
        j44 j44Var = (j44) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) j44Var).leftMargin - iArr[0];
        int iMax = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int iJ = j(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iJ, iMax + measuredWidth, view.getMeasuredHeight() + iJ);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) j44Var).rightMargin + iMax;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        t();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.b0);
        t();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.K = false;
        }
        if (!this.K) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.K = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.K = false;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x024b  */
    /* JADX WARN: Code duplicated, block: B:102:0x024e  */
    /* JADX WARN: Code duplicated, block: B:103:0x0270  */
    /* JADX WARN: Code duplicated, block: B:105:0x0273  */
    /* JADX WARN: Code duplicated, block: B:108:0x0285 A[LOOP:0: B:107:0x0283->B:108:0x0285, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:111:0x029d A[LOOP:1: B:110:0x029b->B:111:0x029d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:114:0x02bd A[LOOP:2: B:113:0x02bb->B:114:0x02bd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:118:0x0303 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:119:0x0305  */
    /* JADX WARN: Code duplicated, block: B:120:0x0309  */
    /* JADX WARN: Code duplicated, block: B:123:0x0310 A[LOOP:3: B:122:0x030e->B:123:0x0310, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:20:0x0060  */
    /* JADX WARN: Code duplicated, block: B:22:0x0064  */
    /* JADX WARN: Code duplicated, block: B:23:0x0069  */
    /* JADX WARN: Code duplicated, block: B:26:0x0075  */
    /* JADX WARN: Code duplicated, block: B:28:0x0079  */
    /* JADX WARN: Code duplicated, block: B:29:0x007e  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:47:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:48:0x0115  */
    /* JADX WARN: Code duplicated, block: B:51:0x011b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x011d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0120  */
    /* JADX WARN: Code duplicated, block: B:55:0x0124  */
    /* JADX WARN: Code duplicated, block: B:56:0x0127  */
    /* JADX WARN: Code duplicated, block: B:59:0x0139  */
    /* JADX WARN: Code duplicated, block: B:61:0x0141 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:68:0x015a  */
    /* JADX WARN: Code duplicated, block: B:70:0x015e  */
    /* JADX WARN: Code duplicated, block: B:72:0x016f  */
    /* JADX WARN: Code duplicated, block: B:73:0x0171  */
    /* JADX WARN: Code duplicated, block: B:75:0x017d  */
    /* JADX WARN: Code duplicated, block: B:77:0x0189  */
    /* JADX WARN: Code duplicated, block: B:78:0x0193  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:82:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:85:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:86:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:88:0x01df  */
    /* JADX WARN: Code duplicated, block: B:89:0x0203  */
    /* JADX WARN: Code duplicated, block: B:91:0x0206  */
    /* JADX WARN: Code duplicated, block: B:93:0x020e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:94:0x0210  */
    /* JADX WARN: Code duplicated, block: B:96:0x0214  */
    /* JADX WARN: Code duplicated, block: B:99:0x0228  */
    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iO;
        int iP;
        int iMax;
        int iMin;
        boolean zS;
        boolean zS2;
        int measuredHeight;
        kk kkVar;
        kk kkVar2;
        j44 j44Var;
        j44 j44Var2;
        int i5;
        boolean z2;
        int i6;
        int i7;
        int paddingTop;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int iMax2;
        int i14;
        int i15;
        int i16;
        int i17;
        ArrayList arrayList;
        int size;
        int iO2;
        int i18;
        int size2;
        int i19;
        int i20;
        int size3;
        int i21;
        int i22;
        int measuredWidth;
        int i23;
        int i24;
        int i25;
        int size4;
        hj hjVar;
        View view;
        ActionMenuView actionMenuView;
        fj fjVar;
        boolean z3 = getLayoutDirection() == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i26 = width - paddingRight;
        int[] iArr = this.N;
        iArr[1] = 0;
        iArr[0] = 0;
        WeakHashMap weakHashMap = zc4.a;
        int minimumHeight = getMinimumHeight();
        int iMin2 = minimumHeight >= 0 ? Math.min(minimumHeight, i4 - i2) : 0;
        if (s(this.l)) {
            fj fjVar2 = this.l;
            if (z3) {
                iP = p(fjVar2, i26, iMin2, iArr);
                iO = paddingLeft;
            } else {
                iO = o(fjVar2, paddingLeft, iMin2, iArr);
            }
            if (s(this.p)) {
                fjVar = this.p;
                if (z3) {
                    iP = p(fjVar, iP, iMin2, iArr);
                } else {
                    iO = o(fjVar, iO, iMin2, iArr);
                }
            }
            if (s(this.c)) {
                actionMenuView = this.c;
                if (z3) {
                    iO = o(actionMenuView, iO, iMin2, iArr);
                } else {
                    iP = p(actionMenuView, iP, iMin2, iArr);
                }
            }
            int currentContentInsetLeft = getCurrentContentInsetLeft();
            int currentContentInsetRight = getCurrentContentInsetRight();
            iArr[0] = Math.max(0, currentContentInsetLeft - iO);
            iArr[1] = Math.max(0, currentContentInsetRight - (i26 - iP));
            iMax = Math.max(iO, currentContentInsetLeft);
            iMin = Math.min(iP, i26 - currentContentInsetRight);
            if (s(this.q)) {
                view = this.q;
                if (z3) {
                    iMin = p(view, iMin, iMin2, iArr);
                } else {
                    iMax = o(view, iMax, iMin2, iArr);
                }
            }
            if (s(this.m)) {
                hjVar = this.m;
                if (z3) {
                    iMin = p(hjVar, iMin, iMin2, iArr);
                } else {
                    iMax = o(hjVar, iMax, iMin2, iArr);
                }
            }
            zS = s(this.d);
            zS2 = s(this.h);
            if (zS) {
                j44 j44Var3 = (j44) this.d.getLayoutParams();
                measuredHeight = this.d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) j44Var3).topMargin + ((ViewGroup.MarginLayoutParams) j44Var3).bottomMargin;
            } else {
                measuredHeight = 0;
            }
            if (zS2) {
                j44 j44Var4 = (j44) this.h.getLayoutParams();
                measuredHeight = this.h.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) j44Var4).topMargin + ((ViewGroup.MarginLayoutParams) j44Var4).bottomMargin + measuredHeight;
            }
            if (zS || zS2) {
                if (zS) {
                    kkVar = this.d;
                } else {
                    kkVar = this.h;
                }
                if (zS2) {
                    kkVar2 = this.h;
                } else {
                    kkVar2 = this.d;
                }
                j44Var = (j44) kkVar.getLayoutParams();
                j44Var2 = (j44) kkVar2.getLayoutParams();
                i5 = measuredHeight;
                z2 = (!zS && this.d.getMeasuredWidth() > 0) || (zS2 && this.h.getMeasuredWidth() > 0);
                i6 = this.E & 112;
                i7 = iMax;
                if (i6 == 48) {
                    paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) j44Var).topMargin + this.z;
                } else if (i6 != 80) {
                    iMax2 = (((height - paddingTop2) - paddingBottom) - i5) / 2;
                    i14 = ((ViewGroup.MarginLayoutParams) j44Var).topMargin + this.z;
                    if (iMax2 < i14) {
                        iMax2 = i14;
                    } else {
                        i15 = (((height - paddingBottom) - i5) - iMax2) - paddingTop2;
                        i16 = ((ViewGroup.MarginLayoutParams) j44Var).bottomMargin;
                        i17 = this.A;
                        if (i15 < i16 + i17) {
                            iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) j44Var2).bottomMargin + i17) - i15));
                        }
                    }
                    paddingTop = paddingTop2 + iMax2;
                } else {
                    paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) j44Var2).bottomMargin) - this.A) - i5;
                }
                if (z3) {
                    if (z2) {
                        i11 = this.x;
                    } else {
                        i11 = 0;
                    }
                    int i27 = i11 - iArr[1];
                    iMin -= Math.max(0, i27);
                    iArr[1] = Math.max(0, -i27);
                    if (zS) {
                        j44 j44Var5 = (j44) this.d.getLayoutParams();
                        int measuredWidth2 = iMin - this.d.getMeasuredWidth();
                        int measuredHeight2 = this.d.getMeasuredHeight() + paddingTop;
                        this.d.layout(measuredWidth2, paddingTop, iMin, measuredHeight2);
                        i12 = measuredWidth2 - this.y;
                        paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) j44Var5).bottomMargin;
                    } else {
                        i12 = iMin;
                    }
                    if (zS2) {
                        int i28 = paddingTop + ((ViewGroup.MarginLayoutParams) ((j44) this.h.getLayoutParams())).topMargin;
                        this.h.layout(iMin - this.h.getMeasuredWidth(), i28, iMin, this.h.getMeasuredHeight() + i28);
                        i13 = iMin - this.y;
                    } else {
                        i13 = iMin;
                    }
                    if (z2) {
                        iMin = Math.min(i12, i13);
                    }
                    iMax = i7;
                } else {
                    if (z2) {
                        i8 = this.x;
                    } else {
                        i8 = 0;
                    }
                    int i29 = i8 - iArr[0];
                    iMax = Math.max(0, i29) + i7;
                    iArr[0] = Math.max(0, -i29);
                    if (zS) {
                        j44 j44Var6 = (j44) this.d.getLayoutParams();
                        int measuredWidth3 = this.d.getMeasuredWidth() + iMax;
                        int measuredHeight3 = this.d.getMeasuredHeight() + paddingTop;
                        this.d.layout(iMax, paddingTop, measuredWidth3, measuredHeight3);
                        i9 = measuredWidth3 + this.y;
                        paddingTop = measuredHeight3 + ((ViewGroup.MarginLayoutParams) j44Var6).bottomMargin;
                    } else {
                        i9 = iMax;
                    }
                    if (zS2) {
                        int i30 = paddingTop + ((ViewGroup.MarginLayoutParams) ((j44) this.h.getLayoutParams())).topMargin;
                        int measuredWidth4 = this.h.getMeasuredWidth() + iMax;
                        this.h.layout(iMax, i30, measuredWidth4, this.h.getMeasuredHeight() + i30);
                        i10 = measuredWidth4 + this.y;
                    } else {
                        i10 = iMax;
                    }
                    if (z2) {
                        iMax = Math.max(i9, i10);
                    }
                }
            }
            arrayList = this.L;
            a(arrayList, 3);
            size = arrayList.size();
            iO2 = iMax;
            for (i18 = 0; i18 < size; i18++) {
                iO2 = o((View) arrayList.get(i18), iO2, iMin2, iArr);
            }
            a(arrayList, 5);
            size2 = arrayList.size();
            for (i19 = 0; i19 < size2; i19++) {
                iMin = p((View) arrayList.get(i19), iMin, iMin2, iArr);
            }
            a(arrayList, 1);
            int i31 = iArr[0];
            i20 = iArr[1];
            size3 = arrayList.size();
            i21 = i31;
            i22 = 0;
            measuredWidth = 0;
            while (i22 < size3) {
                View view2 = (View) arrayList.get(i22);
                j44 j44Var7 = (j44) view2.getLayoutParams();
                int i32 = i20;
                int i33 = ((ViewGroup.MarginLayoutParams) j44Var7).leftMargin - i21;
                int i34 = ((ViewGroup.MarginLayoutParams) j44Var7).rightMargin - i32;
                int iMax3 = Math.max(0, i33);
                int iMax4 = Math.max(0, i34);
                int iMax5 = Math.max(0, -i33);
                int iMax6 = Math.max(0, -i34);
                measuredWidth += view2.getMeasuredWidth() + iMax3 + iMax4;
                i22++;
                i21 = iMax5;
                i20 = iMax6;
            }
            i24 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (measuredWidth / 2);
            i25 = measuredWidth + i24;
            if (i24 >= iO2) {
                if (i25 > iMin) {
                    iO2 = i24 - (i25 - iMin);
                } else {
                    iO2 = i24;
                }
            }
            size4 = arrayList.size();
            for (i23 = 0; i23 < size4; i23++) {
                iO2 = o((View) arrayList.get(i23), iO2, iMin2, iArr);
            }
            arrayList.clear();
        }
        iO = paddingLeft;
        iP = i26;
        if (s(this.p)) {
            fjVar = this.p;
            if (z3) {
                iP = p(fjVar, iP, iMin2, iArr);
            } else {
                iO = o(fjVar, iO, iMin2, iArr);
            }
        }
        if (s(this.c)) {
            actionMenuView = this.c;
            if (z3) {
                iO = o(actionMenuView, iO, iMin2, iArr);
            } else {
                iP = p(actionMenuView, iP, iMin2, iArr);
            }
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - iO);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i26 - iP));
        iMax = Math.max(iO, currentContentInsetLeft2);
        iMin = Math.min(iP, i26 - currentContentInsetRight2);
        if (s(this.q)) {
            view = this.q;
            if (z3) {
                iMin = p(view, iMin, iMin2, iArr);
            } else {
                iMax = o(view, iMax, iMin2, iArr);
            }
        }
        if (s(this.m)) {
            hjVar = this.m;
            if (z3) {
                iMin = p(hjVar, iMin, iMin2, iArr);
            } else {
                iMax = o(hjVar, iMax, iMin2, iArr);
            }
        }
        zS = s(this.d);
        zS2 = s(this.h);
        if (zS) {
            j44 j44Var8 = (j44) this.d.getLayoutParams();
            measuredHeight = this.d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) j44Var8).topMargin + ((ViewGroup.MarginLayoutParams) j44Var8).bottomMargin;
        } else {
            measuredHeight = 0;
        }
        if (zS2) {
            j44 j44Var9 = (j44) this.h.getLayoutParams();
            measuredHeight = this.h.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) j44Var9).topMargin + ((ViewGroup.MarginLayoutParams) j44Var9).bottomMargin + measuredHeight;
        }
        if (zS) {
            if (zS) {
                kkVar = this.d;
            } else {
                kkVar = this.h;
            }
            if (zS2) {
                kkVar2 = this.h;
            } else {
                kkVar2 = this.d;
            }
            j44Var = (j44) kkVar.getLayoutParams();
            j44Var2 = (j44) kkVar2.getLayoutParams();
            i5 = measuredHeight;
            if (zS) {
            }
            i6 = this.E & 112;
            i7 = iMax;
            if (i6 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) j44Var).topMargin + this.z;
            } else if (i6 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - i5) / 2;
                i14 = ((ViewGroup.MarginLayoutParams) j44Var).topMargin + this.z;
                if (iMax2 < i14) {
                    iMax2 = i14;
                } else {
                    i15 = (((height - paddingBottom) - i5) - iMax2) - paddingTop2;
                    i16 = ((ViewGroup.MarginLayoutParams) j44Var).bottomMargin;
                    i17 = this.A;
                    if (i15 < i16 + i17) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) j44Var2).bottomMargin + i17) - i15));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) j44Var2).bottomMargin) - this.A) - i5;
            }
            if (z3) {
                if (z2) {
                    i11 = this.x;
                } else {
                    i11 = 0;
                }
                int i210 = i11 - iArr[1];
                iMin -= Math.max(0, i210);
                iArr[1] = Math.max(0, -i210);
                if (zS) {
                    j44 j44Var10 = (j44) this.d.getLayoutParams();
                    int measuredWidth5 = iMin - this.d.getMeasuredWidth();
                    int measuredHeight4 = this.d.getMeasuredHeight() + paddingTop;
                    this.d.layout(measuredWidth5, paddingTop, iMin, measuredHeight4);
                    i12 = measuredWidth5 - this.y;
                    paddingTop = measuredHeight4 + ((ViewGroup.MarginLayoutParams) j44Var10).bottomMargin;
                } else {
                    i12 = iMin;
                }
                if (zS2) {
                    int i211 = paddingTop + ((ViewGroup.MarginLayoutParams) ((j44) this.h.getLayoutParams())).topMargin;
                    this.h.layout(iMin - this.h.getMeasuredWidth(), i211, iMin, this.h.getMeasuredHeight() + i211);
                    i13 = iMin - this.y;
                } else {
                    i13 = iMin;
                }
                if (z2) {
                    iMin = Math.min(i12, i13);
                }
                iMax = i7;
            } else {
                if (z2) {
                    i8 = this.x;
                } else {
                    i8 = 0;
                }
                int i212 = i8 - iArr[0];
                iMax = Math.max(0, i212) + i7;
                iArr[0] = Math.max(0, -i212);
                if (zS) {
                    j44 j44Var11 = (j44) this.d.getLayoutParams();
                    int measuredWidth6 = this.d.getMeasuredWidth() + iMax;
                    int measuredHeight5 = this.d.getMeasuredHeight() + paddingTop;
                    this.d.layout(iMax, paddingTop, measuredWidth6, measuredHeight5);
                    i9 = measuredWidth6 + this.y;
                    paddingTop = measuredHeight5 + ((ViewGroup.MarginLayoutParams) j44Var11).bottomMargin;
                } else {
                    i9 = iMax;
                }
                if (zS2) {
                    int i35 = paddingTop + ((ViewGroup.MarginLayoutParams) ((j44) this.h.getLayoutParams())).topMargin;
                    int measuredWidth7 = this.h.getMeasuredWidth() + iMax;
                    this.h.layout(iMax, i35, measuredWidth7, this.h.getMeasuredHeight() + i35);
                    i10 = measuredWidth7 + this.y;
                } else {
                    i10 = iMax;
                }
                if (z2) {
                    iMax = Math.max(i9, i10);
                }
            }
        } else {
            if (zS) {
                kkVar = this.d;
            } else {
                kkVar = this.h;
            }
            if (zS2) {
                kkVar2 = this.h;
            } else {
                kkVar2 = this.d;
            }
            j44Var = (j44) kkVar.getLayoutParams();
            j44Var2 = (j44) kkVar2.getLayoutParams();
            i5 = measuredHeight;
            if (zS) {
            }
            i6 = this.E & 112;
            i7 = iMax;
            if (i6 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) j44Var).topMargin + this.z;
            } else if (i6 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - i5) / 2;
                i14 = ((ViewGroup.MarginLayoutParams) j44Var).topMargin + this.z;
                if (iMax2 < i14) {
                    iMax2 = i14;
                } else {
                    i15 = (((height - paddingBottom) - i5) - iMax2) - paddingTop2;
                    i16 = ((ViewGroup.MarginLayoutParams) j44Var).bottomMargin;
                    i17 = this.A;
                    if (i15 < i16 + i17) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) j44Var2).bottomMargin + i17) - i15));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) j44Var2).bottomMargin) - this.A) - i5;
            }
            if (z3) {
                if (z2) {
                    i11 = this.x;
                } else {
                    i11 = 0;
                }
                int i213 = i11 - iArr[1];
                iMin -= Math.max(0, i213);
                iArr[1] = Math.max(0, -i213);
                if (zS) {
                    j44 j44Var12 = (j44) this.d.getLayoutParams();
                    int measuredWidth8 = iMin - this.d.getMeasuredWidth();
                    int measuredHeight6 = this.d.getMeasuredHeight() + paddingTop;
                    this.d.layout(measuredWidth8, paddingTop, iMin, measuredHeight6);
                    i12 = measuredWidth8 - this.y;
                    paddingTop = measuredHeight6 + ((ViewGroup.MarginLayoutParams) j44Var12).bottomMargin;
                } else {
                    i12 = iMin;
                }
                if (zS2) {
                    int i214 = paddingTop + ((ViewGroup.MarginLayoutParams) ((j44) this.h.getLayoutParams())).topMargin;
                    this.h.layout(iMin - this.h.getMeasuredWidth(), i214, iMin, this.h.getMeasuredHeight() + i214);
                    i13 = iMin - this.y;
                } else {
                    i13 = iMin;
                }
                if (z2) {
                    iMin = Math.min(i12, i13);
                }
                iMax = i7;
            } else {
                if (z2) {
                    i8 = this.x;
                } else {
                    i8 = 0;
                }
                int i215 = i8 - iArr[0];
                iMax = Math.max(0, i215) + i7;
                iArr[0] = Math.max(0, -i215);
                if (zS) {
                    j44 j44Var13 = (j44) this.d.getLayoutParams();
                    int measuredWidth9 = this.d.getMeasuredWidth() + iMax;
                    int measuredHeight7 = this.d.getMeasuredHeight() + paddingTop;
                    this.d.layout(iMax, paddingTop, measuredWidth9, measuredHeight7);
                    i9 = measuredWidth9 + this.y;
                    paddingTop = measuredHeight7 + ((ViewGroup.MarginLayoutParams) j44Var13).bottomMargin;
                } else {
                    i9 = iMax;
                }
                if (zS2) {
                    int i36 = paddingTop + ((ViewGroup.MarginLayoutParams) ((j44) this.h.getLayoutParams())).topMargin;
                    int measuredWidth10 = this.h.getMeasuredWidth() + iMax;
                    this.h.layout(iMax, i36, measuredWidth10, this.h.getMeasuredHeight() + i36);
                    i10 = measuredWidth10 + this.y;
                } else {
                    i10 = iMax;
                }
                if (z2) {
                    iMax = Math.max(i9, i10);
                }
            }
        }
        arrayList = this.L;
        a(arrayList, 3);
        size = arrayList.size();
        iO2 = iMax;
        while (i18 < size) {
            iO2 = o((View) arrayList.get(i18), iO2, iMin2, iArr);
        }
        a(arrayList, 5);
        size2 = arrayList.size();
        while (i19 < size2) {
            iMin = p((View) arrayList.get(i19), iMin, iMin2, iArr);
        }
        a(arrayList, 1);
        int i37 = iArr[0];
        i20 = iArr[1];
        size3 = arrayList.size();
        i21 = i37;
        i22 = 0;
        measuredWidth = 0;
        while (i22 < size3) {
            View view3 = (View) arrayList.get(i22);
            j44 j44Var14 = (j44) view3.getLayoutParams();
            int i38 = i20;
            int i39 = ((ViewGroup.MarginLayoutParams) j44Var14).leftMargin - i21;
            int i310 = ((ViewGroup.MarginLayoutParams) j44Var14).rightMargin - i38;
            int iMax7 = Math.max(0, i39);
            int iMax8 = Math.max(0, i310);
            int iMax9 = Math.max(0, -i39);
            int iMax10 = Math.max(0, -i310);
            measuredWidth += view3.getMeasuredWidth() + iMax7 + iMax8;
            i22++;
            i21 = iMax9;
            i20 = iMax10;
        }
        i24 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (measuredWidth / 2);
        i25 = measuredWidth + i24;
        if (i24 >= iO2) {
            if (i25 > iMin) {
                iO2 = i24 - (i25 - iMin);
            } else {
                iO2 = i24;
            }
        }
        size4 = arrayList.size();
        while (i23 < size4) {
            iO2 = o((View) arrayList.get(i23), iO2, iMin2, iArr);
        }
        arrayList.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        char c;
        Object[] objArr;
        int iK;
        int iMax;
        int iCombineMeasuredStates;
        int iK2;
        int iL;
        int iCombineMeasuredStates2;
        int iMax2;
        boolean z = yd4.a;
        int i3 = 0;
        if (getLayoutDirection() == 1) {
            objArr = true;
            c = 0;
        } else {
            c = 1;
            objArr = false;
        }
        if (s(this.l)) {
            r(this.l, i, 0, i2, this.w);
            iK = k(this.l) + this.l.getMeasuredWidth();
            iMax = Math.max(0, l(this.l) + this.l.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.l.getMeasuredState());
        } else {
            iK = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (s(this.p)) {
            r(this.p, i, 0, i2, this.w);
            iK = k(this.p) + this.p.getMeasuredWidth();
            iMax = Math.max(iMax, l(this.p) + this.p.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.p.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, iK);
        int iMax4 = Math.max(0, currentContentInsetStart - iK);
        Object[] objArr2 = objArr;
        int[] iArr = this.N;
        iArr[objArr2 == true ? 1 : 0] = iMax4;
        if (s(this.c)) {
            r(this.c, i, iMax3, i2, this.w);
            iK2 = k(this.c) + this.c.getMeasuredWidth();
            iMax = Math.max(iMax, l(this.c) + this.c.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.c.getMeasuredState());
        } else {
            iK2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax5 = iMax3 + Math.max(currentContentInsetEnd, iK2);
        iArr[c] = Math.max(0, currentContentInsetEnd - iK2);
        if (s(this.q)) {
            iMax5 += q(this.q, i, iMax5, i2, 0, iArr);
            iMax = Math.max(iMax, l(this.q) + this.q.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.q.getMeasuredState());
        }
        if (s(this.m)) {
            iMax5 += q(this.m, i, iMax5, i2, 0, iArr);
            iMax = Math.max(iMax, l(this.m) + this.m.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.m.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (((j44) childAt.getLayoutParams()).b == 0 && s(childAt)) {
                iMax5 += q(childAt, i, iMax5, i2, 0, iArr);
                int iMax6 = Math.max(iMax, l(childAt) + childAt.getMeasuredHeight());
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
                iMax = iMax6;
            } else {
                iMax5 = iMax5;
            }
        }
        int i5 = iMax5;
        int i6 = this.z + this.A;
        int i7 = this.x + this.y;
        if (s(this.d)) {
            q(this.d, i, i5 + i7, i2, i6, iArr);
            int iK3 = k(this.d) + this.d.getMeasuredWidth();
            iL = l(this.d) + this.d.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.d.getMeasuredState());
            iMax2 = iK3;
        } else {
            iL = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
        }
        if (s(this.h)) {
            iMax2 = Math.max(iMax2, q(this.h, i, i5 + i7, i2, i6 + iL, iArr));
            iL += l(this.h) + this.h.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.h.getMeasuredState());
        }
        int iMax7 = Math.max(iMax, iL);
        int paddingRight = getPaddingRight() + getPaddingLeft() + i5 + iMax2;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + iMax7;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, (-16777216) & iCombineMeasuredStates2);
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16);
        if (!this.U) {
            i3 = iResolveSizeAndState2;
            break;
        }
        int childCount2 = getChildCount();
        for (int i8 = 0; i8 < childCount2; i8++) {
            View childAt2 = getChildAt(i8);
            if (s(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                i3 = iResolveSizeAndState2;
                break;
            }
        }
        setMeasuredDimension(iResolveSizeAndState, i3);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof l44)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        l44 l44Var = (l44) parcelable;
        super.onRestoreInstanceState(l44Var.c);
        ActionMenuView actionMenuView = this.c;
        hc2 hc2Var = actionMenuView != null ? actionMenuView.x : null;
        int i = l44Var.h;
        if (i != 0 && this.T != null && hc2Var != null && (menuItemFindItem = hc2Var.findItem(i)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (l44Var.l) {
            im imVar = this.b0;
            removeCallbacks(imVar);
            post(imVar);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        d();
        i83 i83Var = this.B;
        boolean z = i == 1;
        if (z == i83Var.g) {
            return;
        }
        i83Var.g = z;
        if (!i83Var.h) {
            i83Var.a = i83Var.e;
            i83Var.b = i83Var.f;
            return;
        }
        if (z) {
            int i2 = i83Var.d;
            if (i2 == Integer.MIN_VALUE) {
                i2 = i83Var.e;
            }
            i83Var.a = i2;
            int i3 = i83Var.c;
            if (i3 == Integer.MIN_VALUE) {
                i3 = i83Var.f;
            }
            i83Var.b = i3;
            return;
        }
        int i4 = i83Var.c;
        if (i4 == Integer.MIN_VALUE) {
            i4 = i83Var.e;
        }
        i83Var.a = i4;
        int i5 = i83Var.d;
        if (i5 == Integer.MIN_VALUE) {
            i5 = i83Var.f;
        }
        i83Var.b = i5;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        g3 g3Var;
        mc2 mc2Var;
        l44 l44Var = new l44(super.onSaveInstanceState());
        i44 i44Var = this.T;
        if (i44Var != null && (mc2Var = i44Var.d) != null) {
            l44Var.h = mc2Var.a;
        }
        ActionMenuView actionMenuView = this.c;
        l44Var.l = (actionMenuView == null || (g3Var = actionMenuView.B) == null || !g3Var.k()) ? false : true;
        return l44Var;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.J = false;
        }
        if (!this.J) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.J = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.J = false;
        return true;
    }

    public final int p(View view, int i, int i2, int[] iArr) {
        j44 j44Var = (j44) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) j44Var).rightMargin - iArr[1];
        int iMax = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int iJ = j(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iJ, iMax, view.getMeasuredHeight() + iJ);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) j44Var).leftMargin);
    }

    public final int q(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i6) + Math.max(0, i5);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + iMax + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    public final void r(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i4 >= 0) {
            if (mode != 0) {
                i4 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i4);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final boolean s(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public void setBackInvokedCallbackEnabled(boolean z) {
        if (this.a0 != z) {
            this.a0 = z;
            t();
        }
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        fj fjVar = this.p;
        if (fjVar != null) {
            fjVar.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(y64.y(getContext(), i));
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.p.setImageDrawable(drawable);
        } else {
            fj fjVar = this.p;
            if (fjVar != null) {
                fjVar.setImageDrawable(this.n);
            }
        }
    }

    public void setCollapsible(boolean z) {
        this.U = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.D) {
            this.D = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.C) {
            this.C = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i) {
        setLogo(y64.y(getContext(), i));
    }

    public void setLogo(Drawable drawable) {
        hj hjVar = this.m;
        if (drawable != null) {
            if (hjVar == null) {
                this.m = new hj(getContext(), null, 0);
            }
            if (!n(this.m)) {
                b(this.m, true);
            }
        } else if (hjVar != null && n(hjVar)) {
            removeView(this.m);
            this.M.remove(this.m);
        }
        hj hjVar2 = this.m;
        if (hjVar2 != null) {
            hjVar2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.m == null) {
            this.m = new hj(getContext(), null, 0);
        }
        hj hjVar = this.m;
        if (hjVar != null) {
            hjVar.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        fj fjVar = this.l;
        if (fjVar != null) {
            fjVar.setContentDescription(charSequence);
            xp1.F(this.l, charSequence);
        }
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(y64.y(getContext(), i));
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            if (!n(this.l)) {
                b(this.l, true);
            }
        } else {
            fj fjVar = this.l;
            if (fjVar != null && n(fjVar)) {
                removeView(this.l);
                this.M.remove(this.l);
            }
        }
        fj fjVar2 = this.l;
        if (fjVar2 != null) {
            fjVar2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        g();
        this.l.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(k44 k44Var) {
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.c.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.s != i) {
            this.s = i;
            if (i == 0) {
                this.r = getContext();
            } else {
                this.r = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitle(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        kk kkVar = this.h;
        if (!zIsEmpty) {
            if (kkVar == null) {
                Context context = getContext();
                kk kkVar2 = new kk(context, null);
                this.h = kkVar2;
                kkVar2.setSingleLine();
                this.h.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.u;
                if (i != 0) {
                    this.h.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.I;
                if (colorStateList != null) {
                    this.h.setTextColor(colorStateList);
                }
            }
            if (!n(this.h)) {
                b(this.h, true);
            }
        } else if (kkVar != null && n(kkVar)) {
            removeView(this.h);
            this.M.remove(this.h);
        }
        kk kkVar3 = this.h;
        if (kkVar3 != null) {
            kkVar3.setText(charSequence);
        }
        this.G = charSequence;
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.I = colorStateList;
        kk kkVar = this.h;
        if (kkVar != null) {
            kkVar.setTextColor(colorStateList);
        }
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitle(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        kk kkVar = this.d;
        if (!zIsEmpty) {
            if (kkVar == null) {
                Context context = getContext();
                kk kkVar2 = new kk(context, null);
                this.d = kkVar2;
                kkVar2.setSingleLine();
                this.d.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.t;
                if (i != 0) {
                    this.d.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.H;
                if (colorStateList != null) {
                    this.d.setTextColor(colorStateList);
                }
            }
            if (!n(this.d)) {
                b(this.d, true);
            }
        } else if (kkVar != null && n(kkVar)) {
            removeView(this.d);
            this.M.remove(this.d);
        }
        kk kkVar3 = this.d;
        if (kkVar3 != null) {
            kkVar3.setText(charSequence);
        }
        this.F = charSequence;
    }

    public void setTitleMarginBottom(int i) {
        this.A = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.y = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.x = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.z = i;
        requestLayout();
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.H = colorStateList;
        kk kkVar = this.d;
        if (kkVar != null) {
            kkVar.setTextColor(colorStateList);
        }
    }

    public final void t() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherA = h44.a(this);
            i44 i44Var = this.T;
            int i = 0;
            boolean z = (i44Var == null || i44Var.d == null || onBackInvokedDispatcherA == null || !isAttachedToWindow() || !this.a0) ? false : true;
            if (z && this.W == null) {
                if (this.V == null) {
                    this.V = h44.b(new f44(this, i));
                }
                h44.c(onBackInvokedDispatcherA, this.V);
                this.W = onBackInvokedDispatcherA;
                return;
            }
            if (z || (onBackInvokedDispatcher = this.W) == null) {
                return;
            }
            h44.d(onBackInvokedDispatcher, this.V);
            this.W = null;
        }
    }
}
