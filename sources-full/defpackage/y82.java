package defpackage;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class y82 implements jz2 {
    public static final Logger a = Logger.getLogger(y82.class.getName());
    public static final byte[] b = {0};
    public static final y82 c = new y82();

    @Override // defpackage.jz2
    public final Class a() {
        return u82.class;
    }

    @Override // defpackage.jz2
    public final Object b(iy2 iy2Var) throws GeneralSecurityException {
        Iterator it = ((ConcurrentMap) iy2Var.d).values().iterator();
        while (it.hasNext()) {
            for (hz2 hz2Var : (List) it.next()) {
                kr1 kr1Var = hz2Var.h;
                if (kr1Var instanceof w82) {
                    w82 w82Var = (w82) kr1Var;
                    byte[] bArr = hz2Var.c;
                    nz nzVarA = nz.a(bArr == null ? null : Arrays.copyOf(bArr, bArr.length));
                    if (!nzVarA.equals(w82Var.q0())) {
                        StringBuilder sb = new StringBuilder("Mac Key with parameters ");
                        sb.append(w82Var.r0());
                        nz nzVarQ0 = w82Var.q0();
                        sb.append(" has wrong output prefix (");
                        sb.append(nzVarQ0);
                        sb.append(") instead of (");
                        sb.append(nzVarA);
                        sb.append(")");
                        throw new GeneralSecurityException(sb.toString());
                    }
                }
            }
        }
        return new x82(iy2Var);
    }

    @Override // defpackage.jz2
    public final Class c() {
        return u82.class;
    }
}
