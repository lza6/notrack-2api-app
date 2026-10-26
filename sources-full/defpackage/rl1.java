package defpackage;

import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.d;
import androidx.compose.material3.MinimumInteractiveModifier;
import androidx.compose.ui.Alignment$Companion;
import androidx.compose.ui.b;
import androidx.compose.ui.c;
import androidx.compose.ui.node.ComposeUiNode$Companion;
import kotlin.io.ConstantsKt;
import kotlin.uuid.Uuid;
import org.scilab.forge.jlatexmath.FontInfo;

/* JADX INFO: loaded from: classes.dex */
public abstract class rl1 {
    /* JADX WARN: Code duplicated, block: B:101:0x0114  */
    /* JADX WARN: Code duplicated, block: B:104:0x011c  */
    /* JADX WARN: Code duplicated, block: B:107:0x0127  */
    /* JADX WARN: Code duplicated, block: B:109:0x012f  */
    /* JADX WARN: Code duplicated, block: B:110:0x0136  */
    /* JADX WARN: Code duplicated, block: B:113:0x0148  */
    /* JADX WARN: Code duplicated, block: B:115:0x014c  */
    /* JADX WARN: Code duplicated, block: B:117:0x0151  */
    /* JADX WARN: Code duplicated, block: B:118:0x0154  */
    /* JADX WARN: Code duplicated, block: B:122:0x018f  */
    /* JADX WARN: Code duplicated, block: B:124:? A[RETURN, SYNTHETIC] */
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
    /* JADX WARN: Code duplicated, block: B:61:0x009f  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:65:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:71:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:73:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:76:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:97:0x010c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:98:0x010e  */
    /* JADX WARN: Code duplicated, block: B:99:0x0111  */
    public static final void FilledIconButton(je1 je1Var, c cVar, boolean z, rg3 rg3Var, dl1 dl1Var, gh2 gh2Var, ne1 ne1Var, ck0 ck0Var, int i, int i2) {
        je1 je1Var2;
        int i3;
        c cVar2;
        int i4;
        boolean z2;
        int i5;
        rg3 filledShape;
        dl1 dl1VarFilledIconButtonColors;
        int i6;
        gh2 gh2Var2;
        int i7;
        int i8;
        c cVar3;
        int i9;
        el1 el1Var;
        int i10;
        boolean z3;
        dl1 dl1Var2;
        gh2 gh2Var3;
        rg3 rg3Var2;
        long j;
        long j2;
        kk0 kk0Var;
        dl1 dl1Var3;
        c cVar4;
        boolean z4;
        rg3 rg3Var3;
        gh2 gh2Var4;
        w33 w33VarV;
        int i11;
        kk0 kk0Var2 = (kk0) ck0Var;
        kk0Var2.c0(1594730011);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            je1Var2 = je1Var;
        } else {
            je1Var2 = je1Var;
            if ((i & 6) == 0) {
                i3 = (kk0Var2.j(je1Var2) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        int i12 = i2 & 2;
        if (i12 == 0) {
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
                        filledShape = rg3Var;
                        int i13 = kk0Var2.h(filledShape) ? 2048 : 1024;
                        i3 |= i13;
                    } else {
                        filledShape = rg3Var;
                    }
                    i3 |= i13;
                } else {
                    filledShape = rg3Var;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        dl1VarFilledIconButtonColors = dl1Var;
                        if (kk0Var2.h(dl1VarFilledIconButtonColors)) {
                            i11 = 16384;
                        }
                        i3 |= i11;
                    } else {
                        dl1VarFilledIconButtonColors = dl1Var;
                    }
                    i11 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                    i3 |= i11;
                } else {
                    dl1VarFilledIconButtonColors = dl1Var;
                }
                i6 = i2 & 32;
                if (i6 != 0) {
                    if ((196608 & i) == 0) {
                        gh2Var2 = gh2Var;
                        if (kk0Var2.h(gh2Var2)) {
                            i7 = 131072;
                        } else {
                            i7 = 65536;
                        }
                        i3 |= i7;
                    }
                    if ((i2 & 64) != 0) {
                        i3 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        if (kk0Var2.j(ne1Var)) {
                            i8 = 1048576;
                        } else {
                            i8 = 524288;
                        }
                        i3 |= i8;
                    }
                    if ((599187 & i3) == 599186 || !kk0Var2.F()) {
                        kk0Var2.X();
                        if ((i & 1) != 0 || kk0Var2.D()) {
                            if (i12 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i4 != 0) {
                                z2 = true;
                            }
                            i9 = i2 & 8;
                            el1Var = el1.a;
                            if (i9 != 0) {
                                i3 &= -7169;
                                filledShape = el1Var.getFilledShape(kk0Var2, 6);
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                                dl1VarFilledIconButtonColors = el1Var.filledIconButtonColors(kk0Var2, 6);
                            }
                            if (i6 != 0) {
                                gh2Var3 = null;
                                z3 = z2;
                                rg3Var2 = filledShape;
                                i10 = i3;
                            } else {
                                i10 = i3;
                                z3 = z2;
                                dl1Var2 = dl1VarFilledIconButtonColors;
                                gh2Var3 = gh2Var2;
                                rg3Var2 = filledShape;
                            }
                            kk0Var2.s();
                            c cVarB = we3.b(cVar3, false, fl1.d);
                            if (z3) {
                                j = dl1Var2.a;
                            } else {
                                j = dl1Var2.c;
                            }
                            long j3 = j;
                            if (z3) {
                                j2 = dl1Var2.b;
                            } else {
                                j2 = dl1Var2.d;
                            }
                            kk0Var = kk0Var2;
                            hq3.m213xde3417d4(je1Var2, cVarB, z3, rg3Var2, j3, j2, 0.0f, 0.0f, null, gh2Var3, zg0.rememberComposableLambda(-1560623888, true, new gl1(ne1Var), kk0Var2, 54), kk0Var, (i10 & 8078) | ((i10 << 12) & 1879048192), 6, 448);
                            dl1Var3 = dl1Var2;
                            cVar4 = cVar3;
                            z4 = z3;
                            rg3Var3 = rg3Var2;
                            gh2Var4 = gh2Var3;
                        } else {
                            kk0Var2.V();
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            cVar3 = cVar2;
                            z3 = z2;
                            gh2Var3 = gh2Var2;
                            i10 = i3;
                            rg3Var2 = filledShape;
                        }
                        dl1Var2 = dl1VarFilledIconButtonColors;
                        kk0Var2.s();
                        c cVarB2 = we3.b(cVar3, false, fl1.d);
                        if (z3) {
                            j = dl1Var2.a;
                        } else {
                            j = dl1Var2.c;
                        }
                        long j4 = j;
                        if (z3) {
                            j2 = dl1Var2.b;
                        } else {
                            j2 = dl1Var2.d;
                        }
                        kk0Var = kk0Var2;
                        hq3.m213xde3417d4(je1Var2, cVarB2, z3, rg3Var2, j4, j2, 0.0f, 0.0f, null, gh2Var3, zg0.rememberComposableLambda(-1560623888, true, new gl1(ne1Var), kk0Var2, 54), kk0Var, (i10 & 8078) | ((i10 << 12) & 1879048192), 6, 448);
                        dl1Var3 = dl1Var2;
                        cVar4 = cVar3;
                        z4 = z3;
                        rg3Var3 = rg3Var2;
                        gh2Var4 = gh2Var3;
                    } else {
                        kk0Var2.V();
                        kk0Var = kk0Var2;
                        cVar4 = cVar2;
                        z4 = z2;
                        rg3Var3 = filledShape;
                        dl1Var3 = dl1VarFilledIconButtonColors;
                        gh2Var4 = gh2Var2;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new hl1(je1Var, cVar4, z4, rg3Var3, dl1Var3, gh2Var4, ne1Var, i, i2, 0));
                    }
                }
                i3 |= 196608;
                gh2Var2 = gh2Var;
                if ((i2 & 64) != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    if (kk0Var2.j(ne1Var)) {
                        i8 = 1048576;
                    } else {
                        i8 = 524288;
                    }
                    i3 |= i8;
                }
                if ((599187 & i3) == 599186) {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        i9 = i2 & 8;
                        el1Var = el1.a;
                        if (i9 != 0) {
                            i3 &= -7169;
                            filledShape = el1Var.getFilledShape(kk0Var2, 6);
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            dl1VarFilledIconButtonColors = el1Var.filledIconButtonColors(kk0Var2, 6);
                        }
                        if (i6 != 0) {
                            gh2Var3 = null;
                            z3 = z2;
                            rg3Var2 = filledShape;
                            i10 = i3;
                            dl1Var2 = dl1VarFilledIconButtonColors;
                        } else {
                            i10 = i3;
                            z3 = z2;
                            dl1Var2 = dl1VarFilledIconButtonColors;
                            gh2Var3 = gh2Var2;
                            rg3Var2 = filledShape;
                        }
                    } else {
                        if (i12 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        i9 = i2 & 8;
                        el1Var = el1.a;
                        if (i9 != 0) {
                            i3 &= -7169;
                            filledShape = el1Var.getFilledShape(kk0Var2, 6);
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            dl1VarFilledIconButtonColors = el1Var.filledIconButtonColors(kk0Var2, 6);
                        }
                        if (i6 != 0) {
                            gh2Var3 = null;
                            z3 = z2;
                            rg3Var2 = filledShape;
                            i10 = i3;
                            dl1Var2 = dl1VarFilledIconButtonColors;
                        } else {
                            i10 = i3;
                            z3 = z2;
                            dl1Var2 = dl1VarFilledIconButtonColors;
                            gh2Var3 = gh2Var2;
                            rg3Var2 = filledShape;
                        }
                    }
                    kk0Var2.s();
                    c cVarB3 = we3.b(cVar3, false, fl1.d);
                    if (z3) {
                        j = dl1Var2.a;
                    } else {
                        j = dl1Var2.c;
                    }
                    long j5 = j;
                    if (z3) {
                        j2 = dl1Var2.b;
                    } else {
                        j2 = dl1Var2.d;
                    }
                    kk0Var = kk0Var2;
                    hq3.m213xde3417d4(je1Var2, cVarB3, z3, rg3Var2, j5, j2, 0.0f, 0.0f, null, gh2Var3, zg0.rememberComposableLambda(-1560623888, true, new gl1(ne1Var), kk0Var2, 54), kk0Var, (i10 & 8078) | ((i10 << 12) & 1879048192), 6, 448);
                    dl1Var3 = dl1Var2;
                    cVar4 = cVar3;
                    z4 = z3;
                    rg3Var3 = rg3Var2;
                    gh2Var4 = gh2Var3;
                } else {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        i9 = i2 & 8;
                        el1Var = el1.a;
                        if (i9 != 0) {
                            i3 &= -7169;
                            filledShape = el1Var.getFilledShape(kk0Var2, 6);
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            dl1VarFilledIconButtonColors = el1Var.filledIconButtonColors(kk0Var2, 6);
                        }
                        if (i6 != 0) {
                            gh2Var3 = null;
                            z3 = z2;
                            rg3Var2 = filledShape;
                            i10 = i3;
                            dl1Var2 = dl1VarFilledIconButtonColors;
                        } else {
                            i10 = i3;
                            z3 = z2;
                            dl1Var2 = dl1VarFilledIconButtonColors;
                            gh2Var3 = gh2Var2;
                            rg3Var2 = filledShape;
                        }
                    } else {
                        if (i12 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        i9 = i2 & 8;
                        el1Var = el1.a;
                        if (i9 != 0) {
                            i3 &= -7169;
                            filledShape = el1Var.getFilledShape(kk0Var2, 6);
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            dl1VarFilledIconButtonColors = el1Var.filledIconButtonColors(kk0Var2, 6);
                        }
                        if (i6 != 0) {
                            gh2Var3 = null;
                            z3 = z2;
                            rg3Var2 = filledShape;
                            i10 = i3;
                            dl1Var2 = dl1VarFilledIconButtonColors;
                        } else {
                            i10 = i3;
                            z3 = z2;
                            dl1Var2 = dl1VarFilledIconButtonColors;
                            gh2Var3 = gh2Var2;
                            rg3Var2 = filledShape;
                        }
                    }
                    kk0Var2.s();
                    c cVarB4 = we3.b(cVar3, false, fl1.d);
                    if (z3) {
                        j = dl1Var2.a;
                    } else {
                        j = dl1Var2.c;
                    }
                    long j6 = j;
                    if (z3) {
                        j2 = dl1Var2.b;
                    } else {
                        j2 = dl1Var2.d;
                    }
                    kk0Var = kk0Var2;
                    hq3.m213xde3417d4(je1Var2, cVarB4, z3, rg3Var2, j6, j2, 0.0f, 0.0f, null, gh2Var3, zg0.rememberComposableLambda(-1560623888, true, new gl1(ne1Var), kk0Var2, 54), kk0Var, (i10 & 8078) | ((i10 << 12) & 1879048192), 6, 448);
                    dl1Var3 = dl1Var2;
                    cVar4 = cVar3;
                    z4 = z3;
                    rg3Var3 = rg3Var2;
                    gh2Var4 = gh2Var3;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new hl1(je1Var, cVar4, z4, rg3Var3, dl1Var3, gh2Var4, ne1Var, i, i2, 0));
                }
            }
            i3 |= 384;
            z2 = z;
            if ((i & 3072) == 0) {
                if ((i2 & 8) == 0) {
                    filledShape = rg3Var;
                    if (kk0Var2.h(filledShape)) {
                    }
                    i3 |= i13;
                } else {
                    filledShape = rg3Var;
                }
                i3 |= i13;
            } else {
                filledShape = rg3Var;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    dl1VarFilledIconButtonColors = dl1Var;
                    if (kk0Var2.h(dl1VarFilledIconButtonColors)) {
                        i11 = 16384;
                    }
                    i3 |= i11;
                } else {
                    dl1VarFilledIconButtonColors = dl1Var;
                }
                i11 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                i3 |= i11;
            } else {
                dl1VarFilledIconButtonColors = dl1Var;
            }
            i6 = i2 & 32;
            if (i6 != 0) {
                if ((196608 & i) == 0) {
                    gh2Var2 = gh2Var;
                    if (kk0Var2.h(gh2Var2)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
                if ((i2 & 64) != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    if (kk0Var2.j(ne1Var)) {
                        i8 = 1048576;
                    } else {
                        i8 = 524288;
                    }
                    i3 |= i8;
                }
                if ((599187 & i3) == 599186) {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        i9 = i2 & 8;
                        el1Var = el1.a;
                        if (i9 != 0) {
                            i3 &= -7169;
                            filledShape = el1Var.getFilledShape(kk0Var2, 6);
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            dl1VarFilledIconButtonColors = el1Var.filledIconButtonColors(kk0Var2, 6);
                        }
                        if (i6 != 0) {
                            gh2Var3 = null;
                            z3 = z2;
                            rg3Var2 = filledShape;
                            i10 = i3;
                            dl1Var2 = dl1VarFilledIconButtonColors;
                        } else {
                            i10 = i3;
                            z3 = z2;
                            dl1Var2 = dl1VarFilledIconButtonColors;
                            gh2Var3 = gh2Var2;
                            rg3Var2 = filledShape;
                        }
                    } else {
                        if (i12 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        i9 = i2 & 8;
                        el1Var = el1.a;
                        if (i9 != 0) {
                            i3 &= -7169;
                            filledShape = el1Var.getFilledShape(kk0Var2, 6);
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            dl1VarFilledIconButtonColors = el1Var.filledIconButtonColors(kk0Var2, 6);
                        }
                        if (i6 != 0) {
                            gh2Var3 = null;
                            z3 = z2;
                            rg3Var2 = filledShape;
                            i10 = i3;
                            dl1Var2 = dl1VarFilledIconButtonColors;
                        } else {
                            i10 = i3;
                            z3 = z2;
                            dl1Var2 = dl1VarFilledIconButtonColors;
                            gh2Var3 = gh2Var2;
                            rg3Var2 = filledShape;
                        }
                    }
                    kk0Var2.s();
                    c cVarB5 = we3.b(cVar3, false, fl1.d);
                    if (z3) {
                        j = dl1Var2.a;
                    } else {
                        j = dl1Var2.c;
                    }
                    long j7 = j;
                    if (z3) {
                        j2 = dl1Var2.b;
                    } else {
                        j2 = dl1Var2.d;
                    }
                    kk0Var = kk0Var2;
                    hq3.m213xde3417d4(je1Var2, cVarB5, z3, rg3Var2, j7, j2, 0.0f, 0.0f, null, gh2Var3, zg0.rememberComposableLambda(-1560623888, true, new gl1(ne1Var), kk0Var2, 54), kk0Var, (i10 & 8078) | ((i10 << 12) & 1879048192), 6, 448);
                    dl1Var3 = dl1Var2;
                    cVar4 = cVar3;
                    z4 = z3;
                    rg3Var3 = rg3Var2;
                    gh2Var4 = gh2Var3;
                } else {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        i9 = i2 & 8;
                        el1Var = el1.a;
                        if (i9 != 0) {
                            i3 &= -7169;
                            filledShape = el1Var.getFilledShape(kk0Var2, 6);
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            dl1VarFilledIconButtonColors = el1Var.filledIconButtonColors(kk0Var2, 6);
                        }
                        if (i6 != 0) {
                            gh2Var3 = null;
                            z3 = z2;
                            rg3Var2 = filledShape;
                            i10 = i3;
                            dl1Var2 = dl1VarFilledIconButtonColors;
                        } else {
                            i10 = i3;
                            z3 = z2;
                            dl1Var2 = dl1VarFilledIconButtonColors;
                            gh2Var3 = gh2Var2;
                            rg3Var2 = filledShape;
                        }
                    } else {
                        if (i12 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        i9 = i2 & 8;
                        el1Var = el1.a;
                        if (i9 != 0) {
                            i3 &= -7169;
                            filledShape = el1Var.getFilledShape(kk0Var2, 6);
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            dl1VarFilledIconButtonColors = el1Var.filledIconButtonColors(kk0Var2, 6);
                        }
                        if (i6 != 0) {
                            gh2Var3 = null;
                            z3 = z2;
                            rg3Var2 = filledShape;
                            i10 = i3;
                            dl1Var2 = dl1VarFilledIconButtonColors;
                        } else {
                            i10 = i3;
                            z3 = z2;
                            dl1Var2 = dl1VarFilledIconButtonColors;
                            gh2Var3 = gh2Var2;
                            rg3Var2 = filledShape;
                        }
                    }
                    kk0Var2.s();
                    c cVarB6 = we3.b(cVar3, false, fl1.d);
                    if (z3) {
                        j = dl1Var2.a;
                    } else {
                        j = dl1Var2.c;
                    }
                    long j8 = j;
                    if (z3) {
                        j2 = dl1Var2.b;
                    } else {
                        j2 = dl1Var2.d;
                    }
                    kk0Var = kk0Var2;
                    hq3.m213xde3417d4(je1Var2, cVarB6, z3, rg3Var2, j8, j2, 0.0f, 0.0f, null, gh2Var3, zg0.rememberComposableLambda(-1560623888, true, new gl1(ne1Var), kk0Var2, 54), kk0Var, (i10 & 8078) | ((i10 << 12) & 1879048192), 6, 448);
                    dl1Var3 = dl1Var2;
                    cVar4 = cVar3;
                    z4 = z3;
                    rg3Var3 = rg3Var2;
                    gh2Var4 = gh2Var3;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new hl1(je1Var, cVar4, z4, rg3Var3, dl1Var3, gh2Var4, ne1Var, i, i2, 0));
                }
            }
            i3 |= 196608;
            gh2Var2 = gh2Var;
            if ((i2 & 64) != 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                if (kk0Var2.j(ne1Var)) {
                    i8 = 1048576;
                } else {
                    i8 = 524288;
                }
                i3 |= i8;
            }
            if ((599187 & i3) == 599186) {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    i9 = i2 & 8;
                    el1Var = el1.a;
                    if (i9 != 0) {
                        i3 &= -7169;
                        filledShape = el1Var.getFilledShape(kk0Var2, 6);
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        dl1VarFilledIconButtonColors = el1Var.filledIconButtonColors(kk0Var2, 6);
                    }
                    if (i6 != 0) {
                        gh2Var3 = null;
                        z3 = z2;
                        rg3Var2 = filledShape;
                        i10 = i3;
                        dl1Var2 = dl1VarFilledIconButtonColors;
                    } else {
                        i10 = i3;
                        z3 = z2;
                        dl1Var2 = dl1VarFilledIconButtonColors;
                        gh2Var3 = gh2Var2;
                        rg3Var2 = filledShape;
                    }
                } else {
                    if (i12 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    i9 = i2 & 8;
                    el1Var = el1.a;
                    if (i9 != 0) {
                        i3 &= -7169;
                        filledShape = el1Var.getFilledShape(kk0Var2, 6);
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        dl1VarFilledIconButtonColors = el1Var.filledIconButtonColors(kk0Var2, 6);
                    }
                    if (i6 != 0) {
                        gh2Var3 = null;
                        z3 = z2;
                        rg3Var2 = filledShape;
                        i10 = i3;
                        dl1Var2 = dl1VarFilledIconButtonColors;
                    } else {
                        i10 = i3;
                        z3 = z2;
                        dl1Var2 = dl1VarFilledIconButtonColors;
                        gh2Var3 = gh2Var2;
                        rg3Var2 = filledShape;
                    }
                }
                kk0Var2.s();
                c cVarB7 = we3.b(cVar3, false, fl1.d);
                if (z3) {
                    j = dl1Var2.a;
                } else {
                    j = dl1Var2.c;
                }
                long j9 = j;
                if (z3) {
                    j2 = dl1Var2.b;
                } else {
                    j2 = dl1Var2.d;
                }
                kk0Var = kk0Var2;
                hq3.m213xde3417d4(je1Var2, cVarB7, z3, rg3Var2, j9, j2, 0.0f, 0.0f, null, gh2Var3, zg0.rememberComposableLambda(-1560623888, true, new gl1(ne1Var), kk0Var2, 54), kk0Var, (i10 & 8078) | ((i10 << 12) & 1879048192), 6, 448);
                dl1Var3 = dl1Var2;
                cVar4 = cVar3;
                z4 = z3;
                rg3Var3 = rg3Var2;
                gh2Var4 = gh2Var3;
            } else {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    i9 = i2 & 8;
                    el1Var = el1.a;
                    if (i9 != 0) {
                        i3 &= -7169;
                        filledShape = el1Var.getFilledShape(kk0Var2, 6);
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        dl1VarFilledIconButtonColors = el1Var.filledIconButtonColors(kk0Var2, 6);
                    }
                    if (i6 != 0) {
                        gh2Var3 = null;
                        z3 = z2;
                        rg3Var2 = filledShape;
                        i10 = i3;
                        dl1Var2 = dl1VarFilledIconButtonColors;
                    } else {
                        i10 = i3;
                        z3 = z2;
                        dl1Var2 = dl1VarFilledIconButtonColors;
                        gh2Var3 = gh2Var2;
                        rg3Var2 = filledShape;
                    }
                } else {
                    if (i12 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    i9 = i2 & 8;
                    el1Var = el1.a;
                    if (i9 != 0) {
                        i3 &= -7169;
                        filledShape = el1Var.getFilledShape(kk0Var2, 6);
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        dl1VarFilledIconButtonColors = el1Var.filledIconButtonColors(kk0Var2, 6);
                    }
                    if (i6 != 0) {
                        gh2Var3 = null;
                        z3 = z2;
                        rg3Var2 = filledShape;
                        i10 = i3;
                        dl1Var2 = dl1VarFilledIconButtonColors;
                    } else {
                        i10 = i3;
                        z3 = z2;
                        dl1Var2 = dl1VarFilledIconButtonColors;
                        gh2Var3 = gh2Var2;
                        rg3Var2 = filledShape;
                    }
                }
                kk0Var2.s();
                c cVarB8 = we3.b(cVar3, false, fl1.d);
                if (z3) {
                    j = dl1Var2.a;
                } else {
                    j = dl1Var2.c;
                }
                long j10 = j;
                if (z3) {
                    j2 = dl1Var2.b;
                } else {
                    j2 = dl1Var2.d;
                }
                kk0Var = kk0Var2;
                hq3.m213xde3417d4(je1Var2, cVarB8, z3, rg3Var2, j10, j2, 0.0f, 0.0f, null, gh2Var3, zg0.rememberComposableLambda(-1560623888, true, new gl1(ne1Var), kk0Var2, 54), kk0Var, (i10 & 8078) | ((i10 << 12) & 1879048192), 6, 448);
                dl1Var3 = dl1Var2;
                cVar4 = cVar3;
                z4 = z3;
                rg3Var3 = rg3Var2;
                gh2Var4 = gh2Var3;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new hl1(je1Var, cVar4, z4, rg3Var3, dl1Var3, gh2Var4, ne1Var, i, i2, 0));
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
                    filledShape = rg3Var;
                    if (kk0Var2.h(filledShape)) {
                    }
                    i3 |= i13;
                } else {
                    filledShape = rg3Var;
                }
                i3 |= i13;
            } else {
                filledShape = rg3Var;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    dl1VarFilledIconButtonColors = dl1Var;
                    if (kk0Var2.h(dl1VarFilledIconButtonColors)) {
                        i11 = 16384;
                    }
                    i3 |= i11;
                } else {
                    dl1VarFilledIconButtonColors = dl1Var;
                }
                i11 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                i3 |= i11;
            } else {
                dl1VarFilledIconButtonColors = dl1Var;
            }
            i6 = i2 & 32;
            if (i6 != 0) {
                if ((196608 & i) == 0) {
                    gh2Var2 = gh2Var;
                    if (kk0Var2.h(gh2Var2)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
                if ((i2 & 64) != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    if (kk0Var2.j(ne1Var)) {
                        i8 = 1048576;
                    } else {
                        i8 = 524288;
                    }
                    i3 |= i8;
                }
                if ((599187 & i3) == 599186) {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        i9 = i2 & 8;
                        el1Var = el1.a;
                        if (i9 != 0) {
                            i3 &= -7169;
                            filledShape = el1Var.getFilledShape(kk0Var2, 6);
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            dl1VarFilledIconButtonColors = el1Var.filledIconButtonColors(kk0Var2, 6);
                        }
                        if (i6 != 0) {
                            gh2Var3 = null;
                            z3 = z2;
                            rg3Var2 = filledShape;
                            i10 = i3;
                            dl1Var2 = dl1VarFilledIconButtonColors;
                        } else {
                            i10 = i3;
                            z3 = z2;
                            dl1Var2 = dl1VarFilledIconButtonColors;
                            gh2Var3 = gh2Var2;
                            rg3Var2 = filledShape;
                        }
                    } else {
                        if (i12 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        i9 = i2 & 8;
                        el1Var = el1.a;
                        if (i9 != 0) {
                            i3 &= -7169;
                            filledShape = el1Var.getFilledShape(kk0Var2, 6);
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            dl1VarFilledIconButtonColors = el1Var.filledIconButtonColors(kk0Var2, 6);
                        }
                        if (i6 != 0) {
                            gh2Var3 = null;
                            z3 = z2;
                            rg3Var2 = filledShape;
                            i10 = i3;
                            dl1Var2 = dl1VarFilledIconButtonColors;
                        } else {
                            i10 = i3;
                            z3 = z2;
                            dl1Var2 = dl1VarFilledIconButtonColors;
                            gh2Var3 = gh2Var2;
                            rg3Var2 = filledShape;
                        }
                    }
                    kk0Var2.s();
                    c cVarB9 = we3.b(cVar3, false, fl1.d);
                    if (z3) {
                        j = dl1Var2.a;
                    } else {
                        j = dl1Var2.c;
                    }
                    long j11 = j;
                    if (z3) {
                        j2 = dl1Var2.b;
                    } else {
                        j2 = dl1Var2.d;
                    }
                    kk0Var = kk0Var2;
                    hq3.m213xde3417d4(je1Var2, cVarB9, z3, rg3Var2, j11, j2, 0.0f, 0.0f, null, gh2Var3, zg0.rememberComposableLambda(-1560623888, true, new gl1(ne1Var), kk0Var2, 54), kk0Var, (i10 & 8078) | ((i10 << 12) & 1879048192), 6, 448);
                    dl1Var3 = dl1Var2;
                    cVar4 = cVar3;
                    z4 = z3;
                    rg3Var3 = rg3Var2;
                    gh2Var4 = gh2Var3;
                } else {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        i9 = i2 & 8;
                        el1Var = el1.a;
                        if (i9 != 0) {
                            i3 &= -7169;
                            filledShape = el1Var.getFilledShape(kk0Var2, 6);
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            dl1VarFilledIconButtonColors = el1Var.filledIconButtonColors(kk0Var2, 6);
                        }
                        if (i6 != 0) {
                            gh2Var3 = null;
                            z3 = z2;
                            rg3Var2 = filledShape;
                            i10 = i3;
                            dl1Var2 = dl1VarFilledIconButtonColors;
                        } else {
                            i10 = i3;
                            z3 = z2;
                            dl1Var2 = dl1VarFilledIconButtonColors;
                            gh2Var3 = gh2Var2;
                            rg3Var2 = filledShape;
                        }
                    } else {
                        if (i12 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        i9 = i2 & 8;
                        el1Var = el1.a;
                        if (i9 != 0) {
                            i3 &= -7169;
                            filledShape = el1Var.getFilledShape(kk0Var2, 6);
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            dl1VarFilledIconButtonColors = el1Var.filledIconButtonColors(kk0Var2, 6);
                        }
                        if (i6 != 0) {
                            gh2Var3 = null;
                            z3 = z2;
                            rg3Var2 = filledShape;
                            i10 = i3;
                            dl1Var2 = dl1VarFilledIconButtonColors;
                        } else {
                            i10 = i3;
                            z3 = z2;
                            dl1Var2 = dl1VarFilledIconButtonColors;
                            gh2Var3 = gh2Var2;
                            rg3Var2 = filledShape;
                        }
                    }
                    kk0Var2.s();
                    c cVarB10 = we3.b(cVar3, false, fl1.d);
                    if (z3) {
                        j = dl1Var2.a;
                    } else {
                        j = dl1Var2.c;
                    }
                    long j12 = j;
                    if (z3) {
                        j2 = dl1Var2.b;
                    } else {
                        j2 = dl1Var2.d;
                    }
                    kk0Var = kk0Var2;
                    hq3.m213xde3417d4(je1Var2, cVarB10, z3, rg3Var2, j12, j2, 0.0f, 0.0f, null, gh2Var3, zg0.rememberComposableLambda(-1560623888, true, new gl1(ne1Var), kk0Var2, 54), kk0Var, (i10 & 8078) | ((i10 << 12) & 1879048192), 6, 448);
                    dl1Var3 = dl1Var2;
                    cVar4 = cVar3;
                    z4 = z3;
                    rg3Var3 = rg3Var2;
                    gh2Var4 = gh2Var3;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new hl1(je1Var, cVar4, z4, rg3Var3, dl1Var3, gh2Var4, ne1Var, i, i2, 0));
                }
            }
            i3 |= 196608;
            gh2Var2 = gh2Var;
            if ((i2 & 64) != 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                if (kk0Var2.j(ne1Var)) {
                    i8 = 1048576;
                } else {
                    i8 = 524288;
                }
                i3 |= i8;
            }
            if ((599187 & i3) == 599186) {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    i9 = i2 & 8;
                    el1Var = el1.a;
                    if (i9 != 0) {
                        i3 &= -7169;
                        filledShape = el1Var.getFilledShape(kk0Var2, 6);
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        dl1VarFilledIconButtonColors = el1Var.filledIconButtonColors(kk0Var2, 6);
                    }
                    if (i6 != 0) {
                        gh2Var3 = null;
                        z3 = z2;
                        rg3Var2 = filledShape;
                        i10 = i3;
                        dl1Var2 = dl1VarFilledIconButtonColors;
                    } else {
                        i10 = i3;
                        z3 = z2;
                        dl1Var2 = dl1VarFilledIconButtonColors;
                        gh2Var3 = gh2Var2;
                        rg3Var2 = filledShape;
                    }
                } else {
                    if (i12 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    i9 = i2 & 8;
                    el1Var = el1.a;
                    if (i9 != 0) {
                        i3 &= -7169;
                        filledShape = el1Var.getFilledShape(kk0Var2, 6);
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        dl1VarFilledIconButtonColors = el1Var.filledIconButtonColors(kk0Var2, 6);
                    }
                    if (i6 != 0) {
                        gh2Var3 = null;
                        z3 = z2;
                        rg3Var2 = filledShape;
                        i10 = i3;
                        dl1Var2 = dl1VarFilledIconButtonColors;
                    } else {
                        i10 = i3;
                        z3 = z2;
                        dl1Var2 = dl1VarFilledIconButtonColors;
                        gh2Var3 = gh2Var2;
                        rg3Var2 = filledShape;
                    }
                }
                kk0Var2.s();
                c cVarB11 = we3.b(cVar3, false, fl1.d);
                if (z3) {
                    j = dl1Var2.a;
                } else {
                    j = dl1Var2.c;
                }
                long j13 = j;
                if (z3) {
                    j2 = dl1Var2.b;
                } else {
                    j2 = dl1Var2.d;
                }
                kk0Var = kk0Var2;
                hq3.m213xde3417d4(je1Var2, cVarB11, z3, rg3Var2, j13, j2, 0.0f, 0.0f, null, gh2Var3, zg0.rememberComposableLambda(-1560623888, true, new gl1(ne1Var), kk0Var2, 54), kk0Var, (i10 & 8078) | ((i10 << 12) & 1879048192), 6, 448);
                dl1Var3 = dl1Var2;
                cVar4 = cVar3;
                z4 = z3;
                rg3Var3 = rg3Var2;
                gh2Var4 = gh2Var3;
            } else {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    i9 = i2 & 8;
                    el1Var = el1.a;
                    if (i9 != 0) {
                        i3 &= -7169;
                        filledShape = el1Var.getFilledShape(kk0Var2, 6);
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        dl1VarFilledIconButtonColors = el1Var.filledIconButtonColors(kk0Var2, 6);
                    }
                    if (i6 != 0) {
                        gh2Var3 = null;
                        z3 = z2;
                        rg3Var2 = filledShape;
                        i10 = i3;
                        dl1Var2 = dl1VarFilledIconButtonColors;
                    } else {
                        i10 = i3;
                        z3 = z2;
                        dl1Var2 = dl1VarFilledIconButtonColors;
                        gh2Var3 = gh2Var2;
                        rg3Var2 = filledShape;
                    }
                } else {
                    if (i12 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    i9 = i2 & 8;
                    el1Var = el1.a;
                    if (i9 != 0) {
                        i3 &= -7169;
                        filledShape = el1Var.getFilledShape(kk0Var2, 6);
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        dl1VarFilledIconButtonColors = el1Var.filledIconButtonColors(kk0Var2, 6);
                    }
                    if (i6 != 0) {
                        gh2Var3 = null;
                        z3 = z2;
                        rg3Var2 = filledShape;
                        i10 = i3;
                        dl1Var2 = dl1VarFilledIconButtonColors;
                    } else {
                        i10 = i3;
                        z3 = z2;
                        dl1Var2 = dl1VarFilledIconButtonColors;
                        gh2Var3 = gh2Var2;
                        rg3Var2 = filledShape;
                    }
                }
                kk0Var2.s();
                c cVarB12 = we3.b(cVar3, false, fl1.d);
                if (z3) {
                    j = dl1Var2.a;
                } else {
                    j = dl1Var2.c;
                }
                long j14 = j;
                if (z3) {
                    j2 = dl1Var2.b;
                } else {
                    j2 = dl1Var2.d;
                }
                kk0Var = kk0Var2;
                hq3.m213xde3417d4(je1Var2, cVarB12, z3, rg3Var2, j14, j2, 0.0f, 0.0f, null, gh2Var3, zg0.rememberComposableLambda(-1560623888, true, new gl1(ne1Var), kk0Var2, 54), kk0Var, (i10 & 8078) | ((i10 << 12) & 1879048192), 6, 448);
                dl1Var3 = dl1Var2;
                cVar4 = cVar3;
                z4 = z3;
                rg3Var3 = rg3Var2;
                gh2Var4 = gh2Var3;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new hl1(je1Var, cVar4, z4, rg3Var3, dl1Var3, gh2Var4, ne1Var, i, i2, 0));
            }
        }
        i3 |= 384;
        z2 = z;
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                filledShape = rg3Var;
                if (kk0Var2.h(filledShape)) {
                }
                i3 |= i13;
            } else {
                filledShape = rg3Var;
            }
            i3 |= i13;
        } else {
            filledShape = rg3Var;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                dl1VarFilledIconButtonColors = dl1Var;
                if (kk0Var2.h(dl1VarFilledIconButtonColors)) {
                    i11 = 16384;
                }
                i3 |= i11;
            } else {
                dl1VarFilledIconButtonColors = dl1Var;
            }
            i11 = ConstantsKt.DEFAULT_BUFFER_SIZE;
            i3 |= i11;
        } else {
            dl1VarFilledIconButtonColors = dl1Var;
        }
        i6 = i2 & 32;
        if (i6 != 0) {
            if ((196608 & i) == 0) {
                gh2Var2 = gh2Var;
                if (kk0Var2.h(gh2Var2)) {
                    i7 = 131072;
                } else {
                    i7 = 65536;
                }
                i3 |= i7;
            }
            if ((i2 & 64) != 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                if (kk0Var2.j(ne1Var)) {
                    i8 = 1048576;
                } else {
                    i8 = 524288;
                }
                i3 |= i8;
            }
            if ((599187 & i3) == 599186) {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    i9 = i2 & 8;
                    el1Var = el1.a;
                    if (i9 != 0) {
                        i3 &= -7169;
                        filledShape = el1Var.getFilledShape(kk0Var2, 6);
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        dl1VarFilledIconButtonColors = el1Var.filledIconButtonColors(kk0Var2, 6);
                    }
                    if (i6 != 0) {
                        gh2Var3 = null;
                        z3 = z2;
                        rg3Var2 = filledShape;
                        i10 = i3;
                        dl1Var2 = dl1VarFilledIconButtonColors;
                    } else {
                        i10 = i3;
                        z3 = z2;
                        dl1Var2 = dl1VarFilledIconButtonColors;
                        gh2Var3 = gh2Var2;
                        rg3Var2 = filledShape;
                    }
                } else {
                    if (i12 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    i9 = i2 & 8;
                    el1Var = el1.a;
                    if (i9 != 0) {
                        i3 &= -7169;
                        filledShape = el1Var.getFilledShape(kk0Var2, 6);
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        dl1VarFilledIconButtonColors = el1Var.filledIconButtonColors(kk0Var2, 6);
                    }
                    if (i6 != 0) {
                        gh2Var3 = null;
                        z3 = z2;
                        rg3Var2 = filledShape;
                        i10 = i3;
                        dl1Var2 = dl1VarFilledIconButtonColors;
                    } else {
                        i10 = i3;
                        z3 = z2;
                        dl1Var2 = dl1VarFilledIconButtonColors;
                        gh2Var3 = gh2Var2;
                        rg3Var2 = filledShape;
                    }
                }
                kk0Var2.s();
                c cVarB13 = we3.b(cVar3, false, fl1.d);
                if (z3) {
                    j = dl1Var2.a;
                } else {
                    j = dl1Var2.c;
                }
                long j15 = j;
                if (z3) {
                    j2 = dl1Var2.b;
                } else {
                    j2 = dl1Var2.d;
                }
                kk0Var = kk0Var2;
                hq3.m213xde3417d4(je1Var2, cVarB13, z3, rg3Var2, j15, j2, 0.0f, 0.0f, null, gh2Var3, zg0.rememberComposableLambda(-1560623888, true, new gl1(ne1Var), kk0Var2, 54), kk0Var, (i10 & 8078) | ((i10 << 12) & 1879048192), 6, 448);
                dl1Var3 = dl1Var2;
                cVar4 = cVar3;
                z4 = z3;
                rg3Var3 = rg3Var2;
                gh2Var4 = gh2Var3;
            } else {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    i9 = i2 & 8;
                    el1Var = el1.a;
                    if (i9 != 0) {
                        i3 &= -7169;
                        filledShape = el1Var.getFilledShape(kk0Var2, 6);
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        dl1VarFilledIconButtonColors = el1Var.filledIconButtonColors(kk0Var2, 6);
                    }
                    if (i6 != 0) {
                        gh2Var3 = null;
                        z3 = z2;
                        rg3Var2 = filledShape;
                        i10 = i3;
                        dl1Var2 = dl1VarFilledIconButtonColors;
                    } else {
                        i10 = i3;
                        z3 = z2;
                        dl1Var2 = dl1VarFilledIconButtonColors;
                        gh2Var3 = gh2Var2;
                        rg3Var2 = filledShape;
                    }
                } else {
                    if (i12 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    i9 = i2 & 8;
                    el1Var = el1.a;
                    if (i9 != 0) {
                        i3 &= -7169;
                        filledShape = el1Var.getFilledShape(kk0Var2, 6);
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        dl1VarFilledIconButtonColors = el1Var.filledIconButtonColors(kk0Var2, 6);
                    }
                    if (i6 != 0) {
                        gh2Var3 = null;
                        z3 = z2;
                        rg3Var2 = filledShape;
                        i10 = i3;
                        dl1Var2 = dl1VarFilledIconButtonColors;
                    } else {
                        i10 = i3;
                        z3 = z2;
                        dl1Var2 = dl1VarFilledIconButtonColors;
                        gh2Var3 = gh2Var2;
                        rg3Var2 = filledShape;
                    }
                }
                kk0Var2.s();
                c cVarB14 = we3.b(cVar3, false, fl1.d);
                if (z3) {
                    j = dl1Var2.a;
                } else {
                    j = dl1Var2.c;
                }
                long j16 = j;
                if (z3) {
                    j2 = dl1Var2.b;
                } else {
                    j2 = dl1Var2.d;
                }
                kk0Var = kk0Var2;
                hq3.m213xde3417d4(je1Var2, cVarB14, z3, rg3Var2, j16, j2, 0.0f, 0.0f, null, gh2Var3, zg0.rememberComposableLambda(-1560623888, true, new gl1(ne1Var), kk0Var2, 54), kk0Var, (i10 & 8078) | ((i10 << 12) & 1879048192), 6, 448);
                dl1Var3 = dl1Var2;
                cVar4 = cVar3;
                z4 = z3;
                rg3Var3 = rg3Var2;
                gh2Var4 = gh2Var3;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new hl1(je1Var, cVar4, z4, rg3Var3, dl1Var3, gh2Var4, ne1Var, i, i2, 0));
            }
        }
        i3 |= 196608;
        gh2Var2 = gh2Var;
        if ((i2 & 64) != 0) {
            i3 |= 1572864;
        } else if ((i & 1572864) == 0) {
            if (kk0Var2.j(ne1Var)) {
                i8 = 1048576;
            } else {
                i8 = 524288;
            }
            i3 |= i8;
        }
        if ((599187 & i3) == 599186) {
            kk0Var2.X();
            if ((i & 1) != 0) {
                if (i12 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if (i4 != 0) {
                    z2 = true;
                }
                i9 = i2 & 8;
                el1Var = el1.a;
                if (i9 != 0) {
                    i3 &= -7169;
                    filledShape = el1Var.getFilledShape(kk0Var2, 6);
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                    dl1VarFilledIconButtonColors = el1Var.filledIconButtonColors(kk0Var2, 6);
                }
                if (i6 != 0) {
                    gh2Var3 = null;
                    z3 = z2;
                    rg3Var2 = filledShape;
                    i10 = i3;
                    dl1Var2 = dl1VarFilledIconButtonColors;
                } else {
                    i10 = i3;
                    z3 = z2;
                    dl1Var2 = dl1VarFilledIconButtonColors;
                    gh2Var3 = gh2Var2;
                    rg3Var2 = filledShape;
                }
            } else {
                if (i12 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if (i4 != 0) {
                    z2 = true;
                }
                i9 = i2 & 8;
                el1Var = el1.a;
                if (i9 != 0) {
                    i3 &= -7169;
                    filledShape = el1Var.getFilledShape(kk0Var2, 6);
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                    dl1VarFilledIconButtonColors = el1Var.filledIconButtonColors(kk0Var2, 6);
                }
                if (i6 != 0) {
                    gh2Var3 = null;
                    z3 = z2;
                    rg3Var2 = filledShape;
                    i10 = i3;
                    dl1Var2 = dl1VarFilledIconButtonColors;
                } else {
                    i10 = i3;
                    z3 = z2;
                    dl1Var2 = dl1VarFilledIconButtonColors;
                    gh2Var3 = gh2Var2;
                    rg3Var2 = filledShape;
                }
            }
            kk0Var2.s();
            c cVarB15 = we3.b(cVar3, false, fl1.d);
            if (z3) {
                j = dl1Var2.a;
            } else {
                j = dl1Var2.c;
            }
            long j17 = j;
            if (z3) {
                j2 = dl1Var2.b;
            } else {
                j2 = dl1Var2.d;
            }
            kk0Var = kk0Var2;
            hq3.m213xde3417d4(je1Var2, cVarB15, z3, rg3Var2, j17, j2, 0.0f, 0.0f, null, gh2Var3, zg0.rememberComposableLambda(-1560623888, true, new gl1(ne1Var), kk0Var2, 54), kk0Var, (i10 & 8078) | ((i10 << 12) & 1879048192), 6, 448);
            dl1Var3 = dl1Var2;
            cVar4 = cVar3;
            z4 = z3;
            rg3Var3 = rg3Var2;
            gh2Var4 = gh2Var3;
        } else {
            kk0Var2.X();
            if ((i & 1) != 0) {
                if (i12 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if (i4 != 0) {
                    z2 = true;
                }
                i9 = i2 & 8;
                el1Var = el1.a;
                if (i9 != 0) {
                    i3 &= -7169;
                    filledShape = el1Var.getFilledShape(kk0Var2, 6);
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                    dl1VarFilledIconButtonColors = el1Var.filledIconButtonColors(kk0Var2, 6);
                }
                if (i6 != 0) {
                    gh2Var3 = null;
                    z3 = z2;
                    rg3Var2 = filledShape;
                    i10 = i3;
                    dl1Var2 = dl1VarFilledIconButtonColors;
                } else {
                    i10 = i3;
                    z3 = z2;
                    dl1Var2 = dl1VarFilledIconButtonColors;
                    gh2Var3 = gh2Var2;
                    rg3Var2 = filledShape;
                }
            } else {
                if (i12 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if (i4 != 0) {
                    z2 = true;
                }
                i9 = i2 & 8;
                el1Var = el1.a;
                if (i9 != 0) {
                    i3 &= -7169;
                    filledShape = el1Var.getFilledShape(kk0Var2, 6);
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                    dl1VarFilledIconButtonColors = el1Var.filledIconButtonColors(kk0Var2, 6);
                }
                if (i6 != 0) {
                    gh2Var3 = null;
                    z3 = z2;
                    rg3Var2 = filledShape;
                    i10 = i3;
                    dl1Var2 = dl1VarFilledIconButtonColors;
                } else {
                    i10 = i3;
                    z3 = z2;
                    dl1Var2 = dl1VarFilledIconButtonColors;
                    gh2Var3 = gh2Var2;
                    rg3Var2 = filledShape;
                }
            }
            kk0Var2.s();
            c cVarB16 = we3.b(cVar3, false, fl1.d);
            if (z3) {
                j = dl1Var2.a;
            } else {
                j = dl1Var2.c;
            }
            long j18 = j;
            if (z3) {
                j2 = dl1Var2.b;
            } else {
                j2 = dl1Var2.d;
            }
            kk0Var = kk0Var2;
            hq3.m213xde3417d4(je1Var2, cVarB16, z3, rg3Var2, j18, j2, 0.0f, 0.0f, null, gh2Var3, zg0.rememberComposableLambda(-1560623888, true, new gl1(ne1Var), kk0Var2, 54), kk0Var, (i10 & 8078) | ((i10 << 12) & 1879048192), 6, 448);
            dl1Var3 = dl1Var2;
            cVar4 = cVar3;
            z4 = z3;
            rg3Var3 = rg3Var2;
            gh2Var4 = gh2Var3;
        }
        w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new hl1(je1Var, cVar4, z4, rg3Var3, dl1Var3, gh2Var4, ne1Var, i, i2, 0));
        }
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0123 A[PHI: r4 r7 r9 r10 r11
  0x0123: PHI (r4v29 int) = (r4v23 int), (r4v30 int), (r4v31 int) binds: [B:118:0x014b, B:104:0x011f, B:105:0x0121] A[DONT_GENERATE, DONT_INLINE]
  0x0123: PHI (r7v9 androidx.compose.ui.c) = (r7v3 androidx.compose.ui.c), (r7v2 androidx.compose.ui.c), (r7v2 androidx.compose.ui.c) binds: [B:118:0x014b, B:104:0x011f, B:105:0x0121] A[DONT_GENERATE, DONT_INLINE]
  0x0123: PHI (r9v14 boolean) = (r9v3 boolean), (r9v2 boolean), (r9v2 boolean) binds: [B:118:0x014b, B:104:0x011f, B:105:0x0121] A[DONT_GENERATE, DONT_INLINE]
  0x0123: PHI (r10v17 rg3) = (r10v7 rg3), (r10v6 rg3), (r10v6 rg3) binds: [B:118:0x014b, B:104:0x011f, B:105:0x0121] A[DONT_GENERATE, DONT_INLINE]
  0x0123: PHI (r11v10 vl1) = (r11v4 vl1), (r11v3 vl1), (r11v3 vl1) binds: [B:118:0x014b, B:104:0x011f, B:105:0x0121] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:108:0x012a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:109:0x012c  */
    /* JADX WARN: Code duplicated, block: B:111:0x0131  */
    /* JADX WARN: Code duplicated, block: B:114:0x0139  */
    /* JADX WARN: Code duplicated, block: B:117:0x0144  */
    /* JADX WARN: Code duplicated, block: B:119:0x014d  */
    /* JADX WARN: Code duplicated, block: B:123:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    /* JADX WARN: Code duplicated, block: B:28:0x004d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:32:0x0059  */
    /* JADX WARN: Code duplicated, block: B:33:0x005c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX WARN: Code duplicated, block: B:39:0x0068  */
    /* JADX WARN: Code duplicated, block: B:41:0x006c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0074  */
    /* JADX WARN: Code duplicated, block: B:44:0x0077  */
    /* JADX WARN: Code duplicated, block: B:48:0x007e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0082  */
    /* JADX WARN: Code duplicated, block: B:52:0x008a  */
    /* JADX WARN: Code duplicated, block: B:53:0x008d  */
    /* JADX WARN: Code duplicated, block: B:56:0x0093  */
    /* JADX WARN: Code duplicated, block: B:59:0x009a  */
    /* JADX WARN: Code duplicated, block: B:61:0x009e  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:67:0x00af  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:72:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:74:0x00be  */
    /* JADX WARN: Code duplicated, block: B:76:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:77:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:82:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:84:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:86:0x00df  */
    /* JADX WARN: Code duplicated, block: B:87:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:91:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:95:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:97:0x010d  */
    public static final void FilledIconToggleButton(boolean z, le1 le1Var, c cVar, boolean z2, rg3 rg3Var, vl1 vl1Var, gh2 gh2Var, ne1 ne1Var, ck0 ck0Var, int i, int i2) {
        int i3;
        int i4;
        c cVar2;
        int i5;
        int i6;
        boolean z3;
        int i7;
        rg3 filledShape;
        vl1 vl1VarFilledIconToggleButtonColors;
        int i8;
        gh2 gh2Var2;
        int i9;
        int i10;
        int i11;
        el1 el1Var;
        gh2 gh2Var3;
        c cVar3;
        boolean z4;
        vl1 vl1Var2;
        rg3 rg3Var2;
        gh2 gh2Var4;
        boolean z5;
        c cVar4;
        vl1 vl1Var3;
        w33 w33VarV;
        int i12;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(-1708189280);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (kk0Var.i(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) == 0) {
            if ((i & 48) == 0) {
                i3 |= kk0Var.j(le1Var) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    cVar2 = cVar;
                    if (kk0Var.h(cVar2)) {
                        i5 = FontInfo.NUMBER_OF_CHAR_CODES;
                    } else {
                        i5 = Uuid.SIZE_BITS;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    if ((i & 3072) == 0) {
                        z3 = z2;
                        if (kk0Var.i(z3)) {
                            i7 = 2048;
                        } else {
                            i7 = 1024;
                        }
                        i3 |= i7;
                    }
                    if ((i & 24576) == 0) {
                        if ((i2 & 16) == 0) {
                            filledShape = rg3Var;
                            if (kk0Var.h(filledShape)) {
                                i12 = 16384;
                            }
                            i3 |= i12;
                        } else {
                            filledShape = rg3Var;
                        }
                        i12 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                        i3 |= i12;
                    } else {
                        filledShape = rg3Var;
                    }
                    if ((196608 & i) == 0) {
                        if ((i2 & 32) == 0) {
                            vl1VarFilledIconToggleButtonColors = vl1Var;
                            int i13 = kk0Var.h(vl1VarFilledIconToggleButtonColors) ? 131072 : 65536;
                            i3 |= i13;
                        } else {
                            vl1VarFilledIconToggleButtonColors = vl1Var;
                        }
                        i3 |= i13;
                    } else {
                        vl1VarFilledIconToggleButtonColors = vl1Var;
                    }
                    i8 = i2 & 64;
                    if (i8 != 0) {
                        if ((1572864 & i) == 0) {
                            gh2Var2 = gh2Var;
                            if (kk0Var.h(gh2Var2)) {
                                i9 = 1048576;
                            } else {
                                i9 = 524288;
                            }
                            i3 |= i9;
                        }
                        if ((i2 & Uuid.SIZE_BITS) != 0) {
                            i3 |= 12582912;
                        } else if ((i & 12582912) == 0) {
                            if (kk0Var.j(ne1Var)) {
                                i10 = 8388608;
                            } else {
                                i10 = 4194304;
                            }
                            i3 |= i10;
                        }
                        if ((4793491 & i3) == 4793490 || !kk0Var.F()) {
                            kk0Var.X();
                            if ((i & 1) != 0 || kk0Var.D()) {
                                if (i4 != 0) {
                                    cVar2 = c.i;
                                }
                                if (i6 != 0) {
                                    z3 = true;
                                }
                                i11 = i2 & 16;
                                el1Var = el1.a;
                                if (i11 != 0) {
                                    i3 &= -57345;
                                    filledShape = el1Var.getFilledShape(kk0Var, 6);
                                }
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                    vl1VarFilledIconToggleButtonColors = el1Var.filledIconToggleButtonColors(kk0Var, 6);
                                }
                                if (i8 != 0) {
                                    gh2Var3 = null;
                                    cVar3 = cVar2;
                                    z4 = z3;
                                    vl1Var2 = vl1VarFilledIconToggleButtonColors;
                                }
                                int i14 = i3;
                                rg3 rg3Var3 = filledShape;
                                kk0Var.s();
                                int i15 = i14 >> 9;
                                int i16 = (i15 & 896) | (i15 & 14) | ((i14 << 3) & 112);
                                boolean z6 = z4;
                                hq3.m212x54dd086a(z, le1Var, we3.b(cVar3, false, fl1.h), z6, rg3Var3, ((re0) vl1Var2.containerColor$material3_release(z4, z, kk0Var, i16).getValue()).a, ((re0) vl1Var2.contentColor$material3_release(z4, z, kk0Var, i16).getValue()).a, 0.0f, 0.0f, (iw) null, gh2Var3, zg0.rememberComposableLambda(1235871670, true, new il1(ne1Var), kk0Var, 54), kk0Var, i14 & 64638, ((i14 >> 18) & 14) | 48, 896);
                                rg3Var2 = rg3Var3;
                                gh2Var4 = gh2Var3;
                                z5 = z6;
                                cVar4 = cVar3;
                                vl1Var3 = vl1Var2;
                            } else {
                                kk0Var.V();
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                }
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                }
                            }
                            cVar3 = cVar2;
                            z4 = z3;
                            vl1Var2 = vl1VarFilledIconToggleButtonColors;
                            gh2Var3 = gh2Var2;
                            int i17 = i3;
                            rg3 rg3Var4 = filledShape;
                            kk0Var.s();
                            int i18 = i17 >> 9;
                            int i19 = (i18 & 896) | (i18 & 14) | ((i17 << 3) & 112);
                            boolean z7 = z4;
                            hq3.m212x54dd086a(z, le1Var, we3.b(cVar3, false, fl1.h), z7, rg3Var4, ((re0) vl1Var2.containerColor$material3_release(z4, z, kk0Var, i19).getValue()).a, ((re0) vl1Var2.contentColor$material3_release(z4, z, kk0Var, i19).getValue()).a, 0.0f, 0.0f, (iw) null, gh2Var3, zg0.rememberComposableLambda(1235871670, true, new il1(ne1Var), kk0Var, 54), kk0Var, i17 & 64638, ((i17 >> 18) & 14) | 48, 896);
                            rg3Var2 = rg3Var4;
                            gh2Var4 = gh2Var3;
                            z5 = z7;
                            cVar4 = cVar3;
                            vl1Var3 = vl1Var2;
                        } else {
                            kk0Var.V();
                            cVar4 = cVar2;
                            z5 = z3;
                            rg3Var2 = filledShape;
                            vl1Var3 = vl1VarFilledIconToggleButtonColors;
                            gh2Var4 = gh2Var2;
                        }
                        w33VarV = kk0Var.v();
                        if (w33VarV != null) {
                            w33VarV.updateScope(new jl1(z, le1Var, cVar4, z5, rg3Var2, vl1Var3, gh2Var4, ne1Var, i, i2, 0));
                        }
                    }
                    i3 |= 1572864;
                    gh2Var2 = gh2Var;
                    if ((i2 & Uuid.SIZE_BITS) != 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        if (kk0Var.j(ne1Var)) {
                            i10 = 8388608;
                        } else {
                            i10 = 4194304;
                        }
                        i3 |= i10;
                    }
                    if ((4793491 & i3) == 4793490) {
                        kk0Var.X();
                        if ((i & 1) != 0) {
                            if (i4 != 0) {
                                cVar2 = c.i;
                            }
                            if (i6 != 0) {
                                z3 = true;
                            }
                            i11 = i2 & 16;
                            el1Var = el1.a;
                            if (i11 != 0) {
                                i3 &= -57345;
                                filledShape = el1Var.getFilledShape(kk0Var, 6);
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                                vl1VarFilledIconToggleButtonColors = el1Var.filledIconToggleButtonColors(kk0Var, 6);
                            }
                            if (i8 != 0) {
                                gh2Var3 = null;
                                cVar3 = cVar2;
                                z4 = z3;
                                vl1Var2 = vl1VarFilledIconToggleButtonColors;
                            } else {
                                cVar3 = cVar2;
                                z4 = z3;
                                vl1Var2 = vl1VarFilledIconToggleButtonColors;
                                gh2Var3 = gh2Var2;
                            }
                        } else {
                            if (i4 != 0) {
                                cVar2 = c.i;
                            }
                            if (i6 != 0) {
                                z3 = true;
                            }
                            i11 = i2 & 16;
                            el1Var = el1.a;
                            if (i11 != 0) {
                                i3 &= -57345;
                                filledShape = el1Var.getFilledShape(kk0Var, 6);
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                                vl1VarFilledIconToggleButtonColors = el1Var.filledIconToggleButtonColors(kk0Var, 6);
                            }
                            if (i8 != 0) {
                                gh2Var3 = null;
                                cVar3 = cVar2;
                                z4 = z3;
                                vl1Var2 = vl1VarFilledIconToggleButtonColors;
                            } else {
                                cVar3 = cVar2;
                                z4 = z3;
                                vl1Var2 = vl1VarFilledIconToggleButtonColors;
                                gh2Var3 = gh2Var2;
                            }
                        }
                        int i110 = i3;
                        rg3 rg3Var5 = filledShape;
                        kk0Var.s();
                        int i111 = i110 >> 9;
                        int i112 = (i111 & 896) | (i111 & 14) | ((i110 << 3) & 112);
                        boolean z8 = z4;
                        hq3.m212x54dd086a(z, le1Var, we3.b(cVar3, false, fl1.h), z8, rg3Var5, ((re0) vl1Var2.containerColor$material3_release(z4, z, kk0Var, i112).getValue()).a, ((re0) vl1Var2.contentColor$material3_release(z4, z, kk0Var, i112).getValue()).a, 0.0f, 0.0f, (iw) null, gh2Var3, zg0.rememberComposableLambda(1235871670, true, new il1(ne1Var), kk0Var, 54), kk0Var, i110 & 64638, ((i110 >> 18) & 14) | 48, 896);
                        rg3Var2 = rg3Var5;
                        gh2Var4 = gh2Var3;
                        z5 = z8;
                        cVar4 = cVar3;
                        vl1Var3 = vl1Var2;
                    } else {
                        kk0Var.X();
                        if ((i & 1) != 0) {
                            if (i4 != 0) {
                                cVar2 = c.i;
                            }
                            if (i6 != 0) {
                                z3 = true;
                            }
                            i11 = i2 & 16;
                            el1Var = el1.a;
                            if (i11 != 0) {
                                i3 &= -57345;
                                filledShape = el1Var.getFilledShape(kk0Var, 6);
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                                vl1VarFilledIconToggleButtonColors = el1Var.filledIconToggleButtonColors(kk0Var, 6);
                            }
                            if (i8 != 0) {
                                gh2Var3 = null;
                                cVar3 = cVar2;
                                z4 = z3;
                                vl1Var2 = vl1VarFilledIconToggleButtonColors;
                            } else {
                                cVar3 = cVar2;
                                z4 = z3;
                                vl1Var2 = vl1VarFilledIconToggleButtonColors;
                                gh2Var3 = gh2Var2;
                            }
                        } else {
                            if (i4 != 0) {
                                cVar2 = c.i;
                            }
                            if (i6 != 0) {
                                z3 = true;
                            }
                            i11 = i2 & 16;
                            el1Var = el1.a;
                            if (i11 != 0) {
                                i3 &= -57345;
                                filledShape = el1Var.getFilledShape(kk0Var, 6);
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                                vl1VarFilledIconToggleButtonColors = el1Var.filledIconToggleButtonColors(kk0Var, 6);
                            }
                            if (i8 != 0) {
                                gh2Var3 = null;
                                cVar3 = cVar2;
                                z4 = z3;
                                vl1Var2 = vl1VarFilledIconToggleButtonColors;
                            } else {
                                cVar3 = cVar2;
                                z4 = z3;
                                vl1Var2 = vl1VarFilledIconToggleButtonColors;
                                gh2Var3 = gh2Var2;
                            }
                        }
                        int i113 = i3;
                        rg3 rg3Var6 = filledShape;
                        kk0Var.s();
                        int i114 = i113 >> 9;
                        int i115 = (i114 & 896) | (i114 & 14) | ((i113 << 3) & 112);
                        boolean z9 = z4;
                        hq3.m212x54dd086a(z, le1Var, we3.b(cVar3, false, fl1.h), z9, rg3Var6, ((re0) vl1Var2.containerColor$material3_release(z4, z, kk0Var, i115).getValue()).a, ((re0) vl1Var2.contentColor$material3_release(z4, z, kk0Var, i115).getValue()).a, 0.0f, 0.0f, (iw) null, gh2Var3, zg0.rememberComposableLambda(1235871670, true, new il1(ne1Var), kk0Var, 54), kk0Var, i113 & 64638, ((i113 >> 18) & 14) | 48, 896);
                        rg3Var2 = rg3Var6;
                        gh2Var4 = gh2Var3;
                        z5 = z9;
                        cVar4 = cVar3;
                        vl1Var3 = vl1Var2;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new jl1(z, le1Var, cVar4, z5, rg3Var2, vl1Var3, gh2Var4, ne1Var, i, i2, 0));
                    }
                }
                i3 |= 3072;
                z3 = z2;
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        filledShape = rg3Var;
                        if (kk0Var.h(filledShape)) {
                            i12 = 16384;
                        }
                        i3 |= i12;
                    } else {
                        filledShape = rg3Var;
                    }
                    i12 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                    i3 |= i12;
                } else {
                    filledShape = rg3Var;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        vl1VarFilledIconToggleButtonColors = vl1Var;
                        if (kk0Var.h(vl1VarFilledIconToggleButtonColors)) {
                        }
                        i3 |= i13;
                    } else {
                        vl1VarFilledIconToggleButtonColors = vl1Var;
                    }
                    i3 |= i13;
                } else {
                    vl1VarFilledIconToggleButtonColors = vl1Var;
                }
                i8 = i2 & 64;
                if (i8 != 0) {
                    if ((1572864 & i) == 0) {
                        gh2Var2 = gh2Var;
                        if (kk0Var.h(gh2Var2)) {
                            i9 = 1048576;
                        } else {
                            i9 = 524288;
                        }
                        i3 |= i9;
                    }
                    if ((i2 & Uuid.SIZE_BITS) != 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        if (kk0Var.j(ne1Var)) {
                            i10 = 8388608;
                        } else {
                            i10 = 4194304;
                        }
                        i3 |= i10;
                    }
                    if ((4793491 & i3) == 4793490) {
                        kk0Var.X();
                        if ((i & 1) != 0) {
                            if (i4 != 0) {
                                cVar2 = c.i;
                            }
                            if (i6 != 0) {
                                z3 = true;
                            }
                            i11 = i2 & 16;
                            el1Var = el1.a;
                            if (i11 != 0) {
                                i3 &= -57345;
                                filledShape = el1Var.getFilledShape(kk0Var, 6);
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                                vl1VarFilledIconToggleButtonColors = el1Var.filledIconToggleButtonColors(kk0Var, 6);
                            }
                            if (i8 != 0) {
                                gh2Var3 = null;
                                cVar3 = cVar2;
                                z4 = z3;
                                vl1Var2 = vl1VarFilledIconToggleButtonColors;
                            } else {
                                cVar3 = cVar2;
                                z4 = z3;
                                vl1Var2 = vl1VarFilledIconToggleButtonColors;
                                gh2Var3 = gh2Var2;
                            }
                        } else {
                            if (i4 != 0) {
                                cVar2 = c.i;
                            }
                            if (i6 != 0) {
                                z3 = true;
                            }
                            i11 = i2 & 16;
                            el1Var = el1.a;
                            if (i11 != 0) {
                                i3 &= -57345;
                                filledShape = el1Var.getFilledShape(kk0Var, 6);
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                                vl1VarFilledIconToggleButtonColors = el1Var.filledIconToggleButtonColors(kk0Var, 6);
                            }
                            if (i8 != 0) {
                                gh2Var3 = null;
                                cVar3 = cVar2;
                                z4 = z3;
                                vl1Var2 = vl1VarFilledIconToggleButtonColors;
                            } else {
                                cVar3 = cVar2;
                                z4 = z3;
                                vl1Var2 = vl1VarFilledIconToggleButtonColors;
                                gh2Var3 = gh2Var2;
                            }
                        }
                        int i116 = i3;
                        rg3 rg3Var7 = filledShape;
                        kk0Var.s();
                        int i117 = i116 >> 9;
                        int i118 = (i117 & 896) | (i117 & 14) | ((i116 << 3) & 112);
                        boolean z10 = z4;
                        hq3.m212x54dd086a(z, le1Var, we3.b(cVar3, false, fl1.h), z10, rg3Var7, ((re0) vl1Var2.containerColor$material3_release(z4, z, kk0Var, i118).getValue()).a, ((re0) vl1Var2.contentColor$material3_release(z4, z, kk0Var, i118).getValue()).a, 0.0f, 0.0f, (iw) null, gh2Var3, zg0.rememberComposableLambda(1235871670, true, new il1(ne1Var), kk0Var, 54), kk0Var, i116 & 64638, ((i116 >> 18) & 14) | 48, 896);
                        rg3Var2 = rg3Var7;
                        gh2Var4 = gh2Var3;
                        z5 = z10;
                        cVar4 = cVar3;
                        vl1Var3 = vl1Var2;
                    } else {
                        kk0Var.X();
                        if ((i & 1) != 0) {
                            if (i4 != 0) {
                                cVar2 = c.i;
                            }
                            if (i6 != 0) {
                                z3 = true;
                            }
                            i11 = i2 & 16;
                            el1Var = el1.a;
                            if (i11 != 0) {
                                i3 &= -57345;
                                filledShape = el1Var.getFilledShape(kk0Var, 6);
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                                vl1VarFilledIconToggleButtonColors = el1Var.filledIconToggleButtonColors(kk0Var, 6);
                            }
                            if (i8 != 0) {
                                gh2Var3 = null;
                                cVar3 = cVar2;
                                z4 = z3;
                                vl1Var2 = vl1VarFilledIconToggleButtonColors;
                            } else {
                                cVar3 = cVar2;
                                z4 = z3;
                                vl1Var2 = vl1VarFilledIconToggleButtonColors;
                                gh2Var3 = gh2Var2;
                            }
                        } else {
                            if (i4 != 0) {
                                cVar2 = c.i;
                            }
                            if (i6 != 0) {
                                z3 = true;
                            }
                            i11 = i2 & 16;
                            el1Var = el1.a;
                            if (i11 != 0) {
                                i3 &= -57345;
                                filledShape = el1Var.getFilledShape(kk0Var, 6);
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                                vl1VarFilledIconToggleButtonColors = el1Var.filledIconToggleButtonColors(kk0Var, 6);
                            }
                            if (i8 != 0) {
                                gh2Var3 = null;
                                cVar3 = cVar2;
                                z4 = z3;
                                vl1Var2 = vl1VarFilledIconToggleButtonColors;
                            } else {
                                cVar3 = cVar2;
                                z4 = z3;
                                vl1Var2 = vl1VarFilledIconToggleButtonColors;
                                gh2Var3 = gh2Var2;
                            }
                        }
                        int i119 = i3;
                        rg3 rg3Var8 = filledShape;
                        kk0Var.s();
                        int i1110 = i119 >> 9;
                        int i1111 = (i1110 & 896) | (i1110 & 14) | ((i119 << 3) & 112);
                        boolean z11 = z4;
                        hq3.m212x54dd086a(z, le1Var, we3.b(cVar3, false, fl1.h), z11, rg3Var8, ((re0) vl1Var2.containerColor$material3_release(z4, z, kk0Var, i1111).getValue()).a, ((re0) vl1Var2.contentColor$material3_release(z4, z, kk0Var, i1111).getValue()).a, 0.0f, 0.0f, (iw) null, gh2Var3, zg0.rememberComposableLambda(1235871670, true, new il1(ne1Var), kk0Var, 54), kk0Var, i119 & 64638, ((i119 >> 18) & 14) | 48, 896);
                        rg3Var2 = rg3Var8;
                        gh2Var4 = gh2Var3;
                        z5 = z11;
                        cVar4 = cVar3;
                        vl1Var3 = vl1Var2;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new jl1(z, le1Var, cVar4, z5, rg3Var2, vl1Var3, gh2Var4, ne1Var, i, i2, 0));
                    }
                }
                i3 |= 1572864;
                gh2Var2 = gh2Var;
                if ((i2 & Uuid.SIZE_BITS) != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    if (kk0Var.j(ne1Var)) {
                        i10 = 8388608;
                    } else {
                        i10 = 4194304;
                    }
                    i3 |= i10;
                }
                if ((4793491 & i3) == 4793490) {
                    kk0Var.X();
                    if ((i & 1) != 0) {
                        if (i4 != 0) {
                            cVar2 = c.i;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        }
                        i11 = i2 & 16;
                        el1Var = el1.a;
                        if (i11 != 0) {
                            i3 &= -57345;
                            filledShape = el1Var.getFilledShape(kk0Var, 6);
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            vl1VarFilledIconToggleButtonColors = el1Var.filledIconToggleButtonColors(kk0Var, 6);
                        }
                        if (i8 != 0) {
                            gh2Var3 = null;
                            cVar3 = cVar2;
                            z4 = z3;
                            vl1Var2 = vl1VarFilledIconToggleButtonColors;
                        } else {
                            cVar3 = cVar2;
                            z4 = z3;
                            vl1Var2 = vl1VarFilledIconToggleButtonColors;
                            gh2Var3 = gh2Var2;
                        }
                    } else {
                        if (i4 != 0) {
                            cVar2 = c.i;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        }
                        i11 = i2 & 16;
                        el1Var = el1.a;
                        if (i11 != 0) {
                            i3 &= -57345;
                            filledShape = el1Var.getFilledShape(kk0Var, 6);
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            vl1VarFilledIconToggleButtonColors = el1Var.filledIconToggleButtonColors(kk0Var, 6);
                        }
                        if (i8 != 0) {
                            gh2Var3 = null;
                            cVar3 = cVar2;
                            z4 = z3;
                            vl1Var2 = vl1VarFilledIconToggleButtonColors;
                        } else {
                            cVar3 = cVar2;
                            z4 = z3;
                            vl1Var2 = vl1VarFilledIconToggleButtonColors;
                            gh2Var3 = gh2Var2;
                        }
                    }
                    int i1112 = i3;
                    rg3 rg3Var9 = filledShape;
                    kk0Var.s();
                    int i1113 = i1112 >> 9;
                    int i1114 = (i1113 & 896) | (i1113 & 14) | ((i1112 << 3) & 112);
                    boolean z12 = z4;
                    hq3.m212x54dd086a(z, le1Var, we3.b(cVar3, false, fl1.h), z12, rg3Var9, ((re0) vl1Var2.containerColor$material3_release(z4, z, kk0Var, i1114).getValue()).a, ((re0) vl1Var2.contentColor$material3_release(z4, z, kk0Var, i1114).getValue()).a, 0.0f, 0.0f, (iw) null, gh2Var3, zg0.rememberComposableLambda(1235871670, true, new il1(ne1Var), kk0Var, 54), kk0Var, i1112 & 64638, ((i1112 >> 18) & 14) | 48, 896);
                    rg3Var2 = rg3Var9;
                    gh2Var4 = gh2Var3;
                    z5 = z12;
                    cVar4 = cVar3;
                    vl1Var3 = vl1Var2;
                } else {
                    kk0Var.X();
                    if ((i & 1) != 0) {
                        if (i4 != 0) {
                            cVar2 = c.i;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        }
                        i11 = i2 & 16;
                        el1Var = el1.a;
                        if (i11 != 0) {
                            i3 &= -57345;
                            filledShape = el1Var.getFilledShape(kk0Var, 6);
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            vl1VarFilledIconToggleButtonColors = el1Var.filledIconToggleButtonColors(kk0Var, 6);
                        }
                        if (i8 != 0) {
                            gh2Var3 = null;
                            cVar3 = cVar2;
                            z4 = z3;
                            vl1Var2 = vl1VarFilledIconToggleButtonColors;
                        } else {
                            cVar3 = cVar2;
                            z4 = z3;
                            vl1Var2 = vl1VarFilledIconToggleButtonColors;
                            gh2Var3 = gh2Var2;
                        }
                    } else {
                        if (i4 != 0) {
                            cVar2 = c.i;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        }
                        i11 = i2 & 16;
                        el1Var = el1.a;
                        if (i11 != 0) {
                            i3 &= -57345;
                            filledShape = el1Var.getFilledShape(kk0Var, 6);
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            vl1VarFilledIconToggleButtonColors = el1Var.filledIconToggleButtonColors(kk0Var, 6);
                        }
                        if (i8 != 0) {
                            gh2Var3 = null;
                            cVar3 = cVar2;
                            z4 = z3;
                            vl1Var2 = vl1VarFilledIconToggleButtonColors;
                        } else {
                            cVar3 = cVar2;
                            z4 = z3;
                            vl1Var2 = vl1VarFilledIconToggleButtonColors;
                            gh2Var3 = gh2Var2;
                        }
                    }
                    int i1115 = i3;
                    rg3 rg3Var10 = filledShape;
                    kk0Var.s();
                    int i1116 = i1115 >> 9;
                    int i1117 = (i1116 & 896) | (i1116 & 14) | ((i1115 << 3) & 112);
                    boolean z13 = z4;
                    hq3.m212x54dd086a(z, le1Var, we3.b(cVar3, false, fl1.h), z13, rg3Var10, ((re0) vl1Var2.containerColor$material3_release(z4, z, kk0Var, i1117).getValue()).a, ((re0) vl1Var2.contentColor$material3_release(z4, z, kk0Var, i1117).getValue()).a, 0.0f, 0.0f, (iw) null, gh2Var3, zg0.rememberComposableLambda(1235871670, true, new il1(ne1Var), kk0Var, 54), kk0Var, i1115 & 64638, ((i1115 >> 18) & 14) | 48, 896);
                    rg3Var2 = rg3Var10;
                    gh2Var4 = gh2Var3;
                    z5 = z13;
                    cVar4 = cVar3;
                    vl1Var3 = vl1Var2;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new jl1(z, le1Var, cVar4, z5, rg3Var2, vl1Var3, gh2Var4, ne1Var, i, i2, 0));
                }
            }
            i3 |= 384;
            cVar2 = cVar;
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    z3 = z2;
                    if (kk0Var.i(z3)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        filledShape = rg3Var;
                        if (kk0Var.h(filledShape)) {
                            i12 = 16384;
                        }
                        i3 |= i12;
                    } else {
                        filledShape = rg3Var;
                    }
                    i12 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                    i3 |= i12;
                } else {
                    filledShape = rg3Var;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        vl1VarFilledIconToggleButtonColors = vl1Var;
                        if (kk0Var.h(vl1VarFilledIconToggleButtonColors)) {
                        }
                        i3 |= i13;
                    } else {
                        vl1VarFilledIconToggleButtonColors = vl1Var;
                    }
                    i3 |= i13;
                } else {
                    vl1VarFilledIconToggleButtonColors = vl1Var;
                }
                i8 = i2 & 64;
                if (i8 != 0) {
                    if ((1572864 & i) == 0) {
                        gh2Var2 = gh2Var;
                        if (kk0Var.h(gh2Var2)) {
                            i9 = 1048576;
                        } else {
                            i9 = 524288;
                        }
                        i3 |= i9;
                    }
                    if ((i2 & Uuid.SIZE_BITS) != 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        if (kk0Var.j(ne1Var)) {
                            i10 = 8388608;
                        } else {
                            i10 = 4194304;
                        }
                        i3 |= i10;
                    }
                    if ((4793491 & i3) == 4793490) {
                        kk0Var.X();
                        if ((i & 1) != 0) {
                            if (i4 != 0) {
                                cVar2 = c.i;
                            }
                            if (i6 != 0) {
                                z3 = true;
                            }
                            i11 = i2 & 16;
                            el1Var = el1.a;
                            if (i11 != 0) {
                                i3 &= -57345;
                                filledShape = el1Var.getFilledShape(kk0Var, 6);
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                                vl1VarFilledIconToggleButtonColors = el1Var.filledIconToggleButtonColors(kk0Var, 6);
                            }
                            if (i8 != 0) {
                                gh2Var3 = null;
                                cVar3 = cVar2;
                                z4 = z3;
                                vl1Var2 = vl1VarFilledIconToggleButtonColors;
                            } else {
                                cVar3 = cVar2;
                                z4 = z3;
                                vl1Var2 = vl1VarFilledIconToggleButtonColors;
                                gh2Var3 = gh2Var2;
                            }
                        } else {
                            if (i4 != 0) {
                                cVar2 = c.i;
                            }
                            if (i6 != 0) {
                                z3 = true;
                            }
                            i11 = i2 & 16;
                            el1Var = el1.a;
                            if (i11 != 0) {
                                i3 &= -57345;
                                filledShape = el1Var.getFilledShape(kk0Var, 6);
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                                vl1VarFilledIconToggleButtonColors = el1Var.filledIconToggleButtonColors(kk0Var, 6);
                            }
                            if (i8 != 0) {
                                gh2Var3 = null;
                                cVar3 = cVar2;
                                z4 = z3;
                                vl1Var2 = vl1VarFilledIconToggleButtonColors;
                            } else {
                                cVar3 = cVar2;
                                z4 = z3;
                                vl1Var2 = vl1VarFilledIconToggleButtonColors;
                                gh2Var3 = gh2Var2;
                            }
                        }
                        int i1118 = i3;
                        rg3 rg3Var11 = filledShape;
                        kk0Var.s();
                        int i1119 = i1118 >> 9;
                        int i11110 = (i1119 & 896) | (i1119 & 14) | ((i1118 << 3) & 112);
                        boolean z14 = z4;
                        hq3.m212x54dd086a(z, le1Var, we3.b(cVar3, false, fl1.h), z14, rg3Var11, ((re0) vl1Var2.containerColor$material3_release(z4, z, kk0Var, i11110).getValue()).a, ((re0) vl1Var2.contentColor$material3_release(z4, z, kk0Var, i11110).getValue()).a, 0.0f, 0.0f, (iw) null, gh2Var3, zg0.rememberComposableLambda(1235871670, true, new il1(ne1Var), kk0Var, 54), kk0Var, i1118 & 64638, ((i1118 >> 18) & 14) | 48, 896);
                        rg3Var2 = rg3Var11;
                        gh2Var4 = gh2Var3;
                        z5 = z14;
                        cVar4 = cVar3;
                        vl1Var3 = vl1Var2;
                    } else {
                        kk0Var.X();
                        if ((i & 1) != 0) {
                            if (i4 != 0) {
                                cVar2 = c.i;
                            }
                            if (i6 != 0) {
                                z3 = true;
                            }
                            i11 = i2 & 16;
                            el1Var = el1.a;
                            if (i11 != 0) {
                                i3 &= -57345;
                                filledShape = el1Var.getFilledShape(kk0Var, 6);
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                                vl1VarFilledIconToggleButtonColors = el1Var.filledIconToggleButtonColors(kk0Var, 6);
                            }
                            if (i8 != 0) {
                                gh2Var3 = null;
                                cVar3 = cVar2;
                                z4 = z3;
                                vl1Var2 = vl1VarFilledIconToggleButtonColors;
                            } else {
                                cVar3 = cVar2;
                                z4 = z3;
                                vl1Var2 = vl1VarFilledIconToggleButtonColors;
                                gh2Var3 = gh2Var2;
                            }
                        } else {
                            if (i4 != 0) {
                                cVar2 = c.i;
                            }
                            if (i6 != 0) {
                                z3 = true;
                            }
                            i11 = i2 & 16;
                            el1Var = el1.a;
                            if (i11 != 0) {
                                i3 &= -57345;
                                filledShape = el1Var.getFilledShape(kk0Var, 6);
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                                vl1VarFilledIconToggleButtonColors = el1Var.filledIconToggleButtonColors(kk0Var, 6);
                            }
                            if (i8 != 0) {
                                gh2Var3 = null;
                                cVar3 = cVar2;
                                z4 = z3;
                                vl1Var2 = vl1VarFilledIconToggleButtonColors;
                            } else {
                                cVar3 = cVar2;
                                z4 = z3;
                                vl1Var2 = vl1VarFilledIconToggleButtonColors;
                                gh2Var3 = gh2Var2;
                            }
                        }
                        int i11111 = i3;
                        rg3 rg3Var12 = filledShape;
                        kk0Var.s();
                        int i11112 = i11111 >> 9;
                        int i11113 = (i11112 & 896) | (i11112 & 14) | ((i11111 << 3) & 112);
                        boolean z15 = z4;
                        hq3.m212x54dd086a(z, le1Var, we3.b(cVar3, false, fl1.h), z15, rg3Var12, ((re0) vl1Var2.containerColor$material3_release(z4, z, kk0Var, i11113).getValue()).a, ((re0) vl1Var2.contentColor$material3_release(z4, z, kk0Var, i11113).getValue()).a, 0.0f, 0.0f, (iw) null, gh2Var3, zg0.rememberComposableLambda(1235871670, true, new il1(ne1Var), kk0Var, 54), kk0Var, i11111 & 64638, ((i11111 >> 18) & 14) | 48, 896);
                        rg3Var2 = rg3Var12;
                        gh2Var4 = gh2Var3;
                        z5 = z15;
                        cVar4 = cVar3;
                        vl1Var3 = vl1Var2;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new jl1(z, le1Var, cVar4, z5, rg3Var2, vl1Var3, gh2Var4, ne1Var, i, i2, 0));
                    }
                }
                i3 |= 1572864;
                gh2Var2 = gh2Var;
                if ((i2 & Uuid.SIZE_BITS) != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    if (kk0Var.j(ne1Var)) {
                        i10 = 8388608;
                    } else {
                        i10 = 4194304;
                    }
                    i3 |= i10;
                }
                if ((4793491 & i3) == 4793490) {
                    kk0Var.X();
                    if ((i & 1) != 0) {
                        if (i4 != 0) {
                            cVar2 = c.i;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        }
                        i11 = i2 & 16;
                        el1Var = el1.a;
                        if (i11 != 0) {
                            i3 &= -57345;
                            filledShape = el1Var.getFilledShape(kk0Var, 6);
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            vl1VarFilledIconToggleButtonColors = el1Var.filledIconToggleButtonColors(kk0Var, 6);
                        }
                        if (i8 != 0) {
                            gh2Var3 = null;
                            cVar3 = cVar2;
                            z4 = z3;
                            vl1Var2 = vl1VarFilledIconToggleButtonColors;
                        } else {
                            cVar3 = cVar2;
                            z4 = z3;
                            vl1Var2 = vl1VarFilledIconToggleButtonColors;
                            gh2Var3 = gh2Var2;
                        }
                    } else {
                        if (i4 != 0) {
                            cVar2 = c.i;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        }
                        i11 = i2 & 16;
                        el1Var = el1.a;
                        if (i11 != 0) {
                            i3 &= -57345;
                            filledShape = el1Var.getFilledShape(kk0Var, 6);
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            vl1VarFilledIconToggleButtonColors = el1Var.filledIconToggleButtonColors(kk0Var, 6);
                        }
                        if (i8 != 0) {
                            gh2Var3 = null;
                            cVar3 = cVar2;
                            z4 = z3;
                            vl1Var2 = vl1VarFilledIconToggleButtonColors;
                        } else {
                            cVar3 = cVar2;
                            z4 = z3;
                            vl1Var2 = vl1VarFilledIconToggleButtonColors;
                            gh2Var3 = gh2Var2;
                        }
                    }
                    int i11114 = i3;
                    rg3 rg3Var13 = filledShape;
                    kk0Var.s();
                    int i11115 = i11114 >> 9;
                    int i11116 = (i11115 & 896) | (i11115 & 14) | ((i11114 << 3) & 112);
                    boolean z16 = z4;
                    hq3.m212x54dd086a(z, le1Var, we3.b(cVar3, false, fl1.h), z16, rg3Var13, ((re0) vl1Var2.containerColor$material3_release(z4, z, kk0Var, i11116).getValue()).a, ((re0) vl1Var2.contentColor$material3_release(z4, z, kk0Var, i11116).getValue()).a, 0.0f, 0.0f, (iw) null, gh2Var3, zg0.rememberComposableLambda(1235871670, true, new il1(ne1Var), kk0Var, 54), kk0Var, i11114 & 64638, ((i11114 >> 18) & 14) | 48, 896);
                    rg3Var2 = rg3Var13;
                    gh2Var4 = gh2Var3;
                    z5 = z16;
                    cVar4 = cVar3;
                    vl1Var3 = vl1Var2;
                } else {
                    kk0Var.X();
                    if ((i & 1) != 0) {
                        if (i4 != 0) {
                            cVar2 = c.i;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        }
                        i11 = i2 & 16;
                        el1Var = el1.a;
                        if (i11 != 0) {
                            i3 &= -57345;
                            filledShape = el1Var.getFilledShape(kk0Var, 6);
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            vl1VarFilledIconToggleButtonColors = el1Var.filledIconToggleButtonColors(kk0Var, 6);
                        }
                        if (i8 != 0) {
                            gh2Var3 = null;
                            cVar3 = cVar2;
                            z4 = z3;
                            vl1Var2 = vl1VarFilledIconToggleButtonColors;
                        } else {
                            cVar3 = cVar2;
                            z4 = z3;
                            vl1Var2 = vl1VarFilledIconToggleButtonColors;
                            gh2Var3 = gh2Var2;
                        }
                    } else {
                        if (i4 != 0) {
                            cVar2 = c.i;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        }
                        i11 = i2 & 16;
                        el1Var = el1.a;
                        if (i11 != 0) {
                            i3 &= -57345;
                            filledShape = el1Var.getFilledShape(kk0Var, 6);
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            vl1VarFilledIconToggleButtonColors = el1Var.filledIconToggleButtonColors(kk0Var, 6);
                        }
                        if (i8 != 0) {
                            gh2Var3 = null;
                            cVar3 = cVar2;
                            z4 = z3;
                            vl1Var2 = vl1VarFilledIconToggleButtonColors;
                        } else {
                            cVar3 = cVar2;
                            z4 = z3;
                            vl1Var2 = vl1VarFilledIconToggleButtonColors;
                            gh2Var3 = gh2Var2;
                        }
                    }
                    int i11117 = i3;
                    rg3 rg3Var14 = filledShape;
                    kk0Var.s();
                    int i11118 = i11117 >> 9;
                    int i11119 = (i11118 & 896) | (i11118 & 14) | ((i11117 << 3) & 112);
                    boolean z17 = z4;
                    hq3.m212x54dd086a(z, le1Var, we3.b(cVar3, false, fl1.h), z17, rg3Var14, ((re0) vl1Var2.containerColor$material3_release(z4, z, kk0Var, i11119).getValue()).a, ((re0) vl1Var2.contentColor$material3_release(z4, z, kk0Var, i11119).getValue()).a, 0.0f, 0.0f, (iw) null, gh2Var3, zg0.rememberComposableLambda(1235871670, true, new il1(ne1Var), kk0Var, 54), kk0Var, i11117 & 64638, ((i11117 >> 18) & 14) | 48, 896);
                    rg3Var2 = rg3Var14;
                    gh2Var4 = gh2Var3;
                    z5 = z17;
                    cVar4 = cVar3;
                    vl1Var3 = vl1Var2;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new jl1(z, le1Var, cVar4, z5, rg3Var2, vl1Var3, gh2Var4, ne1Var, i, i2, 0));
                }
            }
            i3 |= 3072;
            z3 = z2;
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    filledShape = rg3Var;
                    if (kk0Var.h(filledShape)) {
                        i12 = 16384;
                    }
                    i3 |= i12;
                } else {
                    filledShape = rg3Var;
                }
                i12 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                i3 |= i12;
            } else {
                filledShape = rg3Var;
            }
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0) {
                    vl1VarFilledIconToggleButtonColors = vl1Var;
                    if (kk0Var.h(vl1VarFilledIconToggleButtonColors)) {
                    }
                    i3 |= i13;
                } else {
                    vl1VarFilledIconToggleButtonColors = vl1Var;
                }
                i3 |= i13;
            } else {
                vl1VarFilledIconToggleButtonColors = vl1Var;
            }
            i8 = i2 & 64;
            if (i8 != 0) {
                if ((1572864 & i) == 0) {
                    gh2Var2 = gh2Var;
                    if (kk0Var.h(gh2Var2)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i3 |= i9;
                }
                if ((i2 & Uuid.SIZE_BITS) != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    if (kk0Var.j(ne1Var)) {
                        i10 = 8388608;
                    } else {
                        i10 = 4194304;
                    }
                    i3 |= i10;
                }
                if ((4793491 & i3) == 4793490) {
                    kk0Var.X();
                    if ((i & 1) != 0) {
                        if (i4 != 0) {
                            cVar2 = c.i;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        }
                        i11 = i2 & 16;
                        el1Var = el1.a;
                        if (i11 != 0) {
                            i3 &= -57345;
                            filledShape = el1Var.getFilledShape(kk0Var, 6);
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            vl1VarFilledIconToggleButtonColors = el1Var.filledIconToggleButtonColors(kk0Var, 6);
                        }
                        if (i8 != 0) {
                            gh2Var3 = null;
                            cVar3 = cVar2;
                            z4 = z3;
                            vl1Var2 = vl1VarFilledIconToggleButtonColors;
                        } else {
                            cVar3 = cVar2;
                            z4 = z3;
                            vl1Var2 = vl1VarFilledIconToggleButtonColors;
                            gh2Var3 = gh2Var2;
                        }
                    } else {
                        if (i4 != 0) {
                            cVar2 = c.i;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        }
                        i11 = i2 & 16;
                        el1Var = el1.a;
                        if (i11 != 0) {
                            i3 &= -57345;
                            filledShape = el1Var.getFilledShape(kk0Var, 6);
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            vl1VarFilledIconToggleButtonColors = el1Var.filledIconToggleButtonColors(kk0Var, 6);
                        }
                        if (i8 != 0) {
                            gh2Var3 = null;
                            cVar3 = cVar2;
                            z4 = z3;
                            vl1Var2 = vl1VarFilledIconToggleButtonColors;
                        } else {
                            cVar3 = cVar2;
                            z4 = z3;
                            vl1Var2 = vl1VarFilledIconToggleButtonColors;
                            gh2Var3 = gh2Var2;
                        }
                    }
                    int i111110 = i3;
                    rg3 rg3Var15 = filledShape;
                    kk0Var.s();
                    int i111111 = i111110 >> 9;
                    int i111112 = (i111111 & 896) | (i111111 & 14) | ((i111110 << 3) & 112);
                    boolean z18 = z4;
                    hq3.m212x54dd086a(z, le1Var, we3.b(cVar3, false, fl1.h), z18, rg3Var15, ((re0) vl1Var2.containerColor$material3_release(z4, z, kk0Var, i111112).getValue()).a, ((re0) vl1Var2.contentColor$material3_release(z4, z, kk0Var, i111112).getValue()).a, 0.0f, 0.0f, (iw) null, gh2Var3, zg0.rememberComposableLambda(1235871670, true, new il1(ne1Var), kk0Var, 54), kk0Var, i111110 & 64638, ((i111110 >> 18) & 14) | 48, 896);
                    rg3Var2 = rg3Var15;
                    gh2Var4 = gh2Var3;
                    z5 = z18;
                    cVar4 = cVar3;
                    vl1Var3 = vl1Var2;
                } else {
                    kk0Var.X();
                    if ((i & 1) != 0) {
                        if (i4 != 0) {
                            cVar2 = c.i;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        }
                        i11 = i2 & 16;
                        el1Var = el1.a;
                        if (i11 != 0) {
                            i3 &= -57345;
                            filledShape = el1Var.getFilledShape(kk0Var, 6);
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            vl1VarFilledIconToggleButtonColors = el1Var.filledIconToggleButtonColors(kk0Var, 6);
                        }
                        if (i8 != 0) {
                            gh2Var3 = null;
                            cVar3 = cVar2;
                            z4 = z3;
                            vl1Var2 = vl1VarFilledIconToggleButtonColors;
                        } else {
                            cVar3 = cVar2;
                            z4 = z3;
                            vl1Var2 = vl1VarFilledIconToggleButtonColors;
                            gh2Var3 = gh2Var2;
                        }
                    } else {
                        if (i4 != 0) {
                            cVar2 = c.i;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        }
                        i11 = i2 & 16;
                        el1Var = el1.a;
                        if (i11 != 0) {
                            i3 &= -57345;
                            filledShape = el1Var.getFilledShape(kk0Var, 6);
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            vl1VarFilledIconToggleButtonColors = el1Var.filledIconToggleButtonColors(kk0Var, 6);
                        }
                        if (i8 != 0) {
                            gh2Var3 = null;
                            cVar3 = cVar2;
                            z4 = z3;
                            vl1Var2 = vl1VarFilledIconToggleButtonColors;
                        } else {
                            cVar3 = cVar2;
                            z4 = z3;
                            vl1Var2 = vl1VarFilledIconToggleButtonColors;
                            gh2Var3 = gh2Var2;
                        }
                    }
                    int i111113 = i3;
                    rg3 rg3Var16 = filledShape;
                    kk0Var.s();
                    int i111114 = i111113 >> 9;
                    int i111115 = (i111114 & 896) | (i111114 & 14) | ((i111113 << 3) & 112);
                    boolean z19 = z4;
                    hq3.m212x54dd086a(z, le1Var, we3.b(cVar3, false, fl1.h), z19, rg3Var16, ((re0) vl1Var2.containerColor$material3_release(z4, z, kk0Var, i111115).getValue()).a, ((re0) vl1Var2.contentColor$material3_release(z4, z, kk0Var, i111115).getValue()).a, 0.0f, 0.0f, (iw) null, gh2Var3, zg0.rememberComposableLambda(1235871670, true, new il1(ne1Var), kk0Var, 54), kk0Var, i111113 & 64638, ((i111113 >> 18) & 14) | 48, 896);
                    rg3Var2 = rg3Var16;
                    gh2Var4 = gh2Var3;
                    z5 = z19;
                    cVar4 = cVar3;
                    vl1Var3 = vl1Var2;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new jl1(z, le1Var, cVar4, z5, rg3Var2, vl1Var3, gh2Var4, ne1Var, i, i2, 0));
                }
            }
            i3 |= 1572864;
            gh2Var2 = gh2Var;
            if ((i2 & Uuid.SIZE_BITS) != 0) {
                i3 |= 12582912;
            } else if ((i & 12582912) == 0) {
                if (kk0Var.j(ne1Var)) {
                    i10 = 8388608;
                } else {
                    i10 = 4194304;
                }
                i3 |= i10;
            }
            if ((4793491 & i3) == 4793490) {
                kk0Var.X();
                if ((i & 1) != 0) {
                    if (i4 != 0) {
                        cVar2 = c.i;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    }
                    i11 = i2 & 16;
                    el1Var = el1.a;
                    if (i11 != 0) {
                        i3 &= -57345;
                        filledShape = el1Var.getFilledShape(kk0Var, 6);
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        vl1VarFilledIconToggleButtonColors = el1Var.filledIconToggleButtonColors(kk0Var, 6);
                    }
                    if (i8 != 0) {
                        gh2Var3 = null;
                        cVar3 = cVar2;
                        z4 = z3;
                        vl1Var2 = vl1VarFilledIconToggleButtonColors;
                    } else {
                        cVar3 = cVar2;
                        z4 = z3;
                        vl1Var2 = vl1VarFilledIconToggleButtonColors;
                        gh2Var3 = gh2Var2;
                    }
                } else {
                    if (i4 != 0) {
                        cVar2 = c.i;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    }
                    i11 = i2 & 16;
                    el1Var = el1.a;
                    if (i11 != 0) {
                        i3 &= -57345;
                        filledShape = el1Var.getFilledShape(kk0Var, 6);
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        vl1VarFilledIconToggleButtonColors = el1Var.filledIconToggleButtonColors(kk0Var, 6);
                    }
                    if (i8 != 0) {
                        gh2Var3 = null;
                        cVar3 = cVar2;
                        z4 = z3;
                        vl1Var2 = vl1VarFilledIconToggleButtonColors;
                    } else {
                        cVar3 = cVar2;
                        z4 = z3;
                        vl1Var2 = vl1VarFilledIconToggleButtonColors;
                        gh2Var3 = gh2Var2;
                    }
                }
                int i111116 = i3;
                rg3 rg3Var17 = filledShape;
                kk0Var.s();
                int i111117 = i111116 >> 9;
                int i111118 = (i111117 & 896) | (i111117 & 14) | ((i111116 << 3) & 112);
                boolean z110 = z4;
                hq3.m212x54dd086a(z, le1Var, we3.b(cVar3, false, fl1.h), z110, rg3Var17, ((re0) vl1Var2.containerColor$material3_release(z4, z, kk0Var, i111118).getValue()).a, ((re0) vl1Var2.contentColor$material3_release(z4, z, kk0Var, i111118).getValue()).a, 0.0f, 0.0f, (iw) null, gh2Var3, zg0.rememberComposableLambda(1235871670, true, new il1(ne1Var), kk0Var, 54), kk0Var, i111116 & 64638, ((i111116 >> 18) & 14) | 48, 896);
                rg3Var2 = rg3Var17;
                gh2Var4 = gh2Var3;
                z5 = z110;
                cVar4 = cVar3;
                vl1Var3 = vl1Var2;
            } else {
                kk0Var.X();
                if ((i & 1) != 0) {
                    if (i4 != 0) {
                        cVar2 = c.i;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    }
                    i11 = i2 & 16;
                    el1Var = el1.a;
                    if (i11 != 0) {
                        i3 &= -57345;
                        filledShape = el1Var.getFilledShape(kk0Var, 6);
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        vl1VarFilledIconToggleButtonColors = el1Var.filledIconToggleButtonColors(kk0Var, 6);
                    }
                    if (i8 != 0) {
                        gh2Var3 = null;
                        cVar3 = cVar2;
                        z4 = z3;
                        vl1Var2 = vl1VarFilledIconToggleButtonColors;
                    } else {
                        cVar3 = cVar2;
                        z4 = z3;
                        vl1Var2 = vl1VarFilledIconToggleButtonColors;
                        gh2Var3 = gh2Var2;
                    }
                } else {
                    if (i4 != 0) {
                        cVar2 = c.i;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    }
                    i11 = i2 & 16;
                    el1Var = el1.a;
                    if (i11 != 0) {
                        i3 &= -57345;
                        filledShape = el1Var.getFilledShape(kk0Var, 6);
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        vl1VarFilledIconToggleButtonColors = el1Var.filledIconToggleButtonColors(kk0Var, 6);
                    }
                    if (i8 != 0) {
                        gh2Var3 = null;
                        cVar3 = cVar2;
                        z4 = z3;
                        vl1Var2 = vl1VarFilledIconToggleButtonColors;
                    } else {
                        cVar3 = cVar2;
                        z4 = z3;
                        vl1Var2 = vl1VarFilledIconToggleButtonColors;
                        gh2Var3 = gh2Var2;
                    }
                }
                int i111119 = i3;
                rg3 rg3Var18 = filledShape;
                kk0Var.s();
                int i1111110 = i111119 >> 9;
                int i1111111 = (i1111110 & 896) | (i1111110 & 14) | ((i111119 << 3) & 112);
                boolean z111 = z4;
                hq3.m212x54dd086a(z, le1Var, we3.b(cVar3, false, fl1.h), z111, rg3Var18, ((re0) vl1Var2.containerColor$material3_release(z4, z, kk0Var, i1111111).getValue()).a, ((re0) vl1Var2.contentColor$material3_release(z4, z, kk0Var, i1111111).getValue()).a, 0.0f, 0.0f, (iw) null, gh2Var3, zg0.rememberComposableLambda(1235871670, true, new il1(ne1Var), kk0Var, 54), kk0Var, i111119 & 64638, ((i111119 >> 18) & 14) | 48, 896);
                rg3Var2 = rg3Var18;
                gh2Var4 = gh2Var3;
                z5 = z111;
                cVar4 = cVar3;
                vl1Var3 = vl1Var2;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new jl1(z, le1Var, cVar4, z5, rg3Var2, vl1Var3, gh2Var4, ne1Var, i, i2, 0));
            }
        }
        i3 |= 48;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                cVar2 = cVar;
                if (kk0Var.h(cVar2)) {
                    i5 = FontInfo.NUMBER_OF_CHAR_CODES;
                } else {
                    i5 = Uuid.SIZE_BITS;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    z3 = z2;
                    if (kk0Var.i(z3)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        filledShape = rg3Var;
                        if (kk0Var.h(filledShape)) {
                            i12 = 16384;
                        }
                        i3 |= i12;
                    } else {
                        filledShape = rg3Var;
                    }
                    i12 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                    i3 |= i12;
                } else {
                    filledShape = rg3Var;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        vl1VarFilledIconToggleButtonColors = vl1Var;
                        if (kk0Var.h(vl1VarFilledIconToggleButtonColors)) {
                        }
                        i3 |= i13;
                    } else {
                        vl1VarFilledIconToggleButtonColors = vl1Var;
                    }
                    i3 |= i13;
                } else {
                    vl1VarFilledIconToggleButtonColors = vl1Var;
                }
                i8 = i2 & 64;
                if (i8 != 0) {
                    if ((1572864 & i) == 0) {
                        gh2Var2 = gh2Var;
                        if (kk0Var.h(gh2Var2)) {
                            i9 = 1048576;
                        } else {
                            i9 = 524288;
                        }
                        i3 |= i9;
                    }
                    if ((i2 & Uuid.SIZE_BITS) != 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        if (kk0Var.j(ne1Var)) {
                            i10 = 8388608;
                        } else {
                            i10 = 4194304;
                        }
                        i3 |= i10;
                    }
                    if ((4793491 & i3) == 4793490) {
                        kk0Var.X();
                        if ((i & 1) != 0) {
                            if (i4 != 0) {
                                cVar2 = c.i;
                            }
                            if (i6 != 0) {
                                z3 = true;
                            }
                            i11 = i2 & 16;
                            el1Var = el1.a;
                            if (i11 != 0) {
                                i3 &= -57345;
                                filledShape = el1Var.getFilledShape(kk0Var, 6);
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                                vl1VarFilledIconToggleButtonColors = el1Var.filledIconToggleButtonColors(kk0Var, 6);
                            }
                            if (i8 != 0) {
                                gh2Var3 = null;
                                cVar3 = cVar2;
                                z4 = z3;
                                vl1Var2 = vl1VarFilledIconToggleButtonColors;
                            } else {
                                cVar3 = cVar2;
                                z4 = z3;
                                vl1Var2 = vl1VarFilledIconToggleButtonColors;
                                gh2Var3 = gh2Var2;
                            }
                        } else {
                            if (i4 != 0) {
                                cVar2 = c.i;
                            }
                            if (i6 != 0) {
                                z3 = true;
                            }
                            i11 = i2 & 16;
                            el1Var = el1.a;
                            if (i11 != 0) {
                                i3 &= -57345;
                                filledShape = el1Var.getFilledShape(kk0Var, 6);
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                                vl1VarFilledIconToggleButtonColors = el1Var.filledIconToggleButtonColors(kk0Var, 6);
                            }
                            if (i8 != 0) {
                                gh2Var3 = null;
                                cVar3 = cVar2;
                                z4 = z3;
                                vl1Var2 = vl1VarFilledIconToggleButtonColors;
                            } else {
                                cVar3 = cVar2;
                                z4 = z3;
                                vl1Var2 = vl1VarFilledIconToggleButtonColors;
                                gh2Var3 = gh2Var2;
                            }
                        }
                        int i1111112 = i3;
                        rg3 rg3Var19 = filledShape;
                        kk0Var.s();
                        int i1111113 = i1111112 >> 9;
                        int i1111114 = (i1111113 & 896) | (i1111113 & 14) | ((i1111112 << 3) & 112);
                        boolean z112 = z4;
                        hq3.m212x54dd086a(z, le1Var, we3.b(cVar3, false, fl1.h), z112, rg3Var19, ((re0) vl1Var2.containerColor$material3_release(z4, z, kk0Var, i1111114).getValue()).a, ((re0) vl1Var2.contentColor$material3_release(z4, z, kk0Var, i1111114).getValue()).a, 0.0f, 0.0f, (iw) null, gh2Var3, zg0.rememberComposableLambda(1235871670, true, new il1(ne1Var), kk0Var, 54), kk0Var, i1111112 & 64638, ((i1111112 >> 18) & 14) | 48, 896);
                        rg3Var2 = rg3Var19;
                        gh2Var4 = gh2Var3;
                        z5 = z112;
                        cVar4 = cVar3;
                        vl1Var3 = vl1Var2;
                    } else {
                        kk0Var.X();
                        if ((i & 1) != 0) {
                            if (i4 != 0) {
                                cVar2 = c.i;
                            }
                            if (i6 != 0) {
                                z3 = true;
                            }
                            i11 = i2 & 16;
                            el1Var = el1.a;
                            if (i11 != 0) {
                                i3 &= -57345;
                                filledShape = el1Var.getFilledShape(kk0Var, 6);
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                                vl1VarFilledIconToggleButtonColors = el1Var.filledIconToggleButtonColors(kk0Var, 6);
                            }
                            if (i8 != 0) {
                                gh2Var3 = null;
                                cVar3 = cVar2;
                                z4 = z3;
                                vl1Var2 = vl1VarFilledIconToggleButtonColors;
                            } else {
                                cVar3 = cVar2;
                                z4 = z3;
                                vl1Var2 = vl1VarFilledIconToggleButtonColors;
                                gh2Var3 = gh2Var2;
                            }
                        } else {
                            if (i4 != 0) {
                                cVar2 = c.i;
                            }
                            if (i6 != 0) {
                                z3 = true;
                            }
                            i11 = i2 & 16;
                            el1Var = el1.a;
                            if (i11 != 0) {
                                i3 &= -57345;
                                filledShape = el1Var.getFilledShape(kk0Var, 6);
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                                vl1VarFilledIconToggleButtonColors = el1Var.filledIconToggleButtonColors(kk0Var, 6);
                            }
                            if (i8 != 0) {
                                gh2Var3 = null;
                                cVar3 = cVar2;
                                z4 = z3;
                                vl1Var2 = vl1VarFilledIconToggleButtonColors;
                            } else {
                                cVar3 = cVar2;
                                z4 = z3;
                                vl1Var2 = vl1VarFilledIconToggleButtonColors;
                                gh2Var3 = gh2Var2;
                            }
                        }
                        int i1111115 = i3;
                        rg3 rg3Var110 = filledShape;
                        kk0Var.s();
                        int i1111116 = i1111115 >> 9;
                        int i1111117 = (i1111116 & 896) | (i1111116 & 14) | ((i1111115 << 3) & 112);
                        boolean z113 = z4;
                        hq3.m212x54dd086a(z, le1Var, we3.b(cVar3, false, fl1.h), z113, rg3Var110, ((re0) vl1Var2.containerColor$material3_release(z4, z, kk0Var, i1111117).getValue()).a, ((re0) vl1Var2.contentColor$material3_release(z4, z, kk0Var, i1111117).getValue()).a, 0.0f, 0.0f, (iw) null, gh2Var3, zg0.rememberComposableLambda(1235871670, true, new il1(ne1Var), kk0Var, 54), kk0Var, i1111115 & 64638, ((i1111115 >> 18) & 14) | 48, 896);
                        rg3Var2 = rg3Var110;
                        gh2Var4 = gh2Var3;
                        z5 = z113;
                        cVar4 = cVar3;
                        vl1Var3 = vl1Var2;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new jl1(z, le1Var, cVar4, z5, rg3Var2, vl1Var3, gh2Var4, ne1Var, i, i2, 0));
                    }
                }
                i3 |= 1572864;
                gh2Var2 = gh2Var;
                if ((i2 & Uuid.SIZE_BITS) != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    if (kk0Var.j(ne1Var)) {
                        i10 = 8388608;
                    } else {
                        i10 = 4194304;
                    }
                    i3 |= i10;
                }
                if ((4793491 & i3) == 4793490) {
                    kk0Var.X();
                    if ((i & 1) != 0) {
                        if (i4 != 0) {
                            cVar2 = c.i;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        }
                        i11 = i2 & 16;
                        el1Var = el1.a;
                        if (i11 != 0) {
                            i3 &= -57345;
                            filledShape = el1Var.getFilledShape(kk0Var, 6);
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            vl1VarFilledIconToggleButtonColors = el1Var.filledIconToggleButtonColors(kk0Var, 6);
                        }
                        if (i8 != 0) {
                            gh2Var3 = null;
                            cVar3 = cVar2;
                            z4 = z3;
                            vl1Var2 = vl1VarFilledIconToggleButtonColors;
                        } else {
                            cVar3 = cVar2;
                            z4 = z3;
                            vl1Var2 = vl1VarFilledIconToggleButtonColors;
                            gh2Var3 = gh2Var2;
                        }
                    } else {
                        if (i4 != 0) {
                            cVar2 = c.i;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        }
                        i11 = i2 & 16;
                        el1Var = el1.a;
                        if (i11 != 0) {
                            i3 &= -57345;
                            filledShape = el1Var.getFilledShape(kk0Var, 6);
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            vl1VarFilledIconToggleButtonColors = el1Var.filledIconToggleButtonColors(kk0Var, 6);
                        }
                        if (i8 != 0) {
                            gh2Var3 = null;
                            cVar3 = cVar2;
                            z4 = z3;
                            vl1Var2 = vl1VarFilledIconToggleButtonColors;
                        } else {
                            cVar3 = cVar2;
                            z4 = z3;
                            vl1Var2 = vl1VarFilledIconToggleButtonColors;
                            gh2Var3 = gh2Var2;
                        }
                    }
                    int i1111118 = i3;
                    rg3 rg3Var111 = filledShape;
                    kk0Var.s();
                    int i1111119 = i1111118 >> 9;
                    int i11111110 = (i1111119 & 896) | (i1111119 & 14) | ((i1111118 << 3) & 112);
                    boolean z114 = z4;
                    hq3.m212x54dd086a(z, le1Var, we3.b(cVar3, false, fl1.h), z114, rg3Var111, ((re0) vl1Var2.containerColor$material3_release(z4, z, kk0Var, i11111110).getValue()).a, ((re0) vl1Var2.contentColor$material3_release(z4, z, kk0Var, i11111110).getValue()).a, 0.0f, 0.0f, (iw) null, gh2Var3, zg0.rememberComposableLambda(1235871670, true, new il1(ne1Var), kk0Var, 54), kk0Var, i1111118 & 64638, ((i1111118 >> 18) & 14) | 48, 896);
                    rg3Var2 = rg3Var111;
                    gh2Var4 = gh2Var3;
                    z5 = z114;
                    cVar4 = cVar3;
                    vl1Var3 = vl1Var2;
                } else {
                    kk0Var.X();
                    if ((i & 1) != 0) {
                        if (i4 != 0) {
                            cVar2 = c.i;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        }
                        i11 = i2 & 16;
                        el1Var = el1.a;
                        if (i11 != 0) {
                            i3 &= -57345;
                            filledShape = el1Var.getFilledShape(kk0Var, 6);
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            vl1VarFilledIconToggleButtonColors = el1Var.filledIconToggleButtonColors(kk0Var, 6);
                        }
                        if (i8 != 0) {
                            gh2Var3 = null;
                            cVar3 = cVar2;
                            z4 = z3;
                            vl1Var2 = vl1VarFilledIconToggleButtonColors;
                        } else {
                            cVar3 = cVar2;
                            z4 = z3;
                            vl1Var2 = vl1VarFilledIconToggleButtonColors;
                            gh2Var3 = gh2Var2;
                        }
                    } else {
                        if (i4 != 0) {
                            cVar2 = c.i;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        }
                        i11 = i2 & 16;
                        el1Var = el1.a;
                        if (i11 != 0) {
                            i3 &= -57345;
                            filledShape = el1Var.getFilledShape(kk0Var, 6);
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            vl1VarFilledIconToggleButtonColors = el1Var.filledIconToggleButtonColors(kk0Var, 6);
                        }
                        if (i8 != 0) {
                            gh2Var3 = null;
                            cVar3 = cVar2;
                            z4 = z3;
                            vl1Var2 = vl1VarFilledIconToggleButtonColors;
                        } else {
                            cVar3 = cVar2;
                            z4 = z3;
                            vl1Var2 = vl1VarFilledIconToggleButtonColors;
                            gh2Var3 = gh2Var2;
                        }
                    }
                    int i11111111 = i3;
                    rg3 rg3Var112 = filledShape;
                    kk0Var.s();
                    int i11111112 = i11111111 >> 9;
                    int i11111113 = (i11111112 & 896) | (i11111112 & 14) | ((i11111111 << 3) & 112);
                    boolean z115 = z4;
                    hq3.m212x54dd086a(z, le1Var, we3.b(cVar3, false, fl1.h), z115, rg3Var112, ((re0) vl1Var2.containerColor$material3_release(z4, z, kk0Var, i11111113).getValue()).a, ((re0) vl1Var2.contentColor$material3_release(z4, z, kk0Var, i11111113).getValue()).a, 0.0f, 0.0f, (iw) null, gh2Var3, zg0.rememberComposableLambda(1235871670, true, new il1(ne1Var), kk0Var, 54), kk0Var, i11111111 & 64638, ((i11111111 >> 18) & 14) | 48, 896);
                    rg3Var2 = rg3Var112;
                    gh2Var4 = gh2Var3;
                    z5 = z115;
                    cVar4 = cVar3;
                    vl1Var3 = vl1Var2;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new jl1(z, le1Var, cVar4, z5, rg3Var2, vl1Var3, gh2Var4, ne1Var, i, i2, 0));
                }
            }
            i3 |= 3072;
            z3 = z2;
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    filledShape = rg3Var;
                    if (kk0Var.h(filledShape)) {
                        i12 = 16384;
                    }
                    i3 |= i12;
                } else {
                    filledShape = rg3Var;
                }
                i12 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                i3 |= i12;
            } else {
                filledShape = rg3Var;
            }
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0) {
                    vl1VarFilledIconToggleButtonColors = vl1Var;
                    if (kk0Var.h(vl1VarFilledIconToggleButtonColors)) {
                    }
                    i3 |= i13;
                } else {
                    vl1VarFilledIconToggleButtonColors = vl1Var;
                }
                i3 |= i13;
            } else {
                vl1VarFilledIconToggleButtonColors = vl1Var;
            }
            i8 = i2 & 64;
            if (i8 != 0) {
                if ((1572864 & i) == 0) {
                    gh2Var2 = gh2Var;
                    if (kk0Var.h(gh2Var2)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i3 |= i9;
                }
                if ((i2 & Uuid.SIZE_BITS) != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    if (kk0Var.j(ne1Var)) {
                        i10 = 8388608;
                    } else {
                        i10 = 4194304;
                    }
                    i3 |= i10;
                }
                if ((4793491 & i3) == 4793490) {
                    kk0Var.X();
                    if ((i & 1) != 0) {
                        if (i4 != 0) {
                            cVar2 = c.i;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        }
                        i11 = i2 & 16;
                        el1Var = el1.a;
                        if (i11 != 0) {
                            i3 &= -57345;
                            filledShape = el1Var.getFilledShape(kk0Var, 6);
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            vl1VarFilledIconToggleButtonColors = el1Var.filledIconToggleButtonColors(kk0Var, 6);
                        }
                        if (i8 != 0) {
                            gh2Var3 = null;
                            cVar3 = cVar2;
                            z4 = z3;
                            vl1Var2 = vl1VarFilledIconToggleButtonColors;
                        } else {
                            cVar3 = cVar2;
                            z4 = z3;
                            vl1Var2 = vl1VarFilledIconToggleButtonColors;
                            gh2Var3 = gh2Var2;
                        }
                    } else {
                        if (i4 != 0) {
                            cVar2 = c.i;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        }
                        i11 = i2 & 16;
                        el1Var = el1.a;
                        if (i11 != 0) {
                            i3 &= -57345;
                            filledShape = el1Var.getFilledShape(kk0Var, 6);
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            vl1VarFilledIconToggleButtonColors = el1Var.filledIconToggleButtonColors(kk0Var, 6);
                        }
                        if (i8 != 0) {
                            gh2Var3 = null;
                            cVar3 = cVar2;
                            z4 = z3;
                            vl1Var2 = vl1VarFilledIconToggleButtonColors;
                        } else {
                            cVar3 = cVar2;
                            z4 = z3;
                            vl1Var2 = vl1VarFilledIconToggleButtonColors;
                            gh2Var3 = gh2Var2;
                        }
                    }
                    int i11111114 = i3;
                    rg3 rg3Var113 = filledShape;
                    kk0Var.s();
                    int i11111115 = i11111114 >> 9;
                    int i11111116 = (i11111115 & 896) | (i11111115 & 14) | ((i11111114 << 3) & 112);
                    boolean z116 = z4;
                    hq3.m212x54dd086a(z, le1Var, we3.b(cVar3, false, fl1.h), z116, rg3Var113, ((re0) vl1Var2.containerColor$material3_release(z4, z, kk0Var, i11111116).getValue()).a, ((re0) vl1Var2.contentColor$material3_release(z4, z, kk0Var, i11111116).getValue()).a, 0.0f, 0.0f, (iw) null, gh2Var3, zg0.rememberComposableLambda(1235871670, true, new il1(ne1Var), kk0Var, 54), kk0Var, i11111114 & 64638, ((i11111114 >> 18) & 14) | 48, 896);
                    rg3Var2 = rg3Var113;
                    gh2Var4 = gh2Var3;
                    z5 = z116;
                    cVar4 = cVar3;
                    vl1Var3 = vl1Var2;
                } else {
                    kk0Var.X();
                    if ((i & 1) != 0) {
                        if (i4 != 0) {
                            cVar2 = c.i;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        }
                        i11 = i2 & 16;
                        el1Var = el1.a;
                        if (i11 != 0) {
                            i3 &= -57345;
                            filledShape = el1Var.getFilledShape(kk0Var, 6);
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            vl1VarFilledIconToggleButtonColors = el1Var.filledIconToggleButtonColors(kk0Var, 6);
                        }
                        if (i8 != 0) {
                            gh2Var3 = null;
                            cVar3 = cVar2;
                            z4 = z3;
                            vl1Var2 = vl1VarFilledIconToggleButtonColors;
                        } else {
                            cVar3 = cVar2;
                            z4 = z3;
                            vl1Var2 = vl1VarFilledIconToggleButtonColors;
                            gh2Var3 = gh2Var2;
                        }
                    } else {
                        if (i4 != 0) {
                            cVar2 = c.i;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        }
                        i11 = i2 & 16;
                        el1Var = el1.a;
                        if (i11 != 0) {
                            i3 &= -57345;
                            filledShape = el1Var.getFilledShape(kk0Var, 6);
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            vl1VarFilledIconToggleButtonColors = el1Var.filledIconToggleButtonColors(kk0Var, 6);
                        }
                        if (i8 != 0) {
                            gh2Var3 = null;
                            cVar3 = cVar2;
                            z4 = z3;
                            vl1Var2 = vl1VarFilledIconToggleButtonColors;
                        } else {
                            cVar3 = cVar2;
                            z4 = z3;
                            vl1Var2 = vl1VarFilledIconToggleButtonColors;
                            gh2Var3 = gh2Var2;
                        }
                    }
                    int i11111117 = i3;
                    rg3 rg3Var114 = filledShape;
                    kk0Var.s();
                    int i11111118 = i11111117 >> 9;
                    int i11111119 = (i11111118 & 896) | (i11111118 & 14) | ((i11111117 << 3) & 112);
                    boolean z117 = z4;
                    hq3.m212x54dd086a(z, le1Var, we3.b(cVar3, false, fl1.h), z117, rg3Var114, ((re0) vl1Var2.containerColor$material3_release(z4, z, kk0Var, i11111119).getValue()).a, ((re0) vl1Var2.contentColor$material3_release(z4, z, kk0Var, i11111119).getValue()).a, 0.0f, 0.0f, (iw) null, gh2Var3, zg0.rememberComposableLambda(1235871670, true, new il1(ne1Var), kk0Var, 54), kk0Var, i11111117 & 64638, ((i11111117 >> 18) & 14) | 48, 896);
                    rg3Var2 = rg3Var114;
                    gh2Var4 = gh2Var3;
                    z5 = z117;
                    cVar4 = cVar3;
                    vl1Var3 = vl1Var2;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new jl1(z, le1Var, cVar4, z5, rg3Var2, vl1Var3, gh2Var4, ne1Var, i, i2, 0));
                }
            }
            i3 |= 1572864;
            gh2Var2 = gh2Var;
            if ((i2 & Uuid.SIZE_BITS) != 0) {
                i3 |= 12582912;
            } else if ((i & 12582912) == 0) {
                if (kk0Var.j(ne1Var)) {
                    i10 = 8388608;
                } else {
                    i10 = 4194304;
                }
                i3 |= i10;
            }
            if ((4793491 & i3) == 4793490) {
                kk0Var.X();
                if ((i & 1) != 0) {
                    if (i4 != 0) {
                        cVar2 = c.i;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    }
                    i11 = i2 & 16;
                    el1Var = el1.a;
                    if (i11 != 0) {
                        i3 &= -57345;
                        filledShape = el1Var.getFilledShape(kk0Var, 6);
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        vl1VarFilledIconToggleButtonColors = el1Var.filledIconToggleButtonColors(kk0Var, 6);
                    }
                    if (i8 != 0) {
                        gh2Var3 = null;
                        cVar3 = cVar2;
                        z4 = z3;
                        vl1Var2 = vl1VarFilledIconToggleButtonColors;
                    } else {
                        cVar3 = cVar2;
                        z4 = z3;
                        vl1Var2 = vl1VarFilledIconToggleButtonColors;
                        gh2Var3 = gh2Var2;
                    }
                } else {
                    if (i4 != 0) {
                        cVar2 = c.i;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    }
                    i11 = i2 & 16;
                    el1Var = el1.a;
                    if (i11 != 0) {
                        i3 &= -57345;
                        filledShape = el1Var.getFilledShape(kk0Var, 6);
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        vl1VarFilledIconToggleButtonColors = el1Var.filledIconToggleButtonColors(kk0Var, 6);
                    }
                    if (i8 != 0) {
                        gh2Var3 = null;
                        cVar3 = cVar2;
                        z4 = z3;
                        vl1Var2 = vl1VarFilledIconToggleButtonColors;
                    } else {
                        cVar3 = cVar2;
                        z4 = z3;
                        vl1Var2 = vl1VarFilledIconToggleButtonColors;
                        gh2Var3 = gh2Var2;
                    }
                }
                int i111111110 = i3;
                rg3 rg3Var115 = filledShape;
                kk0Var.s();
                int i111111111 = i111111110 >> 9;
                int i111111112 = (i111111111 & 896) | (i111111111 & 14) | ((i111111110 << 3) & 112);
                boolean z118 = z4;
                hq3.m212x54dd086a(z, le1Var, we3.b(cVar3, false, fl1.h), z118, rg3Var115, ((re0) vl1Var2.containerColor$material3_release(z4, z, kk0Var, i111111112).getValue()).a, ((re0) vl1Var2.contentColor$material3_release(z4, z, kk0Var, i111111112).getValue()).a, 0.0f, 0.0f, (iw) null, gh2Var3, zg0.rememberComposableLambda(1235871670, true, new il1(ne1Var), kk0Var, 54), kk0Var, i111111110 & 64638, ((i111111110 >> 18) & 14) | 48, 896);
                rg3Var2 = rg3Var115;
                gh2Var4 = gh2Var3;
                z5 = z118;
                cVar4 = cVar3;
                vl1Var3 = vl1Var2;
            } else {
                kk0Var.X();
                if ((i & 1) != 0) {
                    if (i4 != 0) {
                        cVar2 = c.i;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    }
                    i11 = i2 & 16;
                    el1Var = el1.a;
                    if (i11 != 0) {
                        i3 &= -57345;
                        filledShape = el1Var.getFilledShape(kk0Var, 6);
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        vl1VarFilledIconToggleButtonColors = el1Var.filledIconToggleButtonColors(kk0Var, 6);
                    }
                    if (i8 != 0) {
                        gh2Var3 = null;
                        cVar3 = cVar2;
                        z4 = z3;
                        vl1Var2 = vl1VarFilledIconToggleButtonColors;
                    } else {
                        cVar3 = cVar2;
                        z4 = z3;
                        vl1Var2 = vl1VarFilledIconToggleButtonColors;
                        gh2Var3 = gh2Var2;
                    }
                } else {
                    if (i4 != 0) {
                        cVar2 = c.i;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    }
                    i11 = i2 & 16;
                    el1Var = el1.a;
                    if (i11 != 0) {
                        i3 &= -57345;
                        filledShape = el1Var.getFilledShape(kk0Var, 6);
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        vl1VarFilledIconToggleButtonColors = el1Var.filledIconToggleButtonColors(kk0Var, 6);
                    }
                    if (i8 != 0) {
                        gh2Var3 = null;
                        cVar3 = cVar2;
                        z4 = z3;
                        vl1Var2 = vl1VarFilledIconToggleButtonColors;
                    } else {
                        cVar3 = cVar2;
                        z4 = z3;
                        vl1Var2 = vl1VarFilledIconToggleButtonColors;
                        gh2Var3 = gh2Var2;
                    }
                }
                int i111111113 = i3;
                rg3 rg3Var116 = filledShape;
                kk0Var.s();
                int i111111114 = i111111113 >> 9;
                int i111111115 = (i111111114 & 896) | (i111111114 & 14) | ((i111111113 << 3) & 112);
                boolean z119 = z4;
                hq3.m212x54dd086a(z, le1Var, we3.b(cVar3, false, fl1.h), z119, rg3Var116, ((re0) vl1Var2.containerColor$material3_release(z4, z, kk0Var, i111111115).getValue()).a, ((re0) vl1Var2.contentColor$material3_release(z4, z, kk0Var, i111111115).getValue()).a, 0.0f, 0.0f, (iw) null, gh2Var3, zg0.rememberComposableLambda(1235871670, true, new il1(ne1Var), kk0Var, 54), kk0Var, i111111113 & 64638, ((i111111113 >> 18) & 14) | 48, 896);
                rg3Var2 = rg3Var116;
                gh2Var4 = gh2Var3;
                z5 = z119;
                cVar4 = cVar3;
                vl1Var3 = vl1Var2;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new jl1(z, le1Var, cVar4, z5, rg3Var2, vl1Var3, gh2Var4, ne1Var, i, i2, 0));
            }
        }
        i3 |= 384;
        cVar2 = cVar;
        i6 = i2 & 8;
        if (i6 != 0) {
            if ((i & 3072) == 0) {
                z3 = z2;
                if (kk0Var.i(z3)) {
                    i7 = 2048;
                } else {
                    i7 = 1024;
                }
                i3 |= i7;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    filledShape = rg3Var;
                    if (kk0Var.h(filledShape)) {
                        i12 = 16384;
                    }
                    i3 |= i12;
                } else {
                    filledShape = rg3Var;
                }
                i12 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                i3 |= i12;
            } else {
                filledShape = rg3Var;
            }
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0) {
                    vl1VarFilledIconToggleButtonColors = vl1Var;
                    if (kk0Var.h(vl1VarFilledIconToggleButtonColors)) {
                    }
                    i3 |= i13;
                } else {
                    vl1VarFilledIconToggleButtonColors = vl1Var;
                }
                i3 |= i13;
            } else {
                vl1VarFilledIconToggleButtonColors = vl1Var;
            }
            i8 = i2 & 64;
            if (i8 != 0) {
                if ((1572864 & i) == 0) {
                    gh2Var2 = gh2Var;
                    if (kk0Var.h(gh2Var2)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i3 |= i9;
                }
                if ((i2 & Uuid.SIZE_BITS) != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    if (kk0Var.j(ne1Var)) {
                        i10 = 8388608;
                    } else {
                        i10 = 4194304;
                    }
                    i3 |= i10;
                }
                if ((4793491 & i3) == 4793490) {
                    kk0Var.X();
                    if ((i & 1) != 0) {
                        if (i4 != 0) {
                            cVar2 = c.i;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        }
                        i11 = i2 & 16;
                        el1Var = el1.a;
                        if (i11 != 0) {
                            i3 &= -57345;
                            filledShape = el1Var.getFilledShape(kk0Var, 6);
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            vl1VarFilledIconToggleButtonColors = el1Var.filledIconToggleButtonColors(kk0Var, 6);
                        }
                        if (i8 != 0) {
                            gh2Var3 = null;
                            cVar3 = cVar2;
                            z4 = z3;
                            vl1Var2 = vl1VarFilledIconToggleButtonColors;
                        } else {
                            cVar3 = cVar2;
                            z4 = z3;
                            vl1Var2 = vl1VarFilledIconToggleButtonColors;
                            gh2Var3 = gh2Var2;
                        }
                    } else {
                        if (i4 != 0) {
                            cVar2 = c.i;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        }
                        i11 = i2 & 16;
                        el1Var = el1.a;
                        if (i11 != 0) {
                            i3 &= -57345;
                            filledShape = el1Var.getFilledShape(kk0Var, 6);
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            vl1VarFilledIconToggleButtonColors = el1Var.filledIconToggleButtonColors(kk0Var, 6);
                        }
                        if (i8 != 0) {
                            gh2Var3 = null;
                            cVar3 = cVar2;
                            z4 = z3;
                            vl1Var2 = vl1VarFilledIconToggleButtonColors;
                        } else {
                            cVar3 = cVar2;
                            z4 = z3;
                            vl1Var2 = vl1VarFilledIconToggleButtonColors;
                            gh2Var3 = gh2Var2;
                        }
                    }
                    int i111111116 = i3;
                    rg3 rg3Var117 = filledShape;
                    kk0Var.s();
                    int i111111117 = i111111116 >> 9;
                    int i111111118 = (i111111117 & 896) | (i111111117 & 14) | ((i111111116 << 3) & 112);
                    boolean z1110 = z4;
                    hq3.m212x54dd086a(z, le1Var, we3.b(cVar3, false, fl1.h), z1110, rg3Var117, ((re0) vl1Var2.containerColor$material3_release(z4, z, kk0Var, i111111118).getValue()).a, ((re0) vl1Var2.contentColor$material3_release(z4, z, kk0Var, i111111118).getValue()).a, 0.0f, 0.0f, (iw) null, gh2Var3, zg0.rememberComposableLambda(1235871670, true, new il1(ne1Var), kk0Var, 54), kk0Var, i111111116 & 64638, ((i111111116 >> 18) & 14) | 48, 896);
                    rg3Var2 = rg3Var117;
                    gh2Var4 = gh2Var3;
                    z5 = z1110;
                    cVar4 = cVar3;
                    vl1Var3 = vl1Var2;
                } else {
                    kk0Var.X();
                    if ((i & 1) != 0) {
                        if (i4 != 0) {
                            cVar2 = c.i;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        }
                        i11 = i2 & 16;
                        el1Var = el1.a;
                        if (i11 != 0) {
                            i3 &= -57345;
                            filledShape = el1Var.getFilledShape(kk0Var, 6);
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            vl1VarFilledIconToggleButtonColors = el1Var.filledIconToggleButtonColors(kk0Var, 6);
                        }
                        if (i8 != 0) {
                            gh2Var3 = null;
                            cVar3 = cVar2;
                            z4 = z3;
                            vl1Var2 = vl1VarFilledIconToggleButtonColors;
                        } else {
                            cVar3 = cVar2;
                            z4 = z3;
                            vl1Var2 = vl1VarFilledIconToggleButtonColors;
                            gh2Var3 = gh2Var2;
                        }
                    } else {
                        if (i4 != 0) {
                            cVar2 = c.i;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        }
                        i11 = i2 & 16;
                        el1Var = el1.a;
                        if (i11 != 0) {
                            i3 &= -57345;
                            filledShape = el1Var.getFilledShape(kk0Var, 6);
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            vl1VarFilledIconToggleButtonColors = el1Var.filledIconToggleButtonColors(kk0Var, 6);
                        }
                        if (i8 != 0) {
                            gh2Var3 = null;
                            cVar3 = cVar2;
                            z4 = z3;
                            vl1Var2 = vl1VarFilledIconToggleButtonColors;
                        } else {
                            cVar3 = cVar2;
                            z4 = z3;
                            vl1Var2 = vl1VarFilledIconToggleButtonColors;
                            gh2Var3 = gh2Var2;
                        }
                    }
                    int i111111119 = i3;
                    rg3 rg3Var118 = filledShape;
                    kk0Var.s();
                    int i1111111110 = i111111119 >> 9;
                    int i1111111111 = (i1111111110 & 896) | (i1111111110 & 14) | ((i111111119 << 3) & 112);
                    boolean z1111 = z4;
                    hq3.m212x54dd086a(z, le1Var, we3.b(cVar3, false, fl1.h), z1111, rg3Var118, ((re0) vl1Var2.containerColor$material3_release(z4, z, kk0Var, i1111111111).getValue()).a, ((re0) vl1Var2.contentColor$material3_release(z4, z, kk0Var, i1111111111).getValue()).a, 0.0f, 0.0f, (iw) null, gh2Var3, zg0.rememberComposableLambda(1235871670, true, new il1(ne1Var), kk0Var, 54), kk0Var, i111111119 & 64638, ((i111111119 >> 18) & 14) | 48, 896);
                    rg3Var2 = rg3Var118;
                    gh2Var4 = gh2Var3;
                    z5 = z1111;
                    cVar4 = cVar3;
                    vl1Var3 = vl1Var2;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new jl1(z, le1Var, cVar4, z5, rg3Var2, vl1Var3, gh2Var4, ne1Var, i, i2, 0));
                }
            }
            i3 |= 1572864;
            gh2Var2 = gh2Var;
            if ((i2 & Uuid.SIZE_BITS) != 0) {
                i3 |= 12582912;
            } else if ((i & 12582912) == 0) {
                if (kk0Var.j(ne1Var)) {
                    i10 = 8388608;
                } else {
                    i10 = 4194304;
                }
                i3 |= i10;
            }
            if ((4793491 & i3) == 4793490) {
                kk0Var.X();
                if ((i & 1) != 0) {
                    if (i4 != 0) {
                        cVar2 = c.i;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    }
                    i11 = i2 & 16;
                    el1Var = el1.a;
                    if (i11 != 0) {
                        i3 &= -57345;
                        filledShape = el1Var.getFilledShape(kk0Var, 6);
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        vl1VarFilledIconToggleButtonColors = el1Var.filledIconToggleButtonColors(kk0Var, 6);
                    }
                    if (i8 != 0) {
                        gh2Var3 = null;
                        cVar3 = cVar2;
                        z4 = z3;
                        vl1Var2 = vl1VarFilledIconToggleButtonColors;
                    } else {
                        cVar3 = cVar2;
                        z4 = z3;
                        vl1Var2 = vl1VarFilledIconToggleButtonColors;
                        gh2Var3 = gh2Var2;
                    }
                } else {
                    if (i4 != 0) {
                        cVar2 = c.i;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    }
                    i11 = i2 & 16;
                    el1Var = el1.a;
                    if (i11 != 0) {
                        i3 &= -57345;
                        filledShape = el1Var.getFilledShape(kk0Var, 6);
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        vl1VarFilledIconToggleButtonColors = el1Var.filledIconToggleButtonColors(kk0Var, 6);
                    }
                    if (i8 != 0) {
                        gh2Var3 = null;
                        cVar3 = cVar2;
                        z4 = z3;
                        vl1Var2 = vl1VarFilledIconToggleButtonColors;
                    } else {
                        cVar3 = cVar2;
                        z4 = z3;
                        vl1Var2 = vl1VarFilledIconToggleButtonColors;
                        gh2Var3 = gh2Var2;
                    }
                }
                int i1111111112 = i3;
                rg3 rg3Var119 = filledShape;
                kk0Var.s();
                int i1111111113 = i1111111112 >> 9;
                int i1111111114 = (i1111111113 & 896) | (i1111111113 & 14) | ((i1111111112 << 3) & 112);
                boolean z1112 = z4;
                hq3.m212x54dd086a(z, le1Var, we3.b(cVar3, false, fl1.h), z1112, rg3Var119, ((re0) vl1Var2.containerColor$material3_release(z4, z, kk0Var, i1111111114).getValue()).a, ((re0) vl1Var2.contentColor$material3_release(z4, z, kk0Var, i1111111114).getValue()).a, 0.0f, 0.0f, (iw) null, gh2Var3, zg0.rememberComposableLambda(1235871670, true, new il1(ne1Var), kk0Var, 54), kk0Var, i1111111112 & 64638, ((i1111111112 >> 18) & 14) | 48, 896);
                rg3Var2 = rg3Var119;
                gh2Var4 = gh2Var3;
                z5 = z1112;
                cVar4 = cVar3;
                vl1Var3 = vl1Var2;
            } else {
                kk0Var.X();
                if ((i & 1) != 0) {
                    if (i4 != 0) {
                        cVar2 = c.i;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    }
                    i11 = i2 & 16;
                    el1Var = el1.a;
                    if (i11 != 0) {
                        i3 &= -57345;
                        filledShape = el1Var.getFilledShape(kk0Var, 6);
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        vl1VarFilledIconToggleButtonColors = el1Var.filledIconToggleButtonColors(kk0Var, 6);
                    }
                    if (i8 != 0) {
                        gh2Var3 = null;
                        cVar3 = cVar2;
                        z4 = z3;
                        vl1Var2 = vl1VarFilledIconToggleButtonColors;
                    } else {
                        cVar3 = cVar2;
                        z4 = z3;
                        vl1Var2 = vl1VarFilledIconToggleButtonColors;
                        gh2Var3 = gh2Var2;
                    }
                } else {
                    if (i4 != 0) {
                        cVar2 = c.i;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    }
                    i11 = i2 & 16;
                    el1Var = el1.a;
                    if (i11 != 0) {
                        i3 &= -57345;
                        filledShape = el1Var.getFilledShape(kk0Var, 6);
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        vl1VarFilledIconToggleButtonColors = el1Var.filledIconToggleButtonColors(kk0Var, 6);
                    }
                    if (i8 != 0) {
                        gh2Var3 = null;
                        cVar3 = cVar2;
                        z4 = z3;
                        vl1Var2 = vl1VarFilledIconToggleButtonColors;
                    } else {
                        cVar3 = cVar2;
                        z4 = z3;
                        vl1Var2 = vl1VarFilledIconToggleButtonColors;
                        gh2Var3 = gh2Var2;
                    }
                }
                int i1111111115 = i3;
                rg3 rg3Var1110 = filledShape;
                kk0Var.s();
                int i1111111116 = i1111111115 >> 9;
                int i1111111117 = (i1111111116 & 896) | (i1111111116 & 14) | ((i1111111115 << 3) & 112);
                boolean z1113 = z4;
                hq3.m212x54dd086a(z, le1Var, we3.b(cVar3, false, fl1.h), z1113, rg3Var1110, ((re0) vl1Var2.containerColor$material3_release(z4, z, kk0Var, i1111111117).getValue()).a, ((re0) vl1Var2.contentColor$material3_release(z4, z, kk0Var, i1111111117).getValue()).a, 0.0f, 0.0f, (iw) null, gh2Var3, zg0.rememberComposableLambda(1235871670, true, new il1(ne1Var), kk0Var, 54), kk0Var, i1111111115 & 64638, ((i1111111115 >> 18) & 14) | 48, 896);
                rg3Var2 = rg3Var1110;
                gh2Var4 = gh2Var3;
                z5 = z1113;
                cVar4 = cVar3;
                vl1Var3 = vl1Var2;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new jl1(z, le1Var, cVar4, z5, rg3Var2, vl1Var3, gh2Var4, ne1Var, i, i2, 0));
            }
        }
        i3 |= 3072;
        z3 = z2;
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                filledShape = rg3Var;
                if (kk0Var.h(filledShape)) {
                    i12 = 16384;
                }
                i3 |= i12;
            } else {
                filledShape = rg3Var;
            }
            i12 = ConstantsKt.DEFAULT_BUFFER_SIZE;
            i3 |= i12;
        } else {
            filledShape = rg3Var;
        }
        if ((196608 & i) == 0) {
            if ((i2 & 32) == 0) {
                vl1VarFilledIconToggleButtonColors = vl1Var;
                if (kk0Var.h(vl1VarFilledIconToggleButtonColors)) {
                }
                i3 |= i13;
            } else {
                vl1VarFilledIconToggleButtonColors = vl1Var;
            }
            i3 |= i13;
        } else {
            vl1VarFilledIconToggleButtonColors = vl1Var;
        }
        i8 = i2 & 64;
        if (i8 != 0) {
            if ((1572864 & i) == 0) {
                gh2Var2 = gh2Var;
                if (kk0Var.h(gh2Var2)) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i3 |= i9;
            }
            if ((i2 & Uuid.SIZE_BITS) != 0) {
                i3 |= 12582912;
            } else if ((i & 12582912) == 0) {
                if (kk0Var.j(ne1Var)) {
                    i10 = 8388608;
                } else {
                    i10 = 4194304;
                }
                i3 |= i10;
            }
            if ((4793491 & i3) == 4793490) {
                kk0Var.X();
                if ((i & 1) != 0) {
                    if (i4 != 0) {
                        cVar2 = c.i;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    }
                    i11 = i2 & 16;
                    el1Var = el1.a;
                    if (i11 != 0) {
                        i3 &= -57345;
                        filledShape = el1Var.getFilledShape(kk0Var, 6);
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        vl1VarFilledIconToggleButtonColors = el1Var.filledIconToggleButtonColors(kk0Var, 6);
                    }
                    if (i8 != 0) {
                        gh2Var3 = null;
                        cVar3 = cVar2;
                        z4 = z3;
                        vl1Var2 = vl1VarFilledIconToggleButtonColors;
                    } else {
                        cVar3 = cVar2;
                        z4 = z3;
                        vl1Var2 = vl1VarFilledIconToggleButtonColors;
                        gh2Var3 = gh2Var2;
                    }
                } else {
                    if (i4 != 0) {
                        cVar2 = c.i;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    }
                    i11 = i2 & 16;
                    el1Var = el1.a;
                    if (i11 != 0) {
                        i3 &= -57345;
                        filledShape = el1Var.getFilledShape(kk0Var, 6);
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        vl1VarFilledIconToggleButtonColors = el1Var.filledIconToggleButtonColors(kk0Var, 6);
                    }
                    if (i8 != 0) {
                        gh2Var3 = null;
                        cVar3 = cVar2;
                        z4 = z3;
                        vl1Var2 = vl1VarFilledIconToggleButtonColors;
                    } else {
                        cVar3 = cVar2;
                        z4 = z3;
                        vl1Var2 = vl1VarFilledIconToggleButtonColors;
                        gh2Var3 = gh2Var2;
                    }
                }
                int i1111111118 = i3;
                rg3 rg3Var1111 = filledShape;
                kk0Var.s();
                int i1111111119 = i1111111118 >> 9;
                int i11111111110 = (i1111111119 & 896) | (i1111111119 & 14) | ((i1111111118 << 3) & 112);
                boolean z1114 = z4;
                hq3.m212x54dd086a(z, le1Var, we3.b(cVar3, false, fl1.h), z1114, rg3Var1111, ((re0) vl1Var2.containerColor$material3_release(z4, z, kk0Var, i11111111110).getValue()).a, ((re0) vl1Var2.contentColor$material3_release(z4, z, kk0Var, i11111111110).getValue()).a, 0.0f, 0.0f, (iw) null, gh2Var3, zg0.rememberComposableLambda(1235871670, true, new il1(ne1Var), kk0Var, 54), kk0Var, i1111111118 & 64638, ((i1111111118 >> 18) & 14) | 48, 896);
                rg3Var2 = rg3Var1111;
                gh2Var4 = gh2Var3;
                z5 = z1114;
                cVar4 = cVar3;
                vl1Var3 = vl1Var2;
            } else {
                kk0Var.X();
                if ((i & 1) != 0) {
                    if (i4 != 0) {
                        cVar2 = c.i;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    }
                    i11 = i2 & 16;
                    el1Var = el1.a;
                    if (i11 != 0) {
                        i3 &= -57345;
                        filledShape = el1Var.getFilledShape(kk0Var, 6);
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        vl1VarFilledIconToggleButtonColors = el1Var.filledIconToggleButtonColors(kk0Var, 6);
                    }
                    if (i8 != 0) {
                        gh2Var3 = null;
                        cVar3 = cVar2;
                        z4 = z3;
                        vl1Var2 = vl1VarFilledIconToggleButtonColors;
                    } else {
                        cVar3 = cVar2;
                        z4 = z3;
                        vl1Var2 = vl1VarFilledIconToggleButtonColors;
                        gh2Var3 = gh2Var2;
                    }
                } else {
                    if (i4 != 0) {
                        cVar2 = c.i;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    }
                    i11 = i2 & 16;
                    el1Var = el1.a;
                    if (i11 != 0) {
                        i3 &= -57345;
                        filledShape = el1Var.getFilledShape(kk0Var, 6);
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        vl1VarFilledIconToggleButtonColors = el1Var.filledIconToggleButtonColors(kk0Var, 6);
                    }
                    if (i8 != 0) {
                        gh2Var3 = null;
                        cVar3 = cVar2;
                        z4 = z3;
                        vl1Var2 = vl1VarFilledIconToggleButtonColors;
                    } else {
                        cVar3 = cVar2;
                        z4 = z3;
                        vl1Var2 = vl1VarFilledIconToggleButtonColors;
                        gh2Var3 = gh2Var2;
                    }
                }
                int i11111111111 = i3;
                rg3 rg3Var1112 = filledShape;
                kk0Var.s();
                int i11111111112 = i11111111111 >> 9;
                int i11111111113 = (i11111111112 & 896) | (i11111111112 & 14) | ((i11111111111 << 3) & 112);
                boolean z1115 = z4;
                hq3.m212x54dd086a(z, le1Var, we3.b(cVar3, false, fl1.h), z1115, rg3Var1112, ((re0) vl1Var2.containerColor$material3_release(z4, z, kk0Var, i11111111113).getValue()).a, ((re0) vl1Var2.contentColor$material3_release(z4, z, kk0Var, i11111111113).getValue()).a, 0.0f, 0.0f, (iw) null, gh2Var3, zg0.rememberComposableLambda(1235871670, true, new il1(ne1Var), kk0Var, 54), kk0Var, i11111111111 & 64638, ((i11111111111 >> 18) & 14) | 48, 896);
                rg3Var2 = rg3Var1112;
                gh2Var4 = gh2Var3;
                z5 = z1115;
                cVar4 = cVar3;
                vl1Var3 = vl1Var2;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new jl1(z, le1Var, cVar4, z5, rg3Var2, vl1Var3, gh2Var4, ne1Var, i, i2, 0));
            }
        }
        i3 |= 1572864;
        gh2Var2 = gh2Var;
        if ((i2 & Uuid.SIZE_BITS) != 0) {
            i3 |= 12582912;
        } else if ((i & 12582912) == 0) {
            if (kk0Var.j(ne1Var)) {
                i10 = 8388608;
            } else {
                i10 = 4194304;
            }
            i3 |= i10;
        }
        if ((4793491 & i3) == 4793490) {
            kk0Var.X();
            if ((i & 1) != 0) {
                if (i4 != 0) {
                    cVar2 = c.i;
                }
                if (i6 != 0) {
                    z3 = true;
                }
                i11 = i2 & 16;
                el1Var = el1.a;
                if (i11 != 0) {
                    i3 &= -57345;
                    filledShape = el1Var.getFilledShape(kk0Var, 6);
                }
                if ((i2 & 32) != 0) {
                    i3 &= -458753;
                    vl1VarFilledIconToggleButtonColors = el1Var.filledIconToggleButtonColors(kk0Var, 6);
                }
                if (i8 != 0) {
                    gh2Var3 = null;
                    cVar3 = cVar2;
                    z4 = z3;
                    vl1Var2 = vl1VarFilledIconToggleButtonColors;
                } else {
                    cVar3 = cVar2;
                    z4 = z3;
                    vl1Var2 = vl1VarFilledIconToggleButtonColors;
                    gh2Var3 = gh2Var2;
                }
            } else {
                if (i4 != 0) {
                    cVar2 = c.i;
                }
                if (i6 != 0) {
                    z3 = true;
                }
                i11 = i2 & 16;
                el1Var = el1.a;
                if (i11 != 0) {
                    i3 &= -57345;
                    filledShape = el1Var.getFilledShape(kk0Var, 6);
                }
                if ((i2 & 32) != 0) {
                    i3 &= -458753;
                    vl1VarFilledIconToggleButtonColors = el1Var.filledIconToggleButtonColors(kk0Var, 6);
                }
                if (i8 != 0) {
                    gh2Var3 = null;
                    cVar3 = cVar2;
                    z4 = z3;
                    vl1Var2 = vl1VarFilledIconToggleButtonColors;
                } else {
                    cVar3 = cVar2;
                    z4 = z3;
                    vl1Var2 = vl1VarFilledIconToggleButtonColors;
                    gh2Var3 = gh2Var2;
                }
            }
            int i11111111114 = i3;
            rg3 rg3Var1113 = filledShape;
            kk0Var.s();
            int i11111111115 = i11111111114 >> 9;
            int i11111111116 = (i11111111115 & 896) | (i11111111115 & 14) | ((i11111111114 << 3) & 112);
            boolean z1116 = z4;
            hq3.m212x54dd086a(z, le1Var, we3.b(cVar3, false, fl1.h), z1116, rg3Var1113, ((re0) vl1Var2.containerColor$material3_release(z4, z, kk0Var, i11111111116).getValue()).a, ((re0) vl1Var2.contentColor$material3_release(z4, z, kk0Var, i11111111116).getValue()).a, 0.0f, 0.0f, (iw) null, gh2Var3, zg0.rememberComposableLambda(1235871670, true, new il1(ne1Var), kk0Var, 54), kk0Var, i11111111114 & 64638, ((i11111111114 >> 18) & 14) | 48, 896);
            rg3Var2 = rg3Var1113;
            gh2Var4 = gh2Var3;
            z5 = z1116;
            cVar4 = cVar3;
            vl1Var3 = vl1Var2;
        } else {
            kk0Var.X();
            if ((i & 1) != 0) {
                if (i4 != 0) {
                    cVar2 = c.i;
                }
                if (i6 != 0) {
                    z3 = true;
                }
                i11 = i2 & 16;
                el1Var = el1.a;
                if (i11 != 0) {
                    i3 &= -57345;
                    filledShape = el1Var.getFilledShape(kk0Var, 6);
                }
                if ((i2 & 32) != 0) {
                    i3 &= -458753;
                    vl1VarFilledIconToggleButtonColors = el1Var.filledIconToggleButtonColors(kk0Var, 6);
                }
                if (i8 != 0) {
                    gh2Var3 = null;
                    cVar3 = cVar2;
                    z4 = z3;
                    vl1Var2 = vl1VarFilledIconToggleButtonColors;
                } else {
                    cVar3 = cVar2;
                    z4 = z3;
                    vl1Var2 = vl1VarFilledIconToggleButtonColors;
                    gh2Var3 = gh2Var2;
                }
            } else {
                if (i4 != 0) {
                    cVar2 = c.i;
                }
                if (i6 != 0) {
                    z3 = true;
                }
                i11 = i2 & 16;
                el1Var = el1.a;
                if (i11 != 0) {
                    i3 &= -57345;
                    filledShape = el1Var.getFilledShape(kk0Var, 6);
                }
                if ((i2 & 32) != 0) {
                    i3 &= -458753;
                    vl1VarFilledIconToggleButtonColors = el1Var.filledIconToggleButtonColors(kk0Var, 6);
                }
                if (i8 != 0) {
                    gh2Var3 = null;
                    cVar3 = cVar2;
                    z4 = z3;
                    vl1Var2 = vl1VarFilledIconToggleButtonColors;
                } else {
                    cVar3 = cVar2;
                    z4 = z3;
                    vl1Var2 = vl1VarFilledIconToggleButtonColors;
                    gh2Var3 = gh2Var2;
                }
            }
            int i11111111117 = i3;
            rg3 rg3Var1114 = filledShape;
            kk0Var.s();
            int i11111111118 = i11111111117 >> 9;
            int i11111111119 = (i11111111118 & 896) | (i11111111118 & 14) | ((i11111111117 << 3) & 112);
            boolean z1117 = z4;
            hq3.m212x54dd086a(z, le1Var, we3.b(cVar3, false, fl1.h), z1117, rg3Var1114, ((re0) vl1Var2.containerColor$material3_release(z4, z, kk0Var, i11111111119).getValue()).a, ((re0) vl1Var2.contentColor$material3_release(z4, z, kk0Var, i11111111119).getValue()).a, 0.0f, 0.0f, (iw) null, gh2Var3, zg0.rememberComposableLambda(1235871670, true, new il1(ne1Var), kk0Var, 54), kk0Var, i11111111117 & 64638, ((i11111111117 >> 18) & 14) | 48, 896);
            rg3Var2 = rg3Var1114;
            gh2Var4 = gh2Var3;
            z5 = z1117;
            cVar4 = cVar3;
            vl1Var3 = vl1Var2;
        }
        w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new jl1(z, le1Var, cVar4, z5, rg3Var2, vl1Var3, gh2Var4, ne1Var, i, i2, 0));
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0114  */
    /* JADX WARN: Code duplicated, block: B:104:0x011c  */
    /* JADX WARN: Code duplicated, block: B:107:0x0127  */
    /* JADX WARN: Code duplicated, block: B:109:0x012f  */
    /* JADX WARN: Code duplicated, block: B:110:0x0136  */
    /* JADX WARN: Code duplicated, block: B:113:0x0148  */
    /* JADX WARN: Code duplicated, block: B:115:0x014c  */
    /* JADX WARN: Code duplicated, block: B:117:0x0151  */
    /* JADX WARN: Code duplicated, block: B:118:0x0154  */
    /* JADX WARN: Code duplicated, block: B:122:0x018f  */
    /* JADX WARN: Code duplicated, block: B:124:? A[RETURN, SYNTHETIC] */
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
    /* JADX WARN: Code duplicated, block: B:61:0x009f  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:65:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:71:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:73:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:76:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:97:0x010c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:98:0x010e  */
    /* JADX WARN: Code duplicated, block: B:99:0x0111  */
    public static final void FilledTonalIconButton(je1 je1Var, c cVar, boolean z, rg3 rg3Var, dl1 dl1Var, gh2 gh2Var, ne1 ne1Var, ck0 ck0Var, int i, int i2) {
        je1 je1Var2;
        int i3;
        c cVar2;
        int i4;
        boolean z2;
        int i5;
        rg3 filledShape;
        dl1 dl1VarFilledTonalIconButtonColors;
        int i6;
        gh2 gh2Var2;
        int i7;
        int i8;
        c cVar3;
        int i9;
        el1 el1Var;
        int i10;
        boolean z3;
        dl1 dl1Var2;
        gh2 gh2Var3;
        rg3 rg3Var2;
        long j;
        long j2;
        kk0 kk0Var;
        dl1 dl1Var3;
        c cVar4;
        boolean z4;
        rg3 rg3Var3;
        gh2 gh2Var4;
        w33 w33VarV;
        int i11;
        kk0 kk0Var2 = (kk0) ck0Var;
        kk0Var2.c0(-783937767);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            je1Var2 = je1Var;
        } else {
            je1Var2 = je1Var;
            if ((i & 6) == 0) {
                i3 = (kk0Var2.j(je1Var2) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        int i12 = i2 & 2;
        if (i12 == 0) {
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
                        filledShape = rg3Var;
                        int i13 = kk0Var2.h(filledShape) ? 2048 : 1024;
                        i3 |= i13;
                    } else {
                        filledShape = rg3Var;
                    }
                    i3 |= i13;
                } else {
                    filledShape = rg3Var;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        dl1VarFilledTonalIconButtonColors = dl1Var;
                        if (kk0Var2.h(dl1VarFilledTonalIconButtonColors)) {
                            i11 = 16384;
                        }
                        i3 |= i11;
                    } else {
                        dl1VarFilledTonalIconButtonColors = dl1Var;
                    }
                    i11 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                    i3 |= i11;
                } else {
                    dl1VarFilledTonalIconButtonColors = dl1Var;
                }
                i6 = i2 & 32;
                if (i6 != 0) {
                    if ((196608 & i) == 0) {
                        gh2Var2 = gh2Var;
                        if (kk0Var2.h(gh2Var2)) {
                            i7 = 131072;
                        } else {
                            i7 = 65536;
                        }
                        i3 |= i7;
                    }
                    if ((i2 & 64) != 0) {
                        i3 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        if (kk0Var2.j(ne1Var)) {
                            i8 = 1048576;
                        } else {
                            i8 = 524288;
                        }
                        i3 |= i8;
                    }
                    if ((599187 & i3) == 599186 || !kk0Var2.F()) {
                        kk0Var2.X();
                        if ((i & 1) != 0 || kk0Var2.D()) {
                            if (i12 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i4 != 0) {
                                z2 = true;
                            }
                            i9 = i2 & 8;
                            el1Var = el1.a;
                            if (i9 != 0) {
                                i3 &= -7169;
                                filledShape = el1Var.getFilledShape(kk0Var2, 6);
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                                dl1VarFilledTonalIconButtonColors = el1Var.filledTonalIconButtonColors(kk0Var2, 6);
                            }
                            if (i6 != 0) {
                                gh2Var3 = null;
                                z3 = z2;
                                rg3Var2 = filledShape;
                                i10 = i3;
                            } else {
                                i10 = i3;
                                z3 = z2;
                                dl1Var2 = dl1VarFilledTonalIconButtonColors;
                                gh2Var3 = gh2Var2;
                                rg3Var2 = filledShape;
                            }
                            kk0Var2.s();
                            c cVarB = we3.b(cVar3, false, fl1.l);
                            if (z3) {
                                j = dl1Var2.a;
                            } else {
                                j = dl1Var2.c;
                            }
                            long j3 = j;
                            if (z3) {
                                j2 = dl1Var2.b;
                            } else {
                                j2 = dl1Var2.d;
                            }
                            kk0Var = kk0Var2;
                            hq3.m213xde3417d4(je1Var2, cVarB, z3, rg3Var2, j3, j2, 0.0f, 0.0f, null, gh2Var3, zg0.rememberComposableLambda(-1772884636, true, new kl1(ne1Var), kk0Var2, 54), kk0Var, (i10 & 8078) | ((i10 << 12) & 1879048192), 6, 448);
                            dl1Var3 = dl1Var2;
                            cVar4 = cVar3;
                            z4 = z3;
                            rg3Var3 = rg3Var2;
                            gh2Var4 = gh2Var3;
                        } else {
                            kk0Var2.V();
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            cVar3 = cVar2;
                            z3 = z2;
                            gh2Var3 = gh2Var2;
                            i10 = i3;
                            rg3Var2 = filledShape;
                        }
                        dl1Var2 = dl1VarFilledTonalIconButtonColors;
                        kk0Var2.s();
                        c cVarB2 = we3.b(cVar3, false, fl1.l);
                        if (z3) {
                            j = dl1Var2.a;
                        } else {
                            j = dl1Var2.c;
                        }
                        long j4 = j;
                        if (z3) {
                            j2 = dl1Var2.b;
                        } else {
                            j2 = dl1Var2.d;
                        }
                        kk0Var = kk0Var2;
                        hq3.m213xde3417d4(je1Var2, cVarB2, z3, rg3Var2, j4, j2, 0.0f, 0.0f, null, gh2Var3, zg0.rememberComposableLambda(-1772884636, true, new kl1(ne1Var), kk0Var2, 54), kk0Var, (i10 & 8078) | ((i10 << 12) & 1879048192), 6, 448);
                        dl1Var3 = dl1Var2;
                        cVar4 = cVar3;
                        z4 = z3;
                        rg3Var3 = rg3Var2;
                        gh2Var4 = gh2Var3;
                    } else {
                        kk0Var2.V();
                        kk0Var = kk0Var2;
                        cVar4 = cVar2;
                        z4 = z2;
                        rg3Var3 = filledShape;
                        dl1Var3 = dl1VarFilledTonalIconButtonColors;
                        gh2Var4 = gh2Var2;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new hl1(je1Var, cVar4, z4, rg3Var3, dl1Var3, gh2Var4, ne1Var, i, i2, 1));
                    }
                }
                i3 |= 196608;
                gh2Var2 = gh2Var;
                if ((i2 & 64) != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    if (kk0Var2.j(ne1Var)) {
                        i8 = 1048576;
                    } else {
                        i8 = 524288;
                    }
                    i3 |= i8;
                }
                if ((599187 & i3) == 599186) {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        i9 = i2 & 8;
                        el1Var = el1.a;
                        if (i9 != 0) {
                            i3 &= -7169;
                            filledShape = el1Var.getFilledShape(kk0Var2, 6);
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            dl1VarFilledTonalIconButtonColors = el1Var.filledTonalIconButtonColors(kk0Var2, 6);
                        }
                        if (i6 != 0) {
                            gh2Var3 = null;
                            z3 = z2;
                            rg3Var2 = filledShape;
                            i10 = i3;
                            dl1Var2 = dl1VarFilledTonalIconButtonColors;
                        } else {
                            i10 = i3;
                            z3 = z2;
                            dl1Var2 = dl1VarFilledTonalIconButtonColors;
                            gh2Var3 = gh2Var2;
                            rg3Var2 = filledShape;
                        }
                    } else {
                        if (i12 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        i9 = i2 & 8;
                        el1Var = el1.a;
                        if (i9 != 0) {
                            i3 &= -7169;
                            filledShape = el1Var.getFilledShape(kk0Var2, 6);
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            dl1VarFilledTonalIconButtonColors = el1Var.filledTonalIconButtonColors(kk0Var2, 6);
                        }
                        if (i6 != 0) {
                            gh2Var3 = null;
                            z3 = z2;
                            rg3Var2 = filledShape;
                            i10 = i3;
                            dl1Var2 = dl1VarFilledTonalIconButtonColors;
                        } else {
                            i10 = i3;
                            z3 = z2;
                            dl1Var2 = dl1VarFilledTonalIconButtonColors;
                            gh2Var3 = gh2Var2;
                            rg3Var2 = filledShape;
                        }
                    }
                    kk0Var2.s();
                    c cVarB3 = we3.b(cVar3, false, fl1.l);
                    if (z3) {
                        j = dl1Var2.a;
                    } else {
                        j = dl1Var2.c;
                    }
                    long j5 = j;
                    if (z3) {
                        j2 = dl1Var2.b;
                    } else {
                        j2 = dl1Var2.d;
                    }
                    kk0Var = kk0Var2;
                    hq3.m213xde3417d4(je1Var2, cVarB3, z3, rg3Var2, j5, j2, 0.0f, 0.0f, null, gh2Var3, zg0.rememberComposableLambda(-1772884636, true, new kl1(ne1Var), kk0Var2, 54), kk0Var, (i10 & 8078) | ((i10 << 12) & 1879048192), 6, 448);
                    dl1Var3 = dl1Var2;
                    cVar4 = cVar3;
                    z4 = z3;
                    rg3Var3 = rg3Var2;
                    gh2Var4 = gh2Var3;
                } else {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        i9 = i2 & 8;
                        el1Var = el1.a;
                        if (i9 != 0) {
                            i3 &= -7169;
                            filledShape = el1Var.getFilledShape(kk0Var2, 6);
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            dl1VarFilledTonalIconButtonColors = el1Var.filledTonalIconButtonColors(kk0Var2, 6);
                        }
                        if (i6 != 0) {
                            gh2Var3 = null;
                            z3 = z2;
                            rg3Var2 = filledShape;
                            i10 = i3;
                            dl1Var2 = dl1VarFilledTonalIconButtonColors;
                        } else {
                            i10 = i3;
                            z3 = z2;
                            dl1Var2 = dl1VarFilledTonalIconButtonColors;
                            gh2Var3 = gh2Var2;
                            rg3Var2 = filledShape;
                        }
                    } else {
                        if (i12 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        i9 = i2 & 8;
                        el1Var = el1.a;
                        if (i9 != 0) {
                            i3 &= -7169;
                            filledShape = el1Var.getFilledShape(kk0Var2, 6);
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            dl1VarFilledTonalIconButtonColors = el1Var.filledTonalIconButtonColors(kk0Var2, 6);
                        }
                        if (i6 != 0) {
                            gh2Var3 = null;
                            z3 = z2;
                            rg3Var2 = filledShape;
                            i10 = i3;
                            dl1Var2 = dl1VarFilledTonalIconButtonColors;
                        } else {
                            i10 = i3;
                            z3 = z2;
                            dl1Var2 = dl1VarFilledTonalIconButtonColors;
                            gh2Var3 = gh2Var2;
                            rg3Var2 = filledShape;
                        }
                    }
                    kk0Var2.s();
                    c cVarB4 = we3.b(cVar3, false, fl1.l);
                    if (z3) {
                        j = dl1Var2.a;
                    } else {
                        j = dl1Var2.c;
                    }
                    long j6 = j;
                    if (z3) {
                        j2 = dl1Var2.b;
                    } else {
                        j2 = dl1Var2.d;
                    }
                    kk0Var = kk0Var2;
                    hq3.m213xde3417d4(je1Var2, cVarB4, z3, rg3Var2, j6, j2, 0.0f, 0.0f, null, gh2Var3, zg0.rememberComposableLambda(-1772884636, true, new kl1(ne1Var), kk0Var2, 54), kk0Var, (i10 & 8078) | ((i10 << 12) & 1879048192), 6, 448);
                    dl1Var3 = dl1Var2;
                    cVar4 = cVar3;
                    z4 = z3;
                    rg3Var3 = rg3Var2;
                    gh2Var4 = gh2Var3;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new hl1(je1Var, cVar4, z4, rg3Var3, dl1Var3, gh2Var4, ne1Var, i, i2, 1));
                }
            }
            i3 |= 384;
            z2 = z;
            if ((i & 3072) == 0) {
                if ((i2 & 8) == 0) {
                    filledShape = rg3Var;
                    if (kk0Var2.h(filledShape)) {
                    }
                    i3 |= i13;
                } else {
                    filledShape = rg3Var;
                }
                i3 |= i13;
            } else {
                filledShape = rg3Var;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    dl1VarFilledTonalIconButtonColors = dl1Var;
                    if (kk0Var2.h(dl1VarFilledTonalIconButtonColors)) {
                        i11 = 16384;
                    }
                    i3 |= i11;
                } else {
                    dl1VarFilledTonalIconButtonColors = dl1Var;
                }
                i11 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                i3 |= i11;
            } else {
                dl1VarFilledTonalIconButtonColors = dl1Var;
            }
            i6 = i2 & 32;
            if (i6 != 0) {
                if ((196608 & i) == 0) {
                    gh2Var2 = gh2Var;
                    if (kk0Var2.h(gh2Var2)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
                if ((i2 & 64) != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    if (kk0Var2.j(ne1Var)) {
                        i8 = 1048576;
                    } else {
                        i8 = 524288;
                    }
                    i3 |= i8;
                }
                if ((599187 & i3) == 599186) {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        i9 = i2 & 8;
                        el1Var = el1.a;
                        if (i9 != 0) {
                            i3 &= -7169;
                            filledShape = el1Var.getFilledShape(kk0Var2, 6);
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            dl1VarFilledTonalIconButtonColors = el1Var.filledTonalIconButtonColors(kk0Var2, 6);
                        }
                        if (i6 != 0) {
                            gh2Var3 = null;
                            z3 = z2;
                            rg3Var2 = filledShape;
                            i10 = i3;
                            dl1Var2 = dl1VarFilledTonalIconButtonColors;
                        } else {
                            i10 = i3;
                            z3 = z2;
                            dl1Var2 = dl1VarFilledTonalIconButtonColors;
                            gh2Var3 = gh2Var2;
                            rg3Var2 = filledShape;
                        }
                    } else {
                        if (i12 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        i9 = i2 & 8;
                        el1Var = el1.a;
                        if (i9 != 0) {
                            i3 &= -7169;
                            filledShape = el1Var.getFilledShape(kk0Var2, 6);
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            dl1VarFilledTonalIconButtonColors = el1Var.filledTonalIconButtonColors(kk0Var2, 6);
                        }
                        if (i6 != 0) {
                            gh2Var3 = null;
                            z3 = z2;
                            rg3Var2 = filledShape;
                            i10 = i3;
                            dl1Var2 = dl1VarFilledTonalIconButtonColors;
                        } else {
                            i10 = i3;
                            z3 = z2;
                            dl1Var2 = dl1VarFilledTonalIconButtonColors;
                            gh2Var3 = gh2Var2;
                            rg3Var2 = filledShape;
                        }
                    }
                    kk0Var2.s();
                    c cVarB5 = we3.b(cVar3, false, fl1.l);
                    if (z3) {
                        j = dl1Var2.a;
                    } else {
                        j = dl1Var2.c;
                    }
                    long j7 = j;
                    if (z3) {
                        j2 = dl1Var2.b;
                    } else {
                        j2 = dl1Var2.d;
                    }
                    kk0Var = kk0Var2;
                    hq3.m213xde3417d4(je1Var2, cVarB5, z3, rg3Var2, j7, j2, 0.0f, 0.0f, null, gh2Var3, zg0.rememberComposableLambda(-1772884636, true, new kl1(ne1Var), kk0Var2, 54), kk0Var, (i10 & 8078) | ((i10 << 12) & 1879048192), 6, 448);
                    dl1Var3 = dl1Var2;
                    cVar4 = cVar3;
                    z4 = z3;
                    rg3Var3 = rg3Var2;
                    gh2Var4 = gh2Var3;
                } else {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        i9 = i2 & 8;
                        el1Var = el1.a;
                        if (i9 != 0) {
                            i3 &= -7169;
                            filledShape = el1Var.getFilledShape(kk0Var2, 6);
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            dl1VarFilledTonalIconButtonColors = el1Var.filledTonalIconButtonColors(kk0Var2, 6);
                        }
                        if (i6 != 0) {
                            gh2Var3 = null;
                            z3 = z2;
                            rg3Var2 = filledShape;
                            i10 = i3;
                            dl1Var2 = dl1VarFilledTonalIconButtonColors;
                        } else {
                            i10 = i3;
                            z3 = z2;
                            dl1Var2 = dl1VarFilledTonalIconButtonColors;
                            gh2Var3 = gh2Var2;
                            rg3Var2 = filledShape;
                        }
                    } else {
                        if (i12 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        i9 = i2 & 8;
                        el1Var = el1.a;
                        if (i9 != 0) {
                            i3 &= -7169;
                            filledShape = el1Var.getFilledShape(kk0Var2, 6);
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            dl1VarFilledTonalIconButtonColors = el1Var.filledTonalIconButtonColors(kk0Var2, 6);
                        }
                        if (i6 != 0) {
                            gh2Var3 = null;
                            z3 = z2;
                            rg3Var2 = filledShape;
                            i10 = i3;
                            dl1Var2 = dl1VarFilledTonalIconButtonColors;
                        } else {
                            i10 = i3;
                            z3 = z2;
                            dl1Var2 = dl1VarFilledTonalIconButtonColors;
                            gh2Var3 = gh2Var2;
                            rg3Var2 = filledShape;
                        }
                    }
                    kk0Var2.s();
                    c cVarB6 = we3.b(cVar3, false, fl1.l);
                    if (z3) {
                        j = dl1Var2.a;
                    } else {
                        j = dl1Var2.c;
                    }
                    long j8 = j;
                    if (z3) {
                        j2 = dl1Var2.b;
                    } else {
                        j2 = dl1Var2.d;
                    }
                    kk0Var = kk0Var2;
                    hq3.m213xde3417d4(je1Var2, cVarB6, z3, rg3Var2, j8, j2, 0.0f, 0.0f, null, gh2Var3, zg0.rememberComposableLambda(-1772884636, true, new kl1(ne1Var), kk0Var2, 54), kk0Var, (i10 & 8078) | ((i10 << 12) & 1879048192), 6, 448);
                    dl1Var3 = dl1Var2;
                    cVar4 = cVar3;
                    z4 = z3;
                    rg3Var3 = rg3Var2;
                    gh2Var4 = gh2Var3;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new hl1(je1Var, cVar4, z4, rg3Var3, dl1Var3, gh2Var4, ne1Var, i, i2, 1));
                }
            }
            i3 |= 196608;
            gh2Var2 = gh2Var;
            if ((i2 & 64) != 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                if (kk0Var2.j(ne1Var)) {
                    i8 = 1048576;
                } else {
                    i8 = 524288;
                }
                i3 |= i8;
            }
            if ((599187 & i3) == 599186) {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    i9 = i2 & 8;
                    el1Var = el1.a;
                    if (i9 != 0) {
                        i3 &= -7169;
                        filledShape = el1Var.getFilledShape(kk0Var2, 6);
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        dl1VarFilledTonalIconButtonColors = el1Var.filledTonalIconButtonColors(kk0Var2, 6);
                    }
                    if (i6 != 0) {
                        gh2Var3 = null;
                        z3 = z2;
                        rg3Var2 = filledShape;
                        i10 = i3;
                        dl1Var2 = dl1VarFilledTonalIconButtonColors;
                    } else {
                        i10 = i3;
                        z3 = z2;
                        dl1Var2 = dl1VarFilledTonalIconButtonColors;
                        gh2Var3 = gh2Var2;
                        rg3Var2 = filledShape;
                    }
                } else {
                    if (i12 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    i9 = i2 & 8;
                    el1Var = el1.a;
                    if (i9 != 0) {
                        i3 &= -7169;
                        filledShape = el1Var.getFilledShape(kk0Var2, 6);
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        dl1VarFilledTonalIconButtonColors = el1Var.filledTonalIconButtonColors(kk0Var2, 6);
                    }
                    if (i6 != 0) {
                        gh2Var3 = null;
                        z3 = z2;
                        rg3Var2 = filledShape;
                        i10 = i3;
                        dl1Var2 = dl1VarFilledTonalIconButtonColors;
                    } else {
                        i10 = i3;
                        z3 = z2;
                        dl1Var2 = dl1VarFilledTonalIconButtonColors;
                        gh2Var3 = gh2Var2;
                        rg3Var2 = filledShape;
                    }
                }
                kk0Var2.s();
                c cVarB7 = we3.b(cVar3, false, fl1.l);
                if (z3) {
                    j = dl1Var2.a;
                } else {
                    j = dl1Var2.c;
                }
                long j9 = j;
                if (z3) {
                    j2 = dl1Var2.b;
                } else {
                    j2 = dl1Var2.d;
                }
                kk0Var = kk0Var2;
                hq3.m213xde3417d4(je1Var2, cVarB7, z3, rg3Var2, j9, j2, 0.0f, 0.0f, null, gh2Var3, zg0.rememberComposableLambda(-1772884636, true, new kl1(ne1Var), kk0Var2, 54), kk0Var, (i10 & 8078) | ((i10 << 12) & 1879048192), 6, 448);
                dl1Var3 = dl1Var2;
                cVar4 = cVar3;
                z4 = z3;
                rg3Var3 = rg3Var2;
                gh2Var4 = gh2Var3;
            } else {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    i9 = i2 & 8;
                    el1Var = el1.a;
                    if (i9 != 0) {
                        i3 &= -7169;
                        filledShape = el1Var.getFilledShape(kk0Var2, 6);
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        dl1VarFilledTonalIconButtonColors = el1Var.filledTonalIconButtonColors(kk0Var2, 6);
                    }
                    if (i6 != 0) {
                        gh2Var3 = null;
                        z3 = z2;
                        rg3Var2 = filledShape;
                        i10 = i3;
                        dl1Var2 = dl1VarFilledTonalIconButtonColors;
                    } else {
                        i10 = i3;
                        z3 = z2;
                        dl1Var2 = dl1VarFilledTonalIconButtonColors;
                        gh2Var3 = gh2Var2;
                        rg3Var2 = filledShape;
                    }
                } else {
                    if (i12 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    i9 = i2 & 8;
                    el1Var = el1.a;
                    if (i9 != 0) {
                        i3 &= -7169;
                        filledShape = el1Var.getFilledShape(kk0Var2, 6);
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        dl1VarFilledTonalIconButtonColors = el1Var.filledTonalIconButtonColors(kk0Var2, 6);
                    }
                    if (i6 != 0) {
                        gh2Var3 = null;
                        z3 = z2;
                        rg3Var2 = filledShape;
                        i10 = i3;
                        dl1Var2 = dl1VarFilledTonalIconButtonColors;
                    } else {
                        i10 = i3;
                        z3 = z2;
                        dl1Var2 = dl1VarFilledTonalIconButtonColors;
                        gh2Var3 = gh2Var2;
                        rg3Var2 = filledShape;
                    }
                }
                kk0Var2.s();
                c cVarB8 = we3.b(cVar3, false, fl1.l);
                if (z3) {
                    j = dl1Var2.a;
                } else {
                    j = dl1Var2.c;
                }
                long j10 = j;
                if (z3) {
                    j2 = dl1Var2.b;
                } else {
                    j2 = dl1Var2.d;
                }
                kk0Var = kk0Var2;
                hq3.m213xde3417d4(je1Var2, cVarB8, z3, rg3Var2, j10, j2, 0.0f, 0.0f, null, gh2Var3, zg0.rememberComposableLambda(-1772884636, true, new kl1(ne1Var), kk0Var2, 54), kk0Var, (i10 & 8078) | ((i10 << 12) & 1879048192), 6, 448);
                dl1Var3 = dl1Var2;
                cVar4 = cVar3;
                z4 = z3;
                rg3Var3 = rg3Var2;
                gh2Var4 = gh2Var3;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new hl1(je1Var, cVar4, z4, rg3Var3, dl1Var3, gh2Var4, ne1Var, i, i2, 1));
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
                    filledShape = rg3Var;
                    if (kk0Var2.h(filledShape)) {
                    }
                    i3 |= i13;
                } else {
                    filledShape = rg3Var;
                }
                i3 |= i13;
            } else {
                filledShape = rg3Var;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    dl1VarFilledTonalIconButtonColors = dl1Var;
                    if (kk0Var2.h(dl1VarFilledTonalIconButtonColors)) {
                        i11 = 16384;
                    }
                    i3 |= i11;
                } else {
                    dl1VarFilledTonalIconButtonColors = dl1Var;
                }
                i11 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                i3 |= i11;
            } else {
                dl1VarFilledTonalIconButtonColors = dl1Var;
            }
            i6 = i2 & 32;
            if (i6 != 0) {
                if ((196608 & i) == 0) {
                    gh2Var2 = gh2Var;
                    if (kk0Var2.h(gh2Var2)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
                if ((i2 & 64) != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    if (kk0Var2.j(ne1Var)) {
                        i8 = 1048576;
                    } else {
                        i8 = 524288;
                    }
                    i3 |= i8;
                }
                if ((599187 & i3) == 599186) {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        i9 = i2 & 8;
                        el1Var = el1.a;
                        if (i9 != 0) {
                            i3 &= -7169;
                            filledShape = el1Var.getFilledShape(kk0Var2, 6);
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            dl1VarFilledTonalIconButtonColors = el1Var.filledTonalIconButtonColors(kk0Var2, 6);
                        }
                        if (i6 != 0) {
                            gh2Var3 = null;
                            z3 = z2;
                            rg3Var2 = filledShape;
                            i10 = i3;
                            dl1Var2 = dl1VarFilledTonalIconButtonColors;
                        } else {
                            i10 = i3;
                            z3 = z2;
                            dl1Var2 = dl1VarFilledTonalIconButtonColors;
                            gh2Var3 = gh2Var2;
                            rg3Var2 = filledShape;
                        }
                    } else {
                        if (i12 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        i9 = i2 & 8;
                        el1Var = el1.a;
                        if (i9 != 0) {
                            i3 &= -7169;
                            filledShape = el1Var.getFilledShape(kk0Var2, 6);
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            dl1VarFilledTonalIconButtonColors = el1Var.filledTonalIconButtonColors(kk0Var2, 6);
                        }
                        if (i6 != 0) {
                            gh2Var3 = null;
                            z3 = z2;
                            rg3Var2 = filledShape;
                            i10 = i3;
                            dl1Var2 = dl1VarFilledTonalIconButtonColors;
                        } else {
                            i10 = i3;
                            z3 = z2;
                            dl1Var2 = dl1VarFilledTonalIconButtonColors;
                            gh2Var3 = gh2Var2;
                            rg3Var2 = filledShape;
                        }
                    }
                    kk0Var2.s();
                    c cVarB9 = we3.b(cVar3, false, fl1.l);
                    if (z3) {
                        j = dl1Var2.a;
                    } else {
                        j = dl1Var2.c;
                    }
                    long j11 = j;
                    if (z3) {
                        j2 = dl1Var2.b;
                    } else {
                        j2 = dl1Var2.d;
                    }
                    kk0Var = kk0Var2;
                    hq3.m213xde3417d4(je1Var2, cVarB9, z3, rg3Var2, j11, j2, 0.0f, 0.0f, null, gh2Var3, zg0.rememberComposableLambda(-1772884636, true, new kl1(ne1Var), kk0Var2, 54), kk0Var, (i10 & 8078) | ((i10 << 12) & 1879048192), 6, 448);
                    dl1Var3 = dl1Var2;
                    cVar4 = cVar3;
                    z4 = z3;
                    rg3Var3 = rg3Var2;
                    gh2Var4 = gh2Var3;
                } else {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        i9 = i2 & 8;
                        el1Var = el1.a;
                        if (i9 != 0) {
                            i3 &= -7169;
                            filledShape = el1Var.getFilledShape(kk0Var2, 6);
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            dl1VarFilledTonalIconButtonColors = el1Var.filledTonalIconButtonColors(kk0Var2, 6);
                        }
                        if (i6 != 0) {
                            gh2Var3 = null;
                            z3 = z2;
                            rg3Var2 = filledShape;
                            i10 = i3;
                            dl1Var2 = dl1VarFilledTonalIconButtonColors;
                        } else {
                            i10 = i3;
                            z3 = z2;
                            dl1Var2 = dl1VarFilledTonalIconButtonColors;
                            gh2Var3 = gh2Var2;
                            rg3Var2 = filledShape;
                        }
                    } else {
                        if (i12 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        i9 = i2 & 8;
                        el1Var = el1.a;
                        if (i9 != 0) {
                            i3 &= -7169;
                            filledShape = el1Var.getFilledShape(kk0Var2, 6);
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            dl1VarFilledTonalIconButtonColors = el1Var.filledTonalIconButtonColors(kk0Var2, 6);
                        }
                        if (i6 != 0) {
                            gh2Var3 = null;
                            z3 = z2;
                            rg3Var2 = filledShape;
                            i10 = i3;
                            dl1Var2 = dl1VarFilledTonalIconButtonColors;
                        } else {
                            i10 = i3;
                            z3 = z2;
                            dl1Var2 = dl1VarFilledTonalIconButtonColors;
                            gh2Var3 = gh2Var2;
                            rg3Var2 = filledShape;
                        }
                    }
                    kk0Var2.s();
                    c cVarB10 = we3.b(cVar3, false, fl1.l);
                    if (z3) {
                        j = dl1Var2.a;
                    } else {
                        j = dl1Var2.c;
                    }
                    long j12 = j;
                    if (z3) {
                        j2 = dl1Var2.b;
                    } else {
                        j2 = dl1Var2.d;
                    }
                    kk0Var = kk0Var2;
                    hq3.m213xde3417d4(je1Var2, cVarB10, z3, rg3Var2, j12, j2, 0.0f, 0.0f, null, gh2Var3, zg0.rememberComposableLambda(-1772884636, true, new kl1(ne1Var), kk0Var2, 54), kk0Var, (i10 & 8078) | ((i10 << 12) & 1879048192), 6, 448);
                    dl1Var3 = dl1Var2;
                    cVar4 = cVar3;
                    z4 = z3;
                    rg3Var3 = rg3Var2;
                    gh2Var4 = gh2Var3;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new hl1(je1Var, cVar4, z4, rg3Var3, dl1Var3, gh2Var4, ne1Var, i, i2, 1));
                }
            }
            i3 |= 196608;
            gh2Var2 = gh2Var;
            if ((i2 & 64) != 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                if (kk0Var2.j(ne1Var)) {
                    i8 = 1048576;
                } else {
                    i8 = 524288;
                }
                i3 |= i8;
            }
            if ((599187 & i3) == 599186) {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    i9 = i2 & 8;
                    el1Var = el1.a;
                    if (i9 != 0) {
                        i3 &= -7169;
                        filledShape = el1Var.getFilledShape(kk0Var2, 6);
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        dl1VarFilledTonalIconButtonColors = el1Var.filledTonalIconButtonColors(kk0Var2, 6);
                    }
                    if (i6 != 0) {
                        gh2Var3 = null;
                        z3 = z2;
                        rg3Var2 = filledShape;
                        i10 = i3;
                        dl1Var2 = dl1VarFilledTonalIconButtonColors;
                    } else {
                        i10 = i3;
                        z3 = z2;
                        dl1Var2 = dl1VarFilledTonalIconButtonColors;
                        gh2Var3 = gh2Var2;
                        rg3Var2 = filledShape;
                    }
                } else {
                    if (i12 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    i9 = i2 & 8;
                    el1Var = el1.a;
                    if (i9 != 0) {
                        i3 &= -7169;
                        filledShape = el1Var.getFilledShape(kk0Var2, 6);
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        dl1VarFilledTonalIconButtonColors = el1Var.filledTonalIconButtonColors(kk0Var2, 6);
                    }
                    if (i6 != 0) {
                        gh2Var3 = null;
                        z3 = z2;
                        rg3Var2 = filledShape;
                        i10 = i3;
                        dl1Var2 = dl1VarFilledTonalIconButtonColors;
                    } else {
                        i10 = i3;
                        z3 = z2;
                        dl1Var2 = dl1VarFilledTonalIconButtonColors;
                        gh2Var3 = gh2Var2;
                        rg3Var2 = filledShape;
                    }
                }
                kk0Var2.s();
                c cVarB11 = we3.b(cVar3, false, fl1.l);
                if (z3) {
                    j = dl1Var2.a;
                } else {
                    j = dl1Var2.c;
                }
                long j13 = j;
                if (z3) {
                    j2 = dl1Var2.b;
                } else {
                    j2 = dl1Var2.d;
                }
                kk0Var = kk0Var2;
                hq3.m213xde3417d4(je1Var2, cVarB11, z3, rg3Var2, j13, j2, 0.0f, 0.0f, null, gh2Var3, zg0.rememberComposableLambda(-1772884636, true, new kl1(ne1Var), kk0Var2, 54), kk0Var, (i10 & 8078) | ((i10 << 12) & 1879048192), 6, 448);
                dl1Var3 = dl1Var2;
                cVar4 = cVar3;
                z4 = z3;
                rg3Var3 = rg3Var2;
                gh2Var4 = gh2Var3;
            } else {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    i9 = i2 & 8;
                    el1Var = el1.a;
                    if (i9 != 0) {
                        i3 &= -7169;
                        filledShape = el1Var.getFilledShape(kk0Var2, 6);
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        dl1VarFilledTonalIconButtonColors = el1Var.filledTonalIconButtonColors(kk0Var2, 6);
                    }
                    if (i6 != 0) {
                        gh2Var3 = null;
                        z3 = z2;
                        rg3Var2 = filledShape;
                        i10 = i3;
                        dl1Var2 = dl1VarFilledTonalIconButtonColors;
                    } else {
                        i10 = i3;
                        z3 = z2;
                        dl1Var2 = dl1VarFilledTonalIconButtonColors;
                        gh2Var3 = gh2Var2;
                        rg3Var2 = filledShape;
                    }
                } else {
                    if (i12 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    i9 = i2 & 8;
                    el1Var = el1.a;
                    if (i9 != 0) {
                        i3 &= -7169;
                        filledShape = el1Var.getFilledShape(kk0Var2, 6);
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        dl1VarFilledTonalIconButtonColors = el1Var.filledTonalIconButtonColors(kk0Var2, 6);
                    }
                    if (i6 != 0) {
                        gh2Var3 = null;
                        z3 = z2;
                        rg3Var2 = filledShape;
                        i10 = i3;
                        dl1Var2 = dl1VarFilledTonalIconButtonColors;
                    } else {
                        i10 = i3;
                        z3 = z2;
                        dl1Var2 = dl1VarFilledTonalIconButtonColors;
                        gh2Var3 = gh2Var2;
                        rg3Var2 = filledShape;
                    }
                }
                kk0Var2.s();
                c cVarB12 = we3.b(cVar3, false, fl1.l);
                if (z3) {
                    j = dl1Var2.a;
                } else {
                    j = dl1Var2.c;
                }
                long j14 = j;
                if (z3) {
                    j2 = dl1Var2.b;
                } else {
                    j2 = dl1Var2.d;
                }
                kk0Var = kk0Var2;
                hq3.m213xde3417d4(je1Var2, cVarB12, z3, rg3Var2, j14, j2, 0.0f, 0.0f, null, gh2Var3, zg0.rememberComposableLambda(-1772884636, true, new kl1(ne1Var), kk0Var2, 54), kk0Var, (i10 & 8078) | ((i10 << 12) & 1879048192), 6, 448);
                dl1Var3 = dl1Var2;
                cVar4 = cVar3;
                z4 = z3;
                rg3Var3 = rg3Var2;
                gh2Var4 = gh2Var3;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new hl1(je1Var, cVar4, z4, rg3Var3, dl1Var3, gh2Var4, ne1Var, i, i2, 1));
            }
        }
        i3 |= 384;
        z2 = z;
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                filledShape = rg3Var;
                if (kk0Var2.h(filledShape)) {
                }
                i3 |= i13;
            } else {
                filledShape = rg3Var;
            }
            i3 |= i13;
        } else {
            filledShape = rg3Var;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                dl1VarFilledTonalIconButtonColors = dl1Var;
                if (kk0Var2.h(dl1VarFilledTonalIconButtonColors)) {
                    i11 = 16384;
                }
                i3 |= i11;
            } else {
                dl1VarFilledTonalIconButtonColors = dl1Var;
            }
            i11 = ConstantsKt.DEFAULT_BUFFER_SIZE;
            i3 |= i11;
        } else {
            dl1VarFilledTonalIconButtonColors = dl1Var;
        }
        i6 = i2 & 32;
        if (i6 != 0) {
            if ((196608 & i) == 0) {
                gh2Var2 = gh2Var;
                if (kk0Var2.h(gh2Var2)) {
                    i7 = 131072;
                } else {
                    i7 = 65536;
                }
                i3 |= i7;
            }
            if ((i2 & 64) != 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                if (kk0Var2.j(ne1Var)) {
                    i8 = 1048576;
                } else {
                    i8 = 524288;
                }
                i3 |= i8;
            }
            if ((599187 & i3) == 599186) {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    i9 = i2 & 8;
                    el1Var = el1.a;
                    if (i9 != 0) {
                        i3 &= -7169;
                        filledShape = el1Var.getFilledShape(kk0Var2, 6);
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        dl1VarFilledTonalIconButtonColors = el1Var.filledTonalIconButtonColors(kk0Var2, 6);
                    }
                    if (i6 != 0) {
                        gh2Var3 = null;
                        z3 = z2;
                        rg3Var2 = filledShape;
                        i10 = i3;
                        dl1Var2 = dl1VarFilledTonalIconButtonColors;
                    } else {
                        i10 = i3;
                        z3 = z2;
                        dl1Var2 = dl1VarFilledTonalIconButtonColors;
                        gh2Var3 = gh2Var2;
                        rg3Var2 = filledShape;
                    }
                } else {
                    if (i12 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    i9 = i2 & 8;
                    el1Var = el1.a;
                    if (i9 != 0) {
                        i3 &= -7169;
                        filledShape = el1Var.getFilledShape(kk0Var2, 6);
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        dl1VarFilledTonalIconButtonColors = el1Var.filledTonalIconButtonColors(kk0Var2, 6);
                    }
                    if (i6 != 0) {
                        gh2Var3 = null;
                        z3 = z2;
                        rg3Var2 = filledShape;
                        i10 = i3;
                        dl1Var2 = dl1VarFilledTonalIconButtonColors;
                    } else {
                        i10 = i3;
                        z3 = z2;
                        dl1Var2 = dl1VarFilledTonalIconButtonColors;
                        gh2Var3 = gh2Var2;
                        rg3Var2 = filledShape;
                    }
                }
                kk0Var2.s();
                c cVarB13 = we3.b(cVar3, false, fl1.l);
                if (z3) {
                    j = dl1Var2.a;
                } else {
                    j = dl1Var2.c;
                }
                long j15 = j;
                if (z3) {
                    j2 = dl1Var2.b;
                } else {
                    j2 = dl1Var2.d;
                }
                kk0Var = kk0Var2;
                hq3.m213xde3417d4(je1Var2, cVarB13, z3, rg3Var2, j15, j2, 0.0f, 0.0f, null, gh2Var3, zg0.rememberComposableLambda(-1772884636, true, new kl1(ne1Var), kk0Var2, 54), kk0Var, (i10 & 8078) | ((i10 << 12) & 1879048192), 6, 448);
                dl1Var3 = dl1Var2;
                cVar4 = cVar3;
                z4 = z3;
                rg3Var3 = rg3Var2;
                gh2Var4 = gh2Var3;
            } else {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    i9 = i2 & 8;
                    el1Var = el1.a;
                    if (i9 != 0) {
                        i3 &= -7169;
                        filledShape = el1Var.getFilledShape(kk0Var2, 6);
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        dl1VarFilledTonalIconButtonColors = el1Var.filledTonalIconButtonColors(kk0Var2, 6);
                    }
                    if (i6 != 0) {
                        gh2Var3 = null;
                        z3 = z2;
                        rg3Var2 = filledShape;
                        i10 = i3;
                        dl1Var2 = dl1VarFilledTonalIconButtonColors;
                    } else {
                        i10 = i3;
                        z3 = z2;
                        dl1Var2 = dl1VarFilledTonalIconButtonColors;
                        gh2Var3 = gh2Var2;
                        rg3Var2 = filledShape;
                    }
                } else {
                    if (i12 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    i9 = i2 & 8;
                    el1Var = el1.a;
                    if (i9 != 0) {
                        i3 &= -7169;
                        filledShape = el1Var.getFilledShape(kk0Var2, 6);
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        dl1VarFilledTonalIconButtonColors = el1Var.filledTonalIconButtonColors(kk0Var2, 6);
                    }
                    if (i6 != 0) {
                        gh2Var3 = null;
                        z3 = z2;
                        rg3Var2 = filledShape;
                        i10 = i3;
                        dl1Var2 = dl1VarFilledTonalIconButtonColors;
                    } else {
                        i10 = i3;
                        z3 = z2;
                        dl1Var2 = dl1VarFilledTonalIconButtonColors;
                        gh2Var3 = gh2Var2;
                        rg3Var2 = filledShape;
                    }
                }
                kk0Var2.s();
                c cVarB14 = we3.b(cVar3, false, fl1.l);
                if (z3) {
                    j = dl1Var2.a;
                } else {
                    j = dl1Var2.c;
                }
                long j16 = j;
                if (z3) {
                    j2 = dl1Var2.b;
                } else {
                    j2 = dl1Var2.d;
                }
                kk0Var = kk0Var2;
                hq3.m213xde3417d4(je1Var2, cVarB14, z3, rg3Var2, j16, j2, 0.0f, 0.0f, null, gh2Var3, zg0.rememberComposableLambda(-1772884636, true, new kl1(ne1Var), kk0Var2, 54), kk0Var, (i10 & 8078) | ((i10 << 12) & 1879048192), 6, 448);
                dl1Var3 = dl1Var2;
                cVar4 = cVar3;
                z4 = z3;
                rg3Var3 = rg3Var2;
                gh2Var4 = gh2Var3;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new hl1(je1Var, cVar4, z4, rg3Var3, dl1Var3, gh2Var4, ne1Var, i, i2, 1));
            }
        }
        i3 |= 196608;
        gh2Var2 = gh2Var;
        if ((i2 & 64) != 0) {
            i3 |= 1572864;
        } else if ((i & 1572864) == 0) {
            if (kk0Var2.j(ne1Var)) {
                i8 = 1048576;
            } else {
                i8 = 524288;
            }
            i3 |= i8;
        }
        if ((599187 & i3) == 599186) {
            kk0Var2.X();
            if ((i & 1) != 0) {
                if (i12 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if (i4 != 0) {
                    z2 = true;
                }
                i9 = i2 & 8;
                el1Var = el1.a;
                if (i9 != 0) {
                    i3 &= -7169;
                    filledShape = el1Var.getFilledShape(kk0Var2, 6);
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                    dl1VarFilledTonalIconButtonColors = el1Var.filledTonalIconButtonColors(kk0Var2, 6);
                }
                if (i6 != 0) {
                    gh2Var3 = null;
                    z3 = z2;
                    rg3Var2 = filledShape;
                    i10 = i3;
                    dl1Var2 = dl1VarFilledTonalIconButtonColors;
                } else {
                    i10 = i3;
                    z3 = z2;
                    dl1Var2 = dl1VarFilledTonalIconButtonColors;
                    gh2Var3 = gh2Var2;
                    rg3Var2 = filledShape;
                }
            } else {
                if (i12 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if (i4 != 0) {
                    z2 = true;
                }
                i9 = i2 & 8;
                el1Var = el1.a;
                if (i9 != 0) {
                    i3 &= -7169;
                    filledShape = el1Var.getFilledShape(kk0Var2, 6);
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                    dl1VarFilledTonalIconButtonColors = el1Var.filledTonalIconButtonColors(kk0Var2, 6);
                }
                if (i6 != 0) {
                    gh2Var3 = null;
                    z3 = z2;
                    rg3Var2 = filledShape;
                    i10 = i3;
                    dl1Var2 = dl1VarFilledTonalIconButtonColors;
                } else {
                    i10 = i3;
                    z3 = z2;
                    dl1Var2 = dl1VarFilledTonalIconButtonColors;
                    gh2Var3 = gh2Var2;
                    rg3Var2 = filledShape;
                }
            }
            kk0Var2.s();
            c cVarB15 = we3.b(cVar3, false, fl1.l);
            if (z3) {
                j = dl1Var2.a;
            } else {
                j = dl1Var2.c;
            }
            long j17 = j;
            if (z3) {
                j2 = dl1Var2.b;
            } else {
                j2 = dl1Var2.d;
            }
            kk0Var = kk0Var2;
            hq3.m213xde3417d4(je1Var2, cVarB15, z3, rg3Var2, j17, j2, 0.0f, 0.0f, null, gh2Var3, zg0.rememberComposableLambda(-1772884636, true, new kl1(ne1Var), kk0Var2, 54), kk0Var, (i10 & 8078) | ((i10 << 12) & 1879048192), 6, 448);
            dl1Var3 = dl1Var2;
            cVar4 = cVar3;
            z4 = z3;
            rg3Var3 = rg3Var2;
            gh2Var4 = gh2Var3;
        } else {
            kk0Var2.X();
            if ((i & 1) != 0) {
                if (i12 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if (i4 != 0) {
                    z2 = true;
                }
                i9 = i2 & 8;
                el1Var = el1.a;
                if (i9 != 0) {
                    i3 &= -7169;
                    filledShape = el1Var.getFilledShape(kk0Var2, 6);
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                    dl1VarFilledTonalIconButtonColors = el1Var.filledTonalIconButtonColors(kk0Var2, 6);
                }
                if (i6 != 0) {
                    gh2Var3 = null;
                    z3 = z2;
                    rg3Var2 = filledShape;
                    i10 = i3;
                    dl1Var2 = dl1VarFilledTonalIconButtonColors;
                } else {
                    i10 = i3;
                    z3 = z2;
                    dl1Var2 = dl1VarFilledTonalIconButtonColors;
                    gh2Var3 = gh2Var2;
                    rg3Var2 = filledShape;
                }
            } else {
                if (i12 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if (i4 != 0) {
                    z2 = true;
                }
                i9 = i2 & 8;
                el1Var = el1.a;
                if (i9 != 0) {
                    i3 &= -7169;
                    filledShape = el1Var.getFilledShape(kk0Var2, 6);
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                    dl1VarFilledTonalIconButtonColors = el1Var.filledTonalIconButtonColors(kk0Var2, 6);
                }
                if (i6 != 0) {
                    gh2Var3 = null;
                    z3 = z2;
                    rg3Var2 = filledShape;
                    i10 = i3;
                    dl1Var2 = dl1VarFilledTonalIconButtonColors;
                } else {
                    i10 = i3;
                    z3 = z2;
                    dl1Var2 = dl1VarFilledTonalIconButtonColors;
                    gh2Var3 = gh2Var2;
                    rg3Var2 = filledShape;
                }
            }
            kk0Var2.s();
            c cVarB16 = we3.b(cVar3, false, fl1.l);
            if (z3) {
                j = dl1Var2.a;
            } else {
                j = dl1Var2.c;
            }
            long j18 = j;
            if (z3) {
                j2 = dl1Var2.b;
            } else {
                j2 = dl1Var2.d;
            }
            kk0Var = kk0Var2;
            hq3.m213xde3417d4(je1Var2, cVarB16, z3, rg3Var2, j18, j2, 0.0f, 0.0f, null, gh2Var3, zg0.rememberComposableLambda(-1772884636, true, new kl1(ne1Var), kk0Var2, 54), kk0Var, (i10 & 8078) | ((i10 << 12) & 1879048192), 6, 448);
            dl1Var3 = dl1Var2;
            cVar4 = cVar3;
            z4 = z3;
            rg3Var3 = rg3Var2;
            gh2Var4 = gh2Var3;
        }
        w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new hl1(je1Var, cVar4, z4, rg3Var3, dl1Var3, gh2Var4, ne1Var, i, i2, 1));
        }
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0123 A[PHI: r4 r7 r9 r10 r11
  0x0123: PHI (r4v29 int) = (r4v23 int), (r4v30 int), (r4v31 int) binds: [B:118:0x014b, B:104:0x011f, B:105:0x0121] A[DONT_GENERATE, DONT_INLINE]
  0x0123: PHI (r7v9 androidx.compose.ui.c) = (r7v3 androidx.compose.ui.c), (r7v2 androidx.compose.ui.c), (r7v2 androidx.compose.ui.c) binds: [B:118:0x014b, B:104:0x011f, B:105:0x0121] A[DONT_GENERATE, DONT_INLINE]
  0x0123: PHI (r9v14 boolean) = (r9v3 boolean), (r9v2 boolean), (r9v2 boolean) binds: [B:118:0x014b, B:104:0x011f, B:105:0x0121] A[DONT_GENERATE, DONT_INLINE]
  0x0123: PHI (r10v17 rg3) = (r10v7 rg3), (r10v6 rg3), (r10v6 rg3) binds: [B:118:0x014b, B:104:0x011f, B:105:0x0121] A[DONT_GENERATE, DONT_INLINE]
  0x0123: PHI (r11v10 vl1) = (r11v4 vl1), (r11v3 vl1), (r11v3 vl1) binds: [B:118:0x014b, B:104:0x011f, B:105:0x0121] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:108:0x012a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:109:0x012c  */
    /* JADX WARN: Code duplicated, block: B:111:0x0131  */
    /* JADX WARN: Code duplicated, block: B:114:0x0139  */
    /* JADX WARN: Code duplicated, block: B:117:0x0144  */
    /* JADX WARN: Code duplicated, block: B:119:0x014d  */
    /* JADX WARN: Code duplicated, block: B:123:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    /* JADX WARN: Code duplicated, block: B:28:0x004d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:32:0x0059  */
    /* JADX WARN: Code duplicated, block: B:33:0x005c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX WARN: Code duplicated, block: B:39:0x0068  */
    /* JADX WARN: Code duplicated, block: B:41:0x006c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0074  */
    /* JADX WARN: Code duplicated, block: B:44:0x0077  */
    /* JADX WARN: Code duplicated, block: B:48:0x007e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0082  */
    /* JADX WARN: Code duplicated, block: B:52:0x008a  */
    /* JADX WARN: Code duplicated, block: B:53:0x008d  */
    /* JADX WARN: Code duplicated, block: B:56:0x0093  */
    /* JADX WARN: Code duplicated, block: B:59:0x009a  */
    /* JADX WARN: Code duplicated, block: B:61:0x009e  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:67:0x00af  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:72:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:74:0x00be  */
    /* JADX WARN: Code duplicated, block: B:76:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:77:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:82:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:84:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:86:0x00df  */
    /* JADX WARN: Code duplicated, block: B:87:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:91:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:95:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:97:0x010d  */
    public static final void FilledTonalIconToggleButton(boolean z, le1 le1Var, c cVar, boolean z2, rg3 rg3Var, vl1 vl1Var, gh2 gh2Var, ne1 ne1Var, ck0 ck0Var, int i, int i2) {
        int i3;
        int i4;
        c cVar2;
        int i5;
        int i6;
        boolean z3;
        int i7;
        rg3 filledShape;
        vl1 vl1VarFilledTonalIconToggleButtonColors;
        int i8;
        gh2 gh2Var2;
        int i9;
        int i10;
        int i11;
        el1 el1Var;
        gh2 gh2Var3;
        c cVar3;
        boolean z4;
        vl1 vl1Var2;
        rg3 rg3Var2;
        gh2 gh2Var4;
        boolean z5;
        c cVar4;
        vl1 vl1Var3;
        w33 w33VarV;
        int i12;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(1676089246);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (kk0Var.i(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) == 0) {
            if ((i & 48) == 0) {
                i3 |= kk0Var.j(le1Var) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    cVar2 = cVar;
                    if (kk0Var.h(cVar2)) {
                        i5 = FontInfo.NUMBER_OF_CHAR_CODES;
                    } else {
                        i5 = Uuid.SIZE_BITS;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    if ((i & 3072) == 0) {
                        z3 = z2;
                        if (kk0Var.i(z3)) {
                            i7 = 2048;
                        } else {
                            i7 = 1024;
                        }
                        i3 |= i7;
                    }
                    if ((i & 24576) == 0) {
                        if ((i2 & 16) == 0) {
                            filledShape = rg3Var;
                            if (kk0Var.h(filledShape)) {
                                i12 = 16384;
                            }
                            i3 |= i12;
                        } else {
                            filledShape = rg3Var;
                        }
                        i12 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                        i3 |= i12;
                    } else {
                        filledShape = rg3Var;
                    }
                    if ((196608 & i) == 0) {
                        if ((i2 & 32) == 0) {
                            vl1VarFilledTonalIconToggleButtonColors = vl1Var;
                            int i13 = kk0Var.h(vl1VarFilledTonalIconToggleButtonColors) ? 131072 : 65536;
                            i3 |= i13;
                        } else {
                            vl1VarFilledTonalIconToggleButtonColors = vl1Var;
                        }
                        i3 |= i13;
                    } else {
                        vl1VarFilledTonalIconToggleButtonColors = vl1Var;
                    }
                    i8 = i2 & 64;
                    if (i8 != 0) {
                        if ((1572864 & i) == 0) {
                            gh2Var2 = gh2Var;
                            if (kk0Var.h(gh2Var2)) {
                                i9 = 1048576;
                            } else {
                                i9 = 524288;
                            }
                            i3 |= i9;
                        }
                        if ((i2 & Uuid.SIZE_BITS) != 0) {
                            i3 |= 12582912;
                        } else if ((i & 12582912) == 0) {
                            if (kk0Var.j(ne1Var)) {
                                i10 = 8388608;
                            } else {
                                i10 = 4194304;
                            }
                            i3 |= i10;
                        }
                        if ((4793491 & i3) == 4793490 || !kk0Var.F()) {
                            kk0Var.X();
                            if ((i & 1) != 0 || kk0Var.D()) {
                                if (i4 != 0) {
                                    cVar2 = c.i;
                                }
                                if (i6 != 0) {
                                    z3 = true;
                                }
                                i11 = i2 & 16;
                                el1Var = el1.a;
                                if (i11 != 0) {
                                    i3 &= -57345;
                                    filledShape = el1Var.getFilledShape(kk0Var, 6);
                                }
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                    vl1VarFilledTonalIconToggleButtonColors = el1Var.filledTonalIconToggleButtonColors(kk0Var, 6);
                                }
                                if (i8 != 0) {
                                    gh2Var3 = null;
                                    cVar3 = cVar2;
                                    z4 = z3;
                                    vl1Var2 = vl1VarFilledTonalIconToggleButtonColors;
                                }
                                int i14 = i3;
                                rg3 rg3Var3 = filledShape;
                                kk0Var.s();
                                int i15 = i14 >> 9;
                                int i16 = (i15 & 896) | (i15 & 14) | ((i14 << 3) & 112);
                                boolean z6 = z4;
                                hq3.m212x54dd086a(z, le1Var, we3.b(cVar3, false, fl1.m), z6, rg3Var3, ((re0) vl1Var2.containerColor$material3_release(z4, z, kk0Var, i16).getValue()).a, ((re0) vl1Var2.contentColor$material3_release(z4, z, kk0Var, i16).getValue()).a, 0.0f, 0.0f, (iw) null, gh2Var3, zg0.rememberComposableLambda(-58218680, true, new ll1(ne1Var), kk0Var, 54), kk0Var, i14 & 64638, ((i14 >> 18) & 14) | 48, 896);
                                rg3Var2 = rg3Var3;
                                gh2Var4 = gh2Var3;
                                z5 = z6;
                                cVar4 = cVar3;
                                vl1Var3 = vl1Var2;
                            } else {
                                kk0Var.V();
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                }
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                }
                            }
                            cVar3 = cVar2;
                            z4 = z3;
                            vl1Var2 = vl1VarFilledTonalIconToggleButtonColors;
                            gh2Var3 = gh2Var2;
                            int i17 = i3;
                            rg3 rg3Var4 = filledShape;
                            kk0Var.s();
                            int i18 = i17 >> 9;
                            int i19 = (i18 & 896) | (i18 & 14) | ((i17 << 3) & 112);
                            boolean z7 = z4;
                            hq3.m212x54dd086a(z, le1Var, we3.b(cVar3, false, fl1.m), z7, rg3Var4, ((re0) vl1Var2.containerColor$material3_release(z4, z, kk0Var, i19).getValue()).a, ((re0) vl1Var2.contentColor$material3_release(z4, z, kk0Var, i19).getValue()).a, 0.0f, 0.0f, (iw) null, gh2Var3, zg0.rememberComposableLambda(-58218680, true, new ll1(ne1Var), kk0Var, 54), kk0Var, i17 & 64638, ((i17 >> 18) & 14) | 48, 896);
                            rg3Var2 = rg3Var4;
                            gh2Var4 = gh2Var3;
                            z5 = z7;
                            cVar4 = cVar3;
                            vl1Var3 = vl1Var2;
                        } else {
                            kk0Var.V();
                            cVar4 = cVar2;
                            z5 = z3;
                            rg3Var2 = filledShape;
                            vl1Var3 = vl1VarFilledTonalIconToggleButtonColors;
                            gh2Var4 = gh2Var2;
                        }
                        w33VarV = kk0Var.v();
                        if (w33VarV != null) {
                            w33VarV.updateScope(new jl1(z, le1Var, cVar4, z5, rg3Var2, vl1Var3, gh2Var4, ne1Var, i, i2, 1));
                        }
                    }
                    i3 |= 1572864;
                    gh2Var2 = gh2Var;
                    if ((i2 & Uuid.SIZE_BITS) != 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        if (kk0Var.j(ne1Var)) {
                            i10 = 8388608;
                        } else {
                            i10 = 4194304;
                        }
                        i3 |= i10;
                    }
                    if ((4793491 & i3) == 4793490) {
                        kk0Var.X();
                        if ((i & 1) != 0) {
                            if (i4 != 0) {
                                cVar2 = c.i;
                            }
                            if (i6 != 0) {
                                z3 = true;
                            }
                            i11 = i2 & 16;
                            el1Var = el1.a;
                            if (i11 != 0) {
                                i3 &= -57345;
                                filledShape = el1Var.getFilledShape(kk0Var, 6);
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                                vl1VarFilledTonalIconToggleButtonColors = el1Var.filledTonalIconToggleButtonColors(kk0Var, 6);
                            }
                            if (i8 != 0) {
                                gh2Var3 = null;
                                cVar3 = cVar2;
                                z4 = z3;
                                vl1Var2 = vl1VarFilledTonalIconToggleButtonColors;
                            } else {
                                cVar3 = cVar2;
                                z4 = z3;
                                vl1Var2 = vl1VarFilledTonalIconToggleButtonColors;
                                gh2Var3 = gh2Var2;
                            }
                        } else {
                            if (i4 != 0) {
                                cVar2 = c.i;
                            }
                            if (i6 != 0) {
                                z3 = true;
                            }
                            i11 = i2 & 16;
                            el1Var = el1.a;
                            if (i11 != 0) {
                                i3 &= -57345;
                                filledShape = el1Var.getFilledShape(kk0Var, 6);
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                                vl1VarFilledTonalIconToggleButtonColors = el1Var.filledTonalIconToggleButtonColors(kk0Var, 6);
                            }
                            if (i8 != 0) {
                                gh2Var3 = null;
                                cVar3 = cVar2;
                                z4 = z3;
                                vl1Var2 = vl1VarFilledTonalIconToggleButtonColors;
                            } else {
                                cVar3 = cVar2;
                                z4 = z3;
                                vl1Var2 = vl1VarFilledTonalIconToggleButtonColors;
                                gh2Var3 = gh2Var2;
                            }
                        }
                        int i110 = i3;
                        rg3 rg3Var5 = filledShape;
                        kk0Var.s();
                        int i111 = i110 >> 9;
                        int i112 = (i111 & 896) | (i111 & 14) | ((i110 << 3) & 112);
                        boolean z8 = z4;
                        hq3.m212x54dd086a(z, le1Var, we3.b(cVar3, false, fl1.m), z8, rg3Var5, ((re0) vl1Var2.containerColor$material3_release(z4, z, kk0Var, i112).getValue()).a, ((re0) vl1Var2.contentColor$material3_release(z4, z, kk0Var, i112).getValue()).a, 0.0f, 0.0f, (iw) null, gh2Var3, zg0.rememberComposableLambda(-58218680, true, new ll1(ne1Var), kk0Var, 54), kk0Var, i110 & 64638, ((i110 >> 18) & 14) | 48, 896);
                        rg3Var2 = rg3Var5;
                        gh2Var4 = gh2Var3;
                        z5 = z8;
                        cVar4 = cVar3;
                        vl1Var3 = vl1Var2;
                    } else {
                        kk0Var.X();
                        if ((i & 1) != 0) {
                            if (i4 != 0) {
                                cVar2 = c.i;
                            }
                            if (i6 != 0) {
                                z3 = true;
                            }
                            i11 = i2 & 16;
                            el1Var = el1.a;
                            if (i11 != 0) {
                                i3 &= -57345;
                                filledShape = el1Var.getFilledShape(kk0Var, 6);
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                                vl1VarFilledTonalIconToggleButtonColors = el1Var.filledTonalIconToggleButtonColors(kk0Var, 6);
                            }
                            if (i8 != 0) {
                                gh2Var3 = null;
                                cVar3 = cVar2;
                                z4 = z3;
                                vl1Var2 = vl1VarFilledTonalIconToggleButtonColors;
                            } else {
                                cVar3 = cVar2;
                                z4 = z3;
                                vl1Var2 = vl1VarFilledTonalIconToggleButtonColors;
                                gh2Var3 = gh2Var2;
                            }
                        } else {
                            if (i4 != 0) {
                                cVar2 = c.i;
                            }
                            if (i6 != 0) {
                                z3 = true;
                            }
                            i11 = i2 & 16;
                            el1Var = el1.a;
                            if (i11 != 0) {
                                i3 &= -57345;
                                filledShape = el1Var.getFilledShape(kk0Var, 6);
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                                vl1VarFilledTonalIconToggleButtonColors = el1Var.filledTonalIconToggleButtonColors(kk0Var, 6);
                            }
                            if (i8 != 0) {
                                gh2Var3 = null;
                                cVar3 = cVar2;
                                z4 = z3;
                                vl1Var2 = vl1VarFilledTonalIconToggleButtonColors;
                            } else {
                                cVar3 = cVar2;
                                z4 = z3;
                                vl1Var2 = vl1VarFilledTonalIconToggleButtonColors;
                                gh2Var3 = gh2Var2;
                            }
                        }
                        int i113 = i3;
                        rg3 rg3Var6 = filledShape;
                        kk0Var.s();
                        int i114 = i113 >> 9;
                        int i115 = (i114 & 896) | (i114 & 14) | ((i113 << 3) & 112);
                        boolean z9 = z4;
                        hq3.m212x54dd086a(z, le1Var, we3.b(cVar3, false, fl1.m), z9, rg3Var6, ((re0) vl1Var2.containerColor$material3_release(z4, z, kk0Var, i115).getValue()).a, ((re0) vl1Var2.contentColor$material3_release(z4, z, kk0Var, i115).getValue()).a, 0.0f, 0.0f, (iw) null, gh2Var3, zg0.rememberComposableLambda(-58218680, true, new ll1(ne1Var), kk0Var, 54), kk0Var, i113 & 64638, ((i113 >> 18) & 14) | 48, 896);
                        rg3Var2 = rg3Var6;
                        gh2Var4 = gh2Var3;
                        z5 = z9;
                        cVar4 = cVar3;
                        vl1Var3 = vl1Var2;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new jl1(z, le1Var, cVar4, z5, rg3Var2, vl1Var3, gh2Var4, ne1Var, i, i2, 1));
                    }
                }
                i3 |= 3072;
                z3 = z2;
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        filledShape = rg3Var;
                        if (kk0Var.h(filledShape)) {
                            i12 = 16384;
                        }
                        i3 |= i12;
                    } else {
                        filledShape = rg3Var;
                    }
                    i12 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                    i3 |= i12;
                } else {
                    filledShape = rg3Var;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        vl1VarFilledTonalIconToggleButtonColors = vl1Var;
                        if (kk0Var.h(vl1VarFilledTonalIconToggleButtonColors)) {
                        }
                        i3 |= i13;
                    } else {
                        vl1VarFilledTonalIconToggleButtonColors = vl1Var;
                    }
                    i3 |= i13;
                } else {
                    vl1VarFilledTonalIconToggleButtonColors = vl1Var;
                }
                i8 = i2 & 64;
                if (i8 != 0) {
                    if ((1572864 & i) == 0) {
                        gh2Var2 = gh2Var;
                        if (kk0Var.h(gh2Var2)) {
                            i9 = 1048576;
                        } else {
                            i9 = 524288;
                        }
                        i3 |= i9;
                    }
                    if ((i2 & Uuid.SIZE_BITS) != 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        if (kk0Var.j(ne1Var)) {
                            i10 = 8388608;
                        } else {
                            i10 = 4194304;
                        }
                        i3 |= i10;
                    }
                    if ((4793491 & i3) == 4793490) {
                        kk0Var.X();
                        if ((i & 1) != 0) {
                            if (i4 != 0) {
                                cVar2 = c.i;
                            }
                            if (i6 != 0) {
                                z3 = true;
                            }
                            i11 = i2 & 16;
                            el1Var = el1.a;
                            if (i11 != 0) {
                                i3 &= -57345;
                                filledShape = el1Var.getFilledShape(kk0Var, 6);
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                                vl1VarFilledTonalIconToggleButtonColors = el1Var.filledTonalIconToggleButtonColors(kk0Var, 6);
                            }
                            if (i8 != 0) {
                                gh2Var3 = null;
                                cVar3 = cVar2;
                                z4 = z3;
                                vl1Var2 = vl1VarFilledTonalIconToggleButtonColors;
                            } else {
                                cVar3 = cVar2;
                                z4 = z3;
                                vl1Var2 = vl1VarFilledTonalIconToggleButtonColors;
                                gh2Var3 = gh2Var2;
                            }
                        } else {
                            if (i4 != 0) {
                                cVar2 = c.i;
                            }
                            if (i6 != 0) {
                                z3 = true;
                            }
                            i11 = i2 & 16;
                            el1Var = el1.a;
                            if (i11 != 0) {
                                i3 &= -57345;
                                filledShape = el1Var.getFilledShape(kk0Var, 6);
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                                vl1VarFilledTonalIconToggleButtonColors = el1Var.filledTonalIconToggleButtonColors(kk0Var, 6);
                            }
                            if (i8 != 0) {
                                gh2Var3 = null;
                                cVar3 = cVar2;
                                z4 = z3;
                                vl1Var2 = vl1VarFilledTonalIconToggleButtonColors;
                            } else {
                                cVar3 = cVar2;
                                z4 = z3;
                                vl1Var2 = vl1VarFilledTonalIconToggleButtonColors;
                                gh2Var3 = gh2Var2;
                            }
                        }
                        int i116 = i3;
                        rg3 rg3Var7 = filledShape;
                        kk0Var.s();
                        int i117 = i116 >> 9;
                        int i118 = (i117 & 896) | (i117 & 14) | ((i116 << 3) & 112);
                        boolean z10 = z4;
                        hq3.m212x54dd086a(z, le1Var, we3.b(cVar3, false, fl1.m), z10, rg3Var7, ((re0) vl1Var2.containerColor$material3_release(z4, z, kk0Var, i118).getValue()).a, ((re0) vl1Var2.contentColor$material3_release(z4, z, kk0Var, i118).getValue()).a, 0.0f, 0.0f, (iw) null, gh2Var3, zg0.rememberComposableLambda(-58218680, true, new ll1(ne1Var), kk0Var, 54), kk0Var, i116 & 64638, ((i116 >> 18) & 14) | 48, 896);
                        rg3Var2 = rg3Var7;
                        gh2Var4 = gh2Var3;
                        z5 = z10;
                        cVar4 = cVar3;
                        vl1Var3 = vl1Var2;
                    } else {
                        kk0Var.X();
                        if ((i & 1) != 0) {
                            if (i4 != 0) {
                                cVar2 = c.i;
                            }
                            if (i6 != 0) {
                                z3 = true;
                            }
                            i11 = i2 & 16;
                            el1Var = el1.a;
                            if (i11 != 0) {
                                i3 &= -57345;
                                filledShape = el1Var.getFilledShape(kk0Var, 6);
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                                vl1VarFilledTonalIconToggleButtonColors = el1Var.filledTonalIconToggleButtonColors(kk0Var, 6);
                            }
                            if (i8 != 0) {
                                gh2Var3 = null;
                                cVar3 = cVar2;
                                z4 = z3;
                                vl1Var2 = vl1VarFilledTonalIconToggleButtonColors;
                            } else {
                                cVar3 = cVar2;
                                z4 = z3;
                                vl1Var2 = vl1VarFilledTonalIconToggleButtonColors;
                                gh2Var3 = gh2Var2;
                            }
                        } else {
                            if (i4 != 0) {
                                cVar2 = c.i;
                            }
                            if (i6 != 0) {
                                z3 = true;
                            }
                            i11 = i2 & 16;
                            el1Var = el1.a;
                            if (i11 != 0) {
                                i3 &= -57345;
                                filledShape = el1Var.getFilledShape(kk0Var, 6);
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                                vl1VarFilledTonalIconToggleButtonColors = el1Var.filledTonalIconToggleButtonColors(kk0Var, 6);
                            }
                            if (i8 != 0) {
                                gh2Var3 = null;
                                cVar3 = cVar2;
                                z4 = z3;
                                vl1Var2 = vl1VarFilledTonalIconToggleButtonColors;
                            } else {
                                cVar3 = cVar2;
                                z4 = z3;
                                vl1Var2 = vl1VarFilledTonalIconToggleButtonColors;
                                gh2Var3 = gh2Var2;
                            }
                        }
                        int i119 = i3;
                        rg3 rg3Var8 = filledShape;
                        kk0Var.s();
                        int i1110 = i119 >> 9;
                        int i1111 = (i1110 & 896) | (i1110 & 14) | ((i119 << 3) & 112);
                        boolean z11 = z4;
                        hq3.m212x54dd086a(z, le1Var, we3.b(cVar3, false, fl1.m), z11, rg3Var8, ((re0) vl1Var2.containerColor$material3_release(z4, z, kk0Var, i1111).getValue()).a, ((re0) vl1Var2.contentColor$material3_release(z4, z, kk0Var, i1111).getValue()).a, 0.0f, 0.0f, (iw) null, gh2Var3, zg0.rememberComposableLambda(-58218680, true, new ll1(ne1Var), kk0Var, 54), kk0Var, i119 & 64638, ((i119 >> 18) & 14) | 48, 896);
                        rg3Var2 = rg3Var8;
                        gh2Var4 = gh2Var3;
                        z5 = z11;
                        cVar4 = cVar3;
                        vl1Var3 = vl1Var2;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new jl1(z, le1Var, cVar4, z5, rg3Var2, vl1Var3, gh2Var4, ne1Var, i, i2, 1));
                    }
                }
                i3 |= 1572864;
                gh2Var2 = gh2Var;
                if ((i2 & Uuid.SIZE_BITS) != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    if (kk0Var.j(ne1Var)) {
                        i10 = 8388608;
                    } else {
                        i10 = 4194304;
                    }
                    i3 |= i10;
                }
                if ((4793491 & i3) == 4793490) {
                    kk0Var.X();
                    if ((i & 1) != 0) {
                        if (i4 != 0) {
                            cVar2 = c.i;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        }
                        i11 = i2 & 16;
                        el1Var = el1.a;
                        if (i11 != 0) {
                            i3 &= -57345;
                            filledShape = el1Var.getFilledShape(kk0Var, 6);
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            vl1VarFilledTonalIconToggleButtonColors = el1Var.filledTonalIconToggleButtonColors(kk0Var, 6);
                        }
                        if (i8 != 0) {
                            gh2Var3 = null;
                            cVar3 = cVar2;
                            z4 = z3;
                            vl1Var2 = vl1VarFilledTonalIconToggleButtonColors;
                        } else {
                            cVar3 = cVar2;
                            z4 = z3;
                            vl1Var2 = vl1VarFilledTonalIconToggleButtonColors;
                            gh2Var3 = gh2Var2;
                        }
                    } else {
                        if (i4 != 0) {
                            cVar2 = c.i;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        }
                        i11 = i2 & 16;
                        el1Var = el1.a;
                        if (i11 != 0) {
                            i3 &= -57345;
                            filledShape = el1Var.getFilledShape(kk0Var, 6);
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            vl1VarFilledTonalIconToggleButtonColors = el1Var.filledTonalIconToggleButtonColors(kk0Var, 6);
                        }
                        if (i8 != 0) {
                            gh2Var3 = null;
                            cVar3 = cVar2;
                            z4 = z3;
                            vl1Var2 = vl1VarFilledTonalIconToggleButtonColors;
                        } else {
                            cVar3 = cVar2;
                            z4 = z3;
                            vl1Var2 = vl1VarFilledTonalIconToggleButtonColors;
                            gh2Var3 = gh2Var2;
                        }
                    }
                    int i1112 = i3;
                    rg3 rg3Var9 = filledShape;
                    kk0Var.s();
                    int i1113 = i1112 >> 9;
                    int i1114 = (i1113 & 896) | (i1113 & 14) | ((i1112 << 3) & 112);
                    boolean z12 = z4;
                    hq3.m212x54dd086a(z, le1Var, we3.b(cVar3, false, fl1.m), z12, rg3Var9, ((re0) vl1Var2.containerColor$material3_release(z4, z, kk0Var, i1114).getValue()).a, ((re0) vl1Var2.contentColor$material3_release(z4, z, kk0Var, i1114).getValue()).a, 0.0f, 0.0f, (iw) null, gh2Var3, zg0.rememberComposableLambda(-58218680, true, new ll1(ne1Var), kk0Var, 54), kk0Var, i1112 & 64638, ((i1112 >> 18) & 14) | 48, 896);
                    rg3Var2 = rg3Var9;
                    gh2Var4 = gh2Var3;
                    z5 = z12;
                    cVar4 = cVar3;
                    vl1Var3 = vl1Var2;
                } else {
                    kk0Var.X();
                    if ((i & 1) != 0) {
                        if (i4 != 0) {
                            cVar2 = c.i;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        }
                        i11 = i2 & 16;
                        el1Var = el1.a;
                        if (i11 != 0) {
                            i3 &= -57345;
                            filledShape = el1Var.getFilledShape(kk0Var, 6);
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            vl1VarFilledTonalIconToggleButtonColors = el1Var.filledTonalIconToggleButtonColors(kk0Var, 6);
                        }
                        if (i8 != 0) {
                            gh2Var3 = null;
                            cVar3 = cVar2;
                            z4 = z3;
                            vl1Var2 = vl1VarFilledTonalIconToggleButtonColors;
                        } else {
                            cVar3 = cVar2;
                            z4 = z3;
                            vl1Var2 = vl1VarFilledTonalIconToggleButtonColors;
                            gh2Var3 = gh2Var2;
                        }
                    } else {
                        if (i4 != 0) {
                            cVar2 = c.i;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        }
                        i11 = i2 & 16;
                        el1Var = el1.a;
                        if (i11 != 0) {
                            i3 &= -57345;
                            filledShape = el1Var.getFilledShape(kk0Var, 6);
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            vl1VarFilledTonalIconToggleButtonColors = el1Var.filledTonalIconToggleButtonColors(kk0Var, 6);
                        }
                        if (i8 != 0) {
                            gh2Var3 = null;
                            cVar3 = cVar2;
                            z4 = z3;
                            vl1Var2 = vl1VarFilledTonalIconToggleButtonColors;
                        } else {
                            cVar3 = cVar2;
                            z4 = z3;
                            vl1Var2 = vl1VarFilledTonalIconToggleButtonColors;
                            gh2Var3 = gh2Var2;
                        }
                    }
                    int i1115 = i3;
                    rg3 rg3Var10 = filledShape;
                    kk0Var.s();
                    int i1116 = i1115 >> 9;
                    int i1117 = (i1116 & 896) | (i1116 & 14) | ((i1115 << 3) & 112);
                    boolean z13 = z4;
                    hq3.m212x54dd086a(z, le1Var, we3.b(cVar3, false, fl1.m), z13, rg3Var10, ((re0) vl1Var2.containerColor$material3_release(z4, z, kk0Var, i1117).getValue()).a, ((re0) vl1Var2.contentColor$material3_release(z4, z, kk0Var, i1117).getValue()).a, 0.0f, 0.0f, (iw) null, gh2Var3, zg0.rememberComposableLambda(-58218680, true, new ll1(ne1Var), kk0Var, 54), kk0Var, i1115 & 64638, ((i1115 >> 18) & 14) | 48, 896);
                    rg3Var2 = rg3Var10;
                    gh2Var4 = gh2Var3;
                    z5 = z13;
                    cVar4 = cVar3;
                    vl1Var3 = vl1Var2;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new jl1(z, le1Var, cVar4, z5, rg3Var2, vl1Var3, gh2Var4, ne1Var, i, i2, 1));
                }
            }
            i3 |= 384;
            cVar2 = cVar;
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    z3 = z2;
                    if (kk0Var.i(z3)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        filledShape = rg3Var;
                        if (kk0Var.h(filledShape)) {
                            i12 = 16384;
                        }
                        i3 |= i12;
                    } else {
                        filledShape = rg3Var;
                    }
                    i12 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                    i3 |= i12;
                } else {
                    filledShape = rg3Var;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        vl1VarFilledTonalIconToggleButtonColors = vl1Var;
                        if (kk0Var.h(vl1VarFilledTonalIconToggleButtonColors)) {
                        }
                        i3 |= i13;
                    } else {
                        vl1VarFilledTonalIconToggleButtonColors = vl1Var;
                    }
                    i3 |= i13;
                } else {
                    vl1VarFilledTonalIconToggleButtonColors = vl1Var;
                }
                i8 = i2 & 64;
                if (i8 != 0) {
                    if ((1572864 & i) == 0) {
                        gh2Var2 = gh2Var;
                        if (kk0Var.h(gh2Var2)) {
                            i9 = 1048576;
                        } else {
                            i9 = 524288;
                        }
                        i3 |= i9;
                    }
                    if ((i2 & Uuid.SIZE_BITS) != 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        if (kk0Var.j(ne1Var)) {
                            i10 = 8388608;
                        } else {
                            i10 = 4194304;
                        }
                        i3 |= i10;
                    }
                    if ((4793491 & i3) == 4793490) {
                        kk0Var.X();
                        if ((i & 1) != 0) {
                            if (i4 != 0) {
                                cVar2 = c.i;
                            }
                            if (i6 != 0) {
                                z3 = true;
                            }
                            i11 = i2 & 16;
                            el1Var = el1.a;
                            if (i11 != 0) {
                                i3 &= -57345;
                                filledShape = el1Var.getFilledShape(kk0Var, 6);
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                                vl1VarFilledTonalIconToggleButtonColors = el1Var.filledTonalIconToggleButtonColors(kk0Var, 6);
                            }
                            if (i8 != 0) {
                                gh2Var3 = null;
                                cVar3 = cVar2;
                                z4 = z3;
                                vl1Var2 = vl1VarFilledTonalIconToggleButtonColors;
                            } else {
                                cVar3 = cVar2;
                                z4 = z3;
                                vl1Var2 = vl1VarFilledTonalIconToggleButtonColors;
                                gh2Var3 = gh2Var2;
                            }
                        } else {
                            if (i4 != 0) {
                                cVar2 = c.i;
                            }
                            if (i6 != 0) {
                                z3 = true;
                            }
                            i11 = i2 & 16;
                            el1Var = el1.a;
                            if (i11 != 0) {
                                i3 &= -57345;
                                filledShape = el1Var.getFilledShape(kk0Var, 6);
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                                vl1VarFilledTonalIconToggleButtonColors = el1Var.filledTonalIconToggleButtonColors(kk0Var, 6);
                            }
                            if (i8 != 0) {
                                gh2Var3 = null;
                                cVar3 = cVar2;
                                z4 = z3;
                                vl1Var2 = vl1VarFilledTonalIconToggleButtonColors;
                            } else {
                                cVar3 = cVar2;
                                z4 = z3;
                                vl1Var2 = vl1VarFilledTonalIconToggleButtonColors;
                                gh2Var3 = gh2Var2;
                            }
                        }
                        int i1118 = i3;
                        rg3 rg3Var11 = filledShape;
                        kk0Var.s();
                        int i1119 = i1118 >> 9;
                        int i11110 = (i1119 & 896) | (i1119 & 14) | ((i1118 << 3) & 112);
                        boolean z14 = z4;
                        hq3.m212x54dd086a(z, le1Var, we3.b(cVar3, false, fl1.m), z14, rg3Var11, ((re0) vl1Var2.containerColor$material3_release(z4, z, kk0Var, i11110).getValue()).a, ((re0) vl1Var2.contentColor$material3_release(z4, z, kk0Var, i11110).getValue()).a, 0.0f, 0.0f, (iw) null, gh2Var3, zg0.rememberComposableLambda(-58218680, true, new ll1(ne1Var), kk0Var, 54), kk0Var, i1118 & 64638, ((i1118 >> 18) & 14) | 48, 896);
                        rg3Var2 = rg3Var11;
                        gh2Var4 = gh2Var3;
                        z5 = z14;
                        cVar4 = cVar3;
                        vl1Var3 = vl1Var2;
                    } else {
                        kk0Var.X();
                        if ((i & 1) != 0) {
                            if (i4 != 0) {
                                cVar2 = c.i;
                            }
                            if (i6 != 0) {
                                z3 = true;
                            }
                            i11 = i2 & 16;
                            el1Var = el1.a;
                            if (i11 != 0) {
                                i3 &= -57345;
                                filledShape = el1Var.getFilledShape(kk0Var, 6);
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                                vl1VarFilledTonalIconToggleButtonColors = el1Var.filledTonalIconToggleButtonColors(kk0Var, 6);
                            }
                            if (i8 != 0) {
                                gh2Var3 = null;
                                cVar3 = cVar2;
                                z4 = z3;
                                vl1Var2 = vl1VarFilledTonalIconToggleButtonColors;
                            } else {
                                cVar3 = cVar2;
                                z4 = z3;
                                vl1Var2 = vl1VarFilledTonalIconToggleButtonColors;
                                gh2Var3 = gh2Var2;
                            }
                        } else {
                            if (i4 != 0) {
                                cVar2 = c.i;
                            }
                            if (i6 != 0) {
                                z3 = true;
                            }
                            i11 = i2 & 16;
                            el1Var = el1.a;
                            if (i11 != 0) {
                                i3 &= -57345;
                                filledShape = el1Var.getFilledShape(kk0Var, 6);
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                                vl1VarFilledTonalIconToggleButtonColors = el1Var.filledTonalIconToggleButtonColors(kk0Var, 6);
                            }
                            if (i8 != 0) {
                                gh2Var3 = null;
                                cVar3 = cVar2;
                                z4 = z3;
                                vl1Var2 = vl1VarFilledTonalIconToggleButtonColors;
                            } else {
                                cVar3 = cVar2;
                                z4 = z3;
                                vl1Var2 = vl1VarFilledTonalIconToggleButtonColors;
                                gh2Var3 = gh2Var2;
                            }
                        }
                        int i11111 = i3;
                        rg3 rg3Var12 = filledShape;
                        kk0Var.s();
                        int i11112 = i11111 >> 9;
                        int i11113 = (i11112 & 896) | (i11112 & 14) | ((i11111 << 3) & 112);
                        boolean z15 = z4;
                        hq3.m212x54dd086a(z, le1Var, we3.b(cVar3, false, fl1.m), z15, rg3Var12, ((re0) vl1Var2.containerColor$material3_release(z4, z, kk0Var, i11113).getValue()).a, ((re0) vl1Var2.contentColor$material3_release(z4, z, kk0Var, i11113).getValue()).a, 0.0f, 0.0f, (iw) null, gh2Var3, zg0.rememberComposableLambda(-58218680, true, new ll1(ne1Var), kk0Var, 54), kk0Var, i11111 & 64638, ((i11111 >> 18) & 14) | 48, 896);
                        rg3Var2 = rg3Var12;
                        gh2Var4 = gh2Var3;
                        z5 = z15;
                        cVar4 = cVar3;
                        vl1Var3 = vl1Var2;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new jl1(z, le1Var, cVar4, z5, rg3Var2, vl1Var3, gh2Var4, ne1Var, i, i2, 1));
                    }
                }
                i3 |= 1572864;
                gh2Var2 = gh2Var;
                if ((i2 & Uuid.SIZE_BITS) != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    if (kk0Var.j(ne1Var)) {
                        i10 = 8388608;
                    } else {
                        i10 = 4194304;
                    }
                    i3 |= i10;
                }
                if ((4793491 & i3) == 4793490) {
                    kk0Var.X();
                    if ((i & 1) != 0) {
                        if (i4 != 0) {
                            cVar2 = c.i;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        }
                        i11 = i2 & 16;
                        el1Var = el1.a;
                        if (i11 != 0) {
                            i3 &= -57345;
                            filledShape = el1Var.getFilledShape(kk0Var, 6);
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            vl1VarFilledTonalIconToggleButtonColors = el1Var.filledTonalIconToggleButtonColors(kk0Var, 6);
                        }
                        if (i8 != 0) {
                            gh2Var3 = null;
                            cVar3 = cVar2;
                            z4 = z3;
                            vl1Var2 = vl1VarFilledTonalIconToggleButtonColors;
                        } else {
                            cVar3 = cVar2;
                            z4 = z3;
                            vl1Var2 = vl1VarFilledTonalIconToggleButtonColors;
                            gh2Var3 = gh2Var2;
                        }
                    } else {
                        if (i4 != 0) {
                            cVar2 = c.i;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        }
                        i11 = i2 & 16;
                        el1Var = el1.a;
                        if (i11 != 0) {
                            i3 &= -57345;
                            filledShape = el1Var.getFilledShape(kk0Var, 6);
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            vl1VarFilledTonalIconToggleButtonColors = el1Var.filledTonalIconToggleButtonColors(kk0Var, 6);
                        }
                        if (i8 != 0) {
                            gh2Var3 = null;
                            cVar3 = cVar2;
                            z4 = z3;
                            vl1Var2 = vl1VarFilledTonalIconToggleButtonColors;
                        } else {
                            cVar3 = cVar2;
                            z4 = z3;
                            vl1Var2 = vl1VarFilledTonalIconToggleButtonColors;
                            gh2Var3 = gh2Var2;
                        }
                    }
                    int i11114 = i3;
                    rg3 rg3Var13 = filledShape;
                    kk0Var.s();
                    int i11115 = i11114 >> 9;
                    int i11116 = (i11115 & 896) | (i11115 & 14) | ((i11114 << 3) & 112);
                    boolean z16 = z4;
                    hq3.m212x54dd086a(z, le1Var, we3.b(cVar3, false, fl1.m), z16, rg3Var13, ((re0) vl1Var2.containerColor$material3_release(z4, z, kk0Var, i11116).getValue()).a, ((re0) vl1Var2.contentColor$material3_release(z4, z, kk0Var, i11116).getValue()).a, 0.0f, 0.0f, (iw) null, gh2Var3, zg0.rememberComposableLambda(-58218680, true, new ll1(ne1Var), kk0Var, 54), kk0Var, i11114 & 64638, ((i11114 >> 18) & 14) | 48, 896);
                    rg3Var2 = rg3Var13;
                    gh2Var4 = gh2Var3;
                    z5 = z16;
                    cVar4 = cVar3;
                    vl1Var3 = vl1Var2;
                } else {
                    kk0Var.X();
                    if ((i & 1) != 0) {
                        if (i4 != 0) {
                            cVar2 = c.i;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        }
                        i11 = i2 & 16;
                        el1Var = el1.a;
                        if (i11 != 0) {
                            i3 &= -57345;
                            filledShape = el1Var.getFilledShape(kk0Var, 6);
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            vl1VarFilledTonalIconToggleButtonColors = el1Var.filledTonalIconToggleButtonColors(kk0Var, 6);
                        }
                        if (i8 != 0) {
                            gh2Var3 = null;
                            cVar3 = cVar2;
                            z4 = z3;
                            vl1Var2 = vl1VarFilledTonalIconToggleButtonColors;
                        } else {
                            cVar3 = cVar2;
                            z4 = z3;
                            vl1Var2 = vl1VarFilledTonalIconToggleButtonColors;
                            gh2Var3 = gh2Var2;
                        }
                    } else {
                        if (i4 != 0) {
                            cVar2 = c.i;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        }
                        i11 = i2 & 16;
                        el1Var = el1.a;
                        if (i11 != 0) {
                            i3 &= -57345;
                            filledShape = el1Var.getFilledShape(kk0Var, 6);
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            vl1VarFilledTonalIconToggleButtonColors = el1Var.filledTonalIconToggleButtonColors(kk0Var, 6);
                        }
                        if (i8 != 0) {
                            gh2Var3 = null;
                            cVar3 = cVar2;
                            z4 = z3;
                            vl1Var2 = vl1VarFilledTonalIconToggleButtonColors;
                        } else {
                            cVar3 = cVar2;
                            z4 = z3;
                            vl1Var2 = vl1VarFilledTonalIconToggleButtonColors;
                            gh2Var3 = gh2Var2;
                        }
                    }
                    int i11117 = i3;
                    rg3 rg3Var14 = filledShape;
                    kk0Var.s();
                    int i11118 = i11117 >> 9;
                    int i11119 = (i11118 & 896) | (i11118 & 14) | ((i11117 << 3) & 112);
                    boolean z17 = z4;
                    hq3.m212x54dd086a(z, le1Var, we3.b(cVar3, false, fl1.m), z17, rg3Var14, ((re0) vl1Var2.containerColor$material3_release(z4, z, kk0Var, i11119).getValue()).a, ((re0) vl1Var2.contentColor$material3_release(z4, z, kk0Var, i11119).getValue()).a, 0.0f, 0.0f, (iw) null, gh2Var3, zg0.rememberComposableLambda(-58218680, true, new ll1(ne1Var), kk0Var, 54), kk0Var, i11117 & 64638, ((i11117 >> 18) & 14) | 48, 896);
                    rg3Var2 = rg3Var14;
                    gh2Var4 = gh2Var3;
                    z5 = z17;
                    cVar4 = cVar3;
                    vl1Var3 = vl1Var2;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new jl1(z, le1Var, cVar4, z5, rg3Var2, vl1Var3, gh2Var4, ne1Var, i, i2, 1));
                }
            }
            i3 |= 3072;
            z3 = z2;
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    filledShape = rg3Var;
                    if (kk0Var.h(filledShape)) {
                        i12 = 16384;
                    }
                    i3 |= i12;
                } else {
                    filledShape = rg3Var;
                }
                i12 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                i3 |= i12;
            } else {
                filledShape = rg3Var;
            }
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0) {
                    vl1VarFilledTonalIconToggleButtonColors = vl1Var;
                    if (kk0Var.h(vl1VarFilledTonalIconToggleButtonColors)) {
                    }
                    i3 |= i13;
                } else {
                    vl1VarFilledTonalIconToggleButtonColors = vl1Var;
                }
                i3 |= i13;
            } else {
                vl1VarFilledTonalIconToggleButtonColors = vl1Var;
            }
            i8 = i2 & 64;
            if (i8 != 0) {
                if ((1572864 & i) == 0) {
                    gh2Var2 = gh2Var;
                    if (kk0Var.h(gh2Var2)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i3 |= i9;
                }
                if ((i2 & Uuid.SIZE_BITS) != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    if (kk0Var.j(ne1Var)) {
                        i10 = 8388608;
                    } else {
                        i10 = 4194304;
                    }
                    i3 |= i10;
                }
                if ((4793491 & i3) == 4793490) {
                    kk0Var.X();
                    if ((i & 1) != 0) {
                        if (i4 != 0) {
                            cVar2 = c.i;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        }
                        i11 = i2 & 16;
                        el1Var = el1.a;
                        if (i11 != 0) {
                            i3 &= -57345;
                            filledShape = el1Var.getFilledShape(kk0Var, 6);
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            vl1VarFilledTonalIconToggleButtonColors = el1Var.filledTonalIconToggleButtonColors(kk0Var, 6);
                        }
                        if (i8 != 0) {
                            gh2Var3 = null;
                            cVar3 = cVar2;
                            z4 = z3;
                            vl1Var2 = vl1VarFilledTonalIconToggleButtonColors;
                        } else {
                            cVar3 = cVar2;
                            z4 = z3;
                            vl1Var2 = vl1VarFilledTonalIconToggleButtonColors;
                            gh2Var3 = gh2Var2;
                        }
                    } else {
                        if (i4 != 0) {
                            cVar2 = c.i;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        }
                        i11 = i2 & 16;
                        el1Var = el1.a;
                        if (i11 != 0) {
                            i3 &= -57345;
                            filledShape = el1Var.getFilledShape(kk0Var, 6);
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            vl1VarFilledTonalIconToggleButtonColors = el1Var.filledTonalIconToggleButtonColors(kk0Var, 6);
                        }
                        if (i8 != 0) {
                            gh2Var3 = null;
                            cVar3 = cVar2;
                            z4 = z3;
                            vl1Var2 = vl1VarFilledTonalIconToggleButtonColors;
                        } else {
                            cVar3 = cVar2;
                            z4 = z3;
                            vl1Var2 = vl1VarFilledTonalIconToggleButtonColors;
                            gh2Var3 = gh2Var2;
                        }
                    }
                    int i111110 = i3;
                    rg3 rg3Var15 = filledShape;
                    kk0Var.s();
                    int i111111 = i111110 >> 9;
                    int i111112 = (i111111 & 896) | (i111111 & 14) | ((i111110 << 3) & 112);
                    boolean z18 = z4;
                    hq3.m212x54dd086a(z, le1Var, we3.b(cVar3, false, fl1.m), z18, rg3Var15, ((re0) vl1Var2.containerColor$material3_release(z4, z, kk0Var, i111112).getValue()).a, ((re0) vl1Var2.contentColor$material3_release(z4, z, kk0Var, i111112).getValue()).a, 0.0f, 0.0f, (iw) null, gh2Var3, zg0.rememberComposableLambda(-58218680, true, new ll1(ne1Var), kk0Var, 54), kk0Var, i111110 & 64638, ((i111110 >> 18) & 14) | 48, 896);
                    rg3Var2 = rg3Var15;
                    gh2Var4 = gh2Var3;
                    z5 = z18;
                    cVar4 = cVar3;
                    vl1Var3 = vl1Var2;
                } else {
                    kk0Var.X();
                    if ((i & 1) != 0) {
                        if (i4 != 0) {
                            cVar2 = c.i;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        }
                        i11 = i2 & 16;
                        el1Var = el1.a;
                        if (i11 != 0) {
                            i3 &= -57345;
                            filledShape = el1Var.getFilledShape(kk0Var, 6);
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            vl1VarFilledTonalIconToggleButtonColors = el1Var.filledTonalIconToggleButtonColors(kk0Var, 6);
                        }
                        if (i8 != 0) {
                            gh2Var3 = null;
                            cVar3 = cVar2;
                            z4 = z3;
                            vl1Var2 = vl1VarFilledTonalIconToggleButtonColors;
                        } else {
                            cVar3 = cVar2;
                            z4 = z3;
                            vl1Var2 = vl1VarFilledTonalIconToggleButtonColors;
                            gh2Var3 = gh2Var2;
                        }
                    } else {
                        if (i4 != 0) {
                            cVar2 = c.i;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        }
                        i11 = i2 & 16;
                        el1Var = el1.a;
                        if (i11 != 0) {
                            i3 &= -57345;
                            filledShape = el1Var.getFilledShape(kk0Var, 6);
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            vl1VarFilledTonalIconToggleButtonColors = el1Var.filledTonalIconToggleButtonColors(kk0Var, 6);
                        }
                        if (i8 != 0) {
                            gh2Var3 = null;
                            cVar3 = cVar2;
                            z4 = z3;
                            vl1Var2 = vl1VarFilledTonalIconToggleButtonColors;
                        } else {
                            cVar3 = cVar2;
                            z4 = z3;
                            vl1Var2 = vl1VarFilledTonalIconToggleButtonColors;
                            gh2Var3 = gh2Var2;
                        }
                    }
                    int i111113 = i3;
                    rg3 rg3Var16 = filledShape;
                    kk0Var.s();
                    int i111114 = i111113 >> 9;
                    int i111115 = (i111114 & 896) | (i111114 & 14) | ((i111113 << 3) & 112);
                    boolean z19 = z4;
                    hq3.m212x54dd086a(z, le1Var, we3.b(cVar3, false, fl1.m), z19, rg3Var16, ((re0) vl1Var2.containerColor$material3_release(z4, z, kk0Var, i111115).getValue()).a, ((re0) vl1Var2.contentColor$material3_release(z4, z, kk0Var, i111115).getValue()).a, 0.0f, 0.0f, (iw) null, gh2Var3, zg0.rememberComposableLambda(-58218680, true, new ll1(ne1Var), kk0Var, 54), kk0Var, i111113 & 64638, ((i111113 >> 18) & 14) | 48, 896);
                    rg3Var2 = rg3Var16;
                    gh2Var4 = gh2Var3;
                    z5 = z19;
                    cVar4 = cVar3;
                    vl1Var3 = vl1Var2;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new jl1(z, le1Var, cVar4, z5, rg3Var2, vl1Var3, gh2Var4, ne1Var, i, i2, 1));
                }
            }
            i3 |= 1572864;
            gh2Var2 = gh2Var;
            if ((i2 & Uuid.SIZE_BITS) != 0) {
                i3 |= 12582912;
            } else if ((i & 12582912) == 0) {
                if (kk0Var.j(ne1Var)) {
                    i10 = 8388608;
                } else {
                    i10 = 4194304;
                }
                i3 |= i10;
            }
            if ((4793491 & i3) == 4793490) {
                kk0Var.X();
                if ((i & 1) != 0) {
                    if (i4 != 0) {
                        cVar2 = c.i;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    }
                    i11 = i2 & 16;
                    el1Var = el1.a;
                    if (i11 != 0) {
                        i3 &= -57345;
                        filledShape = el1Var.getFilledShape(kk0Var, 6);
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        vl1VarFilledTonalIconToggleButtonColors = el1Var.filledTonalIconToggleButtonColors(kk0Var, 6);
                    }
                    if (i8 != 0) {
                        gh2Var3 = null;
                        cVar3 = cVar2;
                        z4 = z3;
                        vl1Var2 = vl1VarFilledTonalIconToggleButtonColors;
                    } else {
                        cVar3 = cVar2;
                        z4 = z3;
                        vl1Var2 = vl1VarFilledTonalIconToggleButtonColors;
                        gh2Var3 = gh2Var2;
                    }
                } else {
                    if (i4 != 0) {
                        cVar2 = c.i;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    }
                    i11 = i2 & 16;
                    el1Var = el1.a;
                    if (i11 != 0) {
                        i3 &= -57345;
                        filledShape = el1Var.getFilledShape(kk0Var, 6);
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        vl1VarFilledTonalIconToggleButtonColors = el1Var.filledTonalIconToggleButtonColors(kk0Var, 6);
                    }
                    if (i8 != 0) {
                        gh2Var3 = null;
                        cVar3 = cVar2;
                        z4 = z3;
                        vl1Var2 = vl1VarFilledTonalIconToggleButtonColors;
                    } else {
                        cVar3 = cVar2;
                        z4 = z3;
                        vl1Var2 = vl1VarFilledTonalIconToggleButtonColors;
                        gh2Var3 = gh2Var2;
                    }
                }
                int i111116 = i3;
                rg3 rg3Var17 = filledShape;
                kk0Var.s();
                int i111117 = i111116 >> 9;
                int i111118 = (i111117 & 896) | (i111117 & 14) | ((i111116 << 3) & 112);
                boolean z110 = z4;
                hq3.m212x54dd086a(z, le1Var, we3.b(cVar3, false, fl1.m), z110, rg3Var17, ((re0) vl1Var2.containerColor$material3_release(z4, z, kk0Var, i111118).getValue()).a, ((re0) vl1Var2.contentColor$material3_release(z4, z, kk0Var, i111118).getValue()).a, 0.0f, 0.0f, (iw) null, gh2Var3, zg0.rememberComposableLambda(-58218680, true, new ll1(ne1Var), kk0Var, 54), kk0Var, i111116 & 64638, ((i111116 >> 18) & 14) | 48, 896);
                rg3Var2 = rg3Var17;
                gh2Var4 = gh2Var3;
                z5 = z110;
                cVar4 = cVar3;
                vl1Var3 = vl1Var2;
            } else {
                kk0Var.X();
                if ((i & 1) != 0) {
                    if (i4 != 0) {
                        cVar2 = c.i;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    }
                    i11 = i2 & 16;
                    el1Var = el1.a;
                    if (i11 != 0) {
                        i3 &= -57345;
                        filledShape = el1Var.getFilledShape(kk0Var, 6);
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        vl1VarFilledTonalIconToggleButtonColors = el1Var.filledTonalIconToggleButtonColors(kk0Var, 6);
                    }
                    if (i8 != 0) {
                        gh2Var3 = null;
                        cVar3 = cVar2;
                        z4 = z3;
                        vl1Var2 = vl1VarFilledTonalIconToggleButtonColors;
                    } else {
                        cVar3 = cVar2;
                        z4 = z3;
                        vl1Var2 = vl1VarFilledTonalIconToggleButtonColors;
                        gh2Var3 = gh2Var2;
                    }
                } else {
                    if (i4 != 0) {
                        cVar2 = c.i;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    }
                    i11 = i2 & 16;
                    el1Var = el1.a;
                    if (i11 != 0) {
                        i3 &= -57345;
                        filledShape = el1Var.getFilledShape(kk0Var, 6);
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        vl1VarFilledTonalIconToggleButtonColors = el1Var.filledTonalIconToggleButtonColors(kk0Var, 6);
                    }
                    if (i8 != 0) {
                        gh2Var3 = null;
                        cVar3 = cVar2;
                        z4 = z3;
                        vl1Var2 = vl1VarFilledTonalIconToggleButtonColors;
                    } else {
                        cVar3 = cVar2;
                        z4 = z3;
                        vl1Var2 = vl1VarFilledTonalIconToggleButtonColors;
                        gh2Var3 = gh2Var2;
                    }
                }
                int i111119 = i3;
                rg3 rg3Var18 = filledShape;
                kk0Var.s();
                int i1111110 = i111119 >> 9;
                int i1111111 = (i1111110 & 896) | (i1111110 & 14) | ((i111119 << 3) & 112);
                boolean z111 = z4;
                hq3.m212x54dd086a(z, le1Var, we3.b(cVar3, false, fl1.m), z111, rg3Var18, ((re0) vl1Var2.containerColor$material3_release(z4, z, kk0Var, i1111111).getValue()).a, ((re0) vl1Var2.contentColor$material3_release(z4, z, kk0Var, i1111111).getValue()).a, 0.0f, 0.0f, (iw) null, gh2Var3, zg0.rememberComposableLambda(-58218680, true, new ll1(ne1Var), kk0Var, 54), kk0Var, i111119 & 64638, ((i111119 >> 18) & 14) | 48, 896);
                rg3Var2 = rg3Var18;
                gh2Var4 = gh2Var3;
                z5 = z111;
                cVar4 = cVar3;
                vl1Var3 = vl1Var2;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new jl1(z, le1Var, cVar4, z5, rg3Var2, vl1Var3, gh2Var4, ne1Var, i, i2, 1));
            }
        }
        i3 |= 48;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                cVar2 = cVar;
                if (kk0Var.h(cVar2)) {
                    i5 = FontInfo.NUMBER_OF_CHAR_CODES;
                } else {
                    i5 = Uuid.SIZE_BITS;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    z3 = z2;
                    if (kk0Var.i(z3)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        filledShape = rg3Var;
                        if (kk0Var.h(filledShape)) {
                            i12 = 16384;
                        }
                        i3 |= i12;
                    } else {
                        filledShape = rg3Var;
                    }
                    i12 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                    i3 |= i12;
                } else {
                    filledShape = rg3Var;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        vl1VarFilledTonalIconToggleButtonColors = vl1Var;
                        if (kk0Var.h(vl1VarFilledTonalIconToggleButtonColors)) {
                        }
                        i3 |= i13;
                    } else {
                        vl1VarFilledTonalIconToggleButtonColors = vl1Var;
                    }
                    i3 |= i13;
                } else {
                    vl1VarFilledTonalIconToggleButtonColors = vl1Var;
                }
                i8 = i2 & 64;
                if (i8 != 0) {
                    if ((1572864 & i) == 0) {
                        gh2Var2 = gh2Var;
                        if (kk0Var.h(gh2Var2)) {
                            i9 = 1048576;
                        } else {
                            i9 = 524288;
                        }
                        i3 |= i9;
                    }
                    if ((i2 & Uuid.SIZE_BITS) != 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        if (kk0Var.j(ne1Var)) {
                            i10 = 8388608;
                        } else {
                            i10 = 4194304;
                        }
                        i3 |= i10;
                    }
                    if ((4793491 & i3) == 4793490) {
                        kk0Var.X();
                        if ((i & 1) != 0) {
                            if (i4 != 0) {
                                cVar2 = c.i;
                            }
                            if (i6 != 0) {
                                z3 = true;
                            }
                            i11 = i2 & 16;
                            el1Var = el1.a;
                            if (i11 != 0) {
                                i3 &= -57345;
                                filledShape = el1Var.getFilledShape(kk0Var, 6);
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                                vl1VarFilledTonalIconToggleButtonColors = el1Var.filledTonalIconToggleButtonColors(kk0Var, 6);
                            }
                            if (i8 != 0) {
                                gh2Var3 = null;
                                cVar3 = cVar2;
                                z4 = z3;
                                vl1Var2 = vl1VarFilledTonalIconToggleButtonColors;
                            } else {
                                cVar3 = cVar2;
                                z4 = z3;
                                vl1Var2 = vl1VarFilledTonalIconToggleButtonColors;
                                gh2Var3 = gh2Var2;
                            }
                        } else {
                            if (i4 != 0) {
                                cVar2 = c.i;
                            }
                            if (i6 != 0) {
                                z3 = true;
                            }
                            i11 = i2 & 16;
                            el1Var = el1.a;
                            if (i11 != 0) {
                                i3 &= -57345;
                                filledShape = el1Var.getFilledShape(kk0Var, 6);
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                                vl1VarFilledTonalIconToggleButtonColors = el1Var.filledTonalIconToggleButtonColors(kk0Var, 6);
                            }
                            if (i8 != 0) {
                                gh2Var3 = null;
                                cVar3 = cVar2;
                                z4 = z3;
                                vl1Var2 = vl1VarFilledTonalIconToggleButtonColors;
                            } else {
                                cVar3 = cVar2;
                                z4 = z3;
                                vl1Var2 = vl1VarFilledTonalIconToggleButtonColors;
                                gh2Var3 = gh2Var2;
                            }
                        }
                        int i1111112 = i3;
                        rg3 rg3Var19 = filledShape;
                        kk0Var.s();
                        int i1111113 = i1111112 >> 9;
                        int i1111114 = (i1111113 & 896) | (i1111113 & 14) | ((i1111112 << 3) & 112);
                        boolean z112 = z4;
                        hq3.m212x54dd086a(z, le1Var, we3.b(cVar3, false, fl1.m), z112, rg3Var19, ((re0) vl1Var2.containerColor$material3_release(z4, z, kk0Var, i1111114).getValue()).a, ((re0) vl1Var2.contentColor$material3_release(z4, z, kk0Var, i1111114).getValue()).a, 0.0f, 0.0f, (iw) null, gh2Var3, zg0.rememberComposableLambda(-58218680, true, new ll1(ne1Var), kk0Var, 54), kk0Var, i1111112 & 64638, ((i1111112 >> 18) & 14) | 48, 896);
                        rg3Var2 = rg3Var19;
                        gh2Var4 = gh2Var3;
                        z5 = z112;
                        cVar4 = cVar3;
                        vl1Var3 = vl1Var2;
                    } else {
                        kk0Var.X();
                        if ((i & 1) != 0) {
                            if (i4 != 0) {
                                cVar2 = c.i;
                            }
                            if (i6 != 0) {
                                z3 = true;
                            }
                            i11 = i2 & 16;
                            el1Var = el1.a;
                            if (i11 != 0) {
                                i3 &= -57345;
                                filledShape = el1Var.getFilledShape(kk0Var, 6);
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                                vl1VarFilledTonalIconToggleButtonColors = el1Var.filledTonalIconToggleButtonColors(kk0Var, 6);
                            }
                            if (i8 != 0) {
                                gh2Var3 = null;
                                cVar3 = cVar2;
                                z4 = z3;
                                vl1Var2 = vl1VarFilledTonalIconToggleButtonColors;
                            } else {
                                cVar3 = cVar2;
                                z4 = z3;
                                vl1Var2 = vl1VarFilledTonalIconToggleButtonColors;
                                gh2Var3 = gh2Var2;
                            }
                        } else {
                            if (i4 != 0) {
                                cVar2 = c.i;
                            }
                            if (i6 != 0) {
                                z3 = true;
                            }
                            i11 = i2 & 16;
                            el1Var = el1.a;
                            if (i11 != 0) {
                                i3 &= -57345;
                                filledShape = el1Var.getFilledShape(kk0Var, 6);
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                                vl1VarFilledTonalIconToggleButtonColors = el1Var.filledTonalIconToggleButtonColors(kk0Var, 6);
                            }
                            if (i8 != 0) {
                                gh2Var3 = null;
                                cVar3 = cVar2;
                                z4 = z3;
                                vl1Var2 = vl1VarFilledTonalIconToggleButtonColors;
                            } else {
                                cVar3 = cVar2;
                                z4 = z3;
                                vl1Var2 = vl1VarFilledTonalIconToggleButtonColors;
                                gh2Var3 = gh2Var2;
                            }
                        }
                        int i1111115 = i3;
                        rg3 rg3Var110 = filledShape;
                        kk0Var.s();
                        int i1111116 = i1111115 >> 9;
                        int i1111117 = (i1111116 & 896) | (i1111116 & 14) | ((i1111115 << 3) & 112);
                        boolean z113 = z4;
                        hq3.m212x54dd086a(z, le1Var, we3.b(cVar3, false, fl1.m), z113, rg3Var110, ((re0) vl1Var2.containerColor$material3_release(z4, z, kk0Var, i1111117).getValue()).a, ((re0) vl1Var2.contentColor$material3_release(z4, z, kk0Var, i1111117).getValue()).a, 0.0f, 0.0f, (iw) null, gh2Var3, zg0.rememberComposableLambda(-58218680, true, new ll1(ne1Var), kk0Var, 54), kk0Var, i1111115 & 64638, ((i1111115 >> 18) & 14) | 48, 896);
                        rg3Var2 = rg3Var110;
                        gh2Var4 = gh2Var3;
                        z5 = z113;
                        cVar4 = cVar3;
                        vl1Var3 = vl1Var2;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new jl1(z, le1Var, cVar4, z5, rg3Var2, vl1Var3, gh2Var4, ne1Var, i, i2, 1));
                    }
                }
                i3 |= 1572864;
                gh2Var2 = gh2Var;
                if ((i2 & Uuid.SIZE_BITS) != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    if (kk0Var.j(ne1Var)) {
                        i10 = 8388608;
                    } else {
                        i10 = 4194304;
                    }
                    i3 |= i10;
                }
                if ((4793491 & i3) == 4793490) {
                    kk0Var.X();
                    if ((i & 1) != 0) {
                        if (i4 != 0) {
                            cVar2 = c.i;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        }
                        i11 = i2 & 16;
                        el1Var = el1.a;
                        if (i11 != 0) {
                            i3 &= -57345;
                            filledShape = el1Var.getFilledShape(kk0Var, 6);
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            vl1VarFilledTonalIconToggleButtonColors = el1Var.filledTonalIconToggleButtonColors(kk0Var, 6);
                        }
                        if (i8 != 0) {
                            gh2Var3 = null;
                            cVar3 = cVar2;
                            z4 = z3;
                            vl1Var2 = vl1VarFilledTonalIconToggleButtonColors;
                        } else {
                            cVar3 = cVar2;
                            z4 = z3;
                            vl1Var2 = vl1VarFilledTonalIconToggleButtonColors;
                            gh2Var3 = gh2Var2;
                        }
                    } else {
                        if (i4 != 0) {
                            cVar2 = c.i;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        }
                        i11 = i2 & 16;
                        el1Var = el1.a;
                        if (i11 != 0) {
                            i3 &= -57345;
                            filledShape = el1Var.getFilledShape(kk0Var, 6);
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            vl1VarFilledTonalIconToggleButtonColors = el1Var.filledTonalIconToggleButtonColors(kk0Var, 6);
                        }
                        if (i8 != 0) {
                            gh2Var3 = null;
                            cVar3 = cVar2;
                            z4 = z3;
                            vl1Var2 = vl1VarFilledTonalIconToggleButtonColors;
                        } else {
                            cVar3 = cVar2;
                            z4 = z3;
                            vl1Var2 = vl1VarFilledTonalIconToggleButtonColors;
                            gh2Var3 = gh2Var2;
                        }
                    }
                    int i1111118 = i3;
                    rg3 rg3Var111 = filledShape;
                    kk0Var.s();
                    int i1111119 = i1111118 >> 9;
                    int i11111110 = (i1111119 & 896) | (i1111119 & 14) | ((i1111118 << 3) & 112);
                    boolean z114 = z4;
                    hq3.m212x54dd086a(z, le1Var, we3.b(cVar3, false, fl1.m), z114, rg3Var111, ((re0) vl1Var2.containerColor$material3_release(z4, z, kk0Var, i11111110).getValue()).a, ((re0) vl1Var2.contentColor$material3_release(z4, z, kk0Var, i11111110).getValue()).a, 0.0f, 0.0f, (iw) null, gh2Var3, zg0.rememberComposableLambda(-58218680, true, new ll1(ne1Var), kk0Var, 54), kk0Var, i1111118 & 64638, ((i1111118 >> 18) & 14) | 48, 896);
                    rg3Var2 = rg3Var111;
                    gh2Var4 = gh2Var3;
                    z5 = z114;
                    cVar4 = cVar3;
                    vl1Var3 = vl1Var2;
                } else {
                    kk0Var.X();
                    if ((i & 1) != 0) {
                        if (i4 != 0) {
                            cVar2 = c.i;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        }
                        i11 = i2 & 16;
                        el1Var = el1.a;
                        if (i11 != 0) {
                            i3 &= -57345;
                            filledShape = el1Var.getFilledShape(kk0Var, 6);
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            vl1VarFilledTonalIconToggleButtonColors = el1Var.filledTonalIconToggleButtonColors(kk0Var, 6);
                        }
                        if (i8 != 0) {
                            gh2Var3 = null;
                            cVar3 = cVar2;
                            z4 = z3;
                            vl1Var2 = vl1VarFilledTonalIconToggleButtonColors;
                        } else {
                            cVar3 = cVar2;
                            z4 = z3;
                            vl1Var2 = vl1VarFilledTonalIconToggleButtonColors;
                            gh2Var3 = gh2Var2;
                        }
                    } else {
                        if (i4 != 0) {
                            cVar2 = c.i;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        }
                        i11 = i2 & 16;
                        el1Var = el1.a;
                        if (i11 != 0) {
                            i3 &= -57345;
                            filledShape = el1Var.getFilledShape(kk0Var, 6);
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            vl1VarFilledTonalIconToggleButtonColors = el1Var.filledTonalIconToggleButtonColors(kk0Var, 6);
                        }
                        if (i8 != 0) {
                            gh2Var3 = null;
                            cVar3 = cVar2;
                            z4 = z3;
                            vl1Var2 = vl1VarFilledTonalIconToggleButtonColors;
                        } else {
                            cVar3 = cVar2;
                            z4 = z3;
                            vl1Var2 = vl1VarFilledTonalIconToggleButtonColors;
                            gh2Var3 = gh2Var2;
                        }
                    }
                    int i11111111 = i3;
                    rg3 rg3Var112 = filledShape;
                    kk0Var.s();
                    int i11111112 = i11111111 >> 9;
                    int i11111113 = (i11111112 & 896) | (i11111112 & 14) | ((i11111111 << 3) & 112);
                    boolean z115 = z4;
                    hq3.m212x54dd086a(z, le1Var, we3.b(cVar3, false, fl1.m), z115, rg3Var112, ((re0) vl1Var2.containerColor$material3_release(z4, z, kk0Var, i11111113).getValue()).a, ((re0) vl1Var2.contentColor$material3_release(z4, z, kk0Var, i11111113).getValue()).a, 0.0f, 0.0f, (iw) null, gh2Var3, zg0.rememberComposableLambda(-58218680, true, new ll1(ne1Var), kk0Var, 54), kk0Var, i11111111 & 64638, ((i11111111 >> 18) & 14) | 48, 896);
                    rg3Var2 = rg3Var112;
                    gh2Var4 = gh2Var3;
                    z5 = z115;
                    cVar4 = cVar3;
                    vl1Var3 = vl1Var2;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new jl1(z, le1Var, cVar4, z5, rg3Var2, vl1Var3, gh2Var4, ne1Var, i, i2, 1));
                }
            }
            i3 |= 3072;
            z3 = z2;
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    filledShape = rg3Var;
                    if (kk0Var.h(filledShape)) {
                        i12 = 16384;
                    }
                    i3 |= i12;
                } else {
                    filledShape = rg3Var;
                }
                i12 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                i3 |= i12;
            } else {
                filledShape = rg3Var;
            }
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0) {
                    vl1VarFilledTonalIconToggleButtonColors = vl1Var;
                    if (kk0Var.h(vl1VarFilledTonalIconToggleButtonColors)) {
                    }
                    i3 |= i13;
                } else {
                    vl1VarFilledTonalIconToggleButtonColors = vl1Var;
                }
                i3 |= i13;
            } else {
                vl1VarFilledTonalIconToggleButtonColors = vl1Var;
            }
            i8 = i2 & 64;
            if (i8 != 0) {
                if ((1572864 & i) == 0) {
                    gh2Var2 = gh2Var;
                    if (kk0Var.h(gh2Var2)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i3 |= i9;
                }
                if ((i2 & Uuid.SIZE_BITS) != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    if (kk0Var.j(ne1Var)) {
                        i10 = 8388608;
                    } else {
                        i10 = 4194304;
                    }
                    i3 |= i10;
                }
                if ((4793491 & i3) == 4793490) {
                    kk0Var.X();
                    if ((i & 1) != 0) {
                        if (i4 != 0) {
                            cVar2 = c.i;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        }
                        i11 = i2 & 16;
                        el1Var = el1.a;
                        if (i11 != 0) {
                            i3 &= -57345;
                            filledShape = el1Var.getFilledShape(kk0Var, 6);
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            vl1VarFilledTonalIconToggleButtonColors = el1Var.filledTonalIconToggleButtonColors(kk0Var, 6);
                        }
                        if (i8 != 0) {
                            gh2Var3 = null;
                            cVar3 = cVar2;
                            z4 = z3;
                            vl1Var2 = vl1VarFilledTonalIconToggleButtonColors;
                        } else {
                            cVar3 = cVar2;
                            z4 = z3;
                            vl1Var2 = vl1VarFilledTonalIconToggleButtonColors;
                            gh2Var3 = gh2Var2;
                        }
                    } else {
                        if (i4 != 0) {
                            cVar2 = c.i;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        }
                        i11 = i2 & 16;
                        el1Var = el1.a;
                        if (i11 != 0) {
                            i3 &= -57345;
                            filledShape = el1Var.getFilledShape(kk0Var, 6);
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            vl1VarFilledTonalIconToggleButtonColors = el1Var.filledTonalIconToggleButtonColors(kk0Var, 6);
                        }
                        if (i8 != 0) {
                            gh2Var3 = null;
                            cVar3 = cVar2;
                            z4 = z3;
                            vl1Var2 = vl1VarFilledTonalIconToggleButtonColors;
                        } else {
                            cVar3 = cVar2;
                            z4 = z3;
                            vl1Var2 = vl1VarFilledTonalIconToggleButtonColors;
                            gh2Var3 = gh2Var2;
                        }
                    }
                    int i11111114 = i3;
                    rg3 rg3Var113 = filledShape;
                    kk0Var.s();
                    int i11111115 = i11111114 >> 9;
                    int i11111116 = (i11111115 & 896) | (i11111115 & 14) | ((i11111114 << 3) & 112);
                    boolean z116 = z4;
                    hq3.m212x54dd086a(z, le1Var, we3.b(cVar3, false, fl1.m), z116, rg3Var113, ((re0) vl1Var2.containerColor$material3_release(z4, z, kk0Var, i11111116).getValue()).a, ((re0) vl1Var2.contentColor$material3_release(z4, z, kk0Var, i11111116).getValue()).a, 0.0f, 0.0f, (iw) null, gh2Var3, zg0.rememberComposableLambda(-58218680, true, new ll1(ne1Var), kk0Var, 54), kk0Var, i11111114 & 64638, ((i11111114 >> 18) & 14) | 48, 896);
                    rg3Var2 = rg3Var113;
                    gh2Var4 = gh2Var3;
                    z5 = z116;
                    cVar4 = cVar3;
                    vl1Var3 = vl1Var2;
                } else {
                    kk0Var.X();
                    if ((i & 1) != 0) {
                        if (i4 != 0) {
                            cVar2 = c.i;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        }
                        i11 = i2 & 16;
                        el1Var = el1.a;
                        if (i11 != 0) {
                            i3 &= -57345;
                            filledShape = el1Var.getFilledShape(kk0Var, 6);
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            vl1VarFilledTonalIconToggleButtonColors = el1Var.filledTonalIconToggleButtonColors(kk0Var, 6);
                        }
                        if (i8 != 0) {
                            gh2Var3 = null;
                            cVar3 = cVar2;
                            z4 = z3;
                            vl1Var2 = vl1VarFilledTonalIconToggleButtonColors;
                        } else {
                            cVar3 = cVar2;
                            z4 = z3;
                            vl1Var2 = vl1VarFilledTonalIconToggleButtonColors;
                            gh2Var3 = gh2Var2;
                        }
                    } else {
                        if (i4 != 0) {
                            cVar2 = c.i;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        }
                        i11 = i2 & 16;
                        el1Var = el1.a;
                        if (i11 != 0) {
                            i3 &= -57345;
                            filledShape = el1Var.getFilledShape(kk0Var, 6);
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            vl1VarFilledTonalIconToggleButtonColors = el1Var.filledTonalIconToggleButtonColors(kk0Var, 6);
                        }
                        if (i8 != 0) {
                            gh2Var3 = null;
                            cVar3 = cVar2;
                            z4 = z3;
                            vl1Var2 = vl1VarFilledTonalIconToggleButtonColors;
                        } else {
                            cVar3 = cVar2;
                            z4 = z3;
                            vl1Var2 = vl1VarFilledTonalIconToggleButtonColors;
                            gh2Var3 = gh2Var2;
                        }
                    }
                    int i11111117 = i3;
                    rg3 rg3Var114 = filledShape;
                    kk0Var.s();
                    int i11111118 = i11111117 >> 9;
                    int i11111119 = (i11111118 & 896) | (i11111118 & 14) | ((i11111117 << 3) & 112);
                    boolean z117 = z4;
                    hq3.m212x54dd086a(z, le1Var, we3.b(cVar3, false, fl1.m), z117, rg3Var114, ((re0) vl1Var2.containerColor$material3_release(z4, z, kk0Var, i11111119).getValue()).a, ((re0) vl1Var2.contentColor$material3_release(z4, z, kk0Var, i11111119).getValue()).a, 0.0f, 0.0f, (iw) null, gh2Var3, zg0.rememberComposableLambda(-58218680, true, new ll1(ne1Var), kk0Var, 54), kk0Var, i11111117 & 64638, ((i11111117 >> 18) & 14) | 48, 896);
                    rg3Var2 = rg3Var114;
                    gh2Var4 = gh2Var3;
                    z5 = z117;
                    cVar4 = cVar3;
                    vl1Var3 = vl1Var2;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new jl1(z, le1Var, cVar4, z5, rg3Var2, vl1Var3, gh2Var4, ne1Var, i, i2, 1));
                }
            }
            i3 |= 1572864;
            gh2Var2 = gh2Var;
            if ((i2 & Uuid.SIZE_BITS) != 0) {
                i3 |= 12582912;
            } else if ((i & 12582912) == 0) {
                if (kk0Var.j(ne1Var)) {
                    i10 = 8388608;
                } else {
                    i10 = 4194304;
                }
                i3 |= i10;
            }
            if ((4793491 & i3) == 4793490) {
                kk0Var.X();
                if ((i & 1) != 0) {
                    if (i4 != 0) {
                        cVar2 = c.i;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    }
                    i11 = i2 & 16;
                    el1Var = el1.a;
                    if (i11 != 0) {
                        i3 &= -57345;
                        filledShape = el1Var.getFilledShape(kk0Var, 6);
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        vl1VarFilledTonalIconToggleButtonColors = el1Var.filledTonalIconToggleButtonColors(kk0Var, 6);
                    }
                    if (i8 != 0) {
                        gh2Var3 = null;
                        cVar3 = cVar2;
                        z4 = z3;
                        vl1Var2 = vl1VarFilledTonalIconToggleButtonColors;
                    } else {
                        cVar3 = cVar2;
                        z4 = z3;
                        vl1Var2 = vl1VarFilledTonalIconToggleButtonColors;
                        gh2Var3 = gh2Var2;
                    }
                } else {
                    if (i4 != 0) {
                        cVar2 = c.i;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    }
                    i11 = i2 & 16;
                    el1Var = el1.a;
                    if (i11 != 0) {
                        i3 &= -57345;
                        filledShape = el1Var.getFilledShape(kk0Var, 6);
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        vl1VarFilledTonalIconToggleButtonColors = el1Var.filledTonalIconToggleButtonColors(kk0Var, 6);
                    }
                    if (i8 != 0) {
                        gh2Var3 = null;
                        cVar3 = cVar2;
                        z4 = z3;
                        vl1Var2 = vl1VarFilledTonalIconToggleButtonColors;
                    } else {
                        cVar3 = cVar2;
                        z4 = z3;
                        vl1Var2 = vl1VarFilledTonalIconToggleButtonColors;
                        gh2Var3 = gh2Var2;
                    }
                }
                int i111111110 = i3;
                rg3 rg3Var115 = filledShape;
                kk0Var.s();
                int i111111111 = i111111110 >> 9;
                int i111111112 = (i111111111 & 896) | (i111111111 & 14) | ((i111111110 << 3) & 112);
                boolean z118 = z4;
                hq3.m212x54dd086a(z, le1Var, we3.b(cVar3, false, fl1.m), z118, rg3Var115, ((re0) vl1Var2.containerColor$material3_release(z4, z, kk0Var, i111111112).getValue()).a, ((re0) vl1Var2.contentColor$material3_release(z4, z, kk0Var, i111111112).getValue()).a, 0.0f, 0.0f, (iw) null, gh2Var3, zg0.rememberComposableLambda(-58218680, true, new ll1(ne1Var), kk0Var, 54), kk0Var, i111111110 & 64638, ((i111111110 >> 18) & 14) | 48, 896);
                rg3Var2 = rg3Var115;
                gh2Var4 = gh2Var3;
                z5 = z118;
                cVar4 = cVar3;
                vl1Var3 = vl1Var2;
            } else {
                kk0Var.X();
                if ((i & 1) != 0) {
                    if (i4 != 0) {
                        cVar2 = c.i;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    }
                    i11 = i2 & 16;
                    el1Var = el1.a;
                    if (i11 != 0) {
                        i3 &= -57345;
                        filledShape = el1Var.getFilledShape(kk0Var, 6);
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        vl1VarFilledTonalIconToggleButtonColors = el1Var.filledTonalIconToggleButtonColors(kk0Var, 6);
                    }
                    if (i8 != 0) {
                        gh2Var3 = null;
                        cVar3 = cVar2;
                        z4 = z3;
                        vl1Var2 = vl1VarFilledTonalIconToggleButtonColors;
                    } else {
                        cVar3 = cVar2;
                        z4 = z3;
                        vl1Var2 = vl1VarFilledTonalIconToggleButtonColors;
                        gh2Var3 = gh2Var2;
                    }
                } else {
                    if (i4 != 0) {
                        cVar2 = c.i;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    }
                    i11 = i2 & 16;
                    el1Var = el1.a;
                    if (i11 != 0) {
                        i3 &= -57345;
                        filledShape = el1Var.getFilledShape(kk0Var, 6);
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        vl1VarFilledTonalIconToggleButtonColors = el1Var.filledTonalIconToggleButtonColors(kk0Var, 6);
                    }
                    if (i8 != 0) {
                        gh2Var3 = null;
                        cVar3 = cVar2;
                        z4 = z3;
                        vl1Var2 = vl1VarFilledTonalIconToggleButtonColors;
                    } else {
                        cVar3 = cVar2;
                        z4 = z3;
                        vl1Var2 = vl1VarFilledTonalIconToggleButtonColors;
                        gh2Var3 = gh2Var2;
                    }
                }
                int i111111113 = i3;
                rg3 rg3Var116 = filledShape;
                kk0Var.s();
                int i111111114 = i111111113 >> 9;
                int i111111115 = (i111111114 & 896) | (i111111114 & 14) | ((i111111113 << 3) & 112);
                boolean z119 = z4;
                hq3.m212x54dd086a(z, le1Var, we3.b(cVar3, false, fl1.m), z119, rg3Var116, ((re0) vl1Var2.containerColor$material3_release(z4, z, kk0Var, i111111115).getValue()).a, ((re0) vl1Var2.contentColor$material3_release(z4, z, kk0Var, i111111115).getValue()).a, 0.0f, 0.0f, (iw) null, gh2Var3, zg0.rememberComposableLambda(-58218680, true, new ll1(ne1Var), kk0Var, 54), kk0Var, i111111113 & 64638, ((i111111113 >> 18) & 14) | 48, 896);
                rg3Var2 = rg3Var116;
                gh2Var4 = gh2Var3;
                z5 = z119;
                cVar4 = cVar3;
                vl1Var3 = vl1Var2;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new jl1(z, le1Var, cVar4, z5, rg3Var2, vl1Var3, gh2Var4, ne1Var, i, i2, 1));
            }
        }
        i3 |= 384;
        cVar2 = cVar;
        i6 = i2 & 8;
        if (i6 != 0) {
            if ((i & 3072) == 0) {
                z3 = z2;
                if (kk0Var.i(z3)) {
                    i7 = 2048;
                } else {
                    i7 = 1024;
                }
                i3 |= i7;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    filledShape = rg3Var;
                    if (kk0Var.h(filledShape)) {
                        i12 = 16384;
                    }
                    i3 |= i12;
                } else {
                    filledShape = rg3Var;
                }
                i12 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                i3 |= i12;
            } else {
                filledShape = rg3Var;
            }
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0) {
                    vl1VarFilledTonalIconToggleButtonColors = vl1Var;
                    if (kk0Var.h(vl1VarFilledTonalIconToggleButtonColors)) {
                    }
                    i3 |= i13;
                } else {
                    vl1VarFilledTonalIconToggleButtonColors = vl1Var;
                }
                i3 |= i13;
            } else {
                vl1VarFilledTonalIconToggleButtonColors = vl1Var;
            }
            i8 = i2 & 64;
            if (i8 != 0) {
                if ((1572864 & i) == 0) {
                    gh2Var2 = gh2Var;
                    if (kk0Var.h(gh2Var2)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i3 |= i9;
                }
                if ((i2 & Uuid.SIZE_BITS) != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    if (kk0Var.j(ne1Var)) {
                        i10 = 8388608;
                    } else {
                        i10 = 4194304;
                    }
                    i3 |= i10;
                }
                if ((4793491 & i3) == 4793490) {
                    kk0Var.X();
                    if ((i & 1) != 0) {
                        if (i4 != 0) {
                            cVar2 = c.i;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        }
                        i11 = i2 & 16;
                        el1Var = el1.a;
                        if (i11 != 0) {
                            i3 &= -57345;
                            filledShape = el1Var.getFilledShape(kk0Var, 6);
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            vl1VarFilledTonalIconToggleButtonColors = el1Var.filledTonalIconToggleButtonColors(kk0Var, 6);
                        }
                        if (i8 != 0) {
                            gh2Var3 = null;
                            cVar3 = cVar2;
                            z4 = z3;
                            vl1Var2 = vl1VarFilledTonalIconToggleButtonColors;
                        } else {
                            cVar3 = cVar2;
                            z4 = z3;
                            vl1Var2 = vl1VarFilledTonalIconToggleButtonColors;
                            gh2Var3 = gh2Var2;
                        }
                    } else {
                        if (i4 != 0) {
                            cVar2 = c.i;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        }
                        i11 = i2 & 16;
                        el1Var = el1.a;
                        if (i11 != 0) {
                            i3 &= -57345;
                            filledShape = el1Var.getFilledShape(kk0Var, 6);
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            vl1VarFilledTonalIconToggleButtonColors = el1Var.filledTonalIconToggleButtonColors(kk0Var, 6);
                        }
                        if (i8 != 0) {
                            gh2Var3 = null;
                            cVar3 = cVar2;
                            z4 = z3;
                            vl1Var2 = vl1VarFilledTonalIconToggleButtonColors;
                        } else {
                            cVar3 = cVar2;
                            z4 = z3;
                            vl1Var2 = vl1VarFilledTonalIconToggleButtonColors;
                            gh2Var3 = gh2Var2;
                        }
                    }
                    int i111111116 = i3;
                    rg3 rg3Var117 = filledShape;
                    kk0Var.s();
                    int i111111117 = i111111116 >> 9;
                    int i111111118 = (i111111117 & 896) | (i111111117 & 14) | ((i111111116 << 3) & 112);
                    boolean z1110 = z4;
                    hq3.m212x54dd086a(z, le1Var, we3.b(cVar3, false, fl1.m), z1110, rg3Var117, ((re0) vl1Var2.containerColor$material3_release(z4, z, kk0Var, i111111118).getValue()).a, ((re0) vl1Var2.contentColor$material3_release(z4, z, kk0Var, i111111118).getValue()).a, 0.0f, 0.0f, (iw) null, gh2Var3, zg0.rememberComposableLambda(-58218680, true, new ll1(ne1Var), kk0Var, 54), kk0Var, i111111116 & 64638, ((i111111116 >> 18) & 14) | 48, 896);
                    rg3Var2 = rg3Var117;
                    gh2Var4 = gh2Var3;
                    z5 = z1110;
                    cVar4 = cVar3;
                    vl1Var3 = vl1Var2;
                } else {
                    kk0Var.X();
                    if ((i & 1) != 0) {
                        if (i4 != 0) {
                            cVar2 = c.i;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        }
                        i11 = i2 & 16;
                        el1Var = el1.a;
                        if (i11 != 0) {
                            i3 &= -57345;
                            filledShape = el1Var.getFilledShape(kk0Var, 6);
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            vl1VarFilledTonalIconToggleButtonColors = el1Var.filledTonalIconToggleButtonColors(kk0Var, 6);
                        }
                        if (i8 != 0) {
                            gh2Var3 = null;
                            cVar3 = cVar2;
                            z4 = z3;
                            vl1Var2 = vl1VarFilledTonalIconToggleButtonColors;
                        } else {
                            cVar3 = cVar2;
                            z4 = z3;
                            vl1Var2 = vl1VarFilledTonalIconToggleButtonColors;
                            gh2Var3 = gh2Var2;
                        }
                    } else {
                        if (i4 != 0) {
                            cVar2 = c.i;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        }
                        i11 = i2 & 16;
                        el1Var = el1.a;
                        if (i11 != 0) {
                            i3 &= -57345;
                            filledShape = el1Var.getFilledShape(kk0Var, 6);
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            vl1VarFilledTonalIconToggleButtonColors = el1Var.filledTonalIconToggleButtonColors(kk0Var, 6);
                        }
                        if (i8 != 0) {
                            gh2Var3 = null;
                            cVar3 = cVar2;
                            z4 = z3;
                            vl1Var2 = vl1VarFilledTonalIconToggleButtonColors;
                        } else {
                            cVar3 = cVar2;
                            z4 = z3;
                            vl1Var2 = vl1VarFilledTonalIconToggleButtonColors;
                            gh2Var3 = gh2Var2;
                        }
                    }
                    int i111111119 = i3;
                    rg3 rg3Var118 = filledShape;
                    kk0Var.s();
                    int i1111111110 = i111111119 >> 9;
                    int i1111111111 = (i1111111110 & 896) | (i1111111110 & 14) | ((i111111119 << 3) & 112);
                    boolean z1111 = z4;
                    hq3.m212x54dd086a(z, le1Var, we3.b(cVar3, false, fl1.m), z1111, rg3Var118, ((re0) vl1Var2.containerColor$material3_release(z4, z, kk0Var, i1111111111).getValue()).a, ((re0) vl1Var2.contentColor$material3_release(z4, z, kk0Var, i1111111111).getValue()).a, 0.0f, 0.0f, (iw) null, gh2Var3, zg0.rememberComposableLambda(-58218680, true, new ll1(ne1Var), kk0Var, 54), kk0Var, i111111119 & 64638, ((i111111119 >> 18) & 14) | 48, 896);
                    rg3Var2 = rg3Var118;
                    gh2Var4 = gh2Var3;
                    z5 = z1111;
                    cVar4 = cVar3;
                    vl1Var3 = vl1Var2;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new jl1(z, le1Var, cVar4, z5, rg3Var2, vl1Var3, gh2Var4, ne1Var, i, i2, 1));
                }
            }
            i3 |= 1572864;
            gh2Var2 = gh2Var;
            if ((i2 & Uuid.SIZE_BITS) != 0) {
                i3 |= 12582912;
            } else if ((i & 12582912) == 0) {
                if (kk0Var.j(ne1Var)) {
                    i10 = 8388608;
                } else {
                    i10 = 4194304;
                }
                i3 |= i10;
            }
            if ((4793491 & i3) == 4793490) {
                kk0Var.X();
                if ((i & 1) != 0) {
                    if (i4 != 0) {
                        cVar2 = c.i;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    }
                    i11 = i2 & 16;
                    el1Var = el1.a;
                    if (i11 != 0) {
                        i3 &= -57345;
                        filledShape = el1Var.getFilledShape(kk0Var, 6);
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        vl1VarFilledTonalIconToggleButtonColors = el1Var.filledTonalIconToggleButtonColors(kk0Var, 6);
                    }
                    if (i8 != 0) {
                        gh2Var3 = null;
                        cVar3 = cVar2;
                        z4 = z3;
                        vl1Var2 = vl1VarFilledTonalIconToggleButtonColors;
                    } else {
                        cVar3 = cVar2;
                        z4 = z3;
                        vl1Var2 = vl1VarFilledTonalIconToggleButtonColors;
                        gh2Var3 = gh2Var2;
                    }
                } else {
                    if (i4 != 0) {
                        cVar2 = c.i;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    }
                    i11 = i2 & 16;
                    el1Var = el1.a;
                    if (i11 != 0) {
                        i3 &= -57345;
                        filledShape = el1Var.getFilledShape(kk0Var, 6);
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        vl1VarFilledTonalIconToggleButtonColors = el1Var.filledTonalIconToggleButtonColors(kk0Var, 6);
                    }
                    if (i8 != 0) {
                        gh2Var3 = null;
                        cVar3 = cVar2;
                        z4 = z3;
                        vl1Var2 = vl1VarFilledTonalIconToggleButtonColors;
                    } else {
                        cVar3 = cVar2;
                        z4 = z3;
                        vl1Var2 = vl1VarFilledTonalIconToggleButtonColors;
                        gh2Var3 = gh2Var2;
                    }
                }
                int i1111111112 = i3;
                rg3 rg3Var119 = filledShape;
                kk0Var.s();
                int i1111111113 = i1111111112 >> 9;
                int i1111111114 = (i1111111113 & 896) | (i1111111113 & 14) | ((i1111111112 << 3) & 112);
                boolean z1112 = z4;
                hq3.m212x54dd086a(z, le1Var, we3.b(cVar3, false, fl1.m), z1112, rg3Var119, ((re0) vl1Var2.containerColor$material3_release(z4, z, kk0Var, i1111111114).getValue()).a, ((re0) vl1Var2.contentColor$material3_release(z4, z, kk0Var, i1111111114).getValue()).a, 0.0f, 0.0f, (iw) null, gh2Var3, zg0.rememberComposableLambda(-58218680, true, new ll1(ne1Var), kk0Var, 54), kk0Var, i1111111112 & 64638, ((i1111111112 >> 18) & 14) | 48, 896);
                rg3Var2 = rg3Var119;
                gh2Var4 = gh2Var3;
                z5 = z1112;
                cVar4 = cVar3;
                vl1Var3 = vl1Var2;
            } else {
                kk0Var.X();
                if ((i & 1) != 0) {
                    if (i4 != 0) {
                        cVar2 = c.i;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    }
                    i11 = i2 & 16;
                    el1Var = el1.a;
                    if (i11 != 0) {
                        i3 &= -57345;
                        filledShape = el1Var.getFilledShape(kk0Var, 6);
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        vl1VarFilledTonalIconToggleButtonColors = el1Var.filledTonalIconToggleButtonColors(kk0Var, 6);
                    }
                    if (i8 != 0) {
                        gh2Var3 = null;
                        cVar3 = cVar2;
                        z4 = z3;
                        vl1Var2 = vl1VarFilledTonalIconToggleButtonColors;
                    } else {
                        cVar3 = cVar2;
                        z4 = z3;
                        vl1Var2 = vl1VarFilledTonalIconToggleButtonColors;
                        gh2Var3 = gh2Var2;
                    }
                } else {
                    if (i4 != 0) {
                        cVar2 = c.i;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    }
                    i11 = i2 & 16;
                    el1Var = el1.a;
                    if (i11 != 0) {
                        i3 &= -57345;
                        filledShape = el1Var.getFilledShape(kk0Var, 6);
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        vl1VarFilledTonalIconToggleButtonColors = el1Var.filledTonalIconToggleButtonColors(kk0Var, 6);
                    }
                    if (i8 != 0) {
                        gh2Var3 = null;
                        cVar3 = cVar2;
                        z4 = z3;
                        vl1Var2 = vl1VarFilledTonalIconToggleButtonColors;
                    } else {
                        cVar3 = cVar2;
                        z4 = z3;
                        vl1Var2 = vl1VarFilledTonalIconToggleButtonColors;
                        gh2Var3 = gh2Var2;
                    }
                }
                int i1111111115 = i3;
                rg3 rg3Var1110 = filledShape;
                kk0Var.s();
                int i1111111116 = i1111111115 >> 9;
                int i1111111117 = (i1111111116 & 896) | (i1111111116 & 14) | ((i1111111115 << 3) & 112);
                boolean z1113 = z4;
                hq3.m212x54dd086a(z, le1Var, we3.b(cVar3, false, fl1.m), z1113, rg3Var1110, ((re0) vl1Var2.containerColor$material3_release(z4, z, kk0Var, i1111111117).getValue()).a, ((re0) vl1Var2.contentColor$material3_release(z4, z, kk0Var, i1111111117).getValue()).a, 0.0f, 0.0f, (iw) null, gh2Var3, zg0.rememberComposableLambda(-58218680, true, new ll1(ne1Var), kk0Var, 54), kk0Var, i1111111115 & 64638, ((i1111111115 >> 18) & 14) | 48, 896);
                rg3Var2 = rg3Var1110;
                gh2Var4 = gh2Var3;
                z5 = z1113;
                cVar4 = cVar3;
                vl1Var3 = vl1Var2;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new jl1(z, le1Var, cVar4, z5, rg3Var2, vl1Var3, gh2Var4, ne1Var, i, i2, 1));
            }
        }
        i3 |= 3072;
        z3 = z2;
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                filledShape = rg3Var;
                if (kk0Var.h(filledShape)) {
                    i12 = 16384;
                }
                i3 |= i12;
            } else {
                filledShape = rg3Var;
            }
            i12 = ConstantsKt.DEFAULT_BUFFER_SIZE;
            i3 |= i12;
        } else {
            filledShape = rg3Var;
        }
        if ((196608 & i) == 0) {
            if ((i2 & 32) == 0) {
                vl1VarFilledTonalIconToggleButtonColors = vl1Var;
                if (kk0Var.h(vl1VarFilledTonalIconToggleButtonColors)) {
                }
                i3 |= i13;
            } else {
                vl1VarFilledTonalIconToggleButtonColors = vl1Var;
            }
            i3 |= i13;
        } else {
            vl1VarFilledTonalIconToggleButtonColors = vl1Var;
        }
        i8 = i2 & 64;
        if (i8 != 0) {
            if ((1572864 & i) == 0) {
                gh2Var2 = gh2Var;
                if (kk0Var.h(gh2Var2)) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i3 |= i9;
            }
            if ((i2 & Uuid.SIZE_BITS) != 0) {
                i3 |= 12582912;
            } else if ((i & 12582912) == 0) {
                if (kk0Var.j(ne1Var)) {
                    i10 = 8388608;
                } else {
                    i10 = 4194304;
                }
                i3 |= i10;
            }
            if ((4793491 & i3) == 4793490) {
                kk0Var.X();
                if ((i & 1) != 0) {
                    if (i4 != 0) {
                        cVar2 = c.i;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    }
                    i11 = i2 & 16;
                    el1Var = el1.a;
                    if (i11 != 0) {
                        i3 &= -57345;
                        filledShape = el1Var.getFilledShape(kk0Var, 6);
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        vl1VarFilledTonalIconToggleButtonColors = el1Var.filledTonalIconToggleButtonColors(kk0Var, 6);
                    }
                    if (i8 != 0) {
                        gh2Var3 = null;
                        cVar3 = cVar2;
                        z4 = z3;
                        vl1Var2 = vl1VarFilledTonalIconToggleButtonColors;
                    } else {
                        cVar3 = cVar2;
                        z4 = z3;
                        vl1Var2 = vl1VarFilledTonalIconToggleButtonColors;
                        gh2Var3 = gh2Var2;
                    }
                } else {
                    if (i4 != 0) {
                        cVar2 = c.i;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    }
                    i11 = i2 & 16;
                    el1Var = el1.a;
                    if (i11 != 0) {
                        i3 &= -57345;
                        filledShape = el1Var.getFilledShape(kk0Var, 6);
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        vl1VarFilledTonalIconToggleButtonColors = el1Var.filledTonalIconToggleButtonColors(kk0Var, 6);
                    }
                    if (i8 != 0) {
                        gh2Var3 = null;
                        cVar3 = cVar2;
                        z4 = z3;
                        vl1Var2 = vl1VarFilledTonalIconToggleButtonColors;
                    } else {
                        cVar3 = cVar2;
                        z4 = z3;
                        vl1Var2 = vl1VarFilledTonalIconToggleButtonColors;
                        gh2Var3 = gh2Var2;
                    }
                }
                int i1111111118 = i3;
                rg3 rg3Var1111 = filledShape;
                kk0Var.s();
                int i1111111119 = i1111111118 >> 9;
                int i11111111110 = (i1111111119 & 896) | (i1111111119 & 14) | ((i1111111118 << 3) & 112);
                boolean z1114 = z4;
                hq3.m212x54dd086a(z, le1Var, we3.b(cVar3, false, fl1.m), z1114, rg3Var1111, ((re0) vl1Var2.containerColor$material3_release(z4, z, kk0Var, i11111111110).getValue()).a, ((re0) vl1Var2.contentColor$material3_release(z4, z, kk0Var, i11111111110).getValue()).a, 0.0f, 0.0f, (iw) null, gh2Var3, zg0.rememberComposableLambda(-58218680, true, new ll1(ne1Var), kk0Var, 54), kk0Var, i1111111118 & 64638, ((i1111111118 >> 18) & 14) | 48, 896);
                rg3Var2 = rg3Var1111;
                gh2Var4 = gh2Var3;
                z5 = z1114;
                cVar4 = cVar3;
                vl1Var3 = vl1Var2;
            } else {
                kk0Var.X();
                if ((i & 1) != 0) {
                    if (i4 != 0) {
                        cVar2 = c.i;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    }
                    i11 = i2 & 16;
                    el1Var = el1.a;
                    if (i11 != 0) {
                        i3 &= -57345;
                        filledShape = el1Var.getFilledShape(kk0Var, 6);
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        vl1VarFilledTonalIconToggleButtonColors = el1Var.filledTonalIconToggleButtonColors(kk0Var, 6);
                    }
                    if (i8 != 0) {
                        gh2Var3 = null;
                        cVar3 = cVar2;
                        z4 = z3;
                        vl1Var2 = vl1VarFilledTonalIconToggleButtonColors;
                    } else {
                        cVar3 = cVar2;
                        z4 = z3;
                        vl1Var2 = vl1VarFilledTonalIconToggleButtonColors;
                        gh2Var3 = gh2Var2;
                    }
                } else {
                    if (i4 != 0) {
                        cVar2 = c.i;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    }
                    i11 = i2 & 16;
                    el1Var = el1.a;
                    if (i11 != 0) {
                        i3 &= -57345;
                        filledShape = el1Var.getFilledShape(kk0Var, 6);
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        vl1VarFilledTonalIconToggleButtonColors = el1Var.filledTonalIconToggleButtonColors(kk0Var, 6);
                    }
                    if (i8 != 0) {
                        gh2Var3 = null;
                        cVar3 = cVar2;
                        z4 = z3;
                        vl1Var2 = vl1VarFilledTonalIconToggleButtonColors;
                    } else {
                        cVar3 = cVar2;
                        z4 = z3;
                        vl1Var2 = vl1VarFilledTonalIconToggleButtonColors;
                        gh2Var3 = gh2Var2;
                    }
                }
                int i11111111111 = i3;
                rg3 rg3Var1112 = filledShape;
                kk0Var.s();
                int i11111111112 = i11111111111 >> 9;
                int i11111111113 = (i11111111112 & 896) | (i11111111112 & 14) | ((i11111111111 << 3) & 112);
                boolean z1115 = z4;
                hq3.m212x54dd086a(z, le1Var, we3.b(cVar3, false, fl1.m), z1115, rg3Var1112, ((re0) vl1Var2.containerColor$material3_release(z4, z, kk0Var, i11111111113).getValue()).a, ((re0) vl1Var2.contentColor$material3_release(z4, z, kk0Var, i11111111113).getValue()).a, 0.0f, 0.0f, (iw) null, gh2Var3, zg0.rememberComposableLambda(-58218680, true, new ll1(ne1Var), kk0Var, 54), kk0Var, i11111111111 & 64638, ((i11111111111 >> 18) & 14) | 48, 896);
                rg3Var2 = rg3Var1112;
                gh2Var4 = gh2Var3;
                z5 = z1115;
                cVar4 = cVar3;
                vl1Var3 = vl1Var2;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new jl1(z, le1Var, cVar4, z5, rg3Var2, vl1Var3, gh2Var4, ne1Var, i, i2, 1));
            }
        }
        i3 |= 1572864;
        gh2Var2 = gh2Var;
        if ((i2 & Uuid.SIZE_BITS) != 0) {
            i3 |= 12582912;
        } else if ((i & 12582912) == 0) {
            if (kk0Var.j(ne1Var)) {
                i10 = 8388608;
            } else {
                i10 = 4194304;
            }
            i3 |= i10;
        }
        if ((4793491 & i3) == 4793490) {
            kk0Var.X();
            if ((i & 1) != 0) {
                if (i4 != 0) {
                    cVar2 = c.i;
                }
                if (i6 != 0) {
                    z3 = true;
                }
                i11 = i2 & 16;
                el1Var = el1.a;
                if (i11 != 0) {
                    i3 &= -57345;
                    filledShape = el1Var.getFilledShape(kk0Var, 6);
                }
                if ((i2 & 32) != 0) {
                    i3 &= -458753;
                    vl1VarFilledTonalIconToggleButtonColors = el1Var.filledTonalIconToggleButtonColors(kk0Var, 6);
                }
                if (i8 != 0) {
                    gh2Var3 = null;
                    cVar3 = cVar2;
                    z4 = z3;
                    vl1Var2 = vl1VarFilledTonalIconToggleButtonColors;
                } else {
                    cVar3 = cVar2;
                    z4 = z3;
                    vl1Var2 = vl1VarFilledTonalIconToggleButtonColors;
                    gh2Var3 = gh2Var2;
                }
            } else {
                if (i4 != 0) {
                    cVar2 = c.i;
                }
                if (i6 != 0) {
                    z3 = true;
                }
                i11 = i2 & 16;
                el1Var = el1.a;
                if (i11 != 0) {
                    i3 &= -57345;
                    filledShape = el1Var.getFilledShape(kk0Var, 6);
                }
                if ((i2 & 32) != 0) {
                    i3 &= -458753;
                    vl1VarFilledTonalIconToggleButtonColors = el1Var.filledTonalIconToggleButtonColors(kk0Var, 6);
                }
                if (i8 != 0) {
                    gh2Var3 = null;
                    cVar3 = cVar2;
                    z4 = z3;
                    vl1Var2 = vl1VarFilledTonalIconToggleButtonColors;
                } else {
                    cVar3 = cVar2;
                    z4 = z3;
                    vl1Var2 = vl1VarFilledTonalIconToggleButtonColors;
                    gh2Var3 = gh2Var2;
                }
            }
            int i11111111114 = i3;
            rg3 rg3Var1113 = filledShape;
            kk0Var.s();
            int i11111111115 = i11111111114 >> 9;
            int i11111111116 = (i11111111115 & 896) | (i11111111115 & 14) | ((i11111111114 << 3) & 112);
            boolean z1116 = z4;
            hq3.m212x54dd086a(z, le1Var, we3.b(cVar3, false, fl1.m), z1116, rg3Var1113, ((re0) vl1Var2.containerColor$material3_release(z4, z, kk0Var, i11111111116).getValue()).a, ((re0) vl1Var2.contentColor$material3_release(z4, z, kk0Var, i11111111116).getValue()).a, 0.0f, 0.0f, (iw) null, gh2Var3, zg0.rememberComposableLambda(-58218680, true, new ll1(ne1Var), kk0Var, 54), kk0Var, i11111111114 & 64638, ((i11111111114 >> 18) & 14) | 48, 896);
            rg3Var2 = rg3Var1113;
            gh2Var4 = gh2Var3;
            z5 = z1116;
            cVar4 = cVar3;
            vl1Var3 = vl1Var2;
        } else {
            kk0Var.X();
            if ((i & 1) != 0) {
                if (i4 != 0) {
                    cVar2 = c.i;
                }
                if (i6 != 0) {
                    z3 = true;
                }
                i11 = i2 & 16;
                el1Var = el1.a;
                if (i11 != 0) {
                    i3 &= -57345;
                    filledShape = el1Var.getFilledShape(kk0Var, 6);
                }
                if ((i2 & 32) != 0) {
                    i3 &= -458753;
                    vl1VarFilledTonalIconToggleButtonColors = el1Var.filledTonalIconToggleButtonColors(kk0Var, 6);
                }
                if (i8 != 0) {
                    gh2Var3 = null;
                    cVar3 = cVar2;
                    z4 = z3;
                    vl1Var2 = vl1VarFilledTonalIconToggleButtonColors;
                } else {
                    cVar3 = cVar2;
                    z4 = z3;
                    vl1Var2 = vl1VarFilledTonalIconToggleButtonColors;
                    gh2Var3 = gh2Var2;
                }
            } else {
                if (i4 != 0) {
                    cVar2 = c.i;
                }
                if (i6 != 0) {
                    z3 = true;
                }
                i11 = i2 & 16;
                el1Var = el1.a;
                if (i11 != 0) {
                    i3 &= -57345;
                    filledShape = el1Var.getFilledShape(kk0Var, 6);
                }
                if ((i2 & 32) != 0) {
                    i3 &= -458753;
                    vl1VarFilledTonalIconToggleButtonColors = el1Var.filledTonalIconToggleButtonColors(kk0Var, 6);
                }
                if (i8 != 0) {
                    gh2Var3 = null;
                    cVar3 = cVar2;
                    z4 = z3;
                    vl1Var2 = vl1VarFilledTonalIconToggleButtonColors;
                } else {
                    cVar3 = cVar2;
                    z4 = z3;
                    vl1Var2 = vl1VarFilledTonalIconToggleButtonColors;
                    gh2Var3 = gh2Var2;
                }
            }
            int i11111111117 = i3;
            rg3 rg3Var1114 = filledShape;
            kk0Var.s();
            int i11111111118 = i11111111117 >> 9;
            int i11111111119 = (i11111111118 & 896) | (i11111111118 & 14) | ((i11111111117 << 3) & 112);
            boolean z1117 = z4;
            hq3.m212x54dd086a(z, le1Var, we3.b(cVar3, false, fl1.m), z1117, rg3Var1114, ((re0) vl1Var2.containerColor$material3_release(z4, z, kk0Var, i11111111119).getValue()).a, ((re0) vl1Var2.contentColor$material3_release(z4, z, kk0Var, i11111111119).getValue()).a, 0.0f, 0.0f, (iw) null, gh2Var3, zg0.rememberComposableLambda(-58218680, true, new ll1(ne1Var), kk0Var, 54), kk0Var, i11111111117 & 64638, ((i11111111117 >> 18) & 14) | 48, 896);
            rg3Var2 = rg3Var1114;
            gh2Var4 = gh2Var3;
            z5 = z1117;
            cVar4 = cVar3;
            vl1Var3 = vl1Var2;
        }
        w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new jl1(z, le1Var, cVar4, z5, rg3Var2, vl1Var3, gh2Var4, ne1Var, i, i2, 1));
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x016f  */
    /* JADX WARN: Code duplicated, block: B:102:0x0176  */
    /* JADX WARN: Code duplicated, block: B:103:0x017a  */
    /* JADX WARN: Code duplicated, block: B:106:0x0185  */
    /* JADX WARN: Code duplicated, block: B:108:0x0193  */
    /* JADX WARN: Code duplicated, block: B:111:0x019f  */
    /* JADX WARN: Code duplicated, block: B:112:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:116:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:118:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:120:? A[RETURN, SYNTHETIC] */
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
    /* JADX WARN: Code duplicated, block: B:50:0x0083  */
    /* JADX WARN: Code duplicated, block: B:52:0x0087  */
    /* JADX WARN: Code duplicated, block: B:54:0x008f  */
    /* JADX WARN: Code duplicated, block: B:55:0x0092  */
    /* JADX WARN: Code duplicated, block: B:59:0x009b  */
    /* JADX WARN: Code duplicated, block: B:60:0x009d  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:65:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e6 A[PHI: r0 r2 r4 r16
  0x00e6: PHI (r0v23 dl1) = (r0v20 dl1), (r0v25 dl1) binds: [B:92:0x0102, B:81:0x00e1] A[DONT_GENERATE, DONT_INLINE]
  0x00e6: PHI (r2v5 androidx.compose.ui.c) = (r2v2 androidx.compose.ui.c), (r2v7 androidx.compose.ui.c) binds: [B:92:0x0102, B:81:0x00e1] A[DONT_GENERATE, DONT_INLINE]
  0x00e6: PHI (r4v11 int) = (r4v5 int), (r4v12 int) binds: [B:92:0x0102, B:81:0x00e1] A[DONT_GENERATE, DONT_INLINE]
  0x00e6: PHI (r16v2 boolean) = (r16v0 boolean), (r16v3 boolean) binds: [B:92:0x0102, B:81:0x00e1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:83:0x00e8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:93:0x0104  */
    /* JADX WARN: Code duplicated, block: B:96:0x0123  */
    /* JADX WARN: Code duplicated, block: B:97:0x0126  */
    public static final void IconButton(je1 je1Var, c cVar, boolean z, dl1 dl1Var, gh2 gh2Var, ne1 ne1Var, ck0 ck0Var, int i, int i2) {
        je1 je1Var2;
        int i3;
        c cVar2;
        int i4;
        boolean z2;
        int i5;
        dl1 dl1VarIconButtonColors;
        int i6;
        gh2 gh2Var2;
        int i7;
        int i8;
        c cVar3;
        int i9;
        boolean z3;
        dl1 dl1Var2;
        gh2 gh2Var3;
        long j;
        gh2 gh2Var4;
        vb2 vb2VarC;
        int currentCompositeKeyHash;
        su2 su2VarN;
        c cVarD;
        d4 constructor;
        pe peVarH;
        long j2;
        dl1 dl1Var3;
        gh2 gh2Var5;
        boolean z4;
        w33 w33VarV;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(-1142896114);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            je1Var2 = je1Var;
        } else {
            je1Var2 = je1Var;
            if ((i & 6) == 0) {
                i3 = (kk0Var.j(je1Var2) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        int i10 = i2 & 2;
        if (i10 == 0) {
            if ((i & 48) == 0) {
                cVar2 = cVar;
                i3 |= kk0Var.h(cVar2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    z2 = z;
                    if (kk0Var.i(z2)) {
                        i5 = FontInfo.NUMBER_OF_CHAR_CODES;
                    } else {
                        i5 = Uuid.SIZE_BITS;
                    }
                    i3 |= i5;
                }
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        dl1VarIconButtonColors = dl1Var;
                        int i11 = kk0Var.h(dl1VarIconButtonColors) ? 2048 : 1024;
                        i3 |= i11;
                    } else {
                        dl1VarIconButtonColors = dl1Var;
                    }
                    i3 |= i11;
                } else {
                    dl1VarIconButtonColors = dl1Var;
                }
                i6 = i2 & 16;
                if (i6 != 0) {
                    if ((i & 24576) == 0) {
                        gh2Var2 = gh2Var;
                        if (kk0Var.h(gh2Var2)) {
                            i7 = 16384;
                        } else {
                            i7 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                        }
                        i3 |= i7;
                    }
                    if ((i2 & 32) != 0) {
                        i3 |= 196608;
                    } else if ((i & 196608) == 0) {
                        if (kk0Var.j(ne1Var)) {
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
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i4 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                                dl1VarIconButtonColors = el1.a.iconButtonColors(kk0Var, 6);
                            }
                            i9 = i3;
                            z3 = z2;
                            dl1Var2 = dl1VarIconButtonColors;
                            if (i6 != 0) {
                                gh2Var3 = null;
                            }
                            kk0Var.s();
                            un3 un3Var = vq1.a;
                            c cVarN = xr0.N(d.j(cVar3.then(MinimumInteractiveModifier.c), 40.0f), wg3.getValue(tg3.m, kk0Var, 6));
                            if (z3) {
                                j = dl1Var2.a;
                            } else {
                                j = dl1Var2.c;
                            }
                            gh2Var4 = gh2Var3;
                            c cVarD2 = a.d(a.b(cVarN, j, k43.a), gh2Var4, g73.m194xaeb141ad(false, 20.0f, 0L, kk0Var, 54, 4), z3, new n73(0), je1Var2, 8);
                            vb2VarC = vw.c(Alignment$Companion.getCenter(), false);
                            currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                            su2VarN = kk0Var.n();
                            cVarD = b.d(kk0Var, cVarD2);
                            androidx.compose.ui.node.a.j.getClass();
                            constructor = ComposeUiNode$Companion.getConstructor();
                            if (kk0Var.a != null) {
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
                            if (z3) {
                                j2 = dl1Var2.b;
                            } else {
                                j2 = dl1Var2.d;
                            }
                            yk0.CompositionLocalProvider(fq2.k(j2, gn0.a), ne1Var, kk0Var, ((i9 >> 12) & 112) | 8);
                            kk0Var.r(true);
                            dl1Var3 = dl1Var2;
                            gh2Var5 = gh2Var4;
                            z4 = z3;
                        } else {
                            kk0Var.V();
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                            }
                            i9 = i3;
                            cVar3 = cVar2;
                            z3 = z2;
                            dl1Var2 = dl1VarIconButtonColors;
                        }
                        gh2Var3 = gh2Var2;
                        kk0Var.s();
                        un3 un3Var2 = vq1.a;
                        c cVarN2 = xr0.N(d.j(cVar3.then(MinimumInteractiveModifier.c), 40.0f), wg3.getValue(tg3.m, kk0Var, 6));
                        if (z3) {
                            j = dl1Var2.a;
                        } else {
                            j = dl1Var2.c;
                        }
                        gh2Var4 = gh2Var3;
                        c cVarD3 = a.d(a.b(cVarN2, j, k43.a), gh2Var4, g73.m194xaeb141ad(false, 20.0f, 0L, kk0Var, 54, 4), z3, new n73(0), je1Var2, 8);
                        vb2VarC = vw.c(Alignment$Companion.getCenter(), false);
                        currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                        su2VarN = kk0Var.n();
                        cVarD = b.d(kk0Var, cVarD3);
                        androidx.compose.ui.node.a.j.getClass();
                        constructor = ComposeUiNode$Companion.getConstructor();
                        if (kk0Var.a != null) {
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
                        if (z3) {
                            j2 = dl1Var2.b;
                        } else {
                            j2 = dl1Var2.d;
                        }
                        yk0.CompositionLocalProvider(fq2.k(j2, gn0.a), ne1Var, kk0Var, ((i9 >> 12) & 112) | 8);
                        kk0Var.r(true);
                        dl1Var3 = dl1Var2;
                        gh2Var5 = gh2Var4;
                        z4 = z3;
                    } else {
                        kk0Var.V();
                        cVar3 = cVar2;
                        z4 = z2;
                        dl1Var3 = dl1VarIconButtonColors;
                        gh2Var5 = gh2Var2;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new jf(je1Var, cVar3, z4, dl1Var3, gh2Var5, ne1Var, i, i2));
                    }
                }
                i3 |= 24576;
                gh2Var2 = gh2Var;
                if ((i2 & 32) != 0) {
                    i3 |= 196608;
                } else if ((i & 196608) == 0) {
                    if (kk0Var.j(ne1Var)) {
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
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            dl1VarIconButtonColors = el1.a.iconButtonColors(kk0Var, 6);
                        }
                        i9 = i3;
                        z3 = z2;
                        dl1Var2 = dl1VarIconButtonColors;
                        if (i6 != 0) {
                            gh2Var3 = null;
                        } else {
                            gh2Var3 = gh2Var2;
                        }
                    } else {
                        if (i10 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            dl1VarIconButtonColors = el1.a.iconButtonColors(kk0Var, 6);
                        }
                        i9 = i3;
                        z3 = z2;
                        dl1Var2 = dl1VarIconButtonColors;
                        if (i6 != 0) {
                            gh2Var3 = null;
                        } else {
                            gh2Var3 = gh2Var2;
                        }
                    }
                    kk0Var.s();
                    un3 un3Var3 = vq1.a;
                    c cVarN3 = xr0.N(d.j(cVar3.then(MinimumInteractiveModifier.c), 40.0f), wg3.getValue(tg3.m, kk0Var, 6));
                    if (z3) {
                        j = dl1Var2.a;
                    } else {
                        j = dl1Var2.c;
                    }
                    gh2Var4 = gh2Var3;
                    c cVarD4 = a.d(a.b(cVarN3, j, k43.a), gh2Var4, g73.m194xaeb141ad(false, 20.0f, 0L, kk0Var, 54, 4), z3, new n73(0), je1Var2, 8);
                    vb2VarC = vw.c(Alignment$Companion.getCenter(), false);
                    currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                    su2VarN = kk0Var.n();
                    cVarD = b.d(kk0Var, cVarD4);
                    androidx.compose.ui.node.a.j.getClass();
                    constructor = ComposeUiNode$Companion.getConstructor();
                    if (kk0Var.a != null) {
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
                    if (z3) {
                        j2 = dl1Var2.b;
                    } else {
                        j2 = dl1Var2.d;
                    }
                    yk0.CompositionLocalProvider(fq2.k(j2, gn0.a), ne1Var, kk0Var, ((i9 >> 12) & 112) | 8);
                    kk0Var.r(true);
                    dl1Var3 = dl1Var2;
                    gh2Var5 = gh2Var4;
                    z4 = z3;
                } else {
                    kk0Var.X();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            dl1VarIconButtonColors = el1.a.iconButtonColors(kk0Var, 6);
                        }
                        i9 = i3;
                        z3 = z2;
                        dl1Var2 = dl1VarIconButtonColors;
                        if (i6 != 0) {
                            gh2Var3 = null;
                        } else {
                            gh2Var3 = gh2Var2;
                        }
                    } else {
                        if (i10 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            dl1VarIconButtonColors = el1.a.iconButtonColors(kk0Var, 6);
                        }
                        i9 = i3;
                        z3 = z2;
                        dl1Var2 = dl1VarIconButtonColors;
                        if (i6 != 0) {
                            gh2Var3 = null;
                        } else {
                            gh2Var3 = gh2Var2;
                        }
                    }
                    kk0Var.s();
                    un3 un3Var4 = vq1.a;
                    c cVarN4 = xr0.N(d.j(cVar3.then(MinimumInteractiveModifier.c), 40.0f), wg3.getValue(tg3.m, kk0Var, 6));
                    if (z3) {
                        j = dl1Var2.a;
                    } else {
                        j = dl1Var2.c;
                    }
                    gh2Var4 = gh2Var3;
                    c cVarD5 = a.d(a.b(cVarN4, j, k43.a), gh2Var4, g73.m194xaeb141ad(false, 20.0f, 0L, kk0Var, 54, 4), z3, new n73(0), je1Var2, 8);
                    vb2VarC = vw.c(Alignment$Companion.getCenter(), false);
                    currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                    su2VarN = kk0Var.n();
                    cVarD = b.d(kk0Var, cVarD5);
                    androidx.compose.ui.node.a.j.getClass();
                    constructor = ComposeUiNode$Companion.getConstructor();
                    if (kk0Var.a != null) {
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
                    if (z3) {
                        j2 = dl1Var2.b;
                    } else {
                        j2 = dl1Var2.d;
                    }
                    yk0.CompositionLocalProvider(fq2.k(j2, gn0.a), ne1Var, kk0Var, ((i9 >> 12) & 112) | 8);
                    kk0Var.r(true);
                    dl1Var3 = dl1Var2;
                    gh2Var5 = gh2Var4;
                    z4 = z3;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new jf(je1Var, cVar3, z4, dl1Var3, gh2Var5, ne1Var, i, i2));
                }
            }
            i3 |= 384;
            z2 = z;
            if ((i & 3072) == 0) {
                if ((i2 & 8) == 0) {
                    dl1VarIconButtonColors = dl1Var;
                    if (kk0Var.h(dl1VarIconButtonColors)) {
                    }
                    i3 |= i11;
                } else {
                    dl1VarIconButtonColors = dl1Var;
                }
                i3 |= i11;
            } else {
                dl1VarIconButtonColors = dl1Var;
            }
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    gh2Var2 = gh2Var;
                    if (kk0Var.h(gh2Var2)) {
                        i7 = 16384;
                    } else {
                        i7 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                    }
                    i3 |= i7;
                }
                if ((i2 & 32) != 0) {
                    i3 |= 196608;
                } else if ((i & 196608) == 0) {
                    if (kk0Var.j(ne1Var)) {
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
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            dl1VarIconButtonColors = el1.a.iconButtonColors(kk0Var, 6);
                        }
                        i9 = i3;
                        z3 = z2;
                        dl1Var2 = dl1VarIconButtonColors;
                        if (i6 != 0) {
                            gh2Var3 = null;
                        } else {
                            gh2Var3 = gh2Var2;
                        }
                    } else {
                        if (i10 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            dl1VarIconButtonColors = el1.a.iconButtonColors(kk0Var, 6);
                        }
                        i9 = i3;
                        z3 = z2;
                        dl1Var2 = dl1VarIconButtonColors;
                        if (i6 != 0) {
                            gh2Var3 = null;
                        } else {
                            gh2Var3 = gh2Var2;
                        }
                    }
                    kk0Var.s();
                    un3 un3Var5 = vq1.a;
                    c cVarN5 = xr0.N(d.j(cVar3.then(MinimumInteractiveModifier.c), 40.0f), wg3.getValue(tg3.m, kk0Var, 6));
                    if (z3) {
                        j = dl1Var2.a;
                    } else {
                        j = dl1Var2.c;
                    }
                    gh2Var4 = gh2Var3;
                    c cVarD6 = a.d(a.b(cVarN5, j, k43.a), gh2Var4, g73.m194xaeb141ad(false, 20.0f, 0L, kk0Var, 54, 4), z3, new n73(0), je1Var2, 8);
                    vb2VarC = vw.c(Alignment$Companion.getCenter(), false);
                    currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                    su2VarN = kk0Var.n();
                    cVarD = b.d(kk0Var, cVarD6);
                    androidx.compose.ui.node.a.j.getClass();
                    constructor = ComposeUiNode$Companion.getConstructor();
                    if (kk0Var.a != null) {
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
                    if (z3) {
                        j2 = dl1Var2.b;
                    } else {
                        j2 = dl1Var2.d;
                    }
                    yk0.CompositionLocalProvider(fq2.k(j2, gn0.a), ne1Var, kk0Var, ((i9 >> 12) & 112) | 8);
                    kk0Var.r(true);
                    dl1Var3 = dl1Var2;
                    gh2Var5 = gh2Var4;
                    z4 = z3;
                } else {
                    kk0Var.X();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            dl1VarIconButtonColors = el1.a.iconButtonColors(kk0Var, 6);
                        }
                        i9 = i3;
                        z3 = z2;
                        dl1Var2 = dl1VarIconButtonColors;
                        if (i6 != 0) {
                            gh2Var3 = null;
                        } else {
                            gh2Var3 = gh2Var2;
                        }
                    } else {
                        if (i10 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            dl1VarIconButtonColors = el1.a.iconButtonColors(kk0Var, 6);
                        }
                        i9 = i3;
                        z3 = z2;
                        dl1Var2 = dl1VarIconButtonColors;
                        if (i6 != 0) {
                            gh2Var3 = null;
                        } else {
                            gh2Var3 = gh2Var2;
                        }
                    }
                    kk0Var.s();
                    un3 un3Var6 = vq1.a;
                    c cVarN6 = xr0.N(d.j(cVar3.then(MinimumInteractiveModifier.c), 40.0f), wg3.getValue(tg3.m, kk0Var, 6));
                    if (z3) {
                        j = dl1Var2.a;
                    } else {
                        j = dl1Var2.c;
                    }
                    gh2Var4 = gh2Var3;
                    c cVarD7 = a.d(a.b(cVarN6, j, k43.a), gh2Var4, g73.m194xaeb141ad(false, 20.0f, 0L, kk0Var, 54, 4), z3, new n73(0), je1Var2, 8);
                    vb2VarC = vw.c(Alignment$Companion.getCenter(), false);
                    currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                    su2VarN = kk0Var.n();
                    cVarD = b.d(kk0Var, cVarD7);
                    androidx.compose.ui.node.a.j.getClass();
                    constructor = ComposeUiNode$Companion.getConstructor();
                    if (kk0Var.a != null) {
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
                    if (z3) {
                        j2 = dl1Var2.b;
                    } else {
                        j2 = dl1Var2.d;
                    }
                    yk0.CompositionLocalProvider(fq2.k(j2, gn0.a), ne1Var, kk0Var, ((i9 >> 12) & 112) | 8);
                    kk0Var.r(true);
                    dl1Var3 = dl1Var2;
                    gh2Var5 = gh2Var4;
                    z4 = z3;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new jf(je1Var, cVar3, z4, dl1Var3, gh2Var5, ne1Var, i, i2));
                }
            }
            i3 |= 24576;
            gh2Var2 = gh2Var;
            if ((i2 & 32) != 0) {
                i3 |= 196608;
            } else if ((i & 196608) == 0) {
                if (kk0Var.j(ne1Var)) {
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
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        dl1VarIconButtonColors = el1.a.iconButtonColors(kk0Var, 6);
                    }
                    i9 = i3;
                    z3 = z2;
                    dl1Var2 = dl1VarIconButtonColors;
                    if (i6 != 0) {
                        gh2Var3 = null;
                    } else {
                        gh2Var3 = gh2Var2;
                    }
                } else {
                    if (i10 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        dl1VarIconButtonColors = el1.a.iconButtonColors(kk0Var, 6);
                    }
                    i9 = i3;
                    z3 = z2;
                    dl1Var2 = dl1VarIconButtonColors;
                    if (i6 != 0) {
                        gh2Var3 = null;
                    } else {
                        gh2Var3 = gh2Var2;
                    }
                }
                kk0Var.s();
                un3 un3Var7 = vq1.a;
                c cVarN7 = xr0.N(d.j(cVar3.then(MinimumInteractiveModifier.c), 40.0f), wg3.getValue(tg3.m, kk0Var, 6));
                if (z3) {
                    j = dl1Var2.a;
                } else {
                    j = dl1Var2.c;
                }
                gh2Var4 = gh2Var3;
                c cVarD8 = a.d(a.b(cVarN7, j, k43.a), gh2Var4, g73.m194xaeb141ad(false, 20.0f, 0L, kk0Var, 54, 4), z3, new n73(0), je1Var2, 8);
                vb2VarC = vw.c(Alignment$Companion.getCenter(), false);
                currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                su2VarN = kk0Var.n();
                cVarD = b.d(kk0Var, cVarD8);
                androidx.compose.ui.node.a.j.getClass();
                constructor = ComposeUiNode$Companion.getConstructor();
                if (kk0Var.a != null) {
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
                if (z3) {
                    j2 = dl1Var2.b;
                } else {
                    j2 = dl1Var2.d;
                }
                yk0.CompositionLocalProvider(fq2.k(j2, gn0.a), ne1Var, kk0Var, ((i9 >> 12) & 112) | 8);
                kk0Var.r(true);
                dl1Var3 = dl1Var2;
                gh2Var5 = gh2Var4;
                z4 = z3;
            } else {
                kk0Var.X();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        dl1VarIconButtonColors = el1.a.iconButtonColors(kk0Var, 6);
                    }
                    i9 = i3;
                    z3 = z2;
                    dl1Var2 = dl1VarIconButtonColors;
                    if (i6 != 0) {
                        gh2Var3 = null;
                    } else {
                        gh2Var3 = gh2Var2;
                    }
                } else {
                    if (i10 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        dl1VarIconButtonColors = el1.a.iconButtonColors(kk0Var, 6);
                    }
                    i9 = i3;
                    z3 = z2;
                    dl1Var2 = dl1VarIconButtonColors;
                    if (i6 != 0) {
                        gh2Var3 = null;
                    } else {
                        gh2Var3 = gh2Var2;
                    }
                }
                kk0Var.s();
                un3 un3Var8 = vq1.a;
                c cVarN8 = xr0.N(d.j(cVar3.then(MinimumInteractiveModifier.c), 40.0f), wg3.getValue(tg3.m, kk0Var, 6));
                if (z3) {
                    j = dl1Var2.a;
                } else {
                    j = dl1Var2.c;
                }
                gh2Var4 = gh2Var3;
                c cVarD9 = a.d(a.b(cVarN8, j, k43.a), gh2Var4, g73.m194xaeb141ad(false, 20.0f, 0L, kk0Var, 54, 4), z3, new n73(0), je1Var2, 8);
                vb2VarC = vw.c(Alignment$Companion.getCenter(), false);
                currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                su2VarN = kk0Var.n();
                cVarD = b.d(kk0Var, cVarD9);
                androidx.compose.ui.node.a.j.getClass();
                constructor = ComposeUiNode$Companion.getConstructor();
                if (kk0Var.a != null) {
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
                if (z3) {
                    j2 = dl1Var2.b;
                } else {
                    j2 = dl1Var2.d;
                }
                yk0.CompositionLocalProvider(fq2.k(j2, gn0.a), ne1Var, kk0Var, ((i9 >> 12) & 112) | 8);
                kk0Var.r(true);
                dl1Var3 = dl1Var2;
                gh2Var5 = gh2Var4;
                z4 = z3;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new jf(je1Var, cVar3, z4, dl1Var3, gh2Var5, ne1Var, i, i2));
            }
        }
        i3 |= 48;
        cVar2 = cVar;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                z2 = z;
                if (kk0Var.i(z2)) {
                    i5 = FontInfo.NUMBER_OF_CHAR_CODES;
                } else {
                    i5 = Uuid.SIZE_BITS;
                }
                i3 |= i5;
            }
            if ((i & 3072) == 0) {
                if ((i2 & 8) == 0) {
                    dl1VarIconButtonColors = dl1Var;
                    if (kk0Var.h(dl1VarIconButtonColors)) {
                    }
                    i3 |= i11;
                } else {
                    dl1VarIconButtonColors = dl1Var;
                }
                i3 |= i11;
            } else {
                dl1VarIconButtonColors = dl1Var;
            }
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    gh2Var2 = gh2Var;
                    if (kk0Var.h(gh2Var2)) {
                        i7 = 16384;
                    } else {
                        i7 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                    }
                    i3 |= i7;
                }
                if ((i2 & 32) != 0) {
                    i3 |= 196608;
                } else if ((i & 196608) == 0) {
                    if (kk0Var.j(ne1Var)) {
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
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            dl1VarIconButtonColors = el1.a.iconButtonColors(kk0Var, 6);
                        }
                        i9 = i3;
                        z3 = z2;
                        dl1Var2 = dl1VarIconButtonColors;
                        if (i6 != 0) {
                            gh2Var3 = null;
                        } else {
                            gh2Var3 = gh2Var2;
                        }
                    } else {
                        if (i10 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            dl1VarIconButtonColors = el1.a.iconButtonColors(kk0Var, 6);
                        }
                        i9 = i3;
                        z3 = z2;
                        dl1Var2 = dl1VarIconButtonColors;
                        if (i6 != 0) {
                            gh2Var3 = null;
                        } else {
                            gh2Var3 = gh2Var2;
                        }
                    }
                    kk0Var.s();
                    un3 un3Var9 = vq1.a;
                    c cVarN9 = xr0.N(d.j(cVar3.then(MinimumInteractiveModifier.c), 40.0f), wg3.getValue(tg3.m, kk0Var, 6));
                    if (z3) {
                        j = dl1Var2.a;
                    } else {
                        j = dl1Var2.c;
                    }
                    gh2Var4 = gh2Var3;
                    c cVarD10 = a.d(a.b(cVarN9, j, k43.a), gh2Var4, g73.m194xaeb141ad(false, 20.0f, 0L, kk0Var, 54, 4), z3, new n73(0), je1Var2, 8);
                    vb2VarC = vw.c(Alignment$Companion.getCenter(), false);
                    currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                    su2VarN = kk0Var.n();
                    cVarD = b.d(kk0Var, cVarD10);
                    androidx.compose.ui.node.a.j.getClass();
                    constructor = ComposeUiNode$Companion.getConstructor();
                    if (kk0Var.a != null) {
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
                    if (z3) {
                        j2 = dl1Var2.b;
                    } else {
                        j2 = dl1Var2.d;
                    }
                    yk0.CompositionLocalProvider(fq2.k(j2, gn0.a), ne1Var, kk0Var, ((i9 >> 12) & 112) | 8);
                    kk0Var.r(true);
                    dl1Var3 = dl1Var2;
                    gh2Var5 = gh2Var4;
                    z4 = z3;
                } else {
                    kk0Var.X();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            dl1VarIconButtonColors = el1.a.iconButtonColors(kk0Var, 6);
                        }
                        i9 = i3;
                        z3 = z2;
                        dl1Var2 = dl1VarIconButtonColors;
                        if (i6 != 0) {
                            gh2Var3 = null;
                        } else {
                            gh2Var3 = gh2Var2;
                        }
                    } else {
                        if (i10 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            dl1VarIconButtonColors = el1.a.iconButtonColors(kk0Var, 6);
                        }
                        i9 = i3;
                        z3 = z2;
                        dl1Var2 = dl1VarIconButtonColors;
                        if (i6 != 0) {
                            gh2Var3 = null;
                        } else {
                            gh2Var3 = gh2Var2;
                        }
                    }
                    kk0Var.s();
                    un3 un3Var10 = vq1.a;
                    c cVarN10 = xr0.N(d.j(cVar3.then(MinimumInteractiveModifier.c), 40.0f), wg3.getValue(tg3.m, kk0Var, 6));
                    if (z3) {
                        j = dl1Var2.a;
                    } else {
                        j = dl1Var2.c;
                    }
                    gh2Var4 = gh2Var3;
                    c cVarD11 = a.d(a.b(cVarN10, j, k43.a), gh2Var4, g73.m194xaeb141ad(false, 20.0f, 0L, kk0Var, 54, 4), z3, new n73(0), je1Var2, 8);
                    vb2VarC = vw.c(Alignment$Companion.getCenter(), false);
                    currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                    su2VarN = kk0Var.n();
                    cVarD = b.d(kk0Var, cVarD11);
                    androidx.compose.ui.node.a.j.getClass();
                    constructor = ComposeUiNode$Companion.getConstructor();
                    if (kk0Var.a != null) {
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
                    if (z3) {
                        j2 = dl1Var2.b;
                    } else {
                        j2 = dl1Var2.d;
                    }
                    yk0.CompositionLocalProvider(fq2.k(j2, gn0.a), ne1Var, kk0Var, ((i9 >> 12) & 112) | 8);
                    kk0Var.r(true);
                    dl1Var3 = dl1Var2;
                    gh2Var5 = gh2Var4;
                    z4 = z3;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new jf(je1Var, cVar3, z4, dl1Var3, gh2Var5, ne1Var, i, i2));
                }
            }
            i3 |= 24576;
            gh2Var2 = gh2Var;
            if ((i2 & 32) != 0) {
                i3 |= 196608;
            } else if ((i & 196608) == 0) {
                if (kk0Var.j(ne1Var)) {
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
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        dl1VarIconButtonColors = el1.a.iconButtonColors(kk0Var, 6);
                    }
                    i9 = i3;
                    z3 = z2;
                    dl1Var2 = dl1VarIconButtonColors;
                    if (i6 != 0) {
                        gh2Var3 = null;
                    } else {
                        gh2Var3 = gh2Var2;
                    }
                } else {
                    if (i10 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        dl1VarIconButtonColors = el1.a.iconButtonColors(kk0Var, 6);
                    }
                    i9 = i3;
                    z3 = z2;
                    dl1Var2 = dl1VarIconButtonColors;
                    if (i6 != 0) {
                        gh2Var3 = null;
                    } else {
                        gh2Var3 = gh2Var2;
                    }
                }
                kk0Var.s();
                un3 un3Var11 = vq1.a;
                c cVarN11 = xr0.N(d.j(cVar3.then(MinimumInteractiveModifier.c), 40.0f), wg3.getValue(tg3.m, kk0Var, 6));
                if (z3) {
                    j = dl1Var2.a;
                } else {
                    j = dl1Var2.c;
                }
                gh2Var4 = gh2Var3;
                c cVarD12 = a.d(a.b(cVarN11, j, k43.a), gh2Var4, g73.m194xaeb141ad(false, 20.0f, 0L, kk0Var, 54, 4), z3, new n73(0), je1Var2, 8);
                vb2VarC = vw.c(Alignment$Companion.getCenter(), false);
                currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                su2VarN = kk0Var.n();
                cVarD = b.d(kk0Var, cVarD12);
                androidx.compose.ui.node.a.j.getClass();
                constructor = ComposeUiNode$Companion.getConstructor();
                if (kk0Var.a != null) {
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
                if (z3) {
                    j2 = dl1Var2.b;
                } else {
                    j2 = dl1Var2.d;
                }
                yk0.CompositionLocalProvider(fq2.k(j2, gn0.a), ne1Var, kk0Var, ((i9 >> 12) & 112) | 8);
                kk0Var.r(true);
                dl1Var3 = dl1Var2;
                gh2Var5 = gh2Var4;
                z4 = z3;
            } else {
                kk0Var.X();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        dl1VarIconButtonColors = el1.a.iconButtonColors(kk0Var, 6);
                    }
                    i9 = i3;
                    z3 = z2;
                    dl1Var2 = dl1VarIconButtonColors;
                    if (i6 != 0) {
                        gh2Var3 = null;
                    } else {
                        gh2Var3 = gh2Var2;
                    }
                } else {
                    if (i10 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        dl1VarIconButtonColors = el1.a.iconButtonColors(kk0Var, 6);
                    }
                    i9 = i3;
                    z3 = z2;
                    dl1Var2 = dl1VarIconButtonColors;
                    if (i6 != 0) {
                        gh2Var3 = null;
                    } else {
                        gh2Var3 = gh2Var2;
                    }
                }
                kk0Var.s();
                un3 un3Var12 = vq1.a;
                c cVarN12 = xr0.N(d.j(cVar3.then(MinimumInteractiveModifier.c), 40.0f), wg3.getValue(tg3.m, kk0Var, 6));
                if (z3) {
                    j = dl1Var2.a;
                } else {
                    j = dl1Var2.c;
                }
                gh2Var4 = gh2Var3;
                c cVarD13 = a.d(a.b(cVarN12, j, k43.a), gh2Var4, g73.m194xaeb141ad(false, 20.0f, 0L, kk0Var, 54, 4), z3, new n73(0), je1Var2, 8);
                vb2VarC = vw.c(Alignment$Companion.getCenter(), false);
                currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                su2VarN = kk0Var.n();
                cVarD = b.d(kk0Var, cVarD13);
                androidx.compose.ui.node.a.j.getClass();
                constructor = ComposeUiNode$Companion.getConstructor();
                if (kk0Var.a != null) {
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
                if (z3) {
                    j2 = dl1Var2.b;
                } else {
                    j2 = dl1Var2.d;
                }
                yk0.CompositionLocalProvider(fq2.k(j2, gn0.a), ne1Var, kk0Var, ((i9 >> 12) & 112) | 8);
                kk0Var.r(true);
                dl1Var3 = dl1Var2;
                gh2Var5 = gh2Var4;
                z4 = z3;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new jf(je1Var, cVar3, z4, dl1Var3, gh2Var5, ne1Var, i, i2));
            }
        }
        i3 |= 384;
        z2 = z;
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                dl1VarIconButtonColors = dl1Var;
                if (kk0Var.h(dl1VarIconButtonColors)) {
                }
                i3 |= i11;
            } else {
                dl1VarIconButtonColors = dl1Var;
            }
            i3 |= i11;
        } else {
            dl1VarIconButtonColors = dl1Var;
        }
        i6 = i2 & 16;
        if (i6 != 0) {
            if ((i & 24576) == 0) {
                gh2Var2 = gh2Var;
                if (kk0Var.h(gh2Var2)) {
                    i7 = 16384;
                } else {
                    i7 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                }
                i3 |= i7;
            }
            if ((i2 & 32) != 0) {
                i3 |= 196608;
            } else if ((i & 196608) == 0) {
                if (kk0Var.j(ne1Var)) {
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
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        dl1VarIconButtonColors = el1.a.iconButtonColors(kk0Var, 6);
                    }
                    i9 = i3;
                    z3 = z2;
                    dl1Var2 = dl1VarIconButtonColors;
                    if (i6 != 0) {
                        gh2Var3 = null;
                    } else {
                        gh2Var3 = gh2Var2;
                    }
                } else {
                    if (i10 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        dl1VarIconButtonColors = el1.a.iconButtonColors(kk0Var, 6);
                    }
                    i9 = i3;
                    z3 = z2;
                    dl1Var2 = dl1VarIconButtonColors;
                    if (i6 != 0) {
                        gh2Var3 = null;
                    } else {
                        gh2Var3 = gh2Var2;
                    }
                }
                kk0Var.s();
                un3 un3Var13 = vq1.a;
                c cVarN13 = xr0.N(d.j(cVar3.then(MinimumInteractiveModifier.c), 40.0f), wg3.getValue(tg3.m, kk0Var, 6));
                if (z3) {
                    j = dl1Var2.a;
                } else {
                    j = dl1Var2.c;
                }
                gh2Var4 = gh2Var3;
                c cVarD14 = a.d(a.b(cVarN13, j, k43.a), gh2Var4, g73.m194xaeb141ad(false, 20.0f, 0L, kk0Var, 54, 4), z3, new n73(0), je1Var2, 8);
                vb2VarC = vw.c(Alignment$Companion.getCenter(), false);
                currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                su2VarN = kk0Var.n();
                cVarD = b.d(kk0Var, cVarD14);
                androidx.compose.ui.node.a.j.getClass();
                constructor = ComposeUiNode$Companion.getConstructor();
                if (kk0Var.a != null) {
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
                if (z3) {
                    j2 = dl1Var2.b;
                } else {
                    j2 = dl1Var2.d;
                }
                yk0.CompositionLocalProvider(fq2.k(j2, gn0.a), ne1Var, kk0Var, ((i9 >> 12) & 112) | 8);
                kk0Var.r(true);
                dl1Var3 = dl1Var2;
                gh2Var5 = gh2Var4;
                z4 = z3;
            } else {
                kk0Var.X();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        dl1VarIconButtonColors = el1.a.iconButtonColors(kk0Var, 6);
                    }
                    i9 = i3;
                    z3 = z2;
                    dl1Var2 = dl1VarIconButtonColors;
                    if (i6 != 0) {
                        gh2Var3 = null;
                    } else {
                        gh2Var3 = gh2Var2;
                    }
                } else {
                    if (i10 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        dl1VarIconButtonColors = el1.a.iconButtonColors(kk0Var, 6);
                    }
                    i9 = i3;
                    z3 = z2;
                    dl1Var2 = dl1VarIconButtonColors;
                    if (i6 != 0) {
                        gh2Var3 = null;
                    } else {
                        gh2Var3 = gh2Var2;
                    }
                }
                kk0Var.s();
                un3 un3Var14 = vq1.a;
                c cVarN14 = xr0.N(d.j(cVar3.then(MinimumInteractiveModifier.c), 40.0f), wg3.getValue(tg3.m, kk0Var, 6));
                if (z3) {
                    j = dl1Var2.a;
                } else {
                    j = dl1Var2.c;
                }
                gh2Var4 = gh2Var3;
                c cVarD15 = a.d(a.b(cVarN14, j, k43.a), gh2Var4, g73.m194xaeb141ad(false, 20.0f, 0L, kk0Var, 54, 4), z3, new n73(0), je1Var2, 8);
                vb2VarC = vw.c(Alignment$Companion.getCenter(), false);
                currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                su2VarN = kk0Var.n();
                cVarD = b.d(kk0Var, cVarD15);
                androidx.compose.ui.node.a.j.getClass();
                constructor = ComposeUiNode$Companion.getConstructor();
                if (kk0Var.a != null) {
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
                if (z3) {
                    j2 = dl1Var2.b;
                } else {
                    j2 = dl1Var2.d;
                }
                yk0.CompositionLocalProvider(fq2.k(j2, gn0.a), ne1Var, kk0Var, ((i9 >> 12) & 112) | 8);
                kk0Var.r(true);
                dl1Var3 = dl1Var2;
                gh2Var5 = gh2Var4;
                z4 = z3;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new jf(je1Var, cVar3, z4, dl1Var3, gh2Var5, ne1Var, i, i2));
            }
        }
        i3 |= 24576;
        gh2Var2 = gh2Var;
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((i & 196608) == 0) {
            if (kk0Var.j(ne1Var)) {
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
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if (i4 != 0) {
                    z2 = true;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    dl1VarIconButtonColors = el1.a.iconButtonColors(kk0Var, 6);
                }
                i9 = i3;
                z3 = z2;
                dl1Var2 = dl1VarIconButtonColors;
                if (i6 != 0) {
                    gh2Var3 = null;
                } else {
                    gh2Var3 = gh2Var2;
                }
            } else {
                if (i10 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if (i4 != 0) {
                    z2 = true;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    dl1VarIconButtonColors = el1.a.iconButtonColors(kk0Var, 6);
                }
                i9 = i3;
                z3 = z2;
                dl1Var2 = dl1VarIconButtonColors;
                if (i6 != 0) {
                    gh2Var3 = null;
                } else {
                    gh2Var3 = gh2Var2;
                }
            }
            kk0Var.s();
            un3 un3Var15 = vq1.a;
            c cVarN15 = xr0.N(d.j(cVar3.then(MinimumInteractiveModifier.c), 40.0f), wg3.getValue(tg3.m, kk0Var, 6));
            if (z3) {
                j = dl1Var2.a;
            } else {
                j = dl1Var2.c;
            }
            gh2Var4 = gh2Var3;
            c cVarD16 = a.d(a.b(cVarN15, j, k43.a), gh2Var4, g73.m194xaeb141ad(false, 20.0f, 0L, kk0Var, 54, 4), z3, new n73(0), je1Var2, 8);
            vb2VarC = vw.c(Alignment$Companion.getCenter(), false);
            currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
            su2VarN = kk0Var.n();
            cVarD = b.d(kk0Var, cVarD16);
            androidx.compose.ui.node.a.j.getClass();
            constructor = ComposeUiNode$Companion.getConstructor();
            if (kk0Var.a != null) {
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
            if (z3) {
                j2 = dl1Var2.b;
            } else {
                j2 = dl1Var2.d;
            }
            yk0.CompositionLocalProvider(fq2.k(j2, gn0.a), ne1Var, kk0Var, ((i9 >> 12) & 112) | 8);
            kk0Var.r(true);
            dl1Var3 = dl1Var2;
            gh2Var5 = gh2Var4;
            z4 = z3;
        } else {
            kk0Var.X();
            if ((i & 1) != 0) {
                if (i10 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if (i4 != 0) {
                    z2 = true;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    dl1VarIconButtonColors = el1.a.iconButtonColors(kk0Var, 6);
                }
                i9 = i3;
                z3 = z2;
                dl1Var2 = dl1VarIconButtonColors;
                if (i6 != 0) {
                    gh2Var3 = null;
                } else {
                    gh2Var3 = gh2Var2;
                }
            } else {
                if (i10 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if (i4 != 0) {
                    z2 = true;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    dl1VarIconButtonColors = el1.a.iconButtonColors(kk0Var, 6);
                }
                i9 = i3;
                z3 = z2;
                dl1Var2 = dl1VarIconButtonColors;
                if (i6 != 0) {
                    gh2Var3 = null;
                } else {
                    gh2Var3 = gh2Var2;
                }
            }
            kk0Var.s();
            un3 un3Var16 = vq1.a;
            c cVarN16 = xr0.N(d.j(cVar3.then(MinimumInteractiveModifier.c), 40.0f), wg3.getValue(tg3.m, kk0Var, 6));
            if (z3) {
                j = dl1Var2.a;
            } else {
                j = dl1Var2.c;
            }
            gh2Var4 = gh2Var3;
            c cVarD17 = a.d(a.b(cVarN16, j, k43.a), gh2Var4, g73.m194xaeb141ad(false, 20.0f, 0L, kk0Var, 54, 4), z3, new n73(0), je1Var2, 8);
            vb2VarC = vw.c(Alignment$Companion.getCenter(), false);
            currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
            su2VarN = kk0Var.n();
            cVarD = b.d(kk0Var, cVarD17);
            androidx.compose.ui.node.a.j.getClass();
            constructor = ComposeUiNode$Companion.getConstructor();
            if (kk0Var.a != null) {
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
            if (z3) {
                j2 = dl1Var2.b;
            } else {
                j2 = dl1Var2.d;
            }
            yk0.CompositionLocalProvider(fq2.k(j2, gn0.a), ne1Var, kk0Var, ((i9 >> 12) & 112) | 8);
            kk0Var.r(true);
            dl1Var3 = dl1Var2;
            gh2Var5 = gh2Var4;
            z4 = z3;
        }
        w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new jf(je1Var, cVar3, z4, dl1Var3, gh2Var5, ne1Var, i, i2));
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0110  */
    /* JADX WARN: Code duplicated, block: B:102:0x0118  */
    /* JADX WARN: Code duplicated, block: B:105:0x0121  */
    /* JADX WARN: Code duplicated, block: B:108:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:110:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:111:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:114:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:116:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:120:0x0200  */
    /* JADX WARN: Code duplicated, block: B:122:0x0211  */
    /* JADX WARN: Code duplicated, block: B:124:? A[RETURN, SYNTHETIC] */
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
    /* JADX WARN: Code duplicated, block: B:58:0x0099  */
    /* JADX WARN: Code duplicated, block: B:60:0x009d  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:79:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:84:0x00de  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:93:0x0101 A[PHI: r0 r2 r4 r17
  0x0101: PHI (r0v33 androidx.compose.ui.c) = (r0v22 androidx.compose.ui.c), (r0v35 androidx.compose.ui.c) binds: [B:104:0x011f, B:92:0x00fb] A[DONT_GENERATE, DONT_INLINE]
  0x0101: PHI (r2v13 vl1) = (r2v16 vl1), (r2v15 vl1) binds: [B:104:0x011f, B:92:0x00fb] A[DONT_GENERATE, DONT_INLINE]
  0x0101: PHI (r4v7 boolean) = (r4v5 boolean), (r4v8 boolean) binds: [B:104:0x011f, B:92:0x00fb] A[DONT_GENERATE, DONT_INLINE]
  0x0101: PHI (r17v2 int) = (r17v0 int), (r17v3 int) binds: [B:104:0x011f, B:92:0x00fb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:94:0x0103 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:95:0x0105  */
    /* JADX WARN: Code duplicated, block: B:96:0x0108  */
    /* JADX WARN: Code duplicated, block: B:98:0x010b  */
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
    public static final void IconToggleButton(boolean z, le1 le1Var, c cVar, boolean z2, vl1 vl1Var, gh2 gh2Var, ne1 ne1Var, ck0 ck0Var, int i, int i2) {
        int i3;
        le1 le1Var2;
        c cVar2;
        int i4;
        boolean z3;
        int i5;
        vl1 vl1Var2;
        int i6;
        gh2 gh2Var2;
        int i7;
        int i8;
        c cVar3;
        vl1 vl1VarIconToggleButtonColors;
        int i9;
        c cVar4;
        vl1 vl1Var3;
        boolean z4;
        gh2 gh2Var3;
        vl1 vl1Var4;
        int i10;
        c cVar5;
        vl1 vl1Var5;
        gh2 gh2Var4;
        vb2 vb2VarC;
        int currentCompositeKeyHash;
        su2 su2VarN;
        c cVarD;
        d4 constructor;
        pe peVarH;
        gh2 gh2Var5;
        vl1 vl1Var6;
        vl1 vl1Var7;
        vl1 vl1Var8;
        w33 w33VarV;
        vl1 vl1Var9;
        int i11;
        vl1 vl1Var10;
        vl1 vl1Var11;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(692561811);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (kk0Var.i(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            le1Var2 = le1Var;
        } else {
            le1Var2 = le1Var;
            if ((i & 48) == 0) {
                i3 |= kk0Var.j(le1Var2) ? 32 : 16;
            }
        }
        int i12 = i2 & 4;
        if (i12 == 0) {
            if ((i & 384) == 0) {
                cVar2 = cVar;
                i3 |= kk0Var.h(cVar2) ? FontInfo.NUMBER_OF_CHAR_CODES : Uuid.SIZE_BITS;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    z3 = z2;
                    if (kk0Var.i(z3)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        vl1Var11 = vl1Var;
                        if (kk0Var.h(vl1Var11)) {
                            vl1Var9 = vl1Var11;
                            i11 = 16384;
                            vl1Var10 = vl1Var11;
                        }
                        i3 |= i11;
                        vl1Var2 = vl1Var10;
                    } else {
                        vl1Var9 = vl1Var;
                    }
                    vl1Var9 = vl1Var11;
                    i11 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                    vl1Var10 = vl1Var9;
                    i3 |= i11;
                    vl1Var2 = vl1Var10;
                } else {
                    vl1Var2 = vl1Var;
                }
                i6 = i2 & 32;
                if (i6 != 0) {
                    if ((196608 & i) == 0) {
                        gh2Var2 = gh2Var;
                        if (kk0Var.h(gh2Var2)) {
                            i7 = 131072;
                        } else {
                            i7 = 65536;
                        }
                        i3 |= i7;
                    }
                    if ((i2 & 64) != 0) {
                        i3 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        if (kk0Var.j(ne1Var)) {
                            i8 = 1048576;
                        } else {
                            i8 = 524288;
                        }
                        i3 |= i8;
                    }
                    if ((599187 & i3) == 599186 || !kk0Var.F()) {
                        kk0Var.X();
                        if ((i & 1) != 0 || kk0Var.D()) {
                            if (i12 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i4 != 0) {
                                z3 = true;
                            }
                            if ((i2 & 16) != 0) {
                                vl1VarIconToggleButtonColors = el1.a.iconToggleButtonColors(kk0Var, 6);
                                i3 &= -57345;
                            } else {
                                vl1VarIconToggleButtonColors = vl1Var;
                            }
                            i9 = i3;
                            cVar4 = cVar3;
                            vl1Var3 = vl1VarIconToggleButtonColors;
                            z4 = z3;
                            vl1Var6 = vl1Var3;
                            if (i6 != 0) {
                                gh2Var3 = null;
                                vl1Var4 = vl1Var3;
                            }
                            kk0Var.s();
                            un3 un3Var = vq1.a;
                            i10 = ((i9 >> 9) & 14) | ((i9 << 3) & 112) | ((i9 >> 6) & 896);
                            cVar5 = cVar4;
                            vl1Var5 = vl1Var4;
                            gh2Var4 = gh2Var3;
                            c cVarB = androidx.compose.foundation.selection.b.b(a.b(xr0.N(d.j(cVar4.then(MinimumInteractiveModifier.c), 40.0f), wg3.getValue(tg3.m, kk0Var, 6)), ((re0) vl1Var4.containerColor$material3_release(z4, z, kk0Var, i10).getValue()).a, k43.a), z, gh2Var4, g73.m194xaeb141ad(false, 20.0f, 0L, kk0Var, 54, 4), z4, new n73(1), le1Var2);
                            vb2VarC = vw.c(Alignment$Companion.getCenter(), false);
                            currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                            su2VarN = kk0Var.n();
                            cVarD = b.d(kk0Var, cVarB);
                            androidx.compose.ui.node.a.j.getClass();
                            constructor = ComposeUiNode$Companion.getConstructor();
                            if (kk0Var.a != null) {
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
                            yk0.CompositionLocalProvider(fq2.k(((re0) vl1Var5.contentColor$material3_release(z4, z, kk0Var, i10).getValue()).a, gn0.a), ne1Var, kk0Var, ((i9 >> 15) & 112) | 8);
                            kk0Var.r(true);
                            gh2Var5 = gh2Var4;
                            cVar2 = cVar5;
                            vl1Var7 = vl1Var5;
                        } else {
                            kk0Var.V();
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            vl1Var6 = vl1Var;
                            i9 = i3;
                            cVar4 = cVar2;
                            z4 = z3;
                        }
                        gh2Var3 = gh2Var2;
                        vl1Var4 = vl1Var6;
                        kk0Var.s();
                        un3 un3Var2 = vq1.a;
                        i10 = ((i9 >> 9) & 14) | ((i9 << 3) & 112) | ((i9 >> 6) & 896);
                        cVar5 = cVar4;
                        vl1Var5 = vl1Var4;
                        gh2Var4 = gh2Var3;
                        c cVarB2 = androidx.compose.foundation.selection.b.b(a.b(xr0.N(d.j(cVar4.then(MinimumInteractiveModifier.c), 40.0f), wg3.getValue(tg3.m, kk0Var, 6)), ((re0) vl1Var4.containerColor$material3_release(z4, z, kk0Var, i10).getValue()).a, k43.a), z, gh2Var4, g73.m194xaeb141ad(false, 20.0f, 0L, kk0Var, 54, 4), z4, new n73(1), le1Var2);
                        vb2VarC = vw.c(Alignment$Companion.getCenter(), false);
                        currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                        su2VarN = kk0Var.n();
                        cVarD = b.d(kk0Var, cVarB2);
                        androidx.compose.ui.node.a.j.getClass();
                        constructor = ComposeUiNode$Companion.getConstructor();
                        if (kk0Var.a != null) {
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
                        yk0.CompositionLocalProvider(fq2.k(((re0) vl1Var5.contentColor$material3_release(z4, z, kk0Var, i10).getValue()).a, gn0.a), ne1Var, kk0Var, ((i9 >> 15) & 112) | 8);
                        kk0Var.r(true);
                        gh2Var5 = gh2Var4;
                        cVar2 = cVar5;
                        vl1Var7 = vl1Var5;
                    } else {
                        kk0Var.V();
                        z4 = z3;
                        gh2Var5 = gh2Var2;
                        vl1Var7 = vl1Var2;
                    }
                    vl1Var8 = vl1Var7;
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new ml1(z, le1Var, cVar2, z4, vl1Var8, gh2Var5, ne1Var, i, i2));
                    }
                }
                i3 |= 196608;
                gh2Var2 = gh2Var;
                if ((i2 & 64) != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    if (kk0Var.j(ne1Var)) {
                        i8 = 1048576;
                    } else {
                        i8 = 524288;
                    }
                    i3 |= i8;
                }
                if ((599187 & i3) == 599186) {
                    kk0Var.X();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if ((i2 & 16) != 0) {
                            vl1VarIconToggleButtonColors = el1.a.iconToggleButtonColors(kk0Var, 6);
                            i3 &= -57345;
                        } else {
                            vl1VarIconToggleButtonColors = vl1Var;
                        }
                        i9 = i3;
                        cVar4 = cVar3;
                        vl1Var3 = vl1VarIconToggleButtonColors;
                        z4 = z3;
                        vl1Var6 = vl1Var3;
                        if (i6 != 0) {
                            gh2Var3 = null;
                            vl1Var4 = vl1Var3;
                        } else {
                            gh2Var3 = gh2Var2;
                            vl1Var4 = vl1Var6;
                        }
                    } else {
                        if (i12 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if ((i2 & 16) != 0) {
                            vl1VarIconToggleButtonColors = el1.a.iconToggleButtonColors(kk0Var, 6);
                            i3 &= -57345;
                        } else {
                            vl1VarIconToggleButtonColors = vl1Var;
                        }
                        i9 = i3;
                        cVar4 = cVar3;
                        vl1Var3 = vl1VarIconToggleButtonColors;
                        z4 = z3;
                        vl1Var6 = vl1Var3;
                        if (i6 != 0) {
                            gh2Var3 = null;
                            vl1Var4 = vl1Var3;
                        } else {
                            gh2Var3 = gh2Var2;
                            vl1Var4 = vl1Var6;
                        }
                    }
                    kk0Var.s();
                    un3 un3Var3 = vq1.a;
                    i10 = ((i9 >> 9) & 14) | ((i9 << 3) & 112) | ((i9 >> 6) & 896);
                    cVar5 = cVar4;
                    vl1Var5 = vl1Var4;
                    gh2Var4 = gh2Var3;
                    c cVarB3 = androidx.compose.foundation.selection.b.b(a.b(xr0.N(d.j(cVar4.then(MinimumInteractiveModifier.c), 40.0f), wg3.getValue(tg3.m, kk0Var, 6)), ((re0) vl1Var4.containerColor$material3_release(z4, z, kk0Var, i10).getValue()).a, k43.a), z, gh2Var4, g73.m194xaeb141ad(false, 20.0f, 0L, kk0Var, 54, 4), z4, new n73(1), le1Var2);
                    vb2VarC = vw.c(Alignment$Companion.getCenter(), false);
                    currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                    su2VarN = kk0Var.n();
                    cVarD = b.d(kk0Var, cVarB3);
                    androidx.compose.ui.node.a.j.getClass();
                    constructor = ComposeUiNode$Companion.getConstructor();
                    if (kk0Var.a != null) {
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
                    yk0.CompositionLocalProvider(fq2.k(((re0) vl1Var5.contentColor$material3_release(z4, z, kk0Var, i10).getValue()).a, gn0.a), ne1Var, kk0Var, ((i9 >> 15) & 112) | 8);
                    kk0Var.r(true);
                    gh2Var5 = gh2Var4;
                    cVar2 = cVar5;
                    vl1Var7 = vl1Var5;
                } else {
                    kk0Var.X();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if ((i2 & 16) != 0) {
                            vl1VarIconToggleButtonColors = el1.a.iconToggleButtonColors(kk0Var, 6);
                            i3 &= -57345;
                        } else {
                            vl1VarIconToggleButtonColors = vl1Var;
                        }
                        i9 = i3;
                        cVar4 = cVar3;
                        vl1Var3 = vl1VarIconToggleButtonColors;
                        z4 = z3;
                        vl1Var6 = vl1Var3;
                        if (i6 != 0) {
                            gh2Var3 = null;
                            vl1Var4 = vl1Var3;
                        } else {
                            gh2Var3 = gh2Var2;
                            vl1Var4 = vl1Var6;
                        }
                    } else {
                        if (i12 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if ((i2 & 16) != 0) {
                            vl1VarIconToggleButtonColors = el1.a.iconToggleButtonColors(kk0Var, 6);
                            i3 &= -57345;
                        } else {
                            vl1VarIconToggleButtonColors = vl1Var;
                        }
                        i9 = i3;
                        cVar4 = cVar3;
                        vl1Var3 = vl1VarIconToggleButtonColors;
                        z4 = z3;
                        vl1Var6 = vl1Var3;
                        if (i6 != 0) {
                            gh2Var3 = null;
                            vl1Var4 = vl1Var3;
                        } else {
                            gh2Var3 = gh2Var2;
                            vl1Var4 = vl1Var6;
                        }
                    }
                    kk0Var.s();
                    un3 un3Var4 = vq1.a;
                    i10 = ((i9 >> 9) & 14) | ((i9 << 3) & 112) | ((i9 >> 6) & 896);
                    cVar5 = cVar4;
                    vl1Var5 = vl1Var4;
                    gh2Var4 = gh2Var3;
                    c cVarB4 = androidx.compose.foundation.selection.b.b(a.b(xr0.N(d.j(cVar4.then(MinimumInteractiveModifier.c), 40.0f), wg3.getValue(tg3.m, kk0Var, 6)), ((re0) vl1Var4.containerColor$material3_release(z4, z, kk0Var, i10).getValue()).a, k43.a), z, gh2Var4, g73.m194xaeb141ad(false, 20.0f, 0L, kk0Var, 54, 4), z4, new n73(1), le1Var2);
                    vb2VarC = vw.c(Alignment$Companion.getCenter(), false);
                    currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                    su2VarN = kk0Var.n();
                    cVarD = b.d(kk0Var, cVarB4);
                    androidx.compose.ui.node.a.j.getClass();
                    constructor = ComposeUiNode$Companion.getConstructor();
                    if (kk0Var.a != null) {
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
                    yk0.CompositionLocalProvider(fq2.k(((re0) vl1Var5.contentColor$material3_release(z4, z, kk0Var, i10).getValue()).a, gn0.a), ne1Var, kk0Var, ((i9 >> 15) & 112) | 8);
                    kk0Var.r(true);
                    gh2Var5 = gh2Var4;
                    cVar2 = cVar5;
                    vl1Var7 = vl1Var5;
                }
                vl1Var8 = vl1Var7;
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new ml1(z, le1Var, cVar2, z4, vl1Var8, gh2Var5, ne1Var, i, i2));
                }
            }
            i3 |= 3072;
            z3 = z2;
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    vl1Var11 = vl1Var;
                    if (kk0Var.h(vl1Var11)) {
                        vl1Var9 = vl1Var11;
                        i11 = 16384;
                        vl1Var10 = vl1Var11;
                    }
                    i3 |= i11;
                    vl1Var2 = vl1Var10;
                } else {
                    vl1Var9 = vl1Var;
                }
                vl1Var9 = vl1Var11;
                i11 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                vl1Var10 = vl1Var9;
                i3 |= i11;
                vl1Var2 = vl1Var10;
            } else {
                vl1Var2 = vl1Var;
            }
            i6 = i2 & 32;
            if (i6 != 0) {
                if ((196608 & i) == 0) {
                    gh2Var2 = gh2Var;
                    if (kk0Var.h(gh2Var2)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
                if ((i2 & 64) != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    if (kk0Var.j(ne1Var)) {
                        i8 = 1048576;
                    } else {
                        i8 = 524288;
                    }
                    i3 |= i8;
                }
                if ((599187 & i3) == 599186) {
                    kk0Var.X();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if ((i2 & 16) != 0) {
                            vl1VarIconToggleButtonColors = el1.a.iconToggleButtonColors(kk0Var, 6);
                            i3 &= -57345;
                        } else {
                            vl1VarIconToggleButtonColors = vl1Var;
                        }
                        i9 = i3;
                        cVar4 = cVar3;
                        vl1Var3 = vl1VarIconToggleButtonColors;
                        z4 = z3;
                        vl1Var6 = vl1Var3;
                        if (i6 != 0) {
                            gh2Var3 = null;
                            vl1Var4 = vl1Var3;
                        } else {
                            gh2Var3 = gh2Var2;
                            vl1Var4 = vl1Var6;
                        }
                    } else {
                        if (i12 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if ((i2 & 16) != 0) {
                            vl1VarIconToggleButtonColors = el1.a.iconToggleButtonColors(kk0Var, 6);
                            i3 &= -57345;
                        } else {
                            vl1VarIconToggleButtonColors = vl1Var;
                        }
                        i9 = i3;
                        cVar4 = cVar3;
                        vl1Var3 = vl1VarIconToggleButtonColors;
                        z4 = z3;
                        vl1Var6 = vl1Var3;
                        if (i6 != 0) {
                            gh2Var3 = null;
                            vl1Var4 = vl1Var3;
                        } else {
                            gh2Var3 = gh2Var2;
                            vl1Var4 = vl1Var6;
                        }
                    }
                    kk0Var.s();
                    un3 un3Var5 = vq1.a;
                    i10 = ((i9 >> 9) & 14) | ((i9 << 3) & 112) | ((i9 >> 6) & 896);
                    cVar5 = cVar4;
                    vl1Var5 = vl1Var4;
                    gh2Var4 = gh2Var3;
                    c cVarB5 = androidx.compose.foundation.selection.b.b(a.b(xr0.N(d.j(cVar4.then(MinimumInteractiveModifier.c), 40.0f), wg3.getValue(tg3.m, kk0Var, 6)), ((re0) vl1Var4.containerColor$material3_release(z4, z, kk0Var, i10).getValue()).a, k43.a), z, gh2Var4, g73.m194xaeb141ad(false, 20.0f, 0L, kk0Var, 54, 4), z4, new n73(1), le1Var2);
                    vb2VarC = vw.c(Alignment$Companion.getCenter(), false);
                    currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                    su2VarN = kk0Var.n();
                    cVarD = b.d(kk0Var, cVarB5);
                    androidx.compose.ui.node.a.j.getClass();
                    constructor = ComposeUiNode$Companion.getConstructor();
                    if (kk0Var.a != null) {
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
                    yk0.CompositionLocalProvider(fq2.k(((re0) vl1Var5.contentColor$material3_release(z4, z, kk0Var, i10).getValue()).a, gn0.a), ne1Var, kk0Var, ((i9 >> 15) & 112) | 8);
                    kk0Var.r(true);
                    gh2Var5 = gh2Var4;
                    cVar2 = cVar5;
                    vl1Var7 = vl1Var5;
                } else {
                    kk0Var.X();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if ((i2 & 16) != 0) {
                            vl1VarIconToggleButtonColors = el1.a.iconToggleButtonColors(kk0Var, 6);
                            i3 &= -57345;
                        } else {
                            vl1VarIconToggleButtonColors = vl1Var;
                        }
                        i9 = i3;
                        cVar4 = cVar3;
                        vl1Var3 = vl1VarIconToggleButtonColors;
                        z4 = z3;
                        vl1Var6 = vl1Var3;
                        if (i6 != 0) {
                            gh2Var3 = null;
                            vl1Var4 = vl1Var3;
                        } else {
                            gh2Var3 = gh2Var2;
                            vl1Var4 = vl1Var6;
                        }
                    } else {
                        if (i12 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if ((i2 & 16) != 0) {
                            vl1VarIconToggleButtonColors = el1.a.iconToggleButtonColors(kk0Var, 6);
                            i3 &= -57345;
                        } else {
                            vl1VarIconToggleButtonColors = vl1Var;
                        }
                        i9 = i3;
                        cVar4 = cVar3;
                        vl1Var3 = vl1VarIconToggleButtonColors;
                        z4 = z3;
                        vl1Var6 = vl1Var3;
                        if (i6 != 0) {
                            gh2Var3 = null;
                            vl1Var4 = vl1Var3;
                        } else {
                            gh2Var3 = gh2Var2;
                            vl1Var4 = vl1Var6;
                        }
                    }
                    kk0Var.s();
                    un3 un3Var6 = vq1.a;
                    i10 = ((i9 >> 9) & 14) | ((i9 << 3) & 112) | ((i9 >> 6) & 896);
                    cVar5 = cVar4;
                    vl1Var5 = vl1Var4;
                    gh2Var4 = gh2Var3;
                    c cVarB6 = androidx.compose.foundation.selection.b.b(a.b(xr0.N(d.j(cVar4.then(MinimumInteractiveModifier.c), 40.0f), wg3.getValue(tg3.m, kk0Var, 6)), ((re0) vl1Var4.containerColor$material3_release(z4, z, kk0Var, i10).getValue()).a, k43.a), z, gh2Var4, g73.m194xaeb141ad(false, 20.0f, 0L, kk0Var, 54, 4), z4, new n73(1), le1Var2);
                    vb2VarC = vw.c(Alignment$Companion.getCenter(), false);
                    currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                    su2VarN = kk0Var.n();
                    cVarD = b.d(kk0Var, cVarB6);
                    androidx.compose.ui.node.a.j.getClass();
                    constructor = ComposeUiNode$Companion.getConstructor();
                    if (kk0Var.a != null) {
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
                    yk0.CompositionLocalProvider(fq2.k(((re0) vl1Var5.contentColor$material3_release(z4, z, kk0Var, i10).getValue()).a, gn0.a), ne1Var, kk0Var, ((i9 >> 15) & 112) | 8);
                    kk0Var.r(true);
                    gh2Var5 = gh2Var4;
                    cVar2 = cVar5;
                    vl1Var7 = vl1Var5;
                }
                vl1Var8 = vl1Var7;
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new ml1(z, le1Var, cVar2, z4, vl1Var8, gh2Var5, ne1Var, i, i2));
                }
            }
            i3 |= 196608;
            gh2Var2 = gh2Var;
            if ((i2 & 64) != 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                if (kk0Var.j(ne1Var)) {
                    i8 = 1048576;
                } else {
                    i8 = 524288;
                }
                i3 |= i8;
            }
            if ((599187 & i3) == 599186) {
                kk0Var.X();
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if ((i2 & 16) != 0) {
                        vl1VarIconToggleButtonColors = el1.a.iconToggleButtonColors(kk0Var, 6);
                        i3 &= -57345;
                    } else {
                        vl1VarIconToggleButtonColors = vl1Var;
                    }
                    i9 = i3;
                    cVar4 = cVar3;
                    vl1Var3 = vl1VarIconToggleButtonColors;
                    z4 = z3;
                    vl1Var6 = vl1Var3;
                    if (i6 != 0) {
                        gh2Var3 = null;
                        vl1Var4 = vl1Var3;
                    } else {
                        gh2Var3 = gh2Var2;
                        vl1Var4 = vl1Var6;
                    }
                } else {
                    if (i12 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if ((i2 & 16) != 0) {
                        vl1VarIconToggleButtonColors = el1.a.iconToggleButtonColors(kk0Var, 6);
                        i3 &= -57345;
                    } else {
                        vl1VarIconToggleButtonColors = vl1Var;
                    }
                    i9 = i3;
                    cVar4 = cVar3;
                    vl1Var3 = vl1VarIconToggleButtonColors;
                    z4 = z3;
                    vl1Var6 = vl1Var3;
                    if (i6 != 0) {
                        gh2Var3 = null;
                        vl1Var4 = vl1Var3;
                    } else {
                        gh2Var3 = gh2Var2;
                        vl1Var4 = vl1Var6;
                    }
                }
                kk0Var.s();
                un3 un3Var7 = vq1.a;
                i10 = ((i9 >> 9) & 14) | ((i9 << 3) & 112) | ((i9 >> 6) & 896);
                cVar5 = cVar4;
                vl1Var5 = vl1Var4;
                gh2Var4 = gh2Var3;
                c cVarB7 = androidx.compose.foundation.selection.b.b(a.b(xr0.N(d.j(cVar4.then(MinimumInteractiveModifier.c), 40.0f), wg3.getValue(tg3.m, kk0Var, 6)), ((re0) vl1Var4.containerColor$material3_release(z4, z, kk0Var, i10).getValue()).a, k43.a), z, gh2Var4, g73.m194xaeb141ad(false, 20.0f, 0L, kk0Var, 54, 4), z4, new n73(1), le1Var2);
                vb2VarC = vw.c(Alignment$Companion.getCenter(), false);
                currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                su2VarN = kk0Var.n();
                cVarD = b.d(kk0Var, cVarB7);
                androidx.compose.ui.node.a.j.getClass();
                constructor = ComposeUiNode$Companion.getConstructor();
                if (kk0Var.a != null) {
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
                yk0.CompositionLocalProvider(fq2.k(((re0) vl1Var5.contentColor$material3_release(z4, z, kk0Var, i10).getValue()).a, gn0.a), ne1Var, kk0Var, ((i9 >> 15) & 112) | 8);
                kk0Var.r(true);
                gh2Var5 = gh2Var4;
                cVar2 = cVar5;
                vl1Var7 = vl1Var5;
            } else {
                kk0Var.X();
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if ((i2 & 16) != 0) {
                        vl1VarIconToggleButtonColors = el1.a.iconToggleButtonColors(kk0Var, 6);
                        i3 &= -57345;
                    } else {
                        vl1VarIconToggleButtonColors = vl1Var;
                    }
                    i9 = i3;
                    cVar4 = cVar3;
                    vl1Var3 = vl1VarIconToggleButtonColors;
                    z4 = z3;
                    vl1Var6 = vl1Var3;
                    if (i6 != 0) {
                        gh2Var3 = null;
                        vl1Var4 = vl1Var3;
                    } else {
                        gh2Var3 = gh2Var2;
                        vl1Var4 = vl1Var6;
                    }
                } else {
                    if (i12 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if ((i2 & 16) != 0) {
                        vl1VarIconToggleButtonColors = el1.a.iconToggleButtonColors(kk0Var, 6);
                        i3 &= -57345;
                    } else {
                        vl1VarIconToggleButtonColors = vl1Var;
                    }
                    i9 = i3;
                    cVar4 = cVar3;
                    vl1Var3 = vl1VarIconToggleButtonColors;
                    z4 = z3;
                    vl1Var6 = vl1Var3;
                    if (i6 != 0) {
                        gh2Var3 = null;
                        vl1Var4 = vl1Var3;
                    } else {
                        gh2Var3 = gh2Var2;
                        vl1Var4 = vl1Var6;
                    }
                }
                kk0Var.s();
                un3 un3Var8 = vq1.a;
                i10 = ((i9 >> 9) & 14) | ((i9 << 3) & 112) | ((i9 >> 6) & 896);
                cVar5 = cVar4;
                vl1Var5 = vl1Var4;
                gh2Var4 = gh2Var3;
                c cVarB8 = androidx.compose.foundation.selection.b.b(a.b(xr0.N(d.j(cVar4.then(MinimumInteractiveModifier.c), 40.0f), wg3.getValue(tg3.m, kk0Var, 6)), ((re0) vl1Var4.containerColor$material3_release(z4, z, kk0Var, i10).getValue()).a, k43.a), z, gh2Var4, g73.m194xaeb141ad(false, 20.0f, 0L, kk0Var, 54, 4), z4, new n73(1), le1Var2);
                vb2VarC = vw.c(Alignment$Companion.getCenter(), false);
                currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                su2VarN = kk0Var.n();
                cVarD = b.d(kk0Var, cVarB8);
                androidx.compose.ui.node.a.j.getClass();
                constructor = ComposeUiNode$Companion.getConstructor();
                if (kk0Var.a != null) {
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
                yk0.CompositionLocalProvider(fq2.k(((re0) vl1Var5.contentColor$material3_release(z4, z, kk0Var, i10).getValue()).a, gn0.a), ne1Var, kk0Var, ((i9 >> 15) & 112) | 8);
                kk0Var.r(true);
                gh2Var5 = gh2Var4;
                cVar2 = cVar5;
                vl1Var7 = vl1Var5;
            }
            vl1Var8 = vl1Var7;
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new ml1(z, le1Var, cVar2, z4, vl1Var8, gh2Var5, ne1Var, i, i2));
            }
        }
        i3 |= 384;
        cVar2 = cVar;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                z3 = z2;
                if (kk0Var.i(z3)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    vl1Var11 = vl1Var;
                    if (kk0Var.h(vl1Var11)) {
                        vl1Var9 = vl1Var11;
                        i11 = 16384;
                        vl1Var10 = vl1Var11;
                    }
                    i3 |= i11;
                    vl1Var2 = vl1Var10;
                } else {
                    vl1Var9 = vl1Var;
                }
                vl1Var9 = vl1Var11;
                i11 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                vl1Var10 = vl1Var9;
                i3 |= i11;
                vl1Var2 = vl1Var10;
            } else {
                vl1Var2 = vl1Var;
            }
            i6 = i2 & 32;
            if (i6 != 0) {
                if ((196608 & i) == 0) {
                    gh2Var2 = gh2Var;
                    if (kk0Var.h(gh2Var2)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
                if ((i2 & 64) != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    if (kk0Var.j(ne1Var)) {
                        i8 = 1048576;
                    } else {
                        i8 = 524288;
                    }
                    i3 |= i8;
                }
                if ((599187 & i3) == 599186) {
                    kk0Var.X();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if ((i2 & 16) != 0) {
                            vl1VarIconToggleButtonColors = el1.a.iconToggleButtonColors(kk0Var, 6);
                            i3 &= -57345;
                        } else {
                            vl1VarIconToggleButtonColors = vl1Var;
                        }
                        i9 = i3;
                        cVar4 = cVar3;
                        vl1Var3 = vl1VarIconToggleButtonColors;
                        z4 = z3;
                        vl1Var6 = vl1Var3;
                        if (i6 != 0) {
                            gh2Var3 = null;
                            vl1Var4 = vl1Var3;
                        } else {
                            gh2Var3 = gh2Var2;
                            vl1Var4 = vl1Var6;
                        }
                    } else {
                        if (i12 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if ((i2 & 16) != 0) {
                            vl1VarIconToggleButtonColors = el1.a.iconToggleButtonColors(kk0Var, 6);
                            i3 &= -57345;
                        } else {
                            vl1VarIconToggleButtonColors = vl1Var;
                        }
                        i9 = i3;
                        cVar4 = cVar3;
                        vl1Var3 = vl1VarIconToggleButtonColors;
                        z4 = z3;
                        vl1Var6 = vl1Var3;
                        if (i6 != 0) {
                            gh2Var3 = null;
                            vl1Var4 = vl1Var3;
                        } else {
                            gh2Var3 = gh2Var2;
                            vl1Var4 = vl1Var6;
                        }
                    }
                    kk0Var.s();
                    un3 un3Var9 = vq1.a;
                    i10 = ((i9 >> 9) & 14) | ((i9 << 3) & 112) | ((i9 >> 6) & 896);
                    cVar5 = cVar4;
                    vl1Var5 = vl1Var4;
                    gh2Var4 = gh2Var3;
                    c cVarB9 = androidx.compose.foundation.selection.b.b(a.b(xr0.N(d.j(cVar4.then(MinimumInteractiveModifier.c), 40.0f), wg3.getValue(tg3.m, kk0Var, 6)), ((re0) vl1Var4.containerColor$material3_release(z4, z, kk0Var, i10).getValue()).a, k43.a), z, gh2Var4, g73.m194xaeb141ad(false, 20.0f, 0L, kk0Var, 54, 4), z4, new n73(1), le1Var2);
                    vb2VarC = vw.c(Alignment$Companion.getCenter(), false);
                    currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                    su2VarN = kk0Var.n();
                    cVarD = b.d(kk0Var, cVarB9);
                    androidx.compose.ui.node.a.j.getClass();
                    constructor = ComposeUiNode$Companion.getConstructor();
                    if (kk0Var.a != null) {
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
                    yk0.CompositionLocalProvider(fq2.k(((re0) vl1Var5.contentColor$material3_release(z4, z, kk0Var, i10).getValue()).a, gn0.a), ne1Var, kk0Var, ((i9 >> 15) & 112) | 8);
                    kk0Var.r(true);
                    gh2Var5 = gh2Var4;
                    cVar2 = cVar5;
                    vl1Var7 = vl1Var5;
                } else {
                    kk0Var.X();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if ((i2 & 16) != 0) {
                            vl1VarIconToggleButtonColors = el1.a.iconToggleButtonColors(kk0Var, 6);
                            i3 &= -57345;
                        } else {
                            vl1VarIconToggleButtonColors = vl1Var;
                        }
                        i9 = i3;
                        cVar4 = cVar3;
                        vl1Var3 = vl1VarIconToggleButtonColors;
                        z4 = z3;
                        vl1Var6 = vl1Var3;
                        if (i6 != 0) {
                            gh2Var3 = null;
                            vl1Var4 = vl1Var3;
                        } else {
                            gh2Var3 = gh2Var2;
                            vl1Var4 = vl1Var6;
                        }
                    } else {
                        if (i12 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if ((i2 & 16) != 0) {
                            vl1VarIconToggleButtonColors = el1.a.iconToggleButtonColors(kk0Var, 6);
                            i3 &= -57345;
                        } else {
                            vl1VarIconToggleButtonColors = vl1Var;
                        }
                        i9 = i3;
                        cVar4 = cVar3;
                        vl1Var3 = vl1VarIconToggleButtonColors;
                        z4 = z3;
                        vl1Var6 = vl1Var3;
                        if (i6 != 0) {
                            gh2Var3 = null;
                            vl1Var4 = vl1Var3;
                        } else {
                            gh2Var3 = gh2Var2;
                            vl1Var4 = vl1Var6;
                        }
                    }
                    kk0Var.s();
                    un3 un3Var10 = vq1.a;
                    i10 = ((i9 >> 9) & 14) | ((i9 << 3) & 112) | ((i9 >> 6) & 896);
                    cVar5 = cVar4;
                    vl1Var5 = vl1Var4;
                    gh2Var4 = gh2Var3;
                    c cVarB10 = androidx.compose.foundation.selection.b.b(a.b(xr0.N(d.j(cVar4.then(MinimumInteractiveModifier.c), 40.0f), wg3.getValue(tg3.m, kk0Var, 6)), ((re0) vl1Var4.containerColor$material3_release(z4, z, kk0Var, i10).getValue()).a, k43.a), z, gh2Var4, g73.m194xaeb141ad(false, 20.0f, 0L, kk0Var, 54, 4), z4, new n73(1), le1Var2);
                    vb2VarC = vw.c(Alignment$Companion.getCenter(), false);
                    currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                    su2VarN = kk0Var.n();
                    cVarD = b.d(kk0Var, cVarB10);
                    androidx.compose.ui.node.a.j.getClass();
                    constructor = ComposeUiNode$Companion.getConstructor();
                    if (kk0Var.a != null) {
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
                    yk0.CompositionLocalProvider(fq2.k(((re0) vl1Var5.contentColor$material3_release(z4, z, kk0Var, i10).getValue()).a, gn0.a), ne1Var, kk0Var, ((i9 >> 15) & 112) | 8);
                    kk0Var.r(true);
                    gh2Var5 = gh2Var4;
                    cVar2 = cVar5;
                    vl1Var7 = vl1Var5;
                }
                vl1Var8 = vl1Var7;
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new ml1(z, le1Var, cVar2, z4, vl1Var8, gh2Var5, ne1Var, i, i2));
                }
            }
            i3 |= 196608;
            gh2Var2 = gh2Var;
            if ((i2 & 64) != 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                if (kk0Var.j(ne1Var)) {
                    i8 = 1048576;
                } else {
                    i8 = 524288;
                }
                i3 |= i8;
            }
            if ((599187 & i3) == 599186) {
                kk0Var.X();
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if ((i2 & 16) != 0) {
                        vl1VarIconToggleButtonColors = el1.a.iconToggleButtonColors(kk0Var, 6);
                        i3 &= -57345;
                    } else {
                        vl1VarIconToggleButtonColors = vl1Var;
                    }
                    i9 = i3;
                    cVar4 = cVar3;
                    vl1Var3 = vl1VarIconToggleButtonColors;
                    z4 = z3;
                    vl1Var6 = vl1Var3;
                    if (i6 != 0) {
                        gh2Var3 = null;
                        vl1Var4 = vl1Var3;
                    } else {
                        gh2Var3 = gh2Var2;
                        vl1Var4 = vl1Var6;
                    }
                } else {
                    if (i12 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if ((i2 & 16) != 0) {
                        vl1VarIconToggleButtonColors = el1.a.iconToggleButtonColors(kk0Var, 6);
                        i3 &= -57345;
                    } else {
                        vl1VarIconToggleButtonColors = vl1Var;
                    }
                    i9 = i3;
                    cVar4 = cVar3;
                    vl1Var3 = vl1VarIconToggleButtonColors;
                    z4 = z3;
                    vl1Var6 = vl1Var3;
                    if (i6 != 0) {
                        gh2Var3 = null;
                        vl1Var4 = vl1Var3;
                    } else {
                        gh2Var3 = gh2Var2;
                        vl1Var4 = vl1Var6;
                    }
                }
                kk0Var.s();
                un3 un3Var11 = vq1.a;
                i10 = ((i9 >> 9) & 14) | ((i9 << 3) & 112) | ((i9 >> 6) & 896);
                cVar5 = cVar4;
                vl1Var5 = vl1Var4;
                gh2Var4 = gh2Var3;
                c cVarB11 = androidx.compose.foundation.selection.b.b(a.b(xr0.N(d.j(cVar4.then(MinimumInteractiveModifier.c), 40.0f), wg3.getValue(tg3.m, kk0Var, 6)), ((re0) vl1Var4.containerColor$material3_release(z4, z, kk0Var, i10).getValue()).a, k43.a), z, gh2Var4, g73.m194xaeb141ad(false, 20.0f, 0L, kk0Var, 54, 4), z4, new n73(1), le1Var2);
                vb2VarC = vw.c(Alignment$Companion.getCenter(), false);
                currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                su2VarN = kk0Var.n();
                cVarD = b.d(kk0Var, cVarB11);
                androidx.compose.ui.node.a.j.getClass();
                constructor = ComposeUiNode$Companion.getConstructor();
                if (kk0Var.a != null) {
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
                yk0.CompositionLocalProvider(fq2.k(((re0) vl1Var5.contentColor$material3_release(z4, z, kk0Var, i10).getValue()).a, gn0.a), ne1Var, kk0Var, ((i9 >> 15) & 112) | 8);
                kk0Var.r(true);
                gh2Var5 = gh2Var4;
                cVar2 = cVar5;
                vl1Var7 = vl1Var5;
            } else {
                kk0Var.X();
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if ((i2 & 16) != 0) {
                        vl1VarIconToggleButtonColors = el1.a.iconToggleButtonColors(kk0Var, 6);
                        i3 &= -57345;
                    } else {
                        vl1VarIconToggleButtonColors = vl1Var;
                    }
                    i9 = i3;
                    cVar4 = cVar3;
                    vl1Var3 = vl1VarIconToggleButtonColors;
                    z4 = z3;
                    vl1Var6 = vl1Var3;
                    if (i6 != 0) {
                        gh2Var3 = null;
                        vl1Var4 = vl1Var3;
                    } else {
                        gh2Var3 = gh2Var2;
                        vl1Var4 = vl1Var6;
                    }
                } else {
                    if (i12 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if ((i2 & 16) != 0) {
                        vl1VarIconToggleButtonColors = el1.a.iconToggleButtonColors(kk0Var, 6);
                        i3 &= -57345;
                    } else {
                        vl1VarIconToggleButtonColors = vl1Var;
                    }
                    i9 = i3;
                    cVar4 = cVar3;
                    vl1Var3 = vl1VarIconToggleButtonColors;
                    z4 = z3;
                    vl1Var6 = vl1Var3;
                    if (i6 != 0) {
                        gh2Var3 = null;
                        vl1Var4 = vl1Var3;
                    } else {
                        gh2Var3 = gh2Var2;
                        vl1Var4 = vl1Var6;
                    }
                }
                kk0Var.s();
                un3 un3Var12 = vq1.a;
                i10 = ((i9 >> 9) & 14) | ((i9 << 3) & 112) | ((i9 >> 6) & 896);
                cVar5 = cVar4;
                vl1Var5 = vl1Var4;
                gh2Var4 = gh2Var3;
                c cVarB12 = androidx.compose.foundation.selection.b.b(a.b(xr0.N(d.j(cVar4.then(MinimumInteractiveModifier.c), 40.0f), wg3.getValue(tg3.m, kk0Var, 6)), ((re0) vl1Var4.containerColor$material3_release(z4, z, kk0Var, i10).getValue()).a, k43.a), z, gh2Var4, g73.m194xaeb141ad(false, 20.0f, 0L, kk0Var, 54, 4), z4, new n73(1), le1Var2);
                vb2VarC = vw.c(Alignment$Companion.getCenter(), false);
                currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                su2VarN = kk0Var.n();
                cVarD = b.d(kk0Var, cVarB12);
                androidx.compose.ui.node.a.j.getClass();
                constructor = ComposeUiNode$Companion.getConstructor();
                if (kk0Var.a != null) {
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
                yk0.CompositionLocalProvider(fq2.k(((re0) vl1Var5.contentColor$material3_release(z4, z, kk0Var, i10).getValue()).a, gn0.a), ne1Var, kk0Var, ((i9 >> 15) & 112) | 8);
                kk0Var.r(true);
                gh2Var5 = gh2Var4;
                cVar2 = cVar5;
                vl1Var7 = vl1Var5;
            }
            vl1Var8 = vl1Var7;
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new ml1(z, le1Var, cVar2, z4, vl1Var8, gh2Var5, ne1Var, i, i2));
            }
        }
        i3 |= 3072;
        z3 = z2;
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                vl1Var11 = vl1Var;
                if (kk0Var.h(vl1Var11)) {
                    vl1Var9 = vl1Var11;
                    i11 = 16384;
                    vl1Var10 = vl1Var11;
                }
                i3 |= i11;
                vl1Var2 = vl1Var10;
            } else {
                vl1Var9 = vl1Var;
            }
            vl1Var9 = vl1Var11;
            i11 = ConstantsKt.DEFAULT_BUFFER_SIZE;
            vl1Var10 = vl1Var9;
            i3 |= i11;
            vl1Var2 = vl1Var10;
        } else {
            vl1Var2 = vl1Var;
        }
        i6 = i2 & 32;
        if (i6 != 0) {
            if ((196608 & i) == 0) {
                gh2Var2 = gh2Var;
                if (kk0Var.h(gh2Var2)) {
                    i7 = 131072;
                } else {
                    i7 = 65536;
                }
                i3 |= i7;
            }
            if ((i2 & 64) != 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                if (kk0Var.j(ne1Var)) {
                    i8 = 1048576;
                } else {
                    i8 = 524288;
                }
                i3 |= i8;
            }
            if ((599187 & i3) == 599186) {
                kk0Var.X();
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if ((i2 & 16) != 0) {
                        vl1VarIconToggleButtonColors = el1.a.iconToggleButtonColors(kk0Var, 6);
                        i3 &= -57345;
                    } else {
                        vl1VarIconToggleButtonColors = vl1Var;
                    }
                    i9 = i3;
                    cVar4 = cVar3;
                    vl1Var3 = vl1VarIconToggleButtonColors;
                    z4 = z3;
                    vl1Var6 = vl1Var3;
                    if (i6 != 0) {
                        gh2Var3 = null;
                        vl1Var4 = vl1Var3;
                    } else {
                        gh2Var3 = gh2Var2;
                        vl1Var4 = vl1Var6;
                    }
                } else {
                    if (i12 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if ((i2 & 16) != 0) {
                        vl1VarIconToggleButtonColors = el1.a.iconToggleButtonColors(kk0Var, 6);
                        i3 &= -57345;
                    } else {
                        vl1VarIconToggleButtonColors = vl1Var;
                    }
                    i9 = i3;
                    cVar4 = cVar3;
                    vl1Var3 = vl1VarIconToggleButtonColors;
                    z4 = z3;
                    vl1Var6 = vl1Var3;
                    if (i6 != 0) {
                        gh2Var3 = null;
                        vl1Var4 = vl1Var3;
                    } else {
                        gh2Var3 = gh2Var2;
                        vl1Var4 = vl1Var6;
                    }
                }
                kk0Var.s();
                un3 un3Var13 = vq1.a;
                i10 = ((i9 >> 9) & 14) | ((i9 << 3) & 112) | ((i9 >> 6) & 896);
                cVar5 = cVar4;
                vl1Var5 = vl1Var4;
                gh2Var4 = gh2Var3;
                c cVarB13 = androidx.compose.foundation.selection.b.b(a.b(xr0.N(d.j(cVar4.then(MinimumInteractiveModifier.c), 40.0f), wg3.getValue(tg3.m, kk0Var, 6)), ((re0) vl1Var4.containerColor$material3_release(z4, z, kk0Var, i10).getValue()).a, k43.a), z, gh2Var4, g73.m194xaeb141ad(false, 20.0f, 0L, kk0Var, 54, 4), z4, new n73(1), le1Var2);
                vb2VarC = vw.c(Alignment$Companion.getCenter(), false);
                currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                su2VarN = kk0Var.n();
                cVarD = b.d(kk0Var, cVarB13);
                androidx.compose.ui.node.a.j.getClass();
                constructor = ComposeUiNode$Companion.getConstructor();
                if (kk0Var.a != null) {
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
                yk0.CompositionLocalProvider(fq2.k(((re0) vl1Var5.contentColor$material3_release(z4, z, kk0Var, i10).getValue()).a, gn0.a), ne1Var, kk0Var, ((i9 >> 15) & 112) | 8);
                kk0Var.r(true);
                gh2Var5 = gh2Var4;
                cVar2 = cVar5;
                vl1Var7 = vl1Var5;
            } else {
                kk0Var.X();
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if ((i2 & 16) != 0) {
                        vl1VarIconToggleButtonColors = el1.a.iconToggleButtonColors(kk0Var, 6);
                        i3 &= -57345;
                    } else {
                        vl1VarIconToggleButtonColors = vl1Var;
                    }
                    i9 = i3;
                    cVar4 = cVar3;
                    vl1Var3 = vl1VarIconToggleButtonColors;
                    z4 = z3;
                    vl1Var6 = vl1Var3;
                    if (i6 != 0) {
                        gh2Var3 = null;
                        vl1Var4 = vl1Var3;
                    } else {
                        gh2Var3 = gh2Var2;
                        vl1Var4 = vl1Var6;
                    }
                } else {
                    if (i12 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if ((i2 & 16) != 0) {
                        vl1VarIconToggleButtonColors = el1.a.iconToggleButtonColors(kk0Var, 6);
                        i3 &= -57345;
                    } else {
                        vl1VarIconToggleButtonColors = vl1Var;
                    }
                    i9 = i3;
                    cVar4 = cVar3;
                    vl1Var3 = vl1VarIconToggleButtonColors;
                    z4 = z3;
                    vl1Var6 = vl1Var3;
                    if (i6 != 0) {
                        gh2Var3 = null;
                        vl1Var4 = vl1Var3;
                    } else {
                        gh2Var3 = gh2Var2;
                        vl1Var4 = vl1Var6;
                    }
                }
                kk0Var.s();
                un3 un3Var14 = vq1.a;
                i10 = ((i9 >> 9) & 14) | ((i9 << 3) & 112) | ((i9 >> 6) & 896);
                cVar5 = cVar4;
                vl1Var5 = vl1Var4;
                gh2Var4 = gh2Var3;
                c cVarB14 = androidx.compose.foundation.selection.b.b(a.b(xr0.N(d.j(cVar4.then(MinimumInteractiveModifier.c), 40.0f), wg3.getValue(tg3.m, kk0Var, 6)), ((re0) vl1Var4.containerColor$material3_release(z4, z, kk0Var, i10).getValue()).a, k43.a), z, gh2Var4, g73.m194xaeb141ad(false, 20.0f, 0L, kk0Var, 54, 4), z4, new n73(1), le1Var2);
                vb2VarC = vw.c(Alignment$Companion.getCenter(), false);
                currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                su2VarN = kk0Var.n();
                cVarD = b.d(kk0Var, cVarB14);
                androidx.compose.ui.node.a.j.getClass();
                constructor = ComposeUiNode$Companion.getConstructor();
                if (kk0Var.a != null) {
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
                yk0.CompositionLocalProvider(fq2.k(((re0) vl1Var5.contentColor$material3_release(z4, z, kk0Var, i10).getValue()).a, gn0.a), ne1Var, kk0Var, ((i9 >> 15) & 112) | 8);
                kk0Var.r(true);
                gh2Var5 = gh2Var4;
                cVar2 = cVar5;
                vl1Var7 = vl1Var5;
            }
            vl1Var8 = vl1Var7;
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new ml1(z, le1Var, cVar2, z4, vl1Var8, gh2Var5, ne1Var, i, i2));
            }
        }
        i3 |= 196608;
        gh2Var2 = gh2Var;
        if ((i2 & 64) != 0) {
            i3 |= 1572864;
        } else if ((i & 1572864) == 0) {
            if (kk0Var.j(ne1Var)) {
                i8 = 1048576;
            } else {
                i8 = 524288;
            }
            i3 |= i8;
        }
        if ((599187 & i3) == 599186) {
            kk0Var.X();
            if ((i & 1) != 0) {
                if (i12 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if (i4 != 0) {
                    z3 = true;
                }
                if ((i2 & 16) != 0) {
                    vl1VarIconToggleButtonColors = el1.a.iconToggleButtonColors(kk0Var, 6);
                    i3 &= -57345;
                } else {
                    vl1VarIconToggleButtonColors = vl1Var;
                }
                i9 = i3;
                cVar4 = cVar3;
                vl1Var3 = vl1VarIconToggleButtonColors;
                z4 = z3;
                vl1Var6 = vl1Var3;
                if (i6 != 0) {
                    gh2Var3 = null;
                    vl1Var4 = vl1Var3;
                } else {
                    gh2Var3 = gh2Var2;
                    vl1Var4 = vl1Var6;
                }
            } else {
                if (i12 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if (i4 != 0) {
                    z3 = true;
                }
                if ((i2 & 16) != 0) {
                    vl1VarIconToggleButtonColors = el1.a.iconToggleButtonColors(kk0Var, 6);
                    i3 &= -57345;
                } else {
                    vl1VarIconToggleButtonColors = vl1Var;
                }
                i9 = i3;
                cVar4 = cVar3;
                vl1Var3 = vl1VarIconToggleButtonColors;
                z4 = z3;
                vl1Var6 = vl1Var3;
                if (i6 != 0) {
                    gh2Var3 = null;
                    vl1Var4 = vl1Var3;
                } else {
                    gh2Var3 = gh2Var2;
                    vl1Var4 = vl1Var6;
                }
            }
            kk0Var.s();
            un3 un3Var15 = vq1.a;
            i10 = ((i9 >> 9) & 14) | ((i9 << 3) & 112) | ((i9 >> 6) & 896);
            cVar5 = cVar4;
            vl1Var5 = vl1Var4;
            gh2Var4 = gh2Var3;
            c cVarB15 = androidx.compose.foundation.selection.b.b(a.b(xr0.N(d.j(cVar4.then(MinimumInteractiveModifier.c), 40.0f), wg3.getValue(tg3.m, kk0Var, 6)), ((re0) vl1Var4.containerColor$material3_release(z4, z, kk0Var, i10).getValue()).a, k43.a), z, gh2Var4, g73.m194xaeb141ad(false, 20.0f, 0L, kk0Var, 54, 4), z4, new n73(1), le1Var2);
            vb2VarC = vw.c(Alignment$Companion.getCenter(), false);
            currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
            su2VarN = kk0Var.n();
            cVarD = b.d(kk0Var, cVarB15);
            androidx.compose.ui.node.a.j.getClass();
            constructor = ComposeUiNode$Companion.getConstructor();
            if (kk0Var.a != null) {
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
            yk0.CompositionLocalProvider(fq2.k(((re0) vl1Var5.contentColor$material3_release(z4, z, kk0Var, i10).getValue()).a, gn0.a), ne1Var, kk0Var, ((i9 >> 15) & 112) | 8);
            kk0Var.r(true);
            gh2Var5 = gh2Var4;
            cVar2 = cVar5;
            vl1Var7 = vl1Var5;
        } else {
            kk0Var.X();
            if ((i & 1) != 0) {
                if (i12 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if (i4 != 0) {
                    z3 = true;
                }
                if ((i2 & 16) != 0) {
                    vl1VarIconToggleButtonColors = el1.a.iconToggleButtonColors(kk0Var, 6);
                    i3 &= -57345;
                } else {
                    vl1VarIconToggleButtonColors = vl1Var;
                }
                i9 = i3;
                cVar4 = cVar3;
                vl1Var3 = vl1VarIconToggleButtonColors;
                z4 = z3;
                vl1Var6 = vl1Var3;
                if (i6 != 0) {
                    gh2Var3 = null;
                    vl1Var4 = vl1Var3;
                } else {
                    gh2Var3 = gh2Var2;
                    vl1Var4 = vl1Var6;
                }
            } else {
                if (i12 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if (i4 != 0) {
                    z3 = true;
                }
                if ((i2 & 16) != 0) {
                    vl1VarIconToggleButtonColors = el1.a.iconToggleButtonColors(kk0Var, 6);
                    i3 &= -57345;
                } else {
                    vl1VarIconToggleButtonColors = vl1Var;
                }
                i9 = i3;
                cVar4 = cVar3;
                vl1Var3 = vl1VarIconToggleButtonColors;
                z4 = z3;
                vl1Var6 = vl1Var3;
                if (i6 != 0) {
                    gh2Var3 = null;
                    vl1Var4 = vl1Var3;
                } else {
                    gh2Var3 = gh2Var2;
                    vl1Var4 = vl1Var6;
                }
            }
            kk0Var.s();
            un3 un3Var16 = vq1.a;
            i10 = ((i9 >> 9) & 14) | ((i9 << 3) & 112) | ((i9 >> 6) & 896);
            cVar5 = cVar4;
            vl1Var5 = vl1Var4;
            gh2Var4 = gh2Var3;
            c cVarB16 = androidx.compose.foundation.selection.b.b(a.b(xr0.N(d.j(cVar4.then(MinimumInteractiveModifier.c), 40.0f), wg3.getValue(tg3.m, kk0Var, 6)), ((re0) vl1Var4.containerColor$material3_release(z4, z, kk0Var, i10).getValue()).a, k43.a), z, gh2Var4, g73.m194xaeb141ad(false, 20.0f, 0L, kk0Var, 54, 4), z4, new n73(1), le1Var2);
            vb2VarC = vw.c(Alignment$Companion.getCenter(), false);
            currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
            su2VarN = kk0Var.n();
            cVarD = b.d(kk0Var, cVarB16);
            androidx.compose.ui.node.a.j.getClass();
            constructor = ComposeUiNode$Companion.getConstructor();
            if (kk0Var.a != null) {
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
            yk0.CompositionLocalProvider(fq2.k(((re0) vl1Var5.contentColor$material3_release(z4, z, kk0Var, i10).getValue()).a, gn0.a), ne1Var, kk0Var, ((i9 >> 15) & 112) | 8);
            kk0Var.r(true);
            gh2Var5 = gh2Var4;
            cVar2 = cVar5;
            vl1Var7 = vl1Var5;
        }
        vl1Var8 = vl1Var7;
        w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new ml1(z, le1Var, cVar2, z4, vl1Var8, gh2Var5, ne1Var, i, i2));
        }
    }

    /* JADX WARN: Code duplicated, block: B:110:0x0130 A[PHI: r1 r2 r5 r6 r7 r12
  0x0130: PHI (r1v30 int) = (r1v23 int), (r1v33 int) binds: [B:125:0x016a, B:109:0x012f] A[DONT_GENERATE, DONT_INLINE]
  0x0130: PHI (r2v7 androidx.compose.ui.c) = (r2v4 androidx.compose.ui.c), (r2v12 androidx.compose.ui.c) binds: [B:125:0x016a, B:109:0x012f] A[DONT_GENERATE, DONT_INLINE]
  0x0130: PHI (r5v7 boolean) = (r5v3 boolean), (r5v2 boolean) binds: [B:125:0x016a, B:109:0x012f] A[DONT_GENERATE, DONT_INLINE]
  0x0130: PHI (r6v11 rg3) = (r6v7 rg3), (r6v6 rg3) binds: [B:125:0x016a, B:109:0x012f] A[DONT_GENERATE, DONT_INLINE]
  0x0130: PHI (r7v7 dl1) = (r7v3 dl1), (r7v2 dl1) binds: [B:125:0x016a, B:109:0x012f] A[DONT_GENERATE, DONT_INLINE]
  0x0130: PHI (r12v7 iw) = (r12v4 iw), (r12v3 iw) binds: [B:125:0x016a, B:109:0x012f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:111:0x0137 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:112:0x0139  */
    /* JADX WARN: Code duplicated, block: B:113:0x013c  */
    /* JADX WARN: Code duplicated, block: B:115:0x013f  */
    /* JADX WARN: Code duplicated, block: B:118:0x0147  */
    /* JADX WARN: Code duplicated, block: B:121:0x0152  */
    /* JADX WARN: Code duplicated, block: B:124:0x015d  */
    /* JADX WARN: Code duplicated, block: B:126:0x016c  */
    /* JADX WARN: Code duplicated, block: B:129:0x017f  */
    /* JADX WARN: Code duplicated, block: B:131:0x0183  */
    /* JADX WARN: Code duplicated, block: B:133:0x0188  */
    /* JADX WARN: Code duplicated, block: B:135:0x018d  */
    /* JADX WARN: Code duplicated, block: B:139:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:141:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004a  */
    /* JADX WARN: Code duplicated, block: B:28:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:32:0x005b  */
    /* JADX WARN: Code duplicated, block: B:33:0x005e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:39:0x0069  */
    /* JADX WARN: Code duplicated, block: B:41:0x0071  */
    /* JADX WARN: Code duplicated, block: B:42:0x0074  */
    /* JADX WARN: Code duplicated, block: B:45:0x007a  */
    /* JADX WARN: Code duplicated, block: B:48:0x0080  */
    /* JADX WARN: Code duplicated, block: B:50:0x0084  */
    /* JADX WARN: Code duplicated, block: B:52:0x008c  */
    /* JADX WARN: Code duplicated, block: B:53:0x008f  */
    /* JADX WARN: Code duplicated, block: B:56:0x0095  */
    /* JADX WARN: Code duplicated, block: B:59:0x009c  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:72:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:76:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:77:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:82:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:84:0x00db  */
    /* JADX WARN: Code duplicated, block: B:86:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:87:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:91:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:95:0x0106  */
    /* JADX WARN: Code duplicated, block: B:97:0x0113  */
    public static final void OutlinedIconButton(je1 je1Var, c cVar, boolean z, rg3 rg3Var, dl1 dl1Var, iw iwVar, gh2 gh2Var, ne1 ne1Var, ck0 ck0Var, int i, int i2) {
        je1 je1Var2;
        int i3;
        c cVar2;
        int i4;
        boolean z2;
        int i5;
        rg3 outlinedShape;
        dl1 dl1VarOutlinedIconButtonColors;
        iw iwVar2;
        int i6;
        gh2 gh2Var2;
        int i7;
        int i8;
        c cVar3;
        int i9;
        el1 el1Var;
        gh2 gh2Var3;
        boolean z3;
        rg3 rg3Var2;
        iw iwVar3;
        long j;
        long j2;
        kk0 kk0Var;
        dl1 dl1Var2;
        boolean z4;
        rg3 rg3Var3;
        iw iwVar4;
        gh2 gh2Var4;
        w33 w33VarV;
        int i10;
        kk0 kk0Var2 = (kk0) ck0Var;
        kk0Var2.c0(-1746603025);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            je1Var2 = je1Var;
        } else {
            je1Var2 = je1Var;
            if ((i & 6) == 0) {
                i3 = (kk0Var2.j(je1Var2) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        int i11 = i2 & 2;
        if (i11 == 0) {
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
                        outlinedShape = rg3Var;
                        int i12 = kk0Var2.h(outlinedShape) ? 2048 : 1024;
                        i3 |= i12;
                    } else {
                        outlinedShape = rg3Var;
                    }
                    i3 |= i12;
                } else {
                    outlinedShape = rg3Var;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        dl1VarOutlinedIconButtonColors = dl1Var;
                        if (kk0Var2.h(dl1VarOutlinedIconButtonColors)) {
                            i10 = 16384;
                        }
                        i3 |= i10;
                    } else {
                        dl1VarOutlinedIconButtonColors = dl1Var;
                    }
                    i10 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                    i3 |= i10;
                } else {
                    dl1VarOutlinedIconButtonColors = dl1Var;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        iwVar2 = iwVar;
                        int i13 = kk0Var2.h(iwVar2) ? 131072 : 65536;
                        i3 |= i13;
                    } else {
                        iwVar2 = iwVar;
                    }
                    i3 |= i13;
                } else {
                    iwVar2 = iwVar;
                }
                i6 = i2 & 64;
                if (i6 != 0) {
                    if ((1572864 & i) == 0) {
                        gh2Var2 = gh2Var;
                        if (kk0Var2.h(gh2Var2)) {
                            i7 = 1048576;
                        } else {
                            i7 = 524288;
                        }
                        i3 |= i7;
                    }
                    if ((i2 & Uuid.SIZE_BITS) != 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        if (kk0Var2.j(ne1Var)) {
                            i8 = 8388608;
                        } else {
                            i8 = 4194304;
                        }
                        i3 |= i8;
                    }
                    if ((4793491 & i3) == 4793490 || !kk0Var2.F()) {
                        kk0Var2.X();
                        if ((i & 1) != 0 || kk0Var2.D()) {
                            if (i11 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i4 != 0) {
                                z2 = true;
                            }
                            i9 = i2 & 8;
                            el1Var = el1.a;
                            if (i9 != 0) {
                                i3 &= -7169;
                                outlinedShape = el1Var.getOutlinedShape(kk0Var2, 6);
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                                dl1VarOutlinedIconButtonColors = el1Var.outlinedIconButtonColors(kk0Var2, 6);
                            }
                            if ((i2 & 32) != 0) {
                                iw iwVarOutlinedIconButtonBorder = el1Var.outlinedIconButtonBorder(z2, kk0Var2, ((i3 >> 6) & 14) | 48);
                                i3 &= -458753;
                                iwVar2 = iwVarOutlinedIconButtonBorder;
                            }
                            if (i6 != 0) {
                                gh2Var3 = null;
                                z3 = z2;
                                rg3Var2 = outlinedShape;
                                iwVar3 = iwVar2;
                            }
                            kk0Var2.s();
                            c cVarB = we3.b(cVar3, false, fl1.n);
                            if (z3) {
                                j = dl1VarOutlinedIconButtonColors.a;
                            } else {
                                j = dl1VarOutlinedIconButtonColors.c;
                            }
                            long j3 = j;
                            if (z3) {
                                j2 = dl1VarOutlinedIconButtonColors.b;
                            } else {
                                j2 = dl1VarOutlinedIconButtonColors.d;
                            }
                            long j4 = j2;
                            int i14 = i3 & 8078;
                            int i15 = i3 << 9;
                            kk0Var = kk0Var2;
                            hq3.m213xde3417d4(je1Var2, cVarB, z3, rg3Var2, j3, j4, 0.0f, 0.0f, iwVar3, gh2Var3, zg0.rememberComposableLambda(582332538, true, new nl1(ne1Var), kk0Var2, 54), kk0Var, i14 | (234881024 & i15) | (i15 & 1879048192), 6, 192);
                            dl1Var2 = dl1VarOutlinedIconButtonColors;
                            z4 = z3;
                            rg3Var3 = rg3Var2;
                            iwVar4 = iwVar3;
                            gh2Var4 = gh2Var3;
                        } else {
                            kk0Var2.V();
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                            cVar3 = cVar2;
                        }
                        z3 = z2;
                        iwVar3 = iwVar2;
                        gh2Var3 = gh2Var2;
                        rg3Var2 = outlinedShape;
                        kk0Var2.s();
                        c cVarB2 = we3.b(cVar3, false, fl1.n);
                        if (z3) {
                            j = dl1VarOutlinedIconButtonColors.a;
                        } else {
                            j = dl1VarOutlinedIconButtonColors.c;
                        }
                        long j5 = j;
                        if (z3) {
                            j2 = dl1VarOutlinedIconButtonColors.b;
                        } else {
                            j2 = dl1VarOutlinedIconButtonColors.d;
                        }
                        long j6 = j2;
                        int i16 = i3 & 8078;
                        int i17 = i3 << 9;
                        kk0Var = kk0Var2;
                        hq3.m213xde3417d4(je1Var2, cVarB2, z3, rg3Var2, j5, j6, 0.0f, 0.0f, iwVar3, gh2Var3, zg0.rememberComposableLambda(582332538, true, new nl1(ne1Var), kk0Var2, 54), kk0Var, i16 | (234881024 & i17) | (i17 & 1879048192), 6, 192);
                        dl1Var2 = dl1VarOutlinedIconButtonColors;
                        z4 = z3;
                        rg3Var3 = rg3Var2;
                        iwVar4 = iwVar3;
                        gh2Var4 = gh2Var3;
                    } else {
                        kk0Var2.V();
                        kk0Var = kk0Var2;
                        cVar3 = cVar2;
                        z4 = z2;
                        rg3Var3 = outlinedShape;
                        dl1Var2 = dl1VarOutlinedIconButtonColors;
                        iwVar4 = iwVar2;
                        gh2Var4 = gh2Var2;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new ol1(je1Var, cVar3, z4, rg3Var3, dl1Var2, iwVar4, gh2Var4, ne1Var, i, i2));
                    }
                }
                i3 |= 1572864;
                gh2Var2 = gh2Var;
                if ((i2 & Uuid.SIZE_BITS) != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    if (kk0Var2.j(ne1Var)) {
                        i8 = 8388608;
                    } else {
                        i8 = 4194304;
                    }
                    i3 |= i8;
                }
                if ((4793491 & i3) == 4793490) {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        i9 = i2 & 8;
                        el1Var = el1.a;
                        if (i9 != 0) {
                            i3 &= -7169;
                            outlinedShape = el1Var.getOutlinedShape(kk0Var2, 6);
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            dl1VarOutlinedIconButtonColors = el1Var.outlinedIconButtonColors(kk0Var2, 6);
                        }
                        if ((i2 & 32) != 0) {
                            iw iwVarOutlinedIconButtonBorder2 = el1Var.outlinedIconButtonBorder(z2, kk0Var2, ((i3 >> 6) & 14) | 48);
                            i3 &= -458753;
                            iwVar2 = iwVarOutlinedIconButtonBorder2;
                        }
                        if (i6 != 0) {
                            gh2Var3 = null;
                            z3 = z2;
                            rg3Var2 = outlinedShape;
                            iwVar3 = iwVar2;
                        } else {
                            z3 = z2;
                            iwVar3 = iwVar2;
                            gh2Var3 = gh2Var2;
                            rg3Var2 = outlinedShape;
                        }
                    } else {
                        if (i11 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        i9 = i2 & 8;
                        el1Var = el1.a;
                        if (i9 != 0) {
                            i3 &= -7169;
                            outlinedShape = el1Var.getOutlinedShape(kk0Var2, 6);
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            dl1VarOutlinedIconButtonColors = el1Var.outlinedIconButtonColors(kk0Var2, 6);
                        }
                        if ((i2 & 32) != 0) {
                            iw iwVarOutlinedIconButtonBorder3 = el1Var.outlinedIconButtonBorder(z2, kk0Var2, ((i3 >> 6) & 14) | 48);
                            i3 &= -458753;
                            iwVar2 = iwVarOutlinedIconButtonBorder3;
                        }
                        if (i6 != 0) {
                            gh2Var3 = null;
                            z3 = z2;
                            rg3Var2 = outlinedShape;
                            iwVar3 = iwVar2;
                        } else {
                            z3 = z2;
                            iwVar3 = iwVar2;
                            gh2Var3 = gh2Var2;
                            rg3Var2 = outlinedShape;
                        }
                    }
                    kk0Var2.s();
                    c cVarB3 = we3.b(cVar3, false, fl1.n);
                    if (z3) {
                        j = dl1VarOutlinedIconButtonColors.a;
                    } else {
                        j = dl1VarOutlinedIconButtonColors.c;
                    }
                    long j7 = j;
                    if (z3) {
                        j2 = dl1VarOutlinedIconButtonColors.b;
                    } else {
                        j2 = dl1VarOutlinedIconButtonColors.d;
                    }
                    long j8 = j2;
                    int i18 = i3 & 8078;
                    int i19 = i3 << 9;
                    kk0Var = kk0Var2;
                    hq3.m213xde3417d4(je1Var2, cVarB3, z3, rg3Var2, j7, j8, 0.0f, 0.0f, iwVar3, gh2Var3, zg0.rememberComposableLambda(582332538, true, new nl1(ne1Var), kk0Var2, 54), kk0Var, i18 | (234881024 & i19) | (i19 & 1879048192), 6, 192);
                    dl1Var2 = dl1VarOutlinedIconButtonColors;
                    z4 = z3;
                    rg3Var3 = rg3Var2;
                    iwVar4 = iwVar3;
                    gh2Var4 = gh2Var3;
                } else {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        i9 = i2 & 8;
                        el1Var = el1.a;
                        if (i9 != 0) {
                            i3 &= -7169;
                            outlinedShape = el1Var.getOutlinedShape(kk0Var2, 6);
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            dl1VarOutlinedIconButtonColors = el1Var.outlinedIconButtonColors(kk0Var2, 6);
                        }
                        if ((i2 & 32) != 0) {
                            iw iwVarOutlinedIconButtonBorder4 = el1Var.outlinedIconButtonBorder(z2, kk0Var2, ((i3 >> 6) & 14) | 48);
                            i3 &= -458753;
                            iwVar2 = iwVarOutlinedIconButtonBorder4;
                        }
                        if (i6 != 0) {
                            gh2Var3 = null;
                            z3 = z2;
                            rg3Var2 = outlinedShape;
                            iwVar3 = iwVar2;
                        } else {
                            z3 = z2;
                            iwVar3 = iwVar2;
                            gh2Var3 = gh2Var2;
                            rg3Var2 = outlinedShape;
                        }
                    } else {
                        if (i11 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        i9 = i2 & 8;
                        el1Var = el1.a;
                        if (i9 != 0) {
                            i3 &= -7169;
                            outlinedShape = el1Var.getOutlinedShape(kk0Var2, 6);
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            dl1VarOutlinedIconButtonColors = el1Var.outlinedIconButtonColors(kk0Var2, 6);
                        }
                        if ((i2 & 32) != 0) {
                            iw iwVarOutlinedIconButtonBorder5 = el1Var.outlinedIconButtonBorder(z2, kk0Var2, ((i3 >> 6) & 14) | 48);
                            i3 &= -458753;
                            iwVar2 = iwVarOutlinedIconButtonBorder5;
                        }
                        if (i6 != 0) {
                            gh2Var3 = null;
                            z3 = z2;
                            rg3Var2 = outlinedShape;
                            iwVar3 = iwVar2;
                        } else {
                            z3 = z2;
                            iwVar3 = iwVar2;
                            gh2Var3 = gh2Var2;
                            rg3Var2 = outlinedShape;
                        }
                    }
                    kk0Var2.s();
                    c cVarB4 = we3.b(cVar3, false, fl1.n);
                    if (z3) {
                        j = dl1VarOutlinedIconButtonColors.a;
                    } else {
                        j = dl1VarOutlinedIconButtonColors.c;
                    }
                    long j9 = j;
                    if (z3) {
                        j2 = dl1VarOutlinedIconButtonColors.b;
                    } else {
                        j2 = dl1VarOutlinedIconButtonColors.d;
                    }
                    long j10 = j2;
                    int i110 = i3 & 8078;
                    int i111 = i3 << 9;
                    kk0Var = kk0Var2;
                    hq3.m213xde3417d4(je1Var2, cVarB4, z3, rg3Var2, j9, j10, 0.0f, 0.0f, iwVar3, gh2Var3, zg0.rememberComposableLambda(582332538, true, new nl1(ne1Var), kk0Var2, 54), kk0Var, i110 | (234881024 & i111) | (i111 & 1879048192), 6, 192);
                    dl1Var2 = dl1VarOutlinedIconButtonColors;
                    z4 = z3;
                    rg3Var3 = rg3Var2;
                    iwVar4 = iwVar3;
                    gh2Var4 = gh2Var3;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new ol1(je1Var, cVar3, z4, rg3Var3, dl1Var2, iwVar4, gh2Var4, ne1Var, i, i2));
                }
            }
            i3 |= 384;
            z2 = z;
            if ((i & 3072) == 0) {
                if ((i2 & 8) == 0) {
                    outlinedShape = rg3Var;
                    if (kk0Var2.h(outlinedShape)) {
                    }
                    i3 |= i12;
                } else {
                    outlinedShape = rg3Var;
                }
                i3 |= i12;
            } else {
                outlinedShape = rg3Var;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    dl1VarOutlinedIconButtonColors = dl1Var;
                    if (kk0Var2.h(dl1VarOutlinedIconButtonColors)) {
                        i10 = 16384;
                    }
                    i3 |= i10;
                } else {
                    dl1VarOutlinedIconButtonColors = dl1Var;
                }
                i10 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                i3 |= i10;
            } else {
                dl1VarOutlinedIconButtonColors = dl1Var;
            }
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0) {
                    iwVar2 = iwVar;
                    if (kk0Var2.h(iwVar2)) {
                    }
                    i3 |= i13;
                } else {
                    iwVar2 = iwVar;
                }
                i3 |= i13;
            } else {
                iwVar2 = iwVar;
            }
            i6 = i2 & 64;
            if (i6 != 0) {
                if ((1572864 & i) == 0) {
                    gh2Var2 = gh2Var;
                    if (kk0Var2.h(gh2Var2)) {
                        i7 = 1048576;
                    } else {
                        i7 = 524288;
                    }
                    i3 |= i7;
                }
                if ((i2 & Uuid.SIZE_BITS) != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    if (kk0Var2.j(ne1Var)) {
                        i8 = 8388608;
                    } else {
                        i8 = 4194304;
                    }
                    i3 |= i8;
                }
                if ((4793491 & i3) == 4793490) {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        i9 = i2 & 8;
                        el1Var = el1.a;
                        if (i9 != 0) {
                            i3 &= -7169;
                            outlinedShape = el1Var.getOutlinedShape(kk0Var2, 6);
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            dl1VarOutlinedIconButtonColors = el1Var.outlinedIconButtonColors(kk0Var2, 6);
                        }
                        if ((i2 & 32) != 0) {
                            iw iwVarOutlinedIconButtonBorder6 = el1Var.outlinedIconButtonBorder(z2, kk0Var2, ((i3 >> 6) & 14) | 48);
                            i3 &= -458753;
                            iwVar2 = iwVarOutlinedIconButtonBorder6;
                        }
                        if (i6 != 0) {
                            gh2Var3 = null;
                            z3 = z2;
                            rg3Var2 = outlinedShape;
                            iwVar3 = iwVar2;
                        } else {
                            z3 = z2;
                            iwVar3 = iwVar2;
                            gh2Var3 = gh2Var2;
                            rg3Var2 = outlinedShape;
                        }
                    } else {
                        if (i11 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        i9 = i2 & 8;
                        el1Var = el1.a;
                        if (i9 != 0) {
                            i3 &= -7169;
                            outlinedShape = el1Var.getOutlinedShape(kk0Var2, 6);
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            dl1VarOutlinedIconButtonColors = el1Var.outlinedIconButtonColors(kk0Var2, 6);
                        }
                        if ((i2 & 32) != 0) {
                            iw iwVarOutlinedIconButtonBorder7 = el1Var.outlinedIconButtonBorder(z2, kk0Var2, ((i3 >> 6) & 14) | 48);
                            i3 &= -458753;
                            iwVar2 = iwVarOutlinedIconButtonBorder7;
                        }
                        if (i6 != 0) {
                            gh2Var3 = null;
                            z3 = z2;
                            rg3Var2 = outlinedShape;
                            iwVar3 = iwVar2;
                        } else {
                            z3 = z2;
                            iwVar3 = iwVar2;
                            gh2Var3 = gh2Var2;
                            rg3Var2 = outlinedShape;
                        }
                    }
                    kk0Var2.s();
                    c cVarB5 = we3.b(cVar3, false, fl1.n);
                    if (z3) {
                        j = dl1VarOutlinedIconButtonColors.a;
                    } else {
                        j = dl1VarOutlinedIconButtonColors.c;
                    }
                    long j11 = j;
                    if (z3) {
                        j2 = dl1VarOutlinedIconButtonColors.b;
                    } else {
                        j2 = dl1VarOutlinedIconButtonColors.d;
                    }
                    long j12 = j2;
                    int i112 = i3 & 8078;
                    int i113 = i3 << 9;
                    kk0Var = kk0Var2;
                    hq3.m213xde3417d4(je1Var2, cVarB5, z3, rg3Var2, j11, j12, 0.0f, 0.0f, iwVar3, gh2Var3, zg0.rememberComposableLambda(582332538, true, new nl1(ne1Var), kk0Var2, 54), kk0Var, i112 | (234881024 & i113) | (i113 & 1879048192), 6, 192);
                    dl1Var2 = dl1VarOutlinedIconButtonColors;
                    z4 = z3;
                    rg3Var3 = rg3Var2;
                    iwVar4 = iwVar3;
                    gh2Var4 = gh2Var3;
                } else {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        i9 = i2 & 8;
                        el1Var = el1.a;
                        if (i9 != 0) {
                            i3 &= -7169;
                            outlinedShape = el1Var.getOutlinedShape(kk0Var2, 6);
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            dl1VarOutlinedIconButtonColors = el1Var.outlinedIconButtonColors(kk0Var2, 6);
                        }
                        if ((i2 & 32) != 0) {
                            iw iwVarOutlinedIconButtonBorder8 = el1Var.outlinedIconButtonBorder(z2, kk0Var2, ((i3 >> 6) & 14) | 48);
                            i3 &= -458753;
                            iwVar2 = iwVarOutlinedIconButtonBorder8;
                        }
                        if (i6 != 0) {
                            gh2Var3 = null;
                            z3 = z2;
                            rg3Var2 = outlinedShape;
                            iwVar3 = iwVar2;
                        } else {
                            z3 = z2;
                            iwVar3 = iwVar2;
                            gh2Var3 = gh2Var2;
                            rg3Var2 = outlinedShape;
                        }
                    } else {
                        if (i11 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        i9 = i2 & 8;
                        el1Var = el1.a;
                        if (i9 != 0) {
                            i3 &= -7169;
                            outlinedShape = el1Var.getOutlinedShape(kk0Var2, 6);
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            dl1VarOutlinedIconButtonColors = el1Var.outlinedIconButtonColors(kk0Var2, 6);
                        }
                        if ((i2 & 32) != 0) {
                            iw iwVarOutlinedIconButtonBorder9 = el1Var.outlinedIconButtonBorder(z2, kk0Var2, ((i3 >> 6) & 14) | 48);
                            i3 &= -458753;
                            iwVar2 = iwVarOutlinedIconButtonBorder9;
                        }
                        if (i6 != 0) {
                            gh2Var3 = null;
                            z3 = z2;
                            rg3Var2 = outlinedShape;
                            iwVar3 = iwVar2;
                        } else {
                            z3 = z2;
                            iwVar3 = iwVar2;
                            gh2Var3 = gh2Var2;
                            rg3Var2 = outlinedShape;
                        }
                    }
                    kk0Var2.s();
                    c cVarB6 = we3.b(cVar3, false, fl1.n);
                    if (z3) {
                        j = dl1VarOutlinedIconButtonColors.a;
                    } else {
                        j = dl1VarOutlinedIconButtonColors.c;
                    }
                    long j13 = j;
                    if (z3) {
                        j2 = dl1VarOutlinedIconButtonColors.b;
                    } else {
                        j2 = dl1VarOutlinedIconButtonColors.d;
                    }
                    long j14 = j2;
                    int i114 = i3 & 8078;
                    int i115 = i3 << 9;
                    kk0Var = kk0Var2;
                    hq3.m213xde3417d4(je1Var2, cVarB6, z3, rg3Var2, j13, j14, 0.0f, 0.0f, iwVar3, gh2Var3, zg0.rememberComposableLambda(582332538, true, new nl1(ne1Var), kk0Var2, 54), kk0Var, i114 | (234881024 & i115) | (i115 & 1879048192), 6, 192);
                    dl1Var2 = dl1VarOutlinedIconButtonColors;
                    z4 = z3;
                    rg3Var3 = rg3Var2;
                    iwVar4 = iwVar3;
                    gh2Var4 = gh2Var3;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new ol1(je1Var, cVar3, z4, rg3Var3, dl1Var2, iwVar4, gh2Var4, ne1Var, i, i2));
                }
            }
            i3 |= 1572864;
            gh2Var2 = gh2Var;
            if ((i2 & Uuid.SIZE_BITS) != 0) {
                i3 |= 12582912;
            } else if ((i & 12582912) == 0) {
                if (kk0Var2.j(ne1Var)) {
                    i8 = 8388608;
                } else {
                    i8 = 4194304;
                }
                i3 |= i8;
            }
            if ((4793491 & i3) == 4793490) {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    i9 = i2 & 8;
                    el1Var = el1.a;
                    if (i9 != 0) {
                        i3 &= -7169;
                        outlinedShape = el1Var.getOutlinedShape(kk0Var2, 6);
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        dl1VarOutlinedIconButtonColors = el1Var.outlinedIconButtonColors(kk0Var2, 6);
                    }
                    if ((i2 & 32) != 0) {
                        iw iwVarOutlinedIconButtonBorder10 = el1Var.outlinedIconButtonBorder(z2, kk0Var2, ((i3 >> 6) & 14) | 48);
                        i3 &= -458753;
                        iwVar2 = iwVarOutlinedIconButtonBorder10;
                    }
                    if (i6 != 0) {
                        gh2Var3 = null;
                        z3 = z2;
                        rg3Var2 = outlinedShape;
                        iwVar3 = iwVar2;
                    } else {
                        z3 = z2;
                        iwVar3 = iwVar2;
                        gh2Var3 = gh2Var2;
                        rg3Var2 = outlinedShape;
                    }
                } else {
                    if (i11 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    i9 = i2 & 8;
                    el1Var = el1.a;
                    if (i9 != 0) {
                        i3 &= -7169;
                        outlinedShape = el1Var.getOutlinedShape(kk0Var2, 6);
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        dl1VarOutlinedIconButtonColors = el1Var.outlinedIconButtonColors(kk0Var2, 6);
                    }
                    if ((i2 & 32) != 0) {
                        iw iwVarOutlinedIconButtonBorder11 = el1Var.outlinedIconButtonBorder(z2, kk0Var2, ((i3 >> 6) & 14) | 48);
                        i3 &= -458753;
                        iwVar2 = iwVarOutlinedIconButtonBorder11;
                    }
                    if (i6 != 0) {
                        gh2Var3 = null;
                        z3 = z2;
                        rg3Var2 = outlinedShape;
                        iwVar3 = iwVar2;
                    } else {
                        z3 = z2;
                        iwVar3 = iwVar2;
                        gh2Var3 = gh2Var2;
                        rg3Var2 = outlinedShape;
                    }
                }
                kk0Var2.s();
                c cVarB7 = we3.b(cVar3, false, fl1.n);
                if (z3) {
                    j = dl1VarOutlinedIconButtonColors.a;
                } else {
                    j = dl1VarOutlinedIconButtonColors.c;
                }
                long j15 = j;
                if (z3) {
                    j2 = dl1VarOutlinedIconButtonColors.b;
                } else {
                    j2 = dl1VarOutlinedIconButtonColors.d;
                }
                long j16 = j2;
                int i116 = i3 & 8078;
                int i117 = i3 << 9;
                kk0Var = kk0Var2;
                hq3.m213xde3417d4(je1Var2, cVarB7, z3, rg3Var2, j15, j16, 0.0f, 0.0f, iwVar3, gh2Var3, zg0.rememberComposableLambda(582332538, true, new nl1(ne1Var), kk0Var2, 54), kk0Var, i116 | (234881024 & i117) | (i117 & 1879048192), 6, 192);
                dl1Var2 = dl1VarOutlinedIconButtonColors;
                z4 = z3;
                rg3Var3 = rg3Var2;
                iwVar4 = iwVar3;
                gh2Var4 = gh2Var3;
            } else {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    i9 = i2 & 8;
                    el1Var = el1.a;
                    if (i9 != 0) {
                        i3 &= -7169;
                        outlinedShape = el1Var.getOutlinedShape(kk0Var2, 6);
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        dl1VarOutlinedIconButtonColors = el1Var.outlinedIconButtonColors(kk0Var2, 6);
                    }
                    if ((i2 & 32) != 0) {
                        iw iwVarOutlinedIconButtonBorder12 = el1Var.outlinedIconButtonBorder(z2, kk0Var2, ((i3 >> 6) & 14) | 48);
                        i3 &= -458753;
                        iwVar2 = iwVarOutlinedIconButtonBorder12;
                    }
                    if (i6 != 0) {
                        gh2Var3 = null;
                        z3 = z2;
                        rg3Var2 = outlinedShape;
                        iwVar3 = iwVar2;
                    } else {
                        z3 = z2;
                        iwVar3 = iwVar2;
                        gh2Var3 = gh2Var2;
                        rg3Var2 = outlinedShape;
                    }
                } else {
                    if (i11 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    i9 = i2 & 8;
                    el1Var = el1.a;
                    if (i9 != 0) {
                        i3 &= -7169;
                        outlinedShape = el1Var.getOutlinedShape(kk0Var2, 6);
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        dl1VarOutlinedIconButtonColors = el1Var.outlinedIconButtonColors(kk0Var2, 6);
                    }
                    if ((i2 & 32) != 0) {
                        iw iwVarOutlinedIconButtonBorder13 = el1Var.outlinedIconButtonBorder(z2, kk0Var2, ((i3 >> 6) & 14) | 48);
                        i3 &= -458753;
                        iwVar2 = iwVarOutlinedIconButtonBorder13;
                    }
                    if (i6 != 0) {
                        gh2Var3 = null;
                        z3 = z2;
                        rg3Var2 = outlinedShape;
                        iwVar3 = iwVar2;
                    } else {
                        z3 = z2;
                        iwVar3 = iwVar2;
                        gh2Var3 = gh2Var2;
                        rg3Var2 = outlinedShape;
                    }
                }
                kk0Var2.s();
                c cVarB8 = we3.b(cVar3, false, fl1.n);
                if (z3) {
                    j = dl1VarOutlinedIconButtonColors.a;
                } else {
                    j = dl1VarOutlinedIconButtonColors.c;
                }
                long j17 = j;
                if (z3) {
                    j2 = dl1VarOutlinedIconButtonColors.b;
                } else {
                    j2 = dl1VarOutlinedIconButtonColors.d;
                }
                long j18 = j2;
                int i118 = i3 & 8078;
                int i119 = i3 << 9;
                kk0Var = kk0Var2;
                hq3.m213xde3417d4(je1Var2, cVarB8, z3, rg3Var2, j17, j18, 0.0f, 0.0f, iwVar3, gh2Var3, zg0.rememberComposableLambda(582332538, true, new nl1(ne1Var), kk0Var2, 54), kk0Var, i118 | (234881024 & i119) | (i119 & 1879048192), 6, 192);
                dl1Var2 = dl1VarOutlinedIconButtonColors;
                z4 = z3;
                rg3Var3 = rg3Var2;
                iwVar4 = iwVar3;
                gh2Var4 = gh2Var3;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new ol1(je1Var, cVar3, z4, rg3Var3, dl1Var2, iwVar4, gh2Var4, ne1Var, i, i2));
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
                    outlinedShape = rg3Var;
                    if (kk0Var2.h(outlinedShape)) {
                    }
                    i3 |= i12;
                } else {
                    outlinedShape = rg3Var;
                }
                i3 |= i12;
            } else {
                outlinedShape = rg3Var;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    dl1VarOutlinedIconButtonColors = dl1Var;
                    if (kk0Var2.h(dl1VarOutlinedIconButtonColors)) {
                        i10 = 16384;
                    }
                    i3 |= i10;
                } else {
                    dl1VarOutlinedIconButtonColors = dl1Var;
                }
                i10 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                i3 |= i10;
            } else {
                dl1VarOutlinedIconButtonColors = dl1Var;
            }
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0) {
                    iwVar2 = iwVar;
                    if (kk0Var2.h(iwVar2)) {
                    }
                    i3 |= i13;
                } else {
                    iwVar2 = iwVar;
                }
                i3 |= i13;
            } else {
                iwVar2 = iwVar;
            }
            i6 = i2 & 64;
            if (i6 != 0) {
                if ((1572864 & i) == 0) {
                    gh2Var2 = gh2Var;
                    if (kk0Var2.h(gh2Var2)) {
                        i7 = 1048576;
                    } else {
                        i7 = 524288;
                    }
                    i3 |= i7;
                }
                if ((i2 & Uuid.SIZE_BITS) != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    if (kk0Var2.j(ne1Var)) {
                        i8 = 8388608;
                    } else {
                        i8 = 4194304;
                    }
                    i3 |= i8;
                }
                if ((4793491 & i3) == 4793490) {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        i9 = i2 & 8;
                        el1Var = el1.a;
                        if (i9 != 0) {
                            i3 &= -7169;
                            outlinedShape = el1Var.getOutlinedShape(kk0Var2, 6);
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            dl1VarOutlinedIconButtonColors = el1Var.outlinedIconButtonColors(kk0Var2, 6);
                        }
                        if ((i2 & 32) != 0) {
                            iw iwVarOutlinedIconButtonBorder14 = el1Var.outlinedIconButtonBorder(z2, kk0Var2, ((i3 >> 6) & 14) | 48);
                            i3 &= -458753;
                            iwVar2 = iwVarOutlinedIconButtonBorder14;
                        }
                        if (i6 != 0) {
                            gh2Var3 = null;
                            z3 = z2;
                            rg3Var2 = outlinedShape;
                            iwVar3 = iwVar2;
                        } else {
                            z3 = z2;
                            iwVar3 = iwVar2;
                            gh2Var3 = gh2Var2;
                            rg3Var2 = outlinedShape;
                        }
                    } else {
                        if (i11 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        i9 = i2 & 8;
                        el1Var = el1.a;
                        if (i9 != 0) {
                            i3 &= -7169;
                            outlinedShape = el1Var.getOutlinedShape(kk0Var2, 6);
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            dl1VarOutlinedIconButtonColors = el1Var.outlinedIconButtonColors(kk0Var2, 6);
                        }
                        if ((i2 & 32) != 0) {
                            iw iwVarOutlinedIconButtonBorder15 = el1Var.outlinedIconButtonBorder(z2, kk0Var2, ((i3 >> 6) & 14) | 48);
                            i3 &= -458753;
                            iwVar2 = iwVarOutlinedIconButtonBorder15;
                        }
                        if (i6 != 0) {
                            gh2Var3 = null;
                            z3 = z2;
                            rg3Var2 = outlinedShape;
                            iwVar3 = iwVar2;
                        } else {
                            z3 = z2;
                            iwVar3 = iwVar2;
                            gh2Var3 = gh2Var2;
                            rg3Var2 = outlinedShape;
                        }
                    }
                    kk0Var2.s();
                    c cVarB9 = we3.b(cVar3, false, fl1.n);
                    if (z3) {
                        j = dl1VarOutlinedIconButtonColors.a;
                    } else {
                        j = dl1VarOutlinedIconButtonColors.c;
                    }
                    long j19 = j;
                    if (z3) {
                        j2 = dl1VarOutlinedIconButtonColors.b;
                    } else {
                        j2 = dl1VarOutlinedIconButtonColors.d;
                    }
                    long j110 = j2;
                    int i1110 = i3 & 8078;
                    int i1111 = i3 << 9;
                    kk0Var = kk0Var2;
                    hq3.m213xde3417d4(je1Var2, cVarB9, z3, rg3Var2, j19, j110, 0.0f, 0.0f, iwVar3, gh2Var3, zg0.rememberComposableLambda(582332538, true, new nl1(ne1Var), kk0Var2, 54), kk0Var, i1110 | (234881024 & i1111) | (i1111 & 1879048192), 6, 192);
                    dl1Var2 = dl1VarOutlinedIconButtonColors;
                    z4 = z3;
                    rg3Var3 = rg3Var2;
                    iwVar4 = iwVar3;
                    gh2Var4 = gh2Var3;
                } else {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        i9 = i2 & 8;
                        el1Var = el1.a;
                        if (i9 != 0) {
                            i3 &= -7169;
                            outlinedShape = el1Var.getOutlinedShape(kk0Var2, 6);
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            dl1VarOutlinedIconButtonColors = el1Var.outlinedIconButtonColors(kk0Var2, 6);
                        }
                        if ((i2 & 32) != 0) {
                            iw iwVarOutlinedIconButtonBorder16 = el1Var.outlinedIconButtonBorder(z2, kk0Var2, ((i3 >> 6) & 14) | 48);
                            i3 &= -458753;
                            iwVar2 = iwVarOutlinedIconButtonBorder16;
                        }
                        if (i6 != 0) {
                            gh2Var3 = null;
                            z3 = z2;
                            rg3Var2 = outlinedShape;
                            iwVar3 = iwVar2;
                        } else {
                            z3 = z2;
                            iwVar3 = iwVar2;
                            gh2Var3 = gh2Var2;
                            rg3Var2 = outlinedShape;
                        }
                    } else {
                        if (i11 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        i9 = i2 & 8;
                        el1Var = el1.a;
                        if (i9 != 0) {
                            i3 &= -7169;
                            outlinedShape = el1Var.getOutlinedShape(kk0Var2, 6);
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            dl1VarOutlinedIconButtonColors = el1Var.outlinedIconButtonColors(kk0Var2, 6);
                        }
                        if ((i2 & 32) != 0) {
                            iw iwVarOutlinedIconButtonBorder17 = el1Var.outlinedIconButtonBorder(z2, kk0Var2, ((i3 >> 6) & 14) | 48);
                            i3 &= -458753;
                            iwVar2 = iwVarOutlinedIconButtonBorder17;
                        }
                        if (i6 != 0) {
                            gh2Var3 = null;
                            z3 = z2;
                            rg3Var2 = outlinedShape;
                            iwVar3 = iwVar2;
                        } else {
                            z3 = z2;
                            iwVar3 = iwVar2;
                            gh2Var3 = gh2Var2;
                            rg3Var2 = outlinedShape;
                        }
                    }
                    kk0Var2.s();
                    c cVarB10 = we3.b(cVar3, false, fl1.n);
                    if (z3) {
                        j = dl1VarOutlinedIconButtonColors.a;
                    } else {
                        j = dl1VarOutlinedIconButtonColors.c;
                    }
                    long j111 = j;
                    if (z3) {
                        j2 = dl1VarOutlinedIconButtonColors.b;
                    } else {
                        j2 = dl1VarOutlinedIconButtonColors.d;
                    }
                    long j112 = j2;
                    int i1112 = i3 & 8078;
                    int i1113 = i3 << 9;
                    kk0Var = kk0Var2;
                    hq3.m213xde3417d4(je1Var2, cVarB10, z3, rg3Var2, j111, j112, 0.0f, 0.0f, iwVar3, gh2Var3, zg0.rememberComposableLambda(582332538, true, new nl1(ne1Var), kk0Var2, 54), kk0Var, i1112 | (234881024 & i1113) | (i1113 & 1879048192), 6, 192);
                    dl1Var2 = dl1VarOutlinedIconButtonColors;
                    z4 = z3;
                    rg3Var3 = rg3Var2;
                    iwVar4 = iwVar3;
                    gh2Var4 = gh2Var3;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new ol1(je1Var, cVar3, z4, rg3Var3, dl1Var2, iwVar4, gh2Var4, ne1Var, i, i2));
                }
            }
            i3 |= 1572864;
            gh2Var2 = gh2Var;
            if ((i2 & Uuid.SIZE_BITS) != 0) {
                i3 |= 12582912;
            } else if ((i & 12582912) == 0) {
                if (kk0Var2.j(ne1Var)) {
                    i8 = 8388608;
                } else {
                    i8 = 4194304;
                }
                i3 |= i8;
            }
            if ((4793491 & i3) == 4793490) {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    i9 = i2 & 8;
                    el1Var = el1.a;
                    if (i9 != 0) {
                        i3 &= -7169;
                        outlinedShape = el1Var.getOutlinedShape(kk0Var2, 6);
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        dl1VarOutlinedIconButtonColors = el1Var.outlinedIconButtonColors(kk0Var2, 6);
                    }
                    if ((i2 & 32) != 0) {
                        iw iwVarOutlinedIconButtonBorder18 = el1Var.outlinedIconButtonBorder(z2, kk0Var2, ((i3 >> 6) & 14) | 48);
                        i3 &= -458753;
                        iwVar2 = iwVarOutlinedIconButtonBorder18;
                    }
                    if (i6 != 0) {
                        gh2Var3 = null;
                        z3 = z2;
                        rg3Var2 = outlinedShape;
                        iwVar3 = iwVar2;
                    } else {
                        z3 = z2;
                        iwVar3 = iwVar2;
                        gh2Var3 = gh2Var2;
                        rg3Var2 = outlinedShape;
                    }
                } else {
                    if (i11 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    i9 = i2 & 8;
                    el1Var = el1.a;
                    if (i9 != 0) {
                        i3 &= -7169;
                        outlinedShape = el1Var.getOutlinedShape(kk0Var2, 6);
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        dl1VarOutlinedIconButtonColors = el1Var.outlinedIconButtonColors(kk0Var2, 6);
                    }
                    if ((i2 & 32) != 0) {
                        iw iwVarOutlinedIconButtonBorder19 = el1Var.outlinedIconButtonBorder(z2, kk0Var2, ((i3 >> 6) & 14) | 48);
                        i3 &= -458753;
                        iwVar2 = iwVarOutlinedIconButtonBorder19;
                    }
                    if (i6 != 0) {
                        gh2Var3 = null;
                        z3 = z2;
                        rg3Var2 = outlinedShape;
                        iwVar3 = iwVar2;
                    } else {
                        z3 = z2;
                        iwVar3 = iwVar2;
                        gh2Var3 = gh2Var2;
                        rg3Var2 = outlinedShape;
                    }
                }
                kk0Var2.s();
                c cVarB11 = we3.b(cVar3, false, fl1.n);
                if (z3) {
                    j = dl1VarOutlinedIconButtonColors.a;
                } else {
                    j = dl1VarOutlinedIconButtonColors.c;
                }
                long j113 = j;
                if (z3) {
                    j2 = dl1VarOutlinedIconButtonColors.b;
                } else {
                    j2 = dl1VarOutlinedIconButtonColors.d;
                }
                long j114 = j2;
                int i1114 = i3 & 8078;
                int i1115 = i3 << 9;
                kk0Var = kk0Var2;
                hq3.m213xde3417d4(je1Var2, cVarB11, z3, rg3Var2, j113, j114, 0.0f, 0.0f, iwVar3, gh2Var3, zg0.rememberComposableLambda(582332538, true, new nl1(ne1Var), kk0Var2, 54), kk0Var, i1114 | (234881024 & i1115) | (i1115 & 1879048192), 6, 192);
                dl1Var2 = dl1VarOutlinedIconButtonColors;
                z4 = z3;
                rg3Var3 = rg3Var2;
                iwVar4 = iwVar3;
                gh2Var4 = gh2Var3;
            } else {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    i9 = i2 & 8;
                    el1Var = el1.a;
                    if (i9 != 0) {
                        i3 &= -7169;
                        outlinedShape = el1Var.getOutlinedShape(kk0Var2, 6);
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        dl1VarOutlinedIconButtonColors = el1Var.outlinedIconButtonColors(kk0Var2, 6);
                    }
                    if ((i2 & 32) != 0) {
                        iw iwVarOutlinedIconButtonBorder110 = el1Var.outlinedIconButtonBorder(z2, kk0Var2, ((i3 >> 6) & 14) | 48);
                        i3 &= -458753;
                        iwVar2 = iwVarOutlinedIconButtonBorder110;
                    }
                    if (i6 != 0) {
                        gh2Var3 = null;
                        z3 = z2;
                        rg3Var2 = outlinedShape;
                        iwVar3 = iwVar2;
                    } else {
                        z3 = z2;
                        iwVar3 = iwVar2;
                        gh2Var3 = gh2Var2;
                        rg3Var2 = outlinedShape;
                    }
                } else {
                    if (i11 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    i9 = i2 & 8;
                    el1Var = el1.a;
                    if (i9 != 0) {
                        i3 &= -7169;
                        outlinedShape = el1Var.getOutlinedShape(kk0Var2, 6);
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        dl1VarOutlinedIconButtonColors = el1Var.outlinedIconButtonColors(kk0Var2, 6);
                    }
                    if ((i2 & 32) != 0) {
                        iw iwVarOutlinedIconButtonBorder111 = el1Var.outlinedIconButtonBorder(z2, kk0Var2, ((i3 >> 6) & 14) | 48);
                        i3 &= -458753;
                        iwVar2 = iwVarOutlinedIconButtonBorder111;
                    }
                    if (i6 != 0) {
                        gh2Var3 = null;
                        z3 = z2;
                        rg3Var2 = outlinedShape;
                        iwVar3 = iwVar2;
                    } else {
                        z3 = z2;
                        iwVar3 = iwVar2;
                        gh2Var3 = gh2Var2;
                        rg3Var2 = outlinedShape;
                    }
                }
                kk0Var2.s();
                c cVarB12 = we3.b(cVar3, false, fl1.n);
                if (z3) {
                    j = dl1VarOutlinedIconButtonColors.a;
                } else {
                    j = dl1VarOutlinedIconButtonColors.c;
                }
                long j115 = j;
                if (z3) {
                    j2 = dl1VarOutlinedIconButtonColors.b;
                } else {
                    j2 = dl1VarOutlinedIconButtonColors.d;
                }
                long j116 = j2;
                int i1116 = i3 & 8078;
                int i1117 = i3 << 9;
                kk0Var = kk0Var2;
                hq3.m213xde3417d4(je1Var2, cVarB12, z3, rg3Var2, j115, j116, 0.0f, 0.0f, iwVar3, gh2Var3, zg0.rememberComposableLambda(582332538, true, new nl1(ne1Var), kk0Var2, 54), kk0Var, i1116 | (234881024 & i1117) | (i1117 & 1879048192), 6, 192);
                dl1Var2 = dl1VarOutlinedIconButtonColors;
                z4 = z3;
                rg3Var3 = rg3Var2;
                iwVar4 = iwVar3;
                gh2Var4 = gh2Var3;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new ol1(je1Var, cVar3, z4, rg3Var3, dl1Var2, iwVar4, gh2Var4, ne1Var, i, i2));
            }
        }
        i3 |= 384;
        z2 = z;
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                outlinedShape = rg3Var;
                if (kk0Var2.h(outlinedShape)) {
                }
                i3 |= i12;
            } else {
                outlinedShape = rg3Var;
            }
            i3 |= i12;
        } else {
            outlinedShape = rg3Var;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                dl1VarOutlinedIconButtonColors = dl1Var;
                if (kk0Var2.h(dl1VarOutlinedIconButtonColors)) {
                    i10 = 16384;
                }
                i3 |= i10;
            } else {
                dl1VarOutlinedIconButtonColors = dl1Var;
            }
            i10 = ConstantsKt.DEFAULT_BUFFER_SIZE;
            i3 |= i10;
        } else {
            dl1VarOutlinedIconButtonColors = dl1Var;
        }
        if ((196608 & i) == 0) {
            if ((i2 & 32) == 0) {
                iwVar2 = iwVar;
                if (kk0Var2.h(iwVar2)) {
                }
                i3 |= i13;
            } else {
                iwVar2 = iwVar;
            }
            i3 |= i13;
        } else {
            iwVar2 = iwVar;
        }
        i6 = i2 & 64;
        if (i6 != 0) {
            if ((1572864 & i) == 0) {
                gh2Var2 = gh2Var;
                if (kk0Var2.h(gh2Var2)) {
                    i7 = 1048576;
                } else {
                    i7 = 524288;
                }
                i3 |= i7;
            }
            if ((i2 & Uuid.SIZE_BITS) != 0) {
                i3 |= 12582912;
            } else if ((i & 12582912) == 0) {
                if (kk0Var2.j(ne1Var)) {
                    i8 = 8388608;
                } else {
                    i8 = 4194304;
                }
                i3 |= i8;
            }
            if ((4793491 & i3) == 4793490) {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    i9 = i2 & 8;
                    el1Var = el1.a;
                    if (i9 != 0) {
                        i3 &= -7169;
                        outlinedShape = el1Var.getOutlinedShape(kk0Var2, 6);
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        dl1VarOutlinedIconButtonColors = el1Var.outlinedIconButtonColors(kk0Var2, 6);
                    }
                    if ((i2 & 32) != 0) {
                        iw iwVarOutlinedIconButtonBorder112 = el1Var.outlinedIconButtonBorder(z2, kk0Var2, ((i3 >> 6) & 14) | 48);
                        i3 &= -458753;
                        iwVar2 = iwVarOutlinedIconButtonBorder112;
                    }
                    if (i6 != 0) {
                        gh2Var3 = null;
                        z3 = z2;
                        rg3Var2 = outlinedShape;
                        iwVar3 = iwVar2;
                    } else {
                        z3 = z2;
                        iwVar3 = iwVar2;
                        gh2Var3 = gh2Var2;
                        rg3Var2 = outlinedShape;
                    }
                } else {
                    if (i11 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    i9 = i2 & 8;
                    el1Var = el1.a;
                    if (i9 != 0) {
                        i3 &= -7169;
                        outlinedShape = el1Var.getOutlinedShape(kk0Var2, 6);
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        dl1VarOutlinedIconButtonColors = el1Var.outlinedIconButtonColors(kk0Var2, 6);
                    }
                    if ((i2 & 32) != 0) {
                        iw iwVarOutlinedIconButtonBorder113 = el1Var.outlinedIconButtonBorder(z2, kk0Var2, ((i3 >> 6) & 14) | 48);
                        i3 &= -458753;
                        iwVar2 = iwVarOutlinedIconButtonBorder113;
                    }
                    if (i6 != 0) {
                        gh2Var3 = null;
                        z3 = z2;
                        rg3Var2 = outlinedShape;
                        iwVar3 = iwVar2;
                    } else {
                        z3 = z2;
                        iwVar3 = iwVar2;
                        gh2Var3 = gh2Var2;
                        rg3Var2 = outlinedShape;
                    }
                }
                kk0Var2.s();
                c cVarB13 = we3.b(cVar3, false, fl1.n);
                if (z3) {
                    j = dl1VarOutlinedIconButtonColors.a;
                } else {
                    j = dl1VarOutlinedIconButtonColors.c;
                }
                long j117 = j;
                if (z3) {
                    j2 = dl1VarOutlinedIconButtonColors.b;
                } else {
                    j2 = dl1VarOutlinedIconButtonColors.d;
                }
                long j118 = j2;
                int i1118 = i3 & 8078;
                int i1119 = i3 << 9;
                kk0Var = kk0Var2;
                hq3.m213xde3417d4(je1Var2, cVarB13, z3, rg3Var2, j117, j118, 0.0f, 0.0f, iwVar3, gh2Var3, zg0.rememberComposableLambda(582332538, true, new nl1(ne1Var), kk0Var2, 54), kk0Var, i1118 | (234881024 & i1119) | (i1119 & 1879048192), 6, 192);
                dl1Var2 = dl1VarOutlinedIconButtonColors;
                z4 = z3;
                rg3Var3 = rg3Var2;
                iwVar4 = iwVar3;
                gh2Var4 = gh2Var3;
            } else {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    i9 = i2 & 8;
                    el1Var = el1.a;
                    if (i9 != 0) {
                        i3 &= -7169;
                        outlinedShape = el1Var.getOutlinedShape(kk0Var2, 6);
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        dl1VarOutlinedIconButtonColors = el1Var.outlinedIconButtonColors(kk0Var2, 6);
                    }
                    if ((i2 & 32) != 0) {
                        iw iwVarOutlinedIconButtonBorder114 = el1Var.outlinedIconButtonBorder(z2, kk0Var2, ((i3 >> 6) & 14) | 48);
                        i3 &= -458753;
                        iwVar2 = iwVarOutlinedIconButtonBorder114;
                    }
                    if (i6 != 0) {
                        gh2Var3 = null;
                        z3 = z2;
                        rg3Var2 = outlinedShape;
                        iwVar3 = iwVar2;
                    } else {
                        z3 = z2;
                        iwVar3 = iwVar2;
                        gh2Var3 = gh2Var2;
                        rg3Var2 = outlinedShape;
                    }
                } else {
                    if (i11 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    i9 = i2 & 8;
                    el1Var = el1.a;
                    if (i9 != 0) {
                        i3 &= -7169;
                        outlinedShape = el1Var.getOutlinedShape(kk0Var2, 6);
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        dl1VarOutlinedIconButtonColors = el1Var.outlinedIconButtonColors(kk0Var2, 6);
                    }
                    if ((i2 & 32) != 0) {
                        iw iwVarOutlinedIconButtonBorder115 = el1Var.outlinedIconButtonBorder(z2, kk0Var2, ((i3 >> 6) & 14) | 48);
                        i3 &= -458753;
                        iwVar2 = iwVarOutlinedIconButtonBorder115;
                    }
                    if (i6 != 0) {
                        gh2Var3 = null;
                        z3 = z2;
                        rg3Var2 = outlinedShape;
                        iwVar3 = iwVar2;
                    } else {
                        z3 = z2;
                        iwVar3 = iwVar2;
                        gh2Var3 = gh2Var2;
                        rg3Var2 = outlinedShape;
                    }
                }
                kk0Var2.s();
                c cVarB14 = we3.b(cVar3, false, fl1.n);
                if (z3) {
                    j = dl1VarOutlinedIconButtonColors.a;
                } else {
                    j = dl1VarOutlinedIconButtonColors.c;
                }
                long j119 = j;
                if (z3) {
                    j2 = dl1VarOutlinedIconButtonColors.b;
                } else {
                    j2 = dl1VarOutlinedIconButtonColors.d;
                }
                long j1110 = j2;
                int i11110 = i3 & 8078;
                int i11111 = i3 << 9;
                kk0Var = kk0Var2;
                hq3.m213xde3417d4(je1Var2, cVarB14, z3, rg3Var2, j119, j1110, 0.0f, 0.0f, iwVar3, gh2Var3, zg0.rememberComposableLambda(582332538, true, new nl1(ne1Var), kk0Var2, 54), kk0Var, i11110 | (234881024 & i11111) | (i11111 & 1879048192), 6, 192);
                dl1Var2 = dl1VarOutlinedIconButtonColors;
                z4 = z3;
                rg3Var3 = rg3Var2;
                iwVar4 = iwVar3;
                gh2Var4 = gh2Var3;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new ol1(je1Var, cVar3, z4, rg3Var3, dl1Var2, iwVar4, gh2Var4, ne1Var, i, i2));
            }
        }
        i3 |= 1572864;
        gh2Var2 = gh2Var;
        if ((i2 & Uuid.SIZE_BITS) != 0) {
            i3 |= 12582912;
        } else if ((i & 12582912) == 0) {
            if (kk0Var2.j(ne1Var)) {
                i8 = 8388608;
            } else {
                i8 = 4194304;
            }
            i3 |= i8;
        }
        if ((4793491 & i3) == 4793490) {
            kk0Var2.X();
            if ((i & 1) != 0) {
                if (i11 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if (i4 != 0) {
                    z2 = true;
                }
                i9 = i2 & 8;
                el1Var = el1.a;
                if (i9 != 0) {
                    i3 &= -7169;
                    outlinedShape = el1Var.getOutlinedShape(kk0Var2, 6);
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                    dl1VarOutlinedIconButtonColors = el1Var.outlinedIconButtonColors(kk0Var2, 6);
                }
                if ((i2 & 32) != 0) {
                    iw iwVarOutlinedIconButtonBorder116 = el1Var.outlinedIconButtonBorder(z2, kk0Var2, ((i3 >> 6) & 14) | 48);
                    i3 &= -458753;
                    iwVar2 = iwVarOutlinedIconButtonBorder116;
                }
                if (i6 != 0) {
                    gh2Var3 = null;
                    z3 = z2;
                    rg3Var2 = outlinedShape;
                    iwVar3 = iwVar2;
                } else {
                    z3 = z2;
                    iwVar3 = iwVar2;
                    gh2Var3 = gh2Var2;
                    rg3Var2 = outlinedShape;
                }
            } else {
                if (i11 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if (i4 != 0) {
                    z2 = true;
                }
                i9 = i2 & 8;
                el1Var = el1.a;
                if (i9 != 0) {
                    i3 &= -7169;
                    outlinedShape = el1Var.getOutlinedShape(kk0Var2, 6);
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                    dl1VarOutlinedIconButtonColors = el1Var.outlinedIconButtonColors(kk0Var2, 6);
                }
                if ((i2 & 32) != 0) {
                    iw iwVarOutlinedIconButtonBorder117 = el1Var.outlinedIconButtonBorder(z2, kk0Var2, ((i3 >> 6) & 14) | 48);
                    i3 &= -458753;
                    iwVar2 = iwVarOutlinedIconButtonBorder117;
                }
                if (i6 != 0) {
                    gh2Var3 = null;
                    z3 = z2;
                    rg3Var2 = outlinedShape;
                    iwVar3 = iwVar2;
                } else {
                    z3 = z2;
                    iwVar3 = iwVar2;
                    gh2Var3 = gh2Var2;
                    rg3Var2 = outlinedShape;
                }
            }
            kk0Var2.s();
            c cVarB15 = we3.b(cVar3, false, fl1.n);
            if (z3) {
                j = dl1VarOutlinedIconButtonColors.a;
            } else {
                j = dl1VarOutlinedIconButtonColors.c;
            }
            long j1111 = j;
            if (z3) {
                j2 = dl1VarOutlinedIconButtonColors.b;
            } else {
                j2 = dl1VarOutlinedIconButtonColors.d;
            }
            long j1112 = j2;
            int i11112 = i3 & 8078;
            int i11113 = i3 << 9;
            kk0Var = kk0Var2;
            hq3.m213xde3417d4(je1Var2, cVarB15, z3, rg3Var2, j1111, j1112, 0.0f, 0.0f, iwVar3, gh2Var3, zg0.rememberComposableLambda(582332538, true, new nl1(ne1Var), kk0Var2, 54), kk0Var, i11112 | (234881024 & i11113) | (i11113 & 1879048192), 6, 192);
            dl1Var2 = dl1VarOutlinedIconButtonColors;
            z4 = z3;
            rg3Var3 = rg3Var2;
            iwVar4 = iwVar3;
            gh2Var4 = gh2Var3;
        } else {
            kk0Var2.X();
            if ((i & 1) != 0) {
                if (i11 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if (i4 != 0) {
                    z2 = true;
                }
                i9 = i2 & 8;
                el1Var = el1.a;
                if (i9 != 0) {
                    i3 &= -7169;
                    outlinedShape = el1Var.getOutlinedShape(kk0Var2, 6);
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                    dl1VarOutlinedIconButtonColors = el1Var.outlinedIconButtonColors(kk0Var2, 6);
                }
                if ((i2 & 32) != 0) {
                    iw iwVarOutlinedIconButtonBorder118 = el1Var.outlinedIconButtonBorder(z2, kk0Var2, ((i3 >> 6) & 14) | 48);
                    i3 &= -458753;
                    iwVar2 = iwVarOutlinedIconButtonBorder118;
                }
                if (i6 != 0) {
                    gh2Var3 = null;
                    z3 = z2;
                    rg3Var2 = outlinedShape;
                    iwVar3 = iwVar2;
                } else {
                    z3 = z2;
                    iwVar3 = iwVar2;
                    gh2Var3 = gh2Var2;
                    rg3Var2 = outlinedShape;
                }
            } else {
                if (i11 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if (i4 != 0) {
                    z2 = true;
                }
                i9 = i2 & 8;
                el1Var = el1.a;
                if (i9 != 0) {
                    i3 &= -7169;
                    outlinedShape = el1Var.getOutlinedShape(kk0Var2, 6);
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                    dl1VarOutlinedIconButtonColors = el1Var.outlinedIconButtonColors(kk0Var2, 6);
                }
                if ((i2 & 32) != 0) {
                    iw iwVarOutlinedIconButtonBorder119 = el1Var.outlinedIconButtonBorder(z2, kk0Var2, ((i3 >> 6) & 14) | 48);
                    i3 &= -458753;
                    iwVar2 = iwVarOutlinedIconButtonBorder119;
                }
                if (i6 != 0) {
                    gh2Var3 = null;
                    z3 = z2;
                    rg3Var2 = outlinedShape;
                    iwVar3 = iwVar2;
                } else {
                    z3 = z2;
                    iwVar3 = iwVar2;
                    gh2Var3 = gh2Var2;
                    rg3Var2 = outlinedShape;
                }
            }
            kk0Var2.s();
            c cVarB16 = we3.b(cVar3, false, fl1.n);
            if (z3) {
                j = dl1VarOutlinedIconButtonColors.a;
            } else {
                j = dl1VarOutlinedIconButtonColors.c;
            }
            long j1113 = j;
            if (z3) {
                j2 = dl1VarOutlinedIconButtonColors.b;
            } else {
                j2 = dl1VarOutlinedIconButtonColors.d;
            }
            long j1114 = j2;
            int i11114 = i3 & 8078;
            int i11115 = i3 << 9;
            kk0Var = kk0Var2;
            hq3.m213xde3417d4(je1Var2, cVarB16, z3, rg3Var2, j1113, j1114, 0.0f, 0.0f, iwVar3, gh2Var3, zg0.rememberComposableLambda(582332538, true, new nl1(ne1Var), kk0Var2, 54), kk0Var, i11114 | (234881024 & i11115) | (i11115 & 1879048192), 6, 192);
            dl1Var2 = dl1VarOutlinedIconButtonColors;
            z4 = z3;
            rg3Var3 = rg3Var2;
            iwVar4 = iwVar3;
            gh2Var4 = gh2Var3;
        }
        w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new ol1(je1Var, cVar3, z4, rg3Var3, dl1Var2, iwVar4, gh2Var4, ne1Var, i, i2));
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x010b  */
    /* JADX WARN: Code duplicated, block: B:106:0x011d  */
    /* JADX WARN: Code duplicated, block: B:108:0x012d  */
    /* JADX WARN: Code duplicated, block: B:120:0x0149 A[PHI: r4 r7 r9 r10 r11 r12
  0x0149: PHI (r4v39 int) = (r4v25 int), (r4v41 int), (r4v42 int) binds: [B:135:0x0187, B:118:0x0145, B:119:0x0147] A[DONT_GENERATE, DONT_INLINE]
  0x0149: PHI (r7v8 androidx.compose.ui.c) = (r7v3 androidx.compose.ui.c), (r7v2 androidx.compose.ui.c), (r7v2 androidx.compose.ui.c) binds: [B:135:0x0187, B:118:0x0145, B:119:0x0147] A[DONT_GENERATE, DONT_INLINE]
  0x0149: PHI (r9v7 boolean) = (r9v3 boolean), (r9v2 boolean), (r9v2 boolean) binds: [B:135:0x0187, B:118:0x0145, B:119:0x0147] A[DONT_GENERATE, DONT_INLINE]
  0x0149: PHI (r10v20 rg3) = (r10v7 rg3), (r10v6 rg3), (r10v6 rg3) binds: [B:135:0x0187, B:118:0x0145, B:119:0x0147] A[DONT_GENERATE, DONT_INLINE]
  0x0149: PHI (r11v8 vl1) = (r11v4 vl1), (r11v3 vl1), (r11v3 vl1) binds: [B:135:0x0187, B:118:0x0145, B:119:0x0147] A[DONT_GENERATE, DONT_INLINE]
  0x0149: PHI (r12v8 iw) = (r12v4 iw), (r12v3 iw), (r12v3 iw) binds: [B:135:0x0187, B:118:0x0145, B:119:0x0147] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:122:0x0150 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:123:0x0152  */
    /* JADX WARN: Code duplicated, block: B:125:0x0157  */
    /* JADX WARN: Code duplicated, block: B:128:0x015f  */
    /* JADX WARN: Code duplicated, block: B:131:0x016a  */
    /* JADX WARN: Code duplicated, block: B:134:0x0175  */
    /* JADX WARN: Code duplicated, block: B:136:0x0189  */
    /* JADX WARN: Code duplicated, block: B:140:0x020e  */
    /* JADX WARN: Code duplicated, block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    /* JADX WARN: Code duplicated, block: B:28:0x004d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:32:0x0059  */
    /* JADX WARN: Code duplicated, block: B:33:0x005c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX WARN: Code duplicated, block: B:39:0x0068  */
    /* JADX WARN: Code duplicated, block: B:41:0x006c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0074  */
    /* JADX WARN: Code duplicated, block: B:44:0x0077  */
    /* JADX WARN: Code duplicated, block: B:48:0x007e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0082  */
    /* JADX WARN: Code duplicated, block: B:52:0x008a  */
    /* JADX WARN: Code duplicated, block: B:53:0x008d  */
    /* JADX WARN: Code duplicated, block: B:56:0x0093  */
    /* JADX WARN: Code duplicated, block: B:59:0x009a  */
    /* JADX WARN: Code duplicated, block: B:61:0x009e  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:67:0x00af  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:78:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:83:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:85:0x00da  */
    /* JADX WARN: Code duplicated, block: B:87:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:88:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:92:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:93:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:95:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:97:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:98:0x00ff  */
    public static final void OutlinedIconToggleButton(boolean z, le1 le1Var, c cVar, boolean z2, rg3 rg3Var, vl1 vl1Var, iw iwVar, gh2 gh2Var, ne1 ne1Var, ck0 ck0Var, int i, int i2) {
        int i3;
        le1 le1Var2;
        int i4;
        c cVar2;
        int i5;
        int i6;
        boolean z3;
        int i7;
        rg3 outlinedShape;
        vl1 vl1VarOutlinedIconToggleButtonColors;
        iw iwVar2;
        int i8;
        gh2 gh2Var2;
        int i9;
        int i10;
        int i11;
        el1 el1Var;
        vl1 vl1Var2;
        iw iwVar3;
        gh2 gh2Var3;
        c cVar3;
        rg3 rg3Var2;
        iw iwVar4;
        gh2 gh2Var4;
        vl1 vl1Var3;
        boolean z4;
        c cVar4;
        w33 w33VarV;
        int i12;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(1470292106);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (kk0Var.i(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) == 0) {
            if ((i & 48) == 0) {
                le1Var2 = le1Var;
                i3 |= kk0Var.j(le1Var2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    cVar2 = cVar;
                    if (kk0Var.h(cVar2)) {
                        i5 = FontInfo.NUMBER_OF_CHAR_CODES;
                    } else {
                        i5 = Uuid.SIZE_BITS;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    if ((i & 3072) == 0) {
                        z3 = z2;
                        if (kk0Var.i(z3)) {
                            i7 = 2048;
                        } else {
                            i7 = 1024;
                        }
                        i3 |= i7;
                    }
                    if ((i & 24576) == 0) {
                        if ((i2 & 16) == 0) {
                            outlinedShape = rg3Var;
                            if (kk0Var.h(outlinedShape)) {
                                i12 = 16384;
                            }
                            i3 |= i12;
                        } else {
                            outlinedShape = rg3Var;
                        }
                        i12 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                        i3 |= i12;
                    } else {
                        outlinedShape = rg3Var;
                    }
                    if ((196608 & i) == 0) {
                        if ((i2 & 32) == 0) {
                            vl1VarOutlinedIconToggleButtonColors = vl1Var;
                            int i13 = kk0Var.h(vl1VarOutlinedIconToggleButtonColors) ? 131072 : 65536;
                            i3 |= i13;
                        } else {
                            vl1VarOutlinedIconToggleButtonColors = vl1Var;
                        }
                        i3 |= i13;
                    } else {
                        vl1VarOutlinedIconToggleButtonColors = vl1Var;
                    }
                    if ((1572864 & i) == 0) {
                        if ((i2 & 64) == 0) {
                            iwVar2 = iwVar;
                            int i14 = kk0Var.h(iwVar2) ? 1048576 : 524288;
                            i3 |= i14;
                        } else {
                            iwVar2 = iwVar;
                        }
                        i3 |= i14;
                    } else {
                        iwVar2 = iwVar;
                    }
                    i8 = i2 & Uuid.SIZE_BITS;
                    if (i8 != 0) {
                        if ((12582912 & i) == 0) {
                            gh2Var2 = gh2Var;
                            if (kk0Var.h(gh2Var2)) {
                                i9 = 8388608;
                            } else {
                                i9 = 4194304;
                            }
                            i3 |= i9;
                        }
                        if ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            i3 |= 100663296;
                        } else if ((i & 100663296) == 0) {
                            if (kk0Var.j(ne1Var)) {
                                i10 = 67108864;
                            } else {
                                i10 = 33554432;
                            }
                            i3 |= i10;
                        }
                        if ((38347923 & i3) == 38347922 || !kk0Var.F()) {
                            kk0Var.X();
                            if ((i & 1) != 0 || kk0Var.D()) {
                                if (i4 != 0) {
                                    cVar2 = c.i;
                                }
                                if (i6 != 0) {
                                    z3 = true;
                                }
                                i11 = i2 & 16;
                                el1Var = el1.a;
                                if (i11 != 0) {
                                    i3 &= -57345;
                                    outlinedShape = el1Var.getOutlinedShape(kk0Var, 6);
                                }
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                    vl1VarOutlinedIconToggleButtonColors = el1Var.outlinedIconToggleButtonColors(kk0Var, 6);
                                }
                                if ((i2 & 64) != 0) {
                                    iw iwVarOutlinedIconToggleButtonBorder = el1Var.outlinedIconToggleButtonBorder(z3, z, kk0Var, ((i3 >> 9) & 14) | 384 | ((i3 << 3) & 112));
                                    i3 &= -3670017;
                                    iwVar2 = iwVarOutlinedIconToggleButtonBorder;
                                }
                                if (i8 != 0) {
                                    vl1Var2 = vl1VarOutlinedIconToggleButtonColors;
                                    iwVar3 = iwVar2;
                                    gh2Var3 = null;
                                    cVar3 = cVar2;
                                }
                                int i15 = i3;
                                rg3 rg3Var3 = outlinedShape;
                                kk0Var.s();
                                int i16 = i15 >> 9;
                                int i17 = (i16 & 896) | (i16 & 14) | ((i15 << 3) & 112);
                                boolean z5 = z3;
                                hq3.m212x54dd086a(z, le1Var2, we3.b(cVar3, false, fl1.o), z5, rg3Var3, ((re0) vl1Var2.containerColor$material3_release(z3, z, kk0Var, i17).getValue()).a, ((re0) vl1Var2.contentColor$material3_release(z3, z, kk0Var, i17).getValue()).a, 0.0f, 0.0f, iwVar3, gh2Var3, zg0.rememberComposableLambda(1207657396, true, new pl1(ne1Var), kk0Var, 54), kk0Var, (64638 & i15) | (1879048192 & (i15 << 9)), ((i15 >> 21) & 14) | 48, 384);
                                rg3Var2 = rg3Var3;
                                iwVar4 = iwVar3;
                                gh2Var4 = gh2Var3;
                                vl1Var3 = vl1Var2;
                                z4 = z5;
                                cVar4 = cVar3;
                            } else {
                                kk0Var.V();
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                }
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                }
                                if ((i2 & 64) != 0) {
                                    i3 &= -3670017;
                                }
                            }
                            cVar3 = cVar2;
                            vl1Var2 = vl1VarOutlinedIconToggleButtonColors;
                            iwVar3 = iwVar2;
                            gh2Var3 = gh2Var2;
                            int i18 = i3;
                            rg3 rg3Var4 = outlinedShape;
                            kk0Var.s();
                            int i19 = i18 >> 9;
                            int i110 = (i19 & 896) | (i19 & 14) | ((i18 << 3) & 112);
                            boolean z6 = z3;
                            hq3.m212x54dd086a(z, le1Var2, we3.b(cVar3, false, fl1.o), z6, rg3Var4, ((re0) vl1Var2.containerColor$material3_release(z3, z, kk0Var, i110).getValue()).a, ((re0) vl1Var2.contentColor$material3_release(z3, z, kk0Var, i110).getValue()).a, 0.0f, 0.0f, iwVar3, gh2Var3, zg0.rememberComposableLambda(1207657396, true, new pl1(ne1Var), kk0Var, 54), kk0Var, (64638 & i18) | (1879048192 & (i18 << 9)), ((i18 >> 21) & 14) | 48, 384);
                            rg3Var2 = rg3Var4;
                            iwVar4 = iwVar3;
                            gh2Var4 = gh2Var3;
                            vl1Var3 = vl1Var2;
                            z4 = z6;
                            cVar4 = cVar3;
                        } else {
                            kk0Var.V();
                            cVar4 = cVar2;
                            z4 = z3;
                            rg3Var2 = outlinedShape;
                            vl1Var3 = vl1VarOutlinedIconToggleButtonColors;
                            iwVar4 = iwVar2;
                            gh2Var4 = gh2Var2;
                        }
                        w33VarV = kk0Var.v();
                        if (w33VarV != null) {
                            w33VarV.updateScope(new ql1(z, le1Var, cVar4, z4, rg3Var2, vl1Var3, iwVar4, gh2Var4, ne1Var, i, i2));
                        }
                    }
                    i3 |= 12582912;
                    gh2Var2 = gh2Var;
                    if ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                        i3 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        if (kk0Var.j(ne1Var)) {
                            i10 = 67108864;
                        } else {
                            i10 = 33554432;
                        }
                        i3 |= i10;
                    }
                    if ((38347923 & i3) == 38347922) {
                        kk0Var.X();
                        if ((i & 1) != 0) {
                            if (i4 != 0) {
                                cVar2 = c.i;
                            }
                            if (i6 != 0) {
                                z3 = true;
                            }
                            i11 = i2 & 16;
                            el1Var = el1.a;
                            if (i11 != 0) {
                                i3 &= -57345;
                                outlinedShape = el1Var.getOutlinedShape(kk0Var, 6);
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                                vl1VarOutlinedIconToggleButtonColors = el1Var.outlinedIconToggleButtonColors(kk0Var, 6);
                            }
                            if ((i2 & 64) != 0) {
                                iw iwVarOutlinedIconToggleButtonBorder2 = el1Var.outlinedIconToggleButtonBorder(z3, z, kk0Var, ((i3 >> 9) & 14) | 384 | ((i3 << 3) & 112));
                                i3 &= -3670017;
                                iwVar2 = iwVarOutlinedIconToggleButtonBorder2;
                            }
                            if (i8 != 0) {
                                vl1Var2 = vl1VarOutlinedIconToggleButtonColors;
                                iwVar3 = iwVar2;
                                gh2Var3 = null;
                                cVar3 = cVar2;
                            } else {
                                cVar3 = cVar2;
                                vl1Var2 = vl1VarOutlinedIconToggleButtonColors;
                                iwVar3 = iwVar2;
                                gh2Var3 = gh2Var2;
                            }
                        } else {
                            if (i4 != 0) {
                                cVar2 = c.i;
                            }
                            if (i6 != 0) {
                                z3 = true;
                            }
                            i11 = i2 & 16;
                            el1Var = el1.a;
                            if (i11 != 0) {
                                i3 &= -57345;
                                outlinedShape = el1Var.getOutlinedShape(kk0Var, 6);
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                                vl1VarOutlinedIconToggleButtonColors = el1Var.outlinedIconToggleButtonColors(kk0Var, 6);
                            }
                            if ((i2 & 64) != 0) {
                                iw iwVarOutlinedIconToggleButtonBorder3 = el1Var.outlinedIconToggleButtonBorder(z3, z, kk0Var, ((i3 >> 9) & 14) | 384 | ((i3 << 3) & 112));
                                i3 &= -3670017;
                                iwVar2 = iwVarOutlinedIconToggleButtonBorder3;
                            }
                            if (i8 != 0) {
                                vl1Var2 = vl1VarOutlinedIconToggleButtonColors;
                                iwVar3 = iwVar2;
                                gh2Var3 = null;
                                cVar3 = cVar2;
                            } else {
                                cVar3 = cVar2;
                                vl1Var2 = vl1VarOutlinedIconToggleButtonColors;
                                iwVar3 = iwVar2;
                                gh2Var3 = gh2Var2;
                            }
                        }
                        int i111 = i3;
                        rg3 rg3Var5 = outlinedShape;
                        kk0Var.s();
                        int i112 = i111 >> 9;
                        int i113 = (i112 & 896) | (i112 & 14) | ((i111 << 3) & 112);
                        boolean z7 = z3;
                        hq3.m212x54dd086a(z, le1Var2, we3.b(cVar3, false, fl1.o), z7, rg3Var5, ((re0) vl1Var2.containerColor$material3_release(z3, z, kk0Var, i113).getValue()).a, ((re0) vl1Var2.contentColor$material3_release(z3, z, kk0Var, i113).getValue()).a, 0.0f, 0.0f, iwVar3, gh2Var3, zg0.rememberComposableLambda(1207657396, true, new pl1(ne1Var), kk0Var, 54), kk0Var, (64638 & i111) | (1879048192 & (i111 << 9)), ((i111 >> 21) & 14) | 48, 384);
                        rg3Var2 = rg3Var5;
                        iwVar4 = iwVar3;
                        gh2Var4 = gh2Var3;
                        vl1Var3 = vl1Var2;
                        z4 = z7;
                        cVar4 = cVar3;
                    } else {
                        kk0Var.X();
                        if ((i & 1) != 0) {
                            if (i4 != 0) {
                                cVar2 = c.i;
                            }
                            if (i6 != 0) {
                                z3 = true;
                            }
                            i11 = i2 & 16;
                            el1Var = el1.a;
                            if (i11 != 0) {
                                i3 &= -57345;
                                outlinedShape = el1Var.getOutlinedShape(kk0Var, 6);
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                                vl1VarOutlinedIconToggleButtonColors = el1Var.outlinedIconToggleButtonColors(kk0Var, 6);
                            }
                            if ((i2 & 64) != 0) {
                                iw iwVarOutlinedIconToggleButtonBorder4 = el1Var.outlinedIconToggleButtonBorder(z3, z, kk0Var, ((i3 >> 9) & 14) | 384 | ((i3 << 3) & 112));
                                i3 &= -3670017;
                                iwVar2 = iwVarOutlinedIconToggleButtonBorder4;
                            }
                            if (i8 != 0) {
                                vl1Var2 = vl1VarOutlinedIconToggleButtonColors;
                                iwVar3 = iwVar2;
                                gh2Var3 = null;
                                cVar3 = cVar2;
                            } else {
                                cVar3 = cVar2;
                                vl1Var2 = vl1VarOutlinedIconToggleButtonColors;
                                iwVar3 = iwVar2;
                                gh2Var3 = gh2Var2;
                            }
                        } else {
                            if (i4 != 0) {
                                cVar2 = c.i;
                            }
                            if (i6 != 0) {
                                z3 = true;
                            }
                            i11 = i2 & 16;
                            el1Var = el1.a;
                            if (i11 != 0) {
                                i3 &= -57345;
                                outlinedShape = el1Var.getOutlinedShape(kk0Var, 6);
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                                vl1VarOutlinedIconToggleButtonColors = el1Var.outlinedIconToggleButtonColors(kk0Var, 6);
                            }
                            if ((i2 & 64) != 0) {
                                iw iwVarOutlinedIconToggleButtonBorder5 = el1Var.outlinedIconToggleButtonBorder(z3, z, kk0Var, ((i3 >> 9) & 14) | 384 | ((i3 << 3) & 112));
                                i3 &= -3670017;
                                iwVar2 = iwVarOutlinedIconToggleButtonBorder5;
                            }
                            if (i8 != 0) {
                                vl1Var2 = vl1VarOutlinedIconToggleButtonColors;
                                iwVar3 = iwVar2;
                                gh2Var3 = null;
                                cVar3 = cVar2;
                            } else {
                                cVar3 = cVar2;
                                vl1Var2 = vl1VarOutlinedIconToggleButtonColors;
                                iwVar3 = iwVar2;
                                gh2Var3 = gh2Var2;
                            }
                        }
                        int i114 = i3;
                        rg3 rg3Var6 = outlinedShape;
                        kk0Var.s();
                        int i115 = i114 >> 9;
                        int i116 = (i115 & 896) | (i115 & 14) | ((i114 << 3) & 112);
                        boolean z8 = z3;
                        hq3.m212x54dd086a(z, le1Var2, we3.b(cVar3, false, fl1.o), z8, rg3Var6, ((re0) vl1Var2.containerColor$material3_release(z3, z, kk0Var, i116).getValue()).a, ((re0) vl1Var2.contentColor$material3_release(z3, z, kk0Var, i116).getValue()).a, 0.0f, 0.0f, iwVar3, gh2Var3, zg0.rememberComposableLambda(1207657396, true, new pl1(ne1Var), kk0Var, 54), kk0Var, (64638 & i114) | (1879048192 & (i114 << 9)), ((i114 >> 21) & 14) | 48, 384);
                        rg3Var2 = rg3Var6;
                        iwVar4 = iwVar3;
                        gh2Var4 = gh2Var3;
                        vl1Var3 = vl1Var2;
                        z4 = z8;
                        cVar4 = cVar3;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new ql1(z, le1Var, cVar4, z4, rg3Var2, vl1Var3, iwVar4, gh2Var4, ne1Var, i, i2));
                    }
                }
                i3 |= 3072;
                z3 = z2;
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        outlinedShape = rg3Var;
                        if (kk0Var.h(outlinedShape)) {
                            i12 = 16384;
                        }
                        i3 |= i12;
                    } else {
                        outlinedShape = rg3Var;
                    }
                    i12 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                    i3 |= i12;
                } else {
                    outlinedShape = rg3Var;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        vl1VarOutlinedIconToggleButtonColors = vl1Var;
                        if (kk0Var.h(vl1VarOutlinedIconToggleButtonColors)) {
                        }
                        i3 |= i13;
                    } else {
                        vl1VarOutlinedIconToggleButtonColors = vl1Var;
                    }
                    i3 |= i13;
                } else {
                    vl1VarOutlinedIconToggleButtonColors = vl1Var;
                }
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        iwVar2 = iwVar;
                        if (kk0Var.h(iwVar2)) {
                        }
                        i3 |= i14;
                    } else {
                        iwVar2 = iwVar;
                    }
                    i3 |= i14;
                } else {
                    iwVar2 = iwVar;
                }
                i8 = i2 & Uuid.SIZE_BITS;
                if (i8 != 0) {
                    if ((12582912 & i) == 0) {
                        gh2Var2 = gh2Var;
                        if (kk0Var.h(gh2Var2)) {
                            i9 = 8388608;
                        } else {
                            i9 = 4194304;
                        }
                        i3 |= i9;
                    }
                    if ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                        i3 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        if (kk0Var.j(ne1Var)) {
                            i10 = 67108864;
                        } else {
                            i10 = 33554432;
                        }
                        i3 |= i10;
                    }
                    if ((38347923 & i3) == 38347922) {
                        kk0Var.X();
                        if ((i & 1) != 0) {
                            if (i4 != 0) {
                                cVar2 = c.i;
                            }
                            if (i6 != 0) {
                                z3 = true;
                            }
                            i11 = i2 & 16;
                            el1Var = el1.a;
                            if (i11 != 0) {
                                i3 &= -57345;
                                outlinedShape = el1Var.getOutlinedShape(kk0Var, 6);
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                                vl1VarOutlinedIconToggleButtonColors = el1Var.outlinedIconToggleButtonColors(kk0Var, 6);
                            }
                            if ((i2 & 64) != 0) {
                                iw iwVarOutlinedIconToggleButtonBorder6 = el1Var.outlinedIconToggleButtonBorder(z3, z, kk0Var, ((i3 >> 9) & 14) | 384 | ((i3 << 3) & 112));
                                i3 &= -3670017;
                                iwVar2 = iwVarOutlinedIconToggleButtonBorder6;
                            }
                            if (i8 != 0) {
                                vl1Var2 = vl1VarOutlinedIconToggleButtonColors;
                                iwVar3 = iwVar2;
                                gh2Var3 = null;
                                cVar3 = cVar2;
                            } else {
                                cVar3 = cVar2;
                                vl1Var2 = vl1VarOutlinedIconToggleButtonColors;
                                iwVar3 = iwVar2;
                                gh2Var3 = gh2Var2;
                            }
                        } else {
                            if (i4 != 0) {
                                cVar2 = c.i;
                            }
                            if (i6 != 0) {
                                z3 = true;
                            }
                            i11 = i2 & 16;
                            el1Var = el1.a;
                            if (i11 != 0) {
                                i3 &= -57345;
                                outlinedShape = el1Var.getOutlinedShape(kk0Var, 6);
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                                vl1VarOutlinedIconToggleButtonColors = el1Var.outlinedIconToggleButtonColors(kk0Var, 6);
                            }
                            if ((i2 & 64) != 0) {
                                iw iwVarOutlinedIconToggleButtonBorder7 = el1Var.outlinedIconToggleButtonBorder(z3, z, kk0Var, ((i3 >> 9) & 14) | 384 | ((i3 << 3) & 112));
                                i3 &= -3670017;
                                iwVar2 = iwVarOutlinedIconToggleButtonBorder7;
                            }
                            if (i8 != 0) {
                                vl1Var2 = vl1VarOutlinedIconToggleButtonColors;
                                iwVar3 = iwVar2;
                                gh2Var3 = null;
                                cVar3 = cVar2;
                            } else {
                                cVar3 = cVar2;
                                vl1Var2 = vl1VarOutlinedIconToggleButtonColors;
                                iwVar3 = iwVar2;
                                gh2Var3 = gh2Var2;
                            }
                        }
                        int i117 = i3;
                        rg3 rg3Var7 = outlinedShape;
                        kk0Var.s();
                        int i118 = i117 >> 9;
                        int i119 = (i118 & 896) | (i118 & 14) | ((i117 << 3) & 112);
                        boolean z9 = z3;
                        hq3.m212x54dd086a(z, le1Var2, we3.b(cVar3, false, fl1.o), z9, rg3Var7, ((re0) vl1Var2.containerColor$material3_release(z3, z, kk0Var, i119).getValue()).a, ((re0) vl1Var2.contentColor$material3_release(z3, z, kk0Var, i119).getValue()).a, 0.0f, 0.0f, iwVar3, gh2Var3, zg0.rememberComposableLambda(1207657396, true, new pl1(ne1Var), kk0Var, 54), kk0Var, (64638 & i117) | (1879048192 & (i117 << 9)), ((i117 >> 21) & 14) | 48, 384);
                        rg3Var2 = rg3Var7;
                        iwVar4 = iwVar3;
                        gh2Var4 = gh2Var3;
                        vl1Var3 = vl1Var2;
                        z4 = z9;
                        cVar4 = cVar3;
                    } else {
                        kk0Var.X();
                        if ((i & 1) != 0) {
                            if (i4 != 0) {
                                cVar2 = c.i;
                            }
                            if (i6 != 0) {
                                z3 = true;
                            }
                            i11 = i2 & 16;
                            el1Var = el1.a;
                            if (i11 != 0) {
                                i3 &= -57345;
                                outlinedShape = el1Var.getOutlinedShape(kk0Var, 6);
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                                vl1VarOutlinedIconToggleButtonColors = el1Var.outlinedIconToggleButtonColors(kk0Var, 6);
                            }
                            if ((i2 & 64) != 0) {
                                iw iwVarOutlinedIconToggleButtonBorder8 = el1Var.outlinedIconToggleButtonBorder(z3, z, kk0Var, ((i3 >> 9) & 14) | 384 | ((i3 << 3) & 112));
                                i3 &= -3670017;
                                iwVar2 = iwVarOutlinedIconToggleButtonBorder8;
                            }
                            if (i8 != 0) {
                                vl1Var2 = vl1VarOutlinedIconToggleButtonColors;
                                iwVar3 = iwVar2;
                                gh2Var3 = null;
                                cVar3 = cVar2;
                            } else {
                                cVar3 = cVar2;
                                vl1Var2 = vl1VarOutlinedIconToggleButtonColors;
                                iwVar3 = iwVar2;
                                gh2Var3 = gh2Var2;
                            }
                        } else {
                            if (i4 != 0) {
                                cVar2 = c.i;
                            }
                            if (i6 != 0) {
                                z3 = true;
                            }
                            i11 = i2 & 16;
                            el1Var = el1.a;
                            if (i11 != 0) {
                                i3 &= -57345;
                                outlinedShape = el1Var.getOutlinedShape(kk0Var, 6);
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                                vl1VarOutlinedIconToggleButtonColors = el1Var.outlinedIconToggleButtonColors(kk0Var, 6);
                            }
                            if ((i2 & 64) != 0) {
                                iw iwVarOutlinedIconToggleButtonBorder9 = el1Var.outlinedIconToggleButtonBorder(z3, z, kk0Var, ((i3 >> 9) & 14) | 384 | ((i3 << 3) & 112));
                                i3 &= -3670017;
                                iwVar2 = iwVarOutlinedIconToggleButtonBorder9;
                            }
                            if (i8 != 0) {
                                vl1Var2 = vl1VarOutlinedIconToggleButtonColors;
                                iwVar3 = iwVar2;
                                gh2Var3 = null;
                                cVar3 = cVar2;
                            } else {
                                cVar3 = cVar2;
                                vl1Var2 = vl1VarOutlinedIconToggleButtonColors;
                                iwVar3 = iwVar2;
                                gh2Var3 = gh2Var2;
                            }
                        }
                        int i1110 = i3;
                        rg3 rg3Var8 = outlinedShape;
                        kk0Var.s();
                        int i1111 = i1110 >> 9;
                        int i1112 = (i1111 & 896) | (i1111 & 14) | ((i1110 << 3) & 112);
                        boolean z10 = z3;
                        hq3.m212x54dd086a(z, le1Var2, we3.b(cVar3, false, fl1.o), z10, rg3Var8, ((re0) vl1Var2.containerColor$material3_release(z3, z, kk0Var, i1112).getValue()).a, ((re0) vl1Var2.contentColor$material3_release(z3, z, kk0Var, i1112).getValue()).a, 0.0f, 0.0f, iwVar3, gh2Var3, zg0.rememberComposableLambda(1207657396, true, new pl1(ne1Var), kk0Var, 54), kk0Var, (64638 & i1110) | (1879048192 & (i1110 << 9)), ((i1110 >> 21) & 14) | 48, 384);
                        rg3Var2 = rg3Var8;
                        iwVar4 = iwVar3;
                        gh2Var4 = gh2Var3;
                        vl1Var3 = vl1Var2;
                        z4 = z10;
                        cVar4 = cVar3;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new ql1(z, le1Var, cVar4, z4, rg3Var2, vl1Var3, iwVar4, gh2Var4, ne1Var, i, i2));
                    }
                }
                i3 |= 12582912;
                gh2Var2 = gh2Var;
                if ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                    i3 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    if (kk0Var.j(ne1Var)) {
                        i10 = 67108864;
                    } else {
                        i10 = 33554432;
                    }
                    i3 |= i10;
                }
                if ((38347923 & i3) == 38347922) {
                    kk0Var.X();
                    if ((i & 1) != 0) {
                        if (i4 != 0) {
                            cVar2 = c.i;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        }
                        i11 = i2 & 16;
                        el1Var = el1.a;
                        if (i11 != 0) {
                            i3 &= -57345;
                            outlinedShape = el1Var.getOutlinedShape(kk0Var, 6);
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            vl1VarOutlinedIconToggleButtonColors = el1Var.outlinedIconToggleButtonColors(kk0Var, 6);
                        }
                        if ((i2 & 64) != 0) {
                            iw iwVarOutlinedIconToggleButtonBorder10 = el1Var.outlinedIconToggleButtonBorder(z3, z, kk0Var, ((i3 >> 9) & 14) | 384 | ((i3 << 3) & 112));
                            i3 &= -3670017;
                            iwVar2 = iwVarOutlinedIconToggleButtonBorder10;
                        }
                        if (i8 != 0) {
                            vl1Var2 = vl1VarOutlinedIconToggleButtonColors;
                            iwVar3 = iwVar2;
                            gh2Var3 = null;
                            cVar3 = cVar2;
                        } else {
                            cVar3 = cVar2;
                            vl1Var2 = vl1VarOutlinedIconToggleButtonColors;
                            iwVar3 = iwVar2;
                            gh2Var3 = gh2Var2;
                        }
                    } else {
                        if (i4 != 0) {
                            cVar2 = c.i;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        }
                        i11 = i2 & 16;
                        el1Var = el1.a;
                        if (i11 != 0) {
                            i3 &= -57345;
                            outlinedShape = el1Var.getOutlinedShape(kk0Var, 6);
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            vl1VarOutlinedIconToggleButtonColors = el1Var.outlinedIconToggleButtonColors(kk0Var, 6);
                        }
                        if ((i2 & 64) != 0) {
                            iw iwVarOutlinedIconToggleButtonBorder11 = el1Var.outlinedIconToggleButtonBorder(z3, z, kk0Var, ((i3 >> 9) & 14) | 384 | ((i3 << 3) & 112));
                            i3 &= -3670017;
                            iwVar2 = iwVarOutlinedIconToggleButtonBorder11;
                        }
                        if (i8 != 0) {
                            vl1Var2 = vl1VarOutlinedIconToggleButtonColors;
                            iwVar3 = iwVar2;
                            gh2Var3 = null;
                            cVar3 = cVar2;
                        } else {
                            cVar3 = cVar2;
                            vl1Var2 = vl1VarOutlinedIconToggleButtonColors;
                            iwVar3 = iwVar2;
                            gh2Var3 = gh2Var2;
                        }
                    }
                    int i1113 = i3;
                    rg3 rg3Var9 = outlinedShape;
                    kk0Var.s();
                    int i1114 = i1113 >> 9;
                    int i1115 = (i1114 & 896) | (i1114 & 14) | ((i1113 << 3) & 112);
                    boolean z11 = z3;
                    hq3.m212x54dd086a(z, le1Var2, we3.b(cVar3, false, fl1.o), z11, rg3Var9, ((re0) vl1Var2.containerColor$material3_release(z3, z, kk0Var, i1115).getValue()).a, ((re0) vl1Var2.contentColor$material3_release(z3, z, kk0Var, i1115).getValue()).a, 0.0f, 0.0f, iwVar3, gh2Var3, zg0.rememberComposableLambda(1207657396, true, new pl1(ne1Var), kk0Var, 54), kk0Var, (64638 & i1113) | (1879048192 & (i1113 << 9)), ((i1113 >> 21) & 14) | 48, 384);
                    rg3Var2 = rg3Var9;
                    iwVar4 = iwVar3;
                    gh2Var4 = gh2Var3;
                    vl1Var3 = vl1Var2;
                    z4 = z11;
                    cVar4 = cVar3;
                } else {
                    kk0Var.X();
                    if ((i & 1) != 0) {
                        if (i4 != 0) {
                            cVar2 = c.i;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        }
                        i11 = i2 & 16;
                        el1Var = el1.a;
                        if (i11 != 0) {
                            i3 &= -57345;
                            outlinedShape = el1Var.getOutlinedShape(kk0Var, 6);
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            vl1VarOutlinedIconToggleButtonColors = el1Var.outlinedIconToggleButtonColors(kk0Var, 6);
                        }
                        if ((i2 & 64) != 0) {
                            iw iwVarOutlinedIconToggleButtonBorder12 = el1Var.outlinedIconToggleButtonBorder(z3, z, kk0Var, ((i3 >> 9) & 14) | 384 | ((i3 << 3) & 112));
                            i3 &= -3670017;
                            iwVar2 = iwVarOutlinedIconToggleButtonBorder12;
                        }
                        if (i8 != 0) {
                            vl1Var2 = vl1VarOutlinedIconToggleButtonColors;
                            iwVar3 = iwVar2;
                            gh2Var3 = null;
                            cVar3 = cVar2;
                        } else {
                            cVar3 = cVar2;
                            vl1Var2 = vl1VarOutlinedIconToggleButtonColors;
                            iwVar3 = iwVar2;
                            gh2Var3 = gh2Var2;
                        }
                    } else {
                        if (i4 != 0) {
                            cVar2 = c.i;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        }
                        i11 = i2 & 16;
                        el1Var = el1.a;
                        if (i11 != 0) {
                            i3 &= -57345;
                            outlinedShape = el1Var.getOutlinedShape(kk0Var, 6);
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            vl1VarOutlinedIconToggleButtonColors = el1Var.outlinedIconToggleButtonColors(kk0Var, 6);
                        }
                        if ((i2 & 64) != 0) {
                            iw iwVarOutlinedIconToggleButtonBorder13 = el1Var.outlinedIconToggleButtonBorder(z3, z, kk0Var, ((i3 >> 9) & 14) | 384 | ((i3 << 3) & 112));
                            i3 &= -3670017;
                            iwVar2 = iwVarOutlinedIconToggleButtonBorder13;
                        }
                        if (i8 != 0) {
                            vl1Var2 = vl1VarOutlinedIconToggleButtonColors;
                            iwVar3 = iwVar2;
                            gh2Var3 = null;
                            cVar3 = cVar2;
                        } else {
                            cVar3 = cVar2;
                            vl1Var2 = vl1VarOutlinedIconToggleButtonColors;
                            iwVar3 = iwVar2;
                            gh2Var3 = gh2Var2;
                        }
                    }
                    int i1116 = i3;
                    rg3 rg3Var10 = outlinedShape;
                    kk0Var.s();
                    int i1117 = i1116 >> 9;
                    int i1118 = (i1117 & 896) | (i1117 & 14) | ((i1116 << 3) & 112);
                    boolean z12 = z3;
                    hq3.m212x54dd086a(z, le1Var2, we3.b(cVar3, false, fl1.o), z12, rg3Var10, ((re0) vl1Var2.containerColor$material3_release(z3, z, kk0Var, i1118).getValue()).a, ((re0) vl1Var2.contentColor$material3_release(z3, z, kk0Var, i1118).getValue()).a, 0.0f, 0.0f, iwVar3, gh2Var3, zg0.rememberComposableLambda(1207657396, true, new pl1(ne1Var), kk0Var, 54), kk0Var, (64638 & i1116) | (1879048192 & (i1116 << 9)), ((i1116 >> 21) & 14) | 48, 384);
                    rg3Var2 = rg3Var10;
                    iwVar4 = iwVar3;
                    gh2Var4 = gh2Var3;
                    vl1Var3 = vl1Var2;
                    z4 = z12;
                    cVar4 = cVar3;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new ql1(z, le1Var, cVar4, z4, rg3Var2, vl1Var3, iwVar4, gh2Var4, ne1Var, i, i2));
                }
            }
            i3 |= 384;
            cVar2 = cVar;
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    z3 = z2;
                    if (kk0Var.i(z3)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        outlinedShape = rg3Var;
                        if (kk0Var.h(outlinedShape)) {
                            i12 = 16384;
                        }
                        i3 |= i12;
                    } else {
                        outlinedShape = rg3Var;
                    }
                    i12 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                    i3 |= i12;
                } else {
                    outlinedShape = rg3Var;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        vl1VarOutlinedIconToggleButtonColors = vl1Var;
                        if (kk0Var.h(vl1VarOutlinedIconToggleButtonColors)) {
                        }
                        i3 |= i13;
                    } else {
                        vl1VarOutlinedIconToggleButtonColors = vl1Var;
                    }
                    i3 |= i13;
                } else {
                    vl1VarOutlinedIconToggleButtonColors = vl1Var;
                }
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        iwVar2 = iwVar;
                        if (kk0Var.h(iwVar2)) {
                        }
                        i3 |= i14;
                    } else {
                        iwVar2 = iwVar;
                    }
                    i3 |= i14;
                } else {
                    iwVar2 = iwVar;
                }
                i8 = i2 & Uuid.SIZE_BITS;
                if (i8 != 0) {
                    if ((12582912 & i) == 0) {
                        gh2Var2 = gh2Var;
                        if (kk0Var.h(gh2Var2)) {
                            i9 = 8388608;
                        } else {
                            i9 = 4194304;
                        }
                        i3 |= i9;
                    }
                    if ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                        i3 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        if (kk0Var.j(ne1Var)) {
                            i10 = 67108864;
                        } else {
                            i10 = 33554432;
                        }
                        i3 |= i10;
                    }
                    if ((38347923 & i3) == 38347922) {
                        kk0Var.X();
                        if ((i & 1) != 0) {
                            if (i4 != 0) {
                                cVar2 = c.i;
                            }
                            if (i6 != 0) {
                                z3 = true;
                            }
                            i11 = i2 & 16;
                            el1Var = el1.a;
                            if (i11 != 0) {
                                i3 &= -57345;
                                outlinedShape = el1Var.getOutlinedShape(kk0Var, 6);
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                                vl1VarOutlinedIconToggleButtonColors = el1Var.outlinedIconToggleButtonColors(kk0Var, 6);
                            }
                            if ((i2 & 64) != 0) {
                                iw iwVarOutlinedIconToggleButtonBorder14 = el1Var.outlinedIconToggleButtonBorder(z3, z, kk0Var, ((i3 >> 9) & 14) | 384 | ((i3 << 3) & 112));
                                i3 &= -3670017;
                                iwVar2 = iwVarOutlinedIconToggleButtonBorder14;
                            }
                            if (i8 != 0) {
                                vl1Var2 = vl1VarOutlinedIconToggleButtonColors;
                                iwVar3 = iwVar2;
                                gh2Var3 = null;
                                cVar3 = cVar2;
                            } else {
                                cVar3 = cVar2;
                                vl1Var2 = vl1VarOutlinedIconToggleButtonColors;
                                iwVar3 = iwVar2;
                                gh2Var3 = gh2Var2;
                            }
                        } else {
                            if (i4 != 0) {
                                cVar2 = c.i;
                            }
                            if (i6 != 0) {
                                z3 = true;
                            }
                            i11 = i2 & 16;
                            el1Var = el1.a;
                            if (i11 != 0) {
                                i3 &= -57345;
                                outlinedShape = el1Var.getOutlinedShape(kk0Var, 6);
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                                vl1VarOutlinedIconToggleButtonColors = el1Var.outlinedIconToggleButtonColors(kk0Var, 6);
                            }
                            if ((i2 & 64) != 0) {
                                iw iwVarOutlinedIconToggleButtonBorder15 = el1Var.outlinedIconToggleButtonBorder(z3, z, kk0Var, ((i3 >> 9) & 14) | 384 | ((i3 << 3) & 112));
                                i3 &= -3670017;
                                iwVar2 = iwVarOutlinedIconToggleButtonBorder15;
                            }
                            if (i8 != 0) {
                                vl1Var2 = vl1VarOutlinedIconToggleButtonColors;
                                iwVar3 = iwVar2;
                                gh2Var3 = null;
                                cVar3 = cVar2;
                            } else {
                                cVar3 = cVar2;
                                vl1Var2 = vl1VarOutlinedIconToggleButtonColors;
                                iwVar3 = iwVar2;
                                gh2Var3 = gh2Var2;
                            }
                        }
                        int i1119 = i3;
                        rg3 rg3Var11 = outlinedShape;
                        kk0Var.s();
                        int i11110 = i1119 >> 9;
                        int i11111 = (i11110 & 896) | (i11110 & 14) | ((i1119 << 3) & 112);
                        boolean z13 = z3;
                        hq3.m212x54dd086a(z, le1Var2, we3.b(cVar3, false, fl1.o), z13, rg3Var11, ((re0) vl1Var2.containerColor$material3_release(z3, z, kk0Var, i11111).getValue()).a, ((re0) vl1Var2.contentColor$material3_release(z3, z, kk0Var, i11111).getValue()).a, 0.0f, 0.0f, iwVar3, gh2Var3, zg0.rememberComposableLambda(1207657396, true, new pl1(ne1Var), kk0Var, 54), kk0Var, (64638 & i1119) | (1879048192 & (i1119 << 9)), ((i1119 >> 21) & 14) | 48, 384);
                        rg3Var2 = rg3Var11;
                        iwVar4 = iwVar3;
                        gh2Var4 = gh2Var3;
                        vl1Var3 = vl1Var2;
                        z4 = z13;
                        cVar4 = cVar3;
                    } else {
                        kk0Var.X();
                        if ((i & 1) != 0) {
                            if (i4 != 0) {
                                cVar2 = c.i;
                            }
                            if (i6 != 0) {
                                z3 = true;
                            }
                            i11 = i2 & 16;
                            el1Var = el1.a;
                            if (i11 != 0) {
                                i3 &= -57345;
                                outlinedShape = el1Var.getOutlinedShape(kk0Var, 6);
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                                vl1VarOutlinedIconToggleButtonColors = el1Var.outlinedIconToggleButtonColors(kk0Var, 6);
                            }
                            if ((i2 & 64) != 0) {
                                iw iwVarOutlinedIconToggleButtonBorder16 = el1Var.outlinedIconToggleButtonBorder(z3, z, kk0Var, ((i3 >> 9) & 14) | 384 | ((i3 << 3) & 112));
                                i3 &= -3670017;
                                iwVar2 = iwVarOutlinedIconToggleButtonBorder16;
                            }
                            if (i8 != 0) {
                                vl1Var2 = vl1VarOutlinedIconToggleButtonColors;
                                iwVar3 = iwVar2;
                                gh2Var3 = null;
                                cVar3 = cVar2;
                            } else {
                                cVar3 = cVar2;
                                vl1Var2 = vl1VarOutlinedIconToggleButtonColors;
                                iwVar3 = iwVar2;
                                gh2Var3 = gh2Var2;
                            }
                        } else {
                            if (i4 != 0) {
                                cVar2 = c.i;
                            }
                            if (i6 != 0) {
                                z3 = true;
                            }
                            i11 = i2 & 16;
                            el1Var = el1.a;
                            if (i11 != 0) {
                                i3 &= -57345;
                                outlinedShape = el1Var.getOutlinedShape(kk0Var, 6);
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                                vl1VarOutlinedIconToggleButtonColors = el1Var.outlinedIconToggleButtonColors(kk0Var, 6);
                            }
                            if ((i2 & 64) != 0) {
                                iw iwVarOutlinedIconToggleButtonBorder17 = el1Var.outlinedIconToggleButtonBorder(z3, z, kk0Var, ((i3 >> 9) & 14) | 384 | ((i3 << 3) & 112));
                                i3 &= -3670017;
                                iwVar2 = iwVarOutlinedIconToggleButtonBorder17;
                            }
                            if (i8 != 0) {
                                vl1Var2 = vl1VarOutlinedIconToggleButtonColors;
                                iwVar3 = iwVar2;
                                gh2Var3 = null;
                                cVar3 = cVar2;
                            } else {
                                cVar3 = cVar2;
                                vl1Var2 = vl1VarOutlinedIconToggleButtonColors;
                                iwVar3 = iwVar2;
                                gh2Var3 = gh2Var2;
                            }
                        }
                        int i11112 = i3;
                        rg3 rg3Var12 = outlinedShape;
                        kk0Var.s();
                        int i11113 = i11112 >> 9;
                        int i11114 = (i11113 & 896) | (i11113 & 14) | ((i11112 << 3) & 112);
                        boolean z14 = z3;
                        hq3.m212x54dd086a(z, le1Var2, we3.b(cVar3, false, fl1.o), z14, rg3Var12, ((re0) vl1Var2.containerColor$material3_release(z3, z, kk0Var, i11114).getValue()).a, ((re0) vl1Var2.contentColor$material3_release(z3, z, kk0Var, i11114).getValue()).a, 0.0f, 0.0f, iwVar3, gh2Var3, zg0.rememberComposableLambda(1207657396, true, new pl1(ne1Var), kk0Var, 54), kk0Var, (64638 & i11112) | (1879048192 & (i11112 << 9)), ((i11112 >> 21) & 14) | 48, 384);
                        rg3Var2 = rg3Var12;
                        iwVar4 = iwVar3;
                        gh2Var4 = gh2Var3;
                        vl1Var3 = vl1Var2;
                        z4 = z14;
                        cVar4 = cVar3;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new ql1(z, le1Var, cVar4, z4, rg3Var2, vl1Var3, iwVar4, gh2Var4, ne1Var, i, i2));
                    }
                }
                i3 |= 12582912;
                gh2Var2 = gh2Var;
                if ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                    i3 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    if (kk0Var.j(ne1Var)) {
                        i10 = 67108864;
                    } else {
                        i10 = 33554432;
                    }
                    i3 |= i10;
                }
                if ((38347923 & i3) == 38347922) {
                    kk0Var.X();
                    if ((i & 1) != 0) {
                        if (i4 != 0) {
                            cVar2 = c.i;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        }
                        i11 = i2 & 16;
                        el1Var = el1.a;
                        if (i11 != 0) {
                            i3 &= -57345;
                            outlinedShape = el1Var.getOutlinedShape(kk0Var, 6);
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            vl1VarOutlinedIconToggleButtonColors = el1Var.outlinedIconToggleButtonColors(kk0Var, 6);
                        }
                        if ((i2 & 64) != 0) {
                            iw iwVarOutlinedIconToggleButtonBorder18 = el1Var.outlinedIconToggleButtonBorder(z3, z, kk0Var, ((i3 >> 9) & 14) | 384 | ((i3 << 3) & 112));
                            i3 &= -3670017;
                            iwVar2 = iwVarOutlinedIconToggleButtonBorder18;
                        }
                        if (i8 != 0) {
                            vl1Var2 = vl1VarOutlinedIconToggleButtonColors;
                            iwVar3 = iwVar2;
                            gh2Var3 = null;
                            cVar3 = cVar2;
                        } else {
                            cVar3 = cVar2;
                            vl1Var2 = vl1VarOutlinedIconToggleButtonColors;
                            iwVar3 = iwVar2;
                            gh2Var3 = gh2Var2;
                        }
                    } else {
                        if (i4 != 0) {
                            cVar2 = c.i;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        }
                        i11 = i2 & 16;
                        el1Var = el1.a;
                        if (i11 != 0) {
                            i3 &= -57345;
                            outlinedShape = el1Var.getOutlinedShape(kk0Var, 6);
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            vl1VarOutlinedIconToggleButtonColors = el1Var.outlinedIconToggleButtonColors(kk0Var, 6);
                        }
                        if ((i2 & 64) != 0) {
                            iw iwVarOutlinedIconToggleButtonBorder19 = el1Var.outlinedIconToggleButtonBorder(z3, z, kk0Var, ((i3 >> 9) & 14) | 384 | ((i3 << 3) & 112));
                            i3 &= -3670017;
                            iwVar2 = iwVarOutlinedIconToggleButtonBorder19;
                        }
                        if (i8 != 0) {
                            vl1Var2 = vl1VarOutlinedIconToggleButtonColors;
                            iwVar3 = iwVar2;
                            gh2Var3 = null;
                            cVar3 = cVar2;
                        } else {
                            cVar3 = cVar2;
                            vl1Var2 = vl1VarOutlinedIconToggleButtonColors;
                            iwVar3 = iwVar2;
                            gh2Var3 = gh2Var2;
                        }
                    }
                    int i11115 = i3;
                    rg3 rg3Var13 = outlinedShape;
                    kk0Var.s();
                    int i11116 = i11115 >> 9;
                    int i11117 = (i11116 & 896) | (i11116 & 14) | ((i11115 << 3) & 112);
                    boolean z15 = z3;
                    hq3.m212x54dd086a(z, le1Var2, we3.b(cVar3, false, fl1.o), z15, rg3Var13, ((re0) vl1Var2.containerColor$material3_release(z3, z, kk0Var, i11117).getValue()).a, ((re0) vl1Var2.contentColor$material3_release(z3, z, kk0Var, i11117).getValue()).a, 0.0f, 0.0f, iwVar3, gh2Var3, zg0.rememberComposableLambda(1207657396, true, new pl1(ne1Var), kk0Var, 54), kk0Var, (64638 & i11115) | (1879048192 & (i11115 << 9)), ((i11115 >> 21) & 14) | 48, 384);
                    rg3Var2 = rg3Var13;
                    iwVar4 = iwVar3;
                    gh2Var4 = gh2Var3;
                    vl1Var3 = vl1Var2;
                    z4 = z15;
                    cVar4 = cVar3;
                } else {
                    kk0Var.X();
                    if ((i & 1) != 0) {
                        if (i4 != 0) {
                            cVar2 = c.i;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        }
                        i11 = i2 & 16;
                        el1Var = el1.a;
                        if (i11 != 0) {
                            i3 &= -57345;
                            outlinedShape = el1Var.getOutlinedShape(kk0Var, 6);
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            vl1VarOutlinedIconToggleButtonColors = el1Var.outlinedIconToggleButtonColors(kk0Var, 6);
                        }
                        if ((i2 & 64) != 0) {
                            iw iwVarOutlinedIconToggleButtonBorder110 = el1Var.outlinedIconToggleButtonBorder(z3, z, kk0Var, ((i3 >> 9) & 14) | 384 | ((i3 << 3) & 112));
                            i3 &= -3670017;
                            iwVar2 = iwVarOutlinedIconToggleButtonBorder110;
                        }
                        if (i8 != 0) {
                            vl1Var2 = vl1VarOutlinedIconToggleButtonColors;
                            iwVar3 = iwVar2;
                            gh2Var3 = null;
                            cVar3 = cVar2;
                        } else {
                            cVar3 = cVar2;
                            vl1Var2 = vl1VarOutlinedIconToggleButtonColors;
                            iwVar3 = iwVar2;
                            gh2Var3 = gh2Var2;
                        }
                    } else {
                        if (i4 != 0) {
                            cVar2 = c.i;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        }
                        i11 = i2 & 16;
                        el1Var = el1.a;
                        if (i11 != 0) {
                            i3 &= -57345;
                            outlinedShape = el1Var.getOutlinedShape(kk0Var, 6);
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            vl1VarOutlinedIconToggleButtonColors = el1Var.outlinedIconToggleButtonColors(kk0Var, 6);
                        }
                        if ((i2 & 64) != 0) {
                            iw iwVarOutlinedIconToggleButtonBorder111 = el1Var.outlinedIconToggleButtonBorder(z3, z, kk0Var, ((i3 >> 9) & 14) | 384 | ((i3 << 3) & 112));
                            i3 &= -3670017;
                            iwVar2 = iwVarOutlinedIconToggleButtonBorder111;
                        }
                        if (i8 != 0) {
                            vl1Var2 = vl1VarOutlinedIconToggleButtonColors;
                            iwVar3 = iwVar2;
                            gh2Var3 = null;
                            cVar3 = cVar2;
                        } else {
                            cVar3 = cVar2;
                            vl1Var2 = vl1VarOutlinedIconToggleButtonColors;
                            iwVar3 = iwVar2;
                            gh2Var3 = gh2Var2;
                        }
                    }
                    int i11118 = i3;
                    rg3 rg3Var14 = outlinedShape;
                    kk0Var.s();
                    int i11119 = i11118 >> 9;
                    int i111110 = (i11119 & 896) | (i11119 & 14) | ((i11118 << 3) & 112);
                    boolean z16 = z3;
                    hq3.m212x54dd086a(z, le1Var2, we3.b(cVar3, false, fl1.o), z16, rg3Var14, ((re0) vl1Var2.containerColor$material3_release(z3, z, kk0Var, i111110).getValue()).a, ((re0) vl1Var2.contentColor$material3_release(z3, z, kk0Var, i111110).getValue()).a, 0.0f, 0.0f, iwVar3, gh2Var3, zg0.rememberComposableLambda(1207657396, true, new pl1(ne1Var), kk0Var, 54), kk0Var, (64638 & i11118) | (1879048192 & (i11118 << 9)), ((i11118 >> 21) & 14) | 48, 384);
                    rg3Var2 = rg3Var14;
                    iwVar4 = iwVar3;
                    gh2Var4 = gh2Var3;
                    vl1Var3 = vl1Var2;
                    z4 = z16;
                    cVar4 = cVar3;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new ql1(z, le1Var, cVar4, z4, rg3Var2, vl1Var3, iwVar4, gh2Var4, ne1Var, i, i2));
                }
            }
            i3 |= 3072;
            z3 = z2;
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    outlinedShape = rg3Var;
                    if (kk0Var.h(outlinedShape)) {
                        i12 = 16384;
                    }
                    i3 |= i12;
                } else {
                    outlinedShape = rg3Var;
                }
                i12 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                i3 |= i12;
            } else {
                outlinedShape = rg3Var;
            }
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0) {
                    vl1VarOutlinedIconToggleButtonColors = vl1Var;
                    if (kk0Var.h(vl1VarOutlinedIconToggleButtonColors)) {
                    }
                    i3 |= i13;
                } else {
                    vl1VarOutlinedIconToggleButtonColors = vl1Var;
                }
                i3 |= i13;
            } else {
                vl1VarOutlinedIconToggleButtonColors = vl1Var;
            }
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    iwVar2 = iwVar;
                    if (kk0Var.h(iwVar2)) {
                    }
                    i3 |= i14;
                } else {
                    iwVar2 = iwVar;
                }
                i3 |= i14;
            } else {
                iwVar2 = iwVar;
            }
            i8 = i2 & Uuid.SIZE_BITS;
            if (i8 != 0) {
                if ((12582912 & i) == 0) {
                    gh2Var2 = gh2Var;
                    if (kk0Var.h(gh2Var2)) {
                        i9 = 8388608;
                    } else {
                        i9 = 4194304;
                    }
                    i3 |= i9;
                }
                if ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                    i3 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    if (kk0Var.j(ne1Var)) {
                        i10 = 67108864;
                    } else {
                        i10 = 33554432;
                    }
                    i3 |= i10;
                }
                if ((38347923 & i3) == 38347922) {
                    kk0Var.X();
                    if ((i & 1) != 0) {
                        if (i4 != 0) {
                            cVar2 = c.i;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        }
                        i11 = i2 & 16;
                        el1Var = el1.a;
                        if (i11 != 0) {
                            i3 &= -57345;
                            outlinedShape = el1Var.getOutlinedShape(kk0Var, 6);
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            vl1VarOutlinedIconToggleButtonColors = el1Var.outlinedIconToggleButtonColors(kk0Var, 6);
                        }
                        if ((i2 & 64) != 0) {
                            iw iwVarOutlinedIconToggleButtonBorder112 = el1Var.outlinedIconToggleButtonBorder(z3, z, kk0Var, ((i3 >> 9) & 14) | 384 | ((i3 << 3) & 112));
                            i3 &= -3670017;
                            iwVar2 = iwVarOutlinedIconToggleButtonBorder112;
                        }
                        if (i8 != 0) {
                            vl1Var2 = vl1VarOutlinedIconToggleButtonColors;
                            iwVar3 = iwVar2;
                            gh2Var3 = null;
                            cVar3 = cVar2;
                        } else {
                            cVar3 = cVar2;
                            vl1Var2 = vl1VarOutlinedIconToggleButtonColors;
                            iwVar3 = iwVar2;
                            gh2Var3 = gh2Var2;
                        }
                    } else {
                        if (i4 != 0) {
                            cVar2 = c.i;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        }
                        i11 = i2 & 16;
                        el1Var = el1.a;
                        if (i11 != 0) {
                            i3 &= -57345;
                            outlinedShape = el1Var.getOutlinedShape(kk0Var, 6);
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            vl1VarOutlinedIconToggleButtonColors = el1Var.outlinedIconToggleButtonColors(kk0Var, 6);
                        }
                        if ((i2 & 64) != 0) {
                            iw iwVarOutlinedIconToggleButtonBorder113 = el1Var.outlinedIconToggleButtonBorder(z3, z, kk0Var, ((i3 >> 9) & 14) | 384 | ((i3 << 3) & 112));
                            i3 &= -3670017;
                            iwVar2 = iwVarOutlinedIconToggleButtonBorder113;
                        }
                        if (i8 != 0) {
                            vl1Var2 = vl1VarOutlinedIconToggleButtonColors;
                            iwVar3 = iwVar2;
                            gh2Var3 = null;
                            cVar3 = cVar2;
                        } else {
                            cVar3 = cVar2;
                            vl1Var2 = vl1VarOutlinedIconToggleButtonColors;
                            iwVar3 = iwVar2;
                            gh2Var3 = gh2Var2;
                        }
                    }
                    int i111111 = i3;
                    rg3 rg3Var15 = outlinedShape;
                    kk0Var.s();
                    int i111112 = i111111 >> 9;
                    int i111113 = (i111112 & 896) | (i111112 & 14) | ((i111111 << 3) & 112);
                    boolean z17 = z3;
                    hq3.m212x54dd086a(z, le1Var2, we3.b(cVar3, false, fl1.o), z17, rg3Var15, ((re0) vl1Var2.containerColor$material3_release(z3, z, kk0Var, i111113).getValue()).a, ((re0) vl1Var2.contentColor$material3_release(z3, z, kk0Var, i111113).getValue()).a, 0.0f, 0.0f, iwVar3, gh2Var3, zg0.rememberComposableLambda(1207657396, true, new pl1(ne1Var), kk0Var, 54), kk0Var, (64638 & i111111) | (1879048192 & (i111111 << 9)), ((i111111 >> 21) & 14) | 48, 384);
                    rg3Var2 = rg3Var15;
                    iwVar4 = iwVar3;
                    gh2Var4 = gh2Var3;
                    vl1Var3 = vl1Var2;
                    z4 = z17;
                    cVar4 = cVar3;
                } else {
                    kk0Var.X();
                    if ((i & 1) != 0) {
                        if (i4 != 0) {
                            cVar2 = c.i;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        }
                        i11 = i2 & 16;
                        el1Var = el1.a;
                        if (i11 != 0) {
                            i3 &= -57345;
                            outlinedShape = el1Var.getOutlinedShape(kk0Var, 6);
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            vl1VarOutlinedIconToggleButtonColors = el1Var.outlinedIconToggleButtonColors(kk0Var, 6);
                        }
                        if ((i2 & 64) != 0) {
                            iw iwVarOutlinedIconToggleButtonBorder114 = el1Var.outlinedIconToggleButtonBorder(z3, z, kk0Var, ((i3 >> 9) & 14) | 384 | ((i3 << 3) & 112));
                            i3 &= -3670017;
                            iwVar2 = iwVarOutlinedIconToggleButtonBorder114;
                        }
                        if (i8 != 0) {
                            vl1Var2 = vl1VarOutlinedIconToggleButtonColors;
                            iwVar3 = iwVar2;
                            gh2Var3 = null;
                            cVar3 = cVar2;
                        } else {
                            cVar3 = cVar2;
                            vl1Var2 = vl1VarOutlinedIconToggleButtonColors;
                            iwVar3 = iwVar2;
                            gh2Var3 = gh2Var2;
                        }
                    } else {
                        if (i4 != 0) {
                            cVar2 = c.i;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        }
                        i11 = i2 & 16;
                        el1Var = el1.a;
                        if (i11 != 0) {
                            i3 &= -57345;
                            outlinedShape = el1Var.getOutlinedShape(kk0Var, 6);
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            vl1VarOutlinedIconToggleButtonColors = el1Var.outlinedIconToggleButtonColors(kk0Var, 6);
                        }
                        if ((i2 & 64) != 0) {
                            iw iwVarOutlinedIconToggleButtonBorder115 = el1Var.outlinedIconToggleButtonBorder(z3, z, kk0Var, ((i3 >> 9) & 14) | 384 | ((i3 << 3) & 112));
                            i3 &= -3670017;
                            iwVar2 = iwVarOutlinedIconToggleButtonBorder115;
                        }
                        if (i8 != 0) {
                            vl1Var2 = vl1VarOutlinedIconToggleButtonColors;
                            iwVar3 = iwVar2;
                            gh2Var3 = null;
                            cVar3 = cVar2;
                        } else {
                            cVar3 = cVar2;
                            vl1Var2 = vl1VarOutlinedIconToggleButtonColors;
                            iwVar3 = iwVar2;
                            gh2Var3 = gh2Var2;
                        }
                    }
                    int i111114 = i3;
                    rg3 rg3Var16 = outlinedShape;
                    kk0Var.s();
                    int i111115 = i111114 >> 9;
                    int i111116 = (i111115 & 896) | (i111115 & 14) | ((i111114 << 3) & 112);
                    boolean z18 = z3;
                    hq3.m212x54dd086a(z, le1Var2, we3.b(cVar3, false, fl1.o), z18, rg3Var16, ((re0) vl1Var2.containerColor$material3_release(z3, z, kk0Var, i111116).getValue()).a, ((re0) vl1Var2.contentColor$material3_release(z3, z, kk0Var, i111116).getValue()).a, 0.0f, 0.0f, iwVar3, gh2Var3, zg0.rememberComposableLambda(1207657396, true, new pl1(ne1Var), kk0Var, 54), kk0Var, (64638 & i111114) | (1879048192 & (i111114 << 9)), ((i111114 >> 21) & 14) | 48, 384);
                    rg3Var2 = rg3Var16;
                    iwVar4 = iwVar3;
                    gh2Var4 = gh2Var3;
                    vl1Var3 = vl1Var2;
                    z4 = z18;
                    cVar4 = cVar3;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new ql1(z, le1Var, cVar4, z4, rg3Var2, vl1Var3, iwVar4, gh2Var4, ne1Var, i, i2));
                }
            }
            i3 |= 12582912;
            gh2Var2 = gh2Var;
            if ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                i3 |= 100663296;
            } else if ((i & 100663296) == 0) {
                if (kk0Var.j(ne1Var)) {
                    i10 = 67108864;
                } else {
                    i10 = 33554432;
                }
                i3 |= i10;
            }
            if ((38347923 & i3) == 38347922) {
                kk0Var.X();
                if ((i & 1) != 0) {
                    if (i4 != 0) {
                        cVar2 = c.i;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    }
                    i11 = i2 & 16;
                    el1Var = el1.a;
                    if (i11 != 0) {
                        i3 &= -57345;
                        outlinedShape = el1Var.getOutlinedShape(kk0Var, 6);
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        vl1VarOutlinedIconToggleButtonColors = el1Var.outlinedIconToggleButtonColors(kk0Var, 6);
                    }
                    if ((i2 & 64) != 0) {
                        iw iwVarOutlinedIconToggleButtonBorder116 = el1Var.outlinedIconToggleButtonBorder(z3, z, kk0Var, ((i3 >> 9) & 14) | 384 | ((i3 << 3) & 112));
                        i3 &= -3670017;
                        iwVar2 = iwVarOutlinedIconToggleButtonBorder116;
                    }
                    if (i8 != 0) {
                        vl1Var2 = vl1VarOutlinedIconToggleButtonColors;
                        iwVar3 = iwVar2;
                        gh2Var3 = null;
                        cVar3 = cVar2;
                    } else {
                        cVar3 = cVar2;
                        vl1Var2 = vl1VarOutlinedIconToggleButtonColors;
                        iwVar3 = iwVar2;
                        gh2Var3 = gh2Var2;
                    }
                } else {
                    if (i4 != 0) {
                        cVar2 = c.i;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    }
                    i11 = i2 & 16;
                    el1Var = el1.a;
                    if (i11 != 0) {
                        i3 &= -57345;
                        outlinedShape = el1Var.getOutlinedShape(kk0Var, 6);
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        vl1VarOutlinedIconToggleButtonColors = el1Var.outlinedIconToggleButtonColors(kk0Var, 6);
                    }
                    if ((i2 & 64) != 0) {
                        iw iwVarOutlinedIconToggleButtonBorder117 = el1Var.outlinedIconToggleButtonBorder(z3, z, kk0Var, ((i3 >> 9) & 14) | 384 | ((i3 << 3) & 112));
                        i3 &= -3670017;
                        iwVar2 = iwVarOutlinedIconToggleButtonBorder117;
                    }
                    if (i8 != 0) {
                        vl1Var2 = vl1VarOutlinedIconToggleButtonColors;
                        iwVar3 = iwVar2;
                        gh2Var3 = null;
                        cVar3 = cVar2;
                    } else {
                        cVar3 = cVar2;
                        vl1Var2 = vl1VarOutlinedIconToggleButtonColors;
                        iwVar3 = iwVar2;
                        gh2Var3 = gh2Var2;
                    }
                }
                int i111117 = i3;
                rg3 rg3Var17 = outlinedShape;
                kk0Var.s();
                int i111118 = i111117 >> 9;
                int i111119 = (i111118 & 896) | (i111118 & 14) | ((i111117 << 3) & 112);
                boolean z19 = z3;
                hq3.m212x54dd086a(z, le1Var2, we3.b(cVar3, false, fl1.o), z19, rg3Var17, ((re0) vl1Var2.containerColor$material3_release(z3, z, kk0Var, i111119).getValue()).a, ((re0) vl1Var2.contentColor$material3_release(z3, z, kk0Var, i111119).getValue()).a, 0.0f, 0.0f, iwVar3, gh2Var3, zg0.rememberComposableLambda(1207657396, true, new pl1(ne1Var), kk0Var, 54), kk0Var, (64638 & i111117) | (1879048192 & (i111117 << 9)), ((i111117 >> 21) & 14) | 48, 384);
                rg3Var2 = rg3Var17;
                iwVar4 = iwVar3;
                gh2Var4 = gh2Var3;
                vl1Var3 = vl1Var2;
                z4 = z19;
                cVar4 = cVar3;
            } else {
                kk0Var.X();
                if ((i & 1) != 0) {
                    if (i4 != 0) {
                        cVar2 = c.i;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    }
                    i11 = i2 & 16;
                    el1Var = el1.a;
                    if (i11 != 0) {
                        i3 &= -57345;
                        outlinedShape = el1Var.getOutlinedShape(kk0Var, 6);
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        vl1VarOutlinedIconToggleButtonColors = el1Var.outlinedIconToggleButtonColors(kk0Var, 6);
                    }
                    if ((i2 & 64) != 0) {
                        iw iwVarOutlinedIconToggleButtonBorder118 = el1Var.outlinedIconToggleButtonBorder(z3, z, kk0Var, ((i3 >> 9) & 14) | 384 | ((i3 << 3) & 112));
                        i3 &= -3670017;
                        iwVar2 = iwVarOutlinedIconToggleButtonBorder118;
                    }
                    if (i8 != 0) {
                        vl1Var2 = vl1VarOutlinedIconToggleButtonColors;
                        iwVar3 = iwVar2;
                        gh2Var3 = null;
                        cVar3 = cVar2;
                    } else {
                        cVar3 = cVar2;
                        vl1Var2 = vl1VarOutlinedIconToggleButtonColors;
                        iwVar3 = iwVar2;
                        gh2Var3 = gh2Var2;
                    }
                } else {
                    if (i4 != 0) {
                        cVar2 = c.i;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    }
                    i11 = i2 & 16;
                    el1Var = el1.a;
                    if (i11 != 0) {
                        i3 &= -57345;
                        outlinedShape = el1Var.getOutlinedShape(kk0Var, 6);
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        vl1VarOutlinedIconToggleButtonColors = el1Var.outlinedIconToggleButtonColors(kk0Var, 6);
                    }
                    if ((i2 & 64) != 0) {
                        iw iwVarOutlinedIconToggleButtonBorder119 = el1Var.outlinedIconToggleButtonBorder(z3, z, kk0Var, ((i3 >> 9) & 14) | 384 | ((i3 << 3) & 112));
                        i3 &= -3670017;
                        iwVar2 = iwVarOutlinedIconToggleButtonBorder119;
                    }
                    if (i8 != 0) {
                        vl1Var2 = vl1VarOutlinedIconToggleButtonColors;
                        iwVar3 = iwVar2;
                        gh2Var3 = null;
                        cVar3 = cVar2;
                    } else {
                        cVar3 = cVar2;
                        vl1Var2 = vl1VarOutlinedIconToggleButtonColors;
                        iwVar3 = iwVar2;
                        gh2Var3 = gh2Var2;
                    }
                }
                int i1111110 = i3;
                rg3 rg3Var18 = outlinedShape;
                kk0Var.s();
                int i1111111 = i1111110 >> 9;
                int i1111112 = (i1111111 & 896) | (i1111111 & 14) | ((i1111110 << 3) & 112);
                boolean z110 = z3;
                hq3.m212x54dd086a(z, le1Var2, we3.b(cVar3, false, fl1.o), z110, rg3Var18, ((re0) vl1Var2.containerColor$material3_release(z3, z, kk0Var, i1111112).getValue()).a, ((re0) vl1Var2.contentColor$material3_release(z3, z, kk0Var, i1111112).getValue()).a, 0.0f, 0.0f, iwVar3, gh2Var3, zg0.rememberComposableLambda(1207657396, true, new pl1(ne1Var), kk0Var, 54), kk0Var, (64638 & i1111110) | (1879048192 & (i1111110 << 9)), ((i1111110 >> 21) & 14) | 48, 384);
                rg3Var2 = rg3Var18;
                iwVar4 = iwVar3;
                gh2Var4 = gh2Var3;
                vl1Var3 = vl1Var2;
                z4 = z110;
                cVar4 = cVar3;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new ql1(z, le1Var, cVar4, z4, rg3Var2, vl1Var3, iwVar4, gh2Var4, ne1Var, i, i2));
            }
        }
        i3 |= 48;
        le1Var2 = le1Var;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                cVar2 = cVar;
                if (kk0Var.h(cVar2)) {
                    i5 = FontInfo.NUMBER_OF_CHAR_CODES;
                } else {
                    i5 = Uuid.SIZE_BITS;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    z3 = z2;
                    if (kk0Var.i(z3)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        outlinedShape = rg3Var;
                        if (kk0Var.h(outlinedShape)) {
                            i12 = 16384;
                        }
                        i3 |= i12;
                    } else {
                        outlinedShape = rg3Var;
                    }
                    i12 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                    i3 |= i12;
                } else {
                    outlinedShape = rg3Var;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        vl1VarOutlinedIconToggleButtonColors = vl1Var;
                        if (kk0Var.h(vl1VarOutlinedIconToggleButtonColors)) {
                        }
                        i3 |= i13;
                    } else {
                        vl1VarOutlinedIconToggleButtonColors = vl1Var;
                    }
                    i3 |= i13;
                } else {
                    vl1VarOutlinedIconToggleButtonColors = vl1Var;
                }
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        iwVar2 = iwVar;
                        if (kk0Var.h(iwVar2)) {
                        }
                        i3 |= i14;
                    } else {
                        iwVar2 = iwVar;
                    }
                    i3 |= i14;
                } else {
                    iwVar2 = iwVar;
                }
                i8 = i2 & Uuid.SIZE_BITS;
                if (i8 != 0) {
                    if ((12582912 & i) == 0) {
                        gh2Var2 = gh2Var;
                        if (kk0Var.h(gh2Var2)) {
                            i9 = 8388608;
                        } else {
                            i9 = 4194304;
                        }
                        i3 |= i9;
                    }
                    if ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                        i3 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        if (kk0Var.j(ne1Var)) {
                            i10 = 67108864;
                        } else {
                            i10 = 33554432;
                        }
                        i3 |= i10;
                    }
                    if ((38347923 & i3) == 38347922) {
                        kk0Var.X();
                        if ((i & 1) != 0) {
                            if (i4 != 0) {
                                cVar2 = c.i;
                            }
                            if (i6 != 0) {
                                z3 = true;
                            }
                            i11 = i2 & 16;
                            el1Var = el1.a;
                            if (i11 != 0) {
                                i3 &= -57345;
                                outlinedShape = el1Var.getOutlinedShape(kk0Var, 6);
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                                vl1VarOutlinedIconToggleButtonColors = el1Var.outlinedIconToggleButtonColors(kk0Var, 6);
                            }
                            if ((i2 & 64) != 0) {
                                iw iwVarOutlinedIconToggleButtonBorder1110 = el1Var.outlinedIconToggleButtonBorder(z3, z, kk0Var, ((i3 >> 9) & 14) | 384 | ((i3 << 3) & 112));
                                i3 &= -3670017;
                                iwVar2 = iwVarOutlinedIconToggleButtonBorder1110;
                            }
                            if (i8 != 0) {
                                vl1Var2 = vl1VarOutlinedIconToggleButtonColors;
                                iwVar3 = iwVar2;
                                gh2Var3 = null;
                                cVar3 = cVar2;
                            } else {
                                cVar3 = cVar2;
                                vl1Var2 = vl1VarOutlinedIconToggleButtonColors;
                                iwVar3 = iwVar2;
                                gh2Var3 = gh2Var2;
                            }
                        } else {
                            if (i4 != 0) {
                                cVar2 = c.i;
                            }
                            if (i6 != 0) {
                                z3 = true;
                            }
                            i11 = i2 & 16;
                            el1Var = el1.a;
                            if (i11 != 0) {
                                i3 &= -57345;
                                outlinedShape = el1Var.getOutlinedShape(kk0Var, 6);
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                                vl1VarOutlinedIconToggleButtonColors = el1Var.outlinedIconToggleButtonColors(kk0Var, 6);
                            }
                            if ((i2 & 64) != 0) {
                                iw iwVarOutlinedIconToggleButtonBorder1111 = el1Var.outlinedIconToggleButtonBorder(z3, z, kk0Var, ((i3 >> 9) & 14) | 384 | ((i3 << 3) & 112));
                                i3 &= -3670017;
                                iwVar2 = iwVarOutlinedIconToggleButtonBorder1111;
                            }
                            if (i8 != 0) {
                                vl1Var2 = vl1VarOutlinedIconToggleButtonColors;
                                iwVar3 = iwVar2;
                                gh2Var3 = null;
                                cVar3 = cVar2;
                            } else {
                                cVar3 = cVar2;
                                vl1Var2 = vl1VarOutlinedIconToggleButtonColors;
                                iwVar3 = iwVar2;
                                gh2Var3 = gh2Var2;
                            }
                        }
                        int i1111113 = i3;
                        rg3 rg3Var19 = outlinedShape;
                        kk0Var.s();
                        int i1111114 = i1111113 >> 9;
                        int i1111115 = (i1111114 & 896) | (i1111114 & 14) | ((i1111113 << 3) & 112);
                        boolean z111 = z3;
                        hq3.m212x54dd086a(z, le1Var2, we3.b(cVar3, false, fl1.o), z111, rg3Var19, ((re0) vl1Var2.containerColor$material3_release(z3, z, kk0Var, i1111115).getValue()).a, ((re0) vl1Var2.contentColor$material3_release(z3, z, kk0Var, i1111115).getValue()).a, 0.0f, 0.0f, iwVar3, gh2Var3, zg0.rememberComposableLambda(1207657396, true, new pl1(ne1Var), kk0Var, 54), kk0Var, (64638 & i1111113) | (1879048192 & (i1111113 << 9)), ((i1111113 >> 21) & 14) | 48, 384);
                        rg3Var2 = rg3Var19;
                        iwVar4 = iwVar3;
                        gh2Var4 = gh2Var3;
                        vl1Var3 = vl1Var2;
                        z4 = z111;
                        cVar4 = cVar3;
                    } else {
                        kk0Var.X();
                        if ((i & 1) != 0) {
                            if (i4 != 0) {
                                cVar2 = c.i;
                            }
                            if (i6 != 0) {
                                z3 = true;
                            }
                            i11 = i2 & 16;
                            el1Var = el1.a;
                            if (i11 != 0) {
                                i3 &= -57345;
                                outlinedShape = el1Var.getOutlinedShape(kk0Var, 6);
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                                vl1VarOutlinedIconToggleButtonColors = el1Var.outlinedIconToggleButtonColors(kk0Var, 6);
                            }
                            if ((i2 & 64) != 0) {
                                iw iwVarOutlinedIconToggleButtonBorder1112 = el1Var.outlinedIconToggleButtonBorder(z3, z, kk0Var, ((i3 >> 9) & 14) | 384 | ((i3 << 3) & 112));
                                i3 &= -3670017;
                                iwVar2 = iwVarOutlinedIconToggleButtonBorder1112;
                            }
                            if (i8 != 0) {
                                vl1Var2 = vl1VarOutlinedIconToggleButtonColors;
                                iwVar3 = iwVar2;
                                gh2Var3 = null;
                                cVar3 = cVar2;
                            } else {
                                cVar3 = cVar2;
                                vl1Var2 = vl1VarOutlinedIconToggleButtonColors;
                                iwVar3 = iwVar2;
                                gh2Var3 = gh2Var2;
                            }
                        } else {
                            if (i4 != 0) {
                                cVar2 = c.i;
                            }
                            if (i6 != 0) {
                                z3 = true;
                            }
                            i11 = i2 & 16;
                            el1Var = el1.a;
                            if (i11 != 0) {
                                i3 &= -57345;
                                outlinedShape = el1Var.getOutlinedShape(kk0Var, 6);
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                                vl1VarOutlinedIconToggleButtonColors = el1Var.outlinedIconToggleButtonColors(kk0Var, 6);
                            }
                            if ((i2 & 64) != 0) {
                                iw iwVarOutlinedIconToggleButtonBorder1113 = el1Var.outlinedIconToggleButtonBorder(z3, z, kk0Var, ((i3 >> 9) & 14) | 384 | ((i3 << 3) & 112));
                                i3 &= -3670017;
                                iwVar2 = iwVarOutlinedIconToggleButtonBorder1113;
                            }
                            if (i8 != 0) {
                                vl1Var2 = vl1VarOutlinedIconToggleButtonColors;
                                iwVar3 = iwVar2;
                                gh2Var3 = null;
                                cVar3 = cVar2;
                            } else {
                                cVar3 = cVar2;
                                vl1Var2 = vl1VarOutlinedIconToggleButtonColors;
                                iwVar3 = iwVar2;
                                gh2Var3 = gh2Var2;
                            }
                        }
                        int i1111116 = i3;
                        rg3 rg3Var110 = outlinedShape;
                        kk0Var.s();
                        int i1111117 = i1111116 >> 9;
                        int i1111118 = (i1111117 & 896) | (i1111117 & 14) | ((i1111116 << 3) & 112);
                        boolean z112 = z3;
                        hq3.m212x54dd086a(z, le1Var2, we3.b(cVar3, false, fl1.o), z112, rg3Var110, ((re0) vl1Var2.containerColor$material3_release(z3, z, kk0Var, i1111118).getValue()).a, ((re0) vl1Var2.contentColor$material3_release(z3, z, kk0Var, i1111118).getValue()).a, 0.0f, 0.0f, iwVar3, gh2Var3, zg0.rememberComposableLambda(1207657396, true, new pl1(ne1Var), kk0Var, 54), kk0Var, (64638 & i1111116) | (1879048192 & (i1111116 << 9)), ((i1111116 >> 21) & 14) | 48, 384);
                        rg3Var2 = rg3Var110;
                        iwVar4 = iwVar3;
                        gh2Var4 = gh2Var3;
                        vl1Var3 = vl1Var2;
                        z4 = z112;
                        cVar4 = cVar3;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new ql1(z, le1Var, cVar4, z4, rg3Var2, vl1Var3, iwVar4, gh2Var4, ne1Var, i, i2));
                    }
                }
                i3 |= 12582912;
                gh2Var2 = gh2Var;
                if ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                    i3 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    if (kk0Var.j(ne1Var)) {
                        i10 = 67108864;
                    } else {
                        i10 = 33554432;
                    }
                    i3 |= i10;
                }
                if ((38347923 & i3) == 38347922) {
                    kk0Var.X();
                    if ((i & 1) != 0) {
                        if (i4 != 0) {
                            cVar2 = c.i;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        }
                        i11 = i2 & 16;
                        el1Var = el1.a;
                        if (i11 != 0) {
                            i3 &= -57345;
                            outlinedShape = el1Var.getOutlinedShape(kk0Var, 6);
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            vl1VarOutlinedIconToggleButtonColors = el1Var.outlinedIconToggleButtonColors(kk0Var, 6);
                        }
                        if ((i2 & 64) != 0) {
                            iw iwVarOutlinedIconToggleButtonBorder1114 = el1Var.outlinedIconToggleButtonBorder(z3, z, kk0Var, ((i3 >> 9) & 14) | 384 | ((i3 << 3) & 112));
                            i3 &= -3670017;
                            iwVar2 = iwVarOutlinedIconToggleButtonBorder1114;
                        }
                        if (i8 != 0) {
                            vl1Var2 = vl1VarOutlinedIconToggleButtonColors;
                            iwVar3 = iwVar2;
                            gh2Var3 = null;
                            cVar3 = cVar2;
                        } else {
                            cVar3 = cVar2;
                            vl1Var2 = vl1VarOutlinedIconToggleButtonColors;
                            iwVar3 = iwVar2;
                            gh2Var3 = gh2Var2;
                        }
                    } else {
                        if (i4 != 0) {
                            cVar2 = c.i;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        }
                        i11 = i2 & 16;
                        el1Var = el1.a;
                        if (i11 != 0) {
                            i3 &= -57345;
                            outlinedShape = el1Var.getOutlinedShape(kk0Var, 6);
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            vl1VarOutlinedIconToggleButtonColors = el1Var.outlinedIconToggleButtonColors(kk0Var, 6);
                        }
                        if ((i2 & 64) != 0) {
                            iw iwVarOutlinedIconToggleButtonBorder1115 = el1Var.outlinedIconToggleButtonBorder(z3, z, kk0Var, ((i3 >> 9) & 14) | 384 | ((i3 << 3) & 112));
                            i3 &= -3670017;
                            iwVar2 = iwVarOutlinedIconToggleButtonBorder1115;
                        }
                        if (i8 != 0) {
                            vl1Var2 = vl1VarOutlinedIconToggleButtonColors;
                            iwVar3 = iwVar2;
                            gh2Var3 = null;
                            cVar3 = cVar2;
                        } else {
                            cVar3 = cVar2;
                            vl1Var2 = vl1VarOutlinedIconToggleButtonColors;
                            iwVar3 = iwVar2;
                            gh2Var3 = gh2Var2;
                        }
                    }
                    int i1111119 = i3;
                    rg3 rg3Var111 = outlinedShape;
                    kk0Var.s();
                    int i11111110 = i1111119 >> 9;
                    int i11111111 = (i11111110 & 896) | (i11111110 & 14) | ((i1111119 << 3) & 112);
                    boolean z113 = z3;
                    hq3.m212x54dd086a(z, le1Var2, we3.b(cVar3, false, fl1.o), z113, rg3Var111, ((re0) vl1Var2.containerColor$material3_release(z3, z, kk0Var, i11111111).getValue()).a, ((re0) vl1Var2.contentColor$material3_release(z3, z, kk0Var, i11111111).getValue()).a, 0.0f, 0.0f, iwVar3, gh2Var3, zg0.rememberComposableLambda(1207657396, true, new pl1(ne1Var), kk0Var, 54), kk0Var, (64638 & i1111119) | (1879048192 & (i1111119 << 9)), ((i1111119 >> 21) & 14) | 48, 384);
                    rg3Var2 = rg3Var111;
                    iwVar4 = iwVar3;
                    gh2Var4 = gh2Var3;
                    vl1Var3 = vl1Var2;
                    z4 = z113;
                    cVar4 = cVar3;
                } else {
                    kk0Var.X();
                    if ((i & 1) != 0) {
                        if (i4 != 0) {
                            cVar2 = c.i;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        }
                        i11 = i2 & 16;
                        el1Var = el1.a;
                        if (i11 != 0) {
                            i3 &= -57345;
                            outlinedShape = el1Var.getOutlinedShape(kk0Var, 6);
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            vl1VarOutlinedIconToggleButtonColors = el1Var.outlinedIconToggleButtonColors(kk0Var, 6);
                        }
                        if ((i2 & 64) != 0) {
                            iw iwVarOutlinedIconToggleButtonBorder1116 = el1Var.outlinedIconToggleButtonBorder(z3, z, kk0Var, ((i3 >> 9) & 14) | 384 | ((i3 << 3) & 112));
                            i3 &= -3670017;
                            iwVar2 = iwVarOutlinedIconToggleButtonBorder1116;
                        }
                        if (i8 != 0) {
                            vl1Var2 = vl1VarOutlinedIconToggleButtonColors;
                            iwVar3 = iwVar2;
                            gh2Var3 = null;
                            cVar3 = cVar2;
                        } else {
                            cVar3 = cVar2;
                            vl1Var2 = vl1VarOutlinedIconToggleButtonColors;
                            iwVar3 = iwVar2;
                            gh2Var3 = gh2Var2;
                        }
                    } else {
                        if (i4 != 0) {
                            cVar2 = c.i;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        }
                        i11 = i2 & 16;
                        el1Var = el1.a;
                        if (i11 != 0) {
                            i3 &= -57345;
                            outlinedShape = el1Var.getOutlinedShape(kk0Var, 6);
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            vl1VarOutlinedIconToggleButtonColors = el1Var.outlinedIconToggleButtonColors(kk0Var, 6);
                        }
                        if ((i2 & 64) != 0) {
                            iw iwVarOutlinedIconToggleButtonBorder1117 = el1Var.outlinedIconToggleButtonBorder(z3, z, kk0Var, ((i3 >> 9) & 14) | 384 | ((i3 << 3) & 112));
                            i3 &= -3670017;
                            iwVar2 = iwVarOutlinedIconToggleButtonBorder1117;
                        }
                        if (i8 != 0) {
                            vl1Var2 = vl1VarOutlinedIconToggleButtonColors;
                            iwVar3 = iwVar2;
                            gh2Var3 = null;
                            cVar3 = cVar2;
                        } else {
                            cVar3 = cVar2;
                            vl1Var2 = vl1VarOutlinedIconToggleButtonColors;
                            iwVar3 = iwVar2;
                            gh2Var3 = gh2Var2;
                        }
                    }
                    int i11111112 = i3;
                    rg3 rg3Var112 = outlinedShape;
                    kk0Var.s();
                    int i11111113 = i11111112 >> 9;
                    int i11111114 = (i11111113 & 896) | (i11111113 & 14) | ((i11111112 << 3) & 112);
                    boolean z114 = z3;
                    hq3.m212x54dd086a(z, le1Var2, we3.b(cVar3, false, fl1.o), z114, rg3Var112, ((re0) vl1Var2.containerColor$material3_release(z3, z, kk0Var, i11111114).getValue()).a, ((re0) vl1Var2.contentColor$material3_release(z3, z, kk0Var, i11111114).getValue()).a, 0.0f, 0.0f, iwVar3, gh2Var3, zg0.rememberComposableLambda(1207657396, true, new pl1(ne1Var), kk0Var, 54), kk0Var, (64638 & i11111112) | (1879048192 & (i11111112 << 9)), ((i11111112 >> 21) & 14) | 48, 384);
                    rg3Var2 = rg3Var112;
                    iwVar4 = iwVar3;
                    gh2Var4 = gh2Var3;
                    vl1Var3 = vl1Var2;
                    z4 = z114;
                    cVar4 = cVar3;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new ql1(z, le1Var, cVar4, z4, rg3Var2, vl1Var3, iwVar4, gh2Var4, ne1Var, i, i2));
                }
            }
            i3 |= 3072;
            z3 = z2;
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    outlinedShape = rg3Var;
                    if (kk0Var.h(outlinedShape)) {
                        i12 = 16384;
                    }
                    i3 |= i12;
                } else {
                    outlinedShape = rg3Var;
                }
                i12 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                i3 |= i12;
            } else {
                outlinedShape = rg3Var;
            }
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0) {
                    vl1VarOutlinedIconToggleButtonColors = vl1Var;
                    if (kk0Var.h(vl1VarOutlinedIconToggleButtonColors)) {
                    }
                    i3 |= i13;
                } else {
                    vl1VarOutlinedIconToggleButtonColors = vl1Var;
                }
                i3 |= i13;
            } else {
                vl1VarOutlinedIconToggleButtonColors = vl1Var;
            }
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    iwVar2 = iwVar;
                    if (kk0Var.h(iwVar2)) {
                    }
                    i3 |= i14;
                } else {
                    iwVar2 = iwVar;
                }
                i3 |= i14;
            } else {
                iwVar2 = iwVar;
            }
            i8 = i2 & Uuid.SIZE_BITS;
            if (i8 != 0) {
                if ((12582912 & i) == 0) {
                    gh2Var2 = gh2Var;
                    if (kk0Var.h(gh2Var2)) {
                        i9 = 8388608;
                    } else {
                        i9 = 4194304;
                    }
                    i3 |= i9;
                }
                if ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                    i3 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    if (kk0Var.j(ne1Var)) {
                        i10 = 67108864;
                    } else {
                        i10 = 33554432;
                    }
                    i3 |= i10;
                }
                if ((38347923 & i3) == 38347922) {
                    kk0Var.X();
                    if ((i & 1) != 0) {
                        if (i4 != 0) {
                            cVar2 = c.i;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        }
                        i11 = i2 & 16;
                        el1Var = el1.a;
                        if (i11 != 0) {
                            i3 &= -57345;
                            outlinedShape = el1Var.getOutlinedShape(kk0Var, 6);
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            vl1VarOutlinedIconToggleButtonColors = el1Var.outlinedIconToggleButtonColors(kk0Var, 6);
                        }
                        if ((i2 & 64) != 0) {
                            iw iwVarOutlinedIconToggleButtonBorder1118 = el1Var.outlinedIconToggleButtonBorder(z3, z, kk0Var, ((i3 >> 9) & 14) | 384 | ((i3 << 3) & 112));
                            i3 &= -3670017;
                            iwVar2 = iwVarOutlinedIconToggleButtonBorder1118;
                        }
                        if (i8 != 0) {
                            vl1Var2 = vl1VarOutlinedIconToggleButtonColors;
                            iwVar3 = iwVar2;
                            gh2Var3 = null;
                            cVar3 = cVar2;
                        } else {
                            cVar3 = cVar2;
                            vl1Var2 = vl1VarOutlinedIconToggleButtonColors;
                            iwVar3 = iwVar2;
                            gh2Var3 = gh2Var2;
                        }
                    } else {
                        if (i4 != 0) {
                            cVar2 = c.i;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        }
                        i11 = i2 & 16;
                        el1Var = el1.a;
                        if (i11 != 0) {
                            i3 &= -57345;
                            outlinedShape = el1Var.getOutlinedShape(kk0Var, 6);
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            vl1VarOutlinedIconToggleButtonColors = el1Var.outlinedIconToggleButtonColors(kk0Var, 6);
                        }
                        if ((i2 & 64) != 0) {
                            iw iwVarOutlinedIconToggleButtonBorder1119 = el1Var.outlinedIconToggleButtonBorder(z3, z, kk0Var, ((i3 >> 9) & 14) | 384 | ((i3 << 3) & 112));
                            i3 &= -3670017;
                            iwVar2 = iwVarOutlinedIconToggleButtonBorder1119;
                        }
                        if (i8 != 0) {
                            vl1Var2 = vl1VarOutlinedIconToggleButtonColors;
                            iwVar3 = iwVar2;
                            gh2Var3 = null;
                            cVar3 = cVar2;
                        } else {
                            cVar3 = cVar2;
                            vl1Var2 = vl1VarOutlinedIconToggleButtonColors;
                            iwVar3 = iwVar2;
                            gh2Var3 = gh2Var2;
                        }
                    }
                    int i11111115 = i3;
                    rg3 rg3Var113 = outlinedShape;
                    kk0Var.s();
                    int i11111116 = i11111115 >> 9;
                    int i11111117 = (i11111116 & 896) | (i11111116 & 14) | ((i11111115 << 3) & 112);
                    boolean z115 = z3;
                    hq3.m212x54dd086a(z, le1Var2, we3.b(cVar3, false, fl1.o), z115, rg3Var113, ((re0) vl1Var2.containerColor$material3_release(z3, z, kk0Var, i11111117).getValue()).a, ((re0) vl1Var2.contentColor$material3_release(z3, z, kk0Var, i11111117).getValue()).a, 0.0f, 0.0f, iwVar3, gh2Var3, zg0.rememberComposableLambda(1207657396, true, new pl1(ne1Var), kk0Var, 54), kk0Var, (64638 & i11111115) | (1879048192 & (i11111115 << 9)), ((i11111115 >> 21) & 14) | 48, 384);
                    rg3Var2 = rg3Var113;
                    iwVar4 = iwVar3;
                    gh2Var4 = gh2Var3;
                    vl1Var3 = vl1Var2;
                    z4 = z115;
                    cVar4 = cVar3;
                } else {
                    kk0Var.X();
                    if ((i & 1) != 0) {
                        if (i4 != 0) {
                            cVar2 = c.i;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        }
                        i11 = i2 & 16;
                        el1Var = el1.a;
                        if (i11 != 0) {
                            i3 &= -57345;
                            outlinedShape = el1Var.getOutlinedShape(kk0Var, 6);
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            vl1VarOutlinedIconToggleButtonColors = el1Var.outlinedIconToggleButtonColors(kk0Var, 6);
                        }
                        if ((i2 & 64) != 0) {
                            iw iwVarOutlinedIconToggleButtonBorder11110 = el1Var.outlinedIconToggleButtonBorder(z3, z, kk0Var, ((i3 >> 9) & 14) | 384 | ((i3 << 3) & 112));
                            i3 &= -3670017;
                            iwVar2 = iwVarOutlinedIconToggleButtonBorder11110;
                        }
                        if (i8 != 0) {
                            vl1Var2 = vl1VarOutlinedIconToggleButtonColors;
                            iwVar3 = iwVar2;
                            gh2Var3 = null;
                            cVar3 = cVar2;
                        } else {
                            cVar3 = cVar2;
                            vl1Var2 = vl1VarOutlinedIconToggleButtonColors;
                            iwVar3 = iwVar2;
                            gh2Var3 = gh2Var2;
                        }
                    } else {
                        if (i4 != 0) {
                            cVar2 = c.i;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        }
                        i11 = i2 & 16;
                        el1Var = el1.a;
                        if (i11 != 0) {
                            i3 &= -57345;
                            outlinedShape = el1Var.getOutlinedShape(kk0Var, 6);
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            vl1VarOutlinedIconToggleButtonColors = el1Var.outlinedIconToggleButtonColors(kk0Var, 6);
                        }
                        if ((i2 & 64) != 0) {
                            iw iwVarOutlinedIconToggleButtonBorder11111 = el1Var.outlinedIconToggleButtonBorder(z3, z, kk0Var, ((i3 >> 9) & 14) | 384 | ((i3 << 3) & 112));
                            i3 &= -3670017;
                            iwVar2 = iwVarOutlinedIconToggleButtonBorder11111;
                        }
                        if (i8 != 0) {
                            vl1Var2 = vl1VarOutlinedIconToggleButtonColors;
                            iwVar3 = iwVar2;
                            gh2Var3 = null;
                            cVar3 = cVar2;
                        } else {
                            cVar3 = cVar2;
                            vl1Var2 = vl1VarOutlinedIconToggleButtonColors;
                            iwVar3 = iwVar2;
                            gh2Var3 = gh2Var2;
                        }
                    }
                    int i11111118 = i3;
                    rg3 rg3Var114 = outlinedShape;
                    kk0Var.s();
                    int i11111119 = i11111118 >> 9;
                    int i111111110 = (i11111119 & 896) | (i11111119 & 14) | ((i11111118 << 3) & 112);
                    boolean z116 = z3;
                    hq3.m212x54dd086a(z, le1Var2, we3.b(cVar3, false, fl1.o), z116, rg3Var114, ((re0) vl1Var2.containerColor$material3_release(z3, z, kk0Var, i111111110).getValue()).a, ((re0) vl1Var2.contentColor$material3_release(z3, z, kk0Var, i111111110).getValue()).a, 0.0f, 0.0f, iwVar3, gh2Var3, zg0.rememberComposableLambda(1207657396, true, new pl1(ne1Var), kk0Var, 54), kk0Var, (64638 & i11111118) | (1879048192 & (i11111118 << 9)), ((i11111118 >> 21) & 14) | 48, 384);
                    rg3Var2 = rg3Var114;
                    iwVar4 = iwVar3;
                    gh2Var4 = gh2Var3;
                    vl1Var3 = vl1Var2;
                    z4 = z116;
                    cVar4 = cVar3;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new ql1(z, le1Var, cVar4, z4, rg3Var2, vl1Var3, iwVar4, gh2Var4, ne1Var, i, i2));
                }
            }
            i3 |= 12582912;
            gh2Var2 = gh2Var;
            if ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                i3 |= 100663296;
            } else if ((i & 100663296) == 0) {
                if (kk0Var.j(ne1Var)) {
                    i10 = 67108864;
                } else {
                    i10 = 33554432;
                }
                i3 |= i10;
            }
            if ((38347923 & i3) == 38347922) {
                kk0Var.X();
                if ((i & 1) != 0) {
                    if (i4 != 0) {
                        cVar2 = c.i;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    }
                    i11 = i2 & 16;
                    el1Var = el1.a;
                    if (i11 != 0) {
                        i3 &= -57345;
                        outlinedShape = el1Var.getOutlinedShape(kk0Var, 6);
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        vl1VarOutlinedIconToggleButtonColors = el1Var.outlinedIconToggleButtonColors(kk0Var, 6);
                    }
                    if ((i2 & 64) != 0) {
                        iw iwVarOutlinedIconToggleButtonBorder11112 = el1Var.outlinedIconToggleButtonBorder(z3, z, kk0Var, ((i3 >> 9) & 14) | 384 | ((i3 << 3) & 112));
                        i3 &= -3670017;
                        iwVar2 = iwVarOutlinedIconToggleButtonBorder11112;
                    }
                    if (i8 != 0) {
                        vl1Var2 = vl1VarOutlinedIconToggleButtonColors;
                        iwVar3 = iwVar2;
                        gh2Var3 = null;
                        cVar3 = cVar2;
                    } else {
                        cVar3 = cVar2;
                        vl1Var2 = vl1VarOutlinedIconToggleButtonColors;
                        iwVar3 = iwVar2;
                        gh2Var3 = gh2Var2;
                    }
                } else {
                    if (i4 != 0) {
                        cVar2 = c.i;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    }
                    i11 = i2 & 16;
                    el1Var = el1.a;
                    if (i11 != 0) {
                        i3 &= -57345;
                        outlinedShape = el1Var.getOutlinedShape(kk0Var, 6);
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        vl1VarOutlinedIconToggleButtonColors = el1Var.outlinedIconToggleButtonColors(kk0Var, 6);
                    }
                    if ((i2 & 64) != 0) {
                        iw iwVarOutlinedIconToggleButtonBorder11113 = el1Var.outlinedIconToggleButtonBorder(z3, z, kk0Var, ((i3 >> 9) & 14) | 384 | ((i3 << 3) & 112));
                        i3 &= -3670017;
                        iwVar2 = iwVarOutlinedIconToggleButtonBorder11113;
                    }
                    if (i8 != 0) {
                        vl1Var2 = vl1VarOutlinedIconToggleButtonColors;
                        iwVar3 = iwVar2;
                        gh2Var3 = null;
                        cVar3 = cVar2;
                    } else {
                        cVar3 = cVar2;
                        vl1Var2 = vl1VarOutlinedIconToggleButtonColors;
                        iwVar3 = iwVar2;
                        gh2Var3 = gh2Var2;
                    }
                }
                int i111111111 = i3;
                rg3 rg3Var115 = outlinedShape;
                kk0Var.s();
                int i111111112 = i111111111 >> 9;
                int i111111113 = (i111111112 & 896) | (i111111112 & 14) | ((i111111111 << 3) & 112);
                boolean z117 = z3;
                hq3.m212x54dd086a(z, le1Var2, we3.b(cVar3, false, fl1.o), z117, rg3Var115, ((re0) vl1Var2.containerColor$material3_release(z3, z, kk0Var, i111111113).getValue()).a, ((re0) vl1Var2.contentColor$material3_release(z3, z, kk0Var, i111111113).getValue()).a, 0.0f, 0.0f, iwVar3, gh2Var3, zg0.rememberComposableLambda(1207657396, true, new pl1(ne1Var), kk0Var, 54), kk0Var, (64638 & i111111111) | (1879048192 & (i111111111 << 9)), ((i111111111 >> 21) & 14) | 48, 384);
                rg3Var2 = rg3Var115;
                iwVar4 = iwVar3;
                gh2Var4 = gh2Var3;
                vl1Var3 = vl1Var2;
                z4 = z117;
                cVar4 = cVar3;
            } else {
                kk0Var.X();
                if ((i & 1) != 0) {
                    if (i4 != 0) {
                        cVar2 = c.i;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    }
                    i11 = i2 & 16;
                    el1Var = el1.a;
                    if (i11 != 0) {
                        i3 &= -57345;
                        outlinedShape = el1Var.getOutlinedShape(kk0Var, 6);
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        vl1VarOutlinedIconToggleButtonColors = el1Var.outlinedIconToggleButtonColors(kk0Var, 6);
                    }
                    if ((i2 & 64) != 0) {
                        iw iwVarOutlinedIconToggleButtonBorder11114 = el1Var.outlinedIconToggleButtonBorder(z3, z, kk0Var, ((i3 >> 9) & 14) | 384 | ((i3 << 3) & 112));
                        i3 &= -3670017;
                        iwVar2 = iwVarOutlinedIconToggleButtonBorder11114;
                    }
                    if (i8 != 0) {
                        vl1Var2 = vl1VarOutlinedIconToggleButtonColors;
                        iwVar3 = iwVar2;
                        gh2Var3 = null;
                        cVar3 = cVar2;
                    } else {
                        cVar3 = cVar2;
                        vl1Var2 = vl1VarOutlinedIconToggleButtonColors;
                        iwVar3 = iwVar2;
                        gh2Var3 = gh2Var2;
                    }
                } else {
                    if (i4 != 0) {
                        cVar2 = c.i;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    }
                    i11 = i2 & 16;
                    el1Var = el1.a;
                    if (i11 != 0) {
                        i3 &= -57345;
                        outlinedShape = el1Var.getOutlinedShape(kk0Var, 6);
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        vl1VarOutlinedIconToggleButtonColors = el1Var.outlinedIconToggleButtonColors(kk0Var, 6);
                    }
                    if ((i2 & 64) != 0) {
                        iw iwVarOutlinedIconToggleButtonBorder11115 = el1Var.outlinedIconToggleButtonBorder(z3, z, kk0Var, ((i3 >> 9) & 14) | 384 | ((i3 << 3) & 112));
                        i3 &= -3670017;
                        iwVar2 = iwVarOutlinedIconToggleButtonBorder11115;
                    }
                    if (i8 != 0) {
                        vl1Var2 = vl1VarOutlinedIconToggleButtonColors;
                        iwVar3 = iwVar2;
                        gh2Var3 = null;
                        cVar3 = cVar2;
                    } else {
                        cVar3 = cVar2;
                        vl1Var2 = vl1VarOutlinedIconToggleButtonColors;
                        iwVar3 = iwVar2;
                        gh2Var3 = gh2Var2;
                    }
                }
                int i111111114 = i3;
                rg3 rg3Var116 = outlinedShape;
                kk0Var.s();
                int i111111115 = i111111114 >> 9;
                int i111111116 = (i111111115 & 896) | (i111111115 & 14) | ((i111111114 << 3) & 112);
                boolean z118 = z3;
                hq3.m212x54dd086a(z, le1Var2, we3.b(cVar3, false, fl1.o), z118, rg3Var116, ((re0) vl1Var2.containerColor$material3_release(z3, z, kk0Var, i111111116).getValue()).a, ((re0) vl1Var2.contentColor$material3_release(z3, z, kk0Var, i111111116).getValue()).a, 0.0f, 0.0f, iwVar3, gh2Var3, zg0.rememberComposableLambda(1207657396, true, new pl1(ne1Var), kk0Var, 54), kk0Var, (64638 & i111111114) | (1879048192 & (i111111114 << 9)), ((i111111114 >> 21) & 14) | 48, 384);
                rg3Var2 = rg3Var116;
                iwVar4 = iwVar3;
                gh2Var4 = gh2Var3;
                vl1Var3 = vl1Var2;
                z4 = z118;
                cVar4 = cVar3;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new ql1(z, le1Var, cVar4, z4, rg3Var2, vl1Var3, iwVar4, gh2Var4, ne1Var, i, i2));
            }
        }
        i3 |= 384;
        cVar2 = cVar;
        i6 = i2 & 8;
        if (i6 != 0) {
            if ((i & 3072) == 0) {
                z3 = z2;
                if (kk0Var.i(z3)) {
                    i7 = 2048;
                } else {
                    i7 = 1024;
                }
                i3 |= i7;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    outlinedShape = rg3Var;
                    if (kk0Var.h(outlinedShape)) {
                        i12 = 16384;
                    }
                    i3 |= i12;
                } else {
                    outlinedShape = rg3Var;
                }
                i12 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                i3 |= i12;
            } else {
                outlinedShape = rg3Var;
            }
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0) {
                    vl1VarOutlinedIconToggleButtonColors = vl1Var;
                    if (kk0Var.h(vl1VarOutlinedIconToggleButtonColors)) {
                    }
                    i3 |= i13;
                } else {
                    vl1VarOutlinedIconToggleButtonColors = vl1Var;
                }
                i3 |= i13;
            } else {
                vl1VarOutlinedIconToggleButtonColors = vl1Var;
            }
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    iwVar2 = iwVar;
                    if (kk0Var.h(iwVar2)) {
                    }
                    i3 |= i14;
                } else {
                    iwVar2 = iwVar;
                }
                i3 |= i14;
            } else {
                iwVar2 = iwVar;
            }
            i8 = i2 & Uuid.SIZE_BITS;
            if (i8 != 0) {
                if ((12582912 & i) == 0) {
                    gh2Var2 = gh2Var;
                    if (kk0Var.h(gh2Var2)) {
                        i9 = 8388608;
                    } else {
                        i9 = 4194304;
                    }
                    i3 |= i9;
                }
                if ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                    i3 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    if (kk0Var.j(ne1Var)) {
                        i10 = 67108864;
                    } else {
                        i10 = 33554432;
                    }
                    i3 |= i10;
                }
                if ((38347923 & i3) == 38347922) {
                    kk0Var.X();
                    if ((i & 1) != 0) {
                        if (i4 != 0) {
                            cVar2 = c.i;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        }
                        i11 = i2 & 16;
                        el1Var = el1.a;
                        if (i11 != 0) {
                            i3 &= -57345;
                            outlinedShape = el1Var.getOutlinedShape(kk0Var, 6);
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            vl1VarOutlinedIconToggleButtonColors = el1Var.outlinedIconToggleButtonColors(kk0Var, 6);
                        }
                        if ((i2 & 64) != 0) {
                            iw iwVarOutlinedIconToggleButtonBorder11116 = el1Var.outlinedIconToggleButtonBorder(z3, z, kk0Var, ((i3 >> 9) & 14) | 384 | ((i3 << 3) & 112));
                            i3 &= -3670017;
                            iwVar2 = iwVarOutlinedIconToggleButtonBorder11116;
                        }
                        if (i8 != 0) {
                            vl1Var2 = vl1VarOutlinedIconToggleButtonColors;
                            iwVar3 = iwVar2;
                            gh2Var3 = null;
                            cVar3 = cVar2;
                        } else {
                            cVar3 = cVar2;
                            vl1Var2 = vl1VarOutlinedIconToggleButtonColors;
                            iwVar3 = iwVar2;
                            gh2Var3 = gh2Var2;
                        }
                    } else {
                        if (i4 != 0) {
                            cVar2 = c.i;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        }
                        i11 = i2 & 16;
                        el1Var = el1.a;
                        if (i11 != 0) {
                            i3 &= -57345;
                            outlinedShape = el1Var.getOutlinedShape(kk0Var, 6);
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            vl1VarOutlinedIconToggleButtonColors = el1Var.outlinedIconToggleButtonColors(kk0Var, 6);
                        }
                        if ((i2 & 64) != 0) {
                            iw iwVarOutlinedIconToggleButtonBorder11117 = el1Var.outlinedIconToggleButtonBorder(z3, z, kk0Var, ((i3 >> 9) & 14) | 384 | ((i3 << 3) & 112));
                            i3 &= -3670017;
                            iwVar2 = iwVarOutlinedIconToggleButtonBorder11117;
                        }
                        if (i8 != 0) {
                            vl1Var2 = vl1VarOutlinedIconToggleButtonColors;
                            iwVar3 = iwVar2;
                            gh2Var3 = null;
                            cVar3 = cVar2;
                        } else {
                            cVar3 = cVar2;
                            vl1Var2 = vl1VarOutlinedIconToggleButtonColors;
                            iwVar3 = iwVar2;
                            gh2Var3 = gh2Var2;
                        }
                    }
                    int i111111117 = i3;
                    rg3 rg3Var117 = outlinedShape;
                    kk0Var.s();
                    int i111111118 = i111111117 >> 9;
                    int i111111119 = (i111111118 & 896) | (i111111118 & 14) | ((i111111117 << 3) & 112);
                    boolean z119 = z3;
                    hq3.m212x54dd086a(z, le1Var2, we3.b(cVar3, false, fl1.o), z119, rg3Var117, ((re0) vl1Var2.containerColor$material3_release(z3, z, kk0Var, i111111119).getValue()).a, ((re0) vl1Var2.contentColor$material3_release(z3, z, kk0Var, i111111119).getValue()).a, 0.0f, 0.0f, iwVar3, gh2Var3, zg0.rememberComposableLambda(1207657396, true, new pl1(ne1Var), kk0Var, 54), kk0Var, (64638 & i111111117) | (1879048192 & (i111111117 << 9)), ((i111111117 >> 21) & 14) | 48, 384);
                    rg3Var2 = rg3Var117;
                    iwVar4 = iwVar3;
                    gh2Var4 = gh2Var3;
                    vl1Var3 = vl1Var2;
                    z4 = z119;
                    cVar4 = cVar3;
                } else {
                    kk0Var.X();
                    if ((i & 1) != 0) {
                        if (i4 != 0) {
                            cVar2 = c.i;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        }
                        i11 = i2 & 16;
                        el1Var = el1.a;
                        if (i11 != 0) {
                            i3 &= -57345;
                            outlinedShape = el1Var.getOutlinedShape(kk0Var, 6);
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            vl1VarOutlinedIconToggleButtonColors = el1Var.outlinedIconToggleButtonColors(kk0Var, 6);
                        }
                        if ((i2 & 64) != 0) {
                            iw iwVarOutlinedIconToggleButtonBorder11118 = el1Var.outlinedIconToggleButtonBorder(z3, z, kk0Var, ((i3 >> 9) & 14) | 384 | ((i3 << 3) & 112));
                            i3 &= -3670017;
                            iwVar2 = iwVarOutlinedIconToggleButtonBorder11118;
                        }
                        if (i8 != 0) {
                            vl1Var2 = vl1VarOutlinedIconToggleButtonColors;
                            iwVar3 = iwVar2;
                            gh2Var3 = null;
                            cVar3 = cVar2;
                        } else {
                            cVar3 = cVar2;
                            vl1Var2 = vl1VarOutlinedIconToggleButtonColors;
                            iwVar3 = iwVar2;
                            gh2Var3 = gh2Var2;
                        }
                    } else {
                        if (i4 != 0) {
                            cVar2 = c.i;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        }
                        i11 = i2 & 16;
                        el1Var = el1.a;
                        if (i11 != 0) {
                            i3 &= -57345;
                            outlinedShape = el1Var.getOutlinedShape(kk0Var, 6);
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            vl1VarOutlinedIconToggleButtonColors = el1Var.outlinedIconToggleButtonColors(kk0Var, 6);
                        }
                        if ((i2 & 64) != 0) {
                            iw iwVarOutlinedIconToggleButtonBorder11119 = el1Var.outlinedIconToggleButtonBorder(z3, z, kk0Var, ((i3 >> 9) & 14) | 384 | ((i3 << 3) & 112));
                            i3 &= -3670017;
                            iwVar2 = iwVarOutlinedIconToggleButtonBorder11119;
                        }
                        if (i8 != 0) {
                            vl1Var2 = vl1VarOutlinedIconToggleButtonColors;
                            iwVar3 = iwVar2;
                            gh2Var3 = null;
                            cVar3 = cVar2;
                        } else {
                            cVar3 = cVar2;
                            vl1Var2 = vl1VarOutlinedIconToggleButtonColors;
                            iwVar3 = iwVar2;
                            gh2Var3 = gh2Var2;
                        }
                    }
                    int i1111111110 = i3;
                    rg3 rg3Var118 = outlinedShape;
                    kk0Var.s();
                    int i1111111111 = i1111111110 >> 9;
                    int i1111111112 = (i1111111111 & 896) | (i1111111111 & 14) | ((i1111111110 << 3) & 112);
                    boolean z1110 = z3;
                    hq3.m212x54dd086a(z, le1Var2, we3.b(cVar3, false, fl1.o), z1110, rg3Var118, ((re0) vl1Var2.containerColor$material3_release(z3, z, kk0Var, i1111111112).getValue()).a, ((re0) vl1Var2.contentColor$material3_release(z3, z, kk0Var, i1111111112).getValue()).a, 0.0f, 0.0f, iwVar3, gh2Var3, zg0.rememberComposableLambda(1207657396, true, new pl1(ne1Var), kk0Var, 54), kk0Var, (64638 & i1111111110) | (1879048192 & (i1111111110 << 9)), ((i1111111110 >> 21) & 14) | 48, 384);
                    rg3Var2 = rg3Var118;
                    iwVar4 = iwVar3;
                    gh2Var4 = gh2Var3;
                    vl1Var3 = vl1Var2;
                    z4 = z1110;
                    cVar4 = cVar3;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new ql1(z, le1Var, cVar4, z4, rg3Var2, vl1Var3, iwVar4, gh2Var4, ne1Var, i, i2));
                }
            }
            i3 |= 12582912;
            gh2Var2 = gh2Var;
            if ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                i3 |= 100663296;
            } else if ((i & 100663296) == 0) {
                if (kk0Var.j(ne1Var)) {
                    i10 = 67108864;
                } else {
                    i10 = 33554432;
                }
                i3 |= i10;
            }
            if ((38347923 & i3) == 38347922) {
                kk0Var.X();
                if ((i & 1) != 0) {
                    if (i4 != 0) {
                        cVar2 = c.i;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    }
                    i11 = i2 & 16;
                    el1Var = el1.a;
                    if (i11 != 0) {
                        i3 &= -57345;
                        outlinedShape = el1Var.getOutlinedShape(kk0Var, 6);
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        vl1VarOutlinedIconToggleButtonColors = el1Var.outlinedIconToggleButtonColors(kk0Var, 6);
                    }
                    if ((i2 & 64) != 0) {
                        iw iwVarOutlinedIconToggleButtonBorder111110 = el1Var.outlinedIconToggleButtonBorder(z3, z, kk0Var, ((i3 >> 9) & 14) | 384 | ((i3 << 3) & 112));
                        i3 &= -3670017;
                        iwVar2 = iwVarOutlinedIconToggleButtonBorder111110;
                    }
                    if (i8 != 0) {
                        vl1Var2 = vl1VarOutlinedIconToggleButtonColors;
                        iwVar3 = iwVar2;
                        gh2Var3 = null;
                        cVar3 = cVar2;
                    } else {
                        cVar3 = cVar2;
                        vl1Var2 = vl1VarOutlinedIconToggleButtonColors;
                        iwVar3 = iwVar2;
                        gh2Var3 = gh2Var2;
                    }
                } else {
                    if (i4 != 0) {
                        cVar2 = c.i;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    }
                    i11 = i2 & 16;
                    el1Var = el1.a;
                    if (i11 != 0) {
                        i3 &= -57345;
                        outlinedShape = el1Var.getOutlinedShape(kk0Var, 6);
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        vl1VarOutlinedIconToggleButtonColors = el1Var.outlinedIconToggleButtonColors(kk0Var, 6);
                    }
                    if ((i2 & 64) != 0) {
                        iw iwVarOutlinedIconToggleButtonBorder111111 = el1Var.outlinedIconToggleButtonBorder(z3, z, kk0Var, ((i3 >> 9) & 14) | 384 | ((i3 << 3) & 112));
                        i3 &= -3670017;
                        iwVar2 = iwVarOutlinedIconToggleButtonBorder111111;
                    }
                    if (i8 != 0) {
                        vl1Var2 = vl1VarOutlinedIconToggleButtonColors;
                        iwVar3 = iwVar2;
                        gh2Var3 = null;
                        cVar3 = cVar2;
                    } else {
                        cVar3 = cVar2;
                        vl1Var2 = vl1VarOutlinedIconToggleButtonColors;
                        iwVar3 = iwVar2;
                        gh2Var3 = gh2Var2;
                    }
                }
                int i1111111113 = i3;
                rg3 rg3Var119 = outlinedShape;
                kk0Var.s();
                int i1111111114 = i1111111113 >> 9;
                int i1111111115 = (i1111111114 & 896) | (i1111111114 & 14) | ((i1111111113 << 3) & 112);
                boolean z1111 = z3;
                hq3.m212x54dd086a(z, le1Var2, we3.b(cVar3, false, fl1.o), z1111, rg3Var119, ((re0) vl1Var2.containerColor$material3_release(z3, z, kk0Var, i1111111115).getValue()).a, ((re0) vl1Var2.contentColor$material3_release(z3, z, kk0Var, i1111111115).getValue()).a, 0.0f, 0.0f, iwVar3, gh2Var3, zg0.rememberComposableLambda(1207657396, true, new pl1(ne1Var), kk0Var, 54), kk0Var, (64638 & i1111111113) | (1879048192 & (i1111111113 << 9)), ((i1111111113 >> 21) & 14) | 48, 384);
                rg3Var2 = rg3Var119;
                iwVar4 = iwVar3;
                gh2Var4 = gh2Var3;
                vl1Var3 = vl1Var2;
                z4 = z1111;
                cVar4 = cVar3;
            } else {
                kk0Var.X();
                if ((i & 1) != 0) {
                    if (i4 != 0) {
                        cVar2 = c.i;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    }
                    i11 = i2 & 16;
                    el1Var = el1.a;
                    if (i11 != 0) {
                        i3 &= -57345;
                        outlinedShape = el1Var.getOutlinedShape(kk0Var, 6);
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        vl1VarOutlinedIconToggleButtonColors = el1Var.outlinedIconToggleButtonColors(kk0Var, 6);
                    }
                    if ((i2 & 64) != 0) {
                        iw iwVarOutlinedIconToggleButtonBorder111112 = el1Var.outlinedIconToggleButtonBorder(z3, z, kk0Var, ((i3 >> 9) & 14) | 384 | ((i3 << 3) & 112));
                        i3 &= -3670017;
                        iwVar2 = iwVarOutlinedIconToggleButtonBorder111112;
                    }
                    if (i8 != 0) {
                        vl1Var2 = vl1VarOutlinedIconToggleButtonColors;
                        iwVar3 = iwVar2;
                        gh2Var3 = null;
                        cVar3 = cVar2;
                    } else {
                        cVar3 = cVar2;
                        vl1Var2 = vl1VarOutlinedIconToggleButtonColors;
                        iwVar3 = iwVar2;
                        gh2Var3 = gh2Var2;
                    }
                } else {
                    if (i4 != 0) {
                        cVar2 = c.i;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    }
                    i11 = i2 & 16;
                    el1Var = el1.a;
                    if (i11 != 0) {
                        i3 &= -57345;
                        outlinedShape = el1Var.getOutlinedShape(kk0Var, 6);
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        vl1VarOutlinedIconToggleButtonColors = el1Var.outlinedIconToggleButtonColors(kk0Var, 6);
                    }
                    if ((i2 & 64) != 0) {
                        iw iwVarOutlinedIconToggleButtonBorder111113 = el1Var.outlinedIconToggleButtonBorder(z3, z, kk0Var, ((i3 >> 9) & 14) | 384 | ((i3 << 3) & 112));
                        i3 &= -3670017;
                        iwVar2 = iwVarOutlinedIconToggleButtonBorder111113;
                    }
                    if (i8 != 0) {
                        vl1Var2 = vl1VarOutlinedIconToggleButtonColors;
                        iwVar3 = iwVar2;
                        gh2Var3 = null;
                        cVar3 = cVar2;
                    } else {
                        cVar3 = cVar2;
                        vl1Var2 = vl1VarOutlinedIconToggleButtonColors;
                        iwVar3 = iwVar2;
                        gh2Var3 = gh2Var2;
                    }
                }
                int i1111111116 = i3;
                rg3 rg3Var1110 = outlinedShape;
                kk0Var.s();
                int i1111111117 = i1111111116 >> 9;
                int i1111111118 = (i1111111117 & 896) | (i1111111117 & 14) | ((i1111111116 << 3) & 112);
                boolean z1112 = z3;
                hq3.m212x54dd086a(z, le1Var2, we3.b(cVar3, false, fl1.o), z1112, rg3Var1110, ((re0) vl1Var2.containerColor$material3_release(z3, z, kk0Var, i1111111118).getValue()).a, ((re0) vl1Var2.contentColor$material3_release(z3, z, kk0Var, i1111111118).getValue()).a, 0.0f, 0.0f, iwVar3, gh2Var3, zg0.rememberComposableLambda(1207657396, true, new pl1(ne1Var), kk0Var, 54), kk0Var, (64638 & i1111111116) | (1879048192 & (i1111111116 << 9)), ((i1111111116 >> 21) & 14) | 48, 384);
                rg3Var2 = rg3Var1110;
                iwVar4 = iwVar3;
                gh2Var4 = gh2Var3;
                vl1Var3 = vl1Var2;
                z4 = z1112;
                cVar4 = cVar3;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new ql1(z, le1Var, cVar4, z4, rg3Var2, vl1Var3, iwVar4, gh2Var4, ne1Var, i, i2));
            }
        }
        i3 |= 3072;
        z3 = z2;
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                outlinedShape = rg3Var;
                if (kk0Var.h(outlinedShape)) {
                    i12 = 16384;
                }
                i3 |= i12;
            } else {
                outlinedShape = rg3Var;
            }
            i12 = ConstantsKt.DEFAULT_BUFFER_SIZE;
            i3 |= i12;
        } else {
            outlinedShape = rg3Var;
        }
        if ((196608 & i) == 0) {
            if ((i2 & 32) == 0) {
                vl1VarOutlinedIconToggleButtonColors = vl1Var;
                if (kk0Var.h(vl1VarOutlinedIconToggleButtonColors)) {
                }
                i3 |= i13;
            } else {
                vl1VarOutlinedIconToggleButtonColors = vl1Var;
            }
            i3 |= i13;
        } else {
            vl1VarOutlinedIconToggleButtonColors = vl1Var;
        }
        if ((1572864 & i) == 0) {
            if ((i2 & 64) == 0) {
                iwVar2 = iwVar;
                if (kk0Var.h(iwVar2)) {
                }
                i3 |= i14;
            } else {
                iwVar2 = iwVar;
            }
            i3 |= i14;
        } else {
            iwVar2 = iwVar;
        }
        i8 = i2 & Uuid.SIZE_BITS;
        if (i8 != 0) {
            if ((12582912 & i) == 0) {
                gh2Var2 = gh2Var;
                if (kk0Var.h(gh2Var2)) {
                    i9 = 8388608;
                } else {
                    i9 = 4194304;
                }
                i3 |= i9;
            }
            if ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                i3 |= 100663296;
            } else if ((i & 100663296) == 0) {
                if (kk0Var.j(ne1Var)) {
                    i10 = 67108864;
                } else {
                    i10 = 33554432;
                }
                i3 |= i10;
            }
            if ((38347923 & i3) == 38347922) {
                kk0Var.X();
                if ((i & 1) != 0) {
                    if (i4 != 0) {
                        cVar2 = c.i;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    }
                    i11 = i2 & 16;
                    el1Var = el1.a;
                    if (i11 != 0) {
                        i3 &= -57345;
                        outlinedShape = el1Var.getOutlinedShape(kk0Var, 6);
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        vl1VarOutlinedIconToggleButtonColors = el1Var.outlinedIconToggleButtonColors(kk0Var, 6);
                    }
                    if ((i2 & 64) != 0) {
                        iw iwVarOutlinedIconToggleButtonBorder111114 = el1Var.outlinedIconToggleButtonBorder(z3, z, kk0Var, ((i3 >> 9) & 14) | 384 | ((i3 << 3) & 112));
                        i3 &= -3670017;
                        iwVar2 = iwVarOutlinedIconToggleButtonBorder111114;
                    }
                    if (i8 != 0) {
                        vl1Var2 = vl1VarOutlinedIconToggleButtonColors;
                        iwVar3 = iwVar2;
                        gh2Var3 = null;
                        cVar3 = cVar2;
                    } else {
                        cVar3 = cVar2;
                        vl1Var2 = vl1VarOutlinedIconToggleButtonColors;
                        iwVar3 = iwVar2;
                        gh2Var3 = gh2Var2;
                    }
                } else {
                    if (i4 != 0) {
                        cVar2 = c.i;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    }
                    i11 = i2 & 16;
                    el1Var = el1.a;
                    if (i11 != 0) {
                        i3 &= -57345;
                        outlinedShape = el1Var.getOutlinedShape(kk0Var, 6);
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        vl1VarOutlinedIconToggleButtonColors = el1Var.outlinedIconToggleButtonColors(kk0Var, 6);
                    }
                    if ((i2 & 64) != 0) {
                        iw iwVarOutlinedIconToggleButtonBorder111115 = el1Var.outlinedIconToggleButtonBorder(z3, z, kk0Var, ((i3 >> 9) & 14) | 384 | ((i3 << 3) & 112));
                        i3 &= -3670017;
                        iwVar2 = iwVarOutlinedIconToggleButtonBorder111115;
                    }
                    if (i8 != 0) {
                        vl1Var2 = vl1VarOutlinedIconToggleButtonColors;
                        iwVar3 = iwVar2;
                        gh2Var3 = null;
                        cVar3 = cVar2;
                    } else {
                        cVar3 = cVar2;
                        vl1Var2 = vl1VarOutlinedIconToggleButtonColors;
                        iwVar3 = iwVar2;
                        gh2Var3 = gh2Var2;
                    }
                }
                int i1111111119 = i3;
                rg3 rg3Var1111 = outlinedShape;
                kk0Var.s();
                int i11111111110 = i1111111119 >> 9;
                int i11111111111 = (i11111111110 & 896) | (i11111111110 & 14) | ((i1111111119 << 3) & 112);
                boolean z1113 = z3;
                hq3.m212x54dd086a(z, le1Var2, we3.b(cVar3, false, fl1.o), z1113, rg3Var1111, ((re0) vl1Var2.containerColor$material3_release(z3, z, kk0Var, i11111111111).getValue()).a, ((re0) vl1Var2.contentColor$material3_release(z3, z, kk0Var, i11111111111).getValue()).a, 0.0f, 0.0f, iwVar3, gh2Var3, zg0.rememberComposableLambda(1207657396, true, new pl1(ne1Var), kk0Var, 54), kk0Var, (64638 & i1111111119) | (1879048192 & (i1111111119 << 9)), ((i1111111119 >> 21) & 14) | 48, 384);
                rg3Var2 = rg3Var1111;
                iwVar4 = iwVar3;
                gh2Var4 = gh2Var3;
                vl1Var3 = vl1Var2;
                z4 = z1113;
                cVar4 = cVar3;
            } else {
                kk0Var.X();
                if ((i & 1) != 0) {
                    if (i4 != 0) {
                        cVar2 = c.i;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    }
                    i11 = i2 & 16;
                    el1Var = el1.a;
                    if (i11 != 0) {
                        i3 &= -57345;
                        outlinedShape = el1Var.getOutlinedShape(kk0Var, 6);
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        vl1VarOutlinedIconToggleButtonColors = el1Var.outlinedIconToggleButtonColors(kk0Var, 6);
                    }
                    if ((i2 & 64) != 0) {
                        iw iwVarOutlinedIconToggleButtonBorder111116 = el1Var.outlinedIconToggleButtonBorder(z3, z, kk0Var, ((i3 >> 9) & 14) | 384 | ((i3 << 3) & 112));
                        i3 &= -3670017;
                        iwVar2 = iwVarOutlinedIconToggleButtonBorder111116;
                    }
                    if (i8 != 0) {
                        vl1Var2 = vl1VarOutlinedIconToggleButtonColors;
                        iwVar3 = iwVar2;
                        gh2Var3 = null;
                        cVar3 = cVar2;
                    } else {
                        cVar3 = cVar2;
                        vl1Var2 = vl1VarOutlinedIconToggleButtonColors;
                        iwVar3 = iwVar2;
                        gh2Var3 = gh2Var2;
                    }
                } else {
                    if (i4 != 0) {
                        cVar2 = c.i;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    }
                    i11 = i2 & 16;
                    el1Var = el1.a;
                    if (i11 != 0) {
                        i3 &= -57345;
                        outlinedShape = el1Var.getOutlinedShape(kk0Var, 6);
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        vl1VarOutlinedIconToggleButtonColors = el1Var.outlinedIconToggleButtonColors(kk0Var, 6);
                    }
                    if ((i2 & 64) != 0) {
                        iw iwVarOutlinedIconToggleButtonBorder111117 = el1Var.outlinedIconToggleButtonBorder(z3, z, kk0Var, ((i3 >> 9) & 14) | 384 | ((i3 << 3) & 112));
                        i3 &= -3670017;
                        iwVar2 = iwVarOutlinedIconToggleButtonBorder111117;
                    }
                    if (i8 != 0) {
                        vl1Var2 = vl1VarOutlinedIconToggleButtonColors;
                        iwVar3 = iwVar2;
                        gh2Var3 = null;
                        cVar3 = cVar2;
                    } else {
                        cVar3 = cVar2;
                        vl1Var2 = vl1VarOutlinedIconToggleButtonColors;
                        iwVar3 = iwVar2;
                        gh2Var3 = gh2Var2;
                    }
                }
                int i11111111112 = i3;
                rg3 rg3Var1112 = outlinedShape;
                kk0Var.s();
                int i11111111113 = i11111111112 >> 9;
                int i11111111114 = (i11111111113 & 896) | (i11111111113 & 14) | ((i11111111112 << 3) & 112);
                boolean z1114 = z3;
                hq3.m212x54dd086a(z, le1Var2, we3.b(cVar3, false, fl1.o), z1114, rg3Var1112, ((re0) vl1Var2.containerColor$material3_release(z3, z, kk0Var, i11111111114).getValue()).a, ((re0) vl1Var2.contentColor$material3_release(z3, z, kk0Var, i11111111114).getValue()).a, 0.0f, 0.0f, iwVar3, gh2Var3, zg0.rememberComposableLambda(1207657396, true, new pl1(ne1Var), kk0Var, 54), kk0Var, (64638 & i11111111112) | (1879048192 & (i11111111112 << 9)), ((i11111111112 >> 21) & 14) | 48, 384);
                rg3Var2 = rg3Var1112;
                iwVar4 = iwVar3;
                gh2Var4 = gh2Var3;
                vl1Var3 = vl1Var2;
                z4 = z1114;
                cVar4 = cVar3;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new ql1(z, le1Var, cVar4, z4, rg3Var2, vl1Var3, iwVar4, gh2Var4, ne1Var, i, i2));
            }
        }
        i3 |= 12582912;
        gh2Var2 = gh2Var;
        if ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
            i3 |= 100663296;
        } else if ((i & 100663296) == 0) {
            if (kk0Var.j(ne1Var)) {
                i10 = 67108864;
            } else {
                i10 = 33554432;
            }
            i3 |= i10;
        }
        if ((38347923 & i3) == 38347922) {
            kk0Var.X();
            if ((i & 1) != 0) {
                if (i4 != 0) {
                    cVar2 = c.i;
                }
                if (i6 != 0) {
                    z3 = true;
                }
                i11 = i2 & 16;
                el1Var = el1.a;
                if (i11 != 0) {
                    i3 &= -57345;
                    outlinedShape = el1Var.getOutlinedShape(kk0Var, 6);
                }
                if ((i2 & 32) != 0) {
                    i3 &= -458753;
                    vl1VarOutlinedIconToggleButtonColors = el1Var.outlinedIconToggleButtonColors(kk0Var, 6);
                }
                if ((i2 & 64) != 0) {
                    iw iwVarOutlinedIconToggleButtonBorder111118 = el1Var.outlinedIconToggleButtonBorder(z3, z, kk0Var, ((i3 >> 9) & 14) | 384 | ((i3 << 3) & 112));
                    i3 &= -3670017;
                    iwVar2 = iwVarOutlinedIconToggleButtonBorder111118;
                }
                if (i8 != 0) {
                    vl1Var2 = vl1VarOutlinedIconToggleButtonColors;
                    iwVar3 = iwVar2;
                    gh2Var3 = null;
                    cVar3 = cVar2;
                } else {
                    cVar3 = cVar2;
                    vl1Var2 = vl1VarOutlinedIconToggleButtonColors;
                    iwVar3 = iwVar2;
                    gh2Var3 = gh2Var2;
                }
            } else {
                if (i4 != 0) {
                    cVar2 = c.i;
                }
                if (i6 != 0) {
                    z3 = true;
                }
                i11 = i2 & 16;
                el1Var = el1.a;
                if (i11 != 0) {
                    i3 &= -57345;
                    outlinedShape = el1Var.getOutlinedShape(kk0Var, 6);
                }
                if ((i2 & 32) != 0) {
                    i3 &= -458753;
                    vl1VarOutlinedIconToggleButtonColors = el1Var.outlinedIconToggleButtonColors(kk0Var, 6);
                }
                if ((i2 & 64) != 0) {
                    iw iwVarOutlinedIconToggleButtonBorder111119 = el1Var.outlinedIconToggleButtonBorder(z3, z, kk0Var, ((i3 >> 9) & 14) | 384 | ((i3 << 3) & 112));
                    i3 &= -3670017;
                    iwVar2 = iwVarOutlinedIconToggleButtonBorder111119;
                }
                if (i8 != 0) {
                    vl1Var2 = vl1VarOutlinedIconToggleButtonColors;
                    iwVar3 = iwVar2;
                    gh2Var3 = null;
                    cVar3 = cVar2;
                } else {
                    cVar3 = cVar2;
                    vl1Var2 = vl1VarOutlinedIconToggleButtonColors;
                    iwVar3 = iwVar2;
                    gh2Var3 = gh2Var2;
                }
            }
            int i11111111115 = i3;
            rg3 rg3Var1113 = outlinedShape;
            kk0Var.s();
            int i11111111116 = i11111111115 >> 9;
            int i11111111117 = (i11111111116 & 896) | (i11111111116 & 14) | ((i11111111115 << 3) & 112);
            boolean z1115 = z3;
            hq3.m212x54dd086a(z, le1Var2, we3.b(cVar3, false, fl1.o), z1115, rg3Var1113, ((re0) vl1Var2.containerColor$material3_release(z3, z, kk0Var, i11111111117).getValue()).a, ((re0) vl1Var2.contentColor$material3_release(z3, z, kk0Var, i11111111117).getValue()).a, 0.0f, 0.0f, iwVar3, gh2Var3, zg0.rememberComposableLambda(1207657396, true, new pl1(ne1Var), kk0Var, 54), kk0Var, (64638 & i11111111115) | (1879048192 & (i11111111115 << 9)), ((i11111111115 >> 21) & 14) | 48, 384);
            rg3Var2 = rg3Var1113;
            iwVar4 = iwVar3;
            gh2Var4 = gh2Var3;
            vl1Var3 = vl1Var2;
            z4 = z1115;
            cVar4 = cVar3;
        } else {
            kk0Var.X();
            if ((i & 1) != 0) {
                if (i4 != 0) {
                    cVar2 = c.i;
                }
                if (i6 != 0) {
                    z3 = true;
                }
                i11 = i2 & 16;
                el1Var = el1.a;
                if (i11 != 0) {
                    i3 &= -57345;
                    outlinedShape = el1Var.getOutlinedShape(kk0Var, 6);
                }
                if ((i2 & 32) != 0) {
                    i3 &= -458753;
                    vl1VarOutlinedIconToggleButtonColors = el1Var.outlinedIconToggleButtonColors(kk0Var, 6);
                }
                if ((i2 & 64) != 0) {
                    iw iwVarOutlinedIconToggleButtonBorder1111110 = el1Var.outlinedIconToggleButtonBorder(z3, z, kk0Var, ((i3 >> 9) & 14) | 384 | ((i3 << 3) & 112));
                    i3 &= -3670017;
                    iwVar2 = iwVarOutlinedIconToggleButtonBorder1111110;
                }
                if (i8 != 0) {
                    vl1Var2 = vl1VarOutlinedIconToggleButtonColors;
                    iwVar3 = iwVar2;
                    gh2Var3 = null;
                    cVar3 = cVar2;
                } else {
                    cVar3 = cVar2;
                    vl1Var2 = vl1VarOutlinedIconToggleButtonColors;
                    iwVar3 = iwVar2;
                    gh2Var3 = gh2Var2;
                }
            } else {
                if (i4 != 0) {
                    cVar2 = c.i;
                }
                if (i6 != 0) {
                    z3 = true;
                }
                i11 = i2 & 16;
                el1Var = el1.a;
                if (i11 != 0) {
                    i3 &= -57345;
                    outlinedShape = el1Var.getOutlinedShape(kk0Var, 6);
                }
                if ((i2 & 32) != 0) {
                    i3 &= -458753;
                    vl1VarOutlinedIconToggleButtonColors = el1Var.outlinedIconToggleButtonColors(kk0Var, 6);
                }
                if ((i2 & 64) != 0) {
                    iw iwVarOutlinedIconToggleButtonBorder1111111 = el1Var.outlinedIconToggleButtonBorder(z3, z, kk0Var, ((i3 >> 9) & 14) | 384 | ((i3 << 3) & 112));
                    i3 &= -3670017;
                    iwVar2 = iwVarOutlinedIconToggleButtonBorder1111111;
                }
                if (i8 != 0) {
                    vl1Var2 = vl1VarOutlinedIconToggleButtonColors;
                    iwVar3 = iwVar2;
                    gh2Var3 = null;
                    cVar3 = cVar2;
                } else {
                    cVar3 = cVar2;
                    vl1Var2 = vl1VarOutlinedIconToggleButtonColors;
                    iwVar3 = iwVar2;
                    gh2Var3 = gh2Var2;
                }
            }
            int i11111111118 = i3;
            rg3 rg3Var1114 = outlinedShape;
            kk0Var.s();
            int i11111111119 = i11111111118 >> 9;
            int i111111111110 = (i11111111119 & 896) | (i11111111119 & 14) | ((i11111111118 << 3) & 112);
            boolean z1116 = z3;
            hq3.m212x54dd086a(z, le1Var2, we3.b(cVar3, false, fl1.o), z1116, rg3Var1114, ((re0) vl1Var2.containerColor$material3_release(z3, z, kk0Var, i111111111110).getValue()).a, ((re0) vl1Var2.contentColor$material3_release(z3, z, kk0Var, i111111111110).getValue()).a, 0.0f, 0.0f, iwVar3, gh2Var3, zg0.rememberComposableLambda(1207657396, true, new pl1(ne1Var), kk0Var, 54), kk0Var, (64638 & i11111111118) | (1879048192 & (i11111111118 << 9)), ((i11111111118 >> 21) & 14) | 48, 384);
            rg3Var2 = rg3Var1114;
            iwVar4 = iwVar3;
            gh2Var4 = gh2Var3;
            vl1Var3 = vl1Var2;
            z4 = z1116;
            cVar4 = cVar3;
        }
        w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new ql1(z, le1Var, cVar4, z4, rg3Var2, vl1Var3, iwVar4, gh2Var4, ne1Var, i, i2));
        }
    }
}
