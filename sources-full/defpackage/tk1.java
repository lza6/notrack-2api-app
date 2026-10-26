package defpackage;

import app.template.extension.BuildConfig;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import okhttp3.Headers$Companion;

/* JADX INFO: loaded from: classes.dex */
public final class tk1 {
    public static final char[] j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final List f;
    public final String g;
    public final String h;
    public final boolean i;

    public tk1(String str, String str2, String str3, String str4, int i, ArrayList arrayList, ArrayList arrayList2, String str5, String str6) {
        str.getClass();
        str4.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
        this.f = arrayList2;
        this.g = str5;
        this.h = str6;
        this.i = str.equals("https");
    }

    public final String a() {
        if (this.c.length() == 0) {
            return BuildConfig.VERSION_NAME;
        }
        int length = this.a.length() + 3;
        String str = this.h;
        return str.substring(mo3.z0(':', length, 4, str) + 1, mo3.z0('@', 0, 6, str));
    }

    public final String b() {
        int length = this.a.length() + 3;
        String str = this.h;
        int iZ0 = mo3.z0('/', length, 4, str);
        return str.substring(iZ0, ka4.f(iZ0, str.length(), str, "?#"));
    }

    public final ArrayList c() {
        int length = this.a.length() + 3;
        String str = this.h;
        int iZ0 = mo3.z0('/', length, 4, str);
        int iF = ka4.f(iZ0, str.length(), str, "?#");
        ArrayList arrayList = new ArrayList();
        while (iZ0 < iF) {
            int i = iZ0 + 1;
            int iG = ka4.g(str, '/', i, iF);
            arrayList.add(str.substring(i, iG));
            iZ0 = iG;
        }
        return arrayList;
    }

    public final String d() {
        if (this.f == null) {
            return null;
        }
        String str = this.h;
        int iZ0 = mo3.z0('?', 0, 6, str) + 1;
        return str.substring(iZ0, ka4.g(str, '#', iZ0, str.length()));
    }

    public final String e() {
        if (this.b.length() == 0) {
            return BuildConfig.VERSION_NAME;
        }
        int length = this.a.length() + 3;
        String str = this.h;
        return str.substring(length, ka4.f(length, str.length(), str, ":@"));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof tk1) && ((tk1) obj).h.equals(this.h);
    }

    public final String f() {
        sk1 sk1Var;
        try {
            sk1Var = new sk1();
            sk1Var.c(this, "/...");
        } catch (IllegalArgumentException unused) {
            sk1Var = null;
        }
        sk1Var.getClass();
        sk1Var.b = Headers$Companion.canonicalize$okhttp$default(BuildConfig.VERSION_NAME, 0, 0, " \"':;<=>@[]^`{}|/\\?#", 251);
        sk1Var.c = Headers$Companion.canonicalize$okhttp$default(BuildConfig.VERSION_NAME, 0, 0, " \"':;<=>@[]^`{}|/\\?#", 251);
        return sk1Var.a().h;
    }

    public final URI g() {
        String strSubstring;
        String strReplaceAll;
        sk1 sk1Var = new sk1();
        String str = this.a;
        sk1Var.a = str;
        sk1Var.b = e();
        sk1Var.c = a();
        sk1Var.d = this.d;
        str.getClass();
        int i = str.equals("http") ? 80 : str.equals("https") ? 443 : -1;
        int i2 = this.e;
        sk1Var.e = i2 != i ? i2 : -1;
        ArrayList arrayList = sk1Var.f;
        arrayList.clear();
        arrayList.addAll(c());
        String strD = d();
        sk1Var.g = strD != null ? Headers$Companion.toQueryNamesAndValues$okhttp(Headers$Companion.canonicalize$okhttp$default(strD, 0, 0, " \"'<>#", 211)) : null;
        if (this.g == null) {
            strSubstring = null;
        } else {
            String str2 = this.h;
            strSubstring = str2.substring(mo3.z0('#', 0, 6, str2) + 1);
        }
        sk1Var.h = strSubstring;
        String str3 = sk1Var.d;
        if (str3 != null) {
            Pattern patternCompile = Pattern.compile("[\"<>^`{|}]");
            patternCompile.getClass();
            strReplaceAll = patternCompile.matcher(str3).replaceAll(BuildConfig.VERSION_NAME);
            strReplaceAll.getClass();
        } else {
            strReplaceAll = null;
        }
        sk1Var.d = strReplaceAll;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.set(i3, Headers$Companion.canonicalize$okhttp$default((String) arrayList.get(i3), 0, 0, "[]", 227));
        }
        ArrayList arrayList2 = sk1Var.g;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i4 = 0; i4 < size2; i4++) {
                String str4 = (String) arrayList2.get(i4);
                arrayList2.set(i4, str4 != null ? Headers$Companion.canonicalize$okhttp$default(str4, 0, 0, "\\^`{|}", 195) : null);
            }
        }
        String str5 = sk1Var.h;
        sk1Var.h = str5 != null ? Headers$Companion.canonicalize$okhttp$default(str5, 0, 0, " \"#<>\\^`{|}", 163) : null;
        String string = sk1Var.toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e) {
            try {
                Pattern patternCompile2 = Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]");
                patternCompile2.getClass();
                String strReplaceAll2 = patternCompile2.matcher(string).replaceAll(BuildConfig.VERSION_NAME);
                strReplaceAll2.getClass();
                URI uriCreate = URI.create(strReplaceAll2);
                uriCreate.getClass();
                return uriCreate;
            } catch (Exception unused) {
                m51.n(e);
                return null;
            }
        }
    }

    public final int hashCode() {
        return this.h.hashCode();
    }

    public final String toString() {
        return this.h;
    }
}
