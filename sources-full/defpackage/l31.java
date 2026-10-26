package defpackage;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public final class l31 implements p4 {
    public final n5 a;
    public final u82 b;
    public final int c;

    public l31(n5 n5Var, u82 u82Var, int i) {
        this.a = n5Var;
        this.b = u82Var;
        this.c = i;
    }

    @Override // defpackage.p4
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        n5 n5Var = this.a;
        n5Var.getClass();
        int length = bArr.length;
        int i = n5Var.b;
        int i2 = IntCompanionObject.MAX_VALUE - i;
        if (length > i2) {
            throw new GeneralSecurityException(ud2.m(i2, "plaintext length can not exceed "));
        }
        byte[] bArr3 = new byte[bArr.length + i];
        byte[] bArrA = k23.a(i);
        System.arraycopy(bArrA, 0, bArr3, 0, i);
        n5Var.a(bArr, 0, bArr.length, bArr3, n5Var.b, bArrA, true);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        return xp1.h(bArr3, this.b.b(xp1.h(bArr2, bArr3, Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8))));
    }

    @Override // defpackage.p4
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i = this.c;
        if (length < i) {
            m51.v("ciphertext too short");
            return null;
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length - i);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, bArr.length - i, bArr.length);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        this.b.a(bArrCopyOfRange2, xp1.h(bArr2, bArrCopyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8)));
        n5 n5Var = this.a;
        n5Var.getClass();
        int length2 = bArrCopyOfRange.length;
        int i2 = n5Var.b;
        if (length2 < i2) {
            m51.v("ciphertext too short");
            return null;
        }
        byte[] bArr3 = new byte[i2];
        System.arraycopy(bArrCopyOfRange, 0, bArr3, 0, i2);
        int length3 = bArrCopyOfRange.length;
        int i3 = n5Var.b;
        byte[] bArr4 = new byte[length3 - i3];
        n5Var.a(bArrCopyOfRange, i3, bArrCopyOfRange.length - i3, bArr4, 0, bArr3, false);
        return bArr4;
    }
}
