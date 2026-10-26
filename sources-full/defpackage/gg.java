package defpackage;

import app.template.extension.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class gg {
    public final Object a;
    public final int b;
    public final int c;
    public final String d;

    public gg(int i, int i2, Object obj) {
        this(i, i2, obj, BuildConfig.VERSION_NAME);
    }

    public gg(int i, int i2, Object obj, String str) {
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = str;
        if (i <= i2) {
            return;
        }
        qo1.a("Reversed range is not supported");
    }

    public static gg a(gg ggVar, xs2 xs2Var, int i, int i2, int i3) {
        Object obj = xs2Var;
        if ((i3 & 1) != 0) {
            obj = ggVar.a;
        }
        if ((i3 & 2) != 0) {
            i = ggVar.b;
        }
        if ((i3 & 4) != 0) {
            i2 = ggVar.c;
        }
        return new gg(i, i2, obj, ggVar.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gg)) {
            return false;
        }
        gg ggVar = (gg) obj;
        return kr1.n(this.a, ggVar.a) && this.b == ggVar.b && this.c == ggVar.c && kr1.n(this.d, ggVar.d);
    }

    public final int hashCode() {
        Object obj = this.a;
        return this.d.hashCode() + fq2.e(this.c, fq2.e(this.b, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Range(item=");
        sb.append(this.a);
        sb.append(", start=");
        sb.append(this.b);
        sb.append(", end=");
        sb.append(this.c);
        sb.append(", tag=");
        return ud2.r(sb, this.d, ')');
    }
}
