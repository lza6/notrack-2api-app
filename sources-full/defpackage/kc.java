package defpackage;

import android.graphics.Path;

/* JADX INFO: loaded from: classes.dex */
public abstract class kc {
    public static final ic a() {
        return new ic(new Path());
    }

    public static final Path.Direction b(lt2 lt2Var) {
        int iOrdinal = lt2Var.ordinal();
        if (iOrdinal == 0) {
            return Path.Direction.CCW;
        }
        if (iOrdinal == 1) {
            return Path.Direction.CW;
        }
        u41.e();
        return null;
    }

    public static final void c(String str) {
        throw new IllegalStateException(str);
    }
}
