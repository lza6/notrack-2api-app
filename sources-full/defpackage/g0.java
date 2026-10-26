package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class g0 implements sd2 {
    protected int memoizedHashCode;

    public abstract int b(za3 za3Var);

    public final String c(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    public abstract cf1 d();

    public final byte[] e() {
        try {
            int iB = ((ef1) this).b(null);
            byte[] bArr = new byte[iB];
            de0 de0Var = new de0(iB, bArr);
            f(de0Var);
            if (iB - de0Var.d == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            throw new RuntimeException(c("byte array"), e);
        }
    }

    public abstract void f(de0 de0Var);
}
