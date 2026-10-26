package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ln4 {
    public static final ln4 c;
    public static final ln4 d;
    public final boolean a;
    public final Throwable b;

    static {
        if (un4.n) {
            d = null;
            c = null;
        } else {
            d = new ln4(null, false);
            c = new ln4(null, true);
        }
    }

    public ln4(Throwable th, boolean z) {
        this.a = z;
        this.b = th;
    }
}
