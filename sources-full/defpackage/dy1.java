package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class dy1 implements wb2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wb2 b;
    public final /* synthetic */ iy1 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ wb2 e;

    public /* synthetic */ dy1(wb2 wb2Var, iy1 iy1Var, int i, wb2 wb2Var2, int i2) {
        this.a = i2;
        this.c = iy1Var;
        this.d = i;
        this.e = wb2Var2;
        this.b = wb2Var;
    }

    @Override // defpackage.wb2
    public final Map a() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b.a();
    }

    @Override // defpackage.wb2
    public final void b() {
        int i = this.a;
        wb2 wb2Var = this.e;
        int i2 = this.d;
        iy1 iy1Var = this.c;
        switch (i) {
            case 0:
                iy1Var.m = i2;
                wb2Var.b();
                fi2 fi2Var = iy1Var.t;
                long[] jArr = fi2Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    while (true) {
                        long j = jArr[i3];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i4 = 8 - ((~(i3 - length)) >>> 31);
                            for (int i5 = 0; i5 < i4; i5++) {
                                if ((255 & j) < 128) {
                                    int i6 = (i3 << 3) + i5;
                                    Object obj = fi2Var.b[i6];
                                    gp3 gp3Var = (gp3) fi2Var.c[i6];
                                    int iK = iy1Var.u.k(obj);
                                    if (iK < 0 || iK >= iy1Var.m) {
                                        gp3Var.dispose();
                                        fi2Var.k(i6);
                                    }
                                }
                                j >>= 8;
                            }
                            if (i4 != 8) {
                            }
                        }
                        if (i3 != length) {
                            i3++;
                        }
                    }
                }
                break;
            default:
                iy1Var.l = i2;
                wb2Var.b();
                iy1Var.a(iy1Var.l);
                break;
        }
    }

    @Override // defpackage.wb2
    public final le1 c() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b.c();
    }

    @Override // defpackage.wb2
    public final int getHeight() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b.getHeight();
    }

    @Override // defpackage.wb2
    public final int getWidth() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b.getWidth();
    }
}
