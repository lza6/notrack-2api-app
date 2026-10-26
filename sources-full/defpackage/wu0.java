package defpackage;

import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public interface wu0 {
    default int C(long j) {
        return Math.round(f0(j));
    }

    default float E(long j) {
        if (!zz3.a(yz3.b(j), 4294967296L)) {
            ro1.b("Only Sp can convert to Px");
        }
        float[] fArr = ec1.a;
        if (l() < 1.03f) {
            return l() * yz3.c(j);
        }
        dc1 dc1VarA = ec1.a(l());
        if (dc1VarA != null) {
            return dc1VarA.b(yz3.c(j));
        }
        return l() * yz3.c(j);
    }

    default int O(float f) {
        float fW = w(f);
        return Float.isInfinite(fW) ? IntCompanionObject.MAX_VALUE : Math.round(fW);
    }

    default long c0(long j) {
        if (j == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        float fW = w(ux0.b(j));
        float fW2 = w(ux0.a(j));
        return (((long) Float.floatToRawIntBits(fW)) << 32) | (((long) Float.floatToRawIntBits(fW2)) & 4294967295L);
    }

    default float f0(long j) {
        if (!zz3.a(yz3.b(j), 4294967296L)) {
            ro1.b("Only Sp can convert to Px");
        }
        return w(E(j));
    }

    float getDensity();

    default long k0(float f) {
        return t(r0(f));
    }

    float l();

    default float q0(int i) {
        return i / getDensity();
    }

    default float r0(float f) {
        return f / getDensity();
    }

    default long t(float f) {
        float[] fArr = ec1.a;
        if (l() < 1.03f) {
            return gm4.L(f / l(), 4294967296L);
        }
        dc1 dc1VarA = ec1.a(l());
        return gm4.L(dc1VarA != null ? dc1VarA.a(f) : f / l(), 4294967296L);
    }

    default long u(long j) {
        if (j != 9205357640488583168L) {
            return xr0.F(r0(Float.intBitsToFloat((int) (j >> 32))), r0(Float.intBitsToFloat((int) (j & 4294967295L))));
        }
        return 9205357640488583168L;
    }

    default float w(float f) {
        return getDensity() * f;
    }
}
