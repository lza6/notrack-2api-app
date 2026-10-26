package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ta0 extends mq3 implements ne1 {
    public final /* synthetic */ int c;
    public int d;
    public final /* synthetic */ mi2 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ta0(mi2 mi2Var, so0 so0Var, int i) {
        super(2, so0Var);
        this.c = i;
        this.h = mi2Var;
    }

    @Override // defpackage.wr
    public final so0 create(Object obj, so0 so0Var) {
        int i = this.c;
        mi2 mi2Var = this.h;
        switch (i) {
            case 0:
                return new ta0(mi2Var, so0Var, 0);
            case 1:
                return new ta0(mi2Var, so0Var, 1);
            default:
                return new ta0(mi2Var, so0Var, 2);
        }
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = this.c;
        w84 w84Var = w84.a;
        gq0 gq0Var = (gq0) obj;
        so0 so0Var = (so0) obj2;
        switch (i) {
            case 0:
                ((ta0) create(gq0Var, so0Var)).invokeSuspend(w84Var);
                return hq0.c;
            case 1:
                return ((ta0) create(gq0Var, so0Var)).invokeSuspend(w84Var);
            default:
                return ((ta0) create(gq0Var, so0Var)).invokeSuspend(w84Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0070  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x006e -> B:34:0x0072). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:32:0x0070
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.wr
    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            int r0 = r9.c
            w84 r1 = defpackage.w84.a
            r2 = 1200(0x4b0, double:5.93E-321)
            mi2 r4 = r9.h
            r5 = 0
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            hq0 r7 = defpackage.hq0.c
            r8 = 1
            switch(r0) {
                case 0: goto L55;
                case 1: goto L33;
                default: goto L11;
            }
        L11:
            int r0 = r9.d
            if (r0 == 0) goto L20
            if (r0 != r8) goto L1b
            defpackage.g13.O(r10)
            goto L2d
        L1b:
            defpackage.u41.r(r6)
            r1 = r5
            goto L32
        L20:
            defpackage.g13.O(r10)
            r9.d = r8
            java.lang.Object r9 = defpackage.p23.u(r2, r9)
            if (r9 != r7) goto L2d
            r1 = r7
            goto L32
        L2d:
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            r4.setValue(r9)
        L32:
            return r1
        L33:
            int r0 = r9.d
            if (r0 == 0) goto L42
            if (r0 != r8) goto L3d
            defpackage.g13.O(r10)
            goto L4f
        L3d:
            defpackage.u41.r(r6)
            r1 = r5
            goto L54
        L42:
            defpackage.g13.O(r10)
            r9.d = r8
            java.lang.Object r9 = defpackage.p23.u(r2, r9)
            if (r9 != r7) goto L4f
            r1 = r7
            goto L54
        L4f:
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            r4.setValue(r9)
        L54:
            return r1
        L55:
            int r0 = r9.d
            if (r0 == 0) goto L63
            if (r0 != r8) goto L5f
            defpackage.g13.O(r10)
            goto L72
        L5f:
            defpackage.u41.r(r6)
            goto L71
        L63:
            defpackage.g13.O(r10)
        L66:
            r9.d = r8
            r0 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r10 = defpackage.p23.u(r0, r9)
            if (r10 != r7) goto L72
            r5 = r7
        L71:
            return r5
        L72:
            java.lang.Object r10 = r4.getValue()
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            int r10 = r10 + r8
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r4.setValue(r10)
            goto L66
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ta0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
