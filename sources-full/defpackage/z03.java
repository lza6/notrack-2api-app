package defpackage;

import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.d;
import androidx.compose.runtime.Composer$Companion;
import androidx.compose.ui.c;
import androidx.compose.ui.platform.CompositionLocalsKt;
import kotlin.io.ConstantsKt;
import kotlin.uuid.Uuid;
import org.scilab.forge.jlatexmath.FontInfo;

/* JADX INFO: loaded from: classes.dex */
public abstract class z03 {
    public static final c a = a.m(we3.b(androidx.compose.ui.layout.a.b(c.i, u1.h), true, xq2.w), 0.0f, 10.0f, 1);
    public static final float b = 240.0f;
    public static final float c = 4.0f;
    public static final float d = 40.0f;
    public static final zq0 e = new zq0(0.2f, 0.0f, 0.8f, 1.0f);
    public static final zq0 f = new zq0(0.4f, 0.0f, 1.0f, 1.0f);
    public static final zq0 g = new zq0(0.0f, 0.0f, 0.65f, 1.0f);
    public static final zq0 h = new zq0(0.1f, 0.0f, 0.45f, 1.0f);
    public static final zq0 i = new zq0(0.4f, 0.0f, 0.2f, 1.0f);

    /* JADX WARN: Code duplicated, block: B:102:0x0128  */
    /* JADX WARN: Code duplicated, block: B:105:0x012f  */
    /* JADX WARN: Code duplicated, block: B:107:0x0135  */
    /* JADX WARN: Code duplicated, block: B:111:0x015a  */
    /* JADX WARN: Code duplicated, block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0044  */
    /* JADX WARN: Code duplicated, block: B:28:0x0048  */
    /* JADX WARN: Code duplicated, block: B:30:0x0050  */
    /* JADX WARN: Code duplicated, block: B:31:0x0053  */
    /* JADX WARN: Code duplicated, block: B:34:0x0059  */
    /* JADX WARN: Code duplicated, block: B:37:0x005f  */
    /* JADX WARN: Code duplicated, block: B:39:0x0064  */
    /* JADX WARN: Code duplicated, block: B:41:0x0068  */
    /* JADX WARN: Code duplicated, block: B:43:0x0070  */
    /* JADX WARN: Code duplicated, block: B:44:0x0073  */
    /* JADX WARN: Code duplicated, block: B:48:0x007a  */
    /* JADX WARN: Code duplicated, block: B:50:0x007e  */
    /* JADX WARN: Code duplicated, block: B:52:0x0086  */
    /* JADX WARN: Code duplicated, block: B:53:0x0089  */
    /* JADX WARN: Code duplicated, block: B:56:0x008f  */
    /* JADX WARN: Code duplicated, block: B:59:0x0097  */
    /* JADX WARN: Code duplicated, block: B:61:0x009b  */
    /* JADX WARN: Code duplicated, block: B:63:0x009e  */
    /* JADX WARN: Code duplicated, block: B:65:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:66:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e9 A[PHI: r2 r5 r6 r10 r11
  0x00e9: PHI (r2v24 int) = (r2v19 int), (r2v25 int), (r2v26 int) binds: [B:97:0x0116, B:83:0x00e6, B:84:0x00e8] A[DONT_GENERATE, DONT_INLINE]
  0x00e9: PHI (r5v8 androidx.compose.ui.c) = (r5v3 androidx.compose.ui.c), (r5v2 androidx.compose.ui.c), (r5v2 androidx.compose.ui.c) binds: [B:97:0x0116, B:83:0x00e6, B:84:0x00e8] A[DONT_GENERATE, DONT_INLINE]
  0x00e9: PHI (r6v12 long) = (r6v7 long), (r6v6 long), (r6v6 long) binds: [B:97:0x0116, B:83:0x00e6, B:84:0x00e8] A[DONT_GENERATE, DONT_INLINE]
  0x00e9: PHI (r10v7 float) = (r10v3 float), (r10v2 float), (r10v2 float) binds: [B:97:0x0116, B:83:0x00e6, B:84:0x00e8] A[DONT_GENERATE, DONT_INLINE]
  0x00e9: PHI (r11v11 long) = (r11v7 long), (r11v6 long), (r11v6 long) binds: [B:97:0x0116, B:83:0x00e6, B:84:0x00e8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:87:0x00f2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:88:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:91:0x0100  */
    /* JADX WARN: Code duplicated, block: B:93:0x0108  */
    /* JADX WARN: Code duplicated, block: B:96:0x010f  */
    /* JADX WARN: Code duplicated, block: B:98:0x0118  */
    @cv0
    /* JADX INFO: renamed from: CircularProgressIndicator-DUhRLBM, reason: not valid java name */
    public static final void m1879x7647c12(float f2, c cVar, long j, float f3, long j2, int i2, ck0 ck0Var, int i3, int i4) {
        int i5;
        c cVar2;
        long circularColor;
        int i6;
        float f4;
        int i7;
        long circularTrackColor;
        int i8;
        int i9;
        int i10;
        int i11;
        i03 i03Var;
        float f5;
        boolean z;
        int i12;
        Object objP;
        kk0 kk0Var;
        c cVar3;
        long j3;
        float f6;
        long j4;
        int i13;
        w33 w33VarV;
        int i14;
        int i15;
        kk0 kk0Var2 = (kk0) ck0Var;
        kk0Var2.c0(-1472321743);
        if ((i4 & 1) != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i5 = (kk0Var2.e(f2) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        int i16 = i4 & 2;
        if (i16 == 0) {
            if ((i3 & 48) == 0) {
                cVar2 = cVar;
                i5 |= kk0Var2.h(cVar2) ? 32 : 16;
            }
            if ((i3 & 384) == 0) {
                if ((i4 & 4) == 0) {
                    circularColor = j;
                    if (kk0Var2.g(circularColor)) {
                        i15 = FontInfo.NUMBER_OF_CHAR_CODES;
                    }
                    i5 |= i15;
                } else {
                    circularColor = j;
                }
                i15 = Uuid.SIZE_BITS;
                i5 |= i15;
            } else {
                circularColor = j;
            }
            i6 = i4 & 8;
            if (i6 != 0) {
                if ((i3 & 3072) == 0) {
                    f4 = f3;
                    if (kk0Var2.e(f4)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i5 |= i7;
                }
                if ((i3 & 24576) == 0) {
                    if ((i4 & 16) == 0) {
                        circularTrackColor = j2;
                        if (kk0Var2.g(circularTrackColor)) {
                            i14 = 16384;
                        }
                        i5 |= i14;
                    } else {
                        circularTrackColor = j2;
                    }
                    i14 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                    i5 |= i14;
                } else {
                    circularTrackColor = j2;
                }
                i8 = i4 & 32;
                if (i8 != 0) {
                    if ((196608 & i3) == 0) {
                        i9 = i2;
                        if (kk0Var2.f(i9)) {
                            i10 = 131072;
                        } else {
                            i10 = 65536;
                        }
                        i5 |= i10;
                    }
                    if ((74899 & i5) == 74898 || !kk0Var2.F()) {
                        kk0Var2.X();
                        if ((i3 & 1) != 0 || kk0Var2.D()) {
                            if (i16 != 0) {
                                cVar2 = c.i;
                            }
                            i11 = i4 & 4;
                            i03Var = i03.a;
                            if (i11 != 0) {
                                circularColor = i03Var.getCircularColor(kk0Var2, 6);
                                i5 &= -897;
                            }
                            if (i6 != 0) {
                                f4 = 4.0f;
                            }
                            if ((i4 & 16) != 0) {
                                i5 &= -57345;
                                circularTrackColor = i03Var.getCircularTrackColor(kk0Var2, 6);
                            }
                            if (i8 != 0) {
                                f5 = f4;
                                z = true;
                                i12 = 1;
                            }
                            long j5 = circularTrackColor;
                            c cVar4 = cVar2;
                            long j6 = circularColor;
                            kk0Var2.s();
                            if ((i5 & 14) != 4) {
                                z = false;
                            }
                            objP = kk0Var2.P();
                            if (z || objP == Composer$Companion.getEmpty()) {
                                objP = new o03(f2, 0);
                                kk0Var2.l0(objP);
                            }
                            kk0Var = kk0Var2;
                            m1881x4c2c3c0b((je1) objP, cVar4, j6, f5, j5, i12, 0.0f, kk0Var, i5 & 524272, 64);
                            cVar3 = cVar4;
                            j3 = j6;
                            f6 = f5;
                            j4 = j5;
                            i13 = i12;
                        } else {
                            kk0Var2.V();
                            if ((i4 & 4) != 0) {
                                i5 &= -897;
                            }
                            if ((i4 & 16) != 0) {
                                i5 &= -57345;
                            }
                        }
                        i12 = i9;
                        z = true;
                        f5 = f4;
                        long j7 = circularTrackColor;
                        c cVar5 = cVar2;
                        long j8 = circularColor;
                        kk0Var2.s();
                        if ((i5 & 14) != 4) {
                            z = false;
                        }
                        objP = kk0Var2.P();
                        if (z) {
                            objP = new o03(f2, 0);
                            kk0Var2.l0(objP);
                        } else {
                            objP = new o03(f2, 0);
                            kk0Var2.l0(objP);
                        }
                        kk0Var = kk0Var2;
                        m1881x4c2c3c0b((je1) objP, cVar5, j8, f5, j7, i12, 0.0f, kk0Var, i5 & 524272, 64);
                        cVar3 = cVar5;
                        j3 = j8;
                        f6 = f5;
                        j4 = j7;
                        i13 = i12;
                    } else {
                        kk0Var2.V();
                        kk0Var = kk0Var2;
                        cVar3 = cVar2;
                        j3 = circularColor;
                        f6 = f4;
                        j4 = circularTrackColor;
                        i13 = i9;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new p03(f2, cVar3, j3, f6, j4, i13, i3, i4));
                    }
                }
                i5 |= 196608;
                i9 = i2;
                if ((74899 & i5) == 74898) {
                    kk0Var2.X();
                    if ((i3 & 1) != 0) {
                        if (i16 != 0) {
                            cVar2 = c.i;
                        }
                        i11 = i4 & 4;
                        i03Var = i03.a;
                        if (i11 != 0) {
                            circularColor = i03Var.getCircularColor(kk0Var2, 6);
                            i5 &= -897;
                        }
                        if (i6 != 0) {
                            f4 = 4.0f;
                        }
                        if ((i4 & 16) != 0) {
                            i5 &= -57345;
                            circularTrackColor = i03Var.getCircularTrackColor(kk0Var2, 6);
                        }
                        if (i8 != 0) {
                            f5 = f4;
                            z = true;
                            i12 = 1;
                        } else {
                            i12 = i9;
                            z = true;
                            f5 = f4;
                        }
                    } else {
                        if (i16 != 0) {
                            cVar2 = c.i;
                        }
                        i11 = i4 & 4;
                        i03Var = i03.a;
                        if (i11 != 0) {
                            circularColor = i03Var.getCircularColor(kk0Var2, 6);
                            i5 &= -897;
                        }
                        if (i6 != 0) {
                            f4 = 4.0f;
                        }
                        if ((i4 & 16) != 0) {
                            i5 &= -57345;
                            circularTrackColor = i03Var.getCircularTrackColor(kk0Var2, 6);
                        }
                        if (i8 != 0) {
                            f5 = f4;
                            z = true;
                            i12 = 1;
                        } else {
                            i12 = i9;
                            z = true;
                            f5 = f4;
                        }
                    }
                    long j9 = circularTrackColor;
                    c cVar6 = cVar2;
                    long j10 = circularColor;
                    kk0Var2.s();
                    if ((i5 & 14) != 4) {
                        z = false;
                    }
                    objP = kk0Var2.P();
                    if (z) {
                        objP = new o03(f2, 0);
                        kk0Var2.l0(objP);
                    } else {
                        objP = new o03(f2, 0);
                        kk0Var2.l0(objP);
                    }
                    kk0Var = kk0Var2;
                    m1881x4c2c3c0b((je1) objP, cVar6, j10, f5, j9, i12, 0.0f, kk0Var, i5 & 524272, 64);
                    cVar3 = cVar6;
                    j3 = j10;
                    f6 = f5;
                    j4 = j9;
                    i13 = i12;
                } else {
                    kk0Var2.X();
                    if ((i3 & 1) != 0) {
                        if (i16 != 0) {
                            cVar2 = c.i;
                        }
                        i11 = i4 & 4;
                        i03Var = i03.a;
                        if (i11 != 0) {
                            circularColor = i03Var.getCircularColor(kk0Var2, 6);
                            i5 &= -897;
                        }
                        if (i6 != 0) {
                            f4 = 4.0f;
                        }
                        if ((i4 & 16) != 0) {
                            i5 &= -57345;
                            circularTrackColor = i03Var.getCircularTrackColor(kk0Var2, 6);
                        }
                        if (i8 != 0) {
                            f5 = f4;
                            z = true;
                            i12 = 1;
                        } else {
                            i12 = i9;
                            z = true;
                            f5 = f4;
                        }
                    } else {
                        if (i16 != 0) {
                            cVar2 = c.i;
                        }
                        i11 = i4 & 4;
                        i03Var = i03.a;
                        if (i11 != 0) {
                            circularColor = i03Var.getCircularColor(kk0Var2, 6);
                            i5 &= -897;
                        }
                        if (i6 != 0) {
                            f4 = 4.0f;
                        }
                        if ((i4 & 16) != 0) {
                            i5 &= -57345;
                            circularTrackColor = i03Var.getCircularTrackColor(kk0Var2, 6);
                        }
                        if (i8 != 0) {
                            f5 = f4;
                            z = true;
                            i12 = 1;
                        } else {
                            i12 = i9;
                            z = true;
                            f5 = f4;
                        }
                    }
                    long j11 = circularTrackColor;
                    c cVar7 = cVar2;
                    long j12 = circularColor;
                    kk0Var2.s();
                    if ((i5 & 14) != 4) {
                        z = false;
                    }
                    objP = kk0Var2.P();
                    if (z) {
                        objP = new o03(f2, 0);
                        kk0Var2.l0(objP);
                    } else {
                        objP = new o03(f2, 0);
                        kk0Var2.l0(objP);
                    }
                    kk0Var = kk0Var2;
                    m1881x4c2c3c0b((je1) objP, cVar7, j12, f5, j11, i12, 0.0f, kk0Var, i5 & 524272, 64);
                    cVar3 = cVar7;
                    j3 = j12;
                    f6 = f5;
                    j4 = j11;
                    i13 = i12;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new p03(f2, cVar3, j3, f6, j4, i13, i3, i4));
                }
            }
            i5 |= 3072;
            f4 = f3;
            if ((i3 & 24576) == 0) {
                if ((i4 & 16) == 0) {
                    circularTrackColor = j2;
                    if (kk0Var2.g(circularTrackColor)) {
                        i14 = 16384;
                    }
                    i5 |= i14;
                } else {
                    circularTrackColor = j2;
                }
                i14 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                i5 |= i14;
            } else {
                circularTrackColor = j2;
            }
            i8 = i4 & 32;
            if (i8 != 0) {
                if ((196608 & i3) == 0) {
                    i9 = i2;
                    if (kk0Var2.f(i9)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                    i5 |= i10;
                }
                if ((74899 & i5) == 74898) {
                    kk0Var2.X();
                    if ((i3 & 1) != 0) {
                        if (i16 != 0) {
                            cVar2 = c.i;
                        }
                        i11 = i4 & 4;
                        i03Var = i03.a;
                        if (i11 != 0) {
                            circularColor = i03Var.getCircularColor(kk0Var2, 6);
                            i5 &= -897;
                        }
                        if (i6 != 0) {
                            f4 = 4.0f;
                        }
                        if ((i4 & 16) != 0) {
                            i5 &= -57345;
                            circularTrackColor = i03Var.getCircularTrackColor(kk0Var2, 6);
                        }
                        if (i8 != 0) {
                            f5 = f4;
                            z = true;
                            i12 = 1;
                        } else {
                            i12 = i9;
                            z = true;
                            f5 = f4;
                        }
                    } else {
                        if (i16 != 0) {
                            cVar2 = c.i;
                        }
                        i11 = i4 & 4;
                        i03Var = i03.a;
                        if (i11 != 0) {
                            circularColor = i03Var.getCircularColor(kk0Var2, 6);
                            i5 &= -897;
                        }
                        if (i6 != 0) {
                            f4 = 4.0f;
                        }
                        if ((i4 & 16) != 0) {
                            i5 &= -57345;
                            circularTrackColor = i03Var.getCircularTrackColor(kk0Var2, 6);
                        }
                        if (i8 != 0) {
                            f5 = f4;
                            z = true;
                            i12 = 1;
                        } else {
                            i12 = i9;
                            z = true;
                            f5 = f4;
                        }
                    }
                    long j13 = circularTrackColor;
                    c cVar8 = cVar2;
                    long j14 = circularColor;
                    kk0Var2.s();
                    if ((i5 & 14) != 4) {
                        z = false;
                    }
                    objP = kk0Var2.P();
                    if (z) {
                        objP = new o03(f2, 0);
                        kk0Var2.l0(objP);
                    } else {
                        objP = new o03(f2, 0);
                        kk0Var2.l0(objP);
                    }
                    kk0Var = kk0Var2;
                    m1881x4c2c3c0b((je1) objP, cVar8, j14, f5, j13, i12, 0.0f, kk0Var, i5 & 524272, 64);
                    cVar3 = cVar8;
                    j3 = j14;
                    f6 = f5;
                    j4 = j13;
                    i13 = i12;
                } else {
                    kk0Var2.X();
                    if ((i3 & 1) != 0) {
                        if (i16 != 0) {
                            cVar2 = c.i;
                        }
                        i11 = i4 & 4;
                        i03Var = i03.a;
                        if (i11 != 0) {
                            circularColor = i03Var.getCircularColor(kk0Var2, 6);
                            i5 &= -897;
                        }
                        if (i6 != 0) {
                            f4 = 4.0f;
                        }
                        if ((i4 & 16) != 0) {
                            i5 &= -57345;
                            circularTrackColor = i03Var.getCircularTrackColor(kk0Var2, 6);
                        }
                        if (i8 != 0) {
                            f5 = f4;
                            z = true;
                            i12 = 1;
                        } else {
                            i12 = i9;
                            z = true;
                            f5 = f4;
                        }
                    } else {
                        if (i16 != 0) {
                            cVar2 = c.i;
                        }
                        i11 = i4 & 4;
                        i03Var = i03.a;
                        if (i11 != 0) {
                            circularColor = i03Var.getCircularColor(kk0Var2, 6);
                            i5 &= -897;
                        }
                        if (i6 != 0) {
                            f4 = 4.0f;
                        }
                        if ((i4 & 16) != 0) {
                            i5 &= -57345;
                            circularTrackColor = i03Var.getCircularTrackColor(kk0Var2, 6);
                        }
                        if (i8 != 0) {
                            f5 = f4;
                            z = true;
                            i12 = 1;
                        } else {
                            i12 = i9;
                            z = true;
                            f5 = f4;
                        }
                    }
                    long j15 = circularTrackColor;
                    c cVar9 = cVar2;
                    long j16 = circularColor;
                    kk0Var2.s();
                    if ((i5 & 14) != 4) {
                        z = false;
                    }
                    objP = kk0Var2.P();
                    if (z) {
                        objP = new o03(f2, 0);
                        kk0Var2.l0(objP);
                    } else {
                        objP = new o03(f2, 0);
                        kk0Var2.l0(objP);
                    }
                    kk0Var = kk0Var2;
                    m1881x4c2c3c0b((je1) objP, cVar9, j16, f5, j15, i12, 0.0f, kk0Var, i5 & 524272, 64);
                    cVar3 = cVar9;
                    j3 = j16;
                    f6 = f5;
                    j4 = j15;
                    i13 = i12;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new p03(f2, cVar3, j3, f6, j4, i13, i3, i4));
                }
            }
            i5 |= 196608;
            i9 = i2;
            if ((74899 & i5) == 74898) {
                kk0Var2.X();
                if ((i3 & 1) != 0) {
                    if (i16 != 0) {
                        cVar2 = c.i;
                    }
                    i11 = i4 & 4;
                    i03Var = i03.a;
                    if (i11 != 0) {
                        circularColor = i03Var.getCircularColor(kk0Var2, 6);
                        i5 &= -897;
                    }
                    if (i6 != 0) {
                        f4 = 4.0f;
                    }
                    if ((i4 & 16) != 0) {
                        i5 &= -57345;
                        circularTrackColor = i03Var.getCircularTrackColor(kk0Var2, 6);
                    }
                    if (i8 != 0) {
                        f5 = f4;
                        z = true;
                        i12 = 1;
                    } else {
                        i12 = i9;
                        z = true;
                        f5 = f4;
                    }
                } else {
                    if (i16 != 0) {
                        cVar2 = c.i;
                    }
                    i11 = i4 & 4;
                    i03Var = i03.a;
                    if (i11 != 0) {
                        circularColor = i03Var.getCircularColor(kk0Var2, 6);
                        i5 &= -897;
                    }
                    if (i6 != 0) {
                        f4 = 4.0f;
                    }
                    if ((i4 & 16) != 0) {
                        i5 &= -57345;
                        circularTrackColor = i03Var.getCircularTrackColor(kk0Var2, 6);
                    }
                    if (i8 != 0) {
                        f5 = f4;
                        z = true;
                        i12 = 1;
                    } else {
                        i12 = i9;
                        z = true;
                        f5 = f4;
                    }
                }
                long j17 = circularTrackColor;
                c cVar10 = cVar2;
                long j18 = circularColor;
                kk0Var2.s();
                if ((i5 & 14) != 4) {
                    z = false;
                }
                objP = kk0Var2.P();
                if (z) {
                    objP = new o03(f2, 0);
                    kk0Var2.l0(objP);
                } else {
                    objP = new o03(f2, 0);
                    kk0Var2.l0(objP);
                }
                kk0Var = kk0Var2;
                m1881x4c2c3c0b((je1) objP, cVar10, j18, f5, j17, i12, 0.0f, kk0Var, i5 & 524272, 64);
                cVar3 = cVar10;
                j3 = j18;
                f6 = f5;
                j4 = j17;
                i13 = i12;
            } else {
                kk0Var2.X();
                if ((i3 & 1) != 0) {
                    if (i16 != 0) {
                        cVar2 = c.i;
                    }
                    i11 = i4 & 4;
                    i03Var = i03.a;
                    if (i11 != 0) {
                        circularColor = i03Var.getCircularColor(kk0Var2, 6);
                        i5 &= -897;
                    }
                    if (i6 != 0) {
                        f4 = 4.0f;
                    }
                    if ((i4 & 16) != 0) {
                        i5 &= -57345;
                        circularTrackColor = i03Var.getCircularTrackColor(kk0Var2, 6);
                    }
                    if (i8 != 0) {
                        f5 = f4;
                        z = true;
                        i12 = 1;
                    } else {
                        i12 = i9;
                        z = true;
                        f5 = f4;
                    }
                } else {
                    if (i16 != 0) {
                        cVar2 = c.i;
                    }
                    i11 = i4 & 4;
                    i03Var = i03.a;
                    if (i11 != 0) {
                        circularColor = i03Var.getCircularColor(kk0Var2, 6);
                        i5 &= -897;
                    }
                    if (i6 != 0) {
                        f4 = 4.0f;
                    }
                    if ((i4 & 16) != 0) {
                        i5 &= -57345;
                        circularTrackColor = i03Var.getCircularTrackColor(kk0Var2, 6);
                    }
                    if (i8 != 0) {
                        f5 = f4;
                        z = true;
                        i12 = 1;
                    } else {
                        i12 = i9;
                        z = true;
                        f5 = f4;
                    }
                }
                long j19 = circularTrackColor;
                c cVar11 = cVar2;
                long j110 = circularColor;
                kk0Var2.s();
                if ((i5 & 14) != 4) {
                    z = false;
                }
                objP = kk0Var2.P();
                if (z) {
                    objP = new o03(f2, 0);
                    kk0Var2.l0(objP);
                } else {
                    objP = new o03(f2, 0);
                    kk0Var2.l0(objP);
                }
                kk0Var = kk0Var2;
                m1881x4c2c3c0b((je1) objP, cVar11, j110, f5, j19, i12, 0.0f, kk0Var, i5 & 524272, 64);
                cVar3 = cVar11;
                j3 = j110;
                f6 = f5;
                j4 = j19;
                i13 = i12;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new p03(f2, cVar3, j3, f6, j4, i13, i3, i4));
            }
        }
        i5 |= 48;
        cVar2 = cVar;
        if ((i3 & 384) == 0) {
            if ((i4 & 4) == 0) {
                circularColor = j;
                if (kk0Var2.g(circularColor)) {
                    i15 = FontInfo.NUMBER_OF_CHAR_CODES;
                }
                i5 |= i15;
            } else {
                circularColor = j;
            }
            i15 = Uuid.SIZE_BITS;
            i5 |= i15;
        } else {
            circularColor = j;
        }
        i6 = i4 & 8;
        if (i6 != 0) {
            if ((i3 & 3072) == 0) {
                f4 = f3;
                if (kk0Var2.e(f4)) {
                    i7 = 2048;
                } else {
                    i7 = 1024;
                }
                i5 |= i7;
            }
            if ((i3 & 24576) == 0) {
                if ((i4 & 16) == 0) {
                    circularTrackColor = j2;
                    if (kk0Var2.g(circularTrackColor)) {
                        i14 = 16384;
                    }
                    i5 |= i14;
                } else {
                    circularTrackColor = j2;
                }
                i14 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                i5 |= i14;
            } else {
                circularTrackColor = j2;
            }
            i8 = i4 & 32;
            if (i8 != 0) {
                if ((196608 & i3) == 0) {
                    i9 = i2;
                    if (kk0Var2.f(i9)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                    i5 |= i10;
                }
                if ((74899 & i5) == 74898) {
                    kk0Var2.X();
                    if ((i3 & 1) != 0) {
                        if (i16 != 0) {
                            cVar2 = c.i;
                        }
                        i11 = i4 & 4;
                        i03Var = i03.a;
                        if (i11 != 0) {
                            circularColor = i03Var.getCircularColor(kk0Var2, 6);
                            i5 &= -897;
                        }
                        if (i6 != 0) {
                            f4 = 4.0f;
                        }
                        if ((i4 & 16) != 0) {
                            i5 &= -57345;
                            circularTrackColor = i03Var.getCircularTrackColor(kk0Var2, 6);
                        }
                        if (i8 != 0) {
                            f5 = f4;
                            z = true;
                            i12 = 1;
                        } else {
                            i12 = i9;
                            z = true;
                            f5 = f4;
                        }
                    } else {
                        if (i16 != 0) {
                            cVar2 = c.i;
                        }
                        i11 = i4 & 4;
                        i03Var = i03.a;
                        if (i11 != 0) {
                            circularColor = i03Var.getCircularColor(kk0Var2, 6);
                            i5 &= -897;
                        }
                        if (i6 != 0) {
                            f4 = 4.0f;
                        }
                        if ((i4 & 16) != 0) {
                            i5 &= -57345;
                            circularTrackColor = i03Var.getCircularTrackColor(kk0Var2, 6);
                        }
                        if (i8 != 0) {
                            f5 = f4;
                            z = true;
                            i12 = 1;
                        } else {
                            i12 = i9;
                            z = true;
                            f5 = f4;
                        }
                    }
                    long j111 = circularTrackColor;
                    c cVar12 = cVar2;
                    long j112 = circularColor;
                    kk0Var2.s();
                    if ((i5 & 14) != 4) {
                        z = false;
                    }
                    objP = kk0Var2.P();
                    if (z) {
                        objP = new o03(f2, 0);
                        kk0Var2.l0(objP);
                    } else {
                        objP = new o03(f2, 0);
                        kk0Var2.l0(objP);
                    }
                    kk0Var = kk0Var2;
                    m1881x4c2c3c0b((je1) objP, cVar12, j112, f5, j111, i12, 0.0f, kk0Var, i5 & 524272, 64);
                    cVar3 = cVar12;
                    j3 = j112;
                    f6 = f5;
                    j4 = j111;
                    i13 = i12;
                } else {
                    kk0Var2.X();
                    if ((i3 & 1) != 0) {
                        if (i16 != 0) {
                            cVar2 = c.i;
                        }
                        i11 = i4 & 4;
                        i03Var = i03.a;
                        if (i11 != 0) {
                            circularColor = i03Var.getCircularColor(kk0Var2, 6);
                            i5 &= -897;
                        }
                        if (i6 != 0) {
                            f4 = 4.0f;
                        }
                        if ((i4 & 16) != 0) {
                            i5 &= -57345;
                            circularTrackColor = i03Var.getCircularTrackColor(kk0Var2, 6);
                        }
                        if (i8 != 0) {
                            f5 = f4;
                            z = true;
                            i12 = 1;
                        } else {
                            i12 = i9;
                            z = true;
                            f5 = f4;
                        }
                    } else {
                        if (i16 != 0) {
                            cVar2 = c.i;
                        }
                        i11 = i4 & 4;
                        i03Var = i03.a;
                        if (i11 != 0) {
                            circularColor = i03Var.getCircularColor(kk0Var2, 6);
                            i5 &= -897;
                        }
                        if (i6 != 0) {
                            f4 = 4.0f;
                        }
                        if ((i4 & 16) != 0) {
                            i5 &= -57345;
                            circularTrackColor = i03Var.getCircularTrackColor(kk0Var2, 6);
                        }
                        if (i8 != 0) {
                            f5 = f4;
                            z = true;
                            i12 = 1;
                        } else {
                            i12 = i9;
                            z = true;
                            f5 = f4;
                        }
                    }
                    long j113 = circularTrackColor;
                    c cVar13 = cVar2;
                    long j114 = circularColor;
                    kk0Var2.s();
                    if ((i5 & 14) != 4) {
                        z = false;
                    }
                    objP = kk0Var2.P();
                    if (z) {
                        objP = new o03(f2, 0);
                        kk0Var2.l0(objP);
                    } else {
                        objP = new o03(f2, 0);
                        kk0Var2.l0(objP);
                    }
                    kk0Var = kk0Var2;
                    m1881x4c2c3c0b((je1) objP, cVar13, j114, f5, j113, i12, 0.0f, kk0Var, i5 & 524272, 64);
                    cVar3 = cVar13;
                    j3 = j114;
                    f6 = f5;
                    j4 = j113;
                    i13 = i12;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new p03(f2, cVar3, j3, f6, j4, i13, i3, i4));
                }
            }
            i5 |= 196608;
            i9 = i2;
            if ((74899 & i5) == 74898) {
                kk0Var2.X();
                if ((i3 & 1) != 0) {
                    if (i16 != 0) {
                        cVar2 = c.i;
                    }
                    i11 = i4 & 4;
                    i03Var = i03.a;
                    if (i11 != 0) {
                        circularColor = i03Var.getCircularColor(kk0Var2, 6);
                        i5 &= -897;
                    }
                    if (i6 != 0) {
                        f4 = 4.0f;
                    }
                    if ((i4 & 16) != 0) {
                        i5 &= -57345;
                        circularTrackColor = i03Var.getCircularTrackColor(kk0Var2, 6);
                    }
                    if (i8 != 0) {
                        f5 = f4;
                        z = true;
                        i12 = 1;
                    } else {
                        i12 = i9;
                        z = true;
                        f5 = f4;
                    }
                } else {
                    if (i16 != 0) {
                        cVar2 = c.i;
                    }
                    i11 = i4 & 4;
                    i03Var = i03.a;
                    if (i11 != 0) {
                        circularColor = i03Var.getCircularColor(kk0Var2, 6);
                        i5 &= -897;
                    }
                    if (i6 != 0) {
                        f4 = 4.0f;
                    }
                    if ((i4 & 16) != 0) {
                        i5 &= -57345;
                        circularTrackColor = i03Var.getCircularTrackColor(kk0Var2, 6);
                    }
                    if (i8 != 0) {
                        f5 = f4;
                        z = true;
                        i12 = 1;
                    } else {
                        i12 = i9;
                        z = true;
                        f5 = f4;
                    }
                }
                long j115 = circularTrackColor;
                c cVar14 = cVar2;
                long j116 = circularColor;
                kk0Var2.s();
                if ((i5 & 14) != 4) {
                    z = false;
                }
                objP = kk0Var2.P();
                if (z) {
                    objP = new o03(f2, 0);
                    kk0Var2.l0(objP);
                } else {
                    objP = new o03(f2, 0);
                    kk0Var2.l0(objP);
                }
                kk0Var = kk0Var2;
                m1881x4c2c3c0b((je1) objP, cVar14, j116, f5, j115, i12, 0.0f, kk0Var, i5 & 524272, 64);
                cVar3 = cVar14;
                j3 = j116;
                f6 = f5;
                j4 = j115;
                i13 = i12;
            } else {
                kk0Var2.X();
                if ((i3 & 1) != 0) {
                    if (i16 != 0) {
                        cVar2 = c.i;
                    }
                    i11 = i4 & 4;
                    i03Var = i03.a;
                    if (i11 != 0) {
                        circularColor = i03Var.getCircularColor(kk0Var2, 6);
                        i5 &= -897;
                    }
                    if (i6 != 0) {
                        f4 = 4.0f;
                    }
                    if ((i4 & 16) != 0) {
                        i5 &= -57345;
                        circularTrackColor = i03Var.getCircularTrackColor(kk0Var2, 6);
                    }
                    if (i8 != 0) {
                        f5 = f4;
                        z = true;
                        i12 = 1;
                    } else {
                        i12 = i9;
                        z = true;
                        f5 = f4;
                    }
                } else {
                    if (i16 != 0) {
                        cVar2 = c.i;
                    }
                    i11 = i4 & 4;
                    i03Var = i03.a;
                    if (i11 != 0) {
                        circularColor = i03Var.getCircularColor(kk0Var2, 6);
                        i5 &= -897;
                    }
                    if (i6 != 0) {
                        f4 = 4.0f;
                    }
                    if ((i4 & 16) != 0) {
                        i5 &= -57345;
                        circularTrackColor = i03Var.getCircularTrackColor(kk0Var2, 6);
                    }
                    if (i8 != 0) {
                        f5 = f4;
                        z = true;
                        i12 = 1;
                    } else {
                        i12 = i9;
                        z = true;
                        f5 = f4;
                    }
                }
                long j117 = circularTrackColor;
                c cVar15 = cVar2;
                long j118 = circularColor;
                kk0Var2.s();
                if ((i5 & 14) != 4) {
                    z = false;
                }
                objP = kk0Var2.P();
                if (z) {
                    objP = new o03(f2, 0);
                    kk0Var2.l0(objP);
                } else {
                    objP = new o03(f2, 0);
                    kk0Var2.l0(objP);
                }
                kk0Var = kk0Var2;
                m1881x4c2c3c0b((je1) objP, cVar15, j118, f5, j117, i12, 0.0f, kk0Var, i5 & 524272, 64);
                cVar3 = cVar15;
                j3 = j118;
                f6 = f5;
                j4 = j117;
                i13 = i12;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new p03(f2, cVar3, j3, f6, j4, i13, i3, i4));
            }
        }
        i5 |= 3072;
        f4 = f3;
        if ((i3 & 24576) == 0) {
            if ((i4 & 16) == 0) {
                circularTrackColor = j2;
                if (kk0Var2.g(circularTrackColor)) {
                    i14 = 16384;
                }
                i5 |= i14;
            } else {
                circularTrackColor = j2;
            }
            i14 = ConstantsKt.DEFAULT_BUFFER_SIZE;
            i5 |= i14;
        } else {
            circularTrackColor = j2;
        }
        i8 = i4 & 32;
        if (i8 != 0) {
            if ((196608 & i3) == 0) {
                i9 = i2;
                if (kk0Var2.f(i9)) {
                    i10 = 131072;
                } else {
                    i10 = 65536;
                }
                i5 |= i10;
            }
            if ((74899 & i5) == 74898) {
                kk0Var2.X();
                if ((i3 & 1) != 0) {
                    if (i16 != 0) {
                        cVar2 = c.i;
                    }
                    i11 = i4 & 4;
                    i03Var = i03.a;
                    if (i11 != 0) {
                        circularColor = i03Var.getCircularColor(kk0Var2, 6);
                        i5 &= -897;
                    }
                    if (i6 != 0) {
                        f4 = 4.0f;
                    }
                    if ((i4 & 16) != 0) {
                        i5 &= -57345;
                        circularTrackColor = i03Var.getCircularTrackColor(kk0Var2, 6);
                    }
                    if (i8 != 0) {
                        f5 = f4;
                        z = true;
                        i12 = 1;
                    } else {
                        i12 = i9;
                        z = true;
                        f5 = f4;
                    }
                } else {
                    if (i16 != 0) {
                        cVar2 = c.i;
                    }
                    i11 = i4 & 4;
                    i03Var = i03.a;
                    if (i11 != 0) {
                        circularColor = i03Var.getCircularColor(kk0Var2, 6);
                        i5 &= -897;
                    }
                    if (i6 != 0) {
                        f4 = 4.0f;
                    }
                    if ((i4 & 16) != 0) {
                        i5 &= -57345;
                        circularTrackColor = i03Var.getCircularTrackColor(kk0Var2, 6);
                    }
                    if (i8 != 0) {
                        f5 = f4;
                        z = true;
                        i12 = 1;
                    } else {
                        i12 = i9;
                        z = true;
                        f5 = f4;
                    }
                }
                long j119 = circularTrackColor;
                c cVar16 = cVar2;
                long j1110 = circularColor;
                kk0Var2.s();
                if ((i5 & 14) != 4) {
                    z = false;
                }
                objP = kk0Var2.P();
                if (z) {
                    objP = new o03(f2, 0);
                    kk0Var2.l0(objP);
                } else {
                    objP = new o03(f2, 0);
                    kk0Var2.l0(objP);
                }
                kk0Var = kk0Var2;
                m1881x4c2c3c0b((je1) objP, cVar16, j1110, f5, j119, i12, 0.0f, kk0Var, i5 & 524272, 64);
                cVar3 = cVar16;
                j3 = j1110;
                f6 = f5;
                j4 = j119;
                i13 = i12;
            } else {
                kk0Var2.X();
                if ((i3 & 1) != 0) {
                    if (i16 != 0) {
                        cVar2 = c.i;
                    }
                    i11 = i4 & 4;
                    i03Var = i03.a;
                    if (i11 != 0) {
                        circularColor = i03Var.getCircularColor(kk0Var2, 6);
                        i5 &= -897;
                    }
                    if (i6 != 0) {
                        f4 = 4.0f;
                    }
                    if ((i4 & 16) != 0) {
                        i5 &= -57345;
                        circularTrackColor = i03Var.getCircularTrackColor(kk0Var2, 6);
                    }
                    if (i8 != 0) {
                        f5 = f4;
                        z = true;
                        i12 = 1;
                    } else {
                        i12 = i9;
                        z = true;
                        f5 = f4;
                    }
                } else {
                    if (i16 != 0) {
                        cVar2 = c.i;
                    }
                    i11 = i4 & 4;
                    i03Var = i03.a;
                    if (i11 != 0) {
                        circularColor = i03Var.getCircularColor(kk0Var2, 6);
                        i5 &= -897;
                    }
                    if (i6 != 0) {
                        f4 = 4.0f;
                    }
                    if ((i4 & 16) != 0) {
                        i5 &= -57345;
                        circularTrackColor = i03Var.getCircularTrackColor(kk0Var2, 6);
                    }
                    if (i8 != 0) {
                        f5 = f4;
                        z = true;
                        i12 = 1;
                    } else {
                        i12 = i9;
                        z = true;
                        f5 = f4;
                    }
                }
                long j1111 = circularTrackColor;
                c cVar17 = cVar2;
                long j1112 = circularColor;
                kk0Var2.s();
                if ((i5 & 14) != 4) {
                    z = false;
                }
                objP = kk0Var2.P();
                if (z) {
                    objP = new o03(f2, 0);
                    kk0Var2.l0(objP);
                } else {
                    objP = new o03(f2, 0);
                    kk0Var2.l0(objP);
                }
                kk0Var = kk0Var2;
                m1881x4c2c3c0b((je1) objP, cVar17, j1112, f5, j1111, i12, 0.0f, kk0Var, i5 & 524272, 64);
                cVar3 = cVar17;
                j3 = j1112;
                f6 = f5;
                j4 = j1111;
                i13 = i12;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new p03(f2, cVar3, j3, f6, j4, i13, i3, i4));
            }
        }
        i5 |= 196608;
        i9 = i2;
        if ((74899 & i5) == 74898) {
            kk0Var2.X();
            if ((i3 & 1) != 0) {
                if (i16 != 0) {
                    cVar2 = c.i;
                }
                i11 = i4 & 4;
                i03Var = i03.a;
                if (i11 != 0) {
                    circularColor = i03Var.getCircularColor(kk0Var2, 6);
                    i5 &= -897;
                }
                if (i6 != 0) {
                    f4 = 4.0f;
                }
                if ((i4 & 16) != 0) {
                    i5 &= -57345;
                    circularTrackColor = i03Var.getCircularTrackColor(kk0Var2, 6);
                }
                if (i8 != 0) {
                    f5 = f4;
                    z = true;
                    i12 = 1;
                } else {
                    i12 = i9;
                    z = true;
                    f5 = f4;
                }
            } else {
                if (i16 != 0) {
                    cVar2 = c.i;
                }
                i11 = i4 & 4;
                i03Var = i03.a;
                if (i11 != 0) {
                    circularColor = i03Var.getCircularColor(kk0Var2, 6);
                    i5 &= -897;
                }
                if (i6 != 0) {
                    f4 = 4.0f;
                }
                if ((i4 & 16) != 0) {
                    i5 &= -57345;
                    circularTrackColor = i03Var.getCircularTrackColor(kk0Var2, 6);
                }
                if (i8 != 0) {
                    f5 = f4;
                    z = true;
                    i12 = 1;
                } else {
                    i12 = i9;
                    z = true;
                    f5 = f4;
                }
            }
            long j1113 = circularTrackColor;
            c cVar18 = cVar2;
            long j1114 = circularColor;
            kk0Var2.s();
            if ((i5 & 14) != 4) {
                z = false;
            }
            objP = kk0Var2.P();
            if (z) {
                objP = new o03(f2, 0);
                kk0Var2.l0(objP);
            } else {
                objP = new o03(f2, 0);
                kk0Var2.l0(objP);
            }
            kk0Var = kk0Var2;
            m1881x4c2c3c0b((je1) objP, cVar18, j1114, f5, j1113, i12, 0.0f, kk0Var, i5 & 524272, 64);
            cVar3 = cVar18;
            j3 = j1114;
            f6 = f5;
            j4 = j1113;
            i13 = i12;
        } else {
            kk0Var2.X();
            if ((i3 & 1) != 0) {
                if (i16 != 0) {
                    cVar2 = c.i;
                }
                i11 = i4 & 4;
                i03Var = i03.a;
                if (i11 != 0) {
                    circularColor = i03Var.getCircularColor(kk0Var2, 6);
                    i5 &= -897;
                }
                if (i6 != 0) {
                    f4 = 4.0f;
                }
                if ((i4 & 16) != 0) {
                    i5 &= -57345;
                    circularTrackColor = i03Var.getCircularTrackColor(kk0Var2, 6);
                }
                if (i8 != 0) {
                    f5 = f4;
                    z = true;
                    i12 = 1;
                } else {
                    i12 = i9;
                    z = true;
                    f5 = f4;
                }
            } else {
                if (i16 != 0) {
                    cVar2 = c.i;
                }
                i11 = i4 & 4;
                i03Var = i03.a;
                if (i11 != 0) {
                    circularColor = i03Var.getCircularColor(kk0Var2, 6);
                    i5 &= -897;
                }
                if (i6 != 0) {
                    f4 = 4.0f;
                }
                if ((i4 & 16) != 0) {
                    i5 &= -57345;
                    circularTrackColor = i03Var.getCircularTrackColor(kk0Var2, 6);
                }
                if (i8 != 0) {
                    f5 = f4;
                    z = true;
                    i12 = 1;
                } else {
                    i12 = i9;
                    z = true;
                    f5 = f4;
                }
            }
            long j1115 = circularTrackColor;
            c cVar19 = cVar2;
            long j1116 = circularColor;
            kk0Var2.s();
            if ((i5 & 14) != 4) {
                z = false;
            }
            objP = kk0Var2.P();
            if (z) {
                objP = new o03(f2, 0);
                kk0Var2.l0(objP);
            } else {
                objP = new o03(f2, 0);
                kk0Var2.l0(objP);
            }
            kk0Var = kk0Var2;
            m1881x4c2c3c0b((je1) objP, cVar19, j1116, f5, j1115, i12, 0.0f, kk0Var, i5 & 524272, 64);
            cVar3 = cVar19;
            j3 = j1116;
            f6 = f5;
            j4 = j1115;
            i13 = i12;
        }
        w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new p03(f2, cVar3, j3, f6, j4, i13, i3, i4));
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0119  */
    /* JADX WARN: Code duplicated, block: B:101:0x0121  */
    /* JADX WARN: Code duplicated, block: B:105:0x0157  */
    /* JADX WARN: Code duplicated, block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0046  */
    /* JADX WARN: Code duplicated, block: B:28:0x004a  */
    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    /* JADX WARN: Code duplicated, block: B:31:0x0055  */
    /* JADX WARN: Code duplicated, block: B:34:0x005b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0061  */
    /* JADX WARN: Code duplicated, block: B:39:0x0066  */
    /* JADX WARN: Code duplicated, block: B:41:0x006a  */
    /* JADX WARN: Code duplicated, block: B:43:0x0072  */
    /* JADX WARN: Code duplicated, block: B:44:0x0075  */
    /* JADX WARN: Code duplicated, block: B:48:0x007c  */
    /* JADX WARN: Code duplicated, block: B:50:0x0082  */
    /* JADX WARN: Code duplicated, block: B:53:0x008b  */
    /* JADX WARN: Code duplicated, block: B:55:0x008f  */
    /* JADX WARN: Code duplicated, block: B:58:0x0097  */
    /* JADX WARN: Code duplicated, block: B:60:0x009b  */
    /* JADX WARN: Code duplicated, block: B:62:0x009e  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:65:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ee A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:90:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:91:0x0104  */
    /* JADX WARN: Code duplicated, block: B:93:0x0107  */
    /* JADX WARN: Code duplicated, block: B:94:0x010a  */
    /* JADX WARN: Code duplicated, block: B:97:0x010f  */
    /* JADX WARN: Code duplicated, block: B:98:0x0116  */
    @cv0
    /* JADX INFO: renamed from: CircularProgressIndicator-DUhRLBM, reason: not valid java name */
    public static final /* synthetic */ void m1880x7647c12(je1 je1Var, c cVar, long j, float f2, long j2, int i2, ck0 ck0Var, int i3, int i4) {
        je1 je1Var2;
        int i5;
        c cVar2;
        long j3;
        int i6;
        float f3;
        int i7;
        long j4;
        int i8;
        int i9;
        int i10;
        c cVar3;
        int i11;
        i03 i03Var;
        long circularColor;
        float f4;
        long circularDeterminateTrackColor;
        c cVar4;
        float f5;
        long j5;
        int i12;
        long j6;
        kk0 kk0Var;
        c cVar5;
        long j7;
        float f6;
        long j8;
        int i13;
        w33 w33VarV;
        int i14;
        int i15;
        kk0 kk0Var2 = (kk0) ck0Var;
        kk0Var2.c0(-761680467);
        if ((i4 & 1) != 0) {
            i5 = i3 | 6;
            je1Var2 = je1Var;
        } else {
            je1Var2 = je1Var;
            if ((i3 & 6) == 0) {
                i5 = (kk0Var2.j(je1Var2) ? 4 : 2) | i3;
            } else {
                i5 = i3;
            }
        }
        int i16 = i4 & 2;
        if (i16 == 0) {
            if ((i3 & 48) == 0) {
                cVar2 = cVar;
                i5 |= kk0Var2.h(cVar2) ? 32 : 16;
            }
            if ((i3 & 384) == 0) {
                if ((i4 & 4) == 0) {
                    j3 = j;
                    if (kk0Var2.g(j3)) {
                        i15 = FontInfo.NUMBER_OF_CHAR_CODES;
                    }
                    i5 |= i15;
                } else {
                    j3 = j;
                }
                i15 = Uuid.SIZE_BITS;
                i5 |= i15;
            } else {
                j3 = j;
            }
            i6 = i4 & 8;
            if (i6 != 0) {
                if ((i3 & 3072) == 0) {
                    f3 = f2;
                    if (kk0Var2.e(f3)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i5 |= i7;
                }
                if ((i3 & 24576) == 0) {
                    j4 = j2;
                    if ((i4 & 16) == 0 || !kk0Var2.g(j4)) {
                        i14 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                    } else {
                        i14 = 16384;
                    }
                    i5 |= i14;
                } else {
                    j4 = j2;
                }
                i8 = i4 & 32;
                if (i8 != 0) {
                    if ((196608 & i3) == 0) {
                        i9 = i2;
                        if (kk0Var2.f(i9)) {
                            i10 = 131072;
                        } else {
                            i10 = 65536;
                        }
                        i5 |= i10;
                    }
                    if ((74899 & i5) == 74898 || !kk0Var2.F()) {
                        kk0Var2.X();
                        if ((i3 & 1) != 0 || kk0Var2.D()) {
                            if (i16 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            i11 = i4 & 4;
                            i03Var = i03.a;
                            if (i11 != 0) {
                                circularColor = i03Var.getCircularColor(kk0Var2, 6);
                                i5 &= -897;
                            } else {
                                circularColor = j3;
                            }
                            if (i6 != 0) {
                                f4 = 4.0f;
                            } else {
                                f4 = f3;
                            }
                            if ((i4 & 16) != 0) {
                                circularDeterminateTrackColor = i03Var.getCircularDeterminateTrackColor(kk0Var2, 6);
                                i5 &= -57345;
                            } else {
                                circularDeterminateTrackColor = j4;
                            }
                            if (i8 != 0) {
                                cVar4 = cVar3;
                                j6 = circularColor;
                                f5 = f4;
                                j5 = circularDeterminateTrackColor;
                                i12 = 1;
                            } else {
                                cVar4 = cVar3;
                                f5 = f4;
                                j5 = circularDeterminateTrackColor;
                                i12 = i9;
                                j6 = circularColor;
                            }
                        } else {
                            kk0Var2.V();
                            if ((i4 & 4) != 0) {
                                i5 &= -897;
                            }
                            if ((i4 & 16) != 0) {
                                i5 &= -57345;
                            }
                            f5 = f3;
                            j5 = j4;
                            i12 = i9;
                            cVar4 = cVar2;
                            j6 = j3;
                        }
                        kk0Var2.s();
                        kk0Var = kk0Var2;
                        m1881x4c2c3c0b(je1Var2, cVar4, j6, f5, j5, i12, 4.0f, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (i5 & 458752), 0);
                        cVar5 = cVar4;
                        j7 = j6;
                        f6 = f5;
                        j8 = j5;
                        i13 = i12;
                    } else {
                        kk0Var2.V();
                        kk0Var = kk0Var2;
                        cVar5 = cVar2;
                        j7 = j3;
                        f6 = f3;
                        j8 = j4;
                        i13 = i9;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new j03(je1Var, cVar5, j7, f6, j8, i13, i3, i4));
                    }
                }
                i5 |= 196608;
                i9 = i2;
                if ((74899 & i5) == 74898) {
                    kk0Var2.X();
                    if ((i3 & 1) != 0) {
                        if (i16 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        i11 = i4 & 4;
                        i03Var = i03.a;
                        if (i11 != 0) {
                            circularColor = i03Var.getCircularColor(kk0Var2, 6);
                            i5 &= -897;
                        } else {
                            circularColor = j3;
                        }
                        if (i6 != 0) {
                            f4 = 4.0f;
                        } else {
                            f4 = f3;
                        }
                        if ((i4 & 16) != 0) {
                            circularDeterminateTrackColor = i03Var.getCircularDeterminateTrackColor(kk0Var2, 6);
                            i5 &= -57345;
                        } else {
                            circularDeterminateTrackColor = j4;
                        }
                        if (i8 != 0) {
                            cVar4 = cVar3;
                            j6 = circularColor;
                            f5 = f4;
                            j5 = circularDeterminateTrackColor;
                            i12 = 1;
                        } else {
                            cVar4 = cVar3;
                            f5 = f4;
                            j5 = circularDeterminateTrackColor;
                            i12 = i9;
                            j6 = circularColor;
                        }
                    } else {
                        if (i16 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        i11 = i4 & 4;
                        i03Var = i03.a;
                        if (i11 != 0) {
                            circularColor = i03Var.getCircularColor(kk0Var2, 6);
                            i5 &= -897;
                        } else {
                            circularColor = j3;
                        }
                        if (i6 != 0) {
                            f4 = 4.0f;
                        } else {
                            f4 = f3;
                        }
                        if ((i4 & 16) != 0) {
                            circularDeterminateTrackColor = i03Var.getCircularDeterminateTrackColor(kk0Var2, 6);
                            i5 &= -57345;
                        } else {
                            circularDeterminateTrackColor = j4;
                        }
                        if (i8 != 0) {
                            cVar4 = cVar3;
                            j6 = circularColor;
                            f5 = f4;
                            j5 = circularDeterminateTrackColor;
                            i12 = 1;
                        } else {
                            cVar4 = cVar3;
                            f5 = f4;
                            j5 = circularDeterminateTrackColor;
                            i12 = i9;
                            j6 = circularColor;
                        }
                    }
                    kk0Var2.s();
                    kk0Var = kk0Var2;
                    m1881x4c2c3c0b(je1Var2, cVar4, j6, f5, j5, i12, 4.0f, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (i5 & 458752), 0);
                    cVar5 = cVar4;
                    j7 = j6;
                    f6 = f5;
                    j8 = j5;
                    i13 = i12;
                } else {
                    kk0Var2.X();
                    if ((i3 & 1) != 0) {
                        if (i16 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        i11 = i4 & 4;
                        i03Var = i03.a;
                        if (i11 != 0) {
                            circularColor = i03Var.getCircularColor(kk0Var2, 6);
                            i5 &= -897;
                        } else {
                            circularColor = j3;
                        }
                        if (i6 != 0) {
                            f4 = 4.0f;
                        } else {
                            f4 = f3;
                        }
                        if ((i4 & 16) != 0) {
                            circularDeterminateTrackColor = i03Var.getCircularDeterminateTrackColor(kk0Var2, 6);
                            i5 &= -57345;
                        } else {
                            circularDeterminateTrackColor = j4;
                        }
                        if (i8 != 0) {
                            cVar4 = cVar3;
                            j6 = circularColor;
                            f5 = f4;
                            j5 = circularDeterminateTrackColor;
                            i12 = 1;
                        } else {
                            cVar4 = cVar3;
                            f5 = f4;
                            j5 = circularDeterminateTrackColor;
                            i12 = i9;
                            j6 = circularColor;
                        }
                    } else {
                        if (i16 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        i11 = i4 & 4;
                        i03Var = i03.a;
                        if (i11 != 0) {
                            circularColor = i03Var.getCircularColor(kk0Var2, 6);
                            i5 &= -897;
                        } else {
                            circularColor = j3;
                        }
                        if (i6 != 0) {
                            f4 = 4.0f;
                        } else {
                            f4 = f3;
                        }
                        if ((i4 & 16) != 0) {
                            circularDeterminateTrackColor = i03Var.getCircularDeterminateTrackColor(kk0Var2, 6);
                            i5 &= -57345;
                        } else {
                            circularDeterminateTrackColor = j4;
                        }
                        if (i8 != 0) {
                            cVar4 = cVar3;
                            j6 = circularColor;
                            f5 = f4;
                            j5 = circularDeterminateTrackColor;
                            i12 = 1;
                        } else {
                            cVar4 = cVar3;
                            f5 = f4;
                            j5 = circularDeterminateTrackColor;
                            i12 = i9;
                            j6 = circularColor;
                        }
                    }
                    kk0Var2.s();
                    kk0Var = kk0Var2;
                    m1881x4c2c3c0b(je1Var2, cVar4, j6, f5, j5, i12, 4.0f, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (i5 & 458752), 0);
                    cVar5 = cVar4;
                    j7 = j6;
                    f6 = f5;
                    j8 = j5;
                    i13 = i12;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new j03(je1Var, cVar5, j7, f6, j8, i13, i3, i4));
                }
            }
            i5 |= 3072;
            f3 = f2;
            if ((i3 & 24576) == 0) {
                j4 = j2;
                if ((i4 & 16) == 0) {
                    i14 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                } else {
                    i14 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                }
                i5 |= i14;
            } else {
                j4 = j2;
            }
            i8 = i4 & 32;
            if (i8 != 0) {
                if ((196608 & i3) == 0) {
                    i9 = i2;
                    if (kk0Var2.f(i9)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                    i5 |= i10;
                }
                if ((74899 & i5) == 74898) {
                    kk0Var2.X();
                    if ((i3 & 1) != 0) {
                        if (i16 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        i11 = i4 & 4;
                        i03Var = i03.a;
                        if (i11 != 0) {
                            circularColor = i03Var.getCircularColor(kk0Var2, 6);
                            i5 &= -897;
                        } else {
                            circularColor = j3;
                        }
                        if (i6 != 0) {
                            f4 = 4.0f;
                        } else {
                            f4 = f3;
                        }
                        if ((i4 & 16) != 0) {
                            circularDeterminateTrackColor = i03Var.getCircularDeterminateTrackColor(kk0Var2, 6);
                            i5 &= -57345;
                        } else {
                            circularDeterminateTrackColor = j4;
                        }
                        if (i8 != 0) {
                            cVar4 = cVar3;
                            j6 = circularColor;
                            f5 = f4;
                            j5 = circularDeterminateTrackColor;
                            i12 = 1;
                        } else {
                            cVar4 = cVar3;
                            f5 = f4;
                            j5 = circularDeterminateTrackColor;
                            i12 = i9;
                            j6 = circularColor;
                        }
                    } else {
                        if (i16 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        i11 = i4 & 4;
                        i03Var = i03.a;
                        if (i11 != 0) {
                            circularColor = i03Var.getCircularColor(kk0Var2, 6);
                            i5 &= -897;
                        } else {
                            circularColor = j3;
                        }
                        if (i6 != 0) {
                            f4 = 4.0f;
                        } else {
                            f4 = f3;
                        }
                        if ((i4 & 16) != 0) {
                            circularDeterminateTrackColor = i03Var.getCircularDeterminateTrackColor(kk0Var2, 6);
                            i5 &= -57345;
                        } else {
                            circularDeterminateTrackColor = j4;
                        }
                        if (i8 != 0) {
                            cVar4 = cVar3;
                            j6 = circularColor;
                            f5 = f4;
                            j5 = circularDeterminateTrackColor;
                            i12 = 1;
                        } else {
                            cVar4 = cVar3;
                            f5 = f4;
                            j5 = circularDeterminateTrackColor;
                            i12 = i9;
                            j6 = circularColor;
                        }
                    }
                    kk0Var2.s();
                    kk0Var = kk0Var2;
                    m1881x4c2c3c0b(je1Var2, cVar4, j6, f5, j5, i12, 4.0f, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (i5 & 458752), 0);
                    cVar5 = cVar4;
                    j7 = j6;
                    f6 = f5;
                    j8 = j5;
                    i13 = i12;
                } else {
                    kk0Var2.X();
                    if ((i3 & 1) != 0) {
                        if (i16 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        i11 = i4 & 4;
                        i03Var = i03.a;
                        if (i11 != 0) {
                            circularColor = i03Var.getCircularColor(kk0Var2, 6);
                            i5 &= -897;
                        } else {
                            circularColor = j3;
                        }
                        if (i6 != 0) {
                            f4 = 4.0f;
                        } else {
                            f4 = f3;
                        }
                        if ((i4 & 16) != 0) {
                            circularDeterminateTrackColor = i03Var.getCircularDeterminateTrackColor(kk0Var2, 6);
                            i5 &= -57345;
                        } else {
                            circularDeterminateTrackColor = j4;
                        }
                        if (i8 != 0) {
                            cVar4 = cVar3;
                            j6 = circularColor;
                            f5 = f4;
                            j5 = circularDeterminateTrackColor;
                            i12 = 1;
                        } else {
                            cVar4 = cVar3;
                            f5 = f4;
                            j5 = circularDeterminateTrackColor;
                            i12 = i9;
                            j6 = circularColor;
                        }
                    } else {
                        if (i16 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        i11 = i4 & 4;
                        i03Var = i03.a;
                        if (i11 != 0) {
                            circularColor = i03Var.getCircularColor(kk0Var2, 6);
                            i5 &= -897;
                        } else {
                            circularColor = j3;
                        }
                        if (i6 != 0) {
                            f4 = 4.0f;
                        } else {
                            f4 = f3;
                        }
                        if ((i4 & 16) != 0) {
                            circularDeterminateTrackColor = i03Var.getCircularDeterminateTrackColor(kk0Var2, 6);
                            i5 &= -57345;
                        } else {
                            circularDeterminateTrackColor = j4;
                        }
                        if (i8 != 0) {
                            cVar4 = cVar3;
                            j6 = circularColor;
                            f5 = f4;
                            j5 = circularDeterminateTrackColor;
                            i12 = 1;
                        } else {
                            cVar4 = cVar3;
                            f5 = f4;
                            j5 = circularDeterminateTrackColor;
                            i12 = i9;
                            j6 = circularColor;
                        }
                    }
                    kk0Var2.s();
                    kk0Var = kk0Var2;
                    m1881x4c2c3c0b(je1Var2, cVar4, j6, f5, j5, i12, 4.0f, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (i5 & 458752), 0);
                    cVar5 = cVar4;
                    j7 = j6;
                    f6 = f5;
                    j8 = j5;
                    i13 = i12;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new j03(je1Var, cVar5, j7, f6, j8, i13, i3, i4));
                }
            }
            i5 |= 196608;
            i9 = i2;
            if ((74899 & i5) == 74898) {
                kk0Var2.X();
                if ((i3 & 1) != 0) {
                    if (i16 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    i11 = i4 & 4;
                    i03Var = i03.a;
                    if (i11 != 0) {
                        circularColor = i03Var.getCircularColor(kk0Var2, 6);
                        i5 &= -897;
                    } else {
                        circularColor = j3;
                    }
                    if (i6 != 0) {
                        f4 = 4.0f;
                    } else {
                        f4 = f3;
                    }
                    if ((i4 & 16) != 0) {
                        circularDeterminateTrackColor = i03Var.getCircularDeterminateTrackColor(kk0Var2, 6);
                        i5 &= -57345;
                    } else {
                        circularDeterminateTrackColor = j4;
                    }
                    if (i8 != 0) {
                        cVar4 = cVar3;
                        j6 = circularColor;
                        f5 = f4;
                        j5 = circularDeterminateTrackColor;
                        i12 = 1;
                    } else {
                        cVar4 = cVar3;
                        f5 = f4;
                        j5 = circularDeterminateTrackColor;
                        i12 = i9;
                        j6 = circularColor;
                    }
                } else {
                    if (i16 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    i11 = i4 & 4;
                    i03Var = i03.a;
                    if (i11 != 0) {
                        circularColor = i03Var.getCircularColor(kk0Var2, 6);
                        i5 &= -897;
                    } else {
                        circularColor = j3;
                    }
                    if (i6 != 0) {
                        f4 = 4.0f;
                    } else {
                        f4 = f3;
                    }
                    if ((i4 & 16) != 0) {
                        circularDeterminateTrackColor = i03Var.getCircularDeterminateTrackColor(kk0Var2, 6);
                        i5 &= -57345;
                    } else {
                        circularDeterminateTrackColor = j4;
                    }
                    if (i8 != 0) {
                        cVar4 = cVar3;
                        j6 = circularColor;
                        f5 = f4;
                        j5 = circularDeterminateTrackColor;
                        i12 = 1;
                    } else {
                        cVar4 = cVar3;
                        f5 = f4;
                        j5 = circularDeterminateTrackColor;
                        i12 = i9;
                        j6 = circularColor;
                    }
                }
                kk0Var2.s();
                kk0Var = kk0Var2;
                m1881x4c2c3c0b(je1Var2, cVar4, j6, f5, j5, i12, 4.0f, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (i5 & 458752), 0);
                cVar5 = cVar4;
                j7 = j6;
                f6 = f5;
                j8 = j5;
                i13 = i12;
            } else {
                kk0Var2.X();
                if ((i3 & 1) != 0) {
                    if (i16 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    i11 = i4 & 4;
                    i03Var = i03.a;
                    if (i11 != 0) {
                        circularColor = i03Var.getCircularColor(kk0Var2, 6);
                        i5 &= -897;
                    } else {
                        circularColor = j3;
                    }
                    if (i6 != 0) {
                        f4 = 4.0f;
                    } else {
                        f4 = f3;
                    }
                    if ((i4 & 16) != 0) {
                        circularDeterminateTrackColor = i03Var.getCircularDeterminateTrackColor(kk0Var2, 6);
                        i5 &= -57345;
                    } else {
                        circularDeterminateTrackColor = j4;
                    }
                    if (i8 != 0) {
                        cVar4 = cVar3;
                        j6 = circularColor;
                        f5 = f4;
                        j5 = circularDeterminateTrackColor;
                        i12 = 1;
                    } else {
                        cVar4 = cVar3;
                        f5 = f4;
                        j5 = circularDeterminateTrackColor;
                        i12 = i9;
                        j6 = circularColor;
                    }
                } else {
                    if (i16 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    i11 = i4 & 4;
                    i03Var = i03.a;
                    if (i11 != 0) {
                        circularColor = i03Var.getCircularColor(kk0Var2, 6);
                        i5 &= -897;
                    } else {
                        circularColor = j3;
                    }
                    if (i6 != 0) {
                        f4 = 4.0f;
                    } else {
                        f4 = f3;
                    }
                    if ((i4 & 16) != 0) {
                        circularDeterminateTrackColor = i03Var.getCircularDeterminateTrackColor(kk0Var2, 6);
                        i5 &= -57345;
                    } else {
                        circularDeterminateTrackColor = j4;
                    }
                    if (i8 != 0) {
                        cVar4 = cVar3;
                        j6 = circularColor;
                        f5 = f4;
                        j5 = circularDeterminateTrackColor;
                        i12 = 1;
                    } else {
                        cVar4 = cVar3;
                        f5 = f4;
                        j5 = circularDeterminateTrackColor;
                        i12 = i9;
                        j6 = circularColor;
                    }
                }
                kk0Var2.s();
                kk0Var = kk0Var2;
                m1881x4c2c3c0b(je1Var2, cVar4, j6, f5, j5, i12, 4.0f, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (i5 & 458752), 0);
                cVar5 = cVar4;
                j7 = j6;
                f6 = f5;
                j8 = j5;
                i13 = i12;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new j03(je1Var, cVar5, j7, f6, j8, i13, i3, i4));
            }
        }
        i5 |= 48;
        cVar2 = cVar;
        if ((i3 & 384) == 0) {
            if ((i4 & 4) == 0) {
                j3 = j;
                if (kk0Var2.g(j3)) {
                    i15 = FontInfo.NUMBER_OF_CHAR_CODES;
                }
                i5 |= i15;
            } else {
                j3 = j;
            }
            i15 = Uuid.SIZE_BITS;
            i5 |= i15;
        } else {
            j3 = j;
        }
        i6 = i4 & 8;
        if (i6 != 0) {
            if ((i3 & 3072) == 0) {
                f3 = f2;
                if (kk0Var2.e(f3)) {
                    i7 = 2048;
                } else {
                    i7 = 1024;
                }
                i5 |= i7;
            }
            if ((i3 & 24576) == 0) {
                j4 = j2;
                if ((i4 & 16) == 0) {
                    i14 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                } else {
                    i14 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                }
                i5 |= i14;
            } else {
                j4 = j2;
            }
            i8 = i4 & 32;
            if (i8 != 0) {
                if ((196608 & i3) == 0) {
                    i9 = i2;
                    if (kk0Var2.f(i9)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                    i5 |= i10;
                }
                if ((74899 & i5) == 74898) {
                    kk0Var2.X();
                    if ((i3 & 1) != 0) {
                        if (i16 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        i11 = i4 & 4;
                        i03Var = i03.a;
                        if (i11 != 0) {
                            circularColor = i03Var.getCircularColor(kk0Var2, 6);
                            i5 &= -897;
                        } else {
                            circularColor = j3;
                        }
                        if (i6 != 0) {
                            f4 = 4.0f;
                        } else {
                            f4 = f3;
                        }
                        if ((i4 & 16) != 0) {
                            circularDeterminateTrackColor = i03Var.getCircularDeterminateTrackColor(kk0Var2, 6);
                            i5 &= -57345;
                        } else {
                            circularDeterminateTrackColor = j4;
                        }
                        if (i8 != 0) {
                            cVar4 = cVar3;
                            j6 = circularColor;
                            f5 = f4;
                            j5 = circularDeterminateTrackColor;
                            i12 = 1;
                        } else {
                            cVar4 = cVar3;
                            f5 = f4;
                            j5 = circularDeterminateTrackColor;
                            i12 = i9;
                            j6 = circularColor;
                        }
                    } else {
                        if (i16 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        i11 = i4 & 4;
                        i03Var = i03.a;
                        if (i11 != 0) {
                            circularColor = i03Var.getCircularColor(kk0Var2, 6);
                            i5 &= -897;
                        } else {
                            circularColor = j3;
                        }
                        if (i6 != 0) {
                            f4 = 4.0f;
                        } else {
                            f4 = f3;
                        }
                        if ((i4 & 16) != 0) {
                            circularDeterminateTrackColor = i03Var.getCircularDeterminateTrackColor(kk0Var2, 6);
                            i5 &= -57345;
                        } else {
                            circularDeterminateTrackColor = j4;
                        }
                        if (i8 != 0) {
                            cVar4 = cVar3;
                            j6 = circularColor;
                            f5 = f4;
                            j5 = circularDeterminateTrackColor;
                            i12 = 1;
                        } else {
                            cVar4 = cVar3;
                            f5 = f4;
                            j5 = circularDeterminateTrackColor;
                            i12 = i9;
                            j6 = circularColor;
                        }
                    }
                    kk0Var2.s();
                    kk0Var = kk0Var2;
                    m1881x4c2c3c0b(je1Var2, cVar4, j6, f5, j5, i12, 4.0f, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (i5 & 458752), 0);
                    cVar5 = cVar4;
                    j7 = j6;
                    f6 = f5;
                    j8 = j5;
                    i13 = i12;
                } else {
                    kk0Var2.X();
                    if ((i3 & 1) != 0) {
                        if (i16 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        i11 = i4 & 4;
                        i03Var = i03.a;
                        if (i11 != 0) {
                            circularColor = i03Var.getCircularColor(kk0Var2, 6);
                            i5 &= -897;
                        } else {
                            circularColor = j3;
                        }
                        if (i6 != 0) {
                            f4 = 4.0f;
                        } else {
                            f4 = f3;
                        }
                        if ((i4 & 16) != 0) {
                            circularDeterminateTrackColor = i03Var.getCircularDeterminateTrackColor(kk0Var2, 6);
                            i5 &= -57345;
                        } else {
                            circularDeterminateTrackColor = j4;
                        }
                        if (i8 != 0) {
                            cVar4 = cVar3;
                            j6 = circularColor;
                            f5 = f4;
                            j5 = circularDeterminateTrackColor;
                            i12 = 1;
                        } else {
                            cVar4 = cVar3;
                            f5 = f4;
                            j5 = circularDeterminateTrackColor;
                            i12 = i9;
                            j6 = circularColor;
                        }
                    } else {
                        if (i16 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        i11 = i4 & 4;
                        i03Var = i03.a;
                        if (i11 != 0) {
                            circularColor = i03Var.getCircularColor(kk0Var2, 6);
                            i5 &= -897;
                        } else {
                            circularColor = j3;
                        }
                        if (i6 != 0) {
                            f4 = 4.0f;
                        } else {
                            f4 = f3;
                        }
                        if ((i4 & 16) != 0) {
                            circularDeterminateTrackColor = i03Var.getCircularDeterminateTrackColor(kk0Var2, 6);
                            i5 &= -57345;
                        } else {
                            circularDeterminateTrackColor = j4;
                        }
                        if (i8 != 0) {
                            cVar4 = cVar3;
                            j6 = circularColor;
                            f5 = f4;
                            j5 = circularDeterminateTrackColor;
                            i12 = 1;
                        } else {
                            cVar4 = cVar3;
                            f5 = f4;
                            j5 = circularDeterminateTrackColor;
                            i12 = i9;
                            j6 = circularColor;
                        }
                    }
                    kk0Var2.s();
                    kk0Var = kk0Var2;
                    m1881x4c2c3c0b(je1Var2, cVar4, j6, f5, j5, i12, 4.0f, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (i5 & 458752), 0);
                    cVar5 = cVar4;
                    j7 = j6;
                    f6 = f5;
                    j8 = j5;
                    i13 = i12;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new j03(je1Var, cVar5, j7, f6, j8, i13, i3, i4));
                }
            }
            i5 |= 196608;
            i9 = i2;
            if ((74899 & i5) == 74898) {
                kk0Var2.X();
                if ((i3 & 1) != 0) {
                    if (i16 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    i11 = i4 & 4;
                    i03Var = i03.a;
                    if (i11 != 0) {
                        circularColor = i03Var.getCircularColor(kk0Var2, 6);
                        i5 &= -897;
                    } else {
                        circularColor = j3;
                    }
                    if (i6 != 0) {
                        f4 = 4.0f;
                    } else {
                        f4 = f3;
                    }
                    if ((i4 & 16) != 0) {
                        circularDeterminateTrackColor = i03Var.getCircularDeterminateTrackColor(kk0Var2, 6);
                        i5 &= -57345;
                    } else {
                        circularDeterminateTrackColor = j4;
                    }
                    if (i8 != 0) {
                        cVar4 = cVar3;
                        j6 = circularColor;
                        f5 = f4;
                        j5 = circularDeterminateTrackColor;
                        i12 = 1;
                    } else {
                        cVar4 = cVar3;
                        f5 = f4;
                        j5 = circularDeterminateTrackColor;
                        i12 = i9;
                        j6 = circularColor;
                    }
                } else {
                    if (i16 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    i11 = i4 & 4;
                    i03Var = i03.a;
                    if (i11 != 0) {
                        circularColor = i03Var.getCircularColor(kk0Var2, 6);
                        i5 &= -897;
                    } else {
                        circularColor = j3;
                    }
                    if (i6 != 0) {
                        f4 = 4.0f;
                    } else {
                        f4 = f3;
                    }
                    if ((i4 & 16) != 0) {
                        circularDeterminateTrackColor = i03Var.getCircularDeterminateTrackColor(kk0Var2, 6);
                        i5 &= -57345;
                    } else {
                        circularDeterminateTrackColor = j4;
                    }
                    if (i8 != 0) {
                        cVar4 = cVar3;
                        j6 = circularColor;
                        f5 = f4;
                        j5 = circularDeterminateTrackColor;
                        i12 = 1;
                    } else {
                        cVar4 = cVar3;
                        f5 = f4;
                        j5 = circularDeterminateTrackColor;
                        i12 = i9;
                        j6 = circularColor;
                    }
                }
                kk0Var2.s();
                kk0Var = kk0Var2;
                m1881x4c2c3c0b(je1Var2, cVar4, j6, f5, j5, i12, 4.0f, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (i5 & 458752), 0);
                cVar5 = cVar4;
                j7 = j6;
                f6 = f5;
                j8 = j5;
                i13 = i12;
            } else {
                kk0Var2.X();
                if ((i3 & 1) != 0) {
                    if (i16 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    i11 = i4 & 4;
                    i03Var = i03.a;
                    if (i11 != 0) {
                        circularColor = i03Var.getCircularColor(kk0Var2, 6);
                        i5 &= -897;
                    } else {
                        circularColor = j3;
                    }
                    if (i6 != 0) {
                        f4 = 4.0f;
                    } else {
                        f4 = f3;
                    }
                    if ((i4 & 16) != 0) {
                        circularDeterminateTrackColor = i03Var.getCircularDeterminateTrackColor(kk0Var2, 6);
                        i5 &= -57345;
                    } else {
                        circularDeterminateTrackColor = j4;
                    }
                    if (i8 != 0) {
                        cVar4 = cVar3;
                        j6 = circularColor;
                        f5 = f4;
                        j5 = circularDeterminateTrackColor;
                        i12 = 1;
                    } else {
                        cVar4 = cVar3;
                        f5 = f4;
                        j5 = circularDeterminateTrackColor;
                        i12 = i9;
                        j6 = circularColor;
                    }
                } else {
                    if (i16 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    i11 = i4 & 4;
                    i03Var = i03.a;
                    if (i11 != 0) {
                        circularColor = i03Var.getCircularColor(kk0Var2, 6);
                        i5 &= -897;
                    } else {
                        circularColor = j3;
                    }
                    if (i6 != 0) {
                        f4 = 4.0f;
                    } else {
                        f4 = f3;
                    }
                    if ((i4 & 16) != 0) {
                        circularDeterminateTrackColor = i03Var.getCircularDeterminateTrackColor(kk0Var2, 6);
                        i5 &= -57345;
                    } else {
                        circularDeterminateTrackColor = j4;
                    }
                    if (i8 != 0) {
                        cVar4 = cVar3;
                        j6 = circularColor;
                        f5 = f4;
                        j5 = circularDeterminateTrackColor;
                        i12 = 1;
                    } else {
                        cVar4 = cVar3;
                        f5 = f4;
                        j5 = circularDeterminateTrackColor;
                        i12 = i9;
                        j6 = circularColor;
                    }
                }
                kk0Var2.s();
                kk0Var = kk0Var2;
                m1881x4c2c3c0b(je1Var2, cVar4, j6, f5, j5, i12, 4.0f, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (i5 & 458752), 0);
                cVar5 = cVar4;
                j7 = j6;
                f6 = f5;
                j8 = j5;
                i13 = i12;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new j03(je1Var, cVar5, j7, f6, j8, i13, i3, i4));
            }
        }
        i5 |= 3072;
        f3 = f2;
        if ((i3 & 24576) == 0) {
            j4 = j2;
            if ((i4 & 16) == 0) {
                i14 = ConstantsKt.DEFAULT_BUFFER_SIZE;
            } else {
                i14 = ConstantsKt.DEFAULT_BUFFER_SIZE;
            }
            i5 |= i14;
        } else {
            j4 = j2;
        }
        i8 = i4 & 32;
        if (i8 != 0) {
            if ((196608 & i3) == 0) {
                i9 = i2;
                if (kk0Var2.f(i9)) {
                    i10 = 131072;
                } else {
                    i10 = 65536;
                }
                i5 |= i10;
            }
            if ((74899 & i5) == 74898) {
                kk0Var2.X();
                if ((i3 & 1) != 0) {
                    if (i16 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    i11 = i4 & 4;
                    i03Var = i03.a;
                    if (i11 != 0) {
                        circularColor = i03Var.getCircularColor(kk0Var2, 6);
                        i5 &= -897;
                    } else {
                        circularColor = j3;
                    }
                    if (i6 != 0) {
                        f4 = 4.0f;
                    } else {
                        f4 = f3;
                    }
                    if ((i4 & 16) != 0) {
                        circularDeterminateTrackColor = i03Var.getCircularDeterminateTrackColor(kk0Var2, 6);
                        i5 &= -57345;
                    } else {
                        circularDeterminateTrackColor = j4;
                    }
                    if (i8 != 0) {
                        cVar4 = cVar3;
                        j6 = circularColor;
                        f5 = f4;
                        j5 = circularDeterminateTrackColor;
                        i12 = 1;
                    } else {
                        cVar4 = cVar3;
                        f5 = f4;
                        j5 = circularDeterminateTrackColor;
                        i12 = i9;
                        j6 = circularColor;
                    }
                } else {
                    if (i16 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    i11 = i4 & 4;
                    i03Var = i03.a;
                    if (i11 != 0) {
                        circularColor = i03Var.getCircularColor(kk0Var2, 6);
                        i5 &= -897;
                    } else {
                        circularColor = j3;
                    }
                    if (i6 != 0) {
                        f4 = 4.0f;
                    } else {
                        f4 = f3;
                    }
                    if ((i4 & 16) != 0) {
                        circularDeterminateTrackColor = i03Var.getCircularDeterminateTrackColor(kk0Var2, 6);
                        i5 &= -57345;
                    } else {
                        circularDeterminateTrackColor = j4;
                    }
                    if (i8 != 0) {
                        cVar4 = cVar3;
                        j6 = circularColor;
                        f5 = f4;
                        j5 = circularDeterminateTrackColor;
                        i12 = 1;
                    } else {
                        cVar4 = cVar3;
                        f5 = f4;
                        j5 = circularDeterminateTrackColor;
                        i12 = i9;
                        j6 = circularColor;
                    }
                }
                kk0Var2.s();
                kk0Var = kk0Var2;
                m1881x4c2c3c0b(je1Var2, cVar4, j6, f5, j5, i12, 4.0f, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (i5 & 458752), 0);
                cVar5 = cVar4;
                j7 = j6;
                f6 = f5;
                j8 = j5;
                i13 = i12;
            } else {
                kk0Var2.X();
                if ((i3 & 1) != 0) {
                    if (i16 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    i11 = i4 & 4;
                    i03Var = i03.a;
                    if (i11 != 0) {
                        circularColor = i03Var.getCircularColor(kk0Var2, 6);
                        i5 &= -897;
                    } else {
                        circularColor = j3;
                    }
                    if (i6 != 0) {
                        f4 = 4.0f;
                    } else {
                        f4 = f3;
                    }
                    if ((i4 & 16) != 0) {
                        circularDeterminateTrackColor = i03Var.getCircularDeterminateTrackColor(kk0Var2, 6);
                        i5 &= -57345;
                    } else {
                        circularDeterminateTrackColor = j4;
                    }
                    if (i8 != 0) {
                        cVar4 = cVar3;
                        j6 = circularColor;
                        f5 = f4;
                        j5 = circularDeterminateTrackColor;
                        i12 = 1;
                    } else {
                        cVar4 = cVar3;
                        f5 = f4;
                        j5 = circularDeterminateTrackColor;
                        i12 = i9;
                        j6 = circularColor;
                    }
                } else {
                    if (i16 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    i11 = i4 & 4;
                    i03Var = i03.a;
                    if (i11 != 0) {
                        circularColor = i03Var.getCircularColor(kk0Var2, 6);
                        i5 &= -897;
                    } else {
                        circularColor = j3;
                    }
                    if (i6 != 0) {
                        f4 = 4.0f;
                    } else {
                        f4 = f3;
                    }
                    if ((i4 & 16) != 0) {
                        circularDeterminateTrackColor = i03Var.getCircularDeterminateTrackColor(kk0Var2, 6);
                        i5 &= -57345;
                    } else {
                        circularDeterminateTrackColor = j4;
                    }
                    if (i8 != 0) {
                        cVar4 = cVar3;
                        j6 = circularColor;
                        f5 = f4;
                        j5 = circularDeterminateTrackColor;
                        i12 = 1;
                    } else {
                        cVar4 = cVar3;
                        f5 = f4;
                        j5 = circularDeterminateTrackColor;
                        i12 = i9;
                        j6 = circularColor;
                    }
                }
                kk0Var2.s();
                kk0Var = kk0Var2;
                m1881x4c2c3c0b(je1Var2, cVar4, j6, f5, j5, i12, 4.0f, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (i5 & 458752), 0);
                cVar5 = cVar4;
                j7 = j6;
                f6 = f5;
                j8 = j5;
                i13 = i12;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new j03(je1Var, cVar5, j7, f6, j8, i13, i3, i4));
            }
        }
        i5 |= 196608;
        i9 = i2;
        if ((74899 & i5) == 74898) {
            kk0Var2.X();
            if ((i3 & 1) != 0) {
                if (i16 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                i11 = i4 & 4;
                i03Var = i03.a;
                if (i11 != 0) {
                    circularColor = i03Var.getCircularColor(kk0Var2, 6);
                    i5 &= -897;
                } else {
                    circularColor = j3;
                }
                if (i6 != 0) {
                    f4 = 4.0f;
                } else {
                    f4 = f3;
                }
                if ((i4 & 16) != 0) {
                    circularDeterminateTrackColor = i03Var.getCircularDeterminateTrackColor(kk0Var2, 6);
                    i5 &= -57345;
                } else {
                    circularDeterminateTrackColor = j4;
                }
                if (i8 != 0) {
                    cVar4 = cVar3;
                    j6 = circularColor;
                    f5 = f4;
                    j5 = circularDeterminateTrackColor;
                    i12 = 1;
                } else {
                    cVar4 = cVar3;
                    f5 = f4;
                    j5 = circularDeterminateTrackColor;
                    i12 = i9;
                    j6 = circularColor;
                }
            } else {
                if (i16 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                i11 = i4 & 4;
                i03Var = i03.a;
                if (i11 != 0) {
                    circularColor = i03Var.getCircularColor(kk0Var2, 6);
                    i5 &= -897;
                } else {
                    circularColor = j3;
                }
                if (i6 != 0) {
                    f4 = 4.0f;
                } else {
                    f4 = f3;
                }
                if ((i4 & 16) != 0) {
                    circularDeterminateTrackColor = i03Var.getCircularDeterminateTrackColor(kk0Var2, 6);
                    i5 &= -57345;
                } else {
                    circularDeterminateTrackColor = j4;
                }
                if (i8 != 0) {
                    cVar4 = cVar3;
                    j6 = circularColor;
                    f5 = f4;
                    j5 = circularDeterminateTrackColor;
                    i12 = 1;
                } else {
                    cVar4 = cVar3;
                    f5 = f4;
                    j5 = circularDeterminateTrackColor;
                    i12 = i9;
                    j6 = circularColor;
                }
            }
            kk0Var2.s();
            kk0Var = kk0Var2;
            m1881x4c2c3c0b(je1Var2, cVar4, j6, f5, j5, i12, 4.0f, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (i5 & 458752), 0);
            cVar5 = cVar4;
            j7 = j6;
            f6 = f5;
            j8 = j5;
            i13 = i12;
        } else {
            kk0Var2.X();
            if ((i3 & 1) != 0) {
                if (i16 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                i11 = i4 & 4;
                i03Var = i03.a;
                if (i11 != 0) {
                    circularColor = i03Var.getCircularColor(kk0Var2, 6);
                    i5 &= -897;
                } else {
                    circularColor = j3;
                }
                if (i6 != 0) {
                    f4 = 4.0f;
                } else {
                    f4 = f3;
                }
                if ((i4 & 16) != 0) {
                    circularDeterminateTrackColor = i03Var.getCircularDeterminateTrackColor(kk0Var2, 6);
                    i5 &= -57345;
                } else {
                    circularDeterminateTrackColor = j4;
                }
                if (i8 != 0) {
                    cVar4 = cVar3;
                    j6 = circularColor;
                    f5 = f4;
                    j5 = circularDeterminateTrackColor;
                    i12 = 1;
                } else {
                    cVar4 = cVar3;
                    f5 = f4;
                    j5 = circularDeterminateTrackColor;
                    i12 = i9;
                    j6 = circularColor;
                }
            } else {
                if (i16 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                i11 = i4 & 4;
                i03Var = i03.a;
                if (i11 != 0) {
                    circularColor = i03Var.getCircularColor(kk0Var2, 6);
                    i5 &= -897;
                } else {
                    circularColor = j3;
                }
                if (i6 != 0) {
                    f4 = 4.0f;
                } else {
                    f4 = f3;
                }
                if ((i4 & 16) != 0) {
                    circularDeterminateTrackColor = i03Var.getCircularDeterminateTrackColor(kk0Var2, 6);
                    i5 &= -57345;
                } else {
                    circularDeterminateTrackColor = j4;
                }
                if (i8 != 0) {
                    cVar4 = cVar3;
                    j6 = circularColor;
                    f5 = f4;
                    j5 = circularDeterminateTrackColor;
                    i12 = 1;
                } else {
                    cVar4 = cVar3;
                    f5 = f4;
                    j5 = circularDeterminateTrackColor;
                    i12 = i9;
                    j6 = circularColor;
                }
            }
            kk0Var2.s();
            kk0Var = kk0Var2;
            m1881x4c2c3c0b(je1Var2, cVar4, j6, f5, j5, i12, 4.0f, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (i5 & 458752), 0);
            cVar5 = cVar4;
            j7 = j6;
            f6 = f5;
            j8 = j5;
            i13 = i12;
        }
        w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new j03(je1Var, cVar5, j7, f6, j8, i13, i3, i4));
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0121  */
    /* JADX WARN: Code duplicated, block: B:103:0x0127  */
    /* JADX WARN: Code duplicated, block: B:106:0x012c  */
    /* JADX WARN: Code duplicated, block: B:107:0x0133  */
    /* JADX WARN: Code duplicated, block: B:109:0x0136  */
    /* JADX WARN: Code duplicated, block: B:111:0x0139  */
    /* JADX WARN: Code duplicated, block: B:113:0x0141  */
    /* JADX WARN: Code duplicated, block: B:116:0x014c  */
    /* JADX WARN: Code duplicated, block: B:117:0x014e  */
    /* JADX WARN: Code duplicated, block: B:120:0x0155  */
    /* JADX WARN: Code duplicated, block: B:122:0x015b  */
    /* JADX WARN: Code duplicated, block: B:125:0x0196  */
    /* JADX WARN: Code duplicated, block: B:127:0x019c  */
    /* JADX WARN: Code duplicated, block: B:130:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:131:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:134:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:135:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:138:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:139:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:142:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:144:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:150:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:152:0x0201  */
    /* JADX WARN: Code duplicated, block: B:158:0x0212  */
    /* JADX WARN: Code duplicated, block: B:162:0x0220  */
    /* JADX WARN: Code duplicated, block: B:166:0x024b  */
    /* JADX WARN: Code duplicated, block: B:168:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0045  */
    /* JADX WARN: Code duplicated, block: B:31:0x0054  */
    /* JADX WARN: Code duplicated, block: B:33:0x0058  */
    /* JADX WARN: Code duplicated, block: B:36:0x005e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0063  */
    /* JADX WARN: Code duplicated, block: B:40:0x0067  */
    /* JADX WARN: Code duplicated, block: B:42:0x006f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0072  */
    /* JADX WARN: Code duplicated, block: B:47:0x0079  */
    /* JADX WARN: Code duplicated, block: B:49:0x007f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0088  */
    /* JADX WARN: Code duplicated, block: B:54:0x008c  */
    /* JADX WARN: Code duplicated, block: B:57:0x0094  */
    /* JADX WARN: Code duplicated, block: B:59:0x0098  */
    /* JADX WARN: Code duplicated, block: B:61:0x009b  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:71:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:94:0x010d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:95:0x010f  */
    /* JADX WARN: Code duplicated, block: B:96:0x0112  */
    /* JADX WARN: Code duplicated, block: B:99:0x011a  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: CircularProgressIndicator-IyT6zlY, reason: not valid java name */
    public static final void m1881x4c2c3c0b(je1 je1Var, c cVar, long j, float f2, long j2, int i2, float f3, ck0 ck0Var, int i3, int i4) {
        int i5;
        c cVar2;
        int i6;
        float f4;
        int i7;
        long circularDeterminateTrackColor;
        int i8;
        int i9;
        int i10;
        int i11;
        float f5;
        int i12;
        c cVar3;
        int i13;
        i03 i03Var;
        long circularColor;
        float f6;
        int i14;
        long j3;
        boolean z;
        Object objP;
        je1 je1Var2;
        vo3 vo3Var;
        boolean zH;
        Object objP2;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean zJ;
        Object objP3;
        long j4;
        long j5;
        float f7;
        c cVar4;
        int i15;
        float f8;
        float f9;
        long j6;
        long j7;
        w33 w33VarV;
        int i16;
        int i17;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(-1798883595);
        if ((i4 & 1) != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i5 = (kk0Var.j(je1Var) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        int i18 = i4 & 2;
        if (i18 == 0) {
            if ((i3 & 48) == 0) {
                cVar2 = cVar;
                i5 |= kk0Var.h(cVar2) ? 32 : 16;
            }
            if ((i3 & 384) != 0) {
                if ((i4 & 4) == 0 || !kk0Var.g(j)) {
                    i17 = Uuid.SIZE_BITS;
                } else {
                    i17 = FontInfo.NUMBER_OF_CHAR_CODES;
                }
                i5 |= i17;
            }
            i6 = i4 & 8;
            if (i6 != 0) {
                if ((i3 & 3072) == 0) {
                    f4 = f2;
                    if (kk0Var.e(f4)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i5 |= i7;
                }
                if ((i3 & 24576) == 0) {
                    circularDeterminateTrackColor = j2;
                    if ((i4 & 16) == 0 || !kk0Var.g(circularDeterminateTrackColor)) {
                        i16 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                    } else {
                        i16 = 16384;
                    }
                    i5 |= i16;
                } else {
                    circularDeterminateTrackColor = j2;
                }
                i8 = i4 & 32;
                if (i8 != 0) {
                    if ((196608 & i3) == 0) {
                        i9 = i2;
                        if (kk0Var.f(i9)) {
                            i10 = 131072;
                        } else {
                            i10 = 65536;
                        }
                        i5 |= i10;
                    }
                    i11 = i4 & 64;
                    if (i11 != 0) {
                        i5 |= 1572864;
                        f5 = f3;
                    } else {
                        f5 = f3;
                        if ((i3 & 1572864) == 0) {
                            if (kk0Var.e(f5)) {
                                i12 = 1048576;
                            } else {
                                i12 = 524288;
                            }
                            i5 |= i12;
                        }
                    }
                    if ((i5 & 599187) == 599186 || !kk0Var.F()) {
                        kk0Var.X();
                        if ((i3 & 1) != 0 || kk0Var.D()) {
                            if (i18 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            i13 = i4 & 4;
                            i03Var = i03.a;
                            if (i13 != 0) {
                                circularColor = i03Var.getCircularColor(kk0Var, 6);
                                i5 &= -897;
                            } else {
                                circularColor = j;
                            }
                            if (i6 != 0) {
                                f4 = 4.0f;
                            }
                            if ((i4 & 16) != 0) {
                                circularDeterminateTrackColor = i03Var.getCircularDeterminateTrackColor(kk0Var, 6);
                                i5 &= -57345;
                            } else {
                                circularDeterminateTrackColor = circularDeterminateTrackColor;
                            }
                            if (i8 != 0) {
                                i9 = 1;
                            }
                            if (i11 != 0) {
                                f6 = 4.0f;
                            } else {
                                f6 = f5;
                            }
                            i14 = i9;
                            j3 = circularColor;
                        } else {
                            kk0Var.V();
                            if ((i4 & 4) != 0) {
                                i5 &= -897;
                            }
                            if ((i4 & 16) != 0) {
                                i5 &= -57345;
                            }
                            cVar3 = cVar2;
                            f6 = f5;
                            i14 = i9;
                            j3 = j;
                        }
                        kk0Var.s();
                        if ((i5 & 14) == 4) {
                            z = true;
                        } else {
                            z = false;
                        }
                        objP = kk0Var.P();
                        if (z || objP == Composer$Companion.getEmpty()) {
                            objP = new gh1(je1Var, 5);
                            kk0Var.l0(objP);
                        }
                        je1Var2 = (je1) objP;
                        vo3Var = new vo3(i14, ((wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity())).w(f4), 0, 0.0f, 26);
                        zH = kk0Var.h(je1Var2);
                        objP2 = kk0Var.P();
                        if (zH || objP2 == Composer$Companion.getEmpty()) {
                            objP2 = new oy0(je1Var2, 4);
                            kk0Var.l0(objP2);
                        }
                        c cVarJ = d.j(we3.b(cVar3, true, (le1) objP2), d);
                        boolean zH2 = kk0Var.h(je1Var2);
                        if ((i5 & 458752) == 131072) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        boolean z5 = z2 | zH2;
                        if ((3670016 & i5) == 1048576) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        boolean z6 = z5 | z3;
                        if ((i5 & 7168) == 2048) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        zJ = z6 | z4 | ((((57344 & i5) ^ 24576) <= 16384 && kk0Var.g(circularDeterminateTrackColor)) || (i5 & 24576) == 16384) | kk0Var.j(vo3Var) | ((((i5 & 896) ^ 384) <= 256 && kk0Var.g(j3)) || (i5 & 384) == 256);
                        objP3 = kk0Var.P();
                        if (!zJ || objP3 == Composer$Companion.getEmpty()) {
                            j4 = j3;
                            j5 = circularDeterminateTrackColor;
                            f7 = f4;
                            objP3 = new k03(je1Var2, i14, f6, f7, j5, vo3Var, j4);
                            kk0Var.l0(objP3);
                        } else {
                            j4 = j3;
                            j5 = circularDeterminateTrackColor;
                            f7 = f4;
                        }
                        c10.Canvas(cVarJ, (le1) objP3, kk0Var, 0);
                        cVar4 = cVar3;
                        i15 = i14;
                        f8 = f6;
                        f9 = f7;
                        j6 = j5;
                        j7 = j4;
                    } else {
                        kk0Var.V();
                        j7 = j;
                        cVar4 = cVar2;
                        j6 = circularDeterminateTrackColor;
                        f8 = f5;
                        f9 = f4;
                        i15 = i9;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new l03(je1Var, cVar4, j7, f9, j6, i15, f8, i3, i4));
                    }
                }
                i5 |= 196608;
                i9 = i2;
                i11 = i4 & 64;
                if (i11 != 0) {
                    i5 |= 1572864;
                    f5 = f3;
                } else {
                    f5 = f3;
                    if ((i3 & 1572864) == 0) {
                        if (kk0Var.e(f5)) {
                            i12 = 1048576;
                        } else {
                            i12 = 524288;
                        }
                        i5 |= i12;
                    }
                }
                if ((i5 & 599187) == 599186) {
                    kk0Var.X();
                    if ((i3 & 1) != 0) {
                        if (i18 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        i13 = i4 & 4;
                        i03Var = i03.a;
                        if (i13 != 0) {
                            circularColor = i03Var.getCircularColor(kk0Var, 6);
                            i5 &= -897;
                        } else {
                            circularColor = j;
                        }
                        if (i6 != 0) {
                            f4 = 4.0f;
                        }
                        if ((i4 & 16) != 0) {
                            circularDeterminateTrackColor = i03Var.getCircularDeterminateTrackColor(kk0Var, 6);
                            i5 &= -57345;
                        } else {
                            circularDeterminateTrackColor = circularDeterminateTrackColor;
                        }
                        if (i8 != 0) {
                            i9 = 1;
                        }
                        if (i11 != 0) {
                            f6 = 4.0f;
                        } else {
                            f6 = f5;
                        }
                        i14 = i9;
                        j3 = circularColor;
                    } else {
                        if (i18 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        i13 = i4 & 4;
                        i03Var = i03.a;
                        if (i13 != 0) {
                            circularColor = i03Var.getCircularColor(kk0Var, 6);
                            i5 &= -897;
                        } else {
                            circularColor = j;
                        }
                        if (i6 != 0) {
                            f4 = 4.0f;
                        }
                        if ((i4 & 16) != 0) {
                            circularDeterminateTrackColor = i03Var.getCircularDeterminateTrackColor(kk0Var, 6);
                            i5 &= -57345;
                        } else {
                            circularDeterminateTrackColor = circularDeterminateTrackColor;
                        }
                        if (i8 != 0) {
                            i9 = 1;
                        }
                        if (i11 != 0) {
                            f6 = 4.0f;
                        } else {
                            f6 = f5;
                        }
                        i14 = i9;
                        j3 = circularColor;
                    }
                    kk0Var.s();
                    if ((i5 & 14) == 4) {
                        z = true;
                    } else {
                        z = false;
                    }
                    objP = kk0Var.P();
                    if (z) {
                        objP = new gh1(je1Var, 5);
                        kk0Var.l0(objP);
                    } else {
                        objP = new gh1(je1Var, 5);
                        kk0Var.l0(objP);
                    }
                    je1Var2 = (je1) objP;
                    vo3Var = new vo3(i14, ((wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity())).w(f4), 0, 0.0f, 26);
                    zH = kk0Var.h(je1Var2);
                    objP2 = kk0Var.P();
                    if (zH) {
                        objP2 = new oy0(je1Var2, 4);
                        kk0Var.l0(objP2);
                    } else {
                        objP2 = new oy0(je1Var2, 4);
                        kk0Var.l0(objP2);
                    }
                    c cVarJ2 = d.j(we3.b(cVar3, true, (le1) objP2), d);
                    boolean zH3 = kk0Var.h(je1Var2);
                    if ((i5 & 458752) == 131072) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    boolean z7 = z2 | zH3;
                    if ((3670016 & i5) == 1048576) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    boolean z8 = z7 | z3;
                    if ((i5 & 7168) == 2048) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    zJ = z8 | z4 | ((((57344 & i5) ^ 24576) <= 16384 && kk0Var.g(circularDeterminateTrackColor)) || (i5 & 24576) == 16384) | kk0Var.j(vo3Var) | ((((i5 & 896) ^ 384) <= 256 && kk0Var.g(j3)) || (i5 & 384) == 256);
                    objP3 = kk0Var.P();
                    if (zJ) {
                        j4 = j3;
                        j5 = circularDeterminateTrackColor;
                        f7 = f4;
                        objP3 = new k03(je1Var2, i14, f6, f7, j5, vo3Var, j4);
                        kk0Var.l0(objP3);
                    } else {
                        j4 = j3;
                        j5 = circularDeterminateTrackColor;
                        f7 = f4;
                        objP3 = new k03(je1Var2, i14, f6, f7, j5, vo3Var, j4);
                        kk0Var.l0(objP3);
                    }
                    c10.Canvas(cVarJ2, (le1) objP3, kk0Var, 0);
                    cVar4 = cVar3;
                    i15 = i14;
                    f8 = f6;
                    f9 = f7;
                    j6 = j5;
                    j7 = j4;
                } else {
                    kk0Var.X();
                    if ((i3 & 1) != 0) {
                        if (i18 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        i13 = i4 & 4;
                        i03Var = i03.a;
                        if (i13 != 0) {
                            circularColor = i03Var.getCircularColor(kk0Var, 6);
                            i5 &= -897;
                        } else {
                            circularColor = j;
                        }
                        if (i6 != 0) {
                            f4 = 4.0f;
                        }
                        if ((i4 & 16) != 0) {
                            circularDeterminateTrackColor = i03Var.getCircularDeterminateTrackColor(kk0Var, 6);
                            i5 &= -57345;
                        } else {
                            circularDeterminateTrackColor = circularDeterminateTrackColor;
                        }
                        if (i8 != 0) {
                            i9 = 1;
                        }
                        if (i11 != 0) {
                            f6 = 4.0f;
                        } else {
                            f6 = f5;
                        }
                        i14 = i9;
                        j3 = circularColor;
                    } else {
                        if (i18 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        i13 = i4 & 4;
                        i03Var = i03.a;
                        if (i13 != 0) {
                            circularColor = i03Var.getCircularColor(kk0Var, 6);
                            i5 &= -897;
                        } else {
                            circularColor = j;
                        }
                        if (i6 != 0) {
                            f4 = 4.0f;
                        }
                        if ((i4 & 16) != 0) {
                            circularDeterminateTrackColor = i03Var.getCircularDeterminateTrackColor(kk0Var, 6);
                            i5 &= -57345;
                        } else {
                            circularDeterminateTrackColor = circularDeterminateTrackColor;
                        }
                        if (i8 != 0) {
                            i9 = 1;
                        }
                        if (i11 != 0) {
                            f6 = 4.0f;
                        } else {
                            f6 = f5;
                        }
                        i14 = i9;
                        j3 = circularColor;
                    }
                    kk0Var.s();
                    if ((i5 & 14) == 4) {
                        z = true;
                    } else {
                        z = false;
                    }
                    objP = kk0Var.P();
                    if (z) {
                        objP = new gh1(je1Var, 5);
                        kk0Var.l0(objP);
                    } else {
                        objP = new gh1(je1Var, 5);
                        kk0Var.l0(objP);
                    }
                    je1Var2 = (je1) objP;
                    vo3Var = new vo3(i14, ((wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity())).w(f4), 0, 0.0f, 26);
                    zH = kk0Var.h(je1Var2);
                    objP2 = kk0Var.P();
                    if (zH) {
                        objP2 = new oy0(je1Var2, 4);
                        kk0Var.l0(objP2);
                    } else {
                        objP2 = new oy0(je1Var2, 4);
                        kk0Var.l0(objP2);
                    }
                    c cVarJ3 = d.j(we3.b(cVar3, true, (le1) objP2), d);
                    boolean zH4 = kk0Var.h(je1Var2);
                    if ((i5 & 458752) == 131072) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    boolean z9 = z2 | zH4;
                    if ((3670016 & i5) == 1048576) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    boolean z10 = z9 | z3;
                    if ((i5 & 7168) == 2048) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    zJ = z10 | z4 | ((((57344 & i5) ^ 24576) <= 16384 && kk0Var.g(circularDeterminateTrackColor)) || (i5 & 24576) == 16384) | kk0Var.j(vo3Var) | ((((i5 & 896) ^ 384) <= 256 && kk0Var.g(j3)) || (i5 & 384) == 256);
                    objP3 = kk0Var.P();
                    if (zJ) {
                        j4 = j3;
                        j5 = circularDeterminateTrackColor;
                        f7 = f4;
                        objP3 = new k03(je1Var2, i14, f6, f7, j5, vo3Var, j4);
                        kk0Var.l0(objP3);
                    } else {
                        j4 = j3;
                        j5 = circularDeterminateTrackColor;
                        f7 = f4;
                        objP3 = new k03(je1Var2, i14, f6, f7, j5, vo3Var, j4);
                        kk0Var.l0(objP3);
                    }
                    c10.Canvas(cVarJ3, (le1) objP3, kk0Var, 0);
                    cVar4 = cVar3;
                    i15 = i14;
                    f8 = f6;
                    f9 = f7;
                    j6 = j5;
                    j7 = j4;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new l03(je1Var, cVar4, j7, f9, j6, i15, f8, i3, i4));
                }
            }
            i5 |= 3072;
            f4 = f2;
            if ((i3 & 24576) == 0) {
                circularDeterminateTrackColor = j2;
                if ((i4 & 16) == 0) {
                    i16 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                } else {
                    i16 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                }
                i5 |= i16;
            } else {
                circularDeterminateTrackColor = j2;
            }
            i8 = i4 & 32;
            if (i8 != 0) {
                if ((196608 & i3) == 0) {
                    i9 = i2;
                    if (kk0Var.f(i9)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                    i5 |= i10;
                }
                i11 = i4 & 64;
                if (i11 != 0) {
                    i5 |= 1572864;
                    f5 = f3;
                } else {
                    f5 = f3;
                    if ((i3 & 1572864) == 0) {
                        if (kk0Var.e(f5)) {
                            i12 = 1048576;
                        } else {
                            i12 = 524288;
                        }
                        i5 |= i12;
                    }
                }
                if ((i5 & 599187) == 599186) {
                    kk0Var.X();
                    if ((i3 & 1) != 0) {
                        if (i18 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        i13 = i4 & 4;
                        i03Var = i03.a;
                        if (i13 != 0) {
                            circularColor = i03Var.getCircularColor(kk0Var, 6);
                            i5 &= -897;
                        } else {
                            circularColor = j;
                        }
                        if (i6 != 0) {
                            f4 = 4.0f;
                        }
                        if ((i4 & 16) != 0) {
                            circularDeterminateTrackColor = i03Var.getCircularDeterminateTrackColor(kk0Var, 6);
                            i5 &= -57345;
                        } else {
                            circularDeterminateTrackColor = circularDeterminateTrackColor;
                        }
                        if (i8 != 0) {
                            i9 = 1;
                        }
                        if (i11 != 0) {
                            f6 = 4.0f;
                        } else {
                            f6 = f5;
                        }
                        i14 = i9;
                        j3 = circularColor;
                    } else {
                        if (i18 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        i13 = i4 & 4;
                        i03Var = i03.a;
                        if (i13 != 0) {
                            circularColor = i03Var.getCircularColor(kk0Var, 6);
                            i5 &= -897;
                        } else {
                            circularColor = j;
                        }
                        if (i6 != 0) {
                            f4 = 4.0f;
                        }
                        if ((i4 & 16) != 0) {
                            circularDeterminateTrackColor = i03Var.getCircularDeterminateTrackColor(kk0Var, 6);
                            i5 &= -57345;
                        } else {
                            circularDeterminateTrackColor = circularDeterminateTrackColor;
                        }
                        if (i8 != 0) {
                            i9 = 1;
                        }
                        if (i11 != 0) {
                            f6 = 4.0f;
                        } else {
                            f6 = f5;
                        }
                        i14 = i9;
                        j3 = circularColor;
                    }
                    kk0Var.s();
                    if ((i5 & 14) == 4) {
                        z = true;
                    } else {
                        z = false;
                    }
                    objP = kk0Var.P();
                    if (z) {
                        objP = new gh1(je1Var, 5);
                        kk0Var.l0(objP);
                    } else {
                        objP = new gh1(je1Var, 5);
                        kk0Var.l0(objP);
                    }
                    je1Var2 = (je1) objP;
                    vo3Var = new vo3(i14, ((wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity())).w(f4), 0, 0.0f, 26);
                    zH = kk0Var.h(je1Var2);
                    objP2 = kk0Var.P();
                    if (zH) {
                        objP2 = new oy0(je1Var2, 4);
                        kk0Var.l0(objP2);
                    } else {
                        objP2 = new oy0(je1Var2, 4);
                        kk0Var.l0(objP2);
                    }
                    c cVarJ4 = d.j(we3.b(cVar3, true, (le1) objP2), d);
                    boolean zH5 = kk0Var.h(je1Var2);
                    if ((i5 & 458752) == 131072) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    boolean z11 = z2 | zH5;
                    if ((3670016 & i5) == 1048576) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    boolean z12 = z11 | z3;
                    if ((i5 & 7168) == 2048) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    zJ = z12 | z4 | ((((57344 & i5) ^ 24576) <= 16384 && kk0Var.g(circularDeterminateTrackColor)) || (i5 & 24576) == 16384) | kk0Var.j(vo3Var) | ((((i5 & 896) ^ 384) <= 256 && kk0Var.g(j3)) || (i5 & 384) == 256);
                    objP3 = kk0Var.P();
                    if (zJ) {
                        j4 = j3;
                        j5 = circularDeterminateTrackColor;
                        f7 = f4;
                        objP3 = new k03(je1Var2, i14, f6, f7, j5, vo3Var, j4);
                        kk0Var.l0(objP3);
                    } else {
                        j4 = j3;
                        j5 = circularDeterminateTrackColor;
                        f7 = f4;
                        objP3 = new k03(je1Var2, i14, f6, f7, j5, vo3Var, j4);
                        kk0Var.l0(objP3);
                    }
                    c10.Canvas(cVarJ4, (le1) objP3, kk0Var, 0);
                    cVar4 = cVar3;
                    i15 = i14;
                    f8 = f6;
                    f9 = f7;
                    j6 = j5;
                    j7 = j4;
                } else {
                    kk0Var.X();
                    if ((i3 & 1) != 0) {
                        if (i18 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        i13 = i4 & 4;
                        i03Var = i03.a;
                        if (i13 != 0) {
                            circularColor = i03Var.getCircularColor(kk0Var, 6);
                            i5 &= -897;
                        } else {
                            circularColor = j;
                        }
                        if (i6 != 0) {
                            f4 = 4.0f;
                        }
                        if ((i4 & 16) != 0) {
                            circularDeterminateTrackColor = i03Var.getCircularDeterminateTrackColor(kk0Var, 6);
                            i5 &= -57345;
                        } else {
                            circularDeterminateTrackColor = circularDeterminateTrackColor;
                        }
                        if (i8 != 0) {
                            i9 = 1;
                        }
                        if (i11 != 0) {
                            f6 = 4.0f;
                        } else {
                            f6 = f5;
                        }
                        i14 = i9;
                        j3 = circularColor;
                    } else {
                        if (i18 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        i13 = i4 & 4;
                        i03Var = i03.a;
                        if (i13 != 0) {
                            circularColor = i03Var.getCircularColor(kk0Var, 6);
                            i5 &= -897;
                        } else {
                            circularColor = j;
                        }
                        if (i6 != 0) {
                            f4 = 4.0f;
                        }
                        if ((i4 & 16) != 0) {
                            circularDeterminateTrackColor = i03Var.getCircularDeterminateTrackColor(kk0Var, 6);
                            i5 &= -57345;
                        } else {
                            circularDeterminateTrackColor = circularDeterminateTrackColor;
                        }
                        if (i8 != 0) {
                            i9 = 1;
                        }
                        if (i11 != 0) {
                            f6 = 4.0f;
                        } else {
                            f6 = f5;
                        }
                        i14 = i9;
                        j3 = circularColor;
                    }
                    kk0Var.s();
                    if ((i5 & 14) == 4) {
                        z = true;
                    } else {
                        z = false;
                    }
                    objP = kk0Var.P();
                    if (z) {
                        objP = new gh1(je1Var, 5);
                        kk0Var.l0(objP);
                    } else {
                        objP = new gh1(je1Var, 5);
                        kk0Var.l0(objP);
                    }
                    je1Var2 = (je1) objP;
                    vo3Var = new vo3(i14, ((wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity())).w(f4), 0, 0.0f, 26);
                    zH = kk0Var.h(je1Var2);
                    objP2 = kk0Var.P();
                    if (zH) {
                        objP2 = new oy0(je1Var2, 4);
                        kk0Var.l0(objP2);
                    } else {
                        objP2 = new oy0(je1Var2, 4);
                        kk0Var.l0(objP2);
                    }
                    c cVarJ5 = d.j(we3.b(cVar3, true, (le1) objP2), d);
                    boolean zH6 = kk0Var.h(je1Var2);
                    if ((i5 & 458752) == 131072) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    boolean z13 = z2 | zH6;
                    if ((3670016 & i5) == 1048576) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    boolean z14 = z13 | z3;
                    if ((i5 & 7168) == 2048) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    zJ = z14 | z4 | ((((57344 & i5) ^ 24576) <= 16384 && kk0Var.g(circularDeterminateTrackColor)) || (i5 & 24576) == 16384) | kk0Var.j(vo3Var) | ((((i5 & 896) ^ 384) <= 256 && kk0Var.g(j3)) || (i5 & 384) == 256);
                    objP3 = kk0Var.P();
                    if (zJ) {
                        j4 = j3;
                        j5 = circularDeterminateTrackColor;
                        f7 = f4;
                        objP3 = new k03(je1Var2, i14, f6, f7, j5, vo3Var, j4);
                        kk0Var.l0(objP3);
                    } else {
                        j4 = j3;
                        j5 = circularDeterminateTrackColor;
                        f7 = f4;
                        objP3 = new k03(je1Var2, i14, f6, f7, j5, vo3Var, j4);
                        kk0Var.l0(objP3);
                    }
                    c10.Canvas(cVarJ5, (le1) objP3, kk0Var, 0);
                    cVar4 = cVar3;
                    i15 = i14;
                    f8 = f6;
                    f9 = f7;
                    j6 = j5;
                    j7 = j4;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new l03(je1Var, cVar4, j7, f9, j6, i15, f8, i3, i4));
                }
            }
            i5 |= 196608;
            i9 = i2;
            i11 = i4 & 64;
            if (i11 != 0) {
                i5 |= 1572864;
                f5 = f3;
            } else {
                f5 = f3;
                if ((i3 & 1572864) == 0) {
                    if (kk0Var.e(f5)) {
                        i12 = 1048576;
                    } else {
                        i12 = 524288;
                    }
                    i5 |= i12;
                }
            }
            if ((i5 & 599187) == 599186) {
                kk0Var.X();
                if ((i3 & 1) != 0) {
                    if (i18 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    i13 = i4 & 4;
                    i03Var = i03.a;
                    if (i13 != 0) {
                        circularColor = i03Var.getCircularColor(kk0Var, 6);
                        i5 &= -897;
                    } else {
                        circularColor = j;
                    }
                    if (i6 != 0) {
                        f4 = 4.0f;
                    }
                    if ((i4 & 16) != 0) {
                        circularDeterminateTrackColor = i03Var.getCircularDeterminateTrackColor(kk0Var, 6);
                        i5 &= -57345;
                    } else {
                        circularDeterminateTrackColor = circularDeterminateTrackColor;
                    }
                    if (i8 != 0) {
                        i9 = 1;
                    }
                    if (i11 != 0) {
                        f6 = 4.0f;
                    } else {
                        f6 = f5;
                    }
                    i14 = i9;
                    j3 = circularColor;
                } else {
                    if (i18 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    i13 = i4 & 4;
                    i03Var = i03.a;
                    if (i13 != 0) {
                        circularColor = i03Var.getCircularColor(kk0Var, 6);
                        i5 &= -897;
                    } else {
                        circularColor = j;
                    }
                    if (i6 != 0) {
                        f4 = 4.0f;
                    }
                    if ((i4 & 16) != 0) {
                        circularDeterminateTrackColor = i03Var.getCircularDeterminateTrackColor(kk0Var, 6);
                        i5 &= -57345;
                    } else {
                        circularDeterminateTrackColor = circularDeterminateTrackColor;
                    }
                    if (i8 != 0) {
                        i9 = 1;
                    }
                    if (i11 != 0) {
                        f6 = 4.0f;
                    } else {
                        f6 = f5;
                    }
                    i14 = i9;
                    j3 = circularColor;
                }
                kk0Var.s();
                if ((i5 & 14) == 4) {
                    z = true;
                } else {
                    z = false;
                }
                objP = kk0Var.P();
                if (z) {
                    objP = new gh1(je1Var, 5);
                    kk0Var.l0(objP);
                } else {
                    objP = new gh1(je1Var, 5);
                    kk0Var.l0(objP);
                }
                je1Var2 = (je1) objP;
                vo3Var = new vo3(i14, ((wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity())).w(f4), 0, 0.0f, 26);
                zH = kk0Var.h(je1Var2);
                objP2 = kk0Var.P();
                if (zH) {
                    objP2 = new oy0(je1Var2, 4);
                    kk0Var.l0(objP2);
                } else {
                    objP2 = new oy0(je1Var2, 4);
                    kk0Var.l0(objP2);
                }
                c cVarJ6 = d.j(we3.b(cVar3, true, (le1) objP2), d);
                boolean zH7 = kk0Var.h(je1Var2);
                if ((i5 & 458752) == 131072) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean z15 = z2 | zH7;
                if ((3670016 & i5) == 1048576) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                boolean z16 = z15 | z3;
                if ((i5 & 7168) == 2048) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                zJ = z16 | z4 | ((((57344 & i5) ^ 24576) <= 16384 && kk0Var.g(circularDeterminateTrackColor)) || (i5 & 24576) == 16384) | kk0Var.j(vo3Var) | ((((i5 & 896) ^ 384) <= 256 && kk0Var.g(j3)) || (i5 & 384) == 256);
                objP3 = kk0Var.P();
                if (zJ) {
                    j4 = j3;
                    j5 = circularDeterminateTrackColor;
                    f7 = f4;
                    objP3 = new k03(je1Var2, i14, f6, f7, j5, vo3Var, j4);
                    kk0Var.l0(objP3);
                } else {
                    j4 = j3;
                    j5 = circularDeterminateTrackColor;
                    f7 = f4;
                    objP3 = new k03(je1Var2, i14, f6, f7, j5, vo3Var, j4);
                    kk0Var.l0(objP3);
                }
                c10.Canvas(cVarJ6, (le1) objP3, kk0Var, 0);
                cVar4 = cVar3;
                i15 = i14;
                f8 = f6;
                f9 = f7;
                j6 = j5;
                j7 = j4;
            } else {
                kk0Var.X();
                if ((i3 & 1) != 0) {
                    if (i18 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    i13 = i4 & 4;
                    i03Var = i03.a;
                    if (i13 != 0) {
                        circularColor = i03Var.getCircularColor(kk0Var, 6);
                        i5 &= -897;
                    } else {
                        circularColor = j;
                    }
                    if (i6 != 0) {
                        f4 = 4.0f;
                    }
                    if ((i4 & 16) != 0) {
                        circularDeterminateTrackColor = i03Var.getCircularDeterminateTrackColor(kk0Var, 6);
                        i5 &= -57345;
                    } else {
                        circularDeterminateTrackColor = circularDeterminateTrackColor;
                    }
                    if (i8 != 0) {
                        i9 = 1;
                    }
                    if (i11 != 0) {
                        f6 = 4.0f;
                    } else {
                        f6 = f5;
                    }
                    i14 = i9;
                    j3 = circularColor;
                } else {
                    if (i18 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    i13 = i4 & 4;
                    i03Var = i03.a;
                    if (i13 != 0) {
                        circularColor = i03Var.getCircularColor(kk0Var, 6);
                        i5 &= -897;
                    } else {
                        circularColor = j;
                    }
                    if (i6 != 0) {
                        f4 = 4.0f;
                    }
                    if ((i4 & 16) != 0) {
                        circularDeterminateTrackColor = i03Var.getCircularDeterminateTrackColor(kk0Var, 6);
                        i5 &= -57345;
                    } else {
                        circularDeterminateTrackColor = circularDeterminateTrackColor;
                    }
                    if (i8 != 0) {
                        i9 = 1;
                    }
                    if (i11 != 0) {
                        f6 = 4.0f;
                    } else {
                        f6 = f5;
                    }
                    i14 = i9;
                    j3 = circularColor;
                }
                kk0Var.s();
                if ((i5 & 14) == 4) {
                    z = true;
                } else {
                    z = false;
                }
                objP = kk0Var.P();
                if (z) {
                    objP = new gh1(je1Var, 5);
                    kk0Var.l0(objP);
                } else {
                    objP = new gh1(je1Var, 5);
                    kk0Var.l0(objP);
                }
                je1Var2 = (je1) objP;
                vo3Var = new vo3(i14, ((wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity())).w(f4), 0, 0.0f, 26);
                zH = kk0Var.h(je1Var2);
                objP2 = kk0Var.P();
                if (zH) {
                    objP2 = new oy0(je1Var2, 4);
                    kk0Var.l0(objP2);
                } else {
                    objP2 = new oy0(je1Var2, 4);
                    kk0Var.l0(objP2);
                }
                c cVarJ7 = d.j(we3.b(cVar3, true, (le1) objP2), d);
                boolean zH8 = kk0Var.h(je1Var2);
                if ((i5 & 458752) == 131072) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean z17 = z2 | zH8;
                if ((3670016 & i5) == 1048576) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                boolean z18 = z17 | z3;
                if ((i5 & 7168) == 2048) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                zJ = z18 | z4 | ((((57344 & i5) ^ 24576) <= 16384 && kk0Var.g(circularDeterminateTrackColor)) || (i5 & 24576) == 16384) | kk0Var.j(vo3Var) | ((((i5 & 896) ^ 384) <= 256 && kk0Var.g(j3)) || (i5 & 384) == 256);
                objP3 = kk0Var.P();
                if (zJ) {
                    j4 = j3;
                    j5 = circularDeterminateTrackColor;
                    f7 = f4;
                    objP3 = new k03(je1Var2, i14, f6, f7, j5, vo3Var, j4);
                    kk0Var.l0(objP3);
                } else {
                    j4 = j3;
                    j5 = circularDeterminateTrackColor;
                    f7 = f4;
                    objP3 = new k03(je1Var2, i14, f6, f7, j5, vo3Var, j4);
                    kk0Var.l0(objP3);
                }
                c10.Canvas(cVarJ7, (le1) objP3, kk0Var, 0);
                cVar4 = cVar3;
                i15 = i14;
                f8 = f6;
                f9 = f7;
                j6 = j5;
                j7 = j4;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new l03(je1Var, cVar4, j7, f9, j6, i15, f8, i3, i4));
            }
        }
        i5 |= 48;
        cVar2 = cVar;
        if ((i3 & 384) != 0) {
            if ((i4 & 4) == 0) {
                i17 = Uuid.SIZE_BITS;
            } else {
                i17 = Uuid.SIZE_BITS;
            }
            i5 |= i17;
        }
        i6 = i4 & 8;
        if (i6 != 0) {
            if ((i3 & 3072) == 0) {
                f4 = f2;
                if (kk0Var.e(f4)) {
                    i7 = 2048;
                } else {
                    i7 = 1024;
                }
                i5 |= i7;
            }
            if ((i3 & 24576) == 0) {
                circularDeterminateTrackColor = j2;
                if ((i4 & 16) == 0) {
                    i16 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                } else {
                    i16 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                }
                i5 |= i16;
            } else {
                circularDeterminateTrackColor = j2;
            }
            i8 = i4 & 32;
            if (i8 != 0) {
                if ((196608 & i3) == 0) {
                    i9 = i2;
                    if (kk0Var.f(i9)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                    i5 |= i10;
                }
                i11 = i4 & 64;
                if (i11 != 0) {
                    i5 |= 1572864;
                    f5 = f3;
                } else {
                    f5 = f3;
                    if ((i3 & 1572864) == 0) {
                        if (kk0Var.e(f5)) {
                            i12 = 1048576;
                        } else {
                            i12 = 524288;
                        }
                        i5 |= i12;
                    }
                }
                if ((i5 & 599187) == 599186) {
                    kk0Var.X();
                    if ((i3 & 1) != 0) {
                        if (i18 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        i13 = i4 & 4;
                        i03Var = i03.a;
                        if (i13 != 0) {
                            circularColor = i03Var.getCircularColor(kk0Var, 6);
                            i5 &= -897;
                        } else {
                            circularColor = j;
                        }
                        if (i6 != 0) {
                            f4 = 4.0f;
                        }
                        if ((i4 & 16) != 0) {
                            circularDeterminateTrackColor = i03Var.getCircularDeterminateTrackColor(kk0Var, 6);
                            i5 &= -57345;
                        } else {
                            circularDeterminateTrackColor = circularDeterminateTrackColor;
                        }
                        if (i8 != 0) {
                            i9 = 1;
                        }
                        if (i11 != 0) {
                            f6 = 4.0f;
                        } else {
                            f6 = f5;
                        }
                        i14 = i9;
                        j3 = circularColor;
                    } else {
                        if (i18 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        i13 = i4 & 4;
                        i03Var = i03.a;
                        if (i13 != 0) {
                            circularColor = i03Var.getCircularColor(kk0Var, 6);
                            i5 &= -897;
                        } else {
                            circularColor = j;
                        }
                        if (i6 != 0) {
                            f4 = 4.0f;
                        }
                        if ((i4 & 16) != 0) {
                            circularDeterminateTrackColor = i03Var.getCircularDeterminateTrackColor(kk0Var, 6);
                            i5 &= -57345;
                        } else {
                            circularDeterminateTrackColor = circularDeterminateTrackColor;
                        }
                        if (i8 != 0) {
                            i9 = 1;
                        }
                        if (i11 != 0) {
                            f6 = 4.0f;
                        } else {
                            f6 = f5;
                        }
                        i14 = i9;
                        j3 = circularColor;
                    }
                    kk0Var.s();
                    if ((i5 & 14) == 4) {
                        z = true;
                    } else {
                        z = false;
                    }
                    objP = kk0Var.P();
                    if (z) {
                        objP = new gh1(je1Var, 5);
                        kk0Var.l0(objP);
                    } else {
                        objP = new gh1(je1Var, 5);
                        kk0Var.l0(objP);
                    }
                    je1Var2 = (je1) objP;
                    vo3Var = new vo3(i14, ((wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity())).w(f4), 0, 0.0f, 26);
                    zH = kk0Var.h(je1Var2);
                    objP2 = kk0Var.P();
                    if (zH) {
                        objP2 = new oy0(je1Var2, 4);
                        kk0Var.l0(objP2);
                    } else {
                        objP2 = new oy0(je1Var2, 4);
                        kk0Var.l0(objP2);
                    }
                    c cVarJ8 = d.j(we3.b(cVar3, true, (le1) objP2), d);
                    boolean zH9 = kk0Var.h(je1Var2);
                    if ((i5 & 458752) == 131072) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    boolean z19 = z2 | zH9;
                    if ((3670016 & i5) == 1048576) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    boolean z110 = z19 | z3;
                    if ((i5 & 7168) == 2048) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    zJ = z110 | z4 | ((((57344 & i5) ^ 24576) <= 16384 && kk0Var.g(circularDeterminateTrackColor)) || (i5 & 24576) == 16384) | kk0Var.j(vo3Var) | ((((i5 & 896) ^ 384) <= 256 && kk0Var.g(j3)) || (i5 & 384) == 256);
                    objP3 = kk0Var.P();
                    if (zJ) {
                        j4 = j3;
                        j5 = circularDeterminateTrackColor;
                        f7 = f4;
                        objP3 = new k03(je1Var2, i14, f6, f7, j5, vo3Var, j4);
                        kk0Var.l0(objP3);
                    } else {
                        j4 = j3;
                        j5 = circularDeterminateTrackColor;
                        f7 = f4;
                        objP3 = new k03(je1Var2, i14, f6, f7, j5, vo3Var, j4);
                        kk0Var.l0(objP3);
                    }
                    c10.Canvas(cVarJ8, (le1) objP3, kk0Var, 0);
                    cVar4 = cVar3;
                    i15 = i14;
                    f8 = f6;
                    f9 = f7;
                    j6 = j5;
                    j7 = j4;
                } else {
                    kk0Var.X();
                    if ((i3 & 1) != 0) {
                        if (i18 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        i13 = i4 & 4;
                        i03Var = i03.a;
                        if (i13 != 0) {
                            circularColor = i03Var.getCircularColor(kk0Var, 6);
                            i5 &= -897;
                        } else {
                            circularColor = j;
                        }
                        if (i6 != 0) {
                            f4 = 4.0f;
                        }
                        if ((i4 & 16) != 0) {
                            circularDeterminateTrackColor = i03Var.getCircularDeterminateTrackColor(kk0Var, 6);
                            i5 &= -57345;
                        } else {
                            circularDeterminateTrackColor = circularDeterminateTrackColor;
                        }
                        if (i8 != 0) {
                            i9 = 1;
                        }
                        if (i11 != 0) {
                            f6 = 4.0f;
                        } else {
                            f6 = f5;
                        }
                        i14 = i9;
                        j3 = circularColor;
                    } else {
                        if (i18 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        i13 = i4 & 4;
                        i03Var = i03.a;
                        if (i13 != 0) {
                            circularColor = i03Var.getCircularColor(kk0Var, 6);
                            i5 &= -897;
                        } else {
                            circularColor = j;
                        }
                        if (i6 != 0) {
                            f4 = 4.0f;
                        }
                        if ((i4 & 16) != 0) {
                            circularDeterminateTrackColor = i03Var.getCircularDeterminateTrackColor(kk0Var, 6);
                            i5 &= -57345;
                        } else {
                            circularDeterminateTrackColor = circularDeterminateTrackColor;
                        }
                        if (i8 != 0) {
                            i9 = 1;
                        }
                        if (i11 != 0) {
                            f6 = 4.0f;
                        } else {
                            f6 = f5;
                        }
                        i14 = i9;
                        j3 = circularColor;
                    }
                    kk0Var.s();
                    if ((i5 & 14) == 4) {
                        z = true;
                    } else {
                        z = false;
                    }
                    objP = kk0Var.P();
                    if (z) {
                        objP = new gh1(je1Var, 5);
                        kk0Var.l0(objP);
                    } else {
                        objP = new gh1(je1Var, 5);
                        kk0Var.l0(objP);
                    }
                    je1Var2 = (je1) objP;
                    vo3Var = new vo3(i14, ((wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity())).w(f4), 0, 0.0f, 26);
                    zH = kk0Var.h(je1Var2);
                    objP2 = kk0Var.P();
                    if (zH) {
                        objP2 = new oy0(je1Var2, 4);
                        kk0Var.l0(objP2);
                    } else {
                        objP2 = new oy0(je1Var2, 4);
                        kk0Var.l0(objP2);
                    }
                    c cVarJ9 = d.j(we3.b(cVar3, true, (le1) objP2), d);
                    boolean zH10 = kk0Var.h(je1Var2);
                    if ((i5 & 458752) == 131072) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    boolean z111 = z2 | zH10;
                    if ((3670016 & i5) == 1048576) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    boolean z112 = z111 | z3;
                    if ((i5 & 7168) == 2048) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    zJ = z112 | z4 | ((((57344 & i5) ^ 24576) <= 16384 && kk0Var.g(circularDeterminateTrackColor)) || (i5 & 24576) == 16384) | kk0Var.j(vo3Var) | ((((i5 & 896) ^ 384) <= 256 && kk0Var.g(j3)) || (i5 & 384) == 256);
                    objP3 = kk0Var.P();
                    if (zJ) {
                        j4 = j3;
                        j5 = circularDeterminateTrackColor;
                        f7 = f4;
                        objP3 = new k03(je1Var2, i14, f6, f7, j5, vo3Var, j4);
                        kk0Var.l0(objP3);
                    } else {
                        j4 = j3;
                        j5 = circularDeterminateTrackColor;
                        f7 = f4;
                        objP3 = new k03(je1Var2, i14, f6, f7, j5, vo3Var, j4);
                        kk0Var.l0(objP3);
                    }
                    c10.Canvas(cVarJ9, (le1) objP3, kk0Var, 0);
                    cVar4 = cVar3;
                    i15 = i14;
                    f8 = f6;
                    f9 = f7;
                    j6 = j5;
                    j7 = j4;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new l03(je1Var, cVar4, j7, f9, j6, i15, f8, i3, i4));
                }
            }
            i5 |= 196608;
            i9 = i2;
            i11 = i4 & 64;
            if (i11 != 0) {
                i5 |= 1572864;
                f5 = f3;
            } else {
                f5 = f3;
                if ((i3 & 1572864) == 0) {
                    if (kk0Var.e(f5)) {
                        i12 = 1048576;
                    } else {
                        i12 = 524288;
                    }
                    i5 |= i12;
                }
            }
            if ((i5 & 599187) == 599186) {
                kk0Var.X();
                if ((i3 & 1) != 0) {
                    if (i18 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    i13 = i4 & 4;
                    i03Var = i03.a;
                    if (i13 != 0) {
                        circularColor = i03Var.getCircularColor(kk0Var, 6);
                        i5 &= -897;
                    } else {
                        circularColor = j;
                    }
                    if (i6 != 0) {
                        f4 = 4.0f;
                    }
                    if ((i4 & 16) != 0) {
                        circularDeterminateTrackColor = i03Var.getCircularDeterminateTrackColor(kk0Var, 6);
                        i5 &= -57345;
                    } else {
                        circularDeterminateTrackColor = circularDeterminateTrackColor;
                    }
                    if (i8 != 0) {
                        i9 = 1;
                    }
                    if (i11 != 0) {
                        f6 = 4.0f;
                    } else {
                        f6 = f5;
                    }
                    i14 = i9;
                    j3 = circularColor;
                } else {
                    if (i18 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    i13 = i4 & 4;
                    i03Var = i03.a;
                    if (i13 != 0) {
                        circularColor = i03Var.getCircularColor(kk0Var, 6);
                        i5 &= -897;
                    } else {
                        circularColor = j;
                    }
                    if (i6 != 0) {
                        f4 = 4.0f;
                    }
                    if ((i4 & 16) != 0) {
                        circularDeterminateTrackColor = i03Var.getCircularDeterminateTrackColor(kk0Var, 6);
                        i5 &= -57345;
                    } else {
                        circularDeterminateTrackColor = circularDeterminateTrackColor;
                    }
                    if (i8 != 0) {
                        i9 = 1;
                    }
                    if (i11 != 0) {
                        f6 = 4.0f;
                    } else {
                        f6 = f5;
                    }
                    i14 = i9;
                    j3 = circularColor;
                }
                kk0Var.s();
                if ((i5 & 14) == 4) {
                    z = true;
                } else {
                    z = false;
                }
                objP = kk0Var.P();
                if (z) {
                    objP = new gh1(je1Var, 5);
                    kk0Var.l0(objP);
                } else {
                    objP = new gh1(je1Var, 5);
                    kk0Var.l0(objP);
                }
                je1Var2 = (je1) objP;
                vo3Var = new vo3(i14, ((wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity())).w(f4), 0, 0.0f, 26);
                zH = kk0Var.h(je1Var2);
                objP2 = kk0Var.P();
                if (zH) {
                    objP2 = new oy0(je1Var2, 4);
                    kk0Var.l0(objP2);
                } else {
                    objP2 = new oy0(je1Var2, 4);
                    kk0Var.l0(objP2);
                }
                c cVarJ10 = d.j(we3.b(cVar3, true, (le1) objP2), d);
                boolean zH11 = kk0Var.h(je1Var2);
                if ((i5 & 458752) == 131072) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean z113 = z2 | zH11;
                if ((3670016 & i5) == 1048576) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                boolean z114 = z113 | z3;
                if ((i5 & 7168) == 2048) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                zJ = z114 | z4 | ((((57344 & i5) ^ 24576) <= 16384 && kk0Var.g(circularDeterminateTrackColor)) || (i5 & 24576) == 16384) | kk0Var.j(vo3Var) | ((((i5 & 896) ^ 384) <= 256 && kk0Var.g(j3)) || (i5 & 384) == 256);
                objP3 = kk0Var.P();
                if (zJ) {
                    j4 = j3;
                    j5 = circularDeterminateTrackColor;
                    f7 = f4;
                    objP3 = new k03(je1Var2, i14, f6, f7, j5, vo3Var, j4);
                    kk0Var.l0(objP3);
                } else {
                    j4 = j3;
                    j5 = circularDeterminateTrackColor;
                    f7 = f4;
                    objP3 = new k03(je1Var2, i14, f6, f7, j5, vo3Var, j4);
                    kk0Var.l0(objP3);
                }
                c10.Canvas(cVarJ10, (le1) objP3, kk0Var, 0);
                cVar4 = cVar3;
                i15 = i14;
                f8 = f6;
                f9 = f7;
                j6 = j5;
                j7 = j4;
            } else {
                kk0Var.X();
                if ((i3 & 1) != 0) {
                    if (i18 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    i13 = i4 & 4;
                    i03Var = i03.a;
                    if (i13 != 0) {
                        circularColor = i03Var.getCircularColor(kk0Var, 6);
                        i5 &= -897;
                    } else {
                        circularColor = j;
                    }
                    if (i6 != 0) {
                        f4 = 4.0f;
                    }
                    if ((i4 & 16) != 0) {
                        circularDeterminateTrackColor = i03Var.getCircularDeterminateTrackColor(kk0Var, 6);
                        i5 &= -57345;
                    } else {
                        circularDeterminateTrackColor = circularDeterminateTrackColor;
                    }
                    if (i8 != 0) {
                        i9 = 1;
                    }
                    if (i11 != 0) {
                        f6 = 4.0f;
                    } else {
                        f6 = f5;
                    }
                    i14 = i9;
                    j3 = circularColor;
                } else {
                    if (i18 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    i13 = i4 & 4;
                    i03Var = i03.a;
                    if (i13 != 0) {
                        circularColor = i03Var.getCircularColor(kk0Var, 6);
                        i5 &= -897;
                    } else {
                        circularColor = j;
                    }
                    if (i6 != 0) {
                        f4 = 4.0f;
                    }
                    if ((i4 & 16) != 0) {
                        circularDeterminateTrackColor = i03Var.getCircularDeterminateTrackColor(kk0Var, 6);
                        i5 &= -57345;
                    } else {
                        circularDeterminateTrackColor = circularDeterminateTrackColor;
                    }
                    if (i8 != 0) {
                        i9 = 1;
                    }
                    if (i11 != 0) {
                        f6 = 4.0f;
                    } else {
                        f6 = f5;
                    }
                    i14 = i9;
                    j3 = circularColor;
                }
                kk0Var.s();
                if ((i5 & 14) == 4) {
                    z = true;
                } else {
                    z = false;
                }
                objP = kk0Var.P();
                if (z) {
                    objP = new gh1(je1Var, 5);
                    kk0Var.l0(objP);
                } else {
                    objP = new gh1(je1Var, 5);
                    kk0Var.l0(objP);
                }
                je1Var2 = (je1) objP;
                vo3Var = new vo3(i14, ((wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity())).w(f4), 0, 0.0f, 26);
                zH = kk0Var.h(je1Var2);
                objP2 = kk0Var.P();
                if (zH) {
                    objP2 = new oy0(je1Var2, 4);
                    kk0Var.l0(objP2);
                } else {
                    objP2 = new oy0(je1Var2, 4);
                    kk0Var.l0(objP2);
                }
                c cVarJ11 = d.j(we3.b(cVar3, true, (le1) objP2), d);
                boolean zH12 = kk0Var.h(je1Var2);
                if ((i5 & 458752) == 131072) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean z115 = z2 | zH12;
                if ((3670016 & i5) == 1048576) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                boolean z116 = z115 | z3;
                if ((i5 & 7168) == 2048) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                zJ = z116 | z4 | ((((57344 & i5) ^ 24576) <= 16384 && kk0Var.g(circularDeterminateTrackColor)) || (i5 & 24576) == 16384) | kk0Var.j(vo3Var) | ((((i5 & 896) ^ 384) <= 256 && kk0Var.g(j3)) || (i5 & 384) == 256);
                objP3 = kk0Var.P();
                if (zJ) {
                    j4 = j3;
                    j5 = circularDeterminateTrackColor;
                    f7 = f4;
                    objP3 = new k03(je1Var2, i14, f6, f7, j5, vo3Var, j4);
                    kk0Var.l0(objP3);
                } else {
                    j4 = j3;
                    j5 = circularDeterminateTrackColor;
                    f7 = f4;
                    objP3 = new k03(je1Var2, i14, f6, f7, j5, vo3Var, j4);
                    kk0Var.l0(objP3);
                }
                c10.Canvas(cVarJ11, (le1) objP3, kk0Var, 0);
                cVar4 = cVar3;
                i15 = i14;
                f8 = f6;
                f9 = f7;
                j6 = j5;
                j7 = j4;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new l03(je1Var, cVar4, j7, f9, j6, i15, f8, i3, i4));
            }
        }
        i5 |= 3072;
        f4 = f2;
        if ((i3 & 24576) == 0) {
            circularDeterminateTrackColor = j2;
            if ((i4 & 16) == 0) {
                i16 = ConstantsKt.DEFAULT_BUFFER_SIZE;
            } else {
                i16 = ConstantsKt.DEFAULT_BUFFER_SIZE;
            }
            i5 |= i16;
        } else {
            circularDeterminateTrackColor = j2;
        }
        i8 = i4 & 32;
        if (i8 != 0) {
            if ((196608 & i3) == 0) {
                i9 = i2;
                if (kk0Var.f(i9)) {
                    i10 = 131072;
                } else {
                    i10 = 65536;
                }
                i5 |= i10;
            }
            i11 = i4 & 64;
            if (i11 != 0) {
                i5 |= 1572864;
                f5 = f3;
            } else {
                f5 = f3;
                if ((i3 & 1572864) == 0) {
                    if (kk0Var.e(f5)) {
                        i12 = 1048576;
                    } else {
                        i12 = 524288;
                    }
                    i5 |= i12;
                }
            }
            if ((i5 & 599187) == 599186) {
                kk0Var.X();
                if ((i3 & 1) != 0) {
                    if (i18 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    i13 = i4 & 4;
                    i03Var = i03.a;
                    if (i13 != 0) {
                        circularColor = i03Var.getCircularColor(kk0Var, 6);
                        i5 &= -897;
                    } else {
                        circularColor = j;
                    }
                    if (i6 != 0) {
                        f4 = 4.0f;
                    }
                    if ((i4 & 16) != 0) {
                        circularDeterminateTrackColor = i03Var.getCircularDeterminateTrackColor(kk0Var, 6);
                        i5 &= -57345;
                    } else {
                        circularDeterminateTrackColor = circularDeterminateTrackColor;
                    }
                    if (i8 != 0) {
                        i9 = 1;
                    }
                    if (i11 != 0) {
                        f6 = 4.0f;
                    } else {
                        f6 = f5;
                    }
                    i14 = i9;
                    j3 = circularColor;
                } else {
                    if (i18 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    i13 = i4 & 4;
                    i03Var = i03.a;
                    if (i13 != 0) {
                        circularColor = i03Var.getCircularColor(kk0Var, 6);
                        i5 &= -897;
                    } else {
                        circularColor = j;
                    }
                    if (i6 != 0) {
                        f4 = 4.0f;
                    }
                    if ((i4 & 16) != 0) {
                        circularDeterminateTrackColor = i03Var.getCircularDeterminateTrackColor(kk0Var, 6);
                        i5 &= -57345;
                    } else {
                        circularDeterminateTrackColor = circularDeterminateTrackColor;
                    }
                    if (i8 != 0) {
                        i9 = 1;
                    }
                    if (i11 != 0) {
                        f6 = 4.0f;
                    } else {
                        f6 = f5;
                    }
                    i14 = i9;
                    j3 = circularColor;
                }
                kk0Var.s();
                if ((i5 & 14) == 4) {
                    z = true;
                } else {
                    z = false;
                }
                objP = kk0Var.P();
                if (z) {
                    objP = new gh1(je1Var, 5);
                    kk0Var.l0(objP);
                } else {
                    objP = new gh1(je1Var, 5);
                    kk0Var.l0(objP);
                }
                je1Var2 = (je1) objP;
                vo3Var = new vo3(i14, ((wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity())).w(f4), 0, 0.0f, 26);
                zH = kk0Var.h(je1Var2);
                objP2 = kk0Var.P();
                if (zH) {
                    objP2 = new oy0(je1Var2, 4);
                    kk0Var.l0(objP2);
                } else {
                    objP2 = new oy0(je1Var2, 4);
                    kk0Var.l0(objP2);
                }
                c cVarJ12 = d.j(we3.b(cVar3, true, (le1) objP2), d);
                boolean zH13 = kk0Var.h(je1Var2);
                if ((i5 & 458752) == 131072) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean z117 = z2 | zH13;
                if ((3670016 & i5) == 1048576) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                boolean z118 = z117 | z3;
                if ((i5 & 7168) == 2048) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                zJ = z118 | z4 | ((((57344 & i5) ^ 24576) <= 16384 && kk0Var.g(circularDeterminateTrackColor)) || (i5 & 24576) == 16384) | kk0Var.j(vo3Var) | ((((i5 & 896) ^ 384) <= 256 && kk0Var.g(j3)) || (i5 & 384) == 256);
                objP3 = kk0Var.P();
                if (zJ) {
                    j4 = j3;
                    j5 = circularDeterminateTrackColor;
                    f7 = f4;
                    objP3 = new k03(je1Var2, i14, f6, f7, j5, vo3Var, j4);
                    kk0Var.l0(objP3);
                } else {
                    j4 = j3;
                    j5 = circularDeterminateTrackColor;
                    f7 = f4;
                    objP3 = new k03(je1Var2, i14, f6, f7, j5, vo3Var, j4);
                    kk0Var.l0(objP3);
                }
                c10.Canvas(cVarJ12, (le1) objP3, kk0Var, 0);
                cVar4 = cVar3;
                i15 = i14;
                f8 = f6;
                f9 = f7;
                j6 = j5;
                j7 = j4;
            } else {
                kk0Var.X();
                if ((i3 & 1) != 0) {
                    if (i18 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    i13 = i4 & 4;
                    i03Var = i03.a;
                    if (i13 != 0) {
                        circularColor = i03Var.getCircularColor(kk0Var, 6);
                        i5 &= -897;
                    } else {
                        circularColor = j;
                    }
                    if (i6 != 0) {
                        f4 = 4.0f;
                    }
                    if ((i4 & 16) != 0) {
                        circularDeterminateTrackColor = i03Var.getCircularDeterminateTrackColor(kk0Var, 6);
                        i5 &= -57345;
                    } else {
                        circularDeterminateTrackColor = circularDeterminateTrackColor;
                    }
                    if (i8 != 0) {
                        i9 = 1;
                    }
                    if (i11 != 0) {
                        f6 = 4.0f;
                    } else {
                        f6 = f5;
                    }
                    i14 = i9;
                    j3 = circularColor;
                } else {
                    if (i18 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    i13 = i4 & 4;
                    i03Var = i03.a;
                    if (i13 != 0) {
                        circularColor = i03Var.getCircularColor(kk0Var, 6);
                        i5 &= -897;
                    } else {
                        circularColor = j;
                    }
                    if (i6 != 0) {
                        f4 = 4.0f;
                    }
                    if ((i4 & 16) != 0) {
                        circularDeterminateTrackColor = i03Var.getCircularDeterminateTrackColor(kk0Var, 6);
                        i5 &= -57345;
                    } else {
                        circularDeterminateTrackColor = circularDeterminateTrackColor;
                    }
                    if (i8 != 0) {
                        i9 = 1;
                    }
                    if (i11 != 0) {
                        f6 = 4.0f;
                    } else {
                        f6 = f5;
                    }
                    i14 = i9;
                    j3 = circularColor;
                }
                kk0Var.s();
                if ((i5 & 14) == 4) {
                    z = true;
                } else {
                    z = false;
                }
                objP = kk0Var.P();
                if (z) {
                    objP = new gh1(je1Var, 5);
                    kk0Var.l0(objP);
                } else {
                    objP = new gh1(je1Var, 5);
                    kk0Var.l0(objP);
                }
                je1Var2 = (je1) objP;
                vo3Var = new vo3(i14, ((wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity())).w(f4), 0, 0.0f, 26);
                zH = kk0Var.h(je1Var2);
                objP2 = kk0Var.P();
                if (zH) {
                    objP2 = new oy0(je1Var2, 4);
                    kk0Var.l0(objP2);
                } else {
                    objP2 = new oy0(je1Var2, 4);
                    kk0Var.l0(objP2);
                }
                c cVarJ13 = d.j(we3.b(cVar3, true, (le1) objP2), d);
                boolean zH14 = kk0Var.h(je1Var2);
                if ((i5 & 458752) == 131072) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean z119 = z2 | zH14;
                if ((3670016 & i5) == 1048576) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                boolean z1110 = z119 | z3;
                if ((i5 & 7168) == 2048) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                zJ = z1110 | z4 | ((((57344 & i5) ^ 24576) <= 16384 && kk0Var.g(circularDeterminateTrackColor)) || (i5 & 24576) == 16384) | kk0Var.j(vo3Var) | ((((i5 & 896) ^ 384) <= 256 && kk0Var.g(j3)) || (i5 & 384) == 256);
                objP3 = kk0Var.P();
                if (zJ) {
                    j4 = j3;
                    j5 = circularDeterminateTrackColor;
                    f7 = f4;
                    objP3 = new k03(je1Var2, i14, f6, f7, j5, vo3Var, j4);
                    kk0Var.l0(objP3);
                } else {
                    j4 = j3;
                    j5 = circularDeterminateTrackColor;
                    f7 = f4;
                    objP3 = new k03(je1Var2, i14, f6, f7, j5, vo3Var, j4);
                    kk0Var.l0(objP3);
                }
                c10.Canvas(cVarJ13, (le1) objP3, kk0Var, 0);
                cVar4 = cVar3;
                i15 = i14;
                f8 = f6;
                f9 = f7;
                j6 = j5;
                j7 = j4;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new l03(je1Var, cVar4, j7, f9, j6, i15, f8, i3, i4));
            }
        }
        i5 |= 196608;
        i9 = i2;
        i11 = i4 & 64;
        if (i11 != 0) {
            i5 |= 1572864;
            f5 = f3;
        } else {
            f5 = f3;
            if ((i3 & 1572864) == 0) {
                if (kk0Var.e(f5)) {
                    i12 = 1048576;
                } else {
                    i12 = 524288;
                }
                i5 |= i12;
            }
        }
        if ((i5 & 599187) == 599186) {
            kk0Var.X();
            if ((i3 & 1) != 0) {
                if (i18 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                i13 = i4 & 4;
                i03Var = i03.a;
                if (i13 != 0) {
                    circularColor = i03Var.getCircularColor(kk0Var, 6);
                    i5 &= -897;
                } else {
                    circularColor = j;
                }
                if (i6 != 0) {
                    f4 = 4.0f;
                }
                if ((i4 & 16) != 0) {
                    circularDeterminateTrackColor = i03Var.getCircularDeterminateTrackColor(kk0Var, 6);
                    i5 &= -57345;
                } else {
                    circularDeterminateTrackColor = circularDeterminateTrackColor;
                }
                if (i8 != 0) {
                    i9 = 1;
                }
                if (i11 != 0) {
                    f6 = 4.0f;
                } else {
                    f6 = f5;
                }
                i14 = i9;
                j3 = circularColor;
            } else {
                if (i18 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                i13 = i4 & 4;
                i03Var = i03.a;
                if (i13 != 0) {
                    circularColor = i03Var.getCircularColor(kk0Var, 6);
                    i5 &= -897;
                } else {
                    circularColor = j;
                }
                if (i6 != 0) {
                    f4 = 4.0f;
                }
                if ((i4 & 16) != 0) {
                    circularDeterminateTrackColor = i03Var.getCircularDeterminateTrackColor(kk0Var, 6);
                    i5 &= -57345;
                } else {
                    circularDeterminateTrackColor = circularDeterminateTrackColor;
                }
                if (i8 != 0) {
                    i9 = 1;
                }
                if (i11 != 0) {
                    f6 = 4.0f;
                } else {
                    f6 = f5;
                }
                i14 = i9;
                j3 = circularColor;
            }
            kk0Var.s();
            if ((i5 & 14) == 4) {
                z = true;
            } else {
                z = false;
            }
            objP = kk0Var.P();
            if (z) {
                objP = new gh1(je1Var, 5);
                kk0Var.l0(objP);
            } else {
                objP = new gh1(je1Var, 5);
                kk0Var.l0(objP);
            }
            je1Var2 = (je1) objP;
            vo3Var = new vo3(i14, ((wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity())).w(f4), 0, 0.0f, 26);
            zH = kk0Var.h(je1Var2);
            objP2 = kk0Var.P();
            if (zH) {
                objP2 = new oy0(je1Var2, 4);
                kk0Var.l0(objP2);
            } else {
                objP2 = new oy0(je1Var2, 4);
                kk0Var.l0(objP2);
            }
            c cVarJ14 = d.j(we3.b(cVar3, true, (le1) objP2), d);
            boolean zH15 = kk0Var.h(je1Var2);
            if ((i5 & 458752) == 131072) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z1111 = z2 | zH15;
            if ((3670016 & i5) == 1048576) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z1112 = z1111 | z3;
            if ((i5 & 7168) == 2048) {
                z4 = true;
            } else {
                z4 = false;
            }
            zJ = z1112 | z4 | ((((57344 & i5) ^ 24576) <= 16384 && kk0Var.g(circularDeterminateTrackColor)) || (i5 & 24576) == 16384) | kk0Var.j(vo3Var) | ((((i5 & 896) ^ 384) <= 256 && kk0Var.g(j3)) || (i5 & 384) == 256);
            objP3 = kk0Var.P();
            if (zJ) {
                j4 = j3;
                j5 = circularDeterminateTrackColor;
                f7 = f4;
                objP3 = new k03(je1Var2, i14, f6, f7, j5, vo3Var, j4);
                kk0Var.l0(objP3);
            } else {
                j4 = j3;
                j5 = circularDeterminateTrackColor;
                f7 = f4;
                objP3 = new k03(je1Var2, i14, f6, f7, j5, vo3Var, j4);
                kk0Var.l0(objP3);
            }
            c10.Canvas(cVarJ14, (le1) objP3, kk0Var, 0);
            cVar4 = cVar3;
            i15 = i14;
            f8 = f6;
            f9 = f7;
            j6 = j5;
            j7 = j4;
        } else {
            kk0Var.X();
            if ((i3 & 1) != 0) {
                if (i18 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                i13 = i4 & 4;
                i03Var = i03.a;
                if (i13 != 0) {
                    circularColor = i03Var.getCircularColor(kk0Var, 6);
                    i5 &= -897;
                } else {
                    circularColor = j;
                }
                if (i6 != 0) {
                    f4 = 4.0f;
                }
                if ((i4 & 16) != 0) {
                    circularDeterminateTrackColor = i03Var.getCircularDeterminateTrackColor(kk0Var, 6);
                    i5 &= -57345;
                } else {
                    circularDeterminateTrackColor = circularDeterminateTrackColor;
                }
                if (i8 != 0) {
                    i9 = 1;
                }
                if (i11 != 0) {
                    f6 = 4.0f;
                } else {
                    f6 = f5;
                }
                i14 = i9;
                j3 = circularColor;
            } else {
                if (i18 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                i13 = i4 & 4;
                i03Var = i03.a;
                if (i13 != 0) {
                    circularColor = i03Var.getCircularColor(kk0Var, 6);
                    i5 &= -897;
                } else {
                    circularColor = j;
                }
                if (i6 != 0) {
                    f4 = 4.0f;
                }
                if ((i4 & 16) != 0) {
                    circularDeterminateTrackColor = i03Var.getCircularDeterminateTrackColor(kk0Var, 6);
                    i5 &= -57345;
                } else {
                    circularDeterminateTrackColor = circularDeterminateTrackColor;
                }
                if (i8 != 0) {
                    i9 = 1;
                }
                if (i11 != 0) {
                    f6 = 4.0f;
                } else {
                    f6 = f5;
                }
                i14 = i9;
                j3 = circularColor;
            }
            kk0Var.s();
            if ((i5 & 14) == 4) {
                z = true;
            } else {
                z = false;
            }
            objP = kk0Var.P();
            if (z) {
                objP = new gh1(je1Var, 5);
                kk0Var.l0(objP);
            } else {
                objP = new gh1(je1Var, 5);
                kk0Var.l0(objP);
            }
            je1Var2 = (je1) objP;
            vo3Var = new vo3(i14, ((wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity())).w(f4), 0, 0.0f, 26);
            zH = kk0Var.h(je1Var2);
            objP2 = kk0Var.P();
            if (zH) {
                objP2 = new oy0(je1Var2, 4);
                kk0Var.l0(objP2);
            } else {
                objP2 = new oy0(je1Var2, 4);
                kk0Var.l0(objP2);
            }
            c cVarJ15 = d.j(we3.b(cVar3, true, (le1) objP2), d);
            boolean zH16 = kk0Var.h(je1Var2);
            if ((i5 & 458752) == 131072) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z1113 = z2 | zH16;
            if ((3670016 & i5) == 1048576) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z1114 = z1113 | z3;
            if ((i5 & 7168) == 2048) {
                z4 = true;
            } else {
                z4 = false;
            }
            zJ = z1114 | z4 | ((((57344 & i5) ^ 24576) <= 16384 && kk0Var.g(circularDeterminateTrackColor)) || (i5 & 24576) == 16384) | kk0Var.j(vo3Var) | ((((i5 & 896) ^ 384) <= 256 && kk0Var.g(j3)) || (i5 & 384) == 256);
            objP3 = kk0Var.P();
            if (zJ) {
                j4 = j3;
                j5 = circularDeterminateTrackColor;
                f7 = f4;
                objP3 = new k03(je1Var2, i14, f6, f7, j5, vo3Var, j4);
                kk0Var.l0(objP3);
            } else {
                j4 = j3;
                j5 = circularDeterminateTrackColor;
                f7 = f4;
                objP3 = new k03(je1Var2, i14, f6, f7, j5, vo3Var, j4);
                kk0Var.l0(objP3);
            }
            c10.Canvas(cVarJ15, (le1) objP3, kk0Var, 0);
            cVar4 = cVar3;
            i15 = i14;
            f8 = f6;
            f9 = f7;
            j6 = j5;
            j7 = j4;
        }
        w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new l03(je1Var, cVar4, j7, f9, j6, i15, f8, i3, i4));
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0259  */
    /* JADX WARN: Code duplicated, block: B:101:0x025b  */
    /* JADX WARN: Code duplicated, block: B:104:0x0265  */
    /* JADX WARN: Code duplicated, block: B:106:0x026b  */
    /* JADX WARN: Code duplicated, block: B:112:0x027c  */
    /* JADX WARN: Code duplicated, block: B:116:0x0286  */
    /* JADX WARN: Code duplicated, block: B:120:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x006d  */
    /* JADX WARN: Code duplicated, block: B:41:0x007c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0080  */
    /* JADX WARN: Code duplicated, block: B:46:0x0086  */
    /* JADX WARN: Code duplicated, block: B:48:0x008b  */
    /* JADX WARN: Code duplicated, block: B:50:0x008f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0097  */
    /* JADX WARN: Code duplicated, block: B:53:0x009a  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:63:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:73:0x00df A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:78:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:80:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:84:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:87:0x0109  */
    /* JADX WARN: Code duplicated, block: B:88:0x010d  */
    /* JADX WARN: Code duplicated, block: B:91:0x0223  */
    /* JADX WARN: Code duplicated, block: B:93:0x0229  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: CircularProgressIndicator-LxG7B9w, reason: not valid java name */
    public static final void m1882xe8727fba(c cVar, long j, float f2, long j2, int i2, ck0 ck0Var, int i3, int i4) {
        c cVar2;
        int i5;
        long circularColor;
        long circularIndeterminateTrackColor;
        int i6;
        int i7;
        int i8;
        c cVar3;
        int i9;
        i03 i03Var;
        float f3;
        float f4;
        long j3;
        int i10;
        int i11;
        long j4;
        vo3 vo3Var;
        int i12;
        float f5;
        long j5;
        gn3 gn3VarAnimateValue;
        gn3 gn3VarAnimateFloat;
        gn3 gn3VarAnimateFloat2;
        gn3 gn3VarAnimateFloat3;
        boolean z;
        boolean z2;
        Object objP;
        long j6;
        c cVar4;
        long j7;
        float f6;
        long j8;
        int i13;
        w33 w33VarV;
        int i14;
        Float fValueOf = Float.valueOf(290.0f);
        Float fValueOf2 = Float.valueOf(0.0f);
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(-115871647);
        int i15 = i4 & 1;
        if (i15 != 0) {
            i5 = i3 | 6;
            cVar2 = cVar;
        } else if ((i3 & 6) == 0) {
            cVar2 = cVar;
            i5 = (kk0Var.h(cVar2) ? 4 : 2) | i3;
        } else {
            cVar2 = cVar;
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            circularColor = j;
            i5 |= ((i4 & 2) == 0 && kk0Var.g(circularColor)) ? 32 : 16;
        } else {
            circularColor = j;
        }
        int i16 = i4 & 4;
        if (i16 == 0) {
            if ((i3 & 384) == 0) {
                i5 |= kk0Var.e(f2) ? FontInfo.NUMBER_OF_CHAR_CODES : Uuid.SIZE_BITS;
            }
            if ((i3 & 3072) == 0) {
                circularIndeterminateTrackColor = j2;
                if ((i4 & 8) == 0 || !kk0Var.g(circularIndeterminateTrackColor)) {
                    i14 = 1024;
                } else {
                    i14 = 2048;
                }
                i5 |= i14;
            } else {
                circularIndeterminateTrackColor = j2;
            }
            i6 = i4 & 16;
            if (i6 != 0) {
                if ((i3 & 24576) == 0) {
                    i7 = i2;
                    if (kk0Var.f(i7)) {
                        i8 = 16384;
                    } else {
                        i8 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                    }
                    i5 |= i8;
                }
                if ((i5 & 9363) == 9362 || !kk0Var.F()) {
                    kk0Var.X();
                    if ((i3 & 1) != 0 || kk0Var.D()) {
                        if (i15 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        i9 = i4 & 2;
                        i03Var = i03.a;
                        if (i9 != 0) {
                            circularColor = i03Var.getCircularColor(kk0Var, 6);
                            i5 &= -113;
                        }
                        if (i16 != 0) {
                            f3 = 4.0f;
                        } else {
                            f3 = f2;
                        }
                        if ((i4 & 8) != 0) {
                            circularIndeterminateTrackColor = i03Var.getCircularIndeterminateTrackColor(kk0Var, 6);
                            i5 &= -7169;
                        }
                        int i17 = i5;
                        f4 = f3;
                        j3 = circularColor;
                        i10 = i17;
                        if (i6 != 0) {
                            j4 = circularIndeterminateTrackColor;
                            i11 = 1;
                        } else {
                            i11 = i2;
                            j4 = circularIndeterminateTrackColor;
                        }
                    } else {
                        kk0Var.V();
                        if ((i4 & 2) != 0) {
                            i5 &= -113;
                        }
                        if ((i4 & 8) != 0) {
                            i5 &= -7169;
                        }
                        i11 = i2;
                        cVar3 = cVar2;
                        j3 = circularColor;
                        j4 = circularIndeterminateTrackColor;
                        i10 = i5;
                        f4 = f2;
                    }
                    kk0Var.s();
                    vo3Var = new vo3(i11, ((wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity())).w(f4), 0, 0.0f, 26);
                    go1 go1VarRememberInfiniteTransition = io1.rememberInfiniteTransition(null, kk0Var, 0, 1);
                    i12 = i10;
                    x64 x64Var = mb4.b;
                    u41 u41Var = c11.d;
                    f5 = f4;
                    int i18 = i11;
                    j5 = j4;
                    gn3VarAnimateValue = io1.animateValue(go1VarRememberInfiniteTransition, 0, 5, x64Var, kr1.N(kr1.o0(6660, 0, u41Var, 2), 6), null, kk0Var, 33208, 16);
                    gn3VarAnimateFloat = io1.animateFloat(go1VarRememberInfiniteTransition, 0.0f, 286.0f, kr1.N(kr1.o0(1332, 0, u41Var, 2), 6), null, kk0Var, 4536, 8);
                    kn4 kn4Var = new kn4(6);
                    kn4Var.b = 1332;
                    aw1 aw1VarC = kn4Var.c(fValueOf2, 0);
                    zq0 zq0Var = i;
                    aw1VarC.b = zq0Var;
                    kn4Var.c(fValueOf, 666);
                    gn3VarAnimateFloat2 = io1.animateFloat(go1VarRememberInfiniteTransition, 0.0f, 290.0f, kr1.N(new bw1(kn4Var), 6), null, kk0Var, 4536, 8);
                    kn4 kn4Var2 = new kn4(6);
                    kn4Var2.b = 1332;
                    kn4Var2.c(fValueOf2, 666).b = zq0Var;
                    kn4Var2.c(fValueOf, kn4Var2.b);
                    gn3VarAnimateFloat3 = io1.animateFloat(go1VarRememberInfiniteTransition, 0.0f, 290.0f, kr1.N(new bw1(kn4Var2), 6), null, kk0Var, 4536, 8);
                    c cVarJ = d.j(we3.b(cVar3, true, xq2.x), d);
                    boolean zJ = ((((i12 & 7168) ^ 3072) <= 2048 && kk0Var.g(j5)) || (i12 & 3072) == 2048) | kk0Var.j(vo3Var) | kk0Var.h(gn3VarAnimateValue) | kk0Var.h(gn3VarAnimateFloat2) | kk0Var.h(gn3VarAnimateFloat3) | kk0Var.h(gn3VarAnimateFloat);
                    if ((i12 & 896) == 256) {
                        z = true;
                    } else {
                        z = false;
                    }
                    z2 = z | zJ | ((((i12 & 112) ^ 48) <= 32 && kk0Var.g(j3)) || (i12 & 48) == 32);
                    objP = kk0Var.P();
                    if (!z2 || objP == Composer$Companion.getEmpty()) {
                        j6 = j3;
                        objP = new m03(j5, vo3Var, gn3VarAnimateValue, gn3VarAnimateFloat2, gn3VarAnimateFloat3, gn3VarAnimateFloat, f5, j6);
                        kk0Var.l0(objP);
                    } else {
                        j6 = j3;
                    }
                    c10.Canvas(cVarJ, (le1) objP, kk0Var, 0);
                    cVar4 = cVar3;
                    j7 = j5;
                    f6 = f5;
                    j8 = j6;
                    i13 = i18;
                } else {
                    kk0Var.V();
                    cVar4 = cVar2;
                    j8 = circularColor;
                    j7 = circularIndeterminateTrackColor;
                    i13 = i7;
                    f6 = f2;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new n03(cVar4, j8, f6, j7, i13, i3, i4));
                }
            }
            i5 |= 24576;
            i7 = i2;
            if ((i5 & 9363) == 9362) {
                kk0Var.X();
                if ((i3 & 1) != 0) {
                    if (i15 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    i9 = i4 & 2;
                    i03Var = i03.a;
                    if (i9 != 0) {
                        circularColor = i03Var.getCircularColor(kk0Var, 6);
                        i5 &= -113;
                    }
                    if (i16 != 0) {
                        f3 = 4.0f;
                    } else {
                        f3 = f2;
                    }
                    if ((i4 & 8) != 0) {
                        circularIndeterminateTrackColor = i03Var.getCircularIndeterminateTrackColor(kk0Var, 6);
                        i5 &= -7169;
                    }
                    int i19 = i5;
                    f4 = f3;
                    j3 = circularColor;
                    i10 = i19;
                    if (i6 != 0) {
                        j4 = circularIndeterminateTrackColor;
                        i11 = 1;
                    } else {
                        i11 = i2;
                        j4 = circularIndeterminateTrackColor;
                    }
                } else {
                    if (i15 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    i9 = i4 & 2;
                    i03Var = i03.a;
                    if (i9 != 0) {
                        circularColor = i03Var.getCircularColor(kk0Var, 6);
                        i5 &= -113;
                    }
                    if (i16 != 0) {
                        f3 = 4.0f;
                    } else {
                        f3 = f2;
                    }
                    if ((i4 & 8) != 0) {
                        circularIndeterminateTrackColor = i03Var.getCircularIndeterminateTrackColor(kk0Var, 6);
                        i5 &= -7169;
                    }
                    int i110 = i5;
                    f4 = f3;
                    j3 = circularColor;
                    i10 = i110;
                    if (i6 != 0) {
                        j4 = circularIndeterminateTrackColor;
                        i11 = 1;
                    } else {
                        i11 = i2;
                        j4 = circularIndeterminateTrackColor;
                    }
                }
                kk0Var.s();
                vo3Var = new vo3(i11, ((wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity())).w(f4), 0, 0.0f, 26);
                go1 go1VarRememberInfiniteTransition2 = io1.rememberInfiniteTransition(null, kk0Var, 0, 1);
                i12 = i10;
                x64 x64Var2 = mb4.b;
                u41 u41Var2 = c11.d;
                f5 = f4;
                int i111 = i11;
                j5 = j4;
                gn3VarAnimateValue = io1.animateValue(go1VarRememberInfiniteTransition2, 0, 5, x64Var2, kr1.N(kr1.o0(6660, 0, u41Var2, 2), 6), null, kk0Var, 33208, 16);
                gn3VarAnimateFloat = io1.animateFloat(go1VarRememberInfiniteTransition2, 0.0f, 286.0f, kr1.N(kr1.o0(1332, 0, u41Var2, 2), 6), null, kk0Var, 4536, 8);
                kn4 kn4Var3 = new kn4(6);
                kn4Var3.b = 1332;
                aw1 aw1VarC2 = kn4Var3.c(fValueOf2, 0);
                zq0 zq0Var2 = i;
                aw1VarC2.b = zq0Var2;
                kn4Var3.c(fValueOf, 666);
                gn3VarAnimateFloat2 = io1.animateFloat(go1VarRememberInfiniteTransition2, 0.0f, 290.0f, kr1.N(new bw1(kn4Var3), 6), null, kk0Var, 4536, 8);
                kn4 kn4Var4 = new kn4(6);
                kn4Var4.b = 1332;
                kn4Var4.c(fValueOf2, 666).b = zq0Var2;
                kn4Var4.c(fValueOf, kn4Var4.b);
                gn3VarAnimateFloat3 = io1.animateFloat(go1VarRememberInfiniteTransition2, 0.0f, 290.0f, kr1.N(new bw1(kn4Var4), 6), null, kk0Var, 4536, 8);
                c cVarJ2 = d.j(we3.b(cVar3, true, xq2.x), d);
                boolean zJ2 = ((((i12 & 7168) ^ 3072) <= 2048 && kk0Var.g(j5)) || (i12 & 3072) == 2048) | kk0Var.j(vo3Var) | kk0Var.h(gn3VarAnimateValue) | kk0Var.h(gn3VarAnimateFloat2) | kk0Var.h(gn3VarAnimateFloat3) | kk0Var.h(gn3VarAnimateFloat);
                if ((i12 & 896) == 256) {
                    z = true;
                } else {
                    z = false;
                }
                z2 = z | zJ2 | ((((i12 & 112) ^ 48) <= 32 && kk0Var.g(j3)) || (i12 & 48) == 32);
                objP = kk0Var.P();
                if (z2) {
                    j6 = j3;
                    objP = new m03(j5, vo3Var, gn3VarAnimateValue, gn3VarAnimateFloat2, gn3VarAnimateFloat3, gn3VarAnimateFloat, f5, j6);
                    kk0Var.l0(objP);
                } else {
                    j6 = j3;
                    objP = new m03(j5, vo3Var, gn3VarAnimateValue, gn3VarAnimateFloat2, gn3VarAnimateFloat3, gn3VarAnimateFloat, f5, j6);
                    kk0Var.l0(objP);
                }
                c10.Canvas(cVarJ2, (le1) objP, kk0Var, 0);
                cVar4 = cVar3;
                j7 = j5;
                f6 = f5;
                j8 = j6;
                i13 = i111;
            } else {
                kk0Var.X();
                if ((i3 & 1) != 0) {
                    if (i15 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    i9 = i4 & 2;
                    i03Var = i03.a;
                    if (i9 != 0) {
                        circularColor = i03Var.getCircularColor(kk0Var, 6);
                        i5 &= -113;
                    }
                    if (i16 != 0) {
                        f3 = 4.0f;
                    } else {
                        f3 = f2;
                    }
                    if ((i4 & 8) != 0) {
                        circularIndeterminateTrackColor = i03Var.getCircularIndeterminateTrackColor(kk0Var, 6);
                        i5 &= -7169;
                    }
                    int i112 = i5;
                    f4 = f3;
                    j3 = circularColor;
                    i10 = i112;
                    if (i6 != 0) {
                        j4 = circularIndeterminateTrackColor;
                        i11 = 1;
                    } else {
                        i11 = i2;
                        j4 = circularIndeterminateTrackColor;
                    }
                } else {
                    if (i15 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    i9 = i4 & 2;
                    i03Var = i03.a;
                    if (i9 != 0) {
                        circularColor = i03Var.getCircularColor(kk0Var, 6);
                        i5 &= -113;
                    }
                    if (i16 != 0) {
                        f3 = 4.0f;
                    } else {
                        f3 = f2;
                    }
                    if ((i4 & 8) != 0) {
                        circularIndeterminateTrackColor = i03Var.getCircularIndeterminateTrackColor(kk0Var, 6);
                        i5 &= -7169;
                    }
                    int i113 = i5;
                    f4 = f3;
                    j3 = circularColor;
                    i10 = i113;
                    if (i6 != 0) {
                        j4 = circularIndeterminateTrackColor;
                        i11 = 1;
                    } else {
                        i11 = i2;
                        j4 = circularIndeterminateTrackColor;
                    }
                }
                kk0Var.s();
                vo3Var = new vo3(i11, ((wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity())).w(f4), 0, 0.0f, 26);
                go1 go1VarRememberInfiniteTransition3 = io1.rememberInfiniteTransition(null, kk0Var, 0, 1);
                i12 = i10;
                x64 x64Var3 = mb4.b;
                u41 u41Var3 = c11.d;
                f5 = f4;
                int i114 = i11;
                j5 = j4;
                gn3VarAnimateValue = io1.animateValue(go1VarRememberInfiniteTransition3, 0, 5, x64Var3, kr1.N(kr1.o0(6660, 0, u41Var3, 2), 6), null, kk0Var, 33208, 16);
                gn3VarAnimateFloat = io1.animateFloat(go1VarRememberInfiniteTransition3, 0.0f, 286.0f, kr1.N(kr1.o0(1332, 0, u41Var3, 2), 6), null, kk0Var, 4536, 8);
                kn4 kn4Var5 = new kn4(6);
                kn4Var5.b = 1332;
                aw1 aw1VarC3 = kn4Var5.c(fValueOf2, 0);
                zq0 zq0Var3 = i;
                aw1VarC3.b = zq0Var3;
                kn4Var5.c(fValueOf, 666);
                gn3VarAnimateFloat2 = io1.animateFloat(go1VarRememberInfiniteTransition3, 0.0f, 290.0f, kr1.N(new bw1(kn4Var5), 6), null, kk0Var, 4536, 8);
                kn4 kn4Var6 = new kn4(6);
                kn4Var6.b = 1332;
                kn4Var6.c(fValueOf2, 666).b = zq0Var3;
                kn4Var6.c(fValueOf, kn4Var6.b);
                gn3VarAnimateFloat3 = io1.animateFloat(go1VarRememberInfiniteTransition3, 0.0f, 290.0f, kr1.N(new bw1(kn4Var6), 6), null, kk0Var, 4536, 8);
                c cVarJ3 = d.j(we3.b(cVar3, true, xq2.x), d);
                boolean zJ3 = ((((i12 & 7168) ^ 3072) <= 2048 && kk0Var.g(j5)) || (i12 & 3072) == 2048) | kk0Var.j(vo3Var) | kk0Var.h(gn3VarAnimateValue) | kk0Var.h(gn3VarAnimateFloat2) | kk0Var.h(gn3VarAnimateFloat3) | kk0Var.h(gn3VarAnimateFloat);
                if ((i12 & 896) == 256) {
                    z = true;
                } else {
                    z = false;
                }
                z2 = z | zJ3 | ((((i12 & 112) ^ 48) <= 32 && kk0Var.g(j3)) || (i12 & 48) == 32);
                objP = kk0Var.P();
                if (z2) {
                    j6 = j3;
                    objP = new m03(j5, vo3Var, gn3VarAnimateValue, gn3VarAnimateFloat2, gn3VarAnimateFloat3, gn3VarAnimateFloat, f5, j6);
                    kk0Var.l0(objP);
                } else {
                    j6 = j3;
                    objP = new m03(j5, vo3Var, gn3VarAnimateValue, gn3VarAnimateFloat2, gn3VarAnimateFloat3, gn3VarAnimateFloat, f5, j6);
                    kk0Var.l0(objP);
                }
                c10.Canvas(cVarJ3, (le1) objP, kk0Var, 0);
                cVar4 = cVar3;
                j7 = j5;
                f6 = f5;
                j8 = j6;
                i13 = i114;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new n03(cVar4, j8, f6, j7, i13, i3, i4));
            }
        }
        i5 |= 384;
        if ((i3 & 3072) == 0) {
            circularIndeterminateTrackColor = j2;
            if ((i4 & 8) == 0) {
                i14 = 1024;
            } else {
                i14 = 1024;
            }
            i5 |= i14;
        } else {
            circularIndeterminateTrackColor = j2;
        }
        i6 = i4 & 16;
        if (i6 != 0) {
            if ((i3 & 24576) == 0) {
                i7 = i2;
                if (kk0Var.f(i7)) {
                    i8 = 16384;
                } else {
                    i8 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                }
                i5 |= i8;
            }
            if ((i5 & 9363) == 9362) {
                kk0Var.X();
                if ((i3 & 1) != 0) {
                    if (i15 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    i9 = i4 & 2;
                    i03Var = i03.a;
                    if (i9 != 0) {
                        circularColor = i03Var.getCircularColor(kk0Var, 6);
                        i5 &= -113;
                    }
                    if (i16 != 0) {
                        f3 = 4.0f;
                    } else {
                        f3 = f2;
                    }
                    if ((i4 & 8) != 0) {
                        circularIndeterminateTrackColor = i03Var.getCircularIndeterminateTrackColor(kk0Var, 6);
                        i5 &= -7169;
                    }
                    int i115 = i5;
                    f4 = f3;
                    j3 = circularColor;
                    i10 = i115;
                    if (i6 != 0) {
                        j4 = circularIndeterminateTrackColor;
                        i11 = 1;
                    } else {
                        i11 = i2;
                        j4 = circularIndeterminateTrackColor;
                    }
                } else {
                    if (i15 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    i9 = i4 & 2;
                    i03Var = i03.a;
                    if (i9 != 0) {
                        circularColor = i03Var.getCircularColor(kk0Var, 6);
                        i5 &= -113;
                    }
                    if (i16 != 0) {
                        f3 = 4.0f;
                    } else {
                        f3 = f2;
                    }
                    if ((i4 & 8) != 0) {
                        circularIndeterminateTrackColor = i03Var.getCircularIndeterminateTrackColor(kk0Var, 6);
                        i5 &= -7169;
                    }
                    int i116 = i5;
                    f4 = f3;
                    j3 = circularColor;
                    i10 = i116;
                    if (i6 != 0) {
                        j4 = circularIndeterminateTrackColor;
                        i11 = 1;
                    } else {
                        i11 = i2;
                        j4 = circularIndeterminateTrackColor;
                    }
                }
                kk0Var.s();
                vo3Var = new vo3(i11, ((wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity())).w(f4), 0, 0.0f, 26);
                go1 go1VarRememberInfiniteTransition4 = io1.rememberInfiniteTransition(null, kk0Var, 0, 1);
                i12 = i10;
                x64 x64Var4 = mb4.b;
                u41 u41Var4 = c11.d;
                f5 = f4;
                int i117 = i11;
                j5 = j4;
                gn3VarAnimateValue = io1.animateValue(go1VarRememberInfiniteTransition4, 0, 5, x64Var4, kr1.N(kr1.o0(6660, 0, u41Var4, 2), 6), null, kk0Var, 33208, 16);
                gn3VarAnimateFloat = io1.animateFloat(go1VarRememberInfiniteTransition4, 0.0f, 286.0f, kr1.N(kr1.o0(1332, 0, u41Var4, 2), 6), null, kk0Var, 4536, 8);
                kn4 kn4Var7 = new kn4(6);
                kn4Var7.b = 1332;
                aw1 aw1VarC4 = kn4Var7.c(fValueOf2, 0);
                zq0 zq0Var4 = i;
                aw1VarC4.b = zq0Var4;
                kn4Var7.c(fValueOf, 666);
                gn3VarAnimateFloat2 = io1.animateFloat(go1VarRememberInfiniteTransition4, 0.0f, 290.0f, kr1.N(new bw1(kn4Var7), 6), null, kk0Var, 4536, 8);
                kn4 kn4Var8 = new kn4(6);
                kn4Var8.b = 1332;
                kn4Var8.c(fValueOf2, 666).b = zq0Var4;
                kn4Var8.c(fValueOf, kn4Var8.b);
                gn3VarAnimateFloat3 = io1.animateFloat(go1VarRememberInfiniteTransition4, 0.0f, 290.0f, kr1.N(new bw1(kn4Var8), 6), null, kk0Var, 4536, 8);
                c cVarJ4 = d.j(we3.b(cVar3, true, xq2.x), d);
                boolean zJ4 = ((((i12 & 7168) ^ 3072) <= 2048 && kk0Var.g(j5)) || (i12 & 3072) == 2048) | kk0Var.j(vo3Var) | kk0Var.h(gn3VarAnimateValue) | kk0Var.h(gn3VarAnimateFloat2) | kk0Var.h(gn3VarAnimateFloat3) | kk0Var.h(gn3VarAnimateFloat);
                if ((i12 & 896) == 256) {
                    z = true;
                } else {
                    z = false;
                }
                z2 = z | zJ4 | ((((i12 & 112) ^ 48) <= 32 && kk0Var.g(j3)) || (i12 & 48) == 32);
                objP = kk0Var.P();
                if (z2) {
                    j6 = j3;
                    objP = new m03(j5, vo3Var, gn3VarAnimateValue, gn3VarAnimateFloat2, gn3VarAnimateFloat3, gn3VarAnimateFloat, f5, j6);
                    kk0Var.l0(objP);
                } else {
                    j6 = j3;
                    objP = new m03(j5, vo3Var, gn3VarAnimateValue, gn3VarAnimateFloat2, gn3VarAnimateFloat3, gn3VarAnimateFloat, f5, j6);
                    kk0Var.l0(objP);
                }
                c10.Canvas(cVarJ4, (le1) objP, kk0Var, 0);
                cVar4 = cVar3;
                j7 = j5;
                f6 = f5;
                j8 = j6;
                i13 = i117;
            } else {
                kk0Var.X();
                if ((i3 & 1) != 0) {
                    if (i15 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    i9 = i4 & 2;
                    i03Var = i03.a;
                    if (i9 != 0) {
                        circularColor = i03Var.getCircularColor(kk0Var, 6);
                        i5 &= -113;
                    }
                    if (i16 != 0) {
                        f3 = 4.0f;
                    } else {
                        f3 = f2;
                    }
                    if ((i4 & 8) != 0) {
                        circularIndeterminateTrackColor = i03Var.getCircularIndeterminateTrackColor(kk0Var, 6);
                        i5 &= -7169;
                    }
                    int i118 = i5;
                    f4 = f3;
                    j3 = circularColor;
                    i10 = i118;
                    if (i6 != 0) {
                        j4 = circularIndeterminateTrackColor;
                        i11 = 1;
                    } else {
                        i11 = i2;
                        j4 = circularIndeterminateTrackColor;
                    }
                } else {
                    if (i15 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    i9 = i4 & 2;
                    i03Var = i03.a;
                    if (i9 != 0) {
                        circularColor = i03Var.getCircularColor(kk0Var, 6);
                        i5 &= -113;
                    }
                    if (i16 != 0) {
                        f3 = 4.0f;
                    } else {
                        f3 = f2;
                    }
                    if ((i4 & 8) != 0) {
                        circularIndeterminateTrackColor = i03Var.getCircularIndeterminateTrackColor(kk0Var, 6);
                        i5 &= -7169;
                    }
                    int i119 = i5;
                    f4 = f3;
                    j3 = circularColor;
                    i10 = i119;
                    if (i6 != 0) {
                        j4 = circularIndeterminateTrackColor;
                        i11 = 1;
                    } else {
                        i11 = i2;
                        j4 = circularIndeterminateTrackColor;
                    }
                }
                kk0Var.s();
                vo3Var = new vo3(i11, ((wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity())).w(f4), 0, 0.0f, 26);
                go1 go1VarRememberInfiniteTransition5 = io1.rememberInfiniteTransition(null, kk0Var, 0, 1);
                i12 = i10;
                x64 x64Var5 = mb4.b;
                u41 u41Var5 = c11.d;
                f5 = f4;
                int i1110 = i11;
                j5 = j4;
                gn3VarAnimateValue = io1.animateValue(go1VarRememberInfiniteTransition5, 0, 5, x64Var5, kr1.N(kr1.o0(6660, 0, u41Var5, 2), 6), null, kk0Var, 33208, 16);
                gn3VarAnimateFloat = io1.animateFloat(go1VarRememberInfiniteTransition5, 0.0f, 286.0f, kr1.N(kr1.o0(1332, 0, u41Var5, 2), 6), null, kk0Var, 4536, 8);
                kn4 kn4Var9 = new kn4(6);
                kn4Var9.b = 1332;
                aw1 aw1VarC5 = kn4Var9.c(fValueOf2, 0);
                zq0 zq0Var5 = i;
                aw1VarC5.b = zq0Var5;
                kn4Var9.c(fValueOf, 666);
                gn3VarAnimateFloat2 = io1.animateFloat(go1VarRememberInfiniteTransition5, 0.0f, 290.0f, kr1.N(new bw1(kn4Var9), 6), null, kk0Var, 4536, 8);
                kn4 kn4Var10 = new kn4(6);
                kn4Var10.b = 1332;
                kn4Var10.c(fValueOf2, 666).b = zq0Var5;
                kn4Var10.c(fValueOf, kn4Var10.b);
                gn3VarAnimateFloat3 = io1.animateFloat(go1VarRememberInfiniteTransition5, 0.0f, 290.0f, kr1.N(new bw1(kn4Var10), 6), null, kk0Var, 4536, 8);
                c cVarJ5 = d.j(we3.b(cVar3, true, xq2.x), d);
                boolean zJ5 = ((((i12 & 7168) ^ 3072) <= 2048 && kk0Var.g(j5)) || (i12 & 3072) == 2048) | kk0Var.j(vo3Var) | kk0Var.h(gn3VarAnimateValue) | kk0Var.h(gn3VarAnimateFloat2) | kk0Var.h(gn3VarAnimateFloat3) | kk0Var.h(gn3VarAnimateFloat);
                if ((i12 & 896) == 256) {
                    z = true;
                } else {
                    z = false;
                }
                z2 = z | zJ5 | ((((i12 & 112) ^ 48) <= 32 && kk0Var.g(j3)) || (i12 & 48) == 32);
                objP = kk0Var.P();
                if (z2) {
                    j6 = j3;
                    objP = new m03(j5, vo3Var, gn3VarAnimateValue, gn3VarAnimateFloat2, gn3VarAnimateFloat3, gn3VarAnimateFloat, f5, j6);
                    kk0Var.l0(objP);
                } else {
                    j6 = j3;
                    objP = new m03(j5, vo3Var, gn3VarAnimateValue, gn3VarAnimateFloat2, gn3VarAnimateFloat3, gn3VarAnimateFloat, f5, j6);
                    kk0Var.l0(objP);
                }
                c10.Canvas(cVarJ5, (le1) objP, kk0Var, 0);
                cVar4 = cVar3;
                j7 = j5;
                f6 = f5;
                j8 = j6;
                i13 = i1110;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new n03(cVar4, j8, f6, j7, i13, i3, i4));
            }
        }
        i5 |= 24576;
        i7 = i2;
        if ((i5 & 9363) == 9362) {
            kk0Var.X();
            if ((i3 & 1) != 0) {
                if (i15 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                i9 = i4 & 2;
                i03Var = i03.a;
                if (i9 != 0) {
                    circularColor = i03Var.getCircularColor(kk0Var, 6);
                    i5 &= -113;
                }
                if (i16 != 0) {
                    f3 = 4.0f;
                } else {
                    f3 = f2;
                }
                if ((i4 & 8) != 0) {
                    circularIndeterminateTrackColor = i03Var.getCircularIndeterminateTrackColor(kk0Var, 6);
                    i5 &= -7169;
                }
                int i1111 = i5;
                f4 = f3;
                j3 = circularColor;
                i10 = i1111;
                if (i6 != 0) {
                    j4 = circularIndeterminateTrackColor;
                    i11 = 1;
                } else {
                    i11 = i2;
                    j4 = circularIndeterminateTrackColor;
                }
            } else {
                if (i15 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                i9 = i4 & 2;
                i03Var = i03.a;
                if (i9 != 0) {
                    circularColor = i03Var.getCircularColor(kk0Var, 6);
                    i5 &= -113;
                }
                if (i16 != 0) {
                    f3 = 4.0f;
                } else {
                    f3 = f2;
                }
                if ((i4 & 8) != 0) {
                    circularIndeterminateTrackColor = i03Var.getCircularIndeterminateTrackColor(kk0Var, 6);
                    i5 &= -7169;
                }
                int i1112 = i5;
                f4 = f3;
                j3 = circularColor;
                i10 = i1112;
                if (i6 != 0) {
                    j4 = circularIndeterminateTrackColor;
                    i11 = 1;
                } else {
                    i11 = i2;
                    j4 = circularIndeterminateTrackColor;
                }
            }
            kk0Var.s();
            vo3Var = new vo3(i11, ((wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity())).w(f4), 0, 0.0f, 26);
            go1 go1VarRememberInfiniteTransition6 = io1.rememberInfiniteTransition(null, kk0Var, 0, 1);
            i12 = i10;
            x64 x64Var6 = mb4.b;
            u41 u41Var6 = c11.d;
            f5 = f4;
            int i1113 = i11;
            j5 = j4;
            gn3VarAnimateValue = io1.animateValue(go1VarRememberInfiniteTransition6, 0, 5, x64Var6, kr1.N(kr1.o0(6660, 0, u41Var6, 2), 6), null, kk0Var, 33208, 16);
            gn3VarAnimateFloat = io1.animateFloat(go1VarRememberInfiniteTransition6, 0.0f, 286.0f, kr1.N(kr1.o0(1332, 0, u41Var6, 2), 6), null, kk0Var, 4536, 8);
            kn4 kn4Var11 = new kn4(6);
            kn4Var11.b = 1332;
            aw1 aw1VarC6 = kn4Var11.c(fValueOf2, 0);
            zq0 zq0Var6 = i;
            aw1VarC6.b = zq0Var6;
            kn4Var11.c(fValueOf, 666);
            gn3VarAnimateFloat2 = io1.animateFloat(go1VarRememberInfiniteTransition6, 0.0f, 290.0f, kr1.N(new bw1(kn4Var11), 6), null, kk0Var, 4536, 8);
            kn4 kn4Var12 = new kn4(6);
            kn4Var12.b = 1332;
            kn4Var12.c(fValueOf2, 666).b = zq0Var6;
            kn4Var12.c(fValueOf, kn4Var12.b);
            gn3VarAnimateFloat3 = io1.animateFloat(go1VarRememberInfiniteTransition6, 0.0f, 290.0f, kr1.N(new bw1(kn4Var12), 6), null, kk0Var, 4536, 8);
            c cVarJ6 = d.j(we3.b(cVar3, true, xq2.x), d);
            boolean zJ6 = ((((i12 & 7168) ^ 3072) <= 2048 && kk0Var.g(j5)) || (i12 & 3072) == 2048) | kk0Var.j(vo3Var) | kk0Var.h(gn3VarAnimateValue) | kk0Var.h(gn3VarAnimateFloat2) | kk0Var.h(gn3VarAnimateFloat3) | kk0Var.h(gn3VarAnimateFloat);
            if ((i12 & 896) == 256) {
                z = true;
            } else {
                z = false;
            }
            z2 = z | zJ6 | ((((i12 & 112) ^ 48) <= 32 && kk0Var.g(j3)) || (i12 & 48) == 32);
            objP = kk0Var.P();
            if (z2) {
                j6 = j3;
                objP = new m03(j5, vo3Var, gn3VarAnimateValue, gn3VarAnimateFloat2, gn3VarAnimateFloat3, gn3VarAnimateFloat, f5, j6);
                kk0Var.l0(objP);
            } else {
                j6 = j3;
                objP = new m03(j5, vo3Var, gn3VarAnimateValue, gn3VarAnimateFloat2, gn3VarAnimateFloat3, gn3VarAnimateFloat, f5, j6);
                kk0Var.l0(objP);
            }
            c10.Canvas(cVarJ6, (le1) objP, kk0Var, 0);
            cVar4 = cVar3;
            j7 = j5;
            f6 = f5;
            j8 = j6;
            i13 = i1113;
        } else {
            kk0Var.X();
            if ((i3 & 1) != 0) {
                if (i15 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                i9 = i4 & 2;
                i03Var = i03.a;
                if (i9 != 0) {
                    circularColor = i03Var.getCircularColor(kk0Var, 6);
                    i5 &= -113;
                }
                if (i16 != 0) {
                    f3 = 4.0f;
                } else {
                    f3 = f2;
                }
                if ((i4 & 8) != 0) {
                    circularIndeterminateTrackColor = i03Var.getCircularIndeterminateTrackColor(kk0Var, 6);
                    i5 &= -7169;
                }
                int i1114 = i5;
                f4 = f3;
                j3 = circularColor;
                i10 = i1114;
                if (i6 != 0) {
                    j4 = circularIndeterminateTrackColor;
                    i11 = 1;
                } else {
                    i11 = i2;
                    j4 = circularIndeterminateTrackColor;
                }
            } else {
                if (i15 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                i9 = i4 & 2;
                i03Var = i03.a;
                if (i9 != 0) {
                    circularColor = i03Var.getCircularColor(kk0Var, 6);
                    i5 &= -113;
                }
                if (i16 != 0) {
                    f3 = 4.0f;
                } else {
                    f3 = f2;
                }
                if ((i4 & 8) != 0) {
                    circularIndeterminateTrackColor = i03Var.getCircularIndeterminateTrackColor(kk0Var, 6);
                    i5 &= -7169;
                }
                int i1115 = i5;
                f4 = f3;
                j3 = circularColor;
                i10 = i1115;
                if (i6 != 0) {
                    j4 = circularIndeterminateTrackColor;
                    i11 = 1;
                } else {
                    i11 = i2;
                    j4 = circularIndeterminateTrackColor;
                }
            }
            kk0Var.s();
            vo3Var = new vo3(i11, ((wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity())).w(f4), 0, 0.0f, 26);
            go1 go1VarRememberInfiniteTransition7 = io1.rememberInfiniteTransition(null, kk0Var, 0, 1);
            i12 = i10;
            x64 x64Var7 = mb4.b;
            u41 u41Var7 = c11.d;
            f5 = f4;
            int i1116 = i11;
            j5 = j4;
            gn3VarAnimateValue = io1.animateValue(go1VarRememberInfiniteTransition7, 0, 5, x64Var7, kr1.N(kr1.o0(6660, 0, u41Var7, 2), 6), null, kk0Var, 33208, 16);
            gn3VarAnimateFloat = io1.animateFloat(go1VarRememberInfiniteTransition7, 0.0f, 286.0f, kr1.N(kr1.o0(1332, 0, u41Var7, 2), 6), null, kk0Var, 4536, 8);
            kn4 kn4Var13 = new kn4(6);
            kn4Var13.b = 1332;
            aw1 aw1VarC7 = kn4Var13.c(fValueOf2, 0);
            zq0 zq0Var7 = i;
            aw1VarC7.b = zq0Var7;
            kn4Var13.c(fValueOf, 666);
            gn3VarAnimateFloat2 = io1.animateFloat(go1VarRememberInfiniteTransition7, 0.0f, 290.0f, kr1.N(new bw1(kn4Var13), 6), null, kk0Var, 4536, 8);
            kn4 kn4Var14 = new kn4(6);
            kn4Var14.b = 1332;
            kn4Var14.c(fValueOf2, 666).b = zq0Var7;
            kn4Var14.c(fValueOf, kn4Var14.b);
            gn3VarAnimateFloat3 = io1.animateFloat(go1VarRememberInfiniteTransition7, 0.0f, 290.0f, kr1.N(new bw1(kn4Var14), 6), null, kk0Var, 4536, 8);
            c cVarJ7 = d.j(we3.b(cVar3, true, xq2.x), d);
            boolean zJ7 = ((((i12 & 7168) ^ 3072) <= 2048 && kk0Var.g(j5)) || (i12 & 3072) == 2048) | kk0Var.j(vo3Var) | kk0Var.h(gn3VarAnimateValue) | kk0Var.h(gn3VarAnimateFloat2) | kk0Var.h(gn3VarAnimateFloat3) | kk0Var.h(gn3VarAnimateFloat);
            if ((i12 & 896) == 256) {
                z = true;
            } else {
                z = false;
            }
            z2 = z | zJ7 | ((((i12 & 112) ^ 48) <= 32 && kk0Var.g(j3)) || (i12 & 48) == 32);
            objP = kk0Var.P();
            if (z2) {
                j6 = j3;
                objP = new m03(j5, vo3Var, gn3VarAnimateValue, gn3VarAnimateFloat2, gn3VarAnimateFloat3, gn3VarAnimateFloat, f5, j6);
                kk0Var.l0(objP);
            } else {
                j6 = j3;
                objP = new m03(j5, vo3Var, gn3VarAnimateValue, gn3VarAnimateFloat2, gn3VarAnimateFloat3, gn3VarAnimateFloat, f5, j6);
                kk0Var.l0(objP);
            }
            c10.Canvas(cVarJ7, (le1) objP, kk0Var, 0);
            cVar4 = cVar3;
            j7 = j5;
            f6 = f5;
            j8 = j6;
            i13 = i1116;
        }
        w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new n03(cVar4, j8, f6, j7, i13, i3, i4));
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0046  */
    /* JADX WARN: Code duplicated, block: B:28:0x004a  */
    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    /* JADX WARN: Code duplicated, block: B:31:0x0055  */
    /* JADX WARN: Code duplicated, block: B:34:0x005b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0061  */
    /* JADX WARN: Code duplicated, block: B:39:0x0066  */
    /* JADX WARN: Code duplicated, block: B:41:0x006a  */
    /* JADX WARN: Code duplicated, block: B:43:0x0072  */
    /* JADX WARN: Code duplicated, block: B:44:0x0075  */
    /* JADX WARN: Code duplicated, block: B:48:0x007e  */
    /* JADX WARN: Code duplicated, block: B:52:0x008d  */
    /* JADX WARN: Code duplicated, block: B:54:0x0097  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ae A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:77:? A[RETURN, SYNTHETIC] */
    @cv0
    /* JADX INFO: renamed from: CircularProgressIndicator-MBs18nI, reason: not valid java name */
    public static final /* synthetic */ void m1883xc39c3a16(float f2, c cVar, long j, float f3, ck0 ck0Var, int i2, int i3) {
        float f4;
        int i4;
        c cVar2;
        long j2;
        int i5;
        float f5;
        int i6;
        int i7;
        i03 i03Var;
        c cVar3;
        long circularColor;
        float f6;
        c cVar4;
        c cVar5;
        w33 w33VarV;
        int i8;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(402841196);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
            f4 = f2;
        } else {
            f4 = f2;
            if ((i2 & 6) == 0) {
                i4 = (kk0Var.e(f4) ? 4 : 2) | i2;
            } else {
                i4 = i2;
            }
        }
        int i9 = i3 & 2;
        if (i9 == 0) {
            if ((i2 & 48) == 0) {
                cVar2 = cVar;
                i4 |= kk0Var.h(cVar2) ? 32 : 16;
            }
            if ((i2 & 384) == 0) {
                if ((i3 & 4) == 0) {
                    j2 = j;
                    if (kk0Var.g(j2)) {
                        i8 = FontInfo.NUMBER_OF_CHAR_CODES;
                    }
                    i4 |= i8;
                } else {
                    j2 = j;
                }
                i8 = Uuid.SIZE_BITS;
                i4 |= i8;
            } else {
                j2 = j;
            }
            i5 = i3 & 8;
            if (i5 != 0) {
                if ((i2 & 3072) == 0) {
                    f5 = f3;
                    if (kk0Var.e(f5)) {
                        i6 = 2048;
                    } else {
                        i6 = 1024;
                    }
                    i4 |= i6;
                }
                if ((i4 & 1171) == 1170 || !kk0Var.F()) {
                    kk0Var.X();
                    i7 = i2 & 1;
                    i03Var = i03.a;
                    if (i7 != 0 || kk0Var.D()) {
                        if (i9 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if ((i3 & 4) != 0) {
                            circularColor = i03Var.getCircularColor(kk0Var, 6);
                            i4 &= -897;
                        } else {
                            circularColor = j2;
                        }
                        if (i5 != 0) {
                            f6 = 4.0f;
                        } else {
                            f6 = f5;
                        }
                        cVar4 = cVar3;
                    } else {
                        kk0Var.V();
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                        }
                        float f7 = f5;
                        cVar4 = cVar2;
                        circularColor = j2;
                        f6 = f7;
                    }
                    kk0Var.s();
                    m1879x7647c12(f4, cVar4, circularColor, f6, i03Var.getCircularTrackColor(kk0Var, 6), 1, kk0Var, (i4 & 14) | 196608 | (i4 & 112) | (i4 & 896) | (i4 & 7168), 0);
                    cVar5 = cVar4;
                } else {
                    kk0Var.V();
                    cVar5 = cVar2;
                    circularColor = j2;
                    f6 = f5;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new q03(f2, cVar5, circularColor, f6, i2, i3));
                }
            }
            i4 |= 3072;
            f5 = f3;
            if ((i4 & 1171) == 1170) {
                kk0Var.X();
                i7 = i2 & 1;
                i03Var = i03.a;
                if (i7 != 0) {
                    if (i9 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if ((i3 & 4) != 0) {
                        circularColor = i03Var.getCircularColor(kk0Var, 6);
                        i4 &= -897;
                    } else {
                        circularColor = j2;
                    }
                    if (i5 != 0) {
                        f6 = 4.0f;
                    } else {
                        f6 = f5;
                    }
                    cVar4 = cVar3;
                } else {
                    if (i9 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if ((i3 & 4) != 0) {
                        circularColor = i03Var.getCircularColor(kk0Var, 6);
                        i4 &= -897;
                    } else {
                        circularColor = j2;
                    }
                    if (i5 != 0) {
                        f6 = 4.0f;
                    } else {
                        f6 = f5;
                    }
                    cVar4 = cVar3;
                }
                kk0Var.s();
                m1879x7647c12(f4, cVar4, circularColor, f6, i03Var.getCircularTrackColor(kk0Var, 6), 1, kk0Var, (i4 & 14) | 196608 | (i4 & 112) | (i4 & 896) | (i4 & 7168), 0);
                cVar5 = cVar4;
            } else {
                kk0Var.X();
                i7 = i2 & 1;
                i03Var = i03.a;
                if (i7 != 0) {
                    if (i9 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if ((i3 & 4) != 0) {
                        circularColor = i03Var.getCircularColor(kk0Var, 6);
                        i4 &= -897;
                    } else {
                        circularColor = j2;
                    }
                    if (i5 != 0) {
                        f6 = 4.0f;
                    } else {
                        f6 = f5;
                    }
                    cVar4 = cVar3;
                } else {
                    if (i9 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if ((i3 & 4) != 0) {
                        circularColor = i03Var.getCircularColor(kk0Var, 6);
                        i4 &= -897;
                    } else {
                        circularColor = j2;
                    }
                    if (i5 != 0) {
                        f6 = 4.0f;
                    } else {
                        f6 = f5;
                    }
                    cVar4 = cVar3;
                }
                kk0Var.s();
                m1879x7647c12(f4, cVar4, circularColor, f6, i03Var.getCircularTrackColor(kk0Var, 6), 1, kk0Var, (i4 & 14) | 196608 | (i4 & 112) | (i4 & 896) | (i4 & 7168), 0);
                cVar5 = cVar4;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new q03(f2, cVar5, circularColor, f6, i2, i3));
            }
        }
        i4 |= 48;
        cVar2 = cVar;
        if ((i2 & 384) == 0) {
            if ((i3 & 4) == 0) {
                j2 = j;
                if (kk0Var.g(j2)) {
                    i8 = FontInfo.NUMBER_OF_CHAR_CODES;
                }
                i4 |= i8;
            } else {
                j2 = j;
            }
            i8 = Uuid.SIZE_BITS;
            i4 |= i8;
        } else {
            j2 = j;
        }
        i5 = i3 & 8;
        if (i5 != 0) {
            if ((i2 & 3072) == 0) {
                f5 = f3;
                if (kk0Var.e(f5)) {
                    i6 = 2048;
                } else {
                    i6 = 1024;
                }
                i4 |= i6;
            }
            if ((i4 & 1171) == 1170) {
                kk0Var.X();
                i7 = i2 & 1;
                i03Var = i03.a;
                if (i7 != 0) {
                    if (i9 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if ((i3 & 4) != 0) {
                        circularColor = i03Var.getCircularColor(kk0Var, 6);
                        i4 &= -897;
                    } else {
                        circularColor = j2;
                    }
                    if (i5 != 0) {
                        f6 = 4.0f;
                    } else {
                        f6 = f5;
                    }
                    cVar4 = cVar3;
                } else {
                    if (i9 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if ((i3 & 4) != 0) {
                        circularColor = i03Var.getCircularColor(kk0Var, 6);
                        i4 &= -897;
                    } else {
                        circularColor = j2;
                    }
                    if (i5 != 0) {
                        f6 = 4.0f;
                    } else {
                        f6 = f5;
                    }
                    cVar4 = cVar3;
                }
                kk0Var.s();
                m1879x7647c12(f4, cVar4, circularColor, f6, i03Var.getCircularTrackColor(kk0Var, 6), 1, kk0Var, (i4 & 14) | 196608 | (i4 & 112) | (i4 & 896) | (i4 & 7168), 0);
                cVar5 = cVar4;
            } else {
                kk0Var.X();
                i7 = i2 & 1;
                i03Var = i03.a;
                if (i7 != 0) {
                    if (i9 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if ((i3 & 4) != 0) {
                        circularColor = i03Var.getCircularColor(kk0Var, 6);
                        i4 &= -897;
                    } else {
                        circularColor = j2;
                    }
                    if (i5 != 0) {
                        f6 = 4.0f;
                    } else {
                        f6 = f5;
                    }
                    cVar4 = cVar3;
                } else {
                    if (i9 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if ((i3 & 4) != 0) {
                        circularColor = i03Var.getCircularColor(kk0Var, 6);
                        i4 &= -897;
                    } else {
                        circularColor = j2;
                    }
                    if (i5 != 0) {
                        f6 = 4.0f;
                    } else {
                        f6 = f5;
                    }
                    cVar4 = cVar3;
                }
                kk0Var.s();
                m1879x7647c12(f4, cVar4, circularColor, f6, i03Var.getCircularTrackColor(kk0Var, 6), 1, kk0Var, (i4 & 14) | 196608 | (i4 & 112) | (i4 & 896) | (i4 & 7168), 0);
                cVar5 = cVar4;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new q03(f2, cVar5, circularColor, f6, i2, i3));
            }
        }
        i4 |= 3072;
        f5 = f3;
        if ((i4 & 1171) == 1170) {
            kk0Var.X();
            i7 = i2 & 1;
            i03Var = i03.a;
            if (i7 != 0) {
                if (i9 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if ((i3 & 4) != 0) {
                    circularColor = i03Var.getCircularColor(kk0Var, 6);
                    i4 &= -897;
                } else {
                    circularColor = j2;
                }
                if (i5 != 0) {
                    f6 = 4.0f;
                } else {
                    f6 = f5;
                }
                cVar4 = cVar3;
            } else {
                if (i9 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if ((i3 & 4) != 0) {
                    circularColor = i03Var.getCircularColor(kk0Var, 6);
                    i4 &= -897;
                } else {
                    circularColor = j2;
                }
                if (i5 != 0) {
                    f6 = 4.0f;
                } else {
                    f6 = f5;
                }
                cVar4 = cVar3;
            }
            kk0Var.s();
            m1879x7647c12(f4, cVar4, circularColor, f6, i03Var.getCircularTrackColor(kk0Var, 6), 1, kk0Var, (i4 & 14) | 196608 | (i4 & 112) | (i4 & 896) | (i4 & 7168), 0);
            cVar5 = cVar4;
        } else {
            kk0Var.X();
            i7 = i2 & 1;
            i03Var = i03.a;
            if (i7 != 0) {
                if (i9 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if ((i3 & 4) != 0) {
                    circularColor = i03Var.getCircularColor(kk0Var, 6);
                    i4 &= -897;
                } else {
                    circularColor = j2;
                }
                if (i5 != 0) {
                    f6 = 4.0f;
                } else {
                    f6 = f5;
                }
                cVar4 = cVar3;
            } else {
                if (i9 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if ((i3 & 4) != 0) {
                    circularColor = i03Var.getCircularColor(kk0Var, 6);
                    i4 &= -897;
                } else {
                    circularColor = j2;
                }
                if (i5 != 0) {
                    f6 = 4.0f;
                } else {
                    f6 = f5;
                }
                cVar4 = cVar3;
            }
            kk0Var.s();
            m1879x7647c12(f4, cVar4, circularColor, f6, i03Var.getCircularTrackColor(kk0Var, 6), 1, kk0Var, (i4 & 14) | 196608 | (i4 & 112) | (i4 & 896) | (i4 & 7168), 0);
            cVar5 = cVar4;
        }
        w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new q03(f2, cVar5, circularColor, f6, i2, i3));
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0073  */
    /* JADX WARN: Code duplicated, block: B:43:0x007d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0091 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x0093  */
    /* JADX WARN: Code duplicated, block: B:54:0x0096  */
    /* JADX WARN: Code duplicated, block: B:57:0x009b  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:66:? A[RETURN, SYNTHETIC] */
    @cv0
    /* JADX INFO: renamed from: CircularProgressIndicator-aM-cp0Q, reason: not valid java name */
    public static final /* synthetic */ void m1884xf49b4205(c cVar, long j, float f2, ck0 ck0Var, int i2, int i3) {
        c cVar2;
        int i4;
        long circularColor;
        float f3;
        int i5;
        i03 i03Var;
        c cVar3;
        c cVar4;
        float f4;
        long j2;
        float f5;
        w33 w33VarV;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(947193756);
        int i6 = i3 & 1;
        if (i6 != 0) {
            i4 = i2 | 6;
            cVar2 = cVar;
        } else if ((i2 & 6) == 0) {
            cVar2 = cVar;
            i4 = (kk0Var.h(cVar2) ? 4 : 2) | i2;
        } else {
            cVar2 = cVar;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            if ((i3 & 2) == 0) {
                circularColor = j;
                int i7 = kk0Var.g(circularColor) ? 32 : 16;
                i4 |= i7;
            } else {
                circularColor = j;
            }
            i4 |= i7;
        } else {
            circularColor = j;
        }
        int i8 = i3 & 4;
        if (i8 == 0) {
            if ((i2 & 384) == 0) {
                f3 = f2;
                i4 |= kk0Var.e(f3) ? FontInfo.NUMBER_OF_CHAR_CODES : Uuid.SIZE_BITS;
            }
            if ((i4 & 147) == 146 || !kk0Var.F()) {
                kk0Var.X();
                i5 = i2 & 1;
                i03Var = i03.a;
                if (i5 != 0 || kk0Var.D()) {
                    if (i6 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if ((i3 & 2) != 0) {
                        circularColor = i03Var.getCircularColor(kk0Var, 6);
                        i4 &= -113;
                    }
                    if (i8 != 0) {
                        f4 = 4.0f;
                        cVar4 = cVar3;
                    } else {
                        cVar4 = cVar3;
                    }
                    long j3 = circularColor;
                    kk0Var.s();
                    float f6 = f4;
                    m1882xe8727fba(cVar4, j3, f6, i03Var.getCircularTrackColor(kk0Var, 6), 1, kk0Var, (i4 & 14) | 24576 | (i4 & 112) | (i4 & 896), 0);
                    cVar2 = cVar4;
                    j2 = j3;
                    f5 = f6;
                } else {
                    kk0Var.V();
                    if ((i3 & 2) != 0) {
                        i4 &= -113;
                    }
                    cVar4 = cVar2;
                }
                f4 = f3;
                long j4 = circularColor;
                kk0Var.s();
                float f7 = f4;
                m1882xe8727fba(cVar4, j4, f7, i03Var.getCircularTrackColor(kk0Var, 6), 1, kk0Var, (i4 & 14) | 24576 | (i4 & 112) | (i4 & 896), 0);
                cVar2 = cVar4;
                j2 = j4;
                f5 = f7;
            } else {
                kk0Var.V();
                j2 = circularColor;
                f5 = f3;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new dx0(cVar2, j2, f5, i2, i3));
            }
        }
        i4 |= 384;
        f3 = f2;
        if ((i4 & 147) == 146) {
            kk0Var.X();
            i5 = i2 & 1;
            i03Var = i03.a;
            if (i5 != 0) {
                if (i6 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if ((i3 & 2) != 0) {
                    circularColor = i03Var.getCircularColor(kk0Var, 6);
                    i4 &= -113;
                }
                if (i8 != 0) {
                    f4 = 4.0f;
                    cVar4 = cVar3;
                } else {
                    cVar4 = cVar3;
                    f4 = f3;
                }
            } else {
                if (i6 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if ((i3 & 2) != 0) {
                    circularColor = i03Var.getCircularColor(kk0Var, 6);
                    i4 &= -113;
                }
                if (i8 != 0) {
                    f4 = 4.0f;
                    cVar4 = cVar3;
                } else {
                    cVar4 = cVar3;
                    f4 = f3;
                }
            }
            long j5 = circularColor;
            kk0Var.s();
            float f8 = f4;
            m1882xe8727fba(cVar4, j5, f8, i03Var.getCircularTrackColor(kk0Var, 6), 1, kk0Var, (i4 & 14) | 24576 | (i4 & 112) | (i4 & 896), 0);
            cVar2 = cVar4;
            j2 = j5;
            f5 = f8;
        } else {
            kk0Var.X();
            i5 = i2 & 1;
            i03Var = i03.a;
            if (i5 != 0) {
                if (i6 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if ((i3 & 2) != 0) {
                    circularColor = i03Var.getCircularColor(kk0Var, 6);
                    i4 &= -113;
                }
                if (i8 != 0) {
                    f4 = 4.0f;
                    cVar4 = cVar3;
                } else {
                    cVar4 = cVar3;
                    f4 = f3;
                }
            } else {
                if (i6 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if ((i3 & 2) != 0) {
                    circularColor = i03Var.getCircularColor(kk0Var, 6);
                    i4 &= -113;
                }
                if (i8 != 0) {
                    f4 = 4.0f;
                    cVar4 = cVar3;
                } else {
                    cVar4 = cVar3;
                    f4 = f3;
                }
            }
            long j6 = circularColor;
            kk0Var.s();
            float f9 = f4;
            m1882xe8727fba(cVar4, j6, f9, i03Var.getCircularTrackColor(kk0Var, 6), 1, kk0Var, (i4 & 14) | 24576 | (i4 & 112) | (i4 & 896), 0);
            cVar2 = cVar4;
            j2 = j6;
            f5 = f9;
        }
        w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new dx0(cVar2, j2, f5, i2, i3));
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x0090  */
    /* JADX WARN: Code duplicated, block: B:54:0x0097  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:80:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:82:? A[RETURN, SYNTHETIC] */
    @cv0
    /* JADX INFO: renamed from: LinearProgressIndicator-2cYBFYY, reason: not valid java name */
    public static final /* synthetic */ void m1885xcd94e23c(c cVar, long j, long j2, int i2, ck0 ck0Var, int i3, int i4) {
        c cVar2;
        int i5;
        long linearColor;
        long linearTrackColor;
        int i6;
        c cVar3;
        int i7;
        i03 i03Var;
        c cVar4;
        int i8;
        long j3;
        long j4;
        long j5;
        long j6;
        int i9;
        w33 w33VarV;
        int i10;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(-476865359);
        int i11 = i4 & 1;
        if (i11 != 0) {
            i5 = i3 | 6;
            cVar2 = cVar;
        } else if ((i3 & 6) == 0) {
            cVar2 = cVar;
            i5 = (kk0Var.h(cVar2) ? 4 : 2) | i3;
        } else {
            cVar2 = cVar;
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            if ((i4 & 2) == 0) {
                linearColor = j;
                int i12 = kk0Var.g(linearColor) ? 32 : 16;
                i5 |= i12;
            } else {
                linearColor = j;
            }
            i5 |= i12;
        } else {
            linearColor = j;
        }
        if ((i3 & 384) == 0) {
            if ((i4 & 4) == 0) {
                linearTrackColor = j2;
                if (kk0Var.g(linearTrackColor)) {
                    i10 = FontInfo.NUMBER_OF_CHAR_CODES;
                }
                i5 |= i10;
            } else {
                linearTrackColor = j2;
            }
            i10 = Uuid.SIZE_BITS;
            i5 |= i10;
        } else {
            linearTrackColor = j2;
        }
        int i13 = i4 & 8;
        if (i13 == 0) {
            if ((i3 & 3072) == 0) {
                i6 = i2;
                i5 |= kk0Var.f(i6) ? 2048 : 1024;
            }
            if ((i5 & 1171) == 1170 || !kk0Var.F()) {
                kk0Var.X();
                if ((i3 & 1) != 0 || kk0Var.D()) {
                    if (i11 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    i7 = i4 & 2;
                    i03Var = i03.a;
                    if (i7 != 0) {
                        linearColor = i03Var.getLinearColor(kk0Var, 6);
                        i5 &= -113;
                    }
                    if ((i4 & 4) != 0) {
                        linearTrackColor = i03Var.getLinearTrackColor(kk0Var, 6);
                        i5 &= -897;
                    }
                    if (i13 != 0) {
                        cVar4 = cVar3;
                        i8 = 1;
                        j3 = linearColor;
                        j4 = linearTrackColor;
                    } else {
                        cVar4 = cVar3;
                    }
                    kk0Var.s();
                    m1891xdc38e88f(cVar4, j3, j4, i8, 4.0f, kk0Var, (i5 & 14) | 24576 | (i5 & 112) | (i5 & 896) | (i5 & 7168), 0);
                    cVar2 = cVar4;
                    j5 = j3;
                    j6 = j4;
                    i9 = i8;
                } else {
                    kk0Var.V();
                    if ((i4 & 2) != 0) {
                        i5 &= -113;
                    }
                    if ((i4 & 4) != 0) {
                        i5 &= -897;
                    }
                    cVar4 = cVar2;
                }
                j4 = linearTrackColor;
                i8 = i6;
                j3 = linearColor;
                kk0Var.s();
                m1891xdc38e88f(cVar4, j3, j4, i8, 4.0f, kk0Var, (i5 & 14) | 24576 | (i5 & 112) | (i5 & 896) | (i5 & 7168), 0);
                cVar2 = cVar4;
                j5 = j3;
                j6 = j4;
                i9 = i8;
            } else {
                kk0Var.V();
                j5 = linearColor;
                j6 = linearTrackColor;
                i9 = i6;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new x03(cVar2, j5, j6, i9, i3, i4));
            }
        }
        i5 |= 3072;
        i6 = i2;
        if ((i5 & 1171) == 1170) {
            kk0Var.X();
            if ((i3 & 1) != 0) {
                if (i11 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                i7 = i4 & 2;
                i03Var = i03.a;
                if (i7 != 0) {
                    linearColor = i03Var.getLinearColor(kk0Var, 6);
                    i5 &= -113;
                }
                if ((i4 & 4) != 0) {
                    linearTrackColor = i03Var.getLinearTrackColor(kk0Var, 6);
                    i5 &= -897;
                }
                if (i13 != 0) {
                    cVar4 = cVar3;
                    i8 = 1;
                    j3 = linearColor;
                    j4 = linearTrackColor;
                } else {
                    cVar4 = cVar3;
                    j4 = linearTrackColor;
                    i8 = i6;
                    j3 = linearColor;
                }
            } else {
                if (i11 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                i7 = i4 & 2;
                i03Var = i03.a;
                if (i7 != 0) {
                    linearColor = i03Var.getLinearColor(kk0Var, 6);
                    i5 &= -113;
                }
                if ((i4 & 4) != 0) {
                    linearTrackColor = i03Var.getLinearTrackColor(kk0Var, 6);
                    i5 &= -897;
                }
                if (i13 != 0) {
                    cVar4 = cVar3;
                    i8 = 1;
                    j3 = linearColor;
                    j4 = linearTrackColor;
                } else {
                    cVar4 = cVar3;
                    j4 = linearTrackColor;
                    i8 = i6;
                    j3 = linearColor;
                }
            }
            kk0Var.s();
            m1891xdc38e88f(cVar4, j3, j4, i8, 4.0f, kk0Var, (i5 & 14) | 24576 | (i5 & 112) | (i5 & 896) | (i5 & 7168), 0);
            cVar2 = cVar4;
            j5 = j3;
            j6 = j4;
            i9 = i8;
        } else {
            kk0Var.X();
            if ((i3 & 1) != 0) {
                if (i11 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                i7 = i4 & 2;
                i03Var = i03.a;
                if (i7 != 0) {
                    linearColor = i03Var.getLinearColor(kk0Var, 6);
                    i5 &= -113;
                }
                if ((i4 & 4) != 0) {
                    linearTrackColor = i03Var.getLinearTrackColor(kk0Var, 6);
                    i5 &= -897;
                }
                if (i13 != 0) {
                    cVar4 = cVar3;
                    i8 = 1;
                    j3 = linearColor;
                    j4 = linearTrackColor;
                } else {
                    cVar4 = cVar3;
                    j4 = linearTrackColor;
                    i8 = i6;
                    j3 = linearColor;
                }
            } else {
                if (i11 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                i7 = i4 & 2;
                i03Var = i03.a;
                if (i7 != 0) {
                    linearColor = i03Var.getLinearColor(kk0Var, 6);
                    i5 &= -113;
                }
                if ((i4 & 4) != 0) {
                    linearTrackColor = i03Var.getLinearTrackColor(kk0Var, 6);
                    i5 &= -897;
                }
                if (i13 != 0) {
                    cVar4 = cVar3;
                    i8 = 1;
                    j3 = linearColor;
                    j4 = linearTrackColor;
                } else {
                    cVar4 = cVar3;
                    j4 = linearTrackColor;
                    i8 = i6;
                    j3 = linearColor;
                }
            }
            kk0Var.s();
            m1891xdc38e88f(cVar4, j3, j4, i8, 4.0f, kk0Var, (i5 & 14) | 24576 | (i5 & 112) | (i5 & 896) | (i5 & 7168), 0);
            cVar2 = cVar4;
            j5 = j3;
            j6 = j4;
            i9 = i8;
        }
        w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new x03(cVar2, j5, j6, i9, i3, i4));
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0122  */
    /* JADX WARN: Code duplicated, block: B:103:0x012a  */
    /* JADX WARN: Code duplicated, block: B:106:0x012f  */
    /* JADX WARN: Code duplicated, block: B:108:0x0137  */
    /* JADX WARN: Code duplicated, block: B:110:0x013a  */
    /* JADX WARN: Code duplicated, block: B:111:0x013d  */
    /* JADX WARN: Code duplicated, block: B:114:0x0142  */
    /* JADX WARN: Code duplicated, block: B:116:0x014a  */
    /* JADX WARN: Code duplicated, block: B:118:0x0150  */
    /* JADX WARN: Code duplicated, block: B:124:0x015d  */
    /* JADX WARN: Code duplicated, block: B:125:0x015f  */
    /* JADX WARN: Code duplicated, block: B:128:0x0167  */
    /* JADX WARN: Code duplicated, block: B:130:0x016d  */
    /* JADX WARN: Code duplicated, block: B:135:0x0185  */
    /* JADX WARN: Code duplicated, block: B:136:0x0187  */
    /* JADX WARN: Code duplicated, block: B:139:0x018e  */
    /* JADX WARN: Code duplicated, block: B:141:0x0194  */
    /* JADX WARN: Code duplicated, block: B:144:0x01af  */
    /* JADX WARN: Code duplicated, block: B:146:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:149:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:150:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:153:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:154:0x01de  */
    /* JADX WARN: Code duplicated, block: B:157:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:159:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:165:0x0203  */
    /* JADX WARN: Code duplicated, block: B:167:0x0209  */
    /* JADX WARN: Code duplicated, block: B:173:0x021a  */
    /* JADX WARN: Code duplicated, block: B:175:0x0220  */
    /* JADX WARN: Code duplicated, block: B:181:0x022e  */
    /* JADX WARN: Code duplicated, block: B:185:0x023c  */
    /* JADX WARN: Code duplicated, block: B:189:0x0265  */
    /* JADX WARN: Code duplicated, block: B:191:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0044  */
    /* JADX WARN: Code duplicated, block: B:31:0x0053  */
    /* JADX WARN: Code duplicated, block: B:33:0x0057  */
    /* JADX WARN: Code duplicated, block: B:36:0x005d  */
    /* JADX WARN: Code duplicated, block: B:41:0x006c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0070  */
    /* JADX WARN: Code duplicated, block: B:46:0x0076  */
    /* JADX WARN: Code duplicated, block: B:48:0x007b  */
    /* JADX WARN: Code duplicated, block: B:50:0x007f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0087  */
    /* JADX WARN: Code duplicated, block: B:53:0x008a  */
    /* JADX WARN: Code duplicated, block: B:57:0x0094  */
    /* JADX WARN: Code duplicated, block: B:58:0x0099  */
    /* JADX WARN: Code duplicated, block: B:60:0x009f  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:97:0x0116 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:98:0x0118  */
    /* JADX WARN: Code duplicated, block: B:99:0x011b  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: LinearProgressIndicator-GJbTh5U, reason: not valid java name */
    public static final void m1886xfa561483(je1 je1Var, c cVar, long j, long j2, int i2, float f2, le1 le1Var, ck0 ck0Var, int i3, int i4) {
        int i5;
        c cVar2;
        long linearColor;
        long linearTrackColor;
        int i6;
        int i7;
        int i8;
        int i9;
        float f3;
        int i10;
        le1 le1Var2;
        c cVar3;
        int i11;
        i03 i03Var;
        int i12;
        float f4;
        float f5;
        boolean z;
        boolean z2;
        Object objP;
        int i13;
        boolean z3;
        Object objP2;
        je1 je1Var2;
        boolean zH;
        Object objP3;
        boolean z4;
        boolean z5;
        boolean z6;
        Object objP4;
        le1 le1Var3;
        long j3;
        long j4;
        c cVar4;
        int i14;
        float f6;
        long j5;
        long j6;
        le1 le1Var4;
        w33 w33VarV;
        int i15;
        int i16;
        int i17;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(-339970038);
        if ((i4 & 1) != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i5 = (kk0Var.j(je1Var) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        int i18 = i4 & 2;
        if (i18 == 0) {
            if ((i3 & 48) == 0) {
                cVar2 = cVar;
                i5 |= kk0Var.h(cVar2) ? 32 : 16;
            }
            if ((i3 & 384) == 0) {
                linearColor = j;
                if ((i4 & 4) == 0 || !kk0Var.g(linearColor)) {
                    i17 = Uuid.SIZE_BITS;
                } else {
                    i17 = FontInfo.NUMBER_OF_CHAR_CODES;
                }
                i5 |= i17;
            } else {
                linearColor = j;
            }
            if ((i3 & 3072) == 0) {
                linearTrackColor = j2;
                if ((i4 & 8) == 0 || !kk0Var.g(linearTrackColor)) {
                    i16 = 1024;
                } else {
                    i16 = 2048;
                }
                i5 |= i16;
            } else {
                linearTrackColor = j2;
            }
            i6 = i4 & 16;
            if (i6 != 0) {
                if ((i3 & 24576) == 0) {
                    i7 = i2;
                    if (kk0Var.f(i7)) {
                        i8 = 16384;
                    } else {
                        i8 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                    }
                    i5 |= i8;
                }
                i9 = i4 & 32;
                if (i9 != 0) {
                    i5 |= 196608;
                    f3 = f2;
                } else {
                    f3 = f2;
                    if ((i3 & 196608) == 0) {
                        if (kk0Var.e(f3)) {
                            i10 = 131072;
                        } else {
                            i10 = 65536;
                        }
                        i5 |= i10;
                    }
                }
                if ((i3 & 1572864) == 0) {
                    le1Var2 = le1Var;
                    if ((i4 & 64) == 0 || !kk0Var.j(le1Var2)) {
                        i15 = 524288;
                    } else {
                        i15 = 1048576;
                    }
                    i5 |= i15;
                } else {
                    le1Var2 = le1Var;
                }
                if ((i5 & 599187) == 599186 || !kk0Var.F()) {
                    kk0Var.X();
                    boolean z7 = true;
                    if ((i3 & 1) != 0 || kk0Var.D()) {
                        if (i18 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        i11 = i4 & 4;
                        i03Var = i03.a;
                        if (i11 != 0) {
                            i12 = 6;
                            linearColor = i03Var.getLinearColor(kk0Var, 6);
                            i5 &= -897;
                        } else {
                            i12 = 6;
                        }
                        if ((i4 & 8) != 0) {
                            linearTrackColor = i03Var.getLinearTrackColor(kk0Var, i12);
                            i5 &= -7169;
                        }
                        if (i6 != 0) {
                            i7 = 1;
                        }
                        if (i9 != 0) {
                            f4 = 4.0f;
                        } else {
                            f4 = f3;
                        }
                        if ((i4 & 64) != 0) {
                            boolean z8 = (((i5 & 896) ^ 384) <= 256 && kk0Var.g(linearColor)) || (i5 & 384) == 256;
                            if ((i5 & 57344) == 16384) {
                                z = true;
                            } else {
                                z = false;
                            }
                            z2 = z8 | z;
                            objP = kk0Var.P();
                            if (z2 || objP == Composer$Companion.getEmpty()) {
                                objP = new u03(linearColor, i7);
                                kk0Var.l0(objP);
                            }
                            le1Var2 = (le1) objP;
                            i5 &= -3670017;
                        }
                        f5 = f4;
                    } else {
                        kk0Var.V();
                        if ((i4 & 4) != 0) {
                            i5 &= -897;
                        }
                        if ((i4 & 8) != 0) {
                            i5 &= -7169;
                        }
                        if ((i4 & 64) != 0) {
                            i5 &= -3670017;
                        }
                        cVar3 = cVar2;
                        f5 = f3;
                    }
                    i13 = i7;
                    kk0Var.s();
                    if ((i5 & 14) == 4) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    objP2 = kk0Var.P();
                    if (z3 || objP2 == Composer$Companion.getEmpty()) {
                        objP2 = new gh1(je1Var, 6);
                        kk0Var.l0(objP2);
                    }
                    je1Var2 = (je1) objP2;
                    c cVarThen = cVar3.then(a);
                    zH = kk0Var.h(je1Var2);
                    objP3 = kk0Var.P();
                    if (zH || objP3 == Composer$Companion.getEmpty()) {
                        objP3 = new oy0(je1Var2, 5);
                        kk0Var.l0(objP3);
                    }
                    c cVarK = d.k(we3.b(cVarThen, true, (le1) objP3), b, c);
                    if ((i5 & 57344) == 16384) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if ((458752 & i5) == 131072) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    boolean zH2 = z4 | z5 | kk0Var.h(je1Var2) | ((((i5 & 7168) ^ 3072) <= 2048 && kk0Var.g(linearTrackColor)) || (i5 & 3072) == 2048) | ((((i5 & 896) ^ 384) <= 256 && kk0Var.g(linearColor)) || (i5 & 384) == 256);
                    if ((((3670016 & i5) ^ 1572864) > 1048576 || !kk0Var.h(le1Var2)) && (i5 & 1572864) != 1048576) {
                    }
                    z6 = zH2 | z7;
                    objP4 = kk0Var.P();
                    if (!z6 || objP4 == Composer$Companion.getEmpty()) {
                        le1Var3 = le1Var2;
                        j3 = linearColor;
                        j4 = linearTrackColor;
                        objP4 = new v03(i13, f5, je1Var2, j4, j3, le1Var3);
                        kk0Var.l0(objP4);
                    } else {
                        le1Var3 = le1Var2;
                        j3 = linearColor;
                        j4 = linearTrackColor;
                    }
                    c10.Canvas(cVarK, (le1) objP4, kk0Var, 0);
                    cVar4 = cVar3;
                    i14 = i13;
                    f6 = f5;
                    j5 = j4;
                    j6 = j3;
                    le1Var4 = le1Var3;
                } else {
                    kk0Var.V();
                    le1Var4 = le1Var2;
                    j6 = linearColor;
                    cVar4 = cVar2;
                    f6 = f3;
                    j5 = linearTrackColor;
                    i14 = i7;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new w03(je1Var, cVar4, j6, j5, i14, f6, le1Var4, i3, i4));
                }
            }
            i5 |= 24576;
            i7 = i2;
            i9 = i4 & 32;
            if (i9 != 0) {
                i5 |= 196608;
                f3 = f2;
            } else {
                f3 = f2;
                if ((i3 & 196608) == 0) {
                    if (kk0Var.e(f3)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                    i5 |= i10;
                }
            }
            if ((i3 & 1572864) == 0) {
                le1Var2 = le1Var;
                if ((i4 & 64) == 0) {
                    i15 = 524288;
                } else {
                    i15 = 524288;
                }
                i5 |= i15;
            } else {
                le1Var2 = le1Var;
            }
            if ((i5 & 599187) == 599186) {
                kk0Var.X();
                boolean z9 = true;
                if ((i3 & 1) != 0) {
                    if (i18 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    i11 = i4 & 4;
                    i03Var = i03.a;
                    if (i11 != 0) {
                        i12 = 6;
                        linearColor = i03Var.getLinearColor(kk0Var, 6);
                        i5 &= -897;
                    } else {
                        i12 = 6;
                    }
                    if ((i4 & 8) != 0) {
                        linearTrackColor = i03Var.getLinearTrackColor(kk0Var, i12);
                        i5 &= -7169;
                    }
                    if (i6 != 0) {
                        i7 = 1;
                    }
                    if (i9 != 0) {
                        f4 = 4.0f;
                    } else {
                        f4 = f3;
                    }
                    if ((i4 & 64) != 0) {
                        if (((i5 & 896) ^ 384) <= 256) {
                        }
                        if ((i5 & 57344) == 16384) {
                            z = true;
                        } else {
                            z = false;
                        }
                        z2 = z8 | z;
                        objP = kk0Var.P();
                        if (z2) {
                            objP = new u03(linearColor, i7);
                            kk0Var.l0(objP);
                        } else {
                            objP = new u03(linearColor, i7);
                            kk0Var.l0(objP);
                        }
                        le1Var2 = (le1) objP;
                        i5 &= -3670017;
                    }
                    f5 = f4;
                } else {
                    if (i18 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    i11 = i4 & 4;
                    i03Var = i03.a;
                    if (i11 != 0) {
                        i12 = 6;
                        linearColor = i03Var.getLinearColor(kk0Var, 6);
                        i5 &= -897;
                    } else {
                        i12 = 6;
                    }
                    if ((i4 & 8) != 0) {
                        linearTrackColor = i03Var.getLinearTrackColor(kk0Var, i12);
                        i5 &= -7169;
                    }
                    if (i6 != 0) {
                        i7 = 1;
                    }
                    if (i9 != 0) {
                        f4 = 4.0f;
                    } else {
                        f4 = f3;
                    }
                    if ((i4 & 64) != 0) {
                        if (((i5 & 896) ^ 384) <= 256) {
                        }
                        if ((i5 & 57344) == 16384) {
                            z = true;
                        } else {
                            z = false;
                        }
                        z2 = z8 | z;
                        objP = kk0Var.P();
                        if (z2) {
                            objP = new u03(linearColor, i7);
                            kk0Var.l0(objP);
                        } else {
                            objP = new u03(linearColor, i7);
                            kk0Var.l0(objP);
                        }
                        le1Var2 = (le1) objP;
                        i5 &= -3670017;
                    }
                    f5 = f4;
                }
                i13 = i7;
                kk0Var.s();
                if ((i5 & 14) == 4) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                objP2 = kk0Var.P();
                if (z3) {
                    objP2 = new gh1(je1Var, 6);
                    kk0Var.l0(objP2);
                } else {
                    objP2 = new gh1(je1Var, 6);
                    kk0Var.l0(objP2);
                }
                je1Var2 = (je1) objP2;
                c cVarThen2 = cVar3.then(a);
                zH = kk0Var.h(je1Var2);
                objP3 = kk0Var.P();
                if (zH) {
                    objP3 = new oy0(je1Var2, 5);
                    kk0Var.l0(objP3);
                } else {
                    objP3 = new oy0(je1Var2, 5);
                    kk0Var.l0(objP3);
                }
                c cVarK2 = d.k(we3.b(cVarThen2, true, (le1) objP3), b, c);
                if ((i5 & 57344) == 16384) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if ((458752 & i5) == 131072) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                boolean zH3 = z4 | z5 | kk0Var.h(je1Var2) | ((((i5 & 7168) ^ 3072) <= 2048 && kk0Var.g(linearTrackColor)) || (i5 & 3072) == 2048) | ((((i5 & 896) ^ 384) <= 256 && kk0Var.g(linearColor)) || (i5 & 384) == 256);
                z9 = ((3670016 & i5) ^ 1572864) > 1048576 ? false : false;
                z6 = zH3 | z9;
                objP4 = kk0Var.P();
                if (z6) {
                    le1Var3 = le1Var2;
                    j3 = linearColor;
                    j4 = linearTrackColor;
                    objP4 = new v03(i13, f5, je1Var2, j4, j3, le1Var3);
                    kk0Var.l0(objP4);
                } else {
                    le1Var3 = le1Var2;
                    j3 = linearColor;
                    j4 = linearTrackColor;
                    objP4 = new v03(i13, f5, je1Var2, j4, j3, le1Var3);
                    kk0Var.l0(objP4);
                }
                c10.Canvas(cVarK2, (le1) objP4, kk0Var, 0);
                cVar4 = cVar3;
                i14 = i13;
                f6 = f5;
                j5 = j4;
                j6 = j3;
                le1Var4 = le1Var3;
            } else {
                kk0Var.X();
                boolean z10 = true;
                if ((i3 & 1) != 0) {
                    if (i18 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    i11 = i4 & 4;
                    i03Var = i03.a;
                    if (i11 != 0) {
                        i12 = 6;
                        linearColor = i03Var.getLinearColor(kk0Var, 6);
                        i5 &= -897;
                    } else {
                        i12 = 6;
                    }
                    if ((i4 & 8) != 0) {
                        linearTrackColor = i03Var.getLinearTrackColor(kk0Var, i12);
                        i5 &= -7169;
                    }
                    if (i6 != 0) {
                        i7 = 1;
                    }
                    if (i9 != 0) {
                        f4 = 4.0f;
                    } else {
                        f4 = f3;
                    }
                    if ((i4 & 64) != 0) {
                        if (((i5 & 896) ^ 384) <= 256) {
                        }
                        if ((i5 & 57344) == 16384) {
                            z = true;
                        } else {
                            z = false;
                        }
                        z2 = z8 | z;
                        objP = kk0Var.P();
                        if (z2) {
                            objP = new u03(linearColor, i7);
                            kk0Var.l0(objP);
                        } else {
                            objP = new u03(linearColor, i7);
                            kk0Var.l0(objP);
                        }
                        le1Var2 = (le1) objP;
                        i5 &= -3670017;
                    }
                    f5 = f4;
                } else {
                    if (i18 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    i11 = i4 & 4;
                    i03Var = i03.a;
                    if (i11 != 0) {
                        i12 = 6;
                        linearColor = i03Var.getLinearColor(kk0Var, 6);
                        i5 &= -897;
                    } else {
                        i12 = 6;
                    }
                    if ((i4 & 8) != 0) {
                        linearTrackColor = i03Var.getLinearTrackColor(kk0Var, i12);
                        i5 &= -7169;
                    }
                    if (i6 != 0) {
                        i7 = 1;
                    }
                    if (i9 != 0) {
                        f4 = 4.0f;
                    } else {
                        f4 = f3;
                    }
                    if ((i4 & 64) != 0) {
                        if (((i5 & 896) ^ 384) <= 256) {
                        }
                        if ((i5 & 57344) == 16384) {
                            z = true;
                        } else {
                            z = false;
                        }
                        z2 = z8 | z;
                        objP = kk0Var.P();
                        if (z2) {
                            objP = new u03(linearColor, i7);
                            kk0Var.l0(objP);
                        } else {
                            objP = new u03(linearColor, i7);
                            kk0Var.l0(objP);
                        }
                        le1Var2 = (le1) objP;
                        i5 &= -3670017;
                    }
                    f5 = f4;
                }
                i13 = i7;
                kk0Var.s();
                if ((i5 & 14) == 4) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                objP2 = kk0Var.P();
                if (z3) {
                    objP2 = new gh1(je1Var, 6);
                    kk0Var.l0(objP2);
                } else {
                    objP2 = new gh1(je1Var, 6);
                    kk0Var.l0(objP2);
                }
                je1Var2 = (je1) objP2;
                c cVarThen3 = cVar3.then(a);
                zH = kk0Var.h(je1Var2);
                objP3 = kk0Var.P();
                if (zH) {
                    objP3 = new oy0(je1Var2, 5);
                    kk0Var.l0(objP3);
                } else {
                    objP3 = new oy0(je1Var2, 5);
                    kk0Var.l0(objP3);
                }
                c cVarK3 = d.k(we3.b(cVarThen3, true, (le1) objP3), b, c);
                if ((i5 & 57344) == 16384) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if ((458752 & i5) == 131072) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                boolean zH4 = z4 | z5 | kk0Var.h(je1Var2) | ((((i5 & 7168) ^ 3072) <= 2048 && kk0Var.g(linearTrackColor)) || (i5 & 3072) == 2048) | ((((i5 & 896) ^ 384) <= 256 && kk0Var.g(linearColor)) || (i5 & 384) == 256);
                if (((3670016 & i5) ^ 1572864) > 1048576) {
                }
                z6 = zH4 | z10;
                objP4 = kk0Var.P();
                if (z6) {
                    le1Var3 = le1Var2;
                    j3 = linearColor;
                    j4 = linearTrackColor;
                    objP4 = new v03(i13, f5, je1Var2, j4, j3, le1Var3);
                    kk0Var.l0(objP4);
                } else {
                    le1Var3 = le1Var2;
                    j3 = linearColor;
                    j4 = linearTrackColor;
                    objP4 = new v03(i13, f5, je1Var2, j4, j3, le1Var3);
                    kk0Var.l0(objP4);
                }
                c10.Canvas(cVarK3, (le1) objP4, kk0Var, 0);
                cVar4 = cVar3;
                i14 = i13;
                f6 = f5;
                j5 = j4;
                j6 = j3;
                le1Var4 = le1Var3;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new w03(je1Var, cVar4, j6, j5, i14, f6, le1Var4, i3, i4));
            }
        }
        i5 |= 48;
        cVar2 = cVar;
        if ((i3 & 384) == 0) {
            linearColor = j;
            if ((i4 & 4) == 0) {
                i17 = Uuid.SIZE_BITS;
            } else {
                i17 = Uuid.SIZE_BITS;
            }
            i5 |= i17;
        } else {
            linearColor = j;
        }
        if ((i3 & 3072) == 0) {
            linearTrackColor = j2;
            if ((i4 & 8) == 0) {
                i16 = 1024;
            } else {
                i16 = 1024;
            }
            i5 |= i16;
        } else {
            linearTrackColor = j2;
        }
        i6 = i4 & 16;
        if (i6 != 0) {
            if ((i3 & 24576) == 0) {
                i7 = i2;
                if (kk0Var.f(i7)) {
                    i8 = 16384;
                } else {
                    i8 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                }
                i5 |= i8;
            }
            i9 = i4 & 32;
            if (i9 != 0) {
                i5 |= 196608;
                f3 = f2;
            } else {
                f3 = f2;
                if ((i3 & 196608) == 0) {
                    if (kk0Var.e(f3)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                    i5 |= i10;
                }
            }
            if ((i3 & 1572864) == 0) {
                le1Var2 = le1Var;
                if ((i4 & 64) == 0) {
                    i15 = 524288;
                } else {
                    i15 = 524288;
                }
                i5 |= i15;
            } else {
                le1Var2 = le1Var;
            }
            if ((i5 & 599187) == 599186) {
                kk0Var.X();
                boolean z11 = true;
                if ((i3 & 1) != 0) {
                    if (i18 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    i11 = i4 & 4;
                    i03Var = i03.a;
                    if (i11 != 0) {
                        i12 = 6;
                        linearColor = i03Var.getLinearColor(kk0Var, 6);
                        i5 &= -897;
                    } else {
                        i12 = 6;
                    }
                    if ((i4 & 8) != 0) {
                        linearTrackColor = i03Var.getLinearTrackColor(kk0Var, i12);
                        i5 &= -7169;
                    }
                    if (i6 != 0) {
                        i7 = 1;
                    }
                    if (i9 != 0) {
                        f4 = 4.0f;
                    } else {
                        f4 = f3;
                    }
                    if ((i4 & 64) != 0) {
                        if (((i5 & 896) ^ 384) <= 256) {
                        }
                        if ((i5 & 57344) == 16384) {
                            z = true;
                        } else {
                            z = false;
                        }
                        z2 = z8 | z;
                        objP = kk0Var.P();
                        if (z2) {
                            objP = new u03(linearColor, i7);
                            kk0Var.l0(objP);
                        } else {
                            objP = new u03(linearColor, i7);
                            kk0Var.l0(objP);
                        }
                        le1Var2 = (le1) objP;
                        i5 &= -3670017;
                    }
                    f5 = f4;
                } else {
                    if (i18 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    i11 = i4 & 4;
                    i03Var = i03.a;
                    if (i11 != 0) {
                        i12 = 6;
                        linearColor = i03Var.getLinearColor(kk0Var, 6);
                        i5 &= -897;
                    } else {
                        i12 = 6;
                    }
                    if ((i4 & 8) != 0) {
                        linearTrackColor = i03Var.getLinearTrackColor(kk0Var, i12);
                        i5 &= -7169;
                    }
                    if (i6 != 0) {
                        i7 = 1;
                    }
                    if (i9 != 0) {
                        f4 = 4.0f;
                    } else {
                        f4 = f3;
                    }
                    if ((i4 & 64) != 0) {
                        if (((i5 & 896) ^ 384) <= 256) {
                        }
                        if ((i5 & 57344) == 16384) {
                            z = true;
                        } else {
                            z = false;
                        }
                        z2 = z8 | z;
                        objP = kk0Var.P();
                        if (z2) {
                            objP = new u03(linearColor, i7);
                            kk0Var.l0(objP);
                        } else {
                            objP = new u03(linearColor, i7);
                            kk0Var.l0(objP);
                        }
                        le1Var2 = (le1) objP;
                        i5 &= -3670017;
                    }
                    f5 = f4;
                }
                i13 = i7;
                kk0Var.s();
                if ((i5 & 14) == 4) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                objP2 = kk0Var.P();
                if (z3) {
                    objP2 = new gh1(je1Var, 6);
                    kk0Var.l0(objP2);
                } else {
                    objP2 = new gh1(je1Var, 6);
                    kk0Var.l0(objP2);
                }
                je1Var2 = (je1) objP2;
                c cVarThen4 = cVar3.then(a);
                zH = kk0Var.h(je1Var2);
                objP3 = kk0Var.P();
                if (zH) {
                    objP3 = new oy0(je1Var2, 5);
                    kk0Var.l0(objP3);
                } else {
                    objP3 = new oy0(je1Var2, 5);
                    kk0Var.l0(objP3);
                }
                c cVarK4 = d.k(we3.b(cVarThen4, true, (le1) objP3), b, c);
                if ((i5 & 57344) == 16384) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if ((458752 & i5) == 131072) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                boolean zH5 = z4 | z5 | kk0Var.h(je1Var2) | ((((i5 & 7168) ^ 3072) <= 2048 && kk0Var.g(linearTrackColor)) || (i5 & 3072) == 2048) | ((((i5 & 896) ^ 384) <= 256 && kk0Var.g(linearColor)) || (i5 & 384) == 256);
                if (((3670016 & i5) ^ 1572864) > 1048576) {
                }
                z6 = zH5 | z11;
                objP4 = kk0Var.P();
                if (z6) {
                    le1Var3 = le1Var2;
                    j3 = linearColor;
                    j4 = linearTrackColor;
                    objP4 = new v03(i13, f5, je1Var2, j4, j3, le1Var3);
                    kk0Var.l0(objP4);
                } else {
                    le1Var3 = le1Var2;
                    j3 = linearColor;
                    j4 = linearTrackColor;
                    objP4 = new v03(i13, f5, je1Var2, j4, j3, le1Var3);
                    kk0Var.l0(objP4);
                }
                c10.Canvas(cVarK4, (le1) objP4, kk0Var, 0);
                cVar4 = cVar3;
                i14 = i13;
                f6 = f5;
                j5 = j4;
                j6 = j3;
                le1Var4 = le1Var3;
            } else {
                kk0Var.X();
                boolean z12 = true;
                if ((i3 & 1) != 0) {
                    if (i18 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    i11 = i4 & 4;
                    i03Var = i03.a;
                    if (i11 != 0) {
                        i12 = 6;
                        linearColor = i03Var.getLinearColor(kk0Var, 6);
                        i5 &= -897;
                    } else {
                        i12 = 6;
                    }
                    if ((i4 & 8) != 0) {
                        linearTrackColor = i03Var.getLinearTrackColor(kk0Var, i12);
                        i5 &= -7169;
                    }
                    if (i6 != 0) {
                        i7 = 1;
                    }
                    if (i9 != 0) {
                        f4 = 4.0f;
                    } else {
                        f4 = f3;
                    }
                    if ((i4 & 64) != 0) {
                        if (((i5 & 896) ^ 384) <= 256) {
                        }
                        if ((i5 & 57344) == 16384) {
                            z = true;
                        } else {
                            z = false;
                        }
                        z2 = z8 | z;
                        objP = kk0Var.P();
                        if (z2) {
                            objP = new u03(linearColor, i7);
                            kk0Var.l0(objP);
                        } else {
                            objP = new u03(linearColor, i7);
                            kk0Var.l0(objP);
                        }
                        le1Var2 = (le1) objP;
                        i5 &= -3670017;
                    }
                    f5 = f4;
                } else {
                    if (i18 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    i11 = i4 & 4;
                    i03Var = i03.a;
                    if (i11 != 0) {
                        i12 = 6;
                        linearColor = i03Var.getLinearColor(kk0Var, 6);
                        i5 &= -897;
                    } else {
                        i12 = 6;
                    }
                    if ((i4 & 8) != 0) {
                        linearTrackColor = i03Var.getLinearTrackColor(kk0Var, i12);
                        i5 &= -7169;
                    }
                    if (i6 != 0) {
                        i7 = 1;
                    }
                    if (i9 != 0) {
                        f4 = 4.0f;
                    } else {
                        f4 = f3;
                    }
                    if ((i4 & 64) != 0) {
                        if (((i5 & 896) ^ 384) <= 256) {
                        }
                        if ((i5 & 57344) == 16384) {
                            z = true;
                        } else {
                            z = false;
                        }
                        z2 = z8 | z;
                        objP = kk0Var.P();
                        if (z2) {
                            objP = new u03(linearColor, i7);
                            kk0Var.l0(objP);
                        } else {
                            objP = new u03(linearColor, i7);
                            kk0Var.l0(objP);
                        }
                        le1Var2 = (le1) objP;
                        i5 &= -3670017;
                    }
                    f5 = f4;
                }
                i13 = i7;
                kk0Var.s();
                if ((i5 & 14) == 4) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                objP2 = kk0Var.P();
                if (z3) {
                    objP2 = new gh1(je1Var, 6);
                    kk0Var.l0(objP2);
                } else {
                    objP2 = new gh1(je1Var, 6);
                    kk0Var.l0(objP2);
                }
                je1Var2 = (je1) objP2;
                c cVarThen5 = cVar3.then(a);
                zH = kk0Var.h(je1Var2);
                objP3 = kk0Var.P();
                if (zH) {
                    objP3 = new oy0(je1Var2, 5);
                    kk0Var.l0(objP3);
                } else {
                    objP3 = new oy0(je1Var2, 5);
                    kk0Var.l0(objP3);
                }
                c cVarK5 = d.k(we3.b(cVarThen5, true, (le1) objP3), b, c);
                if ((i5 & 57344) == 16384) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if ((458752 & i5) == 131072) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                boolean zH6 = z4 | z5 | kk0Var.h(je1Var2) | ((((i5 & 7168) ^ 3072) <= 2048 && kk0Var.g(linearTrackColor)) || (i5 & 3072) == 2048) | ((((i5 & 896) ^ 384) <= 256 && kk0Var.g(linearColor)) || (i5 & 384) == 256);
                if (((3670016 & i5) ^ 1572864) > 1048576) {
                }
                z6 = zH6 | z12;
                objP4 = kk0Var.P();
                if (z6) {
                    le1Var3 = le1Var2;
                    j3 = linearColor;
                    j4 = linearTrackColor;
                    objP4 = new v03(i13, f5, je1Var2, j4, j3, le1Var3);
                    kk0Var.l0(objP4);
                } else {
                    le1Var3 = le1Var2;
                    j3 = linearColor;
                    j4 = linearTrackColor;
                    objP4 = new v03(i13, f5, je1Var2, j4, j3, le1Var3);
                    kk0Var.l0(objP4);
                }
                c10.Canvas(cVarK5, (le1) objP4, kk0Var, 0);
                cVar4 = cVar3;
                i14 = i13;
                f6 = f5;
                j5 = j4;
                j6 = j3;
                le1Var4 = le1Var3;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new w03(je1Var, cVar4, j6, j5, i14, f6, le1Var4, i3, i4));
            }
        }
        i5 |= 24576;
        i7 = i2;
        i9 = i4 & 32;
        if (i9 != 0) {
            i5 |= 196608;
            f3 = f2;
        } else {
            f3 = f2;
            if ((i3 & 196608) == 0) {
                if (kk0Var.e(f3)) {
                    i10 = 131072;
                } else {
                    i10 = 65536;
                }
                i5 |= i10;
            }
        }
        if ((i3 & 1572864) == 0) {
            le1Var2 = le1Var;
            if ((i4 & 64) == 0) {
                i15 = 524288;
            } else {
                i15 = 524288;
            }
            i5 |= i15;
        } else {
            le1Var2 = le1Var;
        }
        if ((i5 & 599187) == 599186) {
            kk0Var.X();
            boolean z13 = true;
            if ((i3 & 1) != 0) {
                if (i18 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                i11 = i4 & 4;
                i03Var = i03.a;
                if (i11 != 0) {
                    i12 = 6;
                    linearColor = i03Var.getLinearColor(kk0Var, 6);
                    i5 &= -897;
                } else {
                    i12 = 6;
                }
                if ((i4 & 8) != 0) {
                    linearTrackColor = i03Var.getLinearTrackColor(kk0Var, i12);
                    i5 &= -7169;
                }
                if (i6 != 0) {
                    i7 = 1;
                }
                if (i9 != 0) {
                    f4 = 4.0f;
                } else {
                    f4 = f3;
                }
                if ((i4 & 64) != 0) {
                    if (((i5 & 896) ^ 384) <= 256) {
                    }
                    if ((i5 & 57344) == 16384) {
                        z = true;
                    } else {
                        z = false;
                    }
                    z2 = z8 | z;
                    objP = kk0Var.P();
                    if (z2) {
                        objP = new u03(linearColor, i7);
                        kk0Var.l0(objP);
                    } else {
                        objP = new u03(linearColor, i7);
                        kk0Var.l0(objP);
                    }
                    le1Var2 = (le1) objP;
                    i5 &= -3670017;
                }
                f5 = f4;
            } else {
                if (i18 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                i11 = i4 & 4;
                i03Var = i03.a;
                if (i11 != 0) {
                    i12 = 6;
                    linearColor = i03Var.getLinearColor(kk0Var, 6);
                    i5 &= -897;
                } else {
                    i12 = 6;
                }
                if ((i4 & 8) != 0) {
                    linearTrackColor = i03Var.getLinearTrackColor(kk0Var, i12);
                    i5 &= -7169;
                }
                if (i6 != 0) {
                    i7 = 1;
                }
                if (i9 != 0) {
                    f4 = 4.0f;
                } else {
                    f4 = f3;
                }
                if ((i4 & 64) != 0) {
                    if (((i5 & 896) ^ 384) <= 256) {
                    }
                    if ((i5 & 57344) == 16384) {
                        z = true;
                    } else {
                        z = false;
                    }
                    z2 = z8 | z;
                    objP = kk0Var.P();
                    if (z2) {
                        objP = new u03(linearColor, i7);
                        kk0Var.l0(objP);
                    } else {
                        objP = new u03(linearColor, i7);
                        kk0Var.l0(objP);
                    }
                    le1Var2 = (le1) objP;
                    i5 &= -3670017;
                }
                f5 = f4;
            }
            i13 = i7;
            kk0Var.s();
            if ((i5 & 14) == 4) {
                z3 = true;
            } else {
                z3 = false;
            }
            objP2 = kk0Var.P();
            if (z3) {
                objP2 = new gh1(je1Var, 6);
                kk0Var.l0(objP2);
            } else {
                objP2 = new gh1(je1Var, 6);
                kk0Var.l0(objP2);
            }
            je1Var2 = (je1) objP2;
            c cVarThen6 = cVar3.then(a);
            zH = kk0Var.h(je1Var2);
            objP3 = kk0Var.P();
            if (zH) {
                objP3 = new oy0(je1Var2, 5);
                kk0Var.l0(objP3);
            } else {
                objP3 = new oy0(je1Var2, 5);
                kk0Var.l0(objP3);
            }
            c cVarK6 = d.k(we3.b(cVarThen6, true, (le1) objP3), b, c);
            if ((i5 & 57344) == 16384) {
                z4 = true;
            } else {
                z4 = false;
            }
            if ((458752 & i5) == 131072) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean zH7 = z4 | z5 | kk0Var.h(je1Var2) | ((((i5 & 7168) ^ 3072) <= 2048 && kk0Var.g(linearTrackColor)) || (i5 & 3072) == 2048) | ((((i5 & 896) ^ 384) <= 256 && kk0Var.g(linearColor)) || (i5 & 384) == 256);
            if (((3670016 & i5) ^ 1572864) > 1048576) {
            }
            z6 = zH7 | z13;
            objP4 = kk0Var.P();
            if (z6) {
                le1Var3 = le1Var2;
                j3 = linearColor;
                j4 = linearTrackColor;
                objP4 = new v03(i13, f5, je1Var2, j4, j3, le1Var3);
                kk0Var.l0(objP4);
            } else {
                le1Var3 = le1Var2;
                j3 = linearColor;
                j4 = linearTrackColor;
                objP4 = new v03(i13, f5, je1Var2, j4, j3, le1Var3);
                kk0Var.l0(objP4);
            }
            c10.Canvas(cVarK6, (le1) objP4, kk0Var, 0);
            cVar4 = cVar3;
            i14 = i13;
            f6 = f5;
            j5 = j4;
            j6 = j3;
            le1Var4 = le1Var3;
        } else {
            kk0Var.X();
            boolean z14 = true;
            if ((i3 & 1) != 0) {
                if (i18 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                i11 = i4 & 4;
                i03Var = i03.a;
                if (i11 != 0) {
                    i12 = 6;
                    linearColor = i03Var.getLinearColor(kk0Var, 6);
                    i5 &= -897;
                } else {
                    i12 = 6;
                }
                if ((i4 & 8) != 0) {
                    linearTrackColor = i03Var.getLinearTrackColor(kk0Var, i12);
                    i5 &= -7169;
                }
                if (i6 != 0) {
                    i7 = 1;
                }
                if (i9 != 0) {
                    f4 = 4.0f;
                } else {
                    f4 = f3;
                }
                if ((i4 & 64) != 0) {
                    if (((i5 & 896) ^ 384) <= 256) {
                    }
                    if ((i5 & 57344) == 16384) {
                        z = true;
                    } else {
                        z = false;
                    }
                    z2 = z8 | z;
                    objP = kk0Var.P();
                    if (z2) {
                        objP = new u03(linearColor, i7);
                        kk0Var.l0(objP);
                    } else {
                        objP = new u03(linearColor, i7);
                        kk0Var.l0(objP);
                    }
                    le1Var2 = (le1) objP;
                    i5 &= -3670017;
                }
                f5 = f4;
            } else {
                if (i18 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                i11 = i4 & 4;
                i03Var = i03.a;
                if (i11 != 0) {
                    i12 = 6;
                    linearColor = i03Var.getLinearColor(kk0Var, 6);
                    i5 &= -897;
                } else {
                    i12 = 6;
                }
                if ((i4 & 8) != 0) {
                    linearTrackColor = i03Var.getLinearTrackColor(kk0Var, i12);
                    i5 &= -7169;
                }
                if (i6 != 0) {
                    i7 = 1;
                }
                if (i9 != 0) {
                    f4 = 4.0f;
                } else {
                    f4 = f3;
                }
                if ((i4 & 64) != 0) {
                    if (((i5 & 896) ^ 384) <= 256) {
                    }
                    if ((i5 & 57344) == 16384) {
                        z = true;
                    } else {
                        z = false;
                    }
                    z2 = z8 | z;
                    objP = kk0Var.P();
                    if (z2) {
                        objP = new u03(linearColor, i7);
                        kk0Var.l0(objP);
                    } else {
                        objP = new u03(linearColor, i7);
                        kk0Var.l0(objP);
                    }
                    le1Var2 = (le1) objP;
                    i5 &= -3670017;
                }
                f5 = f4;
            }
            i13 = i7;
            kk0Var.s();
            if ((i5 & 14) == 4) {
                z3 = true;
            } else {
                z3 = false;
            }
            objP2 = kk0Var.P();
            if (z3) {
                objP2 = new gh1(je1Var, 6);
                kk0Var.l0(objP2);
            } else {
                objP2 = new gh1(je1Var, 6);
                kk0Var.l0(objP2);
            }
            je1Var2 = (je1) objP2;
            c cVarThen7 = cVar3.then(a);
            zH = kk0Var.h(je1Var2);
            objP3 = kk0Var.P();
            if (zH) {
                objP3 = new oy0(je1Var2, 5);
                kk0Var.l0(objP3);
            } else {
                objP3 = new oy0(je1Var2, 5);
                kk0Var.l0(objP3);
            }
            c cVarK7 = d.k(we3.b(cVarThen7, true, (le1) objP3), b, c);
            if ((i5 & 57344) == 16384) {
                z4 = true;
            } else {
                z4 = false;
            }
            if ((458752 & i5) == 131072) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean zH8 = z4 | z5 | kk0Var.h(je1Var2) | ((((i5 & 7168) ^ 3072) <= 2048 && kk0Var.g(linearTrackColor)) || (i5 & 3072) == 2048) | ((((i5 & 896) ^ 384) <= 256 && kk0Var.g(linearColor)) || (i5 & 384) == 256);
            if (((3670016 & i5) ^ 1572864) > 1048576) {
            }
            z6 = zH8 | z14;
            objP4 = kk0Var.P();
            if (z6) {
                le1Var3 = le1Var2;
                j3 = linearColor;
                j4 = linearTrackColor;
                objP4 = new v03(i13, f5, je1Var2, j4, j3, le1Var3);
                kk0Var.l0(objP4);
            } else {
                le1Var3 = le1Var2;
                j3 = linearColor;
                j4 = linearTrackColor;
                objP4 = new v03(i13, f5, je1Var2, j4, j3, le1Var3);
                kk0Var.l0(objP4);
            }
            c10.Canvas(cVarK7, (le1) objP4, kk0Var, 0);
            cVar4 = cVar3;
            i14 = i13;
            f6 = f5;
            j5 = j4;
            j6 = j3;
            le1Var4 = le1Var3;
        }
        w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new w03(je1Var, cVar4, j6, j5, i14, f6, le1Var4, i3, i4));
        }
    }

    @cv0
    /* JADX INFO: renamed from: LinearProgressIndicator-RIQooxk, reason: not valid java name */
    public static final /* synthetic */ void m1887x3da2a09d(c cVar, long j, long j2, ck0 ck0Var, int i2, int i3) {
        c cVar2;
        int i4;
        long linearColor;
        long linearTrackColor;
        long j3;
        c cVar3;
        long j4;
        long j5;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(585576195);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
            cVar2 = cVar;
        } else if ((i2 & 6) == 0) {
            cVar2 = cVar;
            i4 = (kk0Var.h(cVar2) ? 4 : 2) | i2;
        } else {
            cVar2 = cVar;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            if ((i3 & 2) == 0) {
                linearColor = j;
                int i6 = kk0Var.g(linearColor) ? 32 : 16;
                i4 |= i6;
            } else {
                linearColor = j;
            }
            i4 |= i6;
        } else {
            linearColor = j;
        }
        if ((i2 & 384) == 0) {
            linearTrackColor = j2;
            i4 |= ((i3 & 4) == 0 && kk0Var.g(linearTrackColor)) ? FontInfo.NUMBER_OF_CHAR_CODES : Uuid.SIZE_BITS;
        } else {
            linearTrackColor = j2;
        }
        if ((i4 & 147) == 146 && kk0Var.F()) {
            kk0Var.V();
            j4 = linearColor;
            j5 = linearTrackColor;
        } else {
            kk0Var.X();
            if ((i2 & 1) == 0 || kk0Var.D()) {
                c cVar4 = i5 != 0 ? c.i : cVar2;
                int i7 = i3 & 2;
                i03 i03Var = i03.a;
                if (i7 != 0) {
                    linearColor = i03Var.getLinearColor(kk0Var, 6);
                    i4 &= -113;
                }
                if ((i3 & 4) != 0) {
                    linearTrackColor = i03Var.getLinearTrackColor(kk0Var, 6);
                    i4 &= -897;
                }
                j3 = linearTrackColor;
                cVar3 = cVar4;
            } else {
                kk0Var.V();
                if ((i3 & 2) != 0) {
                    i4 &= -113;
                }
                if ((i3 & 4) != 0) {
                    i4 &= -897;
                }
                j3 = linearTrackColor;
                cVar3 = cVar2;
            }
            long j6 = linearColor;
            kk0Var.s();
            m1891xdc38e88f(cVar3, j6, j3, 1, 0.0f, kk0Var, (i4 & 14) | 3072 | (i4 & 112) | (i4 & 896), 16);
            cVar2 = cVar3;
            j4 = j6;
            j5 = j3;
        }
        w33 w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new s03(cVar2, j4, j5, i2, i3));
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0136  */
    /* JADX WARN: Code duplicated, block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0045  */
    /* JADX WARN: Code duplicated, block: B:28:0x0049  */
    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:31:0x0054  */
    /* JADX WARN: Code duplicated, block: B:34:0x005a  */
    /* JADX WARN: Code duplicated, block: B:37:0x0060  */
    /* JADX WARN: Code duplicated, block: B:39:0x0064  */
    /* JADX WARN: Code duplicated, block: B:41:0x006c  */
    /* JADX WARN: Code duplicated, block: B:42:0x006f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0075  */
    /* JADX WARN: Code duplicated, block: B:48:0x007b  */
    /* JADX WARN: Code duplicated, block: B:50:0x0080  */
    /* JADX WARN: Code duplicated, block: B:52:0x0084  */
    /* JADX WARN: Code duplicated, block: B:54:0x008c  */
    /* JADX WARN: Code duplicated, block: B:55:0x008f  */
    /* JADX WARN: Code duplicated, block: B:59:0x0098  */
    /* JADX WARN: Code duplicated, block: B:63:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:81:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:90:0x0101  */
    /* JADX WARN: Code duplicated, block: B:91:0x0103  */
    /* JADX WARN: Code duplicated, block: B:94:0x010a  */
    /* JADX WARN: Code duplicated, block: B:96:0x0110  */
    @cv0
    /* JADX INFO: renamed from: LinearProgressIndicator-_5eSR-E, reason: not valid java name */
    public static final void m1888xcc3f5c16(float f2, c cVar, long j, long j2, int i2, ck0 ck0Var, int i3, int i4) {
        int i5;
        c cVar2;
        long linearColor;
        long linearTrackColor;
        int i6;
        int i7;
        int i8;
        c cVar3;
        int i9;
        i03 i03Var;
        long j3;
        c cVar4;
        long j4;
        long j5;
        int i10;
        boolean z;
        Object objP;
        kk0 kk0Var;
        c cVar5;
        long j6;
        long j7;
        int i11;
        w33 w33VarV;
        int i12;
        kk0 kk0Var2 = (kk0) ck0Var;
        kk0Var2.c0(905419617);
        if ((i4 & 1) != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i5 = (kk0Var2.e(f2) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        int i13 = i4 & 2;
        if (i13 == 0) {
            if ((i3 & 48) == 0) {
                cVar2 = cVar;
                i5 |= kk0Var2.h(cVar2) ? 32 : 16;
            }
            if ((i3 & 384) == 0) {
                if ((i4 & 4) == 0) {
                    linearColor = j;
                    if (kk0Var2.g(linearColor)) {
                        i12 = FontInfo.NUMBER_OF_CHAR_CODES;
                    }
                    i5 |= i12;
                } else {
                    linearColor = j;
                }
                i12 = Uuid.SIZE_BITS;
                i5 |= i12;
            } else {
                linearColor = j;
            }
            if ((i3 & 3072) == 0) {
                if ((i4 & 8) == 0) {
                    linearTrackColor = j2;
                    int i14 = kk0Var2.g(linearTrackColor) ? 2048 : 1024;
                    i5 |= i14;
                } else {
                    linearTrackColor = j2;
                }
                i5 |= i14;
            } else {
                linearTrackColor = j2;
            }
            i6 = i4 & 16;
            if (i6 != 0) {
                if ((i3 & 24576) == 0) {
                    i7 = i2;
                    if (kk0Var2.f(i7)) {
                        i8 = 16384;
                    } else {
                        i8 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                    }
                    i5 |= i8;
                }
                if ((i5 & 9363) == 9362 || !kk0Var2.F()) {
                    kk0Var2.X();
                    if ((i3 & 1) != 0 || kk0Var2.D()) {
                        if (i13 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        i9 = i4 & 4;
                        i03Var = i03.a;
                        if (i9 != 0) {
                            i5 &= -897;
                            linearColor = i03Var.getLinearColor(kk0Var2, 6);
                        }
                        if ((i4 & 8) != 0) {
                            linearTrackColor = i03Var.getLinearTrackColor(kk0Var2, 6);
                            i5 &= -7169;
                        }
                        if (i6 != 0) {
                            cVar4 = cVar3;
                            j4 = linearTrackColor;
                            j5 = linearColor;
                            i10 = 1;
                        } else {
                            j3 = linearTrackColor;
                            cVar4 = cVar3;
                        }
                        kk0Var2.s();
                        if ((i5 & 14) == 4) {
                            z = true;
                        } else {
                            z = false;
                        }
                        objP = kk0Var2.P();
                        if (z || objP == Composer$Companion.getEmpty()) {
                            objP = new o03(f2, 1);
                            kk0Var2.l0(objP);
                        }
                        kk0Var = kk0Var2;
                        long j8 = j4;
                        m1886xfa561483((je1) objP, cVar4, j5, j8, i10, 0.0f, null, kk0Var, i5 & 65520, 96);
                        cVar5 = cVar4;
                        j6 = j5;
                        j7 = j8;
                        i11 = i10;
                    } else {
                        kk0Var2.V();
                        if ((i4 & 4) != 0) {
                            i5 &= -897;
                        }
                        if ((i4 & 8) != 0) {
                            i5 &= -7169;
                        }
                        j3 = linearTrackColor;
                        cVar4 = cVar2;
                    }
                    j4 = j3;
                    i10 = i7;
                    j5 = linearColor;
                    kk0Var2.s();
                    if ((i5 & 14) == 4) {
                        z = true;
                    } else {
                        z = false;
                    }
                    objP = kk0Var2.P();
                    if (z) {
                        objP = new o03(f2, 1);
                        kk0Var2.l0(objP);
                    } else {
                        objP = new o03(f2, 1);
                        kk0Var2.l0(objP);
                    }
                    kk0Var = kk0Var2;
                    long j9 = j4;
                    m1886xfa561483((je1) objP, cVar4, j5, j9, i10, 0.0f, null, kk0Var, i5 & 65520, 96);
                    cVar5 = cVar4;
                    j6 = j5;
                    j7 = j9;
                    i11 = i10;
                } else {
                    kk0Var2.V();
                    kk0Var = kk0Var2;
                    cVar5 = cVar2;
                    j6 = linearColor;
                    j7 = linearTrackColor;
                    i11 = i7;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new n03(f2, cVar5, j6, j7, i11, i3, i4));
                }
            }
            i5 |= 24576;
            i7 = i2;
            if ((i5 & 9363) == 9362) {
                kk0Var2.X();
                if ((i3 & 1) != 0) {
                    if (i13 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    i9 = i4 & 4;
                    i03Var = i03.a;
                    if (i9 != 0) {
                        i5 &= -897;
                        linearColor = i03Var.getLinearColor(kk0Var2, 6);
                    }
                    if ((i4 & 8) != 0) {
                        linearTrackColor = i03Var.getLinearTrackColor(kk0Var2, 6);
                        i5 &= -7169;
                    }
                    if (i6 != 0) {
                        cVar4 = cVar3;
                        j4 = linearTrackColor;
                        j5 = linearColor;
                        i10 = 1;
                    } else {
                        j3 = linearTrackColor;
                        cVar4 = cVar3;
                        j4 = j3;
                        i10 = i7;
                        j5 = linearColor;
                    }
                } else {
                    if (i13 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    i9 = i4 & 4;
                    i03Var = i03.a;
                    if (i9 != 0) {
                        i5 &= -897;
                        linearColor = i03Var.getLinearColor(kk0Var2, 6);
                    }
                    if ((i4 & 8) != 0) {
                        linearTrackColor = i03Var.getLinearTrackColor(kk0Var2, 6);
                        i5 &= -7169;
                    }
                    if (i6 != 0) {
                        cVar4 = cVar3;
                        j4 = linearTrackColor;
                        j5 = linearColor;
                        i10 = 1;
                    } else {
                        j3 = linearTrackColor;
                        cVar4 = cVar3;
                        j4 = j3;
                        i10 = i7;
                        j5 = linearColor;
                    }
                }
                kk0Var2.s();
                if ((i5 & 14) == 4) {
                    z = true;
                } else {
                    z = false;
                }
                objP = kk0Var2.P();
                if (z) {
                    objP = new o03(f2, 1);
                    kk0Var2.l0(objP);
                } else {
                    objP = new o03(f2, 1);
                    kk0Var2.l0(objP);
                }
                kk0Var = kk0Var2;
                long j10 = j4;
                m1886xfa561483((je1) objP, cVar4, j5, j10, i10, 0.0f, null, kk0Var, i5 & 65520, 96);
                cVar5 = cVar4;
                j6 = j5;
                j7 = j10;
                i11 = i10;
            } else {
                kk0Var2.X();
                if ((i3 & 1) != 0) {
                    if (i13 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    i9 = i4 & 4;
                    i03Var = i03.a;
                    if (i9 != 0) {
                        i5 &= -897;
                        linearColor = i03Var.getLinearColor(kk0Var2, 6);
                    }
                    if ((i4 & 8) != 0) {
                        linearTrackColor = i03Var.getLinearTrackColor(kk0Var2, 6);
                        i5 &= -7169;
                    }
                    if (i6 != 0) {
                        cVar4 = cVar3;
                        j4 = linearTrackColor;
                        j5 = linearColor;
                        i10 = 1;
                    } else {
                        j3 = linearTrackColor;
                        cVar4 = cVar3;
                        j4 = j3;
                        i10 = i7;
                        j5 = linearColor;
                    }
                } else {
                    if (i13 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    i9 = i4 & 4;
                    i03Var = i03.a;
                    if (i9 != 0) {
                        i5 &= -897;
                        linearColor = i03Var.getLinearColor(kk0Var2, 6);
                    }
                    if ((i4 & 8) != 0) {
                        linearTrackColor = i03Var.getLinearTrackColor(kk0Var2, 6);
                        i5 &= -7169;
                    }
                    if (i6 != 0) {
                        cVar4 = cVar3;
                        j4 = linearTrackColor;
                        j5 = linearColor;
                        i10 = 1;
                    } else {
                        j3 = linearTrackColor;
                        cVar4 = cVar3;
                        j4 = j3;
                        i10 = i7;
                        j5 = linearColor;
                    }
                }
                kk0Var2.s();
                if ((i5 & 14) == 4) {
                    z = true;
                } else {
                    z = false;
                }
                objP = kk0Var2.P();
                if (z) {
                    objP = new o03(f2, 1);
                    kk0Var2.l0(objP);
                } else {
                    objP = new o03(f2, 1);
                    kk0Var2.l0(objP);
                }
                kk0Var = kk0Var2;
                long j11 = j4;
                m1886xfa561483((je1) objP, cVar4, j5, j11, i10, 0.0f, null, kk0Var, i5 & 65520, 96);
                cVar5 = cVar4;
                j6 = j5;
                j7 = j11;
                i11 = i10;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new n03(f2, cVar5, j6, j7, i11, i3, i4));
            }
        }
        i5 |= 48;
        cVar2 = cVar;
        if ((i3 & 384) == 0) {
            if ((i4 & 4) == 0) {
                linearColor = j;
                if (kk0Var2.g(linearColor)) {
                    i12 = FontInfo.NUMBER_OF_CHAR_CODES;
                }
                i5 |= i12;
            } else {
                linearColor = j;
            }
            i12 = Uuid.SIZE_BITS;
            i5 |= i12;
        } else {
            linearColor = j;
        }
        if ((i3 & 3072) == 0) {
            if ((i4 & 8) == 0) {
                linearTrackColor = j2;
                if (kk0Var2.g(linearTrackColor)) {
                }
                i5 |= i14;
            } else {
                linearTrackColor = j2;
            }
            i5 |= i14;
        } else {
            linearTrackColor = j2;
        }
        i6 = i4 & 16;
        if (i6 != 0) {
            if ((i3 & 24576) == 0) {
                i7 = i2;
                if (kk0Var2.f(i7)) {
                    i8 = 16384;
                } else {
                    i8 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                }
                i5 |= i8;
            }
            if ((i5 & 9363) == 9362) {
                kk0Var2.X();
                if ((i3 & 1) != 0) {
                    if (i13 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    i9 = i4 & 4;
                    i03Var = i03.a;
                    if (i9 != 0) {
                        i5 &= -897;
                        linearColor = i03Var.getLinearColor(kk0Var2, 6);
                    }
                    if ((i4 & 8) != 0) {
                        linearTrackColor = i03Var.getLinearTrackColor(kk0Var2, 6);
                        i5 &= -7169;
                    }
                    if (i6 != 0) {
                        cVar4 = cVar3;
                        j4 = linearTrackColor;
                        j5 = linearColor;
                        i10 = 1;
                    } else {
                        j3 = linearTrackColor;
                        cVar4 = cVar3;
                        j4 = j3;
                        i10 = i7;
                        j5 = linearColor;
                    }
                } else {
                    if (i13 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    i9 = i4 & 4;
                    i03Var = i03.a;
                    if (i9 != 0) {
                        i5 &= -897;
                        linearColor = i03Var.getLinearColor(kk0Var2, 6);
                    }
                    if ((i4 & 8) != 0) {
                        linearTrackColor = i03Var.getLinearTrackColor(kk0Var2, 6);
                        i5 &= -7169;
                    }
                    if (i6 != 0) {
                        cVar4 = cVar3;
                        j4 = linearTrackColor;
                        j5 = linearColor;
                        i10 = 1;
                    } else {
                        j3 = linearTrackColor;
                        cVar4 = cVar3;
                        j4 = j3;
                        i10 = i7;
                        j5 = linearColor;
                    }
                }
                kk0Var2.s();
                if ((i5 & 14) == 4) {
                    z = true;
                } else {
                    z = false;
                }
                objP = kk0Var2.P();
                if (z) {
                    objP = new o03(f2, 1);
                    kk0Var2.l0(objP);
                } else {
                    objP = new o03(f2, 1);
                    kk0Var2.l0(objP);
                }
                kk0Var = kk0Var2;
                long j12 = j4;
                m1886xfa561483((je1) objP, cVar4, j5, j12, i10, 0.0f, null, kk0Var, i5 & 65520, 96);
                cVar5 = cVar4;
                j6 = j5;
                j7 = j12;
                i11 = i10;
            } else {
                kk0Var2.X();
                if ((i3 & 1) != 0) {
                    if (i13 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    i9 = i4 & 4;
                    i03Var = i03.a;
                    if (i9 != 0) {
                        i5 &= -897;
                        linearColor = i03Var.getLinearColor(kk0Var2, 6);
                    }
                    if ((i4 & 8) != 0) {
                        linearTrackColor = i03Var.getLinearTrackColor(kk0Var2, 6);
                        i5 &= -7169;
                    }
                    if (i6 != 0) {
                        cVar4 = cVar3;
                        j4 = linearTrackColor;
                        j5 = linearColor;
                        i10 = 1;
                    } else {
                        j3 = linearTrackColor;
                        cVar4 = cVar3;
                        j4 = j3;
                        i10 = i7;
                        j5 = linearColor;
                    }
                } else {
                    if (i13 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    i9 = i4 & 4;
                    i03Var = i03.a;
                    if (i9 != 0) {
                        i5 &= -897;
                        linearColor = i03Var.getLinearColor(kk0Var2, 6);
                    }
                    if ((i4 & 8) != 0) {
                        linearTrackColor = i03Var.getLinearTrackColor(kk0Var2, 6);
                        i5 &= -7169;
                    }
                    if (i6 != 0) {
                        cVar4 = cVar3;
                        j4 = linearTrackColor;
                        j5 = linearColor;
                        i10 = 1;
                    } else {
                        j3 = linearTrackColor;
                        cVar4 = cVar3;
                        j4 = j3;
                        i10 = i7;
                        j5 = linearColor;
                    }
                }
                kk0Var2.s();
                if ((i5 & 14) == 4) {
                    z = true;
                } else {
                    z = false;
                }
                objP = kk0Var2.P();
                if (z) {
                    objP = new o03(f2, 1);
                    kk0Var2.l0(objP);
                } else {
                    objP = new o03(f2, 1);
                    kk0Var2.l0(objP);
                }
                kk0Var = kk0Var2;
                long j13 = j4;
                m1886xfa561483((je1) objP, cVar4, j5, j13, i10, 0.0f, null, kk0Var, i5 & 65520, 96);
                cVar5 = cVar4;
                j6 = j5;
                j7 = j13;
                i11 = i10;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new n03(f2, cVar5, j6, j7, i11, i3, i4));
            }
        }
        i5 |= 24576;
        i7 = i2;
        if ((i5 & 9363) == 9362) {
            kk0Var2.X();
            if ((i3 & 1) != 0) {
                if (i13 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                i9 = i4 & 4;
                i03Var = i03.a;
                if (i9 != 0) {
                    i5 &= -897;
                    linearColor = i03Var.getLinearColor(kk0Var2, 6);
                }
                if ((i4 & 8) != 0) {
                    linearTrackColor = i03Var.getLinearTrackColor(kk0Var2, 6);
                    i5 &= -7169;
                }
                if (i6 != 0) {
                    cVar4 = cVar3;
                    j4 = linearTrackColor;
                    j5 = linearColor;
                    i10 = 1;
                } else {
                    j3 = linearTrackColor;
                    cVar4 = cVar3;
                    j4 = j3;
                    i10 = i7;
                    j5 = linearColor;
                }
            } else {
                if (i13 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                i9 = i4 & 4;
                i03Var = i03.a;
                if (i9 != 0) {
                    i5 &= -897;
                    linearColor = i03Var.getLinearColor(kk0Var2, 6);
                }
                if ((i4 & 8) != 0) {
                    linearTrackColor = i03Var.getLinearTrackColor(kk0Var2, 6);
                    i5 &= -7169;
                }
                if (i6 != 0) {
                    cVar4 = cVar3;
                    j4 = linearTrackColor;
                    j5 = linearColor;
                    i10 = 1;
                } else {
                    j3 = linearTrackColor;
                    cVar4 = cVar3;
                    j4 = j3;
                    i10 = i7;
                    j5 = linearColor;
                }
            }
            kk0Var2.s();
            if ((i5 & 14) == 4) {
                z = true;
            } else {
                z = false;
            }
            objP = kk0Var2.P();
            if (z) {
                objP = new o03(f2, 1);
                kk0Var2.l0(objP);
            } else {
                objP = new o03(f2, 1);
                kk0Var2.l0(objP);
            }
            kk0Var = kk0Var2;
            long j14 = j4;
            m1886xfa561483((je1) objP, cVar4, j5, j14, i10, 0.0f, null, kk0Var, i5 & 65520, 96);
            cVar5 = cVar4;
            j6 = j5;
            j7 = j14;
            i11 = i10;
        } else {
            kk0Var2.X();
            if ((i3 & 1) != 0) {
                if (i13 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                i9 = i4 & 4;
                i03Var = i03.a;
                if (i9 != 0) {
                    i5 &= -897;
                    linearColor = i03Var.getLinearColor(kk0Var2, 6);
                }
                if ((i4 & 8) != 0) {
                    linearTrackColor = i03Var.getLinearTrackColor(kk0Var2, 6);
                    i5 &= -7169;
                }
                if (i6 != 0) {
                    cVar4 = cVar3;
                    j4 = linearTrackColor;
                    j5 = linearColor;
                    i10 = 1;
                } else {
                    j3 = linearTrackColor;
                    cVar4 = cVar3;
                    j4 = j3;
                    i10 = i7;
                    j5 = linearColor;
                }
            } else {
                if (i13 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                i9 = i4 & 4;
                i03Var = i03.a;
                if (i9 != 0) {
                    i5 &= -897;
                    linearColor = i03Var.getLinearColor(kk0Var2, 6);
                }
                if ((i4 & 8) != 0) {
                    linearTrackColor = i03Var.getLinearTrackColor(kk0Var2, 6);
                    i5 &= -7169;
                }
                if (i6 != 0) {
                    cVar4 = cVar3;
                    j4 = linearTrackColor;
                    j5 = linearColor;
                    i10 = 1;
                } else {
                    j3 = linearTrackColor;
                    cVar4 = cVar3;
                    j4 = j3;
                    i10 = i7;
                    j5 = linearColor;
                }
            }
            kk0Var2.s();
            if ((i5 & 14) == 4) {
                z = true;
            } else {
                z = false;
            }
            objP = kk0Var2.P();
            if (z) {
                objP = new o03(f2, 1);
                kk0Var2.l0(objP);
            } else {
                objP = new o03(f2, 1);
                kk0Var2.l0(objP);
            }
            kk0Var = kk0Var2;
            long j15 = j4;
            m1886xfa561483((je1) objP, cVar4, j5, j15, i10, 0.0f, null, kk0Var, i5 & 65520, 96);
            cVar5 = cVar4;
            j6 = j5;
            j7 = j15;
            i11 = i10;
        }
        w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new n03(f2, cVar5, j6, j7, i11, i3, i4));
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0046  */
    /* JADX WARN: Code duplicated, block: B:28:0x004a  */
    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    /* JADX WARN: Code duplicated, block: B:31:0x0055  */
    /* JADX WARN: Code duplicated, block: B:34:0x005b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0061  */
    /* JADX WARN: Code duplicated, block: B:39:0x0065  */
    /* JADX WARN: Code duplicated, block: B:41:0x006d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0070  */
    /* JADX WARN: Code duplicated, block: B:45:0x0076  */
    /* JADX WARN: Code duplicated, block: B:48:0x007c  */
    /* JADX WARN: Code duplicated, block: B:50:0x0081  */
    /* JADX WARN: Code duplicated, block: B:52:0x0085  */
    /* JADX WARN: Code duplicated, block: B:54:0x008d  */
    /* JADX WARN: Code duplicated, block: B:55:0x0090  */
    /* JADX WARN: Code duplicated, block: B:59:0x0099  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:80:0x00da  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:91:0x0125  */
    /* JADX WARN: Code duplicated, block: B:93:? A[RETURN, SYNTHETIC] */
    @cv0
    /* JADX INFO: renamed from: LinearProgressIndicator-_5eSR-E, reason: not valid java name */
    public static final /* synthetic */ void m1889xcc3f5c16(je1 je1Var, c cVar, long j, long j2, int i2, ck0 ck0Var, int i3, int i4) {
        je1 je1Var2;
        int i5;
        c cVar2;
        long j3;
        long linearTrackColor;
        int i6;
        int i7;
        int i8;
        c cVar3;
        int i9;
        i03 i03Var;
        long linearColor;
        c cVar4;
        long j4;
        int i10;
        long j5;
        kk0 kk0Var;
        c cVar5;
        long j6;
        long j7;
        int i11;
        w33 w33VarV;
        int i12;
        kk0 kk0Var2 = (kk0) ck0Var;
        kk0Var2.c0(-1796992155);
        if ((i4 & 1) != 0) {
            i5 = i3 | 6;
            je1Var2 = je1Var;
        } else {
            je1Var2 = je1Var;
            if ((i3 & 6) == 0) {
                i5 = (kk0Var2.j(je1Var2) ? 4 : 2) | i3;
            } else {
                i5 = i3;
            }
        }
        int i13 = i4 & 2;
        if (i13 == 0) {
            if ((i3 & 48) == 0) {
                cVar2 = cVar;
                i5 |= kk0Var2.h(cVar2) ? 32 : 16;
            }
            if ((i3 & 384) == 0) {
                if ((i4 & 4) == 0) {
                    j3 = j;
                    if (kk0Var2.g(j3)) {
                        i12 = FontInfo.NUMBER_OF_CHAR_CODES;
                    }
                    i5 |= i12;
                } else {
                    j3 = j;
                }
                i12 = Uuid.SIZE_BITS;
                i5 |= i12;
            } else {
                j3 = j;
            }
            if ((i3 & 3072) == 0) {
                if ((i4 & 8) == 0) {
                    linearTrackColor = j2;
                    int i14 = kk0Var2.g(linearTrackColor) ? 2048 : 1024;
                    i5 |= i14;
                } else {
                    linearTrackColor = j2;
                }
                i5 |= i14;
            } else {
                linearTrackColor = j2;
            }
            i6 = i4 & 16;
            if (i6 != 0) {
                if ((i3 & 24576) == 0) {
                    i7 = i2;
                    if (kk0Var2.f(i7)) {
                        i8 = 16384;
                    } else {
                        i8 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                    }
                    i5 |= i8;
                }
                if ((i5 & 9363) == 9362 || !kk0Var2.F()) {
                    kk0Var2.X();
                    if ((i3 & 1) != 0 || kk0Var2.D()) {
                        if (i13 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        i9 = i4 & 4;
                        i03Var = i03.a;
                        if (i9 != 0) {
                            linearColor = i03Var.getLinearColor(kk0Var2, 6);
                            i5 &= -897;
                        } else {
                            linearColor = j3;
                        }
                        if ((i4 & 8) != 0) {
                            i5 &= -7169;
                            linearTrackColor = i03Var.getLinearTrackColor(kk0Var2, 6);
                        }
                        if (i6 != 0) {
                            cVar4 = cVar3;
                            j5 = linearColor;
                            i10 = 1;
                            j4 = linearTrackColor;
                        } else {
                            cVar4 = cVar3;
                            j4 = linearTrackColor;
                            i10 = i7;
                            j5 = linearColor;
                        }
                    } else {
                        kk0Var2.V();
                        if ((i4 & 4) != 0) {
                            i5 &= -897;
                        }
                        if ((i4 & 8) != 0) {
                            i5 &= -7169;
                        }
                        cVar4 = cVar2;
                        j4 = linearTrackColor;
                        i10 = i7;
                        j5 = j3;
                    }
                    kk0Var2.s();
                    kk0Var = kk0Var2;
                    m1886xfa561483(je1Var2, cVar4, j5, j4, i10, 4.0f, null, kk0Var, (i5 & 14) | 196608 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (i5 & 57344), 64);
                    cVar5 = cVar4;
                    j6 = j5;
                    j7 = j4;
                    i11 = i10;
                } else {
                    kk0Var2.V();
                    kk0Var = kk0Var2;
                    cVar5 = cVar2;
                    j6 = j3;
                    j7 = linearTrackColor;
                    i11 = i7;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new t03(je1Var, cVar5, j6, j7, i11, i3, i4));
                }
            }
            i5 |= 24576;
            i7 = i2;
            if ((i5 & 9363) == 9362) {
                kk0Var2.X();
                if ((i3 & 1) != 0) {
                    if (i13 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    i9 = i4 & 4;
                    i03Var = i03.a;
                    if (i9 != 0) {
                        linearColor = i03Var.getLinearColor(kk0Var2, 6);
                        i5 &= -897;
                    } else {
                        linearColor = j3;
                    }
                    if ((i4 & 8) != 0) {
                        i5 &= -7169;
                        linearTrackColor = i03Var.getLinearTrackColor(kk0Var2, 6);
                    }
                    if (i6 != 0) {
                        cVar4 = cVar3;
                        j5 = linearColor;
                        i10 = 1;
                        j4 = linearTrackColor;
                    } else {
                        cVar4 = cVar3;
                        j4 = linearTrackColor;
                        i10 = i7;
                        j5 = linearColor;
                    }
                } else {
                    if (i13 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    i9 = i4 & 4;
                    i03Var = i03.a;
                    if (i9 != 0) {
                        linearColor = i03Var.getLinearColor(kk0Var2, 6);
                        i5 &= -897;
                    } else {
                        linearColor = j3;
                    }
                    if ((i4 & 8) != 0) {
                        i5 &= -7169;
                        linearTrackColor = i03Var.getLinearTrackColor(kk0Var2, 6);
                    }
                    if (i6 != 0) {
                        cVar4 = cVar3;
                        j5 = linearColor;
                        i10 = 1;
                        j4 = linearTrackColor;
                    } else {
                        cVar4 = cVar3;
                        j4 = linearTrackColor;
                        i10 = i7;
                        j5 = linearColor;
                    }
                }
                kk0Var2.s();
                kk0Var = kk0Var2;
                m1886xfa561483(je1Var2, cVar4, j5, j4, i10, 4.0f, null, kk0Var, (i5 & 14) | 196608 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (i5 & 57344), 64);
                cVar5 = cVar4;
                j6 = j5;
                j7 = j4;
                i11 = i10;
            } else {
                kk0Var2.X();
                if ((i3 & 1) != 0) {
                    if (i13 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    i9 = i4 & 4;
                    i03Var = i03.a;
                    if (i9 != 0) {
                        linearColor = i03Var.getLinearColor(kk0Var2, 6);
                        i5 &= -897;
                    } else {
                        linearColor = j3;
                    }
                    if ((i4 & 8) != 0) {
                        i5 &= -7169;
                        linearTrackColor = i03Var.getLinearTrackColor(kk0Var2, 6);
                    }
                    if (i6 != 0) {
                        cVar4 = cVar3;
                        j5 = linearColor;
                        i10 = 1;
                        j4 = linearTrackColor;
                    } else {
                        cVar4 = cVar3;
                        j4 = linearTrackColor;
                        i10 = i7;
                        j5 = linearColor;
                    }
                } else {
                    if (i13 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    i9 = i4 & 4;
                    i03Var = i03.a;
                    if (i9 != 0) {
                        linearColor = i03Var.getLinearColor(kk0Var2, 6);
                        i5 &= -897;
                    } else {
                        linearColor = j3;
                    }
                    if ((i4 & 8) != 0) {
                        i5 &= -7169;
                        linearTrackColor = i03Var.getLinearTrackColor(kk0Var2, 6);
                    }
                    if (i6 != 0) {
                        cVar4 = cVar3;
                        j5 = linearColor;
                        i10 = 1;
                        j4 = linearTrackColor;
                    } else {
                        cVar4 = cVar3;
                        j4 = linearTrackColor;
                        i10 = i7;
                        j5 = linearColor;
                    }
                }
                kk0Var2.s();
                kk0Var = kk0Var2;
                m1886xfa561483(je1Var2, cVar4, j5, j4, i10, 4.0f, null, kk0Var, (i5 & 14) | 196608 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (i5 & 57344), 64);
                cVar5 = cVar4;
                j6 = j5;
                j7 = j4;
                i11 = i10;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new t03(je1Var, cVar5, j6, j7, i11, i3, i4));
            }
        }
        i5 |= 48;
        cVar2 = cVar;
        if ((i3 & 384) == 0) {
            if ((i4 & 4) == 0) {
                j3 = j;
                if (kk0Var2.g(j3)) {
                    i12 = FontInfo.NUMBER_OF_CHAR_CODES;
                }
                i5 |= i12;
            } else {
                j3 = j;
            }
            i12 = Uuid.SIZE_BITS;
            i5 |= i12;
        } else {
            j3 = j;
        }
        if ((i3 & 3072) == 0) {
            if ((i4 & 8) == 0) {
                linearTrackColor = j2;
                if (kk0Var2.g(linearTrackColor)) {
                }
                i5 |= i14;
            } else {
                linearTrackColor = j2;
            }
            i5 |= i14;
        } else {
            linearTrackColor = j2;
        }
        i6 = i4 & 16;
        if (i6 != 0) {
            if ((i3 & 24576) == 0) {
                i7 = i2;
                if (kk0Var2.f(i7)) {
                    i8 = 16384;
                } else {
                    i8 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                }
                i5 |= i8;
            }
            if ((i5 & 9363) == 9362) {
                kk0Var2.X();
                if ((i3 & 1) != 0) {
                    if (i13 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    i9 = i4 & 4;
                    i03Var = i03.a;
                    if (i9 != 0) {
                        linearColor = i03Var.getLinearColor(kk0Var2, 6);
                        i5 &= -897;
                    } else {
                        linearColor = j3;
                    }
                    if ((i4 & 8) != 0) {
                        i5 &= -7169;
                        linearTrackColor = i03Var.getLinearTrackColor(kk0Var2, 6);
                    }
                    if (i6 != 0) {
                        cVar4 = cVar3;
                        j5 = linearColor;
                        i10 = 1;
                        j4 = linearTrackColor;
                    } else {
                        cVar4 = cVar3;
                        j4 = linearTrackColor;
                        i10 = i7;
                        j5 = linearColor;
                    }
                } else {
                    if (i13 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    i9 = i4 & 4;
                    i03Var = i03.a;
                    if (i9 != 0) {
                        linearColor = i03Var.getLinearColor(kk0Var2, 6);
                        i5 &= -897;
                    } else {
                        linearColor = j3;
                    }
                    if ((i4 & 8) != 0) {
                        i5 &= -7169;
                        linearTrackColor = i03Var.getLinearTrackColor(kk0Var2, 6);
                    }
                    if (i6 != 0) {
                        cVar4 = cVar3;
                        j5 = linearColor;
                        i10 = 1;
                        j4 = linearTrackColor;
                    } else {
                        cVar4 = cVar3;
                        j4 = linearTrackColor;
                        i10 = i7;
                        j5 = linearColor;
                    }
                }
                kk0Var2.s();
                kk0Var = kk0Var2;
                m1886xfa561483(je1Var2, cVar4, j5, j4, i10, 4.0f, null, kk0Var, (i5 & 14) | 196608 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (i5 & 57344), 64);
                cVar5 = cVar4;
                j6 = j5;
                j7 = j4;
                i11 = i10;
            } else {
                kk0Var2.X();
                if ((i3 & 1) != 0) {
                    if (i13 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    i9 = i4 & 4;
                    i03Var = i03.a;
                    if (i9 != 0) {
                        linearColor = i03Var.getLinearColor(kk0Var2, 6);
                        i5 &= -897;
                    } else {
                        linearColor = j3;
                    }
                    if ((i4 & 8) != 0) {
                        i5 &= -7169;
                        linearTrackColor = i03Var.getLinearTrackColor(kk0Var2, 6);
                    }
                    if (i6 != 0) {
                        cVar4 = cVar3;
                        j5 = linearColor;
                        i10 = 1;
                        j4 = linearTrackColor;
                    } else {
                        cVar4 = cVar3;
                        j4 = linearTrackColor;
                        i10 = i7;
                        j5 = linearColor;
                    }
                } else {
                    if (i13 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    i9 = i4 & 4;
                    i03Var = i03.a;
                    if (i9 != 0) {
                        linearColor = i03Var.getLinearColor(kk0Var2, 6);
                        i5 &= -897;
                    } else {
                        linearColor = j3;
                    }
                    if ((i4 & 8) != 0) {
                        i5 &= -7169;
                        linearTrackColor = i03Var.getLinearTrackColor(kk0Var2, 6);
                    }
                    if (i6 != 0) {
                        cVar4 = cVar3;
                        j5 = linearColor;
                        i10 = 1;
                        j4 = linearTrackColor;
                    } else {
                        cVar4 = cVar3;
                        j4 = linearTrackColor;
                        i10 = i7;
                        j5 = linearColor;
                    }
                }
                kk0Var2.s();
                kk0Var = kk0Var2;
                m1886xfa561483(je1Var2, cVar4, j5, j4, i10, 4.0f, null, kk0Var, (i5 & 14) | 196608 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (i5 & 57344), 64);
                cVar5 = cVar4;
                j6 = j5;
                j7 = j4;
                i11 = i10;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new t03(je1Var, cVar5, j6, j7, i11, i3, i4));
            }
        }
        i5 |= 24576;
        i7 = i2;
        if ((i5 & 9363) == 9362) {
            kk0Var2.X();
            if ((i3 & 1) != 0) {
                if (i13 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                i9 = i4 & 4;
                i03Var = i03.a;
                if (i9 != 0) {
                    linearColor = i03Var.getLinearColor(kk0Var2, 6);
                    i5 &= -897;
                } else {
                    linearColor = j3;
                }
                if ((i4 & 8) != 0) {
                    i5 &= -7169;
                    linearTrackColor = i03Var.getLinearTrackColor(kk0Var2, 6);
                }
                if (i6 != 0) {
                    cVar4 = cVar3;
                    j5 = linearColor;
                    i10 = 1;
                    j4 = linearTrackColor;
                } else {
                    cVar4 = cVar3;
                    j4 = linearTrackColor;
                    i10 = i7;
                    j5 = linearColor;
                }
            } else {
                if (i13 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                i9 = i4 & 4;
                i03Var = i03.a;
                if (i9 != 0) {
                    linearColor = i03Var.getLinearColor(kk0Var2, 6);
                    i5 &= -897;
                } else {
                    linearColor = j3;
                }
                if ((i4 & 8) != 0) {
                    i5 &= -7169;
                    linearTrackColor = i03Var.getLinearTrackColor(kk0Var2, 6);
                }
                if (i6 != 0) {
                    cVar4 = cVar3;
                    j5 = linearColor;
                    i10 = 1;
                    j4 = linearTrackColor;
                } else {
                    cVar4 = cVar3;
                    j4 = linearTrackColor;
                    i10 = i7;
                    j5 = linearColor;
                }
            }
            kk0Var2.s();
            kk0Var = kk0Var2;
            m1886xfa561483(je1Var2, cVar4, j5, j4, i10, 4.0f, null, kk0Var, (i5 & 14) | 196608 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (i5 & 57344), 64);
            cVar5 = cVar4;
            j6 = j5;
            j7 = j4;
            i11 = i10;
        } else {
            kk0Var2.X();
            if ((i3 & 1) != 0) {
                if (i13 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                i9 = i4 & 4;
                i03Var = i03.a;
                if (i9 != 0) {
                    linearColor = i03Var.getLinearColor(kk0Var2, 6);
                    i5 &= -897;
                } else {
                    linearColor = j3;
                }
                if ((i4 & 8) != 0) {
                    i5 &= -7169;
                    linearTrackColor = i03Var.getLinearTrackColor(kk0Var2, 6);
                }
                if (i6 != 0) {
                    cVar4 = cVar3;
                    j5 = linearColor;
                    i10 = 1;
                    j4 = linearTrackColor;
                } else {
                    cVar4 = cVar3;
                    j4 = linearTrackColor;
                    i10 = i7;
                    j5 = linearColor;
                }
            } else {
                if (i13 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                i9 = i4 & 4;
                i03Var = i03.a;
                if (i9 != 0) {
                    linearColor = i03Var.getLinearColor(kk0Var2, 6);
                    i5 &= -897;
                } else {
                    linearColor = j3;
                }
                if ((i4 & 8) != 0) {
                    i5 &= -7169;
                    linearTrackColor = i03Var.getLinearTrackColor(kk0Var2, 6);
                }
                if (i6 != 0) {
                    cVar4 = cVar3;
                    j5 = linearColor;
                    i10 = 1;
                    j4 = linearTrackColor;
                } else {
                    cVar4 = cVar3;
                    j4 = linearTrackColor;
                    i10 = i7;
                    j5 = linearColor;
                }
            }
            kk0Var2.s();
            kk0Var = kk0Var2;
            m1886xfa561483(je1Var2, cVar4, j5, j4, i10, 4.0f, null, kk0Var, (i5 & 14) | 196608 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (i5 & 57344), 64);
            cVar5 = cVar4;
            j6 = j5;
            j7 = j4;
            i11 = i10;
        }
        w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new t03(je1Var, cVar5, j6, j7, i11, i3, i4));
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0046  */
    /* JADX WARN: Code duplicated, block: B:28:0x004a  */
    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    /* JADX WARN: Code duplicated, block: B:31:0x0055  */
    /* JADX WARN: Code duplicated, block: B:34:0x005b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0061  */
    /* JADX WARN: Code duplicated, block: B:39:0x0065  */
    /* JADX WARN: Code duplicated, block: B:41:0x006d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0070  */
    /* JADX WARN: Code duplicated, block: B:45:0x0076  */
    /* JADX WARN: Code duplicated, block: B:52:0x008a  */
    /* JADX WARN: Code duplicated, block: B:54:0x0091  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ab A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:71:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:79:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:81:? A[RETURN, SYNTHETIC] */
    @cv0
    /* JADX INFO: renamed from: LinearProgressIndicator-eaDK9VM, reason: not valid java name */
    public static final /* synthetic */ void m1890x52e4f77d(float f2, c cVar, long j, long j2, ck0 ck0Var, int i2, int i3) {
        float f3;
        int i4;
        c cVar2;
        long j3;
        long j4;
        c cVar3;
        int i5;
        i03 i03Var;
        long linearColor;
        c cVar4;
        long j5;
        long j6;
        w33 w33VarV;
        int i6;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(-372717133);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
            f3 = f2;
        } else {
            f3 = f2;
            if ((i2 & 6) == 0) {
                i4 = (kk0Var.e(f3) ? 4 : 2) | i2;
            } else {
                i4 = i2;
            }
        }
        int i7 = i3 & 2;
        if (i7 == 0) {
            if ((i2 & 48) == 0) {
                cVar2 = cVar;
                i4 |= kk0Var.h(cVar2) ? 32 : 16;
            }
            if ((i2 & 384) == 0) {
                if ((i3 & 4) == 0) {
                    j3 = j;
                    if (kk0Var.g(j3)) {
                        i6 = FontInfo.NUMBER_OF_CHAR_CODES;
                    }
                    i4 |= i6;
                } else {
                    j3 = j;
                }
                i6 = Uuid.SIZE_BITS;
                i4 |= i6;
            } else {
                j3 = j;
            }
            if ((i2 & 3072) == 0) {
                if ((i3 & 8) == 0) {
                    j4 = j2;
                    int i8 = kk0Var.g(j4) ? 2048 : 1024;
                    i4 |= i8;
                } else {
                    j4 = j2;
                }
                i4 |= i8;
            } else {
                j4 = j2;
            }
            if ((i4 & 1171) == 1170 || !kk0Var.F()) {
                kk0Var.X();
                if ((i2 & 1) != 0 || kk0Var.D()) {
                    if (i7 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    i5 = i3 & 4;
                    i03Var = i03.a;
                    if (i5 != 0) {
                        linearColor = i03Var.getLinearColor(kk0Var, 6);
                        i4 &= -897;
                    } else {
                        linearColor = j3;
                    }
                    if ((i3 & 8) != 0) {
                        long linearTrackColor = i03Var.getLinearTrackColor(kk0Var, 6);
                        i4 &= -7169;
                        cVar4 = cVar3;
                        j5 = linearColor;
                        j6 = linearTrackColor;
                    } else {
                        cVar4 = cVar3;
                        j5 = linearColor;
                    }
                    kk0Var.s();
                    m1888xcc3f5c16(f3, cVar4, j5, j6, 1, kk0Var, (i4 & 14) | 24576 | (i4 & 112) | (i4 & 896) | (i4 & 7168), 0);
                    cVar2 = cVar4;
                    j3 = j5;
                    j4 = j6;
                } else {
                    kk0Var.V();
                    if ((i3 & 4) != 0) {
                        i4 &= -897;
                    }
                    if ((i3 & 8) != 0) {
                        i4 &= -7169;
                    }
                    cVar4 = cVar2;
                    j5 = j3;
                }
                j6 = j4;
                kk0Var.s();
                m1888xcc3f5c16(f3, cVar4, j5, j6, 1, kk0Var, (i4 & 14) | 24576 | (i4 & 112) | (i4 & 896) | (i4 & 7168), 0);
                cVar2 = cVar4;
                j3 = j5;
                j4 = j6;
            } else {
                kk0Var.V();
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new r03(f2, cVar2, j3, j4, i2, i3));
            }
        }
        i4 |= 48;
        cVar2 = cVar;
        if ((i2 & 384) == 0) {
            if ((i3 & 4) == 0) {
                j3 = j;
                if (kk0Var.g(j3)) {
                    i6 = FontInfo.NUMBER_OF_CHAR_CODES;
                }
                i4 |= i6;
            } else {
                j3 = j;
            }
            i6 = Uuid.SIZE_BITS;
            i4 |= i6;
        } else {
            j3 = j;
        }
        if ((i2 & 3072) == 0) {
            if ((i3 & 8) == 0) {
                j4 = j2;
                if (kk0Var.g(j4)) {
                }
                i4 |= i8;
            } else {
                j4 = j2;
            }
            i4 |= i8;
        } else {
            j4 = j2;
        }
        if ((i4 & 1171) == 1170) {
            kk0Var.X();
            if ((i2 & 1) != 0) {
                if (i7 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                i5 = i3 & 4;
                i03Var = i03.a;
                if (i5 != 0) {
                    linearColor = i03Var.getLinearColor(kk0Var, 6);
                    i4 &= -897;
                } else {
                    linearColor = j3;
                }
                if ((i3 & 8) != 0) {
                    long linearTrackColor2 = i03Var.getLinearTrackColor(kk0Var, 6);
                    i4 &= -7169;
                    cVar4 = cVar3;
                    j5 = linearColor;
                    j6 = linearTrackColor2;
                } else {
                    cVar4 = cVar3;
                    j5 = linearColor;
                    j6 = j4;
                }
            } else {
                if (i7 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                i5 = i3 & 4;
                i03Var = i03.a;
                if (i5 != 0) {
                    linearColor = i03Var.getLinearColor(kk0Var, 6);
                    i4 &= -897;
                } else {
                    linearColor = j3;
                }
                if ((i3 & 8) != 0) {
                    long linearTrackColor3 = i03Var.getLinearTrackColor(kk0Var, 6);
                    i4 &= -7169;
                    cVar4 = cVar3;
                    j5 = linearColor;
                    j6 = linearTrackColor3;
                } else {
                    cVar4 = cVar3;
                    j5 = linearColor;
                    j6 = j4;
                }
            }
            kk0Var.s();
            m1888xcc3f5c16(f3, cVar4, j5, j6, 1, kk0Var, (i4 & 14) | 24576 | (i4 & 112) | (i4 & 896) | (i4 & 7168), 0);
            cVar2 = cVar4;
            j3 = j5;
            j4 = j6;
        } else {
            kk0Var.X();
            if ((i2 & 1) != 0) {
                if (i7 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                i5 = i3 & 4;
                i03Var = i03.a;
                if (i5 != 0) {
                    linearColor = i03Var.getLinearColor(kk0Var, 6);
                    i4 &= -897;
                } else {
                    linearColor = j3;
                }
                if ((i3 & 8) != 0) {
                    long linearTrackColor4 = i03Var.getLinearTrackColor(kk0Var, 6);
                    i4 &= -7169;
                    cVar4 = cVar3;
                    j5 = linearColor;
                    j6 = linearTrackColor4;
                } else {
                    cVar4 = cVar3;
                    j5 = linearColor;
                    j6 = j4;
                }
            } else {
                if (i7 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                i5 = i3 & 4;
                i03Var = i03.a;
                if (i5 != 0) {
                    linearColor = i03Var.getLinearColor(kk0Var, 6);
                    i4 &= -897;
                } else {
                    linearColor = j3;
                }
                if ((i3 & 8) != 0) {
                    long linearTrackColor5 = i03Var.getLinearTrackColor(kk0Var, 6);
                    i4 &= -7169;
                    cVar4 = cVar3;
                    j5 = linearColor;
                    j6 = linearTrackColor5;
                } else {
                    cVar4 = cVar3;
                    j5 = linearColor;
                    j6 = j4;
                }
            }
            kk0Var.s();
            m1888xcc3f5c16(f3, cVar4, j5, j6, 1, kk0Var, (i4 & 14) | 24576 | (i4 & 112) | (i4 & 896) | (i4 & 7168), 0);
            cVar2 = cVar4;
            j3 = j5;
            j4 = j6;
        }
        w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new r03(f2, cVar2, j3, j4, i2, i3));
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x023c  */
    /* JADX WARN: Code duplicated, block: B:107:0x0251  */
    /* JADX WARN: Code duplicated, block: B:109:0x0257  */
    /* JADX WARN: Code duplicated, block: B:115:0x0270  */
    /* JADX WARN: Code duplicated, block: B:119:0x027c  */
    /* JADX WARN: Code duplicated, block: B:123:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x0087  */
    /* JADX WARN: Code duplicated, block: B:48:0x008c  */
    /* JADX WARN: Code duplicated, block: B:50:0x0090  */
    /* JADX WARN: Code duplicated, block: B:52:0x0098  */
    /* JADX WARN: Code duplicated, block: B:53:0x009b  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d6 A[PHI: r3 r5 r9 r12 r15
  0x00d6: PHI (r3v6 androidx.compose.ui.c) = (r3v3 androidx.compose.ui.c), (r3v9 androidx.compose.ui.c) binds: [B:87:0x00fe, B:72:0x00d5] A[DONT_GENERATE, DONT_INLINE]
  0x00d6: PHI (r5v23 int) = (r5v14 int), (r5v25 int) binds: [B:87:0x00fe, B:72:0x00d5] A[DONT_GENERATE, DONT_INLINE]
  0x00d6: PHI (r9v5 long) = (r9v2 long), (r9v1 long) binds: [B:87:0x00fe, B:72:0x00d5] A[DONT_GENERATE, DONT_INLINE]
  0x00d6: PHI (r12v5 long) = (r12v2 long), (r12v1 long) binds: [B:87:0x00fe, B:72:0x00d5] A[DONT_GENERATE, DONT_INLINE]
  0x00d6: PHI (r15v25 int) = (r15v3 int), (r15v2 int) binds: [B:87:0x00fe, B:72:0x00d5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:75:0x00db A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:81:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:86:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:88:0x0100  */
    /* JADX WARN: Code duplicated, block: B:91:0x021a  */
    /* JADX WARN: Code duplicated, block: B:92:0x021c  */
    /* JADX WARN: Code duplicated, block: B:95:0x0225  */
    /* JADX WARN: Code duplicated, block: B:96:0x0227  */
    /* JADX WARN: Code duplicated, block: B:99:0x0236  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: LinearProgressIndicator-rIrjwxo, reason: not valid java name */
    public static final void m1891xdc38e88f(c cVar, long j, long j2, int i2, float f2, ck0 ck0Var, int i3, int i4) {
        c cVar2;
        int i5;
        long linearColor;
        long linearTrackColor;
        int i6;
        int i7;
        float f3;
        int i8;
        c cVar3;
        int i9;
        i03 i03Var;
        int i10;
        float f4;
        int i11;
        gn3 gn3VarAnimateFloat;
        gn3 gn3VarAnimateFloat2;
        gn3 gn3VarAnimateFloat3;
        gn3 gn3VarAnimateFloat4;
        boolean z;
        boolean z2;
        boolean zH;
        Object objP;
        long j3;
        long j4;
        c cVar4;
        kk0 kk0Var;
        int i12;
        float f5;
        long j5;
        long j6;
        w33 w33VarV;
        Float fValueOf = Float.valueOf(1.0f);
        Float fValueOf2 = Float.valueOf(0.0f);
        kk0 kk0Var2 = (kk0) ck0Var;
        kk0Var2.c0(567589233);
        int i13 = i4 & 1;
        if (i13 != 0) {
            i5 = i3 | 6;
            cVar2 = cVar;
        } else if ((i3 & 6) == 0) {
            cVar2 = cVar;
            i5 = (kk0Var2.h(cVar2) ? 4 : 2) | i3;
        } else {
            cVar2 = cVar;
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            linearColor = j;
            i5 |= ((i4 & 2) == 0 && kk0Var2.g(linearColor)) ? 32 : 16;
        } else {
            linearColor = j;
        }
        if ((i3 & 384) == 0) {
            linearTrackColor = j2;
            i5 |= ((i4 & 4) == 0 && kk0Var2.g(linearTrackColor)) ? FontInfo.NUMBER_OF_CHAR_CODES : Uuid.SIZE_BITS;
        } else {
            linearTrackColor = j2;
        }
        int i14 = i4 & 8;
        if (i14 == 0) {
            if ((i3 & 3072) == 0) {
                i6 = i2;
                i5 |= kk0Var2.f(i6) ? 2048 : 1024;
            }
            i7 = i4 & 16;
            if (i7 != 0) {
                if ((i3 & 24576) == 0) {
                    f3 = f2;
                    if (kk0Var2.e(f3)) {
                        i8 = 16384;
                    } else {
                        i8 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                    }
                    i5 |= i8;
                }
                if ((i5 & 9363) == 9362 || !kk0Var2.F()) {
                    kk0Var2.X();
                    if ((i3 & 1) != 0 || kk0Var2.D()) {
                        if (i13 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        i9 = i4 & 2;
                        i03Var = i03.a;
                        if (i9 != 0) {
                            i10 = 6;
                            linearColor = i03Var.getLinearColor(kk0Var2, 6);
                            i5 &= -113;
                        } else {
                            i10 = 6;
                        }
                        if ((i4 & 4) != 0) {
                            linearTrackColor = i03Var.getLinearTrackColor(kk0Var2, i10);
                            i5 &= -897;
                        }
                        if (i14 != 0) {
                            i6 = 1;
                        }
                        if (i7 != 0) {
                            f4 = 4.0f;
                        }
                        i11 = i6;
                        kk0Var2.s();
                        go1 go1VarRememberInfiniteTransition = io1.rememberInfiniteTransition(null, kk0Var2, 0, 1);
                        kn4 kn4Var = new kn4(6);
                        kn4Var.b = 1800;
                        kn4Var.c(fValueOf2, 0).b = e;
                        kn4Var.c(fValueOf, 750);
                        gn3VarAnimateFloat = io1.animateFloat(go1VarRememberInfiniteTransition, 0.0f, 1.0f, kr1.N(new bw1(kn4Var), 6), null, kk0Var2, 4536, 8);
                        kn4 kn4Var2 = new kn4(6);
                        kn4Var2.b = 1800;
                        kn4Var2.c(fValueOf2, 333).b = f;
                        kn4Var2.c(fValueOf, 1183);
                        gn3VarAnimateFloat2 = io1.animateFloat(go1VarRememberInfiniteTransition, 0.0f, 1.0f, kr1.N(new bw1(kn4Var2), 6), null, kk0Var2, 4536, 8);
                        kn4 kn4Var3 = new kn4(6);
                        kn4Var3.b = 1800;
                        kn4Var3.c(fValueOf2, 1000).b = g;
                        kn4Var3.c(fValueOf, 1567);
                        gn3VarAnimateFloat3 = io1.animateFloat(go1VarRememberInfiniteTransition, 0.0f, 1.0f, kr1.N(new bw1(kn4Var3), 6), null, kk0Var2, 4536, 8);
                        kn4 kn4Var4 = new kn4(6);
                        kn4Var4.b = 1800;
                        kn4Var4.c(fValueOf2, 1267).b = h;
                        kn4Var4.c(fValueOf, 1800);
                        gn3VarAnimateFloat4 = io1.animateFloat(go1VarRememberInfiniteTransition, 0.0f, 1.0f, kr1.N(new bw1(kn4Var4), 6), null, kk0Var2, 4536, 8);
                        c cVarK = d.k(we3.b(cVar3.then(a), true, xq2.x), b, c);
                        if ((i5 & 7168) == 2048) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if ((57344 & i5) == 16384) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        zH = z | z2 | kk0Var2.h(gn3VarAnimateFloat) | ((((i5 & 896) ^ 384) <= 256 && kk0Var2.g(linearTrackColor)) || (i5 & 384) == 256) | kk0Var2.h(gn3VarAnimateFloat2) | ((((i5 & 112) ^ 48) <= 32 && kk0Var2.g(linearColor)) || (i5 & 48) == 32) | kk0Var2.h(gn3VarAnimateFloat3) | kk0Var2.h(gn3VarAnimateFloat4);
                        objP = kk0Var2.P();
                        if (!zH || objP == Composer$Companion.getEmpty()) {
                            j3 = linearColor;
                            j4 = linearTrackColor;
                            objP = new y03(i11, f4, gn3VarAnimateFloat, j4, gn3VarAnimateFloat2, j3, gn3VarAnimateFloat3, gn3VarAnimateFloat4);
                            kk0Var2.l0(objP);
                        } else {
                            j3 = linearColor;
                            j4 = linearTrackColor;
                        }
                        c10.Canvas(cVarK, (le1) objP, kk0Var2, 0);
                        cVar4 = cVar3;
                        kk0Var = kk0Var2;
                        i12 = i11;
                        f5 = f4;
                        j5 = j4;
                        j6 = j3;
                    } else {
                        kk0Var2.V();
                        if ((i4 & 2) != 0) {
                            i5 &= -113;
                        }
                        if ((i4 & 4) != 0) {
                            i5 &= -897;
                        }
                        cVar3 = cVar2;
                    }
                    f4 = f3;
                    i11 = i6;
                    kk0Var2.s();
                    go1 go1VarRememberInfiniteTransition2 = io1.rememberInfiniteTransition(null, kk0Var2, 0, 1);
                    kn4 kn4Var5 = new kn4(6);
                    kn4Var5.b = 1800;
                    kn4Var5.c(fValueOf2, 0).b = e;
                    kn4Var5.c(fValueOf, 750);
                    gn3VarAnimateFloat = io1.animateFloat(go1VarRememberInfiniteTransition2, 0.0f, 1.0f, kr1.N(new bw1(kn4Var5), 6), null, kk0Var2, 4536, 8);
                    kn4 kn4Var6 = new kn4(6);
                    kn4Var6.b = 1800;
                    kn4Var6.c(fValueOf2, 333).b = f;
                    kn4Var6.c(fValueOf, 1183);
                    gn3VarAnimateFloat2 = io1.animateFloat(go1VarRememberInfiniteTransition2, 0.0f, 1.0f, kr1.N(new bw1(kn4Var6), 6), null, kk0Var2, 4536, 8);
                    kn4 kn4Var7 = new kn4(6);
                    kn4Var7.b = 1800;
                    kn4Var7.c(fValueOf2, 1000).b = g;
                    kn4Var7.c(fValueOf, 1567);
                    gn3VarAnimateFloat3 = io1.animateFloat(go1VarRememberInfiniteTransition2, 0.0f, 1.0f, kr1.N(new bw1(kn4Var7), 6), null, kk0Var2, 4536, 8);
                    kn4 kn4Var8 = new kn4(6);
                    kn4Var8.b = 1800;
                    kn4Var8.c(fValueOf2, 1267).b = h;
                    kn4Var8.c(fValueOf, 1800);
                    gn3VarAnimateFloat4 = io1.animateFloat(go1VarRememberInfiniteTransition2, 0.0f, 1.0f, kr1.N(new bw1(kn4Var8), 6), null, kk0Var2, 4536, 8);
                    c cVarK2 = d.k(we3.b(cVar3.then(a), true, xq2.x), b, c);
                    if ((i5 & 7168) == 2048) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if ((57344 & i5) == 16384) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    zH = z | z2 | kk0Var2.h(gn3VarAnimateFloat) | ((((i5 & 896) ^ 384) <= 256 && kk0Var2.g(linearTrackColor)) || (i5 & 384) == 256) | kk0Var2.h(gn3VarAnimateFloat2) | ((((i5 & 112) ^ 48) <= 32 && kk0Var2.g(linearColor)) || (i5 & 48) == 32) | kk0Var2.h(gn3VarAnimateFloat3) | kk0Var2.h(gn3VarAnimateFloat4);
                    objP = kk0Var2.P();
                    if (zH) {
                        j3 = linearColor;
                        j4 = linearTrackColor;
                        objP = new y03(i11, f4, gn3VarAnimateFloat, j4, gn3VarAnimateFloat2, j3, gn3VarAnimateFloat3, gn3VarAnimateFloat4);
                        kk0Var2.l0(objP);
                    } else {
                        j3 = linearColor;
                        j4 = linearTrackColor;
                        objP = new y03(i11, f4, gn3VarAnimateFloat, j4, gn3VarAnimateFloat2, j3, gn3VarAnimateFloat3, gn3VarAnimateFloat4);
                        kk0Var2.l0(objP);
                    }
                    c10.Canvas(cVarK2, (le1) objP, kk0Var2, 0);
                    cVar4 = cVar3;
                    kk0Var = kk0Var2;
                    i12 = i11;
                    f5 = f4;
                    j5 = j4;
                    j6 = j3;
                } else {
                    kk0Var2.V();
                    kk0Var = kk0Var2;
                    cVar4 = cVar2;
                    j6 = linearColor;
                    f5 = f3;
                    j5 = linearTrackColor;
                    i12 = i6;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new n03(cVar4, j6, j5, i12, f5, i3, i4));
                }
            }
            i5 |= 24576;
            f3 = f2;
            if ((i5 & 9363) == 9362) {
                kk0Var2.X();
                if ((i3 & 1) != 0) {
                    if (i13 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    i9 = i4 & 2;
                    i03Var = i03.a;
                    if (i9 != 0) {
                        i10 = 6;
                        linearColor = i03Var.getLinearColor(kk0Var2, 6);
                        i5 &= -113;
                    } else {
                        i10 = 6;
                    }
                    if ((i4 & 4) != 0) {
                        linearTrackColor = i03Var.getLinearTrackColor(kk0Var2, i10);
                        i5 &= -897;
                    }
                    if (i14 != 0) {
                        i6 = 1;
                    }
                    if (i7 != 0) {
                        f4 = 4.0f;
                    } else {
                        f4 = f3;
                    }
                } else {
                    if (i13 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    i9 = i4 & 2;
                    i03Var = i03.a;
                    if (i9 != 0) {
                        i10 = 6;
                        linearColor = i03Var.getLinearColor(kk0Var2, 6);
                        i5 &= -113;
                    } else {
                        i10 = 6;
                    }
                    if ((i4 & 4) != 0) {
                        linearTrackColor = i03Var.getLinearTrackColor(kk0Var2, i10);
                        i5 &= -897;
                    }
                    if (i14 != 0) {
                        i6 = 1;
                    }
                    if (i7 != 0) {
                        f4 = 4.0f;
                    } else {
                        f4 = f3;
                    }
                }
                i11 = i6;
                kk0Var2.s();
                go1 go1VarRememberInfiniteTransition3 = io1.rememberInfiniteTransition(null, kk0Var2, 0, 1);
                kn4 kn4Var9 = new kn4(6);
                kn4Var9.b = 1800;
                kn4Var9.c(fValueOf2, 0).b = e;
                kn4Var9.c(fValueOf, 750);
                gn3VarAnimateFloat = io1.animateFloat(go1VarRememberInfiniteTransition3, 0.0f, 1.0f, kr1.N(new bw1(kn4Var9), 6), null, kk0Var2, 4536, 8);
                kn4 kn4Var10 = new kn4(6);
                kn4Var10.b = 1800;
                kn4Var10.c(fValueOf2, 333).b = f;
                kn4Var10.c(fValueOf, 1183);
                gn3VarAnimateFloat2 = io1.animateFloat(go1VarRememberInfiniteTransition3, 0.0f, 1.0f, kr1.N(new bw1(kn4Var10), 6), null, kk0Var2, 4536, 8);
                kn4 kn4Var11 = new kn4(6);
                kn4Var11.b = 1800;
                kn4Var11.c(fValueOf2, 1000).b = g;
                kn4Var11.c(fValueOf, 1567);
                gn3VarAnimateFloat3 = io1.animateFloat(go1VarRememberInfiniteTransition3, 0.0f, 1.0f, kr1.N(new bw1(kn4Var11), 6), null, kk0Var2, 4536, 8);
                kn4 kn4Var12 = new kn4(6);
                kn4Var12.b = 1800;
                kn4Var12.c(fValueOf2, 1267).b = h;
                kn4Var12.c(fValueOf, 1800);
                gn3VarAnimateFloat4 = io1.animateFloat(go1VarRememberInfiniteTransition3, 0.0f, 1.0f, kr1.N(new bw1(kn4Var12), 6), null, kk0Var2, 4536, 8);
                c cVarK3 = d.k(we3.b(cVar3.then(a), true, xq2.x), b, c);
                if ((i5 & 7168) == 2048) {
                    z = true;
                } else {
                    z = false;
                }
                if ((57344 & i5) == 16384) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                zH = z | z2 | kk0Var2.h(gn3VarAnimateFloat) | ((((i5 & 896) ^ 384) <= 256 && kk0Var2.g(linearTrackColor)) || (i5 & 384) == 256) | kk0Var2.h(gn3VarAnimateFloat2) | ((((i5 & 112) ^ 48) <= 32 && kk0Var2.g(linearColor)) || (i5 & 48) == 32) | kk0Var2.h(gn3VarAnimateFloat3) | kk0Var2.h(gn3VarAnimateFloat4);
                objP = kk0Var2.P();
                if (zH) {
                    j3 = linearColor;
                    j4 = linearTrackColor;
                    objP = new y03(i11, f4, gn3VarAnimateFloat, j4, gn3VarAnimateFloat2, j3, gn3VarAnimateFloat3, gn3VarAnimateFloat4);
                    kk0Var2.l0(objP);
                } else {
                    j3 = linearColor;
                    j4 = linearTrackColor;
                    objP = new y03(i11, f4, gn3VarAnimateFloat, j4, gn3VarAnimateFloat2, j3, gn3VarAnimateFloat3, gn3VarAnimateFloat4);
                    kk0Var2.l0(objP);
                }
                c10.Canvas(cVarK3, (le1) objP, kk0Var2, 0);
                cVar4 = cVar3;
                kk0Var = kk0Var2;
                i12 = i11;
                f5 = f4;
                j5 = j4;
                j6 = j3;
            } else {
                kk0Var2.X();
                if ((i3 & 1) != 0) {
                    if (i13 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    i9 = i4 & 2;
                    i03Var = i03.a;
                    if (i9 != 0) {
                        i10 = 6;
                        linearColor = i03Var.getLinearColor(kk0Var2, 6);
                        i5 &= -113;
                    } else {
                        i10 = 6;
                    }
                    if ((i4 & 4) != 0) {
                        linearTrackColor = i03Var.getLinearTrackColor(kk0Var2, i10);
                        i5 &= -897;
                    }
                    if (i14 != 0) {
                        i6 = 1;
                    }
                    if (i7 != 0) {
                        f4 = 4.0f;
                    } else {
                        f4 = f3;
                    }
                } else {
                    if (i13 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    i9 = i4 & 2;
                    i03Var = i03.a;
                    if (i9 != 0) {
                        i10 = 6;
                        linearColor = i03Var.getLinearColor(kk0Var2, 6);
                        i5 &= -113;
                    } else {
                        i10 = 6;
                    }
                    if ((i4 & 4) != 0) {
                        linearTrackColor = i03Var.getLinearTrackColor(kk0Var2, i10);
                        i5 &= -897;
                    }
                    if (i14 != 0) {
                        i6 = 1;
                    }
                    if (i7 != 0) {
                        f4 = 4.0f;
                    } else {
                        f4 = f3;
                    }
                }
                i11 = i6;
                kk0Var2.s();
                go1 go1VarRememberInfiniteTransition4 = io1.rememberInfiniteTransition(null, kk0Var2, 0, 1);
                kn4 kn4Var13 = new kn4(6);
                kn4Var13.b = 1800;
                kn4Var13.c(fValueOf2, 0).b = e;
                kn4Var13.c(fValueOf, 750);
                gn3VarAnimateFloat = io1.animateFloat(go1VarRememberInfiniteTransition4, 0.0f, 1.0f, kr1.N(new bw1(kn4Var13), 6), null, kk0Var2, 4536, 8);
                kn4 kn4Var14 = new kn4(6);
                kn4Var14.b = 1800;
                kn4Var14.c(fValueOf2, 333).b = f;
                kn4Var14.c(fValueOf, 1183);
                gn3VarAnimateFloat2 = io1.animateFloat(go1VarRememberInfiniteTransition4, 0.0f, 1.0f, kr1.N(new bw1(kn4Var14), 6), null, kk0Var2, 4536, 8);
                kn4 kn4Var15 = new kn4(6);
                kn4Var15.b = 1800;
                kn4Var15.c(fValueOf2, 1000).b = g;
                kn4Var15.c(fValueOf, 1567);
                gn3VarAnimateFloat3 = io1.animateFloat(go1VarRememberInfiniteTransition4, 0.0f, 1.0f, kr1.N(new bw1(kn4Var15), 6), null, kk0Var2, 4536, 8);
                kn4 kn4Var16 = new kn4(6);
                kn4Var16.b = 1800;
                kn4Var16.c(fValueOf2, 1267).b = h;
                kn4Var16.c(fValueOf, 1800);
                gn3VarAnimateFloat4 = io1.animateFloat(go1VarRememberInfiniteTransition4, 0.0f, 1.0f, kr1.N(new bw1(kn4Var16), 6), null, kk0Var2, 4536, 8);
                c cVarK4 = d.k(we3.b(cVar3.then(a), true, xq2.x), b, c);
                if ((i5 & 7168) == 2048) {
                    z = true;
                } else {
                    z = false;
                }
                if ((57344 & i5) == 16384) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                zH = z | z2 | kk0Var2.h(gn3VarAnimateFloat) | ((((i5 & 896) ^ 384) <= 256 && kk0Var2.g(linearTrackColor)) || (i5 & 384) == 256) | kk0Var2.h(gn3VarAnimateFloat2) | ((((i5 & 112) ^ 48) <= 32 && kk0Var2.g(linearColor)) || (i5 & 48) == 32) | kk0Var2.h(gn3VarAnimateFloat3) | kk0Var2.h(gn3VarAnimateFloat4);
                objP = kk0Var2.P();
                if (zH) {
                    j3 = linearColor;
                    j4 = linearTrackColor;
                    objP = new y03(i11, f4, gn3VarAnimateFloat, j4, gn3VarAnimateFloat2, j3, gn3VarAnimateFloat3, gn3VarAnimateFloat4);
                    kk0Var2.l0(objP);
                } else {
                    j3 = linearColor;
                    j4 = linearTrackColor;
                    objP = new y03(i11, f4, gn3VarAnimateFloat, j4, gn3VarAnimateFloat2, j3, gn3VarAnimateFloat3, gn3VarAnimateFloat4);
                    kk0Var2.l0(objP);
                }
                c10.Canvas(cVarK4, (le1) objP, kk0Var2, 0);
                cVar4 = cVar3;
                kk0Var = kk0Var2;
                i12 = i11;
                f5 = f4;
                j5 = j4;
                j6 = j3;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new n03(cVar4, j6, j5, i12, f5, i3, i4));
            }
        }
        i5 |= 3072;
        i6 = i2;
        i7 = i4 & 16;
        if (i7 != 0) {
            if ((i3 & 24576) == 0) {
                f3 = f2;
                if (kk0Var2.e(f3)) {
                    i8 = 16384;
                } else {
                    i8 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                }
                i5 |= i8;
            }
            if ((i5 & 9363) == 9362) {
                kk0Var2.X();
                if ((i3 & 1) != 0) {
                    if (i13 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    i9 = i4 & 2;
                    i03Var = i03.a;
                    if (i9 != 0) {
                        i10 = 6;
                        linearColor = i03Var.getLinearColor(kk0Var2, 6);
                        i5 &= -113;
                    } else {
                        i10 = 6;
                    }
                    if ((i4 & 4) != 0) {
                        linearTrackColor = i03Var.getLinearTrackColor(kk0Var2, i10);
                        i5 &= -897;
                    }
                    if (i14 != 0) {
                        i6 = 1;
                    }
                    if (i7 != 0) {
                        f4 = 4.0f;
                    } else {
                        f4 = f3;
                    }
                } else {
                    if (i13 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    i9 = i4 & 2;
                    i03Var = i03.a;
                    if (i9 != 0) {
                        i10 = 6;
                        linearColor = i03Var.getLinearColor(kk0Var2, 6);
                        i5 &= -113;
                    } else {
                        i10 = 6;
                    }
                    if ((i4 & 4) != 0) {
                        linearTrackColor = i03Var.getLinearTrackColor(kk0Var2, i10);
                        i5 &= -897;
                    }
                    if (i14 != 0) {
                        i6 = 1;
                    }
                    if (i7 != 0) {
                        f4 = 4.0f;
                    } else {
                        f4 = f3;
                    }
                }
                i11 = i6;
                kk0Var2.s();
                go1 go1VarRememberInfiniteTransition5 = io1.rememberInfiniteTransition(null, kk0Var2, 0, 1);
                kn4 kn4Var17 = new kn4(6);
                kn4Var17.b = 1800;
                kn4Var17.c(fValueOf2, 0).b = e;
                kn4Var17.c(fValueOf, 750);
                gn3VarAnimateFloat = io1.animateFloat(go1VarRememberInfiniteTransition5, 0.0f, 1.0f, kr1.N(new bw1(kn4Var17), 6), null, kk0Var2, 4536, 8);
                kn4 kn4Var18 = new kn4(6);
                kn4Var18.b = 1800;
                kn4Var18.c(fValueOf2, 333).b = f;
                kn4Var18.c(fValueOf, 1183);
                gn3VarAnimateFloat2 = io1.animateFloat(go1VarRememberInfiniteTransition5, 0.0f, 1.0f, kr1.N(new bw1(kn4Var18), 6), null, kk0Var2, 4536, 8);
                kn4 kn4Var19 = new kn4(6);
                kn4Var19.b = 1800;
                kn4Var19.c(fValueOf2, 1000).b = g;
                kn4Var19.c(fValueOf, 1567);
                gn3VarAnimateFloat3 = io1.animateFloat(go1VarRememberInfiniteTransition5, 0.0f, 1.0f, kr1.N(new bw1(kn4Var19), 6), null, kk0Var2, 4536, 8);
                kn4 kn4Var110 = new kn4(6);
                kn4Var110.b = 1800;
                kn4Var110.c(fValueOf2, 1267).b = h;
                kn4Var110.c(fValueOf, 1800);
                gn3VarAnimateFloat4 = io1.animateFloat(go1VarRememberInfiniteTransition5, 0.0f, 1.0f, kr1.N(new bw1(kn4Var110), 6), null, kk0Var2, 4536, 8);
                c cVarK5 = d.k(we3.b(cVar3.then(a), true, xq2.x), b, c);
                if ((i5 & 7168) == 2048) {
                    z = true;
                } else {
                    z = false;
                }
                if ((57344 & i5) == 16384) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                zH = z | z2 | kk0Var2.h(gn3VarAnimateFloat) | ((((i5 & 896) ^ 384) <= 256 && kk0Var2.g(linearTrackColor)) || (i5 & 384) == 256) | kk0Var2.h(gn3VarAnimateFloat2) | ((((i5 & 112) ^ 48) <= 32 && kk0Var2.g(linearColor)) || (i5 & 48) == 32) | kk0Var2.h(gn3VarAnimateFloat3) | kk0Var2.h(gn3VarAnimateFloat4);
                objP = kk0Var2.P();
                if (zH) {
                    j3 = linearColor;
                    j4 = linearTrackColor;
                    objP = new y03(i11, f4, gn3VarAnimateFloat, j4, gn3VarAnimateFloat2, j3, gn3VarAnimateFloat3, gn3VarAnimateFloat4);
                    kk0Var2.l0(objP);
                } else {
                    j3 = linearColor;
                    j4 = linearTrackColor;
                    objP = new y03(i11, f4, gn3VarAnimateFloat, j4, gn3VarAnimateFloat2, j3, gn3VarAnimateFloat3, gn3VarAnimateFloat4);
                    kk0Var2.l0(objP);
                }
                c10.Canvas(cVarK5, (le1) objP, kk0Var2, 0);
                cVar4 = cVar3;
                kk0Var = kk0Var2;
                i12 = i11;
                f5 = f4;
                j5 = j4;
                j6 = j3;
            } else {
                kk0Var2.X();
                if ((i3 & 1) != 0) {
                    if (i13 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    i9 = i4 & 2;
                    i03Var = i03.a;
                    if (i9 != 0) {
                        i10 = 6;
                        linearColor = i03Var.getLinearColor(kk0Var2, 6);
                        i5 &= -113;
                    } else {
                        i10 = 6;
                    }
                    if ((i4 & 4) != 0) {
                        linearTrackColor = i03Var.getLinearTrackColor(kk0Var2, i10);
                        i5 &= -897;
                    }
                    if (i14 != 0) {
                        i6 = 1;
                    }
                    if (i7 != 0) {
                        f4 = 4.0f;
                    } else {
                        f4 = f3;
                    }
                } else {
                    if (i13 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    i9 = i4 & 2;
                    i03Var = i03.a;
                    if (i9 != 0) {
                        i10 = 6;
                        linearColor = i03Var.getLinearColor(kk0Var2, 6);
                        i5 &= -113;
                    } else {
                        i10 = 6;
                    }
                    if ((i4 & 4) != 0) {
                        linearTrackColor = i03Var.getLinearTrackColor(kk0Var2, i10);
                        i5 &= -897;
                    }
                    if (i14 != 0) {
                        i6 = 1;
                    }
                    if (i7 != 0) {
                        f4 = 4.0f;
                    } else {
                        f4 = f3;
                    }
                }
                i11 = i6;
                kk0Var2.s();
                go1 go1VarRememberInfiniteTransition6 = io1.rememberInfiniteTransition(null, kk0Var2, 0, 1);
                kn4 kn4Var111 = new kn4(6);
                kn4Var111.b = 1800;
                kn4Var111.c(fValueOf2, 0).b = e;
                kn4Var111.c(fValueOf, 750);
                gn3VarAnimateFloat = io1.animateFloat(go1VarRememberInfiniteTransition6, 0.0f, 1.0f, kr1.N(new bw1(kn4Var111), 6), null, kk0Var2, 4536, 8);
                kn4 kn4Var112 = new kn4(6);
                kn4Var112.b = 1800;
                kn4Var112.c(fValueOf2, 333).b = f;
                kn4Var112.c(fValueOf, 1183);
                gn3VarAnimateFloat2 = io1.animateFloat(go1VarRememberInfiniteTransition6, 0.0f, 1.0f, kr1.N(new bw1(kn4Var112), 6), null, kk0Var2, 4536, 8);
                kn4 kn4Var113 = new kn4(6);
                kn4Var113.b = 1800;
                kn4Var113.c(fValueOf2, 1000).b = g;
                kn4Var113.c(fValueOf, 1567);
                gn3VarAnimateFloat3 = io1.animateFloat(go1VarRememberInfiniteTransition6, 0.0f, 1.0f, kr1.N(new bw1(kn4Var113), 6), null, kk0Var2, 4536, 8);
                kn4 kn4Var114 = new kn4(6);
                kn4Var114.b = 1800;
                kn4Var114.c(fValueOf2, 1267).b = h;
                kn4Var114.c(fValueOf, 1800);
                gn3VarAnimateFloat4 = io1.animateFloat(go1VarRememberInfiniteTransition6, 0.0f, 1.0f, kr1.N(new bw1(kn4Var114), 6), null, kk0Var2, 4536, 8);
                c cVarK6 = d.k(we3.b(cVar3.then(a), true, xq2.x), b, c);
                if ((i5 & 7168) == 2048) {
                    z = true;
                } else {
                    z = false;
                }
                if ((57344 & i5) == 16384) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                zH = z | z2 | kk0Var2.h(gn3VarAnimateFloat) | ((((i5 & 896) ^ 384) <= 256 && kk0Var2.g(linearTrackColor)) || (i5 & 384) == 256) | kk0Var2.h(gn3VarAnimateFloat2) | ((((i5 & 112) ^ 48) <= 32 && kk0Var2.g(linearColor)) || (i5 & 48) == 32) | kk0Var2.h(gn3VarAnimateFloat3) | kk0Var2.h(gn3VarAnimateFloat4);
                objP = kk0Var2.P();
                if (zH) {
                    j3 = linearColor;
                    j4 = linearTrackColor;
                    objP = new y03(i11, f4, gn3VarAnimateFloat, j4, gn3VarAnimateFloat2, j3, gn3VarAnimateFloat3, gn3VarAnimateFloat4);
                    kk0Var2.l0(objP);
                } else {
                    j3 = linearColor;
                    j4 = linearTrackColor;
                    objP = new y03(i11, f4, gn3VarAnimateFloat, j4, gn3VarAnimateFloat2, j3, gn3VarAnimateFloat3, gn3VarAnimateFloat4);
                    kk0Var2.l0(objP);
                }
                c10.Canvas(cVarK6, (le1) objP, kk0Var2, 0);
                cVar4 = cVar3;
                kk0Var = kk0Var2;
                i12 = i11;
                f5 = f4;
                j5 = j4;
                j6 = j3;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new n03(cVar4, j6, j5, i12, f5, i3, i4));
            }
        }
        i5 |= 24576;
        f3 = f2;
        if ((i5 & 9363) == 9362) {
            kk0Var2.X();
            if ((i3 & 1) != 0) {
                if (i13 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                i9 = i4 & 2;
                i03Var = i03.a;
                if (i9 != 0) {
                    i10 = 6;
                    linearColor = i03Var.getLinearColor(kk0Var2, 6);
                    i5 &= -113;
                } else {
                    i10 = 6;
                }
                if ((i4 & 4) != 0) {
                    linearTrackColor = i03Var.getLinearTrackColor(kk0Var2, i10);
                    i5 &= -897;
                }
                if (i14 != 0) {
                    i6 = 1;
                }
                if (i7 != 0) {
                    f4 = 4.0f;
                } else {
                    f4 = f3;
                }
            } else {
                if (i13 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                i9 = i4 & 2;
                i03Var = i03.a;
                if (i9 != 0) {
                    i10 = 6;
                    linearColor = i03Var.getLinearColor(kk0Var2, 6);
                    i5 &= -113;
                } else {
                    i10 = 6;
                }
                if ((i4 & 4) != 0) {
                    linearTrackColor = i03Var.getLinearTrackColor(kk0Var2, i10);
                    i5 &= -897;
                }
                if (i14 != 0) {
                    i6 = 1;
                }
                if (i7 != 0) {
                    f4 = 4.0f;
                } else {
                    f4 = f3;
                }
            }
            i11 = i6;
            kk0Var2.s();
            go1 go1VarRememberInfiniteTransition7 = io1.rememberInfiniteTransition(null, kk0Var2, 0, 1);
            kn4 kn4Var115 = new kn4(6);
            kn4Var115.b = 1800;
            kn4Var115.c(fValueOf2, 0).b = e;
            kn4Var115.c(fValueOf, 750);
            gn3VarAnimateFloat = io1.animateFloat(go1VarRememberInfiniteTransition7, 0.0f, 1.0f, kr1.N(new bw1(kn4Var115), 6), null, kk0Var2, 4536, 8);
            kn4 kn4Var116 = new kn4(6);
            kn4Var116.b = 1800;
            kn4Var116.c(fValueOf2, 333).b = f;
            kn4Var116.c(fValueOf, 1183);
            gn3VarAnimateFloat2 = io1.animateFloat(go1VarRememberInfiniteTransition7, 0.0f, 1.0f, kr1.N(new bw1(kn4Var116), 6), null, kk0Var2, 4536, 8);
            kn4 kn4Var117 = new kn4(6);
            kn4Var117.b = 1800;
            kn4Var117.c(fValueOf2, 1000).b = g;
            kn4Var117.c(fValueOf, 1567);
            gn3VarAnimateFloat3 = io1.animateFloat(go1VarRememberInfiniteTransition7, 0.0f, 1.0f, kr1.N(new bw1(kn4Var117), 6), null, kk0Var2, 4536, 8);
            kn4 kn4Var118 = new kn4(6);
            kn4Var118.b = 1800;
            kn4Var118.c(fValueOf2, 1267).b = h;
            kn4Var118.c(fValueOf, 1800);
            gn3VarAnimateFloat4 = io1.animateFloat(go1VarRememberInfiniteTransition7, 0.0f, 1.0f, kr1.N(new bw1(kn4Var118), 6), null, kk0Var2, 4536, 8);
            c cVarK7 = d.k(we3.b(cVar3.then(a), true, xq2.x), b, c);
            if ((i5 & 7168) == 2048) {
                z = true;
            } else {
                z = false;
            }
            if ((57344 & i5) == 16384) {
                z2 = true;
            } else {
                z2 = false;
            }
            zH = z | z2 | kk0Var2.h(gn3VarAnimateFloat) | ((((i5 & 896) ^ 384) <= 256 && kk0Var2.g(linearTrackColor)) || (i5 & 384) == 256) | kk0Var2.h(gn3VarAnimateFloat2) | ((((i5 & 112) ^ 48) <= 32 && kk0Var2.g(linearColor)) || (i5 & 48) == 32) | kk0Var2.h(gn3VarAnimateFloat3) | kk0Var2.h(gn3VarAnimateFloat4);
            objP = kk0Var2.P();
            if (zH) {
                j3 = linearColor;
                j4 = linearTrackColor;
                objP = new y03(i11, f4, gn3VarAnimateFloat, j4, gn3VarAnimateFloat2, j3, gn3VarAnimateFloat3, gn3VarAnimateFloat4);
                kk0Var2.l0(objP);
            } else {
                j3 = linearColor;
                j4 = linearTrackColor;
                objP = new y03(i11, f4, gn3VarAnimateFloat, j4, gn3VarAnimateFloat2, j3, gn3VarAnimateFloat3, gn3VarAnimateFloat4);
                kk0Var2.l0(objP);
            }
            c10.Canvas(cVarK7, (le1) objP, kk0Var2, 0);
            cVar4 = cVar3;
            kk0Var = kk0Var2;
            i12 = i11;
            f5 = f4;
            j5 = j4;
            j6 = j3;
        } else {
            kk0Var2.X();
            if ((i3 & 1) != 0) {
                if (i13 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                i9 = i4 & 2;
                i03Var = i03.a;
                if (i9 != 0) {
                    i10 = 6;
                    linearColor = i03Var.getLinearColor(kk0Var2, 6);
                    i5 &= -113;
                } else {
                    i10 = 6;
                }
                if ((i4 & 4) != 0) {
                    linearTrackColor = i03Var.getLinearTrackColor(kk0Var2, i10);
                    i5 &= -897;
                }
                if (i14 != 0) {
                    i6 = 1;
                }
                if (i7 != 0) {
                    f4 = 4.0f;
                } else {
                    f4 = f3;
                }
            } else {
                if (i13 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                i9 = i4 & 2;
                i03Var = i03.a;
                if (i9 != 0) {
                    i10 = 6;
                    linearColor = i03Var.getLinearColor(kk0Var2, 6);
                    i5 &= -113;
                } else {
                    i10 = 6;
                }
                if ((i4 & 4) != 0) {
                    linearTrackColor = i03Var.getLinearTrackColor(kk0Var2, i10);
                    i5 &= -897;
                }
                if (i14 != 0) {
                    i6 = 1;
                }
                if (i7 != 0) {
                    f4 = 4.0f;
                } else {
                    f4 = f3;
                }
            }
            i11 = i6;
            kk0Var2.s();
            go1 go1VarRememberInfiniteTransition8 = io1.rememberInfiniteTransition(null, kk0Var2, 0, 1);
            kn4 kn4Var119 = new kn4(6);
            kn4Var119.b = 1800;
            kn4Var119.c(fValueOf2, 0).b = e;
            kn4Var119.c(fValueOf, 750);
            gn3VarAnimateFloat = io1.animateFloat(go1VarRememberInfiniteTransition8, 0.0f, 1.0f, kr1.N(new bw1(kn4Var119), 6), null, kk0Var2, 4536, 8);
            kn4 kn4Var1110 = new kn4(6);
            kn4Var1110.b = 1800;
            kn4Var1110.c(fValueOf2, 333).b = f;
            kn4Var1110.c(fValueOf, 1183);
            gn3VarAnimateFloat2 = io1.animateFloat(go1VarRememberInfiniteTransition8, 0.0f, 1.0f, kr1.N(new bw1(kn4Var1110), 6), null, kk0Var2, 4536, 8);
            kn4 kn4Var1111 = new kn4(6);
            kn4Var1111.b = 1800;
            kn4Var1111.c(fValueOf2, 1000).b = g;
            kn4Var1111.c(fValueOf, 1567);
            gn3VarAnimateFloat3 = io1.animateFloat(go1VarRememberInfiniteTransition8, 0.0f, 1.0f, kr1.N(new bw1(kn4Var1111), 6), null, kk0Var2, 4536, 8);
            kn4 kn4Var1112 = new kn4(6);
            kn4Var1112.b = 1800;
            kn4Var1112.c(fValueOf2, 1267).b = h;
            kn4Var1112.c(fValueOf, 1800);
            gn3VarAnimateFloat4 = io1.animateFloat(go1VarRememberInfiniteTransition8, 0.0f, 1.0f, kr1.N(new bw1(kn4Var1112), 6), null, kk0Var2, 4536, 8);
            c cVarK8 = d.k(we3.b(cVar3.then(a), true, xq2.x), b, c);
            if ((i5 & 7168) == 2048) {
                z = true;
            } else {
                z = false;
            }
            if ((57344 & i5) == 16384) {
                z2 = true;
            } else {
                z2 = false;
            }
            zH = z | z2 | kk0Var2.h(gn3VarAnimateFloat) | ((((i5 & 896) ^ 384) <= 256 && kk0Var2.g(linearTrackColor)) || (i5 & 384) == 256) | kk0Var2.h(gn3VarAnimateFloat2) | ((((i5 & 112) ^ 48) <= 32 && kk0Var2.g(linearColor)) || (i5 & 48) == 32) | kk0Var2.h(gn3VarAnimateFloat3) | kk0Var2.h(gn3VarAnimateFloat4);
            objP = kk0Var2.P();
            if (zH) {
                j3 = linearColor;
                j4 = linearTrackColor;
                objP = new y03(i11, f4, gn3VarAnimateFloat, j4, gn3VarAnimateFloat2, j3, gn3VarAnimateFloat3, gn3VarAnimateFloat4);
                kk0Var2.l0(objP);
            } else {
                j3 = linearColor;
                j4 = linearTrackColor;
                objP = new y03(i11, f4, gn3VarAnimateFloat, j4, gn3VarAnimateFloat2, j3, gn3VarAnimateFloat3, gn3VarAnimateFloat4);
                kk0Var2.l0(objP);
            }
            c10.Canvas(cVarK8, (le1) objP, kk0Var2, 0);
            cVar4 = cVar3;
            kk0Var = kk0Var2;
            i12 = i11;
            f5 = f4;
            j5 = j4;
            j6 = j3;
        }
        w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new n03(cVar4, j6, j5, i12, f5, i3, i4));
        }
    }

    public static final void a(tz0 tz0Var, float f2, float f3, long j, float f4, int i2) {
        float fD = bi3.d(tz0Var.b());
        float fB = bi3.b(tz0Var.b());
        float f5 = fB / 2.0f;
        boolean z = tz0Var.getLayoutDirection() == dx1.c;
        float f6 = (z ? f2 : 1.0f - f3) * fD;
        float f7 = (z ? f3 : 1.0f - f2) * fD;
        if (i2 == 0 || fB > fD) {
            tz0Var.S(j, y64.b(f6, f5), y64.b(f7, f5), f4, (480 & 16) != 0 ? 0 : 0);
            return;
        }
        float f8 = f4 / 2.0f;
        od0 od0Var = new od0(f8, fD - f8);
        float fFloatValue = ((Number) py.z(Float.valueOf(f6), od0Var)).floatValue();
        float fFloatValue2 = ((Number) py.z(Float.valueOf(f7), od0Var)).floatValue();
        if (Math.abs(f3 - f2) > 0.0f) {
            tz0Var.S(j, y64.b(fFloatValue, f5), y64.b(fFloatValue2, f5), f4, (480 & 16) != 0 ? 0 : i2);
        }
    }

    public static final void b(tz0 tz0Var, float f2, float f3, long j, vo3 vo3Var) {
        float f4 = vo3Var.a / 2.0f;
        float fD = bi3.d(tz0Var.b()) - (2.0f * f4);
        tz0Var.s0(j, f2, f3, y64.b(f4, f4), vl0.g(fD, fD), vo3Var);
    }
}
