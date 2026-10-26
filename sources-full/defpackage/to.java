package defpackage;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class to {
    public final ld0 a;
    public final HashMap b;

    public to(ld0 ld0Var, HashMap map) {
        this.a = ld0Var;
        this.b = map;
    }

    public final long a(lz2 lz2Var, long j, int i) {
        long jA = j - this.a.a();
        uo uoVar = (uo) this.b.get(lz2Var);
        long j2 = uoVar.a;
        int i2 = i - 1;
        return Math.min(Math.max((long) (Math.pow(3.0d, i2) * j2 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j2 > 1 ? j2 : 2L) * ((long) i2)))), jA), uoVar.b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof to)) {
            return false;
        }
        to toVar = (to) obj;
        return this.a.equals(toVar.a) && this.b.equals(toVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.a + ", values=" + this.b + "}";
    }
}
