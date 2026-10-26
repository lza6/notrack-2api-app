package defpackage;

import app.template.extension.BuildConfig;
import com.google.android.gms.common.api.Status;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class wp1 extends ug {
    /* JADX WARN: Code duplicated, block: B:8:0x0045  */
    /* JADX WARN: Illegal instructions before constructor call */
    public wp1(int i) {
        String str;
        Locale locale = Locale.getDefault();
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = hl4.a;
        Integer numValueOf2 = Integer.valueOf(i);
        if (map.containsKey(numValueOf2)) {
            HashMap map2 = hl4.b;
            if (map2.containsKey(numValueOf2)) {
                str = ((String) map.get(numValueOf2)) + " (https://developer.android.com/reference/com/google/android/play/core/install/model/InstallErrorCode#" + ((String) map2.get(numValueOf2)) + ")";
            } else {
                str = BuildConfig.VERSION_NAME;
            }
        } else {
            str = BuildConfig.VERSION_NAME;
        }
        super(new Status(i, String.format(locale, "Install Error(%d): %s", numValueOf, str), null, null));
        if (i != 0) {
            return;
        }
        u41.k("errorCode should not be 0.");
        throw null;
    }
}
