package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class g6 extends ef1 {
    private static final g6 DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    private static volatile it2 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private mz keyValue_ = mz.d;
    private int version_;

    static {
        g6 g6Var = new g6();
        DEFAULT_INSTANCE = g6Var;
        ef1.t(g6.class, g6Var);
    }

    public static f6 A() {
        return (f6) DEFAULT_INSTANCE.h();
    }

    public static g6 B(mz mzVar, b61 b61Var) {
        return (g6) ef1.r(DEFAULT_INSTANCE, mzVar, b61Var);
    }

    public static void w(g6 g6Var) {
        g6Var.version_ = 0;
    }

    public static void x(g6 g6Var, kz kzVar) {
        g6Var.getClass();
        g6Var.keyValue_ = kzVar;
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
                return new o23(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"version_", "keyValue_"});
            case 3:
                return new g6();
            case 4:
                return new f6(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                it2 it2Var = PARSER;
                if (it2Var != null) {
                    return it2Var;
                }
                synchronized (g6.class) {
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
