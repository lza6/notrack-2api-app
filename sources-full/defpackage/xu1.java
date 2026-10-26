package defpackage;

import app.template.extension.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class xu1 extends ef1 {
    private static final xu1 DEFAULT_INSTANCE;
    public static final int KEY_MATERIAL_TYPE_FIELD_NUMBER = 3;
    private static volatile it2 PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int keyMaterialType_;
    private String typeUrl_ = BuildConfig.VERSION_NAME;
    private mz value_ = mz.d;

    static {
        xu1 xu1Var = new xu1();
        DEFAULT_INSTANCE = xu1Var;
        ef1.t(xu1.class, xu1Var);
    }

    public static vu1 D() {
        return (vu1) DEFAULT_INSTANCE.h();
    }

    public static void w(xu1 xu1Var, String str) {
        xu1Var.getClass();
        str.getClass();
        xu1Var.typeUrl_ = str;
    }

    public static void x(xu1 xu1Var, kz kzVar) {
        xu1Var.getClass();
        xu1Var.value_ = kzVar;
    }

    public static void y(xu1 xu1Var, wu1 wu1Var) {
        xu1Var.getClass();
        if (wu1Var != wu1.UNRECOGNIZED) {
            xu1Var.keyMaterialType_ = wu1Var.c;
        } else {
            wu1Var.getClass();
            u41.k("Can't get the number of an unknown enum value.");
        }
    }

    public static xu1 z() {
        return DEFAULT_INSTANCE;
    }

    public final wu1 A() {
        wu1 wu1Var;
        int i = this.keyMaterialType_;
        if (i == 0) {
            wu1Var = wu1.UNKNOWN_KEYMATERIAL;
        } else if (i == 1) {
            wu1Var = wu1.SYMMETRIC;
        } else if (i == 2) {
            wu1Var = wu1.ASYMMETRIC_PRIVATE;
        } else if (i != 3) {
            wu1Var = i != 4 ? null : wu1.REMOTE;
        } else {
            wu1Var = wu1.ASYMMETRIC_PUBLIC;
        }
        return wu1Var == null ? wu1.UNRECOGNIZED : wu1Var;
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
                return new o23(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "keyMaterialType_"});
            case 3:
                return new xu1();
            case 4:
                return new vu1(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                it2 it2Var = PARSER;
                if (it2Var != null) {
                    return it2Var;
                }
                synchronized (xu1.class) {
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
