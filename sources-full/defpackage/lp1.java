package defpackage;

import android.os.Build;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Objects;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.uuid.Uuid;

/* JADX INFO: loaded from: classes.dex */
public final class lp1 {
    public static final m5 c = new m5(6);
    public final SecretKeySpec a;
    public final boolean b;

    public lp1(byte[] bArr) throws GeneralSecurityException {
        if (!ud2.b(2)) {
            m51.v("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
            throw null;
        }
        ya4.a(bArr.length);
        this.a = new SecretKeySpec(bArr, "AES");
        this.b = true;
    }

    public static AlgorithmParameterSpec a(byte[] bArr) {
        int length = bArr.length;
        if ("The Android Project".equals(System.getProperty("java.vendor"))) {
            int i = ja4.a;
            Integer numValueOf = !Objects.equals(System.getProperty("java.vendor"), "The Android Project") ? null : Integer.valueOf(Build.VERSION.SDK_INT);
            if ((numValueOf != null ? numValueOf.intValue() : -1) <= 19) {
                return new IvParameterSpec(bArr, 0, length);
            }
        }
        return new GCMParameterSpec(Uuid.SIZE_BITS, bArr, 0, length);
    }
}
