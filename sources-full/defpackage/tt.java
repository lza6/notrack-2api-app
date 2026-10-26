package defpackage;

import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class tt {
    public final String a;
    public final String b;
    public final int c;
    public final String d;
    public final String e;
    public final int f;

    public /* synthetic */ tt(int i, int i2, int i3, String str) {
        this("none", "none", (i3 & 4) != 0 ? 35 : i, "none", (i3 & 16) != 0 ? "m" : str, (i3 & 32) != 0 ? 60 : i2);
    }

    public tt(String str, String str2, int i, String str3, String str4, int i2) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = str4;
        this.f = i2;
    }

    public static tt b(tt ttVar, String str, String str2, int i, String str3, String str4, int i2, int i3) {
        if ((i3 & 1) != 0) {
            str = ttVar.a;
        }
        String str5 = str;
        if ((i3 & 2) != 0) {
            str2 = ttVar.b;
        }
        String str6 = str2;
        if ((i3 & 4) != 0) {
            i = ttVar.c;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            str3 = ttVar.d;
        }
        String str7 = str3;
        if ((i3 & 16) != 0) {
            str4 = ttVar.e;
        }
        String str8 = str4;
        if ((i3 & 32) != 0) {
            i2 = ttVar.f;
        }
        ttVar.getClass();
        str5.getClass();
        str6.getClass();
        str7.getClass();
        str8.getClass();
        return new tt(str5, str6, i4, str7, str8, i2);
    }

    public final tt a(qt qtVar) {
        String str = this.a;
        if (!kr1.n(str, "none") && !kr1.n(str, "own") && qtVar.a(str) == null) {
            str = "none";
        }
        List list = qtVar.f;
        String str2 = this.b;
        if (!list.contains(str2)) {
            str2 = "none";
        }
        st stVar = qtVar.g;
        int iX = py.x(this.c, stVar.a, stVar.b);
        Set setS = py.S("none", "ai", "own");
        String str3 = this.d;
        String str4 = setS.contains(str3) ? str3 : "none";
        Set setS2 = py.S("s", "m", "l");
        String str5 = this.e;
        String str6 = setS2.contains(str5) ? str5 : "m";
        st stVar2 = qtVar.h;
        return new tt(str, str2, iX, str4, str6, py.x(this.f, stVar2.a, stVar2.b));
    }

    public final boolean c(qt qtVar) {
        qtVar.getClass();
        return qtVar.c.contains(this.a) && qtVar.d.contains(this.b) && qtVar.e.contains(this.d);
    }

    public final tt d(qt qtVar) {
        qtVar.getClass();
        Set set = qtVar.c;
        String str = this.a;
        String str2 = set.contains(str) ? str : "none";
        Set set2 = qtVar.d;
        String str3 = this.b;
        String str4 = set2.contains(str3) ? str3 : "none";
        Set set3 = qtVar.e;
        String str5 = this.d;
        return b(this, str2, str4, 0, set3.contains(str5) ? str5 : "none", null, 0, 52);
    }

    public final boolean e() {
        return (kr1.n(this.a, "none") && kr1.n(this.b, "none") && kr1.n(this.d, "none")) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tt)) {
            return false;
        }
        tt ttVar = (tt) obj;
        return kr1.n(this.a, ttVar.a) && kr1.n(this.b, ttVar.b) && this.c == ttVar.c && kr1.n(this.d, ttVar.d) && kr1.n(this.e, ttVar.e) && this.f == ttVar.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + ud2.i(ud2.i(fq2.e(this.c, ud2.i(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbT = fq2.t("BgState(bg=", this.a, ", fx=", this.b, ", dim=");
        sbT.append(this.c);
        sbT.append(", pt=");
        sbT.append(this.d);
        sbT.append(", ps=");
        sbT.append(this.e);
        sbT.append(", po=");
        sbT.append(this.f);
        sbT.append(")");
        return sbT.toString();
    }
}
