package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class h01 {
    public final ji4 a;
    public final ft2 b = cl3.d(null);

    public h01(i01 i01Var, le1 le1Var) {
        this.a = new ji4(i01Var, sx.x, new j(12, this), uj2.a, le1Var);
    }

    public static Object a(h01 h01Var, i01 i01Var, so0 so0Var) {
        t64 t64Var = uj2.a;
        ji4 ji4Var = h01Var.a;
        Object objB = ji4Var.b(i01Var, ri2.c, new g01(h01Var, ((bt2) ji4Var.k).f(), t64Var, null), so0Var);
        return objB == hq0.c ? objB : w84.a;
    }

    public final Object b(so0 so0Var) {
        Object objA = a(this, i01.c, so0Var);
        return objA == hq0.c ? objA : w84.a;
    }

    public final boolean c() {
        return ((i01) ((ft2) this.a.g).getValue()) == i01.d;
    }
}
