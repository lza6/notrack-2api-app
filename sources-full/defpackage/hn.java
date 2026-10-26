package defpackage;

import kotlin.uuid.Uuid;

/* JADX INFO: loaded from: classes.dex */
public final class hn {
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final gn e;
    public final String f;
    public final String g;
    public final boolean h;

    public hn(String str, String str2, String str3, long j, gn gnVar, String str4, String str5, boolean z) {
        str3.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
        this.e = gnVar;
        this.f = str4;
        this.g = str5;
        this.h = z;
    }

    public /* synthetic */ hn(String str, String str2, String str3, long j, gn gnVar, String str4, boolean z, int i) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, str3, j, gnVar, (i & 32) != 0 ? null : str4, (String) null, (i & Uuid.SIZE_BITS) != 0 ? false : z);
    }

    public static hn a(hn hnVar, String str, gn gnVar, String str2, String str3, boolean z, int i) {
        if ((i & 1) != 0) {
            str = hnVar.a;
        }
        String str4 = str;
        String str5 = hnVar.b;
        String str6 = hnVar.c;
        long j = hnVar.d;
        String str7 = (i & 32) != 0 ? hnVar.f : str2;
        String str8 = (i & 64) != 0 ? hnVar.g : str3;
        boolean z2 = (i & Uuid.SIZE_BITS) != 0 ? hnVar.h : z;
        str6.getClass();
        return new hn(str4, str5, str6, j, gnVar, str7, str8, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hn)) {
            return false;
        }
        hn hnVar = (hn) obj;
        return kr1.n(this.a, hnVar.a) && kr1.n(this.b, hnVar.b) && kr1.n(this.c, hnVar.c) && this.d == hnVar.d && this.e == hnVar.e && kr1.n(this.f, hnVar.f) && kr1.n(this.g, hnVar.g) && this.h == hnVar.h;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (this.e.hashCode() + ud2.h(ud2.i((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.c), 31, this.d)) * 31;
        String str3 = this.f;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.g;
        return Boolean.hashCode(this.h) + ((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbT = fq2.t("AttachmentUiModel(id=", this.a, ", uri=", this.b, ", name=");
        sbT.append(this.c);
        sbT.append(", size=");
        sbT.append(this.d);
        sbT.append(", status=");
        sbT.append(this.e);
        sbT.append(", kind=");
        sbT.append(this.f);
        sbT.append(", error=");
        sbT.append(this.g);
        sbT.append(", isTruncated=");
        sbT.append(this.h);
        sbT.append(")");
        return sbT.toString();
    }
}
