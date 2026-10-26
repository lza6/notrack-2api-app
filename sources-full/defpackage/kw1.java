package defpackage;

import app.template.extension.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class kw1 extends ef1 {
    private static final kw1 DEFAULT_INSTANCE;
    public static final int KEY_ID_FIELD_NUMBER = 3;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
    private static volatile it2 PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 2;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    private int keyId_;
    private int outputPrefixType_;
    private int status_;
    private String typeUrl_ = BuildConfig.VERSION_NAME;

    static {
        kw1 kw1Var = new kw1();
        DEFAULT_INSTANCE = kw1Var;
        ef1.t(kw1.class, kw1Var);
    }

    public static jw1 B() {
        return (jw1) DEFAULT_INSTANCE.h();
    }

    public static void w(kw1 kw1Var, String str) {
        kw1Var.getClass();
        str.getClass();
        kw1Var.typeUrl_ = str;
    }

    public static void x(kw1 kw1Var, lr2 lr2Var) {
        kw1Var.getClass();
        kw1Var.outputPrefixType_ = lr2Var.b();
    }

    public static void y(kw1 kw1Var, mv1 mv1Var) {
        kw1Var.getClass();
        kw1Var.status_ = mv1Var.a();
    }

    public static void z(kw1 kw1Var, int i) {
        kw1Var.keyId_ = i;
    }

    public final int A() {
        return this.keyId_;
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
                return new o23(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"typeUrl_", "status_", "keyId_", "outputPrefixType_"});
            case 3:
                return new kw1();
            case 4:
                return new jw1(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                it2 it2Var = PARSER;
                if (it2Var != null) {
                    return it2Var;
                }
                synchronized (kw1.class) {
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
