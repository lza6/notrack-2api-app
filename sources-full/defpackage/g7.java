package defpackage;

import ai.notrack.app.R;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import java.util.WeakHashMap;
import kotlin.KotlinVersion;

/* JADX INFO: loaded from: classes.dex */
public final class g7 extends sg0 implements DialogInterface, di {
    public zi l;
    public final aj m;
    public final f7 n;

    /* JADX WARN: Type inference failed for: r2v2, types: [aj] */
    public g7(ContextThemeWrapper contextThemeWrapper, int i) {
        int i2;
        int iG = g(contextThemeWrapper, i);
        if (iG == 0) {
            TypedValue typedValue = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            i2 = typedValue.resourceId;
        } else {
            i2 = iG;
        }
        super(contextThemeWrapper, i2);
        this.m = new zu1() { // from class: aj
            @Override // defpackage.zu1
            public final boolean c(KeyEvent keyEvent) {
                return this.c.j(keyEvent);
            }
        };
        li liVarE = e();
        if (iG == 0) {
            TypedValue typedValue2 = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue2, true);
            iG = typedValue2.resourceId;
        }
        ((zi) liVarE).a0 = iG;
        liVarE.g();
        this.n = new f7(getContext(), this, getWindow());
    }

    public static int g(Context context, int i) {
        if (((i >>> 24) & KotlinVersion.MAX_COMPONENT_VALUE) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // defpackage.sg0, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        d();
        zi ziVar = (zi) e();
        ziVar.z();
        ((ViewGroup) ziVar.H.findViewById(android.R.id.content)).addView(view, layoutParams);
        ziVar.u.a(ziVar.t.getCallback());
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        e().h();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return av1.o(this.m, getWindow().getDecorView(), this, keyEvent);
    }

    public final li e() {
        if (this.l == null) {
            wf3 wf3Var = li.c;
            this.l = new zi(getContext(), getWindow(), this, this);
        }
        return this.l;
    }

    public final void f(Bundle bundle) {
        e().d();
        super.onCreate(bundle);
        e().g();
    }

    @Override // android.app.Dialog
    public final View findViewById(int i) {
        zi ziVar = (zi) e();
        ziVar.z();
        return ziVar.t.findViewById(i);
    }

    public final void i(CharSequence charSequence) {
        super.setTitle(charSequence);
        e().o(charSequence);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        zi ziVar = (zi) e();
        if (ziVar.v != null) {
            ziVar.D();
            ziVar.v.getClass();
            ziVar.E(0);
        }
    }

    public final boolean j(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // defpackage.sg0, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        CharSequence charSequence;
        int i;
        ListAdapter listAdapter;
        View viewFindViewById;
        f(bundle);
        f7 f7Var = this.n;
        f7Var.b.setContentView(f7Var.u);
        Context context = f7Var.a;
        Window window = f7Var.c;
        View viewFindViewById2 = window.findViewById(R.id.parentPanel);
        View viewFindViewById3 = viewFindViewById2.findViewById(R.id.topPanel);
        View viewFindViewById4 = viewFindViewById2.findViewById(R.id.contentPanel);
        View viewFindViewById5 = viewFindViewById2.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById2.findViewById(R.id.customPanel);
        View view = f7Var.f;
        if (view == null) {
            view = null;
        }
        boolean z = view != null;
        if (!z || !f7.a(view)) {
            window.setFlags(131072, 131072);
        }
        if (z) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.custom);
            charSequence = null;
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (f7Var.g) {
                frameLayout.setPadding(0, 0, 0, 0);
            }
            if (f7Var.e != null) {
                ((LinearLayout.LayoutParams) ((g42) viewGroup.getLayoutParams())).weight = 0.0f;
            }
        } else {
            charSequence = null;
            viewGroup.setVisibility(8);
        }
        View viewFindViewById6 = viewGroup.findViewById(R.id.topPanel);
        View viewFindViewById7 = viewGroup.findViewById(R.id.contentPanel);
        View viewFindViewById8 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup viewGroupB = f7.b(viewFindViewById6, viewFindViewById3);
        ViewGroup viewGroupB2 = f7.b(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupB3 = f7.b(viewFindViewById8, viewFindViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        f7Var.m = nestedScrollView;
        nestedScrollView.setFocusable(false);
        f7Var.m.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroupB2.findViewById(android.R.id.message);
        f7Var.q = textView;
        if (textView != null) {
            textView.setVisibility(8);
            f7Var.m.removeView(f7Var.q);
            if (f7Var.e != null) {
                ViewGroup viewGroup2 = (ViewGroup) f7Var.m.getParent();
                int iIndexOfChild = viewGroup2.indexOfChild(f7Var.m);
                viewGroup2.removeViewAt(iIndexOfChild);
                viewGroup2.addView(f7Var.e, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
            } else {
                viewGroupB2.setVisibility(8);
            }
        }
        Button button = (Button) viewGroupB3.findViewById(android.R.id.button1);
        f7Var.h = button;
        u2 u2Var = f7Var.A;
        button.setOnClickListener(u2Var);
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        Button button2 = f7Var.h;
        if (zIsEmpty) {
            button2.setVisibility(8);
            i = 0;
        } else {
            button2.setText(charSequence);
            f7Var.h.setVisibility(0);
            i = 1;
        }
        Button button3 = (Button) viewGroupB3.findViewById(android.R.id.button2);
        f7Var.i = button3;
        button3.setOnClickListener(u2Var);
        boolean zIsEmpty2 = TextUtils.isEmpty(f7Var.j);
        Button button4 = f7Var.i;
        if (zIsEmpty2) {
            button4.setVisibility(8);
        } else {
            button4.setText(f7Var.j);
            f7Var.i.setVisibility(0);
            i |= 2;
        }
        Button button5 = (Button) viewGroupB3.findViewById(android.R.id.button3);
        f7Var.l = button5;
        button5.setOnClickListener(u2Var);
        boolean zIsEmpty3 = TextUtils.isEmpty(null);
        Button button6 = f7Var.l;
        if (zIsEmpty3) {
            button6.setVisibility(8);
        } else {
            button6.setText((CharSequence) null);
            f7Var.l.setVisibility(0);
            i |= 4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i == 1) {
                Button button7 = f7Var.h;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button7.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button7.setLayoutParams(layoutParams);
            } else if (i == 2) {
                Button button8 = f7Var.i;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button8.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button8.setLayoutParams(layoutParams2);
            } else if (i == 4) {
                Button button9 = f7Var.l;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button9.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button9.setLayoutParams(layoutParams3);
            }
        }
        if (i == 0) {
            viewGroupB3.setVisibility(8);
        }
        if (f7Var.r != null) {
            viewGroupB.addView(f7Var.r, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.title_template).setVisibility(8);
        } else {
            f7Var.o = (ImageView) window.findViewById(android.R.id.icon);
            if (TextUtils.isEmpty(f7Var.d) || !f7Var.y) {
                window.findViewById(R.id.title_template).setVisibility(8);
                f7Var.o.setVisibility(8);
                viewGroupB.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                f7Var.p = textView2;
                textView2.setText(f7Var.d);
                Drawable drawable = f7Var.n;
                if (drawable != null) {
                    f7Var.o.setImageDrawable(drawable);
                } else {
                    f7Var.p.setPadding(f7Var.o.getPaddingLeft(), f7Var.o.getPaddingTop(), f7Var.o.getPaddingRight(), f7Var.o.getPaddingBottom());
                    f7Var.o.setVisibility(8);
                }
            }
        }
        boolean z2 = viewGroup.getVisibility() != 8;
        int i2 = (viewGroupB == null || viewGroupB.getVisibility() == 8) ? 0 : 1;
        boolean z3 = viewGroupB3.getVisibility() != 8;
        if (!z3 && (viewFindViewById = viewGroupB2.findViewById(R.id.textSpacerNoButtons)) != null) {
            viewFindViewById.setVisibility(0);
        }
        if (i2 != 0) {
            NestedScrollView nestedScrollView2 = f7Var.m;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View viewFindViewById9 = f7Var.e != null ? viewGroupB.findViewById(R.id.titleDividerNoCustom) : null;
            if (viewFindViewById9 != null) {
                viewFindViewById9.setVisibility(0);
            }
        } else {
            View viewFindViewById10 = viewGroupB2.findViewById(R.id.textSpacerNoTitle);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = f7Var.e;
        if (alertController$RecycleListView != null && (!z3 || i2 == 0)) {
            alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i2 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.c, alertController$RecycleListView.getPaddingRight(), z3 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.d);
        }
        if (!z2) {
            View view2 = f7Var.e;
            if (view2 == null) {
                view2 = f7Var.m;
            }
            if (view2 != null) {
                int i3 = z3 ? 2 : 0;
                View viewFindViewById11 = window.findViewById(R.id.scrollIndicatorUp);
                View viewFindViewById12 = window.findViewById(R.id.scrollIndicatorDown);
                WeakHashMap weakHashMap = zc4.a;
                tc4.b(view2, i2 | i3, 3);
                if (viewFindViewById11 != null) {
                    viewGroupB2.removeView(viewFindViewById11);
                }
                if (viewFindViewById12 != null) {
                    viewGroupB2.removeView(viewFindViewById12);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = f7Var.e;
        if (alertController$RecycleListView2 == null || (listAdapter = f7Var.s) == null) {
            return;
        }
        alertController$RecycleListView2.setAdapter(listAdapter);
        int i4 = f7Var.t;
        if (i4 > -1) {
            alertController$RecycleListView2.setItemChecked(i4, true);
            alertController$RecycleListView2.setSelection(i4);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.n.m;
        if (nestedScrollView == null || !nestedScrollView.g(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.n.m;
        if (nestedScrollView == null || !nestedScrollView.g(keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    @Override // defpackage.sg0, android.app.Dialog
    public final void onStop() {
        super.onStop();
        zi ziVar = (zi) e();
        ziVar.D();
        zf4 zf4Var = ziVar.v;
        if (zf4Var != null) {
            zf4Var.t = false;
            qd4 qd4Var = zf4Var.s;
            if (qd4Var != null) {
                qd4Var.a();
            }
        }
    }

    @Override // defpackage.sg0, android.app.Dialog
    public final void setContentView(int i) {
        d();
        e().k(i);
    }

    @Override // defpackage.sg0, android.app.Dialog
    public final void setContentView(View view) {
        d();
        e().m(view);
    }

    @Override // defpackage.sg0, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        d();
        e().n(view, layoutParams);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i) {
        super.setTitle(i);
        e().o(getContext().getString(i));
    }

    @Override // android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        i(charSequence);
        f7 f7Var = this.n;
        f7Var.d = charSequence;
        TextView textView = f7Var.p;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
