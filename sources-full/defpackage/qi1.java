package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qi1 extends ef1 {
    private static final qi1 DEFAULT_INSTANCE;
    public static final int HASH_FIELD_NUMBER = 1;
    private static volatile it2 PARSER = null;
    public static final int TAG_SIZE_FIELD_NUMBER = 2;
    private int hash_;
    private int tagSize_;

    static {
        qi1 qi1Var = new qi1();
        DEFAULT_INSTANCE = qi1Var;
        ef1.t(qi1.class, qi1Var);
    }

    public static pi1 B() {
        return (pi1) DEFAULT_INSTANCE.h();
    }

    public static void w(qi1 qi1Var, qh1 qh1Var) {
        qi1Var.getClass();
        qi1Var.hash_ = qh1Var.a();
    }

    public static void x(qi1 qi1Var, int i) {
        qi1Var.tagSize_ = i;
    }

    public static qi1 y() {
        return DEFAULT_INSTANCE;
    }

    public final int A() {
        return this.tagSize_;
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
                return new o23(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"hash_", "tagSize_"});
            case 3:
                return new qi1();
            case 4:
                return new pi1(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                it2 it2Var = PARSER;
                if (it2Var != null) {
                    return it2Var;
                }
                synchronized (qi1.class) {
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

    public final qh1 z() {
        qh1 qh1Var;
        int i = this.hash_;
        if (i == 0) {
            qh1Var = qh1.UNKNOWN_HASH;
        } else if (i == 1) {
            qh1Var = qh1.SHA1;
        } else if (i == 2) {
            qh1Var = qh1.SHA384;
        } else if (i == 3) {
            qh1Var = qh1.SHA256;
        } else if (i != 4) {
            qh1Var = i != 5 ? null : qh1.SHA224;
        } else {
            qh1Var = qh1.SHA512;
        }
        return qh1Var == null ? qh1.UNRECOGNIZED : qh1Var;
    }
}
