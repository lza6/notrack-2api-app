package defpackage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class vj1 extends tj1 {
    public final tk1 l;
    public long m;
    public boolean n;
    public final /* synthetic */ yj1 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vj1(yj1 yj1Var, tk1 tk1Var) {
        super(yj1Var);
        tk1Var.getClass();
        this.o = yj1Var;
        this.l = tk1Var;
        this.m = -1L;
        this.n = true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean zT;
        if (this.d) {
            return;
        }
        if (this.n) {
            byte[] bArr = ka4.a;
            TimeUnit.MILLISECONDS.getClass();
            try {
                zT = ka4.t(this, 100);
            } catch (IOException unused) {
                zT = false;
            }
            if (!zT) {
                this.o.b.k();
                a();
            }
        }
        this.d = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0078, code lost:
    
        if (r11.n == false) goto L27;
     */
    @Override // defpackage.tj1, defpackage.wl3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long y(defpackage.dy r12, long r13) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vj1.y(dy, long):long");
    }
}
