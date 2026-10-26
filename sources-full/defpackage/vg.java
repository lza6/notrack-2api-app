package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class vg {
    public final int a;
    public final mi4 b;
    public final String c;

    public vg(mi4 mi4Var, String str) {
        this.b = mi4Var;
        this.c = str;
        this.a = Arrays.hashCode(new Object[]{mi4Var, ht3.a, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof vg)) {
            return false;
        }
        vg vgVar = (vg) obj;
        if (!gb2.D(this.b, vgVar.b)) {
            return false;
        }
        ht3 ht3Var = ht3.a;
        return gb2.D(ht3Var, ht3Var) && gb2.D(this.c, vgVar.c);
    }

    public final int hashCode() {
        return this.a;
    }
}
