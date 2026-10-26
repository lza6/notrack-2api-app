package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class s23 implements hn3, k81, xe1 {
    public final /* synthetic */ jn3 c;

    public s23(jn3 jn3Var) {
        this.c = jn3Var;
    }

    @Override // defpackage.k81
    public final Object a(l81 l81Var, so0 so0Var) throws Throwable {
        this.c.a(l81Var, so0Var);
        return hq0.c;
    }

    @Override // defpackage.xe1
    public final k81 b(xp0 xp0Var, int i, fy fyVar) {
        return (((i < 0 || i >= 2) && i != -2) || fyVar != fy.d) ? xr0.Y(this, xp0Var, i, fyVar) : this;
    }

    @Override // defpackage.hn3
    public final Object getValue() {
        return this.c.getValue();
    }
}
