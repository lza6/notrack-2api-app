package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class bg3 {
    public final Class a;
    public final nz b;

    public bg3(Class cls, nz nzVar) {
        this.a = cls;
        this.b = nzVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bg3)) {
            return false;
        }
        bg3 bg3Var = (bg3) obj;
        return bg3Var.a.equals(this.a) && bg3Var.b.equals(this.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public final String toString() {
        return this.a.getSimpleName() + ", object identifier: " + this.b;
    }
}
