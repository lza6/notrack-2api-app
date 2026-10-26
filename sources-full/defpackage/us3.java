package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class us3 {
    public final sd a = new sd();

    public final void a(Exception exc) {
        sd sdVar = this.a;
        sdVar.getClass();
        g13.t(exc, "Exception must not be null");
        synchronized (sdVar.b) {
            try {
                if (sdVar.a) {
                    return;
                }
                sdVar.a = true;
                sdVar.e = exc;
                ((cr1) sdVar.c).h(sdVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(Object obj) {
        sd sdVar = this.a;
        synchronized (sdVar.b) {
            try {
                if (sdVar.a) {
                    return;
                }
                sdVar.a = true;
                sdVar.d = obj;
                ((cr1) sdVar.c).h(sdVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
