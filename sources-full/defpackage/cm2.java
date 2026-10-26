package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class cm2 extends x implements gs1 {
    public static final cm2 c = new cm2(bg1.s);

    @Override // defpackage.gs1
    public final yw0 A(le1 le1Var) {
        return dm2.c;
    }

    @Override // defpackage.gs1
    public final Object K(uo0 uo0Var) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // defpackage.gs1
    public final yw0 O(boolean z, boolean z2, l lVar) {
        return dm2.c;
    }

    @Override // defpackage.gs1
    public final boolean a() {
        return true;
    }

    @Override // defpackage.gs1
    public final void c(CancellationException cancellationException) {
    }

    @Override // defpackage.gs1
    public final boolean isCancelled() {
        return false;
    }

    @Override // defpackage.gs1
    public final ub0 p(os1 os1Var) {
        return dm2.c;
    }

    @Override // defpackage.gs1
    public final boolean start() {
        return false;
    }

    public final String toString() {
        return "NonCancellable";
    }

    @Override // defpackage.gs1
    public final CancellationException x() {
        throw new IllegalStateException("This job is always active");
    }
}
