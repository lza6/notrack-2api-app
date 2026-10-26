package defpackage;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Insets;
import android.util.Log;
import androidx.work.impl.foreground.SystemForegroundService;

/* JADX INFO: loaded from: classes.dex */
public abstract class vk {
    public static String a(Context context) {
        return context.getOpPackageName();
    }

    public static Insets b(int i, int i2, int i3, int i4) {
        return Insets.of(i, i2, i3, i4);
    }

    public static void c(Resources.Theme theme) {
        theme.rebase();
    }

    public static void d(Notification.Builder builder, boolean z) {
        builder.setAllowSystemGeneratedContextualActions(z);
    }

    public static void e(Notification.Builder builder) {
        builder.setBubbleMetadata(null);
    }

    public static void f(Notification.Action.Builder builder) {
        builder.setContextual(false);
    }

    public static void g(SystemForegroundService systemForegroundService, int i, Notification notification, int i2) {
        systemForegroundService.startForeground(i, notification, i2);
    }

    public static void h(SystemForegroundService systemForegroundService, int i, Notification notification, int i2) {
        try {
            systemForegroundService.startForeground(i, notification, i2);
        } catch (ForegroundServiceStartNotAllowedException e) {
            v72 v72VarF = v72.f();
            String str = SystemForegroundService.m;
            if (v72VarF.c <= 5) {
                Log.w(str, "Unable to start foreground service", e);
            }
        } catch (SecurityException e2) {
            v72 v72VarF2 = v72.f();
            String str2 = SystemForegroundService.m;
            if (v72VarF2.c <= 5) {
                Log.w(str2, "Unable to start foreground service", e2);
            }
        }
    }
}
