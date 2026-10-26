package defpackage;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class qw1 implements p4 {
    public static final byte[] c = new byte[0];
    public final ov1 a;
    public final e6 b;

    public qw1(ov1 ov1Var, e6 e6Var) {
        this.a = ov1Var;
        this.b = e6Var;
    }

    @Override // defpackage.p4
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        g0 g0VarA;
        ov1 ov1Var = this.a;
        AtomicReference atomicReference = w43.a;
        synchronized (w43.class) {
            try {
                sv1 sv1Var = ((fv1) w43.a.get()).a(ov1Var.B()).a;
                Class cls = (Class) sv1Var.b;
                if (!((Map) sv1Var.c).keySet().contains(cls) && !Void.class.equals(cls)) {
                    throw new IllegalArgumentException("Given internalKeyMananger " + sv1Var.toString() + " does not support primitive class " + cls.getName());
                }
                if (!((Boolean) w43.c.get(ov1Var.B())).booleanValue()) {
                    throw new GeneralSecurityException("newKey-operation not permitted for key type " + ov1Var.B());
                }
                mz mzVarC = ov1Var.C();
                try {
                    qq4 qq4VarG = sv1Var.g();
                    g0 g0VarC = qq4VarG.c(mzVarC);
                    qq4VarG.d(g0VarC);
                    g0VarA = qq4VarG.a(g0VarC);
                } catch (sr1 e) {
                    throw new GeneralSecurityException("Failures parsing proto of type ".concat(((Class) sv1Var.g().a).getName()), e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        byte[] bArrE = g0VarA.e();
        byte[] bArrA = this.b.a(bArrE, c);
        byte[] bArrA2 = ((p4) w43.d(this.a.B(), bArrE)).a(bArr, bArr2);
        return ByteBuffer.allocate(bArrA.length + 4 + bArrA2.length).putInt(bArrA.length).put(bArrA).put(bArrA2).array();
    }

    @Override // defpackage.p4
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            int i = byteBufferWrap.getInt();
            if (i <= 0 || i > bArr.length - 4) {
                throw new GeneralSecurityException("invalid ciphertext");
            }
            byte[] bArr3 = new byte[i];
            byteBufferWrap.get(bArr3, 0, i);
            byte[] bArr4 = new byte[byteBufferWrap.remaining()];
            byteBufferWrap.get(bArr4, 0, byteBufferWrap.remaining());
            return ((p4) w43.d(this.a.B(), this.b.b(bArr3, c))).b(bArr4, bArr2);
        } catch (IndexOutOfBoundsException e) {
            e = e;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (NegativeArraySizeException e2) {
            e = e2;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (BufferUnderflowException e3) {
            e = e3;
            throw new GeneralSecurityException("invalid ciphertext", e);
        }
    }
}
