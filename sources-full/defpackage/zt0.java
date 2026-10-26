package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zt0 implements xp0 {
    public final xp0 c;

    public zt0(xp0 xp0Var) {
        this.c = xp0Var;
    }

    public final boolean equals(Object obj) {
        return kr1.n(this.c, obj);
    }

    @Override // defpackage.xp0
    public final Object fold(Object obj, ne1 ne1Var) {
        return this.c.fold(obj, ne1Var);
    }

    @Override // defpackage.xp0
    public final vp0 get(wp0 wp0Var) {
        return this.c.get(wp0Var);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // defpackage.xp0
    public final xp0 minusKey(wp0 wp0Var) {
        xp0 xp0VarMinusKey = this.c.minusKey(wp0Var);
        int i = ra4.b;
        yp0 yp0Var = zp0.Key;
        zp0 zp0Var = (zp0) get(yp0Var);
        zp0 zp0Var2 = (zp0) xp0VarMinusKey.get(yp0Var);
        if ((zp0Var instanceof au0) && zp0Var != zp0Var2) {
            ((au0) zp0Var).d = 0;
        }
        return new zt0(xp0VarMinusKey);
    }

    @Override // defpackage.xp0
    public final xp0 plus(xp0 xp0Var) {
        xp0 xp0VarPlus = this.c.plus(xp0Var);
        int i = ra4.b;
        yp0 yp0Var = zp0.Key;
        zp0 zp0Var = (zp0) get(yp0Var);
        zp0 zp0Var2 = (zp0) xp0VarPlus.get(yp0Var);
        if ((zp0Var instanceof au0) && zp0Var != zp0Var2) {
            ((au0) zp0Var).d = 0;
        }
        return new zt0(xp0VarPlus);
    }

    public final String toString() {
        return "ForwardingCoroutineContext(delegate=" + this.c + ")";
    }
}
