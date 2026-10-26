package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a23 {
    public final fu a;
    public final List b;

    public a23(fu fuVar, List list) {
        fuVar.getClass();
        list.getClass();
        this.a = fuVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a23)) {
            return false;
        }
        a23 a23Var = (a23) obj;
        return kr1.n(this.a, a23Var.a) && kr1.n(this.b, a23Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PurchasesResult(billingResult=" + this.a + ", purchasesList=" + this.b + ")";
    }
}
