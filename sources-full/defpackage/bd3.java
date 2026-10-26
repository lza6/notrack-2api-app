package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bd3 {
    public final long a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final xy3 f;

    public bd3(long j, int i, int i2, int i3, int i4, xy3 xy3Var) {
        this.a = j;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = xy3Var;
    }

    public final ed3 a(int i) {
        return new ed3(p23.C(this.f, i), i, this.a);
    }

    public final sq0 b() {
        int i = this.c;
        int i2 = this.d;
        if (i < i2) {
            return sq0.d;
        }
        return i > i2 ? sq0.c : sq0.h;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionInfo(id=");
        sb.append(this.a);
        sb.append(", range=(");
        int i = this.c;
        sb.append(i);
        sb.append('-');
        xy3 xy3Var = this.f;
        sb.append(p23.C(xy3Var, i));
        sb.append(',');
        int i2 = this.d;
        sb.append(i2);
        sb.append('-');
        sb.append(p23.C(xy3Var, i2));
        sb.append("), prevOffset=");
        return fq2.p(sb, this.e, ')');
    }
}
