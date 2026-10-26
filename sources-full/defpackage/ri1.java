package defpackage;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public abstract class ri1 {
    public static final at2 a;
    public static final zs2 b;
    public static final lv1 c;
    public static final jv1 d;

    static {
        nz nzVarB = ja4.b("type.googleapis.com/google.crypto.tink.HmacKey");
        a = new at2(oi1.class);
        b = new zs2(nzVarB);
        c = new lv1(li1.class);
        d = new jv1(nzVarB, new m51(7));
    }

    public static d5 a(qh1 qh1Var) throws GeneralSecurityException {
        int iOrdinal = qh1Var.ordinal();
        if (iOrdinal == 1) {
            return d5.A;
        }
        if (iOrdinal == 2) {
            return d5.D;
        }
        if (iOrdinal == 3) {
            return d5.C;
        }
        if (iOrdinal == 4) {
            return d5.E;
        }
        if (iOrdinal == 5) {
            return d5.B;
        }
        throw new GeneralSecurityException("Unable to parse HashType: " + qh1Var.a());
    }

    public static d5 b(lr2 lr2Var) throws GeneralSecurityException {
        int iOrdinal = lr2Var.ordinal();
        if (iOrdinal == 1) {
            return d5.F;
        }
        if (iOrdinal == 2) {
            return d5.H;
        }
        if (iOrdinal == 3) {
            return d5.I;
        }
        if (iOrdinal == 4) {
            return d5.G;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + lr2Var.b());
    }
}
