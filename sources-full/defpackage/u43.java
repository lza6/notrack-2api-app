package defpackage;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.Headers$Companion;

/* JADX INFO: loaded from: classes.dex */
public final class u43 implements Serializable {
    public final Pattern c;

    public u43(String str) {
        str.getClass();
        Pattern patternCompile = Pattern.compile(str);
        patternCompile.getClass();
        this.c = patternCompile;
    }

    public u43(String str, v43 v43Var) {
        Pattern patternCompile = Pattern.compile(str, Headers$Companion.access$ensureUnicodeCase(v43Var.c));
        patternCompile.getClass();
        this.c = patternCompile;
    }

    public static su0 b(u43 u43Var, String str) {
        u43Var.getClass();
        str.getClass();
        if (str.length() >= 0) {
            return new su0(new ye(u43Var, 23, str), t43.c, 1);
        }
        m51.h(str.length(), ud2.s("Start index out of bounds: ", ", input length: ", 0));
        return null;
    }

    public final boolean a(String str) {
        str.getClass();
        return this.c.matcher(str).find();
    }

    public final boolean c(CharSequence charSequence) {
        charSequence.getClass();
        return this.c.matcher(charSequence).matches();
    }

    public final String d(String str, le1 le1Var) {
        str.getClass();
        Matcher matcher = this.c.matcher(str);
        matcher.getClass();
        int i = 0;
        za2 za2VarD = kr1.d(matcher, 0, str);
        if (za2VarD == null) {
            return str.toString();
        }
        int length = str.length();
        StringBuilder sb = new StringBuilder(length);
        do {
            sb.append((CharSequence) str, i, za2VarD.b().c);
            sb.append((CharSequence) le1Var.invoke(za2VarD));
            i = za2VarD.b().d + 1;
            za2VarD = za2VarD.d();
            if (i >= length) {
                break;
            }
        } while (za2VarD != null);
        if (i < length) {
            sb.append((CharSequence) str, i, length);
        }
        return sb.toString();
    }

    public final String toString() {
        String string = this.c.toString();
        string.getClass();
        return string;
    }
}
