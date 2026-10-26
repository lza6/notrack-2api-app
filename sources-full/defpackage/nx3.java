package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nx3 extends mq3 implements ne1 {
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ py2 h;
    public final /* synthetic */ wx3 l;
    public final /* synthetic */ long m;
    public final /* synthetic */ gh2 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nx3(py2 py2Var, wx3 wx3Var, long j, gh2 gh2Var, so0 so0Var) {
        super(2, so0Var);
        this.h = py2Var;
        this.l = wx3Var;
        this.m = j;
        this.n = gh2Var;
    }

    @Override // defpackage.wr
    public final so0 create(Object obj, so0 so0Var) {
        nx3 nx3Var = new nx3(this.h, this.l, this.m, this.n, so0Var);
        nx3Var.d = obj;
        return nx3Var;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        return ((nx3) create((gq0) obj, (so0) obj2)).invokeSuspend(w84.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0061, code lost:
    
        if (((defpackage.hh2) r13.n).a(r14, r13) == r5) goto L20;
     */
    @Override // defpackage.wr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
        /*
            r13 = this;
            int r0 = r13.c
            r1 = 0
            wx3 r2 = r13.l
            r3 = 2
            r4 = 1
            hq0 r5 = defpackage.hq0.c
            if (r0 == 0) goto L1d
            if (r0 == r4) goto L19
            if (r0 != r3) goto L13
            defpackage.g13.O(r14)
            goto L64
        L13:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.u41.r(r13)
            return r1
        L19:
            defpackage.g13.O(r14)
            goto L40
        L1d:
            defpackage.g13.O(r14)
            java.lang.Object r14 = r13.d
            gq0 r14 = (defpackage.gq0) r14
            m r6 = new m
            r11 = 0
            r12 = 3
            wx3 r7 = r13.l
            long r8 = r13.m
            gh2 r10 = r13.n
            r6.<init>(r7, r8, r10, r11, r12)
            r0 = 3
            defpackage.py.F(r14, r1, r1, r6, r0)
            r13.c = r4
            py2 r14 = r13.h
            java.lang.Object r14 = r14.d(r13)
            if (r14 != r5) goto L40
            goto L63
        L40:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            ry2 r0 = r2.v
            if (r0 == 0) goto L64
            if (r14 == 0) goto L52
            sy2 r14 = new sy2
            r14.<init>(r0)
            goto L57
        L52:
            qy2 r14 = new qy2
            r14.<init>(r0)
        L57:
            r13.c = r3
            gh2 r0 = r13.n
            hh2 r0 = (defpackage.hh2) r0
            java.lang.Object r13 = r0.a(r14, r13)
            if (r13 != r5) goto L64
        L63:
            return r5
        L64:
            r2.v = r1
            w84 r13 = defpackage.w84.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nx3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
