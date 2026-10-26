package defpackage;

import androidx.compose.foundation.lazy.layout.StickyItemsPlacement$Companion;
import androidx.compose.foundation.lazy.layout.a;
import androidx.compose.foundation.lazy.layout.d;
import androidx.compose.runtime.Composer$Companion;
import androidx.compose.ui.c;
import androidx.compose.ui.platform.CompositionLocalsKt;
import kotlin.io.ConstantsKt;
import kotlin.uuid.Uuid;
import org.scilab.forge.jlatexmath.FontInfo;

/* JADX INFO: loaded from: classes.dex */
public abstract class y12 {
    /* JADX WARN: Code duplicated, block: B:101:0x0123  */
    /* JADX WARN: Code duplicated, block: B:103:0x012d  */
    /* JADX WARN: Code duplicated, block: B:104:0x0130  */
    /* JADX WARN: Code duplicated, block: B:107:0x0137  */
    /* JADX WARN: Code duplicated, block: B:110:0x0140  */
    /* JADX WARN: Code duplicated, block: B:111:0x0145  */
    /* JADX WARN: Code duplicated, block: B:113:0x014b  */
    /* JADX WARN: Code duplicated, block: B:115:0x0151  */
    /* JADX WARN: Code duplicated, block: B:116:0x0154  */
    /* JADX WARN: Code duplicated, block: B:118:0x0159  */
    /* JADX WARN: Code duplicated, block: B:121:0x015f  */
    /* JADX WARN: Code duplicated, block: B:123:0x0166  */
    /* JADX WARN: Code duplicated, block: B:125:0x016a  */
    /* JADX WARN: Code duplicated, block: B:127:0x0174  */
    /* JADX WARN: Code duplicated, block: B:128:0x0177  */
    /* JADX WARN: Code duplicated, block: B:130:0x017c  */
    /* JADX WARN: Code duplicated, block: B:133:0x0185  */
    /* JADX WARN: Code duplicated, block: B:134:0x0188  */
    /* JADX WARN: Code duplicated, block: B:136:0x018e  */
    /* JADX WARN: Code duplicated, block: B:138:0x0196  */
    /* JADX WARN: Code duplicated, block: B:140:0x019d  */
    /* JADX WARN: Code duplicated, block: B:143:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:144:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:146:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:148:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:152:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:156:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:159:0x01d4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:160:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:161:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:163:0x01db  */
    /* JADX WARN: Code duplicated, block: B:164:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:166:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:167:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:169:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:170:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:172:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:173:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:176:0x0213  */
    /* JADX WARN: Code duplicated, block: B:179:0x0238  */
    /* JADX WARN: Code duplicated, block: B:180:0x023d  */
    /* JADX WARN: Code duplicated, block: B:183:0x027d  */
    /* JADX WARN: Code duplicated, block: B:185:0x0281  */
    /* JADX WARN: Code duplicated, block: B:187:0x0286  */
    /* JADX WARN: Code duplicated, block: B:189:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:191:0x030a  */
    /* JADX WARN: Code duplicated, block: B:194:0x031c  */
    /* JADX WARN: Code duplicated, block: B:196:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0072  */
    /* JADX WARN: Code duplicated, block: B:37:0x0075  */
    /* JADX WARN: Code duplicated, block: B:39:0x0079  */
    /* JADX WARN: Code duplicated, block: B:41:0x007f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0082  */
    /* JADX WARN: Code duplicated, block: B:46:0x0089  */
    /* JADX WARN: Code duplicated, block: B:47:0x008c  */
    /* JADX WARN: Code duplicated, block: B:49:0x0090  */
    /* JADX WARN: Code duplicated, block: B:51:0x0096  */
    /* JADX WARN: Code duplicated, block: B:52:0x0099  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:77:0x00da  */
    /* JADX WARN: Code duplicated, block: B:79:0x00df  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:83:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:89:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:91:0x0103  */
    /* JADX WARN: Code duplicated, block: B:93:0x0109  */
    /* JADX WARN: Code duplicated, block: B:94:0x010c  */
    /* JADX WARN: Code duplicated, block: B:98:0x0116  */
    /* JADX WARN: Code duplicated, block: B:99:0x011f  */
    public static final void LazyList(c cVar, g22 g22Var, hs2 hs2Var, boolean z, boolean z2, w71 w71Var, boolean z3, pr2 pr2Var, int i, y7 y7Var, gl glVar, z7 z7Var, el elVar, le1 le1Var, ck0 ck0Var, int i2, int i3, int i4) {
        int i5;
        hs2 hs2Var2;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        boolean z4;
        g22 g22Var2;
        y7 y7Var2;
        gl glVar2;
        z7 z7Var2;
        el elVar2;
        w33 w33VarV;
        int i25;
        y7 y7Var3;
        gl glVar3;
        z7 z7Var3;
        el elVar3;
        int i26;
        Object objP;
        zf3 stickToTopPlacement;
        nq2 nq2Var;
        nq2 nq2Var2;
        c cVarA;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(924924659);
        if ((i4 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (kk0Var.h(cVar) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= kk0Var.h(g22Var) ? 32 : 16;
        }
        int i27 = i4 & 4;
        int i28 = Uuid.SIZE_BITS;
        if (i27 == 0) {
            if ((i2 & 384) == 0) {
                hs2Var2 = hs2Var;
                i5 |= kk0Var.h(hs2Var2) ? 256 : 128;
            }
            if ((i4 & 8) != 0) {
                i5 |= 3072;
            } else if ((i2 & 3072) == 0) {
                if (kk0Var.i(z)) {
                    i6 = 2048;
                } else {
                    i6 = 1024;
                }
                i5 |= i6;
            }
            if ((i4 & 16) != 0) {
                i5 |= 24576;
            } else if ((i2 & 24576) == 0) {
                if (kk0Var.i(z2)) {
                    i7 = 16384;
                } else {
                    i7 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                }
                i5 |= i7;
            }
            if ((i4 & 32) != 0) {
                if ((i2 & 196608) == 0) {
                    if (kk0Var.h(w71Var)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i5 |= i8;
                }
                if ((i4 & 64) != 0) {
                    i5 |= 1572864;
                } else if ((i2 & 1572864) == 0) {
                    if (kk0Var.i(z3)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i5 |= i9;
                }
                if ((i4 & Uuid.SIZE_BITS) != 0) {
                    if ((i2 & 12582912) == 0) {
                        if (kk0Var.h(pr2Var)) {
                            i10 = 8388608;
                        } else {
                            i10 = 4194304;
                        }
                        i5 |= i10;
                    }
                    i11 = i4 & FontInfo.NUMBER_OF_CHAR_CODES;
                    if (i11 != 0) {
                        i5 |= 100663296;
                        i12 = i;
                    } else {
                        i12 = i;
                        if ((i2 & 100663296) == 0) {
                            if (kk0Var.f(i12)) {
                                i13 = 67108864;
                            } else {
                                i13 = 33554432;
                            }
                            i5 |= i13;
                        }
                    }
                    i14 = i4 & ConstantsKt.MINIMUM_BLOCK_SIZE;
                    if (i14 != 0) {
                        i14 = i14;
                        i15 = i5 | 805306368;
                    } else {
                        if ((i2 & 805306368) != 0) {
                            if (kk0Var.h(y7Var)) {
                                i16 = 536870912;
                            } else {
                                i16 = 268435456;
                            }
                            i5 |= i16;
                        }
                        i15 = i5;
                    }
                    i17 = i4 & 1024;
                    if (i17 != 0) {
                        i18 = i3 | 6;
                    } else if ((i3 & 6) == 0) {
                        if (kk0Var.h(glVar)) {
                            i19 = 4;
                        } else {
                            i19 = 2;
                        }
                        i18 = i3 | i19;
                    } else {
                        i18 = i3;
                    }
                    i20 = i4 & 2048;
                    if (i20 != 0) {
                        i18 |= 48;
                    } else if ((i3 & 48) != 0) {
                        if (kk0Var.h(z7Var)) {
                            i21 = 32;
                        } else {
                            i21 = 16;
                        }
                        i18 |= i21;
                    }
                    i22 = i18;
                    i23 = i4 & ConstantsKt.DEFAULT_BLOCK_SIZE;
                    if (i23 != 0) {
                        i24 = i22 | 384;
                    } else if ((i3 & 384) == 0) {
                        if (kk0Var.h(elVar)) {
                            i28 = 256;
                        }
                        i24 = i22 | i28;
                    } else {
                        i24 = i22;
                    }
                    if ((i4 & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0) {
                        i24 |= 3072;
                    } else if ((i3 & 3072) == 0) {
                        i24 |= kk0Var.j(le1Var) ? 2048 : 1024;
                    }
                    if ((i15 & 306783379) == 306783378 || (i24 & 1171) != 1170) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (kk0Var.S(i15 & 1, z4)) {
                        if (i11 != 0) {
                            i25 = 0;
                        } else {
                            i25 = i12;
                        }
                        if (i14 != 0) {
                            y7Var3 = null;
                        } else {
                            y7Var3 = y7Var;
                        }
                        if (i17 != 0) {
                            glVar3 = null;
                        } else {
                            glVar3 = glVar;
                        }
                        if (i20 != 0) {
                            z7Var3 = null;
                        } else {
                            z7Var3 = z7Var;
                        }
                        if (i23 != 0) {
                            elVar3 = null;
                        } else {
                            elVar3 = elVar;
                        }
                        i26 = (i15 >> 3) & 14;
                        je1 je1VarRememberLazyListItemProviderLambda = u12.rememberLazyListItemProviderLambda(g22Var, le1Var, kk0Var, i26 | ((i24 >> 6) & 112));
                        int i29 = i15 >> 9;
                        g12 g12VarRememberLazyListSemanticState = d22.rememberLazyListSemanticState(g22Var, z2, kk0Var, i26 | (i29 & 112));
                        objP = kk0Var.P();
                        if (objP == Composer$Companion.getEmpty()) {
                            objP = r11.a(x21.c, kk0Var);
                            kk0Var.l0(objP);
                        }
                        gq0 gq0Var = (gq0) objP;
                        eg1 eg1Var = (eg1) kk0Var.l(CompositionLocalsKt.getLocalGraphicsContext());
                        if (((Boolean) kk0Var.l(CompositionLocalsKt.getLocalScrollCaptureInProgress())).booleanValue()) {
                            stickToTopPlacement = null;
                        } else {
                            stickToTopPlacement = StickyItemsPlacement$Companion.getStickToTopPlacement();
                        }
                        int i30 = i24 << 18;
                        ne1 ne1VarRememberLazyListMeasurePolicy = rememberLazyListMeasurePolicy(je1VarRememberLazyListItemProviderLambda, g22Var, hs2Var2, z, z2, i25, y7Var3, z7Var3, elVar3, glVar3, gq0Var, eg1Var, stickToTopPlacement, kk0Var, (i15 & 65520) | (i29 & 458752) | (i29 & 3670016) | (i30 & 29360128) | (i30 & 234881024) | ((i24 << 27) & 1879048192), 0);
                        i12 = i25;
                        z7 z7Var4 = z7Var3;
                        el elVar4 = elVar3;
                        gl glVar4 = glVar3;
                        y7 y7Var4 = y7Var3;
                        if (z2) {
                            nq2Var = nq2.c;
                        } else {
                            nq2Var = nq2.d;
                        }
                        nq2Var2 = nq2Var;
                        if (z3) {
                            kk0Var.a0(-1513147781);
                            cVarA = a.a(c.i, m12.rememberLazyListBeyondBoundsState(g22Var, i12, kk0Var, i26 | ((i15 >> 21) & 112)), g22Var.n, z, nq2Var2);
                            kk0Var.r(false);
                        } else {
                            kk0Var.a0(-1512720880);
                            kk0Var.r(false);
                            cVarA = c.i;
                        }
                        g22Var2 = g22Var;
                        r02.LazyLayout(je1VarRememberLazyListItemProviderLambda, androidx.compose.foundation.a.k(d.lazyLayoutSemantics(cVar.then(g22Var.k).then(g22Var.l), je1VarRememberLazyListItemProviderLambda, g12VarRememberLazyListSemanticState, nq2Var2, z3, z, kk0Var, ((i15 >> 6) & 57344) | ((i15 << 6) & 458752)).then(cVarA).then(g22Var.m.i), g22Var, nq2Var2, z3, z, w71Var, g22Var.f, false, pr2Var), g22Var2.o, ne1VarRememberLazyListMeasurePolicy, kk0Var, 0, 0);
                        y7Var2 = y7Var4;
                        glVar2 = glVar4;
                        z7Var2 = z7Var4;
                        elVar2 = elVar4;
                    } else {
                        g22Var2 = g22Var;
                        kk0Var.V();
                        y7Var2 = y7Var;
                        glVar2 = glVar;
                        z7Var2 = z7Var;
                        elVar2 = elVar;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new v12(cVar, g22Var2, hs2Var, z, z2, w71Var, z3, pr2Var, i12, y7Var2, glVar2, z7Var2, elVar2, le1Var, i2, i3, i4));
                    }
                }
                i5 |= 12582912;
                i11 = i4 & FontInfo.NUMBER_OF_CHAR_CODES;
                if (i11 != 0) {
                    i5 |= 100663296;
                    i12 = i;
                } else {
                    i12 = i;
                    if ((i2 & 100663296) == 0) {
                        if (kk0Var.f(i12)) {
                            i13 = 67108864;
                        } else {
                            i13 = 33554432;
                        }
                        i5 |= i13;
                    }
                }
                i14 = i4 & ConstantsKt.MINIMUM_BLOCK_SIZE;
                if (i14 != 0) {
                    i14 = i14;
                    i15 = i5 | 805306368;
                } else {
                    if ((i2 & 805306368) != 0) {
                        if (kk0Var.h(y7Var)) {
                            i16 = 536870912;
                        } else {
                            i16 = 268435456;
                        }
                        i5 |= i16;
                    }
                    i15 = i5;
                }
                i17 = i4 & 1024;
                if (i17 != 0) {
                    i18 = i3 | 6;
                } else if ((i3 & 6) == 0) {
                    if (kk0Var.h(glVar)) {
                        i19 = 4;
                    } else {
                        i19 = 2;
                    }
                    i18 = i3 | i19;
                } else {
                    i18 = i3;
                }
                i20 = i4 & 2048;
                if (i20 != 0) {
                    i18 |= 48;
                } else if ((i3 & 48) != 0) {
                    if (kk0Var.h(z7Var)) {
                        i21 = 32;
                    } else {
                        i21 = 16;
                    }
                    i18 |= i21;
                }
                i22 = i18;
                i23 = i4 & ConstantsKt.DEFAULT_BLOCK_SIZE;
                if (i23 != 0) {
                    i24 = i22 | 384;
                } else if ((i3 & 384) == 0) {
                    if (kk0Var.h(elVar)) {
                        i28 = 256;
                    }
                    i24 = i22 | i28;
                } else {
                    i24 = i22;
                }
                if ((i4 & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0) {
                    i24 |= 3072;
                } else if ((i3 & 3072) == 0) {
                    i24 |= kk0Var.j(le1Var) ? 2048 : 1024;
                }
                if ((i15 & 306783379) == 306783378) {
                    z4 = true;
                } else {
                    z4 = true;
                }
                if (kk0Var.S(i15 & 1, z4)) {
                    if (i11 != 0) {
                        i25 = 0;
                    } else {
                        i25 = i12;
                    }
                    if (i14 != 0) {
                        y7Var3 = null;
                    } else {
                        y7Var3 = y7Var;
                    }
                    if (i17 != 0) {
                        glVar3 = null;
                    } else {
                        glVar3 = glVar;
                    }
                    if (i20 != 0) {
                        z7Var3 = null;
                    } else {
                        z7Var3 = z7Var;
                    }
                    if (i23 != 0) {
                        elVar3 = null;
                    } else {
                        elVar3 = elVar;
                    }
                    i26 = (i15 >> 3) & 14;
                    je1 je1VarRememberLazyListItemProviderLambda2 = u12.rememberLazyListItemProviderLambda(g22Var, le1Var, kk0Var, i26 | ((i24 >> 6) & 112));
                    int i210 = i15 >> 9;
                    g12 g12VarRememberLazyListSemanticState2 = d22.rememberLazyListSemanticState(g22Var, z2, kk0Var, i26 | (i210 & 112));
                    objP = kk0Var.P();
                    if (objP == Composer$Companion.getEmpty()) {
                        objP = r11.a(x21.c, kk0Var);
                        kk0Var.l0(objP);
                    }
                    gq0 gq0Var2 = (gq0) objP;
                    eg1 eg1Var2 = (eg1) kk0Var.l(CompositionLocalsKt.getLocalGraphicsContext());
                    if (((Boolean) kk0Var.l(CompositionLocalsKt.getLocalScrollCaptureInProgress())).booleanValue()) {
                        stickToTopPlacement = StickyItemsPlacement$Companion.getStickToTopPlacement();
                    } else {
                        stickToTopPlacement = null;
                    }
                    int i31 = i24 << 18;
                    ne1 ne1VarRememberLazyListMeasurePolicy2 = rememberLazyListMeasurePolicy(je1VarRememberLazyListItemProviderLambda2, g22Var, hs2Var2, z, z2, i25, y7Var3, z7Var3, elVar3, glVar3, gq0Var2, eg1Var2, stickToTopPlacement, kk0Var, (i15 & 65520) | (i210 & 458752) | (i210 & 3670016) | (i31 & 29360128) | (i31 & 234881024) | ((i24 << 27) & 1879048192), 0);
                    i12 = i25;
                    z7 z7Var5 = z7Var3;
                    el elVar5 = elVar3;
                    gl glVar5 = glVar3;
                    y7 y7Var5 = y7Var3;
                    if (z2) {
                        nq2Var = nq2.c;
                    } else {
                        nq2Var = nq2.d;
                    }
                    nq2Var2 = nq2Var;
                    if (z3) {
                        kk0Var.a0(-1513147781);
                        cVarA = a.a(c.i, m12.rememberLazyListBeyondBoundsState(g22Var, i12, kk0Var, i26 | ((i15 >> 21) & 112)), g22Var.n, z, nq2Var2);
                        kk0Var.r(false);
                    } else {
                        kk0Var.a0(-1512720880);
                        kk0Var.r(false);
                        cVarA = c.i;
                    }
                    g22Var2 = g22Var;
                    r02.LazyLayout(je1VarRememberLazyListItemProviderLambda2, androidx.compose.foundation.a.k(d.lazyLayoutSemantics(cVar.then(g22Var.k).then(g22Var.l), je1VarRememberLazyListItemProviderLambda2, g12VarRememberLazyListSemanticState2, nq2Var2, z3, z, kk0Var, ((i15 >> 6) & 57344) | ((i15 << 6) & 458752)).then(cVarA).then(g22Var.m.i), g22Var, nq2Var2, z3, z, w71Var, g22Var.f, false, pr2Var), g22Var2.o, ne1VarRememberLazyListMeasurePolicy2, kk0Var, 0, 0);
                    y7Var2 = y7Var5;
                    glVar2 = glVar5;
                    z7Var2 = z7Var5;
                    elVar2 = elVar5;
                } else {
                    g22Var2 = g22Var;
                    kk0Var.V();
                    y7Var2 = y7Var;
                    glVar2 = glVar;
                    z7Var2 = z7Var;
                    elVar2 = elVar;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new v12(cVar, g22Var2, hs2Var, z, z2, w71Var, z3, pr2Var, i12, y7Var2, glVar2, z7Var2, elVar2, le1Var, i2, i3, i4));
                }
            }
            i5 |= 196608;
            if ((i4 & 64) != 0) {
                i5 |= 1572864;
            } else if ((i2 & 1572864) == 0) {
                if (kk0Var.i(z3)) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i5 |= i9;
            }
            if ((i4 & Uuid.SIZE_BITS) != 0) {
                if ((i2 & 12582912) == 0) {
                    if (kk0Var.h(pr2Var)) {
                        i10 = 8388608;
                    } else {
                        i10 = 4194304;
                    }
                    i5 |= i10;
                }
                i11 = i4 & FontInfo.NUMBER_OF_CHAR_CODES;
                if (i11 != 0) {
                    i5 |= 100663296;
                    i12 = i;
                } else {
                    i12 = i;
                    if ((i2 & 100663296) == 0) {
                        if (kk0Var.f(i12)) {
                            i13 = 67108864;
                        } else {
                            i13 = 33554432;
                        }
                        i5 |= i13;
                    }
                }
                i14 = i4 & ConstantsKt.MINIMUM_BLOCK_SIZE;
                if (i14 != 0) {
                    i14 = i14;
                    i15 = i5 | 805306368;
                } else {
                    if ((i2 & 805306368) != 0) {
                        if (kk0Var.h(y7Var)) {
                            i16 = 536870912;
                        } else {
                            i16 = 268435456;
                        }
                        i5 |= i16;
                    }
                    i15 = i5;
                }
                i17 = i4 & 1024;
                if (i17 != 0) {
                    i18 = i3 | 6;
                } else if ((i3 & 6) == 0) {
                    if (kk0Var.h(glVar)) {
                        i19 = 4;
                    } else {
                        i19 = 2;
                    }
                    i18 = i3 | i19;
                } else {
                    i18 = i3;
                }
                i20 = i4 & 2048;
                if (i20 != 0) {
                    i18 |= 48;
                } else if ((i3 & 48) != 0) {
                    if (kk0Var.h(z7Var)) {
                        i21 = 32;
                    } else {
                        i21 = 16;
                    }
                    i18 |= i21;
                }
                i22 = i18;
                i23 = i4 & ConstantsKt.DEFAULT_BLOCK_SIZE;
                if (i23 != 0) {
                    i24 = i22 | 384;
                } else if ((i3 & 384) == 0) {
                    if (kk0Var.h(elVar)) {
                        i28 = 256;
                    }
                    i24 = i22 | i28;
                } else {
                    i24 = i22;
                }
                if ((i4 & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0) {
                    i24 |= 3072;
                } else if ((i3 & 3072) == 0) {
                    i24 |= kk0Var.j(le1Var) ? 2048 : 1024;
                }
                if ((i15 & 306783379) == 306783378) {
                    z4 = true;
                } else {
                    z4 = true;
                }
                if (kk0Var.S(i15 & 1, z4)) {
                    if (i11 != 0) {
                        i25 = 0;
                    } else {
                        i25 = i12;
                    }
                    if (i14 != 0) {
                        y7Var3 = null;
                    } else {
                        y7Var3 = y7Var;
                    }
                    if (i17 != 0) {
                        glVar3 = null;
                    } else {
                        glVar3 = glVar;
                    }
                    if (i20 != 0) {
                        z7Var3 = null;
                    } else {
                        z7Var3 = z7Var;
                    }
                    if (i23 != 0) {
                        elVar3 = null;
                    } else {
                        elVar3 = elVar;
                    }
                    i26 = (i15 >> 3) & 14;
                    je1 je1VarRememberLazyListItemProviderLambda3 = u12.rememberLazyListItemProviderLambda(g22Var, le1Var, kk0Var, i26 | ((i24 >> 6) & 112));
                    int i211 = i15 >> 9;
                    g12 g12VarRememberLazyListSemanticState3 = d22.rememberLazyListSemanticState(g22Var, z2, kk0Var, i26 | (i211 & 112));
                    objP = kk0Var.P();
                    if (objP == Composer$Companion.getEmpty()) {
                        objP = r11.a(x21.c, kk0Var);
                        kk0Var.l0(objP);
                    }
                    gq0 gq0Var3 = (gq0) objP;
                    eg1 eg1Var3 = (eg1) kk0Var.l(CompositionLocalsKt.getLocalGraphicsContext());
                    if (((Boolean) kk0Var.l(CompositionLocalsKt.getLocalScrollCaptureInProgress())).booleanValue()) {
                        stickToTopPlacement = StickyItemsPlacement$Companion.getStickToTopPlacement();
                    } else {
                        stickToTopPlacement = null;
                    }
                    int i32 = i24 << 18;
                    ne1 ne1VarRememberLazyListMeasurePolicy3 = rememberLazyListMeasurePolicy(je1VarRememberLazyListItemProviderLambda3, g22Var, hs2Var2, z, z2, i25, y7Var3, z7Var3, elVar3, glVar3, gq0Var3, eg1Var3, stickToTopPlacement, kk0Var, (i15 & 65520) | (i211 & 458752) | (i211 & 3670016) | (i32 & 29360128) | (i32 & 234881024) | ((i24 << 27) & 1879048192), 0);
                    i12 = i25;
                    z7 z7Var6 = z7Var3;
                    el elVar6 = elVar3;
                    gl glVar6 = glVar3;
                    y7 y7Var6 = y7Var3;
                    if (z2) {
                        nq2Var = nq2.c;
                    } else {
                        nq2Var = nq2.d;
                    }
                    nq2Var2 = nq2Var;
                    if (z3) {
                        kk0Var.a0(-1513147781);
                        cVarA = a.a(c.i, m12.rememberLazyListBeyondBoundsState(g22Var, i12, kk0Var, i26 | ((i15 >> 21) & 112)), g22Var.n, z, nq2Var2);
                        kk0Var.r(false);
                    } else {
                        kk0Var.a0(-1512720880);
                        kk0Var.r(false);
                        cVarA = c.i;
                    }
                    g22Var2 = g22Var;
                    r02.LazyLayout(je1VarRememberLazyListItemProviderLambda3, androidx.compose.foundation.a.k(d.lazyLayoutSemantics(cVar.then(g22Var.k).then(g22Var.l), je1VarRememberLazyListItemProviderLambda3, g12VarRememberLazyListSemanticState3, nq2Var2, z3, z, kk0Var, ((i15 >> 6) & 57344) | ((i15 << 6) & 458752)).then(cVarA).then(g22Var.m.i), g22Var, nq2Var2, z3, z, w71Var, g22Var.f, false, pr2Var), g22Var2.o, ne1VarRememberLazyListMeasurePolicy3, kk0Var, 0, 0);
                    y7Var2 = y7Var6;
                    glVar2 = glVar6;
                    z7Var2 = z7Var6;
                    elVar2 = elVar6;
                } else {
                    g22Var2 = g22Var;
                    kk0Var.V();
                    y7Var2 = y7Var;
                    glVar2 = glVar;
                    z7Var2 = z7Var;
                    elVar2 = elVar;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new v12(cVar, g22Var2, hs2Var, z, z2, w71Var, z3, pr2Var, i12, y7Var2, glVar2, z7Var2, elVar2, le1Var, i2, i3, i4));
                }
            }
            i5 |= 12582912;
            i11 = i4 & FontInfo.NUMBER_OF_CHAR_CODES;
            if (i11 != 0) {
                i5 |= 100663296;
                i12 = i;
            } else {
                i12 = i;
                if ((i2 & 100663296) == 0) {
                    if (kk0Var.f(i12)) {
                        i13 = 67108864;
                    } else {
                        i13 = 33554432;
                    }
                    i5 |= i13;
                }
            }
            i14 = i4 & ConstantsKt.MINIMUM_BLOCK_SIZE;
            if (i14 != 0) {
                i14 = i14;
                i15 = i5 | 805306368;
            } else {
                if ((i2 & 805306368) != 0) {
                    if (kk0Var.h(y7Var)) {
                        i16 = 536870912;
                    } else {
                        i16 = 268435456;
                    }
                    i5 |= i16;
                }
                i15 = i5;
            }
            i17 = i4 & 1024;
            if (i17 != 0) {
                i18 = i3 | 6;
            } else if ((i3 & 6) == 0) {
                if (kk0Var.h(glVar)) {
                    i19 = 4;
                } else {
                    i19 = 2;
                }
                i18 = i3 | i19;
            } else {
                i18 = i3;
            }
            i20 = i4 & 2048;
            if (i20 != 0) {
                i18 |= 48;
            } else if ((i3 & 48) != 0) {
                if (kk0Var.h(z7Var)) {
                    i21 = 32;
                } else {
                    i21 = 16;
                }
                i18 |= i21;
            }
            i22 = i18;
            i23 = i4 & ConstantsKt.DEFAULT_BLOCK_SIZE;
            if (i23 != 0) {
                i24 = i22 | 384;
            } else if ((i3 & 384) == 0) {
                if (kk0Var.h(elVar)) {
                    i28 = 256;
                }
                i24 = i22 | i28;
            } else {
                i24 = i22;
            }
            if ((i4 & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0) {
                i24 |= 3072;
            } else if ((i3 & 3072) == 0) {
                i24 |= kk0Var.j(le1Var) ? 2048 : 1024;
            }
            if ((i15 & 306783379) == 306783378) {
                z4 = true;
            } else {
                z4 = true;
            }
            if (kk0Var.S(i15 & 1, z4)) {
                if (i11 != 0) {
                    i25 = 0;
                } else {
                    i25 = i12;
                }
                if (i14 != 0) {
                    y7Var3 = null;
                } else {
                    y7Var3 = y7Var;
                }
                if (i17 != 0) {
                    glVar3 = null;
                } else {
                    glVar3 = glVar;
                }
                if (i20 != 0) {
                    z7Var3 = null;
                } else {
                    z7Var3 = z7Var;
                }
                if (i23 != 0) {
                    elVar3 = null;
                } else {
                    elVar3 = elVar;
                }
                i26 = (i15 >> 3) & 14;
                je1 je1VarRememberLazyListItemProviderLambda4 = u12.rememberLazyListItemProviderLambda(g22Var, le1Var, kk0Var, i26 | ((i24 >> 6) & 112));
                int i212 = i15 >> 9;
                g12 g12VarRememberLazyListSemanticState4 = d22.rememberLazyListSemanticState(g22Var, z2, kk0Var, i26 | (i212 & 112));
                objP = kk0Var.P();
                if (objP == Composer$Companion.getEmpty()) {
                    objP = r11.a(x21.c, kk0Var);
                    kk0Var.l0(objP);
                }
                gq0 gq0Var4 = (gq0) objP;
                eg1 eg1Var4 = (eg1) kk0Var.l(CompositionLocalsKt.getLocalGraphicsContext());
                if (((Boolean) kk0Var.l(CompositionLocalsKt.getLocalScrollCaptureInProgress())).booleanValue()) {
                    stickToTopPlacement = StickyItemsPlacement$Companion.getStickToTopPlacement();
                } else {
                    stickToTopPlacement = null;
                }
                int i33 = i24 << 18;
                ne1 ne1VarRememberLazyListMeasurePolicy4 = rememberLazyListMeasurePolicy(je1VarRememberLazyListItemProviderLambda4, g22Var, hs2Var2, z, z2, i25, y7Var3, z7Var3, elVar3, glVar3, gq0Var4, eg1Var4, stickToTopPlacement, kk0Var, (i15 & 65520) | (i212 & 458752) | (i212 & 3670016) | (i33 & 29360128) | (i33 & 234881024) | ((i24 << 27) & 1879048192), 0);
                i12 = i25;
                z7 z7Var7 = z7Var3;
                el elVar7 = elVar3;
                gl glVar7 = glVar3;
                y7 y7Var7 = y7Var3;
                if (z2) {
                    nq2Var = nq2.c;
                } else {
                    nq2Var = nq2.d;
                }
                nq2Var2 = nq2Var;
                if (z3) {
                    kk0Var.a0(-1513147781);
                    cVarA = a.a(c.i, m12.rememberLazyListBeyondBoundsState(g22Var, i12, kk0Var, i26 | ((i15 >> 21) & 112)), g22Var.n, z, nq2Var2);
                    kk0Var.r(false);
                } else {
                    kk0Var.a0(-1512720880);
                    kk0Var.r(false);
                    cVarA = c.i;
                }
                g22Var2 = g22Var;
                r02.LazyLayout(je1VarRememberLazyListItemProviderLambda4, androidx.compose.foundation.a.k(d.lazyLayoutSemantics(cVar.then(g22Var.k).then(g22Var.l), je1VarRememberLazyListItemProviderLambda4, g12VarRememberLazyListSemanticState4, nq2Var2, z3, z, kk0Var, ((i15 >> 6) & 57344) | ((i15 << 6) & 458752)).then(cVarA).then(g22Var.m.i), g22Var, nq2Var2, z3, z, w71Var, g22Var.f, false, pr2Var), g22Var2.o, ne1VarRememberLazyListMeasurePolicy4, kk0Var, 0, 0);
                y7Var2 = y7Var7;
                glVar2 = glVar7;
                z7Var2 = z7Var7;
                elVar2 = elVar7;
            } else {
                g22Var2 = g22Var;
                kk0Var.V();
                y7Var2 = y7Var;
                glVar2 = glVar;
                z7Var2 = z7Var;
                elVar2 = elVar;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new v12(cVar, g22Var2, hs2Var, z, z2, w71Var, z3, pr2Var, i12, y7Var2, glVar2, z7Var2, elVar2, le1Var, i2, i3, i4));
            }
        }
        i5 |= 384;
        hs2Var2 = hs2Var;
        if ((i4 & 8) != 0) {
            i5 |= 3072;
        } else if ((i2 & 3072) == 0) {
            if (kk0Var.i(z)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i5 |= i6;
        }
        if ((i4 & 16) != 0) {
            i5 |= 24576;
        } else if ((i2 & 24576) == 0) {
            if (kk0Var.i(z2)) {
                i7 = 16384;
            } else {
                i7 = ConstantsKt.DEFAULT_BUFFER_SIZE;
            }
            i5 |= i7;
        }
        if ((i4 & 32) != 0) {
            if ((i2 & 196608) == 0) {
                if (kk0Var.h(w71Var)) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
                i5 |= i8;
            }
            if ((i4 & 64) != 0) {
                i5 |= 1572864;
            } else if ((i2 & 1572864) == 0) {
                if (kk0Var.i(z3)) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i5 |= i9;
            }
            if ((i4 & Uuid.SIZE_BITS) != 0) {
                if ((i2 & 12582912) == 0) {
                    if (kk0Var.h(pr2Var)) {
                        i10 = 8388608;
                    } else {
                        i10 = 4194304;
                    }
                    i5 |= i10;
                }
                i11 = i4 & FontInfo.NUMBER_OF_CHAR_CODES;
                if (i11 != 0) {
                    i5 |= 100663296;
                    i12 = i;
                } else {
                    i12 = i;
                    if ((i2 & 100663296) == 0) {
                        if (kk0Var.f(i12)) {
                            i13 = 67108864;
                        } else {
                            i13 = 33554432;
                        }
                        i5 |= i13;
                    }
                }
                i14 = i4 & ConstantsKt.MINIMUM_BLOCK_SIZE;
                if (i14 != 0) {
                    i14 = i14;
                    i15 = i5 | 805306368;
                } else {
                    if ((i2 & 805306368) != 0) {
                        if (kk0Var.h(y7Var)) {
                            i16 = 536870912;
                        } else {
                            i16 = 268435456;
                        }
                        i5 |= i16;
                    }
                    i15 = i5;
                }
                i17 = i4 & 1024;
                if (i17 != 0) {
                    i18 = i3 | 6;
                } else if ((i3 & 6) == 0) {
                    if (kk0Var.h(glVar)) {
                        i19 = 4;
                    } else {
                        i19 = 2;
                    }
                    i18 = i3 | i19;
                } else {
                    i18 = i3;
                }
                i20 = i4 & 2048;
                if (i20 != 0) {
                    i18 |= 48;
                } else if ((i3 & 48) != 0) {
                    if (kk0Var.h(z7Var)) {
                        i21 = 32;
                    } else {
                        i21 = 16;
                    }
                    i18 |= i21;
                }
                i22 = i18;
                i23 = i4 & ConstantsKt.DEFAULT_BLOCK_SIZE;
                if (i23 != 0) {
                    i24 = i22 | 384;
                } else if ((i3 & 384) == 0) {
                    if (kk0Var.h(elVar)) {
                        i28 = 256;
                    }
                    i24 = i22 | i28;
                } else {
                    i24 = i22;
                }
                if ((i4 & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0) {
                    i24 |= 3072;
                } else if ((i3 & 3072) == 0) {
                    i24 |= kk0Var.j(le1Var) ? 2048 : 1024;
                }
                if ((i15 & 306783379) == 306783378) {
                    z4 = true;
                } else {
                    z4 = true;
                }
                if (kk0Var.S(i15 & 1, z4)) {
                    if (i11 != 0) {
                        i25 = 0;
                    } else {
                        i25 = i12;
                    }
                    if (i14 != 0) {
                        y7Var3 = null;
                    } else {
                        y7Var3 = y7Var;
                    }
                    if (i17 != 0) {
                        glVar3 = null;
                    } else {
                        glVar3 = glVar;
                    }
                    if (i20 != 0) {
                        z7Var3 = null;
                    } else {
                        z7Var3 = z7Var;
                    }
                    if (i23 != 0) {
                        elVar3 = null;
                    } else {
                        elVar3 = elVar;
                    }
                    i26 = (i15 >> 3) & 14;
                    je1 je1VarRememberLazyListItemProviderLambda5 = u12.rememberLazyListItemProviderLambda(g22Var, le1Var, kk0Var, i26 | ((i24 >> 6) & 112));
                    int i213 = i15 >> 9;
                    g12 g12VarRememberLazyListSemanticState5 = d22.rememberLazyListSemanticState(g22Var, z2, kk0Var, i26 | (i213 & 112));
                    objP = kk0Var.P();
                    if (objP == Composer$Companion.getEmpty()) {
                        objP = r11.a(x21.c, kk0Var);
                        kk0Var.l0(objP);
                    }
                    gq0 gq0Var5 = (gq0) objP;
                    eg1 eg1Var5 = (eg1) kk0Var.l(CompositionLocalsKt.getLocalGraphicsContext());
                    if (((Boolean) kk0Var.l(CompositionLocalsKt.getLocalScrollCaptureInProgress())).booleanValue()) {
                        stickToTopPlacement = StickyItemsPlacement$Companion.getStickToTopPlacement();
                    } else {
                        stickToTopPlacement = null;
                    }
                    int i34 = i24 << 18;
                    ne1 ne1VarRememberLazyListMeasurePolicy5 = rememberLazyListMeasurePolicy(je1VarRememberLazyListItemProviderLambda5, g22Var, hs2Var2, z, z2, i25, y7Var3, z7Var3, elVar3, glVar3, gq0Var5, eg1Var5, stickToTopPlacement, kk0Var, (i15 & 65520) | (i213 & 458752) | (i213 & 3670016) | (i34 & 29360128) | (i34 & 234881024) | ((i24 << 27) & 1879048192), 0);
                    i12 = i25;
                    z7 z7Var8 = z7Var3;
                    el elVar8 = elVar3;
                    gl glVar8 = glVar3;
                    y7 y7Var8 = y7Var3;
                    if (z2) {
                        nq2Var = nq2.c;
                    } else {
                        nq2Var = nq2.d;
                    }
                    nq2Var2 = nq2Var;
                    if (z3) {
                        kk0Var.a0(-1513147781);
                        cVarA = a.a(c.i, m12.rememberLazyListBeyondBoundsState(g22Var, i12, kk0Var, i26 | ((i15 >> 21) & 112)), g22Var.n, z, nq2Var2);
                        kk0Var.r(false);
                    } else {
                        kk0Var.a0(-1512720880);
                        kk0Var.r(false);
                        cVarA = c.i;
                    }
                    g22Var2 = g22Var;
                    r02.LazyLayout(je1VarRememberLazyListItemProviderLambda5, androidx.compose.foundation.a.k(d.lazyLayoutSemantics(cVar.then(g22Var.k).then(g22Var.l), je1VarRememberLazyListItemProviderLambda5, g12VarRememberLazyListSemanticState5, nq2Var2, z3, z, kk0Var, ((i15 >> 6) & 57344) | ((i15 << 6) & 458752)).then(cVarA).then(g22Var.m.i), g22Var, nq2Var2, z3, z, w71Var, g22Var.f, false, pr2Var), g22Var2.o, ne1VarRememberLazyListMeasurePolicy5, kk0Var, 0, 0);
                    y7Var2 = y7Var8;
                    glVar2 = glVar8;
                    z7Var2 = z7Var8;
                    elVar2 = elVar8;
                } else {
                    g22Var2 = g22Var;
                    kk0Var.V();
                    y7Var2 = y7Var;
                    glVar2 = glVar;
                    z7Var2 = z7Var;
                    elVar2 = elVar;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new v12(cVar, g22Var2, hs2Var, z, z2, w71Var, z3, pr2Var, i12, y7Var2, glVar2, z7Var2, elVar2, le1Var, i2, i3, i4));
                }
            }
            i5 |= 12582912;
            i11 = i4 & FontInfo.NUMBER_OF_CHAR_CODES;
            if (i11 != 0) {
                i5 |= 100663296;
                i12 = i;
            } else {
                i12 = i;
                if ((i2 & 100663296) == 0) {
                    if (kk0Var.f(i12)) {
                        i13 = 67108864;
                    } else {
                        i13 = 33554432;
                    }
                    i5 |= i13;
                }
            }
            i14 = i4 & ConstantsKt.MINIMUM_BLOCK_SIZE;
            if (i14 != 0) {
                i14 = i14;
                i15 = i5 | 805306368;
            } else {
                if ((i2 & 805306368) != 0) {
                    if (kk0Var.h(y7Var)) {
                        i16 = 536870912;
                    } else {
                        i16 = 268435456;
                    }
                    i5 |= i16;
                }
                i15 = i5;
            }
            i17 = i4 & 1024;
            if (i17 != 0) {
                i18 = i3 | 6;
            } else if ((i3 & 6) == 0) {
                if (kk0Var.h(glVar)) {
                    i19 = 4;
                } else {
                    i19 = 2;
                }
                i18 = i3 | i19;
            } else {
                i18 = i3;
            }
            i20 = i4 & 2048;
            if (i20 != 0) {
                i18 |= 48;
            } else if ((i3 & 48) != 0) {
                if (kk0Var.h(z7Var)) {
                    i21 = 32;
                } else {
                    i21 = 16;
                }
                i18 |= i21;
            }
            i22 = i18;
            i23 = i4 & ConstantsKt.DEFAULT_BLOCK_SIZE;
            if (i23 != 0) {
                i24 = i22 | 384;
            } else if ((i3 & 384) == 0) {
                if (kk0Var.h(elVar)) {
                    i28 = 256;
                }
                i24 = i22 | i28;
            } else {
                i24 = i22;
            }
            if ((i4 & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0) {
                i24 |= 3072;
            } else if ((i3 & 3072) == 0) {
                i24 |= kk0Var.j(le1Var) ? 2048 : 1024;
            }
            if ((i15 & 306783379) == 306783378) {
                z4 = true;
            } else {
                z4 = true;
            }
            if (kk0Var.S(i15 & 1, z4)) {
                if (i11 != 0) {
                    i25 = 0;
                } else {
                    i25 = i12;
                }
                if (i14 != 0) {
                    y7Var3 = null;
                } else {
                    y7Var3 = y7Var;
                }
                if (i17 != 0) {
                    glVar3 = null;
                } else {
                    glVar3 = glVar;
                }
                if (i20 != 0) {
                    z7Var3 = null;
                } else {
                    z7Var3 = z7Var;
                }
                if (i23 != 0) {
                    elVar3 = null;
                } else {
                    elVar3 = elVar;
                }
                i26 = (i15 >> 3) & 14;
                je1 je1VarRememberLazyListItemProviderLambda6 = u12.rememberLazyListItemProviderLambda(g22Var, le1Var, kk0Var, i26 | ((i24 >> 6) & 112));
                int i214 = i15 >> 9;
                g12 g12VarRememberLazyListSemanticState6 = d22.rememberLazyListSemanticState(g22Var, z2, kk0Var, i26 | (i214 & 112));
                objP = kk0Var.P();
                if (objP == Composer$Companion.getEmpty()) {
                    objP = r11.a(x21.c, kk0Var);
                    kk0Var.l0(objP);
                }
                gq0 gq0Var6 = (gq0) objP;
                eg1 eg1Var6 = (eg1) kk0Var.l(CompositionLocalsKt.getLocalGraphicsContext());
                if (((Boolean) kk0Var.l(CompositionLocalsKt.getLocalScrollCaptureInProgress())).booleanValue()) {
                    stickToTopPlacement = StickyItemsPlacement$Companion.getStickToTopPlacement();
                } else {
                    stickToTopPlacement = null;
                }
                int i35 = i24 << 18;
                ne1 ne1VarRememberLazyListMeasurePolicy6 = rememberLazyListMeasurePolicy(je1VarRememberLazyListItemProviderLambda6, g22Var, hs2Var2, z, z2, i25, y7Var3, z7Var3, elVar3, glVar3, gq0Var6, eg1Var6, stickToTopPlacement, kk0Var, (i15 & 65520) | (i214 & 458752) | (i214 & 3670016) | (i35 & 29360128) | (i35 & 234881024) | ((i24 << 27) & 1879048192), 0);
                i12 = i25;
                z7 z7Var9 = z7Var3;
                el elVar9 = elVar3;
                gl glVar9 = glVar3;
                y7 y7Var9 = y7Var3;
                if (z2) {
                    nq2Var = nq2.c;
                } else {
                    nq2Var = nq2.d;
                }
                nq2Var2 = nq2Var;
                if (z3) {
                    kk0Var.a0(-1513147781);
                    cVarA = a.a(c.i, m12.rememberLazyListBeyondBoundsState(g22Var, i12, kk0Var, i26 | ((i15 >> 21) & 112)), g22Var.n, z, nq2Var2);
                    kk0Var.r(false);
                } else {
                    kk0Var.a0(-1512720880);
                    kk0Var.r(false);
                    cVarA = c.i;
                }
                g22Var2 = g22Var;
                r02.LazyLayout(je1VarRememberLazyListItemProviderLambda6, androidx.compose.foundation.a.k(d.lazyLayoutSemantics(cVar.then(g22Var.k).then(g22Var.l), je1VarRememberLazyListItemProviderLambda6, g12VarRememberLazyListSemanticState6, nq2Var2, z3, z, kk0Var, ((i15 >> 6) & 57344) | ((i15 << 6) & 458752)).then(cVarA).then(g22Var.m.i), g22Var, nq2Var2, z3, z, w71Var, g22Var.f, false, pr2Var), g22Var2.o, ne1VarRememberLazyListMeasurePolicy6, kk0Var, 0, 0);
                y7Var2 = y7Var9;
                glVar2 = glVar9;
                z7Var2 = z7Var9;
                elVar2 = elVar9;
            } else {
                g22Var2 = g22Var;
                kk0Var.V();
                y7Var2 = y7Var;
                glVar2 = glVar;
                z7Var2 = z7Var;
                elVar2 = elVar;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new v12(cVar, g22Var2, hs2Var, z, z2, w71Var, z3, pr2Var, i12, y7Var2, glVar2, z7Var2, elVar2, le1Var, i2, i3, i4));
            }
        }
        i5 |= 196608;
        if ((i4 & 64) != 0) {
            i5 |= 1572864;
        } else if ((i2 & 1572864) == 0) {
            if (kk0Var.i(z3)) {
                i9 = 1048576;
            } else {
                i9 = 524288;
            }
            i5 |= i9;
        }
        if ((i4 & Uuid.SIZE_BITS) != 0) {
            if ((i2 & 12582912) == 0) {
                if (kk0Var.h(pr2Var)) {
                    i10 = 8388608;
                } else {
                    i10 = 4194304;
                }
                i5 |= i10;
            }
            i11 = i4 & FontInfo.NUMBER_OF_CHAR_CODES;
            if (i11 != 0) {
                i5 |= 100663296;
                i12 = i;
            } else {
                i12 = i;
                if ((i2 & 100663296) == 0) {
                    if (kk0Var.f(i12)) {
                        i13 = 67108864;
                    } else {
                        i13 = 33554432;
                    }
                    i5 |= i13;
                }
            }
            i14 = i4 & ConstantsKt.MINIMUM_BLOCK_SIZE;
            if (i14 != 0) {
                i14 = i14;
                i15 = i5 | 805306368;
            } else {
                if ((i2 & 805306368) != 0) {
                    if (kk0Var.h(y7Var)) {
                        i16 = 536870912;
                    } else {
                        i16 = 268435456;
                    }
                    i5 |= i16;
                }
                i15 = i5;
            }
            i17 = i4 & 1024;
            if (i17 != 0) {
                i18 = i3 | 6;
            } else if ((i3 & 6) == 0) {
                if (kk0Var.h(glVar)) {
                    i19 = 4;
                } else {
                    i19 = 2;
                }
                i18 = i3 | i19;
            } else {
                i18 = i3;
            }
            i20 = i4 & 2048;
            if (i20 != 0) {
                i18 |= 48;
            } else if ((i3 & 48) != 0) {
                if (kk0Var.h(z7Var)) {
                    i21 = 32;
                } else {
                    i21 = 16;
                }
                i18 |= i21;
            }
            i22 = i18;
            i23 = i4 & ConstantsKt.DEFAULT_BLOCK_SIZE;
            if (i23 != 0) {
                i24 = i22 | 384;
            } else if ((i3 & 384) == 0) {
                if (kk0Var.h(elVar)) {
                    i28 = 256;
                }
                i24 = i22 | i28;
            } else {
                i24 = i22;
            }
            if ((i4 & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0) {
                i24 |= 3072;
            } else if ((i3 & 3072) == 0) {
                i24 |= kk0Var.j(le1Var) ? 2048 : 1024;
            }
            if ((i15 & 306783379) == 306783378) {
                z4 = true;
            } else {
                z4 = true;
            }
            if (kk0Var.S(i15 & 1, z4)) {
                if (i11 != 0) {
                    i25 = 0;
                } else {
                    i25 = i12;
                }
                if (i14 != 0) {
                    y7Var3 = null;
                } else {
                    y7Var3 = y7Var;
                }
                if (i17 != 0) {
                    glVar3 = null;
                } else {
                    glVar3 = glVar;
                }
                if (i20 != 0) {
                    z7Var3 = null;
                } else {
                    z7Var3 = z7Var;
                }
                if (i23 != 0) {
                    elVar3 = null;
                } else {
                    elVar3 = elVar;
                }
                i26 = (i15 >> 3) & 14;
                je1 je1VarRememberLazyListItemProviderLambda7 = u12.rememberLazyListItemProviderLambda(g22Var, le1Var, kk0Var, i26 | ((i24 >> 6) & 112));
                int i215 = i15 >> 9;
                g12 g12VarRememberLazyListSemanticState7 = d22.rememberLazyListSemanticState(g22Var, z2, kk0Var, i26 | (i215 & 112));
                objP = kk0Var.P();
                if (objP == Composer$Companion.getEmpty()) {
                    objP = r11.a(x21.c, kk0Var);
                    kk0Var.l0(objP);
                }
                gq0 gq0Var7 = (gq0) objP;
                eg1 eg1Var7 = (eg1) kk0Var.l(CompositionLocalsKt.getLocalGraphicsContext());
                if (((Boolean) kk0Var.l(CompositionLocalsKt.getLocalScrollCaptureInProgress())).booleanValue()) {
                    stickToTopPlacement = StickyItemsPlacement$Companion.getStickToTopPlacement();
                } else {
                    stickToTopPlacement = null;
                }
                int i36 = i24 << 18;
                ne1 ne1VarRememberLazyListMeasurePolicy7 = rememberLazyListMeasurePolicy(je1VarRememberLazyListItemProviderLambda7, g22Var, hs2Var2, z, z2, i25, y7Var3, z7Var3, elVar3, glVar3, gq0Var7, eg1Var7, stickToTopPlacement, kk0Var, (i15 & 65520) | (i215 & 458752) | (i215 & 3670016) | (i36 & 29360128) | (i36 & 234881024) | ((i24 << 27) & 1879048192), 0);
                i12 = i25;
                z7 z7Var10 = z7Var3;
                el elVar10 = elVar3;
                gl glVar10 = glVar3;
                y7 y7Var10 = y7Var3;
                if (z2) {
                    nq2Var = nq2.c;
                } else {
                    nq2Var = nq2.d;
                }
                nq2Var2 = nq2Var;
                if (z3) {
                    kk0Var.a0(-1513147781);
                    cVarA = a.a(c.i, m12.rememberLazyListBeyondBoundsState(g22Var, i12, kk0Var, i26 | ((i15 >> 21) & 112)), g22Var.n, z, nq2Var2);
                    kk0Var.r(false);
                } else {
                    kk0Var.a0(-1512720880);
                    kk0Var.r(false);
                    cVarA = c.i;
                }
                g22Var2 = g22Var;
                r02.LazyLayout(je1VarRememberLazyListItemProviderLambda7, androidx.compose.foundation.a.k(d.lazyLayoutSemantics(cVar.then(g22Var.k).then(g22Var.l), je1VarRememberLazyListItemProviderLambda7, g12VarRememberLazyListSemanticState7, nq2Var2, z3, z, kk0Var, ((i15 >> 6) & 57344) | ((i15 << 6) & 458752)).then(cVarA).then(g22Var.m.i), g22Var, nq2Var2, z3, z, w71Var, g22Var.f, false, pr2Var), g22Var2.o, ne1VarRememberLazyListMeasurePolicy7, kk0Var, 0, 0);
                y7Var2 = y7Var10;
                glVar2 = glVar10;
                z7Var2 = z7Var10;
                elVar2 = elVar10;
            } else {
                g22Var2 = g22Var;
                kk0Var.V();
                y7Var2 = y7Var;
                glVar2 = glVar;
                z7Var2 = z7Var;
                elVar2 = elVar;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new v12(cVar, g22Var2, hs2Var, z, z2, w71Var, z3, pr2Var, i12, y7Var2, glVar2, z7Var2, elVar2, le1Var, i2, i3, i4));
            }
        }
        i5 |= 12582912;
        i11 = i4 & FontInfo.NUMBER_OF_CHAR_CODES;
        if (i11 != 0) {
            i5 |= 100663296;
            i12 = i;
        } else {
            i12 = i;
            if ((i2 & 100663296) == 0) {
                if (kk0Var.f(i12)) {
                    i13 = 67108864;
                } else {
                    i13 = 33554432;
                }
                i5 |= i13;
            }
        }
        i14 = i4 & ConstantsKt.MINIMUM_BLOCK_SIZE;
        if (i14 != 0) {
            i14 = i14;
            i15 = i5 | 805306368;
        } else {
            if ((i2 & 805306368) != 0) {
                if (kk0Var.h(y7Var)) {
                    i16 = 536870912;
                } else {
                    i16 = 268435456;
                }
                i5 |= i16;
            }
            i15 = i5;
        }
        i17 = i4 & 1024;
        if (i17 != 0) {
            i18 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            if (kk0Var.h(glVar)) {
                i19 = 4;
            } else {
                i19 = 2;
            }
            i18 = i3 | i19;
        } else {
            i18 = i3;
        }
        i20 = i4 & 2048;
        if (i20 != 0) {
            i18 |= 48;
        } else if ((i3 & 48) != 0) {
            if (kk0Var.h(z7Var)) {
                i21 = 32;
            } else {
                i21 = 16;
            }
            i18 |= i21;
        }
        i22 = i18;
        i23 = i4 & ConstantsKt.DEFAULT_BLOCK_SIZE;
        if (i23 != 0) {
            i24 = i22 | 384;
        } else if ((i3 & 384) == 0) {
            if (kk0Var.h(elVar)) {
                i28 = 256;
            }
            i24 = i22 | i28;
        } else {
            i24 = i22;
        }
        if ((i4 & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0) {
            i24 |= 3072;
        } else if ((i3 & 3072) == 0) {
            i24 |= kk0Var.j(le1Var) ? 2048 : 1024;
        }
        if ((i15 & 306783379) == 306783378) {
            z4 = true;
        } else {
            z4 = true;
        }
        if (kk0Var.S(i15 & 1, z4)) {
            if (i11 != 0) {
                i25 = 0;
            } else {
                i25 = i12;
            }
            if (i14 != 0) {
                y7Var3 = null;
            } else {
                y7Var3 = y7Var;
            }
            if (i17 != 0) {
                glVar3 = null;
            } else {
                glVar3 = glVar;
            }
            if (i20 != 0) {
                z7Var3 = null;
            } else {
                z7Var3 = z7Var;
            }
            if (i23 != 0) {
                elVar3 = null;
            } else {
                elVar3 = elVar;
            }
            i26 = (i15 >> 3) & 14;
            je1 je1VarRememberLazyListItemProviderLambda8 = u12.rememberLazyListItemProviderLambda(g22Var, le1Var, kk0Var, i26 | ((i24 >> 6) & 112));
            int i216 = i15 >> 9;
            g12 g12VarRememberLazyListSemanticState8 = d22.rememberLazyListSemanticState(g22Var, z2, kk0Var, i26 | (i216 & 112));
            objP = kk0Var.P();
            if (objP == Composer$Companion.getEmpty()) {
                objP = r11.a(x21.c, kk0Var);
                kk0Var.l0(objP);
            }
            gq0 gq0Var8 = (gq0) objP;
            eg1 eg1Var8 = (eg1) kk0Var.l(CompositionLocalsKt.getLocalGraphicsContext());
            if (((Boolean) kk0Var.l(CompositionLocalsKt.getLocalScrollCaptureInProgress())).booleanValue()) {
                stickToTopPlacement = StickyItemsPlacement$Companion.getStickToTopPlacement();
            } else {
                stickToTopPlacement = null;
            }
            int i37 = i24 << 18;
            ne1 ne1VarRememberLazyListMeasurePolicy8 = rememberLazyListMeasurePolicy(je1VarRememberLazyListItemProviderLambda8, g22Var, hs2Var2, z, z2, i25, y7Var3, z7Var3, elVar3, glVar3, gq0Var8, eg1Var8, stickToTopPlacement, kk0Var, (i15 & 65520) | (i216 & 458752) | (i216 & 3670016) | (i37 & 29360128) | (i37 & 234881024) | ((i24 << 27) & 1879048192), 0);
            i12 = i25;
            z7 z7Var11 = z7Var3;
            el elVar11 = elVar3;
            gl glVar11 = glVar3;
            y7 y7Var11 = y7Var3;
            if (z2) {
                nq2Var = nq2.c;
            } else {
                nq2Var = nq2.d;
            }
            nq2Var2 = nq2Var;
            if (z3) {
                kk0Var.a0(-1513147781);
                cVarA = a.a(c.i, m12.rememberLazyListBeyondBoundsState(g22Var, i12, kk0Var, i26 | ((i15 >> 21) & 112)), g22Var.n, z, nq2Var2);
                kk0Var.r(false);
            } else {
                kk0Var.a0(-1512720880);
                kk0Var.r(false);
                cVarA = c.i;
            }
            g22Var2 = g22Var;
            r02.LazyLayout(je1VarRememberLazyListItemProviderLambda8, androidx.compose.foundation.a.k(d.lazyLayoutSemantics(cVar.then(g22Var.k).then(g22Var.l), je1VarRememberLazyListItemProviderLambda8, g12VarRememberLazyListSemanticState8, nq2Var2, z3, z, kk0Var, ((i15 >> 6) & 57344) | ((i15 << 6) & 458752)).then(cVarA).then(g22Var.m.i), g22Var, nq2Var2, z3, z, w71Var, g22Var.f, false, pr2Var), g22Var2.o, ne1VarRememberLazyListMeasurePolicy8, kk0Var, 0, 0);
            y7Var2 = y7Var11;
            glVar2 = glVar11;
            z7Var2 = z7Var11;
            elVar2 = elVar11;
        } else {
            g22Var2 = g22Var;
            kk0Var.V();
            y7Var2 = y7Var;
            glVar2 = glVar;
            z7Var2 = z7Var;
            elVar2 = elVar;
        }
        w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new v12(cVar, g22Var2, hs2Var, z, z2, w71Var, z3, pr2Var, i12, y7Var2, glVar2, z7Var2, elVar2, le1Var, i2, i3, i4));
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020 A[PHI: r7
  0x0020: PHI (r7v3 g22) = (r7v1 g22), (r7v4 g22) binds: [B:9:0x001e, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:14:0x002b  */
    /* JADX WARN: Code duplicated, block: B:17:0x0038  */
    /* JADX WARN: Code duplicated, block: B:20:0x003e A[PHI: r9
  0x003e: PHI (r9v3 hs2) = (r9v1 hs2), (r9v4 hs2) binds: [B:19:0x003c, B:15:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:21:0x0040  */
    /* JADX WARN: Code duplicated, block: B:24:0x004a  */
    /* JADX WARN: Code duplicated, block: B:27:0x0057  */
    /* JADX WARN: Code duplicated, block: B:30:0x005d A[PHI: r10
  0x005d: PHI (r10v3 boolean) = (r10v1 boolean), (r10v4 boolean) binds: [B:29:0x005b, B:25:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:31:0x005f  */
    /* JADX WARN: Code duplicated, block: B:34:0x006b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0078  */
    /* JADX WARN: Code duplicated, block: B:40:0x007e A[PHI: r11
  0x007e: PHI (r11v4 boolean) = (r11v1 boolean), (r11v5 boolean) binds: [B:39:0x007c, B:35:0x0075] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:41:0x0080  */
    /* JADX WARN: Code duplicated, block: B:44:0x008c  */
    /* JADX WARN: Code duplicated, block: B:47:0x0099  */
    /* JADX WARN: Code duplicated, block: B:50:0x009f A[PHI: r13
  0x009f: PHI (r13v4 y7) = (r13v1 y7), (r13v5 y7) binds: [B:49:0x009d, B:45:0x0096] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:51:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c0 A[PHI: r14
  0x00c0: PHI (r14v4 z7) = (r14v1 z7), (r14v5 z7) binds: [B:59:0x00be, B:55:0x00b7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:67:0x00db  */
    /* JADX WARN: Code duplicated, block: B:70:0x00e1 A[PHI: r15
  0x00e1: PHI (r15v4 el) = (r15v1 el), (r15v5 el) binds: [B:69:0x00df, B:65:0x00d8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:77:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:80:0x0101 A[PHI: r3
  0x0101: PHI (r3v3 gl) = (r3v1 gl), (r3v4 gl) binds: [B:79:0x00ff, B:75:0x00f9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:81:0x0103  */
    /* JADX WARN: Code duplicated, block: B:84:0x0116  */
    /* JADX WARN: Code duplicated, block: B:87:0x011f  */
    /* JADX WARN: Code duplicated, block: B:90:0x0125 A[PHI: r8
  0x0125: PHI (r8v13 wn3) = (r8v10 wn3), (r8v14 wn3) binds: [B:89:0x0123, B:85:0x011c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:91:0x0128  */
    /* JADX WARN: Code duplicated, block: B:94:0x0132  */
    /* JADX WARN: Code duplicated, block: B:96:0x0138  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Iterative traversal limit reached: limit: 450, visitor: jadx.core.dex.visitors.regions.IfRegionVisitor$RemoveRedundantElseVisitor, blocks count: 90
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:51)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:46)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    private static final defpackage.ne1 rememberLazyListMeasurePolicy(defpackage.je1 r20, defpackage.g22 r21, defpackage.hs2 r22, boolean r23, boolean r24, int r25, defpackage.y7 r26, defpackage.z7 r27, defpackage.el r28, defpackage.gl r29, defpackage.gq0 r30, defpackage.eg1 r31, defpackage.wn3 r32, defpackage.ck0 r33, int r34, int r35) {
        /*
            Method dump skipped, instruction units count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y12.rememberLazyListMeasurePolicy(je1, g22, hs2, boolean, boolean, int, y7, z7, el, gl, gq0, eg1, wn3, ck0, int, int):ne1");
    }
}
