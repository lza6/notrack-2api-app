package defpackage;

import android.app.ApplicationExitInfo;
import android.content.pm.InstallSourceInfo;
import android.graphics.Insets;
import android.view.WindowInsetsAnimation;
import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class g1 {
    public static /* bridge */ /* synthetic */ String A(InstallSourceInfo installSourceInfo) {
        installSourceInfo.getInstallingPackageName();
        return "com.android.vending";
    }

    public static /* bridge */ /* synthetic */ ApplicationExitInfo f(Object obj) {
        return (ApplicationExitInfo) obj;
    }

    public static /* synthetic */ WindowInsetsAnimation.Bounds i(Insets insets, Insets insets2) {
        return new WindowInsetsAnimation.Bounds(insets, insets2);
    }

    public static /* synthetic */ WindowInsetsAnimation j(int i, Interpolator interpolator, long j) {
        return new WindowInsetsAnimation(i, interpolator, j);
    }

    public static /* bridge */ /* synthetic */ String n(InstallSourceInfo installSourceInfo) {
        installSourceInfo.getInitiatingPackageName();
        return "com.android.vending";
    }

    public static /* synthetic */ void p() {
    }
}
