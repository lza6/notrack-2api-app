package androidx.compose.ui.platform;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.Display;
import android.view.DisplayCutout;
import defpackage.d1;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidWindowInfo_androidKt {
    public static final long calculateWindowSize(AndroidComposeView androidComposeView) {
        int iRound;
        long j;
        Context context = androidComposeView.getContext();
        Activity activityFindActivity = findActivity(context);
        if (activityFindActivity != null) {
            Rect rectCurrentWindowBounds = BoundsHelper.Companion.getInstance().currentWindowBounds(activityFindActivity);
            int iWidth = rectCurrentWindowBounds.width();
            iRound = rectCurrentWindowBounds.height();
            j = iWidth;
        } else {
            Configuration configuration = context.getResources().getConfiguration();
            float f = context.getResources().getDisplayMetrics().density;
            int iRound2 = Math.round(configuration.screenWidthDp * f);
            iRound = Math.round(configuration.screenHeightDp * f);
            j = iRound2;
        }
        return (((long) iRound) & 4294967295L) | (j << 32);
    }

    private static final Activity findActivity(Context context) {
        while (!(context instanceof Activity)) {
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return (Activity) context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisplayCutout getCutoutForDisplay(Display display) throws Exception {
        try {
            Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor(null);
            constructor.setAccessible(true);
            Object objNewInstance = constructor.newInstance(null);
            Method declaredMethod = display.getClass().getDeclaredMethod("getDisplayInfo", objNewInstance.getClass());
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(display, objNewInstance);
            Field declaredField = objNewInstance.getClass().getDeclaredField("displayCutout");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(objNewInstance);
            if (d1.w(obj)) {
                return d1.h(obj);
            }
        } catch (Exception e) {
            if (!(e instanceof ClassNotFoundException ? true : e instanceof NoSuchMethodException ? true : e instanceof NoSuchFieldException ? true : e instanceof IllegalAccessException ? true : e instanceof InvocationTargetException ? true : e instanceof InstantiationException)) {
                throw e;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getNavigationBarHeight(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getRectSizeFromDisplay(Activity activity, Rect rect) {
        activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
    }
}
