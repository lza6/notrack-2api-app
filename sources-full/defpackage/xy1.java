package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xy1 implements vy1 {
    public final wz1 a;
    public final uy1 b;
    public final gj c;

    public xy1(wz1 wz1Var, uy1 uy1Var, gj gjVar) {
        this.a = wz1Var;
        this.b = uy1Var;
        this.c = gjVar;
    }

    @Override // defpackage.vy1, defpackage.q02
    public void Item(int i, Object obj, ck0 ck0Var, int i2) {
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.a0(1493551140);
        x02.LazyLayoutPinnableItem(obj, i, this.a.q, zg0.rememberComposableLambda(726189336, true, new wy1(this, i), kk0Var, 54), kk0Var, ((i2 >> 3) & 14) | 3072 | ((i2 << 3) & 112));
        kk0Var.r(false);
    }

    @Override // defpackage.q02
    public final int a() {
        return this.b.N().b;
    }

    @Override // defpackage.q02
    public final Object b(int i) {
        gj gjVar = this.c;
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
        return this.c.i(obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xy1)) {
            return false;
        }
        return kr1.n(this.b, ((xy1) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
