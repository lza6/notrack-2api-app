package defpackage;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class l94 extends n94 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l94(Unsafe unsafe, int i) {
        super(unsafe);
        this.b = i;
    }

    @Override // defpackage.n94
    public final boolean c(Object obj, long j) {
        switch (this.b) {
            case 0:
                if (o94.g) {
                    if (o94.h(obj, j) == 0) {
                        return false;
                    }
                } else if (o94.i(obj, j) == 0) {
                    return false;
                }
                return true;
            default:
                if (o94.g) {
                    if (o94.h(obj, j) == 0) {
                        return false;
                    }
                } else if (o94.i(obj, j) == 0) {
                    return false;
                }
                return true;
        }
    }

    @Override // defpackage.n94
    public final byte d(Object obj, long j) {
        switch (this.b) {
            case 0:
                return o94.g ? o94.h(obj, j) : o94.i(obj, j);
            default:
                return o94.g ? o94.h(obj, j) : o94.i(obj, j);
        }
    }

    @Override // defpackage.n94
    public final double e(Object obj, long j) {
        switch (this.b) {
            case 0:
                break;
        }
        return Double.longBitsToDouble(h(obj, j));
    }

    @Override // defpackage.n94
    public final float f(Object obj, long j) {
        switch (this.b) {
            case 0:
                break;
        }
        return Float.intBitsToFloat(g(obj, j));
    }

    @Override // defpackage.n94
    public final void k(Object obj, long j, boolean z) {
        switch (this.b) {
            case 0:
                if (!o94.g) {
                    o94.m(obj, j, z ? (byte) 1 : (byte) 0);
                } else {
                    o94.l(obj, j, z ? (byte) 1 : (byte) 0);
                }
                break;
            default:
                if (!o94.g) {
                    o94.m(obj, j, z ? (byte) 1 : (byte) 0);
                } else {
                    o94.l(obj, j, z ? (byte) 1 : (byte) 0);
                }
                break;
        }
    }

    @Override // defpackage.n94
    public final void l(Object obj, long j, byte b) {
        switch (this.b) {
            case 0:
                if (!o94.g) {
                    o94.m(obj, j, b);
                } else {
                    o94.l(obj, j, b);
                }
                break;
            default:
                if (!o94.g) {
                    o94.m(obj, j, b);
                } else {
                    o94.l(obj, j, b);
                }
                break;
        }
    }

    @Override // defpackage.n94
    public final void m(Object obj, long j, double d) {
        switch (this.b) {
            case 0:
                p(obj, j, Double.doubleToLongBits(d));
                break;
            default:
                p(obj, j, Double.doubleToLongBits(d));
                break;
        }
    }

    @Override // defpackage.n94
    public final void n(Object obj, long j, float f) {
        switch (this.b) {
            case 0:
                o(Float.floatToIntBits(f), j, obj);
                break;
            default:
                o(Float.floatToIntBits(f), j, obj);
                break;
        }
    }

    @Override // defpackage.n94
    public final boolean s() {
        switch (this.b) {
        }
        return false;
    }
}
