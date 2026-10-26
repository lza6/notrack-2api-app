package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class mp3 extends ah3 implements hn3 {
    public final void A(int i) {
        synchronized (this) {
            Object[] objArr = this.p;
            objArr.getClass();
            f(Integer.valueOf(((Number) objArr[((int) ((this.q + ((long) ((int) ((t() + ((long) this.s)) - this.q)))) - 1)) & (objArr.length - 1)]).intValue() + i));
        }
    }

    @Override // defpackage.hn3
    public final Object getValue() {
        Integer numValueOf;
        synchronized (this) {
            Object[] objArr = this.p;
            objArr.getClass();
            numValueOf = Integer.valueOf(((Number) objArr[((int) ((this.q + ((long) ((int) ((t() + ((long) this.s)) - this.q)))) - 1)) & (objArr.length - 1)]).intValue());
        }
        return numValueOf;
    }
}
