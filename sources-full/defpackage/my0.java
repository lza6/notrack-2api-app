package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class my0 extends h63 implements ne1 {
    public yw2 d;
    public int h;
    public int l;
    public /* synthetic */ Object m;
    public final /* synthetic */ l43 n;
    public final /* synthetic */ q43 o;
    public final /* synthetic */ q43 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public my0(l43 l43Var, q43 q43Var, q43 q43Var2, so0 so0Var) {
        super(2, so0Var);
        this.n = l43Var;
        this.o = q43Var;
        this.p = q43Var2;
    }

    @Override // defpackage.wr
    public final so0 create(Object obj, so0 so0Var) {
        my0 my0Var = new my0(this.n, this.o, this.p, so0Var);
        my0Var.m = obj;
        return my0Var;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        return ((my0) create((rq3) obj, (so0) obj2)).invokeSuspend(w84.a);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0057  */
    /* JADX WARN: Code duplicated, block: B:20:0x0064 A[LOOP:2: B:16:0x0055->B:20:0x0064, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:73:0x0067 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x0068 A[EDGE_INSN: B:74:0x0068->B:22:0x0068 BREAK  A[LOOP:2: B:16:0x0055->B:20:0x0064], SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00ad -> B:38:0x00b0). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.wr
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.my0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
