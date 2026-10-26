package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public final class ct extends ww1 implements je1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ qe3 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ct(qe3 qe3Var, int i) {
        super(0);
        this.c = i;
        this.d = qe3Var;
    }

    @Override // defpackage.je1
    public final Object invoke() {
        int i = this.c;
        qe3 qe3Var = this.d;
        switch (i) {
            case 0:
                AtomicLong atomicLong = qe3Var.d;
                long andIncrement = atomicLong.getAndIncrement();
                while (andIncrement == 0) {
                    andIncrement = atomicLong.getAndIncrement();
                }
                return Long.valueOf(andIncrement);
            default:
                AtomicLong atomicLong2 = qe3Var.d;
                long andIncrement2 = atomicLong2.getAndIncrement();
                while (andIncrement2 == 0) {
                    andIncrement2 = atomicLong2.getAndIncrement();
                }
                return Long.valueOf(andIncrement2);
        }
    }
}
