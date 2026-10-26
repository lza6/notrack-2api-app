package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yr implements o53 {
    public final gs1 c;

    public /* synthetic */ yr(gs1 gs1Var) {
        this.c = gs1Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof yr) {
            return this.c.equals(((yr) obj).c);
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return "BaseRequestDelegate(job=" + this.c + ')';
    }
}
