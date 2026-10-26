package defpackage;

import kotlin.KotlinVersion;

/* JADX INFO: loaded from: classes.dex */
public final class re0 {
    public static final long b = gb2.d(4278190080L);
    public static final long c;
    public static final long d;
    public static final long e;
    public static final long f;
    public static final long g;
    public static final long h;
    public static final long i;
    public static final /* synthetic */ int j = 0;
    public final long a;

    static {
        gb2.d(4282664004L);
        c = gb2.d(4287137928L);
        d = gb2.d(4291611852L);
        e = gb2.d(4294967295L);
        f = gb2.d(4294901760L);
        gb2.d(4278255360L);
        g = gb2.d(4278190335L);
        gb2.d(4294967040L);
        gb2.d(4278255615L);
        gb2.d(4294902015L);
        h = gb2.b(0);
        float[] fArr = ef0.a;
        i = gb2.a(0.0f, 0.0f, 0.0f, 0.0f, ef0.u);
    }

    public /* synthetic */ re0(long j2) {
        this.a = j2;
    }

    public static final long a(long j2, bf0 bf0Var) {
        yl0 yl0VarT;
        bf0 bf0VarF = f(j2);
        int i2 = bf0VarF.c;
        int i3 = bf0Var.c;
        if ((i2 | i3) < 0) {
            yl0VarT = p23.t(bf0VarF, bf0Var);
        } else {
            dh2 dh2Var = zl0.a;
            int i4 = i2 | (i3 << 6);
            Object objB = dh2Var.b(i4);
            if (objB == null) {
                objB = p23.t(bf0VarF, bf0Var);
                dh2Var.h(i4, objB);
            }
            yl0VarT = (yl0) objB;
        }
        return yl0VarT.a(j2);
    }

    public static long b(float f2, long j2) {
        return gb2.a(h(j2), g(j2), e(j2), f2, f(j2));
    }

    public static final boolean c(long j2, long j3) {
        return j2 == j3;
    }

    public static final float d(long j2) {
        float fC0;
        float f2;
        if ((63 & j2) == 0) {
            fC0 = (float) xr0.C0((j2 >>> 56) & 255);
            f2 = 255.0f;
        } else {
            fC0 = (float) xr0.C0((j2 >>> 6) & 1023);
            f2 = 1023.0f;
        }
        return fC0 / f2;
    }

    public static final float e(long j2) {
        int i2;
        int i3;
        int i4;
        if ((63 & j2) == 0) {
            return ((float) xr0.C0((j2 >>> 32) & 255)) / 255.0f;
        }
        short s = (short) ((j2 >>> 16) & 65535);
        int i5 = Short.MIN_VALUE & s;
        int i6 = ((65535 & s) >>> 10) & 31;
        int i7 = s & 1023;
        if (i6 != 0) {
            int i8 = i7 << 13;
            if (i6 == 31) {
                i2 = KotlinVersion.MAX_COMPONENT_VALUE;
                if (i8 != 0) {
                    i8 |= 4194304;
                }
            } else {
                i2 = i6 + 112;
            }
            int i9 = i2;
            i3 = i8;
            i4 = i9;
        } else {
            if (i7 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i7 + 1056964608) - b81.a;
                return i5 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i4 = 0;
            i3 = 0;
        }
        return Float.intBitsToFloat((i4 << 23) | (i5 << 16) | i3);
    }

    public static final bf0 f(long j2) {
        float[] fArr = ef0.a;
        return ef0.y[(int) (j2 & 63)];
    }

    public static final float g(long j2) {
        int i2;
        int i3;
        int i4;
        if ((63 & j2) == 0) {
            return ((float) xr0.C0((j2 >>> 40) & 255)) / 255.0f;
        }
        short s = (short) ((j2 >>> 32) & 65535);
        int i5 = Short.MIN_VALUE & s;
        int i6 = ((65535 & s) >>> 10) & 31;
        int i7 = s & 1023;
        if (i6 != 0) {
            int i8 = i7 << 13;
            if (i6 == 31) {
                i2 = KotlinVersion.MAX_COMPONENT_VALUE;
                if (i8 != 0) {
                    i8 |= 4194304;
                }
            } else {
                i2 = i6 + 112;
            }
            int i9 = i2;
            i3 = i8;
            i4 = i9;
        } else {
            if (i7 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i7 + 1056964608) - b81.a;
                return i5 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i4 = 0;
            i3 = 0;
        }
        return Float.intBitsToFloat((i4 << 23) | (i5 << 16) | i3);
    }

    public static final float h(long j2) {
        int i2;
        int i3;
        int i4;
        if ((63 & j2) == 0) {
            return ((float) xr0.C0((j2 >>> 48) & 255)) / 255.0f;
        }
        short s = (short) ((j2 >>> 48) & 65535);
        int i5 = Short.MIN_VALUE & s;
        int i6 = ((65535 & s) >>> 10) & 31;
        int i7 = s & 1023;
        if (i6 != 0) {
            int i8 = i7 << 13;
            if (i6 == 31) {
                i2 = KotlinVersion.MAX_COMPONENT_VALUE;
                if (i8 != 0) {
                    i8 |= 4194304;
                }
            } else {
                i2 = i6 + 112;
            }
            int i9 = i2;
            i3 = i8;
            i4 = i9;
        } else {
            if (i7 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i7 + 1056964608) - b81.a;
                return i5 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i4 = 0;
            i3 = 0;
        }
        return Float.intBitsToFloat((i4 << 23) | (i5 << 16) | i3);
    }

    public static String i(long j2) {
        StringBuilder sb = new StringBuilder("Color(");
        sb.append(h(j2));
        sb.append(", ");
        sb.append(g(j2));
        sb.append(", ");
        sb.append(e(j2));
        sb.append(", ");
        sb.append(d(j2));
        sb.append(", ");
        return ud2.r(sb, f(j2).a, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof re0) {
            return this.a == ((re0) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return i(this.a);
    }
}
