package defpackage;

import app.template.extension.BuildConfig;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class g60 {
    public static final List a = kr1.U("normal", "concise", "detailed", "creative");
    public static final r10 b;

    static {
        a31 a31Var = a31.c;
        b = new r10(false, a31Var, a31Var, 2, BuildConfig.VERSION_NAME, a31Var);
    }

    public static final Object a(zp0 zp0Var, le1 le1Var, so0 so0Var) {
        return py.Y(zp0Var, new f60(le1Var, (so0) null, 0), so0Var);
    }
}
