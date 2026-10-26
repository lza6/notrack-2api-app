package defpackage;

import java.io.EOFException;
import kotlin.UByte;
import kotlin.jvm.internal.LongCompanionObject;
import okio.Path$Companion;

/* JADX INFO: loaded from: classes.dex */
public final class zd1 extends tc1 {
    public static final lz h;
    public final dy d;

    static {
        lz lzVar = lz.l;
        h = Path$Companion.decodeHex("0021F904");
    }

    public zd1(ny nyVar) {
        super(nyVar);
        this.d = new dy();
    }

    public final boolean a(long j) {
        dy dyVar = this.d;
        long j2 = dyVar.d;
        if (j2 >= j) {
            return true;
        }
        long j3 = j - j2;
        return super.y(dyVar, j3) == j3;
    }

    @Override // defpackage.tc1, defpackage.wl3
    public final long y(dy dyVar, long j) throws EOFException {
        long j2;
        long j3;
        a(j);
        dy dyVar2 = this.d;
        long j4 = 0;
        if (dyVar2.d == 0) {
            return j == 0 ? 0L : -1L;
        }
        long j5 = 0;
        while (true) {
            long jP = -1;
            while (true) {
                lz lzVar = h;
                jP = this.d.p(lzVar.c[0], jP + 1, LongCompanionObject.MAX_VALUE);
                if (jP == -1) {
                    j2 = j4;
                    break;
                }
                j2 = j4;
                if (a(lzVar.c.length) && dyVar2.A(jP, lzVar, lzVar.c())) {
                    break;
                }
                j4 = j2;
            }
            if (jP == -1) {
                break;
            }
            long jY = dyVar2.y(dyVar, jP + 4);
            if (jY < j2) {
                jY = j2;
            }
            j5 += jY;
            if (a(5L) && dyVar2.l(4L) == 0 && (((dyVar2.l(2L) & UByte.MAX_VALUE) << 8) | (dyVar2.l(1L) & UByte.MAX_VALUE)) < 2) {
                dyVar.V(dyVar2.l(j2));
                dyVar.V(10);
                dyVar.V(0);
                dyVar2.skip(3L);
            }
            j4 = 0;
        }
        if (j5 < j) {
            long jY2 = dyVar2.y(dyVar, j - j5);
            j3 = 0;
            if (jY2 < 0) {
                jY2 = 0;
            }
            j5 += jY2;
        } else {
            j3 = 0;
        }
        if (j5 == j3) {
            return -1L;
        }
        return j5;
    }
}
