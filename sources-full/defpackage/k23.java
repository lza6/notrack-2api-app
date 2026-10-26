package defpackage;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes.dex */
public abstract class k23 {
    public static final m5 a = new m5(7);

    public static byte[] a(int i) {
        byte[] bArr = new byte[i];
        ((SecureRandom) a.get()).nextBytes(bArr);
        return bArr;
    }
}
