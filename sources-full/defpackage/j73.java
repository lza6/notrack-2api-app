package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class j73 implements ao1 {
    public final boolean a;
    public final float b;
    public final long c;

    public j73(boolean z, float f, long j) {
        this.a = z;
        this.b = f;
        this.c = j;
    }

    @Override // defpackage.ao1
    public final iu0 a(uq1 uq1Var) {
        return new nu0(uq1Var, this.a, this.b, new lu0(1, this));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j73)) {
            return false;
        }
        j73 j73Var = (j73) obj;
        if (this.a == j73Var.a && rx0.a(this.b, j73Var.b)) {
            return re0.c(this.c, j73Var.c);
        }
        return false;
    }

    @Override // defpackage.ao1
    public final int hashCode() {
        int iD = fq2.d(this.b, Boolean.hashCode(this.a) * 31, 961);
        int i = re0.j;
        return Long.hashCode(this.c) + iD;
    }

    @Override // defpackage.ao1, defpackage.vn1
    @cv0
    public /* bridge */ /* synthetic */ wn1 rememberUpdatedInstance(uq1 uq1Var, ck0 ck0Var, int i) {
        return super.rememberUpdatedInstance(uq1Var, ck0Var, i);
    }
}
