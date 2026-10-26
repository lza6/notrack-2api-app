package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class j5 extends ef1 {
    public static final int AES_CTR_KEY_FIELD_NUMBER = 2;
    private static final j5 DEFAULT_INSTANCE;
    public static final int HMAC_KEY_FIELD_NUMBER = 3;
    private static volatile it2 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private p5 aesCtrKey_;
    private ki1 hmacKey_;
    private int version_;

    static {
        j5 j5Var = new j5();
        DEFAULT_INSTANCE = j5Var;
        ef1.t(j5.class, j5Var);
    }

    public static i5 C() {
        return (i5) DEFAULT_INSTANCE.h();
    }

    public static j5 D(mz mzVar, b61 b61Var) {
        return (j5) ef1.r(DEFAULT_INSTANCE, mzVar, b61Var);
    }

    public static void w(j5 j5Var) {
        j5Var.version_ = 0;
    }

    public static void x(j5 j5Var, p5 p5Var) {
        j5Var.getClass();
        p5Var.getClass();
        j5Var.aesCtrKey_ = p5Var;
    }

    public static void y(j5 j5Var, ki1 ki1Var) {
        j5Var.getClass();
        ki1Var.getClass();
        j5Var.hmacKey_ = ki1Var;
    }

    public final ki1 A() {
        ki1 ki1Var = this.hmacKey_;
        return ki1Var == null ? ki1.z() : ki1Var;
    }

    public final int B() {
        return this.version_;
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
                return new o23(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"version_", "aesCtrKey_", "hmacKey_"});
            case 3:
                return new j5();
            case 4:
                return new i5(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                it2 it2Var = PARSER;
                if (it2Var != null) {
                    return it2Var;
                }
                synchronized (j5.class) {
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

    public final p5 z() {
        p5 p5Var = this.aesCtrKey_;
        return p5Var == null ? p5.z() : p5Var;
    }
}
