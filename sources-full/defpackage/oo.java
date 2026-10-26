package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class oo extends p72 {
    public final long a;
    public final Integer b;
    public final long c;
    public final byte[] d;
    public final String e;
    public final long f;
    public final rk2 g;

    public oo(long j, Integer num, long j2, byte[] bArr, String str, long j3, rk2 rk2Var) {
        this.a = j;
        this.b = num;
        this.c = j2;
        this.d = bArr;
        this.e = str;
        this.f = j3;
        this.g = rk2Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p72) {
            p72 p72Var = (p72) obj;
            oo ooVar = (oo) p72Var;
            if (this.a == ooVar.a) {
                Integer num = ooVar.b;
                Integer num2 = this.b;
                if (num2 != null ? num2.equals(num) : num == null) {
                    if (this.c == ooVar.c) {
                        if (Arrays.equals(this.d, p72Var instanceof oo ? ((oo) p72Var).d : ooVar.d)) {
                            String str = ooVar.e;
                            String str2 = this.e;
                            if (str2 != null ? str2.equals(str) : str == null) {
                                if (this.f == ooVar.f) {
                                    rk2 rk2Var = ooVar.g;
                                    rk2 rk2Var2 = this.g;
                                    if (rk2Var2 != null ? rk2Var2.equals(rk2Var) : rk2Var == null) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.b;
        int iHashCode = (i ^ (num == null ? 0 : num.hashCode())) * 1000003;
        long j2 = this.c;
        int iHashCode2 = (((iHashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.d)) * 1000003;
        String str = this.e;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j3 = this.f;
        int i2 = (iHashCode3 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        rk2 rk2Var = this.g;
        return i2 ^ (rk2Var != null ? rk2Var.hashCode() : 0);
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.a + ", eventCode=" + this.b + ", eventUptimeMs=" + this.c + ", sourceExtension=" + Arrays.toString(this.d) + ", sourceExtensionJsonProto3=" + this.e + ", timezoneOffsetSeconds=" + this.f + ", networkConnectionInfo=" + this.g + "}";
    }
}
