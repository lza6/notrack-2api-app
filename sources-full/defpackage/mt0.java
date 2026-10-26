package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class mt0 implements gc3 {
    public final le1 a;
    public final lt0 b = new lt0(this);
    public final wi2 c = new wi2();
    public final ft2 d;
    public final ft2 e;
    public final ft2 f;

    public mt0(le1 le1Var) {
        this.a = le1Var;
        Boolean bool = Boolean.FALSE;
        this.d = cl3.d(bool);
        this.e = cl3.d(bool);
        this.f = cl3.d(bool);
    }

    @Override // defpackage.gc3
    public final boolean b() {
        return ((Boolean) this.d.getValue()).booleanValue();
    }

    @Override // defpackage.gc3
    public final Object d(ri2 ri2Var, ne1 ne1Var, uo0 uo0Var) {
        Object objQ = yo4.q(new q8(this, ri2Var, ne1Var, (so0) null), uo0Var);
        return objQ == hq0.c ? objQ : w84.a;
    }

    @Override // defpackage.gc3
    public final float e(float f) {
        return ((Number) this.a.invoke(Float.valueOf(f))).floatValue();
    }
}
