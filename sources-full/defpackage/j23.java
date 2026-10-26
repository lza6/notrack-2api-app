package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class j23 {
    public static final i23 c = new i23();
    public static final l0 d;

    static {
        Integer num = bs1.a;
        d = (num == null || num.intValue() >= 34) ? new kw2() : new k61();
    }

    public abstract int a(int i);

    public double b() {
        return ((((long) a(26)) << 27) + ((long) a(27))) / 9.007199254740992E15d;
    }

    public abstract int c();

    public int d(int i) {
        return e(i);
    }

    public int e(int i) {
        int iC;
        int i2;
        if (i <= 0) {
            throw new IllegalArgumentException(("Random range is empty: [" + ((Object) 0) + ", " + Integer.valueOf(i) + ").").toString());
        }
        if (i > 0 || i == Integer.MIN_VALUE) {
            if (((-i) & i) == i) {
                return a(31 - Integer.numberOfLeadingZeros(i));
            }
            do {
                iC = c() >>> 1;
                i2 = iC % i;
            } while ((i - 1) + (iC - i2) < 0);
            return i2;
        }
        while (true) {
            int iC2 = c();
            if (iC2 >= 0 && iC2 < i) {
                return iC2;
            }
        }
    }
}
