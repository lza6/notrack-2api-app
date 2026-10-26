package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class p10 extends mq3 implements ne1 {
    public int c;
    public final /* synthetic */ kx d;
    public final /* synthetic */ float h;
    public final /* synthetic */ mi2 l;
    public final /* synthetic */ fh2 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p10(kx kxVar, float f, mi2 mi2Var, fh2 fh2Var, so0 so0Var) {
        super(2, so0Var);
        this.d = kxVar;
        this.h = f;
        this.l = mi2Var;
        this.m = fh2Var;
    }

    @Override // defpackage.wr
    public final so0 create(Object obj, so0 so0Var) {
        return new p10(this.d, this.h, this.l, this.m, so0Var);
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        return ((p10) create((gq0) obj, (so0) obj2)).invokeSuspend(w84.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:
    
        if (((defpackage.mx) r6.d).a(r7, r6) == r3) goto L17;
     */
    @Override // defpackage.wr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            int r0 = r6.c
            r1 = 2
            r2 = 1
            hq0 r3 = defpackage.hq0.c
            if (r0 == 0) goto L1b
            if (r0 == r2) goto L17
            if (r0 != r1) goto L10
            defpackage.g13.O(r7)
            goto L58
        L10:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.u41.r(r6)
            r6 = 0
            return r6
        L17:
            defpackage.g13.O(r7)
            goto L37
        L1b:
            defpackage.g13.O(r7)
            mi2 r7 = r6.l
            java.lang.Object r7 = r7.getValue()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L58
            r6.c = r2
            r4 = 60
            java.lang.Object r7 = defpackage.p23.u(r4, r6)
            if (r7 != r3) goto L37
            goto L57
        L37:
            h43 r7 = new h43
            fh2 r0 = r6.m
            ct2 r0 = (defpackage.ct2) r0
            int r0 = r0.f()
            float r0 = (float) r0
            float r2 = r6.h
            float r0 = r0 + r2
            r2 = 0
            r4 = 1065353216(0x3f800000, float:1.0)
            r7.<init>(r2, r2, r4, r0)
            r6.c = r1
            kx r0 = r6.d
            mx r0 = (defpackage.mx) r0
            java.lang.Object r6 = r0.a(r7, r6)
            if (r6 != r3) goto L58
        L57:
            return r3
        L58:
            w84 r6 = defpackage.w84.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p10.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
