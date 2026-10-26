package defpackage;

import java.util.List;
import kotlin.uuid.Uuid;
import org.scilab.forge.jlatexmath.FontInfo;

/* JADX INFO: loaded from: classes.dex */
public final class yd2 {
    public final String a;
    public final String b;
    public final mm3 c;
    public final xd2 d;
    public final boolean e;
    public final List f;
    public final String g;
    public final boolean h;
    public final String i;

    public /* synthetic */ yd2(String str, String str2, mm3 mm3Var, xd2 xd2Var, List list, boolean z, String str3, int i) {
        this(str, str2, mm3Var, xd2Var, (i & 16) == 0, (i & 32) != 0 ? z21.c : list, null, (i & Uuid.SIZE_BITS) != 0 ? false : z, (i & FontInfo.NUMBER_OF_CHAR_CODES) != 0 ? null : str3);
    }

    public yd2(String str, String str2, mm3 mm3Var, xd2 xd2Var, boolean z, List list, String str3, boolean z2, String str4) {
        str2.getClass();
        list.getClass();
        this.a = str;
        this.b = str2;
        this.c = mm3Var;
        this.d = xd2Var;
        this.e = z;
        this.f = list;
        this.g = str3;
        this.h = z2;
        this.i = str4;
    }

    public static yd2 a(yd2 yd2Var, String str, String str2, String str3, int i) {
        String str4 = yd2Var.a;
        if ((i & 2) != 0) {
            str = yd2Var.b;
        }
        String str5 = str;
        mm3 mm3Var = yd2Var.c;
        xd2 xd2Var = yd2Var.d;
        boolean z = (i & 16) != 0 ? yd2Var.e : false;
        List list = yd2Var.f;
        if ((i & 64) != 0) {
            str2 = yd2Var.g;
        }
        String str6 = str2;
        boolean z2 = yd2Var.h;
        if ((i & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
            str3 = yd2Var.i;
        }
        yd2Var.getClass();
        str4.getClass();
        str5.getClass();
        mm3Var.getClass();
        xd2Var.getClass();
        list.getClass();
        return new yd2(str4, str5, mm3Var, xd2Var, z, list, str6, z2, str3);
    }

    public final mm3 b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yd2)) {
            return false;
        }
        yd2 yd2Var = (yd2) obj;
        return kr1.n(this.a, yd2Var.a) && kr1.n(this.b, yd2Var.b) && this.c == yd2Var.c && this.d == yd2Var.d && this.e == yd2Var.e && kr1.n(this.f, yd2Var.f) && kr1.n(this.g, yd2Var.g) && this.h == yd2Var.h && kr1.n(this.i, yd2Var.i);
    }

    public final int hashCode() {
        int iJ = ud2.j(ud2.k((this.d.hashCode() + ((this.c.hashCode() + ud2.i(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31, 31, this.e), 31, this.f);
        String str = this.g;
        int iK = ud2.k((iJ + (str == null ? 0 : str.hashCode())) * 31, 31, this.h);
        String str2 = this.i;
        return iK + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbT = fq2.t("MessageUiModel(id=", this.a, ", content=", this.b, ", speaker=");
        sbT.append(this.c);
        sbT.append(", type=");
        sbT.append(this.d);
        sbT.append(", isThinking=");
        sbT.append(this.e);
        sbT.append(", attachments=");
        sbT.append(this.f);
        sbT.append(", displayOverride=");
        sbT.append(this.g);
        sbT.append(", cutOff=");
        sbT.append(this.h);
        sbT.append(", serverId=");
        return fq2.r(sbT, this.i, ")");
    }
}
