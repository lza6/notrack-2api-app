package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class fk4 {
    public final vg a;
    public final o61 b;

    public /* synthetic */ fk4(vg vgVar, o61 o61Var) {
        this.a = vgVar;
        this.b = o61Var;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof fk4)) {
            return false;
        }
        fk4 fk4Var = (fk4) obj;
        return gb2.D(this.a, fk4Var.a) && gb2.D(this.b, fk4Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        mi4 mi4Var = new mi4(this);
        mi4Var.b(this.a, "key");
        mi4Var.b(this.b, "feature");
        return mi4Var.toString();
    }
}
