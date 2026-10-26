package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class tk3 extends h63 implements ne1 {
    public long[] d;
    public int h;
    public int l;
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ uk3 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tk3(uk3 uk3Var, so0 so0Var) {
        super(2, so0Var);
        this.o = uk3Var;
    }

    @Override // defpackage.wr
    public final so0 create(Object obj, so0 so0Var) {
        tk3 tk3Var = new tk3(this.o, so0Var);
        tk3Var.n = obj;
        return tk3Var;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        return ((tk3) create((qf3) obj, (so0) obj2)).invokeSuspend(w84.a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0078  */
    /* JADX WARN: Code duplicated, block: B:24:0x0080  */
    /* JADX WARN: Code duplicated, block: B:27:0x0095  */
    /* JADX WARN: Code duplicated, block: B:30:0x009a  */
    /* JADX WARN: Code duplicated, block: B:32:0x009e  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:36:0x00bc  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x007e -> B:26:0x0093). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00bc -> B:37:0x00be). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:27:0x0095
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.wr
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            r22 = this;
            r0 = r22
            uk3 r1 = r0.o
            long r2 = r1.c
            long r4 = r1.h
            long r6 = r1.d
            int r8 = r0.m
            r9 = 0
            r12 = 64
            r13 = 3
            r14 = 2
            r16 = 0
            r18 = 1
            r10 = 1
            hq0 r11 = defpackage.hq0.c
            if (r8 == 0) goto L4b
            if (r8 == r10) goto L3c
            if (r8 == r14) goto L32
            if (r8 != r13) goto L2c
            int r1 = r0.h
            java.lang.Object r6 = r0.n
            qf3 r6 = (defpackage.qf3) r6
            defpackage.g13.O(r23)
            r7 = r13
            goto Lbe
        L2c:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.u41.r(r0)
            return r9
        L32:
            int r1 = r0.h
            java.lang.Object r8 = r0.n
            qf3 r8 = (defpackage.qf3) r8
            defpackage.g13.O(r23)
            goto L93
        L3c:
            int r1 = r0.l
            int r8 = r0.h
            long[] r15 = r0.d
            java.lang.Object r13 = r0.n
            qf3 r13 = (defpackage.qf3) r13
            defpackage.g13.O(r23)
            int r8 = r8 + r10
            goto L59
        L4b:
            defpackage.g13.O(r23)
            java.lang.Object r8 = r0.n
            r13 = r8
            qf3 r13 = (defpackage.qf3) r13
            long[] r15 = r1.l
            if (r15 == 0) goto L70
            int r1 = r15.length
            r8 = 0
        L59:
            if (r8 >= r1) goto L70
            r2 = r15[r8]
            java.lang.Long r4 = new java.lang.Long
            r4.<init>(r2)
            r0.n = r13
            r0.d = r15
            r0.h = r8
            r0.l = r1
            r0.m = r10
            r13.b(r0, r4)
            return r11
        L70:
            int r1 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r1 == 0) goto L96
            r8 = r13
            r1 = 0
        L76:
            if (r1 >= r12) goto L95
            long r20 = r18 << r1
            long r20 = r6 & r20
            int r13 = (r20 > r16 ? 1 : (r20 == r16 ? 0 : -1))
            if (r13 == 0) goto L93
            long r2 = (long) r1
            long r4 = r4 + r2
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r4)
            r0.n = r8
            r0.d = r9
            r0.h = r1
            r0.m = r14
            r8.b(r0, r2)
            return r11
        L93:
            int r1 = r1 + r10
            goto L76
        L95:
            r13 = r8
        L96:
            int r1 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r1 == 0) goto Lc1
            r6 = r13
            r15 = 0
        L9c:
            if (r15 >= r12) goto Lc1
            long r7 = r18 << r15
            long r7 = r7 & r2
            int r1 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r1 == 0) goto Lbc
            long r1 = (long) r15
            long r4 = r4 + r1
            r1 = 64
            long r4 = r4 + r1
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r4)
            r0.n = r6
            r0.d = r9
            r0.h = r15
            r7 = 3
            r0.m = r7
            r6.b(r0, r1)
            return r11
        Lbc:
            r7 = 3
            r1 = r15
        Lbe:
            int r15 = r1 + 1
            goto L9c
        Lc1:
            w84 r0 = defpackage.w84.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tk3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
