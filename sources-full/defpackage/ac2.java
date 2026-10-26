package defpackage;

import java.nio.charset.Charset;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class ac2 {
    public static final Pattern d = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    public static final Pattern e = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");
    public final String a;
    public final String b;
    public final String[] c;

    public ac2(String str, String str2, String[] strArr) {
        this.a = str;
        this.b = str2;
        this.c = strArr;
    }

    public final Charset a(Charset charset) {
        String str;
        String[] strArr = this.c;
        int i = 0;
        int iB = gm4.B(0, strArr.length - 1, 2);
        if (iB < 0) {
            str = null;
            break;
        }
        while (true) {
            if (!to3.k0(strArr[i], "charset")) {
                if (i == iB) {
                    str = null;
                    break;
                }
                i += 2;
            } else {
                str = strArr[i + 1];
                break;
            }
        }
        if (str == null) {
            return charset;
        }
        try {
            return Charset.forName(str);
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ac2) && kr1.n(((ac2) obj).a, this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
