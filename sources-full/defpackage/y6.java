package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class y6 extends ef1 {
    private static final y6 DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 1;
    private static volatile it2 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 2;
    private int keySize_;
    private int version_;

    static {
        y6 y6Var = new y6();
        DEFAULT_INSTANCE = y6Var;
        ef1.t(y6.class, y6Var);
    }

    public static void w(y6 y6Var) {
        y6Var.keySize_ = 64;
    }

    public static x6 y() {
        return (x6) DEFAULT_INSTANCE.h();
    }

    public static y6 z(mz mzVar, b61 b61Var) {
        return (y6) ef1.r(DEFAULT_INSTANCE, mzVar, b61Var);
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
                return new o23(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"keySize_", "version_"});
            case 3:
                return new y6();
            case 4:
                return new x6(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                it2 it2Var = PARSER;
                if (it2Var != null) {
                    return it2Var;
                }
                synchronized (y6.class) {
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

    public final int x() {
        return this.keySize_;
    }
}
