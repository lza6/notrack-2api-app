package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class mm {
    public static final mm a = new mm();

    public final boolean a(Object obj, Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj instanceof pm1) || !(obj2 instanceof pm1)) {
            return kr1.n(obj, obj2);
        }
        pm1 pm1Var = (pm1) obj;
        pm1 pm1Var2 = (pm1) obj2;
        return kr1.n(pm1Var.a, pm1Var2.a) && pm1Var.b.equals(pm1Var2.b) && kr1.n(pm1Var.d, pm1Var2.d) && pm1Var.e.equals(pm1Var2.e) && kr1.n(pm1Var.f, pm1Var2.f) && kr1.n(pm1Var.q, pm1Var2.q) && pm1Var.r == pm1Var2.r && pm1Var.s == pm1Var2.s;
    }

    public final int b(Object obj) {
        if (!(obj instanceof pm1)) {
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }
        pm1 pm1Var = (pm1) obj;
        int iHashCode = (pm1Var.b.hashCode() + (pm1Var.a.hashCode() * 31)) * 31;
        String str = pm1Var.d;
        int iHashCode2 = (pm1Var.e.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31;
        String str2 = pm1Var.f;
        return pm1Var.s.hashCode() + ((pm1Var.r.hashCode() + ((pm1Var.q.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "AsyncImageModelEqualityDelegate.Default";
    }
}
