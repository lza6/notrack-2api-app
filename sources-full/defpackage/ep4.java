package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class ep4 {
    protected transient int zza;

    public abstract void a(bk bkVar);

    public final byte[] b() {
        try {
            int iD = d();
            byte[] bArr = new byte[iD];
            bk bkVar = new bk(iD, bArr);
            a(bkVar);
            int i = bkVar.b;
            int i2 = bkVar.c;
            if (i - i2 > 0) {
                u41.r("Did not write as much data as expected.");
            } else if (i - i2 < 0) {
                u41.r("Wrote more data than expected.");
            }
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException(fq2.n("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e);
        }
    }

    public abstract int c(jq4 jq4Var);

    public abstract int d();
}
