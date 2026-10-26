package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class en3 extends mq3 implements oe1 {
    public int c;
    public /* synthetic */ l81 d;
    public /* synthetic */ int h;
    public final /* synthetic */ fn3 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public en3(fn3 fn3Var, so0 so0Var) {
        super(3, so0Var);
        this.l = fn3Var;
    }

    @Override // defpackage.oe1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj2).intValue();
        en3 en3Var = new en3(this.l, (so0) obj3);
        en3Var.d = (l81) obj;
        en3Var.h = iIntValue;
        return en3Var.invokeSuspend(w84.a);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0061 A[PHI: r0
  0x0061: PHI (r0v3 l81) = (r0v2 l81), (r0v6 l81) binds: [B:25:0x005e, B:13:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
    
        if (r0.emit(defpackage.ch3.c, r8) == r7) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007b, code lost:
    
        if (r0.emit(defpackage.ch3.h, r8) == r7) goto L32;
     */
    @Override // defpackage.wr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            int r0 = r8.c
            r1 = 0
            r2 = 5
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            hq0 r7 = defpackage.hq0.c
            if (r0 == 0) goto L33
            if (r0 == r6) goto L2f
            if (r0 == r5) goto L29
            if (r0 == r4) goto L23
            if (r0 == r3) goto L1d
            if (r0 != r2) goto L17
            goto L2f
        L17:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.u41.r(r8)
            return r1
        L1d:
            l81 r0 = r8.d
            defpackage.g13.O(r9)
            goto L71
        L23:
            l81 r0 = r8.d
            defpackage.g13.O(r9)
            goto L61
        L29:
            l81 r0 = r8.d
            defpackage.g13.O(r9)
            goto L54
        L2f:
            defpackage.g13.O(r9)
            goto L7e
        L33:
            defpackage.g13.O(r9)
            l81 r0 = r8.d
            int r9 = r8.h
            if (r9 <= 0) goto L47
            r8.c = r6
            ch3 r9 = defpackage.ch3.c
            java.lang.Object r8 = r0.emit(r9, r8)
            if (r8 != r7) goto L7e
            goto L7d
        L47:
            r8.d = r0
            r8.c = r5
            r5 = 0
            java.lang.Object r9 = defpackage.p23.u(r5, r8)
            if (r9 != r7) goto L54
            goto L7d
        L54:
            r8.d = r0
            r8.c = r4
            ch3 r9 = defpackage.ch3.d
            java.lang.Object r9 = r0.emit(r9, r8)
            if (r9 != r7) goto L61
            goto L7d
        L61:
            r8.d = r0
            r8.c = r3
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.Object r9 = defpackage.p23.u(r3, r8)
            if (r9 != r7) goto L71
            goto L7d
        L71:
            r8.d = r1
            r8.c = r2
            ch3 r9 = defpackage.ch3.h
            java.lang.Object r8 = r0.emit(r9, r8)
            if (r8 != r7) goto L7e
        L7d:
            return r7
        L7e:
            w84 r8 = defpackage.w84.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.en3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
