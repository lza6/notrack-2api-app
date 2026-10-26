package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vj2 implements l81 {
    public final /* synthetic */ e01 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ n43 h;
    public final /* synthetic */ n43 l;
    public final /* synthetic */ n43 m;

    public vj2(e01 e01Var, boolean z, n43 n43Var, n43 n43Var2, n43 n43Var3) {
        this.c = e01Var;
        this.d = z;
        this.h = n43Var;
        this.l = n43Var2;
        this.m = n43Var3;
    }

    @Override // defpackage.l81
    public final Object emit(Object obj, so0 so0Var) {
        zq zqVar = (zq) obj;
        float fB = dy2.a.b(zqVar.c);
        boolean z = zqVar.d == 0;
        float f = this.h.c;
        float f2 = this.l.c;
        float f3 = this.m.c;
        e01 e01Var = this.c;
        e01Var.getClass();
        e01Var.a.setValue(Boolean.valueOf(z != this.d));
        if (!e01Var.a()) {
            f = f2;
        }
        e01Var.b.h(g13.F(0.0f, f, fB));
        e01Var.c.h(g13.F(0.0f, f3, fB));
        return w84.a;
    }
}
