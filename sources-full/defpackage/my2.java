package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class my2 extends h63 implements ne1 {
    public final /* synthetic */ int d;
    public int h;
    public /* synthetic */ Object l;
    public Object m;
    public Object n;
    public final /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public my2(ap3 ap3Var, so0 so0Var) {
        super(2, so0Var);
        this.d = 3;
        this.o = ap3Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ my2(Object obj, Object obj2, xt3 xt3Var, so0 so0Var, int i) {
        super(2, so0Var);
        this.d = i;
        this.m = obj;
        this.n = obj2;
        this.o = xt3Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public my2(wu wuVar, ts tsVar, so0 so0Var) {
        super(2, so0Var);
        this.d = 0;
        this.n = wuVar;
        this.o = tsVar;
    }

    @Override // defpackage.wr
    public final so0 create(Object obj, so0 so0Var) {
        int i = this.d;
        Object obj2 = this.o;
        switch (i) {
            case 0:
                my2 my2Var = new my2((wu) this.n, (ts) obj2, so0Var);
                my2Var.l = obj;
                return my2Var;
            case 1:
                my2 my2Var2 = new my2((cg2) this.m, (gj) this.n, (xt3) obj2, so0Var, 1);
                my2Var2.l = obj;
                return my2Var2;
            case 2:
                my2 my2Var3 = new my2((gj) this.m, (ex3) this.n, (fx3) obj2, so0Var, 2);
                my2Var3.l = obj;
                return my2Var3;
            default:
                my2 my2Var4 = new my2((ap3) obj2, so0Var);
                my2Var4.l = obj;
                return my2Var4;
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
            case 1:
                break;
            case 2:
                break;
        }
        return ((my2) create(rq3Var, so0Var)).invokeSuspend(w84Var);
    }

    /* JADX WARN: Code duplicated, block: B:191:0x036f  */
    /* JADX WARN: Code duplicated, block: B:193:0x037f  */
    /* JADX WARN: Code duplicated, block: B:214:0x0387 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:215:0x0384 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:232:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:187:0x0361 -> B:189:0x0364). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00d2 -> B:39:0x00d6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x0166 -> B:71:0x0169). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:191:0x036f
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.wr
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 920
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.my2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
