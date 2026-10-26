package defpackage;

import app.template.extension.BuildConfig;
import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public final class bi1 {
    public static final bi1 a;

    static {
        bi1 bi1Var = new bi1();
        if (!g13.d("  ") && !g13.d(BuildConfig.VERSION_NAME) && !g13.d(BuildConfig.VERSION_NAME)) {
            g13.d(BuildConfig.VERSION_NAME);
        }
        a = bi1Var;
    }

    public final void a(StringBuilder sb, String str) {
        sb.append(str);
        sb.append("bytesPerLine = ");
        sb.append(IntCompanionObject.MAX_VALUE);
        sb.append(",");
        sb.append('\n');
        sb.append(str);
        sb.append("bytesPerGroup = ");
        sb.append(IntCompanionObject.MAX_VALUE);
        sb.append(",");
        sb.append('\n');
        sb.append(str);
        sb.append("groupSeparator = \"");
        sb.append("  ");
        sb.append("\",");
        sb.append('\n');
        sb.append(str);
        sb.append("byteSeparator = \"");
        sb.append(BuildConfig.VERSION_NAME);
        sb.append("\",");
        sb.append('\n');
        ud2.v(sb, str, "bytePrefix = \"", BuildConfig.VERSION_NAME, "\",");
        sb.append('\n');
        sb.append(str);
        sb.append("byteSuffix = \"");
        sb.append(BuildConfig.VERSION_NAME);
        sb.append("\"");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BytesHexFormat(\n");
        a(sb, "    ");
        sb.append('\n');
        sb.append(")");
        return sb.toString();
    }
}
