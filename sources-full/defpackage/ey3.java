package defpackage;

import app.template.extension.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class ey3 {
    public static final fp1 d;
    public final hg a;
    public final long b;
    public final jz3 c;

    static {
        bf3 bf3Var = bf3.E;
        pv3 pv3Var = pv3.p;
        fp1 fp1Var = z93.a;
        d = new fp1(bf3Var, pv3Var);
    }

    public ey3(hg hgVar, long j, jz3 jz3Var) {
        this.a = hgVar;
        this.b = p23.p(j, hgVar.d.length());
        this.c = jz3Var != null ? new jz3(p23.p(jz3Var.a, hgVar.d.length())) : null;
    }

    public ey3(String str, long j, int i) {
        this(new hg((i & 1) != 0 ? BuildConfig.VERSION_NAME : str), (i & 2) != 0 ? jz3.b : j, (jz3) null);
    }

    public static ey3 a(ey3 ey3Var, hg hgVar, long j, int i) {
        if ((i & 1) != 0) {
            hgVar = ey3Var.a;
        }
        if ((i & 2) != 0) {
            j = ey3Var.b;
        }
        jz3 jz3Var = (i & 4) != 0 ? ey3Var.c : null;
        ey3Var.getClass();
        return new ey3(hgVar, j, jz3Var);
    }

    public static ey3 b(ey3 ey3Var, String str, long j, int i) {
        if ((i & 2) != 0) {
            j = ey3Var.b;
        }
        jz3 jz3Var = ey3Var.c;
        ey3Var.getClass();
        return new ey3(new hg(str), j, jz3Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ey3)) {
            return false;
        }
        ey3 ey3Var = (ey3) obj;
        return jz3.b(this.b, ey3Var.b) && kr1.n(this.c, ey3Var.c) && kr1.n(this.a, ey3Var.a);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        int i = jz3.c;
        int iH = ud2.h(iHashCode, 31, this.b);
        jz3 jz3Var = this.c;
        return iH + (jz3Var != null ? Long.hashCode(jz3Var.a) : 0);
    }

    public final String toString() {
        return "TextFieldValue(text='" + ((Object) this.a) + "', selection=" + ((Object) jz3.h(this.b)) + ", composition=" + this.c + ')';
    }
}
