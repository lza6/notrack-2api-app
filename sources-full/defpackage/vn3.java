package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vn3 implements bb4 {
    public final Object a;

    public vn3(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.bb4
    public final s13 a(vk0 vk0Var) {
        Object obj = this.a;
        return new s13(vk0Var, obj, obj == null, null, null, null, false);
    }

    @Override // defpackage.bb4
    public final Object b(su2 su2Var) {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vn3) && kr1.n(this.a, ((vn3) obj).a);
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "StaticValueHolder(value=" + this.a + ')';
    }
}
