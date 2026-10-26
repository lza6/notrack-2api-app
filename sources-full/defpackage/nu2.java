package defpackage;

import okio.c;

/* JADX INFO: loaded from: classes.dex */
public final class nu2 implements wl3 {
    public final ny c;
    public final dy d;
    public uc3 h;
    public int l;
    public boolean m;
    public long n;

    public nu2(ny nyVar) {
        this.c = nyVar;
        dy dyVarQ = nyVar.q();
        this.d = dyVarQ;
        uc3 uc3Var = dyVarQ.c;
        this.h = uc3Var;
        this.l = uc3Var != null ? uc3Var.b : -1;
    }

    @Override // defpackage.wl3
    public final c b() {
        return this.c.b();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.m = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        if (r3 == r5.b) goto L15;
     */
    @Override // defpackage.wl3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long y(defpackage.dy r9, long r10) {
        /*
            r8 = this;
            r9.getClass()
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 < 0) goto L65
            boolean r3 = r8.m
            if (r3 != 0) goto L5f
            uc3 r3 = r8.h
            dy r4 = r8.d
            if (r3 == 0) goto L27
            uc3 r5 = r4.c
            if (r3 != r5) goto L21
            int r3 = r8.l
            r5.getClass()
            int r5 = r5.b
            if (r3 != r5) goto L21
            goto L27
        L21:
            java.lang.String r8 = "Peek source is invalid because upstream source was used"
            defpackage.u41.r(r8)
            return r0
        L27:
            if (r2 != 0) goto L2a
            return r0
        L2a:
            long r0 = r8.n
            r2 = 1
            long r0 = r0 + r2
            ny r2 = r8.c
            boolean r0 = r2.j(r0)
            if (r0 != 0) goto L3a
            r8 = -1
            return r8
        L3a:
            uc3 r0 = r8.h
            if (r0 != 0) goto L48
            uc3 r0 = r4.c
            if (r0 == 0) goto L48
            r8.h = r0
            int r0 = r0.b
            r8.l = r0
        L48:
            long r0 = r4.d
            long r2 = r8.n
            long r0 = r0 - r2
            long r6 = java.lang.Math.min(r10, r0)
            dy r2 = r8.d
            long r4 = r8.n
            r3 = r9
            r2.h(r3, r4, r6)
            long r9 = r8.n
            long r9 = r9 + r6
            r8.n = r9
            return r6
        L5f:
            java.lang.String r8 = "closed"
            defpackage.u41.r(r8)
            return r0
        L65:
            java.lang.String r8 = "byteCount < 0: "
            java.lang.String r8 = defpackage.ud2.o(r8, r10)
            defpackage.u41.h(r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nu2.y(dy, long):long");
    }
}
