package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class mx0 implements t13 {
    public static final Object h = new Object();
    public volatile i61 c;
    public volatile Object d;

    public static t13 a(i61 i61Var) {
        if (i61Var instanceof mx0) {
            return i61Var;
        }
        mx0 mx0Var = new mx0();
        mx0Var.d = h;
        mx0Var.c = i61Var;
        return mx0Var;
    }

    @Override // defpackage.t13
    public final Object get() {
        Object obj;
        Object obj2 = this.d;
        Object obj3 = h;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.d;
                if (obj == obj3) {
                    obj = this.c.get();
                    Object obj4 = this.d;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.d = obj;
                    this.c = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
