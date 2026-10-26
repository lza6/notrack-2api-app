package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class j6 extends ef1 {
    private static final j6 DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    private static volatile it2 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 3;
    private int keySize_;
    private int version_;

    static {
        j6 j6Var = new j6();
        DEFAULT_INSTANCE = j6Var;
        ef1.t(j6.class, j6Var);
    }

    public static void w(j6 j6Var, int i) {
        j6Var.keySize_ = i;
    }

    public static i6 y() {
        return (i6) DEFAULT_INSTANCE.h();
    }

    public static j6 z(mz mzVar, b61 b61Var) {
        return (j6) ef1.r(DEFAULT_INSTANCE, mzVar, b61Var);
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
                return new o23(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"keySize_", "version_"});
            case 3:
                return new j6();
            case 4:
                return new i6(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                it2 it2Var = PARSER;
                if (it2Var != null) {
                    return it2Var;
                }
                synchronized (j6.class) {
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

    public final int x() {
        return this.keySize_;
    }
}
