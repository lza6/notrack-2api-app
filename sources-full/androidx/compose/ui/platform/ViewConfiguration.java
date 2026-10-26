package androidx.compose.ui.platform;

import defpackage.xr0;

/* JADX INFO: loaded from: classes.dex */
public interface ViewConfiguration {

    public static final class DefaultImpls {
        @Deprecated
        public static float getHandwritingGestureLineMargin(ViewConfiguration viewConfiguration) {
            return ViewConfiguration.super.getHandwritingGestureLineMargin();
        }

        @Deprecated
        public static float getHandwritingSlop(ViewConfiguration viewConfiguration) {
            return ViewConfiguration.super.getHandwritingSlop();
        }

        @Deprecated
        public static float getMaximumFlingVelocity(ViewConfiguration viewConfiguration) {
            return ViewConfiguration.super.getMaximumFlingVelocity();
        }

        @Deprecated
        /* JADX INFO: renamed from: getMinimumTouchTargetSize-MYxV2XQ, reason: not valid java name */
        public static long m134x26874ded(ViewConfiguration viewConfiguration) {
            return ViewConfiguration.super.mo133x26874ded();
        }
    }

    long getDoubleTapMinTimeMillis();

    long getDoubleTapTimeoutMillis();

    default float getHandwritingGestureLineMargin() {
        return 16.0f;
    }

    default float getHandwritingSlop() {
        return 2.0f;
    }

    long getLongPressTimeoutMillis();

    default float getMaximumFlingVelocity() {
        return Float.MAX_VALUE;
    }

    /* JADX INFO: renamed from: getMinimumTouchTargetSize-MYxV2XQ, reason: not valid java name */
    default long mo133x26874ded() {
        return xr0.F(48.0f, 48.0f);
    }

    float getTouchSlop();
}
