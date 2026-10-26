package defpackage;

import androidx.work.impl.workers.ConstraintTrackingWorker;

/* JADX INFO: loaded from: classes.dex */
public final class lm0 extends uo0 {
    public /* synthetic */ Object c;
    public final /* synthetic */ ConstraintTrackingWorker d;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lm0(ConstraintTrackingWorker constraintTrackingWorker, uo0 uo0Var) {
        super(uo0Var);
        this.d = constraintTrackingWorker;
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.h |= Integer.MIN_VALUE;
        return ConstraintTrackingWorker.d(this.d, null, null, null, this);
    }
}
