package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class po extends s72 {
    public final long a;
    public final long b;
    public final jo c;
    public final Integer d;
    public final String e;
    public final ArrayList f;

    public po(long j, long j2, jo joVar, Integer num, String str, ArrayList arrayList) {
        b23 b23Var = b23.c;
        this.a = j;
        this.b = j2;
        this.c = joVar;
        this.d = num;
        this.e = str;
        this.f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s72)) {
            return false;
        }
        po poVar = (po) ((s72) obj);
        if (this.a != poVar.a || this.b != poVar.b || !this.c.equals(poVar.c)) {
            return false;
        }
        Integer num = poVar.d;
        Integer num2 = this.d;
        if (num2 == null) {
            if (num != null) {
                return false;
            }
        } else if (!num2.equals(num)) {
            return false;
        }
        String str = poVar.e;
        String str2 = this.e;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (!this.f.equals(poVar.f)) {
            return false;
        }
        Object obj2 = b23.c;
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        int iHashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.c.hashCode()) * 1000003;
        Integer num = this.d;
        int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.e;
        return ((this.f.hashCode() ^ ((iHashCode2 ^ (str != null ? str.hashCode() : 0)) * 1000003)) * 1000003) ^ b23.c.hashCode();
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.a + ", requestUptimeMs=" + this.b + ", clientInfo=" + this.c + ", logSource=" + this.d + ", logSourceName=" + this.e + ", logEvents=" + this.f + ", qosTier=" + b23.c + "}";
    }
}
