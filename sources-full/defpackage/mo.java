package defpackage;

import app.template.extension.BuildConfig;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class mo {
    public final String a;
    public final Integer b;
    public final g31 c;
    public final long d;
    public final long e;
    public final Map f;

    public mo(String str, Integer num, g31 g31Var, long j, long j2, HashMap map) {
        this.a = str;
        this.b = num;
        this.c = g31Var;
        this.d = j;
        this.e = j2;
        this.f = map;
    }

    public final String a(String str) {
        String str2 = (String) this.f.get(str);
        return str2 == null ? BuildConfig.VERSION_NAME : str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final f13 c() {
        f13 f13Var = new f13();
        String str = this.a;
        if (str == null) {
            m51.x("Null transportName");
            return null;
        }
        f13Var.a = str;
        f13Var.f = this.b;
        g31 g31Var = this.c;
        if (g31Var == null) {
            m51.x("Null encodedPayload");
            return null;
        }
        f13Var.b = g31Var;
        f13Var.c = Long.valueOf(this.d);
        f13Var.d = Long.valueOf(this.e);
        f13Var.e = new HashMap(this.f);
        return f13Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mo) {
            mo moVar = (mo) obj;
            if (this.a.equals(moVar.a)) {
                Integer num = moVar.b;
                Integer num2 = this.b;
                if (num2 != null ? num2.equals(num) : num == null) {
                    if (this.c.equals(moVar.c) && this.d == moVar.d && this.e == moVar.e && this.f.equals(moVar.f)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.b;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.c.hashCode()) * 1000003;
        long j = this.d;
        int i = (iHashCode2 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.e;
        return this.f.hashCode() ^ ((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003);
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.a + ", code=" + this.b + ", encodedPayload=" + this.c + ", eventMillis=" + this.d + ", uptimeMillis=" + this.e + ", autoMetadata=" + this.f + "}";
    }
}
