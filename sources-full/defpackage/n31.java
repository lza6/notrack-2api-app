package defpackage;

import java.io.ByteArrayInputStream;

/* JADX INFO: loaded from: classes.dex */
public final class n31 extends ef1 {
    private static final n31 DEFAULT_INSTANCE;
    public static final int ENCRYPTED_KEYSET_FIELD_NUMBER = 2;
    public static final int KEYSET_INFO_FIELD_NUMBER = 3;
    private static volatile it2 PARSER;
    private mz encryptedKeyset_ = mz.d;
    private lw1 keysetInfo_;

    static {
        n31 n31Var = new n31();
        DEFAULT_INSTANCE = n31Var;
        ef1.t(n31.class, n31Var);
    }

    public static n31 A(ByteArrayInputStream byteArrayInputStream, b61 b61Var) throws sr1 {
        ef1 ef1VarS = ef1.s(DEFAULT_INSTANCE, new ae0(byteArrayInputStream), b61Var);
        ef1.g(ef1VarS);
        return (n31) ef1VarS;
    }

    public static void w(n31 n31Var, kz kzVar) {
        n31Var.getClass();
        n31Var.encryptedKeyset_ = kzVar;
    }

    public static void x(n31 n31Var, lw1 lw1Var) {
        n31Var.getClass();
        n31Var.keysetInfo_ = lw1Var;
    }

    public static m31 z() {
        return (m31) DEFAULT_INSTANCE.h();
    }

    @Override // defpackage.ef1
    public final Object i(int i) {
        it2 df1Var;
        switch (fq2.z(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new o23(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\n\u0003\t", new Object[]{"encryptedKeyset_", "keysetInfo_"});
            case 3:
                return new n31();
            case 4:
                return new m31(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                it2 it2Var = PARSER;
                if (it2Var != null) {
                    return it2Var;
                }
                synchronized (n31.class) {
                    try {
                        df1Var = PARSER;
                        if (df1Var == null) {
                            df1Var = new df1();
                            PARSER = df1Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return df1Var;
            default:
                m51.e();
                return null;
        }
    }

    public final mz y() {
        return this.encryptedKeyset_;
    }
}
