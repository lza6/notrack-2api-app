package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public interface gs1 extends vp0 {
    yw0 A(le1 le1Var);

    Object K(uo0 uo0Var);

    yw0 O(boolean z, boolean z2, l lVar);

    boolean a();

    void c(CancellationException cancellationException);

    boolean isCancelled();

    ub0 p(os1 os1Var);

    boolean start();

    CancellationException x();
}
