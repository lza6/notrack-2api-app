package defpackage;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.UByte;
import kotlin.UShort;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.IntCompanionObject;
import okhttp3.Protocol$Companion;

/* JADX INFO: loaded from: classes.dex */
public final class lk1 implements Closeable {
    public static final Logger l;
    public final ny c;
    public final kk1 d;
    public final ej1 h;

    static {
        Logger logger = Logger.getLogger(zj1.class.getName());
        logger.getClass();
        l = logger;
    }

    public lk1(u23 u23Var) {
        u23Var.getClass();
        this.c = u23Var;
        kk1 kk1Var = new kk1(u23Var);
        this.d = kk1Var;
        this.h = new ej1(kk1Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean a(boolean z, h90 h90Var) throws IOException {
        int i;
        boolean z2;
        int i2;
        Object[] array;
        boolean z3 = false;
        try {
            this.c.F(9L);
            int iS = ka4.s(this.c);
            if (iS > 16384) {
                m51.l(ud2.m(iS, "FRAME_SIZE_ERROR: "));
                return false;
            }
            int i3 = this.c.readByte() & UByte.MAX_VALUE;
            byte b = this.c.readByte();
            int i4 = b & UByte.MAX_VALUE;
            int i5 = this.c.readInt();
            int i6 = i5 & IntCompanionObject.MAX_VALUE;
            Logger logger = l;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(zj1.a(true, i6, iS, i3, i4));
            }
            if (z && i3 != 4) {
                StringBuilder sb = new StringBuilder("Expected a SETTINGS frame but was ");
                String[] strArr = zj1.b;
                sb.append(i3 < strArr.length ? strArr[i3] : ka4.h("0x%02x", Integer.valueOf(i3)));
                throw new IOException(sb.toString());
            }
            int i7 = 2;
            switch (i3) {
                case 0:
                    c(h90Var, iS, i4, i6);
                    return true;
                case 1:
                    l(h90Var, iS, i4, i6);
                    return true;
                case 2:
                    if (iS != 5) {
                        m51.l(ud2.q("TYPE_PRIORITY length: ", " != 5", iS));
                        return false;
                    }
                    if (i6 == 0) {
                        m51.l("TYPE_PRIORITY streamId == 0");
                        return false;
                    }
                    ny nyVar = this.c;
                    nyVar.readInt();
                    nyVar.readByte();
                    return true;
                case 3:
                    if (iS != 4) {
                        m51.l(ud2.q("TYPE_RST_STREAM length: ", " != 4", iS));
                        return false;
                    }
                    if (i6 == 0) {
                        m51.l("TYPE_RST_STREAM streamId == 0");
                        return false;
                    }
                    int i8 = this.c.readInt();
                    int[] iArrA = fq2.A(14);
                    int length = iArrA.length;
                    int i9 = 0;
                    while (true) {
                        if (i9 < length) {
                            int i10 = iArrA[i9];
                            if (fq2.z(i10) == i8) {
                                i = i10;
                            } else {
                                i9++;
                            }
                        } else {
                            i = 0;
                        }
                    }
                    if (i == 0) {
                        m51.l(ud2.m(i8, "TYPE_RST_STREAM unexpected error code: "));
                        return false;
                    }
                    ik1 ik1Var = (ik1) h90Var.h;
                    if (i6 != 0 && (i5 & 1) == 0) {
                        ik1Var.q.c(new dk1(ik1Var.h + '[' + i6 + "] onReset", ik1Var, i6, i, 1), 0L);
                        return true;
                    }
                    pk1 pk1VarH = ik1Var.h(i6);
                    if (pk1VarH == null) {
                        return true;
                    }
                    synchronized (pk1VarH) {
                        try {
                            if (i == 0) {
                                throw null;
                            }
                            if (pk1VarH.m == 0) {
                                pk1VarH.m = i;
                                pk1VarH.notifyAll();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return true;
                case 4:
                    ny nyVar2 = this.c;
                    if (i6 != 0) {
                        m51.l("TYPE_SETTINGS streamId != 0");
                        return false;
                    }
                    if ((b & 1) == 0) {
                        if (iS % 6 != 0) {
                            m51.l(ud2.m(iS, "TYPE_SETTINGS length % 6 != 0: "));
                            return false;
                        }
                        mg3 mg3Var = new mg3();
                        jq1 jq1VarT = py.T(py.X(0, iS), 6);
                        int i11 = jq1VarT.c;
                        int i12 = jq1VarT.d;
                        int i13 = jq1VarT.h;
                        if ((i13 > 0 && i11 <= i12) || (i13 < 0 && i12 <= i11)) {
                            while (true) {
                                short s = nyVar2.readShort();
                                byte[] bArr = ka4.a;
                                int i14 = s & UShort.MAX_VALUE;
                                int i15 = nyVar2.readInt();
                                if (i14 == 2) {
                                    z2 = z3;
                                    if (i15 != 0 && i15 != 1) {
                                        m51.l("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                                        return z2;
                                    }
                                } else if (i14 == 3) {
                                    z2 = z3;
                                    i14 = 4;
                                } else if (i14 == 4) {
                                    z2 = z3;
                                    if (i15 < 0) {
                                        m51.l("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                        return z2;
                                    }
                                    i14 = 7;
                                } else if (i14 != 5) {
                                    z2 = z3;
                                } else {
                                    z2 = z3;
                                    if (i15 < 16384 || i15 > 16777215) {
                                        m51.l(ud2.m(i15, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
                                        return z2;
                                    }
                                }
                                mg3Var.b(i14, i15);
                                if (i11 != i12) {
                                    i11 += i13;
                                    z3 = z2;
                                }
                            }
                        }
                        ik1 ik1Var2 = (ik1) h90Var.h;
                        ik1Var2.p.c(new ck1(fq2.r(new StringBuilder(), ik1Var2.h, " applyAndAckSettings"), h90Var, mg3Var, i7), 0L);
                        return true;
                    }
                    if (iS != 0) {
                        m51.l("FRAME_SIZE_ERROR ack frame should be empty!");
                        return false;
                    }
                    break;
                case 5:
                    p(h90Var, iS, i4, i6);
                    return true;
                case 6:
                    if (iS != 8) {
                        m51.l(ud2.m(iS, "TYPE_PING length != 8: "));
                        return false;
                    }
                    if (i6 != 0) {
                        m51.l("TYPE_PING streamId != 0");
                        return false;
                    }
                    int i16 = this.c.readInt();
                    int i17 = this.c.readInt();
                    Object[] objArr = (b & 1) != 0 ? 1 : 0;
                    ik1 ik1Var3 = (ik1) h90Var.h;
                    if (objArr == 0) {
                        ik1Var3.p.c(new dk1(fq2.r(new StringBuilder(), ((ik1) h90Var.h).h, " ping"), (ik1) h90Var.h, i16, i17, 0), 0L);
                        return true;
                    }
                    synchronized (ik1Var3) {
                        try {
                            if (i16 == 1) {
                                ik1Var3.t++;
                            } else if (i16 == 2) {
                                ik1Var3.v++;
                            } else if (i16 == 3) {
                                ik1Var3.notifyAll();
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return true;
                case 7:
                    if (iS < 8) {
                        m51.l(ud2.m(iS, "TYPE_GOAWAY length < 8: "));
                        return false;
                    }
                    if (i6 != 0) {
                        m51.l("TYPE_GOAWAY streamId != 0");
                        return false;
                    }
                    int i18 = this.c.readInt();
                    int i19 = this.c.readInt();
                    int i20 = iS - 8;
                    int[] iArrA2 = fq2.A(14);
                    int length2 = iArrA2.length;
                    int i21 = 0;
                    while (true) {
                        if (i21 < length2) {
                            i2 = iArrA2[i21];
                            if (fq2.z(i2) != i19) {
                                i21++;
                            }
                        } else {
                            i2 = 0;
                        }
                    }
                    if (i2 == 0) {
                        m51.l(ud2.m(i19, "TYPE_GOAWAY unexpected error code: "));
                        return false;
                    }
                    lz lzVarG = lz.l;
                    if (i20 > 0) {
                        lzVarG = this.c.g(i20);
                    }
                    lzVarG.getClass();
                    lzVarG.c();
                    ik1 ik1Var4 = (ik1) h90Var.h;
                    synchronized (ik1Var4) {
                        array = ik1Var4.d.values().toArray(new pk1[0]);
                        ik1Var4.n = true;
                    }
                    for (pk1 pk1Var : (pk1[]) array) {
                        if (pk1Var.a > i18 && pk1Var.g()) {
                            synchronized (pk1Var) {
                                if (pk1Var.m == 0) {
                                    pk1Var.m = 8;
                                    pk1Var.notifyAll();
                                }
                                break;
                            }
                            ((ik1) h90Var.h).h(pk1Var.a);
                        }
                    }
                    break;
                    break;
                case 8:
                    if (iS != 4) {
                        m51.l(ud2.m(iS, "TYPE_WINDOW_UPDATE length !=4: "));
                        return false;
                    }
                    long j = 2147483647L & ((long) this.c.readInt());
                    if (j == 0) {
                        m51.l("windowSizeIncrement was 0");
                        return false;
                    }
                    ik1 ik1Var5 = (ik1) h90Var.h;
                    if (i6 == 0) {
                        synchronized (ik1Var5) {
                            ik1Var5.C += j;
                            ik1Var5.notifyAll();
                        }
                        return true;
                    }
                    pk1 pk1VarC = ik1Var5.c(i6);
                    if (pk1VarC != null) {
                        synchronized (pk1VarC) {
                            pk1VarC.f += j;
                            if (j > 0) {
                                pk1VarC.notifyAll();
                            }
                            break;
                        }
                        return true;
                    }
                    break;
                default:
                    this.c.skip(iS);
                    return true;
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public final void c(h90 h90Var, int i, int i2, int i3) throws IOException {
        int i4;
        boolean z;
        boolean z2;
        if (i3 == 0) {
            m51.l("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
            return;
        }
        boolean z3 = (i2 & 1) != 0;
        if ((i2 & 32) != 0) {
            m51.l("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
            return;
        }
        if ((i2 & 8) != 0) {
            byte b = this.c.readByte();
            byte[] bArr = ka4.a;
            i4 = b & UByte.MAX_VALUE;
        } else {
            i4 = 0;
        }
        int iLengthWithoutPadding = Protocol$Companion.lengthWithoutPadding(i, i2, i4);
        ny nyVar = this.c;
        nyVar.getClass();
        ik1 ik1Var = (ik1) h90Var.h;
        if (i3 != 0 && (i3 & 1) == 0) {
            dy dyVar = new dy();
            long j = iLengthWithoutPadding;
            nyVar.F(j);
            nyVar.y(dyVar, j);
            ik1Var.q.c(new ek1(ik1Var.h + '[' + i3 + "] onData", ik1Var, i3, dyVar, iLengthWithoutPadding, z3), 0L);
        } else {
            pk1 pk1VarC = ik1Var.c(i3);
            if (pk1VarC == null) {
                ((ik1) h90Var.h).A(i3, 2);
                long j2 = iLengthWithoutPadding;
                ((ik1) h90Var.h).p(j2);
                nyVar.skip(j2);
            } else {
                byte[] bArr2 = ka4.a;
                nk1 nk1Var = pk1VarC.i;
                long j3 = iLengthWithoutPadding;
                nk1Var.getClass();
                long j4 = j3;
                while (true) {
                    pk1 pk1Var = nk1Var.n;
                    if (j4 <= 0) {
                        byte[] bArr3 = ka4.a;
                        pk1Var.b.p(j3);
                        break;
                    }
                    synchronized (pk1Var) {
                        z = nk1Var.d;
                        z2 = nk1Var.l.d + j4 > nk1Var.c;
                    }
                    if (z2) {
                        nyVar.skip(j4);
                        nk1Var.n.e(4);
                        break;
                    }
                    if (z) {
                        nyVar.skip(j4);
                        break;
                    }
                    long jY = nyVar.y(nk1Var.h, j4);
                    if (jY == -1) {
                        throw new EOFException();
                    }
                    j4 -= jY;
                    pk1 pk1Var2 = nk1Var.n;
                    synchronized (pk1Var2) {
                        try {
                            if (nk1Var.m) {
                                nk1Var.h.a();
                            } else {
                                dy dyVar2 = nk1Var.l;
                                boolean z4 = dyVar2.d == 0;
                                dyVar2.U(nk1Var.h);
                                if (z4) {
                                    pk1Var2.notifyAll();
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                if (z3) {
                    pk1VarC.i(ka4.b, true);
                }
            }
        }
        this.c.skip(i4);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.c.close();
    }

    public final List h(int i, int i2, int i3, int i4) throws IOException {
        kk1 kk1Var = this.d;
        kk1Var.m = i;
        kk1Var.d = i;
        kk1Var.n = i2;
        kk1Var.h = i3;
        kk1Var.l = i4;
        ej1 ej1Var = this.h;
        u23 u23Var = ej1Var.c;
        ArrayList arrayList = ej1Var.b;
        while (!u23Var.r()) {
            byte b = u23Var.readByte();
            byte[] bArr = ka4.a;
            int i5 = b & UByte.MAX_VALUE;
            if (i5 == 128) {
                m51.l("index == 0");
                return null;
            }
            if ((b & ByteCompanionObject.MIN_VALUE) == 128) {
                int iE = ej1Var.e(i5, 127);
                int i6 = iE - 1;
                if (i6 >= 0) {
                    rh1[] rh1VarArr = gj1.a;
                    if (i6 <= rh1VarArr.length - 1) {
                        arrayList.add(rh1VarArr[i6]);
                    }
                }
                int length = ej1Var.e + 1 + (i6 - gj1.a.length);
                if (length >= 0) {
                    rh1[] rh1VarArr2 = ej1Var.d;
                    if (length < rh1VarArr2.length) {
                        rh1 rh1Var = rh1VarArr2[length];
                        rh1Var.getClass();
                        arrayList.add(rh1Var);
                    }
                }
                m51.l(ud2.m(iE, "Header index too large "));
                return null;
            }
            if (i5 == 64) {
                rh1[] rh1VarArr3 = gj1.a;
                lz lzVarD = ej1Var.d();
                gj1.a(lzVarD);
                ej1Var.c(new rh1(lzVarD, ej1Var.d()));
            } else if ((b & 64) == 64) {
                ej1Var.c(new rh1(ej1Var.b(ej1Var.e(i5, 63) - 1), ej1Var.d()));
            } else if ((b & 32) == 32) {
                int iE2 = ej1Var.e(i5, 31);
                ej1Var.a = iE2;
                if (iE2 < 0 || iE2 > 4096) {
                    throw new IOException("Invalid dynamic table size update " + ej1Var.a);
                }
                int i7 = ej1Var.g;
                if (iE2 < i7) {
                    if (iE2 == 0) {
                        rh1[] rh1VarArr4 = ej1Var.d;
                        vl.p0(0, rh1VarArr4.length, null, rh1VarArr4);
                        ej1Var.e = ej1Var.d.length - 1;
                        ej1Var.f = 0;
                        ej1Var.g = 0;
                    } else {
                        ej1Var.a(i7 - iE2);
                    }
                }
            } else if (i5 == 16 || i5 == 0) {
                rh1[] rh1VarArr5 = gj1.a;
                lz lzVarD2 = ej1Var.d();
                gj1.a(lzVarD2);
                arrayList.add(new rh1(lzVarD2, ej1Var.d()));
            } else {
                arrayList.add(new rh1(ej1Var.b(ej1Var.e(i5, 15) - 1), ej1Var.d()));
            }
        }
        List listO0 = ke0.O0(arrayList);
        arrayList.clear();
        return listO0;
    }

    public final void l(h90 h90Var, int i, int i2, int i3) throws IOException {
        int i4;
        if (i3 == 0) {
            m51.l("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
            return;
        }
        boolean z = false;
        int i5 = 1;
        boolean z2 = (i2 & 1) != 0;
        if ((i2 & 8) != 0) {
            byte b = this.c.readByte();
            byte[] bArr = ka4.a;
            i4 = b & UByte.MAX_VALUE;
        } else {
            i4 = 0;
        }
        if ((i2 & 32) != 0) {
            ny nyVar = this.c;
            nyVar.readInt();
            nyVar.readByte();
            byte[] bArr2 = ka4.a;
            i -= 5;
        }
        List listH = h(Protocol$Companion.lengthWithoutPadding(i, i2, i4), i4, i2, i3);
        ik1 ik1Var = (ik1) h90Var.h;
        if (i3 != 0 && (i3 & 1) == 0) {
            z = true;
        }
        if (z) {
            ik1Var.q.c(new fk1(ik1Var.h + '[' + i3 + "] onHeaders", ik1Var, i3, listH, z2), 0L);
            return;
        }
        synchronized (ik1Var) {
            pk1 pk1VarC = ik1Var.c(i3);
            if (pk1VarC != null) {
                pk1VarC.i(ka4.u(listH), z2);
                return;
            }
            if (ik1Var.n) {
                return;
            }
            if (i3 <= ik1Var.l) {
                return;
            }
            if (i3 % 2 == ik1Var.m % 2) {
                return;
            }
            pk1 pk1Var = new pk1(i3, ik1Var, false, z2, ka4.u(listH));
            ik1Var.l = i3;
            ik1Var.d.put(Integer.valueOf(i3), pk1Var);
            ik1Var.o.e().c(new ck1(ik1Var.h + '[' + i3 + "] onStream", ik1Var, pk1Var, i5), 0L);
        }
    }

    public final void p(h90 h90Var, int i, int i2, int i3) throws IOException {
        int i4;
        if (i3 == 0) {
            m51.l("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
            return;
        }
        if ((i2 & 8) != 0) {
            byte b = this.c.readByte();
            byte[] bArr = ka4.a;
            i4 = b & UByte.MAX_VALUE;
        } else {
            i4 = 0;
        }
        int i5 = this.c.readInt() & IntCompanionObject.MAX_VALUE;
        List listH = h(Protocol$Companion.lengthWithoutPadding(i - 4, i2, i4), i4, i2, i3);
        ik1 ik1Var = (ik1) h90Var.h;
        synchronized (ik1Var) {
            if (ik1Var.G.contains(Integer.valueOf(i5))) {
                ik1Var.A(i5, 2);
                return;
            }
            ik1Var.G.add(Integer.valueOf(i5));
            ik1Var.q.c(new fk1(ik1Var.h + '[' + i5 + "] onRequest", ik1Var, i5, listH), 0L);
        }
    }
}
