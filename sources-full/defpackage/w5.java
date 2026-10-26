package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class w5 extends ef1 {
    private static final w5 DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile it2 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private mz keyValue_ = mz.d;
    private c6 params_;
    private int version_;

    static {
        w5 w5Var = new w5();
        DEFAULT_INSTANCE = w5Var;
        ef1.t(w5.class, w5Var);
    }

    public static v5 C() {
        return (v5) DEFAULT_INSTANCE.h();
    }

    public static w5 D(mz mzVar, b61 b61Var) {
        return (w5) ef1.r(DEFAULT_INSTANCE, mzVar, b61Var);
    }

    public static void w(w5 w5Var) {
        w5Var.version_ = 0;
    }

    public static void x(w5 w5Var, c6 c6Var) {
        w5Var.getClass();
        c6Var.getClass();
        w5Var.params_ = c6Var;
    }

    public static void y(w5 w5Var, kz kzVar) {
        w5Var.getClass();
        w5Var.keyValue_ = kzVar;
    }

    public final c6 A() {
        c6 c6Var = this.params_;
        return c6Var == null ? c6.x() : c6Var;
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
                return new o23(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"version_", "params_", "keyValue_"});
            case 3:
                return new w5();
            case 4:
                return new v5(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                it2 it2Var = PARSER;
                if (it2Var != null) {
                    return it2Var;
                }
                synchronized (w5.class) {
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

    public final mz z() {
        return this.keyValue_;
    }
}
