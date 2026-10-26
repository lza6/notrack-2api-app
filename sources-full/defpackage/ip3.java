package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ip3 {
    public final lp3 a;
    public iy1 b;
    public final hp3 c = new hp3(this, 2);
    public final hp3 d = new hp3(this, 0);
    public final hp3 e = new hp3(this, 1);

    public ip3(lp3 lp3Var) {
        this.a = lp3Var;
    }

    public final iy1 a() {
        iy1 iy1Var = this.b;
        if (iy1Var != null) {
            return iy1Var;
        }
        u41.k("SubcomposeLayoutState is not attached to SubcomposeLayout");
        return null;
    }
}
