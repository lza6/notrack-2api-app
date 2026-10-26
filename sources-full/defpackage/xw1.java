package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class xw1 implements a53 {
    public final ne1 c;
    public final qo0 d;
    public ym3 h;

    public xw1(xp0 xp0Var, ne1 ne1Var) {
        this.c = ne1Var;
        this.d = yo4.a(xp0Var);
    }

    @Override // defpackage.a53
    public final void a() {
        ym3 ym3Var = this.h;
        if (ym3Var != null) {
            CancellationException cancellationException = new CancellationException("Old job was still running!");
            cancellationException.initCause(null);
            ym3Var.c(cancellationException);
        }
        this.h = py.F(this.d, null, null, this.c, 3);
    }

    @Override // defpackage.a53
    public final void b() {
        ym3 ym3Var = this.h;
        if (ym3Var != null) {
            ym3Var.q(new qc1(1));
        }
        this.h = null;
    }

    @Override // defpackage.a53
    public final void d() {
        ym3 ym3Var = this.h;
        if (ym3Var != null) {
            ym3Var.q(new qc1(1));
        }
        this.h = null;
    }
}
