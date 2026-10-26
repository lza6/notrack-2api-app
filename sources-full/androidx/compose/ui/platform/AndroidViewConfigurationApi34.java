package androidx.compose.ui.platform;

/* JADX INFO: loaded from: classes.dex */
final class AndroidViewConfigurationApi34 {
    public static final AndroidViewConfigurationApi34 INSTANCE = new AndroidViewConfigurationApi34();

    private AndroidViewConfigurationApi34() {
    }

    public final float getScaledHandwritingGestureLineMargin(android.view.ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHandwritingGestureLineMargin();
    }

    public final float getScaledHandwritingSlop(android.view.ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHandwritingSlop();
    }
}
