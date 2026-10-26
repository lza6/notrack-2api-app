package defpackage;

import android.app.PendingIntent;

/* JADX INFO: loaded from: classes.dex */
public final class wk {
    public final int a;
    public final int b;
    public final Integer c;
    public final PendingIntent d;
    public final PendingIntent e;
    public boolean f = false;

    public wk(int i, int i2, Integer num, long j, long j2, PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3, PendingIntent pendingIntent4) {
        this.a = i;
        this.b = i2;
        this.c = num;
        this.d = pendingIntent;
        this.e = pendingIntent2;
    }

    public final PendingIntent a(ct4 ct4Var) {
        PendingIntent pendingIntent;
        int i = ct4Var.a;
        if (i == 0) {
            PendingIntent pendingIntent2 = this.e;
            if (pendingIntent2 != null) {
                return pendingIntent2;
            }
            return null;
        }
        if (i != 1 || (pendingIntent = this.d) == null) {
            return null;
        }
        return pendingIntent;
    }
}
