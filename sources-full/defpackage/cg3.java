package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class cg3 {
    public final Class a;
    public final Class b;

    public cg3(Class cls, Class cls2) {
        this.a = cls;
        this.b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof cg3)) {
            return false;
        }
        cg3 cg3Var = (cg3) obj;
        return cg3Var.a.equals(this.a) && cg3Var.b.equals(this.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public final String toString() {
        return this.a.getSimpleName() + " with serialization type: " + this.b.getSimpleName();
    }
}
