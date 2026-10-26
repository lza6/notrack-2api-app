package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class o20 extends ef1 {
    private static final o20 DEFAULT_INSTANCE;
    private static volatile it2 PARSER;

    static {
        o20 o20Var = new o20();
        DEFAULT_INSTANCE = o20Var;
        ef1.t(o20.class, o20Var);
    }

    public static o20 w() {
        return DEFAULT_INSTANCE;
    }

    public static o20 x(mz mzVar, b61 b61Var) {
        return (o20) ef1.r(DEFAULT_INSTANCE, mzVar, b61Var);
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
                return new o23(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 3:
                return new o20();
            case 4:
                return new n20(DEFAULT_INSTANCE, 0);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                it2 it2Var = PARSER;
                if (it2Var != null) {
                    return it2Var;
                }
                synchronized (o20.class) {
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
