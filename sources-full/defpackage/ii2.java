package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ii2 extends h63 implements ne1 {
    public gf1 d;
    public ji2 h;
    public long[] l;
    public int m;
    public int n;
    public int o;
    public int p;
    public long q;
    public int r;
    public /* synthetic */ Object s;
    public final /* synthetic */ ji2 t;
    public final /* synthetic */ gf1 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ii2(ji2 ji2Var, gf1 gf1Var, so0 so0Var) {
        super(2, so0Var);
        this.t = ji2Var;
        this.u = gf1Var;
    }

    @Override // defpackage.wr
    public final so0 create(Object obj, so0 so0Var) {
        ii2 ii2Var = new ii2(this.t, this.u, so0Var);
        ii2Var.s = obj;
        return ii2Var;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        return ((ii2) create((qf3) obj, (so0) obj2)).invokeSuspend(w84.a);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0051  */
    /* JADX WARN: Code duplicated, block: B:20:0x0097 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0099  */
    /* JADX WARN: Code duplicated, block: B:23:0x00a1  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x004f -> B:22:0x009f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0051 -> B:14:0x0064). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x006d -> B:19:0x0094). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.wr
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            int r1 = r0.r
            r2 = 0
            r3 = 8
            r4 = 1
            if (r1 == 0) goto L2c
            if (r1 != r4) goto L25
            int r1 = r0.p
            int r5 = r0.o
            long r6 = r0.q
            int r8 = r0.n
            int r9 = r0.m
            long[] r10 = r0.l
            ji2 r11 = r0.h
            gf1 r12 = r0.d
            java.lang.Object r13 = r0.s
            qf3 r13 = (defpackage.qf3) r13
            defpackage.g13.O(r21)
            goto L94
        L25:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.u41.r(r0)
            r0 = 0
            return r0
        L2c:
            defpackage.g13.O(r21)
            java.lang.Object r1 = r0.s
            qf3 r1 = (defpackage.qf3) r1
            ji2 r5 = r0.t
            gi2 r6 = r5.d
            long[] r6 = r6.a
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto La4
            gf1 r8 = r0.u
            r9 = r2
        L41:
            r10 = r6[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L9f
            int r12 = r9 - r7
            int r12 = ~r12
            int r12 = r12 >>> 31
            int r12 = 8 - r12
            r13 = r1
            r1 = r2
            r18 = r10
            r11 = r5
            r10 = r6
            r5 = r12
            r12 = r8
            r8 = r9
            r9 = r7
            r6 = r18
        L64:
            if (r1 >= r5) goto L97
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r6
            r16 = 128(0x80, double:6.32E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L94
            int r2 = r8 << 3
            int r2 = r2 + r1
            r12.d = r2
            gi2 r3 = r11.d
            java.lang.Object[] r3 = r3.b
            r2 = r3[r2]
            r0.s = r13
            r0.d = r12
            r0.h = r11
            r0.l = r10
            r0.m = r9
            r0.n = r8
            r0.q = r6
            r0.o = r5
            r0.p = r1
            r0.r = r4
            r13.b(r0, r2)
            hq0 r0 = defpackage.hq0.c
            return r0
        L94:
            long r6 = r6 >> r3
            int r1 = r1 + r4
            goto L64
        L97:
            if (r5 != r3) goto La4
            r7 = r9
            r6 = r10
            r5 = r11
            r1 = r13
            r9 = r8
            r8 = r12
        L9f:
            if (r9 == r7) goto La4
            int r9 = r9 + 1
            goto L41
        La4:
            w84 r0 = defpackage.w84.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ii2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
