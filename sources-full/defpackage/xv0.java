package defpackage;

import ai.notrack.app.R;
import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.platform.ViewRootForInspector;
import java.util.UUID;
import kotlin.io.ConstantsKt;

/* JADX INFO: loaded from: classes.dex */
public final class xv0 extends sg0 implements ViewRootForInspector {
    public je1 l;
    public uv0 m;
    public final View n;
    public final tv0 o;

    public xv0(je1 je1Var, uv0 uv0Var, View view, dx1 dx1Var, wu0 wu0Var, UUID uuid) {
        super(new ContextThemeWrapper(view.getContext(), uv0Var.e ? R.style.DialogWindowTheme : R.style.FloatingDialogWindowTheme), 0);
        this.l = je1Var;
        this.m = uv0Var;
        this.n = view;
        Window window = getWindow();
        if (window == null) {
            u41.r("Dialog has no window");
            throw null;
        }
        int i = 1;
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        im4.a(window, this.m.e);
        window.setGravity(17);
        tv0 tv0Var = new tv0(getContext(), window);
        tv0Var.setTag(R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
        tv0Var.setClipChildren(false);
        tv0Var.setElevation(wu0Var.w(8.0f));
        tv0Var.setOutlineProvider(new wv0(0));
        this.o = tv0Var;
        View decorView = window.getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup != null) {
            e(viewGroup);
        }
        setContentView(tv0Var);
        tv0Var.setTag(R.id.view_tree_lifecycle_owner, ud4.a(view));
        tv0Var.setTag(R.id.view_tree_view_model_store_owner, wd4.a(view));
        tv0Var.setTag(R.id.view_tree_saved_state_registry_owner, vd4.a(view));
        f(this.l, this.m, dx1Var);
        sf3.f(this.h, this, new pa(this, i));
    }

    public static final void e(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof tv0) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
            if (viewGroup2 != null) {
                e(viewGroup2);
            }
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }

    public final void f(je1 je1Var, uv0 uv0Var, dx1 dx1Var) {
        int i;
        this.l = je1Var;
        this.m = uv0Var;
        tc3 tc3Var = uv0Var.c;
        boolean zA = yc.a(this.n);
        int iOrdinal = tc3Var.ordinal();
        int i2 = 0;
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                zA = true;
            } else {
                if (iOrdinal != 2) {
                    u41.e();
                    return;
                }
                zA = false;
            }
        }
        Window window = getWindow();
        window.getClass();
        window.setFlags(zA ? 8192 : -8193, ConstantsKt.DEFAULT_BUFFER_SIZE);
        int iOrdinal2 = dx1Var.ordinal();
        if (iOrdinal2 == 0) {
            i = 0;
        } else {
            if (iOrdinal2 != 1) {
                u41.e();
                return;
            }
            i = 1;
        }
        tv0 tv0Var = this.o;
        tv0Var.setLayoutDirection(i);
        boolean z = uv0Var.e;
        boolean z2 = uv0Var.d;
        Window window2 = tv0Var.c;
        boolean z3 = (tv0Var.m && z2 == tv0Var.h && z == tv0Var.l) ? false : true;
        tv0Var.h = z2;
        tv0Var.l = z;
        if (z3) {
            WindowManager.LayoutParams attributes = window2.getAttributes();
            int i3 = z2 ? -2 : -1;
            if (i3 != attributes.width || !tv0Var.m) {
                window2.setLayout(i3, -2);
                tv0Var.m = true;
            }
        }
        setCanceledOnTouchOutside(uv0Var.b);
        Window window3 = getWindow();
        if (window3 != null) {
            if (!z) {
                i2 = Build.VERSION.SDK_INT < 31 ? 16 : 48;
            }
            window3.setSoftInputMode(i2);
        }
    }

    @Override // androidx.compose.ui.platform.ViewRootForInspector
    public final AbstractComposeView getSubCompositionView() {
        return this.o;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (!this.m.a || !keyEvent.isTracking() || keyEvent.isCanceled() || i != 111) {
            return super.onKeyUp(i, keyEvent);
        }
        this.l.invoke();
        return true;
    }

    @Override // android.app.Dialog
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        View childAt;
        int iR;
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if (!this.m.b) {
            return zOnTouchEvent;
        }
        tv0 tv0Var = this.o;
        tv0Var.getClass();
        float x = motionEvent.getX();
        if (!Float.isInfinite(x) && !Float.isNaN(x)) {
            float y = motionEvent.getY();
            if (!Float.isInfinite(y) && !Float.isNaN(y) && (childAt = tv0Var.getChildAt(0)) != null) {
                int left = childAt.getLeft() + tv0Var.getLeft();
                int width = childAt.getWidth() + left;
                int top = childAt.getTop() + tv0Var.getTop();
                int height = childAt.getHeight() + top;
                int iR2 = gb2.R(motionEvent.getX());
                if (left <= iR2 && iR2 <= width && top <= (iR = gb2.R(motionEvent.getY())) && iR <= height) {
                    return zOnTouchEvent;
                }
            }
        }
        this.l.invoke();
        return true;
    }
}
