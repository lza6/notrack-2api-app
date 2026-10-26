package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nc1 extends h63 implements ne1 {
    public final /* synthetic */ int d;
    public int h;
    public Object l;
    public Object m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nc1(Object obj, Object obj2, so0 so0Var, int i) {
        super(2, so0Var);
        this.d = i;
        this.m = obj;
        this.n = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nc1(Object obj, so0 so0Var, int i) {
        super(2, so0Var);
        this.d = i;
        this.n = obj;
    }

    @Override // defpackage.wr
    public final so0 create(Object obj, so0 so0Var) {
        int i = this.d;
        Object obj2 = this.n;
        switch (i) {
            case 0:
                nc1 nc1Var = new nc1((xp0) this.m, (ne1) obj2, so0Var, 0);
                nc1Var.l = obj;
                return nc1Var;
            case 1:
                nc1 nc1Var2 = new nc1((xt3) obj2, so0Var, 1);
                nc1Var2.l = obj;
                return nc1Var2;
            case 2:
                nc1 nc1Var3 = new nc1((j) obj2, so0Var, 2);
                nc1Var3.m = obj;
                return nc1Var3;
            case 3:
                nc1 nc1Var4 = new nc1((le3) this.m, (kd3) obj2, so0Var, 3);
                nc1Var4.l = obj;
                return nc1Var4;
            default:
                nc1 nc1Var5 = new nc1((zw2) this.m, (q43) obj2, so0Var, 4);
                nc1Var5.l = obj;
                return nc1Var5;
        }
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        w84 w84Var = w84.a;
        switch (i) {
            case 0:
                return ((nc1) create((rq3) obj, (so0) obj2)).invokeSuspend(w84Var);
            case 1:
                return ((nc1) create((rq3) obj, (so0) obj2)).invokeSuspend(w84Var);
            case 2:
                return ((nc1) create((qf3) obj, (so0) obj2)).invokeSuspend(w84Var);
            case 3:
                return ((nc1) create((rq3) obj, (so0) obj2)).invokeSuspend(w84Var);
            default:
                return ((nc1) create((rq3) obj, (so0) obj2)).invokeSuspend(w84Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:121:0x0233 A[Catch: CancellationException -> 0x0219, TRY_ENTER, TryCatch #1 {CancellationException -> 0x0219, blocks: (B:121:0x0233, B:124:0x0241, B:111:0x0214, B:116:0x0221), top: B:139:0x01f8 }] */
    /* JADX WARN: Code duplicated, block: B:123:0x0240  */
    /* JADX WARN: Code duplicated, block: B:124:0x0241 A[Catch: CancellationException -> 0x0219, PHI: r5
  0x0241: PHI (r5v3 rq3) = (r5v28 rq3), (r5v29 rq3) binds: [B:122:0x023e, B:116:0x0221] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #1 {CancellationException -> 0x0219, blocks: (B:121:0x0233, B:124:0x0241, B:111:0x0214, B:116:0x0221), top: B:139:0x01f8 }] */
    /* JADX WARN: Code duplicated, block: B:165:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:127:0x024a -> B:119:0x022d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:133:0x025c -> B:119:0x022d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00a8 -> B:34:0x00ac). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x016c -> B:75:0x016d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:90:0x01c4 -> B:92:0x01c8). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:123:0x0240
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.wr
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 622
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nc1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
