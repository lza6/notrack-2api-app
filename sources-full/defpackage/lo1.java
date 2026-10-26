package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class lo1 extends xw2 {
    public final boolean l;

    public lo1(String str, mo1 mo1Var) {
        super(str, mo1Var, 1);
        this.l = true;
    }

    @Override // defpackage.xw2
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof lo1) {
            tf3 tf3Var = (tf3) obj;
            if (this.a.equals(tf3Var.b())) {
                lo1 lo1Var = (lo1) obj;
                if (lo1Var.l && Arrays.equals((tf3[]) this.j.getValue(), (tf3[]) lo1Var.j.getValue())) {
                    int iD = tf3Var.d();
                    int i = this.c;
                    if (i == iD) {
                        for (int i2 = 0; i2 < i; i2++) {
                            if (kr1.n(i(i2).b(), tf3Var.i(i2).b()) && kr1.n(i(i2).c(), tf3Var.i(i2).c())) {
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.xw2
    public final int hashCode() {
        return super.hashCode() * 31;
    }

    @Override // defpackage.xw2, defpackage.tf3
    public final boolean isInline() {
        return this.l;
    }
}
