package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class p83 extends uo0 implements l81 {
    public final l81 c;
    public final xp0 d;
    public final int h;
    public xp0 l;
    public so0 m;

    public p83(l81 l81Var, xp0 xp0Var) {
        super(cg0.h, x21.c);
        this.c = l81Var;
        this.d = xp0Var;
        this.h = ((Number) xp0Var.fold(0, new oj0(10))).intValue();
    }

    public final Object a(so0 so0Var, Object obj) {
        xp0 context = so0Var.getContext();
        yo4.v(context);
        xp0 xp0Var = this.l;
        if (xp0Var != context) {
            if (xp0Var instanceof qx0) {
                throw new IllegalStateException(no3.e0("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((qx0) xp0Var).d + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
            if (((Number) context.fold(0, new v40(5, this))).intValue() != this.h) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.d + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.l = context;
        }
        this.m = so0Var;
        oe1 oe1Var = r83.a;
        l81 l81Var = this.c;
        l81Var.getClass();
        Object objInvoke = oe1Var.invoke(l81Var, obj, this);
        if (!kr1.n(objInvoke, hq0.c)) {
            this.m = null;
        }
        return objInvoke;
    }

    @Override // defpackage.l81
    public final Object emit(Object obj, so0 so0Var) {
        try {
            Object objA = a(so0Var, obj);
            return objA == hq0.c ? objA : w84.a;
        } catch (Throwable th) {
            this.l = new qx0(so0Var.getContext(), th);
            throw th;
        }
    }

    @Override // defpackage.wr, defpackage.iq0
    public final iq0 getCallerFrame() {
        so0 so0Var = this.m;
        if (so0Var instanceof iq0) {
            return (iq0) so0Var;
        }
        return null;
    }

    @Override // defpackage.uo0, defpackage.so0
    public final xp0 getContext() {
        xp0 xp0Var = this.l;
        return xp0Var == null ? x21.c : xp0Var;
    }

    @Override // defpackage.wr
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) {
        Throwable thA = j63.a(obj);
        if (thA != null) {
            this.l = new qx0(getContext(), thA);
        }
        so0 so0Var = this.m;
        if (so0Var != null) {
            so0Var.resumeWith(obj);
        }
        return hq0.c;
    }
}
