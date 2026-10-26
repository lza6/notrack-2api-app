package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class si1 extends of2 implements gt2 {
    public wt c;

    @Override // defpackage.gt2
    public final Object n0(Object obj) {
        d83 d83Var = obj instanceof d83 ? (d83) obj : null;
        if (d83Var == null) {
            d83Var = new d83();
        }
        d83Var.c = new qq0(this.c);
        return d83Var;
    }
}
