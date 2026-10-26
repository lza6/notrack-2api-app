package defpackage;

import notrack.ai.data.account.Entitlements;

/* JADX INFO: loaded from: classes.dex */
public final class p2 extends r2 {
    public final Entitlements a;
    public final String b;

    public p2(Entitlements entitlements, String str) {
        entitlements.getClass();
        str.getClass();
        this.a = entitlements;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p2)) {
            return false;
        }
        p2 p2Var = (p2) obj;
        return kr1.n(this.a, p2Var.a) && kr1.n(this.b, p2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Registered(entitlements=" + this.a + ", recoveryCode=" + this.b + ")";
    }
}
