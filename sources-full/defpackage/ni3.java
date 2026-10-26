package defpackage;

import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.d;
import androidx.compose.runtime.Composer$Companion;
import androidx.compose.ui.c;
import androidx.compose.ui.platform.CompositionLocalsKt;
import kotlin.io.ConstantsKt;
import kotlin.uuid.Uuid;
import org.scilab.forge.jlatexmath.FontInfo;

/* JADX INFO: loaded from: classes.dex */
public final class ni3 {
    public static final ni3 a = new ni3();
    public static final ic b = kc.a();

    public static final void a(tz0 tz0Var, long j, long j2) {
        tz0.K(tz0Var, j2, tz0Var.w(4.0f) / 2.0f, j, null, 120);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:51:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:58:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:60:0x01f2  */
    public static final void b(tz0 tz0Var, float[] fArr, float f, float f2, long j, long j2, long j3, long j4, float f3, float f4, float f5, float f6, float f7, ne1 ne1Var, oe1 oe1Var, boolean z) {
        float fW;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        long j5;
        long jB = y64.b(0.0f, ln2.g(tz0Var.W()));
        long jB2 = y64.b(bi3.d(tz0Var.b()), ln2.g(tz0Var.W()));
        float fW2 = tz0Var.w(f3);
        long jB3 = y64.b(((ln2.f(jB2) - ln2.f(jB)) * f2) + ln2.f(jB), ln2.g(tz0Var.W()));
        long jB4 = y64.b(((ln2.f(jB2) - ln2.f(jB)) * f) + ln2.f(jB), ln2.g(tz0Var.W()));
        float f13 = fW2 / 2.0f;
        float fW3 = tz0Var.w(f7);
        if (Float.compare(f6, 0.0f) > 0) {
            float fW4 = tz0Var.w(f6) + (tz0Var.w(f4) / 2.0f);
            fW = tz0Var.w(f6) + (tz0Var.w(f5) / 2.0f);
            f8 = fW4;
        } else {
            fW = 0.0f;
            f8 = 0.0f;
        }
        if (!z || ln2.f(jB4) <= ln2.f(jB) + f8 + f13) {
            f9 = fW2;
        } else {
            float f14 = ln2.f(jB);
            f9 = fW2;
            c(tz0Var, 0L, vl0.g((ln2.f(jB4) - f8) - f14, fW2), j, f13, fW3);
            if (ne1Var != null) {
                ne1Var.invoke(tz0Var, new ln2(y64.b(f14 + f13, ln2.g(tz0Var.W()))));
            }
        }
        if (ln2.f(jB3) < (ln2.f(jB2) - fW) - f13) {
            float f15 = ln2.f(jB3) + fW;
            float f16 = ln2.f(jB2);
            float f17 = f9;
            f10 = f17;
            c(tz0Var, y64.b(f15, 0.0f), vl0.g(f16 - f15, f17), j, fW3, f13);
            f11 = f13;
            if (ne1Var != null) {
                fW3 = fW3;
                ne1Var.invoke(tz0Var, new ln2(y64.b(f16 - f11, ln2.g(tz0Var.W()))));
            }
        } else {
            f10 = f9;
            f11 = f13;
        }
        float f18 = z ? ln2.f(jB4) + f8 : 0.0f;
        float f19 = ln2.f(jB3) - fW;
        float f20 = z ? fW3 : f11;
        float f21 = f19 - f18;
        if (f21 > f20) {
            c(tz0Var, y64.b(f18, 0.0f), vl0.g(f21, f10), j2, f20, fW3);
        }
        long jB5 = y64.b(ln2.f(jB) + f11, ln2.g(jB));
        long jB6 = y64.b(ln2.f(jB2) - f11, ln2.g(jB2));
        float f22 = ln2.f(jB4) - f8;
        float f23 = ln2.f(jB4) + f8;
        float f24 = ln2.f(jB3) - fW;
        float f25 = ln2.f(jB3) + fW;
        int length = fArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            float f26 = fArr[i];
            int i3 = i2 + 1;
            boolean z2 = true;
            if (ne1Var == null || ((!z || i2 != 0) && i2 != fArr.length - 1)) {
                if (f26 <= f2 && f26 >= f) {
                    z2 = false;
                }
                long jB7 = y64.b(ln2.f(y64.G(jB5, jB6, f26)), ln2.g(tz0Var.W()));
                if (z) {
                    float f27 = ln2.f(jB7);
                    if (f27 < f22 || f27 > f23) {
                        f12 = ln2.f(jB7);
                        if (f12 >= f24 || f12 > f25) {
                            ln2 ln2Var = new ln2(jB7);
                            if (z2) {
                                j5 = j3;
                            } else {
                                j5 = j4;
                            }
                            oe1Var.invoke(tz0Var, ln2Var, new re0(j5));
                        }
                    }
                } else {
                    f12 = ln2.f(jB7);
                    if (f12 >= f24) {
                    }
                    ln2 ln2Var2 = new ln2(jB7);
                    if (z2) {
                        j5 = j3;
                    } else {
                        j5 = j4;
                    }
                    oe1Var.invoke(tz0Var, ln2Var2, new re0(j5));
                }
            }
            i++;
            jB5 = jB5;
            i2 = i3;
        }
    }

