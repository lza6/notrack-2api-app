package defpackage;

import app.template.extension.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class tw1 extends ef1 {
    private static final tw1 DEFAULT_INSTANCE;
    public static final int DEK_TEMPLATE_FIELD_NUMBER = 2;
    public static final int KEK_URI_FIELD_NUMBER = 1;
    private static volatile it2 PARSER;
    private ov1 dekTemplate_;
    private String kekUri_ = BuildConfig.VERSION_NAME;

    static {
        tw1 tw1Var = new tw1();
        DEFAULT_INSTANCE = tw1Var;
        ef1.t(tw1.class, tw1Var);
    }

    public static tw1 A(mz mzVar, b61 b61Var) {
        return (tw1) ef1.r(DEFAULT_INSTANCE, mzVar, b61Var);
    }

    public static tw1 w() {
        return DEFAULT_INSTANCE;
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
                return new o23(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"kekUri_", "dekTemplate_"});
            case 3:
                return new tw1();
            case 4:
                return new n20(DEFAULT_INSTANCE, 3);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                it2 it2Var = PARSER;
                if (it2Var != null) {
                    return it2Var;
                }
                synchronized (tw1.class) {
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

    public final ov1 x() {
        ov1 ov1Var = this.dekTemplate_;
        return ov1Var == null ? ov1.z() : ov1Var;
    }

    public final String y() {
        return this.kekUri_;
    }

    public final boolean z() {
        return this.dekTemplate_ != null;
    }
}
