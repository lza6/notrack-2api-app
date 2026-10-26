package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nw1 extends ef1 {
    private static final nw1 DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile it2 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private ow1 params_;
    private int version_;

    static {
        nw1 nw1Var = new nw1();
        DEFAULT_INSTANCE = nw1Var;
        ef1.t(nw1.class, nw1Var);
    }

    public static mw1 A() {
        return (mw1) DEFAULT_INSTANCE.h();
    }

    public static nw1 B(mz mzVar, b61 b61Var) {
        return (nw1) ef1.r(DEFAULT_INSTANCE, mzVar, b61Var);
    }

    public static void w(nw1 nw1Var) {
        nw1Var.version_ = 0;
    }

    public static void x(nw1 nw1Var, ow1 ow1Var) {
        nw1Var.getClass();
        ow1Var.getClass();
        nw1Var.params_ = ow1Var;
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
                return new o23(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"version_", "params_"});
            case 3:
                return new nw1();
            case 4:
                return new mw1(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                it2 it2Var = PARSER;
                if (it2Var != null) {
                    return it2Var;
                }
                synchronized (nw1.class) {
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

    public final ow1 y() {
        ow1 ow1Var = this.params_;
        return ow1Var == null ? ow1.w() : ow1Var;
    }

    public final int z() {
        return this.version_;
    }
}
