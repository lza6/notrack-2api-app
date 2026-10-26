package defpackage;

import app.template.extension.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class ow1 extends ef1 {
    private static final ow1 DEFAULT_INSTANCE;
    public static final int KEY_URI_FIELD_NUMBER = 1;
    private static volatile it2 PARSER;
    private String keyUri_ = BuildConfig.VERSION_NAME;

    static {
        ow1 ow1Var = new ow1();
        DEFAULT_INSTANCE = ow1Var;
        ef1.t(ow1.class, ow1Var);
    }

    public static ow1 w() {
        return DEFAULT_INSTANCE;
    }

    public static ow1 y(mz mzVar, b61 b61Var) {
        return (ow1) ef1.r(DEFAULT_INSTANCE, mzVar, b61Var);
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
                return new o23(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"keyUri_"});
            case 3:
                return new ow1();
            case 4:
                return new n20(DEFAULT_INSTANCE, 2);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                it2 it2Var = PARSER;
                if (it2Var != null) {
                    return it2Var;
                }
                synchronized (ow1.class) {
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

    public final String x() {
        return this.keyUri_;
    }
}
