package defpackage;

import app.template.extension.BuildConfig;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class k62 {
    public static String a(int i, String str, List list) {
        fl1 fl1Var = fl1.H;
        if ((i & 1) != 0) {
            str = ", ";
        }
        if ((i & 32) != 0) {
            fl1Var = null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) BuildConfig.VERSION_NAME);
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            i2++;
            if (i2 > 1) {
                sb.append((CharSequence) str);
            }
            if (fl1Var != null) {
                sb.append((CharSequence) fl1Var.invoke(obj));
            } else if (obj != null ? obj instanceof CharSequence : true) {
                sb.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb.append(((Character) obj).charValue());
            } else {
                sb.append((CharSequence) String.valueOf(obj));
            }
        }
        sb.append((CharSequence) BuildConfig.VERSION_NAME);
        return sb.toString();
    }

    public static final void b(String str) {
        throw new UnsupportedOperationException(str);
    }
}
