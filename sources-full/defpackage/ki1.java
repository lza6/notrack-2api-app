package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ki1 extends ef1 {
    private static final ki1 DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile it2 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private mz keyValue_ = mz.d;
    private qi1 params_;
    private int version_;

    static {
        ki1 ki1Var = new ki1();
        DEFAULT_INSTANCE = ki1Var;
        ef1.t(ki1.class, ki1Var);
    }

    public static ji1 D() {
        return (ji1) DEFAULT_INSTANCE.h();
    }

    public static ki1 E(mz mzVar, b61 b61Var) {
        return (ki1) ef1.r(DEFAULT_INSTANCE, mzVar, b61Var);
    }

    public static void w(ki1 ki1Var) {
        ki1Var.version_ = 0;
    }

    public static void x(ki1 ki1Var, qi1 qi1Var) {
        ki1Var.getClass();
        qi1Var.getClass();
        ki1Var.params_ = qi1Var;
    }

    public static void y(ki1 ki1Var, kz kzVar) {
        ki1Var.getClass();
        ki1Var.keyValue_ = kzVar;
    }

    public static ki1 z() {
        return DEFAULT_INSTANCE;
    }

    public final mz A() {
        return this.keyValue_;
    }

    public final qi1 B() {
        qi1 qi1Var = this.params_;
        return qi1Var == null ? qi1.y() : qi1Var;
    }

    public final int C() {
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
                return new ki1();
            case 4:
                return new ji1(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                it2 it2Var = PARSER;
                if (it2Var != null) {
                    return it2Var;
                }
                synchronized (ki1.class) {
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
}
