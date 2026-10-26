package defpackage;

import ai.notrack.app.R;
import android.os.Build;
import android.view.ContextThemeWrapper;
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
public final class te2 extends sg0 implements ViewRootForInspector {
    public je1 l;
    public if2 m;
    public final View n;
    public final re2 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public te2(je1 je1Var, if2 if2Var, View view, dx1 dx1Var, wu0 wu0Var, UUID uuid, ue ueVar, gq0 gq0Var, boolean z) {
        super(new ContextThemeWrapper(view.getContext(), R.style.EdgeToEdgeFloatingDialogWindowTheme), 0);
        int i = 0;
        this.l = je1Var;
        this.m = if2Var;
        this.n = view;
        Window window = getWindow();
        if (window == null) {
            u41.r("Dialog has no window");
            throw null;
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        im4.a(window, false);
        re2 re2Var = new re2(getContext(), window, this.m.b, this.l, ueVar, gq0Var);
        re2Var.setTag(R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
        re2Var.setClipChildren(false);
        re2Var.setElevation(wu0Var.w(8.0f));
        re2Var.setOutlineProvider(new wv0(1));
        this.o = re2Var;
        setContentView(re2Var);
        re2Var.setTag(R.id.view_tree_lifecycle_owner, ud4.a(view));
        re2Var.setTag(R.id.view_tree_view_model_store_owner, wd4.a(view));
        re2Var.setTag(R.id.view_tree_saved_state_registry_owner, vd4.a(view));
        e(this.l, this.m, dx1Var);
        window.getDecorView();
        int i2 = Build.VERSION.SDK_INT;
        bh4 ah4Var = i2 >= 35 ? new ah4(window) : i2 >= 30 ? new zg4(window) : i2 >= 26 ? new yg4(window) : new xg4(window);
        boolean z2 = !z;
        ah4Var.b(z2);
        ah4Var.a(z2);
        sf3.f(this.h, this, new se2(this, i));
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }

    public final void e(je1 je1Var, if2 if2Var, dx1 dx1Var) {
        this.l = je1Var;
        this.m = if2Var;
        tc3 tc3Var = if2Var.a;
        ViewGroup.LayoutParams layoutParams = this.n.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        int i = 1;
        boolean z = (layoutParams2 == null || (layoutParams2.flags & ConstantsKt.DEFAULT_BUFFER_SIZE) == 0) ? false : true;
        int iOrdinal = tc3Var.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                z = true;
            } else {
                if (iOrdinal != 2) {
                    u41.e();
                    return;
                }
                z = false;
            }
        }
        Window window = getWindow();
        window.getClass();
        window.setFlags(z ? 8192 : -8193, ConstantsKt.DEFAULT_BUFFER_SIZE);
        int iOrdinal2 = dx1Var.ordinal();
        if (iOrdinal2 == 0) {
            i = 0;
        } else if (iOrdinal2 != 1) {
            u41.e();
            return;
        }
        this.o.setLayoutDirection(i);
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setLayout(-1, -1);
        }
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setSoftInputMode(Build.VERSION.SDK_INT >= 30 ? 48 : 16);
        }
    }

    @Override // androidx.compose.ui.platform.ViewRootForInspector
    public final AbstractComposeView getSubCompositionView() {
        return this.o;
    }

    @Override // android.app.Dialog
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if (zOnTouchEvent) {
            this.l.invoke();
        }
        return zOnTouchEvent;
    }
}
