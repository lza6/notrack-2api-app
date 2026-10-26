package androidx.compose.ui.platform;

import android.content.Context;
import android.os.IBinder;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import defpackage.ck0;
import defpackage.d43;
import defpackage.je1;
import defpackage.kk0;
import defpackage.ms0;
import defpackage.ne1;
import defpackage.pk0;
import defpackage.qk0;
import defpackage.u41;
import defpackage.w84;
import defpackage.ww1;
import defpackage.yg0;
import defpackage.yr2;
import defpackage.z33;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractComposeView extends ViewGroup {
    public static final int $stable = 8;
    private WeakReference<qk0> cachedViewTreeCompositionContext;
    private pk0 composition;
    private boolean creatingComposition;
    private je1 disposeViewCompositionStrategy;
    private boolean isTransitionGroupSet;
    private qk0 parentContext;
    private IBinder previousAttachedWindowToken;
    private boolean showLayoutBounds;

    /* JADX INFO: renamed from: androidx.compose.ui.platform.AbstractComposeView$ensureCompositionCreated$1, reason: invalid class name */
    public static final class AnonymousClass1 extends ww1 implements ne1 {
        public AnonymousClass1() {
            super(2);
        }

        @Override // defpackage.ne1
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((ck0) obj, ((Number) obj2).intValue());
            return w84.a;
        }

        public final void invoke(ck0 ck0Var, int i) {
            kk0 kk0Var = (kk0) ck0Var;
            if (kk0Var.S(i & 1, (i & 3) != 2)) {
                AbstractComposeView.this.Content(kk0Var, 0);
            } else {
                kk0Var.V();
            }
        }
    }

    public AbstractComposeView(Context context) {
        this(context, null, 0, 6, null);
    }

    public AbstractComposeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public AbstractComposeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setClipChildren(false);
        setClipToPadding(false);
        setImportantForAccessibility(1);
        this.disposeViewCompositionStrategy = ViewCompositionStrategy.Companion.getDefault().installFor(this);
    }

    public /* synthetic */ AbstractComposeView(Context context, AttributeSet attributeSet, int i, int i2, ms0 ms0Var) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final qk0 cacheIfAlive(qk0 qk0Var) {
        qk0 qk0Var2 = isAlive(qk0Var) ? qk0Var : null;
        if (qk0Var2 != null) {
            this.cachedViewTreeCompositionContext = new WeakReference<>(qk0Var2);
        }
        return qk0Var;
    }

    private final void checkAddView() {
        if (this.creatingComposition) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    private final void ensureCompositionCreated() {
        if (this.composition == null) {
            try {
                this.creatingComposition = true;
                this.composition = Wrapper_androidKt.setContent(this, resolveParentCompositionContext(), new yg0(-656146368, new AnonymousClass1(), true));
            } finally {
                this.creatingComposition = false;
            }
        }
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    private final boolean isAlive(qk0 qk0Var) {
        return !(qk0Var instanceof d43) || ((z33) ((d43) qk0Var).t.getValue()).compareTo(z33.d) > 0;
    }

    private final qk0 resolveParentCompositionContext() {
        qk0 qk0Var;
        qk0 qk0VarCacheIfAlive = this.parentContext;
        if (qk0VarCacheIfAlive == null) {
            qk0 qk0VarFindViewTreeCompositionContext = WindowRecomposer_androidKt.findViewTreeCompositionContext(this);
            qk0 qk0Var2 = null;
            qk0VarCacheIfAlive = qk0VarFindViewTreeCompositionContext != null ? cacheIfAlive(qk0VarFindViewTreeCompositionContext) : null;
            if (qk0VarCacheIfAlive == null) {
                WeakReference<qk0> weakReference = this.cachedViewTreeCompositionContext;
                if (weakReference != null && (qk0Var = weakReference.get()) != null && isAlive(qk0Var)) {
                    qk0Var2 = qk0Var;
                }
                return qk0Var2 == null ? cacheIfAlive(WindowRecomposer_androidKt.getWindowRecomposer(this)) : qk0Var2;
            }
        }
        return qk0VarCacheIfAlive;
    }

    private final void setParentContext(qk0 qk0Var) {
        if (this.parentContext != qk0Var) {
            this.parentContext = qk0Var;
            if (qk0Var != null) {
                this.cachedViewTreeCompositionContext = null;
            }
            pk0 pk0Var = this.composition;
            if (pk0Var != null) {
                pk0Var.dispose();
                this.composition = null;
                if (isAttachedToWindow()) {
                    ensureCompositionCreated();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.previousAttachedWindowToken != iBinder) {
            this.previousAttachedWindowToken = iBinder;
            this.cachedViewTreeCompositionContext = null;
        }
    }

    public abstract void Content(ck0 ck0Var, int i);

    @Override // android.view.ViewGroup
    public void addView(View view) {
        checkAddView();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i) {
        checkAddView();
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, int i2) {
        checkAddView();
        super.addView(view, i, i2);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        checkAddView();
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        checkAddView();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams) {
        checkAddView();
        return super.addViewInLayout(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup
    public boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        checkAddView();
        return super.addViewInLayout(view, i, layoutParams, z);
    }

    public final void createComposition() {
        if (this.parentContext != null || isAttachedToWindow()) {
            ensureCompositionCreated();
        } else {
            u41.r("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.");
        }
    }

    public final void disposeComposition() {
        pk0 pk0Var = this.composition;
        if (pk0Var != null) {
            pk0Var.dispose();
        }
        this.composition = null;
        requestLayout();
    }

    public final boolean getHasComposition() {
        return this.composition != null;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.showLayoutBounds;
    }

    public void internalOnLayout$ui_release(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i3 - i) - getPaddingRight(), (i4 - i2) - getPaddingBottom());
        }
    }

    public void internalOnMeasure$ui_release(int i, int i2) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i, i2);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i2)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }

    @Override // android.view.ViewGroup
    public boolean isTransitionGroup() {
        return !this.isTransitionGroupSet || super.isTransitionGroup();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setPreviousAttachedWindowToken(getWindowToken());
        if (getShouldCreateCompositionOnAttachedToWindow()) {
            ensureCompositionCreated();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        internalOnLayout$ui_release(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        ensureCompositionCreated();
        internalOnMeasure$ui_release(i, i2);
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        childAt.setLayoutDirection(i);
    }

    public final void setParentCompositionContext(qk0 qk0Var) {
        setParentContext(qk0Var);
    }

    public final void setShowLayoutBounds(boolean z) {
        this.showLayoutBounds = z;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((yr2) childAt).setShowLayoutBounds(z);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z) {
        super.setTransitionGroup(z);
        this.isTransitionGroupSet = true;
    }

    public final void setViewCompositionStrategy(ViewCompositionStrategy viewCompositionStrategy) {
        je1 je1Var = this.disposeViewCompositionStrategy;
        if (je1Var != null) {
            je1Var.invoke();
        }
        this.disposeViewCompositionStrategy = viewCompositionStrategy.installFor(this);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
