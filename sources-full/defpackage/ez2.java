package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class ez2 {
    public final Class a;
    public final Class b;

    public ez2(Class cls, Class cls2) {
        this.a = cls;
        this.b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ez2)) {
            return false;
        }
        ez2 ez2Var = (ez2) obj;
        return ez2Var.a.equals(this.a) && ez2Var.b.equals(this.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public final String toString() {
        return this.a.getSimpleName() + " with primitive type: " + this.b.getSimpleName();
    }
}
