package defpackage;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;

/* JADX INFO: loaded from: classes.dex */
public abstract class sm1 {
    public static final f61 a = new f61(fm2.a);
    public static final f61 b = new f61(ta4.b);
    public static final f61 c = new f61(null);
    public static final f61 d;
    public static final f61 e;
    public static final f61 f;
    public static final f61 g;

    static {
        Boolean bool = Boolean.TRUE;
        d = new f61(bool);
        e = new f61(null);
        f = new f61(bool);
        g = new f61(Boolean.FALSE);
    }

    public static final Bitmap.Config a(jq2 jq2Var) {
        return (Bitmap.Config) y64.A(jq2Var, b);
    }

    public static final ColorSpace b(jq2 jq2Var) {
        return ap.f(y64.A(jq2Var, c));
    }
}
