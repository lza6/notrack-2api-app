package defpackage;

import android.app.Application;
import android.app.Notification;
import android.app.job.JobParameters;
import android.graphics.drawable.Icon;
import android.icu.text.DecimalFormatSymbols;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.PrecomputedText;
import android.view.DisplayCutout;
import android.view.ViewConfiguration;
import android.widget.TextView;
import java.util.concurrent.Executor;
import notrack.ai.MainActivity;

/* JADX INFO: loaded from: classes.dex */
public abstract class og {
    public static Handler a(Looper looper) {
        return Handler.createAsync(looper);
    }

    public static Handler b(Looper looper) {
        return Handler.createAsync(looper);
    }

    public static String[] c(DecimalFormatSymbols decimalFormatSymbols) {
        return decimalFormatSymbols.getDigitStrings();
    }

    public static Executor d(MainActivity mainActivity) {
        return mainActivity.getMainExecutor();
    }

    public static void e(JobParameters jobParameters) {
        jobParameters.getNetwork();
    }

    public static String f() {
        String processName = Application.getProcessName();
        processName.getClass();
        return processName;
    }

    public static int g(Object obj) {
        return ((Icon) obj).getResId();
    }

    public static String h(Object obj) {
        return ((Icon) obj).getResPackage();
    }

    public static int i(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetBottom();
    }

    public static int j(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetLeft();
    }

    public static int k(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetRight();
    }

    public static int l(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetTop();
    }

    public static int m(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHoverSlop();
    }

    public static PrecomputedText.Params n(kk kkVar) {
        return kkVar.getTextMetricsParams();
    }

    public static int o(Object obj) {
        return ((Icon) obj).getType();
    }

    public static Uri p(Object obj) {
        return ((Icon) obj).getUri();
    }

    public static void q(TextView textView, int i) {
        textView.setFirstBaselineToTopHeight(i);
    }

    public static void r(Notification.Action.Builder builder) {
        builder.setSemanticAction(0);
    }

    public static boolean s(ViewConfiguration viewConfiguration) {
        return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
    }
}
