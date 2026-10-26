package defpackage;

import app.template.extension.BuildConfig;
import java.io.IOException;
import java.io.StringReader;
import java.util.Arrays;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.CharCompanionObject;
import kotlin.uuid.Uuid;

/* JADX INFO: loaded from: classes.dex */
public final class p30 {
    public final char[] a;
    public final StringReader b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public final String[] h;

    public p30(String str) {
        StringReader stringReader = new StringReader(str);
        str.getClass();
        this.h = new String[Uuid.SIZE_BITS];
        if (!stringReader.markSupported()) {
            u41.k("Must be true");
            throw null;
        }
        this.b = stringReader;
        this.a = new char[ConstantsKt.DEFAULT_BLOCK_SIZE];
        b();
    }

    public static String c(char[] cArr, String[] strArr, int i, int i2) {
        if (i2 > 12) {
            return new String(cArr, i, i2);
        }
        if (i2 < 1) {
            return BuildConfig.VERSION_NAME;
        }
        int i3 = 0;
        int i4 = i;
        int i5 = 0;
        int i6 = 0;
        while (i5 < i2) {
            i6 = (i6 * 31) + cArr[i4];
            i5++;
            i4++;
        }
        int length = i6 & (strArr.length - 1);
        String str = strArr[length];
        if (str == null) {
            String str2 = new String(cArr, i, i2);
            strArr[length] = str2;
            return str2;
        }
        if (i2 == str.length()) {
            int i7 = i;
            int i8 = i2;
            while (true) {
                int i9 = i8 - 1;
                if (i8 == 0) {
                    return str;
                }
                int i10 = i7 + 1;
                int i11 = i3 + 1;
                if (cArr[i7] == str.charAt(i3)) {
                    i7 = i10;
                    i8 = i9;
                    i3 = i11;
                }
            }
        }
        String str3 = new String(cArr, i, i2);
        strArr[length] = str3;
        return str3;
    }

    public final void a() {
        this.e++;
    }

    public final void b() {
        StringReader stringReader = this.b;
        int i = this.e;
        if (i < this.d) {
            return;
        }
        try {
            stringReader.skip(i);
            stringReader.mark(ConstantsKt.DEFAULT_BLOCK_SIZE);
            int i2 = stringReader.read(this.a);
            stringReader.reset();
            if (i2 != -1) {
                this.c = i2;
                this.f += this.e;
                this.e = 0;
                this.g = 0;
                if (i2 > 3072) {
                    i2 = 3072;
                }
                this.d = i2;
            }
        } catch (IOException e) {
            throw new eg0(e);
        }
    }

    public final char d() {
        b();
        int i = this.e;
        char c = i >= this.c ? CharCompanionObject.MAX_VALUE : this.a[i];
        this.e = i + 1;
        return c;
    }

    public final String e() {
        char[] cArr;
        char c;
        b();
        int i = this.e;
        while (true) {
            int i2 = this.e;
            int i3 = this.c;
            cArr = this.a;
            if (i2 >= i3 || (((c = cArr[i2]) < 'A' || c > 'Z') && ((c < 'a' || c > 'z') && !Character.isLetter(c)))) {
                break;
            }
            this.e++;
        }
        return c(cArr, this.h, i, this.e - i);
    }

    public final String f(char c) {
        char[] cArr;
        int i;
        b();
        int i2 = this.e;
        while (true) {
            int i3 = this.c;
            cArr = this.a;
            if (i2 >= i3) {
                i = -1;
                break;
            }
            if (c == cArr[i2]) {
                i = i2 - this.e;
                break;
            }
            i2++;
        }
        String[] strArr = this.h;
        if (i != -1) {
            String strC = c(cArr, strArr, this.e, i);
            this.e += i;
            return strC;
        }
        b();
        int i4 = this.e;
        String strC2 = c(cArr, strArr, i4, this.c - i4);
        this.e = this.c;
        return strC2;
    }

    public final String g(char... cArr) {
        char[] cArr2;
        b();
        int i = this.e;
        int i2 = this.c;
        loop0: while (true) {
            int i3 = this.e;
            cArr2 = this.a;
            if (i3 >= i2) {
                break;
            }
            for (char c : cArr) {
                if (cArr2[this.e] == c) {
                    break loop0;
                }
            }
            this.e++;
        }
        int i4 = this.e;
        return i4 > i ? c(cArr2, this.h, i, i4 - i) : BuildConfig.VERSION_NAME;
    }

    public final String h(char... cArr) {
        char[] cArr2;
        b();
        int i = this.e;
        int i2 = this.c;
        while (true) {
            int i3 = this.e;
            cArr2 = this.a;
            if (i3 >= i2 || Arrays.binarySearch(cArr, cArr2[i3]) >= 0) {
                break;
            }
            this.e++;
        }
        int i4 = this.e;
        return i4 > i ? c(cArr2, this.h, i, i4 - i) : BuildConfig.VERSION_NAME;
    }

    public final char i() {
        b();
        int i = this.e;
        return i >= this.c ? CharCompanionObject.MAX_VALUE : this.a[i];
    }

    public final boolean j() {
        b();
        return this.e >= this.c;
    }

    public final boolean k(String str) {
        b();
        b();
        int length = str.length();
        if (length <= this.c - this.e) {
            for (int i = 0; i < length; i++) {
                if (str.charAt(i) == this.a[this.e + i]) {
                }
            }
            this.e = str.length() + this.e;
            return true;
        }
        return false;
    }

    public final boolean l(String str) {
        b();
        int length = str.length();
        if (length <= this.c - this.e) {
            for (int i = 0; i < length; i++) {
                if (Character.toUpperCase(str.charAt(i)) == Character.toUpperCase(this.a[this.e + i])) {
                }
            }
            this.e = str.length() + this.e;
            return true;
        }
        return false;
    }

    public final boolean m(char c) {
        return !j() && this.a[this.e] == c;
    }

    public final boolean n(char... cArr) {
        if (!j()) {
            b();
            char c = this.a[this.e];
            for (char c2 : cArr) {
                if (c2 == c) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean o() {
        if (j()) {
            return false;
        }
        char c = this.a[this.e];
        if (c < 'A' || c > 'Z') {
            return (c >= 'a' && c <= 'z') || Character.isLetter(c);
        }
        return true;
    }

    public final int p(String str) {
        b();
        char cCharAt = str.charAt(0);
        int i = this.e;
        while (i < this.c) {
            char[] cArr = this.a;
            if (cCharAt != cArr[i]) {
                do {
                    i++;
                    if (i >= this.c) {
                        break;
                    }
                } while (cCharAt != cArr[i]);
            }
            int i2 = i + 1;
            int length = (str.length() + i2) - 1;
            int i3 = this.c;
            if (i < i3 && length <= i3) {
                int i4 = i2;
                for (int i5 = 1; i4 < length && str.charAt(i5) == cArr[i4]; i5++) {
                    i4++;
                }
                if (i4 == length) {
                    return i - this.e;
                }
            }
            i = i2;
        }
        return -1;
    }

    public final void q() {
        this.e--;
    }

    public final String toString() {
        int i = this.e;
        return new String(this.a, i, this.c - i);
    }
}
