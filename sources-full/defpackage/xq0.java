package defpackage;

import android.text.TextUtils;
import app.template.extension.BuildConfig;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class xq0 implements Iterator {
    public final mi4 c = new mi4(4, false);
    public final StringBuilder d = new StringBuilder();
    public final int h;
    public int l;
    public final /* synthetic */ yq0 m;

    public xq0(yq0 yq0Var) {
        this.m = yq0Var;
        this.h = yq0Var.c.length();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        mi4 mi4Var = this.c;
        mi4Var.d = BuildConfig.VERSION_NAME;
        mi4Var.h = BuildConfig.VERSION_NAME;
        StringBuilder sb = this.d;
        sb.setLength(0);
        int i = this.l;
        String strTrim = null;
        boolean z = false;
        String strTrim2 = null;
        while (true) {
            int i2 = this.h;
            if (i >= i2) {
                if (strTrim == null || sb.length() <= 0) {
                    break;
                    break;
                }
                String strTrim3 = sb.toString().trim();
                mi4Var.d = strTrim;
                mi4Var.h = strTrim3;
                this.l = i2;
                break;
            }
            char cCharAt = this.m.c.charAt(i);
            if (strTrim == null) {
                if (':' == cCharAt) {
                    if (sb.length() > 0) {
                        strTrim = sb.toString().trim();
                    }
                    sb.setLength(0);
                } else if (';' == cCharAt) {
                    sb.setLength(0);
                } else if (Character.isWhitespace(cCharAt)) {
                    if (sb.length() > 0) {
                        z = true;
                    }
                } else if (z) {
                    sb.setLength(0);
                    sb.append(cCharAt);
                    z = false;
                } else {
                    sb.append(cCharAt);
                }
            } else if (strTrim2 != null) {
                continue;
            } else if (Character.isWhitespace(cCharAt)) {
                if (sb.length() > 0) {
                    sb.append(cCharAt);
                }
            } else if (';' == cCharAt) {
                strTrim2 = sb.toString().trim();
                sb.setLength(0);
                if (!TextUtils.isEmpty(strTrim) && !TextUtils.isEmpty(strTrim2)) {
                    this.l = i + 1;
                    mi4Var.d = strTrim;
                    mi4Var.h = strTrim2;
                    break;
                }
            } else {
                sb.append(cCharAt);
            }
            i++;
        }
        return (TextUtils.isEmpty((String) mi4Var.d) || TextUtils.isEmpty((String) mi4Var.h)) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        mi4 mi4Var = this.c;
        String str = (String) mi4Var.d;
        String str2 = (String) mi4Var.h;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            return mi4Var;
        }
        m51.o();
        return null;
    }
}
