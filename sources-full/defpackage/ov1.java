package defpackage;

import app.template.extension.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class ov1 extends ef1 {
    private static final ov1 DEFAULT_INSTANCE;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 3;
    private static volatile it2 PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int outputPrefixType_;
    private String typeUrl_ = BuildConfig.VERSION_NAME;
    private mz value_ = mz.d;

    static {
        ov1 ov1Var = new ov1();
        DEFAULT_INSTANCE = ov1Var;
        ef1.t(ov1.class, ov1Var);
    }

    public static nv1 D() {
        return (nv1) DEFAULT_INSTANCE.h();
    }

    public static void w(ov1 ov1Var, String str) {
        ov1Var.getClass();
        str.getClass();
        ov1Var.typeUrl_ = str;
    }

    public static void x(ov1 ov1Var, kz kzVar) {
        ov1Var.getClass();
        ov1Var.value_ = kzVar;
    }

    public static void y(ov1 ov1Var, lr2 lr2Var) {
        ov1Var.getClass();
        ov1Var.outputPrefixType_ = lr2Var.b();
    }

    public static ov1 z() {
        return DEFAULT_INSTANCE;
    }

    public final lr2 A() {
        lr2 lr2VarA = lr2.a(this.outputPrefixType_);
        return lr2VarA == null ? lr2.UNRECOGNIZED : lr2VarA;
    }

    public final String B() {
        return this.typeUrl_;
    }

    public final mz C() {
        return this.value_;
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
                return new o23(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "outputPrefixType_"});
            case 3:
                return new ov1();
            case 4:
                return new nv1(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                it2 it2Var = PARSER;
                if (it2Var != null) {
                    return it2Var;
                }
                synchronized (ov1.class) {
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
