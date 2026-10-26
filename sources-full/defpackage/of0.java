package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class of0 implements l81 {
    public final /* synthetic */ jy c;
    public final /* synthetic */ int d;

    public of0(jy jyVar, int i) {
        this.c = jyVar;
        this.d = i;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.l81
    public final Object emit(Object obj, so0 so0Var) throws Throwable {
        nf0 nf0Var;
        Object obj2;
        if (so0Var instanceof nf0) {
            nf0Var = (nf0) so0Var;
            int i = nf0Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                nf0Var.h = i - Integer.MIN_VALUE;
            } else {
                nf0Var = new nf0(this, so0Var);
            }
        } else {
            nf0Var = new nf0(this, so0Var);
        }
        Object obj3 = nf0Var.c;
        int i2 = nf0Var.h;
        w84 w84Var = w84.a;
        hq0 hq0Var = hq0.c;
        if (i2 == 0) {
            g13.O(obj3);
            tn1 tn1Var = new tn1(this.d, obj);
            nf0Var.h = 1;
            if (this.c.b(nf0Var, tn1Var) != hq0Var) {
            }
        }
        if (i2 == 1) {
            g13.O(obj3);
        } else {
            if (i2 != 2) {
                u41.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            g13.O(obj3);
        }
        nf0Var.h = 2;
        xp0 context = nf0Var.getContext();
        yo4.v(context);
        so0 so0VarG = gm4.G(nf0Var);
        nw0 nw0Var = so0VarG instanceof nw0 ? (nw0) so0VarG : null;
        if (nw0Var == null) {
            obj2 = w84Var;
        } else {
            zp0 zp0Var = nw0Var.l;
            if (xp1.D(zp0Var, context)) {
                nw0Var.n = w84Var;
                nw0Var.h = 1;
                zp0Var.dispatchYield(context, nw0Var);
            } else {
                pj4 pj4Var = new pj4(pj4.d);
                xp0 xp0VarPlus = context.plus(pj4Var);
                nw0Var.n = w84Var;
                nw0Var.h = 1;
                zp0Var.dispatchYield(xp0VarPlus, nw0Var);
                if (pj4Var.c) {
                    v41 v41VarA = i04.a();
                    kl klVar = v41VarA.h;
                    if (!(klVar != null ? klVar.isEmpty() : true)) {
                        if (v41VarA.c >= 4294967296L) {
                            nw0Var.n = w84Var;
                            nw0Var.h = 1;
                            v41VarA.R(nw0Var);
                        } else {
                            v41VarA.S(true);
                            try {
                                nw0Var.run();
                                do {
                                } while (v41VarA.U());
                            } catch (Throwable th) {
                                try {
                                    nw0Var.i(th);
                                } catch (Throwable th2) {
                                    v41VarA.Q(true);
                                    throw th2;
                                }
                            }
                            v41VarA.Q(true);
                        }
                    }
                    obj2 = w84Var;
                }
            }
            obj2 = hq0Var;
        }
        if (obj2 != hq0Var) {
            obj2 = w84Var;
        }
        return obj2 == hq0Var ? hq0Var : w84Var;
    }
}
