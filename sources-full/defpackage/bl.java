package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bl extends kr1 {
    public static volatile bl n;
    public static final al o = new al(0);
    public final xt0 m = new xt0();

    public static bl q0() {
        if (n != null) {
            return n;
        }
        synchronized (bl.class) {
            try {
                if (n == null) {
                    n = new bl();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return n;
    }
}
