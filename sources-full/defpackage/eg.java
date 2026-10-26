package defpackage;

import app.template.extension.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class eg {
    public final Object a;
    public final int b;
    public int c;
    public final String d;

    public eg(int i, int i2, Object obj, String str) {
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = str;
    }

    public /* synthetic */ eg(em3 em3Var, int i, int i2, int i3) {
        this(i, (i3 & 4) != 0 ? Integer.MIN_VALUE : i2, em3Var, BuildConfig.VERSION_NAME);
    }

    public final gg a(int i) {
        int i2 = this.c;
        if (i2 != Integer.MIN_VALUE) {
            i = i2;
        }
        if (!(i != Integer.MIN_VALUE)) {
            qo1.b("Item.end should be set first");
        }
        return new gg(this.b, i, this.a, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eg)) {
            return false;
        }
        eg egVar = (eg) obj;
        return kr1.n(this.a, egVar.a) && this.b == egVar.b && this.c == egVar.c && kr1.n(this.d, egVar.d);
    }

    public final int hashCode() {
        Object obj = this.a;
        return this.d.hashCode() + fq2.e(this.c, fq2.e(this.b, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MutableRange(item=");
        sb.append(this.a);
        sb.append(", start=");
        sb.append(this.b);
        sb.append(", end=");
        sb.append(this.c);
        sb.append(", tag=");
        return ud2.r(sb, this.d, ')');
    }
}
