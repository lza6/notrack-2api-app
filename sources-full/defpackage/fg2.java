package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fg2 extends mq3 implements ne1 {
    public l43 c;
    public l43 d;
    public int h;
    public int l;
    public /* synthetic */ Object m;
    public final /* synthetic */ n43 n;
    public final /* synthetic */ q43 o;
    public final /* synthetic */ q43 p;
    public final /* synthetic */ float q;
    public final /* synthetic */ lv0 r;
    public final /* synthetic */ float s;
    public final /* synthetic */ oc3 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fg2(n43 n43Var, q43 q43Var, q43 q43Var2, float f, lv0 lv0Var, float f2, oc3 oc3Var, so0 so0Var) {
        super(2, so0Var);
        this.n = n43Var;
        this.o = q43Var;
        this.p = q43Var2;
        this.q = f;
        this.r = lv0Var;
        this.s = f2;
        this.t = oc3Var;
    }

    @Override // defpackage.wr
    public final so0 create(Object obj, so0 so0Var) {
        fg2 fg2Var = new fg2(this.n, this.o, this.p, this.q, this.r, this.s, this.t, so0Var);
        fg2Var.m = obj;
        return fg2Var;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        return ((fg2) create((mc3) obj, (so0) obj2)).invokeSuspend(w84.a);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x007c  */
    /* JADX WARN: Code duplicated, block: B:17:0x009c  */
    /* JADX WARN: Code duplicated, block: B:20:0x00af  */
    /* JADX WARN: Code duplicated, block: B:22:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:26:0x0163  */
    /* JADX WARN: Code duplicated, block: B:29:0x016a  */
    /* JADX WARN: Code duplicated, block: B:32:0x016f  */
    /* JADX WARN: Code duplicated, block: B:35:0x018e  */
    /* JADX WARN: Code duplicated, block: B:38:0x01a1  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x018e -> B:36:0x018f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x01a1 -> B:13:0x0076). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.wr
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            Method dump skipped, instruction units count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fg2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
