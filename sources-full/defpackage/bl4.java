package defpackage;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public abstract class bl4 {
    public static final int a;

    static {
        a = Build.VERSION.SDK_INT >= 31 ? 33554432 : 0;
    }
}
