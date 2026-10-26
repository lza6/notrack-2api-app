package defpackage;

import ai.notrack.app.R;
import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.e;
import androidx.compose.runtime.Composer$Companion;
import androidx.compose.ui.c;
import kotlin.io.ConstantsKt;
import kotlin.uuid.Uuid;
import org.scilab.forge.jlatexmath.FontInfo;

/* JADX INFO: loaded from: classes.dex */
public final class ow {
    public static final ow a = new ow();

    /* JADX WARN: Code duplicated, block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:28:0x004e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    /* JADX WARN: Code duplicated, block: B:32:0x005a  */
    /* JADX WARN: Code duplicated, block: B:33:0x005d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0064  */
    /* JADX WARN: Code duplicated, block: B:39:0x0068  */
    /* JADX WARN: Code duplicated, block: B:41:0x0070  */
    /* JADX WARN: Code duplicated, block: B:42:0x0073  */
    /* JADX WARN: Code duplicated, block: B:45:0x0079  */
    /* JADX WARN: Code duplicated, block: B:48:0x007f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0083  */
    /* JADX WARN: Code duplicated, block: B:52:0x008b  */
    /* JADX WARN: Code duplicated, block: B:53:0x008e  */
    /* JADX WARN: Code duplicated, block: B:56:0x0094  */
    /* JADX WARN: Code duplicated, block: B:59:0x009c  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d0 A[PHI: r1 r2 r3 r7 r9
  0x00d0: PHI (r1v6 androidx.compose.ui.c) = (r1v3 androidx.compose.ui.c), (r1v9 androidx.compose.ui.c) binds: [B:89:0x00f5, B:74:0x00ce] A[DONT_GENERATE, DONT_INLINE]
  0x00d0: PHI (r2v9 float) = (r2v5 float), (r2v10 float) binds: [B:89:0x00f5, B:74:0x00ce] A[DONT_GENERATE, DONT_INLINE]
  0x00d0: PHI (r3v20 int) = (r3v13 int), (r3v22 int) binds: [B:89:0x00f5, B:74:0x00ce] A[DONT_GENERATE, DONT_INLINE]
  0x00d0: PHI (r7v6 float) = (r7v3 float), (r7v2 float) binds: [B:89:0x00f5, B:74:0x00ce] A[DONT_GENERATE, DONT_INLINE]
  0x00d0: PHI (r9v14 rg3) = (r9v7 rg3), (r9v6 rg3) binds: [B:89:0x00f5, B:74:0x00ce] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:77:0x00d3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:81:0x00db  */
    /* JADX WARN: Code duplicated, block: B:82:0x00de  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:87:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:93:0x011f  */
    /* JADX WARN: Code duplicated, block: B:95:0x0125  */
    /* JADX WARN: Code duplicated, block: B:99:0x0164  */
    /* JADX INFO: renamed from: DragHandle-lgZ2HuY, reason: not valid java name */
    public final void m1798xf62375e8(c cVar, float f, float f2, rg3 rg3Var, long j, ck0 ck0Var, int i, int i2) {
        c cVar2;
        int i3;
        float f3;
        int i4;
        float f4;
        int i5;
        rg3 rg3Var2;
        long j2;
        c cVar3;
        float f5;
        long value;
        String strM1830xa862b2cd;
        int i6;
        boolean zH;
        Object objP;
        kk0 kk0Var;
        float f6;
        float f7;
        rg3 rg3Var3;
        long j3;
        w33 w33VarV;
        int i7;
        kk0 kk0Var2 = (kk0) ck0Var;
        kk0Var2.c0(-1364277227);
        int i8 = i2 & 1;
        if (i8 != 0) {
            i3 = i | 6;
            cVar2 = cVar;
        } else if ((i & 6) == 0) {
            cVar2 = cVar;
            i3 = (kk0Var2.h(cVar2) ? 4 : 2) | i;
        } else {
            cVar2 = cVar;
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 == 0) {
            if ((i & 48) == 0) {
                f3 = f;
                i3 |= kk0Var2.e(f3) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    f4 = f2;
                    if (kk0Var2.e(f4)) {
                        i5 = FontInfo.NUMBER_OF_CHAR_CODES;
                    } else {
                        i5 = Uuid.SIZE_BITS;
                    }
                    i3 |= i5;
                }
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        rg3Var2 = rg3Var;
                        int i10 = kk0Var2.h(rg3Var2) ? 2048 : 1024;
                        i3 |= i10;
                    } else {
                        rg3Var2 = rg3Var;
                    }
                    i3 |= i10;
                } else {
                    rg3Var2 = rg3Var;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        j2 = j;
                        if (kk0Var2.g(j2)) {
                            i7 = 16384;
                        }
                        i3 |= i7;
                    } else {
                        j2 = j;
                    }
                    i7 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                    i3 |= i7;
                } else {
                    j2 = j;
                }
                if ((i3 & 9363) == 9362 || !kk0Var2.F()) {
                    kk0Var2.X();
                    if ((i & 1) != 0 || kk0Var2.D()) {
                        if (i8 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i9 != 0) {
                            f5 = 32.0f;
                        } else {
                            f5 = f3;
                        }
                        if (i4 != 0) {
                            f4 = 4.0f;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            rg3Var2 = ab2.a.getShapes(kk0Var2, 6).e;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            value = af0.getValue(ze0.o, kk0Var2, 6);
                        }
                        rg3 rg3Var4 = rg3Var2;
                        kk0Var2.s();
                        strM1830xa862b2cd = uo3.m1830xa862b2cd(R.string.m3c_bottom_sheet_drag_handle_description, kk0Var2, 0);
                        t64 t64Var = fh3.a;
                        i6 = 1;
                        c cVarM = a.m(cVar3, 0.0f, 22.0f, 1);
                        zH = kk0Var2.h(strM1830xa862b2cd);
                        objP = kk0Var2.P();
                        if (zH || objP == Composer$Companion.getEmpty()) {
                            objP = new v7(strM1830xa862b2cd, i6);
                            kk0Var2.l0(objP);
                        }
                        int i11 = i3 >> 6;
                        kk0Var = kk0Var2;
                        hq3.m210x8dcae10(we3.b(cVarM, false, (le1) objP), rg3Var4, value, 0L, 0.0f, 0.0f, null, zg0.rememberComposableLambda(-1039573072, true, new mw(f5, f4), kk0Var2, 54), kk0Var, (i11 & 112) | 12582912 | (i11 & 896), 120);
                        f6 = f5;
                        f7 = f4;
                        rg3Var3 = rg3Var4;
                        j3 = value;
                        cVar2 = cVar3;
                    } else {
                        kk0Var2.V();
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        cVar3 = cVar2;
                        f5 = f3;
                    }
                    value = j2;
                    rg3 rg3Var5 = rg3Var2;
                    kk0Var2.s();
                    strM1830xa862b2cd = uo3.m1830xa862b2cd(R.string.m3c_bottom_sheet_drag_handle_description, kk0Var2, 0);
                    t64 t64Var2 = fh3.a;
                    i6 = 1;
                    c cVarM2 = a.m(cVar3, 0.0f, 22.0f, 1);
                    zH = kk0Var2.h(strM1830xa862b2cd);
                    objP = kk0Var2.P();
                    if (zH) {
                        objP = new v7(strM1830xa862b2cd, i6);
                        kk0Var2.l0(objP);
                    } else {
                        objP = new v7(strM1830xa862b2cd, i6);
                        kk0Var2.l0(objP);
                    }
                    int i12 = i3 >> 6;
                    kk0Var = kk0Var2;
                    hq3.m210x8dcae10(we3.b(cVarM2, false, (le1) objP), rg3Var5, value, 0L, 0.0f, 0.0f, null, zg0.rememberComposableLambda(-1039573072, true, new mw(f5, f4), kk0Var2, 54), kk0Var, (i12 & 112) | 12582912 | (i12 & 896), 120);
                    f6 = f5;
                    f7 = f4;
                    rg3Var3 = rg3Var5;
                    j3 = value;
                    cVar2 = cVar3;
                } else {
                    kk0Var2.V();
                    kk0Var = kk0Var2;
                    f6 = f3;
                    f7 = f4;
                    rg3Var3 = rg3Var2;
                    j3 = j2;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new nw(this, cVar2, f6, f7, rg3Var3, j3, i, i2));
                }
            }
            i3 |= 384;
            f4 = f2;
            if ((i & 3072) == 0) {
                if ((i2 & 8) == 0) {
                    rg3Var2 = rg3Var;
                    if (kk0Var2.h(rg3Var2)) {
                    }
                    i3 |= i10;
                } else {
                    rg3Var2 = rg3Var;
                }
                i3 |= i10;
            } else {
                rg3Var2 = rg3Var;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    j2 = j;
                    if (kk0Var2.g(j2)) {
                        i7 = 16384;
                    }
                    i3 |= i7;
                } else {
                    j2 = j;
                }
                i7 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                i3 |= i7;
            } else {
                j2 = j;
            }
            if ((i3 & 9363) == 9362) {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i8 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i9 != 0) {
                        f5 = 32.0f;
                    } else {
                        f5 = f3;
                    }
                    if (i4 != 0) {
                        f4 = 4.0f;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        rg3Var2 = ab2.a.getShapes(kk0Var2, 6).e;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        value = af0.getValue(ze0.o, kk0Var2, 6);
                    } else {
                        value = j2;
                    }
                } else {
                    if (i8 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i9 != 0) {
                        f5 = 32.0f;
                    } else {
                        f5 = f3;
                    }
                    if (i4 != 0) {
                        f4 = 4.0f;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        rg3Var2 = ab2.a.getShapes(kk0Var2, 6).e;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        value = af0.getValue(ze0.o, kk0Var2, 6);
                    } else {
                        value = j2;
                    }
                }
                rg3 rg3Var6 = rg3Var2;
                kk0Var2.s();
                strM1830xa862b2cd = uo3.m1830xa862b2cd(R.string.m3c_bottom_sheet_drag_handle_description, kk0Var2, 0);
                t64 t64Var3 = fh3.a;
                i6 = 1;
                c cVarM3 = a.m(cVar3, 0.0f, 22.0f, 1);
                zH = kk0Var2.h(strM1830xa862b2cd);
                objP = kk0Var2.P();
                if (zH) {
                    objP = new v7(strM1830xa862b2cd, i6);
                    kk0Var2.l0(objP);
                } else {
                    objP = new v7(strM1830xa862b2cd, i6);
                    kk0Var2.l0(objP);
                }
                int i13 = i3 >> 6;
                kk0Var = kk0Var2;
                hq3.m210x8dcae10(we3.b(cVarM3, false, (le1) objP), rg3Var6, value, 0L, 0.0f, 0.0f, null, zg0.rememberComposableLambda(-1039573072, true, new mw(f5, f4), kk0Var2, 54), kk0Var, (i13 & 112) | 12582912 | (i13 & 896), 120);
                f6 = f5;
                f7 = f4;
                rg3Var3 = rg3Var6;
                j3 = value;
                cVar2 = cVar3;
            } else {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i8 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i9 != 0) {
                        f5 = 32.0f;
                    } else {
                        f5 = f3;
                    }
                    if (i4 != 0) {
                        f4 = 4.0f;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        rg3Var2 = ab2.a.getShapes(kk0Var2, 6).e;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        value = af0.getValue(ze0.o, kk0Var2, 6);
                    } else {
                        value = j2;
                    }
                } else {
                    if (i8 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i9 != 0) {
                        f5 = 32.0f;
                    } else {
                        f5 = f3;
                    }
                    if (i4 != 0) {
                        f4 = 4.0f;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        rg3Var2 = ab2.a.getShapes(kk0Var2, 6).e;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        value = af0.getValue(ze0.o, kk0Var2, 6);
                    } else {
                        value = j2;
                    }
                }
                rg3 rg3Var7 = rg3Var2;
                kk0Var2.s();
                strM1830xa862b2cd = uo3.m1830xa862b2cd(R.string.m3c_bottom_sheet_drag_handle_description, kk0Var2, 0);
                t64 t64Var4 = fh3.a;
                i6 = 1;
                c cVarM4 = a.m(cVar3, 0.0f, 22.0f, 1);
                zH = kk0Var2.h(strM1830xa862b2cd);
                objP = kk0Var2.P();
                if (zH) {
                    objP = new v7(strM1830xa862b2cd, i6);
                    kk0Var2.l0(objP);
                } else {
                    objP = new v7(strM1830xa862b2cd, i6);
                    kk0Var2.l0(objP);
                }
                int i14 = i3 >> 6;
                kk0Var = kk0Var2;
                hq3.m210x8dcae10(we3.b(cVarM4, false, (le1) objP), rg3Var7, value, 0L, 0.0f, 0.0f, null, zg0.rememberComposableLambda(-1039573072, true, new mw(f5, f4), kk0Var2, 54), kk0Var, (i14 & 112) | 12582912 | (i14 & 896), 120);
                f6 = f5;
                f7 = f4;
                rg3Var3 = rg3Var7;
                j3 = value;
                cVar2 = cVar3;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new nw(this, cVar2, f6, f7, rg3Var3, j3, i, i2));
            }
        }
        i3 |= 48;
        f3 = f;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                f4 = f2;
                if (kk0Var2.e(f4)) {
                    i5 = FontInfo.NUMBER_OF_CHAR_CODES;
                } else {
                    i5 = Uuid.SIZE_BITS;
                }
                i3 |= i5;
            }
            if ((i & 3072) == 0) {
                if ((i2 & 8) == 0) {
                    rg3Var2 = rg3Var;
                    if (kk0Var2.h(rg3Var2)) {
                    }
                    i3 |= i10;
                } else {
                    rg3Var2 = rg3Var;
                }
                i3 |= i10;
            } else {
                rg3Var2 = rg3Var;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    j2 = j;
                    if (kk0Var2.g(j2)) {
                        i7 = 16384;
                    }
                    i3 |= i7;
                } else {
                    j2 = j;
                }
                i7 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                i3 |= i7;
            } else {
                j2 = j;
            }
            if ((i3 & 9363) == 9362) {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i8 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i9 != 0) {
                        f5 = 32.0f;
                    } else {
                        f5 = f3;
                    }
                    if (i4 != 0) {
                        f4 = 4.0f;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        rg3Var2 = ab2.a.getShapes(kk0Var2, 6).e;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        value = af0.getValue(ze0.o, kk0Var2, 6);
                    } else {
                        value = j2;
                    }
                } else {
                    if (i8 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i9 != 0) {
                        f5 = 32.0f;
                    } else {
                        f5 = f3;
                    }
                    if (i4 != 0) {
                        f4 = 4.0f;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        rg3Var2 = ab2.a.getShapes(kk0Var2, 6).e;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        value = af0.getValue(ze0.o, kk0Var2, 6);
                    } else {
                        value = j2;
                    }
                }
                rg3 rg3Var8 = rg3Var2;
                kk0Var2.s();
                strM1830xa862b2cd = uo3.m1830xa862b2cd(R.string.m3c_bottom_sheet_drag_handle_description, kk0Var2, 0);
                t64 t64Var5 = fh3.a;
                i6 = 1;
                c cVarM5 = a.m(cVar3, 0.0f, 22.0f, 1);
                zH = kk0Var2.h(strM1830xa862b2cd);
                objP = kk0Var2.P();
                if (zH) {
                    objP = new v7(strM1830xa862b2cd, i6);
                    kk0Var2.l0(objP);
                } else {
                    objP = new v7(strM1830xa862b2cd, i6);
                    kk0Var2.l0(objP);
                }
                int i15 = i3 >> 6;
                kk0Var = kk0Var2;
                hq3.m210x8dcae10(we3.b(cVarM5, false, (le1) objP), rg3Var8, value, 0L, 0.0f, 0.0f, null, zg0.rememberComposableLambda(-1039573072, true, new mw(f5, f4), kk0Var2, 54), kk0Var, (i15 & 112) | 12582912 | (i15 & 896), 120);
                f6 = f5;
                f7 = f4;
                rg3Var3 = rg3Var8;
                j3 = value;
                cVar2 = cVar3;
            } else {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i8 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i9 != 0) {
                        f5 = 32.0f;
                    } else {
                        f5 = f3;
                    }
                    if (i4 != 0) {
                        f4 = 4.0f;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        rg3Var2 = ab2.a.getShapes(kk0Var2, 6).e;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        value = af0.getValue(ze0.o, kk0Var2, 6);
                    } else {
                        value = j2;
                    }
                } else {
                    if (i8 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i9 != 0) {
                        f5 = 32.0f;
                    } else {
                        f5 = f3;
                    }
                    if (i4 != 0) {
                        f4 = 4.0f;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        rg3Var2 = ab2.a.getShapes(kk0Var2, 6).e;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        value = af0.getValue(ze0.o, kk0Var2, 6);
                    } else {
                        value = j2;
                    }
                }
                rg3 rg3Var9 = rg3Var2;
                kk0Var2.s();
                strM1830xa862b2cd = uo3.m1830xa862b2cd(R.string.m3c_bottom_sheet_drag_handle_description, kk0Var2, 0);
                t64 t64Var6 = fh3.a;
                i6 = 1;
                c cVarM6 = a.m(cVar3, 0.0f, 22.0f, 1);
                zH = kk0Var2.h(strM1830xa862b2cd);
                objP = kk0Var2.P();
                if (zH) {
                    objP = new v7(strM1830xa862b2cd, i6);
                    kk0Var2.l0(objP);
                } else {
                    objP = new v7(strM1830xa862b2cd, i6);
                    kk0Var2.l0(objP);
                }
                int i16 = i3 >> 6;
                kk0Var = kk0Var2;
                hq3.m210x8dcae10(we3.b(cVarM6, false, (le1) objP), rg3Var9, value, 0L, 0.0f, 0.0f, null, zg0.rememberComposableLambda(-1039573072, true, new mw(f5, f4), kk0Var2, 54), kk0Var, (i16 & 112) | 12582912 | (i16 & 896), 120);
                f6 = f5;
                f7 = f4;
                rg3Var3 = rg3Var9;
                j3 = value;
                cVar2 = cVar3;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new nw(this, cVar2, f6, f7, rg3Var3, j3, i, i2));
            }
        }
        i3 |= 384;
        f4 = f2;
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                rg3Var2 = rg3Var;
                if (kk0Var2.h(rg3Var2)) {
                }
                i3 |= i10;
            } else {
                rg3Var2 = rg3Var;
            }
            i3 |= i10;
        } else {
            rg3Var2 = rg3Var;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                j2 = j;
                if (kk0Var2.g(j2)) {
                    i7 = 16384;
                }
                i3 |= i7;
            } else {
                j2 = j;
            }
            i7 = ConstantsKt.DEFAULT_BUFFER_SIZE;
            i3 |= i7;
        } else {
            j2 = j;
        }
        if ((i3 & 9363) == 9362) {
            kk0Var2.X();
            if ((i & 1) != 0) {
                if (i8 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if (i9 != 0) {
                    f5 = 32.0f;
                } else {
                    f5 = f3;
                }
                if (i4 != 0) {
                    f4 = 4.0f;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    rg3Var2 = ab2.a.getShapes(kk0Var2, 6).e;
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                    value = af0.getValue(ze0.o, kk0Var2, 6);
                } else {
                    value = j2;
                }
            } else {
                if (i8 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if (i9 != 0) {
                    f5 = 32.0f;
                } else {
                    f5 = f3;
                }
                if (i4 != 0) {
                    f4 = 4.0f;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    rg3Var2 = ab2.a.getShapes(kk0Var2, 6).e;
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                    value = af0.getValue(ze0.o, kk0Var2, 6);
                } else {
                    value = j2;
                }
            }
            rg3 rg3Var10 = rg3Var2;
            kk0Var2.s();
            strM1830xa862b2cd = uo3.m1830xa862b2cd(R.string.m3c_bottom_sheet_drag_handle_description, kk0Var2, 0);
            t64 t64Var7 = fh3.a;
            i6 = 1;
            c cVarM7 = a.m(cVar3, 0.0f, 22.0f, 1);
            zH = kk0Var2.h(strM1830xa862b2cd);
            objP = kk0Var2.P();
            if (zH) {
                objP = new v7(strM1830xa862b2cd, i6);
                kk0Var2.l0(objP);
            } else {
                objP = new v7(strM1830xa862b2cd, i6);
                kk0Var2.l0(objP);
            }
            int i17 = i3 >> 6;
            kk0Var = kk0Var2;
            hq3.m210x8dcae10(we3.b(cVarM7, false, (le1) objP), rg3Var10, value, 0L, 0.0f, 0.0f, null, zg0.rememberComposableLambda(-1039573072, true, new mw(f5, f4), kk0Var2, 54), kk0Var, (i17 & 112) | 12582912 | (i17 & 896), 120);
            f6 = f5;
            f7 = f4;
            rg3Var3 = rg3Var10;
            j3 = value;
            cVar2 = cVar3;
        } else {
            kk0Var2.X();
            if ((i & 1) != 0) {
                if (i8 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if (i9 != 0) {
                    f5 = 32.0f;
                } else {
                    f5 = f3;
                }
                if (i4 != 0) {
                    f4 = 4.0f;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    rg3Var2 = ab2.a.getShapes(kk0Var2, 6).e;
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                    value = af0.getValue(ze0.o, kk0Var2, 6);
                } else {
                    value = j2;
                }
            } else {
                if (i8 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if (i9 != 0) {
                    f5 = 32.0f;
                } else {
                    f5 = f3;
                }
                if (i4 != 0) {
                    f4 = 4.0f;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    rg3Var2 = ab2.a.getShapes(kk0Var2, 6).e;
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                    value = af0.getValue(ze0.o, kk0Var2, 6);
                } else {
                    value = j2;
                }
            }
            rg3 rg3Var11 = rg3Var2;
            kk0Var2.s();
            strM1830xa862b2cd = uo3.m1830xa862b2cd(R.string.m3c_bottom_sheet_drag_handle_description, kk0Var2, 0);
            t64 t64Var8 = fh3.a;
            i6 = 1;
            c cVarM8 = a.m(cVar3, 0.0f, 22.0f, 1);
            zH = kk0Var2.h(strM1830xa862b2cd);
            objP = kk0Var2.P();
            if (zH) {
                objP = new v7(strM1830xa862b2cd, i6);
                kk0Var2.l0(objP);
            } else {
                objP = new v7(strM1830xa862b2cd, i6);
                kk0Var2.l0(objP);
            }
            int i18 = i3 >> 6;
            kk0Var = kk0Var2;
            hq3.m210x8dcae10(we3.b(cVarM8, false, (le1) objP), rg3Var11, value, 0L, 0.0f, 0.0f, null, zg0.rememberComposableLambda(-1039573072, true, new mw(f5, f4), kk0Var2, 54), kk0Var, (i18 & 112) | 12582912 | (i18 & 896), 120);
            f6 = f5;
            f7 = f4;
            rg3Var3 = rg3Var11;
            j3 = value;
            cVar2 = cVar3;
        }
        w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new nw(this, cVar2, f6, f7, rg3Var3, j3, i, i2));
        }
    }

    public final long getContainerColor(ck0 ck0Var, int i) {
        return af0.getValue(ze0.z, ck0Var, 6);
    }

    public final rg3 getExpandedShape(ck0 ck0Var, int i) {
        return wg3.getValue(tg3.d, ck0Var, 6);
    }

    public final rg3 getHiddenShape(ck0 ck0Var, int i) {
        return wg3.getValue(tg3.o, ck0Var, 6);
    }

    public final long getScrimColor(ck0 ck0Var, int i) {
        return re0.b(0.32f, af0.getValue(ze0.s, ck0Var, 6));
    }

    public final e getWindowInsets(ck0 ck0Var, int i) {
        return new v32(nh4.getSafeDrawing(e.a, ck0Var, 6), 32);
    }
}
