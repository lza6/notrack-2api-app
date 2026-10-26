package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ry0 extends h63 implements ne1 {
    public final /* synthetic */ int d = 1;
    public int h;
    public /* synthetic */ Object l;
    public final /* synthetic */ le1 m;
    public Object n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ se1 p;
    public final /* synthetic */ Object q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ry0(gq0 gq0Var, oe1 oe1Var, le1 le1Var, py2 py2Var, so0 so0Var) {
        super(2, so0Var);
        this.o = gq0Var;
        this.p = oe1Var;
        this.m = le1Var;
        this.q = py2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ry0(le1 le1Var, r90 r90Var, je1 je1Var, je1 je1Var2, so0 so0Var) {
        super(2, so0Var);
        this.m = le1Var;
        this.o = r90Var;
        this.p = je1Var;
        this.q = je1Var2;
    }

    @Override // defpackage.wr
    public final so0 create(Object obj, so0 so0Var) {
        int i = this.d;
        Object obj2 = this.q;
        se1 se1Var = this.p;
        Object obj3 = this.o;
        switch (i) {
            case 0:
                ry0 ry0Var = new ry0(this.m, (r90) obj3, (je1) se1Var, (je1) obj2, so0Var);
                ry0Var.l = obj;
                return ry0Var;
            default:
                ry0 ry0Var2 = new ry0((gq0) obj3, (oe1) se1Var, this.m, (py2) obj2, so0Var);
                ry0Var2.l = obj;
                return ry0Var2;
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
        return ((ry0) create(rq3Var, so0Var)).invokeSuspend(w84Var);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x012b  */
    /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0094, code lost:
    
        if (r1 == r10) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0153, code lost:
    
        if (r0 == r2) goto L46;
     */
    @Override // defpackage.wr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ry0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
