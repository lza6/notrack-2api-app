package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class z4 extends ef1 {
    private static final z4 DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 1;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile it2 PARSER;
    private int keySize_;
    private g5 params_;

    static {
        z4 z4Var = new z4();
        DEFAULT_INSTANCE = z4Var;
        ef1.t(z4.class, z4Var);
    }

    public static y4 A() {
        return (y4) DEFAULT_INSTANCE.h();
    }

    public static z4 B(mz mzVar, b61 b61Var) {
        return (z4) ef1.r(DEFAULT_INSTANCE, mzVar, b61Var);
    }

    public static void w(z4 z4Var) {
        z4Var.keySize_ = 32;
    }

    public static void x(z4 z4Var, g5 g5Var) {
        z4Var.getClass();
        z4Var.params_ = g5Var;
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
                return new o23(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"keySize_", "params_"});
            case 3:
                return new z4();
            case 4:
                return new y4(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                it2 it2Var = PARSER;
                if (it2Var != null) {
                    return it2Var;
                }
                synchronized (z4.class) {
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

    public final g5 z() {
        g5 g5Var = this.params_;
        return g5Var == null ? g5.x() : g5Var;
    }
}
