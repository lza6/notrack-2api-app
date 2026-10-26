package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class r5 extends ef1 {
    private static final r5 DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile it2 PARSER;
    private int keySize_;
    private t5 params_;

    static {
        r5 r5Var = new r5();
        DEFAULT_INSTANCE = r5Var;
        ef1.t(r5.class, r5Var);
    }

    public static q5 B() {
        return (q5) DEFAULT_INSTANCE.h();
    }

    public static void w(r5 r5Var, t5 t5Var) {
        r5Var.getClass();
        r5Var.params_ = t5Var;
    }

    public static void x(r5 r5Var, int i) {
        r5Var.keySize_ = i;
    }

    public static r5 y() {
        return DEFAULT_INSTANCE;
    }

    public final t5 A() {
        t5 t5Var = this.params_;
        return t5Var == null ? t5.x() : t5Var;
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
                return new o23(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"params_", "keySize_"});
            case 3:
                return new r5();
            case 4:
                return new q5(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                it2 it2Var = PARSER;
                if (it2Var != null) {
                    return it2Var;
                }
                synchronized (r5.class) {
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
