package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class n extends mq3 implements ne1 {
    public boolean c;
    public int d;
    public /* synthetic */ Object h;
    public final /* synthetic */ py2 l;
    public final /* synthetic */ long m;
    public final /* synthetic */ gh2 n;
    public final /* synthetic */ r o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(py2 py2Var, long j, gh2 gh2Var, r rVar, so0 so0Var) {
        super(2, so0Var);
        this.l = py2Var;
        this.m = j;
        this.n = gh2Var;
        this.o = rVar;
    }

    @Override // defpackage.wr
    public final so0 create(Object obj, so0 so0Var) {
        n nVar = new n(this.l, this.m, this.n, this.o, so0Var);
        nVar.h = obj;
        return nVar;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((gq0) obj, (so0) obj2)).invokeSuspend(w84.a);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x009b  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b5  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c1, code lost:
    
        if (((defpackage.hh2) r15).a(r1, r18) == r11) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e0, code lost:
    
        if (((defpackage.hh2) r15).a(r3, r18) == r11) goto L43;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, java.util.concurrent.CancellationException] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v5, types: [ry2] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v4, types: [gs1] */
    @Override // defpackage.wr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
