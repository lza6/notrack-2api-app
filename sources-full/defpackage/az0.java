package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class az0 extends mq3 implements ne1 {
    public final /* synthetic */ int c = 1;
    public q43 d;
    public q43 h;
    public int l;
    public /* synthetic */ Object m;
    public final /* synthetic */ bz0 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public az0(bz0 bz0Var, so0 so0Var) {
        super(2, so0Var);
        this.n = bz0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public az0(q43 q43Var, bz0 bz0Var, so0 so0Var) {
        super(2, so0Var);
        this.h = q43Var;
        this.n = bz0Var;
    }

    @Override // defpackage.wr
    public final so0 create(Object obj, so0 so0Var) {
        int i = this.c;
        bz0 bz0Var = this.n;
        switch (i) {
            case 0:
                az0 az0Var = new az0(this.h, bz0Var, so0Var);
                az0Var.m = obj;
                return az0Var;
            default:
                az0 az0Var2 = new az0(bz0Var, so0Var);
                az0Var2.m = obj;
                return az0Var2;
        }
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.c;
        w84 w84Var = w84.a;
        switch (i) {
            case 0:
                return ((az0) create((le1) obj, (so0) obj2)).invokeSuspend(w84Var);
            default:
                return ((az0) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003a A[PHI: r0 r3
  0x003a: PHI (r0v13 q43) = (r0v5 q43), (r0v17 q43) binds: [B:14:0x0037, B:37:0x00af] A[DONT_GENERATE, DONT_INLINE]
  0x003a: PHI (r3v15 gq0) = (r3v13 gq0), (r3v16 gq0) binds: [B:14:0x0037, B:37:0x00af] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x005e A[PHI: r7
  0x005e: PHI (r7v14 gq0) = (r7v7 gq0), (r7v10 gq0), (r7v10 gq0), (r7v10 gq0), (r7v12 gq0), (r7v15 gq0) binds: [B:19:0x0056, B:46:0x00cc, B:48:0x00d9, B:42:0x00c5, B:31:0x0089, B:12:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x0064  */
    /* JADX WARN: Code duplicated, block: B:24:0x006d  */
    /* JADX WARN: Code duplicated, block: B:27:0x007d  */
    /* JADX WARN: Code duplicated, block: B:32:0x008b  */
    /* JADX WARN: Code duplicated, block: B:35:0x009d  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ca A[Catch: CancellationException -> 0x00c8, TryCatch #2 {CancellationException -> 0x00c8, blocks: (B:39:0x00b2, B:41:0x00b8, B:45:0x00ca, B:47:0x00ce), top: B:85:0x00b2 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00ce A[Catch: CancellationException -> 0x00c8, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x00c8, blocks: (B:39:0x00b2, B:41:0x00b8, B:45:0x00ca, B:47:0x00ce), top: B:85:0x00b2 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0110  */
    /* JADX WARN: Code duplicated, block: B:89:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0089 -> B:20:0x005e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00c5 -> B:20:0x005e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00cc -> B:20:0x005e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00d9 -> B:20:0x005e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x00e7 -> B:12:0x002f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:75:0x0133 -> B:76:0x0134). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x0137 -> B:78:0x0139). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.wr
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.az0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
