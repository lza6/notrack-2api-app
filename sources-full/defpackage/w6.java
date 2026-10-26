package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class w6 extends ef1 {
    private static final w6 DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 2;
    private static volatile it2 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private mz keyValue_ = mz.d;
    private int version_;

    static {
        w6 w6Var = new w6();
        DEFAULT_INSTANCE = w6Var;
        ef1.t(w6.class, w6Var);
    }

    public static v6 A() {
        return (v6) DEFAULT_INSTANCE.h();
    }

    public static w6 B(mz mzVar, b61 b61Var) {
        return (w6) ef1.r(DEFAULT_INSTANCE, mzVar, b61Var);
    }

    public static void w(w6 w6Var) {
        w6Var.version_ = 0;
    }

    public static void x(w6 w6Var, kz kzVar) {
        w6Var.getClass();
        w6Var.keyValue_ = kzVar;
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
                return new o23(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"version_", "keyValue_"});
            case 3:
                return new w6();
            case 4:
                return new v6(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                it2 it2Var = PARSER;
                if (it2Var != null) {
                    return it2Var;
                }
                synchronized (w6.class) {
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

    public final mz y() {
        return this.keyValue_;
    }

    public final int z() {
        return this.version_;
    }
}
