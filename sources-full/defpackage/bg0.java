package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bg0 {
    public final Object a;
    public final m00 b;
    public final oe1 c;
    public final Object d;
    public final Throwable e;

    public bg0(Object obj, m00 m00Var, oe1 oe1Var, Object obj2, Throwable th) {
        this.a = obj;
        this.b = m00Var;
        this.c = oe1Var;
        this.d = obj2;
        this.e = th;
    }

    public /* synthetic */ bg0(Object obj, m00 m00Var, oe1 oe1Var, Throwable th, int i) {
        this(obj, (i & 2) != 0 ? null : m00Var, (i & 4) != 0 ? null : oe1Var, (Object) null, (i & 16) != 0 ? null : th);
    }

    public static bg0 a(bg0 bg0Var, m00 m00Var, Throwable th, int i) {
        Object obj = bg0Var.a;
        if ((i & 2) != 0) {
            m00Var = bg0Var.b;
        }
        m00 m00Var2 = m00Var;
        oe1 oe1Var = bg0Var.c;
        Object obj2 = bg0Var.d;
        if ((i & 16) != 0) {
            th = bg0Var.e;
        }
        return new bg0(obj, m00Var2, oe1Var, obj2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bg0)) {
            return false;
        }
        bg0 bg0Var = (bg0) obj;
        return kr1.n(this.a, bg0Var.a) && kr1.n(this.b, bg0Var.b) && kr1.n(this.c, bg0Var.c) && kr1.n(this.d, bg0Var.d) && kr1.n(this.e, bg0Var.e);
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        m00 m00Var = this.b;
        int iHashCode2 = (iHashCode + (m00Var == null ? 0 : m00Var.hashCode())) * 31;
        oe1 oe1Var = this.c;
        int iHashCode3 = (iHashCode2 + (oe1Var == null ? 0 : oe1Var.hashCode())) * 31;
        Object obj2 = this.d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.e;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.a + ", cancelHandler=" + this.b + ", onCancellation=" + this.c + ", idempotentResume=" + this.d + ", cancelCause=" + this.e + ')';
    }
}
