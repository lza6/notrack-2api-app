package defpackage;

import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Random;
import javax.crypto.Cipher;

/* JADX INFO: loaded from: classes.dex */
public final class m5 extends ThreadLocal {
    public final /* synthetic */ int a;

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.a) {
            case 0:
                try {
                    return (Cipher) r31.b.a.a("AES/CTR/NoPadding");
                } catch (GeneralSecurityException e) {
                    throw new IllegalStateException(e);
                }
            case 1:
                try {
                    return (Cipher) r31.b.a.a("AES/ECB/NOPADDING");
                } catch (GeneralSecurityException e2) {
                    throw new IllegalStateException(e2);
                }
            case 2:
                try {
                    return (Cipher) r31.b.a.a("AES/CTR/NOPADDING");
                } catch (GeneralSecurityException e3) {
                    throw new IllegalStateException(e3);
                }
            case 3:
                try {
                    return (Cipher) r31.b.a.a("AES/GCM-SIV/NoPadding");
                } catch (GeneralSecurityException e4) {
                    throw new IllegalStateException(e4);
                }
            case 4:
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                simpleDateFormat.setLenient(false);
                simpleDateFormat.setTimeZone(ka4.f);
                return simpleDateFormat;
            case 5:
                return new Random();
            case 6:
                try {
                    return (Cipher) r31.b.a.a("AES/GCM/NoPadding");
                } catch (GeneralSecurityException e5) {
                    throw new IllegalStateException(e5);
                }
            default:
                SecureRandom secureRandom = new SecureRandom();
                secureRandom.nextLong();
                return secureRandom;
        }
    }
}
