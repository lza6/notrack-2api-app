package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class n22 extends ym3 {
    public final so0 n;

    public n22(xp0 xp0Var, ne1 ne1Var) {
        super(xp0Var, false);
        this.n = gm4.o(this, this, ne1Var);
    }

    @Override // defpackage.os1
    public final void T() throws Throwable {
        try {
            xp1.B(gm4.G(this.n), w84.a);
        } catch (Throwable th) {
            th = th;
            if (th instanceof mw0) {
                th = ((mw0) th).c;
            }
            resumeWith(g13.w(th));
            throw th;
        }
    }
}
