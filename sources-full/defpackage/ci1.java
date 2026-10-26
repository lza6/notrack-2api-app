package defpackage;

import app.template.extension.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class ci1 {
    public static final ci1 b = new ci1();
    public final boolean a = true;

    public ci1() {
        if (g13.d(BuildConfig.VERSION_NAME)) {
            return;
        }
        g13.d(BuildConfig.VERSION_NAME);
    }

    public final void a(StringBuilder sb, String str) {
        ud2.v(sb, str, "prefix = \"", BuildConfig.VERSION_NAME, "\",");
        sb.append('\n');
        sb.append(str);
        sb.append("suffix = \"");
        sb.append(BuildConfig.VERSION_NAME);
        sb.append("\",");
        sb.append('\n');
        sb.append(str);
        sb.append("removeLeadingZeros = ");
        sb.append(false);
        sb.append(',');
        sb.append('\n');
        sb.append(str);
        sb.append("minLength = ");
        sb.append(1);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NumberHexFormat(\n");
        a(sb, "    ");
        sb.append('\n');
        sb.append(")");
        return sb.toString();
    }
}
