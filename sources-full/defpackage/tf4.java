package defpackage;

import androidx.compose.ui.Alignment$Companion;

/* JADX INFO: loaded from: classes.dex */
public final class tf4 implements ld2 {
    public final xt a;
    public final int b;

    public tf4(xt xtVar, int i) {
        this.a = xtVar;
        this.b = i;
    }

    @Override // defpackage.ld2
    public final int a(mq1 mq1Var, long j, int i) {
        int i2 = (int) (j & 4294967295L);
        int i3 = this.b;
        return i >= i2 - (i3 * 2) ? Alignment$Companion.getCenterVertically().a(i, i2) : py.x(this.a.a(i, i2), i3, (i2 - i3) - i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tf4)) {
            return false;
        }
        tf4 tf4Var = (tf4) obj;
        return this.a.equals(tf4Var.a) && this.b == tf4Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Float.hashCode(this.a.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Vertical(alignment=");
        sb.append(this.a);
        sb.append(", margin=");
        return fq2.p(sb, this.b, ')');
    }
}
