package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class r71 extends tc1 {
    public final long d;
    public final boolean h;
    public long l;

    public r71(wl3 wl3Var, long j, boolean z) {
        super(wl3Var);
        this.d = j;
        this.h = z;
    }

    @Override // defpackage.tc1, defpackage.wl3
    public final long y(dy dyVar, long j) throws IOException {
        dyVar.getClass();
        long j2 = this.l;
        long j3 = this.d;
        if (j2 > j3) {
            j = 0;
        } else if (this.h) {
            long j4 = j3 - j2;
            if (j4 == 0) {
                return -1L;
            }
            j = Math.min(j, j4);
        }
        long jY = this.c.y(dyVar, j);
        if (jY != -1) {
            this.l += jY;
        }
        long j5 = this.l;
        if ((j5 >= j3 || jY != -1) && j5 <= j3) {
            return jY;
        }
        if (jY > 0 && j5 > j3) {
            long j6 = dyVar.d - (j5 - j3);
            dy dyVar2 = new dy();
            dyVar2.U(dyVar);
            dyVar.d(dyVar2, j6);
            dyVar2.a();
        }
        throw new IOException("expected " + j3 + " bytes but got " + this.l);
    }
}
