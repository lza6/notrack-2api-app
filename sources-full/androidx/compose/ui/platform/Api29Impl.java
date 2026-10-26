package androidx.compose.ui.platform;

/* JADX INFO: loaded from: classes.dex */
public final class Api29Impl {
    public static final int $stable = 0;
    public static final Api29Impl INSTANCE = new Api29Impl();

    private Api29Impl() {
    }

    public final int getRecommendedTimeoutMillis(android.view.accessibility.AccessibilityManager accessibilityManager, int i, int i2) {
        return accessibilityManager.getRecommendedTimeoutMillis(i, i2);
    }
}
