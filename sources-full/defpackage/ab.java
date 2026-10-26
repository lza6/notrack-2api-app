package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ab extends h63 implements ne1 {
    public final /* synthetic */ int d;
    public int h;
    public /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ab(Object obj, so0 so0Var, int i) {
        super(2, so0Var);
        this.d = i;
        this.m = obj;
    }

    @Override // defpackage.wr
    public final so0 create(Object obj, so0 so0Var) {
        int i = this.d;
        Object obj2 = this.m;
        switch (i) {
            case 0:
                ab abVar = new ab((bb) obj2, so0Var, 0);
                abVar.l = obj;
                return abVar;
            default:
                ab abVar2 = new ab((wx3) obj2, so0Var, 1);
                abVar2.l = obj;
                return abVar2;
        }
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = this.d;
        w84 w84Var = w84.a;
        rq3 rq3Var = (rq3) obj;
        so0 so0Var = (so0) obj2;
        switch (i) {
            case 0:
                return ((ab) create(rq3Var, so0Var)).invokeSuspend(w84Var);
            default:
                ((ab) create(rq3Var, so0Var)).invokeSuspend(w84Var);
                return hq0.c;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d3 A[LOOP:1: B:35:0x00bf->B:39:0x00d3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:54:0x00d7 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0032 -> B:13:0x0035). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0092 -> B:28:0x0095). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.wr
    public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ab.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
