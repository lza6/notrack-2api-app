package defpackage;

import android.view.View;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes.dex */
public abstract class vd4 {
    public static final u93 a(View view) {
        view.getClass();
        return (u93) rf3.Y(rf3.a0(rf3.Z(view, lb4.t), lb4.u));
    }

    public static void b(int i, int i2) {
        String strB;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strB = wd4.b("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    u41.k(ud2.m(i2, "negative size: "));
                    return;
                }
                strB = wd4.b("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strB);
        }
    }

    public static int c(String str) {
        int length = str.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && str.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (i2 < length) {
            char cCharAt = str.charAt(i2);
            if (cCharAt >= 2048) {
                try {
                    int i4 = yq4.a;
                    int length2 = str.length();
                    while (i2 < length2) {
                        char cCharAt2 = str.charAt(i2);
                        if (cCharAt2 < 2048) {
                            i += (127 - cCharAt2) >>> 31;
                        } else {
                            i += 2;
                            if (cCharAt2 >= 55296 && cCharAt2 <= 57343) {
                                if (Character.codePointAt(str, i2) < 65536) {
                                    throw new xq4("Unpaired surrogate at index " + i2 + " of " + length2);
                                }
                                i2++;
                            }
                        }
                        i2++;
                    }
                    i3 += i;
                    break;
                } catch (xq4 unused) {
                    return str.getBytes(StandardCharsets.UTF_8).length;
                }
            }
            i3 += (127 - cCharAt) >>> 31;
            i2++;
        }
        if (i3 >= length) {
            return i3;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) i3) + 4294967296L));
    }

    public static void d(int i, int i2) {
        if (i < 0 || i > i2) {
            m51.s(f(i, i2, "index"));
        }
    }

    public static void e(int i, int i2, int i3) {
        String strF;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                strF = f(i, i3, "start index");
            } else {
                strF = (i2 < 0 || i2 > i3) ? f(i2, i3, "end index") : wd4.b("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(strF);
        }
    }

    public static String f(int i, int i2, String str) {
        if (i < 0) {
            return wd4.b("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return wd4.b("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        u41.k(ud2.m(i2, "negative size: "));
        return null;
    }
}
