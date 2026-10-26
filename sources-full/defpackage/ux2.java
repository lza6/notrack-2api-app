package defpackage;

import kotlin.io.ConstantsKt;

/* JADX INFO: loaded from: classes.dex */
public final class ux2 {
    public final int a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public ux2(int i) {
        this((i & 1) == 0, tc3.c, true);
    }

    public ux2(boolean z, tc3 tc3Var, boolean z2) {
        dl0 dl0Var = yc.a;
        int i = !z ? 262152 : 262144;
        i = tc3Var == tc3.d ? i | ConstantsKt.DEFAULT_BUFFER_SIZE : i;
        i = z2 ? i : i | ConstantsKt.MINIMUM_BLOCK_SIZE;
        boolean z3 = tc3Var == tc3.c;
        this.a = i;
        this.b = z3;
        this.c = true;
        this.d = true;
        this.e = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ux2)) {
            return false;
        }
        ux2 ux2Var = (ux2) obj;
        return this.a == ux2Var.a && this.b == ux2Var.b && this.c == ux2Var.c && this.d == ux2Var.d && this.e == ux2Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + ud2.k(ud2.k(ud2.k(ud2.k(this.a * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }
}
