package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class hs1 extends CancellationException {
    public final transient os1 c;

    public hs1(String str, Throwable th, os1 os1Var) {
        super(str);
        this.c = os1Var;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hs1)) {
            return false;
        }
        hs1 hs1Var = (hs1) obj;
        if (!kr1.n(hs1Var.getMessage(), getMessage())) {
            return false;
        }
        Object obj2 = hs1Var.c;
        if (obj2 == null) {
            obj2 = cm2.c;
        }
        Object obj3 = this.c;
        if (obj3 == null) {
            obj3 = cm2.c;
        }
        return kr1.n(obj2, obj3) && kr1.n(hs1Var.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        message.getClass();
        int iHashCode = message.hashCode() * 31;
        Object obj = this.c;
        if (obj == null) {
            obj = cm2.c;
        }
        int iHashCode2 = (iHashCode + (obj != null ? obj.hashCode() : 0)) * 31;
        Throwable cause = getCause();
        return iHashCode2 + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("; job=");
        Object obj = this.c;
        if (obj == null) {
            obj = cm2.c;
        }
        sb.append(obj);
        return sb.toString();
    }
}
