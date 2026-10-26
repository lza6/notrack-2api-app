package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class el0 implements bb4 {
    public final le1 a;

    public el0(le1 le1Var) {
        this.a = le1Var;
    }

    @Override // defpackage.bb4
    public final s13 a(vk0 vk0Var) {
        return new s13(vk0Var, null, false, null, null, this.a, false);
    }

    @Override // defpackage.bb4
    public final Object b(su2 su2Var) {
        return this.a.invoke(su2Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof el0) && kr1.n(this.a, ((el0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ComputedValueHolder(compute=" + this.a + ')';
    }
}
