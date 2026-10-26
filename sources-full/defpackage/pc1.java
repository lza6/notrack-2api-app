package defpackage;

import android.app.Notification;

/* JADX INFO: loaded from: classes.dex */
public final class pc1 {
    public final int a;
    public final int b;
    public final Notification c;

    public pc1(int i, Notification notification, int i2) {
        this.a = i;
        this.c = notification;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || pc1.class != obj.getClass()) {
            return false;
        }
        pc1 pc1Var = (pc1) obj;
        if (this.a == pc1Var.a && this.b == pc1Var.b) {
            return this.c.equals(pc1Var.c);
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + (((this.a * 31) + this.b) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.a + ", mForegroundServiceType=" + this.b + ", mNotification=" + this.c + '}';
    }
}
