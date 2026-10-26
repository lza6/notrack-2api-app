package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class sh3 extends gm4 {
    public final p13 r;
    public final ft2 s = cl3.d(null);

    public sh3(p13 p13Var) {
        this.r = p13Var;
    }

    @Override // defpackage.gm4
    public final Object A(p13 p13Var) {
        if (p13Var != this.r) {
            po1.b("Check failed.");
        }
        Object value = this.s.getValue();
        if (value == null) {
            return null;
        }
        return value;
    }

    @Override // defpackage.gm4
    public final boolean n(p13 p13Var) {
        return p13Var == this.r;
    }
}
