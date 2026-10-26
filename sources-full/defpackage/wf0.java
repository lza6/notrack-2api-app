package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wf0 implements n11 {
    public final hg a;
    public final int b;

    public wf0(hg hgVar, int i) {
        this.a = hgVar;
        this.b = i;
    }

    public wf0(String str, int i) {
        this(new hg(str), i);
    }

    @Override // defpackage.n11
    public final void a(o11 o11Var) {
        int i = o11Var.d;
        hg hgVar = this.a;
        if (i != -1) {
            o11Var.d(i, o11Var.e, hgVar.d);
        } else {
            o11Var.d(o11Var.b, o11Var.c, hgVar.d);
        }
        int i2 = o11Var.b;
        int i3 = o11Var.c;
        int i4 = i2 == i3 ? i3 : -1;
        int i5 = this.b;
        int iX = py.x(i5 > 0 ? (i4 + i5) - 1 : (i4 + i5) - hgVar.d.length(), 0, o11Var.a.g());
        o11Var.f(iX, iX);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wf0)) {
            return false;
        }
        wf0 wf0Var = (wf0) obj;
        return kr1.n(this.a.d, wf0Var.a.d) && this.b == wf0Var.b;
    }

    public final int hashCode() {
        return (this.a.d.hashCode() * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommitTextCommand(text='");
        sb.append(this.a.d);
        sb.append("', newCursorPosition=");
        return fq2.p(sb, this.b, ')');
    }
}
