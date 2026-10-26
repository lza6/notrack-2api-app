package defpackage;

import android.app.NotificationChannel;
import android.graphics.ColorSpace;
import android.view.autofill.AutofillId;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class ap {
    public static /* synthetic */ NotificationChannel D(String str) {
        return new NotificationChannel("offers", str, 3);
    }

    public static /* synthetic */ NotificationChannel d(String str) {
        return new NotificationChannel("com.google.android.gms.availability", str, 4);
    }

    public static /* bridge */ /* synthetic */ ColorSpace f(Object obj) {
        return (ColorSpace) obj;
    }

    public static /* bridge */ /* synthetic */ AutofillId g(Object obj) {
        return (AutofillId) obj;
    }

    public static /* synthetic */ void k() {
    }

    public static /* synthetic */ NotificationChannel z(String str) {
        return new NotificationChannel("updates", str, 3);
    }
}
