package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class p5 extends ef1 {
    private static final p5 DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile it2 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private mz keyValue_ = mz.d;
    private t5 params_;
    private int version_;

    static {
        p5 p5Var = new p5();
        DEFAULT_INSTANCE = p5Var;
        ef1.t(p5.class, p5Var);
    }

    public static o5 D() {
        return (o5) DEFAULT_INSTANCE.h();
    }

    public static void w(p5 p5Var) {
        p5Var.version_ = 0;
    }

    public static void x(p5 p5Var, t5 t5Var) {
        p5Var.getClass();
        t5Var.getClass();
        p5Var.params_ = t5Var;
    }

    public static void y(p5 p5Var, kz kzVar) {
        p5Var.getClass();
        p5Var.keyValue_ = kzVar;
    }

    public static p5 z() {
        return DEFAULT_INSTANCE;
    }

    public final mz A() {
        return this.keyValue_;
    }

    public final t5 B() {
        t5 t5Var = this.params_;
        return t5Var == null ? t5.x() : t5Var;
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
                return new p5();
            case 4:
                return new o5(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                it2 it2Var = PARSER;
                if (it2Var != null) {
                    return it2Var;
                }
                synchronized (p5.class) {
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
