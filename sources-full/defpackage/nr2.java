package defpackage;

import androidx.compose.foundation.layout.a;

/* JADX INFO: loaded from: classes.dex */
public final class nr2 {
    public final long a;
    public final is2 b;

    public nr2() {
        long jD = gb2.d(4284900966L);
        is2 is2VarA = a.a(0.0f, 0.0f, 3);
        this.a = jD;
        this.b = is2VarA;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!nr2.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        nr2 nr2Var = (nr2) obj;
        return re0.c(this.a, nr2Var.a) && kr1.n(this.b, nr2Var.b);
    }

    public final int hashCode() {
        int i = re0.j;
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OverscrollConfiguration(glowColor=");
        ud2.t(this.a, sb, ", drawPadding=");
        sb.append(this.b);
        sb.append(')');
        return sb.toString();
    }
}