    public static void c(tz0 tz0Var, long j, long j2, long j3, float f, float f2) {
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L);
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L);
        h43 h43VarA = xp1.a(y64.b(ln2.f(j), 0.0f), vl0.g(bi3.d(j2), bi3.b(j2)));
        x73 x73Var = new x73(h43VarA.a, h43VarA.b, h43VarA.c, h43VarA.d, jFloatToRawIntBits, jFloatToRawIntBits2, jFloatToRawIntBits2, jFloatToRawIntBits);
        ic icVar = b;
        nt2.b(icVar, x73Var);
        tz0.H(tz0Var, icVar, j3, null, 60);
        icVar.a.rewind();
    }

    public static ii3 d(ye0 ye0Var) {
        ii3 ii3Var = ye0Var.j0;
        if (ii3Var != null) {
            return ii3Var;
        }
        ze0 ze0Var = ze0.r;
        long jB = af0.b(ye0Var, ze0Var);
        long jB2 = af0.b(ye0Var, ze0Var);
        ze0 ze0Var2 = ze0.u;
        long jB3 = af0.b(ye0Var, ze0Var2);
        long jB4 = af0.b(ye0Var, ze0Var2);
        long jB5 = af0.b(ye0Var, ze0Var);
        ze0 ze0Var3 = ze0.n;
        ii3 ii3Var2 = new ii3(jB, jB2, jB3, jB4, jB5, gb2.r(re0.b(0.38f, af0.b(ye0Var, ze0Var3)), ye0Var.p), re0.b(0.38f, af0.b(ye0Var, ze0Var3)), re0.b(0.12f, af0.b(ye0Var, ze0Var3)), re0.b(0.12f, af0.b(ye0Var, ze0Var3)), re0.b(0.38f, af0.b(ye0Var, ze0Var3)));
        ye0Var.j0 = ii3Var2;
        return ii3Var2;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0120  */
    /* JADX WARN: Code duplicated, block: B:102:0x0126  */
    /* JADX WARN: Code duplicated, block: B:105:0x013c  */
    /* JADX WARN: Code duplicated, block: B:106:0x015c  */
    /* JADX WARN: Code duplicated, block: B:109:0x0172  */
    /* JADX WARN: Code duplicated, block: B:110:0x0175  */
    /* JADX WARN: Code duplicated, block: B:114:0x018f  */
    /* JADX WARN: Code duplicated, block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0047  */
    /* JADX WARN: Code duplicated, block: B:28:0x004b  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:31:0x0056  */
    /* JADX WARN: Code duplicated, block: B:34:0x005c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0062  */
    /* JADX WARN: Code duplicated, block: B:39:0x0067  */
    /* JADX WARN: Code duplicated, block: B:41:0x006b  */
    /* JADX WARN: Code duplicated, block: B:43:0x0073  */
    /* JADX WARN: Code duplicated, block: B:44:0x0076  */
    /* JADX WARN: Code duplicated, block: B:48:0x007d  */
    /* JADX WARN: Code duplicated, block: B:50:0x0082  */
    /* JADX WARN: Code duplicated, block: B:52:0x0086  */
    /* JADX WARN: Code duplicated, block: B:54:0x008e  */
    /* JADX WARN: Code duplicated, block: B:55:0x0091  */
    /* JADX WARN: Code duplicated, block: B:59:0x009a  */
    /* JADX WARN: Code duplicated, block: B:60:0x009d  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:65:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:83:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:90:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:93:0x010a  */
    /* JADX WARN: Code duplicated, block: B:97:0x0119  */
    /* JADX WARN: Instruction removed from duplicated block: B:74:0x00c8, please report this as an issue */
    /* JADX INFO: renamed from: Thumb-9LiSoMs, reason: not valid java name */
    public final void m1773xc69e18c1(gh2 gh2Var, c cVar, ii3 ii3Var, boolean z, long j, ck0 ck0Var, int i, int i2) {
        int i3;
        c cVar2;
        ii3 ii3Var2;
        int i4;
        boolean z2;
        int i5;
        int i6;
        long j2;
        int i7;
        int i8;
        Object objP;
        ml3 ml3Var;
        boolean z3;
        Object objP2;
        long jFloatToRawIntBits;
        long j3;
        c cVar3;
        ii3 ii3Var3;
        boolean z4;
        long j4;
        w33 w33VarV;
        int i9;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(-290277409);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (kk0Var.h(gh2Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 == 0) {
            if ((i & 48) == 0) {
                cVar2 = cVar;
                i3 |= kk0Var.h(cVar2) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                if ((i2 & 4) == 0) {
                    ii3Var2 = ii3Var;
                    if (kk0Var.h(ii3Var2)) {
                        i9 = FontInfo.NUMBER_OF_CHAR_CODES;
                    }
                    i3 |= i9;
                } else {
                    ii3Var2 = ii3Var;
                }
                i9 = Uuid.SIZE_BITS;
                i3 |= i9;
            } else {
                ii3Var2 = ii3Var;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    z2 = z;
                    if (kk0Var.i(z2)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 16;
                if (i6 != 0) {
                    if ((i & 24576) == 0) {
                        j2 = j;
                        if (kk0Var.g(j2)) {
                            i7 = 16384;
                        } else {
                            i7 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                        }
                        i3 |= i7;
                    }
                    if ((i2 & 32) != 0) {
                        i3 |= 196608;
                    } else if ((i & 196608) == 0) {
                        if (kk0Var.h(this)) {
                            i8 = 131072;
                        } else {
                            i8 = 65536;
                        }
                        i3 |= i8;
                    }
                    if ((74899 & i3) == 74898 || !kk0Var.F()) {
                        kk0Var.X();
                        if ((i & 1) != 0 || kk0Var.D()) {
                            if (i10 != 0) {
                                cVar2 = c.i;
                            }
                            if ((i2 & 4) != 0) {
                                ii3 ii3VarColors = colors(kk0Var, (i3 >> 15) & 14);
                                i3 &= -897;
                                ii3Var2 = ii3VarColors;
                            }
                            if (i4 != 0) {
                                z2 = true;
                            }
                            if (i6 != 0) {
                                j2 = rj3.a;
                            }
                        } else {
                            kk0Var.V();
                            if ((i2 & 4) != 0) {
                                i3 &= -897;
                            }
                        }
                        kk0Var.s();
                        objP = kk0Var.P();
                        if (objP == Composer$Companion.getEmpty()) {
                            objP = new ml3();
                            kk0Var.l0(objP);
                        }
                        ml3Var = (ml3) objP;
                        int i11 = i3 & 14;
                        z3 = i11 == 4;
                        objP2 = kk0Var.P();
                        if (z3 || objP2 == Composer$Companion.getEmpty()) {
                            objP2 = new k(gh2Var, ml3Var, null, 27);
                            kk0Var.l0(objP2);
                        }
                        r11.LaunchedEffect(gh2Var, (ne1) objP2, kk0Var, i11);
                        if (ml3Var.isEmpty()) {
                            jFloatToRawIntBits = j2;
                        } else {
                            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(ux0.a(j2))) & 4294967295L) | (((long) Float.floatToRawIntBits(ux0.b(j2) / 2.0f)) << 32);
                        }
                        FillElement fillElement = d.a;
                        c cVarI = a.i(d.k(cVar2, ux0.b(jFloatToRawIntBits), ux0.a(jFloatToRawIntBits)), gh2Var);
                        if (z2) {
                            j3 = ii3Var2.a;
                        } else {
                            j3 = ii3Var2.f;
                        }
                        cm3.Spacer(a.b(cVarI, j3, wg3.getValue(tg3.m, kk0Var, 6)), kk0Var, 0);
                        cVar3 = cVar2;
                    } else {
                        kk0Var.V();
                        cVar3 = cVar2;
                    }
                    ii3Var3 = ii3Var2;
                    z4 = z2;
                    j4 = j2;
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new xb(this, gh2Var, cVar3, ii3Var3, z4, j4, i, i2));
                    }
                }
                i3 |= 24576;
                j2 = j;
                if ((i2 & 32) != 0) {
                    i3 |= 196608;
                } else if ((i & 196608) == 0) {
                    if (kk0Var.h(this)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i3 |= i8;
                }
                if ((74899 & i3) == 74898) {
                    kk0Var.X();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            cVar2 = c.i;
                        }
                        if ((i2 & 4) != 0) {
                            ii3 ii3VarColors2 = colors(kk0Var, (i3 >> 15) & 14);
                            i3 &= -897;
                            ii3Var2 = ii3VarColors2;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if (i6 != 0) {
                            j2 = rj3.a;
                        }
                    } else {
                        if (i10 != 0) {
                            cVar2 = c.i;
                        }
                        if ((i2 & 4) != 0) {
                            ii3 ii3VarColors3 = colors(kk0Var, (i3 >> 15) & 14);
                            i3 &= -897;
                            ii3Var2 = ii3VarColors3;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if (i6 != 0) {
                            j2 = rj3.a;
                        }
                    }
                    kk0Var.s();
                    objP = kk0Var.P();
                    if (objP == Composer$Companion.getEmpty()) {
                        objP = new ml3();
                        kk0Var.l0(objP);
                    }
                    ml3Var = (ml3) objP;
                    int i12 = i3 & 14;
                    if (i12 == 4) {
                    }
                    objP2 = kk0Var.P();
                    if (z3) {
                        objP2 = new k(gh2Var, ml3Var, null, 27);
                        kk0Var.l0(objP2);
                    } else {
                        objP2 = new k(gh2Var, ml3Var, null, 27);
                        kk0Var.l0(objP2);
                    }
                    r11.LaunchedEffect(gh2Var, (ne1) objP2, kk0Var, i12);
                    if (ml3Var.isEmpty()) {
                        jFloatToRawIntBits = (((long) Float.floatToRawIntBits(ux0.a(j2))) & 4294967295L) | (((long) Float.floatToRawIntBits(ux0.b(j2) / 2.0f)) << 32);
                    } else {
                        jFloatToRawIntBits = j2;
                    }
                    FillElement fillElement2 = d.a;
                    c cVarI2 = a.i(d.k(cVar2, ux0.b(jFloatToRawIntBits), ux0.a(jFloatToRawIntBits)), gh2Var);
                    if (z2) {
                        j3 = ii3Var2.a;
                    } else {
                        j3 = ii3Var2.f;
                    }
                    cm3.Spacer(a.b(cVarI2, j3, wg3.getValue(tg3.m, kk0Var, 6)), kk0Var, 0);
                    cVar3 = cVar2;
                } else {
                    kk0Var.X();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            cVar2 = c.i;
                        }
                        if ((i2 & 4) != 0) {
                            ii3 ii3VarColors4 = colors(kk0Var, (i3 >> 15) & 14);
                            i3 &= -897;
                            ii3Var2 = ii3VarColors4;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if (i6 != 0) {
                            j2 = rj3.a;
                        }
                    } else {
                        if (i10 != 0) {
                            cVar2 = c.i;
                        }
                        if ((i2 & 4) != 0) {
                            ii3 ii3VarColors5 = colors(kk0Var, (i3 >> 15) & 14);
                            i3 &= -897;
                            ii3Var2 = ii3VarColors5;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if (i6 != 0) {
                            j2 = rj3.a;
                        }
                    }
                    kk0Var.s();
                    objP = kk0Var.P();
                    if (objP == Composer$Companion.getEmpty()) {
                        objP = new ml3();
                        kk0Var.l0(objP);
                    }
                    ml3Var = (ml3) objP;
                    int i13 = i3 & 14;
                    if (i13 == 4) {
                    }
                    objP2 = kk0Var.P();
                    if (z3) {
                        objP2 = new k(gh2Var, ml3Var, null, 27);
                        kk0Var.l0(objP2);
                    } else {
                        objP2 = new k(gh2Var, ml3Var, null, 27);
                        kk0Var.l0(objP2);
                    }
                    r11.LaunchedEffect(gh2Var, (ne1) objP2, kk0Var, i13);
                    if (ml3Var.isEmpty()) {
                        jFloatToRawIntBits = (((long) Float.floatToRawIntBits(ux0.a(j2))) & 4294967295L) | (((long) Float.floatToRawIntBits(ux0.b(j2) / 2.0f)) << 32);
                    } else {
                        jFloatToRawIntBits = j2;
                    }
                    FillElement fillElement3 = d.a;
                    c cVarI3 = a.i(d.k(cVar2, ux0.b(jFloatToRawIntBits), ux0.a(jFloatToRawIntBits)), gh2Var);
                    if (z2) {
                        j3 = ii3Var2.a;
                    } else {
                        j3 = ii3Var2.f;
                    }
                    cm3.Spacer(a.b(cVarI3, j3, wg3.getValue(tg3.m, kk0Var, 6)), kk0Var, 0);
                    cVar3 = cVar2;
                }
                ii3Var3 = ii3Var2;
                z4 = z2;
                j4 = j2;
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new xb(this, gh2Var, cVar3, ii3Var3, z4, j4, i, i2));
                }
            }
            i3 |= 3072;
            z2 = z;
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    j2 = j;
                    if (kk0Var.g(j2)) {
                        i7 = 16384;
                    } else {
                        i7 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                    }
                    i3 |= i7;
                }
                if ((i2 & 32) != 0) {
                    i3 |= 196608;
                } else if ((i & 196608) == 0) {
                    if (kk0Var.h(this)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i3 |= i8;
                }
                if ((74899 & i3) == 74898) {
                    kk0Var.X();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            cVar2 = c.i;
                        }
                        if ((i2 & 4) != 0) {
                            ii3 ii3VarColors6 = colors(kk0Var, (i3 >> 15) & 14);
                            i3 &= -897;
                            ii3Var2 = ii3VarColors6;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if (i6 != 0) {
                            j2 = rj3.a;
                        }
                    } else {
                        if (i10 != 0) {
                            cVar2 = c.i;
                        }
                        if ((i2 & 4) != 0) {
                            ii3 ii3VarColors7 = colors(kk0Var, (i3 >> 15) & 14);
                            i3 &= -897;
                            ii3Var2 = ii3VarColors7;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if (i6 != 0) {
                            j2 = rj3.a;
                        }
                    }
                    kk0Var.s();
                    objP = kk0Var.P();
                    if (objP == Composer$Companion.getEmpty()) {
                        objP = new ml3();
                        kk0Var.l0(objP);
                    }
                    ml3Var = (ml3) objP;
                    int i14 = i3 & 14;
                    if (i14 == 4) {
                    }
                    objP2 = kk0Var.P();
                    if (z3) {
                        objP2 = new k(gh2Var, ml3Var, null, 27);
                        kk0Var.l0(objP2);
                    } else {
                        objP2 = new k(gh2Var, ml3Var, null, 27);
                        kk0Var.l0(objP2);
                    }
                    r11.LaunchedEffect(gh2Var, (ne1) objP2, kk0Var, i14);
                    if (ml3Var.isEmpty()) {
                        jFloatToRawIntBits = (((long) Float.floatToRawIntBits(ux0.a(j2))) & 4294967295L) | (((long) Float.floatToRawIntBits(ux0.b(j2) / 2.0f)) << 32);
                    } else {
                        jFloatToRawIntBits = j2;
                    }
                    FillElement fillElement4 = d.a;
                    c cVarI4 = a.i(d.k(cVar2, ux0.b(jFloatToRawIntBits), ux0.a(jFloatToRawIntBits)), gh2Var);
                    if (z2) {
                        j3 = ii3Var2.a;
                    } else {
                        j3 = ii3Var2.f;
                    }
                    cm3.Spacer(a.b(cVarI4, j3, wg3.getValue(tg3.m, kk0Var, 6)), kk0Var, 0);
                    cVar3 = cVar2;
                } else {
                    kk0Var.X();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            cVar2 = c.i;
                        }
                        if ((i2 & 4) != 0) {
                            ii3 ii3VarColors8 = colors(kk0Var, (i3 >> 15) & 14);
                            i3 &= -897;
                            ii3Var2 = ii3VarColors8;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if (i6 != 0) {
                            j2 = rj3.a;
                        }
                    } else {
                        if (i10 != 0) {
                            cVar2 = c.i;
                        }
                        if ((i2 & 4) != 0) {
                            ii3 ii3VarColors9 = colors(kk0Var, (i3 >> 15) & 14);
                            i3 &= -897;
                            ii3Var2 = ii3VarColors9;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if (i6 != 0) {
                            j2 = rj3.a;
                        }
                    }
                    kk0Var.s();
                    objP = kk0Var.P();
                    if (objP == Composer$Companion.getEmpty()) {
                        objP = new ml3();
                        kk0Var.l0(objP);
                    }
                    ml3Var = (ml3) objP;
                    int i15 = i3 & 14;
                    if (i15 == 4) {
                    }
                    objP2 = kk0Var.P();
                    if (z3) {
                        objP2 = new k(gh2Var, ml3Var, null, 27);
                        kk0Var.l0(objP2);
                    } else {
                        objP2 = new k(gh2Var, ml3Var, null, 27);
                        kk0Var.l0(objP2);
                    }
                    r11.LaunchedEffect(gh2Var, (ne1) objP2, kk0Var, i15);
                    if (ml3Var.isEmpty()) {
                        jFloatToRawIntBits = (((long) Float.floatToRawIntBits(ux0.a(j2))) & 4294967295L) | (((long) Float.floatToRawIntBits(ux0.b(j2) / 2.0f)) << 32);
                    } else {
                        jFloatToRawIntBits = j2;
                    }
                    FillElement fillElement5 = d.a;
                    c cVarI5 = a.i(d.k(cVar2, ux0.b(jFloatToRawIntBits), ux0.a(jFloatToRawIntBits)), gh2Var);
                    if (z2) {
                        j3 = ii3Var2.a;
                    } else {
                        j3 = ii3Var2.f;
                    }
                    cm3.Spacer(a.b(cVarI5, j3, wg3.getValue(tg3.m, kk0Var, 6)), kk0Var, 0);
                    cVar3 = cVar2;
                }
                ii3Var3 = ii3Var2;
                z4 = z2;
                j4 = j2;
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new xb(this, gh2Var, cVar3, ii3Var3, z4, j4, i, i2));
                }
            }
            i3 |= 24576;
            j2 = j;
            if ((i2 & 32) != 0) {
                i3 |= 196608;
            } else if ((i & 196608) == 0) {
                if (kk0Var.h(this)) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
                i3 |= i8;
            }
            if ((74899 & i3) == 74898) {
                kk0Var.X();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        cVar2 = c.i;
                    }
                    if ((i2 & 4) != 0) {
                        ii3 ii3VarColors10 = colors(kk0Var, (i3 >> 15) & 14);
                        i3 &= -897;
                        ii3Var2 = ii3VarColors10;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if (i6 != 0) {
                        j2 = rj3.a;
                    }
                } else {
                    if (i10 != 0) {
                        cVar2 = c.i;
                    }
                    if ((i2 & 4) != 0) {
                        ii3 ii3VarColors11 = colors(kk0Var, (i3 >> 15) & 14);
                        i3 &= -897;
                        ii3Var2 = ii3VarColors11;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if (i6 != 0) {
                        j2 = rj3.a;
                    }
                }
                kk0Var.s();
                objP = kk0Var.P();
                if (objP == Composer$Companion.getEmpty()) {
                    objP = new ml3();
                    kk0Var.l0(objP);
                }
                ml3Var = (ml3) objP;
                int i16 = i3 & 14;
                if (i16 == 4) {
                }
                objP2 = kk0Var.P();
                if (z3) {
                    objP2 = new k(gh2Var, ml3Var, null, 27);
                    kk0Var.l0(objP2);
                } else {
                    objP2 = new k(gh2Var, ml3Var, null, 27);
                    kk0Var.l0(objP2);
                }
                r11.LaunchedEffect(gh2Var, (ne1) objP2, kk0Var, i16);
                if (ml3Var.isEmpty()) {
                    jFloatToRawIntBits = (((long) Float.floatToRawIntBits(ux0.a(j2))) & 4294967295L) | (((long) Float.floatToRawIntBits(ux0.b(j2) / 2.0f)) << 32);
                } else {
                    jFloatToRawIntBits = j2;
                }
                FillElement fillElement6 = d.a;
                c cVarI6 = a.i(d.k(cVar2, ux0.b(jFloatToRawIntBits), ux0.a(jFloatToRawIntBits)), gh2Var);
                if (z2) {
                    j3 = ii3Var2.a;
                } else {
                    j3 = ii3Var2.f;
                }
                cm3.Spacer(a.b(cVarI6, j3, wg3.getValue(tg3.m, kk0Var, 6)), kk0Var, 0);
                cVar3 = cVar2;
            } else {
                kk0Var.X();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        cVar2 = c.i;
                    }
                    if ((i2 & 4) != 0) {
                        ii3 ii3VarColors12 = colors(kk0Var, (i3 >> 15) & 14);
                        i3 &= -897;
                        ii3Var2 = ii3VarColors12;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if (i6 != 0) {
                        j2 = rj3.a;
                    }
                } else {
                    if (i10 != 0) {
                        cVar2 = c.i;
                    }
                    if ((i2 & 4) != 0) {
                        ii3 ii3VarColors13 = colors(kk0Var, (i3 >> 15) & 14);
                        i3 &= -897;
                        ii3Var2 = ii3VarColors13;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if (i6 != 0) {
                        j2 = rj3.a;
                    }
                }
                kk0Var.s();
                objP = kk0Var.P();
                if (objP == Composer$Companion.getEmpty()) {
                    objP = new ml3();
                    kk0Var.l0(objP);
                }
                ml3Var = (ml3) objP;
                int i17 = i3 & 14;
                if (i17 == 4) {
                }
                objP2 = kk0Var.P();
                if (z3) {
                    objP2 = new k(gh2Var, ml3Var, null, 27);
                    kk0Var.l0(objP2);
                } else {
                    objP2 = new k(gh2Var, ml3Var, null, 27);
                    kk0Var.l0(objP2);
                }
                r11.LaunchedEffect(gh2Var, (ne1) objP2, kk0Var, i17);
                if (ml3Var.isEmpty()) {
                    jFloatToRawIntBits = (((long) Float.floatToRawIntBits(ux0.a(j2))) & 4294967295L) | (((long) Float.floatToRawIntBits(ux0.b(j2) / 2.0f)) << 32);
                } else {
                    jFloatToRawIntBits = j2;
                }
                FillElement fillElement7 = d.a;
                c cVarI7 = a.i(d.k(cVar2, ux0.b(jFloatToRawIntBits), ux0.a(jFloatToRawIntBits)), gh2Var);
                if (z2) {
                    j3 = ii3Var2.a;
                } else {
                    j3 = ii3Var2.f;
                }
                cm3.Spacer(a.b(cVarI7, j3, wg3.getValue(tg3.m, kk0Var, 6)), kk0Var, 0);
                cVar3 = cVar2;
            }
            ii3Var3 = ii3Var2;
            z4 = z2;
            j4 = j2;
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new xb(this, gh2Var, cVar3, ii3Var3, z4, j4, i, i2));
            }
        }
        i3 |= 48;
        cVar2 = cVar;
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                ii3Var2 = ii3Var;
                if (kk0Var.h(ii3Var2)) {
                    i9 = FontInfo.NUMBER_OF_CHAR_CODES;
                }
                i3 |= i9;
            } else {
                ii3Var2 = ii3Var;
            }
            i9 = Uuid.SIZE_BITS;
            i3 |= i9;
        } else {
            ii3Var2 = ii3Var;
        }
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                z2 = z;
                if (kk0Var.i(z2)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    j2 = j;
                    if (kk0Var.g(j2)) {
                        i7 = 16384;
                    } else {
                        i7 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                    }
                    i3 |= i7;
                }
                if ((i2 & 32) != 0) {
                    i3 |= 196608;
                } else if ((i & 196608) == 0) {
                    if (kk0Var.h(this)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i3 |= i8;
                }
                if ((74899 & i3) == 74898) {
                    kk0Var.X();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            cVar2 = c.i;
                        }
                        if ((i2 & 4) != 0) {
                            ii3 ii3VarColors14 = colors(kk0Var, (i3 >> 15) & 14);
                            i3 &= -897;
                            ii3Var2 = ii3VarColors14;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if (i6 != 0) {
                            j2 = rj3.a;
                        }
                    } else {
                        if (i10 != 0) {
                            cVar2 = c.i;
                        }
                        if ((i2 & 4) != 0) {
                            ii3 ii3VarColors15 = colors(kk0Var, (i3 >> 15) & 14);
                            i3 &= -897;
                            ii3Var2 = ii3VarColors15;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if (i6 != 0) {
                            j2 = rj3.a;
                        }
                    }
                    kk0Var.s();
                    objP = kk0Var.P();
                    if (objP == Composer$Companion.getEmpty()) {
                        objP = new ml3();
                        kk0Var.l0(objP);
                    }
                    ml3Var = (ml3) objP;
                    int i18 = i3 & 14;
                    if (i18 == 4) {
                    }
                    objP2 = kk0Var.P();
                    if (z3) {
                        objP2 = new k(gh2Var, ml3Var, null, 27);
                        kk0Var.l0(objP2);
                    } else {
                        objP2 = new k(gh2Var, ml3Var, null, 27);
                        kk0Var.l0(objP2);
                    }
                    r11.LaunchedEffect(gh2Var, (ne1) objP2, kk0Var, i18);
                    if (ml3Var.isEmpty()) {
                        jFloatToRawIntBits = (((long) Float.floatToRawIntBits(ux0.a(j2))) & 4294967295L) | (((long) Float.floatToRawIntBits(ux0.b(j2) / 2.0f)) << 32);
                    } else {
                        jFloatToRawIntBits = j2;
                    }
                    FillElement fillElement8 = d.a;
                    c cVarI8 = a.i(d.k(cVar2, ux0.b(jFloatToRawIntBits), ux0.a(jFloatToRawIntBits)), gh2Var);
                    if (z2) {
                        j3 = ii3Var2.a;
                    } else {
                        j3 = ii3Var2.f;
                    }
                    cm3.Spacer(a.b(cVarI8, j3, wg3.getValue(tg3.m, kk0Var, 6)), kk0Var, 0);
                    cVar3 = cVar2;
                } else {
                    kk0Var.X();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            cVar2 = c.i;
                        }
                        if ((i2 & 4) != 0) {
                            ii3 ii3VarColors16 = colors(kk0Var, (i3 >> 15) & 14);
                            i3 &= -897;
                            ii3Var2 = ii3VarColors16;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if (i6 != 0) {
                            j2 = rj3.a;
                        }
                    } else {
                        if (i10 != 0) {
                            cVar2 = c.i;
                        }
                        if ((i2 & 4) != 0) {
                            ii3 ii3VarColors17 = colors(kk0Var, (i3 >> 15) & 14);
                            i3 &= -897;
                            ii3Var2 = ii3VarColors17;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if (i6 != 0) {
                            j2 = rj3.a;
                        }
                    }
                    kk0Var.s();
                    objP = kk0Var.P();
                    if (objP == Composer$Companion.getEmpty()) {
                        objP = new ml3();
                        kk0Var.l0(objP);
                    }
                    ml3Var = (ml3) objP;
                    int i19 = i3 & 14;
                    if (i19 == 4) {
                    }
                    objP2 = kk0Var.P();
                    if (z3) {
                        objP2 = new k(gh2Var, ml3Var, null, 27);
                        kk0Var.l0(objP2);
                    } else {
                        objP2 = new k(gh2Var, ml3Var, null, 27);
                        kk0Var.l0(objP2);
                    }
                    r11.LaunchedEffect(gh2Var, (ne1) objP2, kk0Var, i19);
                    if (ml3Var.isEmpty()) {
                        jFloatToRawIntBits = (((long) Float.floatToRawIntBits(ux0.a(j2))) & 4294967295L) | (((long) Float.floatToRawIntBits(ux0.b(j2) / 2.0f)) << 32);
                    } else {
                        jFloatToRawIntBits = j2;
                    }
                    FillElement fillElement9 = d.a;
                    c cVarI9 = a.i(d.k(cVar2, ux0.b(jFloatToRawIntBits), ux0.a(jFloatToRawIntBits)), gh2Var);
                    if (z2) {
                        j3 = ii3Var2.a;
                    } else {
                        j3 = ii3Var2.f;
                    }
                    cm3.Spacer(a.b(cVarI9, j3, wg3.getValue(tg3.m, kk0Var, 6)), kk0Var, 0);
                    cVar3 = cVar2;
                }
                ii3Var3 = ii3Var2;
                z4 = z2;
                j4 = j2;
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new xb(this, gh2Var, cVar3, ii3Var3, z4, j4, i, i2));
                }
            }
            i3 |= 24576;
            j2 = j;
            if ((i2 & 32) != 0) {
                i3 |= 196608;
            } else if ((i & 196608) == 0) {
                if (kk0Var.h(this)) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
                i3 |= i8;
            }
            if ((74899 & i3) == 74898) {
                kk0Var.X();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        cVar2 = c.i;
                    }
                    if ((i2 & 4) != 0) {
                        ii3 ii3VarColors18 = colors(kk0Var, (i3 >> 15) & 14);
                        i3 &= -897;
                        ii3Var2 = ii3VarColors18;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if (i6 != 0) {
                        j2 = rj3.a;
                    }
                } else {
                    if (i10 != 0) {
                        cVar2 = c.i;
                    }
                    if ((i2 & 4) != 0) {
                        ii3 ii3VarColors19 = colors(kk0Var, (i3 >> 15) & 14);
                        i3 &= -897;
                        ii3Var2 = ii3VarColors19;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if (i6 != 0) {
                        j2 = rj3.a;
                    }
                }
                kk0Var.s();
                objP = kk0Var.P();
                if (objP == Composer$Companion.getEmpty()) {
                    objP = new ml3();
                    kk0Var.l0(objP);
                }
                ml3Var = (ml3) objP;
                int i110 = i3 & 14;
                if (i110 == 4) {
                }
                objP2 = kk0Var.P();
                if (z3) {
                    objP2 = new k(gh2Var, ml3Var, null, 27);
                    kk0Var.l0(objP2);
                } else {
                    objP2 = new k(gh2Var, ml3Var, null, 27);
                    kk0Var.l0(objP2);
                }
                r11.LaunchedEffect(gh2Var, (ne1) objP2, kk0Var, i110);
                if (ml3Var.isEmpty()) {
                    jFloatToRawIntBits = (((long) Float.floatToRawIntBits(ux0.a(j2))) & 4294967295L) | (((long) Float.floatToRawIntBits(ux0.b(j2) / 2.0f)) << 32);
                } else {
                    jFloatToRawIntBits = j2;
                }
                FillElement fillElement10 = d.a;
                c cVarI10 = a.i(d.k(cVar2, ux0.b(jFloatToRawIntBits), ux0.a(jFloatToRawIntBits)), gh2Var);
                if (z2) {
                    j3 = ii3Var2.a;
                } else {
                    j3 = ii3Var2.f;
                }
                cm3.Spacer(a.b(cVarI10, j3, wg3.getValue(tg3.m, kk0Var, 6)), kk0Var, 0);
                cVar3 = cVar2;
            } else {
                kk0Var.X();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        cVar2 = c.i;
                    }
                    if ((i2 & 4) != 0) {
                        ii3 ii3VarColors110 = colors(kk0Var, (i3 >> 15) & 14);
                        i3 &= -897;
                        ii3Var2 = ii3VarColors110;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if (i6 != 0) {
                        j2 = rj3.a;
                    }
                } else {
                    if (i10 != 0) {
                        cVar2 = c.i;
                    }
                    if ((i2 & 4) != 0) {
                        ii3 ii3VarColors111 = colors(kk0Var, (i3 >> 15) & 14);
                        i3 &= -897;
                        ii3Var2 = ii3VarColors111;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if (i6 != 0) {
                        j2 = rj3.a;
                    }
                }
                kk0Var.s();
                objP = kk0Var.P();
                if (objP == Composer$Companion.getEmpty()) {
                    objP = new ml3();
                    kk0Var.l0(objP);
                }
                ml3Var = (ml3) objP;
                int i111 = i3 & 14;
                if (i111 == 4) {
                }
                objP2 = kk0Var.P();
                if (z3) {
                    objP2 = new k(gh2Var, ml3Var, null, 27);
                    kk0Var.l0(objP2);
                } else {
                    objP2 = new k(gh2Var, ml3Var, null, 27);
                    kk0Var.l0(objP2);
                }
                r11.LaunchedEffect(gh2Var, (ne1) objP2, kk0Var, i111);
                if (ml3Var.isEmpty()) {
                    jFloatToRawIntBits = (((long) Float.floatToRawIntBits(ux0.a(j2))) & 4294967295L) | (((long) Float.floatToRawIntBits(ux0.b(j2) / 2.0f)) << 32);
                } else {
                    jFloatToRawIntBits = j2;
                }
                FillElement fillElement11 = d.a;
                c cVarI11 = a.i(d.k(cVar2, ux0.b(jFloatToRawIntBits), ux0.a(jFloatToRawIntBits)), gh2Var);
                if (z2) {
                    j3 = ii3Var2.a;
                } else {
                    j3 = ii3Var2.f;
                }
                cm3.Spacer(a.b(cVarI11, j3, wg3.getValue(tg3.m, kk0Var, 6)), kk0Var, 0);
                cVar3 = cVar2;
            }
            ii3Var3 = ii3Var2;
            z4 = z2;
            j4 = j2;
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new xb(this, gh2Var, cVar3, ii3Var3, z4, j4, i, i2));
            }
        }
        i3 |= 3072;
        z2 = z;
        i6 = i2 & 16;
        if (i6 != 0) {
            if ((i & 24576) == 0) {
                j2 = j;
                if (kk0Var.g(j2)) {
                    i7 = 16384;
                } else {
                    i7 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                }
                i3 |= i7;
            }
            if ((i2 & 32) != 0) {
                i3 |= 196608;
            } else if ((i & 196608) == 0) {
                if (kk0Var.h(this)) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
                i3 |= i8;
            }
            if ((74899 & i3) == 74898) {
                kk0Var.X();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        cVar2 = c.i;
                    }
                    if ((i2 & 4) != 0) {
                        ii3 ii3VarColors112 = colors(kk0Var, (i3 >> 15) & 14);
                        i3 &= -897;
                        ii3Var2 = ii3VarColors112;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if (i6 != 0) {
                        j2 = rj3.a;
                    }
                } else {
                    if (i10 != 0) {
                        cVar2 = c.i;
                    }
                    if ((i2 & 4) != 0) {
                        ii3 ii3VarColors113 = colors(kk0Var, (i3 >> 15) & 14);
                        i3 &= -897;
                        ii3Var2 = ii3VarColors113;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if (i6 != 0) {
                        j2 = rj3.a;
                    }
                }
                kk0Var.s();
                objP = kk0Var.P();
                if (objP == Composer$Companion.getEmpty()) {
                    objP = new ml3();
                    kk0Var.l0(objP);
                }
                ml3Var = (ml3) objP;
                int i112 = i3 & 14;
                if (i112 == 4) {
                }
                objP2 = kk0Var.P();
                if (z3) {
                    objP2 = new k(gh2Var, ml3Var, null, 27);
                    kk0Var.l0(objP2);
                } else {
                    objP2 = new k(gh2Var, ml3Var, null, 27);
                    kk0Var.l0(objP2);
                }
                r11.LaunchedEffect(gh2Var, (ne1) objP2, kk0Var, i112);
                if (ml3Var.isEmpty()) {
                    jFloatToRawIntBits = (((long) Float.floatToRawIntBits(ux0.a(j2))) & 4294967295L) | (((long) Float.floatToRawIntBits(ux0.b(j2) / 2.0f)) << 32);
                } else {
                    jFloatToRawIntBits = j2;
                }
                FillElement fillElement12 = d.a;
                c cVarI12 = a.i(d.k(cVar2, ux0.b(jFloatToRawIntBits), ux0.a(jFloatToRawIntBits)), gh2Var);
                if (z2) {
                    j3 = ii3Var2.a;
                } else {
                    j3 = ii3Var2.f;
                }
                cm3.Spacer(a.b(cVarI12, j3, wg3.getValue(tg3.m, kk0Var, 6)), kk0Var, 0);
                cVar3 = cVar2;
            } else {
                kk0Var.X();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        cVar2 = c.i;
                    }
                    if ((i2 & 4) != 0) {
                        ii3 ii3VarColors114 = colors(kk0Var, (i3 >> 15) & 14);
                        i3 &= -897;
                        ii3Var2 = ii3VarColors114;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if (i6 != 0) {
                        j2 = rj3.a;
                    }
                } else {
                    if (i10 != 0) {
                        cVar2 = c.i;
                    }
                    if ((i2 & 4) != 0) {
                        ii3 ii3VarColors115 = colors(kk0Var, (i3 >> 15) & 14);
                        i3 &= -897;
                        ii3Var2 = ii3VarColors115;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if (i6 != 0) {
                        j2 = rj3.a;
                    }
                }
                kk0Var.s();
                objP = kk0Var.P();
                if (objP == Composer$Companion.getEmpty()) {
                    objP = new ml3();
                    kk0Var.l0(objP);
                }
                ml3Var = (ml3) objP;
                int i113 = i3 & 14;
                if (i113 == 4) {
                }
                objP2 = kk0Var.P();
                if (z3) {
                    objP2 = new k(gh2Var, ml3Var, null, 27);
                    kk0Var.l0(objP2);
                } else {
                    objP2 = new k(gh2Var, ml3Var, null, 27);
                    kk0Var.l0(objP2);
                }
                r11.LaunchedEffect(gh2Var, (ne1) objP2, kk0Var, i113);
                if (ml3Var.isEmpty()) {
                    jFloatToRawIntBits = (((long) Float.floatToRawIntBits(ux0.a(j2))) & 4294967295L) | (((long) Float.floatToRawIntBits(ux0.b(j2) / 2.0f)) << 32);
                } else {
                    jFloatToRawIntBits = j2;
                }
                FillElement fillElement13 = d.a;
                c cVarI13 = a.i(d.k(cVar2, ux0.b(jFloatToRawIntBits), ux0.a(jFloatToRawIntBits)), gh2Var);
                if (z2) {
                    j3 = ii3Var2.a;
                } else {
                    j3 = ii3Var2.f;
                }
                cm3.Spacer(a.b(cVarI13, j3, wg3.getValue(tg3.m, kk0Var, 6)), kk0Var, 0);
                cVar3 = cVar2;
            }
            ii3Var3 = ii3Var2;
            z4 = z2;
            j4 = j2;
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new xb(this, gh2Var, cVar3, ii3Var3, z4, j4, i, i2));
            }
        }
        i3 |= 24576;
        j2 = j;
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((i & 196608) == 0) {
            if (kk0Var.h(this)) {
                i8 = 131072;
            } else {
                i8 = 65536;
            }
            i3 |= i8;
        }
        if ((74899 & i3) == 74898) {
            kk0Var.X();
            if ((i & 1) != 0) {
                if (i10 != 0) {
                    cVar2 = c.i;
                }
                if ((i2 & 4) != 0) {
                    ii3 ii3VarColors116 = colors(kk0Var, (i3 >> 15) & 14);
                    i3 &= -897;
                    ii3Var2 = ii3VarColors116;
                }
                if (i4 != 0) {
                    z2 = true;
                }
                if (i6 != 0) {
                    j2 = rj3.a;
                }
            } else {
                if (i10 != 0) {
                    cVar2 = c.i;
                }
                if ((i2 & 4) != 0) {
                    ii3 ii3VarColors117 = colors(kk0Var, (i3 >> 15) & 14);
                    i3 &= -897;
                    ii3Var2 = ii3VarColors117;
                }
                if (i4 != 0) {
                    z2 = true;
                }
                if (i6 != 0) {
                    j2 = rj3.a;
                }
            }
            kk0Var.s();
            objP = kk0Var.P();
            if (objP == Composer$Companion.getEmpty()) {
                objP = new ml3();
                kk0Var.l0(objP);
            }
            ml3Var = (ml3) objP;
            int i114 = i3 & 14;
            if (i114 == 4) {
            }
            objP2 = kk0Var.P();
            if (z3) {
                objP2 = new k(gh2Var, ml3Var, null, 27);
                kk0Var.l0(objP2);
            } else {
                objP2 = new k(gh2Var, ml3Var, null, 27);
                kk0Var.l0(objP2);
            }
            r11.LaunchedEffect(gh2Var, (ne1) objP2, kk0Var, i114);
            if (ml3Var.isEmpty()) {
                jFloatToRawIntBits = (((long) Float.floatToRawIntBits(ux0.a(j2))) & 4294967295L) | (((long) Float.floatToRawIntBits(ux0.b(j2) / 2.0f)) << 32);
            } else {
                jFloatToRawIntBits = j2;
            }
            FillElement fillElement14 = d.a;
            c cVarI14 = a.i(d.k(cVar2, ux0.b(jFloatToRawIntBits), ux0.a(jFloatToRawIntBits)), gh2Var);
            if (z2) {
                j3 = ii3Var2.a;
            } else {
                j3 = ii3Var2.f;
            }
            cm3.Spacer(a.b(cVarI14, j3, wg3.getValue(tg3.m, kk0Var, 6)), kk0Var, 0);
            cVar3 = cVar2;
        } else {
            kk0Var.X();
            if ((i & 1) != 0) {
                if (i10 != 0) {
                    cVar2 = c.i;
                }
                if ((i2 & 4) != 0) {
                    ii3 ii3VarColors118 = colors(kk0Var, (i3 >> 15) & 14);
                    i3 &= -897;
                    ii3Var2 = ii3VarColors118;
                }
                if (i4 != 0) {
                    z2 = true;
                }
                if (i6 != 0) {
                    j2 = rj3.a;
                }
            } else {
                if (i10 != 0) {
                    cVar2 = c.i;
                }
                if ((i2 & 4) != 0) {
                    ii3 ii3VarColors119 = colors(kk0Var, (i3 >> 15) & 14);
                    i3 &= -897;
                    ii3Var2 = ii3VarColors119;
                }
                if (i4 != 0) {
                    z2 = true;
                }
                if (i6 != 0) {
                    j2 = rj3.a;
                }
            }
            kk0Var.s();
            objP = kk0Var.P();
            if (objP == Composer$Companion.getEmpty()) {
                objP = new ml3();
                kk0Var.l0(objP);
            }
            ml3Var = (ml3) objP;
            int i115 = i3 & 14;
            if (i115 == 4) {
            }
            objP2 = kk0Var.P();
            if (z3) {
                objP2 = new k(gh2Var, ml3Var, null, 27);
                kk0Var.l0(objP2);
            } else {
                objP2 = new k(gh2Var, ml3Var, null, 27);
                kk0Var.l0(objP2);
            }
            r11.LaunchedEffect(gh2Var, (ne1) objP2, kk0Var, i115);
            if (ml3Var.isEmpty()) {
                jFloatToRawIntBits = (((long) Float.floatToRawIntBits(ux0.a(j2))) & 4294967295L) | (((long) Float.floatToRawIntBits(ux0.b(j2) / 2.0f)) << 32);
            } else {
                jFloatToRawIntBits = j2;
            }
            FillElement fillElement15 = d.a;
            c cVarI15 = a.i(d.k(cVar2, ux0.b(jFloatToRawIntBits), ux0.a(jFloatToRawIntBits)), gh2Var);
            if (z2) {
                j3 = ii3Var2.a;
            } else {
                j3 = ii3Var2.f;
            }
            cm3.Spacer(a.b(cVarI15, j3, wg3.getValue(tg3.m, kk0Var, 6)), kk0Var, 0);
            cVar3 = cVar2;
        }
        ii3Var3 = ii3Var2;
        z4 = z2;
        j4 = j2;
        w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new xb(this, gh2Var, cVar3, ii3Var3, z4, j4, i, i2));
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0043  */
    /* JADX WARN: Code duplicated, block: B:28:0x0047  */
    /* JADX WARN: Code duplicated, block: B:30:0x004f  */
    /* JADX WARN: Code duplicated, block: B:31:0x0052  */
    /* JADX WARN: Code duplicated, block: B:34:0x0058  */
    /* JADX WARN: Code duplicated, block: B:37:0x005e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0063  */
    /* JADX WARN: Code duplicated, block: B:41:0x0067  */
    /* JADX WARN: Code duplicated, block: B:43:0x006f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0072  */
    /* JADX WARN: Code duplicated, block: B:48:0x0079  */
    /* JADX WARN: Code duplicated, block: B:49:0x007c  */
    /* JADX WARN: Code duplicated, block: B:51:0x0080  */
    /* JADX WARN: Code duplicated, block: B:53:0x0086  */
    /* JADX WARN: Code duplicated, block: B:54:0x0089  */
    /* JADX WARN: Code duplicated, block: B:58:0x0092  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:72:0x00be A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:77:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:81:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:85:0x0110  */
    /* JADX WARN: Code duplicated, block: B:87:? A[RETURN, SYNTHETIC] */
    @cv0
    public final /* synthetic */ void Track(n23 n23Var, c cVar, ii3 ii3Var, boolean z, ck0 ck0Var, int i, int i2) {
        int i3;
        c cVar2;
        ii3 ii3Var2;
        int i4;
        boolean z2;
        int i5;
        int i6;
        c cVar3;
        ii3 ii3VarColors;
        int i7;
        c cVar4;
        boolean z3;
        boolean z4;
        c cVar5;
        w33 w33VarV;
        int i8;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(-1617869097);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (kk0Var.j(n23Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 == 0) {
            if ((i & 48) == 0) {
                cVar2 = cVar;
                i3 |= kk0Var.h(cVar2) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                if ((i2 & 4) == 0) {
                    ii3Var2 = ii3Var;
                    if (kk0Var.h(ii3Var2)) {
                        i8 = FontInfo.NUMBER_OF_CHAR_CODES;
                    }
                    i3 |= i8;
                } else {
                    ii3Var2 = ii3Var;
                }
                i8 = Uuid.SIZE_BITS;
                i3 |= i8;
            } else {
                ii3Var2 = ii3Var;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    z2 = z;
                    if (kk0Var.i(z2)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                if ((i2 & 16) != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    if (kk0Var.h(this)) {
                        i6 = 16384;
                    } else {
                        i6 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                    }
                    i3 |= i6;
                }
                if ((i3 & 9363) == 9362 || !kk0Var.F()) {
                    kk0Var.X();
                    if ((i & 1) != 0 || kk0Var.D()) {
                        if (i9 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if ((i2 & 4) != 0) {
                            ii3VarColors = colors(kk0Var, (i3 >> 12) & 14);
                            i3 &= -897;
                        } else {
                            ii3VarColors = ii3Var2;
                        }
                        if (i4 != 0) {
                            i7 = i3;
                            cVar4 = cVar3;
                            z3 = true;
                        } else {
                            i7 = i3;
                            cVar4 = cVar3;
                        }
                        kk0Var.s();
                        m1774x6ebfe39(n23Var, cVar4, z3, ii3VarColors, (ne1) null, (oe1) null, rj3.b, rj3.c, kk0Var, (i7 & 14) | 14155776 | (i7 & 112) | ((i7 >> 3) & 896) | ((i7 << 3) & 7168) | ((i7 << 12) & 234881024), 48);
                        z4 = z3;
                        cVar5 = cVar4;
                    } else {
                        kk0Var.V();
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                        }
                        ii3 ii3Var3 = ii3Var2;
                        i7 = i3;
                        cVar4 = cVar2;
                        ii3VarColors = ii3Var3;
                    }
                    z3 = z2;
                    kk0Var.s();
                    m1774x6ebfe39(n23Var, cVar4, z3, ii3VarColors, (ne1) null, (oe1) null, rj3.b, rj3.c, kk0Var, (i7 & 14) | 14155776 | (i7 & 112) | ((i7 >> 3) & 896) | ((i7 << 3) & 7168) | ((i7 << 12) & 234881024), 48);
                    z4 = z3;
                    cVar5 = cVar4;
                } else {
                    kk0Var.V();
                    cVar5 = cVar2;
                    ii3VarColors = ii3Var2;
                    z4 = z2;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new lj2(this, n23Var, cVar5, ii3VarColors, z4, i, i2, 2));
                }
            }
            i3 |= 3072;
            z2 = z;
            if ((i2 & 16) != 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                if (kk0Var.h(this)) {
                    i6 = 16384;
                } else {
                    i6 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                }
                i3 |= i6;
            }
            if ((i3 & 9363) == 9362) {
                kk0Var.X();
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if ((i2 & 4) != 0) {
                        ii3VarColors = colors(kk0Var, (i3 >> 12) & 14);
                        i3 &= -897;
                    } else {
                        ii3VarColors = ii3Var2;
                    }
                    if (i4 != 0) {
                        i7 = i3;
                        cVar4 = cVar3;
                        z3 = true;
                    } else {
                        i7 = i3;
                        cVar4 = cVar3;
                        z3 = z2;
                    }
                } else {
                    if (i9 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if ((i2 & 4) != 0) {
                        ii3VarColors = colors(kk0Var, (i3 >> 12) & 14);
                        i3 &= -897;
                    } else {
                        ii3VarColors = ii3Var2;
                    }
                    if (i4 != 0) {
                        i7 = i3;
                        cVar4 = cVar3;
                        z3 = true;
                    } else {
                        i7 = i3;
                        cVar4 = cVar3;
                        z3 = z2;
                    }
                }
                kk0Var.s();
                m1774x6ebfe39(n23Var, cVar4, z3, ii3VarColors, (ne1) null, (oe1) null, rj3.b, rj3.c, kk0Var, (i7 & 14) | 14155776 | (i7 & 112) | ((i7 >> 3) & 896) | ((i7 << 3) & 7168) | ((i7 << 12) & 234881024), 48);
                z4 = z3;
                cVar5 = cVar4;
            } else {
                kk0Var.X();
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if ((i2 & 4) != 0) {
                        ii3VarColors = colors(kk0Var, (i3 >> 12) & 14);
                        i3 &= -897;
                    } else {
                        ii3VarColors = ii3Var2;
                    }
                    if (i4 != 0) {
                        i7 = i3;
                        cVar4 = cVar3;
                        z3 = true;
                    } else {
                        i7 = i3;
                        cVar4 = cVar3;
                        z3 = z2;
                    }
                } else {
                    if (i9 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if ((i2 & 4) != 0) {
                        ii3VarColors = colors(kk0Var, (i3 >> 12) & 14);
                        i3 &= -897;
                    } else {
                        ii3VarColors = ii3Var2;
                    }
                    if (i4 != 0) {
                        i7 = i3;
                        cVar4 = cVar3;
                        z3 = true;
                    } else {
                        i7 = i3;
                        cVar4 = cVar3;
                        z3 = z2;
                    }
                }
                kk0Var.s();
                m1774x6ebfe39(n23Var, cVar4, z3, ii3VarColors, (ne1) null, (oe1) null, rj3.b, rj3.c, kk0Var, (i7 & 14) | 14155776 | (i7 & 112) | ((i7 >> 3) & 896) | ((i7 << 3) & 7168) | ((i7 << 12) & 234881024), 48);
                z4 = z3;
                cVar5 = cVar4;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new lj2(this, n23Var, cVar5, ii3VarColors, z4, i, i2, 2));
            }
        }
        i3 |= 48;
        cVar2 = cVar;
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                ii3Var2 = ii3Var;
                if (kk0Var.h(ii3Var2)) {
                    i8 = FontInfo.NUMBER_OF_CHAR_CODES;
                }
                i3 |= i8;
            } else {
                ii3Var2 = ii3Var;
            }
            i8 = Uuid.SIZE_BITS;
            i3 |= i8;
        } else {
            ii3Var2 = ii3Var;
        }
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                z2 = z;
                if (kk0Var.i(z2)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            if ((i2 & 16) != 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                if (kk0Var.h(this)) {
                    i6 = 16384;
                } else {
                    i6 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                }
                i3 |= i6;
            }
            if ((i3 & 9363) == 9362) {
                kk0Var.X();
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if ((i2 & 4) != 0) {
                        ii3VarColors = colors(kk0Var, (i3 >> 12) & 14);
                        i3 &= -897;
                    } else {
                        ii3VarColors = ii3Var2;
                    }
                    if (i4 != 0) {
                        i7 = i3;
                        cVar4 = cVar3;
                        z3 = true;
                    } else {
                        i7 = i3;
                        cVar4 = cVar3;
                        z3 = z2;
                    }
                } else {
                    if (i9 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if ((i2 & 4) != 0) {
                        ii3VarColors = colors(kk0Var, (i3 >> 12) & 14);
                        i3 &= -897;
                    } else {
                        ii3VarColors = ii3Var2;
                    }
                    if (i4 != 0) {
                        i7 = i3;
                        cVar4 = cVar3;
                        z3 = true;
                    } else {
                        i7 = i3;
                        cVar4 = cVar3;
                        z3 = z2;
                    }
                }
                kk0Var.s();
                m1774x6ebfe39(n23Var, cVar4, z3, ii3VarColors, (ne1) null, (oe1) null, rj3.b, rj3.c, kk0Var, (i7 & 14) | 14155776 | (i7 & 112) | ((i7 >> 3) & 896) | ((i7 << 3) & 7168) | ((i7 << 12) & 234881024), 48);
                z4 = z3;
                cVar5 = cVar4;
            } else {
                kk0Var.X();
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if ((i2 & 4) != 0) {
                        ii3VarColors = colors(kk0Var, (i3 >> 12) & 14);
                        i3 &= -897;
                    } else {
                        ii3VarColors = ii3Var2;
                    }
                    if (i4 != 0) {
                        i7 = i3;
                        cVar4 = cVar3;
                        z3 = true;
                    } else {
                        i7 = i3;
                        cVar4 = cVar3;
                        z3 = z2;
                    }
                } else {
                    if (i9 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if ((i2 & 4) != 0) {
                        ii3VarColors = colors(kk0Var, (i3 >> 12) & 14);
                        i3 &= -897;
                    } else {
                        ii3VarColors = ii3Var2;
                    }
                    if (i4 != 0) {
                        i7 = i3;
                        cVar4 = cVar3;
                        z3 = true;
                    } else {
                        i7 = i3;
                        cVar4 = cVar3;
                        z3 = z2;
                    }
                }
                kk0Var.s();
                m1774x6ebfe39(n23Var, cVar4, z3, ii3VarColors, (ne1) null, (oe1) null, rj3.b, rj3.c, kk0Var, (i7 & 14) | 14155776 | (i7 & 112) | ((i7 >> 3) & 896) | ((i7 << 3) & 7168) | ((i7 << 12) & 234881024), 48);
                z4 = z3;
                cVar5 = cVar4;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new lj2(this, n23Var, cVar5, ii3VarColors, z4, i, i2, 2));
            }
        }
        i3 |= 3072;
        z2 = z;
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            if (kk0Var.h(this)) {
                i6 = 16384;
            } else {
                i6 = ConstantsKt.DEFAULT_BUFFER_SIZE;
            }
            i3 |= i6;
        }
        if ((i3 & 9363) == 9362) {
            kk0Var.X();
            if ((i & 1) != 0) {
                if (i9 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if ((i2 & 4) != 0) {
                    ii3VarColors = colors(kk0Var, (i3 >> 12) & 14);
                    i3 &= -897;
                } else {
                    ii3VarColors = ii3Var2;
                }
                if (i4 != 0) {
                    i7 = i3;
                    cVar4 = cVar3;
                    z3 = true;
                } else {
                    i7 = i3;
                    cVar4 = cVar3;
                    z3 = z2;
                }
            } else {
                if (i9 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if ((i2 & 4) != 0) {
                    ii3VarColors = colors(kk0Var, (i3 >> 12) & 14);
                    i3 &= -897;
                } else {
                    ii3VarColors = ii3Var2;
                }
                if (i4 != 0) {
                    i7 = i3;
                    cVar4 = cVar3;
                    z3 = true;
                } else {
                    i7 = i3;
                    cVar4 = cVar3;
                    z3 = z2;
                }
            }
            kk0Var.s();
            m1774x6ebfe39(n23Var, cVar4, z3, ii3VarColors, (ne1) null, (oe1) null, rj3.b, rj3.c, kk0Var, (i7 & 14) | 14155776 | (i7 & 112) | ((i7 >> 3) & 896) | ((i7 << 3) & 7168) | ((i7 << 12) & 234881024), 48);
            z4 = z3;
            cVar5 = cVar4;
        } else {
            kk0Var.X();
            if ((i & 1) != 0) {
                if (i9 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if ((i2 & 4) != 0) {
                    ii3VarColors = colors(kk0Var, (i3 >> 12) & 14);
                    i3 &= -897;
                } else {
                    ii3VarColors = ii3Var2;
                }
                if (i4 != 0) {
                    i7 = i3;
                    cVar4 = cVar3;
                    z3 = true;
                } else {
                    i7 = i3;
                    cVar4 = cVar3;
                    z3 = z2;
                }
            } else {
                if (i9 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if ((i2 & 4) != 0) {
                    ii3VarColors = colors(kk0Var, (i3 >> 12) & 14);
                    i3 &= -897;
                } else {
                    ii3VarColors = ii3Var2;
                }
                if (i4 != 0) {
                    i7 = i3;
                    cVar4 = cVar3;
                    z3 = true;
                } else {
                    i7 = i3;
                    cVar4 = cVar3;
                    z3 = z2;
                }
            }
            kk0Var.s();
            m1774x6ebfe39(n23Var, cVar4, z3, ii3VarColors, (ne1) null, (oe1) null, rj3.b, rj3.c, kk0Var, (i7 & 14) | 14155776 | (i7 & 112) | ((i7 >> 3) & 896) | ((i7 << 3) & 7168) | ((i7 << 12) & 234881024), 48);
            z4 = z3;
            cVar5 = cVar4;
        }
        w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new lj2(this, n23Var, cVar5, ii3VarColors, z4, i, i2, 2));
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
    /* JADX WARN: Code duplicated, block: B:48:0x007c  */
    /* JADX WARN: Code duplicated, block: B:49:0x007f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0083  */
    /* JADX WARN: Code duplicated, block: B:53:0x0089  */
    /* JADX WARN: Code duplicated, block: B:54:0x008c  */
    /* JADX WARN: Code duplicated, block: B:58:0x0095  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:72:0x00bf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:77:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:83:0x010a  */
    /* JADX WARN: Code duplicated, block: B:84:0x010c  */
    /* JADX WARN: Code duplicated, block: B:87:0x0124  */
    /* JADX WARN: Code duplicated, block: B:89:0x012a  */
    /* JADX WARN: Code duplicated, block: B:95:0x014d  */
    /* JADX WARN: Code duplicated, block: B:97:? A[RETURN, SYNTHETIC] */
    @cv0
    public final void Track(sj3 sj3Var, c cVar, ii3 ii3Var, boolean z, ck0 ck0Var, int i, int i2) {
        int i3;
        c cVar2;
        ii3 ii3Var2;
        int i4;
        boolean z2;
        int i5;
        int i6;
        c cVar3;
        ii3 ii3VarColors;
        long jB;
        c cVar4;
        long jB2;
        long jA;
        long jA2;
        boolean z3;
        boolean zG;
        Object objP;
        c cVar5;
        ii3 ii3Var3;
        c cVar6;
        boolean z4;
        w33 w33VarV;
        int i7;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(-1546713545);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (kk0Var.h(sj3Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 == 0) {
            if ((i & 48) == 0) {
                cVar2 = cVar;
                i3 |= kk0Var.h(cVar2) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                if ((i2 & 4) == 0) {
                    ii3Var2 = ii3Var;
                    if (kk0Var.h(ii3Var2)) {
                        i7 = FontInfo.NUMBER_OF_CHAR_CODES;
                    }
                    i3 |= i7;
                } else {
                    ii3Var2 = ii3Var;
                }
                i7 = Uuid.SIZE_BITS;
                i3 |= i7;
            } else {
                ii3Var2 = ii3Var;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    z2 = z;
                    if (kk0Var.i(z2)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                if ((i2 & 16) != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    if (kk0Var.h(this)) {
                        i6 = 16384;
                    } else {
                        i6 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                    }
                    i3 |= i6;
                }
                if ((i3 & 9363) == 9362 || !kk0Var.F()) {
                    kk0Var.X();
                    if ((i & 1) != 0 || kk0Var.D()) {
                        if (i8 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if ((i2 & 4) != 0) {
                            ii3VarColors = colors(kk0Var, (i3 >> 12) & 14);
                            i3 &= -897;
                        } else {
                            ii3VarColors = ii3Var2;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                    } else {
                        kk0Var.V();
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                        }
                        cVar3 = cVar2;
                        ii3VarColors = ii3Var2;
                    }
                    kk0Var.s();
                    jB = ii3VarColors.b(z2, false);
                    cVar4 = cVar3;
                    jB2 = ii3VarColors.b(z2, true);
                    jA = ii3VarColors.a(z2, false);
                    jA2 = ii3VarColors.a(z2, true);
                    c cVarThen = cVar4.then(d.a);
                    float f = rj3.b;
                    c cVarD = d.d(cVarThen, 16.0f);
                    boolean zG2 = kk0Var.g(jB);
                    if ((i3 & 14) == 4) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    zG = zG2 | z3 | kk0Var.g(jB2) | kk0Var.g(jA) | kk0Var.g(jA2);
                    objP = kk0Var.P();
                    if (!zG || objP == Composer$Companion.getEmpty()) {
                        cVar5 = cVar4;
                        ma maVar = new ma(jB, jB2, jA, jA2);
                        kk0Var.l0(maVar);
                        objP = maVar;
                    } else {
                        cVar5 = cVar4;
                    }
                    c10.Canvas(cVarD, (le1) objP, kk0Var, 0);
                    ii3Var3 = ii3VarColors;
                    cVar6 = cVar5;
                } else {
                    kk0Var.V();
                    cVar6 = cVar2;
                    ii3Var3 = ii3Var2;
                }
                z4 = z2;
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new bx(this, cVar6, ii3Var3, z4, i, i2));
                }
            }
            i3 |= 3072;
            z2 = z;
            if ((i2 & 16) != 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                if (kk0Var.h(this)) {
                    i6 = 16384;
                } else {
                    i6 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                }
                i3 |= i6;
            }
            if ((i3 & 9363) == 9362) {
                kk0Var.X();
                if ((i & 1) != 0) {
                    if (i8 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if ((i2 & 4) != 0) {
                        ii3VarColors = colors(kk0Var, (i3 >> 12) & 14);
                        i3 &= -897;
                    } else {
                        ii3VarColors = ii3Var2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                } else {
                    if (i8 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if ((i2 & 4) != 0) {
                        ii3VarColors = colors(kk0Var, (i3 >> 12) & 14);
                        i3 &= -897;
                    } else {
                        ii3VarColors = ii3Var2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                }
                kk0Var.s();
                jB = ii3VarColors.b(z2, false);
                cVar4 = cVar3;
                jB2 = ii3VarColors.b(z2, true);
                jA = ii3VarColors.a(z2, false);
                jA2 = ii3VarColors.a(z2, true);
                c cVarThen2 = cVar4.then(d.a);
                float f2 = rj3.b;
                c cVarD2 = d.d(cVarThen2, 16.0f);
                boolean zG3 = kk0Var.g(jB);
                if ((i3 & 14) == 4) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                zG = zG3 | z3 | kk0Var.g(jB2) | kk0Var.g(jA) | kk0Var.g(jA2);
                objP = kk0Var.P();
                if (zG) {
                    cVar5 = cVar4;
                    ma maVar2 = new ma(jB, jB2, jA, jA2);
                    kk0Var.l0(maVar2);
                    objP = maVar2;
                } else {
                    cVar5 = cVar4;
                    ma maVar3 = new ma(jB, jB2, jA, jA2);
                    kk0Var.l0(maVar3);
                    objP = maVar3;
                }
                c10.Canvas(cVarD2, (le1) objP, kk0Var, 0);
                ii3Var3 = ii3VarColors;
                cVar6 = cVar5;
            } else {
                kk0Var.X();
                if ((i & 1) != 0) {
                    if (i8 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if ((i2 & 4) != 0) {
                        ii3VarColors = colors(kk0Var, (i3 >> 12) & 14);
                        i3 &= -897;
                    } else {
                        ii3VarColors = ii3Var2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                } else {
                    if (i8 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if ((i2 & 4) != 0) {
                        ii3VarColors = colors(kk0Var, (i3 >> 12) & 14);
                        i3 &= -897;
                    } else {
                        ii3VarColors = ii3Var2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                }
                kk0Var.s();
                jB = ii3VarColors.b(z2, false);
                cVar4 = cVar3;
                jB2 = ii3VarColors.b(z2, true);
                jA = ii3VarColors.a(z2, false);
                jA2 = ii3VarColors.a(z2, true);
                c cVarThen3 = cVar4.then(d.a);
                float f3 = rj3.b;
                c cVarD3 = d.d(cVarThen3, 16.0f);
                boolean zG4 = kk0Var.g(jB);
                if ((i3 & 14) == 4) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                zG = zG4 | z3 | kk0Var.g(jB2) | kk0Var.g(jA) | kk0Var.g(jA2);
                objP = kk0Var.P();
                if (zG) {
                    cVar5 = cVar4;
                    ma maVar4 = new ma(jB, jB2, jA, jA2);
                    kk0Var.l0(maVar4);
                    objP = maVar4;
                } else {
                    cVar5 = cVar4;
                    ma maVar5 = new ma(jB, jB2, jA, jA2);
                    kk0Var.l0(maVar5);
                    objP = maVar5;
                }
                c10.Canvas(cVarD3, (le1) objP, kk0Var, 0);
                ii3Var3 = ii3VarColors;
                cVar6 = cVar5;
            }
            z4 = z2;
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new bx(this, cVar6, ii3Var3, z4, i, i2));
            }
        }
        i3 |= 48;
        cVar2 = cVar;
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                ii3Var2 = ii3Var;
                if (kk0Var.h(ii3Var2)) {
                    i7 = FontInfo.NUMBER_OF_CHAR_CODES;
                }
                i3 |= i7;
            } else {
                ii3Var2 = ii3Var;
            }
            i7 = Uuid.SIZE_BITS;
            i3 |= i7;
        } else {
            ii3Var2 = ii3Var;
        }
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                z2 = z;
                if (kk0Var.i(z2)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            if ((i2 & 16) != 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                if (kk0Var.h(this)) {
                    i6 = 16384;
                } else {
                    i6 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                }
                i3 |= i6;
            }
            if ((i3 & 9363) == 9362) {
                kk0Var.X();
                if ((i & 1) != 0) {
                    if (i8 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if ((i2 & 4) != 0) {
                        ii3VarColors = colors(kk0Var, (i3 >> 12) & 14);
                        i3 &= -897;
                    } else {
                        ii3VarColors = ii3Var2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                } else {
                    if (i8 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if ((i2 & 4) != 0) {
                        ii3VarColors = colors(kk0Var, (i3 >> 12) & 14);
                        i3 &= -897;
                    } else {
                        ii3VarColors = ii3Var2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                }
                kk0Var.s();
                jB = ii3VarColors.b(z2, false);
                cVar4 = cVar3;
                jB2 = ii3VarColors.b(z2, true);
                jA = ii3VarColors.a(z2, false);
                jA2 = ii3VarColors.a(z2, true);
                c cVarThen4 = cVar4.then(d.a);
                float f4 = rj3.b;
                c cVarD4 = d.d(cVarThen4, 16.0f);
                boolean zG5 = kk0Var.g(jB);
                if ((i3 & 14) == 4) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                zG = zG5 | z3 | kk0Var.g(jB2) | kk0Var.g(jA) | kk0Var.g(jA2);
                objP = kk0Var.P();
                if (zG) {
                    cVar5 = cVar4;
                    ma maVar6 = new ma(jB, jB2, jA, jA2);
                    kk0Var.l0(maVar6);
                    objP = maVar6;
                } else {
                    cVar5 = cVar4;
                    ma maVar7 = new ma(jB, jB2, jA, jA2);
                    kk0Var.l0(maVar7);
                    objP = maVar7;
                }
                c10.Canvas(cVarD4, (le1) objP, kk0Var, 0);
                ii3Var3 = ii3VarColors;
                cVar6 = cVar5;
            } else {
                kk0Var.X();
                if ((i & 1) != 0) {
                    if (i8 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if ((i2 & 4) != 0) {
                        ii3VarColors = colors(kk0Var, (i3 >> 12) & 14);
                        i3 &= -897;
                    } else {
                        ii3VarColors = ii3Var2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                } else {
                    if (i8 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if ((i2 & 4) != 0) {
                        ii3VarColors = colors(kk0Var, (i3 >> 12) & 14);
                        i3 &= -897;
                    } else {
                        ii3VarColors = ii3Var2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                }
                kk0Var.s();
                jB = ii3VarColors.b(z2, false);
                cVar4 = cVar3;
                jB2 = ii3VarColors.b(z2, true);
                jA = ii3VarColors.a(z2, false);
                jA2 = ii3VarColors.a(z2, true);
                c cVarThen5 = cVar4.then(d.a);
                float f5 = rj3.b;
                c cVarD5 = d.d(cVarThen5, 16.0f);
                boolean zG6 = kk0Var.g(jB);
                if ((i3 & 14) == 4) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                zG = zG6 | z3 | kk0Var.g(jB2) | kk0Var.g(jA) | kk0Var.g(jA2);
                objP = kk0Var.P();
                if (zG) {
                    cVar5 = cVar4;
                    ma maVar8 = new ma(jB, jB2, jA, jA2);
                    kk0Var.l0(maVar8);
                    objP = maVar8;
                } else {
                    cVar5 = cVar4;
                    ma maVar9 = new ma(jB, jB2, jA, jA2);
                    kk0Var.l0(maVar9);
                    objP = maVar9;
                }
                c10.Canvas(cVarD5, (le1) objP, kk0Var, 0);
                ii3Var3 = ii3VarColors;
                cVar6 = cVar5;
            }
            z4 = z2;
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new bx(this, cVar6, ii3Var3, z4, i, i2));
            }
        }
        i3 |= 3072;
        z2 = z;
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            if (kk0Var.h(this)) {
                i6 = 16384;
            } else {
                i6 = ConstantsKt.DEFAULT_BUFFER_SIZE;
            }
            i3 |= i6;
        }
        if ((i3 & 9363) == 9362) {
            kk0Var.X();
            if ((i & 1) != 0) {
                if (i8 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if ((i2 & 4) != 0) {
                    ii3VarColors = colors(kk0Var, (i3 >> 12) & 14);
                    i3 &= -897;
                } else {
                    ii3VarColors = ii3Var2;
                }
                if (i4 != 0) {
                    z2 = true;
                }
            } else {
                if (i8 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if ((i2 & 4) != 0) {
                    ii3VarColors = colors(kk0Var, (i3 >> 12) & 14);
                    i3 &= -897;
                } else {
                    ii3VarColors = ii3Var2;
                }
                if (i4 != 0) {
                    z2 = true;
                }
            }
            kk0Var.s();
            jB = ii3VarColors.b(z2, false);
            cVar4 = cVar3;
            jB2 = ii3VarColors.b(z2, true);
            jA = ii3VarColors.a(z2, false);
            jA2 = ii3VarColors.a(z2, true);
            c cVarThen6 = cVar4.then(d.a);
            float f6 = rj3.b;
            c cVarD6 = d.d(cVarThen6, 16.0f);
            boolean zG7 = kk0Var.g(jB);
            if ((i3 & 14) == 4) {
                z3 = true;
            } else {
                z3 = false;
            }
            zG = zG7 | z3 | kk0Var.g(jB2) | kk0Var.g(jA) | kk0Var.g(jA2);
            objP = kk0Var.P();
            if (zG) {
                cVar5 = cVar4;
                ma maVar10 = new ma(jB, jB2, jA, jA2);
                kk0Var.l0(maVar10);
                objP = maVar10;
            } else {
                cVar5 = cVar4;
                ma maVar11 = new ma(jB, jB2, jA, jA2);
                kk0Var.l0(maVar11);
                objP = maVar11;
            }
            c10.Canvas(cVarD6, (le1) objP, kk0Var, 0);
            ii3Var3 = ii3VarColors;
            cVar6 = cVar5;
        } else {
            kk0Var.X();
            if ((i & 1) != 0) {
                if (i8 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if ((i2 & 4) != 0) {
                    ii3VarColors = colors(kk0Var, (i3 >> 12) & 14);
                    i3 &= -897;
                } else {
                    ii3VarColors = ii3Var2;
                }
                if (i4 != 0) {
                    z2 = true;
                }
            } else {
                if (i8 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if ((i2 & 4) != 0) {
                    ii3VarColors = colors(kk0Var, (i3 >> 12) & 14);
                    i3 &= -897;
                } else {
                    ii3VarColors = ii3Var2;
                }
                if (i4 != 0) {
                    z2 = true;
                }
            }
            kk0Var.s();
            jB = ii3VarColors.b(z2, false);
            cVar4 = cVar3;
            jB2 = ii3VarColors.b(z2, true);
            jA = ii3VarColors.a(z2, false);
            jA2 = ii3VarColors.a(z2, true);
            c cVarThen7 = cVar4.then(d.a);
            float f7 = rj3.b;
            c cVarD7 = d.d(cVarThen7, 16.0f);
            boolean zG8 = kk0Var.g(jB);
            if ((i3 & 14) == 4) {
                z3 = true;
            } else {
                z3 = false;
            }
            zG = zG8 | z3 | kk0Var.g(jB2) | kk0Var.g(jA) | kk0Var.g(jA2);
            objP = kk0Var.P();
            if (zG) {
                cVar5 = cVar4;
                ma maVar12 = new ma(jB, jB2, jA, jA2);
                kk0Var.l0(maVar12);
                objP = maVar12;
            } else {
                cVar5 = cVar4;
                ma maVar13 = new ma(jB, jB2, jA, jA2);
                kk0Var.l0(maVar13);
                objP = maVar13;
            }
            c10.Canvas(cVarD7, (le1) objP, kk0Var, 0);
            ii3Var3 = ii3VarColors;
            cVar6 = cVar5;
        }
        z4 = z2;
        w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new bx(this, cVar6, ii3Var3, z4, i, i2));
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0043  */
    /* JADX WARN: Code duplicated, block: B:28:0x0047  */
    /* JADX WARN: Code duplicated, block: B:30:0x004f  */
    /* JADX WARN: Code duplicated, block: B:31:0x0052  */
    /* JADX WARN: Code duplicated, block: B:34:0x0058  */
    /* JADX WARN: Code duplicated, block: B:37:0x005e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0063  */
    /* JADX WARN: Code duplicated, block: B:41:0x0067  */
    /* JADX WARN: Code duplicated, block: B:43:0x006f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0072  */
    /* JADX WARN: Code duplicated, block: B:48:0x0079  */
    /* JADX WARN: Code duplicated, block: B:49:0x007c  */
    /* JADX WARN: Code duplicated, block: B:51:0x0080  */
    /* JADX WARN: Code duplicated, block: B:53:0x0086  */
    /* JADX WARN: Code duplicated, block: B:54:0x0089  */
    /* JADX WARN: Code duplicated, block: B:58:0x0092  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:72:0x00be A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:77:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:81:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:85:0x0110  */
    /* JADX WARN: Code duplicated, block: B:87:? A[RETURN, SYNTHETIC] */
    @cv0
    public final /* synthetic */ void Track(uj3 uj3Var, c cVar, ii3 ii3Var, boolean z, ck0 ck0Var, int i, int i2) {
        int i3;
        c cVar2;
        ii3 ii3Var2;
        int i4;
        boolean z2;
        int i5;
        int i6;
        c cVar3;
        ii3 ii3VarColors;
        int i7;
        c cVar4;
        boolean z3;
        boolean z4;
        c cVar5;
        w33 w33VarV;
        int i8;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(593554206);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (kk0Var.j(uj3Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 == 0) {
            if ((i & 48) == 0) {
                cVar2 = cVar;
                i3 |= kk0Var.h(cVar2) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                if ((i2 & 4) == 0) {
                    ii3Var2 = ii3Var;
                    if (kk0Var.h(ii3Var2)) {
                        i8 = FontInfo.NUMBER_OF_CHAR_CODES;
                    }
                    i3 |= i8;
                } else {
                    ii3Var2 = ii3Var;
                }
                i8 = Uuid.SIZE_BITS;
                i3 |= i8;
            } else {
                ii3Var2 = ii3Var;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    z2 = z;
                    if (kk0Var.i(z2)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                if ((i2 & 16) != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    if (kk0Var.h(this)) {
                        i6 = 16384;
                    } else {
                        i6 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                    }
                    i3 |= i6;
                }
                if ((i3 & 9363) == 9362 || !kk0Var.F()) {
                    kk0Var.X();
                    if ((i & 1) != 0 || kk0Var.D()) {
                        if (i9 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if ((i2 & 4) != 0) {
                            ii3VarColors = colors(kk0Var, (i3 >> 12) & 14);
                            i3 &= -897;
                        } else {
                            ii3VarColors = ii3Var2;
                        }
                        if (i4 != 0) {
                            i7 = i3;
                            cVar4 = cVar3;
                            z3 = true;
                        } else {
                            i7 = i3;
                            cVar4 = cVar3;
                        }
                        kk0Var.s();
                        m1775x6ebfe39(uj3Var, cVar4, z3, ii3VarColors, (ne1) null, (oe1) null, rj3.b, rj3.c, kk0Var, (i7 & 14) | 14155776 | (i7 & 112) | ((i7 >> 3) & 896) | ((i7 << 3) & 7168) | ((i7 << 12) & 234881024), 48);
                        z4 = z3;
                        cVar5 = cVar4;
                    } else {
                        kk0Var.V();
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                        }
                        ii3 ii3Var3 = ii3Var2;
                        i7 = i3;
                        cVar4 = cVar2;
                        ii3VarColors = ii3Var3;
                    }
                    z3 = z2;
                    kk0Var.s();
                    m1775x6ebfe39(uj3Var, cVar4, z3, ii3VarColors, (ne1) null, (oe1) null, rj3.b, rj3.c, kk0Var, (i7 & 14) | 14155776 | (i7 & 112) | ((i7 >> 3) & 896) | ((i7 << 3) & 7168) | ((i7 << 12) & 234881024), 48);
                    z4 = z3;
                    cVar5 = cVar4;
                } else {
                    kk0Var.V();
                    cVar5 = cVar2;
                    ii3VarColors = ii3Var2;
                    z4 = z2;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new lj2(this, uj3Var, cVar5, ii3VarColors, z4, i, i2, 1));
                }
            }
            i3 |= 3072;
            z2 = z;
            if ((i2 & 16) != 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                if (kk0Var.h(this)) {
                    i6 = 16384;
                } else {
                    i6 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                }
                i3 |= i6;
            }
            if ((i3 & 9363) == 9362) {
                kk0Var.X();
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if ((i2 & 4) != 0) {
                        ii3VarColors = colors(kk0Var, (i3 >> 12) & 14);
                        i3 &= -897;
                    } else {
                        ii3VarColors = ii3Var2;
                    }
                    if (i4 != 0) {
                        i7 = i3;
                        cVar4 = cVar3;
                        z3 = true;
                    } else {
                        i7 = i3;
                        cVar4 = cVar3;
                        z3 = z2;
                    }
                } else {
                    if (i9 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if ((i2 & 4) != 0) {
                        ii3VarColors = colors(kk0Var, (i3 >> 12) & 14);
                        i3 &= -897;
                    } else {
                        ii3VarColors = ii3Var2;
                    }
                    if (i4 != 0) {
                        i7 = i3;
                        cVar4 = cVar3;
                        z3 = true;
                    } else {
                        i7 = i3;
                        cVar4 = cVar3;
                        z3 = z2;
                    }
                }
                kk0Var.s();
                m1775x6ebfe39(uj3Var, cVar4, z3, ii3VarColors, (ne1) null, (oe1) null, rj3.b, rj3.c, kk0Var, (i7 & 14) | 14155776 | (i7 & 112) | ((i7 >> 3) & 896) | ((i7 << 3) & 7168) | ((i7 << 12) & 234881024), 48);
                z4 = z3;
                cVar5 = cVar4;
            } else {
                kk0Var.X();
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if ((i2 & 4) != 0) {
                        ii3VarColors = colors(kk0Var, (i3 >> 12) & 14);
                        i3 &= -897;
                    } else {
                        ii3VarColors = ii3Var2;
                    }
                    if (i4 != 0) {
                        i7 = i3;
                        cVar4 = cVar3;
                        z3 = true;
                    } else {
                        i7 = i3;
                        cVar4 = cVar3;
                        z3 = z2;
                    }
                } else {
                    if (i9 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if ((i2 & 4) != 0) {
                        ii3VarColors = colors(kk0Var, (i3 >> 12) & 14);
                        i3 &= -897;
                    } else {
                        ii3VarColors = ii3Var2;
                    }
                    if (i4 != 0) {
                        i7 = i3;
                        cVar4 = cVar3;
                        z3 = true;
                    } else {
                        i7 = i3;
                        cVar4 = cVar3;
                        z3 = z2;
                    }
                }
                kk0Var.s();
                m1775x6ebfe39(uj3Var, cVar4, z3, ii3VarColors, (ne1) null, (oe1) null, rj3.b, rj3.c, kk0Var, (i7 & 14) | 14155776 | (i7 & 112) | ((i7 >> 3) & 896) | ((i7 << 3) & 7168) | ((i7 << 12) & 234881024), 48);
                z4 = z3;
                cVar5 = cVar4;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new lj2(this, uj3Var, cVar5, ii3VarColors, z4, i, i2, 1));
            }
        }
        i3 |= 48;
        cVar2 = cVar;
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                ii3Var2 = ii3Var;
                if (kk0Var.h(ii3Var2)) {
                    i8 = FontInfo.NUMBER_OF_CHAR_CODES;
                }
                i3 |= i8;
            } else {
                ii3Var2 = ii3Var;
            }
            i8 = Uuid.SIZE_BITS;
            i3 |= i8;
        } else {
            ii3Var2 = ii3Var;
        }
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                z2 = z;
                if (kk0Var.i(z2)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            if ((i2 & 16) != 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                if (kk0Var.h(this)) {
                    i6 = 16384;
                } else {
                    i6 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                }
                i3 |= i6;
            }
            if ((i3 & 9363) == 9362) {
                kk0Var.X();
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if ((i2 & 4) != 0) {
                        ii3VarColors = colors(kk0Var, (i3 >> 12) & 14);
                        i3 &= -897;
                    } else {
                        ii3VarColors = ii3Var2;
                    }
                    if (i4 != 0) {
                        i7 = i3;
                        cVar4 = cVar3;
                        z3 = true;
                    } else {
                        i7 = i3;
                        cVar4 = cVar3;
                        z3 = z2;
                    }
                } else {
                    if (i9 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if ((i2 & 4) != 0) {
                        ii3VarColors = colors(kk0Var, (i3 >> 12) & 14);
                        i3 &= -897;
                    } else {
                        ii3VarColors = ii3Var2;
                    }
                    if (i4 != 0) {
                        i7 = i3;
                        cVar4 = cVar3;
                        z3 = true;
                    } else {
                        i7 = i3;
                        cVar4 = cVar3;
                        z3 = z2;
                    }
                }
                kk0Var.s();
                m1775x6ebfe39(uj3Var, cVar4, z3, ii3VarColors, (ne1) null, (oe1) null, rj3.b, rj3.c, kk0Var, (i7 & 14) | 14155776 | (i7 & 112) | ((i7 >> 3) & 896) | ((i7 << 3) & 7168) | ((i7 << 12) & 234881024), 48);
                z4 = z3;
                cVar5 = cVar4;
            } else {
                kk0Var.X();
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if ((i2 & 4) != 0) {
                        ii3VarColors = colors(kk0Var, (i3 >> 12) & 14);
                        i3 &= -897;
                    } else {
                        ii3VarColors = ii3Var2;
                    }
                    if (i4 != 0) {
                        i7 = i3;
                        cVar4 = cVar3;
                        z3 = true;
                    } else {
                        i7 = i3;
                        cVar4 = cVar3;
                        z3 = z2;
                    }
                } else {
                    if (i9 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if ((i2 & 4) != 0) {
                        ii3VarColors = colors(kk0Var, (i3 >> 12) & 14);
                        i3 &= -897;
                    } else {
                        ii3VarColors = ii3Var2;
                    }
                    if (i4 != 0) {
                        i7 = i3;
                        cVar4 = cVar3;
                        z3 = true;
                    } else {
                        i7 = i3;
                        cVar4 = cVar3;
                        z3 = z2;
                    }
                }
                kk0Var.s();
                m1775x6ebfe39(uj3Var, cVar4, z3, ii3VarColors, (ne1) null, (oe1) null, rj3.b, rj3.c, kk0Var, (i7 & 14) | 14155776 | (i7 & 112) | ((i7 >> 3) & 896) | ((i7 << 3) & 7168) | ((i7 << 12) & 234881024), 48);
                z4 = z3;
                cVar5 = cVar4;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new lj2(this, uj3Var, cVar5, ii3VarColors, z4, i, i2, 1));
            }
        }
        i3 |= 3072;
        z2 = z;
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            if (kk0Var.h(this)) {
                i6 = 16384;
            } else {
                i6 = ConstantsKt.DEFAULT_BUFFER_SIZE;
            }
            i3 |= i6;
        }
        if ((i3 & 9363) == 9362) {
            kk0Var.X();
            if ((i & 1) != 0) {
                if (i9 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if ((i2 & 4) != 0) {
                    ii3VarColors = colors(kk0Var, (i3 >> 12) & 14);
                    i3 &= -897;
                } else {
                    ii3VarColors = ii3Var2;
                }
                if (i4 != 0) {
                    i7 = i3;
                    cVar4 = cVar3;
                    z3 = true;
                } else {
                    i7 = i3;
                    cVar4 = cVar3;
                    z3 = z2;
                }
            } else {
                if (i9 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if ((i2 & 4) != 0) {
                    ii3VarColors = colors(kk0Var, (i3 >> 12) & 14);
                    i3 &= -897;
                } else {
                    ii3VarColors = ii3Var2;
                }
                if (i4 != 0) {
                    i7 = i3;
                    cVar4 = cVar3;
                    z3 = true;
                } else {
                    i7 = i3;
                    cVar4 = cVar3;
                    z3 = z2;
                }
            }
            kk0Var.s();
            m1775x6ebfe39(uj3Var, cVar4, z3, ii3VarColors, (ne1) null, (oe1) null, rj3.b, rj3.c, kk0Var, (i7 & 14) | 14155776 | (i7 & 112) | ((i7 >> 3) & 896) | ((i7 << 3) & 7168) | ((i7 << 12) & 234881024), 48);
            z4 = z3;
            cVar5 = cVar4;
        } else {
            kk0Var.X();
            if ((i & 1) != 0) {
                if (i9 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if ((i2 & 4) != 0) {
                    ii3VarColors = colors(kk0Var, (i3 >> 12) & 14);
                    i3 &= -897;
                } else {
                    ii3VarColors = ii3Var2;
                }
                if (i4 != 0) {
                    i7 = i3;
                    cVar4 = cVar3;
                    z3 = true;
                } else {
                    i7 = i3;
                    cVar4 = cVar3;
                    z3 = z2;
                }
            } else {
                if (i9 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if ((i2 & 4) != 0) {
                    ii3VarColors = colors(kk0Var, (i3 >> 12) & 14);
                    i3 &= -897;
                } else {
                    ii3VarColors = ii3Var2;
                }
                if (i4 != 0) {
                    i7 = i3;
                    cVar4 = cVar3;
                    z3 = true;
                } else {
                    i7 = i3;
                    cVar4 = cVar3;
                    z3 = z2;
                }
            }
            kk0Var.s();
            m1775x6ebfe39(uj3Var, cVar4, z3, ii3VarColors, (ne1) null, (oe1) null, rj3.b, rj3.c, kk0Var, (i7 & 14) | 14155776 | (i7 & 112) | ((i7 >> 3) & 896) | ((i7 << 3) & 7168) | ((i7 << 12) & 234881024), 48);
            z4 = z3;
            cVar5 = cVar4;
        }
        w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new lj2(this, uj3Var, cVar5, ii3VarColors, z4, i, i2, 1));
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0126  */
    /* JADX WARN: Code duplicated, block: B:105:0x0134  */
    /* JADX WARN: Code duplicated, block: B:115:0x0155 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:116:0x0157  */
    /* JADX WARN: Code duplicated, block: B:117:0x015a  */
    /* JADX WARN: Code duplicated, block: B:119:0x015d  */
    /* JADX WARN: Code duplicated, block: B:122:0x0162  */
    /* JADX WARN: Code duplicated, block: B:123:0x016d  */
    /* JADX WARN: Code duplicated, block: B:126:0x0172  */
    /* JADX WARN: Code duplicated, block: B:128:0x017a  */
    /* JADX WARN: Code duplicated, block: B:130:0x0180  */
    /* JADX WARN: Code duplicated, block: B:136:0x018d  */
    /* JADX WARN: Code duplicated, block: B:137:0x018f  */
    /* JADX WARN: Code duplicated, block: B:140:0x0197  */
    /* JADX WARN: Code duplicated, block: B:142:0x019d  */
    /* JADX WARN: Code duplicated, block: B:144:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:146:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:147:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:149:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:151:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:153:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:156:0x0201  */
    /* JADX WARN: Code duplicated, block: B:157:0x0204  */
    /* JADX WARN: Code duplicated, block: B:160:0x022a  */
    /* JADX WARN: Code duplicated, block: B:161:0x022c  */
    /* JADX WARN: Code duplicated, block: B:164:0x0235  */
    /* JADX WARN: Code duplicated, block: B:165:0x0237  */
    /* JADX WARN: Code duplicated, block: B:168:0x0243  */
    /* JADX WARN: Code duplicated, block: B:171:0x024c  */
    /* JADX WARN: Code duplicated, block: B:174:0x0252 A[PHI: r1
  0x0252: PHI (r1v14 ne1) = (r1v9 ne1), (r1v15 ne1) binds: [B:173:0x0250, B:169:0x0249] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:175:0x0254  */
    /* JADX WARN: Code duplicated, block: B:178:0x025d  */
    /* JADX WARN: Code duplicated, block: B:179:0x0260  */
    /* JADX WARN: Code duplicated, block: B:182:0x026a  */
    /* JADX WARN: Code duplicated, block: B:186:0x027b  */
    /* JADX WARN: Code duplicated, block: B:190:0x02af  */
    /* JADX WARN: Code duplicated, block: B:192:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    /* JADX WARN: Code duplicated, block: B:28:0x004d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:32:0x0059  */
    /* JADX WARN: Code duplicated, block: B:33:0x005c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX WARN: Code duplicated, block: B:39:0x0067  */
    /* JADX WARN: Code duplicated, block: B:41:0x006f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0072  */
    /* JADX WARN: Code duplicated, block: B:45:0x0078  */
    /* JADX WARN: Code duplicated, block: B:48:0x007e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0082  */
    /* JADX WARN: Code duplicated, block: B:52:0x008a  */
    /* JADX WARN: Code duplicated, block: B:53:0x008d  */
    /* JADX WARN: Code duplicated, block: B:56:0x0093  */
    /* JADX WARN: Code duplicated, block: B:59:0x009b  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:65:0x00af  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:70:0x00be  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:80:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:85:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:92:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:94:0x0102  */
    /* JADX WARN: Code duplicated, block: B:95:0x0105  */
    /* JADX WARN: Code duplicated, block: B:99:0x0111  */
    /* JADX INFO: renamed from: Track-4EFweAY, reason: not valid java name */
    public final void m1774x6ebfe39(n23 n23Var, c cVar, boolean z, ii3 ii3Var, ne1 ne1Var, oe1 oe1Var, float f, float f2, ck0 ck0Var, int i, int i2) {
        int i3;
        c cVar2;
        int i4;
        boolean z2;
        int i5;
        ii3 ii3Var2;
        ne1 ne1Var2;
        int i6;
        oe1 oe1Var2;
        int i7;
        int i8;
        float f3;
        int i9;
        int i10;
        int i11;
        int i12;
        c cVar3;
        ii3 ii3VarColors;
        ne1 ne1Var3;
        oe1 oe1Var3;
        float f4;
        boolean z3;
        boolean z4;
        boolean z5;
        Object objP;
        long jB;
        float f5;
        long jB2;
        float f6;
        ne1 ne1Var4;
        long jA;
        long jA2;
        float f7;
        boolean z6;
        boolean z7;
        ne1 ne1Var5;
        boolean z8;
        boolean z9;
        boolean z10;
        Object objP2;
        float f8;
        kk0 kk0Var;
        float f9;
        ne1 ne1Var6;
        ii3 ii3Var3;
        float f10;
        float f11;
        ne1 ne1Var7;
        oe1 oe1Var4;
        c cVar4;
        boolean z11;
        w33 w33VarV;
        int i13;
        kk0 kk0Var2 = (kk0) ck0Var;
        kk0Var2.c0(-541824132);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (kk0Var2.j(n23Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i14 = i2 & 2;
        if (i14 == 0) {
            if ((i & 48) == 0) {
                cVar2 = cVar;
                i3 |= kk0Var2.h(cVar2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    z2 = z;
                    if (kk0Var2.i(z2)) {
                        i5 = FontInfo.NUMBER_OF_CHAR_CODES;
                    } else {
                        i5 = Uuid.SIZE_BITS;
                    }
                    i3 |= i5;
                }
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        ii3Var2 = ii3Var;
                        int i15 = kk0Var2.h(ii3Var2) ? 2048 : 1024;
                        i3 |= i15;
                    } else {
                        ii3Var2 = ii3Var;
                    }
                    i3 |= i15;
                } else {
                    ii3Var2 = ii3Var;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        ne1Var2 = ne1Var;
                        if (kk0Var2.j(ne1Var2)) {
                            i13 = 16384;
                        }
                        i3 |= i13;
                    } else {
                        ne1Var2 = ne1Var;
                    }
                    i13 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                    i3 |= i13;
                } else {
                    ne1Var2 = ne1Var;
                }
                i6 = i2 & 32;
                if (i6 != 0) {
                    i3 |= 196608;
                    oe1Var2 = oe1Var;
                } else {
                    oe1Var2 = oe1Var;
                    if ((i & 196608) == 0) {
                        if (kk0Var2.j(oe1Var2)) {
                            i7 = 131072;
                        } else {
                            i7 = 65536;
                        }
                        i3 |= i7;
                    }
                }
                i8 = i2 & 64;
                if (i8 != 0) {
                    i3 |= 1572864;
                    f3 = f;
                } else {
                    f3 = f;
                    if ((i & 1572864) == 0) {
                        if (kk0Var2.e(f3)) {
                            i9 = 1048576;
                        } else {
                            i9 = 524288;
                        }
                        i3 |= i9;
                    }
                }
                i10 = i2 & Uuid.SIZE_BITS;
                if (i10 != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    if (kk0Var2.e(f2)) {
                        i11 = 8388608;
                    } else {
                        i11 = 4194304;
                    }
                    i3 |= i11;
                }
                if ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                    i3 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    if (kk0Var2.h(this)) {
                        i12 = 67108864;
                    } else {
                        i12 = 33554432;
                    }
                    i3 |= i12;
                }
                if ((38347923 & i3) == 38347922 || !kk0Var2.F()) {
                    kk0Var2.X();
                    if ((i & 1) != 0 || kk0Var2.D()) {
                        if (i14 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 8) != 0) {
                            ii3VarColors = colors(kk0Var2, (i3 >> 24) & 14);
                            i3 &= -7169;
                        } else {
                            ii3VarColors = ii3Var2;
                        }
                        if ((i2 & 16) != 0) {
                            boolean z12 = (((i3 & 7168) ^ 3072) <= 2048 && kk0Var2.h(ii3VarColors)) || (i3 & 3072) == 2048;
                            if ((i3 & 896) == 256) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            z5 = z12 | z4;
                            objP = kk0Var2.P();
                            if (z5 || objP == Composer$Companion.getEmpty()) {
                                objP = new mi3(ii3VarColors, z2, 1);
                                kk0Var2.l0(objP);
                            }
                            ne1Var3 = (ne1) objP;
                            i3 &= -57345;
                        } else {
                            ne1Var3 = ne1Var2;
                        }
                        if (i6 != 0) {
                            oe1Var3 = u1.l;
                        } else {
                            oe1Var3 = oe1Var2;
                        }
                        if (i8 != 0) {
                            f3 = rj3.b;
                        }
                        if (i10 != 0) {
                            f4 = rj3.c;
                        } else {
                            f4 = f2;
                        }
                        z3 = z2;
                    } else {
                        kk0Var2.V();
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        i3 = i3;
                        cVar3 = cVar2;
                        f3 = f3;
                        z3 = z2;
                        ii3VarColors = ii3Var2;
                        oe1Var3 = oe1Var2;
                        ne1Var3 = ne1Var2;
                        f4 = f2;
                    }
                    kk0Var2.s();
                    jB = ii3VarColors.b(z3, false);
                    f5 = f3;
                    jB2 = ii3VarColors.b(z3, true);
                    f6 = f4;
                    ne1Var4 = ne1Var3;
                    jA = ii3VarColors.a(z3, false);
                    jA2 = ii3VarColors.a(z3, true);
                    c cVarThen = cVar3.then(d.a);
                    float f12 = rj3.b;
                    c cVar5 = cVar3;
                    c cVarD = d.d(cVarThen, 16.0f);
                    boolean z13 = z3;
                    if (kk0Var2.l(CompositionLocalsKt.getLocalLayoutDirection()) == dx1.d) {
                        f7 = 180.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    c cVarO = y64.O(cVarD, f7);
                    boolean zJ = kk0Var2.j(n23Var) | kk0Var2.g(jB) | kk0Var2.g(jB2) | kk0Var2.g(jA) | kk0Var2.g(jA2);
                    if ((3670016 & i3) == 1048576) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    boolean z14 = z6 | zJ;
                    if ((29360128 & i3) == 8388608) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    boolean z15 = z14 | z7;
                    if (((57344 & i3) ^ 24576) > 16384) {
                        ne1Var5 = ne1Var4;
                        if (kk0Var2.h(ne1Var5)) {
                            z8 = true;
                        }
                        boolean z16 = z15 | z8;
                        if ((458752 & i3) == 131072) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        z10 = z16 | z9;
                        objP2 = kk0Var2.P();
                        if (!z10 || objP2 == Composer$Companion.getEmpty()) {
                            f8 = f5;
                            kk0Var = kk0Var2;
                            f9 = f6;
                            ne1Var6 = ne1Var5;
                            ki3 ki3Var = new ki3(n23Var, jB, jB2, jA, jA2, f8, f9, ne1Var6, oe1Var3, 0);
                            kk0Var.l0(ki3Var);
                            objP2 = ki3Var;
                        } else {
                            f8 = f5;
                            f9 = f6;
                            ne1Var6 = ne1Var5;
                            kk0Var = kk0Var2;
                        }
                        c10.Canvas(cVarO, (le1) objP2, kk0Var, 0);
                        ii3Var3 = ii3VarColors;
                        f10 = f8;
                        f11 = f9;
                        ne1Var7 = ne1Var6;
                        oe1Var4 = oe1Var3;
                        cVar4 = cVar5;
                        z11 = z13;
                    } else {
                        ne1Var5 = ne1Var4;
                    }
                    if ((i3 & 24576) == 16384) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    boolean z17 = z15 | z8;
                    if ((458752 & i3) == 131072) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    z10 = z17 | z9;
                    objP2 = kk0Var2.P();
                    if (z10) {
                        f8 = f5;
                        kk0Var = kk0Var2;
                        f9 = f6;
                        ne1Var6 = ne1Var5;
                        ki3 ki3Var2 = new ki3(n23Var, jB, jB2, jA, jA2, f8, f9, ne1Var6, oe1Var3, 0);
                        kk0Var.l0(ki3Var2);
                        objP2 = ki3Var2;
                    } else {
                        f8 = f5;
                        kk0Var = kk0Var2;
                        f9 = f6;
                        ne1Var6 = ne1Var5;
                        ki3 ki3Var3 = new ki3(n23Var, jB, jB2, jA, jA2, f8, f9, ne1Var6, oe1Var3, 0);
                        kk0Var.l0(ki3Var3);
                        objP2 = ki3Var3;
                    }
                    c10.Canvas(cVarO, (le1) objP2, kk0Var, 0);
                    ii3Var3 = ii3VarColors;
                    f10 = f8;
                    f11 = f9;
                    ne1Var7 = ne1Var6;
                    oe1Var4 = oe1Var3;
                    cVar4 = cVar5;
                    z11 = z13;
                } else {
                    kk0Var2.V();
                    kk0Var = kk0Var2;
                    cVar4 = cVar2;
                    f10 = f3;
                    z11 = z2;
                    ii3Var3 = ii3Var2;
                    ne1Var7 = ne1Var2;
                    oe1Var4 = oe1Var2;
                    f11 = f2;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new li3(this, n23Var, cVar4, z11, ii3Var3, ne1Var7, oe1Var4, f10, f11, i, i2, 0));
                }
            }
            i3 |= 384;
            z2 = z;
            if ((i & 3072) == 0) {
                if ((i2 & 8) == 0) {
                    ii3Var2 = ii3Var;
                    if (kk0Var2.h(ii3Var2)) {
                    }
                    i3 |= i15;
                } else {
                    ii3Var2 = ii3Var;
                }
                i3 |= i15;
            } else {
                ii3Var2 = ii3Var;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    ne1Var2 = ne1Var;
                    if (kk0Var2.j(ne1Var2)) {
                        i13 = 16384;
                    }
                    i3 |= i13;
                } else {
                    ne1Var2 = ne1Var;
                }
                i13 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                i3 |= i13;
            } else {
                ne1Var2 = ne1Var;
            }
            i6 = i2 & 32;
            if (i6 != 0) {
                i3 |= 196608;
                oe1Var2 = oe1Var;
            } else {
                oe1Var2 = oe1Var;
                if ((i & 196608) == 0) {
                    if (kk0Var2.j(oe1Var2)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
            }
            i8 = i2 & 64;
            if (i8 != 0) {
                i3 |= 1572864;
                f3 = f;
            } else {
                f3 = f;
                if ((i & 1572864) == 0) {
                    if (kk0Var2.e(f3)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i3 |= i9;
                }
            }
            i10 = i2 & Uuid.SIZE_BITS;
            if (i10 != 0) {
                i3 |= 12582912;
            } else if ((i & 12582912) == 0) {
                if (kk0Var2.e(f2)) {
                    i11 = 8388608;
                } else {
                    i11 = 4194304;
                }
                i3 |= i11;
            }
            if ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                i3 |= 100663296;
            } else if ((i & 100663296) == 0) {
                if (kk0Var2.h(this)) {
                    i12 = 67108864;
                } else {
                    i12 = 33554432;
                }
                i3 |= i12;
            }
            if ((38347923 & i3) == 38347922) {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i14 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 8) != 0) {
                        ii3VarColors = colors(kk0Var2, (i3 >> 24) & 14);
                        i3 &= -7169;
                    } else {
                        ii3VarColors = ii3Var2;
                    }
                    if ((i2 & 16) != 0) {
                        if (((i3 & 7168) ^ 3072) <= 2048) {
                        }
                        if ((i3 & 896) == 256) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        z5 = z12 | z4;
                        objP = kk0Var2.P();
                        if (z5) {
                            objP = new mi3(ii3VarColors, z2, 1);
                            kk0Var2.l0(objP);
                        } else {
                            objP = new mi3(ii3VarColors, z2, 1);
                            kk0Var2.l0(objP);
                        }
                        ne1Var3 = (ne1) objP;
                        i3 &= -57345;
                    } else {
                        ne1Var3 = ne1Var2;
                    }
                    if (i6 != 0) {
                        oe1Var3 = u1.l;
                    } else {
                        oe1Var3 = oe1Var2;
                    }
                    if (i8 != 0) {
                        f3 = rj3.b;
                    }
                    if (i10 != 0) {
                        f4 = rj3.c;
                    } else {
                        f4 = f2;
                    }
                    z3 = z2;
                } else {
                    if (i14 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 8) != 0) {
                        ii3VarColors = colors(kk0Var2, (i3 >> 24) & 14);
                        i3 &= -7169;
                    } else {
                        ii3VarColors = ii3Var2;
                    }
                    if ((i2 & 16) != 0) {
                        if (((i3 & 7168) ^ 3072) <= 2048) {
                        }
                        if ((i3 & 896) == 256) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        z5 = z12 | z4;
                        objP = kk0Var2.P();
                        if (z5) {
                            objP = new mi3(ii3VarColors, z2, 1);
                            kk0Var2.l0(objP);
                        } else {
                            objP = new mi3(ii3VarColors, z2, 1);
                            kk0Var2.l0(objP);
                        }
                        ne1Var3 = (ne1) objP;
                        i3 &= -57345;
                    } else {
                        ne1Var3 = ne1Var2;
                    }
                    if (i6 != 0) {
                        oe1Var3 = u1.l;
                    } else {
                        oe1Var3 = oe1Var2;
                    }
                    if (i8 != 0) {
                        f3 = rj3.b;
                    }
                    if (i10 != 0) {
                        f4 = rj3.c;
                    } else {
                        f4 = f2;
                    }
                    z3 = z2;
                }
                kk0Var2.s();
                jB = ii3VarColors.b(z3, false);
                f5 = f3;
                jB2 = ii3VarColors.b(z3, true);
                f6 = f4;
                ne1Var4 = ne1Var3;
                jA = ii3VarColors.a(z3, false);
                jA2 = ii3VarColors.a(z3, true);
                c cVarThen2 = cVar3.then(d.a);
                float f13 = rj3.b;
                c cVar6 = cVar3;
                c cVarD2 = d.d(cVarThen2, 16.0f);
                boolean z18 = z3;
                if (kk0Var2.l(CompositionLocalsKt.getLocalLayoutDirection()) == dx1.d) {
                    f7 = 180.0f;
                } else {
                    f7 = 0.0f;
                }
                c cVarO2 = y64.O(cVarD2, f7);
                boolean zJ2 = kk0Var2.j(n23Var) | kk0Var2.g(jB) | kk0Var2.g(jB2) | kk0Var2.g(jA) | kk0Var2.g(jA2);
                if ((3670016 & i3) == 1048576) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                boolean z19 = z6 | zJ2;
                if ((29360128 & i3) == 8388608) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                boolean z110 = z19 | z7;
                if (((57344 & i3) ^ 24576) > 16384) {
                    ne1Var5 = ne1Var4;
                    if (kk0Var2.h(ne1Var5)) {
                        z8 = true;
                    }
                    boolean z111 = z110 | z8;
                    if ((458752 & i3) == 131072) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    z10 = z111 | z9;
                    objP2 = kk0Var2.P();
                    if (z10) {
                        f8 = f5;
                        kk0Var = kk0Var2;
                        f9 = f6;
                        ne1Var6 = ne1Var5;
                        ki3 ki3Var4 = new ki3(n23Var, jB, jB2, jA, jA2, f8, f9, ne1Var6, oe1Var3, 0);
                        kk0Var.l0(ki3Var4);
                        objP2 = ki3Var4;
                    } else {
                        f8 = f5;
                        kk0Var = kk0Var2;
                        f9 = f6;
                        ne1Var6 = ne1Var5;
                        ki3 ki3Var5 = new ki3(n23Var, jB, jB2, jA, jA2, f8, f9, ne1Var6, oe1Var3, 0);
                        kk0Var.l0(ki3Var5);
                        objP2 = ki3Var5;
                    }
                    c10.Canvas(cVarO2, (le1) objP2, kk0Var, 0);
                    ii3Var3 = ii3VarColors;
                    f10 = f8;
                    f11 = f9;
                    ne1Var7 = ne1Var6;
                    oe1Var4 = oe1Var3;
                    cVar4 = cVar6;
                    z11 = z18;
                } else {
                    ne1Var5 = ne1Var4;
                }
                if ((i3 & 24576) == 16384) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                boolean z112 = z110 | z8;
                if ((458752 & i3) == 131072) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                z10 = z112 | z9;
                objP2 = kk0Var2.P();
                if (z10) {
                    f8 = f5;
                    kk0Var = kk0Var2;
                    f9 = f6;
                    ne1Var6 = ne1Var5;
                    ki3 ki3Var6 = new ki3(n23Var, jB, jB2, jA, jA2, f8, f9, ne1Var6, oe1Var3, 0);
                    kk0Var.l0(ki3Var6);
                    objP2 = ki3Var6;
                } else {
                    f8 = f5;
                    kk0Var = kk0Var2;
                    f9 = f6;
                    ne1Var6 = ne1Var5;
                    ki3 ki3Var7 = new ki3(n23Var, jB, jB2, jA, jA2, f8, f9, ne1Var6, oe1Var3, 0);
                    kk0Var.l0(ki3Var7);
                    objP2 = ki3Var7;
                }
                c10.Canvas(cVarO2, (le1) objP2, kk0Var, 0);
                ii3Var3 = ii3VarColors;
                f10 = f8;
                f11 = f9;
                ne1Var7 = ne1Var6;
                oe1Var4 = oe1Var3;
                cVar4 = cVar6;
                z11 = z18;
            } else {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i14 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 8) != 0) {
                        ii3VarColors = colors(kk0Var2, (i3 >> 24) & 14);
                        i3 &= -7169;
                    } else {
                        ii3VarColors = ii3Var2;
                    }
                    if ((i2 & 16) != 0) {
                        if (((i3 & 7168) ^ 3072) <= 2048) {
                        }
                        if ((i3 & 896) == 256) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        z5 = z12 | z4;
                        objP = kk0Var2.P();
                        if (z5) {
                            objP = new mi3(ii3VarColors, z2, 1);
                            kk0Var2.l0(objP);
                        } else {
                            objP = new mi3(ii3VarColors, z2, 1);
                            kk0Var2.l0(objP);
                        }
                        ne1Var3 = (ne1) objP;
                        i3 &= -57345;
                    } else {
                        ne1Var3 = ne1Var2;
                    }
                    if (i6 != 0) {
                        oe1Var3 = u1.l;
                    } else {
                        oe1Var3 = oe1Var2;
                    }
                    if (i8 != 0) {
                        f3 = rj3.b;
                    }
                    if (i10 != 0) {
                        f4 = rj3.c;
                    } else {
                        f4 = f2;
                    }
                    z3 = z2;
                } else {
                    if (i14 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 8) != 0) {
                        ii3VarColors = colors(kk0Var2, (i3 >> 24) & 14);
                        i3 &= -7169;
                    } else {
                        ii3VarColors = ii3Var2;
                    }
                    if ((i2 & 16) != 0) {
                        if (((i3 & 7168) ^ 3072) <= 2048) {
                        }
                        if ((i3 & 896) == 256) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        z5 = z12 | z4;
                        objP = kk0Var2.P();
                        if (z5) {
                            objP = new mi3(ii3VarColors, z2, 1);
                            kk0Var2.l0(objP);
                        } else {
                            objP = new mi3(ii3VarColors, z2, 1);
                            kk0Var2.l0(objP);
                        }
                        ne1Var3 = (ne1) objP;
                        i3 &= -57345;
                    } else {
                        ne1Var3 = ne1Var2;
                    }
                    if (i6 != 0) {
                        oe1Var3 = u1.l;
                    } else {
                        oe1Var3 = oe1Var2;
                    }
                    if (i8 != 0) {
                        f3 = rj3.b;
                    }
                    if (i10 != 0) {
                        f4 = rj3.c;
                    } else {
                        f4 = f2;
                    }
                    z3 = z2;
                }
                kk0Var2.s();
                jB = ii3VarColors.b(z3, false);
                f5 = f3;
                jB2 = ii3VarColors.b(z3, true);
                f6 = f4;
                ne1Var4 = ne1Var3;
                jA = ii3VarColors.a(z3, false);
                jA2 = ii3VarColors.a(z3, true);
                c cVarThen3 = cVar3.then(d.a);
                float f14 = rj3.b;
                c cVar7 = cVar3;
                c cVarD3 = d.d(cVarThen3, 16.0f);
                boolean z113 = z3;
                if (kk0Var2.l(CompositionLocalsKt.getLocalLayoutDirection()) == dx1.d) {
                    f7 = 180.0f;
                } else {
                    f7 = 0.0f;
                }
                c cVarO3 = y64.O(cVarD3, f7);
                boolean zJ3 = kk0Var2.j(n23Var) | kk0Var2.g(jB) | kk0Var2.g(jB2) | kk0Var2.g(jA) | kk0Var2.g(jA2);
                if ((3670016 & i3) == 1048576) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                boolean z114 = z6 | zJ3;
                if ((29360128 & i3) == 8388608) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                boolean z115 = z114 | z7;
                if (((57344 & i3) ^ 24576) > 16384) {
                    ne1Var5 = ne1Var4;
                    if (kk0Var2.h(ne1Var5)) {
                        z8 = true;
                    }
                    boolean z116 = z115 | z8;
                    if ((458752 & i3) == 131072) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    z10 = z116 | z9;
                    objP2 = kk0Var2.P();
                    if (z10) {
                        f8 = f5;
                        kk0Var = kk0Var2;
                        f9 = f6;
                        ne1Var6 = ne1Var5;
                        ki3 ki3Var8 = new ki3(n23Var, jB, jB2, jA, jA2, f8, f9, ne1Var6, oe1Var3, 0);
                        kk0Var.l0(ki3Var8);
                        objP2 = ki3Var8;
                    } else {
                        f8 = f5;
                        kk0Var = kk0Var2;
                        f9 = f6;
                        ne1Var6 = ne1Var5;
                        ki3 ki3Var9 = new ki3(n23Var, jB, jB2, jA, jA2, f8, f9, ne1Var6, oe1Var3, 0);
                        kk0Var.l0(ki3Var9);
                        objP2 = ki3Var9;
                    }
                    c10.Canvas(cVarO3, (le1) objP2, kk0Var, 0);
                    ii3Var3 = ii3VarColors;
                    f10 = f8;
                    f11 = f9;
                    ne1Var7 = ne1Var6;
                    oe1Var4 = oe1Var3;
                    cVar4 = cVar7;
                    z11 = z113;
                } else {
                    ne1Var5 = ne1Var4;
                }
                if ((i3 & 24576) == 16384) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                boolean z117 = z115 | z8;
                if ((458752 & i3) == 131072) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                z10 = z117 | z9;
                objP2 = kk0Var2.P();
                if (z10) {
                    f8 = f5;
                    kk0Var = kk0Var2;
                    f9 = f6;
                    ne1Var6 = ne1Var5;
                    ki3 ki3Var10 = new ki3(n23Var, jB, jB2, jA, jA2, f8, f9, ne1Var6, oe1Var3, 0);
                    kk0Var.l0(ki3Var10);
                    objP2 = ki3Var10;
                } else {
                    f8 = f5;
                    kk0Var = kk0Var2;
                    f9 = f6;
                    ne1Var6 = ne1Var5;
                    ki3 ki3Var11 = new ki3(n23Var, jB, jB2, jA, jA2, f8, f9, ne1Var6, oe1Var3, 0);
                    kk0Var.l0(ki3Var11);
                    objP2 = ki3Var11;
                }
                c10.Canvas(cVarO3, (le1) objP2, kk0Var, 0);
                ii3Var3 = ii3VarColors;
                f10 = f8;
                f11 = f9;
                ne1Var7 = ne1Var6;
                oe1Var4 = oe1Var3;
                cVar4 = cVar7;
                z11 = z113;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new li3(this, n23Var, cVar4, z11, ii3Var3, ne1Var7, oe1Var4, f10, f11, i, i2, 0));
            }
        }
        i3 |= 48;
        cVar2 = cVar;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                z2 = z;
                if (kk0Var2.i(z2)) {
                    i5 = FontInfo.NUMBER_OF_CHAR_CODES;
                } else {
                    i5 = Uuid.SIZE_BITS;
                }
                i3 |= i5;
            }
            if ((i & 3072) == 0) {
                if ((i2 & 8) == 0) {
                    ii3Var2 = ii3Var;
                    if (kk0Var2.h(ii3Var2)) {
                    }
                    i3 |= i15;
                } else {
                    ii3Var2 = ii3Var;
                }
                i3 |= i15;
            } else {
                ii3Var2 = ii3Var;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    ne1Var2 = ne1Var;
                    if (kk0Var2.j(ne1Var2)) {
                        i13 = 16384;
                    }
                    i3 |= i13;
                } else {
                    ne1Var2 = ne1Var;
                }
                i13 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                i3 |= i13;
            } else {
                ne1Var2 = ne1Var;
            }
            i6 = i2 & 32;
            if (i6 != 0) {
                i3 |= 196608;
                oe1Var2 = oe1Var;
            } else {
                oe1Var2 = oe1Var;
                if ((i & 196608) == 0) {
                    if (kk0Var2.j(oe1Var2)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
            }
            i8 = i2 & 64;
            if (i8 != 0) {
                i3 |= 1572864;
                f3 = f;
            } else {
                f3 = f;
                if ((i & 1572864) == 0) {
                    if (kk0Var2.e(f3)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i3 |= i9;
                }
            }
            i10 = i2 & Uuid.SIZE_BITS;
            if (i10 != 0) {
                i3 |= 12582912;
            } else if ((i & 12582912) == 0) {
                if (kk0Var2.e(f2)) {
                    i11 = 8388608;
                } else {
                    i11 = 4194304;
                }
                i3 |= i11;
            }
            if ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                i3 |= 100663296;
            } else if ((i & 100663296) == 0) {
                if (kk0Var2.h(this)) {
                    i12 = 67108864;
                } else {
                    i12 = 33554432;
                }
                i3 |= i12;
            }
            if ((38347923 & i3) == 38347922) {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i14 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 8) != 0) {
                        ii3VarColors = colors(kk0Var2, (i3 >> 24) & 14);
                        i3 &= -7169;
                    } else {
                        ii3VarColors = ii3Var2;
                    }
                    if ((i2 & 16) != 0) {
                        if (((i3 & 7168) ^ 3072) <= 2048) {
                        }
                        if ((i3 & 896) == 256) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        z5 = z12 | z4;
                        objP = kk0Var2.P();
                        if (z5) {
                            objP = new mi3(ii3VarColors, z2, 1);
                            kk0Var2.l0(objP);
                        } else {
                            objP = new mi3(ii3VarColors, z2, 1);
                            kk0Var2.l0(objP);
                        }
                        ne1Var3 = (ne1) objP;
                        i3 &= -57345;
                    } else {
                        ne1Var3 = ne1Var2;
                    }
                    if (i6 != 0) {
                        oe1Var3 = u1.l;
                    } else {
                        oe1Var3 = oe1Var2;
                    }
                    if (i8 != 0) {
                        f3 = rj3.b;
                    }
                    if (i10 != 0) {
                        f4 = rj3.c;
                    } else {
                        f4 = f2;
                    }
                    z3 = z2;
                } else {
                    if (i14 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 8) != 0) {
                        ii3VarColors = colors(kk0Var2, (i3 >> 24) & 14);
                        i3 &= -7169;
                    } else {
                        ii3VarColors = ii3Var2;
                    }
                    if ((i2 & 16) != 0) {
                        if (((i3 & 7168) ^ 3072) <= 2048) {
                        }
                        if ((i3 & 896) == 256) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        z5 = z12 | z4;
                        objP = kk0Var2.P();
                        if (z5) {
                            objP = new mi3(ii3VarColors, z2, 1);
                            kk0Var2.l0(objP);
                        } else {
                            objP = new mi3(ii3VarColors, z2, 1);
                            kk0Var2.l0(objP);
                        }
                        ne1Var3 = (ne1) objP;
                        i3 &= -57345;
                    } else {
                        ne1Var3 = ne1Var2;
                    }
                    if (i6 != 0) {
                        oe1Var3 = u1.l;
                    } else {
                        oe1Var3 = oe1Var2;
                    }
                    if (i8 != 0) {
                        f3 = rj3.b;
                    }
                    if (i10 != 0) {
                        f4 = rj3.c;
                    } else {
                        f4 = f2;
                    }
                    z3 = z2;
                }
                kk0Var2.s();
                jB = ii3VarColors.b(z3, false);
                f5 = f3;
                jB2 = ii3VarColors.b(z3, true);
                f6 = f4;
                ne1Var4 = ne1Var3;
                jA = ii3VarColors.a(z3, false);
                jA2 = ii3VarColors.a(z3, true);
                c cVarThen4 = cVar3.then(d.a);
                float f15 = rj3.b;
                c cVar8 = cVar3;
                c cVarD4 = d.d(cVarThen4, 16.0f);
                boolean z118 = z3;
                if (kk0Var2.l(CompositionLocalsKt.getLocalLayoutDirection()) == dx1.d) {
                    f7 = 180.0f;
                } else {
                    f7 = 0.0f;
                }
                c cVarO4 = y64.O(cVarD4, f7);
                boolean zJ4 = kk0Var2.j(n23Var) | kk0Var2.g(jB) | kk0Var2.g(jB2) | kk0Var2.g(jA) | kk0Var2.g(jA2);
                if ((3670016 & i3) == 1048576) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                boolean z119 = z6 | zJ4;
                if ((29360128 & i3) == 8388608) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                boolean z1110 = z119 | z7;
                if (((57344 & i3) ^ 24576) > 16384) {
                    ne1Var5 = ne1Var4;
                    if (kk0Var2.h(ne1Var5)) {
                        z8 = true;
                    }
                    boolean z1111 = z1110 | z8;
                    if ((458752 & i3) == 131072) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    z10 = z1111 | z9;
                    objP2 = kk0Var2.P();
                    if (z10) {
                        f8 = f5;
                        kk0Var = kk0Var2;
                        f9 = f6;
                        ne1Var6 = ne1Var5;
                        ki3 ki3Var12 = new ki3(n23Var, jB, jB2, jA, jA2, f8, f9, ne1Var6, oe1Var3, 0);
                        kk0Var.l0(ki3Var12);
                        objP2 = ki3Var12;
                    } else {
                        f8 = f5;
                        kk0Var = kk0Var2;
                        f9 = f6;
                        ne1Var6 = ne1Var5;
                        ki3 ki3Var13 = new ki3(n23Var, jB, jB2, jA, jA2, f8, f9, ne1Var6, oe1Var3, 0);
                        kk0Var.l0(ki3Var13);
                        objP2 = ki3Var13;
                    }
                    c10.Canvas(cVarO4, (le1) objP2, kk0Var, 0);
                    ii3Var3 = ii3VarColors;
                    f10 = f8;
                    f11 = f9;
                    ne1Var7 = ne1Var6;
                    oe1Var4 = oe1Var3;
                    cVar4 = cVar8;
                    z11 = z118;
                } else {
                    ne1Var5 = ne1Var4;
                }
                if ((i3 & 24576) == 16384) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                boolean z1112 = z1110 | z8;
                if ((458752 & i3) == 131072) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                z10 = z1112 | z9;
                objP2 = kk0Var2.P();
                if (z10) {
                    f8 = f5;
                    kk0Var = kk0Var2;
                    f9 = f6;
                    ne1Var6 = ne1Var5;
                    ki3 ki3Var14 = new ki3(n23Var, jB, jB2, jA, jA2, f8, f9, ne1Var6, oe1Var3, 0);
                    kk0Var.l0(ki3Var14);
                    objP2 = ki3Var14;
                } else {
                    f8 = f5;
                    kk0Var = kk0Var2;
                    f9 = f6;
                    ne1Var6 = ne1Var5;
                    ki3 ki3Var15 = new ki3(n23Var, jB, jB2, jA, jA2, f8, f9, ne1Var6, oe1Var3, 0);
                    kk0Var.l0(ki3Var15);
                    objP2 = ki3Var15;
                }
                c10.Canvas(cVarO4, (le1) objP2, kk0Var, 0);
                ii3Var3 = ii3VarColors;
                f10 = f8;
                f11 = f9;
                ne1Var7 = ne1Var6;
                oe1Var4 = oe1Var3;
                cVar4 = cVar8;
                z11 = z118;
            } else {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i14 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 8) != 0) {
                        ii3VarColors = colors(kk0Var2, (i3 >> 24) & 14);
                        i3 &= -7169;
                    } else {
                        ii3VarColors = ii3Var2;
                    }
                    if ((i2 & 16) != 0) {
                        if (((i3 & 7168) ^ 3072) <= 2048) {
                        }
                        if ((i3 & 896) == 256) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        z5 = z12 | z4;
                        objP = kk0Var2.P();
                        if (z5) {
                            objP = new mi3(ii3VarColors, z2, 1);
                            kk0Var2.l0(objP);
                        } else {
                            objP = new mi3(ii3VarColors, z2, 1);
                            kk0Var2.l0(objP);
                        }
                        ne1Var3 = (ne1) objP;
                        i3 &= -57345;
                    } else {
                        ne1Var3 = ne1Var2;
                    }
                    if (i6 != 0) {
                        oe1Var3 = u1.l;
                    } else {
                        oe1Var3 = oe1Var2;
                    }
                    if (i8 != 0) {
                        f3 = rj3.b;
                    }
                    if (i10 != 0) {
                        f4 = rj3.c;
                    } else {
                        f4 = f2;
                    }
                    z3 = z2;
                } else {
                    if (i14 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 8) != 0) {
                        ii3VarColors = colors(kk0Var2, (i3 >> 24) & 14);
                        i3 &= -7169;
                    } else {
                        ii3VarColors = ii3Var2;
                    }
                    if ((i2 & 16) != 0) {
                        if (((i3 & 7168) ^ 3072) <= 2048) {
                        }
                        if ((i3 & 896) == 256) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        z5 = z12 | z4;
                        objP = kk0Var2.P();
                        if (z5) {
                            objP = new mi3(ii3VarColors, z2, 1);
                            kk0Var2.l0(objP);
                        } else {
                            objP = new mi3(ii3VarColors, z2, 1);
                            kk0Var2.l0(objP);
                        }
                        ne1Var3 = (ne1) objP;
                        i3 &= -57345;
                    } else {
                        ne1Var3 = ne1Var2;
                    }
                    if (i6 != 0) {
                        oe1Var3 = u1.l;
                    } else {
                        oe1Var3 = oe1Var2;
                    }
                    if (i8 != 0) {
                        f3 = rj3.b;
                    }
                    if (i10 != 0) {
                        f4 = rj3.c;
                    } else {
                        f4 = f2;
                    }
                    z3 = z2;
                }
                kk0Var2.s();
                jB = ii3VarColors.b(z3, false);
                f5 = f3;
                jB2 = ii3VarColors.b(z3, true);
                f6 = f4;
                ne1Var4 = ne1Var3;
                jA = ii3VarColors.a(z3, false);
                jA2 = ii3VarColors.a(z3, true);
                c cVarThen5 = cVar3.then(d.a);
                float f16 = rj3.b;
                c cVar9 = cVar3;
                c cVarD5 = d.d(cVarThen5, 16.0f);
                boolean z1113 = z3;
                if (kk0Var2.l(CompositionLocalsKt.getLocalLayoutDirection()) == dx1.d) {
                    f7 = 180.0f;
                } else {
                    f7 = 0.0f;
                }
                c cVarO5 = y64.O(cVarD5, f7);
                boolean zJ5 = kk0Var2.j(n23Var) | kk0Var2.g(jB) | kk0Var2.g(jB2) | kk0Var2.g(jA) | kk0Var2.g(jA2);
                if ((3670016 & i3) == 1048576) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                boolean z1114 = z6 | zJ5;
                if ((29360128 & i3) == 8388608) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                boolean z1115 = z1114 | z7;
                if (((57344 & i3) ^ 24576) > 16384) {
                    ne1Var5 = ne1Var4;
                    if (kk0Var2.h(ne1Var5)) {
                        z8 = true;
                    }
                    boolean z1116 = z1115 | z8;
                    if ((458752 & i3) == 131072) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    z10 = z1116 | z9;
                    objP2 = kk0Var2.P();
                    if (z10) {
                        f8 = f5;
                        kk0Var = kk0Var2;
                        f9 = f6;
                        ne1Var6 = ne1Var5;
                        ki3 ki3Var16 = new ki3(n23Var, jB, jB2, jA, jA2, f8, f9, ne1Var6, oe1Var3, 0);
                        kk0Var.l0(ki3Var16);
                        objP2 = ki3Var16;
                    } else {
                        f8 = f5;
                        kk0Var = kk0Var2;
                        f9 = f6;
                        ne1Var6 = ne1Var5;
                        ki3 ki3Var17 = new ki3(n23Var, jB, jB2, jA, jA2, f8, f9, ne1Var6, oe1Var3, 0);
                        kk0Var.l0(ki3Var17);
                        objP2 = ki3Var17;
                    }
                    c10.Canvas(cVarO5, (le1) objP2, kk0Var, 0);
                    ii3Var3 = ii3VarColors;
                    f10 = f8;
                    f11 = f9;
                    ne1Var7 = ne1Var6;
                    oe1Var4 = oe1Var3;
                    cVar4 = cVar9;
                    z11 = z1113;
                } else {
                    ne1Var5 = ne1Var4;
                }
                if ((i3 & 24576) == 16384) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                boolean z1117 = z1115 | z8;
                if ((458752 & i3) == 131072) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                z10 = z1117 | z9;
                objP2 = kk0Var2.P();
                if (z10) {
                    f8 = f5;
                    kk0Var = kk0Var2;
                    f9 = f6;
                    ne1Var6 = ne1Var5;
                    ki3 ki3Var18 = new ki3(n23Var, jB, jB2, jA, jA2, f8, f9, ne1Var6, oe1Var3, 0);
                    kk0Var.l0(ki3Var18);
                    objP2 = ki3Var18;
                } else {
                    f8 = f5;
                    kk0Var = kk0Var2;
                    f9 = f6;
                    ne1Var6 = ne1Var5;
                    ki3 ki3Var19 = new ki3(n23Var, jB, jB2, jA, jA2, f8, f9, ne1Var6, oe1Var3, 0);
                    kk0Var.l0(ki3Var19);
                    objP2 = ki3Var19;
                }
                c10.Canvas(cVarO5, (le1) objP2, kk0Var, 0);
                ii3Var3 = ii3VarColors;
                f10 = f8;
                f11 = f9;
                ne1Var7 = ne1Var6;
                oe1Var4 = oe1Var3;
                cVar4 = cVar9;
                z11 = z1113;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new li3(this, n23Var, cVar4, z11, ii3Var3, ne1Var7, oe1Var4, f10, f11, i, i2, 0));
            }
        }
        i3 |= 384;
        z2 = z;
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                ii3Var2 = ii3Var;
                if (kk0Var2.h(ii3Var2)) {
                }
                i3 |= i15;
            } else {
                ii3Var2 = ii3Var;
            }
            i3 |= i15;
        } else {
            ii3Var2 = ii3Var;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                ne1Var2 = ne1Var;
                if (kk0Var2.j(ne1Var2)) {
                    i13 = 16384;
                }
                i3 |= i13;
            } else {
                ne1Var2 = ne1Var;
            }
            i13 = ConstantsKt.DEFAULT_BUFFER_SIZE;
            i3 |= i13;
        } else {
            ne1Var2 = ne1Var;
        }
        i6 = i2 & 32;
        if (i6 != 0) {
            i3 |= 196608;
            oe1Var2 = oe1Var;
        } else {
            oe1Var2 = oe1Var;
            if ((i & 196608) == 0) {
                if (kk0Var2.j(oe1Var2)) {
                    i7 = 131072;
                } else {
                    i7 = 65536;
                }
                i3 |= i7;
            }
        }
        i8 = i2 & 64;
        if (i8 != 0) {
            i3 |= 1572864;
            f3 = f;
        } else {
            f3 = f;
            if ((i & 1572864) == 0) {
                if (kk0Var2.e(f3)) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i3 |= i9;
            }
        }
        i10 = i2 & Uuid.SIZE_BITS;
        if (i10 != 0) {
            i3 |= 12582912;
        } else if ((i & 12582912) == 0) {
            if (kk0Var2.e(f2)) {
                i11 = 8388608;
            } else {
                i11 = 4194304;
            }
            i3 |= i11;
        }
        if ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
            i3 |= 100663296;
        } else if ((i & 100663296) == 0) {
            if (kk0Var2.h(this)) {
                i12 = 67108864;
            } else {
                i12 = 33554432;
            }
            i3 |= i12;
        }
        if ((38347923 & i3) == 38347922) {
            kk0Var2.X();
            if ((i & 1) != 0) {
                if (i14 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if (i4 != 0) {
                    z2 = true;
                }
                if ((i2 & 8) != 0) {
                    ii3VarColors = colors(kk0Var2, (i3 >> 24) & 14);
                    i3 &= -7169;
                } else {
                    ii3VarColors = ii3Var2;
                }
                if ((i2 & 16) != 0) {
                    if (((i3 & 7168) ^ 3072) <= 2048) {
                    }
                    if ((i3 & 896) == 256) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    z5 = z12 | z4;
                    objP = kk0Var2.P();
                    if (z5) {
                        objP = new mi3(ii3VarColors, z2, 1);
                        kk0Var2.l0(objP);
                    } else {
                        objP = new mi3(ii3VarColors, z2, 1);
                        kk0Var2.l0(objP);
                    }
                    ne1Var3 = (ne1) objP;
                    i3 &= -57345;
                } else {
                    ne1Var3 = ne1Var2;
                }
                if (i6 != 0) {
                    oe1Var3 = u1.l;
                } else {
                    oe1Var3 = oe1Var2;
                }
                if (i8 != 0) {
                    f3 = rj3.b;
                }
                if (i10 != 0) {
                    f4 = rj3.c;
                } else {
                    f4 = f2;
                }
                z3 = z2;
            } else {
                if (i14 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if (i4 != 0) {
                    z2 = true;
                }
                if ((i2 & 8) != 0) {
                    ii3VarColors = colors(kk0Var2, (i3 >> 24) & 14);
                    i3 &= -7169;
                } else {
                    ii3VarColors = ii3Var2;
                }
                if ((i2 & 16) != 0) {
                    if (((i3 & 7168) ^ 3072) <= 2048) {
                    }
                    if ((i3 & 896) == 256) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    z5 = z12 | z4;
                    objP = kk0Var2.P();
                    if (z5) {
                        objP = new mi3(ii3VarColors, z2, 1);
                        kk0Var2.l0(objP);
                    } else {
                        objP = new mi3(ii3VarColors, z2, 1);
                        kk0Var2.l0(objP);
                    }
                    ne1Var3 = (ne1) objP;
                    i3 &= -57345;
                } else {
                    ne1Var3 = ne1Var2;
                }
                if (i6 != 0) {
                    oe1Var3 = u1.l;
                } else {
                    oe1Var3 = oe1Var2;
                }
                if (i8 != 0) {
                    f3 = rj3.b;
                }
                if (i10 != 0) {
                    f4 = rj3.c;
                } else {
                    f4 = f2;
                }
                z3 = z2;
            }
            kk0Var2.s();
            jB = ii3VarColors.b(z3, false);
            f5 = f3;
            jB2 = ii3VarColors.b(z3, true);
            f6 = f4;
            ne1Var4 = ne1Var3;
            jA = ii3VarColors.a(z3, false);
            jA2 = ii3VarColors.a(z3, true);
            c cVarThen6 = cVar3.then(d.a);
            float f17 = rj3.b;
            c cVar10 = cVar3;
            c cVarD6 = d.d(cVarThen6, 16.0f);
            boolean z1118 = z3;
            if (kk0Var2.l(CompositionLocalsKt.getLocalLayoutDirection()) == dx1.d) {
                f7 = 180.0f;
            } else {
                f7 = 0.0f;
            }
            c cVarO6 = y64.O(cVarD6, f7);
            boolean zJ6 = kk0Var2.j(n23Var) | kk0Var2.g(jB) | kk0Var2.g(jB2) | kk0Var2.g(jA) | kk0Var2.g(jA2);
            if ((3670016 & i3) == 1048576) {
                z6 = true;
            } else {
                z6 = false;
            }
            boolean z1119 = z6 | zJ6;
            if ((29360128 & i3) == 8388608) {
                z7 = true;
            } else {
                z7 = false;
            }
            boolean z11110 = z1119 | z7;
            if (((57344 & i3) ^ 24576) > 16384) {
                ne1Var5 = ne1Var4;
                if (kk0Var2.h(ne1Var5)) {
                    z8 = true;
                }
                boolean z11111 = z11110 | z8;
                if ((458752 & i3) == 131072) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                z10 = z11111 | z9;
                objP2 = kk0Var2.P();
                if (z10) {
                    f8 = f5;
                    kk0Var = kk0Var2;
                    f9 = f6;
                    ne1Var6 = ne1Var5;
                    ki3 ki3Var110 = new ki3(n23Var, jB, jB2, jA, jA2, f8, f9, ne1Var6, oe1Var3, 0);
                    kk0Var.l0(ki3Var110);
                    objP2 = ki3Var110;
                } else {
                    f8 = f5;
                    kk0Var = kk0Var2;
                    f9 = f6;
                    ne1Var6 = ne1Var5;
                    ki3 ki3Var111 = new ki3(n23Var, jB, jB2, jA, jA2, f8, f9, ne1Var6, oe1Var3, 0);
                    kk0Var.l0(ki3Var111);
                    objP2 = ki3Var111;
                }
                c10.Canvas(cVarO6, (le1) objP2, kk0Var, 0);
                ii3Var3 = ii3VarColors;
                f10 = f8;
                f11 = f9;
                ne1Var7 = ne1Var6;
                oe1Var4 = oe1Var3;
                cVar4 = cVar10;
                z11 = z1118;
            } else {
                ne1Var5 = ne1Var4;
            }
            if ((i3 & 24576) == 16384) {
                z8 = true;
            } else {
                z8 = false;
            }
            boolean z11112 = z11110 | z8;
            if ((458752 & i3) == 131072) {
                z9 = true;
            } else {
                z9 = false;
            }
            z10 = z11112 | z9;
            objP2 = kk0Var2.P();
            if (z10) {
                f8 = f5;
                kk0Var = kk0Var2;
                f9 = f6;
                ne1Var6 = ne1Var5;
                ki3 ki3Var112 = new ki3(n23Var, jB, jB2, jA, jA2, f8, f9, ne1Var6, oe1Var3, 0);
                kk0Var.l0(ki3Var112);
                objP2 = ki3Var112;
            } else {
                f8 = f5;
                kk0Var = kk0Var2;
                f9 = f6;
                ne1Var6 = ne1Var5;
                ki3 ki3Var113 = new ki3(n23Var, jB, jB2, jA, jA2, f8, f9, ne1Var6, oe1Var3, 0);
                kk0Var.l0(ki3Var113);
                objP2 = ki3Var113;
            }
            c10.Canvas(cVarO6, (le1) objP2, kk0Var, 0);
            ii3Var3 = ii3VarColors;
            f10 = f8;
            f11 = f9;
            ne1Var7 = ne1Var6;
            oe1Var4 = oe1Var3;
            cVar4 = cVar10;
            z11 = z1118;
        } else {
            kk0Var2.X();
            if ((i & 1) != 0) {
                if (i14 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if (i4 != 0) {
                    z2 = true;
                }
                if ((i2 & 8) != 0) {
                    ii3VarColors = colors(kk0Var2, (i3 >> 24) & 14);
                    i3 &= -7169;
                } else {
                    ii3VarColors = ii3Var2;
                }
                if ((i2 & 16) != 0) {
                    if (((i3 & 7168) ^ 3072) <= 2048) {
                    }
                    if ((i3 & 896) == 256) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    z5 = z12 | z4;
                    objP = kk0Var2.P();
                    if (z5) {
                        objP = new mi3(ii3VarColors, z2, 1);
                        kk0Var2.l0(objP);
                    } else {
                        objP = new mi3(ii3VarColors, z2, 1);
                        kk0Var2.l0(objP);
                    }
                    ne1Var3 = (ne1) objP;
                    i3 &= -57345;
                } else {
                    ne1Var3 = ne1Var2;
                }
                if (i6 != 0) {
                    oe1Var3 = u1.l;
                } else {
                    oe1Var3 = oe1Var2;
                }
                if (i8 != 0) {
                    f3 = rj3.b;
                }
                if (i10 != 0) {
                    f4 = rj3.c;
                } else {
                    f4 = f2;
                }
                z3 = z2;
            } else {
                if (i14 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if (i4 != 0) {
                    z2 = true;
                }
                if ((i2 & 8) != 0) {
                    ii3VarColors = colors(kk0Var2, (i3 >> 24) & 14);
                    i3 &= -7169;
                } else {
                    ii3VarColors = ii3Var2;
                }
                if ((i2 & 16) != 0) {
                    if (((i3 & 7168) ^ 3072) <= 2048) {
                    }
                    if ((i3 & 896) == 256) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    z5 = z12 | z4;
                    objP = kk0Var2.P();
                    if (z5) {
                        objP = new mi3(ii3VarColors, z2, 1);
                        kk0Var2.l0(objP);
                    } else {
                        objP = new mi3(ii3VarColors, z2, 1);
                        kk0Var2.l0(objP);
                    }
                    ne1Var3 = (ne1) objP;
                    i3 &= -57345;
                } else {
                    ne1Var3 = ne1Var2;
                }
                if (i6 != 0) {
                    oe1Var3 = u1.l;
                } else {
                    oe1Var3 = oe1Var2;
                }
                if (i8 != 0) {
                    f3 = rj3.b;
                }
                if (i10 != 0) {
                    f4 = rj3.c;
                } else {
                    f4 = f2;
                }
                z3 = z2;
            }
            kk0Var2.s();
            jB = ii3VarColors.b(z3, false);
            f5 = f3;
            jB2 = ii3VarColors.b(z3, true);
            f6 = f4;
            ne1Var4 = ne1Var3;
            jA = ii3VarColors.a(z3, false);
            jA2 = ii3VarColors.a(z3, true);
            c cVarThen7 = cVar3.then(d.a);
            float f18 = rj3.b;
            c cVar11 = cVar3;
            c cVarD7 = d.d(cVarThen7, 16.0f);
            boolean z11113 = z3;
            if (kk0Var2.l(CompositionLocalsKt.getLocalLayoutDirection()) == dx1.d) {
                f7 = 180.0f;
            } else {
                f7 = 0.0f;
            }
            c cVarO7 = y64.O(cVarD7, f7);
            boolean zJ7 = kk0Var2.j(n23Var) | kk0Var2.g(jB) | kk0Var2.g(jB2) | kk0Var2.g(jA) | kk0Var2.g(jA2);
            if ((3670016 & i3) == 1048576) {
                z6 = true;
            } else {
                z6 = false;
            }
            boolean z11114 = z6 | zJ7;
            if ((29360128 & i3) == 8388608) {
                z7 = true;
            } else {
                z7 = false;
            }
            boolean z11115 = z11114 | z7;
            if (((57344 & i3) ^ 24576) > 16384) {
                ne1Var5 = ne1Var4;
                if (kk0Var2.h(ne1Var5)) {
                    z8 = true;
                }
                boolean z11116 = z11115 | z8;
                if ((458752 & i3) == 131072) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                z10 = z11116 | z9;
                objP2 = kk0Var2.P();
                if (z10) {
                    f8 = f5;
                    kk0Var = kk0Var2;
                    f9 = f6;
                    ne1Var6 = ne1Var5;
                    ki3 ki3Var114 = new ki3(n23Var, jB, jB2, jA, jA2, f8, f9, ne1Var6, oe1Var3, 0);
                    kk0Var.l0(ki3Var114);
                    objP2 = ki3Var114;
                } else {
                    f8 = f5;
                    kk0Var = kk0Var2;
                    f9 = f6;
                    ne1Var6 = ne1Var5;
                    ki3 ki3Var115 = new ki3(n23Var, jB, jB2, jA, jA2, f8, f9, ne1Var6, oe1Var3, 0);
                    kk0Var.l0(ki3Var115);
                    objP2 = ki3Var115;
                }
                c10.Canvas(cVarO7, (le1) objP2, kk0Var, 0);
                ii3Var3 = ii3VarColors;
                f10 = f8;
                f11 = f9;
                ne1Var7 = ne1Var6;
                oe1Var4 = oe1Var3;
                cVar4 = cVar11;
                z11 = z11113;
            } else {
                ne1Var5 = ne1Var4;
            }
            if ((i3 & 24576) == 16384) {
                z8 = true;
            } else {
                z8 = false;
            }
            boolean z11117 = z11115 | z8;
            if ((458752 & i3) == 131072) {
                z9 = true;
            } else {
                z9 = false;
            }
            z10 = z11117 | z9;
            objP2 = kk0Var2.P();
            if (z10) {
                f8 = f5;
                kk0Var = kk0Var2;
                f9 = f6;
                ne1Var6 = ne1Var5;
                ki3 ki3Var116 = new ki3(n23Var, jB, jB2, jA, jA2, f8, f9, ne1Var6, oe1Var3, 0);
                kk0Var.l0(ki3Var116);
                objP2 = ki3Var116;
            } else {
                f8 = f5;
                kk0Var = kk0Var2;
                f9 = f6;
                ne1Var6 = ne1Var5;
                ki3 ki3Var117 = new ki3(n23Var, jB, jB2, jA, jA2, f8, f9, ne1Var6, oe1Var3, 0);
                kk0Var.l0(ki3Var117);
                objP2 = ki3Var117;
            }
            c10.Canvas(cVarO7, (le1) objP2, kk0Var, 0);
            ii3Var3 = ii3VarColors;
            f10 = f8;
            f11 = f9;
            ne1Var7 = ne1Var6;
            oe1Var4 = oe1Var3;
            cVar4 = cVar11;
            z11 = z11113;
        }
        w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new li3(this, n23Var, cVar4, z11, ii3Var3, ne1Var7, oe1Var4, f10, f11, i, i2, 0));
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0126  */
    /* JADX WARN: Code duplicated, block: B:105:0x0134  */
    /* JADX WARN: Code duplicated, block: B:115:0x0155 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:116:0x0157  */
    /* JADX WARN: Code duplicated, block: B:117:0x015a  */
    /* JADX WARN: Code duplicated, block: B:119:0x015d  */
    /* JADX WARN: Code duplicated, block: B:122:0x0162  */
    /* JADX WARN: Code duplicated, block: B:123:0x016d  */
    /* JADX WARN: Code duplicated, block: B:126:0x0172  */
    /* JADX WARN: Code duplicated, block: B:128:0x017a  */
    /* JADX WARN: Code duplicated, block: B:130:0x0180  */
    /* JADX WARN: Code duplicated, block: B:136:0x018d  */
    /* JADX WARN: Code duplicated, block: B:137:0x018f  */
    /* JADX WARN: Code duplicated, block: B:140:0x0197  */
    /* JADX WARN: Code duplicated, block: B:142:0x019d  */
    /* JADX WARN: Code duplicated, block: B:144:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:146:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:147:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:149:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:151:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:153:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:156:0x0201  */
    /* JADX WARN: Code duplicated, block: B:157:0x0204  */
    /* JADX WARN: Code duplicated, block: B:160:0x022a  */
    /* JADX WARN: Code duplicated, block: B:161:0x022c  */
    /* JADX WARN: Code duplicated, block: B:164:0x0235  */
    /* JADX WARN: Code duplicated, block: B:165:0x0237  */
    /* JADX WARN: Code duplicated, block: B:168:0x0243  */
    /* JADX WARN: Code duplicated, block: B:171:0x024c  */
    /* JADX WARN: Code duplicated, block: B:174:0x0252 A[PHI: r1
  0x0252: PHI (r1v14 ne1) = (r1v9 ne1), (r1v15 ne1) binds: [B:173:0x0250, B:169:0x0249] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:175:0x0254  */
    /* JADX WARN: Code duplicated, block: B:178:0x025d  */
    /* JADX WARN: Code duplicated, block: B:179:0x0260  */
    /* JADX WARN: Code duplicated, block: B:182:0x026a  */
    /* JADX WARN: Code duplicated, block: B:186:0x027b  */
    /* JADX WARN: Code duplicated, block: B:190:0x02af  */
    /* JADX WARN: Code duplicated, block: B:192:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    /* JADX WARN: Code duplicated, block: B:28:0x004d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:32:0x0059  */
    /* JADX WARN: Code duplicated, block: B:33:0x005c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX WARN: Code duplicated, block: B:39:0x0067  */
    /* JADX WARN: Code duplicated, block: B:41:0x006f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0072  */
    /* JADX WARN: Code duplicated, block: B:45:0x0078  */
    /* JADX WARN: Code duplicated, block: B:48:0x007e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0082  */
    /* JADX WARN: Code duplicated, block: B:52:0x008a  */
    /* JADX WARN: Code duplicated, block: B:53:0x008d  */
    /* JADX WARN: Code duplicated, block: B:56:0x0093  */
    /* JADX WARN: Code duplicated, block: B:59:0x009b  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:65:0x00af  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:70:0x00be  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:80:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:85:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:92:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:94:0x0102  */
    /* JADX WARN: Code duplicated, block: B:95:0x0105  */
    /* JADX WARN: Code duplicated, block: B:99:0x0111  */
    /* JADX WARN: Failed to analyze thrown exceptions
    java.util.ConcurrentModificationException
    	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1013)
    	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:967)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:117)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:178)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
     */
    /* JADX INFO: renamed from: Track-4EFweAY, reason: not valid java name */
    public final void m1775x6ebfe39(uj3 uj3Var, c cVar, boolean z, ii3 ii3Var, ne1 ne1Var, oe1 oe1Var, float f, float f2, ck0 ck0Var, int i, int i2) {
        int i3;
        c cVar2;
        int i4;
        boolean z2;
        int i5;
        ii3 ii3Var2;
        ne1 ne1Var2;
        int i6;
        oe1 oe1Var2;
        int i7;
        int i8;
        float f3;
        int i9;
        int i10;
        int i11;
        int i12;
        c cVar3;
        ii3 ii3VarColors;
        ne1 ne1Var3;
        oe1 oe1Var3;
        float f4;
        boolean z3;
        boolean z4;
        boolean z5;
        Object objP;
        long jB;
        float f5;
        long jB2;
        float f6;
        ne1 ne1Var4;
        long jA;
        long jA2;
        float f7;
        boolean z6;
        boolean z7;
        ne1 ne1Var5;
        boolean z8;
        boolean z9;
        boolean z10;
        Object objP2;
        float f8;
        kk0 kk0Var;
        float f9;
        ne1 ne1Var6;
        ii3 ii3Var3;
        float f10;
        float f11;
        ne1 ne1Var7;
        oe1 oe1Var4;
        c cVar4;
        boolean z11;
        w33 w33VarV;
        int i13;
        kk0 kk0Var2 = (kk0) ck0Var;
        kk0Var2.c0(49984771);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (kk0Var2.j(uj3Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i14 = i2 & 2;
        if (i14 == 0) {
            if ((i & 48) == 0) {
                cVar2 = cVar;
                i3 |= kk0Var2.h(cVar2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    z2 = z;
                    if (kk0Var2.i(z2)) {
                        i5 = FontInfo.NUMBER_OF_CHAR_CODES;
                    } else {
                        i5 = Uuid.SIZE_BITS;
                    }
                    i3 |= i5;
                }
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        ii3Var2 = ii3Var;
                        int i15 = kk0Var2.h(ii3Var2) ? 2048 : 1024;
                        i3 |= i15;
                    } else {
                        ii3Var2 = ii3Var;
                    }
                    i3 |= i15;
                } else {
                    ii3Var2 = ii3Var;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        ne1Var2 = ne1Var;
                        if (kk0Var2.j(ne1Var2)) {
                            i13 = 16384;
                        }
                        i3 |= i13;
                    } else {
                        ne1Var2 = ne1Var;
                    }
                    i13 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                    i3 |= i13;
                } else {
                    ne1Var2 = ne1Var;
                }
                i6 = i2 & 32;
                if (i6 != 0) {
                    i3 |= 196608;
                    oe1Var2 = oe1Var;
                } else {
                    oe1Var2 = oe1Var;
                    if ((i & 196608) == 0) {
                        if (kk0Var2.j(oe1Var2)) {
                            i7 = 131072;
                        } else {
                            i7 = 65536;
                        }
                        i3 |= i7;
                    }
                }
                i8 = i2 & 64;
                if (i8 != 0) {
                    i3 |= 1572864;
                    f3 = f;
                } else {
                    f3 = f;
                    if ((i & 1572864) == 0) {
                        if (kk0Var2.e(f3)) {
                            i9 = 1048576;
                        } else {
                            i9 = 524288;
                        }
                        i3 |= i9;
                    }
                }
                i10 = i2 & Uuid.SIZE_BITS;
                if (i10 != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    if (kk0Var2.e(f2)) {
                        i11 = 8388608;
                    } else {
                        i11 = 4194304;
                    }
                    i3 |= i11;
                }
                if ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                    i3 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    if (kk0Var2.h(this)) {
                        i12 = 67108864;
                    } else {
                        i12 = 33554432;
                    }
                    i3 |= i12;
                }
                if ((38347923 & i3) == 38347922 || !kk0Var2.F()) {
                    kk0Var2.X();
                    if ((i & 1) != 0 || kk0Var2.D()) {
                        if (i14 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 8) != 0) {
                            ii3VarColors = colors(kk0Var2, (i3 >> 24) & 14);
                            i3 &= -7169;
                        } else {
                            ii3VarColors = ii3Var2;
                        }
                        if ((i2 & 16) != 0) {
                            boolean z12 = (((i3 & 7168) ^ 3072) <= 2048 && kk0Var2.h(ii3VarColors)) || (i3 & 3072) == 2048;
                            if ((i3 & 896) == 256) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            z5 = z12 | z4;
                            objP = kk0Var2.P();
                            if (z5 || objP == Composer$Companion.getEmpty()) {
                                objP = new mi3(ii3VarColors, z2, 0);
                                kk0Var2.l0(objP);
                            }
                            ne1Var3 = (ne1) objP;
                            i3 &= -57345;
                        } else {
                            ne1Var3 = ne1Var2;
                        }
                        if (i6 != 0) {
                            oe1Var3 = u1.m;
                        } else {
                            oe1Var3 = oe1Var2;
                        }
                        if (i8 != 0) {
                            f3 = rj3.b;
                        }
                        if (i10 != 0) {
                            f4 = rj3.c;
                        } else {
                            f4 = f2;
                        }
                        z3 = z2;
                    } else {
                        kk0Var2.V();
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        i3 = i3;
                        cVar3 = cVar2;
                        f3 = f3;
                        z3 = z2;
                        ii3VarColors = ii3Var2;
                        oe1Var3 = oe1Var2;
                        ne1Var3 = ne1Var2;
                        f4 = f2;
                    }
                    kk0Var2.s();
                    jB = ii3VarColors.b(z3, false);
                    f5 = f3;
                    jB2 = ii3VarColors.b(z3, true);
                    f6 = f4;
                    ne1Var4 = ne1Var3;
                    jA = ii3VarColors.a(z3, false);
                    jA2 = ii3VarColors.a(z3, true);
                    c cVarThen = cVar3.then(d.a);
                    float f12 = rj3.b;
                    c cVar5 = cVar3;
                    c cVarD = d.d(cVarThen, 16.0f);
                    boolean z13 = z3;
                    if (kk0Var2.l(CompositionLocalsKt.getLocalLayoutDirection()) == dx1.d) {
                        f7 = 180.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    c cVarO = y64.O(cVarD, f7);
                    boolean zJ = kk0Var2.j(uj3Var) | kk0Var2.g(jB) | kk0Var2.g(jB2) | kk0Var2.g(jA) | kk0Var2.g(jA2);
                    if ((3670016 & i3) == 1048576) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    boolean z14 = z6 | zJ;
                    if ((29360128 & i3) == 8388608) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    boolean z15 = z14 | z7;
                    if (((57344 & i3) ^ 24576) > 16384) {
                        ne1Var5 = ne1Var4;
                        if (kk0Var2.h(ne1Var5)) {
                            z8 = true;
                        }
                        boolean z16 = z15 | z8;
                        if ((458752 & i3) == 131072) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        z10 = z16 | z9;
                        objP2 = kk0Var2.P();
                        if (!z10 || objP2 == Composer$Companion.getEmpty()) {
                            f8 = f5;
                            kk0Var = kk0Var2;
                            f9 = f6;
                            ne1Var6 = ne1Var5;
                            ki3 ki3Var = new ki3(uj3Var, jB, jB2, jA, jA2, f8, f9, ne1Var6, oe1Var3, 1);
                            kk0Var.l0(ki3Var);
                            objP2 = ki3Var;
                        } else {
                            f8 = f5;
                            f9 = f6;
                            ne1Var6 = ne1Var5;
                            kk0Var = kk0Var2;
                        }
                        c10.Canvas(cVarO, (le1) objP2, kk0Var, 0);
                        ii3Var3 = ii3VarColors;
                        f10 = f8;
                        f11 = f9;
                        ne1Var7 = ne1Var6;
                        oe1Var4 = oe1Var3;
                        cVar4 = cVar5;
                        z11 = z13;
                    } else {
                        ne1Var5 = ne1Var4;
                    }
                    if ((i3 & 24576) == 16384) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    boolean z17 = z15 | z8;
                    if ((458752 & i3) == 131072) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    z10 = z17 | z9;
                    objP2 = kk0Var2.P();
                    if (z10) {
                        f8 = f5;
                        kk0Var = kk0Var2;
                        f9 = f6;
                        ne1Var6 = ne1Var5;
                        ki3 ki3Var2 = new ki3(uj3Var, jB, jB2, jA, jA2, f8, f9, ne1Var6, oe1Var3, 1);
                        kk0Var.l0(ki3Var2);
                        objP2 = ki3Var2;
                    } else {
                        f8 = f5;
                        kk0Var = kk0Var2;
                        f9 = f6;
                        ne1Var6 = ne1Var5;
                        ki3 ki3Var3 = new ki3(uj3Var, jB, jB2, jA, jA2, f8, f9, ne1Var6, oe1Var3, 1);
                        kk0Var.l0(ki3Var3);
                        objP2 = ki3Var3;
                    }
                    c10.Canvas(cVarO, (le1) objP2, kk0Var, 0);
                    ii3Var3 = ii3VarColors;
                    f10 = f8;
                    f11 = f9;
                    ne1Var7 = ne1Var6;
                    oe1Var4 = oe1Var3;
                    cVar4 = cVar5;
                    z11 = z13;
                } else {
                    kk0Var2.V();
                    kk0Var = kk0Var2;
                    cVar4 = cVar2;
                    f10 = f3;
                    z11 = z2;
                    ii3Var3 = ii3Var2;
                    ne1Var7 = ne1Var2;
                    oe1Var4 = oe1Var2;
                    f11 = f2;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new li3(this, uj3Var, cVar4, z11, ii3Var3, ne1Var7, oe1Var4, f10, f11, i, i2, 1));
                }
            }
            i3 |= 384;
            z2 = z;
            if ((i & 3072) == 0) {
                if ((i2 & 8) == 0) {
                    ii3Var2 = ii3Var;
                    if (kk0Var2.h(ii3Var2)) {
                    }
                    i3 |= i15;
                } else {
                    ii3Var2 = ii3Var;
                }
                i3 |= i15;
            } else {
                ii3Var2 = ii3Var;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    ne1Var2 = ne1Var;
                    if (kk0Var2.j(ne1Var2)) {
                        i13 = 16384;
                    }
                    i3 |= i13;
                } else {
                    ne1Var2 = ne1Var;
                }
                i13 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                i3 |= i13;
            } else {
                ne1Var2 = ne1Var;
            }
            i6 = i2 & 32;
            if (i6 != 0) {
                i3 |= 196608;
                oe1Var2 = oe1Var;
            } else {
                oe1Var2 = oe1Var;
                if ((i & 196608) == 0) {
                    if (kk0Var2.j(oe1Var2)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
            }
            i8 = i2 & 64;
            if (i8 != 0) {
                i3 |= 1572864;
                f3 = f;
            } else {
                f3 = f;
                if ((i & 1572864) == 0) {
                    if (kk0Var2.e(f3)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i3 |= i9;
                }
            }
            i10 = i2 & Uuid.SIZE_BITS;
            if (i10 != 0) {
                i3 |= 12582912;
            } else if ((i & 12582912) == 0) {
                if (kk0Var2.e(f2)) {
                    i11 = 8388608;
                } else {
                    i11 = 4194304;
                }
                i3 |= i11;
            }
            if ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                i3 |= 100663296;
            } else if ((i & 100663296) == 0) {
                if (kk0Var2.h(this)) {
                    i12 = 67108864;
                } else {
                    i12 = 33554432;
                }
                i3 |= i12;
            }
            if ((38347923 & i3) == 38347922) {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i14 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 8) != 0) {
                        ii3VarColors = colors(kk0Var2, (i3 >> 24) & 14);
                        i3 &= -7169;
                    } else {
                        ii3VarColors = ii3Var2;
                    }
                    if ((i2 & 16) != 0) {
                        if (((i3 & 7168) ^ 3072) <= 2048) {
                        }
                        if ((i3 & 896) == 256) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        z5 = z12 | z4;
                        objP = kk0Var2.P();
                        if (z5) {
                            objP = new mi3(ii3VarColors, z2, 0);
                            kk0Var2.l0(objP);
                        } else {
                            objP = new mi3(ii3VarColors, z2, 0);
                            kk0Var2.l0(objP);
                        }
                        ne1Var3 = (ne1) objP;
                        i3 &= -57345;
                    } else {
                        ne1Var3 = ne1Var2;
                    }
                    if (i6 != 0) {
                        oe1Var3 = u1.m;
                    } else {
                        oe1Var3 = oe1Var2;
                    }
                    if (i8 != 0) {
                        f3 = rj3.b;
                    }
                    if (i10 != 0) {
                        f4 = rj3.c;
                    } else {
                        f4 = f2;
                    }
                    z3 = z2;
                } else {
                    if (i14 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 8) != 0) {
                        ii3VarColors = colors(kk0Var2, (i3 >> 24) & 14);
                        i3 &= -7169;
                    } else {
                        ii3VarColors = ii3Var2;
                    }
                    if ((i2 & 16) != 0) {
                        if (((i3 & 7168) ^ 3072) <= 2048) {
                        }
                        if ((i3 & 896) == 256) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        z5 = z12 | z4;
                        objP = kk0Var2.P();
                        if (z5) {
                            objP = new mi3(ii3VarColors, z2, 0);
                            kk0Var2.l0(objP);
                        } else {
                            objP = new mi3(ii3VarColors, z2, 0);
                            kk0Var2.l0(objP);
                        }
                        ne1Var3 = (ne1) objP;
                        i3 &= -57345;
                    } else {
                        ne1Var3 = ne1Var2;
                    }
                    if (i6 != 0) {
                        oe1Var3 = u1.m;
                    } else {
                        oe1Var3 = oe1Var2;
                    }
                    if (i8 != 0) {
                        f3 = rj3.b;
                    }
                    if (i10 != 0) {
                        f4 = rj3.c;
                    } else {
                        f4 = f2;
                    }
                    z3 = z2;
                }
                kk0Var2.s();
                jB = ii3VarColors.b(z3, false);
                f5 = f3;
                jB2 = ii3VarColors.b(z3, true);
                f6 = f4;
                ne1Var4 = ne1Var3;
                jA = ii3VarColors.a(z3, false);
                jA2 = ii3VarColors.a(z3, true);
                c cVarThen2 = cVar3.then(d.a);
                float f13 = rj3.b;
                c cVar6 = cVar3;
                c cVarD2 = d.d(cVarThen2, 16.0f);
                boolean z18 = z3;
                if (kk0Var2.l(CompositionLocalsKt.getLocalLayoutDirection()) == dx1.d) {
                    f7 = 180.0f;
                } else {
                    f7 = 0.0f;
                }
                c cVarO2 = y64.O(cVarD2, f7);
                boolean zJ2 = kk0Var2.j(uj3Var) | kk0Var2.g(jB) | kk0Var2.g(jB2) | kk0Var2.g(jA) | kk0Var2.g(jA2);
                if ((3670016 & i3) == 1048576) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                boolean z19 = z6 | zJ2;
                if ((29360128 & i3) == 8388608) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                boolean z110 = z19 | z7;
                if (((57344 & i3) ^ 24576) > 16384) {
                    ne1Var5 = ne1Var4;
                    if (kk0Var2.h(ne1Var5)) {
                        z8 = true;
                    }
                    boolean z111 = z110 | z8;
                    if ((458752 & i3) == 131072) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    z10 = z111 | z9;
                    objP2 = kk0Var2.P();
                    if (z10) {
                        f8 = f5;
                        kk0Var = kk0Var2;
                        f9 = f6;
                        ne1Var6 = ne1Var5;
                        ki3 ki3Var4 = new ki3(uj3Var, jB, jB2, jA, jA2, f8, f9, ne1Var6, oe1Var3, 1);
                        kk0Var.l0(ki3Var4);
                        objP2 = ki3Var4;
                    } else {
                        f8 = f5;
                        kk0Var = kk0Var2;
                        f9 = f6;
                        ne1Var6 = ne1Var5;
                        ki3 ki3Var5 = new ki3(uj3Var, jB, jB2, jA, jA2, f8, f9, ne1Var6, oe1Var3, 1);
                        kk0Var.l0(ki3Var5);
                        objP2 = ki3Var5;
                    }
                    c10.Canvas(cVarO2, (le1) objP2, kk0Var, 0);
                    ii3Var3 = ii3VarColors;
                    f10 = f8;
                    f11 = f9;
                    ne1Var7 = ne1Var6;
                    oe1Var4 = oe1Var3;
                    cVar4 = cVar6;
                    z11 = z18;
                } else {
                    ne1Var5 = ne1Var4;
                }
                if ((i3 & 24576) == 16384) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                boolean z112 = z110 | z8;
                if ((458752 & i3) == 131072) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                z10 = z112 | z9;
                objP2 = kk0Var2.P();
                if (z10) {
                    f8 = f5;
                    kk0Var = kk0Var2;
                    f9 = f6;
                    ne1Var6 = ne1Var5;
                    ki3 ki3Var6 = new ki3(uj3Var, jB, jB2, jA, jA2, f8, f9, ne1Var6, oe1Var3, 1);
                    kk0Var.l0(ki3Var6);
                    objP2 = ki3Var6;
                } else {
                    f8 = f5;
                    kk0Var = kk0Var2;
                    f9 = f6;
                    ne1Var6 = ne1Var5;
                    ki3 ki3Var7 = new ki3(uj3Var, jB, jB2, jA, jA2, f8, f9, ne1Var6, oe1Var3, 1);
                    kk0Var.l0(ki3Var7);
                    objP2 = ki3Var7;
                }
                c10.Canvas(cVarO2, (le1) objP2, kk0Var, 0);
                ii3Var3 = ii3VarColors;
                f10 = f8;
                f11 = f9;
                ne1Var7 = ne1Var6;
                oe1Var4 = oe1Var3;
                cVar4 = cVar6;
                z11 = z18;
            } else {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i14 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 8) != 0) {
                        ii3VarColors = colors(kk0Var2, (i3 >> 24) & 14);
                        i3 &= -7169;
                    } else {
                        ii3VarColors = ii3Var2;
                    }
                    if ((i2 & 16) != 0) {
                        if (((i3 & 7168) ^ 3072) <= 2048) {
                        }
                        if ((i3 & 896) == 256) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        z5 = z12 | z4;
                        objP = kk0Var2.P();
                        if (z5) {
                            objP = new mi3(ii3VarColors, z2, 0);
                            kk0Var2.l0(objP);
                        } else {
                            objP = new mi3(ii3VarColors, z2, 0);
                            kk0Var2.l0(objP);
                        }
                        ne1Var3 = (ne1) objP;
                        i3 &= -57345;
                    } else {
                        ne1Var3 = ne1Var2;
                    }
                    if (i6 != 0) {
                        oe1Var3 = u1.m;
                    } else {
                        oe1Var3 = oe1Var2;
                    }
                    if (i8 != 0) {
                        f3 = rj3.b;
                    }
                    if (i10 != 0) {
                        f4 = rj3.c;
                    } else {
                        f4 = f2;
                    }
                    z3 = z2;
                } else {
                    if (i14 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 8) != 0) {
                        ii3VarColors = colors(kk0Var2, (i3 >> 24) & 14);
                        i3 &= -7169;
                    } else {
                        ii3VarColors = ii3Var2;
                    }
                    if ((i2 & 16) != 0) {
                        if (((i3 & 7168) ^ 3072) <= 2048) {
                        }
                        if ((i3 & 896) == 256) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        z5 = z12 | z4;
                        objP = kk0Var2.P();
                        if (z5) {
                            objP = new mi3(ii3VarColors, z2, 0);
                            kk0Var2.l0(objP);
                        } else {
                            objP = new mi3(ii3VarColors, z2, 0);
                            kk0Var2.l0(objP);
                        }
                        ne1Var3 = (ne1) objP;
                        i3 &= -57345;
                    } else {
                        ne1Var3 = ne1Var2;
                    }
                    if (i6 != 0) {
                        oe1Var3 = u1.m;
                    } else {
                        oe1Var3 = oe1Var2;
                    }
                    if (i8 != 0) {
                        f3 = rj3.b;
                    }
                    if (i10 != 0) {
                        f4 = rj3.c;
                    } else {
                        f4 = f2;
                    }
                    z3 = z2;
                }
                kk0Var2.s();
                jB = ii3VarColors.b(z3, false);
                f5 = f3;
                jB2 = ii3VarColors.b(z3, true);
                f6 = f4;
                ne1Var4 = ne1Var3;
                jA = ii3VarColors.a(z3, false);
                jA2 = ii3VarColors.a(z3, true);
                c cVarThen3 = cVar3.then(d.a);
                float f14 = rj3.b;
                c cVar7 = cVar3;
                c cVarD3 = d.d(cVarThen3, 16.0f);
                boolean z113 = z3;
                if (kk0Var2.l(CompositionLocalsKt.getLocalLayoutDirection()) == dx1.d) {
                    f7 = 180.0f;
                } else {
                    f7 = 0.0f;
                }
                c cVarO3 = y64.O(cVarD3, f7);
                boolean zJ3 = kk0Var2.j(uj3Var) | kk0Var2.g(jB) | kk0Var2.g(jB2) | kk0Var2.g(jA) | kk0Var2.g(jA2);
                if ((3670016 & i3) == 1048576) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                boolean z114 = z6 | zJ3;
                if ((29360128 & i3) == 8388608) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                boolean z115 = z114 | z7;
                if (((57344 & i3) ^ 24576) > 16384) {
                    ne1Var5 = ne1Var4;
                    if (kk0Var2.h(ne1Var5)) {
                        z8 = true;
                    }
                    boolean z116 = z115 | z8;
                    if ((458752 & i3) == 131072) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    z10 = z116 | z9;
                    objP2 = kk0Var2.P();
                    if (z10) {
                        f8 = f5;
                        kk0Var = kk0Var2;
                        f9 = f6;
                        ne1Var6 = ne1Var5;
                        ki3 ki3Var8 = new ki3(uj3Var, jB, jB2, jA, jA2, f8, f9, ne1Var6, oe1Var3, 1);
                        kk0Var.l0(ki3Var8);
                        objP2 = ki3Var8;
                    } else {
                        f8 = f5;
                        kk0Var = kk0Var2;
                        f9 = f6;
                        ne1Var6 = ne1Var5;
                        ki3 ki3Var9 = new ki3(uj3Var, jB, jB2, jA, jA2, f8, f9, ne1Var6, oe1Var3, 1);
                        kk0Var.l0(ki3Var9);
                        objP2 = ki3Var9;
                    }
                    c10.Canvas(cVarO3, (le1) objP2, kk0Var, 0);
                    ii3Var3 = ii3VarColors;
                    f10 = f8;
                    f11 = f9;
                    ne1Var7 = ne1Var6;
                    oe1Var4 = oe1Var3;
                    cVar4 = cVar7;
                    z11 = z113;
                } else {
                    ne1Var5 = ne1Var4;
                }
                if ((i3 & 24576) == 16384) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                boolean z117 = z115 | z8;
                if ((458752 & i3) == 131072) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                z10 = z117 | z9;
                objP2 = kk0Var2.P();
                if (z10) {
                    f8 = f5;
                    kk0Var = kk0Var2;
                    f9 = f6;
                    ne1Var6 = ne1Var5;
                    ki3 ki3Var10 = new ki3(uj3Var, jB, jB2, jA, jA2, f8, f9, ne1Var6, oe1Var3, 1);
                    kk0Var.l0(ki3Var10);
                    objP2 = ki3Var10;
                } else {
                    f8 = f5;
                    kk0Var = kk0Var2;
                    f9 = f6;
                    ne1Var6 = ne1Var5;
                    ki3 ki3Var11 = new ki3(uj3Var, jB, jB2, jA, jA2, f8, f9, ne1Var6, oe1Var3, 1);
                    kk0Var.l0(ki3Var11);
                    objP2 = ki3Var11;
                }
                c10.Canvas(cVarO3, (le1) objP2, kk0Var, 0);
                ii3Var3 = ii3VarColors;
                f10 = f8;
                f11 = f9;
                ne1Var7 = ne1Var6;
                oe1Var4 = oe1Var3;
                cVar4 = cVar7;
                z11 = z113;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new li3(this, uj3Var, cVar4, z11, ii3Var3, ne1Var7, oe1Var4, f10, f11, i, i2, 1));
            }
        }
        i3 |= 48;
        cVar2 = cVar;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                z2 = z;
                if (kk0Var2.i(z2)) {
                    i5 = FontInfo.NUMBER_OF_CHAR_CODES;
                } else {
                    i5 = Uuid.SIZE_BITS;
                }
                i3 |= i5;
            }
            if ((i & 3072) == 0) {
                if ((i2 & 8) == 0) {
                    ii3Var2 = ii3Var;
                    if (kk0Var2.h(ii3Var2)) {
                    }
                    i3 |= i15;
                } else {
                    ii3Var2 = ii3Var;
                }
                i3 |= i15;
            } else {
                ii3Var2 = ii3Var;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    ne1Var2 = ne1Var;
                    if (kk0Var2.j(ne1Var2)) {
                        i13 = 16384;
                    }
                    i3 |= i13;
                } else {
                    ne1Var2 = ne1Var;
                }
                i13 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                i3 |= i13;
            } else {
                ne1Var2 = ne1Var;
            }
            i6 = i2 & 32;
            if (i6 != 0) {
                i3 |= 196608;
                oe1Var2 = oe1Var;
            } else {
                oe1Var2 = oe1Var;
                if ((i & 196608) == 0) {
                    if (kk0Var2.j(oe1Var2)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
            }
            i8 = i2 & 64;
            if (i8 != 0) {
                i3 |= 1572864;
                f3 = f;
            } else {
                f3 = f;
                if ((i & 1572864) == 0) {
                    if (kk0Var2.e(f3)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i3 |= i9;
                }
            }
            i10 = i2 & Uuid.SIZE_BITS;
            if (i10 != 0) {
                i3 |= 12582912;
            } else if ((i & 12582912) == 0) {
                if (kk0Var2.e(f2)) {
                    i11 = 8388608;
                } else {
                    i11 = 4194304;
                }
                i3 |= i11;
            }
            if ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                i3 |= 100663296;
            } else if ((i & 100663296) == 0) {
                if (kk0Var2.h(this)) {
                    i12 = 67108864;
                } else {
                    i12 = 33554432;
                }
                i3 |= i12;
            }
            if ((38347923 & i3) == 38347922) {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i14 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 8) != 0) {
                        ii3VarColors = colors(kk0Var2, (i3 >> 24) & 14);
                        i3 &= -7169;
                    } else {
                        ii3VarColors = ii3Var2;
                    }
                    if ((i2 & 16) != 0) {
                        if (((i3 & 7168) ^ 3072) <= 2048) {
                        }
                        if ((i3 & 896) == 256) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        z5 = z12 | z4;
                        objP = kk0Var2.P();
                        if (z5) {
                            objP = new mi3(ii3VarColors, z2, 0);
                            kk0Var2.l0(objP);
                        } else {
                            objP = new mi3(ii3VarColors, z2, 0);
                            kk0Var2.l0(objP);
                        }
                        ne1Var3 = (ne1) objP;
                        i3 &= -57345;
                    } else {
                        ne1Var3 = ne1Var2;
                    }
                    if (i6 != 0) {
                        oe1Var3 = u1.m;
                    } else {
                        oe1Var3 = oe1Var2;
                    }
                    if (i8 != 0) {
                        f3 = rj3.b;
                    }
                    if (i10 != 0) {
                        f4 = rj3.c;
                    } else {
                        f4 = f2;
                    }
                    z3 = z2;
                } else {
                    if (i14 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 8) != 0) {
                        ii3VarColors = colors(kk0Var2, (i3 >> 24) & 14);
                        i3 &= -7169;
                    } else {
                        ii3VarColors = ii3Var2;
                    }
                    if ((i2 & 16) != 0) {
                        if (((i3 & 7168) ^ 3072) <= 2048) {
                        }
                        if ((i3 & 896) == 256) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        z5 = z12 | z4;
                        objP = kk0Var2.P();
                        if (z5) {
                            objP = new mi3(ii3VarColors, z2, 0);
                            kk0Var2.l0(objP);
                        } else {
                            objP = new mi3(ii3VarColors, z2, 0);
                            kk0Var2.l0(objP);
                        }
                        ne1Var3 = (ne1) objP;
                        i3 &= -57345;
                    } else {
                        ne1Var3 = ne1Var2;
                    }
                    if (i6 != 0) {
                        oe1Var3 = u1.m;
                    } else {
                        oe1Var3 = oe1Var2;
                    }
                    if (i8 != 0) {
                        f3 = rj3.b;
                    }
                    if (i10 != 0) {
                        f4 = rj3.c;
                    } else {
                        f4 = f2;
                    }
                    z3 = z2;
                }
                kk0Var2.s();
                jB = ii3VarColors.b(z3, false);
                f5 = f3;
                jB2 = ii3VarColors.b(z3, true);
                f6 = f4;
                ne1Var4 = ne1Var3;
                jA = ii3VarColors.a(z3, false);
                jA2 = ii3VarColors.a(z3, true);
                c cVarThen4 = cVar3.then(d.a);
                float f15 = rj3.b;
                c cVar8 = cVar3;
                c cVarD4 = d.d(cVarThen4, 16.0f);
                boolean z118 = z3;
                if (kk0Var2.l(CompositionLocalsKt.getLocalLayoutDirection()) == dx1.d) {
                    f7 = 180.0f;
                } else {
                    f7 = 0.0f;
                }
                c cVarO4 = y64.O(cVarD4, f7);
                boolean zJ4 = kk0Var2.j(uj3Var) | kk0Var2.g(jB) | kk0Var2.g(jB2) | kk0Var2.g(jA) | kk0Var2.g(jA2);
                if ((3670016 & i3) == 1048576) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                boolean z119 = z6 | zJ4;
                if ((29360128 & i3) == 8388608) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                boolean z1110 = z119 | z7;
                if (((57344 & i3) ^ 24576) > 16384) {
                    ne1Var5 = ne1Var4;
                    if (kk0Var2.h(ne1Var5)) {
                        z8 = true;
                    }
                    boolean z1111 = z1110 | z8;
                    if ((458752 & i3) == 131072) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    z10 = z1111 | z9;
                    objP2 = kk0Var2.P();
                    if (z10) {
                        f8 = f5;
                        kk0Var = kk0Var2;
                        f9 = f6;
                        ne1Var6 = ne1Var5;
                        ki3 ki3Var12 = new ki3(uj3Var, jB, jB2, jA, jA2, f8, f9, ne1Var6, oe1Var3, 1);
                        kk0Var.l0(ki3Var12);
                        objP2 = ki3Var12;
                    } else {
                        f8 = f5;
                        kk0Var = kk0Var2;
                        f9 = f6;
                        ne1Var6 = ne1Var5;
                        ki3 ki3Var13 = new ki3(uj3Var, jB, jB2, jA, jA2, f8, f9, ne1Var6, oe1Var3, 1);
                        kk0Var.l0(ki3Var13);
                        objP2 = ki3Var13;
                    }
                    c10.Canvas(cVarO4, (le1) objP2, kk0Var, 0);
                    ii3Var3 = ii3VarColors;
                    f10 = f8;
                    f11 = f9;
                    ne1Var7 = ne1Var6;
                    oe1Var4 = oe1Var3;
                    cVar4 = cVar8;
                    z11 = z118;
                } else {
                    ne1Var5 = ne1Var4;
                }
                if ((i3 & 24576) == 16384) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                boolean z1112 = z1110 | z8;
                if ((458752 & i3) == 131072) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                z10 = z1112 | z9;
                objP2 = kk0Var2.P();
                if (z10) {
                    f8 = f5;
                    kk0Var = kk0Var2;
                    f9 = f6;
                    ne1Var6 = ne1Var5;
                    ki3 ki3Var14 = new ki3(uj3Var, jB, jB2, jA, jA2, f8, f9, ne1Var6, oe1Var3, 1);
                    kk0Var.l0(ki3Var14);
                    objP2 = ki3Var14;
                } else {
                    f8 = f5;
                    kk0Var = kk0Var2;
                    f9 = f6;
                    ne1Var6 = ne1Var5;
                    ki3 ki3Var15 = new ki3(uj3Var, jB, jB2, jA, jA2, f8, f9, ne1Var6, oe1Var3, 1);
                    kk0Var.l0(ki3Var15);
                    objP2 = ki3Var15;
                }
                c10.Canvas(cVarO4, (le1) objP2, kk0Var, 0);
                ii3Var3 = ii3VarColors;
                f10 = f8;
                f11 = f9;
                ne1Var7 = ne1Var6;
                oe1Var4 = oe1Var3;
                cVar4 = cVar8;
                z11 = z118;
            } else {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i14 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 8) != 0) {
                        ii3VarColors = colors(kk0Var2, (i3 >> 24) & 14);
                        i3 &= -7169;
                    } else {
                        ii3VarColors = ii3Var2;
                    }
                    if ((i2 & 16) != 0) {
                        if (((i3 & 7168) ^ 3072) <= 2048) {
                        }
                        if ((i3 & 896) == 256) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        z5 = z12 | z4;
                        objP = kk0Var2.P();
                        if (z5) {
                            objP = new mi3(ii3VarColors, z2, 0);
                            kk0Var2.l0(objP);
                        } else {
                            objP = new mi3(ii3VarColors, z2, 0);
                            kk0Var2.l0(objP);
                        }
                        ne1Var3 = (ne1) objP;
                        i3 &= -57345;
                    } else {
                        ne1Var3 = ne1Var2;
                    }
                    if (i6 != 0) {
                        oe1Var3 = u1.m;
                    } else {
                        oe1Var3 = oe1Var2;
                    }
                    if (i8 != 0) {
                        f3 = rj3.b;
                    }
                    if (i10 != 0) {
                        f4 = rj3.c;
                    } else {
                        f4 = f2;
                    }
                    z3 = z2;
                } else {
                    if (i14 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 8) != 0) {
                        ii3VarColors = colors(kk0Var2, (i3 >> 24) & 14);
                        i3 &= -7169;
                    } else {
                        ii3VarColors = ii3Var2;
                    }
                    if ((i2 & 16) != 0) {
                        if (((i3 & 7168) ^ 3072) <= 2048) {
                        }
                        if ((i3 & 896) == 256) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        z5 = z12 | z4;
                        objP = kk0Var2.P();
                        if (z5) {
                            objP = new mi3(ii3VarColors, z2, 0);
                            kk0Var2.l0(objP);
                        } else {
                            objP = new mi3(ii3VarColors, z2, 0);
                            kk0Var2.l0(objP);
                        }
                        ne1Var3 = (ne1) objP;
                        i3 &= -57345;
                    } else {
                        ne1Var3 = ne1Var2;
                    }
                    if (i6 != 0) {
                        oe1Var3 = u1.m;
                    } else {
                        oe1Var3 = oe1Var2;
                    }
                    if (i8 != 0) {
                        f3 = rj3.b;
                    }
                    if (i10 != 0) {
                        f4 = rj3.c;
                    } else {
                        f4 = f2;
                    }
                    z3 = z2;
                }
                kk0Var2.s();
                jB = ii3VarColors.b(z3, false);
                f5 = f3;
                jB2 = ii3VarColors.b(z3, true);
                f6 = f4;
                ne1Var4 = ne1Var3;
                jA = ii3VarColors.a(z3, false);
                jA2 = ii3VarColors.a(z3, true);
                c cVarThen5 = cVar3.then(d.a);
                float f16 = rj3.b;
                c cVar9 = cVar3;
                c cVarD5 = d.d(cVarThen5, 16.0f);
                boolean z1113 = z3;
                if (kk0Var2.l(CompositionLocalsKt.getLocalLayoutDirection()) == dx1.d) {
                    f7 = 180.0f;
                } else {
                    f7 = 0.0f;
                }
                c cVarO5 = y64.O(cVarD5, f7);
                boolean zJ5 = kk0Var2.j(uj3Var) | kk0Var2.g(jB) | kk0Var2.g(jB2) | kk0Var2.g(jA) | kk0Var2.g(jA2);
                if ((3670016 & i3) == 1048576) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                boolean z1114 = z6 | zJ5;
                if ((29360128 & i3) == 8388608) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                boolean z1115 = z1114 | z7;
                if (((57344 & i3) ^ 24576) > 16384) {
                    ne1Var5 = ne1Var4;
                    if (kk0Var2.h(ne1Var5)) {
                        z8 = true;
                    }
                    boolean z1116 = z1115 | z8;
                    if ((458752 & i3) == 131072) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    z10 = z1116 | z9;
                    objP2 = kk0Var2.P();
                    if (z10) {
                        f8 = f5;
                        kk0Var = kk0Var2;
                        f9 = f6;
                        ne1Var6 = ne1Var5;
                        ki3 ki3Var16 = new ki3(uj3Var, jB, jB2, jA, jA2, f8, f9, ne1Var6, oe1Var3, 1);
                        kk0Var.l0(ki3Var16);
                        objP2 = ki3Var16;
                    } else {
                        f8 = f5;
                        kk0Var = kk0Var2;
                        f9 = f6;
                        ne1Var6 = ne1Var5;
                        ki3 ki3Var17 = new ki3(uj3Var, jB, jB2, jA, jA2, f8, f9, ne1Var6, oe1Var3, 1);
                        kk0Var.l0(ki3Var17);
                        objP2 = ki3Var17;
                    }
                    c10.Canvas(cVarO5, (le1) objP2, kk0Var, 0);
                    ii3Var3 = ii3VarColors;
                    f10 = f8;
                    f11 = f9;
                    ne1Var7 = ne1Var6;
                    oe1Var4 = oe1Var3;
                    cVar4 = cVar9;
                    z11 = z1113;
                } else {
                    ne1Var5 = ne1Var4;
                }
                if ((i3 & 24576) == 16384) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                boolean z1117 = z1115 | z8;
                if ((458752 & i3) == 131072) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                z10 = z1117 | z9;
                objP2 = kk0Var2.P();
                if (z10) {
                    f8 = f5;
                    kk0Var = kk0Var2;
                    f9 = f6;
                    ne1Var6 = ne1Var5;
                    ki3 ki3Var18 = new ki3(uj3Var, jB, jB2, jA, jA2, f8, f9, ne1Var6, oe1Var3, 1);
                    kk0Var.l0(ki3Var18);
                    objP2 = ki3Var18;
                } else {
                    f8 = f5;
                    kk0Var = kk0Var2;
                    f9 = f6;
                    ne1Var6 = ne1Var5;
                    ki3 ki3Var19 = new ki3(uj3Var, jB, jB2, jA, jA2, f8, f9, ne1Var6, oe1Var3, 1);
                    kk0Var.l0(ki3Var19);
                    objP2 = ki3Var19;
                }
                c10.Canvas(cVarO5, (le1) objP2, kk0Var, 0);
                ii3Var3 = ii3VarColors;
                f10 = f8;
                f11 = f9;
                ne1Var7 = ne1Var6;
                oe1Var4 = oe1Var3;
                cVar4 = cVar9;
                z11 = z1113;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new li3(this, uj3Var, cVar4, z11, ii3Var3, ne1Var7, oe1Var4, f10, f11, i, i2, 1));
            }
        }
        i3 |= 384;
        z2 = z;
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                ii3Var2 = ii3Var;
                if (kk0Var2.h(ii3Var2)) {
                }
                i3 |= i15;
            } else {
                ii3Var2 = ii3Var;
            }
            i3 |= i15;
        } else {
            ii3Var2 = ii3Var;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                ne1Var2 = ne1Var;
                if (kk0Var2.j(ne1Var2)) {
                    i13 = 16384;
                }
                i3 |= i13;
            } else {
                ne1Var2 = ne1Var;
            }
            i13 = ConstantsKt.DEFAULT_BUFFER_SIZE;
            i3 |= i13;
        } else {
            ne1Var2 = ne1Var;
        }
        i6 = i2 & 32;
        if (i6 != 0) {
            i3 |= 196608;
            oe1Var2 = oe1Var;
        } else {
            oe1Var2 = oe1Var;
            if ((i & 196608) == 0) {
                if (kk0Var2.j(oe1Var2)) {
                    i7 = 131072;
                } else {
                    i7 = 65536;
                }
                i3 |= i7;
            }
        }
        i8 = i2 & 64;
        if (i8 != 0) {
            i3 |= 1572864;
            f3 = f;
        } else {
            f3 = f;
            if ((i & 1572864) == 0) {
                if (kk0Var2.e(f3)) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i3 |= i9;
            }
        }
        i10 = i2 & Uuid.SIZE_BITS;
        if (i10 != 0) {
            i3 |= 12582912;
        } else if ((i & 12582912) == 0) {
            if (kk0Var2.e(f2)) {
                i11 = 8388608;
            } else {
                i11 = 4194304;
            }
            i3 |= i11;
        }
        if ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
            i3 |= 100663296;
        } else if ((i & 100663296) == 0) {
            if (kk0Var2.h(this)) {
                i12 = 67108864;
            } else {
                i12 = 33554432;
            }
            i3 |= i12;
        }
        if ((38347923 & i3) == 38347922) {
            kk0Var2.X();
            if ((i & 1) != 0) {
                if (i14 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if (i4 != 0) {
                    z2 = true;
                }
                if ((i2 & 8) != 0) {
                    ii3VarColors = colors(kk0Var2, (i3 >> 24) & 14);
                    i3 &= -7169;
                } else {
                    ii3VarColors = ii3Var2;
                }
                if ((i2 & 16) != 0) {
                    if (((i3 & 7168) ^ 3072) <= 2048) {
                    }
                    if ((i3 & 896) == 256) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    z5 = z12 | z4;
                    objP = kk0Var2.P();
                    if (z5) {
                        objP = new mi3(ii3VarColors, z2, 0);
                        kk0Var2.l0(objP);
                    } else {
                        objP = new mi3(ii3VarColors, z2, 0);
                        kk0Var2.l0(objP);
                    }
                    ne1Var3 = (ne1) objP;
                    i3 &= -57345;
                } else {
                    ne1Var3 = ne1Var2;
                }
                if (i6 != 0) {
                    oe1Var3 = u1.m;
                } else {
                    oe1Var3 = oe1Var2;
                }
                if (i8 != 0) {
                    f3 = rj3.b;
                }
                if (i10 != 0) {
                    f4 = rj3.c;
                } else {
                    f4 = f2;
                }
                z3 = z2;
            } else {
                if (i14 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if (i4 != 0) {
                    z2 = true;
                }
                if ((i2 & 8) != 0) {
                    ii3VarColors = colors(kk0Var2, (i3 >> 24) & 14);
                    i3 &= -7169;
                } else {
                    ii3VarColors = ii3Var2;
                }
                if ((i2 & 16) != 0) {
                    if (((i3 & 7168) ^ 3072) <= 2048) {
                    }
                    if ((i3 & 896) == 256) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    z5 = z12 | z4;
                    objP = kk0Var2.P();
                    if (z5) {
                        objP = new mi3(ii3VarColors, z2, 0);
                        kk0Var2.l0(objP);
                    } else {
                        objP = new mi3(ii3VarColors, z2, 0);
                        kk0Var2.l0(objP);
                    }
                    ne1Var3 = (ne1) objP;
                    i3 &= -57345;
                } else {
                    ne1Var3 = ne1Var2;
                }
                if (i6 != 0) {
                    oe1Var3 = u1.m;
                } else {
                    oe1Var3 = oe1Var2;
                }
                if (i8 != 0) {
                    f3 = rj3.b;
                }
                if (i10 != 0) {
                    f4 = rj3.c;
                } else {
                    f4 = f2;
                }
                z3 = z2;
            }
            kk0Var2.s();
            jB = ii3VarColors.b(z3, false);
            f5 = f3;
            jB2 = ii3VarColors.b(z3, true);
            f6 = f4;
            ne1Var4 = ne1Var3;
            jA = ii3VarColors.a(z3, false);
            jA2 = ii3VarColors.a(z3, true);
            c cVarThen6 = cVar3.then(d.a);
            float f17 = rj3.b;
            c cVar10 = cVar3;
            c cVarD6 = d.d(cVarThen6, 16.0f);
            boolean z1118 = z3;
            if (kk0Var2.l(CompositionLocalsKt.getLocalLayoutDirection()) == dx1.d) {
                f7 = 180.0f;
            } else {
                f7 = 0.0f;
            }
            c cVarO6 = y64.O(cVarD6, f7);
            boolean zJ6 = kk0Var2.j(uj3Var) | kk0Var2.g(jB) | kk0Var2.g(jB2) | kk0Var2.g(jA) | kk0Var2.g(jA2);
            if ((3670016 & i3) == 1048576) {
                z6 = true;
            } else {
                z6 = false;
            }
            boolean z1119 = z6 | zJ6;
            if ((29360128 & i3) == 8388608) {
                z7 = true;
            } else {
                z7 = false;
            }
            boolean z11110 = z1119 | z7;
            if (((57344 & i3) ^ 24576) > 16384) {
                ne1Var5 = ne1Var4;
                if (kk0Var2.h(ne1Var5)) {
                    z8 = true;
                }
                boolean z11111 = z11110 | z8;
                if ((458752 & i3) == 131072) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                z10 = z11111 | z9;
                objP2 = kk0Var2.P();
                if (z10) {
                    f8 = f5;
                    kk0Var = kk0Var2;
                    f9 = f6;
                    ne1Var6 = ne1Var5;
                    ki3 ki3Var110 = new ki3(uj3Var, jB, jB2, jA, jA2, f8, f9, ne1Var6, oe1Var3, 1);
                    kk0Var.l0(ki3Var110);
                    objP2 = ki3Var110;
                } else {
                    f8 = f5;
                    kk0Var = kk0Var2;
                    f9 = f6;
                    ne1Var6 = ne1Var5;
                    ki3 ki3Var111 = new ki3(uj3Var, jB, jB2, jA, jA2, f8, f9, ne1Var6, oe1Var3, 1);
                    kk0Var.l0(ki3Var111);
                    objP2 = ki3Var111;
                }
                c10.Canvas(cVarO6, (le1) objP2, kk0Var, 0);
                ii3Var3 = ii3VarColors;
                f10 = f8;
                f11 = f9;
                ne1Var7 = ne1Var6;
                oe1Var4 = oe1Var3;
                cVar4 = cVar10;
                z11 = z1118;
            } else {
                ne1Var5 = ne1Var4;
            }
            if ((i3 & 24576) == 16384) {
                z8 = true;
            } else {
                z8 = false;
            }
            boolean z11112 = z11110 | z8;
            if ((458752 & i3) == 131072) {
                z9 = true;
            } else {
                z9 = false;
            }
            z10 = z11112 | z9;
            objP2 = kk0Var2.P();
            if (z10) {
                f8 = f5;
                kk0Var = kk0Var2;
                f9 = f6;
                ne1Var6 = ne1Var5;
                ki3 ki3Var112 = new ki3(uj3Var, jB, jB2, jA, jA2, f8, f9, ne1Var6, oe1Var3, 1);
                kk0Var.l0(ki3Var112);
                objP2 = ki3Var112;
            } else {
                f8 = f5;
                kk0Var = kk0Var2;
                f9 = f6;
                ne1Var6 = ne1Var5;
                ki3 ki3Var113 = new ki3(uj3Var, jB, jB2, jA, jA2, f8, f9, ne1Var6, oe1Var3, 1);
                kk0Var.l0(ki3Var113);
                objP2 = ki3Var113;
            }
            c10.Canvas(cVarO6, (le1) objP2, kk0Var, 0);
            ii3Var3 = ii3VarColors;
            f10 = f8;
            f11 = f9;
            ne1Var7 = ne1Var6;
            oe1Var4 = oe1Var3;
            cVar4 = cVar10;
            z11 = z1118;
        } else {
            kk0Var2.X();
            if ((i & 1) != 0) {
                if (i14 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if (i4 != 0) {
                    z2 = true;
                }
                if ((i2 & 8) != 0) {
                    ii3VarColors = colors(kk0Var2, (i3 >> 24) & 14);
                    i3 &= -7169;
                } else {
                    ii3VarColors = ii3Var2;
                }
                if ((i2 & 16) != 0) {
                    if (((i3 & 7168) ^ 3072) <= 2048) {
                    }
                    if ((i3 & 896) == 256) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    z5 = z12 | z4;
                    objP = kk0Var2.P();
                    if (z5) {
                        objP = new mi3(ii3VarColors, z2, 0);
                        kk0Var2.l0(objP);
                    } else {
                        objP = new mi3(ii3VarColors, z2, 0);
                        kk0Var2.l0(objP);
                    }
                    ne1Var3 = (ne1) objP;
                    i3 &= -57345;
                } else {
                    ne1Var3 = ne1Var2;
                }
                if (i6 != 0) {
                    oe1Var3 = u1.m;
                } else {
                    oe1Var3 = oe1Var2;
                }
                if (i8 != 0) {
                    f3 = rj3.b;
                }
                if (i10 != 0) {
                    f4 = rj3.c;
                } else {
                    f4 = f2;
                }
                z3 = z2;
            } else {
                if (i14 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if (i4 != 0) {
                    z2 = true;
                }
                if ((i2 & 8) != 0) {
                    ii3VarColors = colors(kk0Var2, (i3 >> 24) & 14);
                    i3 &= -7169;
                } else {
                    ii3VarColors = ii3Var2;
                }
                if ((i2 & 16) != 0) {
                    if (((i3 & 7168) ^ 3072) <= 2048) {
                    }
                    if ((i3 & 896) == 256) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    z5 = z12 | z4;
                    objP = kk0Var2.P();
                    if (z5) {
                        objP = new mi3(ii3VarColors, z2, 0);
                        kk0Var2.l0(objP);
                    } else {
                        objP = new mi3(ii3VarColors, z2, 0);
                        kk0Var2.l0(objP);
                    }
                    ne1Var3 = (ne1) objP;
                    i3 &= -57345;
                } else {
                    ne1Var3 = ne1Var2;
                }
                if (i6 != 0) {
                    oe1Var3 = u1.m;
                } else {
                    oe1Var3 = oe1Var2;
                }
                if (i8 != 0) {
                    f3 = rj3.b;
                }
                if (i10 != 0) {
                    f4 = rj3.c;
                } else {
                    f4 = f2;
                }
                z3 = z2;
            }
            kk0Var2.s();
            jB = ii3VarColors.b(z3, false);
            f5 = f3;
            jB2 = ii3VarColors.b(z3, true);
            f6 = f4;
            ne1Var4 = ne1Var3;
            jA = ii3VarColors.a(z3, false);
            jA2 = ii3VarColors.a(z3, true);
            c cVarThen7 = cVar3.then(d.a);
            float f18 = rj3.b;
            c cVar11 = cVar3;
            c cVarD7 = d.d(cVarThen7, 16.0f);
            boolean z11113 = z3;
            if (kk0Var2.l(CompositionLocalsKt.getLocalLayoutDirection()) == dx1.d) {
                f7 = 180.0f;
            } else {
                f7 = 0.0f;
            }
            c cVarO7 = y64.O(cVarD7, f7);
            boolean zJ7 = kk0Var2.j(uj3Var) | kk0Var2.g(jB) | kk0Var2.g(jB2) | kk0Var2.g(jA) | kk0Var2.g(jA2);
            if ((3670016 & i3) == 1048576) {
                z6 = true;
            } else {
                z6 = false;
            }
            boolean z11114 = z6 | zJ7;
            if ((29360128 & i3) == 8388608) {
                z7 = true;
            } else {
                z7 = false;
            }
            boolean z11115 = z11114 | z7;
            if (((57344 & i3) ^ 24576) > 16384) {
                ne1Var5 = ne1Var4;
                if (kk0Var2.h(ne1Var5)) {
                    z8 = true;
                }
                boolean z11116 = z11115 | z8;
                if ((458752 & i3) == 131072) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                z10 = z11116 | z9;
                objP2 = kk0Var2.P();
                if (z10) {
                    f8 = f5;
                    kk0Var = kk0Var2;
                    f9 = f6;
                    ne1Var6 = ne1Var5;
                    ki3 ki3Var114 = new ki3(uj3Var, jB, jB2, jA, jA2, f8, f9, ne1Var6, oe1Var3, 1);
                    kk0Var.l0(ki3Var114);
                    objP2 = ki3Var114;
                } else {
                    f8 = f5;
                    kk0Var = kk0Var2;
                    f9 = f6;
                    ne1Var6 = ne1Var5;
                    ki3 ki3Var115 = new ki3(uj3Var, jB, jB2, jA, jA2, f8, f9, ne1Var6, oe1Var3, 1);
                    kk0Var.l0(ki3Var115);
                    objP2 = ki3Var115;
                }
                c10.Canvas(cVarO7, (le1) objP2, kk0Var, 0);
                ii3Var3 = ii3VarColors;
                f10 = f8;
                f11 = f9;
                ne1Var7 = ne1Var6;
                oe1Var4 = oe1Var3;
                cVar4 = cVar11;
                z11 = z11113;
            } else {
                ne1Var5 = ne1Var4;
            }
            if ((i3 & 24576) == 16384) {
                z8 = true;
            } else {
                z8 = false;
            }
            boolean z11117 = z11115 | z8;
            if ((458752 & i3) == 131072) {
                z9 = true;
            } else {
                z9 = false;
            }
            z10 = z11117 | z9;
            objP2 = kk0Var2.P();
            if (z10) {
                f8 = f5;
                kk0Var = kk0Var2;
                f9 = f6;
                ne1Var6 = ne1Var5;
                ki3 ki3Var116 = new ki3(uj3Var, jB, jB2, jA, jA2, f8, f9, ne1Var6, oe1Var3, 1);
                kk0Var.l0(ki3Var116);
                objP2 = ki3Var116;
            } else {
                f8 = f5;
                kk0Var = kk0Var2;
                f9 = f6;
                ne1Var6 = ne1Var5;
                ki3 ki3Var117 = new ki3(uj3Var, jB, jB2, jA, jA2, f8, f9, ne1Var6, oe1Var3, 1);
                kk0Var.l0(ki3Var117);
                objP2 = ki3Var117;
            }
            c10.Canvas(cVarO7, (le1) objP2, kk0Var, 0);
            ii3Var3 = ii3VarColors;
            f10 = f8;
            f11 = f9;
            ne1Var7 = ne1Var6;
            oe1Var4 = oe1Var3;
            cVar4 = cVar11;
            z11 = z11113;
        }
        w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new li3(this, uj3Var, cVar4, z11, ii3Var3, ne1Var7, oe1Var4, f10, f11, i, i2, 1));
        }
    }

    public final ii3 colors(ck0 ck0Var, int i) {
        return d(ab2.a.getColorScheme(ck0Var, 6));
    }

    /* JADX INFO: renamed from: colors-q0g_0yA, reason: not valid java name */
    public final ii3 m1776xe9175d64(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, ck0 ck0Var, int i, int i2, int i3) {
        long j11;
        long j12;
        long j13 = (i3 & 1) != 0 ? re0.i : j;
        long j14 = (i3 & 2) != 0 ? re0.i : j2;
        long j15 = (i3 & 4) != 0 ? re0.i : j3;
        long j16 = (i3 & 8) != 0 ? re0.i : j4;
        long j17 = (i3 & 16) != 0 ? re0.i : j5;
        long j18 = (i3 & 32) != 0 ? re0.i : j6;
        long j19 = (i3 & 64) != 0 ? re0.i : j7;
        long j20 = (i3 & Uuid.SIZE_BITS) != 0 ? re0.i : j8;
        long j21 = j13;
        long j22 = (i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0 ? re0.i : j9;
        long j23 = (i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? re0.i : j10;
        long j24 = j22;
        ii3 ii3VarD = d(ab2.a.getColorScheme(ck0Var, 6));
        if (j21 != 16) {
            j12 = j21;
            j11 = 16;
        } else {
            j11 = 16;
            j12 = ii3VarD.a;
        }
        if (j14 == j11) {
            j14 = ii3VarD.b;
        }
        if (j15 == j11) {
            j15 = ii3VarD.c;
        }
        if (j16 == j11) {
            j16 = ii3VarD.d;
        }
        if (j17 == j11) {
            j17 = ii3VarD.e;
        }
        if (j18 == j11) {
            j18 = ii3VarD.f;
        }
        if (j19 == j11) {
            j19 = ii3VarD.g;
        }
        if (j20 == j11) {
            j20 = ii3VarD.h;
        }
        long j25 = j24 != j11 ? j24 : ii3VarD.i;
        if (j23 == j11) {
            j23 = ii3VarD.j;
        }
        return new ii3(j12, j14, j15, j16, j17, j18, j19, j20, j25, j23);
    }
}
