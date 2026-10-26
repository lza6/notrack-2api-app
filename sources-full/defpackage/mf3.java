package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes.dex */
public final class mf3 extends vc3 {
    public final /* synthetic */ AtomicReferenceArray g;

    public mf3(long j, mf3 mf3Var, int i) {
        super(j, mf3Var, i);
        this.g = new AtomicReferenceArray(lf3.f);
    }

    @Override // defpackage.vc3
    public final int k() {
        return lf3.f;
    }

    @Override // defpackage.vc3
    public final void l(int i, xp0 xp0Var) {
        this.g.set(i, lf3.e);
        m();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.e + ", hashCode=" + hashCode() + ']';
    }
}
