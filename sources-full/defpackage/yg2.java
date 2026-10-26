package defpackage;

import java.io.EOFException;
import java.util.List;
import java.util.regex.Pattern;
import okio.Options$Companion;

/* JADX INFO: loaded from: classes.dex */
public final class yg2 extends av1 {
    public static final ac2 n;
    public static final ac2 o;
    public static final byte[] p;
    public static final byte[] q;
    public static final byte[] r;
    public final lz j;
    public final List k;
    public final ac2 l;
    public long m;

    static {
        Pattern pattern = ac2.d;
        n = Options$Companion.get("multipart/mixed");
        Options$Companion.get("multipart/alternative");
        Options$Companion.get("multipart/digest");
        Options$Companion.get("multipart/parallel");
        o = Options$Companion.get("multipart/form-data");
        p = new byte[]{58, 32};
        q = new byte[]{13, 10};
        r = new byte[]{45, 45};
    }

    public yg2(lz lzVar, ac2 ac2Var, List list) {
        lzVar.getClass();
        ac2Var.getClass();
        this.j = lzVar;
        this.k = list;
        Pattern pattern = ac2.d;
        this.l = Options$Companion.get(ac2Var + "; boundary=" + lzVar.p());
        this.m = -1L;
    }

    @Override // defpackage.av1
    public final void Q(my myVar) throws EOFException {
        R(myVar, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long R(my myVar, boolean z) throws EOFException {
        dy dyVar;
        my dyVar2;
        if (z) {
            dyVar2 = new dy();
            dyVar = dyVar2;
        } else {
            dyVar = 0;
            dyVar2 = myVar;
        }
        List list = this.k;
        int size = list.size();
        long j = 0;
        int i = 0;
        while (true) {
            lz lzVar = this.j;
            byte[] bArr = r;
            byte[] bArr2 = q;
            if (i >= size) {
                dyVar2.getClass();
                dyVar2.write(bArr);
                dyVar2.e(lzVar);
                dyVar2.write(bArr);
                dyVar2.write(bArr2);
                if (!z) {
                    return j;
                }
                dyVar.getClass();
                long j2 = j + dyVar.d;
                dyVar.a();
                return j2;
            }
            xg2 xg2Var = (xg2) list.get(i);
            th1 th1Var = xg2Var.a;
            n53 n53Var = xg2Var.b;
            int i2 = n53Var.k;
            dyVar2.getClass();
            dyVar2.write(bArr);
            dyVar2.e(lzVar);
            dyVar2.write(bArr2);
            int size2 = th1Var.size();
            for (int i3 = 0; i3 < size2; i3++) {
                dyVar2.H(th1Var.d(i3)).write(p).H(th1Var.j(i3)).write(bArr2);
            }
            ac2 ac2Var = n53Var.j;
            if (ac2Var != null) {
                dyVar2.H("Content-Type: ").H(ac2Var.a).write(bArr2);
            }
            long j3 = i2;
            if (j3 != -1) {
                dyVar2.H("Content-Length: ").I(j3).write(bArr2);
            } else if (z) {
                dyVar.getClass();
                dyVar.a();
                return -1L;
            }
            dyVar2.write(bArr2);
            if (z) {
                j += j3;
            } else {
                dyVar2.E(i2, n53Var.l);
            }
            dyVar2.write(bArr2);
            i++;
        }
    }

    @Override // defpackage.av1
    public final long h() throws EOFException {
        long j = this.m;
        if (j != -1) {
            return j;
        }
        long jR = R(null, true);
        this.m = jR;
        return jR;
    }

    @Override // defpackage.av1
    public final ac2 i() {
        return this.l;
    }
}
