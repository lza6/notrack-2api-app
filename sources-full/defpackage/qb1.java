package defpackage;

import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class qb1 {
    public String a;
    public String b;
    public List c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qb1)) {
            return false;
        }
        qb1 qb1Var = (qb1) obj;
        return Objects.equals(this.a, qb1Var.a) && Objects.equals(this.b, qb1Var.b) && Objects.equals(this.c, qb1Var.c);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }
}
