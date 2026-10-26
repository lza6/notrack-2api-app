package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class g5 extends ef1 {
    private static final g5 DEFAULT_INSTANCE;
    private static volatile it2 PARSER = null;
    public static final int TAG_SIZE_FIELD_NUMBER = 1;
    private int tagSize_;

    static {
        g5 g5Var = new g5();
        DEFAULT_INSTANCE = g5Var;
        ef1.t(g5.class, g5Var);
    }

    public static void w(g5 g5Var) {
        g5Var.tagSize_ = 16;
    }

    public static g5 x() {
        return DEFAULT_INSTANCE;
    }

    public static f5 z() {
        return (f5) DEFAULT_INSTANCE.h();
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
                return new o23(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"tagSize_"});
            case 3:
                return new g5();
            case 4:
                return new f5(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                it2 it2Var = PARSER;
                if (it2Var != null) {
                    return it2Var;
                }
                synchronized (g5.class) {
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
        return this.tagSize_;
    }
}
