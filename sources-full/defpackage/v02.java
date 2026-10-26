package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class v02 implements gn3 {
    public final int c;
    public final int d;
    public final ft2 h;
    public int l;

    public v02(int i, int i2, int i3) {
        this.c = i2;
        this.d = i3;
        int i4 = (i / i2) * i2;
        this.h = new ft2(py.X(Math.max(i4 - i3, 0), i4 + i2 + i3), t73.A);
        this.l = i;
    }

    public final void b(int i) {
        if (i != this.l) {
            this.l = i;
            int i2 = this.c;
            int i3 = (i / i2) * i2;
            int i4 = this.d;
            this.h.setValue(py.X(Math.max(i3 - i4, 0), i3 + i2 + i4));
        }
    }

    @Override // defpackage.gn3
    public final Object getValue() {
        return (lq1) this.h.getValue();
    }
}
