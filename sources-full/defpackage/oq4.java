package defpackage;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class oq4 extends qq4 {
    @Override // defpackage.qq4
    public final double e(Object obj, long j) {
        return Double.longBitsToDouble(((Unsafe) this.a).getLong(obj, j));
    }

    @Override // defpackage.qq4
    public final float f(Object obj, long j) {
        return Float.intBitsToFloat(((Unsafe) this.a).getInt(obj, j));
    }

    @Override // defpackage.qq4
    public final void g(Object obj, long j, boolean z) {
        if (rq4.e) {
            rq4.f(obj, j, z);
        } else {
            rq4.g(obj, j, z);
        }
    }

    @Override // defpackage.qq4
    public final void h(Object obj, long j, double d) {
        ((Unsafe) this.a).putLong(obj, j, Double.doubleToLongBits(d));
    }

    @Override // defpackage.qq4
    public final void i(Object obj, long j, float f) {
        ((Unsafe) this.a).putInt(obj, j, Float.floatToIntBits(f));
    }

    @Override // defpackage.qq4
    public final boolean j(Object obj, long j) {
        return rq4.e ? rq4.k(obj, j) : rq4.l(obj, j);
    }
}
