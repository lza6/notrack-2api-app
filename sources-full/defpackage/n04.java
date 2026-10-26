package defpackage;

import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public abstract class n04 {
    public static final long a;

    static {
        long id;
        try {
            id = Looper.getMainLooper().getThread().getId();
        } catch (Exception unused) {
            id = -1;
        }
        a = id;
    }
}
