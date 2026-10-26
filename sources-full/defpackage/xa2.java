package defpackage;

import android.security.keystore.KeyGenParameterSpec;
import org.scilab.forge.jlatexmath.FontInfo;

/* JADX INFO: loaded from: classes.dex */
public abstract class xa2 {
    public static final Object a;

    static {
        new KeyGenParameterSpec.Builder("_androidx_security_master_key_", 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setKeySize(FontInfo.NUMBER_OF_CHAR_CODES).build();
        a = new Object();
    }
}
