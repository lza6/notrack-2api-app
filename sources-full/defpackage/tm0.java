package defpackage;

import android.net.NetworkRequest;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class tm0 {
    public static final tm0 j = new tm0();
    public final int a;
    public final dl2 b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final long g;
    public final long h;
    public final Set i;

    public tm0() {
        this.b = new dl2(null);
        this.a = 1;
        this.c = false;
        this.d = false;
        this.e = false;
        this.f = false;
        this.g = -1L;
        this.h = -1L;
        this.i = f31.c;
    }

    public tm0(dl2 dl2Var, int i, boolean z, boolean z2, boolean z3, boolean z4, long j2, long j3, Set set) {
        if (i == 0) {
            throw null;
        }
        this.b = dl2Var;
        this.a = i;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = j2;
        this.h = j3;
        this.i = set;
    }

    public tm0(tm0 tm0Var) {
        tm0Var.getClass();
        this.c = tm0Var.c;
        this.d = tm0Var.d;
        this.b = tm0Var.b;
        this.a = tm0Var.a;
        this.e = tm0Var.e;
        this.f = tm0Var.f;
        this.i = tm0Var.i;
        this.g = tm0Var.g;
        this.h = tm0Var.h;
    }

    public final NetworkRequest a() {
        return (NetworkRequest) this.b.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !tm0.class.equals(obj.getClass())) {
            return false;
        }
        tm0 tm0Var = (tm0) obj;
        if (this.c == tm0Var.c && this.d == tm0Var.d && this.e == tm0Var.e && this.f == tm0Var.f && this.g == tm0Var.g && this.h == tm0Var.h && kr1.n(a(), tm0Var.a()) && this.a == tm0Var.a) {
            return kr1.n(this.i, tm0Var.i);
        }
        return false;
    }

    public final int hashCode() {
        int iZ = ((((((((fq2.z(this.a) * 31) + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31;
        long j2 = this.g;
        int i = (iZ + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.h;
        int iHashCode = (this.i.hashCode() + ((i + ((int) (j3 ^ (j3 >>> 32)))) * 31)) * 31;
        NetworkRequest networkRequestA = a();
        return iHashCode + (networkRequestA != null ? networkRequestA.hashCode() : 0);
    }

    public final String toString() {
        return "Constraints{requiredNetworkType=" + ud2.y(this.a) + ", requiresCharging=" + this.c + ", requiresDeviceIdle=" + this.d + ", requiresBatteryNotLow=" + this.e + ", requiresStorageNotLow=" + this.f + ", contentTriggerUpdateDelayMillis=" + this.g + ", contentTriggerMaxDelayMillis=" + this.h + ", contentUriTriggers=" + this.i + ", }";
    }
}
