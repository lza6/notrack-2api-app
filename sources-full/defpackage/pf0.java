package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pf0 extends mq3 implements ne1 {
    public w20 c;
    public byte[] d;
    public int h;
    public int l;
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ k81[] o;
    public final /* synthetic */ i43 p;
    public final /* synthetic */ z8 q;
    public final /* synthetic */ l81 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pf0(k81[] k81VarArr, i43 i43Var, z8 z8Var, l81 l81Var, so0 so0Var) {
        super(2, so0Var);
        this.o = k81VarArr;
        this.p = i43Var;
        this.q = z8Var;
        this.r = l81Var;
    }

    @Override // defpackage.wr
    public final so0 create(Object obj, so0 so0Var) {
        pf0 pf0Var = new pf0(this.o, this.p, this.q, this.r, so0Var);
        pf0Var.n = obj;
        return pf0Var;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        return ((pf0) create((gq0) obj, (so0) obj2)).invokeSuspend(w84.a);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b5 A[DONT_INVERT, EDGE_INSN: B:34:0x00b5->B:20:0x0076 BREAK  A[LOOP:0: B:27:0x0096->B:40:?]] */
    /* JADX WARN: Code duplicated, block: B:35:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:? A[LOOP:0: B:27:0x0096->B:40:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00d9 -> B:20:0x0076). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.wr
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pf0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
