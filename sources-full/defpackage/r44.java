package defpackage;

import ai.notrack.app.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class r44 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {
    public static r44 s;
    public static r44 t;
    public final View c;
    public final CharSequence d;
    public final int h;
    public final q44 l;
    public final q44 m;
    public int n;
    public int o;
    public s44 p;
    public boolean q;
    public boolean r;

    /* JADX WARN: Type inference failed for: r0v0, types: [q44] */
    /* JADX WARN: Type inference failed for: r0v1, types: [q44] */
    public r44(View view, CharSequence charSequence) {
        final int i = 0;
        this.l = new Runnable(this) { // from class: q44
            public final /* synthetic */ r44 d;

            {
                this.d = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i;
                r44 r44Var = this.d;
                switch (i2) {
                    case 0:
                        r44Var.c(false);
                        break;
                    default:
                        r44Var.a();
                        break;
                }
            }
        };
        final int i2 = 1;
        this.m = new Runnable(this) { // from class: q44
            public final /* synthetic */ r44 d;

            {
                this.d = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i3 = i2;
                r44 r44Var = this.d;
                switch (i3) {
                    case 0:
                        r44Var.c(false);
                        break;
                    default:
                        r44Var.a();
                        break;
                }
            }
        };
        this.c = view;
        this.d = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = ad4.a;
        this.h = Build.VERSION.SDK_INT >= 28 ? og.m(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
        this.r = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(r44 r44Var) {
        r44 r44Var2 = s;
        if (r44Var2 != null) {
            r44Var2.c.removeCallbacks(r44Var2.l);
        }
        s = r44Var;
        if (r44Var != null) {
            r44Var.c.postDelayed(r44Var.l, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        r44 r44Var = t;
        View view = this.c;
        if (r44Var == this) {
            t = null;
            s44 s44Var = this.p;
            if (s44Var != null) {
                View view2 = (View) s44Var.d;
                if (view2.getParent() != null) {
                    ((WindowManager) ((Context) s44Var.c).getSystemService("window")).removeView(view2);
                }
                this.p = null;
                this.r = true;
                view.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (s == this) {
            b(null);
        }
        view.removeCallbacks(this.m);
    }

    public final void c(boolean z) {
        int height;
        int i;
        int i2;
        int i3;
        long longPressTimeout;
        long j;
        long j2;
        View view = this.c;
        if (view.isAttachedToWindow()) {
            b(null);
            r44 r44Var = t;
            if (r44Var != null) {
                r44Var.a();
            }
            t = this;
            this.q = z;
            Context context = view.getContext();
            s44 s44Var = new s44();
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            s44Var.l = layoutParams;
            s44Var.m = new Rect();
            s44Var.n = new int[2];
            s44Var.o = new int[2];
            s44Var.c = context;
            View viewInflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
            s44Var.d = viewInflate;
            s44Var.h = (TextView) viewInflate.findViewById(R.id.message);
            layoutParams.setTitle(s44.class.getSimpleName());
            layoutParams.packageName = context.getPackageName();
            layoutParams.type = 1002;
            layoutParams.width = -2;
            layoutParams.height = -2;
            layoutParams.format = -3;
            layoutParams.windowAnimations = R.style.Animation_AppCompat_Tooltip;
            layoutParams.flags = 24;
            View view2 = (View) s44Var.d;
            Context context2 = (Context) s44Var.c;
            this.p = s44Var;
            int width = this.n;
            int i4 = this.o;
            boolean z2 = this.q;
            WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) s44Var.l;
            if (view2.getParent() != null && view2.getParent() != null) {
                ((WindowManager) context2.getSystemService("window")).removeView(view2);
            }
            ((TextView) s44Var.h).setText(this.d);
            int[] iArr = (int[]) s44Var.o;
            int[] iArr2 = (int[]) s44Var.n;
            Rect rect = (Rect) s44Var.m;
            layoutParams2.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = context2.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
            if (view.getWidth() < dimensionPixelOffset) {
                width = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = context2.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
                height = i4 + dimensionPixelOffset2;
                i = i4 - dimensionPixelOffset2;
            } else {
                height = view.getHeight();
                i = 0;
            }
            layoutParams2.gravity = 49;
            int dimensionPixelOffset3 = context2.getResources().getDimensionPixelOffset(z2 ? R.dimen.tooltip_y_offset_touch : R.dimen.tooltip_y_offset_non_touch);
            View rootView = view.getRootView();
            ViewGroup.LayoutParams layoutParams3 = rootView.getLayoutParams();
            int i5 = width;
            if (!(layoutParams3 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams3).type != 2) {
                for (Context context3 = view.getContext(); context3 instanceof ContextWrapper; context3 = ((ContextWrapper) context3).getBaseContext()) {
                    if (context3 instanceof Activity) {
                        rootView = ((Activity) context3).getWindow().getDecorView();
                        break;
                    }
                }
            }
            if (rootView == null) {
                Log.e("TooltipPopup", "Cannot find app view");
                i3 = 1;
            } else {
                rootView.getWindowVisibleDisplayFrame(rect);
                if (rect.left >= 0 || rect.top >= 0) {
                    i2 = 0;
                    i3 = 1;
                } else {
                    Resources resources = context2.getResources();
                    i3 = 1;
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    i2 = 0;
                    rect.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                rootView.getLocationOnScreen(iArr);
                view.getLocationOnScreen(iArr2);
                int i6 = iArr2[i2] - iArr[i2];
                iArr2[i2] = i6;
                iArr2[i3] = iArr2[i3] - iArr[i3];
                layoutParams2.x = (i6 + i5) - (rootView.getWidth() / 2);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i2, i2);
                view2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredHeight = view2.getMeasuredHeight();
                int i7 = iArr2[i3];
                int i8 = ((i7 + i) - dimensionPixelOffset3) - measuredHeight;
                int i9 = i7 + height + dimensionPixelOffset3;
                if (z2) {
                    if (i8 >= 0) {
                        layoutParams2.y = i8;
                    } else {
                        layoutParams2.y = i9;
                    }
                } else if (measuredHeight + i9 <= rect.height()) {
                    layoutParams2.y = i9;
                } else {
                    layoutParams2.y = i8;
                }
            }
            ((WindowManager) context2.getSystemService("window")).addView(view2, layoutParams2);
            view.addOnAttachStateChangeListener(this);
            if (this.q) {
                j2 = 2500;
            } else {
                WeakHashMap weakHashMap = zc4.a;
                if ((view.getWindowSystemUiVisibility() & 1) == i3) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = 15000;
                }
                j2 = j - longPressTimeout;
            }
            q44 q44Var = this.m;
            view.removeCallbacks(q44Var);
            view.postDelayed(q44Var, j2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0066  */
    @Override // android.view.View.OnHoverListener
    public final boolean onHover(View view, MotionEvent motionEvent) {
        if (this.p == null || !this.q) {
            View view2 = this.c;
            AccessibilityManager accessibilityManager = (AccessibilityManager) view2.getContext().getSystemService("accessibility");
            if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
                int action = motionEvent.getAction();
                if (action != 7) {
                    if (action == 10) {
                        this.r = true;
                        a();
                        return false;
                    }
                } else if (view2.isEnabled() && this.p == null) {
                    int x = (int) motionEvent.getX();
                    int y = (int) motionEvent.getY();
                    if (this.r) {
                        this.n = x;
                        this.o = y;
                        this.r = false;
                        b(this);
                    } else {
                        int iAbs = Math.abs(x - this.n);
                        int i = this.h;
                        if (iAbs > i || Math.abs(y - this.o) > i) {
                            this.n = x;
                            this.o = y;
                            this.r = false;
                            b(this);
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.n = view.getWidth() / 2;
        this.o = view.getHeight() / 2;
        c(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        a();
    }
}
