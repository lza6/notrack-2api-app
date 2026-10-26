package okhttp3.internal.platform;

import org.conscrypt.Conscrypt;

/* JADX INFO: loaded from: classes.dex */
public abstract class ConscryptPlatform$Companion {
    public static boolean atLeastVersion() {
        Conscrypt.Version version = Conscrypt.version();
        if (version.major() != 2) {
            if (version.major() <= 2) {
                return false;
            }
        } else if (version.minor() != 1) {
            if (version.minor() <= 1) {
                return false;
            }
        } else if (version.patch() < 0) {
            return false;
        }
        return true;
    }
}
