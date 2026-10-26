package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class db3 extends w implements iq0 {
    public final so0 n;

    public db3(so0 so0Var, xp0 xp0Var) {
        super(xp0Var, true);
        this.n = so0Var;
    }

    @Override // defpackage.os1
    public final boolean J() {
        return true;
    }

    @Override // defpackage.iq0
    public final iq0 getCallerFrame() {
        so0 so0Var = this.n;
        if (so0Var instanceof iq0) {
            return (iq0) so0Var;
        }
        return null;
    }

    public void h0() {
    }

    @Override // defpackage.os1
    public void k(Object obj) {
        xp1.B(gm4.G(this.n), sf3.R(obj));
    }

    @Override // defpackage.os1
    public void l(Object obj) {
        this.n.resumeWith(sf3.R(obj));
    }
}
