package defpackage;

import java.security.GeneralSecurityException;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class pw1 {
    public static final CopyOnWriteArrayList a = new CopyOnWriteArrayList();

    public static kb a(String str) throws GeneralSecurityException {
        boolean zStartsWith;
        for (kb kbVar : a) {
            synchronized (kbVar) {
                zStartsWith = str.toLowerCase(Locale.US).startsWith("android-keystore://");
            }
            if (zStartsWith) {
                return kbVar;
            }
        }
        throw new GeneralSecurityException(fq2.m("No KMS client does support: ", str));
    }
}
