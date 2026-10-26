package defpackage;

import app.template.extension.BuildConfig;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public class ug extends Exception {
    public ug(Status status) {
        int i = status.c;
        String str = status.d;
        str = str == null ? BuildConfig.VERSION_NAME : str;
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 2 + str.length());
        sb.append(i);
        sb.append(": ");
        sb.append(str);
        super(sb.toString());
    }
}
