package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ke extends mq3 implements ne1 {
    public final /* synthetic */ int c;
    public int d;
    public final /* synthetic */ long h;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ke(long j, rq3 rq3Var, so0 so0Var) {
        super(2, so0Var);
        this.c = 2;
        this.h = j;
        this.l = rq3Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ke(Object obj, long j, so0 so0Var, int i) {
        super(2, so0Var);
        this.c = i;
        this.l = obj;
        this.h = j;
    }

    @Override // defpackage.wr
    public final so0 create(Object obj, so0 so0Var) {
        int i = this.c;
        Object obj2 = this.l;
        switch (i) {
            case 0:
                return new ke((me) obj2, this.h, so0Var, 0);
            case 1:
                return new ke((ue) obj2, this.h, so0Var, 1);
            case 2:
                return new ke(this.h, (rq3) obj2, so0Var);
            default:
                return new ke((gw3) obj2, this.h, so0Var, 3);
        }
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.c;
        w84 w84Var = w84.a;
        gq0 gq0Var = (gq0) obj;
        so0 so0Var = (so0) obj2;
        switch (i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return ((ke) create(gq0Var, so0Var)).invokeSuspend(w84Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0066, code lost:
    
        if (defpackage.p23.u(8, r12) == r8) goto L25;
     */
    @Override // defpackage.wr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ke.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
