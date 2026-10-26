package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lj4 extends ef1 {
    private static final lj4 DEFAULT_INSTANCE;
    private static volatile it2 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int version_;

    static {
        lj4 lj4Var = new lj4();
        DEFAULT_INSTANCE = lj4Var;
        ef1.t(lj4.class, lj4Var);
    }

    public static lj4 w() {
        return DEFAULT_INSTANCE;
    }

    public static lj4 x(mz mzVar, b61 b61Var) {
        return (lj4) ef1.r(DEFAULT_INSTANCE, mzVar, b61Var);
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
                return new o23(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"version_"});
            case 3:
                return new lj4();
            case 4:
                return new n20(DEFAULT_INSTANCE, 5);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                it2 it2Var = PARSER;
                if (it2Var != null) {
                    return it2Var;
                }
                synchronized (lj4.class) {
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
