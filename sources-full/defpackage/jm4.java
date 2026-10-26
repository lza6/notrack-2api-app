package defpackage;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public abstract class jm4 {
    public static final im4 a;

    static {
        im4 im4Var;
        try {
            SystemClock.elapsedRealtimeNanos();
            im4Var = new im4(0);
        } catch (Throwable unused) {
            SystemClock.elapsedRealtime();
            im4Var = new im4(1);
        }
        a = im4Var;
    }
}
