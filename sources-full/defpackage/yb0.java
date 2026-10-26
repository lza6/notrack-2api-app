package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yb0 extends mq3 implements ne1 {
    public final /* synthetic */ int c;
    public int d;
    public final /* synthetic */ ue h;
    public final /* synthetic */ float l;
    public final /* synthetic */ boolean m;
    public final /* synthetic */ tq1 n;
    public final /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yb0(ue ueVar, float f, boolean z, tq1 tq1Var, mi2 mi2Var, so0 so0Var, int i) {
        super(2, so0Var);
        this.c = i;
        this.h = ueVar;
        this.l = f;
        this.m = z;
        this.n = tq1Var;
        this.o = mi2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yb0(ue ueVar, float f, boolean z, xy xyVar, tq1 tq1Var, so0 so0Var) {
        super(2, so0Var);
        this.c = 2;
        this.h = ueVar;
        this.l = f;
        this.m = z;
        this.o = xyVar;
        this.n = tq1Var;
    }

    @Override // defpackage.wr
    public final so0 create(Object obj, so0 so0Var) {
        int i = this.c;
        Object obj2 = this.o;
        switch (i) {
            case 0:
                return new yb0(this.h, this.l, this.m, this.n, (mi2) obj2, so0Var, 0);
            case 1:
                return new yb0(this.h, this.l, this.m, this.n, (mi2) obj2, so0Var, 1);
            default:
                tq1 tq1Var = this.n;
                return new yb0(this.h, this.l, this.m, (xy) obj2, tq1Var, so0Var);
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
        }
        return ((yb0) create(gq0Var, so0Var)).invokeSuspend(w84Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c2, code lost:
    
        if (r6.e(r12, r13) == r5) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d1, code lost:
    
        if (defpackage.t11.a(r6, r7, r13, r2, r12) == r5) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x010d, code lost:
    
        if (r6.e(r12, r13) == r5) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x011c, code lost:
    
        if (defpackage.t11.a(r6, r7, r13, r2, r12) == r5) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:?, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:?, code lost:
    
        return r5;
     */
    @Override // defpackage.wr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yb0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
