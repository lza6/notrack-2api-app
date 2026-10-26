package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wj2 extends mq3 implements ne1 {
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ e01 h;
    public final /* synthetic */ gq0 l;
    public final /* synthetic */ h01 m;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ n43 o;
    public final /* synthetic */ n43 p;
    public final /* synthetic */ n43 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wj2(e01 e01Var, gq0 gq0Var, h01 h01Var, boolean z, n43 n43Var, n43 n43Var2, n43 n43Var3, so0 so0Var) {
        super(2, so0Var);
        this.h = e01Var;
        this.l = gq0Var;
        this.m = h01Var;
        this.n = z;
        this.o = n43Var;
        this.p = n43Var2;
        this.q = n43Var3;
    }

    @Override // defpackage.wr
    public final so0 create(Object obj, so0 so0Var) {
        wj2 wj2Var = new wj2(this.h, this.l, this.m, this.n, this.o, this.p, this.q, so0Var);
        wj2Var.d = obj;
        return wj2Var;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        return ((wj2) create((k81) obj, (so0) obj2)).invokeSuspend(w84.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x006e, code lost:
    
        if (r8.b(r18) == r11) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0097, code lost:
    
        if (r8.b(r18) == r11) goto L40;
     */
    @Override // defpackage.wr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) throws java.lang.Throwable {
        /*
            r18 = this;
            r1 = r18
            int r0 = r1.c
            r2 = 12
            gq0 r3 = r1.l
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            h01 r8 = r1.m
            r9 = 0
            e01 r10 = r1.h
            hq0 r11 = defpackage.hq0.c
            if (r0 == 0) goto L36
            if (r0 == r7) goto L30
            if (r0 == r6) goto L2c
            if (r0 == r5) goto L2c
            if (r0 == r4) goto L23
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.u41.r(r0)
            return r9
        L23:
            java.lang.Object r0 = r1.d
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            defpackage.g13.O(r19)
            goto Lb7
        L2c:
            defpackage.g13.O(r19)
            goto L9a
        L30:
            defpackage.g13.O(r19)     // Catch: java.lang.Throwable -> L34 java.util.concurrent.CancellationException -> L71
            goto L59
        L34:
            r0 = move-exception
            goto L9d
        L36:
            defpackage.g13.O(r19)
            java.lang.Object r0 = r1.d
            k81 r0 = (defpackage.k81) r0
            vj2 r12 = new vj2     // Catch: java.lang.Throwable -> L34 java.util.concurrent.CancellationException -> L71
            e01 r13 = r1.h     // Catch: java.lang.Throwable -> L34 java.util.concurrent.CancellationException -> L71
            boolean r14 = r1.n     // Catch: java.lang.Throwable -> L34 java.util.concurrent.CancellationException -> L71
            n43 r15 = r1.o     // Catch: java.lang.Throwable -> L34 java.util.concurrent.CancellationException -> L71
            n43 r4 = r1.p     // Catch: java.lang.Throwable -> L34 java.util.concurrent.CancellationException -> L71
            n43 r6 = r1.q     // Catch: java.lang.Throwable -> L34 java.util.concurrent.CancellationException -> L71
            r16 = r4
            r17 = r6
            r12.<init>(r13, r14, r15, r16, r17)     // Catch: java.lang.Throwable -> L34 java.util.concurrent.CancellationException -> L71
            r1.c = r7     // Catch: java.lang.Throwable -> L34 java.util.concurrent.CancellationException -> L71
            java.lang.Object r0 = r0.a(r12, r1)     // Catch: java.lang.Throwable -> L34 java.util.concurrent.CancellationException -> L71
            if (r0 != r11) goto L59
            goto Lb6
        L59:
            boolean r0 = r10.a()
            if (r0 == 0) goto L67
            f60 r0 = new f60
            r0.<init>(r10, r9, r2)
            defpackage.py.F(r3, r9, r9, r0, r5)
        L67:
            r0 = 2
            r1.c = r0
            java.lang.Object r0 = r8.b(r1)
            if (r0 != r11) goto L9a
            goto Lb6
        L71:
            ft2 r0 = r10.a     // Catch: java.lang.Throwable -> L34
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L34
            r0.setValue(r4)     // Catch: java.lang.Throwable -> L34
            bt2 r0 = r10.b     // Catch: java.lang.Throwable -> L34
            r4 = 0
            r0.h(r4)     // Catch: java.lang.Throwable -> L34
            bt2 r0 = r10.c     // Catch: java.lang.Throwable -> L34
            r0.h(r4)     // Catch: java.lang.Throwable -> L34
            boolean r0 = r10.a()
            if (r0 == 0) goto L91
            f60 r0 = new f60
            r0.<init>(r10, r9, r2)
            defpackage.py.F(r3, r9, r9, r0, r5)
        L91:
            r1.c = r5
            java.lang.Object r0 = r8.b(r1)
            if (r0 != r11) goto L9a
            goto Lb6
        L9a:
            w84 r0 = defpackage.w84.a
            return r0
        L9d:
            boolean r4 = r10.a()
            if (r4 == 0) goto Lab
            f60 r4 = new f60
            r4.<init>(r10, r9, r2)
            defpackage.py.F(r3, r9, r9, r4, r5)
        Lab:
            r1.d = r0
            r2 = 4
            r1.c = r2
            java.lang.Object r1 = r8.b(r1)
            if (r1 != r11) goto Lb7
        Lb6:
            return r11
        Lb7:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wj2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
