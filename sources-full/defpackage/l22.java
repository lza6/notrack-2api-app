package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class l22 implements g12 {
    public final /* synthetic */ wz1 a;

    public l22(wz1 wz1Var) {
        this.a = wz1Var;
    }

    @Override // defpackage.g12
    public final int a() {
        wz1 wz1Var = this.a;
        return (int) (wz1Var.g().q == nq2.c ? wz1Var.g().e() & 4294967295L : wz1Var.g().e() >> 32);
    }

    @Override // defpackage.g12
    public final float b() {
        wz1 wz1Var = this.a;
        return (wz1Var.d.b.f() * 500) + wz1Var.d.c.f();
    }

    @Override // defpackage.g12
    public final he0 c() {
        return new he0(-1, -1);
    }

    @Override // defpackage.g12
    public final Object d(int i, k12 k12Var) throws Throwable {
        fp1 fp1Var = wz1.w;
        wz1 wz1Var = this.a;
        wz1Var.getClass();
        Object objD = wz1Var.d(ri2.c, new f60(wz1Var, i, (so0) null), k12Var);
        w84 w84Var = w84.a;
        hq0 hq0Var = hq0.c;
        if (objD != hq0Var) {
            objD = w84Var;
        }
        return objD == hq0Var ? objD : w84Var;
    }

    @Override // defpackage.g12
    public final int e() {
        wz1 wz1Var = this.a;
        return (-wz1Var.g().m) + wz1Var.g().r;
    }

    @Override // defpackage.g12
    public final float f() {
        wz1 wz1Var = this.a;
        int iF = wz1Var.d.b.f();
        int iF2 = wz1Var.d.c.f();
        return wz1Var.c() ? (iF * 500) + iF2 + 100.0f : (iF * 500) + iF2;
    }
}
