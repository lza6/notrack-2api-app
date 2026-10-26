package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class v31 extends mq3 implements ne1 {
    public final /* synthetic */ int c = 3;
    public int d;
    public Object h;
    public /* synthetic */ Object l;
    public Object m;
    public final /* synthetic */ Object n;
    public Object o;
    public Object p;
    public Object q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v31(je1 je1Var, so0 so0Var) {
        super(2, so0Var);
        this.n = je1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v31(ri2 ri2Var, br1 br1Var, le1 le1Var, so0 so0Var) {
        super(2, so0Var);
        this.q = ri2Var;
        this.l = br1Var;
        this.n = le1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v31(y31 y31Var, pm1 pm1Var, Object obj, jq2 jq2Var, bg1 bg1Var, cc2 cc2Var, j33 j33Var, so0 so0Var) {
        super(2, so0Var);
        this.h = y31Var;
        this.l = pm1Var;
        this.m = obj;
        this.o = jq2Var;
        this.n = bg1Var;
        this.p = cc2Var;
        this.q = j33Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v31(y31 y31Var, q43 q43Var, q43 q43Var2, pm1 pm1Var, Object obj, q43 q43Var3, bg1 bg1Var, so0 so0Var) {
        super(2, so0Var);
        this.h = y31Var;
        this.o = q43Var;
        this.p = q43Var2;
        this.l = pm1Var;
        this.m = obj;
        this.q = q43Var3;
        this.n = bg1Var;
    }

    @Override // defpackage.wr
    public final so0 create(Object obj, so0 so0Var) {
        int i = this.c;
        Object obj2 = this.n;
        switch (i) {
            case 0:
                return new v31((y31) this.h, (q43) this.o, (q43) this.p, (pm1) this.l, this.m, (q43) this.q, (bg1) obj2, so0Var);
            case 1:
                return new v31((y31) this.h, (pm1) this.l, this.m, (jq2) this.o, (bg1) obj2, (cc2) this.p, (j33) this.q, so0Var);
            case 2:
                v31 v31Var = new v31((ri2) this.q, (br1) this.l, (le1) obj2, so0Var);
                v31Var.p = obj;
                return v31Var;
            default:
                v31 v31Var2 = new v31((je1) obj2, so0Var);
                v31Var2.l = obj;
                return v31Var2;
        }
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = this.c;
        w84 w84Var = w84.a;
        switch (i) {
            case 0:
                return ((v31) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
            case 1:
                return ((v31) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
            case 2:
                return ((v31) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
            default:
                ((v31) create((l81) obj, (so0) obj2)).invokeSuspend(w84Var);
                return hq0.c;
        }
    }

    /* JADX WARN: Code duplicated, block: B:262:0x0159 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:263:0x014a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x011c A[Catch: all -> 0x01bd, TryCatch #13 {all -> 0x01bd, blocks: (B:44:0x0109, B:46:0x011c, B:48:0x0128, B:50:0x0132, B:65:0x0169, B:68:0x0178, B:72:0x0192, B:74:0x019d, B:54:0x0143, B:57:0x014e), top: B:257:0x0109 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x014c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x014e A[Catch: all -> 0x01bd, LOOP:1: B:257:0x0109->B:57:0x014e, LOOP_END, TryCatch #13 {all -> 0x01bd, blocks: (B:44:0x0109, B:46:0x011c, B:48:0x0128, B:50:0x0132, B:65:0x0169, B:68:0x0178, B:72:0x0192, B:74:0x019d, B:54:0x0143, B:57:0x014e), top: B:257:0x0109 }] */
    /* JADX WARN: Type inference failed for: r2v23, types: [int, zi2] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x01b2 -> B:80:0x01b6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:94:0x01d6 -> B:80:0x01b6). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.wr
    public final java.lang.Object invokeSuspend(java.lang.Object r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1112
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v31.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
