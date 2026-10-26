package defpackage;

import ai.notrack.app.R;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.layout.e;
import androidx.compose.material3.internal.a;
import androidx.compose.runtime.Composer$Companion;
import androidx.compose.ui.Alignment$Companion;
import androidx.compose.ui.Modifier$Companion;
import androidx.compose.ui.b;
import androidx.compose.ui.c;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.ui.node.ComposeUiNode$Companion;
import androidx.compose.ui.platform.CompositionLocalsKt;
import kotlin.KotlinVersion;
import kotlin.io.ConstantsKt;
import kotlin.uuid.Uuid;
import org.scilab.forge.jlatexmath.FontInfo;

/* JADX INFO: loaded from: classes.dex */
public abstract class uj2 {
    public static final t64 a = new t64(FontInfo.NUMBER_OF_CHAR_CODES, (b11) null, 6);

    /* JADX WARN: Code duplicated, block: B:112:0x0142 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:113:0x0144  */
    /* JADX WARN: Code duplicated, block: B:114:0x0147  */
    /* JADX WARN: Code duplicated, block: B:116:0x014b  */
    /* JADX WARN: Code duplicated, block: B:117:0x014e  */
    /* JADX WARN: Code duplicated, block: B:120:0x015a  */
    /* JADX WARN: Code duplicated, block: B:121:0x0161  */
    /* JADX WARN: Code duplicated, block: B:124:0x0166  */
    /* JADX WARN: Code duplicated, block: B:125:0x0171  */
    /* JADX WARN: Code duplicated, block: B:127:0x0174  */
    /* JADX WARN: Code duplicated, block: B:128:0x0176  */
    /* JADX WARN: Code duplicated, block: B:131:0x017b  */
    /* JADX WARN: Code duplicated, block: B:133:0x018d  */
    /* JADX WARN: Code duplicated, block: B:137:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0046  */
    /* JADX WARN: Code duplicated, block: B:28:0x004b  */
    /* JADX WARN: Code duplicated, block: B:30:0x004f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0057  */
    /* JADX WARN: Code duplicated, block: B:33:0x005a  */
    /* JADX WARN: Code duplicated, block: B:37:0x0061  */
    /* JADX WARN: Code duplicated, block: B:39:0x0065  */
    /* JADX WARN: Code duplicated, block: B:41:0x006d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0070  */
    /* JADX WARN: Code duplicated, block: B:45:0x0076  */
    /* JADX WARN: Code duplicated, block: B:48:0x007c  */
    /* JADX WARN: Code duplicated, block: B:50:0x0080  */
    /* JADX WARN: Code duplicated, block: B:52:0x0088  */
    /* JADX WARN: Code duplicated, block: B:53:0x008b  */
    /* JADX WARN: Code duplicated, block: B:56:0x0091  */
    /* JADX WARN: Code duplicated, block: B:59:0x0099  */
    /* JADX WARN: Code duplicated, block: B:61:0x009d  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:65:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:72:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:74:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:78:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:82:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:84:0x00da  */
    /* JADX WARN: Code duplicated, block: B:86:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:87:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:89:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:92:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:97:0x010f  */
    /* JADX WARN: Code duplicated, block: B:99:0x011c  */
    /* JADX INFO: renamed from: DismissibleDrawerSheet-Snr_uVM, reason: not valid java name */
    public static final void m1819x3a7803c9(h01 h01Var, c cVar, rg3 rg3Var, long j, long j2, float f, e eVar, oe1 oe1Var, ck0 ck0Var, int i, int i2) {
        int i3;
        int i4;
        rg3 rg3Var2;
        int i5;
        long j3;
        long j4;
        int i6;
        float f2;
        int i7;
        e windowInsets;
        int i8;
        int i9;
        int i10;
        c cVar2;
        rg3 rg3Var3;
        int i11;
        c01 c01Var;
        c cVar3;
        long standardContainerColor;
        long jM2x310ea166;
        float f3;
        rg3 rg3Var4;
        long j5;
        long j6;
        float f4;
        c cVar4;
        rg3 rg3Var5;
        long j7;
        long j8;
        float f5;
        e eVar2;
        w33 w33VarV;
        int i12;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(1473549901);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (kk0Var.h(h01Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i13 = i2 & 2;
        if (i13 == 0) {
            if ((i & 48) == 0) {
                i3 |= kk0Var.h(cVar) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    rg3Var2 = rg3Var;
                    if (kk0Var.h(rg3Var2)) {
                        i5 = FontInfo.NUMBER_OF_CHAR_CODES;
                    } else {
                        i5 = Uuid.SIZE_BITS;
                    }
                    i3 |= i5;
                }
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        j3 = j;
                        int i14 = kk0Var.g(j3) ? 2048 : 1024;
                        i3 |= i14;
                    } else {
                        j3 = j;
                    }
                    i3 |= i14;
                } else {
                    j3 = j;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        j4 = j2;
                        if (kk0Var.g(j4)) {
                            i12 = 16384;
                        }
                        i3 |= i12;
                    } else {
                        j4 = j2;
                    }
                    i12 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                    i3 |= i12;
                } else {
                    j4 = j2;
                }
                i6 = i2 & 32;
                if (i6 != 0) {
                    if ((196608 & i) == 0) {
                        f2 = f;
                        if (kk0Var.e(f2)) {
                            i7 = 131072;
                        } else {
                            i7 = 65536;
                        }
                        i3 |= i7;
                    }
                    if ((1572864 & i) == 0) {
                        if ((i2 & 64) == 0) {
                            windowInsets = eVar;
                            int i15 = kk0Var.h(windowInsets) ? 1048576 : 524288;
                            i3 |= i15;
                        } else {
                            windowInsets = eVar;
                        }
                        i3 |= i15;
                    } else {
                        windowInsets = eVar;
                    }
                    i8 = i3;
                    if ((i2 & Uuid.SIZE_BITS) != 0) {
                        i9 = i8 | 12582912;
                    } else if ((i & 12582912) == 0) {
                        if (kk0Var.j(oe1Var)) {
                            i10 = 8388608;
                        } else {
                            i10 = 4194304;
                        }
                        i9 = i8 | i10;
                    } else {
                        i9 = i8;
                    }
                    if ((i9 & 4793491) == 4793490 || !kk0Var.F()) {
                        kk0Var.X();
                        if ((i & 1) != 0 || kk0Var.D()) {
                            if (i13 != 0) {
                                cVar2 = c.i;
                            } else {
                                cVar2 = cVar;
                            }
                            if (i4 != 0) {
                                rg3Var3 = k43.a;
                            } else {
                                rg3Var3 = rg3Var2;
                            }
                            i11 = i2 & 8;
                            c01Var = c01.a;
                            cVar3 = cVar2;
                            if (i11 != 0) {
                                standardContainerColor = c01Var.getStandardContainerColor(kk0Var, 6);
                                i9 &= -7169;
                            } else {
                                standardContainerColor = j3;
                            }
                            if ((i2 & 16) != 0) {
                                jM2x310ea166 = af0.m2x310ea166(standardContainerColor, kk0Var, (i9 >> 9) & 14);
                                i9 &= -57345;
                            } else {
                                jM2x310ea166 = j4;
                            }
                            if (i6 != 0) {
                                f3 = 0.0f;
                            } else {
                                f3 = f2;
                            }
                            if ((i2 & 64) != 0) {
                                i9 &= -3670017;
                                windowInsets = c01Var.getWindowInsets(kk0Var, 6);
                            }
                            rg3Var4 = rg3Var3;
                            j5 = standardContainerColor;
                            j6 = jM2x310ea166;
                            f4 = f3;
                        } else {
                            kk0Var.V();
                            if ((i2 & 8) != 0) {
                                i9 &= -7169;
                            }
                            if ((i2 & 16) != 0) {
                                i9 &= -57345;
                            }
                            if ((i2 & 64) != 0) {
                                i9 &= -3670017;
                            }
                            cVar3 = cVar;
                            rg3Var4 = rg3Var2;
                            j5 = j3;
                            j6 = j4;
                            f4 = f2;
                        }
                        kk0Var.s();
                        xj2.DrawerPredictiveBackHandler(h01Var, zg0.rememberComposableLambda(-807955710, true, new fj2(windowInsets, cVar3, rg3Var4, j5, j6, f4, oe1Var), kk0Var, 54), kk0Var, (i9 & 14) | 48);
                        cVar4 = cVar3;
                        rg3Var5 = rg3Var4;
                        j7 = j5;
                        j8 = j6;
                        f5 = f4;
                    } else {
                        kk0Var.V();
                        cVar4 = cVar;
                        rg3Var5 = rg3Var2;
                        j7 = j3;
                        j8 = j4;
                        f5 = f2;
                    }
                    eVar2 = windowInsets;
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new gj2(h01Var, cVar4, rg3Var5, j7, j8, f5, eVar2, oe1Var, i, i2, 0));
                    }
                }
                i3 |= 196608;
                f2 = f;
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        windowInsets = eVar;
                        if (kk0Var.h(windowInsets)) {
                        }
                        i3 |= i15;
                    } else {
                        windowInsets = eVar;
                    }
                    i3 |= i15;
                } else {
                    windowInsets = eVar;
                }
                i8 = i3;
                if ((i2 & Uuid.SIZE_BITS) != 0) {
                    i9 = i8 | 12582912;
                } else if ((i & 12582912) == 0) {
                    if (kk0Var.j(oe1Var)) {
                        i10 = 8388608;
                    } else {
                        i10 = 4194304;
                    }
                    i9 = i8 | i10;
                } else {
                    i9 = i8;
                }
                if ((i9 & 4793491) == 4793490) {
                    kk0Var.X();
                    if ((i & 1) != 0) {
                        if (i13 != 0) {
                            cVar2 = c.i;
                        } else {
                            cVar2 = cVar;
                        }
                        if (i4 != 0) {
                            rg3Var3 = k43.a;
                        } else {
                            rg3Var3 = rg3Var2;
                        }
                        i11 = i2 & 8;
                        c01Var = c01.a;
                        cVar3 = cVar2;
                        if (i11 != 0) {
                            standardContainerColor = c01Var.getStandardContainerColor(kk0Var, 6);
                            i9 &= -7169;
                        } else {
                            standardContainerColor = j3;
                        }
                        if ((i2 & 16) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(standardContainerColor, kk0Var, (i9 >> 9) & 14);
                            i9 &= -57345;
                        } else {
                            jM2x310ea166 = j4;
                        }
                        if (i6 != 0) {
                            f3 = 0.0f;
                        } else {
                            f3 = f2;
                        }
                        if ((i2 & 64) != 0) {
                            i9 &= -3670017;
                            windowInsets = c01Var.getWindowInsets(kk0Var, 6);
                        }
                        rg3Var4 = rg3Var3;
                        j5 = standardContainerColor;
                        j6 = jM2x310ea166;
                        f4 = f3;
                    } else {
                        if (i13 != 0) {
                            cVar2 = c.i;
                        } else {
                            cVar2 = cVar;
                        }
                        if (i4 != 0) {
                            rg3Var3 = k43.a;
                        } else {
                            rg3Var3 = rg3Var2;
                        }
                        i11 = i2 & 8;
                        c01Var = c01.a;
                        cVar3 = cVar2;
                        if (i11 != 0) {
                            standardContainerColor = c01Var.getStandardContainerColor(kk0Var, 6);
                            i9 &= -7169;
                        } else {
                            standardContainerColor = j3;
                        }
                        if ((i2 & 16) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(standardContainerColor, kk0Var, (i9 >> 9) & 14);
                            i9 &= -57345;
                        } else {
                            jM2x310ea166 = j4;
                        }
                        if (i6 != 0) {
                            f3 = 0.0f;
                        } else {
                            f3 = f2;
                        }
                        if ((i2 & 64) != 0) {
                            i9 &= -3670017;
                            windowInsets = c01Var.getWindowInsets(kk0Var, 6);
                        }
                        rg3Var4 = rg3Var3;
                        j5 = standardContainerColor;
                        j6 = jM2x310ea166;
                        f4 = f3;
                    }
                    kk0Var.s();
                    xj2.DrawerPredictiveBackHandler(h01Var, zg0.rememberComposableLambda(-807955710, true, new fj2(windowInsets, cVar3, rg3Var4, j5, j6, f4, oe1Var), kk0Var, 54), kk0Var, (i9 & 14) | 48);
                    cVar4 = cVar3;
                    rg3Var5 = rg3Var4;
                    j7 = j5;
                    j8 = j6;
                    f5 = f4;
                } else {
                    kk0Var.X();
                    if ((i & 1) != 0) {
                        if (i13 != 0) {
                            cVar2 = c.i;
                        } else {
                            cVar2 = cVar;
                        }
                        if (i4 != 0) {
                            rg3Var3 = k43.a;
                        } else {
                            rg3Var3 = rg3Var2;
                        }
                        i11 = i2 & 8;
                        c01Var = c01.a;
                        cVar3 = cVar2;
                        if (i11 != 0) {
                            standardContainerColor = c01Var.getStandardContainerColor(kk0Var, 6);
                            i9 &= -7169;
                        } else {
                            standardContainerColor = j3;
                        }
                        if ((i2 & 16) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(standardContainerColor, kk0Var, (i9 >> 9) & 14);
                            i9 &= -57345;
                        } else {
                            jM2x310ea166 = j4;
                        }
                        if (i6 != 0) {
                            f3 = 0.0f;
                        } else {
                            f3 = f2;
                        }
                        if ((i2 & 64) != 0) {
                            i9 &= -3670017;
                            windowInsets = c01Var.getWindowInsets(kk0Var, 6);
                        }
                        rg3Var4 = rg3Var3;
                        j5 = standardContainerColor;
                        j6 = jM2x310ea166;
                        f4 = f3;
                    } else {
                        if (i13 != 0) {
                            cVar2 = c.i;
                        } else {
                            cVar2 = cVar;
                        }
                        if (i4 != 0) {
                            rg3Var3 = k43.a;
                        } else {
                            rg3Var3 = rg3Var2;
                        }
                        i11 = i2 & 8;
                        c01Var = c01.a;
                        cVar3 = cVar2;
                        if (i11 != 0) {
                            standardContainerColor = c01Var.getStandardContainerColor(kk0Var, 6);
                            i9 &= -7169;
                        } else {
                            standardContainerColor = j3;
                        }
                        if ((i2 & 16) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(standardContainerColor, kk0Var, (i9 >> 9) & 14);
                            i9 &= -57345;
                        } else {
                            jM2x310ea166 = j4;
                        }
                        if (i6 != 0) {
                            f3 = 0.0f;
                        } else {
                            f3 = f2;
                        }
                        if ((i2 & 64) != 0) {
                            i9 &= -3670017;
                            windowInsets = c01Var.getWindowInsets(kk0Var, 6);
                        }
                        rg3Var4 = rg3Var3;
                        j5 = standardContainerColor;
                        j6 = jM2x310ea166;
                        f4 = f3;
                    }
                    kk0Var.s();
                    xj2.DrawerPredictiveBackHandler(h01Var, zg0.rememberComposableLambda(-807955710, true, new fj2(windowInsets, cVar3, rg3Var4, j5, j6, f4, oe1Var), kk0Var, 54), kk0Var, (i9 & 14) | 48);
                    cVar4 = cVar3;
                    rg3Var5 = rg3Var4;
                    j7 = j5;
                    j8 = j6;
                    f5 = f4;
                }
                eVar2 = windowInsets;
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new gj2(h01Var, cVar4, rg3Var5, j7, j8, f5, eVar2, oe1Var, i, i2, 0));
                }
            }
            i3 |= 384;
            rg3Var2 = rg3Var;
            if ((i & 3072) == 0) {
                if ((i2 & 8) == 0) {
                    j3 = j;
                    if (kk0Var.g(j3)) {
                    }
                    i3 |= i14;
                } else {
                    j3 = j;
                }
                i3 |= i14;
            } else {
                j3 = j;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    j4 = j2;
                    if (kk0Var.g(j4)) {
                        i12 = 16384;
                    }
                    i3 |= i12;
                } else {
                    j4 = j2;
                }
                i12 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                i3 |= i12;
            } else {
                j4 = j2;
            }
            i6 = i2 & 32;
            if (i6 != 0) {
                if ((196608 & i) == 0) {
                    f2 = f;
                    if (kk0Var.e(f2)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        windowInsets = eVar;
                        if (kk0Var.h(windowInsets)) {
                        }
                        i3 |= i15;
                    } else {
                        windowInsets = eVar;
                    }
                    i3 |= i15;
                } else {
                    windowInsets = eVar;
                }
                i8 = i3;
                if ((i2 & Uuid.SIZE_BITS) != 0) {
                    i9 = i8 | 12582912;
                } else if ((i & 12582912) == 0) {
                    if (kk0Var.j(oe1Var)) {
                        i10 = 8388608;
                    } else {
                        i10 = 4194304;
                    }
                    i9 = i8 | i10;
                } else {
                    i9 = i8;
                }
                if ((i9 & 4793491) == 4793490) {
                    kk0Var.X();
                    if ((i & 1) != 0) {
                        if (i13 != 0) {
                            cVar2 = c.i;
                        } else {
                            cVar2 = cVar;
                        }
                        if (i4 != 0) {
                            rg3Var3 = k43.a;
                        } else {
                            rg3Var3 = rg3Var2;
                        }
                        i11 = i2 & 8;
                        c01Var = c01.a;
                        cVar3 = cVar2;
                        if (i11 != 0) {
                            standardContainerColor = c01Var.getStandardContainerColor(kk0Var, 6);
                            i9 &= -7169;
                        } else {
                            standardContainerColor = j3;
                        }
                        if ((i2 & 16) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(standardContainerColor, kk0Var, (i9 >> 9) & 14);
                            i9 &= -57345;
                        } else {
                            jM2x310ea166 = j4;
                        }
                        if (i6 != 0) {
                            f3 = 0.0f;
                        } else {
                            f3 = f2;
                        }
                        if ((i2 & 64) != 0) {
                            i9 &= -3670017;
                            windowInsets = c01Var.getWindowInsets(kk0Var, 6);
                        }
                        rg3Var4 = rg3Var3;
                        j5 = standardContainerColor;
                        j6 = jM2x310ea166;
                        f4 = f3;
                    } else {
                        if (i13 != 0) {
                            cVar2 = c.i;
                        } else {
                            cVar2 = cVar;
                        }
                        if (i4 != 0) {
                            rg3Var3 = k43.a;
                        } else {
                            rg3Var3 = rg3Var2;
                        }
                        i11 = i2 & 8;
                        c01Var = c01.a;
                        cVar3 = cVar2;
                        if (i11 != 0) {
                            standardContainerColor = c01Var.getStandardContainerColor(kk0Var, 6);
                            i9 &= -7169;
                        } else {
                            standardContainerColor = j3;
                        }
                        if ((i2 & 16) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(standardContainerColor, kk0Var, (i9 >> 9) & 14);
                            i9 &= -57345;
                        } else {
                            jM2x310ea166 = j4;
                        }
                        if (i6 != 0) {
                            f3 = 0.0f;
                        } else {
                            f3 = f2;
                        }
                        if ((i2 & 64) != 0) {
                            i9 &= -3670017;
                            windowInsets = c01Var.getWindowInsets(kk0Var, 6);
                        }
                        rg3Var4 = rg3Var3;
                        j5 = standardContainerColor;
                        j6 = jM2x310ea166;
                        f4 = f3;
                    }
                    kk0Var.s();
                    xj2.DrawerPredictiveBackHandler(h01Var, zg0.rememberComposableLambda(-807955710, true, new fj2(windowInsets, cVar3, rg3Var4, j5, j6, f4, oe1Var), kk0Var, 54), kk0Var, (i9 & 14) | 48);
                    cVar4 = cVar3;
                    rg3Var5 = rg3Var4;
                    j7 = j5;
                    j8 = j6;
                    f5 = f4;
                } else {
                    kk0Var.X();
                    if ((i & 1) != 0) {
                        if (i13 != 0) {
                            cVar2 = c.i;
                        } else {
                            cVar2 = cVar;
                        }
                        if (i4 != 0) {
                            rg3Var3 = k43.a;
                        } else {
                            rg3Var3 = rg3Var2;
                        }
                        i11 = i2 & 8;
                        c01Var = c01.a;
                        cVar3 = cVar2;
                        if (i11 != 0) {
                            standardContainerColor = c01Var.getStandardContainerColor(kk0Var, 6);
                            i9 &= -7169;
                        } else {
                            standardContainerColor = j3;
                        }
                        if ((i2 & 16) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(standardContainerColor, kk0Var, (i9 >> 9) & 14);
                            i9 &= -57345;
                        } else {
                            jM2x310ea166 = j4;
                        }
                        if (i6 != 0) {
                            f3 = 0.0f;
                        } else {
                            f3 = f2;
                        }
                        if ((i2 & 64) != 0) {
                            i9 &= -3670017;
                            windowInsets = c01Var.getWindowInsets(kk0Var, 6);
                        }
                        rg3Var4 = rg3Var3;
                        j5 = standardContainerColor;
                        j6 = jM2x310ea166;
                        f4 = f3;
                    } else {
                        if (i13 != 0) {
                            cVar2 = c.i;
                        } else {
                            cVar2 = cVar;
                        }
                        if (i4 != 0) {
                            rg3Var3 = k43.a;
                        } else {
                            rg3Var3 = rg3Var2;
                        }
                        i11 = i2 & 8;
                        c01Var = c01.a;
                        cVar3 = cVar2;
                        if (i11 != 0) {
                            standardContainerColor = c01Var.getStandardContainerColor(kk0Var, 6);
                            i9 &= -7169;
                        } else {
                            standardContainerColor = j3;
                        }
                        if ((i2 & 16) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(standardContainerColor, kk0Var, (i9 >> 9) & 14);
                            i9 &= -57345;
                        } else {
                            jM2x310ea166 = j4;
                        }
                        if (i6 != 0) {
                            f3 = 0.0f;
                        } else {
                            f3 = f2;
                        }
                        if ((i2 & 64) != 0) {
                            i9 &= -3670017;
                            windowInsets = c01Var.getWindowInsets(kk0Var, 6);
                        }
                        rg3Var4 = rg3Var3;
                        j5 = standardContainerColor;
                        j6 = jM2x310ea166;
                        f4 = f3;
                    }
                    kk0Var.s();
                    xj2.DrawerPredictiveBackHandler(h01Var, zg0.rememberComposableLambda(-807955710, true, new fj2(windowInsets, cVar3, rg3Var4, j5, j6, f4, oe1Var), kk0Var, 54), kk0Var, (i9 & 14) | 48);
                    cVar4 = cVar3;
                    rg3Var5 = rg3Var4;
                    j7 = j5;
                    j8 = j6;
                    f5 = f4;
                }
                eVar2 = windowInsets;
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new gj2(h01Var, cVar4, rg3Var5, j7, j8, f5, eVar2, oe1Var, i, i2, 0));
                }
            }
            i3 |= 196608;
            f2 = f;
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    windowInsets = eVar;
                    if (kk0Var.h(windowInsets)) {
                    }
                    i3 |= i15;
                } else {
                    windowInsets = eVar;
                }
                i3 |= i15;
            } else {
                windowInsets = eVar;
            }
            i8 = i3;
            if ((i2 & Uuid.SIZE_BITS) != 0) {
                i9 = i8 | 12582912;
            } else if ((i & 12582912) == 0) {
                if (kk0Var.j(oe1Var)) {
                    i10 = 8388608;
                } else {
                    i10 = 4194304;
                }
                i9 = i8 | i10;
            } else {
                i9 = i8;
            }
            if ((i9 & 4793491) == 4793490) {
                kk0Var.X();
                if ((i & 1) != 0) {
                    if (i13 != 0) {
                        cVar2 = c.i;
                    } else {
                        cVar2 = cVar;
                    }
                    if (i4 != 0) {
                        rg3Var3 = k43.a;
                    } else {
                        rg3Var3 = rg3Var2;
                    }
                    i11 = i2 & 8;
                    c01Var = c01.a;
                    cVar3 = cVar2;
                    if (i11 != 0) {
                        standardContainerColor = c01Var.getStandardContainerColor(kk0Var, 6);
                        i9 &= -7169;
                    } else {
                        standardContainerColor = j3;
                    }
                    if ((i2 & 16) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(standardContainerColor, kk0Var, (i9 >> 9) & 14);
                        i9 &= -57345;
                    } else {
                        jM2x310ea166 = j4;
                    }
                    if (i6 != 0) {
                        f3 = 0.0f;
                    } else {
                        f3 = f2;
                    }
                    if ((i2 & 64) != 0) {
                        i9 &= -3670017;
                        windowInsets = c01Var.getWindowInsets(kk0Var, 6);
                    }
                    rg3Var4 = rg3Var3;
                    j5 = standardContainerColor;
                    j6 = jM2x310ea166;
                    f4 = f3;
                } else {
                    if (i13 != 0) {
                        cVar2 = c.i;
                    } else {
                        cVar2 = cVar;
                    }
                    if (i4 != 0) {
                        rg3Var3 = k43.a;
                    } else {
                        rg3Var3 = rg3Var2;
                    }
                    i11 = i2 & 8;
                    c01Var = c01.a;
                    cVar3 = cVar2;
                    if (i11 != 0) {
                        standardContainerColor = c01Var.getStandardContainerColor(kk0Var, 6);
                        i9 &= -7169;
                    } else {
                        standardContainerColor = j3;
                    }
                    if ((i2 & 16) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(standardContainerColor, kk0Var, (i9 >> 9) & 14);
                        i9 &= -57345;
                    } else {
                        jM2x310ea166 = j4;
                    }
                    if (i6 != 0) {
                        f3 = 0.0f;
                    } else {
                        f3 = f2;
                    }
                    if ((i2 & 64) != 0) {
                        i9 &= -3670017;
                        windowInsets = c01Var.getWindowInsets(kk0Var, 6);
                    }
                    rg3Var4 = rg3Var3;
                    j5 = standardContainerColor;
                    j6 = jM2x310ea166;
                    f4 = f3;
                }
                kk0Var.s();
                xj2.DrawerPredictiveBackHandler(h01Var, zg0.rememberComposableLambda(-807955710, true, new fj2(windowInsets, cVar3, rg3Var4, j5, j6, f4, oe1Var), kk0Var, 54), kk0Var, (i9 & 14) | 48);
                cVar4 = cVar3;
                rg3Var5 = rg3Var4;
                j7 = j5;
                j8 = j6;
                f5 = f4;
            } else {
                kk0Var.X();
                if ((i & 1) != 0) {
                    if (i13 != 0) {
                        cVar2 = c.i;
                    } else {
                        cVar2 = cVar;
                    }
                    if (i4 != 0) {
                        rg3Var3 = k43.a;
                    } else {
                        rg3Var3 = rg3Var2;
                    }
                    i11 = i2 & 8;
                    c01Var = c01.a;
                    cVar3 = cVar2;
                    if (i11 != 0) {
                        standardContainerColor = c01Var.getStandardContainerColor(kk0Var, 6);
                        i9 &= -7169;
                    } else {
                        standardContainerColor = j3;
                    }
                    if ((i2 & 16) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(standardContainerColor, kk0Var, (i9 >> 9) & 14);
                        i9 &= -57345;
                    } else {
                        jM2x310ea166 = j4;
                    }
                    if (i6 != 0) {
                        f3 = 0.0f;
                    } else {
                        f3 = f2;
                    }
                    if ((i2 & 64) != 0) {
                        i9 &= -3670017;
                        windowInsets = c01Var.getWindowInsets(kk0Var, 6);
                    }
                    rg3Var4 = rg3Var3;
                    j5 = standardContainerColor;
                    j6 = jM2x310ea166;
                    f4 = f3;
                } else {
                    if (i13 != 0) {
                        cVar2 = c.i;
                    } else {
                        cVar2 = cVar;
                    }
                    if (i4 != 0) {
                        rg3Var3 = k43.a;
                    } else {
                        rg3Var3 = rg3Var2;
                    }
                    i11 = i2 & 8;
                    c01Var = c01.a;
                    cVar3 = cVar2;
                    if (i11 != 0) {
                        standardContainerColor = c01Var.getStandardContainerColor(kk0Var, 6);
                        i9 &= -7169;
                    } else {
                        standardContainerColor = j3;
                    }
                    if ((i2 & 16) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(standardContainerColor, kk0Var, (i9 >> 9) & 14);
                        i9 &= -57345;
                    } else {
                        jM2x310ea166 = j4;
                    }
                    if (i6 != 0) {
                        f3 = 0.0f;
                    } else {
                        f3 = f2;
                    }
                    if ((i2 & 64) != 0) {
                        i9 &= -3670017;
                        windowInsets = c01Var.getWindowInsets(kk0Var, 6);
                    }
                    rg3Var4 = rg3Var3;
                    j5 = standardContainerColor;
                    j6 = jM2x310ea166;
                    f4 = f3;
                }
                kk0Var.s();
                xj2.DrawerPredictiveBackHandler(h01Var, zg0.rememberComposableLambda(-807955710, true, new fj2(windowInsets, cVar3, rg3Var4, j5, j6, f4, oe1Var), kk0Var, 54), kk0Var, (i9 & 14) | 48);
                cVar4 = cVar3;
                rg3Var5 = rg3Var4;
                j7 = j5;
                j8 = j6;
                f5 = f4;
            }
            eVar2 = windowInsets;
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new gj2(h01Var, cVar4, rg3Var5, j7, j8, f5, eVar2, oe1Var, i, i2, 0));
            }
        }
        i3 |= 48;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                rg3Var2 = rg3Var;
                if (kk0Var.h(rg3Var2)) {
                    i5 = FontInfo.NUMBER_OF_CHAR_CODES;
                } else {
                    i5 = Uuid.SIZE_BITS;
                }
                i3 |= i5;
            }
            if ((i & 3072) == 0) {
                if ((i2 & 8) == 0) {
                    j3 = j;
                    if (kk0Var.g(j3)) {
                    }
                    i3 |= i14;
                } else {
                    j3 = j;
                }
                i3 |= i14;
            } else {
                j3 = j;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    j4 = j2;
                    if (kk0Var.g(j4)) {
                        i12 = 16384;
                    }
                    i3 |= i12;
                } else {
                    j4 = j2;
                }
                i12 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                i3 |= i12;
            } else {
                j4 = j2;
            }
            i6 = i2 & 32;
            if (i6 != 0) {
                if ((196608 & i) == 0) {
                    f2 = f;
                    if (kk0Var.e(f2)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        windowInsets = eVar;
                        if (kk0Var.h(windowInsets)) {
                        }
                        i3 |= i15;
                    } else {
                        windowInsets = eVar;
                    }
                    i3 |= i15;
                } else {
                    windowInsets = eVar;
                }
                i8 = i3;
                if ((i2 & Uuid.SIZE_BITS) != 0) {
                    i9 = i8 | 12582912;
                } else if ((i & 12582912) == 0) {
                    if (kk0Var.j(oe1Var)) {
                        i10 = 8388608;
                    } else {
                        i10 = 4194304;
                    }
                    i9 = i8 | i10;
                } else {
                    i9 = i8;
                }
                if ((i9 & 4793491) == 4793490) {
                    kk0Var.X();
                    if ((i & 1) != 0) {
                        if (i13 != 0) {
                            cVar2 = c.i;
                        } else {
                            cVar2 = cVar;
                        }
                        if (i4 != 0) {
                            rg3Var3 = k43.a;
                        } else {
                            rg3Var3 = rg3Var2;
                        }
                        i11 = i2 & 8;
                        c01Var = c01.a;
                        cVar3 = cVar2;
                        if (i11 != 0) {
                            standardContainerColor = c01Var.getStandardContainerColor(kk0Var, 6);
                            i9 &= -7169;
                        } else {
                            standardContainerColor = j3;
                        }
                        if ((i2 & 16) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(standardContainerColor, kk0Var, (i9 >> 9) & 14);
                            i9 &= -57345;
                        } else {
                            jM2x310ea166 = j4;
                        }
                        if (i6 != 0) {
                            f3 = 0.0f;
                        } else {
                            f3 = f2;
                        }
                        if ((i2 & 64) != 0) {
                            i9 &= -3670017;
                            windowInsets = c01Var.getWindowInsets(kk0Var, 6);
                        }
                        rg3Var4 = rg3Var3;
                        j5 = standardContainerColor;
                        j6 = jM2x310ea166;
                        f4 = f3;
                    } else {
                        if (i13 != 0) {
                            cVar2 = c.i;
                        } else {
                            cVar2 = cVar;
                        }
                        if (i4 != 0) {
                            rg3Var3 = k43.a;
                        } else {
                            rg3Var3 = rg3Var2;
                        }
                        i11 = i2 & 8;
                        c01Var = c01.a;
                        cVar3 = cVar2;
                        if (i11 != 0) {
                            standardContainerColor = c01Var.getStandardContainerColor(kk0Var, 6);
                            i9 &= -7169;
                        } else {
                            standardContainerColor = j3;
                        }
                        if ((i2 & 16) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(standardContainerColor, kk0Var, (i9 >> 9) & 14);
                            i9 &= -57345;
                        } else {
                            jM2x310ea166 = j4;
                        }
                        if (i6 != 0) {
                            f3 = 0.0f;
                        } else {
                            f3 = f2;
                        }
                        if ((i2 & 64) != 0) {
                            i9 &= -3670017;
                            windowInsets = c01Var.getWindowInsets(kk0Var, 6);
                        }
                        rg3Var4 = rg3Var3;
                        j5 = standardContainerColor;
                        j6 = jM2x310ea166;
                        f4 = f3;
                    }
                    kk0Var.s();
                    xj2.DrawerPredictiveBackHandler(h01Var, zg0.rememberComposableLambda(-807955710, true, new fj2(windowInsets, cVar3, rg3Var4, j5, j6, f4, oe1Var), kk0Var, 54), kk0Var, (i9 & 14) | 48);
                    cVar4 = cVar3;
                    rg3Var5 = rg3Var4;
                    j7 = j5;
                    j8 = j6;
                    f5 = f4;
                } else {
                    kk0Var.X();
                    if ((i & 1) != 0) {
                        if (i13 != 0) {
                            cVar2 = c.i;
                        } else {
                            cVar2 = cVar;
                        }
                        if (i4 != 0) {
                            rg3Var3 = k43.a;
                        } else {
                            rg3Var3 = rg3Var2;
                        }
                        i11 = i2 & 8;
                        c01Var = c01.a;
                        cVar3 = cVar2;
                        if (i11 != 0) {
                            standardContainerColor = c01Var.getStandardContainerColor(kk0Var, 6);
                            i9 &= -7169;
                        } else {
                            standardContainerColor = j3;
                        }
                        if ((i2 & 16) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(standardContainerColor, kk0Var, (i9 >> 9) & 14);
                            i9 &= -57345;
                        } else {
                            jM2x310ea166 = j4;
                        }
                        if (i6 != 0) {
                            f3 = 0.0f;
                        } else {
                            f3 = f2;
                        }
                        if ((i2 & 64) != 0) {
                            i9 &= -3670017;
                            windowInsets = c01Var.getWindowInsets(kk0Var, 6);
                        }
                        rg3Var4 = rg3Var3;
                        j5 = standardContainerColor;
                        j6 = jM2x310ea166;
                        f4 = f3;
                    } else {
                        if (i13 != 0) {
                            cVar2 = c.i;
                        } else {
                            cVar2 = cVar;
                        }
                        if (i4 != 0) {
                            rg3Var3 = k43.a;
                        } else {
                            rg3Var3 = rg3Var2;
                        }
                        i11 = i2 & 8;
                        c01Var = c01.a;
                        cVar3 = cVar2;
                        if (i11 != 0) {
                            standardContainerColor = c01Var.getStandardContainerColor(kk0Var, 6);
                            i9 &= -7169;
                        } else {
                            standardContainerColor = j3;
                        }
                        if ((i2 & 16) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(standardContainerColor, kk0Var, (i9 >> 9) & 14);
                            i9 &= -57345;
                        } else {
                            jM2x310ea166 = j4;
                        }
                        if (i6 != 0) {
                            f3 = 0.0f;
                        } else {
                            f3 = f2;
                        }
                        if ((i2 & 64) != 0) {
                            i9 &= -3670017;
                            windowInsets = c01Var.getWindowInsets(kk0Var, 6);
                        }
                        rg3Var4 = rg3Var3;
                        j5 = standardContainerColor;
                        j6 = jM2x310ea166;
                        f4 = f3;
                    }
                    kk0Var.s();
                    xj2.DrawerPredictiveBackHandler(h01Var, zg0.rememberComposableLambda(-807955710, true, new fj2(windowInsets, cVar3, rg3Var4, j5, j6, f4, oe1Var), kk0Var, 54), kk0Var, (i9 & 14) | 48);
                    cVar4 = cVar3;
                    rg3Var5 = rg3Var4;
                    j7 = j5;
                    j8 = j6;
                    f5 = f4;
                }
                eVar2 = windowInsets;
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new gj2(h01Var, cVar4, rg3Var5, j7, j8, f5, eVar2, oe1Var, i, i2, 0));
                }
            }
            i3 |= 196608;
            f2 = f;
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    windowInsets = eVar;
                    if (kk0Var.h(windowInsets)) {
                    }
                    i3 |= i15;
                } else {
                    windowInsets = eVar;
                }
                i3 |= i15;
            } else {
                windowInsets = eVar;
            }
            i8 = i3;
            if ((i2 & Uuid.SIZE_BITS) != 0) {
                i9 = i8 | 12582912;
            } else if ((i & 12582912) == 0) {
                if (kk0Var.j(oe1Var)) {
                    i10 = 8388608;
                } else {
                    i10 = 4194304;
                }
                i9 = i8 | i10;
            } else {
                i9 = i8;
            }
            if ((i9 & 4793491) == 4793490) {
                kk0Var.X();
                if ((i & 1) != 0) {
                    if (i13 != 0) {
                        cVar2 = c.i;
                    } else {
                        cVar2 = cVar;
                    }
                    if (i4 != 0) {
                        rg3Var3 = k43.a;
                    } else {
                        rg3Var3 = rg3Var2;
                    }
                    i11 = i2 & 8;
                    c01Var = c01.a;
                    cVar3 = cVar2;
                    if (i11 != 0) {
                        standardContainerColor = c01Var.getStandardContainerColor(kk0Var, 6);
                        i9 &= -7169;
                    } else {
                        standardContainerColor = j3;
                    }
                    if ((i2 & 16) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(standardContainerColor, kk0Var, (i9 >> 9) & 14);
                        i9 &= -57345;
                    } else {
                        jM2x310ea166 = j4;
                    }
                    if (i6 != 0) {
                        f3 = 0.0f;
                    } else {
                        f3 = f2;
                    }
                    if ((i2 & 64) != 0) {
                        i9 &= -3670017;
                        windowInsets = c01Var.getWindowInsets(kk0Var, 6);
                    }
                    rg3Var4 = rg3Var3;
                    j5 = standardContainerColor;
                    j6 = jM2x310ea166;
                    f4 = f3;
                } else {
                    if (i13 != 0) {
                        cVar2 = c.i;
                    } else {
                        cVar2 = cVar;
                    }
                    if (i4 != 0) {
                        rg3Var3 = k43.a;
                    } else {
                        rg3Var3 = rg3Var2;
                    }
                    i11 = i2 & 8;
                    c01Var = c01.a;
                    cVar3 = cVar2;
                    if (i11 != 0) {
                        standardContainerColor = c01Var.getStandardContainerColor(kk0Var, 6);
                        i9 &= -7169;
                    } else {
                        standardContainerColor = j3;
                    }
                    if ((i2 & 16) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(standardContainerColor, kk0Var, (i9 >> 9) & 14);
                        i9 &= -57345;
                    } else {
                        jM2x310ea166 = j4;
                    }
                    if (i6 != 0) {
                        f3 = 0.0f;
                    } else {
                        f3 = f2;
                    }
                    if ((i2 & 64) != 0) {
                        i9 &= -3670017;
                        windowInsets = c01Var.getWindowInsets(kk0Var, 6);
                    }
                    rg3Var4 = rg3Var3;
                    j5 = standardContainerColor;
                    j6 = jM2x310ea166;
                    f4 = f3;
                }
                kk0Var.s();
                xj2.DrawerPredictiveBackHandler(h01Var, zg0.rememberComposableLambda(-807955710, true, new fj2(windowInsets, cVar3, rg3Var4, j5, j6, f4, oe1Var), kk0Var, 54), kk0Var, (i9 & 14) | 48);
                cVar4 = cVar3;
                rg3Var5 = rg3Var4;
                j7 = j5;
                j8 = j6;
                f5 = f4;
            } else {
                kk0Var.X();
                if ((i & 1) != 0) {
                    if (i13 != 0) {
                        cVar2 = c.i;
                    } else {
                        cVar2 = cVar;
                    }
                    if (i4 != 0) {
                        rg3Var3 = k43.a;
                    } else {
                        rg3Var3 = rg3Var2;
                    }
                    i11 = i2 & 8;
                    c01Var = c01.a;
                    cVar3 = cVar2;
                    if (i11 != 0) {
                        standardContainerColor = c01Var.getStandardContainerColor(kk0Var, 6);
                        i9 &= -7169;
                    } else {
                        standardContainerColor = j3;
                    }
                    if ((i2 & 16) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(standardContainerColor, kk0Var, (i9 >> 9) & 14);
                        i9 &= -57345;
                    } else {
                        jM2x310ea166 = j4;
                    }
                    if (i6 != 0) {
                        f3 = 0.0f;
                    } else {
                        f3 = f2;
                    }
                    if ((i2 & 64) != 0) {
                        i9 &= -3670017;
                        windowInsets = c01Var.getWindowInsets(kk0Var, 6);
                    }
                    rg3Var4 = rg3Var3;
                    j5 = standardContainerColor;
                    j6 = jM2x310ea166;
                    f4 = f3;
                } else {
                    if (i13 != 0) {
                        cVar2 = c.i;
                    } else {
                        cVar2 = cVar;
                    }
                    if (i4 != 0) {
                        rg3Var3 = k43.a;
                    } else {
                        rg3Var3 = rg3Var2;
                    }
                    i11 = i2 & 8;
                    c01Var = c01.a;
                    cVar3 = cVar2;
                    if (i11 != 0) {
                        standardContainerColor = c01Var.getStandardContainerColor(kk0Var, 6);
                        i9 &= -7169;
                    } else {
                        standardContainerColor = j3;
                    }
                    if ((i2 & 16) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(standardContainerColor, kk0Var, (i9 >> 9) & 14);
                        i9 &= -57345;
                    } else {
                        jM2x310ea166 = j4;
                    }
                    if (i6 != 0) {
                        f3 = 0.0f;
                    } else {
                        f3 = f2;
                    }
                    if ((i2 & 64) != 0) {
                        i9 &= -3670017;
                        windowInsets = c01Var.getWindowInsets(kk0Var, 6);
                    }
                    rg3Var4 = rg3Var3;
                    j5 = standardContainerColor;
                    j6 = jM2x310ea166;
                    f4 = f3;
                }
                kk0Var.s();
                xj2.DrawerPredictiveBackHandler(h01Var, zg0.rememberComposableLambda(-807955710, true, new fj2(windowInsets, cVar3, rg3Var4, j5, j6, f4, oe1Var), kk0Var, 54), kk0Var, (i9 & 14) | 48);
                cVar4 = cVar3;
                rg3Var5 = rg3Var4;
                j7 = j5;
                j8 = j6;
                f5 = f4;
            }
            eVar2 = windowInsets;
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new gj2(h01Var, cVar4, rg3Var5, j7, j8, f5, eVar2, oe1Var, i, i2, 0));
            }
        }
        i3 |= 384;
        rg3Var2 = rg3Var;
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                j3 = j;
                if (kk0Var.g(j3)) {
                }
                i3 |= i14;
            } else {
                j3 = j;
            }
            i3 |= i14;
        } else {
            j3 = j;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                j4 = j2;
                if (kk0Var.g(j4)) {
                    i12 = 16384;
                }
                i3 |= i12;
            } else {
                j4 = j2;
            }
            i12 = ConstantsKt.DEFAULT_BUFFER_SIZE;
            i3 |= i12;
        } else {
            j4 = j2;
        }
        i6 = i2 & 32;
        if (i6 != 0) {
            if ((196608 & i) == 0) {
                f2 = f;
                if (kk0Var.e(f2)) {
                    i7 = 131072;
                } else {
                    i7 = 65536;
                }
                i3 |= i7;
            }
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    windowInsets = eVar;
                    if (kk0Var.h(windowInsets)) {
                    }
                    i3 |= i15;
                } else {
                    windowInsets = eVar;
                }
                i3 |= i15;
            } else {
                windowInsets = eVar;
            }
            i8 = i3;
            if ((i2 & Uuid.SIZE_BITS) != 0) {
                i9 = i8 | 12582912;
            } else if ((i & 12582912) == 0) {
                if (kk0Var.j(oe1Var)) {
                    i10 = 8388608;
                } else {
                    i10 = 4194304;
                }
                i9 = i8 | i10;
            } else {
                i9 = i8;
            }
            if ((i9 & 4793491) == 4793490) {
                kk0Var.X();
                if ((i & 1) != 0) {
                    if (i13 != 0) {
                        cVar2 = c.i;
                    } else {
                        cVar2 = cVar;
                    }
                    if (i4 != 0) {
                        rg3Var3 = k43.a;
                    } else {
                        rg3Var3 = rg3Var2;
                    }
                    i11 = i2 & 8;
                    c01Var = c01.a;
                    cVar3 = cVar2;
                    if (i11 != 0) {
                        standardContainerColor = c01Var.getStandardContainerColor(kk0Var, 6);
                        i9 &= -7169;
                    } else {
                        standardContainerColor = j3;
                    }
                    if ((i2 & 16) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(standardContainerColor, kk0Var, (i9 >> 9) & 14);
                        i9 &= -57345;
                    } else {
                        jM2x310ea166 = j4;
                    }
                    if (i6 != 0) {
                        f3 = 0.0f;
                    } else {
                        f3 = f2;
                    }
                    if ((i2 & 64) != 0) {
                        i9 &= -3670017;
                        windowInsets = c01Var.getWindowInsets(kk0Var, 6);
                    }
                    rg3Var4 = rg3Var3;
                    j5 = standardContainerColor;
                    j6 = jM2x310ea166;
                    f4 = f3;
                } else {
                    if (i13 != 0) {
                        cVar2 = c.i;
                    } else {
                        cVar2 = cVar;
                    }
                    if (i4 != 0) {
                        rg3Var3 = k43.a;
                    } else {
                        rg3Var3 = rg3Var2;
                    }
                    i11 = i2 & 8;
                    c01Var = c01.a;
                    cVar3 = cVar2;
                    if (i11 != 0) {
                        standardContainerColor = c01Var.getStandardContainerColor(kk0Var, 6);
                        i9 &= -7169;
                    } else {
                        standardContainerColor = j3;
                    }
                    if ((i2 & 16) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(standardContainerColor, kk0Var, (i9 >> 9) & 14);
                        i9 &= -57345;
                    } else {
                        jM2x310ea166 = j4;
                    }
                    if (i6 != 0) {
                        f3 = 0.0f;
                    } else {
                        f3 = f2;
                    }
                    if ((i2 & 64) != 0) {
                        i9 &= -3670017;
                        windowInsets = c01Var.getWindowInsets(kk0Var, 6);
                    }
                    rg3Var4 = rg3Var3;
                    j5 = standardContainerColor;
                    j6 = jM2x310ea166;
                    f4 = f3;
                }
                kk0Var.s();
                xj2.DrawerPredictiveBackHandler(h01Var, zg0.rememberComposableLambda(-807955710, true, new fj2(windowInsets, cVar3, rg3Var4, j5, j6, f4, oe1Var), kk0Var, 54), kk0Var, (i9 & 14) | 48);
                cVar4 = cVar3;
                rg3Var5 = rg3Var4;
                j7 = j5;
                j8 = j6;
                f5 = f4;
            } else {
                kk0Var.X();
                if ((i & 1) != 0) {
                    if (i13 != 0) {
                        cVar2 = c.i;
                    } else {
                        cVar2 = cVar;
                    }
                    if (i4 != 0) {
                        rg3Var3 = k43.a;
                    } else {
                        rg3Var3 = rg3Var2;
                    }
                    i11 = i2 & 8;
                    c01Var = c01.a;
                    cVar3 = cVar2;
                    if (i11 != 0) {
                        standardContainerColor = c01Var.getStandardContainerColor(kk0Var, 6);
                        i9 &= -7169;
                    } else {
                        standardContainerColor = j3;
                    }
                    if ((i2 & 16) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(standardContainerColor, kk0Var, (i9 >> 9) & 14);
                        i9 &= -57345;
                    } else {
                        jM2x310ea166 = j4;
                    }
                    if (i6 != 0) {
                        f3 = 0.0f;
                    } else {
                        f3 = f2;
                    }
                    if ((i2 & 64) != 0) {
                        i9 &= -3670017;
                        windowInsets = c01Var.getWindowInsets(kk0Var, 6);
                    }
                    rg3Var4 = rg3Var3;
                    j5 = standardContainerColor;
                    j6 = jM2x310ea166;
                    f4 = f3;
                } else {
                    if (i13 != 0) {
                        cVar2 = c.i;
                    } else {
                        cVar2 = cVar;
                    }
                    if (i4 != 0) {
                        rg3Var3 = k43.a;
                    } else {
                        rg3Var3 = rg3Var2;
                    }
                    i11 = i2 & 8;
                    c01Var = c01.a;
                    cVar3 = cVar2;
                    if (i11 != 0) {
                        standardContainerColor = c01Var.getStandardContainerColor(kk0Var, 6);
                        i9 &= -7169;
                    } else {
                        standardContainerColor = j3;
                    }
                    if ((i2 & 16) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(standardContainerColor, kk0Var, (i9 >> 9) & 14);
                        i9 &= -57345;
                    } else {
                        jM2x310ea166 = j4;
                    }
                    if (i6 != 0) {
                        f3 = 0.0f;
                    } else {
                        f3 = f2;
                    }
                    if ((i2 & 64) != 0) {
                        i9 &= -3670017;
                        windowInsets = c01Var.getWindowInsets(kk0Var, 6);
                    }
                    rg3Var4 = rg3Var3;
                    j5 = standardContainerColor;
                    j6 = jM2x310ea166;
                    f4 = f3;
                }
                kk0Var.s();
                xj2.DrawerPredictiveBackHandler(h01Var, zg0.rememberComposableLambda(-807955710, true, new fj2(windowInsets, cVar3, rg3Var4, j5, j6, f4, oe1Var), kk0Var, 54), kk0Var, (i9 & 14) | 48);
                cVar4 = cVar3;
                rg3Var5 = rg3Var4;
                j7 = j5;
                j8 = j6;
                f5 = f4;
            }
            eVar2 = windowInsets;
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new gj2(h01Var, cVar4, rg3Var5, j7, j8, f5, eVar2, oe1Var, i, i2, 0));
            }
        }
        i3 |= 196608;
        f2 = f;
        if ((1572864 & i) == 0) {
            if ((i2 & 64) == 0) {
                windowInsets = eVar;
                if (kk0Var.h(windowInsets)) {
                }
                i3 |= i15;
            } else {
                windowInsets = eVar;
            }
            i3 |= i15;
        } else {
            windowInsets = eVar;
        }
        i8 = i3;
        if ((i2 & Uuid.SIZE_BITS) != 0) {
            i9 = i8 | 12582912;
        } else if ((i & 12582912) == 0) {
            if (kk0Var.j(oe1Var)) {
                i10 = 8388608;
            } else {
                i10 = 4194304;
            }
            i9 = i8 | i10;
        } else {
            i9 = i8;
        }
        if ((i9 & 4793491) == 4793490) {
            kk0Var.X();
            if ((i & 1) != 0) {
                if (i13 != 0) {
                    cVar2 = c.i;
                } else {
                    cVar2 = cVar;
                }
                if (i4 != 0) {
                    rg3Var3 = k43.a;
                } else {
                    rg3Var3 = rg3Var2;
                }
                i11 = i2 & 8;
                c01Var = c01.a;
                cVar3 = cVar2;
                if (i11 != 0) {
                    standardContainerColor = c01Var.getStandardContainerColor(kk0Var, 6);
                    i9 &= -7169;
                } else {
                    standardContainerColor = j3;
                }
                if ((i2 & 16) != 0) {
                    jM2x310ea166 = af0.m2x310ea166(standardContainerColor, kk0Var, (i9 >> 9) & 14);
                    i9 &= -57345;
                } else {
                    jM2x310ea166 = j4;
                }
                if (i6 != 0) {
                    f3 = 0.0f;
                } else {
                    f3 = f2;
                }
                if ((i2 & 64) != 0) {
                    i9 &= -3670017;
                    windowInsets = c01Var.getWindowInsets(kk0Var, 6);
                }
                rg3Var4 = rg3Var3;
                j5 = standardContainerColor;
                j6 = jM2x310ea166;
                f4 = f3;
            } else {
                if (i13 != 0) {
                    cVar2 = c.i;
                } else {
                    cVar2 = cVar;
                }
                if (i4 != 0) {
                    rg3Var3 = k43.a;
                } else {
                    rg3Var3 = rg3Var2;
                }
                i11 = i2 & 8;
                c01Var = c01.a;
                cVar3 = cVar2;
                if (i11 != 0) {
                    standardContainerColor = c01Var.getStandardContainerColor(kk0Var, 6);
                    i9 &= -7169;
                } else {
                    standardContainerColor = j3;
                }
                if ((i2 & 16) != 0) {
                    jM2x310ea166 = af0.m2x310ea166(standardContainerColor, kk0Var, (i9 >> 9) & 14);
                    i9 &= -57345;
                } else {
                    jM2x310ea166 = j4;
                }
                if (i6 != 0) {
                    f3 = 0.0f;
                } else {
                    f3 = f2;
                }
                if ((i2 & 64) != 0) {
                    i9 &= -3670017;
                    windowInsets = c01Var.getWindowInsets(kk0Var, 6);
                }
                rg3Var4 = rg3Var3;
                j5 = standardContainerColor;
                j6 = jM2x310ea166;
                f4 = f3;
            }
            kk0Var.s();
            xj2.DrawerPredictiveBackHandler(h01Var, zg0.rememberComposableLambda(-807955710, true, new fj2(windowInsets, cVar3, rg3Var4, j5, j6, f4, oe1Var), kk0Var, 54), kk0Var, (i9 & 14) | 48);
            cVar4 = cVar3;
            rg3Var5 = rg3Var4;
            j7 = j5;
            j8 = j6;
            f5 = f4;
        } else {
            kk0Var.X();
            if ((i & 1) != 0) {
                if (i13 != 0) {
                    cVar2 = c.i;
                } else {
                    cVar2 = cVar;
                }
                if (i4 != 0) {
                    rg3Var3 = k43.a;
                } else {
                    rg3Var3 = rg3Var2;
                }
                i11 = i2 & 8;
                c01Var = c01.a;
                cVar3 = cVar2;
                if (i11 != 0) {
                    standardContainerColor = c01Var.getStandardContainerColor(kk0Var, 6);
                    i9 &= -7169;
                } else {
                    standardContainerColor = j3;
                }
                if ((i2 & 16) != 0) {
                    jM2x310ea166 = af0.m2x310ea166(standardContainerColor, kk0Var, (i9 >> 9) & 14);
                    i9 &= -57345;
                } else {
                    jM2x310ea166 = j4;
                }
                if (i6 != 0) {
                    f3 = 0.0f;
                } else {
                    f3 = f2;
                }
                if ((i2 & 64) != 0) {
                    i9 &= -3670017;
                    windowInsets = c01Var.getWindowInsets(kk0Var, 6);
                }
                rg3Var4 = rg3Var3;
                j5 = standardContainerColor;
                j6 = jM2x310ea166;
                f4 = f3;
            } else {
                if (i13 != 0) {
                    cVar2 = c.i;
                } else {
                    cVar2 = cVar;
                }
                if (i4 != 0) {
                    rg3Var3 = k43.a;
                } else {
                    rg3Var3 = rg3Var2;
                }
                i11 = i2 & 8;
                c01Var = c01.a;
                cVar3 = cVar2;
                if (i11 != 0) {
                    standardContainerColor = c01Var.getStandardContainerColor(kk0Var, 6);
                    i9 &= -7169;
                } else {
                    standardContainerColor = j3;
                }
                if ((i2 & 16) != 0) {
                    jM2x310ea166 = af0.m2x310ea166(standardContainerColor, kk0Var, (i9 >> 9) & 14);
                    i9 &= -57345;
                } else {
                    jM2x310ea166 = j4;
                }
                if (i6 != 0) {
                    f3 = 0.0f;
                } else {
                    f3 = f2;
                }
                if ((i2 & 64) != 0) {
                    i9 &= -3670017;
                    windowInsets = c01Var.getWindowInsets(kk0Var, 6);
                }
                rg3Var4 = rg3Var3;
                j5 = standardContainerColor;
                j6 = jM2x310ea166;
                f4 = f3;
            }
            kk0Var.s();
            xj2.DrawerPredictiveBackHandler(h01Var, zg0.rememberComposableLambda(-807955710, true, new fj2(windowInsets, cVar3, rg3Var4, j5, j6, f4, oe1Var), kk0Var, 54), kk0Var, (i9 & 14) | 48);
            cVar4 = cVar3;
            rg3Var5 = rg3Var4;
            j7 = j5;
            j8 = j6;
            f5 = f4;
        }
        eVar2 = windowInsets;
        w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new gj2(h01Var, cVar4, rg3Var5, j7, j8, f5, eVar2, oe1Var, i, i2, 0));
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x011e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:102:0x0120  */
    /* JADX WARN: Code duplicated, block: B:103:0x0123  */
    /* JADX WARN: Code duplicated, block: B:105:0x0126  */
    /* JADX WARN: Code duplicated, block: B:108:0x012f  */
    /* JADX WARN: Code duplicated, block: B:111:0x0139  */
    /* JADX WARN: Code duplicated, block: B:113:0x0146  */
    /* JADX WARN: Code duplicated, block: B:116:0x014c  */
    /* JADX WARN: Code duplicated, block: B:117:0x015b  */
    /* JADX WARN: Code duplicated, block: B:121:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:28:0x004d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:31:0x0058  */
    /* JADX WARN: Code duplicated, block: B:34:0x005e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0064  */
    /* JADX WARN: Code duplicated, block: B:39:0x0068  */
    /* JADX WARN: Code duplicated, block: B:41:0x0070  */
    /* JADX WARN: Code duplicated, block: B:42:0x0073  */
    /* JADX WARN: Code duplicated, block: B:45:0x0079  */
    /* JADX WARN: Code duplicated, block: B:48:0x007f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0084  */
    /* JADX WARN: Code duplicated, block: B:52:0x0088  */
    /* JADX WARN: Code duplicated, block: B:54:0x0090  */
    /* JADX WARN: Code duplicated, block: B:55:0x0093  */
    /* JADX WARN: Code duplicated, block: B:59:0x009b  */
    /* JADX WARN: Code duplicated, block: B:61:0x009f  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:72:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:76:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:77:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f8  */
    /* JADX INFO: renamed from: DismissibleDrawerSheet-afqeVBk, reason: not valid java name */
    public static final void m1820x115ca86b(c cVar, rg3 rg3Var, long j, long j2, float f, e eVar, oe1 oe1Var, ck0 ck0Var, int i, int i2) {
        c cVar2;
        int i3;
        rg3 rg3Var2;
        long standardContainerColor;
        long jM2x310ea166;
        int i4;
        float f2;
        int i5;
        e eVar2;
        int i6;
        c cVar3;
        int i7;
        c01 c01Var;
        rg3 rg3Var3;
        long j3;
        float f3;
        e windowInsets;
        c cVar4;
        kk0 kk0Var;
        e eVar3;
        c cVar5;
        rg3 rg3Var4;
        long j4;
        long j5;
        float f4;
        w33 w33VarV;
        int i8;
        kk0 kk0Var2 = (kk0) ck0Var;
        kk0Var2.c0(-588600583);
        int i9 = i2 & 1;
        if (i9 != 0) {
            i3 = i | 6;
            cVar2 = cVar;
        } else if ((i & 6) == 0) {
            cVar2 = cVar;
            i3 = (kk0Var2.h(cVar2) ? 4 : 2) | i;
        } else {
            cVar2 = cVar;
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 == 0) {
            if ((i & 48) == 0) {
                rg3Var2 = rg3Var;
                i3 |= kk0Var2.h(rg3Var2) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                if ((i2 & 4) == 0) {
                    standardContainerColor = j;
                    if (kk0Var2.g(standardContainerColor)) {
                        i8 = FontInfo.NUMBER_OF_CHAR_CODES;
                    }
                    i3 |= i8;
                } else {
                    standardContainerColor = j;
                }
                i8 = Uuid.SIZE_BITS;
                i3 |= i8;
            } else {
                standardContainerColor = j;
            }
            if ((i & 3072) == 0) {
                if ((i2 & 8) == 0) {
                    jM2x310ea166 = j2;
                    int i11 = kk0Var2.g(jM2x310ea166) ? 2048 : 1024;
                    i3 |= i11;
                } else {
                    jM2x310ea166 = j2;
                }
                i3 |= i11;
            } else {
                jM2x310ea166 = j2;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    f2 = f;
                    if (kk0Var2.e(f2)) {
                        i5 = 16384;
                    } else {
                        i5 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                    }
                    i3 |= i5;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        eVar2 = eVar;
                        int i12 = kk0Var2.h(eVar2) ? 131072 : 65536;
                        i3 |= i12;
                    } else {
                        eVar2 = eVar;
                    }
                    i3 |= i12;
                } else {
                    eVar2 = eVar;
                }
                if ((i2 & 64) != 0) {
                    if ((i & 1572864) == 0) {
                        if (kk0Var2.j(oe1Var)) {
                            i6 = 1048576;
                        } else {
                            i6 = 524288;
                        }
                        i3 |= i6;
                    }
                    if ((599187 & i3) == 599186 || !kk0Var2.F()) {
                        kk0Var2.X();
                        if ((i & 1) != 0 || kk0Var2.D()) {
                            if (i9 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i10 != 0) {
                                rg3Var2 = k43.a;
                            }
                            i7 = i2 & 4;
                            c01Var = c01.a;
                            if (i7 != 0) {
                                standardContainerColor = c01Var.getStandardContainerColor(kk0Var2, 6);
                                i3 &= -897;
                            }
                            if ((i2 & 8) != 0) {
                                jM2x310ea166 = af0.m2x310ea166(standardContainerColor, kk0Var2, (i3 >> 6) & 14);
                                i3 &= -7169;
                            }
                            if (i4 != 0) {
                                f2 = 0.0f;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                                cVar4 = cVar3;
                                rg3Var3 = rg3Var2;
                                j3 = jM2x310ea166;
                                f3 = f2;
                                windowInsets = c01Var.getWindowInsets(kk0Var2, 6);
                            } else {
                                rg3Var3 = rg3Var2;
                                j3 = jM2x310ea166;
                                f3 = f2;
                                windowInsets = eVar2;
                                cVar4 = cVar3;
                            }
                        } else {
                            kk0Var2.V();
                            if ((i2 & 4) != 0) {
                                i3 &= -897;
                            }
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                            rg3Var3 = rg3Var2;
                            j3 = jM2x310ea166;
                            f3 = f2;
                            windowInsets = eVar2;
                            cVar4 = cVar2;
                        }
                        long j6 = standardContainerColor;
                        kk0Var2.s();
                        int i13 = i3 << 6;
                        kk0Var = kk0Var2;
                        m1821xd59157b8(null, windowInsets, cVar4, rg3Var3, j6, j3, f3, oe1Var, kk0Var, 6 | ((i3 >> 12) & 112) | (i13 & 896) | (i13 & 7168) | (57344 & i13) | (458752 & i13) | (i13 & 3670016) | ((i3 << 3) & 29360128), 0);
                        eVar3 = windowInsets;
                        cVar5 = cVar4;
                        rg3Var4 = rg3Var3;
                        j4 = j6;
                        j5 = j3;
                        f4 = f3;
                    } else {
                        kk0Var2.V();
                        kk0Var = kk0Var2;
                        cVar5 = cVar2;
                        rg3Var4 = rg3Var2;
                        j4 = standardContainerColor;
                        j5 = jM2x310ea166;
                        f4 = f2;
                        eVar3 = eVar2;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new ej2(cVar5, rg3Var4, j4, j5, f4, eVar3, oe1Var, i, i2, 0));
                    }
                }
                i3 |= 1572864;
                if ((599187 & i3) == 599186) {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i9 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i10 != 0) {
                            rg3Var2 = k43.a;
                        }
                        i7 = i2 & 4;
                        c01Var = c01.a;
                        if (i7 != 0) {
                            standardContainerColor = c01Var.getStandardContainerColor(kk0Var2, 6);
                            i3 &= -897;
                        }
                        if ((i2 & 8) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(standardContainerColor, kk0Var2, (i3 >> 6) & 14);
                            i3 &= -7169;
                        }
                        if (i4 != 0) {
                            f2 = 0.0f;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            cVar4 = cVar3;
                            rg3Var3 = rg3Var2;
                            j3 = jM2x310ea166;
                            f3 = f2;
                            windowInsets = c01Var.getWindowInsets(kk0Var2, 6);
                        } else {
                            rg3Var3 = rg3Var2;
                            j3 = jM2x310ea166;
                            f3 = f2;
                            windowInsets = eVar2;
                            cVar4 = cVar3;
                        }
                    } else {
                        if (i9 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i10 != 0) {
                            rg3Var2 = k43.a;
                        }
                        i7 = i2 & 4;
                        c01Var = c01.a;
                        if (i7 != 0) {
                            standardContainerColor = c01Var.getStandardContainerColor(kk0Var2, 6);
                            i3 &= -897;
                        }
                        if ((i2 & 8) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(standardContainerColor, kk0Var2, (i3 >> 6) & 14);
                            i3 &= -7169;
                        }
                        if (i4 != 0) {
                            f2 = 0.0f;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            cVar4 = cVar3;
                            rg3Var3 = rg3Var2;
                            j3 = jM2x310ea166;
                            f3 = f2;
                            windowInsets = c01Var.getWindowInsets(kk0Var2, 6);
                        } else {
                            rg3Var3 = rg3Var2;
                            j3 = jM2x310ea166;
                            f3 = f2;
                            windowInsets = eVar2;
                            cVar4 = cVar3;
                        }
                    }
                    long j7 = standardContainerColor;
                    kk0Var2.s();
                    int i14 = i3 << 6;
                    kk0Var = kk0Var2;
                    m1821xd59157b8(null, windowInsets, cVar4, rg3Var3, j7, j3, f3, oe1Var, kk0Var, 6 | ((i3 >> 12) & 112) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | (i14 & 3670016) | ((i3 << 3) & 29360128), 0);
                    eVar3 = windowInsets;
                    cVar5 = cVar4;
                    rg3Var4 = rg3Var3;
                    j4 = j7;
                    j5 = j3;
                    f4 = f3;
                } else {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i9 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i10 != 0) {
                            rg3Var2 = k43.a;
                        }
                        i7 = i2 & 4;
                        c01Var = c01.a;
                        if (i7 != 0) {
                            standardContainerColor = c01Var.getStandardContainerColor(kk0Var2, 6);
                            i3 &= -897;
                        }
                        if ((i2 & 8) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(standardContainerColor, kk0Var2, (i3 >> 6) & 14);
                            i3 &= -7169;
                        }
                        if (i4 != 0) {
                            f2 = 0.0f;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            cVar4 = cVar3;
                            rg3Var3 = rg3Var2;
                            j3 = jM2x310ea166;
                            f3 = f2;
                            windowInsets = c01Var.getWindowInsets(kk0Var2, 6);
                        } else {
                            rg3Var3 = rg3Var2;
                            j3 = jM2x310ea166;
                            f3 = f2;
                            windowInsets = eVar2;
                            cVar4 = cVar3;
                        }
                    } else {
                        if (i9 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i10 != 0) {
                            rg3Var2 = k43.a;
                        }
                        i7 = i2 & 4;
                        c01Var = c01.a;
                        if (i7 != 0) {
                            standardContainerColor = c01Var.getStandardContainerColor(kk0Var2, 6);
                            i3 &= -897;
                        }
                        if ((i2 & 8) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(standardContainerColor, kk0Var2, (i3 >> 6) & 14);
                            i3 &= -7169;
                        }
                        if (i4 != 0) {
                            f2 = 0.0f;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            cVar4 = cVar3;
                            rg3Var3 = rg3Var2;
                            j3 = jM2x310ea166;
                            f3 = f2;
                            windowInsets = c01Var.getWindowInsets(kk0Var2, 6);
                        } else {
                            rg3Var3 = rg3Var2;
                            j3 = jM2x310ea166;
                            f3 = f2;
                            windowInsets = eVar2;
                            cVar4 = cVar3;
                        }
                    }
                    long j8 = standardContainerColor;
                    kk0Var2.s();
                    int i15 = i3 << 6;
                    kk0Var = kk0Var2;
                    m1821xd59157b8(null, windowInsets, cVar4, rg3Var3, j8, j3, f3, oe1Var, kk0Var, 6 | ((i3 >> 12) & 112) | (i15 & 896) | (i15 & 7168) | (57344 & i15) | (458752 & i15) | (i15 & 3670016) | ((i3 << 3) & 29360128), 0);
                    eVar3 = windowInsets;
                    cVar5 = cVar4;
                    rg3Var4 = rg3Var3;
                    j4 = j8;
                    j5 = j3;
                    f4 = f3;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new ej2(cVar5, rg3Var4, j4, j5, f4, eVar3, oe1Var, i, i2, 0));
                }
            }
            i3 |= 24576;
            f2 = f;
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0) {
                    eVar2 = eVar;
                    if (kk0Var2.h(eVar2)) {
                    }
                    i3 |= i12;
                } else {
                    eVar2 = eVar;
                }
                i3 |= i12;
            } else {
                eVar2 = eVar;
            }
            if ((i2 & 64) != 0) {
                if ((i & 1572864) == 0) {
                    if (kk0Var2.j(oe1Var)) {
                        i6 = 1048576;
                    } else {
                        i6 = 524288;
                    }
                    i3 |= i6;
                }
                if ((599187 & i3) == 599186) {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i9 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i10 != 0) {
                            rg3Var2 = k43.a;
                        }
                        i7 = i2 & 4;
                        c01Var = c01.a;
                        if (i7 != 0) {
                            standardContainerColor = c01Var.getStandardContainerColor(kk0Var2, 6);
                            i3 &= -897;
                        }
                        if ((i2 & 8) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(standardContainerColor, kk0Var2, (i3 >> 6) & 14);
                            i3 &= -7169;
                        }
                        if (i4 != 0) {
                            f2 = 0.0f;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            cVar4 = cVar3;
                            rg3Var3 = rg3Var2;
                            j3 = jM2x310ea166;
                            f3 = f2;
                            windowInsets = c01Var.getWindowInsets(kk0Var2, 6);
                        } else {
                            rg3Var3 = rg3Var2;
                            j3 = jM2x310ea166;
                            f3 = f2;
                            windowInsets = eVar2;
                            cVar4 = cVar3;
                        }
                    } else {
                        if (i9 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i10 != 0) {
                            rg3Var2 = k43.a;
                        }
                        i7 = i2 & 4;
                        c01Var = c01.a;
                        if (i7 != 0) {
                            standardContainerColor = c01Var.getStandardContainerColor(kk0Var2, 6);
                            i3 &= -897;
                        }
                        if ((i2 & 8) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(standardContainerColor, kk0Var2, (i3 >> 6) & 14);
                            i3 &= -7169;
                        }
                        if (i4 != 0) {
                            f2 = 0.0f;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            cVar4 = cVar3;
                            rg3Var3 = rg3Var2;
                            j3 = jM2x310ea166;
                            f3 = f2;
                            windowInsets = c01Var.getWindowInsets(kk0Var2, 6);
                        } else {
                            rg3Var3 = rg3Var2;
                            j3 = jM2x310ea166;
                            f3 = f2;
                            windowInsets = eVar2;
                            cVar4 = cVar3;
                        }
                    }
                    long j9 = standardContainerColor;
                    kk0Var2.s();
                    int i16 = i3 << 6;
                    kk0Var = kk0Var2;
                    m1821xd59157b8(null, windowInsets, cVar4, rg3Var3, j9, j3, f3, oe1Var, kk0Var, 6 | ((i3 >> 12) & 112) | (i16 & 896) | (i16 & 7168) | (57344 & i16) | (458752 & i16) | (i16 & 3670016) | ((i3 << 3) & 29360128), 0);
                    eVar3 = windowInsets;
                    cVar5 = cVar4;
                    rg3Var4 = rg3Var3;
                    j4 = j9;
                    j5 = j3;
                    f4 = f3;
                } else {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i9 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i10 != 0) {
                            rg3Var2 = k43.a;
                        }
                        i7 = i2 & 4;
                        c01Var = c01.a;
                        if (i7 != 0) {
                            standardContainerColor = c01Var.getStandardContainerColor(kk0Var2, 6);
                            i3 &= -897;
                        }
                        if ((i2 & 8) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(standardContainerColor, kk0Var2, (i3 >> 6) & 14);
                            i3 &= -7169;
                        }
                        if (i4 != 0) {
                            f2 = 0.0f;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            cVar4 = cVar3;
                            rg3Var3 = rg3Var2;
                            j3 = jM2x310ea166;
                            f3 = f2;
                            windowInsets = c01Var.getWindowInsets(kk0Var2, 6);
                        } else {
                            rg3Var3 = rg3Var2;
                            j3 = jM2x310ea166;
                            f3 = f2;
                            windowInsets = eVar2;
                            cVar4 = cVar3;
                        }
                    } else {
                        if (i9 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i10 != 0) {
                            rg3Var2 = k43.a;
                        }
                        i7 = i2 & 4;
                        c01Var = c01.a;
                        if (i7 != 0) {
                            standardContainerColor = c01Var.getStandardContainerColor(kk0Var2, 6);
                            i3 &= -897;
                        }
                        if ((i2 & 8) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(standardContainerColor, kk0Var2, (i3 >> 6) & 14);
                            i3 &= -7169;
                        }
                        if (i4 != 0) {
                            f2 = 0.0f;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            cVar4 = cVar3;
                            rg3Var3 = rg3Var2;
                            j3 = jM2x310ea166;
                            f3 = f2;
                            windowInsets = c01Var.getWindowInsets(kk0Var2, 6);
                        } else {
                            rg3Var3 = rg3Var2;
                            j3 = jM2x310ea166;
                            f3 = f2;
                            windowInsets = eVar2;
                            cVar4 = cVar3;
                        }
                    }
                    long j10 = standardContainerColor;
                    kk0Var2.s();
                    int i17 = i3 << 6;
                    kk0Var = kk0Var2;
                    m1821xd59157b8(null, windowInsets, cVar4, rg3Var3, j10, j3, f3, oe1Var, kk0Var, 6 | ((i3 >> 12) & 112) | (i17 & 896) | (i17 & 7168) | (57344 & i17) | (458752 & i17) | (i17 & 3670016) | ((i3 << 3) & 29360128), 0);
                    eVar3 = windowInsets;
                    cVar5 = cVar4;
                    rg3Var4 = rg3Var3;
                    j4 = j10;
                    j5 = j3;
                    f4 = f3;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new ej2(cVar5, rg3Var4, j4, j5, f4, eVar3, oe1Var, i, i2, 0));
                }
            }
            i3 |= 1572864;
            if ((599187 & i3) == 599186) {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i10 != 0) {
                        rg3Var2 = k43.a;
                    }
                    i7 = i2 & 4;
                    c01Var = c01.a;
                    if (i7 != 0) {
                        standardContainerColor = c01Var.getStandardContainerColor(kk0Var2, 6);
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(standardContainerColor, kk0Var2, (i3 >> 6) & 14);
                        i3 &= -7169;
                    }
                    if (i4 != 0) {
                        f2 = 0.0f;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        cVar4 = cVar3;
                        rg3Var3 = rg3Var2;
                        j3 = jM2x310ea166;
                        f3 = f2;
                        windowInsets = c01Var.getWindowInsets(kk0Var2, 6);
                    } else {
                        rg3Var3 = rg3Var2;
                        j3 = jM2x310ea166;
                        f3 = f2;
                        windowInsets = eVar2;
                        cVar4 = cVar3;
                    }
                } else {
                    if (i9 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i10 != 0) {
                        rg3Var2 = k43.a;
                    }
                    i7 = i2 & 4;
                    c01Var = c01.a;
                    if (i7 != 0) {
                        standardContainerColor = c01Var.getStandardContainerColor(kk0Var2, 6);
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(standardContainerColor, kk0Var2, (i3 >> 6) & 14);
                        i3 &= -7169;
                    }
                    if (i4 != 0) {
                        f2 = 0.0f;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        cVar4 = cVar3;
                        rg3Var3 = rg3Var2;
                        j3 = jM2x310ea166;
                        f3 = f2;
                        windowInsets = c01Var.getWindowInsets(kk0Var2, 6);
                    } else {
                        rg3Var3 = rg3Var2;
                        j3 = jM2x310ea166;
                        f3 = f2;
                        windowInsets = eVar2;
                        cVar4 = cVar3;
                    }
                }
                long j11 = standardContainerColor;
                kk0Var2.s();
                int i18 = i3 << 6;
                kk0Var = kk0Var2;
                m1821xd59157b8(null, windowInsets, cVar4, rg3Var3, j11, j3, f3, oe1Var, kk0Var, 6 | ((i3 >> 12) & 112) | (i18 & 896) | (i18 & 7168) | (57344 & i18) | (458752 & i18) | (i18 & 3670016) | ((i3 << 3) & 29360128), 0);
                eVar3 = windowInsets;
                cVar5 = cVar4;
                rg3Var4 = rg3Var3;
                j4 = j11;
                j5 = j3;
                f4 = f3;
            } else {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i10 != 0) {
                        rg3Var2 = k43.a;
                    }
                    i7 = i2 & 4;
                    c01Var = c01.a;
                    if (i7 != 0) {
                        standardContainerColor = c01Var.getStandardContainerColor(kk0Var2, 6);
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(standardContainerColor, kk0Var2, (i3 >> 6) & 14);
                        i3 &= -7169;
                    }
                    if (i4 != 0) {
                        f2 = 0.0f;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        cVar4 = cVar3;
                        rg3Var3 = rg3Var2;
                        j3 = jM2x310ea166;
                        f3 = f2;
                        windowInsets = c01Var.getWindowInsets(kk0Var2, 6);
                    } else {
                        rg3Var3 = rg3Var2;
                        j3 = jM2x310ea166;
                        f3 = f2;
                        windowInsets = eVar2;
                        cVar4 = cVar3;
                    }
                } else {
                    if (i9 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i10 != 0) {
                        rg3Var2 = k43.a;
                    }
                    i7 = i2 & 4;
                    c01Var = c01.a;
                    if (i7 != 0) {
                        standardContainerColor = c01Var.getStandardContainerColor(kk0Var2, 6);
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(standardContainerColor, kk0Var2, (i3 >> 6) & 14);
                        i3 &= -7169;
                    }
                    if (i4 != 0) {
                        f2 = 0.0f;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        cVar4 = cVar3;
                        rg3Var3 = rg3Var2;
                        j3 = jM2x310ea166;
                        f3 = f2;
                        windowInsets = c01Var.getWindowInsets(kk0Var2, 6);
                    } else {
                        rg3Var3 = rg3Var2;
                        j3 = jM2x310ea166;
                        f3 = f2;
                        windowInsets = eVar2;
                        cVar4 = cVar3;
                    }
                }
                long j12 = standardContainerColor;
                kk0Var2.s();
                int i19 = i3 << 6;
                kk0Var = kk0Var2;
                m1821xd59157b8(null, windowInsets, cVar4, rg3Var3, j12, j3, f3, oe1Var, kk0Var, 6 | ((i3 >> 12) & 112) | (i19 & 896) | (i19 & 7168) | (57344 & i19) | (458752 & i19) | (i19 & 3670016) | ((i3 << 3) & 29360128), 0);
                eVar3 = windowInsets;
                cVar5 = cVar4;
                rg3Var4 = rg3Var3;
                j4 = j12;
                j5 = j3;
                f4 = f3;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new ej2(cVar5, rg3Var4, j4, j5, f4, eVar3, oe1Var, i, i2, 0));
            }
        }
        i3 |= 48;
        rg3Var2 = rg3Var;
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                standardContainerColor = j;
                if (kk0Var2.g(standardContainerColor)) {
                    i8 = FontInfo.NUMBER_OF_CHAR_CODES;
                }
                i3 |= i8;
            } else {
                standardContainerColor = j;
            }
            i8 = Uuid.SIZE_BITS;
            i3 |= i8;
        } else {
            standardContainerColor = j;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                jM2x310ea166 = j2;
                if (kk0Var2.g(jM2x310ea166)) {
                }
                i3 |= i11;
            } else {
                jM2x310ea166 = j2;
            }
            i3 |= i11;
        } else {
            jM2x310ea166 = j2;
        }
        i4 = i2 & 16;
        if (i4 != 0) {
            if ((i & 24576) == 0) {
                f2 = f;
                if (kk0Var2.e(f2)) {
                    i5 = 16384;
                } else {
                    i5 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                }
                i3 |= i5;
            }
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0) {
                    eVar2 = eVar;
                    if (kk0Var2.h(eVar2)) {
                    }
                    i3 |= i12;
                } else {
                    eVar2 = eVar;
                }
                i3 |= i12;
            } else {
                eVar2 = eVar;
            }
            if ((i2 & 64) != 0) {
                if ((i & 1572864) == 0) {
                    if (kk0Var2.j(oe1Var)) {
                        i6 = 1048576;
                    } else {
                        i6 = 524288;
                    }
                    i3 |= i6;
                }
                if ((599187 & i3) == 599186) {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i9 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i10 != 0) {
                            rg3Var2 = k43.a;
                        }
                        i7 = i2 & 4;
                        c01Var = c01.a;
                        if (i7 != 0) {
                            standardContainerColor = c01Var.getStandardContainerColor(kk0Var2, 6);
                            i3 &= -897;
                        }
                        if ((i2 & 8) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(standardContainerColor, kk0Var2, (i3 >> 6) & 14);
                            i3 &= -7169;
                        }
                        if (i4 != 0) {
                            f2 = 0.0f;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            cVar4 = cVar3;
                            rg3Var3 = rg3Var2;
                            j3 = jM2x310ea166;
                            f3 = f2;
                            windowInsets = c01Var.getWindowInsets(kk0Var2, 6);
                        } else {
                            rg3Var3 = rg3Var2;
                            j3 = jM2x310ea166;
                            f3 = f2;
                            windowInsets = eVar2;
                            cVar4 = cVar3;
                        }
                    } else {
                        if (i9 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i10 != 0) {
                            rg3Var2 = k43.a;
                        }
                        i7 = i2 & 4;
                        c01Var = c01.a;
                        if (i7 != 0) {
                            standardContainerColor = c01Var.getStandardContainerColor(kk0Var2, 6);
                            i3 &= -897;
                        }
                        if ((i2 & 8) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(standardContainerColor, kk0Var2, (i3 >> 6) & 14);
                            i3 &= -7169;
                        }
                        if (i4 != 0) {
                            f2 = 0.0f;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            cVar4 = cVar3;
                            rg3Var3 = rg3Var2;
                            j3 = jM2x310ea166;
                            f3 = f2;
                            windowInsets = c01Var.getWindowInsets(kk0Var2, 6);
                        } else {
                            rg3Var3 = rg3Var2;
                            j3 = jM2x310ea166;
                            f3 = f2;
                            windowInsets = eVar2;
                            cVar4 = cVar3;
                        }
                    }
                    long j13 = standardContainerColor;
                    kk0Var2.s();
                    int i110 = i3 << 6;
                    kk0Var = kk0Var2;
                    m1821xd59157b8(null, windowInsets, cVar4, rg3Var3, j13, j3, f3, oe1Var, kk0Var, 6 | ((i3 >> 12) & 112) | (i110 & 896) | (i110 & 7168) | (57344 & i110) | (458752 & i110) | (i110 & 3670016) | ((i3 << 3) & 29360128), 0);
                    eVar3 = windowInsets;
                    cVar5 = cVar4;
                    rg3Var4 = rg3Var3;
                    j4 = j13;
                    j5 = j3;
                    f4 = f3;
                } else {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i9 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i10 != 0) {
                            rg3Var2 = k43.a;
                        }
                        i7 = i2 & 4;
                        c01Var = c01.a;
                        if (i7 != 0) {
                            standardContainerColor = c01Var.getStandardContainerColor(kk0Var2, 6);
                            i3 &= -897;
                        }
                        if ((i2 & 8) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(standardContainerColor, kk0Var2, (i3 >> 6) & 14);
                            i3 &= -7169;
                        }
                        if (i4 != 0) {
                            f2 = 0.0f;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            cVar4 = cVar3;
                            rg3Var3 = rg3Var2;
                            j3 = jM2x310ea166;
                            f3 = f2;
                            windowInsets = c01Var.getWindowInsets(kk0Var2, 6);
                        } else {
                            rg3Var3 = rg3Var2;
                            j3 = jM2x310ea166;
                            f3 = f2;
                            windowInsets = eVar2;
                            cVar4 = cVar3;
                        }
                    } else {
                        if (i9 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i10 != 0) {
                            rg3Var2 = k43.a;
                        }
                        i7 = i2 & 4;
                        c01Var = c01.a;
                        if (i7 != 0) {
                            standardContainerColor = c01Var.getStandardContainerColor(kk0Var2, 6);
                            i3 &= -897;
                        }
                        if ((i2 & 8) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(standardContainerColor, kk0Var2, (i3 >> 6) & 14);
                            i3 &= -7169;
                        }
                        if (i4 != 0) {
                            f2 = 0.0f;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            cVar4 = cVar3;
                            rg3Var3 = rg3Var2;
                            j3 = jM2x310ea166;
                            f3 = f2;
                            windowInsets = c01Var.getWindowInsets(kk0Var2, 6);
                        } else {
                            rg3Var3 = rg3Var2;
                            j3 = jM2x310ea166;
                            f3 = f2;
                            windowInsets = eVar2;
                            cVar4 = cVar3;
                        }
                    }
                    long j14 = standardContainerColor;
                    kk0Var2.s();
                    int i111 = i3 << 6;
                    kk0Var = kk0Var2;
                    m1821xd59157b8(null, windowInsets, cVar4, rg3Var3, j14, j3, f3, oe1Var, kk0Var, 6 | ((i3 >> 12) & 112) | (i111 & 896) | (i111 & 7168) | (57344 & i111) | (458752 & i111) | (i111 & 3670016) | ((i3 << 3) & 29360128), 0);
                    eVar3 = windowInsets;
                    cVar5 = cVar4;
                    rg3Var4 = rg3Var3;
                    j4 = j14;
                    j5 = j3;
                    f4 = f3;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new ej2(cVar5, rg3Var4, j4, j5, f4, eVar3, oe1Var, i, i2, 0));
                }
            }
            i3 |= 1572864;
            if ((599187 & i3) == 599186) {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i10 != 0) {
                        rg3Var2 = k43.a;
                    }
                    i7 = i2 & 4;
                    c01Var = c01.a;
                    if (i7 != 0) {
                        standardContainerColor = c01Var.getStandardContainerColor(kk0Var2, 6);
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(standardContainerColor, kk0Var2, (i3 >> 6) & 14);
                        i3 &= -7169;
                    }
                    if (i4 != 0) {
                        f2 = 0.0f;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        cVar4 = cVar3;
                        rg3Var3 = rg3Var2;
                        j3 = jM2x310ea166;
                        f3 = f2;
                        windowInsets = c01Var.getWindowInsets(kk0Var2, 6);
                    } else {
                        rg3Var3 = rg3Var2;
                        j3 = jM2x310ea166;
                        f3 = f2;
                        windowInsets = eVar2;
                        cVar4 = cVar3;
                    }
                } else {
                    if (i9 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i10 != 0) {
                        rg3Var2 = k43.a;
                    }
                    i7 = i2 & 4;
                    c01Var = c01.a;
                    if (i7 != 0) {
                        standardContainerColor = c01Var.getStandardContainerColor(kk0Var2, 6);
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(standardContainerColor, kk0Var2, (i3 >> 6) & 14);
                        i3 &= -7169;
                    }
                    if (i4 != 0) {
                        f2 = 0.0f;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        cVar4 = cVar3;
                        rg3Var3 = rg3Var2;
                        j3 = jM2x310ea166;
                        f3 = f2;
                        windowInsets = c01Var.getWindowInsets(kk0Var2, 6);
                    } else {
                        rg3Var3 = rg3Var2;
                        j3 = jM2x310ea166;
                        f3 = f2;
                        windowInsets = eVar2;
                        cVar4 = cVar3;
                    }
                }
                long j15 = standardContainerColor;
                kk0Var2.s();
                int i112 = i3 << 6;
                kk0Var = kk0Var2;
                m1821xd59157b8(null, windowInsets, cVar4, rg3Var3, j15, j3, f3, oe1Var, kk0Var, 6 | ((i3 >> 12) & 112) | (i112 & 896) | (i112 & 7168) | (57344 & i112) | (458752 & i112) | (i112 & 3670016) | ((i3 << 3) & 29360128), 0);
                eVar3 = windowInsets;
                cVar5 = cVar4;
                rg3Var4 = rg3Var3;
                j4 = j15;
                j5 = j3;
                f4 = f3;
            } else {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i10 != 0) {
                        rg3Var2 = k43.a;
                    }
                    i7 = i2 & 4;
                    c01Var = c01.a;
                    if (i7 != 0) {
                        standardContainerColor = c01Var.getStandardContainerColor(kk0Var2, 6);
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(standardContainerColor, kk0Var2, (i3 >> 6) & 14);
                        i3 &= -7169;
                    }
                    if (i4 != 0) {
                        f2 = 0.0f;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        cVar4 = cVar3;
                        rg3Var3 = rg3Var2;
                        j3 = jM2x310ea166;
                        f3 = f2;
                        windowInsets = c01Var.getWindowInsets(kk0Var2, 6);
                    } else {
                        rg3Var3 = rg3Var2;
                        j3 = jM2x310ea166;
                        f3 = f2;
                        windowInsets = eVar2;
                        cVar4 = cVar3;
                    }
                } else {
                    if (i9 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i10 != 0) {
                        rg3Var2 = k43.a;
                    }
                    i7 = i2 & 4;
                    c01Var = c01.a;
                    if (i7 != 0) {
                        standardContainerColor = c01Var.getStandardContainerColor(kk0Var2, 6);
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(standardContainerColor, kk0Var2, (i3 >> 6) & 14);
                        i3 &= -7169;
                    }
                    if (i4 != 0) {
                        f2 = 0.0f;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        cVar4 = cVar3;
                        rg3Var3 = rg3Var2;
                        j3 = jM2x310ea166;
                        f3 = f2;
                        windowInsets = c01Var.getWindowInsets(kk0Var2, 6);
                    } else {
                        rg3Var3 = rg3Var2;
                        j3 = jM2x310ea166;
                        f3 = f2;
                        windowInsets = eVar2;
                        cVar4 = cVar3;
                    }
                }
                long j16 = standardContainerColor;
                kk0Var2.s();
                int i113 = i3 << 6;
                kk0Var = kk0Var2;
                m1821xd59157b8(null, windowInsets, cVar4, rg3Var3, j16, j3, f3, oe1Var, kk0Var, 6 | ((i3 >> 12) & 112) | (i113 & 896) | (i113 & 7168) | (57344 & i113) | (458752 & i113) | (i113 & 3670016) | ((i3 << 3) & 29360128), 0);
                eVar3 = windowInsets;
                cVar5 = cVar4;
                rg3Var4 = rg3Var3;
                j4 = j16;
                j5 = j3;
                f4 = f3;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new ej2(cVar5, rg3Var4, j4, j5, f4, eVar3, oe1Var, i, i2, 0));
            }
        }
        i3 |= 24576;
        f2 = f;
        if ((196608 & i) == 0) {
            if ((i2 & 32) == 0) {
                eVar2 = eVar;
                if (kk0Var2.h(eVar2)) {
                }
                i3 |= i12;
            } else {
                eVar2 = eVar;
            }
            i3 |= i12;
        } else {
            eVar2 = eVar;
        }
        if ((i2 & 64) != 0) {
            if ((i & 1572864) == 0) {
                if (kk0Var2.j(oe1Var)) {
                    i6 = 1048576;
                } else {
                    i6 = 524288;
                }
                i3 |= i6;
            }
            if ((599187 & i3) == 599186) {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i10 != 0) {
                        rg3Var2 = k43.a;
                    }
                    i7 = i2 & 4;
                    c01Var = c01.a;
                    if (i7 != 0) {
                        standardContainerColor = c01Var.getStandardContainerColor(kk0Var2, 6);
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(standardContainerColor, kk0Var2, (i3 >> 6) & 14);
                        i3 &= -7169;
                    }
                    if (i4 != 0) {
                        f2 = 0.0f;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        cVar4 = cVar3;
                        rg3Var3 = rg3Var2;
                        j3 = jM2x310ea166;
                        f3 = f2;
                        windowInsets = c01Var.getWindowInsets(kk0Var2, 6);
                    } else {
                        rg3Var3 = rg3Var2;
                        j3 = jM2x310ea166;
                        f3 = f2;
                        windowInsets = eVar2;
                        cVar4 = cVar3;
                    }
                } else {
                    if (i9 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i10 != 0) {
                        rg3Var2 = k43.a;
                    }
                    i7 = i2 & 4;
                    c01Var = c01.a;
                    if (i7 != 0) {
                        standardContainerColor = c01Var.getStandardContainerColor(kk0Var2, 6);
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(standardContainerColor, kk0Var2, (i3 >> 6) & 14);
                        i3 &= -7169;
                    }
                    if (i4 != 0) {
                        f2 = 0.0f;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        cVar4 = cVar3;
                        rg3Var3 = rg3Var2;
                        j3 = jM2x310ea166;
                        f3 = f2;
                        windowInsets = c01Var.getWindowInsets(kk0Var2, 6);
                    } else {
                        rg3Var3 = rg3Var2;
                        j3 = jM2x310ea166;
                        f3 = f2;
                        windowInsets = eVar2;
                        cVar4 = cVar3;
                    }
                }
                long j17 = standardContainerColor;
                kk0Var2.s();
                int i114 = i3 << 6;
                kk0Var = kk0Var2;
                m1821xd59157b8(null, windowInsets, cVar4, rg3Var3, j17, j3, f3, oe1Var, kk0Var, 6 | ((i3 >> 12) & 112) | (i114 & 896) | (i114 & 7168) | (57344 & i114) | (458752 & i114) | (i114 & 3670016) | ((i3 << 3) & 29360128), 0);
                eVar3 = windowInsets;
                cVar5 = cVar4;
                rg3Var4 = rg3Var3;
                j4 = j17;
                j5 = j3;
                f4 = f3;
            } else {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i10 != 0) {
                        rg3Var2 = k43.a;
                    }
                    i7 = i2 & 4;
                    c01Var = c01.a;
                    if (i7 != 0) {
                        standardContainerColor = c01Var.getStandardContainerColor(kk0Var2, 6);
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(standardContainerColor, kk0Var2, (i3 >> 6) & 14);
                        i3 &= -7169;
                    }
                    if (i4 != 0) {
                        f2 = 0.0f;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        cVar4 = cVar3;
                        rg3Var3 = rg3Var2;
                        j3 = jM2x310ea166;
                        f3 = f2;
                        windowInsets = c01Var.getWindowInsets(kk0Var2, 6);
                    } else {
                        rg3Var3 = rg3Var2;
                        j3 = jM2x310ea166;
                        f3 = f2;
                        windowInsets = eVar2;
                        cVar4 = cVar3;
                    }
                } else {
                    if (i9 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i10 != 0) {
                        rg3Var2 = k43.a;
                    }
                    i7 = i2 & 4;
                    c01Var = c01.a;
                    if (i7 != 0) {
                        standardContainerColor = c01Var.getStandardContainerColor(kk0Var2, 6);
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(standardContainerColor, kk0Var2, (i3 >> 6) & 14);
                        i3 &= -7169;
                    }
                    if (i4 != 0) {
                        f2 = 0.0f;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        cVar4 = cVar3;
                        rg3Var3 = rg3Var2;
                        j3 = jM2x310ea166;
                        f3 = f2;
                        windowInsets = c01Var.getWindowInsets(kk0Var2, 6);
                    } else {
                        rg3Var3 = rg3Var2;
                        j3 = jM2x310ea166;
                        f3 = f2;
                        windowInsets = eVar2;
                        cVar4 = cVar3;
                    }
                }
                long j18 = standardContainerColor;
                kk0Var2.s();
                int i115 = i3 << 6;
                kk0Var = kk0Var2;
                m1821xd59157b8(null, windowInsets, cVar4, rg3Var3, j18, j3, f3, oe1Var, kk0Var, 6 | ((i3 >> 12) & 112) | (i115 & 896) | (i115 & 7168) | (57344 & i115) | (458752 & i115) | (i115 & 3670016) | ((i3 << 3) & 29360128), 0);
                eVar3 = windowInsets;
                cVar5 = cVar4;
                rg3Var4 = rg3Var3;
                j4 = j18;
                j5 = j3;
                f4 = f3;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new ej2(cVar5, rg3Var4, j4, j5, f4, eVar3, oe1Var, i, i2, 0));
            }
        }
        i3 |= 1572864;
        if ((599187 & i3) == 599186) {
            kk0Var2.X();
            if ((i & 1) != 0) {
                if (i9 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if (i10 != 0) {
                    rg3Var2 = k43.a;
                }
                i7 = i2 & 4;
                c01Var = c01.a;
                if (i7 != 0) {
                    standardContainerColor = c01Var.getStandardContainerColor(kk0Var2, 6);
                    i3 &= -897;
                }
                if ((i2 & 8) != 0) {
                    jM2x310ea166 = af0.m2x310ea166(standardContainerColor, kk0Var2, (i3 >> 6) & 14);
                    i3 &= -7169;
                }
                if (i4 != 0) {
                    f2 = 0.0f;
                }
                if ((i2 & 32) != 0) {
                    i3 &= -458753;
                    cVar4 = cVar3;
                    rg3Var3 = rg3Var2;
                    j3 = jM2x310ea166;
                    f3 = f2;
                    windowInsets = c01Var.getWindowInsets(kk0Var2, 6);
                } else {
                    rg3Var3 = rg3Var2;
                    j3 = jM2x310ea166;
                    f3 = f2;
                    windowInsets = eVar2;
                    cVar4 = cVar3;
                }
            } else {
                if (i9 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if (i10 != 0) {
                    rg3Var2 = k43.a;
                }
                i7 = i2 & 4;
                c01Var = c01.a;
                if (i7 != 0) {
                    standardContainerColor = c01Var.getStandardContainerColor(kk0Var2, 6);
                    i3 &= -897;
                }
                if ((i2 & 8) != 0) {
                    jM2x310ea166 = af0.m2x310ea166(standardContainerColor, kk0Var2, (i3 >> 6) & 14);
                    i3 &= -7169;
                }
                if (i4 != 0) {
                    f2 = 0.0f;
                }
                if ((i2 & 32) != 0) {
                    i3 &= -458753;
                    cVar4 = cVar3;
                    rg3Var3 = rg3Var2;
                    j3 = jM2x310ea166;
                    f3 = f2;
                    windowInsets = c01Var.getWindowInsets(kk0Var2, 6);
                } else {
                    rg3Var3 = rg3Var2;
                    j3 = jM2x310ea166;
                    f3 = f2;
                    windowInsets = eVar2;
                    cVar4 = cVar3;
                }
            }
            long j19 = standardContainerColor;
            kk0Var2.s();
            int i116 = i3 << 6;
            kk0Var = kk0Var2;
            m1821xd59157b8(null, windowInsets, cVar4, rg3Var3, j19, j3, f3, oe1Var, kk0Var, 6 | ((i3 >> 12) & 112) | (i116 & 896) | (i116 & 7168) | (57344 & i116) | (458752 & i116) | (i116 & 3670016) | ((i3 << 3) & 29360128), 0);
            eVar3 = windowInsets;
            cVar5 = cVar4;
            rg3Var4 = rg3Var3;
            j4 = j19;
            j5 = j3;
            f4 = f3;
        } else {
            kk0Var2.X();
            if ((i & 1) != 0) {
                if (i9 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if (i10 != 0) {
                    rg3Var2 = k43.a;
                }
                i7 = i2 & 4;
                c01Var = c01.a;
                if (i7 != 0) {
                    standardContainerColor = c01Var.getStandardContainerColor(kk0Var2, 6);
                    i3 &= -897;
                }
                if ((i2 & 8) != 0) {
                    jM2x310ea166 = af0.m2x310ea166(standardContainerColor, kk0Var2, (i3 >> 6) & 14);
                    i3 &= -7169;
                }
                if (i4 != 0) {
                    f2 = 0.0f;
                }
                if ((i2 & 32) != 0) {
                    i3 &= -458753;
                    cVar4 = cVar3;
                    rg3Var3 = rg3Var2;
                    j3 = jM2x310ea166;
                    f3 = f2;
                    windowInsets = c01Var.getWindowInsets(kk0Var2, 6);
                } else {
                    rg3Var3 = rg3Var2;
                    j3 = jM2x310ea166;
                    f3 = f2;
                    windowInsets = eVar2;
                    cVar4 = cVar3;
                }
            } else {
                if (i9 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if (i10 != 0) {
                    rg3Var2 = k43.a;
                }
                i7 = i2 & 4;
                c01Var = c01.a;
                if (i7 != 0) {
                    standardContainerColor = c01Var.getStandardContainerColor(kk0Var2, 6);
                    i3 &= -897;
                }
                if ((i2 & 8) != 0) {
                    jM2x310ea166 = af0.m2x310ea166(standardContainerColor, kk0Var2, (i3 >> 6) & 14);
                    i3 &= -7169;
                }
                if (i4 != 0) {
                    f2 = 0.0f;
                }
                if ((i2 & 32) != 0) {
                    i3 &= -458753;
                    cVar4 = cVar3;
                    rg3Var3 = rg3Var2;
                    j3 = jM2x310ea166;
                    f3 = f2;
                    windowInsets = c01Var.getWindowInsets(kk0Var2, 6);
                } else {
                    rg3Var3 = rg3Var2;
                    j3 = jM2x310ea166;
                    f3 = f2;
                    windowInsets = eVar2;
                    cVar4 = cVar3;
                }
            }
            long j110 = standardContainerColor;
            kk0Var2.s();
            int i117 = i3 << 6;
            kk0Var = kk0Var2;
            m1821xd59157b8(null, windowInsets, cVar4, rg3Var3, j110, j3, f3, oe1Var, kk0Var, 6 | ((i3 >> 12) & 112) | (i117 & 896) | (i117 & 7168) | (57344 & i117) | (458752 & i117) | (i117 & 3670016) | ((i3 << 3) & 29360128), 0);
            eVar3 = windowInsets;
            cVar5 = cVar4;
            rg3Var4 = rg3Var3;
            j4 = j110;
            j5 = j3;
            f4 = f3;
        }
        w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new ej2(cVar5, rg3Var4, j4, j5, f4, eVar3, oe1Var, i, i2, 0));
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0162  */
    /* JADX WARN: Code duplicated, block: B:102:0x0164  */
    /* JADX WARN: Code duplicated, block: B:105:0x018c  */
    /* JADX WARN: Code duplicated, block: B:107:0x0195  */
    /* JADX WARN: Code duplicated, block: B:108:0x0199  */
    /* JADX WARN: Code duplicated, block: B:111:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:113:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:116:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:118:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:124:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:126:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:129:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:130:0x0202  */
    /* JADX WARN: Code duplicated, block: B:133:0x020d  */
    /* JADX WARN: Code duplicated, block: B:135:0x021b  */
    /* JADX WARN: Code duplicated, block: B:138:0x022d  */
    /* JADX WARN: Code duplicated, block: B:140:0x0233  */
    /* JADX WARN: Code duplicated, block: B:146:0x0246  */
    /* JADX WARN: Code duplicated, block: B:150:0x024f  */
    /* JADX WARN: Code duplicated, block: B:153:0x027d  */
    /* JADX WARN: Code duplicated, block: B:154:0x0281  */
    /* JADX WARN: Code duplicated, block: B:157:0x028c  */
    /* JADX WARN: Code duplicated, block: B:159:0x029a  */
    /* JADX WARN: Code duplicated, block: B:162:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:163:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:166:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:168:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:172:0x0317  */
    /* JADX WARN: Code duplicated, block: B:174:0x0324  */
    /* JADX WARN: Code duplicated, block: B:176:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Code duplicated, block: B:28:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:31:0x0059  */
    /* JADX WARN: Code duplicated, block: B:34:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:39:0x006a  */
    /* JADX WARN: Code duplicated, block: B:41:0x006e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0076  */
    /* JADX WARN: Code duplicated, block: B:44:0x0079  */
    /* JADX WARN: Code duplicated, block: B:48:0x0080  */
    /* JADX WARN: Code duplicated, block: B:49:0x0083  */
    /* JADX WARN: Code duplicated, block: B:51:0x0087  */
    /* JADX WARN: Code duplicated, block: B:53:0x008d  */
    /* JADX WARN: Code duplicated, block: B:54:0x0090  */
    /* JADX WARN: Code duplicated, block: B:58:0x0099  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:83:0x0100  */
    /* JADX WARN: Code duplicated, block: B:87:0x010a  */
    /* JADX WARN: Code duplicated, block: B:89:0x0110 A[PHI: r24
  0x0110: PHI (r24v3 java.lang.Throwable) = (r24v1 java.lang.Throwable), (r24v4 java.lang.Throwable) binds: [B:88:0x010e, B:86:0x0107] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:90:0x0112  */
    /* JADX WARN: Code duplicated, block: B:93:0x011f  */
    /* JADX WARN: Code duplicated, block: B:95:0x0125  */
    /* JADX WARN: Code duplicated, block: B:98:0x013c  */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v25 */
    public static final void DismissibleNavigationDrawer(ne1 ne1Var, c cVar, h01 h01Var, boolean z, ne1 ne1Var2, ck0 ck0Var, int i, int i2) throws Throwable {
        int i3;
        c cVar2;
        h01 h01VarRememberDrawerState;
        int i4;
        boolean z2;
        int i5;
        int i6;
        Object objP;
        Object obj;
        mi2 mi2Var;
        wu0 wu0Var;
        int i7;
        int i8;
        Throwable th;
        boolean z3;
        boolean zH;
        Object objP2;
        Object obj2;
        Object objP3;
        gq0 gq0Var;
        String strM1830xa862b2cd;
        boolean z4;
        vb2 vb2VarC;
        int currentCompositeKeyHash;
        su2 su2VarN;
        c cVarD;
        d4 constructor;
        pe peVarH;
        boolean z5;
        Object objP4;
        Object obj3;
        int currentCompositeKeyHash2;
        d4 constructor2;
        pe peVarH2;
        boolean zH2;
        ?? r4;
        Object obj4;
        int currentCompositeKeyHash3;
        d4 constructor3;
        pe peVarH3;
        int currentCompositeKeyHash4;
        d4 constructor4;
        pe peVarH4;
        c cVar3;
        h01 h01Var2;
        boolean z6;
        w33 w33VarV;
        int i9;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(398812198);
        xk xkVar = kk0Var.a;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (kk0Var.j(ne1Var) ? 4 : 2) | i;
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
                    h01VarRememberDrawerState = h01Var;
                    if (kk0Var.h(h01VarRememberDrawerState)) {
                        i9 = 256;
                    }
                    i3 |= i9;
                } else {
                    h01VarRememberDrawerState = h01Var;
                }
                i9 = Uuid.SIZE_BITS;
                i3 |= i9;
            } else {
                h01VarRememberDrawerState = h01Var;
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
                    if (kk0Var.j(ne1Var2)) {
                        i6 = 16384;
                    } else {
                        i6 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                    }
                    i3 |= i6;
                }
                if ((i3 & 9363) == 9362 || !kk0Var.F()) {
                    kk0Var.X();
                    if ((i & 1) != 0 || kk0Var.D()) {
                        if (i10 != 0) {
                            cVar2 = c.i;
                        }
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                            h01VarRememberDrawerState = rememberDrawerState(i01.c, null, kk0Var, 6, 2);
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                    } else {
                        kk0Var.V();
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                        }
                    }
                    kk0Var.s();
                    objP = kk0Var.P();
                    obj = objP;
                    if (objP == Composer$Companion.getEmpty()) {
                        ft2 ft2VarD = cl3.d(Boolean.FALSE);
                        kk0Var.l0(ft2VarD);
                        obj = ft2VarD;
                    }
                    mi2Var = (mi2) obj;
                    wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                    i7 = (i3 & 896) ^ 384;
                    i8 = 0;
                    if (i7 > 256 || !kk0Var.h(h01VarRememberDrawerState)) {
                        th = null;
                        if ((i3 & 384) != 256) {
                            z3 = false;
                        }
                        zH = z3 | kk0Var.h(wu0Var);
                        objP2 = kk0Var.P();
                        if (zH || objP2 == Composer$Companion.getEmpty()) {
                            obj2 = objP2;
                            hj2 hj2Var = new hj2(h01VarRememberDrawerState, wu0Var, i8);
                            kk0Var.l0(hj2Var);
                            obj2 = hj2Var;
                        }
                        obj2 = objP2;
                        r11.SideEffect((je1) obj2, kk0Var, 0);
                        objP3 = kk0Var.P();
                        if (objP3 == Composer$Companion.getEmpty()) {
                            al0 al0Var = new al0(r11.a(x21.c, kk0Var));
                            kk0Var.l0(al0Var);
                            objP3 = al0Var;
                        }
                        gq0Var = ((al0) objP3).c;
                        strM1830xa862b2cd = uo3.m1830xa862b2cd(R.string.navigation_menu, kk0Var, 0);
                        if (kk0Var.l(CompositionLocalsKt.getLocalLayoutDirection()) == dx1.d) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        c cVarB = a.b(cVar2, h01VarRememberDrawerState.a, z2, z4);
                        vb2VarC = vw.c(Alignment$Companion.getTopStart(), false);
                        currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                        su2VarN = kk0Var.n();
                        cVarD = b.d(kk0Var, cVarB);
                        androidx.compose.ui.node.a.j.getClass();
                        constructor = ComposeUiNode$Companion.getConstructor();
                        if (xkVar != null) {
                            rj0.a();
                            throw th;
                        }
                        kk0Var.e0();
                        c cVar4 = cVar2;
                        if (kk0Var.O) {
                            kk0Var.m(constructor);
                        } else {
                            kk0Var.o0();
                        }
                        peVarH = fq2.h(kk0Var, vb2VarC, kk0Var, su2VarN);
                        if (kk0Var.O || !kr1.n(kk0Var.P(), Integer.valueOf(currentCompositeKeyHash))) {
                            fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                        }
                        xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
                        z5 = (i7 <= 256 && kk0Var.h(h01VarRememberDrawerState)) || (i3 & 384) == 256;
                        objP4 = kk0Var.P();
                        if (z5 || objP4 == Composer$Companion.getEmpty()) {
                            obj3 = objP4;
                            tc tcVar = new tc(h01VarRememberDrawerState, 1, mi2Var);
                            kk0Var.l0(tcVar);
                            obj3 = tcVar;
                        }
                        obj3 = objP4;
                        vb2 vb2Var = (vb2) obj3;
                        Modifier$Companion modifier$Companion = c.i;
                        currentCompositeKeyHash2 = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                        su2 su2VarN2 = kk0Var.n();
                        c cVarD2 = b.d(kk0Var, modifier$Companion);
                        constructor2 = ComposeUiNode$Companion.getConstructor();
                        kk0Var.e0();
                        if (kk0Var.O) {
                            kk0Var.m(constructor2);
                        } else {
                            kk0Var.o0();
                        }
                        peVarH2 = fq2.h(kk0Var, vb2Var, kk0Var, su2VarN2);
                        if (kk0Var.O || !kr1.n(kk0Var.P(), Integer.valueOf(currentCompositeKeyHash2))) {
                            fq2.v(currentCompositeKeyHash2, kk0Var, currentCompositeKeyHash2, peVarH2);
                        }
                        xp1.E(kk0Var, cVarD2, ComposeUiNode$Companion.getSetModifier());
                        zH2 = kk0Var.h(strM1830xa862b2cd) | ((i7 <= 256 && kk0Var.h(h01VarRememberDrawerState)) || (i3 & 384) == 256) | kk0Var.j(gq0Var);
                        Object objP5 = kk0Var.P();
                        if (!zH2 || objP5 == Composer$Companion.getEmpty()) {
                            r4 = 0;
                            jj2 jj2Var = new jj2(strM1830xa862b2cd, h01VarRememberDrawerState, gq0Var, false ? 1 : 0);
                            kk0Var.l0(jj2Var);
                            obj4 = jj2Var;
                        } else {
                            r4 = 0;
                            obj4 = objP5;
                        }
                        c cVarB2 = we3.b(modifier$Companion, r4, (le1) obj4);
                        vb2 vb2VarC2 = vw.c(Alignment$Companion.getTopStart(), r4);
                        currentCompositeKeyHash3 = rj0.getCurrentCompositeKeyHash(kk0Var, r4);
                        su2 su2VarN3 = kk0Var.n();
                        c cVarD3 = b.d(kk0Var, cVarB2);
                        constructor3 = ComposeUiNode$Companion.getConstructor();
                        kk0Var.e0();
                        if (kk0Var.O) {
                            kk0Var.m(constructor3);
                        } else {
                            kk0Var.o0();
                        }
                        peVarH3 = fq2.h(kk0Var, vb2VarC2, kk0Var, su2VarN3);
                        if (kk0Var.O || !kr1.n(kk0Var.P(), Integer.valueOf(currentCompositeKeyHash3))) {
                            fq2.v(currentCompositeKeyHash3, kk0Var, currentCompositeKeyHash3, peVarH3);
                        }
                        xp1.E(kk0Var, cVarD3, ComposeUiNode$Companion.getSetModifier());
                        ne1Var.invoke(kk0Var, Integer.valueOf(i3 & 14));
                        kk0Var.r(true);
                        vb2 vb2VarC3 = vw.c(Alignment$Companion.getTopStart(), false);
                        currentCompositeKeyHash4 = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                        su2 su2VarN4 = kk0Var.n();
                        c cVarD4 = b.d(kk0Var, modifier$Companion);
                        constructor4 = ComposeUiNode$Companion.getConstructor();
                        kk0Var.e0();
                        if (kk0Var.O) {
                            kk0Var.m(constructor4);
                        } else {
                            kk0Var.o0();
                        }
                        peVarH4 = fq2.h(kk0Var, vb2VarC3, kk0Var, su2VarN4);
                        if (kk0Var.O || !kr1.n(kk0Var.P(), Integer.valueOf(currentCompositeKeyHash4))) {
                            fq2.v(currentCompositeKeyHash4, kk0Var, currentCompositeKeyHash4, peVarH4);
                        }
                        xp1.E(kk0Var, cVarD4, ComposeUiNode$Companion.getSetModifier());
                        ne1Var2.invoke(kk0Var, Integer.valueOf((i3 >> 12) & 14));
                        kk0Var.r(true);
                        kk0Var.r(true);
                        kk0Var.r(true);
                        cVar3 = cVar4;
                    } else {
                        th = null;
                    }
                    z3 = true;
                    zH = z3 | kk0Var.h(wu0Var);
                    objP2 = kk0Var.P();
                    if (zH) {
                        obj2 = objP2;
                        hj2 hj2Var2 = new hj2(h01VarRememberDrawerState, wu0Var, i8);
                        kk0Var.l0(hj2Var2);
                        obj2 = hj2Var2;
                    } else {
                        obj2 = objP2;
                        hj2 hj2Var3 = new hj2(h01VarRememberDrawerState, wu0Var, i8);
                        kk0Var.l0(hj2Var3);
                        obj2 = hj2Var3;
                    }
                    obj2 = objP2;
                    r11.SideEffect((je1) obj2, kk0Var, 0);
                    objP3 = kk0Var.P();
                    if (objP3 == Composer$Companion.getEmpty()) {
                        al0 al0Var2 = new al0(r11.a(x21.c, kk0Var));
                        kk0Var.l0(al0Var2);
                        objP3 = al0Var2;
                    }
                    gq0Var = ((al0) objP3).c;
                    strM1830xa862b2cd = uo3.m1830xa862b2cd(R.string.navigation_menu, kk0Var, 0);
                    if (kk0Var.l(CompositionLocalsKt.getLocalLayoutDirection()) == dx1.d) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    c cVarB3 = a.b(cVar2, h01VarRememberDrawerState.a, z2, z4);
                    vb2VarC = vw.c(Alignment$Companion.getTopStart(), false);
                    currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                    su2VarN = kk0Var.n();
                    cVarD = b.d(kk0Var, cVarB3);
                    androidx.compose.ui.node.a.j.getClass();
                    constructor = ComposeUiNode$Companion.getConstructor();
                    if (xkVar != null) {
                        rj0.a();
                        throw th;
                    }
                    kk0Var.e0();
                    c cVar5 = cVar2;
                    if (kk0Var.O) {
                        kk0Var.m(constructor);
                    } else {
                        kk0Var.o0();
                    }
                    peVarH = fq2.h(kk0Var, vb2VarC, kk0Var, su2VarN);
                    if (kk0Var.O) {
                        fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                    } else {
                        fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                    }
                    xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
                    if (i7 <= 256) {
                    }
                    objP4 = kk0Var.P();
                    if (z5) {
                        obj3 = objP4;
                        tc tcVar2 = new tc(h01VarRememberDrawerState, 1, mi2Var);
                        kk0Var.l0(tcVar2);
                        obj3 = tcVar2;
                    } else {
                        obj3 = objP4;
                        tc tcVar3 = new tc(h01VarRememberDrawerState, 1, mi2Var);
                        kk0Var.l0(tcVar3);
                        obj3 = tcVar3;
                    }
                    obj3 = objP4;
                    vb2 vb2Var2 = (vb2) obj3;
                    Modifier$Companion modifier$Companion2 = c.i;
                    currentCompositeKeyHash2 = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                    su2 su2VarN5 = kk0Var.n();
                    c cVarD5 = b.d(kk0Var, modifier$Companion2);
                    constructor2 = ComposeUiNode$Companion.getConstructor();
                    kk0Var.e0();
                    if (kk0Var.O) {
                        kk0Var.m(constructor2);
                    } else {
                        kk0Var.o0();
                    }
                    peVarH2 = fq2.h(kk0Var, vb2Var2, kk0Var, su2VarN5);
                    if (kk0Var.O) {
                        fq2.v(currentCompositeKeyHash2, kk0Var, currentCompositeKeyHash2, peVarH2);
                    } else {
                        fq2.v(currentCompositeKeyHash2, kk0Var, currentCompositeKeyHash2, peVarH2);
                    }
                    xp1.E(kk0Var, cVarD5, ComposeUiNode$Companion.getSetModifier());
                    zH2 = kk0Var.h(strM1830xa862b2cd) | ((i7 <= 256 && kk0Var.h(h01VarRememberDrawerState)) || (i3 & 384) == 256) | kk0Var.j(gq0Var);
                    Object objP6 = kk0Var.P();
                    if (zH2) {
                        r4 = 0;
                        jj2 jj2Var2 = new jj2(strM1830xa862b2cd, h01VarRememberDrawerState, gq0Var, false ? 1 : 0);
                        kk0Var.l0(jj2Var2);
                        obj4 = jj2Var2;
                    } else {
                        r4 = 0;
                        jj2 jj2Var3 = new jj2(strM1830xa862b2cd, h01VarRememberDrawerState, gq0Var, false ? 1 : 0);
                        kk0Var.l0(jj2Var3);
                        obj4 = jj2Var3;
                    }
                    c cVarB4 = we3.b(modifier$Companion2, r4, (le1) obj4);
                    vb2 vb2VarC4 = vw.c(Alignment$Companion.getTopStart(), r4);
                    currentCompositeKeyHash3 = rj0.getCurrentCompositeKeyHash(kk0Var, r4);
                    su2 su2VarN6 = kk0Var.n();
                    c cVarD6 = b.d(kk0Var, cVarB4);
                    constructor3 = ComposeUiNode$Companion.getConstructor();
                    kk0Var.e0();
                    if (kk0Var.O) {
                        kk0Var.m(constructor3);
                    } else {
                        kk0Var.o0();
                    }
                    peVarH3 = fq2.h(kk0Var, vb2VarC4, kk0Var, su2VarN6);
                    if (kk0Var.O) {
                        fq2.v(currentCompositeKeyHash3, kk0Var, currentCompositeKeyHash3, peVarH3);
                    } else {
                        fq2.v(currentCompositeKeyHash3, kk0Var, currentCompositeKeyHash3, peVarH3);
                    }
                    xp1.E(kk0Var, cVarD6, ComposeUiNode$Companion.getSetModifier());
                    ne1Var.invoke(kk0Var, Integer.valueOf(i3 & 14));
                    kk0Var.r(true);
                    vb2 vb2VarC5 = vw.c(Alignment$Companion.getTopStart(), false);
                    currentCompositeKeyHash4 = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                    su2 su2VarN7 = kk0Var.n();
                    c cVarD7 = b.d(kk0Var, modifier$Companion2);
                    constructor4 = ComposeUiNode$Companion.getConstructor();
                    kk0Var.e0();
                    if (kk0Var.O) {
                        kk0Var.m(constructor4);
                    } else {
                        kk0Var.o0();
                    }
                    peVarH4 = fq2.h(kk0Var, vb2VarC5, kk0Var, su2VarN7);
                    if (kk0Var.O) {
                        fq2.v(currentCompositeKeyHash4, kk0Var, currentCompositeKeyHash4, peVarH4);
                    } else {
                        fq2.v(currentCompositeKeyHash4, kk0Var, currentCompositeKeyHash4, peVarH4);
                    }
                    xp1.E(kk0Var, cVarD7, ComposeUiNode$Companion.getSetModifier());
                    ne1Var2.invoke(kk0Var, Integer.valueOf((i3 >> 12) & 14));
                    kk0Var.r(true);
                    kk0Var.r(true);
                    kk0Var.r(true);
                    cVar3 = cVar5;
                } else {
                    kk0Var.V();
                    cVar3 = cVar2;
                }
                h01Var2 = h01VarRememberDrawerState;
                z6 = z2;
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new lj2(ne1Var, cVar3, h01Var2, z6, ne1Var2, i, i2));
                }
            }
            i3 |= 3072;
            z2 = z;
            if ((i2 & 16) != 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                if (kk0Var.j(ne1Var2)) {
                    i6 = 16384;
                } else {
                    i6 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                }
                i3 |= i6;
            }
            if ((i3 & 9363) == 9362) {
                kk0Var.X();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        cVar2 = c.i;
                    }
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                        h01VarRememberDrawerState = rememberDrawerState(i01.c, null, kk0Var, 6, 2);
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                } else {
                    if (i10 != 0) {
                        cVar2 = c.i;
                    }
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                        h01VarRememberDrawerState = rememberDrawerState(i01.c, null, kk0Var, 6, 2);
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                }
                kk0Var.s();
                objP = kk0Var.P();
                obj = objP;
                if (objP == Composer$Companion.getEmpty()) {
                    ft2 ft2VarD2 = cl3.d(Boolean.FALSE);
                    kk0Var.l0(ft2VarD2);
                    obj = ft2VarD2;
                }
                mi2Var = (mi2) obj;
                wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                i7 = (i3 & 896) ^ 384;
                i8 = 0;
                if (i7 > 256) {
                    th = null;
                    if ((i3 & 384) != 256) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                } else {
                    th = null;
                    if ((i3 & 384) != 256) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                }
                zH = z3 | kk0Var.h(wu0Var);
                objP2 = kk0Var.P();
                if (zH) {
                    obj2 = objP2;
                    hj2 hj2Var4 = new hj2(h01VarRememberDrawerState, wu0Var, i8);
                    kk0Var.l0(hj2Var4);
                    obj2 = hj2Var4;
                } else {
                    obj2 = objP2;
                    hj2 hj2Var5 = new hj2(h01VarRememberDrawerState, wu0Var, i8);
                    kk0Var.l0(hj2Var5);
                    obj2 = hj2Var5;
                }
                obj2 = objP2;
                r11.SideEffect((je1) obj2, kk0Var, 0);
                objP3 = kk0Var.P();
                if (objP3 == Composer$Companion.getEmpty()) {
                    al0 al0Var3 = new al0(r11.a(x21.c, kk0Var));
                    kk0Var.l0(al0Var3);
                    objP3 = al0Var3;
                }
                gq0Var = ((al0) objP3).c;
                strM1830xa862b2cd = uo3.m1830xa862b2cd(R.string.navigation_menu, kk0Var, 0);
                if (kk0Var.l(CompositionLocalsKt.getLocalLayoutDirection()) == dx1.d) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                c cVarB5 = a.b(cVar2, h01VarRememberDrawerState.a, z2, z4);
                vb2VarC = vw.c(Alignment$Companion.getTopStart(), false);
                currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                su2VarN = kk0Var.n();
                cVarD = b.d(kk0Var, cVarB5);
                androidx.compose.ui.node.a.j.getClass();
                constructor = ComposeUiNode$Companion.getConstructor();
                if (xkVar != null) {
                    rj0.a();
                    throw th;
                }
                kk0Var.e0();
                c cVar6 = cVar2;
                if (kk0Var.O) {
                    kk0Var.m(constructor);
                } else {
                    kk0Var.o0();
                }
                peVarH = fq2.h(kk0Var, vb2VarC, kk0Var, su2VarN);
                if (kk0Var.O) {
                    fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                } else {
                    fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                }
                xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
                if (i7 <= 256) {
                }
                objP4 = kk0Var.P();
                if (z5) {
                    obj3 = objP4;
                    tc tcVar4 = new tc(h01VarRememberDrawerState, 1, mi2Var);
                    kk0Var.l0(tcVar4);
                    obj3 = tcVar4;
                } else {
                    obj3 = objP4;
                    tc tcVar5 = new tc(h01VarRememberDrawerState, 1, mi2Var);
                    kk0Var.l0(tcVar5);
                    obj3 = tcVar5;
                }
                obj3 = objP4;
                vb2 vb2Var3 = (vb2) obj3;
                Modifier$Companion modifier$Companion3 = c.i;
                currentCompositeKeyHash2 = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                su2 su2VarN8 = kk0Var.n();
                c cVarD8 = b.d(kk0Var, modifier$Companion3);
                constructor2 = ComposeUiNode$Companion.getConstructor();
                kk0Var.e0();
                if (kk0Var.O) {
                    kk0Var.m(constructor2);
                } else {
                    kk0Var.o0();
                }
                peVarH2 = fq2.h(kk0Var, vb2Var3, kk0Var, su2VarN8);
                if (kk0Var.O) {
                    fq2.v(currentCompositeKeyHash2, kk0Var, currentCompositeKeyHash2, peVarH2);
                } else {
                    fq2.v(currentCompositeKeyHash2, kk0Var, currentCompositeKeyHash2, peVarH2);
                }
                xp1.E(kk0Var, cVarD8, ComposeUiNode$Companion.getSetModifier());
                zH2 = kk0Var.h(strM1830xa862b2cd) | ((i7 <= 256 && kk0Var.h(h01VarRememberDrawerState)) || (i3 & 384) == 256) | kk0Var.j(gq0Var);
                Object objP7 = kk0Var.P();
                if (zH2) {
                    r4 = 0;
                    jj2 jj2Var4 = new jj2(strM1830xa862b2cd, h01VarRememberDrawerState, gq0Var, false ? 1 : 0);
                    kk0Var.l0(jj2Var4);
                    obj4 = jj2Var4;
                } else {
                    r4 = 0;
                    jj2 jj2Var5 = new jj2(strM1830xa862b2cd, h01VarRememberDrawerState, gq0Var, false ? 1 : 0);
                    kk0Var.l0(jj2Var5);
                    obj4 = jj2Var5;
                }
                c cVarB6 = we3.b(modifier$Companion3, r4, (le1) obj4);
                vb2 vb2VarC6 = vw.c(Alignment$Companion.getTopStart(), r4);
                currentCompositeKeyHash3 = rj0.getCurrentCompositeKeyHash(kk0Var, r4);
                su2 su2VarN9 = kk0Var.n();
                c cVarD9 = b.d(kk0Var, cVarB6);
                constructor3 = ComposeUiNode$Companion.getConstructor();
                kk0Var.e0();
                if (kk0Var.O) {
                    kk0Var.m(constructor3);
                } else {
                    kk0Var.o0();
                }
                peVarH3 = fq2.h(kk0Var, vb2VarC6, kk0Var, su2VarN9);
                if (kk0Var.O) {
                    fq2.v(currentCompositeKeyHash3, kk0Var, currentCompositeKeyHash3, peVarH3);
                } else {
                    fq2.v(currentCompositeKeyHash3, kk0Var, currentCompositeKeyHash3, peVarH3);
                }
                xp1.E(kk0Var, cVarD9, ComposeUiNode$Companion.getSetModifier());
                ne1Var.invoke(kk0Var, Integer.valueOf(i3 & 14));
                kk0Var.r(true);
                vb2 vb2VarC7 = vw.c(Alignment$Companion.getTopStart(), false);
                currentCompositeKeyHash4 = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                su2 su2VarN10 = kk0Var.n();
                c cVarD10 = b.d(kk0Var, modifier$Companion3);
                constructor4 = ComposeUiNode$Companion.getConstructor();
                kk0Var.e0();
                if (kk0Var.O) {
                    kk0Var.m(constructor4);
                } else {
                    kk0Var.o0();
                }
                peVarH4 = fq2.h(kk0Var, vb2VarC7, kk0Var, su2VarN10);
                if (kk0Var.O) {
                    fq2.v(currentCompositeKeyHash4, kk0Var, currentCompositeKeyHash4, peVarH4);
                } else {
                    fq2.v(currentCompositeKeyHash4, kk0Var, currentCompositeKeyHash4, peVarH4);
                }
                xp1.E(kk0Var, cVarD10, ComposeUiNode$Companion.getSetModifier());
                ne1Var2.invoke(kk0Var, Integer.valueOf((i3 >> 12) & 14));
                kk0Var.r(true);
                kk0Var.r(true);
                kk0Var.r(true);
                cVar3 = cVar6;
            } else {
                kk0Var.X();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        cVar2 = c.i;
                    }
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                        h01VarRememberDrawerState = rememberDrawerState(i01.c, null, kk0Var, 6, 2);
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                } else {
                    if (i10 != 0) {
                        cVar2 = c.i;
                    }
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                        h01VarRememberDrawerState = rememberDrawerState(i01.c, null, kk0Var, 6, 2);
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                }
                kk0Var.s();
                objP = kk0Var.P();
                obj = objP;
                if (objP == Composer$Companion.getEmpty()) {
                    ft2 ft2VarD3 = cl3.d(Boolean.FALSE);
                    kk0Var.l0(ft2VarD3);
                    obj = ft2VarD3;
                }
                mi2Var = (mi2) obj;
                wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                i7 = (i3 & 896) ^ 384;
                i8 = 0;
                if (i7 > 256) {
                    th = null;
                    if ((i3 & 384) != 256) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                } else {
                    th = null;
                    if ((i3 & 384) != 256) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                }
                zH = z3 | kk0Var.h(wu0Var);
                objP2 = kk0Var.P();
                if (zH) {
                    obj2 = objP2;
                    hj2 hj2Var6 = new hj2(h01VarRememberDrawerState, wu0Var, i8);
                    kk0Var.l0(hj2Var6);
                    obj2 = hj2Var6;
                } else {
                    obj2 = objP2;
                    hj2 hj2Var7 = new hj2(h01VarRememberDrawerState, wu0Var, i8);
                    kk0Var.l0(hj2Var7);
                    obj2 = hj2Var7;
                }
                obj2 = objP2;
                r11.SideEffect((je1) obj2, kk0Var, 0);
                objP3 = kk0Var.P();
                if (objP3 == Composer$Companion.getEmpty()) {
                    al0 al0Var4 = new al0(r11.a(x21.c, kk0Var));
                    kk0Var.l0(al0Var4);
                    objP3 = al0Var4;
                }
                gq0Var = ((al0) objP3).c;
                strM1830xa862b2cd = uo3.m1830xa862b2cd(R.string.navigation_menu, kk0Var, 0);
                if (kk0Var.l(CompositionLocalsKt.getLocalLayoutDirection()) == dx1.d) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                c cVarB7 = a.b(cVar2, h01VarRememberDrawerState.a, z2, z4);
                vb2VarC = vw.c(Alignment$Companion.getTopStart(), false);
                currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                su2VarN = kk0Var.n();
                cVarD = b.d(kk0Var, cVarB7);
                androidx.compose.ui.node.a.j.getClass();
                constructor = ComposeUiNode$Companion.getConstructor();
                if (xkVar != null) {
                    rj0.a();
                    throw th;
                }
                kk0Var.e0();
                c cVar7 = cVar2;
                if (kk0Var.O) {
                    kk0Var.m(constructor);
                } else {
                    kk0Var.o0();
                }
                peVarH = fq2.h(kk0Var, vb2VarC, kk0Var, su2VarN);
                if (kk0Var.O) {
                    fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                } else {
                    fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                }
                xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
                if (i7 <= 256) {
                }
                objP4 = kk0Var.P();
                if (z5) {
                    obj3 = objP4;
                    tc tcVar6 = new tc(h01VarRememberDrawerState, 1, mi2Var);
                    kk0Var.l0(tcVar6);
                    obj3 = tcVar6;
                } else {
                    obj3 = objP4;
                    tc tcVar7 = new tc(h01VarRememberDrawerState, 1, mi2Var);
                    kk0Var.l0(tcVar7);
                    obj3 = tcVar7;
                }
                obj3 = objP4;
                vb2 vb2Var4 = (vb2) obj3;
                Modifier$Companion modifier$Companion4 = c.i;
                currentCompositeKeyHash2 = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                su2 su2VarN11 = kk0Var.n();
                c cVarD11 = b.d(kk0Var, modifier$Companion4);
                constructor2 = ComposeUiNode$Companion.getConstructor();
                kk0Var.e0();
                if (kk0Var.O) {
                    kk0Var.m(constructor2);
                } else {
                    kk0Var.o0();
                }
                peVarH2 = fq2.h(kk0Var, vb2Var4, kk0Var, su2VarN11);
                if (kk0Var.O) {
                    fq2.v(currentCompositeKeyHash2, kk0Var, currentCompositeKeyHash2, peVarH2);
                } else {
                    fq2.v(currentCompositeKeyHash2, kk0Var, currentCompositeKeyHash2, peVarH2);
                }
                xp1.E(kk0Var, cVarD11, ComposeUiNode$Companion.getSetModifier());
                zH2 = kk0Var.h(strM1830xa862b2cd) | ((i7 <= 256 && kk0Var.h(h01VarRememberDrawerState)) || (i3 & 384) == 256) | kk0Var.j(gq0Var);
                Object objP8 = kk0Var.P();
                if (zH2) {
                    r4 = 0;
                    jj2 jj2Var6 = new jj2(strM1830xa862b2cd, h01VarRememberDrawerState, gq0Var, false ? 1 : 0);
                    kk0Var.l0(jj2Var6);
                    obj4 = jj2Var6;
                } else {
                    r4 = 0;
                    jj2 jj2Var7 = new jj2(strM1830xa862b2cd, h01VarRememberDrawerState, gq0Var, false ? 1 : 0);
                    kk0Var.l0(jj2Var7);
                    obj4 = jj2Var7;
                }
                c cVarB8 = we3.b(modifier$Companion4, r4, (le1) obj4);
                vb2 vb2VarC8 = vw.c(Alignment$Companion.getTopStart(), r4);
                currentCompositeKeyHash3 = rj0.getCurrentCompositeKeyHash(kk0Var, r4);
                su2 su2VarN12 = kk0Var.n();
                c cVarD12 = b.d(kk0Var, cVarB8);
                constructor3 = ComposeUiNode$Companion.getConstructor();
                kk0Var.e0();
                if (kk0Var.O) {
                    kk0Var.m(constructor3);
                } else {
                    kk0Var.o0();
                }
                peVarH3 = fq2.h(kk0Var, vb2VarC8, kk0Var, su2VarN12);
                if (kk0Var.O) {
                    fq2.v(currentCompositeKeyHash3, kk0Var, currentCompositeKeyHash3, peVarH3);
                } else {
                    fq2.v(currentCompositeKeyHash3, kk0Var, currentCompositeKeyHash3, peVarH3);
                }
                xp1.E(kk0Var, cVarD12, ComposeUiNode$Companion.getSetModifier());
                ne1Var.invoke(kk0Var, Integer.valueOf(i3 & 14));
                kk0Var.r(true);
                vb2 vb2VarC9 = vw.c(Alignment$Companion.getTopStart(), false);
                currentCompositeKeyHash4 = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                su2 su2VarN13 = kk0Var.n();
                c cVarD13 = b.d(kk0Var, modifier$Companion4);
                constructor4 = ComposeUiNode$Companion.getConstructor();
                kk0Var.e0();
                if (kk0Var.O) {
                    kk0Var.m(constructor4);
                } else {
                    kk0Var.o0();
                }
                peVarH4 = fq2.h(kk0Var, vb2VarC9, kk0Var, su2VarN13);
                if (kk0Var.O) {
                    fq2.v(currentCompositeKeyHash4, kk0Var, currentCompositeKeyHash4, peVarH4);
                } else {
                    fq2.v(currentCompositeKeyHash4, kk0Var, currentCompositeKeyHash4, peVarH4);
                }
                xp1.E(kk0Var, cVarD13, ComposeUiNode$Companion.getSetModifier());
                ne1Var2.invoke(kk0Var, Integer.valueOf((i3 >> 12) & 14));
                kk0Var.r(true);
                kk0Var.r(true);
                kk0Var.r(true);
                cVar3 = cVar7;
            }
            h01Var2 = h01VarRememberDrawerState;
            z6 = z2;
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new lj2(ne1Var, cVar3, h01Var2, z6, ne1Var2, i, i2));
            }
        }
        i3 |= 48;
        cVar2 = cVar;
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                h01VarRememberDrawerState = h01Var;
                if (kk0Var.h(h01VarRememberDrawerState)) {
                    i9 = 256;
                }
                i3 |= i9;
            } else {
                h01VarRememberDrawerState = h01Var;
            }
            i9 = Uuid.SIZE_BITS;
            i3 |= i9;
        } else {
            h01VarRememberDrawerState = h01Var;
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
                if (kk0Var.j(ne1Var2)) {
                    i6 = 16384;
                } else {
                    i6 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                }
                i3 |= i6;
            }
            if ((i3 & 9363) == 9362) {
                kk0Var.X();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        cVar2 = c.i;
                    }
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                        h01VarRememberDrawerState = rememberDrawerState(i01.c, null, kk0Var, 6, 2);
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                } else {
                    if (i10 != 0) {
                        cVar2 = c.i;
                    }
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                        h01VarRememberDrawerState = rememberDrawerState(i01.c, null, kk0Var, 6, 2);
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                }
                kk0Var.s();
                objP = kk0Var.P();
                obj = objP;
                if (objP == Composer$Companion.getEmpty()) {
                    ft2 ft2VarD4 = cl3.d(Boolean.FALSE);
                    kk0Var.l0(ft2VarD4);
                    obj = ft2VarD4;
                }
                mi2Var = (mi2) obj;
                wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                i7 = (i3 & 896) ^ 384;
                i8 = 0;
                if (i7 > 256) {
                    th = null;
                    if ((i3 & 384) != 256) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                } else {
                    th = null;
                    if ((i3 & 384) != 256) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                }
                zH = z3 | kk0Var.h(wu0Var);
                objP2 = kk0Var.P();
                if (zH) {
                    obj2 = objP2;
                    hj2 hj2Var8 = new hj2(h01VarRememberDrawerState, wu0Var, i8);
                    kk0Var.l0(hj2Var8);
                    obj2 = hj2Var8;
                } else {
                    obj2 = objP2;
                    hj2 hj2Var9 = new hj2(h01VarRememberDrawerState, wu0Var, i8);
                    kk0Var.l0(hj2Var9);
                    obj2 = hj2Var9;
                }
                obj2 = objP2;
                r11.SideEffect((je1) obj2, kk0Var, 0);
                objP3 = kk0Var.P();
                if (objP3 == Composer$Companion.getEmpty()) {
                    al0 al0Var5 = new al0(r11.a(x21.c, kk0Var));
                    kk0Var.l0(al0Var5);
                    objP3 = al0Var5;
                }
                gq0Var = ((al0) objP3).c;
                strM1830xa862b2cd = uo3.m1830xa862b2cd(R.string.navigation_menu, kk0Var, 0);
                if (kk0Var.l(CompositionLocalsKt.getLocalLayoutDirection()) == dx1.d) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                c cVarB9 = a.b(cVar2, h01VarRememberDrawerState.a, z2, z4);
                vb2VarC = vw.c(Alignment$Companion.getTopStart(), false);
                currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                su2VarN = kk0Var.n();
                cVarD = b.d(kk0Var, cVarB9);
                androidx.compose.ui.node.a.j.getClass();
                constructor = ComposeUiNode$Companion.getConstructor();
                if (xkVar != null) {
                    rj0.a();
                    throw th;
                }
                kk0Var.e0();
                c cVar8 = cVar2;
                if (kk0Var.O) {
                    kk0Var.m(constructor);
                } else {
                    kk0Var.o0();
                }
                peVarH = fq2.h(kk0Var, vb2VarC, kk0Var, su2VarN);
                if (kk0Var.O) {
                    fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                } else {
                    fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                }
                xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
                if (i7 <= 256) {
                }
                objP4 = kk0Var.P();
                if (z5) {
                    obj3 = objP4;
                    tc tcVar8 = new tc(h01VarRememberDrawerState, 1, mi2Var);
                    kk0Var.l0(tcVar8);
                    obj3 = tcVar8;
                } else {
                    obj3 = objP4;
                    tc tcVar9 = new tc(h01VarRememberDrawerState, 1, mi2Var);
                    kk0Var.l0(tcVar9);
                    obj3 = tcVar9;
                }
                obj3 = objP4;
                vb2 vb2Var5 = (vb2) obj3;
                Modifier$Companion modifier$Companion5 = c.i;
                currentCompositeKeyHash2 = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                su2 su2VarN14 = kk0Var.n();
                c cVarD14 = b.d(kk0Var, modifier$Companion5);
                constructor2 = ComposeUiNode$Companion.getConstructor();
                kk0Var.e0();
                if (kk0Var.O) {
                    kk0Var.m(constructor2);
                } else {
                    kk0Var.o0();
                }
                peVarH2 = fq2.h(kk0Var, vb2Var5, kk0Var, su2VarN14);
                if (kk0Var.O) {
                    fq2.v(currentCompositeKeyHash2, kk0Var, currentCompositeKeyHash2, peVarH2);
                } else {
                    fq2.v(currentCompositeKeyHash2, kk0Var, currentCompositeKeyHash2, peVarH2);
                }
                xp1.E(kk0Var, cVarD14, ComposeUiNode$Companion.getSetModifier());
                zH2 = kk0Var.h(strM1830xa862b2cd) | ((i7 <= 256 && kk0Var.h(h01VarRememberDrawerState)) || (i3 & 384) == 256) | kk0Var.j(gq0Var);
                Object objP9 = kk0Var.P();
                if (zH2) {
                    r4 = 0;
                    jj2 jj2Var8 = new jj2(strM1830xa862b2cd, h01VarRememberDrawerState, gq0Var, false ? 1 : 0);
                    kk0Var.l0(jj2Var8);
                    obj4 = jj2Var8;
                } else {
                    r4 = 0;
                    jj2 jj2Var9 = new jj2(strM1830xa862b2cd, h01VarRememberDrawerState, gq0Var, false ? 1 : 0);
                    kk0Var.l0(jj2Var9);
                    obj4 = jj2Var9;
                }
                c cVarB10 = we3.b(modifier$Companion5, r4, (le1) obj4);
                vb2 vb2VarC10 = vw.c(Alignment$Companion.getTopStart(), r4);
                currentCompositeKeyHash3 = rj0.getCurrentCompositeKeyHash(kk0Var, r4);
                su2 su2VarN15 = kk0Var.n();
                c cVarD15 = b.d(kk0Var, cVarB10);
                constructor3 = ComposeUiNode$Companion.getConstructor();
                kk0Var.e0();
                if (kk0Var.O) {
                    kk0Var.m(constructor3);
                } else {
                    kk0Var.o0();
                }
                peVarH3 = fq2.h(kk0Var, vb2VarC10, kk0Var, su2VarN15);
                if (kk0Var.O) {
                    fq2.v(currentCompositeKeyHash3, kk0Var, currentCompositeKeyHash3, peVarH3);
                } else {
                    fq2.v(currentCompositeKeyHash3, kk0Var, currentCompositeKeyHash3, peVarH3);
                }
                xp1.E(kk0Var, cVarD15, ComposeUiNode$Companion.getSetModifier());
                ne1Var.invoke(kk0Var, Integer.valueOf(i3 & 14));
                kk0Var.r(true);
                vb2 vb2VarC11 = vw.c(Alignment$Companion.getTopStart(), false);
                currentCompositeKeyHash4 = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                su2 su2VarN16 = kk0Var.n();
                c cVarD16 = b.d(kk0Var, modifier$Companion5);
                constructor4 = ComposeUiNode$Companion.getConstructor();
                kk0Var.e0();
                if (kk0Var.O) {
                    kk0Var.m(constructor4);
                } else {
                    kk0Var.o0();
                }
                peVarH4 = fq2.h(kk0Var, vb2VarC11, kk0Var, su2VarN16);
                if (kk0Var.O) {
                    fq2.v(currentCompositeKeyHash4, kk0Var, currentCompositeKeyHash4, peVarH4);
                } else {
                    fq2.v(currentCompositeKeyHash4, kk0Var, currentCompositeKeyHash4, peVarH4);
                }
                xp1.E(kk0Var, cVarD16, ComposeUiNode$Companion.getSetModifier());
                ne1Var2.invoke(kk0Var, Integer.valueOf((i3 >> 12) & 14));
                kk0Var.r(true);
                kk0Var.r(true);
                kk0Var.r(true);
                cVar3 = cVar8;
            } else {
                kk0Var.X();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        cVar2 = c.i;
                    }
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                        h01VarRememberDrawerState = rememberDrawerState(i01.c, null, kk0Var, 6, 2);
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                } else {
                    if (i10 != 0) {
                        cVar2 = c.i;
                    }
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                        h01VarRememberDrawerState = rememberDrawerState(i01.c, null, kk0Var, 6, 2);
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                }
                kk0Var.s();
                objP = kk0Var.P();
                obj = objP;
                if (objP == Composer$Companion.getEmpty()) {
                    ft2 ft2VarD5 = cl3.d(Boolean.FALSE);
                    kk0Var.l0(ft2VarD5);
                    obj = ft2VarD5;
                }
                mi2Var = (mi2) obj;
                wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                i7 = (i3 & 896) ^ 384;
                i8 = 0;
                if (i7 > 256) {
                    th = null;
                    if ((i3 & 384) != 256) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                } else {
                    th = null;
                    if ((i3 & 384) != 256) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                }
                zH = z3 | kk0Var.h(wu0Var);
                objP2 = kk0Var.P();
                if (zH) {
                    obj2 = objP2;
                    hj2 hj2Var10 = new hj2(h01VarRememberDrawerState, wu0Var, i8);
                    kk0Var.l0(hj2Var10);
                    obj2 = hj2Var10;
                } else {
                    obj2 = objP2;
                    hj2 hj2Var11 = new hj2(h01VarRememberDrawerState, wu0Var, i8);
                    kk0Var.l0(hj2Var11);
                    obj2 = hj2Var11;
                }
                obj2 = objP2;
                r11.SideEffect((je1) obj2, kk0Var, 0);
                objP3 = kk0Var.P();
                if (objP3 == Composer$Companion.getEmpty()) {
                    al0 al0Var6 = new al0(r11.a(x21.c, kk0Var));
                    kk0Var.l0(al0Var6);
                    objP3 = al0Var6;
                }
                gq0Var = ((al0) objP3).c;
                strM1830xa862b2cd = uo3.m1830xa862b2cd(R.string.navigation_menu, kk0Var, 0);
                if (kk0Var.l(CompositionLocalsKt.getLocalLayoutDirection()) == dx1.d) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                c cVarB11 = a.b(cVar2, h01VarRememberDrawerState.a, z2, z4);
                vb2VarC = vw.c(Alignment$Companion.getTopStart(), false);
                currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                su2VarN = kk0Var.n();
                cVarD = b.d(kk0Var, cVarB11);
                androidx.compose.ui.node.a.j.getClass();
                constructor = ComposeUiNode$Companion.getConstructor();
                if (xkVar != null) {
                    rj0.a();
                    throw th;
                }
                kk0Var.e0();
                c cVar9 = cVar2;
                if (kk0Var.O) {
                    kk0Var.m(constructor);
                } else {
                    kk0Var.o0();
                }
                peVarH = fq2.h(kk0Var, vb2VarC, kk0Var, su2VarN);
                if (kk0Var.O) {
                    fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                } else {
                    fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                }
                xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
                if (i7 <= 256) {
                }
                objP4 = kk0Var.P();
                if (z5) {
                    obj3 = objP4;
                    tc tcVar10 = new tc(h01VarRememberDrawerState, 1, mi2Var);
                    kk0Var.l0(tcVar10);
                    obj3 = tcVar10;
                } else {
                    obj3 = objP4;
                    tc tcVar11 = new tc(h01VarRememberDrawerState, 1, mi2Var);
                    kk0Var.l0(tcVar11);
                    obj3 = tcVar11;
                }
                obj3 = objP4;
                vb2 vb2Var6 = (vb2) obj3;
                Modifier$Companion modifier$Companion6 = c.i;
                currentCompositeKeyHash2 = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                su2 su2VarN17 = kk0Var.n();
                c cVarD17 = b.d(kk0Var, modifier$Companion6);
                constructor2 = ComposeUiNode$Companion.getConstructor();
                kk0Var.e0();
                if (kk0Var.O) {
                    kk0Var.m(constructor2);
                } else {
                    kk0Var.o0();
                }
                peVarH2 = fq2.h(kk0Var, vb2Var6, kk0Var, su2VarN17);
                if (kk0Var.O) {
                    fq2.v(currentCompositeKeyHash2, kk0Var, currentCompositeKeyHash2, peVarH2);
                } else {
                    fq2.v(currentCompositeKeyHash2, kk0Var, currentCompositeKeyHash2, peVarH2);
                }
                xp1.E(kk0Var, cVarD17, ComposeUiNode$Companion.getSetModifier());
                zH2 = kk0Var.h(strM1830xa862b2cd) | ((i7 <= 256 && kk0Var.h(h01VarRememberDrawerState)) || (i3 & 384) == 256) | kk0Var.j(gq0Var);
                Object objP10 = kk0Var.P();
                if (zH2) {
                    r4 = 0;
                    jj2 jj2Var10 = new jj2(strM1830xa862b2cd, h01VarRememberDrawerState, gq0Var, false ? 1 : 0);
                    kk0Var.l0(jj2Var10);
                    obj4 = jj2Var10;
                } else {
                    r4 = 0;
                    jj2 jj2Var11 = new jj2(strM1830xa862b2cd, h01VarRememberDrawerState, gq0Var, false ? 1 : 0);
                    kk0Var.l0(jj2Var11);
                    obj4 = jj2Var11;
                }
                c cVarB12 = we3.b(modifier$Companion6, r4, (le1) obj4);
                vb2 vb2VarC12 = vw.c(Alignment$Companion.getTopStart(), r4);
                currentCompositeKeyHash3 = rj0.getCurrentCompositeKeyHash(kk0Var, r4);
                su2 su2VarN18 = kk0Var.n();
                c cVarD18 = b.d(kk0Var, cVarB12);
                constructor3 = ComposeUiNode$Companion.getConstructor();
                kk0Var.e0();
                if (kk0Var.O) {
                    kk0Var.m(constructor3);
                } else {
                    kk0Var.o0();
                }
                peVarH3 = fq2.h(kk0Var, vb2VarC12, kk0Var, su2VarN18);
                if (kk0Var.O) {
                    fq2.v(currentCompositeKeyHash3, kk0Var, currentCompositeKeyHash3, peVarH3);
                } else {
                    fq2.v(currentCompositeKeyHash3, kk0Var, currentCompositeKeyHash3, peVarH3);
                }
                xp1.E(kk0Var, cVarD18, ComposeUiNode$Companion.getSetModifier());
                ne1Var.invoke(kk0Var, Integer.valueOf(i3 & 14));
                kk0Var.r(true);
                vb2 vb2VarC13 = vw.c(Alignment$Companion.getTopStart(), false);
                currentCompositeKeyHash4 = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                su2 su2VarN19 = kk0Var.n();
                c cVarD19 = b.d(kk0Var, modifier$Companion6);
                constructor4 = ComposeUiNode$Companion.getConstructor();
                kk0Var.e0();
                if (kk0Var.O) {
                    kk0Var.m(constructor4);
                } else {
                    kk0Var.o0();
                }
                peVarH4 = fq2.h(kk0Var, vb2VarC13, kk0Var, su2VarN19);
                if (kk0Var.O) {
                    fq2.v(currentCompositeKeyHash4, kk0Var, currentCompositeKeyHash4, peVarH4);
                } else {
                    fq2.v(currentCompositeKeyHash4, kk0Var, currentCompositeKeyHash4, peVarH4);
                }
                xp1.E(kk0Var, cVarD19, ComposeUiNode$Companion.getSetModifier());
                ne1Var2.invoke(kk0Var, Integer.valueOf((i3 >> 12) & 14));
                kk0Var.r(true);
                kk0Var.r(true);
                kk0Var.r(true);
                cVar3 = cVar9;
            }
            h01Var2 = h01VarRememberDrawerState;
            z6 = z2;
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new lj2(ne1Var, cVar3, h01Var2, z6, ne1Var2, i, i2));
            }
        }
        i3 |= 3072;
        z2 = z;
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            if (kk0Var.j(ne1Var2)) {
                i6 = 16384;
            } else {
                i6 = ConstantsKt.DEFAULT_BUFFER_SIZE;
            }
            i3 |= i6;
        }
        if ((i3 & 9363) == 9362) {
            kk0Var.X();
            if ((i & 1) != 0) {
                if (i10 != 0) {
                    cVar2 = c.i;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                    h01VarRememberDrawerState = rememberDrawerState(i01.c, null, kk0Var, 6, 2);
                }
                if (i4 != 0) {
                    z2 = true;
                }
            } else {
                if (i10 != 0) {
                    cVar2 = c.i;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                    h01VarRememberDrawerState = rememberDrawerState(i01.c, null, kk0Var, 6, 2);
                }
                if (i4 != 0) {
                    z2 = true;
                }
            }
            kk0Var.s();
            objP = kk0Var.P();
            obj = objP;
            if (objP == Composer$Companion.getEmpty()) {
                ft2 ft2VarD6 = cl3.d(Boolean.FALSE);
                kk0Var.l0(ft2VarD6);
                obj = ft2VarD6;
            }
            mi2Var = (mi2) obj;
            wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
            i7 = (i3 & 896) ^ 384;
            i8 = 0;
            if (i7 > 256) {
                th = null;
                if ((i3 & 384) != 256) {
                    z3 = true;
                } else {
                    z3 = false;
                }
            } else {
                th = null;
                if ((i3 & 384) != 256) {
                    z3 = true;
                } else {
                    z3 = false;
                }
            }
            zH = z3 | kk0Var.h(wu0Var);
            objP2 = kk0Var.P();
            if (zH) {
                obj2 = objP2;
                hj2 hj2Var12 = new hj2(h01VarRememberDrawerState, wu0Var, i8);
                kk0Var.l0(hj2Var12);
                obj2 = hj2Var12;
            } else {
                obj2 = objP2;
                hj2 hj2Var13 = new hj2(h01VarRememberDrawerState, wu0Var, i8);
                kk0Var.l0(hj2Var13);
                obj2 = hj2Var13;
            }
            obj2 = objP2;
            r11.SideEffect((je1) obj2, kk0Var, 0);
            objP3 = kk0Var.P();
            if (objP3 == Composer$Companion.getEmpty()) {
                al0 al0Var7 = new al0(r11.a(x21.c, kk0Var));
                kk0Var.l0(al0Var7);
                objP3 = al0Var7;
            }
            gq0Var = ((al0) objP3).c;
            strM1830xa862b2cd = uo3.m1830xa862b2cd(R.string.navigation_menu, kk0Var, 0);
            if (kk0Var.l(CompositionLocalsKt.getLocalLayoutDirection()) == dx1.d) {
                z4 = true;
            } else {
                z4 = false;
            }
            c cVarB13 = a.b(cVar2, h01VarRememberDrawerState.a, z2, z4);
            vb2VarC = vw.c(Alignment$Companion.getTopStart(), false);
            currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
            su2VarN = kk0Var.n();
            cVarD = b.d(kk0Var, cVarB13);
            androidx.compose.ui.node.a.j.getClass();
            constructor = ComposeUiNode$Companion.getConstructor();
            if (xkVar != null) {
                rj0.a();
                throw th;
            }
            kk0Var.e0();
            c cVar10 = cVar2;
            if (kk0Var.O) {
                kk0Var.m(constructor);
            } else {
                kk0Var.o0();
            }
            peVarH = fq2.h(kk0Var, vb2VarC, kk0Var, su2VarN);
            if (kk0Var.O) {
                fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
            } else {
                fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
            }
            xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
            if (i7 <= 256) {
            }
            objP4 = kk0Var.P();
            if (z5) {
                obj3 = objP4;
                tc tcVar12 = new tc(h01VarRememberDrawerState, 1, mi2Var);
                kk0Var.l0(tcVar12);
                obj3 = tcVar12;
            } else {
                obj3 = objP4;
                tc tcVar13 = new tc(h01VarRememberDrawerState, 1, mi2Var);
                kk0Var.l0(tcVar13);
                obj3 = tcVar13;
            }
            obj3 = objP4;
            vb2 vb2Var7 = (vb2) obj3;
            Modifier$Companion modifier$Companion7 = c.i;
            currentCompositeKeyHash2 = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
            su2 su2VarN110 = kk0Var.n();
            c cVarD110 = b.d(kk0Var, modifier$Companion7);
            constructor2 = ComposeUiNode$Companion.getConstructor();
            kk0Var.e0();
            if (kk0Var.O) {
                kk0Var.m(constructor2);
            } else {
                kk0Var.o0();
            }
            peVarH2 = fq2.h(kk0Var, vb2Var7, kk0Var, su2VarN110);
            if (kk0Var.O) {
                fq2.v(currentCompositeKeyHash2, kk0Var, currentCompositeKeyHash2, peVarH2);
            } else {
                fq2.v(currentCompositeKeyHash2, kk0Var, currentCompositeKeyHash2, peVarH2);
            }
            xp1.E(kk0Var, cVarD110, ComposeUiNode$Companion.getSetModifier());
            zH2 = kk0Var.h(strM1830xa862b2cd) | ((i7 <= 256 && kk0Var.h(h01VarRememberDrawerState)) || (i3 & 384) == 256) | kk0Var.j(gq0Var);
            Object objP11 = kk0Var.P();
            if (zH2) {
                r4 = 0;
                jj2 jj2Var12 = new jj2(strM1830xa862b2cd, h01VarRememberDrawerState, gq0Var, false ? 1 : 0);
                kk0Var.l0(jj2Var12);
                obj4 = jj2Var12;
            } else {
                r4 = 0;
                jj2 jj2Var13 = new jj2(strM1830xa862b2cd, h01VarRememberDrawerState, gq0Var, false ? 1 : 0);
                kk0Var.l0(jj2Var13);
                obj4 = jj2Var13;
            }
            c cVarB14 = we3.b(modifier$Companion7, r4, (le1) obj4);
            vb2 vb2VarC14 = vw.c(Alignment$Companion.getTopStart(), r4);
            currentCompositeKeyHash3 = rj0.getCurrentCompositeKeyHash(kk0Var, r4);
            su2 su2VarN111 = kk0Var.n();
            c cVarD111 = b.d(kk0Var, cVarB14);
            constructor3 = ComposeUiNode$Companion.getConstructor();
            kk0Var.e0();
            if (kk0Var.O) {
                kk0Var.m(constructor3);
            } else {
                kk0Var.o0();
            }
            peVarH3 = fq2.h(kk0Var, vb2VarC14, kk0Var, su2VarN111);
            if (kk0Var.O) {
                fq2.v(currentCompositeKeyHash3, kk0Var, currentCompositeKeyHash3, peVarH3);
            } else {
                fq2.v(currentCompositeKeyHash3, kk0Var, currentCompositeKeyHash3, peVarH3);
            }
            xp1.E(kk0Var, cVarD111, ComposeUiNode$Companion.getSetModifier());
            ne1Var.invoke(kk0Var, Integer.valueOf(i3 & 14));
            kk0Var.r(true);
            vb2 vb2VarC15 = vw.c(Alignment$Companion.getTopStart(), false);
            currentCompositeKeyHash4 = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
            su2 su2VarN112 = kk0Var.n();
            c cVarD112 = b.d(kk0Var, modifier$Companion7);
            constructor4 = ComposeUiNode$Companion.getConstructor();
            kk0Var.e0();
            if (kk0Var.O) {
                kk0Var.m(constructor4);
            } else {
                kk0Var.o0();
            }
            peVarH4 = fq2.h(kk0Var, vb2VarC15, kk0Var, su2VarN112);
            if (kk0Var.O) {
                fq2.v(currentCompositeKeyHash4, kk0Var, currentCompositeKeyHash4, peVarH4);
            } else {
                fq2.v(currentCompositeKeyHash4, kk0Var, currentCompositeKeyHash4, peVarH4);
            }
            xp1.E(kk0Var, cVarD112, ComposeUiNode$Companion.getSetModifier());
            ne1Var2.invoke(kk0Var, Integer.valueOf((i3 >> 12) & 14));
            kk0Var.r(true);
            kk0Var.r(true);
            kk0Var.r(true);
            cVar3 = cVar10;
        } else {
            kk0Var.X();
            if ((i & 1) != 0) {
                if (i10 != 0) {
                    cVar2 = c.i;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                    h01VarRememberDrawerState = rememberDrawerState(i01.c, null, kk0Var, 6, 2);
                }
                if (i4 != 0) {
                    z2 = true;
                }
            } else {
                if (i10 != 0) {
                    cVar2 = c.i;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                    h01VarRememberDrawerState = rememberDrawerState(i01.c, null, kk0Var, 6, 2);
                }
                if (i4 != 0) {
                    z2 = true;
                }
            }
            kk0Var.s();
            objP = kk0Var.P();
            obj = objP;
            if (objP == Composer$Companion.getEmpty()) {
                ft2 ft2VarD7 = cl3.d(Boolean.FALSE);
                kk0Var.l0(ft2VarD7);
                obj = ft2VarD7;
            }
            mi2Var = (mi2) obj;
            wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
            i7 = (i3 & 896) ^ 384;
            i8 = 0;
            if (i7 > 256) {
                th = null;
                if ((i3 & 384) != 256) {
                    z3 = true;
                } else {
                    z3 = false;
                }
            } else {
                th = null;
                if ((i3 & 384) != 256) {
                    z3 = true;
                } else {
                    z3 = false;
                }
            }
            zH = z3 | kk0Var.h(wu0Var);
            objP2 = kk0Var.P();
            if (zH) {
                obj2 = objP2;
                hj2 hj2Var14 = new hj2(h01VarRememberDrawerState, wu0Var, i8);
                kk0Var.l0(hj2Var14);
                obj2 = hj2Var14;
            } else {
                obj2 = objP2;
                hj2 hj2Var15 = new hj2(h01VarRememberDrawerState, wu0Var, i8);
                kk0Var.l0(hj2Var15);
                obj2 = hj2Var15;
            }
            obj2 = objP2;
            r11.SideEffect((je1) obj2, kk0Var, 0);
            objP3 = kk0Var.P();
            if (objP3 == Composer$Companion.getEmpty()) {
                al0 al0Var8 = new al0(r11.a(x21.c, kk0Var));
                kk0Var.l0(al0Var8);
                objP3 = al0Var8;
            }
            gq0Var = ((al0) objP3).c;
            strM1830xa862b2cd = uo3.m1830xa862b2cd(R.string.navigation_menu, kk0Var, 0);
            if (kk0Var.l(CompositionLocalsKt.getLocalLayoutDirection()) == dx1.d) {
                z4 = true;
            } else {
                z4 = false;
            }
            c cVarB15 = a.b(cVar2, h01VarRememberDrawerState.a, z2, z4);
            vb2VarC = vw.c(Alignment$Companion.getTopStart(), false);
            currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
            su2VarN = kk0Var.n();
            cVarD = b.d(kk0Var, cVarB15);
            androidx.compose.ui.node.a.j.getClass();
            constructor = ComposeUiNode$Companion.getConstructor();
            if (xkVar != null) {
                rj0.a();
                throw th;
            }
            kk0Var.e0();
            c cVar11 = cVar2;
            if (kk0Var.O) {
                kk0Var.m(constructor);
            } else {
                kk0Var.o0();
            }
            peVarH = fq2.h(kk0Var, vb2VarC, kk0Var, su2VarN);
            if (kk0Var.O) {
                fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
            } else {
                fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
            }
            xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
            if (i7 <= 256) {
            }
            objP4 = kk0Var.P();
            if (z5) {
                obj3 = objP4;
                tc tcVar14 = new tc(h01VarRememberDrawerState, 1, mi2Var);
                kk0Var.l0(tcVar14);
                obj3 = tcVar14;
            } else {
                obj3 = objP4;
                tc tcVar15 = new tc(h01VarRememberDrawerState, 1, mi2Var);
                kk0Var.l0(tcVar15);
                obj3 = tcVar15;
            }
            obj3 = objP4;
            vb2 vb2Var8 = (vb2) obj3;
            Modifier$Companion modifier$Companion8 = c.i;
            currentCompositeKeyHash2 = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
            su2 su2VarN113 = kk0Var.n();
            c cVarD113 = b.d(kk0Var, modifier$Companion8);
            constructor2 = ComposeUiNode$Companion.getConstructor();
            kk0Var.e0();
            if (kk0Var.O) {
                kk0Var.m(constructor2);
            } else {
                kk0Var.o0();
            }
            peVarH2 = fq2.h(kk0Var, vb2Var8, kk0Var, su2VarN113);
            if (kk0Var.O) {
                fq2.v(currentCompositeKeyHash2, kk0Var, currentCompositeKeyHash2, peVarH2);
            } else {
                fq2.v(currentCompositeKeyHash2, kk0Var, currentCompositeKeyHash2, peVarH2);
            }
            xp1.E(kk0Var, cVarD113, ComposeUiNode$Companion.getSetModifier());
            zH2 = kk0Var.h(strM1830xa862b2cd) | ((i7 <= 256 && kk0Var.h(h01VarRememberDrawerState)) || (i3 & 384) == 256) | kk0Var.j(gq0Var);
            Object objP12 = kk0Var.P();
            if (zH2) {
                r4 = 0;
                jj2 jj2Var14 = new jj2(strM1830xa862b2cd, h01VarRememberDrawerState, gq0Var, false ? 1 : 0);
                kk0Var.l0(jj2Var14);
                obj4 = jj2Var14;
            } else {
                r4 = 0;
                jj2 jj2Var15 = new jj2(strM1830xa862b2cd, h01VarRememberDrawerState, gq0Var, false ? 1 : 0);
                kk0Var.l0(jj2Var15);
                obj4 = jj2Var15;
            }
            c cVarB16 = we3.b(modifier$Companion8, r4, (le1) obj4);
            vb2 vb2VarC16 = vw.c(Alignment$Companion.getTopStart(), r4);
            currentCompositeKeyHash3 = rj0.getCurrentCompositeKeyHash(kk0Var, r4);
            su2 su2VarN114 = kk0Var.n();
            c cVarD114 = b.d(kk0Var, cVarB16);
            constructor3 = ComposeUiNode$Companion.getConstructor();
            kk0Var.e0();
            if (kk0Var.O) {
                kk0Var.m(constructor3);
            } else {
                kk0Var.o0();
            }
            peVarH3 = fq2.h(kk0Var, vb2VarC16, kk0Var, su2VarN114);
            if (kk0Var.O) {
                fq2.v(currentCompositeKeyHash3, kk0Var, currentCompositeKeyHash3, peVarH3);
            } else {
                fq2.v(currentCompositeKeyHash3, kk0Var, currentCompositeKeyHash3, peVarH3);
            }
            xp1.E(kk0Var, cVarD114, ComposeUiNode$Companion.getSetModifier());
            ne1Var.invoke(kk0Var, Integer.valueOf(i3 & 14));
            kk0Var.r(true);
            vb2 vb2VarC17 = vw.c(Alignment$Companion.getTopStart(), false);
            currentCompositeKeyHash4 = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
            su2 su2VarN115 = kk0Var.n();
            c cVarD115 = b.d(kk0Var, modifier$Companion8);
            constructor4 = ComposeUiNode$Companion.getConstructor();
            kk0Var.e0();
            if (kk0Var.O) {
                kk0Var.m(constructor4);
            } else {
                kk0Var.o0();
            }
            peVarH4 = fq2.h(kk0Var, vb2VarC17, kk0Var, su2VarN115);
            if (kk0Var.O) {
                fq2.v(currentCompositeKeyHash4, kk0Var, currentCompositeKeyHash4, peVarH4);
            } else {
                fq2.v(currentCompositeKeyHash4, kk0Var, currentCompositeKeyHash4, peVarH4);
            }
            xp1.E(kk0Var, cVarD115, ComposeUiNode$Companion.getSetModifier());
            ne1Var2.invoke(kk0Var, Integer.valueOf((i3 >> 12) & 14));
            kk0Var.r(true);
            kk0Var.r(true);
            kk0Var.r(true);
            cVar3 = cVar11;
        }
        h01Var2 = h01VarRememberDrawerState;
        z6 = z2;
        w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new lj2(ne1Var, cVar3, h01Var2, z6, ne1Var2, i, i2));
        }
    }

    /* JADX WARN: Code duplicated, block: B:106:0x013e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:107:0x0140  */
    /* JADX WARN: Code duplicated, block: B:108:0x0143  */
    /* JADX WARN: Code duplicated, block: B:110:0x0146  */
    /* JADX WARN: Code duplicated, block: B:111:0x0149  */
    /* JADX WARN: Code duplicated, block: B:114:0x014e  */
    /* JADX WARN: Code duplicated, block: B:115:0x0157  */
    /* JADX WARN: Code duplicated, block: B:118:0x015c  */
    /* JADX WARN: Code duplicated, block: B:119:0x0169  */
    /* JADX WARN: Code duplicated, block: B:121:0x016c  */
    /* JADX WARN: Code duplicated, block: B:123:0x0178  */
    /* JADX WARN: Code duplicated, block: B:126:0x018c  */
    /* JADX WARN: Code duplicated, block: B:127:0x018e  */
    /* JADX WARN: Code duplicated, block: B:129:0x0191  */
    /* JADX WARN: Code duplicated, block: B:130:0x019d  */
    /* JADX WARN: Code duplicated, block: B:134:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0061  */
    /* JADX WARN: Code duplicated, block: B:38:0x0066  */
    /* JADX WARN: Code duplicated, block: B:40:0x006a  */
    /* JADX WARN: Code duplicated, block: B:42:0x0072  */
    /* JADX WARN: Code duplicated, block: B:43:0x0075  */
    /* JADX WARN: Code duplicated, block: B:47:0x007c  */
    /* JADX WARN: Code duplicated, block: B:49:0x0080  */
    /* JADX WARN: Code duplicated, block: B:51:0x0088  */
    /* JADX WARN: Code duplicated, block: B:52:0x008b  */
    /* JADX WARN: Code duplicated, block: B:55:0x0091  */
    /* JADX WARN: Code duplicated, block: B:58:0x0098  */
    /* JADX WARN: Code duplicated, block: B:60:0x009c  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:80:0x00da  */
    /* JADX WARN: Code duplicated, block: B:81:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:90:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:94:0x010e  */
    /* JADX WARN: Code duplicated, block: B:96:0x011c  */
    /* JADX INFO: renamed from: DrawerSheet-7zSek6w, reason: not valid java name */
    public static final void m1821xd59157b8(e01 e01Var, e eVar, c cVar, rg3 rg3Var, long j, long j2, float f, oe1 oe1Var, ck0 ck0Var, int i, int i2) {
        int i3;
        c cVar2;
        int i4;
        rg3 rg3Var2;
        int i5;
        long j3;
        long j4;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        c cVar3;
        rg3 rg3Var3;
        long standardContainerColor;
        long jM2x310ea166;
        float f2;
        int i11;
        long j5;
        long j6;
        int i12;
        boolean z;
        c cVarA;
        kk0 kk0Var;
        rg3 rg3Var4;
        long j7;
        long j8;
        float f3;
        w33 w33VarV;
        int i13;
        kk0 kk0Var2 = (kk0) ck0Var;
        kk0Var2.c0(-151557245);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (kk0Var2.h(e01Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= kk0Var2.h(eVar) ? 32 : 16;
        }
        int i14 = i2 & 4;
        if (i14 == 0) {
            if ((i & 384) == 0) {
                cVar2 = cVar;
                i3 |= kk0Var2.h(cVar2) ? FontInfo.NUMBER_OF_CHAR_CODES : Uuid.SIZE_BITS;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    rg3Var2 = rg3Var;
                    if (kk0Var2.h(rg3Var2)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        j3 = j;
                        if (kk0Var2.g(j3)) {
                            i13 = 16384;
                        }
                        i3 |= i13;
                    } else {
                        j3 = j;
                    }
                    i13 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                    i3 |= i13;
                } else {
                    j3 = j;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        j4 = j2;
                        int i15 = kk0Var2.g(j4) ? 131072 : 65536;
                        i3 |= i15;
                    } else {
                        j4 = j2;
                    }
                    i3 |= i15;
                } else {
                    j4 = j2;
                }
                i6 = i2 & 64;
                if (i6 != 0) {
                    i8 = i3 | 1572864;
                } else {
                    i7 = i3;
                    if ((i & 1572864) == 0) {
                        if (kk0Var2.e(f)) {
                            i9 = 1048576;
                        } else {
                            i9 = 524288;
                        }
                        i8 = i7 | i9;
                    } else {
                        i8 = i7;
                    }
                }
                if ((i2 & Uuid.SIZE_BITS) != 0) {
                    i8 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    if (kk0Var2.j(oe1Var)) {
                        i10 = 8388608;
                    } else {
                        i10 = 4194304;
                    }
                    i8 |= i10;
                }
                if ((i8 & 4793491) == 4793490 || !kk0Var2.F()) {
                    kk0Var2.X();
                    if ((i & 1) != 0 || kk0Var2.D()) {
                        if (i14 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            rg3Var3 = k43.a;
                        } else {
                            rg3Var3 = rg3Var2;
                        }
                        if ((i2 & 16) != 0) {
                            standardContainerColor = c01.a.getStandardContainerColor(kk0Var2, 6);
                            i8 &= -57345;
                        } else {
                            standardContainerColor = j3;
                        }
                        if ((i2 & 32) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(standardContainerColor, kk0Var2, (i8 >> 12) & 14);
                            i8 &= -458753;
                        } else {
                            jM2x310ea166 = j4;
                        }
                        if (i6 != 0) {
                            f2 = 0.0f;
                        } else {
                            f2 = f;
                        }
                        i11 = i8;
                        j5 = standardContainerColor;
                        j6 = jM2x310ea166;
                    } else {
                        kk0Var2.V();
                        if ((i2 & 16) != 0) {
                            i8 &= -57345;
                        }
                        if ((i2 & 32) != 0) {
                            i8 &= -458753;
                        }
                        f2 = f;
                        cVar3 = cVar2;
                        i11 = i8;
                        j5 = j3;
                        j6 = j4;
                        rg3Var3 = rg3Var2;
                    }
                    kk0Var2.s();
                    i12 = 1;
                    if (kk0Var2.l(CompositionLocalsKt.getLocalLayoutDirection()) == dx1.d) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (e01Var != null) {
                        cVarA = androidx.compose.ui.graphics.a.a(c.i, new tj2(e01Var, z, i12));
                    } else {
                        cVarA = c.i;
                    }
                    int i16 = i11 >> 6;
                    kk0Var = kk0Var2;
                    hq3.m210x8dcae10(d.l(cVar3, 240.0f, (10 & 2) != 0 ? Float.NaN : 48.0f, 360.0f, Float.NaN).then(cVarA).then(d.b), rg3Var3, j5, j6, f2, 0.0f, null, zg0.rememberComposableLambda(669057502, true, new mj2(e01Var, z, eVar, oe1Var), kk0Var2, 54), kk0Var, (i16 & 112) | 12582912 | (i16 & 896) | (i16 & 7168) | (i16 & 57344), 96);
                    rg3Var4 = rg3Var3;
                    j7 = j5;
                    j8 = j6;
                    f3 = f2;
                } else {
                    kk0Var2.V();
                    kk0Var = kk0Var2;
                    cVar3 = cVar2;
                    rg3Var4 = rg3Var2;
                    j7 = j3;
                    j8 = j4;
                    f3 = f;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new wg(e01Var, eVar, cVar3, rg3Var4, j7, j8, f3, oe1Var, i, i2));
                }
            }
            i3 |= 3072;
            rg3Var2 = rg3Var;
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    j3 = j;
                    if (kk0Var2.g(j3)) {
                        i13 = 16384;
                    }
                    i3 |= i13;
                } else {
                    j3 = j;
                }
                i13 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                i3 |= i13;
            } else {
                j3 = j;
            }
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0) {
                    j4 = j2;
                    if (kk0Var2.g(j4)) {
                    }
                    i3 |= i15;
                } else {
                    j4 = j2;
                }
                i3 |= i15;
            } else {
                j4 = j2;
            }
            i6 = i2 & 64;
            if (i6 != 0) {
                i8 = i3 | 1572864;
            } else {
                i7 = i3;
                if ((i & 1572864) == 0) {
                    if (kk0Var2.e(f)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i8 = i7 | i9;
                } else {
                    i8 = i7;
                }
            }
            if ((i2 & Uuid.SIZE_BITS) != 0) {
                i8 |= 12582912;
            } else if ((i & 12582912) == 0) {
                if (kk0Var2.j(oe1Var)) {
                    i10 = 8388608;
                } else {
                    i10 = 4194304;
                }
                i8 |= i10;
            }
            if ((i8 & 4793491) == 4793490) {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i14 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        rg3Var3 = k43.a;
                    } else {
                        rg3Var3 = rg3Var2;
                    }
                    if ((i2 & 16) != 0) {
                        standardContainerColor = c01.a.getStandardContainerColor(kk0Var2, 6);
                        i8 &= -57345;
                    } else {
                        standardContainerColor = j3;
                    }
                    if ((i2 & 32) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(standardContainerColor, kk0Var2, (i8 >> 12) & 14);
                        i8 &= -458753;
                    } else {
                        jM2x310ea166 = j4;
                    }
                    if (i6 != 0) {
                        f2 = 0.0f;
                    } else {
                        f2 = f;
                    }
                    i11 = i8;
                    j5 = standardContainerColor;
                    j6 = jM2x310ea166;
                } else {
                    if (i14 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        rg3Var3 = k43.a;
                    } else {
                        rg3Var3 = rg3Var2;
                    }
                    if ((i2 & 16) != 0) {
                        standardContainerColor = c01.a.getStandardContainerColor(kk0Var2, 6);
                        i8 &= -57345;
                    } else {
                        standardContainerColor = j3;
                    }
                    if ((i2 & 32) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(standardContainerColor, kk0Var2, (i8 >> 12) & 14);
                        i8 &= -458753;
                    } else {
                        jM2x310ea166 = j4;
                    }
                    if (i6 != 0) {
                        f2 = 0.0f;
                    } else {
                        f2 = f;
                    }
                    i11 = i8;
                    j5 = standardContainerColor;
                    j6 = jM2x310ea166;
                }
                kk0Var2.s();
                i12 = 1;
                if (kk0Var2.l(CompositionLocalsKt.getLocalLayoutDirection()) == dx1.d) {
                    z = true;
                } else {
                    z = false;
                }
                if (e01Var != null) {
                    cVarA = androidx.compose.ui.graphics.a.a(c.i, new tj2(e01Var, z, i12));
                } else {
                    cVarA = c.i;
                }
                int i17 = i11 >> 6;
                kk0Var = kk0Var2;
                hq3.m210x8dcae10(d.l(cVar3, 240.0f, (10 & 2) != 0 ? Float.NaN : 48.0f, 360.0f, Float.NaN).then(cVarA).then(d.b), rg3Var3, j5, j6, f2, 0.0f, null, zg0.rememberComposableLambda(669057502, true, new mj2(e01Var, z, eVar, oe1Var), kk0Var2, 54), kk0Var, (i17 & 112) | 12582912 | (i17 & 896) | (i17 & 7168) | (i17 & 57344), 96);
                rg3Var4 = rg3Var3;
                j7 = j5;
                j8 = j6;
                f3 = f2;
            } else {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i14 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        rg3Var3 = k43.a;
                    } else {
                        rg3Var3 = rg3Var2;
                    }
                    if ((i2 & 16) != 0) {
                        standardContainerColor = c01.a.getStandardContainerColor(kk0Var2, 6);
                        i8 &= -57345;
                    } else {
                        standardContainerColor = j3;
                    }
                    if ((i2 & 32) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(standardContainerColor, kk0Var2, (i8 >> 12) & 14);
                        i8 &= -458753;
                    } else {
                        jM2x310ea166 = j4;
                    }
                    if (i6 != 0) {
                        f2 = 0.0f;
                    } else {
                        f2 = f;
                    }
                    i11 = i8;
                    j5 = standardContainerColor;
                    j6 = jM2x310ea166;
                } else {
                    if (i14 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        rg3Var3 = k43.a;
                    } else {
                        rg3Var3 = rg3Var2;
                    }
                    if ((i2 & 16) != 0) {
                        standardContainerColor = c01.a.getStandardContainerColor(kk0Var2, 6);
                        i8 &= -57345;
                    } else {
                        standardContainerColor = j3;
                    }
                    if ((i2 & 32) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(standardContainerColor, kk0Var2, (i8 >> 12) & 14);
                        i8 &= -458753;
                    } else {
                        jM2x310ea166 = j4;
                    }
                    if (i6 != 0) {
                        f2 = 0.0f;
                    } else {
                        f2 = f;
                    }
                    i11 = i8;
                    j5 = standardContainerColor;
                    j6 = jM2x310ea166;
                }
                kk0Var2.s();
                i12 = 1;
                if (kk0Var2.l(CompositionLocalsKt.getLocalLayoutDirection()) == dx1.d) {
                    z = true;
                } else {
                    z = false;
                }
                if (e01Var != null) {
                    cVarA = androidx.compose.ui.graphics.a.a(c.i, new tj2(e01Var, z, i12));
                } else {
                    cVarA = c.i;
                }
                int i18 = i11 >> 6;
                kk0Var = kk0Var2;
                hq3.m210x8dcae10(d.l(cVar3, 240.0f, (10 & 2) != 0 ? Float.NaN : 48.0f, 360.0f, Float.NaN).then(cVarA).then(d.b), rg3Var3, j5, j6, f2, 0.0f, null, zg0.rememberComposableLambda(669057502, true, new mj2(e01Var, z, eVar, oe1Var), kk0Var2, 54), kk0Var, (i18 & 112) | 12582912 | (i18 & 896) | (i18 & 7168) | (i18 & 57344), 96);
                rg3Var4 = rg3Var3;
                j7 = j5;
                j8 = j6;
                f3 = f2;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new wg(e01Var, eVar, cVar3, rg3Var4, j7, j8, f3, oe1Var, i, i2));
            }
        }
        i3 |= 384;
        cVar2 = cVar;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                rg3Var2 = rg3Var;
                if (kk0Var2.h(rg3Var2)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    j3 = j;
                    if (kk0Var2.g(j3)) {
                        i13 = 16384;
                    }
                    i3 |= i13;
                } else {
                    j3 = j;
                }
                i13 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                i3 |= i13;
            } else {
                j3 = j;
            }
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0) {
                    j4 = j2;
                    if (kk0Var2.g(j4)) {
                    }
                    i3 |= i15;
                } else {
                    j4 = j2;
                }
                i3 |= i15;
            } else {
                j4 = j2;
            }
            i6 = i2 & 64;
            if (i6 != 0) {
                i8 = i3 | 1572864;
            } else {
                i7 = i3;
                if ((i & 1572864) == 0) {
                    if (kk0Var2.e(f)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i8 = i7 | i9;
                } else {
                    i8 = i7;
                }
            }
            if ((i2 & Uuid.SIZE_BITS) != 0) {
                i8 |= 12582912;
            } else if ((i & 12582912) == 0) {
                if (kk0Var2.j(oe1Var)) {
                    i10 = 8388608;
                } else {
                    i10 = 4194304;
                }
                i8 |= i10;
            }
            if ((i8 & 4793491) == 4793490) {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i14 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        rg3Var3 = k43.a;
                    } else {
                        rg3Var3 = rg3Var2;
                    }
                    if ((i2 & 16) != 0) {
                        standardContainerColor = c01.a.getStandardContainerColor(kk0Var2, 6);
                        i8 &= -57345;
                    } else {
                        standardContainerColor = j3;
                    }
                    if ((i2 & 32) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(standardContainerColor, kk0Var2, (i8 >> 12) & 14);
                        i8 &= -458753;
                    } else {
                        jM2x310ea166 = j4;
                    }
                    if (i6 != 0) {
                        f2 = 0.0f;
                    } else {
                        f2 = f;
                    }
                    i11 = i8;
                    j5 = standardContainerColor;
                    j6 = jM2x310ea166;
                } else {
                    if (i14 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        rg3Var3 = k43.a;
                    } else {
                        rg3Var3 = rg3Var2;
                    }
                    if ((i2 & 16) != 0) {
                        standardContainerColor = c01.a.getStandardContainerColor(kk0Var2, 6);
                        i8 &= -57345;
                    } else {
                        standardContainerColor = j3;
                    }
                    if ((i2 & 32) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(standardContainerColor, kk0Var2, (i8 >> 12) & 14);
                        i8 &= -458753;
                    } else {
                        jM2x310ea166 = j4;
                    }
                    if (i6 != 0) {
                        f2 = 0.0f;
                    } else {
                        f2 = f;
                    }
                    i11 = i8;
                    j5 = standardContainerColor;
                    j6 = jM2x310ea166;
                }
                kk0Var2.s();
                i12 = 1;
                if (kk0Var2.l(CompositionLocalsKt.getLocalLayoutDirection()) == dx1.d) {
                    z = true;
                } else {
                    z = false;
                }
                if (e01Var != null) {
                    cVarA = androidx.compose.ui.graphics.a.a(c.i, new tj2(e01Var, z, i12));
                } else {
                    cVarA = c.i;
                }
                int i19 = i11 >> 6;
                kk0Var = kk0Var2;
                hq3.m210x8dcae10(d.l(cVar3, 240.0f, (10 & 2) != 0 ? Float.NaN : 48.0f, 360.0f, Float.NaN).then(cVarA).then(d.b), rg3Var3, j5, j6, f2, 0.0f, null, zg0.rememberComposableLambda(669057502, true, new mj2(e01Var, z, eVar, oe1Var), kk0Var2, 54), kk0Var, (i19 & 112) | 12582912 | (i19 & 896) | (i19 & 7168) | (i19 & 57344), 96);
                rg3Var4 = rg3Var3;
                j7 = j5;
                j8 = j6;
                f3 = f2;
            } else {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i14 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        rg3Var3 = k43.a;
                    } else {
                        rg3Var3 = rg3Var2;
                    }
                    if ((i2 & 16) != 0) {
                        standardContainerColor = c01.a.getStandardContainerColor(kk0Var2, 6);
                        i8 &= -57345;
                    } else {
                        standardContainerColor = j3;
                    }
                    if ((i2 & 32) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(standardContainerColor, kk0Var2, (i8 >> 12) & 14);
                        i8 &= -458753;
                    } else {
                        jM2x310ea166 = j4;
                    }
                    if (i6 != 0) {
                        f2 = 0.0f;
                    } else {
                        f2 = f;
                    }
                    i11 = i8;
                    j5 = standardContainerColor;
                    j6 = jM2x310ea166;
                } else {
                    if (i14 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        rg3Var3 = k43.a;
                    } else {
                        rg3Var3 = rg3Var2;
                    }
                    if ((i2 & 16) != 0) {
                        standardContainerColor = c01.a.getStandardContainerColor(kk0Var2, 6);
                        i8 &= -57345;
                    } else {
                        standardContainerColor = j3;
                    }
                    if ((i2 & 32) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(standardContainerColor, kk0Var2, (i8 >> 12) & 14);
                        i8 &= -458753;
                    } else {
                        jM2x310ea166 = j4;
                    }
                    if (i6 != 0) {
                        f2 = 0.0f;
                    } else {
                        f2 = f;
                    }
                    i11 = i8;
                    j5 = standardContainerColor;
                    j6 = jM2x310ea166;
                }
                kk0Var2.s();
                i12 = 1;
                if (kk0Var2.l(CompositionLocalsKt.getLocalLayoutDirection()) == dx1.d) {
                    z = true;
                } else {
                    z = false;
                }
                if (e01Var != null) {
                    cVarA = androidx.compose.ui.graphics.a.a(c.i, new tj2(e01Var, z, i12));
                } else {
                    cVarA = c.i;
                }
                int i110 = i11 >> 6;
                kk0Var = kk0Var2;
                hq3.m210x8dcae10(d.l(cVar3, 240.0f, (10 & 2) != 0 ? Float.NaN : 48.0f, 360.0f, Float.NaN).then(cVarA).then(d.b), rg3Var3, j5, j6, f2, 0.0f, null, zg0.rememberComposableLambda(669057502, true, new mj2(e01Var, z, eVar, oe1Var), kk0Var2, 54), kk0Var, (i110 & 112) | 12582912 | (i110 & 896) | (i110 & 7168) | (i110 & 57344), 96);
                rg3Var4 = rg3Var3;
                j7 = j5;
                j8 = j6;
                f3 = f2;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new wg(e01Var, eVar, cVar3, rg3Var4, j7, j8, f3, oe1Var, i, i2));
            }
        }
        i3 |= 3072;
        rg3Var2 = rg3Var;
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                j3 = j;
                if (kk0Var2.g(j3)) {
                    i13 = 16384;
                }
                i3 |= i13;
            } else {
                j3 = j;
            }
            i13 = ConstantsKt.DEFAULT_BUFFER_SIZE;
            i3 |= i13;
        } else {
            j3 = j;
        }
        if ((196608 & i) == 0) {
            if ((i2 & 32) == 0) {
                j4 = j2;
                if (kk0Var2.g(j4)) {
                }
                i3 |= i15;
            } else {
                j4 = j2;
            }
            i3 |= i15;
        } else {
            j4 = j2;
        }
        i6 = i2 & 64;
        if (i6 != 0) {
            i8 = i3 | 1572864;
        } else {
            i7 = i3;
            if ((i & 1572864) == 0) {
                if (kk0Var2.e(f)) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i8 = i7 | i9;
            } else {
                i8 = i7;
            }
        }
        if ((i2 & Uuid.SIZE_BITS) != 0) {
            i8 |= 12582912;
        } else if ((i & 12582912) == 0) {
            if (kk0Var2.j(oe1Var)) {
                i10 = 8388608;
            } else {
                i10 = 4194304;
            }
            i8 |= i10;
        }
        if ((i8 & 4793491) == 4793490) {
            kk0Var2.X();
            if ((i & 1) != 0) {
                if (i14 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if (i4 != 0) {
                    rg3Var3 = k43.a;
                } else {
                    rg3Var3 = rg3Var2;
                }
                if ((i2 & 16) != 0) {
                    standardContainerColor = c01.a.getStandardContainerColor(kk0Var2, 6);
                    i8 &= -57345;
                } else {
                    standardContainerColor = j3;
                }
                if ((i2 & 32) != 0) {
                    jM2x310ea166 = af0.m2x310ea166(standardContainerColor, kk0Var2, (i8 >> 12) & 14);
                    i8 &= -458753;
                } else {
                    jM2x310ea166 = j4;
                }
                if (i6 != 0) {
                    f2 = 0.0f;
                } else {
                    f2 = f;
                }
                i11 = i8;
                j5 = standardContainerColor;
                j6 = jM2x310ea166;
            } else {
                if (i14 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if (i4 != 0) {
                    rg3Var3 = k43.a;
                } else {
                    rg3Var3 = rg3Var2;
                }
                if ((i2 & 16) != 0) {
                    standardContainerColor = c01.a.getStandardContainerColor(kk0Var2, 6);
                    i8 &= -57345;
                } else {
                    standardContainerColor = j3;
                }
                if ((i2 & 32) != 0) {
                    jM2x310ea166 = af0.m2x310ea166(standardContainerColor, kk0Var2, (i8 >> 12) & 14);
                    i8 &= -458753;
                } else {
                    jM2x310ea166 = j4;
                }
                if (i6 != 0) {
                    f2 = 0.0f;
                } else {
                    f2 = f;
                }
                i11 = i8;
                j5 = standardContainerColor;
                j6 = jM2x310ea166;
            }
            kk0Var2.s();
            i12 = 1;
            if (kk0Var2.l(CompositionLocalsKt.getLocalLayoutDirection()) == dx1.d) {
                z = true;
            } else {
                z = false;
            }
            if (e01Var != null) {
                cVarA = androidx.compose.ui.graphics.a.a(c.i, new tj2(e01Var, z, i12));
            } else {
                cVarA = c.i;
            }
            int i111 = i11 >> 6;
            kk0Var = kk0Var2;
            hq3.m210x8dcae10(d.l(cVar3, 240.0f, (10 & 2) != 0 ? Float.NaN : 48.0f, 360.0f, Float.NaN).then(cVarA).then(d.b), rg3Var3, j5, j6, f2, 0.0f, null, zg0.rememberComposableLambda(669057502, true, new mj2(e01Var, z, eVar, oe1Var), kk0Var2, 54), kk0Var, (i111 & 112) | 12582912 | (i111 & 896) | (i111 & 7168) | (i111 & 57344), 96);
            rg3Var4 = rg3Var3;
            j7 = j5;
            j8 = j6;
            f3 = f2;
        } else {
            kk0Var2.X();
            if ((i & 1) != 0) {
                if (i14 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if (i4 != 0) {
                    rg3Var3 = k43.a;
                } else {
                    rg3Var3 = rg3Var2;
                }
                if ((i2 & 16) != 0) {
                    standardContainerColor = c01.a.getStandardContainerColor(kk0Var2, 6);
                    i8 &= -57345;
                } else {
                    standardContainerColor = j3;
                }
                if ((i2 & 32) != 0) {
                    jM2x310ea166 = af0.m2x310ea166(standardContainerColor, kk0Var2, (i8 >> 12) & 14);
                    i8 &= -458753;
                } else {
                    jM2x310ea166 = j4;
                }
                if (i6 != 0) {
                    f2 = 0.0f;
                } else {
                    f2 = f;
                }
                i11 = i8;
                j5 = standardContainerColor;
                j6 = jM2x310ea166;
            } else {
                if (i14 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if (i4 != 0) {
                    rg3Var3 = k43.a;
                } else {
                    rg3Var3 = rg3Var2;
                }
                if ((i2 & 16) != 0) {
                    standardContainerColor = c01.a.getStandardContainerColor(kk0Var2, 6);
                    i8 &= -57345;
                } else {
                    standardContainerColor = j3;
                }
                if ((i2 & 32) != 0) {
                    jM2x310ea166 = af0.m2x310ea166(standardContainerColor, kk0Var2, (i8 >> 12) & 14);
                    i8 &= -458753;
                } else {
                    jM2x310ea166 = j4;
                }
                if (i6 != 0) {
                    f2 = 0.0f;
                } else {
                    f2 = f;
                }
                i11 = i8;
                j5 = standardContainerColor;
                j6 = jM2x310ea166;
            }
            kk0Var2.s();
            i12 = 1;
            if (kk0Var2.l(CompositionLocalsKt.getLocalLayoutDirection()) == dx1.d) {
                z = true;
            } else {
                z = false;
            }
            if (e01Var != null) {
                cVarA = androidx.compose.ui.graphics.a.a(c.i, new tj2(e01Var, z, i12));
            } else {
                cVarA = c.i;
            }
            int i112 = i11 >> 6;
            kk0Var = kk0Var2;
            hq3.m210x8dcae10(d.l(cVar3, 240.0f, (10 & 2) != 0 ? Float.NaN : 48.0f, 360.0f, Float.NaN).then(cVarA).then(d.b), rg3Var3, j5, j6, f2, 0.0f, null, zg0.rememberComposableLambda(669057502, true, new mj2(e01Var, z, eVar, oe1Var), kk0Var2, 54), kk0Var, (i112 & 112) | 12582912 | (i112 & 896) | (i112 & 7168) | (i112 & 57344), 96);
            rg3Var4 = rg3Var3;
            j7 = j5;
            j8 = j6;
            f3 = f2;
        }
        w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new wg(e01Var, eVar, cVar3, rg3Var4, j7, j8, f3, oe1Var, i, i2));
        }
    }

    /* JADX WARN: Code duplicated, block: B:115:0x0142 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:116:0x0144  */
    /* JADX WARN: Code duplicated, block: B:117:0x0147  */
    /* JADX WARN: Code duplicated, block: B:120:0x0154  */
    /* JADX WARN: Code duplicated, block: B:123:0x015e  */
    /* JADX WARN: Code duplicated, block: B:126:0x0168  */
    /* JADX WARN: Code duplicated, block: B:128:0x0174  */
    /* JADX WARN: Code duplicated, block: B:129:0x0176  */
    /* JADX WARN: Code duplicated, block: B:132:0x017b  */
    /* JADX WARN: Code duplicated, block: B:133:0x018e  */
    /* JADX WARN: Code duplicated, block: B:137:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:139:? A[RETURN, SYNTHETIC] */
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
    /* JADX WARN: Code duplicated, block: B:50:0x0080  */
    /* JADX WARN: Code duplicated, block: B:52:0x0088  */
    /* JADX WARN: Code duplicated, block: B:53:0x008b  */
    /* JADX WARN: Code duplicated, block: B:56:0x0091  */
    /* JADX WARN: Code duplicated, block: B:59:0x0099  */
    /* JADX WARN: Code duplicated, block: B:61:0x009d  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:65:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:72:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:74:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:78:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:83:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:85:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:87:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:88:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:92:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:96:0x0107  */
    /* JADX WARN: Code duplicated, block: B:98:0x0114  */
    /* JADX INFO: renamed from: ModalDrawerSheet-Snr_uVM, reason: not valid java name */
    public static final void m1822x8e69bb58(h01 h01Var, c cVar, rg3 rg3Var, long j, long j2, float f, e eVar, oe1 oe1Var, ck0 ck0Var, int i, int i2) {
        int i3;
        rg3 shape;
        long modalContainerColor;
        long jM2x310ea166;
        int i4;
        float f2;
        int i5;
        e eVar2;
        oe1 oe1Var2;
        int i6;
        c cVar2;
        int i7;
        c01 c01Var;
        c cVar3;
        float f3;
        c cVar4;
        rg3 rg3Var2;
        long j3;
        long j4;
        float f4;
        e windowInsets;
        e eVar3;
        c cVar5;
        rg3 rg3Var3;
        long j5;
        long j6;
        float f5;
        w33 w33VarV;
        int i8;
        int i9;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(1513027356);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (kk0Var.h(h01Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 == 0) {
            if ((i & 48) == 0) {
                i3 |= kk0Var.h(cVar) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                if ((i2 & 4) == 0) {
                    shape = rg3Var;
                    if (kk0Var.h(shape)) {
                        i9 = FontInfo.NUMBER_OF_CHAR_CODES;
                    }
                    i3 |= i9;
                } else {
                    shape = rg3Var;
                }
                i9 = Uuid.SIZE_BITS;
                i3 |= i9;
            } else {
                shape = rg3Var;
            }
            if ((i & 3072) == 0) {
                if ((i2 & 8) == 0) {
                    modalContainerColor = j;
                    int i11 = kk0Var.g(modalContainerColor) ? 2048 : 1024;
                    i3 |= i11;
                } else {
                    modalContainerColor = j;
                }
                i3 |= i11;
            } else {
                modalContainerColor = j;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    jM2x310ea166 = j2;
                    if (kk0Var.g(jM2x310ea166)) {
                        i8 = 16384;
                    }
                    i3 |= i8;
                } else {
                    jM2x310ea166 = j2;
                }
                i8 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                i3 |= i8;
            } else {
                jM2x310ea166 = j2;
            }
            i4 = i2 & 32;
            if (i4 != 0) {
                if ((196608 & i) == 0) {
                    f2 = f;
                    if (kk0Var.e(f2)) {
                        i5 = 131072;
                    } else {
                        i5 = 65536;
                    }
                    i3 |= i5;
                }
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        eVar2 = eVar;
                        int i12 = kk0Var.h(eVar2) ? 1048576 : 524288;
                        i3 |= i12;
                    } else {
                        eVar2 = eVar;
                    }
                    i3 |= i12;
                } else {
                    eVar2 = eVar;
                }
                if ((i2 & Uuid.SIZE_BITS) != 0) {
                    if ((i & 12582912) == 0) {
                        oe1Var2 = oe1Var;
                        if (kk0Var.j(oe1Var2)) {
                            i6 = 8388608;
                        } else {
                            i6 = 4194304;
                        }
                        i3 |= i6;
                    }
                    if ((i3 & 4793491) == 4793490 || !kk0Var.F()) {
                        kk0Var.X();
                        if ((i & 1) != 0 || kk0Var.D()) {
                            if (i10 != 0) {
                                cVar2 = c.i;
                            } else {
                                cVar2 = cVar;
                            }
                            i7 = i2 & 4;
                            c01Var = c01.a;
                            cVar3 = cVar2;
                            if (i7 != 0) {
                                shape = c01Var.getShape(kk0Var, 6);
                                i3 &= -897;
                            }
                            if ((i2 & 8) != 0) {
                                modalContainerColor = c01Var.getModalContainerColor(kk0Var, 6);
                                i3 &= -7169;
                            }
                            if ((i2 & 16) != 0) {
                                jM2x310ea166 = af0.m2x310ea166(modalContainerColor, kk0Var, (i3 >> 9) & 14);
                                i3 &= -57345;
                            }
                            if (i4 != 0) {
                                f3 = 0.0f;
                            } else {
                                f3 = f2;
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                                cVar4 = cVar3;
                                windowInsets = c01Var.getWindowInsets(kk0Var, 6);
                                rg3Var2 = shape;
                                j3 = modalContainerColor;
                                j4 = jM2x310ea166;
                                f4 = f3;
                            } else {
                                cVar4 = cVar3;
                                rg3Var2 = shape;
                                j3 = modalContainerColor;
                                j4 = jM2x310ea166;
                                f4 = f3;
                            }
                            kk0Var.s();
                            xj2.DrawerPredictiveBackHandler(h01Var, zg0.rememberComposableLambda(1552342929, true, new nj2(windowInsets, cVar4, rg3Var2, j3, j4, f4, oe1Var2), kk0Var, 54), kk0Var, (i3 & 14) | 48);
                            eVar3 = windowInsets;
                            cVar5 = cVar4;
                            rg3Var3 = rg3Var2;
                            j5 = j3;
                            j6 = j4;
                            f5 = f4;
                        } else {
                            kk0Var.V();
                            if ((i2 & 4) != 0) {
                                i3 &= -897;
                            }
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                            }
                            cVar4 = cVar;
                            rg3Var2 = shape;
                            j3 = modalContainerColor;
                            j4 = jM2x310ea166;
                            f4 = f2;
                        }
                        windowInsets = eVar2;
                        kk0Var.s();
                        xj2.DrawerPredictiveBackHandler(h01Var, zg0.rememberComposableLambda(1552342929, true, new nj2(windowInsets, cVar4, rg3Var2, j3, j4, f4, oe1Var2), kk0Var, 54), kk0Var, (i3 & 14) | 48);
                        eVar3 = windowInsets;
                        cVar5 = cVar4;
                        rg3Var3 = rg3Var2;
                        j5 = j3;
                        j6 = j4;
                        f5 = f4;
                    } else {
                        kk0Var.V();
                        cVar5 = cVar;
                        rg3Var3 = shape;
                        j5 = modalContainerColor;
                        j6 = jM2x310ea166;
                        f5 = f2;
                        eVar3 = eVar2;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new gj2(h01Var, cVar5, rg3Var3, j5, j6, f5, eVar3, oe1Var, i, i2, 1));
                    }
                }
                i3 |= 12582912;
                oe1Var2 = oe1Var;
                if ((i3 & 4793491) == 4793490) {
                    kk0Var.X();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            cVar2 = c.i;
                        } else {
                            cVar2 = cVar;
                        }
                        i7 = i2 & 4;
                        c01Var = c01.a;
                        cVar3 = cVar2;
                        if (i7 != 0) {
                            shape = c01Var.getShape(kk0Var, 6);
                            i3 &= -897;
                        }
                        if ((i2 & 8) != 0) {
                            modalContainerColor = c01Var.getModalContainerColor(kk0Var, 6);
                            i3 &= -7169;
                        }
                        if ((i2 & 16) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(modalContainerColor, kk0Var, (i3 >> 9) & 14);
                            i3 &= -57345;
                        }
                        if (i4 != 0) {
                            f3 = 0.0f;
                        } else {
                            f3 = f2;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            cVar4 = cVar3;
                            windowInsets = c01Var.getWindowInsets(kk0Var, 6);
                            rg3Var2 = shape;
                            j3 = modalContainerColor;
                            j4 = jM2x310ea166;
                            f4 = f3;
                        } else {
                            cVar4 = cVar3;
                            rg3Var2 = shape;
                            j3 = modalContainerColor;
                            j4 = jM2x310ea166;
                            f4 = f3;
                            windowInsets = eVar2;
                        }
                    } else {
                        if (i10 != 0) {
                            cVar2 = c.i;
                        } else {
                            cVar2 = cVar;
                        }
                        i7 = i2 & 4;
                        c01Var = c01.a;
                        cVar3 = cVar2;
                        if (i7 != 0) {
                            shape = c01Var.getShape(kk0Var, 6);
                            i3 &= -897;
                        }
                        if ((i2 & 8) != 0) {
                            modalContainerColor = c01Var.getModalContainerColor(kk0Var, 6);
                            i3 &= -7169;
                        }
                        if ((i2 & 16) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(modalContainerColor, kk0Var, (i3 >> 9) & 14);
                            i3 &= -57345;
                        }
                        if (i4 != 0) {
                            f3 = 0.0f;
                        } else {
                            f3 = f2;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            cVar4 = cVar3;
                            windowInsets = c01Var.getWindowInsets(kk0Var, 6);
                            rg3Var2 = shape;
                            j3 = modalContainerColor;
                            j4 = jM2x310ea166;
                            f4 = f3;
                        } else {
                            cVar4 = cVar3;
                            rg3Var2 = shape;
                            j3 = modalContainerColor;
                            j4 = jM2x310ea166;
                            f4 = f3;
                            windowInsets = eVar2;
                        }
                    }
                    kk0Var.s();
                    xj2.DrawerPredictiveBackHandler(h01Var, zg0.rememberComposableLambda(1552342929, true, new nj2(windowInsets, cVar4, rg3Var2, j3, j4, f4, oe1Var2), kk0Var, 54), kk0Var, (i3 & 14) | 48);
                    eVar3 = windowInsets;
                    cVar5 = cVar4;
                    rg3Var3 = rg3Var2;
                    j5 = j3;
                    j6 = j4;
                    f5 = f4;
                } else {
                    kk0Var.X();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            cVar2 = c.i;
                        } else {
                            cVar2 = cVar;
                        }
                        i7 = i2 & 4;
                        c01Var = c01.a;
                        cVar3 = cVar2;
                        if (i7 != 0) {
                            shape = c01Var.getShape(kk0Var, 6);
                            i3 &= -897;
                        }
                        if ((i2 & 8) != 0) {
                            modalContainerColor = c01Var.getModalContainerColor(kk0Var, 6);
                            i3 &= -7169;
                        }
                        if ((i2 & 16) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(modalContainerColor, kk0Var, (i3 >> 9) & 14);
                            i3 &= -57345;
                        }
                        if (i4 != 0) {
                            f3 = 0.0f;
                        } else {
                            f3 = f2;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            cVar4 = cVar3;
                            windowInsets = c01Var.getWindowInsets(kk0Var, 6);
                            rg3Var2 = shape;
                            j3 = modalContainerColor;
                            j4 = jM2x310ea166;
                            f4 = f3;
                        } else {
                            cVar4 = cVar3;
                            rg3Var2 = shape;
                            j3 = modalContainerColor;
                            j4 = jM2x310ea166;
                            f4 = f3;
                            windowInsets = eVar2;
                        }
                    } else {
                        if (i10 != 0) {
                            cVar2 = c.i;
                        } else {
                            cVar2 = cVar;
                        }
                        i7 = i2 & 4;
                        c01Var = c01.a;
                        cVar3 = cVar2;
                        if (i7 != 0) {
                            shape = c01Var.getShape(kk0Var, 6);
                            i3 &= -897;
                        }
                        if ((i2 & 8) != 0) {
                            modalContainerColor = c01Var.getModalContainerColor(kk0Var, 6);
                            i3 &= -7169;
                        }
                        if ((i2 & 16) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(modalContainerColor, kk0Var, (i3 >> 9) & 14);
                            i3 &= -57345;
                        }
                        if (i4 != 0) {
                            f3 = 0.0f;
                        } else {
                            f3 = f2;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            cVar4 = cVar3;
                            windowInsets = c01Var.getWindowInsets(kk0Var, 6);
                            rg3Var2 = shape;
                            j3 = modalContainerColor;
                            j4 = jM2x310ea166;
                            f4 = f3;
                        } else {
                            cVar4 = cVar3;
                            rg3Var2 = shape;
                            j3 = modalContainerColor;
                            j4 = jM2x310ea166;
                            f4 = f3;
                            windowInsets = eVar2;
                        }
                    }
                    kk0Var.s();
                    xj2.DrawerPredictiveBackHandler(h01Var, zg0.rememberComposableLambda(1552342929, true, new nj2(windowInsets, cVar4, rg3Var2, j3, j4, f4, oe1Var2), kk0Var, 54), kk0Var, (i3 & 14) | 48);
                    eVar3 = windowInsets;
                    cVar5 = cVar4;
                    rg3Var3 = rg3Var2;
                    j5 = j3;
                    j6 = j4;
                    f5 = f4;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new gj2(h01Var, cVar5, rg3Var3, j5, j6, f5, eVar3, oe1Var, i, i2, 1));
                }
            }
            i3 |= 196608;
            f2 = f;
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    eVar2 = eVar;
                    if (kk0Var.h(eVar2)) {
                    }
                    i3 |= i12;
                } else {
                    eVar2 = eVar;
                }
                i3 |= i12;
            } else {
                eVar2 = eVar;
            }
            if ((i2 & Uuid.SIZE_BITS) != 0) {
                if ((i & 12582912) == 0) {
                    oe1Var2 = oe1Var;
                    if (kk0Var.j(oe1Var2)) {
                        i6 = 8388608;
                    } else {
                        i6 = 4194304;
                    }
                    i3 |= i6;
                }
                if ((i3 & 4793491) == 4793490) {
                    kk0Var.X();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            cVar2 = c.i;
                        } else {
                            cVar2 = cVar;
                        }
                        i7 = i2 & 4;
                        c01Var = c01.a;
                        cVar3 = cVar2;
                        if (i7 != 0) {
                            shape = c01Var.getShape(kk0Var, 6);
                            i3 &= -897;
                        }
                        if ((i2 & 8) != 0) {
                            modalContainerColor = c01Var.getModalContainerColor(kk0Var, 6);
                            i3 &= -7169;
                        }
                        if ((i2 & 16) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(modalContainerColor, kk0Var, (i3 >> 9) & 14);
                            i3 &= -57345;
                        }
                        if (i4 != 0) {
                            f3 = 0.0f;
                        } else {
                            f3 = f2;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            cVar4 = cVar3;
                            windowInsets = c01Var.getWindowInsets(kk0Var, 6);
                            rg3Var2 = shape;
                            j3 = modalContainerColor;
                            j4 = jM2x310ea166;
                            f4 = f3;
                        } else {
                            cVar4 = cVar3;
                            rg3Var2 = shape;
                            j3 = modalContainerColor;
                            j4 = jM2x310ea166;
                            f4 = f3;
                            windowInsets = eVar2;
                        }
                    } else {
                        if (i10 != 0) {
                            cVar2 = c.i;
                        } else {
                            cVar2 = cVar;
                        }
                        i7 = i2 & 4;
                        c01Var = c01.a;
                        cVar3 = cVar2;
                        if (i7 != 0) {
                            shape = c01Var.getShape(kk0Var, 6);
                            i3 &= -897;
                        }
                        if ((i2 & 8) != 0) {
                            modalContainerColor = c01Var.getModalContainerColor(kk0Var, 6);
                            i3 &= -7169;
                        }
                        if ((i2 & 16) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(modalContainerColor, kk0Var, (i3 >> 9) & 14);
                            i3 &= -57345;
                        }
                        if (i4 != 0) {
                            f3 = 0.0f;
                        } else {
                            f3 = f2;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            cVar4 = cVar3;
                            windowInsets = c01Var.getWindowInsets(kk0Var, 6);
                            rg3Var2 = shape;
                            j3 = modalContainerColor;
                            j4 = jM2x310ea166;
                            f4 = f3;
                        } else {
                            cVar4 = cVar3;
                            rg3Var2 = shape;
                            j3 = modalContainerColor;
                            j4 = jM2x310ea166;
                            f4 = f3;
                            windowInsets = eVar2;
                        }
                    }
                    kk0Var.s();
                    xj2.DrawerPredictiveBackHandler(h01Var, zg0.rememberComposableLambda(1552342929, true, new nj2(windowInsets, cVar4, rg3Var2, j3, j4, f4, oe1Var2), kk0Var, 54), kk0Var, (i3 & 14) | 48);
                    eVar3 = windowInsets;
                    cVar5 = cVar4;
                    rg3Var3 = rg3Var2;
                    j5 = j3;
                    j6 = j4;
                    f5 = f4;
                } else {
                    kk0Var.X();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            cVar2 = c.i;
                        } else {
                            cVar2 = cVar;
                        }
                        i7 = i2 & 4;
                        c01Var = c01.a;
                        cVar3 = cVar2;
                        if (i7 != 0) {
                            shape = c01Var.getShape(kk0Var, 6);
                            i3 &= -897;
                        }
                        if ((i2 & 8) != 0) {
                            modalContainerColor = c01Var.getModalContainerColor(kk0Var, 6);
                            i3 &= -7169;
                        }
                        if ((i2 & 16) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(modalContainerColor, kk0Var, (i3 >> 9) & 14);
                            i3 &= -57345;
                        }
                        if (i4 != 0) {
                            f3 = 0.0f;
                        } else {
                            f3 = f2;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            cVar4 = cVar3;
                            windowInsets = c01Var.getWindowInsets(kk0Var, 6);
                            rg3Var2 = shape;
                            j3 = modalContainerColor;
                            j4 = jM2x310ea166;
                            f4 = f3;
                        } else {
                            cVar4 = cVar3;
                            rg3Var2 = shape;
                            j3 = modalContainerColor;
                            j4 = jM2x310ea166;
                            f4 = f3;
                            windowInsets = eVar2;
                        }
                    } else {
                        if (i10 != 0) {
                            cVar2 = c.i;
                        } else {
                            cVar2 = cVar;
                        }
                        i7 = i2 & 4;
                        c01Var = c01.a;
                        cVar3 = cVar2;
                        if (i7 != 0) {
                            shape = c01Var.getShape(kk0Var, 6);
                            i3 &= -897;
                        }
                        if ((i2 & 8) != 0) {
                            modalContainerColor = c01Var.getModalContainerColor(kk0Var, 6);
                            i3 &= -7169;
                        }
                        if ((i2 & 16) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(modalContainerColor, kk0Var, (i3 >> 9) & 14);
                            i3 &= -57345;
                        }
                        if (i4 != 0) {
                            f3 = 0.0f;
                        } else {
                            f3 = f2;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            cVar4 = cVar3;
                            windowInsets = c01Var.getWindowInsets(kk0Var, 6);
                            rg3Var2 = shape;
                            j3 = modalContainerColor;
                            j4 = jM2x310ea166;
                            f4 = f3;
                        } else {
                            cVar4 = cVar3;
                            rg3Var2 = shape;
                            j3 = modalContainerColor;
                            j4 = jM2x310ea166;
                            f4 = f3;
                            windowInsets = eVar2;
                        }
                    }
                    kk0Var.s();
                    xj2.DrawerPredictiveBackHandler(h01Var, zg0.rememberComposableLambda(1552342929, true, new nj2(windowInsets, cVar4, rg3Var2, j3, j4, f4, oe1Var2), kk0Var, 54), kk0Var, (i3 & 14) | 48);
                    eVar3 = windowInsets;
                    cVar5 = cVar4;
                    rg3Var3 = rg3Var2;
                    j5 = j3;
                    j6 = j4;
                    f5 = f4;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new gj2(h01Var, cVar5, rg3Var3, j5, j6, f5, eVar3, oe1Var, i, i2, 1));
                }
            }
            i3 |= 12582912;
            oe1Var2 = oe1Var;
            if ((i3 & 4793491) == 4793490) {
                kk0Var.X();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        cVar2 = c.i;
                    } else {
                        cVar2 = cVar;
                    }
                    i7 = i2 & 4;
                    c01Var = c01.a;
                    cVar3 = cVar2;
                    if (i7 != 0) {
                        shape = c01Var.getShape(kk0Var, 6);
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        modalContainerColor = c01Var.getModalContainerColor(kk0Var, 6);
                        i3 &= -7169;
                    }
                    if ((i2 & 16) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(modalContainerColor, kk0Var, (i3 >> 9) & 14);
                        i3 &= -57345;
                    }
                    if (i4 != 0) {
                        f3 = 0.0f;
                    } else {
                        f3 = f2;
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        cVar4 = cVar3;
                        windowInsets = c01Var.getWindowInsets(kk0Var, 6);
                        rg3Var2 = shape;
                        j3 = modalContainerColor;
                        j4 = jM2x310ea166;
                        f4 = f3;
                    } else {
                        cVar4 = cVar3;
                        rg3Var2 = shape;
                        j3 = modalContainerColor;
                        j4 = jM2x310ea166;
                        f4 = f3;
                        windowInsets = eVar2;
                    }
                } else {
                    if (i10 != 0) {
                        cVar2 = c.i;
                    } else {
                        cVar2 = cVar;
                    }
                    i7 = i2 & 4;
                    c01Var = c01.a;
                    cVar3 = cVar2;
                    if (i7 != 0) {
                        shape = c01Var.getShape(kk0Var, 6);
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        modalContainerColor = c01Var.getModalContainerColor(kk0Var, 6);
                        i3 &= -7169;
                    }
                    if ((i2 & 16) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(modalContainerColor, kk0Var, (i3 >> 9) & 14);
                        i3 &= -57345;
                    }
                    if (i4 != 0) {
                        f3 = 0.0f;
                    } else {
                        f3 = f2;
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        cVar4 = cVar3;
                        windowInsets = c01Var.getWindowInsets(kk0Var, 6);
                        rg3Var2 = shape;
                        j3 = modalContainerColor;
                        j4 = jM2x310ea166;
                        f4 = f3;
                    } else {
                        cVar4 = cVar3;
                        rg3Var2 = shape;
                        j3 = modalContainerColor;
                        j4 = jM2x310ea166;
                        f4 = f3;
                        windowInsets = eVar2;
                    }
                }
                kk0Var.s();
                xj2.DrawerPredictiveBackHandler(h01Var, zg0.rememberComposableLambda(1552342929, true, new nj2(windowInsets, cVar4, rg3Var2, j3, j4, f4, oe1Var2), kk0Var, 54), kk0Var, (i3 & 14) | 48);
                eVar3 = windowInsets;
                cVar5 = cVar4;
                rg3Var3 = rg3Var2;
                j5 = j3;
                j6 = j4;
                f5 = f4;
            } else {
                kk0Var.X();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        cVar2 = c.i;
                    } else {
                        cVar2 = cVar;
                    }
                    i7 = i2 & 4;
                    c01Var = c01.a;
                    cVar3 = cVar2;
                    if (i7 != 0) {
                        shape = c01Var.getShape(kk0Var, 6);
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        modalContainerColor = c01Var.getModalContainerColor(kk0Var, 6);
                        i3 &= -7169;
                    }
                    if ((i2 & 16) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(modalContainerColor, kk0Var, (i3 >> 9) & 14);
                        i3 &= -57345;
                    }
                    if (i4 != 0) {
                        f3 = 0.0f;
                    } else {
                        f3 = f2;
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        cVar4 = cVar3;
                        windowInsets = c01Var.getWindowInsets(kk0Var, 6);
                        rg3Var2 = shape;
                        j3 = modalContainerColor;
                        j4 = jM2x310ea166;
                        f4 = f3;
                    } else {
                        cVar4 = cVar3;
                        rg3Var2 = shape;
                        j3 = modalContainerColor;
                        j4 = jM2x310ea166;
                        f4 = f3;
                        windowInsets = eVar2;
                    }
                } else {
                    if (i10 != 0) {
                        cVar2 = c.i;
                    } else {
                        cVar2 = cVar;
                    }
                    i7 = i2 & 4;
                    c01Var = c01.a;
                    cVar3 = cVar2;
                    if (i7 != 0) {
                        shape = c01Var.getShape(kk0Var, 6);
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        modalContainerColor = c01Var.getModalContainerColor(kk0Var, 6);
                        i3 &= -7169;
                    }
                    if ((i2 & 16) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(modalContainerColor, kk0Var, (i3 >> 9) & 14);
                        i3 &= -57345;
                    }
                    if (i4 != 0) {
                        f3 = 0.0f;
                    } else {
                        f3 = f2;
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        cVar4 = cVar3;
                        windowInsets = c01Var.getWindowInsets(kk0Var, 6);
                        rg3Var2 = shape;
                        j3 = modalContainerColor;
                        j4 = jM2x310ea166;
                        f4 = f3;
                    } else {
                        cVar4 = cVar3;
                        rg3Var2 = shape;
                        j3 = modalContainerColor;
                        j4 = jM2x310ea166;
                        f4 = f3;
                        windowInsets = eVar2;
                    }
                }
                kk0Var.s();
                xj2.DrawerPredictiveBackHandler(h01Var, zg0.rememberComposableLambda(1552342929, true, new nj2(windowInsets, cVar4, rg3Var2, j3, j4, f4, oe1Var2), kk0Var, 54), kk0Var, (i3 & 14) | 48);
                eVar3 = windowInsets;
                cVar5 = cVar4;
                rg3Var3 = rg3Var2;
                j5 = j3;
                j6 = j4;
                f5 = f4;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new gj2(h01Var, cVar5, rg3Var3, j5, j6, f5, eVar3, oe1Var, i, i2, 1));
            }
        }
        i3 |= 48;
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                shape = rg3Var;
                if (kk0Var.h(shape)) {
                    i9 = FontInfo.NUMBER_OF_CHAR_CODES;
                }
                i3 |= i9;
            } else {
                shape = rg3Var;
            }
            i9 = Uuid.SIZE_BITS;
            i3 |= i9;
        } else {
            shape = rg3Var;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                modalContainerColor = j;
                if (kk0Var.g(modalContainerColor)) {
                }
                i3 |= i11;
            } else {
                modalContainerColor = j;
            }
            i3 |= i11;
        } else {
            modalContainerColor = j;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                jM2x310ea166 = j2;
                if (kk0Var.g(jM2x310ea166)) {
                    i8 = 16384;
                }
                i3 |= i8;
            } else {
                jM2x310ea166 = j2;
            }
            i8 = ConstantsKt.DEFAULT_BUFFER_SIZE;
            i3 |= i8;
        } else {
            jM2x310ea166 = j2;
        }
        i4 = i2 & 32;
        if (i4 != 0) {
            if ((196608 & i) == 0) {
                f2 = f;
                if (kk0Var.e(f2)) {
                    i5 = 131072;
                } else {
                    i5 = 65536;
                }
                i3 |= i5;
            }
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    eVar2 = eVar;
                    if (kk0Var.h(eVar2)) {
                    }
                    i3 |= i12;
                } else {
                    eVar2 = eVar;
                }
                i3 |= i12;
            } else {
                eVar2 = eVar;
            }
            if ((i2 & Uuid.SIZE_BITS) != 0) {
                if ((i & 12582912) == 0) {
                    oe1Var2 = oe1Var;
                    if (kk0Var.j(oe1Var2)) {
                        i6 = 8388608;
                    } else {
                        i6 = 4194304;
                    }
                    i3 |= i6;
                }
                if ((i3 & 4793491) == 4793490) {
                    kk0Var.X();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            cVar2 = c.i;
                        } else {
                            cVar2 = cVar;
                        }
                        i7 = i2 & 4;
                        c01Var = c01.a;
                        cVar3 = cVar2;
                        if (i7 != 0) {
                            shape = c01Var.getShape(kk0Var, 6);
                            i3 &= -897;
                        }
                        if ((i2 & 8) != 0) {
                            modalContainerColor = c01Var.getModalContainerColor(kk0Var, 6);
                            i3 &= -7169;
                        }
                        if ((i2 & 16) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(modalContainerColor, kk0Var, (i3 >> 9) & 14);
                            i3 &= -57345;
                        }
                        if (i4 != 0) {
                            f3 = 0.0f;
                        } else {
                            f3 = f2;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            cVar4 = cVar3;
                            windowInsets = c01Var.getWindowInsets(kk0Var, 6);
                            rg3Var2 = shape;
                            j3 = modalContainerColor;
                            j4 = jM2x310ea166;
                            f4 = f3;
                        } else {
                            cVar4 = cVar3;
                            rg3Var2 = shape;
                            j3 = modalContainerColor;
                            j4 = jM2x310ea166;
                            f4 = f3;
                            windowInsets = eVar2;
                        }
                    } else {
                        if (i10 != 0) {
                            cVar2 = c.i;
                        } else {
                            cVar2 = cVar;
                        }
                        i7 = i2 & 4;
                        c01Var = c01.a;
                        cVar3 = cVar2;
                        if (i7 != 0) {
                            shape = c01Var.getShape(kk0Var, 6);
                            i3 &= -897;
                        }
                        if ((i2 & 8) != 0) {
                            modalContainerColor = c01Var.getModalContainerColor(kk0Var, 6);
                            i3 &= -7169;
                        }
                        if ((i2 & 16) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(modalContainerColor, kk0Var, (i3 >> 9) & 14);
                            i3 &= -57345;
                        }
                        if (i4 != 0) {
                            f3 = 0.0f;
                        } else {
                            f3 = f2;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            cVar4 = cVar3;
                            windowInsets = c01Var.getWindowInsets(kk0Var, 6);
                            rg3Var2 = shape;
                            j3 = modalContainerColor;
                            j4 = jM2x310ea166;
                            f4 = f3;
                        } else {
                            cVar4 = cVar3;
                            rg3Var2 = shape;
                            j3 = modalContainerColor;
                            j4 = jM2x310ea166;
                            f4 = f3;
                            windowInsets = eVar2;
                        }
                    }
                    kk0Var.s();
                    xj2.DrawerPredictiveBackHandler(h01Var, zg0.rememberComposableLambda(1552342929, true, new nj2(windowInsets, cVar4, rg3Var2, j3, j4, f4, oe1Var2), kk0Var, 54), kk0Var, (i3 & 14) | 48);
                    eVar3 = windowInsets;
                    cVar5 = cVar4;
                    rg3Var3 = rg3Var2;
                    j5 = j3;
                    j6 = j4;
                    f5 = f4;
                } else {
                    kk0Var.X();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            cVar2 = c.i;
                        } else {
                            cVar2 = cVar;
                        }
                        i7 = i2 & 4;
                        c01Var = c01.a;
                        cVar3 = cVar2;
                        if (i7 != 0) {
                            shape = c01Var.getShape(kk0Var, 6);
                            i3 &= -897;
                        }
                        if ((i2 & 8) != 0) {
                            modalContainerColor = c01Var.getModalContainerColor(kk0Var, 6);
                            i3 &= -7169;
                        }
                        if ((i2 & 16) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(modalContainerColor, kk0Var, (i3 >> 9) & 14);
                            i3 &= -57345;
                        }
                        if (i4 != 0) {
                            f3 = 0.0f;
                        } else {
                            f3 = f2;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            cVar4 = cVar3;
                            windowInsets = c01Var.getWindowInsets(kk0Var, 6);
                            rg3Var2 = shape;
                            j3 = modalContainerColor;
                            j4 = jM2x310ea166;
                            f4 = f3;
                        } else {
                            cVar4 = cVar3;
                            rg3Var2 = shape;
                            j3 = modalContainerColor;
                            j4 = jM2x310ea166;
                            f4 = f3;
                            windowInsets = eVar2;
                        }
                    } else {
                        if (i10 != 0) {
                            cVar2 = c.i;
                        } else {
                            cVar2 = cVar;
                        }
                        i7 = i2 & 4;
                        c01Var = c01.a;
                        cVar3 = cVar2;
                        if (i7 != 0) {
                            shape = c01Var.getShape(kk0Var, 6);
                            i3 &= -897;
                        }
                        if ((i2 & 8) != 0) {
                            modalContainerColor = c01Var.getModalContainerColor(kk0Var, 6);
                            i3 &= -7169;
                        }
                        if ((i2 & 16) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(modalContainerColor, kk0Var, (i3 >> 9) & 14);
                            i3 &= -57345;
                        }
                        if (i4 != 0) {
                            f3 = 0.0f;
                        } else {
                            f3 = f2;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            cVar4 = cVar3;
                            windowInsets = c01Var.getWindowInsets(kk0Var, 6);
                            rg3Var2 = shape;
                            j3 = modalContainerColor;
                            j4 = jM2x310ea166;
                            f4 = f3;
                        } else {
                            cVar4 = cVar3;
                            rg3Var2 = shape;
                            j3 = modalContainerColor;
                            j4 = jM2x310ea166;
                            f4 = f3;
                            windowInsets = eVar2;
                        }
                    }
                    kk0Var.s();
                    xj2.DrawerPredictiveBackHandler(h01Var, zg0.rememberComposableLambda(1552342929, true, new nj2(windowInsets, cVar4, rg3Var2, j3, j4, f4, oe1Var2), kk0Var, 54), kk0Var, (i3 & 14) | 48);
                    eVar3 = windowInsets;
                    cVar5 = cVar4;
                    rg3Var3 = rg3Var2;
                    j5 = j3;
                    j6 = j4;
                    f5 = f4;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new gj2(h01Var, cVar5, rg3Var3, j5, j6, f5, eVar3, oe1Var, i, i2, 1));
                }
            }
            i3 |= 12582912;
            oe1Var2 = oe1Var;
            if ((i3 & 4793491) == 4793490) {
                kk0Var.X();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        cVar2 = c.i;
                    } else {
                        cVar2 = cVar;
                    }
                    i7 = i2 & 4;
                    c01Var = c01.a;
                    cVar3 = cVar2;
                    if (i7 != 0) {
                        shape = c01Var.getShape(kk0Var, 6);
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        modalContainerColor = c01Var.getModalContainerColor(kk0Var, 6);
                        i3 &= -7169;
                    }
                    if ((i2 & 16) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(modalContainerColor, kk0Var, (i3 >> 9) & 14);
                        i3 &= -57345;
                    }
                    if (i4 != 0) {
                        f3 = 0.0f;
                    } else {
                        f3 = f2;
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        cVar4 = cVar3;
                        windowInsets = c01Var.getWindowInsets(kk0Var, 6);
                        rg3Var2 = shape;
                        j3 = modalContainerColor;
                        j4 = jM2x310ea166;
                        f4 = f3;
                    } else {
                        cVar4 = cVar3;
                        rg3Var2 = shape;
                        j3 = modalContainerColor;
                        j4 = jM2x310ea166;
                        f4 = f3;
                        windowInsets = eVar2;
                    }
                } else {
                    if (i10 != 0) {
                        cVar2 = c.i;
                    } else {
                        cVar2 = cVar;
                    }
                    i7 = i2 & 4;
                    c01Var = c01.a;
                    cVar3 = cVar2;
                    if (i7 != 0) {
                        shape = c01Var.getShape(kk0Var, 6);
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        modalContainerColor = c01Var.getModalContainerColor(kk0Var, 6);
                        i3 &= -7169;
                    }
                    if ((i2 & 16) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(modalContainerColor, kk0Var, (i3 >> 9) & 14);
                        i3 &= -57345;
                    }
                    if (i4 != 0) {
                        f3 = 0.0f;
                    } else {
                        f3 = f2;
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        cVar4 = cVar3;
                        windowInsets = c01Var.getWindowInsets(kk0Var, 6);
                        rg3Var2 = shape;
                        j3 = modalContainerColor;
                        j4 = jM2x310ea166;
                        f4 = f3;
                    } else {
                        cVar4 = cVar3;
                        rg3Var2 = shape;
                        j3 = modalContainerColor;
                        j4 = jM2x310ea166;
                        f4 = f3;
                        windowInsets = eVar2;
                    }
                }
                kk0Var.s();
                xj2.DrawerPredictiveBackHandler(h01Var, zg0.rememberComposableLambda(1552342929, true, new nj2(windowInsets, cVar4, rg3Var2, j3, j4, f4, oe1Var2), kk0Var, 54), kk0Var, (i3 & 14) | 48);
                eVar3 = windowInsets;
                cVar5 = cVar4;
                rg3Var3 = rg3Var2;
                j5 = j3;
                j6 = j4;
                f5 = f4;
            } else {
                kk0Var.X();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        cVar2 = c.i;
                    } else {
                        cVar2 = cVar;
                    }
                    i7 = i2 & 4;
                    c01Var = c01.a;
                    cVar3 = cVar2;
                    if (i7 != 0) {
                        shape = c01Var.getShape(kk0Var, 6);
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        modalContainerColor = c01Var.getModalContainerColor(kk0Var, 6);
                        i3 &= -7169;
                    }
                    if ((i2 & 16) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(modalContainerColor, kk0Var, (i3 >> 9) & 14);
                        i3 &= -57345;
                    }
                    if (i4 != 0) {
                        f3 = 0.0f;
                    } else {
                        f3 = f2;
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        cVar4 = cVar3;
                        windowInsets = c01Var.getWindowInsets(kk0Var, 6);
                        rg3Var2 = shape;
                        j3 = modalContainerColor;
                        j4 = jM2x310ea166;
                        f4 = f3;
                    } else {
                        cVar4 = cVar3;
                        rg3Var2 = shape;
                        j3 = modalContainerColor;
                        j4 = jM2x310ea166;
                        f4 = f3;
                        windowInsets = eVar2;
                    }
                } else {
                    if (i10 != 0) {
                        cVar2 = c.i;
                    } else {
                        cVar2 = cVar;
                    }
                    i7 = i2 & 4;
                    c01Var = c01.a;
                    cVar3 = cVar2;
                    if (i7 != 0) {
                        shape = c01Var.getShape(kk0Var, 6);
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        modalContainerColor = c01Var.getModalContainerColor(kk0Var, 6);
                        i3 &= -7169;
                    }
                    if ((i2 & 16) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(modalContainerColor, kk0Var, (i3 >> 9) & 14);
                        i3 &= -57345;
                    }
                    if (i4 != 0) {
                        f3 = 0.0f;
                    } else {
                        f3 = f2;
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        cVar4 = cVar3;
                        windowInsets = c01Var.getWindowInsets(kk0Var, 6);
                        rg3Var2 = shape;
                        j3 = modalContainerColor;
                        j4 = jM2x310ea166;
                        f4 = f3;
                    } else {
                        cVar4 = cVar3;
                        rg3Var2 = shape;
                        j3 = modalContainerColor;
                        j4 = jM2x310ea166;
                        f4 = f3;
                        windowInsets = eVar2;
                    }
                }
                kk0Var.s();
                xj2.DrawerPredictiveBackHandler(h01Var, zg0.rememberComposableLambda(1552342929, true, new nj2(windowInsets, cVar4, rg3Var2, j3, j4, f4, oe1Var2), kk0Var, 54), kk0Var, (i3 & 14) | 48);
                eVar3 = windowInsets;
                cVar5 = cVar4;
                rg3Var3 = rg3Var2;
                j5 = j3;
                j6 = j4;
                f5 = f4;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new gj2(h01Var, cVar5, rg3Var3, j5, j6, f5, eVar3, oe1Var, i, i2, 1));
            }
        }
        i3 |= 196608;
        f2 = f;
        if ((1572864 & i) == 0) {
            if ((i2 & 64) == 0) {
                eVar2 = eVar;
                if (kk0Var.h(eVar2)) {
                }
                i3 |= i12;
            } else {
                eVar2 = eVar;
            }
            i3 |= i12;
        } else {
            eVar2 = eVar;
        }
        if ((i2 & Uuid.SIZE_BITS) != 0) {
            if ((i & 12582912) == 0) {
                oe1Var2 = oe1Var;
                if (kk0Var.j(oe1Var2)) {
                    i6 = 8388608;
                } else {
                    i6 = 4194304;
                }
                i3 |= i6;
            }
            if ((i3 & 4793491) == 4793490) {
                kk0Var.X();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        cVar2 = c.i;
                    } else {
                        cVar2 = cVar;
                    }
                    i7 = i2 & 4;
                    c01Var = c01.a;
                    cVar3 = cVar2;
                    if (i7 != 0) {
                        shape = c01Var.getShape(kk0Var, 6);
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        modalContainerColor = c01Var.getModalContainerColor(kk0Var, 6);
                        i3 &= -7169;
                    }
                    if ((i2 & 16) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(modalContainerColor, kk0Var, (i3 >> 9) & 14);
                        i3 &= -57345;
                    }
                    if (i4 != 0) {
                        f3 = 0.0f;
                    } else {
                        f3 = f2;
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        cVar4 = cVar3;
                        windowInsets = c01Var.getWindowInsets(kk0Var, 6);
                        rg3Var2 = shape;
                        j3 = modalContainerColor;
                        j4 = jM2x310ea166;
                        f4 = f3;
                    } else {
                        cVar4 = cVar3;
                        rg3Var2 = shape;
                        j3 = modalContainerColor;
                        j4 = jM2x310ea166;
                        f4 = f3;
                        windowInsets = eVar2;
                    }
                } else {
                    if (i10 != 0) {
                        cVar2 = c.i;
                    } else {
                        cVar2 = cVar;
                    }
                    i7 = i2 & 4;
                    c01Var = c01.a;
                    cVar3 = cVar2;
                    if (i7 != 0) {
                        shape = c01Var.getShape(kk0Var, 6);
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        modalContainerColor = c01Var.getModalContainerColor(kk0Var, 6);
                        i3 &= -7169;
                    }
                    if ((i2 & 16) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(modalContainerColor, kk0Var, (i3 >> 9) & 14);
                        i3 &= -57345;
                    }
                    if (i4 != 0) {
                        f3 = 0.0f;
                    } else {
                        f3 = f2;
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        cVar4 = cVar3;
                        windowInsets = c01Var.getWindowInsets(kk0Var, 6);
                        rg3Var2 = shape;
                        j3 = modalContainerColor;
                        j4 = jM2x310ea166;
                        f4 = f3;
                    } else {
                        cVar4 = cVar3;
                        rg3Var2 = shape;
                        j3 = modalContainerColor;
                        j4 = jM2x310ea166;
                        f4 = f3;
                        windowInsets = eVar2;
                    }
                }
                kk0Var.s();
                xj2.DrawerPredictiveBackHandler(h01Var, zg0.rememberComposableLambda(1552342929, true, new nj2(windowInsets, cVar4, rg3Var2, j3, j4, f4, oe1Var2), kk0Var, 54), kk0Var, (i3 & 14) | 48);
                eVar3 = windowInsets;
                cVar5 = cVar4;
                rg3Var3 = rg3Var2;
                j5 = j3;
                j6 = j4;
                f5 = f4;
            } else {
                kk0Var.X();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        cVar2 = c.i;
                    } else {
                        cVar2 = cVar;
                    }
                    i7 = i2 & 4;
                    c01Var = c01.a;
                    cVar3 = cVar2;
                    if (i7 != 0) {
                        shape = c01Var.getShape(kk0Var, 6);
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        modalContainerColor = c01Var.getModalContainerColor(kk0Var, 6);
                        i3 &= -7169;
                    }
                    if ((i2 & 16) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(modalContainerColor, kk0Var, (i3 >> 9) & 14);
                        i3 &= -57345;
                    }
                    if (i4 != 0) {
                        f3 = 0.0f;
                    } else {
                        f3 = f2;
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        cVar4 = cVar3;
                        windowInsets = c01Var.getWindowInsets(kk0Var, 6);
                        rg3Var2 = shape;
                        j3 = modalContainerColor;
                        j4 = jM2x310ea166;
                        f4 = f3;
                    } else {
                        cVar4 = cVar3;
                        rg3Var2 = shape;
                        j3 = modalContainerColor;
                        j4 = jM2x310ea166;
                        f4 = f3;
                        windowInsets = eVar2;
                    }
                } else {
                    if (i10 != 0) {
                        cVar2 = c.i;
                    } else {
                        cVar2 = cVar;
                    }
                    i7 = i2 & 4;
                    c01Var = c01.a;
                    cVar3 = cVar2;
                    if (i7 != 0) {
                        shape = c01Var.getShape(kk0Var, 6);
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        modalContainerColor = c01Var.getModalContainerColor(kk0Var, 6);
                        i3 &= -7169;
                    }
                    if ((i2 & 16) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(modalContainerColor, kk0Var, (i3 >> 9) & 14);
                        i3 &= -57345;
                    }
                    if (i4 != 0) {
                        f3 = 0.0f;
                    } else {
                        f3 = f2;
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        cVar4 = cVar3;
                        windowInsets = c01Var.getWindowInsets(kk0Var, 6);
                        rg3Var2 = shape;
                        j3 = modalContainerColor;
                        j4 = jM2x310ea166;
                        f4 = f3;
                    } else {
                        cVar4 = cVar3;
                        rg3Var2 = shape;
                        j3 = modalContainerColor;
                        j4 = jM2x310ea166;
                        f4 = f3;
                        windowInsets = eVar2;
                    }
                }
                kk0Var.s();
                xj2.DrawerPredictiveBackHandler(h01Var, zg0.rememberComposableLambda(1552342929, true, new nj2(windowInsets, cVar4, rg3Var2, j3, j4, f4, oe1Var2), kk0Var, 54), kk0Var, (i3 & 14) | 48);
                eVar3 = windowInsets;
                cVar5 = cVar4;
                rg3Var3 = rg3Var2;
                j5 = j3;
                j6 = j4;
                f5 = f4;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new gj2(h01Var, cVar5, rg3Var3, j5, j6, f5, eVar3, oe1Var, i, i2, 1));
            }
        }
        i3 |= 12582912;
        oe1Var2 = oe1Var;
        if ((i3 & 4793491) == 4793490) {
            kk0Var.X();
            if ((i & 1) != 0) {
                if (i10 != 0) {
                    cVar2 = c.i;
                } else {
                    cVar2 = cVar;
                }
                i7 = i2 & 4;
                c01Var = c01.a;
                cVar3 = cVar2;
                if (i7 != 0) {
                    shape = c01Var.getShape(kk0Var, 6);
                    i3 &= -897;
                }
                if ((i2 & 8) != 0) {
                    modalContainerColor = c01Var.getModalContainerColor(kk0Var, 6);
                    i3 &= -7169;
                }
                if ((i2 & 16) != 0) {
                    jM2x310ea166 = af0.m2x310ea166(modalContainerColor, kk0Var, (i3 >> 9) & 14);
                    i3 &= -57345;
                }
                if (i4 != 0) {
                    f3 = 0.0f;
                } else {
                    f3 = f2;
                }
                if ((i2 & 64) != 0) {
                    i3 &= -3670017;
                    cVar4 = cVar3;
                    windowInsets = c01Var.getWindowInsets(kk0Var, 6);
                    rg3Var2 = shape;
                    j3 = modalContainerColor;
                    j4 = jM2x310ea166;
                    f4 = f3;
                } else {
                    cVar4 = cVar3;
                    rg3Var2 = shape;
                    j3 = modalContainerColor;
                    j4 = jM2x310ea166;
                    f4 = f3;
                    windowInsets = eVar2;
                }
            } else {
                if (i10 != 0) {
                    cVar2 = c.i;
                } else {
                    cVar2 = cVar;
                }
                i7 = i2 & 4;
                c01Var = c01.a;
                cVar3 = cVar2;
                if (i7 != 0) {
                    shape = c01Var.getShape(kk0Var, 6);
                    i3 &= -897;
                }
                if ((i2 & 8) != 0) {
                    modalContainerColor = c01Var.getModalContainerColor(kk0Var, 6);
                    i3 &= -7169;
                }
                if ((i2 & 16) != 0) {
                    jM2x310ea166 = af0.m2x310ea166(modalContainerColor, kk0Var, (i3 >> 9) & 14);
                    i3 &= -57345;
                }
                if (i4 != 0) {
                    f3 = 0.0f;
                } else {
                    f3 = f2;
                }
                if ((i2 & 64) != 0) {
                    i3 &= -3670017;
                    cVar4 = cVar3;
                    windowInsets = c01Var.getWindowInsets(kk0Var, 6);
                    rg3Var2 = shape;
                    j3 = modalContainerColor;
                    j4 = jM2x310ea166;
                    f4 = f3;
                } else {
                    cVar4 = cVar3;
                    rg3Var2 = shape;
                    j3 = modalContainerColor;
                    j4 = jM2x310ea166;
                    f4 = f3;
                    windowInsets = eVar2;
                }
            }
            kk0Var.s();
            xj2.DrawerPredictiveBackHandler(h01Var, zg0.rememberComposableLambda(1552342929, true, new nj2(windowInsets, cVar4, rg3Var2, j3, j4, f4, oe1Var2), kk0Var, 54), kk0Var, (i3 & 14) | 48);
            eVar3 = windowInsets;
            cVar5 = cVar4;
            rg3Var3 = rg3Var2;
            j5 = j3;
            j6 = j4;
            f5 = f4;
        } else {
            kk0Var.X();
            if ((i & 1) != 0) {
                if (i10 != 0) {
                    cVar2 = c.i;
                } else {
                    cVar2 = cVar;
                }
                i7 = i2 & 4;
                c01Var = c01.a;
                cVar3 = cVar2;
                if (i7 != 0) {
                    shape = c01Var.getShape(kk0Var, 6);
                    i3 &= -897;
                }
                if ((i2 & 8) != 0) {
                    modalContainerColor = c01Var.getModalContainerColor(kk0Var, 6);
                    i3 &= -7169;
                }
                if ((i2 & 16) != 0) {
                    jM2x310ea166 = af0.m2x310ea166(modalContainerColor, kk0Var, (i3 >> 9) & 14);
                    i3 &= -57345;
                }
                if (i4 != 0) {
                    f3 = 0.0f;
                } else {
                    f3 = f2;
                }
                if ((i2 & 64) != 0) {
                    i3 &= -3670017;
                    cVar4 = cVar3;
                    windowInsets = c01Var.getWindowInsets(kk0Var, 6);
                    rg3Var2 = shape;
                    j3 = modalContainerColor;
                    j4 = jM2x310ea166;
                    f4 = f3;
                } else {
                    cVar4 = cVar3;
                    rg3Var2 = shape;
                    j3 = modalContainerColor;
                    j4 = jM2x310ea166;
                    f4 = f3;
                    windowInsets = eVar2;
                }
            } else {
                if (i10 != 0) {
                    cVar2 = c.i;
                } else {
                    cVar2 = cVar;
                }
                i7 = i2 & 4;
                c01Var = c01.a;
                cVar3 = cVar2;
                if (i7 != 0) {
                    shape = c01Var.getShape(kk0Var, 6);
                    i3 &= -897;
                }
                if ((i2 & 8) != 0) {
                    modalContainerColor = c01Var.getModalContainerColor(kk0Var, 6);
                    i3 &= -7169;
                }
                if ((i2 & 16) != 0) {
                    jM2x310ea166 = af0.m2x310ea166(modalContainerColor, kk0Var, (i3 >> 9) & 14);
                    i3 &= -57345;
                }
                if (i4 != 0) {
                    f3 = 0.0f;
                } else {
                    f3 = f2;
                }
                if ((i2 & 64) != 0) {
                    i3 &= -3670017;
                    cVar4 = cVar3;
                    windowInsets = c01Var.getWindowInsets(kk0Var, 6);
                    rg3Var2 = shape;
                    j3 = modalContainerColor;
                    j4 = jM2x310ea166;
                    f4 = f3;
                } else {
                    cVar4 = cVar3;
                    rg3Var2 = shape;
                    j3 = modalContainerColor;
                    j4 = jM2x310ea166;
                    f4 = f3;
                    windowInsets = eVar2;
                }
            }
            kk0Var.s();
            xj2.DrawerPredictiveBackHandler(h01Var, zg0.rememberComposableLambda(1552342929, true, new nj2(windowInsets, cVar4, rg3Var2, j3, j4, f4, oe1Var2), kk0Var, 54), kk0Var, (i3 & 14) | 48);
            eVar3 = windowInsets;
            cVar5 = cVar4;
            rg3Var3 = rg3Var2;
            j5 = j3;
            j6 = j4;
            f5 = f4;
        }
        w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new gj2(h01Var, cVar5, rg3Var3, j5, j6, f5, eVar3, oe1Var, i, i2, 1));
        }
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0121 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:106:0x0123  */
    /* JADX WARN: Code duplicated, block: B:107:0x0126  */
    /* JADX WARN: Code duplicated, block: B:110:0x012d  */
    /* JADX WARN: Code duplicated, block: B:113:0x0138  */
    /* JADX WARN: Code duplicated, block: B:116:0x0142  */
    /* JADX WARN: Code duplicated, block: B:118:0x014f  */
    /* JADX WARN: Code duplicated, block: B:121:0x0155  */
    /* JADX WARN: Code duplicated, block: B:125:0x019a  */
    /* JADX WARN: Code duplicated, block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x009b  */
    /* JADX WARN: Code duplicated, block: B:61:0x009f  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:72:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:76:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:77:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:86:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f6  */
    /* JADX INFO: renamed from: ModalDrawerSheet-afqeVBk, reason: not valid java name */
    public static final void m1823x654e5ffa(c cVar, rg3 rg3Var, long j, long j2, float f, e eVar, oe1 oe1Var, ck0 ck0Var, int i, int i2) {
        c cVar2;
        int i3;
        rg3 shape;
        long modalContainerColor;
        long jM2x310ea166;
        float f2;
        e windowInsets;
        oe1 oe1Var2;
        int i4;
        c cVar3;
        int i5;
        c01 c01Var;
        kk0 kk0Var;
        rg3 rg3Var2;
        long j3;
        long j4;
        float f3;
        e eVar2;
        w33 w33VarV;
        int i6;
        kk0 kk0Var2 = (kk0) ck0Var;
        kk0Var2.c0(1001163336);
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 = i | 6;
            cVar2 = cVar;
        } else if ((i & 6) == 0) {
            cVar2 = cVar;
            i3 = (kk0Var2.h(cVar2) ? 4 : 2) | i;
        } else {
            cVar2 = cVar;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                shape = rg3Var;
                int i8 = kk0Var2.h(shape) ? 32 : 16;
                i3 |= i8;
            } else {
                shape = rg3Var;
            }
            i3 |= i8;
        } else {
            shape = rg3Var;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                modalContainerColor = j;
                if (kk0Var2.g(modalContainerColor)) {
                    i6 = FontInfo.NUMBER_OF_CHAR_CODES;
                }
                i3 |= i6;
            } else {
                modalContainerColor = j;
            }
            i6 = Uuid.SIZE_BITS;
            i3 |= i6;
        } else {
            modalContainerColor = j;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                jM2x310ea166 = j2;
                int i9 = kk0Var2.g(jM2x310ea166) ? 2048 : 1024;
                i3 |= i9;
            } else {
                jM2x310ea166 = j2;
            }
            i3 |= i9;
        } else {
            jM2x310ea166 = j2;
        }
        int i10 = i2 & 16;
        if (i10 == 0) {
            if ((i & 24576) == 0) {
                f2 = f;
                i3 |= kk0Var2.e(f2) ? 16384 : ConstantsKt.DEFAULT_BUFFER_SIZE;
            }
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0) {
                    windowInsets = eVar;
                    int i11 = kk0Var2.h(windowInsets) ? 131072 : 65536;
                    i3 |= i11;
                } else {
                    windowInsets = eVar;
                }
                i3 |= i11;
            } else {
                windowInsets = eVar;
            }
            if ((i2 & 64) != 0) {
                if ((i & 1572864) == 0) {
                    oe1Var2 = oe1Var;
                    if (kk0Var2.j(oe1Var2)) {
                        i4 = 1048576;
                    } else {
                        i4 = 524288;
                    }
                    i3 |= i4;
                }
                if ((599187 & i3) == 599186 || !kk0Var2.F()) {
                    kk0Var2.X();
                    if ((i & 1) != 0 || kk0Var2.D()) {
                        if (i7 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        i5 = i2 & 2;
                        c01Var = c01.a;
                        if (i5 != 0) {
                            i3 &= -113;
                            shape = c01Var.getShape(kk0Var2, 6);
                        }
                        if ((i2 & 4) != 0) {
                            modalContainerColor = c01Var.getModalContainerColor(kk0Var2, 6);
                            i3 &= -897;
                        }
                        if ((i2 & 8) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(modalContainerColor, kk0Var2, (i3 >> 6) & 14);
                            i3 &= -7169;
                        }
                        if (i10 != 0) {
                            f2 = 0.0f;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            windowInsets = c01Var.getWindowInsets(kk0Var2, 6);
                        }
                    } else {
                        kk0Var2.V();
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                        }
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                        }
                        cVar3 = cVar2;
                    }
                    rg3 rg3Var3 = shape;
                    long j5 = jM2x310ea166;
                    float f4 = f2;
                    long j6 = modalContainerColor;
                    kk0Var2.s();
                    int i12 = i3 << 6;
                    kk0Var = kk0Var2;
                    m1821xd59157b8(null, windowInsets, cVar3, rg3Var3, j6, j5, f4, oe1Var2, kk0Var, 6 | ((i3 >> 12) & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (458752 & i12) | (i12 & 3670016) | ((i3 << 3) & 29360128), 0);
                    rg3Var2 = rg3Var3;
                    j3 = j6;
                    j4 = j5;
                    f3 = f4;
                } else {
                    kk0Var2.V();
                    kk0Var = kk0Var2;
                    cVar3 = cVar2;
                    rg3Var2 = shape;
                    j3 = modalContainerColor;
                    j4 = jM2x310ea166;
                    f3 = f2;
                }
                eVar2 = windowInsets;
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new ej2(cVar3, rg3Var2, j3, j4, f3, eVar2, oe1Var, i, i2, 1));
                }
            }
            i3 |= 1572864;
            oe1Var2 = oe1Var;
            if ((599187 & i3) == 599186) {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i7 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    i5 = i2 & 2;
                    c01Var = c01.a;
                    if (i5 != 0) {
                        i3 &= -113;
                        shape = c01Var.getShape(kk0Var2, 6);
                    }
                    if ((i2 & 4) != 0) {
                        modalContainerColor = c01Var.getModalContainerColor(kk0Var2, 6);
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(modalContainerColor, kk0Var2, (i3 >> 6) & 14);
                        i3 &= -7169;
                    }
                    if (i10 != 0) {
                        f2 = 0.0f;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        windowInsets = c01Var.getWindowInsets(kk0Var2, 6);
                    }
                } else {
                    if (i7 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    i5 = i2 & 2;
                    c01Var = c01.a;
                    if (i5 != 0) {
                        i3 &= -113;
                        shape = c01Var.getShape(kk0Var2, 6);
                    }
                    if ((i2 & 4) != 0) {
                        modalContainerColor = c01Var.getModalContainerColor(kk0Var2, 6);
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(modalContainerColor, kk0Var2, (i3 >> 6) & 14);
                        i3 &= -7169;
                    }
                    if (i10 != 0) {
                        f2 = 0.0f;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        windowInsets = c01Var.getWindowInsets(kk0Var2, 6);
                    }
                }
                rg3 rg3Var4 = shape;
                long j7 = jM2x310ea166;
                float f5 = f2;
                long j8 = modalContainerColor;
                kk0Var2.s();
                int i13 = i3 << 6;
                kk0Var = kk0Var2;
                m1821xd59157b8(null, windowInsets, cVar3, rg3Var4, j8, j7, f5, oe1Var2, kk0Var, 6 | ((i3 >> 12) & 112) | (i13 & 896) | (i13 & 7168) | (57344 & i13) | (458752 & i13) | (i13 & 3670016) | ((i3 << 3) & 29360128), 0);
                rg3Var2 = rg3Var4;
                j3 = j8;
                j4 = j7;
                f3 = f5;
            } else {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i7 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    i5 = i2 & 2;
                    c01Var = c01.a;
                    if (i5 != 0) {
                        i3 &= -113;
                        shape = c01Var.getShape(kk0Var2, 6);
                    }
                    if ((i2 & 4) != 0) {
                        modalContainerColor = c01Var.getModalContainerColor(kk0Var2, 6);
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(modalContainerColor, kk0Var2, (i3 >> 6) & 14);
                        i3 &= -7169;
                    }
                    if (i10 != 0) {
                        f2 = 0.0f;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        windowInsets = c01Var.getWindowInsets(kk0Var2, 6);
                    }
                } else {
                    if (i7 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    i5 = i2 & 2;
                    c01Var = c01.a;
                    if (i5 != 0) {
                        i3 &= -113;
                        shape = c01Var.getShape(kk0Var2, 6);
                    }
                    if ((i2 & 4) != 0) {
                        modalContainerColor = c01Var.getModalContainerColor(kk0Var2, 6);
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(modalContainerColor, kk0Var2, (i3 >> 6) & 14);
                        i3 &= -7169;
                    }
                    if (i10 != 0) {
                        f2 = 0.0f;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        windowInsets = c01Var.getWindowInsets(kk0Var2, 6);
                    }
                }
                rg3 rg3Var5 = shape;
                long j9 = jM2x310ea166;
                float f6 = f2;
                long j10 = modalContainerColor;
                kk0Var2.s();
                int i14 = i3 << 6;
                kk0Var = kk0Var2;
                m1821xd59157b8(null, windowInsets, cVar3, rg3Var5, j10, j9, f6, oe1Var2, kk0Var, 6 | ((i3 >> 12) & 112) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | (i14 & 3670016) | ((i3 << 3) & 29360128), 0);
                rg3Var2 = rg3Var5;
                j3 = j10;
                j4 = j9;
                f3 = f6;
            }
            eVar2 = windowInsets;
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new ej2(cVar3, rg3Var2, j3, j4, f3, eVar2, oe1Var, i, i2, 1));
            }
        }
        i3 |= 24576;
        f2 = f;
        if ((196608 & i) == 0) {
            if ((i2 & 32) == 0) {
                windowInsets = eVar;
                if (kk0Var2.h(windowInsets)) {
                }
                i3 |= i11;
            } else {
                windowInsets = eVar;
            }
            i3 |= i11;
        } else {
            windowInsets = eVar;
        }
        if ((i2 & 64) != 0) {
            if ((i & 1572864) == 0) {
                oe1Var2 = oe1Var;
                if (kk0Var2.j(oe1Var2)) {
                    i4 = 1048576;
                } else {
                    i4 = 524288;
                }
                i3 |= i4;
            }
            if ((599187 & i3) == 599186) {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i7 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    i5 = i2 & 2;
                    c01Var = c01.a;
                    if (i5 != 0) {
                        i3 &= -113;
                        shape = c01Var.getShape(kk0Var2, 6);
                    }
                    if ((i2 & 4) != 0) {
                        modalContainerColor = c01Var.getModalContainerColor(kk0Var2, 6);
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(modalContainerColor, kk0Var2, (i3 >> 6) & 14);
                        i3 &= -7169;
                    }
                    if (i10 != 0) {
                        f2 = 0.0f;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        windowInsets = c01Var.getWindowInsets(kk0Var2, 6);
                    }
                } else {
                    if (i7 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    i5 = i2 & 2;
                    c01Var = c01.a;
                    if (i5 != 0) {
                        i3 &= -113;
                        shape = c01Var.getShape(kk0Var2, 6);
                    }
                    if ((i2 & 4) != 0) {
                        modalContainerColor = c01Var.getModalContainerColor(kk0Var2, 6);
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(modalContainerColor, kk0Var2, (i3 >> 6) & 14);
                        i3 &= -7169;
                    }
                    if (i10 != 0) {
                        f2 = 0.0f;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        windowInsets = c01Var.getWindowInsets(kk0Var2, 6);
                    }
                }
                rg3 rg3Var6 = shape;
                long j11 = jM2x310ea166;
                float f7 = f2;
                long j12 = modalContainerColor;
                kk0Var2.s();
                int i15 = i3 << 6;
                kk0Var = kk0Var2;
                m1821xd59157b8(null, windowInsets, cVar3, rg3Var6, j12, j11, f7, oe1Var2, kk0Var, 6 | ((i3 >> 12) & 112) | (i15 & 896) | (i15 & 7168) | (57344 & i15) | (458752 & i15) | (i15 & 3670016) | ((i3 << 3) & 29360128), 0);
                rg3Var2 = rg3Var6;
                j3 = j12;
                j4 = j11;
                f3 = f7;
            } else {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i7 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    i5 = i2 & 2;
                    c01Var = c01.a;
                    if (i5 != 0) {
                        i3 &= -113;
                        shape = c01Var.getShape(kk0Var2, 6);
                    }
                    if ((i2 & 4) != 0) {
                        modalContainerColor = c01Var.getModalContainerColor(kk0Var2, 6);
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(modalContainerColor, kk0Var2, (i3 >> 6) & 14);
                        i3 &= -7169;
                    }
                    if (i10 != 0) {
                        f2 = 0.0f;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        windowInsets = c01Var.getWindowInsets(kk0Var2, 6);
                    }
                } else {
                    if (i7 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    i5 = i2 & 2;
                    c01Var = c01.a;
                    if (i5 != 0) {
                        i3 &= -113;
                        shape = c01Var.getShape(kk0Var2, 6);
                    }
                    if ((i2 & 4) != 0) {
                        modalContainerColor = c01Var.getModalContainerColor(kk0Var2, 6);
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(modalContainerColor, kk0Var2, (i3 >> 6) & 14);
                        i3 &= -7169;
                    }
                    if (i10 != 0) {
                        f2 = 0.0f;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        windowInsets = c01Var.getWindowInsets(kk0Var2, 6);
                    }
                }
                rg3 rg3Var7 = shape;
                long j13 = jM2x310ea166;
                float f8 = f2;
                long j14 = modalContainerColor;
                kk0Var2.s();
                int i16 = i3 << 6;
                kk0Var = kk0Var2;
                m1821xd59157b8(null, windowInsets, cVar3, rg3Var7, j14, j13, f8, oe1Var2, kk0Var, 6 | ((i3 >> 12) & 112) | (i16 & 896) | (i16 & 7168) | (57344 & i16) | (458752 & i16) | (i16 & 3670016) | ((i3 << 3) & 29360128), 0);
                rg3Var2 = rg3Var7;
                j3 = j14;
                j4 = j13;
                f3 = f8;
            }
            eVar2 = windowInsets;
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new ej2(cVar3, rg3Var2, j3, j4, f3, eVar2, oe1Var, i, i2, 1));
            }
        }
        i3 |= 1572864;
        oe1Var2 = oe1Var;
        if ((599187 & i3) == 599186) {
            kk0Var2.X();
            if ((i & 1) != 0) {
                if (i7 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                i5 = i2 & 2;
                c01Var = c01.a;
                if (i5 != 0) {
                    i3 &= -113;
                    shape = c01Var.getShape(kk0Var2, 6);
                }
                if ((i2 & 4) != 0) {
                    modalContainerColor = c01Var.getModalContainerColor(kk0Var2, 6);
                    i3 &= -897;
                }
                if ((i2 & 8) != 0) {
                    jM2x310ea166 = af0.m2x310ea166(modalContainerColor, kk0Var2, (i3 >> 6) & 14);
                    i3 &= -7169;
                }
                if (i10 != 0) {
                    f2 = 0.0f;
                }
                if ((i2 & 32) != 0) {
                    i3 &= -458753;
                    windowInsets = c01Var.getWindowInsets(kk0Var2, 6);
                }
            } else {
                if (i7 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                i5 = i2 & 2;
                c01Var = c01.a;
                if (i5 != 0) {
                    i3 &= -113;
                    shape = c01Var.getShape(kk0Var2, 6);
                }
                if ((i2 & 4) != 0) {
                    modalContainerColor = c01Var.getModalContainerColor(kk0Var2, 6);
                    i3 &= -897;
                }
                if ((i2 & 8) != 0) {
                    jM2x310ea166 = af0.m2x310ea166(modalContainerColor, kk0Var2, (i3 >> 6) & 14);
                    i3 &= -7169;
                }
                if (i10 != 0) {
                    f2 = 0.0f;
                }
                if ((i2 & 32) != 0) {
                    i3 &= -458753;
                    windowInsets = c01Var.getWindowInsets(kk0Var2, 6);
                }
            }
            rg3 rg3Var8 = shape;
            long j15 = jM2x310ea166;
            float f9 = f2;
            long j16 = modalContainerColor;
            kk0Var2.s();
            int i17 = i3 << 6;
            kk0Var = kk0Var2;
            m1821xd59157b8(null, windowInsets, cVar3, rg3Var8, j16, j15, f9, oe1Var2, kk0Var, 6 | ((i3 >> 12) & 112) | (i17 & 896) | (i17 & 7168) | (57344 & i17) | (458752 & i17) | (i17 & 3670016) | ((i3 << 3) & 29360128), 0);
            rg3Var2 = rg3Var8;
            j3 = j16;
            j4 = j15;
            f3 = f9;
        } else {
            kk0Var2.X();
            if ((i & 1) != 0) {
                if (i7 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                i5 = i2 & 2;
                c01Var = c01.a;
                if (i5 != 0) {
                    i3 &= -113;
                    shape = c01Var.getShape(kk0Var2, 6);
                }
                if ((i2 & 4) != 0) {
                    modalContainerColor = c01Var.getModalContainerColor(kk0Var2, 6);
                    i3 &= -897;
                }
                if ((i2 & 8) != 0) {
                    jM2x310ea166 = af0.m2x310ea166(modalContainerColor, kk0Var2, (i3 >> 6) & 14);
                    i3 &= -7169;
                }
                if (i10 != 0) {
                    f2 = 0.0f;
                }
                if ((i2 & 32) != 0) {
                    i3 &= -458753;
                    windowInsets = c01Var.getWindowInsets(kk0Var2, 6);
                }
            } else {
                if (i7 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                i5 = i2 & 2;
                c01Var = c01.a;
                if (i5 != 0) {
                    i3 &= -113;
                    shape = c01Var.getShape(kk0Var2, 6);
                }
                if ((i2 & 4) != 0) {
                    modalContainerColor = c01Var.getModalContainerColor(kk0Var2, 6);
                    i3 &= -897;
                }
                if ((i2 & 8) != 0) {
                    jM2x310ea166 = af0.m2x310ea166(modalContainerColor, kk0Var2, (i3 >> 6) & 14);
                    i3 &= -7169;
                }
                if (i10 != 0) {
                    f2 = 0.0f;
                }
                if ((i2 & 32) != 0) {
                    i3 &= -458753;
                    windowInsets = c01Var.getWindowInsets(kk0Var2, 6);
                }
            }
            rg3 rg3Var9 = shape;
            long j17 = jM2x310ea166;
            float f10 = f2;
            long j18 = modalContainerColor;
            kk0Var2.s();
            int i18 = i3 << 6;
            kk0Var = kk0Var2;
            m1821xd59157b8(null, windowInsets, cVar3, rg3Var9, j18, j17, f10, oe1Var2, kk0Var, 6 | ((i3 >> 12) & 112) | (i18 & 896) | (i18 & 7168) | (57344 & i18) | (458752 & i18) | (i18 & 3670016) | ((i3 << 3) & 29360128), 0);
            rg3Var2 = rg3Var9;
            j3 = j18;
            j4 = j17;
            f3 = f10;
        }
        eVar2 = windowInsets;
        w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new ej2(cVar3, rg3Var2, j3, j4, f3, eVar2, oe1Var, i, i2, 1));
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0153  */
    /* JADX WARN: Code duplicated, block: B:105:0x016b  */
    /* JADX WARN: Code duplicated, block: B:107:0x0171  */
    /* JADX WARN: Code duplicated, block: B:110:0x0184  */
    /* JADX WARN: Code duplicated, block: B:114:0x018e  */
    /* JADX WARN: Code duplicated, block: B:116:0x0194 A[PHI: r24
  0x0194: PHI (r24v3 java.lang.String) = (r24v1 java.lang.String), (r24v4 java.lang.String) binds: [B:115:0x0192, B:113:0x018b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:117:0x0196  */
    /* JADX WARN: Code duplicated, block: B:120:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:122:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:125:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:126:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:129:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:131:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:132:0x0201  */
    /* JADX WARN: Code duplicated, block: B:135:0x020c  */
    /* JADX WARN: Code duplicated, block: B:137:0x021a  */
    /* JADX WARN: Code duplicated, block: B:140:0x0246  */
    /* JADX WARN: Code duplicated, block: B:141:0x024a  */
    /* JADX WARN: Code duplicated, block: B:144:0x0255  */
    /* JADX WARN: Code duplicated, block: B:146:0x0263  */
    /* JADX WARN: Code duplicated, block: B:149:0x0286  */
    /* JADX WARN: Code duplicated, block: B:151:0x028a  */
    /* JADX WARN: Code duplicated, block: B:153:0x028e  */
    /* JADX WARN: Code duplicated, block: B:155:0x0294  */
    /* JADX WARN: Code duplicated, block: B:161:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:163:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:166:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:168:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:174:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:176:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:179:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:181:0x0302  */
    /* JADX WARN: Code duplicated, block: B:187:0x030f  */
    /* JADX WARN: Code duplicated, block: B:189:0x0315  */
    /* JADX WARN: Code duplicated, block: B:192:0x032a  */
    /* JADX WARN: Code duplicated, block: B:194:0x0330  */
    /* JADX WARN: Code duplicated, block: B:200:0x0343  */
    /* JADX WARN: Code duplicated, block: B:202:0x0349  */
    /* JADX WARN: Code duplicated, block: B:205:0x035b  */
    /* JADX WARN: Code duplicated, block: B:207:0x0361  */
    /* JADX WARN: Code duplicated, block: B:213:0x0373  */
    /* JADX WARN: Code duplicated, block: B:215:0x0379  */
    /* JADX WARN: Code duplicated, block: B:218:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:219:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:222:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:224:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:228:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:230:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:232:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    /* JADX WARN: Code duplicated, block: B:28:0x004c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:31:0x0057  */
    /* JADX WARN: Code duplicated, block: B:34:0x005d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX WARN: Code duplicated, block: B:39:0x0068  */
    /* JADX WARN: Code duplicated, block: B:41:0x006c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0074  */
    /* JADX WARN: Code duplicated, block: B:44:0x0077  */
    /* JADX WARN: Code duplicated, block: B:48:0x007e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0084  */
    /* JADX WARN: Code duplicated, block: B:53:0x008d  */
    /* JADX WARN: Code duplicated, block: B:55:0x0091  */
    /* JADX WARN: Code duplicated, block: B:58:0x0099  */
    /* JADX WARN: Code duplicated, block: B:59:0x009b  */
    /* JADX WARN: Code duplicated, block: B:61:0x009f  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ec A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:85:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:91:0x0102  */
    /* JADX WARN: Code duplicated, block: B:92:0x0104  */
    /* JADX WARN: Code duplicated, block: B:95:0x010a  */
    /* JADX WARN: Code duplicated, block: B:96:0x0114  */
    /* JADX WARN: Code duplicated, block: B:99:0x0122  */
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
    /* JADX INFO: renamed from: ModalNavigationDrawer-FHprtrg, reason: not valid java name */
    public static final void m1824x6ec692ea(ne1 ne1Var, c cVar, h01 h01Var, boolean z, long j, ne1 ne1Var2, ck0 ck0Var, int i, int i2) {
        int i3;
        c cVar2;
        h01 h01VarRememberDrawerState;
        int i4;
        int i5;
        long j2;
        int i6;
        c cVar3;
        boolean z2;
        long scrimColor;
        Object objP;
        gq0 gq0Var;
        String strM1830xa862b2cd;
        wu0 wu0Var;
        Object objP2;
        mi2 mi2Var;
        boolean zH;
        Object objP3;
        ah2 ah2Var;
        int i7;
        String str;
        boolean z3;
        boolean zH2;
        Object objP4;
        boolean z4;
        vb2 vb2VarC;
        c cVar4;
        int currentCompositeKeyHash;
        su2 su2VarN;
        c cVarD;
        long j3;
        d4 constructor;
        pe peVarH;
        int currentCompositeKeyHash2;
        d4 constructor2;
        pe peVarH2;
        boolean z5;
        boolean zJ;
        Object objP5;
        boolean zH3;
        Object objP6;
        String str2;
        boolean z6;
        Object objP7;
        boolean zH4;
        Object objP8;
        boolean zH5;
        Object objP9;
        int currentCompositeKeyHash3;
        d4 constructor3;
        pe peVarH3;
        c cVar5;
        h01 h01Var2;
        long j4;
        boolean z7;
        ne1 ne1Var3;
        w33 w33VarV;
        int i8;
        int i9;
        ne1 ne1Var4 = ne1Var;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(-1169303680);
        xk xkVar = kk0Var.a;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (kk0Var.j(ne1Var4) ? 4 : 2) | i;
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
                    h01VarRememberDrawerState = h01Var;
                    if (kk0Var.h(h01VarRememberDrawerState)) {
                        i9 = FontInfo.NUMBER_OF_CHAR_CODES;
                    }
                    i3 |= i9;
                } else {
                    h01VarRememberDrawerState = h01Var;
                }
                i9 = Uuid.SIZE_BITS;
                i3 |= i9;
            } else {
                h01VarRememberDrawerState = h01Var;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    if (kk0Var.i(z)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                if ((i & 24576) == 0) {
                    j2 = j;
                    if ((i2 & 16) == 0 || !kk0Var.g(j2)) {
                        i8 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                    } else {
                        i8 = 16384;
                    }
                    i3 |= i8;
                } else {
                    j2 = j;
                }
                if ((i2 & 32) != 0) {
                    i3 |= 196608;
                } else if ((i & 196608) == 0) {
                    if (kk0Var.j(ne1Var2)) {
                        i6 = 131072;
                    } else {
                        i6 = 65536;
                    }
                    i3 |= i6;
                }
                if ((74899 & i3) == 74898 || !kk0Var.F()) {
                    kk0Var.X();
                    if ((i & 1) != 0 || kk0Var.D()) {
                        if (i10 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                            h01VarRememberDrawerState = rememberDrawerState(i01.c, null, kk0Var, 6, 2);
                        }
                        if (i4 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            scrimColor = c01.a.getScrimColor(kk0Var, 6);
                        } else {
                            scrimColor = j2;
                        }
                    } else {
                        kk0Var.V();
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        cVar3 = cVar2;
                        scrimColor = j2;
                        z2 = z;
                    }
                    kk0Var.s();
                    objP = kk0Var.P();
                    if (objP == Composer$Companion.getEmpty()) {
                        al0 al0Var = new al0(r11.a(x21.c, kk0Var));
                        kk0Var.l0(al0Var);
                        objP = al0Var;
                    }
                    gq0Var = ((al0) objP).c;
                    strM1830xa862b2cd = uo3.m1830xa862b2cd(R.string.navigation_menu, kk0Var, 0);
                    wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                    objP2 = kk0Var.P();
                    if (objP2 == Composer$Companion.getEmpty()) {
                        objP2 = cl3.d(Boolean.FALSE);
                        kk0Var.l0(objP2);
                    }
                    mi2Var = (mi2) objP2;
                    zH = kk0Var.h(wu0Var);
                    objP3 = kk0Var.P();
                    if (zH || objP3 == Composer$Companion.getEmpty()) {
                        objP3 = new bt2(0.0f);
                        kk0Var.l0(objP3);
                    }
                    ah2Var = (ah2) objP3;
                    i7 = (i3 & 896) ^ 384;
                    if (i7 > 256 || !kk0Var.h(h01VarRememberDrawerState)) {
                        str = strM1830xa862b2cd;
                        if ((i3 & 384) != 256) {
                            z3 = false;
                        }
                        zH2 = z3 | kk0Var.h(wu0Var);
                        objP4 = kk0Var.P();
                        if (zH2 || objP4 == Composer$Companion.getEmpty()) {
                            objP4 = new hj2(h01VarRememberDrawerState, wu0Var, 1);
                            kk0Var.l0(objP4);
                        }
                        r11.SideEffect((je1) objP4, kk0Var, 0);
                        if (kk0Var.l(CompositionLocalsKt.getLocalLayoutDirection()) == dx1.d) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        c cVarB = a.b(cVar3.then(d.c), h01VarRememberDrawerState.a, z2, z4);
                        vb2VarC = vw.c(Alignment$Companion.getTopStart(), false);
                        cVar4 = cVar3;
                        currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                        su2VarN = kk0Var.n();
                        cVarD = b.d(kk0Var, cVarB);
                        androidx.compose.ui.node.a.j.getClass();
                        j3 = scrimColor;
                        constructor = ComposeUiNode$Companion.getConstructor();
                        if (xkVar != null) {
                            rj0.a();
                            throw null;
                        }
                        kk0Var.e0();
                        if (kk0Var.O) {
                            kk0Var.m(constructor);
                        } else {
                            kk0Var.o0();
                        }
                        peVarH = fq2.h(kk0Var, vb2VarC, kk0Var, su2VarN);
                        if (kk0Var.O || !kr1.n(kk0Var.P(), Integer.valueOf(currentCompositeKeyHash))) {
                            fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                        }
                        xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
                        Modifier$Companion modifier$Companion = c.i;
                        vb2 vb2VarC2 = vw.c(Alignment$Companion.getTopStart(), false);
                        currentCompositeKeyHash2 = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                        su2 su2VarN2 = kk0Var.n();
                        c cVarD2 = b.d(kk0Var, modifier$Companion);
                        constructor2 = ComposeUiNode$Companion.getConstructor();
                        kk0Var.e0();
                        if (kk0Var.O) {
                            kk0Var.m(constructor2);
                        } else {
                            kk0Var.o0();
                        }
                        peVarH2 = fq2.h(kk0Var, vb2VarC2, kk0Var, su2VarN2);
                        if (kk0Var.O || !kr1.n(kk0Var.P(), Integer.valueOf(currentCompositeKeyHash2))) {
                            fq2.v(currentCompositeKeyHash2, kk0Var, currentCompositeKeyHash2, peVarH2);
                        }
                        xp1.E(kk0Var, cVarD2, ComposeUiNode$Companion.getSetModifier());
                        ne1Var2.invoke(kk0Var, Integer.valueOf((i3 >> 15) & 14));
                        kk0Var.r(true);
                        boolean zC = h01VarRememberDrawerState.c();
                        if ((i3 & 7168) == 2048) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        zJ = z5 | ((i7 <= 256 && kk0Var.h(h01VarRememberDrawerState)) || (i3 & 384) == 256) | kk0Var.j(gq0Var);
                        objP5 = kk0Var.P();
                        if (zJ || objP5 == Composer$Companion.getEmpty()) {
                            objP5 = new oj2(z2, h01VarRememberDrawerState, gq0Var);
                            kk0Var.l0(objP5);
                        }
                        je1 je1Var = (je1) objP5;
                        zH3 = kk0Var.h(ah2Var) | ((i7 <= 256 && kk0Var.h(h01VarRememberDrawerState)) || (i3 & 384) == 256);
                        objP6 = kk0Var.P();
                        if (zH3 || objP6 == Composer$Companion.getEmpty()) {
                            objP6 = new c9(h01VarRememberDrawerState, 18, ah2Var);
                            kk0Var.l0(objP6);
                        }
                        boolean z8 = z2;
                        str2 = str;
                        m1826xa4f58eab(zC, je1Var, (je1) objP6, j3, kk0Var, (i3 >> 3) & 7168);
                        z6 = (i7 <= 256 && kk0Var.h(h01VarRememberDrawerState)) || (i3 & 384) == 256;
                        objP7 = kk0Var.P();
                        if (z6 || objP7 == Composer$Companion.getEmpty()) {
                            objP7 = new pj2(0, h01VarRememberDrawerState);
                            kk0Var.l0(objP7);
                        }
                        c cVarH = androidx.compose.foundation.layout.a.h(modifier$Companion, (le1) objP7);
                        zH4 = kk0Var.h(str2) | ((i7 <= 256 && kk0Var.h(h01VarRememberDrawerState)) || (i3 & 384) == 256) | kk0Var.j(gq0Var);
                        objP8 = kk0Var.P();
                        if (zH4 || objP8 == Composer$Companion.getEmpty()) {
                            objP8 = new jj2(str2, h01VarRememberDrawerState, gq0Var, 1);
                            kk0Var.l0(objP8);
                        }
                        c cVarB2 = we3.b(cVarH, false, (le1) objP8);
                        zH5 = kk0Var.h(ah2Var) | ((i7 <= 256 && kk0Var.h(h01VarRememberDrawerState)) || (i3 & 384) == 256);
                        objP9 = kk0Var.P();
                        if (zH5 || objP9 == Composer$Companion.getEmpty()) {
                            objP9 = new qj2(h01VarRememberDrawerState, mi2Var, ah2Var);
                            kk0Var.l0(objP9);
                        }
                        vb2 vb2Var = (vb2) objP9;
                        int i11 = i3 & 14;
                        currentCompositeKeyHash3 = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                        su2 su2VarN3 = kk0Var.n();
                        c cVarD3 = b.d(kk0Var, cVarB2);
                        constructor3 = ComposeUiNode$Companion.getConstructor();
                        int i12 = ((i11 << 6) & 896) | 6;
                        kk0Var.e0();
                        if (kk0Var.O) {
                            kk0Var.m(constructor3);
                        } else {
                            kk0Var.o0();
                        }
                        peVarH3 = fq2.h(kk0Var, vb2Var, kk0Var, su2VarN3);
                        if (kk0Var.O || !kr1.n(kk0Var.P(), Integer.valueOf(currentCompositeKeyHash3))) {
                            fq2.v(currentCompositeKeyHash3, kk0Var, currentCompositeKeyHash3, peVarH3);
                        }
                        xp1.E(kk0Var, cVarD3, ComposeUiNode$Companion.getSetModifier());
                        ne1 ne1Var5 = ne1Var;
                        ne1Var5.invoke(kk0Var, Integer.valueOf((i12 >> 6) & 14));
                        kk0Var.r(true);
                        kk0Var.r(true);
                        cVar5 = cVar4;
                        h01Var2 = h01VarRememberDrawerState;
                        j4 = j3;
                        z7 = z8;
                        ne1Var3 = ne1Var5;
                    } else {
                        str = strM1830xa862b2cd;
                    }
                    z3 = true;
                    zH2 = z3 | kk0Var.h(wu0Var);
                    objP4 = kk0Var.P();
                    if (zH2) {
                        objP4 = new hj2(h01VarRememberDrawerState, wu0Var, 1);
                        kk0Var.l0(objP4);
                    } else {
                        objP4 = new hj2(h01VarRememberDrawerState, wu0Var, 1);
                        kk0Var.l0(objP4);
                    }
                    r11.SideEffect((je1) objP4, kk0Var, 0);
                    if (kk0Var.l(CompositionLocalsKt.getLocalLayoutDirection()) == dx1.d) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    c cVarB3 = a.b(cVar3.then(d.c), h01VarRememberDrawerState.a, z2, z4);
                    vb2VarC = vw.c(Alignment$Companion.getTopStart(), false);
                    cVar4 = cVar3;
                    currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                    su2VarN = kk0Var.n();
                    cVarD = b.d(kk0Var, cVarB3);
                    androidx.compose.ui.node.a.j.getClass();
                    j3 = scrimColor;
                    constructor = ComposeUiNode$Companion.getConstructor();
                    if (xkVar != null) {
                        rj0.a();
                        throw null;
                    }
                    kk0Var.e0();
                    if (kk0Var.O) {
                        kk0Var.m(constructor);
                    } else {
                        kk0Var.o0();
                    }
                    peVarH = fq2.h(kk0Var, vb2VarC, kk0Var, su2VarN);
                    if (kk0Var.O) {
                        fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                    } else {
                        fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                    }
                    xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
                    Modifier$Companion modifier$Companion2 = c.i;
                    vb2 vb2VarC3 = vw.c(Alignment$Companion.getTopStart(), false);
                    currentCompositeKeyHash2 = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                    su2 su2VarN4 = kk0Var.n();
                    c cVarD4 = b.d(kk0Var, modifier$Companion2);
                    constructor2 = ComposeUiNode$Companion.getConstructor();
                    kk0Var.e0();
                    if (kk0Var.O) {
                        kk0Var.m(constructor2);
                    } else {
                        kk0Var.o0();
                    }
                    peVarH2 = fq2.h(kk0Var, vb2VarC3, kk0Var, su2VarN4);
                    if (kk0Var.O) {
                        fq2.v(currentCompositeKeyHash2, kk0Var, currentCompositeKeyHash2, peVarH2);
                    } else {
                        fq2.v(currentCompositeKeyHash2, kk0Var, currentCompositeKeyHash2, peVarH2);
                    }
                    xp1.E(kk0Var, cVarD4, ComposeUiNode$Companion.getSetModifier());
                    ne1Var2.invoke(kk0Var, Integer.valueOf((i3 >> 15) & 14));
                    kk0Var.r(true);
                    boolean zC2 = h01VarRememberDrawerState.c();
                    if ((i3 & 7168) == 2048) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    zJ = z5 | ((i7 <= 256 && kk0Var.h(h01VarRememberDrawerState)) || (i3 & 384) == 256) | kk0Var.j(gq0Var);
                    objP5 = kk0Var.P();
                    if (zJ) {
                        objP5 = new oj2(z2, h01VarRememberDrawerState, gq0Var);
                        kk0Var.l0(objP5);
                    } else {
                        objP5 = new oj2(z2, h01VarRememberDrawerState, gq0Var);
                        kk0Var.l0(objP5);
                    }
                    je1 je1Var2 = (je1) objP5;
                    zH3 = kk0Var.h(ah2Var) | ((i7 <= 256 && kk0Var.h(h01VarRememberDrawerState)) || (i3 & 384) == 256);
                    objP6 = kk0Var.P();
                    if (zH3) {
                        objP6 = new c9(h01VarRememberDrawerState, 18, ah2Var);
                        kk0Var.l0(objP6);
                    } else {
                        objP6 = new c9(h01VarRememberDrawerState, 18, ah2Var);
                        kk0Var.l0(objP6);
                    }
                    boolean z9 = z2;
                    str2 = str;
                    m1826xa4f58eab(zC2, je1Var2, (je1) objP6, j3, kk0Var, (i3 >> 3) & 7168);
                    if (i7 <= 256) {
                    }
                    objP7 = kk0Var.P();
                    if (z6) {
                        objP7 = new pj2(0, h01VarRememberDrawerState);
                        kk0Var.l0(objP7);
                    } else {
                        objP7 = new pj2(0, h01VarRememberDrawerState);
                        kk0Var.l0(objP7);
                    }
                    c cVarH2 = androidx.compose.foundation.layout.a.h(modifier$Companion2, (le1) objP7);
                    zH4 = kk0Var.h(str2) | ((i7 <= 256 && kk0Var.h(h01VarRememberDrawerState)) || (i3 & 384) == 256) | kk0Var.j(gq0Var);
                    objP8 = kk0Var.P();
                    if (zH4) {
                        objP8 = new jj2(str2, h01VarRememberDrawerState, gq0Var, 1);
                        kk0Var.l0(objP8);
                    } else {
                        objP8 = new jj2(str2, h01VarRememberDrawerState, gq0Var, 1);
                        kk0Var.l0(objP8);
                    }
                    c cVarB4 = we3.b(cVarH2, false, (le1) objP8);
                    zH5 = kk0Var.h(ah2Var) | ((i7 <= 256 && kk0Var.h(h01VarRememberDrawerState)) || (i3 & 384) == 256);
                    objP9 = kk0Var.P();
                    if (zH5) {
                        objP9 = new qj2(h01VarRememberDrawerState, mi2Var, ah2Var);
                        kk0Var.l0(objP9);
                    } else {
                        objP9 = new qj2(h01VarRememberDrawerState, mi2Var, ah2Var);
                        kk0Var.l0(objP9);
                    }
                    vb2 vb2Var2 = (vb2) objP9;
                    int i13 = i3 & 14;
                    currentCompositeKeyHash3 = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                    su2 su2VarN5 = kk0Var.n();
                    c cVarD5 = b.d(kk0Var, cVarB4);
                    constructor3 = ComposeUiNode$Companion.getConstructor();
                    int i14 = ((i13 << 6) & 896) | 6;
                    kk0Var.e0();
                    if (kk0Var.O) {
                        kk0Var.m(constructor3);
                    } else {
                        kk0Var.o0();
                    }
                    peVarH3 = fq2.h(kk0Var, vb2Var2, kk0Var, su2VarN5);
                    if (kk0Var.O) {
                        fq2.v(currentCompositeKeyHash3, kk0Var, currentCompositeKeyHash3, peVarH3);
                    } else {
                        fq2.v(currentCompositeKeyHash3, kk0Var, currentCompositeKeyHash3, peVarH3);
                    }
                    xp1.E(kk0Var, cVarD5, ComposeUiNode$Companion.getSetModifier());
                    ne1 ne1Var6 = ne1Var;
                    ne1Var6.invoke(kk0Var, Integer.valueOf((i14 >> 6) & 14));
                    kk0Var.r(true);
                    kk0Var.r(true);
                    cVar5 = cVar4;
                    h01Var2 = h01VarRememberDrawerState;
                    j4 = j3;
                    z7 = z9;
                    ne1Var3 = ne1Var6;
                } else {
                    kk0Var.V();
                    z7 = z;
                    cVar5 = cVar2;
                    h01Var2 = h01VarRememberDrawerState;
                    j4 = j2;
                    ne1Var3 = ne1Var4;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new xb(ne1Var3, cVar5, h01Var2, z7, j4, ne1Var2, i, i2));
                }
            }
            i3 |= 3072;
            if ((i & 24576) == 0) {
                j2 = j;
                if ((i2 & 16) == 0) {
                    i8 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                } else {
                    i8 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                }
                i3 |= i8;
            } else {
                j2 = j;
            }
            if ((i2 & 32) != 0) {
                i3 |= 196608;
            } else if ((i & 196608) == 0) {
                if (kk0Var.j(ne1Var2)) {
                    i6 = 131072;
                } else {
                    i6 = 65536;
                }
                i3 |= i6;
            }
            if ((74899 & i3) == 74898) {
                kk0Var.X();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                        h01VarRememberDrawerState = rememberDrawerState(i01.c, null, kk0Var, 6, 2);
                    }
                    if (i4 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        scrimColor = c01.a.getScrimColor(kk0Var, 6);
                    } else {
                        scrimColor = j2;
                    }
                } else {
                    if (i10 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                        h01VarRememberDrawerState = rememberDrawerState(i01.c, null, kk0Var, 6, 2);
                    }
                    if (i4 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        scrimColor = c01.a.getScrimColor(kk0Var, 6);
                    } else {
                        scrimColor = j2;
                    }
                }
                kk0Var.s();
                objP = kk0Var.P();
                if (objP == Composer$Companion.getEmpty()) {
                    al0 al0Var2 = new al0(r11.a(x21.c, kk0Var));
                    kk0Var.l0(al0Var2);
                    objP = al0Var2;
                }
                gq0Var = ((al0) objP).c;
                strM1830xa862b2cd = uo3.m1830xa862b2cd(R.string.navigation_menu, kk0Var, 0);
                wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                objP2 = kk0Var.P();
                if (objP2 == Composer$Companion.getEmpty()) {
                    objP2 = cl3.d(Boolean.FALSE);
                    kk0Var.l0(objP2);
                }
                mi2Var = (mi2) objP2;
                zH = kk0Var.h(wu0Var);
                objP3 = kk0Var.P();
                if (zH) {
                    objP3 = new bt2(0.0f);
                    kk0Var.l0(objP3);
                } else {
                    objP3 = new bt2(0.0f);
                    kk0Var.l0(objP3);
                }
                ah2Var = (ah2) objP3;
                i7 = (i3 & 896) ^ 384;
                if (i7 > 256) {
                    str = strM1830xa862b2cd;
                    if ((i3 & 384) != 256) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                } else {
                    str = strM1830xa862b2cd;
                    if ((i3 & 384) != 256) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                }
                zH2 = z3 | kk0Var.h(wu0Var);
                objP4 = kk0Var.P();
                if (zH2) {
                    objP4 = new hj2(h01VarRememberDrawerState, wu0Var, 1);
                    kk0Var.l0(objP4);
                } else {
                    objP4 = new hj2(h01VarRememberDrawerState, wu0Var, 1);
                    kk0Var.l0(objP4);
                }
                r11.SideEffect((je1) objP4, kk0Var, 0);
                if (kk0Var.l(CompositionLocalsKt.getLocalLayoutDirection()) == dx1.d) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                c cVarB5 = a.b(cVar3.then(d.c), h01VarRememberDrawerState.a, z2, z4);
                vb2VarC = vw.c(Alignment$Companion.getTopStart(), false);
                cVar4 = cVar3;
                currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                su2VarN = kk0Var.n();
                cVarD = b.d(kk0Var, cVarB5);
                androidx.compose.ui.node.a.j.getClass();
                j3 = scrimColor;
                constructor = ComposeUiNode$Companion.getConstructor();
                if (xkVar != null) {
                    rj0.a();
                    throw null;
                }
                kk0Var.e0();
                if (kk0Var.O) {
                    kk0Var.m(constructor);
                } else {
                    kk0Var.o0();
                }
                peVarH = fq2.h(kk0Var, vb2VarC, kk0Var, su2VarN);
                if (kk0Var.O) {
                    fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                } else {
                    fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                }
                xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
                Modifier$Companion modifier$Companion3 = c.i;
                vb2 vb2VarC4 = vw.c(Alignment$Companion.getTopStart(), false);
                currentCompositeKeyHash2 = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                su2 su2VarN6 = kk0Var.n();
                c cVarD6 = b.d(kk0Var, modifier$Companion3);
                constructor2 = ComposeUiNode$Companion.getConstructor();
                kk0Var.e0();
                if (kk0Var.O) {
                    kk0Var.m(constructor2);
                } else {
                    kk0Var.o0();
                }
                peVarH2 = fq2.h(kk0Var, vb2VarC4, kk0Var, su2VarN6);
                if (kk0Var.O) {
                    fq2.v(currentCompositeKeyHash2, kk0Var, currentCompositeKeyHash2, peVarH2);
                } else {
                    fq2.v(currentCompositeKeyHash2, kk0Var, currentCompositeKeyHash2, peVarH2);
                }
                xp1.E(kk0Var, cVarD6, ComposeUiNode$Companion.getSetModifier());
                ne1Var2.invoke(kk0Var, Integer.valueOf((i3 >> 15) & 14));
                kk0Var.r(true);
                boolean zC3 = h01VarRememberDrawerState.c();
                if ((i3 & 7168) == 2048) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                zJ = z5 | ((i7 <= 256 && kk0Var.h(h01VarRememberDrawerState)) || (i3 & 384) == 256) | kk0Var.j(gq0Var);
                objP5 = kk0Var.P();
                if (zJ) {
                    objP5 = new oj2(z2, h01VarRememberDrawerState, gq0Var);
                    kk0Var.l0(objP5);
                } else {
                    objP5 = new oj2(z2, h01VarRememberDrawerState, gq0Var);
                    kk0Var.l0(objP5);
                }
                je1 je1Var3 = (je1) objP5;
                zH3 = kk0Var.h(ah2Var) | ((i7 <= 256 && kk0Var.h(h01VarRememberDrawerState)) || (i3 & 384) == 256);
                objP6 = kk0Var.P();
                if (zH3) {
                    objP6 = new c9(h01VarRememberDrawerState, 18, ah2Var);
                    kk0Var.l0(objP6);
                } else {
                    objP6 = new c9(h01VarRememberDrawerState, 18, ah2Var);
                    kk0Var.l0(objP6);
                }
                boolean z10 = z2;
                str2 = str;
                m1826xa4f58eab(zC3, je1Var3, (je1) objP6, j3, kk0Var, (i3 >> 3) & 7168);
                if (i7 <= 256) {
                }
                objP7 = kk0Var.P();
                if (z6) {
                    objP7 = new pj2(0, h01VarRememberDrawerState);
                    kk0Var.l0(objP7);
                } else {
                    objP7 = new pj2(0, h01VarRememberDrawerState);
                    kk0Var.l0(objP7);
                }
                c cVarH3 = androidx.compose.foundation.layout.a.h(modifier$Companion3, (le1) objP7);
                zH4 = kk0Var.h(str2) | ((i7 <= 256 && kk0Var.h(h01VarRememberDrawerState)) || (i3 & 384) == 256) | kk0Var.j(gq0Var);
                objP8 = kk0Var.P();
                if (zH4) {
                    objP8 = new jj2(str2, h01VarRememberDrawerState, gq0Var, 1);
                    kk0Var.l0(objP8);
                } else {
                    objP8 = new jj2(str2, h01VarRememberDrawerState, gq0Var, 1);
                    kk0Var.l0(objP8);
                }
                c cVarB6 = we3.b(cVarH3, false, (le1) objP8);
                zH5 = kk0Var.h(ah2Var) | ((i7 <= 256 && kk0Var.h(h01VarRememberDrawerState)) || (i3 & 384) == 256);
                objP9 = kk0Var.P();
                if (zH5) {
                    objP9 = new qj2(h01VarRememberDrawerState, mi2Var, ah2Var);
                    kk0Var.l0(objP9);
                } else {
                    objP9 = new qj2(h01VarRememberDrawerState, mi2Var, ah2Var);
                    kk0Var.l0(objP9);
                }
                vb2 vb2Var3 = (vb2) objP9;
                int i15 = i3 & 14;
                currentCompositeKeyHash3 = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                su2 su2VarN7 = kk0Var.n();
                c cVarD7 = b.d(kk0Var, cVarB6);
                constructor3 = ComposeUiNode$Companion.getConstructor();
                int i16 = ((i15 << 6) & 896) | 6;
                kk0Var.e0();
                if (kk0Var.O) {
                    kk0Var.m(constructor3);
                } else {
                    kk0Var.o0();
                }
                peVarH3 = fq2.h(kk0Var, vb2Var3, kk0Var, su2VarN7);
                if (kk0Var.O) {
                    fq2.v(currentCompositeKeyHash3, kk0Var, currentCompositeKeyHash3, peVarH3);
                } else {
                    fq2.v(currentCompositeKeyHash3, kk0Var, currentCompositeKeyHash3, peVarH3);
                }
                xp1.E(kk0Var, cVarD7, ComposeUiNode$Companion.getSetModifier());
                ne1 ne1Var7 = ne1Var;
                ne1Var7.invoke(kk0Var, Integer.valueOf((i16 >> 6) & 14));
                kk0Var.r(true);
                kk0Var.r(true);
                cVar5 = cVar4;
                h01Var2 = h01VarRememberDrawerState;
                j4 = j3;
                z7 = z10;
                ne1Var3 = ne1Var7;
            } else {
                kk0Var.X();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                        h01VarRememberDrawerState = rememberDrawerState(i01.c, null, kk0Var, 6, 2);
                    }
                    if (i4 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        scrimColor = c01.a.getScrimColor(kk0Var, 6);
                    } else {
                        scrimColor = j2;
                    }
                } else {
                    if (i10 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                        h01VarRememberDrawerState = rememberDrawerState(i01.c, null, kk0Var, 6, 2);
                    }
                    if (i4 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        scrimColor = c01.a.getScrimColor(kk0Var, 6);
                    } else {
                        scrimColor = j2;
                    }
                }
                kk0Var.s();
                objP = kk0Var.P();
                if (objP == Composer$Companion.getEmpty()) {
                    al0 al0Var3 = new al0(r11.a(x21.c, kk0Var));
                    kk0Var.l0(al0Var3);
                    objP = al0Var3;
                }
                gq0Var = ((al0) objP).c;
                strM1830xa862b2cd = uo3.m1830xa862b2cd(R.string.navigation_menu, kk0Var, 0);
                wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                objP2 = kk0Var.P();
                if (objP2 == Composer$Companion.getEmpty()) {
                    objP2 = cl3.d(Boolean.FALSE);
                    kk0Var.l0(objP2);
                }
                mi2Var = (mi2) objP2;
                zH = kk0Var.h(wu0Var);
                objP3 = kk0Var.P();
                if (zH) {
                    objP3 = new bt2(0.0f);
                    kk0Var.l0(objP3);
                } else {
                    objP3 = new bt2(0.0f);
                    kk0Var.l0(objP3);
                }
                ah2Var = (ah2) objP3;
                i7 = (i3 & 896) ^ 384;
                if (i7 > 256) {
                    str = strM1830xa862b2cd;
                    if ((i3 & 384) != 256) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                } else {
                    str = strM1830xa862b2cd;
                    if ((i3 & 384) != 256) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                }
                zH2 = z3 | kk0Var.h(wu0Var);
                objP4 = kk0Var.P();
                if (zH2) {
                    objP4 = new hj2(h01VarRememberDrawerState, wu0Var, 1);
                    kk0Var.l0(objP4);
                } else {
                    objP4 = new hj2(h01VarRememberDrawerState, wu0Var, 1);
                    kk0Var.l0(objP4);
                }
                r11.SideEffect((je1) objP4, kk0Var, 0);
                if (kk0Var.l(CompositionLocalsKt.getLocalLayoutDirection()) == dx1.d) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                c cVarB7 = a.b(cVar3.then(d.c), h01VarRememberDrawerState.a, z2, z4);
                vb2VarC = vw.c(Alignment$Companion.getTopStart(), false);
                cVar4 = cVar3;
                currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                su2VarN = kk0Var.n();
                cVarD = b.d(kk0Var, cVarB7);
                androidx.compose.ui.node.a.j.getClass();
                j3 = scrimColor;
                constructor = ComposeUiNode$Companion.getConstructor();
                if (xkVar != null) {
                    rj0.a();
                    throw null;
                }
                kk0Var.e0();
                if (kk0Var.O) {
                    kk0Var.m(constructor);
                } else {
                    kk0Var.o0();
                }
                peVarH = fq2.h(kk0Var, vb2VarC, kk0Var, su2VarN);
                if (kk0Var.O) {
                    fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                } else {
                    fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                }
                xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
                Modifier$Companion modifier$Companion4 = c.i;
                vb2 vb2VarC5 = vw.c(Alignment$Companion.getTopStart(), false);
                currentCompositeKeyHash2 = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                su2 su2VarN8 = kk0Var.n();
                c cVarD8 = b.d(kk0Var, modifier$Companion4);
                constructor2 = ComposeUiNode$Companion.getConstructor();
                kk0Var.e0();
                if (kk0Var.O) {
                    kk0Var.m(constructor2);
                } else {
                    kk0Var.o0();
                }
                peVarH2 = fq2.h(kk0Var, vb2VarC5, kk0Var, su2VarN8);
                if (kk0Var.O) {
                    fq2.v(currentCompositeKeyHash2, kk0Var, currentCompositeKeyHash2, peVarH2);
                } else {
                    fq2.v(currentCompositeKeyHash2, kk0Var, currentCompositeKeyHash2, peVarH2);
                }
                xp1.E(kk0Var, cVarD8, ComposeUiNode$Companion.getSetModifier());
                ne1Var2.invoke(kk0Var, Integer.valueOf((i3 >> 15) & 14));
                kk0Var.r(true);
                boolean zC4 = h01VarRememberDrawerState.c();
                if ((i3 & 7168) == 2048) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                zJ = z5 | ((i7 <= 256 && kk0Var.h(h01VarRememberDrawerState)) || (i3 & 384) == 256) | kk0Var.j(gq0Var);
                objP5 = kk0Var.P();
                if (zJ) {
                    objP5 = new oj2(z2, h01VarRememberDrawerState, gq0Var);
                    kk0Var.l0(objP5);
                } else {
                    objP5 = new oj2(z2, h01VarRememberDrawerState, gq0Var);
                    kk0Var.l0(objP5);
                }
                je1 je1Var4 = (je1) objP5;
                zH3 = kk0Var.h(ah2Var) | ((i7 <= 256 && kk0Var.h(h01VarRememberDrawerState)) || (i3 & 384) == 256);
                objP6 = kk0Var.P();
                if (zH3) {
                    objP6 = new c9(h01VarRememberDrawerState, 18, ah2Var);
                    kk0Var.l0(objP6);
                } else {
                    objP6 = new c9(h01VarRememberDrawerState, 18, ah2Var);
                    kk0Var.l0(objP6);
                }
                boolean z11 = z2;
                str2 = str;
                m1826xa4f58eab(zC4, je1Var4, (je1) objP6, j3, kk0Var, (i3 >> 3) & 7168);
                if (i7 <= 256) {
                }
                objP7 = kk0Var.P();
                if (z6) {
                    objP7 = new pj2(0, h01VarRememberDrawerState);
                    kk0Var.l0(objP7);
                } else {
                    objP7 = new pj2(0, h01VarRememberDrawerState);
                    kk0Var.l0(objP7);
                }
                c cVarH4 = androidx.compose.foundation.layout.a.h(modifier$Companion4, (le1) objP7);
                zH4 = kk0Var.h(str2) | ((i7 <= 256 && kk0Var.h(h01VarRememberDrawerState)) || (i3 & 384) == 256) | kk0Var.j(gq0Var);
                objP8 = kk0Var.P();
                if (zH4) {
                    objP8 = new jj2(str2, h01VarRememberDrawerState, gq0Var, 1);
                    kk0Var.l0(objP8);
                } else {
                    objP8 = new jj2(str2, h01VarRememberDrawerState, gq0Var, 1);
                    kk0Var.l0(objP8);
                }
                c cVarB8 = we3.b(cVarH4, false, (le1) objP8);
                zH5 = kk0Var.h(ah2Var) | ((i7 <= 256 && kk0Var.h(h01VarRememberDrawerState)) || (i3 & 384) == 256);
                objP9 = kk0Var.P();
                if (zH5) {
                    objP9 = new qj2(h01VarRememberDrawerState, mi2Var, ah2Var);
                    kk0Var.l0(objP9);
                } else {
                    objP9 = new qj2(h01VarRememberDrawerState, mi2Var, ah2Var);
                    kk0Var.l0(objP9);
                }
                vb2 vb2Var4 = (vb2) objP9;
                int i17 = i3 & 14;
                currentCompositeKeyHash3 = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                su2 su2VarN9 = kk0Var.n();
                c cVarD9 = b.d(kk0Var, cVarB8);
                constructor3 = ComposeUiNode$Companion.getConstructor();
                int i18 = ((i17 << 6) & 896) | 6;
                kk0Var.e0();
                if (kk0Var.O) {
                    kk0Var.m(constructor3);
                } else {
                    kk0Var.o0();
                }
                peVarH3 = fq2.h(kk0Var, vb2Var4, kk0Var, su2VarN9);
                if (kk0Var.O) {
                    fq2.v(currentCompositeKeyHash3, kk0Var, currentCompositeKeyHash3, peVarH3);
                } else {
                    fq2.v(currentCompositeKeyHash3, kk0Var, currentCompositeKeyHash3, peVarH3);
                }
                xp1.E(kk0Var, cVarD9, ComposeUiNode$Companion.getSetModifier());
                ne1 ne1Var8 = ne1Var;
                ne1Var8.invoke(kk0Var, Integer.valueOf((i18 >> 6) & 14));
                kk0Var.r(true);
                kk0Var.r(true);
                cVar5 = cVar4;
                h01Var2 = h01VarRememberDrawerState;
                j4 = j3;
                z7 = z11;
                ne1Var3 = ne1Var8;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new xb(ne1Var3, cVar5, h01Var2, z7, j4, ne1Var2, i, i2));
            }
        }
        i3 |= 48;
        cVar2 = cVar;
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                h01VarRememberDrawerState = h01Var;
                if (kk0Var.h(h01VarRememberDrawerState)) {
                    i9 = FontInfo.NUMBER_OF_CHAR_CODES;
                }
                i3 |= i9;
            } else {
                h01VarRememberDrawerState = h01Var;
            }
            i9 = Uuid.SIZE_BITS;
            i3 |= i9;
        } else {
            h01VarRememberDrawerState = h01Var;
        }
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                if (kk0Var.i(z)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            if ((i & 24576) == 0) {
                j2 = j;
                if ((i2 & 16) == 0) {
                    i8 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                } else {
                    i8 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                }
                i3 |= i8;
            } else {
                j2 = j;
            }
            if ((i2 & 32) != 0) {
                i3 |= 196608;
            } else if ((i & 196608) == 0) {
                if (kk0Var.j(ne1Var2)) {
                    i6 = 131072;
                } else {
                    i6 = 65536;
                }
                i3 |= i6;
            }
            if ((74899 & i3) == 74898) {
                kk0Var.X();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                        h01VarRememberDrawerState = rememberDrawerState(i01.c, null, kk0Var, 6, 2);
                    }
                    if (i4 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        scrimColor = c01.a.getScrimColor(kk0Var, 6);
                    } else {
                        scrimColor = j2;
                    }
                } else {
                    if (i10 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                        h01VarRememberDrawerState = rememberDrawerState(i01.c, null, kk0Var, 6, 2);
                    }
                    if (i4 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        scrimColor = c01.a.getScrimColor(kk0Var, 6);
                    } else {
                        scrimColor = j2;
                    }
                }
                kk0Var.s();
                objP = kk0Var.P();
                if (objP == Composer$Companion.getEmpty()) {
                    al0 al0Var4 = new al0(r11.a(x21.c, kk0Var));
                    kk0Var.l0(al0Var4);
                    objP = al0Var4;
                }
                gq0Var = ((al0) objP).c;
                strM1830xa862b2cd = uo3.m1830xa862b2cd(R.string.navigation_menu, kk0Var, 0);
                wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                objP2 = kk0Var.P();
                if (objP2 == Composer$Companion.getEmpty()) {
                    objP2 = cl3.d(Boolean.FALSE);
                    kk0Var.l0(objP2);
                }
                mi2Var = (mi2) objP2;
                zH = kk0Var.h(wu0Var);
                objP3 = kk0Var.P();
                if (zH) {
                    objP3 = new bt2(0.0f);
                    kk0Var.l0(objP3);
                } else {
                    objP3 = new bt2(0.0f);
                    kk0Var.l0(objP3);
                }
                ah2Var = (ah2) objP3;
                i7 = (i3 & 896) ^ 384;
                if (i7 > 256) {
                    str = strM1830xa862b2cd;
                    if ((i3 & 384) != 256) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                } else {
                    str = strM1830xa862b2cd;
                    if ((i3 & 384) != 256) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                }
                zH2 = z3 | kk0Var.h(wu0Var);
                objP4 = kk0Var.P();
                if (zH2) {
                    objP4 = new hj2(h01VarRememberDrawerState, wu0Var, 1);
                    kk0Var.l0(objP4);
                } else {
                    objP4 = new hj2(h01VarRememberDrawerState, wu0Var, 1);
                    kk0Var.l0(objP4);
                }
                r11.SideEffect((je1) objP4, kk0Var, 0);
                if (kk0Var.l(CompositionLocalsKt.getLocalLayoutDirection()) == dx1.d) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                c cVarB9 = a.b(cVar3.then(d.c), h01VarRememberDrawerState.a, z2, z4);
                vb2VarC = vw.c(Alignment$Companion.getTopStart(), false);
                cVar4 = cVar3;
                currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                su2VarN = kk0Var.n();
                cVarD = b.d(kk0Var, cVarB9);
                androidx.compose.ui.node.a.j.getClass();
                j3 = scrimColor;
                constructor = ComposeUiNode$Companion.getConstructor();
                if (xkVar != null) {
                    rj0.a();
                    throw null;
                }
                kk0Var.e0();
                if (kk0Var.O) {
                    kk0Var.m(constructor);
                } else {
                    kk0Var.o0();
                }
                peVarH = fq2.h(kk0Var, vb2VarC, kk0Var, su2VarN);
                if (kk0Var.O) {
                    fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                } else {
                    fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                }
                xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
                Modifier$Companion modifier$Companion5 = c.i;
                vb2 vb2VarC6 = vw.c(Alignment$Companion.getTopStart(), false);
                currentCompositeKeyHash2 = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                su2 su2VarN10 = kk0Var.n();
                c cVarD10 = b.d(kk0Var, modifier$Companion5);
                constructor2 = ComposeUiNode$Companion.getConstructor();
                kk0Var.e0();
                if (kk0Var.O) {
                    kk0Var.m(constructor2);
                } else {
                    kk0Var.o0();
                }
                peVarH2 = fq2.h(kk0Var, vb2VarC6, kk0Var, su2VarN10);
                if (kk0Var.O) {
                    fq2.v(currentCompositeKeyHash2, kk0Var, currentCompositeKeyHash2, peVarH2);
                } else {
                    fq2.v(currentCompositeKeyHash2, kk0Var, currentCompositeKeyHash2, peVarH2);
                }
                xp1.E(kk0Var, cVarD10, ComposeUiNode$Companion.getSetModifier());
                ne1Var2.invoke(kk0Var, Integer.valueOf((i3 >> 15) & 14));
                kk0Var.r(true);
                boolean zC5 = h01VarRememberDrawerState.c();
                if ((i3 & 7168) == 2048) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                zJ = z5 | ((i7 <= 256 && kk0Var.h(h01VarRememberDrawerState)) || (i3 & 384) == 256) | kk0Var.j(gq0Var);
                objP5 = kk0Var.P();
                if (zJ) {
                    objP5 = new oj2(z2, h01VarRememberDrawerState, gq0Var);
                    kk0Var.l0(objP5);
                } else {
                    objP5 = new oj2(z2, h01VarRememberDrawerState, gq0Var);
                    kk0Var.l0(objP5);
                }
                je1 je1Var5 = (je1) objP5;
                zH3 = kk0Var.h(ah2Var) | ((i7 <= 256 && kk0Var.h(h01VarRememberDrawerState)) || (i3 & 384) == 256);
                objP6 = kk0Var.P();
                if (zH3) {
                    objP6 = new c9(h01VarRememberDrawerState, 18, ah2Var);
                    kk0Var.l0(objP6);
                } else {
                    objP6 = new c9(h01VarRememberDrawerState, 18, ah2Var);
                    kk0Var.l0(objP6);
                }
                boolean z12 = z2;
                str2 = str;
                m1826xa4f58eab(zC5, je1Var5, (je1) objP6, j3, kk0Var, (i3 >> 3) & 7168);
                if (i7 <= 256) {
                }
                objP7 = kk0Var.P();
                if (z6) {
                    objP7 = new pj2(0, h01VarRememberDrawerState);
                    kk0Var.l0(objP7);
                } else {
                    objP7 = new pj2(0, h01VarRememberDrawerState);
                    kk0Var.l0(objP7);
                }
                c cVarH5 = androidx.compose.foundation.layout.a.h(modifier$Companion5, (le1) objP7);
                zH4 = kk0Var.h(str2) | ((i7 <= 256 && kk0Var.h(h01VarRememberDrawerState)) || (i3 & 384) == 256) | kk0Var.j(gq0Var);
                objP8 = kk0Var.P();
                if (zH4) {
                    objP8 = new jj2(str2, h01VarRememberDrawerState, gq0Var, 1);
                    kk0Var.l0(objP8);
                } else {
                    objP8 = new jj2(str2, h01VarRememberDrawerState, gq0Var, 1);
                    kk0Var.l0(objP8);
                }
                c cVarB10 = we3.b(cVarH5, false, (le1) objP8);
                zH5 = kk0Var.h(ah2Var) | ((i7 <= 256 && kk0Var.h(h01VarRememberDrawerState)) || (i3 & 384) == 256);
                objP9 = kk0Var.P();
                if (zH5) {
                    objP9 = new qj2(h01VarRememberDrawerState, mi2Var, ah2Var);
                    kk0Var.l0(objP9);
                } else {
                    objP9 = new qj2(h01VarRememberDrawerState, mi2Var, ah2Var);
                    kk0Var.l0(objP9);
                }
                vb2 vb2Var5 = (vb2) objP9;
                int i19 = i3 & 14;
                currentCompositeKeyHash3 = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                su2 su2VarN11 = kk0Var.n();
                c cVarD11 = b.d(kk0Var, cVarB10);
                constructor3 = ComposeUiNode$Companion.getConstructor();
                int i110 = ((i19 << 6) & 896) | 6;
                kk0Var.e0();
                if (kk0Var.O) {
                    kk0Var.m(constructor3);
                } else {
                    kk0Var.o0();
                }
                peVarH3 = fq2.h(kk0Var, vb2Var5, kk0Var, su2VarN11);
                if (kk0Var.O) {
                    fq2.v(currentCompositeKeyHash3, kk0Var, currentCompositeKeyHash3, peVarH3);
                } else {
                    fq2.v(currentCompositeKeyHash3, kk0Var, currentCompositeKeyHash3, peVarH3);
                }
                xp1.E(kk0Var, cVarD11, ComposeUiNode$Companion.getSetModifier());
                ne1 ne1Var9 = ne1Var;
                ne1Var9.invoke(kk0Var, Integer.valueOf((i110 >> 6) & 14));
                kk0Var.r(true);
                kk0Var.r(true);
                cVar5 = cVar4;
                h01Var2 = h01VarRememberDrawerState;
                j4 = j3;
                z7 = z12;
                ne1Var3 = ne1Var9;
            } else {
                kk0Var.X();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                        h01VarRememberDrawerState = rememberDrawerState(i01.c, null, kk0Var, 6, 2);
                    }
                    if (i4 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        scrimColor = c01.a.getScrimColor(kk0Var, 6);
                    } else {
                        scrimColor = j2;
                    }
                } else {
                    if (i10 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                        h01VarRememberDrawerState = rememberDrawerState(i01.c, null, kk0Var, 6, 2);
                    }
                    if (i4 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        scrimColor = c01.a.getScrimColor(kk0Var, 6);
                    } else {
                        scrimColor = j2;
                    }
                }
                kk0Var.s();
                objP = kk0Var.P();
                if (objP == Composer$Companion.getEmpty()) {
                    al0 al0Var5 = new al0(r11.a(x21.c, kk0Var));
                    kk0Var.l0(al0Var5);
                    objP = al0Var5;
                }
                gq0Var = ((al0) objP).c;
                strM1830xa862b2cd = uo3.m1830xa862b2cd(R.string.navigation_menu, kk0Var, 0);
                wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                objP2 = kk0Var.P();
                if (objP2 == Composer$Companion.getEmpty()) {
                    objP2 = cl3.d(Boolean.FALSE);
                    kk0Var.l0(objP2);
                }
                mi2Var = (mi2) objP2;
                zH = kk0Var.h(wu0Var);
                objP3 = kk0Var.P();
                if (zH) {
                    objP3 = new bt2(0.0f);
                    kk0Var.l0(objP3);
                } else {
                    objP3 = new bt2(0.0f);
                    kk0Var.l0(objP3);
                }
                ah2Var = (ah2) objP3;
                i7 = (i3 & 896) ^ 384;
                if (i7 > 256) {
                    str = strM1830xa862b2cd;
                    if ((i3 & 384) != 256) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                } else {
                    str = strM1830xa862b2cd;
                    if ((i3 & 384) != 256) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                }
                zH2 = z3 | kk0Var.h(wu0Var);
                objP4 = kk0Var.P();
                if (zH2) {
                    objP4 = new hj2(h01VarRememberDrawerState, wu0Var, 1);
                    kk0Var.l0(objP4);
                } else {
                    objP4 = new hj2(h01VarRememberDrawerState, wu0Var, 1);
                    kk0Var.l0(objP4);
                }
                r11.SideEffect((je1) objP4, kk0Var, 0);
                if (kk0Var.l(CompositionLocalsKt.getLocalLayoutDirection()) == dx1.d) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                c cVarB11 = a.b(cVar3.then(d.c), h01VarRememberDrawerState.a, z2, z4);
                vb2VarC = vw.c(Alignment$Companion.getTopStart(), false);
                cVar4 = cVar3;
                currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                su2VarN = kk0Var.n();
                cVarD = b.d(kk0Var, cVarB11);
                androidx.compose.ui.node.a.j.getClass();
                j3 = scrimColor;
                constructor = ComposeUiNode$Companion.getConstructor();
                if (xkVar != null) {
                    rj0.a();
                    throw null;
                }
                kk0Var.e0();
                if (kk0Var.O) {
                    kk0Var.m(constructor);
                } else {
                    kk0Var.o0();
                }
                peVarH = fq2.h(kk0Var, vb2VarC, kk0Var, su2VarN);
                if (kk0Var.O) {
                    fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                } else {
                    fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                }
                xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
                Modifier$Companion modifier$Companion6 = c.i;
                vb2 vb2VarC7 = vw.c(Alignment$Companion.getTopStart(), false);
                currentCompositeKeyHash2 = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                su2 su2VarN12 = kk0Var.n();
                c cVarD12 = b.d(kk0Var, modifier$Companion6);
                constructor2 = ComposeUiNode$Companion.getConstructor();
                kk0Var.e0();
                if (kk0Var.O) {
                    kk0Var.m(constructor2);
                } else {
                    kk0Var.o0();
                }
                peVarH2 = fq2.h(kk0Var, vb2VarC7, kk0Var, su2VarN12);
                if (kk0Var.O) {
                    fq2.v(currentCompositeKeyHash2, kk0Var, currentCompositeKeyHash2, peVarH2);
                } else {
                    fq2.v(currentCompositeKeyHash2, kk0Var, currentCompositeKeyHash2, peVarH2);
                }
                xp1.E(kk0Var, cVarD12, ComposeUiNode$Companion.getSetModifier());
                ne1Var2.invoke(kk0Var, Integer.valueOf((i3 >> 15) & 14));
                kk0Var.r(true);
                boolean zC6 = h01VarRememberDrawerState.c();
                if ((i3 & 7168) == 2048) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                zJ = z5 | ((i7 <= 256 && kk0Var.h(h01VarRememberDrawerState)) || (i3 & 384) == 256) | kk0Var.j(gq0Var);
                objP5 = kk0Var.P();
                if (zJ) {
                    objP5 = new oj2(z2, h01VarRememberDrawerState, gq0Var);
                    kk0Var.l0(objP5);
                } else {
                    objP5 = new oj2(z2, h01VarRememberDrawerState, gq0Var);
                    kk0Var.l0(objP5);
                }
                je1 je1Var6 = (je1) objP5;
                zH3 = kk0Var.h(ah2Var) | ((i7 <= 256 && kk0Var.h(h01VarRememberDrawerState)) || (i3 & 384) == 256);
                objP6 = kk0Var.P();
                if (zH3) {
                    objP6 = new c9(h01VarRememberDrawerState, 18, ah2Var);
                    kk0Var.l0(objP6);
                } else {
                    objP6 = new c9(h01VarRememberDrawerState, 18, ah2Var);
                    kk0Var.l0(objP6);
                }
                boolean z13 = z2;
                str2 = str;
                m1826xa4f58eab(zC6, je1Var6, (je1) objP6, j3, kk0Var, (i3 >> 3) & 7168);
                if (i7 <= 256) {
                }
                objP7 = kk0Var.P();
                if (z6) {
                    objP7 = new pj2(0, h01VarRememberDrawerState);
                    kk0Var.l0(objP7);
                } else {
                    objP7 = new pj2(0, h01VarRememberDrawerState);
                    kk0Var.l0(objP7);
                }
                c cVarH6 = androidx.compose.foundation.layout.a.h(modifier$Companion6, (le1) objP7);
                zH4 = kk0Var.h(str2) | ((i7 <= 256 && kk0Var.h(h01VarRememberDrawerState)) || (i3 & 384) == 256) | kk0Var.j(gq0Var);
                objP8 = kk0Var.P();
                if (zH4) {
                    objP8 = new jj2(str2, h01VarRememberDrawerState, gq0Var, 1);
                    kk0Var.l0(objP8);
                } else {
                    objP8 = new jj2(str2, h01VarRememberDrawerState, gq0Var, 1);
                    kk0Var.l0(objP8);
                }
                c cVarB12 = we3.b(cVarH6, false, (le1) objP8);
                zH5 = kk0Var.h(ah2Var) | ((i7 <= 256 && kk0Var.h(h01VarRememberDrawerState)) || (i3 & 384) == 256);
                objP9 = kk0Var.P();
                if (zH5) {
                    objP9 = new qj2(h01VarRememberDrawerState, mi2Var, ah2Var);
                    kk0Var.l0(objP9);
                } else {
                    objP9 = new qj2(h01VarRememberDrawerState, mi2Var, ah2Var);
                    kk0Var.l0(objP9);
                }
                vb2 vb2Var6 = (vb2) objP9;
                int i111 = i3 & 14;
                currentCompositeKeyHash3 = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                su2 su2VarN13 = kk0Var.n();
                c cVarD13 = b.d(kk0Var, cVarB12);
                constructor3 = ComposeUiNode$Companion.getConstructor();
                int i112 = ((i111 << 6) & 896) | 6;
                kk0Var.e0();
                if (kk0Var.O) {
                    kk0Var.m(constructor3);
                } else {
                    kk0Var.o0();
                }
                peVarH3 = fq2.h(kk0Var, vb2Var6, kk0Var, su2VarN13);
                if (kk0Var.O) {
                    fq2.v(currentCompositeKeyHash3, kk0Var, currentCompositeKeyHash3, peVarH3);
                } else {
                    fq2.v(currentCompositeKeyHash3, kk0Var, currentCompositeKeyHash3, peVarH3);
                }
                xp1.E(kk0Var, cVarD13, ComposeUiNode$Companion.getSetModifier());
                ne1 ne1Var10 = ne1Var;
                ne1Var10.invoke(kk0Var, Integer.valueOf((i112 >> 6) & 14));
                kk0Var.r(true);
                kk0Var.r(true);
                cVar5 = cVar4;
                h01Var2 = h01VarRememberDrawerState;
                j4 = j3;
                z7 = z13;
                ne1Var3 = ne1Var10;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new xb(ne1Var3, cVar5, h01Var2, z7, j4, ne1Var2, i, i2));
            }
        }
        i3 |= 3072;
        if ((i & 24576) == 0) {
            j2 = j;
            if ((i2 & 16) == 0) {
                i8 = ConstantsKt.DEFAULT_BUFFER_SIZE;
            } else {
                i8 = ConstantsKt.DEFAULT_BUFFER_SIZE;
            }
            i3 |= i8;
        } else {
            j2 = j;
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((i & 196608) == 0) {
            if (kk0Var.j(ne1Var2)) {
                i6 = 131072;
            } else {
                i6 = 65536;
            }
            i3 |= i6;
        }
        if ((74899 & i3) == 74898) {
            kk0Var.X();
            if ((i & 1) != 0) {
                if (i10 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                    h01VarRememberDrawerState = rememberDrawerState(i01.c, null, kk0Var, 6, 2);
                }
                if (i4 != 0) {
                    z2 = true;
                } else {
                    z2 = z;
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                    scrimColor = c01.a.getScrimColor(kk0Var, 6);
                } else {
                    scrimColor = j2;
                }
            } else {
                if (i10 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                    h01VarRememberDrawerState = rememberDrawerState(i01.c, null, kk0Var, 6, 2);
                }
                if (i4 != 0) {
                    z2 = true;
                } else {
                    z2 = z;
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                    scrimColor = c01.a.getScrimColor(kk0Var, 6);
                } else {
                    scrimColor = j2;
                }
            }
            kk0Var.s();
            objP = kk0Var.P();
            if (objP == Composer$Companion.getEmpty()) {
                al0 al0Var6 = new al0(r11.a(x21.c, kk0Var));
                kk0Var.l0(al0Var6);
                objP = al0Var6;
            }
            gq0Var = ((al0) objP).c;
            strM1830xa862b2cd = uo3.m1830xa862b2cd(R.string.navigation_menu, kk0Var, 0);
            wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
            objP2 = kk0Var.P();
            if (objP2 == Composer$Companion.getEmpty()) {
                objP2 = cl3.d(Boolean.FALSE);
                kk0Var.l0(objP2);
            }
            mi2Var = (mi2) objP2;
            zH = kk0Var.h(wu0Var);
            objP3 = kk0Var.P();
            if (zH) {
                objP3 = new bt2(0.0f);
                kk0Var.l0(objP3);
            } else {
                objP3 = new bt2(0.0f);
                kk0Var.l0(objP3);
            }
            ah2Var = (ah2) objP3;
            i7 = (i3 & 896) ^ 384;
            if (i7 > 256) {
                str = strM1830xa862b2cd;
                if ((i3 & 384) != 256) {
                    z3 = true;
                } else {
                    z3 = false;
                }
            } else {
                str = strM1830xa862b2cd;
                if ((i3 & 384) != 256) {
                    z3 = true;
                } else {
                    z3 = false;
                }
            }
            zH2 = z3 | kk0Var.h(wu0Var);
            objP4 = kk0Var.P();
            if (zH2) {
                objP4 = new hj2(h01VarRememberDrawerState, wu0Var, 1);
                kk0Var.l0(objP4);
            } else {
                objP4 = new hj2(h01VarRememberDrawerState, wu0Var, 1);
                kk0Var.l0(objP4);
            }
            r11.SideEffect((je1) objP4, kk0Var, 0);
            if (kk0Var.l(CompositionLocalsKt.getLocalLayoutDirection()) == dx1.d) {
                z4 = true;
            } else {
                z4 = false;
            }
            c cVarB13 = a.b(cVar3.then(d.c), h01VarRememberDrawerState.a, z2, z4);
            vb2VarC = vw.c(Alignment$Companion.getTopStart(), false);
            cVar4 = cVar3;
            currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
            su2VarN = kk0Var.n();
            cVarD = b.d(kk0Var, cVarB13);
            androidx.compose.ui.node.a.j.getClass();
            j3 = scrimColor;
            constructor = ComposeUiNode$Companion.getConstructor();
            if (xkVar != null) {
                rj0.a();
                throw null;
            }
            kk0Var.e0();
            if (kk0Var.O) {
                kk0Var.m(constructor);
            } else {
                kk0Var.o0();
            }
            peVarH = fq2.h(kk0Var, vb2VarC, kk0Var, su2VarN);
            if (kk0Var.O) {
                fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
            } else {
                fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
            }
            xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
            Modifier$Companion modifier$Companion7 = c.i;
            vb2 vb2VarC8 = vw.c(Alignment$Companion.getTopStart(), false);
            currentCompositeKeyHash2 = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
            su2 su2VarN14 = kk0Var.n();
            c cVarD14 = b.d(kk0Var, modifier$Companion7);
            constructor2 = ComposeUiNode$Companion.getConstructor();
            kk0Var.e0();
            if (kk0Var.O) {
                kk0Var.m(constructor2);
            } else {
                kk0Var.o0();
            }
            peVarH2 = fq2.h(kk0Var, vb2VarC8, kk0Var, su2VarN14);
            if (kk0Var.O) {
                fq2.v(currentCompositeKeyHash2, kk0Var, currentCompositeKeyHash2, peVarH2);
            } else {
                fq2.v(currentCompositeKeyHash2, kk0Var, currentCompositeKeyHash2, peVarH2);
            }
            xp1.E(kk0Var, cVarD14, ComposeUiNode$Companion.getSetModifier());
            ne1Var2.invoke(kk0Var, Integer.valueOf((i3 >> 15) & 14));
            kk0Var.r(true);
            boolean zC7 = h01VarRememberDrawerState.c();
            if ((i3 & 7168) == 2048) {
                z5 = true;
            } else {
                z5 = false;
            }
            zJ = z5 | ((i7 <= 256 && kk0Var.h(h01VarRememberDrawerState)) || (i3 & 384) == 256) | kk0Var.j(gq0Var);
            objP5 = kk0Var.P();
            if (zJ) {
                objP5 = new oj2(z2, h01VarRememberDrawerState, gq0Var);
                kk0Var.l0(objP5);
            } else {
                objP5 = new oj2(z2, h01VarRememberDrawerState, gq0Var);
                kk0Var.l0(objP5);
            }
            je1 je1Var7 = (je1) objP5;
            zH3 = kk0Var.h(ah2Var) | ((i7 <= 256 && kk0Var.h(h01VarRememberDrawerState)) || (i3 & 384) == 256);
            objP6 = kk0Var.P();
            if (zH3) {
                objP6 = new c9(h01VarRememberDrawerState, 18, ah2Var);
                kk0Var.l0(objP6);
            } else {
                objP6 = new c9(h01VarRememberDrawerState, 18, ah2Var);
                kk0Var.l0(objP6);
            }
            boolean z14 = z2;
            str2 = str;
            m1826xa4f58eab(zC7, je1Var7, (je1) objP6, j3, kk0Var, (i3 >> 3) & 7168);
            if (i7 <= 256) {
            }
            objP7 = kk0Var.P();
            if (z6) {
                objP7 = new pj2(0, h01VarRememberDrawerState);
                kk0Var.l0(objP7);
            } else {
                objP7 = new pj2(0, h01VarRememberDrawerState);
                kk0Var.l0(objP7);
            }
            c cVarH7 = androidx.compose.foundation.layout.a.h(modifier$Companion7, (le1) objP7);
            zH4 = kk0Var.h(str2) | ((i7 <= 256 && kk0Var.h(h01VarRememberDrawerState)) || (i3 & 384) == 256) | kk0Var.j(gq0Var);
            objP8 = kk0Var.P();
            if (zH4) {
                objP8 = new jj2(str2, h01VarRememberDrawerState, gq0Var, 1);
                kk0Var.l0(objP8);
            } else {
                objP8 = new jj2(str2, h01VarRememberDrawerState, gq0Var, 1);
                kk0Var.l0(objP8);
            }
            c cVarB14 = we3.b(cVarH7, false, (le1) objP8);
            zH5 = kk0Var.h(ah2Var) | ((i7 <= 256 && kk0Var.h(h01VarRememberDrawerState)) || (i3 & 384) == 256);
            objP9 = kk0Var.P();
            if (zH5) {
                objP9 = new qj2(h01VarRememberDrawerState, mi2Var, ah2Var);
                kk0Var.l0(objP9);
            } else {
                objP9 = new qj2(h01VarRememberDrawerState, mi2Var, ah2Var);
                kk0Var.l0(objP9);
            }
            vb2 vb2Var7 = (vb2) objP9;
            int i113 = i3 & 14;
            currentCompositeKeyHash3 = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
            su2 su2VarN15 = kk0Var.n();
            c cVarD15 = b.d(kk0Var, cVarB14);
            constructor3 = ComposeUiNode$Companion.getConstructor();
            int i114 = ((i113 << 6) & 896) | 6;
            kk0Var.e0();
            if (kk0Var.O) {
                kk0Var.m(constructor3);
            } else {
                kk0Var.o0();
            }
            peVarH3 = fq2.h(kk0Var, vb2Var7, kk0Var, su2VarN15);
            if (kk0Var.O) {
                fq2.v(currentCompositeKeyHash3, kk0Var, currentCompositeKeyHash3, peVarH3);
            } else {
                fq2.v(currentCompositeKeyHash3, kk0Var, currentCompositeKeyHash3, peVarH3);
            }
            xp1.E(kk0Var, cVarD15, ComposeUiNode$Companion.getSetModifier());
            ne1 ne1Var11 = ne1Var;
            ne1Var11.invoke(kk0Var, Integer.valueOf((i114 >> 6) & 14));
            kk0Var.r(true);
            kk0Var.r(true);
            cVar5 = cVar4;
            h01Var2 = h01VarRememberDrawerState;
            j4 = j3;
            z7 = z14;
            ne1Var3 = ne1Var11;
        } else {
            kk0Var.X();
            if ((i & 1) != 0) {
                if (i10 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                    h01VarRememberDrawerState = rememberDrawerState(i01.c, null, kk0Var, 6, 2);
                }
                if (i4 != 0) {
                    z2 = true;
                } else {
                    z2 = z;
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                    scrimColor = c01.a.getScrimColor(kk0Var, 6);
                } else {
                    scrimColor = j2;
                }
            } else {
                if (i10 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                    h01VarRememberDrawerState = rememberDrawerState(i01.c, null, kk0Var, 6, 2);
                }
                if (i4 != 0) {
                    z2 = true;
                } else {
                    z2 = z;
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                    scrimColor = c01.a.getScrimColor(kk0Var, 6);
                } else {
                    scrimColor = j2;
                }
            }
            kk0Var.s();
            objP = kk0Var.P();
            if (objP == Composer$Companion.getEmpty()) {
                al0 al0Var7 = new al0(r11.a(x21.c, kk0Var));
                kk0Var.l0(al0Var7);
                objP = al0Var7;
            }
            gq0Var = ((al0) objP).c;
            strM1830xa862b2cd = uo3.m1830xa862b2cd(R.string.navigation_menu, kk0Var, 0);
            wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
            objP2 = kk0Var.P();
            if (objP2 == Composer$Companion.getEmpty()) {
                objP2 = cl3.d(Boolean.FALSE);
                kk0Var.l0(objP2);
            }
            mi2Var = (mi2) objP2;
            zH = kk0Var.h(wu0Var);
            objP3 = kk0Var.P();
            if (zH) {
                objP3 = new bt2(0.0f);
                kk0Var.l0(objP3);
            } else {
                objP3 = new bt2(0.0f);
                kk0Var.l0(objP3);
            }
            ah2Var = (ah2) objP3;
            i7 = (i3 & 896) ^ 384;
            if (i7 > 256) {
                str = strM1830xa862b2cd;
                if ((i3 & 384) != 256) {
                    z3 = true;
                } else {
                    z3 = false;
                }
            } else {
                str = strM1830xa862b2cd;
                if ((i3 & 384) != 256) {
                    z3 = true;
                } else {
                    z3 = false;
                }
            }
            zH2 = z3 | kk0Var.h(wu0Var);
            objP4 = kk0Var.P();
            if (zH2) {
                objP4 = new hj2(h01VarRememberDrawerState, wu0Var, 1);
                kk0Var.l0(objP4);
            } else {
                objP4 = new hj2(h01VarRememberDrawerState, wu0Var, 1);
                kk0Var.l0(objP4);
            }
            r11.SideEffect((je1) objP4, kk0Var, 0);
            if (kk0Var.l(CompositionLocalsKt.getLocalLayoutDirection()) == dx1.d) {
                z4 = true;
            } else {
                z4 = false;
            }
            c cVarB15 = a.b(cVar3.then(d.c), h01VarRememberDrawerState.a, z2, z4);
            vb2VarC = vw.c(Alignment$Companion.getTopStart(), false);
            cVar4 = cVar3;
            currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
            su2VarN = kk0Var.n();
            cVarD = b.d(kk0Var, cVarB15);
            androidx.compose.ui.node.a.j.getClass();
            j3 = scrimColor;
            constructor = ComposeUiNode$Companion.getConstructor();
            if (xkVar != null) {
                rj0.a();
                throw null;
            }
            kk0Var.e0();
            if (kk0Var.O) {
                kk0Var.m(constructor);
            } else {
                kk0Var.o0();
            }
            peVarH = fq2.h(kk0Var, vb2VarC, kk0Var, su2VarN);
            if (kk0Var.O) {
                fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
            } else {
                fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
            }
            xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
            Modifier$Companion modifier$Companion8 = c.i;
            vb2 vb2VarC9 = vw.c(Alignment$Companion.getTopStart(), false);
            currentCompositeKeyHash2 = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
            su2 su2VarN16 = kk0Var.n();
            c cVarD16 = b.d(kk0Var, modifier$Companion8);
            constructor2 = ComposeUiNode$Companion.getConstructor();
            kk0Var.e0();
            if (kk0Var.O) {
                kk0Var.m(constructor2);
            } else {
                kk0Var.o0();
            }
            peVarH2 = fq2.h(kk0Var, vb2VarC9, kk0Var, su2VarN16);
            if (kk0Var.O) {
                fq2.v(currentCompositeKeyHash2, kk0Var, currentCompositeKeyHash2, peVarH2);
            } else {
                fq2.v(currentCompositeKeyHash2, kk0Var, currentCompositeKeyHash2, peVarH2);
            }
            xp1.E(kk0Var, cVarD16, ComposeUiNode$Companion.getSetModifier());
            ne1Var2.invoke(kk0Var, Integer.valueOf((i3 >> 15) & 14));
            kk0Var.r(true);
            boolean zC8 = h01VarRememberDrawerState.c();
            if ((i3 & 7168) == 2048) {
                z5 = true;
            } else {
                z5 = false;
            }
            zJ = z5 | ((i7 <= 256 && kk0Var.h(h01VarRememberDrawerState)) || (i3 & 384) == 256) | kk0Var.j(gq0Var);
            objP5 = kk0Var.P();
            if (zJ) {
                objP5 = new oj2(z2, h01VarRememberDrawerState, gq0Var);
                kk0Var.l0(objP5);
            } else {
                objP5 = new oj2(z2, h01VarRememberDrawerState, gq0Var);
                kk0Var.l0(objP5);
            }
            je1 je1Var8 = (je1) objP5;
            zH3 = kk0Var.h(ah2Var) | ((i7 <= 256 && kk0Var.h(h01VarRememberDrawerState)) || (i3 & 384) == 256);
            objP6 = kk0Var.P();
            if (zH3) {
                objP6 = new c9(h01VarRememberDrawerState, 18, ah2Var);
                kk0Var.l0(objP6);
            } else {
                objP6 = new c9(h01VarRememberDrawerState, 18, ah2Var);
                kk0Var.l0(objP6);
            }
            boolean z15 = z2;
            str2 = str;
            m1826xa4f58eab(zC8, je1Var8, (je1) objP6, j3, kk0Var, (i3 >> 3) & 7168);
            if (i7 <= 256) {
            }
            objP7 = kk0Var.P();
            if (z6) {
                objP7 = new pj2(0, h01VarRememberDrawerState);
                kk0Var.l0(objP7);
            } else {
                objP7 = new pj2(0, h01VarRememberDrawerState);
                kk0Var.l0(objP7);
            }
            c cVarH8 = androidx.compose.foundation.layout.a.h(modifier$Companion8, (le1) objP7);
            zH4 = kk0Var.h(str2) | ((i7 <= 256 && kk0Var.h(h01VarRememberDrawerState)) || (i3 & 384) == 256) | kk0Var.j(gq0Var);
            objP8 = kk0Var.P();
            if (zH4) {
                objP8 = new jj2(str2, h01VarRememberDrawerState, gq0Var, 1);
                kk0Var.l0(objP8);
            } else {
                objP8 = new jj2(str2, h01VarRememberDrawerState, gq0Var, 1);
                kk0Var.l0(objP8);
            }
            c cVarB16 = we3.b(cVarH8, false, (le1) objP8);
            zH5 = kk0Var.h(ah2Var) | ((i7 <= 256 && kk0Var.h(h01VarRememberDrawerState)) || (i3 & 384) == 256);
            objP9 = kk0Var.P();
            if (zH5) {
                objP9 = new qj2(h01VarRememberDrawerState, mi2Var, ah2Var);
                kk0Var.l0(objP9);
            } else {
                objP9 = new qj2(h01VarRememberDrawerState, mi2Var, ah2Var);
                kk0Var.l0(objP9);
            }
            vb2 vb2Var8 = (vb2) objP9;
            int i115 = i3 & 14;
            currentCompositeKeyHash3 = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
            su2 su2VarN17 = kk0Var.n();
            c cVarD17 = b.d(kk0Var, cVarB16);
            constructor3 = ComposeUiNode$Companion.getConstructor();
            int i116 = ((i115 << 6) & 896) | 6;
            kk0Var.e0();
            if (kk0Var.O) {
                kk0Var.m(constructor3);
            } else {
                kk0Var.o0();
            }
            peVarH3 = fq2.h(kk0Var, vb2Var8, kk0Var, su2VarN17);
            if (kk0Var.O) {
                fq2.v(currentCompositeKeyHash3, kk0Var, currentCompositeKeyHash3, peVarH3);
            } else {
                fq2.v(currentCompositeKeyHash3, kk0Var, currentCompositeKeyHash3, peVarH3);
            }
            xp1.E(kk0Var, cVarD17, ComposeUiNode$Companion.getSetModifier());
            ne1 ne1Var12 = ne1Var;
            ne1Var12.invoke(kk0Var, Integer.valueOf((i116 >> 6) & 14));
            kk0Var.r(true);
            kk0Var.r(true);
            cVar5 = cVar4;
            h01Var2 = h01VarRememberDrawerState;
            j4 = j3;
            z7 = z15;
            ne1Var3 = ne1Var12;
        }
        w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new xb(ne1Var3, cVar5, h01Var2, z7, j4, ne1Var2, i, i2));
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0116  */
    /* JADX WARN: Code duplicated, block: B:107:0x012a  */
    /* JADX WARN: Code duplicated, block: B:109:0x0137  */
    /* JADX WARN: Code duplicated, block: B:119:0x0156 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:120:0x0158  */
    /* JADX WARN: Code duplicated, block: B:121:0x015b  */
    /* JADX WARN: Code duplicated, block: B:124:0x0160  */
    /* JADX WARN: Code duplicated, block: B:125:0x0163  */
    /* JADX WARN: Code duplicated, block: B:127:0x0167  */
    /* JADX WARN: Code duplicated, block: B:128:0x016a  */
    /* JADX WARN: Code duplicated, block: B:131:0x0170  */
    /* JADX WARN: Code duplicated, block: B:133:0x017d  */
    /* JADX WARN: Code duplicated, block: B:136:0x0184  */
    /* JADX WARN: Code duplicated, block: B:137:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:140:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:142:0x01be  */
    /* JADX WARN: Code duplicated, block: B:146:0x0246  */
    /* JADX WARN: Code duplicated, block: B:148:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0064  */
    /* JADX WARN: Code duplicated, block: B:38:0x0069  */
    /* JADX WARN: Code duplicated, block: B:40:0x006d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0075  */
    /* JADX WARN: Code duplicated, block: B:43:0x0078  */
    /* JADX WARN: Code duplicated, block: B:47:0x007f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0084  */
    /* JADX WARN: Code duplicated, block: B:51:0x0088  */
    /* JADX WARN: Code duplicated, block: B:53:0x0090  */
    /* JADX WARN: Code duplicated, block: B:54:0x0093  */
    /* JADX WARN: Code duplicated, block: B:58:0x009c  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:71:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:77:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:82:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:84:0x00de  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:88:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:91:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:93:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:95:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:97:0x0105  */
    /* JADX WARN: Code duplicated, block: B:98:0x0108  */
    public static final void NavigationDrawerItem(ne1 ne1Var, boolean z, je1 je1Var, c cVar, ne1 ne1Var2, ne1 ne1Var3, rg3 rg3Var, cj2 cj2Var, gh2 gh2Var, ck0 ck0Var, int i, int i2) {
        int i3;
        int i4;
        c cVar2;
        int i5;
        int i6;
        ne1 ne1Var4;
        int i7;
        int i8;
        ne1 ne1Var5;
        int i9;
        rg3 rg3Var2;
        cj2 cj2Var2;
        int i10;
        gh2 gh2Var2;
        int i11;
        c cVar3;
        ne1 ne1Var6;
        ne1 ne1Var7;
        rg3 value;
        int i12;
        int i13;
        int i14;
        c cVar4;
        gh2 gh2Var3;
        rg3 rg3Var3;
        rg3 rg3Var4;
        gh2 gh2Var4;
        cj2 cj2Var3;
        c cVar5;
        ne1 ne1Var8;
        ne1 ne1Var9;
        w33 w33VarV;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(-1304626543);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (kk0Var.j(ne1Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= kk0Var.i(z) ? 32 : 16;
        }
        if ((i2 & 4) == 0) {
            if ((i & 384) == 0) {
                i3 |= kk0Var.j(je1Var) ? FontInfo.NUMBER_OF_CHAR_CODES : Uuid.SIZE_BITS;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    cVar2 = cVar;
                    if (kk0Var.h(cVar2)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 16;
                if (i6 != 0) {
                    if ((i & 24576) == 0) {
                        ne1Var4 = ne1Var2;
                        if (kk0Var.j(ne1Var4)) {
                            i7 = 16384;
                        } else {
                            i7 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                        }
                        i3 |= i7;
                    }
                    i8 = i2 & 32;
                    if (i8 != 0) {
                        if ((196608 & i) == 0) {
                            ne1Var5 = ne1Var3;
                            if (kk0Var.j(ne1Var5)) {
                                i9 = 131072;
                            } else {
                                i9 = 65536;
                            }
                            i3 |= i9;
                        }
                        if ((1572864 & i) == 0) {
                            if ((i2 & 64) == 0) {
                                rg3Var2 = rg3Var;
                                int i15 = kk0Var.h(rg3Var2) ? 1048576 : 524288;
                                i3 |= i15;
                            } else {
                                rg3Var2 = rg3Var;
                            }
                            i3 |= i15;
                        } else {
                            rg3Var2 = rg3Var;
                        }
                        if ((12582912 & i) == 0) {
                            if ((i2 & Uuid.SIZE_BITS) == 0) {
                                cj2Var2 = cj2Var;
                                int i16 = kk0Var.h(cj2Var2) ? 8388608 : 4194304;
                                i3 |= i16;
                            } else {
                                cj2Var2 = cj2Var;
                            }
                            i3 |= i16;
                        } else {
                            cj2Var2 = cj2Var;
                        }
                        i10 = i2 & FontInfo.NUMBER_OF_CHAR_CODES;
                        if (i10 != 0) {
                            if ((i & 100663296) == 0) {
                                gh2Var2 = gh2Var;
                                if (kk0Var.h(gh2Var2)) {
                                    i11 = 67108864;
                                } else {
                                    i11 = 33554432;
                                }
                                i3 |= i11;
                            }
                            if ((i3 & 38347923) == 38347922 || !kk0Var.F()) {
                                kk0Var.X();
                                if ((i & 1) != 0 || kk0Var.D()) {
                                    if (i4 != 0) {
                                        cVar3 = c.i;
                                    } else {
                                        cVar3 = cVar2;
                                    }
                                    if (i6 != 0) {
                                        ne1Var6 = null;
                                    } else {
                                        ne1Var6 = ne1Var4;
                                    }
                                    if (i8 != 0) {
                                        ne1Var7 = null;
                                    } else {
                                        ne1Var7 = ne1Var5;
                                    }
                                    if ((i2 & 64) != 0) {
                                        i3 &= -3670017;
                                        value = wg3.getValue(tg3.m, kk0Var, 6);
                                    } else {
                                        value = rg3Var2;
                                    }
                                    i12 = i3;
                                    if ((i2 & Uuid.SIZE_BITS) != 0) {
                                        i13 = i10;
                                        i14 = 2;
                                        cj2 cj2VarM181xeb8e9a2e = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                                        kk0Var = kk0Var;
                                        cj2Var2 = cj2VarM181xeb8e9a2e;
                                        i3 = i12 & (-29360129);
                                    } else {
                                        i13 = i10;
                                        i14 = 2;
                                        i3 = i12;
                                    }
                                    cVar4 = cVar3;
                                    if (i13 != 0) {
                                        gh2Var3 = null;
                                    } else {
                                        gh2Var3 = gh2Var;
                                    }
                                    rg3Var3 = value;
                                } else {
                                    kk0Var.V();
                                    if ((i2 & 64) != 0) {
                                        i3 &= -3670017;
                                    }
                                    if ((i2 & Uuid.SIZE_BITS) != 0) {
                                        i3 &= -29360129;
                                    }
                                    cVar4 = cVar2;
                                    ne1Var6 = ne1Var4;
                                    ne1Var7 = ne1Var5;
                                    i14 = 2;
                                    gh2Var3 = gh2Var2;
                                    rg3Var3 = rg3Var2;
                                }
                                kk0Var.s();
                                int i17 = i3 >> 3;
                                qs0 qs0Var = (qs0) cj2Var2;
                                hq3.m211x54dd086a(z, je1Var, d.f(we3.b(cVar4, false, fl1.I), 56.0f, 0.0f, i14).then(d.a), false, rg3Var3, ((re0) qs0Var.containerColor(z, kk0Var, (i17 & 14) | ((i3 >> 18) & 112)).getValue()).a, 0L, 0.0f, 0.0f, (iw) null, gh2Var3, (ne1) zg0.rememberComposableLambda(191488423, true, new rj2(ne1Var6, qs0Var, z, ne1Var7, ne1Var), kk0Var, 54), (ck0) kk0Var, (i17 & 126) | ((i3 >> 6) & 57344), ((i3 >> 24) & 14) | 48, 968);
                                rg3Var4 = rg3Var3;
                                gh2Var4 = gh2Var3;
                                cj2Var3 = qs0Var;
                                cVar5 = cVar4;
                                ne1Var8 = ne1Var6;
                                ne1Var9 = ne1Var7;
                            } else {
                                kk0Var.V();
                                gh2Var4 = gh2Var2;
                                cVar5 = cVar2;
                                ne1Var8 = ne1Var4;
                                ne1Var9 = ne1Var5;
                                rg3Var4 = rg3Var2;
                                cj2Var3 = cj2Var2;
                            }
                            w33VarV = kk0Var.v();
                            if (w33VarV != null) {
                                w33VarV.updateScope(new yb(ne1Var, z, je1Var, cVar5, ne1Var8, ne1Var9, rg3Var4, cj2Var3, gh2Var4, i, i2));
                            }
                        }
                        i3 |= 100663296;
                        gh2Var2 = gh2Var;
                        if ((i3 & 38347923) == 38347922) {
                            kk0Var.X();
                            if ((i & 1) != 0) {
                                if (i4 != 0) {
                                    cVar3 = c.i;
                                } else {
                                    cVar3 = cVar2;
                                }
                                if (i6 != 0) {
                                    ne1Var6 = null;
                                } else {
                                    ne1Var6 = ne1Var4;
                                }
                                if (i8 != 0) {
                                    ne1Var7 = null;
                                } else {
                                    ne1Var7 = ne1Var5;
                                }
                                if ((i2 & 64) != 0) {
                                    i3 &= -3670017;
                                    value = wg3.getValue(tg3.m, kk0Var, 6);
                                } else {
                                    value = rg3Var2;
                                }
                                i12 = i3;
                                if ((i2 & Uuid.SIZE_BITS) != 0) {
                                    i13 = i10;
                                    i14 = 2;
                                    cj2 cj2VarM181xeb8e9a2e2 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                                    kk0Var = kk0Var;
                                    cj2Var2 = cj2VarM181xeb8e9a2e2;
                                    i3 = i12 & (-29360129);
                                } else {
                                    i13 = i10;
                                    i14 = 2;
                                    i3 = i12;
                                }
                                cVar4 = cVar3;
                                if (i13 != 0) {
                                    gh2Var3 = null;
                                } else {
                                    gh2Var3 = gh2Var;
                                }
                                rg3Var3 = value;
                            } else {
                                if (i4 != 0) {
                                    cVar3 = c.i;
                                } else {
                                    cVar3 = cVar2;
                                }
                                if (i6 != 0) {
                                    ne1Var6 = null;
                                } else {
                                    ne1Var6 = ne1Var4;
                                }
                                if (i8 != 0) {
                                    ne1Var7 = null;
                                } else {
                                    ne1Var7 = ne1Var5;
                                }
                                if ((i2 & 64) != 0) {
                                    i3 &= -3670017;
                                    value = wg3.getValue(tg3.m, kk0Var, 6);
                                } else {
                                    value = rg3Var2;
                                }
                                i12 = i3;
                                if ((i2 & Uuid.SIZE_BITS) != 0) {
                                    i13 = i10;
                                    i14 = 2;
                                    cj2 cj2VarM181xeb8e9a2e3 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                                    kk0Var = kk0Var;
                                    cj2Var2 = cj2VarM181xeb8e9a2e3;
                                    i3 = i12 & (-29360129);
                                } else {
                                    i13 = i10;
                                    i14 = 2;
                                    i3 = i12;
                                }
                                cVar4 = cVar3;
                                if (i13 != 0) {
                                    gh2Var3 = null;
                                } else {
                                    gh2Var3 = gh2Var;
                                }
                                rg3Var3 = value;
                            }
                            kk0Var.s();
                            int i18 = i3 >> 3;
                            qs0 qs0Var2 = (qs0) cj2Var2;
                            hq3.m211x54dd086a(z, je1Var, d.f(we3.b(cVar4, false, fl1.I), 56.0f, 0.0f, i14).then(d.a), false, rg3Var3, ((re0) qs0Var2.containerColor(z, kk0Var, (i18 & 14) | ((i3 >> 18) & 112)).getValue()).a, 0L, 0.0f, 0.0f, (iw) null, gh2Var3, (ne1) zg0.rememberComposableLambda(191488423, true, new rj2(ne1Var6, qs0Var2, z, ne1Var7, ne1Var), kk0Var, 54), (ck0) kk0Var, (i18 & 126) | ((i3 >> 6) & 57344), ((i3 >> 24) & 14) | 48, 968);
                            rg3Var4 = rg3Var3;
                            gh2Var4 = gh2Var3;
                            cj2Var3 = qs0Var2;
                            cVar5 = cVar4;
                            ne1Var8 = ne1Var6;
                            ne1Var9 = ne1Var7;
                        } else {
                            kk0Var.X();
                            if ((i & 1) != 0) {
                                if (i4 != 0) {
                                    cVar3 = c.i;
                                } else {
                                    cVar3 = cVar2;
                                }
                                if (i6 != 0) {
                                    ne1Var6 = null;
                                } else {
                                    ne1Var6 = ne1Var4;
                                }
                                if (i8 != 0) {
                                    ne1Var7 = null;
                                } else {
                                    ne1Var7 = ne1Var5;
                                }
                                if ((i2 & 64) != 0) {
                                    i3 &= -3670017;
                                    value = wg3.getValue(tg3.m, kk0Var, 6);
                                } else {
                                    value = rg3Var2;
                                }
                                i12 = i3;
                                if ((i2 & Uuid.SIZE_BITS) != 0) {
                                    i13 = i10;
                                    i14 = 2;
                                    cj2 cj2VarM181xeb8e9a2e4 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                                    kk0Var = kk0Var;
                                    cj2Var2 = cj2VarM181xeb8e9a2e4;
                                    i3 = i12 & (-29360129);
                                } else {
                                    i13 = i10;
                                    i14 = 2;
                                    i3 = i12;
                                }
                                cVar4 = cVar3;
                                if (i13 != 0) {
                                    gh2Var3 = null;
                                } else {
                                    gh2Var3 = gh2Var;
                                }
                                rg3Var3 = value;
                            } else {
                                if (i4 != 0) {
                                    cVar3 = c.i;
                                } else {
                                    cVar3 = cVar2;
                                }
                                if (i6 != 0) {
                                    ne1Var6 = null;
                                } else {
                                    ne1Var6 = ne1Var4;
                                }
                                if (i8 != 0) {
                                    ne1Var7 = null;
                                } else {
                                    ne1Var7 = ne1Var5;
                                }
                                if ((i2 & 64) != 0) {
                                    i3 &= -3670017;
                                    value = wg3.getValue(tg3.m, kk0Var, 6);
                                } else {
                                    value = rg3Var2;
                                }
                                i12 = i3;
                                if ((i2 & Uuid.SIZE_BITS) != 0) {
                                    i13 = i10;
                                    i14 = 2;
                                    cj2 cj2VarM181xeb8e9a2e5 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                                    kk0Var = kk0Var;
                                    cj2Var2 = cj2VarM181xeb8e9a2e5;
                                    i3 = i12 & (-29360129);
                                } else {
                                    i13 = i10;
                                    i14 = 2;
                                    i3 = i12;
                                }
                                cVar4 = cVar3;
                                if (i13 != 0) {
                                    gh2Var3 = null;
                                } else {
                                    gh2Var3 = gh2Var;
                                }
                                rg3Var3 = value;
                            }
                            kk0Var.s();
                            int i19 = i3 >> 3;
                            qs0 qs0Var3 = (qs0) cj2Var2;
                            hq3.m211x54dd086a(z, je1Var, d.f(we3.b(cVar4, false, fl1.I), 56.0f, 0.0f, i14).then(d.a), false, rg3Var3, ((re0) qs0Var3.containerColor(z, kk0Var, (i19 & 14) | ((i3 >> 18) & 112)).getValue()).a, 0L, 0.0f, 0.0f, (iw) null, gh2Var3, (ne1) zg0.rememberComposableLambda(191488423, true, new rj2(ne1Var6, qs0Var3, z, ne1Var7, ne1Var), kk0Var, 54), (ck0) kk0Var, (i19 & 126) | ((i3 >> 6) & 57344), ((i3 >> 24) & 14) | 48, 968);
                            rg3Var4 = rg3Var3;
                            gh2Var4 = gh2Var3;
                            cj2Var3 = qs0Var3;
                            cVar5 = cVar4;
                            ne1Var8 = ne1Var6;
                            ne1Var9 = ne1Var7;
                        }
                        w33VarV = kk0Var.v();
                        if (w33VarV != null) {
                            w33VarV.updateScope(new yb(ne1Var, z, je1Var, cVar5, ne1Var8, ne1Var9, rg3Var4, cj2Var3, gh2Var4, i, i2));
                        }
                    }
                    i3 |= 196608;
                    ne1Var5 = ne1Var3;
                    if ((1572864 & i) == 0) {
                        if ((i2 & 64) == 0) {
                            rg3Var2 = rg3Var;
                            if (kk0Var.h(rg3Var2)) {
                            }
                            i3 |= i15;
                        } else {
                            rg3Var2 = rg3Var;
                        }
                        i3 |= i15;
                    } else {
                        rg3Var2 = rg3Var;
                    }
                    if ((12582912 & i) == 0) {
                        if ((i2 & Uuid.SIZE_BITS) == 0) {
                            cj2Var2 = cj2Var;
                            if (kk0Var.h(cj2Var2)) {
                            }
                            i3 |= i16;
                        } else {
                            cj2Var2 = cj2Var;
                        }
                        i3 |= i16;
                    } else {
                        cj2Var2 = cj2Var;
                    }
                    i10 = i2 & FontInfo.NUMBER_OF_CHAR_CODES;
                    if (i10 != 0) {
                        if ((i & 100663296) == 0) {
                            gh2Var2 = gh2Var;
                            if (kk0Var.h(gh2Var2)) {
                                i11 = 67108864;
                            } else {
                                i11 = 33554432;
                            }
                            i3 |= i11;
                        }
                        if ((i3 & 38347923) == 38347922) {
                            kk0Var.X();
                            if ((i & 1) != 0) {
                                if (i4 != 0) {
                                    cVar3 = c.i;
                                } else {
                                    cVar3 = cVar2;
                                }
                                if (i6 != 0) {
                                    ne1Var6 = null;
                                } else {
                                    ne1Var6 = ne1Var4;
                                }
                                if (i8 != 0) {
                                    ne1Var7 = null;
                                } else {
                                    ne1Var7 = ne1Var5;
                                }
                                if ((i2 & 64) != 0) {
                                    i3 &= -3670017;
                                    value = wg3.getValue(tg3.m, kk0Var, 6);
                                } else {
                                    value = rg3Var2;
                                }
                                i12 = i3;
                                if ((i2 & Uuid.SIZE_BITS) != 0) {
                                    i13 = i10;
                                    i14 = 2;
                                    cj2 cj2VarM181xeb8e9a2e6 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                                    kk0Var = kk0Var;
                                    cj2Var2 = cj2VarM181xeb8e9a2e6;
                                    i3 = i12 & (-29360129);
                                } else {
                                    i13 = i10;
                                    i14 = 2;
                                    i3 = i12;
                                }
                                cVar4 = cVar3;
                                if (i13 != 0) {
                                    gh2Var3 = null;
                                } else {
                                    gh2Var3 = gh2Var;
                                }
                                rg3Var3 = value;
                            } else {
                                if (i4 != 0) {
                                    cVar3 = c.i;
                                } else {
                                    cVar3 = cVar2;
                                }
                                if (i6 != 0) {
                                    ne1Var6 = null;
                                } else {
                                    ne1Var6 = ne1Var4;
                                }
                                if (i8 != 0) {
                                    ne1Var7 = null;
                                } else {
                                    ne1Var7 = ne1Var5;
                                }
                                if ((i2 & 64) != 0) {
                                    i3 &= -3670017;
                                    value = wg3.getValue(tg3.m, kk0Var, 6);
                                } else {
                                    value = rg3Var2;
                                }
                                i12 = i3;
                                if ((i2 & Uuid.SIZE_BITS) != 0) {
                                    i13 = i10;
                                    i14 = 2;
                                    cj2 cj2VarM181xeb8e9a2e7 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                                    kk0Var = kk0Var;
                                    cj2Var2 = cj2VarM181xeb8e9a2e7;
                                    i3 = i12 & (-29360129);
                                } else {
                                    i13 = i10;
                                    i14 = 2;
                                    i3 = i12;
                                }
                                cVar4 = cVar3;
                                if (i13 != 0) {
                                    gh2Var3 = null;
                                } else {
                                    gh2Var3 = gh2Var;
                                }
                                rg3Var3 = value;
                            }
                            kk0Var.s();
                            int i110 = i3 >> 3;
                            qs0 qs0Var4 = (qs0) cj2Var2;
                            hq3.m211x54dd086a(z, je1Var, d.f(we3.b(cVar4, false, fl1.I), 56.0f, 0.0f, i14).then(d.a), false, rg3Var3, ((re0) qs0Var4.containerColor(z, kk0Var, (i110 & 14) | ((i3 >> 18) & 112)).getValue()).a, 0L, 0.0f, 0.0f, (iw) null, gh2Var3, (ne1) zg0.rememberComposableLambda(191488423, true, new rj2(ne1Var6, qs0Var4, z, ne1Var7, ne1Var), kk0Var, 54), (ck0) kk0Var, (i110 & 126) | ((i3 >> 6) & 57344), ((i3 >> 24) & 14) | 48, 968);
                            rg3Var4 = rg3Var3;
                            gh2Var4 = gh2Var3;
                            cj2Var3 = qs0Var4;
                            cVar5 = cVar4;
                            ne1Var8 = ne1Var6;
                            ne1Var9 = ne1Var7;
                        } else {
                            kk0Var.X();
                            if ((i & 1) != 0) {
                                if (i4 != 0) {
                                    cVar3 = c.i;
                                } else {
                                    cVar3 = cVar2;
                                }
                                if (i6 != 0) {
                                    ne1Var6 = null;
                                } else {
                                    ne1Var6 = ne1Var4;
                                }
                                if (i8 != 0) {
                                    ne1Var7 = null;
                                } else {
                                    ne1Var7 = ne1Var5;
                                }
                                if ((i2 & 64) != 0) {
                                    i3 &= -3670017;
                                    value = wg3.getValue(tg3.m, kk0Var, 6);
                                } else {
                                    value = rg3Var2;
                                }
                                i12 = i3;
                                if ((i2 & Uuid.SIZE_BITS) != 0) {
                                    i13 = i10;
                                    i14 = 2;
                                    cj2 cj2VarM181xeb8e9a2e8 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                                    kk0Var = kk0Var;
                                    cj2Var2 = cj2VarM181xeb8e9a2e8;
                                    i3 = i12 & (-29360129);
                                } else {
                                    i13 = i10;
                                    i14 = 2;
                                    i3 = i12;
                                }
                                cVar4 = cVar3;
                                if (i13 != 0) {
                                    gh2Var3 = null;
                                } else {
                                    gh2Var3 = gh2Var;
                                }
                                rg3Var3 = value;
                            } else {
                                if (i4 != 0) {
                                    cVar3 = c.i;
                                } else {
                                    cVar3 = cVar2;
                                }
                                if (i6 != 0) {
                                    ne1Var6 = null;
                                } else {
                                    ne1Var6 = ne1Var4;
                                }
                                if (i8 != 0) {
                                    ne1Var7 = null;
                                } else {
                                    ne1Var7 = ne1Var5;
                                }
                                if ((i2 & 64) != 0) {
                                    i3 &= -3670017;
                                    value = wg3.getValue(tg3.m, kk0Var, 6);
                                } else {
                                    value = rg3Var2;
                                }
                                i12 = i3;
                                if ((i2 & Uuid.SIZE_BITS) != 0) {
                                    i13 = i10;
                                    i14 = 2;
                                    cj2 cj2VarM181xeb8e9a2e9 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                                    kk0Var = kk0Var;
                                    cj2Var2 = cj2VarM181xeb8e9a2e9;
                                    i3 = i12 & (-29360129);
                                } else {
                                    i13 = i10;
                                    i14 = 2;
                                    i3 = i12;
                                }
                                cVar4 = cVar3;
                                if (i13 != 0) {
                                    gh2Var3 = null;
                                } else {
                                    gh2Var3 = gh2Var;
                                }
                                rg3Var3 = value;
                            }
                            kk0Var.s();
                            int i111 = i3 >> 3;
                            qs0 qs0Var5 = (qs0) cj2Var2;
                            hq3.m211x54dd086a(z, je1Var, d.f(we3.b(cVar4, false, fl1.I), 56.0f, 0.0f, i14).then(d.a), false, rg3Var3, ((re0) qs0Var5.containerColor(z, kk0Var, (i111 & 14) | ((i3 >> 18) & 112)).getValue()).a, 0L, 0.0f, 0.0f, (iw) null, gh2Var3, (ne1) zg0.rememberComposableLambda(191488423, true, new rj2(ne1Var6, qs0Var5, z, ne1Var7, ne1Var), kk0Var, 54), (ck0) kk0Var, (i111 & 126) | ((i3 >> 6) & 57344), ((i3 >> 24) & 14) | 48, 968);
                            rg3Var4 = rg3Var3;
                            gh2Var4 = gh2Var3;
                            cj2Var3 = qs0Var5;
                            cVar5 = cVar4;
                            ne1Var8 = ne1Var6;
                            ne1Var9 = ne1Var7;
                        }
                        w33VarV = kk0Var.v();
                        if (w33VarV != null) {
                            w33VarV.updateScope(new yb(ne1Var, z, je1Var, cVar5, ne1Var8, ne1Var9, rg3Var4, cj2Var3, gh2Var4, i, i2));
                        }
                    }
                    i3 |= 100663296;
                    gh2Var2 = gh2Var;
                    if ((i3 & 38347923) == 38347922) {
                        kk0Var.X();
                        if ((i & 1) != 0) {
                            if (i4 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i6 != 0) {
                                ne1Var6 = null;
                            } else {
                                ne1Var6 = ne1Var4;
                            }
                            if (i8 != 0) {
                                ne1Var7 = null;
                            } else {
                                ne1Var7 = ne1Var5;
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                                value = wg3.getValue(tg3.m, kk0Var, 6);
                            } else {
                                value = rg3Var2;
                            }
                            i12 = i3;
                            if ((i2 & Uuid.SIZE_BITS) != 0) {
                                i13 = i10;
                                i14 = 2;
                                cj2 cj2VarM181xeb8e9a2e10 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                                kk0Var = kk0Var;
                                cj2Var2 = cj2VarM181xeb8e9a2e10;
                                i3 = i12 & (-29360129);
                            } else {
                                i13 = i10;
                                i14 = 2;
                                i3 = i12;
                            }
                            cVar4 = cVar3;
                            if (i13 != 0) {
                                gh2Var3 = null;
                            } else {
                                gh2Var3 = gh2Var;
                            }
                            rg3Var3 = value;
                        } else {
                            if (i4 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i6 != 0) {
                                ne1Var6 = null;
                            } else {
                                ne1Var6 = ne1Var4;
                            }
                            if (i8 != 0) {
                                ne1Var7 = null;
                            } else {
                                ne1Var7 = ne1Var5;
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                                value = wg3.getValue(tg3.m, kk0Var, 6);
                            } else {
                                value = rg3Var2;
                            }
                            i12 = i3;
                            if ((i2 & Uuid.SIZE_BITS) != 0) {
                                i13 = i10;
                                i14 = 2;
                                cj2 cj2VarM181xeb8e9a2e11 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                                kk0Var = kk0Var;
                                cj2Var2 = cj2VarM181xeb8e9a2e11;
                                i3 = i12 & (-29360129);
                            } else {
                                i13 = i10;
                                i14 = 2;
                                i3 = i12;
                            }
                            cVar4 = cVar3;
                            if (i13 != 0) {
                                gh2Var3 = null;
                            } else {
                                gh2Var3 = gh2Var;
                            }
                            rg3Var3 = value;
                        }
                        kk0Var.s();
                        int i112 = i3 >> 3;
                        qs0 qs0Var6 = (qs0) cj2Var2;
                        hq3.m211x54dd086a(z, je1Var, d.f(we3.b(cVar4, false, fl1.I), 56.0f, 0.0f, i14).then(d.a), false, rg3Var3, ((re0) qs0Var6.containerColor(z, kk0Var, (i112 & 14) | ((i3 >> 18) & 112)).getValue()).a, 0L, 0.0f, 0.0f, (iw) null, gh2Var3, (ne1) zg0.rememberComposableLambda(191488423, true, new rj2(ne1Var6, qs0Var6, z, ne1Var7, ne1Var), kk0Var, 54), (ck0) kk0Var, (i112 & 126) | ((i3 >> 6) & 57344), ((i3 >> 24) & 14) | 48, 968);
                        rg3Var4 = rg3Var3;
                        gh2Var4 = gh2Var3;
                        cj2Var3 = qs0Var6;
                        cVar5 = cVar4;
                        ne1Var8 = ne1Var6;
                        ne1Var9 = ne1Var7;
                    } else {
                        kk0Var.X();
                        if ((i & 1) != 0) {
                            if (i4 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i6 != 0) {
                                ne1Var6 = null;
                            } else {
                                ne1Var6 = ne1Var4;
                            }
                            if (i8 != 0) {
                                ne1Var7 = null;
                            } else {
                                ne1Var7 = ne1Var5;
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                                value = wg3.getValue(tg3.m, kk0Var, 6);
                            } else {
                                value = rg3Var2;
                            }
                            i12 = i3;
                            if ((i2 & Uuid.SIZE_BITS) != 0) {
                                i13 = i10;
                                i14 = 2;
                                cj2 cj2VarM181xeb8e9a2e12 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                                kk0Var = kk0Var;
                                cj2Var2 = cj2VarM181xeb8e9a2e12;
                                i3 = i12 & (-29360129);
                            } else {
                                i13 = i10;
                                i14 = 2;
                                i3 = i12;
                            }
                            cVar4 = cVar3;
                            if (i13 != 0) {
                                gh2Var3 = null;
                            } else {
                                gh2Var3 = gh2Var;
                            }
                            rg3Var3 = value;
                        } else {
                            if (i4 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i6 != 0) {
                                ne1Var6 = null;
                            } else {
                                ne1Var6 = ne1Var4;
                            }
                            if (i8 != 0) {
                                ne1Var7 = null;
                            } else {
                                ne1Var7 = ne1Var5;
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                                value = wg3.getValue(tg3.m, kk0Var, 6);
                            } else {
                                value = rg3Var2;
                            }
                            i12 = i3;
                            if ((i2 & Uuid.SIZE_BITS) != 0) {
                                i13 = i10;
                                i14 = 2;
                                cj2 cj2VarM181xeb8e9a2e13 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                                kk0Var = kk0Var;
                                cj2Var2 = cj2VarM181xeb8e9a2e13;
                                i3 = i12 & (-29360129);
                            } else {
                                i13 = i10;
                                i14 = 2;
                                i3 = i12;
                            }
                            cVar4 = cVar3;
                            if (i13 != 0) {
                                gh2Var3 = null;
                            } else {
                                gh2Var3 = gh2Var;
                            }
                            rg3Var3 = value;
                        }
                        kk0Var.s();
                        int i113 = i3 >> 3;
                        qs0 qs0Var7 = (qs0) cj2Var2;
                        hq3.m211x54dd086a(z, je1Var, d.f(we3.b(cVar4, false, fl1.I), 56.0f, 0.0f, i14).then(d.a), false, rg3Var3, ((re0) qs0Var7.containerColor(z, kk0Var, (i113 & 14) | ((i3 >> 18) & 112)).getValue()).a, 0L, 0.0f, 0.0f, (iw) null, gh2Var3, (ne1) zg0.rememberComposableLambda(191488423, true, new rj2(ne1Var6, qs0Var7, z, ne1Var7, ne1Var), kk0Var, 54), (ck0) kk0Var, (i113 & 126) | ((i3 >> 6) & 57344), ((i3 >> 24) & 14) | 48, 968);
                        rg3Var4 = rg3Var3;
                        gh2Var4 = gh2Var3;
                        cj2Var3 = qs0Var7;
                        cVar5 = cVar4;
                        ne1Var8 = ne1Var6;
                        ne1Var9 = ne1Var7;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new yb(ne1Var, z, je1Var, cVar5, ne1Var8, ne1Var9, rg3Var4, cj2Var3, gh2Var4, i, i2));
                    }
                }
                i3 |= 24576;
                ne1Var4 = ne1Var2;
                i8 = i2 & 32;
                if (i8 != 0) {
                    if ((196608 & i) == 0) {
                        ne1Var5 = ne1Var3;
                        if (kk0Var.j(ne1Var5)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    }
                    if ((1572864 & i) == 0) {
                        if ((i2 & 64) == 0) {
                            rg3Var2 = rg3Var;
                            if (kk0Var.h(rg3Var2)) {
                            }
                            i3 |= i15;
                        } else {
                            rg3Var2 = rg3Var;
                        }
                        i3 |= i15;
                    } else {
                        rg3Var2 = rg3Var;
                    }
                    if ((12582912 & i) == 0) {
                        if ((i2 & Uuid.SIZE_BITS) == 0) {
                            cj2Var2 = cj2Var;
                            if (kk0Var.h(cj2Var2)) {
                            }
                            i3 |= i16;
                        } else {
                            cj2Var2 = cj2Var;
                        }
                        i3 |= i16;
                    } else {
                        cj2Var2 = cj2Var;
                    }
                    i10 = i2 & FontInfo.NUMBER_OF_CHAR_CODES;
                    if (i10 != 0) {
                        if ((i & 100663296) == 0) {
                            gh2Var2 = gh2Var;
                            if (kk0Var.h(gh2Var2)) {
                                i11 = 67108864;
                            } else {
                                i11 = 33554432;
                            }
                            i3 |= i11;
                        }
                        if ((i3 & 38347923) == 38347922) {
                            kk0Var.X();
                            if ((i & 1) != 0) {
                                if (i4 != 0) {
                                    cVar3 = c.i;
                                } else {
                                    cVar3 = cVar2;
                                }
                                if (i6 != 0) {
                                    ne1Var6 = null;
                                } else {
                                    ne1Var6 = ne1Var4;
                                }
                                if (i8 != 0) {
                                    ne1Var7 = null;
                                } else {
                                    ne1Var7 = ne1Var5;
                                }
                                if ((i2 & 64) != 0) {
                                    i3 &= -3670017;
                                    value = wg3.getValue(tg3.m, kk0Var, 6);
                                } else {
                                    value = rg3Var2;
                                }
                                i12 = i3;
                                if ((i2 & Uuid.SIZE_BITS) != 0) {
                                    i13 = i10;
                                    i14 = 2;
                                    cj2 cj2VarM181xeb8e9a2e14 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                                    kk0Var = kk0Var;
                                    cj2Var2 = cj2VarM181xeb8e9a2e14;
                                    i3 = i12 & (-29360129);
                                } else {
                                    i13 = i10;
                                    i14 = 2;
                                    i3 = i12;
                                }
                                cVar4 = cVar3;
                                if (i13 != 0) {
                                    gh2Var3 = null;
                                } else {
                                    gh2Var3 = gh2Var;
                                }
                                rg3Var3 = value;
                            } else {
                                if (i4 != 0) {
                                    cVar3 = c.i;
                                } else {
                                    cVar3 = cVar2;
                                }
                                if (i6 != 0) {
                                    ne1Var6 = null;
                                } else {
                                    ne1Var6 = ne1Var4;
                                }
                                if (i8 != 0) {
                                    ne1Var7 = null;
                                } else {
                                    ne1Var7 = ne1Var5;
                                }
                                if ((i2 & 64) != 0) {
                                    i3 &= -3670017;
                                    value = wg3.getValue(tg3.m, kk0Var, 6);
                                } else {
                                    value = rg3Var2;
                                }
                                i12 = i3;
                                if ((i2 & Uuid.SIZE_BITS) != 0) {
                                    i13 = i10;
                                    i14 = 2;
                                    cj2 cj2VarM181xeb8e9a2e15 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                                    kk0Var = kk0Var;
                                    cj2Var2 = cj2VarM181xeb8e9a2e15;
                                    i3 = i12 & (-29360129);
                                } else {
                                    i13 = i10;
                                    i14 = 2;
                                    i3 = i12;
                                }
                                cVar4 = cVar3;
                                if (i13 != 0) {
                                    gh2Var3 = null;
                                } else {
                                    gh2Var3 = gh2Var;
                                }
                                rg3Var3 = value;
                            }
                            kk0Var.s();
                            int i114 = i3 >> 3;
                            qs0 qs0Var8 = (qs0) cj2Var2;
                            hq3.m211x54dd086a(z, je1Var, d.f(we3.b(cVar4, false, fl1.I), 56.0f, 0.0f, i14).then(d.a), false, rg3Var3, ((re0) qs0Var8.containerColor(z, kk0Var, (i114 & 14) | ((i3 >> 18) & 112)).getValue()).a, 0L, 0.0f, 0.0f, (iw) null, gh2Var3, (ne1) zg0.rememberComposableLambda(191488423, true, new rj2(ne1Var6, qs0Var8, z, ne1Var7, ne1Var), kk0Var, 54), (ck0) kk0Var, (i114 & 126) | ((i3 >> 6) & 57344), ((i3 >> 24) & 14) | 48, 968);
                            rg3Var4 = rg3Var3;
                            gh2Var4 = gh2Var3;
                            cj2Var3 = qs0Var8;
                            cVar5 = cVar4;
                            ne1Var8 = ne1Var6;
                            ne1Var9 = ne1Var7;
                        } else {
                            kk0Var.X();
                            if ((i & 1) != 0) {
                                if (i4 != 0) {
                                    cVar3 = c.i;
                                } else {
                                    cVar3 = cVar2;
                                }
                                if (i6 != 0) {
                                    ne1Var6 = null;
                                } else {
                                    ne1Var6 = ne1Var4;
                                }
                                if (i8 != 0) {
                                    ne1Var7 = null;
                                } else {
                                    ne1Var7 = ne1Var5;
                                }
                                if ((i2 & 64) != 0) {
                                    i3 &= -3670017;
                                    value = wg3.getValue(tg3.m, kk0Var, 6);
                                } else {
                                    value = rg3Var2;
                                }
                                i12 = i3;
                                if ((i2 & Uuid.SIZE_BITS) != 0) {
                                    i13 = i10;
                                    i14 = 2;
                                    cj2 cj2VarM181xeb8e9a2e16 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                                    kk0Var = kk0Var;
                                    cj2Var2 = cj2VarM181xeb8e9a2e16;
                                    i3 = i12 & (-29360129);
                                } else {
                                    i13 = i10;
                                    i14 = 2;
                                    i3 = i12;
                                }
                                cVar4 = cVar3;
                                if (i13 != 0) {
                                    gh2Var3 = null;
                                } else {
                                    gh2Var3 = gh2Var;
                                }
                                rg3Var3 = value;
                            } else {
                                if (i4 != 0) {
                                    cVar3 = c.i;
                                } else {
                                    cVar3 = cVar2;
                                }
                                if (i6 != 0) {
                                    ne1Var6 = null;
                                } else {
                                    ne1Var6 = ne1Var4;
                                }
                                if (i8 != 0) {
                                    ne1Var7 = null;
                                } else {
                                    ne1Var7 = ne1Var5;
                                }
                                if ((i2 & 64) != 0) {
                                    i3 &= -3670017;
                                    value = wg3.getValue(tg3.m, kk0Var, 6);
                                } else {
                                    value = rg3Var2;
                                }
                                i12 = i3;
                                if ((i2 & Uuid.SIZE_BITS) != 0) {
                                    i13 = i10;
                                    i14 = 2;
                                    cj2 cj2VarM181xeb8e9a2e17 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                                    kk0Var = kk0Var;
                                    cj2Var2 = cj2VarM181xeb8e9a2e17;
                                    i3 = i12 & (-29360129);
                                } else {
                                    i13 = i10;
                                    i14 = 2;
                                    i3 = i12;
                                }
                                cVar4 = cVar3;
                                if (i13 != 0) {
                                    gh2Var3 = null;
                                } else {
                                    gh2Var3 = gh2Var;
                                }
                                rg3Var3 = value;
                            }
                            kk0Var.s();
                            int i115 = i3 >> 3;
                            qs0 qs0Var9 = (qs0) cj2Var2;
                            hq3.m211x54dd086a(z, je1Var, d.f(we3.b(cVar4, false, fl1.I), 56.0f, 0.0f, i14).then(d.a), false, rg3Var3, ((re0) qs0Var9.containerColor(z, kk0Var, (i115 & 14) | ((i3 >> 18) & 112)).getValue()).a, 0L, 0.0f, 0.0f, (iw) null, gh2Var3, (ne1) zg0.rememberComposableLambda(191488423, true, new rj2(ne1Var6, qs0Var9, z, ne1Var7, ne1Var), kk0Var, 54), (ck0) kk0Var, (i115 & 126) | ((i3 >> 6) & 57344), ((i3 >> 24) & 14) | 48, 968);
                            rg3Var4 = rg3Var3;
                            gh2Var4 = gh2Var3;
                            cj2Var3 = qs0Var9;
                            cVar5 = cVar4;
                            ne1Var8 = ne1Var6;
                            ne1Var9 = ne1Var7;
                        }
                        w33VarV = kk0Var.v();
                        if (w33VarV != null) {
                            w33VarV.updateScope(new yb(ne1Var, z, je1Var, cVar5, ne1Var8, ne1Var9, rg3Var4, cj2Var3, gh2Var4, i, i2));
                        }
                    }
                    i3 |= 100663296;
                    gh2Var2 = gh2Var;
                    if ((i3 & 38347923) == 38347922) {
                        kk0Var.X();
                        if ((i & 1) != 0) {
                            if (i4 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i6 != 0) {
                                ne1Var6 = null;
                            } else {
                                ne1Var6 = ne1Var4;
                            }
                            if (i8 != 0) {
                                ne1Var7 = null;
                            } else {
                                ne1Var7 = ne1Var5;
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                                value = wg3.getValue(tg3.m, kk0Var, 6);
                            } else {
                                value = rg3Var2;
                            }
                            i12 = i3;
                            if ((i2 & Uuid.SIZE_BITS) != 0) {
                                i13 = i10;
                                i14 = 2;
                                cj2 cj2VarM181xeb8e9a2e18 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                                kk0Var = kk0Var;
                                cj2Var2 = cj2VarM181xeb8e9a2e18;
                                i3 = i12 & (-29360129);
                            } else {
                                i13 = i10;
                                i14 = 2;
                                i3 = i12;
                            }
                            cVar4 = cVar3;
                            if (i13 != 0) {
                                gh2Var3 = null;
                            } else {
                                gh2Var3 = gh2Var;
                            }
                            rg3Var3 = value;
                        } else {
                            if (i4 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i6 != 0) {
                                ne1Var6 = null;
                            } else {
                                ne1Var6 = ne1Var4;
                            }
                            if (i8 != 0) {
                                ne1Var7 = null;
                            } else {
                                ne1Var7 = ne1Var5;
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                                value = wg3.getValue(tg3.m, kk0Var, 6);
                            } else {
                                value = rg3Var2;
                            }
                            i12 = i3;
                            if ((i2 & Uuid.SIZE_BITS) != 0) {
                                i13 = i10;
                                i14 = 2;
                                cj2 cj2VarM181xeb8e9a2e19 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                                kk0Var = kk0Var;
                                cj2Var2 = cj2VarM181xeb8e9a2e19;
                                i3 = i12 & (-29360129);
                            } else {
                                i13 = i10;
                                i14 = 2;
                                i3 = i12;
                            }
                            cVar4 = cVar3;
                            if (i13 != 0) {
                                gh2Var3 = null;
                            } else {
                                gh2Var3 = gh2Var;
                            }
                            rg3Var3 = value;
                        }
                        kk0Var.s();
                        int i116 = i3 >> 3;
                        qs0 qs0Var10 = (qs0) cj2Var2;
                        hq3.m211x54dd086a(z, je1Var, d.f(we3.b(cVar4, false, fl1.I), 56.0f, 0.0f, i14).then(d.a), false, rg3Var3, ((re0) qs0Var10.containerColor(z, kk0Var, (i116 & 14) | ((i3 >> 18) & 112)).getValue()).a, 0L, 0.0f, 0.0f, (iw) null, gh2Var3, (ne1) zg0.rememberComposableLambda(191488423, true, new rj2(ne1Var6, qs0Var10, z, ne1Var7, ne1Var), kk0Var, 54), (ck0) kk0Var, (i116 & 126) | ((i3 >> 6) & 57344), ((i3 >> 24) & 14) | 48, 968);
                        rg3Var4 = rg3Var3;
                        gh2Var4 = gh2Var3;
                        cj2Var3 = qs0Var10;
                        cVar5 = cVar4;
                        ne1Var8 = ne1Var6;
                        ne1Var9 = ne1Var7;
                    } else {
                        kk0Var.X();
                        if ((i & 1) != 0) {
                            if (i4 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i6 != 0) {
                                ne1Var6 = null;
                            } else {
                                ne1Var6 = ne1Var4;
                            }
                            if (i8 != 0) {
                                ne1Var7 = null;
                            } else {
                                ne1Var7 = ne1Var5;
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                                value = wg3.getValue(tg3.m, kk0Var, 6);
                            } else {
                                value = rg3Var2;
                            }
                            i12 = i3;
                            if ((i2 & Uuid.SIZE_BITS) != 0) {
                                i13 = i10;
                                i14 = 2;
                                cj2 cj2VarM181xeb8e9a2e110 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                                kk0Var = kk0Var;
                                cj2Var2 = cj2VarM181xeb8e9a2e110;
                                i3 = i12 & (-29360129);
                            } else {
                                i13 = i10;
                                i14 = 2;
                                i3 = i12;
                            }
                            cVar4 = cVar3;
                            if (i13 != 0) {
                                gh2Var3 = null;
                            } else {
                                gh2Var3 = gh2Var;
                            }
                            rg3Var3 = value;
                        } else {
                            if (i4 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i6 != 0) {
                                ne1Var6 = null;
                            } else {
                                ne1Var6 = ne1Var4;
                            }
                            if (i8 != 0) {
                                ne1Var7 = null;
                            } else {
                                ne1Var7 = ne1Var5;
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                                value = wg3.getValue(tg3.m, kk0Var, 6);
                            } else {
                                value = rg3Var2;
                            }
                            i12 = i3;
                            if ((i2 & Uuid.SIZE_BITS) != 0) {
                                i13 = i10;
                                i14 = 2;
                                cj2 cj2VarM181xeb8e9a2e111 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                                kk0Var = kk0Var;
                                cj2Var2 = cj2VarM181xeb8e9a2e111;
                                i3 = i12 & (-29360129);
                            } else {
                                i13 = i10;
                                i14 = 2;
                                i3 = i12;
                            }
                            cVar4 = cVar3;
                            if (i13 != 0) {
                                gh2Var3 = null;
                            } else {
                                gh2Var3 = gh2Var;
                            }
                            rg3Var3 = value;
                        }
                        kk0Var.s();
                        int i117 = i3 >> 3;
                        qs0 qs0Var11 = (qs0) cj2Var2;
                        hq3.m211x54dd086a(z, je1Var, d.f(we3.b(cVar4, false, fl1.I), 56.0f, 0.0f, i14).then(d.a), false, rg3Var3, ((re0) qs0Var11.containerColor(z, kk0Var, (i117 & 14) | ((i3 >> 18) & 112)).getValue()).a, 0L, 0.0f, 0.0f, (iw) null, gh2Var3, (ne1) zg0.rememberComposableLambda(191488423, true, new rj2(ne1Var6, qs0Var11, z, ne1Var7, ne1Var), kk0Var, 54), (ck0) kk0Var, (i117 & 126) | ((i3 >> 6) & 57344), ((i3 >> 24) & 14) | 48, 968);
                        rg3Var4 = rg3Var3;
                        gh2Var4 = gh2Var3;
                        cj2Var3 = qs0Var11;
                        cVar5 = cVar4;
                        ne1Var8 = ne1Var6;
                        ne1Var9 = ne1Var7;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new yb(ne1Var, z, je1Var, cVar5, ne1Var8, ne1Var9, rg3Var4, cj2Var3, gh2Var4, i, i2));
                    }
                }
                i3 |= 196608;
                ne1Var5 = ne1Var3;
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        rg3Var2 = rg3Var;
                        if (kk0Var.h(rg3Var2)) {
                        }
                        i3 |= i15;
                    } else {
                        rg3Var2 = rg3Var;
                    }
                    i3 |= i15;
                } else {
                    rg3Var2 = rg3Var;
                }
                if ((12582912 & i) == 0) {
                    if ((i2 & Uuid.SIZE_BITS) == 0) {
                        cj2Var2 = cj2Var;
                        if (kk0Var.h(cj2Var2)) {
                        }
                        i3 |= i16;
                    } else {
                        cj2Var2 = cj2Var;
                    }
                    i3 |= i16;
                } else {
                    cj2Var2 = cj2Var;
                }
                i10 = i2 & FontInfo.NUMBER_OF_CHAR_CODES;
                if (i10 != 0) {
                    if ((i & 100663296) == 0) {
                        gh2Var2 = gh2Var;
                        if (kk0Var.h(gh2Var2)) {
                            i11 = 67108864;
                        } else {
                            i11 = 33554432;
                        }
                        i3 |= i11;
                    }
                    if ((i3 & 38347923) == 38347922) {
                        kk0Var.X();
                        if ((i & 1) != 0) {
                            if (i4 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i6 != 0) {
                                ne1Var6 = null;
                            } else {
                                ne1Var6 = ne1Var4;
                            }
                            if (i8 != 0) {
                                ne1Var7 = null;
                            } else {
                                ne1Var7 = ne1Var5;
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                                value = wg3.getValue(tg3.m, kk0Var, 6);
                            } else {
                                value = rg3Var2;
                            }
                            i12 = i3;
                            if ((i2 & Uuid.SIZE_BITS) != 0) {
                                i13 = i10;
                                i14 = 2;
                                cj2 cj2VarM181xeb8e9a2e112 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                                kk0Var = kk0Var;
                                cj2Var2 = cj2VarM181xeb8e9a2e112;
                                i3 = i12 & (-29360129);
                            } else {
                                i13 = i10;
                                i14 = 2;
                                i3 = i12;
                            }
                            cVar4 = cVar3;
                            if (i13 != 0) {
                                gh2Var3 = null;
                            } else {
                                gh2Var3 = gh2Var;
                            }
                            rg3Var3 = value;
                        } else {
                            if (i4 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i6 != 0) {
                                ne1Var6 = null;
                            } else {
                                ne1Var6 = ne1Var4;
                            }
                            if (i8 != 0) {
                                ne1Var7 = null;
                            } else {
                                ne1Var7 = ne1Var5;
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                                value = wg3.getValue(tg3.m, kk0Var, 6);
                            } else {
                                value = rg3Var2;
                            }
                            i12 = i3;
                            if ((i2 & Uuid.SIZE_BITS) != 0) {
                                i13 = i10;
                                i14 = 2;
                                cj2 cj2VarM181xeb8e9a2e113 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                                kk0Var = kk0Var;
                                cj2Var2 = cj2VarM181xeb8e9a2e113;
                                i3 = i12 & (-29360129);
                            } else {
                                i13 = i10;
                                i14 = 2;
                                i3 = i12;
                            }
                            cVar4 = cVar3;
                            if (i13 != 0) {
                                gh2Var3 = null;
                            } else {
                                gh2Var3 = gh2Var;
                            }
                            rg3Var3 = value;
                        }
                        kk0Var.s();
                        int i118 = i3 >> 3;
                        qs0 qs0Var12 = (qs0) cj2Var2;
                        hq3.m211x54dd086a(z, je1Var, d.f(we3.b(cVar4, false, fl1.I), 56.0f, 0.0f, i14).then(d.a), false, rg3Var3, ((re0) qs0Var12.containerColor(z, kk0Var, (i118 & 14) | ((i3 >> 18) & 112)).getValue()).a, 0L, 0.0f, 0.0f, (iw) null, gh2Var3, (ne1) zg0.rememberComposableLambda(191488423, true, new rj2(ne1Var6, qs0Var12, z, ne1Var7, ne1Var), kk0Var, 54), (ck0) kk0Var, (i118 & 126) | ((i3 >> 6) & 57344), ((i3 >> 24) & 14) | 48, 968);
                        rg3Var4 = rg3Var3;
                        gh2Var4 = gh2Var3;
                        cj2Var3 = qs0Var12;
                        cVar5 = cVar4;
                        ne1Var8 = ne1Var6;
                        ne1Var9 = ne1Var7;
                    } else {
                        kk0Var.X();
                        if ((i & 1) != 0) {
                            if (i4 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i6 != 0) {
                                ne1Var6 = null;
                            } else {
                                ne1Var6 = ne1Var4;
                            }
                            if (i8 != 0) {
                                ne1Var7 = null;
                            } else {
                                ne1Var7 = ne1Var5;
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                                value = wg3.getValue(tg3.m, kk0Var, 6);
                            } else {
                                value = rg3Var2;
                            }
                            i12 = i3;
                            if ((i2 & Uuid.SIZE_BITS) != 0) {
                                i13 = i10;
                                i14 = 2;
                                cj2 cj2VarM181xeb8e9a2e114 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                                kk0Var = kk0Var;
                                cj2Var2 = cj2VarM181xeb8e9a2e114;
                                i3 = i12 & (-29360129);
                            } else {
                                i13 = i10;
                                i14 = 2;
                                i3 = i12;
                            }
                            cVar4 = cVar3;
                            if (i13 != 0) {
                                gh2Var3 = null;
                            } else {
                                gh2Var3 = gh2Var;
                            }
                            rg3Var3 = value;
                        } else {
                            if (i4 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i6 != 0) {
                                ne1Var6 = null;
                            } else {
                                ne1Var6 = ne1Var4;
                            }
                            if (i8 != 0) {
                                ne1Var7 = null;
                            } else {
                                ne1Var7 = ne1Var5;
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                                value = wg3.getValue(tg3.m, kk0Var, 6);
                            } else {
                                value = rg3Var2;
                            }
                            i12 = i3;
                            if ((i2 & Uuid.SIZE_BITS) != 0) {
                                i13 = i10;
                                i14 = 2;
                                cj2 cj2VarM181xeb8e9a2e115 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                                kk0Var = kk0Var;
                                cj2Var2 = cj2VarM181xeb8e9a2e115;
                                i3 = i12 & (-29360129);
                            } else {
                                i13 = i10;
                                i14 = 2;
                                i3 = i12;
                            }
                            cVar4 = cVar3;
                            if (i13 != 0) {
                                gh2Var3 = null;
                            } else {
                                gh2Var3 = gh2Var;
                            }
                            rg3Var3 = value;
                        }
                        kk0Var.s();
                        int i119 = i3 >> 3;
                        qs0 qs0Var13 = (qs0) cj2Var2;
                        hq3.m211x54dd086a(z, je1Var, d.f(we3.b(cVar4, false, fl1.I), 56.0f, 0.0f, i14).then(d.a), false, rg3Var3, ((re0) qs0Var13.containerColor(z, kk0Var, (i119 & 14) | ((i3 >> 18) & 112)).getValue()).a, 0L, 0.0f, 0.0f, (iw) null, gh2Var3, (ne1) zg0.rememberComposableLambda(191488423, true, new rj2(ne1Var6, qs0Var13, z, ne1Var7, ne1Var), kk0Var, 54), (ck0) kk0Var, (i119 & 126) | ((i3 >> 6) & 57344), ((i3 >> 24) & 14) | 48, 968);
                        rg3Var4 = rg3Var3;
                        gh2Var4 = gh2Var3;
                        cj2Var3 = qs0Var13;
                        cVar5 = cVar4;
                        ne1Var8 = ne1Var6;
                        ne1Var9 = ne1Var7;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new yb(ne1Var, z, je1Var, cVar5, ne1Var8, ne1Var9, rg3Var4, cj2Var3, gh2Var4, i, i2));
                    }
                }
                i3 |= 100663296;
                gh2Var2 = gh2Var;
                if ((i3 & 38347923) == 38347922) {
                    kk0Var.X();
                    if ((i & 1) != 0) {
                        if (i4 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i6 != 0) {
                            ne1Var6 = null;
                        } else {
                            ne1Var6 = ne1Var4;
                        }
                        if (i8 != 0) {
                            ne1Var7 = null;
                        } else {
                            ne1Var7 = ne1Var5;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            value = wg3.getValue(tg3.m, kk0Var, 6);
                        } else {
                            value = rg3Var2;
                        }
                        i12 = i3;
                        if ((i2 & Uuid.SIZE_BITS) != 0) {
                            i13 = i10;
                            i14 = 2;
                            cj2 cj2VarM181xeb8e9a2e116 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                            kk0Var = kk0Var;
                            cj2Var2 = cj2VarM181xeb8e9a2e116;
                            i3 = i12 & (-29360129);
                        } else {
                            i13 = i10;
                            i14 = 2;
                            i3 = i12;
                        }
                        cVar4 = cVar3;
                        if (i13 != 0) {
                            gh2Var3 = null;
                        } else {
                            gh2Var3 = gh2Var;
                        }
                        rg3Var3 = value;
                    } else {
                        if (i4 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i6 != 0) {
                            ne1Var6 = null;
                        } else {
                            ne1Var6 = ne1Var4;
                        }
                        if (i8 != 0) {
                            ne1Var7 = null;
                        } else {
                            ne1Var7 = ne1Var5;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            value = wg3.getValue(tg3.m, kk0Var, 6);
                        } else {
                            value = rg3Var2;
                        }
                        i12 = i3;
                        if ((i2 & Uuid.SIZE_BITS) != 0) {
                            i13 = i10;
                            i14 = 2;
                            cj2 cj2VarM181xeb8e9a2e117 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                            kk0Var = kk0Var;
                            cj2Var2 = cj2VarM181xeb8e9a2e117;
                            i3 = i12 & (-29360129);
                        } else {
                            i13 = i10;
                            i14 = 2;
                            i3 = i12;
                        }
                        cVar4 = cVar3;
                        if (i13 != 0) {
                            gh2Var3 = null;
                        } else {
                            gh2Var3 = gh2Var;
                        }
                        rg3Var3 = value;
                    }
                    kk0Var.s();
                    int i1110 = i3 >> 3;
                    qs0 qs0Var14 = (qs0) cj2Var2;
                    hq3.m211x54dd086a(z, je1Var, d.f(we3.b(cVar4, false, fl1.I), 56.0f, 0.0f, i14).then(d.a), false, rg3Var3, ((re0) qs0Var14.containerColor(z, kk0Var, (i1110 & 14) | ((i3 >> 18) & 112)).getValue()).a, 0L, 0.0f, 0.0f, (iw) null, gh2Var3, (ne1) zg0.rememberComposableLambda(191488423, true, new rj2(ne1Var6, qs0Var14, z, ne1Var7, ne1Var), kk0Var, 54), (ck0) kk0Var, (i1110 & 126) | ((i3 >> 6) & 57344), ((i3 >> 24) & 14) | 48, 968);
                    rg3Var4 = rg3Var3;
                    gh2Var4 = gh2Var3;
                    cj2Var3 = qs0Var14;
                    cVar5 = cVar4;
                    ne1Var8 = ne1Var6;
                    ne1Var9 = ne1Var7;
                } else {
                    kk0Var.X();
                    if ((i & 1) != 0) {
                        if (i4 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i6 != 0) {
                            ne1Var6 = null;
                        } else {
                            ne1Var6 = ne1Var4;
                        }
                        if (i8 != 0) {
                            ne1Var7 = null;
                        } else {
                            ne1Var7 = ne1Var5;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            value = wg3.getValue(tg3.m, kk0Var, 6);
                        } else {
                            value = rg3Var2;
                        }
                        i12 = i3;
                        if ((i2 & Uuid.SIZE_BITS) != 0) {
                            i13 = i10;
                            i14 = 2;
                            cj2 cj2VarM181xeb8e9a2e118 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                            kk0Var = kk0Var;
                            cj2Var2 = cj2VarM181xeb8e9a2e118;
                            i3 = i12 & (-29360129);
                        } else {
                            i13 = i10;
                            i14 = 2;
                            i3 = i12;
                        }
                        cVar4 = cVar3;
                        if (i13 != 0) {
                            gh2Var3 = null;
                        } else {
                            gh2Var3 = gh2Var;
                        }
                        rg3Var3 = value;
                    } else {
                        if (i4 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i6 != 0) {
                            ne1Var6 = null;
                        } else {
                            ne1Var6 = ne1Var4;
                        }
                        if (i8 != 0) {
                            ne1Var7 = null;
                        } else {
                            ne1Var7 = ne1Var5;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            value = wg3.getValue(tg3.m, kk0Var, 6);
                        } else {
                            value = rg3Var2;
                        }
                        i12 = i3;
                        if ((i2 & Uuid.SIZE_BITS) != 0) {
                            i13 = i10;
                            i14 = 2;
                            cj2 cj2VarM181xeb8e9a2e119 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                            kk0Var = kk0Var;
                            cj2Var2 = cj2VarM181xeb8e9a2e119;
                            i3 = i12 & (-29360129);
                        } else {
                            i13 = i10;
                            i14 = 2;
                            i3 = i12;
                        }
                        cVar4 = cVar3;
                        if (i13 != 0) {
                            gh2Var3 = null;
                        } else {
                            gh2Var3 = gh2Var;
                        }
                        rg3Var3 = value;
                    }
                    kk0Var.s();
                    int i1111 = i3 >> 3;
                    qs0 qs0Var15 = (qs0) cj2Var2;
                    hq3.m211x54dd086a(z, je1Var, d.f(we3.b(cVar4, false, fl1.I), 56.0f, 0.0f, i14).then(d.a), false, rg3Var3, ((re0) qs0Var15.containerColor(z, kk0Var, (i1111 & 14) | ((i3 >> 18) & 112)).getValue()).a, 0L, 0.0f, 0.0f, (iw) null, gh2Var3, (ne1) zg0.rememberComposableLambda(191488423, true, new rj2(ne1Var6, qs0Var15, z, ne1Var7, ne1Var), kk0Var, 54), (ck0) kk0Var, (i1111 & 126) | ((i3 >> 6) & 57344), ((i3 >> 24) & 14) | 48, 968);
                    rg3Var4 = rg3Var3;
                    gh2Var4 = gh2Var3;
                    cj2Var3 = qs0Var15;
                    cVar5 = cVar4;
                    ne1Var8 = ne1Var6;
                    ne1Var9 = ne1Var7;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new yb(ne1Var, z, je1Var, cVar5, ne1Var8, ne1Var9, rg3Var4, cj2Var3, gh2Var4, i, i2));
                }
            }
            i3 |= 3072;
            cVar2 = cVar;
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    ne1Var4 = ne1Var2;
                    if (kk0Var.j(ne1Var4)) {
                        i7 = 16384;
                    } else {
                        i7 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 32;
                if (i8 != 0) {
                    if ((196608 & i) == 0) {
                        ne1Var5 = ne1Var3;
                        if (kk0Var.j(ne1Var5)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    }
                    if ((1572864 & i) == 0) {
                        if ((i2 & 64) == 0) {
                            rg3Var2 = rg3Var;
                            if (kk0Var.h(rg3Var2)) {
                            }
                            i3 |= i15;
                        } else {
                            rg3Var2 = rg3Var;
                        }
                        i3 |= i15;
                    } else {
                        rg3Var2 = rg3Var;
                    }
                    if ((12582912 & i) == 0) {
                        if ((i2 & Uuid.SIZE_BITS) == 0) {
                            cj2Var2 = cj2Var;
                            if (kk0Var.h(cj2Var2)) {
                            }
                            i3 |= i16;
                        } else {
                            cj2Var2 = cj2Var;
                        }
                        i3 |= i16;
                    } else {
                        cj2Var2 = cj2Var;
                    }
                    i10 = i2 & FontInfo.NUMBER_OF_CHAR_CODES;
                    if (i10 != 0) {
                        if ((i & 100663296) == 0) {
                            gh2Var2 = gh2Var;
                            if (kk0Var.h(gh2Var2)) {
                                i11 = 67108864;
                            } else {
                                i11 = 33554432;
                            }
                            i3 |= i11;
                        }
                        if ((i3 & 38347923) == 38347922) {
                            kk0Var.X();
                            if ((i & 1) != 0) {
                                if (i4 != 0) {
                                    cVar3 = c.i;
                                } else {
                                    cVar3 = cVar2;
                                }
                                if (i6 != 0) {
                                    ne1Var6 = null;
                                } else {
                                    ne1Var6 = ne1Var4;
                                }
                                if (i8 != 0) {
                                    ne1Var7 = null;
                                } else {
                                    ne1Var7 = ne1Var5;
                                }
                                if ((i2 & 64) != 0) {
                                    i3 &= -3670017;
                                    value = wg3.getValue(tg3.m, kk0Var, 6);
                                } else {
                                    value = rg3Var2;
                                }
                                i12 = i3;
                                if ((i2 & Uuid.SIZE_BITS) != 0) {
                                    i13 = i10;
                                    i14 = 2;
                                    cj2 cj2VarM181xeb8e9a2e1110 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                                    kk0Var = kk0Var;
                                    cj2Var2 = cj2VarM181xeb8e9a2e1110;
                                    i3 = i12 & (-29360129);
                                } else {
                                    i13 = i10;
                                    i14 = 2;
                                    i3 = i12;
                                }
                                cVar4 = cVar3;
                                if (i13 != 0) {
                                    gh2Var3 = null;
                                } else {
                                    gh2Var3 = gh2Var;
                                }
                                rg3Var3 = value;
                            } else {
                                if (i4 != 0) {
                                    cVar3 = c.i;
                                } else {
                                    cVar3 = cVar2;
                                }
                                if (i6 != 0) {
                                    ne1Var6 = null;
                                } else {
                                    ne1Var6 = ne1Var4;
                                }
                                if (i8 != 0) {
                                    ne1Var7 = null;
                                } else {
                                    ne1Var7 = ne1Var5;
                                }
                                if ((i2 & 64) != 0) {
                                    i3 &= -3670017;
                                    value = wg3.getValue(tg3.m, kk0Var, 6);
                                } else {
                                    value = rg3Var2;
                                }
                                i12 = i3;
                                if ((i2 & Uuid.SIZE_BITS) != 0) {
                                    i13 = i10;
                                    i14 = 2;
                                    cj2 cj2VarM181xeb8e9a2e1111 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                                    kk0Var = kk0Var;
                                    cj2Var2 = cj2VarM181xeb8e9a2e1111;
                                    i3 = i12 & (-29360129);
                                } else {
                                    i13 = i10;
                                    i14 = 2;
                                    i3 = i12;
                                }
                                cVar4 = cVar3;
                                if (i13 != 0) {
                                    gh2Var3 = null;
                                } else {
                                    gh2Var3 = gh2Var;
                                }
                                rg3Var3 = value;
                            }
                            kk0Var.s();
                            int i1112 = i3 >> 3;
                            qs0 qs0Var16 = (qs0) cj2Var2;
                            hq3.m211x54dd086a(z, je1Var, d.f(we3.b(cVar4, false, fl1.I), 56.0f, 0.0f, i14).then(d.a), false, rg3Var3, ((re0) qs0Var16.containerColor(z, kk0Var, (i1112 & 14) | ((i3 >> 18) & 112)).getValue()).a, 0L, 0.0f, 0.0f, (iw) null, gh2Var3, (ne1) zg0.rememberComposableLambda(191488423, true, new rj2(ne1Var6, qs0Var16, z, ne1Var7, ne1Var), kk0Var, 54), (ck0) kk0Var, (i1112 & 126) | ((i3 >> 6) & 57344), ((i3 >> 24) & 14) | 48, 968);
                            rg3Var4 = rg3Var3;
                            gh2Var4 = gh2Var3;
                            cj2Var3 = qs0Var16;
                            cVar5 = cVar4;
                            ne1Var8 = ne1Var6;
                            ne1Var9 = ne1Var7;
                        } else {
                            kk0Var.X();
                            if ((i & 1) != 0) {
                                if (i4 != 0) {
                                    cVar3 = c.i;
                                } else {
                                    cVar3 = cVar2;
                                }
                                if (i6 != 0) {
                                    ne1Var6 = null;
                                } else {
                                    ne1Var6 = ne1Var4;
                                }
                                if (i8 != 0) {
                                    ne1Var7 = null;
                                } else {
                                    ne1Var7 = ne1Var5;
                                }
                                if ((i2 & 64) != 0) {
                                    i3 &= -3670017;
                                    value = wg3.getValue(tg3.m, kk0Var, 6);
                                } else {
                                    value = rg3Var2;
                                }
                                i12 = i3;
                                if ((i2 & Uuid.SIZE_BITS) != 0) {
                                    i13 = i10;
                                    i14 = 2;
                                    cj2 cj2VarM181xeb8e9a2e1112 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                                    kk0Var = kk0Var;
                                    cj2Var2 = cj2VarM181xeb8e9a2e1112;
                                    i3 = i12 & (-29360129);
                                } else {
                                    i13 = i10;
                                    i14 = 2;
                                    i3 = i12;
                                }
                                cVar4 = cVar3;
                                if (i13 != 0) {
                                    gh2Var3 = null;
                                } else {
                                    gh2Var3 = gh2Var;
                                }
                                rg3Var3 = value;
                            } else {
                                if (i4 != 0) {
                                    cVar3 = c.i;
                                } else {
                                    cVar3 = cVar2;
                                }
                                if (i6 != 0) {
                                    ne1Var6 = null;
                                } else {
                                    ne1Var6 = ne1Var4;
                                }
                                if (i8 != 0) {
                                    ne1Var7 = null;
                                } else {
                                    ne1Var7 = ne1Var5;
                                }
                                if ((i2 & 64) != 0) {
                                    i3 &= -3670017;
                                    value = wg3.getValue(tg3.m, kk0Var, 6);
                                } else {
                                    value = rg3Var2;
                                }
                                i12 = i3;
                                if ((i2 & Uuid.SIZE_BITS) != 0) {
                                    i13 = i10;
                                    i14 = 2;
                                    cj2 cj2VarM181xeb8e9a2e1113 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                                    kk0Var = kk0Var;
                                    cj2Var2 = cj2VarM181xeb8e9a2e1113;
                                    i3 = i12 & (-29360129);
                                } else {
                                    i13 = i10;
                                    i14 = 2;
                                    i3 = i12;
                                }
                                cVar4 = cVar3;
                                if (i13 != 0) {
                                    gh2Var3 = null;
                                } else {
                                    gh2Var3 = gh2Var;
                                }
                                rg3Var3 = value;
                            }
                            kk0Var.s();
                            int i1113 = i3 >> 3;
                            qs0 qs0Var17 = (qs0) cj2Var2;
                            hq3.m211x54dd086a(z, je1Var, d.f(we3.b(cVar4, false, fl1.I), 56.0f, 0.0f, i14).then(d.a), false, rg3Var3, ((re0) qs0Var17.containerColor(z, kk0Var, (i1113 & 14) | ((i3 >> 18) & 112)).getValue()).a, 0L, 0.0f, 0.0f, (iw) null, gh2Var3, (ne1) zg0.rememberComposableLambda(191488423, true, new rj2(ne1Var6, qs0Var17, z, ne1Var7, ne1Var), kk0Var, 54), (ck0) kk0Var, (i1113 & 126) | ((i3 >> 6) & 57344), ((i3 >> 24) & 14) | 48, 968);
                            rg3Var4 = rg3Var3;
                            gh2Var4 = gh2Var3;
                            cj2Var3 = qs0Var17;
                            cVar5 = cVar4;
                            ne1Var8 = ne1Var6;
                            ne1Var9 = ne1Var7;
                        }
                        w33VarV = kk0Var.v();
                        if (w33VarV != null) {
                            w33VarV.updateScope(new yb(ne1Var, z, je1Var, cVar5, ne1Var8, ne1Var9, rg3Var4, cj2Var3, gh2Var4, i, i2));
                        }
                    }
                    i3 |= 100663296;
                    gh2Var2 = gh2Var;
                    if ((i3 & 38347923) == 38347922) {
                        kk0Var.X();
                        if ((i & 1) != 0) {
                            if (i4 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i6 != 0) {
                                ne1Var6 = null;
                            } else {
                                ne1Var6 = ne1Var4;
                            }
                            if (i8 != 0) {
                                ne1Var7 = null;
                            } else {
                                ne1Var7 = ne1Var5;
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                                value = wg3.getValue(tg3.m, kk0Var, 6);
                            } else {
                                value = rg3Var2;
                            }
                            i12 = i3;
                            if ((i2 & Uuid.SIZE_BITS) != 0) {
                                i13 = i10;
                                i14 = 2;
                                cj2 cj2VarM181xeb8e9a2e1114 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                                kk0Var = kk0Var;
                                cj2Var2 = cj2VarM181xeb8e9a2e1114;
                                i3 = i12 & (-29360129);
                            } else {
                                i13 = i10;
                                i14 = 2;
                                i3 = i12;
                            }
                            cVar4 = cVar3;
                            if (i13 != 0) {
                                gh2Var3 = null;
                            } else {
                                gh2Var3 = gh2Var;
                            }
                            rg3Var3 = value;
                        } else {
                            if (i4 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i6 != 0) {
                                ne1Var6 = null;
                            } else {
                                ne1Var6 = ne1Var4;
                            }
                            if (i8 != 0) {
                                ne1Var7 = null;
                            } else {
                                ne1Var7 = ne1Var5;
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                                value = wg3.getValue(tg3.m, kk0Var, 6);
                            } else {
                                value = rg3Var2;
                            }
                            i12 = i3;
                            if ((i2 & Uuid.SIZE_BITS) != 0) {
                                i13 = i10;
                                i14 = 2;
                                cj2 cj2VarM181xeb8e9a2e1115 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                                kk0Var = kk0Var;
                                cj2Var2 = cj2VarM181xeb8e9a2e1115;
                                i3 = i12 & (-29360129);
                            } else {
                                i13 = i10;
                                i14 = 2;
                                i3 = i12;
                            }
                            cVar4 = cVar3;
                            if (i13 != 0) {
                                gh2Var3 = null;
                            } else {
                                gh2Var3 = gh2Var;
                            }
                            rg3Var3 = value;
                        }
                        kk0Var.s();
                        int i1114 = i3 >> 3;
                        qs0 qs0Var18 = (qs0) cj2Var2;
                        hq3.m211x54dd086a(z, je1Var, d.f(we3.b(cVar4, false, fl1.I), 56.0f, 0.0f, i14).then(d.a), false, rg3Var3, ((re0) qs0Var18.containerColor(z, kk0Var, (i1114 & 14) | ((i3 >> 18) & 112)).getValue()).a, 0L, 0.0f, 0.0f, (iw) null, gh2Var3, (ne1) zg0.rememberComposableLambda(191488423, true, new rj2(ne1Var6, qs0Var18, z, ne1Var7, ne1Var), kk0Var, 54), (ck0) kk0Var, (i1114 & 126) | ((i3 >> 6) & 57344), ((i3 >> 24) & 14) | 48, 968);
                        rg3Var4 = rg3Var3;
                        gh2Var4 = gh2Var3;
                        cj2Var3 = qs0Var18;
                        cVar5 = cVar4;
                        ne1Var8 = ne1Var6;
                        ne1Var9 = ne1Var7;
                    } else {
                        kk0Var.X();
                        if ((i & 1) != 0) {
                            if (i4 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i6 != 0) {
                                ne1Var6 = null;
                            } else {
                                ne1Var6 = ne1Var4;
                            }
                            if (i8 != 0) {
                                ne1Var7 = null;
                            } else {
                                ne1Var7 = ne1Var5;
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                                value = wg3.getValue(tg3.m, kk0Var, 6);
                            } else {
                                value = rg3Var2;
                            }
                            i12 = i3;
                            if ((i2 & Uuid.SIZE_BITS) != 0) {
                                i13 = i10;
                                i14 = 2;
                                cj2 cj2VarM181xeb8e9a2e1116 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                                kk0Var = kk0Var;
                                cj2Var2 = cj2VarM181xeb8e9a2e1116;
                                i3 = i12 & (-29360129);
                            } else {
                                i13 = i10;
                                i14 = 2;
                                i3 = i12;
                            }
                            cVar4 = cVar3;
                            if (i13 != 0) {
                                gh2Var3 = null;
                            } else {
                                gh2Var3 = gh2Var;
                            }
                            rg3Var3 = value;
                        } else {
                            if (i4 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i6 != 0) {
                                ne1Var6 = null;
                            } else {
                                ne1Var6 = ne1Var4;
                            }
                            if (i8 != 0) {
                                ne1Var7 = null;
                            } else {
                                ne1Var7 = ne1Var5;
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                                value = wg3.getValue(tg3.m, kk0Var, 6);
                            } else {
                                value = rg3Var2;
                            }
                            i12 = i3;
                            if ((i2 & Uuid.SIZE_BITS) != 0) {
                                i13 = i10;
                                i14 = 2;
                                cj2 cj2VarM181xeb8e9a2e1117 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                                kk0Var = kk0Var;
                                cj2Var2 = cj2VarM181xeb8e9a2e1117;
                                i3 = i12 & (-29360129);
                            } else {
                                i13 = i10;
                                i14 = 2;
                                i3 = i12;
                            }
                            cVar4 = cVar3;
                            if (i13 != 0) {
                                gh2Var3 = null;
                            } else {
                                gh2Var3 = gh2Var;
                            }
                            rg3Var3 = value;
                        }
                        kk0Var.s();
                        int i1115 = i3 >> 3;
                        qs0 qs0Var19 = (qs0) cj2Var2;
                        hq3.m211x54dd086a(z, je1Var, d.f(we3.b(cVar4, false, fl1.I), 56.0f, 0.0f, i14).then(d.a), false, rg3Var3, ((re0) qs0Var19.containerColor(z, kk0Var, (i1115 & 14) | ((i3 >> 18) & 112)).getValue()).a, 0L, 0.0f, 0.0f, (iw) null, gh2Var3, (ne1) zg0.rememberComposableLambda(191488423, true, new rj2(ne1Var6, qs0Var19, z, ne1Var7, ne1Var), kk0Var, 54), (ck0) kk0Var, (i1115 & 126) | ((i3 >> 6) & 57344), ((i3 >> 24) & 14) | 48, 968);
                        rg3Var4 = rg3Var3;
                        gh2Var4 = gh2Var3;
                        cj2Var3 = qs0Var19;
                        cVar5 = cVar4;
                        ne1Var8 = ne1Var6;
                        ne1Var9 = ne1Var7;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new yb(ne1Var, z, je1Var, cVar5, ne1Var8, ne1Var9, rg3Var4, cj2Var3, gh2Var4, i, i2));
                    }
                }
                i3 |= 196608;
                ne1Var5 = ne1Var3;
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        rg3Var2 = rg3Var;
                        if (kk0Var.h(rg3Var2)) {
                        }
                        i3 |= i15;
                    } else {
                        rg3Var2 = rg3Var;
                    }
                    i3 |= i15;
                } else {
                    rg3Var2 = rg3Var;
                }
                if ((12582912 & i) == 0) {
                    if ((i2 & Uuid.SIZE_BITS) == 0) {
                        cj2Var2 = cj2Var;
                        if (kk0Var.h(cj2Var2)) {
                        }
                        i3 |= i16;
                    } else {
                        cj2Var2 = cj2Var;
                    }
                    i3 |= i16;
                } else {
                    cj2Var2 = cj2Var;
                }
                i10 = i2 & FontInfo.NUMBER_OF_CHAR_CODES;
                if (i10 != 0) {
                    if ((i & 100663296) == 0) {
                        gh2Var2 = gh2Var;
                        if (kk0Var.h(gh2Var2)) {
                            i11 = 67108864;
                        } else {
                            i11 = 33554432;
                        }
                        i3 |= i11;
                    }
                    if ((i3 & 38347923) == 38347922) {
                        kk0Var.X();
                        if ((i & 1) != 0) {
                            if (i4 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i6 != 0) {
                                ne1Var6 = null;
                            } else {
                                ne1Var6 = ne1Var4;
                            }
                            if (i8 != 0) {
                                ne1Var7 = null;
                            } else {
                                ne1Var7 = ne1Var5;
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                                value = wg3.getValue(tg3.m, kk0Var, 6);
                            } else {
                                value = rg3Var2;
                            }
                            i12 = i3;
                            if ((i2 & Uuid.SIZE_BITS) != 0) {
                                i13 = i10;
                                i14 = 2;
                                cj2 cj2VarM181xeb8e9a2e1118 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                                kk0Var = kk0Var;
                                cj2Var2 = cj2VarM181xeb8e9a2e1118;
                                i3 = i12 & (-29360129);
                            } else {
                                i13 = i10;
                                i14 = 2;
                                i3 = i12;
                            }
                            cVar4 = cVar3;
                            if (i13 != 0) {
                                gh2Var3 = null;
                            } else {
                                gh2Var3 = gh2Var;
                            }
                            rg3Var3 = value;
                        } else {
                            if (i4 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i6 != 0) {
                                ne1Var6 = null;
                            } else {
                                ne1Var6 = ne1Var4;
                            }
                            if (i8 != 0) {
                                ne1Var7 = null;
                            } else {
                                ne1Var7 = ne1Var5;
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                                value = wg3.getValue(tg3.m, kk0Var, 6);
                            } else {
                                value = rg3Var2;
                            }
                            i12 = i3;
                            if ((i2 & Uuid.SIZE_BITS) != 0) {
                                i13 = i10;
                                i14 = 2;
                                cj2 cj2VarM181xeb8e9a2e1119 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                                kk0Var = kk0Var;
                                cj2Var2 = cj2VarM181xeb8e9a2e1119;
                                i3 = i12 & (-29360129);
                            } else {
                                i13 = i10;
                                i14 = 2;
                                i3 = i12;
                            }
                            cVar4 = cVar3;
                            if (i13 != 0) {
                                gh2Var3 = null;
                            } else {
                                gh2Var3 = gh2Var;
                            }
                            rg3Var3 = value;
                        }
                        kk0Var.s();
                        int i1116 = i3 >> 3;
                        qs0 qs0Var110 = (qs0) cj2Var2;
                        hq3.m211x54dd086a(z, je1Var, d.f(we3.b(cVar4, false, fl1.I), 56.0f, 0.0f, i14).then(d.a), false, rg3Var3, ((re0) qs0Var110.containerColor(z, kk0Var, (i1116 & 14) | ((i3 >> 18) & 112)).getValue()).a, 0L, 0.0f, 0.0f, (iw) null, gh2Var3, (ne1) zg0.rememberComposableLambda(191488423, true, new rj2(ne1Var6, qs0Var110, z, ne1Var7, ne1Var), kk0Var, 54), (ck0) kk0Var, (i1116 & 126) | ((i3 >> 6) & 57344), ((i3 >> 24) & 14) | 48, 968);
                        rg3Var4 = rg3Var3;
                        gh2Var4 = gh2Var3;
                        cj2Var3 = qs0Var110;
                        cVar5 = cVar4;
                        ne1Var8 = ne1Var6;
                        ne1Var9 = ne1Var7;
                    } else {
                        kk0Var.X();
                        if ((i & 1) != 0) {
                            if (i4 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i6 != 0) {
                                ne1Var6 = null;
                            } else {
                                ne1Var6 = ne1Var4;
                            }
                            if (i8 != 0) {
                                ne1Var7 = null;
                            } else {
                                ne1Var7 = ne1Var5;
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                                value = wg3.getValue(tg3.m, kk0Var, 6);
                            } else {
                                value = rg3Var2;
                            }
                            i12 = i3;
                            if ((i2 & Uuid.SIZE_BITS) != 0) {
                                i13 = i10;
                                i14 = 2;
                                cj2 cj2VarM181xeb8e9a2e11110 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                                kk0Var = kk0Var;
                                cj2Var2 = cj2VarM181xeb8e9a2e11110;
                                i3 = i12 & (-29360129);
                            } else {
                                i13 = i10;
                                i14 = 2;
                                i3 = i12;
                            }
                            cVar4 = cVar3;
                            if (i13 != 0) {
                                gh2Var3 = null;
                            } else {
                                gh2Var3 = gh2Var;
                            }
                            rg3Var3 = value;
                        } else {
                            if (i4 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i6 != 0) {
                                ne1Var6 = null;
                            } else {
                                ne1Var6 = ne1Var4;
                            }
                            if (i8 != 0) {
                                ne1Var7 = null;
                            } else {
                                ne1Var7 = ne1Var5;
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                                value = wg3.getValue(tg3.m, kk0Var, 6);
                            } else {
                                value = rg3Var2;
                            }
                            i12 = i3;
                            if ((i2 & Uuid.SIZE_BITS) != 0) {
                                i13 = i10;
                                i14 = 2;
                                cj2 cj2VarM181xeb8e9a2e11111 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                                kk0Var = kk0Var;
                                cj2Var2 = cj2VarM181xeb8e9a2e11111;
                                i3 = i12 & (-29360129);
                            } else {
                                i13 = i10;
                                i14 = 2;
                                i3 = i12;
                            }
                            cVar4 = cVar3;
                            if (i13 != 0) {
                                gh2Var3 = null;
                            } else {
                                gh2Var3 = gh2Var;
                            }
                            rg3Var3 = value;
                        }
                        kk0Var.s();
                        int i1117 = i3 >> 3;
                        qs0 qs0Var111 = (qs0) cj2Var2;
                        hq3.m211x54dd086a(z, je1Var, d.f(we3.b(cVar4, false, fl1.I), 56.0f, 0.0f, i14).then(d.a), false, rg3Var3, ((re0) qs0Var111.containerColor(z, kk0Var, (i1117 & 14) | ((i3 >> 18) & 112)).getValue()).a, 0L, 0.0f, 0.0f, (iw) null, gh2Var3, (ne1) zg0.rememberComposableLambda(191488423, true, new rj2(ne1Var6, qs0Var111, z, ne1Var7, ne1Var), kk0Var, 54), (ck0) kk0Var, (i1117 & 126) | ((i3 >> 6) & 57344), ((i3 >> 24) & 14) | 48, 968);
                        rg3Var4 = rg3Var3;
                        gh2Var4 = gh2Var3;
                        cj2Var3 = qs0Var111;
                        cVar5 = cVar4;
                        ne1Var8 = ne1Var6;
                        ne1Var9 = ne1Var7;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new yb(ne1Var, z, je1Var, cVar5, ne1Var8, ne1Var9, rg3Var4, cj2Var3, gh2Var4, i, i2));
                    }
                }
                i3 |= 100663296;
                gh2Var2 = gh2Var;
                if ((i3 & 38347923) == 38347922) {
                    kk0Var.X();
                    if ((i & 1) != 0) {
                        if (i4 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i6 != 0) {
                            ne1Var6 = null;
                        } else {
                            ne1Var6 = ne1Var4;
                        }
                        if (i8 != 0) {
                            ne1Var7 = null;
                        } else {
                            ne1Var7 = ne1Var5;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            value = wg3.getValue(tg3.m, kk0Var, 6);
                        } else {
                            value = rg3Var2;
                        }
                        i12 = i3;
                        if ((i2 & Uuid.SIZE_BITS) != 0) {
                            i13 = i10;
                            i14 = 2;
                            cj2 cj2VarM181xeb8e9a2e11112 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                            kk0Var = kk0Var;
                            cj2Var2 = cj2VarM181xeb8e9a2e11112;
                            i3 = i12 & (-29360129);
                        } else {
                            i13 = i10;
                            i14 = 2;
                            i3 = i12;
                        }
                        cVar4 = cVar3;
                        if (i13 != 0) {
                            gh2Var3 = null;
                        } else {
                            gh2Var3 = gh2Var;
                        }
                        rg3Var3 = value;
                    } else {
                        if (i4 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i6 != 0) {
                            ne1Var6 = null;
                        } else {
                            ne1Var6 = ne1Var4;
                        }
                        if (i8 != 0) {
                            ne1Var7 = null;
                        } else {
                            ne1Var7 = ne1Var5;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            value = wg3.getValue(tg3.m, kk0Var, 6);
                        } else {
                            value = rg3Var2;
                        }
                        i12 = i3;
                        if ((i2 & Uuid.SIZE_BITS) != 0) {
                            i13 = i10;
                            i14 = 2;
                            cj2 cj2VarM181xeb8e9a2e11113 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                            kk0Var = kk0Var;
                            cj2Var2 = cj2VarM181xeb8e9a2e11113;
                            i3 = i12 & (-29360129);
                        } else {
                            i13 = i10;
                            i14 = 2;
                            i3 = i12;
                        }
                        cVar4 = cVar3;
                        if (i13 != 0) {
                            gh2Var3 = null;
                        } else {
                            gh2Var3 = gh2Var;
                        }
                        rg3Var3 = value;
                    }
                    kk0Var.s();
                    int i1118 = i3 >> 3;
                    qs0 qs0Var112 = (qs0) cj2Var2;
                    hq3.m211x54dd086a(z, je1Var, d.f(we3.b(cVar4, false, fl1.I), 56.0f, 0.0f, i14).then(d.a), false, rg3Var3, ((re0) qs0Var112.containerColor(z, kk0Var, (i1118 & 14) | ((i3 >> 18) & 112)).getValue()).a, 0L, 0.0f, 0.0f, (iw) null, gh2Var3, (ne1) zg0.rememberComposableLambda(191488423, true, new rj2(ne1Var6, qs0Var112, z, ne1Var7, ne1Var), kk0Var, 54), (ck0) kk0Var, (i1118 & 126) | ((i3 >> 6) & 57344), ((i3 >> 24) & 14) | 48, 968);
                    rg3Var4 = rg3Var3;
                    gh2Var4 = gh2Var3;
                    cj2Var3 = qs0Var112;
                    cVar5 = cVar4;
                    ne1Var8 = ne1Var6;
                    ne1Var9 = ne1Var7;
                } else {
                    kk0Var.X();
                    if ((i & 1) != 0) {
                        if (i4 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i6 != 0) {
                            ne1Var6 = null;
                        } else {
                            ne1Var6 = ne1Var4;
                        }
                        if (i8 != 0) {
                            ne1Var7 = null;
                        } else {
                            ne1Var7 = ne1Var5;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            value = wg3.getValue(tg3.m, kk0Var, 6);
                        } else {
                            value = rg3Var2;
                        }
                        i12 = i3;
                        if ((i2 & Uuid.SIZE_BITS) != 0) {
                            i13 = i10;
                            i14 = 2;
                            cj2 cj2VarM181xeb8e9a2e11114 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                            kk0Var = kk0Var;
                            cj2Var2 = cj2VarM181xeb8e9a2e11114;
                            i3 = i12 & (-29360129);
                        } else {
                            i13 = i10;
                            i14 = 2;
                            i3 = i12;
                        }
                        cVar4 = cVar3;
                        if (i13 != 0) {
                            gh2Var3 = null;
                        } else {
                            gh2Var3 = gh2Var;
                        }
                        rg3Var3 = value;
                    } else {
                        if (i4 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i6 != 0) {
                            ne1Var6 = null;
                        } else {
                            ne1Var6 = ne1Var4;
                        }
                        if (i8 != 0) {
                            ne1Var7 = null;
                        } else {
                            ne1Var7 = ne1Var5;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            value = wg3.getValue(tg3.m, kk0Var, 6);
                        } else {
                            value = rg3Var2;
                        }
                        i12 = i3;
                        if ((i2 & Uuid.SIZE_BITS) != 0) {
                            i13 = i10;
                            i14 = 2;
                            cj2 cj2VarM181xeb8e9a2e11115 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                            kk0Var = kk0Var;
                            cj2Var2 = cj2VarM181xeb8e9a2e11115;
                            i3 = i12 & (-29360129);
                        } else {
                            i13 = i10;
                            i14 = 2;
                            i3 = i12;
                        }
                        cVar4 = cVar3;
                        if (i13 != 0) {
                            gh2Var3 = null;
                        } else {
                            gh2Var3 = gh2Var;
                        }
                        rg3Var3 = value;
                    }
                    kk0Var.s();
                    int i1119 = i3 >> 3;
                    qs0 qs0Var113 = (qs0) cj2Var2;
                    hq3.m211x54dd086a(z, je1Var, d.f(we3.b(cVar4, false, fl1.I), 56.0f, 0.0f, i14).then(d.a), false, rg3Var3, ((re0) qs0Var113.containerColor(z, kk0Var, (i1119 & 14) | ((i3 >> 18) & 112)).getValue()).a, 0L, 0.0f, 0.0f, (iw) null, gh2Var3, (ne1) zg0.rememberComposableLambda(191488423, true, new rj2(ne1Var6, qs0Var113, z, ne1Var7, ne1Var), kk0Var, 54), (ck0) kk0Var, (i1119 & 126) | ((i3 >> 6) & 57344), ((i3 >> 24) & 14) | 48, 968);
                    rg3Var4 = rg3Var3;
                    gh2Var4 = gh2Var3;
                    cj2Var3 = qs0Var113;
                    cVar5 = cVar4;
                    ne1Var8 = ne1Var6;
                    ne1Var9 = ne1Var7;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new yb(ne1Var, z, je1Var, cVar5, ne1Var8, ne1Var9, rg3Var4, cj2Var3, gh2Var4, i, i2));
                }
            }
            i3 |= 24576;
            ne1Var4 = ne1Var2;
            i8 = i2 & 32;
            if (i8 != 0) {
                if ((196608 & i) == 0) {
                    ne1Var5 = ne1Var3;
                    if (kk0Var.j(ne1Var5)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        rg3Var2 = rg3Var;
                        if (kk0Var.h(rg3Var2)) {
                        }
                        i3 |= i15;
                    } else {
                        rg3Var2 = rg3Var;
                    }
                    i3 |= i15;
                } else {
                    rg3Var2 = rg3Var;
                }
                if ((12582912 & i) == 0) {
                    if ((i2 & Uuid.SIZE_BITS) == 0) {
                        cj2Var2 = cj2Var;
                        if (kk0Var.h(cj2Var2)) {
                        }
                        i3 |= i16;
                    } else {
                        cj2Var2 = cj2Var;
                    }
                    i3 |= i16;
                } else {
                    cj2Var2 = cj2Var;
                }
                i10 = i2 & FontInfo.NUMBER_OF_CHAR_CODES;
                if (i10 != 0) {
                    if ((i & 100663296) == 0) {
                        gh2Var2 = gh2Var;
                        if (kk0Var.h(gh2Var2)) {
                            i11 = 67108864;
                        } else {
                            i11 = 33554432;
                        }
                        i3 |= i11;
                    }
                    if ((i3 & 38347923) == 38347922) {
                        kk0Var.X();
                        if ((i & 1) != 0) {
                            if (i4 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i6 != 0) {
                                ne1Var6 = null;
                            } else {
                                ne1Var6 = ne1Var4;
                            }
                            if (i8 != 0) {
                                ne1Var7 = null;
                            } else {
                                ne1Var7 = ne1Var5;
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                                value = wg3.getValue(tg3.m, kk0Var, 6);
                            } else {
                                value = rg3Var2;
                            }
                            i12 = i3;
                            if ((i2 & Uuid.SIZE_BITS) != 0) {
                                i13 = i10;
                                i14 = 2;
                                cj2 cj2VarM181xeb8e9a2e11116 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                                kk0Var = kk0Var;
                                cj2Var2 = cj2VarM181xeb8e9a2e11116;
                                i3 = i12 & (-29360129);
                            } else {
                                i13 = i10;
                                i14 = 2;
                                i3 = i12;
                            }
                            cVar4 = cVar3;
                            if (i13 != 0) {
                                gh2Var3 = null;
                            } else {
                                gh2Var3 = gh2Var;
                            }
                            rg3Var3 = value;
                        } else {
                            if (i4 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i6 != 0) {
                                ne1Var6 = null;
                            } else {
                                ne1Var6 = ne1Var4;
                            }
                            if (i8 != 0) {
                                ne1Var7 = null;
                            } else {
                                ne1Var7 = ne1Var5;
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                                value = wg3.getValue(tg3.m, kk0Var, 6);
                            } else {
                                value = rg3Var2;
                            }
                            i12 = i3;
                            if ((i2 & Uuid.SIZE_BITS) != 0) {
                                i13 = i10;
                                i14 = 2;
                                cj2 cj2VarM181xeb8e9a2e11117 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                                kk0Var = kk0Var;
                                cj2Var2 = cj2VarM181xeb8e9a2e11117;
                                i3 = i12 & (-29360129);
                            } else {
                                i13 = i10;
                                i14 = 2;
                                i3 = i12;
                            }
                            cVar4 = cVar3;
                            if (i13 != 0) {
                                gh2Var3 = null;
                            } else {
                                gh2Var3 = gh2Var;
                            }
                            rg3Var3 = value;
                        }
                        kk0Var.s();
                        int i11110 = i3 >> 3;
                        qs0 qs0Var114 = (qs0) cj2Var2;
                        hq3.m211x54dd086a(z, je1Var, d.f(we3.b(cVar4, false, fl1.I), 56.0f, 0.0f, i14).then(d.a), false, rg3Var3, ((re0) qs0Var114.containerColor(z, kk0Var, (i11110 & 14) | ((i3 >> 18) & 112)).getValue()).a, 0L, 0.0f, 0.0f, (iw) null, gh2Var3, (ne1) zg0.rememberComposableLambda(191488423, true, new rj2(ne1Var6, qs0Var114, z, ne1Var7, ne1Var), kk0Var, 54), (ck0) kk0Var, (i11110 & 126) | ((i3 >> 6) & 57344), ((i3 >> 24) & 14) | 48, 968);
                        rg3Var4 = rg3Var3;
                        gh2Var4 = gh2Var3;
                        cj2Var3 = qs0Var114;
                        cVar5 = cVar4;
                        ne1Var8 = ne1Var6;
                        ne1Var9 = ne1Var7;
                    } else {
                        kk0Var.X();
                        if ((i & 1) != 0) {
                            if (i4 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i6 != 0) {
                                ne1Var6 = null;
                            } else {
                                ne1Var6 = ne1Var4;
                            }
                            if (i8 != 0) {
                                ne1Var7 = null;
                            } else {
                                ne1Var7 = ne1Var5;
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                                value = wg3.getValue(tg3.m, kk0Var, 6);
                            } else {
                                value = rg3Var2;
                            }
                            i12 = i3;
                            if ((i2 & Uuid.SIZE_BITS) != 0) {
                                i13 = i10;
                                i14 = 2;
                                cj2 cj2VarM181xeb8e9a2e11118 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                                kk0Var = kk0Var;
                                cj2Var2 = cj2VarM181xeb8e9a2e11118;
                                i3 = i12 & (-29360129);
                            } else {
                                i13 = i10;
                                i14 = 2;
                                i3 = i12;
                            }
                            cVar4 = cVar3;
                            if (i13 != 0) {
                                gh2Var3 = null;
                            } else {
                                gh2Var3 = gh2Var;
                            }
                            rg3Var3 = value;
                        } else {
                            if (i4 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i6 != 0) {
                                ne1Var6 = null;
                            } else {
                                ne1Var6 = ne1Var4;
                            }
                            if (i8 != 0) {
                                ne1Var7 = null;
                            } else {
                                ne1Var7 = ne1Var5;
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                                value = wg3.getValue(tg3.m, kk0Var, 6);
                            } else {
                                value = rg3Var2;
                            }
                            i12 = i3;
                            if ((i2 & Uuid.SIZE_BITS) != 0) {
                                i13 = i10;
                                i14 = 2;
                                cj2 cj2VarM181xeb8e9a2e11119 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                                kk0Var = kk0Var;
                                cj2Var2 = cj2VarM181xeb8e9a2e11119;
                                i3 = i12 & (-29360129);
                            } else {
                                i13 = i10;
                                i14 = 2;
                                i3 = i12;
                            }
                            cVar4 = cVar3;
                            if (i13 != 0) {
                                gh2Var3 = null;
                            } else {
                                gh2Var3 = gh2Var;
                            }
                            rg3Var3 = value;
                        }
                        kk0Var.s();
                        int i11111 = i3 >> 3;
                        qs0 qs0Var115 = (qs0) cj2Var2;
                        hq3.m211x54dd086a(z, je1Var, d.f(we3.b(cVar4, false, fl1.I), 56.0f, 0.0f, i14).then(d.a), false, rg3Var3, ((re0) qs0Var115.containerColor(z, kk0Var, (i11111 & 14) | ((i3 >> 18) & 112)).getValue()).a, 0L, 0.0f, 0.0f, (iw) null, gh2Var3, (ne1) zg0.rememberComposableLambda(191488423, true, new rj2(ne1Var6, qs0Var115, z, ne1Var7, ne1Var), kk0Var, 54), (ck0) kk0Var, (i11111 & 126) | ((i3 >> 6) & 57344), ((i3 >> 24) & 14) | 48, 968);
                        rg3Var4 = rg3Var3;
                        gh2Var4 = gh2Var3;
                        cj2Var3 = qs0Var115;
                        cVar5 = cVar4;
                        ne1Var8 = ne1Var6;
                        ne1Var9 = ne1Var7;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new yb(ne1Var, z, je1Var, cVar5, ne1Var8, ne1Var9, rg3Var4, cj2Var3, gh2Var4, i, i2));
                    }
                }
                i3 |= 100663296;
                gh2Var2 = gh2Var;
                if ((i3 & 38347923) == 38347922) {
                    kk0Var.X();
                    if ((i & 1) != 0) {
                        if (i4 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i6 != 0) {
                            ne1Var6 = null;
                        } else {
                            ne1Var6 = ne1Var4;
                        }
                        if (i8 != 0) {
                            ne1Var7 = null;
                        } else {
                            ne1Var7 = ne1Var5;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            value = wg3.getValue(tg3.m, kk0Var, 6);
                        } else {
                            value = rg3Var2;
                        }
                        i12 = i3;
                        if ((i2 & Uuid.SIZE_BITS) != 0) {
                            i13 = i10;
                            i14 = 2;
                            cj2 cj2VarM181xeb8e9a2e111110 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                            kk0Var = kk0Var;
                            cj2Var2 = cj2VarM181xeb8e9a2e111110;
                            i3 = i12 & (-29360129);
                        } else {
                            i13 = i10;
                            i14 = 2;
                            i3 = i12;
                        }
                        cVar4 = cVar3;
                        if (i13 != 0) {
                            gh2Var3 = null;
                        } else {
                            gh2Var3 = gh2Var;
                        }
                        rg3Var3 = value;
                    } else {
                        if (i4 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i6 != 0) {
                            ne1Var6 = null;
                        } else {
                            ne1Var6 = ne1Var4;
                        }
                        if (i8 != 0) {
                            ne1Var7 = null;
                        } else {
                            ne1Var7 = ne1Var5;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            value = wg3.getValue(tg3.m, kk0Var, 6);
                        } else {
                            value = rg3Var2;
                        }
                        i12 = i3;
                        if ((i2 & Uuid.SIZE_BITS) != 0) {
                            i13 = i10;
                            i14 = 2;
                            cj2 cj2VarM181xeb8e9a2e111111 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                            kk0Var = kk0Var;
                            cj2Var2 = cj2VarM181xeb8e9a2e111111;
                            i3 = i12 & (-29360129);
                        } else {
                            i13 = i10;
                            i14 = 2;
                            i3 = i12;
                        }
                        cVar4 = cVar3;
                        if (i13 != 0) {
                            gh2Var3 = null;
                        } else {
                            gh2Var3 = gh2Var;
                        }
                        rg3Var3 = value;
                    }
                    kk0Var.s();
                    int i11112 = i3 >> 3;
                    qs0 qs0Var116 = (qs0) cj2Var2;
                    hq3.m211x54dd086a(z, je1Var, d.f(we3.b(cVar4, false, fl1.I), 56.0f, 0.0f, i14).then(d.a), false, rg3Var3, ((re0) qs0Var116.containerColor(z, kk0Var, (i11112 & 14) | ((i3 >> 18) & 112)).getValue()).a, 0L, 0.0f, 0.0f, (iw) null, gh2Var3, (ne1) zg0.rememberComposableLambda(191488423, true, new rj2(ne1Var6, qs0Var116, z, ne1Var7, ne1Var), kk0Var, 54), (ck0) kk0Var, (i11112 & 126) | ((i3 >> 6) & 57344), ((i3 >> 24) & 14) | 48, 968);
                    rg3Var4 = rg3Var3;
                    gh2Var4 = gh2Var3;
                    cj2Var3 = qs0Var116;
                    cVar5 = cVar4;
                    ne1Var8 = ne1Var6;
                    ne1Var9 = ne1Var7;
                } else {
                    kk0Var.X();
                    if ((i & 1) != 0) {
                        if (i4 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i6 != 0) {
                            ne1Var6 = null;
                        } else {
                            ne1Var6 = ne1Var4;
                        }
                        if (i8 != 0) {
                            ne1Var7 = null;
                        } else {
                            ne1Var7 = ne1Var5;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            value = wg3.getValue(tg3.m, kk0Var, 6);
                        } else {
                            value = rg3Var2;
                        }
                        i12 = i3;
                        if ((i2 & Uuid.SIZE_BITS) != 0) {
                            i13 = i10;
                            i14 = 2;
                            cj2 cj2VarM181xeb8e9a2e111112 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                            kk0Var = kk0Var;
                            cj2Var2 = cj2VarM181xeb8e9a2e111112;
                            i3 = i12 & (-29360129);
                        } else {
                            i13 = i10;
                            i14 = 2;
                            i3 = i12;
                        }
                        cVar4 = cVar3;
                        if (i13 != 0) {
                            gh2Var3 = null;
                        } else {
                            gh2Var3 = gh2Var;
                        }
                        rg3Var3 = value;
                    } else {
                        if (i4 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i6 != 0) {
                            ne1Var6 = null;
                        } else {
                            ne1Var6 = ne1Var4;
                        }
                        if (i8 != 0) {
                            ne1Var7 = null;
                        } else {
                            ne1Var7 = ne1Var5;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            value = wg3.getValue(tg3.m, kk0Var, 6);
                        } else {
                            value = rg3Var2;
                        }
                        i12 = i3;
                        if ((i2 & Uuid.SIZE_BITS) != 0) {
                            i13 = i10;
                            i14 = 2;
                            cj2 cj2VarM181xeb8e9a2e111113 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                            kk0Var = kk0Var;
                            cj2Var2 = cj2VarM181xeb8e9a2e111113;
                            i3 = i12 & (-29360129);
                        } else {
                            i13 = i10;
                            i14 = 2;
                            i3 = i12;
                        }
                        cVar4 = cVar3;
                        if (i13 != 0) {
                            gh2Var3 = null;
                        } else {
                            gh2Var3 = gh2Var;
                        }
                        rg3Var3 = value;
                    }
                    kk0Var.s();
                    int i11113 = i3 >> 3;
                    qs0 qs0Var117 = (qs0) cj2Var2;
                    hq3.m211x54dd086a(z, je1Var, d.f(we3.b(cVar4, false, fl1.I), 56.0f, 0.0f, i14).then(d.a), false, rg3Var3, ((re0) qs0Var117.containerColor(z, kk0Var, (i11113 & 14) | ((i3 >> 18) & 112)).getValue()).a, 0L, 0.0f, 0.0f, (iw) null, gh2Var3, (ne1) zg0.rememberComposableLambda(191488423, true, new rj2(ne1Var6, qs0Var117, z, ne1Var7, ne1Var), kk0Var, 54), (ck0) kk0Var, (i11113 & 126) | ((i3 >> 6) & 57344), ((i3 >> 24) & 14) | 48, 968);
                    rg3Var4 = rg3Var3;
                    gh2Var4 = gh2Var3;
                    cj2Var3 = qs0Var117;
                    cVar5 = cVar4;
                    ne1Var8 = ne1Var6;
                    ne1Var9 = ne1Var7;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new yb(ne1Var, z, je1Var, cVar5, ne1Var8, ne1Var9, rg3Var4, cj2Var3, gh2Var4, i, i2));
                }
            }
            i3 |= 196608;
            ne1Var5 = ne1Var3;
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    rg3Var2 = rg3Var;
                    if (kk0Var.h(rg3Var2)) {
                    }
                    i3 |= i15;
                } else {
                    rg3Var2 = rg3Var;
                }
                i3 |= i15;
            } else {
                rg3Var2 = rg3Var;
            }
            if ((12582912 & i) == 0) {
                if ((i2 & Uuid.SIZE_BITS) == 0) {
                    cj2Var2 = cj2Var;
                    if (kk0Var.h(cj2Var2)) {
                    }
                    i3 |= i16;
                } else {
                    cj2Var2 = cj2Var;
                }
                i3 |= i16;
            } else {
                cj2Var2 = cj2Var;
            }
            i10 = i2 & FontInfo.NUMBER_OF_CHAR_CODES;
            if (i10 != 0) {
                if ((i & 100663296) == 0) {
                    gh2Var2 = gh2Var;
                    if (kk0Var.h(gh2Var2)) {
                        i11 = 67108864;
                    } else {
                        i11 = 33554432;
                    }
                    i3 |= i11;
                }
                if ((i3 & 38347923) == 38347922) {
                    kk0Var.X();
                    if ((i & 1) != 0) {
                        if (i4 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i6 != 0) {
                            ne1Var6 = null;
                        } else {
                            ne1Var6 = ne1Var4;
                        }
                        if (i8 != 0) {
                            ne1Var7 = null;
                        } else {
                            ne1Var7 = ne1Var5;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            value = wg3.getValue(tg3.m, kk0Var, 6);
                        } else {
                            value = rg3Var2;
                        }
                        i12 = i3;
                        if ((i2 & Uuid.SIZE_BITS) != 0) {
                            i13 = i10;
                            i14 = 2;
                            cj2 cj2VarM181xeb8e9a2e111114 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                            kk0Var = kk0Var;
                            cj2Var2 = cj2VarM181xeb8e9a2e111114;
                            i3 = i12 & (-29360129);
                        } else {
                            i13 = i10;
                            i14 = 2;
                            i3 = i12;
                        }
                        cVar4 = cVar3;
                        if (i13 != 0) {
                            gh2Var3 = null;
                        } else {
                            gh2Var3 = gh2Var;
                        }
                        rg3Var3 = value;
                    } else {
                        if (i4 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i6 != 0) {
                            ne1Var6 = null;
                        } else {
                            ne1Var6 = ne1Var4;
                        }
                        if (i8 != 0) {
                            ne1Var7 = null;
                        } else {
                            ne1Var7 = ne1Var5;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            value = wg3.getValue(tg3.m, kk0Var, 6);
                        } else {
                            value = rg3Var2;
                        }
                        i12 = i3;
                        if ((i2 & Uuid.SIZE_BITS) != 0) {
                            i13 = i10;
                            i14 = 2;
                            cj2 cj2VarM181xeb8e9a2e111115 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                            kk0Var = kk0Var;
                            cj2Var2 = cj2VarM181xeb8e9a2e111115;
                            i3 = i12 & (-29360129);
                        } else {
                            i13 = i10;
                            i14 = 2;
                            i3 = i12;
                        }
                        cVar4 = cVar3;
                        if (i13 != 0) {
                            gh2Var3 = null;
                        } else {
                            gh2Var3 = gh2Var;
                        }
                        rg3Var3 = value;
                    }
                    kk0Var.s();
                    int i11114 = i3 >> 3;
                    qs0 qs0Var118 = (qs0) cj2Var2;
                    hq3.m211x54dd086a(z, je1Var, d.f(we3.b(cVar4, false, fl1.I), 56.0f, 0.0f, i14).then(d.a), false, rg3Var3, ((re0) qs0Var118.containerColor(z, kk0Var, (i11114 & 14) | ((i3 >> 18) & 112)).getValue()).a, 0L, 0.0f, 0.0f, (iw) null, gh2Var3, (ne1) zg0.rememberComposableLambda(191488423, true, new rj2(ne1Var6, qs0Var118, z, ne1Var7, ne1Var), kk0Var, 54), (ck0) kk0Var, (i11114 & 126) | ((i3 >> 6) & 57344), ((i3 >> 24) & 14) | 48, 968);
                    rg3Var4 = rg3Var3;
                    gh2Var4 = gh2Var3;
                    cj2Var3 = qs0Var118;
                    cVar5 = cVar4;
                    ne1Var8 = ne1Var6;
                    ne1Var9 = ne1Var7;
                } else {
                    kk0Var.X();
                    if ((i & 1) != 0) {
                        if (i4 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i6 != 0) {
                            ne1Var6 = null;
                        } else {
                            ne1Var6 = ne1Var4;
                        }
                        if (i8 != 0) {
                            ne1Var7 = null;
                        } else {
                            ne1Var7 = ne1Var5;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            value = wg3.getValue(tg3.m, kk0Var, 6);
                        } else {
                            value = rg3Var2;
                        }
                        i12 = i3;
                        if ((i2 & Uuid.SIZE_BITS) != 0) {
                            i13 = i10;
                            i14 = 2;
                            cj2 cj2VarM181xeb8e9a2e111116 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                            kk0Var = kk0Var;
                            cj2Var2 = cj2VarM181xeb8e9a2e111116;
                            i3 = i12 & (-29360129);
                        } else {
                            i13 = i10;
                            i14 = 2;
                            i3 = i12;
                        }
                        cVar4 = cVar3;
                        if (i13 != 0) {
                            gh2Var3 = null;
                        } else {
                            gh2Var3 = gh2Var;
                        }
                        rg3Var3 = value;
                    } else {
                        if (i4 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i6 != 0) {
                            ne1Var6 = null;
                        } else {
                            ne1Var6 = ne1Var4;
                        }
                        if (i8 != 0) {
                            ne1Var7 = null;
                        } else {
                            ne1Var7 = ne1Var5;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            value = wg3.getValue(tg3.m, kk0Var, 6);
                        } else {
                            value = rg3Var2;
                        }
                        i12 = i3;
                        if ((i2 & Uuid.SIZE_BITS) != 0) {
                            i13 = i10;
                            i14 = 2;
                            cj2 cj2VarM181xeb8e9a2e111117 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                            kk0Var = kk0Var;
                            cj2Var2 = cj2VarM181xeb8e9a2e111117;
                            i3 = i12 & (-29360129);
                        } else {
                            i13 = i10;
                            i14 = 2;
                            i3 = i12;
                        }
                        cVar4 = cVar3;
                        if (i13 != 0) {
                            gh2Var3 = null;
                        } else {
                            gh2Var3 = gh2Var;
                        }
                        rg3Var3 = value;
                    }
                    kk0Var.s();
                    int i11115 = i3 >> 3;
                    qs0 qs0Var119 = (qs0) cj2Var2;
                    hq3.m211x54dd086a(z, je1Var, d.f(we3.b(cVar4, false, fl1.I), 56.0f, 0.0f, i14).then(d.a), false, rg3Var3, ((re0) qs0Var119.containerColor(z, kk0Var, (i11115 & 14) | ((i3 >> 18) & 112)).getValue()).a, 0L, 0.0f, 0.0f, (iw) null, gh2Var3, (ne1) zg0.rememberComposableLambda(191488423, true, new rj2(ne1Var6, qs0Var119, z, ne1Var7, ne1Var), kk0Var, 54), (ck0) kk0Var, (i11115 & 126) | ((i3 >> 6) & 57344), ((i3 >> 24) & 14) | 48, 968);
                    rg3Var4 = rg3Var3;
                    gh2Var4 = gh2Var3;
                    cj2Var3 = qs0Var119;
                    cVar5 = cVar4;
                    ne1Var8 = ne1Var6;
                    ne1Var9 = ne1Var7;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new yb(ne1Var, z, je1Var, cVar5, ne1Var8, ne1Var9, rg3Var4, cj2Var3, gh2Var4, i, i2));
                }
            }
            i3 |= 100663296;
            gh2Var2 = gh2Var;
            if ((i3 & 38347923) == 38347922) {
                kk0Var.X();
                if ((i & 1) != 0) {
                    if (i4 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i6 != 0) {
                        ne1Var6 = null;
                    } else {
                        ne1Var6 = ne1Var4;
                    }
                    if (i8 != 0) {
                        ne1Var7 = null;
                    } else {
                        ne1Var7 = ne1Var5;
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        value = wg3.getValue(tg3.m, kk0Var, 6);
                    } else {
                        value = rg3Var2;
                    }
                    i12 = i3;
                    if ((i2 & Uuid.SIZE_BITS) != 0) {
                        i13 = i10;
                        i14 = 2;
                        cj2 cj2VarM181xeb8e9a2e111118 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                        kk0Var = kk0Var;
                        cj2Var2 = cj2VarM181xeb8e9a2e111118;
                        i3 = i12 & (-29360129);
                    } else {
                        i13 = i10;
                        i14 = 2;
                        i3 = i12;
                    }
                    cVar4 = cVar3;
                    if (i13 != 0) {
                        gh2Var3 = null;
                    } else {
                        gh2Var3 = gh2Var;
                    }
                    rg3Var3 = value;
                } else {
                    if (i4 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i6 != 0) {
                        ne1Var6 = null;
                    } else {
                        ne1Var6 = ne1Var4;
                    }
                    if (i8 != 0) {
                        ne1Var7 = null;
                    } else {
                        ne1Var7 = ne1Var5;
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        value = wg3.getValue(tg3.m, kk0Var, 6);
                    } else {
                        value = rg3Var2;
                    }
                    i12 = i3;
                    if ((i2 & Uuid.SIZE_BITS) != 0) {
                        i13 = i10;
                        i14 = 2;
                        cj2 cj2VarM181xeb8e9a2e111119 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                        kk0Var = kk0Var;
                        cj2Var2 = cj2VarM181xeb8e9a2e111119;
                        i3 = i12 & (-29360129);
                    } else {
                        i13 = i10;
                        i14 = 2;
                        i3 = i12;
                    }
                    cVar4 = cVar3;
                    if (i13 != 0) {
                        gh2Var3 = null;
                    } else {
                        gh2Var3 = gh2Var;
                    }
                    rg3Var3 = value;
                }
                kk0Var.s();
                int i11116 = i3 >> 3;
                qs0 qs0Var1110 = (qs0) cj2Var2;
                hq3.m211x54dd086a(z, je1Var, d.f(we3.b(cVar4, false, fl1.I), 56.0f, 0.0f, i14).then(d.a), false, rg3Var3, ((re0) qs0Var1110.containerColor(z, kk0Var, (i11116 & 14) | ((i3 >> 18) & 112)).getValue()).a, 0L, 0.0f, 0.0f, (iw) null, gh2Var3, (ne1) zg0.rememberComposableLambda(191488423, true, new rj2(ne1Var6, qs0Var1110, z, ne1Var7, ne1Var), kk0Var, 54), (ck0) kk0Var, (i11116 & 126) | ((i3 >> 6) & 57344), ((i3 >> 24) & 14) | 48, 968);
                rg3Var4 = rg3Var3;
                gh2Var4 = gh2Var3;
                cj2Var3 = qs0Var1110;
                cVar5 = cVar4;
                ne1Var8 = ne1Var6;
                ne1Var9 = ne1Var7;
            } else {
                kk0Var.X();
                if ((i & 1) != 0) {
                    if (i4 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i6 != 0) {
                        ne1Var6 = null;
                    } else {
                        ne1Var6 = ne1Var4;
                    }
                    if (i8 != 0) {
                        ne1Var7 = null;
                    } else {
                        ne1Var7 = ne1Var5;
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        value = wg3.getValue(tg3.m, kk0Var, 6);
                    } else {
                        value = rg3Var2;
                    }
                    i12 = i3;
                    if ((i2 & Uuid.SIZE_BITS) != 0) {
                        i13 = i10;
                        i14 = 2;
                        cj2 cj2VarM181xeb8e9a2e1111110 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                        kk0Var = kk0Var;
                        cj2Var2 = cj2VarM181xeb8e9a2e1111110;
                        i3 = i12 & (-29360129);
                    } else {
                        i13 = i10;
                        i14 = 2;
                        i3 = i12;
                    }
                    cVar4 = cVar3;
                    if (i13 != 0) {
                        gh2Var3 = null;
                    } else {
                        gh2Var3 = gh2Var;
                    }
                    rg3Var3 = value;
                } else {
                    if (i4 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i6 != 0) {
                        ne1Var6 = null;
                    } else {
                        ne1Var6 = ne1Var4;
                    }
                    if (i8 != 0) {
                        ne1Var7 = null;
                    } else {
                        ne1Var7 = ne1Var5;
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        value = wg3.getValue(tg3.m, kk0Var, 6);
                    } else {
                        value = rg3Var2;
                    }
                    i12 = i3;
                    if ((i2 & Uuid.SIZE_BITS) != 0) {
                        i13 = i10;
                        i14 = 2;
                        cj2 cj2VarM181xeb8e9a2e1111111 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                        kk0Var = kk0Var;
                        cj2Var2 = cj2VarM181xeb8e9a2e1111111;
                        i3 = i12 & (-29360129);
                    } else {
                        i13 = i10;
                        i14 = 2;
                        i3 = i12;
                    }
                    cVar4 = cVar3;
                    if (i13 != 0) {
                        gh2Var3 = null;
                    } else {
                        gh2Var3 = gh2Var;
                    }
                    rg3Var3 = value;
                }
                kk0Var.s();
                int i11117 = i3 >> 3;
                qs0 qs0Var1111 = (qs0) cj2Var2;
                hq3.m211x54dd086a(z, je1Var, d.f(we3.b(cVar4, false, fl1.I), 56.0f, 0.0f, i14).then(d.a), false, rg3Var3, ((re0) qs0Var1111.containerColor(z, kk0Var, (i11117 & 14) | ((i3 >> 18) & 112)).getValue()).a, 0L, 0.0f, 0.0f, (iw) null, gh2Var3, (ne1) zg0.rememberComposableLambda(191488423, true, new rj2(ne1Var6, qs0Var1111, z, ne1Var7, ne1Var), kk0Var, 54), (ck0) kk0Var, (i11117 & 126) | ((i3 >> 6) & 57344), ((i3 >> 24) & 14) | 48, 968);
                rg3Var4 = rg3Var3;
                gh2Var4 = gh2Var3;
                cj2Var3 = qs0Var1111;
                cVar5 = cVar4;
                ne1Var8 = ne1Var6;
                ne1Var9 = ne1Var7;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new yb(ne1Var, z, je1Var, cVar5, ne1Var8, ne1Var9, rg3Var4, cj2Var3, gh2Var4, i, i2));
            }
        }
        i3 |= 384;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                cVar2 = cVar;
                if (kk0Var.h(cVar2)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    ne1Var4 = ne1Var2;
                    if (kk0Var.j(ne1Var4)) {
                        i7 = 16384;
                    } else {
                        i7 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 32;
                if (i8 != 0) {
                    if ((196608 & i) == 0) {
                        ne1Var5 = ne1Var3;
                        if (kk0Var.j(ne1Var5)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    }
                    if ((1572864 & i) == 0) {
                        if ((i2 & 64) == 0) {
                            rg3Var2 = rg3Var;
                            if (kk0Var.h(rg3Var2)) {
                            }
                            i3 |= i15;
                        } else {
                            rg3Var2 = rg3Var;
                        }
                        i3 |= i15;
                    } else {
                        rg3Var2 = rg3Var;
                    }
                    if ((12582912 & i) == 0) {
                        if ((i2 & Uuid.SIZE_BITS) == 0) {
                            cj2Var2 = cj2Var;
                            if (kk0Var.h(cj2Var2)) {
                            }
                            i3 |= i16;
                        } else {
                            cj2Var2 = cj2Var;
                        }
                        i3 |= i16;
                    } else {
                        cj2Var2 = cj2Var;
                    }
                    i10 = i2 & FontInfo.NUMBER_OF_CHAR_CODES;
                    if (i10 != 0) {
                        if ((i & 100663296) == 0) {
                            gh2Var2 = gh2Var;
                            if (kk0Var.h(gh2Var2)) {
                                i11 = 67108864;
                            } else {
                                i11 = 33554432;
                            }
                            i3 |= i11;
                        }
                        if ((i3 & 38347923) == 38347922) {
                            kk0Var.X();
                            if ((i & 1) != 0) {
                                if (i4 != 0) {
                                    cVar3 = c.i;
                                } else {
                                    cVar3 = cVar2;
                                }
                                if (i6 != 0) {
                                    ne1Var6 = null;
                                } else {
                                    ne1Var6 = ne1Var4;
                                }
                                if (i8 != 0) {
                                    ne1Var7 = null;
                                } else {
                                    ne1Var7 = ne1Var5;
                                }
                                if ((i2 & 64) != 0) {
                                    i3 &= -3670017;
                                    value = wg3.getValue(tg3.m, kk0Var, 6);
                                } else {
                                    value = rg3Var2;
                                }
                                i12 = i3;
                                if ((i2 & Uuid.SIZE_BITS) != 0) {
                                    i13 = i10;
                                    i14 = 2;
                                    cj2 cj2VarM181xeb8e9a2e1111112 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                                    kk0Var = kk0Var;
                                    cj2Var2 = cj2VarM181xeb8e9a2e1111112;
                                    i3 = i12 & (-29360129);
                                } else {
                                    i13 = i10;
                                    i14 = 2;
                                    i3 = i12;
                                }
                                cVar4 = cVar3;
                                if (i13 != 0) {
                                    gh2Var3 = null;
                                } else {
                                    gh2Var3 = gh2Var;
                                }
                                rg3Var3 = value;
                            } else {
                                if (i4 != 0) {
                                    cVar3 = c.i;
                                } else {
                                    cVar3 = cVar2;
                                }
                                if (i6 != 0) {
                                    ne1Var6 = null;
                                } else {
                                    ne1Var6 = ne1Var4;
                                }
                                if (i8 != 0) {
                                    ne1Var7 = null;
                                } else {
                                    ne1Var7 = ne1Var5;
                                }
                                if ((i2 & 64) != 0) {
                                    i3 &= -3670017;
                                    value = wg3.getValue(tg3.m, kk0Var, 6);
                                } else {
                                    value = rg3Var2;
                                }
                                i12 = i3;
                                if ((i2 & Uuid.SIZE_BITS) != 0) {
                                    i13 = i10;
                                    i14 = 2;
                                    cj2 cj2VarM181xeb8e9a2e1111113 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                                    kk0Var = kk0Var;
                                    cj2Var2 = cj2VarM181xeb8e9a2e1111113;
                                    i3 = i12 & (-29360129);
                                } else {
                                    i13 = i10;
                                    i14 = 2;
                                    i3 = i12;
                                }
                                cVar4 = cVar3;
                                if (i13 != 0) {
                                    gh2Var3 = null;
                                } else {
                                    gh2Var3 = gh2Var;
                                }
                                rg3Var3 = value;
                            }
                            kk0Var.s();
                            int i11118 = i3 >> 3;
                            qs0 qs0Var1112 = (qs0) cj2Var2;
                            hq3.m211x54dd086a(z, je1Var, d.f(we3.b(cVar4, false, fl1.I), 56.0f, 0.0f, i14).then(d.a), false, rg3Var3, ((re0) qs0Var1112.containerColor(z, kk0Var, (i11118 & 14) | ((i3 >> 18) & 112)).getValue()).a, 0L, 0.0f, 0.0f, (iw) null, gh2Var3, (ne1) zg0.rememberComposableLambda(191488423, true, new rj2(ne1Var6, qs0Var1112, z, ne1Var7, ne1Var), kk0Var, 54), (ck0) kk0Var, (i11118 & 126) | ((i3 >> 6) & 57344), ((i3 >> 24) & 14) | 48, 968);
                            rg3Var4 = rg3Var3;
                            gh2Var4 = gh2Var3;
                            cj2Var3 = qs0Var1112;
                            cVar5 = cVar4;
                            ne1Var8 = ne1Var6;
                            ne1Var9 = ne1Var7;
                        } else {
                            kk0Var.X();
                            if ((i & 1) != 0) {
                                if (i4 != 0) {
                                    cVar3 = c.i;
                                } else {
                                    cVar3 = cVar2;
                                }
                                if (i6 != 0) {
                                    ne1Var6 = null;
                                } else {
                                    ne1Var6 = ne1Var4;
                                }
                                if (i8 != 0) {
                                    ne1Var7 = null;
                                } else {
                                    ne1Var7 = ne1Var5;
                                }
                                if ((i2 & 64) != 0) {
                                    i3 &= -3670017;
                                    value = wg3.getValue(tg3.m, kk0Var, 6);
                                } else {
                                    value = rg3Var2;
                                }
                                i12 = i3;
                                if ((i2 & Uuid.SIZE_BITS) != 0) {
                                    i13 = i10;
                                    i14 = 2;
                                    cj2 cj2VarM181xeb8e9a2e1111114 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                                    kk0Var = kk0Var;
                                    cj2Var2 = cj2VarM181xeb8e9a2e1111114;
                                    i3 = i12 & (-29360129);
                                } else {
                                    i13 = i10;
                                    i14 = 2;
                                    i3 = i12;
                                }
                                cVar4 = cVar3;
                                if (i13 != 0) {
                                    gh2Var3 = null;
                                } else {
                                    gh2Var3 = gh2Var;
                                }
                                rg3Var3 = value;
                            } else {
                                if (i4 != 0) {
                                    cVar3 = c.i;
                                } else {
                                    cVar3 = cVar2;
                                }
                                if (i6 != 0) {
                                    ne1Var6 = null;
                                } else {
                                    ne1Var6 = ne1Var4;
                                }
                                if (i8 != 0) {
                                    ne1Var7 = null;
                                } else {
                                    ne1Var7 = ne1Var5;
                                }
                                if ((i2 & 64) != 0) {
                                    i3 &= -3670017;
                                    value = wg3.getValue(tg3.m, kk0Var, 6);
                                } else {
                                    value = rg3Var2;
                                }
                                i12 = i3;
                                if ((i2 & Uuid.SIZE_BITS) != 0) {
                                    i13 = i10;
                                    i14 = 2;
                                    cj2 cj2VarM181xeb8e9a2e1111115 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                                    kk0Var = kk0Var;
                                    cj2Var2 = cj2VarM181xeb8e9a2e1111115;
                                    i3 = i12 & (-29360129);
                                } else {
                                    i13 = i10;
                                    i14 = 2;
                                    i3 = i12;
                                }
                                cVar4 = cVar3;
                                if (i13 != 0) {
                                    gh2Var3 = null;
                                } else {
                                    gh2Var3 = gh2Var;
                                }
                                rg3Var3 = value;
                            }
                            kk0Var.s();
                            int i11119 = i3 >> 3;
                            qs0 qs0Var1113 = (qs0) cj2Var2;
                            hq3.m211x54dd086a(z, je1Var, d.f(we3.b(cVar4, false, fl1.I), 56.0f, 0.0f, i14).then(d.a), false, rg3Var3, ((re0) qs0Var1113.containerColor(z, kk0Var, (i11119 & 14) | ((i3 >> 18) & 112)).getValue()).a, 0L, 0.0f, 0.0f, (iw) null, gh2Var3, (ne1) zg0.rememberComposableLambda(191488423, true, new rj2(ne1Var6, qs0Var1113, z, ne1Var7, ne1Var), kk0Var, 54), (ck0) kk0Var, (i11119 & 126) | ((i3 >> 6) & 57344), ((i3 >> 24) & 14) | 48, 968);
                            rg3Var4 = rg3Var3;
                            gh2Var4 = gh2Var3;
                            cj2Var3 = qs0Var1113;
                            cVar5 = cVar4;
                            ne1Var8 = ne1Var6;
                            ne1Var9 = ne1Var7;
                        }
                        w33VarV = kk0Var.v();
                        if (w33VarV != null) {
                            w33VarV.updateScope(new yb(ne1Var, z, je1Var, cVar5, ne1Var8, ne1Var9, rg3Var4, cj2Var3, gh2Var4, i, i2));
                        }
                    }
                    i3 |= 100663296;
                    gh2Var2 = gh2Var;
                    if ((i3 & 38347923) == 38347922) {
                        kk0Var.X();
                        if ((i & 1) != 0) {
                            if (i4 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i6 != 0) {
                                ne1Var6 = null;
                            } else {
                                ne1Var6 = ne1Var4;
                            }
                            if (i8 != 0) {
                                ne1Var7 = null;
                            } else {
                                ne1Var7 = ne1Var5;
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                                value = wg3.getValue(tg3.m, kk0Var, 6);
                            } else {
                                value = rg3Var2;
                            }
                            i12 = i3;
                            if ((i2 & Uuid.SIZE_BITS) != 0) {
                                i13 = i10;
                                i14 = 2;
                                cj2 cj2VarM181xeb8e9a2e1111116 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                                kk0Var = kk0Var;
                                cj2Var2 = cj2VarM181xeb8e9a2e1111116;
                                i3 = i12 & (-29360129);
                            } else {
                                i13 = i10;
                                i14 = 2;
                                i3 = i12;
                            }
                            cVar4 = cVar3;
                            if (i13 != 0) {
                                gh2Var3 = null;
                            } else {
                                gh2Var3 = gh2Var;
                            }
                            rg3Var3 = value;
                        } else {
                            if (i4 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i6 != 0) {
                                ne1Var6 = null;
                            } else {
                                ne1Var6 = ne1Var4;
                            }
                            if (i8 != 0) {
                                ne1Var7 = null;
                            } else {
                                ne1Var7 = ne1Var5;
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                                value = wg3.getValue(tg3.m, kk0Var, 6);
                            } else {
                                value = rg3Var2;
                            }
                            i12 = i3;
                            if ((i2 & Uuid.SIZE_BITS) != 0) {
                                i13 = i10;
                                i14 = 2;
                                cj2 cj2VarM181xeb8e9a2e1111117 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                                kk0Var = kk0Var;
                                cj2Var2 = cj2VarM181xeb8e9a2e1111117;
                                i3 = i12 & (-29360129);
                            } else {
                                i13 = i10;
                                i14 = 2;
                                i3 = i12;
                            }
                            cVar4 = cVar3;
                            if (i13 != 0) {
                                gh2Var3 = null;
                            } else {
                                gh2Var3 = gh2Var;
                            }
                            rg3Var3 = value;
                        }
                        kk0Var.s();
                        int i111110 = i3 >> 3;
                        qs0 qs0Var1114 = (qs0) cj2Var2;
                        hq3.m211x54dd086a(z, je1Var, d.f(we3.b(cVar4, false, fl1.I), 56.0f, 0.0f, i14).then(d.a), false, rg3Var3, ((re0) qs0Var1114.containerColor(z, kk0Var, (i111110 & 14) | ((i3 >> 18) & 112)).getValue()).a, 0L, 0.0f, 0.0f, (iw) null, gh2Var3, (ne1) zg0.rememberComposableLambda(191488423, true, new rj2(ne1Var6, qs0Var1114, z, ne1Var7, ne1Var), kk0Var, 54), (ck0) kk0Var, (i111110 & 126) | ((i3 >> 6) & 57344), ((i3 >> 24) & 14) | 48, 968);
                        rg3Var4 = rg3Var3;
                        gh2Var4 = gh2Var3;
                        cj2Var3 = qs0Var1114;
                        cVar5 = cVar4;
                        ne1Var8 = ne1Var6;
                        ne1Var9 = ne1Var7;
                    } else {
                        kk0Var.X();
                        if ((i & 1) != 0) {
                            if (i4 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i6 != 0) {
                                ne1Var6 = null;
                            } else {
                                ne1Var6 = ne1Var4;
                            }
                            if (i8 != 0) {
                                ne1Var7 = null;
                            } else {
                                ne1Var7 = ne1Var5;
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                                value = wg3.getValue(tg3.m, kk0Var, 6);
                            } else {
                                value = rg3Var2;
                            }
                            i12 = i3;
                            if ((i2 & Uuid.SIZE_BITS) != 0) {
                                i13 = i10;
                                i14 = 2;
                                cj2 cj2VarM181xeb8e9a2e1111118 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                                kk0Var = kk0Var;
                                cj2Var2 = cj2VarM181xeb8e9a2e1111118;
                                i3 = i12 & (-29360129);
                            } else {
                                i13 = i10;
                                i14 = 2;
                                i3 = i12;
                            }
                            cVar4 = cVar3;
                            if (i13 != 0) {
                                gh2Var3 = null;
                            } else {
                                gh2Var3 = gh2Var;
                            }
                            rg3Var3 = value;
                        } else {
                            if (i4 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i6 != 0) {
                                ne1Var6 = null;
                            } else {
                                ne1Var6 = ne1Var4;
                            }
                            if (i8 != 0) {
                                ne1Var7 = null;
                            } else {
                                ne1Var7 = ne1Var5;
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                                value = wg3.getValue(tg3.m, kk0Var, 6);
                            } else {
                                value = rg3Var2;
                            }
                            i12 = i3;
                            if ((i2 & Uuid.SIZE_BITS) != 0) {
                                i13 = i10;
                                i14 = 2;
                                cj2 cj2VarM181xeb8e9a2e1111119 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                                kk0Var = kk0Var;
                                cj2Var2 = cj2VarM181xeb8e9a2e1111119;
                                i3 = i12 & (-29360129);
                            } else {
                                i13 = i10;
                                i14 = 2;
                                i3 = i12;
                            }
                            cVar4 = cVar3;
                            if (i13 != 0) {
                                gh2Var3 = null;
                            } else {
                                gh2Var3 = gh2Var;
                            }
                            rg3Var3 = value;
                        }
                        kk0Var.s();
                        int i111111 = i3 >> 3;
                        qs0 qs0Var1115 = (qs0) cj2Var2;
                        hq3.m211x54dd086a(z, je1Var, d.f(we3.b(cVar4, false, fl1.I), 56.0f, 0.0f, i14).then(d.a), false, rg3Var3, ((re0) qs0Var1115.containerColor(z, kk0Var, (i111111 & 14) | ((i3 >> 18) & 112)).getValue()).a, 0L, 0.0f, 0.0f, (iw) null, gh2Var3, (ne1) zg0.rememberComposableLambda(191488423, true, new rj2(ne1Var6, qs0Var1115, z, ne1Var7, ne1Var), kk0Var, 54), (ck0) kk0Var, (i111111 & 126) | ((i3 >> 6) & 57344), ((i3 >> 24) & 14) | 48, 968);
                        rg3Var4 = rg3Var3;
                        gh2Var4 = gh2Var3;
                        cj2Var3 = qs0Var1115;
                        cVar5 = cVar4;
                        ne1Var8 = ne1Var6;
                        ne1Var9 = ne1Var7;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new yb(ne1Var, z, je1Var, cVar5, ne1Var8, ne1Var9, rg3Var4, cj2Var3, gh2Var4, i, i2));
                    }
                }
                i3 |= 196608;
                ne1Var5 = ne1Var3;
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        rg3Var2 = rg3Var;
                        if (kk0Var.h(rg3Var2)) {
                        }
                        i3 |= i15;
                    } else {
                        rg3Var2 = rg3Var;
                    }
                    i3 |= i15;
                } else {
                    rg3Var2 = rg3Var;
                }
                if ((12582912 & i) == 0) {
                    if ((i2 & Uuid.SIZE_BITS) == 0) {
                        cj2Var2 = cj2Var;
                        if (kk0Var.h(cj2Var2)) {
                        }
                        i3 |= i16;
                    } else {
                        cj2Var2 = cj2Var;
                    }
                    i3 |= i16;
                } else {
                    cj2Var2 = cj2Var;
                }
                i10 = i2 & FontInfo.NUMBER_OF_CHAR_CODES;
                if (i10 != 0) {
                    if ((i & 100663296) == 0) {
                        gh2Var2 = gh2Var;
                        if (kk0Var.h(gh2Var2)) {
                            i11 = 67108864;
                        } else {
                            i11 = 33554432;
                        }
                        i3 |= i11;
                    }
                    if ((i3 & 38347923) == 38347922) {
                        kk0Var.X();
                        if ((i & 1) != 0) {
                            if (i4 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i6 != 0) {
                                ne1Var6 = null;
                            } else {
                                ne1Var6 = ne1Var4;
                            }
                            if (i8 != 0) {
                                ne1Var7 = null;
                            } else {
                                ne1Var7 = ne1Var5;
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                                value = wg3.getValue(tg3.m, kk0Var, 6);
                            } else {
                                value = rg3Var2;
                            }
                            i12 = i3;
                            if ((i2 & Uuid.SIZE_BITS) != 0) {
                                i13 = i10;
                                i14 = 2;
                                cj2 cj2VarM181xeb8e9a2e11111110 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                                kk0Var = kk0Var;
                                cj2Var2 = cj2VarM181xeb8e9a2e11111110;
                                i3 = i12 & (-29360129);
                            } else {
                                i13 = i10;
                                i14 = 2;
                                i3 = i12;
                            }
                            cVar4 = cVar3;
                            if (i13 != 0) {
                                gh2Var3 = null;
                            } else {
                                gh2Var3 = gh2Var;
                            }
                            rg3Var3 = value;
                        } else {
                            if (i4 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i6 != 0) {
                                ne1Var6 = null;
                            } else {
                                ne1Var6 = ne1Var4;
                            }
                            if (i8 != 0) {
                                ne1Var7 = null;
                            } else {
                                ne1Var7 = ne1Var5;
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                                value = wg3.getValue(tg3.m, kk0Var, 6);
                            } else {
                                value = rg3Var2;
                            }
                            i12 = i3;
                            if ((i2 & Uuid.SIZE_BITS) != 0) {
                                i13 = i10;
                                i14 = 2;
                                cj2 cj2VarM181xeb8e9a2e11111111 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                                kk0Var = kk0Var;
                                cj2Var2 = cj2VarM181xeb8e9a2e11111111;
                                i3 = i12 & (-29360129);
                            } else {
                                i13 = i10;
                                i14 = 2;
                                i3 = i12;
                            }
                            cVar4 = cVar3;
                            if (i13 != 0) {
                                gh2Var3 = null;
                            } else {
                                gh2Var3 = gh2Var;
                            }
                            rg3Var3 = value;
                        }
                        kk0Var.s();
                        int i111112 = i3 >> 3;
                        qs0 qs0Var1116 = (qs0) cj2Var2;
                        hq3.m211x54dd086a(z, je1Var, d.f(we3.b(cVar4, false, fl1.I), 56.0f, 0.0f, i14).then(d.a), false, rg3Var3, ((re0) qs0Var1116.containerColor(z, kk0Var, (i111112 & 14) | ((i3 >> 18) & 112)).getValue()).a, 0L, 0.0f, 0.0f, (iw) null, gh2Var3, (ne1) zg0.rememberComposableLambda(191488423, true, new rj2(ne1Var6, qs0Var1116, z, ne1Var7, ne1Var), kk0Var, 54), (ck0) kk0Var, (i111112 & 126) | ((i3 >> 6) & 57344), ((i3 >> 24) & 14) | 48, 968);
                        rg3Var4 = rg3Var3;
                        gh2Var4 = gh2Var3;
                        cj2Var3 = qs0Var1116;
                        cVar5 = cVar4;
                        ne1Var8 = ne1Var6;
                        ne1Var9 = ne1Var7;
                    } else {
                        kk0Var.X();
                        if ((i & 1) != 0) {
                            if (i4 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i6 != 0) {
                                ne1Var6 = null;
                            } else {
                                ne1Var6 = ne1Var4;
                            }
                            if (i8 != 0) {
                                ne1Var7 = null;
                            } else {
                                ne1Var7 = ne1Var5;
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                                value = wg3.getValue(tg3.m, kk0Var, 6);
                            } else {
                                value = rg3Var2;
                            }
                            i12 = i3;
                            if ((i2 & Uuid.SIZE_BITS) != 0) {
                                i13 = i10;
                                i14 = 2;
                                cj2 cj2VarM181xeb8e9a2e11111112 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                                kk0Var = kk0Var;
                                cj2Var2 = cj2VarM181xeb8e9a2e11111112;
                                i3 = i12 & (-29360129);
                            } else {
                                i13 = i10;
                                i14 = 2;
                                i3 = i12;
                            }
                            cVar4 = cVar3;
                            if (i13 != 0) {
                                gh2Var3 = null;
                            } else {
                                gh2Var3 = gh2Var;
                            }
                            rg3Var3 = value;
                        } else {
                            if (i4 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i6 != 0) {
                                ne1Var6 = null;
                            } else {
                                ne1Var6 = ne1Var4;
                            }
                            if (i8 != 0) {
                                ne1Var7 = null;
                            } else {
                                ne1Var7 = ne1Var5;
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                                value = wg3.getValue(tg3.m, kk0Var, 6);
                            } else {
                                value = rg3Var2;
                            }
                            i12 = i3;
                            if ((i2 & Uuid.SIZE_BITS) != 0) {
                                i13 = i10;
                                i14 = 2;
                                cj2 cj2VarM181xeb8e9a2e11111113 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                                kk0Var = kk0Var;
                                cj2Var2 = cj2VarM181xeb8e9a2e11111113;
                                i3 = i12 & (-29360129);
                            } else {
                                i13 = i10;
                                i14 = 2;
                                i3 = i12;
                            }
                            cVar4 = cVar3;
                            if (i13 != 0) {
                                gh2Var3 = null;
                            } else {
                                gh2Var3 = gh2Var;
                            }
                            rg3Var3 = value;
                        }
                        kk0Var.s();
                        int i111113 = i3 >> 3;
                        qs0 qs0Var1117 = (qs0) cj2Var2;
                        hq3.m211x54dd086a(z, je1Var, d.f(we3.b(cVar4, false, fl1.I), 56.0f, 0.0f, i14).then(d.a), false, rg3Var3, ((re0) qs0Var1117.containerColor(z, kk0Var, (i111113 & 14) | ((i3 >> 18) & 112)).getValue()).a, 0L, 0.0f, 0.0f, (iw) null, gh2Var3, (ne1) zg0.rememberComposableLambda(191488423, true, new rj2(ne1Var6, qs0Var1117, z, ne1Var7, ne1Var), kk0Var, 54), (ck0) kk0Var, (i111113 & 126) | ((i3 >> 6) & 57344), ((i3 >> 24) & 14) | 48, 968);
                        rg3Var4 = rg3Var3;
                        gh2Var4 = gh2Var3;
                        cj2Var3 = qs0Var1117;
                        cVar5 = cVar4;
                        ne1Var8 = ne1Var6;
                        ne1Var9 = ne1Var7;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new yb(ne1Var, z, je1Var, cVar5, ne1Var8, ne1Var9, rg3Var4, cj2Var3, gh2Var4, i, i2));
                    }
                }
                i3 |= 100663296;
                gh2Var2 = gh2Var;
                if ((i3 & 38347923) == 38347922) {
                    kk0Var.X();
                    if ((i & 1) != 0) {
                        if (i4 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i6 != 0) {
                            ne1Var6 = null;
                        } else {
                            ne1Var6 = ne1Var4;
                        }
                        if (i8 != 0) {
                            ne1Var7 = null;
                        } else {
                            ne1Var7 = ne1Var5;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            value = wg3.getValue(tg3.m, kk0Var, 6);
                        } else {
                            value = rg3Var2;
                        }
                        i12 = i3;
                        if ((i2 & Uuid.SIZE_BITS) != 0) {
                            i13 = i10;
                            i14 = 2;
                            cj2 cj2VarM181xeb8e9a2e11111114 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                            kk0Var = kk0Var;
                            cj2Var2 = cj2VarM181xeb8e9a2e11111114;
                            i3 = i12 & (-29360129);
                        } else {
                            i13 = i10;
                            i14 = 2;
                            i3 = i12;
                        }
                        cVar4 = cVar3;
                        if (i13 != 0) {
                            gh2Var3 = null;
                        } else {
                            gh2Var3 = gh2Var;
                        }
                        rg3Var3 = value;
                    } else {
                        if (i4 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i6 != 0) {
                            ne1Var6 = null;
                        } else {
                            ne1Var6 = ne1Var4;
                        }
                        if (i8 != 0) {
                            ne1Var7 = null;
                        } else {
                            ne1Var7 = ne1Var5;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            value = wg3.getValue(tg3.m, kk0Var, 6);
                        } else {
                            value = rg3Var2;
                        }
                        i12 = i3;
                        if ((i2 & Uuid.SIZE_BITS) != 0) {
                            i13 = i10;
                            i14 = 2;
                            cj2 cj2VarM181xeb8e9a2e11111115 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                            kk0Var = kk0Var;
                            cj2Var2 = cj2VarM181xeb8e9a2e11111115;
                            i3 = i12 & (-29360129);
                        } else {
                            i13 = i10;
                            i14 = 2;
                            i3 = i12;
                        }
                        cVar4 = cVar3;
                        if (i13 != 0) {
                            gh2Var3 = null;
                        } else {
                            gh2Var3 = gh2Var;
                        }
                        rg3Var3 = value;
                    }
                    kk0Var.s();
                    int i111114 = i3 >> 3;
                    qs0 qs0Var1118 = (qs0) cj2Var2;
                    hq3.m211x54dd086a(z, je1Var, d.f(we3.b(cVar4, false, fl1.I), 56.0f, 0.0f, i14).then(d.a), false, rg3Var3, ((re0) qs0Var1118.containerColor(z, kk0Var, (i111114 & 14) | ((i3 >> 18) & 112)).getValue()).a, 0L, 0.0f, 0.0f, (iw) null, gh2Var3, (ne1) zg0.rememberComposableLambda(191488423, true, new rj2(ne1Var6, qs0Var1118, z, ne1Var7, ne1Var), kk0Var, 54), (ck0) kk0Var, (i111114 & 126) | ((i3 >> 6) & 57344), ((i3 >> 24) & 14) | 48, 968);
                    rg3Var4 = rg3Var3;
                    gh2Var4 = gh2Var3;
                    cj2Var3 = qs0Var1118;
                    cVar5 = cVar4;
                    ne1Var8 = ne1Var6;
                    ne1Var9 = ne1Var7;
                } else {
                    kk0Var.X();
                    if ((i & 1) != 0) {
                        if (i4 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i6 != 0) {
                            ne1Var6 = null;
                        } else {
                            ne1Var6 = ne1Var4;
                        }
                        if (i8 != 0) {
                            ne1Var7 = null;
                        } else {
                            ne1Var7 = ne1Var5;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            value = wg3.getValue(tg3.m, kk0Var, 6);
                        } else {
                            value = rg3Var2;
                        }
                        i12 = i3;
                        if ((i2 & Uuid.SIZE_BITS) != 0) {
                            i13 = i10;
                            i14 = 2;
                            cj2 cj2VarM181xeb8e9a2e11111116 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                            kk0Var = kk0Var;
                            cj2Var2 = cj2VarM181xeb8e9a2e11111116;
                            i3 = i12 & (-29360129);
                        } else {
                            i13 = i10;
                            i14 = 2;
                            i3 = i12;
                        }
                        cVar4 = cVar3;
                        if (i13 != 0) {
                            gh2Var3 = null;
                        } else {
                            gh2Var3 = gh2Var;
                        }
                        rg3Var3 = value;
                    } else {
                        if (i4 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i6 != 0) {
                            ne1Var6 = null;
                        } else {
                            ne1Var6 = ne1Var4;
                        }
                        if (i8 != 0) {
                            ne1Var7 = null;
                        } else {
                            ne1Var7 = ne1Var5;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            value = wg3.getValue(tg3.m, kk0Var, 6);
                        } else {
                            value = rg3Var2;
                        }
                        i12 = i3;
                        if ((i2 & Uuid.SIZE_BITS) != 0) {
                            i13 = i10;
                            i14 = 2;
                            cj2 cj2VarM181xeb8e9a2e11111117 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                            kk0Var = kk0Var;
                            cj2Var2 = cj2VarM181xeb8e9a2e11111117;
                            i3 = i12 & (-29360129);
                        } else {
                            i13 = i10;
                            i14 = 2;
                            i3 = i12;
                        }
                        cVar4 = cVar3;
                        if (i13 != 0) {
                            gh2Var3 = null;
                        } else {
                            gh2Var3 = gh2Var;
                        }
                        rg3Var3 = value;
                    }
                    kk0Var.s();
                    int i111115 = i3 >> 3;
                    qs0 qs0Var1119 = (qs0) cj2Var2;
                    hq3.m211x54dd086a(z, je1Var, d.f(we3.b(cVar4, false, fl1.I), 56.0f, 0.0f, i14).then(d.a), false, rg3Var3, ((re0) qs0Var1119.containerColor(z, kk0Var, (i111115 & 14) | ((i3 >> 18) & 112)).getValue()).a, 0L, 0.0f, 0.0f, (iw) null, gh2Var3, (ne1) zg0.rememberComposableLambda(191488423, true, new rj2(ne1Var6, qs0Var1119, z, ne1Var7, ne1Var), kk0Var, 54), (ck0) kk0Var, (i111115 & 126) | ((i3 >> 6) & 57344), ((i3 >> 24) & 14) | 48, 968);
                    rg3Var4 = rg3Var3;
                    gh2Var4 = gh2Var3;
                    cj2Var3 = qs0Var1119;
                    cVar5 = cVar4;
                    ne1Var8 = ne1Var6;
                    ne1Var9 = ne1Var7;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new yb(ne1Var, z, je1Var, cVar5, ne1Var8, ne1Var9, rg3Var4, cj2Var3, gh2Var4, i, i2));
                }
            }
            i3 |= 24576;
            ne1Var4 = ne1Var2;
            i8 = i2 & 32;
            if (i8 != 0) {
                if ((196608 & i) == 0) {
                    ne1Var5 = ne1Var3;
                    if (kk0Var.j(ne1Var5)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        rg3Var2 = rg3Var;
                        if (kk0Var.h(rg3Var2)) {
                        }
                        i3 |= i15;
                    } else {
                        rg3Var2 = rg3Var;
                    }
                    i3 |= i15;
                } else {
                    rg3Var2 = rg3Var;
                }
                if ((12582912 & i) == 0) {
                    if ((i2 & Uuid.SIZE_BITS) == 0) {
                        cj2Var2 = cj2Var;
                        if (kk0Var.h(cj2Var2)) {
                        }
                        i3 |= i16;
                    } else {
                        cj2Var2 = cj2Var;
                    }
                    i3 |= i16;
                } else {
                    cj2Var2 = cj2Var;
                }
                i10 = i2 & FontInfo.NUMBER_OF_CHAR_CODES;
                if (i10 != 0) {
                    if ((i & 100663296) == 0) {
                        gh2Var2 = gh2Var;
                        if (kk0Var.h(gh2Var2)) {
                            i11 = 67108864;
                        } else {
                            i11 = 33554432;
                        }
                        i3 |= i11;
                    }
                    if ((i3 & 38347923) == 38347922) {
                        kk0Var.X();
                        if ((i & 1) != 0) {
                            if (i4 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i6 != 0) {
                                ne1Var6 = null;
                            } else {
                                ne1Var6 = ne1Var4;
                            }
                            if (i8 != 0) {
                                ne1Var7 = null;
                            } else {
                                ne1Var7 = ne1Var5;
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                                value = wg3.getValue(tg3.m, kk0Var, 6);
                            } else {
                                value = rg3Var2;
                            }
                            i12 = i3;
                            if ((i2 & Uuid.SIZE_BITS) != 0) {
                                i13 = i10;
                                i14 = 2;
                                cj2 cj2VarM181xeb8e9a2e11111118 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                                kk0Var = kk0Var;
                                cj2Var2 = cj2VarM181xeb8e9a2e11111118;
                                i3 = i12 & (-29360129);
                            } else {
                                i13 = i10;
                                i14 = 2;
                                i3 = i12;
                            }
                            cVar4 = cVar3;
                            if (i13 != 0) {
                                gh2Var3 = null;
                            } else {
                                gh2Var3 = gh2Var;
                            }
                            rg3Var3 = value;
                        } else {
                            if (i4 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i6 != 0) {
                                ne1Var6 = null;
                            } else {
                                ne1Var6 = ne1Var4;
                            }
                            if (i8 != 0) {
                                ne1Var7 = null;
                            } else {
                                ne1Var7 = ne1Var5;
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                                value = wg3.getValue(tg3.m, kk0Var, 6);
                            } else {
                                value = rg3Var2;
                            }
                            i12 = i3;
                            if ((i2 & Uuid.SIZE_BITS) != 0) {
                                i13 = i10;
                                i14 = 2;
                                cj2 cj2VarM181xeb8e9a2e11111119 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                                kk0Var = kk0Var;
                                cj2Var2 = cj2VarM181xeb8e9a2e11111119;
                                i3 = i12 & (-29360129);
                            } else {
                                i13 = i10;
                                i14 = 2;
                                i3 = i12;
                            }
                            cVar4 = cVar3;
                            if (i13 != 0) {
                                gh2Var3 = null;
                            } else {
                                gh2Var3 = gh2Var;
                            }
                            rg3Var3 = value;
                        }
                        kk0Var.s();
                        int i111116 = i3 >> 3;
                        qs0 qs0Var11110 = (qs0) cj2Var2;
                        hq3.m211x54dd086a(z, je1Var, d.f(we3.b(cVar4, false, fl1.I), 56.0f, 0.0f, i14).then(d.a), false, rg3Var3, ((re0) qs0Var11110.containerColor(z, kk0Var, (i111116 & 14) | ((i3 >> 18) & 112)).getValue()).a, 0L, 0.0f, 0.0f, (iw) null, gh2Var3, (ne1) zg0.rememberComposableLambda(191488423, true, new rj2(ne1Var6, qs0Var11110, z, ne1Var7, ne1Var), kk0Var, 54), (ck0) kk0Var, (i111116 & 126) | ((i3 >> 6) & 57344), ((i3 >> 24) & 14) | 48, 968);
                        rg3Var4 = rg3Var3;
                        gh2Var4 = gh2Var3;
                        cj2Var3 = qs0Var11110;
                        cVar5 = cVar4;
                        ne1Var8 = ne1Var6;
                        ne1Var9 = ne1Var7;
                    } else {
                        kk0Var.X();
                        if ((i & 1) != 0) {
                            if (i4 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i6 != 0) {
                                ne1Var6 = null;
                            } else {
                                ne1Var6 = ne1Var4;
                            }
                            if (i8 != 0) {
                                ne1Var7 = null;
                            } else {
                                ne1Var7 = ne1Var5;
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                                value = wg3.getValue(tg3.m, kk0Var, 6);
                            } else {
                                value = rg3Var2;
                            }
                            i12 = i3;
                            if ((i2 & Uuid.SIZE_BITS) != 0) {
                                i13 = i10;
                                i14 = 2;
                                cj2 cj2VarM181xeb8e9a2e111111110 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                                kk0Var = kk0Var;
                                cj2Var2 = cj2VarM181xeb8e9a2e111111110;
                                i3 = i12 & (-29360129);
                            } else {
                                i13 = i10;
                                i14 = 2;
                                i3 = i12;
                            }
                            cVar4 = cVar3;
                            if (i13 != 0) {
                                gh2Var3 = null;
                            } else {
                                gh2Var3 = gh2Var;
                            }
                            rg3Var3 = value;
                        } else {
                            if (i4 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i6 != 0) {
                                ne1Var6 = null;
                            } else {
                                ne1Var6 = ne1Var4;
                            }
                            if (i8 != 0) {
                                ne1Var7 = null;
                            } else {
                                ne1Var7 = ne1Var5;
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                                value = wg3.getValue(tg3.m, kk0Var, 6);
                            } else {
                                value = rg3Var2;
                            }
                            i12 = i3;
                            if ((i2 & Uuid.SIZE_BITS) != 0) {
                                i13 = i10;
                                i14 = 2;
                                cj2 cj2VarM181xeb8e9a2e111111111 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                                kk0Var = kk0Var;
                                cj2Var2 = cj2VarM181xeb8e9a2e111111111;
                                i3 = i12 & (-29360129);
                            } else {
                                i13 = i10;
                                i14 = 2;
                                i3 = i12;
                            }
                            cVar4 = cVar3;
                            if (i13 != 0) {
                                gh2Var3 = null;
                            } else {
                                gh2Var3 = gh2Var;
                            }
                            rg3Var3 = value;
                        }
                        kk0Var.s();
                        int i111117 = i3 >> 3;
                        qs0 qs0Var11111 = (qs0) cj2Var2;
                        hq3.m211x54dd086a(z, je1Var, d.f(we3.b(cVar4, false, fl1.I), 56.0f, 0.0f, i14).then(d.a), false, rg3Var3, ((re0) qs0Var11111.containerColor(z, kk0Var, (i111117 & 14) | ((i3 >> 18) & 112)).getValue()).a, 0L, 0.0f, 0.0f, (iw) null, gh2Var3, (ne1) zg0.rememberComposableLambda(191488423, true, new rj2(ne1Var6, qs0Var11111, z, ne1Var7, ne1Var), kk0Var, 54), (ck0) kk0Var, (i111117 & 126) | ((i3 >> 6) & 57344), ((i3 >> 24) & 14) | 48, 968);
                        rg3Var4 = rg3Var3;
                        gh2Var4 = gh2Var3;
                        cj2Var3 = qs0Var11111;
                        cVar5 = cVar4;
                        ne1Var8 = ne1Var6;
                        ne1Var9 = ne1Var7;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new yb(ne1Var, z, je1Var, cVar5, ne1Var8, ne1Var9, rg3Var4, cj2Var3, gh2Var4, i, i2));
                    }
                }
                i3 |= 100663296;
                gh2Var2 = gh2Var;
                if ((i3 & 38347923) == 38347922) {
                    kk0Var.X();
                    if ((i & 1) != 0) {
                        if (i4 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i6 != 0) {
                            ne1Var6 = null;
                        } else {
                            ne1Var6 = ne1Var4;
                        }
                        if (i8 != 0) {
                            ne1Var7 = null;
                        } else {
                            ne1Var7 = ne1Var5;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            value = wg3.getValue(tg3.m, kk0Var, 6);
                        } else {
                            value = rg3Var2;
                        }
                        i12 = i3;
                        if ((i2 & Uuid.SIZE_BITS) != 0) {
                            i13 = i10;
                            i14 = 2;
                            cj2 cj2VarM181xeb8e9a2e111111112 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                            kk0Var = kk0Var;
                            cj2Var2 = cj2VarM181xeb8e9a2e111111112;
                            i3 = i12 & (-29360129);
                        } else {
                            i13 = i10;
                            i14 = 2;
                            i3 = i12;
                        }
                        cVar4 = cVar3;
                        if (i13 != 0) {
                            gh2Var3 = null;
                        } else {
                            gh2Var3 = gh2Var;
                        }
                        rg3Var3 = value;
                    } else {
                        if (i4 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i6 != 0) {
                            ne1Var6 = null;
                        } else {
                            ne1Var6 = ne1Var4;
                        }
                        if (i8 != 0) {
                            ne1Var7 = null;
                        } else {
                            ne1Var7 = ne1Var5;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            value = wg3.getValue(tg3.m, kk0Var, 6);
                        } else {
                            value = rg3Var2;
                        }
                        i12 = i3;
                        if ((i2 & Uuid.SIZE_BITS) != 0) {
                            i13 = i10;
                            i14 = 2;
                            cj2 cj2VarM181xeb8e9a2e111111113 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                            kk0Var = kk0Var;
                            cj2Var2 = cj2VarM181xeb8e9a2e111111113;
                            i3 = i12 & (-29360129);
                        } else {
                            i13 = i10;
                            i14 = 2;
                            i3 = i12;
                        }
                        cVar4 = cVar3;
                        if (i13 != 0) {
                            gh2Var3 = null;
                        } else {
                            gh2Var3 = gh2Var;
                        }
                        rg3Var3 = value;
                    }
                    kk0Var.s();
                    int i111118 = i3 >> 3;
                    qs0 qs0Var11112 = (qs0) cj2Var2;
                    hq3.m211x54dd086a(z, je1Var, d.f(we3.b(cVar4, false, fl1.I), 56.0f, 0.0f, i14).then(d.a), false, rg3Var3, ((re0) qs0Var11112.containerColor(z, kk0Var, (i111118 & 14) | ((i3 >> 18) & 112)).getValue()).a, 0L, 0.0f, 0.0f, (iw) null, gh2Var3, (ne1) zg0.rememberComposableLambda(191488423, true, new rj2(ne1Var6, qs0Var11112, z, ne1Var7, ne1Var), kk0Var, 54), (ck0) kk0Var, (i111118 & 126) | ((i3 >> 6) & 57344), ((i3 >> 24) & 14) | 48, 968);
                    rg3Var4 = rg3Var3;
                    gh2Var4 = gh2Var3;
                    cj2Var3 = qs0Var11112;
                    cVar5 = cVar4;
                    ne1Var8 = ne1Var6;
                    ne1Var9 = ne1Var7;
                } else {
                    kk0Var.X();
                    if ((i & 1) != 0) {
                        if (i4 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i6 != 0) {
                            ne1Var6 = null;
                        } else {
                            ne1Var6 = ne1Var4;
                        }
                        if (i8 != 0) {
                            ne1Var7 = null;
                        } else {
                            ne1Var7 = ne1Var5;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            value = wg3.getValue(tg3.m, kk0Var, 6);
                        } else {
                            value = rg3Var2;
                        }
                        i12 = i3;
                        if ((i2 & Uuid.SIZE_BITS) != 0) {
                            i13 = i10;
                            i14 = 2;
                            cj2 cj2VarM181xeb8e9a2e111111114 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                            kk0Var = kk0Var;
                            cj2Var2 = cj2VarM181xeb8e9a2e111111114;
                            i3 = i12 & (-29360129);
                        } else {
                            i13 = i10;
                            i14 = 2;
                            i3 = i12;
                        }
                        cVar4 = cVar3;
                        if (i13 != 0) {
                            gh2Var3 = null;
                        } else {
                            gh2Var3 = gh2Var;
                        }
                        rg3Var3 = value;
                    } else {
                        if (i4 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i6 != 0) {
                            ne1Var6 = null;
                        } else {
                            ne1Var6 = ne1Var4;
                        }
                        if (i8 != 0) {
                            ne1Var7 = null;
                        } else {
                            ne1Var7 = ne1Var5;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            value = wg3.getValue(tg3.m, kk0Var, 6);
                        } else {
                            value = rg3Var2;
                        }
                        i12 = i3;
                        if ((i2 & Uuid.SIZE_BITS) != 0) {
                            i13 = i10;
                            i14 = 2;
                            cj2 cj2VarM181xeb8e9a2e111111115 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                            kk0Var = kk0Var;
                            cj2Var2 = cj2VarM181xeb8e9a2e111111115;
                            i3 = i12 & (-29360129);
                        } else {
                            i13 = i10;
                            i14 = 2;
                            i3 = i12;
                        }
                        cVar4 = cVar3;
                        if (i13 != 0) {
                            gh2Var3 = null;
                        } else {
                            gh2Var3 = gh2Var;
                        }
                        rg3Var3 = value;
                    }
                    kk0Var.s();
                    int i111119 = i3 >> 3;
                    qs0 qs0Var11113 = (qs0) cj2Var2;
                    hq3.m211x54dd086a(z, je1Var, d.f(we3.b(cVar4, false, fl1.I), 56.0f, 0.0f, i14).then(d.a), false, rg3Var3, ((re0) qs0Var11113.containerColor(z, kk0Var, (i111119 & 14) | ((i3 >> 18) & 112)).getValue()).a, 0L, 0.0f, 0.0f, (iw) null, gh2Var3, (ne1) zg0.rememberComposableLambda(191488423, true, new rj2(ne1Var6, qs0Var11113, z, ne1Var7, ne1Var), kk0Var, 54), (ck0) kk0Var, (i111119 & 126) | ((i3 >> 6) & 57344), ((i3 >> 24) & 14) | 48, 968);
                    rg3Var4 = rg3Var3;
                    gh2Var4 = gh2Var3;
                    cj2Var3 = qs0Var11113;
                    cVar5 = cVar4;
                    ne1Var8 = ne1Var6;
                    ne1Var9 = ne1Var7;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new yb(ne1Var, z, je1Var, cVar5, ne1Var8, ne1Var9, rg3Var4, cj2Var3, gh2Var4, i, i2));
                }
            }
            i3 |= 196608;
            ne1Var5 = ne1Var3;
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    rg3Var2 = rg3Var;
                    if (kk0Var.h(rg3Var2)) {
                    }
                    i3 |= i15;
                } else {
                    rg3Var2 = rg3Var;
                }
                i3 |= i15;
            } else {
                rg3Var2 = rg3Var;
            }
            if ((12582912 & i) == 0) {
                if ((i2 & Uuid.SIZE_BITS) == 0) {
                    cj2Var2 = cj2Var;
                    if (kk0Var.h(cj2Var2)) {
                    }
                    i3 |= i16;
                } else {
                    cj2Var2 = cj2Var;
                }
                i3 |= i16;
            } else {
                cj2Var2 = cj2Var;
            }
            i10 = i2 & FontInfo.NUMBER_OF_CHAR_CODES;
            if (i10 != 0) {
                if ((i & 100663296) == 0) {
                    gh2Var2 = gh2Var;
                    if (kk0Var.h(gh2Var2)) {
                        i11 = 67108864;
                    } else {
                        i11 = 33554432;
                    }
                    i3 |= i11;
                }
                if ((i3 & 38347923) == 38347922) {
                    kk0Var.X();
                    if ((i & 1) != 0) {
                        if (i4 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i6 != 0) {
                            ne1Var6 = null;
                        } else {
                            ne1Var6 = ne1Var4;
                        }
                        if (i8 != 0) {
                            ne1Var7 = null;
                        } else {
                            ne1Var7 = ne1Var5;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            value = wg3.getValue(tg3.m, kk0Var, 6);
                        } else {
                            value = rg3Var2;
                        }
                        i12 = i3;
                        if ((i2 & Uuid.SIZE_BITS) != 0) {
                            i13 = i10;
                            i14 = 2;
                            cj2 cj2VarM181xeb8e9a2e111111116 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                            kk0Var = kk0Var;
                            cj2Var2 = cj2VarM181xeb8e9a2e111111116;
                            i3 = i12 & (-29360129);
                        } else {
                            i13 = i10;
                            i14 = 2;
                            i3 = i12;
                        }
                        cVar4 = cVar3;
                        if (i13 != 0) {
                            gh2Var3 = null;
                        } else {
                            gh2Var3 = gh2Var;
                        }
                        rg3Var3 = value;
                    } else {
                        if (i4 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i6 != 0) {
                            ne1Var6 = null;
                        } else {
                            ne1Var6 = ne1Var4;
                        }
                        if (i8 != 0) {
                            ne1Var7 = null;
                        } else {
                            ne1Var7 = ne1Var5;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            value = wg3.getValue(tg3.m, kk0Var, 6);
                        } else {
                            value = rg3Var2;
                        }
                        i12 = i3;
                        if ((i2 & Uuid.SIZE_BITS) != 0) {
                            i13 = i10;
                            i14 = 2;
                            cj2 cj2VarM181xeb8e9a2e111111117 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                            kk0Var = kk0Var;
                            cj2Var2 = cj2VarM181xeb8e9a2e111111117;
                            i3 = i12 & (-29360129);
                        } else {
                            i13 = i10;
                            i14 = 2;
                            i3 = i12;
                        }
                        cVar4 = cVar3;
                        if (i13 != 0) {
                            gh2Var3 = null;
                        } else {
                            gh2Var3 = gh2Var;
                        }
                        rg3Var3 = value;
                    }
                    kk0Var.s();
                    int i1111110 = i3 >> 3;
                    qs0 qs0Var11114 = (qs0) cj2Var2;
                    hq3.m211x54dd086a(z, je1Var, d.f(we3.b(cVar4, false, fl1.I), 56.0f, 0.0f, i14).then(d.a), false, rg3Var3, ((re0) qs0Var11114.containerColor(z, kk0Var, (i1111110 & 14) | ((i3 >> 18) & 112)).getValue()).a, 0L, 0.0f, 0.0f, (iw) null, gh2Var3, (ne1) zg0.rememberComposableLambda(191488423, true, new rj2(ne1Var6, qs0Var11114, z, ne1Var7, ne1Var), kk0Var, 54), (ck0) kk0Var, (i1111110 & 126) | ((i3 >> 6) & 57344), ((i3 >> 24) & 14) | 48, 968);
                    rg3Var4 = rg3Var3;
                    gh2Var4 = gh2Var3;
                    cj2Var3 = qs0Var11114;
                    cVar5 = cVar4;
                    ne1Var8 = ne1Var6;
                    ne1Var9 = ne1Var7;
                } else {
                    kk0Var.X();
                    if ((i & 1) != 0) {
                        if (i4 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i6 != 0) {
                            ne1Var6 = null;
                        } else {
                            ne1Var6 = ne1Var4;
                        }
                        if (i8 != 0) {
                            ne1Var7 = null;
                        } else {
                            ne1Var7 = ne1Var5;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            value = wg3.getValue(tg3.m, kk0Var, 6);
                        } else {
                            value = rg3Var2;
                        }
                        i12 = i3;
                        if ((i2 & Uuid.SIZE_BITS) != 0) {
                            i13 = i10;
                            i14 = 2;
                            cj2 cj2VarM181xeb8e9a2e111111118 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                            kk0Var = kk0Var;
                            cj2Var2 = cj2VarM181xeb8e9a2e111111118;
                            i3 = i12 & (-29360129);
                        } else {
                            i13 = i10;
                            i14 = 2;
                            i3 = i12;
                        }
                        cVar4 = cVar3;
                        if (i13 != 0) {
                            gh2Var3 = null;
                        } else {
                            gh2Var3 = gh2Var;
                        }
                        rg3Var3 = value;
                    } else {
                        if (i4 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i6 != 0) {
                            ne1Var6 = null;
                        } else {
                            ne1Var6 = ne1Var4;
                        }
                        if (i8 != 0) {
                            ne1Var7 = null;
                        } else {
                            ne1Var7 = ne1Var5;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            value = wg3.getValue(tg3.m, kk0Var, 6);
                        } else {
                            value = rg3Var2;
                        }
                        i12 = i3;
                        if ((i2 & Uuid.SIZE_BITS) != 0) {
                            i13 = i10;
                            i14 = 2;
                            cj2 cj2VarM181xeb8e9a2e111111119 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                            kk0Var = kk0Var;
                            cj2Var2 = cj2VarM181xeb8e9a2e111111119;
                            i3 = i12 & (-29360129);
                        } else {
                            i13 = i10;
                            i14 = 2;
                            i3 = i12;
                        }
                        cVar4 = cVar3;
                        if (i13 != 0) {
                            gh2Var3 = null;
                        } else {
                            gh2Var3 = gh2Var;
                        }
                        rg3Var3 = value;
                    }
                    kk0Var.s();
                    int i1111111 = i3 >> 3;
                    qs0 qs0Var11115 = (qs0) cj2Var2;
                    hq3.m211x54dd086a(z, je1Var, d.f(we3.b(cVar4, false, fl1.I), 56.0f, 0.0f, i14).then(d.a), false, rg3Var3, ((re0) qs0Var11115.containerColor(z, kk0Var, (i1111111 & 14) | ((i3 >> 18) & 112)).getValue()).a, 0L, 0.0f, 0.0f, (iw) null, gh2Var3, (ne1) zg0.rememberComposableLambda(191488423, true, new rj2(ne1Var6, qs0Var11115, z, ne1Var7, ne1Var), kk0Var, 54), (ck0) kk0Var, (i1111111 & 126) | ((i3 >> 6) & 57344), ((i3 >> 24) & 14) | 48, 968);
                    rg3Var4 = rg3Var3;
                    gh2Var4 = gh2Var3;
                    cj2Var3 = qs0Var11115;
                    cVar5 = cVar4;
                    ne1Var8 = ne1Var6;
                    ne1Var9 = ne1Var7;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new yb(ne1Var, z, je1Var, cVar5, ne1Var8, ne1Var9, rg3Var4, cj2Var3, gh2Var4, i, i2));
                }
            }
            i3 |= 100663296;
            gh2Var2 = gh2Var;
            if ((i3 & 38347923) == 38347922) {
                kk0Var.X();
                if ((i & 1) != 0) {
                    if (i4 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i6 != 0) {
                        ne1Var6 = null;
                    } else {
                        ne1Var6 = ne1Var4;
                    }
                    if (i8 != 0) {
                        ne1Var7 = null;
                    } else {
                        ne1Var7 = ne1Var5;
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        value = wg3.getValue(tg3.m, kk0Var, 6);
                    } else {
                        value = rg3Var2;
                    }
                    i12 = i3;
                    if ((i2 & Uuid.SIZE_BITS) != 0) {
                        i13 = i10;
                        i14 = 2;
                        cj2 cj2VarM181xeb8e9a2e1111111110 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                        kk0Var = kk0Var;
                        cj2Var2 = cj2VarM181xeb8e9a2e1111111110;
                        i3 = i12 & (-29360129);
                    } else {
                        i13 = i10;
                        i14 = 2;
                        i3 = i12;
                    }
                    cVar4 = cVar3;
                    if (i13 != 0) {
                        gh2Var3 = null;
                    } else {
                        gh2Var3 = gh2Var;
                    }
                    rg3Var3 = value;
                } else {
                    if (i4 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i6 != 0) {
                        ne1Var6 = null;
                    } else {
                        ne1Var6 = ne1Var4;
                    }
                    if (i8 != 0) {
                        ne1Var7 = null;
                    } else {
                        ne1Var7 = ne1Var5;
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        value = wg3.getValue(tg3.m, kk0Var, 6);
                    } else {
                        value = rg3Var2;
                    }
                    i12 = i3;
                    if ((i2 & Uuid.SIZE_BITS) != 0) {
                        i13 = i10;
                        i14 = 2;
                        cj2 cj2VarM181xeb8e9a2e1111111111 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                        kk0Var = kk0Var;
                        cj2Var2 = cj2VarM181xeb8e9a2e1111111111;
                        i3 = i12 & (-29360129);
                    } else {
                        i13 = i10;
                        i14 = 2;
                        i3 = i12;
                    }
                    cVar4 = cVar3;
                    if (i13 != 0) {
                        gh2Var3 = null;
                    } else {
                        gh2Var3 = gh2Var;
                    }
                    rg3Var3 = value;
                }
                kk0Var.s();
                int i1111112 = i3 >> 3;
                qs0 qs0Var11116 = (qs0) cj2Var2;
                hq3.m211x54dd086a(z, je1Var, d.f(we3.b(cVar4, false, fl1.I), 56.0f, 0.0f, i14).then(d.a), false, rg3Var3, ((re0) qs0Var11116.containerColor(z, kk0Var, (i1111112 & 14) | ((i3 >> 18) & 112)).getValue()).a, 0L, 0.0f, 0.0f, (iw) null, gh2Var3, (ne1) zg0.rememberComposableLambda(191488423, true, new rj2(ne1Var6, qs0Var11116, z, ne1Var7, ne1Var), kk0Var, 54), (ck0) kk0Var, (i1111112 & 126) | ((i3 >> 6) & 57344), ((i3 >> 24) & 14) | 48, 968);
                rg3Var4 = rg3Var3;
                gh2Var4 = gh2Var3;
                cj2Var3 = qs0Var11116;
                cVar5 = cVar4;
                ne1Var8 = ne1Var6;
                ne1Var9 = ne1Var7;
            } else {
                kk0Var.X();
                if ((i & 1) != 0) {
                    if (i4 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i6 != 0) {
                        ne1Var6 = null;
                    } else {
                        ne1Var6 = ne1Var4;
                    }
                    if (i8 != 0) {
                        ne1Var7 = null;
                    } else {
                        ne1Var7 = ne1Var5;
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        value = wg3.getValue(tg3.m, kk0Var, 6);
                    } else {
                        value = rg3Var2;
                    }
                    i12 = i3;
                    if ((i2 & Uuid.SIZE_BITS) != 0) {
                        i13 = i10;
                        i14 = 2;
                        cj2 cj2VarM181xeb8e9a2e1111111112 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                        kk0Var = kk0Var;
                        cj2Var2 = cj2VarM181xeb8e9a2e1111111112;
                        i3 = i12 & (-29360129);
                    } else {
                        i13 = i10;
                        i14 = 2;
                        i3 = i12;
                    }
                    cVar4 = cVar3;
                    if (i13 != 0) {
                        gh2Var3 = null;
                    } else {
                        gh2Var3 = gh2Var;
                    }
                    rg3Var3 = value;
                } else {
                    if (i4 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i6 != 0) {
                        ne1Var6 = null;
                    } else {
                        ne1Var6 = ne1Var4;
                    }
                    if (i8 != 0) {
                        ne1Var7 = null;
                    } else {
                        ne1Var7 = ne1Var5;
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        value = wg3.getValue(tg3.m, kk0Var, 6);
                    } else {
                        value = rg3Var2;
                    }
                    i12 = i3;
                    if ((i2 & Uuid.SIZE_BITS) != 0) {
                        i13 = i10;
                        i14 = 2;
                        cj2 cj2VarM181xeb8e9a2e1111111113 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                        kk0Var = kk0Var;
                        cj2Var2 = cj2VarM181xeb8e9a2e1111111113;
                        i3 = i12 & (-29360129);
                    } else {
                        i13 = i10;
                        i14 = 2;
                        i3 = i12;
                    }
                    cVar4 = cVar3;
                    if (i13 != 0) {
                        gh2Var3 = null;
                    } else {
                        gh2Var3 = gh2Var;
                    }
                    rg3Var3 = value;
                }
                kk0Var.s();
                int i1111113 = i3 >> 3;
                qs0 qs0Var11117 = (qs0) cj2Var2;
                hq3.m211x54dd086a(z, je1Var, d.f(we3.b(cVar4, false, fl1.I), 56.0f, 0.0f, i14).then(d.a), false, rg3Var3, ((re0) qs0Var11117.containerColor(z, kk0Var, (i1111113 & 14) | ((i3 >> 18) & 112)).getValue()).a, 0L, 0.0f, 0.0f, (iw) null, gh2Var3, (ne1) zg0.rememberComposableLambda(191488423, true, new rj2(ne1Var6, qs0Var11117, z, ne1Var7, ne1Var), kk0Var, 54), (ck0) kk0Var, (i1111113 & 126) | ((i3 >> 6) & 57344), ((i3 >> 24) & 14) | 48, 968);
                rg3Var4 = rg3Var3;
                gh2Var4 = gh2Var3;
                cj2Var3 = qs0Var11117;
                cVar5 = cVar4;
                ne1Var8 = ne1Var6;
                ne1Var9 = ne1Var7;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new yb(ne1Var, z, je1Var, cVar5, ne1Var8, ne1Var9, rg3Var4, cj2Var3, gh2Var4, i, i2));
            }
        }
        i3 |= 3072;
        cVar2 = cVar;
        i6 = i2 & 16;
        if (i6 != 0) {
            if ((i & 24576) == 0) {
                ne1Var4 = ne1Var2;
                if (kk0Var.j(ne1Var4)) {
                    i7 = 16384;
                } else {
                    i7 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                }
                i3 |= i7;
            }
            i8 = i2 & 32;
            if (i8 != 0) {
                if ((196608 & i) == 0) {
                    ne1Var5 = ne1Var3;
                    if (kk0Var.j(ne1Var5)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        rg3Var2 = rg3Var;
                        if (kk0Var.h(rg3Var2)) {
                        }
                        i3 |= i15;
                    } else {
                        rg3Var2 = rg3Var;
                    }
                    i3 |= i15;
                } else {
                    rg3Var2 = rg3Var;
                }
                if ((12582912 & i) == 0) {
                    if ((i2 & Uuid.SIZE_BITS) == 0) {
                        cj2Var2 = cj2Var;
                        if (kk0Var.h(cj2Var2)) {
                        }
                        i3 |= i16;
                    } else {
                        cj2Var2 = cj2Var;
                    }
                    i3 |= i16;
                } else {
                    cj2Var2 = cj2Var;
                }
                i10 = i2 & FontInfo.NUMBER_OF_CHAR_CODES;
                if (i10 != 0) {
                    if ((i & 100663296) == 0) {
                        gh2Var2 = gh2Var;
                        if (kk0Var.h(gh2Var2)) {
                            i11 = 67108864;
                        } else {
                            i11 = 33554432;
                        }
                        i3 |= i11;
                    }
                    if ((i3 & 38347923) == 38347922) {
                        kk0Var.X();
                        if ((i & 1) != 0) {
                            if (i4 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i6 != 0) {
                                ne1Var6 = null;
                            } else {
                                ne1Var6 = ne1Var4;
                            }
                            if (i8 != 0) {
                                ne1Var7 = null;
                            } else {
                                ne1Var7 = ne1Var5;
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                                value = wg3.getValue(tg3.m, kk0Var, 6);
                            } else {
                                value = rg3Var2;
                            }
                            i12 = i3;
                            if ((i2 & Uuid.SIZE_BITS) != 0) {
                                i13 = i10;
                                i14 = 2;
                                cj2 cj2VarM181xeb8e9a2e1111111114 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                                kk0Var = kk0Var;
                                cj2Var2 = cj2VarM181xeb8e9a2e1111111114;
                                i3 = i12 & (-29360129);
                            } else {
                                i13 = i10;
                                i14 = 2;
                                i3 = i12;
                            }
                            cVar4 = cVar3;
                            if (i13 != 0) {
                                gh2Var3 = null;
                            } else {
                                gh2Var3 = gh2Var;
                            }
                            rg3Var3 = value;
                        } else {
                            if (i4 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i6 != 0) {
                                ne1Var6 = null;
                            } else {
                                ne1Var6 = ne1Var4;
                            }
                            if (i8 != 0) {
                                ne1Var7 = null;
                            } else {
                                ne1Var7 = ne1Var5;
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                                value = wg3.getValue(tg3.m, kk0Var, 6);
                            } else {
                                value = rg3Var2;
                            }
                            i12 = i3;
                            if ((i2 & Uuid.SIZE_BITS) != 0) {
                                i13 = i10;
                                i14 = 2;
                                cj2 cj2VarM181xeb8e9a2e1111111115 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                                kk0Var = kk0Var;
                                cj2Var2 = cj2VarM181xeb8e9a2e1111111115;
                                i3 = i12 & (-29360129);
                            } else {
                                i13 = i10;
                                i14 = 2;
                                i3 = i12;
                            }
                            cVar4 = cVar3;
                            if (i13 != 0) {
                                gh2Var3 = null;
                            } else {
                                gh2Var3 = gh2Var;
                            }
                            rg3Var3 = value;
                        }
                        kk0Var.s();
                        int i1111114 = i3 >> 3;
                        qs0 qs0Var11118 = (qs0) cj2Var2;
                        hq3.m211x54dd086a(z, je1Var, d.f(we3.b(cVar4, false, fl1.I), 56.0f, 0.0f, i14).then(d.a), false, rg3Var3, ((re0) qs0Var11118.containerColor(z, kk0Var, (i1111114 & 14) | ((i3 >> 18) & 112)).getValue()).a, 0L, 0.0f, 0.0f, (iw) null, gh2Var3, (ne1) zg0.rememberComposableLambda(191488423, true, new rj2(ne1Var6, qs0Var11118, z, ne1Var7, ne1Var), kk0Var, 54), (ck0) kk0Var, (i1111114 & 126) | ((i3 >> 6) & 57344), ((i3 >> 24) & 14) | 48, 968);
                        rg3Var4 = rg3Var3;
                        gh2Var4 = gh2Var3;
                        cj2Var3 = qs0Var11118;
                        cVar5 = cVar4;
                        ne1Var8 = ne1Var6;
                        ne1Var9 = ne1Var7;
                    } else {
                        kk0Var.X();
                        if ((i & 1) != 0) {
                            if (i4 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i6 != 0) {
                                ne1Var6 = null;
                            } else {
                                ne1Var6 = ne1Var4;
                            }
                            if (i8 != 0) {
                                ne1Var7 = null;
                            } else {
                                ne1Var7 = ne1Var5;
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                                value = wg3.getValue(tg3.m, kk0Var, 6);
                            } else {
                                value = rg3Var2;
                            }
                            i12 = i3;
                            if ((i2 & Uuid.SIZE_BITS) != 0) {
                                i13 = i10;
                                i14 = 2;
                                cj2 cj2VarM181xeb8e9a2e1111111116 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                                kk0Var = kk0Var;
                                cj2Var2 = cj2VarM181xeb8e9a2e1111111116;
                                i3 = i12 & (-29360129);
                            } else {
                                i13 = i10;
                                i14 = 2;
                                i3 = i12;
                            }
                            cVar4 = cVar3;
                            if (i13 != 0) {
                                gh2Var3 = null;
                            } else {
                                gh2Var3 = gh2Var;
                            }
                            rg3Var3 = value;
                        } else {
                            if (i4 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i6 != 0) {
                                ne1Var6 = null;
                            } else {
                                ne1Var6 = ne1Var4;
                            }
                            if (i8 != 0) {
                                ne1Var7 = null;
                            } else {
                                ne1Var7 = ne1Var5;
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                                value = wg3.getValue(tg3.m, kk0Var, 6);
                            } else {
                                value = rg3Var2;
                            }
                            i12 = i3;
                            if ((i2 & Uuid.SIZE_BITS) != 0) {
                                i13 = i10;
                                i14 = 2;
                                cj2 cj2VarM181xeb8e9a2e1111111117 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                                kk0Var = kk0Var;
                                cj2Var2 = cj2VarM181xeb8e9a2e1111111117;
                                i3 = i12 & (-29360129);
                            } else {
                                i13 = i10;
                                i14 = 2;
                                i3 = i12;
                            }
                            cVar4 = cVar3;
                            if (i13 != 0) {
                                gh2Var3 = null;
                            } else {
                                gh2Var3 = gh2Var;
                            }
                            rg3Var3 = value;
                        }
                        kk0Var.s();
                        int i1111115 = i3 >> 3;
                        qs0 qs0Var11119 = (qs0) cj2Var2;
                        hq3.m211x54dd086a(z, je1Var, d.f(we3.b(cVar4, false, fl1.I), 56.0f, 0.0f, i14).then(d.a), false, rg3Var3, ((re0) qs0Var11119.containerColor(z, kk0Var, (i1111115 & 14) | ((i3 >> 18) & 112)).getValue()).a, 0L, 0.0f, 0.0f, (iw) null, gh2Var3, (ne1) zg0.rememberComposableLambda(191488423, true, new rj2(ne1Var6, qs0Var11119, z, ne1Var7, ne1Var), kk0Var, 54), (ck0) kk0Var, (i1111115 & 126) | ((i3 >> 6) & 57344), ((i3 >> 24) & 14) | 48, 968);
                        rg3Var4 = rg3Var3;
                        gh2Var4 = gh2Var3;
                        cj2Var3 = qs0Var11119;
                        cVar5 = cVar4;
                        ne1Var8 = ne1Var6;
                        ne1Var9 = ne1Var7;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new yb(ne1Var, z, je1Var, cVar5, ne1Var8, ne1Var9, rg3Var4, cj2Var3, gh2Var4, i, i2));
                    }
                }
                i3 |= 100663296;
                gh2Var2 = gh2Var;
                if ((i3 & 38347923) == 38347922) {
                    kk0Var.X();
                    if ((i & 1) != 0) {
                        if (i4 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i6 != 0) {
                            ne1Var6 = null;
                        } else {
                            ne1Var6 = ne1Var4;
                        }
                        if (i8 != 0) {
                            ne1Var7 = null;
                        } else {
                            ne1Var7 = ne1Var5;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            value = wg3.getValue(tg3.m, kk0Var, 6);
                        } else {
                            value = rg3Var2;
                        }
                        i12 = i3;
                        if ((i2 & Uuid.SIZE_BITS) != 0) {
                            i13 = i10;
                            i14 = 2;
                            cj2 cj2VarM181xeb8e9a2e1111111118 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                            kk0Var = kk0Var;
                            cj2Var2 = cj2VarM181xeb8e9a2e1111111118;
                            i3 = i12 & (-29360129);
                        } else {
                            i13 = i10;
                            i14 = 2;
                            i3 = i12;
                        }
                        cVar4 = cVar3;
                        if (i13 != 0) {
                            gh2Var3 = null;
                        } else {
                            gh2Var3 = gh2Var;
                        }
                        rg3Var3 = value;
                    } else {
                        if (i4 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i6 != 0) {
                            ne1Var6 = null;
                        } else {
                            ne1Var6 = ne1Var4;
                        }
                        if (i8 != 0) {
                            ne1Var7 = null;
                        } else {
                            ne1Var7 = ne1Var5;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            value = wg3.getValue(tg3.m, kk0Var, 6);
                        } else {
                            value = rg3Var2;
                        }
                        i12 = i3;
                        if ((i2 & Uuid.SIZE_BITS) != 0) {
                            i13 = i10;
                            i14 = 2;
                            cj2 cj2VarM181xeb8e9a2e1111111119 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                            kk0Var = kk0Var;
                            cj2Var2 = cj2VarM181xeb8e9a2e1111111119;
                            i3 = i12 & (-29360129);
                        } else {
                            i13 = i10;
                            i14 = 2;
                            i3 = i12;
                        }
                        cVar4 = cVar3;
                        if (i13 != 0) {
                            gh2Var3 = null;
                        } else {
                            gh2Var3 = gh2Var;
                        }
                        rg3Var3 = value;
                    }
                    kk0Var.s();
                    int i1111116 = i3 >> 3;
                    qs0 qs0Var111110 = (qs0) cj2Var2;
                    hq3.m211x54dd086a(z, je1Var, d.f(we3.b(cVar4, false, fl1.I), 56.0f, 0.0f, i14).then(d.a), false, rg3Var3, ((re0) qs0Var111110.containerColor(z, kk0Var, (i1111116 & 14) | ((i3 >> 18) & 112)).getValue()).a, 0L, 0.0f, 0.0f, (iw) null, gh2Var3, (ne1) zg0.rememberComposableLambda(191488423, true, new rj2(ne1Var6, qs0Var111110, z, ne1Var7, ne1Var), kk0Var, 54), (ck0) kk0Var, (i1111116 & 126) | ((i3 >> 6) & 57344), ((i3 >> 24) & 14) | 48, 968);
                    rg3Var4 = rg3Var3;
                    gh2Var4 = gh2Var3;
                    cj2Var3 = qs0Var111110;
                    cVar5 = cVar4;
                    ne1Var8 = ne1Var6;
                    ne1Var9 = ne1Var7;
                } else {
                    kk0Var.X();
                    if ((i & 1) != 0) {
                        if (i4 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i6 != 0) {
                            ne1Var6 = null;
                        } else {
                            ne1Var6 = ne1Var4;
                        }
                        if (i8 != 0) {
                            ne1Var7 = null;
                        } else {
                            ne1Var7 = ne1Var5;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            value = wg3.getValue(tg3.m, kk0Var, 6);
                        } else {
                            value = rg3Var2;
                        }
                        i12 = i3;
                        if ((i2 & Uuid.SIZE_BITS) != 0) {
                            i13 = i10;
                            i14 = 2;
                            cj2 cj2VarM181xeb8e9a2e11111111110 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                            kk0Var = kk0Var;
                            cj2Var2 = cj2VarM181xeb8e9a2e11111111110;
                            i3 = i12 & (-29360129);
                        } else {
                            i13 = i10;
                            i14 = 2;
                            i3 = i12;
                        }
                        cVar4 = cVar3;
                        if (i13 != 0) {
                            gh2Var3 = null;
                        } else {
                            gh2Var3 = gh2Var;
                        }
                        rg3Var3 = value;
                    } else {
                        if (i4 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i6 != 0) {
                            ne1Var6 = null;
                        } else {
                            ne1Var6 = ne1Var4;
                        }
                        if (i8 != 0) {
                            ne1Var7 = null;
                        } else {
                            ne1Var7 = ne1Var5;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            value = wg3.getValue(tg3.m, kk0Var, 6);
                        } else {
                            value = rg3Var2;
                        }
                        i12 = i3;
                        if ((i2 & Uuid.SIZE_BITS) != 0) {
                            i13 = i10;
                            i14 = 2;
                            cj2 cj2VarM181xeb8e9a2e11111111111 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                            kk0Var = kk0Var;
                            cj2Var2 = cj2VarM181xeb8e9a2e11111111111;
                            i3 = i12 & (-29360129);
                        } else {
                            i13 = i10;
                            i14 = 2;
                            i3 = i12;
                        }
                        cVar4 = cVar3;
                        if (i13 != 0) {
                            gh2Var3 = null;
                        } else {
                            gh2Var3 = gh2Var;
                        }
                        rg3Var3 = value;
                    }
                    kk0Var.s();
                    int i1111117 = i3 >> 3;
                    qs0 qs0Var111111 = (qs0) cj2Var2;
                    hq3.m211x54dd086a(z, je1Var, d.f(we3.b(cVar4, false, fl1.I), 56.0f, 0.0f, i14).then(d.a), false, rg3Var3, ((re0) qs0Var111111.containerColor(z, kk0Var, (i1111117 & 14) | ((i3 >> 18) & 112)).getValue()).a, 0L, 0.0f, 0.0f, (iw) null, gh2Var3, (ne1) zg0.rememberComposableLambda(191488423, true, new rj2(ne1Var6, qs0Var111111, z, ne1Var7, ne1Var), kk0Var, 54), (ck0) kk0Var, (i1111117 & 126) | ((i3 >> 6) & 57344), ((i3 >> 24) & 14) | 48, 968);
                    rg3Var4 = rg3Var3;
                    gh2Var4 = gh2Var3;
                    cj2Var3 = qs0Var111111;
                    cVar5 = cVar4;
                    ne1Var8 = ne1Var6;
                    ne1Var9 = ne1Var7;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new yb(ne1Var, z, je1Var, cVar5, ne1Var8, ne1Var9, rg3Var4, cj2Var3, gh2Var4, i, i2));
                }
            }
            i3 |= 196608;
            ne1Var5 = ne1Var3;
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    rg3Var2 = rg3Var;
                    if (kk0Var.h(rg3Var2)) {
                    }
                    i3 |= i15;
                } else {
                    rg3Var2 = rg3Var;
                }
                i3 |= i15;
            } else {
                rg3Var2 = rg3Var;
            }
            if ((12582912 & i) == 0) {
                if ((i2 & Uuid.SIZE_BITS) == 0) {
                    cj2Var2 = cj2Var;
                    if (kk0Var.h(cj2Var2)) {
                    }
                    i3 |= i16;
                } else {
                    cj2Var2 = cj2Var;
                }
                i3 |= i16;
            } else {
                cj2Var2 = cj2Var;
            }
            i10 = i2 & FontInfo.NUMBER_OF_CHAR_CODES;
            if (i10 != 0) {
                if ((i & 100663296) == 0) {
                    gh2Var2 = gh2Var;
                    if (kk0Var.h(gh2Var2)) {
                        i11 = 67108864;
                    } else {
                        i11 = 33554432;
                    }
                    i3 |= i11;
                }
                if ((i3 & 38347923) == 38347922) {
                    kk0Var.X();
                    if ((i & 1) != 0) {
                        if (i4 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i6 != 0) {
                            ne1Var6 = null;
                        } else {
                            ne1Var6 = ne1Var4;
                        }
                        if (i8 != 0) {
                            ne1Var7 = null;
                        } else {
                            ne1Var7 = ne1Var5;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            value = wg3.getValue(tg3.m, kk0Var, 6);
                        } else {
                            value = rg3Var2;
                        }
                        i12 = i3;
                        if ((i2 & Uuid.SIZE_BITS) != 0) {
                            i13 = i10;
                            i14 = 2;
                            cj2 cj2VarM181xeb8e9a2e11111111112 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                            kk0Var = kk0Var;
                            cj2Var2 = cj2VarM181xeb8e9a2e11111111112;
                            i3 = i12 & (-29360129);
                        } else {
                            i13 = i10;
                            i14 = 2;
                            i3 = i12;
                        }
                        cVar4 = cVar3;
                        if (i13 != 0) {
                            gh2Var3 = null;
                        } else {
                            gh2Var3 = gh2Var;
                        }
                        rg3Var3 = value;
                    } else {
                        if (i4 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i6 != 0) {
                            ne1Var6 = null;
                        } else {
                            ne1Var6 = ne1Var4;
                        }
                        if (i8 != 0) {
                            ne1Var7 = null;
                        } else {
                            ne1Var7 = ne1Var5;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            value = wg3.getValue(tg3.m, kk0Var, 6);
                        } else {
                            value = rg3Var2;
                        }
                        i12 = i3;
                        if ((i2 & Uuid.SIZE_BITS) != 0) {
                            i13 = i10;
                            i14 = 2;
                            cj2 cj2VarM181xeb8e9a2e11111111113 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                            kk0Var = kk0Var;
                            cj2Var2 = cj2VarM181xeb8e9a2e11111111113;
                            i3 = i12 & (-29360129);
                        } else {
                            i13 = i10;
                            i14 = 2;
                            i3 = i12;
                        }
                        cVar4 = cVar3;
                        if (i13 != 0) {
                            gh2Var3 = null;
                        } else {
                            gh2Var3 = gh2Var;
                        }
                        rg3Var3 = value;
                    }
                    kk0Var.s();
                    int i1111118 = i3 >> 3;
                    qs0 qs0Var111112 = (qs0) cj2Var2;
                    hq3.m211x54dd086a(z, je1Var, d.f(we3.b(cVar4, false, fl1.I), 56.0f, 0.0f, i14).then(d.a), false, rg3Var3, ((re0) qs0Var111112.containerColor(z, kk0Var, (i1111118 & 14) | ((i3 >> 18) & 112)).getValue()).a, 0L, 0.0f, 0.0f, (iw) null, gh2Var3, (ne1) zg0.rememberComposableLambda(191488423, true, new rj2(ne1Var6, qs0Var111112, z, ne1Var7, ne1Var), kk0Var, 54), (ck0) kk0Var, (i1111118 & 126) | ((i3 >> 6) & 57344), ((i3 >> 24) & 14) | 48, 968);
                    rg3Var4 = rg3Var3;
                    gh2Var4 = gh2Var3;
                    cj2Var3 = qs0Var111112;
                    cVar5 = cVar4;
                    ne1Var8 = ne1Var6;
                    ne1Var9 = ne1Var7;
                } else {
                    kk0Var.X();
                    if ((i & 1) != 0) {
                        if (i4 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i6 != 0) {
                            ne1Var6 = null;
                        } else {
                            ne1Var6 = ne1Var4;
                        }
                        if (i8 != 0) {
                            ne1Var7 = null;
                        } else {
                            ne1Var7 = ne1Var5;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            value = wg3.getValue(tg3.m, kk0Var, 6);
                        } else {
                            value = rg3Var2;
                        }
                        i12 = i3;
                        if ((i2 & Uuid.SIZE_BITS) != 0) {
                            i13 = i10;
                            i14 = 2;
                            cj2 cj2VarM181xeb8e9a2e11111111114 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                            kk0Var = kk0Var;
                            cj2Var2 = cj2VarM181xeb8e9a2e11111111114;
                            i3 = i12 & (-29360129);
                        } else {
                            i13 = i10;
                            i14 = 2;
                            i3 = i12;
                        }
                        cVar4 = cVar3;
                        if (i13 != 0) {
                            gh2Var3 = null;
                        } else {
                            gh2Var3 = gh2Var;
                        }
                        rg3Var3 = value;
                    } else {
                        if (i4 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i6 != 0) {
                            ne1Var6 = null;
                        } else {
                            ne1Var6 = ne1Var4;
                        }
                        if (i8 != 0) {
                            ne1Var7 = null;
                        } else {
                            ne1Var7 = ne1Var5;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            value = wg3.getValue(tg3.m, kk0Var, 6);
                        } else {
                            value = rg3Var2;
                        }
                        i12 = i3;
                        if ((i2 & Uuid.SIZE_BITS) != 0) {
                            i13 = i10;
                            i14 = 2;
                            cj2 cj2VarM181xeb8e9a2e11111111115 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                            kk0Var = kk0Var;
                            cj2Var2 = cj2VarM181xeb8e9a2e11111111115;
                            i3 = i12 & (-29360129);
                        } else {
                            i13 = i10;
                            i14 = 2;
                            i3 = i12;
                        }
                        cVar4 = cVar3;
                        if (i13 != 0) {
                            gh2Var3 = null;
                        } else {
                            gh2Var3 = gh2Var;
                        }
                        rg3Var3 = value;
                    }
                    kk0Var.s();
                    int i1111119 = i3 >> 3;
                    qs0 qs0Var111113 = (qs0) cj2Var2;
                    hq3.m211x54dd086a(z, je1Var, d.f(we3.b(cVar4, false, fl1.I), 56.0f, 0.0f, i14).then(d.a), false, rg3Var3, ((re0) qs0Var111113.containerColor(z, kk0Var, (i1111119 & 14) | ((i3 >> 18) & 112)).getValue()).a, 0L, 0.0f, 0.0f, (iw) null, gh2Var3, (ne1) zg0.rememberComposableLambda(191488423, true, new rj2(ne1Var6, qs0Var111113, z, ne1Var7, ne1Var), kk0Var, 54), (ck0) kk0Var, (i1111119 & 126) | ((i3 >> 6) & 57344), ((i3 >> 24) & 14) | 48, 968);
                    rg3Var4 = rg3Var3;
                    gh2Var4 = gh2Var3;
                    cj2Var3 = qs0Var111113;
                    cVar5 = cVar4;
                    ne1Var8 = ne1Var6;
                    ne1Var9 = ne1Var7;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new yb(ne1Var, z, je1Var, cVar5, ne1Var8, ne1Var9, rg3Var4, cj2Var3, gh2Var4, i, i2));
                }
            }
            i3 |= 100663296;
            gh2Var2 = gh2Var;
            if ((i3 & 38347923) == 38347922) {
                kk0Var.X();
                if ((i & 1) != 0) {
                    if (i4 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i6 != 0) {
                        ne1Var6 = null;
                    } else {
                        ne1Var6 = ne1Var4;
                    }
                    if (i8 != 0) {
                        ne1Var7 = null;
                    } else {
                        ne1Var7 = ne1Var5;
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        value = wg3.getValue(tg3.m, kk0Var, 6);
                    } else {
                        value = rg3Var2;
                    }
                    i12 = i3;
                    if ((i2 & Uuid.SIZE_BITS) != 0) {
                        i13 = i10;
                        i14 = 2;
                        cj2 cj2VarM181xeb8e9a2e11111111116 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                        kk0Var = kk0Var;
                        cj2Var2 = cj2VarM181xeb8e9a2e11111111116;
                        i3 = i12 & (-29360129);
                    } else {
                        i13 = i10;
                        i14 = 2;
                        i3 = i12;
                    }
                    cVar4 = cVar3;
                    if (i13 != 0) {
                        gh2Var3 = null;
                    } else {
                        gh2Var3 = gh2Var;
                    }
                    rg3Var3 = value;
                } else {
                    if (i4 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i6 != 0) {
                        ne1Var6 = null;
                    } else {
                        ne1Var6 = ne1Var4;
                    }
                    if (i8 != 0) {
                        ne1Var7 = null;
                    } else {
                        ne1Var7 = ne1Var5;
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        value = wg3.getValue(tg3.m, kk0Var, 6);
                    } else {
                        value = rg3Var2;
                    }
                    i12 = i3;
                    if ((i2 & Uuid.SIZE_BITS) != 0) {
                        i13 = i10;
                        i14 = 2;
                        cj2 cj2VarM181xeb8e9a2e11111111117 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                        kk0Var = kk0Var;
                        cj2Var2 = cj2VarM181xeb8e9a2e11111111117;
                        i3 = i12 & (-29360129);
                    } else {
                        i13 = i10;
                        i14 = 2;
                        i3 = i12;
                    }
                    cVar4 = cVar3;
                    if (i13 != 0) {
                        gh2Var3 = null;
                    } else {
                        gh2Var3 = gh2Var;
                    }
                    rg3Var3 = value;
                }
                kk0Var.s();
                int i11111110 = i3 >> 3;
                qs0 qs0Var111114 = (qs0) cj2Var2;
                hq3.m211x54dd086a(z, je1Var, d.f(we3.b(cVar4, false, fl1.I), 56.0f, 0.0f, i14).then(d.a), false, rg3Var3, ((re0) qs0Var111114.containerColor(z, kk0Var, (i11111110 & 14) | ((i3 >> 18) & 112)).getValue()).a, 0L, 0.0f, 0.0f, (iw) null, gh2Var3, (ne1) zg0.rememberComposableLambda(191488423, true, new rj2(ne1Var6, qs0Var111114, z, ne1Var7, ne1Var), kk0Var, 54), (ck0) kk0Var, (i11111110 & 126) | ((i3 >> 6) & 57344), ((i3 >> 24) & 14) | 48, 968);
                rg3Var4 = rg3Var3;
                gh2Var4 = gh2Var3;
                cj2Var3 = qs0Var111114;
                cVar5 = cVar4;
                ne1Var8 = ne1Var6;
                ne1Var9 = ne1Var7;
            } else {
                kk0Var.X();
                if ((i & 1) != 0) {
                    if (i4 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i6 != 0) {
                        ne1Var6 = null;
                    } else {
                        ne1Var6 = ne1Var4;
                    }
                    if (i8 != 0) {
                        ne1Var7 = null;
                    } else {
                        ne1Var7 = ne1Var5;
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        value = wg3.getValue(tg3.m, kk0Var, 6);
                    } else {
                        value = rg3Var2;
                    }
                    i12 = i3;
                    if ((i2 & Uuid.SIZE_BITS) != 0) {
                        i13 = i10;
                        i14 = 2;
                        cj2 cj2VarM181xeb8e9a2e11111111118 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                        kk0Var = kk0Var;
                        cj2Var2 = cj2VarM181xeb8e9a2e11111111118;
                        i3 = i12 & (-29360129);
                    } else {
                        i13 = i10;
                        i14 = 2;
                        i3 = i12;
                    }
                    cVar4 = cVar3;
                    if (i13 != 0) {
                        gh2Var3 = null;
                    } else {
                        gh2Var3 = gh2Var;
                    }
                    rg3Var3 = value;
                } else {
                    if (i4 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i6 != 0) {
                        ne1Var6 = null;
                    } else {
                        ne1Var6 = ne1Var4;
                    }
                    if (i8 != 0) {
                        ne1Var7 = null;
                    } else {
                        ne1Var7 = ne1Var5;
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        value = wg3.getValue(tg3.m, kk0Var, 6);
                    } else {
                        value = rg3Var2;
                    }
                    i12 = i3;
                    if ((i2 & Uuid.SIZE_BITS) != 0) {
                        i13 = i10;
                        i14 = 2;
                        cj2 cj2VarM181xeb8e9a2e11111111119 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                        kk0Var = kk0Var;
                        cj2Var2 = cj2VarM181xeb8e9a2e11111111119;
                        i3 = i12 & (-29360129);
                    } else {
                        i13 = i10;
                        i14 = 2;
                        i3 = i12;
                    }
                    cVar4 = cVar3;
                    if (i13 != 0) {
                        gh2Var3 = null;
                    } else {
                        gh2Var3 = gh2Var;
                    }
                    rg3Var3 = value;
                }
                kk0Var.s();
                int i11111111 = i3 >> 3;
                qs0 qs0Var111115 = (qs0) cj2Var2;
                hq3.m211x54dd086a(z, je1Var, d.f(we3.b(cVar4, false, fl1.I), 56.0f, 0.0f, i14).then(d.a), false, rg3Var3, ((re0) qs0Var111115.containerColor(z, kk0Var, (i11111111 & 14) | ((i3 >> 18) & 112)).getValue()).a, 0L, 0.0f, 0.0f, (iw) null, gh2Var3, (ne1) zg0.rememberComposableLambda(191488423, true, new rj2(ne1Var6, qs0Var111115, z, ne1Var7, ne1Var), kk0Var, 54), (ck0) kk0Var, (i11111111 & 126) | ((i3 >> 6) & 57344), ((i3 >> 24) & 14) | 48, 968);
                rg3Var4 = rg3Var3;
                gh2Var4 = gh2Var3;
                cj2Var3 = qs0Var111115;
                cVar5 = cVar4;
                ne1Var8 = ne1Var6;
                ne1Var9 = ne1Var7;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new yb(ne1Var, z, je1Var, cVar5, ne1Var8, ne1Var9, rg3Var4, cj2Var3, gh2Var4, i, i2));
            }
        }
        i3 |= 24576;
        ne1Var4 = ne1Var2;
        i8 = i2 & 32;
        if (i8 != 0) {
            if ((196608 & i) == 0) {
                ne1Var5 = ne1Var3;
                if (kk0Var.j(ne1Var5)) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i3 |= i9;
            }
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    rg3Var2 = rg3Var;
                    if (kk0Var.h(rg3Var2)) {
                    }
                    i3 |= i15;
                } else {
                    rg3Var2 = rg3Var;
                }
                i3 |= i15;
            } else {
                rg3Var2 = rg3Var;
            }
            if ((12582912 & i) == 0) {
                if ((i2 & Uuid.SIZE_BITS) == 0) {
                    cj2Var2 = cj2Var;
                    if (kk0Var.h(cj2Var2)) {
                    }
                    i3 |= i16;
                } else {
                    cj2Var2 = cj2Var;
                }
                i3 |= i16;
            } else {
                cj2Var2 = cj2Var;
            }
            i10 = i2 & FontInfo.NUMBER_OF_CHAR_CODES;
            if (i10 != 0) {
                if ((i & 100663296) == 0) {
                    gh2Var2 = gh2Var;
                    if (kk0Var.h(gh2Var2)) {
                        i11 = 67108864;
                    } else {
                        i11 = 33554432;
                    }
                    i3 |= i11;
                }
                if ((i3 & 38347923) == 38347922) {
                    kk0Var.X();
                    if ((i & 1) != 0) {
                        if (i4 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i6 != 0) {
                            ne1Var6 = null;
                        } else {
                            ne1Var6 = ne1Var4;
                        }
                        if (i8 != 0) {
                            ne1Var7 = null;
                        } else {
                            ne1Var7 = ne1Var5;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            value = wg3.getValue(tg3.m, kk0Var, 6);
                        } else {
                            value = rg3Var2;
                        }
                        i12 = i3;
                        if ((i2 & Uuid.SIZE_BITS) != 0) {
                            i13 = i10;
                            i14 = 2;
                            cj2 cj2VarM181xeb8e9a2e111111111110 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                            kk0Var = kk0Var;
                            cj2Var2 = cj2VarM181xeb8e9a2e111111111110;
                            i3 = i12 & (-29360129);
                        } else {
                            i13 = i10;
                            i14 = 2;
                            i3 = i12;
                        }
                        cVar4 = cVar3;
                        if (i13 != 0) {
                            gh2Var3 = null;
                        } else {
                            gh2Var3 = gh2Var;
                        }
                        rg3Var3 = value;
                    } else {
                        if (i4 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i6 != 0) {
                            ne1Var6 = null;
                        } else {
                            ne1Var6 = ne1Var4;
                        }
                        if (i8 != 0) {
                            ne1Var7 = null;
                        } else {
                            ne1Var7 = ne1Var5;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            value = wg3.getValue(tg3.m, kk0Var, 6);
                        } else {
                            value = rg3Var2;
                        }
                        i12 = i3;
                        if ((i2 & Uuid.SIZE_BITS) != 0) {
                            i13 = i10;
                            i14 = 2;
                            cj2 cj2VarM181xeb8e9a2e111111111111 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                            kk0Var = kk0Var;
                            cj2Var2 = cj2VarM181xeb8e9a2e111111111111;
                            i3 = i12 & (-29360129);
                        } else {
                            i13 = i10;
                            i14 = 2;
                            i3 = i12;
                        }
                        cVar4 = cVar3;
                        if (i13 != 0) {
                            gh2Var3 = null;
                        } else {
                            gh2Var3 = gh2Var;
                        }
                        rg3Var3 = value;
                    }
                    kk0Var.s();
                    int i11111112 = i3 >> 3;
                    qs0 qs0Var111116 = (qs0) cj2Var2;
                    hq3.m211x54dd086a(z, je1Var, d.f(we3.b(cVar4, false, fl1.I), 56.0f, 0.0f, i14).then(d.a), false, rg3Var3, ((re0) qs0Var111116.containerColor(z, kk0Var, (i11111112 & 14) | ((i3 >> 18) & 112)).getValue()).a, 0L, 0.0f, 0.0f, (iw) null, gh2Var3, (ne1) zg0.rememberComposableLambda(191488423, true, new rj2(ne1Var6, qs0Var111116, z, ne1Var7, ne1Var), kk0Var, 54), (ck0) kk0Var, (i11111112 & 126) | ((i3 >> 6) & 57344), ((i3 >> 24) & 14) | 48, 968);
                    rg3Var4 = rg3Var3;
                    gh2Var4 = gh2Var3;
                    cj2Var3 = qs0Var111116;
                    cVar5 = cVar4;
                    ne1Var8 = ne1Var6;
                    ne1Var9 = ne1Var7;
                } else {
                    kk0Var.X();
                    if ((i & 1) != 0) {
                        if (i4 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i6 != 0) {
                            ne1Var6 = null;
                        } else {
                            ne1Var6 = ne1Var4;
                        }
                        if (i8 != 0) {
                            ne1Var7 = null;
                        } else {
                            ne1Var7 = ne1Var5;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            value = wg3.getValue(tg3.m, kk0Var, 6);
                        } else {
                            value = rg3Var2;
                        }
                        i12 = i3;
                        if ((i2 & Uuid.SIZE_BITS) != 0) {
                            i13 = i10;
                            i14 = 2;
                            cj2 cj2VarM181xeb8e9a2e111111111112 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                            kk0Var = kk0Var;
                            cj2Var2 = cj2VarM181xeb8e9a2e111111111112;
                            i3 = i12 & (-29360129);
                        } else {
                            i13 = i10;
                            i14 = 2;
                            i3 = i12;
                        }
                        cVar4 = cVar3;
                        if (i13 != 0) {
                            gh2Var3 = null;
                        } else {
                            gh2Var3 = gh2Var;
                        }
                        rg3Var3 = value;
                    } else {
                        if (i4 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i6 != 0) {
                            ne1Var6 = null;
                        } else {
                            ne1Var6 = ne1Var4;
                        }
                        if (i8 != 0) {
                            ne1Var7 = null;
                        } else {
                            ne1Var7 = ne1Var5;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            value = wg3.getValue(tg3.m, kk0Var, 6);
                        } else {
                            value = rg3Var2;
                        }
                        i12 = i3;
                        if ((i2 & Uuid.SIZE_BITS) != 0) {
                            i13 = i10;
                            i14 = 2;
                            cj2 cj2VarM181xeb8e9a2e111111111113 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                            kk0Var = kk0Var;
                            cj2Var2 = cj2VarM181xeb8e9a2e111111111113;
                            i3 = i12 & (-29360129);
                        } else {
                            i13 = i10;
                            i14 = 2;
                            i3 = i12;
                        }
                        cVar4 = cVar3;
                        if (i13 != 0) {
                            gh2Var3 = null;
                        } else {
                            gh2Var3 = gh2Var;
                        }
                        rg3Var3 = value;
                    }
                    kk0Var.s();
                    int i11111113 = i3 >> 3;
                    qs0 qs0Var111117 = (qs0) cj2Var2;
                    hq3.m211x54dd086a(z, je1Var, d.f(we3.b(cVar4, false, fl1.I), 56.0f, 0.0f, i14).then(d.a), false, rg3Var3, ((re0) qs0Var111117.containerColor(z, kk0Var, (i11111113 & 14) | ((i3 >> 18) & 112)).getValue()).a, 0L, 0.0f, 0.0f, (iw) null, gh2Var3, (ne1) zg0.rememberComposableLambda(191488423, true, new rj2(ne1Var6, qs0Var111117, z, ne1Var7, ne1Var), kk0Var, 54), (ck0) kk0Var, (i11111113 & 126) | ((i3 >> 6) & 57344), ((i3 >> 24) & 14) | 48, 968);
                    rg3Var4 = rg3Var3;
                    gh2Var4 = gh2Var3;
                    cj2Var3 = qs0Var111117;
                    cVar5 = cVar4;
                    ne1Var8 = ne1Var6;
                    ne1Var9 = ne1Var7;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new yb(ne1Var, z, je1Var, cVar5, ne1Var8, ne1Var9, rg3Var4, cj2Var3, gh2Var4, i, i2));
                }
            }
            i3 |= 100663296;
            gh2Var2 = gh2Var;
            if ((i3 & 38347923) == 38347922) {
                kk0Var.X();
                if ((i & 1) != 0) {
                    if (i4 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i6 != 0) {
                        ne1Var6 = null;
                    } else {
                        ne1Var6 = ne1Var4;
                    }
                    if (i8 != 0) {
                        ne1Var7 = null;
                    } else {
                        ne1Var7 = ne1Var5;
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        value = wg3.getValue(tg3.m, kk0Var, 6);
                    } else {
                        value = rg3Var2;
                    }
                    i12 = i3;
                    if ((i2 & Uuid.SIZE_BITS) != 0) {
                        i13 = i10;
                        i14 = 2;
                        cj2 cj2VarM181xeb8e9a2e111111111114 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                        kk0Var = kk0Var;
                        cj2Var2 = cj2VarM181xeb8e9a2e111111111114;
                        i3 = i12 & (-29360129);
                    } else {
                        i13 = i10;
                        i14 = 2;
                        i3 = i12;
                    }
                    cVar4 = cVar3;
                    if (i13 != 0) {
                        gh2Var3 = null;
                    } else {
                        gh2Var3 = gh2Var;
                    }
                    rg3Var3 = value;
                } else {
                    if (i4 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i6 != 0) {
                        ne1Var6 = null;
                    } else {
                        ne1Var6 = ne1Var4;
                    }
                    if (i8 != 0) {
                        ne1Var7 = null;
                    } else {
                        ne1Var7 = ne1Var5;
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        value = wg3.getValue(tg3.m, kk0Var, 6);
                    } else {
                        value = rg3Var2;
                    }
                    i12 = i3;
                    if ((i2 & Uuid.SIZE_BITS) != 0) {
                        i13 = i10;
                        i14 = 2;
                        cj2 cj2VarM181xeb8e9a2e111111111115 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                        kk0Var = kk0Var;
                        cj2Var2 = cj2VarM181xeb8e9a2e111111111115;
                        i3 = i12 & (-29360129);
                    } else {
                        i13 = i10;
                        i14 = 2;
                        i3 = i12;
                    }
                    cVar4 = cVar3;
                    if (i13 != 0) {
                        gh2Var3 = null;
                    } else {
                        gh2Var3 = gh2Var;
                    }
                    rg3Var3 = value;
                }
                kk0Var.s();
                int i11111114 = i3 >> 3;
                qs0 qs0Var111118 = (qs0) cj2Var2;
                hq3.m211x54dd086a(z, je1Var, d.f(we3.b(cVar4, false, fl1.I), 56.0f, 0.0f, i14).then(d.a), false, rg3Var3, ((re0) qs0Var111118.containerColor(z, kk0Var, (i11111114 & 14) | ((i3 >> 18) & 112)).getValue()).a, 0L, 0.0f, 0.0f, (iw) null, gh2Var3, (ne1) zg0.rememberComposableLambda(191488423, true, new rj2(ne1Var6, qs0Var111118, z, ne1Var7, ne1Var), kk0Var, 54), (ck0) kk0Var, (i11111114 & 126) | ((i3 >> 6) & 57344), ((i3 >> 24) & 14) | 48, 968);
                rg3Var4 = rg3Var3;
                gh2Var4 = gh2Var3;
                cj2Var3 = qs0Var111118;
                cVar5 = cVar4;
                ne1Var8 = ne1Var6;
                ne1Var9 = ne1Var7;
            } else {
                kk0Var.X();
                if ((i & 1) != 0) {
                    if (i4 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i6 != 0) {
                        ne1Var6 = null;
                    } else {
                        ne1Var6 = ne1Var4;
                    }
                    if (i8 != 0) {
                        ne1Var7 = null;
                    } else {
                        ne1Var7 = ne1Var5;
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        value = wg3.getValue(tg3.m, kk0Var, 6);
                    } else {
                        value = rg3Var2;
                    }
                    i12 = i3;
                    if ((i2 & Uuid.SIZE_BITS) != 0) {
                        i13 = i10;
                        i14 = 2;
                        cj2 cj2VarM181xeb8e9a2e111111111116 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                        kk0Var = kk0Var;
                        cj2Var2 = cj2VarM181xeb8e9a2e111111111116;
                        i3 = i12 & (-29360129);
                    } else {
                        i13 = i10;
                        i14 = 2;
                        i3 = i12;
                    }
                    cVar4 = cVar3;
                    if (i13 != 0) {
                        gh2Var3 = null;
                    } else {
                        gh2Var3 = gh2Var;
                    }
                    rg3Var3 = value;
                } else {
                    if (i4 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i6 != 0) {
                        ne1Var6 = null;
                    } else {
                        ne1Var6 = ne1Var4;
                    }
                    if (i8 != 0) {
                        ne1Var7 = null;
                    } else {
                        ne1Var7 = ne1Var5;
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        value = wg3.getValue(tg3.m, kk0Var, 6);
                    } else {
                        value = rg3Var2;
                    }
                    i12 = i3;
                    if ((i2 & Uuid.SIZE_BITS) != 0) {
                        i13 = i10;
                        i14 = 2;
                        cj2 cj2VarM181xeb8e9a2e111111111117 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                        kk0Var = kk0Var;
                        cj2Var2 = cj2VarM181xeb8e9a2e111111111117;
                        i3 = i12 & (-29360129);
                    } else {
                        i13 = i10;
                        i14 = 2;
                        i3 = i12;
                    }
                    cVar4 = cVar3;
                    if (i13 != 0) {
                        gh2Var3 = null;
                    } else {
                        gh2Var3 = gh2Var;
                    }
                    rg3Var3 = value;
                }
                kk0Var.s();
                int i11111115 = i3 >> 3;
                qs0 qs0Var111119 = (qs0) cj2Var2;
                hq3.m211x54dd086a(z, je1Var, d.f(we3.b(cVar4, false, fl1.I), 56.0f, 0.0f, i14).then(d.a), false, rg3Var3, ((re0) qs0Var111119.containerColor(z, kk0Var, (i11111115 & 14) | ((i3 >> 18) & 112)).getValue()).a, 0L, 0.0f, 0.0f, (iw) null, gh2Var3, (ne1) zg0.rememberComposableLambda(191488423, true, new rj2(ne1Var6, qs0Var111119, z, ne1Var7, ne1Var), kk0Var, 54), (ck0) kk0Var, (i11111115 & 126) | ((i3 >> 6) & 57344), ((i3 >> 24) & 14) | 48, 968);
                rg3Var4 = rg3Var3;
                gh2Var4 = gh2Var3;
                cj2Var3 = qs0Var111119;
                cVar5 = cVar4;
                ne1Var8 = ne1Var6;
                ne1Var9 = ne1Var7;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new yb(ne1Var, z, je1Var, cVar5, ne1Var8, ne1Var9, rg3Var4, cj2Var3, gh2Var4, i, i2));
            }
        }
        i3 |= 196608;
        ne1Var5 = ne1Var3;
        if ((1572864 & i) == 0) {
            if ((i2 & 64) == 0) {
                rg3Var2 = rg3Var;
                if (kk0Var.h(rg3Var2)) {
                }
                i3 |= i15;
            } else {
                rg3Var2 = rg3Var;
            }
            i3 |= i15;
        } else {
            rg3Var2 = rg3Var;
        }
        if ((12582912 & i) == 0) {
            if ((i2 & Uuid.SIZE_BITS) == 0) {
                cj2Var2 = cj2Var;
                if (kk0Var.h(cj2Var2)) {
                }
                i3 |= i16;
            } else {
                cj2Var2 = cj2Var;
            }
            i3 |= i16;
        } else {
            cj2Var2 = cj2Var;
        }
        i10 = i2 & FontInfo.NUMBER_OF_CHAR_CODES;
        if (i10 != 0) {
            if ((i & 100663296) == 0) {
                gh2Var2 = gh2Var;
                if (kk0Var.h(gh2Var2)) {
                    i11 = 67108864;
                } else {
                    i11 = 33554432;
                }
                i3 |= i11;
            }
            if ((i3 & 38347923) == 38347922) {
                kk0Var.X();
                if ((i & 1) != 0) {
                    if (i4 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i6 != 0) {
                        ne1Var6 = null;
                    } else {
                        ne1Var6 = ne1Var4;
                    }
                    if (i8 != 0) {
                        ne1Var7 = null;
                    } else {
                        ne1Var7 = ne1Var5;
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        value = wg3.getValue(tg3.m, kk0Var, 6);
                    } else {
                        value = rg3Var2;
                    }
                    i12 = i3;
                    if ((i2 & Uuid.SIZE_BITS) != 0) {
                        i13 = i10;
                        i14 = 2;
                        cj2 cj2VarM181xeb8e9a2e111111111118 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                        kk0Var = kk0Var;
                        cj2Var2 = cj2VarM181xeb8e9a2e111111111118;
                        i3 = i12 & (-29360129);
                    } else {
                        i13 = i10;
                        i14 = 2;
                        i3 = i12;
                    }
                    cVar4 = cVar3;
                    if (i13 != 0) {
                        gh2Var3 = null;
                    } else {
                        gh2Var3 = gh2Var;
                    }
                    rg3Var3 = value;
                } else {
                    if (i4 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i6 != 0) {
                        ne1Var6 = null;
                    } else {
                        ne1Var6 = ne1Var4;
                    }
                    if (i8 != 0) {
                        ne1Var7 = null;
                    } else {
                        ne1Var7 = ne1Var5;
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        value = wg3.getValue(tg3.m, kk0Var, 6);
                    } else {
                        value = rg3Var2;
                    }
                    i12 = i3;
                    if ((i2 & Uuid.SIZE_BITS) != 0) {
                        i13 = i10;
                        i14 = 2;
                        cj2 cj2VarM181xeb8e9a2e111111111119 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                        kk0Var = kk0Var;
                        cj2Var2 = cj2VarM181xeb8e9a2e111111111119;
                        i3 = i12 & (-29360129);
                    } else {
                        i13 = i10;
                        i14 = 2;
                        i3 = i12;
                    }
                    cVar4 = cVar3;
                    if (i13 != 0) {
                        gh2Var3 = null;
                    } else {
                        gh2Var3 = gh2Var;
                    }
                    rg3Var3 = value;
                }
                kk0Var.s();
                int i11111116 = i3 >> 3;
                qs0 qs0Var1111110 = (qs0) cj2Var2;
                hq3.m211x54dd086a(z, je1Var, d.f(we3.b(cVar4, false, fl1.I), 56.0f, 0.0f, i14).then(d.a), false, rg3Var3, ((re0) qs0Var1111110.containerColor(z, kk0Var, (i11111116 & 14) | ((i3 >> 18) & 112)).getValue()).a, 0L, 0.0f, 0.0f, (iw) null, gh2Var3, (ne1) zg0.rememberComposableLambda(191488423, true, new rj2(ne1Var6, qs0Var1111110, z, ne1Var7, ne1Var), kk0Var, 54), (ck0) kk0Var, (i11111116 & 126) | ((i3 >> 6) & 57344), ((i3 >> 24) & 14) | 48, 968);
                rg3Var4 = rg3Var3;
                gh2Var4 = gh2Var3;
                cj2Var3 = qs0Var1111110;
                cVar5 = cVar4;
                ne1Var8 = ne1Var6;
                ne1Var9 = ne1Var7;
            } else {
                kk0Var.X();
                if ((i & 1) != 0) {
                    if (i4 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i6 != 0) {
                        ne1Var6 = null;
                    } else {
                        ne1Var6 = ne1Var4;
                    }
                    if (i8 != 0) {
                        ne1Var7 = null;
                    } else {
                        ne1Var7 = ne1Var5;
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        value = wg3.getValue(tg3.m, kk0Var, 6);
                    } else {
                        value = rg3Var2;
                    }
                    i12 = i3;
                    if ((i2 & Uuid.SIZE_BITS) != 0) {
                        i13 = i10;
                        i14 = 2;
                        cj2 cj2VarM181xeb8e9a2e1111111111110 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                        kk0Var = kk0Var;
                        cj2Var2 = cj2VarM181xeb8e9a2e1111111111110;
                        i3 = i12 & (-29360129);
                    } else {
                        i13 = i10;
                        i14 = 2;
                        i3 = i12;
                    }
                    cVar4 = cVar3;
                    if (i13 != 0) {
                        gh2Var3 = null;
                    } else {
                        gh2Var3 = gh2Var;
                    }
                    rg3Var3 = value;
                } else {
                    if (i4 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i6 != 0) {
                        ne1Var6 = null;
                    } else {
                        ne1Var6 = ne1Var4;
                    }
                    if (i8 != 0) {
                        ne1Var7 = null;
                    } else {
                        ne1Var7 = ne1Var5;
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        value = wg3.getValue(tg3.m, kk0Var, 6);
                    } else {
                        value = rg3Var2;
                    }
                    i12 = i3;
                    if ((i2 & Uuid.SIZE_BITS) != 0) {
                        i13 = i10;
                        i14 = 2;
                        cj2 cj2VarM181xeb8e9a2e1111111111111 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                        kk0Var = kk0Var;
                        cj2Var2 = cj2VarM181xeb8e9a2e1111111111111;
                        i3 = i12 & (-29360129);
                    } else {
                        i13 = i10;
                        i14 = 2;
                        i3 = i12;
                    }
                    cVar4 = cVar3;
                    if (i13 != 0) {
                        gh2Var3 = null;
                    } else {
                        gh2Var3 = gh2Var;
                    }
                    rg3Var3 = value;
                }
                kk0Var.s();
                int i11111117 = i3 >> 3;
                qs0 qs0Var1111111 = (qs0) cj2Var2;
                hq3.m211x54dd086a(z, je1Var, d.f(we3.b(cVar4, false, fl1.I), 56.0f, 0.0f, i14).then(d.a), false, rg3Var3, ((re0) qs0Var1111111.containerColor(z, kk0Var, (i11111117 & 14) | ((i3 >> 18) & 112)).getValue()).a, 0L, 0.0f, 0.0f, (iw) null, gh2Var3, (ne1) zg0.rememberComposableLambda(191488423, true, new rj2(ne1Var6, qs0Var1111111, z, ne1Var7, ne1Var), kk0Var, 54), (ck0) kk0Var, (i11111117 & 126) | ((i3 >> 6) & 57344), ((i3 >> 24) & 14) | 48, 968);
                rg3Var4 = rg3Var3;
                gh2Var4 = gh2Var3;
                cj2Var3 = qs0Var1111111;
                cVar5 = cVar4;
                ne1Var8 = ne1Var6;
                ne1Var9 = ne1Var7;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new yb(ne1Var, z, je1Var, cVar5, ne1Var8, ne1Var9, rg3Var4, cj2Var3, gh2Var4, i, i2));
            }
        }
        i3 |= 100663296;
        gh2Var2 = gh2Var;
        if ((i3 & 38347923) == 38347922) {
            kk0Var.X();
            if ((i & 1) != 0) {
                if (i4 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if (i6 != 0) {
                    ne1Var6 = null;
                } else {
                    ne1Var6 = ne1Var4;
                }
                if (i8 != 0) {
                    ne1Var7 = null;
                } else {
                    ne1Var7 = ne1Var5;
                }
                if ((i2 & 64) != 0) {
                    i3 &= -3670017;
                    value = wg3.getValue(tg3.m, kk0Var, 6);
                } else {
                    value = rg3Var2;
                }
                i12 = i3;
                if ((i2 & Uuid.SIZE_BITS) != 0) {
                    i13 = i10;
                    i14 = 2;
                    cj2 cj2VarM181xeb8e9a2e1111111111112 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                    kk0Var = kk0Var;
                    cj2Var2 = cj2VarM181xeb8e9a2e1111111111112;
                    i3 = i12 & (-29360129);
                } else {
                    i13 = i10;
                    i14 = 2;
                    i3 = i12;
                }
                cVar4 = cVar3;
                if (i13 != 0) {
                    gh2Var3 = null;
                } else {
                    gh2Var3 = gh2Var;
                }
                rg3Var3 = value;
            } else {
                if (i4 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if (i6 != 0) {
                    ne1Var6 = null;
                } else {
                    ne1Var6 = ne1Var4;
                }
                if (i8 != 0) {
                    ne1Var7 = null;
                } else {
                    ne1Var7 = ne1Var5;
                }
                if ((i2 & 64) != 0) {
                    i3 &= -3670017;
                    value = wg3.getValue(tg3.m, kk0Var, 6);
                } else {
                    value = rg3Var2;
                }
                i12 = i3;
                if ((i2 & Uuid.SIZE_BITS) != 0) {
                    i13 = i10;
                    i14 = 2;
                    cj2 cj2VarM181xeb8e9a2e1111111111113 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                    kk0Var = kk0Var;
                    cj2Var2 = cj2VarM181xeb8e9a2e1111111111113;
                    i3 = i12 & (-29360129);
                } else {
                    i13 = i10;
                    i14 = 2;
                    i3 = i12;
                }
                cVar4 = cVar3;
                if (i13 != 0) {
                    gh2Var3 = null;
                } else {
                    gh2Var3 = gh2Var;
                }
                rg3Var3 = value;
            }
            kk0Var.s();
            int i11111118 = i3 >> 3;
            qs0 qs0Var1111112 = (qs0) cj2Var2;
            hq3.m211x54dd086a(z, je1Var, d.f(we3.b(cVar4, false, fl1.I), 56.0f, 0.0f, i14).then(d.a), false, rg3Var3, ((re0) qs0Var1111112.containerColor(z, kk0Var, (i11111118 & 14) | ((i3 >> 18) & 112)).getValue()).a, 0L, 0.0f, 0.0f, (iw) null, gh2Var3, (ne1) zg0.rememberComposableLambda(191488423, true, new rj2(ne1Var6, qs0Var1111112, z, ne1Var7, ne1Var), kk0Var, 54), (ck0) kk0Var, (i11111118 & 126) | ((i3 >> 6) & 57344), ((i3 >> 24) & 14) | 48, 968);
            rg3Var4 = rg3Var3;
            gh2Var4 = gh2Var3;
            cj2Var3 = qs0Var1111112;
            cVar5 = cVar4;
            ne1Var8 = ne1Var6;
            ne1Var9 = ne1Var7;
        } else {
            kk0Var.X();
            if ((i & 1) != 0) {
                if (i4 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if (i6 != 0) {
                    ne1Var6 = null;
                } else {
                    ne1Var6 = ne1Var4;
                }
                if (i8 != 0) {
                    ne1Var7 = null;
                } else {
                    ne1Var7 = ne1Var5;
                }
                if ((i2 & 64) != 0) {
                    i3 &= -3670017;
                    value = wg3.getValue(tg3.m, kk0Var, 6);
                } else {
                    value = rg3Var2;
                }
                i12 = i3;
                if ((i2 & Uuid.SIZE_BITS) != 0) {
                    i13 = i10;
                    i14 = 2;
                    cj2 cj2VarM181xeb8e9a2e1111111111114 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                    kk0Var = kk0Var;
                    cj2Var2 = cj2VarM181xeb8e9a2e1111111111114;
                    i3 = i12 & (-29360129);
                } else {
                    i13 = i10;
                    i14 = 2;
                    i3 = i12;
                }
                cVar4 = cVar3;
                if (i13 != 0) {
                    gh2Var3 = null;
                } else {
                    gh2Var3 = gh2Var;
                }
                rg3Var3 = value;
            } else {
                if (i4 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if (i6 != 0) {
                    ne1Var6 = null;
                } else {
                    ne1Var6 = ne1Var4;
                }
                if (i8 != 0) {
                    ne1Var7 = null;
                } else {
                    ne1Var7 = ne1Var5;
                }
                if ((i2 & 64) != 0) {
                    i3 &= -3670017;
                    value = wg3.getValue(tg3.m, kk0Var, 6);
                } else {
                    value = rg3Var2;
                }
                i12 = i3;
                if ((i2 & Uuid.SIZE_BITS) != 0) {
                    i13 = i10;
                    i14 = 2;
                    cj2 cj2VarM181xeb8e9a2e1111111111115 = dj2.a.m181xeb8e9a2e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 100663296, KotlinVersion.MAX_COMPONENT_VALUE);
                    kk0Var = kk0Var;
                    cj2Var2 = cj2VarM181xeb8e9a2e1111111111115;
                    i3 = i12 & (-29360129);
                } else {
                    i13 = i10;
                    i14 = 2;
                    i3 = i12;
                }
                cVar4 = cVar3;
                if (i13 != 0) {
                    gh2Var3 = null;
                } else {
                    gh2Var3 = gh2Var;
                }
                rg3Var3 = value;
            }
            kk0Var.s();
            int i11111119 = i3 >> 3;
            qs0 qs0Var1111113 = (qs0) cj2Var2;
            hq3.m211x54dd086a(z, je1Var, d.f(we3.b(cVar4, false, fl1.I), 56.0f, 0.0f, i14).then(d.a), false, rg3Var3, ((re0) qs0Var1111113.containerColor(z, kk0Var, (i11111119 & 14) | ((i3 >> 18) & 112)).getValue()).a, 0L, 0.0f, 0.0f, (iw) null, gh2Var3, (ne1) zg0.rememberComposableLambda(191488423, true, new rj2(ne1Var6, qs0Var1111113, z, ne1Var7, ne1Var), kk0Var, 54), (ck0) kk0Var, (i11111119 & 126) | ((i3 >> 6) & 57344), ((i3 >> 24) & 14) | 48, 968);
            rg3Var4 = rg3Var3;
            gh2Var4 = gh2Var3;
            cj2Var3 = qs0Var1111113;
            cVar5 = cVar4;
            ne1Var8 = ne1Var6;
            ne1Var9 = ne1Var7;
        }
        w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new yb(ne1Var, z, je1Var, cVar5, ne1Var8, ne1Var9, rg3Var4, cj2Var3, gh2Var4, i, i2));
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0115 A[PHI: r1 r3 r5 r6 r8 r12
  0x0115: PHI (r1v8 androidx.compose.ui.c) = (r1v5 androidx.compose.ui.c), (r1v13 androidx.compose.ui.c) binds: [B:116:0x014a, B:99:0x0114] A[DONT_GENERATE, DONT_INLINE]
  0x0115: PHI (r3v25 int) = (r3v17 int), (r3v28 int) binds: [B:116:0x014a, B:99:0x0114] A[DONT_GENERATE, DONT_INLINE]
  0x0115: PHI (r5v13 rg3) = (r5v3 rg3), (r5v2 rg3) binds: [B:116:0x014a, B:99:0x0114] A[DONT_GENERATE, DONT_INLINE]
  0x0115: PHI (r6v13 long) = (r6v7 long), (r6v6 long) binds: [B:116:0x014a, B:99:0x0114] A[DONT_GENERATE, DONT_INLINE]
  0x0115: PHI (r8v6 long) = (r8v3 long), (r8v2 long) binds: [B:116:0x014a, B:99:0x0114] A[DONT_GENERATE, DONT_INLINE]
  0x0115: PHI (r12v7 float) = (r12v3 float), (r12v2 float) binds: [B:116:0x014a, B:99:0x0114] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:102:0x011e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:103:0x0120  */
    /* JADX WARN: Code duplicated, block: B:104:0x0123  */
    /* JADX WARN: Code duplicated, block: B:106:0x0126  */
    /* JADX WARN: Code duplicated, block: B:109:0x012f  */
    /* JADX WARN: Code duplicated, block: B:112:0x0139  */
    /* JADX WARN: Code duplicated, block: B:114:0x0146  */
    /* JADX WARN: Code duplicated, block: B:117:0x014c  */
    /* JADX WARN: Code duplicated, block: B:120:0x016e  */
    /* JADX WARN: Code duplicated, block: B:122:0x0174  */
    /* JADX WARN: Code duplicated, block: B:126:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:28:0x004d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:31:0x0058  */
    /* JADX WARN: Code duplicated, block: B:34:0x005e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0064  */
    /* JADX WARN: Code duplicated, block: B:39:0x0068  */
    /* JADX WARN: Code duplicated, block: B:41:0x0070  */
    /* JADX WARN: Code duplicated, block: B:42:0x0073  */
    /* JADX WARN: Code duplicated, block: B:45:0x0079  */
    /* JADX WARN: Code duplicated, block: B:48:0x007f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0084  */
    /* JADX WARN: Code duplicated, block: B:52:0x0088  */
    /* JADX WARN: Code duplicated, block: B:54:0x0090  */
    /* JADX WARN: Code duplicated, block: B:55:0x0093  */
    /* JADX WARN: Code duplicated, block: B:59:0x009b  */
    /* JADX WARN: Code duplicated, block: B:61:0x009f  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:72:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:76:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:77:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f8  */
    /* JADX INFO: renamed from: PermanentDrawerSheet-afqeVBk, reason: not valid java name */
    public static final void m1825x2c3a8c59(c cVar, rg3 rg3Var, long j, long j2, float f, e eVar, oe1 oe1Var, ck0 ck0Var, int i, int i2) {
        c cVar2;
        int i3;
        rg3 rg3Var2;
        long standardContainerColor;
        long jM2x310ea166;
        int i4;
        float f2;
        int i5;
        e eVar2;
        int i6;
        c cVar3;
        int i7;
        c01 c01Var;
        rg3 rg3Var3;
        long j3;
        float f3;
        e windowInsets;
        String strM1830xa862b2cd;
        boolean zH;
        Object objP;
        kk0 kk0Var;
        e eVar3;
        rg3 rg3Var4;
        long j4;
        long j5;
        float f4;
        w33 w33VarV;
        int i8;
        kk0 kk0Var2 = (kk0) ck0Var;
        kk0Var2.c0(-1733353241);
        int i9 = i2 & 1;
        if (i9 != 0) {
            i3 = i | 6;
            cVar2 = cVar;
        } else if ((i & 6) == 0) {
            cVar2 = cVar;
            i3 = (kk0Var2.h(cVar2) ? 4 : 2) | i;
        } else {
            cVar2 = cVar;
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 == 0) {
            if ((i & 48) == 0) {
                rg3Var2 = rg3Var;
                i3 |= kk0Var2.h(rg3Var2) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                if ((i2 & 4) == 0) {
                    standardContainerColor = j;
                    if (kk0Var2.g(standardContainerColor)) {
                        i8 = FontInfo.NUMBER_OF_CHAR_CODES;
                    }
                    i3 |= i8;
                } else {
                    standardContainerColor = j;
                }
                i8 = Uuid.SIZE_BITS;
                i3 |= i8;
            } else {
                standardContainerColor = j;
            }
            if ((i & 3072) == 0) {
                if ((i2 & 8) == 0) {
                    jM2x310ea166 = j2;
                    int i11 = kk0Var2.g(jM2x310ea166) ? 2048 : 1024;
                    i3 |= i11;
                } else {
                    jM2x310ea166 = j2;
                }
                i3 |= i11;
            } else {
                jM2x310ea166 = j2;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    f2 = f;
                    if (kk0Var2.e(f2)) {
                        i5 = 16384;
                    } else {
                        i5 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                    }
                    i3 |= i5;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        eVar2 = eVar;
                        int i12 = kk0Var2.h(eVar2) ? 131072 : 65536;
                        i3 |= i12;
                    } else {
                        eVar2 = eVar;
                    }
                    i3 |= i12;
                } else {
                    eVar2 = eVar;
                }
                if ((i2 & 64) != 0) {
                    if ((i & 1572864) == 0) {
                        if (kk0Var2.j(oe1Var)) {
                            i6 = 1048576;
                        } else {
                            i6 = 524288;
                        }
                        i3 |= i6;
                    }
                    if ((599187 & i3) == 599186 || !kk0Var2.F()) {
                        kk0Var2.X();
                        if ((i & 1) != 0 || kk0Var2.D()) {
                            if (i9 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i10 != 0) {
                                rg3Var2 = k43.a;
                            }
                            i7 = i2 & 4;
                            c01Var = c01.a;
                            if (i7 != 0) {
                                standardContainerColor = c01Var.getStandardContainerColor(kk0Var2, 6);
                                i3 &= -897;
                            }
                            if ((i2 & 8) != 0) {
                                jM2x310ea166 = af0.m2x310ea166(standardContainerColor, kk0Var2, (i3 >> 6) & 14);
                                i3 &= -7169;
                            }
                            if (i4 != 0) {
                                f2 = 0.0f;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                                rg3Var3 = rg3Var2;
                                j3 = jM2x310ea166;
                                f3 = f2;
                                windowInsets = c01Var.getWindowInsets(kk0Var2, 6);
                            }
                            long j6 = standardContainerColor;
                            kk0Var2.s();
                            strM1830xa862b2cd = uo3.m1830xa862b2cd(R.string.navigation_menu, kk0Var2, 0);
                            zH = kk0Var2.h(strM1830xa862b2cd);
                            objP = kk0Var2.P();
                            if (zH || objP == Composer$Companion.getEmpty()) {
                                objP = new v7(strM1830xa862b2cd, 7);
                                kk0Var2.l0(objP);
                            }
                            int i13 = i3 << 6;
                            kk0Var = kk0Var2;
                            m1821xd59157b8(null, windowInsets, we3.b(cVar3, false, (le1) objP), rg3Var3, j6, j3, f3, oe1Var, kk0Var, 6 | ((i3 >> 12) & 112) | (i13 & 7168) | (57344 & i13) | (458752 & i13) | (i13 & 3670016) | ((i3 << 3) & 29360128), 0);
                            eVar3 = windowInsets;
                            rg3Var4 = rg3Var3;
                            j4 = j6;
                            j5 = j3;
                            f4 = f3;
                        } else {
                            kk0Var2.V();
                            if ((i2 & 4) != 0) {
                                i3 &= -897;
                            }
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                            cVar3 = cVar2;
                        }
                        rg3Var3 = rg3Var2;
                        j3 = jM2x310ea166;
                        f3 = f2;
                        windowInsets = eVar2;
                        long j7 = standardContainerColor;
                        kk0Var2.s();
                        strM1830xa862b2cd = uo3.m1830xa862b2cd(R.string.navigation_menu, kk0Var2, 0);
                        zH = kk0Var2.h(strM1830xa862b2cd);
                        objP = kk0Var2.P();
                        if (zH) {
                            objP = new v7(strM1830xa862b2cd, 7);
                            kk0Var2.l0(objP);
                        } else {
                            objP = new v7(strM1830xa862b2cd, 7);
                            kk0Var2.l0(objP);
                        }
                        int i14 = i3 << 6;
                        kk0Var = kk0Var2;
                        m1821xd59157b8(null, windowInsets, we3.b(cVar3, false, (le1) objP), rg3Var3, j7, j3, f3, oe1Var, kk0Var, 6 | ((i3 >> 12) & 112) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | (i14 & 3670016) | ((i3 << 3) & 29360128), 0);
                        eVar3 = windowInsets;
                        rg3Var4 = rg3Var3;
                        j4 = j7;
                        j5 = j3;
                        f4 = f3;
                    } else {
                        kk0Var2.V();
                        kk0Var = kk0Var2;
                        cVar3 = cVar2;
                        rg3Var4 = rg3Var2;
                        j4 = standardContainerColor;
                        j5 = jM2x310ea166;
                        f4 = f2;
                        eVar3 = eVar2;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new ej2(cVar3, rg3Var4, j4, j5, f4, eVar3, oe1Var, i, i2, 2));
                    }
                }
                i3 |= 1572864;
                if ((599187 & i3) == 599186) {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i9 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i10 != 0) {
                            rg3Var2 = k43.a;
                        }
                        i7 = i2 & 4;
                        c01Var = c01.a;
                        if (i7 != 0) {
                            standardContainerColor = c01Var.getStandardContainerColor(kk0Var2, 6);
                            i3 &= -897;
                        }
                        if ((i2 & 8) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(standardContainerColor, kk0Var2, (i3 >> 6) & 14);
                            i3 &= -7169;
                        }
                        if (i4 != 0) {
                            f2 = 0.0f;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            rg3Var3 = rg3Var2;
                            j3 = jM2x310ea166;
                            f3 = f2;
                            windowInsets = c01Var.getWindowInsets(kk0Var2, 6);
                        } else {
                            rg3Var3 = rg3Var2;
                            j3 = jM2x310ea166;
                            f3 = f2;
                            windowInsets = eVar2;
                        }
                    } else {
                        if (i9 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i10 != 0) {
                            rg3Var2 = k43.a;
                        }
                        i7 = i2 & 4;
                        c01Var = c01.a;
                        if (i7 != 0) {
                            standardContainerColor = c01Var.getStandardContainerColor(kk0Var2, 6);
                            i3 &= -897;
                        }
                        if ((i2 & 8) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(standardContainerColor, kk0Var2, (i3 >> 6) & 14);
                            i3 &= -7169;
                        }
                        if (i4 != 0) {
                            f2 = 0.0f;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            rg3Var3 = rg3Var2;
                            j3 = jM2x310ea166;
                            f3 = f2;
                            windowInsets = c01Var.getWindowInsets(kk0Var2, 6);
                        } else {
                            rg3Var3 = rg3Var2;
                            j3 = jM2x310ea166;
                            f3 = f2;
                            windowInsets = eVar2;
                        }
                    }
                    long j8 = standardContainerColor;
                    kk0Var2.s();
                    strM1830xa862b2cd = uo3.m1830xa862b2cd(R.string.navigation_menu, kk0Var2, 0);
                    zH = kk0Var2.h(strM1830xa862b2cd);
                    objP = kk0Var2.P();
                    if (zH) {
                        objP = new v7(strM1830xa862b2cd, 7);
                        kk0Var2.l0(objP);
                    } else {
                        objP = new v7(strM1830xa862b2cd, 7);
                        kk0Var2.l0(objP);
                    }
                    int i15 = i3 << 6;
                    kk0Var = kk0Var2;
                    m1821xd59157b8(null, windowInsets, we3.b(cVar3, false, (le1) objP), rg3Var3, j8, j3, f3, oe1Var, kk0Var, 6 | ((i3 >> 12) & 112) | (i15 & 7168) | (57344 & i15) | (458752 & i15) | (i15 & 3670016) | ((i3 << 3) & 29360128), 0);
                    eVar3 = windowInsets;
                    rg3Var4 = rg3Var3;
                    j4 = j8;
                    j5 = j3;
                    f4 = f3;
                } else {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i9 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i10 != 0) {
                            rg3Var2 = k43.a;
                        }
                        i7 = i2 & 4;
                        c01Var = c01.a;
                        if (i7 != 0) {
                            standardContainerColor = c01Var.getStandardContainerColor(kk0Var2, 6);
                            i3 &= -897;
                        }
                        if ((i2 & 8) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(standardContainerColor, kk0Var2, (i3 >> 6) & 14);
                            i3 &= -7169;
                        }
                        if (i4 != 0) {
                            f2 = 0.0f;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            rg3Var3 = rg3Var2;
                            j3 = jM2x310ea166;
                            f3 = f2;
                            windowInsets = c01Var.getWindowInsets(kk0Var2, 6);
                        } else {
                            rg3Var3 = rg3Var2;
                            j3 = jM2x310ea166;
                            f3 = f2;
                            windowInsets = eVar2;
                        }
                    } else {
                        if (i9 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i10 != 0) {
                            rg3Var2 = k43.a;
                        }
                        i7 = i2 & 4;
                        c01Var = c01.a;
                        if (i7 != 0) {
                            standardContainerColor = c01Var.getStandardContainerColor(kk0Var2, 6);
                            i3 &= -897;
                        }
                        if ((i2 & 8) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(standardContainerColor, kk0Var2, (i3 >> 6) & 14);
                            i3 &= -7169;
                        }
                        if (i4 != 0) {
                            f2 = 0.0f;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            rg3Var3 = rg3Var2;
                            j3 = jM2x310ea166;
                            f3 = f2;
                            windowInsets = c01Var.getWindowInsets(kk0Var2, 6);
                        } else {
                            rg3Var3 = rg3Var2;
                            j3 = jM2x310ea166;
                            f3 = f2;
                            windowInsets = eVar2;
                        }
                    }
                    long j9 = standardContainerColor;
                    kk0Var2.s();
                    strM1830xa862b2cd = uo3.m1830xa862b2cd(R.string.navigation_menu, kk0Var2, 0);
                    zH = kk0Var2.h(strM1830xa862b2cd);
                    objP = kk0Var2.P();
                    if (zH) {
                        objP = new v7(strM1830xa862b2cd, 7);
                        kk0Var2.l0(objP);
                    } else {
                        objP = new v7(strM1830xa862b2cd, 7);
                        kk0Var2.l0(objP);
                    }
                    int i16 = i3 << 6;
                    kk0Var = kk0Var2;
                    m1821xd59157b8(null, windowInsets, we3.b(cVar3, false, (le1) objP), rg3Var3, j9, j3, f3, oe1Var, kk0Var, 6 | ((i3 >> 12) & 112) | (i16 & 7168) | (57344 & i16) | (458752 & i16) | (i16 & 3670016) | ((i3 << 3) & 29360128), 0);
                    eVar3 = windowInsets;
                    rg3Var4 = rg3Var3;
                    j4 = j9;
                    j5 = j3;
                    f4 = f3;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new ej2(cVar3, rg3Var4, j4, j5, f4, eVar3, oe1Var, i, i2, 2));
                }
            }
            i3 |= 24576;
            f2 = f;
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0) {
                    eVar2 = eVar;
                    if (kk0Var2.h(eVar2)) {
                    }
                    i3 |= i12;
                } else {
                    eVar2 = eVar;
                }
                i3 |= i12;
            } else {
                eVar2 = eVar;
            }
            if ((i2 & 64) != 0) {
                if ((i & 1572864) == 0) {
                    if (kk0Var2.j(oe1Var)) {
                        i6 = 1048576;
                    } else {
                        i6 = 524288;
                    }
                    i3 |= i6;
                }
                if ((599187 & i3) == 599186) {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i9 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i10 != 0) {
                            rg3Var2 = k43.a;
                        }
                        i7 = i2 & 4;
                        c01Var = c01.a;
                        if (i7 != 0) {
                            standardContainerColor = c01Var.getStandardContainerColor(kk0Var2, 6);
                            i3 &= -897;
                        }
                        if ((i2 & 8) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(standardContainerColor, kk0Var2, (i3 >> 6) & 14);
                            i3 &= -7169;
                        }
                        if (i4 != 0) {
                            f2 = 0.0f;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            rg3Var3 = rg3Var2;
                            j3 = jM2x310ea166;
                            f3 = f2;
                            windowInsets = c01Var.getWindowInsets(kk0Var2, 6);
                        } else {
                            rg3Var3 = rg3Var2;
                            j3 = jM2x310ea166;
                            f3 = f2;
                            windowInsets = eVar2;
                        }
                    } else {
                        if (i9 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i10 != 0) {
                            rg3Var2 = k43.a;
                        }
                        i7 = i2 & 4;
                        c01Var = c01.a;
                        if (i7 != 0) {
                            standardContainerColor = c01Var.getStandardContainerColor(kk0Var2, 6);
                            i3 &= -897;
                        }
                        if ((i2 & 8) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(standardContainerColor, kk0Var2, (i3 >> 6) & 14);
                            i3 &= -7169;
                        }
                        if (i4 != 0) {
                            f2 = 0.0f;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            rg3Var3 = rg3Var2;
                            j3 = jM2x310ea166;
                            f3 = f2;
                            windowInsets = c01Var.getWindowInsets(kk0Var2, 6);
                        } else {
                            rg3Var3 = rg3Var2;
                            j3 = jM2x310ea166;
                            f3 = f2;
                            windowInsets = eVar2;
                        }
                    }
                    long j10 = standardContainerColor;
                    kk0Var2.s();
                    strM1830xa862b2cd = uo3.m1830xa862b2cd(R.string.navigation_menu, kk0Var2, 0);
                    zH = kk0Var2.h(strM1830xa862b2cd);
                    objP = kk0Var2.P();
                    if (zH) {
                        objP = new v7(strM1830xa862b2cd, 7);
                        kk0Var2.l0(objP);
                    } else {
                        objP = new v7(strM1830xa862b2cd, 7);
                        kk0Var2.l0(objP);
                    }
                    int i17 = i3 << 6;
                    kk0Var = kk0Var2;
                    m1821xd59157b8(null, windowInsets, we3.b(cVar3, false, (le1) objP), rg3Var3, j10, j3, f3, oe1Var, kk0Var, 6 | ((i3 >> 12) & 112) | (i17 & 7168) | (57344 & i17) | (458752 & i17) | (i17 & 3670016) | ((i3 << 3) & 29360128), 0);
                    eVar3 = windowInsets;
                    rg3Var4 = rg3Var3;
                    j4 = j10;
                    j5 = j3;
                    f4 = f3;
                } else {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i9 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i10 != 0) {
                            rg3Var2 = k43.a;
                        }
                        i7 = i2 & 4;
                        c01Var = c01.a;
                        if (i7 != 0) {
                            standardContainerColor = c01Var.getStandardContainerColor(kk0Var2, 6);
                            i3 &= -897;
                        }
                        if ((i2 & 8) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(standardContainerColor, kk0Var2, (i3 >> 6) & 14);
                            i3 &= -7169;
                        }
                        if (i4 != 0) {
                            f2 = 0.0f;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            rg3Var3 = rg3Var2;
                            j3 = jM2x310ea166;
                            f3 = f2;
                            windowInsets = c01Var.getWindowInsets(kk0Var2, 6);
                        } else {
                            rg3Var3 = rg3Var2;
                            j3 = jM2x310ea166;
                            f3 = f2;
                            windowInsets = eVar2;
                        }
                    } else {
                        if (i9 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i10 != 0) {
                            rg3Var2 = k43.a;
                        }
                        i7 = i2 & 4;
                        c01Var = c01.a;
                        if (i7 != 0) {
                            standardContainerColor = c01Var.getStandardContainerColor(kk0Var2, 6);
                            i3 &= -897;
                        }
                        if ((i2 & 8) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(standardContainerColor, kk0Var2, (i3 >> 6) & 14);
                            i3 &= -7169;
                        }
                        if (i4 != 0) {
                            f2 = 0.0f;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            rg3Var3 = rg3Var2;
                            j3 = jM2x310ea166;
                            f3 = f2;
                            windowInsets = c01Var.getWindowInsets(kk0Var2, 6);
                        } else {
                            rg3Var3 = rg3Var2;
                            j3 = jM2x310ea166;
                            f3 = f2;
                            windowInsets = eVar2;
                        }
                    }
                    long j11 = standardContainerColor;
                    kk0Var2.s();
                    strM1830xa862b2cd = uo3.m1830xa862b2cd(R.string.navigation_menu, kk0Var2, 0);
                    zH = kk0Var2.h(strM1830xa862b2cd);
                    objP = kk0Var2.P();
                    if (zH) {
                        objP = new v7(strM1830xa862b2cd, 7);
                        kk0Var2.l0(objP);
                    } else {
                        objP = new v7(strM1830xa862b2cd, 7);
                        kk0Var2.l0(objP);
                    }
                    int i18 = i3 << 6;
                    kk0Var = kk0Var2;
                    m1821xd59157b8(null, windowInsets, we3.b(cVar3, false, (le1) objP), rg3Var3, j11, j3, f3, oe1Var, kk0Var, 6 | ((i3 >> 12) & 112) | (i18 & 7168) | (57344 & i18) | (458752 & i18) | (i18 & 3670016) | ((i3 << 3) & 29360128), 0);
                    eVar3 = windowInsets;
                    rg3Var4 = rg3Var3;
                    j4 = j11;
                    j5 = j3;
                    f4 = f3;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new ej2(cVar3, rg3Var4, j4, j5, f4, eVar3, oe1Var, i, i2, 2));
                }
            }
            i3 |= 1572864;
            if ((599187 & i3) == 599186) {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i10 != 0) {
                        rg3Var2 = k43.a;
                    }
                    i7 = i2 & 4;
                    c01Var = c01.a;
                    if (i7 != 0) {
                        standardContainerColor = c01Var.getStandardContainerColor(kk0Var2, 6);
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(standardContainerColor, kk0Var2, (i3 >> 6) & 14);
                        i3 &= -7169;
                    }
                    if (i4 != 0) {
                        f2 = 0.0f;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        rg3Var3 = rg3Var2;
                        j3 = jM2x310ea166;
                        f3 = f2;
                        windowInsets = c01Var.getWindowInsets(kk0Var2, 6);
                    } else {
                        rg3Var3 = rg3Var2;
                        j3 = jM2x310ea166;
                        f3 = f2;
                        windowInsets = eVar2;
                    }
                } else {
                    if (i9 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i10 != 0) {
                        rg3Var2 = k43.a;
                    }
                    i7 = i2 & 4;
                    c01Var = c01.a;
                    if (i7 != 0) {
                        standardContainerColor = c01Var.getStandardContainerColor(kk0Var2, 6);
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(standardContainerColor, kk0Var2, (i3 >> 6) & 14);
                        i3 &= -7169;
                    }
                    if (i4 != 0) {
                        f2 = 0.0f;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        rg3Var3 = rg3Var2;
                        j3 = jM2x310ea166;
                        f3 = f2;
                        windowInsets = c01Var.getWindowInsets(kk0Var2, 6);
                    } else {
                        rg3Var3 = rg3Var2;
                        j3 = jM2x310ea166;
                        f3 = f2;
                        windowInsets = eVar2;
                    }
                }
                long j12 = standardContainerColor;
                kk0Var2.s();
                strM1830xa862b2cd = uo3.m1830xa862b2cd(R.string.navigation_menu, kk0Var2, 0);
                zH = kk0Var2.h(strM1830xa862b2cd);
                objP = kk0Var2.P();
                if (zH) {
                    objP = new v7(strM1830xa862b2cd, 7);
                    kk0Var2.l0(objP);
                } else {
                    objP = new v7(strM1830xa862b2cd, 7);
                    kk0Var2.l0(objP);
                }
                int i19 = i3 << 6;
                kk0Var = kk0Var2;
                m1821xd59157b8(null, windowInsets, we3.b(cVar3, false, (le1) objP), rg3Var3, j12, j3, f3, oe1Var, kk0Var, 6 | ((i3 >> 12) & 112) | (i19 & 7168) | (57344 & i19) | (458752 & i19) | (i19 & 3670016) | ((i3 << 3) & 29360128), 0);
                eVar3 = windowInsets;
                rg3Var4 = rg3Var3;
                j4 = j12;
                j5 = j3;
                f4 = f3;
            } else {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i10 != 0) {
                        rg3Var2 = k43.a;
                    }
                    i7 = i2 & 4;
                    c01Var = c01.a;
                    if (i7 != 0) {
                        standardContainerColor = c01Var.getStandardContainerColor(kk0Var2, 6);
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(standardContainerColor, kk0Var2, (i3 >> 6) & 14);
                        i3 &= -7169;
                    }
                    if (i4 != 0) {
                        f2 = 0.0f;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        rg3Var3 = rg3Var2;
                        j3 = jM2x310ea166;
                        f3 = f2;
                        windowInsets = c01Var.getWindowInsets(kk0Var2, 6);
                    } else {
                        rg3Var3 = rg3Var2;
                        j3 = jM2x310ea166;
                        f3 = f2;
                        windowInsets = eVar2;
                    }
                } else {
                    if (i9 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i10 != 0) {
                        rg3Var2 = k43.a;
                    }
                    i7 = i2 & 4;
                    c01Var = c01.a;
                    if (i7 != 0) {
                        standardContainerColor = c01Var.getStandardContainerColor(kk0Var2, 6);
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(standardContainerColor, kk0Var2, (i3 >> 6) & 14);
                        i3 &= -7169;
                    }
                    if (i4 != 0) {
                        f2 = 0.0f;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        rg3Var3 = rg3Var2;
                        j3 = jM2x310ea166;
                        f3 = f2;
                        windowInsets = c01Var.getWindowInsets(kk0Var2, 6);
                    } else {
                        rg3Var3 = rg3Var2;
                        j3 = jM2x310ea166;
                        f3 = f2;
                        windowInsets = eVar2;
                    }
                }
                long j13 = standardContainerColor;
                kk0Var2.s();
                strM1830xa862b2cd = uo3.m1830xa862b2cd(R.string.navigation_menu, kk0Var2, 0);
                zH = kk0Var2.h(strM1830xa862b2cd);
                objP = kk0Var2.P();
                if (zH) {
                    objP = new v7(strM1830xa862b2cd, 7);
                    kk0Var2.l0(objP);
                } else {
                    objP = new v7(strM1830xa862b2cd, 7);
                    kk0Var2.l0(objP);
                }
                int i110 = i3 << 6;
                kk0Var = kk0Var2;
                m1821xd59157b8(null, windowInsets, we3.b(cVar3, false, (le1) objP), rg3Var3, j13, j3, f3, oe1Var, kk0Var, 6 | ((i3 >> 12) & 112) | (i110 & 7168) | (57344 & i110) | (458752 & i110) | (i110 & 3670016) | ((i3 << 3) & 29360128), 0);
                eVar3 = windowInsets;
                rg3Var4 = rg3Var3;
                j4 = j13;
                j5 = j3;
                f4 = f3;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new ej2(cVar3, rg3Var4, j4, j5, f4, eVar3, oe1Var, i, i2, 2));
            }
        }
        i3 |= 48;
        rg3Var2 = rg3Var;
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                standardContainerColor = j;
                if (kk0Var2.g(standardContainerColor)) {
                    i8 = FontInfo.NUMBER_OF_CHAR_CODES;
                }
                i3 |= i8;
            } else {
                standardContainerColor = j;
            }
            i8 = Uuid.SIZE_BITS;
            i3 |= i8;
        } else {
            standardContainerColor = j;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                jM2x310ea166 = j2;
                if (kk0Var2.g(jM2x310ea166)) {
                }
                i3 |= i11;
            } else {
                jM2x310ea166 = j2;
            }
            i3 |= i11;
        } else {
            jM2x310ea166 = j2;
        }
        i4 = i2 & 16;
        if (i4 != 0) {
            if ((i & 24576) == 0) {
                f2 = f;
                if (kk0Var2.e(f2)) {
                    i5 = 16384;
                } else {
                    i5 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                }
                i3 |= i5;
            }
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0) {
                    eVar2 = eVar;
                    if (kk0Var2.h(eVar2)) {
                    }
                    i3 |= i12;
                } else {
                    eVar2 = eVar;
                }
                i3 |= i12;
            } else {
                eVar2 = eVar;
            }
            if ((i2 & 64) != 0) {
                if ((i & 1572864) == 0) {
                    if (kk0Var2.j(oe1Var)) {
                        i6 = 1048576;
                    } else {
                        i6 = 524288;
                    }
                    i3 |= i6;
                }
                if ((599187 & i3) == 599186) {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i9 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i10 != 0) {
                            rg3Var2 = k43.a;
                        }
                        i7 = i2 & 4;
                        c01Var = c01.a;
                        if (i7 != 0) {
                            standardContainerColor = c01Var.getStandardContainerColor(kk0Var2, 6);
                            i3 &= -897;
                        }
                        if ((i2 & 8) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(standardContainerColor, kk0Var2, (i3 >> 6) & 14);
                            i3 &= -7169;
                        }
                        if (i4 != 0) {
                            f2 = 0.0f;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            rg3Var3 = rg3Var2;
                            j3 = jM2x310ea166;
                            f3 = f2;
                            windowInsets = c01Var.getWindowInsets(kk0Var2, 6);
                        } else {
                            rg3Var3 = rg3Var2;
                            j3 = jM2x310ea166;
                            f3 = f2;
                            windowInsets = eVar2;
                        }
                    } else {
                        if (i9 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i10 != 0) {
                            rg3Var2 = k43.a;
                        }
                        i7 = i2 & 4;
                        c01Var = c01.a;
                        if (i7 != 0) {
                            standardContainerColor = c01Var.getStandardContainerColor(kk0Var2, 6);
                            i3 &= -897;
                        }
                        if ((i2 & 8) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(standardContainerColor, kk0Var2, (i3 >> 6) & 14);
                            i3 &= -7169;
                        }
                        if (i4 != 0) {
                            f2 = 0.0f;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            rg3Var3 = rg3Var2;
                            j3 = jM2x310ea166;
                            f3 = f2;
                            windowInsets = c01Var.getWindowInsets(kk0Var2, 6);
                        } else {
                            rg3Var3 = rg3Var2;
                            j3 = jM2x310ea166;
                            f3 = f2;
                            windowInsets = eVar2;
                        }
                    }
                    long j14 = standardContainerColor;
                    kk0Var2.s();
                    strM1830xa862b2cd = uo3.m1830xa862b2cd(R.string.navigation_menu, kk0Var2, 0);
                    zH = kk0Var2.h(strM1830xa862b2cd);
                    objP = kk0Var2.P();
                    if (zH) {
                        objP = new v7(strM1830xa862b2cd, 7);
                        kk0Var2.l0(objP);
                    } else {
                        objP = new v7(strM1830xa862b2cd, 7);
                        kk0Var2.l0(objP);
                    }
                    int i111 = i3 << 6;
                    kk0Var = kk0Var2;
                    m1821xd59157b8(null, windowInsets, we3.b(cVar3, false, (le1) objP), rg3Var3, j14, j3, f3, oe1Var, kk0Var, 6 | ((i3 >> 12) & 112) | (i111 & 7168) | (57344 & i111) | (458752 & i111) | (i111 & 3670016) | ((i3 << 3) & 29360128), 0);
                    eVar3 = windowInsets;
                    rg3Var4 = rg3Var3;
                    j4 = j14;
                    j5 = j3;
                    f4 = f3;
                } else {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i9 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i10 != 0) {
                            rg3Var2 = k43.a;
                        }
                        i7 = i2 & 4;
                        c01Var = c01.a;
                        if (i7 != 0) {
                            standardContainerColor = c01Var.getStandardContainerColor(kk0Var2, 6);
                            i3 &= -897;
                        }
                        if ((i2 & 8) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(standardContainerColor, kk0Var2, (i3 >> 6) & 14);
                            i3 &= -7169;
                        }
                        if (i4 != 0) {
                            f2 = 0.0f;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            rg3Var3 = rg3Var2;
                            j3 = jM2x310ea166;
                            f3 = f2;
                            windowInsets = c01Var.getWindowInsets(kk0Var2, 6);
                        } else {
                            rg3Var3 = rg3Var2;
                            j3 = jM2x310ea166;
                            f3 = f2;
                            windowInsets = eVar2;
                        }
                    } else {
                        if (i9 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i10 != 0) {
                            rg3Var2 = k43.a;
                        }
                        i7 = i2 & 4;
                        c01Var = c01.a;
                        if (i7 != 0) {
                            standardContainerColor = c01Var.getStandardContainerColor(kk0Var2, 6);
                            i3 &= -897;
                        }
                        if ((i2 & 8) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(standardContainerColor, kk0Var2, (i3 >> 6) & 14);
                            i3 &= -7169;
                        }
                        if (i4 != 0) {
                            f2 = 0.0f;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            rg3Var3 = rg3Var2;
                            j3 = jM2x310ea166;
                            f3 = f2;
                            windowInsets = c01Var.getWindowInsets(kk0Var2, 6);
                        } else {
                            rg3Var3 = rg3Var2;
                            j3 = jM2x310ea166;
                            f3 = f2;
                            windowInsets = eVar2;
                        }
                    }
                    long j15 = standardContainerColor;
                    kk0Var2.s();
                    strM1830xa862b2cd = uo3.m1830xa862b2cd(R.string.navigation_menu, kk0Var2, 0);
                    zH = kk0Var2.h(strM1830xa862b2cd);
                    objP = kk0Var2.P();
                    if (zH) {
                        objP = new v7(strM1830xa862b2cd, 7);
                        kk0Var2.l0(objP);
                    } else {
                        objP = new v7(strM1830xa862b2cd, 7);
                        kk0Var2.l0(objP);
                    }
                    int i112 = i3 << 6;
                    kk0Var = kk0Var2;
                    m1821xd59157b8(null, windowInsets, we3.b(cVar3, false, (le1) objP), rg3Var3, j15, j3, f3, oe1Var, kk0Var, 6 | ((i3 >> 12) & 112) | (i112 & 7168) | (57344 & i112) | (458752 & i112) | (i112 & 3670016) | ((i3 << 3) & 29360128), 0);
                    eVar3 = windowInsets;
                    rg3Var4 = rg3Var3;
                    j4 = j15;
                    j5 = j3;
                    f4 = f3;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new ej2(cVar3, rg3Var4, j4, j5, f4, eVar3, oe1Var, i, i2, 2));
                }
            }
            i3 |= 1572864;
            if ((599187 & i3) == 599186) {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i10 != 0) {
                        rg3Var2 = k43.a;
                    }
                    i7 = i2 & 4;
                    c01Var = c01.a;
                    if (i7 != 0) {
                        standardContainerColor = c01Var.getStandardContainerColor(kk0Var2, 6);
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(standardContainerColor, kk0Var2, (i3 >> 6) & 14);
                        i3 &= -7169;
                    }
                    if (i4 != 0) {
                        f2 = 0.0f;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        rg3Var3 = rg3Var2;
                        j3 = jM2x310ea166;
                        f3 = f2;
                        windowInsets = c01Var.getWindowInsets(kk0Var2, 6);
                    } else {
                        rg3Var3 = rg3Var2;
                        j3 = jM2x310ea166;
                        f3 = f2;
                        windowInsets = eVar2;
                    }
                } else {
                    if (i9 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i10 != 0) {
                        rg3Var2 = k43.a;
                    }
                    i7 = i2 & 4;
                    c01Var = c01.a;
                    if (i7 != 0) {
                        standardContainerColor = c01Var.getStandardContainerColor(kk0Var2, 6);
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(standardContainerColor, kk0Var2, (i3 >> 6) & 14);
                        i3 &= -7169;
                    }
                    if (i4 != 0) {
                        f2 = 0.0f;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        rg3Var3 = rg3Var2;
                        j3 = jM2x310ea166;
                        f3 = f2;
                        windowInsets = c01Var.getWindowInsets(kk0Var2, 6);
                    } else {
                        rg3Var3 = rg3Var2;
                        j3 = jM2x310ea166;
                        f3 = f2;
                        windowInsets = eVar2;
                    }
                }
                long j16 = standardContainerColor;
                kk0Var2.s();
                strM1830xa862b2cd = uo3.m1830xa862b2cd(R.string.navigation_menu, kk0Var2, 0);
                zH = kk0Var2.h(strM1830xa862b2cd);
                objP = kk0Var2.P();
                if (zH) {
                    objP = new v7(strM1830xa862b2cd, 7);
                    kk0Var2.l0(objP);
                } else {
                    objP = new v7(strM1830xa862b2cd, 7);
                    kk0Var2.l0(objP);
                }
                int i113 = i3 << 6;
                kk0Var = kk0Var2;
                m1821xd59157b8(null, windowInsets, we3.b(cVar3, false, (le1) objP), rg3Var3, j16, j3, f3, oe1Var, kk0Var, 6 | ((i3 >> 12) & 112) | (i113 & 7168) | (57344 & i113) | (458752 & i113) | (i113 & 3670016) | ((i3 << 3) & 29360128), 0);
                eVar3 = windowInsets;
                rg3Var4 = rg3Var3;
                j4 = j16;
                j5 = j3;
                f4 = f3;
            } else {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i10 != 0) {
                        rg3Var2 = k43.a;
                    }
                    i7 = i2 & 4;
                    c01Var = c01.a;
                    if (i7 != 0) {
                        standardContainerColor = c01Var.getStandardContainerColor(kk0Var2, 6);
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(standardContainerColor, kk0Var2, (i3 >> 6) & 14);
                        i3 &= -7169;
                    }
                    if (i4 != 0) {
                        f2 = 0.0f;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        rg3Var3 = rg3Var2;
                        j3 = jM2x310ea166;
                        f3 = f2;
                        windowInsets = c01Var.getWindowInsets(kk0Var2, 6);
                    } else {
                        rg3Var3 = rg3Var2;
                        j3 = jM2x310ea166;
                        f3 = f2;
                        windowInsets = eVar2;
                    }
                } else {
                    if (i9 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i10 != 0) {
                        rg3Var2 = k43.a;
                    }
                    i7 = i2 & 4;
                    c01Var = c01.a;
                    if (i7 != 0) {
                        standardContainerColor = c01Var.getStandardContainerColor(kk0Var2, 6);
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(standardContainerColor, kk0Var2, (i3 >> 6) & 14);
                        i3 &= -7169;
                    }
                    if (i4 != 0) {
                        f2 = 0.0f;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        rg3Var3 = rg3Var2;
                        j3 = jM2x310ea166;
                        f3 = f2;
                        windowInsets = c01Var.getWindowInsets(kk0Var2, 6);
                    } else {
                        rg3Var3 = rg3Var2;
                        j3 = jM2x310ea166;
                        f3 = f2;
                        windowInsets = eVar2;
                    }
                }
                long j17 = standardContainerColor;
                kk0Var2.s();
                strM1830xa862b2cd = uo3.m1830xa862b2cd(R.string.navigation_menu, kk0Var2, 0);
                zH = kk0Var2.h(strM1830xa862b2cd);
                objP = kk0Var2.P();
                if (zH) {
                    objP = new v7(strM1830xa862b2cd, 7);
                    kk0Var2.l0(objP);
                } else {
                    objP = new v7(strM1830xa862b2cd, 7);
                    kk0Var2.l0(objP);
                }
                int i114 = i3 << 6;
                kk0Var = kk0Var2;
                m1821xd59157b8(null, windowInsets, we3.b(cVar3, false, (le1) objP), rg3Var3, j17, j3, f3, oe1Var, kk0Var, 6 | ((i3 >> 12) & 112) | (i114 & 7168) | (57344 & i114) | (458752 & i114) | (i114 & 3670016) | ((i3 << 3) & 29360128), 0);
                eVar3 = windowInsets;
                rg3Var4 = rg3Var3;
                j4 = j17;
                j5 = j3;
                f4 = f3;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new ej2(cVar3, rg3Var4, j4, j5, f4, eVar3, oe1Var, i, i2, 2));
            }
        }
        i3 |= 24576;
        f2 = f;
        if ((196608 & i) == 0) {
            if ((i2 & 32) == 0) {
                eVar2 = eVar;
                if (kk0Var2.h(eVar2)) {
                }
                i3 |= i12;
            } else {
                eVar2 = eVar;
            }
            i3 |= i12;
        } else {
            eVar2 = eVar;
        }
        if ((i2 & 64) != 0) {
            if ((i & 1572864) == 0) {
                if (kk0Var2.j(oe1Var)) {
                    i6 = 1048576;
                } else {
                    i6 = 524288;
                }
                i3 |= i6;
            }
            if ((599187 & i3) == 599186) {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i10 != 0) {
                        rg3Var2 = k43.a;
                    }
                    i7 = i2 & 4;
                    c01Var = c01.a;
                    if (i7 != 0) {
                        standardContainerColor = c01Var.getStandardContainerColor(kk0Var2, 6);
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(standardContainerColor, kk0Var2, (i3 >> 6) & 14);
                        i3 &= -7169;
                    }
                    if (i4 != 0) {
                        f2 = 0.0f;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        rg3Var3 = rg3Var2;
                        j3 = jM2x310ea166;
                        f3 = f2;
                        windowInsets = c01Var.getWindowInsets(kk0Var2, 6);
                    } else {
                        rg3Var3 = rg3Var2;
                        j3 = jM2x310ea166;
                        f3 = f2;
                        windowInsets = eVar2;
                    }
                } else {
                    if (i9 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i10 != 0) {
                        rg3Var2 = k43.a;
                    }
                    i7 = i2 & 4;
                    c01Var = c01.a;
                    if (i7 != 0) {
                        standardContainerColor = c01Var.getStandardContainerColor(kk0Var2, 6);
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(standardContainerColor, kk0Var2, (i3 >> 6) & 14);
                        i3 &= -7169;
                    }
                    if (i4 != 0) {
                        f2 = 0.0f;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        rg3Var3 = rg3Var2;
                        j3 = jM2x310ea166;
                        f3 = f2;
                        windowInsets = c01Var.getWindowInsets(kk0Var2, 6);
                    } else {
                        rg3Var3 = rg3Var2;
                        j3 = jM2x310ea166;
                        f3 = f2;
                        windowInsets = eVar2;
                    }
                }
                long j18 = standardContainerColor;
                kk0Var2.s();
                strM1830xa862b2cd = uo3.m1830xa862b2cd(R.string.navigation_menu, kk0Var2, 0);
                zH = kk0Var2.h(strM1830xa862b2cd);
                objP = kk0Var2.P();
                if (zH) {
                    objP = new v7(strM1830xa862b2cd, 7);
                    kk0Var2.l0(objP);
                } else {
                    objP = new v7(strM1830xa862b2cd, 7);
                    kk0Var2.l0(objP);
                }
                int i115 = i3 << 6;
                kk0Var = kk0Var2;
                m1821xd59157b8(null, windowInsets, we3.b(cVar3, false, (le1) objP), rg3Var3, j18, j3, f3, oe1Var, kk0Var, 6 | ((i3 >> 12) & 112) | (i115 & 7168) | (57344 & i115) | (458752 & i115) | (i115 & 3670016) | ((i3 << 3) & 29360128), 0);
                eVar3 = windowInsets;
                rg3Var4 = rg3Var3;
                j4 = j18;
                j5 = j3;
                f4 = f3;
            } else {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i10 != 0) {
                        rg3Var2 = k43.a;
                    }
                    i7 = i2 & 4;
                    c01Var = c01.a;
                    if (i7 != 0) {
                        standardContainerColor = c01Var.getStandardContainerColor(kk0Var2, 6);
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(standardContainerColor, kk0Var2, (i3 >> 6) & 14);
                        i3 &= -7169;
                    }
                    if (i4 != 0) {
                        f2 = 0.0f;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        rg3Var3 = rg3Var2;
                        j3 = jM2x310ea166;
                        f3 = f2;
                        windowInsets = c01Var.getWindowInsets(kk0Var2, 6);
                    } else {
                        rg3Var3 = rg3Var2;
                        j3 = jM2x310ea166;
                        f3 = f2;
                        windowInsets = eVar2;
                    }
                } else {
                    if (i9 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i10 != 0) {
                        rg3Var2 = k43.a;
                    }
                    i7 = i2 & 4;
                    c01Var = c01.a;
                    if (i7 != 0) {
                        standardContainerColor = c01Var.getStandardContainerColor(kk0Var2, 6);
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(standardContainerColor, kk0Var2, (i3 >> 6) & 14);
                        i3 &= -7169;
                    }
                    if (i4 != 0) {
                        f2 = 0.0f;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        rg3Var3 = rg3Var2;
                        j3 = jM2x310ea166;
                        f3 = f2;
                        windowInsets = c01Var.getWindowInsets(kk0Var2, 6);
                    } else {
                        rg3Var3 = rg3Var2;
                        j3 = jM2x310ea166;
                        f3 = f2;
                        windowInsets = eVar2;
                    }
                }
                long j19 = standardContainerColor;
                kk0Var2.s();
                strM1830xa862b2cd = uo3.m1830xa862b2cd(R.string.navigation_menu, kk0Var2, 0);
                zH = kk0Var2.h(strM1830xa862b2cd);
                objP = kk0Var2.P();
                if (zH) {
                    objP = new v7(strM1830xa862b2cd, 7);
                    kk0Var2.l0(objP);
                } else {
                    objP = new v7(strM1830xa862b2cd, 7);
                    kk0Var2.l0(objP);
                }
                int i116 = i3 << 6;
                kk0Var = kk0Var2;
                m1821xd59157b8(null, windowInsets, we3.b(cVar3, false, (le1) objP), rg3Var3, j19, j3, f3, oe1Var, kk0Var, 6 | ((i3 >> 12) & 112) | (i116 & 7168) | (57344 & i116) | (458752 & i116) | (i116 & 3670016) | ((i3 << 3) & 29360128), 0);
                eVar3 = windowInsets;
                rg3Var4 = rg3Var3;
                j4 = j19;
                j5 = j3;
                f4 = f3;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new ej2(cVar3, rg3Var4, j4, j5, f4, eVar3, oe1Var, i, i2, 2));
            }
        }
        i3 |= 1572864;
        if ((599187 & i3) == 599186) {
            kk0Var2.X();
            if ((i & 1) != 0) {
                if (i9 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if (i10 != 0) {
                    rg3Var2 = k43.a;
                }
                i7 = i2 & 4;
                c01Var = c01.a;
                if (i7 != 0) {
                    standardContainerColor = c01Var.getStandardContainerColor(kk0Var2, 6);
                    i3 &= -897;
                }
                if ((i2 & 8) != 0) {
                    jM2x310ea166 = af0.m2x310ea166(standardContainerColor, kk0Var2, (i3 >> 6) & 14);
                    i3 &= -7169;
                }
                if (i4 != 0) {
                    f2 = 0.0f;
                }
                if ((i2 & 32) != 0) {
                    i3 &= -458753;
                    rg3Var3 = rg3Var2;
                    j3 = jM2x310ea166;
                    f3 = f2;
                    windowInsets = c01Var.getWindowInsets(kk0Var2, 6);
                } else {
                    rg3Var3 = rg3Var2;
                    j3 = jM2x310ea166;
                    f3 = f2;
                    windowInsets = eVar2;
                }
            } else {
                if (i9 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if (i10 != 0) {
                    rg3Var2 = k43.a;
                }
                i7 = i2 & 4;
                c01Var = c01.a;
                if (i7 != 0) {
                    standardContainerColor = c01Var.getStandardContainerColor(kk0Var2, 6);
                    i3 &= -897;
                }
                if ((i2 & 8) != 0) {
                    jM2x310ea166 = af0.m2x310ea166(standardContainerColor, kk0Var2, (i3 >> 6) & 14);
                    i3 &= -7169;
                }
                if (i4 != 0) {
                    f2 = 0.0f;
                }
                if ((i2 & 32) != 0) {
                    i3 &= -458753;
                    rg3Var3 = rg3Var2;
                    j3 = jM2x310ea166;
                    f3 = f2;
                    windowInsets = c01Var.getWindowInsets(kk0Var2, 6);
                } else {
                    rg3Var3 = rg3Var2;
                    j3 = jM2x310ea166;
                    f3 = f2;
                    windowInsets = eVar2;
                }
            }
            long j110 = standardContainerColor;
            kk0Var2.s();
            strM1830xa862b2cd = uo3.m1830xa862b2cd(R.string.navigation_menu, kk0Var2, 0);
            zH = kk0Var2.h(strM1830xa862b2cd);
            objP = kk0Var2.P();
            if (zH) {
                objP = new v7(strM1830xa862b2cd, 7);
                kk0Var2.l0(objP);
            } else {
                objP = new v7(strM1830xa862b2cd, 7);
                kk0Var2.l0(objP);
            }
            int i117 = i3 << 6;
            kk0Var = kk0Var2;
            m1821xd59157b8(null, windowInsets, we3.b(cVar3, false, (le1) objP), rg3Var3, j110, j3, f3, oe1Var, kk0Var, 6 | ((i3 >> 12) & 112) | (i117 & 7168) | (57344 & i117) | (458752 & i117) | (i117 & 3670016) | ((i3 << 3) & 29360128), 0);
            eVar3 = windowInsets;
            rg3Var4 = rg3Var3;
            j4 = j110;
            j5 = j3;
            f4 = f3;
        } else {
            kk0Var2.X();
            if ((i & 1) != 0) {
                if (i9 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if (i10 != 0) {
                    rg3Var2 = k43.a;
                }
                i7 = i2 & 4;
                c01Var = c01.a;
                if (i7 != 0) {
                    standardContainerColor = c01Var.getStandardContainerColor(kk0Var2, 6);
                    i3 &= -897;
                }
                if ((i2 & 8) != 0) {
                    jM2x310ea166 = af0.m2x310ea166(standardContainerColor, kk0Var2, (i3 >> 6) & 14);
                    i3 &= -7169;
                }
                if (i4 != 0) {
                    f2 = 0.0f;
                }
                if ((i2 & 32) != 0) {
                    i3 &= -458753;
                    rg3Var3 = rg3Var2;
                    j3 = jM2x310ea166;
                    f3 = f2;
                    windowInsets = c01Var.getWindowInsets(kk0Var2, 6);
                } else {
                    rg3Var3 = rg3Var2;
                    j3 = jM2x310ea166;
                    f3 = f2;
                    windowInsets = eVar2;
                }
            } else {
                if (i9 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if (i10 != 0) {
                    rg3Var2 = k43.a;
                }
                i7 = i2 & 4;
                c01Var = c01.a;
                if (i7 != 0) {
                    standardContainerColor = c01Var.getStandardContainerColor(kk0Var2, 6);
                    i3 &= -897;
                }
                if ((i2 & 8) != 0) {
                    jM2x310ea166 = af0.m2x310ea166(standardContainerColor, kk0Var2, (i3 >> 6) & 14);
                    i3 &= -7169;
                }
                if (i4 != 0) {
                    f2 = 0.0f;
                }
                if ((i2 & 32) != 0) {
                    i3 &= -458753;
                    rg3Var3 = rg3Var2;
                    j3 = jM2x310ea166;
                    f3 = f2;
                    windowInsets = c01Var.getWindowInsets(kk0Var2, 6);
                } else {
                    rg3Var3 = rg3Var2;
                    j3 = jM2x310ea166;
                    f3 = f2;
                    windowInsets = eVar2;
                }
            }
            long j111 = standardContainerColor;
            kk0Var2.s();
            strM1830xa862b2cd = uo3.m1830xa862b2cd(R.string.navigation_menu, kk0Var2, 0);
            zH = kk0Var2.h(strM1830xa862b2cd);
            objP = kk0Var2.P();
            if (zH) {
                objP = new v7(strM1830xa862b2cd, 7);
                kk0Var2.l0(objP);
            } else {
                objP = new v7(strM1830xa862b2cd, 7);
                kk0Var2.l0(objP);
            }
            int i118 = i3 << 6;
            kk0Var = kk0Var2;
            m1821xd59157b8(null, windowInsets, we3.b(cVar3, false, (le1) objP), rg3Var3, j111, j3, f3, oe1Var, kk0Var, 6 | ((i3 >> 12) & 112) | (i118 & 7168) | (57344 & i118) | (458752 & i118) | (i118 & 3670016) | ((i3 << 3) & 29360128), 0);
            eVar3 = windowInsets;
            rg3Var4 = rg3Var3;
            j4 = j111;
            j5 = j3;
            f4 = f3;
        }
        w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new ej2(cVar3, rg3Var4, j4, j5, f4, eVar3, oe1Var, i, i2, 2));
        }
    }

    public static final void PermanentNavigationDrawer(ne1 ne1Var, c cVar, ne1 ne1Var2, ck0 ck0Var, int i, int i2) {
        int i3;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(-276843608);
        xk xkVar = kk0Var.a;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (kk0Var.j(ne1Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= kk0Var.h(cVar) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= kk0Var.j(ne1Var2) ? FontInfo.NUMBER_OF_CHAR_CODES : Uuid.SIZE_BITS;
        }
        if ((i3 & 147) == 146 && kk0Var.F()) {
            kk0Var.V();
        } else {
            if (i4 != 0) {
                cVar = c.i;
            }
            c cVarThen = cVar.then(d.c);
            vb2 vb2VarRowMeasurePolicy = e83.rowMeasurePolicy(hl.a, Alignment$Companion.getTop(), kk0Var, 0);
            int currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
            su2 su2VarN = kk0Var.n();
            c cVarD = b.d(kk0Var, cVarThen);
            androidx.compose.ui.node.a.j.getClass();
            d4 constructor = ComposeUiNode$Companion.getConstructor();
            if (xkVar == null) {
                rj0.a();
                throw null;
            }
            kk0Var.e0();
            if (kk0Var.O) {
                kk0Var.m(constructor);
            } else {
                kk0Var.o0();
            }
            pe peVarH = fq2.h(kk0Var, vb2VarRowMeasurePolicy, kk0Var, su2VarN);
            if (kk0Var.O || !kr1.n(kk0Var.P(), Integer.valueOf(currentCompositeKeyHash))) {
                fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
            }
            xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
            ne1Var.invoke(kk0Var, Integer.valueOf(i3 & 14));
            Modifier$Companion modifier$Companion = c.i;
            vb2 vb2VarC = vw.c(Alignment$Companion.getTopStart(), false);
            int currentCompositeKeyHash2 = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
            su2 su2VarN2 = kk0Var.n();
            c cVarD2 = b.d(kk0Var, modifier$Companion);
            d4 constructor2 = ComposeUiNode$Companion.getConstructor();
            kk0Var.e0();
            if (kk0Var.O) {
                kk0Var.m(constructor2);
            } else {
                kk0Var.o0();
            }
            pe peVarH2 = fq2.h(kk0Var, vb2VarC, kk0Var, su2VarN2);
            if (kk0Var.O || !kr1.n(kk0Var.P(), Integer.valueOf(currentCompositeKeyHash2))) {
                fq2.v(currentCompositeKeyHash2, kk0Var, currentCompositeKeyHash2, peVarH2);
            }
            xp1.E(kk0Var, cVarD2, ComposeUiNode$Companion.getSetModifier());
            ne1Var2.invoke(kk0Var, Integer.valueOf((i3 >> 6) & 14));
            kk0Var.r(true);
            kk0Var.r(true);
        }
        c cVar2 = cVar;
        w33 w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new ra(ne1Var, cVar2, ne1Var2, i, i2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Scrim-Bx497Mc, reason: not valid java name */
    public static final void m1826xa4f58eab(boolean z, je1 je1Var, je1 je1Var2, long j, ck0 ck0Var, int i) {
        int i2;
        c cVarB;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(2106487387);
        if ((i & 6) == 0) {
            i2 = (kk0Var.i(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= kk0Var.j(je1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= kk0Var.j(je1Var2) ? FontInfo.NUMBER_OF_CHAR_CODES : Uuid.SIZE_BITS;
        }
        if ((i & 3072) == 0) {
            i2 |= kk0Var.g(j) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && kk0Var.F()) {
            kk0Var.V();
        } else {
            String strM1830xa862b2cd = uo3.m1830xa862b2cd(R.string.close_drawer, kk0Var, 0);
            kk0Var.a0(-1784743395);
            int i3 = 1;
            if (z) {
                Modifier$Companion modifier$Companion = c.i;
                int i4 = i2 & 112;
                boolean z2 = i4 == 32;
                Object objP = kk0Var.P();
                if (z2 || objP == Composer$Companion.getEmpty()) {
                    objP = new ff2(je1Var, null, i3);
                    kk0Var.l0(objP);
                }
                c cVarThen = modifier$Companion.then(new SuspendPointerInputElement(je1Var, null, null, new nq3((ne1) objP), 6));
                boolean zH = (i4 == 32) | kk0Var.h(strM1830xa862b2cd);
                Object objP2 = kk0Var.P();
                if (zH || objP2 == Composer$Companion.getEmpty()) {
                    objP2 = new gf2(strM1830xa862b2cd, je1Var, i3);
                    kk0Var.l0(objP2);
                }
                cVarB = we3.b(cVarThen, true, (le1) objP2);
            } else {
                cVarB = c.i;
            }
            kk0Var.r(false);
            Modifier$Companion modifier$Companion2 = c.i;
            c cVarThen2 = d.c.then(cVarB);
            int i5 = ((i2 & 7168) == 2048 ? 1 : 0) | ((i2 & 896) != 256 ? 0 : 1);
            Object objP3 = kk0Var.P();
            if (i5 != 0 || objP3 == Composer$Companion.getEmpty()) {
                objP3 = new ir(3, j, je1Var2);
                kk0Var.l0(objP3);
            }
            c10.Canvas(cVarThen2, (le1) objP3, kk0Var, 0);
        }
        w33 w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new sj2(z, je1Var, je1Var2, j, i));
        }
    }

    public static final float b(n63 n63Var, e01 e01Var) {
        float fD = bi3.d(n63Var.v);
        if (Float.isNaN(fD) || fD == 0.0f) {
            return 1.0f;
        }
        return ((e01Var.b.f() * (e01Var.a() ? 1 : -1)) / fD) + 1.0f;
    }

    public static final float c(n63 n63Var, e01 e01Var) {
        float fB = bi3.b(n63Var.v);
        if (Float.isNaN(fB) || fB == 0.0f) {
            return 1.0f;
        }
        return 1.0f - (e01Var.c.f() / fB);
    }

    public static final h01 rememberDrawerState(i01 i01Var, le1 le1Var, ck0 ck0Var, int i, int i2) {
        if ((i2 & 2) != 0) {
            le1Var = fl1.J;
        }
        Object[] objArr = new Object[0];
        pe peVar = pe.B;
        f01 f01Var = new f01(le1Var, 0);
        fp1 fp1Var = z93.a;
        fp1 fp1Var2 = new fp1(peVar, f01Var);
        int i3 = (((((i & 14) ^ 6) <= 4 || !((kk0) ck0Var).h(i01Var)) && (i & 6) != 4) ? 0 : 1) | (((((i & 112) ^ 48) > 32 && ((kk0) ck0Var).h(le1Var)) || (i & 48) == 32) ? 1 : 0);
        kk0 kk0Var = (kk0) ck0Var;
        Object objP = kk0Var.P();
        if (i3 != 0 || objP == Composer$Companion.getEmpty()) {
            objP = new c9(i01Var, 19, le1Var);
            kk0Var.l0(objP);
        }
        return (h01) d53.rememberSaveable(objArr, (x93) fp1Var2, (String) null, (je1) objP, (ck0) kk0Var, 0, 4);
    }
}
