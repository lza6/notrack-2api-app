package defpackage;

import androidx.compose.ui.Alignment$Companion;

/* JADX INFO: loaded from: classes.dex */
public final class sf4 implements kd2 {
    public final ut a;

    public sf4(ut utVar) {
        this.a = utVar;
    }

    @Override // defpackage.kd2
    public final int a(mq1 mq1Var, long j, int i, dx1 dx1Var) {
        int i2 = (int) (j >> 32);
        return i >= i2 ? Alignment$Companion.getCenterHorizontally().a(i, i2, dx1Var) : py.x(this.a.a(i, i2, dx1Var), 0, i2 - i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sf4) && this.a.equals(((sf4) obj).a);
    }

    public final int hashCode() {
        return Integer.hashCode(0) + (Float.hashCode(this.a.a) * 31);
    }

    public final String toString() {
        return "Horizontal(alignment=" + this.a + ", margin=0)";
    }
}
