package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qu0 implements n11 {
    public final int a;
    public final int b;

    public qu0(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (i >= 0 && i2 >= 0) {
            return;
        }
        qo1.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.");
    }

    @Override // defpackage.n11
    public final void a(o11 o11Var) {
        int i = 0;
        for (int i2 = 0; i2 < this.a; i2++) {
            int i3 = i + 1;
            int i4 = o11Var.b;
            if (i4 <= i3) {
                i = i4;
                break;
            }
            i = (Character.isHighSurrogate(o11Var.b((i4 - i3) + (-1))) && Character.isLowSurrogate(o11Var.b(o11Var.b - i3))) ? i + 2 : i3;
        }
        int iG = 0;
        for (int i5 = 0; i5 < this.b; i5++) {
            int i6 = iG + 1;
            int i7 = o11Var.c;
            bk bkVar = o11Var.a;
            if (i7 + i6 >= bkVar.g()) {
                iG = bkVar.g() - o11Var.c;
                break;
            }
            iG = (Character.isHighSurrogate(o11Var.b((o11Var.c + i6) + (-1))) && Character.isLowSurrogate(o11Var.b(o11Var.c + i6))) ? iG + 2 : i6;
        }
        int i8 = o11Var.c;
        o11Var.a(i8, iG + i8);
        int i9 = o11Var.b;
        o11Var.a(i9 - i, i9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qu0)) {
            return false;
        }
        qu0 qu0Var = (qu0) obj;
        return this.a == qu0Var.a && this.b == qu0Var.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=");
        sb.append(this.a);
        sb.append(", lengthAfterCursor=");
        return fq2.p(sb, this.b, ')');
    }
}
