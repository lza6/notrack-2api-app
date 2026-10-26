package defpackage;

import android.app.Notification;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.view.MenuItem;
import android.view.ViewConfiguration;
import com.android.billingclient.api.ProxyBillingActivity;
import java.util.function.DoubleUnaryOperator;

/* JADX INFO: loaded from: classes.dex */
public abstract class df0 {
    public static final ColorSpace a(bf0 bf0Var) {
        ColorSpace colorSpace;
        ColorSpace colorSpace2;
        if (kr1.n(bf0Var, ef0.e)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        } else if (kr1.n(bf0Var, ef0.q)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.ACES);
        } else if (kr1.n(bf0Var, ef0.r)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.ACESCG);
        } else if (kr1.n(bf0Var, ef0.o)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
        } else if (kr1.n(bf0Var, ef0.j)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.BT2020);
        } else if (kr1.n(bf0Var, ef0.i)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.BT709);
        } else if (kr1.n(bf0Var, ef0.t)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.CIE_LAB);
        } else if (kr1.n(bf0Var, ef0.s)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.CIE_XYZ);
        } else if (kr1.n(bf0Var, ef0.k)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.DCI_P3);
        } else if (kr1.n(bf0Var, ef0.l)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
        } else if (kr1.n(bf0Var, ef0.g)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
        } else if (kr1.n(bf0Var, ef0.h)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        } else if (kr1.n(bf0Var, ef0.f)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
        } else if (kr1.n(bf0Var, ef0.m)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.NTSC_1953);
        } else if (kr1.n(bf0Var, ef0.p)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
        } else if (kr1.n(bf0Var, ef0.n)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.SMPTE_C);
        } else {
            if (Build.VERSION.SDK_INT >= 34) {
                if (kr1.n(bf0Var, ef0.v)) {
                    colorSpace2 = ColorSpace.get(ColorSpace.Named.BT2020_HLG);
                } else {
                    colorSpace2 = kr1.n(bf0Var, ef0.w) ? ColorSpace.get(ColorSpace.Named.BT2020_PQ) : null;
                }
                if (colorSpace2 != null) {
                    return colorSpace2;
                }
            }
            if (bf0Var instanceof t63) {
                String str = bf0Var.a;
                t63 t63Var = (t63) bf0Var;
                float[] fArrA = t63Var.d.a();
                c54 c54Var = t63Var.g;
                ColorSpace.Rgb.TransferParameters transferParameters = c54Var != null ? new ColorSpace.Rgb.TransferParameters(c54Var.b, c54Var.c, c54Var.d, c54Var.e, c54Var.f, c54Var.g, c54Var.a) : null;
                if (transferParameters != null) {
                    return new ColorSpace.Rgb(str, t63Var.h, fArrA, transferParameters);
                }
                float[] fArr = t63Var.h;
                final s63 s63Var = t63Var.l;
                final int i = 0;
                DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator() { // from class: cf0
                    @Override // java.util.function.DoubleUnaryOperator
                    public final double applyAsDouble(double d) {
                        int i2 = i;
                        le1 le1Var = s63Var;
                        switch (i2) {
                            case 0:
                                break;
                        }
                        return ((Number) le1Var.invoke(Double.valueOf(d))).doubleValue();
                    }
                };
                final s63 s63Var2 = t63Var.o;
                final int i2 = 1;
                return new ColorSpace.Rgb(str, fArr, fArrA, doubleUnaryOperator, new DoubleUnaryOperator() { // from class: cf0
                    @Override // java.util.function.DoubleUnaryOperator
                    public final double applyAsDouble(double d) {
                        int i3 = i2;
                        le1 le1Var = s63Var2;
                        switch (i3) {
                            case 0:
                                break;
                        }
                        return ((Number) le1Var.invoke(Double.valueOf(d))).doubleValue();
                    }
                }, t63Var.e, t63Var.f);
            }
            colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        }
        return colorSpace;
    }

    public static Notification.Builder b(Context context, String str) {
        return new Notification.Builder(context, str);
    }

    public static Icon c(Bitmap bitmap) {
        return Icon.createWithAdaptiveBitmap(bitmap);
    }

    public static float d(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHorizontalScrollFactor();
    }

    public static float e(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHorizontalScrollFactor();
    }

    public static float f(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledVerticalScrollFactor();
    }

    public static float g(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledVerticalScrollFactor();
    }

    public static Intent h(ProxyBillingActivity proxyBillingActivity, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        return proxyBillingActivity.registerReceiver(broadcastReceiver, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null, 0);
    }

    public static Intent i(ProxyBillingActivity proxyBillingActivity, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        return proxyBillingActivity.registerReceiver(broadcastReceiver, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null, 2);
    }

    public static void j(MenuItem menuItem, char c, int i) {
        menuItem.setAlphabeticShortcut(c, i);
    }

    public static void k(Notification.Builder builder) {
        builder.setBadgeIconType(0);
    }

    public static void l(MenuItem menuItem, CharSequence charSequence) {
        menuItem.setContentDescription(charSequence);
    }

    public static void m(Notification.Builder builder) {
        builder.setGroupAlertBehavior(0);
    }

    public static void n(MenuItem menuItem, ColorStateList colorStateList) {
        menuItem.setIconTintList(colorStateList);
    }

    public static void o(MenuItem menuItem, PorterDuff.Mode mode) {
        menuItem.setIconTintMode(mode);
    }

    public static void p(MenuItem menuItem, char c, int i) {
        menuItem.setNumericShortcut(c, i);
    }

    public static void q(Notification.Builder builder) {
        builder.setSettingsText(null);
    }

    public static void r(Notification.Builder builder) {
        builder.setShortcutId(null);
    }

    public static void s(Notification.Builder builder) {
        builder.setTimeoutAfter(0L);
    }

    public static void t(MenuItem menuItem, CharSequence charSequence) {
        menuItem.setTooltipText(charSequence);
    }

    public static void u(Context context, Intent intent) {
        context.startForegroundService(intent);
    }
}
