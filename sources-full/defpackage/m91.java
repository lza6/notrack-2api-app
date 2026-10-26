package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class m91 {
    public final int a;
    public final y91 b;
    public final long c;
    public final int d;
    public final int e;
    public final int f;

    public m91(int i, y91 y91Var, long j, int i2, int i3, int i4) {
        this.a = i;
        this.b = y91Var;
        this.c = j;
        this.d = i2;
        this.e = i3;
        this.f = i4;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x003a  */
    public final k91 a(l91 l91Var, boolean z, int i, int i2, int i3, int i4) {
        k91 k91Var;
        qb2 qb2Var;
        dq1 dq1Var;
        nv2 nv2Var;
        if (l91Var.b) {
            y91 y91Var = this.b;
            int iOrdinal = y91Var.a.ordinal();
            boolean z2 = true;
            if (iOrdinal == 0 || iOrdinal == 1) {
                k91Var = null;
            } else {
                if (iOrdinal != 2 && iOrdinal != 3) {
                    u41.e();
                    return null;
                }
                if (z) {
                    qb2Var = y91Var.d;
                    dq1Var = y91Var.h;
                    nv2Var = y91Var.e;
                } else {
                    qb2Var = (i < y91Var.b - 1 || i2 < y91Var.c) ? null : y91Var.f;
                    dq1Var = y91Var.i;
                    nv2Var = y91Var.g;
                }
                if (qb2Var == null) {
                    k91Var = null;
                } else {
                    dq1Var.getClass();
                    k91Var = new k91(qb2Var, nv2Var, dq1Var.a);
                }
            }
            if (k91Var != null) {
                if (i < 0 || (i4 != 0 && (i3 - ((int) (k91Var.c >> 32)) < 0 || i4 >= this.a))) {
                    z2 = false;
                }
                k91Var.d = z2;
                return k91Var;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0059, code lost:
    
        if ((((int) (r22 >> 32)) - ((int) (r5 >> 32))) < 0) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.l91 b(boolean r20, int r21, long r22, defpackage.dq1 r24, int r25, int r26, int r27, boolean r28, boolean r29) {
        /*
            Method dump skipped, instruction units count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m91.b(boolean, int, long, dq1, int, int, int, boolean, boolean):l91");
    }
}
