package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jg3 implements n11 {
    public final int a;
    public final int b;

    public jg3(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.n11
    public final void a(o11 o11Var) {
        boolean z = o11Var.d != -1;
        bk bkVar = o11Var.a;
        if (z) {
            o11Var.d = -1;
            o11Var.e = -1;
        }
        int iX = py.x(this.a, 0, bkVar.g());
        int iX2 = py.x(this.b, 0, bkVar.g());
        if (iX != iX2) {
            if (iX < iX2) {
                o11Var.e(iX, iX2);
            } else {
                o11Var.e(iX2, iX);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jg3)) {
            return false;
        }
        jg3 jg3Var = (jg3) obj;
        return this.a == jg3Var.a && this.b == jg3Var.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetComposingRegionCommand(start=");
        sb.append(this.a);
        sb.append(", end=");
        return fq2.p(sb, this.b, ')');
    }
}
