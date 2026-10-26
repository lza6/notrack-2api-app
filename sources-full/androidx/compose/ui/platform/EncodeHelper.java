package androidx.compose.ui.platform;

import android.os.Parcel;
import android.util.Base64;
import defpackage.em3;
import defpackage.gc1;
import defpackage.hc1;
import defpackage.hy3;
import defpackage.ic1;
import defpackage.iy3;
import defpackage.pg3;
import defpackage.re0;
import defpackage.tt3;
import defpackage.yz3;
import defpackage.zr;
import defpackage.zz3;

/* JADX INFO: loaded from: classes.dex */
public final class EncodeHelper {
    public static final int $stable = 8;
    private Parcel parcel = Parcel.obtain();

    public final void encode(byte b) {
        this.parcel.writeByte(b);
    }

    public final void encode(float f) {
        this.parcel.writeFloat(f);
    }

    public final void encode(int i) {
        this.parcel.writeInt(i);
    }

    public final void encode(em3 em3Var) {
        hy3 hy3Var = em3Var.a;
        long j = em3Var.l;
        long j2 = em3Var.h;
        long j3 = em3Var.b;
        long jA = hy3Var.a();
        int i = re0.j;
        long j4 = re0.i;
        if (!re0.c(jA, j4)) {
            encode((byte) 1);
            m75x879511aa(em3Var.a.a());
        }
        zz3[] zz3VarArr = yz3.b;
        long j5 = yz3.c;
        if (!yz3.a(j3, j5)) {
            encode((byte) 2);
            m72x2b3e7c16(j3);
        }
        ic1 ic1Var = em3Var.c;
        if (ic1Var != null) {
            encode((byte) 3);
            encode(ic1Var);
        }
        gc1 gc1Var = em3Var.d;
        if (gc1Var != null) {
            int i2 = gc1Var.a;
            encode((byte) 4);
            m77xe0945964(i2);
        }
        hc1 hc1Var = em3Var.e;
        if (hc1Var != null) {
            int i3 = hc1Var.a;
            encode((byte) 5);
            m74x3aa36263(i3);
        }
        String str = em3Var.g;
        if (str != null) {
            encode((byte) 6);
            encode(str);
        }
        if (!yz3.a(j2, j5)) {
            encode((byte) 7);
            m72x2b3e7c16(j2);
        }
        zr zrVar = em3Var.i;
        if (zrVar != null) {
            float f = zrVar.a;
            encode((byte) 8);
            m73x88da5c90(f);
        }
        iy3 iy3Var = em3Var.j;
        if (iy3Var != null) {
            encode((byte) 9);
            encode(iy3Var);
        }
        if (!re0.c(j, j4)) {
            encode((byte) 10);
            m75x879511aa(j);
        }
        tt3 tt3Var = em3Var.m;
        if (tt3Var != null) {
            encode((byte) 11);
            encode(tt3Var);
        }
        pg3 pg3Var = em3Var.n;
        if (pg3Var != null) {
            encode((byte) 12);
            encode(pg3Var);
        }
    }

    public final void encode(ic1 ic1Var) {
        encode(ic1Var.c);
    }

    public final void encode(iy3 iy3Var) {
        encode(iy3Var.a);
        encode(iy3Var.b);
    }

    public final void encode(String str) {
        this.parcel.writeString(str);
    }

    public final void encode(pg3 pg3Var) {
        m75x879511aa(pg3Var.a);
        long j = pg3Var.b;
        encode(Float.intBitsToFloat((int) (j >> 32)));
        encode(Float.intBitsToFloat((int) (j & 4294967295L)));
        encode(pg3Var.c);
    }

    public final void encode(tt3 tt3Var) {
        encode(tt3Var.a);
    }

    /* JADX INFO: renamed from: encode--R2X_6o, reason: not valid java name */
    public final void m72x2b3e7c16(long j) {
        long jB = yz3.b(j);
        byte b = 0;
        if (!zz3.a(jB, 0L)) {
            if (zz3.a(jB, 4294967296L)) {
                b = 1;
            } else if (zz3.a(jB, 8589934592L)) {
                b = 2;
            }
        }
        encode(b);
        if (zz3.a(yz3.b(j), 0L)) {
            return;
        }
        encode(yz3.c(j));
    }

    /* JADX INFO: renamed from: encode-4Dl_Bck, reason: not valid java name */
    public final void m73x88da5c90(float f) {
        encode(f);
    }

    /* JADX INFO: renamed from: encode-6p3vJLY, reason: not valid java name */
    public final void m74x3aa36263(int i) {
        byte b = 0;
        if (i != 0) {
            if (i == 65535) {
                b = 1;
            } else if (i == 1) {
                b = 2;
            } else if (i == 2) {
                b = 3;
            }
        }
        encode(b);
    }

    /* JADX INFO: renamed from: encode-8_81llA, reason: not valid java name */
    public final void m75x879511aa(long j) {
        m76x9a5f9a11(j);
    }

    /* JADX INFO: renamed from: encode-VKZWuLQ, reason: not valid java name */
    public final void m76x9a5f9a11(long j) {
        this.parcel.writeLong(j);
    }

    /* JADX INFO: renamed from: encode-nzbMABs, reason: not valid java name */
    public final void m77xe0945964(int i) {
        byte b = 0;
        if (i != 0 && i == 1) {
            b = 1;
        }
        encode(b);
    }

    public final String encodedString() {
        return Base64.encodeToString(this.parcel.marshall(), 0);
    }

    public final void reset() {
        this.parcel.recycle();
        this.parcel = Parcel.obtain();
    }
}
