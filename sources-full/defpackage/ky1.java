package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ky1 extends of2 implements gt2 {
    public float c;
    public boolean d;

    @Override // defpackage.gt2
    public final Object n0(Object obj) {
        d83 d83Var = obj instanceof d83 ? (d83) obj : null;
        if (d83Var == null) {
            d83Var = new d83();
        }
        d83Var.a = this.c;
        d83Var.b = this.d;
        return d83Var;
    }
}
