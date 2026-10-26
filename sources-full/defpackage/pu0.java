package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pu0 implements n11 {
    public final int a;
    public final int b;

    public pu0(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (i >= 0 && i2 >= 0) {
            return;
        }
        qo1.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.");
    }

    @Override // defpackage.n11
    public final void a(o11 o11Var) {
        int i = o11Var.c;
        bk bkVar = o11Var.a;
        int i2 = this.b;
        int iG = i + i2;
        if (((i ^ iG) & (i2 ^ iG)) < 0) {
            iG = bkVar.g();
        }
        o11Var.a(o11Var.c, Math.min(iG, bkVar.g()));
        int i3 = o11Var.b;
        int i4 = this.a;
        int i5 = i3 - i4;
        if (((i4 ^ i3) & (i3 ^ i5)) < 0) {
            i5 = 0;
        }
        o11Var.a(Math.max(0, i5), o11Var.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pu0)) {
            return false;
        }
        pu0 pu0Var = (pu0) obj;
        return this.a == pu0Var.a && this.b == pu0Var.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeleteSurroundingTextCommand(lengthBeforeCursor=");
        sb.append(this.a);
        sb.append(", lengthAfterCursor=");
        return fq2.p(sb, this.b, ')');
    }
}
