package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ge3 {
    public final long a;
    public final long b;
    public final cx1 c;
    public final boolean d;
    public final fd3 e;
    public final o90 f;
    public final jh2 g;
    public final ArrayList h;
    public int i;
    public int j;
    public int k;

    public ge3(long j, long j2, cx1 cx1Var, boolean z, fd3 fd3Var, o90 o90Var) {
        this.a = j;
        this.b = j2;
        this.c = cx1Var;
        this.d = z;
        this.e = fd3Var;
        this.f = o90Var;
        int i = z72.a;
        this.g = new jh2(6);
        this.h = new ArrayList();
        this.i = -1;
        this.j = -1;
        this.k = -1;
    }

    public final int a(int i, ew0 ew0Var, ew0 ew0Var2) {
        if (i == -1) {
            int iOrdinal = p23.W(ew0Var, ew0Var2).ordinal();
            if (iOrdinal == 0) {
                return this.k - 1;
            }
            if (iOrdinal == 1) {
                return this.k;
            }
            if (iOrdinal != 2) {
                u41.e();
                return 0;
            }
        }
        return i;
    }
}
