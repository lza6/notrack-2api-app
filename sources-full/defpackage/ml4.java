package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ml4 implements ql4 {
    public static final Object h = new Object();
    public volatile ql4 c;
    public volatile Object d;

    public static ql4 a(ql4 ql4Var) {
        if (ql4Var instanceof ml4) {
            return ql4Var;
        }
        ml4 ml4Var = new ml4();
        ml4Var.d = h;
        ml4Var.c = ql4Var;
        return ml4Var;
    }

    @Override // defpackage.ql4
    public final Object f() {
        Object objF;
        Object obj = this.d;
        Object obj2 = h;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            try {
                objF = this.d;
                if (objF == obj2) {
                    objF = this.c.f();
                    Object obj3 = this.d;
                    if (obj3 != obj2 && obj3 != objF) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + objF + ". This is likely due to a circular dependency.");
                    }
                    this.d = objF;
                    this.c = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return objF;
    }
}
