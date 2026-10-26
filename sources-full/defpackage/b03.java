package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class b03 {
    public final fu a;
    public final List b;

    public b03(fu fuVar, List list) {
        fuVar.getClass();
        this.a = fuVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b03)) {
            return false;
        }
        b03 b03Var = (b03) obj;
        return kr1.n(this.a, b03Var.a) && kr1.n(this.b, b03Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        List list = this.b;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "ProductDetailsResult(billingResult=" + this.a + ", productDetailsList=" + this.b + ")";
    }
}
