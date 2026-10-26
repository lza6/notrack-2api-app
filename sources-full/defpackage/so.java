package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class so {
    public final long a;
    public final vo b;
    public final mo c;

    public so(long j, vo voVar, mo moVar) {
        this.a = j;
        this.b = voVar;
        this.c = moVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof so)) {
            return false;
        }
        so soVar = (so) obj;
        return this.a == soVar.a && this.b.equals(soVar.b) && this.c.equals(soVar.c);
    }

    public final int hashCode() {
        long j = this.a;
        return this.c.hashCode() ^ ((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.a + ", transportContext=" + this.b + ", event=" + this.c + "}";
    }
}
