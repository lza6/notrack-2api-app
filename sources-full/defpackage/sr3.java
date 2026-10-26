package defpackage;

import java.util.Locale;
import okio.Options$Companion;

/* JADX INFO: loaded from: classes.dex */
public final class sr3 {
    public final String a;
    public final String b;
    public final boolean c;
    public final int d;
    public final String e;
    public final int f;
    public final int g;

    public sr3(int i, int i2, String str, String str2, String str3, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = i;
        this.e = str3;
        this.f = i2;
        Locale locale = Locale.US;
        locale.getClass();
        String upperCase = str2.toUpperCase(locale);
        upperCase.getClass();
        this.g = mo3.u0(upperCase, "INT", false) ? 3 : (mo3.u0(upperCase, "CHAR", false) || mo3.u0(upperCase, "CLOB", false) || mo3.u0(upperCase, "TEXT", false)) ? 2 : mo3.u0(upperCase, "BLOB", false) ? 5 : (mo3.u0(upperCase, "REAL", false) || mo3.u0(upperCase, "FLOA", false) || mo3.u0(upperCase, "DOUB", false)) ? 4 : 1;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof sr3)) {
                return false;
            }
            sr3 sr3Var = (sr3) obj;
            String str = sr3Var.e;
            int i = sr3Var.f;
            if (this.d != sr3Var.d || !this.a.equals(sr3Var.a) || this.c != sr3Var.c) {
                return false;
            }
            String str2 = this.e;
            int i2 = this.f;
            if (i2 == 1 && i == 2 && str2 != null && !Options$Companion.defaultValueEquals(str2, str)) {
                return false;
            }
            if (i2 == 2 && i == 1 && str != null && !Options$Companion.defaultValueEquals(str, str2)) {
                return false;
            }
            if (i2 != 0 && i2 == i) {
                if (str2 != null) {
                    if (!Options$Companion.defaultValueEquals(str2, str)) {
                        return false;
                    }
                } else if (str != null) {
                    return false;
                }
            }
            if (this.g != sr3Var.g) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.g) * 31) + (this.c ? 1231 : 1237)) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Column{name='");
        sb.append(this.a);
        sb.append("', type='");
        sb.append(this.b);
        sb.append("', affinity='");
        sb.append(this.g);
        sb.append("', notNull=");
        sb.append(this.c);
        sb.append(", primaryKeyPosition=");
        sb.append(this.d);
        sb.append(", defaultValue='");
        String str = this.e;
        if (str == null) {
            str = "undefined";
        }
        return fq2.r(sb, str, "'}");
    }
}
