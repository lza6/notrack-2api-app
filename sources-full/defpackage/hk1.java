package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class hk1 extends ss3 {
    public final /* synthetic */ ik1 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ long g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hk1(String str, ik1 ik1Var, int i, long j) {
        super(str, true);
        this.e = ik1Var;
        this.f = i;
        this.g = j;
    }

    @Override // defpackage.ss3
    public final long a() {
        ik1 ik1Var = this.e;
        try {
            ik1Var.E.K(this.g, this.f);
            return -1L;
        } catch (IOException e) {
            ik1Var.a(2, 2, e);
            return -1L;
        }
    }
}
