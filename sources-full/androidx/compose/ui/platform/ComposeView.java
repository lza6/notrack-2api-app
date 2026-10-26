package androidx.compose.ui.platform;

import android.content.Context;
import android.util.AttributeSet;
import defpackage.ck0;
import defpackage.cl3;
import defpackage.kk0;
import defpackage.mi2;
import defpackage.ms0;
import defpackage.ne1;

/* JADX INFO: loaded from: classes.dex */
public final class ComposeView extends AbstractComposeView {
    public static final int $stable = 8;
    private final mi2 content;
    private boolean shouldCreateCompositionOnAttachedToWindow;

    public ComposeView(Context context) {
        this(context, null, 0, 6, null);
    }

    public ComposeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public ComposeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.content = cl3.d(null);
    }

    public /* synthetic */ ComposeView(Context context, AttributeSet attributeSet, int i, int i2, ms0 ms0Var) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public void Content(ck0 ck0Var, int i) {
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.a0(420213850);
        ne1 ne1Var = (ne1) this.content.getValue();
        if (ne1Var == null) {
            kk0Var.a0(358356153);
        } else {
            kk0Var.a0(150107208);
            ne1Var.invoke(kk0Var, 0);
        }
        kk0Var.r(false);
        kk0Var.r(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.compose.ui.platform.ComposeView";
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.shouldCreateCompositionOnAttachedToWindow;
    }

    public final void setContent(ne1 ne1Var) {
        this.shouldCreateCompositionOnAttachedToWindow = true;
        this.content.setValue(ne1Var);
        if (isAttachedToWindow()) {
            createComposition();
        }
    }
}
