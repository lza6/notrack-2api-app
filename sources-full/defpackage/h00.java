package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class h00 extends u0 {
    public final /* synthetic */ i00 p;

    public h00(i00 i00Var) {
        this.p = i00Var;
    }

    @Override // defpackage.u0
    public final String h() {
        f00 f00Var = (f00) this.p.c.get();
        if (f00Var == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + f00Var.a + "]";
    }
}
