package defpackage;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class kj4 extends r4 {
    public static kj4 q0(d5 d5Var, sz0 sz0Var, Integer num) throws GeneralSecurityException {
        nz nzVar = (nz) sz0Var.c;
        d5 d5Var2 = d5.O;
        if (d5Var != d5Var2 && num == null) {
            m51.q(d5Var, " the value of idRequirement must be non-null", "For given Variant ");
            return null;
        }
        if (d5Var == d5Var2 && num != null) {
            m51.v("For given Variant NO_PREFIX the value of idRequirement must be null");
            return null;
        }
        if (nzVar.a.length != 32) {
            throw new GeneralSecurityException("XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + nzVar.a.length);
        }
        if (d5Var == d5Var2) {
            nz.a(new byte[0]);
        } else if (d5Var == d5.N) {
            nz.a(ByteBuffer.allocate(5).put((byte) 0).putInt(num.intValue()).array());
        } else {
            if (d5Var != d5.M) {
                m51.A(d5Var, "Unknown Variant: ");
                return null;
            }
            nz.a(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        }
        return new kj4();
    }
}
