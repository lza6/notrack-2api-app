package defpackage;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class jv0 implements hv0 {
    public final iy2 a;
    public final qn0 b;
    public final qn0 c;

    public jv0(iy2 iy2Var) {
        this.a = iy2Var;
        boolean zIsEmpty = ((uf2) iy2Var.l).a.isEmpty();
        qn0 qn0Var = wf2.a;
        if (zIsEmpty) {
            this.b = qn0Var;
            this.c = qn0Var;
            return;
        }
        oh2 oh2Var = (oh2) ph2.b.a.get();
        oh2Var = oh2Var == null ? ph2.c : oh2Var;
        wf2.a(iy2Var);
        oh2Var.getClass();
        this.b = qn0Var;
        this.c = qn0Var;
    }

    @Override // defpackage.hv0
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        qn0 qn0Var = this.b;
        hz2 hz2Var = (hz2) this.a.h;
        try {
            byte[] bArr3 = hz2Var.c;
            byte[] bArrH = xp1.h(bArr3 == null ? null : Arrays.copyOf(bArr3, bArr3.length), ((hv0) hz2Var.b).a(bArr, bArr2));
            int i = hz2Var.f;
            qn0Var.getClass();
            return bArrH;
        } catch (GeneralSecurityException e) {
            qn0Var.getClass();
            throw e;
        }
    }

    @Override // defpackage.hv0
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        iy2 iy2Var = this.a;
        qn0 qn0Var = this.c;
        if (length > 5) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, 5);
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
            Iterator it = iy2Var.i(bArrCopyOf).iterator();
            while (it.hasNext()) {
                try {
                    byte[] bArrB = ((hv0) ((hz2) it.next()).b).b(bArrCopyOfRange, bArr2);
                    qn0Var.getClass();
                    return bArrB;
                } catch (GeneralSecurityException e) {
                    kv0.a.info("ciphertext prefix matches a key, but cannot decrypt: " + e);
                }
            }
        }
        Iterator it2 = iy2Var.i(py.d).iterator();
        while (it2.hasNext()) {
            try {
                byte[] bArrB2 = ((hv0) ((hz2) it2.next()).b).b(bArr, bArr2);
                qn0Var.getClass();
                return bArrB2;
            } catch (GeneralSecurityException unused) {
            }
        }
        qn0Var.getClass();
        m51.v("decryption failed");
        return null;
    }
}
