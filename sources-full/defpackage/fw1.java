package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fw1 extends ef1 {
    private static final fw1 DEFAULT_INSTANCE;
    public static final int KEY_DATA_FIELD_NUMBER = 1;
    public static final int KEY_ID_FIELD_NUMBER = 3;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
    private static volatile it2 PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 2;
    private xu1 keyData_;
    private int keyId_;
    private int outputPrefixType_;
    private int status_;

    static {
        fw1 fw1Var = new fw1();
        DEFAULT_INSTANCE = fw1Var;
        ef1.t(fw1.class, fw1Var);
    }

    public static ew1 F() {
        return (ew1) DEFAULT_INSTANCE.h();
    }

    public static void w(fw1 fw1Var, xu1 xu1Var) {
        fw1Var.getClass();
        fw1Var.keyData_ = xu1Var;
    }

    public static void x(fw1 fw1Var, lr2 lr2Var) {
        fw1Var.getClass();
        fw1Var.outputPrefixType_ = lr2Var.b();
    }

    public static void y(fw1 fw1Var) {
        fw1Var.getClass();
        fw1Var.status_ = mv1.ENABLED.a();
    }

    public static void z(fw1 fw1Var, int i) {
        fw1Var.keyId_ = i;
    }

    public final xu1 A() {
        xu1 xu1Var = this.keyData_;
        return xu1Var == null ? xu1.z() : xu1Var;
    }

    public final int B() {
        return this.keyId_;
    }

    public final lr2 C() {
        lr2 lr2VarA = lr2.a(this.outputPrefixType_);
        return lr2VarA == null ? lr2.UNRECOGNIZED : lr2VarA;
    }

    public final mv1 D() {
        mv1 mv1Var;
        int i = this.status_;
        if (i == 0) {
            mv1Var = mv1.UNKNOWN_STATUS;
        } else if (i == 1) {
            mv1Var = mv1.ENABLED;
        } else if (i != 2) {
            mv1Var = i != 3 ? null : mv1.DESTROYED;
        } else {
            mv1Var = mv1.DISABLED;
        }
        return mv1Var == null ? mv1.UNRECOGNIZED : mv1Var;
    }

    public final boolean E() {
        return this.keyData_ != null;
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
                return new o23(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"keyData_", "status_", "keyId_", "outputPrefixType_"});
            case 3:
                return new fw1();
            case 4:
                return new ew1(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                it2 it2Var = PARSER;
                if (it2Var != null) {
                    return it2Var;
                }
                synchronized (fw1.class) {
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
