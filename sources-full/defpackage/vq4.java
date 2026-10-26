package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vq4 implements ql4 {
    public final ql4 c;

    public vq4(ql4 ql4Var) {
        this.c = ql4Var;
    }

    public /* synthetic */ vq4(tu tuVar) {
        sk3 sk3Var = new sk3(23, tuVar);
        this.c = ml4.a(new vq4(ml4.a(new iy2(ml4.a(new bv0(14, sk3Var, ml4.a(new bo4(sk3Var, 1)), false)), ml4.a(new bo4(sk3Var, 0)), sk3Var, 20))));
    }

    @Override // defpackage.ql4
    public Object f() {
        np4 np4Var = (np4) this.c.f();
        if (np4Var != null) {
            return np4Var;
        }
        m51.x("Cannot return null from a non-@Nullable @Provides method");
        return null;
    }
}
