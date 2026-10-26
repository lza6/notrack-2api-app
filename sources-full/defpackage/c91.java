package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class c91 extends mq3 implements oe1 {
    public int c;
    public /* synthetic */ l81 d;
    public /* synthetic */ Object h;
    public final /* synthetic */ ne1 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c91(ne1 ne1Var, so0 so0Var) {
        super(3, so0Var);
        this.l = ne1Var;
    }

    @Override // defpackage.oe1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        c91 c91Var = new c91(this.l, (so0) obj3);
        c91Var.d = (l81) obj;
        c91Var.h = obj2;
        return c91Var.invokeSuspend(w84.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
    
        if (r0.emit(r6, r5) == r4) goto L15;
     */
    @Override // defpackage.wr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) throws java.lang.Throwable {
        /*
            r5 = this;
            int r0 = r5.c
            r1 = 0
            r2 = 2
            r3 = 1
            hq0 r4 = defpackage.hq0.c
            if (r0 == 0) goto L1d
            if (r0 == r3) goto L17
            if (r0 != r2) goto L11
            defpackage.g13.O(r6)
            goto L3c
        L11:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.u41.r(r5)
            return r1
        L17:
            l81 r0 = r5.d
            defpackage.g13.O(r6)
            goto L31
        L1d:
            defpackage.g13.O(r6)
            l81 r0 = r5.d
            java.lang.Object r6 = r5.h
            r5.d = r0
            r5.c = r3
            ne1 r3 = r5.l
            java.lang.Object r6 = r3.invoke(r6, r5)
            if (r6 != r4) goto L31
            goto L3b
        L31:
            r5.d = r1
            r5.c = r2
            java.lang.Object r5 = r0.emit(r6, r5)
            if (r5 != r4) goto L3c
        L3b:
            return r4
        L3c:
            w84 r5 = defpackage.w84.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c91.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
