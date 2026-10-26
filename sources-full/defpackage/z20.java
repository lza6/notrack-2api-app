package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class z20 extends y20 {
    public final k81 l;

    public z20(k81 k81Var, xp0 xp0Var, int i, fy fyVar) {
        super(xp0Var, i, fyVar);
        this.l = k81Var;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x006e  */
    /* JADX WARN: Code duplicated, block: B:26:0x0074 A[RETURN] */
    @Override // defpackage.y20, defpackage.k81
    public final Object a(l81 l81Var, so0 so0Var) {
        Object objA;
        int i = this.d;
        hq0 hq0Var = hq0.c;
        if (i == -3) {
            xp0 context = so0Var.getContext();
            Boolean bool = Boolean.FALSE;
            oj0 oj0Var = new oj0(5);
            xp0 xp0Var = this.c;
            xp0 xp0VarPlus = !((Boolean) xp0Var.fold(bool, oj0Var)).booleanValue() ? context.plus(xp0Var) : yh4.A(context, xp0Var, false);
            if (kr1.n(xp0VarPlus, context)) {
                Object objJ = j(l81Var, so0Var);
                if (objJ == hq0Var) {
                    return objJ;
                }
            } else {
                t73 t73Var = t73.m;
                if (kr1.n(xp0VarPlus.get(t73Var), context.get(t73Var))) {
                    xp0 context2 = so0Var.getContext();
                    if (!(l81Var instanceof of3) && !(l81Var instanceof gm2)) {
                        l81Var = new s8(l81Var, context2);
                    }
                    Object objX = sf3.X(xp0VarPlus, l81Var, yh4.Z(xp0VarPlus), new k(this, null, 9), so0Var);
                    if (objX == hq0Var) {
                        return objX;
                    }
                } else {
                    objA = super.a(l81Var, so0Var);
                    if (objA == hq0Var) {
                        return objA;
                    }
                }
            }
        } else {
            objA = super.a(l81Var, so0Var);
            if (objA == hq0Var) {
                return objA;
            }
        }
        return w84.a;
    }

    @Override // defpackage.y20
    public final Object e(wz2 wz2Var, so0 so0Var) {
        Object objJ = j(new of3(wz2Var), so0Var);
        return objJ == hq0.c ? objJ : w84.a;
    }

    public abstract Object j(l81 l81Var, so0 so0Var);

    @Override // defpackage.y20
    public final String toString() {
        return this.l + " -> " + super.toString();
    }
}
