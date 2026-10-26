package defpackage;

import java.net.SocketTimeoutException;
import okio.b;

/* JADX INFO: loaded from: classes.dex */
public final class ok1 extends b {
    public final /* synthetic */ pk1 m;

    public ok1(pk1 pk1Var) {
        this.m = pk1Var;
    }

    @Override // okio.b
    public final void j() {
        this.m.e(9);
        ik1 ik1Var = this.m.b;
        synchronized (ik1Var) {
            long j = ik1Var.v;
            long j2 = ik1Var.u;
            if (j < j2) {
                return;
            }
            ik1Var.u = j2 + 1;
            ik1Var.w = System.nanoTime() + 1000000000;
            ik1Var.p.c(new gk1(fq2.r(new StringBuilder(), ik1Var.h, " ping"), ik1Var, 0), 0L);
        }
    }

    public final void k() {
        if (i()) {
            throw new SocketTimeoutException("timeout");
        }
    }
}
