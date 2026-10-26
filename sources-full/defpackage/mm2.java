package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class mm2 {
    public final Context a;
    public CharSequence e;
    public CharSequence f;
    public PendingIntent g;
    public int h;
    public bi4 j;
    public Bundle l;
    public String n;
    public final boolean o;
    public final Notification p;
    public final ArrayList q;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final boolean i = true;
    public boolean k = false;
    public int m = 0;

    public mm2(Context context, String str) {
        Notification notification = new Notification();
        this.p = notification;
        this.a = context;
        this.n = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.h = 0;
        this.q = new ArrayList();
        this.o = true;
    }

    public static CharSequence b(CharSequence charSequence) {
        return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
    }

    public final Notification a() {
        Bundle bundle;
        ci4 ci4Var = new ci4(this);
        Notification.Builder builder = (Notification.Builder) ci4Var.d;
        mm2 mm2Var = (mm2) ci4Var.h;
        bi4 bi4Var = mm2Var.j;
        if (bi4Var != null) {
            new Notification.BigTextStyle(builder).setBigContentTitle(null).bigText((CharSequence) bi4Var.d);
        }
        Notification notificationBuild = Build.VERSION.SDK_INT >= 26 ? builder.build() : builder.build();
        if (bi4Var != null) {
            mm2Var.j.getClass();
        }
        if (bi4Var != null && (bundle = notificationBuild.extras) != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", "androidx.core.app.NotificationCompat$BigTextStyle");
        }
        return notificationBuild;
    }

    public final void c(bi4 bi4Var) {
        if (this.j != bi4Var) {
            this.j = bi4Var;
            if (((mm2) bi4Var.c) != this) {
                bi4Var.c = this;
                c(bi4Var);
            }
        }
    }
}
