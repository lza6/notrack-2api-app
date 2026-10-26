package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class be3 extends h63 implements ne1 {
    public final /* synthetic */ int d = 0;
    public long h;
    public int l;
    public /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public be3(long j, p43 p43Var, so0 so0Var) {
        super(2, so0Var);
        this.h = j;
        this.n = p43Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public be3(dx2 dx2Var, so0 so0Var) {
        super(2, so0Var);
        this.n = dx2Var;
    }

    @Override // defpackage.wr
    public final so0 create(Object obj, so0 so0Var) {
        int i = this.d;
        Object obj2 = this.n;
        switch (i) {
            case 0:
                be3 be3Var = new be3(this.h, (p43) obj2, so0Var);
                be3Var.m = obj;
                return be3Var;
            default:
                be3 be3Var2 = new be3((dx2) obj2, so0Var);
                be3Var2.m = obj;
                return be3Var2;
        }
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        w84 w84Var = w84.a;
        rq3 rq3Var = (rq3) obj;
        so0 so0Var = (so0) obj2;
        switch (i) {
            case 0:
                break;
        }
        return ((be3) create(rq3Var, so0Var)).invokeSuspend(w84Var);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0044  */
    /* JADX WARN: Code duplicated, block: B:15:0x004e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0042 -> B:13:0x0046). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:12:0x0044
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.wr
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.d
            java.lang.Object r1 = r9.n
            r2 = 0
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            hq0 r4 = defpackage.hq0.c
            r5 = 1
            switch(r0) {
                case 0: goto L50;
                default: goto Ld;
            }
        Ld:
            int r0 = r9.l
            if (r0 == 0) goto L21
            if (r0 != r5) goto L1d
            long r0 = r9.h
            java.lang.Object r2 = r9.m
            rq3 r2 = (defpackage.rq3) r2
            defpackage.g13.O(r10)
            goto L46
        L1d:
            defpackage.u41.r(r3)
            goto L4f
        L21:
            defpackage.g13.O(r10)
            java.lang.Object r10 = r9.m
            rq3 r10 = (defpackage.rq3) r10
            dx2 r1 = (defpackage.dx2) r1
            long r0 = r1.b
            androidx.compose.ui.platform.ViewConfiguration r2 = r10.i()
            long r2 = r2.getDoubleTapMinTimeMillis()
            long r2 = r2 + r0
            r0 = r2
            r2 = r10
        L37:
            r9.m = r2
            r9.h = r0
            r9.l = r5
            r10 = 3
            java.lang.Object r10 = defpackage.os3.c(r2, r9, r10)
            if (r10 != r4) goto L46
            r2 = r4
            goto L4f
        L46:
            dx2 r10 = (defpackage.dx2) r10
            long r6 = r10.b
            int r3 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r3 < 0) goto L37
            r2 = r10
        L4f:
            return r2
        L50:
            p43 r1 = (defpackage.p43) r1
            int r0 = r9.l
            if (r0 == 0) goto L64
            if (r0 != r5) goto L60
            java.lang.Object r9 = r9.m
            rq3 r9 = (defpackage.rq3) r9
            defpackage.g13.O(r10)
            goto L83
        L60:
            defpackage.u41.r(r3)
            goto Lb5
        L64:
            defpackage.g13.O(r10)
            java.lang.Object r10 = r9.m
            rq3 r10 = (defpackage.rq3) r10
            long r2 = r9.h
            ea r0 = new ea
            r6 = 12
            r0.<init>(r6, r1)
            r9.m = r10
            r9.l = r5
            java.lang.Object r9 = defpackage.uy0.e(r10, r2, r0, r9)
            if (r9 != r4) goto L80
            r2 = r4
            goto Lb5
        L80:
            r8 = r10
            r10 = r9
            r9 = r8
        L83:
            dx2 r10 = (defpackage.dx2) r10
            if (r10 == 0) goto L9b
            long r0 = r1.c
            r2 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            long r0 = r0 & r2
            r2 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r10 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r10 == 0) goto L9b
            px0 r2 = defpackage.px0.d
            goto Lb5
        L9b:
            sq3 r9 = r9.n
            yw2 r9 = r9.n
            java.util.List r9 = r9.a
            java.lang.Object r9 = defpackage.ke0.y0(r9)
            dx2 r9 = (defpackage.dx2) r9
            boolean r10 = defpackage.py.u(r9)
            if (r10 == 0) goto Lb3
            r9.a()
            px0 r2 = defpackage.px0.c
            goto Lb5
        Lb3:
            px0 r2 = defpackage.px0.l
        Lb5:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.be3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
