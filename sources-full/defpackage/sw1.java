package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class sw1 extends ef1 {
    private static final sw1 DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile it2 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private tw1 params_;
    private int version_;

    static {
        sw1 sw1Var = new sw1();
        DEFAULT_INSTANCE = sw1Var;
        ef1.t(sw1.class, sw1Var);
    }

    public static rw1 A() {
        return (rw1) DEFAULT_INSTANCE.h();
    }

    public static sw1 B(mz mzVar, b61 b61Var) {
        return (sw1) ef1.r(DEFAULT_INSTANCE, mzVar, b61Var);
    }

    public static void w(sw1 sw1Var) {
        sw1Var.version_ = 0;
    }

    public static void x(sw1 sw1Var, tw1 tw1Var) {
        sw1Var.getClass();
        tw1Var.getClass();
        sw1Var.params_ = tw1Var;
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
                return new o23(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"version_", "params_"});
            case 3:
                return new sw1();
            case 4:
                return new rw1(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                it2 it2Var = PARSER;
                if (it2Var != null) {
                    return it2Var;
                }
                synchronized (sw1.class) {
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

    public final tw1 y() {
        tw1 tw1Var = this.params_;
        return tw1Var == null ? tw1.w() : tw1Var;
    }

    public final int z() {
        return this.version_;
    }
}
