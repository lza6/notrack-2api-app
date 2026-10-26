package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lg3 implements n11 {
    public final int a;
    public final int b;

    public lg3(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.n11
    public final void a(o11 o11Var) {
        int iX = py.x(this.a, 0, o11Var.a.g());
        int iX2 = py.x(this.b, 0, o11Var.a.g());
        if (iX < iX2) {
            o11Var.f(iX, iX2);
        } else {
            o11Var.f(iX2, iX);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lg3)) {
            return false;
        }
        lg3 lg3Var = (lg3) obj;
        return this.a == lg3Var.a && this.b == lg3Var.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetSelectionCommand(start=");
        sb.append(this.a);
        sb.append(", end=");
        return fq2.p(sb, this.b, ')');
    }
}
