package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ni1 extends ef1 {
    private static final ni1 DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile it2 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 3;
    private int keySize_;
    private qi1 params_;
    private int version_;

    static {
        ni1 ni1Var = new ni1();
        DEFAULT_INSTANCE = ni1Var;
        ef1.t(ni1.class, ni1Var);
    }

    public static mi1 B() {
        return (mi1) DEFAULT_INSTANCE.h();
    }

    public static ni1 C(mz mzVar, b61 b61Var) {
        return (ni1) ef1.r(DEFAULT_INSTANCE, mzVar, b61Var);
    }

    public static void w(ni1 ni1Var, qi1 qi1Var) {
        ni1Var.getClass();
        ni1Var.params_ = qi1Var;
    }

    public static void x(ni1 ni1Var, int i) {
        ni1Var.keySize_ = i;
    }

    public static ni1 y() {
        return DEFAULT_INSTANCE;
    }

    public final qi1 A() {
        qi1 qi1Var = this.params_;
        return qi1Var == null ? qi1.y() : qi1Var;
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
                return new o23(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\u000b", new Object[]{"params_", "keySize_", "version_"});
            case 3:
                return new ni1();
            case 4:
                return new mi1(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                it2 it2Var = PARSER;
                if (it2Var != null) {
                    return it2Var;
                }
                synchronized (ni1.class) {
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

    public final int z() {
        return this.keySize_;
    }
}
