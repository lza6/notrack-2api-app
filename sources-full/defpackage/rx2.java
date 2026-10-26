package defpackage;

import ai.notrack.app.R;
import android.graphics.Rect;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.platform.ViewRootForInspector;
import java.util.UUID;
import kotlin.io.ConstantsKt;

/* JADX INFO: loaded from: classes.dex */
public final class rx2 extends AbstractComposeView implements ViewRootForInspector {
    public final int[] A;
    public je1 c;
    public ux2 d;
    public String h;
    public final View l;
    public final qn0 m;
    public final WindowManager n;
    public final WindowManager.LayoutParams o;
    public tx2 p;
    public dx1 q;
    public final ft2 r;
    public final ft2 s;
    public mq1 t;
    public final fv0 u;
    public final Rect v;
    public final ol3 w;
    public qg x;
    public final ft2 y;
    public boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rx2(je1 je1Var, ux2 ux2Var, String str, View view, wu0 wu0Var, tx2 tx2Var, UUID uuid) {
        super(view.getContext(), null, 0, 6, null);
        int i = 23;
        qn0 sx2Var = Build.VERSION.SDK_INT >= 29 ? new sx2(i) : new qn0(i);
        this.c = je1Var;
        this.d = ux2Var;
        this.h = str;
        this.l = view;
        this.m = sx2Var;
        Object systemService = view.getContext().getSystemService("window");
        systemService.getClass();
        this.n = (WindowManager) systemService;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        ux2 ux2Var2 = this.d;
        boolean zA = yc.a(view);
        boolean z = ux2Var2.b;
        int i2 = ux2Var2.a;
        if (z && zA) {
            i2 |= ConstantsKt.DEFAULT_BUFFER_SIZE;
        } else if (z && !zA) {
            i2 &= -8193;
        }
        layoutParams.flags = i2;
        layoutParams.type = 1002;
        layoutParams.token = view.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(view.getContext().getResources().getString(R.string.default_popup_window_title));
        this.o = layoutParams;
        this.p = tx2Var;
        this.q = dx1.c;
        this.r = cl3.d(null);
        this.s = cl3.d(null);
        this.u = cl3.b(new j(28, this));
        this.v = new Rect();
        this.w = new ol3(new sc(this, 2));
        setId(android.R.id.content);
        setTag(R.id.view_tree_lifecycle_owner, ud4.a(view));
        setTag(R.id.view_tree_view_model_store_owner, wd4.a(view));
        setTag(R.id.view_tree_saved_state_registry_owner, vd4.a(view));
        setTag(R.id.compose_view_saveable_id_tag, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(wu0Var.w(8.0f));
        setOutlineProvider(new wv0(2));
        this.y = cl3.d(dh0.a);
        this.A = new int[2];
    }

    private final ne1 getContent() {
        return (ne1) this.y.getValue();
    }

    public static /* synthetic */ void getParams$ui_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final cx1 getParentLayoutCoordinates() {
        return (cx1) this.s.getValue();
    }

    private final mq1 getVisibleDisplayBounds() {
        this.m.getClass();
        View view = this.l;
        Rect rect = this.v;
        view.getWindowVisibleDisplayFrame(rect);
        return new mq1(rect.left, rect.top, rect.right, rect.bottom);
    }

    private final void setContent(ne1 ne1Var) {
        this.y.setValue(ne1Var);
    }

    private final void setParentLayoutCoordinates(cx1 cx1Var) {
        this.s.setValue(cx1Var);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public void Content(ck0 ck0Var, int i) {
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.a0(-857613600);
        fq2.w(0, getContent(), kk0Var, false);
    }

    public final void b(qk0 qk0Var, ne1 ne1Var) {
        setParentCompositionContext(qk0Var);
        setContent(ne1Var);
        this.z = true;
    }

    public final void c(je1 je1Var, ux2 ux2Var, String str, dx1 dx1Var) {
        int i;
        this.c = je1Var;
        this.h = str;
        if (!kr1.n(this.d, ux2Var)) {
            ux2Var.getClass();
            this.d = ux2Var;
            boolean zA = yc.a(this.l);
            boolean z = ux2Var.b;
            int i2 = ux2Var.a;
            if (z && zA) {
                i2 |= ConstantsKt.DEFAULT_BUFFER_SIZE;
            } else if (z && !zA) {
                i2 &= -8193;
            }
            WindowManager.LayoutParams layoutParams = this.o;
            layoutParams.flags = i2;
            this.m.getClass();
            this.n.updateViewLayout(this, layoutParams);
        }
        int iOrdinal = dx1Var.ordinal();
        if (iOrdinal != 0) {
            i = 1;
            if (iOrdinal != 1) {
                u41.e();
                return;
            }
        } else {
            i = 0;
        }
        super.setLayoutDirection(i);
    }

    public final void d() {
        cx1 parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates != null) {
            if (!parentLayoutCoordinates.z()) {
                parentLayoutCoordinates = null;
            }
            if (parentLayoutCoordinates == null) {
                return;
            }
            long J = parentLayoutCoordinates.J();
            long jG = parentLayoutCoordinates.g(0L);
            long jRound = (((long) Math.round(Float.intBitsToFloat((int) (jG >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (jG & 4294967295L)))) & 4294967295L);
            int i = (int) (jRound >> 32);
            int i2 = (int) (jRound & 4294967295L);
            mq1 mq1Var = new mq1(i, i2, ((int) (J >> 32)) + i, ((int) (J & 4294967295L)) + i2);
            if (mq1Var.equals(this.t)) {
                return;
            }
            this.t = mq1Var;
            g();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.d.c) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getKeyCode() == 4 || keyEvent.getKeyCode() == 111) {
            KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
            if (keyDispatcherState == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                keyDispatcherState.startTracking(keyEvent, this);
                return true;
            }
            if (keyEvent.getAction() == 1 && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                je1 je1Var = this.c;
                if (je1Var != null) {
                    je1Var.invoke();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void e(cx1 cx1Var) {
        setParentLayoutCoordinates(cx1Var);
        d();
    }

    public final void g() {
        qq1 qq1VarM1805x99e2a2d4;
        mq1 mq1Var = this.t;
        if (mq1Var == null || (qq1VarM1805x99e2a2d4 = m1805x99e2a2d4()) == null) {
            return;
        }
        long j = qq1VarM1805x99e2a2d4.a;
        mq1 visibleDisplayBounds = getVisibleDisplayBounds();
        long jB = (((long) visibleDisplayBounds.b()) & 4294967295L) | (((long) visibleDisplayBounds.d()) << 32);
        p43 p43Var = new p43();
        p43Var.c = 0L;
        this.w.c(this, xq2.v, new qx2(p43Var, this, mq1Var, jB, j));
        long j2 = p43Var.c;
        WindowManager.LayoutParams layoutParams = this.o;
        layoutParams.x = (int) (j2 >> 32);
        layoutParams.y = (int) (j2 & 4294967295L);
        boolean z = this.d.e;
        qn0 qn0Var = this.m;
        if (z) {
            qn0Var.s(this, (int) (jB >> 32), (int) (jB & 4294967295L));
        }
        qn0Var.getClass();
        this.n.updateViewLayout(this, layoutParams);
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.u.getValue()).booleanValue();
    }

    public final WindowManager.LayoutParams getParams$ui_release() {
        return this.o;
    }

    public final dx1 getParentLayoutDirection() {
        return this.q;
    }

    /* JADX INFO: renamed from: getPopupContentSize-bOM6tXw, reason: not valid java name */
    public final qq1 m1805x99e2a2d4() {
        return (qq1) this.r.getValue();
    }

    public final tx2 getPositionProvider() {
        return this.p;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.z;
    }

    @Override // androidx.compose.ui.platform.ViewRootForInspector
    public AbstractComposeView getSubCompositionView() {
        return this;
    }

    public final String getTestTag() {
        return this.h;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void internalOnLayout$ui_release(boolean z, int i, int i2, int i3, int i4) {
        super.internalOnLayout$ui_release(z, i, i2, i3, i4);
        this.d.getClass();
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        WindowManager.LayoutParams layoutParams = this.o;
        layoutParams.width = measuredWidth;
        layoutParams.height = childAt.getMeasuredHeight();
        this.m.getClass();
        this.n.updateViewLayout(this, layoutParams);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void internalOnMeasure$ui_release(int i, int i2) {
        this.d.getClass();
        mq1 visibleDisplayBounds = getVisibleDisplayBounds();
        super.internalOnMeasure$ui_release(View.MeasureSpec.makeMeasureSpec(visibleDisplayBounds.d(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(visibleDisplayBounds.b(), Integer.MIN_VALUE));
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.w.d();
        if (!this.d.c || Build.VERSION.SDK_INT < 33) {
            return;
        }
        if (this.x == null) {
            this.x = new qg(this.c, 0);
        }
        l1.e(this, this.x);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ol3 ol3Var = this.w;
        f4 f4Var = ol3Var.h;
        if (f4Var != null) {
            f4Var.g();
        }
        ol3Var.b();
        if (Build.VERSION.SDK_INT >= 33) {
            l1.f(this, this.x);
        }
        this.x = null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.d.d) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && (motionEvent.getX() < 0.0f || motionEvent.getX() >= getWidth() || motionEvent.getY() < 0.0f || motionEvent.getY() >= getHeight())) {
            je1 je1Var = this.c;
            if (je1Var != null) {
                je1Var.invoke();
                return true;
            }
        } else {
            if (motionEvent == null || motionEvent.getAction() != 4) {
                return super.onTouchEvent(motionEvent);
            }
            je1 je1Var2 = this.c;
            if (je1Var2 != null) {
                je1Var2.invoke();
            }
        }
        return true;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
    }

    public final void setParentLayoutDirection(dx1 dx1Var) {
        this.q = dx1Var;
    }

    /* JADX INFO: renamed from: setPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m1806x4a670db2(qq1 qq1Var) {
        this.r.setValue(qq1Var);
    }

    public final void setPositionProvider(tx2 tx2Var) {
        this.p = tx2Var;
    }

    public final void setTestTag(String str) {
        this.h = str;
    }
}
