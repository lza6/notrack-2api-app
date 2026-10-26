package defpackage;

import androidx.work.impl.workers.ConstraintTrackingWorker;

/* JADX INFO: loaded from: classes.dex */
public final class mm0 extends uo0 {
    public ConstraintTrackingWorker c;
    public s62 d;
    public /* synthetic */ Object h;
    public final /* synthetic */ ConstraintTrackingWorker l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mm0(ConstraintTrackingWorker constraintTrackingWorker, uo0 uo0Var) {
        super(uo0Var);
        this.l = constraintTrackingWorker;
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.m |= Integer.MIN_VALUE;
        return ConstraintTrackingWorker.e(this.l, this);
    }
}
