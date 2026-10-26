package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wn0 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;

    public wn0(long j, long j2, long j3, long j4, long j5) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof wn0)) {
            return false;
        }
        wn0 wn0Var = (wn0) obj;
        return re0.c(this.a, wn0Var.a) && re0.c(this.b, wn0Var.b) && re0.c(this.c, wn0Var.c) && re0.c(this.d, wn0Var.d) && re0.c(this.e, wn0Var.e);
    }

    public final int hashCode() {
        int i = re0.j;
        return Long.hashCode(this.e) + ud2.h(ud2.h(ud2.h(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContextMenuColors(backgroundColor=");
        ud2.t(this.a, sb, ", textColor=");
        ud2.t(this.b, sb, ", iconColor=");
        ud2.t(this.c, sb, ", disabledTextColor=");
        ud2.t(this.d, sb, ", disabledIconColor=");
        sb.append((Object) re0.i(this.e));
        sb.append(')');
        return sb.toString();
    }
}
