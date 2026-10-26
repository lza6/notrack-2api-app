package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vs4 extends js4 {
    public final /* synthetic */ ws4 p;

    public vs4(ws4 ws4Var) {
        this.p = ws4Var;
    }

    @Override // defpackage.js4
    public final String c() {
        ms4 ms4Var = (ms4) this.p.c.get();
        return ms4Var == null ? "Completer object has been garbage collected, future will fail soon" : fq2.n("tag=[", String.valueOf(ms4Var.a), "]");
    }
}
