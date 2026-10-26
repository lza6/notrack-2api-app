package defpackage;

import android.view.View;
import androidx.compose.foundation.layout.e;
import androidx.compose.runtime.Composer$Companion;
import androidx.compose.ui.c;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import java.util.UUID;
import kotlin.io.ConstantsKt;
import kotlin.uuid.Uuid;
import org.scilab.forge.jlatexmath.FontInfo;

/* JADX INFO: loaded from: classes.dex */
public abstract class mf2 {
    /* JADX WARN: Code duplicated, block: B:100:0x0117  */
    /* JADX WARN: Code duplicated, block: B:102:0x011e  */
    /* JADX WARN: Code duplicated, block: B:104:0x0122  */
    /* JADX WARN: Code duplicated, block: B:106:0x012c  */
    /* JADX WARN: Code duplicated, block: B:107:0x012f  */
    /* JADX WARN: Code duplicated, block: B:111:0x0137  */
    /* JADX WARN: Code duplicated, block: B:113:0x013b  */
    /* JADX WARN: Code duplicated, block: B:116:0x0146 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:119:0x014d  */
    /* JADX WARN: Code duplicated, block: B:122:0x0155  */
    /* JADX WARN: Code duplicated, block: B:124:0x015c  */
    /* JADX WARN: Code duplicated, block: B:126:0x0160  */
    /* JADX WARN: Code duplicated, block: B:128:0x016a  */
    /* JADX WARN: Code duplicated, block: B:129:0x016d  */
    /* JADX WARN: Code duplicated, block: B:131:0x0172  */
    /* JADX WARN: Code duplicated, block: B:134:0x017b  */
    /* JADX WARN: Code duplicated, block: B:136:0x0180  */
    /* JADX WARN: Code duplicated, block: B:138:0x0184  */
    /* JADX WARN: Code duplicated, block: B:140:0x018c  */
    /* JADX WARN: Code duplicated, block: B:141:0x018f  */
    /* JADX WARN: Code duplicated, block: B:145:0x019c  */
    /* JADX WARN: Code duplicated, block: B:151:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:153:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:175:0x0218 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:176:0x021a  */
    /* JADX WARN: Code duplicated, block: B:177:0x021d  */
    /* JADX WARN: Code duplicated, block: B:180:0x0222  */
    /* JADX WARN: Code duplicated, block: B:182:0x022e  */
    /* JADX WARN: Code duplicated, block: B:183:0x0231  */
    /* JADX WARN: Code duplicated, block: B:186:0x023c  */
    /* JADX WARN: Code duplicated, block: B:189:0x0246  */
    /* JADX WARN: Code duplicated, block: B:192:0x0250  */
    /* JADX WARN: Code duplicated, block: B:194:0x025c  */
    /* JADX WARN: Code duplicated, block: B:195:0x025e  */
    /* JADX WARN: Code duplicated, block: B:198:0x0266  */
    /* JADX WARN: Code duplicated, block: B:199:0x026e  */
    /* JADX WARN: Code duplicated, block: B:201:0x0272  */
    /* JADX WARN: Code duplicated, block: B:202:0x0275  */
    /* JADX WARN: Code duplicated, block: B:205:0x027d  */
    /* JADX WARN: Code duplicated, block: B:206:0x0286  */
    /* JADX WARN: Code duplicated, block: B:208:0x028a  */
    /* JADX WARN: Code duplicated, block: B:209:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:213:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:215:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0051  */
    /* JADX WARN: Code duplicated, block: B:30:0x0059  */
    /* JADX WARN: Code duplicated, block: B:31:0x005c  */
    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x0068  */
    /* JADX WARN: Code duplicated, block: B:39:0x006d  */
    /* JADX WARN: Code duplicated, block: B:41:0x0071  */
    /* JADX WARN: Code duplicated, block: B:43:0x0079  */
    /* JADX WARN: Code duplicated, block: B:44:0x007c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0084  */
    /* JADX WARN: Code duplicated, block: B:50:0x0088  */
    /* JADX WARN: Code duplicated, block: B:52:0x0090  */
    /* JADX WARN: Code duplicated, block: B:53:0x0093  */
    /* JADX WARN: Code duplicated, block: B:56:0x009a  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:69:0x00be  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:79:0x00da  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:90:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:92:0x0102  */
    /* JADX WARN: Code duplicated, block: B:95:0x010b  */
    /* JADX WARN: Code duplicated, block: B:97:0x010f  */
    @cv0
    /* JADX INFO: renamed from: ModalBottomSheet-dYc4hso, reason: not valid java name */
    public static final void m1772x750f78f8(je1 je1Var, c cVar, hh3 hh3Var, float f, rg3 rg3Var, long j, long j2, float f2, long j3, ne1 ne1Var, e eVar, if2 if2Var, oe1 oe1Var, ck0 ck0Var, int i, int i2, int i3) {
        int i4;
        c cVar2;
        hh3 hh3VarRememberModalBottomSheetState;
        int i5;
        int i6;
        rg3 expandedShape;
        long containerColor;
        long jM2x310ea166;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        oe1 oe1Var2;
        int i15;
        c cVar3;
        float f3;
        int i16;
        ow owVar;
        float f4;
        int i17;
        long scrimColor;
        ne1 ne1Var2;
        ne1 ne1Var3;
        e windowInsets;
        ne1 ne1Var4;
        c cVar4;
        hh3 hh3Var2;
        int i18;
        int i19;
        float f5;
        rg3 rg3Var2;
        float f6;
        long j4;
        long j5;
        long j6;
        if2 if2Var2;
        kk0 kk0Var;
        c cVar5;
        hh3 hh3Var3;
        float f7;
        rg3 rg3Var3;
        long j7;
        long j8;
        float f8;
        long j9;
        ne1 ne1Var5;
        if2 if2Var3;
        e eVar2;
        w33 w33VarV;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        kk0 kk0Var2 = (kk0) ck0Var;
        kk0Var2.c0(944867294);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (kk0Var2.j(je1Var) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        int i25 = i3 & 2;
        if (i25 == 0) {
            if ((i & 48) == 0) {
                cVar2 = cVar;
                i4 |= kk0Var2.h(cVar2) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                if ((i3 & 4) == 0) {
                    hh3VarRememberModalBottomSheetState = hh3Var;
                    if (kk0Var2.h(hh3VarRememberModalBottomSheetState)) {
                        i24 = FontInfo.NUMBER_OF_CHAR_CODES;
                    }
                    i4 |= i24;
                } else {
                    hh3VarRememberModalBottomSheetState = hh3Var;
                }
                i24 = Uuid.SIZE_BITS;
                i4 |= i24;
            } else {
                hh3VarRememberModalBottomSheetState = hh3Var;
            }
            i5 = i3 & 8;
            if (i5 != 0) {
                if ((i & 3072) == 0) {
                    if (kk0Var2.e(f)) {
                        i6 = 2048;
                    } else {
                        i6 = 1024;
                    }
                    i4 |= i6;
                }
                if ((i & 24576) == 0) {
                    if ((i3 & 16) == 0) {
                        expandedShape = rg3Var;
                        if (kk0Var2.h(expandedShape)) {
                            i23 = 16384;
                        }
                        i4 |= i23;
                    } else {
                        expandedShape = rg3Var;
                    }
                    i23 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                    i4 |= i23;
                } else {
                    expandedShape = rg3Var;
                }
                if ((i & 196608) == 0) {
                    containerColor = j;
                    if ((i3 & 32) == 0 || !kk0Var2.g(containerColor)) {
                        i22 = 65536;
                    } else {
                        i22 = 131072;
                    }
                    i4 |= i22;
                } else {
                    containerColor = j;
                }
                if ((i & 1572864) == 0) {
                    jM2x310ea166 = j2;
                    if ((i3 & 64) == 0 || !kk0Var2.g(jM2x310ea166)) {
                        i21 = 524288;
                    } else {
                        i21 = 1048576;
                    }
                    i4 |= i21;
                } else {
                    jM2x310ea166 = j2;
                }
                i7 = i3 & Uuid.SIZE_BITS;
                if (i7 != 0) {
                    if ((i & 12582912) == 0) {
                        if (kk0Var2.e(f2)) {
                            i8 = 8388608;
                        } else {
                            i8 = 4194304;
                        }
                        i4 |= i8;
                    }
                    if ((i & 100663296) != 0) {
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) == 0 || !kk0Var2.g(j3)) {
                            i20 = 33554432;
                        } else {
                            i20 = 67108864;
                        }
                        i4 |= i20;
                    }
                    i9 = i3 & ConstantsKt.MINIMUM_BLOCK_SIZE;
                    if (i9 != 0) {
                        if ((i & 805306368) == 0) {
                            if (kk0Var2.j(ne1Var)) {
                                i10 = 536870912;
                            } else {
                                i10 = 268435456;
                            }
                            i4 |= i10;
                        }
                        if ((i2 & 6) == 0) {
                            i11 = i2 | (((i3 & 1024) == 0 || !kk0Var2.h(eVar)) ? 2 : 4);
                        } else {
                            i11 = i2;
                        }
                        i12 = i3 & 2048;
                        if (i12 != 0) {
                            i11 |= 48;
                        } else if ((i2 & 48) != 0) {
                            if (kk0Var2.h(if2Var)) {
                                i13 = 32;
                            } else {
                                i13 = 16;
                            }
                            i11 |= i13;
                        }
                        i14 = i11;
                        if ((i3 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
                            if ((i2 & 384) == 0) {
                                oe1Var2 = oe1Var;
                                if (kk0Var2.j(oe1Var2)) {
                                    i15 = FontInfo.NUMBER_OF_CHAR_CODES;
                                } else {
                                    i15 = Uuid.SIZE_BITS;
                                }
                                i14 |= i15;
                            }
                            if ((306783379 & i4) != 306783378 && (i14 & 147) == 146 && kk0Var2.F()) {
                                kk0Var2.V();
                                f7 = f;
                                if2Var3 = if2Var;
                                kk0Var = kk0Var2;
                                rg3Var3 = expandedShape;
                                j7 = containerColor;
                                cVar5 = cVar2;
                                hh3Var3 = hh3VarRememberModalBottomSheetState;
                                j8 = jM2x310ea166;
                                f8 = f2;
                                j9 = j3;
                                ne1Var5 = ne1Var;
                                eVar2 = eVar;
                            } else {
                                kk0Var2.X();
                                if ((i & 1) != 0 || kk0Var2.D()) {
                                    if (i25 != 0) {
                                        cVar3 = c.i;
                                    } else {
                                        cVar3 = cVar2;
                                    }
                                    if ((i3 & 4) != 0) {
                                        i4 &= -897;
                                        hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                                    }
                                    if (i5 != 0) {
                                        f3 = 640.0f;
                                    } else {
                                        f3 = f;
                                    }
                                    i16 = i3 & 16;
                                    owVar = ow.a;
                                    if (i16 != 0) {
                                        expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                                        i4 &= -57345;
                                    }
                                    if ((i3 & 32) != 0) {
                                        containerColor = owVar.getContainerColor(kk0Var2, 6);
                                        i4 &= -458753;
                                    }
                                    if ((i3 & 64) != 0) {
                                        jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                                        i4 &= -3670017;
                                    }
                                    if (i7 != 0) {
                                        f4 = 0.0f;
                                    } else {
                                        f4 = f2;
                                    }
                                    i17 = i14;
                                    if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                        scrimColor = owVar.getScrimColor(kk0Var2, 6);
                                        i4 &= -234881025;
                                    } else {
                                        scrimColor = j3;
                                    }
                                    if (i9 != 0) {
                                        ne1Var2 = fj0.a;
                                    } else {
                                        ne1Var2 = ne1Var;
                                    }
                                    ne1Var3 = ne1Var2;
                                    if ((i3 & 1024) != 0) {
                                        windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                                        i17 &= -15;
                                    } else {
                                        windowInsets = eVar;
                                    }
                                    if (i12 != 0) {
                                        ne1Var4 = ne1Var3;
                                        cVar4 = cVar3;
                                        i18 = i17;
                                        i19 = i4;
                                        rg3Var2 = expandedShape;
                                        f6 = f3;
                                        j4 = containerColor;
                                        long j10 = scrimColor;
                                        if2Var2 = le2.a;
                                        hh3Var2 = hh3VarRememberModalBottomSheetState;
                                        f5 = f4;
                                        j5 = jM2x310ea166;
                                        j6 = j10;
                                    } else {
                                        ne1Var4 = ne1Var3;
                                        cVar4 = cVar3;
                                        hh3Var2 = hh3VarRememberModalBottomSheetState;
                                        i18 = i17;
                                        i19 = i4;
                                        f5 = f4;
                                        rg3Var2 = expandedShape;
                                        f6 = f3;
                                        j4 = containerColor;
                                        j5 = jM2x310ea166;
                                        j6 = scrimColor;
                                        if2Var2 = if2Var;
                                    }
                                } else {
                                    kk0Var2.V();
                                    if ((i3 & 4) != 0) {
                                        i4 &= -897;
                                    }
                                    if ((i3 & 16) != 0) {
                                        i4 &= -57345;
                                    }
                                    if ((i3 & 32) != 0) {
                                        i4 &= -458753;
                                    }
                                    if ((i3 & 64) != 0) {
                                        i4 &= -3670017;
                                    }
                                    if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                        i4 &= -234881025;
                                    }
                                    if ((i3 & 1024) != 0) {
                                        i14 &= -15;
                                    }
                                    ne1Var4 = ne1Var;
                                    if2Var2 = if2Var;
                                    i18 = i14;
                                    i19 = i4;
                                    j4 = containerColor;
                                    cVar4 = cVar2;
                                    hh3Var2 = hh3VarRememberModalBottomSheetState;
                                    j5 = jM2x310ea166;
                                    f5 = f2;
                                    j6 = j3;
                                    windowInsets = eVar;
                                    rg3Var2 = expandedShape;
                                    f6 = f;
                                }
                                kk0Var2.s();
                                kk0Var = kk0Var2;
                                oe1 oe1Var3 = oe1Var2;
                                c cVar6 = cVar4;
                                hf2.m206x750f78f8(je1Var, cVar6, hh3Var2, f6, rg3Var2, j4, j5, f5, j6, ne1Var4, new jf2(windowInsets), if2Var2, oe1Var3, kk0Var, i19 & 2147483646, i18 & 1008, 0);
                                cVar5 = cVar6;
                                hh3Var3 = hh3Var2;
                                f7 = f6;
                                rg3Var3 = rg3Var2;
                                j7 = j4;
                                j8 = j5;
                                f8 = f5;
                                j9 = j6;
                                ne1Var5 = ne1Var4;
                                if2Var3 = if2Var2;
                                eVar2 = windowInsets;
                            }
                            w33VarV = kk0Var.v();
                            if (w33VarV != null) {
                                w33VarV.updateScope(new xe2(je1Var, cVar5, hh3Var3, f7, rg3Var3, j7, j8, f8, j9, ne1Var5, eVar2, if2Var3, oe1Var, i, i2, i3, 1));
                            }
                        }
                        i14 |= 384;
                        oe1Var2 = oe1Var;
                        if ((306783379 & i4) != 306783378) {
                            kk0Var2.X();
                            if ((i & 1) != 0) {
                                if (i25 != 0) {
                                    cVar3 = c.i;
                                } else {
                                    cVar3 = cVar2;
                                }
                                if ((i3 & 4) != 0) {
                                    i4 &= -897;
                                    hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                                }
                                if (i5 != 0) {
                                    f3 = 640.0f;
                                } else {
                                    f3 = f;
                                }
                                i16 = i3 & 16;
                                owVar = ow.a;
                                if (i16 != 0) {
                                    expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                                    i4 &= -57345;
                                }
                                if ((i3 & 32) != 0) {
                                    containerColor = owVar.getContainerColor(kk0Var2, 6);
                                    i4 &= -458753;
                                }
                                if ((i3 & 64) != 0) {
                                    jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                                    i4 &= -3670017;
                                }
                                if (i7 != 0) {
                                    f4 = 0.0f;
                                } else {
                                    f4 = f2;
                                }
                                i17 = i14;
                                if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                    scrimColor = owVar.getScrimColor(kk0Var2, 6);
                                    i4 &= -234881025;
                                } else {
                                    scrimColor = j3;
                                }
                                if (i9 != 0) {
                                    ne1Var2 = fj0.a;
                                } else {
                                    ne1Var2 = ne1Var;
                                }
                                ne1Var3 = ne1Var2;
                                if ((i3 & 1024) != 0) {
                                    windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                                    i17 &= -15;
                                } else {
                                    windowInsets = eVar;
                                }
                                if (i12 != 0) {
                                    ne1Var4 = ne1Var3;
                                    cVar4 = cVar3;
                                    i18 = i17;
                                    i19 = i4;
                                    rg3Var2 = expandedShape;
                                    f6 = f3;
                                    j4 = containerColor;
                                    long j11 = scrimColor;
                                    if2Var2 = le2.a;
                                    hh3Var2 = hh3VarRememberModalBottomSheetState;
                                    f5 = f4;
                                    j5 = jM2x310ea166;
                                    j6 = j11;
                                } else {
                                    ne1Var4 = ne1Var3;
                                    cVar4 = cVar3;
                                    hh3Var2 = hh3VarRememberModalBottomSheetState;
                                    i18 = i17;
                                    i19 = i4;
                                    f5 = f4;
                                    rg3Var2 = expandedShape;
                                    f6 = f3;
                                    j4 = containerColor;
                                    j5 = jM2x310ea166;
                                    j6 = scrimColor;
                                    if2Var2 = if2Var;
                                }
                            } else {
                                if (i25 != 0) {
                                    cVar3 = c.i;
                                } else {
                                    cVar3 = cVar2;
                                }
                                if ((i3 & 4) != 0) {
                                    i4 &= -897;
                                    hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                                }
                                if (i5 != 0) {
                                    f3 = 640.0f;
                                } else {
                                    f3 = f;
                                }
                                i16 = i3 & 16;
                                owVar = ow.a;
                                if (i16 != 0) {
                                    expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                                    i4 &= -57345;
                                }
                                if ((i3 & 32) != 0) {
                                    containerColor = owVar.getContainerColor(kk0Var2, 6);
                                    i4 &= -458753;
                                }
                                if ((i3 & 64) != 0) {
                                    jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                                    i4 &= -3670017;
                                }
                                if (i7 != 0) {
                                    f4 = 0.0f;
                                } else {
                                    f4 = f2;
                                }
                                i17 = i14;
                                if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                    scrimColor = owVar.getScrimColor(kk0Var2, 6);
                                    i4 &= -234881025;
                                } else {
                                    scrimColor = j3;
                                }
                                if (i9 != 0) {
                                    ne1Var2 = fj0.a;
                                } else {
                                    ne1Var2 = ne1Var;
                                }
                                ne1Var3 = ne1Var2;
                                if ((i3 & 1024) != 0) {
                                    windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                                    i17 &= -15;
                                } else {
                                    windowInsets = eVar;
                                }
                                if (i12 != 0) {
                                    ne1Var4 = ne1Var3;
                                    cVar4 = cVar3;
                                    i18 = i17;
                                    i19 = i4;
                                    rg3Var2 = expandedShape;
                                    f6 = f3;
                                    j4 = containerColor;
                                    long j12 = scrimColor;
                                    if2Var2 = le2.a;
                                    hh3Var2 = hh3VarRememberModalBottomSheetState;
                                    f5 = f4;
                                    j5 = jM2x310ea166;
                                    j6 = j12;
                                } else {
                                    ne1Var4 = ne1Var3;
                                    cVar4 = cVar3;
                                    hh3Var2 = hh3VarRememberModalBottomSheetState;
                                    i18 = i17;
                                    i19 = i4;
                                    f5 = f4;
                                    rg3Var2 = expandedShape;
                                    f6 = f3;
                                    j4 = containerColor;
                                    j5 = jM2x310ea166;
                                    j6 = scrimColor;
                                    if2Var2 = if2Var;
                                }
                            }
                            kk0Var2.s();
                            kk0Var = kk0Var2;
                            oe1 oe1Var4 = oe1Var2;
                            c cVar7 = cVar4;
                            hf2.m206x750f78f8(je1Var, cVar7, hh3Var2, f6, rg3Var2, j4, j5, f5, j6, ne1Var4, new jf2(windowInsets), if2Var2, oe1Var4, kk0Var, i19 & 2147483646, i18 & 1008, 0);
                            cVar5 = cVar7;
                            hh3Var3 = hh3Var2;
                            f7 = f6;
                            rg3Var3 = rg3Var2;
                            j7 = j4;
                            j8 = j5;
                            f8 = f5;
                            j9 = j6;
                            ne1Var5 = ne1Var4;
                            if2Var3 = if2Var2;
                            eVar2 = windowInsets;
                        } else {
                            kk0Var2.X();
                            if ((i & 1) != 0) {
                                if (i25 != 0) {
                                    cVar3 = c.i;
                                } else {
                                    cVar3 = cVar2;
                                }
                                if ((i3 & 4) != 0) {
                                    i4 &= -897;
                                    hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                                }
                                if (i5 != 0) {
                                    f3 = 640.0f;
                                } else {
                                    f3 = f;
                                }
                                i16 = i3 & 16;
                                owVar = ow.a;
                                if (i16 != 0) {
                                    expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                                    i4 &= -57345;
                                }
                                if ((i3 & 32) != 0) {
                                    containerColor = owVar.getContainerColor(kk0Var2, 6);
                                    i4 &= -458753;
                                }
                                if ((i3 & 64) != 0) {
                                    jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                                    i4 &= -3670017;
                                }
                                if (i7 != 0) {
                                    f4 = 0.0f;
                                } else {
                                    f4 = f2;
                                }
                                i17 = i14;
                                if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                    scrimColor = owVar.getScrimColor(kk0Var2, 6);
                                    i4 &= -234881025;
                                } else {
                                    scrimColor = j3;
                                }
                                if (i9 != 0) {
                                    ne1Var2 = fj0.a;
                                } else {
                                    ne1Var2 = ne1Var;
                                }
                                ne1Var3 = ne1Var2;
                                if ((i3 & 1024) != 0) {
                                    windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                                    i17 &= -15;
                                } else {
                                    windowInsets = eVar;
                                }
                                if (i12 != 0) {
                                    ne1Var4 = ne1Var3;
                                    cVar4 = cVar3;
                                    i18 = i17;
                                    i19 = i4;
                                    rg3Var2 = expandedShape;
                                    f6 = f3;
                                    j4 = containerColor;
                                    long j13 = scrimColor;
                                    if2Var2 = le2.a;
                                    hh3Var2 = hh3VarRememberModalBottomSheetState;
                                    f5 = f4;
                                    j5 = jM2x310ea166;
                                    j6 = j13;
                                } else {
                                    ne1Var4 = ne1Var3;
                                    cVar4 = cVar3;
                                    hh3Var2 = hh3VarRememberModalBottomSheetState;
                                    i18 = i17;
                                    i19 = i4;
                                    f5 = f4;
                                    rg3Var2 = expandedShape;
                                    f6 = f3;
                                    j4 = containerColor;
                                    j5 = jM2x310ea166;
                                    j6 = scrimColor;
                                    if2Var2 = if2Var;
                                }
                            } else {
                                if (i25 != 0) {
                                    cVar3 = c.i;
                                } else {
                                    cVar3 = cVar2;
                                }
                                if ((i3 & 4) != 0) {
                                    i4 &= -897;
                                    hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                                }
                                if (i5 != 0) {
                                    f3 = 640.0f;
                                } else {
                                    f3 = f;
                                }
                                i16 = i3 & 16;
                                owVar = ow.a;
                                if (i16 != 0) {
                                    expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                                    i4 &= -57345;
                                }
                                if ((i3 & 32) != 0) {
                                    containerColor = owVar.getContainerColor(kk0Var2, 6);
                                    i4 &= -458753;
                                }
                                if ((i3 & 64) != 0) {
                                    jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                                    i4 &= -3670017;
                                }
                                if (i7 != 0) {
                                    f4 = 0.0f;
                                } else {
                                    f4 = f2;
                                }
                                i17 = i14;
                                if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                    scrimColor = owVar.getScrimColor(kk0Var2, 6);
                                    i4 &= -234881025;
                                } else {
                                    scrimColor = j3;
                                }
                                if (i9 != 0) {
                                    ne1Var2 = fj0.a;
                                } else {
                                    ne1Var2 = ne1Var;
                                }
                                ne1Var3 = ne1Var2;
                                if ((i3 & 1024) != 0) {
                                    windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                                    i17 &= -15;
                                } else {
                                    windowInsets = eVar;
                                }
                                if (i12 != 0) {
                                    ne1Var4 = ne1Var3;
                                    cVar4 = cVar3;
                                    i18 = i17;
                                    i19 = i4;
                                    rg3Var2 = expandedShape;
                                    f6 = f3;
                                    j4 = containerColor;
                                    long j14 = scrimColor;
                                    if2Var2 = le2.a;
                                    hh3Var2 = hh3VarRememberModalBottomSheetState;
                                    f5 = f4;
                                    j5 = jM2x310ea166;
                                    j6 = j14;
                                } else {
                                    ne1Var4 = ne1Var3;
                                    cVar4 = cVar3;
                                    hh3Var2 = hh3VarRememberModalBottomSheetState;
                                    i18 = i17;
                                    i19 = i4;
                                    f5 = f4;
                                    rg3Var2 = expandedShape;
                                    f6 = f3;
                                    j4 = containerColor;
                                    j5 = jM2x310ea166;
                                    j6 = scrimColor;
                                    if2Var2 = if2Var;
                                }
                            }
                            kk0Var2.s();
                            kk0Var = kk0Var2;
                            oe1 oe1Var5 = oe1Var2;
                            c cVar8 = cVar4;
                            hf2.m206x750f78f8(je1Var, cVar8, hh3Var2, f6, rg3Var2, j4, j5, f5, j6, ne1Var4, new jf2(windowInsets), if2Var2, oe1Var5, kk0Var, i19 & 2147483646, i18 & 1008, 0);
                            cVar5 = cVar8;
                            hh3Var3 = hh3Var2;
                            f7 = f6;
                            rg3Var3 = rg3Var2;
                            j7 = j4;
                            j8 = j5;
                            f8 = f5;
                            j9 = j6;
                            ne1Var5 = ne1Var4;
                            if2Var3 = if2Var2;
                            eVar2 = windowInsets;
                        }
                        w33VarV = kk0Var.v();
                        if (w33VarV != null) {
                            w33VarV.updateScope(new xe2(je1Var, cVar5, hh3Var3, f7, rg3Var3, j7, j8, f8, j9, ne1Var5, eVar2, if2Var3, oe1Var, i, i2, i3, 1));
                        }
                    }
                    i4 |= 805306368;
                    if ((i2 & 6) == 0) {
                        i11 = i2 | (((i3 & 1024) == 0 || !kk0Var2.h(eVar)) ? 2 : 4);
                    } else {
                        i11 = i2;
                    }
                    i12 = i3 & 2048;
                    if (i12 != 0) {
                        i11 |= 48;
                    } else if ((i2 & 48) != 0) {
                        if (kk0Var2.h(if2Var)) {
                            i13 = 32;
                        } else {
                            i13 = 16;
                        }
                        i11 |= i13;
                    }
                    i14 = i11;
                    if ((i3 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
                        if ((i2 & 384) == 0) {
                            oe1Var2 = oe1Var;
                            if (kk0Var2.j(oe1Var2)) {
                                i15 = FontInfo.NUMBER_OF_CHAR_CODES;
                            } else {
                                i15 = Uuid.SIZE_BITS;
                            }
                            i14 |= i15;
                        }
                        if ((306783379 & i4) != 306783378) {
                            kk0Var2.X();
                            if ((i & 1) != 0) {
                                if (i25 != 0) {
                                    cVar3 = c.i;
                                } else {
                                    cVar3 = cVar2;
                                }
                                if ((i3 & 4) != 0) {
                                    i4 &= -897;
                                    hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                                }
                                if (i5 != 0) {
                                    f3 = 640.0f;
                                } else {
                                    f3 = f;
                                }
                                i16 = i3 & 16;
                                owVar = ow.a;
                                if (i16 != 0) {
                                    expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                                    i4 &= -57345;
                                }
                                if ((i3 & 32) != 0) {
                                    containerColor = owVar.getContainerColor(kk0Var2, 6);
                                    i4 &= -458753;
                                }
                                if ((i3 & 64) != 0) {
                                    jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                                    i4 &= -3670017;
                                }
                                if (i7 != 0) {
                                    f4 = 0.0f;
                                } else {
                                    f4 = f2;
                                }
                                i17 = i14;
                                if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                    scrimColor = owVar.getScrimColor(kk0Var2, 6);
                                    i4 &= -234881025;
                                } else {
                                    scrimColor = j3;
                                }
                                if (i9 != 0) {
                                    ne1Var2 = fj0.a;
                                } else {
                                    ne1Var2 = ne1Var;
                                }
                                ne1Var3 = ne1Var2;
                                if ((i3 & 1024) != 0) {
                                    windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                                    i17 &= -15;
                                } else {
                                    windowInsets = eVar;
                                }
                                if (i12 != 0) {
                                    ne1Var4 = ne1Var3;
                                    cVar4 = cVar3;
                                    i18 = i17;
                                    i19 = i4;
                                    rg3Var2 = expandedShape;
                                    f6 = f3;
                                    j4 = containerColor;
                                    long j15 = scrimColor;
                                    if2Var2 = le2.a;
                                    hh3Var2 = hh3VarRememberModalBottomSheetState;
                                    f5 = f4;
                                    j5 = jM2x310ea166;
                                    j6 = j15;
                                } else {
                                    ne1Var4 = ne1Var3;
                                    cVar4 = cVar3;
                                    hh3Var2 = hh3VarRememberModalBottomSheetState;
                                    i18 = i17;
                                    i19 = i4;
                                    f5 = f4;
                                    rg3Var2 = expandedShape;
                                    f6 = f3;
                                    j4 = containerColor;
                                    j5 = jM2x310ea166;
                                    j6 = scrimColor;
                                    if2Var2 = if2Var;
                                }
                            } else {
                                if (i25 != 0) {
                                    cVar3 = c.i;
                                } else {
                                    cVar3 = cVar2;
                                }
                                if ((i3 & 4) != 0) {
                                    i4 &= -897;
                                    hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                                }
                                if (i5 != 0) {
                                    f3 = 640.0f;
                                } else {
                                    f3 = f;
                                }
                                i16 = i3 & 16;
                                owVar = ow.a;
                                if (i16 != 0) {
                                    expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                                    i4 &= -57345;
                                }
                                if ((i3 & 32) != 0) {
                                    containerColor = owVar.getContainerColor(kk0Var2, 6);
                                    i4 &= -458753;
                                }
                                if ((i3 & 64) != 0) {
                                    jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                                    i4 &= -3670017;
                                }
                                if (i7 != 0) {
                                    f4 = 0.0f;
                                } else {
                                    f4 = f2;
                                }
                                i17 = i14;
                                if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                    scrimColor = owVar.getScrimColor(kk0Var2, 6);
                                    i4 &= -234881025;
                                } else {
                                    scrimColor = j3;
                                }
                                if (i9 != 0) {
                                    ne1Var2 = fj0.a;
                                } else {
                                    ne1Var2 = ne1Var;
                                }
                                ne1Var3 = ne1Var2;
                                if ((i3 & 1024) != 0) {
                                    windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                                    i17 &= -15;
                                } else {
                                    windowInsets = eVar;
                                }
                                if (i12 != 0) {
                                    ne1Var4 = ne1Var3;
                                    cVar4 = cVar3;
                                    i18 = i17;
                                    i19 = i4;
                                    rg3Var2 = expandedShape;
                                    f6 = f3;
                                    j4 = containerColor;
                                    long j16 = scrimColor;
                                    if2Var2 = le2.a;
                                    hh3Var2 = hh3VarRememberModalBottomSheetState;
                                    f5 = f4;
                                    j5 = jM2x310ea166;
                                    j6 = j16;
                                } else {
                                    ne1Var4 = ne1Var3;
                                    cVar4 = cVar3;
                                    hh3Var2 = hh3VarRememberModalBottomSheetState;
                                    i18 = i17;
                                    i19 = i4;
                                    f5 = f4;
                                    rg3Var2 = expandedShape;
                                    f6 = f3;
                                    j4 = containerColor;
                                    j5 = jM2x310ea166;
                                    j6 = scrimColor;
                                    if2Var2 = if2Var;
                                }
                            }
                            kk0Var2.s();
                            kk0Var = kk0Var2;
                            oe1 oe1Var6 = oe1Var2;
                            c cVar9 = cVar4;
                            hf2.m206x750f78f8(je1Var, cVar9, hh3Var2, f6, rg3Var2, j4, j5, f5, j6, ne1Var4, new jf2(windowInsets), if2Var2, oe1Var6, kk0Var, i19 & 2147483646, i18 & 1008, 0);
                            cVar5 = cVar9;
                            hh3Var3 = hh3Var2;
                            f7 = f6;
                            rg3Var3 = rg3Var2;
                            j7 = j4;
                            j8 = j5;
                            f8 = f5;
                            j9 = j6;
                            ne1Var5 = ne1Var4;
                            if2Var3 = if2Var2;
                            eVar2 = windowInsets;
                        } else {
                            kk0Var2.X();
                            if ((i & 1) != 0) {
                                if (i25 != 0) {
                                    cVar3 = c.i;
                                } else {
                                    cVar3 = cVar2;
                                }
                                if ((i3 & 4) != 0) {
                                    i4 &= -897;
                                    hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                                }
                                if (i5 != 0) {
                                    f3 = 640.0f;
                                } else {
                                    f3 = f;
                                }
                                i16 = i3 & 16;
                                owVar = ow.a;
                                if (i16 != 0) {
                                    expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                                    i4 &= -57345;
                                }
                                if ((i3 & 32) != 0) {
                                    containerColor = owVar.getContainerColor(kk0Var2, 6);
                                    i4 &= -458753;
                                }
                                if ((i3 & 64) != 0) {
                                    jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                                    i4 &= -3670017;
                                }
                                if (i7 != 0) {
                                    f4 = 0.0f;
                                } else {
                                    f4 = f2;
                                }
                                i17 = i14;
                                if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                    scrimColor = owVar.getScrimColor(kk0Var2, 6);
                                    i4 &= -234881025;
                                } else {
                                    scrimColor = j3;
                                }
                                if (i9 != 0) {
                                    ne1Var2 = fj0.a;
                                } else {
                                    ne1Var2 = ne1Var;
                                }
                                ne1Var3 = ne1Var2;
                                if ((i3 & 1024) != 0) {
                                    windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                                    i17 &= -15;
                                } else {
                                    windowInsets = eVar;
                                }
                                if (i12 != 0) {
                                    ne1Var4 = ne1Var3;
                                    cVar4 = cVar3;
                                    i18 = i17;
                                    i19 = i4;
                                    rg3Var2 = expandedShape;
                                    f6 = f3;
                                    j4 = containerColor;
                                    long j17 = scrimColor;
                                    if2Var2 = le2.a;
                                    hh3Var2 = hh3VarRememberModalBottomSheetState;
                                    f5 = f4;
                                    j5 = jM2x310ea166;
                                    j6 = j17;
                                } else {
                                    ne1Var4 = ne1Var3;
                                    cVar4 = cVar3;
                                    hh3Var2 = hh3VarRememberModalBottomSheetState;
                                    i18 = i17;
                                    i19 = i4;
                                    f5 = f4;
                                    rg3Var2 = expandedShape;
                                    f6 = f3;
                                    j4 = containerColor;
                                    j5 = jM2x310ea166;
                                    j6 = scrimColor;
                                    if2Var2 = if2Var;
                                }
                            } else {
                                if (i25 != 0) {
                                    cVar3 = c.i;
                                } else {
                                    cVar3 = cVar2;
                                }
                                if ((i3 & 4) != 0) {
                                    i4 &= -897;
                                    hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                                }
                                if (i5 != 0) {
                                    f3 = 640.0f;
                                } else {
                                    f3 = f;
                                }
                                i16 = i3 & 16;
                                owVar = ow.a;
                                if (i16 != 0) {
                                    expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                                    i4 &= -57345;
                                }
                                if ((i3 & 32) != 0) {
                                    containerColor = owVar.getContainerColor(kk0Var2, 6);
                                    i4 &= -458753;
                                }
                                if ((i3 & 64) != 0) {
                                    jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                                    i4 &= -3670017;
                                }
                                if (i7 != 0) {
                                    f4 = 0.0f;
                                } else {
                                    f4 = f2;
                                }
                                i17 = i14;
                                if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                    scrimColor = owVar.getScrimColor(kk0Var2, 6);
                                    i4 &= -234881025;
                                } else {
                                    scrimColor = j3;
                                }
                                if (i9 != 0) {
                                    ne1Var2 = fj0.a;
                                } else {
                                    ne1Var2 = ne1Var;
                                }
                                ne1Var3 = ne1Var2;
                                if ((i3 & 1024) != 0) {
                                    windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                                    i17 &= -15;
                                } else {
                                    windowInsets = eVar;
                                }
                                if (i12 != 0) {
                                    ne1Var4 = ne1Var3;
                                    cVar4 = cVar3;
                                    i18 = i17;
                                    i19 = i4;
                                    rg3Var2 = expandedShape;
                                    f6 = f3;
                                    j4 = containerColor;
                                    long j18 = scrimColor;
                                    if2Var2 = le2.a;
                                    hh3Var2 = hh3VarRememberModalBottomSheetState;
                                    f5 = f4;
                                    j5 = jM2x310ea166;
                                    j6 = j18;
                                } else {
                                    ne1Var4 = ne1Var3;
                                    cVar4 = cVar3;
                                    hh3Var2 = hh3VarRememberModalBottomSheetState;
                                    i18 = i17;
                                    i19 = i4;
                                    f5 = f4;
                                    rg3Var2 = expandedShape;
                                    f6 = f3;
                                    j4 = containerColor;
                                    j5 = jM2x310ea166;
                                    j6 = scrimColor;
                                    if2Var2 = if2Var;
                                }
                            }
                            kk0Var2.s();
                            kk0Var = kk0Var2;
                            oe1 oe1Var7 = oe1Var2;
                            c cVar10 = cVar4;
                            hf2.m206x750f78f8(je1Var, cVar10, hh3Var2, f6, rg3Var2, j4, j5, f5, j6, ne1Var4, new jf2(windowInsets), if2Var2, oe1Var7, kk0Var, i19 & 2147483646, i18 & 1008, 0);
                            cVar5 = cVar10;
                            hh3Var3 = hh3Var2;
                            f7 = f6;
                            rg3Var3 = rg3Var2;
                            j7 = j4;
                            j8 = j5;
                            f8 = f5;
                            j9 = j6;
                            ne1Var5 = ne1Var4;
                            if2Var3 = if2Var2;
                            eVar2 = windowInsets;
                        }
                        w33VarV = kk0Var.v();
                        if (w33VarV != null) {
                            w33VarV.updateScope(new xe2(je1Var, cVar5, hh3Var3, f7, rg3Var3, j7, j8, f8, j9, ne1Var5, eVar2, if2Var3, oe1Var, i, i2, i3, 1));
                        }
                    }
                    i14 |= 384;
                    oe1Var2 = oe1Var;
                    if ((306783379 & i4) != 306783378) {
                        kk0Var2.X();
                        if ((i & 1) != 0) {
                            if (i25 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if ((i3 & 4) != 0) {
                                i4 &= -897;
                                hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                            }
                            if (i5 != 0) {
                                f3 = 640.0f;
                            } else {
                                f3 = f;
                            }
                            i16 = i3 & 16;
                            owVar = ow.a;
                            if (i16 != 0) {
                                expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                                i4 &= -57345;
                            }
                            if ((i3 & 32) != 0) {
                                containerColor = owVar.getContainerColor(kk0Var2, 6);
                                i4 &= -458753;
                            }
                            if ((i3 & 64) != 0) {
                                jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                                i4 &= -3670017;
                            }
                            if (i7 != 0) {
                                f4 = 0.0f;
                            } else {
                                f4 = f2;
                            }
                            i17 = i14;
                            if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                scrimColor = owVar.getScrimColor(kk0Var2, 6);
                                i4 &= -234881025;
                            } else {
                                scrimColor = j3;
                            }
                            if (i9 != 0) {
                                ne1Var2 = fj0.a;
                            } else {
                                ne1Var2 = ne1Var;
                            }
                            ne1Var3 = ne1Var2;
                            if ((i3 & 1024) != 0) {
                                windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                                i17 &= -15;
                            } else {
                                windowInsets = eVar;
                            }
                            if (i12 != 0) {
                                ne1Var4 = ne1Var3;
                                cVar4 = cVar3;
                                i18 = i17;
                                i19 = i4;
                                rg3Var2 = expandedShape;
                                f6 = f3;
                                j4 = containerColor;
                                long j19 = scrimColor;
                                if2Var2 = le2.a;
                                hh3Var2 = hh3VarRememberModalBottomSheetState;
                                f5 = f4;
                                j5 = jM2x310ea166;
                                j6 = j19;
                            } else {
                                ne1Var4 = ne1Var3;
                                cVar4 = cVar3;
                                hh3Var2 = hh3VarRememberModalBottomSheetState;
                                i18 = i17;
                                i19 = i4;
                                f5 = f4;
                                rg3Var2 = expandedShape;
                                f6 = f3;
                                j4 = containerColor;
                                j5 = jM2x310ea166;
                                j6 = scrimColor;
                                if2Var2 = if2Var;
                            }
                        } else {
                            if (i25 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if ((i3 & 4) != 0) {
                                i4 &= -897;
                                hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                            }
                            if (i5 != 0) {
                                f3 = 640.0f;
                            } else {
                                f3 = f;
                            }
                            i16 = i3 & 16;
                            owVar = ow.a;
                            if (i16 != 0) {
                                expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                                i4 &= -57345;
                            }
                            if ((i3 & 32) != 0) {
                                containerColor = owVar.getContainerColor(kk0Var2, 6);
                                i4 &= -458753;
                            }
                            if ((i3 & 64) != 0) {
                                jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                                i4 &= -3670017;
                            }
                            if (i7 != 0) {
                                f4 = 0.0f;
                            } else {
                                f4 = f2;
                            }
                            i17 = i14;
                            if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                scrimColor = owVar.getScrimColor(kk0Var2, 6);
                                i4 &= -234881025;
                            } else {
                                scrimColor = j3;
                            }
                            if (i9 != 0) {
                                ne1Var2 = fj0.a;
                            } else {
                                ne1Var2 = ne1Var;
                            }
                            ne1Var3 = ne1Var2;
                            if ((i3 & 1024) != 0) {
                                windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                                i17 &= -15;
                            } else {
                                windowInsets = eVar;
                            }
                            if (i12 != 0) {
                                ne1Var4 = ne1Var3;
                                cVar4 = cVar3;
                                i18 = i17;
                                i19 = i4;
                                rg3Var2 = expandedShape;
                                f6 = f3;
                                j4 = containerColor;
                                long j110 = scrimColor;
                                if2Var2 = le2.a;
                                hh3Var2 = hh3VarRememberModalBottomSheetState;
                                f5 = f4;
                                j5 = jM2x310ea166;
                                j6 = j110;
                            } else {
                                ne1Var4 = ne1Var3;
                                cVar4 = cVar3;
                                hh3Var2 = hh3VarRememberModalBottomSheetState;
                                i18 = i17;
                                i19 = i4;
                                f5 = f4;
                                rg3Var2 = expandedShape;
                                f6 = f3;
                                j4 = containerColor;
                                j5 = jM2x310ea166;
                                j6 = scrimColor;
                                if2Var2 = if2Var;
                            }
                        }
                        kk0Var2.s();
                        kk0Var = kk0Var2;
                        oe1 oe1Var8 = oe1Var2;
                        c cVar11 = cVar4;
                        hf2.m206x750f78f8(je1Var, cVar11, hh3Var2, f6, rg3Var2, j4, j5, f5, j6, ne1Var4, new jf2(windowInsets), if2Var2, oe1Var8, kk0Var, i19 & 2147483646, i18 & 1008, 0);
                        cVar5 = cVar11;
                        hh3Var3 = hh3Var2;
                        f7 = f6;
                        rg3Var3 = rg3Var2;
                        j7 = j4;
                        j8 = j5;
                        f8 = f5;
                        j9 = j6;
                        ne1Var5 = ne1Var4;
                        if2Var3 = if2Var2;
                        eVar2 = windowInsets;
                    } else {
                        kk0Var2.X();
                        if ((i & 1) != 0) {
                            if (i25 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if ((i3 & 4) != 0) {
                                i4 &= -897;
                                hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                            }
                            if (i5 != 0) {
                                f3 = 640.0f;
                            } else {
                                f3 = f;
                            }
                            i16 = i3 & 16;
                            owVar = ow.a;
                            if (i16 != 0) {
                                expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                                i4 &= -57345;
                            }
                            if ((i3 & 32) != 0) {
                                containerColor = owVar.getContainerColor(kk0Var2, 6);
                                i4 &= -458753;
                            }
                            if ((i3 & 64) != 0) {
                                jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                                i4 &= -3670017;
                            }
                            if (i7 != 0) {
                                f4 = 0.0f;
                            } else {
                                f4 = f2;
                            }
                            i17 = i14;
                            if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                scrimColor = owVar.getScrimColor(kk0Var2, 6);
                                i4 &= -234881025;
                            } else {
                                scrimColor = j3;
                            }
                            if (i9 != 0) {
                                ne1Var2 = fj0.a;
                            } else {
                                ne1Var2 = ne1Var;
                            }
                            ne1Var3 = ne1Var2;
                            if ((i3 & 1024) != 0) {
                                windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                                i17 &= -15;
                            } else {
                                windowInsets = eVar;
                            }
                            if (i12 != 0) {
                                ne1Var4 = ne1Var3;
                                cVar4 = cVar3;
                                i18 = i17;
                                i19 = i4;
                                rg3Var2 = expandedShape;
                                f6 = f3;
                                j4 = containerColor;
                                long j111 = scrimColor;
                                if2Var2 = le2.a;
                                hh3Var2 = hh3VarRememberModalBottomSheetState;
                                f5 = f4;
                                j5 = jM2x310ea166;
                                j6 = j111;
                            } else {
                                ne1Var4 = ne1Var3;
                                cVar4 = cVar3;
                                hh3Var2 = hh3VarRememberModalBottomSheetState;
                                i18 = i17;
                                i19 = i4;
                                f5 = f4;
                                rg3Var2 = expandedShape;
                                f6 = f3;
                                j4 = containerColor;
                                j5 = jM2x310ea166;
                                j6 = scrimColor;
                                if2Var2 = if2Var;
                            }
                        } else {
                            if (i25 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if ((i3 & 4) != 0) {
                                i4 &= -897;
                                hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                            }
                            if (i5 != 0) {
                                f3 = 640.0f;
                            } else {
                                f3 = f;
                            }
                            i16 = i3 & 16;
                            owVar = ow.a;
                            if (i16 != 0) {
                                expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                                i4 &= -57345;
                            }
                            if ((i3 & 32) != 0) {
                                containerColor = owVar.getContainerColor(kk0Var2, 6);
                                i4 &= -458753;
                            }
                            if ((i3 & 64) != 0) {
                                jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                                i4 &= -3670017;
                            }
                            if (i7 != 0) {
                                f4 = 0.0f;
                            } else {
                                f4 = f2;
                            }
                            i17 = i14;
                            if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                scrimColor = owVar.getScrimColor(kk0Var2, 6);
                                i4 &= -234881025;
                            } else {
                                scrimColor = j3;
                            }
                            if (i9 != 0) {
                                ne1Var2 = fj0.a;
                            } else {
                                ne1Var2 = ne1Var;
                            }
                            ne1Var3 = ne1Var2;
                            if ((i3 & 1024) != 0) {
                                windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                                i17 &= -15;
                            } else {
                                windowInsets = eVar;
                            }
                            if (i12 != 0) {
                                ne1Var4 = ne1Var3;
                                cVar4 = cVar3;
                                i18 = i17;
                                i19 = i4;
                                rg3Var2 = expandedShape;
                                f6 = f3;
                                j4 = containerColor;
                                long j112 = scrimColor;
                                if2Var2 = le2.a;
                                hh3Var2 = hh3VarRememberModalBottomSheetState;
                                f5 = f4;
                                j5 = jM2x310ea166;
                                j6 = j112;
                            } else {
                                ne1Var4 = ne1Var3;
                                cVar4 = cVar3;
                                hh3Var2 = hh3VarRememberModalBottomSheetState;
                                i18 = i17;
                                i19 = i4;
                                f5 = f4;
                                rg3Var2 = expandedShape;
                                f6 = f3;
                                j4 = containerColor;
                                j5 = jM2x310ea166;
                                j6 = scrimColor;
                                if2Var2 = if2Var;
                            }
                        }
                        kk0Var2.s();
                        kk0Var = kk0Var2;
                        oe1 oe1Var9 = oe1Var2;
                        c cVar12 = cVar4;
                        hf2.m206x750f78f8(je1Var, cVar12, hh3Var2, f6, rg3Var2, j4, j5, f5, j6, ne1Var4, new jf2(windowInsets), if2Var2, oe1Var9, kk0Var, i19 & 2147483646, i18 & 1008, 0);
                        cVar5 = cVar12;
                        hh3Var3 = hh3Var2;
                        f7 = f6;
                        rg3Var3 = rg3Var2;
                        j7 = j4;
                        j8 = j5;
                        f8 = f5;
                        j9 = j6;
                        ne1Var5 = ne1Var4;
                        if2Var3 = if2Var2;
                        eVar2 = windowInsets;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new xe2(je1Var, cVar5, hh3Var3, f7, rg3Var3, j7, j8, f8, j9, ne1Var5, eVar2, if2Var3, oe1Var, i, i2, i3, 1));
                    }
                }
                i4 |= 12582912;
                if ((i & 100663296) != 0) {
                    if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) == 0) {
                        i20 = 33554432;
                    } else {
                        i20 = 33554432;
                    }
                    i4 |= i20;
                }
                i9 = i3 & ConstantsKt.MINIMUM_BLOCK_SIZE;
                if (i9 != 0) {
                    if ((i & 805306368) == 0) {
                        if (kk0Var2.j(ne1Var)) {
                            i10 = 536870912;
                        } else {
                            i10 = 268435456;
                        }
                        i4 |= i10;
                    }
                    if ((i2 & 6) == 0) {
                        i11 = i2 | (((i3 & 1024) == 0 || !kk0Var2.h(eVar)) ? 2 : 4);
                    } else {
                        i11 = i2;
                    }
                    i12 = i3 & 2048;
                    if (i12 != 0) {
                        i11 |= 48;
                    } else if ((i2 & 48) != 0) {
                        if (kk0Var2.h(if2Var)) {
                            i13 = 32;
                        } else {
                            i13 = 16;
                        }
                        i11 |= i13;
                    }
                    i14 = i11;
                    if ((i3 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
                        if ((i2 & 384) == 0) {
                            oe1Var2 = oe1Var;
                            if (kk0Var2.j(oe1Var2)) {
                                i15 = FontInfo.NUMBER_OF_CHAR_CODES;
                            } else {
                                i15 = Uuid.SIZE_BITS;
                            }
                            i14 |= i15;
                        }
                        if ((306783379 & i4) != 306783378) {
                            kk0Var2.X();
                            if ((i & 1) != 0) {
                                if (i25 != 0) {
                                    cVar3 = c.i;
                                } else {
                                    cVar3 = cVar2;
                                }
                                if ((i3 & 4) != 0) {
                                    i4 &= -897;
                                    hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                                }
                                if (i5 != 0) {
                                    f3 = 640.0f;
                                } else {
                                    f3 = f;
                                }
                                i16 = i3 & 16;
                                owVar = ow.a;
                                if (i16 != 0) {
                                    expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                                    i4 &= -57345;
                                }
                                if ((i3 & 32) != 0) {
                                    containerColor = owVar.getContainerColor(kk0Var2, 6);
                                    i4 &= -458753;
                                }
                                if ((i3 & 64) != 0) {
                                    jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                                    i4 &= -3670017;
                                }
                                if (i7 != 0) {
                                    f4 = 0.0f;
                                } else {
                                    f4 = f2;
                                }
                                i17 = i14;
                                if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                    scrimColor = owVar.getScrimColor(kk0Var2, 6);
                                    i4 &= -234881025;
                                } else {
                                    scrimColor = j3;
                                }
                                if (i9 != 0) {
                                    ne1Var2 = fj0.a;
                                } else {
                                    ne1Var2 = ne1Var;
                                }
                                ne1Var3 = ne1Var2;
                                if ((i3 & 1024) != 0) {
                                    windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                                    i17 &= -15;
                                } else {
                                    windowInsets = eVar;
                                }
                                if (i12 != 0) {
                                    ne1Var4 = ne1Var3;
                                    cVar4 = cVar3;
                                    i18 = i17;
                                    i19 = i4;
                                    rg3Var2 = expandedShape;
                                    f6 = f3;
                                    j4 = containerColor;
                                    long j113 = scrimColor;
                                    if2Var2 = le2.a;
                                    hh3Var2 = hh3VarRememberModalBottomSheetState;
                                    f5 = f4;
                                    j5 = jM2x310ea166;
                                    j6 = j113;
                                } else {
                                    ne1Var4 = ne1Var3;
                                    cVar4 = cVar3;
                                    hh3Var2 = hh3VarRememberModalBottomSheetState;
                                    i18 = i17;
                                    i19 = i4;
                                    f5 = f4;
                                    rg3Var2 = expandedShape;
                                    f6 = f3;
                                    j4 = containerColor;
                                    j5 = jM2x310ea166;
                                    j6 = scrimColor;
                                    if2Var2 = if2Var;
                                }
                            } else {
                                if (i25 != 0) {
                                    cVar3 = c.i;
                                } else {
                                    cVar3 = cVar2;
                                }
                                if ((i3 & 4) != 0) {
                                    i4 &= -897;
                                    hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                                }
                                if (i5 != 0) {
                                    f3 = 640.0f;
                                } else {
                                    f3 = f;
                                }
                                i16 = i3 & 16;
                                owVar = ow.a;
                                if (i16 != 0) {
                                    expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                                    i4 &= -57345;
                                }
                                if ((i3 & 32) != 0) {
                                    containerColor = owVar.getContainerColor(kk0Var2, 6);
                                    i4 &= -458753;
                                }
                                if ((i3 & 64) != 0) {
                                    jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                                    i4 &= -3670017;
                                }
                                if (i7 != 0) {
                                    f4 = 0.0f;
                                } else {
                                    f4 = f2;
                                }
                                i17 = i14;
                                if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                    scrimColor = owVar.getScrimColor(kk0Var2, 6);
                                    i4 &= -234881025;
                                } else {
                                    scrimColor = j3;
                                }
                                if (i9 != 0) {
                                    ne1Var2 = fj0.a;
                                } else {
                                    ne1Var2 = ne1Var;
                                }
                                ne1Var3 = ne1Var2;
                                if ((i3 & 1024) != 0) {
                                    windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                                    i17 &= -15;
                                } else {
                                    windowInsets = eVar;
                                }
                                if (i12 != 0) {
                                    ne1Var4 = ne1Var3;
                                    cVar4 = cVar3;
                                    i18 = i17;
                                    i19 = i4;
                                    rg3Var2 = expandedShape;
                                    f6 = f3;
                                    j4 = containerColor;
                                    long j114 = scrimColor;
                                    if2Var2 = le2.a;
                                    hh3Var2 = hh3VarRememberModalBottomSheetState;
                                    f5 = f4;
                                    j5 = jM2x310ea166;
                                    j6 = j114;
                                } else {
                                    ne1Var4 = ne1Var3;
                                    cVar4 = cVar3;
                                    hh3Var2 = hh3VarRememberModalBottomSheetState;
                                    i18 = i17;
                                    i19 = i4;
                                    f5 = f4;
                                    rg3Var2 = expandedShape;
                                    f6 = f3;
                                    j4 = containerColor;
                                    j5 = jM2x310ea166;
                                    j6 = scrimColor;
                                    if2Var2 = if2Var;
                                }
                            }
                            kk0Var2.s();
                            kk0Var = kk0Var2;
                            oe1 oe1Var10 = oe1Var2;
                            c cVar13 = cVar4;
                            hf2.m206x750f78f8(je1Var, cVar13, hh3Var2, f6, rg3Var2, j4, j5, f5, j6, ne1Var4, new jf2(windowInsets), if2Var2, oe1Var10, kk0Var, i19 & 2147483646, i18 & 1008, 0);
                            cVar5 = cVar13;
                            hh3Var3 = hh3Var2;
                            f7 = f6;
                            rg3Var3 = rg3Var2;
                            j7 = j4;
                            j8 = j5;
                            f8 = f5;
                            j9 = j6;
                            ne1Var5 = ne1Var4;
                            if2Var3 = if2Var2;
                            eVar2 = windowInsets;
                        } else {
                            kk0Var2.X();
                            if ((i & 1) != 0) {
                                if (i25 != 0) {
                                    cVar3 = c.i;
                                } else {
                                    cVar3 = cVar2;
                                }
                                if ((i3 & 4) != 0) {
                                    i4 &= -897;
                                    hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                                }
                                if (i5 != 0) {
                                    f3 = 640.0f;
                                } else {
                                    f3 = f;
                                }
                                i16 = i3 & 16;
                                owVar = ow.a;
                                if (i16 != 0) {
                                    expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                                    i4 &= -57345;
                                }
                                if ((i3 & 32) != 0) {
                                    containerColor = owVar.getContainerColor(kk0Var2, 6);
                                    i4 &= -458753;
                                }
                                if ((i3 & 64) != 0) {
                                    jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                                    i4 &= -3670017;
                                }
                                if (i7 != 0) {
                                    f4 = 0.0f;
                                } else {
                                    f4 = f2;
                                }
                                i17 = i14;
                                if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                    scrimColor = owVar.getScrimColor(kk0Var2, 6);
                                    i4 &= -234881025;
                                } else {
                                    scrimColor = j3;
                                }
                                if (i9 != 0) {
                                    ne1Var2 = fj0.a;
                                } else {
                                    ne1Var2 = ne1Var;
                                }
                                ne1Var3 = ne1Var2;
                                if ((i3 & 1024) != 0) {
                                    windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                                    i17 &= -15;
                                } else {
                                    windowInsets = eVar;
                                }
                                if (i12 != 0) {
                                    ne1Var4 = ne1Var3;
                                    cVar4 = cVar3;
                                    i18 = i17;
                                    i19 = i4;
                                    rg3Var2 = expandedShape;
                                    f6 = f3;
                                    j4 = containerColor;
                                    long j115 = scrimColor;
                                    if2Var2 = le2.a;
                                    hh3Var2 = hh3VarRememberModalBottomSheetState;
                                    f5 = f4;
                                    j5 = jM2x310ea166;
                                    j6 = j115;
                                } else {
                                    ne1Var4 = ne1Var3;
                                    cVar4 = cVar3;
                                    hh3Var2 = hh3VarRememberModalBottomSheetState;
                                    i18 = i17;
                                    i19 = i4;
                                    f5 = f4;
                                    rg3Var2 = expandedShape;
                                    f6 = f3;
                                    j4 = containerColor;
                                    j5 = jM2x310ea166;
                                    j6 = scrimColor;
                                    if2Var2 = if2Var;
                                }
                            } else {
                                if (i25 != 0) {
                                    cVar3 = c.i;
                                } else {
                                    cVar3 = cVar2;
                                }
                                if ((i3 & 4) != 0) {
                                    i4 &= -897;
                                    hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                                }
                                if (i5 != 0) {
                                    f3 = 640.0f;
                                } else {
                                    f3 = f;
                                }
                                i16 = i3 & 16;
                                owVar = ow.a;
                                if (i16 != 0) {
                                    expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                                    i4 &= -57345;
                                }
                                if ((i3 & 32) != 0) {
                                    containerColor = owVar.getContainerColor(kk0Var2, 6);
                                    i4 &= -458753;
                                }
                                if ((i3 & 64) != 0) {
                                    jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                                    i4 &= -3670017;
                                }
                                if (i7 != 0) {
                                    f4 = 0.0f;
                                } else {
                                    f4 = f2;
                                }
                                i17 = i14;
                                if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                    scrimColor = owVar.getScrimColor(kk0Var2, 6);
                                    i4 &= -234881025;
                                } else {
                                    scrimColor = j3;
                                }
                                if (i9 != 0) {
                                    ne1Var2 = fj0.a;
                                } else {
                                    ne1Var2 = ne1Var;
                                }
                                ne1Var3 = ne1Var2;
                                if ((i3 & 1024) != 0) {
                                    windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                                    i17 &= -15;
                                } else {
                                    windowInsets = eVar;
                                }
                                if (i12 != 0) {
                                    ne1Var4 = ne1Var3;
                                    cVar4 = cVar3;
                                    i18 = i17;
                                    i19 = i4;
                                    rg3Var2 = expandedShape;
                                    f6 = f3;
                                    j4 = containerColor;
                                    long j116 = scrimColor;
                                    if2Var2 = le2.a;
                                    hh3Var2 = hh3VarRememberModalBottomSheetState;
                                    f5 = f4;
                                    j5 = jM2x310ea166;
                                    j6 = j116;
                                } else {
                                    ne1Var4 = ne1Var3;
                                    cVar4 = cVar3;
                                    hh3Var2 = hh3VarRememberModalBottomSheetState;
                                    i18 = i17;
                                    i19 = i4;
                                    f5 = f4;
                                    rg3Var2 = expandedShape;
                                    f6 = f3;
                                    j4 = containerColor;
                                    j5 = jM2x310ea166;
                                    j6 = scrimColor;
                                    if2Var2 = if2Var;
                                }
                            }
                            kk0Var2.s();
                            kk0Var = kk0Var2;
                            oe1 oe1Var11 = oe1Var2;
                            c cVar14 = cVar4;
                            hf2.m206x750f78f8(je1Var, cVar14, hh3Var2, f6, rg3Var2, j4, j5, f5, j6, ne1Var4, new jf2(windowInsets), if2Var2, oe1Var11, kk0Var, i19 & 2147483646, i18 & 1008, 0);
                            cVar5 = cVar14;
                            hh3Var3 = hh3Var2;
                            f7 = f6;
                            rg3Var3 = rg3Var2;
                            j7 = j4;
                            j8 = j5;
                            f8 = f5;
                            j9 = j6;
                            ne1Var5 = ne1Var4;
                            if2Var3 = if2Var2;
                            eVar2 = windowInsets;
                        }
                        w33VarV = kk0Var.v();
                        if (w33VarV != null) {
                            w33VarV.updateScope(new xe2(je1Var, cVar5, hh3Var3, f7, rg3Var3, j7, j8, f8, j9, ne1Var5, eVar2, if2Var3, oe1Var, i, i2, i3, 1));
                        }
                    }
                    i14 |= 384;
                    oe1Var2 = oe1Var;
                    if ((306783379 & i4) != 306783378) {
                        kk0Var2.X();
                        if ((i & 1) != 0) {
                            if (i25 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if ((i3 & 4) != 0) {
                                i4 &= -897;
                                hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                            }
                            if (i5 != 0) {
                                f3 = 640.0f;
                            } else {
                                f3 = f;
                            }
                            i16 = i3 & 16;
                            owVar = ow.a;
                            if (i16 != 0) {
                                expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                                i4 &= -57345;
                            }
                            if ((i3 & 32) != 0) {
                                containerColor = owVar.getContainerColor(kk0Var2, 6);
                                i4 &= -458753;
                            }
                            if ((i3 & 64) != 0) {
                                jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                                i4 &= -3670017;
                            }
                            if (i7 != 0) {
                                f4 = 0.0f;
                            } else {
                                f4 = f2;
                            }
                            i17 = i14;
                            if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                scrimColor = owVar.getScrimColor(kk0Var2, 6);
                                i4 &= -234881025;
                            } else {
                                scrimColor = j3;
                            }
                            if (i9 != 0) {
                                ne1Var2 = fj0.a;
                            } else {
                                ne1Var2 = ne1Var;
                            }
                            ne1Var3 = ne1Var2;
                            if ((i3 & 1024) != 0) {
                                windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                                i17 &= -15;
                            } else {
                                windowInsets = eVar;
                            }
                            if (i12 != 0) {
                                ne1Var4 = ne1Var3;
                                cVar4 = cVar3;
                                i18 = i17;
                                i19 = i4;
                                rg3Var2 = expandedShape;
                                f6 = f3;
                                j4 = containerColor;
                                long j117 = scrimColor;
                                if2Var2 = le2.a;
                                hh3Var2 = hh3VarRememberModalBottomSheetState;
                                f5 = f4;
                                j5 = jM2x310ea166;
                                j6 = j117;
                            } else {
                                ne1Var4 = ne1Var3;
                                cVar4 = cVar3;
                                hh3Var2 = hh3VarRememberModalBottomSheetState;
                                i18 = i17;
                                i19 = i4;
                                f5 = f4;
                                rg3Var2 = expandedShape;
                                f6 = f3;
                                j4 = containerColor;
                                j5 = jM2x310ea166;
                                j6 = scrimColor;
                                if2Var2 = if2Var;
                            }
                        } else {
                            if (i25 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if ((i3 & 4) != 0) {
                                i4 &= -897;
                                hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                            }
                            if (i5 != 0) {
                                f3 = 640.0f;
                            } else {
                                f3 = f;
                            }
                            i16 = i3 & 16;
                            owVar = ow.a;
                            if (i16 != 0) {
                                expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                                i4 &= -57345;
                            }
                            if ((i3 & 32) != 0) {
                                containerColor = owVar.getContainerColor(kk0Var2, 6);
                                i4 &= -458753;
                            }
                            if ((i3 & 64) != 0) {
                                jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                                i4 &= -3670017;
                            }
                            if (i7 != 0) {
                                f4 = 0.0f;
                            } else {
                                f4 = f2;
                            }
                            i17 = i14;
                            if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                scrimColor = owVar.getScrimColor(kk0Var2, 6);
                                i4 &= -234881025;
                            } else {
                                scrimColor = j3;
                            }
                            if (i9 != 0) {
                                ne1Var2 = fj0.a;
                            } else {
                                ne1Var2 = ne1Var;
                            }
                            ne1Var3 = ne1Var2;
                            if ((i3 & 1024) != 0) {
                                windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                                i17 &= -15;
                            } else {
                                windowInsets = eVar;
                            }
                            if (i12 != 0) {
                                ne1Var4 = ne1Var3;
                                cVar4 = cVar3;
                                i18 = i17;
                                i19 = i4;
                                rg3Var2 = expandedShape;
                                f6 = f3;
                                j4 = containerColor;
                                long j118 = scrimColor;
                                if2Var2 = le2.a;
                                hh3Var2 = hh3VarRememberModalBottomSheetState;
                                f5 = f4;
                                j5 = jM2x310ea166;
                                j6 = j118;
                            } else {
                                ne1Var4 = ne1Var3;
                                cVar4 = cVar3;
                                hh3Var2 = hh3VarRememberModalBottomSheetState;
                                i18 = i17;
                                i19 = i4;
                                f5 = f4;
                                rg3Var2 = expandedShape;
                                f6 = f3;
                                j4 = containerColor;
                                j5 = jM2x310ea166;
                                j6 = scrimColor;
                                if2Var2 = if2Var;
                            }
                        }
                        kk0Var2.s();
                        kk0Var = kk0Var2;
                        oe1 oe1Var12 = oe1Var2;
                        c cVar15 = cVar4;
                        hf2.m206x750f78f8(je1Var, cVar15, hh3Var2, f6, rg3Var2, j4, j5, f5, j6, ne1Var4, new jf2(windowInsets), if2Var2, oe1Var12, kk0Var, i19 & 2147483646, i18 & 1008, 0);
                        cVar5 = cVar15;
                        hh3Var3 = hh3Var2;
                        f7 = f6;
                        rg3Var3 = rg3Var2;
                        j7 = j4;
                        j8 = j5;
                        f8 = f5;
                        j9 = j6;
                        ne1Var5 = ne1Var4;
                        if2Var3 = if2Var2;
                        eVar2 = windowInsets;
                    } else {
                        kk0Var2.X();
                        if ((i & 1) != 0) {
                            if (i25 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if ((i3 & 4) != 0) {
                                i4 &= -897;
                                hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                            }
                            if (i5 != 0) {
                                f3 = 640.0f;
                            } else {
                                f3 = f;
                            }
                            i16 = i3 & 16;
                            owVar = ow.a;
                            if (i16 != 0) {
                                expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                                i4 &= -57345;
                            }
                            if ((i3 & 32) != 0) {
                                containerColor = owVar.getContainerColor(kk0Var2, 6);
                                i4 &= -458753;
                            }
                            if ((i3 & 64) != 0) {
                                jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                                i4 &= -3670017;
                            }
                            if (i7 != 0) {
                                f4 = 0.0f;
                            } else {
                                f4 = f2;
                            }
                            i17 = i14;
                            if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                scrimColor = owVar.getScrimColor(kk0Var2, 6);
                                i4 &= -234881025;
                            } else {
                                scrimColor = j3;
                            }
                            if (i9 != 0) {
                                ne1Var2 = fj0.a;
                            } else {
                                ne1Var2 = ne1Var;
                            }
                            ne1Var3 = ne1Var2;
                            if ((i3 & 1024) != 0) {
                                windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                                i17 &= -15;
                            } else {
                                windowInsets = eVar;
                            }
                            if (i12 != 0) {
                                ne1Var4 = ne1Var3;
                                cVar4 = cVar3;
                                i18 = i17;
                                i19 = i4;
                                rg3Var2 = expandedShape;
                                f6 = f3;
                                j4 = containerColor;
                                long j119 = scrimColor;
                                if2Var2 = le2.a;
                                hh3Var2 = hh3VarRememberModalBottomSheetState;
                                f5 = f4;
                                j5 = jM2x310ea166;
                                j6 = j119;
                            } else {
                                ne1Var4 = ne1Var3;
                                cVar4 = cVar3;
                                hh3Var2 = hh3VarRememberModalBottomSheetState;
                                i18 = i17;
                                i19 = i4;
                                f5 = f4;
                                rg3Var2 = expandedShape;
                                f6 = f3;
                                j4 = containerColor;
                                j5 = jM2x310ea166;
                                j6 = scrimColor;
                                if2Var2 = if2Var;
                            }
                        } else {
                            if (i25 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if ((i3 & 4) != 0) {
                                i4 &= -897;
                                hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                            }
                            if (i5 != 0) {
                                f3 = 640.0f;
                            } else {
                                f3 = f;
                            }
                            i16 = i3 & 16;
                            owVar = ow.a;
                            if (i16 != 0) {
                                expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                                i4 &= -57345;
                            }
                            if ((i3 & 32) != 0) {
                                containerColor = owVar.getContainerColor(kk0Var2, 6);
                                i4 &= -458753;
                            }
                            if ((i3 & 64) != 0) {
                                jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                                i4 &= -3670017;
                            }
                            if (i7 != 0) {
                                f4 = 0.0f;
                            } else {
                                f4 = f2;
                            }
                            i17 = i14;
                            if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                scrimColor = owVar.getScrimColor(kk0Var2, 6);
                                i4 &= -234881025;
                            } else {
                                scrimColor = j3;
                            }
                            if (i9 != 0) {
                                ne1Var2 = fj0.a;
                            } else {
                                ne1Var2 = ne1Var;
                            }
                            ne1Var3 = ne1Var2;
                            if ((i3 & 1024) != 0) {
                                windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                                i17 &= -15;
                            } else {
                                windowInsets = eVar;
                            }
                            if (i12 != 0) {
                                ne1Var4 = ne1Var3;
                                cVar4 = cVar3;
                                i18 = i17;
                                i19 = i4;
                                rg3Var2 = expandedShape;
                                f6 = f3;
                                j4 = containerColor;
                                long j1110 = scrimColor;
                                if2Var2 = le2.a;
                                hh3Var2 = hh3VarRememberModalBottomSheetState;
                                f5 = f4;
                                j5 = jM2x310ea166;
                                j6 = j1110;
                            } else {
                                ne1Var4 = ne1Var3;
                                cVar4 = cVar3;
                                hh3Var2 = hh3VarRememberModalBottomSheetState;
                                i18 = i17;
                                i19 = i4;
                                f5 = f4;
                                rg3Var2 = expandedShape;
                                f6 = f3;
                                j4 = containerColor;
                                j5 = jM2x310ea166;
                                j6 = scrimColor;
                                if2Var2 = if2Var;
                            }
                        }
                        kk0Var2.s();
                        kk0Var = kk0Var2;
                        oe1 oe1Var13 = oe1Var2;
                        c cVar16 = cVar4;
                        hf2.m206x750f78f8(je1Var, cVar16, hh3Var2, f6, rg3Var2, j4, j5, f5, j6, ne1Var4, new jf2(windowInsets), if2Var2, oe1Var13, kk0Var, i19 & 2147483646, i18 & 1008, 0);
                        cVar5 = cVar16;
                        hh3Var3 = hh3Var2;
                        f7 = f6;
                        rg3Var3 = rg3Var2;
                        j7 = j4;
                        j8 = j5;
                        f8 = f5;
                        j9 = j6;
                        ne1Var5 = ne1Var4;
                        if2Var3 = if2Var2;
                        eVar2 = windowInsets;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new xe2(je1Var, cVar5, hh3Var3, f7, rg3Var3, j7, j8, f8, j9, ne1Var5, eVar2, if2Var3, oe1Var, i, i2, i3, 1));
                    }
                }
                i4 |= 805306368;
                if ((i2 & 6) == 0) {
                    i11 = i2 | (((i3 & 1024) == 0 || !kk0Var2.h(eVar)) ? 2 : 4);
                } else {
                    i11 = i2;
                }
                i12 = i3 & 2048;
                if (i12 != 0) {
                    i11 |= 48;
                } else if ((i2 & 48) != 0) {
                    if (kk0Var2.h(if2Var)) {
                        i13 = 32;
                    } else {
                        i13 = 16;
                    }
                    i11 |= i13;
                }
                i14 = i11;
                if ((i3 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
                    if ((i2 & 384) == 0) {
                        oe1Var2 = oe1Var;
                        if (kk0Var2.j(oe1Var2)) {
                            i15 = FontInfo.NUMBER_OF_CHAR_CODES;
                        } else {
                            i15 = Uuid.SIZE_BITS;
                        }
                        i14 |= i15;
                    }
                    if ((306783379 & i4) != 306783378) {
                        kk0Var2.X();
                        if ((i & 1) != 0) {
                            if (i25 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if ((i3 & 4) != 0) {
                                i4 &= -897;
                                hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                            }
                            if (i5 != 0) {
                                f3 = 640.0f;
                            } else {
                                f3 = f;
                            }
                            i16 = i3 & 16;
                            owVar = ow.a;
                            if (i16 != 0) {
                                expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                                i4 &= -57345;
                            }
                            if ((i3 & 32) != 0) {
                                containerColor = owVar.getContainerColor(kk0Var2, 6);
                                i4 &= -458753;
                            }
                            if ((i3 & 64) != 0) {
                                jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                                i4 &= -3670017;
                            }
                            if (i7 != 0) {
                                f4 = 0.0f;
                            } else {
                                f4 = f2;
                            }
                            i17 = i14;
                            if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                scrimColor = owVar.getScrimColor(kk0Var2, 6);
                                i4 &= -234881025;
                            } else {
                                scrimColor = j3;
                            }
                            if (i9 != 0) {
                                ne1Var2 = fj0.a;
                            } else {
                                ne1Var2 = ne1Var;
                            }
                            ne1Var3 = ne1Var2;
                            if ((i3 & 1024) != 0) {
                                windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                                i17 &= -15;
                            } else {
                                windowInsets = eVar;
                            }
                            if (i12 != 0) {
                                ne1Var4 = ne1Var3;
                                cVar4 = cVar3;
                                i18 = i17;
                                i19 = i4;
                                rg3Var2 = expandedShape;
                                f6 = f3;
                                j4 = containerColor;
                                long j1111 = scrimColor;
                                if2Var2 = le2.a;
                                hh3Var2 = hh3VarRememberModalBottomSheetState;
                                f5 = f4;
                                j5 = jM2x310ea166;
                                j6 = j1111;
                            } else {
                                ne1Var4 = ne1Var3;
                                cVar4 = cVar3;
                                hh3Var2 = hh3VarRememberModalBottomSheetState;
                                i18 = i17;
                                i19 = i4;
                                f5 = f4;
                                rg3Var2 = expandedShape;
                                f6 = f3;
                                j4 = containerColor;
                                j5 = jM2x310ea166;
                                j6 = scrimColor;
                                if2Var2 = if2Var;
                            }
                        } else {
                            if (i25 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if ((i3 & 4) != 0) {
                                i4 &= -897;
                                hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                            }
                            if (i5 != 0) {
                                f3 = 640.0f;
                            } else {
                                f3 = f;
                            }
                            i16 = i3 & 16;
                            owVar = ow.a;
                            if (i16 != 0) {
                                expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                                i4 &= -57345;
                            }
                            if ((i3 & 32) != 0) {
                                containerColor = owVar.getContainerColor(kk0Var2, 6);
                                i4 &= -458753;
                            }
                            if ((i3 & 64) != 0) {
                                jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                                i4 &= -3670017;
                            }
                            if (i7 != 0) {
                                f4 = 0.0f;
                            } else {
                                f4 = f2;
                            }
                            i17 = i14;
                            if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                scrimColor = owVar.getScrimColor(kk0Var2, 6);
                                i4 &= -234881025;
                            } else {
                                scrimColor = j3;
                            }
                            if (i9 != 0) {
                                ne1Var2 = fj0.a;
                            } else {
                                ne1Var2 = ne1Var;
                            }
                            ne1Var3 = ne1Var2;
                            if ((i3 & 1024) != 0) {
                                windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                                i17 &= -15;
                            } else {
                                windowInsets = eVar;
                            }
                            if (i12 != 0) {
                                ne1Var4 = ne1Var3;
                                cVar4 = cVar3;
                                i18 = i17;
                                i19 = i4;
                                rg3Var2 = expandedShape;
                                f6 = f3;
                                j4 = containerColor;
                                long j1112 = scrimColor;
                                if2Var2 = le2.a;
                                hh3Var2 = hh3VarRememberModalBottomSheetState;
                                f5 = f4;
                                j5 = jM2x310ea166;
                                j6 = j1112;
                            } else {
                                ne1Var4 = ne1Var3;
                                cVar4 = cVar3;
                                hh3Var2 = hh3VarRememberModalBottomSheetState;
                                i18 = i17;
                                i19 = i4;
                                f5 = f4;
                                rg3Var2 = expandedShape;
                                f6 = f3;
                                j4 = containerColor;
                                j5 = jM2x310ea166;
                                j6 = scrimColor;
                                if2Var2 = if2Var;
                            }
                        }
                        kk0Var2.s();
                        kk0Var = kk0Var2;
                        oe1 oe1Var14 = oe1Var2;
                        c cVar17 = cVar4;
                        hf2.m206x750f78f8(je1Var, cVar17, hh3Var2, f6, rg3Var2, j4, j5, f5, j6, ne1Var4, new jf2(windowInsets), if2Var2, oe1Var14, kk0Var, i19 & 2147483646, i18 & 1008, 0);
                        cVar5 = cVar17;
                        hh3Var3 = hh3Var2;
                        f7 = f6;
                        rg3Var3 = rg3Var2;
                        j7 = j4;
                        j8 = j5;
                        f8 = f5;
                        j9 = j6;
                        ne1Var5 = ne1Var4;
                        if2Var3 = if2Var2;
                        eVar2 = windowInsets;
                    } else {
                        kk0Var2.X();
                        if ((i & 1) != 0) {
                            if (i25 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if ((i3 & 4) != 0) {
                                i4 &= -897;
                                hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                            }
                            if (i5 != 0) {
                                f3 = 640.0f;
                            } else {
                                f3 = f;
                            }
                            i16 = i3 & 16;
                            owVar = ow.a;
                            if (i16 != 0) {
                                expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                                i4 &= -57345;
                            }
                            if ((i3 & 32) != 0) {
                                containerColor = owVar.getContainerColor(kk0Var2, 6);
                                i4 &= -458753;
                            }
                            if ((i3 & 64) != 0) {
                                jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                                i4 &= -3670017;
                            }
                            if (i7 != 0) {
                                f4 = 0.0f;
                            } else {
                                f4 = f2;
                            }
                            i17 = i14;
                            if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                scrimColor = owVar.getScrimColor(kk0Var2, 6);
                                i4 &= -234881025;
                            } else {
                                scrimColor = j3;
                            }
                            if (i9 != 0) {
                                ne1Var2 = fj0.a;
                            } else {
                                ne1Var2 = ne1Var;
                            }
                            ne1Var3 = ne1Var2;
                            if ((i3 & 1024) != 0) {
                                windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                                i17 &= -15;
                            } else {
                                windowInsets = eVar;
                            }
                            if (i12 != 0) {
                                ne1Var4 = ne1Var3;
                                cVar4 = cVar3;
                                i18 = i17;
                                i19 = i4;
                                rg3Var2 = expandedShape;
                                f6 = f3;
                                j4 = containerColor;
                                long j1113 = scrimColor;
                                if2Var2 = le2.a;
                                hh3Var2 = hh3VarRememberModalBottomSheetState;
                                f5 = f4;
                                j5 = jM2x310ea166;
                                j6 = j1113;
                            } else {
                                ne1Var4 = ne1Var3;
                                cVar4 = cVar3;
                                hh3Var2 = hh3VarRememberModalBottomSheetState;
                                i18 = i17;
                                i19 = i4;
                                f5 = f4;
                                rg3Var2 = expandedShape;
                                f6 = f3;
                                j4 = containerColor;
                                j5 = jM2x310ea166;
                                j6 = scrimColor;
                                if2Var2 = if2Var;
                            }
                        } else {
                            if (i25 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if ((i3 & 4) != 0) {
                                i4 &= -897;
                                hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                            }
                            if (i5 != 0) {
                                f3 = 640.0f;
                            } else {
                                f3 = f;
                            }
                            i16 = i3 & 16;
                            owVar = ow.a;
                            if (i16 != 0) {
                                expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                                i4 &= -57345;
                            }
                            if ((i3 & 32) != 0) {
                                containerColor = owVar.getContainerColor(kk0Var2, 6);
                                i4 &= -458753;
                            }
                            if ((i3 & 64) != 0) {
                                jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                                i4 &= -3670017;
                            }
                            if (i7 != 0) {
                                f4 = 0.0f;
                            } else {
                                f4 = f2;
                            }
                            i17 = i14;
                            if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                scrimColor = owVar.getScrimColor(kk0Var2, 6);
                                i4 &= -234881025;
                            } else {
                                scrimColor = j3;
                            }
                            if (i9 != 0) {
                                ne1Var2 = fj0.a;
                            } else {
                                ne1Var2 = ne1Var;
                            }
                            ne1Var3 = ne1Var2;
                            if ((i3 & 1024) != 0) {
                                windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                                i17 &= -15;
                            } else {
                                windowInsets = eVar;
                            }
                            if (i12 != 0) {
                                ne1Var4 = ne1Var3;
                                cVar4 = cVar3;
                                i18 = i17;
                                i19 = i4;
                                rg3Var2 = expandedShape;
                                f6 = f3;
                                j4 = containerColor;
                                long j1114 = scrimColor;
                                if2Var2 = le2.a;
                                hh3Var2 = hh3VarRememberModalBottomSheetState;
                                f5 = f4;
                                j5 = jM2x310ea166;
                                j6 = j1114;
                            } else {
                                ne1Var4 = ne1Var3;
                                cVar4 = cVar3;
                                hh3Var2 = hh3VarRememberModalBottomSheetState;
                                i18 = i17;
                                i19 = i4;
                                f5 = f4;
                                rg3Var2 = expandedShape;
                                f6 = f3;
                                j4 = containerColor;
                                j5 = jM2x310ea166;
                                j6 = scrimColor;
                                if2Var2 = if2Var;
                            }
                        }
                        kk0Var2.s();
                        kk0Var = kk0Var2;
                        oe1 oe1Var15 = oe1Var2;
                        c cVar18 = cVar4;
                        hf2.m206x750f78f8(je1Var, cVar18, hh3Var2, f6, rg3Var2, j4, j5, f5, j6, ne1Var4, new jf2(windowInsets), if2Var2, oe1Var15, kk0Var, i19 & 2147483646, i18 & 1008, 0);
                        cVar5 = cVar18;
                        hh3Var3 = hh3Var2;
                        f7 = f6;
                        rg3Var3 = rg3Var2;
                        j7 = j4;
                        j8 = j5;
                        f8 = f5;
                        j9 = j6;
                        ne1Var5 = ne1Var4;
                        if2Var3 = if2Var2;
                        eVar2 = windowInsets;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new xe2(je1Var, cVar5, hh3Var3, f7, rg3Var3, j7, j8, f8, j9, ne1Var5, eVar2, if2Var3, oe1Var, i, i2, i3, 1));
                    }
                }
                i14 |= 384;
                oe1Var2 = oe1Var;
                if ((306783379 & i4) != 306783378) {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i25 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                            hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                        }
                        if (i5 != 0) {
                            f3 = 640.0f;
                        } else {
                            f3 = f;
                        }
                        i16 = i3 & 16;
                        owVar = ow.a;
                        if (i16 != 0) {
                            expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                            i4 &= -57345;
                        }
                        if ((i3 & 32) != 0) {
                            containerColor = owVar.getContainerColor(kk0Var2, 6);
                            i4 &= -458753;
                        }
                        if ((i3 & 64) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                            i4 &= -3670017;
                        }
                        if (i7 != 0) {
                            f4 = 0.0f;
                        } else {
                            f4 = f2;
                        }
                        i17 = i14;
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            scrimColor = owVar.getScrimColor(kk0Var2, 6);
                            i4 &= -234881025;
                        } else {
                            scrimColor = j3;
                        }
                        if (i9 != 0) {
                            ne1Var2 = fj0.a;
                        } else {
                            ne1Var2 = ne1Var;
                        }
                        ne1Var3 = ne1Var2;
                        if ((i3 & 1024) != 0) {
                            windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                            i17 &= -15;
                        } else {
                            windowInsets = eVar;
                        }
                        if (i12 != 0) {
                            ne1Var4 = ne1Var3;
                            cVar4 = cVar3;
                            i18 = i17;
                            i19 = i4;
                            rg3Var2 = expandedShape;
                            f6 = f3;
                            j4 = containerColor;
                            long j1115 = scrimColor;
                            if2Var2 = le2.a;
                            hh3Var2 = hh3VarRememberModalBottomSheetState;
                            f5 = f4;
                            j5 = jM2x310ea166;
                            j6 = j1115;
                        } else {
                            ne1Var4 = ne1Var3;
                            cVar4 = cVar3;
                            hh3Var2 = hh3VarRememberModalBottomSheetState;
                            i18 = i17;
                            i19 = i4;
                            f5 = f4;
                            rg3Var2 = expandedShape;
                            f6 = f3;
                            j4 = containerColor;
                            j5 = jM2x310ea166;
                            j6 = scrimColor;
                            if2Var2 = if2Var;
                        }
                    } else {
                        if (i25 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                            hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                        }
                        if (i5 != 0) {
                            f3 = 640.0f;
                        } else {
                            f3 = f;
                        }
                        i16 = i3 & 16;
                        owVar = ow.a;
                        if (i16 != 0) {
                            expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                            i4 &= -57345;
                        }
                        if ((i3 & 32) != 0) {
                            containerColor = owVar.getContainerColor(kk0Var2, 6);
                            i4 &= -458753;
                        }
                        if ((i3 & 64) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                            i4 &= -3670017;
                        }
                        if (i7 != 0) {
                            f4 = 0.0f;
                        } else {
                            f4 = f2;
                        }
                        i17 = i14;
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            scrimColor = owVar.getScrimColor(kk0Var2, 6);
                            i4 &= -234881025;
                        } else {
                            scrimColor = j3;
                        }
                        if (i9 != 0) {
                            ne1Var2 = fj0.a;
                        } else {
                            ne1Var2 = ne1Var;
                        }
                        ne1Var3 = ne1Var2;
                        if ((i3 & 1024) != 0) {
                            windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                            i17 &= -15;
                        } else {
                            windowInsets = eVar;
                        }
                        if (i12 != 0) {
                            ne1Var4 = ne1Var3;
                            cVar4 = cVar3;
                            i18 = i17;
                            i19 = i4;
                            rg3Var2 = expandedShape;
                            f6 = f3;
                            j4 = containerColor;
                            long j1116 = scrimColor;
                            if2Var2 = le2.a;
                            hh3Var2 = hh3VarRememberModalBottomSheetState;
                            f5 = f4;
                            j5 = jM2x310ea166;
                            j6 = j1116;
                        } else {
                            ne1Var4 = ne1Var3;
                            cVar4 = cVar3;
                            hh3Var2 = hh3VarRememberModalBottomSheetState;
                            i18 = i17;
                            i19 = i4;
                            f5 = f4;
                            rg3Var2 = expandedShape;
                            f6 = f3;
                            j4 = containerColor;
                            j5 = jM2x310ea166;
                            j6 = scrimColor;
                            if2Var2 = if2Var;
                        }
                    }
                    kk0Var2.s();
                    kk0Var = kk0Var2;
                    oe1 oe1Var16 = oe1Var2;
                    c cVar19 = cVar4;
                    hf2.m206x750f78f8(je1Var, cVar19, hh3Var2, f6, rg3Var2, j4, j5, f5, j6, ne1Var4, new jf2(windowInsets), if2Var2, oe1Var16, kk0Var, i19 & 2147483646, i18 & 1008, 0);
                    cVar5 = cVar19;
                    hh3Var3 = hh3Var2;
                    f7 = f6;
                    rg3Var3 = rg3Var2;
                    j7 = j4;
                    j8 = j5;
                    f8 = f5;
                    j9 = j6;
                    ne1Var5 = ne1Var4;
                    if2Var3 = if2Var2;
                    eVar2 = windowInsets;
                } else {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i25 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                            hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                        }
                        if (i5 != 0) {
                            f3 = 640.0f;
                        } else {
                            f3 = f;
                        }
                        i16 = i3 & 16;
                        owVar = ow.a;
                        if (i16 != 0) {
                            expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                            i4 &= -57345;
                        }
                        if ((i3 & 32) != 0) {
                            containerColor = owVar.getContainerColor(kk0Var2, 6);
                            i4 &= -458753;
                        }
                        if ((i3 & 64) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                            i4 &= -3670017;
                        }
                        if (i7 != 0) {
                            f4 = 0.0f;
                        } else {
                            f4 = f2;
                        }
                        i17 = i14;
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            scrimColor = owVar.getScrimColor(kk0Var2, 6);
                            i4 &= -234881025;
                        } else {
                            scrimColor = j3;
                        }
                        if (i9 != 0) {
                            ne1Var2 = fj0.a;
                        } else {
                            ne1Var2 = ne1Var;
                        }
                        ne1Var3 = ne1Var2;
                        if ((i3 & 1024) != 0) {
                            windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                            i17 &= -15;
                        } else {
                            windowInsets = eVar;
                        }
                        if (i12 != 0) {
                            ne1Var4 = ne1Var3;
                            cVar4 = cVar3;
                            i18 = i17;
                            i19 = i4;
                            rg3Var2 = expandedShape;
                            f6 = f3;
                            j4 = containerColor;
                            long j1117 = scrimColor;
                            if2Var2 = le2.a;
                            hh3Var2 = hh3VarRememberModalBottomSheetState;
                            f5 = f4;
                            j5 = jM2x310ea166;
                            j6 = j1117;
                        } else {
                            ne1Var4 = ne1Var3;
                            cVar4 = cVar3;
                            hh3Var2 = hh3VarRememberModalBottomSheetState;
                            i18 = i17;
                            i19 = i4;
                            f5 = f4;
                            rg3Var2 = expandedShape;
                            f6 = f3;
                            j4 = containerColor;
                            j5 = jM2x310ea166;
                            j6 = scrimColor;
                            if2Var2 = if2Var;
                        }
                    } else {
                        if (i25 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                            hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                        }
                        if (i5 != 0) {
                            f3 = 640.0f;
                        } else {
                            f3 = f;
                        }
                        i16 = i3 & 16;
                        owVar = ow.a;
                        if (i16 != 0) {
                            expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                            i4 &= -57345;
                        }
                        if ((i3 & 32) != 0) {
                            containerColor = owVar.getContainerColor(kk0Var2, 6);
                            i4 &= -458753;
                        }
                        if ((i3 & 64) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                            i4 &= -3670017;
                        }
                        if (i7 != 0) {
                            f4 = 0.0f;
                        } else {
                            f4 = f2;
                        }
                        i17 = i14;
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            scrimColor = owVar.getScrimColor(kk0Var2, 6);
                            i4 &= -234881025;
                        } else {
                            scrimColor = j3;
                        }
                        if (i9 != 0) {
                            ne1Var2 = fj0.a;
                        } else {
                            ne1Var2 = ne1Var;
                        }
                        ne1Var3 = ne1Var2;
                        if ((i3 & 1024) != 0) {
                            windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                            i17 &= -15;
                        } else {
                            windowInsets = eVar;
                        }
                        if (i12 != 0) {
                            ne1Var4 = ne1Var3;
                            cVar4 = cVar3;
                            i18 = i17;
                            i19 = i4;
                            rg3Var2 = expandedShape;
                            f6 = f3;
                            j4 = containerColor;
                            long j1118 = scrimColor;
                            if2Var2 = le2.a;
                            hh3Var2 = hh3VarRememberModalBottomSheetState;
                            f5 = f4;
                            j5 = jM2x310ea166;
                            j6 = j1118;
                        } else {
                            ne1Var4 = ne1Var3;
                            cVar4 = cVar3;
                            hh3Var2 = hh3VarRememberModalBottomSheetState;
                            i18 = i17;
                            i19 = i4;
                            f5 = f4;
                            rg3Var2 = expandedShape;
                            f6 = f3;
                            j4 = containerColor;
                            j5 = jM2x310ea166;
                            j6 = scrimColor;
                            if2Var2 = if2Var;
                        }
                    }
                    kk0Var2.s();
                    kk0Var = kk0Var2;
                    oe1 oe1Var17 = oe1Var2;
                    c cVar110 = cVar4;
                    hf2.m206x750f78f8(je1Var, cVar110, hh3Var2, f6, rg3Var2, j4, j5, f5, j6, ne1Var4, new jf2(windowInsets), if2Var2, oe1Var17, kk0Var, i19 & 2147483646, i18 & 1008, 0);
                    cVar5 = cVar110;
                    hh3Var3 = hh3Var2;
                    f7 = f6;
                    rg3Var3 = rg3Var2;
                    j7 = j4;
                    j8 = j5;
                    f8 = f5;
                    j9 = j6;
                    ne1Var5 = ne1Var4;
                    if2Var3 = if2Var2;
                    eVar2 = windowInsets;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new xe2(je1Var, cVar5, hh3Var3, f7, rg3Var3, j7, j8, f8, j9, ne1Var5, eVar2, if2Var3, oe1Var, i, i2, i3, 1));
                }
            }
            i4 |= 3072;
            if ((i & 24576) == 0) {
                if ((i3 & 16) == 0) {
                    expandedShape = rg3Var;
                    if (kk0Var2.h(expandedShape)) {
                        i23 = 16384;
                    }
                    i4 |= i23;
                } else {
                    expandedShape = rg3Var;
                }
                i23 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                i4 |= i23;
            } else {
                expandedShape = rg3Var;
            }
            if ((i & 196608) == 0) {
                containerColor = j;
                if ((i3 & 32) == 0) {
                    i22 = 65536;
                } else {
                    i22 = 65536;
                }
                i4 |= i22;
            } else {
                containerColor = j;
            }
            if ((i & 1572864) == 0) {
                jM2x310ea166 = j2;
                if ((i3 & 64) == 0) {
                    i21 = 524288;
                } else {
                    i21 = 524288;
                }
                i4 |= i21;
            } else {
                jM2x310ea166 = j2;
            }
            i7 = i3 & Uuid.SIZE_BITS;
            if (i7 != 0) {
                if ((i & 12582912) == 0) {
                    if (kk0Var2.e(f2)) {
                        i8 = 8388608;
                    } else {
                        i8 = 4194304;
                    }
                    i4 |= i8;
                }
                if ((i & 100663296) != 0) {
                    if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) == 0) {
                        i20 = 33554432;
                    } else {
                        i20 = 33554432;
                    }
                    i4 |= i20;
                }
                i9 = i3 & ConstantsKt.MINIMUM_BLOCK_SIZE;
                if (i9 != 0) {
                    if ((i & 805306368) == 0) {
                        if (kk0Var2.j(ne1Var)) {
                            i10 = 536870912;
                        } else {
                            i10 = 268435456;
                        }
                        i4 |= i10;
                    }
                    if ((i2 & 6) == 0) {
                        i11 = i2 | (((i3 & 1024) == 0 || !kk0Var2.h(eVar)) ? 2 : 4);
                    } else {
                        i11 = i2;
                    }
                    i12 = i3 & 2048;
                    if (i12 != 0) {
                        i11 |= 48;
                    } else if ((i2 & 48) != 0) {
                        if (kk0Var2.h(if2Var)) {
                            i13 = 32;
                        } else {
                            i13 = 16;
                        }
                        i11 |= i13;
                    }
                    i14 = i11;
                    if ((i3 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
                        if ((i2 & 384) == 0) {
                            oe1Var2 = oe1Var;
                            if (kk0Var2.j(oe1Var2)) {
                                i15 = FontInfo.NUMBER_OF_CHAR_CODES;
                            } else {
                                i15 = Uuid.SIZE_BITS;
                            }
                            i14 |= i15;
                        }
                        if ((306783379 & i4) != 306783378) {
                            kk0Var2.X();
                            if ((i & 1) != 0) {
                                if (i25 != 0) {
                                    cVar3 = c.i;
                                } else {
                                    cVar3 = cVar2;
                                }
                                if ((i3 & 4) != 0) {
                                    i4 &= -897;
                                    hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                                }
                                if (i5 != 0) {
                                    f3 = 640.0f;
                                } else {
                                    f3 = f;
                                }
                                i16 = i3 & 16;
                                owVar = ow.a;
                                if (i16 != 0) {
                                    expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                                    i4 &= -57345;
                                }
                                if ((i3 & 32) != 0) {
                                    containerColor = owVar.getContainerColor(kk0Var2, 6);
                                    i4 &= -458753;
                                }
                                if ((i3 & 64) != 0) {
                                    jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                                    i4 &= -3670017;
                                }
                                if (i7 != 0) {
                                    f4 = 0.0f;
                                } else {
                                    f4 = f2;
                                }
                                i17 = i14;
                                if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                    scrimColor = owVar.getScrimColor(kk0Var2, 6);
                                    i4 &= -234881025;
                                } else {
                                    scrimColor = j3;
                                }
                                if (i9 != 0) {
                                    ne1Var2 = fj0.a;
                                } else {
                                    ne1Var2 = ne1Var;
                                }
                                ne1Var3 = ne1Var2;
                                if ((i3 & 1024) != 0) {
                                    windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                                    i17 &= -15;
                                } else {
                                    windowInsets = eVar;
                                }
                                if (i12 != 0) {
                                    ne1Var4 = ne1Var3;
                                    cVar4 = cVar3;
                                    i18 = i17;
                                    i19 = i4;
                                    rg3Var2 = expandedShape;
                                    f6 = f3;
                                    j4 = containerColor;
                                    long j1119 = scrimColor;
                                    if2Var2 = le2.a;
                                    hh3Var2 = hh3VarRememberModalBottomSheetState;
                                    f5 = f4;
                                    j5 = jM2x310ea166;
                                    j6 = j1119;
                                } else {
                                    ne1Var4 = ne1Var3;
                                    cVar4 = cVar3;
                                    hh3Var2 = hh3VarRememberModalBottomSheetState;
                                    i18 = i17;
                                    i19 = i4;
                                    f5 = f4;
                                    rg3Var2 = expandedShape;
                                    f6 = f3;
                                    j4 = containerColor;
                                    j5 = jM2x310ea166;
                                    j6 = scrimColor;
                                    if2Var2 = if2Var;
                                }
                            } else {
                                if (i25 != 0) {
                                    cVar3 = c.i;
                                } else {
                                    cVar3 = cVar2;
                                }
                                if ((i3 & 4) != 0) {
                                    i4 &= -897;
                                    hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                                }
                                if (i5 != 0) {
                                    f3 = 640.0f;
                                } else {
                                    f3 = f;
                                }
                                i16 = i3 & 16;
                                owVar = ow.a;
                                if (i16 != 0) {
                                    expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                                    i4 &= -57345;
                                }
                                if ((i3 & 32) != 0) {
                                    containerColor = owVar.getContainerColor(kk0Var2, 6);
                                    i4 &= -458753;
                                }
                                if ((i3 & 64) != 0) {
                                    jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                                    i4 &= -3670017;
                                }
                                if (i7 != 0) {
                                    f4 = 0.0f;
                                } else {
                                    f4 = f2;
                                }
                                i17 = i14;
                                if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                    scrimColor = owVar.getScrimColor(kk0Var2, 6);
                                    i4 &= -234881025;
                                } else {
                                    scrimColor = j3;
                                }
                                if (i9 != 0) {
                                    ne1Var2 = fj0.a;
                                } else {
                                    ne1Var2 = ne1Var;
                                }
                                ne1Var3 = ne1Var2;
                                if ((i3 & 1024) != 0) {
                                    windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                                    i17 &= -15;
                                } else {
                                    windowInsets = eVar;
                                }
                                if (i12 != 0) {
                                    ne1Var4 = ne1Var3;
                                    cVar4 = cVar3;
                                    i18 = i17;
                                    i19 = i4;
                                    rg3Var2 = expandedShape;
                                    f6 = f3;
                                    j4 = containerColor;
                                    long j11110 = scrimColor;
                                    if2Var2 = le2.a;
                                    hh3Var2 = hh3VarRememberModalBottomSheetState;
                                    f5 = f4;
                                    j5 = jM2x310ea166;
                                    j6 = j11110;
                                } else {
                                    ne1Var4 = ne1Var3;
                                    cVar4 = cVar3;
                                    hh3Var2 = hh3VarRememberModalBottomSheetState;
                                    i18 = i17;
                                    i19 = i4;
                                    f5 = f4;
                                    rg3Var2 = expandedShape;
                                    f6 = f3;
                                    j4 = containerColor;
                                    j5 = jM2x310ea166;
                                    j6 = scrimColor;
                                    if2Var2 = if2Var;
                                }
                            }
                            kk0Var2.s();
                            kk0Var = kk0Var2;
                            oe1 oe1Var18 = oe1Var2;
                            c cVar111 = cVar4;
                            hf2.m206x750f78f8(je1Var, cVar111, hh3Var2, f6, rg3Var2, j4, j5, f5, j6, ne1Var4, new jf2(windowInsets), if2Var2, oe1Var18, kk0Var, i19 & 2147483646, i18 & 1008, 0);
                            cVar5 = cVar111;
                            hh3Var3 = hh3Var2;
                            f7 = f6;
                            rg3Var3 = rg3Var2;
                            j7 = j4;
                            j8 = j5;
                            f8 = f5;
                            j9 = j6;
                            ne1Var5 = ne1Var4;
                            if2Var3 = if2Var2;
                            eVar2 = windowInsets;
                        } else {
                            kk0Var2.X();
                            if ((i & 1) != 0) {
                                if (i25 != 0) {
                                    cVar3 = c.i;
                                } else {
                                    cVar3 = cVar2;
                                }
                                if ((i3 & 4) != 0) {
                                    i4 &= -897;
                                    hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                                }
                                if (i5 != 0) {
                                    f3 = 640.0f;
                                } else {
                                    f3 = f;
                                }
                                i16 = i3 & 16;
                                owVar = ow.a;
                                if (i16 != 0) {
                                    expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                                    i4 &= -57345;
                                }
                                if ((i3 & 32) != 0) {
                                    containerColor = owVar.getContainerColor(kk0Var2, 6);
                                    i4 &= -458753;
                                }
                                if ((i3 & 64) != 0) {
                                    jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                                    i4 &= -3670017;
                                }
                                if (i7 != 0) {
                                    f4 = 0.0f;
                                } else {
                                    f4 = f2;
                                }
                                i17 = i14;
                                if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                    scrimColor = owVar.getScrimColor(kk0Var2, 6);
                                    i4 &= -234881025;
                                } else {
                                    scrimColor = j3;
                                }
                                if (i9 != 0) {
                                    ne1Var2 = fj0.a;
                                } else {
                                    ne1Var2 = ne1Var;
                                }
                                ne1Var3 = ne1Var2;
                                if ((i3 & 1024) != 0) {
                                    windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                                    i17 &= -15;
                                } else {
                                    windowInsets = eVar;
                                }
                                if (i12 != 0) {
                                    ne1Var4 = ne1Var3;
                                    cVar4 = cVar3;
                                    i18 = i17;
                                    i19 = i4;
                                    rg3Var2 = expandedShape;
                                    f6 = f3;
                                    j4 = containerColor;
                                    long j11111 = scrimColor;
                                    if2Var2 = le2.a;
                                    hh3Var2 = hh3VarRememberModalBottomSheetState;
                                    f5 = f4;
                                    j5 = jM2x310ea166;
                                    j6 = j11111;
                                } else {
                                    ne1Var4 = ne1Var3;
                                    cVar4 = cVar3;
                                    hh3Var2 = hh3VarRememberModalBottomSheetState;
                                    i18 = i17;
                                    i19 = i4;
                                    f5 = f4;
                                    rg3Var2 = expandedShape;
                                    f6 = f3;
                                    j4 = containerColor;
                                    j5 = jM2x310ea166;
                                    j6 = scrimColor;
                                    if2Var2 = if2Var;
                                }
                            } else {
                                if (i25 != 0) {
                                    cVar3 = c.i;
                                } else {
                                    cVar3 = cVar2;
                                }
                                if ((i3 & 4) != 0) {
                                    i4 &= -897;
                                    hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                                }
                                if (i5 != 0) {
                                    f3 = 640.0f;
                                } else {
                                    f3 = f;
                                }
                                i16 = i3 & 16;
                                owVar = ow.a;
                                if (i16 != 0) {
                                    expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                                    i4 &= -57345;
                                }
                                if ((i3 & 32) != 0) {
                                    containerColor = owVar.getContainerColor(kk0Var2, 6);
                                    i4 &= -458753;
                                }
                                if ((i3 & 64) != 0) {
                                    jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                                    i4 &= -3670017;
                                }
                                if (i7 != 0) {
                                    f4 = 0.0f;
                                } else {
                                    f4 = f2;
                                }
                                i17 = i14;
                                if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                    scrimColor = owVar.getScrimColor(kk0Var2, 6);
                                    i4 &= -234881025;
                                } else {
                                    scrimColor = j3;
                                }
                                if (i9 != 0) {
                                    ne1Var2 = fj0.a;
                                } else {
                                    ne1Var2 = ne1Var;
                                }
                                ne1Var3 = ne1Var2;
                                if ((i3 & 1024) != 0) {
                                    windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                                    i17 &= -15;
                                } else {
                                    windowInsets = eVar;
                                }
                                if (i12 != 0) {
                                    ne1Var4 = ne1Var3;
                                    cVar4 = cVar3;
                                    i18 = i17;
                                    i19 = i4;
                                    rg3Var2 = expandedShape;
                                    f6 = f3;
                                    j4 = containerColor;
                                    long j11112 = scrimColor;
                                    if2Var2 = le2.a;
                                    hh3Var2 = hh3VarRememberModalBottomSheetState;
                                    f5 = f4;
                                    j5 = jM2x310ea166;
                                    j6 = j11112;
                                } else {
                                    ne1Var4 = ne1Var3;
                                    cVar4 = cVar3;
                                    hh3Var2 = hh3VarRememberModalBottomSheetState;
                                    i18 = i17;
                                    i19 = i4;
                                    f5 = f4;
                                    rg3Var2 = expandedShape;
                                    f6 = f3;
                                    j4 = containerColor;
                                    j5 = jM2x310ea166;
                                    j6 = scrimColor;
                                    if2Var2 = if2Var;
                                }
                            }
                            kk0Var2.s();
                            kk0Var = kk0Var2;
                            oe1 oe1Var19 = oe1Var2;
                            c cVar112 = cVar4;
                            hf2.m206x750f78f8(je1Var, cVar112, hh3Var2, f6, rg3Var2, j4, j5, f5, j6, ne1Var4, new jf2(windowInsets), if2Var2, oe1Var19, kk0Var, i19 & 2147483646, i18 & 1008, 0);
                            cVar5 = cVar112;
                            hh3Var3 = hh3Var2;
                            f7 = f6;
                            rg3Var3 = rg3Var2;
                            j7 = j4;
                            j8 = j5;
                            f8 = f5;
                            j9 = j6;
                            ne1Var5 = ne1Var4;
                            if2Var3 = if2Var2;
                            eVar2 = windowInsets;
                        }
                        w33VarV = kk0Var.v();
                        if (w33VarV != null) {
                            w33VarV.updateScope(new xe2(je1Var, cVar5, hh3Var3, f7, rg3Var3, j7, j8, f8, j9, ne1Var5, eVar2, if2Var3, oe1Var, i, i2, i3, 1));
                        }
                    }
                    i14 |= 384;
                    oe1Var2 = oe1Var;
                    if ((306783379 & i4) != 306783378) {
                        kk0Var2.X();
                        if ((i & 1) != 0) {
                            if (i25 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if ((i3 & 4) != 0) {
                                i4 &= -897;
                                hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                            }
                            if (i5 != 0) {
                                f3 = 640.0f;
                            } else {
                                f3 = f;
                            }
                            i16 = i3 & 16;
                            owVar = ow.a;
                            if (i16 != 0) {
                                expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                                i4 &= -57345;
                            }
                            if ((i3 & 32) != 0) {
                                containerColor = owVar.getContainerColor(kk0Var2, 6);
                                i4 &= -458753;
                            }
                            if ((i3 & 64) != 0) {
                                jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                                i4 &= -3670017;
                            }
                            if (i7 != 0) {
                                f4 = 0.0f;
                            } else {
                                f4 = f2;
                            }
                            i17 = i14;
                            if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                scrimColor = owVar.getScrimColor(kk0Var2, 6);
                                i4 &= -234881025;
                            } else {
                                scrimColor = j3;
                            }
                            if (i9 != 0) {
                                ne1Var2 = fj0.a;
                            } else {
                                ne1Var2 = ne1Var;
                            }
                            ne1Var3 = ne1Var2;
                            if ((i3 & 1024) != 0) {
                                windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                                i17 &= -15;
                            } else {
                                windowInsets = eVar;
                            }
                            if (i12 != 0) {
                                ne1Var4 = ne1Var3;
                                cVar4 = cVar3;
                                i18 = i17;
                                i19 = i4;
                                rg3Var2 = expandedShape;
                                f6 = f3;
                                j4 = containerColor;
                                long j11113 = scrimColor;
                                if2Var2 = le2.a;
                                hh3Var2 = hh3VarRememberModalBottomSheetState;
                                f5 = f4;
                                j5 = jM2x310ea166;
                                j6 = j11113;
                            } else {
                                ne1Var4 = ne1Var3;
                                cVar4 = cVar3;
                                hh3Var2 = hh3VarRememberModalBottomSheetState;
                                i18 = i17;
                                i19 = i4;
                                f5 = f4;
                                rg3Var2 = expandedShape;
                                f6 = f3;
                                j4 = containerColor;
                                j5 = jM2x310ea166;
                                j6 = scrimColor;
                                if2Var2 = if2Var;
                            }
                        } else {
                            if (i25 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if ((i3 & 4) != 0) {
                                i4 &= -897;
                                hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                            }
                            if (i5 != 0) {
                                f3 = 640.0f;
                            } else {
                                f3 = f;
                            }
                            i16 = i3 & 16;
                            owVar = ow.a;
                            if (i16 != 0) {
                                expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                                i4 &= -57345;
                            }
                            if ((i3 & 32) != 0) {
                                containerColor = owVar.getContainerColor(kk0Var2, 6);
                                i4 &= -458753;
                            }
                            if ((i3 & 64) != 0) {
                                jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                                i4 &= -3670017;
                            }
                            if (i7 != 0) {
                                f4 = 0.0f;
                            } else {
                                f4 = f2;
                            }
                            i17 = i14;
                            if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                scrimColor = owVar.getScrimColor(kk0Var2, 6);
                                i4 &= -234881025;
                            } else {
                                scrimColor = j3;
                            }
                            if (i9 != 0) {
                                ne1Var2 = fj0.a;
                            } else {
                                ne1Var2 = ne1Var;
                            }
                            ne1Var3 = ne1Var2;
                            if ((i3 & 1024) != 0) {
                                windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                                i17 &= -15;
                            } else {
                                windowInsets = eVar;
                            }
                            if (i12 != 0) {
                                ne1Var4 = ne1Var3;
                                cVar4 = cVar3;
                                i18 = i17;
                                i19 = i4;
                                rg3Var2 = expandedShape;
                                f6 = f3;
                                j4 = containerColor;
                                long j11114 = scrimColor;
                                if2Var2 = le2.a;
                                hh3Var2 = hh3VarRememberModalBottomSheetState;
                                f5 = f4;
                                j5 = jM2x310ea166;
                                j6 = j11114;
                            } else {
                                ne1Var4 = ne1Var3;
                                cVar4 = cVar3;
                                hh3Var2 = hh3VarRememberModalBottomSheetState;
                                i18 = i17;
                                i19 = i4;
                                f5 = f4;
                                rg3Var2 = expandedShape;
                                f6 = f3;
                                j4 = containerColor;
                                j5 = jM2x310ea166;
                                j6 = scrimColor;
                                if2Var2 = if2Var;
                            }
                        }
                        kk0Var2.s();
                        kk0Var = kk0Var2;
                        oe1 oe1Var110 = oe1Var2;
                        c cVar113 = cVar4;
                        hf2.m206x750f78f8(je1Var, cVar113, hh3Var2, f6, rg3Var2, j4, j5, f5, j6, ne1Var4, new jf2(windowInsets), if2Var2, oe1Var110, kk0Var, i19 & 2147483646, i18 & 1008, 0);
                        cVar5 = cVar113;
                        hh3Var3 = hh3Var2;
                        f7 = f6;
                        rg3Var3 = rg3Var2;
                        j7 = j4;
                        j8 = j5;
                        f8 = f5;
                        j9 = j6;
                        ne1Var5 = ne1Var4;
                        if2Var3 = if2Var2;
                        eVar2 = windowInsets;
                    } else {
                        kk0Var2.X();
                        if ((i & 1) != 0) {
                            if (i25 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if ((i3 & 4) != 0) {
                                i4 &= -897;
                                hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                            }
                            if (i5 != 0) {
                                f3 = 640.0f;
                            } else {
                                f3 = f;
                            }
                            i16 = i3 & 16;
                            owVar = ow.a;
                            if (i16 != 0) {
                                expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                                i4 &= -57345;
                            }
                            if ((i3 & 32) != 0) {
                                containerColor = owVar.getContainerColor(kk0Var2, 6);
                                i4 &= -458753;
                            }
                            if ((i3 & 64) != 0) {
                                jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                                i4 &= -3670017;
                            }
                            if (i7 != 0) {
                                f4 = 0.0f;
                            } else {
                                f4 = f2;
                            }
                            i17 = i14;
                            if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                scrimColor = owVar.getScrimColor(kk0Var2, 6);
                                i4 &= -234881025;
                            } else {
                                scrimColor = j3;
                            }
                            if (i9 != 0) {
                                ne1Var2 = fj0.a;
                            } else {
                                ne1Var2 = ne1Var;
                            }
                            ne1Var3 = ne1Var2;
                            if ((i3 & 1024) != 0) {
                                windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                                i17 &= -15;
                            } else {
                                windowInsets = eVar;
                            }
                            if (i12 != 0) {
                                ne1Var4 = ne1Var3;
                                cVar4 = cVar3;
                                i18 = i17;
                                i19 = i4;
                                rg3Var2 = expandedShape;
                                f6 = f3;
                                j4 = containerColor;
                                long j11115 = scrimColor;
                                if2Var2 = le2.a;
                                hh3Var2 = hh3VarRememberModalBottomSheetState;
                                f5 = f4;
                                j5 = jM2x310ea166;
                                j6 = j11115;
                            } else {
                                ne1Var4 = ne1Var3;
                                cVar4 = cVar3;
                                hh3Var2 = hh3VarRememberModalBottomSheetState;
                                i18 = i17;
                                i19 = i4;
                                f5 = f4;
                                rg3Var2 = expandedShape;
                                f6 = f3;
                                j4 = containerColor;
                                j5 = jM2x310ea166;
                                j6 = scrimColor;
                                if2Var2 = if2Var;
                            }
                        } else {
                            if (i25 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if ((i3 & 4) != 0) {
                                i4 &= -897;
                                hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                            }
                            if (i5 != 0) {
                                f3 = 640.0f;
                            } else {
                                f3 = f;
                            }
                            i16 = i3 & 16;
                            owVar = ow.a;
                            if (i16 != 0) {
                                expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                                i4 &= -57345;
                            }
                            if ((i3 & 32) != 0) {
                                containerColor = owVar.getContainerColor(kk0Var2, 6);
                                i4 &= -458753;
                            }
                            if ((i3 & 64) != 0) {
                                jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                                i4 &= -3670017;
                            }
                            if (i7 != 0) {
                                f4 = 0.0f;
                            } else {
                                f4 = f2;
                            }
                            i17 = i14;
                            if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                scrimColor = owVar.getScrimColor(kk0Var2, 6);
                                i4 &= -234881025;
                            } else {
                                scrimColor = j3;
                            }
                            if (i9 != 0) {
                                ne1Var2 = fj0.a;
                            } else {
                                ne1Var2 = ne1Var;
                            }
                            ne1Var3 = ne1Var2;
                            if ((i3 & 1024) != 0) {
                                windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                                i17 &= -15;
                            } else {
                                windowInsets = eVar;
                            }
                            if (i12 != 0) {
                                ne1Var4 = ne1Var3;
                                cVar4 = cVar3;
                                i18 = i17;
                                i19 = i4;
                                rg3Var2 = expandedShape;
                                f6 = f3;
                                j4 = containerColor;
                                long j11116 = scrimColor;
                                if2Var2 = le2.a;
                                hh3Var2 = hh3VarRememberModalBottomSheetState;
                                f5 = f4;
                                j5 = jM2x310ea166;
                                j6 = j11116;
                            } else {
                                ne1Var4 = ne1Var3;
                                cVar4 = cVar3;
                                hh3Var2 = hh3VarRememberModalBottomSheetState;
                                i18 = i17;
                                i19 = i4;
                                f5 = f4;
                                rg3Var2 = expandedShape;
                                f6 = f3;
                                j4 = containerColor;
                                j5 = jM2x310ea166;
                                j6 = scrimColor;
                                if2Var2 = if2Var;
                            }
                        }
                        kk0Var2.s();
                        kk0Var = kk0Var2;
                        oe1 oe1Var111 = oe1Var2;
                        c cVar114 = cVar4;
                        hf2.m206x750f78f8(je1Var, cVar114, hh3Var2, f6, rg3Var2, j4, j5, f5, j6, ne1Var4, new jf2(windowInsets), if2Var2, oe1Var111, kk0Var, i19 & 2147483646, i18 & 1008, 0);
                        cVar5 = cVar114;
                        hh3Var3 = hh3Var2;
                        f7 = f6;
                        rg3Var3 = rg3Var2;
                        j7 = j4;
                        j8 = j5;
                        f8 = f5;
                        j9 = j6;
                        ne1Var5 = ne1Var4;
                        if2Var3 = if2Var2;
                        eVar2 = windowInsets;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new xe2(je1Var, cVar5, hh3Var3, f7, rg3Var3, j7, j8, f8, j9, ne1Var5, eVar2, if2Var3, oe1Var, i, i2, i3, 1));
                    }
                }
                i4 |= 805306368;
                if ((i2 & 6) == 0) {
                    i11 = i2 | (((i3 & 1024) == 0 || !kk0Var2.h(eVar)) ? 2 : 4);
                } else {
                    i11 = i2;
                }
                i12 = i3 & 2048;
                if (i12 != 0) {
                    i11 |= 48;
                } else if ((i2 & 48) != 0) {
                    if (kk0Var2.h(if2Var)) {
                        i13 = 32;
                    } else {
                        i13 = 16;
                    }
                    i11 |= i13;
                }
                i14 = i11;
                if ((i3 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
                    if ((i2 & 384) == 0) {
                        oe1Var2 = oe1Var;
                        if (kk0Var2.j(oe1Var2)) {
                            i15 = FontInfo.NUMBER_OF_CHAR_CODES;
                        } else {
                            i15 = Uuid.SIZE_BITS;
                        }
                        i14 |= i15;
                    }
                    if ((306783379 & i4) != 306783378) {
                        kk0Var2.X();
                        if ((i & 1) != 0) {
                            if (i25 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if ((i3 & 4) != 0) {
                                i4 &= -897;
                                hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                            }
                            if (i5 != 0) {
                                f3 = 640.0f;
                            } else {
                                f3 = f;
                            }
                            i16 = i3 & 16;
                            owVar = ow.a;
                            if (i16 != 0) {
                                expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                                i4 &= -57345;
                            }
                            if ((i3 & 32) != 0) {
                                containerColor = owVar.getContainerColor(kk0Var2, 6);
                                i4 &= -458753;
                            }
                            if ((i3 & 64) != 0) {
                                jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                                i4 &= -3670017;
                            }
                            if (i7 != 0) {
                                f4 = 0.0f;
                            } else {
                                f4 = f2;
                            }
                            i17 = i14;
                            if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                scrimColor = owVar.getScrimColor(kk0Var2, 6);
                                i4 &= -234881025;
                            } else {
                                scrimColor = j3;
                            }
                            if (i9 != 0) {
                                ne1Var2 = fj0.a;
                            } else {
                                ne1Var2 = ne1Var;
                            }
                            ne1Var3 = ne1Var2;
                            if ((i3 & 1024) != 0) {
                                windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                                i17 &= -15;
                            } else {
                                windowInsets = eVar;
                            }
                            if (i12 != 0) {
                                ne1Var4 = ne1Var3;
                                cVar4 = cVar3;
                                i18 = i17;
                                i19 = i4;
                                rg3Var2 = expandedShape;
                                f6 = f3;
                                j4 = containerColor;
                                long j11117 = scrimColor;
                                if2Var2 = le2.a;
                                hh3Var2 = hh3VarRememberModalBottomSheetState;
                                f5 = f4;
                                j5 = jM2x310ea166;
                                j6 = j11117;
                            } else {
                                ne1Var4 = ne1Var3;
                                cVar4 = cVar3;
                                hh3Var2 = hh3VarRememberModalBottomSheetState;
                                i18 = i17;
                                i19 = i4;
                                f5 = f4;
                                rg3Var2 = expandedShape;
                                f6 = f3;
                                j4 = containerColor;
                                j5 = jM2x310ea166;
                                j6 = scrimColor;
                                if2Var2 = if2Var;
                            }
                        } else {
                            if (i25 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if ((i3 & 4) != 0) {
                                i4 &= -897;
                                hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                            }
                            if (i5 != 0) {
                                f3 = 640.0f;
                            } else {
                                f3 = f;
                            }
                            i16 = i3 & 16;
                            owVar = ow.a;
                            if (i16 != 0) {
                                expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                                i4 &= -57345;
                            }
                            if ((i3 & 32) != 0) {
                                containerColor = owVar.getContainerColor(kk0Var2, 6);
                                i4 &= -458753;
                            }
                            if ((i3 & 64) != 0) {
                                jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                                i4 &= -3670017;
                            }
                            if (i7 != 0) {
                                f4 = 0.0f;
                            } else {
                                f4 = f2;
                            }
                            i17 = i14;
                            if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                scrimColor = owVar.getScrimColor(kk0Var2, 6);
                                i4 &= -234881025;
                            } else {
                                scrimColor = j3;
                            }
                            if (i9 != 0) {
                                ne1Var2 = fj0.a;
                            } else {
                                ne1Var2 = ne1Var;
                            }
                            ne1Var3 = ne1Var2;
                            if ((i3 & 1024) != 0) {
                                windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                                i17 &= -15;
                            } else {
                                windowInsets = eVar;
                            }
                            if (i12 != 0) {
                                ne1Var4 = ne1Var3;
                                cVar4 = cVar3;
                                i18 = i17;
                                i19 = i4;
                                rg3Var2 = expandedShape;
                                f6 = f3;
                                j4 = containerColor;
                                long j11118 = scrimColor;
                                if2Var2 = le2.a;
                                hh3Var2 = hh3VarRememberModalBottomSheetState;
                                f5 = f4;
                                j5 = jM2x310ea166;
                                j6 = j11118;
                            } else {
                                ne1Var4 = ne1Var3;
                                cVar4 = cVar3;
                                hh3Var2 = hh3VarRememberModalBottomSheetState;
                                i18 = i17;
                                i19 = i4;
                                f5 = f4;
                                rg3Var2 = expandedShape;
                                f6 = f3;
                                j4 = containerColor;
                                j5 = jM2x310ea166;
                                j6 = scrimColor;
                                if2Var2 = if2Var;
                            }
                        }
                        kk0Var2.s();
                        kk0Var = kk0Var2;
                        oe1 oe1Var112 = oe1Var2;
                        c cVar115 = cVar4;
                        hf2.m206x750f78f8(je1Var, cVar115, hh3Var2, f6, rg3Var2, j4, j5, f5, j6, ne1Var4, new jf2(windowInsets), if2Var2, oe1Var112, kk0Var, i19 & 2147483646, i18 & 1008, 0);
                        cVar5 = cVar115;
                        hh3Var3 = hh3Var2;
                        f7 = f6;
                        rg3Var3 = rg3Var2;
                        j7 = j4;
                        j8 = j5;
                        f8 = f5;
                        j9 = j6;
                        ne1Var5 = ne1Var4;
                        if2Var3 = if2Var2;
                        eVar2 = windowInsets;
                    } else {
                        kk0Var2.X();
                        if ((i & 1) != 0) {
                            if (i25 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if ((i3 & 4) != 0) {
                                i4 &= -897;
                                hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                            }
                            if (i5 != 0) {
                                f3 = 640.0f;
                            } else {
                                f3 = f;
                            }
                            i16 = i3 & 16;
                            owVar = ow.a;
                            if (i16 != 0) {
                                expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                                i4 &= -57345;
                            }
                            if ((i3 & 32) != 0) {
                                containerColor = owVar.getContainerColor(kk0Var2, 6);
                                i4 &= -458753;
                            }
                            if ((i3 & 64) != 0) {
                                jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                                i4 &= -3670017;
                            }
                            if (i7 != 0) {
                                f4 = 0.0f;
                            } else {
                                f4 = f2;
                            }
                            i17 = i14;
                            if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                scrimColor = owVar.getScrimColor(kk0Var2, 6);
                                i4 &= -234881025;
                            } else {
                                scrimColor = j3;
                            }
                            if (i9 != 0) {
                                ne1Var2 = fj0.a;
                            } else {
                                ne1Var2 = ne1Var;
                            }
                            ne1Var3 = ne1Var2;
                            if ((i3 & 1024) != 0) {
                                windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                                i17 &= -15;
                            } else {
                                windowInsets = eVar;
                            }
                            if (i12 != 0) {
                                ne1Var4 = ne1Var3;
                                cVar4 = cVar3;
                                i18 = i17;
                                i19 = i4;
                                rg3Var2 = expandedShape;
                                f6 = f3;
                                j4 = containerColor;
                                long j11119 = scrimColor;
                                if2Var2 = le2.a;
                                hh3Var2 = hh3VarRememberModalBottomSheetState;
                                f5 = f4;
                                j5 = jM2x310ea166;
                                j6 = j11119;
                            } else {
                                ne1Var4 = ne1Var3;
                                cVar4 = cVar3;
                                hh3Var2 = hh3VarRememberModalBottomSheetState;
                                i18 = i17;
                                i19 = i4;
                                f5 = f4;
                                rg3Var2 = expandedShape;
                                f6 = f3;
                                j4 = containerColor;
                                j5 = jM2x310ea166;
                                j6 = scrimColor;
                                if2Var2 = if2Var;
                            }
                        } else {
                            if (i25 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if ((i3 & 4) != 0) {
                                i4 &= -897;
                                hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                            }
                            if (i5 != 0) {
                                f3 = 640.0f;
                            } else {
                                f3 = f;
                            }
                            i16 = i3 & 16;
                            owVar = ow.a;
                            if (i16 != 0) {
                                expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                                i4 &= -57345;
                            }
                            if ((i3 & 32) != 0) {
                                containerColor = owVar.getContainerColor(kk0Var2, 6);
                                i4 &= -458753;
                            }
                            if ((i3 & 64) != 0) {
                                jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                                i4 &= -3670017;
                            }
                            if (i7 != 0) {
                                f4 = 0.0f;
                            } else {
                                f4 = f2;
                            }
                            i17 = i14;
                            if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                scrimColor = owVar.getScrimColor(kk0Var2, 6);
                                i4 &= -234881025;
                            } else {
                                scrimColor = j3;
                            }
                            if (i9 != 0) {
                                ne1Var2 = fj0.a;
                            } else {
                                ne1Var2 = ne1Var;
                            }
                            ne1Var3 = ne1Var2;
                            if ((i3 & 1024) != 0) {
                                windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                                i17 &= -15;
                            } else {
                                windowInsets = eVar;
                            }
                            if (i12 != 0) {
                                ne1Var4 = ne1Var3;
                                cVar4 = cVar3;
                                i18 = i17;
                                i19 = i4;
                                rg3Var2 = expandedShape;
                                f6 = f3;
                                j4 = containerColor;
                                long j111110 = scrimColor;
                                if2Var2 = le2.a;
                                hh3Var2 = hh3VarRememberModalBottomSheetState;
                                f5 = f4;
                                j5 = jM2x310ea166;
                                j6 = j111110;
                            } else {
                                ne1Var4 = ne1Var3;
                                cVar4 = cVar3;
                                hh3Var2 = hh3VarRememberModalBottomSheetState;
                                i18 = i17;
                                i19 = i4;
                                f5 = f4;
                                rg3Var2 = expandedShape;
                                f6 = f3;
                                j4 = containerColor;
                                j5 = jM2x310ea166;
                                j6 = scrimColor;
                                if2Var2 = if2Var;
                            }
                        }
                        kk0Var2.s();
                        kk0Var = kk0Var2;
                        oe1 oe1Var113 = oe1Var2;
                        c cVar116 = cVar4;
                        hf2.m206x750f78f8(je1Var, cVar116, hh3Var2, f6, rg3Var2, j4, j5, f5, j6, ne1Var4, new jf2(windowInsets), if2Var2, oe1Var113, kk0Var, i19 & 2147483646, i18 & 1008, 0);
                        cVar5 = cVar116;
                        hh3Var3 = hh3Var2;
                        f7 = f6;
                        rg3Var3 = rg3Var2;
                        j7 = j4;
                        j8 = j5;
                        f8 = f5;
                        j9 = j6;
                        ne1Var5 = ne1Var4;
                        if2Var3 = if2Var2;
                        eVar2 = windowInsets;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new xe2(je1Var, cVar5, hh3Var3, f7, rg3Var3, j7, j8, f8, j9, ne1Var5, eVar2, if2Var3, oe1Var, i, i2, i3, 1));
                    }
                }
                i14 |= 384;
                oe1Var2 = oe1Var;
                if ((306783379 & i4) != 306783378) {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i25 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                            hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                        }
                        if (i5 != 0) {
                            f3 = 640.0f;
                        } else {
                            f3 = f;
                        }
                        i16 = i3 & 16;
                        owVar = ow.a;
                        if (i16 != 0) {
                            expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                            i4 &= -57345;
                        }
                        if ((i3 & 32) != 0) {
                            containerColor = owVar.getContainerColor(kk0Var2, 6);
                            i4 &= -458753;
                        }
                        if ((i3 & 64) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                            i4 &= -3670017;
                        }
                        if (i7 != 0) {
                            f4 = 0.0f;
                        } else {
                            f4 = f2;
                        }
                        i17 = i14;
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            scrimColor = owVar.getScrimColor(kk0Var2, 6);
                            i4 &= -234881025;
                        } else {
                            scrimColor = j3;
                        }
                        if (i9 != 0) {
                            ne1Var2 = fj0.a;
                        } else {
                            ne1Var2 = ne1Var;
                        }
                        ne1Var3 = ne1Var2;
                        if ((i3 & 1024) != 0) {
                            windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                            i17 &= -15;
                        } else {
                            windowInsets = eVar;
                        }
                        if (i12 != 0) {
                            ne1Var4 = ne1Var3;
                            cVar4 = cVar3;
                            i18 = i17;
                            i19 = i4;
                            rg3Var2 = expandedShape;
                            f6 = f3;
                            j4 = containerColor;
                            long j111111 = scrimColor;
                            if2Var2 = le2.a;
                            hh3Var2 = hh3VarRememberModalBottomSheetState;
                            f5 = f4;
                            j5 = jM2x310ea166;
                            j6 = j111111;
                        } else {
                            ne1Var4 = ne1Var3;
                            cVar4 = cVar3;
                            hh3Var2 = hh3VarRememberModalBottomSheetState;
                            i18 = i17;
                            i19 = i4;
                            f5 = f4;
                            rg3Var2 = expandedShape;
                            f6 = f3;
                            j4 = containerColor;
                            j5 = jM2x310ea166;
                            j6 = scrimColor;
                            if2Var2 = if2Var;
                        }
                    } else {
                        if (i25 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                            hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                        }
                        if (i5 != 0) {
                            f3 = 640.0f;
                        } else {
                            f3 = f;
                        }
                        i16 = i3 & 16;
                        owVar = ow.a;
                        if (i16 != 0) {
                            expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                            i4 &= -57345;
                        }
                        if ((i3 & 32) != 0) {
                            containerColor = owVar.getContainerColor(kk0Var2, 6);
                            i4 &= -458753;
                        }
                        if ((i3 & 64) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                            i4 &= -3670017;
                        }
                        if (i7 != 0) {
                            f4 = 0.0f;
                        } else {
                            f4 = f2;
                        }
                        i17 = i14;
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            scrimColor = owVar.getScrimColor(kk0Var2, 6);
                            i4 &= -234881025;
                        } else {
                            scrimColor = j3;
                        }
                        if (i9 != 0) {
                            ne1Var2 = fj0.a;
                        } else {
                            ne1Var2 = ne1Var;
                        }
                        ne1Var3 = ne1Var2;
                        if ((i3 & 1024) != 0) {
                            windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                            i17 &= -15;
                        } else {
                            windowInsets = eVar;
                        }
                        if (i12 != 0) {
                            ne1Var4 = ne1Var3;
                            cVar4 = cVar3;
                            i18 = i17;
                            i19 = i4;
                            rg3Var2 = expandedShape;
                            f6 = f3;
                            j4 = containerColor;
                            long j111112 = scrimColor;
                            if2Var2 = le2.a;
                            hh3Var2 = hh3VarRememberModalBottomSheetState;
                            f5 = f4;
                            j5 = jM2x310ea166;
                            j6 = j111112;
                        } else {
                            ne1Var4 = ne1Var3;
                            cVar4 = cVar3;
                            hh3Var2 = hh3VarRememberModalBottomSheetState;
                            i18 = i17;
                            i19 = i4;
                            f5 = f4;
                            rg3Var2 = expandedShape;
                            f6 = f3;
                            j4 = containerColor;
                            j5 = jM2x310ea166;
                            j6 = scrimColor;
                            if2Var2 = if2Var;
                        }
                    }
                    kk0Var2.s();
                    kk0Var = kk0Var2;
                    oe1 oe1Var114 = oe1Var2;
                    c cVar117 = cVar4;
                    hf2.m206x750f78f8(je1Var, cVar117, hh3Var2, f6, rg3Var2, j4, j5, f5, j6, ne1Var4, new jf2(windowInsets), if2Var2, oe1Var114, kk0Var, i19 & 2147483646, i18 & 1008, 0);
                    cVar5 = cVar117;
                    hh3Var3 = hh3Var2;
                    f7 = f6;
                    rg3Var3 = rg3Var2;
                    j7 = j4;
                    j8 = j5;
                    f8 = f5;
                    j9 = j6;
                    ne1Var5 = ne1Var4;
                    if2Var3 = if2Var2;
                    eVar2 = windowInsets;
                } else {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i25 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                            hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                        }
                        if (i5 != 0) {
                            f3 = 640.0f;
                        } else {
                            f3 = f;
                        }
                        i16 = i3 & 16;
                        owVar = ow.a;
                        if (i16 != 0) {
                            expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                            i4 &= -57345;
                        }
                        if ((i3 & 32) != 0) {
                            containerColor = owVar.getContainerColor(kk0Var2, 6);
                            i4 &= -458753;
                        }
                        if ((i3 & 64) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                            i4 &= -3670017;
                        }
                        if (i7 != 0) {
                            f4 = 0.0f;
                        } else {
                            f4 = f2;
                        }
                        i17 = i14;
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            scrimColor = owVar.getScrimColor(kk0Var2, 6);
                            i4 &= -234881025;
                        } else {
                            scrimColor = j3;
                        }
                        if (i9 != 0) {
                            ne1Var2 = fj0.a;
                        } else {
                            ne1Var2 = ne1Var;
                        }
                        ne1Var3 = ne1Var2;
                        if ((i3 & 1024) != 0) {
                            windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                            i17 &= -15;
                        } else {
                            windowInsets = eVar;
                        }
                        if (i12 != 0) {
                            ne1Var4 = ne1Var3;
                            cVar4 = cVar3;
                            i18 = i17;
                            i19 = i4;
                            rg3Var2 = expandedShape;
                            f6 = f3;
                            j4 = containerColor;
                            long j111113 = scrimColor;
                            if2Var2 = le2.a;
                            hh3Var2 = hh3VarRememberModalBottomSheetState;
                            f5 = f4;
                            j5 = jM2x310ea166;
                            j6 = j111113;
                        } else {
                            ne1Var4 = ne1Var3;
                            cVar4 = cVar3;
                            hh3Var2 = hh3VarRememberModalBottomSheetState;
                            i18 = i17;
                            i19 = i4;
                            f5 = f4;
                            rg3Var2 = expandedShape;
                            f6 = f3;
                            j4 = containerColor;
                            j5 = jM2x310ea166;
                            j6 = scrimColor;
                            if2Var2 = if2Var;
                        }
                    } else {
                        if (i25 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                            hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                        }
                        if (i5 != 0) {
                            f3 = 640.0f;
                        } else {
                            f3 = f;
                        }
                        i16 = i3 & 16;
                        owVar = ow.a;
                        if (i16 != 0) {
                            expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                            i4 &= -57345;
                        }
                        if ((i3 & 32) != 0) {
                            containerColor = owVar.getContainerColor(kk0Var2, 6);
                            i4 &= -458753;
                        }
                        if ((i3 & 64) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                            i4 &= -3670017;
                        }
                        if (i7 != 0) {
                            f4 = 0.0f;
                        } else {
                            f4 = f2;
                        }
                        i17 = i14;
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            scrimColor = owVar.getScrimColor(kk0Var2, 6);
                            i4 &= -234881025;
                        } else {
                            scrimColor = j3;
                        }
                        if (i9 != 0) {
                            ne1Var2 = fj0.a;
                        } else {
                            ne1Var2 = ne1Var;
                        }
                        ne1Var3 = ne1Var2;
                        if ((i3 & 1024) != 0) {
                            windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                            i17 &= -15;
                        } else {
                            windowInsets = eVar;
                        }
                        if (i12 != 0) {
                            ne1Var4 = ne1Var3;
                            cVar4 = cVar3;
                            i18 = i17;
                            i19 = i4;
                            rg3Var2 = expandedShape;
                            f6 = f3;
                            j4 = containerColor;
                            long j111114 = scrimColor;
                            if2Var2 = le2.a;
                            hh3Var2 = hh3VarRememberModalBottomSheetState;
                            f5 = f4;
                            j5 = jM2x310ea166;
                            j6 = j111114;
                        } else {
                            ne1Var4 = ne1Var3;
                            cVar4 = cVar3;
                            hh3Var2 = hh3VarRememberModalBottomSheetState;
                            i18 = i17;
                            i19 = i4;
                            f5 = f4;
                            rg3Var2 = expandedShape;
                            f6 = f3;
                            j4 = containerColor;
                            j5 = jM2x310ea166;
                            j6 = scrimColor;
                            if2Var2 = if2Var;
                        }
                    }
                    kk0Var2.s();
                    kk0Var = kk0Var2;
                    oe1 oe1Var115 = oe1Var2;
                    c cVar118 = cVar4;
                    hf2.m206x750f78f8(je1Var, cVar118, hh3Var2, f6, rg3Var2, j4, j5, f5, j6, ne1Var4, new jf2(windowInsets), if2Var2, oe1Var115, kk0Var, i19 & 2147483646, i18 & 1008, 0);
                    cVar5 = cVar118;
                    hh3Var3 = hh3Var2;
                    f7 = f6;
                    rg3Var3 = rg3Var2;
                    j7 = j4;
                    j8 = j5;
                    f8 = f5;
                    j9 = j6;
                    ne1Var5 = ne1Var4;
                    if2Var3 = if2Var2;
                    eVar2 = windowInsets;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new xe2(je1Var, cVar5, hh3Var3, f7, rg3Var3, j7, j8, f8, j9, ne1Var5, eVar2, if2Var3, oe1Var, i, i2, i3, 1));
                }
            }
            i4 |= 12582912;
            if ((i & 100663296) != 0) {
                if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) == 0) {
                    i20 = 33554432;
                } else {
                    i20 = 33554432;
                }
                i4 |= i20;
            }
            i9 = i3 & ConstantsKt.MINIMUM_BLOCK_SIZE;
            if (i9 != 0) {
                if ((i & 805306368) == 0) {
                    if (kk0Var2.j(ne1Var)) {
                        i10 = 536870912;
                    } else {
                        i10 = 268435456;
                    }
                    i4 |= i10;
                }
                if ((i2 & 6) == 0) {
                    i11 = i2 | (((i3 & 1024) == 0 || !kk0Var2.h(eVar)) ? 2 : 4);
                } else {
                    i11 = i2;
                }
                i12 = i3 & 2048;
                if (i12 != 0) {
                    i11 |= 48;
                } else if ((i2 & 48) != 0) {
                    if (kk0Var2.h(if2Var)) {
                        i13 = 32;
                    } else {
                        i13 = 16;
                    }
                    i11 |= i13;
                }
                i14 = i11;
                if ((i3 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
                    if ((i2 & 384) == 0) {
                        oe1Var2 = oe1Var;
                        if (kk0Var2.j(oe1Var2)) {
                            i15 = FontInfo.NUMBER_OF_CHAR_CODES;
                        } else {
                            i15 = Uuid.SIZE_BITS;
                        }
                        i14 |= i15;
                    }
                    if ((306783379 & i4) != 306783378) {
                        kk0Var2.X();
                        if ((i & 1) != 0) {
                            if (i25 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if ((i3 & 4) != 0) {
                                i4 &= -897;
                                hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                            }
                            if (i5 != 0) {
                                f3 = 640.0f;
                            } else {
                                f3 = f;
                            }
                            i16 = i3 & 16;
                            owVar = ow.a;
                            if (i16 != 0) {
                                expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                                i4 &= -57345;
                            }
                            if ((i3 & 32) != 0) {
                                containerColor = owVar.getContainerColor(kk0Var2, 6);
                                i4 &= -458753;
                            }
                            if ((i3 & 64) != 0) {
                                jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                                i4 &= -3670017;
                            }
                            if (i7 != 0) {
                                f4 = 0.0f;
                            } else {
                                f4 = f2;
                            }
                            i17 = i14;
                            if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                scrimColor = owVar.getScrimColor(kk0Var2, 6);
                                i4 &= -234881025;
                            } else {
                                scrimColor = j3;
                            }
                            if (i9 != 0) {
                                ne1Var2 = fj0.a;
                            } else {
                                ne1Var2 = ne1Var;
                            }
                            ne1Var3 = ne1Var2;
                            if ((i3 & 1024) != 0) {
                                windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                                i17 &= -15;
                            } else {
                                windowInsets = eVar;
                            }
                            if (i12 != 0) {
                                ne1Var4 = ne1Var3;
                                cVar4 = cVar3;
                                i18 = i17;
                                i19 = i4;
                                rg3Var2 = expandedShape;
                                f6 = f3;
                                j4 = containerColor;
                                long j111115 = scrimColor;
                                if2Var2 = le2.a;
                                hh3Var2 = hh3VarRememberModalBottomSheetState;
                                f5 = f4;
                                j5 = jM2x310ea166;
                                j6 = j111115;
                            } else {
                                ne1Var4 = ne1Var3;
                                cVar4 = cVar3;
                                hh3Var2 = hh3VarRememberModalBottomSheetState;
                                i18 = i17;
                                i19 = i4;
                                f5 = f4;
                                rg3Var2 = expandedShape;
                                f6 = f3;
                                j4 = containerColor;
                                j5 = jM2x310ea166;
                                j6 = scrimColor;
                                if2Var2 = if2Var;
                            }
                        } else {
                            if (i25 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if ((i3 & 4) != 0) {
                                i4 &= -897;
                                hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                            }
                            if (i5 != 0) {
                                f3 = 640.0f;
                            } else {
                                f3 = f;
                            }
                            i16 = i3 & 16;
                            owVar = ow.a;
                            if (i16 != 0) {
                                expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                                i4 &= -57345;
                            }
                            if ((i3 & 32) != 0) {
                                containerColor = owVar.getContainerColor(kk0Var2, 6);
                                i4 &= -458753;
                            }
                            if ((i3 & 64) != 0) {
                                jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                                i4 &= -3670017;
                            }
                            if (i7 != 0) {
                                f4 = 0.0f;
                            } else {
                                f4 = f2;
                            }
                            i17 = i14;
                            if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                scrimColor = owVar.getScrimColor(kk0Var2, 6);
                                i4 &= -234881025;
                            } else {
                                scrimColor = j3;
                            }
                            if (i9 != 0) {
                                ne1Var2 = fj0.a;
                            } else {
                                ne1Var2 = ne1Var;
                            }
                            ne1Var3 = ne1Var2;
                            if ((i3 & 1024) != 0) {
                                windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                                i17 &= -15;
                            } else {
                                windowInsets = eVar;
                            }
                            if (i12 != 0) {
                                ne1Var4 = ne1Var3;
                                cVar4 = cVar3;
                                i18 = i17;
                                i19 = i4;
                                rg3Var2 = expandedShape;
                                f6 = f3;
                                j4 = containerColor;
                                long j111116 = scrimColor;
                                if2Var2 = le2.a;
                                hh3Var2 = hh3VarRememberModalBottomSheetState;
                                f5 = f4;
                                j5 = jM2x310ea166;
                                j6 = j111116;
                            } else {
                                ne1Var4 = ne1Var3;
                                cVar4 = cVar3;
                                hh3Var2 = hh3VarRememberModalBottomSheetState;
                                i18 = i17;
                                i19 = i4;
                                f5 = f4;
                                rg3Var2 = expandedShape;
                                f6 = f3;
                                j4 = containerColor;
                                j5 = jM2x310ea166;
                                j6 = scrimColor;
                                if2Var2 = if2Var;
                            }
                        }
                        kk0Var2.s();
                        kk0Var = kk0Var2;
                        oe1 oe1Var116 = oe1Var2;
                        c cVar119 = cVar4;
                        hf2.m206x750f78f8(je1Var, cVar119, hh3Var2, f6, rg3Var2, j4, j5, f5, j6, ne1Var4, new jf2(windowInsets), if2Var2, oe1Var116, kk0Var, i19 & 2147483646, i18 & 1008, 0);
                        cVar5 = cVar119;
                        hh3Var3 = hh3Var2;
                        f7 = f6;
                        rg3Var3 = rg3Var2;
                        j7 = j4;
                        j8 = j5;
                        f8 = f5;
                        j9 = j6;
                        ne1Var5 = ne1Var4;
                        if2Var3 = if2Var2;
                        eVar2 = windowInsets;
                    } else {
                        kk0Var2.X();
                        if ((i & 1) != 0) {
                            if (i25 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if ((i3 & 4) != 0) {
                                i4 &= -897;
                                hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                            }
                            if (i5 != 0) {
                                f3 = 640.0f;
                            } else {
                                f3 = f;
                            }
                            i16 = i3 & 16;
                            owVar = ow.a;
                            if (i16 != 0) {
                                expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                                i4 &= -57345;
                            }
                            if ((i3 & 32) != 0) {
                                containerColor = owVar.getContainerColor(kk0Var2, 6);
                                i4 &= -458753;
                            }
                            if ((i3 & 64) != 0) {
                                jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                                i4 &= -3670017;
                            }
                            if (i7 != 0) {
                                f4 = 0.0f;
                            } else {
                                f4 = f2;
                            }
                            i17 = i14;
                            if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                scrimColor = owVar.getScrimColor(kk0Var2, 6);
                                i4 &= -234881025;
                            } else {
                                scrimColor = j3;
                            }
                            if (i9 != 0) {
                                ne1Var2 = fj0.a;
                            } else {
                                ne1Var2 = ne1Var;
                            }
                            ne1Var3 = ne1Var2;
                            if ((i3 & 1024) != 0) {
                                windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                                i17 &= -15;
                            } else {
                                windowInsets = eVar;
                            }
                            if (i12 != 0) {
                                ne1Var4 = ne1Var3;
                                cVar4 = cVar3;
                                i18 = i17;
                                i19 = i4;
                                rg3Var2 = expandedShape;
                                f6 = f3;
                                j4 = containerColor;
                                long j111117 = scrimColor;
                                if2Var2 = le2.a;
                                hh3Var2 = hh3VarRememberModalBottomSheetState;
                                f5 = f4;
                                j5 = jM2x310ea166;
                                j6 = j111117;
                            } else {
                                ne1Var4 = ne1Var3;
                                cVar4 = cVar3;
                                hh3Var2 = hh3VarRememberModalBottomSheetState;
                                i18 = i17;
                                i19 = i4;
                                f5 = f4;
                                rg3Var2 = expandedShape;
                                f6 = f3;
                                j4 = containerColor;
                                j5 = jM2x310ea166;
                                j6 = scrimColor;
                                if2Var2 = if2Var;
                            }
                        } else {
                            if (i25 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if ((i3 & 4) != 0) {
                                i4 &= -897;
                                hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                            }
                            if (i5 != 0) {
                                f3 = 640.0f;
                            } else {
                                f3 = f;
                            }
                            i16 = i3 & 16;
                            owVar = ow.a;
                            if (i16 != 0) {
                                expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                                i4 &= -57345;
                            }
                            if ((i3 & 32) != 0) {
                                containerColor = owVar.getContainerColor(kk0Var2, 6);
                                i4 &= -458753;
                            }
                            if ((i3 & 64) != 0) {
                                jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                                i4 &= -3670017;
                            }
                            if (i7 != 0) {
                                f4 = 0.0f;
                            } else {
                                f4 = f2;
                            }
                            i17 = i14;
                            if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                scrimColor = owVar.getScrimColor(kk0Var2, 6);
                                i4 &= -234881025;
                            } else {
                                scrimColor = j3;
                            }
                            if (i9 != 0) {
                                ne1Var2 = fj0.a;
                            } else {
                                ne1Var2 = ne1Var;
                            }
                            ne1Var3 = ne1Var2;
                            if ((i3 & 1024) != 0) {
                                windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                                i17 &= -15;
                            } else {
                                windowInsets = eVar;
                            }
                            if (i12 != 0) {
                                ne1Var4 = ne1Var3;
                                cVar4 = cVar3;
                                i18 = i17;
                                i19 = i4;
                                rg3Var2 = expandedShape;
                                f6 = f3;
                                j4 = containerColor;
                                long j111118 = scrimColor;
                                if2Var2 = le2.a;
                                hh3Var2 = hh3VarRememberModalBottomSheetState;
                                f5 = f4;
                                j5 = jM2x310ea166;
                                j6 = j111118;
                            } else {
                                ne1Var4 = ne1Var3;
                                cVar4 = cVar3;
                                hh3Var2 = hh3VarRememberModalBottomSheetState;
                                i18 = i17;
                                i19 = i4;
                                f5 = f4;
                                rg3Var2 = expandedShape;
                                f6 = f3;
                                j4 = containerColor;
                                j5 = jM2x310ea166;
                                j6 = scrimColor;
                                if2Var2 = if2Var;
                            }
                        }
                        kk0Var2.s();
                        kk0Var = kk0Var2;
                        oe1 oe1Var117 = oe1Var2;
                        c cVar1110 = cVar4;
                        hf2.m206x750f78f8(je1Var, cVar1110, hh3Var2, f6, rg3Var2, j4, j5, f5, j6, ne1Var4, new jf2(windowInsets), if2Var2, oe1Var117, kk0Var, i19 & 2147483646, i18 & 1008, 0);
                        cVar5 = cVar1110;
                        hh3Var3 = hh3Var2;
                        f7 = f6;
                        rg3Var3 = rg3Var2;
                        j7 = j4;
                        j8 = j5;
                        f8 = f5;
                        j9 = j6;
                        ne1Var5 = ne1Var4;
                        if2Var3 = if2Var2;
                        eVar2 = windowInsets;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new xe2(je1Var, cVar5, hh3Var3, f7, rg3Var3, j7, j8, f8, j9, ne1Var5, eVar2, if2Var3, oe1Var, i, i2, i3, 1));
                    }
                }
                i14 |= 384;
                oe1Var2 = oe1Var;
                if ((306783379 & i4) != 306783378) {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i25 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                            hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                        }
                        if (i5 != 0) {
                            f3 = 640.0f;
                        } else {
                            f3 = f;
                        }
                        i16 = i3 & 16;
                        owVar = ow.a;
                        if (i16 != 0) {
                            expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                            i4 &= -57345;
                        }
                        if ((i3 & 32) != 0) {
                            containerColor = owVar.getContainerColor(kk0Var2, 6);
                            i4 &= -458753;
                        }
                        if ((i3 & 64) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                            i4 &= -3670017;
                        }
                        if (i7 != 0) {
                            f4 = 0.0f;
                        } else {
                            f4 = f2;
                        }
                        i17 = i14;
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            scrimColor = owVar.getScrimColor(kk0Var2, 6);
                            i4 &= -234881025;
                        } else {
                            scrimColor = j3;
                        }
                        if (i9 != 0) {
                            ne1Var2 = fj0.a;
                        } else {
                            ne1Var2 = ne1Var;
                        }
                        ne1Var3 = ne1Var2;
                        if ((i3 & 1024) != 0) {
                            windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                            i17 &= -15;
                        } else {
                            windowInsets = eVar;
                        }
                        if (i12 != 0) {
                            ne1Var4 = ne1Var3;
                            cVar4 = cVar3;
                            i18 = i17;
                            i19 = i4;
                            rg3Var2 = expandedShape;
                            f6 = f3;
                            j4 = containerColor;
                            long j111119 = scrimColor;
                            if2Var2 = le2.a;
                            hh3Var2 = hh3VarRememberModalBottomSheetState;
                            f5 = f4;
                            j5 = jM2x310ea166;
                            j6 = j111119;
                        } else {
                            ne1Var4 = ne1Var3;
                            cVar4 = cVar3;
                            hh3Var2 = hh3VarRememberModalBottomSheetState;
                            i18 = i17;
                            i19 = i4;
                            f5 = f4;
                            rg3Var2 = expandedShape;
                            f6 = f3;
                            j4 = containerColor;
                            j5 = jM2x310ea166;
                            j6 = scrimColor;
                            if2Var2 = if2Var;
                        }
                    } else {
                        if (i25 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                            hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                        }
                        if (i5 != 0) {
                            f3 = 640.0f;
                        } else {
                            f3 = f;
                        }
                        i16 = i3 & 16;
                        owVar = ow.a;
                        if (i16 != 0) {
                            expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                            i4 &= -57345;
                        }
                        if ((i3 & 32) != 0) {
                            containerColor = owVar.getContainerColor(kk0Var2, 6);
                            i4 &= -458753;
                        }
                        if ((i3 & 64) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                            i4 &= -3670017;
                        }
                        if (i7 != 0) {
                            f4 = 0.0f;
                        } else {
                            f4 = f2;
                        }
                        i17 = i14;
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            scrimColor = owVar.getScrimColor(kk0Var2, 6);
                            i4 &= -234881025;
                        } else {
                            scrimColor = j3;
                        }
                        if (i9 != 0) {
                            ne1Var2 = fj0.a;
                        } else {
                            ne1Var2 = ne1Var;
                        }
                        ne1Var3 = ne1Var2;
                        if ((i3 & 1024) != 0) {
                            windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                            i17 &= -15;
                        } else {
                            windowInsets = eVar;
                        }
                        if (i12 != 0) {
                            ne1Var4 = ne1Var3;
                            cVar4 = cVar3;
                            i18 = i17;
                            i19 = i4;
                            rg3Var2 = expandedShape;
                            f6 = f3;
                            j4 = containerColor;
                            long j1111110 = scrimColor;
                            if2Var2 = le2.a;
                            hh3Var2 = hh3VarRememberModalBottomSheetState;
                            f5 = f4;
                            j5 = jM2x310ea166;
                            j6 = j1111110;
                        } else {
                            ne1Var4 = ne1Var3;
                            cVar4 = cVar3;
                            hh3Var2 = hh3VarRememberModalBottomSheetState;
                            i18 = i17;
                            i19 = i4;
                            f5 = f4;
                            rg3Var2 = expandedShape;
                            f6 = f3;
                            j4 = containerColor;
                            j5 = jM2x310ea166;
                            j6 = scrimColor;
                            if2Var2 = if2Var;
                        }
                    }
                    kk0Var2.s();
                    kk0Var = kk0Var2;
                    oe1 oe1Var118 = oe1Var2;
                    c cVar1111 = cVar4;
                    hf2.m206x750f78f8(je1Var, cVar1111, hh3Var2, f6, rg3Var2, j4, j5, f5, j6, ne1Var4, new jf2(windowInsets), if2Var2, oe1Var118, kk0Var, i19 & 2147483646, i18 & 1008, 0);
                    cVar5 = cVar1111;
                    hh3Var3 = hh3Var2;
                    f7 = f6;
                    rg3Var3 = rg3Var2;
                    j7 = j4;
                    j8 = j5;
                    f8 = f5;
                    j9 = j6;
                    ne1Var5 = ne1Var4;
                    if2Var3 = if2Var2;
                    eVar2 = windowInsets;
                } else {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i25 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                            hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                        }
                        if (i5 != 0) {
                            f3 = 640.0f;
                        } else {
                            f3 = f;
                        }
                        i16 = i3 & 16;
                        owVar = ow.a;
                        if (i16 != 0) {
                            expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                            i4 &= -57345;
                        }
                        if ((i3 & 32) != 0) {
                            containerColor = owVar.getContainerColor(kk0Var2, 6);
                            i4 &= -458753;
                        }
                        if ((i3 & 64) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                            i4 &= -3670017;
                        }
                        if (i7 != 0) {
                            f4 = 0.0f;
                        } else {
                            f4 = f2;
                        }
                        i17 = i14;
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            scrimColor = owVar.getScrimColor(kk0Var2, 6);
                            i4 &= -234881025;
                        } else {
                            scrimColor = j3;
                        }
                        if (i9 != 0) {
                            ne1Var2 = fj0.a;
                        } else {
                            ne1Var2 = ne1Var;
                        }
                        ne1Var3 = ne1Var2;
                        if ((i3 & 1024) != 0) {
                            windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                            i17 &= -15;
                        } else {
                            windowInsets = eVar;
                        }
                        if (i12 != 0) {
                            ne1Var4 = ne1Var3;
                            cVar4 = cVar3;
                            i18 = i17;
                            i19 = i4;
                            rg3Var2 = expandedShape;
                            f6 = f3;
                            j4 = containerColor;
                            long j1111111 = scrimColor;
                            if2Var2 = le2.a;
                            hh3Var2 = hh3VarRememberModalBottomSheetState;
                            f5 = f4;
                            j5 = jM2x310ea166;
                            j6 = j1111111;
                        } else {
                            ne1Var4 = ne1Var3;
                            cVar4 = cVar3;
                            hh3Var2 = hh3VarRememberModalBottomSheetState;
                            i18 = i17;
                            i19 = i4;
                            f5 = f4;
                            rg3Var2 = expandedShape;
                            f6 = f3;
                            j4 = containerColor;
                            j5 = jM2x310ea166;
                            j6 = scrimColor;
                            if2Var2 = if2Var;
                        }
                    } else {
                        if (i25 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                            hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                        }
                        if (i5 != 0) {
                            f3 = 640.0f;
                        } else {
                            f3 = f;
                        }
                        i16 = i3 & 16;
                        owVar = ow.a;
                        if (i16 != 0) {
                            expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                            i4 &= -57345;
                        }
                        if ((i3 & 32) != 0) {
                            containerColor = owVar.getContainerColor(kk0Var2, 6);
                            i4 &= -458753;
                        }
                        if ((i3 & 64) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                            i4 &= -3670017;
                        }
                        if (i7 != 0) {
                            f4 = 0.0f;
                        } else {
                            f4 = f2;
                        }
                        i17 = i14;
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            scrimColor = owVar.getScrimColor(kk0Var2, 6);
                            i4 &= -234881025;
                        } else {
                            scrimColor = j3;
                        }
                        if (i9 != 0) {
                            ne1Var2 = fj0.a;
                        } else {
                            ne1Var2 = ne1Var;
                        }
                        ne1Var3 = ne1Var2;
                        if ((i3 & 1024) != 0) {
                            windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                            i17 &= -15;
                        } else {
                            windowInsets = eVar;
                        }
                        if (i12 != 0) {
                            ne1Var4 = ne1Var3;
                            cVar4 = cVar3;
                            i18 = i17;
                            i19 = i4;
                            rg3Var2 = expandedShape;
                            f6 = f3;
                            j4 = containerColor;
                            long j1111112 = scrimColor;
                            if2Var2 = le2.a;
                            hh3Var2 = hh3VarRememberModalBottomSheetState;
                            f5 = f4;
                            j5 = jM2x310ea166;
                            j6 = j1111112;
                        } else {
                            ne1Var4 = ne1Var3;
                            cVar4 = cVar3;
                            hh3Var2 = hh3VarRememberModalBottomSheetState;
                            i18 = i17;
                            i19 = i4;
                            f5 = f4;
                            rg3Var2 = expandedShape;
                            f6 = f3;
                            j4 = containerColor;
                            j5 = jM2x310ea166;
                            j6 = scrimColor;
                            if2Var2 = if2Var;
                        }
                    }
                    kk0Var2.s();
                    kk0Var = kk0Var2;
                    oe1 oe1Var119 = oe1Var2;
                    c cVar1112 = cVar4;
                    hf2.m206x750f78f8(je1Var, cVar1112, hh3Var2, f6, rg3Var2, j4, j5, f5, j6, ne1Var4, new jf2(windowInsets), if2Var2, oe1Var119, kk0Var, i19 & 2147483646, i18 & 1008, 0);
                    cVar5 = cVar1112;
                    hh3Var3 = hh3Var2;
                    f7 = f6;
                    rg3Var3 = rg3Var2;
                    j7 = j4;
                    j8 = j5;
                    f8 = f5;
                    j9 = j6;
                    ne1Var5 = ne1Var4;
                    if2Var3 = if2Var2;
                    eVar2 = windowInsets;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new xe2(je1Var, cVar5, hh3Var3, f7, rg3Var3, j7, j8, f8, j9, ne1Var5, eVar2, if2Var3, oe1Var, i, i2, i3, 1));
                }
            }
            i4 |= 805306368;
            if ((i2 & 6) == 0) {
                i11 = i2 | (((i3 & 1024) == 0 || !kk0Var2.h(eVar)) ? 2 : 4);
            } else {
                i11 = i2;
            }
            i12 = i3 & 2048;
            if (i12 != 0) {
                i11 |= 48;
            } else if ((i2 & 48) != 0) {
                if (kk0Var2.h(if2Var)) {
                    i13 = 32;
                } else {
                    i13 = 16;
                }
                i11 |= i13;
            }
            i14 = i11;
            if ((i3 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
                if ((i2 & 384) == 0) {
                    oe1Var2 = oe1Var;
                    if (kk0Var2.j(oe1Var2)) {
                        i15 = FontInfo.NUMBER_OF_CHAR_CODES;
                    } else {
                        i15 = Uuid.SIZE_BITS;
                    }
                    i14 |= i15;
                }
                if ((306783379 & i4) != 306783378) {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i25 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                            hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                        }
                        if (i5 != 0) {
                            f3 = 640.0f;
                        } else {
                            f3 = f;
                        }
                        i16 = i3 & 16;
                        owVar = ow.a;
                        if (i16 != 0) {
                            expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                            i4 &= -57345;
                        }
                        if ((i3 & 32) != 0) {
                            containerColor = owVar.getContainerColor(kk0Var2, 6);
                            i4 &= -458753;
                        }
                        if ((i3 & 64) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                            i4 &= -3670017;
                        }
                        if (i7 != 0) {
                            f4 = 0.0f;
                        } else {
                            f4 = f2;
                        }
                        i17 = i14;
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            scrimColor = owVar.getScrimColor(kk0Var2, 6);
                            i4 &= -234881025;
                        } else {
                            scrimColor = j3;
                        }
                        if (i9 != 0) {
                            ne1Var2 = fj0.a;
                        } else {
                            ne1Var2 = ne1Var;
                        }
                        ne1Var3 = ne1Var2;
                        if ((i3 & 1024) != 0) {
                            windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                            i17 &= -15;
                        } else {
                            windowInsets = eVar;
                        }
                        if (i12 != 0) {
                            ne1Var4 = ne1Var3;
                            cVar4 = cVar3;
                            i18 = i17;
                            i19 = i4;
                            rg3Var2 = expandedShape;
                            f6 = f3;
                            j4 = containerColor;
                            long j1111113 = scrimColor;
                            if2Var2 = le2.a;
                            hh3Var2 = hh3VarRememberModalBottomSheetState;
                            f5 = f4;
                            j5 = jM2x310ea166;
                            j6 = j1111113;
                        } else {
                            ne1Var4 = ne1Var3;
                            cVar4 = cVar3;
                            hh3Var2 = hh3VarRememberModalBottomSheetState;
                            i18 = i17;
                            i19 = i4;
                            f5 = f4;
                            rg3Var2 = expandedShape;
                            f6 = f3;
                            j4 = containerColor;
                            j5 = jM2x310ea166;
                            j6 = scrimColor;
                            if2Var2 = if2Var;
                        }
                    } else {
                        if (i25 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                            hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                        }
                        if (i5 != 0) {
                            f3 = 640.0f;
                        } else {
                            f3 = f;
                        }
                        i16 = i3 & 16;
                        owVar = ow.a;
                        if (i16 != 0) {
                            expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                            i4 &= -57345;
                        }
                        if ((i3 & 32) != 0) {
                            containerColor = owVar.getContainerColor(kk0Var2, 6);
                            i4 &= -458753;
                        }
                        if ((i3 & 64) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                            i4 &= -3670017;
                        }
                        if (i7 != 0) {
                            f4 = 0.0f;
                        } else {
                            f4 = f2;
                        }
                        i17 = i14;
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            scrimColor = owVar.getScrimColor(kk0Var2, 6);
                            i4 &= -234881025;
                        } else {
                            scrimColor = j3;
                        }
                        if (i9 != 0) {
                            ne1Var2 = fj0.a;
                        } else {
                            ne1Var2 = ne1Var;
                        }
                        ne1Var3 = ne1Var2;
                        if ((i3 & 1024) != 0) {
                            windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                            i17 &= -15;
                        } else {
                            windowInsets = eVar;
                        }
                        if (i12 != 0) {
                            ne1Var4 = ne1Var3;
                            cVar4 = cVar3;
                            i18 = i17;
                            i19 = i4;
                            rg3Var2 = expandedShape;
                            f6 = f3;
                            j4 = containerColor;
                            long j1111114 = scrimColor;
                            if2Var2 = le2.a;
                            hh3Var2 = hh3VarRememberModalBottomSheetState;
                            f5 = f4;
                            j5 = jM2x310ea166;
                            j6 = j1111114;
                        } else {
                            ne1Var4 = ne1Var3;
                            cVar4 = cVar3;
                            hh3Var2 = hh3VarRememberModalBottomSheetState;
                            i18 = i17;
                            i19 = i4;
                            f5 = f4;
                            rg3Var2 = expandedShape;
                            f6 = f3;
                            j4 = containerColor;
                            j5 = jM2x310ea166;
                            j6 = scrimColor;
                            if2Var2 = if2Var;
                        }
                    }
                    kk0Var2.s();
                    kk0Var = kk0Var2;
                    oe1 oe1Var1110 = oe1Var2;
                    c cVar1113 = cVar4;
                    hf2.m206x750f78f8(je1Var, cVar1113, hh3Var2, f6, rg3Var2, j4, j5, f5, j6, ne1Var4, new jf2(windowInsets), if2Var2, oe1Var1110, kk0Var, i19 & 2147483646, i18 & 1008, 0);
                    cVar5 = cVar1113;
                    hh3Var3 = hh3Var2;
                    f7 = f6;
                    rg3Var3 = rg3Var2;
                    j7 = j4;
                    j8 = j5;
                    f8 = f5;
                    j9 = j6;
                    ne1Var5 = ne1Var4;
                    if2Var3 = if2Var2;
                    eVar2 = windowInsets;
                } else {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i25 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                            hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                        }
                        if (i5 != 0) {
                            f3 = 640.0f;
                        } else {
                            f3 = f;
                        }
                        i16 = i3 & 16;
                        owVar = ow.a;
                        if (i16 != 0) {
                            expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                            i4 &= -57345;
                        }
                        if ((i3 & 32) != 0) {
                            containerColor = owVar.getContainerColor(kk0Var2, 6);
                            i4 &= -458753;
                        }
                        if ((i3 & 64) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                            i4 &= -3670017;
                        }
                        if (i7 != 0) {
                            f4 = 0.0f;
                        } else {
                            f4 = f2;
                        }
                        i17 = i14;
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            scrimColor = owVar.getScrimColor(kk0Var2, 6);
                            i4 &= -234881025;
                        } else {
                            scrimColor = j3;
                        }
                        if (i9 != 0) {
                            ne1Var2 = fj0.a;
                        } else {
                            ne1Var2 = ne1Var;
                        }
                        ne1Var3 = ne1Var2;
                        if ((i3 & 1024) != 0) {
                            windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                            i17 &= -15;
                        } else {
                            windowInsets = eVar;
                        }
                        if (i12 != 0) {
                            ne1Var4 = ne1Var3;
                            cVar4 = cVar3;
                            i18 = i17;
                            i19 = i4;
                            rg3Var2 = expandedShape;
                            f6 = f3;
                            j4 = containerColor;
                            long j1111115 = scrimColor;
                            if2Var2 = le2.a;
                            hh3Var2 = hh3VarRememberModalBottomSheetState;
                            f5 = f4;
                            j5 = jM2x310ea166;
                            j6 = j1111115;
                        } else {
                            ne1Var4 = ne1Var3;
                            cVar4 = cVar3;
                            hh3Var2 = hh3VarRememberModalBottomSheetState;
                            i18 = i17;
                            i19 = i4;
                            f5 = f4;
                            rg3Var2 = expandedShape;
                            f6 = f3;
                            j4 = containerColor;
                            j5 = jM2x310ea166;
                            j6 = scrimColor;
                            if2Var2 = if2Var;
                        }
                    } else {
                        if (i25 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                            hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                        }
                        if (i5 != 0) {
                            f3 = 640.0f;
                        } else {
                            f3 = f;
                        }
                        i16 = i3 & 16;
                        owVar = ow.a;
                        if (i16 != 0) {
                            expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                            i4 &= -57345;
                        }
                        if ((i3 & 32) != 0) {
                            containerColor = owVar.getContainerColor(kk0Var2, 6);
                            i4 &= -458753;
                        }
                        if ((i3 & 64) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                            i4 &= -3670017;
                        }
                        if (i7 != 0) {
                            f4 = 0.0f;
                        } else {
                            f4 = f2;
                        }
                        i17 = i14;
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            scrimColor = owVar.getScrimColor(kk0Var2, 6);
                            i4 &= -234881025;
                        } else {
                            scrimColor = j3;
                        }
                        if (i9 != 0) {
                            ne1Var2 = fj0.a;
                        } else {
                            ne1Var2 = ne1Var;
                        }
                        ne1Var3 = ne1Var2;
                        if ((i3 & 1024) != 0) {
                            windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                            i17 &= -15;
                        } else {
                            windowInsets = eVar;
                        }
                        if (i12 != 0) {
                            ne1Var4 = ne1Var3;
                            cVar4 = cVar3;
                            i18 = i17;
                            i19 = i4;
                            rg3Var2 = expandedShape;
                            f6 = f3;
                            j4 = containerColor;
                            long j1111116 = scrimColor;
                            if2Var2 = le2.a;
                            hh3Var2 = hh3VarRememberModalBottomSheetState;
                            f5 = f4;
                            j5 = jM2x310ea166;
                            j6 = j1111116;
                        } else {
                            ne1Var4 = ne1Var3;
                            cVar4 = cVar3;
                            hh3Var2 = hh3VarRememberModalBottomSheetState;
                            i18 = i17;
                            i19 = i4;
                            f5 = f4;
                            rg3Var2 = expandedShape;
                            f6 = f3;
                            j4 = containerColor;
                            j5 = jM2x310ea166;
                            j6 = scrimColor;
                            if2Var2 = if2Var;
                        }
                    }
                    kk0Var2.s();
                    kk0Var = kk0Var2;
                    oe1 oe1Var1111 = oe1Var2;
                    c cVar1114 = cVar4;
                    hf2.m206x750f78f8(je1Var, cVar1114, hh3Var2, f6, rg3Var2, j4, j5, f5, j6, ne1Var4, new jf2(windowInsets), if2Var2, oe1Var1111, kk0Var, i19 & 2147483646, i18 & 1008, 0);
                    cVar5 = cVar1114;
                    hh3Var3 = hh3Var2;
                    f7 = f6;
                    rg3Var3 = rg3Var2;
                    j7 = j4;
                    j8 = j5;
                    f8 = f5;
                    j9 = j6;
                    ne1Var5 = ne1Var4;
                    if2Var3 = if2Var2;
                    eVar2 = windowInsets;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new xe2(je1Var, cVar5, hh3Var3, f7, rg3Var3, j7, j8, f8, j9, ne1Var5, eVar2, if2Var3, oe1Var, i, i2, i3, 1));
                }
            }
            i14 |= 384;
            oe1Var2 = oe1Var;
            if ((306783379 & i4) != 306783378) {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i25 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if ((i3 & 4) != 0) {
                        i4 &= -897;
                        hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                    }
                    if (i5 != 0) {
                        f3 = 640.0f;
                    } else {
                        f3 = f;
                    }
                    i16 = i3 & 16;
                    owVar = ow.a;
                    if (i16 != 0) {
                        expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                        i4 &= -57345;
                    }
                    if ((i3 & 32) != 0) {
                        containerColor = owVar.getContainerColor(kk0Var2, 6);
                        i4 &= -458753;
                    }
                    if ((i3 & 64) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                        i4 &= -3670017;
                    }
                    if (i7 != 0) {
                        f4 = 0.0f;
                    } else {
                        f4 = f2;
                    }
                    i17 = i14;
                    if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                        scrimColor = owVar.getScrimColor(kk0Var2, 6);
                        i4 &= -234881025;
                    } else {
                        scrimColor = j3;
                    }
                    if (i9 != 0) {
                        ne1Var2 = fj0.a;
                    } else {
                        ne1Var2 = ne1Var;
                    }
                    ne1Var3 = ne1Var2;
                    if ((i3 & 1024) != 0) {
                        windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                        i17 &= -15;
                    } else {
                        windowInsets = eVar;
                    }
                    if (i12 != 0) {
                        ne1Var4 = ne1Var3;
                        cVar4 = cVar3;
                        i18 = i17;
                        i19 = i4;
                        rg3Var2 = expandedShape;
                        f6 = f3;
                        j4 = containerColor;
                        long j1111117 = scrimColor;
                        if2Var2 = le2.a;
                        hh3Var2 = hh3VarRememberModalBottomSheetState;
                        f5 = f4;
                        j5 = jM2x310ea166;
                        j6 = j1111117;
                    } else {
                        ne1Var4 = ne1Var3;
                        cVar4 = cVar3;
                        hh3Var2 = hh3VarRememberModalBottomSheetState;
                        i18 = i17;
                        i19 = i4;
                        f5 = f4;
                        rg3Var2 = expandedShape;
                        f6 = f3;
                        j4 = containerColor;
                        j5 = jM2x310ea166;
                        j6 = scrimColor;
                        if2Var2 = if2Var;
                    }
                } else {
                    if (i25 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if ((i3 & 4) != 0) {
                        i4 &= -897;
                        hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                    }
                    if (i5 != 0) {
                        f3 = 640.0f;
                    } else {
                        f3 = f;
                    }
                    i16 = i3 & 16;
                    owVar = ow.a;
                    if (i16 != 0) {
                        expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                        i4 &= -57345;
                    }
                    if ((i3 & 32) != 0) {
                        containerColor = owVar.getContainerColor(kk0Var2, 6);
                        i4 &= -458753;
                    }
                    if ((i3 & 64) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                        i4 &= -3670017;
                    }
                    if (i7 != 0) {
                        f4 = 0.0f;
                    } else {
                        f4 = f2;
                    }
                    i17 = i14;
                    if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                        scrimColor = owVar.getScrimColor(kk0Var2, 6);
                        i4 &= -234881025;
                    } else {
                        scrimColor = j3;
                    }
                    if (i9 != 0) {
                        ne1Var2 = fj0.a;
                    } else {
                        ne1Var2 = ne1Var;
                    }
                    ne1Var3 = ne1Var2;
                    if ((i3 & 1024) != 0) {
                        windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                        i17 &= -15;
                    } else {
                        windowInsets = eVar;
                    }
                    if (i12 != 0) {
                        ne1Var4 = ne1Var3;
                        cVar4 = cVar3;
                        i18 = i17;
                        i19 = i4;
                        rg3Var2 = expandedShape;
                        f6 = f3;
                        j4 = containerColor;
                        long j1111118 = scrimColor;
                        if2Var2 = le2.a;
                        hh3Var2 = hh3VarRememberModalBottomSheetState;
                        f5 = f4;
                        j5 = jM2x310ea166;
                        j6 = j1111118;
                    } else {
                        ne1Var4 = ne1Var3;
                        cVar4 = cVar3;
                        hh3Var2 = hh3VarRememberModalBottomSheetState;
                        i18 = i17;
                        i19 = i4;
                        f5 = f4;
                        rg3Var2 = expandedShape;
                        f6 = f3;
                        j4 = containerColor;
                        j5 = jM2x310ea166;
                        j6 = scrimColor;
                        if2Var2 = if2Var;
                    }
                }
                kk0Var2.s();
                kk0Var = kk0Var2;
                oe1 oe1Var1112 = oe1Var2;
                c cVar1115 = cVar4;
                hf2.m206x750f78f8(je1Var, cVar1115, hh3Var2, f6, rg3Var2, j4, j5, f5, j6, ne1Var4, new jf2(windowInsets), if2Var2, oe1Var1112, kk0Var, i19 & 2147483646, i18 & 1008, 0);
                cVar5 = cVar1115;
                hh3Var3 = hh3Var2;
                f7 = f6;
                rg3Var3 = rg3Var2;
                j7 = j4;
                j8 = j5;
                f8 = f5;
                j9 = j6;
                ne1Var5 = ne1Var4;
                if2Var3 = if2Var2;
                eVar2 = windowInsets;
            } else {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i25 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if ((i3 & 4) != 0) {
                        i4 &= -897;
                        hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                    }
                    if (i5 != 0) {
                        f3 = 640.0f;
                    } else {
                        f3 = f;
                    }
                    i16 = i3 & 16;
                    owVar = ow.a;
                    if (i16 != 0) {
                        expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                        i4 &= -57345;
                    }
                    if ((i3 & 32) != 0) {
                        containerColor = owVar.getContainerColor(kk0Var2, 6);
                        i4 &= -458753;
                    }
                    if ((i3 & 64) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                        i4 &= -3670017;
                    }
                    if (i7 != 0) {
                        f4 = 0.0f;
                    } else {
                        f4 = f2;
                    }
                    i17 = i14;
                    if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                        scrimColor = owVar.getScrimColor(kk0Var2, 6);
                        i4 &= -234881025;
                    } else {
                        scrimColor = j3;
                    }
                    if (i9 != 0) {
                        ne1Var2 = fj0.a;
                    } else {
                        ne1Var2 = ne1Var;
                    }
                    ne1Var3 = ne1Var2;
                    if ((i3 & 1024) != 0) {
                        windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                        i17 &= -15;
                    } else {
                        windowInsets = eVar;
                    }
                    if (i12 != 0) {
                        ne1Var4 = ne1Var3;
                        cVar4 = cVar3;
                        i18 = i17;
                        i19 = i4;
                        rg3Var2 = expandedShape;
                        f6 = f3;
                        j4 = containerColor;
                        long j1111119 = scrimColor;
                        if2Var2 = le2.a;
                        hh3Var2 = hh3VarRememberModalBottomSheetState;
                        f5 = f4;
                        j5 = jM2x310ea166;
                        j6 = j1111119;
                    } else {
                        ne1Var4 = ne1Var3;
                        cVar4 = cVar3;
                        hh3Var2 = hh3VarRememberModalBottomSheetState;
                        i18 = i17;
                        i19 = i4;
                        f5 = f4;
                        rg3Var2 = expandedShape;
                        f6 = f3;
                        j4 = containerColor;
                        j5 = jM2x310ea166;
                        j6 = scrimColor;
                        if2Var2 = if2Var;
                    }
                } else {
                    if (i25 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if ((i3 & 4) != 0) {
                        i4 &= -897;
                        hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                    }
                    if (i5 != 0) {
                        f3 = 640.0f;
                    } else {
                        f3 = f;
                    }
                    i16 = i3 & 16;
                    owVar = ow.a;
                    if (i16 != 0) {
                        expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                        i4 &= -57345;
                    }
                    if ((i3 & 32) != 0) {
                        containerColor = owVar.getContainerColor(kk0Var2, 6);
                        i4 &= -458753;
                    }
                    if ((i3 & 64) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                        i4 &= -3670017;
                    }
                    if (i7 != 0) {
                        f4 = 0.0f;
                    } else {
                        f4 = f2;
                    }
                    i17 = i14;
                    if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                        scrimColor = owVar.getScrimColor(kk0Var2, 6);
                        i4 &= -234881025;
                    } else {
                        scrimColor = j3;
                    }
                    if (i9 != 0) {
                        ne1Var2 = fj0.a;
                    } else {
                        ne1Var2 = ne1Var;
                    }
                    ne1Var3 = ne1Var2;
                    if ((i3 & 1024) != 0) {
                        windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                        i17 &= -15;
                    } else {
                        windowInsets = eVar;
                    }
                    if (i12 != 0) {
                        ne1Var4 = ne1Var3;
                        cVar4 = cVar3;
                        i18 = i17;
                        i19 = i4;
                        rg3Var2 = expandedShape;
                        f6 = f3;
                        j4 = containerColor;
                        long j11111110 = scrimColor;
                        if2Var2 = le2.a;
                        hh3Var2 = hh3VarRememberModalBottomSheetState;
                        f5 = f4;
                        j5 = jM2x310ea166;
                        j6 = j11111110;
                    } else {
                        ne1Var4 = ne1Var3;
                        cVar4 = cVar3;
                        hh3Var2 = hh3VarRememberModalBottomSheetState;
                        i18 = i17;
                        i19 = i4;
                        f5 = f4;
                        rg3Var2 = expandedShape;
                        f6 = f3;
                        j4 = containerColor;
                        j5 = jM2x310ea166;
                        j6 = scrimColor;
                        if2Var2 = if2Var;
                    }
                }
                kk0Var2.s();
                kk0Var = kk0Var2;
                oe1 oe1Var1113 = oe1Var2;
                c cVar1116 = cVar4;
                hf2.m206x750f78f8(je1Var, cVar1116, hh3Var2, f6, rg3Var2, j4, j5, f5, j6, ne1Var4, new jf2(windowInsets), if2Var2, oe1Var1113, kk0Var, i19 & 2147483646, i18 & 1008, 0);
                cVar5 = cVar1116;
                hh3Var3 = hh3Var2;
                f7 = f6;
                rg3Var3 = rg3Var2;
                j7 = j4;
                j8 = j5;
                f8 = f5;
                j9 = j6;
                ne1Var5 = ne1Var4;
                if2Var3 = if2Var2;
                eVar2 = windowInsets;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new xe2(je1Var, cVar5, hh3Var3, f7, rg3Var3, j7, j8, f8, j9, ne1Var5, eVar2, if2Var3, oe1Var, i, i2, i3, 1));
            }
        }
        i4 |= 48;
        cVar2 = cVar;
        if ((i & 384) == 0) {
            if ((i3 & 4) == 0) {
                hh3VarRememberModalBottomSheetState = hh3Var;
                if (kk0Var2.h(hh3VarRememberModalBottomSheetState)) {
                    i24 = FontInfo.NUMBER_OF_CHAR_CODES;
                }
                i4 |= i24;
            } else {
                hh3VarRememberModalBottomSheetState = hh3Var;
            }
            i24 = Uuid.SIZE_BITS;
            i4 |= i24;
        } else {
            hh3VarRememberModalBottomSheetState = hh3Var;
        }
        i5 = i3 & 8;
        if (i5 != 0) {
            if ((i & 3072) == 0) {
                if (kk0Var2.e(f)) {
                    i6 = 2048;
                } else {
                    i6 = 1024;
                }
                i4 |= i6;
            }
            if ((i & 24576) == 0) {
                if ((i3 & 16) == 0) {
                    expandedShape = rg3Var;
                    if (kk0Var2.h(expandedShape)) {
                        i23 = 16384;
                    }
                    i4 |= i23;
                } else {
                    expandedShape = rg3Var;
                }
                i23 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                i4 |= i23;
            } else {
                expandedShape = rg3Var;
            }
            if ((i & 196608) == 0) {
                containerColor = j;
                if ((i3 & 32) == 0) {
                    i22 = 65536;
                } else {
                    i22 = 65536;
                }
                i4 |= i22;
            } else {
                containerColor = j;
            }
            if ((i & 1572864) == 0) {
                jM2x310ea166 = j2;
                if ((i3 & 64) == 0) {
                    i21 = 524288;
                } else {
                    i21 = 524288;
                }
                i4 |= i21;
            } else {
                jM2x310ea166 = j2;
            }
            i7 = i3 & Uuid.SIZE_BITS;
            if (i7 != 0) {
                if ((i & 12582912) == 0) {
                    if (kk0Var2.e(f2)) {
                        i8 = 8388608;
                    } else {
                        i8 = 4194304;
                    }
                    i4 |= i8;
                }
                if ((i & 100663296) != 0) {
                    if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) == 0) {
                        i20 = 33554432;
                    } else {
                        i20 = 33554432;
                    }
                    i4 |= i20;
                }
                i9 = i3 & ConstantsKt.MINIMUM_BLOCK_SIZE;
                if (i9 != 0) {
                    if ((i & 805306368) == 0) {
                        if (kk0Var2.j(ne1Var)) {
                            i10 = 536870912;
                        } else {
                            i10 = 268435456;
                        }
                        i4 |= i10;
                    }
                    if ((i2 & 6) == 0) {
                        i11 = i2 | (((i3 & 1024) == 0 || !kk0Var2.h(eVar)) ? 2 : 4);
                    } else {
                        i11 = i2;
                    }
                    i12 = i3 & 2048;
                    if (i12 != 0) {
                        i11 |= 48;
                    } else if ((i2 & 48) != 0) {
                        if (kk0Var2.h(if2Var)) {
                            i13 = 32;
                        } else {
                            i13 = 16;
                        }
                        i11 |= i13;
                    }
                    i14 = i11;
                    if ((i3 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
                        if ((i2 & 384) == 0) {
                            oe1Var2 = oe1Var;
                            if (kk0Var2.j(oe1Var2)) {
                                i15 = FontInfo.NUMBER_OF_CHAR_CODES;
                            } else {
                                i15 = Uuid.SIZE_BITS;
                            }
                            i14 |= i15;
                        }
                        if ((306783379 & i4) != 306783378) {
                            kk0Var2.X();
                            if ((i & 1) != 0) {
                                if (i25 != 0) {
                                    cVar3 = c.i;
                                } else {
                                    cVar3 = cVar2;
                                }
                                if ((i3 & 4) != 0) {
                                    i4 &= -897;
                                    hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                                }
                                if (i5 != 0) {
                                    f3 = 640.0f;
                                } else {
                                    f3 = f;
                                }
                                i16 = i3 & 16;
                                owVar = ow.a;
                                if (i16 != 0) {
                                    expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                                    i4 &= -57345;
                                }
                                if ((i3 & 32) != 0) {
                                    containerColor = owVar.getContainerColor(kk0Var2, 6);
                                    i4 &= -458753;
                                }
                                if ((i3 & 64) != 0) {
                                    jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                                    i4 &= -3670017;
                                }
                                if (i7 != 0) {
                                    f4 = 0.0f;
                                } else {
                                    f4 = f2;
                                }
                                i17 = i14;
                                if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                    scrimColor = owVar.getScrimColor(kk0Var2, 6);
                                    i4 &= -234881025;
                                } else {
                                    scrimColor = j3;
                                }
                                if (i9 != 0) {
                                    ne1Var2 = fj0.a;
                                } else {
                                    ne1Var2 = ne1Var;
                                }
                                ne1Var3 = ne1Var2;
                                if ((i3 & 1024) != 0) {
                                    windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                                    i17 &= -15;
                                } else {
                                    windowInsets = eVar;
                                }
                                if (i12 != 0) {
                                    ne1Var4 = ne1Var3;
                                    cVar4 = cVar3;
                                    i18 = i17;
                                    i19 = i4;
                                    rg3Var2 = expandedShape;
                                    f6 = f3;
                                    j4 = containerColor;
                                    long j11111111 = scrimColor;
                                    if2Var2 = le2.a;
                                    hh3Var2 = hh3VarRememberModalBottomSheetState;
                                    f5 = f4;
                                    j5 = jM2x310ea166;
                                    j6 = j11111111;
                                } else {
                                    ne1Var4 = ne1Var3;
                                    cVar4 = cVar3;
                                    hh3Var2 = hh3VarRememberModalBottomSheetState;
                                    i18 = i17;
                                    i19 = i4;
                                    f5 = f4;
                                    rg3Var2 = expandedShape;
                                    f6 = f3;
                                    j4 = containerColor;
                                    j5 = jM2x310ea166;
                                    j6 = scrimColor;
                                    if2Var2 = if2Var;
                                }
                            } else {
                                if (i25 != 0) {
                                    cVar3 = c.i;
                                } else {
                                    cVar3 = cVar2;
                                }
                                if ((i3 & 4) != 0) {
                                    i4 &= -897;
                                    hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                                }
                                if (i5 != 0) {
                                    f3 = 640.0f;
                                } else {
                                    f3 = f;
                                }
                                i16 = i3 & 16;
                                owVar = ow.a;
                                if (i16 != 0) {
                                    expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                                    i4 &= -57345;
                                }
                                if ((i3 & 32) != 0) {
                                    containerColor = owVar.getContainerColor(kk0Var2, 6);
                                    i4 &= -458753;
                                }
                                if ((i3 & 64) != 0) {
                                    jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                                    i4 &= -3670017;
                                }
                                if (i7 != 0) {
                                    f4 = 0.0f;
                                } else {
                                    f4 = f2;
                                }
                                i17 = i14;
                                if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                    scrimColor = owVar.getScrimColor(kk0Var2, 6);
                                    i4 &= -234881025;
                                } else {
                                    scrimColor = j3;
                                }
                                if (i9 != 0) {
                                    ne1Var2 = fj0.a;
                                } else {
                                    ne1Var2 = ne1Var;
                                }
                                ne1Var3 = ne1Var2;
                                if ((i3 & 1024) != 0) {
                                    windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                                    i17 &= -15;
                                } else {
                                    windowInsets = eVar;
                                }
                                if (i12 != 0) {
                                    ne1Var4 = ne1Var3;
                                    cVar4 = cVar3;
                                    i18 = i17;
                                    i19 = i4;
                                    rg3Var2 = expandedShape;
                                    f6 = f3;
                                    j4 = containerColor;
                                    long j11111112 = scrimColor;
                                    if2Var2 = le2.a;
                                    hh3Var2 = hh3VarRememberModalBottomSheetState;
                                    f5 = f4;
                                    j5 = jM2x310ea166;
                                    j6 = j11111112;
                                } else {
                                    ne1Var4 = ne1Var3;
                                    cVar4 = cVar3;
                                    hh3Var2 = hh3VarRememberModalBottomSheetState;
                                    i18 = i17;
                                    i19 = i4;
                                    f5 = f4;
                                    rg3Var2 = expandedShape;
                                    f6 = f3;
                                    j4 = containerColor;
                                    j5 = jM2x310ea166;
                                    j6 = scrimColor;
                                    if2Var2 = if2Var;
                                }
                            }
                            kk0Var2.s();
                            kk0Var = kk0Var2;
                            oe1 oe1Var1114 = oe1Var2;
                            c cVar1117 = cVar4;
                            hf2.m206x750f78f8(je1Var, cVar1117, hh3Var2, f6, rg3Var2, j4, j5, f5, j6, ne1Var4, new jf2(windowInsets), if2Var2, oe1Var1114, kk0Var, i19 & 2147483646, i18 & 1008, 0);
                            cVar5 = cVar1117;
                            hh3Var3 = hh3Var2;
                            f7 = f6;
                            rg3Var3 = rg3Var2;
                            j7 = j4;
                            j8 = j5;
                            f8 = f5;
                            j9 = j6;
                            ne1Var5 = ne1Var4;
                            if2Var3 = if2Var2;
                            eVar2 = windowInsets;
                        } else {
                            kk0Var2.X();
                            if ((i & 1) != 0) {
                                if (i25 != 0) {
                                    cVar3 = c.i;
                                } else {
                                    cVar3 = cVar2;
                                }
                                if ((i3 & 4) != 0) {
                                    i4 &= -897;
                                    hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                                }
                                if (i5 != 0) {
                                    f3 = 640.0f;
                                } else {
                                    f3 = f;
                                }
                                i16 = i3 & 16;
                                owVar = ow.a;
                                if (i16 != 0) {
                                    expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                                    i4 &= -57345;
                                }
                                if ((i3 & 32) != 0) {
                                    containerColor = owVar.getContainerColor(kk0Var2, 6);
                                    i4 &= -458753;
                                }
                                if ((i3 & 64) != 0) {
                                    jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                                    i4 &= -3670017;
                                }
                                if (i7 != 0) {
                                    f4 = 0.0f;
                                } else {
                                    f4 = f2;
                                }
                                i17 = i14;
                                if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                    scrimColor = owVar.getScrimColor(kk0Var2, 6);
                                    i4 &= -234881025;
                                } else {
                                    scrimColor = j3;
                                }
                                if (i9 != 0) {
                                    ne1Var2 = fj0.a;
                                } else {
                                    ne1Var2 = ne1Var;
                                }
                                ne1Var3 = ne1Var2;
                                if ((i3 & 1024) != 0) {
                                    windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                                    i17 &= -15;
                                } else {
                                    windowInsets = eVar;
                                }
                                if (i12 != 0) {
                                    ne1Var4 = ne1Var3;
                                    cVar4 = cVar3;
                                    i18 = i17;
                                    i19 = i4;
                                    rg3Var2 = expandedShape;
                                    f6 = f3;
                                    j4 = containerColor;
                                    long j11111113 = scrimColor;
                                    if2Var2 = le2.a;
                                    hh3Var2 = hh3VarRememberModalBottomSheetState;
                                    f5 = f4;
                                    j5 = jM2x310ea166;
                                    j6 = j11111113;
                                } else {
                                    ne1Var4 = ne1Var3;
                                    cVar4 = cVar3;
                                    hh3Var2 = hh3VarRememberModalBottomSheetState;
                                    i18 = i17;
                                    i19 = i4;
                                    f5 = f4;
                                    rg3Var2 = expandedShape;
                                    f6 = f3;
                                    j4 = containerColor;
                                    j5 = jM2x310ea166;
                                    j6 = scrimColor;
                                    if2Var2 = if2Var;
                                }
                            } else {
                                if (i25 != 0) {
                                    cVar3 = c.i;
                                } else {
                                    cVar3 = cVar2;
                                }
                                if ((i3 & 4) != 0) {
                                    i4 &= -897;
                                    hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                                }
                                if (i5 != 0) {
                                    f3 = 640.0f;
                                } else {
                                    f3 = f;
                                }
                                i16 = i3 & 16;
                                owVar = ow.a;
                                if (i16 != 0) {
                                    expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                                    i4 &= -57345;
                                }
                                if ((i3 & 32) != 0) {
                                    containerColor = owVar.getContainerColor(kk0Var2, 6);
                                    i4 &= -458753;
                                }
                                if ((i3 & 64) != 0) {
                                    jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                                    i4 &= -3670017;
                                }
                                if (i7 != 0) {
                                    f4 = 0.0f;
                                } else {
                                    f4 = f2;
                                }
                                i17 = i14;
                                if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                    scrimColor = owVar.getScrimColor(kk0Var2, 6);
                                    i4 &= -234881025;
                                } else {
                                    scrimColor = j3;
                                }
                                if (i9 != 0) {
                                    ne1Var2 = fj0.a;
                                } else {
                                    ne1Var2 = ne1Var;
                                }
                                ne1Var3 = ne1Var2;
                                if ((i3 & 1024) != 0) {
                                    windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                                    i17 &= -15;
                                } else {
                                    windowInsets = eVar;
                                }
                                if (i12 != 0) {
                                    ne1Var4 = ne1Var3;
                                    cVar4 = cVar3;
                                    i18 = i17;
                                    i19 = i4;
                                    rg3Var2 = expandedShape;
                                    f6 = f3;
                                    j4 = containerColor;
                                    long j11111114 = scrimColor;
                                    if2Var2 = le2.a;
                                    hh3Var2 = hh3VarRememberModalBottomSheetState;
                                    f5 = f4;
                                    j5 = jM2x310ea166;
                                    j6 = j11111114;
                                } else {
                                    ne1Var4 = ne1Var3;
                                    cVar4 = cVar3;
                                    hh3Var2 = hh3VarRememberModalBottomSheetState;
                                    i18 = i17;
                                    i19 = i4;
                                    f5 = f4;
                                    rg3Var2 = expandedShape;
                                    f6 = f3;
                                    j4 = containerColor;
                                    j5 = jM2x310ea166;
                                    j6 = scrimColor;
                                    if2Var2 = if2Var;
                                }
                            }
                            kk0Var2.s();
                            kk0Var = kk0Var2;
                            oe1 oe1Var1115 = oe1Var2;
                            c cVar1118 = cVar4;
                            hf2.m206x750f78f8(je1Var, cVar1118, hh3Var2, f6, rg3Var2, j4, j5, f5, j6, ne1Var4, new jf2(windowInsets), if2Var2, oe1Var1115, kk0Var, i19 & 2147483646, i18 & 1008, 0);
                            cVar5 = cVar1118;
                            hh3Var3 = hh3Var2;
                            f7 = f6;
                            rg3Var3 = rg3Var2;
                            j7 = j4;
                            j8 = j5;
                            f8 = f5;
                            j9 = j6;
                            ne1Var5 = ne1Var4;
                            if2Var3 = if2Var2;
                            eVar2 = windowInsets;
                        }
                        w33VarV = kk0Var.v();
                        if (w33VarV != null) {
                            w33VarV.updateScope(new xe2(je1Var, cVar5, hh3Var3, f7, rg3Var3, j7, j8, f8, j9, ne1Var5, eVar2, if2Var3, oe1Var, i, i2, i3, 1));
                        }
                    }
                    i14 |= 384;
                    oe1Var2 = oe1Var;
                    if ((306783379 & i4) != 306783378) {
                        kk0Var2.X();
                        if ((i & 1) != 0) {
                            if (i25 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if ((i3 & 4) != 0) {
                                i4 &= -897;
                                hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                            }
                            if (i5 != 0) {
                                f3 = 640.0f;
                            } else {
                                f3 = f;
                            }
                            i16 = i3 & 16;
                            owVar = ow.a;
                            if (i16 != 0) {
                                expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                                i4 &= -57345;
                            }
                            if ((i3 & 32) != 0) {
                                containerColor = owVar.getContainerColor(kk0Var2, 6);
                                i4 &= -458753;
                            }
                            if ((i3 & 64) != 0) {
                                jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                                i4 &= -3670017;
                            }
                            if (i7 != 0) {
                                f4 = 0.0f;
                            } else {
                                f4 = f2;
                            }
                            i17 = i14;
                            if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                scrimColor = owVar.getScrimColor(kk0Var2, 6);
                                i4 &= -234881025;
                            } else {
                                scrimColor = j3;
                            }
                            if (i9 != 0) {
                                ne1Var2 = fj0.a;
                            } else {
                                ne1Var2 = ne1Var;
                            }
                            ne1Var3 = ne1Var2;
                            if ((i3 & 1024) != 0) {
                                windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                                i17 &= -15;
                            } else {
                                windowInsets = eVar;
                            }
                            if (i12 != 0) {
                                ne1Var4 = ne1Var3;
                                cVar4 = cVar3;
                                i18 = i17;
                                i19 = i4;
                                rg3Var2 = expandedShape;
                                f6 = f3;
                                j4 = containerColor;
                                long j11111115 = scrimColor;
                                if2Var2 = le2.a;
                                hh3Var2 = hh3VarRememberModalBottomSheetState;
                                f5 = f4;
                                j5 = jM2x310ea166;
                                j6 = j11111115;
                            } else {
                                ne1Var4 = ne1Var3;
                                cVar4 = cVar3;
                                hh3Var2 = hh3VarRememberModalBottomSheetState;
                                i18 = i17;
                                i19 = i4;
                                f5 = f4;
                                rg3Var2 = expandedShape;
                                f6 = f3;
                                j4 = containerColor;
                                j5 = jM2x310ea166;
                                j6 = scrimColor;
                                if2Var2 = if2Var;
                            }
                        } else {
                            if (i25 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if ((i3 & 4) != 0) {
                                i4 &= -897;
                                hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                            }
                            if (i5 != 0) {
                                f3 = 640.0f;
                            } else {
                                f3 = f;
                            }
                            i16 = i3 & 16;
                            owVar = ow.a;
                            if (i16 != 0) {
                                expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                                i4 &= -57345;
                            }
                            if ((i3 & 32) != 0) {
                                containerColor = owVar.getContainerColor(kk0Var2, 6);
                                i4 &= -458753;
                            }
                            if ((i3 & 64) != 0) {
                                jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                                i4 &= -3670017;
                            }
                            if (i7 != 0) {
                                f4 = 0.0f;
                            } else {
                                f4 = f2;
                            }
                            i17 = i14;
                            if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                scrimColor = owVar.getScrimColor(kk0Var2, 6);
                                i4 &= -234881025;
                            } else {
                                scrimColor = j3;
                            }
                            if (i9 != 0) {
                                ne1Var2 = fj0.a;
                            } else {
                                ne1Var2 = ne1Var;
                            }
                            ne1Var3 = ne1Var2;
                            if ((i3 & 1024) != 0) {
                                windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                                i17 &= -15;
                            } else {
                                windowInsets = eVar;
                            }
                            if (i12 != 0) {
                                ne1Var4 = ne1Var3;
                                cVar4 = cVar3;
                                i18 = i17;
                                i19 = i4;
                                rg3Var2 = expandedShape;
                                f6 = f3;
                                j4 = containerColor;
                                long j11111116 = scrimColor;
                                if2Var2 = le2.a;
                                hh3Var2 = hh3VarRememberModalBottomSheetState;
                                f5 = f4;
                                j5 = jM2x310ea166;
                                j6 = j11111116;
                            } else {
                                ne1Var4 = ne1Var3;
                                cVar4 = cVar3;
                                hh3Var2 = hh3VarRememberModalBottomSheetState;
                                i18 = i17;
                                i19 = i4;
                                f5 = f4;
                                rg3Var2 = expandedShape;
                                f6 = f3;
                                j4 = containerColor;
                                j5 = jM2x310ea166;
                                j6 = scrimColor;
                                if2Var2 = if2Var;
                            }
                        }
                        kk0Var2.s();
                        kk0Var = kk0Var2;
                        oe1 oe1Var1116 = oe1Var2;
                        c cVar1119 = cVar4;
                        hf2.m206x750f78f8(je1Var, cVar1119, hh3Var2, f6, rg3Var2, j4, j5, f5, j6, ne1Var4, new jf2(windowInsets), if2Var2, oe1Var1116, kk0Var, i19 & 2147483646, i18 & 1008, 0);
                        cVar5 = cVar1119;
                        hh3Var3 = hh3Var2;
                        f7 = f6;
                        rg3Var3 = rg3Var2;
                        j7 = j4;
                        j8 = j5;
                        f8 = f5;
                        j9 = j6;
                        ne1Var5 = ne1Var4;
                        if2Var3 = if2Var2;
                        eVar2 = windowInsets;
                    } else {
                        kk0Var2.X();
                        if ((i & 1) != 0) {
                            if (i25 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if ((i3 & 4) != 0) {
                                i4 &= -897;
                                hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                            }
                            if (i5 != 0) {
                                f3 = 640.0f;
                            } else {
                                f3 = f;
                            }
                            i16 = i3 & 16;
                            owVar = ow.a;
                            if (i16 != 0) {
                                expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                                i4 &= -57345;
                            }
                            if ((i3 & 32) != 0) {
                                containerColor = owVar.getContainerColor(kk0Var2, 6);
                                i4 &= -458753;
                            }
                            if ((i3 & 64) != 0) {
                                jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                                i4 &= -3670017;
                            }
                            if (i7 != 0) {
                                f4 = 0.0f;
                            } else {
                                f4 = f2;
                            }
                            i17 = i14;
                            if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                scrimColor = owVar.getScrimColor(kk0Var2, 6);
                                i4 &= -234881025;
                            } else {
                                scrimColor = j3;
                            }
                            if (i9 != 0) {
                                ne1Var2 = fj0.a;
                            } else {
                                ne1Var2 = ne1Var;
                            }
                            ne1Var3 = ne1Var2;
                            if ((i3 & 1024) != 0) {
                                windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                                i17 &= -15;
                            } else {
                                windowInsets = eVar;
                            }
                            if (i12 != 0) {
                                ne1Var4 = ne1Var3;
                                cVar4 = cVar3;
                                i18 = i17;
                                i19 = i4;
                                rg3Var2 = expandedShape;
                                f6 = f3;
                                j4 = containerColor;
                                long j11111117 = scrimColor;
                                if2Var2 = le2.a;
                                hh3Var2 = hh3VarRememberModalBottomSheetState;
                                f5 = f4;
                                j5 = jM2x310ea166;
                                j6 = j11111117;
                            } else {
                                ne1Var4 = ne1Var3;
                                cVar4 = cVar3;
                                hh3Var2 = hh3VarRememberModalBottomSheetState;
                                i18 = i17;
                                i19 = i4;
                                f5 = f4;
                                rg3Var2 = expandedShape;
                                f6 = f3;
                                j4 = containerColor;
                                j5 = jM2x310ea166;
                                j6 = scrimColor;
                                if2Var2 = if2Var;
                            }
                        } else {
                            if (i25 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if ((i3 & 4) != 0) {
                                i4 &= -897;
                                hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                            }
                            if (i5 != 0) {
                                f3 = 640.0f;
                            } else {
                                f3 = f;
                            }
                            i16 = i3 & 16;
                            owVar = ow.a;
                            if (i16 != 0) {
                                expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                                i4 &= -57345;
                            }
                            if ((i3 & 32) != 0) {
                                containerColor = owVar.getContainerColor(kk0Var2, 6);
                                i4 &= -458753;
                            }
                            if ((i3 & 64) != 0) {
                                jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                                i4 &= -3670017;
                            }
                            if (i7 != 0) {
                                f4 = 0.0f;
                            } else {
                                f4 = f2;
                            }
                            i17 = i14;
                            if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                scrimColor = owVar.getScrimColor(kk0Var2, 6);
                                i4 &= -234881025;
                            } else {
                                scrimColor = j3;
                            }
                            if (i9 != 0) {
                                ne1Var2 = fj0.a;
                            } else {
                                ne1Var2 = ne1Var;
                            }
                            ne1Var3 = ne1Var2;
                            if ((i3 & 1024) != 0) {
                                windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                                i17 &= -15;
                            } else {
                                windowInsets = eVar;
                            }
                            if (i12 != 0) {
                                ne1Var4 = ne1Var3;
                                cVar4 = cVar3;
                                i18 = i17;
                                i19 = i4;
                                rg3Var2 = expandedShape;
                                f6 = f3;
                                j4 = containerColor;
                                long j11111118 = scrimColor;
                                if2Var2 = le2.a;
                                hh3Var2 = hh3VarRememberModalBottomSheetState;
                                f5 = f4;
                                j5 = jM2x310ea166;
                                j6 = j11111118;
                            } else {
                                ne1Var4 = ne1Var3;
                                cVar4 = cVar3;
                                hh3Var2 = hh3VarRememberModalBottomSheetState;
                                i18 = i17;
                                i19 = i4;
                                f5 = f4;
                                rg3Var2 = expandedShape;
                                f6 = f3;
                                j4 = containerColor;
                                j5 = jM2x310ea166;
                                j6 = scrimColor;
                                if2Var2 = if2Var;
                            }
                        }
                        kk0Var2.s();
                        kk0Var = kk0Var2;
                        oe1 oe1Var1117 = oe1Var2;
                        c cVar11110 = cVar4;
                        hf2.m206x750f78f8(je1Var, cVar11110, hh3Var2, f6, rg3Var2, j4, j5, f5, j6, ne1Var4, new jf2(windowInsets), if2Var2, oe1Var1117, kk0Var, i19 & 2147483646, i18 & 1008, 0);
                        cVar5 = cVar11110;
                        hh3Var3 = hh3Var2;
                        f7 = f6;
                        rg3Var3 = rg3Var2;
                        j7 = j4;
                        j8 = j5;
                        f8 = f5;
                        j9 = j6;
                        ne1Var5 = ne1Var4;
                        if2Var3 = if2Var2;
                        eVar2 = windowInsets;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new xe2(je1Var, cVar5, hh3Var3, f7, rg3Var3, j7, j8, f8, j9, ne1Var5, eVar2, if2Var3, oe1Var, i, i2, i3, 1));
                    }
                }
                i4 |= 805306368;
                if ((i2 & 6) == 0) {
                    i11 = i2 | (((i3 & 1024) == 0 || !kk0Var2.h(eVar)) ? 2 : 4);
                } else {
                    i11 = i2;
                }
                i12 = i3 & 2048;
                if (i12 != 0) {
                    i11 |= 48;
                } else if ((i2 & 48) != 0) {
                    if (kk0Var2.h(if2Var)) {
                        i13 = 32;
                    } else {
                        i13 = 16;
                    }
                    i11 |= i13;
                }
                i14 = i11;
                if ((i3 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
                    if ((i2 & 384) == 0) {
                        oe1Var2 = oe1Var;
                        if (kk0Var2.j(oe1Var2)) {
                            i15 = FontInfo.NUMBER_OF_CHAR_CODES;
                        } else {
                            i15 = Uuid.SIZE_BITS;
                        }
                        i14 |= i15;
                    }
                    if ((306783379 & i4) != 306783378) {
                        kk0Var2.X();
                        if ((i & 1) != 0) {
                            if (i25 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if ((i3 & 4) != 0) {
                                i4 &= -897;
                                hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                            }
                            if (i5 != 0) {
                                f3 = 640.0f;
                            } else {
                                f3 = f;
                            }
                            i16 = i3 & 16;
                            owVar = ow.a;
                            if (i16 != 0) {
                                expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                                i4 &= -57345;
                            }
                            if ((i3 & 32) != 0) {
                                containerColor = owVar.getContainerColor(kk0Var2, 6);
                                i4 &= -458753;
                            }
                            if ((i3 & 64) != 0) {
                                jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                                i4 &= -3670017;
                            }
                            if (i7 != 0) {
                                f4 = 0.0f;
                            } else {
                                f4 = f2;
                            }
                            i17 = i14;
                            if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                scrimColor = owVar.getScrimColor(kk0Var2, 6);
                                i4 &= -234881025;
                            } else {
                                scrimColor = j3;
                            }
                            if (i9 != 0) {
                                ne1Var2 = fj0.a;
                            } else {
                                ne1Var2 = ne1Var;
                            }
                            ne1Var3 = ne1Var2;
                            if ((i3 & 1024) != 0) {
                                windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                                i17 &= -15;
                            } else {
                                windowInsets = eVar;
                            }
                            if (i12 != 0) {
                                ne1Var4 = ne1Var3;
                                cVar4 = cVar3;
                                i18 = i17;
                                i19 = i4;
                                rg3Var2 = expandedShape;
                                f6 = f3;
                                j4 = containerColor;
                                long j11111119 = scrimColor;
                                if2Var2 = le2.a;
                                hh3Var2 = hh3VarRememberModalBottomSheetState;
                                f5 = f4;
                                j5 = jM2x310ea166;
                                j6 = j11111119;
                            } else {
                                ne1Var4 = ne1Var3;
                                cVar4 = cVar3;
                                hh3Var2 = hh3VarRememberModalBottomSheetState;
                                i18 = i17;
                                i19 = i4;
                                f5 = f4;
                                rg3Var2 = expandedShape;
                                f6 = f3;
                                j4 = containerColor;
                                j5 = jM2x310ea166;
                                j6 = scrimColor;
                                if2Var2 = if2Var;
                            }
                        } else {
                            if (i25 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if ((i3 & 4) != 0) {
                                i4 &= -897;
                                hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                            }
                            if (i5 != 0) {
                                f3 = 640.0f;
                            } else {
                                f3 = f;
                            }
                            i16 = i3 & 16;
                            owVar = ow.a;
                            if (i16 != 0) {
                                expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                                i4 &= -57345;
                            }
                            if ((i3 & 32) != 0) {
                                containerColor = owVar.getContainerColor(kk0Var2, 6);
                                i4 &= -458753;
                            }
                            if ((i3 & 64) != 0) {
                                jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                                i4 &= -3670017;
                            }
                            if (i7 != 0) {
                                f4 = 0.0f;
                            } else {
                                f4 = f2;
                            }
                            i17 = i14;
                            if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                scrimColor = owVar.getScrimColor(kk0Var2, 6);
                                i4 &= -234881025;
                            } else {
                                scrimColor = j3;
                            }
                            if (i9 != 0) {
                                ne1Var2 = fj0.a;
                            } else {
                                ne1Var2 = ne1Var;
                            }
                            ne1Var3 = ne1Var2;
                            if ((i3 & 1024) != 0) {
                                windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                                i17 &= -15;
                            } else {
                                windowInsets = eVar;
                            }
                            if (i12 != 0) {
                                ne1Var4 = ne1Var3;
                                cVar4 = cVar3;
                                i18 = i17;
                                i19 = i4;
                                rg3Var2 = expandedShape;
                                f6 = f3;
                                j4 = containerColor;
                                long j111111110 = scrimColor;
                                if2Var2 = le2.a;
                                hh3Var2 = hh3VarRememberModalBottomSheetState;
                                f5 = f4;
                                j5 = jM2x310ea166;
                                j6 = j111111110;
                            } else {
                                ne1Var4 = ne1Var3;
                                cVar4 = cVar3;
                                hh3Var2 = hh3VarRememberModalBottomSheetState;
                                i18 = i17;
                                i19 = i4;
                                f5 = f4;
                                rg3Var2 = expandedShape;
                                f6 = f3;
                                j4 = containerColor;
                                j5 = jM2x310ea166;
                                j6 = scrimColor;
                                if2Var2 = if2Var;
                            }
                        }
                        kk0Var2.s();
                        kk0Var = kk0Var2;
                        oe1 oe1Var1118 = oe1Var2;
                        c cVar11111 = cVar4;
                        hf2.m206x750f78f8(je1Var, cVar11111, hh3Var2, f6, rg3Var2, j4, j5, f5, j6, ne1Var4, new jf2(windowInsets), if2Var2, oe1Var1118, kk0Var, i19 & 2147483646, i18 & 1008, 0);
                        cVar5 = cVar11111;
                        hh3Var3 = hh3Var2;
                        f7 = f6;
                        rg3Var3 = rg3Var2;
                        j7 = j4;
                        j8 = j5;
                        f8 = f5;
                        j9 = j6;
                        ne1Var5 = ne1Var4;
                        if2Var3 = if2Var2;
                        eVar2 = windowInsets;
                    } else {
                        kk0Var2.X();
                        if ((i & 1) != 0) {
                            if (i25 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if ((i3 & 4) != 0) {
                                i4 &= -897;
                                hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                            }
                            if (i5 != 0) {
                                f3 = 640.0f;
                            } else {
                                f3 = f;
                            }
                            i16 = i3 & 16;
                            owVar = ow.a;
                            if (i16 != 0) {
                                expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                                i4 &= -57345;
                            }
                            if ((i3 & 32) != 0) {
                                containerColor = owVar.getContainerColor(kk0Var2, 6);
                                i4 &= -458753;
                            }
                            if ((i3 & 64) != 0) {
                                jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                                i4 &= -3670017;
                            }
                            if (i7 != 0) {
                                f4 = 0.0f;
                            } else {
                                f4 = f2;
                            }
                            i17 = i14;
                            if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                scrimColor = owVar.getScrimColor(kk0Var2, 6);
                                i4 &= -234881025;
                            } else {
                                scrimColor = j3;
                            }
                            if (i9 != 0) {
                                ne1Var2 = fj0.a;
                            } else {
                                ne1Var2 = ne1Var;
                            }
                            ne1Var3 = ne1Var2;
                            if ((i3 & 1024) != 0) {
                                windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                                i17 &= -15;
                            } else {
                                windowInsets = eVar;
                            }
                            if (i12 != 0) {
                                ne1Var4 = ne1Var3;
                                cVar4 = cVar3;
                                i18 = i17;
                                i19 = i4;
                                rg3Var2 = expandedShape;
                                f6 = f3;
                                j4 = containerColor;
                                long j111111111 = scrimColor;
                                if2Var2 = le2.a;
                                hh3Var2 = hh3VarRememberModalBottomSheetState;
                                f5 = f4;
                                j5 = jM2x310ea166;
                                j6 = j111111111;
                            } else {
                                ne1Var4 = ne1Var3;
                                cVar4 = cVar3;
                                hh3Var2 = hh3VarRememberModalBottomSheetState;
                                i18 = i17;
                                i19 = i4;
                                f5 = f4;
                                rg3Var2 = expandedShape;
                                f6 = f3;
                                j4 = containerColor;
                                j5 = jM2x310ea166;
                                j6 = scrimColor;
                                if2Var2 = if2Var;
                            }
                        } else {
                            if (i25 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if ((i3 & 4) != 0) {
                                i4 &= -897;
                                hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                            }
                            if (i5 != 0) {
                                f3 = 640.0f;
                            } else {
                                f3 = f;
                            }
                            i16 = i3 & 16;
                            owVar = ow.a;
                            if (i16 != 0) {
                                expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                                i4 &= -57345;
                            }
                            if ((i3 & 32) != 0) {
                                containerColor = owVar.getContainerColor(kk0Var2, 6);
                                i4 &= -458753;
                            }
                            if ((i3 & 64) != 0) {
                                jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                                i4 &= -3670017;
                            }
                            if (i7 != 0) {
                                f4 = 0.0f;
                            } else {
                                f4 = f2;
                            }
                            i17 = i14;
                            if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                scrimColor = owVar.getScrimColor(kk0Var2, 6);
                                i4 &= -234881025;
                            } else {
                                scrimColor = j3;
                            }
                            if (i9 != 0) {
                                ne1Var2 = fj0.a;
                            } else {
                                ne1Var2 = ne1Var;
                            }
                            ne1Var3 = ne1Var2;
                            if ((i3 & 1024) != 0) {
                                windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                                i17 &= -15;
                            } else {
                                windowInsets = eVar;
                            }
                            if (i12 != 0) {
                                ne1Var4 = ne1Var3;
                                cVar4 = cVar3;
                                i18 = i17;
                                i19 = i4;
                                rg3Var2 = expandedShape;
                                f6 = f3;
                                j4 = containerColor;
                                long j111111112 = scrimColor;
                                if2Var2 = le2.a;
                                hh3Var2 = hh3VarRememberModalBottomSheetState;
                                f5 = f4;
                                j5 = jM2x310ea166;
                                j6 = j111111112;
                            } else {
                                ne1Var4 = ne1Var3;
                                cVar4 = cVar3;
                                hh3Var2 = hh3VarRememberModalBottomSheetState;
                                i18 = i17;
                                i19 = i4;
                                f5 = f4;
                                rg3Var2 = expandedShape;
                                f6 = f3;
                                j4 = containerColor;
                                j5 = jM2x310ea166;
                                j6 = scrimColor;
                                if2Var2 = if2Var;
                            }
                        }
                        kk0Var2.s();
                        kk0Var = kk0Var2;
                        oe1 oe1Var1119 = oe1Var2;
                        c cVar11112 = cVar4;
                        hf2.m206x750f78f8(je1Var, cVar11112, hh3Var2, f6, rg3Var2, j4, j5, f5, j6, ne1Var4, new jf2(windowInsets), if2Var2, oe1Var1119, kk0Var, i19 & 2147483646, i18 & 1008, 0);
                        cVar5 = cVar11112;
                        hh3Var3 = hh3Var2;
                        f7 = f6;
                        rg3Var3 = rg3Var2;
                        j7 = j4;
                        j8 = j5;
                        f8 = f5;
                        j9 = j6;
                        ne1Var5 = ne1Var4;
                        if2Var3 = if2Var2;
                        eVar2 = windowInsets;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new xe2(je1Var, cVar5, hh3Var3, f7, rg3Var3, j7, j8, f8, j9, ne1Var5, eVar2, if2Var3, oe1Var, i, i2, i3, 1));
                    }
                }
                i14 |= 384;
                oe1Var2 = oe1Var;
                if ((306783379 & i4) != 306783378) {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i25 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                            hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                        }
                        if (i5 != 0) {
                            f3 = 640.0f;
                        } else {
                            f3 = f;
                        }
                        i16 = i3 & 16;
                        owVar = ow.a;
                        if (i16 != 0) {
                            expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                            i4 &= -57345;
                        }
                        if ((i3 & 32) != 0) {
                            containerColor = owVar.getContainerColor(kk0Var2, 6);
                            i4 &= -458753;
                        }
                        if ((i3 & 64) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                            i4 &= -3670017;
                        }
                        if (i7 != 0) {
                            f4 = 0.0f;
                        } else {
                            f4 = f2;
                        }
                        i17 = i14;
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            scrimColor = owVar.getScrimColor(kk0Var2, 6);
                            i4 &= -234881025;
                        } else {
                            scrimColor = j3;
                        }
                        if (i9 != 0) {
                            ne1Var2 = fj0.a;
                        } else {
                            ne1Var2 = ne1Var;
                        }
                        ne1Var3 = ne1Var2;
                        if ((i3 & 1024) != 0) {
                            windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                            i17 &= -15;
                        } else {
                            windowInsets = eVar;
                        }
                        if (i12 != 0) {
                            ne1Var4 = ne1Var3;
                            cVar4 = cVar3;
                            i18 = i17;
                            i19 = i4;
                            rg3Var2 = expandedShape;
                            f6 = f3;
                            j4 = containerColor;
                            long j111111113 = scrimColor;
                            if2Var2 = le2.a;
                            hh3Var2 = hh3VarRememberModalBottomSheetState;
                            f5 = f4;
                            j5 = jM2x310ea166;
                            j6 = j111111113;
                        } else {
                            ne1Var4 = ne1Var3;
                            cVar4 = cVar3;
                            hh3Var2 = hh3VarRememberModalBottomSheetState;
                            i18 = i17;
                            i19 = i4;
                            f5 = f4;
                            rg3Var2 = expandedShape;
                            f6 = f3;
                            j4 = containerColor;
                            j5 = jM2x310ea166;
                            j6 = scrimColor;
                            if2Var2 = if2Var;
                        }
                    } else {
                        if (i25 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                            hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                        }
                        if (i5 != 0) {
                            f3 = 640.0f;
                        } else {
                            f3 = f;
                        }
                        i16 = i3 & 16;
                        owVar = ow.a;
                        if (i16 != 0) {
                            expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                            i4 &= -57345;
                        }
                        if ((i3 & 32) != 0) {
                            containerColor = owVar.getContainerColor(kk0Var2, 6);
                            i4 &= -458753;
                        }
                        if ((i3 & 64) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                            i4 &= -3670017;
                        }
                        if (i7 != 0) {
                            f4 = 0.0f;
                        } else {
                            f4 = f2;
                        }
                        i17 = i14;
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            scrimColor = owVar.getScrimColor(kk0Var2, 6);
                            i4 &= -234881025;
                        } else {
                            scrimColor = j3;
                        }
                        if (i9 != 0) {
                            ne1Var2 = fj0.a;
                        } else {
                            ne1Var2 = ne1Var;
                        }
                        ne1Var3 = ne1Var2;
                        if ((i3 & 1024) != 0) {
                            windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                            i17 &= -15;
                        } else {
                            windowInsets = eVar;
                        }
                        if (i12 != 0) {
                            ne1Var4 = ne1Var3;
                            cVar4 = cVar3;
                            i18 = i17;
                            i19 = i4;
                            rg3Var2 = expandedShape;
                            f6 = f3;
                            j4 = containerColor;
                            long j111111114 = scrimColor;
                            if2Var2 = le2.a;
                            hh3Var2 = hh3VarRememberModalBottomSheetState;
                            f5 = f4;
                            j5 = jM2x310ea166;
                            j6 = j111111114;
                        } else {
                            ne1Var4 = ne1Var3;
                            cVar4 = cVar3;
                            hh3Var2 = hh3VarRememberModalBottomSheetState;
                            i18 = i17;
                            i19 = i4;
                            f5 = f4;
                            rg3Var2 = expandedShape;
                            f6 = f3;
                            j4 = containerColor;
                            j5 = jM2x310ea166;
                            j6 = scrimColor;
                            if2Var2 = if2Var;
                        }
                    }
                    kk0Var2.s();
                    kk0Var = kk0Var2;
                    oe1 oe1Var11110 = oe1Var2;
                    c cVar11113 = cVar4;
                    hf2.m206x750f78f8(je1Var, cVar11113, hh3Var2, f6, rg3Var2, j4, j5, f5, j6, ne1Var4, new jf2(windowInsets), if2Var2, oe1Var11110, kk0Var, i19 & 2147483646, i18 & 1008, 0);
                    cVar5 = cVar11113;
                    hh3Var3 = hh3Var2;
                    f7 = f6;
                    rg3Var3 = rg3Var2;
                    j7 = j4;
                    j8 = j5;
                    f8 = f5;
                    j9 = j6;
                    ne1Var5 = ne1Var4;
                    if2Var3 = if2Var2;
                    eVar2 = windowInsets;
                } else {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i25 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                            hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                        }
                        if (i5 != 0) {
                            f3 = 640.0f;
                        } else {
                            f3 = f;
                        }
                        i16 = i3 & 16;
                        owVar = ow.a;
                        if (i16 != 0) {
                            expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                            i4 &= -57345;
                        }
                        if ((i3 & 32) != 0) {
                            containerColor = owVar.getContainerColor(kk0Var2, 6);
                            i4 &= -458753;
                        }
                        if ((i3 & 64) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                            i4 &= -3670017;
                        }
                        if (i7 != 0) {
                            f4 = 0.0f;
                        } else {
                            f4 = f2;
                        }
                        i17 = i14;
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            scrimColor = owVar.getScrimColor(kk0Var2, 6);
                            i4 &= -234881025;
                        } else {
                            scrimColor = j3;
                        }
                        if (i9 != 0) {
                            ne1Var2 = fj0.a;
                        } else {
                            ne1Var2 = ne1Var;
                        }
                        ne1Var3 = ne1Var2;
                        if ((i3 & 1024) != 0) {
                            windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                            i17 &= -15;
                        } else {
                            windowInsets = eVar;
                        }
                        if (i12 != 0) {
                            ne1Var4 = ne1Var3;
                            cVar4 = cVar3;
                            i18 = i17;
                            i19 = i4;
                            rg3Var2 = expandedShape;
                            f6 = f3;
                            j4 = containerColor;
                            long j111111115 = scrimColor;
                            if2Var2 = le2.a;
                            hh3Var2 = hh3VarRememberModalBottomSheetState;
                            f5 = f4;
                            j5 = jM2x310ea166;
                            j6 = j111111115;
                        } else {
                            ne1Var4 = ne1Var3;
                            cVar4 = cVar3;
                            hh3Var2 = hh3VarRememberModalBottomSheetState;
                            i18 = i17;
                            i19 = i4;
                            f5 = f4;
                            rg3Var2 = expandedShape;
                            f6 = f3;
                            j4 = containerColor;
                            j5 = jM2x310ea166;
                            j6 = scrimColor;
                            if2Var2 = if2Var;
                        }
                    } else {
                        if (i25 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                            hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                        }
                        if (i5 != 0) {
                            f3 = 640.0f;
                        } else {
                            f3 = f;
                        }
                        i16 = i3 & 16;
                        owVar = ow.a;
                        if (i16 != 0) {
                            expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                            i4 &= -57345;
                        }
                        if ((i3 & 32) != 0) {
                            containerColor = owVar.getContainerColor(kk0Var2, 6);
                            i4 &= -458753;
                        }
                        if ((i3 & 64) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                            i4 &= -3670017;
                        }
                        if (i7 != 0) {
                            f4 = 0.0f;
                        } else {
                            f4 = f2;
                        }
                        i17 = i14;
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            scrimColor = owVar.getScrimColor(kk0Var2, 6);
                            i4 &= -234881025;
                        } else {
                            scrimColor = j3;
                        }
                        if (i9 != 0) {
                            ne1Var2 = fj0.a;
                        } else {
                            ne1Var2 = ne1Var;
                        }
                        ne1Var3 = ne1Var2;
                        if ((i3 & 1024) != 0) {
                            windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                            i17 &= -15;
                        } else {
                            windowInsets = eVar;
                        }
                        if (i12 != 0) {
                            ne1Var4 = ne1Var3;
                            cVar4 = cVar3;
                            i18 = i17;
                            i19 = i4;
                            rg3Var2 = expandedShape;
                            f6 = f3;
                            j4 = containerColor;
                            long j111111116 = scrimColor;
                            if2Var2 = le2.a;
                            hh3Var2 = hh3VarRememberModalBottomSheetState;
                            f5 = f4;
                            j5 = jM2x310ea166;
                            j6 = j111111116;
                        } else {
                            ne1Var4 = ne1Var3;
                            cVar4 = cVar3;
                            hh3Var2 = hh3VarRememberModalBottomSheetState;
                            i18 = i17;
                            i19 = i4;
                            f5 = f4;
                            rg3Var2 = expandedShape;
                            f6 = f3;
                            j4 = containerColor;
                            j5 = jM2x310ea166;
                            j6 = scrimColor;
                            if2Var2 = if2Var;
                        }
                    }
                    kk0Var2.s();
                    kk0Var = kk0Var2;
                    oe1 oe1Var11111 = oe1Var2;
                    c cVar11114 = cVar4;
                    hf2.m206x750f78f8(je1Var, cVar11114, hh3Var2, f6, rg3Var2, j4, j5, f5, j6, ne1Var4, new jf2(windowInsets), if2Var2, oe1Var11111, kk0Var, i19 & 2147483646, i18 & 1008, 0);
                    cVar5 = cVar11114;
                    hh3Var3 = hh3Var2;
                    f7 = f6;
                    rg3Var3 = rg3Var2;
                    j7 = j4;
                    j8 = j5;
                    f8 = f5;
                    j9 = j6;
                    ne1Var5 = ne1Var4;
                    if2Var3 = if2Var2;
                    eVar2 = windowInsets;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new xe2(je1Var, cVar5, hh3Var3, f7, rg3Var3, j7, j8, f8, j9, ne1Var5, eVar2, if2Var3, oe1Var, i, i2, i3, 1));
                }
            }
            i4 |= 12582912;
            if ((i & 100663296) != 0) {
                if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) == 0) {
                    i20 = 33554432;
                } else {
                    i20 = 33554432;
                }
                i4 |= i20;
            }
            i9 = i3 & ConstantsKt.MINIMUM_BLOCK_SIZE;
            if (i9 != 0) {
                if ((i & 805306368) == 0) {
                    if (kk0Var2.j(ne1Var)) {
                        i10 = 536870912;
                    } else {
                        i10 = 268435456;
                    }
                    i4 |= i10;
                }
                if ((i2 & 6) == 0) {
                    i11 = i2 | (((i3 & 1024) == 0 || !kk0Var2.h(eVar)) ? 2 : 4);
                } else {
                    i11 = i2;
                }
                i12 = i3 & 2048;
                if (i12 != 0) {
                    i11 |= 48;
                } else if ((i2 & 48) != 0) {
                    if (kk0Var2.h(if2Var)) {
                        i13 = 32;
                    } else {
                        i13 = 16;
                    }
                    i11 |= i13;
                }
                i14 = i11;
                if ((i3 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
                    if ((i2 & 384) == 0) {
                        oe1Var2 = oe1Var;
                        if (kk0Var2.j(oe1Var2)) {
                            i15 = FontInfo.NUMBER_OF_CHAR_CODES;
                        } else {
                            i15 = Uuid.SIZE_BITS;
                        }
                        i14 |= i15;
                    }
                    if ((306783379 & i4) != 306783378) {
                        kk0Var2.X();
                        if ((i & 1) != 0) {
                            if (i25 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if ((i3 & 4) != 0) {
                                i4 &= -897;
                                hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                            }
                            if (i5 != 0) {
                                f3 = 640.0f;
                            } else {
                                f3 = f;
                            }
                            i16 = i3 & 16;
                            owVar = ow.a;
                            if (i16 != 0) {
                                expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                                i4 &= -57345;
                            }
                            if ((i3 & 32) != 0) {
                                containerColor = owVar.getContainerColor(kk0Var2, 6);
                                i4 &= -458753;
                            }
                            if ((i3 & 64) != 0) {
                                jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                                i4 &= -3670017;
                            }
                            if (i7 != 0) {
                                f4 = 0.0f;
                            } else {
                                f4 = f2;
                            }
                            i17 = i14;
                            if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                scrimColor = owVar.getScrimColor(kk0Var2, 6);
                                i4 &= -234881025;
                            } else {
                                scrimColor = j3;
                            }
                            if (i9 != 0) {
                                ne1Var2 = fj0.a;
                            } else {
                                ne1Var2 = ne1Var;
                            }
                            ne1Var3 = ne1Var2;
                            if ((i3 & 1024) != 0) {
                                windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                                i17 &= -15;
                            } else {
                                windowInsets = eVar;
                            }
                            if (i12 != 0) {
                                ne1Var4 = ne1Var3;
                                cVar4 = cVar3;
                                i18 = i17;
                                i19 = i4;
                                rg3Var2 = expandedShape;
                                f6 = f3;
                                j4 = containerColor;
                                long j111111117 = scrimColor;
                                if2Var2 = le2.a;
                                hh3Var2 = hh3VarRememberModalBottomSheetState;
                                f5 = f4;
                                j5 = jM2x310ea166;
                                j6 = j111111117;
                            } else {
                                ne1Var4 = ne1Var3;
                                cVar4 = cVar3;
                                hh3Var2 = hh3VarRememberModalBottomSheetState;
                                i18 = i17;
                                i19 = i4;
                                f5 = f4;
                                rg3Var2 = expandedShape;
                                f6 = f3;
                                j4 = containerColor;
                                j5 = jM2x310ea166;
                                j6 = scrimColor;
                                if2Var2 = if2Var;
                            }
                        } else {
                            if (i25 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if ((i3 & 4) != 0) {
                                i4 &= -897;
                                hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                            }
                            if (i5 != 0) {
                                f3 = 640.0f;
                            } else {
                                f3 = f;
                            }
                            i16 = i3 & 16;
                            owVar = ow.a;
                            if (i16 != 0) {
                                expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                                i4 &= -57345;
                            }
                            if ((i3 & 32) != 0) {
                                containerColor = owVar.getContainerColor(kk0Var2, 6);
                                i4 &= -458753;
                            }
                            if ((i3 & 64) != 0) {
                                jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                                i4 &= -3670017;
                            }
                            if (i7 != 0) {
                                f4 = 0.0f;
                            } else {
                                f4 = f2;
                            }
                            i17 = i14;
                            if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                scrimColor = owVar.getScrimColor(kk0Var2, 6);
                                i4 &= -234881025;
                            } else {
                                scrimColor = j3;
                            }
                            if (i9 != 0) {
                                ne1Var2 = fj0.a;
                            } else {
                                ne1Var2 = ne1Var;
                            }
                            ne1Var3 = ne1Var2;
                            if ((i3 & 1024) != 0) {
                                windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                                i17 &= -15;
                            } else {
                                windowInsets = eVar;
                            }
                            if (i12 != 0) {
                                ne1Var4 = ne1Var3;
                                cVar4 = cVar3;
                                i18 = i17;
                                i19 = i4;
                                rg3Var2 = expandedShape;
                                f6 = f3;
                                j4 = containerColor;
                                long j111111118 = scrimColor;
                                if2Var2 = le2.a;
                                hh3Var2 = hh3VarRememberModalBottomSheetState;
                                f5 = f4;
                                j5 = jM2x310ea166;
                                j6 = j111111118;
                            } else {
                                ne1Var4 = ne1Var3;
                                cVar4 = cVar3;
                                hh3Var2 = hh3VarRememberModalBottomSheetState;
                                i18 = i17;
                                i19 = i4;
                                f5 = f4;
                                rg3Var2 = expandedShape;
                                f6 = f3;
                                j4 = containerColor;
                                j5 = jM2x310ea166;
                                j6 = scrimColor;
                                if2Var2 = if2Var;
                            }
                        }
                        kk0Var2.s();
                        kk0Var = kk0Var2;
                        oe1 oe1Var11112 = oe1Var2;
                        c cVar11115 = cVar4;
                        hf2.m206x750f78f8(je1Var, cVar11115, hh3Var2, f6, rg3Var2, j4, j5, f5, j6, ne1Var4, new jf2(windowInsets), if2Var2, oe1Var11112, kk0Var, i19 & 2147483646, i18 & 1008, 0);
                        cVar5 = cVar11115;
                        hh3Var3 = hh3Var2;
                        f7 = f6;
                        rg3Var3 = rg3Var2;
                        j7 = j4;
                        j8 = j5;
                        f8 = f5;
                        j9 = j6;
                        ne1Var5 = ne1Var4;
                        if2Var3 = if2Var2;
                        eVar2 = windowInsets;
                    } else {
                        kk0Var2.X();
                        if ((i & 1) != 0) {
                            if (i25 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if ((i3 & 4) != 0) {
                                i4 &= -897;
                                hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                            }
                            if (i5 != 0) {
                                f3 = 640.0f;
                            } else {
                                f3 = f;
                            }
                            i16 = i3 & 16;
                            owVar = ow.a;
                            if (i16 != 0) {
                                expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                                i4 &= -57345;
                            }
                            if ((i3 & 32) != 0) {
                                containerColor = owVar.getContainerColor(kk0Var2, 6);
                                i4 &= -458753;
                            }
                            if ((i3 & 64) != 0) {
                                jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                                i4 &= -3670017;
                            }
                            if (i7 != 0) {
                                f4 = 0.0f;
                            } else {
                                f4 = f2;
                            }
                            i17 = i14;
                            if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                scrimColor = owVar.getScrimColor(kk0Var2, 6);
                                i4 &= -234881025;
                            } else {
                                scrimColor = j3;
                            }
                            if (i9 != 0) {
                                ne1Var2 = fj0.a;
                            } else {
                                ne1Var2 = ne1Var;
                            }
                            ne1Var3 = ne1Var2;
                            if ((i3 & 1024) != 0) {
                                windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                                i17 &= -15;
                            } else {
                                windowInsets = eVar;
                            }
                            if (i12 != 0) {
                                ne1Var4 = ne1Var3;
                                cVar4 = cVar3;
                                i18 = i17;
                                i19 = i4;
                                rg3Var2 = expandedShape;
                                f6 = f3;
                                j4 = containerColor;
                                long j111111119 = scrimColor;
                                if2Var2 = le2.a;
                                hh3Var2 = hh3VarRememberModalBottomSheetState;
                                f5 = f4;
                                j5 = jM2x310ea166;
                                j6 = j111111119;
                            } else {
                                ne1Var4 = ne1Var3;
                                cVar4 = cVar3;
                                hh3Var2 = hh3VarRememberModalBottomSheetState;
                                i18 = i17;
                                i19 = i4;
                                f5 = f4;
                                rg3Var2 = expandedShape;
                                f6 = f3;
                                j4 = containerColor;
                                j5 = jM2x310ea166;
                                j6 = scrimColor;
                                if2Var2 = if2Var;
                            }
                        } else {
                            if (i25 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if ((i3 & 4) != 0) {
                                i4 &= -897;
                                hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                            }
                            if (i5 != 0) {
                                f3 = 640.0f;
                            } else {
                                f3 = f;
                            }
                            i16 = i3 & 16;
                            owVar = ow.a;
                            if (i16 != 0) {
                                expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                                i4 &= -57345;
                            }
                            if ((i3 & 32) != 0) {
                                containerColor = owVar.getContainerColor(kk0Var2, 6);
                                i4 &= -458753;
                            }
                            if ((i3 & 64) != 0) {
                                jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                                i4 &= -3670017;
                            }
                            if (i7 != 0) {
                                f4 = 0.0f;
                            } else {
                                f4 = f2;
                            }
                            i17 = i14;
                            if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                scrimColor = owVar.getScrimColor(kk0Var2, 6);
                                i4 &= -234881025;
                            } else {
                                scrimColor = j3;
                            }
                            if (i9 != 0) {
                                ne1Var2 = fj0.a;
                            } else {
                                ne1Var2 = ne1Var;
                            }
                            ne1Var3 = ne1Var2;
                            if ((i3 & 1024) != 0) {
                                windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                                i17 &= -15;
                            } else {
                                windowInsets = eVar;
                            }
                            if (i12 != 0) {
                                ne1Var4 = ne1Var3;
                                cVar4 = cVar3;
                                i18 = i17;
                                i19 = i4;
                                rg3Var2 = expandedShape;
                                f6 = f3;
                                j4 = containerColor;
                                long j1111111110 = scrimColor;
                                if2Var2 = le2.a;
                                hh3Var2 = hh3VarRememberModalBottomSheetState;
                                f5 = f4;
                                j5 = jM2x310ea166;
                                j6 = j1111111110;
                            } else {
                                ne1Var4 = ne1Var3;
                                cVar4 = cVar3;
                                hh3Var2 = hh3VarRememberModalBottomSheetState;
                                i18 = i17;
                                i19 = i4;
                                f5 = f4;
                                rg3Var2 = expandedShape;
                                f6 = f3;
                                j4 = containerColor;
                                j5 = jM2x310ea166;
                                j6 = scrimColor;
                                if2Var2 = if2Var;
                            }
                        }
                        kk0Var2.s();
                        kk0Var = kk0Var2;
                        oe1 oe1Var11113 = oe1Var2;
                        c cVar11116 = cVar4;
                        hf2.m206x750f78f8(je1Var, cVar11116, hh3Var2, f6, rg3Var2, j4, j5, f5, j6, ne1Var4, new jf2(windowInsets), if2Var2, oe1Var11113, kk0Var, i19 & 2147483646, i18 & 1008, 0);
                        cVar5 = cVar11116;
                        hh3Var3 = hh3Var2;
                        f7 = f6;
                        rg3Var3 = rg3Var2;
                        j7 = j4;
                        j8 = j5;
                        f8 = f5;
                        j9 = j6;
                        ne1Var5 = ne1Var4;
                        if2Var3 = if2Var2;
                        eVar2 = windowInsets;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new xe2(je1Var, cVar5, hh3Var3, f7, rg3Var3, j7, j8, f8, j9, ne1Var5, eVar2, if2Var3, oe1Var, i, i2, i3, 1));
                    }
                }
                i14 |= 384;
                oe1Var2 = oe1Var;
                if ((306783379 & i4) != 306783378) {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i25 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                            hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                        }
                        if (i5 != 0) {
                            f3 = 640.0f;
                        } else {
                            f3 = f;
                        }
                        i16 = i3 & 16;
                        owVar = ow.a;
                        if (i16 != 0) {
                            expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                            i4 &= -57345;
                        }
                        if ((i3 & 32) != 0) {
                            containerColor = owVar.getContainerColor(kk0Var2, 6);
                            i4 &= -458753;
                        }
                        if ((i3 & 64) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                            i4 &= -3670017;
                        }
                        if (i7 != 0) {
                            f4 = 0.0f;
                        } else {
                            f4 = f2;
                        }
                        i17 = i14;
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            scrimColor = owVar.getScrimColor(kk0Var2, 6);
                            i4 &= -234881025;
                        } else {
                            scrimColor = j3;
                        }
                        if (i9 != 0) {
                            ne1Var2 = fj0.a;
                        } else {
                            ne1Var2 = ne1Var;
                        }
                        ne1Var3 = ne1Var2;
                        if ((i3 & 1024) != 0) {
                            windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                            i17 &= -15;
                        } else {
                            windowInsets = eVar;
                        }
                        if (i12 != 0) {
                            ne1Var4 = ne1Var3;
                            cVar4 = cVar3;
                            i18 = i17;
                            i19 = i4;
                            rg3Var2 = expandedShape;
                            f6 = f3;
                            j4 = containerColor;
                            long j1111111111 = scrimColor;
                            if2Var2 = le2.a;
                            hh3Var2 = hh3VarRememberModalBottomSheetState;
                            f5 = f4;
                            j5 = jM2x310ea166;
                            j6 = j1111111111;
                        } else {
                            ne1Var4 = ne1Var3;
                            cVar4 = cVar3;
                            hh3Var2 = hh3VarRememberModalBottomSheetState;
                            i18 = i17;
                            i19 = i4;
                            f5 = f4;
                            rg3Var2 = expandedShape;
                            f6 = f3;
                            j4 = containerColor;
                            j5 = jM2x310ea166;
                            j6 = scrimColor;
                            if2Var2 = if2Var;
                        }
                    } else {
                        if (i25 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                            hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                        }
                        if (i5 != 0) {
                            f3 = 640.0f;
                        } else {
                            f3 = f;
                        }
                        i16 = i3 & 16;
                        owVar = ow.a;
                        if (i16 != 0) {
                            expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                            i4 &= -57345;
                        }
                        if ((i3 & 32) != 0) {
                            containerColor = owVar.getContainerColor(kk0Var2, 6);
                            i4 &= -458753;
                        }
                        if ((i3 & 64) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                            i4 &= -3670017;
                        }
                        if (i7 != 0) {
                            f4 = 0.0f;
                        } else {
                            f4 = f2;
                        }
                        i17 = i14;
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            scrimColor = owVar.getScrimColor(kk0Var2, 6);
                            i4 &= -234881025;
                        } else {
                            scrimColor = j3;
                        }
                        if (i9 != 0) {
                            ne1Var2 = fj0.a;
                        } else {
                            ne1Var2 = ne1Var;
                        }
                        ne1Var3 = ne1Var2;
                        if ((i3 & 1024) != 0) {
                            windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                            i17 &= -15;
                        } else {
                            windowInsets = eVar;
                        }
                        if (i12 != 0) {
                            ne1Var4 = ne1Var3;
                            cVar4 = cVar3;
                            i18 = i17;
                            i19 = i4;
                            rg3Var2 = expandedShape;
                            f6 = f3;
                            j4 = containerColor;
                            long j1111111112 = scrimColor;
                            if2Var2 = le2.a;
                            hh3Var2 = hh3VarRememberModalBottomSheetState;
                            f5 = f4;
                            j5 = jM2x310ea166;
                            j6 = j1111111112;
                        } else {
                            ne1Var4 = ne1Var3;
                            cVar4 = cVar3;
                            hh3Var2 = hh3VarRememberModalBottomSheetState;
                            i18 = i17;
                            i19 = i4;
                            f5 = f4;
                            rg3Var2 = expandedShape;
                            f6 = f3;
                            j4 = containerColor;
                            j5 = jM2x310ea166;
                            j6 = scrimColor;
                            if2Var2 = if2Var;
                        }
                    }
                    kk0Var2.s();
                    kk0Var = kk0Var2;
                    oe1 oe1Var11114 = oe1Var2;
                    c cVar11117 = cVar4;
                    hf2.m206x750f78f8(je1Var, cVar11117, hh3Var2, f6, rg3Var2, j4, j5, f5, j6, ne1Var4, new jf2(windowInsets), if2Var2, oe1Var11114, kk0Var, i19 & 2147483646, i18 & 1008, 0);
                    cVar5 = cVar11117;
                    hh3Var3 = hh3Var2;
                    f7 = f6;
                    rg3Var3 = rg3Var2;
                    j7 = j4;
                    j8 = j5;
                    f8 = f5;
                    j9 = j6;
                    ne1Var5 = ne1Var4;
                    if2Var3 = if2Var2;
                    eVar2 = windowInsets;
                } else {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i25 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                            hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                        }
                        if (i5 != 0) {
                            f3 = 640.0f;
                        } else {
                            f3 = f;
                        }
                        i16 = i3 & 16;
                        owVar = ow.a;
                        if (i16 != 0) {
                            expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                            i4 &= -57345;
                        }
                        if ((i3 & 32) != 0) {
                            containerColor = owVar.getContainerColor(kk0Var2, 6);
                            i4 &= -458753;
                        }
                        if ((i3 & 64) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                            i4 &= -3670017;
                        }
                        if (i7 != 0) {
                            f4 = 0.0f;
                        } else {
                            f4 = f2;
                        }
                        i17 = i14;
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            scrimColor = owVar.getScrimColor(kk0Var2, 6);
                            i4 &= -234881025;
                        } else {
                            scrimColor = j3;
                        }
                        if (i9 != 0) {
                            ne1Var2 = fj0.a;
                        } else {
                            ne1Var2 = ne1Var;
                        }
                        ne1Var3 = ne1Var2;
                        if ((i3 & 1024) != 0) {
                            windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                            i17 &= -15;
                        } else {
                            windowInsets = eVar;
                        }
                        if (i12 != 0) {
                            ne1Var4 = ne1Var3;
                            cVar4 = cVar3;
                            i18 = i17;
                            i19 = i4;
                            rg3Var2 = expandedShape;
                            f6 = f3;
                            j4 = containerColor;
                            long j1111111113 = scrimColor;
                            if2Var2 = le2.a;
                            hh3Var2 = hh3VarRememberModalBottomSheetState;
                            f5 = f4;
                            j5 = jM2x310ea166;
                            j6 = j1111111113;
                        } else {
                            ne1Var4 = ne1Var3;
                            cVar4 = cVar3;
                            hh3Var2 = hh3VarRememberModalBottomSheetState;
                            i18 = i17;
                            i19 = i4;
                            f5 = f4;
                            rg3Var2 = expandedShape;
                            f6 = f3;
                            j4 = containerColor;
                            j5 = jM2x310ea166;
                            j6 = scrimColor;
                            if2Var2 = if2Var;
                        }
                    } else {
                        if (i25 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                            hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                        }
                        if (i5 != 0) {
                            f3 = 640.0f;
                        } else {
                            f3 = f;
                        }
                        i16 = i3 & 16;
                        owVar = ow.a;
                        if (i16 != 0) {
                            expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                            i4 &= -57345;
                        }
                        if ((i3 & 32) != 0) {
                            containerColor = owVar.getContainerColor(kk0Var2, 6);
                            i4 &= -458753;
                        }
                        if ((i3 & 64) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                            i4 &= -3670017;
                        }
                        if (i7 != 0) {
                            f4 = 0.0f;
                        } else {
                            f4 = f2;
                        }
                        i17 = i14;
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            scrimColor = owVar.getScrimColor(kk0Var2, 6);
                            i4 &= -234881025;
                        } else {
                            scrimColor = j3;
                        }
                        if (i9 != 0) {
                            ne1Var2 = fj0.a;
                        } else {
                            ne1Var2 = ne1Var;
                        }
                        ne1Var3 = ne1Var2;
                        if ((i3 & 1024) != 0) {
                            windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                            i17 &= -15;
                        } else {
                            windowInsets = eVar;
                        }
                        if (i12 != 0) {
                            ne1Var4 = ne1Var3;
                            cVar4 = cVar3;
                            i18 = i17;
                            i19 = i4;
                            rg3Var2 = expandedShape;
                            f6 = f3;
                            j4 = containerColor;
                            long j1111111114 = scrimColor;
                            if2Var2 = le2.a;
                            hh3Var2 = hh3VarRememberModalBottomSheetState;
                            f5 = f4;
                            j5 = jM2x310ea166;
                            j6 = j1111111114;
                        } else {
                            ne1Var4 = ne1Var3;
                            cVar4 = cVar3;
                            hh3Var2 = hh3VarRememberModalBottomSheetState;
                            i18 = i17;
                            i19 = i4;
                            f5 = f4;
                            rg3Var2 = expandedShape;
                            f6 = f3;
                            j4 = containerColor;
                            j5 = jM2x310ea166;
                            j6 = scrimColor;
                            if2Var2 = if2Var;
                        }
                    }
                    kk0Var2.s();
                    kk0Var = kk0Var2;
                    oe1 oe1Var11115 = oe1Var2;
                    c cVar11118 = cVar4;
                    hf2.m206x750f78f8(je1Var, cVar11118, hh3Var2, f6, rg3Var2, j4, j5, f5, j6, ne1Var4, new jf2(windowInsets), if2Var2, oe1Var11115, kk0Var, i19 & 2147483646, i18 & 1008, 0);
                    cVar5 = cVar11118;
                    hh3Var3 = hh3Var2;
                    f7 = f6;
                    rg3Var3 = rg3Var2;
                    j7 = j4;
                    j8 = j5;
                    f8 = f5;
                    j9 = j6;
                    ne1Var5 = ne1Var4;
                    if2Var3 = if2Var2;
                    eVar2 = windowInsets;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new xe2(je1Var, cVar5, hh3Var3, f7, rg3Var3, j7, j8, f8, j9, ne1Var5, eVar2, if2Var3, oe1Var, i, i2, i3, 1));
                }
            }
            i4 |= 805306368;
            if ((i2 & 6) == 0) {
                i11 = i2 | (((i3 & 1024) == 0 || !kk0Var2.h(eVar)) ? 2 : 4);
            } else {
                i11 = i2;
            }
            i12 = i3 & 2048;
            if (i12 != 0) {
                i11 |= 48;
            } else if ((i2 & 48) != 0) {
                if (kk0Var2.h(if2Var)) {
                    i13 = 32;
                } else {
                    i13 = 16;
                }
                i11 |= i13;
            }
            i14 = i11;
            if ((i3 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
                if ((i2 & 384) == 0) {
                    oe1Var2 = oe1Var;
                    if (kk0Var2.j(oe1Var2)) {
                        i15 = FontInfo.NUMBER_OF_CHAR_CODES;
                    } else {
                        i15 = Uuid.SIZE_BITS;
                    }
                    i14 |= i15;
                }
                if ((306783379 & i4) != 306783378) {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i25 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                            hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                        }
                        if (i5 != 0) {
                            f3 = 640.0f;
                        } else {
                            f3 = f;
                        }
                        i16 = i3 & 16;
                        owVar = ow.a;
                        if (i16 != 0) {
                            expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                            i4 &= -57345;
                        }
                        if ((i3 & 32) != 0) {
                            containerColor = owVar.getContainerColor(kk0Var2, 6);
                            i4 &= -458753;
                        }
                        if ((i3 & 64) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                            i4 &= -3670017;
                        }
                        if (i7 != 0) {
                            f4 = 0.0f;
                        } else {
                            f4 = f2;
                        }
                        i17 = i14;
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            scrimColor = owVar.getScrimColor(kk0Var2, 6);
                            i4 &= -234881025;
                        } else {
                            scrimColor = j3;
                        }
                        if (i9 != 0) {
                            ne1Var2 = fj0.a;
                        } else {
                            ne1Var2 = ne1Var;
                        }
                        ne1Var3 = ne1Var2;
                        if ((i3 & 1024) != 0) {
                            windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                            i17 &= -15;
                        } else {
                            windowInsets = eVar;
                        }
                        if (i12 != 0) {
                            ne1Var4 = ne1Var3;
                            cVar4 = cVar3;
                            i18 = i17;
                            i19 = i4;
                            rg3Var2 = expandedShape;
                            f6 = f3;
                            j4 = containerColor;
                            long j1111111115 = scrimColor;
                            if2Var2 = le2.a;
                            hh3Var2 = hh3VarRememberModalBottomSheetState;
                            f5 = f4;
                            j5 = jM2x310ea166;
                            j6 = j1111111115;
                        } else {
                            ne1Var4 = ne1Var3;
                            cVar4 = cVar3;
                            hh3Var2 = hh3VarRememberModalBottomSheetState;
                            i18 = i17;
                            i19 = i4;
                            f5 = f4;
                            rg3Var2 = expandedShape;
                            f6 = f3;
                            j4 = containerColor;
                            j5 = jM2x310ea166;
                            j6 = scrimColor;
                            if2Var2 = if2Var;
                        }
                    } else {
                        if (i25 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                            hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                        }
                        if (i5 != 0) {
                            f3 = 640.0f;
                        } else {
                            f3 = f;
                        }
                        i16 = i3 & 16;
                        owVar = ow.a;
                        if (i16 != 0) {
                            expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                            i4 &= -57345;
                        }
                        if ((i3 & 32) != 0) {
                            containerColor = owVar.getContainerColor(kk0Var2, 6);
                            i4 &= -458753;
                        }
                        if ((i3 & 64) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                            i4 &= -3670017;
                        }
                        if (i7 != 0) {
                            f4 = 0.0f;
                        } else {
                            f4 = f2;
                        }
                        i17 = i14;
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            scrimColor = owVar.getScrimColor(kk0Var2, 6);
                            i4 &= -234881025;
                        } else {
                            scrimColor = j3;
                        }
                        if (i9 != 0) {
                            ne1Var2 = fj0.a;
                        } else {
                            ne1Var2 = ne1Var;
                        }
                        ne1Var3 = ne1Var2;
                        if ((i3 & 1024) != 0) {
                            windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                            i17 &= -15;
                        } else {
                            windowInsets = eVar;
                        }
                        if (i12 != 0) {
                            ne1Var4 = ne1Var3;
                            cVar4 = cVar3;
                            i18 = i17;
                            i19 = i4;
                            rg3Var2 = expandedShape;
                            f6 = f3;
                            j4 = containerColor;
                            long j1111111116 = scrimColor;
                            if2Var2 = le2.a;
                            hh3Var2 = hh3VarRememberModalBottomSheetState;
                            f5 = f4;
                            j5 = jM2x310ea166;
                            j6 = j1111111116;
                        } else {
                            ne1Var4 = ne1Var3;
                            cVar4 = cVar3;
                            hh3Var2 = hh3VarRememberModalBottomSheetState;
                            i18 = i17;
                            i19 = i4;
                            f5 = f4;
                            rg3Var2 = expandedShape;
                            f6 = f3;
                            j4 = containerColor;
                            j5 = jM2x310ea166;
                            j6 = scrimColor;
                            if2Var2 = if2Var;
                        }
                    }
                    kk0Var2.s();
                    kk0Var = kk0Var2;
                    oe1 oe1Var11116 = oe1Var2;
                    c cVar11119 = cVar4;
                    hf2.m206x750f78f8(je1Var, cVar11119, hh3Var2, f6, rg3Var2, j4, j5, f5, j6, ne1Var4, new jf2(windowInsets), if2Var2, oe1Var11116, kk0Var, i19 & 2147483646, i18 & 1008, 0);
                    cVar5 = cVar11119;
                    hh3Var3 = hh3Var2;
                    f7 = f6;
                    rg3Var3 = rg3Var2;
                    j7 = j4;
                    j8 = j5;
                    f8 = f5;
                    j9 = j6;
                    ne1Var5 = ne1Var4;
                    if2Var3 = if2Var2;
                    eVar2 = windowInsets;
                } else {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i25 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                            hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                        }
                        if (i5 != 0) {
                            f3 = 640.0f;
                        } else {
                            f3 = f;
                        }
                        i16 = i3 & 16;
                        owVar = ow.a;
                        if (i16 != 0) {
                            expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                            i4 &= -57345;
                        }
                        if ((i3 & 32) != 0) {
                            containerColor = owVar.getContainerColor(kk0Var2, 6);
                            i4 &= -458753;
                        }
                        if ((i3 & 64) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                            i4 &= -3670017;
                        }
                        if (i7 != 0) {
                            f4 = 0.0f;
                        } else {
                            f4 = f2;
                        }
                        i17 = i14;
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            scrimColor = owVar.getScrimColor(kk0Var2, 6);
                            i4 &= -234881025;
                        } else {
                            scrimColor = j3;
                        }
                        if (i9 != 0) {
                            ne1Var2 = fj0.a;
                        } else {
                            ne1Var2 = ne1Var;
                        }
                        ne1Var3 = ne1Var2;
                        if ((i3 & 1024) != 0) {
                            windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                            i17 &= -15;
                        } else {
                            windowInsets = eVar;
                        }
                        if (i12 != 0) {
                            ne1Var4 = ne1Var3;
                            cVar4 = cVar3;
                            i18 = i17;
                            i19 = i4;
                            rg3Var2 = expandedShape;
                            f6 = f3;
                            j4 = containerColor;
                            long j1111111117 = scrimColor;
                            if2Var2 = le2.a;
                            hh3Var2 = hh3VarRememberModalBottomSheetState;
                            f5 = f4;
                            j5 = jM2x310ea166;
                            j6 = j1111111117;
                        } else {
                            ne1Var4 = ne1Var3;
                            cVar4 = cVar3;
                            hh3Var2 = hh3VarRememberModalBottomSheetState;
                            i18 = i17;
                            i19 = i4;
                            f5 = f4;
                            rg3Var2 = expandedShape;
                            f6 = f3;
                            j4 = containerColor;
                            j5 = jM2x310ea166;
                            j6 = scrimColor;
                            if2Var2 = if2Var;
                        }
                    } else {
                        if (i25 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                            hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                        }
                        if (i5 != 0) {
                            f3 = 640.0f;
                        } else {
                            f3 = f;
                        }
                        i16 = i3 & 16;
                        owVar = ow.a;
                        if (i16 != 0) {
                            expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                            i4 &= -57345;
                        }
                        if ((i3 & 32) != 0) {
                            containerColor = owVar.getContainerColor(kk0Var2, 6);
                            i4 &= -458753;
                        }
                        if ((i3 & 64) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                            i4 &= -3670017;
                        }
                        if (i7 != 0) {
                            f4 = 0.0f;
                        } else {
                            f4 = f2;
                        }
                        i17 = i14;
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            scrimColor = owVar.getScrimColor(kk0Var2, 6);
                            i4 &= -234881025;
                        } else {
                            scrimColor = j3;
                        }
                        if (i9 != 0) {
                            ne1Var2 = fj0.a;
                        } else {
                            ne1Var2 = ne1Var;
                        }
                        ne1Var3 = ne1Var2;
                        if ((i3 & 1024) != 0) {
                            windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                            i17 &= -15;
                        } else {
                            windowInsets = eVar;
                        }
                        if (i12 != 0) {
                            ne1Var4 = ne1Var3;
                            cVar4 = cVar3;
                            i18 = i17;
                            i19 = i4;
                            rg3Var2 = expandedShape;
                            f6 = f3;
                            j4 = containerColor;
                            long j1111111118 = scrimColor;
                            if2Var2 = le2.a;
                            hh3Var2 = hh3VarRememberModalBottomSheetState;
                            f5 = f4;
                            j5 = jM2x310ea166;
                            j6 = j1111111118;
                        } else {
                            ne1Var4 = ne1Var3;
                            cVar4 = cVar3;
                            hh3Var2 = hh3VarRememberModalBottomSheetState;
                            i18 = i17;
                            i19 = i4;
                            f5 = f4;
                            rg3Var2 = expandedShape;
                            f6 = f3;
                            j4 = containerColor;
                            j5 = jM2x310ea166;
                            j6 = scrimColor;
                            if2Var2 = if2Var;
                        }
                    }
                    kk0Var2.s();
                    kk0Var = kk0Var2;
                    oe1 oe1Var11117 = oe1Var2;
                    c cVar111110 = cVar4;
                    hf2.m206x750f78f8(je1Var, cVar111110, hh3Var2, f6, rg3Var2, j4, j5, f5, j6, ne1Var4, new jf2(windowInsets), if2Var2, oe1Var11117, kk0Var, i19 & 2147483646, i18 & 1008, 0);
                    cVar5 = cVar111110;
                    hh3Var3 = hh3Var2;
                    f7 = f6;
                    rg3Var3 = rg3Var2;
                    j7 = j4;
                    j8 = j5;
                    f8 = f5;
                    j9 = j6;
                    ne1Var5 = ne1Var4;
                    if2Var3 = if2Var2;
                    eVar2 = windowInsets;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new xe2(je1Var, cVar5, hh3Var3, f7, rg3Var3, j7, j8, f8, j9, ne1Var5, eVar2, if2Var3, oe1Var, i, i2, i3, 1));
                }
            }
            i14 |= 384;
            oe1Var2 = oe1Var;
            if ((306783379 & i4) != 306783378) {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i25 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if ((i3 & 4) != 0) {
                        i4 &= -897;
                        hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                    }
                    if (i5 != 0) {
                        f3 = 640.0f;
                    } else {
                        f3 = f;
                    }
                    i16 = i3 & 16;
                    owVar = ow.a;
                    if (i16 != 0) {
                        expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                        i4 &= -57345;
                    }
                    if ((i3 & 32) != 0) {
                        containerColor = owVar.getContainerColor(kk0Var2, 6);
                        i4 &= -458753;
                    }
                    if ((i3 & 64) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                        i4 &= -3670017;
                    }
                    if (i7 != 0) {
                        f4 = 0.0f;
                    } else {
                        f4 = f2;
                    }
                    i17 = i14;
                    if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                        scrimColor = owVar.getScrimColor(kk0Var2, 6);
                        i4 &= -234881025;
                    } else {
                        scrimColor = j3;
                    }
                    if (i9 != 0) {
                        ne1Var2 = fj0.a;
                    } else {
                        ne1Var2 = ne1Var;
                    }
                    ne1Var3 = ne1Var2;
                    if ((i3 & 1024) != 0) {
                        windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                        i17 &= -15;
                    } else {
                        windowInsets = eVar;
                    }
                    if (i12 != 0) {
                        ne1Var4 = ne1Var3;
                        cVar4 = cVar3;
                        i18 = i17;
                        i19 = i4;
                        rg3Var2 = expandedShape;
                        f6 = f3;
                        j4 = containerColor;
                        long j1111111119 = scrimColor;
                        if2Var2 = le2.a;
                        hh3Var2 = hh3VarRememberModalBottomSheetState;
                        f5 = f4;
                        j5 = jM2x310ea166;
                        j6 = j1111111119;
                    } else {
                        ne1Var4 = ne1Var3;
                        cVar4 = cVar3;
                        hh3Var2 = hh3VarRememberModalBottomSheetState;
                        i18 = i17;
                        i19 = i4;
                        f5 = f4;
                        rg3Var2 = expandedShape;
                        f6 = f3;
                        j4 = containerColor;
                        j5 = jM2x310ea166;
                        j6 = scrimColor;
                        if2Var2 = if2Var;
                    }
                } else {
                    if (i25 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if ((i3 & 4) != 0) {
                        i4 &= -897;
                        hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                    }
                    if (i5 != 0) {
                        f3 = 640.0f;
                    } else {
                        f3 = f;
                    }
                    i16 = i3 & 16;
                    owVar = ow.a;
                    if (i16 != 0) {
                        expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                        i4 &= -57345;
                    }
                    if ((i3 & 32) != 0) {
                        containerColor = owVar.getContainerColor(kk0Var2, 6);
                        i4 &= -458753;
                    }
                    if ((i3 & 64) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                        i4 &= -3670017;
                    }
                    if (i7 != 0) {
                        f4 = 0.0f;
                    } else {
                        f4 = f2;
                    }
                    i17 = i14;
                    if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                        scrimColor = owVar.getScrimColor(kk0Var2, 6);
                        i4 &= -234881025;
                    } else {
                        scrimColor = j3;
                    }
                    if (i9 != 0) {
                        ne1Var2 = fj0.a;
                    } else {
                        ne1Var2 = ne1Var;
                    }
                    ne1Var3 = ne1Var2;
                    if ((i3 & 1024) != 0) {
                        windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                        i17 &= -15;
                    } else {
                        windowInsets = eVar;
                    }
                    if (i12 != 0) {
                        ne1Var4 = ne1Var3;
                        cVar4 = cVar3;
                        i18 = i17;
                        i19 = i4;
                        rg3Var2 = expandedShape;
                        f6 = f3;
                        j4 = containerColor;
                        long j11111111110 = scrimColor;
                        if2Var2 = le2.a;
                        hh3Var2 = hh3VarRememberModalBottomSheetState;
                        f5 = f4;
                        j5 = jM2x310ea166;
                        j6 = j11111111110;
                    } else {
                        ne1Var4 = ne1Var3;
                        cVar4 = cVar3;
                        hh3Var2 = hh3VarRememberModalBottomSheetState;
                        i18 = i17;
                        i19 = i4;
                        f5 = f4;
                        rg3Var2 = expandedShape;
                        f6 = f3;
                        j4 = containerColor;
                        j5 = jM2x310ea166;
                        j6 = scrimColor;
                        if2Var2 = if2Var;
                    }
                }
                kk0Var2.s();
                kk0Var = kk0Var2;
                oe1 oe1Var11118 = oe1Var2;
                c cVar111111 = cVar4;
                hf2.m206x750f78f8(je1Var, cVar111111, hh3Var2, f6, rg3Var2, j4, j5, f5, j6, ne1Var4, new jf2(windowInsets), if2Var2, oe1Var11118, kk0Var, i19 & 2147483646, i18 & 1008, 0);
                cVar5 = cVar111111;
                hh3Var3 = hh3Var2;
                f7 = f6;
                rg3Var3 = rg3Var2;
                j7 = j4;
                j8 = j5;
                f8 = f5;
                j9 = j6;
                ne1Var5 = ne1Var4;
                if2Var3 = if2Var2;
                eVar2 = windowInsets;
            } else {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i25 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if ((i3 & 4) != 0) {
                        i4 &= -897;
                        hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                    }
                    if (i5 != 0) {
                        f3 = 640.0f;
                    } else {
                        f3 = f;
                    }
                    i16 = i3 & 16;
                    owVar = ow.a;
                    if (i16 != 0) {
                        expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                        i4 &= -57345;
                    }
                    if ((i3 & 32) != 0) {
                        containerColor = owVar.getContainerColor(kk0Var2, 6);
                        i4 &= -458753;
                    }
                    if ((i3 & 64) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                        i4 &= -3670017;
                    }
                    if (i7 != 0) {
                        f4 = 0.0f;
                    } else {
                        f4 = f2;
                    }
                    i17 = i14;
                    if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                        scrimColor = owVar.getScrimColor(kk0Var2, 6);
                        i4 &= -234881025;
                    } else {
                        scrimColor = j3;
                    }
                    if (i9 != 0) {
                        ne1Var2 = fj0.a;
                    } else {
                        ne1Var2 = ne1Var;
                    }
                    ne1Var3 = ne1Var2;
                    if ((i3 & 1024) != 0) {
                        windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                        i17 &= -15;
                    } else {
                        windowInsets = eVar;
                    }
                    if (i12 != 0) {
                        ne1Var4 = ne1Var3;
                        cVar4 = cVar3;
                        i18 = i17;
                        i19 = i4;
                        rg3Var2 = expandedShape;
                        f6 = f3;
                        j4 = containerColor;
                        long j11111111111 = scrimColor;
                        if2Var2 = le2.a;
                        hh3Var2 = hh3VarRememberModalBottomSheetState;
                        f5 = f4;
                        j5 = jM2x310ea166;
                        j6 = j11111111111;
                    } else {
                        ne1Var4 = ne1Var3;
                        cVar4 = cVar3;
                        hh3Var2 = hh3VarRememberModalBottomSheetState;
                        i18 = i17;
                        i19 = i4;
                        f5 = f4;
                        rg3Var2 = expandedShape;
                        f6 = f3;
                        j4 = containerColor;
                        j5 = jM2x310ea166;
                        j6 = scrimColor;
                        if2Var2 = if2Var;
                    }
                } else {
                    if (i25 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if ((i3 & 4) != 0) {
                        i4 &= -897;
                        hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                    }
                    if (i5 != 0) {
                        f3 = 640.0f;
                    } else {
                        f3 = f;
                    }
                    i16 = i3 & 16;
                    owVar = ow.a;
                    if (i16 != 0) {
                        expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                        i4 &= -57345;
                    }
                    if ((i3 & 32) != 0) {
                        containerColor = owVar.getContainerColor(kk0Var2, 6);
                        i4 &= -458753;
                    }
                    if ((i3 & 64) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                        i4 &= -3670017;
                    }
                    if (i7 != 0) {
                        f4 = 0.0f;
                    } else {
                        f4 = f2;
                    }
                    i17 = i14;
                    if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                        scrimColor = owVar.getScrimColor(kk0Var2, 6);
                        i4 &= -234881025;
                    } else {
                        scrimColor = j3;
                    }
                    if (i9 != 0) {
                        ne1Var2 = fj0.a;
                    } else {
                        ne1Var2 = ne1Var;
                    }
                    ne1Var3 = ne1Var2;
                    if ((i3 & 1024) != 0) {
                        windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                        i17 &= -15;
                    } else {
                        windowInsets = eVar;
                    }
                    if (i12 != 0) {
                        ne1Var4 = ne1Var3;
                        cVar4 = cVar3;
                        i18 = i17;
                        i19 = i4;
                        rg3Var2 = expandedShape;
                        f6 = f3;
                        j4 = containerColor;
                        long j11111111112 = scrimColor;
                        if2Var2 = le2.a;
                        hh3Var2 = hh3VarRememberModalBottomSheetState;
                        f5 = f4;
                        j5 = jM2x310ea166;
                        j6 = j11111111112;
                    } else {
                        ne1Var4 = ne1Var3;
                        cVar4 = cVar3;
                        hh3Var2 = hh3VarRememberModalBottomSheetState;
                        i18 = i17;
                        i19 = i4;
                        f5 = f4;
                        rg3Var2 = expandedShape;
                        f6 = f3;
                        j4 = containerColor;
                        j5 = jM2x310ea166;
                        j6 = scrimColor;
                        if2Var2 = if2Var;
                    }
                }
                kk0Var2.s();
                kk0Var = kk0Var2;
                oe1 oe1Var11119 = oe1Var2;
                c cVar111112 = cVar4;
                hf2.m206x750f78f8(je1Var, cVar111112, hh3Var2, f6, rg3Var2, j4, j5, f5, j6, ne1Var4, new jf2(windowInsets), if2Var2, oe1Var11119, kk0Var, i19 & 2147483646, i18 & 1008, 0);
                cVar5 = cVar111112;
                hh3Var3 = hh3Var2;
                f7 = f6;
                rg3Var3 = rg3Var2;
                j7 = j4;
                j8 = j5;
                f8 = f5;
                j9 = j6;
                ne1Var5 = ne1Var4;
                if2Var3 = if2Var2;
                eVar2 = windowInsets;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new xe2(je1Var, cVar5, hh3Var3, f7, rg3Var3, j7, j8, f8, j9, ne1Var5, eVar2, if2Var3, oe1Var, i, i2, i3, 1));
            }
        }
        i4 |= 3072;
        if ((i & 24576) == 0) {
            if ((i3 & 16) == 0) {
                expandedShape = rg3Var;
                if (kk0Var2.h(expandedShape)) {
                    i23 = 16384;
                }
                i4 |= i23;
            } else {
                expandedShape = rg3Var;
            }
            i23 = ConstantsKt.DEFAULT_BUFFER_SIZE;
            i4 |= i23;
        } else {
            expandedShape = rg3Var;
        }
        if ((i & 196608) == 0) {
            containerColor = j;
            if ((i3 & 32) == 0) {
                i22 = 65536;
            } else {
                i22 = 65536;
            }
            i4 |= i22;
        } else {
            containerColor = j;
        }
        if ((i & 1572864) == 0) {
            jM2x310ea166 = j2;
            if ((i3 & 64) == 0) {
                i21 = 524288;
            } else {
                i21 = 524288;
            }
            i4 |= i21;
        } else {
            jM2x310ea166 = j2;
        }
        i7 = i3 & Uuid.SIZE_BITS;
        if (i7 != 0) {
            if ((i & 12582912) == 0) {
                if (kk0Var2.e(f2)) {
                    i8 = 8388608;
                } else {
                    i8 = 4194304;
                }
                i4 |= i8;
            }
            if ((i & 100663296) != 0) {
                if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) == 0) {
                    i20 = 33554432;
                } else {
                    i20 = 33554432;
                }
                i4 |= i20;
            }
            i9 = i3 & ConstantsKt.MINIMUM_BLOCK_SIZE;
            if (i9 != 0) {
                if ((i & 805306368) == 0) {
                    if (kk0Var2.j(ne1Var)) {
                        i10 = 536870912;
                    } else {
                        i10 = 268435456;
                    }
                    i4 |= i10;
                }
                if ((i2 & 6) == 0) {
                    i11 = i2 | (((i3 & 1024) == 0 || !kk0Var2.h(eVar)) ? 2 : 4);
                } else {
                    i11 = i2;
                }
                i12 = i3 & 2048;
                if (i12 != 0) {
                    i11 |= 48;
                } else if ((i2 & 48) != 0) {
                    if (kk0Var2.h(if2Var)) {
                        i13 = 32;
                    } else {
                        i13 = 16;
                    }
                    i11 |= i13;
                }
                i14 = i11;
                if ((i3 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
                    if ((i2 & 384) == 0) {
                        oe1Var2 = oe1Var;
                        if (kk0Var2.j(oe1Var2)) {
                            i15 = FontInfo.NUMBER_OF_CHAR_CODES;
                        } else {
                            i15 = Uuid.SIZE_BITS;
                        }
                        i14 |= i15;
                    }
                    if ((306783379 & i4) != 306783378) {
                        kk0Var2.X();
                        if ((i & 1) != 0) {
                            if (i25 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if ((i3 & 4) != 0) {
                                i4 &= -897;
                                hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                            }
                            if (i5 != 0) {
                                f3 = 640.0f;
                            } else {
                                f3 = f;
                            }
                            i16 = i3 & 16;
                            owVar = ow.a;
                            if (i16 != 0) {
                                expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                                i4 &= -57345;
                            }
                            if ((i3 & 32) != 0) {
                                containerColor = owVar.getContainerColor(kk0Var2, 6);
                                i4 &= -458753;
                            }
                            if ((i3 & 64) != 0) {
                                jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                                i4 &= -3670017;
                            }
                            if (i7 != 0) {
                                f4 = 0.0f;
                            } else {
                                f4 = f2;
                            }
                            i17 = i14;
                            if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                scrimColor = owVar.getScrimColor(kk0Var2, 6);
                                i4 &= -234881025;
                            } else {
                                scrimColor = j3;
                            }
                            if (i9 != 0) {
                                ne1Var2 = fj0.a;
                            } else {
                                ne1Var2 = ne1Var;
                            }
                            ne1Var3 = ne1Var2;
                            if ((i3 & 1024) != 0) {
                                windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                                i17 &= -15;
                            } else {
                                windowInsets = eVar;
                            }
                            if (i12 != 0) {
                                ne1Var4 = ne1Var3;
                                cVar4 = cVar3;
                                i18 = i17;
                                i19 = i4;
                                rg3Var2 = expandedShape;
                                f6 = f3;
                                j4 = containerColor;
                                long j11111111113 = scrimColor;
                                if2Var2 = le2.a;
                                hh3Var2 = hh3VarRememberModalBottomSheetState;
                                f5 = f4;
                                j5 = jM2x310ea166;
                                j6 = j11111111113;
                            } else {
                                ne1Var4 = ne1Var3;
                                cVar4 = cVar3;
                                hh3Var2 = hh3VarRememberModalBottomSheetState;
                                i18 = i17;
                                i19 = i4;
                                f5 = f4;
                                rg3Var2 = expandedShape;
                                f6 = f3;
                                j4 = containerColor;
                                j5 = jM2x310ea166;
                                j6 = scrimColor;
                                if2Var2 = if2Var;
                            }
                        } else {
                            if (i25 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if ((i3 & 4) != 0) {
                                i4 &= -897;
                                hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                            }
                            if (i5 != 0) {
                                f3 = 640.0f;
                            } else {
                                f3 = f;
                            }
                            i16 = i3 & 16;
                            owVar = ow.a;
                            if (i16 != 0) {
                                expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                                i4 &= -57345;
                            }
                            if ((i3 & 32) != 0) {
                                containerColor = owVar.getContainerColor(kk0Var2, 6);
                                i4 &= -458753;
                            }
                            if ((i3 & 64) != 0) {
                                jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                                i4 &= -3670017;
                            }
                            if (i7 != 0) {
                                f4 = 0.0f;
                            } else {
                                f4 = f2;
                            }
                            i17 = i14;
                            if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                scrimColor = owVar.getScrimColor(kk0Var2, 6);
                                i4 &= -234881025;
                            } else {
                                scrimColor = j3;
                            }
                            if (i9 != 0) {
                                ne1Var2 = fj0.a;
                            } else {
                                ne1Var2 = ne1Var;
                            }
                            ne1Var3 = ne1Var2;
                            if ((i3 & 1024) != 0) {
                                windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                                i17 &= -15;
                            } else {
                                windowInsets = eVar;
                            }
                            if (i12 != 0) {
                                ne1Var4 = ne1Var3;
                                cVar4 = cVar3;
                                i18 = i17;
                                i19 = i4;
                                rg3Var2 = expandedShape;
                                f6 = f3;
                                j4 = containerColor;
                                long j11111111114 = scrimColor;
                                if2Var2 = le2.a;
                                hh3Var2 = hh3VarRememberModalBottomSheetState;
                                f5 = f4;
                                j5 = jM2x310ea166;
                                j6 = j11111111114;
                            } else {
                                ne1Var4 = ne1Var3;
                                cVar4 = cVar3;
                                hh3Var2 = hh3VarRememberModalBottomSheetState;
                                i18 = i17;
                                i19 = i4;
                                f5 = f4;
                                rg3Var2 = expandedShape;
                                f6 = f3;
                                j4 = containerColor;
                                j5 = jM2x310ea166;
                                j6 = scrimColor;
                                if2Var2 = if2Var;
                            }
                        }
                        kk0Var2.s();
                        kk0Var = kk0Var2;
                        oe1 oe1Var111110 = oe1Var2;
                        c cVar111113 = cVar4;
                        hf2.m206x750f78f8(je1Var, cVar111113, hh3Var2, f6, rg3Var2, j4, j5, f5, j6, ne1Var4, new jf2(windowInsets), if2Var2, oe1Var111110, kk0Var, i19 & 2147483646, i18 & 1008, 0);
                        cVar5 = cVar111113;
                        hh3Var3 = hh3Var2;
                        f7 = f6;
                        rg3Var3 = rg3Var2;
                        j7 = j4;
                        j8 = j5;
                        f8 = f5;
                        j9 = j6;
                        ne1Var5 = ne1Var4;
                        if2Var3 = if2Var2;
                        eVar2 = windowInsets;
                    } else {
                        kk0Var2.X();
                        if ((i & 1) != 0) {
                            if (i25 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if ((i3 & 4) != 0) {
                                i4 &= -897;
                                hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                            }
                            if (i5 != 0) {
                                f3 = 640.0f;
                            } else {
                                f3 = f;
                            }
                            i16 = i3 & 16;
                            owVar = ow.a;
                            if (i16 != 0) {
                                expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                                i4 &= -57345;
                            }
                            if ((i3 & 32) != 0) {
                                containerColor = owVar.getContainerColor(kk0Var2, 6);
                                i4 &= -458753;
                            }
                            if ((i3 & 64) != 0) {
                                jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                                i4 &= -3670017;
                            }
                            if (i7 != 0) {
                                f4 = 0.0f;
                            } else {
                                f4 = f2;
                            }
                            i17 = i14;
                            if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                scrimColor = owVar.getScrimColor(kk0Var2, 6);
                                i4 &= -234881025;
                            } else {
                                scrimColor = j3;
                            }
                            if (i9 != 0) {
                                ne1Var2 = fj0.a;
                            } else {
                                ne1Var2 = ne1Var;
                            }
                            ne1Var3 = ne1Var2;
                            if ((i3 & 1024) != 0) {
                                windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                                i17 &= -15;
                            } else {
                                windowInsets = eVar;
                            }
                            if (i12 != 0) {
                                ne1Var4 = ne1Var3;
                                cVar4 = cVar3;
                                i18 = i17;
                                i19 = i4;
                                rg3Var2 = expandedShape;
                                f6 = f3;
                                j4 = containerColor;
                                long j11111111115 = scrimColor;
                                if2Var2 = le2.a;
                                hh3Var2 = hh3VarRememberModalBottomSheetState;
                                f5 = f4;
                                j5 = jM2x310ea166;
                                j6 = j11111111115;
                            } else {
                                ne1Var4 = ne1Var3;
                                cVar4 = cVar3;
                                hh3Var2 = hh3VarRememberModalBottomSheetState;
                                i18 = i17;
                                i19 = i4;
                                f5 = f4;
                                rg3Var2 = expandedShape;
                                f6 = f3;
                                j4 = containerColor;
                                j5 = jM2x310ea166;
                                j6 = scrimColor;
                                if2Var2 = if2Var;
                            }
                        } else {
                            if (i25 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if ((i3 & 4) != 0) {
                                i4 &= -897;
                                hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                            }
                            if (i5 != 0) {
                                f3 = 640.0f;
                            } else {
                                f3 = f;
                            }
                            i16 = i3 & 16;
                            owVar = ow.a;
                            if (i16 != 0) {
                                expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                                i4 &= -57345;
                            }
                            if ((i3 & 32) != 0) {
                                containerColor = owVar.getContainerColor(kk0Var2, 6);
                                i4 &= -458753;
                            }
                            if ((i3 & 64) != 0) {
                                jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                                i4 &= -3670017;
                            }
                            if (i7 != 0) {
                                f4 = 0.0f;
                            } else {
                                f4 = f2;
                            }
                            i17 = i14;
                            if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                scrimColor = owVar.getScrimColor(kk0Var2, 6);
                                i4 &= -234881025;
                            } else {
                                scrimColor = j3;
                            }
                            if (i9 != 0) {
                                ne1Var2 = fj0.a;
                            } else {
                                ne1Var2 = ne1Var;
                            }
                            ne1Var3 = ne1Var2;
                            if ((i3 & 1024) != 0) {
                                windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                                i17 &= -15;
                            } else {
                                windowInsets = eVar;
                            }
                            if (i12 != 0) {
                                ne1Var4 = ne1Var3;
                                cVar4 = cVar3;
                                i18 = i17;
                                i19 = i4;
                                rg3Var2 = expandedShape;
                                f6 = f3;
                                j4 = containerColor;
                                long j11111111116 = scrimColor;
                                if2Var2 = le2.a;
                                hh3Var2 = hh3VarRememberModalBottomSheetState;
                                f5 = f4;
                                j5 = jM2x310ea166;
                                j6 = j11111111116;
                            } else {
                                ne1Var4 = ne1Var3;
                                cVar4 = cVar3;
                                hh3Var2 = hh3VarRememberModalBottomSheetState;
                                i18 = i17;
                                i19 = i4;
                                f5 = f4;
                                rg3Var2 = expandedShape;
                                f6 = f3;
                                j4 = containerColor;
                                j5 = jM2x310ea166;
                                j6 = scrimColor;
                                if2Var2 = if2Var;
                            }
                        }
                        kk0Var2.s();
                        kk0Var = kk0Var2;
                        oe1 oe1Var111111 = oe1Var2;
                        c cVar111114 = cVar4;
                        hf2.m206x750f78f8(je1Var, cVar111114, hh3Var2, f6, rg3Var2, j4, j5, f5, j6, ne1Var4, new jf2(windowInsets), if2Var2, oe1Var111111, kk0Var, i19 & 2147483646, i18 & 1008, 0);
                        cVar5 = cVar111114;
                        hh3Var3 = hh3Var2;
                        f7 = f6;
                        rg3Var3 = rg3Var2;
                        j7 = j4;
                        j8 = j5;
                        f8 = f5;
                        j9 = j6;
                        ne1Var5 = ne1Var4;
                        if2Var3 = if2Var2;
                        eVar2 = windowInsets;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new xe2(je1Var, cVar5, hh3Var3, f7, rg3Var3, j7, j8, f8, j9, ne1Var5, eVar2, if2Var3, oe1Var, i, i2, i3, 1));
                    }
                }
                i14 |= 384;
                oe1Var2 = oe1Var;
                if ((306783379 & i4) != 306783378) {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i25 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                            hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                        }
                        if (i5 != 0) {
                            f3 = 640.0f;
                        } else {
                            f3 = f;
                        }
                        i16 = i3 & 16;
                        owVar = ow.a;
                        if (i16 != 0) {
                            expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                            i4 &= -57345;
                        }
                        if ((i3 & 32) != 0) {
                            containerColor = owVar.getContainerColor(kk0Var2, 6);
                            i4 &= -458753;
                        }
                        if ((i3 & 64) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                            i4 &= -3670017;
                        }
                        if (i7 != 0) {
                            f4 = 0.0f;
                        } else {
                            f4 = f2;
                        }
                        i17 = i14;
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            scrimColor = owVar.getScrimColor(kk0Var2, 6);
                            i4 &= -234881025;
                        } else {
                            scrimColor = j3;
                        }
                        if (i9 != 0) {
                            ne1Var2 = fj0.a;
                        } else {
                            ne1Var2 = ne1Var;
                        }
                        ne1Var3 = ne1Var2;
                        if ((i3 & 1024) != 0) {
                            windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                            i17 &= -15;
                        } else {
                            windowInsets = eVar;
                        }
                        if (i12 != 0) {
                            ne1Var4 = ne1Var3;
                            cVar4 = cVar3;
                            i18 = i17;
                            i19 = i4;
                            rg3Var2 = expandedShape;
                            f6 = f3;
                            j4 = containerColor;
                            long j11111111117 = scrimColor;
                            if2Var2 = le2.a;
                            hh3Var2 = hh3VarRememberModalBottomSheetState;
                            f5 = f4;
                            j5 = jM2x310ea166;
                            j6 = j11111111117;
                        } else {
                            ne1Var4 = ne1Var3;
                            cVar4 = cVar3;
                            hh3Var2 = hh3VarRememberModalBottomSheetState;
                            i18 = i17;
                            i19 = i4;
                            f5 = f4;
                            rg3Var2 = expandedShape;
                            f6 = f3;
                            j4 = containerColor;
                            j5 = jM2x310ea166;
                            j6 = scrimColor;
                            if2Var2 = if2Var;
                        }
                    } else {
                        if (i25 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                            hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                        }
                        if (i5 != 0) {
                            f3 = 640.0f;
                        } else {
                            f3 = f;
                        }
                        i16 = i3 & 16;
                        owVar = ow.a;
                        if (i16 != 0) {
                            expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                            i4 &= -57345;
                        }
                        if ((i3 & 32) != 0) {
                            containerColor = owVar.getContainerColor(kk0Var2, 6);
                            i4 &= -458753;
                        }
                        if ((i3 & 64) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                            i4 &= -3670017;
                        }
                        if (i7 != 0) {
                            f4 = 0.0f;
                        } else {
                            f4 = f2;
                        }
                        i17 = i14;
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            scrimColor = owVar.getScrimColor(kk0Var2, 6);
                            i4 &= -234881025;
                        } else {
                            scrimColor = j3;
                        }
                        if (i9 != 0) {
                            ne1Var2 = fj0.a;
                        } else {
                            ne1Var2 = ne1Var;
                        }
                        ne1Var3 = ne1Var2;
                        if ((i3 & 1024) != 0) {
                            windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                            i17 &= -15;
                        } else {
                            windowInsets = eVar;
                        }
                        if (i12 != 0) {
                            ne1Var4 = ne1Var3;
                            cVar4 = cVar3;
                            i18 = i17;
                            i19 = i4;
                            rg3Var2 = expandedShape;
                            f6 = f3;
                            j4 = containerColor;
                            long j11111111118 = scrimColor;
                            if2Var2 = le2.a;
                            hh3Var2 = hh3VarRememberModalBottomSheetState;
                            f5 = f4;
                            j5 = jM2x310ea166;
                            j6 = j11111111118;
                        } else {
                            ne1Var4 = ne1Var3;
                            cVar4 = cVar3;
                            hh3Var2 = hh3VarRememberModalBottomSheetState;
                            i18 = i17;
                            i19 = i4;
                            f5 = f4;
                            rg3Var2 = expandedShape;
                            f6 = f3;
                            j4 = containerColor;
                            j5 = jM2x310ea166;
                            j6 = scrimColor;
                            if2Var2 = if2Var;
                        }
                    }
                    kk0Var2.s();
                    kk0Var = kk0Var2;
                    oe1 oe1Var111112 = oe1Var2;
                    c cVar111115 = cVar4;
                    hf2.m206x750f78f8(je1Var, cVar111115, hh3Var2, f6, rg3Var2, j4, j5, f5, j6, ne1Var4, new jf2(windowInsets), if2Var2, oe1Var111112, kk0Var, i19 & 2147483646, i18 & 1008, 0);
                    cVar5 = cVar111115;
                    hh3Var3 = hh3Var2;
                    f7 = f6;
                    rg3Var3 = rg3Var2;
                    j7 = j4;
                    j8 = j5;
                    f8 = f5;
                    j9 = j6;
                    ne1Var5 = ne1Var4;
                    if2Var3 = if2Var2;
                    eVar2 = windowInsets;
                } else {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i25 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                            hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                        }
                        if (i5 != 0) {
                            f3 = 640.0f;
                        } else {
                            f3 = f;
                        }
                        i16 = i3 & 16;
                        owVar = ow.a;
                        if (i16 != 0) {
                            expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                            i4 &= -57345;
                        }
                        if ((i3 & 32) != 0) {
                            containerColor = owVar.getContainerColor(kk0Var2, 6);
                            i4 &= -458753;
                        }
                        if ((i3 & 64) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                            i4 &= -3670017;
                        }
                        if (i7 != 0) {
                            f4 = 0.0f;
                        } else {
                            f4 = f2;
                        }
                        i17 = i14;
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            scrimColor = owVar.getScrimColor(kk0Var2, 6);
                            i4 &= -234881025;
                        } else {
                            scrimColor = j3;
                        }
                        if (i9 != 0) {
                            ne1Var2 = fj0.a;
                        } else {
                            ne1Var2 = ne1Var;
                        }
                        ne1Var3 = ne1Var2;
                        if ((i3 & 1024) != 0) {
                            windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                            i17 &= -15;
                        } else {
                            windowInsets = eVar;
                        }
                        if (i12 != 0) {
                            ne1Var4 = ne1Var3;
                            cVar4 = cVar3;
                            i18 = i17;
                            i19 = i4;
                            rg3Var2 = expandedShape;
                            f6 = f3;
                            j4 = containerColor;
                            long j11111111119 = scrimColor;
                            if2Var2 = le2.a;
                            hh3Var2 = hh3VarRememberModalBottomSheetState;
                            f5 = f4;
                            j5 = jM2x310ea166;
                            j6 = j11111111119;
                        } else {
                            ne1Var4 = ne1Var3;
                            cVar4 = cVar3;
                            hh3Var2 = hh3VarRememberModalBottomSheetState;
                            i18 = i17;
                            i19 = i4;
                            f5 = f4;
                            rg3Var2 = expandedShape;
                            f6 = f3;
                            j4 = containerColor;
                            j5 = jM2x310ea166;
                            j6 = scrimColor;
                            if2Var2 = if2Var;
                        }
                    } else {
                        if (i25 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                            hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                        }
                        if (i5 != 0) {
                            f3 = 640.0f;
                        } else {
                            f3 = f;
                        }
                        i16 = i3 & 16;
                        owVar = ow.a;
                        if (i16 != 0) {
                            expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                            i4 &= -57345;
                        }
                        if ((i3 & 32) != 0) {
                            containerColor = owVar.getContainerColor(kk0Var2, 6);
                            i4 &= -458753;
                        }
                        if ((i3 & 64) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                            i4 &= -3670017;
                        }
                        if (i7 != 0) {
                            f4 = 0.0f;
                        } else {
                            f4 = f2;
                        }
                        i17 = i14;
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            scrimColor = owVar.getScrimColor(kk0Var2, 6);
                            i4 &= -234881025;
                        } else {
                            scrimColor = j3;
                        }
                        if (i9 != 0) {
                            ne1Var2 = fj0.a;
                        } else {
                            ne1Var2 = ne1Var;
                        }
                        ne1Var3 = ne1Var2;
                        if ((i3 & 1024) != 0) {
                            windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                            i17 &= -15;
                        } else {
                            windowInsets = eVar;
                        }
                        if (i12 != 0) {
                            ne1Var4 = ne1Var3;
                            cVar4 = cVar3;
                            i18 = i17;
                            i19 = i4;
                            rg3Var2 = expandedShape;
                            f6 = f3;
                            j4 = containerColor;
                            long j111111111110 = scrimColor;
                            if2Var2 = le2.a;
                            hh3Var2 = hh3VarRememberModalBottomSheetState;
                            f5 = f4;
                            j5 = jM2x310ea166;
                            j6 = j111111111110;
                        } else {
                            ne1Var4 = ne1Var3;
                            cVar4 = cVar3;
                            hh3Var2 = hh3VarRememberModalBottomSheetState;
                            i18 = i17;
                            i19 = i4;
                            f5 = f4;
                            rg3Var2 = expandedShape;
                            f6 = f3;
                            j4 = containerColor;
                            j5 = jM2x310ea166;
                            j6 = scrimColor;
                            if2Var2 = if2Var;
                        }
                    }
                    kk0Var2.s();
                    kk0Var = kk0Var2;
                    oe1 oe1Var111113 = oe1Var2;
                    c cVar111116 = cVar4;
                    hf2.m206x750f78f8(je1Var, cVar111116, hh3Var2, f6, rg3Var2, j4, j5, f5, j6, ne1Var4, new jf2(windowInsets), if2Var2, oe1Var111113, kk0Var, i19 & 2147483646, i18 & 1008, 0);
                    cVar5 = cVar111116;
                    hh3Var3 = hh3Var2;
                    f7 = f6;
                    rg3Var3 = rg3Var2;
                    j7 = j4;
                    j8 = j5;
                    f8 = f5;
                    j9 = j6;
                    ne1Var5 = ne1Var4;
                    if2Var3 = if2Var2;
                    eVar2 = windowInsets;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new xe2(je1Var, cVar5, hh3Var3, f7, rg3Var3, j7, j8, f8, j9, ne1Var5, eVar2, if2Var3, oe1Var, i, i2, i3, 1));
                }
            }
            i4 |= 805306368;
            if ((i2 & 6) == 0) {
                i11 = i2 | (((i3 & 1024) == 0 || !kk0Var2.h(eVar)) ? 2 : 4);
            } else {
                i11 = i2;
            }
            i12 = i3 & 2048;
            if (i12 != 0) {
                i11 |= 48;
            } else if ((i2 & 48) != 0) {
                if (kk0Var2.h(if2Var)) {
                    i13 = 32;
                } else {
                    i13 = 16;
                }
                i11 |= i13;
            }
            i14 = i11;
            if ((i3 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
                if ((i2 & 384) == 0) {
                    oe1Var2 = oe1Var;
                    if (kk0Var2.j(oe1Var2)) {
                        i15 = FontInfo.NUMBER_OF_CHAR_CODES;
                    } else {
                        i15 = Uuid.SIZE_BITS;
                    }
                    i14 |= i15;
                }
                if ((306783379 & i4) != 306783378) {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i25 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                            hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                        }
                        if (i5 != 0) {
                            f3 = 640.0f;
                        } else {
                            f3 = f;
                        }
                        i16 = i3 & 16;
                        owVar = ow.a;
                        if (i16 != 0) {
                            expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                            i4 &= -57345;
                        }
                        if ((i3 & 32) != 0) {
                            containerColor = owVar.getContainerColor(kk0Var2, 6);
                            i4 &= -458753;
                        }
                        if ((i3 & 64) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                            i4 &= -3670017;
                        }
                        if (i7 != 0) {
                            f4 = 0.0f;
                        } else {
                            f4 = f2;
                        }
                        i17 = i14;
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            scrimColor = owVar.getScrimColor(kk0Var2, 6);
                            i4 &= -234881025;
                        } else {
                            scrimColor = j3;
                        }
                        if (i9 != 0) {
                            ne1Var2 = fj0.a;
                        } else {
                            ne1Var2 = ne1Var;
                        }
                        ne1Var3 = ne1Var2;
                        if ((i3 & 1024) != 0) {
                            windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                            i17 &= -15;
                        } else {
                            windowInsets = eVar;
                        }
                        if (i12 != 0) {
                            ne1Var4 = ne1Var3;
                            cVar4 = cVar3;
                            i18 = i17;
                            i19 = i4;
                            rg3Var2 = expandedShape;
                            f6 = f3;
                            j4 = containerColor;
                            long j111111111111 = scrimColor;
                            if2Var2 = le2.a;
                            hh3Var2 = hh3VarRememberModalBottomSheetState;
                            f5 = f4;
                            j5 = jM2x310ea166;
                            j6 = j111111111111;
                        } else {
                            ne1Var4 = ne1Var3;
                            cVar4 = cVar3;
                            hh3Var2 = hh3VarRememberModalBottomSheetState;
                            i18 = i17;
                            i19 = i4;
                            f5 = f4;
                            rg3Var2 = expandedShape;
                            f6 = f3;
                            j4 = containerColor;
                            j5 = jM2x310ea166;
                            j6 = scrimColor;
                            if2Var2 = if2Var;
                        }
                    } else {
                        if (i25 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                            hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                        }
                        if (i5 != 0) {
                            f3 = 640.0f;
                        } else {
                            f3 = f;
                        }
                        i16 = i3 & 16;
                        owVar = ow.a;
                        if (i16 != 0) {
                            expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                            i4 &= -57345;
                        }
                        if ((i3 & 32) != 0) {
                            containerColor = owVar.getContainerColor(kk0Var2, 6);
                            i4 &= -458753;
                        }
                        if ((i3 & 64) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                            i4 &= -3670017;
                        }
                        if (i7 != 0) {
                            f4 = 0.0f;
                        } else {
                            f4 = f2;
                        }
                        i17 = i14;
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            scrimColor = owVar.getScrimColor(kk0Var2, 6);
                            i4 &= -234881025;
                        } else {
                            scrimColor = j3;
                        }
                        if (i9 != 0) {
                            ne1Var2 = fj0.a;
                        } else {
                            ne1Var2 = ne1Var;
                        }
                        ne1Var3 = ne1Var2;
                        if ((i3 & 1024) != 0) {
                            windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                            i17 &= -15;
                        } else {
                            windowInsets = eVar;
                        }
                        if (i12 != 0) {
                            ne1Var4 = ne1Var3;
                            cVar4 = cVar3;
                            i18 = i17;
                            i19 = i4;
                            rg3Var2 = expandedShape;
                            f6 = f3;
                            j4 = containerColor;
                            long j111111111112 = scrimColor;
                            if2Var2 = le2.a;
                            hh3Var2 = hh3VarRememberModalBottomSheetState;
                            f5 = f4;
                            j5 = jM2x310ea166;
                            j6 = j111111111112;
                        } else {
                            ne1Var4 = ne1Var3;
                            cVar4 = cVar3;
                            hh3Var2 = hh3VarRememberModalBottomSheetState;
                            i18 = i17;
                            i19 = i4;
                            f5 = f4;
                            rg3Var2 = expandedShape;
                            f6 = f3;
                            j4 = containerColor;
                            j5 = jM2x310ea166;
                            j6 = scrimColor;
                            if2Var2 = if2Var;
                        }
                    }
                    kk0Var2.s();
                    kk0Var = kk0Var2;
                    oe1 oe1Var111114 = oe1Var2;
                    c cVar111117 = cVar4;
                    hf2.m206x750f78f8(je1Var, cVar111117, hh3Var2, f6, rg3Var2, j4, j5, f5, j6, ne1Var4, new jf2(windowInsets), if2Var2, oe1Var111114, kk0Var, i19 & 2147483646, i18 & 1008, 0);
                    cVar5 = cVar111117;
                    hh3Var3 = hh3Var2;
                    f7 = f6;
                    rg3Var3 = rg3Var2;
                    j7 = j4;
                    j8 = j5;
                    f8 = f5;
                    j9 = j6;
                    ne1Var5 = ne1Var4;
                    if2Var3 = if2Var2;
                    eVar2 = windowInsets;
                } else {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i25 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                            hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                        }
                        if (i5 != 0) {
                            f3 = 640.0f;
                        } else {
                            f3 = f;
                        }
                        i16 = i3 & 16;
                        owVar = ow.a;
                        if (i16 != 0) {
                            expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                            i4 &= -57345;
                        }
                        if ((i3 & 32) != 0) {
                            containerColor = owVar.getContainerColor(kk0Var2, 6);
                            i4 &= -458753;
                        }
                        if ((i3 & 64) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                            i4 &= -3670017;
                        }
                        if (i7 != 0) {
                            f4 = 0.0f;
                        } else {
                            f4 = f2;
                        }
                        i17 = i14;
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            scrimColor = owVar.getScrimColor(kk0Var2, 6);
                            i4 &= -234881025;
                        } else {
                            scrimColor = j3;
                        }
                        if (i9 != 0) {
                            ne1Var2 = fj0.a;
                        } else {
                            ne1Var2 = ne1Var;
                        }
                        ne1Var3 = ne1Var2;
                        if ((i3 & 1024) != 0) {
                            windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                            i17 &= -15;
                        } else {
                            windowInsets = eVar;
                        }
                        if (i12 != 0) {
                            ne1Var4 = ne1Var3;
                            cVar4 = cVar3;
                            i18 = i17;
                            i19 = i4;
                            rg3Var2 = expandedShape;
                            f6 = f3;
                            j4 = containerColor;
                            long j111111111113 = scrimColor;
                            if2Var2 = le2.a;
                            hh3Var2 = hh3VarRememberModalBottomSheetState;
                            f5 = f4;
                            j5 = jM2x310ea166;
                            j6 = j111111111113;
                        } else {
                            ne1Var4 = ne1Var3;
                            cVar4 = cVar3;
                            hh3Var2 = hh3VarRememberModalBottomSheetState;
                            i18 = i17;
                            i19 = i4;
                            f5 = f4;
                            rg3Var2 = expandedShape;
                            f6 = f3;
                            j4 = containerColor;
                            j5 = jM2x310ea166;
                            j6 = scrimColor;
                            if2Var2 = if2Var;
                        }
                    } else {
                        if (i25 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                            hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                        }
                        if (i5 != 0) {
                            f3 = 640.0f;
                        } else {
                            f3 = f;
                        }
                        i16 = i3 & 16;
                        owVar = ow.a;
                        if (i16 != 0) {
                            expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                            i4 &= -57345;
                        }
                        if ((i3 & 32) != 0) {
                            containerColor = owVar.getContainerColor(kk0Var2, 6);
                            i4 &= -458753;
                        }
                        if ((i3 & 64) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                            i4 &= -3670017;
                        }
                        if (i7 != 0) {
                            f4 = 0.0f;
                        } else {
                            f4 = f2;
                        }
                        i17 = i14;
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            scrimColor = owVar.getScrimColor(kk0Var2, 6);
                            i4 &= -234881025;
                        } else {
                            scrimColor = j3;
                        }
                        if (i9 != 0) {
                            ne1Var2 = fj0.a;
                        } else {
                            ne1Var2 = ne1Var;
                        }
                        ne1Var3 = ne1Var2;
                        if ((i3 & 1024) != 0) {
                            windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                            i17 &= -15;
                        } else {
                            windowInsets = eVar;
                        }
                        if (i12 != 0) {
                            ne1Var4 = ne1Var3;
                            cVar4 = cVar3;
                            i18 = i17;
                            i19 = i4;
                            rg3Var2 = expandedShape;
                            f6 = f3;
                            j4 = containerColor;
                            long j111111111114 = scrimColor;
                            if2Var2 = le2.a;
                            hh3Var2 = hh3VarRememberModalBottomSheetState;
                            f5 = f4;
                            j5 = jM2x310ea166;
                            j6 = j111111111114;
                        } else {
                            ne1Var4 = ne1Var3;
                            cVar4 = cVar3;
                            hh3Var2 = hh3VarRememberModalBottomSheetState;
                            i18 = i17;
                            i19 = i4;
                            f5 = f4;
                            rg3Var2 = expandedShape;
                            f6 = f3;
                            j4 = containerColor;
                            j5 = jM2x310ea166;
                            j6 = scrimColor;
                            if2Var2 = if2Var;
                        }
                    }
                    kk0Var2.s();
                    kk0Var = kk0Var2;
                    oe1 oe1Var111115 = oe1Var2;
                    c cVar111118 = cVar4;
                    hf2.m206x750f78f8(je1Var, cVar111118, hh3Var2, f6, rg3Var2, j4, j5, f5, j6, ne1Var4, new jf2(windowInsets), if2Var2, oe1Var111115, kk0Var, i19 & 2147483646, i18 & 1008, 0);
                    cVar5 = cVar111118;
                    hh3Var3 = hh3Var2;
                    f7 = f6;
                    rg3Var3 = rg3Var2;
                    j7 = j4;
                    j8 = j5;
                    f8 = f5;
                    j9 = j6;
                    ne1Var5 = ne1Var4;
                    if2Var3 = if2Var2;
                    eVar2 = windowInsets;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new xe2(je1Var, cVar5, hh3Var3, f7, rg3Var3, j7, j8, f8, j9, ne1Var5, eVar2, if2Var3, oe1Var, i, i2, i3, 1));
                }
            }
            i14 |= 384;
            oe1Var2 = oe1Var;
            if ((306783379 & i4) != 306783378) {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i25 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if ((i3 & 4) != 0) {
                        i4 &= -897;
                        hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                    }
                    if (i5 != 0) {
                        f3 = 640.0f;
                    } else {
                        f3 = f;
                    }
                    i16 = i3 & 16;
                    owVar = ow.a;
                    if (i16 != 0) {
                        expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                        i4 &= -57345;
                    }
                    if ((i3 & 32) != 0) {
                        containerColor = owVar.getContainerColor(kk0Var2, 6);
                        i4 &= -458753;
                    }
                    if ((i3 & 64) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                        i4 &= -3670017;
                    }
                    if (i7 != 0) {
                        f4 = 0.0f;
                    } else {
                        f4 = f2;
                    }
                    i17 = i14;
                    if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                        scrimColor = owVar.getScrimColor(kk0Var2, 6);
                        i4 &= -234881025;
                    } else {
                        scrimColor = j3;
                    }
                    if (i9 != 0) {
                        ne1Var2 = fj0.a;
                    } else {
                        ne1Var2 = ne1Var;
                    }
                    ne1Var3 = ne1Var2;
                    if ((i3 & 1024) != 0) {
                        windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                        i17 &= -15;
                    } else {
                        windowInsets = eVar;
                    }
                    if (i12 != 0) {
                        ne1Var4 = ne1Var3;
                        cVar4 = cVar3;
                        i18 = i17;
                        i19 = i4;
                        rg3Var2 = expandedShape;
                        f6 = f3;
                        j4 = containerColor;
                        long j111111111115 = scrimColor;
                        if2Var2 = le2.a;
                        hh3Var2 = hh3VarRememberModalBottomSheetState;
                        f5 = f4;
                        j5 = jM2x310ea166;
                        j6 = j111111111115;
                    } else {
                        ne1Var4 = ne1Var3;
                        cVar4 = cVar3;
                        hh3Var2 = hh3VarRememberModalBottomSheetState;
                        i18 = i17;
                        i19 = i4;
                        f5 = f4;
                        rg3Var2 = expandedShape;
                        f6 = f3;
                        j4 = containerColor;
                        j5 = jM2x310ea166;
                        j6 = scrimColor;
                        if2Var2 = if2Var;
                    }
                } else {
                    if (i25 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if ((i3 & 4) != 0) {
                        i4 &= -897;
                        hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                    }
                    if (i5 != 0) {
                        f3 = 640.0f;
                    } else {
                        f3 = f;
                    }
                    i16 = i3 & 16;
                    owVar = ow.a;
                    if (i16 != 0) {
                        expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                        i4 &= -57345;
                    }
                    if ((i3 & 32) != 0) {
                        containerColor = owVar.getContainerColor(kk0Var2, 6);
                        i4 &= -458753;
                    }
                    if ((i3 & 64) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                        i4 &= -3670017;
                    }
                    if (i7 != 0) {
                        f4 = 0.0f;
                    } else {
                        f4 = f2;
                    }
                    i17 = i14;
                    if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                        scrimColor = owVar.getScrimColor(kk0Var2, 6);
                        i4 &= -234881025;
                    } else {
                        scrimColor = j3;
                    }
                    if (i9 != 0) {
                        ne1Var2 = fj0.a;
                    } else {
                        ne1Var2 = ne1Var;
                    }
                    ne1Var3 = ne1Var2;
                    if ((i3 & 1024) != 0) {
                        windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                        i17 &= -15;
                    } else {
                        windowInsets = eVar;
                    }
                    if (i12 != 0) {
                        ne1Var4 = ne1Var3;
                        cVar4 = cVar3;
                        i18 = i17;
                        i19 = i4;
                        rg3Var2 = expandedShape;
                        f6 = f3;
                        j4 = containerColor;
                        long j111111111116 = scrimColor;
                        if2Var2 = le2.a;
                        hh3Var2 = hh3VarRememberModalBottomSheetState;
                        f5 = f4;
                        j5 = jM2x310ea166;
                        j6 = j111111111116;
                    } else {
                        ne1Var4 = ne1Var3;
                        cVar4 = cVar3;
                        hh3Var2 = hh3VarRememberModalBottomSheetState;
                        i18 = i17;
                        i19 = i4;
                        f5 = f4;
                        rg3Var2 = expandedShape;
                        f6 = f3;
                        j4 = containerColor;
                        j5 = jM2x310ea166;
                        j6 = scrimColor;
                        if2Var2 = if2Var;
                    }
                }
                kk0Var2.s();
                kk0Var = kk0Var2;
                oe1 oe1Var111116 = oe1Var2;
                c cVar111119 = cVar4;
                hf2.m206x750f78f8(je1Var, cVar111119, hh3Var2, f6, rg3Var2, j4, j5, f5, j6, ne1Var4, new jf2(windowInsets), if2Var2, oe1Var111116, kk0Var, i19 & 2147483646, i18 & 1008, 0);
                cVar5 = cVar111119;
                hh3Var3 = hh3Var2;
                f7 = f6;
                rg3Var3 = rg3Var2;
                j7 = j4;
                j8 = j5;
                f8 = f5;
                j9 = j6;
                ne1Var5 = ne1Var4;
                if2Var3 = if2Var2;
                eVar2 = windowInsets;
            } else {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i25 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if ((i3 & 4) != 0) {
                        i4 &= -897;
                        hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                    }
                    if (i5 != 0) {
                        f3 = 640.0f;
                    } else {
                        f3 = f;
                    }
                    i16 = i3 & 16;
                    owVar = ow.a;
                    if (i16 != 0) {
                        expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                        i4 &= -57345;
                    }
                    if ((i3 & 32) != 0) {
                        containerColor = owVar.getContainerColor(kk0Var2, 6);
                        i4 &= -458753;
                    }
                    if ((i3 & 64) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                        i4 &= -3670017;
                    }
                    if (i7 != 0) {
                        f4 = 0.0f;
                    } else {
                        f4 = f2;
                    }
                    i17 = i14;
                    if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                        scrimColor = owVar.getScrimColor(kk0Var2, 6);
                        i4 &= -234881025;
                    } else {
                        scrimColor = j3;
                    }
                    if (i9 != 0) {
                        ne1Var2 = fj0.a;
                    } else {
                        ne1Var2 = ne1Var;
                    }
                    ne1Var3 = ne1Var2;
                    if ((i3 & 1024) != 0) {
                        windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                        i17 &= -15;
                    } else {
                        windowInsets = eVar;
                    }
                    if (i12 != 0) {
                        ne1Var4 = ne1Var3;
                        cVar4 = cVar3;
                        i18 = i17;
                        i19 = i4;
                        rg3Var2 = expandedShape;
                        f6 = f3;
                        j4 = containerColor;
                        long j111111111117 = scrimColor;
                        if2Var2 = le2.a;
                        hh3Var2 = hh3VarRememberModalBottomSheetState;
                        f5 = f4;
                        j5 = jM2x310ea166;
                        j6 = j111111111117;
                    } else {
                        ne1Var4 = ne1Var3;
                        cVar4 = cVar3;
                        hh3Var2 = hh3VarRememberModalBottomSheetState;
                        i18 = i17;
                        i19 = i4;
                        f5 = f4;
                        rg3Var2 = expandedShape;
                        f6 = f3;
                        j4 = containerColor;
                        j5 = jM2x310ea166;
                        j6 = scrimColor;
                        if2Var2 = if2Var;
                    }
                } else {
                    if (i25 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if ((i3 & 4) != 0) {
                        i4 &= -897;
                        hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                    }
                    if (i5 != 0) {
                        f3 = 640.0f;
                    } else {
                        f3 = f;
                    }
                    i16 = i3 & 16;
                    owVar = ow.a;
                    if (i16 != 0) {
                        expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                        i4 &= -57345;
                    }
                    if ((i3 & 32) != 0) {
                        containerColor = owVar.getContainerColor(kk0Var2, 6);
                        i4 &= -458753;
                    }
                    if ((i3 & 64) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                        i4 &= -3670017;
                    }
                    if (i7 != 0) {
                        f4 = 0.0f;
                    } else {
                        f4 = f2;
                    }
                    i17 = i14;
                    if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                        scrimColor = owVar.getScrimColor(kk0Var2, 6);
                        i4 &= -234881025;
                    } else {
                        scrimColor = j3;
                    }
                    if (i9 != 0) {
                        ne1Var2 = fj0.a;
                    } else {
                        ne1Var2 = ne1Var;
                    }
                    ne1Var3 = ne1Var2;
                    if ((i3 & 1024) != 0) {
                        windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                        i17 &= -15;
                    } else {
                        windowInsets = eVar;
                    }
                    if (i12 != 0) {
                        ne1Var4 = ne1Var3;
                        cVar4 = cVar3;
                        i18 = i17;
                        i19 = i4;
                        rg3Var2 = expandedShape;
                        f6 = f3;
                        j4 = containerColor;
                        long j111111111118 = scrimColor;
                        if2Var2 = le2.a;
                        hh3Var2 = hh3VarRememberModalBottomSheetState;
                        f5 = f4;
                        j5 = jM2x310ea166;
                        j6 = j111111111118;
                    } else {
                        ne1Var4 = ne1Var3;
                        cVar4 = cVar3;
                        hh3Var2 = hh3VarRememberModalBottomSheetState;
                        i18 = i17;
                        i19 = i4;
                        f5 = f4;
                        rg3Var2 = expandedShape;
                        f6 = f3;
                        j4 = containerColor;
                        j5 = jM2x310ea166;
                        j6 = scrimColor;
                        if2Var2 = if2Var;
                    }
                }
                kk0Var2.s();
                kk0Var = kk0Var2;
                oe1 oe1Var111117 = oe1Var2;
                c cVar1111110 = cVar4;
                hf2.m206x750f78f8(je1Var, cVar1111110, hh3Var2, f6, rg3Var2, j4, j5, f5, j6, ne1Var4, new jf2(windowInsets), if2Var2, oe1Var111117, kk0Var, i19 & 2147483646, i18 & 1008, 0);
                cVar5 = cVar1111110;
                hh3Var3 = hh3Var2;
                f7 = f6;
                rg3Var3 = rg3Var2;
                j7 = j4;
                j8 = j5;
                f8 = f5;
                j9 = j6;
                ne1Var5 = ne1Var4;
                if2Var3 = if2Var2;
                eVar2 = windowInsets;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new xe2(je1Var, cVar5, hh3Var3, f7, rg3Var3, j7, j8, f8, j9, ne1Var5, eVar2, if2Var3, oe1Var, i, i2, i3, 1));
            }
        }
        i4 |= 12582912;
        if ((i & 100663296) != 0) {
            if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) == 0) {
                i20 = 33554432;
            } else {
                i20 = 33554432;
            }
            i4 |= i20;
        }
        i9 = i3 & ConstantsKt.MINIMUM_BLOCK_SIZE;
        if (i9 != 0) {
            if ((i & 805306368) == 0) {
                if (kk0Var2.j(ne1Var)) {
                    i10 = 536870912;
                } else {
                    i10 = 268435456;
                }
                i4 |= i10;
            }
            if ((i2 & 6) == 0) {
                i11 = i2 | (((i3 & 1024) == 0 || !kk0Var2.h(eVar)) ? 2 : 4);
            } else {
                i11 = i2;
            }
            i12 = i3 & 2048;
            if (i12 != 0) {
                i11 |= 48;
            } else if ((i2 & 48) != 0) {
                if (kk0Var2.h(if2Var)) {
                    i13 = 32;
                } else {
                    i13 = 16;
                }
                i11 |= i13;
            }
            i14 = i11;
            if ((i3 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
                if ((i2 & 384) == 0) {
                    oe1Var2 = oe1Var;
                    if (kk0Var2.j(oe1Var2)) {
                        i15 = FontInfo.NUMBER_OF_CHAR_CODES;
                    } else {
                        i15 = Uuid.SIZE_BITS;
                    }
                    i14 |= i15;
                }
                if ((306783379 & i4) != 306783378) {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i25 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                            hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                        }
                        if (i5 != 0) {
                            f3 = 640.0f;
                        } else {
                            f3 = f;
                        }
                        i16 = i3 & 16;
                        owVar = ow.a;
                        if (i16 != 0) {
                            expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                            i4 &= -57345;
                        }
                        if ((i3 & 32) != 0) {
                            containerColor = owVar.getContainerColor(kk0Var2, 6);
                            i4 &= -458753;
                        }
                        if ((i3 & 64) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                            i4 &= -3670017;
                        }
                        if (i7 != 0) {
                            f4 = 0.0f;
                        } else {
                            f4 = f2;
                        }
                        i17 = i14;
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            scrimColor = owVar.getScrimColor(kk0Var2, 6);
                            i4 &= -234881025;
                        } else {
                            scrimColor = j3;
                        }
                        if (i9 != 0) {
                            ne1Var2 = fj0.a;
                        } else {
                            ne1Var2 = ne1Var;
                        }
                        ne1Var3 = ne1Var2;
                        if ((i3 & 1024) != 0) {
                            windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                            i17 &= -15;
                        } else {
                            windowInsets = eVar;
                        }
                        if (i12 != 0) {
                            ne1Var4 = ne1Var3;
                            cVar4 = cVar3;
                            i18 = i17;
                            i19 = i4;
                            rg3Var2 = expandedShape;
                            f6 = f3;
                            j4 = containerColor;
                            long j111111111119 = scrimColor;
                            if2Var2 = le2.a;
                            hh3Var2 = hh3VarRememberModalBottomSheetState;
                            f5 = f4;
                            j5 = jM2x310ea166;
                            j6 = j111111111119;
                        } else {
                            ne1Var4 = ne1Var3;
                            cVar4 = cVar3;
                            hh3Var2 = hh3VarRememberModalBottomSheetState;
                            i18 = i17;
                            i19 = i4;
                            f5 = f4;
                            rg3Var2 = expandedShape;
                            f6 = f3;
                            j4 = containerColor;
                            j5 = jM2x310ea166;
                            j6 = scrimColor;
                            if2Var2 = if2Var;
                        }
                    } else {
                        if (i25 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                            hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                        }
                        if (i5 != 0) {
                            f3 = 640.0f;
                        } else {
                            f3 = f;
                        }
                        i16 = i3 & 16;
                        owVar = ow.a;
                        if (i16 != 0) {
                            expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                            i4 &= -57345;
                        }
                        if ((i3 & 32) != 0) {
                            containerColor = owVar.getContainerColor(kk0Var2, 6);
                            i4 &= -458753;
                        }
                        if ((i3 & 64) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                            i4 &= -3670017;
                        }
                        if (i7 != 0) {
                            f4 = 0.0f;
                        } else {
                            f4 = f2;
                        }
                        i17 = i14;
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            scrimColor = owVar.getScrimColor(kk0Var2, 6);
                            i4 &= -234881025;
                        } else {
                            scrimColor = j3;
                        }
                        if (i9 != 0) {
                            ne1Var2 = fj0.a;
                        } else {
                            ne1Var2 = ne1Var;
                        }
                        ne1Var3 = ne1Var2;
                        if ((i3 & 1024) != 0) {
                            windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                            i17 &= -15;
                        } else {
                            windowInsets = eVar;
                        }
                        if (i12 != 0) {
                            ne1Var4 = ne1Var3;
                            cVar4 = cVar3;
                            i18 = i17;
                            i19 = i4;
                            rg3Var2 = expandedShape;
                            f6 = f3;
                            j4 = containerColor;
                            long j1111111111110 = scrimColor;
                            if2Var2 = le2.a;
                            hh3Var2 = hh3VarRememberModalBottomSheetState;
                            f5 = f4;
                            j5 = jM2x310ea166;
                            j6 = j1111111111110;
                        } else {
                            ne1Var4 = ne1Var3;
                            cVar4 = cVar3;
                            hh3Var2 = hh3VarRememberModalBottomSheetState;
                            i18 = i17;
                            i19 = i4;
                            f5 = f4;
                            rg3Var2 = expandedShape;
                            f6 = f3;
                            j4 = containerColor;
                            j5 = jM2x310ea166;
                            j6 = scrimColor;
                            if2Var2 = if2Var;
                        }
                    }
                    kk0Var2.s();
                    kk0Var = kk0Var2;
                    oe1 oe1Var111118 = oe1Var2;
                    c cVar1111111 = cVar4;
                    hf2.m206x750f78f8(je1Var, cVar1111111, hh3Var2, f6, rg3Var2, j4, j5, f5, j6, ne1Var4, new jf2(windowInsets), if2Var2, oe1Var111118, kk0Var, i19 & 2147483646, i18 & 1008, 0);
                    cVar5 = cVar1111111;
                    hh3Var3 = hh3Var2;
                    f7 = f6;
                    rg3Var3 = rg3Var2;
                    j7 = j4;
                    j8 = j5;
                    f8 = f5;
                    j9 = j6;
                    ne1Var5 = ne1Var4;
                    if2Var3 = if2Var2;
                    eVar2 = windowInsets;
                } else {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i25 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                            hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                        }
                        if (i5 != 0) {
                            f3 = 640.0f;
                        } else {
                            f3 = f;
                        }
                        i16 = i3 & 16;
                        owVar = ow.a;
                        if (i16 != 0) {
                            expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                            i4 &= -57345;
                        }
                        if ((i3 & 32) != 0) {
                            containerColor = owVar.getContainerColor(kk0Var2, 6);
                            i4 &= -458753;
                        }
                        if ((i3 & 64) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                            i4 &= -3670017;
                        }
                        if (i7 != 0) {
                            f4 = 0.0f;
                        } else {
                            f4 = f2;
                        }
                        i17 = i14;
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            scrimColor = owVar.getScrimColor(kk0Var2, 6);
                            i4 &= -234881025;
                        } else {
                            scrimColor = j3;
                        }
                        if (i9 != 0) {
                            ne1Var2 = fj0.a;
                        } else {
                            ne1Var2 = ne1Var;
                        }
                        ne1Var3 = ne1Var2;
                        if ((i3 & 1024) != 0) {
                            windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                            i17 &= -15;
                        } else {
                            windowInsets = eVar;
                        }
                        if (i12 != 0) {
                            ne1Var4 = ne1Var3;
                            cVar4 = cVar3;
                            i18 = i17;
                            i19 = i4;
                            rg3Var2 = expandedShape;
                            f6 = f3;
                            j4 = containerColor;
                            long j1111111111111 = scrimColor;
                            if2Var2 = le2.a;
                            hh3Var2 = hh3VarRememberModalBottomSheetState;
                            f5 = f4;
                            j5 = jM2x310ea166;
                            j6 = j1111111111111;
                        } else {
                            ne1Var4 = ne1Var3;
                            cVar4 = cVar3;
                            hh3Var2 = hh3VarRememberModalBottomSheetState;
                            i18 = i17;
                            i19 = i4;
                            f5 = f4;
                            rg3Var2 = expandedShape;
                            f6 = f3;
                            j4 = containerColor;
                            j5 = jM2x310ea166;
                            j6 = scrimColor;
                            if2Var2 = if2Var;
                        }
                    } else {
                        if (i25 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                            hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                        }
                        if (i5 != 0) {
                            f3 = 640.0f;
                        } else {
                            f3 = f;
                        }
                        i16 = i3 & 16;
                        owVar = ow.a;
                        if (i16 != 0) {
                            expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                            i4 &= -57345;
                        }
                        if ((i3 & 32) != 0) {
                            containerColor = owVar.getContainerColor(kk0Var2, 6);
                            i4 &= -458753;
                        }
                        if ((i3 & 64) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                            i4 &= -3670017;
                        }
                        if (i7 != 0) {
                            f4 = 0.0f;
                        } else {
                            f4 = f2;
                        }
                        i17 = i14;
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            scrimColor = owVar.getScrimColor(kk0Var2, 6);
                            i4 &= -234881025;
                        } else {
                            scrimColor = j3;
                        }
                        if (i9 != 0) {
                            ne1Var2 = fj0.a;
                        } else {
                            ne1Var2 = ne1Var;
                        }
                        ne1Var3 = ne1Var2;
                        if ((i3 & 1024) != 0) {
                            windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                            i17 &= -15;
                        } else {
                            windowInsets = eVar;
                        }
                        if (i12 != 0) {
                            ne1Var4 = ne1Var3;
                            cVar4 = cVar3;
                            i18 = i17;
                            i19 = i4;
                            rg3Var2 = expandedShape;
                            f6 = f3;
                            j4 = containerColor;
                            long j1111111111112 = scrimColor;
                            if2Var2 = le2.a;
                            hh3Var2 = hh3VarRememberModalBottomSheetState;
                            f5 = f4;
                            j5 = jM2x310ea166;
                            j6 = j1111111111112;
                        } else {
                            ne1Var4 = ne1Var3;
                            cVar4 = cVar3;
                            hh3Var2 = hh3VarRememberModalBottomSheetState;
                            i18 = i17;
                            i19 = i4;
                            f5 = f4;
                            rg3Var2 = expandedShape;
                            f6 = f3;
                            j4 = containerColor;
                            j5 = jM2x310ea166;
                            j6 = scrimColor;
                            if2Var2 = if2Var;
                        }
                    }
                    kk0Var2.s();
                    kk0Var = kk0Var2;
                    oe1 oe1Var111119 = oe1Var2;
                    c cVar1111112 = cVar4;
                    hf2.m206x750f78f8(je1Var, cVar1111112, hh3Var2, f6, rg3Var2, j4, j5, f5, j6, ne1Var4, new jf2(windowInsets), if2Var2, oe1Var111119, kk0Var, i19 & 2147483646, i18 & 1008, 0);
                    cVar5 = cVar1111112;
                    hh3Var3 = hh3Var2;
                    f7 = f6;
                    rg3Var3 = rg3Var2;
                    j7 = j4;
                    j8 = j5;
                    f8 = f5;
                    j9 = j6;
                    ne1Var5 = ne1Var4;
                    if2Var3 = if2Var2;
                    eVar2 = windowInsets;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new xe2(je1Var, cVar5, hh3Var3, f7, rg3Var3, j7, j8, f8, j9, ne1Var5, eVar2, if2Var3, oe1Var, i, i2, i3, 1));
                }
            }
            i14 |= 384;
            oe1Var2 = oe1Var;
            if ((306783379 & i4) != 306783378) {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i25 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if ((i3 & 4) != 0) {
                        i4 &= -897;
                        hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                    }
                    if (i5 != 0) {
                        f3 = 640.0f;
                    } else {
                        f3 = f;
                    }
                    i16 = i3 & 16;
                    owVar = ow.a;
                    if (i16 != 0) {
                        expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                        i4 &= -57345;
                    }
                    if ((i3 & 32) != 0) {
                        containerColor = owVar.getContainerColor(kk0Var2, 6);
                        i4 &= -458753;
                    }
                    if ((i3 & 64) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                        i4 &= -3670017;
                    }
                    if (i7 != 0) {
                        f4 = 0.0f;
                    } else {
                        f4 = f2;
                    }
                    i17 = i14;
                    if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                        scrimColor = owVar.getScrimColor(kk0Var2, 6);
                        i4 &= -234881025;
                    } else {
                        scrimColor = j3;
                    }
                    if (i9 != 0) {
                        ne1Var2 = fj0.a;
                    } else {
                        ne1Var2 = ne1Var;
                    }
                    ne1Var3 = ne1Var2;
                    if ((i3 & 1024) != 0) {
                        windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                        i17 &= -15;
                    } else {
                        windowInsets = eVar;
                    }
                    if (i12 != 0) {
                        ne1Var4 = ne1Var3;
                        cVar4 = cVar3;
                        i18 = i17;
                        i19 = i4;
                        rg3Var2 = expandedShape;
                        f6 = f3;
                        j4 = containerColor;
                        long j1111111111113 = scrimColor;
                        if2Var2 = le2.a;
                        hh3Var2 = hh3VarRememberModalBottomSheetState;
                        f5 = f4;
                        j5 = jM2x310ea166;
                        j6 = j1111111111113;
                    } else {
                        ne1Var4 = ne1Var3;
                        cVar4 = cVar3;
                        hh3Var2 = hh3VarRememberModalBottomSheetState;
                        i18 = i17;
                        i19 = i4;
                        f5 = f4;
                        rg3Var2 = expandedShape;
                        f6 = f3;
                        j4 = containerColor;
                        j5 = jM2x310ea166;
                        j6 = scrimColor;
                        if2Var2 = if2Var;
                    }
                } else {
                    if (i25 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if ((i3 & 4) != 0) {
                        i4 &= -897;
                        hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                    }
                    if (i5 != 0) {
                        f3 = 640.0f;
                    } else {
                        f3 = f;
                    }
                    i16 = i3 & 16;
                    owVar = ow.a;
                    if (i16 != 0) {
                        expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                        i4 &= -57345;
                    }
                    if ((i3 & 32) != 0) {
                        containerColor = owVar.getContainerColor(kk0Var2, 6);
                        i4 &= -458753;
                    }
                    if ((i3 & 64) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                        i4 &= -3670017;
                    }
                    if (i7 != 0) {
                        f4 = 0.0f;
                    } else {
                        f4 = f2;
                    }
                    i17 = i14;
                    if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                        scrimColor = owVar.getScrimColor(kk0Var2, 6);
                        i4 &= -234881025;
                    } else {
                        scrimColor = j3;
                    }
                    if (i9 != 0) {
                        ne1Var2 = fj0.a;
                    } else {
                        ne1Var2 = ne1Var;
                    }
                    ne1Var3 = ne1Var2;
                    if ((i3 & 1024) != 0) {
                        windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                        i17 &= -15;
                    } else {
                        windowInsets = eVar;
                    }
                    if (i12 != 0) {
                        ne1Var4 = ne1Var3;
                        cVar4 = cVar3;
                        i18 = i17;
                        i19 = i4;
                        rg3Var2 = expandedShape;
                        f6 = f3;
                        j4 = containerColor;
                        long j1111111111114 = scrimColor;
                        if2Var2 = le2.a;
                        hh3Var2 = hh3VarRememberModalBottomSheetState;
                        f5 = f4;
                        j5 = jM2x310ea166;
                        j6 = j1111111111114;
                    } else {
                        ne1Var4 = ne1Var3;
                        cVar4 = cVar3;
                        hh3Var2 = hh3VarRememberModalBottomSheetState;
                        i18 = i17;
                        i19 = i4;
                        f5 = f4;
                        rg3Var2 = expandedShape;
                        f6 = f3;
                        j4 = containerColor;
                        j5 = jM2x310ea166;
                        j6 = scrimColor;
                        if2Var2 = if2Var;
                    }
                }
                kk0Var2.s();
                kk0Var = kk0Var2;
                oe1 oe1Var1111110 = oe1Var2;
                c cVar1111113 = cVar4;
                hf2.m206x750f78f8(je1Var, cVar1111113, hh3Var2, f6, rg3Var2, j4, j5, f5, j6, ne1Var4, new jf2(windowInsets), if2Var2, oe1Var1111110, kk0Var, i19 & 2147483646, i18 & 1008, 0);
                cVar5 = cVar1111113;
                hh3Var3 = hh3Var2;
                f7 = f6;
                rg3Var3 = rg3Var2;
                j7 = j4;
                j8 = j5;
                f8 = f5;
                j9 = j6;
                ne1Var5 = ne1Var4;
                if2Var3 = if2Var2;
                eVar2 = windowInsets;
            } else {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i25 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if ((i3 & 4) != 0) {
                        i4 &= -897;
                        hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                    }
                    if (i5 != 0) {
                        f3 = 640.0f;
                    } else {
                        f3 = f;
                    }
                    i16 = i3 & 16;
                    owVar = ow.a;
                    if (i16 != 0) {
                        expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                        i4 &= -57345;
                    }
                    if ((i3 & 32) != 0) {
                        containerColor = owVar.getContainerColor(kk0Var2, 6);
                        i4 &= -458753;
                    }
                    if ((i3 & 64) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                        i4 &= -3670017;
                    }
                    if (i7 != 0) {
                        f4 = 0.0f;
                    } else {
                        f4 = f2;
                    }
                    i17 = i14;
                    if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                        scrimColor = owVar.getScrimColor(kk0Var2, 6);
                        i4 &= -234881025;
                    } else {
                        scrimColor = j3;
                    }
                    if (i9 != 0) {
                        ne1Var2 = fj0.a;
                    } else {
                        ne1Var2 = ne1Var;
                    }
                    ne1Var3 = ne1Var2;
                    if ((i3 & 1024) != 0) {
                        windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                        i17 &= -15;
                    } else {
                        windowInsets = eVar;
                    }
                    if (i12 != 0) {
                        ne1Var4 = ne1Var3;
                        cVar4 = cVar3;
                        i18 = i17;
                        i19 = i4;
                        rg3Var2 = expandedShape;
                        f6 = f3;
                        j4 = containerColor;
                        long j1111111111115 = scrimColor;
                        if2Var2 = le2.a;
                        hh3Var2 = hh3VarRememberModalBottomSheetState;
                        f5 = f4;
                        j5 = jM2x310ea166;
                        j6 = j1111111111115;
                    } else {
                        ne1Var4 = ne1Var3;
                        cVar4 = cVar3;
                        hh3Var2 = hh3VarRememberModalBottomSheetState;
                        i18 = i17;
                        i19 = i4;
                        f5 = f4;
                        rg3Var2 = expandedShape;
                        f6 = f3;
                        j4 = containerColor;
                        j5 = jM2x310ea166;
                        j6 = scrimColor;
                        if2Var2 = if2Var;
                    }
                } else {
                    if (i25 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if ((i3 & 4) != 0) {
                        i4 &= -897;
                        hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                    }
                    if (i5 != 0) {
                        f3 = 640.0f;
                    } else {
                        f3 = f;
                    }
                    i16 = i3 & 16;
                    owVar = ow.a;
                    if (i16 != 0) {
                        expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                        i4 &= -57345;
                    }
                    if ((i3 & 32) != 0) {
                        containerColor = owVar.getContainerColor(kk0Var2, 6);
                        i4 &= -458753;
                    }
                    if ((i3 & 64) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                        i4 &= -3670017;
                    }
                    if (i7 != 0) {
                        f4 = 0.0f;
                    } else {
                        f4 = f2;
                    }
                    i17 = i14;
                    if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                        scrimColor = owVar.getScrimColor(kk0Var2, 6);
                        i4 &= -234881025;
                    } else {
                        scrimColor = j3;
                    }
                    if (i9 != 0) {
                        ne1Var2 = fj0.a;
                    } else {
                        ne1Var2 = ne1Var;
                    }
                    ne1Var3 = ne1Var2;
                    if ((i3 & 1024) != 0) {
                        windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                        i17 &= -15;
                    } else {
                        windowInsets = eVar;
                    }
                    if (i12 != 0) {
                        ne1Var4 = ne1Var3;
                        cVar4 = cVar3;
                        i18 = i17;
                        i19 = i4;
                        rg3Var2 = expandedShape;
                        f6 = f3;
                        j4 = containerColor;
                        long j1111111111116 = scrimColor;
                        if2Var2 = le2.a;
                        hh3Var2 = hh3VarRememberModalBottomSheetState;
                        f5 = f4;
                        j5 = jM2x310ea166;
                        j6 = j1111111111116;
                    } else {
                        ne1Var4 = ne1Var3;
                        cVar4 = cVar3;
                        hh3Var2 = hh3VarRememberModalBottomSheetState;
                        i18 = i17;
                        i19 = i4;
                        f5 = f4;
                        rg3Var2 = expandedShape;
                        f6 = f3;
                        j4 = containerColor;
                        j5 = jM2x310ea166;
                        j6 = scrimColor;
                        if2Var2 = if2Var;
                    }
                }
                kk0Var2.s();
                kk0Var = kk0Var2;
                oe1 oe1Var1111111 = oe1Var2;
                c cVar1111114 = cVar4;
                hf2.m206x750f78f8(je1Var, cVar1111114, hh3Var2, f6, rg3Var2, j4, j5, f5, j6, ne1Var4, new jf2(windowInsets), if2Var2, oe1Var1111111, kk0Var, i19 & 2147483646, i18 & 1008, 0);
                cVar5 = cVar1111114;
                hh3Var3 = hh3Var2;
                f7 = f6;
                rg3Var3 = rg3Var2;
                j7 = j4;
                j8 = j5;
                f8 = f5;
                j9 = j6;
                ne1Var5 = ne1Var4;
                if2Var3 = if2Var2;
                eVar2 = windowInsets;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new xe2(je1Var, cVar5, hh3Var3, f7, rg3Var3, j7, j8, f8, j9, ne1Var5, eVar2, if2Var3, oe1Var, i, i2, i3, 1));
            }
        }
        i4 |= 805306368;
        if ((i2 & 6) == 0) {
            i11 = i2 | (((i3 & 1024) == 0 || !kk0Var2.h(eVar)) ? 2 : 4);
        } else {
            i11 = i2;
        }
        i12 = i3 & 2048;
        if (i12 != 0) {
            i11 |= 48;
        } else if ((i2 & 48) != 0) {
            if (kk0Var2.h(if2Var)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i11 |= i13;
        }
        i14 = i11;
        if ((i3 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
            if ((i2 & 384) == 0) {
                oe1Var2 = oe1Var;
                if (kk0Var2.j(oe1Var2)) {
                    i15 = FontInfo.NUMBER_OF_CHAR_CODES;
                } else {
                    i15 = Uuid.SIZE_BITS;
                }
                i14 |= i15;
            }
            if ((306783379 & i4) != 306783378) {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i25 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if ((i3 & 4) != 0) {
                        i4 &= -897;
                        hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                    }
                    if (i5 != 0) {
                        f3 = 640.0f;
                    } else {
                        f3 = f;
                    }
                    i16 = i3 & 16;
                    owVar = ow.a;
                    if (i16 != 0) {
                        expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                        i4 &= -57345;
                    }
                    if ((i3 & 32) != 0) {
                        containerColor = owVar.getContainerColor(kk0Var2, 6);
                        i4 &= -458753;
                    }
                    if ((i3 & 64) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                        i4 &= -3670017;
                    }
                    if (i7 != 0) {
                        f4 = 0.0f;
                    } else {
                        f4 = f2;
                    }
                    i17 = i14;
                    if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                        scrimColor = owVar.getScrimColor(kk0Var2, 6);
                        i4 &= -234881025;
                    } else {
                        scrimColor = j3;
                    }
                    if (i9 != 0) {
                        ne1Var2 = fj0.a;
                    } else {
                        ne1Var2 = ne1Var;
                    }
                    ne1Var3 = ne1Var2;
                    if ((i3 & 1024) != 0) {
                        windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                        i17 &= -15;
                    } else {
                        windowInsets = eVar;
                    }
                    if (i12 != 0) {
                        ne1Var4 = ne1Var3;
                        cVar4 = cVar3;
                        i18 = i17;
                        i19 = i4;
                        rg3Var2 = expandedShape;
                        f6 = f3;
                        j4 = containerColor;
                        long j1111111111117 = scrimColor;
                        if2Var2 = le2.a;
                        hh3Var2 = hh3VarRememberModalBottomSheetState;
                        f5 = f4;
                        j5 = jM2x310ea166;
                        j6 = j1111111111117;
                    } else {
                        ne1Var4 = ne1Var3;
                        cVar4 = cVar3;
                        hh3Var2 = hh3VarRememberModalBottomSheetState;
                        i18 = i17;
                        i19 = i4;
                        f5 = f4;
                        rg3Var2 = expandedShape;
                        f6 = f3;
                        j4 = containerColor;
                        j5 = jM2x310ea166;
                        j6 = scrimColor;
                        if2Var2 = if2Var;
                    }
                } else {
                    if (i25 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if ((i3 & 4) != 0) {
                        i4 &= -897;
                        hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                    }
                    if (i5 != 0) {
                        f3 = 640.0f;
                    } else {
                        f3 = f;
                    }
                    i16 = i3 & 16;
                    owVar = ow.a;
                    if (i16 != 0) {
                        expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                        i4 &= -57345;
                    }
                    if ((i3 & 32) != 0) {
                        containerColor = owVar.getContainerColor(kk0Var2, 6);
                        i4 &= -458753;
                    }
                    if ((i3 & 64) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                        i4 &= -3670017;
                    }
                    if (i7 != 0) {
                        f4 = 0.0f;
                    } else {
                        f4 = f2;
                    }
                    i17 = i14;
                    if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                        scrimColor = owVar.getScrimColor(kk0Var2, 6);
                        i4 &= -234881025;
                    } else {
                        scrimColor = j3;
                    }
                    if (i9 != 0) {
                        ne1Var2 = fj0.a;
                    } else {
                        ne1Var2 = ne1Var;
                    }
                    ne1Var3 = ne1Var2;
                    if ((i3 & 1024) != 0) {
                        windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                        i17 &= -15;
                    } else {
                        windowInsets = eVar;
                    }
                    if (i12 != 0) {
                        ne1Var4 = ne1Var3;
                        cVar4 = cVar3;
                        i18 = i17;
                        i19 = i4;
                        rg3Var2 = expandedShape;
                        f6 = f3;
                        j4 = containerColor;
                        long j1111111111118 = scrimColor;
                        if2Var2 = le2.a;
                        hh3Var2 = hh3VarRememberModalBottomSheetState;
                        f5 = f4;
                        j5 = jM2x310ea166;
                        j6 = j1111111111118;
                    } else {
                        ne1Var4 = ne1Var3;
                        cVar4 = cVar3;
                        hh3Var2 = hh3VarRememberModalBottomSheetState;
                        i18 = i17;
                        i19 = i4;
                        f5 = f4;
                        rg3Var2 = expandedShape;
                        f6 = f3;
                        j4 = containerColor;
                        j5 = jM2x310ea166;
                        j6 = scrimColor;
                        if2Var2 = if2Var;
                    }
                }
                kk0Var2.s();
                kk0Var = kk0Var2;
                oe1 oe1Var1111112 = oe1Var2;
                c cVar1111115 = cVar4;
                hf2.m206x750f78f8(je1Var, cVar1111115, hh3Var2, f6, rg3Var2, j4, j5, f5, j6, ne1Var4, new jf2(windowInsets), if2Var2, oe1Var1111112, kk0Var, i19 & 2147483646, i18 & 1008, 0);
                cVar5 = cVar1111115;
                hh3Var3 = hh3Var2;
                f7 = f6;
                rg3Var3 = rg3Var2;
                j7 = j4;
                j8 = j5;
                f8 = f5;
                j9 = j6;
                ne1Var5 = ne1Var4;
                if2Var3 = if2Var2;
                eVar2 = windowInsets;
            } else {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i25 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if ((i3 & 4) != 0) {
                        i4 &= -897;
                        hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                    }
                    if (i5 != 0) {
                        f3 = 640.0f;
                    } else {
                        f3 = f;
                    }
                    i16 = i3 & 16;
                    owVar = ow.a;
                    if (i16 != 0) {
                        expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                        i4 &= -57345;
                    }
                    if ((i3 & 32) != 0) {
                        containerColor = owVar.getContainerColor(kk0Var2, 6);
                        i4 &= -458753;
                    }
                    if ((i3 & 64) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                        i4 &= -3670017;
                    }
                    if (i7 != 0) {
                        f4 = 0.0f;
                    } else {
                        f4 = f2;
                    }
                    i17 = i14;
                    if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                        scrimColor = owVar.getScrimColor(kk0Var2, 6);
                        i4 &= -234881025;
                    } else {
                        scrimColor = j3;
                    }
                    if (i9 != 0) {
                        ne1Var2 = fj0.a;
                    } else {
                        ne1Var2 = ne1Var;
                    }
                    ne1Var3 = ne1Var2;
                    if ((i3 & 1024) != 0) {
                        windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                        i17 &= -15;
                    } else {
                        windowInsets = eVar;
                    }
                    if (i12 != 0) {
                        ne1Var4 = ne1Var3;
                        cVar4 = cVar3;
                        i18 = i17;
                        i19 = i4;
                        rg3Var2 = expandedShape;
                        f6 = f3;
                        j4 = containerColor;
                        long j1111111111119 = scrimColor;
                        if2Var2 = le2.a;
                        hh3Var2 = hh3VarRememberModalBottomSheetState;
                        f5 = f4;
                        j5 = jM2x310ea166;
                        j6 = j1111111111119;
                    } else {
                        ne1Var4 = ne1Var3;
                        cVar4 = cVar3;
                        hh3Var2 = hh3VarRememberModalBottomSheetState;
                        i18 = i17;
                        i19 = i4;
                        f5 = f4;
                        rg3Var2 = expandedShape;
                        f6 = f3;
                        j4 = containerColor;
                        j5 = jM2x310ea166;
                        j6 = scrimColor;
                        if2Var2 = if2Var;
                    }
                } else {
                    if (i25 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if ((i3 & 4) != 0) {
                        i4 &= -897;
                        hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                    }
                    if (i5 != 0) {
                        f3 = 640.0f;
                    } else {
                        f3 = f;
                    }
                    i16 = i3 & 16;
                    owVar = ow.a;
                    if (i16 != 0) {
                        expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                        i4 &= -57345;
                    }
                    if ((i3 & 32) != 0) {
                        containerColor = owVar.getContainerColor(kk0Var2, 6);
                        i4 &= -458753;
                    }
                    if ((i3 & 64) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                        i4 &= -3670017;
                    }
                    if (i7 != 0) {
                        f4 = 0.0f;
                    } else {
                        f4 = f2;
                    }
                    i17 = i14;
                    if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                        scrimColor = owVar.getScrimColor(kk0Var2, 6);
                        i4 &= -234881025;
                    } else {
                        scrimColor = j3;
                    }
                    if (i9 != 0) {
                        ne1Var2 = fj0.a;
                    } else {
                        ne1Var2 = ne1Var;
                    }
                    ne1Var3 = ne1Var2;
                    if ((i3 & 1024) != 0) {
                        windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                        i17 &= -15;
                    } else {
                        windowInsets = eVar;
                    }
                    if (i12 != 0) {
                        ne1Var4 = ne1Var3;
                        cVar4 = cVar3;
                        i18 = i17;
                        i19 = i4;
                        rg3Var2 = expandedShape;
                        f6 = f3;
                        j4 = containerColor;
                        long j11111111111110 = scrimColor;
                        if2Var2 = le2.a;
                        hh3Var2 = hh3VarRememberModalBottomSheetState;
                        f5 = f4;
                        j5 = jM2x310ea166;
                        j6 = j11111111111110;
                    } else {
                        ne1Var4 = ne1Var3;
                        cVar4 = cVar3;
                        hh3Var2 = hh3VarRememberModalBottomSheetState;
                        i18 = i17;
                        i19 = i4;
                        f5 = f4;
                        rg3Var2 = expandedShape;
                        f6 = f3;
                        j4 = containerColor;
                        j5 = jM2x310ea166;
                        j6 = scrimColor;
                        if2Var2 = if2Var;
                    }
                }
                kk0Var2.s();
                kk0Var = kk0Var2;
                oe1 oe1Var1111113 = oe1Var2;
                c cVar1111116 = cVar4;
                hf2.m206x750f78f8(je1Var, cVar1111116, hh3Var2, f6, rg3Var2, j4, j5, f5, j6, ne1Var4, new jf2(windowInsets), if2Var2, oe1Var1111113, kk0Var, i19 & 2147483646, i18 & 1008, 0);
                cVar5 = cVar1111116;
                hh3Var3 = hh3Var2;
                f7 = f6;
                rg3Var3 = rg3Var2;
                j7 = j4;
                j8 = j5;
                f8 = f5;
                j9 = j6;
                ne1Var5 = ne1Var4;
                if2Var3 = if2Var2;
                eVar2 = windowInsets;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new xe2(je1Var, cVar5, hh3Var3, f7, rg3Var3, j7, j8, f8, j9, ne1Var5, eVar2, if2Var3, oe1Var, i, i2, i3, 1));
            }
        }
        i14 |= 384;
        oe1Var2 = oe1Var;
        if ((306783379 & i4) != 306783378) {
            kk0Var2.X();
            if ((i & 1) != 0) {
                if (i25 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if ((i3 & 4) != 0) {
                    i4 &= -897;
                    hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                }
                if (i5 != 0) {
                    f3 = 640.0f;
                } else {
                    f3 = f;
                }
                i16 = i3 & 16;
                owVar = ow.a;
                if (i16 != 0) {
                    expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                    i4 &= -57345;
                }
                if ((i3 & 32) != 0) {
                    containerColor = owVar.getContainerColor(kk0Var2, 6);
                    i4 &= -458753;
                }
                if ((i3 & 64) != 0) {
                    jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                    i4 &= -3670017;
                }
                if (i7 != 0) {
                    f4 = 0.0f;
                } else {
                    f4 = f2;
                }
                i17 = i14;
                if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                    scrimColor = owVar.getScrimColor(kk0Var2, 6);
                    i4 &= -234881025;
                } else {
                    scrimColor = j3;
                }
                if (i9 != 0) {
                    ne1Var2 = fj0.a;
                } else {
                    ne1Var2 = ne1Var;
                }
                ne1Var3 = ne1Var2;
                if ((i3 & 1024) != 0) {
                    windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                    i17 &= -15;
                } else {
                    windowInsets = eVar;
                }
                if (i12 != 0) {
                    ne1Var4 = ne1Var3;
                    cVar4 = cVar3;
                    i18 = i17;
                    i19 = i4;
                    rg3Var2 = expandedShape;
                    f6 = f3;
                    j4 = containerColor;
                    long j11111111111111 = scrimColor;
                    if2Var2 = le2.a;
                    hh3Var2 = hh3VarRememberModalBottomSheetState;
                    f5 = f4;
                    j5 = jM2x310ea166;
                    j6 = j11111111111111;
                } else {
                    ne1Var4 = ne1Var3;
                    cVar4 = cVar3;
                    hh3Var2 = hh3VarRememberModalBottomSheetState;
                    i18 = i17;
                    i19 = i4;
                    f5 = f4;
                    rg3Var2 = expandedShape;
                    f6 = f3;
                    j4 = containerColor;
                    j5 = jM2x310ea166;
                    j6 = scrimColor;
                    if2Var2 = if2Var;
                }
            } else {
                if (i25 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if ((i3 & 4) != 0) {
                    i4 &= -897;
                    hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                }
                if (i5 != 0) {
                    f3 = 640.0f;
                } else {
                    f3 = f;
                }
                i16 = i3 & 16;
                owVar = ow.a;
                if (i16 != 0) {
                    expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                    i4 &= -57345;
                }
                if ((i3 & 32) != 0) {
                    containerColor = owVar.getContainerColor(kk0Var2, 6);
                    i4 &= -458753;
                }
                if ((i3 & 64) != 0) {
                    jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                    i4 &= -3670017;
                }
                if (i7 != 0) {
                    f4 = 0.0f;
                } else {
                    f4 = f2;
                }
                i17 = i14;
                if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                    scrimColor = owVar.getScrimColor(kk0Var2, 6);
                    i4 &= -234881025;
                } else {
                    scrimColor = j3;
                }
                if (i9 != 0) {
                    ne1Var2 = fj0.a;
                } else {
                    ne1Var2 = ne1Var;
                }
                ne1Var3 = ne1Var2;
                if ((i3 & 1024) != 0) {
                    windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                    i17 &= -15;
                } else {
                    windowInsets = eVar;
                }
                if (i12 != 0) {
                    ne1Var4 = ne1Var3;
                    cVar4 = cVar3;
                    i18 = i17;
                    i19 = i4;
                    rg3Var2 = expandedShape;
                    f6 = f3;
                    j4 = containerColor;
                    long j11111111111112 = scrimColor;
                    if2Var2 = le2.a;
                    hh3Var2 = hh3VarRememberModalBottomSheetState;
                    f5 = f4;
                    j5 = jM2x310ea166;
                    j6 = j11111111111112;
                } else {
                    ne1Var4 = ne1Var3;
                    cVar4 = cVar3;
                    hh3Var2 = hh3VarRememberModalBottomSheetState;
                    i18 = i17;
                    i19 = i4;
                    f5 = f4;
                    rg3Var2 = expandedShape;
                    f6 = f3;
                    j4 = containerColor;
                    j5 = jM2x310ea166;
                    j6 = scrimColor;
                    if2Var2 = if2Var;
                }
            }
            kk0Var2.s();
            kk0Var = kk0Var2;
            oe1 oe1Var1111114 = oe1Var2;
            c cVar1111117 = cVar4;
            hf2.m206x750f78f8(je1Var, cVar1111117, hh3Var2, f6, rg3Var2, j4, j5, f5, j6, ne1Var4, new jf2(windowInsets), if2Var2, oe1Var1111114, kk0Var, i19 & 2147483646, i18 & 1008, 0);
            cVar5 = cVar1111117;
            hh3Var3 = hh3Var2;
            f7 = f6;
            rg3Var3 = rg3Var2;
            j7 = j4;
            j8 = j5;
            f8 = f5;
            j9 = j6;
            ne1Var5 = ne1Var4;
            if2Var3 = if2Var2;
            eVar2 = windowInsets;
        } else {
            kk0Var2.X();
            if ((i & 1) != 0) {
                if (i25 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if ((i3 & 4) != 0) {
                    i4 &= -897;
                    hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                }
                if (i5 != 0) {
                    f3 = 640.0f;
                } else {
                    f3 = f;
                }
                i16 = i3 & 16;
                owVar = ow.a;
                if (i16 != 0) {
                    expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                    i4 &= -57345;
                }
                if ((i3 & 32) != 0) {
                    containerColor = owVar.getContainerColor(kk0Var2, 6);
                    i4 &= -458753;
                }
                if ((i3 & 64) != 0) {
                    jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                    i4 &= -3670017;
                }
                if (i7 != 0) {
                    f4 = 0.0f;
                } else {
                    f4 = f2;
                }
                i17 = i14;
                if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                    scrimColor = owVar.getScrimColor(kk0Var2, 6);
                    i4 &= -234881025;
                } else {
                    scrimColor = j3;
                }
                if (i9 != 0) {
                    ne1Var2 = fj0.a;
                } else {
                    ne1Var2 = ne1Var;
                }
                ne1Var3 = ne1Var2;
                if ((i3 & 1024) != 0) {
                    windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                    i17 &= -15;
                } else {
                    windowInsets = eVar;
                }
                if (i12 != 0) {
                    ne1Var4 = ne1Var3;
                    cVar4 = cVar3;
                    i18 = i17;
                    i19 = i4;
                    rg3Var2 = expandedShape;
                    f6 = f3;
                    j4 = containerColor;
                    long j11111111111113 = scrimColor;
                    if2Var2 = le2.a;
                    hh3Var2 = hh3VarRememberModalBottomSheetState;
                    f5 = f4;
                    j5 = jM2x310ea166;
                    j6 = j11111111111113;
                } else {
                    ne1Var4 = ne1Var3;
                    cVar4 = cVar3;
                    hh3Var2 = hh3VarRememberModalBottomSheetState;
                    i18 = i17;
                    i19 = i4;
                    f5 = f4;
                    rg3Var2 = expandedShape;
                    f6 = f3;
                    j4 = containerColor;
                    j5 = jM2x310ea166;
                    j6 = scrimColor;
                    if2Var2 = if2Var;
                }
            } else {
                if (i25 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if ((i3 & 4) != 0) {
                    i4 &= -897;
                    hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                }
                if (i5 != 0) {
                    f3 = 640.0f;
                } else {
                    f3 = f;
                }
                i16 = i3 & 16;
                owVar = ow.a;
                if (i16 != 0) {
                    expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                    i4 &= -57345;
                }
                if ((i3 & 32) != 0) {
                    containerColor = owVar.getContainerColor(kk0Var2, 6);
                    i4 &= -458753;
                }
                if ((i3 & 64) != 0) {
                    jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i4 >> 15) & 14);
                    i4 &= -3670017;
                }
                if (i7 != 0) {
                    f4 = 0.0f;
                } else {
                    f4 = f2;
                }
                i17 = i14;
                if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                    scrimColor = owVar.getScrimColor(kk0Var2, 6);
                    i4 &= -234881025;
                } else {
                    scrimColor = j3;
                }
                if (i9 != 0) {
                    ne1Var2 = fj0.a;
                } else {
                    ne1Var2 = ne1Var;
                }
                ne1Var3 = ne1Var2;
                if ((i3 & 1024) != 0) {
                    windowInsets = owVar.getWindowInsets(kk0Var2, 6);
                    i17 &= -15;
                } else {
                    windowInsets = eVar;
                }
                if (i12 != 0) {
                    ne1Var4 = ne1Var3;
                    cVar4 = cVar3;
                    i18 = i17;
                    i19 = i4;
                    rg3Var2 = expandedShape;
                    f6 = f3;
                    j4 = containerColor;
                    long j11111111111114 = scrimColor;
                    if2Var2 = le2.a;
                    hh3Var2 = hh3VarRememberModalBottomSheetState;
                    f5 = f4;
                    j5 = jM2x310ea166;
                    j6 = j11111111111114;
                } else {
                    ne1Var4 = ne1Var3;
                    cVar4 = cVar3;
                    hh3Var2 = hh3VarRememberModalBottomSheetState;
                    i18 = i17;
                    i19 = i4;
                    f5 = f4;
                    rg3Var2 = expandedShape;
                    f6 = f3;
                    j4 = containerColor;
                    j5 = jM2x310ea166;
                    j6 = scrimColor;
                    if2Var2 = if2Var;
                }
            }
            kk0Var2.s();
            kk0Var = kk0Var2;
            oe1 oe1Var1111115 = oe1Var2;
            c cVar1111118 = cVar4;
            hf2.m206x750f78f8(je1Var, cVar1111118, hh3Var2, f6, rg3Var2, j4, j5, f5, j6, ne1Var4, new jf2(windowInsets), if2Var2, oe1Var1111115, kk0Var, i19 & 2147483646, i18 & 1008, 0);
            cVar5 = cVar1111118;
            hh3Var3 = hh3Var2;
            f7 = f6;
            rg3Var3 = rg3Var2;
            j7 = j4;
            j8 = j5;
            f8 = f5;
            j9 = j6;
            ne1Var5 = ne1Var4;
            if2Var3 = if2Var2;
            eVar2 = windowInsets;
        }
        w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new xe2(je1Var, cVar5, hh3Var3, f7, rg3Var3, j7, j8, f8, j9, ne1Var5, eVar2, if2Var3, oe1Var, i, i2, i3, 1));
        }
    }

    public static final void ModalBottomSheetDialog(je1 je1Var, if2 if2Var, ue ueVar, ne1 ne1Var, ck0 ck0Var, int i) {
        je1 je1Var2;
        int i2;
        if2 if2Var2;
        int i3;
        int i4;
        Object obj;
        Object obj2;
        kk0 kk0Var;
        kk0 kk0Var2 = (kk0) ck0Var;
        kk0Var2.c0(1254951810);
        if ((i & 6) == 0) {
            je1Var2 = je1Var;
            i2 = (kk0Var2.j(je1Var2) ? 4 : 2) | i;
        } else {
            je1Var2 = je1Var;
            i2 = i;
        }
        if ((i & 48) == 0) {
            if2Var2 = if2Var;
            i2 |= kk0Var2.h(if2Var2) ? 32 : 16;
        } else {
            if2Var2 = if2Var;
        }
        if ((i & 384) == 0) {
            i2 |= (i & ConstantsKt.MINIMUM_BLOCK_SIZE) == 0 ? kk0Var2.h(ueVar) : kk0Var2.j(ueVar) ? FontInfo.NUMBER_OF_CHAR_CODES : Uuid.SIZE_BITS;
        }
        if ((i & 3072) == 0) {
            i2 |= kk0Var2.j(ne1Var) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && kk0Var2.F()) {
            kk0Var2.V();
            kk0Var = kk0Var2;
        } else {
            View view = (View) kk0Var2.l(AndroidCompositionLocals_androidKt.getLocalView());
            wu0 wu0Var = (wu0) kk0Var2.l(CompositionLocalsKt.getLocalDensity());
            dx1 dx1Var = (dx1) kk0Var2.l(CompositionLocalsKt.getLocalLayoutDirection());
            qk0 qk0VarRememberCompositionContext = rj0.rememberCompositionContext(kk0Var2, 0);
            gn3 gn3VarRememberUpdatedState = cl3.rememberUpdatedState(ne1Var, kk0Var2, (i2 >> 9) & 14);
            kk0 kk0Var3 = kk0Var2;
            UUID uuid = (UUID) d53.rememberSaveable(new Object[0], (x93) null, (String) null, (je1) bb2.h, (ck0) kk0Var2, 3072, 6);
            Object objP = kk0Var3.P();
            if (objP == Composer$Companion.getEmpty()) {
                al0 al0Var = new al0(r11.a(x21.c, kk0Var3));
                kk0Var3.l0(al0Var);
                objP = al0Var;
            }
            gq0 gq0Var = ((al0) objP).c;
            int i5 = i2;
            boolean zIsSystemInDarkTheme = lr0.isSystemInDarkTheme(kk0Var3, 0);
            boolean zH = kk0Var3.h(view) | kk0Var3.h(wu0Var);
            Object objP2 = kk0Var3.P();
            if (zH || objP2 == Composer$Companion.getEmpty()) {
                i3 = 0;
                i4 = 4;
                te2 te2Var = new te2(je1Var2, if2Var2, view, dx1Var, wu0Var, uuid, ueVar, gq0Var, zIsSystemInDarkTheme);
                yg0 yg0Var = new yg0(-1560960657, new lf2(gn3VarRememberUpdatedState), true);
                re2 re2Var = te2Var.o;
                re2Var.setParentCompositionContext(qk0VarRememberCompositionContext);
                re2Var.n.setValue(yg0Var);
                re2Var.p = true;
                re2Var.createComposition();
                kk0Var3.l0(te2Var);
                obj = te2Var;
            } else {
                i3 = 0;
                i4 = 4;
                obj = objP2;
            }
            te2 te2Var2 = (te2) obj;
            boolean zJ = kk0Var3.j(te2Var2);
            Object objP3 = kk0Var3.P();
            if (zJ || objP3 == Composer$Companion.getEmpty()) {
                obj2 = objP3;
                se2 se2Var = new se2(te2Var2, 1);
                kk0Var3.l0(se2Var);
                obj2 = se2Var;
            }
            obj2 = objP3;
            r11.DisposableEffect(te2Var2, (le1) obj2, kk0Var3, i3);
            int i6 = (kk0Var3.j(te2Var2) ? 1 : 0) | ((i5 & 14) == i4 ? 1 : i3) | ((i5 & 112) != 32 ? i3 : 1) | (kk0Var3.h(dx1Var) ? 1 : 0);
            Object objP4 = kk0Var3.P();
            if (i6 != 0 || objP4 == Composer$Companion.getEmpty()) {
                qa qaVar = new qa(te2Var2, je1Var, if2Var, dx1Var, 3);
                kk0Var3.l0(qaVar);
                objP4 = qaVar;
            }
            r11.SideEffect((je1) objP4, kk0Var3, i3);
            kk0Var = kk0Var3;
        }
        w33 w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new kf2(je1Var, if2Var, ueVar, ne1Var, i));
        }
    }
}
