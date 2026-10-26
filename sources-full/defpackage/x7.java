package defpackage;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.Composer$Companion;
import androidx.compose.ui.Modifier$Companion;
import androidx.compose.ui.b;
import androidx.compose.ui.c;
import androidx.compose.ui.node.ComposeUiNode$Companion;
import kotlin.io.ConstantsKt;
import kotlin.uuid.Uuid;
import org.scilab.forge.jlatexmath.FontInfo;

/* JADX INFO: loaded from: classes.dex */
public abstract class x7 {
    public static final is2 a = new is2(24.0f, 24.0f, 24.0f, 24.0f);
    public static final is2 b = a.c(0.0f, 0.0f, 16.0f, 7);
    public static final is2 c = a.c(0.0f, 0.0f, 16.0f, 7);
    public static final is2 d = a.c(0.0f, 0.0f, 24.0f, 7);

    @cv0
    public static final void AlertDialog(je1 je1Var, c cVar, uv0 uv0Var, ne1 ne1Var, ck0 ck0Var, int i, int i2) {
        int i3;
        ne1 ne1Var2;
        c cVar2;
        uv0 uv0Var2;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(325249497);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (kk0Var.j(je1Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= kk0Var.h(cVar) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= kk0Var.h(uv0Var) ? FontInfo.NUMBER_OF_CHAR_CODES : Uuid.SIZE_BITS;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
            ne1Var2 = ne1Var;
        } else {
            ne1Var2 = ne1Var;
            if ((i & 3072) == 0) {
                i3 |= kk0Var.j(ne1Var2) ? 2048 : 1024;
            }
        }
        if ((i3 & 1171) == 1170 && kk0Var.F()) {
            kk0Var.V();
            cVar2 = cVar;
            uv0Var2 = uv0Var;
        } else {
            if (i4 != 0) {
                cVar = c.i;
            }
            c cVar3 = cVar;
            if (i5 != 0) {
                uv0Var = new uv0(true, true, true);
            }
            uv0 uv0Var3 = uv0Var;
            BasicAlertDialog(je1Var, cVar3, uv0Var3, ne1Var2, kk0Var, i3 & 8190, 0);
            cVar2 = cVar3;
            uv0Var2 = uv0Var3;
        }
        w33 w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new i7(je1Var, cVar2, uv0Var2, ne1Var, i, i2, 0));
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0119  */
    /* JADX WARN: Code duplicated, block: B:102:0x011f  */
    /* JADX WARN: Code duplicated, block: B:104:0x0125  */
    /* JADX WARN: Code duplicated, block: B:105:0x0128  */
    /* JADX WARN: Code duplicated, block: B:109:0x012f  */
    /* JADX WARN: Code duplicated, block: B:110:0x0134  */
    /* JADX WARN: Code duplicated, block: B:112:0x013a  */
    /* JADX WARN: Code duplicated, block: B:114:0x0140  */
    /* JADX WARN: Code duplicated, block: B:115:0x0143  */
    /* JADX WARN: Code duplicated, block: B:117:0x0148  */
    /* JADX WARN: Code duplicated, block: B:120:0x014e  */
    /* JADX WARN: Code duplicated, block: B:121:0x0153  */
    /* JADX WARN: Code duplicated, block: B:123:0x0159  */
    /* JADX WARN: Code duplicated, block: B:125:0x015f  */
    /* JADX WARN: Code duplicated, block: B:126:0x0162  */
    /* JADX WARN: Code duplicated, block: B:130:0x016f  */
    /* JADX WARN: Code duplicated, block: B:136:0x0181 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:137:0x0183  */
    /* JADX WARN: Code duplicated, block: B:138:0x0186  */
    /* JADX WARN: Code duplicated, block: B:142:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Code duplicated, block: B:27:0x0050  */
    /* JADX WARN: Code duplicated, block: B:29:0x0056  */
    /* JADX WARN: Code duplicated, block: B:31:0x005c  */
    /* JADX WARN: Code duplicated, block: B:32:0x005f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0066  */
    /* JADX WARN: Code duplicated, block: B:37:0x006b  */
    /* JADX WARN: Code duplicated, block: B:39:0x0071  */
    /* JADX WARN: Code duplicated, block: B:41:0x0077  */
    /* JADX WARN: Code duplicated, block: B:42:0x007a  */
    /* JADX WARN: Code duplicated, block: B:46:0x0081  */
    /* JADX WARN: Code duplicated, block: B:48:0x0086  */
    /* JADX WARN: Code duplicated, block: B:50:0x008a  */
    /* JADX WARN: Code duplicated, block: B:52:0x0092  */
    /* JADX WARN: Code duplicated, block: B:53:0x0095  */
    /* JADX WARN: Code duplicated, block: B:57:0x009e  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:80:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:90:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:92:0x0101  */
    /* JADX WARN: Code duplicated, block: B:94:0x0107  */
    /* JADX WARN: Code duplicated, block: B:95:0x010a  */
    /* JADX WARN: Code duplicated, block: B:99:0x0114  */
    /* JADX INFO: renamed from: AlertDialogContent-4hvqGtA, reason: not valid java name */
    public static final void m1872xa3017a6d(ne1 ne1Var, c cVar, ne1 ne1Var2, ne1 ne1Var3, ne1 ne1Var4, rg3 rg3Var, long j, float f, long j2, long j3, long j4, long j5, ck0 ck0Var, int i, int i2, int i3) {
        int i4;
        c cVar2;
        int i5;
        ne1 ne1Var5;
        int i6;
        ne1 ne1Var6;
        int i7;
        rg3 rg3Var2;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        long j6;
        int i13;
        int i14;
        int i15;
        c cVar3;
        c cVar4;
        w33 w33VarV;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(1522575799);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (kk0Var.j(ne1Var) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        int i16 = i3 & 2;
        if (i16 == 0) {
            if ((i & 48) == 0) {
                cVar2 = cVar;
                i4 |= kk0Var.h(cVar2) ? 32 : 16;
            }
            if ((i3 & 4) != 0) {
                i4 |= 384;
            } else if ((i & 384) == 0) {
                if (kk0Var.j(ne1Var2)) {
                    i5 = FontInfo.NUMBER_OF_CHAR_CODES;
                } else {
                    i5 = Uuid.SIZE_BITS;
                }
                i4 |= i5;
            }
            if ((i3 & 8) != 0) {
                i4 |= 3072;
                ne1Var5 = ne1Var3;
            } else {
                ne1Var5 = ne1Var3;
                if ((i & 3072) == 0) {
                    if (kk0Var.j(ne1Var5)) {
                        i6 = 2048;
                    } else {
                        i6 = 1024;
                    }
                    i4 |= i6;
                }
            }
            if ((i3 & 16) != 0) {
                if ((i & 24576) == 0) {
                    ne1Var6 = ne1Var4;
                    if (kk0Var.j(ne1Var6)) {
                        i7 = 16384;
                    } else {
                        i7 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                    }
                    i4 |= i7;
                }
                if ((i3 & 32) != 0) {
                    if ((i & 196608) == 0) {
                        rg3Var2 = rg3Var;
                        if (kk0Var.h(rg3Var2)) {
                            i8 = 131072;
                        } else {
                            i8 = 65536;
                        }
                        i4 |= i8;
                    }
                    if ((i3 & 64) != 0) {
                        i4 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        if (kk0Var.g(j)) {
                            i9 = 1048576;
                        } else {
                            i9 = 524288;
                        }
                        i4 |= i9;
                    }
                    if ((i3 & Uuid.SIZE_BITS) != 0) {
                        if ((i & 12582912) == 0) {
                            if (kk0Var.e(f)) {
                                i10 = 8388608;
                            } else {
                                i10 = 4194304;
                            }
                            i4 |= i10;
                        }
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            i4 |= 100663296;
                        } else if ((i & 100663296) == 0) {
                            if (kk0Var.g(j2)) {
                                i11 = 67108864;
                            } else {
                                i11 = 33554432;
                            }
                            i4 |= i11;
                        }
                        if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                            i4 |= 805306368;
                        } else if ((i & 805306368) == 0) {
                            if (kk0Var.g(j3)) {
                                i12 = 536870912;
                            } else {
                                i12 = 268435456;
                            }
                            i4 |= i12;
                        }
                        if ((i3 & 1024) != 0) {
                            i13 = i2 | 6;
                            j6 = j4;
                        } else {
                            j6 = j4;
                            if ((i2 & 6) == 0) {
                                if (kk0Var.g(j6)) {
                                    i14 = 4;
                                } else {
                                    i14 = 2;
                                }
                                i13 = i2 | i14;
                            } else {
                                i13 = i2;
                            }
                        }
                        if ((i3 & 2048) != 0) {
                            i13 |= 48;
                        } else if ((i2 & 48) == 0) {
                            if (kk0Var.g(j5)) {
                                i15 = 32;
                            } else {
                                i15 = 16;
                            }
                            i13 |= i15;
                        }
                        if ((306783379 & i4) != 306783378 && (i13 & 19) == 18 && kk0Var.F()) {
                            kk0Var.V();
                            cVar4 = cVar2;
                        } else {
                            if (i16 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            int i17 = i4 >> 12;
                            cVar4 = cVar3;
                            hq3.m210x8dcae10(cVar4, rg3Var2, j, 0L, f, 0.0f, null, zg0.rememberComposableLambda(-2126308228, true, new m7(ne1Var2, ne1Var5, ne1Var6, j3, j6, j5, j2, ne1Var), kk0Var, 54), kk0Var, ((i4 >> 3) & 14) | 12582912 | (i17 & 112) | (i17 & 896) | ((i4 >> 9) & 57344), 104);
                        }
                        w33VarV = kk0Var.v();
                        if (w33VarV != null) {
                            w33VarV.updateScope(new n7(ne1Var, cVar4, ne1Var2, ne1Var3, ne1Var4, rg3Var, j, f, j2, j3, j4, j5, i, i2, i3));
                        }
                    }
                    i4 |= 12582912;
                    if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                        i4 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        if (kk0Var.g(j2)) {
                            i11 = 67108864;
                        } else {
                            i11 = 33554432;
                        }
                        i4 |= i11;
                    }
                    if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                        i4 |= 805306368;
                    } else if ((i & 805306368) == 0) {
                        if (kk0Var.g(j3)) {
                            i12 = 536870912;
                        } else {
                            i12 = 268435456;
                        }
                        i4 |= i12;
                    }
                    if ((i3 & 1024) != 0) {
                        i13 = i2 | 6;
                        j6 = j4;
                    } else {
                        j6 = j4;
                        if ((i2 & 6) == 0) {
                            if (kk0Var.g(j6)) {
                                i14 = 4;
                            } else {
                                i14 = 2;
                            }
                            i13 = i2 | i14;
                        } else {
                            i13 = i2;
                        }
                    }
                    if ((i3 & 2048) != 0) {
                        i13 |= 48;
                    } else if ((i2 & 48) == 0) {
                        if (kk0Var.g(j5)) {
                            i15 = 32;
                        } else {
                            i15 = 16;
                        }
                        i13 |= i15;
                    }
                    if ((306783379 & i4) != 306783378) {
                        if (i16 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        int i18 = i4 >> 12;
                        cVar4 = cVar3;
                        hq3.m210x8dcae10(cVar4, rg3Var2, j, 0L, f, 0.0f, null, zg0.rememberComposableLambda(-2126308228, true, new m7(ne1Var2, ne1Var5, ne1Var6, j3, j6, j5, j2, ne1Var), kk0Var, 54), kk0Var, ((i4 >> 3) & 14) | 12582912 | (i18 & 112) | (i18 & 896) | ((i4 >> 9) & 57344), 104);
                    } else {
                        if (i16 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        int i19 = i4 >> 12;
                        cVar4 = cVar3;
                        hq3.m210x8dcae10(cVar4, rg3Var2, j, 0L, f, 0.0f, null, zg0.rememberComposableLambda(-2126308228, true, new m7(ne1Var2, ne1Var5, ne1Var6, j3, j6, j5, j2, ne1Var), kk0Var, 54), kk0Var, ((i4 >> 3) & 14) | 12582912 | (i19 & 112) | (i19 & 896) | ((i4 >> 9) & 57344), 104);
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new n7(ne1Var, cVar4, ne1Var2, ne1Var3, ne1Var4, rg3Var, j, f, j2, j3, j4, j5, i, i2, i3));
                    }
                }
                i4 |= 196608;
                rg3Var2 = rg3Var;
                if ((i3 & 64) != 0) {
                    i4 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    if (kk0Var.g(j)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i4 |= i9;
                }
                if ((i3 & Uuid.SIZE_BITS) != 0) {
                    if ((i & 12582912) == 0) {
                        if (kk0Var.e(f)) {
                            i10 = 8388608;
                        } else {
                            i10 = 4194304;
                        }
                        i4 |= i10;
                    }
                    if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                        i4 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        if (kk0Var.g(j2)) {
                            i11 = 67108864;
                        } else {
                            i11 = 33554432;
                        }
                        i4 |= i11;
                    }
                    if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                        i4 |= 805306368;
                    } else if ((i & 805306368) == 0) {
                        if (kk0Var.g(j3)) {
                            i12 = 536870912;
                        } else {
                            i12 = 268435456;
                        }
                        i4 |= i12;
                    }
                    if ((i3 & 1024) != 0) {
                        i13 = i2 | 6;
                        j6 = j4;
                    } else {
                        j6 = j4;
                        if ((i2 & 6) == 0) {
                            if (kk0Var.g(j6)) {
                                i14 = 4;
                            } else {
                                i14 = 2;
                            }
                            i13 = i2 | i14;
                        } else {
                            i13 = i2;
                        }
                    }
                    if ((i3 & 2048) != 0) {
                        i13 |= 48;
                    } else if ((i2 & 48) == 0) {
                        if (kk0Var.g(j5)) {
                            i15 = 32;
                        } else {
                            i15 = 16;
                        }
                        i13 |= i15;
                    }
                    if ((306783379 & i4) != 306783378) {
                        if (i16 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        int i110 = i4 >> 12;
                        cVar4 = cVar3;
                        hq3.m210x8dcae10(cVar4, rg3Var2, j, 0L, f, 0.0f, null, zg0.rememberComposableLambda(-2126308228, true, new m7(ne1Var2, ne1Var5, ne1Var6, j3, j6, j5, j2, ne1Var), kk0Var, 54), kk0Var, ((i4 >> 3) & 14) | 12582912 | (i110 & 112) | (i110 & 896) | ((i4 >> 9) & 57344), 104);
                    } else {
                        if (i16 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        int i111 = i4 >> 12;
                        cVar4 = cVar3;
                        hq3.m210x8dcae10(cVar4, rg3Var2, j, 0L, f, 0.0f, null, zg0.rememberComposableLambda(-2126308228, true, new m7(ne1Var2, ne1Var5, ne1Var6, j3, j6, j5, j2, ne1Var), kk0Var, 54), kk0Var, ((i4 >> 3) & 14) | 12582912 | (i111 & 112) | (i111 & 896) | ((i4 >> 9) & 57344), 104);
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new n7(ne1Var, cVar4, ne1Var2, ne1Var3, ne1Var4, rg3Var, j, f, j2, j3, j4, j5, i, i2, i3));
                    }
                }
                i4 |= 12582912;
                if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                    i4 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    if (kk0Var.g(j2)) {
                        i11 = 67108864;
                    } else {
                        i11 = 33554432;
                    }
                    i4 |= i11;
                }
                if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                    i4 |= 805306368;
                } else if ((i & 805306368) == 0) {
                    if (kk0Var.g(j3)) {
                        i12 = 536870912;
                    } else {
                        i12 = 268435456;
                    }
                    i4 |= i12;
                }
                if ((i3 & 1024) != 0) {
                    i13 = i2 | 6;
                    j6 = j4;
                } else {
                    j6 = j4;
                    if ((i2 & 6) == 0) {
                        if (kk0Var.g(j6)) {
                            i14 = 4;
                        } else {
                            i14 = 2;
                        }
                        i13 = i2 | i14;
                    } else {
                        i13 = i2;
                    }
                }
                if ((i3 & 2048) != 0) {
                    i13 |= 48;
                } else if ((i2 & 48) == 0) {
                    if (kk0Var.g(j5)) {
                        i15 = 32;
                    } else {
                        i15 = 16;
                    }
                    i13 |= i15;
                }
                if ((306783379 & i4) != 306783378) {
                    if (i16 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    int i112 = i4 >> 12;
                    cVar4 = cVar3;
                    hq3.m210x8dcae10(cVar4, rg3Var2, j, 0L, f, 0.0f, null, zg0.rememberComposableLambda(-2126308228, true, new m7(ne1Var2, ne1Var5, ne1Var6, j3, j6, j5, j2, ne1Var), kk0Var, 54), kk0Var, ((i4 >> 3) & 14) | 12582912 | (i112 & 112) | (i112 & 896) | ((i4 >> 9) & 57344), 104);
                } else {
                    if (i16 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    int i113 = i4 >> 12;
                    cVar4 = cVar3;
                    hq3.m210x8dcae10(cVar4, rg3Var2, j, 0L, f, 0.0f, null, zg0.rememberComposableLambda(-2126308228, true, new m7(ne1Var2, ne1Var5, ne1Var6, j3, j6, j5, j2, ne1Var), kk0Var, 54), kk0Var, ((i4 >> 3) & 14) | 12582912 | (i113 & 112) | (i113 & 896) | ((i4 >> 9) & 57344), 104);
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new n7(ne1Var, cVar4, ne1Var2, ne1Var3, ne1Var4, rg3Var, j, f, j2, j3, j4, j5, i, i2, i3));
                }
            }
            i4 |= 24576;
            ne1Var6 = ne1Var4;
            if ((i3 & 32) != 0) {
                if ((i & 196608) == 0) {
                    rg3Var2 = rg3Var;
                    if (kk0Var.h(rg3Var2)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i4 |= i8;
                }
                if ((i3 & 64) != 0) {
                    i4 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    if (kk0Var.g(j)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i4 |= i9;
                }
                if ((i3 & Uuid.SIZE_BITS) != 0) {
                    if ((i & 12582912) == 0) {
                        if (kk0Var.e(f)) {
                            i10 = 8388608;
                        } else {
                            i10 = 4194304;
                        }
                        i4 |= i10;
                    }
                    if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                        i4 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        if (kk0Var.g(j2)) {
                            i11 = 67108864;
                        } else {
                            i11 = 33554432;
                        }
                        i4 |= i11;
                    }
                    if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                        i4 |= 805306368;
                    } else if ((i & 805306368) == 0) {
                        if (kk0Var.g(j3)) {
                            i12 = 536870912;
                        } else {
                            i12 = 268435456;
                        }
                        i4 |= i12;
                    }
                    if ((i3 & 1024) != 0) {
                        i13 = i2 | 6;
                        j6 = j4;
                    } else {
                        j6 = j4;
                        if ((i2 & 6) == 0) {
                            if (kk0Var.g(j6)) {
                                i14 = 4;
                            } else {
                                i14 = 2;
                            }
                            i13 = i2 | i14;
                        } else {
                            i13 = i2;
                        }
                    }
                    if ((i3 & 2048) != 0) {
                        i13 |= 48;
                    } else if ((i2 & 48) == 0) {
                        if (kk0Var.g(j5)) {
                            i15 = 32;
                        } else {
                            i15 = 16;
                        }
                        i13 |= i15;
                    }
                    if ((306783379 & i4) != 306783378) {
                        if (i16 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        int i114 = i4 >> 12;
                        cVar4 = cVar3;
                        hq3.m210x8dcae10(cVar4, rg3Var2, j, 0L, f, 0.0f, null, zg0.rememberComposableLambda(-2126308228, true, new m7(ne1Var2, ne1Var5, ne1Var6, j3, j6, j5, j2, ne1Var), kk0Var, 54), kk0Var, ((i4 >> 3) & 14) | 12582912 | (i114 & 112) | (i114 & 896) | ((i4 >> 9) & 57344), 104);
                    } else {
                        if (i16 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        int i115 = i4 >> 12;
                        cVar4 = cVar3;
                        hq3.m210x8dcae10(cVar4, rg3Var2, j, 0L, f, 0.0f, null, zg0.rememberComposableLambda(-2126308228, true, new m7(ne1Var2, ne1Var5, ne1Var6, j3, j6, j5, j2, ne1Var), kk0Var, 54), kk0Var, ((i4 >> 3) & 14) | 12582912 | (i115 & 112) | (i115 & 896) | ((i4 >> 9) & 57344), 104);
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new n7(ne1Var, cVar4, ne1Var2, ne1Var3, ne1Var4, rg3Var, j, f, j2, j3, j4, j5, i, i2, i3));
                    }
                }
                i4 |= 12582912;
                if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                    i4 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    if (kk0Var.g(j2)) {
                        i11 = 67108864;
                    } else {
                        i11 = 33554432;
                    }
                    i4 |= i11;
                }
                if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                    i4 |= 805306368;
                } else if ((i & 805306368) == 0) {
                    if (kk0Var.g(j3)) {
                        i12 = 536870912;
                    } else {
                        i12 = 268435456;
                    }
                    i4 |= i12;
                }
                if ((i3 & 1024) != 0) {
                    i13 = i2 | 6;
                    j6 = j4;
                } else {
                    j6 = j4;
                    if ((i2 & 6) == 0) {
                        if (kk0Var.g(j6)) {
                            i14 = 4;
                        } else {
                            i14 = 2;
                        }
                        i13 = i2 | i14;
                    } else {
                        i13 = i2;
                    }
                }
                if ((i3 & 2048) != 0) {
                    i13 |= 48;
                } else if ((i2 & 48) == 0) {
                    if (kk0Var.g(j5)) {
                        i15 = 32;
                    } else {
                        i15 = 16;
                    }
                    i13 |= i15;
                }
                if ((306783379 & i4) != 306783378) {
                    if (i16 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    int i116 = i4 >> 12;
                    cVar4 = cVar3;
                    hq3.m210x8dcae10(cVar4, rg3Var2, j, 0L, f, 0.0f, null, zg0.rememberComposableLambda(-2126308228, true, new m7(ne1Var2, ne1Var5, ne1Var6, j3, j6, j5, j2, ne1Var), kk0Var, 54), kk0Var, ((i4 >> 3) & 14) | 12582912 | (i116 & 112) | (i116 & 896) | ((i4 >> 9) & 57344), 104);
                } else {
                    if (i16 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    int i117 = i4 >> 12;
                    cVar4 = cVar3;
                    hq3.m210x8dcae10(cVar4, rg3Var2, j, 0L, f, 0.0f, null, zg0.rememberComposableLambda(-2126308228, true, new m7(ne1Var2, ne1Var5, ne1Var6, j3, j6, j5, j2, ne1Var), kk0Var, 54), kk0Var, ((i4 >> 3) & 14) | 12582912 | (i117 & 112) | (i117 & 896) | ((i4 >> 9) & 57344), 104);
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new n7(ne1Var, cVar4, ne1Var2, ne1Var3, ne1Var4, rg3Var, j, f, j2, j3, j4, j5, i, i2, i3));
                }
            }
            i4 |= 196608;
            rg3Var2 = rg3Var;
            if ((i3 & 64) != 0) {
                i4 |= 1572864;
            } else if ((i & 1572864) == 0) {
                if (kk0Var.g(j)) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i4 |= i9;
            }
            if ((i3 & Uuid.SIZE_BITS) != 0) {
                if ((i & 12582912) == 0) {
                    if (kk0Var.e(f)) {
                        i10 = 8388608;
                    } else {
                        i10 = 4194304;
                    }
                    i4 |= i10;
                }
                if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                    i4 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    if (kk0Var.g(j2)) {
                        i11 = 67108864;
                    } else {
                        i11 = 33554432;
                    }
                    i4 |= i11;
                }
                if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                    i4 |= 805306368;
                } else if ((i & 805306368) == 0) {
                    if (kk0Var.g(j3)) {
                        i12 = 536870912;
                    } else {
                        i12 = 268435456;
                    }
                    i4 |= i12;
                }
                if ((i3 & 1024) != 0) {
                    i13 = i2 | 6;
                    j6 = j4;
                } else {
                    j6 = j4;
                    if ((i2 & 6) == 0) {
                        if (kk0Var.g(j6)) {
                            i14 = 4;
                        } else {
                            i14 = 2;
                        }
                        i13 = i2 | i14;
                    } else {
                        i13 = i2;
                    }
                }
                if ((i3 & 2048) != 0) {
                    i13 |= 48;
                } else if ((i2 & 48) == 0) {
                    if (kk0Var.g(j5)) {
                        i15 = 32;
                    } else {
                        i15 = 16;
                    }
                    i13 |= i15;
                }
                if ((306783379 & i4) != 306783378) {
                    if (i16 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    int i118 = i4 >> 12;
                    cVar4 = cVar3;
                    hq3.m210x8dcae10(cVar4, rg3Var2, j, 0L, f, 0.0f, null, zg0.rememberComposableLambda(-2126308228, true, new m7(ne1Var2, ne1Var5, ne1Var6, j3, j6, j5, j2, ne1Var), kk0Var, 54), kk0Var, ((i4 >> 3) & 14) | 12582912 | (i118 & 112) | (i118 & 896) | ((i4 >> 9) & 57344), 104);
                } else {
                    if (i16 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    int i119 = i4 >> 12;
                    cVar4 = cVar3;
                    hq3.m210x8dcae10(cVar4, rg3Var2, j, 0L, f, 0.0f, null, zg0.rememberComposableLambda(-2126308228, true, new m7(ne1Var2, ne1Var5, ne1Var6, j3, j6, j5, j2, ne1Var), kk0Var, 54), kk0Var, ((i4 >> 3) & 14) | 12582912 | (i119 & 112) | (i119 & 896) | ((i4 >> 9) & 57344), 104);
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new n7(ne1Var, cVar4, ne1Var2, ne1Var3, ne1Var4, rg3Var, j, f, j2, j3, j4, j5, i, i2, i3));
                }
            }
            i4 |= 12582912;
            if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                i4 |= 100663296;
            } else if ((i & 100663296) == 0) {
                if (kk0Var.g(j2)) {
                    i11 = 67108864;
                } else {
                    i11 = 33554432;
                }
                i4 |= i11;
            }
            if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                i4 |= 805306368;
            } else if ((i & 805306368) == 0) {
                if (kk0Var.g(j3)) {
                    i12 = 536870912;
                } else {
                    i12 = 268435456;
                }
                i4 |= i12;
            }
            if ((i3 & 1024) != 0) {
                i13 = i2 | 6;
                j6 = j4;
            } else {
                j6 = j4;
                if ((i2 & 6) == 0) {
                    if (kk0Var.g(j6)) {
                        i14 = 4;
                    } else {
                        i14 = 2;
                    }
                    i13 = i2 | i14;
                } else {
                    i13 = i2;
                }
            }
            if ((i3 & 2048) != 0) {
                i13 |= 48;
            } else if ((i2 & 48) == 0) {
                if (kk0Var.g(j5)) {
                    i15 = 32;
                } else {
                    i15 = 16;
                }
                i13 |= i15;
            }
            if ((306783379 & i4) != 306783378) {
                if (i16 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                int i1110 = i4 >> 12;
                cVar4 = cVar3;
                hq3.m210x8dcae10(cVar4, rg3Var2, j, 0L, f, 0.0f, null, zg0.rememberComposableLambda(-2126308228, true, new m7(ne1Var2, ne1Var5, ne1Var6, j3, j6, j5, j2, ne1Var), kk0Var, 54), kk0Var, ((i4 >> 3) & 14) | 12582912 | (i1110 & 112) | (i1110 & 896) | ((i4 >> 9) & 57344), 104);
            } else {
                if (i16 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                int i1111 = i4 >> 12;
                cVar4 = cVar3;
                hq3.m210x8dcae10(cVar4, rg3Var2, j, 0L, f, 0.0f, null, zg0.rememberComposableLambda(-2126308228, true, new m7(ne1Var2, ne1Var5, ne1Var6, j3, j6, j5, j2, ne1Var), kk0Var, 54), kk0Var, ((i4 >> 3) & 14) | 12582912 | (i1111 & 112) | (i1111 & 896) | ((i4 >> 9) & 57344), 104);
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new n7(ne1Var, cVar4, ne1Var2, ne1Var3, ne1Var4, rg3Var, j, f, j2, j3, j4, j5, i, i2, i3));
            }
        }
        i4 |= 48;
        cVar2 = cVar;
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            if (kk0Var.j(ne1Var2)) {
                i5 = FontInfo.NUMBER_OF_CHAR_CODES;
            } else {
                i5 = Uuid.SIZE_BITS;
            }
            i4 |= i5;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
            ne1Var5 = ne1Var3;
        } else {
            ne1Var5 = ne1Var3;
            if ((i & 3072) == 0) {
                if (kk0Var.j(ne1Var5)) {
                    i6 = 2048;
                } else {
                    i6 = 1024;
                }
                i4 |= i6;
            }
        }
        if ((i3 & 16) != 0) {
            if ((i & 24576) == 0) {
                ne1Var6 = ne1Var4;
                if (kk0Var.j(ne1Var6)) {
                    i7 = 16384;
                } else {
                    i7 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                }
                i4 |= i7;
            }
            if ((i3 & 32) != 0) {
                if ((i & 196608) == 0) {
                    rg3Var2 = rg3Var;
                    if (kk0Var.h(rg3Var2)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i4 |= i8;
                }
                if ((i3 & 64) != 0) {
                    i4 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    if (kk0Var.g(j)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i4 |= i9;
                }
                if ((i3 & Uuid.SIZE_BITS) != 0) {
                    if ((i & 12582912) == 0) {
                        if (kk0Var.e(f)) {
                            i10 = 8388608;
                        } else {
                            i10 = 4194304;
                        }
                        i4 |= i10;
                    }
                    if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                        i4 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        if (kk0Var.g(j2)) {
                            i11 = 67108864;
                        } else {
                            i11 = 33554432;
                        }
                        i4 |= i11;
                    }
                    if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                        i4 |= 805306368;
                    } else if ((i & 805306368) == 0) {
                        if (kk0Var.g(j3)) {
                            i12 = 536870912;
                        } else {
                            i12 = 268435456;
                        }
                        i4 |= i12;
                    }
                    if ((i3 & 1024) != 0) {
                        i13 = i2 | 6;
                        j6 = j4;
                    } else {
                        j6 = j4;
                        if ((i2 & 6) == 0) {
                            if (kk0Var.g(j6)) {
                                i14 = 4;
                            } else {
                                i14 = 2;
                            }
                            i13 = i2 | i14;
                        } else {
                            i13 = i2;
                        }
                    }
                    if ((i3 & 2048) != 0) {
                        i13 |= 48;
                    } else if ((i2 & 48) == 0) {
                        if (kk0Var.g(j5)) {
                            i15 = 32;
                        } else {
                            i15 = 16;
                        }
                        i13 |= i15;
                    }
                    if ((306783379 & i4) != 306783378) {
                        if (i16 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        int i1112 = i4 >> 12;
                        cVar4 = cVar3;
                        hq3.m210x8dcae10(cVar4, rg3Var2, j, 0L, f, 0.0f, null, zg0.rememberComposableLambda(-2126308228, true, new m7(ne1Var2, ne1Var5, ne1Var6, j3, j6, j5, j2, ne1Var), kk0Var, 54), kk0Var, ((i4 >> 3) & 14) | 12582912 | (i1112 & 112) | (i1112 & 896) | ((i4 >> 9) & 57344), 104);
                    } else {
                        if (i16 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        int i1113 = i4 >> 12;
                        cVar4 = cVar3;
                        hq3.m210x8dcae10(cVar4, rg3Var2, j, 0L, f, 0.0f, null, zg0.rememberComposableLambda(-2126308228, true, new m7(ne1Var2, ne1Var5, ne1Var6, j3, j6, j5, j2, ne1Var), kk0Var, 54), kk0Var, ((i4 >> 3) & 14) | 12582912 | (i1113 & 112) | (i1113 & 896) | ((i4 >> 9) & 57344), 104);
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new n7(ne1Var, cVar4, ne1Var2, ne1Var3, ne1Var4, rg3Var, j, f, j2, j3, j4, j5, i, i2, i3));
                    }
                }
                i4 |= 12582912;
                if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                    i4 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    if (kk0Var.g(j2)) {
                        i11 = 67108864;
                    } else {
                        i11 = 33554432;
                    }
                    i4 |= i11;
                }
                if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                    i4 |= 805306368;
                } else if ((i & 805306368) == 0) {
                    if (kk0Var.g(j3)) {
                        i12 = 536870912;
                    } else {
                        i12 = 268435456;
                    }
                    i4 |= i12;
                }
                if ((i3 & 1024) != 0) {
                    i13 = i2 | 6;
                    j6 = j4;
                } else {
                    j6 = j4;
                    if ((i2 & 6) == 0) {
                        if (kk0Var.g(j6)) {
                            i14 = 4;
                        } else {
                            i14 = 2;
                        }
                        i13 = i2 | i14;
                    } else {
                        i13 = i2;
                    }
                }
                if ((i3 & 2048) != 0) {
                    i13 |= 48;
                } else if ((i2 & 48) == 0) {
                    if (kk0Var.g(j5)) {
                        i15 = 32;
                    } else {
                        i15 = 16;
                    }
                    i13 |= i15;
                }
                if ((306783379 & i4) != 306783378) {
                    if (i16 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    int i1114 = i4 >> 12;
                    cVar4 = cVar3;
                    hq3.m210x8dcae10(cVar4, rg3Var2, j, 0L, f, 0.0f, null, zg0.rememberComposableLambda(-2126308228, true, new m7(ne1Var2, ne1Var5, ne1Var6, j3, j6, j5, j2, ne1Var), kk0Var, 54), kk0Var, ((i4 >> 3) & 14) | 12582912 | (i1114 & 112) | (i1114 & 896) | ((i4 >> 9) & 57344), 104);
                } else {
                    if (i16 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    int i1115 = i4 >> 12;
                    cVar4 = cVar3;
                    hq3.m210x8dcae10(cVar4, rg3Var2, j, 0L, f, 0.0f, null, zg0.rememberComposableLambda(-2126308228, true, new m7(ne1Var2, ne1Var5, ne1Var6, j3, j6, j5, j2, ne1Var), kk0Var, 54), kk0Var, ((i4 >> 3) & 14) | 12582912 | (i1115 & 112) | (i1115 & 896) | ((i4 >> 9) & 57344), 104);
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new n7(ne1Var, cVar4, ne1Var2, ne1Var3, ne1Var4, rg3Var, j, f, j2, j3, j4, j5, i, i2, i3));
                }
            }
            i4 |= 196608;
            rg3Var2 = rg3Var;
            if ((i3 & 64) != 0) {
                i4 |= 1572864;
            } else if ((i & 1572864) == 0) {
                if (kk0Var.g(j)) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i4 |= i9;
            }
            if ((i3 & Uuid.SIZE_BITS) != 0) {
                if ((i & 12582912) == 0) {
                    if (kk0Var.e(f)) {
                        i10 = 8388608;
                    } else {
                        i10 = 4194304;
                    }
                    i4 |= i10;
                }
                if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                    i4 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    if (kk0Var.g(j2)) {
                        i11 = 67108864;
                    } else {
                        i11 = 33554432;
                    }
                    i4 |= i11;
                }
                if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                    i4 |= 805306368;
                } else if ((i & 805306368) == 0) {
                    if (kk0Var.g(j3)) {
                        i12 = 536870912;
                    } else {
                        i12 = 268435456;
                    }
                    i4 |= i12;
                }
                if ((i3 & 1024) != 0) {
                    i13 = i2 | 6;
                    j6 = j4;
                } else {
                    j6 = j4;
                    if ((i2 & 6) == 0) {
                        if (kk0Var.g(j6)) {
                            i14 = 4;
                        } else {
                            i14 = 2;
                        }
                        i13 = i2 | i14;
                    } else {
                        i13 = i2;
                    }
                }
                if ((i3 & 2048) != 0) {
                    i13 |= 48;
                } else if ((i2 & 48) == 0) {
                    if (kk0Var.g(j5)) {
                        i15 = 32;
                    } else {
                        i15 = 16;
                    }
                    i13 |= i15;
                }
                if ((306783379 & i4) != 306783378) {
                    if (i16 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    int i1116 = i4 >> 12;
                    cVar4 = cVar3;
                    hq3.m210x8dcae10(cVar4, rg3Var2, j, 0L, f, 0.0f, null, zg0.rememberComposableLambda(-2126308228, true, new m7(ne1Var2, ne1Var5, ne1Var6, j3, j6, j5, j2, ne1Var), kk0Var, 54), kk0Var, ((i4 >> 3) & 14) | 12582912 | (i1116 & 112) | (i1116 & 896) | ((i4 >> 9) & 57344), 104);
                } else {
                    if (i16 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    int i1117 = i4 >> 12;
                    cVar4 = cVar3;
                    hq3.m210x8dcae10(cVar4, rg3Var2, j, 0L, f, 0.0f, null, zg0.rememberComposableLambda(-2126308228, true, new m7(ne1Var2, ne1Var5, ne1Var6, j3, j6, j5, j2, ne1Var), kk0Var, 54), kk0Var, ((i4 >> 3) & 14) | 12582912 | (i1117 & 112) | (i1117 & 896) | ((i4 >> 9) & 57344), 104);
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new n7(ne1Var, cVar4, ne1Var2, ne1Var3, ne1Var4, rg3Var, j, f, j2, j3, j4, j5, i, i2, i3));
                }
            }
            i4 |= 12582912;
            if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                i4 |= 100663296;
            } else if ((i & 100663296) == 0) {
                if (kk0Var.g(j2)) {
                    i11 = 67108864;
                } else {
                    i11 = 33554432;
                }
                i4 |= i11;
            }
            if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                i4 |= 805306368;
            } else if ((i & 805306368) == 0) {
                if (kk0Var.g(j3)) {
                    i12 = 536870912;
                } else {
                    i12 = 268435456;
                }
                i4 |= i12;
            }
            if ((i3 & 1024) != 0) {
                i13 = i2 | 6;
                j6 = j4;
            } else {
                j6 = j4;
                if ((i2 & 6) == 0) {
                    if (kk0Var.g(j6)) {
                        i14 = 4;
                    } else {
                        i14 = 2;
                    }
                    i13 = i2 | i14;
                } else {
                    i13 = i2;
                }
            }
            if ((i3 & 2048) != 0) {
                i13 |= 48;
            } else if ((i2 & 48) == 0) {
                if (kk0Var.g(j5)) {
                    i15 = 32;
                } else {
                    i15 = 16;
                }
                i13 |= i15;
            }
            if ((306783379 & i4) != 306783378) {
                if (i16 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                int i1118 = i4 >> 12;
                cVar4 = cVar3;
                hq3.m210x8dcae10(cVar4, rg3Var2, j, 0L, f, 0.0f, null, zg0.rememberComposableLambda(-2126308228, true, new m7(ne1Var2, ne1Var5, ne1Var6, j3, j6, j5, j2, ne1Var), kk0Var, 54), kk0Var, ((i4 >> 3) & 14) | 12582912 | (i1118 & 112) | (i1118 & 896) | ((i4 >> 9) & 57344), 104);
            } else {
                if (i16 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                int i1119 = i4 >> 12;
                cVar4 = cVar3;
                hq3.m210x8dcae10(cVar4, rg3Var2, j, 0L, f, 0.0f, null, zg0.rememberComposableLambda(-2126308228, true, new m7(ne1Var2, ne1Var5, ne1Var6, j3, j6, j5, j2, ne1Var), kk0Var, 54), kk0Var, ((i4 >> 3) & 14) | 12582912 | (i1119 & 112) | (i1119 & 896) | ((i4 >> 9) & 57344), 104);
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new n7(ne1Var, cVar4, ne1Var2, ne1Var3, ne1Var4, rg3Var, j, f, j2, j3, j4, j5, i, i2, i3));
            }
        }
        i4 |= 24576;
        ne1Var6 = ne1Var4;
        if ((i3 & 32) != 0) {
            if ((i & 196608) == 0) {
                rg3Var2 = rg3Var;
                if (kk0Var.h(rg3Var2)) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
                i4 |= i8;
            }
            if ((i3 & 64) != 0) {
                i4 |= 1572864;
            } else if ((i & 1572864) == 0) {
                if (kk0Var.g(j)) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i4 |= i9;
            }
            if ((i3 & Uuid.SIZE_BITS) != 0) {
                if ((i & 12582912) == 0) {
                    if (kk0Var.e(f)) {
                        i10 = 8388608;
                    } else {
                        i10 = 4194304;
                    }
                    i4 |= i10;
                }
                if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                    i4 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    if (kk0Var.g(j2)) {
                        i11 = 67108864;
                    } else {
                        i11 = 33554432;
                    }
                    i4 |= i11;
                }
                if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                    i4 |= 805306368;
                } else if ((i & 805306368) == 0) {
                    if (kk0Var.g(j3)) {
                        i12 = 536870912;
                    } else {
                        i12 = 268435456;
                    }
                    i4 |= i12;
                }
                if ((i3 & 1024) != 0) {
                    i13 = i2 | 6;
                    j6 = j4;
                } else {
                    j6 = j4;
                    if ((i2 & 6) == 0) {
                        if (kk0Var.g(j6)) {
                            i14 = 4;
                        } else {
                            i14 = 2;
                        }
                        i13 = i2 | i14;
                    } else {
                        i13 = i2;
                    }
                }
                if ((i3 & 2048) != 0) {
                    i13 |= 48;
                } else if ((i2 & 48) == 0) {
                    if (kk0Var.g(j5)) {
                        i15 = 32;
                    } else {
                        i15 = 16;
                    }
                    i13 |= i15;
                }
                if ((306783379 & i4) != 306783378) {
                    if (i16 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    int i11110 = i4 >> 12;
                    cVar4 = cVar3;
                    hq3.m210x8dcae10(cVar4, rg3Var2, j, 0L, f, 0.0f, null, zg0.rememberComposableLambda(-2126308228, true, new m7(ne1Var2, ne1Var5, ne1Var6, j3, j6, j5, j2, ne1Var), kk0Var, 54), kk0Var, ((i4 >> 3) & 14) | 12582912 | (i11110 & 112) | (i11110 & 896) | ((i4 >> 9) & 57344), 104);
                } else {
                    if (i16 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    int i11111 = i4 >> 12;
                    cVar4 = cVar3;
                    hq3.m210x8dcae10(cVar4, rg3Var2, j, 0L, f, 0.0f, null, zg0.rememberComposableLambda(-2126308228, true, new m7(ne1Var2, ne1Var5, ne1Var6, j3, j6, j5, j2, ne1Var), kk0Var, 54), kk0Var, ((i4 >> 3) & 14) | 12582912 | (i11111 & 112) | (i11111 & 896) | ((i4 >> 9) & 57344), 104);
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new n7(ne1Var, cVar4, ne1Var2, ne1Var3, ne1Var4, rg3Var, j, f, j2, j3, j4, j5, i, i2, i3));
                }
            }
            i4 |= 12582912;
            if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                i4 |= 100663296;
            } else if ((i & 100663296) == 0) {
                if (kk0Var.g(j2)) {
                    i11 = 67108864;
                } else {
                    i11 = 33554432;
                }
                i4 |= i11;
            }
            if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                i4 |= 805306368;
            } else if ((i & 805306368) == 0) {
                if (kk0Var.g(j3)) {
                    i12 = 536870912;
                } else {
                    i12 = 268435456;
                }
                i4 |= i12;
            }
            if ((i3 & 1024) != 0) {
                i13 = i2 | 6;
                j6 = j4;
            } else {
                j6 = j4;
                if ((i2 & 6) == 0) {
                    if (kk0Var.g(j6)) {
                        i14 = 4;
                    } else {
                        i14 = 2;
                    }
                    i13 = i2 | i14;
                } else {
                    i13 = i2;
                }
            }
            if ((i3 & 2048) != 0) {
                i13 |= 48;
            } else if ((i2 & 48) == 0) {
                if (kk0Var.g(j5)) {
                    i15 = 32;
                } else {
                    i15 = 16;
                }
                i13 |= i15;
            }
            if ((306783379 & i4) != 306783378) {
                if (i16 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                int i11112 = i4 >> 12;
                cVar4 = cVar3;
                hq3.m210x8dcae10(cVar4, rg3Var2, j, 0L, f, 0.0f, null, zg0.rememberComposableLambda(-2126308228, true, new m7(ne1Var2, ne1Var5, ne1Var6, j3, j6, j5, j2, ne1Var), kk0Var, 54), kk0Var, ((i4 >> 3) & 14) | 12582912 | (i11112 & 112) | (i11112 & 896) | ((i4 >> 9) & 57344), 104);
            } else {
                if (i16 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                int i11113 = i4 >> 12;
                cVar4 = cVar3;
                hq3.m210x8dcae10(cVar4, rg3Var2, j, 0L, f, 0.0f, null, zg0.rememberComposableLambda(-2126308228, true, new m7(ne1Var2, ne1Var5, ne1Var6, j3, j6, j5, j2, ne1Var), kk0Var, 54), kk0Var, ((i4 >> 3) & 14) | 12582912 | (i11113 & 112) | (i11113 & 896) | ((i4 >> 9) & 57344), 104);
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new n7(ne1Var, cVar4, ne1Var2, ne1Var3, ne1Var4, rg3Var, j, f, j2, j3, j4, j5, i, i2, i3));
            }
        }
        i4 |= 196608;
        rg3Var2 = rg3Var;
        if ((i3 & 64) != 0) {
            i4 |= 1572864;
        } else if ((i & 1572864) == 0) {
            if (kk0Var.g(j)) {
                i9 = 1048576;
            } else {
                i9 = 524288;
            }
            i4 |= i9;
        }
        if ((i3 & Uuid.SIZE_BITS) != 0) {
            if ((i & 12582912) == 0) {
                if (kk0Var.e(f)) {
                    i10 = 8388608;
                } else {
                    i10 = 4194304;
                }
                i4 |= i10;
            }
            if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                i4 |= 100663296;
            } else if ((i & 100663296) == 0) {
                if (kk0Var.g(j2)) {
                    i11 = 67108864;
                } else {
                    i11 = 33554432;
                }
                i4 |= i11;
            }
            if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                i4 |= 805306368;
            } else if ((i & 805306368) == 0) {
                if (kk0Var.g(j3)) {
                    i12 = 536870912;
                } else {
                    i12 = 268435456;
                }
                i4 |= i12;
            }
            if ((i3 & 1024) != 0) {
                i13 = i2 | 6;
                j6 = j4;
            } else {
                j6 = j4;
                if ((i2 & 6) == 0) {
                    if (kk0Var.g(j6)) {
                        i14 = 4;
                    } else {
                        i14 = 2;
                    }
                    i13 = i2 | i14;
                } else {
                    i13 = i2;
                }
            }
            if ((i3 & 2048) != 0) {
                i13 |= 48;
            } else if ((i2 & 48) == 0) {
                if (kk0Var.g(j5)) {
                    i15 = 32;
                } else {
                    i15 = 16;
                }
                i13 |= i15;
            }
            if ((306783379 & i4) != 306783378) {
                if (i16 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                int i11114 = i4 >> 12;
                cVar4 = cVar3;
                hq3.m210x8dcae10(cVar4, rg3Var2, j, 0L, f, 0.0f, null, zg0.rememberComposableLambda(-2126308228, true, new m7(ne1Var2, ne1Var5, ne1Var6, j3, j6, j5, j2, ne1Var), kk0Var, 54), kk0Var, ((i4 >> 3) & 14) | 12582912 | (i11114 & 112) | (i11114 & 896) | ((i4 >> 9) & 57344), 104);
            } else {
                if (i16 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                int i11115 = i4 >> 12;
                cVar4 = cVar3;
                hq3.m210x8dcae10(cVar4, rg3Var2, j, 0L, f, 0.0f, null, zg0.rememberComposableLambda(-2126308228, true, new m7(ne1Var2, ne1Var5, ne1Var6, j3, j6, j5, j2, ne1Var), kk0Var, 54), kk0Var, ((i4 >> 3) & 14) | 12582912 | (i11115 & 112) | (i11115 & 896) | ((i4 >> 9) & 57344), 104);
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new n7(ne1Var, cVar4, ne1Var2, ne1Var3, ne1Var4, rg3Var, j, f, j2, j3, j4, j5, i, i2, i3));
            }
        }
        i4 |= 12582912;
        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
            i4 |= 100663296;
        } else if ((i & 100663296) == 0) {
            if (kk0Var.g(j2)) {
                i11 = 67108864;
            } else {
                i11 = 33554432;
            }
            i4 |= i11;
        }
        if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
            i4 |= 805306368;
        } else if ((i & 805306368) == 0) {
            if (kk0Var.g(j3)) {
                i12 = 536870912;
            } else {
                i12 = 268435456;
            }
            i4 |= i12;
        }
        if ((i3 & 1024) != 0) {
            i13 = i2 | 6;
            j6 = j4;
        } else {
            j6 = j4;
            if ((i2 & 6) == 0) {
                if (kk0Var.g(j6)) {
                    i14 = 4;
                } else {
                    i14 = 2;
                }
                i13 = i2 | i14;
            } else {
                i13 = i2;
            }
        }
        if ((i3 & 2048) != 0) {
            i13 |= 48;
        } else if ((i2 & 48) == 0) {
            if (kk0Var.g(j5)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i13 |= i15;
        }
        if ((306783379 & i4) != 306783378) {
            if (i16 != 0) {
                cVar3 = c.i;
            } else {
                cVar3 = cVar2;
            }
            int i11116 = i4 >> 12;
            cVar4 = cVar3;
            hq3.m210x8dcae10(cVar4, rg3Var2, j, 0L, f, 0.0f, null, zg0.rememberComposableLambda(-2126308228, true, new m7(ne1Var2, ne1Var5, ne1Var6, j3, j6, j5, j2, ne1Var), kk0Var, 54), kk0Var, ((i4 >> 3) & 14) | 12582912 | (i11116 & 112) | (i11116 & 896) | ((i4 >> 9) & 57344), 104);
        } else {
            if (i16 != 0) {
                cVar3 = c.i;
            } else {
                cVar3 = cVar2;
            }
            int i11117 = i4 >> 12;
            cVar4 = cVar3;
            hq3.m210x8dcae10(cVar4, rg3Var2, j, 0L, f, 0.0f, null, zg0.rememberComposableLambda(-2126308228, true, new m7(ne1Var2, ne1Var5, ne1Var6, j3, j6, j5, j2, ne1Var), kk0Var, 54), kk0Var, ((i4 >> 3) & 14) | 12582912 | (i11117 & 112) | (i11117 & 896) | ((i4 >> 9) & 57344), 104);
        }
        w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new n7(ne1Var, cVar4, ne1Var2, ne1Var3, ne1Var4, rg3Var, j, f, j2, j3, j4, j5, i, i2, i3));
        }
    }

    /* JADX INFO: renamed from: AlertDialogFlowRow-ixp7dh8, reason: not valid java name */
    public static final void m1873xc3391bf9(float f, float f2, ne1 ne1Var, ck0 ck0Var, int i) {
        int i2;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(586821353);
        if ((i & 6) == 0) {
            i2 = (kk0Var.e(f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= kk0Var.e(f2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= kk0Var.j(ne1Var) ? FontInfo.NUMBER_OF_CHAR_CODES : Uuid.SIZE_BITS;
        }
        if ((i2 & 147) == 146 && kk0Var.F()) {
            kk0Var.V();
        } else {
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object objP = kk0Var.P();
            if (z || objP == Composer$Companion.getEmpty()) {
                objP = new p7(f, f2);
                kk0Var.l0(objP);
            }
            vb2 vb2Var = (vb2) objP;
            Modifier$Companion modifier$Companion = c.i;
            int currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
            su2 su2VarN = kk0Var.n();
            c cVarD = b.d(kk0Var, modifier$Companion);
            androidx.compose.ui.node.a.j.getClass();
            d4 constructor = ComposeUiNode$Companion.getConstructor();
            int i3 = ((((i2 >> 6) & 14) << 6) & 896) | 6;
            if (kk0Var.a == null) {
                rj0.a();
                throw null;
            }
            kk0Var.e0();
            if (kk0Var.O) {
                kk0Var.m(constructor);
            } else {
                kk0Var.o0();
            }
            pe peVarH = fq2.h(kk0Var, vb2Var, kk0Var, su2VarN);
            if (kk0Var.O || !kr1.n(kk0Var.P(), Integer.valueOf(currentCompositeKeyHash))) {
                fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
            }
            xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
            fq2.w((i3 >> 6) & 14, ne1Var, kk0Var, true);
        }
        w33 w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new q7(f, f2, ne1Var, i));
        }
    }

    /* JADX INFO: renamed from: AlertDialogImpl-wrnwzgE, reason: not valid java name */
    public static final void m1874x2036d36b(je1 je1Var, ne1 ne1Var, c cVar, ne1 ne1Var2, ne1 ne1Var3, ne1 ne1Var4, ne1 ne1Var5, rg3 rg3Var, long j, long j2, long j3, long j4, float f, uv0 uv0Var, ck0 ck0Var, int i, int i2) {
        int i3;
        ne1 ne1Var6;
        ne1 ne1Var7;
        int i4;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(-919826268);
        if ((i & 6) == 0) {
            i3 = (kk0Var.j(je1Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            ne1Var6 = ne1Var;
            i3 |= kk0Var.j(ne1Var6) ? 32 : 16;
        } else {
            ne1Var6 = ne1Var;
        }
        if ((i & 384) == 0) {
            i3 |= kk0Var.h(cVar) ? FontInfo.NUMBER_OF_CHAR_CODES : Uuid.SIZE_BITS;
        }
        if ((i & 3072) == 0) {
            ne1Var7 = ne1Var2;
            i3 |= kk0Var.j(ne1Var7) ? 2048 : 1024;
        } else {
            ne1Var7 = ne1Var2;
        }
        if ((i & 24576) == 0) {
            i3 |= kk0Var.j(ne1Var3) ? 16384 : ConstantsKt.DEFAULT_BUFFER_SIZE;
        }
        if ((i & 196608) == 0) {
            i3 |= kk0Var.j(ne1Var4) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= kk0Var.j(ne1Var5) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= kk0Var.h(rg3Var) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= kk0Var.g(j) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= kk0Var.g(j2) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (kk0Var.g(j3) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= kk0Var.g(j4) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= kk0Var.e(f) ? FontInfo.NUMBER_OF_CHAR_CODES : Uuid.SIZE_BITS;
        }
        if ((i2 & 3072) == 0) {
            i4 |= kk0Var.h(uv0Var) ? 2048 : 1024;
        }
        int i5 = i4;
        if ((i3 & 306783379) == 306783378 && (i5 & 1171) == 1170 && kk0Var.F()) {
            kk0Var.V();
        } else {
            BasicAlertDialog(je1Var, cVar, uv0Var, zg0.rememberComposableLambda(-1852840226, true, new t7(ne1Var3, ne1Var4, ne1Var5, rg3Var, j, f, j2, j3, j4, ne1Var7, ne1Var6), kk0Var, 54), kk0Var, (i3 & 14) | 3072 | ((i3 >> 3) & 112) | ((i5 >> 3) & 896), 0);
        }
        w33 w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new u7(je1Var, ne1Var, cVar, ne1Var2, ne1Var3, ne1Var4, ne1Var5, rg3Var, j, j2, j3, j4, f, uv0Var, i, i2));
        }
    }

    public static final void BasicAlertDialog(je1 je1Var, c cVar, uv0 uv0Var, ne1 ne1Var, ck0 ck0Var, int i, int i2) {
        int i3;
        uv0 uv0Var2;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(-1922902937);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (kk0Var.j(je1Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= kk0Var.h(cVar) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= kk0Var.h(uv0Var) ? FontInfo.NUMBER_OF_CHAR_CODES : Uuid.SIZE_BITS;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= kk0Var.j(ne1Var) ? 2048 : 1024;
        }
        if ((i3 & 1171) == 1170 && kk0Var.F()) {
            kk0Var.V();
            uv0Var2 = uv0Var;
        } else {
            if (i4 != 0) {
                cVar = c.i;
            }
            if (i5 != 0) {
                uv0Var = new uv0(true, true, true);
            }
            uv0 uv0Var3 = uv0Var;
            wa.Dialog(je1Var, uv0Var3, zg0.rememberComposableLambda(905289008, true, new w7(cVar, ne1Var), kk0Var, 54), kk0Var, (i3 & 14) | 384 | ((i3 >> 3) & 112), 0);
            uv0Var2 = uv0Var3;
        }
        c cVar2 = cVar;
        w33 w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new i7(je1Var, cVar2, uv0Var2, ne1Var, i, i2, 1));
        }
    }
}
