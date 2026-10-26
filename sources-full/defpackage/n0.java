package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class n0 {
    public static final n0 b;
    public static final n0 c;
    public final Throwable a;

    static {
        if (u0.l) {
            c = null;
            b = null;
        } else {
            c = new n0(null, false);
            b = new n0(null, true);
        }
    }

    public n0(Throwable th, boolean z) {
        this.a = th;
    }
}
