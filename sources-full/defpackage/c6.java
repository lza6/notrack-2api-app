package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class c6 extends ef1 {
    private static final c6 DEFAULT_INSTANCE;
    public static final int IV_SIZE_FIELD_NUMBER = 1;
    private static volatile it2 PARSER;
    private int ivSize_;

    static {
        c6 c6Var = new c6();
        DEFAULT_INSTANCE = c6Var;
        ef1.t(c6.class, c6Var);
    }

    public static void w(c6 c6Var) {
        c6Var.ivSize_ = 16;
    }

    public static c6 x() {
        return DEFAULT_INSTANCE;
    }

    public static b6 z() {
        return (b6) DEFAULT_INSTANCE.h();
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
                return new o23(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"ivSize_"});
            case 3:
                return new c6();
            case 4:
                return new b6(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                it2 it2Var = PARSER;
                if (it2Var != null) {
                    return it2Var;
                }
                synchronized (c6.class) {
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

    public final int y() {
        return this.ivSize_;
    }
}
