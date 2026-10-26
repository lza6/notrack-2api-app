package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class t12 implements r12 {
    public final g22 a;
    public final q12 b;
    public final c02 c;
    public final gj d;

    public t12(g22 g22Var, q12 q12Var, c02 c02Var, gj gjVar) {
        this.a = g22Var;
        this.b = q12Var;
        this.c = c02Var;
        this.d = gjVar;
    }

    @Override // defpackage.r12, defpackage.q02
    public void Item(int i, Object obj, ck0 ck0Var, int i2) {
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.a0(-462424778);
        x02.LazyLayoutPinnableItem(obj, i, this.a.q, zg0.rememberComposableLambda(-824725566, true, new s12(this, i), kk0Var, 54), kk0Var, ((i2 >> 3) & 14) | 3072 | ((i2 << 3) & 112));
        kk0Var.r(false);
    }

    @Override // defpackage.q02
    public final int a() {
        return this.b.N().b;
    }

    @Override // defpackage.q02
    public final Object b(int i) {
        gj gjVar = this.d;
        Object[] objArr = (Object[]) gjVar.d;
        int i2 = i - gjVar.b;
        Object obj = (i2 < 0 || i2 > vl.w0(objArr)) ? null : objArr[i2];
        return obj == null ? this.b.O(i) : obj;
    }

    @Override // defpackage.q02
    public final Object c(int i) {
        return this.b.J(i);
    }

    @Override // defpackage.q02
    public final int d(Object obj) {
        return this.d.i(obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t12)) {
            return false;
        }
        return kr1.n(this.b, ((t12) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
