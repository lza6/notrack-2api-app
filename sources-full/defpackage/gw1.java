package defpackage;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class gw1 extends ef1 {
    private static final gw1 DEFAULT_INSTANCE;
    public static final int KEY_FIELD_NUMBER = 2;
    private static volatile it2 PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private yq1 key_ = k13.l;
    private int primaryKeyId_;

    static {
        gw1 gw1Var = new gw1();
        DEFAULT_INSTANCE = gw1Var;
        ef1.t(gw1.class, gw1Var);
    }

    public static dw1 C() {
        return (dw1) DEFAULT_INSTANCE.h();
    }

    public static gw1 D(ByteArrayInputStream byteArrayInputStream, b61 b61Var) throws sr1 {
        ef1 ef1VarS = ef1.s(DEFAULT_INSTANCE, new ae0(byteArrayInputStream), b61Var);
        ef1.g(ef1VarS);
        return (gw1) ef1VarS;
    }

    public static gw1 E(byte[] bArr, b61 b61Var) {
        gw1 gw1Var = DEFAULT_INSTANCE;
        int length = bArr.length;
        ef1 ef1VarQ = gw1Var.q();
        try {
            j13 j13Var = j13.c;
            j13Var.getClass();
            za3 za3VarA = j13Var.a(ef1VarQ.getClass());
            jl jlVar = new jl();
            b61Var.getClass();
            za3VarA.g(ef1VarQ, bArr, 0, length, jlVar);
            za3VarA.d(ef1VarQ);
            ef1.g(ef1VarQ);
            return (gw1) ef1VarQ;
        } catch (IOException e) {
            if (e.getCause() instanceof sr1) {
                throw ((sr1) e.getCause());
            }
            throw new sr1(e.getMessage(), e);
        } catch (IndexOutOfBoundsException unused) {
            throw sr1.g();
        } catch (sr1 e2) {
            if (e2.c) {
                throw new sr1(e2.getMessage(), e2);
            }
            throw e2;
        } catch (u84 e3) {
            throw new sr1(e3.getMessage());
        }
    }

    public static void w(gw1 gw1Var, int i) {
        gw1Var.primaryKeyId_ = i;
    }

    public static void x(gw1 gw1Var, fw1 fw1Var) {
        gw1Var.getClass();
        yq1 yq1Var = gw1Var.key_;
        if (!((m0) yq1Var).c) {
            int size = yq1Var.size();
            gw1Var.key_ = yq1Var.e(size == 0 ? 10 : size * 2);
        }
        gw1Var.key_.add(fw1Var);
    }

    public final List A() {
        return this.key_;
    }

    public final int B() {
        return this.primaryKeyId_;
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
                return new o23(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "key_", fw1.class});
            case 3:
                return new gw1();
            case 4:
                return new dw1(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                it2 it2Var = PARSER;
                if (it2Var != null) {
                    return it2Var;
                }
                synchronized (gw1.class) {
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

    public final fw1 y(int i) {
        return (fw1) this.key_.get(i);
    }

    public final int z() {
        return this.key_.size();
    }
}
