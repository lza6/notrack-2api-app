package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class q73 implements cq3, bq3 {
    public static final TreeMap q = new TreeMap();
    public final int c;
    public volatile String d;
    public final long[] h;
    public final double[] l;
    public final String[] m;
    public final byte[][] n;
    public final int[] o;
    public int p;

    public q73(int i) {
        this.c = i;
        int i2 = i + 1;
        this.o = new int[i2];
        this.h = new long[i2];
        this.l = new double[i2];
        this.m = new String[i2];
        this.n = new byte[i2][];
    }

    public static final q73 a(int i, String str) {
        TreeMap treeMap = q;
        synchronized (treeMap) {
            Map.Entry entryCeilingEntry = treeMap.ceilingEntry(Integer.valueOf(i));
            if (entryCeilingEntry == null) {
                q73 q73Var = new q73(i);
                q73Var.d = str;
                q73Var.p = i;
                return q73Var;
            }
            treeMap.remove(entryCeilingEntry.getKey());
            q73 q73Var2 = (q73) entryCeilingEntry.getValue();
            q73Var2.getClass();
            q73Var2.d = str;
            q73Var2.p = i;
            return q73Var2;
        }
    }

    @Override // defpackage.bq3
    public final void C(int i, byte[] bArr) {
        this.o[i] = 5;
        this.n[i] = bArr;
    }

    @Override // defpackage.cq3
    public final String c() {
        String str = this.d;
        if (str != null) {
            return str;
        }
        u41.r("Required value was null.");
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // defpackage.cq3
    public final void h(bq3 bq3Var) {
        int i = this.p;
        if (1 > i) {
            return;
        }
        int i2 = 1;
        while (true) {
            int i3 = this.o[i2];
            if (i3 == 1) {
                bq3Var.m(i2);
            } else if (i3 == 2) {
                bq3Var.s(this.h[i2], i2);
            } else if (i3 == 3) {
                bq3Var.k(this.l[i2], i2);
            } else if (i3 == 4) {
                String str = this.m[i2];
                if (str == null) {
                    u41.k("Required value was null.");
                    return;
                }
                bq3Var.i(i2, str);
            } else if (i3 == 5) {
                byte[] bArr = this.n[i2];
                if (bArr == null) {
                    u41.k("Required value was null.");
                    return;
                }
                bq3Var.C(i2, bArr);
            }
            if (i2 == i) {
                return;
            } else {
                i2++;
            }
        }
    }

    @Override // defpackage.bq3
    public final void i(int i, String str) {
        str.getClass();
        this.o[i] = 4;
        this.m[i] = str;
    }

    @Override // defpackage.bq3
    public final void k(double d, int i) {
        this.o[i] = 3;
        this.l[i] = d;
    }

    public final void l() {
        TreeMap treeMap = q;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.c), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator it = treeMap.descendingKeySet().iterator();
                it.getClass();
                while (true) {
                    int i = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i;
                }
            }
        }
    }

    @Override // defpackage.bq3
    public final void m(int i) {
        this.o[i] = 1;
    }

    @Override // defpackage.bq3
    public final void s(long j, int i) {
        this.o[i] = 2;
        this.h[i] = j;
    }
}
