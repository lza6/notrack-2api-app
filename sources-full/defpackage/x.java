package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class x implements vp0 {
    private final wp0 key;

    public x(wp0 wp0Var) {
        this.key = wp0Var;
    }

    @Override // defpackage.xp0
    public <R> R fold(R r, ne1 ne1Var) {
        return (R) y64.v(this, r, ne1Var);
    }

    @Override // defpackage.xp0
    public vp0 get(wp0 wp0Var) {
        return y64.w(this, wp0Var);
    }

    @Override // defpackage.vp0
    public wp0 getKey() {
        return this.key;
    }

    @Override // defpackage.xp0
    public xp0 minusKey(wp0 wp0Var) {
        return y64.H(this, wp0Var);
    }

    @Override // defpackage.xp0
    public xp0 plus(xp0 xp0Var) {
        return y64.I(this, xp0Var);
    }
}
