package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class mg2 implements vb2 {
    public final lg2 a;

    public mg2(lg2 lg2Var) {
        this.a = lg2Var;
    }

    @Override // defpackage.vb2
    public final int a(er1 er1Var, List list, int i) {
        return this.a.a(er1Var, yh4.C(er1Var), i);
    }

    @Override // defpackage.vb2
    public final int b(er1 er1Var, List list, int i) {
        return this.a.b(er1Var, yh4.C(er1Var), i);
    }

    @Override // defpackage.vb2
    public final wb2 c(xb2 xb2Var, List list, long j) {
        return this.a.c(xb2Var, yh4.C(xb2Var), j);
    }

    @Override // defpackage.vb2
    public final int d(er1 er1Var, List list, int i) {
        return this.a.d(er1Var, yh4.C(er1Var), i);
    }

    @Override // defpackage.vb2
    public final int e(er1 er1Var, List list, int i) {
        return this.a.e(er1Var, yh4.C(er1Var), i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mg2) && kr1.n(this.a, ((mg2) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MultiContentMeasurePolicyImpl(measurePolicy=" + this.a + ')';
    }
}
