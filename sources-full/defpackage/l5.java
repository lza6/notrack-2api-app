package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class l5 extends ef1 {
    public static final int AES_CTR_KEY_FORMAT_FIELD_NUMBER = 1;
    private static final l5 DEFAULT_INSTANCE;
    public static final int HMAC_KEY_FORMAT_FIELD_NUMBER = 2;
    private static volatile it2 PARSER;
    private r5 aesCtrKeyFormat_;
    private ni1 hmacKeyFormat_;

    static {
        l5 l5Var = new l5();
        DEFAULT_INSTANCE = l5Var;
        ef1.t(l5.class, l5Var);
    }

    public static k5 A() {
        return (k5) DEFAULT_INSTANCE.h();
    }

    public static l5 B(mz mzVar, b61 b61Var) {
        return (l5) ef1.r(DEFAULT_INSTANCE, mzVar, b61Var);
    }

    public static void w(l5 l5Var, r5 r5Var) {
        l5Var.getClass();
        l5Var.aesCtrKeyFormat_ = r5Var;
    }

    public static void x(l5 l5Var, ni1 ni1Var) {
        l5Var.getClass();
        l5Var.hmacKeyFormat_ = ni1Var;
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
                return new o23(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"aesCtrKeyFormat_", "hmacKeyFormat_"});
            case 3:
                return new l5();
            case 4:
                return new k5(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                it2 it2Var = PARSER;
                if (it2Var != null) {
                    return it2Var;
                }
                synchronized (l5.class) {
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

    public final r5 y() {
        r5 r5Var = this.aesCtrKeyFormat_;
        return r5Var == null ? r5.y() : r5Var;
    }

    public final ni1 z() {
        ni1 ni1Var = this.hmacKeyFormat_;
        return ni1Var == null ? ni1.y() : ni1Var;
    }
}
