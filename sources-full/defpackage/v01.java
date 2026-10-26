package defpackage;

import kotlin.jvm.internal.LongCompanionObject;
import kotlin.time.DurationKt;

/* JADX INFO: loaded from: classes.dex */
public final class v01 implements Comparable {
    public static final long d;
    public static final long h;
    public static final /* synthetic */ int l = 0;
    public final long c;

    static {
        int i = x01.a;
        d = gb2.y(DurationKt.MAX_MILLIS);
        h = gb2.y(-4611686018427387903L);
    }

    public static final long a(long j, long j2) {
        long j3 = j2 / 1000000;
        long j4 = j + j3;
        if (-4611686018426L > j4 || j4 >= 4611686018427L) {
            return gb2.y(py.y(j4, -4611686018427387903L, DurationKt.MAX_MILLIS));
        }
        return gb2.A((j4 * 1000000) + (j2 - (j3 * 1000000)));
    }

    public static final void b(StringBuilder sb, int i, int i2, int i3, String str, boolean z) {
        sb.append(i);
        if (i2 != 0) {
            sb.append('.');
            String strH0 = mo3.H0(i3, String.valueOf(i2));
            int i4 = -1;
            int length = strH0.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i5 = length - 1;
                    if (strH0.charAt(length) != '0') {
                        i4 = length;
                        break;
                    } else if (i5 < 0) {
                        break;
                    } else {
                        length = i5;
                    }
                }
            }
            int i6 = i4 + 1;
            if (z || i6 >= 3) {
                sb.append((CharSequence) strH0, 0, ((i4 + 3) / 3) * 3);
            } else {
                sb.append((CharSequence) strH0, 0, i6);
            }
        }
        sb.append(str);
    }

    public static final int c(long j) {
        if (d(j)) {
            return 0;
        }
        return (int) ((((int) j) & 1) == 1 ? ((j >> 1) % 1000) * 1000000 : (j >> 1) % 1000000000);
    }

    public static final boolean d(long j) {
        return j == d || j == h;
    }

    public static final long e(long j, long j2) {
        if (d(j)) {
            if (!d(j2) || (j2 ^ j) >= 0) {
                return j;
            }
            u41.k("Summing infinite durations of different signs yields an undefined result.");
            return 0L;
        }
        if (d(j2)) {
            return j2;
        }
        int i = ((int) j) & 1;
        if (i != (((int) j2) & 1)) {
            return i == 1 ? a(j >> 1, j2 >> 1) : a(j2 >> 1, j >> 1);
        }
        long j3 = (j >> 1) + (j2 >> 1);
        if (i == 0) {
            return (-4611686018426999999L > j3 || j3 >= 4611686018427000000L) ? gb2.y(j3 / 1000000) : gb2.A(j3);
        }
        return gb2.z(j3);
    }

    public static final long f(long j, z01 z01Var) {
        if (j == d) {
            return LongCompanionObject.MAX_VALUE;
        }
        if (j == h) {
            return Long.MIN_VALUE;
        }
        return z01Var.c.convert(j >> 1, ((((int) j) & 1) == 0 ? z01.NANOSECONDS : z01.MILLISECONDS).c);
    }

    public static final long g(long j) {
        long j2 = ((-(j >> 1)) << 1) + ((long) (((int) j) & 1));
        int i = x01.a;
        return j2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = ((v01) obj).c;
        long j2 = this.c;
        long j3 = j2 ^ j;
        if (j3 >= 0 && (((int) j3) & 1) != 0) {
            int i = (((int) j2) & 1) - (((int) j) & 1);
            return j2 < 0 ? -i : i;
        }
        if (j2 < j) {
            return -1;
        }
        return j2 == j ? 0 : 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof v01) {
            return this.c == ((v01) obj).c;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.c);
    }

    public final String toString() {
        long jG = this.c;
        if (jG == 0) {
            return "0s";
        }
        if (jG == d) {
            return "Infinity";
        }
        if (jG == h) {
            return "-Infinity";
        }
        int i = 0;
        boolean z = jG < 0;
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append('-');
        }
        if (jG < 0) {
            jG = g(jG);
        }
        long jF = f(jG, z01.DAYS);
        int iF = d(jG) ? 0 : (int) (f(jG, z01.HOURS) % 24);
        int iF2 = d(jG) ? 0 : (int) (f(jG, z01.MINUTES) % 60);
        int iF3 = d(jG) ? 0 : (int) (f(jG, z01.SECONDS) % 60);
        int iC = c(jG);
        boolean z2 = jF != 0;
        boolean z3 = iF != 0;
        boolean z4 = iF2 != 0;
        boolean z5 = (iF3 == 0 && iC == 0) ? false : true;
        if (z2) {
            sb.append(jF);
            sb.append('d');
            i = 1;
        }
        if (z3 || (z2 && (z4 || z5))) {
            int i2 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(iF);
            sb.append('h');
            i = i2;
        }
        if (z4 || (z5 && (z3 || z2))) {
            int i3 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(iF2);
            sb.append('m');
            i = i3;
        }
        if (z5) {
            int i4 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            if (iF3 != 0 || z2 || z3 || z4) {
                b(sb, iF3, iC, 9, "s", false);
            } else if (iC >= 1000000) {
                b(sb, iC / DurationKt.NANOS_IN_MILLIS, iC % DurationKt.NANOS_IN_MILLIS, 6, "ms", false);
            } else if (iC >= 1000) {
                b(sb, iC / 1000, iC % 1000, 3, "us", false);
            } else {
                sb.append(iC);
                sb.append("ns");
            }
            i = i4;
        }
        if (z && i > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }
}
