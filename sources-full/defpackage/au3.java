package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class au3 implements CharSequence {
    public final List c;
    public final CharSequence d;
    public final long h;
    public final jz3 l;
    public final ps2 m;

    public au3(CharSequence charSequence, long j, jz3 jz3Var, List list, int i) {
        this(charSequence, j, (i & 4) != 0 ? null : jz3Var, (ps2) null, (i & 16) != 0 ? null : list);
    }

    public au3(CharSequence charSequence, long j, jz3 jz3Var, ps2 ps2Var, List list) {
        this.c = list;
        this.d = charSequence instanceof au3 ? ((au3) charSequence).d : charSequence;
        this.h = p23.p(j, charSequence.length());
        this.l = jz3Var != null ? new jz3(p23.p(jz3Var.a, charSequence.length())) : null;
        this.m = ps2Var != null ? new ps2(ps2Var.c, new jz3(p23.p(((jz3) ps2Var.d).a, charSequence.length()))) : null;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.d.charAt(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || au3.class != obj.getClass()) {
            return false;
        }
        au3 au3Var = (au3) obj;
        if (jz3.b(this.h, au3Var.h) && kr1.n(this.l, au3Var.l) && kr1.n(this.m, au3Var.m) && kr1.n(this.c, au3Var.c)) {
            return to3.i0(this.d, au3Var.d);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.d.hashCode() * 31;
        int i = jz3.c;
        int iH = ud2.h(iHashCode, 31, this.h);
        jz3 jz3Var = this.l;
        int iHashCode2 = (iH + (jz3Var != null ? Long.hashCode(jz3Var.a) : 0)) * 31;
        ps2 ps2Var = this.m;
        int iHashCode3 = (iHashCode2 + (ps2Var != null ? ps2Var.hashCode() : 0)) * 31;
        List list = this.c;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.d.length();
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return this.d.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.d.toString();
    }
}
