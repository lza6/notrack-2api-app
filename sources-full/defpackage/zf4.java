package defpackage;

import android.R;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class zf4 implements x2 {
    public static final AccelerateInterpolator y = new AccelerateInterpolator();
    public static final DecelerateInterpolator z = new DecelerateInterpolator();
    public Context a;
    public Context b;
    public ActionBarOverlayLayout c;
    public ActionBarContainer d;
    public js0 e;
    public ActionBarContextView f;
    public final View g;
    public boolean h;
    public yf4 i;
    public yf4 j;
    public bv0 k;
    public boolean l;
    public final ArrayList m;
    public int n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public qd4 s;
    public boolean t;
    public boolean u;
    public final xf4 v;
    public final xf4 w;
    public final sk3 x;

    public zf4(Activity activity, boolean z2) {
        new ArrayList();
        this.m = new ArrayList();
        this.n = 0;
        this.o = true;
        this.r = true;
        this.v = new xf4(this, 0);
        this.w = new xf4(this, 1);
        this.x = new sk3(16, this);
        View decorView = activity.getWindow().getDecorView();
        c(decorView);
        if (z2) {
            return;
        }
        this.g = decorView.findViewById(R.id.content);
    }

    public zf4(Dialog dialog) {
        new ArrayList();
        this.m = new ArrayList();
        this.n = 0;
        this.o = true;
        this.r = true;
        this.v = new xf4(this, 0);
        this.w = new xf4(this, 1);
        this.x = new sk3(16, this);
        c(dialog.getWindow().getDecorView());
    }

    public final void a(boolean z2) {
        pd4 pd4VarI;
        pd4 pd4VarI2;
        boolean z3 = this.q;
        if (z2) {
            if (!z3) {
                this.q = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                f(false);
            }
        } else if (z3) {
            this.q = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            f(false);
        }
        boolean zIsLaidOut = this.d.isLaidOut();
        js0 js0Var = this.e;
        if (!zIsLaidOut) {
            if (z2) {
                ((o44) js0Var).a.setVisibility(4);
                this.f.setVisibility(0);
                return;
            } else {
                ((o44) js0Var).a.setVisibility(0);
                this.f.setVisibility(8);
                return;
            }
        }
        if (z2) {
            o44 o44Var = (o44) js0Var;
            pd4VarI = zc4.a(o44Var.a);
            pd4VarI.a(0.0f);
            pd4VarI.c(100L);
            pd4VarI.d(new n44(o44Var, 4));
            pd4VarI2 = this.f.i(200L, 0);
        } else {
            o44 o44Var2 = (o44) js0Var;
            pd4 pd4VarA = zc4.a(o44Var2.a);
            pd4VarA.a(1.0f);
            pd4VarA.c(200L);
            pd4VarA.d(new n44(o44Var2, 0));
            pd4VarI = this.f.i(100L, 8);
            pd4VarI2 = pd4VarA;
        }
        qd4 qd4Var = new qd4();
        ArrayList arrayList = qd4Var.a;
        arrayList.add(pd4VarI);
        View view = (View) pd4VarI.a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) pd4VarI2.a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(pd4VarI2);
        qd4Var.b();
    }

    public final Context b() {
        if (this.b == null) {
            TypedValue typedValue = new TypedValue();
            this.a.getTheme().resolveAttribute(ai.notrack.app.R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.b = new ContextThemeWrapper(this.a, i);
            } else {
                this.b = this.a;
            }
        }
        return this.b;
    }

    public final void c(View view) {
        js0 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(ai.notrack.app.R.id.decor_content_parent);
        this.c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback callbackFindViewById = view.findViewById(ai.notrack.app.R.id.action_bar);
        if (callbackFindViewById instanceof js0) {
            wrapper = (js0) callbackFindViewById;
        } else {
            if (!(callbackFindViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById != null ? callbackFindViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) callbackFindViewById).getWrapper();
        }
        this.e = wrapper;
        this.f = (ActionBarContextView) view.findViewById(ai.notrack.app.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(ai.notrack.app.R.id.action_bar_container);
        this.d = actionBarContainer;
        js0 js0Var = this.e;
        if (js0Var == null || this.f == null || actionBarContainer == null) {
            u41.r(zf4.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
            return;
        }
        Context context = ((o44) js0Var).a.getContext();
        this.a = context;
        if ((((o44) this.e).b & 4) != 0) {
            this.h = true;
        }
        int i = context.getApplicationInfo().targetSdkVersion;
        this.e.getClass();
        e(context.getResources().getBoolean(ai.notrack.app.R.bool.abc_action_bar_embed_tabs));
        TypedArray typedArrayObtainStyledAttributes = this.a.obtainStyledAttributes(null, g23.a, ai.notrack.app.R.attr.actionBarStyle, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.c;
            if (!actionBarOverlayLayout2.o) {
                u41.r("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
                return;
            } else {
                this.u = true;
                actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
            }
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.d;
            WeakHashMap weakHashMap = zc4.a;
            sc4.g(actionBarContainer2, dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void d(boolean z2) {
        if (this.h) {
            return;
        }
        int i = z2 ? 4 : 0;
        o44 o44Var = (o44) this.e;
        int i2 = o44Var.b;
        this.h = true;
        o44Var.a((i & 4) | (i2 & (-5)));
    }

    public final void e(boolean z2) {
        if (z2) {
            this.d.setTabContainer(null);
            ((o44) this.e).getClass();
        } else {
            ((o44) this.e).getClass();
            this.d.setTabContainer(null);
        }
        this.e.getClass();
        ((o44) this.e).a.setCollapsible(false);
        this.c.setHasNonEmbeddedTabs(false);
    }

    public final void f(boolean z2) {
        boolean z3 = this.q || !this.p;
        boolean z4 = this.r;
        final sk3 sk3Var = this.x;
        View view = this.g;
        if (!z3) {
            if (z4) {
                this.r = false;
                qd4 qd4Var = this.s;
                if (qd4Var != null) {
                    qd4Var.a();
                }
                int i = this.n;
                xf4 xf4Var = this.v;
                if (i != 0 || (!this.t && !z2)) {
                    xf4Var.a();
                    return;
                }
                this.d.setAlpha(1.0f);
                this.d.setTransitioning(true);
                qd4 qd4Var2 = new qd4();
                float f = -this.d.getHeight();
                if (z2) {
                    int[] iArr = {0, 0};
                    this.d.getLocationInWindow(iArr);
                    f -= iArr[1];
                }
                pd4 pd4VarA = zc4.a(this.d);
                pd4VarA.e(f);
                final View view2 = (View) pd4VarA.a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(sk3Var != null ? new ValueAnimator.AnimatorUpdateListener(view2) { // from class: od4
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            ((View) ((zf4) this.a.d).d.getParent()).invalidate();
                        }
                    } : null);
                }
                boolean z5 = qd4Var2.e;
                ArrayList arrayList = qd4Var2.a;
                if (!z5) {
                    arrayList.add(pd4VarA);
                }
                if (this.o && view != null) {
                    pd4 pd4VarA2 = zc4.a(view);
                    pd4VarA2.e(f);
                    if (!qd4Var2.e) {
                        arrayList.add(pd4VarA2);
                    }
                }
                boolean z6 = qd4Var2.e;
                if (!z6) {
                    qd4Var2.c = y;
                }
                if (!z6) {
                    qd4Var2.b = 250L;
                }
                if (!z6) {
                    qd4Var2.d = xf4Var;
                }
                this.s = qd4Var2;
                qd4Var2.b();
                return;
            }
            return;
        }
        if (z4) {
            return;
        }
        this.r = true;
        qd4 qd4Var3 = this.s;
        if (qd4Var3 != null) {
            qd4Var3.a();
        }
        this.d.setVisibility(0);
        int i2 = this.n;
        xf4 xf4Var2 = this.w;
        if (i2 == 0 && (this.t || z2)) {
            this.d.setTranslationY(0.0f);
            float f2 = -this.d.getHeight();
            if (z2) {
                int[] iArr2 = {0, 0};
                this.d.getLocationInWindow(iArr2);
                f2 -= iArr2[1];
            }
            this.d.setTranslationY(f2);
            qd4 qd4Var4 = new qd4();
            pd4 pd4VarA3 = zc4.a(this.d);
            pd4VarA3.e(0.0f);
            final View view3 = (View) pd4VarA3.a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(sk3Var != null ? new ValueAnimator.AnimatorUpdateListener(view3) { // from class: od4
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ((View) ((zf4) this.a.d).d.getParent()).invalidate();
                    }
                } : null);
            }
            boolean z7 = qd4Var4.e;
            ArrayList arrayList2 = qd4Var4.a;
            if (!z7) {
                arrayList2.add(pd4VarA3);
            }
            if (this.o && view != null) {
                view.setTranslationY(f2);
                pd4 pd4VarA4 = zc4.a(view);
                pd4VarA4.e(0.0f);
                if (!qd4Var4.e) {
                    arrayList2.add(pd4VarA4);
                }
            }
            boolean z8 = qd4Var4.e;
            if (!z8) {
                qd4Var4.c = z;
            }
            if (!z8) {
                qd4Var4.b = 250L;
            }
            if (!z8) {
                qd4Var4.d = xf4Var2;
            }
            this.s = qd4Var4;
            qd4Var4.b();
        } else {
            this.d.setAlpha(1.0f);
            this.d.setTranslationY(0.0f);
            if (this.o && view != null) {
                view.setTranslationY(0.0f);
            }
            xf4Var2.a();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.c;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = zc4.a;
            qc4.c(actionBarOverlayLayout);
        }
    }
}
