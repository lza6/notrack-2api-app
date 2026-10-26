package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pg3 {
    public static final pg3 d = new pg3();
    public final long a;
    public final long b;
    public final float c;

    public /* synthetic */ pg3() {
        this(gb2.d(4278190080L), 0L, 0.0f);
    }

    public pg3(long j, long j2, float f) {
        this.a = j;
        this.b = j2;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pg3)) {
            return false;
        }
        pg3 pg3Var = (pg3) obj;
        return re0.c(this.a, pg3Var.a) && ln2.c(this.b, pg3Var.b) && this.c == pg3Var.c;
    }

    public final int hashCode() {
        int i = re0.j;
        return Float.hashCode(this.c) + ud2.h(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Shadow(color=");
        ud2.t(this.a, sb, ", offset=");
        sb.append((Object) ln2.k(this.b));
        sb.append(", blurRadius=");
        return fq2.o(sb, this.c, ')');
    }
}
