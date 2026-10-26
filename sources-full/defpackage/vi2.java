package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vi2 extends mq3 implements ne1 {
    public zi2 c;
    public Object d;
    public Object h;
    public wi2 l;
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ ri2 o;
    public final /* synthetic */ wi2 p;
    public final /* synthetic */ ne1 q;
    public final /* synthetic */ Object r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vi2(ri2 ri2Var, wi2 wi2Var, ne1 ne1Var, Object obj, so0 so0Var) {
        super(2, so0Var);
        this.o = ri2Var;
        this.p = wi2Var;
        this.q = ne1Var;
        this.r = obj;
    }

    @Override // defpackage.wr
    public final so0 create(Object obj, so0 so0Var) {
        vi2 vi2Var = new vi2(this.o, this.p, this.q, this.r, so0Var);
        vi2Var.n = obj;
        return vi2Var;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        return ((vi2) create((gq0) obj, (so0) obj2)).invokeSuspend(w84.a);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstInlineVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected instance arg in invoke
        	at jadx.core.dex.visitors.ConstInlineVisitor.addExplicitCast(ConstInlineVisitor.java:285)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceArg(ConstInlineVisitor.java:267)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceConst(ConstInlineVisitor.java:177)
        	at jadx.core.dex.visitors.ConstInlineVisitor.checkInsn(ConstInlineVisitor.java:110)
        	at jadx.core.dex.visitors.ConstInlineVisitor.process(ConstInlineVisitor.java:55)
        	at jadx.core.dex.visitors.ConstInlineVisitor.visit(ConstInlineVisitor.java:47)
        */
    @Override // defpackage.wr
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vi2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
