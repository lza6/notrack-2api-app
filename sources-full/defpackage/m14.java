package defpackage;

import app.template.extension.BuildConfig;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class m14 extends n14 {
    public String b;
    public String c;
    public String d;
    public final StringBuilder e;
    public String f;
    public boolean g;
    public boolean h;
    public boolean i;
    public kn j;

    public m14(int i) {
        super(i);
        this.e = new StringBuilder();
        this.g = false;
        this.h = false;
        this.i = false;
    }

    public final void c(char c) {
        String strValueOf = String.valueOf(c);
        String str = this.d;
        if (str != null) {
            strValueOf = str.concat(strValueOf);
        }
        this.d = strValueOf;
    }

    public final void d(char c) {
        this.h = true;
        String str = this.f;
        StringBuilder sb = this.e;
        if (str != null) {
            sb.append(str);
            this.f = null;
        }
        sb.append(c);
    }

    public final void e(String str) {
        this.h = true;
        String str2 = this.f;
        StringBuilder sb = this.e;
        if (str2 != null) {
            sb.append(str2);
            this.f = null;
        }
        if (sb.length() == 0) {
            this.f = str;
        } else {
            sb.append(str);
        }
    }

    public final void f(int[] iArr) {
        this.h = true;
        String str = this.f;
        StringBuilder sb = this.e;
        if (str != null) {
            sb.append(str);
            this.f = null;
        }
        for (int i : iArr) {
            sb.appendCodePoint(i);
        }
    }

    public final void g(String str) {
        String str2 = this.b;
        if (str2 != null) {
            str = str2.concat(str);
        }
        this.b = str;
        this.c = str != null ? str.toLowerCase(Locale.ENGLISH) : BuildConfig.VERSION_NAME;
    }

    public final String h() {
        String str = this.b;
        if (str != null && str.length() != 0) {
            return this.b;
        }
        u41.k("Must be false");
        return null;
    }

    public final void i() {
        String string;
        if (this.j == null) {
            this.j = new kn();
        }
        String str = this.d;
        StringBuilder sb = this.e;
        if (str != null) {
            String strTrim = str.trim();
            this.d = strTrim;
            if (strTrim.length() > 0) {
                if (this.h) {
                    string = sb.length() > 0 ? sb.toString() : this.f;
                } else {
                    string = this.g ? BuildConfig.VERSION_NAME : null;
                }
                kn knVar = this.j;
                String str2 = this.d;
                int iB = knVar.b(str2);
                if (iB != -1) {
                    knVar.h[iB] = string;
                } else {
                    int i = knVar.c;
                    int i2 = i + 1;
                    if (i2 < i) {
                        u41.k("Must be true");
                        return;
                    }
                    String[] strArr = knVar.d;
                    int length = strArr.length;
                    if (length < i2) {
                        int i3 = length >= 4 ? i * 2 : 4;
                        if (i2 <= i3) {
                            i2 = i3;
                        }
                        String[] strArr2 = new String[i2];
                        System.arraycopy(strArr, 0, strArr2, 0, Math.min(strArr.length, i2));
                        knVar.d = strArr2;
                        String[] strArr3 = knVar.h;
                        String[] strArr4 = new String[i2];
                        System.arraycopy(strArr3, 0, strArr4, 0, Math.min(strArr3.length, i2));
                        knVar.h = strArr4;
                    }
                    String[] strArr5 = knVar.d;
                    int i4 = knVar.c;
                    strArr5[i4] = str2;
                    knVar.h[i4] = string;
                    knVar.c = i4 + 1;
                }
            }
        }
        this.d = null;
        this.g = false;
        this.h = false;
        n14.b(sb);
        this.f = null;
    }

    @Override // defpackage.n14
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public m14 a() {
        this.b = null;
        this.c = null;
        this.d = null;
        n14.b(this.e);
        this.f = null;
        this.g = false;
        this.h = false;
        this.i = false;
        this.j = null;
        return this;
    }
}
