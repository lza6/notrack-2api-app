package defpackage;

import androidx.compose.ui.platform.ViewConfiguration;

/* JADX INFO: loaded from: classes.dex */
public final class px1 implements ViewConfiguration {
    @Override // androidx.compose.ui.platform.ViewConfiguration
    public final long getDoubleTapMinTimeMillis() {
        return 40L;
    }

    @Override // androidx.compose.ui.platform.ViewConfiguration
    public final long getDoubleTapTimeoutMillis() {
        return 300L;
    }

    @Override // androidx.compose.ui.platform.ViewConfiguration
    public final long getLongPressTimeoutMillis() {
        return 400L;
    }

    @Override // androidx.compose.ui.platform.ViewConfiguration
    /* JADX INFO: renamed from: getMinimumTouchTargetSize-MYxV2XQ */
    public final long mo133x26874ded() {
        return 0L;
    }

    @Override // androidx.compose.ui.platform.ViewConfiguration
    public final float getTouchSlop() {
        return 16.0f;
    }
}
