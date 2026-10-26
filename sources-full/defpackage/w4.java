package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class w4 extends ef1 {
    private static final w4 DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 3;
    private static volatile it2 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private mz keyValue_ = mz.d;
    private g5 params_;
    private int version_;

    static {
        w4 w4Var = new w4();
        DEFAULT_INSTANCE = w4Var;
        ef1.t(w4.class, w4Var);
    }

    public static v4 C() {
        return (v4) DEFAULT_INSTANCE.h();
    }

    public static w4 D(mz mzVar, b61 b61Var) {
        return (w4) ef1.r(DEFAULT_INSTANCE, mzVar, b61Var);
    }

    public static void w(w4 w4Var) {
        w4Var.version_ = 0;
    }

    public static void x(w4 w4Var, kz kzVar) {
        w4Var.getClass();
        w4Var.keyValue_ = kzVar;
    }

    public static void y(w4 w4Var, g5 g5Var) {
        w4Var.getClass();
        g5Var.getClass();
        w4Var.params_ = g5Var;
    }

    public final g5 A() {
        g5 g5Var = this.params_;
        return g5Var == null ? g5.x() : g5Var;
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
                return new o23(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[]{"version_", "keyValue_", "params_"});
            case 3:
                return new w4();
            case 4:
                return new v4(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                it2 it2Var = PARSER;
                if (it2Var != null) {
                    return it2Var;
                }
                synchronized (w4.class) {
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
