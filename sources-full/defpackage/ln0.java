package defpackage;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import app.template.extension.BuildConfig;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class ln0 implements kn0, mn0 {
    public final /* synthetic */ int c = 0;
    public ClipData d;
    public int h;
    public int l;
    public Uri m;
    public Bundle n;

    public /* synthetic */ ln0() {
    }

    public ln0(ln0 ln0Var) {
        ClipData clipData = ln0Var.d;
        clipData.getClass();
        this.d = clipData;
        int i = ln0Var.h;
        if (i < 0) {
            Locale locale = Locale.US;
            u41.k("source is out of range of [0, 5] (too low)");
            throw null;
        }
        if (i > 5) {
            Locale locale2 = Locale.US;
            u41.k("source is out of range of [0, 5] (too high)");
            throw null;
        }
        this.h = i;
        int i2 = ln0Var.l;
        if ((i2 & 1) == i2) {
            this.l = i2;
            this.m = ln0Var.m;
            this.n = ln0Var.n;
            return;
        }
        throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i2) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
    }

    @Override // defpackage.kn0
    public nn0 build() {
        return new nn0(new ln0(this));
    }

    @Override // defpackage.mn0
    public ClipData getClip() {
        return this.d;
    }

    @Override // defpackage.mn0
    public int i() {
        return this.l;
    }

    @Override // defpackage.mn0
    public ContentInfo j() {
        return null;
    }

    @Override // defpackage.kn0
    public void n(Uri uri) {
        this.m = uri;
    }

    @Override // defpackage.mn0
    public int o() {
        return this.h;
    }

    @Override // defpackage.kn0
    public void s(int i) {
        this.l = i;
    }

    @Override // defpackage.kn0
    public void setExtras(Bundle bundle) {
        this.n = bundle;
    }

    public String toString() {
        String strValueOf;
        String str;
        switch (this.c) {
            case 1:
                Uri uri = this.m;
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(this.d.getDescription());
                sb.append(", source=");
                int i = this.h;
                if (i == 0) {
                    strValueOf = "SOURCE_APP";
                } else if (i == 1) {
                    strValueOf = "SOURCE_CLIPBOARD";
                } else if (i == 2) {
                    strValueOf = "SOURCE_INPUT_METHOD";
                } else if (i == 3) {
                    strValueOf = "SOURCE_DRAG_AND_DROP";
                } else if (i != 4) {
                    strValueOf = i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT";
                } else {
                    strValueOf = "SOURCE_AUTOFILL";
                }
                sb.append(strValueOf);
                sb.append(", flags=");
                int i2 = this.l;
                sb.append((i2 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i2));
                String str2 = BuildConfig.VERSION_NAME;
                if (uri == null) {
                    str = BuildConfig.VERSION_NAME;
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str);
                if (this.n != null) {
                    str2 = ", hasExtras";
                }
                return fq2.r(sb, str2, "}");
            default:
                return super.toString();
        }
    }
}
