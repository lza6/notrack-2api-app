package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class z5 extends ef1 {
    private static final z5 DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile it2 PARSER;
    private int keySize_;
    private c6 params_;

    static {
        z5 z5Var = new z5();
        DEFAULT_INSTANCE = z5Var;
        ef1.t(z5.class, z5Var);
    }

    public static y5 A() {
        return (y5) DEFAULT_INSTANCE.h();
    }

    public static z5 B(mz mzVar, b61 b61Var) {
        return (z5) ef1.r(DEFAULT_INSTANCE, mzVar, b61Var);
    }

    public static void w(z5 z5Var, c6 c6Var) {
        z5Var.getClass();
        z5Var.params_ = c6Var;
    }

    public static void x(z5 z5Var, int i) {
        z5Var.keySize_ = i;
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
                return new o23(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"params_", "keySize_"});
            case 3:
                return new z5();
            case 4:
                return new y5(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                it2 it2Var = PARSER;
                if (it2Var != null) {
                    return it2Var;
                }
                synchronized (z5.class) {
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
        return this.keySize_;
    }

    public final c6 z() {
        c6 c6Var = this.params_;
        return c6Var == null ? c6.x() : c6Var;
    }
}
