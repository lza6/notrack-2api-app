package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zn0 extends h63 implements ne1 {
    public final /* synthetic */ int d;
    public int h;
    public /* synthetic */ Object l;
    public final /* synthetic */ le1 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zn0(le1 le1Var, so0 so0Var, int i) {
        super(2, so0Var);
        this.d = i;
        this.m = le1Var;
    }

    @Override // defpackage.wr
    public final so0 create(Object obj, so0 so0Var) {
        switch (this.d) {
            case 0:
                zn0 zn0Var = new zn0(this.m, so0Var, 0);
                zn0Var.l = obj;
                return zn0Var;
            default:
                zn0 zn0Var2 = new zn0(this.m, so0Var, 1);
                zn0Var2.l = obj;
                return zn0Var2;
        }
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = this.d;
        w84 w84Var = w84.a;
        rq3 rq3Var = (rq3) obj;
        so0 so0Var = (so0) obj2;
        switch (i) {
            case 0:
                return ((zn0) create(rq3Var, so0Var)).invokeSuspend(w84Var);
            default:
                ((zn0) create(rq3Var, so0Var)).invokeSuspend(w84Var);
                return hq0.c;
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0091  */
    /* JADX WARN: Code duplicated, block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0032 -> B:13:0x0035). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:4:0x000d
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.wr
    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            int r0 = r9.d
            le1 r1 = r9.m
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            hq0 r3 = defpackage.hq0.c
            r4 = 1
            r5 = 0
            switch(r0) {
                case 0: goto L44;
                default: goto Ld;
            }
        Ld:
            int r0 = r9.h
            if (r0 == 0) goto L20
            if (r0 != r4) goto L1b
            java.lang.Object r0 = r9.l
            rq3 r0 = (defpackage.rq3) r0
            defpackage.g13.O(r10)
            goto L35
        L1b:
            defpackage.u41.r(r2)
            r3 = r5
            goto L34
        L20:
            defpackage.g13.O(r10)
            java.lang.Object r10 = r9.l
            rq3 r10 = (defpackage.rq3) r10
            r0 = r10
        L28:
            r9.l = r0
            r9.h = r4
            zw2 r10 = defpackage.zw2.c
            java.lang.Object r10 = r0.a(r10, r9)
            if (r10 != r3) goto L35
        L34:
            return r3
        L35:
            yw2 r10 = (defpackage.yw2) r10
            boolean r10 = defpackage.g13.D(r10)
            r10 = r10 ^ r4
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r1.invoke(r10)
            goto L28
        L44:
            int r0 = r9.h
            r6 = 2
            if (r0 == 0) goto L5e
            if (r0 == r4) goto L56
            if (r0 != r6) goto L51
            defpackage.g13.O(r10)
            goto L8d
        L51:
            defpackage.u41.r(r2)
            r3 = r5
            goto L96
        L56:
            java.lang.Object r0 = r9.l
            rq3 r0 = (defpackage.rq3) r0
            defpackage.g13.O(r10)
            goto L71
        L5e:
            defpackage.g13.O(r10)
            java.lang.Object r10 = r9.l
            r0 = r10
            rq3 r0 = (defpackage.rq3) r0
            r9.l = r0
            r9.h = r4
            java.lang.Object r10 = defpackage.kr1.c(r0, r9)
            if (r10 != r3) goto L71
            goto L96
        L71:
            dx2 r10 = (defpackage.dx2) r10
            r10.a()
            long r7 = r10.c
            ln2 r10 = new ln2
            r10.<init>(r7)
            r1.invoke(r10)
            r9.l = r5
            r9.h = r6
            zw2 r10 = defpackage.zw2.d
            java.lang.Object r10 = defpackage.os3.j(r0, r10, r9)
            if (r10 != r3) goto L8d
            goto L96
        L8d:
            dx2 r10 = (defpackage.dx2) r10
            if (r10 == 0) goto L94
            r10.a()
        L94:
            w84 r3 = defpackage.w84.a
        L96:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zn0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
