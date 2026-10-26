package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lw1 extends ef1 {
    private static final lw1 DEFAULT_INSTANCE;
    public static final int KEY_INFO_FIELD_NUMBER = 2;
    private static volatile it2 PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private yq1 keyInfo_ = k13.l;
    private int primaryKeyId_;

    static {
        lw1 lw1Var = new lw1();
        DEFAULT_INSTANCE = lw1Var;
        ef1.t(lw1.class, lw1Var);
    }

    public static void w(lw1 lw1Var, int i) {
        lw1Var.primaryKeyId_ = i;
    }

    public static void x(lw1 lw1Var, kw1 kw1Var) {
        lw1Var.getClass();
        yq1 yq1Var = lw1Var.keyInfo_;
        if (!((m0) yq1Var).c) {
            int size = yq1Var.size();
            lw1Var.keyInfo_ = yq1Var.e(size == 0 ? 10 : size * 2);
        }
        lw1Var.keyInfo_.add(kw1Var);
    }

    public static iw1 z() {
        return (iw1) DEFAULT_INSTANCE.h();
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
                return new o23(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "keyInfo_", kw1.class});
            case 3:
                return new lw1();
            case 4:
                return new iw1(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                it2 it2Var = PARSER;
                if (it2Var != null) {
                    return it2Var;
                }
                synchronized (lw1.class) {
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

    public final kw1 y() {
        return (kw1) this.keyInfo_.get(0);
    }
}
