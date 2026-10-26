package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class a11 implements bb4 {
    public final mi2 a;

    public a11(mi2 mi2Var) {
        this.a = mi2Var;
    }

    @Override // defpackage.bb4
    public final s13 a(vk0 vk0Var) {
        return new s13(vk0Var, null, false, null, this.a, null, true);
    }

    @Override // defpackage.bb4
    public final Object b(su2 su2Var) {
        return this.a.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a11) && kr1.n(this.a, ((a11) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DynamicValueHolder(state=" + this.a + ')';
    }
}
