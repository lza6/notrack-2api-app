package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class l20 extends ef1 {
    private static final l20 DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 2;
    private static volatile it2 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private mz keyValue_ = mz.d;
    private int version_;

    static {
        l20 l20Var = new l20();
        DEFAULT_INSTANCE = l20Var;
        ef1.t(l20.class, l20Var);
    }

    public static k20 A() {
        return (k20) DEFAULT_INSTANCE.h();
    }

    public static l20 B(mz mzVar, b61 b61Var) {
        return (l20) ef1.r(DEFAULT_INSTANCE, mzVar, b61Var);
    }

    public static void w(l20 l20Var) {
        l20Var.version_ = 0;
    }

    public static void x(l20 l20Var, kz kzVar) {
        l20Var.getClass();
        l20Var.keyValue_ = kzVar;
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
                return new l20();
            case 4:
                return new k20(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                it2 it2Var = PARSER;
                if (it2Var != null) {
                    return it2Var;
                }
                synchronized (l20.class) {
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
