package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class kg3 implements n11 {
    public final hg a;
    public final int b;

    public kg3(String str, int i) {
        this.a = new hg(str);
        this.b = i;
    }

    @Override // defpackage.n11
    public final void a(o11 o11Var) {
        int i = o11Var.d;
        hg hgVar = this.a;
        if (i != -1) {
            int i2 = o11Var.e;
            String str = hgVar.d;
            String str2 = hgVar.d;
            o11Var.d(i, i2, str);
            if (str2.length() > 0) {
                o11Var.e(i, str2.length() + i);
            }
        } else {
            int i3 = o11Var.b;
            int i4 = o11Var.c;
            String str3 = hgVar.d;
            String str4 = hgVar.d;
            o11Var.d(i3, i4, str3);
            if (str4.length() > 0) {
                o11Var.e(i3, str4.length() + i3);
            }
        }
        int i5 = o11Var.b;
        int i6 = o11Var.c;
        int i7 = i5 == i6 ? i6 : -1;
        int i8 = this.b;
        int iX = py.x(i8 > 0 ? (i7 + i8) - 1 : (i7 + i8) - hgVar.d.length(), 0, o11Var.a.g());
        o11Var.f(iX, iX);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kg3)) {
            return false;
        }
        kg3 kg3Var = (kg3) obj;
        return kr1.n(this.a.d, kg3Var.a.d) && this.b == kg3Var.b;
    }

    public final int hashCode() {
        return (this.a.d.hashCode() * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetComposingTextCommand(text='");
        sb.append(this.a.d);
        sb.append("', newCursorPosition=");
        return fq2.p(sb, this.b, ')');
    }
}
