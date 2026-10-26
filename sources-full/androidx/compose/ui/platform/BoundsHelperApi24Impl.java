package androidx.compose.ui.platform;

import android.app.Activity;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;

/* JADX INFO: loaded from: classes.dex */
final class BoundsHelperApi24Impl implements BoundsHelper {
    public static final BoundsHelperApi24Impl INSTANCE = new BoundsHelperApi24Impl();

    private BoundsHelperApi24Impl() {
    }

    @Override // androidx.compose.ui.platform.BoundsHelper
    public Rect currentWindowBounds(Activity activity) {
        Rect rect = new Rect();
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        defaultDisplay.getRectSize(rect);
        if (!activity.isInMultiWindowMode()) {
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            int navigationBarHeight = AndroidWindowInfo_androidKt.getNavigationBarHeight(activity);
            int i = rect.bottom;
            if (i + navigationBarHeight == point.y) {
                rect.bottom = i + navigationBarHeight;
                return rect;
            }
            int i2 = rect.right;
            if (i2 + navigationBarHeight == point.x) {
                rect.right = i2 + navigationBarHeight;
            }
        }
        return rect;
    }
}
