package defpackage;

import notrack.ai.data.account.Entitlements;

/* JADX INFO: loaded from: classes.dex */
public final class q2 extends r2 {
    public final Entitlements a;

    public q2(Entitlements entitlements) {
        entitlements.getClass();
        this.a = entitlements;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q2) && kr1.n(this.a, ((q2) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Success(entitlements=" + this.a + ")";
    }
}
