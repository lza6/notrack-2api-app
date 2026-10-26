package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class js1 extends l72 implements yw0, nn1 {
    public os1 o;

    @Override // defpackage.nn1
    public final boolean a() {
        return true;
    }

    @Override // defpackage.nn1
    public final yl2 c() {
        return null;
    }

    @Override // defpackage.yw0
    public final void dispose() {
        p().W(this);
    }

    public gs1 getParent() {
        return p();
    }

    public final os1 p() {
        os1 os1Var = this.o;
        if (os1Var != null) {
            return os1Var;
        }
        kr1.n0("job");
        throw null;
    }

    public abstract boolean q();

    public abstract void r(Throwable th);

    @Override // defpackage.l72
    public final String toString() {
        return getClass().getSimpleName() + '@' + xr0.a0(this) + "[job@" + xr0.a0(p()) + ']';
    }
}
