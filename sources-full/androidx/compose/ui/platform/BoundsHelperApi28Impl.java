package androidx.compose.ui.platform;

import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.DisplayCutout;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
final class BoundsHelperApi28Impl implements BoundsHelper {
    public static final BoundsHelperApi28Impl INSTANCE = new BoundsHelperApi28Impl();

    private BoundsHelperApi28Impl() {
    }

    @Override // androidx.compose.ui.platform.BoundsHelper
    public Rect currentWindowBounds(Activity activity) throws Exception {
        DisplayCutout cutoutForDisplay;
        Rect rect = new Rect();
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            if (activity.isInMultiWindowMode()) {
                Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
                objInvoke.getClass();
                rect.set((Rect) objInvoke);
            } else {
                Object objInvoke2 = obj.getClass().getDeclaredMethod("getAppBounds", null).invoke(obj, null);
                objInvoke2.getClass();
                rect.set((Rect) objInvoke2);
            }
        } catch (Exception e) {
            if (!(e instanceof NoSuchFieldException ? true : e instanceof NoSuchMethodException ? true : e instanceof IllegalAccessException ? true : e instanceof InvocationTargetException)) {
                throw e;
            }
            AndroidWindowInfo_androidKt.getRectSizeFromDisplay(activity, rect);
        }
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        if (!activity.isInMultiWindowMode()) {
            int navigationBarHeight = AndroidWindowInfo_androidKt.getNavigationBarHeight(activity);
            int i = rect.bottom;
            if (i + navigationBarHeight == point.y) {
                rect.bottom = i + navigationBarHeight;
            } else {
                int i2 = rect.right;
                if (i2 + navigationBarHeight == point.x) {
                    rect.right = i2 + navigationBarHeight;
                } else if (rect.left == navigationBarHeight) {
                    rect.left = 0;
                }
            }
        }
        if ((rect.width() < point.x || rect.height() < point.y) && !activity.isInMultiWindowMode() && (cutoutForDisplay = AndroidWindowInfo_androidKt.getCutoutForDisplay(defaultDisplay)) != null) {
            if (rect.left == cutoutForDisplay.getSafeInsetLeft()) {
                rect.left = 0;
            }
            if (point.x - rect.right == cutoutForDisplay.getSafeInsetRight()) {
                rect.right = cutoutForDisplay.getSafeInsetRight() + rect.right;
            }
            if (rect.top == cutoutForDisplay.getSafeInsetTop()) {
                rect.top = 0;
            }
            if (point.y - rect.bottom == cutoutForDisplay.getSafeInsetBottom()) {
                rect.bottom = cutoutForDisplay.getSafeInsetBottom() + rect.bottom;
            }
        }
        return rect;
    }
}
