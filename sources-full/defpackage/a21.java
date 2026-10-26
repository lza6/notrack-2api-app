package defpackage;

import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes.dex */
public final class a21 extends yo4 {
    public final /* synthetic */ yo4 n;
    public final /* synthetic */ ThreadPoolExecutor o;

    public a21(yo4 yo4Var, ThreadPoolExecutor threadPoolExecutor) {
        super(12);
        this.n = yo4Var;
        this.o = threadPoolExecutor;
    }

    @Override // defpackage.yo4
    public final void L(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.o;
        try {
            this.n.L(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // defpackage.yo4
    public final void M(ir3 ir3Var) {
        ThreadPoolExecutor threadPoolExecutor = this.o;
        try {
            this.n.M(ir3Var);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
