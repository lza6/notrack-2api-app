package defpackage;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public abstract class h5 {
    public static final at2 a;
    public static final zs2 b;
    public static final lv1 c;
    public static final jv1 d;

    static {
        nz nzVarB = ja4.b("type.googleapis.com/google.crypto.tink.AesCmacKey");
        a = new at2(e5.class);
        b = new zs2(nzVarB);
        c = new lv1(x4.class);
        d = new jv1(nzVarB, new u41(3));
    }

    public static d5 a(lr2 lr2Var) throws GeneralSecurityException {
        int iOrdinal = lr2Var.ordinal();
        if (iOrdinal == 1) {
            return d5.h;
        }
        if (iOrdinal == 2) {
            return d5.m;
        }
        if (iOrdinal == 3) {
            return d5.n;
        }
        if (iOrdinal == 4) {
            return d5.l;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + lr2Var.b());
    }
}
