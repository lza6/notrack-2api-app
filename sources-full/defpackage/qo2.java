package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qo2 extends of2 implements ax1 {
    public le1 c;
    public long d;

    @Override // defpackage.of2
    public final boolean getShouldAutoInvalidate() {
        return true;
    }

    @Override // defpackage.ax1
    public final void q(long j) {
        if (qq1.a(this.d, j)) {
            return;
        }
        this.c.invoke(new qq1(j));
        this.d = j;
    }
}
