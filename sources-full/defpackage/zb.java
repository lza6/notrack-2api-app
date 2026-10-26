package defpackage;

import androidx.compose.runtime.Composer$Companion;
import androidx.compose.ui.c;
import androidx.compose.ui.platform.CompositionLocalsKt;
import kotlin.io.ConstantsKt;
import kotlin.uuid.Uuid;
import org.scilab.forge.jlatexmath.FontInfo;

/* JADX INFO: loaded from: classes.dex */
public abstract class zb {
    public static final ux2 a = new ux2(14);

    /* JADX WARN: Code duplicated, block: B:100:0x0114  */
    /* JADX WARN: Code duplicated, block: B:102:0x011e  */
    /* JADX WARN: Code duplicated, block: B:103:0x012b  */
    /* JADX WARN: Code duplicated, block: B:107:0x0176  */
    /* JADX WARN: Code duplicated, block: B:109:? A[RETURN, SYNTHETIC] */
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
    /* JADX WARN: Code duplicated, block: B:71:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:73:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:76:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:93:0x0103 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:94:0x0105  */
    /* JADX WARN: Code duplicated, block: B:95:0x0108  */
    /* JADX WARN: Code duplicated, block: B:97:0x010b  */
    @cv0
    /* JADX INFO: renamed from: DropdownMenu-4kj-_NE, reason: not valid java name */
    public static final void m1892xb74b967f(boolean z, je1 je1Var, c cVar, long j, rb3 rb3Var, ux2 ux2Var, oe1 oe1Var, ck0 ck0Var, int i, int i2) {
        boolean z2;
        int i3;
        je1 je1Var2;
        c cVar2;
        int i4;
        long jE;
        int i5;
        rb3 rb3VarRememberScrollState;
        int i6;
        ux2 ux2Var2;
        int i7;
        int i8;
        c cVar3;
        long j2;
        rb3 rb3Var2;
        ux2 ux2Var3;
        c cVar4;
        kk0 kk0Var;
        long j3;
        rb3 rb3Var3;
        ux2 ux2Var4;
        w33 w33VarV;
        int i9;
        kk0 kk0Var2 = (kk0) ck0Var;
        kk0Var2.c0(-1137929566);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            z2 = z;
        } else {
            z2 = z;
            if ((i & 6) == 0) {
                i3 = (kk0Var2.i(z2) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            je1Var2 = je1Var;
        } else {
            je1Var2 = je1Var;
            if ((i & 48) == 0) {
                i3 |= kk0Var2.j(je1Var2) ? 32 : 16;
            }
        }
        int i10 = i2 & 4;
        if (i10 == 0) {
            if ((i & 384) == 0) {
                cVar2 = cVar;
                i3 |= kk0Var2.h(cVar2) ? FontInfo.NUMBER_OF_CHAR_CODES : Uuid.SIZE_BITS;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    jE = j;
                    if (kk0Var2.g(jE)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        rb3VarRememberScrollState = rb3Var;
                        if (kk0Var2.h(rb3VarRememberScrollState)) {
                            i9 = 16384;
                        }
                        i3 |= i9;
                    } else {
                        rb3VarRememberScrollState = rb3Var;
                    }
                    i9 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                    i3 |= i9;
                } else {
                    rb3VarRememberScrollState = rb3Var;
                }
                i6 = i2 & 32;
                if (i6 != 0) {
                    if ((196608 & i) == 0) {
                        ux2Var2 = ux2Var;
                        if (kk0Var2.h(ux2Var2)) {
                            i7 = 131072;
                        } else {
                            i7 = 65536;
                        }
                        i3 |= i7;
                    }
                    if ((i2 & 64) != 0) {
                        if ((i & 1572864) == 0) {
                            if (kk0Var2.j(oe1Var)) {
                                i8 = 1048576;
                            } else {
                                i8 = 524288;
                            }
                            i3 |= i8;
                        }
                        if ((599187 & i3) == 599186 || !kk0Var2.F()) {
                            kk0Var2.X();
                            if ((i & 1) != 0 || kk0Var2.D()) {
                                if (i10 != 0) {
                                    cVar3 = c.i;
                                } else {
                                    cVar3 = cVar2;
                                }
                                if (i4 != 0) {
                                    jE = xr0.E();
                                }
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                    rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var2, 0, 1);
                                }
                                if (i6 != 0) {
                                    cVar4 = cVar3;
                                    ux2Var3 = new ux2(14);
                                    j2 = jE;
                                    rb3Var2 = rb3VarRememberScrollState;
                                } else {
                                    j2 = jE;
                                    rb3Var2 = rb3VarRememberScrollState;
                                    ux2Var3 = ux2Var2;
                                    cVar4 = cVar3;
                                }
                            } else {
                                kk0Var2.V();
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                }
                                j2 = jE;
                                rb3Var2 = rb3VarRememberScrollState;
                                ux2Var3 = ux2Var2;
                                cVar4 = cVar2;
                            }
                            kk0Var2.s();
                            ic2 ic2Var = ic2.a;
                            kk0Var = kk0Var2;
                            m1894xe1b4b74(z2, je1Var2, cVar4, j2, rb3Var2, ux2Var3, ic2Var.getShape(kk0Var2, 6), ic2Var.getContainerColor(kk0Var2, 6), 0.0f, 3.0f, null, oe1Var, kk0Var, (i3 & 14) | 905969664 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3), ((i3 >> 15) & 112) | 6, 0);
                            cVar2 = cVar4;
                            j3 = j2;
                            rb3Var3 = rb3Var2;
                            ux2Var4 = ux2Var3;
                        } else {
                            kk0Var2.V();
                            kk0Var = kk0Var2;
                            j3 = jE;
                            rb3Var3 = rb3VarRememberScrollState;
                            ux2Var4 = ux2Var2;
                        }
                        w33VarV = kk0Var.v();
                        if (w33VarV != null) {
                            w33VarV.updateScope(new wb(z, je1Var, cVar2, j3, rb3Var3, ux2Var4, oe1Var, i, i2));
                        }
                    }
                    i3 |= 1572864;
                    if ((599187 & i3) == 599186) {
                        kk0Var2.X();
                        if ((i & 1) != 0) {
                            if (i10 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i4 != 0) {
                                jE = xr0.E();
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                                rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var2, 0, 1);
                            }
                            if (i6 != 0) {
                                cVar4 = cVar3;
                                ux2Var3 = new ux2(14);
                                j2 = jE;
                                rb3Var2 = rb3VarRememberScrollState;
                            } else {
                                j2 = jE;
                                rb3Var2 = rb3VarRememberScrollState;
                                ux2Var3 = ux2Var2;
                                cVar4 = cVar3;
                            }
                        } else {
                            if (i10 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i4 != 0) {
                                jE = xr0.E();
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                                rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var2, 0, 1);
                            }
                            if (i6 != 0) {
                                cVar4 = cVar3;
                                ux2Var3 = new ux2(14);
                                j2 = jE;
                                rb3Var2 = rb3VarRememberScrollState;
                            } else {
                                j2 = jE;
                                rb3Var2 = rb3VarRememberScrollState;
                                ux2Var3 = ux2Var2;
                                cVar4 = cVar3;
                            }
                        }
                        kk0Var2.s();
                        ic2 ic2Var2 = ic2.a;
                        kk0Var = kk0Var2;
                        m1894xe1b4b74(z2, je1Var2, cVar4, j2, rb3Var2, ux2Var3, ic2Var2.getShape(kk0Var2, 6), ic2Var2.getContainerColor(kk0Var2, 6), 0.0f, 3.0f, null, oe1Var, kk0Var, (i3 & 14) | 905969664 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3), ((i3 >> 15) & 112) | 6, 0);
                        cVar2 = cVar4;
                        j3 = j2;
                        rb3Var3 = rb3Var2;
                        ux2Var4 = ux2Var3;
                    } else {
                        kk0Var2.X();
                        if ((i & 1) != 0) {
                            if (i10 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i4 != 0) {
                                jE = xr0.E();
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                                rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var2, 0, 1);
                            }
                            if (i6 != 0) {
                                cVar4 = cVar3;
                                ux2Var3 = new ux2(14);
                                j2 = jE;
                                rb3Var2 = rb3VarRememberScrollState;
                            } else {
                                j2 = jE;
                                rb3Var2 = rb3VarRememberScrollState;
                                ux2Var3 = ux2Var2;
                                cVar4 = cVar3;
                            }
                        } else {
                            if (i10 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i4 != 0) {
                                jE = xr0.E();
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                                rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var2, 0, 1);
                            }
                            if (i6 != 0) {
                                cVar4 = cVar3;
                                ux2Var3 = new ux2(14);
                                j2 = jE;
                                rb3Var2 = rb3VarRememberScrollState;
                            } else {
                                j2 = jE;
                                rb3Var2 = rb3VarRememberScrollState;
                                ux2Var3 = ux2Var2;
                                cVar4 = cVar3;
                            }
                        }
                        kk0Var2.s();
                        ic2 ic2Var3 = ic2.a;
                        kk0Var = kk0Var2;
                        m1894xe1b4b74(z2, je1Var2, cVar4, j2, rb3Var2, ux2Var3, ic2Var3.getShape(kk0Var2, 6), ic2Var3.getContainerColor(kk0Var2, 6), 0.0f, 3.0f, null, oe1Var, kk0Var, (i3 & 14) | 905969664 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3), ((i3 >> 15) & 112) | 6, 0);
                        cVar2 = cVar4;
                        j3 = j2;
                        rb3Var3 = rb3Var2;
                        ux2Var4 = ux2Var3;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new wb(z, je1Var, cVar2, j3, rb3Var3, ux2Var4, oe1Var, i, i2));
                    }
                }
                i3 |= 196608;
                ux2Var2 = ux2Var;
                if ((i2 & 64) != 0) {
                    if ((i & 1572864) == 0) {
                        if (kk0Var2.j(oe1Var)) {
                            i8 = 1048576;
                        } else {
                            i8 = 524288;
                        }
                        i3 |= i8;
                    }
                    if ((599187 & i3) == 599186) {
                        kk0Var2.X();
                        if ((i & 1) != 0) {
                            if (i10 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i4 != 0) {
                                jE = xr0.E();
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                                rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var2, 0, 1);
                            }
                            if (i6 != 0) {
                                cVar4 = cVar3;
                                ux2Var3 = new ux2(14);
                                j2 = jE;
                                rb3Var2 = rb3VarRememberScrollState;
                            } else {
                                j2 = jE;
                                rb3Var2 = rb3VarRememberScrollState;
                                ux2Var3 = ux2Var2;
                                cVar4 = cVar3;
                            }
                        } else {
                            if (i10 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i4 != 0) {
                                jE = xr0.E();
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                                rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var2, 0, 1);
                            }
                            if (i6 != 0) {
                                cVar4 = cVar3;
                                ux2Var3 = new ux2(14);
                                j2 = jE;
                                rb3Var2 = rb3VarRememberScrollState;
                            } else {
                                j2 = jE;
                                rb3Var2 = rb3VarRememberScrollState;
                                ux2Var3 = ux2Var2;
                                cVar4 = cVar3;
                            }
                        }
                        kk0Var2.s();
                        ic2 ic2Var4 = ic2.a;
                        kk0Var = kk0Var2;
                        m1894xe1b4b74(z2, je1Var2, cVar4, j2, rb3Var2, ux2Var3, ic2Var4.getShape(kk0Var2, 6), ic2Var4.getContainerColor(kk0Var2, 6), 0.0f, 3.0f, null, oe1Var, kk0Var, (i3 & 14) | 905969664 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3), ((i3 >> 15) & 112) | 6, 0);
                        cVar2 = cVar4;
                        j3 = j2;
                        rb3Var3 = rb3Var2;
                        ux2Var4 = ux2Var3;
                    } else {
                        kk0Var2.X();
                        if ((i & 1) != 0) {
                            if (i10 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i4 != 0) {
                                jE = xr0.E();
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                                rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var2, 0, 1);
                            }
                            if (i6 != 0) {
                                cVar4 = cVar3;
                                ux2Var3 = new ux2(14);
                                j2 = jE;
                                rb3Var2 = rb3VarRememberScrollState;
                            } else {
                                j2 = jE;
                                rb3Var2 = rb3VarRememberScrollState;
                                ux2Var3 = ux2Var2;
                                cVar4 = cVar3;
                            }
                        } else {
                            if (i10 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i4 != 0) {
                                jE = xr0.E();
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                                rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var2, 0, 1);
                            }
                            if (i6 != 0) {
                                cVar4 = cVar3;
                                ux2Var3 = new ux2(14);
                                j2 = jE;
                                rb3Var2 = rb3VarRememberScrollState;
                            } else {
                                j2 = jE;
                                rb3Var2 = rb3VarRememberScrollState;
                                ux2Var3 = ux2Var2;
                                cVar4 = cVar3;
                            }
                        }
                        kk0Var2.s();
                        ic2 ic2Var5 = ic2.a;
                        kk0Var = kk0Var2;
                        m1894xe1b4b74(z2, je1Var2, cVar4, j2, rb3Var2, ux2Var3, ic2Var5.getShape(kk0Var2, 6), ic2Var5.getContainerColor(kk0Var2, 6), 0.0f, 3.0f, null, oe1Var, kk0Var, (i3 & 14) | 905969664 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3), ((i3 >> 15) & 112) | 6, 0);
                        cVar2 = cVar4;
                        j3 = j2;
                        rb3Var3 = rb3Var2;
                        ux2Var4 = ux2Var3;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new wb(z, je1Var, cVar2, j3, rb3Var3, ux2Var4, oe1Var, i, i2));
                    }
                }
                i3 |= 1572864;
                if ((599187 & i3) == 599186) {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            jE = xr0.E();
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var2, 0, 1);
                        }
                        if (i6 != 0) {
                            cVar4 = cVar3;
                            ux2Var3 = new ux2(14);
                            j2 = jE;
                            rb3Var2 = rb3VarRememberScrollState;
                        } else {
                            j2 = jE;
                            rb3Var2 = rb3VarRememberScrollState;
                            ux2Var3 = ux2Var2;
                            cVar4 = cVar3;
                        }
                    } else {
                        if (i10 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            jE = xr0.E();
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var2, 0, 1);
                        }
                        if (i6 != 0) {
                            cVar4 = cVar3;
                            ux2Var3 = new ux2(14);
                            j2 = jE;
                            rb3Var2 = rb3VarRememberScrollState;
                        } else {
                            j2 = jE;
                            rb3Var2 = rb3VarRememberScrollState;
                            ux2Var3 = ux2Var2;
                            cVar4 = cVar3;
                        }
                    }
                    kk0Var2.s();
                    ic2 ic2Var6 = ic2.a;
                    kk0Var = kk0Var2;
                    m1894xe1b4b74(z2, je1Var2, cVar4, j2, rb3Var2, ux2Var3, ic2Var6.getShape(kk0Var2, 6), ic2Var6.getContainerColor(kk0Var2, 6), 0.0f, 3.0f, null, oe1Var, kk0Var, (i3 & 14) | 905969664 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3), ((i3 >> 15) & 112) | 6, 0);
                    cVar2 = cVar4;
                    j3 = j2;
                    rb3Var3 = rb3Var2;
                    ux2Var4 = ux2Var3;
                } else {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            jE = xr0.E();
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var2, 0, 1);
                        }
                        if (i6 != 0) {
                            cVar4 = cVar3;
                            ux2Var3 = new ux2(14);
                            j2 = jE;
                            rb3Var2 = rb3VarRememberScrollState;
                        } else {
                            j2 = jE;
                            rb3Var2 = rb3VarRememberScrollState;
                            ux2Var3 = ux2Var2;
                            cVar4 = cVar3;
                        }
                    } else {
                        if (i10 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            jE = xr0.E();
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var2, 0, 1);
                        }
                        if (i6 != 0) {
                            cVar4 = cVar3;
                            ux2Var3 = new ux2(14);
                            j2 = jE;
                            rb3Var2 = rb3VarRememberScrollState;
                        } else {
                            j2 = jE;
                            rb3Var2 = rb3VarRememberScrollState;
                            ux2Var3 = ux2Var2;
                            cVar4 = cVar3;
                        }
                    }
                    kk0Var2.s();
                    ic2 ic2Var7 = ic2.a;
                    kk0Var = kk0Var2;
                    m1894xe1b4b74(z2, je1Var2, cVar4, j2, rb3Var2, ux2Var3, ic2Var7.getShape(kk0Var2, 6), ic2Var7.getContainerColor(kk0Var2, 6), 0.0f, 3.0f, null, oe1Var, kk0Var, (i3 & 14) | 905969664 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3), ((i3 >> 15) & 112) | 6, 0);
                    cVar2 = cVar4;
                    j3 = j2;
                    rb3Var3 = rb3Var2;
                    ux2Var4 = ux2Var3;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new wb(z, je1Var, cVar2, j3, rb3Var3, ux2Var4, oe1Var, i, i2));
                }
            }
            i3 |= 3072;
            jE = j;
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    rb3VarRememberScrollState = rb3Var;
                    if (kk0Var2.h(rb3VarRememberScrollState)) {
                        i9 = 16384;
                    }
                    i3 |= i9;
                } else {
                    rb3VarRememberScrollState = rb3Var;
                }
                i9 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                i3 |= i9;
            } else {
                rb3VarRememberScrollState = rb3Var;
            }
            i6 = i2 & 32;
            if (i6 != 0) {
                if ((196608 & i) == 0) {
                    ux2Var2 = ux2Var;
                    if (kk0Var2.h(ux2Var2)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
                if ((i2 & 64) != 0) {
                    if ((i & 1572864) == 0) {
                        if (kk0Var2.j(oe1Var)) {
                            i8 = 1048576;
                        } else {
                            i8 = 524288;
                        }
                        i3 |= i8;
                    }
                    if ((599187 & i3) == 599186) {
                        kk0Var2.X();
                        if ((i & 1) != 0) {
                            if (i10 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i4 != 0) {
                                jE = xr0.E();
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                                rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var2, 0, 1);
                            }
                            if (i6 != 0) {
                                cVar4 = cVar3;
                                ux2Var3 = new ux2(14);
                                j2 = jE;
                                rb3Var2 = rb3VarRememberScrollState;
                            } else {
                                j2 = jE;
                                rb3Var2 = rb3VarRememberScrollState;
                                ux2Var3 = ux2Var2;
                                cVar4 = cVar3;
                            }
                        } else {
                            if (i10 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i4 != 0) {
                                jE = xr0.E();
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                                rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var2, 0, 1);
                            }
                            if (i6 != 0) {
                                cVar4 = cVar3;
                                ux2Var3 = new ux2(14);
                                j2 = jE;
                                rb3Var2 = rb3VarRememberScrollState;
                            } else {
                                j2 = jE;
                                rb3Var2 = rb3VarRememberScrollState;
                                ux2Var3 = ux2Var2;
                                cVar4 = cVar3;
                            }
                        }
                        kk0Var2.s();
                        ic2 ic2Var8 = ic2.a;
                        kk0Var = kk0Var2;
                        m1894xe1b4b74(z2, je1Var2, cVar4, j2, rb3Var2, ux2Var3, ic2Var8.getShape(kk0Var2, 6), ic2Var8.getContainerColor(kk0Var2, 6), 0.0f, 3.0f, null, oe1Var, kk0Var, (i3 & 14) | 905969664 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3), ((i3 >> 15) & 112) | 6, 0);
                        cVar2 = cVar4;
                        j3 = j2;
                        rb3Var3 = rb3Var2;
                        ux2Var4 = ux2Var3;
                    } else {
                        kk0Var2.X();
                        if ((i & 1) != 0) {
                            if (i10 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i4 != 0) {
                                jE = xr0.E();
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                                rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var2, 0, 1);
                            }
                            if (i6 != 0) {
                                cVar4 = cVar3;
                                ux2Var3 = new ux2(14);
                                j2 = jE;
                                rb3Var2 = rb3VarRememberScrollState;
                            } else {
                                j2 = jE;
                                rb3Var2 = rb3VarRememberScrollState;
                                ux2Var3 = ux2Var2;
                                cVar4 = cVar3;
                            }
                        } else {
                            if (i10 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i4 != 0) {
                                jE = xr0.E();
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                                rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var2, 0, 1);
                            }
                            if (i6 != 0) {
                                cVar4 = cVar3;
                                ux2Var3 = new ux2(14);
                                j2 = jE;
                                rb3Var2 = rb3VarRememberScrollState;
                            } else {
                                j2 = jE;
                                rb3Var2 = rb3VarRememberScrollState;
                                ux2Var3 = ux2Var2;
                                cVar4 = cVar3;
                            }
                        }
                        kk0Var2.s();
                        ic2 ic2Var9 = ic2.a;
                        kk0Var = kk0Var2;
                        m1894xe1b4b74(z2, je1Var2, cVar4, j2, rb3Var2, ux2Var3, ic2Var9.getShape(kk0Var2, 6), ic2Var9.getContainerColor(kk0Var2, 6), 0.0f, 3.0f, null, oe1Var, kk0Var, (i3 & 14) | 905969664 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3), ((i3 >> 15) & 112) | 6, 0);
                        cVar2 = cVar4;
                        j3 = j2;
                        rb3Var3 = rb3Var2;
                        ux2Var4 = ux2Var3;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new wb(z, je1Var, cVar2, j3, rb3Var3, ux2Var4, oe1Var, i, i2));
                    }
                }
                i3 |= 1572864;
                if ((599187 & i3) == 599186) {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            jE = xr0.E();
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var2, 0, 1);
                        }
                        if (i6 != 0) {
                            cVar4 = cVar3;
                            ux2Var3 = new ux2(14);
                            j2 = jE;
                            rb3Var2 = rb3VarRememberScrollState;
                        } else {
                            j2 = jE;
                            rb3Var2 = rb3VarRememberScrollState;
                            ux2Var3 = ux2Var2;
                            cVar4 = cVar3;
                        }
                    } else {
                        if (i10 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            jE = xr0.E();
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var2, 0, 1);
                        }
                        if (i6 != 0) {
                            cVar4 = cVar3;
                            ux2Var3 = new ux2(14);
                            j2 = jE;
                            rb3Var2 = rb3VarRememberScrollState;
                        } else {
                            j2 = jE;
                            rb3Var2 = rb3VarRememberScrollState;
                            ux2Var3 = ux2Var2;
                            cVar4 = cVar3;
                        }
                    }
                    kk0Var2.s();
                    ic2 ic2Var10 = ic2.a;
                    kk0Var = kk0Var2;
                    m1894xe1b4b74(z2, je1Var2, cVar4, j2, rb3Var2, ux2Var3, ic2Var10.getShape(kk0Var2, 6), ic2Var10.getContainerColor(kk0Var2, 6), 0.0f, 3.0f, null, oe1Var, kk0Var, (i3 & 14) | 905969664 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3), ((i3 >> 15) & 112) | 6, 0);
                    cVar2 = cVar4;
                    j3 = j2;
                    rb3Var3 = rb3Var2;
                    ux2Var4 = ux2Var3;
                } else {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            jE = xr0.E();
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var2, 0, 1);
                        }
                        if (i6 != 0) {
                            cVar4 = cVar3;
                            ux2Var3 = new ux2(14);
                            j2 = jE;
                            rb3Var2 = rb3VarRememberScrollState;
                        } else {
                            j2 = jE;
                            rb3Var2 = rb3VarRememberScrollState;
                            ux2Var3 = ux2Var2;
                            cVar4 = cVar3;
                        }
                    } else {
                        if (i10 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            jE = xr0.E();
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var2, 0, 1);
                        }
                        if (i6 != 0) {
                            cVar4 = cVar3;
                            ux2Var3 = new ux2(14);
                            j2 = jE;
                            rb3Var2 = rb3VarRememberScrollState;
                        } else {
                            j2 = jE;
                            rb3Var2 = rb3VarRememberScrollState;
                            ux2Var3 = ux2Var2;
                            cVar4 = cVar3;
                        }
                    }
                    kk0Var2.s();
                    ic2 ic2Var11 = ic2.a;
                    kk0Var = kk0Var2;
                    m1894xe1b4b74(z2, je1Var2, cVar4, j2, rb3Var2, ux2Var3, ic2Var11.getShape(kk0Var2, 6), ic2Var11.getContainerColor(kk0Var2, 6), 0.0f, 3.0f, null, oe1Var, kk0Var, (i3 & 14) | 905969664 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3), ((i3 >> 15) & 112) | 6, 0);
                    cVar2 = cVar4;
                    j3 = j2;
                    rb3Var3 = rb3Var2;
                    ux2Var4 = ux2Var3;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new wb(z, je1Var, cVar2, j3, rb3Var3, ux2Var4, oe1Var, i, i2));
                }
            }
            i3 |= 196608;
            ux2Var2 = ux2Var;
            if ((i2 & 64) != 0) {
                if ((i & 1572864) == 0) {
                    if (kk0Var2.j(oe1Var)) {
                        i8 = 1048576;
                    } else {
                        i8 = 524288;
                    }
                    i3 |= i8;
                }
                if ((599187 & i3) == 599186) {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            jE = xr0.E();
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var2, 0, 1);
                        }
                        if (i6 != 0) {
                            cVar4 = cVar3;
                            ux2Var3 = new ux2(14);
                            j2 = jE;
                            rb3Var2 = rb3VarRememberScrollState;
                        } else {
                            j2 = jE;
                            rb3Var2 = rb3VarRememberScrollState;
                            ux2Var3 = ux2Var2;
                            cVar4 = cVar3;
                        }
                    } else {
                        if (i10 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            jE = xr0.E();
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var2, 0, 1);
                        }
                        if (i6 != 0) {
                            cVar4 = cVar3;
                            ux2Var3 = new ux2(14);
                            j2 = jE;
                            rb3Var2 = rb3VarRememberScrollState;
                        } else {
                            j2 = jE;
                            rb3Var2 = rb3VarRememberScrollState;
                            ux2Var3 = ux2Var2;
                            cVar4 = cVar3;
                        }
                    }
                    kk0Var2.s();
                    ic2 ic2Var12 = ic2.a;
                    kk0Var = kk0Var2;
                    m1894xe1b4b74(z2, je1Var2, cVar4, j2, rb3Var2, ux2Var3, ic2Var12.getShape(kk0Var2, 6), ic2Var12.getContainerColor(kk0Var2, 6), 0.0f, 3.0f, null, oe1Var, kk0Var, (i3 & 14) | 905969664 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3), ((i3 >> 15) & 112) | 6, 0);
                    cVar2 = cVar4;
                    j3 = j2;
                    rb3Var3 = rb3Var2;
                    ux2Var4 = ux2Var3;
                } else {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            jE = xr0.E();
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var2, 0, 1);
                        }
                        if (i6 != 0) {
                            cVar4 = cVar3;
                            ux2Var3 = new ux2(14);
                            j2 = jE;
                            rb3Var2 = rb3VarRememberScrollState;
                        } else {
                            j2 = jE;
                            rb3Var2 = rb3VarRememberScrollState;
                            ux2Var3 = ux2Var2;
                            cVar4 = cVar3;
                        }
                    } else {
                        if (i10 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            jE = xr0.E();
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var2, 0, 1);
                        }
                        if (i6 != 0) {
                            cVar4 = cVar3;
                            ux2Var3 = new ux2(14);
                            j2 = jE;
                            rb3Var2 = rb3VarRememberScrollState;
                        } else {
                            j2 = jE;
                            rb3Var2 = rb3VarRememberScrollState;
                            ux2Var3 = ux2Var2;
                            cVar4 = cVar3;
                        }
                    }
                    kk0Var2.s();
                    ic2 ic2Var13 = ic2.a;
                    kk0Var = kk0Var2;
                    m1894xe1b4b74(z2, je1Var2, cVar4, j2, rb3Var2, ux2Var3, ic2Var13.getShape(kk0Var2, 6), ic2Var13.getContainerColor(kk0Var2, 6), 0.0f, 3.0f, null, oe1Var, kk0Var, (i3 & 14) | 905969664 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3), ((i3 >> 15) & 112) | 6, 0);
                    cVar2 = cVar4;
                    j3 = j2;
                    rb3Var3 = rb3Var2;
                    ux2Var4 = ux2Var3;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new wb(z, je1Var, cVar2, j3, rb3Var3, ux2Var4, oe1Var, i, i2));
                }
            }
            i3 |= 1572864;
            if ((599187 & i3) == 599186) {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        jE = xr0.E();
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var2, 0, 1);
                    }
                    if (i6 != 0) {
                        cVar4 = cVar3;
                        ux2Var3 = new ux2(14);
                        j2 = jE;
                        rb3Var2 = rb3VarRememberScrollState;
                    } else {
                        j2 = jE;
                        rb3Var2 = rb3VarRememberScrollState;
                        ux2Var3 = ux2Var2;
                        cVar4 = cVar3;
                    }
                } else {
                    if (i10 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        jE = xr0.E();
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var2, 0, 1);
                    }
                    if (i6 != 0) {
                        cVar4 = cVar3;
                        ux2Var3 = new ux2(14);
                        j2 = jE;
                        rb3Var2 = rb3VarRememberScrollState;
                    } else {
                        j2 = jE;
                        rb3Var2 = rb3VarRememberScrollState;
                        ux2Var3 = ux2Var2;
                        cVar4 = cVar3;
                    }
                }
                kk0Var2.s();
                ic2 ic2Var14 = ic2.a;
                kk0Var = kk0Var2;
                m1894xe1b4b74(z2, je1Var2, cVar4, j2, rb3Var2, ux2Var3, ic2Var14.getShape(kk0Var2, 6), ic2Var14.getContainerColor(kk0Var2, 6), 0.0f, 3.0f, null, oe1Var, kk0Var, (i3 & 14) | 905969664 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3), ((i3 >> 15) & 112) | 6, 0);
                cVar2 = cVar4;
                j3 = j2;
                rb3Var3 = rb3Var2;
                ux2Var4 = ux2Var3;
            } else {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        jE = xr0.E();
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var2, 0, 1);
                    }
                    if (i6 != 0) {
                        cVar4 = cVar3;
                        ux2Var3 = new ux2(14);
                        j2 = jE;
                        rb3Var2 = rb3VarRememberScrollState;
                    } else {
                        j2 = jE;
                        rb3Var2 = rb3VarRememberScrollState;
                        ux2Var3 = ux2Var2;
                        cVar4 = cVar3;
                    }
                } else {
                    if (i10 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        jE = xr0.E();
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var2, 0, 1);
                    }
                    if (i6 != 0) {
                        cVar4 = cVar3;
                        ux2Var3 = new ux2(14);
                        j2 = jE;
                        rb3Var2 = rb3VarRememberScrollState;
                    } else {
                        j2 = jE;
                        rb3Var2 = rb3VarRememberScrollState;
                        ux2Var3 = ux2Var2;
                        cVar4 = cVar3;
                    }
                }
                kk0Var2.s();
                ic2 ic2Var15 = ic2.a;
                kk0Var = kk0Var2;
                m1894xe1b4b74(z2, je1Var2, cVar4, j2, rb3Var2, ux2Var3, ic2Var15.getShape(kk0Var2, 6), ic2Var15.getContainerColor(kk0Var2, 6), 0.0f, 3.0f, null, oe1Var, kk0Var, (i3 & 14) | 905969664 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3), ((i3 >> 15) & 112) | 6, 0);
                cVar2 = cVar4;
                j3 = j2;
                rb3Var3 = rb3Var2;
                ux2Var4 = ux2Var3;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new wb(z, je1Var, cVar2, j3, rb3Var3, ux2Var4, oe1Var, i, i2));
            }
        }
        i3 |= 384;
        cVar2 = cVar;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                jE = j;
                if (kk0Var2.g(jE)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    rb3VarRememberScrollState = rb3Var;
                    if (kk0Var2.h(rb3VarRememberScrollState)) {
                        i9 = 16384;
                    }
                    i3 |= i9;
                } else {
                    rb3VarRememberScrollState = rb3Var;
                }
                i9 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                i3 |= i9;
            } else {
                rb3VarRememberScrollState = rb3Var;
            }
            i6 = i2 & 32;
            if (i6 != 0) {
                if ((196608 & i) == 0) {
                    ux2Var2 = ux2Var;
                    if (kk0Var2.h(ux2Var2)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
                if ((i2 & 64) != 0) {
                    if ((i & 1572864) == 0) {
                        if (kk0Var2.j(oe1Var)) {
                            i8 = 1048576;
                        } else {
                            i8 = 524288;
                        }
                        i3 |= i8;
                    }
                    if ((599187 & i3) == 599186) {
                        kk0Var2.X();
                        if ((i & 1) != 0) {
                            if (i10 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i4 != 0) {
                                jE = xr0.E();
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                                rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var2, 0, 1);
                            }
                            if (i6 != 0) {
                                cVar4 = cVar3;
                                ux2Var3 = new ux2(14);
                                j2 = jE;
                                rb3Var2 = rb3VarRememberScrollState;
                            } else {
                                j2 = jE;
                                rb3Var2 = rb3VarRememberScrollState;
                                ux2Var3 = ux2Var2;
                                cVar4 = cVar3;
                            }
                        } else {
                            if (i10 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i4 != 0) {
                                jE = xr0.E();
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                                rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var2, 0, 1);
                            }
                            if (i6 != 0) {
                                cVar4 = cVar3;
                                ux2Var3 = new ux2(14);
                                j2 = jE;
                                rb3Var2 = rb3VarRememberScrollState;
                            } else {
                                j2 = jE;
                                rb3Var2 = rb3VarRememberScrollState;
                                ux2Var3 = ux2Var2;
                                cVar4 = cVar3;
                            }
                        }
                        kk0Var2.s();
                        ic2 ic2Var16 = ic2.a;
                        kk0Var = kk0Var2;
                        m1894xe1b4b74(z2, je1Var2, cVar4, j2, rb3Var2, ux2Var3, ic2Var16.getShape(kk0Var2, 6), ic2Var16.getContainerColor(kk0Var2, 6), 0.0f, 3.0f, null, oe1Var, kk0Var, (i3 & 14) | 905969664 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3), ((i3 >> 15) & 112) | 6, 0);
                        cVar2 = cVar4;
                        j3 = j2;
                        rb3Var3 = rb3Var2;
                        ux2Var4 = ux2Var3;
                    } else {
                        kk0Var2.X();
                        if ((i & 1) != 0) {
                            if (i10 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i4 != 0) {
                                jE = xr0.E();
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                                rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var2, 0, 1);
                            }
                            if (i6 != 0) {
                                cVar4 = cVar3;
                                ux2Var3 = new ux2(14);
                                j2 = jE;
                                rb3Var2 = rb3VarRememberScrollState;
                            } else {
                                j2 = jE;
                                rb3Var2 = rb3VarRememberScrollState;
                                ux2Var3 = ux2Var2;
                                cVar4 = cVar3;
                            }
                        } else {
                            if (i10 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i4 != 0) {
                                jE = xr0.E();
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                                rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var2, 0, 1);
                            }
                            if (i6 != 0) {
                                cVar4 = cVar3;
                                ux2Var3 = new ux2(14);
                                j2 = jE;
                                rb3Var2 = rb3VarRememberScrollState;
                            } else {
                                j2 = jE;
                                rb3Var2 = rb3VarRememberScrollState;
                                ux2Var3 = ux2Var2;
                                cVar4 = cVar3;
                            }
                        }
                        kk0Var2.s();
                        ic2 ic2Var17 = ic2.a;
                        kk0Var = kk0Var2;
                        m1894xe1b4b74(z2, je1Var2, cVar4, j2, rb3Var2, ux2Var3, ic2Var17.getShape(kk0Var2, 6), ic2Var17.getContainerColor(kk0Var2, 6), 0.0f, 3.0f, null, oe1Var, kk0Var, (i3 & 14) | 905969664 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3), ((i3 >> 15) & 112) | 6, 0);
                        cVar2 = cVar4;
                        j3 = j2;
                        rb3Var3 = rb3Var2;
                        ux2Var4 = ux2Var3;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new wb(z, je1Var, cVar2, j3, rb3Var3, ux2Var4, oe1Var, i, i2));
                    }
                }
                i3 |= 1572864;
                if ((599187 & i3) == 599186) {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            jE = xr0.E();
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var2, 0, 1);
                        }
                        if (i6 != 0) {
                            cVar4 = cVar3;
                            ux2Var3 = new ux2(14);
                            j2 = jE;
                            rb3Var2 = rb3VarRememberScrollState;
                        } else {
                            j2 = jE;
                            rb3Var2 = rb3VarRememberScrollState;
                            ux2Var3 = ux2Var2;
                            cVar4 = cVar3;
                        }
                    } else {
                        if (i10 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            jE = xr0.E();
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var2, 0, 1);
                        }
                        if (i6 != 0) {
                            cVar4 = cVar3;
                            ux2Var3 = new ux2(14);
                            j2 = jE;
                            rb3Var2 = rb3VarRememberScrollState;
                        } else {
                            j2 = jE;
                            rb3Var2 = rb3VarRememberScrollState;
                            ux2Var3 = ux2Var2;
                            cVar4 = cVar3;
                        }
                    }
                    kk0Var2.s();
                    ic2 ic2Var18 = ic2.a;
                    kk0Var = kk0Var2;
                    m1894xe1b4b74(z2, je1Var2, cVar4, j2, rb3Var2, ux2Var3, ic2Var18.getShape(kk0Var2, 6), ic2Var18.getContainerColor(kk0Var2, 6), 0.0f, 3.0f, null, oe1Var, kk0Var, (i3 & 14) | 905969664 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3), ((i3 >> 15) & 112) | 6, 0);
                    cVar2 = cVar4;
                    j3 = j2;
                    rb3Var3 = rb3Var2;
                    ux2Var4 = ux2Var3;
                } else {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            jE = xr0.E();
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var2, 0, 1);
                        }
                        if (i6 != 0) {
                            cVar4 = cVar3;
                            ux2Var3 = new ux2(14);
                            j2 = jE;
                            rb3Var2 = rb3VarRememberScrollState;
                        } else {
                            j2 = jE;
                            rb3Var2 = rb3VarRememberScrollState;
                            ux2Var3 = ux2Var2;
                            cVar4 = cVar3;
                        }
                    } else {
                        if (i10 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            jE = xr0.E();
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var2, 0, 1);
                        }
                        if (i6 != 0) {
                            cVar4 = cVar3;
                            ux2Var3 = new ux2(14);
                            j2 = jE;
                            rb3Var2 = rb3VarRememberScrollState;
                        } else {
                            j2 = jE;
                            rb3Var2 = rb3VarRememberScrollState;
                            ux2Var3 = ux2Var2;
                            cVar4 = cVar3;
                        }
                    }
                    kk0Var2.s();
                    ic2 ic2Var19 = ic2.a;
                    kk0Var = kk0Var2;
                    m1894xe1b4b74(z2, je1Var2, cVar4, j2, rb3Var2, ux2Var3, ic2Var19.getShape(kk0Var2, 6), ic2Var19.getContainerColor(kk0Var2, 6), 0.0f, 3.0f, null, oe1Var, kk0Var, (i3 & 14) | 905969664 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3), ((i3 >> 15) & 112) | 6, 0);
                    cVar2 = cVar4;
                    j3 = j2;
                    rb3Var3 = rb3Var2;
                    ux2Var4 = ux2Var3;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new wb(z, je1Var, cVar2, j3, rb3Var3, ux2Var4, oe1Var, i, i2));
                }
            }
            i3 |= 196608;
            ux2Var2 = ux2Var;
            if ((i2 & 64) != 0) {
                if ((i & 1572864) == 0) {
                    if (kk0Var2.j(oe1Var)) {
                        i8 = 1048576;
                    } else {
                        i8 = 524288;
                    }
                    i3 |= i8;
                }
                if ((599187 & i3) == 599186) {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            jE = xr0.E();
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var2, 0, 1);
                        }
                        if (i6 != 0) {
                            cVar4 = cVar3;
                            ux2Var3 = new ux2(14);
                            j2 = jE;
                            rb3Var2 = rb3VarRememberScrollState;
                        } else {
                            j2 = jE;
                            rb3Var2 = rb3VarRememberScrollState;
                            ux2Var3 = ux2Var2;
                            cVar4 = cVar3;
                        }
                    } else {
                        if (i10 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            jE = xr0.E();
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var2, 0, 1);
                        }
                        if (i6 != 0) {
                            cVar4 = cVar3;
                            ux2Var3 = new ux2(14);
                            j2 = jE;
                            rb3Var2 = rb3VarRememberScrollState;
                        } else {
                            j2 = jE;
                            rb3Var2 = rb3VarRememberScrollState;
                            ux2Var3 = ux2Var2;
                            cVar4 = cVar3;
                        }
                    }
                    kk0Var2.s();
                    ic2 ic2Var110 = ic2.a;
                    kk0Var = kk0Var2;
                    m1894xe1b4b74(z2, je1Var2, cVar4, j2, rb3Var2, ux2Var3, ic2Var110.getShape(kk0Var2, 6), ic2Var110.getContainerColor(kk0Var2, 6), 0.0f, 3.0f, null, oe1Var, kk0Var, (i3 & 14) | 905969664 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3), ((i3 >> 15) & 112) | 6, 0);
                    cVar2 = cVar4;
                    j3 = j2;
                    rb3Var3 = rb3Var2;
                    ux2Var4 = ux2Var3;
                } else {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            jE = xr0.E();
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var2, 0, 1);
                        }
                        if (i6 != 0) {
                            cVar4 = cVar3;
                            ux2Var3 = new ux2(14);
                            j2 = jE;
                            rb3Var2 = rb3VarRememberScrollState;
                        } else {
                            j2 = jE;
                            rb3Var2 = rb3VarRememberScrollState;
                            ux2Var3 = ux2Var2;
                            cVar4 = cVar3;
                        }
                    } else {
                        if (i10 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            jE = xr0.E();
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var2, 0, 1);
                        }
                        if (i6 != 0) {
                            cVar4 = cVar3;
                            ux2Var3 = new ux2(14);
                            j2 = jE;
                            rb3Var2 = rb3VarRememberScrollState;
                        } else {
                            j2 = jE;
                            rb3Var2 = rb3VarRememberScrollState;
                            ux2Var3 = ux2Var2;
                            cVar4 = cVar3;
                        }
                    }
                    kk0Var2.s();
                    ic2 ic2Var111 = ic2.a;
                    kk0Var = kk0Var2;
                    m1894xe1b4b74(z2, je1Var2, cVar4, j2, rb3Var2, ux2Var3, ic2Var111.getShape(kk0Var2, 6), ic2Var111.getContainerColor(kk0Var2, 6), 0.0f, 3.0f, null, oe1Var, kk0Var, (i3 & 14) | 905969664 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3), ((i3 >> 15) & 112) | 6, 0);
                    cVar2 = cVar4;
                    j3 = j2;
                    rb3Var3 = rb3Var2;
                    ux2Var4 = ux2Var3;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new wb(z, je1Var, cVar2, j3, rb3Var3, ux2Var4, oe1Var, i, i2));
                }
            }
            i3 |= 1572864;
            if ((599187 & i3) == 599186) {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        jE = xr0.E();
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var2, 0, 1);
                    }
                    if (i6 != 0) {
                        cVar4 = cVar3;
                        ux2Var3 = new ux2(14);
                        j2 = jE;
                        rb3Var2 = rb3VarRememberScrollState;
                    } else {
                        j2 = jE;
                        rb3Var2 = rb3VarRememberScrollState;
                        ux2Var3 = ux2Var2;
                        cVar4 = cVar3;
                    }
                } else {
                    if (i10 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        jE = xr0.E();
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var2, 0, 1);
                    }
                    if (i6 != 0) {
                        cVar4 = cVar3;
                        ux2Var3 = new ux2(14);
                        j2 = jE;
                        rb3Var2 = rb3VarRememberScrollState;
                    } else {
                        j2 = jE;
                        rb3Var2 = rb3VarRememberScrollState;
                        ux2Var3 = ux2Var2;
                        cVar4 = cVar3;
                    }
                }
                kk0Var2.s();
                ic2 ic2Var112 = ic2.a;
                kk0Var = kk0Var2;
                m1894xe1b4b74(z2, je1Var2, cVar4, j2, rb3Var2, ux2Var3, ic2Var112.getShape(kk0Var2, 6), ic2Var112.getContainerColor(kk0Var2, 6), 0.0f, 3.0f, null, oe1Var, kk0Var, (i3 & 14) | 905969664 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3), ((i3 >> 15) & 112) | 6, 0);
                cVar2 = cVar4;
                j3 = j2;
                rb3Var3 = rb3Var2;
                ux2Var4 = ux2Var3;
            } else {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        jE = xr0.E();
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var2, 0, 1);
                    }
                    if (i6 != 0) {
                        cVar4 = cVar3;
                        ux2Var3 = new ux2(14);
                        j2 = jE;
                        rb3Var2 = rb3VarRememberScrollState;
                    } else {
                        j2 = jE;
                        rb3Var2 = rb3VarRememberScrollState;
                        ux2Var3 = ux2Var2;
                        cVar4 = cVar3;
                    }
                } else {
                    if (i10 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        jE = xr0.E();
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var2, 0, 1);
                    }
                    if (i6 != 0) {
                        cVar4 = cVar3;
                        ux2Var3 = new ux2(14);
                        j2 = jE;
                        rb3Var2 = rb3VarRememberScrollState;
                    } else {
                        j2 = jE;
                        rb3Var2 = rb3VarRememberScrollState;
                        ux2Var3 = ux2Var2;
                        cVar4 = cVar3;
                    }
                }
                kk0Var2.s();
                ic2 ic2Var113 = ic2.a;
                kk0Var = kk0Var2;
                m1894xe1b4b74(z2, je1Var2, cVar4, j2, rb3Var2, ux2Var3, ic2Var113.getShape(kk0Var2, 6), ic2Var113.getContainerColor(kk0Var2, 6), 0.0f, 3.0f, null, oe1Var, kk0Var, (i3 & 14) | 905969664 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3), ((i3 >> 15) & 112) | 6, 0);
                cVar2 = cVar4;
                j3 = j2;
                rb3Var3 = rb3Var2;
                ux2Var4 = ux2Var3;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new wb(z, je1Var, cVar2, j3, rb3Var3, ux2Var4, oe1Var, i, i2));
            }
        }
        i3 |= 3072;
        jE = j;
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                rb3VarRememberScrollState = rb3Var;
                if (kk0Var2.h(rb3VarRememberScrollState)) {
                    i9 = 16384;
                }
                i3 |= i9;
            } else {
                rb3VarRememberScrollState = rb3Var;
            }
            i9 = ConstantsKt.DEFAULT_BUFFER_SIZE;
            i3 |= i9;
        } else {
            rb3VarRememberScrollState = rb3Var;
        }
        i6 = i2 & 32;
        if (i6 != 0) {
            if ((196608 & i) == 0) {
                ux2Var2 = ux2Var;
                if (kk0Var2.h(ux2Var2)) {
                    i7 = 131072;
                } else {
                    i7 = 65536;
                }
                i3 |= i7;
            }
            if ((i2 & 64) != 0) {
                if ((i & 1572864) == 0) {
                    if (kk0Var2.j(oe1Var)) {
                        i8 = 1048576;
                    } else {
                        i8 = 524288;
                    }
                    i3 |= i8;
                }
                if ((599187 & i3) == 599186) {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            jE = xr0.E();
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var2, 0, 1);
                        }
                        if (i6 != 0) {
                            cVar4 = cVar3;
                            ux2Var3 = new ux2(14);
                            j2 = jE;
                            rb3Var2 = rb3VarRememberScrollState;
                        } else {
                            j2 = jE;
                            rb3Var2 = rb3VarRememberScrollState;
                            ux2Var3 = ux2Var2;
                            cVar4 = cVar3;
                        }
                    } else {
                        if (i10 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            jE = xr0.E();
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var2, 0, 1);
                        }
                        if (i6 != 0) {
                            cVar4 = cVar3;
                            ux2Var3 = new ux2(14);
                            j2 = jE;
                            rb3Var2 = rb3VarRememberScrollState;
                        } else {
                            j2 = jE;
                            rb3Var2 = rb3VarRememberScrollState;
                            ux2Var3 = ux2Var2;
                            cVar4 = cVar3;
                        }
                    }
                    kk0Var2.s();
                    ic2 ic2Var114 = ic2.a;
                    kk0Var = kk0Var2;
                    m1894xe1b4b74(z2, je1Var2, cVar4, j2, rb3Var2, ux2Var3, ic2Var114.getShape(kk0Var2, 6), ic2Var114.getContainerColor(kk0Var2, 6), 0.0f, 3.0f, null, oe1Var, kk0Var, (i3 & 14) | 905969664 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3), ((i3 >> 15) & 112) | 6, 0);
                    cVar2 = cVar4;
                    j3 = j2;
                    rb3Var3 = rb3Var2;
                    ux2Var4 = ux2Var3;
                } else {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            jE = xr0.E();
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var2, 0, 1);
                        }
                        if (i6 != 0) {
                            cVar4 = cVar3;
                            ux2Var3 = new ux2(14);
                            j2 = jE;
                            rb3Var2 = rb3VarRememberScrollState;
                        } else {
                            j2 = jE;
                            rb3Var2 = rb3VarRememberScrollState;
                            ux2Var3 = ux2Var2;
                            cVar4 = cVar3;
                        }
                    } else {
                        if (i10 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            jE = xr0.E();
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var2, 0, 1);
                        }
                        if (i6 != 0) {
                            cVar4 = cVar3;
                            ux2Var3 = new ux2(14);
                            j2 = jE;
                            rb3Var2 = rb3VarRememberScrollState;
                        } else {
                            j2 = jE;
                            rb3Var2 = rb3VarRememberScrollState;
                            ux2Var3 = ux2Var2;
                            cVar4 = cVar3;
                        }
                    }
                    kk0Var2.s();
                    ic2 ic2Var115 = ic2.a;
                    kk0Var = kk0Var2;
                    m1894xe1b4b74(z2, je1Var2, cVar4, j2, rb3Var2, ux2Var3, ic2Var115.getShape(kk0Var2, 6), ic2Var115.getContainerColor(kk0Var2, 6), 0.0f, 3.0f, null, oe1Var, kk0Var, (i3 & 14) | 905969664 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3), ((i3 >> 15) & 112) | 6, 0);
                    cVar2 = cVar4;
                    j3 = j2;
                    rb3Var3 = rb3Var2;
                    ux2Var4 = ux2Var3;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new wb(z, je1Var, cVar2, j3, rb3Var3, ux2Var4, oe1Var, i, i2));
                }
            }
            i3 |= 1572864;
            if ((599187 & i3) == 599186) {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        jE = xr0.E();
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var2, 0, 1);
                    }
                    if (i6 != 0) {
                        cVar4 = cVar3;
                        ux2Var3 = new ux2(14);
                        j2 = jE;
                        rb3Var2 = rb3VarRememberScrollState;
                    } else {
                        j2 = jE;
                        rb3Var2 = rb3VarRememberScrollState;
                        ux2Var3 = ux2Var2;
                        cVar4 = cVar3;
                    }
                } else {
                    if (i10 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        jE = xr0.E();
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var2, 0, 1);
                    }
                    if (i6 != 0) {
                        cVar4 = cVar3;
                        ux2Var3 = new ux2(14);
                        j2 = jE;
                        rb3Var2 = rb3VarRememberScrollState;
                    } else {
                        j2 = jE;
                        rb3Var2 = rb3VarRememberScrollState;
                        ux2Var3 = ux2Var2;
                        cVar4 = cVar3;
                    }
                }
                kk0Var2.s();
                ic2 ic2Var116 = ic2.a;
                kk0Var = kk0Var2;
                m1894xe1b4b74(z2, je1Var2, cVar4, j2, rb3Var2, ux2Var3, ic2Var116.getShape(kk0Var2, 6), ic2Var116.getContainerColor(kk0Var2, 6), 0.0f, 3.0f, null, oe1Var, kk0Var, (i3 & 14) | 905969664 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3), ((i3 >> 15) & 112) | 6, 0);
                cVar2 = cVar4;
                j3 = j2;
                rb3Var3 = rb3Var2;
                ux2Var4 = ux2Var3;
            } else {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        jE = xr0.E();
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var2, 0, 1);
                    }
                    if (i6 != 0) {
                        cVar4 = cVar3;
                        ux2Var3 = new ux2(14);
                        j2 = jE;
                        rb3Var2 = rb3VarRememberScrollState;
                    } else {
                        j2 = jE;
                        rb3Var2 = rb3VarRememberScrollState;
                        ux2Var3 = ux2Var2;
                        cVar4 = cVar3;
                    }
                } else {
                    if (i10 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        jE = xr0.E();
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var2, 0, 1);
                    }
                    if (i6 != 0) {
                        cVar4 = cVar3;
                        ux2Var3 = new ux2(14);
                        j2 = jE;
                        rb3Var2 = rb3VarRememberScrollState;
                    } else {
                        j2 = jE;
                        rb3Var2 = rb3VarRememberScrollState;
                        ux2Var3 = ux2Var2;
                        cVar4 = cVar3;
                    }
                }
                kk0Var2.s();
                ic2 ic2Var117 = ic2.a;
                kk0Var = kk0Var2;
                m1894xe1b4b74(z2, je1Var2, cVar4, j2, rb3Var2, ux2Var3, ic2Var117.getShape(kk0Var2, 6), ic2Var117.getContainerColor(kk0Var2, 6), 0.0f, 3.0f, null, oe1Var, kk0Var, (i3 & 14) | 905969664 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3), ((i3 >> 15) & 112) | 6, 0);
                cVar2 = cVar4;
                j3 = j2;
                rb3Var3 = rb3Var2;
                ux2Var4 = ux2Var3;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new wb(z, je1Var, cVar2, j3, rb3Var3, ux2Var4, oe1Var, i, i2));
            }
        }
        i3 |= 196608;
        ux2Var2 = ux2Var;
        if ((i2 & 64) != 0) {
            if ((i & 1572864) == 0) {
                if (kk0Var2.j(oe1Var)) {
                    i8 = 1048576;
                } else {
                    i8 = 524288;
                }
                i3 |= i8;
            }
            if ((599187 & i3) == 599186) {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        jE = xr0.E();
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var2, 0, 1);
                    }
                    if (i6 != 0) {
                        cVar4 = cVar3;
                        ux2Var3 = new ux2(14);
                        j2 = jE;
                        rb3Var2 = rb3VarRememberScrollState;
                    } else {
                        j2 = jE;
                        rb3Var2 = rb3VarRememberScrollState;
                        ux2Var3 = ux2Var2;
                        cVar4 = cVar3;
                    }
                } else {
                    if (i10 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        jE = xr0.E();
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var2, 0, 1);
                    }
                    if (i6 != 0) {
                        cVar4 = cVar3;
                        ux2Var3 = new ux2(14);
                        j2 = jE;
                        rb3Var2 = rb3VarRememberScrollState;
                    } else {
                        j2 = jE;
                        rb3Var2 = rb3VarRememberScrollState;
                        ux2Var3 = ux2Var2;
                        cVar4 = cVar3;
                    }
                }
                kk0Var2.s();
                ic2 ic2Var118 = ic2.a;
                kk0Var = kk0Var2;
                m1894xe1b4b74(z2, je1Var2, cVar4, j2, rb3Var2, ux2Var3, ic2Var118.getShape(kk0Var2, 6), ic2Var118.getContainerColor(kk0Var2, 6), 0.0f, 3.0f, null, oe1Var, kk0Var, (i3 & 14) | 905969664 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3), ((i3 >> 15) & 112) | 6, 0);
                cVar2 = cVar4;
                j3 = j2;
                rb3Var3 = rb3Var2;
                ux2Var4 = ux2Var3;
            } else {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        jE = xr0.E();
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var2, 0, 1);
                    }
                    if (i6 != 0) {
                        cVar4 = cVar3;
                        ux2Var3 = new ux2(14);
                        j2 = jE;
                        rb3Var2 = rb3VarRememberScrollState;
                    } else {
                        j2 = jE;
                        rb3Var2 = rb3VarRememberScrollState;
                        ux2Var3 = ux2Var2;
                        cVar4 = cVar3;
                    }
                } else {
                    if (i10 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        jE = xr0.E();
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var2, 0, 1);
                    }
                    if (i6 != 0) {
                        cVar4 = cVar3;
                        ux2Var3 = new ux2(14);
                        j2 = jE;
                        rb3Var2 = rb3VarRememberScrollState;
                    } else {
                        j2 = jE;
                        rb3Var2 = rb3VarRememberScrollState;
                        ux2Var3 = ux2Var2;
                        cVar4 = cVar3;
                    }
                }
                kk0Var2.s();
                ic2 ic2Var119 = ic2.a;
                kk0Var = kk0Var2;
                m1894xe1b4b74(z2, je1Var2, cVar4, j2, rb3Var2, ux2Var3, ic2Var119.getShape(kk0Var2, 6), ic2Var119.getContainerColor(kk0Var2, 6), 0.0f, 3.0f, null, oe1Var, kk0Var, (i3 & 14) | 905969664 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3), ((i3 >> 15) & 112) | 6, 0);
                cVar2 = cVar4;
                j3 = j2;
                rb3Var3 = rb3Var2;
                ux2Var4 = ux2Var3;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new wb(z, je1Var, cVar2, j3, rb3Var3, ux2Var4, oe1Var, i, i2));
            }
        }
        i3 |= 1572864;
        if ((599187 & i3) == 599186) {
            kk0Var2.X();
            if ((i & 1) != 0) {
                if (i10 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if (i4 != 0) {
                    jE = xr0.E();
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                    rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var2, 0, 1);
                }
                if (i6 != 0) {
                    cVar4 = cVar3;
                    ux2Var3 = new ux2(14);
                    j2 = jE;
                    rb3Var2 = rb3VarRememberScrollState;
                } else {
                    j2 = jE;
                    rb3Var2 = rb3VarRememberScrollState;
                    ux2Var3 = ux2Var2;
                    cVar4 = cVar3;
                }
            } else {
                if (i10 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if (i4 != 0) {
                    jE = xr0.E();
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                    rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var2, 0, 1);
                }
                if (i6 != 0) {
                    cVar4 = cVar3;
                    ux2Var3 = new ux2(14);
                    j2 = jE;
                    rb3Var2 = rb3VarRememberScrollState;
                } else {
                    j2 = jE;
                    rb3Var2 = rb3VarRememberScrollState;
                    ux2Var3 = ux2Var2;
                    cVar4 = cVar3;
                }
            }
            kk0Var2.s();
            ic2 ic2Var1110 = ic2.a;
            kk0Var = kk0Var2;
            m1894xe1b4b74(z2, je1Var2, cVar4, j2, rb3Var2, ux2Var3, ic2Var1110.getShape(kk0Var2, 6), ic2Var1110.getContainerColor(kk0Var2, 6), 0.0f, 3.0f, null, oe1Var, kk0Var, (i3 & 14) | 905969664 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3), ((i3 >> 15) & 112) | 6, 0);
            cVar2 = cVar4;
            j3 = j2;
            rb3Var3 = rb3Var2;
            ux2Var4 = ux2Var3;
        } else {
            kk0Var2.X();
            if ((i & 1) != 0) {
                if (i10 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if (i4 != 0) {
                    jE = xr0.E();
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                    rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var2, 0, 1);
                }
                if (i6 != 0) {
                    cVar4 = cVar3;
                    ux2Var3 = new ux2(14);
                    j2 = jE;
                    rb3Var2 = rb3VarRememberScrollState;
                } else {
                    j2 = jE;
                    rb3Var2 = rb3VarRememberScrollState;
                    ux2Var3 = ux2Var2;
                    cVar4 = cVar3;
                }
            } else {
                if (i10 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if (i4 != 0) {
                    jE = xr0.E();
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                    rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var2, 0, 1);
                }
                if (i6 != 0) {
                    cVar4 = cVar3;
                    ux2Var3 = new ux2(14);
                    j2 = jE;
                    rb3Var2 = rb3VarRememberScrollState;
                } else {
                    j2 = jE;
                    rb3Var2 = rb3VarRememberScrollState;
                    ux2Var3 = ux2Var2;
                    cVar4 = cVar3;
                }
            }
            kk0Var2.s();
            ic2 ic2Var1111 = ic2.a;
            kk0Var = kk0Var2;
            m1894xe1b4b74(z2, je1Var2, cVar4, j2, rb3Var2, ux2Var3, ic2Var1111.getShape(kk0Var2, 6), ic2Var1111.getContainerColor(kk0Var2, 6), 0.0f, 3.0f, null, oe1Var, kk0Var, (i3 & 14) | 905969664 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3), ((i3 >> 15) & 112) | 6, 0);
            cVar2 = cVar4;
            j3 = j2;
            rb3Var3 = rb3Var2;
            ux2Var4 = ux2Var3;
        }
        w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new wb(z, je1Var, cVar2, j3, rb3Var3, ux2Var4, oe1Var, i, i2));
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0061  */
    /* JADX WARN: Code duplicated, block: B:38:0x0066  */
    /* JADX WARN: Code duplicated, block: B:40:0x006a  */
    /* JADX WARN: Code duplicated, block: B:42:0x0072  */
    /* JADX WARN: Code duplicated, block: B:43:0x0075  */
    /* JADX WARN: Code duplicated, block: B:47:0x007c  */
    /* JADX WARN: Code duplicated, block: B:49:0x0081  */
    /* JADX WARN: Code duplicated, block: B:51:0x0085  */
    /* JADX WARN: Code duplicated, block: B:53:0x008d  */
    /* JADX WARN: Code duplicated, block: B:54:0x0090  */
    /* JADX WARN: Code duplicated, block: B:58:0x0099  */
    /* JADX WARN: Code duplicated, block: B:60:0x009d  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:77:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:85:0x0112  */
    /* JADX WARN: Code duplicated, block: B:87:? A[RETURN, SYNTHETIC] */
    @cv0
    /* JADX INFO: renamed from: DropdownMenu-ILWXrKs, reason: not valid java name */
    public static final void m1893xd8504c19(boolean z, je1 je1Var, c cVar, long j, ux2 ux2Var, oe1 oe1Var, ck0 ck0Var, int i, int i2) {
        boolean z2;
        int i3;
        je1 je1Var2;
        c cVar2;
        int i4;
        long j2;
        int i5;
        int i6;
        ux2 ux2Var2;
        int i7;
        oe1 oe1Var2;
        int i8;
        c cVar3;
        long jE;
        ux2 ux2Var3;
        kk0 kk0Var;
        long j3;
        ux2 ux2Var4;
        w33 w33VarV;
        kk0 kk0Var2 = (kk0) ck0Var;
        kk0Var2.c0(354826666);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            z2 = z;
        } else {
            z2 = z;
            if ((i & 6) == 0) {
                i3 = (kk0Var2.i(z2) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            je1Var2 = je1Var;
        } else {
            je1Var2 = je1Var;
            if ((i & 48) == 0) {
                i3 |= kk0Var2.j(je1Var2) ? 32 : 16;
            }
        }
        int i9 = i2 & 4;
        if (i9 == 0) {
            if ((i & 384) == 0) {
                cVar2 = cVar;
                i3 |= kk0Var2.h(cVar2) ? FontInfo.NUMBER_OF_CHAR_CODES : Uuid.SIZE_BITS;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    j2 = j;
                    if (kk0Var2.g(j2)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 16;
                if (i6 != 0) {
                    if ((i & 24576) == 0) {
                        ux2Var2 = ux2Var;
                        if (kk0Var2.h(ux2Var2)) {
                            i7 = 16384;
                        } else {
                            i7 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                        }
                        i3 |= i7;
                    }
                    if ((i2 & 32) != 0) {
                        if ((i & 196608) == 0) {
                            oe1Var2 = oe1Var;
                            if (kk0Var2.j(oe1Var2)) {
                                i8 = 131072;
                            } else {
                                i8 = 65536;
                            }
                            i3 |= i8;
                        }
                        if ((74899 & i3) == 74898 || !kk0Var2.F()) {
                            if (i9 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i4 != 0) {
                                jE = xr0.E();
                            } else {
                                jE = j2;
                            }
                            if (i6 != 0) {
                                ux2Var3 = new ux2(14);
                            } else {
                                ux2Var3 = ux2Var2;
                            }
                            kk0Var = kk0Var2;
                            c cVar4 = cVar3;
                            oe1 oe1Var3 = oe1Var2;
                            long j4 = jE;
                            m1894xe1b4b74(z2, je1Var2, cVar4, j4, mb3.rememberScrollState(0, kk0Var2, 0, 1), ux2Var3, null, 0L, 0.0f, 0.0f, null, oe1Var3, kk0Var, (i3 & 8190) | ((i3 << 3) & 458752), (i3 >> 12) & 112, 1984);
                            cVar2 = cVar4;
                            j3 = j4;
                            ux2Var4 = ux2Var3;
                        } else {
                            kk0Var2.V();
                            kk0Var = kk0Var2;
                            j3 = j2;
                            ux2Var4 = ux2Var2;
                        }
                        w33VarV = kk0Var.v();
                        if (w33VarV != null) {
                            w33VarV.updateScope(new xb(z, je1Var, cVar2, j3, ux2Var4, oe1Var, i, i2));
                        }
                    }
                    i3 |= 196608;
                    oe1Var2 = oe1Var;
                    if ((74899 & i3) == 74898) {
                        if (i9 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            jE = xr0.E();
                        } else {
                            jE = j2;
                        }
                        if (i6 != 0) {
                            ux2Var3 = new ux2(14);
                        } else {
                            ux2Var3 = ux2Var2;
                        }
                        kk0Var = kk0Var2;
                        c cVar5 = cVar3;
                        oe1 oe1Var4 = oe1Var2;
                        long j5 = jE;
                        m1894xe1b4b74(z2, je1Var2, cVar5, j5, mb3.rememberScrollState(0, kk0Var2, 0, 1), ux2Var3, null, 0L, 0.0f, 0.0f, null, oe1Var4, kk0Var, (i3 & 8190) | ((i3 << 3) & 458752), (i3 >> 12) & 112, 1984);
                        cVar2 = cVar5;
                        j3 = j5;
                        ux2Var4 = ux2Var3;
                    } else {
                        if (i9 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            jE = xr0.E();
                        } else {
                            jE = j2;
                        }
                        if (i6 != 0) {
                            ux2Var3 = new ux2(14);
                        } else {
                            ux2Var3 = ux2Var2;
                        }
                        kk0Var = kk0Var2;
                        c cVar6 = cVar3;
                        oe1 oe1Var5 = oe1Var2;
                        long j6 = jE;
                        m1894xe1b4b74(z2, je1Var2, cVar6, j6, mb3.rememberScrollState(0, kk0Var2, 0, 1), ux2Var3, null, 0L, 0.0f, 0.0f, null, oe1Var5, kk0Var, (i3 & 8190) | ((i3 << 3) & 458752), (i3 >> 12) & 112, 1984);
                        cVar2 = cVar6;
                        j3 = j6;
                        ux2Var4 = ux2Var3;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new xb(z, je1Var, cVar2, j3, ux2Var4, oe1Var, i, i2));
                    }
                }
                i3 |= 24576;
                ux2Var2 = ux2Var;
                if ((i2 & 32) != 0) {
                    if ((i & 196608) == 0) {
                        oe1Var2 = oe1Var;
                        if (kk0Var2.j(oe1Var2)) {
                            i8 = 131072;
                        } else {
                            i8 = 65536;
                        }
                        i3 |= i8;
                    }
                    if ((74899 & i3) == 74898) {
                        if (i9 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            jE = xr0.E();
                        } else {
                            jE = j2;
                        }
                        if (i6 != 0) {
                            ux2Var3 = new ux2(14);
                        } else {
                            ux2Var3 = ux2Var2;
                        }
                        kk0Var = kk0Var2;
                        c cVar7 = cVar3;
                        oe1 oe1Var6 = oe1Var2;
                        long j7 = jE;
                        m1894xe1b4b74(z2, je1Var2, cVar7, j7, mb3.rememberScrollState(0, kk0Var2, 0, 1), ux2Var3, null, 0L, 0.0f, 0.0f, null, oe1Var6, kk0Var, (i3 & 8190) | ((i3 << 3) & 458752), (i3 >> 12) & 112, 1984);
                        cVar2 = cVar7;
                        j3 = j7;
                        ux2Var4 = ux2Var3;
                    } else {
                        if (i9 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            jE = xr0.E();
                        } else {
                            jE = j2;
                        }
                        if (i6 != 0) {
                            ux2Var3 = new ux2(14);
                        } else {
                            ux2Var3 = ux2Var2;
                        }
                        kk0Var = kk0Var2;
                        c cVar8 = cVar3;
                        oe1 oe1Var7 = oe1Var2;
                        long j8 = jE;
                        m1894xe1b4b74(z2, je1Var2, cVar8, j8, mb3.rememberScrollState(0, kk0Var2, 0, 1), ux2Var3, null, 0L, 0.0f, 0.0f, null, oe1Var7, kk0Var, (i3 & 8190) | ((i3 << 3) & 458752), (i3 >> 12) & 112, 1984);
                        cVar2 = cVar8;
                        j3 = j8;
                        ux2Var4 = ux2Var3;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new xb(z, je1Var, cVar2, j3, ux2Var4, oe1Var, i, i2));
                    }
                }
                i3 |= 196608;
                oe1Var2 = oe1Var;
                if ((74899 & i3) == 74898) {
                    if (i9 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        jE = xr0.E();
                    } else {
                        jE = j2;
                    }
                    if (i6 != 0) {
                        ux2Var3 = new ux2(14);
                    } else {
                        ux2Var3 = ux2Var2;
                    }
                    kk0Var = kk0Var2;
                    c cVar9 = cVar3;
                    oe1 oe1Var8 = oe1Var2;
                    long j9 = jE;
                    m1894xe1b4b74(z2, je1Var2, cVar9, j9, mb3.rememberScrollState(0, kk0Var2, 0, 1), ux2Var3, null, 0L, 0.0f, 0.0f, null, oe1Var8, kk0Var, (i3 & 8190) | ((i3 << 3) & 458752), (i3 >> 12) & 112, 1984);
                    cVar2 = cVar9;
                    j3 = j9;
                    ux2Var4 = ux2Var3;
                } else {
                    if (i9 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        jE = xr0.E();
                    } else {
                        jE = j2;
                    }
                    if (i6 != 0) {
                        ux2Var3 = new ux2(14);
                    } else {
                        ux2Var3 = ux2Var2;
                    }
                    kk0Var = kk0Var2;
                    c cVar10 = cVar3;
                    oe1 oe1Var9 = oe1Var2;
                    long j10 = jE;
                    m1894xe1b4b74(z2, je1Var2, cVar10, j10, mb3.rememberScrollState(0, kk0Var2, 0, 1), ux2Var3, null, 0L, 0.0f, 0.0f, null, oe1Var9, kk0Var, (i3 & 8190) | ((i3 << 3) & 458752), (i3 >> 12) & 112, 1984);
                    cVar2 = cVar10;
                    j3 = j10;
                    ux2Var4 = ux2Var3;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new xb(z, je1Var, cVar2, j3, ux2Var4, oe1Var, i, i2));
                }
            }
            i3 |= 3072;
            j2 = j;
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    ux2Var2 = ux2Var;
                    if (kk0Var2.h(ux2Var2)) {
                        i7 = 16384;
                    } else {
                        i7 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                    }
                    i3 |= i7;
                }
                if ((i2 & 32) != 0) {
                    if ((i & 196608) == 0) {
                        oe1Var2 = oe1Var;
                        if (kk0Var2.j(oe1Var2)) {
                            i8 = 131072;
                        } else {
                            i8 = 65536;
                        }
                        i3 |= i8;
                    }
                    if ((74899 & i3) == 74898) {
                        if (i9 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            jE = xr0.E();
                        } else {
                            jE = j2;
                        }
                        if (i6 != 0) {
                            ux2Var3 = new ux2(14);
                        } else {
                            ux2Var3 = ux2Var2;
                        }
                        kk0Var = kk0Var2;
                        c cVar11 = cVar3;
                        oe1 oe1Var10 = oe1Var2;
                        long j11 = jE;
                        m1894xe1b4b74(z2, je1Var2, cVar11, j11, mb3.rememberScrollState(0, kk0Var2, 0, 1), ux2Var3, null, 0L, 0.0f, 0.0f, null, oe1Var10, kk0Var, (i3 & 8190) | ((i3 << 3) & 458752), (i3 >> 12) & 112, 1984);
                        cVar2 = cVar11;
                        j3 = j11;
                        ux2Var4 = ux2Var3;
                    } else {
                        if (i9 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            jE = xr0.E();
                        } else {
                            jE = j2;
                        }
                        if (i6 != 0) {
                            ux2Var3 = new ux2(14);
                        } else {
                            ux2Var3 = ux2Var2;
                        }
                        kk0Var = kk0Var2;
                        c cVar12 = cVar3;
                        oe1 oe1Var11 = oe1Var2;
                        long j12 = jE;
                        m1894xe1b4b74(z2, je1Var2, cVar12, j12, mb3.rememberScrollState(0, kk0Var2, 0, 1), ux2Var3, null, 0L, 0.0f, 0.0f, null, oe1Var11, kk0Var, (i3 & 8190) | ((i3 << 3) & 458752), (i3 >> 12) & 112, 1984);
                        cVar2 = cVar12;
                        j3 = j12;
                        ux2Var4 = ux2Var3;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new xb(z, je1Var, cVar2, j3, ux2Var4, oe1Var, i, i2));
                    }
                }
                i3 |= 196608;
                oe1Var2 = oe1Var;
                if ((74899 & i3) == 74898) {
                    if (i9 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        jE = xr0.E();
                    } else {
                        jE = j2;
                    }
                    if (i6 != 0) {
                        ux2Var3 = new ux2(14);
                    } else {
                        ux2Var3 = ux2Var2;
                    }
                    kk0Var = kk0Var2;
                    c cVar13 = cVar3;
                    oe1 oe1Var12 = oe1Var2;
                    long j13 = jE;
                    m1894xe1b4b74(z2, je1Var2, cVar13, j13, mb3.rememberScrollState(0, kk0Var2, 0, 1), ux2Var3, null, 0L, 0.0f, 0.0f, null, oe1Var12, kk0Var, (i3 & 8190) | ((i3 << 3) & 458752), (i3 >> 12) & 112, 1984);
                    cVar2 = cVar13;
                    j3 = j13;
                    ux2Var4 = ux2Var3;
                } else {
                    if (i9 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        jE = xr0.E();
                    } else {
                        jE = j2;
                    }
                    if (i6 != 0) {
                        ux2Var3 = new ux2(14);
                    } else {
                        ux2Var3 = ux2Var2;
                    }
                    kk0Var = kk0Var2;
                    c cVar14 = cVar3;
                    oe1 oe1Var13 = oe1Var2;
                    long j14 = jE;
                    m1894xe1b4b74(z2, je1Var2, cVar14, j14, mb3.rememberScrollState(0, kk0Var2, 0, 1), ux2Var3, null, 0L, 0.0f, 0.0f, null, oe1Var13, kk0Var, (i3 & 8190) | ((i3 << 3) & 458752), (i3 >> 12) & 112, 1984);
                    cVar2 = cVar14;
                    j3 = j14;
                    ux2Var4 = ux2Var3;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new xb(z, je1Var, cVar2, j3, ux2Var4, oe1Var, i, i2));
                }
            }
            i3 |= 24576;
            ux2Var2 = ux2Var;
            if ((i2 & 32) != 0) {
                if ((i & 196608) == 0) {
                    oe1Var2 = oe1Var;
                    if (kk0Var2.j(oe1Var2)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i3 |= i8;
                }
                if ((74899 & i3) == 74898) {
                    if (i9 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        jE = xr0.E();
                    } else {
                        jE = j2;
                    }
                    if (i6 != 0) {
                        ux2Var3 = new ux2(14);
                    } else {
                        ux2Var3 = ux2Var2;
                    }
                    kk0Var = kk0Var2;
                    c cVar15 = cVar3;
                    oe1 oe1Var14 = oe1Var2;
                    long j15 = jE;
                    m1894xe1b4b74(z2, je1Var2, cVar15, j15, mb3.rememberScrollState(0, kk0Var2, 0, 1), ux2Var3, null, 0L, 0.0f, 0.0f, null, oe1Var14, kk0Var, (i3 & 8190) | ((i3 << 3) & 458752), (i3 >> 12) & 112, 1984);
                    cVar2 = cVar15;
                    j3 = j15;
                    ux2Var4 = ux2Var3;
                } else {
                    if (i9 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        jE = xr0.E();
                    } else {
                        jE = j2;
                    }
                    if (i6 != 0) {
                        ux2Var3 = new ux2(14);
                    } else {
                        ux2Var3 = ux2Var2;
                    }
                    kk0Var = kk0Var2;
                    c cVar16 = cVar3;
                    oe1 oe1Var15 = oe1Var2;
                    long j16 = jE;
                    m1894xe1b4b74(z2, je1Var2, cVar16, j16, mb3.rememberScrollState(0, kk0Var2, 0, 1), ux2Var3, null, 0L, 0.0f, 0.0f, null, oe1Var15, kk0Var, (i3 & 8190) | ((i3 << 3) & 458752), (i3 >> 12) & 112, 1984);
                    cVar2 = cVar16;
                    j3 = j16;
                    ux2Var4 = ux2Var3;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new xb(z, je1Var, cVar2, j3, ux2Var4, oe1Var, i, i2));
                }
            }
            i3 |= 196608;
            oe1Var2 = oe1Var;
            if ((74899 & i3) == 74898) {
                if (i9 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if (i4 != 0) {
                    jE = xr0.E();
                } else {
                    jE = j2;
                }
                if (i6 != 0) {
                    ux2Var3 = new ux2(14);
                } else {
                    ux2Var3 = ux2Var2;
                }
                kk0Var = kk0Var2;
                c cVar17 = cVar3;
                oe1 oe1Var16 = oe1Var2;
                long j17 = jE;
                m1894xe1b4b74(z2, je1Var2, cVar17, j17, mb3.rememberScrollState(0, kk0Var2, 0, 1), ux2Var3, null, 0L, 0.0f, 0.0f, null, oe1Var16, kk0Var, (i3 & 8190) | ((i3 << 3) & 458752), (i3 >> 12) & 112, 1984);
                cVar2 = cVar17;
                j3 = j17;
                ux2Var4 = ux2Var3;
            } else {
                if (i9 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if (i4 != 0) {
                    jE = xr0.E();
                } else {
                    jE = j2;
                }
                if (i6 != 0) {
                    ux2Var3 = new ux2(14);
                } else {
                    ux2Var3 = ux2Var2;
                }
                kk0Var = kk0Var2;
                c cVar18 = cVar3;
                oe1 oe1Var17 = oe1Var2;
                long j18 = jE;
                m1894xe1b4b74(z2, je1Var2, cVar18, j18, mb3.rememberScrollState(0, kk0Var2, 0, 1), ux2Var3, null, 0L, 0.0f, 0.0f, null, oe1Var17, kk0Var, (i3 & 8190) | ((i3 << 3) & 458752), (i3 >> 12) & 112, 1984);
                cVar2 = cVar18;
                j3 = j18;
                ux2Var4 = ux2Var3;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new xb(z, je1Var, cVar2, j3, ux2Var4, oe1Var, i, i2));
            }
        }
        i3 |= 384;
        cVar2 = cVar;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                j2 = j;
                if (kk0Var2.g(j2)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    ux2Var2 = ux2Var;
                    if (kk0Var2.h(ux2Var2)) {
                        i7 = 16384;
                    } else {
                        i7 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                    }
                    i3 |= i7;
                }
                if ((i2 & 32) != 0) {
                    if ((i & 196608) == 0) {
                        oe1Var2 = oe1Var;
                        if (kk0Var2.j(oe1Var2)) {
                            i8 = 131072;
                        } else {
                            i8 = 65536;
                        }
                        i3 |= i8;
                    }
                    if ((74899 & i3) == 74898) {
                        if (i9 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            jE = xr0.E();
                        } else {
                            jE = j2;
                        }
                        if (i6 != 0) {
                            ux2Var3 = new ux2(14);
                        } else {
                            ux2Var3 = ux2Var2;
                        }
                        kk0Var = kk0Var2;
                        c cVar19 = cVar3;
                        oe1 oe1Var18 = oe1Var2;
                        long j19 = jE;
                        m1894xe1b4b74(z2, je1Var2, cVar19, j19, mb3.rememberScrollState(0, kk0Var2, 0, 1), ux2Var3, null, 0L, 0.0f, 0.0f, null, oe1Var18, kk0Var, (i3 & 8190) | ((i3 << 3) & 458752), (i3 >> 12) & 112, 1984);
                        cVar2 = cVar19;
                        j3 = j19;
                        ux2Var4 = ux2Var3;
                    } else {
                        if (i9 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            jE = xr0.E();
                        } else {
                            jE = j2;
                        }
                        if (i6 != 0) {
                            ux2Var3 = new ux2(14);
                        } else {
                            ux2Var3 = ux2Var2;
                        }
                        kk0Var = kk0Var2;
                        c cVar110 = cVar3;
                        oe1 oe1Var19 = oe1Var2;
                        long j110 = jE;
                        m1894xe1b4b74(z2, je1Var2, cVar110, j110, mb3.rememberScrollState(0, kk0Var2, 0, 1), ux2Var3, null, 0L, 0.0f, 0.0f, null, oe1Var19, kk0Var, (i3 & 8190) | ((i3 << 3) & 458752), (i3 >> 12) & 112, 1984);
                        cVar2 = cVar110;
                        j3 = j110;
                        ux2Var4 = ux2Var3;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new xb(z, je1Var, cVar2, j3, ux2Var4, oe1Var, i, i2));
                    }
                }
                i3 |= 196608;
                oe1Var2 = oe1Var;
                if ((74899 & i3) == 74898) {
                    if (i9 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        jE = xr0.E();
                    } else {
                        jE = j2;
                    }
                    if (i6 != 0) {
                        ux2Var3 = new ux2(14);
                    } else {
                        ux2Var3 = ux2Var2;
                    }
                    kk0Var = kk0Var2;
                    c cVar111 = cVar3;
                    oe1 oe1Var110 = oe1Var2;
                    long j111 = jE;
                    m1894xe1b4b74(z2, je1Var2, cVar111, j111, mb3.rememberScrollState(0, kk0Var2, 0, 1), ux2Var3, null, 0L, 0.0f, 0.0f, null, oe1Var110, kk0Var, (i3 & 8190) | ((i3 << 3) & 458752), (i3 >> 12) & 112, 1984);
                    cVar2 = cVar111;
                    j3 = j111;
                    ux2Var4 = ux2Var3;
                } else {
                    if (i9 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        jE = xr0.E();
                    } else {
                        jE = j2;
                    }
                    if (i6 != 0) {
                        ux2Var3 = new ux2(14);
                    } else {
                        ux2Var3 = ux2Var2;
                    }
                    kk0Var = kk0Var2;
                    c cVar112 = cVar3;
                    oe1 oe1Var111 = oe1Var2;
                    long j112 = jE;
                    m1894xe1b4b74(z2, je1Var2, cVar112, j112, mb3.rememberScrollState(0, kk0Var2, 0, 1), ux2Var3, null, 0L, 0.0f, 0.0f, null, oe1Var111, kk0Var, (i3 & 8190) | ((i3 << 3) & 458752), (i3 >> 12) & 112, 1984);
                    cVar2 = cVar112;
                    j3 = j112;
                    ux2Var4 = ux2Var3;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new xb(z, je1Var, cVar2, j3, ux2Var4, oe1Var, i, i2));
                }
            }
            i3 |= 24576;
            ux2Var2 = ux2Var;
            if ((i2 & 32) != 0) {
                if ((i & 196608) == 0) {
                    oe1Var2 = oe1Var;
                    if (kk0Var2.j(oe1Var2)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i3 |= i8;
                }
                if ((74899 & i3) == 74898) {
                    if (i9 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        jE = xr0.E();
                    } else {
                        jE = j2;
                    }
                    if (i6 != 0) {
                        ux2Var3 = new ux2(14);
                    } else {
                        ux2Var3 = ux2Var2;
                    }
                    kk0Var = kk0Var2;
                    c cVar113 = cVar3;
                    oe1 oe1Var112 = oe1Var2;
                    long j113 = jE;
                    m1894xe1b4b74(z2, je1Var2, cVar113, j113, mb3.rememberScrollState(0, kk0Var2, 0, 1), ux2Var3, null, 0L, 0.0f, 0.0f, null, oe1Var112, kk0Var, (i3 & 8190) | ((i3 << 3) & 458752), (i3 >> 12) & 112, 1984);
                    cVar2 = cVar113;
                    j3 = j113;
                    ux2Var4 = ux2Var3;
                } else {
                    if (i9 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        jE = xr0.E();
                    } else {
                        jE = j2;
                    }
                    if (i6 != 0) {
                        ux2Var3 = new ux2(14);
                    } else {
                        ux2Var3 = ux2Var2;
                    }
                    kk0Var = kk0Var2;
                    c cVar114 = cVar3;
                    oe1 oe1Var113 = oe1Var2;
                    long j114 = jE;
                    m1894xe1b4b74(z2, je1Var2, cVar114, j114, mb3.rememberScrollState(0, kk0Var2, 0, 1), ux2Var3, null, 0L, 0.0f, 0.0f, null, oe1Var113, kk0Var, (i3 & 8190) | ((i3 << 3) & 458752), (i3 >> 12) & 112, 1984);
                    cVar2 = cVar114;
                    j3 = j114;
                    ux2Var4 = ux2Var3;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new xb(z, je1Var, cVar2, j3, ux2Var4, oe1Var, i, i2));
                }
            }
            i3 |= 196608;
            oe1Var2 = oe1Var;
            if ((74899 & i3) == 74898) {
                if (i9 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if (i4 != 0) {
                    jE = xr0.E();
                } else {
                    jE = j2;
                }
                if (i6 != 0) {
                    ux2Var3 = new ux2(14);
                } else {
                    ux2Var3 = ux2Var2;
                }
                kk0Var = kk0Var2;
                c cVar115 = cVar3;
                oe1 oe1Var114 = oe1Var2;
                long j115 = jE;
                m1894xe1b4b74(z2, je1Var2, cVar115, j115, mb3.rememberScrollState(0, kk0Var2, 0, 1), ux2Var3, null, 0L, 0.0f, 0.0f, null, oe1Var114, kk0Var, (i3 & 8190) | ((i3 << 3) & 458752), (i3 >> 12) & 112, 1984);
                cVar2 = cVar115;
                j3 = j115;
                ux2Var4 = ux2Var3;
            } else {
                if (i9 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if (i4 != 0) {
                    jE = xr0.E();
                } else {
                    jE = j2;
                }
                if (i6 != 0) {
                    ux2Var3 = new ux2(14);
                } else {
                    ux2Var3 = ux2Var2;
                }
                kk0Var = kk0Var2;
                c cVar116 = cVar3;
                oe1 oe1Var115 = oe1Var2;
                long j116 = jE;
                m1894xe1b4b74(z2, je1Var2, cVar116, j116, mb3.rememberScrollState(0, kk0Var2, 0, 1), ux2Var3, null, 0L, 0.0f, 0.0f, null, oe1Var115, kk0Var, (i3 & 8190) | ((i3 << 3) & 458752), (i3 >> 12) & 112, 1984);
                cVar2 = cVar116;
                j3 = j116;
                ux2Var4 = ux2Var3;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new xb(z, je1Var, cVar2, j3, ux2Var4, oe1Var, i, i2));
            }
        }
        i3 |= 3072;
        j2 = j;
        i6 = i2 & 16;
        if (i6 != 0) {
            if ((i & 24576) == 0) {
                ux2Var2 = ux2Var;
                if (kk0Var2.h(ux2Var2)) {
                    i7 = 16384;
                } else {
                    i7 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                }
                i3 |= i7;
            }
            if ((i2 & 32) != 0) {
                if ((i & 196608) == 0) {
                    oe1Var2 = oe1Var;
                    if (kk0Var2.j(oe1Var2)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i3 |= i8;
                }
                if ((74899 & i3) == 74898) {
                    if (i9 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        jE = xr0.E();
                    } else {
                        jE = j2;
                    }
                    if (i6 != 0) {
                        ux2Var3 = new ux2(14);
                    } else {
                        ux2Var3 = ux2Var2;
                    }
                    kk0Var = kk0Var2;
                    c cVar117 = cVar3;
                    oe1 oe1Var116 = oe1Var2;
                    long j117 = jE;
                    m1894xe1b4b74(z2, je1Var2, cVar117, j117, mb3.rememberScrollState(0, kk0Var2, 0, 1), ux2Var3, null, 0L, 0.0f, 0.0f, null, oe1Var116, kk0Var, (i3 & 8190) | ((i3 << 3) & 458752), (i3 >> 12) & 112, 1984);
                    cVar2 = cVar117;
                    j3 = j117;
                    ux2Var4 = ux2Var3;
                } else {
                    if (i9 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        jE = xr0.E();
                    } else {
                        jE = j2;
                    }
                    if (i6 != 0) {
                        ux2Var3 = new ux2(14);
                    } else {
                        ux2Var3 = ux2Var2;
                    }
                    kk0Var = kk0Var2;
                    c cVar118 = cVar3;
                    oe1 oe1Var117 = oe1Var2;
                    long j118 = jE;
                    m1894xe1b4b74(z2, je1Var2, cVar118, j118, mb3.rememberScrollState(0, kk0Var2, 0, 1), ux2Var3, null, 0L, 0.0f, 0.0f, null, oe1Var117, kk0Var, (i3 & 8190) | ((i3 << 3) & 458752), (i3 >> 12) & 112, 1984);
                    cVar2 = cVar118;
                    j3 = j118;
                    ux2Var4 = ux2Var3;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new xb(z, je1Var, cVar2, j3, ux2Var4, oe1Var, i, i2));
                }
            }
            i3 |= 196608;
            oe1Var2 = oe1Var;
            if ((74899 & i3) == 74898) {
                if (i9 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if (i4 != 0) {
                    jE = xr0.E();
                } else {
                    jE = j2;
                }
                if (i6 != 0) {
                    ux2Var3 = new ux2(14);
                } else {
                    ux2Var3 = ux2Var2;
                }
                kk0Var = kk0Var2;
                c cVar119 = cVar3;
                oe1 oe1Var118 = oe1Var2;
                long j119 = jE;
                m1894xe1b4b74(z2, je1Var2, cVar119, j119, mb3.rememberScrollState(0, kk0Var2, 0, 1), ux2Var3, null, 0L, 0.0f, 0.0f, null, oe1Var118, kk0Var, (i3 & 8190) | ((i3 << 3) & 458752), (i3 >> 12) & 112, 1984);
                cVar2 = cVar119;
                j3 = j119;
                ux2Var4 = ux2Var3;
            } else {
                if (i9 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if (i4 != 0) {
                    jE = xr0.E();
                } else {
                    jE = j2;
                }
                if (i6 != 0) {
                    ux2Var3 = new ux2(14);
                } else {
                    ux2Var3 = ux2Var2;
                }
                kk0Var = kk0Var2;
                c cVar1110 = cVar3;
                oe1 oe1Var119 = oe1Var2;
                long j1110 = jE;
                m1894xe1b4b74(z2, je1Var2, cVar1110, j1110, mb3.rememberScrollState(0, kk0Var2, 0, 1), ux2Var3, null, 0L, 0.0f, 0.0f, null, oe1Var119, kk0Var, (i3 & 8190) | ((i3 << 3) & 458752), (i3 >> 12) & 112, 1984);
                cVar2 = cVar1110;
                j3 = j1110;
                ux2Var4 = ux2Var3;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new xb(z, je1Var, cVar2, j3, ux2Var4, oe1Var, i, i2));
            }
        }
        i3 |= 24576;
        ux2Var2 = ux2Var;
        if ((i2 & 32) != 0) {
            if ((i & 196608) == 0) {
                oe1Var2 = oe1Var;
                if (kk0Var2.j(oe1Var2)) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
                i3 |= i8;
            }
            if ((74899 & i3) == 74898) {
                if (i9 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if (i4 != 0) {
                    jE = xr0.E();
                } else {
                    jE = j2;
                }
                if (i6 != 0) {
                    ux2Var3 = new ux2(14);
                } else {
                    ux2Var3 = ux2Var2;
                }
                kk0Var = kk0Var2;
                c cVar1111 = cVar3;
                oe1 oe1Var1110 = oe1Var2;
                long j1111 = jE;
                m1894xe1b4b74(z2, je1Var2, cVar1111, j1111, mb3.rememberScrollState(0, kk0Var2, 0, 1), ux2Var3, null, 0L, 0.0f, 0.0f, null, oe1Var1110, kk0Var, (i3 & 8190) | ((i3 << 3) & 458752), (i3 >> 12) & 112, 1984);
                cVar2 = cVar1111;
                j3 = j1111;
                ux2Var4 = ux2Var3;
            } else {
                if (i9 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if (i4 != 0) {
                    jE = xr0.E();
                } else {
                    jE = j2;
                }
                if (i6 != 0) {
                    ux2Var3 = new ux2(14);
                } else {
                    ux2Var3 = ux2Var2;
                }
                kk0Var = kk0Var2;
                c cVar1112 = cVar3;
                oe1 oe1Var1111 = oe1Var2;
                long j1112 = jE;
                m1894xe1b4b74(z2, je1Var2, cVar1112, j1112, mb3.rememberScrollState(0, kk0Var2, 0, 1), ux2Var3, null, 0L, 0.0f, 0.0f, null, oe1Var1111, kk0Var, (i3 & 8190) | ((i3 << 3) & 458752), (i3 >> 12) & 112, 1984);
                cVar2 = cVar1112;
                j3 = j1112;
                ux2Var4 = ux2Var3;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new xb(z, je1Var, cVar2, j3, ux2Var4, oe1Var, i, i2));
            }
        }
        i3 |= 196608;
        oe1Var2 = oe1Var;
        if ((74899 & i3) == 74898) {
            if (i9 != 0) {
                cVar3 = c.i;
            } else {
                cVar3 = cVar2;
            }
            if (i4 != 0) {
                jE = xr0.E();
            } else {
                jE = j2;
            }
            if (i6 != 0) {
                ux2Var3 = new ux2(14);
            } else {
                ux2Var3 = ux2Var2;
            }
            kk0Var = kk0Var2;
            c cVar1113 = cVar3;
            oe1 oe1Var1112 = oe1Var2;
            long j1113 = jE;
            m1894xe1b4b74(z2, je1Var2, cVar1113, j1113, mb3.rememberScrollState(0, kk0Var2, 0, 1), ux2Var3, null, 0L, 0.0f, 0.0f, null, oe1Var1112, kk0Var, (i3 & 8190) | ((i3 << 3) & 458752), (i3 >> 12) & 112, 1984);
            cVar2 = cVar1113;
            j3 = j1113;
            ux2Var4 = ux2Var3;
        } else {
            if (i9 != 0) {
                cVar3 = c.i;
            } else {
                cVar3 = cVar2;
            }
            if (i4 != 0) {
                jE = xr0.E();
            } else {
                jE = j2;
            }
            if (i6 != 0) {
                ux2Var3 = new ux2(14);
            } else {
                ux2Var3 = ux2Var2;
            }
            kk0Var = kk0Var2;
            c cVar1114 = cVar3;
            oe1 oe1Var1113 = oe1Var2;
            long j1114 = jE;
            m1894xe1b4b74(z2, je1Var2, cVar1114, j1114, mb3.rememberScrollState(0, kk0Var2, 0, 1), ux2Var3, null, 0L, 0.0f, 0.0f, null, oe1Var1113, kk0Var, (i3 & 8190) | ((i3 << 3) & 458752), (i3 >> 12) & 112, 1984);
            cVar2 = cVar1114;
            j3 = j1114;
            ux2Var4 = ux2Var3;
        }
        w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new xb(z, je1Var, cVar2, j3, ux2Var4, oe1Var, i, i2));
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x011a  */
    /* JADX WARN: Code duplicated, block: B:103:0x011e  */
    /* JADX WARN: Code duplicated, block: B:105:0x0128  */
    /* JADX WARN: Code duplicated, block: B:106:0x012b  */
    /* JADX WARN: Code duplicated, block: B:110:0x0133  */
    /* JADX WARN: Code duplicated, block: B:111:0x013a  */
    /* JADX WARN: Code duplicated, block: B:113:0x013e  */
    /* JADX WARN: Code duplicated, block: B:115:0x0148  */
    /* JADX WARN: Code duplicated, block: B:116:0x014b  */
    /* JADX WARN: Code duplicated, block: B:118:0x0150  */
    /* JADX WARN: Code duplicated, block: B:121:0x015a  */
    /* JADX WARN: Code duplicated, block: B:123:0x015f  */
    /* JADX WARN: Code duplicated, block: B:125:0x0163  */
    /* JADX WARN: Code duplicated, block: B:127:0x016b  */
    /* JADX WARN: Code duplicated, block: B:128:0x016e  */
    /* JADX WARN: Code duplicated, block: B:132:0x017c  */
    /* JADX WARN: Code duplicated, block: B:138:0x019b  */
    /* JADX WARN: Code duplicated, block: B:140:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:153:0x01da A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:154:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:155:0x01df  */
    /* JADX WARN: Code duplicated, block: B:157:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:158:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:161:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:162:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:164:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:167:0x0201  */
    /* JADX WARN: Code duplicated, block: B:170:0x020d  */
    /* JADX WARN: Code duplicated, block: B:171:0x0217  */
    /* JADX WARN: Code duplicated, block: B:173:0x021a  */
    /* JADX WARN: Code duplicated, block: B:174:0x021e  */
    /* JADX WARN: Code duplicated, block: B:176:0x0221  */
    /* JADX WARN: Code duplicated, block: B:177:0x0226  */
    /* JADX WARN: Code duplicated, block: B:179:0x022a  */
    /* JADX WARN: Code duplicated, block: B:181:0x023a  */
    /* JADX WARN: Code duplicated, block: B:184:0x0254  */
    /* JADX WARN: Code duplicated, block: B:187:0x0277  */
    /* JADX WARN: Code duplicated, block: B:189:0x0285  */
    /* JADX WARN: Code duplicated, block: B:191:0x028f  */
    /* JADX WARN: Code duplicated, block: B:194:0x02af  */
    /* JADX WARN: Code duplicated, block: B:195:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:198:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:202:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:207:0x0320  */
    /* JADX WARN: Code duplicated, block: B:209:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Code duplicated, block: B:28:0x0050  */
    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:32:0x005c  */
    /* JADX WARN: Code duplicated, block: B:33:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:39:0x006b  */
    /* JADX WARN: Code duplicated, block: B:41:0x006f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0077  */
    /* JADX WARN: Code duplicated, block: B:44:0x007a  */
    /* JADX WARN: Code duplicated, block: B:48:0x0082  */
    /* JADX WARN: Code duplicated, block: B:50:0x0086  */
    /* JADX WARN: Code duplicated, block: B:53:0x0091 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:56:0x0098  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:69:0x00be  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:79:0x00da  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:90:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:92:0x0100  */
    /* JADX WARN: Code duplicated, block: B:94:0x0106  */
    /* JADX WARN: Code duplicated, block: B:95:0x0109  */
    /* JADX WARN: Code duplicated, block: B:99:0x0113  */
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
    /* JADX INFO: renamed from: DropdownMenu-IlH_yew, reason: not valid java name */
    public static final void m1894xe1b4b74(boolean z, je1 je1Var, c cVar, long j, rb3 rb3Var, ux2 ux2Var, rg3 rg3Var, long j2, float f, float f2, iw iwVar, oe1 oe1Var, ck0 ck0Var, int i, int i2, int i3) {
        int i4;
        je1 je1Var2;
        int i5;
        c cVar2;
        int i6;
        int i7;
        int i8;
        int i9;
        ux2 ux2Var2;
        int i10;
        rg3 shape;
        long j3;
        int i11;
        float f3;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        c cVar3;
        long jE;
        rb3 rb3VarRememberScrollState;
        long containerColor;
        float f4;
        float f5;
        iw iwVar2;
        rb3 rb3Var2;
        Object objP;
        ni2 ni2Var;
        Object objP2;
        mi2 mi2Var;
        wu0 wu0Var;
        boolean z2;
        boolean zH;
        Object objP3;
        boolean z3;
        ux2 ux2Var3;
        long j4;
        c cVar4;
        rb3 rb3Var3;
        rg3 rg3Var2;
        long j5;
        float f6;
        float f7;
        iw iwVar3;
        w33 w33VarV;
        int i19;
        int i20;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(1431928300);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (kk0Var.i(z) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) == 0) {
            if ((i & 48) == 0) {
                je1Var2 = je1Var;
                i4 |= kk0Var.j(je1Var2) ? 32 : 16;
            }
            i5 = i3 & 4;
            if (i5 != 0) {
                if ((i & 384) == 0) {
                    cVar2 = cVar;
                    if (kk0Var.h(cVar2)) {
                        i6 = FontInfo.NUMBER_OF_CHAR_CODES;
                    } else {
                        i6 = Uuid.SIZE_BITS;
                    }
                    i4 |= i6;
                }
                i7 = i3 & 8;
                if (i7 != 0) {
                    if ((i & 3072) == 0) {
                        if (kk0Var.g(j)) {
                            i8 = 2048;
                        } else {
                            i8 = 1024;
                        }
                        i4 |= i8;
                    }
                    if ((i & 24576) != 0) {
                        i4 |= ((i3 & 16) == 0 || !kk0Var.h(rb3Var)) ? ConstantsKt.DEFAULT_BUFFER_SIZE : 16384;
                    }
                    i9 = i3 & 32;
                    if (i9 != 0) {
                        i4 |= 196608;
                        ux2Var2 = ux2Var;
                    } else {
                        ux2Var2 = ux2Var;
                        if ((i & 196608) == 0) {
                            if (kk0Var.h(ux2Var2)) {
                                i10 = 131072;
                            } else {
                                i10 = 65536;
                            }
                            i4 |= i10;
                        }
                    }
                    if ((i & 1572864) == 0) {
                        shape = rg3Var;
                        if ((i3 & 64) == 0 || !kk0Var.h(shape)) {
                            i20 = 524288;
                        } else {
                            i20 = 1048576;
                        }
                        i4 |= i20;
                    } else {
                        shape = rg3Var;
                    }
                    if ((i & 12582912) == 0) {
                        j3 = j2;
                        if ((i3 & Uuid.SIZE_BITS) == 0 || !kk0Var.g(j3)) {
                            i19 = 4194304;
                        } else {
                            i19 = 8388608;
                        }
                        i4 |= i19;
                    } else {
                        j3 = j2;
                    }
                    i11 = i3 & FontInfo.NUMBER_OF_CHAR_CODES;
                    if (i11 != 0) {
                        i4 |= 100663296;
                        f3 = f;
                    } else {
                        f3 = f;
                        if ((i & 100663296) == 0) {
                            if (kk0Var.e(f3)) {
                                i12 = 67108864;
                            } else {
                                i12 = 33554432;
                            }
                            i4 |= i12;
                        }
                    }
                    i13 = i3 & ConstantsKt.MINIMUM_BLOCK_SIZE;
                    if (i13 != 0) {
                        if ((i & 805306368) == 0) {
                            if (kk0Var.e(f2)) {
                                i14 = 536870912;
                            } else {
                                i14 = 268435456;
                            }
                            i4 |= i14;
                        }
                        i15 = i3 & 1024;
                        if (i15 != 0) {
                            i16 = i2 | 6;
                        } else if ((i2 & 6) == 0) {
                            if (kk0Var.h(iwVar)) {
                                i17 = 4;
                            } else {
                                i17 = 2;
                            }
                            i16 = i2 | i17;
                        } else {
                            i16 = i2;
                        }
                        if ((i3 & 2048) != 0) {
                            if ((i2 & 48) == 0) {
                                if (kk0Var.j(oe1Var)) {
                                    i18 = 32;
                                } else {
                                    i18 = 16;
                                }
                                i16 |= i18;
                            }
                            if ((i4 & 306783379) != 306783378 && (i16 & 19) == 18 && kk0Var.F()) {
                                kk0Var.V();
                                rb3Var3 = rb3Var;
                                f6 = f3;
                                cVar4 = cVar2;
                                j5 = j3;
                                f7 = f2;
                                iwVar3 = iwVar;
                                rg3Var2 = shape;
                                ux2Var3 = ux2Var2;
                                j4 = j;
                            } else {
                                kk0Var.X();
                                if ((i & 1) != 0 || kk0Var.D()) {
                                    if (i5 != 0) {
                                        cVar3 = c.i;
                                    } else {
                                        cVar3 = cVar2;
                                    }
                                    if (i7 != 0) {
                                        jE = xr0.E();
                                    } else {
                                        jE = j;
                                    }
                                    if ((i3 & 16) != 0) {
                                        rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                                        i4 &= -57345;
                                    } else {
                                        rb3VarRememberScrollState = rb3Var;
                                    }
                                    if (i9 != 0) {
                                        ux2Var2 = a;
                                    }
                                    if ((i3 & 64) != 0) {
                                        shape = ic2.a.getShape(kk0Var, 6);
                                        i4 &= -3670017;
                                    }
                                    if ((i3 & Uuid.SIZE_BITS) != 0) {
                                        containerColor = ic2.a.getContainerColor(kk0Var, 6);
                                        i4 &= -29360129;
                                    } else {
                                        containerColor = j3;
                                    }
                                    if (i11 != 0) {
                                        ic2 ic2Var = ic2.a;
                                        f4 = 0.0f;
                                    } else {
                                        f4 = f3;
                                    }
                                    if (i13 != 0) {
                                        ic2 ic2Var2 = ic2.a;
                                        f5 = 3.0f;
                                    } else {
                                        f5 = f2;
                                    }
                                    if (i15 != 0) {
                                        iwVar2 = null;
                                    } else {
                                        iwVar2 = iwVar;
                                    }
                                    rb3Var2 = rb3VarRememberScrollState;
                                } else {
                                    kk0Var.V();
                                    if ((i3 & 16) != 0) {
                                        i4 &= -57345;
                                    }
                                    if ((i3 & 64) != 0) {
                                        i4 &= -3670017;
                                    }
                                    if ((i3 & Uuid.SIZE_BITS) != 0) {
                                        i4 &= -29360129;
                                    }
                                    rb3Var2 = rb3Var;
                                    f5 = f2;
                                    iwVar2 = iwVar;
                                    shape = shape;
                                    f4 = f3;
                                    cVar3 = cVar2;
                                    containerColor = j3;
                                    jE = j;
                                }
                                kk0Var.s();
                                objP = kk0Var.P();
                                if (objP == Composer$Companion.getEmpty()) {
                                    objP = new ni2(Boolean.FALSE);
                                    kk0Var.l0(objP);
                                }
                                ni2Var = (ni2) objP;
                                ni2Var.c.setValue(Boolean.valueOf(z));
                                if (((Boolean) ni2Var.b.getValue()).booleanValue() || ((Boolean) ni2Var.c.getValue()).booleanValue()) {
                                    objP2 = kk0Var.P();
                                    if (objP2 == Composer$Companion.getEmpty()) {
                                        objP2 = cl3.d(new e54(e54.b));
                                        kk0Var.l0(objP2);
                                    }
                                    mi2Var = (mi2) objP2;
                                    wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                                    if ((i4 & 7168) == 2048) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    zH = z2 | kk0Var.h(wu0Var);
                                    objP3 = kk0Var.P();
                                    if (!zH || objP3 == Composer$Companion.getEmpty()) {
                                        z3 = true;
                                        objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                                        kk0Var.l0(objP3);
                                    } else {
                                        z3 = true;
                                    }
                                    yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                                }
                                ux2Var3 = ux2Var2;
                                j4 = jE;
                                cVar4 = cVar3;
                                rb3Var3 = rb3Var2;
                                rg3Var2 = shape;
                                j5 = containerColor;
                                f6 = f4;
                                f7 = f5;
                                iwVar3 = iwVar2;
                            }
                            w33VarV = kk0Var.v();
                            if (w33VarV != null) {
                                w33VarV.updateScope(new vb(z, je1Var, cVar4, j4, rb3Var3, ux2Var3, rg3Var2, j5, f6, f7, iwVar3, oe1Var, i, i2, i3));
                            }
                        }
                        i16 |= 48;
                        if ((i4 & 306783379) != 306783378) {
                            kk0Var.X();
                            if ((i & 1) != 0) {
                                if (i5 != 0) {
                                    cVar3 = c.i;
                                } else {
                                    cVar3 = cVar2;
                                }
                                if (i7 != 0) {
                                    jE = xr0.E();
                                } else {
                                    jE = j;
                                }
                                if ((i3 & 16) != 0) {
                                    rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                                    i4 &= -57345;
                                } else {
                                    rb3VarRememberScrollState = rb3Var;
                                }
                                if (i9 != 0) {
                                    ux2Var2 = a;
                                }
                                if ((i3 & 64) != 0) {
                                    shape = ic2.a.getShape(kk0Var, 6);
                                    i4 &= -3670017;
                                }
                                if ((i3 & Uuid.SIZE_BITS) != 0) {
                                    containerColor = ic2.a.getContainerColor(kk0Var, 6);
                                    i4 &= -29360129;
                                } else {
                                    containerColor = j3;
                                }
                                if (i11 != 0) {
                                    ic2 ic2Var3 = ic2.a;
                                    f4 = 0.0f;
                                } else {
                                    f4 = f3;
                                }
                                if (i13 != 0) {
                                    ic2 ic2Var4 = ic2.a;
                                    f5 = 3.0f;
                                } else {
                                    f5 = f2;
                                }
                                if (i15 != 0) {
                                    iwVar2 = null;
                                } else {
                                    iwVar2 = iwVar;
                                }
                                rb3Var2 = rb3VarRememberScrollState;
                            } else {
                                if (i5 != 0) {
                                    cVar3 = c.i;
                                } else {
                                    cVar3 = cVar2;
                                }
                                if (i7 != 0) {
                                    jE = xr0.E();
                                } else {
                                    jE = j;
                                }
                                if ((i3 & 16) != 0) {
                                    rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                                    i4 &= -57345;
                                } else {
                                    rb3VarRememberScrollState = rb3Var;
                                }
                                if (i9 != 0) {
                                    ux2Var2 = a;
                                }
                                if ((i3 & 64) != 0) {
                                    shape = ic2.a.getShape(kk0Var, 6);
                                    i4 &= -3670017;
                                }
                                if ((i3 & Uuid.SIZE_BITS) != 0) {
                                    containerColor = ic2.a.getContainerColor(kk0Var, 6);
                                    i4 &= -29360129;
                                } else {
                                    containerColor = j3;
                                }
                                if (i11 != 0) {
                                    ic2 ic2Var5 = ic2.a;
                                    f4 = 0.0f;
                                } else {
                                    f4 = f3;
                                }
                                if (i13 != 0) {
                                    ic2 ic2Var6 = ic2.a;
                                    f5 = 3.0f;
                                } else {
                                    f5 = f2;
                                }
                                if (i15 != 0) {
                                    iwVar2 = null;
                                } else {
                                    iwVar2 = iwVar;
                                }
                                rb3Var2 = rb3VarRememberScrollState;
                            }
                            kk0Var.s();
                            objP = kk0Var.P();
                            if (objP == Composer$Companion.getEmpty()) {
                                objP = new ni2(Boolean.FALSE);
                                kk0Var.l0(objP);
                            }
                            ni2Var = (ni2) objP;
                            ni2Var.c.setValue(Boolean.valueOf(z));
                            if (((Boolean) ni2Var.b.getValue()).booleanValue()) {
                                objP2 = kk0Var.P();
                                if (objP2 == Composer$Companion.getEmpty()) {
                                    objP2 = cl3.d(new e54(e54.b));
                                    kk0Var.l0(objP2);
                                }
                                mi2Var = (mi2) objP2;
                                wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                                if ((i4 & 7168) == 2048) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                zH = z2 | kk0Var.h(wu0Var);
                                objP3 = kk0Var.P();
                                if (zH) {
                                    z3 = true;
                                    objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                                    kk0Var.l0(objP3);
                                } else {
                                    z3 = true;
                                    objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                                    kk0Var.l0(objP3);
                                }
                                yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                            } else {
                                objP2 = kk0Var.P();
                                if (objP2 == Composer$Companion.getEmpty()) {
                                    objP2 = cl3.d(new e54(e54.b));
                                    kk0Var.l0(objP2);
                                }
                                mi2Var = (mi2) objP2;
                                wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                                if ((i4 & 7168) == 2048) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                zH = z2 | kk0Var.h(wu0Var);
                                objP3 = kk0Var.P();
                                if (zH) {
                                    z3 = true;
                                    objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                                    kk0Var.l0(objP3);
                                } else {
                                    z3 = true;
                                    objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                                    kk0Var.l0(objP3);
                                }
                                yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                            }
                            ux2Var3 = ux2Var2;
                            j4 = jE;
                            cVar4 = cVar3;
                            rb3Var3 = rb3Var2;
                            rg3Var2 = shape;
                            j5 = containerColor;
                            f6 = f4;
                            f7 = f5;
                            iwVar3 = iwVar2;
                        } else {
                            kk0Var.X();
                            if ((i & 1) != 0) {
                                if (i5 != 0) {
                                    cVar3 = c.i;
                                } else {
                                    cVar3 = cVar2;
                                }
                                if (i7 != 0) {
                                    jE = xr0.E();
                                } else {
                                    jE = j;
                                }
                                if ((i3 & 16) != 0) {
                                    rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                                    i4 &= -57345;
                                } else {
                                    rb3VarRememberScrollState = rb3Var;
                                }
                                if (i9 != 0) {
                                    ux2Var2 = a;
                                }
                                if ((i3 & 64) != 0) {
                                    shape = ic2.a.getShape(kk0Var, 6);
                                    i4 &= -3670017;
                                }
                                if ((i3 & Uuid.SIZE_BITS) != 0) {
                                    containerColor = ic2.a.getContainerColor(kk0Var, 6);
                                    i4 &= -29360129;
                                } else {
                                    containerColor = j3;
                                }
                                if (i11 != 0) {
                                    ic2 ic2Var7 = ic2.a;
                                    f4 = 0.0f;
                                } else {
                                    f4 = f3;
                                }
                                if (i13 != 0) {
                                    ic2 ic2Var8 = ic2.a;
                                    f5 = 3.0f;
                                } else {
                                    f5 = f2;
                                }
                                if (i15 != 0) {
                                    iwVar2 = null;
                                } else {
                                    iwVar2 = iwVar;
                                }
                                rb3Var2 = rb3VarRememberScrollState;
                            } else {
                                if (i5 != 0) {
                                    cVar3 = c.i;
                                } else {
                                    cVar3 = cVar2;
                                }
                                if (i7 != 0) {
                                    jE = xr0.E();
                                } else {
                                    jE = j;
                                }
                                if ((i3 & 16) != 0) {
                                    rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                                    i4 &= -57345;
                                } else {
                                    rb3VarRememberScrollState = rb3Var;
                                }
                                if (i9 != 0) {
                                    ux2Var2 = a;
                                }
                                if ((i3 & 64) != 0) {
                                    shape = ic2.a.getShape(kk0Var, 6);
                                    i4 &= -3670017;
                                }
                                if ((i3 & Uuid.SIZE_BITS) != 0) {
                                    containerColor = ic2.a.getContainerColor(kk0Var, 6);
                                    i4 &= -29360129;
                                } else {
                                    containerColor = j3;
                                }
                                if (i11 != 0) {
                                    ic2 ic2Var9 = ic2.a;
                                    f4 = 0.0f;
                                } else {
                                    f4 = f3;
                                }
                                if (i13 != 0) {
                                    ic2 ic2Var10 = ic2.a;
                                    f5 = 3.0f;
                                } else {
                                    f5 = f2;
                                }
                                if (i15 != 0) {
                                    iwVar2 = null;
                                } else {
                                    iwVar2 = iwVar;
                                }
                                rb3Var2 = rb3VarRememberScrollState;
                            }
                            kk0Var.s();
                            objP = kk0Var.P();
                            if (objP == Composer$Companion.getEmpty()) {
                                objP = new ni2(Boolean.FALSE);
                                kk0Var.l0(objP);
                            }
                            ni2Var = (ni2) objP;
                            ni2Var.c.setValue(Boolean.valueOf(z));
                            if (((Boolean) ni2Var.b.getValue()).booleanValue()) {
                                objP2 = kk0Var.P();
                                if (objP2 == Composer$Companion.getEmpty()) {
                                    objP2 = cl3.d(new e54(e54.b));
                                    kk0Var.l0(objP2);
                                }
                                mi2Var = (mi2) objP2;
                                wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                                if ((i4 & 7168) == 2048) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                zH = z2 | kk0Var.h(wu0Var);
                                objP3 = kk0Var.P();
                                if (zH) {
                                    z3 = true;
                                    objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                                    kk0Var.l0(objP3);
                                } else {
                                    z3 = true;
                                    objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                                    kk0Var.l0(objP3);
                                }
                                yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                            } else {
                                objP2 = kk0Var.P();
                                if (objP2 == Composer$Companion.getEmpty()) {
                                    objP2 = cl3.d(new e54(e54.b));
                                    kk0Var.l0(objP2);
                                }
                                mi2Var = (mi2) objP2;
                                wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                                if ((i4 & 7168) == 2048) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                zH = z2 | kk0Var.h(wu0Var);
                                objP3 = kk0Var.P();
                                if (zH) {
                                    z3 = true;
                                    objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                                    kk0Var.l0(objP3);
                                } else {
                                    z3 = true;
                                    objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                                    kk0Var.l0(objP3);
                                }
                                yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                            }
                            ux2Var3 = ux2Var2;
                            j4 = jE;
                            cVar4 = cVar3;
                            rb3Var3 = rb3Var2;
                            rg3Var2 = shape;
                            j5 = containerColor;
                            f6 = f4;
                            f7 = f5;
                            iwVar3 = iwVar2;
                        }
                        w33VarV = kk0Var.v();
                        if (w33VarV != null) {
                            w33VarV.updateScope(new vb(z, je1Var, cVar4, j4, rb3Var3, ux2Var3, rg3Var2, j5, f6, f7, iwVar3, oe1Var, i, i2, i3));
                        }
                    }
                    i4 |= 805306368;
                    i15 = i3 & 1024;
                    if (i15 != 0) {
                        i16 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        if (kk0Var.h(iwVar)) {
                            i17 = 4;
                        } else {
                            i17 = 2;
                        }
                        i16 = i2 | i17;
                    } else {
                        i16 = i2;
                    }
                    if ((i3 & 2048) != 0) {
                        if ((i2 & 48) == 0) {
                            if (kk0Var.j(oe1Var)) {
                                i18 = 32;
                            } else {
                                i18 = 16;
                            }
                            i16 |= i18;
                        }
                        if ((i4 & 306783379) != 306783378) {
                            kk0Var.X();
                            if ((i & 1) != 0) {
                                if (i5 != 0) {
                                    cVar3 = c.i;
                                } else {
                                    cVar3 = cVar2;
                                }
                                if (i7 != 0) {
                                    jE = xr0.E();
                                } else {
                                    jE = j;
                                }
                                if ((i3 & 16) != 0) {
                                    rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                                    i4 &= -57345;
                                } else {
                                    rb3VarRememberScrollState = rb3Var;
                                }
                                if (i9 != 0) {
                                    ux2Var2 = a;
                                }
                                if ((i3 & 64) != 0) {
                                    shape = ic2.a.getShape(kk0Var, 6);
                                    i4 &= -3670017;
                                }
                                if ((i3 & Uuid.SIZE_BITS) != 0) {
                                    containerColor = ic2.a.getContainerColor(kk0Var, 6);
                                    i4 &= -29360129;
                                } else {
                                    containerColor = j3;
                                }
                                if (i11 != 0) {
                                    ic2 ic2Var11 = ic2.a;
                                    f4 = 0.0f;
                                } else {
                                    f4 = f3;
                                }
                                if (i13 != 0) {
                                    ic2 ic2Var12 = ic2.a;
                                    f5 = 3.0f;
                                } else {
                                    f5 = f2;
                                }
                                if (i15 != 0) {
                                    iwVar2 = null;
                                } else {
                                    iwVar2 = iwVar;
                                }
                                rb3Var2 = rb3VarRememberScrollState;
                            } else {
                                if (i5 != 0) {
                                    cVar3 = c.i;
                                } else {
                                    cVar3 = cVar2;
                                }
                                if (i7 != 0) {
                                    jE = xr0.E();
                                } else {
                                    jE = j;
                                }
                                if ((i3 & 16) != 0) {
                                    rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                                    i4 &= -57345;
                                } else {
                                    rb3VarRememberScrollState = rb3Var;
                                }
                                if (i9 != 0) {
                                    ux2Var2 = a;
                                }
                                if ((i3 & 64) != 0) {
                                    shape = ic2.a.getShape(kk0Var, 6);
                                    i4 &= -3670017;
                                }
                                if ((i3 & Uuid.SIZE_BITS) != 0) {
                                    containerColor = ic2.a.getContainerColor(kk0Var, 6);
                                    i4 &= -29360129;
                                } else {
                                    containerColor = j3;
                                }
                                if (i11 != 0) {
                                    ic2 ic2Var13 = ic2.a;
                                    f4 = 0.0f;
                                } else {
                                    f4 = f3;
                                }
                                if (i13 != 0) {
                                    ic2 ic2Var14 = ic2.a;
                                    f5 = 3.0f;
                                } else {
                                    f5 = f2;
                                }
                                if (i15 != 0) {
                                    iwVar2 = null;
                                } else {
                                    iwVar2 = iwVar;
                                }
                                rb3Var2 = rb3VarRememberScrollState;
                            }
                            kk0Var.s();
                            objP = kk0Var.P();
                            if (objP == Composer$Companion.getEmpty()) {
                                objP = new ni2(Boolean.FALSE);
                                kk0Var.l0(objP);
                            }
                            ni2Var = (ni2) objP;
                            ni2Var.c.setValue(Boolean.valueOf(z));
                            if (((Boolean) ni2Var.b.getValue()).booleanValue()) {
                                objP2 = kk0Var.P();
                                if (objP2 == Composer$Companion.getEmpty()) {
                                    objP2 = cl3.d(new e54(e54.b));
                                    kk0Var.l0(objP2);
                                }
                                mi2Var = (mi2) objP2;
                                wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                                if ((i4 & 7168) == 2048) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                zH = z2 | kk0Var.h(wu0Var);
                                objP3 = kk0Var.P();
                                if (zH) {
                                    z3 = true;
                                    objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                                    kk0Var.l0(objP3);
                                } else {
                                    z3 = true;
                                    objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                                    kk0Var.l0(objP3);
                                }
                                yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                            } else {
                                objP2 = kk0Var.P();
                                if (objP2 == Composer$Companion.getEmpty()) {
                                    objP2 = cl3.d(new e54(e54.b));
                                    kk0Var.l0(objP2);
                                }
                                mi2Var = (mi2) objP2;
                                wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                                if ((i4 & 7168) == 2048) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                zH = z2 | kk0Var.h(wu0Var);
                                objP3 = kk0Var.P();
                                if (zH) {
                                    z3 = true;
                                    objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                                    kk0Var.l0(objP3);
                                } else {
                                    z3 = true;
                                    objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                                    kk0Var.l0(objP3);
                                }
                                yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                            }
                            ux2Var3 = ux2Var2;
                            j4 = jE;
                            cVar4 = cVar3;
                            rb3Var3 = rb3Var2;
                            rg3Var2 = shape;
                            j5 = containerColor;
                            f6 = f4;
                            f7 = f5;
                            iwVar3 = iwVar2;
                        } else {
                            kk0Var.X();
                            if ((i & 1) != 0) {
                                if (i5 != 0) {
                                    cVar3 = c.i;
                                } else {
                                    cVar3 = cVar2;
                                }
                                if (i7 != 0) {
                                    jE = xr0.E();
                                } else {
                                    jE = j;
                                }
                                if ((i3 & 16) != 0) {
                                    rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                                    i4 &= -57345;
                                } else {
                                    rb3VarRememberScrollState = rb3Var;
                                }
                                if (i9 != 0) {
                                    ux2Var2 = a;
                                }
                                if ((i3 & 64) != 0) {
                                    shape = ic2.a.getShape(kk0Var, 6);
                                    i4 &= -3670017;
                                }
                                if ((i3 & Uuid.SIZE_BITS) != 0) {
                                    containerColor = ic2.a.getContainerColor(kk0Var, 6);
                                    i4 &= -29360129;
                                } else {
                                    containerColor = j3;
                                }
                                if (i11 != 0) {
                                    ic2 ic2Var15 = ic2.a;
                                    f4 = 0.0f;
                                } else {
                                    f4 = f3;
                                }
                                if (i13 != 0) {
                                    ic2 ic2Var16 = ic2.a;
                                    f5 = 3.0f;
                                } else {
                                    f5 = f2;
                                }
                                if (i15 != 0) {
                                    iwVar2 = null;
                                } else {
                                    iwVar2 = iwVar;
                                }
                                rb3Var2 = rb3VarRememberScrollState;
                            } else {
                                if (i5 != 0) {
                                    cVar3 = c.i;
                                } else {
                                    cVar3 = cVar2;
                                }
                                if (i7 != 0) {
                                    jE = xr0.E();
                                } else {
                                    jE = j;
                                }
                                if ((i3 & 16) != 0) {
                                    rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                                    i4 &= -57345;
                                } else {
                                    rb3VarRememberScrollState = rb3Var;
                                }
                                if (i9 != 0) {
                                    ux2Var2 = a;
                                }
                                if ((i3 & 64) != 0) {
                                    shape = ic2.a.getShape(kk0Var, 6);
                                    i4 &= -3670017;
                                }
                                if ((i3 & Uuid.SIZE_BITS) != 0) {
                                    containerColor = ic2.a.getContainerColor(kk0Var, 6);
                                    i4 &= -29360129;
                                } else {
                                    containerColor = j3;
                                }
                                if (i11 != 0) {
                                    ic2 ic2Var17 = ic2.a;
                                    f4 = 0.0f;
                                } else {
                                    f4 = f3;
                                }
                                if (i13 != 0) {
                                    ic2 ic2Var18 = ic2.a;
                                    f5 = 3.0f;
                                } else {
                                    f5 = f2;
                                }
                                if (i15 != 0) {
                                    iwVar2 = null;
                                } else {
                                    iwVar2 = iwVar;
                                }
                                rb3Var2 = rb3VarRememberScrollState;
                            }
                            kk0Var.s();
                            objP = kk0Var.P();
                            if (objP == Composer$Companion.getEmpty()) {
                                objP = new ni2(Boolean.FALSE);
                                kk0Var.l0(objP);
                            }
                            ni2Var = (ni2) objP;
                            ni2Var.c.setValue(Boolean.valueOf(z));
                            if (((Boolean) ni2Var.b.getValue()).booleanValue()) {
                                objP2 = kk0Var.P();
                                if (objP2 == Composer$Companion.getEmpty()) {
                                    objP2 = cl3.d(new e54(e54.b));
                                    kk0Var.l0(objP2);
                                }
                                mi2Var = (mi2) objP2;
                                wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                                if ((i4 & 7168) == 2048) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                zH = z2 | kk0Var.h(wu0Var);
                                objP3 = kk0Var.P();
                                if (zH) {
                                    z3 = true;
                                    objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                                    kk0Var.l0(objP3);
                                } else {
                                    z3 = true;
                                    objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                                    kk0Var.l0(objP3);
                                }
                                yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                            } else {
                                objP2 = kk0Var.P();
                                if (objP2 == Composer$Companion.getEmpty()) {
                                    objP2 = cl3.d(new e54(e54.b));
                                    kk0Var.l0(objP2);
                                }
                                mi2Var = (mi2) objP2;
                                wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                                if ((i4 & 7168) == 2048) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                zH = z2 | kk0Var.h(wu0Var);
                                objP3 = kk0Var.P();
                                if (zH) {
                                    z3 = true;
                                    objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                                    kk0Var.l0(objP3);
                                } else {
                                    z3 = true;
                                    objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                                    kk0Var.l0(objP3);
                                }
                                yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                            }
                            ux2Var3 = ux2Var2;
                            j4 = jE;
                            cVar4 = cVar3;
                            rb3Var3 = rb3Var2;
                            rg3Var2 = shape;
                            j5 = containerColor;
                            f6 = f4;
                            f7 = f5;
                            iwVar3 = iwVar2;
                        }
                        w33VarV = kk0Var.v();
                        if (w33VarV != null) {
                            w33VarV.updateScope(new vb(z, je1Var, cVar4, j4, rb3Var3, ux2Var3, rg3Var2, j5, f6, f7, iwVar3, oe1Var, i, i2, i3));
                        }
                    }
                    i16 |= 48;
                    if ((i4 & 306783379) != 306783378) {
                        kk0Var.X();
                        if ((i & 1) != 0) {
                            if (i5 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i7 != 0) {
                                jE = xr0.E();
                            } else {
                                jE = j;
                            }
                            if ((i3 & 16) != 0) {
                                rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                                i4 &= -57345;
                            } else {
                                rb3VarRememberScrollState = rb3Var;
                            }
                            if (i9 != 0) {
                                ux2Var2 = a;
                            }
                            if ((i3 & 64) != 0) {
                                shape = ic2.a.getShape(kk0Var, 6);
                                i4 &= -3670017;
                            }
                            if ((i3 & Uuid.SIZE_BITS) != 0) {
                                containerColor = ic2.a.getContainerColor(kk0Var, 6);
                                i4 &= -29360129;
                            } else {
                                containerColor = j3;
                            }
                            if (i11 != 0) {
                                ic2 ic2Var19 = ic2.a;
                                f4 = 0.0f;
                            } else {
                                f4 = f3;
                            }
                            if (i13 != 0) {
                                ic2 ic2Var110 = ic2.a;
                                f5 = 3.0f;
                            } else {
                                f5 = f2;
                            }
                            if (i15 != 0) {
                                iwVar2 = null;
                            } else {
                                iwVar2 = iwVar;
                            }
                            rb3Var2 = rb3VarRememberScrollState;
                        } else {
                            if (i5 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i7 != 0) {
                                jE = xr0.E();
                            } else {
                                jE = j;
                            }
                            if ((i3 & 16) != 0) {
                                rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                                i4 &= -57345;
                            } else {
                                rb3VarRememberScrollState = rb3Var;
                            }
                            if (i9 != 0) {
                                ux2Var2 = a;
                            }
                            if ((i3 & 64) != 0) {
                                shape = ic2.a.getShape(kk0Var, 6);
                                i4 &= -3670017;
                            }
                            if ((i3 & Uuid.SIZE_BITS) != 0) {
                                containerColor = ic2.a.getContainerColor(kk0Var, 6);
                                i4 &= -29360129;
                            } else {
                                containerColor = j3;
                            }
                            if (i11 != 0) {
                                ic2 ic2Var111 = ic2.a;
                                f4 = 0.0f;
                            } else {
                                f4 = f3;
                            }
                            if (i13 != 0) {
                                ic2 ic2Var112 = ic2.a;
                                f5 = 3.0f;
                            } else {
                                f5 = f2;
                            }
                            if (i15 != 0) {
                                iwVar2 = null;
                            } else {
                                iwVar2 = iwVar;
                            }
                            rb3Var2 = rb3VarRememberScrollState;
                        }
                        kk0Var.s();
                        objP = kk0Var.P();
                        if (objP == Composer$Companion.getEmpty()) {
                            objP = new ni2(Boolean.FALSE);
                            kk0Var.l0(objP);
                        }
                        ni2Var = (ni2) objP;
                        ni2Var.c.setValue(Boolean.valueOf(z));
                        if (((Boolean) ni2Var.b.getValue()).booleanValue()) {
                            objP2 = kk0Var.P();
                            if (objP2 == Composer$Companion.getEmpty()) {
                                objP2 = cl3.d(new e54(e54.b));
                                kk0Var.l0(objP2);
                            }
                            mi2Var = (mi2) objP2;
                            wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                            if ((i4 & 7168) == 2048) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            zH = z2 | kk0Var.h(wu0Var);
                            objP3 = kk0Var.P();
                            if (zH) {
                                z3 = true;
                                objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                                kk0Var.l0(objP3);
                            } else {
                                z3 = true;
                                objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                                kk0Var.l0(objP3);
                            }
                            yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                        } else {
                            objP2 = kk0Var.P();
                            if (objP2 == Composer$Companion.getEmpty()) {
                                objP2 = cl3.d(new e54(e54.b));
                                kk0Var.l0(objP2);
                            }
                            mi2Var = (mi2) objP2;
                            wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                            if ((i4 & 7168) == 2048) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            zH = z2 | kk0Var.h(wu0Var);
                            objP3 = kk0Var.P();
                            if (zH) {
                                z3 = true;
                                objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                                kk0Var.l0(objP3);
                            } else {
                                z3 = true;
                                objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                                kk0Var.l0(objP3);
                            }
                            yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                        }
                        ux2Var3 = ux2Var2;
                        j4 = jE;
                        cVar4 = cVar3;
                        rb3Var3 = rb3Var2;
                        rg3Var2 = shape;
                        j5 = containerColor;
                        f6 = f4;
                        f7 = f5;
                        iwVar3 = iwVar2;
                    } else {
                        kk0Var.X();
                        if ((i & 1) != 0) {
                            if (i5 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i7 != 0) {
                                jE = xr0.E();
                            } else {
                                jE = j;
                            }
                            if ((i3 & 16) != 0) {
                                rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                                i4 &= -57345;
                            } else {
                                rb3VarRememberScrollState = rb3Var;
                            }
                            if (i9 != 0) {
                                ux2Var2 = a;
                            }
                            if ((i3 & 64) != 0) {
                                shape = ic2.a.getShape(kk0Var, 6);
                                i4 &= -3670017;
                            }
                            if ((i3 & Uuid.SIZE_BITS) != 0) {
                                containerColor = ic2.a.getContainerColor(kk0Var, 6);
                                i4 &= -29360129;
                            } else {
                                containerColor = j3;
                            }
                            if (i11 != 0) {
                                ic2 ic2Var113 = ic2.a;
                                f4 = 0.0f;
                            } else {
                                f4 = f3;
                            }
                            if (i13 != 0) {
                                ic2 ic2Var114 = ic2.a;
                                f5 = 3.0f;
                            } else {
                                f5 = f2;
                            }
                            if (i15 != 0) {
                                iwVar2 = null;
                            } else {
                                iwVar2 = iwVar;
                            }
                            rb3Var2 = rb3VarRememberScrollState;
                        } else {
                            if (i5 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i7 != 0) {
                                jE = xr0.E();
                            } else {
                                jE = j;
                            }
                            if ((i3 & 16) != 0) {
                                rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                                i4 &= -57345;
                            } else {
                                rb3VarRememberScrollState = rb3Var;
                            }
                            if (i9 != 0) {
                                ux2Var2 = a;
                            }
                            if ((i3 & 64) != 0) {
                                shape = ic2.a.getShape(kk0Var, 6);
                                i4 &= -3670017;
                            }
                            if ((i3 & Uuid.SIZE_BITS) != 0) {
                                containerColor = ic2.a.getContainerColor(kk0Var, 6);
                                i4 &= -29360129;
                            } else {
                                containerColor = j3;
                            }
                            if (i11 != 0) {
                                ic2 ic2Var115 = ic2.a;
                                f4 = 0.0f;
                            } else {
                                f4 = f3;
                            }
                            if (i13 != 0) {
                                ic2 ic2Var116 = ic2.a;
                                f5 = 3.0f;
                            } else {
                                f5 = f2;
                            }
                            if (i15 != 0) {
                                iwVar2 = null;
                            } else {
                                iwVar2 = iwVar;
                            }
                            rb3Var2 = rb3VarRememberScrollState;
                        }
                        kk0Var.s();
                        objP = kk0Var.P();
                        if (objP == Composer$Companion.getEmpty()) {
                            objP = new ni2(Boolean.FALSE);
                            kk0Var.l0(objP);
                        }
                        ni2Var = (ni2) objP;
                        ni2Var.c.setValue(Boolean.valueOf(z));
                        if (((Boolean) ni2Var.b.getValue()).booleanValue()) {
                            objP2 = kk0Var.P();
                            if (objP2 == Composer$Companion.getEmpty()) {
                                objP2 = cl3.d(new e54(e54.b));
                                kk0Var.l0(objP2);
                            }
                            mi2Var = (mi2) objP2;
                            wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                            if ((i4 & 7168) == 2048) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            zH = z2 | kk0Var.h(wu0Var);
                            objP3 = kk0Var.P();
                            if (zH) {
                                z3 = true;
                                objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                                kk0Var.l0(objP3);
                            } else {
                                z3 = true;
                                objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                                kk0Var.l0(objP3);
                            }
                            yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                        } else {
                            objP2 = kk0Var.P();
                            if (objP2 == Composer$Companion.getEmpty()) {
                                objP2 = cl3.d(new e54(e54.b));
                                kk0Var.l0(objP2);
                            }
                            mi2Var = (mi2) objP2;
                            wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                            if ((i4 & 7168) == 2048) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            zH = z2 | kk0Var.h(wu0Var);
                            objP3 = kk0Var.P();
                            if (zH) {
                                z3 = true;
                                objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                                kk0Var.l0(objP3);
                            } else {
                                z3 = true;
                                objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                                kk0Var.l0(objP3);
                            }
                            yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                        }
                        ux2Var3 = ux2Var2;
                        j4 = jE;
                        cVar4 = cVar3;
                        rb3Var3 = rb3Var2;
                        rg3Var2 = shape;
                        j5 = containerColor;
                        f6 = f4;
                        f7 = f5;
                        iwVar3 = iwVar2;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new vb(z, je1Var, cVar4, j4, rb3Var3, ux2Var3, rg3Var2, j5, f6, f7, iwVar3, oe1Var, i, i2, i3));
                    }
                }
                i4 |= 3072;
                if ((i & 24576) != 0) {
                    i4 |= ((i3 & 16) == 0 || !kk0Var.h(rb3Var)) ? ConstantsKt.DEFAULT_BUFFER_SIZE : 16384;
                }
                i9 = i3 & 32;
                if (i9 != 0) {
                    i4 |= 196608;
                    ux2Var2 = ux2Var;
                } else {
                    ux2Var2 = ux2Var;
                    if ((i & 196608) == 0) {
                        if (kk0Var.h(ux2Var2)) {
                            i10 = 131072;
                        } else {
                            i10 = 65536;
                        }
                        i4 |= i10;
                    }
                }
                if ((i & 1572864) == 0) {
                    shape = rg3Var;
                    if ((i3 & 64) == 0) {
                        i20 = 524288;
                    } else {
                        i20 = 524288;
                    }
                    i4 |= i20;
                } else {
                    shape = rg3Var;
                }
                if ((i & 12582912) == 0) {
                    j3 = j2;
                    if ((i3 & Uuid.SIZE_BITS) == 0) {
                        i19 = 4194304;
                    } else {
                        i19 = 4194304;
                    }
                    i4 |= i19;
                } else {
                    j3 = j2;
                }
                i11 = i3 & FontInfo.NUMBER_OF_CHAR_CODES;
                if (i11 != 0) {
                    i4 |= 100663296;
                    f3 = f;
                } else {
                    f3 = f;
                    if ((i & 100663296) == 0) {
                        if (kk0Var.e(f3)) {
                            i12 = 67108864;
                        } else {
                            i12 = 33554432;
                        }
                        i4 |= i12;
                    }
                }
                i13 = i3 & ConstantsKt.MINIMUM_BLOCK_SIZE;
                if (i13 != 0) {
                    if ((i & 805306368) == 0) {
                        if (kk0Var.e(f2)) {
                            i14 = 536870912;
                        } else {
                            i14 = 268435456;
                        }
                        i4 |= i14;
                    }
                    i15 = i3 & 1024;
                    if (i15 != 0) {
                        i16 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        if (kk0Var.h(iwVar)) {
                            i17 = 4;
                        } else {
                            i17 = 2;
                        }
                        i16 = i2 | i17;
                    } else {
                        i16 = i2;
                    }
                    if ((i3 & 2048) != 0) {
                        if ((i2 & 48) == 0) {
                            if (kk0Var.j(oe1Var)) {
                                i18 = 32;
                            } else {
                                i18 = 16;
                            }
                            i16 |= i18;
                        }
                        if ((i4 & 306783379) != 306783378) {
                            kk0Var.X();
                            if ((i & 1) != 0) {
                                if (i5 != 0) {
                                    cVar3 = c.i;
                                } else {
                                    cVar3 = cVar2;
                                }
                                if (i7 != 0) {
                                    jE = xr0.E();
                                } else {
                                    jE = j;
                                }
                                if ((i3 & 16) != 0) {
                                    rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                                    i4 &= -57345;
                                } else {
                                    rb3VarRememberScrollState = rb3Var;
                                }
                                if (i9 != 0) {
                                    ux2Var2 = a;
                                }
                                if ((i3 & 64) != 0) {
                                    shape = ic2.a.getShape(kk0Var, 6);
                                    i4 &= -3670017;
                                }
                                if ((i3 & Uuid.SIZE_BITS) != 0) {
                                    containerColor = ic2.a.getContainerColor(kk0Var, 6);
                                    i4 &= -29360129;
                                } else {
                                    containerColor = j3;
                                }
                                if (i11 != 0) {
                                    ic2 ic2Var117 = ic2.a;
                                    f4 = 0.0f;
                                } else {
                                    f4 = f3;
                                }
                                if (i13 != 0) {
                                    ic2 ic2Var118 = ic2.a;
                                    f5 = 3.0f;
                                } else {
                                    f5 = f2;
                                }
                                if (i15 != 0) {
                                    iwVar2 = null;
                                } else {
                                    iwVar2 = iwVar;
                                }
                                rb3Var2 = rb3VarRememberScrollState;
                            } else {
                                if (i5 != 0) {
                                    cVar3 = c.i;
                                } else {
                                    cVar3 = cVar2;
                                }
                                if (i7 != 0) {
                                    jE = xr0.E();
                                } else {
                                    jE = j;
                                }
                                if ((i3 & 16) != 0) {
                                    rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                                    i4 &= -57345;
                                } else {
                                    rb3VarRememberScrollState = rb3Var;
                                }
                                if (i9 != 0) {
                                    ux2Var2 = a;
                                }
                                if ((i3 & 64) != 0) {
                                    shape = ic2.a.getShape(kk0Var, 6);
                                    i4 &= -3670017;
                                }
                                if ((i3 & Uuid.SIZE_BITS) != 0) {
                                    containerColor = ic2.a.getContainerColor(kk0Var, 6);
                                    i4 &= -29360129;
                                } else {
                                    containerColor = j3;
                                }
                                if (i11 != 0) {
                                    ic2 ic2Var119 = ic2.a;
                                    f4 = 0.0f;
                                } else {
                                    f4 = f3;
                                }
                                if (i13 != 0) {
                                    ic2 ic2Var1110 = ic2.a;
                                    f5 = 3.0f;
                                } else {
                                    f5 = f2;
                                }
                                if (i15 != 0) {
                                    iwVar2 = null;
                                } else {
                                    iwVar2 = iwVar;
                                }
                                rb3Var2 = rb3VarRememberScrollState;
                            }
                            kk0Var.s();
                            objP = kk0Var.P();
                            if (objP == Composer$Companion.getEmpty()) {
                                objP = new ni2(Boolean.FALSE);
                                kk0Var.l0(objP);
                            }
                            ni2Var = (ni2) objP;
                            ni2Var.c.setValue(Boolean.valueOf(z));
                            if (((Boolean) ni2Var.b.getValue()).booleanValue()) {
                                objP2 = kk0Var.P();
                                if (objP2 == Composer$Companion.getEmpty()) {
                                    objP2 = cl3.d(new e54(e54.b));
                                    kk0Var.l0(objP2);
                                }
                                mi2Var = (mi2) objP2;
                                wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                                if ((i4 & 7168) == 2048) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                zH = z2 | kk0Var.h(wu0Var);
                                objP3 = kk0Var.P();
                                if (zH) {
                                    z3 = true;
                                    objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                                    kk0Var.l0(objP3);
                                } else {
                                    z3 = true;
                                    objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                                    kk0Var.l0(objP3);
                                }
                                yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                            } else {
                                objP2 = kk0Var.P();
                                if (objP2 == Composer$Companion.getEmpty()) {
                                    objP2 = cl3.d(new e54(e54.b));
                                    kk0Var.l0(objP2);
                                }
                                mi2Var = (mi2) objP2;
                                wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                                if ((i4 & 7168) == 2048) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                zH = z2 | kk0Var.h(wu0Var);
                                objP3 = kk0Var.P();
                                if (zH) {
                                    z3 = true;
                                    objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                                    kk0Var.l0(objP3);
                                } else {
                                    z3 = true;
                                    objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                                    kk0Var.l0(objP3);
                                }
                                yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                            }
                            ux2Var3 = ux2Var2;
                            j4 = jE;
                            cVar4 = cVar3;
                            rb3Var3 = rb3Var2;
                            rg3Var2 = shape;
                            j5 = containerColor;
                            f6 = f4;
                            f7 = f5;
                            iwVar3 = iwVar2;
                        } else {
                            kk0Var.X();
                            if ((i & 1) != 0) {
                                if (i5 != 0) {
                                    cVar3 = c.i;
                                } else {
                                    cVar3 = cVar2;
                                }
                                if (i7 != 0) {
                                    jE = xr0.E();
                                } else {
                                    jE = j;
                                }
                                if ((i3 & 16) != 0) {
                                    rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                                    i4 &= -57345;
                                } else {
                                    rb3VarRememberScrollState = rb3Var;
                                }
                                if (i9 != 0) {
                                    ux2Var2 = a;
                                }
                                if ((i3 & 64) != 0) {
                                    shape = ic2.a.getShape(kk0Var, 6);
                                    i4 &= -3670017;
                                }
                                if ((i3 & Uuid.SIZE_BITS) != 0) {
                                    containerColor = ic2.a.getContainerColor(kk0Var, 6);
                                    i4 &= -29360129;
                                } else {
                                    containerColor = j3;
                                }
                                if (i11 != 0) {
                                    ic2 ic2Var1111 = ic2.a;
                                    f4 = 0.0f;
                                } else {
                                    f4 = f3;
                                }
                                if (i13 != 0) {
                                    ic2 ic2Var1112 = ic2.a;
                                    f5 = 3.0f;
                                } else {
                                    f5 = f2;
                                }
                                if (i15 != 0) {
                                    iwVar2 = null;
                                } else {
                                    iwVar2 = iwVar;
                                }
                                rb3Var2 = rb3VarRememberScrollState;
                            } else {
                                if (i5 != 0) {
                                    cVar3 = c.i;
                                } else {
                                    cVar3 = cVar2;
                                }
                                if (i7 != 0) {
                                    jE = xr0.E();
                                } else {
                                    jE = j;
                                }
                                if ((i3 & 16) != 0) {
                                    rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                                    i4 &= -57345;
                                } else {
                                    rb3VarRememberScrollState = rb3Var;
                                }
                                if (i9 != 0) {
                                    ux2Var2 = a;
                                }
                                if ((i3 & 64) != 0) {
                                    shape = ic2.a.getShape(kk0Var, 6);
                                    i4 &= -3670017;
                                }
                                if ((i3 & Uuid.SIZE_BITS) != 0) {
                                    containerColor = ic2.a.getContainerColor(kk0Var, 6);
                                    i4 &= -29360129;
                                } else {
                                    containerColor = j3;
                                }
                                if (i11 != 0) {
                                    ic2 ic2Var1113 = ic2.a;
                                    f4 = 0.0f;
                                } else {
                                    f4 = f3;
                                }
                                if (i13 != 0) {
                                    ic2 ic2Var1114 = ic2.a;
                                    f5 = 3.0f;
                                } else {
                                    f5 = f2;
                                }
                                if (i15 != 0) {
                                    iwVar2 = null;
                                } else {
                                    iwVar2 = iwVar;
                                }
                                rb3Var2 = rb3VarRememberScrollState;
                            }
                            kk0Var.s();
                            objP = kk0Var.P();
                            if (objP == Composer$Companion.getEmpty()) {
                                objP = new ni2(Boolean.FALSE);
                                kk0Var.l0(objP);
                            }
                            ni2Var = (ni2) objP;
                            ni2Var.c.setValue(Boolean.valueOf(z));
                            if (((Boolean) ni2Var.b.getValue()).booleanValue()) {
                                objP2 = kk0Var.P();
                                if (objP2 == Composer$Companion.getEmpty()) {
                                    objP2 = cl3.d(new e54(e54.b));
                                    kk0Var.l0(objP2);
                                }
                                mi2Var = (mi2) objP2;
                                wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                                if ((i4 & 7168) == 2048) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                zH = z2 | kk0Var.h(wu0Var);
                                objP3 = kk0Var.P();
                                if (zH) {
                                    z3 = true;
                                    objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                                    kk0Var.l0(objP3);
                                } else {
                                    z3 = true;
                                    objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                                    kk0Var.l0(objP3);
                                }
                                yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                            } else {
                                objP2 = kk0Var.P();
                                if (objP2 == Composer$Companion.getEmpty()) {
                                    objP2 = cl3.d(new e54(e54.b));
                                    kk0Var.l0(objP2);
                                }
                                mi2Var = (mi2) objP2;
                                wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                                if ((i4 & 7168) == 2048) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                zH = z2 | kk0Var.h(wu0Var);
                                objP3 = kk0Var.P();
                                if (zH) {
                                    z3 = true;
                                    objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                                    kk0Var.l0(objP3);
                                } else {
                                    z3 = true;
                                    objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                                    kk0Var.l0(objP3);
                                }
                                yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                            }
                            ux2Var3 = ux2Var2;
                            j4 = jE;
                            cVar4 = cVar3;
                            rb3Var3 = rb3Var2;
                            rg3Var2 = shape;
                            j5 = containerColor;
                            f6 = f4;
                            f7 = f5;
                            iwVar3 = iwVar2;
                        }
                        w33VarV = kk0Var.v();
                        if (w33VarV != null) {
                            w33VarV.updateScope(new vb(z, je1Var, cVar4, j4, rb3Var3, ux2Var3, rg3Var2, j5, f6, f7, iwVar3, oe1Var, i, i2, i3));
                        }
                    }
                    i16 |= 48;
                    if ((i4 & 306783379) != 306783378) {
                        kk0Var.X();
                        if ((i & 1) != 0) {
                            if (i5 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i7 != 0) {
                                jE = xr0.E();
                            } else {
                                jE = j;
                            }
                            if ((i3 & 16) != 0) {
                                rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                                i4 &= -57345;
                            } else {
                                rb3VarRememberScrollState = rb3Var;
                            }
                            if (i9 != 0) {
                                ux2Var2 = a;
                            }
                            if ((i3 & 64) != 0) {
                                shape = ic2.a.getShape(kk0Var, 6);
                                i4 &= -3670017;
                            }
                            if ((i3 & Uuid.SIZE_BITS) != 0) {
                                containerColor = ic2.a.getContainerColor(kk0Var, 6);
                                i4 &= -29360129;
                            } else {
                                containerColor = j3;
                            }
                            if (i11 != 0) {
                                ic2 ic2Var1115 = ic2.a;
                                f4 = 0.0f;
                            } else {
                                f4 = f3;
                            }
                            if (i13 != 0) {
                                ic2 ic2Var1116 = ic2.a;
                                f5 = 3.0f;
                            } else {
                                f5 = f2;
                            }
                            if (i15 != 0) {
                                iwVar2 = null;
                            } else {
                                iwVar2 = iwVar;
                            }
                            rb3Var2 = rb3VarRememberScrollState;
                        } else {
                            if (i5 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i7 != 0) {
                                jE = xr0.E();
                            } else {
                                jE = j;
                            }
                            if ((i3 & 16) != 0) {
                                rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                                i4 &= -57345;
                            } else {
                                rb3VarRememberScrollState = rb3Var;
                            }
                            if (i9 != 0) {
                                ux2Var2 = a;
                            }
                            if ((i3 & 64) != 0) {
                                shape = ic2.a.getShape(kk0Var, 6);
                                i4 &= -3670017;
                            }
                            if ((i3 & Uuid.SIZE_BITS) != 0) {
                                containerColor = ic2.a.getContainerColor(kk0Var, 6);
                                i4 &= -29360129;
                            } else {
                                containerColor = j3;
                            }
                            if (i11 != 0) {
                                ic2 ic2Var1117 = ic2.a;
                                f4 = 0.0f;
                            } else {
                                f4 = f3;
                            }
                            if (i13 != 0) {
                                ic2 ic2Var1118 = ic2.a;
                                f5 = 3.0f;
                            } else {
                                f5 = f2;
                            }
                            if (i15 != 0) {
                                iwVar2 = null;
                            } else {
                                iwVar2 = iwVar;
                            }
                            rb3Var2 = rb3VarRememberScrollState;
                        }
                        kk0Var.s();
                        objP = kk0Var.P();
                        if (objP == Composer$Companion.getEmpty()) {
                            objP = new ni2(Boolean.FALSE);
                            kk0Var.l0(objP);
                        }
                        ni2Var = (ni2) objP;
                        ni2Var.c.setValue(Boolean.valueOf(z));
                        if (((Boolean) ni2Var.b.getValue()).booleanValue()) {
                            objP2 = kk0Var.P();
                            if (objP2 == Composer$Companion.getEmpty()) {
                                objP2 = cl3.d(new e54(e54.b));
                                kk0Var.l0(objP2);
                            }
                            mi2Var = (mi2) objP2;
                            wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                            if ((i4 & 7168) == 2048) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            zH = z2 | kk0Var.h(wu0Var);
                            objP3 = kk0Var.P();
                            if (zH) {
                                z3 = true;
                                objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                                kk0Var.l0(objP3);
                            } else {
                                z3 = true;
                                objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                                kk0Var.l0(objP3);
                            }
                            yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                        } else {
                            objP2 = kk0Var.P();
                            if (objP2 == Composer$Companion.getEmpty()) {
                                objP2 = cl3.d(new e54(e54.b));
                                kk0Var.l0(objP2);
                            }
                            mi2Var = (mi2) objP2;
                            wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                            if ((i4 & 7168) == 2048) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            zH = z2 | kk0Var.h(wu0Var);
                            objP3 = kk0Var.P();
                            if (zH) {
                                z3 = true;
                                objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                                kk0Var.l0(objP3);
                            } else {
                                z3 = true;
                                objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                                kk0Var.l0(objP3);
                            }
                            yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                        }
                        ux2Var3 = ux2Var2;
                        j4 = jE;
                        cVar4 = cVar3;
                        rb3Var3 = rb3Var2;
                        rg3Var2 = shape;
                        j5 = containerColor;
                        f6 = f4;
                        f7 = f5;
                        iwVar3 = iwVar2;
                    } else {
                        kk0Var.X();
                        if ((i & 1) != 0) {
                            if (i5 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i7 != 0) {
                                jE = xr0.E();
                            } else {
                                jE = j;
                            }
                            if ((i3 & 16) != 0) {
                                rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                                i4 &= -57345;
                            } else {
                                rb3VarRememberScrollState = rb3Var;
                            }
                            if (i9 != 0) {
                                ux2Var2 = a;
                            }
                            if ((i3 & 64) != 0) {
                                shape = ic2.a.getShape(kk0Var, 6);
                                i4 &= -3670017;
                            }
                            if ((i3 & Uuid.SIZE_BITS) != 0) {
                                containerColor = ic2.a.getContainerColor(kk0Var, 6);
                                i4 &= -29360129;
                            } else {
                                containerColor = j3;
                            }
                            if (i11 != 0) {
                                ic2 ic2Var1119 = ic2.a;
                                f4 = 0.0f;
                            } else {
                                f4 = f3;
                            }
                            if (i13 != 0) {
                                ic2 ic2Var11110 = ic2.a;
                                f5 = 3.0f;
                            } else {
                                f5 = f2;
                            }
                            if (i15 != 0) {
                                iwVar2 = null;
                            } else {
                                iwVar2 = iwVar;
                            }
                            rb3Var2 = rb3VarRememberScrollState;
                        } else {
                            if (i5 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i7 != 0) {
                                jE = xr0.E();
                            } else {
                                jE = j;
                            }
                            if ((i3 & 16) != 0) {
                                rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                                i4 &= -57345;
                            } else {
                                rb3VarRememberScrollState = rb3Var;
                            }
                            if (i9 != 0) {
                                ux2Var2 = a;
                            }
                            if ((i3 & 64) != 0) {
                                shape = ic2.a.getShape(kk0Var, 6);
                                i4 &= -3670017;
                            }
                            if ((i3 & Uuid.SIZE_BITS) != 0) {
                                containerColor = ic2.a.getContainerColor(kk0Var, 6);
                                i4 &= -29360129;
                            } else {
                                containerColor = j3;
                            }
                            if (i11 != 0) {
                                ic2 ic2Var11111 = ic2.a;
                                f4 = 0.0f;
                            } else {
                                f4 = f3;
                            }
                            if (i13 != 0) {
                                ic2 ic2Var11112 = ic2.a;
                                f5 = 3.0f;
                            } else {
                                f5 = f2;
                            }
                            if (i15 != 0) {
                                iwVar2 = null;
                            } else {
                                iwVar2 = iwVar;
                            }
                            rb3Var2 = rb3VarRememberScrollState;
                        }
                        kk0Var.s();
                        objP = kk0Var.P();
                        if (objP == Composer$Companion.getEmpty()) {
                            objP = new ni2(Boolean.FALSE);
                            kk0Var.l0(objP);
                        }
                        ni2Var = (ni2) objP;
                        ni2Var.c.setValue(Boolean.valueOf(z));
                        if (((Boolean) ni2Var.b.getValue()).booleanValue()) {
                            objP2 = kk0Var.P();
                            if (objP2 == Composer$Companion.getEmpty()) {
                                objP2 = cl3.d(new e54(e54.b));
                                kk0Var.l0(objP2);
                            }
                            mi2Var = (mi2) objP2;
                            wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                            if ((i4 & 7168) == 2048) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            zH = z2 | kk0Var.h(wu0Var);
                            objP3 = kk0Var.P();
                            if (zH) {
                                z3 = true;
                                objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                                kk0Var.l0(objP3);
                            } else {
                                z3 = true;
                                objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                                kk0Var.l0(objP3);
                            }
                            yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                        } else {
                            objP2 = kk0Var.P();
                            if (objP2 == Composer$Companion.getEmpty()) {
                                objP2 = cl3.d(new e54(e54.b));
                                kk0Var.l0(objP2);
                            }
                            mi2Var = (mi2) objP2;
                            wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                            if ((i4 & 7168) == 2048) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            zH = z2 | kk0Var.h(wu0Var);
                            objP3 = kk0Var.P();
                            if (zH) {
                                z3 = true;
                                objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                                kk0Var.l0(objP3);
                            } else {
                                z3 = true;
                                objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                                kk0Var.l0(objP3);
                            }
                            yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                        }
                        ux2Var3 = ux2Var2;
                        j4 = jE;
                        cVar4 = cVar3;
                        rb3Var3 = rb3Var2;
                        rg3Var2 = shape;
                        j5 = containerColor;
                        f6 = f4;
                        f7 = f5;
                        iwVar3 = iwVar2;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new vb(z, je1Var, cVar4, j4, rb3Var3, ux2Var3, rg3Var2, j5, f6, f7, iwVar3, oe1Var, i, i2, i3));
                    }
                }
                i4 |= 805306368;
                i15 = i3 & 1024;
                if (i15 != 0) {
                    i16 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    if (kk0Var.h(iwVar)) {
                        i17 = 4;
                    } else {
                        i17 = 2;
                    }
                    i16 = i2 | i17;
                } else {
                    i16 = i2;
                }
                if ((i3 & 2048) != 0) {
                    if ((i2 & 48) == 0) {
                        if (kk0Var.j(oe1Var)) {
                            i18 = 32;
                        } else {
                            i18 = 16;
                        }
                        i16 |= i18;
                    }
                    if ((i4 & 306783379) != 306783378) {
                        kk0Var.X();
                        if ((i & 1) != 0) {
                            if (i5 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i7 != 0) {
                                jE = xr0.E();
                            } else {
                                jE = j;
                            }
                            if ((i3 & 16) != 0) {
                                rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                                i4 &= -57345;
                            } else {
                                rb3VarRememberScrollState = rb3Var;
                            }
                            if (i9 != 0) {
                                ux2Var2 = a;
                            }
                            if ((i3 & 64) != 0) {
                                shape = ic2.a.getShape(kk0Var, 6);
                                i4 &= -3670017;
                            }
                            if ((i3 & Uuid.SIZE_BITS) != 0) {
                                containerColor = ic2.a.getContainerColor(kk0Var, 6);
                                i4 &= -29360129;
                            } else {
                                containerColor = j3;
                            }
                            if (i11 != 0) {
                                ic2 ic2Var11113 = ic2.a;
                                f4 = 0.0f;
                            } else {
                                f4 = f3;
                            }
                            if (i13 != 0) {
                                ic2 ic2Var11114 = ic2.a;
                                f5 = 3.0f;
                            } else {
                                f5 = f2;
                            }
                            if (i15 != 0) {
                                iwVar2 = null;
                            } else {
                                iwVar2 = iwVar;
                            }
                            rb3Var2 = rb3VarRememberScrollState;
                        } else {
                            if (i5 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i7 != 0) {
                                jE = xr0.E();
                            } else {
                                jE = j;
                            }
                            if ((i3 & 16) != 0) {
                                rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                                i4 &= -57345;
                            } else {
                                rb3VarRememberScrollState = rb3Var;
                            }
                            if (i9 != 0) {
                                ux2Var2 = a;
                            }
                            if ((i3 & 64) != 0) {
                                shape = ic2.a.getShape(kk0Var, 6);
                                i4 &= -3670017;
                            }
                            if ((i3 & Uuid.SIZE_BITS) != 0) {
                                containerColor = ic2.a.getContainerColor(kk0Var, 6);
                                i4 &= -29360129;
                            } else {
                                containerColor = j3;
                            }
                            if (i11 != 0) {
                                ic2 ic2Var11115 = ic2.a;
                                f4 = 0.0f;
                            } else {
                                f4 = f3;
                            }
                            if (i13 != 0) {
                                ic2 ic2Var11116 = ic2.a;
                                f5 = 3.0f;
                            } else {
                                f5 = f2;
                            }
                            if (i15 != 0) {
                                iwVar2 = null;
                            } else {
                                iwVar2 = iwVar;
                            }
                            rb3Var2 = rb3VarRememberScrollState;
                        }
                        kk0Var.s();
                        objP = kk0Var.P();
                        if (objP == Composer$Companion.getEmpty()) {
                            objP = new ni2(Boolean.FALSE);
                            kk0Var.l0(objP);
                        }
                        ni2Var = (ni2) objP;
                        ni2Var.c.setValue(Boolean.valueOf(z));
                        if (((Boolean) ni2Var.b.getValue()).booleanValue()) {
                            objP2 = kk0Var.P();
                            if (objP2 == Composer$Companion.getEmpty()) {
                                objP2 = cl3.d(new e54(e54.b));
                                kk0Var.l0(objP2);
                            }
                            mi2Var = (mi2) objP2;
                            wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                            if ((i4 & 7168) == 2048) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            zH = z2 | kk0Var.h(wu0Var);
                            objP3 = kk0Var.P();
                            if (zH) {
                                z3 = true;
                                objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                                kk0Var.l0(objP3);
                            } else {
                                z3 = true;
                                objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                                kk0Var.l0(objP3);
                            }
                            yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                        } else {
                            objP2 = kk0Var.P();
                            if (objP2 == Composer$Companion.getEmpty()) {
                                objP2 = cl3.d(new e54(e54.b));
                                kk0Var.l0(objP2);
                            }
                            mi2Var = (mi2) objP2;
                            wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                            if ((i4 & 7168) == 2048) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            zH = z2 | kk0Var.h(wu0Var);
                            objP3 = kk0Var.P();
                            if (zH) {
                                z3 = true;
                                objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                                kk0Var.l0(objP3);
                            } else {
                                z3 = true;
                                objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                                kk0Var.l0(objP3);
                            }
                            yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                        }
                        ux2Var3 = ux2Var2;
                        j4 = jE;
                        cVar4 = cVar3;
                        rb3Var3 = rb3Var2;
                        rg3Var2 = shape;
                        j5 = containerColor;
                        f6 = f4;
                        f7 = f5;
                        iwVar3 = iwVar2;
                    } else {
                        kk0Var.X();
                        if ((i & 1) != 0) {
                            if (i5 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i7 != 0) {
                                jE = xr0.E();
                            } else {
                                jE = j;
                            }
                            if ((i3 & 16) != 0) {
                                rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                                i4 &= -57345;
                            } else {
                                rb3VarRememberScrollState = rb3Var;
                            }
                            if (i9 != 0) {
                                ux2Var2 = a;
                            }
                            if ((i3 & 64) != 0) {
                                shape = ic2.a.getShape(kk0Var, 6);
                                i4 &= -3670017;
                            }
                            if ((i3 & Uuid.SIZE_BITS) != 0) {
                                containerColor = ic2.a.getContainerColor(kk0Var, 6);
                                i4 &= -29360129;
                            } else {
                                containerColor = j3;
                            }
                            if (i11 != 0) {
                                ic2 ic2Var11117 = ic2.a;
                                f4 = 0.0f;
                            } else {
                                f4 = f3;
                            }
                            if (i13 != 0) {
                                ic2 ic2Var11118 = ic2.a;
                                f5 = 3.0f;
                            } else {
                                f5 = f2;
                            }
                            if (i15 != 0) {
                                iwVar2 = null;
                            } else {
                                iwVar2 = iwVar;
                            }
                            rb3Var2 = rb3VarRememberScrollState;
                        } else {
                            if (i5 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i7 != 0) {
                                jE = xr0.E();
                            } else {
                                jE = j;
                            }
                            if ((i3 & 16) != 0) {
                                rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                                i4 &= -57345;
                            } else {
                                rb3VarRememberScrollState = rb3Var;
                            }
                            if (i9 != 0) {
                                ux2Var2 = a;
                            }
                            if ((i3 & 64) != 0) {
                                shape = ic2.a.getShape(kk0Var, 6);
                                i4 &= -3670017;
                            }
                            if ((i3 & Uuid.SIZE_BITS) != 0) {
                                containerColor = ic2.a.getContainerColor(kk0Var, 6);
                                i4 &= -29360129;
                            } else {
                                containerColor = j3;
                            }
                            if (i11 != 0) {
                                ic2 ic2Var11119 = ic2.a;
                                f4 = 0.0f;
                            } else {
                                f4 = f3;
                            }
                            if (i13 != 0) {
                                ic2 ic2Var111110 = ic2.a;
                                f5 = 3.0f;
                            } else {
                                f5 = f2;
                            }
                            if (i15 != 0) {
                                iwVar2 = null;
                            } else {
                                iwVar2 = iwVar;
                            }
                            rb3Var2 = rb3VarRememberScrollState;
                        }
                        kk0Var.s();
                        objP = kk0Var.P();
                        if (objP == Composer$Companion.getEmpty()) {
                            objP = new ni2(Boolean.FALSE);
                            kk0Var.l0(objP);
                        }
                        ni2Var = (ni2) objP;
                        ni2Var.c.setValue(Boolean.valueOf(z));
                        if (((Boolean) ni2Var.b.getValue()).booleanValue()) {
                            objP2 = kk0Var.P();
                            if (objP2 == Composer$Companion.getEmpty()) {
                                objP2 = cl3.d(new e54(e54.b));
                                kk0Var.l0(objP2);
                            }
                            mi2Var = (mi2) objP2;
                            wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                            if ((i4 & 7168) == 2048) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            zH = z2 | kk0Var.h(wu0Var);
                            objP3 = kk0Var.P();
                            if (zH) {
                                z3 = true;
                                objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                                kk0Var.l0(objP3);
                            } else {
                                z3 = true;
                                objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                                kk0Var.l0(objP3);
                            }
                            yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                        } else {
                            objP2 = kk0Var.P();
                            if (objP2 == Composer$Companion.getEmpty()) {
                                objP2 = cl3.d(new e54(e54.b));
                                kk0Var.l0(objP2);
                            }
                            mi2Var = (mi2) objP2;
                            wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                            if ((i4 & 7168) == 2048) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            zH = z2 | kk0Var.h(wu0Var);
                            objP3 = kk0Var.P();
                            if (zH) {
                                z3 = true;
                                objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                                kk0Var.l0(objP3);
                            } else {
                                z3 = true;
                                objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                                kk0Var.l0(objP3);
                            }
                            yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                        }
                        ux2Var3 = ux2Var2;
                        j4 = jE;
                        cVar4 = cVar3;
                        rb3Var3 = rb3Var2;
                        rg3Var2 = shape;
                        j5 = containerColor;
                        f6 = f4;
                        f7 = f5;
                        iwVar3 = iwVar2;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new vb(z, je1Var, cVar4, j4, rb3Var3, ux2Var3, rg3Var2, j5, f6, f7, iwVar3, oe1Var, i, i2, i3));
                    }
                }
                i16 |= 48;
                if ((i4 & 306783379) != 306783378) {
                    kk0Var.X();
                    if ((i & 1) != 0) {
                        if (i5 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i7 != 0) {
                            jE = xr0.E();
                        } else {
                            jE = j;
                        }
                        if ((i3 & 16) != 0) {
                            rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                            i4 &= -57345;
                        } else {
                            rb3VarRememberScrollState = rb3Var;
                        }
                        if (i9 != 0) {
                            ux2Var2 = a;
                        }
                        if ((i3 & 64) != 0) {
                            shape = ic2.a.getShape(kk0Var, 6);
                            i4 &= -3670017;
                        }
                        if ((i3 & Uuid.SIZE_BITS) != 0) {
                            containerColor = ic2.a.getContainerColor(kk0Var, 6);
                            i4 &= -29360129;
                        } else {
                            containerColor = j3;
                        }
                        if (i11 != 0) {
                            ic2 ic2Var111111 = ic2.a;
                            f4 = 0.0f;
                        } else {
                            f4 = f3;
                        }
                        if (i13 != 0) {
                            ic2 ic2Var111112 = ic2.a;
                            f5 = 3.0f;
                        } else {
                            f5 = f2;
                        }
                        if (i15 != 0) {
                            iwVar2 = null;
                        } else {
                            iwVar2 = iwVar;
                        }
                        rb3Var2 = rb3VarRememberScrollState;
                    } else {
                        if (i5 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i7 != 0) {
                            jE = xr0.E();
                        } else {
                            jE = j;
                        }
                        if ((i3 & 16) != 0) {
                            rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                            i4 &= -57345;
                        } else {
                            rb3VarRememberScrollState = rb3Var;
                        }
                        if (i9 != 0) {
                            ux2Var2 = a;
                        }
                        if ((i3 & 64) != 0) {
                            shape = ic2.a.getShape(kk0Var, 6);
                            i4 &= -3670017;
                        }
                        if ((i3 & Uuid.SIZE_BITS) != 0) {
                            containerColor = ic2.a.getContainerColor(kk0Var, 6);
                            i4 &= -29360129;
                        } else {
                            containerColor = j3;
                        }
                        if (i11 != 0) {
                            ic2 ic2Var111113 = ic2.a;
                            f4 = 0.0f;
                        } else {
                            f4 = f3;
                        }
                        if (i13 != 0) {
                            ic2 ic2Var111114 = ic2.a;
                            f5 = 3.0f;
                        } else {
                            f5 = f2;
                        }
                        if (i15 != 0) {
                            iwVar2 = null;
                        } else {
                            iwVar2 = iwVar;
                        }
                        rb3Var2 = rb3VarRememberScrollState;
                    }
                    kk0Var.s();
                    objP = kk0Var.P();
                    if (objP == Composer$Companion.getEmpty()) {
                        objP = new ni2(Boolean.FALSE);
                        kk0Var.l0(objP);
                    }
                    ni2Var = (ni2) objP;
                    ni2Var.c.setValue(Boolean.valueOf(z));
                    if (((Boolean) ni2Var.b.getValue()).booleanValue()) {
                        objP2 = kk0Var.P();
                        if (objP2 == Composer$Companion.getEmpty()) {
                            objP2 = cl3.d(new e54(e54.b));
                            kk0Var.l0(objP2);
                        }
                        mi2Var = (mi2) objP2;
                        wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                        if ((i4 & 7168) == 2048) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        zH = z2 | kk0Var.h(wu0Var);
                        objP3 = kk0Var.P();
                        if (zH) {
                            z3 = true;
                            objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                            kk0Var.l0(objP3);
                        } else {
                            z3 = true;
                            objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                            kk0Var.l0(objP3);
                        }
                        yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                    } else {
                        objP2 = kk0Var.P();
                        if (objP2 == Composer$Companion.getEmpty()) {
                            objP2 = cl3.d(new e54(e54.b));
                            kk0Var.l0(objP2);
                        }
                        mi2Var = (mi2) objP2;
                        wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                        if ((i4 & 7168) == 2048) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        zH = z2 | kk0Var.h(wu0Var);
                        objP3 = kk0Var.P();
                        if (zH) {
                            z3 = true;
                            objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                            kk0Var.l0(objP3);
                        } else {
                            z3 = true;
                            objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                            kk0Var.l0(objP3);
                        }
                        yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                    }
                    ux2Var3 = ux2Var2;
                    j4 = jE;
                    cVar4 = cVar3;
                    rb3Var3 = rb3Var2;
                    rg3Var2 = shape;
                    j5 = containerColor;
                    f6 = f4;
                    f7 = f5;
                    iwVar3 = iwVar2;
                } else {
                    kk0Var.X();
                    if ((i & 1) != 0) {
                        if (i5 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i7 != 0) {
                            jE = xr0.E();
                        } else {
                            jE = j;
                        }
                        if ((i3 & 16) != 0) {
                            rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                            i4 &= -57345;
                        } else {
                            rb3VarRememberScrollState = rb3Var;
                        }
                        if (i9 != 0) {
                            ux2Var2 = a;
                        }
                        if ((i3 & 64) != 0) {
                            shape = ic2.a.getShape(kk0Var, 6);
                            i4 &= -3670017;
                        }
                        if ((i3 & Uuid.SIZE_BITS) != 0) {
                            containerColor = ic2.a.getContainerColor(kk0Var, 6);
                            i4 &= -29360129;
                        } else {
                            containerColor = j3;
                        }
                        if (i11 != 0) {
                            ic2 ic2Var111115 = ic2.a;
                            f4 = 0.0f;
                        } else {
                            f4 = f3;
                        }
                        if (i13 != 0) {
                            ic2 ic2Var111116 = ic2.a;
                            f5 = 3.0f;
                        } else {
                            f5 = f2;
                        }
                        if (i15 != 0) {
                            iwVar2 = null;
                        } else {
                            iwVar2 = iwVar;
                        }
                        rb3Var2 = rb3VarRememberScrollState;
                    } else {
                        if (i5 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i7 != 0) {
                            jE = xr0.E();
                        } else {
                            jE = j;
                        }
                        if ((i3 & 16) != 0) {
                            rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                            i4 &= -57345;
                        } else {
                            rb3VarRememberScrollState = rb3Var;
                        }
                        if (i9 != 0) {
                            ux2Var2 = a;
                        }
                        if ((i3 & 64) != 0) {
                            shape = ic2.a.getShape(kk0Var, 6);
                            i4 &= -3670017;
                        }
                        if ((i3 & Uuid.SIZE_BITS) != 0) {
                            containerColor = ic2.a.getContainerColor(kk0Var, 6);
                            i4 &= -29360129;
                        } else {
                            containerColor = j3;
                        }
                        if (i11 != 0) {
                            ic2 ic2Var111117 = ic2.a;
                            f4 = 0.0f;
                        } else {
                            f4 = f3;
                        }
                        if (i13 != 0) {
                            ic2 ic2Var111118 = ic2.a;
                            f5 = 3.0f;
                        } else {
                            f5 = f2;
                        }
                        if (i15 != 0) {
                            iwVar2 = null;
                        } else {
                            iwVar2 = iwVar;
                        }
                        rb3Var2 = rb3VarRememberScrollState;
                    }
                    kk0Var.s();
                    objP = kk0Var.P();
                    if (objP == Composer$Companion.getEmpty()) {
                        objP = new ni2(Boolean.FALSE);
                        kk0Var.l0(objP);
                    }
                    ni2Var = (ni2) objP;
                    ni2Var.c.setValue(Boolean.valueOf(z));
                    if (((Boolean) ni2Var.b.getValue()).booleanValue()) {
                        objP2 = kk0Var.P();
                        if (objP2 == Composer$Companion.getEmpty()) {
                            objP2 = cl3.d(new e54(e54.b));
                            kk0Var.l0(objP2);
                        }
                        mi2Var = (mi2) objP2;
                        wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                        if ((i4 & 7168) == 2048) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        zH = z2 | kk0Var.h(wu0Var);
                        objP3 = kk0Var.P();
                        if (zH) {
                            z3 = true;
                            objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                            kk0Var.l0(objP3);
                        } else {
                            z3 = true;
                            objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                            kk0Var.l0(objP3);
                        }
                        yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                    } else {
                        objP2 = kk0Var.P();
                        if (objP2 == Composer$Companion.getEmpty()) {
                            objP2 = cl3.d(new e54(e54.b));
                            kk0Var.l0(objP2);
                        }
                        mi2Var = (mi2) objP2;
                        wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                        if ((i4 & 7168) == 2048) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        zH = z2 | kk0Var.h(wu0Var);
                        objP3 = kk0Var.P();
                        if (zH) {
                            z3 = true;
                            objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                            kk0Var.l0(objP3);
                        } else {
                            z3 = true;
                            objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                            kk0Var.l0(objP3);
                        }
                        yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                    }
                    ux2Var3 = ux2Var2;
                    j4 = jE;
                    cVar4 = cVar3;
                    rb3Var3 = rb3Var2;
                    rg3Var2 = shape;
                    j5 = containerColor;
                    f6 = f4;
                    f7 = f5;
                    iwVar3 = iwVar2;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new vb(z, je1Var, cVar4, j4, rb3Var3, ux2Var3, rg3Var2, j5, f6, f7, iwVar3, oe1Var, i, i2, i3));
                }
            }
            i4 |= 384;
            cVar2 = cVar;
            i7 = i3 & 8;
            if (i7 != 0) {
                if ((i & 3072) == 0) {
                    if (kk0Var.g(j)) {
                        i8 = 2048;
                    } else {
                        i8 = 1024;
                    }
                    i4 |= i8;
                }
                if ((i & 24576) != 0) {
                    i4 |= ((i3 & 16) == 0 || !kk0Var.h(rb3Var)) ? ConstantsKt.DEFAULT_BUFFER_SIZE : 16384;
                }
                i9 = i3 & 32;
                if (i9 != 0) {
                    i4 |= 196608;
                    ux2Var2 = ux2Var;
                } else {
                    ux2Var2 = ux2Var;
                    if ((i & 196608) == 0) {
                        if (kk0Var.h(ux2Var2)) {
                            i10 = 131072;
                        } else {
                            i10 = 65536;
                        }
                        i4 |= i10;
                    }
                }
                if ((i & 1572864) == 0) {
                    shape = rg3Var;
                    if ((i3 & 64) == 0) {
                        i20 = 524288;
                    } else {
                        i20 = 524288;
                    }
                    i4 |= i20;
                } else {
                    shape = rg3Var;
                }
                if ((i & 12582912) == 0) {
                    j3 = j2;
                    if ((i3 & Uuid.SIZE_BITS) == 0) {
                        i19 = 4194304;
                    } else {
                        i19 = 4194304;
                    }
                    i4 |= i19;
                } else {
                    j3 = j2;
                }
                i11 = i3 & FontInfo.NUMBER_OF_CHAR_CODES;
                if (i11 != 0) {
                    i4 |= 100663296;
                    f3 = f;
                } else {
                    f3 = f;
                    if ((i & 100663296) == 0) {
                        if (kk0Var.e(f3)) {
                            i12 = 67108864;
                        } else {
                            i12 = 33554432;
                        }
                        i4 |= i12;
                    }
                }
                i13 = i3 & ConstantsKt.MINIMUM_BLOCK_SIZE;
                if (i13 != 0) {
                    if ((i & 805306368) == 0) {
                        if (kk0Var.e(f2)) {
                            i14 = 536870912;
                        } else {
                            i14 = 268435456;
                        }
                        i4 |= i14;
                    }
                    i15 = i3 & 1024;
                    if (i15 != 0) {
                        i16 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        if (kk0Var.h(iwVar)) {
                            i17 = 4;
                        } else {
                            i17 = 2;
                        }
                        i16 = i2 | i17;
                    } else {
                        i16 = i2;
                    }
                    if ((i3 & 2048) != 0) {
                        if ((i2 & 48) == 0) {
                            if (kk0Var.j(oe1Var)) {
                                i18 = 32;
                            } else {
                                i18 = 16;
                            }
                            i16 |= i18;
                        }
                        if ((i4 & 306783379) != 306783378) {
                            kk0Var.X();
                            if ((i & 1) != 0) {
                                if (i5 != 0) {
                                    cVar3 = c.i;
                                } else {
                                    cVar3 = cVar2;
                                }
                                if (i7 != 0) {
                                    jE = xr0.E();
                                } else {
                                    jE = j;
                                }
                                if ((i3 & 16) != 0) {
                                    rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                                    i4 &= -57345;
                                } else {
                                    rb3VarRememberScrollState = rb3Var;
                                }
                                if (i9 != 0) {
                                    ux2Var2 = a;
                                }
                                if ((i3 & 64) != 0) {
                                    shape = ic2.a.getShape(kk0Var, 6);
                                    i4 &= -3670017;
                                }
                                if ((i3 & Uuid.SIZE_BITS) != 0) {
                                    containerColor = ic2.a.getContainerColor(kk0Var, 6);
                                    i4 &= -29360129;
                                } else {
                                    containerColor = j3;
                                }
                                if (i11 != 0) {
                                    ic2 ic2Var111119 = ic2.a;
                                    f4 = 0.0f;
                                } else {
                                    f4 = f3;
                                }
                                if (i13 != 0) {
                                    ic2 ic2Var1111110 = ic2.a;
                                    f5 = 3.0f;
                                } else {
                                    f5 = f2;
                                }
                                if (i15 != 0) {
                                    iwVar2 = null;
                                } else {
                                    iwVar2 = iwVar;
                                }
                                rb3Var2 = rb3VarRememberScrollState;
                            } else {
                                if (i5 != 0) {
                                    cVar3 = c.i;
                                } else {
                                    cVar3 = cVar2;
                                }
                                if (i7 != 0) {
                                    jE = xr0.E();
                                } else {
                                    jE = j;
                                }
                                if ((i3 & 16) != 0) {
                                    rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                                    i4 &= -57345;
                                } else {
                                    rb3VarRememberScrollState = rb3Var;
                                }
                                if (i9 != 0) {
                                    ux2Var2 = a;
                                }
                                if ((i3 & 64) != 0) {
                                    shape = ic2.a.getShape(kk0Var, 6);
                                    i4 &= -3670017;
                                }
                                if ((i3 & Uuid.SIZE_BITS) != 0) {
                                    containerColor = ic2.a.getContainerColor(kk0Var, 6);
                                    i4 &= -29360129;
                                } else {
                                    containerColor = j3;
                                }
                                if (i11 != 0) {
                                    ic2 ic2Var1111111 = ic2.a;
                                    f4 = 0.0f;
                                } else {
                                    f4 = f3;
                                }
                                if (i13 != 0) {
                                    ic2 ic2Var1111112 = ic2.a;
                                    f5 = 3.0f;
                                } else {
                                    f5 = f2;
                                }
                                if (i15 != 0) {
                                    iwVar2 = null;
                                } else {
                                    iwVar2 = iwVar;
                                }
                                rb3Var2 = rb3VarRememberScrollState;
                            }
                            kk0Var.s();
                            objP = kk0Var.P();
                            if (objP == Composer$Companion.getEmpty()) {
                                objP = new ni2(Boolean.FALSE);
                                kk0Var.l0(objP);
                            }
                            ni2Var = (ni2) objP;
                            ni2Var.c.setValue(Boolean.valueOf(z));
                            if (((Boolean) ni2Var.b.getValue()).booleanValue()) {
                                objP2 = kk0Var.P();
                                if (objP2 == Composer$Companion.getEmpty()) {
                                    objP2 = cl3.d(new e54(e54.b));
                                    kk0Var.l0(objP2);
                                }
                                mi2Var = (mi2) objP2;
                                wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                                if ((i4 & 7168) == 2048) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                zH = z2 | kk0Var.h(wu0Var);
                                objP3 = kk0Var.P();
                                if (zH) {
                                    z3 = true;
                                    objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                                    kk0Var.l0(objP3);
                                } else {
                                    z3 = true;
                                    objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                                    kk0Var.l0(objP3);
                                }
                                yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                            } else {
                                objP2 = kk0Var.P();
                                if (objP2 == Composer$Companion.getEmpty()) {
                                    objP2 = cl3.d(new e54(e54.b));
                                    kk0Var.l0(objP2);
                                }
                                mi2Var = (mi2) objP2;
                                wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                                if ((i4 & 7168) == 2048) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                zH = z2 | kk0Var.h(wu0Var);
                                objP3 = kk0Var.P();
                                if (zH) {
                                    z3 = true;
                                    objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                                    kk0Var.l0(objP3);
                                } else {
                                    z3 = true;
                                    objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                                    kk0Var.l0(objP3);
                                }
                                yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                            }
                            ux2Var3 = ux2Var2;
                            j4 = jE;
                            cVar4 = cVar3;
                            rb3Var3 = rb3Var2;
                            rg3Var2 = shape;
                            j5 = containerColor;
                            f6 = f4;
                            f7 = f5;
                            iwVar3 = iwVar2;
                        } else {
                            kk0Var.X();
                            if ((i & 1) != 0) {
                                if (i5 != 0) {
                                    cVar3 = c.i;
                                } else {
                                    cVar3 = cVar2;
                                }
                                if (i7 != 0) {
                                    jE = xr0.E();
                                } else {
                                    jE = j;
                                }
                                if ((i3 & 16) != 0) {
                                    rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                                    i4 &= -57345;
                                } else {
                                    rb3VarRememberScrollState = rb3Var;
                                }
                                if (i9 != 0) {
                                    ux2Var2 = a;
                                }
                                if ((i3 & 64) != 0) {
                                    shape = ic2.a.getShape(kk0Var, 6);
                                    i4 &= -3670017;
                                }
                                if ((i3 & Uuid.SIZE_BITS) != 0) {
                                    containerColor = ic2.a.getContainerColor(kk0Var, 6);
                                    i4 &= -29360129;
                                } else {
                                    containerColor = j3;
                                }
                                if (i11 != 0) {
                                    ic2 ic2Var1111113 = ic2.a;
                                    f4 = 0.0f;
                                } else {
                                    f4 = f3;
                                }
                                if (i13 != 0) {
                                    ic2 ic2Var1111114 = ic2.a;
                                    f5 = 3.0f;
                                } else {
                                    f5 = f2;
                                }
                                if (i15 != 0) {
                                    iwVar2 = null;
                                } else {
                                    iwVar2 = iwVar;
                                }
                                rb3Var2 = rb3VarRememberScrollState;
                            } else {
                                if (i5 != 0) {
                                    cVar3 = c.i;
                                } else {
                                    cVar3 = cVar2;
                                }
                                if (i7 != 0) {
                                    jE = xr0.E();
                                } else {
                                    jE = j;
                                }
                                if ((i3 & 16) != 0) {
                                    rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                                    i4 &= -57345;
                                } else {
                                    rb3VarRememberScrollState = rb3Var;
                                }
                                if (i9 != 0) {
                                    ux2Var2 = a;
                                }
                                if ((i3 & 64) != 0) {
                                    shape = ic2.a.getShape(kk0Var, 6);
                                    i4 &= -3670017;
                                }
                                if ((i3 & Uuid.SIZE_BITS) != 0) {
                                    containerColor = ic2.a.getContainerColor(kk0Var, 6);
                                    i4 &= -29360129;
                                } else {
                                    containerColor = j3;
                                }
                                if (i11 != 0) {
                                    ic2 ic2Var1111115 = ic2.a;
                                    f4 = 0.0f;
                                } else {
                                    f4 = f3;
                                }
                                if (i13 != 0) {
                                    ic2 ic2Var1111116 = ic2.a;
                                    f5 = 3.0f;
                                } else {
                                    f5 = f2;
                                }
                                if (i15 != 0) {
                                    iwVar2 = null;
                                } else {
                                    iwVar2 = iwVar;
                                }
                                rb3Var2 = rb3VarRememberScrollState;
                            }
                            kk0Var.s();
                            objP = kk0Var.P();
                            if (objP == Composer$Companion.getEmpty()) {
                                objP = new ni2(Boolean.FALSE);
                                kk0Var.l0(objP);
                            }
                            ni2Var = (ni2) objP;
                            ni2Var.c.setValue(Boolean.valueOf(z));
                            if (((Boolean) ni2Var.b.getValue()).booleanValue()) {
                                objP2 = kk0Var.P();
                                if (objP2 == Composer$Companion.getEmpty()) {
                                    objP2 = cl3.d(new e54(e54.b));
                                    kk0Var.l0(objP2);
                                }
                                mi2Var = (mi2) objP2;
                                wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                                if ((i4 & 7168) == 2048) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                zH = z2 | kk0Var.h(wu0Var);
                                objP3 = kk0Var.P();
                                if (zH) {
                                    z3 = true;
                                    objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                                    kk0Var.l0(objP3);
                                } else {
                                    z3 = true;
                                    objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                                    kk0Var.l0(objP3);
                                }
                                yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                            } else {
                                objP2 = kk0Var.P();
                                if (objP2 == Composer$Companion.getEmpty()) {
                                    objP2 = cl3.d(new e54(e54.b));
                                    kk0Var.l0(objP2);
                                }
                                mi2Var = (mi2) objP2;
                                wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                                if ((i4 & 7168) == 2048) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                zH = z2 | kk0Var.h(wu0Var);
                                objP3 = kk0Var.P();
                                if (zH) {
                                    z3 = true;
                                    objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                                    kk0Var.l0(objP3);
                                } else {
                                    z3 = true;
                                    objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                                    kk0Var.l0(objP3);
                                }
                                yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                            }
                            ux2Var3 = ux2Var2;
                            j4 = jE;
                            cVar4 = cVar3;
                            rb3Var3 = rb3Var2;
                            rg3Var2 = shape;
                            j5 = containerColor;
                            f6 = f4;
                            f7 = f5;
                            iwVar3 = iwVar2;
                        }
                        w33VarV = kk0Var.v();
                        if (w33VarV != null) {
                            w33VarV.updateScope(new vb(z, je1Var, cVar4, j4, rb3Var3, ux2Var3, rg3Var2, j5, f6, f7, iwVar3, oe1Var, i, i2, i3));
                        }
                    }
                    i16 |= 48;
                    if ((i4 & 306783379) != 306783378) {
                        kk0Var.X();
                        if ((i & 1) != 0) {
                            if (i5 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i7 != 0) {
                                jE = xr0.E();
                            } else {
                                jE = j;
                            }
                            if ((i3 & 16) != 0) {
                                rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                                i4 &= -57345;
                            } else {
                                rb3VarRememberScrollState = rb3Var;
                            }
                            if (i9 != 0) {
                                ux2Var2 = a;
                            }
                            if ((i3 & 64) != 0) {
                                shape = ic2.a.getShape(kk0Var, 6);
                                i4 &= -3670017;
                            }
                            if ((i3 & Uuid.SIZE_BITS) != 0) {
                                containerColor = ic2.a.getContainerColor(kk0Var, 6);
                                i4 &= -29360129;
                            } else {
                                containerColor = j3;
                            }
                            if (i11 != 0) {
                                ic2 ic2Var1111117 = ic2.a;
                                f4 = 0.0f;
                            } else {
                                f4 = f3;
                            }
                            if (i13 != 0) {
                                ic2 ic2Var1111118 = ic2.a;
                                f5 = 3.0f;
                            } else {
                                f5 = f2;
                            }
                            if (i15 != 0) {
                                iwVar2 = null;
                            } else {
                                iwVar2 = iwVar;
                            }
                            rb3Var2 = rb3VarRememberScrollState;
                        } else {
                            if (i5 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i7 != 0) {
                                jE = xr0.E();
                            } else {
                                jE = j;
                            }
                            if ((i3 & 16) != 0) {
                                rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                                i4 &= -57345;
                            } else {
                                rb3VarRememberScrollState = rb3Var;
                            }
                            if (i9 != 0) {
                                ux2Var2 = a;
                            }
                            if ((i3 & 64) != 0) {
                                shape = ic2.a.getShape(kk0Var, 6);
                                i4 &= -3670017;
                            }
                            if ((i3 & Uuid.SIZE_BITS) != 0) {
                                containerColor = ic2.a.getContainerColor(kk0Var, 6);
                                i4 &= -29360129;
                            } else {
                                containerColor = j3;
                            }
                            if (i11 != 0) {
                                ic2 ic2Var1111119 = ic2.a;
                                f4 = 0.0f;
                            } else {
                                f4 = f3;
                            }
                            if (i13 != 0) {
                                ic2 ic2Var11111110 = ic2.a;
                                f5 = 3.0f;
                            } else {
                                f5 = f2;
                            }
                            if (i15 != 0) {
                                iwVar2 = null;
                            } else {
                                iwVar2 = iwVar;
                            }
                            rb3Var2 = rb3VarRememberScrollState;
                        }
                        kk0Var.s();
                        objP = kk0Var.P();
                        if (objP == Composer$Companion.getEmpty()) {
                            objP = new ni2(Boolean.FALSE);
                            kk0Var.l0(objP);
                        }
                        ni2Var = (ni2) objP;
                        ni2Var.c.setValue(Boolean.valueOf(z));
                        if (((Boolean) ni2Var.b.getValue()).booleanValue()) {
                            objP2 = kk0Var.P();
                            if (objP2 == Composer$Companion.getEmpty()) {
                                objP2 = cl3.d(new e54(e54.b));
                                kk0Var.l0(objP2);
                            }
                            mi2Var = (mi2) objP2;
                            wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                            if ((i4 & 7168) == 2048) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            zH = z2 | kk0Var.h(wu0Var);
                            objP3 = kk0Var.P();
                            if (zH) {
                                z3 = true;
                                objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                                kk0Var.l0(objP3);
                            } else {
                                z3 = true;
                                objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                                kk0Var.l0(objP3);
                            }
                            yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                        } else {
                            objP2 = kk0Var.P();
                            if (objP2 == Composer$Companion.getEmpty()) {
                                objP2 = cl3.d(new e54(e54.b));
                                kk0Var.l0(objP2);
                            }
                            mi2Var = (mi2) objP2;
                            wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                            if ((i4 & 7168) == 2048) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            zH = z2 | kk0Var.h(wu0Var);
                            objP3 = kk0Var.P();
                            if (zH) {
                                z3 = true;
                                objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                                kk0Var.l0(objP3);
                            } else {
                                z3 = true;
                                objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                                kk0Var.l0(objP3);
                            }
                            yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                        }
                        ux2Var3 = ux2Var2;
                        j4 = jE;
                        cVar4 = cVar3;
                        rb3Var3 = rb3Var2;
                        rg3Var2 = shape;
                        j5 = containerColor;
                        f6 = f4;
                        f7 = f5;
                        iwVar3 = iwVar2;
                    } else {
                        kk0Var.X();
                        if ((i & 1) != 0) {
                            if (i5 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i7 != 0) {
                                jE = xr0.E();
                            } else {
                                jE = j;
                            }
                            if ((i3 & 16) != 0) {
                                rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                                i4 &= -57345;
                            } else {
                                rb3VarRememberScrollState = rb3Var;
                            }
                            if (i9 != 0) {
                                ux2Var2 = a;
                            }
                            if ((i3 & 64) != 0) {
                                shape = ic2.a.getShape(kk0Var, 6);
                                i4 &= -3670017;
                            }
                            if ((i3 & Uuid.SIZE_BITS) != 0) {
                                containerColor = ic2.a.getContainerColor(kk0Var, 6);
                                i4 &= -29360129;
                            } else {
                                containerColor = j3;
                            }
                            if (i11 != 0) {
                                ic2 ic2Var11111111 = ic2.a;
                                f4 = 0.0f;
                            } else {
                                f4 = f3;
                            }
                            if (i13 != 0) {
                                ic2 ic2Var11111112 = ic2.a;
                                f5 = 3.0f;
                            } else {
                                f5 = f2;
                            }
                            if (i15 != 0) {
                                iwVar2 = null;
                            } else {
                                iwVar2 = iwVar;
                            }
                            rb3Var2 = rb3VarRememberScrollState;
                        } else {
                            if (i5 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i7 != 0) {
                                jE = xr0.E();
                            } else {
                                jE = j;
                            }
                            if ((i3 & 16) != 0) {
                                rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                                i4 &= -57345;
                            } else {
                                rb3VarRememberScrollState = rb3Var;
                            }
                            if (i9 != 0) {
                                ux2Var2 = a;
                            }
                            if ((i3 & 64) != 0) {
                                shape = ic2.a.getShape(kk0Var, 6);
                                i4 &= -3670017;
                            }
                            if ((i3 & Uuid.SIZE_BITS) != 0) {
                                containerColor = ic2.a.getContainerColor(kk0Var, 6);
                                i4 &= -29360129;
                            } else {
                                containerColor = j3;
                            }
                            if (i11 != 0) {
                                ic2 ic2Var11111113 = ic2.a;
                                f4 = 0.0f;
                            } else {
                                f4 = f3;
                            }
                            if (i13 != 0) {
                                ic2 ic2Var11111114 = ic2.a;
                                f5 = 3.0f;
                            } else {
                                f5 = f2;
                            }
                            if (i15 != 0) {
                                iwVar2 = null;
                            } else {
                                iwVar2 = iwVar;
                            }
                            rb3Var2 = rb3VarRememberScrollState;
                        }
                        kk0Var.s();
                        objP = kk0Var.P();
                        if (objP == Composer$Companion.getEmpty()) {
                            objP = new ni2(Boolean.FALSE);
                            kk0Var.l0(objP);
                        }
                        ni2Var = (ni2) objP;
                        ni2Var.c.setValue(Boolean.valueOf(z));
                        if (((Boolean) ni2Var.b.getValue()).booleanValue()) {
                            objP2 = kk0Var.P();
                            if (objP2 == Composer$Companion.getEmpty()) {
                                objP2 = cl3.d(new e54(e54.b));
                                kk0Var.l0(objP2);
                            }
                            mi2Var = (mi2) objP2;
                            wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                            if ((i4 & 7168) == 2048) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            zH = z2 | kk0Var.h(wu0Var);
                            objP3 = kk0Var.P();
                            if (zH) {
                                z3 = true;
                                objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                                kk0Var.l0(objP3);
                            } else {
                                z3 = true;
                                objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                                kk0Var.l0(objP3);
                            }
                            yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                        } else {
                            objP2 = kk0Var.P();
                            if (objP2 == Composer$Companion.getEmpty()) {
                                objP2 = cl3.d(new e54(e54.b));
                                kk0Var.l0(objP2);
                            }
                            mi2Var = (mi2) objP2;
                            wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                            if ((i4 & 7168) == 2048) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            zH = z2 | kk0Var.h(wu0Var);
                            objP3 = kk0Var.P();
                            if (zH) {
                                z3 = true;
                                objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                                kk0Var.l0(objP3);
                            } else {
                                z3 = true;
                                objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                                kk0Var.l0(objP3);
                            }
                            yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                        }
                        ux2Var3 = ux2Var2;
                        j4 = jE;
                        cVar4 = cVar3;
                        rb3Var3 = rb3Var2;
                        rg3Var2 = shape;
                        j5 = containerColor;
                        f6 = f4;
                        f7 = f5;
                        iwVar3 = iwVar2;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new vb(z, je1Var, cVar4, j4, rb3Var3, ux2Var3, rg3Var2, j5, f6, f7, iwVar3, oe1Var, i, i2, i3));
                    }
                }
                i4 |= 805306368;
                i15 = i3 & 1024;
                if (i15 != 0) {
                    i16 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    if (kk0Var.h(iwVar)) {
                        i17 = 4;
                    } else {
                        i17 = 2;
                    }
                    i16 = i2 | i17;
                } else {
                    i16 = i2;
                }
                if ((i3 & 2048) != 0) {
                    if ((i2 & 48) == 0) {
                        if (kk0Var.j(oe1Var)) {
                            i18 = 32;
                        } else {
                            i18 = 16;
                        }
                        i16 |= i18;
                    }
                    if ((i4 & 306783379) != 306783378) {
                        kk0Var.X();
                        if ((i & 1) != 0) {
                            if (i5 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i7 != 0) {
                                jE = xr0.E();
                            } else {
                                jE = j;
                            }
                            if ((i3 & 16) != 0) {
                                rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                                i4 &= -57345;
                            } else {
                                rb3VarRememberScrollState = rb3Var;
                            }
                            if (i9 != 0) {
                                ux2Var2 = a;
                            }
                            if ((i3 & 64) != 0) {
                                shape = ic2.a.getShape(kk0Var, 6);
                                i4 &= -3670017;
                            }
                            if ((i3 & Uuid.SIZE_BITS) != 0) {
                                containerColor = ic2.a.getContainerColor(kk0Var, 6);
                                i4 &= -29360129;
                            } else {
                                containerColor = j3;
                            }
                            if (i11 != 0) {
                                ic2 ic2Var11111115 = ic2.a;
                                f4 = 0.0f;
                            } else {
                                f4 = f3;
                            }
                            if (i13 != 0) {
                                ic2 ic2Var11111116 = ic2.a;
                                f5 = 3.0f;
                            } else {
                                f5 = f2;
                            }
                            if (i15 != 0) {
                                iwVar2 = null;
                            } else {
                                iwVar2 = iwVar;
                            }
                            rb3Var2 = rb3VarRememberScrollState;
                        } else {
                            if (i5 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i7 != 0) {
                                jE = xr0.E();
                            } else {
                                jE = j;
                            }
                            if ((i3 & 16) != 0) {
                                rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                                i4 &= -57345;
                            } else {
                                rb3VarRememberScrollState = rb3Var;
                            }
                            if (i9 != 0) {
                                ux2Var2 = a;
                            }
                            if ((i3 & 64) != 0) {
                                shape = ic2.a.getShape(kk0Var, 6);
                                i4 &= -3670017;
                            }
                            if ((i3 & Uuid.SIZE_BITS) != 0) {
                                containerColor = ic2.a.getContainerColor(kk0Var, 6);
                                i4 &= -29360129;
                            } else {
                                containerColor = j3;
                            }
                            if (i11 != 0) {
                                ic2 ic2Var11111117 = ic2.a;
                                f4 = 0.0f;
                            } else {
                                f4 = f3;
                            }
                            if (i13 != 0) {
                                ic2 ic2Var11111118 = ic2.a;
                                f5 = 3.0f;
                            } else {
                                f5 = f2;
                            }
                            if (i15 != 0) {
                                iwVar2 = null;
                            } else {
                                iwVar2 = iwVar;
                            }
                            rb3Var2 = rb3VarRememberScrollState;
                        }
                        kk0Var.s();
                        objP = kk0Var.P();
                        if (objP == Composer$Companion.getEmpty()) {
                            objP = new ni2(Boolean.FALSE);
                            kk0Var.l0(objP);
                        }
                        ni2Var = (ni2) objP;
                        ni2Var.c.setValue(Boolean.valueOf(z));
                        if (((Boolean) ni2Var.b.getValue()).booleanValue()) {
                            objP2 = kk0Var.P();
                            if (objP2 == Composer$Companion.getEmpty()) {
                                objP2 = cl3.d(new e54(e54.b));
                                kk0Var.l0(objP2);
                            }
                            mi2Var = (mi2) objP2;
                            wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                            if ((i4 & 7168) == 2048) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            zH = z2 | kk0Var.h(wu0Var);
                            objP3 = kk0Var.P();
                            if (zH) {
                                z3 = true;
                                objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                                kk0Var.l0(objP3);
                            } else {
                                z3 = true;
                                objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                                kk0Var.l0(objP3);
                            }
                            yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                        } else {
                            objP2 = kk0Var.P();
                            if (objP2 == Composer$Companion.getEmpty()) {
                                objP2 = cl3.d(new e54(e54.b));
                                kk0Var.l0(objP2);
                            }
                            mi2Var = (mi2) objP2;
                            wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                            if ((i4 & 7168) == 2048) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            zH = z2 | kk0Var.h(wu0Var);
                            objP3 = kk0Var.P();
                            if (zH) {
                                z3 = true;
                                objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                                kk0Var.l0(objP3);
                            } else {
                                z3 = true;
                                objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                                kk0Var.l0(objP3);
                            }
                            yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                        }
                        ux2Var3 = ux2Var2;
                        j4 = jE;
                        cVar4 = cVar3;
                        rb3Var3 = rb3Var2;
                        rg3Var2 = shape;
                        j5 = containerColor;
                        f6 = f4;
                        f7 = f5;
                        iwVar3 = iwVar2;
                    } else {
                        kk0Var.X();
                        if ((i & 1) != 0) {
                            if (i5 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i7 != 0) {
                                jE = xr0.E();
                            } else {
                                jE = j;
                            }
                            if ((i3 & 16) != 0) {
                                rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                                i4 &= -57345;
                            } else {
                                rb3VarRememberScrollState = rb3Var;
                            }
                            if (i9 != 0) {
                                ux2Var2 = a;
                            }
                            if ((i3 & 64) != 0) {
                                shape = ic2.a.getShape(kk0Var, 6);
                                i4 &= -3670017;
                            }
                            if ((i3 & Uuid.SIZE_BITS) != 0) {
                                containerColor = ic2.a.getContainerColor(kk0Var, 6);
                                i4 &= -29360129;
                            } else {
                                containerColor = j3;
                            }
                            if (i11 != 0) {
                                ic2 ic2Var11111119 = ic2.a;
                                f4 = 0.0f;
                            } else {
                                f4 = f3;
                            }
                            if (i13 != 0) {
                                ic2 ic2Var111111110 = ic2.a;
                                f5 = 3.0f;
                            } else {
                                f5 = f2;
                            }
                            if (i15 != 0) {
                                iwVar2 = null;
                            } else {
                                iwVar2 = iwVar;
                            }
                            rb3Var2 = rb3VarRememberScrollState;
                        } else {
                            if (i5 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i7 != 0) {
                                jE = xr0.E();
                            } else {
                                jE = j;
                            }
                            if ((i3 & 16) != 0) {
                                rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                                i4 &= -57345;
                            } else {
                                rb3VarRememberScrollState = rb3Var;
                            }
                            if (i9 != 0) {
                                ux2Var2 = a;
                            }
                            if ((i3 & 64) != 0) {
                                shape = ic2.a.getShape(kk0Var, 6);
                                i4 &= -3670017;
                            }
                            if ((i3 & Uuid.SIZE_BITS) != 0) {
                                containerColor = ic2.a.getContainerColor(kk0Var, 6);
                                i4 &= -29360129;
                            } else {
                                containerColor = j3;
                            }
                            if (i11 != 0) {
                                ic2 ic2Var111111111 = ic2.a;
                                f4 = 0.0f;
                            } else {
                                f4 = f3;
                            }
                            if (i13 != 0) {
                                ic2 ic2Var111111112 = ic2.a;
                                f5 = 3.0f;
                            } else {
                                f5 = f2;
                            }
                            if (i15 != 0) {
                                iwVar2 = null;
                            } else {
                                iwVar2 = iwVar;
                            }
                            rb3Var2 = rb3VarRememberScrollState;
                        }
                        kk0Var.s();
                        objP = kk0Var.P();
                        if (objP == Composer$Companion.getEmpty()) {
                            objP = new ni2(Boolean.FALSE);
                            kk0Var.l0(objP);
                        }
                        ni2Var = (ni2) objP;
                        ni2Var.c.setValue(Boolean.valueOf(z));
                        if (((Boolean) ni2Var.b.getValue()).booleanValue()) {
                            objP2 = kk0Var.P();
                            if (objP2 == Composer$Companion.getEmpty()) {
                                objP2 = cl3.d(new e54(e54.b));
                                kk0Var.l0(objP2);
                            }
                            mi2Var = (mi2) objP2;
                            wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                            if ((i4 & 7168) == 2048) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            zH = z2 | kk0Var.h(wu0Var);
                            objP3 = kk0Var.P();
                            if (zH) {
                                z3 = true;
                                objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                                kk0Var.l0(objP3);
                            } else {
                                z3 = true;
                                objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                                kk0Var.l0(objP3);
                            }
                            yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                        } else {
                            objP2 = kk0Var.P();
                            if (objP2 == Composer$Companion.getEmpty()) {
                                objP2 = cl3.d(new e54(e54.b));
                                kk0Var.l0(objP2);
                            }
                            mi2Var = (mi2) objP2;
                            wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                            if ((i4 & 7168) == 2048) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            zH = z2 | kk0Var.h(wu0Var);
                            objP3 = kk0Var.P();
                            if (zH) {
                                z3 = true;
                                objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                                kk0Var.l0(objP3);
                            } else {
                                z3 = true;
                                objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                                kk0Var.l0(objP3);
                            }
                            yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                        }
                        ux2Var3 = ux2Var2;
                        j4 = jE;
                        cVar4 = cVar3;
                        rb3Var3 = rb3Var2;
                        rg3Var2 = shape;
                        j5 = containerColor;
                        f6 = f4;
                        f7 = f5;
                        iwVar3 = iwVar2;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new vb(z, je1Var, cVar4, j4, rb3Var3, ux2Var3, rg3Var2, j5, f6, f7, iwVar3, oe1Var, i, i2, i3));
                    }
                }
                i16 |= 48;
                if ((i4 & 306783379) != 306783378) {
                    kk0Var.X();
                    if ((i & 1) != 0) {
                        if (i5 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i7 != 0) {
                            jE = xr0.E();
                        } else {
                            jE = j;
                        }
                        if ((i3 & 16) != 0) {
                            rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                            i4 &= -57345;
                        } else {
                            rb3VarRememberScrollState = rb3Var;
                        }
                        if (i9 != 0) {
                            ux2Var2 = a;
                        }
                        if ((i3 & 64) != 0) {
                            shape = ic2.a.getShape(kk0Var, 6);
                            i4 &= -3670017;
                        }
                        if ((i3 & Uuid.SIZE_BITS) != 0) {
                            containerColor = ic2.a.getContainerColor(kk0Var, 6);
                            i4 &= -29360129;
                        } else {
                            containerColor = j3;
                        }
                        if (i11 != 0) {
                            ic2 ic2Var111111113 = ic2.a;
                            f4 = 0.0f;
                        } else {
                            f4 = f3;
                        }
                        if (i13 != 0) {
                            ic2 ic2Var111111114 = ic2.a;
                            f5 = 3.0f;
                        } else {
                            f5 = f2;
                        }
                        if (i15 != 0) {
                            iwVar2 = null;
                        } else {
                            iwVar2 = iwVar;
                        }
                        rb3Var2 = rb3VarRememberScrollState;
                    } else {
                        if (i5 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i7 != 0) {
                            jE = xr0.E();
                        } else {
                            jE = j;
                        }
                        if ((i3 & 16) != 0) {
                            rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                            i4 &= -57345;
                        } else {
                            rb3VarRememberScrollState = rb3Var;
                        }
                        if (i9 != 0) {
                            ux2Var2 = a;
                        }
                        if ((i3 & 64) != 0) {
                            shape = ic2.a.getShape(kk0Var, 6);
                            i4 &= -3670017;
                        }
                        if ((i3 & Uuid.SIZE_BITS) != 0) {
                            containerColor = ic2.a.getContainerColor(kk0Var, 6);
                            i4 &= -29360129;
                        } else {
                            containerColor = j3;
                        }
                        if (i11 != 0) {
                            ic2 ic2Var111111115 = ic2.a;
                            f4 = 0.0f;
                        } else {
                            f4 = f3;
                        }
                        if (i13 != 0) {
                            ic2 ic2Var111111116 = ic2.a;
                            f5 = 3.0f;
                        } else {
                            f5 = f2;
                        }
                        if (i15 != 0) {
                            iwVar2 = null;
                        } else {
                            iwVar2 = iwVar;
                        }
                        rb3Var2 = rb3VarRememberScrollState;
                    }
                    kk0Var.s();
                    objP = kk0Var.P();
                    if (objP == Composer$Companion.getEmpty()) {
                        objP = new ni2(Boolean.FALSE);
                        kk0Var.l0(objP);
                    }
                    ni2Var = (ni2) objP;
                    ni2Var.c.setValue(Boolean.valueOf(z));
                    if (((Boolean) ni2Var.b.getValue()).booleanValue()) {
                        objP2 = kk0Var.P();
                        if (objP2 == Composer$Companion.getEmpty()) {
                            objP2 = cl3.d(new e54(e54.b));
                            kk0Var.l0(objP2);
                        }
                        mi2Var = (mi2) objP2;
                        wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                        if ((i4 & 7168) == 2048) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        zH = z2 | kk0Var.h(wu0Var);
                        objP3 = kk0Var.P();
                        if (zH) {
                            z3 = true;
                            objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                            kk0Var.l0(objP3);
                        } else {
                            z3 = true;
                            objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                            kk0Var.l0(objP3);
                        }
                        yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                    } else {
                        objP2 = kk0Var.P();
                        if (objP2 == Composer$Companion.getEmpty()) {
                            objP2 = cl3.d(new e54(e54.b));
                            kk0Var.l0(objP2);
                        }
                        mi2Var = (mi2) objP2;
                        wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                        if ((i4 & 7168) == 2048) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        zH = z2 | kk0Var.h(wu0Var);
                        objP3 = kk0Var.P();
                        if (zH) {
                            z3 = true;
                            objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                            kk0Var.l0(objP3);
                        } else {
                            z3 = true;
                            objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                            kk0Var.l0(objP3);
                        }
                        yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                    }
                    ux2Var3 = ux2Var2;
                    j4 = jE;
                    cVar4 = cVar3;
                    rb3Var3 = rb3Var2;
                    rg3Var2 = shape;
                    j5 = containerColor;
                    f6 = f4;
                    f7 = f5;
                    iwVar3 = iwVar2;
                } else {
                    kk0Var.X();
                    if ((i & 1) != 0) {
                        if (i5 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i7 != 0) {
                            jE = xr0.E();
                        } else {
                            jE = j;
                        }
                        if ((i3 & 16) != 0) {
                            rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                            i4 &= -57345;
                        } else {
                            rb3VarRememberScrollState = rb3Var;
                        }
                        if (i9 != 0) {
                            ux2Var2 = a;
                        }
                        if ((i3 & 64) != 0) {
                            shape = ic2.a.getShape(kk0Var, 6);
                            i4 &= -3670017;
                        }
                        if ((i3 & Uuid.SIZE_BITS) != 0) {
                            containerColor = ic2.a.getContainerColor(kk0Var, 6);
                            i4 &= -29360129;
                        } else {
                            containerColor = j3;
                        }
                        if (i11 != 0) {
                            ic2 ic2Var111111117 = ic2.a;
                            f4 = 0.0f;
                        } else {
                            f4 = f3;
                        }
                        if (i13 != 0) {
                            ic2 ic2Var111111118 = ic2.a;
                            f5 = 3.0f;
                        } else {
                            f5 = f2;
                        }
                        if (i15 != 0) {
                            iwVar2 = null;
                        } else {
                            iwVar2 = iwVar;
                        }
                        rb3Var2 = rb3VarRememberScrollState;
                    } else {
                        if (i5 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i7 != 0) {
                            jE = xr0.E();
                        } else {
                            jE = j;
                        }
                        if ((i3 & 16) != 0) {
                            rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                            i4 &= -57345;
                        } else {
                            rb3VarRememberScrollState = rb3Var;
                        }
                        if (i9 != 0) {
                            ux2Var2 = a;
                        }
                        if ((i3 & 64) != 0) {
                            shape = ic2.a.getShape(kk0Var, 6);
                            i4 &= -3670017;
                        }
                        if ((i3 & Uuid.SIZE_BITS) != 0) {
                            containerColor = ic2.a.getContainerColor(kk0Var, 6);
                            i4 &= -29360129;
                        } else {
                            containerColor = j3;
                        }
                        if (i11 != 0) {
                            ic2 ic2Var111111119 = ic2.a;
                            f4 = 0.0f;
                        } else {
                            f4 = f3;
                        }
                        if (i13 != 0) {
                            ic2 ic2Var1111111110 = ic2.a;
                            f5 = 3.0f;
                        } else {
                            f5 = f2;
                        }
                        if (i15 != 0) {
                            iwVar2 = null;
                        } else {
                            iwVar2 = iwVar;
                        }
                        rb3Var2 = rb3VarRememberScrollState;
                    }
                    kk0Var.s();
                    objP = kk0Var.P();
                    if (objP == Composer$Companion.getEmpty()) {
                        objP = new ni2(Boolean.FALSE);
                        kk0Var.l0(objP);
                    }
                    ni2Var = (ni2) objP;
                    ni2Var.c.setValue(Boolean.valueOf(z));
                    if (((Boolean) ni2Var.b.getValue()).booleanValue()) {
                        objP2 = kk0Var.P();
                        if (objP2 == Composer$Companion.getEmpty()) {
                            objP2 = cl3.d(new e54(e54.b));
                            kk0Var.l0(objP2);
                        }
                        mi2Var = (mi2) objP2;
                        wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                        if ((i4 & 7168) == 2048) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        zH = z2 | kk0Var.h(wu0Var);
                        objP3 = kk0Var.P();
                        if (zH) {
                            z3 = true;
                            objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                            kk0Var.l0(objP3);
                        } else {
                            z3 = true;
                            objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                            kk0Var.l0(objP3);
                        }
                        yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                    } else {
                        objP2 = kk0Var.P();
                        if (objP2 == Composer$Companion.getEmpty()) {
                            objP2 = cl3.d(new e54(e54.b));
                            kk0Var.l0(objP2);
                        }
                        mi2Var = (mi2) objP2;
                        wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                        if ((i4 & 7168) == 2048) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        zH = z2 | kk0Var.h(wu0Var);
                        objP3 = kk0Var.P();
                        if (zH) {
                            z3 = true;
                            objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                            kk0Var.l0(objP3);
                        } else {
                            z3 = true;
                            objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                            kk0Var.l0(objP3);
                        }
                        yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                    }
                    ux2Var3 = ux2Var2;
                    j4 = jE;
                    cVar4 = cVar3;
                    rb3Var3 = rb3Var2;
                    rg3Var2 = shape;
                    j5 = containerColor;
                    f6 = f4;
                    f7 = f5;
                    iwVar3 = iwVar2;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new vb(z, je1Var, cVar4, j4, rb3Var3, ux2Var3, rg3Var2, j5, f6, f7, iwVar3, oe1Var, i, i2, i3));
                }
            }
            i4 |= 3072;
            if ((i & 24576) != 0) {
                i4 |= ((i3 & 16) == 0 || !kk0Var.h(rb3Var)) ? ConstantsKt.DEFAULT_BUFFER_SIZE : 16384;
            }
            i9 = i3 & 32;
            if (i9 != 0) {
                i4 |= 196608;
                ux2Var2 = ux2Var;
            } else {
                ux2Var2 = ux2Var;
                if ((i & 196608) == 0) {
                    if (kk0Var.h(ux2Var2)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                    i4 |= i10;
                }
            }
            if ((i & 1572864) == 0) {
                shape = rg3Var;
                if ((i3 & 64) == 0) {
                    i20 = 524288;
                } else {
                    i20 = 524288;
                }
                i4 |= i20;
            } else {
                shape = rg3Var;
            }
            if ((i & 12582912) == 0) {
                j3 = j2;
                if ((i3 & Uuid.SIZE_BITS) == 0) {
                    i19 = 4194304;
                } else {
                    i19 = 4194304;
                }
                i4 |= i19;
            } else {
                j3 = j2;
            }
            i11 = i3 & FontInfo.NUMBER_OF_CHAR_CODES;
            if (i11 != 0) {
                i4 |= 100663296;
                f3 = f;
            } else {
                f3 = f;
                if ((i & 100663296) == 0) {
                    if (kk0Var.e(f3)) {
                        i12 = 67108864;
                    } else {
                        i12 = 33554432;
                    }
                    i4 |= i12;
                }
            }
            i13 = i3 & ConstantsKt.MINIMUM_BLOCK_SIZE;
            if (i13 != 0) {
                if ((i & 805306368) == 0) {
                    if (kk0Var.e(f2)) {
                        i14 = 536870912;
                    } else {
                        i14 = 268435456;
                    }
                    i4 |= i14;
                }
                i15 = i3 & 1024;
                if (i15 != 0) {
                    i16 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    if (kk0Var.h(iwVar)) {
                        i17 = 4;
                    } else {
                        i17 = 2;
                    }
                    i16 = i2 | i17;
                } else {
                    i16 = i2;
                }
                if ((i3 & 2048) != 0) {
                    if ((i2 & 48) == 0) {
                        if (kk0Var.j(oe1Var)) {
                            i18 = 32;
                        } else {
                            i18 = 16;
                        }
                        i16 |= i18;
                    }
                    if ((i4 & 306783379) != 306783378) {
                        kk0Var.X();
                        if ((i & 1) != 0) {
                            if (i5 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i7 != 0) {
                                jE = xr0.E();
                            } else {
                                jE = j;
                            }
                            if ((i3 & 16) != 0) {
                                rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                                i4 &= -57345;
                            } else {
                                rb3VarRememberScrollState = rb3Var;
                            }
                            if (i9 != 0) {
                                ux2Var2 = a;
                            }
                            if ((i3 & 64) != 0) {
                                shape = ic2.a.getShape(kk0Var, 6);
                                i4 &= -3670017;
                            }
                            if ((i3 & Uuid.SIZE_BITS) != 0) {
                                containerColor = ic2.a.getContainerColor(kk0Var, 6);
                                i4 &= -29360129;
                            } else {
                                containerColor = j3;
                            }
                            if (i11 != 0) {
                                ic2 ic2Var1111111111 = ic2.a;
                                f4 = 0.0f;
                            } else {
                                f4 = f3;
                            }
                            if (i13 != 0) {
                                ic2 ic2Var1111111112 = ic2.a;
                                f5 = 3.0f;
                            } else {
                                f5 = f2;
                            }
                            if (i15 != 0) {
                                iwVar2 = null;
                            } else {
                                iwVar2 = iwVar;
                            }
                            rb3Var2 = rb3VarRememberScrollState;
                        } else {
                            if (i5 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i7 != 0) {
                                jE = xr0.E();
                            } else {
                                jE = j;
                            }
                            if ((i3 & 16) != 0) {
                                rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                                i4 &= -57345;
                            } else {
                                rb3VarRememberScrollState = rb3Var;
                            }
                            if (i9 != 0) {
                                ux2Var2 = a;
                            }
                            if ((i3 & 64) != 0) {
                                shape = ic2.a.getShape(kk0Var, 6);
                                i4 &= -3670017;
                            }
                            if ((i3 & Uuid.SIZE_BITS) != 0) {
                                containerColor = ic2.a.getContainerColor(kk0Var, 6);
                                i4 &= -29360129;
                            } else {
                                containerColor = j3;
                            }
                            if (i11 != 0) {
                                ic2 ic2Var1111111113 = ic2.a;
                                f4 = 0.0f;
                            } else {
                                f4 = f3;
                            }
                            if (i13 != 0) {
                                ic2 ic2Var1111111114 = ic2.a;
                                f5 = 3.0f;
                            } else {
                                f5 = f2;
                            }
                            if (i15 != 0) {
                                iwVar2 = null;
                            } else {
                                iwVar2 = iwVar;
                            }
                            rb3Var2 = rb3VarRememberScrollState;
                        }
                        kk0Var.s();
                        objP = kk0Var.P();
                        if (objP == Composer$Companion.getEmpty()) {
                            objP = new ni2(Boolean.FALSE);
                            kk0Var.l0(objP);
                        }
                        ni2Var = (ni2) objP;
                        ni2Var.c.setValue(Boolean.valueOf(z));
                        if (((Boolean) ni2Var.b.getValue()).booleanValue()) {
                            objP2 = kk0Var.P();
                            if (objP2 == Composer$Companion.getEmpty()) {
                                objP2 = cl3.d(new e54(e54.b));
                                kk0Var.l0(objP2);
                            }
                            mi2Var = (mi2) objP2;
                            wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                            if ((i4 & 7168) == 2048) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            zH = z2 | kk0Var.h(wu0Var);
                            objP3 = kk0Var.P();
                            if (zH) {
                                z3 = true;
                                objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                                kk0Var.l0(objP3);
                            } else {
                                z3 = true;
                                objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                                kk0Var.l0(objP3);
                            }
                            yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                        } else {
                            objP2 = kk0Var.P();
                            if (objP2 == Composer$Companion.getEmpty()) {
                                objP2 = cl3.d(new e54(e54.b));
                                kk0Var.l0(objP2);
                            }
                            mi2Var = (mi2) objP2;
                            wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                            if ((i4 & 7168) == 2048) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            zH = z2 | kk0Var.h(wu0Var);
                            objP3 = kk0Var.P();
                            if (zH) {
                                z3 = true;
                                objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                                kk0Var.l0(objP3);
                            } else {
                                z3 = true;
                                objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                                kk0Var.l0(objP3);
                            }
                            yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                        }
                        ux2Var3 = ux2Var2;
                        j4 = jE;
                        cVar4 = cVar3;
                        rb3Var3 = rb3Var2;
                        rg3Var2 = shape;
                        j5 = containerColor;
                        f6 = f4;
                        f7 = f5;
                        iwVar3 = iwVar2;
                    } else {
                        kk0Var.X();
                        if ((i & 1) != 0) {
                            if (i5 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i7 != 0) {
                                jE = xr0.E();
                            } else {
                                jE = j;
                            }
                            if ((i3 & 16) != 0) {
                                rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                                i4 &= -57345;
                            } else {
                                rb3VarRememberScrollState = rb3Var;
                            }
                            if (i9 != 0) {
                                ux2Var2 = a;
                            }
                            if ((i3 & 64) != 0) {
                                shape = ic2.a.getShape(kk0Var, 6);
                                i4 &= -3670017;
                            }
                            if ((i3 & Uuid.SIZE_BITS) != 0) {
                                containerColor = ic2.a.getContainerColor(kk0Var, 6);
                                i4 &= -29360129;
                            } else {
                                containerColor = j3;
                            }
                            if (i11 != 0) {
                                ic2 ic2Var1111111115 = ic2.a;
                                f4 = 0.0f;
                            } else {
                                f4 = f3;
                            }
                            if (i13 != 0) {
                                ic2 ic2Var1111111116 = ic2.a;
                                f5 = 3.0f;
                            } else {
                                f5 = f2;
                            }
                            if (i15 != 0) {
                                iwVar2 = null;
                            } else {
                                iwVar2 = iwVar;
                            }
                            rb3Var2 = rb3VarRememberScrollState;
                        } else {
                            if (i5 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i7 != 0) {
                                jE = xr0.E();
                            } else {
                                jE = j;
                            }
                            if ((i3 & 16) != 0) {
                                rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                                i4 &= -57345;
                            } else {
                                rb3VarRememberScrollState = rb3Var;
                            }
                            if (i9 != 0) {
                                ux2Var2 = a;
                            }
                            if ((i3 & 64) != 0) {
                                shape = ic2.a.getShape(kk0Var, 6);
                                i4 &= -3670017;
                            }
                            if ((i3 & Uuid.SIZE_BITS) != 0) {
                                containerColor = ic2.a.getContainerColor(kk0Var, 6);
                                i4 &= -29360129;
                            } else {
                                containerColor = j3;
                            }
                            if (i11 != 0) {
                                ic2 ic2Var1111111117 = ic2.a;
                                f4 = 0.0f;
                            } else {
                                f4 = f3;
                            }
                            if (i13 != 0) {
                                ic2 ic2Var1111111118 = ic2.a;
                                f5 = 3.0f;
                            } else {
                                f5 = f2;
                            }
                            if (i15 != 0) {
                                iwVar2 = null;
                            } else {
                                iwVar2 = iwVar;
                            }
                            rb3Var2 = rb3VarRememberScrollState;
                        }
                        kk0Var.s();
                        objP = kk0Var.P();
                        if (objP == Composer$Companion.getEmpty()) {
                            objP = new ni2(Boolean.FALSE);
                            kk0Var.l0(objP);
                        }
                        ni2Var = (ni2) objP;
                        ni2Var.c.setValue(Boolean.valueOf(z));
                        if (((Boolean) ni2Var.b.getValue()).booleanValue()) {
                            objP2 = kk0Var.P();
                            if (objP2 == Composer$Companion.getEmpty()) {
                                objP2 = cl3.d(new e54(e54.b));
                                kk0Var.l0(objP2);
                            }
                            mi2Var = (mi2) objP2;
                            wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                            if ((i4 & 7168) == 2048) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            zH = z2 | kk0Var.h(wu0Var);
                            objP3 = kk0Var.P();
                            if (zH) {
                                z3 = true;
                                objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                                kk0Var.l0(objP3);
                            } else {
                                z3 = true;
                                objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                                kk0Var.l0(objP3);
                            }
                            yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                        } else {
                            objP2 = kk0Var.P();
                            if (objP2 == Composer$Companion.getEmpty()) {
                                objP2 = cl3.d(new e54(e54.b));
                                kk0Var.l0(objP2);
                            }
                            mi2Var = (mi2) objP2;
                            wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                            if ((i4 & 7168) == 2048) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            zH = z2 | kk0Var.h(wu0Var);
                            objP3 = kk0Var.P();
                            if (zH) {
                                z3 = true;
                                objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                                kk0Var.l0(objP3);
                            } else {
                                z3 = true;
                                objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                                kk0Var.l0(objP3);
                            }
                            yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                        }
                        ux2Var3 = ux2Var2;
                        j4 = jE;
                        cVar4 = cVar3;
                        rb3Var3 = rb3Var2;
                        rg3Var2 = shape;
                        j5 = containerColor;
                        f6 = f4;
                        f7 = f5;
                        iwVar3 = iwVar2;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new vb(z, je1Var, cVar4, j4, rb3Var3, ux2Var3, rg3Var2, j5, f6, f7, iwVar3, oe1Var, i, i2, i3));
                    }
                }
                i16 |= 48;
                if ((i4 & 306783379) != 306783378) {
                    kk0Var.X();
                    if ((i & 1) != 0) {
                        if (i5 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i7 != 0) {
                            jE = xr0.E();
                        } else {
                            jE = j;
                        }
                        if ((i3 & 16) != 0) {
                            rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                            i4 &= -57345;
                        } else {
                            rb3VarRememberScrollState = rb3Var;
                        }
                        if (i9 != 0) {
                            ux2Var2 = a;
                        }
                        if ((i3 & 64) != 0) {
                            shape = ic2.a.getShape(kk0Var, 6);
                            i4 &= -3670017;
                        }
                        if ((i3 & Uuid.SIZE_BITS) != 0) {
                            containerColor = ic2.a.getContainerColor(kk0Var, 6);
                            i4 &= -29360129;
                        } else {
                            containerColor = j3;
                        }
                        if (i11 != 0) {
                            ic2 ic2Var1111111119 = ic2.a;
                            f4 = 0.0f;
                        } else {
                            f4 = f3;
                        }
                        if (i13 != 0) {
                            ic2 ic2Var11111111110 = ic2.a;
                            f5 = 3.0f;
                        } else {
                            f5 = f2;
                        }
                        if (i15 != 0) {
                            iwVar2 = null;
                        } else {
                            iwVar2 = iwVar;
                        }
                        rb3Var2 = rb3VarRememberScrollState;
                    } else {
                        if (i5 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i7 != 0) {
                            jE = xr0.E();
                        } else {
                            jE = j;
                        }
                        if ((i3 & 16) != 0) {
                            rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                            i4 &= -57345;
                        } else {
                            rb3VarRememberScrollState = rb3Var;
                        }
                        if (i9 != 0) {
                            ux2Var2 = a;
                        }
                        if ((i3 & 64) != 0) {
                            shape = ic2.a.getShape(kk0Var, 6);
                            i4 &= -3670017;
                        }
                        if ((i3 & Uuid.SIZE_BITS) != 0) {
                            containerColor = ic2.a.getContainerColor(kk0Var, 6);
                            i4 &= -29360129;
                        } else {
                            containerColor = j3;
                        }
                        if (i11 != 0) {
                            ic2 ic2Var11111111111 = ic2.a;
                            f4 = 0.0f;
                        } else {
                            f4 = f3;
                        }
                        if (i13 != 0) {
                            ic2 ic2Var11111111112 = ic2.a;
                            f5 = 3.0f;
                        } else {
                            f5 = f2;
                        }
                        if (i15 != 0) {
                            iwVar2 = null;
                        } else {
                            iwVar2 = iwVar;
                        }
                        rb3Var2 = rb3VarRememberScrollState;
                    }
                    kk0Var.s();
                    objP = kk0Var.P();
                    if (objP == Composer$Companion.getEmpty()) {
                        objP = new ni2(Boolean.FALSE);
                        kk0Var.l0(objP);
                    }
                    ni2Var = (ni2) objP;
                    ni2Var.c.setValue(Boolean.valueOf(z));
                    if (((Boolean) ni2Var.b.getValue()).booleanValue()) {
                        objP2 = kk0Var.P();
                        if (objP2 == Composer$Companion.getEmpty()) {
                            objP2 = cl3.d(new e54(e54.b));
                            kk0Var.l0(objP2);
                        }
                        mi2Var = (mi2) objP2;
                        wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                        if ((i4 & 7168) == 2048) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        zH = z2 | kk0Var.h(wu0Var);
                        objP3 = kk0Var.P();
                        if (zH) {
                            z3 = true;
                            objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                            kk0Var.l0(objP3);
                        } else {
                            z3 = true;
                            objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                            kk0Var.l0(objP3);
                        }
                        yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                    } else {
                        objP2 = kk0Var.P();
                        if (objP2 == Composer$Companion.getEmpty()) {
                            objP2 = cl3.d(new e54(e54.b));
                            kk0Var.l0(objP2);
                        }
                        mi2Var = (mi2) objP2;
                        wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                        if ((i4 & 7168) == 2048) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        zH = z2 | kk0Var.h(wu0Var);
                        objP3 = kk0Var.P();
                        if (zH) {
                            z3 = true;
                            objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                            kk0Var.l0(objP3);
                        } else {
                            z3 = true;
                            objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                            kk0Var.l0(objP3);
                        }
                        yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                    }
                    ux2Var3 = ux2Var2;
                    j4 = jE;
                    cVar4 = cVar3;
                    rb3Var3 = rb3Var2;
                    rg3Var2 = shape;
                    j5 = containerColor;
                    f6 = f4;
                    f7 = f5;
                    iwVar3 = iwVar2;
                } else {
                    kk0Var.X();
                    if ((i & 1) != 0) {
                        if (i5 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i7 != 0) {
                            jE = xr0.E();
                        } else {
                            jE = j;
                        }
                        if ((i3 & 16) != 0) {
                            rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                            i4 &= -57345;
                        } else {
                            rb3VarRememberScrollState = rb3Var;
                        }
                        if (i9 != 0) {
                            ux2Var2 = a;
                        }
                        if ((i3 & 64) != 0) {
                            shape = ic2.a.getShape(kk0Var, 6);
                            i4 &= -3670017;
                        }
                        if ((i3 & Uuid.SIZE_BITS) != 0) {
                            containerColor = ic2.a.getContainerColor(kk0Var, 6);
                            i4 &= -29360129;
                        } else {
                            containerColor = j3;
                        }
                        if (i11 != 0) {
                            ic2 ic2Var11111111113 = ic2.a;
                            f4 = 0.0f;
                        } else {
                            f4 = f3;
                        }
                        if (i13 != 0) {
                            ic2 ic2Var11111111114 = ic2.a;
                            f5 = 3.0f;
                        } else {
                            f5 = f2;
                        }
                        if (i15 != 0) {
                            iwVar2 = null;
                        } else {
                            iwVar2 = iwVar;
                        }
                        rb3Var2 = rb3VarRememberScrollState;
                    } else {
                        if (i5 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i7 != 0) {
                            jE = xr0.E();
                        } else {
                            jE = j;
                        }
                        if ((i3 & 16) != 0) {
                            rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                            i4 &= -57345;
                        } else {
                            rb3VarRememberScrollState = rb3Var;
                        }
                        if (i9 != 0) {
                            ux2Var2 = a;
                        }
                        if ((i3 & 64) != 0) {
                            shape = ic2.a.getShape(kk0Var, 6);
                            i4 &= -3670017;
                        }
                        if ((i3 & Uuid.SIZE_BITS) != 0) {
                            containerColor = ic2.a.getContainerColor(kk0Var, 6);
                            i4 &= -29360129;
                        } else {
                            containerColor = j3;
                        }
                        if (i11 != 0) {
                            ic2 ic2Var11111111115 = ic2.a;
                            f4 = 0.0f;
                        } else {
                            f4 = f3;
                        }
                        if (i13 != 0) {
                            ic2 ic2Var11111111116 = ic2.a;
                            f5 = 3.0f;
                        } else {
                            f5 = f2;
                        }
                        if (i15 != 0) {
                            iwVar2 = null;
                        } else {
                            iwVar2 = iwVar;
                        }
                        rb3Var2 = rb3VarRememberScrollState;
                    }
                    kk0Var.s();
                    objP = kk0Var.P();
                    if (objP == Composer$Companion.getEmpty()) {
                        objP = new ni2(Boolean.FALSE);
                        kk0Var.l0(objP);
                    }
                    ni2Var = (ni2) objP;
                    ni2Var.c.setValue(Boolean.valueOf(z));
                    if (((Boolean) ni2Var.b.getValue()).booleanValue()) {
                        objP2 = kk0Var.P();
                        if (objP2 == Composer$Companion.getEmpty()) {
                            objP2 = cl3.d(new e54(e54.b));
                            kk0Var.l0(objP2);
                        }
                        mi2Var = (mi2) objP2;
                        wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                        if ((i4 & 7168) == 2048) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        zH = z2 | kk0Var.h(wu0Var);
                        objP3 = kk0Var.P();
                        if (zH) {
                            z3 = true;
                            objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                            kk0Var.l0(objP3);
                        } else {
                            z3 = true;
                            objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                            kk0Var.l0(objP3);
                        }
                        yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                    } else {
                        objP2 = kk0Var.P();
                        if (objP2 == Composer$Companion.getEmpty()) {
                            objP2 = cl3.d(new e54(e54.b));
                            kk0Var.l0(objP2);
                        }
                        mi2Var = (mi2) objP2;
                        wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                        if ((i4 & 7168) == 2048) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        zH = z2 | kk0Var.h(wu0Var);
                        objP3 = kk0Var.P();
                        if (zH) {
                            z3 = true;
                            objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                            kk0Var.l0(objP3);
                        } else {
                            z3 = true;
                            objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                            kk0Var.l0(objP3);
                        }
                        yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                    }
                    ux2Var3 = ux2Var2;
                    j4 = jE;
                    cVar4 = cVar3;
                    rb3Var3 = rb3Var2;
                    rg3Var2 = shape;
                    j5 = containerColor;
                    f6 = f4;
                    f7 = f5;
                    iwVar3 = iwVar2;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new vb(z, je1Var, cVar4, j4, rb3Var3, ux2Var3, rg3Var2, j5, f6, f7, iwVar3, oe1Var, i, i2, i3));
                }
            }
            i4 |= 805306368;
            i15 = i3 & 1024;
            if (i15 != 0) {
                i16 = i2 | 6;
            } else if ((i2 & 6) == 0) {
                if (kk0Var.h(iwVar)) {
                    i17 = 4;
                } else {
                    i17 = 2;
                }
                i16 = i2 | i17;
            } else {
                i16 = i2;
            }
            if ((i3 & 2048) != 0) {
                if ((i2 & 48) == 0) {
                    if (kk0Var.j(oe1Var)) {
                        i18 = 32;
                    } else {
                        i18 = 16;
                    }
                    i16 |= i18;
                }
                if ((i4 & 306783379) != 306783378) {
                    kk0Var.X();
                    if ((i & 1) != 0) {
                        if (i5 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i7 != 0) {
                            jE = xr0.E();
                        } else {
                            jE = j;
                        }
                        if ((i3 & 16) != 0) {
                            rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                            i4 &= -57345;
                        } else {
                            rb3VarRememberScrollState = rb3Var;
                        }
                        if (i9 != 0) {
                            ux2Var2 = a;
                        }
                        if ((i3 & 64) != 0) {
                            shape = ic2.a.getShape(kk0Var, 6);
                            i4 &= -3670017;
                        }
                        if ((i3 & Uuid.SIZE_BITS) != 0) {
                            containerColor = ic2.a.getContainerColor(kk0Var, 6);
                            i4 &= -29360129;
                        } else {
                            containerColor = j3;
                        }
                        if (i11 != 0) {
                            ic2 ic2Var11111111117 = ic2.a;
                            f4 = 0.0f;
                        } else {
                            f4 = f3;
                        }
                        if (i13 != 0) {
                            ic2 ic2Var11111111118 = ic2.a;
                            f5 = 3.0f;
                        } else {
                            f5 = f2;
                        }
                        if (i15 != 0) {
                            iwVar2 = null;
                        } else {
                            iwVar2 = iwVar;
                        }
                        rb3Var2 = rb3VarRememberScrollState;
                    } else {
                        if (i5 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i7 != 0) {
                            jE = xr0.E();
                        } else {
                            jE = j;
                        }
                        if ((i3 & 16) != 0) {
                            rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                            i4 &= -57345;
                        } else {
                            rb3VarRememberScrollState = rb3Var;
                        }
                        if (i9 != 0) {
                            ux2Var2 = a;
                        }
                        if ((i3 & 64) != 0) {
                            shape = ic2.a.getShape(kk0Var, 6);
                            i4 &= -3670017;
                        }
                        if ((i3 & Uuid.SIZE_BITS) != 0) {
                            containerColor = ic2.a.getContainerColor(kk0Var, 6);
                            i4 &= -29360129;
                        } else {
                            containerColor = j3;
                        }
                        if (i11 != 0) {
                            ic2 ic2Var11111111119 = ic2.a;
                            f4 = 0.0f;
                        } else {
                            f4 = f3;
                        }
                        if (i13 != 0) {
                            ic2 ic2Var111111111110 = ic2.a;
                            f5 = 3.0f;
                        } else {
                            f5 = f2;
                        }
                        if (i15 != 0) {
                            iwVar2 = null;
                        } else {
                            iwVar2 = iwVar;
                        }
                        rb3Var2 = rb3VarRememberScrollState;
                    }
                    kk0Var.s();
                    objP = kk0Var.P();
                    if (objP == Composer$Companion.getEmpty()) {
                        objP = new ni2(Boolean.FALSE);
                        kk0Var.l0(objP);
                    }
                    ni2Var = (ni2) objP;
                    ni2Var.c.setValue(Boolean.valueOf(z));
                    if (((Boolean) ni2Var.b.getValue()).booleanValue()) {
                        objP2 = kk0Var.P();
                        if (objP2 == Composer$Companion.getEmpty()) {
                            objP2 = cl3.d(new e54(e54.b));
                            kk0Var.l0(objP2);
                        }
                        mi2Var = (mi2) objP2;
                        wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                        if ((i4 & 7168) == 2048) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        zH = z2 | kk0Var.h(wu0Var);
                        objP3 = kk0Var.P();
                        if (zH) {
                            z3 = true;
                            objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                            kk0Var.l0(objP3);
                        } else {
                            z3 = true;
                            objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                            kk0Var.l0(objP3);
                        }
                        yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                    } else {
                        objP2 = kk0Var.P();
                        if (objP2 == Composer$Companion.getEmpty()) {
                            objP2 = cl3.d(new e54(e54.b));
                            kk0Var.l0(objP2);
                        }
                        mi2Var = (mi2) objP2;
                        wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                        if ((i4 & 7168) == 2048) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        zH = z2 | kk0Var.h(wu0Var);
                        objP3 = kk0Var.P();
                        if (zH) {
                            z3 = true;
                            objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                            kk0Var.l0(objP3);
                        } else {
                            z3 = true;
                            objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                            kk0Var.l0(objP3);
                        }
                        yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                    }
                    ux2Var3 = ux2Var2;
                    j4 = jE;
                    cVar4 = cVar3;
                    rb3Var3 = rb3Var2;
                    rg3Var2 = shape;
                    j5 = containerColor;
                    f6 = f4;
                    f7 = f5;
                    iwVar3 = iwVar2;
                } else {
                    kk0Var.X();
                    if ((i & 1) != 0) {
                        if (i5 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i7 != 0) {
                            jE = xr0.E();
                        } else {
                            jE = j;
                        }
                        if ((i3 & 16) != 0) {
                            rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                            i4 &= -57345;
                        } else {
                            rb3VarRememberScrollState = rb3Var;
                        }
                        if (i9 != 0) {
                            ux2Var2 = a;
                        }
                        if ((i3 & 64) != 0) {
                            shape = ic2.a.getShape(kk0Var, 6);
                            i4 &= -3670017;
                        }
                        if ((i3 & Uuid.SIZE_BITS) != 0) {
                            containerColor = ic2.a.getContainerColor(kk0Var, 6);
                            i4 &= -29360129;
                        } else {
                            containerColor = j3;
                        }
                        if (i11 != 0) {
                            ic2 ic2Var111111111111 = ic2.a;
                            f4 = 0.0f;
                        } else {
                            f4 = f3;
                        }
                        if (i13 != 0) {
                            ic2 ic2Var111111111112 = ic2.a;
                            f5 = 3.0f;
                        } else {
                            f5 = f2;
                        }
                        if (i15 != 0) {
                            iwVar2 = null;
                        } else {
                            iwVar2 = iwVar;
                        }
                        rb3Var2 = rb3VarRememberScrollState;
                    } else {
                        if (i5 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i7 != 0) {
                            jE = xr0.E();
                        } else {
                            jE = j;
                        }
                        if ((i3 & 16) != 0) {
                            rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                            i4 &= -57345;
                        } else {
                            rb3VarRememberScrollState = rb3Var;
                        }
                        if (i9 != 0) {
                            ux2Var2 = a;
                        }
                        if ((i3 & 64) != 0) {
                            shape = ic2.a.getShape(kk0Var, 6);
                            i4 &= -3670017;
                        }
                        if ((i3 & Uuid.SIZE_BITS) != 0) {
                            containerColor = ic2.a.getContainerColor(kk0Var, 6);
                            i4 &= -29360129;
                        } else {
                            containerColor = j3;
                        }
                        if (i11 != 0) {
                            ic2 ic2Var111111111113 = ic2.a;
                            f4 = 0.0f;
                        } else {
                            f4 = f3;
                        }
                        if (i13 != 0) {
                            ic2 ic2Var111111111114 = ic2.a;
                            f5 = 3.0f;
                        } else {
                            f5 = f2;
                        }
                        if (i15 != 0) {
                            iwVar2 = null;
                        } else {
                            iwVar2 = iwVar;
                        }
                        rb3Var2 = rb3VarRememberScrollState;
                    }
                    kk0Var.s();
                    objP = kk0Var.P();
                    if (objP == Composer$Companion.getEmpty()) {
                        objP = new ni2(Boolean.FALSE);
                        kk0Var.l0(objP);
                    }
                    ni2Var = (ni2) objP;
                    ni2Var.c.setValue(Boolean.valueOf(z));
                    if (((Boolean) ni2Var.b.getValue()).booleanValue()) {
                        objP2 = kk0Var.P();
                        if (objP2 == Composer$Companion.getEmpty()) {
                            objP2 = cl3.d(new e54(e54.b));
                            kk0Var.l0(objP2);
                        }
                        mi2Var = (mi2) objP2;
                        wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                        if ((i4 & 7168) == 2048) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        zH = z2 | kk0Var.h(wu0Var);
                        objP3 = kk0Var.P();
                        if (zH) {
                            z3 = true;
                            objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                            kk0Var.l0(objP3);
                        } else {
                            z3 = true;
                            objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                            kk0Var.l0(objP3);
                        }
                        yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                    } else {
                        objP2 = kk0Var.P();
                        if (objP2 == Composer$Companion.getEmpty()) {
                            objP2 = cl3.d(new e54(e54.b));
                            kk0Var.l0(objP2);
                        }
                        mi2Var = (mi2) objP2;
                        wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                        if ((i4 & 7168) == 2048) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        zH = z2 | kk0Var.h(wu0Var);
                        objP3 = kk0Var.P();
                        if (zH) {
                            z3 = true;
                            objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                            kk0Var.l0(objP3);
                        } else {
                            z3 = true;
                            objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                            kk0Var.l0(objP3);
                        }
                        yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                    }
                    ux2Var3 = ux2Var2;
                    j4 = jE;
                    cVar4 = cVar3;
                    rb3Var3 = rb3Var2;
                    rg3Var2 = shape;
                    j5 = containerColor;
                    f6 = f4;
                    f7 = f5;
                    iwVar3 = iwVar2;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new vb(z, je1Var, cVar4, j4, rb3Var3, ux2Var3, rg3Var2, j5, f6, f7, iwVar3, oe1Var, i, i2, i3));
                }
            }
            i16 |= 48;
            if ((i4 & 306783379) != 306783378) {
                kk0Var.X();
                if ((i & 1) != 0) {
                    if (i5 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i7 != 0) {
                        jE = xr0.E();
                    } else {
                        jE = j;
                    }
                    if ((i3 & 16) != 0) {
                        rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                        i4 &= -57345;
                    } else {
                        rb3VarRememberScrollState = rb3Var;
                    }
                    if (i9 != 0) {
                        ux2Var2 = a;
                    }
                    if ((i3 & 64) != 0) {
                        shape = ic2.a.getShape(kk0Var, 6);
                        i4 &= -3670017;
                    }
                    if ((i3 & Uuid.SIZE_BITS) != 0) {
                        containerColor = ic2.a.getContainerColor(kk0Var, 6);
                        i4 &= -29360129;
                    } else {
                        containerColor = j3;
                    }
                    if (i11 != 0) {
                        ic2 ic2Var111111111115 = ic2.a;
                        f4 = 0.0f;
                    } else {
                        f4 = f3;
                    }
                    if (i13 != 0) {
                        ic2 ic2Var111111111116 = ic2.a;
                        f5 = 3.0f;
                    } else {
                        f5 = f2;
                    }
                    if (i15 != 0) {
                        iwVar2 = null;
                    } else {
                        iwVar2 = iwVar;
                    }
                    rb3Var2 = rb3VarRememberScrollState;
                } else {
                    if (i5 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i7 != 0) {
                        jE = xr0.E();
                    } else {
                        jE = j;
                    }
                    if ((i3 & 16) != 0) {
                        rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                        i4 &= -57345;
                    } else {
                        rb3VarRememberScrollState = rb3Var;
                    }
                    if (i9 != 0) {
                        ux2Var2 = a;
                    }
                    if ((i3 & 64) != 0) {
                        shape = ic2.a.getShape(kk0Var, 6);
                        i4 &= -3670017;
                    }
                    if ((i3 & Uuid.SIZE_BITS) != 0) {
                        containerColor = ic2.a.getContainerColor(kk0Var, 6);
                        i4 &= -29360129;
                    } else {
                        containerColor = j3;
                    }
                    if (i11 != 0) {
                        ic2 ic2Var111111111117 = ic2.a;
                        f4 = 0.0f;
                    } else {
                        f4 = f3;
                    }
                    if (i13 != 0) {
                        ic2 ic2Var111111111118 = ic2.a;
                        f5 = 3.0f;
                    } else {
                        f5 = f2;
                    }
                    if (i15 != 0) {
                        iwVar2 = null;
                    } else {
                        iwVar2 = iwVar;
                    }
                    rb3Var2 = rb3VarRememberScrollState;
                }
                kk0Var.s();
                objP = kk0Var.P();
                if (objP == Composer$Companion.getEmpty()) {
                    objP = new ni2(Boolean.FALSE);
                    kk0Var.l0(objP);
                }
                ni2Var = (ni2) objP;
                ni2Var.c.setValue(Boolean.valueOf(z));
                if (((Boolean) ni2Var.b.getValue()).booleanValue()) {
                    objP2 = kk0Var.P();
                    if (objP2 == Composer$Companion.getEmpty()) {
                        objP2 = cl3.d(new e54(e54.b));
                        kk0Var.l0(objP2);
                    }
                    mi2Var = (mi2) objP2;
                    wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                    if ((i4 & 7168) == 2048) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    zH = z2 | kk0Var.h(wu0Var);
                    objP3 = kk0Var.P();
                    if (zH) {
                        z3 = true;
                        objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                        kk0Var.l0(objP3);
                    } else {
                        z3 = true;
                        objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                        kk0Var.l0(objP3);
                    }
                    yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                } else {
                    objP2 = kk0Var.P();
                    if (objP2 == Composer$Companion.getEmpty()) {
                        objP2 = cl3.d(new e54(e54.b));
                        kk0Var.l0(objP2);
                    }
                    mi2Var = (mi2) objP2;
                    wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                    if ((i4 & 7168) == 2048) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    zH = z2 | kk0Var.h(wu0Var);
                    objP3 = kk0Var.P();
                    if (zH) {
                        z3 = true;
                        objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                        kk0Var.l0(objP3);
                    } else {
                        z3 = true;
                        objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                        kk0Var.l0(objP3);
                    }
                    yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                }
                ux2Var3 = ux2Var2;
                j4 = jE;
                cVar4 = cVar3;
                rb3Var3 = rb3Var2;
                rg3Var2 = shape;
                j5 = containerColor;
                f6 = f4;
                f7 = f5;
                iwVar3 = iwVar2;
            } else {
                kk0Var.X();
                if ((i & 1) != 0) {
                    if (i5 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i7 != 0) {
                        jE = xr0.E();
                    } else {
                        jE = j;
                    }
                    if ((i3 & 16) != 0) {
                        rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                        i4 &= -57345;
                    } else {
                        rb3VarRememberScrollState = rb3Var;
                    }
                    if (i9 != 0) {
                        ux2Var2 = a;
                    }
                    if ((i3 & 64) != 0) {
                        shape = ic2.a.getShape(kk0Var, 6);
                        i4 &= -3670017;
                    }
                    if ((i3 & Uuid.SIZE_BITS) != 0) {
                        containerColor = ic2.a.getContainerColor(kk0Var, 6);
                        i4 &= -29360129;
                    } else {
                        containerColor = j3;
                    }
                    if (i11 != 0) {
                        ic2 ic2Var111111111119 = ic2.a;
                        f4 = 0.0f;
                    } else {
                        f4 = f3;
                    }
                    if (i13 != 0) {
                        ic2 ic2Var1111111111110 = ic2.a;
                        f5 = 3.0f;
                    } else {
                        f5 = f2;
                    }
                    if (i15 != 0) {
                        iwVar2 = null;
                    } else {
                        iwVar2 = iwVar;
                    }
                    rb3Var2 = rb3VarRememberScrollState;
                } else {
                    if (i5 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i7 != 0) {
                        jE = xr0.E();
                    } else {
                        jE = j;
                    }
                    if ((i3 & 16) != 0) {
                        rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                        i4 &= -57345;
                    } else {
                        rb3VarRememberScrollState = rb3Var;
                    }
                    if (i9 != 0) {
                        ux2Var2 = a;
                    }
                    if ((i3 & 64) != 0) {
                        shape = ic2.a.getShape(kk0Var, 6);
                        i4 &= -3670017;
                    }
                    if ((i3 & Uuid.SIZE_BITS) != 0) {
                        containerColor = ic2.a.getContainerColor(kk0Var, 6);
                        i4 &= -29360129;
                    } else {
                        containerColor = j3;
                    }
                    if (i11 != 0) {
                        ic2 ic2Var1111111111111 = ic2.a;
                        f4 = 0.0f;
                    } else {
                        f4 = f3;
                    }
                    if (i13 != 0) {
                        ic2 ic2Var1111111111112 = ic2.a;
                        f5 = 3.0f;
                    } else {
                        f5 = f2;
                    }
                    if (i15 != 0) {
                        iwVar2 = null;
                    } else {
                        iwVar2 = iwVar;
                    }
                    rb3Var2 = rb3VarRememberScrollState;
                }
                kk0Var.s();
                objP = kk0Var.P();
                if (objP == Composer$Companion.getEmpty()) {
                    objP = new ni2(Boolean.FALSE);
                    kk0Var.l0(objP);
                }
                ni2Var = (ni2) objP;
                ni2Var.c.setValue(Boolean.valueOf(z));
                if (((Boolean) ni2Var.b.getValue()).booleanValue()) {
                    objP2 = kk0Var.P();
                    if (objP2 == Composer$Companion.getEmpty()) {
                        objP2 = cl3.d(new e54(e54.b));
                        kk0Var.l0(objP2);
                    }
                    mi2Var = (mi2) objP2;
                    wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                    if ((i4 & 7168) == 2048) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    zH = z2 | kk0Var.h(wu0Var);
                    objP3 = kk0Var.P();
                    if (zH) {
                        z3 = true;
                        objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                        kk0Var.l0(objP3);
                    } else {
                        z3 = true;
                        objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                        kk0Var.l0(objP3);
                    }
                    yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                } else {
                    objP2 = kk0Var.P();
                    if (objP2 == Composer$Companion.getEmpty()) {
                        objP2 = cl3.d(new e54(e54.b));
                        kk0Var.l0(objP2);
                    }
                    mi2Var = (mi2) objP2;
                    wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                    if ((i4 & 7168) == 2048) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    zH = z2 | kk0Var.h(wu0Var);
                    objP3 = kk0Var.P();
                    if (zH) {
                        z3 = true;
                        objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                        kk0Var.l0(objP3);
                    } else {
                        z3 = true;
                        objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                        kk0Var.l0(objP3);
                    }
                    yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                }
                ux2Var3 = ux2Var2;
                j4 = jE;
                cVar4 = cVar3;
                rb3Var3 = rb3Var2;
                rg3Var2 = shape;
                j5 = containerColor;
                f6 = f4;
                f7 = f5;
                iwVar3 = iwVar2;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new vb(z, je1Var, cVar4, j4, rb3Var3, ux2Var3, rg3Var2, j5, f6, f7, iwVar3, oe1Var, i, i2, i3));
            }
        }
        i4 |= 48;
        je1Var2 = je1Var;
        i5 = i3 & 4;
        if (i5 != 0) {
            if ((i & 384) == 0) {
                cVar2 = cVar;
                if (kk0Var.h(cVar2)) {
                    i6 = FontInfo.NUMBER_OF_CHAR_CODES;
                } else {
                    i6 = Uuid.SIZE_BITS;
                }
                i4 |= i6;
            }
            i7 = i3 & 8;
            if (i7 != 0) {
                if ((i & 3072) == 0) {
                    if (kk0Var.g(j)) {
                        i8 = 2048;
                    } else {
                        i8 = 1024;
                    }
                    i4 |= i8;
                }
                if ((i & 24576) != 0) {
                    i4 |= ((i3 & 16) == 0 || !kk0Var.h(rb3Var)) ? ConstantsKt.DEFAULT_BUFFER_SIZE : 16384;
                }
                i9 = i3 & 32;
                if (i9 != 0) {
                    i4 |= 196608;
                    ux2Var2 = ux2Var;
                } else {
                    ux2Var2 = ux2Var;
                    if ((i & 196608) == 0) {
                        if (kk0Var.h(ux2Var2)) {
                            i10 = 131072;
                        } else {
                            i10 = 65536;
                        }
                        i4 |= i10;
                    }
                }
                if ((i & 1572864) == 0) {
                    shape = rg3Var;
                    if ((i3 & 64) == 0) {
                        i20 = 524288;
                    } else {
                        i20 = 524288;
                    }
                    i4 |= i20;
                } else {
                    shape = rg3Var;
                }
                if ((i & 12582912) == 0) {
                    j3 = j2;
                    if ((i3 & Uuid.SIZE_BITS) == 0) {
                        i19 = 4194304;
                    } else {
                        i19 = 4194304;
                    }
                    i4 |= i19;
                } else {
                    j3 = j2;
                }
                i11 = i3 & FontInfo.NUMBER_OF_CHAR_CODES;
                if (i11 != 0) {
                    i4 |= 100663296;
                    f3 = f;
                } else {
                    f3 = f;
                    if ((i & 100663296) == 0) {
                        if (kk0Var.e(f3)) {
                            i12 = 67108864;
                        } else {
                            i12 = 33554432;
                        }
                        i4 |= i12;
                    }
                }
                i13 = i3 & ConstantsKt.MINIMUM_BLOCK_SIZE;
                if (i13 != 0) {
                    if ((i & 805306368) == 0) {
                        if (kk0Var.e(f2)) {
                            i14 = 536870912;
                        } else {
                            i14 = 268435456;
                        }
                        i4 |= i14;
                    }
                    i15 = i3 & 1024;
                    if (i15 != 0) {
                        i16 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        if (kk0Var.h(iwVar)) {
                            i17 = 4;
                        } else {
                            i17 = 2;
                        }
                        i16 = i2 | i17;
                    } else {
                        i16 = i2;
                    }
                    if ((i3 & 2048) != 0) {
                        if ((i2 & 48) == 0) {
                            if (kk0Var.j(oe1Var)) {
                                i18 = 32;
                            } else {
                                i18 = 16;
                            }
                            i16 |= i18;
                        }
                        if ((i4 & 306783379) != 306783378) {
                            kk0Var.X();
                            if ((i & 1) != 0) {
                                if (i5 != 0) {
                                    cVar3 = c.i;
                                } else {
                                    cVar3 = cVar2;
                                }
                                if (i7 != 0) {
                                    jE = xr0.E();
                                } else {
                                    jE = j;
                                }
                                if ((i3 & 16) != 0) {
                                    rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                                    i4 &= -57345;
                                } else {
                                    rb3VarRememberScrollState = rb3Var;
                                }
                                if (i9 != 0) {
                                    ux2Var2 = a;
                                }
                                if ((i3 & 64) != 0) {
                                    shape = ic2.a.getShape(kk0Var, 6);
                                    i4 &= -3670017;
                                }
                                if ((i3 & Uuid.SIZE_BITS) != 0) {
                                    containerColor = ic2.a.getContainerColor(kk0Var, 6);
                                    i4 &= -29360129;
                                } else {
                                    containerColor = j3;
                                }
                                if (i11 != 0) {
                                    ic2 ic2Var1111111111113 = ic2.a;
                                    f4 = 0.0f;
                                } else {
                                    f4 = f3;
                                }
                                if (i13 != 0) {
                                    ic2 ic2Var1111111111114 = ic2.a;
                                    f5 = 3.0f;
                                } else {
                                    f5 = f2;
                                }
                                if (i15 != 0) {
                                    iwVar2 = null;
                                } else {
                                    iwVar2 = iwVar;
                                }
                                rb3Var2 = rb3VarRememberScrollState;
                            } else {
                                if (i5 != 0) {
                                    cVar3 = c.i;
                                } else {
                                    cVar3 = cVar2;
                                }
                                if (i7 != 0) {
                                    jE = xr0.E();
                                } else {
                                    jE = j;
                                }
                                if ((i3 & 16) != 0) {
                                    rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                                    i4 &= -57345;
                                } else {
                                    rb3VarRememberScrollState = rb3Var;
                                }
                                if (i9 != 0) {
                                    ux2Var2 = a;
                                }
                                if ((i3 & 64) != 0) {
                                    shape = ic2.a.getShape(kk0Var, 6);
                                    i4 &= -3670017;
                                }
                                if ((i3 & Uuid.SIZE_BITS) != 0) {
                                    containerColor = ic2.a.getContainerColor(kk0Var, 6);
                                    i4 &= -29360129;
                                } else {
                                    containerColor = j3;
                                }
                                if (i11 != 0) {
                                    ic2 ic2Var1111111111115 = ic2.a;
                                    f4 = 0.0f;
                                } else {
                                    f4 = f3;
                                }
                                if (i13 != 0) {
                                    ic2 ic2Var1111111111116 = ic2.a;
                                    f5 = 3.0f;
                                } else {
                                    f5 = f2;
                                }
                                if (i15 != 0) {
                                    iwVar2 = null;
                                } else {
                                    iwVar2 = iwVar;
                                }
                                rb3Var2 = rb3VarRememberScrollState;
                            }
                            kk0Var.s();
                            objP = kk0Var.P();
                            if (objP == Composer$Companion.getEmpty()) {
                                objP = new ni2(Boolean.FALSE);
                                kk0Var.l0(objP);
                            }
                            ni2Var = (ni2) objP;
                            ni2Var.c.setValue(Boolean.valueOf(z));
                            if (((Boolean) ni2Var.b.getValue()).booleanValue()) {
                                objP2 = kk0Var.P();
                                if (objP2 == Composer$Companion.getEmpty()) {
                                    objP2 = cl3.d(new e54(e54.b));
                                    kk0Var.l0(objP2);
                                }
                                mi2Var = (mi2) objP2;
                                wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                                if ((i4 & 7168) == 2048) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                zH = z2 | kk0Var.h(wu0Var);
                                objP3 = kk0Var.P();
                                if (zH) {
                                    z3 = true;
                                    objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                                    kk0Var.l0(objP3);
                                } else {
                                    z3 = true;
                                    objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                                    kk0Var.l0(objP3);
                                }
                                yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                            } else {
                                objP2 = kk0Var.P();
                                if (objP2 == Composer$Companion.getEmpty()) {
                                    objP2 = cl3.d(new e54(e54.b));
                                    kk0Var.l0(objP2);
                                }
                                mi2Var = (mi2) objP2;
                                wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                                if ((i4 & 7168) == 2048) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                zH = z2 | kk0Var.h(wu0Var);
                                objP3 = kk0Var.P();
                                if (zH) {
                                    z3 = true;
                                    objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                                    kk0Var.l0(objP3);
                                } else {
                                    z3 = true;
                                    objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                                    kk0Var.l0(objP3);
                                }
                                yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                            }
                            ux2Var3 = ux2Var2;
                            j4 = jE;
                            cVar4 = cVar3;
                            rb3Var3 = rb3Var2;
                            rg3Var2 = shape;
                            j5 = containerColor;
                            f6 = f4;
                            f7 = f5;
                            iwVar3 = iwVar2;
                        } else {
                            kk0Var.X();
                            if ((i & 1) != 0) {
                                if (i5 != 0) {
                                    cVar3 = c.i;
                                } else {
                                    cVar3 = cVar2;
                                }
                                if (i7 != 0) {
                                    jE = xr0.E();
                                } else {
                                    jE = j;
                                }
                                if ((i3 & 16) != 0) {
                                    rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                                    i4 &= -57345;
                                } else {
                                    rb3VarRememberScrollState = rb3Var;
                                }
                                if (i9 != 0) {
                                    ux2Var2 = a;
                                }
                                if ((i3 & 64) != 0) {
                                    shape = ic2.a.getShape(kk0Var, 6);
                                    i4 &= -3670017;
                                }
                                if ((i3 & Uuid.SIZE_BITS) != 0) {
                                    containerColor = ic2.a.getContainerColor(kk0Var, 6);
                                    i4 &= -29360129;
                                } else {
                                    containerColor = j3;
                                }
                                if (i11 != 0) {
                                    ic2 ic2Var1111111111117 = ic2.a;
                                    f4 = 0.0f;
                                } else {
                                    f4 = f3;
                                }
                                if (i13 != 0) {
                                    ic2 ic2Var1111111111118 = ic2.a;
                                    f5 = 3.0f;
                                } else {
                                    f5 = f2;
                                }
                                if (i15 != 0) {
                                    iwVar2 = null;
                                } else {
                                    iwVar2 = iwVar;
                                }
                                rb3Var2 = rb3VarRememberScrollState;
                            } else {
                                if (i5 != 0) {
                                    cVar3 = c.i;
                                } else {
                                    cVar3 = cVar2;
                                }
                                if (i7 != 0) {
                                    jE = xr0.E();
                                } else {
                                    jE = j;
                                }
                                if ((i3 & 16) != 0) {
                                    rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                                    i4 &= -57345;
                                } else {
                                    rb3VarRememberScrollState = rb3Var;
                                }
                                if (i9 != 0) {
                                    ux2Var2 = a;
                                }
                                if ((i3 & 64) != 0) {
                                    shape = ic2.a.getShape(kk0Var, 6);
                                    i4 &= -3670017;
                                }
                                if ((i3 & Uuid.SIZE_BITS) != 0) {
                                    containerColor = ic2.a.getContainerColor(kk0Var, 6);
                                    i4 &= -29360129;
                                } else {
                                    containerColor = j3;
                                }
                                if (i11 != 0) {
                                    ic2 ic2Var1111111111119 = ic2.a;
                                    f4 = 0.0f;
                                } else {
                                    f4 = f3;
                                }
                                if (i13 != 0) {
                                    ic2 ic2Var11111111111110 = ic2.a;
                                    f5 = 3.0f;
                                } else {
                                    f5 = f2;
                                }
                                if (i15 != 0) {
                                    iwVar2 = null;
                                } else {
                                    iwVar2 = iwVar;
                                }
                                rb3Var2 = rb3VarRememberScrollState;
                            }
                            kk0Var.s();
                            objP = kk0Var.P();
                            if (objP == Composer$Companion.getEmpty()) {
                                objP = new ni2(Boolean.FALSE);
                                kk0Var.l0(objP);
                            }
                            ni2Var = (ni2) objP;
                            ni2Var.c.setValue(Boolean.valueOf(z));
                            if (((Boolean) ni2Var.b.getValue()).booleanValue()) {
                                objP2 = kk0Var.P();
                                if (objP2 == Composer$Companion.getEmpty()) {
                                    objP2 = cl3.d(new e54(e54.b));
                                    kk0Var.l0(objP2);
                                }
                                mi2Var = (mi2) objP2;
                                wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                                if ((i4 & 7168) == 2048) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                zH = z2 | kk0Var.h(wu0Var);
                                objP3 = kk0Var.P();
                                if (zH) {
                                    z3 = true;
                                    objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                                    kk0Var.l0(objP3);
                                } else {
                                    z3 = true;
                                    objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                                    kk0Var.l0(objP3);
                                }
                                yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                            } else {
                                objP2 = kk0Var.P();
                                if (objP2 == Composer$Companion.getEmpty()) {
                                    objP2 = cl3.d(new e54(e54.b));
                                    kk0Var.l0(objP2);
                                }
                                mi2Var = (mi2) objP2;
                                wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                                if ((i4 & 7168) == 2048) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                zH = z2 | kk0Var.h(wu0Var);
                                objP3 = kk0Var.P();
                                if (zH) {
                                    z3 = true;
                                    objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                                    kk0Var.l0(objP3);
                                } else {
                                    z3 = true;
                                    objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                                    kk0Var.l0(objP3);
                                }
                                yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                            }
                            ux2Var3 = ux2Var2;
                            j4 = jE;
                            cVar4 = cVar3;
                            rb3Var3 = rb3Var2;
                            rg3Var2 = shape;
                            j5 = containerColor;
                            f6 = f4;
                            f7 = f5;
                            iwVar3 = iwVar2;
                        }
                        w33VarV = kk0Var.v();
                        if (w33VarV != null) {
                            w33VarV.updateScope(new vb(z, je1Var, cVar4, j4, rb3Var3, ux2Var3, rg3Var2, j5, f6, f7, iwVar3, oe1Var, i, i2, i3));
                        }
                    }
                    i16 |= 48;
                    if ((i4 & 306783379) != 306783378) {
                        kk0Var.X();
                        if ((i & 1) != 0) {
                            if (i5 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i7 != 0) {
                                jE = xr0.E();
                            } else {
                                jE = j;
                            }
                            if ((i3 & 16) != 0) {
                                rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                                i4 &= -57345;
                            } else {
                                rb3VarRememberScrollState = rb3Var;
                            }
                            if (i9 != 0) {
                                ux2Var2 = a;
                            }
                            if ((i3 & 64) != 0) {
                                shape = ic2.a.getShape(kk0Var, 6);
                                i4 &= -3670017;
                            }
                            if ((i3 & Uuid.SIZE_BITS) != 0) {
                                containerColor = ic2.a.getContainerColor(kk0Var, 6);
                                i4 &= -29360129;
                            } else {
                                containerColor = j3;
                            }
                            if (i11 != 0) {
                                ic2 ic2Var11111111111111 = ic2.a;
                                f4 = 0.0f;
                            } else {
                                f4 = f3;
                            }
                            if (i13 != 0) {
                                ic2 ic2Var11111111111112 = ic2.a;
                                f5 = 3.0f;
                            } else {
                                f5 = f2;
                            }
                            if (i15 != 0) {
                                iwVar2 = null;
                            } else {
                                iwVar2 = iwVar;
                            }
                            rb3Var2 = rb3VarRememberScrollState;
                        } else {
                            if (i5 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i7 != 0) {
                                jE = xr0.E();
                            } else {
                                jE = j;
                            }
                            if ((i3 & 16) != 0) {
                                rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                                i4 &= -57345;
                            } else {
                                rb3VarRememberScrollState = rb3Var;
                            }
                            if (i9 != 0) {
                                ux2Var2 = a;
                            }
                            if ((i3 & 64) != 0) {
                                shape = ic2.a.getShape(kk0Var, 6);
                                i4 &= -3670017;
                            }
                            if ((i3 & Uuid.SIZE_BITS) != 0) {
                                containerColor = ic2.a.getContainerColor(kk0Var, 6);
                                i4 &= -29360129;
                            } else {
                                containerColor = j3;
                            }
                            if (i11 != 0) {
                                ic2 ic2Var11111111111113 = ic2.a;
                                f4 = 0.0f;
                            } else {
                                f4 = f3;
                            }
                            if (i13 != 0) {
                                ic2 ic2Var11111111111114 = ic2.a;
                                f5 = 3.0f;
                            } else {
                                f5 = f2;
                            }
                            if (i15 != 0) {
                                iwVar2 = null;
                            } else {
                                iwVar2 = iwVar;
                            }
                            rb3Var2 = rb3VarRememberScrollState;
                        }
                        kk0Var.s();
                        objP = kk0Var.P();
                        if (objP == Composer$Companion.getEmpty()) {
                            objP = new ni2(Boolean.FALSE);
                            kk0Var.l0(objP);
                        }
                        ni2Var = (ni2) objP;
                        ni2Var.c.setValue(Boolean.valueOf(z));
                        if (((Boolean) ni2Var.b.getValue()).booleanValue()) {
                            objP2 = kk0Var.P();
                            if (objP2 == Composer$Companion.getEmpty()) {
                                objP2 = cl3.d(new e54(e54.b));
                                kk0Var.l0(objP2);
                            }
                            mi2Var = (mi2) objP2;
                            wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                            if ((i4 & 7168) == 2048) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            zH = z2 | kk0Var.h(wu0Var);
                            objP3 = kk0Var.P();
                            if (zH) {
                                z3 = true;
                                objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                                kk0Var.l0(objP3);
                            } else {
                                z3 = true;
                                objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                                kk0Var.l0(objP3);
                            }
                            yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                        } else {
                            objP2 = kk0Var.P();
                            if (objP2 == Composer$Companion.getEmpty()) {
                                objP2 = cl3.d(new e54(e54.b));
                                kk0Var.l0(objP2);
                            }
                            mi2Var = (mi2) objP2;
                            wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                            if ((i4 & 7168) == 2048) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            zH = z2 | kk0Var.h(wu0Var);
                            objP3 = kk0Var.P();
                            if (zH) {
                                z3 = true;
                                objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                                kk0Var.l0(objP3);
                            } else {
                                z3 = true;
                                objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                                kk0Var.l0(objP3);
                            }
                            yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                        }
                        ux2Var3 = ux2Var2;
                        j4 = jE;
                        cVar4 = cVar3;
                        rb3Var3 = rb3Var2;
                        rg3Var2 = shape;
                        j5 = containerColor;
                        f6 = f4;
                        f7 = f5;
                        iwVar3 = iwVar2;
                    } else {
                        kk0Var.X();
                        if ((i & 1) != 0) {
                            if (i5 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i7 != 0) {
                                jE = xr0.E();
                            } else {
                                jE = j;
                            }
                            if ((i3 & 16) != 0) {
                                rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                                i4 &= -57345;
                            } else {
                                rb3VarRememberScrollState = rb3Var;
                            }
                            if (i9 != 0) {
                                ux2Var2 = a;
                            }
                            if ((i3 & 64) != 0) {
                                shape = ic2.a.getShape(kk0Var, 6);
                                i4 &= -3670017;
                            }
                            if ((i3 & Uuid.SIZE_BITS) != 0) {
                                containerColor = ic2.a.getContainerColor(kk0Var, 6);
                                i4 &= -29360129;
                            } else {
                                containerColor = j3;
                            }
                            if (i11 != 0) {
                                ic2 ic2Var11111111111115 = ic2.a;
                                f4 = 0.0f;
                            } else {
                                f4 = f3;
                            }
                            if (i13 != 0) {
                                ic2 ic2Var11111111111116 = ic2.a;
                                f5 = 3.0f;
                            } else {
                                f5 = f2;
                            }
                            if (i15 != 0) {
                                iwVar2 = null;
                            } else {
                                iwVar2 = iwVar;
                            }
                            rb3Var2 = rb3VarRememberScrollState;
                        } else {
                            if (i5 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i7 != 0) {
                                jE = xr0.E();
                            } else {
                                jE = j;
                            }
                            if ((i3 & 16) != 0) {
                                rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                                i4 &= -57345;
                            } else {
                                rb3VarRememberScrollState = rb3Var;
                            }
                            if (i9 != 0) {
                                ux2Var2 = a;
                            }
                            if ((i3 & 64) != 0) {
                                shape = ic2.a.getShape(kk0Var, 6);
                                i4 &= -3670017;
                            }
                            if ((i3 & Uuid.SIZE_BITS) != 0) {
                                containerColor = ic2.a.getContainerColor(kk0Var, 6);
                                i4 &= -29360129;
                            } else {
                                containerColor = j3;
                            }
                            if (i11 != 0) {
                                ic2 ic2Var11111111111117 = ic2.a;
                                f4 = 0.0f;
                            } else {
                                f4 = f3;
                            }
                            if (i13 != 0) {
                                ic2 ic2Var11111111111118 = ic2.a;
                                f5 = 3.0f;
                            } else {
                                f5 = f2;
                            }
                            if (i15 != 0) {
                                iwVar2 = null;
                            } else {
                                iwVar2 = iwVar;
                            }
                            rb3Var2 = rb3VarRememberScrollState;
                        }
                        kk0Var.s();
                        objP = kk0Var.P();
                        if (objP == Composer$Companion.getEmpty()) {
                            objP = new ni2(Boolean.FALSE);
                            kk0Var.l0(objP);
                        }
                        ni2Var = (ni2) objP;
                        ni2Var.c.setValue(Boolean.valueOf(z));
                        if (((Boolean) ni2Var.b.getValue()).booleanValue()) {
                            objP2 = kk0Var.P();
                            if (objP2 == Composer$Companion.getEmpty()) {
                                objP2 = cl3.d(new e54(e54.b));
                                kk0Var.l0(objP2);
                            }
                            mi2Var = (mi2) objP2;
                            wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                            if ((i4 & 7168) == 2048) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            zH = z2 | kk0Var.h(wu0Var);
                            objP3 = kk0Var.P();
                            if (zH) {
                                z3 = true;
                                objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                                kk0Var.l0(objP3);
                            } else {
                                z3 = true;
                                objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                                kk0Var.l0(objP3);
                            }
                            yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                        } else {
                            objP2 = kk0Var.P();
                            if (objP2 == Composer$Companion.getEmpty()) {
                                objP2 = cl3.d(new e54(e54.b));
                                kk0Var.l0(objP2);
                            }
                            mi2Var = (mi2) objP2;
                            wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                            if ((i4 & 7168) == 2048) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            zH = z2 | kk0Var.h(wu0Var);
                            objP3 = kk0Var.P();
                            if (zH) {
                                z3 = true;
                                objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                                kk0Var.l0(objP3);
                            } else {
                                z3 = true;
                                objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                                kk0Var.l0(objP3);
                            }
                            yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                        }
                        ux2Var3 = ux2Var2;
                        j4 = jE;
                        cVar4 = cVar3;
                        rb3Var3 = rb3Var2;
                        rg3Var2 = shape;
                        j5 = containerColor;
                        f6 = f4;
                        f7 = f5;
                        iwVar3 = iwVar2;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new vb(z, je1Var, cVar4, j4, rb3Var3, ux2Var3, rg3Var2, j5, f6, f7, iwVar3, oe1Var, i, i2, i3));
                    }
                }
                i4 |= 805306368;
                i15 = i3 & 1024;
                if (i15 != 0) {
                    i16 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    if (kk0Var.h(iwVar)) {
                        i17 = 4;
                    } else {
                        i17 = 2;
                    }
                    i16 = i2 | i17;
                } else {
                    i16 = i2;
                }
                if ((i3 & 2048) != 0) {
                    if ((i2 & 48) == 0) {
                        if (kk0Var.j(oe1Var)) {
                            i18 = 32;
                        } else {
                            i18 = 16;
                        }
                        i16 |= i18;
                    }
                    if ((i4 & 306783379) != 306783378) {
                        kk0Var.X();
                        if ((i & 1) != 0) {
                            if (i5 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i7 != 0) {
                                jE = xr0.E();
                            } else {
                                jE = j;
                            }
                            if ((i3 & 16) != 0) {
                                rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                                i4 &= -57345;
                            } else {
                                rb3VarRememberScrollState = rb3Var;
                            }
                            if (i9 != 0) {
                                ux2Var2 = a;
                            }
                            if ((i3 & 64) != 0) {
                                shape = ic2.a.getShape(kk0Var, 6);
                                i4 &= -3670017;
                            }
                            if ((i3 & Uuid.SIZE_BITS) != 0) {
                                containerColor = ic2.a.getContainerColor(kk0Var, 6);
                                i4 &= -29360129;
                            } else {
                                containerColor = j3;
                            }
                            if (i11 != 0) {
                                ic2 ic2Var11111111111119 = ic2.a;
                                f4 = 0.0f;
                            } else {
                                f4 = f3;
                            }
                            if (i13 != 0) {
                                ic2 ic2Var111111111111110 = ic2.a;
                                f5 = 3.0f;
                            } else {
                                f5 = f2;
                            }
                            if (i15 != 0) {
                                iwVar2 = null;
                            } else {
                                iwVar2 = iwVar;
                            }
                            rb3Var2 = rb3VarRememberScrollState;
                        } else {
                            if (i5 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i7 != 0) {
                                jE = xr0.E();
                            } else {
                                jE = j;
                            }
                            if ((i3 & 16) != 0) {
                                rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                                i4 &= -57345;
                            } else {
                                rb3VarRememberScrollState = rb3Var;
                            }
                            if (i9 != 0) {
                                ux2Var2 = a;
                            }
                            if ((i3 & 64) != 0) {
                                shape = ic2.a.getShape(kk0Var, 6);
                                i4 &= -3670017;
                            }
                            if ((i3 & Uuid.SIZE_BITS) != 0) {
                                containerColor = ic2.a.getContainerColor(kk0Var, 6);
                                i4 &= -29360129;
                            } else {
                                containerColor = j3;
                            }
                            if (i11 != 0) {
                                ic2 ic2Var111111111111111 = ic2.a;
                                f4 = 0.0f;
                            } else {
                                f4 = f3;
                            }
                            if (i13 != 0) {
                                ic2 ic2Var111111111111112 = ic2.a;
                                f5 = 3.0f;
                            } else {
                                f5 = f2;
                            }
                            if (i15 != 0) {
                                iwVar2 = null;
                            } else {
                                iwVar2 = iwVar;
                            }
                            rb3Var2 = rb3VarRememberScrollState;
                        }
                        kk0Var.s();
                        objP = kk0Var.P();
                        if (objP == Composer$Companion.getEmpty()) {
                            objP = new ni2(Boolean.FALSE);
                            kk0Var.l0(objP);
                        }
                        ni2Var = (ni2) objP;
                        ni2Var.c.setValue(Boolean.valueOf(z));
                        if (((Boolean) ni2Var.b.getValue()).booleanValue()) {
                            objP2 = kk0Var.P();
                            if (objP2 == Composer$Companion.getEmpty()) {
                                objP2 = cl3.d(new e54(e54.b));
                                kk0Var.l0(objP2);
                            }
                            mi2Var = (mi2) objP2;
                            wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                            if ((i4 & 7168) == 2048) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            zH = z2 | kk0Var.h(wu0Var);
                            objP3 = kk0Var.P();
                            if (zH) {
                                z3 = true;
                                objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                                kk0Var.l0(objP3);
                            } else {
                                z3 = true;
                                objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                                kk0Var.l0(objP3);
                            }
                            yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                        } else {
                            objP2 = kk0Var.P();
                            if (objP2 == Composer$Companion.getEmpty()) {
                                objP2 = cl3.d(new e54(e54.b));
                                kk0Var.l0(objP2);
                            }
                            mi2Var = (mi2) objP2;
                            wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                            if ((i4 & 7168) == 2048) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            zH = z2 | kk0Var.h(wu0Var);
                            objP3 = kk0Var.P();
                            if (zH) {
                                z3 = true;
                                objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                                kk0Var.l0(objP3);
                            } else {
                                z3 = true;
                                objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                                kk0Var.l0(objP3);
                            }
                            yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                        }
                        ux2Var3 = ux2Var2;
                        j4 = jE;
                        cVar4 = cVar3;
                        rb3Var3 = rb3Var2;
                        rg3Var2 = shape;
                        j5 = containerColor;
                        f6 = f4;
                        f7 = f5;
                        iwVar3 = iwVar2;
                    } else {
                        kk0Var.X();
                        if ((i & 1) != 0) {
                            if (i5 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i7 != 0) {
                                jE = xr0.E();
                            } else {
                                jE = j;
                            }
                            if ((i3 & 16) != 0) {
                                rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                                i4 &= -57345;
                            } else {
                                rb3VarRememberScrollState = rb3Var;
                            }
                            if (i9 != 0) {
                                ux2Var2 = a;
                            }
                            if ((i3 & 64) != 0) {
                                shape = ic2.a.getShape(kk0Var, 6);
                                i4 &= -3670017;
                            }
                            if ((i3 & Uuid.SIZE_BITS) != 0) {
                                containerColor = ic2.a.getContainerColor(kk0Var, 6);
                                i4 &= -29360129;
                            } else {
                                containerColor = j3;
                            }
                            if (i11 != 0) {
                                ic2 ic2Var111111111111113 = ic2.a;
                                f4 = 0.0f;
                            } else {
                                f4 = f3;
                            }
                            if (i13 != 0) {
                                ic2 ic2Var111111111111114 = ic2.a;
                                f5 = 3.0f;
                            } else {
                                f5 = f2;
                            }
                            if (i15 != 0) {
                                iwVar2 = null;
                            } else {
                                iwVar2 = iwVar;
                            }
                            rb3Var2 = rb3VarRememberScrollState;
                        } else {
                            if (i5 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i7 != 0) {
                                jE = xr0.E();
                            } else {
                                jE = j;
                            }
                            if ((i3 & 16) != 0) {
                                rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                                i4 &= -57345;
                            } else {
                                rb3VarRememberScrollState = rb3Var;
                            }
                            if (i9 != 0) {
                                ux2Var2 = a;
                            }
                            if ((i3 & 64) != 0) {
                                shape = ic2.a.getShape(kk0Var, 6);
                                i4 &= -3670017;
                            }
                            if ((i3 & Uuid.SIZE_BITS) != 0) {
                                containerColor = ic2.a.getContainerColor(kk0Var, 6);
                                i4 &= -29360129;
                            } else {
                                containerColor = j3;
                            }
                            if (i11 != 0) {
                                ic2 ic2Var111111111111115 = ic2.a;
                                f4 = 0.0f;
                            } else {
                                f4 = f3;
                            }
                            if (i13 != 0) {
                                ic2 ic2Var111111111111116 = ic2.a;
                                f5 = 3.0f;
                            } else {
                                f5 = f2;
                            }
                            if (i15 != 0) {
                                iwVar2 = null;
                            } else {
                                iwVar2 = iwVar;
                            }
                            rb3Var2 = rb3VarRememberScrollState;
                        }
                        kk0Var.s();
                        objP = kk0Var.P();
                        if (objP == Composer$Companion.getEmpty()) {
                            objP = new ni2(Boolean.FALSE);
                            kk0Var.l0(objP);
                        }
                        ni2Var = (ni2) objP;
                        ni2Var.c.setValue(Boolean.valueOf(z));
                        if (((Boolean) ni2Var.b.getValue()).booleanValue()) {
                            objP2 = kk0Var.P();
                            if (objP2 == Composer$Companion.getEmpty()) {
                                objP2 = cl3.d(new e54(e54.b));
                                kk0Var.l0(objP2);
                            }
                            mi2Var = (mi2) objP2;
                            wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                            if ((i4 & 7168) == 2048) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            zH = z2 | kk0Var.h(wu0Var);
                            objP3 = kk0Var.P();
                            if (zH) {
                                z3 = true;
                                objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                                kk0Var.l0(objP3);
                            } else {
                                z3 = true;
                                objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                                kk0Var.l0(objP3);
                            }
                            yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                        } else {
                            objP2 = kk0Var.P();
                            if (objP2 == Composer$Companion.getEmpty()) {
                                objP2 = cl3.d(new e54(e54.b));
                                kk0Var.l0(objP2);
                            }
                            mi2Var = (mi2) objP2;
                            wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                            if ((i4 & 7168) == 2048) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            zH = z2 | kk0Var.h(wu0Var);
                            objP3 = kk0Var.P();
                            if (zH) {
                                z3 = true;
                                objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                                kk0Var.l0(objP3);
                            } else {
                                z3 = true;
                                objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                                kk0Var.l0(objP3);
                            }
                            yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                        }
                        ux2Var3 = ux2Var2;
                        j4 = jE;
                        cVar4 = cVar3;
                        rb3Var3 = rb3Var2;
                        rg3Var2 = shape;
                        j5 = containerColor;
                        f6 = f4;
                        f7 = f5;
                        iwVar3 = iwVar2;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new vb(z, je1Var, cVar4, j4, rb3Var3, ux2Var3, rg3Var2, j5, f6, f7, iwVar3, oe1Var, i, i2, i3));
                    }
                }
                i16 |= 48;
                if ((i4 & 306783379) != 306783378) {
                    kk0Var.X();
                    if ((i & 1) != 0) {
                        if (i5 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i7 != 0) {
                            jE = xr0.E();
                        } else {
                            jE = j;
                        }
                        if ((i3 & 16) != 0) {
                            rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                            i4 &= -57345;
                        } else {
                            rb3VarRememberScrollState = rb3Var;
                        }
                        if (i9 != 0) {
                            ux2Var2 = a;
                        }
                        if ((i3 & 64) != 0) {
                            shape = ic2.a.getShape(kk0Var, 6);
                            i4 &= -3670017;
                        }
                        if ((i3 & Uuid.SIZE_BITS) != 0) {
                            containerColor = ic2.a.getContainerColor(kk0Var, 6);
                            i4 &= -29360129;
                        } else {
                            containerColor = j3;
                        }
                        if (i11 != 0) {
                            ic2 ic2Var111111111111117 = ic2.a;
                            f4 = 0.0f;
                        } else {
                            f4 = f3;
                        }
                        if (i13 != 0) {
                            ic2 ic2Var111111111111118 = ic2.a;
                            f5 = 3.0f;
                        } else {
                            f5 = f2;
                        }
                        if (i15 != 0) {
                            iwVar2 = null;
                        } else {
                            iwVar2 = iwVar;
                        }
                        rb3Var2 = rb3VarRememberScrollState;
                    } else {
                        if (i5 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i7 != 0) {
                            jE = xr0.E();
                        } else {
                            jE = j;
                        }
                        if ((i3 & 16) != 0) {
                            rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                            i4 &= -57345;
                        } else {
                            rb3VarRememberScrollState = rb3Var;
                        }
                        if (i9 != 0) {
                            ux2Var2 = a;
                        }
                        if ((i3 & 64) != 0) {
                            shape = ic2.a.getShape(kk0Var, 6);
                            i4 &= -3670017;
                        }
                        if ((i3 & Uuid.SIZE_BITS) != 0) {
                            containerColor = ic2.a.getContainerColor(kk0Var, 6);
                            i4 &= -29360129;
                        } else {
                            containerColor = j3;
                        }
                        if (i11 != 0) {
                            ic2 ic2Var111111111111119 = ic2.a;
                            f4 = 0.0f;
                        } else {
                            f4 = f3;
                        }
                        if (i13 != 0) {
                            ic2 ic2Var1111111111111110 = ic2.a;
                            f5 = 3.0f;
                        } else {
                            f5 = f2;
                        }
                        if (i15 != 0) {
                            iwVar2 = null;
                        } else {
                            iwVar2 = iwVar;
                        }
                        rb3Var2 = rb3VarRememberScrollState;
                    }
                    kk0Var.s();
                    objP = kk0Var.P();
                    if (objP == Composer$Companion.getEmpty()) {
                        objP = new ni2(Boolean.FALSE);
                        kk0Var.l0(objP);
                    }
                    ni2Var = (ni2) objP;
                    ni2Var.c.setValue(Boolean.valueOf(z));
                    if (((Boolean) ni2Var.b.getValue()).booleanValue()) {
                        objP2 = kk0Var.P();
                        if (objP2 == Composer$Companion.getEmpty()) {
                            objP2 = cl3.d(new e54(e54.b));
                            kk0Var.l0(objP2);
                        }
                        mi2Var = (mi2) objP2;
                        wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                        if ((i4 & 7168) == 2048) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        zH = z2 | kk0Var.h(wu0Var);
                        objP3 = kk0Var.P();
                        if (zH) {
                            z3 = true;
                            objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                            kk0Var.l0(objP3);
                        } else {
                            z3 = true;
                            objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                            kk0Var.l0(objP3);
                        }
                        yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                    } else {
                        objP2 = kk0Var.P();
                        if (objP2 == Composer$Companion.getEmpty()) {
                            objP2 = cl3.d(new e54(e54.b));
                            kk0Var.l0(objP2);
                        }
                        mi2Var = (mi2) objP2;
                        wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                        if ((i4 & 7168) == 2048) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        zH = z2 | kk0Var.h(wu0Var);
                        objP3 = kk0Var.P();
                        if (zH) {
                            z3 = true;
                            objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                            kk0Var.l0(objP3);
                        } else {
                            z3 = true;
                            objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                            kk0Var.l0(objP3);
                        }
                        yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                    }
                    ux2Var3 = ux2Var2;
                    j4 = jE;
                    cVar4 = cVar3;
                    rb3Var3 = rb3Var2;
                    rg3Var2 = shape;
                    j5 = containerColor;
                    f6 = f4;
                    f7 = f5;
                    iwVar3 = iwVar2;
                } else {
                    kk0Var.X();
                    if ((i & 1) != 0) {
                        if (i5 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i7 != 0) {
                            jE = xr0.E();
                        } else {
                            jE = j;
                        }
                        if ((i3 & 16) != 0) {
                            rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                            i4 &= -57345;
                        } else {
                            rb3VarRememberScrollState = rb3Var;
                        }
                        if (i9 != 0) {
                            ux2Var2 = a;
                        }
                        if ((i3 & 64) != 0) {
                            shape = ic2.a.getShape(kk0Var, 6);
                            i4 &= -3670017;
                        }
                        if ((i3 & Uuid.SIZE_BITS) != 0) {
                            containerColor = ic2.a.getContainerColor(kk0Var, 6);
                            i4 &= -29360129;
                        } else {
                            containerColor = j3;
                        }
                        if (i11 != 0) {
                            ic2 ic2Var1111111111111111 = ic2.a;
                            f4 = 0.0f;
                        } else {
                            f4 = f3;
                        }
                        if (i13 != 0) {
                            ic2 ic2Var1111111111111112 = ic2.a;
                            f5 = 3.0f;
                        } else {
                            f5 = f2;
                        }
                        if (i15 != 0) {
                            iwVar2 = null;
                        } else {
                            iwVar2 = iwVar;
                        }
                        rb3Var2 = rb3VarRememberScrollState;
                    } else {
                        if (i5 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i7 != 0) {
                            jE = xr0.E();
                        } else {
                            jE = j;
                        }
                        if ((i3 & 16) != 0) {
                            rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                            i4 &= -57345;
                        } else {
                            rb3VarRememberScrollState = rb3Var;
                        }
                        if (i9 != 0) {
                            ux2Var2 = a;
                        }
                        if ((i3 & 64) != 0) {
                            shape = ic2.a.getShape(kk0Var, 6);
                            i4 &= -3670017;
                        }
                        if ((i3 & Uuid.SIZE_BITS) != 0) {
                            containerColor = ic2.a.getContainerColor(kk0Var, 6);
                            i4 &= -29360129;
                        } else {
                            containerColor = j3;
                        }
                        if (i11 != 0) {
                            ic2 ic2Var1111111111111113 = ic2.a;
                            f4 = 0.0f;
                        } else {
                            f4 = f3;
                        }
                        if (i13 != 0) {
                            ic2 ic2Var1111111111111114 = ic2.a;
                            f5 = 3.0f;
                        } else {
                            f5 = f2;
                        }
                        if (i15 != 0) {
                            iwVar2 = null;
                        } else {
                            iwVar2 = iwVar;
                        }
                        rb3Var2 = rb3VarRememberScrollState;
                    }
                    kk0Var.s();
                    objP = kk0Var.P();
                    if (objP == Composer$Companion.getEmpty()) {
                        objP = new ni2(Boolean.FALSE);
                        kk0Var.l0(objP);
                    }
                    ni2Var = (ni2) objP;
                    ni2Var.c.setValue(Boolean.valueOf(z));
                    if (((Boolean) ni2Var.b.getValue()).booleanValue()) {
                        objP2 = kk0Var.P();
                        if (objP2 == Composer$Companion.getEmpty()) {
                            objP2 = cl3.d(new e54(e54.b));
                            kk0Var.l0(objP2);
                        }
                        mi2Var = (mi2) objP2;
                        wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                        if ((i4 & 7168) == 2048) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        zH = z2 | kk0Var.h(wu0Var);
                        objP3 = kk0Var.P();
                        if (zH) {
                            z3 = true;
                            objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                            kk0Var.l0(objP3);
                        } else {
                            z3 = true;
                            objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                            kk0Var.l0(objP3);
                        }
                        yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                    } else {
                        objP2 = kk0Var.P();
                        if (objP2 == Composer$Companion.getEmpty()) {
                            objP2 = cl3.d(new e54(e54.b));
                            kk0Var.l0(objP2);
                        }
                        mi2Var = (mi2) objP2;
                        wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                        if ((i4 & 7168) == 2048) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        zH = z2 | kk0Var.h(wu0Var);
                        objP3 = kk0Var.P();
                        if (zH) {
                            z3 = true;
                            objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                            kk0Var.l0(objP3);
                        } else {
                            z3 = true;
                            objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                            kk0Var.l0(objP3);
                        }
                        yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                    }
                    ux2Var3 = ux2Var2;
                    j4 = jE;
                    cVar4 = cVar3;
                    rb3Var3 = rb3Var2;
                    rg3Var2 = shape;
                    j5 = containerColor;
                    f6 = f4;
                    f7 = f5;
                    iwVar3 = iwVar2;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new vb(z, je1Var, cVar4, j4, rb3Var3, ux2Var3, rg3Var2, j5, f6, f7, iwVar3, oe1Var, i, i2, i3));
                }
            }
            i4 |= 3072;
            if ((i & 24576) != 0) {
                i4 |= ((i3 & 16) == 0 || !kk0Var.h(rb3Var)) ? ConstantsKt.DEFAULT_BUFFER_SIZE : 16384;
            }
            i9 = i3 & 32;
            if (i9 != 0) {
                i4 |= 196608;
                ux2Var2 = ux2Var;
            } else {
                ux2Var2 = ux2Var;
                if ((i & 196608) == 0) {
                    if (kk0Var.h(ux2Var2)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                    i4 |= i10;
                }
            }
            if ((i & 1572864) == 0) {
                shape = rg3Var;
                if ((i3 & 64) == 0) {
                    i20 = 524288;
                } else {
                    i20 = 524288;
                }
                i4 |= i20;
            } else {
                shape = rg3Var;
            }
            if ((i & 12582912) == 0) {
                j3 = j2;
                if ((i3 & Uuid.SIZE_BITS) == 0) {
                    i19 = 4194304;
                } else {
                    i19 = 4194304;
                }
                i4 |= i19;
            } else {
                j3 = j2;
            }
            i11 = i3 & FontInfo.NUMBER_OF_CHAR_CODES;
            if (i11 != 0) {
                i4 |= 100663296;
                f3 = f;
            } else {
                f3 = f;
                if ((i & 100663296) == 0) {
                    if (kk0Var.e(f3)) {
                        i12 = 67108864;
                    } else {
                        i12 = 33554432;
                    }
                    i4 |= i12;
                }
            }
            i13 = i3 & ConstantsKt.MINIMUM_BLOCK_SIZE;
            if (i13 != 0) {
                if ((i & 805306368) == 0) {
                    if (kk0Var.e(f2)) {
                        i14 = 536870912;
                    } else {
                        i14 = 268435456;
                    }
                    i4 |= i14;
                }
                i15 = i3 & 1024;
                if (i15 != 0) {
                    i16 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    if (kk0Var.h(iwVar)) {
                        i17 = 4;
                    } else {
                        i17 = 2;
                    }
                    i16 = i2 | i17;
                } else {
                    i16 = i2;
                }
                if ((i3 & 2048) != 0) {
                    if ((i2 & 48) == 0) {
                        if (kk0Var.j(oe1Var)) {
                            i18 = 32;
                        } else {
                            i18 = 16;
                        }
                        i16 |= i18;
                    }
                    if ((i4 & 306783379) != 306783378) {
                        kk0Var.X();
                        if ((i & 1) != 0) {
                            if (i5 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i7 != 0) {
                                jE = xr0.E();
                            } else {
                                jE = j;
                            }
                            if ((i3 & 16) != 0) {
                                rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                                i4 &= -57345;
                            } else {
                                rb3VarRememberScrollState = rb3Var;
                            }
                            if (i9 != 0) {
                                ux2Var2 = a;
                            }
                            if ((i3 & 64) != 0) {
                                shape = ic2.a.getShape(kk0Var, 6);
                                i4 &= -3670017;
                            }
                            if ((i3 & Uuid.SIZE_BITS) != 0) {
                                containerColor = ic2.a.getContainerColor(kk0Var, 6);
                                i4 &= -29360129;
                            } else {
                                containerColor = j3;
                            }
                            if (i11 != 0) {
                                ic2 ic2Var1111111111111115 = ic2.a;
                                f4 = 0.0f;
                            } else {
                                f4 = f3;
                            }
                            if (i13 != 0) {
                                ic2 ic2Var1111111111111116 = ic2.a;
                                f5 = 3.0f;
                            } else {
                                f5 = f2;
                            }
                            if (i15 != 0) {
                                iwVar2 = null;
                            } else {
                                iwVar2 = iwVar;
                            }
                            rb3Var2 = rb3VarRememberScrollState;
                        } else {
                            if (i5 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i7 != 0) {
                                jE = xr0.E();
                            } else {
                                jE = j;
                            }
                            if ((i3 & 16) != 0) {
                                rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                                i4 &= -57345;
                            } else {
                                rb3VarRememberScrollState = rb3Var;
                            }
                            if (i9 != 0) {
                                ux2Var2 = a;
                            }
                            if ((i3 & 64) != 0) {
                                shape = ic2.a.getShape(kk0Var, 6);
                                i4 &= -3670017;
                            }
                            if ((i3 & Uuid.SIZE_BITS) != 0) {
                                containerColor = ic2.a.getContainerColor(kk0Var, 6);
                                i4 &= -29360129;
                            } else {
                                containerColor = j3;
                            }
                            if (i11 != 0) {
                                ic2 ic2Var1111111111111117 = ic2.a;
                                f4 = 0.0f;
                            } else {
                                f4 = f3;
                            }
                            if (i13 != 0) {
                                ic2 ic2Var1111111111111118 = ic2.a;
                                f5 = 3.0f;
                            } else {
                                f5 = f2;
                            }
                            if (i15 != 0) {
                                iwVar2 = null;
                            } else {
                                iwVar2 = iwVar;
                            }
                            rb3Var2 = rb3VarRememberScrollState;
                        }
                        kk0Var.s();
                        objP = kk0Var.P();
                        if (objP == Composer$Companion.getEmpty()) {
                            objP = new ni2(Boolean.FALSE);
                            kk0Var.l0(objP);
                        }
                        ni2Var = (ni2) objP;
                        ni2Var.c.setValue(Boolean.valueOf(z));
                        if (((Boolean) ni2Var.b.getValue()).booleanValue()) {
                            objP2 = kk0Var.P();
                            if (objP2 == Composer$Companion.getEmpty()) {
                                objP2 = cl3.d(new e54(e54.b));
                                kk0Var.l0(objP2);
                            }
                            mi2Var = (mi2) objP2;
                            wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                            if ((i4 & 7168) == 2048) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            zH = z2 | kk0Var.h(wu0Var);
                            objP3 = kk0Var.P();
                            if (zH) {
                                z3 = true;
                                objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                                kk0Var.l0(objP3);
                            } else {
                                z3 = true;
                                objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                                kk0Var.l0(objP3);
                            }
                            yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                        } else {
                            objP2 = kk0Var.P();
                            if (objP2 == Composer$Companion.getEmpty()) {
                                objP2 = cl3.d(new e54(e54.b));
                                kk0Var.l0(objP2);
                            }
                            mi2Var = (mi2) objP2;
                            wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                            if ((i4 & 7168) == 2048) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            zH = z2 | kk0Var.h(wu0Var);
                            objP3 = kk0Var.P();
                            if (zH) {
                                z3 = true;
                                objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                                kk0Var.l0(objP3);
                            } else {
                                z3 = true;
                                objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                                kk0Var.l0(objP3);
                            }
                            yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                        }
                        ux2Var3 = ux2Var2;
                        j4 = jE;
                        cVar4 = cVar3;
                        rb3Var3 = rb3Var2;
                        rg3Var2 = shape;
                        j5 = containerColor;
                        f6 = f4;
                        f7 = f5;
                        iwVar3 = iwVar2;
                    } else {
                        kk0Var.X();
                        if ((i & 1) != 0) {
                            if (i5 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i7 != 0) {
                                jE = xr0.E();
                            } else {
                                jE = j;
                            }
                            if ((i3 & 16) != 0) {
                                rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                                i4 &= -57345;
                            } else {
                                rb3VarRememberScrollState = rb3Var;
                            }
                            if (i9 != 0) {
                                ux2Var2 = a;
                            }
                            if ((i3 & 64) != 0) {
                                shape = ic2.a.getShape(kk0Var, 6);
                                i4 &= -3670017;
                            }
                            if ((i3 & Uuid.SIZE_BITS) != 0) {
                                containerColor = ic2.a.getContainerColor(kk0Var, 6);
                                i4 &= -29360129;
                            } else {
                                containerColor = j3;
                            }
                            if (i11 != 0) {
                                ic2 ic2Var1111111111111119 = ic2.a;
                                f4 = 0.0f;
                            } else {
                                f4 = f3;
                            }
                            if (i13 != 0) {
                                ic2 ic2Var11111111111111110 = ic2.a;
                                f5 = 3.0f;
                            } else {
                                f5 = f2;
                            }
                            if (i15 != 0) {
                                iwVar2 = null;
                            } else {
                                iwVar2 = iwVar;
                            }
                            rb3Var2 = rb3VarRememberScrollState;
                        } else {
                            if (i5 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i7 != 0) {
                                jE = xr0.E();
                            } else {
                                jE = j;
                            }
                            if ((i3 & 16) != 0) {
                                rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                                i4 &= -57345;
                            } else {
                                rb3VarRememberScrollState = rb3Var;
                            }
                            if (i9 != 0) {
                                ux2Var2 = a;
                            }
                            if ((i3 & 64) != 0) {
                                shape = ic2.a.getShape(kk0Var, 6);
                                i4 &= -3670017;
                            }
                            if ((i3 & Uuid.SIZE_BITS) != 0) {
                                containerColor = ic2.a.getContainerColor(kk0Var, 6);
                                i4 &= -29360129;
                            } else {
                                containerColor = j3;
                            }
                            if (i11 != 0) {
                                ic2 ic2Var11111111111111111 = ic2.a;
                                f4 = 0.0f;
                            } else {
                                f4 = f3;
                            }
                            if (i13 != 0) {
                                ic2 ic2Var11111111111111112 = ic2.a;
                                f5 = 3.0f;
                            } else {
                                f5 = f2;
                            }
                            if (i15 != 0) {
                                iwVar2 = null;
                            } else {
                                iwVar2 = iwVar;
                            }
                            rb3Var2 = rb3VarRememberScrollState;
                        }
                        kk0Var.s();
                        objP = kk0Var.P();
                        if (objP == Composer$Companion.getEmpty()) {
                            objP = new ni2(Boolean.FALSE);
                            kk0Var.l0(objP);
                        }
                        ni2Var = (ni2) objP;
                        ni2Var.c.setValue(Boolean.valueOf(z));
                        if (((Boolean) ni2Var.b.getValue()).booleanValue()) {
                            objP2 = kk0Var.P();
                            if (objP2 == Composer$Companion.getEmpty()) {
                                objP2 = cl3.d(new e54(e54.b));
                                kk0Var.l0(objP2);
                            }
                            mi2Var = (mi2) objP2;
                            wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                            if ((i4 & 7168) == 2048) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            zH = z2 | kk0Var.h(wu0Var);
                            objP3 = kk0Var.P();
                            if (zH) {
                                z3 = true;
                                objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                                kk0Var.l0(objP3);
                            } else {
                                z3 = true;
                                objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                                kk0Var.l0(objP3);
                            }
                            yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                        } else {
                            objP2 = kk0Var.P();
                            if (objP2 == Composer$Companion.getEmpty()) {
                                objP2 = cl3.d(new e54(e54.b));
                                kk0Var.l0(objP2);
                            }
                            mi2Var = (mi2) objP2;
                            wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                            if ((i4 & 7168) == 2048) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            zH = z2 | kk0Var.h(wu0Var);
                            objP3 = kk0Var.P();
                            if (zH) {
                                z3 = true;
                                objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                                kk0Var.l0(objP3);
                            } else {
                                z3 = true;
                                objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                                kk0Var.l0(objP3);
                            }
                            yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                        }
                        ux2Var3 = ux2Var2;
                        j4 = jE;
                        cVar4 = cVar3;
                        rb3Var3 = rb3Var2;
                        rg3Var2 = shape;
                        j5 = containerColor;
                        f6 = f4;
                        f7 = f5;
                        iwVar3 = iwVar2;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new vb(z, je1Var, cVar4, j4, rb3Var3, ux2Var3, rg3Var2, j5, f6, f7, iwVar3, oe1Var, i, i2, i3));
                    }
                }
                i16 |= 48;
                if ((i4 & 306783379) != 306783378) {
                    kk0Var.X();
                    if ((i & 1) != 0) {
                        if (i5 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i7 != 0) {
                            jE = xr0.E();
                        } else {
                            jE = j;
                        }
                        if ((i3 & 16) != 0) {
                            rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                            i4 &= -57345;
                        } else {
                            rb3VarRememberScrollState = rb3Var;
                        }
                        if (i9 != 0) {
                            ux2Var2 = a;
                        }
                        if ((i3 & 64) != 0) {
                            shape = ic2.a.getShape(kk0Var, 6);
                            i4 &= -3670017;
                        }
                        if ((i3 & Uuid.SIZE_BITS) != 0) {
                            containerColor = ic2.a.getContainerColor(kk0Var, 6);
                            i4 &= -29360129;
                        } else {
                            containerColor = j3;
                        }
                        if (i11 != 0) {
                            ic2 ic2Var11111111111111113 = ic2.a;
                            f4 = 0.0f;
                        } else {
                            f4 = f3;
                        }
                        if (i13 != 0) {
                            ic2 ic2Var11111111111111114 = ic2.a;
                            f5 = 3.0f;
                        } else {
                            f5 = f2;
                        }
                        if (i15 != 0) {
                            iwVar2 = null;
                        } else {
                            iwVar2 = iwVar;
                        }
                        rb3Var2 = rb3VarRememberScrollState;
                    } else {
                        if (i5 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i7 != 0) {
                            jE = xr0.E();
                        } else {
                            jE = j;
                        }
                        if ((i3 & 16) != 0) {
                            rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                            i4 &= -57345;
                        } else {
                            rb3VarRememberScrollState = rb3Var;
                        }
                        if (i9 != 0) {
                            ux2Var2 = a;
                        }
                        if ((i3 & 64) != 0) {
                            shape = ic2.a.getShape(kk0Var, 6);
                            i4 &= -3670017;
                        }
                        if ((i3 & Uuid.SIZE_BITS) != 0) {
                            containerColor = ic2.a.getContainerColor(kk0Var, 6);
                            i4 &= -29360129;
                        } else {
                            containerColor = j3;
                        }
                        if (i11 != 0) {
                            ic2 ic2Var11111111111111115 = ic2.a;
                            f4 = 0.0f;
                        } else {
                            f4 = f3;
                        }
                        if (i13 != 0) {
                            ic2 ic2Var11111111111111116 = ic2.a;
                            f5 = 3.0f;
                        } else {
                            f5 = f2;
                        }
                        if (i15 != 0) {
                            iwVar2 = null;
                        } else {
                            iwVar2 = iwVar;
                        }
                        rb3Var2 = rb3VarRememberScrollState;
                    }
                    kk0Var.s();
                    objP = kk0Var.P();
                    if (objP == Composer$Companion.getEmpty()) {
                        objP = new ni2(Boolean.FALSE);
                        kk0Var.l0(objP);
                    }
                    ni2Var = (ni2) objP;
                    ni2Var.c.setValue(Boolean.valueOf(z));
                    if (((Boolean) ni2Var.b.getValue()).booleanValue()) {
                        objP2 = kk0Var.P();
                        if (objP2 == Composer$Companion.getEmpty()) {
                            objP2 = cl3.d(new e54(e54.b));
                            kk0Var.l0(objP2);
                        }
                        mi2Var = (mi2) objP2;
                        wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                        if ((i4 & 7168) == 2048) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        zH = z2 | kk0Var.h(wu0Var);
                        objP3 = kk0Var.P();
                        if (zH) {
                            z3 = true;
                            objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                            kk0Var.l0(objP3);
                        } else {
                            z3 = true;
                            objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                            kk0Var.l0(objP3);
                        }
                        yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                    } else {
                        objP2 = kk0Var.P();
                        if (objP2 == Composer$Companion.getEmpty()) {
                            objP2 = cl3.d(new e54(e54.b));
                            kk0Var.l0(objP2);
                        }
                        mi2Var = (mi2) objP2;
                        wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                        if ((i4 & 7168) == 2048) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        zH = z2 | kk0Var.h(wu0Var);
                        objP3 = kk0Var.P();
                        if (zH) {
                            z3 = true;
                            objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                            kk0Var.l0(objP3);
                        } else {
                            z3 = true;
                            objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                            kk0Var.l0(objP3);
                        }
                        yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                    }
                    ux2Var3 = ux2Var2;
                    j4 = jE;
                    cVar4 = cVar3;
                    rb3Var3 = rb3Var2;
                    rg3Var2 = shape;
                    j5 = containerColor;
                    f6 = f4;
                    f7 = f5;
                    iwVar3 = iwVar2;
                } else {
                    kk0Var.X();
                    if ((i & 1) != 0) {
                        if (i5 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i7 != 0) {
                            jE = xr0.E();
                        } else {
                            jE = j;
                        }
                        if ((i3 & 16) != 0) {
                            rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                            i4 &= -57345;
                        } else {
                            rb3VarRememberScrollState = rb3Var;
                        }
                        if (i9 != 0) {
                            ux2Var2 = a;
                        }
                        if ((i3 & 64) != 0) {
                            shape = ic2.a.getShape(kk0Var, 6);
                            i4 &= -3670017;
                        }
                        if ((i3 & Uuid.SIZE_BITS) != 0) {
                            containerColor = ic2.a.getContainerColor(kk0Var, 6);
                            i4 &= -29360129;
                        } else {
                            containerColor = j3;
                        }
                        if (i11 != 0) {
                            ic2 ic2Var11111111111111117 = ic2.a;
                            f4 = 0.0f;
                        } else {
                            f4 = f3;
                        }
                        if (i13 != 0) {
                            ic2 ic2Var11111111111111118 = ic2.a;
                            f5 = 3.0f;
                        } else {
                            f5 = f2;
                        }
                        if (i15 != 0) {
                            iwVar2 = null;
                        } else {
                            iwVar2 = iwVar;
                        }
                        rb3Var2 = rb3VarRememberScrollState;
                    } else {
                        if (i5 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i7 != 0) {
                            jE = xr0.E();
                        } else {
                            jE = j;
                        }
                        if ((i3 & 16) != 0) {
                            rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                            i4 &= -57345;
                        } else {
                            rb3VarRememberScrollState = rb3Var;
                        }
                        if (i9 != 0) {
                            ux2Var2 = a;
                        }
                        if ((i3 & 64) != 0) {
                            shape = ic2.a.getShape(kk0Var, 6);
                            i4 &= -3670017;
                        }
                        if ((i3 & Uuid.SIZE_BITS) != 0) {
                            containerColor = ic2.a.getContainerColor(kk0Var, 6);
                            i4 &= -29360129;
                        } else {
                            containerColor = j3;
                        }
                        if (i11 != 0) {
                            ic2 ic2Var11111111111111119 = ic2.a;
                            f4 = 0.0f;
                        } else {
                            f4 = f3;
                        }
                        if (i13 != 0) {
                            ic2 ic2Var111111111111111110 = ic2.a;
                            f5 = 3.0f;
                        } else {
                            f5 = f2;
                        }
                        if (i15 != 0) {
                            iwVar2 = null;
                        } else {
                            iwVar2 = iwVar;
                        }
                        rb3Var2 = rb3VarRememberScrollState;
                    }
                    kk0Var.s();
                    objP = kk0Var.P();
                    if (objP == Composer$Companion.getEmpty()) {
                        objP = new ni2(Boolean.FALSE);
                        kk0Var.l0(objP);
                    }
                    ni2Var = (ni2) objP;
                    ni2Var.c.setValue(Boolean.valueOf(z));
                    if (((Boolean) ni2Var.b.getValue()).booleanValue()) {
                        objP2 = kk0Var.P();
                        if (objP2 == Composer$Companion.getEmpty()) {
                            objP2 = cl3.d(new e54(e54.b));
                            kk0Var.l0(objP2);
                        }
                        mi2Var = (mi2) objP2;
                        wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                        if ((i4 & 7168) == 2048) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        zH = z2 | kk0Var.h(wu0Var);
                        objP3 = kk0Var.P();
                        if (zH) {
                            z3 = true;
                            objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                            kk0Var.l0(objP3);
                        } else {
                            z3 = true;
                            objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                            kk0Var.l0(objP3);
                        }
                        yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                    } else {
                        objP2 = kk0Var.P();
                        if (objP2 == Composer$Companion.getEmpty()) {
                            objP2 = cl3.d(new e54(e54.b));
                            kk0Var.l0(objP2);
                        }
                        mi2Var = (mi2) objP2;
                        wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                        if ((i4 & 7168) == 2048) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        zH = z2 | kk0Var.h(wu0Var);
                        objP3 = kk0Var.P();
                        if (zH) {
                            z3 = true;
                            objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                            kk0Var.l0(objP3);
                        } else {
                            z3 = true;
                            objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                            kk0Var.l0(objP3);
                        }
                        yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                    }
                    ux2Var3 = ux2Var2;
                    j4 = jE;
                    cVar4 = cVar3;
                    rb3Var3 = rb3Var2;
                    rg3Var2 = shape;
                    j5 = containerColor;
                    f6 = f4;
                    f7 = f5;
                    iwVar3 = iwVar2;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new vb(z, je1Var, cVar4, j4, rb3Var3, ux2Var3, rg3Var2, j5, f6, f7, iwVar3, oe1Var, i, i2, i3));
                }
            }
            i4 |= 805306368;
            i15 = i3 & 1024;
            if (i15 != 0) {
                i16 = i2 | 6;
            } else if ((i2 & 6) == 0) {
                if (kk0Var.h(iwVar)) {
                    i17 = 4;
                } else {
                    i17 = 2;
                }
                i16 = i2 | i17;
            } else {
                i16 = i2;
            }
            if ((i3 & 2048) != 0) {
                if ((i2 & 48) == 0) {
                    if (kk0Var.j(oe1Var)) {
                        i18 = 32;
                    } else {
                        i18 = 16;
                    }
                    i16 |= i18;
                }
                if ((i4 & 306783379) != 306783378) {
                    kk0Var.X();
                    if ((i & 1) != 0) {
                        if (i5 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i7 != 0) {
                            jE = xr0.E();
                        } else {
                            jE = j;
                        }
                        if ((i3 & 16) != 0) {
                            rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                            i4 &= -57345;
                        } else {
                            rb3VarRememberScrollState = rb3Var;
                        }
                        if (i9 != 0) {
                            ux2Var2 = a;
                        }
                        if ((i3 & 64) != 0) {
                            shape = ic2.a.getShape(kk0Var, 6);
                            i4 &= -3670017;
                        }
                        if ((i3 & Uuid.SIZE_BITS) != 0) {
                            containerColor = ic2.a.getContainerColor(kk0Var, 6);
                            i4 &= -29360129;
                        } else {
                            containerColor = j3;
                        }
                        if (i11 != 0) {
                            ic2 ic2Var111111111111111111 = ic2.a;
                            f4 = 0.0f;
                        } else {
                            f4 = f3;
                        }
                        if (i13 != 0) {
                            ic2 ic2Var111111111111111112 = ic2.a;
                            f5 = 3.0f;
                        } else {
                            f5 = f2;
                        }
                        if (i15 != 0) {
                            iwVar2 = null;
                        } else {
                            iwVar2 = iwVar;
                        }
                        rb3Var2 = rb3VarRememberScrollState;
                    } else {
                        if (i5 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i7 != 0) {
                            jE = xr0.E();
                        } else {
                            jE = j;
                        }
                        if ((i3 & 16) != 0) {
                            rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                            i4 &= -57345;
                        } else {
                            rb3VarRememberScrollState = rb3Var;
                        }
                        if (i9 != 0) {
                            ux2Var2 = a;
                        }
                        if ((i3 & 64) != 0) {
                            shape = ic2.a.getShape(kk0Var, 6);
                            i4 &= -3670017;
                        }
                        if ((i3 & Uuid.SIZE_BITS) != 0) {
                            containerColor = ic2.a.getContainerColor(kk0Var, 6);
                            i4 &= -29360129;
                        } else {
                            containerColor = j3;
                        }
                        if (i11 != 0) {
                            ic2 ic2Var111111111111111113 = ic2.a;
                            f4 = 0.0f;
                        } else {
                            f4 = f3;
                        }
                        if (i13 != 0) {
                            ic2 ic2Var111111111111111114 = ic2.a;
                            f5 = 3.0f;
                        } else {
                            f5 = f2;
                        }
                        if (i15 != 0) {
                            iwVar2 = null;
                        } else {
                            iwVar2 = iwVar;
                        }
                        rb3Var2 = rb3VarRememberScrollState;
                    }
                    kk0Var.s();
                    objP = kk0Var.P();
                    if (objP == Composer$Companion.getEmpty()) {
                        objP = new ni2(Boolean.FALSE);
                        kk0Var.l0(objP);
                    }
                    ni2Var = (ni2) objP;
                    ni2Var.c.setValue(Boolean.valueOf(z));
                    if (((Boolean) ni2Var.b.getValue()).booleanValue()) {
                        objP2 = kk0Var.P();
                        if (objP2 == Composer$Companion.getEmpty()) {
                            objP2 = cl3.d(new e54(e54.b));
                            kk0Var.l0(objP2);
                        }
                        mi2Var = (mi2) objP2;
                        wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                        if ((i4 & 7168) == 2048) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        zH = z2 | kk0Var.h(wu0Var);
                        objP3 = kk0Var.P();
                        if (zH) {
                            z3 = true;
                            objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                            kk0Var.l0(objP3);
                        } else {
                            z3 = true;
                            objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                            kk0Var.l0(objP3);
                        }
                        yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                    } else {
                        objP2 = kk0Var.P();
                        if (objP2 == Composer$Companion.getEmpty()) {
                            objP2 = cl3.d(new e54(e54.b));
                            kk0Var.l0(objP2);
                        }
                        mi2Var = (mi2) objP2;
                        wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                        if ((i4 & 7168) == 2048) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        zH = z2 | kk0Var.h(wu0Var);
                        objP3 = kk0Var.P();
                        if (zH) {
                            z3 = true;
                            objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                            kk0Var.l0(objP3);
                        } else {
                            z3 = true;
                            objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                            kk0Var.l0(objP3);
                        }
                        yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                    }
                    ux2Var3 = ux2Var2;
                    j4 = jE;
                    cVar4 = cVar3;
                    rb3Var3 = rb3Var2;
                    rg3Var2 = shape;
                    j5 = containerColor;
                    f6 = f4;
                    f7 = f5;
                    iwVar3 = iwVar2;
                } else {
                    kk0Var.X();
                    if ((i & 1) != 0) {
                        if (i5 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i7 != 0) {
                            jE = xr0.E();
                        } else {
                            jE = j;
                        }
                        if ((i3 & 16) != 0) {
                            rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                            i4 &= -57345;
                        } else {
                            rb3VarRememberScrollState = rb3Var;
                        }
                        if (i9 != 0) {
                            ux2Var2 = a;
                        }
                        if ((i3 & 64) != 0) {
                            shape = ic2.a.getShape(kk0Var, 6);
                            i4 &= -3670017;
                        }
                        if ((i3 & Uuid.SIZE_BITS) != 0) {
                            containerColor = ic2.a.getContainerColor(kk0Var, 6);
                            i4 &= -29360129;
                        } else {
                            containerColor = j3;
                        }
                        if (i11 != 0) {
                            ic2 ic2Var111111111111111115 = ic2.a;
                            f4 = 0.0f;
                        } else {
                            f4 = f3;
                        }
                        if (i13 != 0) {
                            ic2 ic2Var111111111111111116 = ic2.a;
                            f5 = 3.0f;
                        } else {
                            f5 = f2;
                        }
                        if (i15 != 0) {
                            iwVar2 = null;
                        } else {
                            iwVar2 = iwVar;
                        }
                        rb3Var2 = rb3VarRememberScrollState;
                    } else {
                        if (i5 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i7 != 0) {
                            jE = xr0.E();
                        } else {
                            jE = j;
                        }
                        if ((i3 & 16) != 0) {
                            rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                            i4 &= -57345;
                        } else {
                            rb3VarRememberScrollState = rb3Var;
                        }
                        if (i9 != 0) {
                            ux2Var2 = a;
                        }
                        if ((i3 & 64) != 0) {
                            shape = ic2.a.getShape(kk0Var, 6);
                            i4 &= -3670017;
                        }
                        if ((i3 & Uuid.SIZE_BITS) != 0) {
                            containerColor = ic2.a.getContainerColor(kk0Var, 6);
                            i4 &= -29360129;
                        } else {
                            containerColor = j3;
                        }
                        if (i11 != 0) {
                            ic2 ic2Var111111111111111117 = ic2.a;
                            f4 = 0.0f;
                        } else {
                            f4 = f3;
                        }
                        if (i13 != 0) {
                            ic2 ic2Var111111111111111118 = ic2.a;
                            f5 = 3.0f;
                        } else {
                            f5 = f2;
                        }
                        if (i15 != 0) {
                            iwVar2 = null;
                        } else {
                            iwVar2 = iwVar;
                        }
                        rb3Var2 = rb3VarRememberScrollState;
                    }
                    kk0Var.s();
                    objP = kk0Var.P();
                    if (objP == Composer$Companion.getEmpty()) {
                        objP = new ni2(Boolean.FALSE);
                        kk0Var.l0(objP);
                    }
                    ni2Var = (ni2) objP;
                    ni2Var.c.setValue(Boolean.valueOf(z));
                    if (((Boolean) ni2Var.b.getValue()).booleanValue()) {
                        objP2 = kk0Var.P();
                        if (objP2 == Composer$Companion.getEmpty()) {
                            objP2 = cl3.d(new e54(e54.b));
                            kk0Var.l0(objP2);
                        }
                        mi2Var = (mi2) objP2;
                        wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                        if ((i4 & 7168) == 2048) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        zH = z2 | kk0Var.h(wu0Var);
                        objP3 = kk0Var.P();
                        if (zH) {
                            z3 = true;
                            objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                            kk0Var.l0(objP3);
                        } else {
                            z3 = true;
                            objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                            kk0Var.l0(objP3);
                        }
                        yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                    } else {
                        objP2 = kk0Var.P();
                        if (objP2 == Composer$Companion.getEmpty()) {
                            objP2 = cl3.d(new e54(e54.b));
                            kk0Var.l0(objP2);
                        }
                        mi2Var = (mi2) objP2;
                        wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                        if ((i4 & 7168) == 2048) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        zH = z2 | kk0Var.h(wu0Var);
                        objP3 = kk0Var.P();
                        if (zH) {
                            z3 = true;
                            objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                            kk0Var.l0(objP3);
                        } else {
                            z3 = true;
                            objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                            kk0Var.l0(objP3);
                        }
                        yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                    }
                    ux2Var3 = ux2Var2;
                    j4 = jE;
                    cVar4 = cVar3;
                    rb3Var3 = rb3Var2;
                    rg3Var2 = shape;
                    j5 = containerColor;
                    f6 = f4;
                    f7 = f5;
                    iwVar3 = iwVar2;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new vb(z, je1Var, cVar4, j4, rb3Var3, ux2Var3, rg3Var2, j5, f6, f7, iwVar3, oe1Var, i, i2, i3));
                }
            }
            i16 |= 48;
            if ((i4 & 306783379) != 306783378) {
                kk0Var.X();
                if ((i & 1) != 0) {
                    if (i5 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i7 != 0) {
                        jE = xr0.E();
                    } else {
                        jE = j;
                    }
                    if ((i3 & 16) != 0) {
                        rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                        i4 &= -57345;
                    } else {
                        rb3VarRememberScrollState = rb3Var;
                    }
                    if (i9 != 0) {
                        ux2Var2 = a;
                    }
                    if ((i3 & 64) != 0) {
                        shape = ic2.a.getShape(kk0Var, 6);
                        i4 &= -3670017;
                    }
                    if ((i3 & Uuid.SIZE_BITS) != 0) {
                        containerColor = ic2.a.getContainerColor(kk0Var, 6);
                        i4 &= -29360129;
                    } else {
                        containerColor = j3;
                    }
                    if (i11 != 0) {
                        ic2 ic2Var111111111111111119 = ic2.a;
                        f4 = 0.0f;
                    } else {
                        f4 = f3;
                    }
                    if (i13 != 0) {
                        ic2 ic2Var1111111111111111110 = ic2.a;
                        f5 = 3.0f;
                    } else {
                        f5 = f2;
                    }
                    if (i15 != 0) {
                        iwVar2 = null;
                    } else {
                        iwVar2 = iwVar;
                    }
                    rb3Var2 = rb3VarRememberScrollState;
                } else {
                    if (i5 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i7 != 0) {
                        jE = xr0.E();
                    } else {
                        jE = j;
                    }
                    if ((i3 & 16) != 0) {
                        rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                        i4 &= -57345;
                    } else {
                        rb3VarRememberScrollState = rb3Var;
                    }
                    if (i9 != 0) {
                        ux2Var2 = a;
                    }
                    if ((i3 & 64) != 0) {
                        shape = ic2.a.getShape(kk0Var, 6);
                        i4 &= -3670017;
                    }
                    if ((i3 & Uuid.SIZE_BITS) != 0) {
                        containerColor = ic2.a.getContainerColor(kk0Var, 6);
                        i4 &= -29360129;
                    } else {
                        containerColor = j3;
                    }
                    if (i11 != 0) {
                        ic2 ic2Var1111111111111111111 = ic2.a;
                        f4 = 0.0f;
                    } else {
                        f4 = f3;
                    }
                    if (i13 != 0) {
                        ic2 ic2Var1111111111111111112 = ic2.a;
                        f5 = 3.0f;
                    } else {
                        f5 = f2;
                    }
                    if (i15 != 0) {
                        iwVar2 = null;
                    } else {
                        iwVar2 = iwVar;
                    }
                    rb3Var2 = rb3VarRememberScrollState;
                }
                kk0Var.s();
                objP = kk0Var.P();
                if (objP == Composer$Companion.getEmpty()) {
                    objP = new ni2(Boolean.FALSE);
                    kk0Var.l0(objP);
                }
                ni2Var = (ni2) objP;
                ni2Var.c.setValue(Boolean.valueOf(z));
                if (((Boolean) ni2Var.b.getValue()).booleanValue()) {
                    objP2 = kk0Var.P();
                    if (objP2 == Composer$Companion.getEmpty()) {
                        objP2 = cl3.d(new e54(e54.b));
                        kk0Var.l0(objP2);
                    }
                    mi2Var = (mi2) objP2;
                    wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                    if ((i4 & 7168) == 2048) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    zH = z2 | kk0Var.h(wu0Var);
                    objP3 = kk0Var.P();
                    if (zH) {
                        z3 = true;
                        objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                        kk0Var.l0(objP3);
                    } else {
                        z3 = true;
                        objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                        kk0Var.l0(objP3);
                    }
                    yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                } else {
                    objP2 = kk0Var.P();
                    if (objP2 == Composer$Companion.getEmpty()) {
                        objP2 = cl3.d(new e54(e54.b));
                        kk0Var.l0(objP2);
                    }
                    mi2Var = (mi2) objP2;
                    wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                    if ((i4 & 7168) == 2048) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    zH = z2 | kk0Var.h(wu0Var);
                    objP3 = kk0Var.P();
                    if (zH) {
                        z3 = true;
                        objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                        kk0Var.l0(objP3);
                    } else {
                        z3 = true;
                        objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                        kk0Var.l0(objP3);
                    }
                    yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                }
                ux2Var3 = ux2Var2;
                j4 = jE;
                cVar4 = cVar3;
                rb3Var3 = rb3Var2;
                rg3Var2 = shape;
                j5 = containerColor;
                f6 = f4;
                f7 = f5;
                iwVar3 = iwVar2;
            } else {
                kk0Var.X();
                if ((i & 1) != 0) {
                    if (i5 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i7 != 0) {
                        jE = xr0.E();
                    } else {
                        jE = j;
                    }
                    if ((i3 & 16) != 0) {
                        rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                        i4 &= -57345;
                    } else {
                        rb3VarRememberScrollState = rb3Var;
                    }
                    if (i9 != 0) {
                        ux2Var2 = a;
                    }
                    if ((i3 & 64) != 0) {
                        shape = ic2.a.getShape(kk0Var, 6);
                        i4 &= -3670017;
                    }
                    if ((i3 & Uuid.SIZE_BITS) != 0) {
                        containerColor = ic2.a.getContainerColor(kk0Var, 6);
                        i4 &= -29360129;
                    } else {
                        containerColor = j3;
                    }
                    if (i11 != 0) {
                        ic2 ic2Var1111111111111111113 = ic2.a;
                        f4 = 0.0f;
                    } else {
                        f4 = f3;
                    }
                    if (i13 != 0) {
                        ic2 ic2Var1111111111111111114 = ic2.a;
                        f5 = 3.0f;
                    } else {
                        f5 = f2;
                    }
                    if (i15 != 0) {
                        iwVar2 = null;
                    } else {
                        iwVar2 = iwVar;
                    }
                    rb3Var2 = rb3VarRememberScrollState;
                } else {
                    if (i5 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i7 != 0) {
                        jE = xr0.E();
                    } else {
                        jE = j;
                    }
                    if ((i3 & 16) != 0) {
                        rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                        i4 &= -57345;
                    } else {
                        rb3VarRememberScrollState = rb3Var;
                    }
                    if (i9 != 0) {
                        ux2Var2 = a;
                    }
                    if ((i3 & 64) != 0) {
                        shape = ic2.a.getShape(kk0Var, 6);
                        i4 &= -3670017;
                    }
                    if ((i3 & Uuid.SIZE_BITS) != 0) {
                        containerColor = ic2.a.getContainerColor(kk0Var, 6);
                        i4 &= -29360129;
                    } else {
                        containerColor = j3;
                    }
                    if (i11 != 0) {
                        ic2 ic2Var1111111111111111115 = ic2.a;
                        f4 = 0.0f;
                    } else {
                        f4 = f3;
                    }
                    if (i13 != 0) {
                        ic2 ic2Var1111111111111111116 = ic2.a;
                        f5 = 3.0f;
                    } else {
                        f5 = f2;
                    }
                    if (i15 != 0) {
                        iwVar2 = null;
                    } else {
                        iwVar2 = iwVar;
                    }
                    rb3Var2 = rb3VarRememberScrollState;
                }
                kk0Var.s();
                objP = kk0Var.P();
                if (objP == Composer$Companion.getEmpty()) {
                    objP = new ni2(Boolean.FALSE);
                    kk0Var.l0(objP);
                }
                ni2Var = (ni2) objP;
                ni2Var.c.setValue(Boolean.valueOf(z));
                if (((Boolean) ni2Var.b.getValue()).booleanValue()) {
                    objP2 = kk0Var.P();
                    if (objP2 == Composer$Companion.getEmpty()) {
                        objP2 = cl3.d(new e54(e54.b));
                        kk0Var.l0(objP2);
                    }
                    mi2Var = (mi2) objP2;
                    wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                    if ((i4 & 7168) == 2048) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    zH = z2 | kk0Var.h(wu0Var);
                    objP3 = kk0Var.P();
                    if (zH) {
                        z3 = true;
                        objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                        kk0Var.l0(objP3);
                    } else {
                        z3 = true;
                        objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                        kk0Var.l0(objP3);
                    }
                    yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                } else {
                    objP2 = kk0Var.P();
                    if (objP2 == Composer$Companion.getEmpty()) {
                        objP2 = cl3.d(new e54(e54.b));
                        kk0Var.l0(objP2);
                    }
                    mi2Var = (mi2) objP2;
                    wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                    if ((i4 & 7168) == 2048) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    zH = z2 | kk0Var.h(wu0Var);
                    objP3 = kk0Var.P();
                    if (zH) {
                        z3 = true;
                        objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                        kk0Var.l0(objP3);
                    } else {
                        z3 = true;
                        objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                        kk0Var.l0(objP3);
                    }
                    yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                }
                ux2Var3 = ux2Var2;
                j4 = jE;
                cVar4 = cVar3;
                rb3Var3 = rb3Var2;
                rg3Var2 = shape;
                j5 = containerColor;
                f6 = f4;
                f7 = f5;
                iwVar3 = iwVar2;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new vb(z, je1Var, cVar4, j4, rb3Var3, ux2Var3, rg3Var2, j5, f6, f7, iwVar3, oe1Var, i, i2, i3));
            }
        }
        i4 |= 384;
        cVar2 = cVar;
        i7 = i3 & 8;
        if (i7 != 0) {
            if ((i & 3072) == 0) {
                if (kk0Var.g(j)) {
                    i8 = 2048;
                } else {
                    i8 = 1024;
                }
                i4 |= i8;
            }
            if ((i & 24576) != 0) {
                i4 |= ((i3 & 16) == 0 || !kk0Var.h(rb3Var)) ? ConstantsKt.DEFAULT_BUFFER_SIZE : 16384;
            }
            i9 = i3 & 32;
            if (i9 != 0) {
                i4 |= 196608;
                ux2Var2 = ux2Var;
            } else {
                ux2Var2 = ux2Var;
                if ((i & 196608) == 0) {
                    if (kk0Var.h(ux2Var2)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                    i4 |= i10;
                }
            }
            if ((i & 1572864) == 0) {
                shape = rg3Var;
                if ((i3 & 64) == 0) {
                    i20 = 524288;
                } else {
                    i20 = 524288;
                }
                i4 |= i20;
            } else {
                shape = rg3Var;
            }
            if ((i & 12582912) == 0) {
                j3 = j2;
                if ((i3 & Uuid.SIZE_BITS) == 0) {
                    i19 = 4194304;
                } else {
                    i19 = 4194304;
                }
                i4 |= i19;
            } else {
                j3 = j2;
            }
            i11 = i3 & FontInfo.NUMBER_OF_CHAR_CODES;
            if (i11 != 0) {
                i4 |= 100663296;
                f3 = f;
            } else {
                f3 = f;
                if ((i & 100663296) == 0) {
                    if (kk0Var.e(f3)) {
                        i12 = 67108864;
                    } else {
                        i12 = 33554432;
                    }
                    i4 |= i12;
                }
            }
            i13 = i3 & ConstantsKt.MINIMUM_BLOCK_SIZE;
            if (i13 != 0) {
                if ((i & 805306368) == 0) {
                    if (kk0Var.e(f2)) {
                        i14 = 536870912;
                    } else {
                        i14 = 268435456;
                    }
                    i4 |= i14;
                }
                i15 = i3 & 1024;
                if (i15 != 0) {
                    i16 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    if (kk0Var.h(iwVar)) {
                        i17 = 4;
                    } else {
                        i17 = 2;
                    }
                    i16 = i2 | i17;
                } else {
                    i16 = i2;
                }
                if ((i3 & 2048) != 0) {
                    if ((i2 & 48) == 0) {
                        if (kk0Var.j(oe1Var)) {
                            i18 = 32;
                        } else {
                            i18 = 16;
                        }
                        i16 |= i18;
                    }
                    if ((i4 & 306783379) != 306783378) {
                        kk0Var.X();
                        if ((i & 1) != 0) {
                            if (i5 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i7 != 0) {
                                jE = xr0.E();
                            } else {
                                jE = j;
                            }
                            if ((i3 & 16) != 0) {
                                rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                                i4 &= -57345;
                            } else {
                                rb3VarRememberScrollState = rb3Var;
                            }
                            if (i9 != 0) {
                                ux2Var2 = a;
                            }
                            if ((i3 & 64) != 0) {
                                shape = ic2.a.getShape(kk0Var, 6);
                                i4 &= -3670017;
                            }
                            if ((i3 & Uuid.SIZE_BITS) != 0) {
                                containerColor = ic2.a.getContainerColor(kk0Var, 6);
                                i4 &= -29360129;
                            } else {
                                containerColor = j3;
                            }
                            if (i11 != 0) {
                                ic2 ic2Var1111111111111111117 = ic2.a;
                                f4 = 0.0f;
                            } else {
                                f4 = f3;
                            }
                            if (i13 != 0) {
                                ic2 ic2Var1111111111111111118 = ic2.a;
                                f5 = 3.0f;
                            } else {
                                f5 = f2;
                            }
                            if (i15 != 0) {
                                iwVar2 = null;
                            } else {
                                iwVar2 = iwVar;
                            }
                            rb3Var2 = rb3VarRememberScrollState;
                        } else {
                            if (i5 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i7 != 0) {
                                jE = xr0.E();
                            } else {
                                jE = j;
                            }
                            if ((i3 & 16) != 0) {
                                rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                                i4 &= -57345;
                            } else {
                                rb3VarRememberScrollState = rb3Var;
                            }
                            if (i9 != 0) {
                                ux2Var2 = a;
                            }
                            if ((i3 & 64) != 0) {
                                shape = ic2.a.getShape(kk0Var, 6);
                                i4 &= -3670017;
                            }
                            if ((i3 & Uuid.SIZE_BITS) != 0) {
                                containerColor = ic2.a.getContainerColor(kk0Var, 6);
                                i4 &= -29360129;
                            } else {
                                containerColor = j3;
                            }
                            if (i11 != 0) {
                                ic2 ic2Var1111111111111111119 = ic2.a;
                                f4 = 0.0f;
                            } else {
                                f4 = f3;
                            }
                            if (i13 != 0) {
                                ic2 ic2Var11111111111111111110 = ic2.a;
                                f5 = 3.0f;
                            } else {
                                f5 = f2;
                            }
                            if (i15 != 0) {
                                iwVar2 = null;
                            } else {
                                iwVar2 = iwVar;
                            }
                            rb3Var2 = rb3VarRememberScrollState;
                        }
                        kk0Var.s();
                        objP = kk0Var.P();
                        if (objP == Composer$Companion.getEmpty()) {
                            objP = new ni2(Boolean.FALSE);
                            kk0Var.l0(objP);
                        }
                        ni2Var = (ni2) objP;
                        ni2Var.c.setValue(Boolean.valueOf(z));
                        if (((Boolean) ni2Var.b.getValue()).booleanValue()) {
                            objP2 = kk0Var.P();
                            if (objP2 == Composer$Companion.getEmpty()) {
                                objP2 = cl3.d(new e54(e54.b));
                                kk0Var.l0(objP2);
                            }
                            mi2Var = (mi2) objP2;
                            wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                            if ((i4 & 7168) == 2048) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            zH = z2 | kk0Var.h(wu0Var);
                            objP3 = kk0Var.P();
                            if (zH) {
                                z3 = true;
                                objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                                kk0Var.l0(objP3);
                            } else {
                                z3 = true;
                                objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                                kk0Var.l0(objP3);
                            }
                            yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                        } else {
                            objP2 = kk0Var.P();
                            if (objP2 == Composer$Companion.getEmpty()) {
                                objP2 = cl3.d(new e54(e54.b));
                                kk0Var.l0(objP2);
                            }
                            mi2Var = (mi2) objP2;
                            wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                            if ((i4 & 7168) == 2048) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            zH = z2 | kk0Var.h(wu0Var);
                            objP3 = kk0Var.P();
                            if (zH) {
                                z3 = true;
                                objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                                kk0Var.l0(objP3);
                            } else {
                                z3 = true;
                                objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                                kk0Var.l0(objP3);
                            }
                            yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                        }
                        ux2Var3 = ux2Var2;
                        j4 = jE;
                        cVar4 = cVar3;
                        rb3Var3 = rb3Var2;
                        rg3Var2 = shape;
                        j5 = containerColor;
                        f6 = f4;
                        f7 = f5;
                        iwVar3 = iwVar2;
                    } else {
                        kk0Var.X();
                        if ((i & 1) != 0) {
                            if (i5 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i7 != 0) {
                                jE = xr0.E();
                            } else {
                                jE = j;
                            }
                            if ((i3 & 16) != 0) {
                                rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                                i4 &= -57345;
                            } else {
                                rb3VarRememberScrollState = rb3Var;
                            }
                            if (i9 != 0) {
                                ux2Var2 = a;
                            }
                            if ((i3 & 64) != 0) {
                                shape = ic2.a.getShape(kk0Var, 6);
                                i4 &= -3670017;
                            }
                            if ((i3 & Uuid.SIZE_BITS) != 0) {
                                containerColor = ic2.a.getContainerColor(kk0Var, 6);
                                i4 &= -29360129;
                            } else {
                                containerColor = j3;
                            }
                            if (i11 != 0) {
                                ic2 ic2Var11111111111111111111 = ic2.a;
                                f4 = 0.0f;
                            } else {
                                f4 = f3;
                            }
                            if (i13 != 0) {
                                ic2 ic2Var11111111111111111112 = ic2.a;
                                f5 = 3.0f;
                            } else {
                                f5 = f2;
                            }
                            if (i15 != 0) {
                                iwVar2 = null;
                            } else {
                                iwVar2 = iwVar;
                            }
                            rb3Var2 = rb3VarRememberScrollState;
                        } else {
                            if (i5 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i7 != 0) {
                                jE = xr0.E();
                            } else {
                                jE = j;
                            }
                            if ((i3 & 16) != 0) {
                                rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                                i4 &= -57345;
                            } else {
                                rb3VarRememberScrollState = rb3Var;
                            }
                            if (i9 != 0) {
                                ux2Var2 = a;
                            }
                            if ((i3 & 64) != 0) {
                                shape = ic2.a.getShape(kk0Var, 6);
                                i4 &= -3670017;
                            }
                            if ((i3 & Uuid.SIZE_BITS) != 0) {
                                containerColor = ic2.a.getContainerColor(kk0Var, 6);
                                i4 &= -29360129;
                            } else {
                                containerColor = j3;
                            }
                            if (i11 != 0) {
                                ic2 ic2Var11111111111111111113 = ic2.a;
                                f4 = 0.0f;
                            } else {
                                f4 = f3;
                            }
                            if (i13 != 0) {
                                ic2 ic2Var11111111111111111114 = ic2.a;
                                f5 = 3.0f;
                            } else {
                                f5 = f2;
                            }
                            if (i15 != 0) {
                                iwVar2 = null;
                            } else {
                                iwVar2 = iwVar;
                            }
                            rb3Var2 = rb3VarRememberScrollState;
                        }
                        kk0Var.s();
                        objP = kk0Var.P();
                        if (objP == Composer$Companion.getEmpty()) {
                            objP = new ni2(Boolean.FALSE);
                            kk0Var.l0(objP);
                        }
                        ni2Var = (ni2) objP;
                        ni2Var.c.setValue(Boolean.valueOf(z));
                        if (((Boolean) ni2Var.b.getValue()).booleanValue()) {
                            objP2 = kk0Var.P();
                            if (objP2 == Composer$Companion.getEmpty()) {
                                objP2 = cl3.d(new e54(e54.b));
                                kk0Var.l0(objP2);
                            }
                            mi2Var = (mi2) objP2;
                            wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                            if ((i4 & 7168) == 2048) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            zH = z2 | kk0Var.h(wu0Var);
                            objP3 = kk0Var.P();
                            if (zH) {
                                z3 = true;
                                objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                                kk0Var.l0(objP3);
                            } else {
                                z3 = true;
                                objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                                kk0Var.l0(objP3);
                            }
                            yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                        } else {
                            objP2 = kk0Var.P();
                            if (objP2 == Composer$Companion.getEmpty()) {
                                objP2 = cl3.d(new e54(e54.b));
                                kk0Var.l0(objP2);
                            }
                            mi2Var = (mi2) objP2;
                            wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                            if ((i4 & 7168) == 2048) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            zH = z2 | kk0Var.h(wu0Var);
                            objP3 = kk0Var.P();
                            if (zH) {
                                z3 = true;
                                objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                                kk0Var.l0(objP3);
                            } else {
                                z3 = true;
                                objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                                kk0Var.l0(objP3);
                            }
                            yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                        }
                        ux2Var3 = ux2Var2;
                        j4 = jE;
                        cVar4 = cVar3;
                        rb3Var3 = rb3Var2;
                        rg3Var2 = shape;
                        j5 = containerColor;
                        f6 = f4;
                        f7 = f5;
                        iwVar3 = iwVar2;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new vb(z, je1Var, cVar4, j4, rb3Var3, ux2Var3, rg3Var2, j5, f6, f7, iwVar3, oe1Var, i, i2, i3));
                    }
                }
                i16 |= 48;
                if ((i4 & 306783379) != 306783378) {
                    kk0Var.X();
                    if ((i & 1) != 0) {
                        if (i5 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i7 != 0) {
                            jE = xr0.E();
                        } else {
                            jE = j;
                        }
                        if ((i3 & 16) != 0) {
                            rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                            i4 &= -57345;
                        } else {
                            rb3VarRememberScrollState = rb3Var;
                        }
                        if (i9 != 0) {
                            ux2Var2 = a;
                        }
                        if ((i3 & 64) != 0) {
                            shape = ic2.a.getShape(kk0Var, 6);
                            i4 &= -3670017;
                        }
                        if ((i3 & Uuid.SIZE_BITS) != 0) {
                            containerColor = ic2.a.getContainerColor(kk0Var, 6);
                            i4 &= -29360129;
                        } else {
                            containerColor = j3;
                        }
                        if (i11 != 0) {
                            ic2 ic2Var11111111111111111115 = ic2.a;
                            f4 = 0.0f;
                        } else {
                            f4 = f3;
                        }
                        if (i13 != 0) {
                            ic2 ic2Var11111111111111111116 = ic2.a;
                            f5 = 3.0f;
                        } else {
                            f5 = f2;
                        }
                        if (i15 != 0) {
                            iwVar2 = null;
                        } else {
                            iwVar2 = iwVar;
                        }
                        rb3Var2 = rb3VarRememberScrollState;
                    } else {
                        if (i5 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i7 != 0) {
                            jE = xr0.E();
                        } else {
                            jE = j;
                        }
                        if ((i3 & 16) != 0) {
                            rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                            i4 &= -57345;
                        } else {
                            rb3VarRememberScrollState = rb3Var;
                        }
                        if (i9 != 0) {
                            ux2Var2 = a;
                        }
                        if ((i3 & 64) != 0) {
                            shape = ic2.a.getShape(kk0Var, 6);
                            i4 &= -3670017;
                        }
                        if ((i3 & Uuid.SIZE_BITS) != 0) {
                            containerColor = ic2.a.getContainerColor(kk0Var, 6);
                            i4 &= -29360129;
                        } else {
                            containerColor = j3;
                        }
                        if (i11 != 0) {
                            ic2 ic2Var11111111111111111117 = ic2.a;
                            f4 = 0.0f;
                        } else {
                            f4 = f3;
                        }
                        if (i13 != 0) {
                            ic2 ic2Var11111111111111111118 = ic2.a;
                            f5 = 3.0f;
                        } else {
                            f5 = f2;
                        }
                        if (i15 != 0) {
                            iwVar2 = null;
                        } else {
                            iwVar2 = iwVar;
                        }
                        rb3Var2 = rb3VarRememberScrollState;
                    }
                    kk0Var.s();
                    objP = kk0Var.P();
                    if (objP == Composer$Companion.getEmpty()) {
                        objP = new ni2(Boolean.FALSE);
                        kk0Var.l0(objP);
                    }
                    ni2Var = (ni2) objP;
                    ni2Var.c.setValue(Boolean.valueOf(z));
                    if (((Boolean) ni2Var.b.getValue()).booleanValue()) {
                        objP2 = kk0Var.P();
                        if (objP2 == Composer$Companion.getEmpty()) {
                            objP2 = cl3.d(new e54(e54.b));
                            kk0Var.l0(objP2);
                        }
                        mi2Var = (mi2) objP2;
                        wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                        if ((i4 & 7168) == 2048) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        zH = z2 | kk0Var.h(wu0Var);
                        objP3 = kk0Var.P();
                        if (zH) {
                            z3 = true;
                            objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                            kk0Var.l0(objP3);
                        } else {
                            z3 = true;
                            objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                            kk0Var.l0(objP3);
                        }
                        yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                    } else {
                        objP2 = kk0Var.P();
                        if (objP2 == Composer$Companion.getEmpty()) {
                            objP2 = cl3.d(new e54(e54.b));
                            kk0Var.l0(objP2);
                        }
                        mi2Var = (mi2) objP2;
                        wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                        if ((i4 & 7168) == 2048) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        zH = z2 | kk0Var.h(wu0Var);
                        objP3 = kk0Var.P();
                        if (zH) {
                            z3 = true;
                            objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                            kk0Var.l0(objP3);
                        } else {
                            z3 = true;
                            objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                            kk0Var.l0(objP3);
                        }
                        yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                    }
                    ux2Var3 = ux2Var2;
                    j4 = jE;
                    cVar4 = cVar3;
                    rb3Var3 = rb3Var2;
                    rg3Var2 = shape;
                    j5 = containerColor;
                    f6 = f4;
                    f7 = f5;
                    iwVar3 = iwVar2;
                } else {
                    kk0Var.X();
                    if ((i & 1) != 0) {
                        if (i5 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i7 != 0) {
                            jE = xr0.E();
                        } else {
                            jE = j;
                        }
                        if ((i3 & 16) != 0) {
                            rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                            i4 &= -57345;
                        } else {
                            rb3VarRememberScrollState = rb3Var;
                        }
                        if (i9 != 0) {
                            ux2Var2 = a;
                        }
                        if ((i3 & 64) != 0) {
                            shape = ic2.a.getShape(kk0Var, 6);
                            i4 &= -3670017;
                        }
                        if ((i3 & Uuid.SIZE_BITS) != 0) {
                            containerColor = ic2.a.getContainerColor(kk0Var, 6);
                            i4 &= -29360129;
                        } else {
                            containerColor = j3;
                        }
                        if (i11 != 0) {
                            ic2 ic2Var11111111111111111119 = ic2.a;
                            f4 = 0.0f;
                        } else {
                            f4 = f3;
                        }
                        if (i13 != 0) {
                            ic2 ic2Var111111111111111111110 = ic2.a;
                            f5 = 3.0f;
                        } else {
                            f5 = f2;
                        }
                        if (i15 != 0) {
                            iwVar2 = null;
                        } else {
                            iwVar2 = iwVar;
                        }
                        rb3Var2 = rb3VarRememberScrollState;
                    } else {
                        if (i5 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i7 != 0) {
                            jE = xr0.E();
                        } else {
                            jE = j;
                        }
                        if ((i3 & 16) != 0) {
                            rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                            i4 &= -57345;
                        } else {
                            rb3VarRememberScrollState = rb3Var;
                        }
                        if (i9 != 0) {
                            ux2Var2 = a;
                        }
                        if ((i3 & 64) != 0) {
                            shape = ic2.a.getShape(kk0Var, 6);
                            i4 &= -3670017;
                        }
                        if ((i3 & Uuid.SIZE_BITS) != 0) {
                            containerColor = ic2.a.getContainerColor(kk0Var, 6);
                            i4 &= -29360129;
                        } else {
                            containerColor = j3;
                        }
                        if (i11 != 0) {
                            ic2 ic2Var111111111111111111111 = ic2.a;
                            f4 = 0.0f;
                        } else {
                            f4 = f3;
                        }
                        if (i13 != 0) {
                            ic2 ic2Var111111111111111111112 = ic2.a;
                            f5 = 3.0f;
                        } else {
                            f5 = f2;
                        }
                        if (i15 != 0) {
                            iwVar2 = null;
                        } else {
                            iwVar2 = iwVar;
                        }
                        rb3Var2 = rb3VarRememberScrollState;
                    }
                    kk0Var.s();
                    objP = kk0Var.P();
                    if (objP == Composer$Companion.getEmpty()) {
                        objP = new ni2(Boolean.FALSE);
                        kk0Var.l0(objP);
                    }
                    ni2Var = (ni2) objP;
                    ni2Var.c.setValue(Boolean.valueOf(z));
                    if (((Boolean) ni2Var.b.getValue()).booleanValue()) {
                        objP2 = kk0Var.P();
                        if (objP2 == Composer$Companion.getEmpty()) {
                            objP2 = cl3.d(new e54(e54.b));
                            kk0Var.l0(objP2);
                        }
                        mi2Var = (mi2) objP2;
                        wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                        if ((i4 & 7168) == 2048) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        zH = z2 | kk0Var.h(wu0Var);
                        objP3 = kk0Var.P();
                        if (zH) {
                            z3 = true;
                            objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                            kk0Var.l0(objP3);
                        } else {
                            z3 = true;
                            objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                            kk0Var.l0(objP3);
                        }
                        yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                    } else {
                        objP2 = kk0Var.P();
                        if (objP2 == Composer$Companion.getEmpty()) {
                            objP2 = cl3.d(new e54(e54.b));
                            kk0Var.l0(objP2);
                        }
                        mi2Var = (mi2) objP2;
                        wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                        if ((i4 & 7168) == 2048) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        zH = z2 | kk0Var.h(wu0Var);
                        objP3 = kk0Var.P();
                        if (zH) {
                            z3 = true;
                            objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                            kk0Var.l0(objP3);
                        } else {
                            z3 = true;
                            objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                            kk0Var.l0(objP3);
                        }
                        yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                    }
                    ux2Var3 = ux2Var2;
                    j4 = jE;
                    cVar4 = cVar3;
                    rb3Var3 = rb3Var2;
                    rg3Var2 = shape;
                    j5 = containerColor;
                    f6 = f4;
                    f7 = f5;
                    iwVar3 = iwVar2;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new vb(z, je1Var, cVar4, j4, rb3Var3, ux2Var3, rg3Var2, j5, f6, f7, iwVar3, oe1Var, i, i2, i3));
                }
            }
            i4 |= 805306368;
            i15 = i3 & 1024;
            if (i15 != 0) {
                i16 = i2 | 6;
            } else if ((i2 & 6) == 0) {
                if (kk0Var.h(iwVar)) {
                    i17 = 4;
                } else {
                    i17 = 2;
                }
                i16 = i2 | i17;
            } else {
                i16 = i2;
            }
            if ((i3 & 2048) != 0) {
                if ((i2 & 48) == 0) {
                    if (kk0Var.j(oe1Var)) {
                        i18 = 32;
                    } else {
                        i18 = 16;
                    }
                    i16 |= i18;
                }
                if ((i4 & 306783379) != 306783378) {
                    kk0Var.X();
                    if ((i & 1) != 0) {
                        if (i5 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i7 != 0) {
                            jE = xr0.E();
                        } else {
                            jE = j;
                        }
                        if ((i3 & 16) != 0) {
                            rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                            i4 &= -57345;
                        } else {
                            rb3VarRememberScrollState = rb3Var;
                        }
                        if (i9 != 0) {
                            ux2Var2 = a;
                        }
                        if ((i3 & 64) != 0) {
                            shape = ic2.a.getShape(kk0Var, 6);
                            i4 &= -3670017;
                        }
                        if ((i3 & Uuid.SIZE_BITS) != 0) {
                            containerColor = ic2.a.getContainerColor(kk0Var, 6);
                            i4 &= -29360129;
                        } else {
                            containerColor = j3;
                        }
                        if (i11 != 0) {
                            ic2 ic2Var111111111111111111113 = ic2.a;
                            f4 = 0.0f;
                        } else {
                            f4 = f3;
                        }
                        if (i13 != 0) {
                            ic2 ic2Var111111111111111111114 = ic2.a;
                            f5 = 3.0f;
                        } else {
                            f5 = f2;
                        }
                        if (i15 != 0) {
                            iwVar2 = null;
                        } else {
                            iwVar2 = iwVar;
                        }
                        rb3Var2 = rb3VarRememberScrollState;
                    } else {
                        if (i5 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i7 != 0) {
                            jE = xr0.E();
                        } else {
                            jE = j;
                        }
                        if ((i3 & 16) != 0) {
                            rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                            i4 &= -57345;
                        } else {
                            rb3VarRememberScrollState = rb3Var;
                        }
                        if (i9 != 0) {
                            ux2Var2 = a;
                        }
                        if ((i3 & 64) != 0) {
                            shape = ic2.a.getShape(kk0Var, 6);
                            i4 &= -3670017;
                        }
                        if ((i3 & Uuid.SIZE_BITS) != 0) {
                            containerColor = ic2.a.getContainerColor(kk0Var, 6);
                            i4 &= -29360129;
                        } else {
                            containerColor = j3;
                        }
                        if (i11 != 0) {
                            ic2 ic2Var111111111111111111115 = ic2.a;
                            f4 = 0.0f;
                        } else {
                            f4 = f3;
                        }
                        if (i13 != 0) {
                            ic2 ic2Var111111111111111111116 = ic2.a;
                            f5 = 3.0f;
                        } else {
                            f5 = f2;
                        }
                        if (i15 != 0) {
                            iwVar2 = null;
                        } else {
                            iwVar2 = iwVar;
                        }
                        rb3Var2 = rb3VarRememberScrollState;
                    }
                    kk0Var.s();
                    objP = kk0Var.P();
                    if (objP == Composer$Companion.getEmpty()) {
                        objP = new ni2(Boolean.FALSE);
                        kk0Var.l0(objP);
                    }
                    ni2Var = (ni2) objP;
                    ni2Var.c.setValue(Boolean.valueOf(z));
                    if (((Boolean) ni2Var.b.getValue()).booleanValue()) {
                        objP2 = kk0Var.P();
                        if (objP2 == Composer$Companion.getEmpty()) {
                            objP2 = cl3.d(new e54(e54.b));
                            kk0Var.l0(objP2);
                        }
                        mi2Var = (mi2) objP2;
                        wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                        if ((i4 & 7168) == 2048) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        zH = z2 | kk0Var.h(wu0Var);
                        objP3 = kk0Var.P();
                        if (zH) {
                            z3 = true;
                            objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                            kk0Var.l0(objP3);
                        } else {
                            z3 = true;
                            objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                            kk0Var.l0(objP3);
                        }
                        yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                    } else {
                        objP2 = kk0Var.P();
                        if (objP2 == Composer$Companion.getEmpty()) {
                            objP2 = cl3.d(new e54(e54.b));
                            kk0Var.l0(objP2);
                        }
                        mi2Var = (mi2) objP2;
                        wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                        if ((i4 & 7168) == 2048) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        zH = z2 | kk0Var.h(wu0Var);
                        objP3 = kk0Var.P();
                        if (zH) {
                            z3 = true;
                            objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                            kk0Var.l0(objP3);
                        } else {
                            z3 = true;
                            objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                            kk0Var.l0(objP3);
                        }
                        yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                    }
                    ux2Var3 = ux2Var2;
                    j4 = jE;
                    cVar4 = cVar3;
                    rb3Var3 = rb3Var2;
                    rg3Var2 = shape;
                    j5 = containerColor;
                    f6 = f4;
                    f7 = f5;
                    iwVar3 = iwVar2;
                } else {
                    kk0Var.X();
                    if ((i & 1) != 0) {
                        if (i5 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i7 != 0) {
                            jE = xr0.E();
                        } else {
                            jE = j;
                        }
                        if ((i3 & 16) != 0) {
                            rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                            i4 &= -57345;
                        } else {
                            rb3VarRememberScrollState = rb3Var;
                        }
                        if (i9 != 0) {
                            ux2Var2 = a;
                        }
                        if ((i3 & 64) != 0) {
                            shape = ic2.a.getShape(kk0Var, 6);
                            i4 &= -3670017;
                        }
                        if ((i3 & Uuid.SIZE_BITS) != 0) {
                            containerColor = ic2.a.getContainerColor(kk0Var, 6);
                            i4 &= -29360129;
                        } else {
                            containerColor = j3;
                        }
                        if (i11 != 0) {
                            ic2 ic2Var111111111111111111117 = ic2.a;
                            f4 = 0.0f;
                        } else {
                            f4 = f3;
                        }
                        if (i13 != 0) {
                            ic2 ic2Var111111111111111111118 = ic2.a;
                            f5 = 3.0f;
                        } else {
                            f5 = f2;
                        }
                        if (i15 != 0) {
                            iwVar2 = null;
                        } else {
                            iwVar2 = iwVar;
                        }
                        rb3Var2 = rb3VarRememberScrollState;
                    } else {
                        if (i5 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i7 != 0) {
                            jE = xr0.E();
                        } else {
                            jE = j;
                        }
                        if ((i3 & 16) != 0) {
                            rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                            i4 &= -57345;
                        } else {
                            rb3VarRememberScrollState = rb3Var;
                        }
                        if (i9 != 0) {
                            ux2Var2 = a;
                        }
                        if ((i3 & 64) != 0) {
                            shape = ic2.a.getShape(kk0Var, 6);
                            i4 &= -3670017;
                        }
                        if ((i3 & Uuid.SIZE_BITS) != 0) {
                            containerColor = ic2.a.getContainerColor(kk0Var, 6);
                            i4 &= -29360129;
                        } else {
                            containerColor = j3;
                        }
                        if (i11 != 0) {
                            ic2 ic2Var111111111111111111119 = ic2.a;
                            f4 = 0.0f;
                        } else {
                            f4 = f3;
                        }
                        if (i13 != 0) {
                            ic2 ic2Var1111111111111111111110 = ic2.a;
                            f5 = 3.0f;
                        } else {
                            f5 = f2;
                        }
                        if (i15 != 0) {
                            iwVar2 = null;
                        } else {
                            iwVar2 = iwVar;
                        }
                        rb3Var2 = rb3VarRememberScrollState;
                    }
                    kk0Var.s();
                    objP = kk0Var.P();
                    if (objP == Composer$Companion.getEmpty()) {
                        objP = new ni2(Boolean.FALSE);
                        kk0Var.l0(objP);
                    }
                    ni2Var = (ni2) objP;
                    ni2Var.c.setValue(Boolean.valueOf(z));
                    if (((Boolean) ni2Var.b.getValue()).booleanValue()) {
                        objP2 = kk0Var.P();
                        if (objP2 == Composer$Companion.getEmpty()) {
                            objP2 = cl3.d(new e54(e54.b));
                            kk0Var.l0(objP2);
                        }
                        mi2Var = (mi2) objP2;
                        wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                        if ((i4 & 7168) == 2048) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        zH = z2 | kk0Var.h(wu0Var);
                        objP3 = kk0Var.P();
                        if (zH) {
                            z3 = true;
                            objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                            kk0Var.l0(objP3);
                        } else {
                            z3 = true;
                            objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                            kk0Var.l0(objP3);
                        }
                        yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                    } else {
                        objP2 = kk0Var.P();
                        if (objP2 == Composer$Companion.getEmpty()) {
                            objP2 = cl3.d(new e54(e54.b));
                            kk0Var.l0(objP2);
                        }
                        mi2Var = (mi2) objP2;
                        wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                        if ((i4 & 7168) == 2048) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        zH = z2 | kk0Var.h(wu0Var);
                        objP3 = kk0Var.P();
                        if (zH) {
                            z3 = true;
                            objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                            kk0Var.l0(objP3);
                        } else {
                            z3 = true;
                            objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                            kk0Var.l0(objP3);
                        }
                        yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                    }
                    ux2Var3 = ux2Var2;
                    j4 = jE;
                    cVar4 = cVar3;
                    rb3Var3 = rb3Var2;
                    rg3Var2 = shape;
                    j5 = containerColor;
                    f6 = f4;
                    f7 = f5;
                    iwVar3 = iwVar2;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new vb(z, je1Var, cVar4, j4, rb3Var3, ux2Var3, rg3Var2, j5, f6, f7, iwVar3, oe1Var, i, i2, i3));
                }
            }
            i16 |= 48;
            if ((i4 & 306783379) != 306783378) {
                kk0Var.X();
                if ((i & 1) != 0) {
                    if (i5 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i7 != 0) {
                        jE = xr0.E();
                    } else {
                        jE = j;
                    }
                    if ((i3 & 16) != 0) {
                        rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                        i4 &= -57345;
                    } else {
                        rb3VarRememberScrollState = rb3Var;
                    }
                    if (i9 != 0) {
                        ux2Var2 = a;
                    }
                    if ((i3 & 64) != 0) {
                        shape = ic2.a.getShape(kk0Var, 6);
                        i4 &= -3670017;
                    }
                    if ((i3 & Uuid.SIZE_BITS) != 0) {
                        containerColor = ic2.a.getContainerColor(kk0Var, 6);
                        i4 &= -29360129;
                    } else {
                        containerColor = j3;
                    }
                    if (i11 != 0) {
                        ic2 ic2Var1111111111111111111111 = ic2.a;
                        f4 = 0.0f;
                    } else {
                        f4 = f3;
                    }
                    if (i13 != 0) {
                        ic2 ic2Var1111111111111111111112 = ic2.a;
                        f5 = 3.0f;
                    } else {
                        f5 = f2;
                    }
                    if (i15 != 0) {
                        iwVar2 = null;
                    } else {
                        iwVar2 = iwVar;
                    }
                    rb3Var2 = rb3VarRememberScrollState;
                } else {
                    if (i5 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i7 != 0) {
                        jE = xr0.E();
                    } else {
                        jE = j;
                    }
                    if ((i3 & 16) != 0) {
                        rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                        i4 &= -57345;
                    } else {
                        rb3VarRememberScrollState = rb3Var;
                    }
                    if (i9 != 0) {
                        ux2Var2 = a;
                    }
                    if ((i3 & 64) != 0) {
                        shape = ic2.a.getShape(kk0Var, 6);
                        i4 &= -3670017;
                    }
                    if ((i3 & Uuid.SIZE_BITS) != 0) {
                        containerColor = ic2.a.getContainerColor(kk0Var, 6);
                        i4 &= -29360129;
                    } else {
                        containerColor = j3;
                    }
                    if (i11 != 0) {
                        ic2 ic2Var1111111111111111111113 = ic2.a;
                        f4 = 0.0f;
                    } else {
                        f4 = f3;
                    }
                    if (i13 != 0) {
                        ic2 ic2Var1111111111111111111114 = ic2.a;
                        f5 = 3.0f;
                    } else {
                        f5 = f2;
                    }
                    if (i15 != 0) {
                        iwVar2 = null;
                    } else {
                        iwVar2 = iwVar;
                    }
                    rb3Var2 = rb3VarRememberScrollState;
                }
                kk0Var.s();
                objP = kk0Var.P();
                if (objP == Composer$Companion.getEmpty()) {
                    objP = new ni2(Boolean.FALSE);
                    kk0Var.l0(objP);
                }
                ni2Var = (ni2) objP;
                ni2Var.c.setValue(Boolean.valueOf(z));
                if (((Boolean) ni2Var.b.getValue()).booleanValue()) {
                    objP2 = kk0Var.P();
                    if (objP2 == Composer$Companion.getEmpty()) {
                        objP2 = cl3.d(new e54(e54.b));
                        kk0Var.l0(objP2);
                    }
                    mi2Var = (mi2) objP2;
                    wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                    if ((i4 & 7168) == 2048) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    zH = z2 | kk0Var.h(wu0Var);
                    objP3 = kk0Var.P();
                    if (zH) {
                        z3 = true;
                        objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                        kk0Var.l0(objP3);
                    } else {
                        z3 = true;
                        objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                        kk0Var.l0(objP3);
                    }
                    yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                } else {
                    objP2 = kk0Var.P();
                    if (objP2 == Composer$Companion.getEmpty()) {
                        objP2 = cl3.d(new e54(e54.b));
                        kk0Var.l0(objP2);
                    }
                    mi2Var = (mi2) objP2;
                    wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                    if ((i4 & 7168) == 2048) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    zH = z2 | kk0Var.h(wu0Var);
                    objP3 = kk0Var.P();
                    if (zH) {
                        z3 = true;
                        objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                        kk0Var.l0(objP3);
                    } else {
                        z3 = true;
                        objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                        kk0Var.l0(objP3);
                    }
                    yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                }
                ux2Var3 = ux2Var2;
                j4 = jE;
                cVar4 = cVar3;
                rb3Var3 = rb3Var2;
                rg3Var2 = shape;
                j5 = containerColor;
                f6 = f4;
                f7 = f5;
                iwVar3 = iwVar2;
            } else {
                kk0Var.X();
                if ((i & 1) != 0) {
                    if (i5 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i7 != 0) {
                        jE = xr0.E();
                    } else {
                        jE = j;
                    }
                    if ((i3 & 16) != 0) {
                        rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                        i4 &= -57345;
                    } else {
                        rb3VarRememberScrollState = rb3Var;
                    }
                    if (i9 != 0) {
                        ux2Var2 = a;
                    }
                    if ((i3 & 64) != 0) {
                        shape = ic2.a.getShape(kk0Var, 6);
                        i4 &= -3670017;
                    }
                    if ((i3 & Uuid.SIZE_BITS) != 0) {
                        containerColor = ic2.a.getContainerColor(kk0Var, 6);
                        i4 &= -29360129;
                    } else {
                        containerColor = j3;
                    }
                    if (i11 != 0) {
                        ic2 ic2Var1111111111111111111115 = ic2.a;
                        f4 = 0.0f;
                    } else {
                        f4 = f3;
                    }
                    if (i13 != 0) {
                        ic2 ic2Var1111111111111111111116 = ic2.a;
                        f5 = 3.0f;
                    } else {
                        f5 = f2;
                    }
                    if (i15 != 0) {
                        iwVar2 = null;
                    } else {
                        iwVar2 = iwVar;
                    }
                    rb3Var2 = rb3VarRememberScrollState;
                } else {
                    if (i5 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i7 != 0) {
                        jE = xr0.E();
                    } else {
                        jE = j;
                    }
                    if ((i3 & 16) != 0) {
                        rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                        i4 &= -57345;
                    } else {
                        rb3VarRememberScrollState = rb3Var;
                    }
                    if (i9 != 0) {
                        ux2Var2 = a;
                    }
                    if ((i3 & 64) != 0) {
                        shape = ic2.a.getShape(kk0Var, 6);
                        i4 &= -3670017;
                    }
                    if ((i3 & Uuid.SIZE_BITS) != 0) {
                        containerColor = ic2.a.getContainerColor(kk0Var, 6);
                        i4 &= -29360129;
                    } else {
                        containerColor = j3;
                    }
                    if (i11 != 0) {
                        ic2 ic2Var1111111111111111111117 = ic2.a;
                        f4 = 0.0f;
                    } else {
                        f4 = f3;
                    }
                    if (i13 != 0) {
                        ic2 ic2Var1111111111111111111118 = ic2.a;
                        f5 = 3.0f;
                    } else {
                        f5 = f2;
                    }
                    if (i15 != 0) {
                        iwVar2 = null;
                    } else {
                        iwVar2 = iwVar;
                    }
                    rb3Var2 = rb3VarRememberScrollState;
                }
                kk0Var.s();
                objP = kk0Var.P();
                if (objP == Composer$Companion.getEmpty()) {
                    objP = new ni2(Boolean.FALSE);
                    kk0Var.l0(objP);
                }
                ni2Var = (ni2) objP;
                ni2Var.c.setValue(Boolean.valueOf(z));
                if (((Boolean) ni2Var.b.getValue()).booleanValue()) {
                    objP2 = kk0Var.P();
                    if (objP2 == Composer$Companion.getEmpty()) {
                        objP2 = cl3.d(new e54(e54.b));
                        kk0Var.l0(objP2);
                    }
                    mi2Var = (mi2) objP2;
                    wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                    if ((i4 & 7168) == 2048) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    zH = z2 | kk0Var.h(wu0Var);
                    objP3 = kk0Var.P();
                    if (zH) {
                        z3 = true;
                        objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                        kk0Var.l0(objP3);
                    } else {
                        z3 = true;
                        objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                        kk0Var.l0(objP3);
                    }
                    yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                } else {
                    objP2 = kk0Var.P();
                    if (objP2 == Composer$Companion.getEmpty()) {
                        objP2 = cl3.d(new e54(e54.b));
                        kk0Var.l0(objP2);
                    }
                    mi2Var = (mi2) objP2;
                    wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                    if ((i4 & 7168) == 2048) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    zH = z2 | kk0Var.h(wu0Var);
                    objP3 = kk0Var.P();
                    if (zH) {
                        z3 = true;
                        objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                        kk0Var.l0(objP3);
                    } else {
                        z3 = true;
                        objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                        kk0Var.l0(objP3);
                    }
                    yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                }
                ux2Var3 = ux2Var2;
                j4 = jE;
                cVar4 = cVar3;
                rb3Var3 = rb3Var2;
                rg3Var2 = shape;
                j5 = containerColor;
                f6 = f4;
                f7 = f5;
                iwVar3 = iwVar2;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new vb(z, je1Var, cVar4, j4, rb3Var3, ux2Var3, rg3Var2, j5, f6, f7, iwVar3, oe1Var, i, i2, i3));
            }
        }
        i4 |= 3072;
        if ((i & 24576) != 0) {
            i4 |= ((i3 & 16) == 0 || !kk0Var.h(rb3Var)) ? ConstantsKt.DEFAULT_BUFFER_SIZE : 16384;
        }
        i9 = i3 & 32;
        if (i9 != 0) {
            i4 |= 196608;
            ux2Var2 = ux2Var;
        } else {
            ux2Var2 = ux2Var;
            if ((i & 196608) == 0) {
                if (kk0Var.h(ux2Var2)) {
                    i10 = 131072;
                } else {
                    i10 = 65536;
                }
                i4 |= i10;
            }
        }
        if ((i & 1572864) == 0) {
            shape = rg3Var;
            if ((i3 & 64) == 0) {
                i20 = 524288;
            } else {
                i20 = 524288;
            }
            i4 |= i20;
        } else {
            shape = rg3Var;
        }
        if ((i & 12582912) == 0) {
            j3 = j2;
            if ((i3 & Uuid.SIZE_BITS) == 0) {
                i19 = 4194304;
            } else {
                i19 = 4194304;
            }
            i4 |= i19;
        } else {
            j3 = j2;
        }
        i11 = i3 & FontInfo.NUMBER_OF_CHAR_CODES;
        if (i11 != 0) {
            i4 |= 100663296;
            f3 = f;
        } else {
            f3 = f;
            if ((i & 100663296) == 0) {
                if (kk0Var.e(f3)) {
                    i12 = 67108864;
                } else {
                    i12 = 33554432;
                }
                i4 |= i12;
            }
        }
        i13 = i3 & ConstantsKt.MINIMUM_BLOCK_SIZE;
        if (i13 != 0) {
            if ((i & 805306368) == 0) {
                if (kk0Var.e(f2)) {
                    i14 = 536870912;
                } else {
                    i14 = 268435456;
                }
                i4 |= i14;
            }
            i15 = i3 & 1024;
            if (i15 != 0) {
                i16 = i2 | 6;
            } else if ((i2 & 6) == 0) {
                if (kk0Var.h(iwVar)) {
                    i17 = 4;
                } else {
                    i17 = 2;
                }
                i16 = i2 | i17;
            } else {
                i16 = i2;
            }
            if ((i3 & 2048) != 0) {
                if ((i2 & 48) == 0) {
                    if (kk0Var.j(oe1Var)) {
                        i18 = 32;
                    } else {
                        i18 = 16;
                    }
                    i16 |= i18;
                }
                if ((i4 & 306783379) != 306783378) {
                    kk0Var.X();
                    if ((i & 1) != 0) {
                        if (i5 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i7 != 0) {
                            jE = xr0.E();
                        } else {
                            jE = j;
                        }
                        if ((i3 & 16) != 0) {
                            rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                            i4 &= -57345;
                        } else {
                            rb3VarRememberScrollState = rb3Var;
                        }
                        if (i9 != 0) {
                            ux2Var2 = a;
                        }
                        if ((i3 & 64) != 0) {
                            shape = ic2.a.getShape(kk0Var, 6);
                            i4 &= -3670017;
                        }
                        if ((i3 & Uuid.SIZE_BITS) != 0) {
                            containerColor = ic2.a.getContainerColor(kk0Var, 6);
                            i4 &= -29360129;
                        } else {
                            containerColor = j3;
                        }
                        if (i11 != 0) {
                            ic2 ic2Var1111111111111111111119 = ic2.a;
                            f4 = 0.0f;
                        } else {
                            f4 = f3;
                        }
                        if (i13 != 0) {
                            ic2 ic2Var11111111111111111111110 = ic2.a;
                            f5 = 3.0f;
                        } else {
                            f5 = f2;
                        }
                        if (i15 != 0) {
                            iwVar2 = null;
                        } else {
                            iwVar2 = iwVar;
                        }
                        rb3Var2 = rb3VarRememberScrollState;
                    } else {
                        if (i5 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i7 != 0) {
                            jE = xr0.E();
                        } else {
                            jE = j;
                        }
                        if ((i3 & 16) != 0) {
                            rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                            i4 &= -57345;
                        } else {
                            rb3VarRememberScrollState = rb3Var;
                        }
                        if (i9 != 0) {
                            ux2Var2 = a;
                        }
                        if ((i3 & 64) != 0) {
                            shape = ic2.a.getShape(kk0Var, 6);
                            i4 &= -3670017;
                        }
                        if ((i3 & Uuid.SIZE_BITS) != 0) {
                            containerColor = ic2.a.getContainerColor(kk0Var, 6);
                            i4 &= -29360129;
                        } else {
                            containerColor = j3;
                        }
                        if (i11 != 0) {
                            ic2 ic2Var11111111111111111111111 = ic2.a;
                            f4 = 0.0f;
                        } else {
                            f4 = f3;
                        }
                        if (i13 != 0) {
                            ic2 ic2Var11111111111111111111112 = ic2.a;
                            f5 = 3.0f;
                        } else {
                            f5 = f2;
                        }
                        if (i15 != 0) {
                            iwVar2 = null;
                        } else {
                            iwVar2 = iwVar;
                        }
                        rb3Var2 = rb3VarRememberScrollState;
                    }
                    kk0Var.s();
                    objP = kk0Var.P();
                    if (objP == Composer$Companion.getEmpty()) {
                        objP = new ni2(Boolean.FALSE);
                        kk0Var.l0(objP);
                    }
                    ni2Var = (ni2) objP;
                    ni2Var.c.setValue(Boolean.valueOf(z));
                    if (((Boolean) ni2Var.b.getValue()).booleanValue()) {
                        objP2 = kk0Var.P();
                        if (objP2 == Composer$Companion.getEmpty()) {
                            objP2 = cl3.d(new e54(e54.b));
                            kk0Var.l0(objP2);
                        }
                        mi2Var = (mi2) objP2;
                        wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                        if ((i4 & 7168) == 2048) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        zH = z2 | kk0Var.h(wu0Var);
                        objP3 = kk0Var.P();
                        if (zH) {
                            z3 = true;
                            objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                            kk0Var.l0(objP3);
                        } else {
                            z3 = true;
                            objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                            kk0Var.l0(objP3);
                        }
                        yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                    } else {
                        objP2 = kk0Var.P();
                        if (objP2 == Composer$Companion.getEmpty()) {
                            objP2 = cl3.d(new e54(e54.b));
                            kk0Var.l0(objP2);
                        }
                        mi2Var = (mi2) objP2;
                        wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                        if ((i4 & 7168) == 2048) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        zH = z2 | kk0Var.h(wu0Var);
                        objP3 = kk0Var.P();
                        if (zH) {
                            z3 = true;
                            objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                            kk0Var.l0(objP3);
                        } else {
                            z3 = true;
                            objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                            kk0Var.l0(objP3);
                        }
                        yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                    }
                    ux2Var3 = ux2Var2;
                    j4 = jE;
                    cVar4 = cVar3;
                    rb3Var3 = rb3Var2;
                    rg3Var2 = shape;
                    j5 = containerColor;
                    f6 = f4;
                    f7 = f5;
                    iwVar3 = iwVar2;
                } else {
                    kk0Var.X();
                    if ((i & 1) != 0) {
                        if (i5 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i7 != 0) {
                            jE = xr0.E();
                        } else {
                            jE = j;
                        }
                        if ((i3 & 16) != 0) {
                            rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                            i4 &= -57345;
                        } else {
                            rb3VarRememberScrollState = rb3Var;
                        }
                        if (i9 != 0) {
                            ux2Var2 = a;
                        }
                        if ((i3 & 64) != 0) {
                            shape = ic2.a.getShape(kk0Var, 6);
                            i4 &= -3670017;
                        }
                        if ((i3 & Uuid.SIZE_BITS) != 0) {
                            containerColor = ic2.a.getContainerColor(kk0Var, 6);
                            i4 &= -29360129;
                        } else {
                            containerColor = j3;
                        }
                        if (i11 != 0) {
                            ic2 ic2Var11111111111111111111113 = ic2.a;
                            f4 = 0.0f;
                        } else {
                            f4 = f3;
                        }
                        if (i13 != 0) {
                            ic2 ic2Var11111111111111111111114 = ic2.a;
                            f5 = 3.0f;
                        } else {
                            f5 = f2;
                        }
                        if (i15 != 0) {
                            iwVar2 = null;
                        } else {
                            iwVar2 = iwVar;
                        }
                        rb3Var2 = rb3VarRememberScrollState;
                    } else {
                        if (i5 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i7 != 0) {
                            jE = xr0.E();
                        } else {
                            jE = j;
                        }
                        if ((i3 & 16) != 0) {
                            rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                            i4 &= -57345;
                        } else {
                            rb3VarRememberScrollState = rb3Var;
                        }
                        if (i9 != 0) {
                            ux2Var2 = a;
                        }
                        if ((i3 & 64) != 0) {
                            shape = ic2.a.getShape(kk0Var, 6);
                            i4 &= -3670017;
                        }
                        if ((i3 & Uuid.SIZE_BITS) != 0) {
                            containerColor = ic2.a.getContainerColor(kk0Var, 6);
                            i4 &= -29360129;
                        } else {
                            containerColor = j3;
                        }
                        if (i11 != 0) {
                            ic2 ic2Var11111111111111111111115 = ic2.a;
                            f4 = 0.0f;
                        } else {
                            f4 = f3;
                        }
                        if (i13 != 0) {
                            ic2 ic2Var11111111111111111111116 = ic2.a;
                            f5 = 3.0f;
                        } else {
                            f5 = f2;
                        }
                        if (i15 != 0) {
                            iwVar2 = null;
                        } else {
                            iwVar2 = iwVar;
                        }
                        rb3Var2 = rb3VarRememberScrollState;
                    }
                    kk0Var.s();
                    objP = kk0Var.P();
                    if (objP == Composer$Companion.getEmpty()) {
                        objP = new ni2(Boolean.FALSE);
                        kk0Var.l0(objP);
                    }
                    ni2Var = (ni2) objP;
                    ni2Var.c.setValue(Boolean.valueOf(z));
                    if (((Boolean) ni2Var.b.getValue()).booleanValue()) {
                        objP2 = kk0Var.P();
                        if (objP2 == Composer$Companion.getEmpty()) {
                            objP2 = cl3.d(new e54(e54.b));
                            kk0Var.l0(objP2);
                        }
                        mi2Var = (mi2) objP2;
                        wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                        if ((i4 & 7168) == 2048) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        zH = z2 | kk0Var.h(wu0Var);
                        objP3 = kk0Var.P();
                        if (zH) {
                            z3 = true;
                            objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                            kk0Var.l0(objP3);
                        } else {
                            z3 = true;
                            objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                            kk0Var.l0(objP3);
                        }
                        yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                    } else {
                        objP2 = kk0Var.P();
                        if (objP2 == Composer$Companion.getEmpty()) {
                            objP2 = cl3.d(new e54(e54.b));
                            kk0Var.l0(objP2);
                        }
                        mi2Var = (mi2) objP2;
                        wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                        if ((i4 & 7168) == 2048) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        zH = z2 | kk0Var.h(wu0Var);
                        objP3 = kk0Var.P();
                        if (zH) {
                            z3 = true;
                            objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                            kk0Var.l0(objP3);
                        } else {
                            z3 = true;
                            objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                            kk0Var.l0(objP3);
                        }
                        yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                    }
                    ux2Var3 = ux2Var2;
                    j4 = jE;
                    cVar4 = cVar3;
                    rb3Var3 = rb3Var2;
                    rg3Var2 = shape;
                    j5 = containerColor;
                    f6 = f4;
                    f7 = f5;
                    iwVar3 = iwVar2;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new vb(z, je1Var, cVar4, j4, rb3Var3, ux2Var3, rg3Var2, j5, f6, f7, iwVar3, oe1Var, i, i2, i3));
                }
            }
            i16 |= 48;
            if ((i4 & 306783379) != 306783378) {
                kk0Var.X();
                if ((i & 1) != 0) {
                    if (i5 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i7 != 0) {
                        jE = xr0.E();
                    } else {
                        jE = j;
                    }
                    if ((i3 & 16) != 0) {
                        rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                        i4 &= -57345;
                    } else {
                        rb3VarRememberScrollState = rb3Var;
                    }
                    if (i9 != 0) {
                        ux2Var2 = a;
                    }
                    if ((i3 & 64) != 0) {
                        shape = ic2.a.getShape(kk0Var, 6);
                        i4 &= -3670017;
                    }
                    if ((i3 & Uuid.SIZE_BITS) != 0) {
                        containerColor = ic2.a.getContainerColor(kk0Var, 6);
                        i4 &= -29360129;
                    } else {
                        containerColor = j3;
                    }
                    if (i11 != 0) {
                        ic2 ic2Var11111111111111111111117 = ic2.a;
                        f4 = 0.0f;
                    } else {
                        f4 = f3;
                    }
                    if (i13 != 0) {
                        ic2 ic2Var11111111111111111111118 = ic2.a;
                        f5 = 3.0f;
                    } else {
                        f5 = f2;
                    }
                    if (i15 != 0) {
                        iwVar2 = null;
                    } else {
                        iwVar2 = iwVar;
                    }
                    rb3Var2 = rb3VarRememberScrollState;
                } else {
                    if (i5 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i7 != 0) {
                        jE = xr0.E();
                    } else {
                        jE = j;
                    }
                    if ((i3 & 16) != 0) {
                        rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                        i4 &= -57345;
                    } else {
                        rb3VarRememberScrollState = rb3Var;
                    }
                    if (i9 != 0) {
                        ux2Var2 = a;
                    }
                    if ((i3 & 64) != 0) {
                        shape = ic2.a.getShape(kk0Var, 6);
                        i4 &= -3670017;
                    }
                    if ((i3 & Uuid.SIZE_BITS) != 0) {
                        containerColor = ic2.a.getContainerColor(kk0Var, 6);
                        i4 &= -29360129;
                    } else {
                        containerColor = j3;
                    }
                    if (i11 != 0) {
                        ic2 ic2Var11111111111111111111119 = ic2.a;
                        f4 = 0.0f;
                    } else {
                        f4 = f3;
                    }
                    if (i13 != 0) {
                        ic2 ic2Var111111111111111111111110 = ic2.a;
                        f5 = 3.0f;
                    } else {
                        f5 = f2;
                    }
                    if (i15 != 0) {
                        iwVar2 = null;
                    } else {
                        iwVar2 = iwVar;
                    }
                    rb3Var2 = rb3VarRememberScrollState;
                }
                kk0Var.s();
                objP = kk0Var.P();
                if (objP == Composer$Companion.getEmpty()) {
                    objP = new ni2(Boolean.FALSE);
                    kk0Var.l0(objP);
                }
                ni2Var = (ni2) objP;
                ni2Var.c.setValue(Boolean.valueOf(z));
                if (((Boolean) ni2Var.b.getValue()).booleanValue()) {
                    objP2 = kk0Var.P();
                    if (objP2 == Composer$Companion.getEmpty()) {
                        objP2 = cl3.d(new e54(e54.b));
                        kk0Var.l0(objP2);
                    }
                    mi2Var = (mi2) objP2;
                    wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                    if ((i4 & 7168) == 2048) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    zH = z2 | kk0Var.h(wu0Var);
                    objP3 = kk0Var.P();
                    if (zH) {
                        z3 = true;
                        objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                        kk0Var.l0(objP3);
                    } else {
                        z3 = true;
                        objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                        kk0Var.l0(objP3);
                    }
                    yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                } else {
                    objP2 = kk0Var.P();
                    if (objP2 == Composer$Companion.getEmpty()) {
                        objP2 = cl3.d(new e54(e54.b));
                        kk0Var.l0(objP2);
                    }
                    mi2Var = (mi2) objP2;
                    wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                    if ((i4 & 7168) == 2048) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    zH = z2 | kk0Var.h(wu0Var);
                    objP3 = kk0Var.P();
                    if (zH) {
                        z3 = true;
                        objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                        kk0Var.l0(objP3);
                    } else {
                        z3 = true;
                        objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                        kk0Var.l0(objP3);
                    }
                    yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                }
                ux2Var3 = ux2Var2;
                j4 = jE;
                cVar4 = cVar3;
                rb3Var3 = rb3Var2;
                rg3Var2 = shape;
                j5 = containerColor;
                f6 = f4;
                f7 = f5;
                iwVar3 = iwVar2;
            } else {
                kk0Var.X();
                if ((i & 1) != 0) {
                    if (i5 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i7 != 0) {
                        jE = xr0.E();
                    } else {
                        jE = j;
                    }
                    if ((i3 & 16) != 0) {
                        rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                        i4 &= -57345;
                    } else {
                        rb3VarRememberScrollState = rb3Var;
                    }
                    if (i9 != 0) {
                        ux2Var2 = a;
                    }
                    if ((i3 & 64) != 0) {
                        shape = ic2.a.getShape(kk0Var, 6);
                        i4 &= -3670017;
                    }
                    if ((i3 & Uuid.SIZE_BITS) != 0) {
                        containerColor = ic2.a.getContainerColor(kk0Var, 6);
                        i4 &= -29360129;
                    } else {
                        containerColor = j3;
                    }
                    if (i11 != 0) {
                        ic2 ic2Var111111111111111111111111 = ic2.a;
                        f4 = 0.0f;
                    } else {
                        f4 = f3;
                    }
                    if (i13 != 0) {
                        ic2 ic2Var111111111111111111111112 = ic2.a;
                        f5 = 3.0f;
                    } else {
                        f5 = f2;
                    }
                    if (i15 != 0) {
                        iwVar2 = null;
                    } else {
                        iwVar2 = iwVar;
                    }
                    rb3Var2 = rb3VarRememberScrollState;
                } else {
                    if (i5 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i7 != 0) {
                        jE = xr0.E();
                    } else {
                        jE = j;
                    }
                    if ((i3 & 16) != 0) {
                        rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                        i4 &= -57345;
                    } else {
                        rb3VarRememberScrollState = rb3Var;
                    }
                    if (i9 != 0) {
                        ux2Var2 = a;
                    }
                    if ((i3 & 64) != 0) {
                        shape = ic2.a.getShape(kk0Var, 6);
                        i4 &= -3670017;
                    }
                    if ((i3 & Uuid.SIZE_BITS) != 0) {
                        containerColor = ic2.a.getContainerColor(kk0Var, 6);
                        i4 &= -29360129;
                    } else {
                        containerColor = j3;
                    }
                    if (i11 != 0) {
                        ic2 ic2Var111111111111111111111113 = ic2.a;
                        f4 = 0.0f;
                    } else {
                        f4 = f3;
                    }
                    if (i13 != 0) {
                        ic2 ic2Var111111111111111111111114 = ic2.a;
                        f5 = 3.0f;
                    } else {
                        f5 = f2;
                    }
                    if (i15 != 0) {
                        iwVar2 = null;
                    } else {
                        iwVar2 = iwVar;
                    }
                    rb3Var2 = rb3VarRememberScrollState;
                }
                kk0Var.s();
                objP = kk0Var.P();
                if (objP == Composer$Companion.getEmpty()) {
                    objP = new ni2(Boolean.FALSE);
                    kk0Var.l0(objP);
                }
                ni2Var = (ni2) objP;
                ni2Var.c.setValue(Boolean.valueOf(z));
                if (((Boolean) ni2Var.b.getValue()).booleanValue()) {
                    objP2 = kk0Var.P();
                    if (objP2 == Composer$Companion.getEmpty()) {
                        objP2 = cl3.d(new e54(e54.b));
                        kk0Var.l0(objP2);
                    }
                    mi2Var = (mi2) objP2;
                    wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                    if ((i4 & 7168) == 2048) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    zH = z2 | kk0Var.h(wu0Var);
                    objP3 = kk0Var.P();
                    if (zH) {
                        z3 = true;
                        objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                        kk0Var.l0(objP3);
                    } else {
                        z3 = true;
                        objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                        kk0Var.l0(objP3);
                    }
                    yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                } else {
                    objP2 = kk0Var.P();
                    if (objP2 == Composer$Companion.getEmpty()) {
                        objP2 = cl3.d(new e54(e54.b));
                        kk0Var.l0(objP2);
                    }
                    mi2Var = (mi2) objP2;
                    wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                    if ((i4 & 7168) == 2048) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    zH = z2 | kk0Var.h(wu0Var);
                    objP3 = kk0Var.P();
                    if (zH) {
                        z3 = true;
                        objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                        kk0Var.l0(objP3);
                    } else {
                        z3 = true;
                        objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                        kk0Var.l0(objP3);
                    }
                    yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                }
                ux2Var3 = ux2Var2;
                j4 = jE;
                cVar4 = cVar3;
                rb3Var3 = rb3Var2;
                rg3Var2 = shape;
                j5 = containerColor;
                f6 = f4;
                f7 = f5;
                iwVar3 = iwVar2;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new vb(z, je1Var, cVar4, j4, rb3Var3, ux2Var3, rg3Var2, j5, f6, f7, iwVar3, oe1Var, i, i2, i3));
            }
        }
        i4 |= 805306368;
        i15 = i3 & 1024;
        if (i15 != 0) {
            i16 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            if (kk0Var.h(iwVar)) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i16 = i2 | i17;
        } else {
            i16 = i2;
        }
        if ((i3 & 2048) != 0) {
            if ((i2 & 48) == 0) {
                if (kk0Var.j(oe1Var)) {
                    i18 = 32;
                } else {
                    i18 = 16;
                }
                i16 |= i18;
            }
            if ((i4 & 306783379) != 306783378) {
                kk0Var.X();
                if ((i & 1) != 0) {
                    if (i5 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i7 != 0) {
                        jE = xr0.E();
                    } else {
                        jE = j;
                    }
                    if ((i3 & 16) != 0) {
                        rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                        i4 &= -57345;
                    } else {
                        rb3VarRememberScrollState = rb3Var;
                    }
                    if (i9 != 0) {
                        ux2Var2 = a;
                    }
                    if ((i3 & 64) != 0) {
                        shape = ic2.a.getShape(kk0Var, 6);
                        i4 &= -3670017;
                    }
                    if ((i3 & Uuid.SIZE_BITS) != 0) {
                        containerColor = ic2.a.getContainerColor(kk0Var, 6);
                        i4 &= -29360129;
                    } else {
                        containerColor = j3;
                    }
                    if (i11 != 0) {
                        ic2 ic2Var111111111111111111111115 = ic2.a;
                        f4 = 0.0f;
                    } else {
                        f4 = f3;
                    }
                    if (i13 != 0) {
                        ic2 ic2Var111111111111111111111116 = ic2.a;
                        f5 = 3.0f;
                    } else {
                        f5 = f2;
                    }
                    if (i15 != 0) {
                        iwVar2 = null;
                    } else {
                        iwVar2 = iwVar;
                    }
                    rb3Var2 = rb3VarRememberScrollState;
                } else {
                    if (i5 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i7 != 0) {
                        jE = xr0.E();
                    } else {
                        jE = j;
                    }
                    if ((i3 & 16) != 0) {
                        rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                        i4 &= -57345;
                    } else {
                        rb3VarRememberScrollState = rb3Var;
                    }
                    if (i9 != 0) {
                        ux2Var2 = a;
                    }
                    if ((i3 & 64) != 0) {
                        shape = ic2.a.getShape(kk0Var, 6);
                        i4 &= -3670017;
                    }
                    if ((i3 & Uuid.SIZE_BITS) != 0) {
                        containerColor = ic2.a.getContainerColor(kk0Var, 6);
                        i4 &= -29360129;
                    } else {
                        containerColor = j3;
                    }
                    if (i11 != 0) {
                        ic2 ic2Var111111111111111111111117 = ic2.a;
                        f4 = 0.0f;
                    } else {
                        f4 = f3;
                    }
                    if (i13 != 0) {
                        ic2 ic2Var111111111111111111111118 = ic2.a;
                        f5 = 3.0f;
                    } else {
                        f5 = f2;
                    }
                    if (i15 != 0) {
                        iwVar2 = null;
                    } else {
                        iwVar2 = iwVar;
                    }
                    rb3Var2 = rb3VarRememberScrollState;
                }
                kk0Var.s();
                objP = kk0Var.P();
                if (objP == Composer$Companion.getEmpty()) {
                    objP = new ni2(Boolean.FALSE);
                    kk0Var.l0(objP);
                }
                ni2Var = (ni2) objP;
                ni2Var.c.setValue(Boolean.valueOf(z));
                if (((Boolean) ni2Var.b.getValue()).booleanValue()) {
                    objP2 = kk0Var.P();
                    if (objP2 == Composer$Companion.getEmpty()) {
                        objP2 = cl3.d(new e54(e54.b));
                        kk0Var.l0(objP2);
                    }
                    mi2Var = (mi2) objP2;
                    wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                    if ((i4 & 7168) == 2048) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    zH = z2 | kk0Var.h(wu0Var);
                    objP3 = kk0Var.P();
                    if (zH) {
                        z3 = true;
                        objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                        kk0Var.l0(objP3);
                    } else {
                        z3 = true;
                        objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                        kk0Var.l0(objP3);
                    }
                    yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                } else {
                    objP2 = kk0Var.P();
                    if (objP2 == Composer$Companion.getEmpty()) {
                        objP2 = cl3.d(new e54(e54.b));
                        kk0Var.l0(objP2);
                    }
                    mi2Var = (mi2) objP2;
                    wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                    if ((i4 & 7168) == 2048) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    zH = z2 | kk0Var.h(wu0Var);
                    objP3 = kk0Var.P();
                    if (zH) {
                        z3 = true;
                        objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                        kk0Var.l0(objP3);
                    } else {
                        z3 = true;
                        objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                        kk0Var.l0(objP3);
                    }
                    yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                }
                ux2Var3 = ux2Var2;
                j4 = jE;
                cVar4 = cVar3;
                rb3Var3 = rb3Var2;
                rg3Var2 = shape;
                j5 = containerColor;
                f6 = f4;
                f7 = f5;
                iwVar3 = iwVar2;
            } else {
                kk0Var.X();
                if ((i & 1) != 0) {
                    if (i5 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i7 != 0) {
                        jE = xr0.E();
                    } else {
                        jE = j;
                    }
                    if ((i3 & 16) != 0) {
                        rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                        i4 &= -57345;
                    } else {
                        rb3VarRememberScrollState = rb3Var;
                    }
                    if (i9 != 0) {
                        ux2Var2 = a;
                    }
                    if ((i3 & 64) != 0) {
                        shape = ic2.a.getShape(kk0Var, 6);
                        i4 &= -3670017;
                    }
                    if ((i3 & Uuid.SIZE_BITS) != 0) {
                        containerColor = ic2.a.getContainerColor(kk0Var, 6);
                        i4 &= -29360129;
                    } else {
                        containerColor = j3;
                    }
                    if (i11 != 0) {
                        ic2 ic2Var111111111111111111111119 = ic2.a;
                        f4 = 0.0f;
                    } else {
                        f4 = f3;
                    }
                    if (i13 != 0) {
                        ic2 ic2Var1111111111111111111111110 = ic2.a;
                        f5 = 3.0f;
                    } else {
                        f5 = f2;
                    }
                    if (i15 != 0) {
                        iwVar2 = null;
                    } else {
                        iwVar2 = iwVar;
                    }
                    rb3Var2 = rb3VarRememberScrollState;
                } else {
                    if (i5 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i7 != 0) {
                        jE = xr0.E();
                    } else {
                        jE = j;
                    }
                    if ((i3 & 16) != 0) {
                        rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                        i4 &= -57345;
                    } else {
                        rb3VarRememberScrollState = rb3Var;
                    }
                    if (i9 != 0) {
                        ux2Var2 = a;
                    }
                    if ((i3 & 64) != 0) {
                        shape = ic2.a.getShape(kk0Var, 6);
                        i4 &= -3670017;
                    }
                    if ((i3 & Uuid.SIZE_BITS) != 0) {
                        containerColor = ic2.a.getContainerColor(kk0Var, 6);
                        i4 &= -29360129;
                    } else {
                        containerColor = j3;
                    }
                    if (i11 != 0) {
                        ic2 ic2Var1111111111111111111111111 = ic2.a;
                        f4 = 0.0f;
                    } else {
                        f4 = f3;
                    }
                    if (i13 != 0) {
                        ic2 ic2Var1111111111111111111111112 = ic2.a;
                        f5 = 3.0f;
                    } else {
                        f5 = f2;
                    }
                    if (i15 != 0) {
                        iwVar2 = null;
                    } else {
                        iwVar2 = iwVar;
                    }
                    rb3Var2 = rb3VarRememberScrollState;
                }
                kk0Var.s();
                objP = kk0Var.P();
                if (objP == Composer$Companion.getEmpty()) {
                    objP = new ni2(Boolean.FALSE);
                    kk0Var.l0(objP);
                }
                ni2Var = (ni2) objP;
                ni2Var.c.setValue(Boolean.valueOf(z));
                if (((Boolean) ni2Var.b.getValue()).booleanValue()) {
                    objP2 = kk0Var.P();
                    if (objP2 == Composer$Companion.getEmpty()) {
                        objP2 = cl3.d(new e54(e54.b));
                        kk0Var.l0(objP2);
                    }
                    mi2Var = (mi2) objP2;
                    wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                    if ((i4 & 7168) == 2048) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    zH = z2 | kk0Var.h(wu0Var);
                    objP3 = kk0Var.P();
                    if (zH) {
                        z3 = true;
                        objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                        kk0Var.l0(objP3);
                    } else {
                        z3 = true;
                        objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                        kk0Var.l0(objP3);
                    }
                    yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                } else {
                    objP2 = kk0Var.P();
                    if (objP2 == Composer$Companion.getEmpty()) {
                        objP2 = cl3.d(new e54(e54.b));
                        kk0Var.l0(objP2);
                    }
                    mi2Var = (mi2) objP2;
                    wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                    if ((i4 & 7168) == 2048) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    zH = z2 | kk0Var.h(wu0Var);
                    objP3 = kk0Var.P();
                    if (zH) {
                        z3 = true;
                        objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                        kk0Var.l0(objP3);
                    } else {
                        z3 = true;
                        objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                        kk0Var.l0(objP3);
                    }
                    yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                }
                ux2Var3 = ux2Var2;
                j4 = jE;
                cVar4 = cVar3;
                rb3Var3 = rb3Var2;
                rg3Var2 = shape;
                j5 = containerColor;
                f6 = f4;
                f7 = f5;
                iwVar3 = iwVar2;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new vb(z, je1Var, cVar4, j4, rb3Var3, ux2Var3, rg3Var2, j5, f6, f7, iwVar3, oe1Var, i, i2, i3));
            }
        }
        i16 |= 48;
        if ((i4 & 306783379) != 306783378) {
            kk0Var.X();
            if ((i & 1) != 0) {
                if (i5 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if (i7 != 0) {
                    jE = xr0.E();
                } else {
                    jE = j;
                }
                if ((i3 & 16) != 0) {
                    rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                    i4 &= -57345;
                } else {
                    rb3VarRememberScrollState = rb3Var;
                }
                if (i9 != 0) {
                    ux2Var2 = a;
                }
                if ((i3 & 64) != 0) {
                    shape = ic2.a.getShape(kk0Var, 6);
                    i4 &= -3670017;
                }
                if ((i3 & Uuid.SIZE_BITS) != 0) {
                    containerColor = ic2.a.getContainerColor(kk0Var, 6);
                    i4 &= -29360129;
                } else {
                    containerColor = j3;
                }
                if (i11 != 0) {
                    ic2 ic2Var1111111111111111111111113 = ic2.a;
                    f4 = 0.0f;
                } else {
                    f4 = f3;
                }
                if (i13 != 0) {
                    ic2 ic2Var1111111111111111111111114 = ic2.a;
                    f5 = 3.0f;
                } else {
                    f5 = f2;
                }
                if (i15 != 0) {
                    iwVar2 = null;
                } else {
                    iwVar2 = iwVar;
                }
                rb3Var2 = rb3VarRememberScrollState;
            } else {
                if (i5 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if (i7 != 0) {
                    jE = xr0.E();
                } else {
                    jE = j;
                }
                if ((i3 & 16) != 0) {
                    rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                    i4 &= -57345;
                } else {
                    rb3VarRememberScrollState = rb3Var;
                }
                if (i9 != 0) {
                    ux2Var2 = a;
                }
                if ((i3 & 64) != 0) {
                    shape = ic2.a.getShape(kk0Var, 6);
                    i4 &= -3670017;
                }
                if ((i3 & Uuid.SIZE_BITS) != 0) {
                    containerColor = ic2.a.getContainerColor(kk0Var, 6);
                    i4 &= -29360129;
                } else {
                    containerColor = j3;
                }
                if (i11 != 0) {
                    ic2 ic2Var1111111111111111111111115 = ic2.a;
                    f4 = 0.0f;
                } else {
                    f4 = f3;
                }
                if (i13 != 0) {
                    ic2 ic2Var1111111111111111111111116 = ic2.a;
                    f5 = 3.0f;
                } else {
                    f5 = f2;
                }
                if (i15 != 0) {
                    iwVar2 = null;
                } else {
                    iwVar2 = iwVar;
                }
                rb3Var2 = rb3VarRememberScrollState;
            }
            kk0Var.s();
            objP = kk0Var.P();
            if (objP == Composer$Companion.getEmpty()) {
                objP = new ni2(Boolean.FALSE);
                kk0Var.l0(objP);
            }
            ni2Var = (ni2) objP;
            ni2Var.c.setValue(Boolean.valueOf(z));
            if (((Boolean) ni2Var.b.getValue()).booleanValue()) {
                objP2 = kk0Var.P();
                if (objP2 == Composer$Companion.getEmpty()) {
                    objP2 = cl3.d(new e54(e54.b));
                    kk0Var.l0(objP2);
                }
                mi2Var = (mi2) objP2;
                wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                if ((i4 & 7168) == 2048) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                zH = z2 | kk0Var.h(wu0Var);
                objP3 = kk0Var.P();
                if (zH) {
                    z3 = true;
                    objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                    kk0Var.l0(objP3);
                } else {
                    z3 = true;
                    objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                    kk0Var.l0(objP3);
                }
                yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
            } else {
                objP2 = kk0Var.P();
                if (objP2 == Composer$Companion.getEmpty()) {
                    objP2 = cl3.d(new e54(e54.b));
                    kk0Var.l0(objP2);
                }
                mi2Var = (mi2) objP2;
                wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                if ((i4 & 7168) == 2048) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                zH = z2 | kk0Var.h(wu0Var);
                objP3 = kk0Var.P();
                if (zH) {
                    z3 = true;
                    objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                    kk0Var.l0(objP3);
                } else {
                    z3 = true;
                    objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                    kk0Var.l0(objP3);
                }
                yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
            }
            ux2Var3 = ux2Var2;
            j4 = jE;
            cVar4 = cVar3;
            rb3Var3 = rb3Var2;
            rg3Var2 = shape;
            j5 = containerColor;
            f6 = f4;
            f7 = f5;
            iwVar3 = iwVar2;
        } else {
            kk0Var.X();
            if ((i & 1) != 0) {
                if (i5 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if (i7 != 0) {
                    jE = xr0.E();
                } else {
                    jE = j;
                }
                if ((i3 & 16) != 0) {
                    rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                    i4 &= -57345;
                } else {
                    rb3VarRememberScrollState = rb3Var;
                }
                if (i9 != 0) {
                    ux2Var2 = a;
                }
                if ((i3 & 64) != 0) {
                    shape = ic2.a.getShape(kk0Var, 6);
                    i4 &= -3670017;
                }
                if ((i3 & Uuid.SIZE_BITS) != 0) {
                    containerColor = ic2.a.getContainerColor(kk0Var, 6);
                    i4 &= -29360129;
                } else {
                    containerColor = j3;
                }
                if (i11 != 0) {
                    ic2 ic2Var1111111111111111111111117 = ic2.a;
                    f4 = 0.0f;
                } else {
                    f4 = f3;
                }
                if (i13 != 0) {
                    ic2 ic2Var1111111111111111111111118 = ic2.a;
                    f5 = 3.0f;
                } else {
                    f5 = f2;
                }
                if (i15 != 0) {
                    iwVar2 = null;
                } else {
                    iwVar2 = iwVar;
                }
                rb3Var2 = rb3VarRememberScrollState;
            } else {
                if (i5 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if (i7 != 0) {
                    jE = xr0.E();
                } else {
                    jE = j;
                }
                if ((i3 & 16) != 0) {
                    rb3VarRememberScrollState = mb3.rememberScrollState(0, kk0Var, 0, 1);
                    i4 &= -57345;
                } else {
                    rb3VarRememberScrollState = rb3Var;
                }
                if (i9 != 0) {
                    ux2Var2 = a;
                }
                if ((i3 & 64) != 0) {
                    shape = ic2.a.getShape(kk0Var, 6);
                    i4 &= -3670017;
                }
                if ((i3 & Uuid.SIZE_BITS) != 0) {
                    containerColor = ic2.a.getContainerColor(kk0Var, 6);
                    i4 &= -29360129;
                } else {
                    containerColor = j3;
                }
                if (i11 != 0) {
                    ic2 ic2Var1111111111111111111111119 = ic2.a;
                    f4 = 0.0f;
                } else {
                    f4 = f3;
                }
                if (i13 != 0) {
                    ic2 ic2Var11111111111111111111111110 = ic2.a;
                    f5 = 3.0f;
                } else {
                    f5 = f2;
                }
                if (i15 != 0) {
                    iwVar2 = null;
                } else {
                    iwVar2 = iwVar;
                }
                rb3Var2 = rb3VarRememberScrollState;
            }
            kk0Var.s();
            objP = kk0Var.P();
            if (objP == Composer$Companion.getEmpty()) {
                objP = new ni2(Boolean.FALSE);
                kk0Var.l0(objP);
            }
            ni2Var = (ni2) objP;
            ni2Var.c.setValue(Boolean.valueOf(z));
            if (((Boolean) ni2Var.b.getValue()).booleanValue()) {
                objP2 = kk0Var.P();
                if (objP2 == Composer$Companion.getEmpty()) {
                    objP2 = cl3.d(new e54(e54.b));
                    kk0Var.l0(objP2);
                }
                mi2Var = (mi2) objP2;
                wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                if ((i4 & 7168) == 2048) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                zH = z2 | kk0Var.h(wu0Var);
                objP3 = kk0Var.P();
                if (zH) {
                    z3 = true;
                    objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                    kk0Var.l0(objP3);
                } else {
                    z3 = true;
                    objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                    kk0Var.l0(objP3);
                }
                yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
            } else {
                objP2 = kk0Var.P();
                if (objP2 == Composer$Companion.getEmpty()) {
                    objP2 = cl3.d(new e54(e54.b));
                    kk0Var.l0(objP2);
                }
                mi2Var = (mi2) objP2;
                wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                if ((i4 & 7168) == 2048) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                zH = z2 | kk0Var.h(wu0Var);
                objP3 = kk0Var.P();
                if (zH) {
                    z3 = true;
                    objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                    kk0Var.l0(objP3);
                } else {
                    z3 = true;
                    objP3 = new t01(jE, wu0Var, new ea(1, mi2Var));
                    kk0Var.l0(objP3);
                }
                yc.Popup((t01) objP3, je1Var2, ux2Var2, zg0.rememberComposableLambda(2126968933, z3, new ub(cVar3, ni2Var, mi2Var, rb3Var2, shape, containerColor, f4, f5, iwVar2, oe1Var), kk0Var, 54), kk0Var, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
            }
            ux2Var3 = ux2Var2;
            j4 = jE;
            cVar4 = cVar3;
            rb3Var3 = rb3Var2;
            rg3Var2 = shape;
            j5 = containerColor;
            f6 = f4;
            f7 = f5;
            iwVar3 = iwVar2;
        }
        w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new vb(z, je1Var, cVar4, j4, rb3Var3, ux2Var3, rg3Var2, j5, f6, f7, iwVar3, oe1Var, i, i2, i3));
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x011f  */
    /* JADX WARN: Code duplicated, block: B:106:0x0135  */
    /* JADX WARN: Code duplicated, block: B:108:0x013f  */
    /* JADX WARN: Code duplicated, block: B:116:0x015e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:117:0x0160  */
    /* JADX WARN: Code duplicated, block: B:118:0x0163  */
    /* JADX WARN: Code duplicated, block: B:121:0x0167  */
    /* JADX WARN: Code duplicated, block: B:123:0x016a  */
    /* JADX WARN: Code duplicated, block: B:125:0x016d  */
    /* JADX WARN: Code duplicated, block: B:126:0x016f  */
    /* JADX WARN: Code duplicated, block: B:129:0x0174  */
    /* JADX WARN: Code duplicated, block: B:130:0x017e  */
    /* JADX WARN: Code duplicated, block: B:132:0x0181  */
    /* JADX WARN: Code duplicated, block: B:133:0x0184  */
    /* JADX WARN: Code duplicated, block: B:135:0x0188  */
    /* JADX WARN: Code duplicated, block: B:137:0x0195  */
    /* JADX WARN: Code duplicated, block: B:141:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:143:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0063  */
    /* JADX WARN: Code duplicated, block: B:38:0x0068  */
    /* JADX WARN: Code duplicated, block: B:40:0x006c  */
    /* JADX WARN: Code duplicated, block: B:42:0x0074  */
    /* JADX WARN: Code duplicated, block: B:43:0x0077  */
    /* JADX WARN: Code duplicated, block: B:47:0x007e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0083  */
    /* JADX WARN: Code duplicated, block: B:51:0x0087  */
    /* JADX WARN: Code duplicated, block: B:53:0x008f  */
    /* JADX WARN: Code duplicated, block: B:54:0x0092  */
    /* JADX WARN: Code duplicated, block: B:58:0x009b  */
    /* JADX WARN: Code duplicated, block: B:60:0x009f  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:64:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:71:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:77:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:88:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:91:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:93:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:95:0x0102  */
    /* JADX WARN: Code duplicated, block: B:97:0x010c  */
    /* JADX WARN: Code duplicated, block: B:98:0x010f  */
    public static final void DropdownMenuItem(ne1 ne1Var, je1 je1Var, c cVar, ne1 ne1Var2, ne1 ne1Var3, boolean z, kc2 kc2Var, hs2 hs2Var, gh2 gh2Var, ck0 ck0Var, int i, int i2) {
        ne1 ne1Var4;
        int i3;
        je1 je1Var2;
        c cVar2;
        int i4;
        ne1 ne1Var5;
        int i5;
        int i6;
        ne1 ne1Var6;
        int i7;
        int i8;
        boolean z2;
        int i9;
        kc2 kc2Var2;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        c cVar3;
        boolean z3;
        kc2 kc2VarItemColors;
        hs2 hs2Var2;
        gh2 gh2Var2;
        boolean z4;
        ne1 ne1Var7;
        kc2 kc2Var3;
        int i16;
        kk0 kk0Var;
        ne1 ne1Var8;
        ne1 ne1Var9;
        boolean z5;
        kc2 kc2Var4;
        hs2 hs2Var3;
        gh2 gh2Var3;
        w33 w33VarV;
        kk0 kk0Var2 = (kk0) ck0Var;
        kk0Var2.c0(1826340448);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            ne1Var4 = ne1Var;
        } else {
            ne1Var4 = ne1Var;
            if ((i & 6) == 0) {
                i3 = (kk0Var2.j(ne1Var4) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            je1Var2 = je1Var;
        } else {
            je1Var2 = je1Var;
            if ((i & 48) == 0) {
                i3 |= kk0Var2.j(je1Var2) ? 32 : 16;
            }
        }
        int i17 = i2 & 4;
        if (i17 == 0) {
            if ((i & 384) == 0) {
                cVar2 = cVar;
                i3 |= kk0Var2.h(cVar2) ? FontInfo.NUMBER_OF_CHAR_CODES : Uuid.SIZE_BITS;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    ne1Var5 = ne1Var2;
                    if (kk0Var2.j(ne1Var5)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 16;
                if (i6 != 0) {
                    if ((i & 24576) == 0) {
                        ne1Var6 = ne1Var3;
                        if (kk0Var2.j(ne1Var6)) {
                            i7 = 16384;
                        } else {
                            i7 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                        }
                        i3 |= i7;
                    }
                    i8 = i2 & 32;
                    if (i8 != 0) {
                        if ((196608 & i) == 0) {
                            z2 = z;
                            if (kk0Var2.i(z2)) {
                                i9 = 131072;
                            } else {
                                i9 = 65536;
                            }
                            i3 |= i9;
                        }
                        if ((1572864 & i) == 0) {
                            if ((i2 & 64) == 0) {
                                kc2Var2 = kc2Var;
                                int i18 = kk0Var2.h(kc2Var2) ? 1048576 : 524288;
                                i3 |= i18;
                            } else {
                                kc2Var2 = kc2Var;
                            }
                            i3 |= i18;
                        } else {
                            kc2Var2 = kc2Var;
                        }
                        i10 = i2 & Uuid.SIZE_BITS;
                        if (i10 != 0) {
                            i12 = i3 | 12582912;
                        } else {
                            i11 = i3;
                            if ((i & 12582912) == 0) {
                                if (kk0Var2.h(hs2Var)) {
                                    i13 = 8388608;
                                } else {
                                    i13 = 4194304;
                                }
                                i12 = i11 | i13;
                            } else {
                                i12 = i11;
                            }
                        }
                        i14 = i2 & FontInfo.NUMBER_OF_CHAR_CODES;
                        if (i14 != 0) {
                            if ((i & 100663296) == 0) {
                                if (kk0Var2.h(gh2Var)) {
                                    i15 = 67108864;
                                } else {
                                    i15 = 33554432;
                                }
                                i12 |= i15;
                            }
                            if ((i12 & 38347923) == 38347922 || !kk0Var2.F()) {
                                kk0Var2.X();
                                if ((i & 1) != 0 || kk0Var2.D()) {
                                    if (i17 != 0) {
                                        cVar3 = c.i;
                                    } else {
                                        cVar3 = cVar2;
                                    }
                                    if (i4 != 0) {
                                        ne1Var5 = null;
                                    }
                                    if (i6 != 0) {
                                        ne1Var6 = null;
                                    }
                                    if (i8 != 0) {
                                        z3 = true;
                                    } else {
                                        z3 = z2;
                                    }
                                    if ((i2 & 64) != 0) {
                                        kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                                        i12 &= -3670017;
                                    } else {
                                        kc2VarItemColors = kc2Var2;
                                    }
                                    if (i10 != 0) {
                                        hs2Var2 = ic2.b;
                                    } else {
                                        hs2Var2 = hs2Var;
                                    }
                                    if (i14 != 0) {
                                        gh2Var2 = null;
                                    } else {
                                        gh2Var2 = gh2Var;
                                    }
                                    z4 = z3;
                                    ne1Var7 = ne1Var5;
                                    kc2Var3 = kc2VarItemColors;
                                    i16 = i12;
                                } else {
                                    kk0Var2.V();
                                    if ((i2 & 64) != 0) {
                                        i12 &= -3670017;
                                    }
                                    hs2Var2 = hs2Var;
                                    gh2Var2 = gh2Var;
                                    ne1Var7 = ne1Var5;
                                    z4 = z2;
                                    kc2Var3 = kc2Var2;
                                    i16 = i12;
                                    cVar3 = cVar2;
                                }
                                ne1 ne1Var10 = ne1Var6;
                                kk0Var2.s();
                                kk0Var = kk0Var2;
                                cd2.DropdownMenuItemContent(ne1Var4, je1Var2, cVar3, ne1Var7, ne1Var10, z4, kc2Var3, hs2Var2, gh2Var2, kk0Var, i16 & 268435454);
                                cVar2 = cVar3;
                                ne1Var8 = ne1Var7;
                                ne1Var9 = ne1Var10;
                                z5 = z4;
                                kc2Var4 = kc2Var3;
                                hs2Var3 = hs2Var2;
                                gh2Var3 = gh2Var2;
                            } else {
                                kk0Var2.V();
                                hs2Var3 = hs2Var;
                                kk0Var = kk0Var2;
                                ne1Var8 = ne1Var5;
                                ne1Var9 = ne1Var6;
                                z5 = z2;
                                kc2Var4 = kc2Var2;
                                gh2Var3 = gh2Var;
                            }
                            w33VarV = kk0Var.v();
                            if (w33VarV != null) {
                                w33VarV.updateScope(new yb(ne1Var, je1Var, cVar2, ne1Var8, ne1Var9, z5, kc2Var4, hs2Var3, gh2Var3, i, i2));
                            }
                        }
                        i12 |= 100663296;
                        if ((i12 & 38347923) == 38347922) {
                            kk0Var2.X();
                            if ((i & 1) != 0) {
                                if (i17 != 0) {
                                    cVar3 = c.i;
                                } else {
                                    cVar3 = cVar2;
                                }
                                if (i4 != 0) {
                                    ne1Var5 = null;
                                }
                                if (i6 != 0) {
                                    ne1Var6 = null;
                                }
                                if (i8 != 0) {
                                    z3 = true;
                                } else {
                                    z3 = z2;
                                }
                                if ((i2 & 64) != 0) {
                                    kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                                    i12 &= -3670017;
                                } else {
                                    kc2VarItemColors = kc2Var2;
                                }
                                if (i10 != 0) {
                                    hs2Var2 = ic2.b;
                                } else {
                                    hs2Var2 = hs2Var;
                                }
                                if (i14 != 0) {
                                    gh2Var2 = null;
                                } else {
                                    gh2Var2 = gh2Var;
                                }
                                z4 = z3;
                                ne1Var7 = ne1Var5;
                                kc2Var3 = kc2VarItemColors;
                                i16 = i12;
                            } else {
                                if (i17 != 0) {
                                    cVar3 = c.i;
                                } else {
                                    cVar3 = cVar2;
                                }
                                if (i4 != 0) {
                                    ne1Var5 = null;
                                }
                                if (i6 != 0) {
                                    ne1Var6 = null;
                                }
                                if (i8 != 0) {
                                    z3 = true;
                                } else {
                                    z3 = z2;
                                }
                                if ((i2 & 64) != 0) {
                                    kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                                    i12 &= -3670017;
                                } else {
                                    kc2VarItemColors = kc2Var2;
                                }
                                if (i10 != 0) {
                                    hs2Var2 = ic2.b;
                                } else {
                                    hs2Var2 = hs2Var;
                                }
                                if (i14 != 0) {
                                    gh2Var2 = null;
                                } else {
                                    gh2Var2 = gh2Var;
                                }
                                z4 = z3;
                                ne1Var7 = ne1Var5;
                                kc2Var3 = kc2VarItemColors;
                                i16 = i12;
                            }
                            ne1 ne1Var11 = ne1Var6;
                            kk0Var2.s();
                            kk0Var = kk0Var2;
                            cd2.DropdownMenuItemContent(ne1Var4, je1Var2, cVar3, ne1Var7, ne1Var11, z4, kc2Var3, hs2Var2, gh2Var2, kk0Var, i16 & 268435454);
                            cVar2 = cVar3;
                            ne1Var8 = ne1Var7;
                            ne1Var9 = ne1Var11;
                            z5 = z4;
                            kc2Var4 = kc2Var3;
                            hs2Var3 = hs2Var2;
                            gh2Var3 = gh2Var2;
                        } else {
                            kk0Var2.X();
                            if ((i & 1) != 0) {
                                if (i17 != 0) {
                                    cVar3 = c.i;
                                } else {
                                    cVar3 = cVar2;
                                }
                                if (i4 != 0) {
                                    ne1Var5 = null;
                                }
                                if (i6 != 0) {
                                    ne1Var6 = null;
                                }
                                if (i8 != 0) {
                                    z3 = true;
                                } else {
                                    z3 = z2;
                                }
                                if ((i2 & 64) != 0) {
                                    kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                                    i12 &= -3670017;
                                } else {
                                    kc2VarItemColors = kc2Var2;
                                }
                                if (i10 != 0) {
                                    hs2Var2 = ic2.b;
                                } else {
                                    hs2Var2 = hs2Var;
                                }
                                if (i14 != 0) {
                                    gh2Var2 = null;
                                } else {
                                    gh2Var2 = gh2Var;
                                }
                                z4 = z3;
                                ne1Var7 = ne1Var5;
                                kc2Var3 = kc2VarItemColors;
                                i16 = i12;
                            } else {
                                if (i17 != 0) {
                                    cVar3 = c.i;
                                } else {
                                    cVar3 = cVar2;
                                }
                                if (i4 != 0) {
                                    ne1Var5 = null;
                                }
                                if (i6 != 0) {
                                    ne1Var6 = null;
                                }
                                if (i8 != 0) {
                                    z3 = true;
                                } else {
                                    z3 = z2;
                                }
                                if ((i2 & 64) != 0) {
                                    kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                                    i12 &= -3670017;
                                } else {
                                    kc2VarItemColors = kc2Var2;
                                }
                                if (i10 != 0) {
                                    hs2Var2 = ic2.b;
                                } else {
                                    hs2Var2 = hs2Var;
                                }
                                if (i14 != 0) {
                                    gh2Var2 = null;
                                } else {
                                    gh2Var2 = gh2Var;
                                }
                                z4 = z3;
                                ne1Var7 = ne1Var5;
                                kc2Var3 = kc2VarItemColors;
                                i16 = i12;
                            }
                            ne1 ne1Var12 = ne1Var6;
                            kk0Var2.s();
                            kk0Var = kk0Var2;
                            cd2.DropdownMenuItemContent(ne1Var4, je1Var2, cVar3, ne1Var7, ne1Var12, z4, kc2Var3, hs2Var2, gh2Var2, kk0Var, i16 & 268435454);
                            cVar2 = cVar3;
                            ne1Var8 = ne1Var7;
                            ne1Var9 = ne1Var12;
                            z5 = z4;
                            kc2Var4 = kc2Var3;
                            hs2Var3 = hs2Var2;
                            gh2Var3 = gh2Var2;
                        }
                        w33VarV = kk0Var.v();
                        if (w33VarV != null) {
                            w33VarV.updateScope(new yb(ne1Var, je1Var, cVar2, ne1Var8, ne1Var9, z5, kc2Var4, hs2Var3, gh2Var3, i, i2));
                        }
                    }
                    i3 |= 196608;
                    z2 = z;
                    if ((1572864 & i) == 0) {
                        if ((i2 & 64) == 0) {
                            kc2Var2 = kc2Var;
                            if (kk0Var2.h(kc2Var2)) {
                            }
                            i3 |= i18;
                        } else {
                            kc2Var2 = kc2Var;
                        }
                        i3 |= i18;
                    } else {
                        kc2Var2 = kc2Var;
                    }
                    i10 = i2 & Uuid.SIZE_BITS;
                    if (i10 != 0) {
                        i12 = i3 | 12582912;
                    } else {
                        i11 = i3;
                        if ((i & 12582912) == 0) {
                            if (kk0Var2.h(hs2Var)) {
                                i13 = 8388608;
                            } else {
                                i13 = 4194304;
                            }
                            i12 = i11 | i13;
                        } else {
                            i12 = i11;
                        }
                    }
                    i14 = i2 & FontInfo.NUMBER_OF_CHAR_CODES;
                    if (i14 != 0) {
                        if ((i & 100663296) == 0) {
                            if (kk0Var2.h(gh2Var)) {
                                i15 = 67108864;
                            } else {
                                i15 = 33554432;
                            }
                            i12 |= i15;
                        }
                        if ((i12 & 38347923) == 38347922) {
                            kk0Var2.X();
                            if ((i & 1) != 0) {
                                if (i17 != 0) {
                                    cVar3 = c.i;
                                } else {
                                    cVar3 = cVar2;
                                }
                                if (i4 != 0) {
                                    ne1Var5 = null;
                                }
                                if (i6 != 0) {
                                    ne1Var6 = null;
                                }
                                if (i8 != 0) {
                                    z3 = true;
                                } else {
                                    z3 = z2;
                                }
                                if ((i2 & 64) != 0) {
                                    kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                                    i12 &= -3670017;
                                } else {
                                    kc2VarItemColors = kc2Var2;
                                }
                                if (i10 != 0) {
                                    hs2Var2 = ic2.b;
                                } else {
                                    hs2Var2 = hs2Var;
                                }
                                if (i14 != 0) {
                                    gh2Var2 = null;
                                } else {
                                    gh2Var2 = gh2Var;
                                }
                                z4 = z3;
                                ne1Var7 = ne1Var5;
                                kc2Var3 = kc2VarItemColors;
                                i16 = i12;
                            } else {
                                if (i17 != 0) {
                                    cVar3 = c.i;
                                } else {
                                    cVar3 = cVar2;
                                }
                                if (i4 != 0) {
                                    ne1Var5 = null;
                                }
                                if (i6 != 0) {
                                    ne1Var6 = null;
                                }
                                if (i8 != 0) {
                                    z3 = true;
                                } else {
                                    z3 = z2;
                                }
                                if ((i2 & 64) != 0) {
                                    kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                                    i12 &= -3670017;
                                } else {
                                    kc2VarItemColors = kc2Var2;
                                }
                                if (i10 != 0) {
                                    hs2Var2 = ic2.b;
                                } else {
                                    hs2Var2 = hs2Var;
                                }
                                if (i14 != 0) {
                                    gh2Var2 = null;
                                } else {
                                    gh2Var2 = gh2Var;
                                }
                                z4 = z3;
                                ne1Var7 = ne1Var5;
                                kc2Var3 = kc2VarItemColors;
                                i16 = i12;
                            }
                            ne1 ne1Var13 = ne1Var6;
                            kk0Var2.s();
                            kk0Var = kk0Var2;
                            cd2.DropdownMenuItemContent(ne1Var4, je1Var2, cVar3, ne1Var7, ne1Var13, z4, kc2Var3, hs2Var2, gh2Var2, kk0Var, i16 & 268435454);
                            cVar2 = cVar3;
                            ne1Var8 = ne1Var7;
                            ne1Var9 = ne1Var13;
                            z5 = z4;
                            kc2Var4 = kc2Var3;
                            hs2Var3 = hs2Var2;
                            gh2Var3 = gh2Var2;
                        } else {
                            kk0Var2.X();
                            if ((i & 1) != 0) {
                                if (i17 != 0) {
                                    cVar3 = c.i;
                                } else {
                                    cVar3 = cVar2;
                                }
                                if (i4 != 0) {
                                    ne1Var5 = null;
                                }
                                if (i6 != 0) {
                                    ne1Var6 = null;
                                }
                                if (i8 != 0) {
                                    z3 = true;
                                } else {
                                    z3 = z2;
                                }
                                if ((i2 & 64) != 0) {
                                    kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                                    i12 &= -3670017;
                                } else {
                                    kc2VarItemColors = kc2Var2;
                                }
                                if (i10 != 0) {
                                    hs2Var2 = ic2.b;
                                } else {
                                    hs2Var2 = hs2Var;
                                }
                                if (i14 != 0) {
                                    gh2Var2 = null;
                                } else {
                                    gh2Var2 = gh2Var;
                                }
                                z4 = z3;
                                ne1Var7 = ne1Var5;
                                kc2Var3 = kc2VarItemColors;
                                i16 = i12;
                            } else {
                                if (i17 != 0) {
                                    cVar3 = c.i;
                                } else {
                                    cVar3 = cVar2;
                                }
                                if (i4 != 0) {
                                    ne1Var5 = null;
                                }
                                if (i6 != 0) {
                                    ne1Var6 = null;
                                }
                                if (i8 != 0) {
                                    z3 = true;
                                } else {
                                    z3 = z2;
                                }
                                if ((i2 & 64) != 0) {
                                    kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                                    i12 &= -3670017;
                                } else {
                                    kc2VarItemColors = kc2Var2;
                                }
                                if (i10 != 0) {
                                    hs2Var2 = ic2.b;
                                } else {
                                    hs2Var2 = hs2Var;
                                }
                                if (i14 != 0) {
                                    gh2Var2 = null;
                                } else {
                                    gh2Var2 = gh2Var;
                                }
                                z4 = z3;
                                ne1Var7 = ne1Var5;
                                kc2Var3 = kc2VarItemColors;
                                i16 = i12;
                            }
                            ne1 ne1Var14 = ne1Var6;
                            kk0Var2.s();
                            kk0Var = kk0Var2;
                            cd2.DropdownMenuItemContent(ne1Var4, je1Var2, cVar3, ne1Var7, ne1Var14, z4, kc2Var3, hs2Var2, gh2Var2, kk0Var, i16 & 268435454);
                            cVar2 = cVar3;
                            ne1Var8 = ne1Var7;
                            ne1Var9 = ne1Var14;
                            z5 = z4;
                            kc2Var4 = kc2Var3;
                            hs2Var3 = hs2Var2;
                            gh2Var3 = gh2Var2;
                        }
                        w33VarV = kk0Var.v();
                        if (w33VarV != null) {
                            w33VarV.updateScope(new yb(ne1Var, je1Var, cVar2, ne1Var8, ne1Var9, z5, kc2Var4, hs2Var3, gh2Var3, i, i2));
                        }
                    }
                    i12 |= 100663296;
                    if ((i12 & 38347923) == 38347922) {
                        kk0Var2.X();
                        if ((i & 1) != 0) {
                            if (i17 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i4 != 0) {
                                ne1Var5 = null;
                            }
                            if (i6 != 0) {
                                ne1Var6 = null;
                            }
                            if (i8 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if ((i2 & 64) != 0) {
                                kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                                i12 &= -3670017;
                            } else {
                                kc2VarItemColors = kc2Var2;
                            }
                            if (i10 != 0) {
                                hs2Var2 = ic2.b;
                            } else {
                                hs2Var2 = hs2Var;
                            }
                            if (i14 != 0) {
                                gh2Var2 = null;
                            } else {
                                gh2Var2 = gh2Var;
                            }
                            z4 = z3;
                            ne1Var7 = ne1Var5;
                            kc2Var3 = kc2VarItemColors;
                            i16 = i12;
                        } else {
                            if (i17 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i4 != 0) {
                                ne1Var5 = null;
                            }
                            if (i6 != 0) {
                                ne1Var6 = null;
                            }
                            if (i8 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if ((i2 & 64) != 0) {
                                kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                                i12 &= -3670017;
                            } else {
                                kc2VarItemColors = kc2Var2;
                            }
                            if (i10 != 0) {
                                hs2Var2 = ic2.b;
                            } else {
                                hs2Var2 = hs2Var;
                            }
                            if (i14 != 0) {
                                gh2Var2 = null;
                            } else {
                                gh2Var2 = gh2Var;
                            }
                            z4 = z3;
                            ne1Var7 = ne1Var5;
                            kc2Var3 = kc2VarItemColors;
                            i16 = i12;
                        }
                        ne1 ne1Var15 = ne1Var6;
                        kk0Var2.s();
                        kk0Var = kk0Var2;
                        cd2.DropdownMenuItemContent(ne1Var4, je1Var2, cVar3, ne1Var7, ne1Var15, z4, kc2Var3, hs2Var2, gh2Var2, kk0Var, i16 & 268435454);
                        cVar2 = cVar3;
                        ne1Var8 = ne1Var7;
                        ne1Var9 = ne1Var15;
                        z5 = z4;
                        kc2Var4 = kc2Var3;
                        hs2Var3 = hs2Var2;
                        gh2Var3 = gh2Var2;
                    } else {
                        kk0Var2.X();
                        if ((i & 1) != 0) {
                            if (i17 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i4 != 0) {
                                ne1Var5 = null;
                            }
                            if (i6 != 0) {
                                ne1Var6 = null;
                            }
                            if (i8 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if ((i2 & 64) != 0) {
                                kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                                i12 &= -3670017;
                            } else {
                                kc2VarItemColors = kc2Var2;
                            }
                            if (i10 != 0) {
                                hs2Var2 = ic2.b;
                            } else {
                                hs2Var2 = hs2Var;
                            }
                            if (i14 != 0) {
                                gh2Var2 = null;
                            } else {
                                gh2Var2 = gh2Var;
                            }
                            z4 = z3;
                            ne1Var7 = ne1Var5;
                            kc2Var3 = kc2VarItemColors;
                            i16 = i12;
                        } else {
                            if (i17 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i4 != 0) {
                                ne1Var5 = null;
                            }
                            if (i6 != 0) {
                                ne1Var6 = null;
                            }
                            if (i8 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if ((i2 & 64) != 0) {
                                kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                                i12 &= -3670017;
                            } else {
                                kc2VarItemColors = kc2Var2;
                            }
                            if (i10 != 0) {
                                hs2Var2 = ic2.b;
                            } else {
                                hs2Var2 = hs2Var;
                            }
                            if (i14 != 0) {
                                gh2Var2 = null;
                            } else {
                                gh2Var2 = gh2Var;
                            }
                            z4 = z3;
                            ne1Var7 = ne1Var5;
                            kc2Var3 = kc2VarItemColors;
                            i16 = i12;
                        }
                        ne1 ne1Var16 = ne1Var6;
                        kk0Var2.s();
                        kk0Var = kk0Var2;
                        cd2.DropdownMenuItemContent(ne1Var4, je1Var2, cVar3, ne1Var7, ne1Var16, z4, kc2Var3, hs2Var2, gh2Var2, kk0Var, i16 & 268435454);
                        cVar2 = cVar3;
                        ne1Var8 = ne1Var7;
                        ne1Var9 = ne1Var16;
                        z5 = z4;
                        kc2Var4 = kc2Var3;
                        hs2Var3 = hs2Var2;
                        gh2Var3 = gh2Var2;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new yb(ne1Var, je1Var, cVar2, ne1Var8, ne1Var9, z5, kc2Var4, hs2Var3, gh2Var3, i, i2));
                    }
                }
                i3 |= 24576;
                ne1Var6 = ne1Var3;
                i8 = i2 & 32;
                if (i8 != 0) {
                    if ((196608 & i) == 0) {
                        z2 = z;
                        if (kk0Var2.i(z2)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    }
                    if ((1572864 & i) == 0) {
                        if ((i2 & 64) == 0) {
                            kc2Var2 = kc2Var;
                            if (kk0Var2.h(kc2Var2)) {
                            }
                            i3 |= i18;
                        } else {
                            kc2Var2 = kc2Var;
                        }
                        i3 |= i18;
                    } else {
                        kc2Var2 = kc2Var;
                    }
                    i10 = i2 & Uuid.SIZE_BITS;
                    if (i10 != 0) {
                        i12 = i3 | 12582912;
                    } else {
                        i11 = i3;
                        if ((i & 12582912) == 0) {
                            if (kk0Var2.h(hs2Var)) {
                                i13 = 8388608;
                            } else {
                                i13 = 4194304;
                            }
                            i12 = i11 | i13;
                        } else {
                            i12 = i11;
                        }
                    }
                    i14 = i2 & FontInfo.NUMBER_OF_CHAR_CODES;
                    if (i14 != 0) {
                        if ((i & 100663296) == 0) {
                            if (kk0Var2.h(gh2Var)) {
                                i15 = 67108864;
                            } else {
                                i15 = 33554432;
                            }
                            i12 |= i15;
                        }
                        if ((i12 & 38347923) == 38347922) {
                            kk0Var2.X();
                            if ((i & 1) != 0) {
                                if (i17 != 0) {
                                    cVar3 = c.i;
                                } else {
                                    cVar3 = cVar2;
                                }
                                if (i4 != 0) {
                                    ne1Var5 = null;
                                }
                                if (i6 != 0) {
                                    ne1Var6 = null;
                                }
                                if (i8 != 0) {
                                    z3 = true;
                                } else {
                                    z3 = z2;
                                }
                                if ((i2 & 64) != 0) {
                                    kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                                    i12 &= -3670017;
                                } else {
                                    kc2VarItemColors = kc2Var2;
                                }
                                if (i10 != 0) {
                                    hs2Var2 = ic2.b;
                                } else {
                                    hs2Var2 = hs2Var;
                                }
                                if (i14 != 0) {
                                    gh2Var2 = null;
                                } else {
                                    gh2Var2 = gh2Var;
                                }
                                z4 = z3;
                                ne1Var7 = ne1Var5;
                                kc2Var3 = kc2VarItemColors;
                                i16 = i12;
                            } else {
                                if (i17 != 0) {
                                    cVar3 = c.i;
                                } else {
                                    cVar3 = cVar2;
                                }
                                if (i4 != 0) {
                                    ne1Var5 = null;
                                }
                                if (i6 != 0) {
                                    ne1Var6 = null;
                                }
                                if (i8 != 0) {
                                    z3 = true;
                                } else {
                                    z3 = z2;
                                }
                                if ((i2 & 64) != 0) {
                                    kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                                    i12 &= -3670017;
                                } else {
                                    kc2VarItemColors = kc2Var2;
                                }
                                if (i10 != 0) {
                                    hs2Var2 = ic2.b;
                                } else {
                                    hs2Var2 = hs2Var;
                                }
                                if (i14 != 0) {
                                    gh2Var2 = null;
                                } else {
                                    gh2Var2 = gh2Var;
                                }
                                z4 = z3;
                                ne1Var7 = ne1Var5;
                                kc2Var3 = kc2VarItemColors;
                                i16 = i12;
                            }
                            ne1 ne1Var17 = ne1Var6;
                            kk0Var2.s();
                            kk0Var = kk0Var2;
                            cd2.DropdownMenuItemContent(ne1Var4, je1Var2, cVar3, ne1Var7, ne1Var17, z4, kc2Var3, hs2Var2, gh2Var2, kk0Var, i16 & 268435454);
                            cVar2 = cVar3;
                            ne1Var8 = ne1Var7;
                            ne1Var9 = ne1Var17;
                            z5 = z4;
                            kc2Var4 = kc2Var3;
                            hs2Var3 = hs2Var2;
                            gh2Var3 = gh2Var2;
                        } else {
                            kk0Var2.X();
                            if ((i & 1) != 0) {
                                if (i17 != 0) {
                                    cVar3 = c.i;
                                } else {
                                    cVar3 = cVar2;
                                }
                                if (i4 != 0) {
                                    ne1Var5 = null;
                                }
                                if (i6 != 0) {
                                    ne1Var6 = null;
                                }
                                if (i8 != 0) {
                                    z3 = true;
                                } else {
                                    z3 = z2;
                                }
                                if ((i2 & 64) != 0) {
                                    kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                                    i12 &= -3670017;
                                } else {
                                    kc2VarItemColors = kc2Var2;
                                }
                                if (i10 != 0) {
                                    hs2Var2 = ic2.b;
                                } else {
                                    hs2Var2 = hs2Var;
                                }
                                if (i14 != 0) {
                                    gh2Var2 = null;
                                } else {
                                    gh2Var2 = gh2Var;
                                }
                                z4 = z3;
                                ne1Var7 = ne1Var5;
                                kc2Var3 = kc2VarItemColors;
                                i16 = i12;
                            } else {
                                if (i17 != 0) {
                                    cVar3 = c.i;
                                } else {
                                    cVar3 = cVar2;
                                }
                                if (i4 != 0) {
                                    ne1Var5 = null;
                                }
                                if (i6 != 0) {
                                    ne1Var6 = null;
                                }
                                if (i8 != 0) {
                                    z3 = true;
                                } else {
                                    z3 = z2;
                                }
                                if ((i2 & 64) != 0) {
                                    kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                                    i12 &= -3670017;
                                } else {
                                    kc2VarItemColors = kc2Var2;
                                }
                                if (i10 != 0) {
                                    hs2Var2 = ic2.b;
                                } else {
                                    hs2Var2 = hs2Var;
                                }
                                if (i14 != 0) {
                                    gh2Var2 = null;
                                } else {
                                    gh2Var2 = gh2Var;
                                }
                                z4 = z3;
                                ne1Var7 = ne1Var5;
                                kc2Var3 = kc2VarItemColors;
                                i16 = i12;
                            }
                            ne1 ne1Var18 = ne1Var6;
                            kk0Var2.s();
                            kk0Var = kk0Var2;
                            cd2.DropdownMenuItemContent(ne1Var4, je1Var2, cVar3, ne1Var7, ne1Var18, z4, kc2Var3, hs2Var2, gh2Var2, kk0Var, i16 & 268435454);
                            cVar2 = cVar3;
                            ne1Var8 = ne1Var7;
                            ne1Var9 = ne1Var18;
                            z5 = z4;
                            kc2Var4 = kc2Var3;
                            hs2Var3 = hs2Var2;
                            gh2Var3 = gh2Var2;
                        }
                        w33VarV = kk0Var.v();
                        if (w33VarV != null) {
                            w33VarV.updateScope(new yb(ne1Var, je1Var, cVar2, ne1Var8, ne1Var9, z5, kc2Var4, hs2Var3, gh2Var3, i, i2));
                        }
                    }
                    i12 |= 100663296;
                    if ((i12 & 38347923) == 38347922) {
                        kk0Var2.X();
                        if ((i & 1) != 0) {
                            if (i17 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i4 != 0) {
                                ne1Var5 = null;
                            }
                            if (i6 != 0) {
                                ne1Var6 = null;
                            }
                            if (i8 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if ((i2 & 64) != 0) {
                                kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                                i12 &= -3670017;
                            } else {
                                kc2VarItemColors = kc2Var2;
                            }
                            if (i10 != 0) {
                                hs2Var2 = ic2.b;
                            } else {
                                hs2Var2 = hs2Var;
                            }
                            if (i14 != 0) {
                                gh2Var2 = null;
                            } else {
                                gh2Var2 = gh2Var;
                            }
                            z4 = z3;
                            ne1Var7 = ne1Var5;
                            kc2Var3 = kc2VarItemColors;
                            i16 = i12;
                        } else {
                            if (i17 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i4 != 0) {
                                ne1Var5 = null;
                            }
                            if (i6 != 0) {
                                ne1Var6 = null;
                            }
                            if (i8 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if ((i2 & 64) != 0) {
                                kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                                i12 &= -3670017;
                            } else {
                                kc2VarItemColors = kc2Var2;
                            }
                            if (i10 != 0) {
                                hs2Var2 = ic2.b;
                            } else {
                                hs2Var2 = hs2Var;
                            }
                            if (i14 != 0) {
                                gh2Var2 = null;
                            } else {
                                gh2Var2 = gh2Var;
                            }
                            z4 = z3;
                            ne1Var7 = ne1Var5;
                            kc2Var3 = kc2VarItemColors;
                            i16 = i12;
                        }
                        ne1 ne1Var19 = ne1Var6;
                        kk0Var2.s();
                        kk0Var = kk0Var2;
                        cd2.DropdownMenuItemContent(ne1Var4, je1Var2, cVar3, ne1Var7, ne1Var19, z4, kc2Var3, hs2Var2, gh2Var2, kk0Var, i16 & 268435454);
                        cVar2 = cVar3;
                        ne1Var8 = ne1Var7;
                        ne1Var9 = ne1Var19;
                        z5 = z4;
                        kc2Var4 = kc2Var3;
                        hs2Var3 = hs2Var2;
                        gh2Var3 = gh2Var2;
                    } else {
                        kk0Var2.X();
                        if ((i & 1) != 0) {
                            if (i17 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i4 != 0) {
                                ne1Var5 = null;
                            }
                            if (i6 != 0) {
                                ne1Var6 = null;
                            }
                            if (i8 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if ((i2 & 64) != 0) {
                                kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                                i12 &= -3670017;
                            } else {
                                kc2VarItemColors = kc2Var2;
                            }
                            if (i10 != 0) {
                                hs2Var2 = ic2.b;
                            } else {
                                hs2Var2 = hs2Var;
                            }
                            if (i14 != 0) {
                                gh2Var2 = null;
                            } else {
                                gh2Var2 = gh2Var;
                            }
                            z4 = z3;
                            ne1Var7 = ne1Var5;
                            kc2Var3 = kc2VarItemColors;
                            i16 = i12;
                        } else {
                            if (i17 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i4 != 0) {
                                ne1Var5 = null;
                            }
                            if (i6 != 0) {
                                ne1Var6 = null;
                            }
                            if (i8 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if ((i2 & 64) != 0) {
                                kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                                i12 &= -3670017;
                            } else {
                                kc2VarItemColors = kc2Var2;
                            }
                            if (i10 != 0) {
                                hs2Var2 = ic2.b;
                            } else {
                                hs2Var2 = hs2Var;
                            }
                            if (i14 != 0) {
                                gh2Var2 = null;
                            } else {
                                gh2Var2 = gh2Var;
                            }
                            z4 = z3;
                            ne1Var7 = ne1Var5;
                            kc2Var3 = kc2VarItemColors;
                            i16 = i12;
                        }
                        ne1 ne1Var110 = ne1Var6;
                        kk0Var2.s();
                        kk0Var = kk0Var2;
                        cd2.DropdownMenuItemContent(ne1Var4, je1Var2, cVar3, ne1Var7, ne1Var110, z4, kc2Var3, hs2Var2, gh2Var2, kk0Var, i16 & 268435454);
                        cVar2 = cVar3;
                        ne1Var8 = ne1Var7;
                        ne1Var9 = ne1Var110;
                        z5 = z4;
                        kc2Var4 = kc2Var3;
                        hs2Var3 = hs2Var2;
                        gh2Var3 = gh2Var2;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new yb(ne1Var, je1Var, cVar2, ne1Var8, ne1Var9, z5, kc2Var4, hs2Var3, gh2Var3, i, i2));
                    }
                }
                i3 |= 196608;
                z2 = z;
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        kc2Var2 = kc2Var;
                        if (kk0Var2.h(kc2Var2)) {
                        }
                        i3 |= i18;
                    } else {
                        kc2Var2 = kc2Var;
                    }
                    i3 |= i18;
                } else {
                    kc2Var2 = kc2Var;
                }
                i10 = i2 & Uuid.SIZE_BITS;
                if (i10 != 0) {
                    i12 = i3 | 12582912;
                } else {
                    i11 = i3;
                    if ((i & 12582912) == 0) {
                        if (kk0Var2.h(hs2Var)) {
                            i13 = 8388608;
                        } else {
                            i13 = 4194304;
                        }
                        i12 = i11 | i13;
                    } else {
                        i12 = i11;
                    }
                }
                i14 = i2 & FontInfo.NUMBER_OF_CHAR_CODES;
                if (i14 != 0) {
                    if ((i & 100663296) == 0) {
                        if (kk0Var2.h(gh2Var)) {
                            i15 = 67108864;
                        } else {
                            i15 = 33554432;
                        }
                        i12 |= i15;
                    }
                    if ((i12 & 38347923) == 38347922) {
                        kk0Var2.X();
                        if ((i & 1) != 0) {
                            if (i17 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i4 != 0) {
                                ne1Var5 = null;
                            }
                            if (i6 != 0) {
                                ne1Var6 = null;
                            }
                            if (i8 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if ((i2 & 64) != 0) {
                                kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                                i12 &= -3670017;
                            } else {
                                kc2VarItemColors = kc2Var2;
                            }
                            if (i10 != 0) {
                                hs2Var2 = ic2.b;
                            } else {
                                hs2Var2 = hs2Var;
                            }
                            if (i14 != 0) {
                                gh2Var2 = null;
                            } else {
                                gh2Var2 = gh2Var;
                            }
                            z4 = z3;
                            ne1Var7 = ne1Var5;
                            kc2Var3 = kc2VarItemColors;
                            i16 = i12;
                        } else {
                            if (i17 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i4 != 0) {
                                ne1Var5 = null;
                            }
                            if (i6 != 0) {
                                ne1Var6 = null;
                            }
                            if (i8 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if ((i2 & 64) != 0) {
                                kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                                i12 &= -3670017;
                            } else {
                                kc2VarItemColors = kc2Var2;
                            }
                            if (i10 != 0) {
                                hs2Var2 = ic2.b;
                            } else {
                                hs2Var2 = hs2Var;
                            }
                            if (i14 != 0) {
                                gh2Var2 = null;
                            } else {
                                gh2Var2 = gh2Var;
                            }
                            z4 = z3;
                            ne1Var7 = ne1Var5;
                            kc2Var3 = kc2VarItemColors;
                            i16 = i12;
                        }
                        ne1 ne1Var111 = ne1Var6;
                        kk0Var2.s();
                        kk0Var = kk0Var2;
                        cd2.DropdownMenuItemContent(ne1Var4, je1Var2, cVar3, ne1Var7, ne1Var111, z4, kc2Var3, hs2Var2, gh2Var2, kk0Var, i16 & 268435454);
                        cVar2 = cVar3;
                        ne1Var8 = ne1Var7;
                        ne1Var9 = ne1Var111;
                        z5 = z4;
                        kc2Var4 = kc2Var3;
                        hs2Var3 = hs2Var2;
                        gh2Var3 = gh2Var2;
                    } else {
                        kk0Var2.X();
                        if ((i & 1) != 0) {
                            if (i17 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i4 != 0) {
                                ne1Var5 = null;
                            }
                            if (i6 != 0) {
                                ne1Var6 = null;
                            }
                            if (i8 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if ((i2 & 64) != 0) {
                                kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                                i12 &= -3670017;
                            } else {
                                kc2VarItemColors = kc2Var2;
                            }
                            if (i10 != 0) {
                                hs2Var2 = ic2.b;
                            } else {
                                hs2Var2 = hs2Var;
                            }
                            if (i14 != 0) {
                                gh2Var2 = null;
                            } else {
                                gh2Var2 = gh2Var;
                            }
                            z4 = z3;
                            ne1Var7 = ne1Var5;
                            kc2Var3 = kc2VarItemColors;
                            i16 = i12;
                        } else {
                            if (i17 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i4 != 0) {
                                ne1Var5 = null;
                            }
                            if (i6 != 0) {
                                ne1Var6 = null;
                            }
                            if (i8 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if ((i2 & 64) != 0) {
                                kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                                i12 &= -3670017;
                            } else {
                                kc2VarItemColors = kc2Var2;
                            }
                            if (i10 != 0) {
                                hs2Var2 = ic2.b;
                            } else {
                                hs2Var2 = hs2Var;
                            }
                            if (i14 != 0) {
                                gh2Var2 = null;
                            } else {
                                gh2Var2 = gh2Var;
                            }
                            z4 = z3;
                            ne1Var7 = ne1Var5;
                            kc2Var3 = kc2VarItemColors;
                            i16 = i12;
                        }
                        ne1 ne1Var112 = ne1Var6;
                        kk0Var2.s();
                        kk0Var = kk0Var2;
                        cd2.DropdownMenuItemContent(ne1Var4, je1Var2, cVar3, ne1Var7, ne1Var112, z4, kc2Var3, hs2Var2, gh2Var2, kk0Var, i16 & 268435454);
                        cVar2 = cVar3;
                        ne1Var8 = ne1Var7;
                        ne1Var9 = ne1Var112;
                        z5 = z4;
                        kc2Var4 = kc2Var3;
                        hs2Var3 = hs2Var2;
                        gh2Var3 = gh2Var2;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new yb(ne1Var, je1Var, cVar2, ne1Var8, ne1Var9, z5, kc2Var4, hs2Var3, gh2Var3, i, i2));
                    }
                }
                i12 |= 100663296;
                if ((i12 & 38347923) == 38347922) {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i17 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            ne1Var5 = null;
                        }
                        if (i6 != 0) {
                            ne1Var6 = null;
                        }
                        if (i8 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if ((i2 & 64) != 0) {
                            kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                            i12 &= -3670017;
                        } else {
                            kc2VarItemColors = kc2Var2;
                        }
                        if (i10 != 0) {
                            hs2Var2 = ic2.b;
                        } else {
                            hs2Var2 = hs2Var;
                        }
                        if (i14 != 0) {
                            gh2Var2 = null;
                        } else {
                            gh2Var2 = gh2Var;
                        }
                        z4 = z3;
                        ne1Var7 = ne1Var5;
                        kc2Var3 = kc2VarItemColors;
                        i16 = i12;
                    } else {
                        if (i17 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            ne1Var5 = null;
                        }
                        if (i6 != 0) {
                            ne1Var6 = null;
                        }
                        if (i8 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if ((i2 & 64) != 0) {
                            kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                            i12 &= -3670017;
                        } else {
                            kc2VarItemColors = kc2Var2;
                        }
                        if (i10 != 0) {
                            hs2Var2 = ic2.b;
                        } else {
                            hs2Var2 = hs2Var;
                        }
                        if (i14 != 0) {
                            gh2Var2 = null;
                        } else {
                            gh2Var2 = gh2Var;
                        }
                        z4 = z3;
                        ne1Var7 = ne1Var5;
                        kc2Var3 = kc2VarItemColors;
                        i16 = i12;
                    }
                    ne1 ne1Var113 = ne1Var6;
                    kk0Var2.s();
                    kk0Var = kk0Var2;
                    cd2.DropdownMenuItemContent(ne1Var4, je1Var2, cVar3, ne1Var7, ne1Var113, z4, kc2Var3, hs2Var2, gh2Var2, kk0Var, i16 & 268435454);
                    cVar2 = cVar3;
                    ne1Var8 = ne1Var7;
                    ne1Var9 = ne1Var113;
                    z5 = z4;
                    kc2Var4 = kc2Var3;
                    hs2Var3 = hs2Var2;
                    gh2Var3 = gh2Var2;
                } else {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i17 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            ne1Var5 = null;
                        }
                        if (i6 != 0) {
                            ne1Var6 = null;
                        }
                        if (i8 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if ((i2 & 64) != 0) {
                            kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                            i12 &= -3670017;
                        } else {
                            kc2VarItemColors = kc2Var2;
                        }
                        if (i10 != 0) {
                            hs2Var2 = ic2.b;
                        } else {
                            hs2Var2 = hs2Var;
                        }
                        if (i14 != 0) {
                            gh2Var2 = null;
                        } else {
                            gh2Var2 = gh2Var;
                        }
                        z4 = z3;
                        ne1Var7 = ne1Var5;
                        kc2Var3 = kc2VarItemColors;
                        i16 = i12;
                    } else {
                        if (i17 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            ne1Var5 = null;
                        }
                        if (i6 != 0) {
                            ne1Var6 = null;
                        }
                        if (i8 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if ((i2 & 64) != 0) {
                            kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                            i12 &= -3670017;
                        } else {
                            kc2VarItemColors = kc2Var2;
                        }
                        if (i10 != 0) {
                            hs2Var2 = ic2.b;
                        } else {
                            hs2Var2 = hs2Var;
                        }
                        if (i14 != 0) {
                            gh2Var2 = null;
                        } else {
                            gh2Var2 = gh2Var;
                        }
                        z4 = z3;
                        ne1Var7 = ne1Var5;
                        kc2Var3 = kc2VarItemColors;
                        i16 = i12;
                    }
                    ne1 ne1Var114 = ne1Var6;
                    kk0Var2.s();
                    kk0Var = kk0Var2;
                    cd2.DropdownMenuItemContent(ne1Var4, je1Var2, cVar3, ne1Var7, ne1Var114, z4, kc2Var3, hs2Var2, gh2Var2, kk0Var, i16 & 268435454);
                    cVar2 = cVar3;
                    ne1Var8 = ne1Var7;
                    ne1Var9 = ne1Var114;
                    z5 = z4;
                    kc2Var4 = kc2Var3;
                    hs2Var3 = hs2Var2;
                    gh2Var3 = gh2Var2;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new yb(ne1Var, je1Var, cVar2, ne1Var8, ne1Var9, z5, kc2Var4, hs2Var3, gh2Var3, i, i2));
                }
            }
            i3 |= 3072;
            ne1Var5 = ne1Var2;
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    ne1Var6 = ne1Var3;
                    if (kk0Var2.j(ne1Var6)) {
                        i7 = 16384;
                    } else {
                        i7 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 32;
                if (i8 != 0) {
                    if ((196608 & i) == 0) {
                        z2 = z;
                        if (kk0Var2.i(z2)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    }
                    if ((1572864 & i) == 0) {
                        if ((i2 & 64) == 0) {
                            kc2Var2 = kc2Var;
                            if (kk0Var2.h(kc2Var2)) {
                            }
                            i3 |= i18;
                        } else {
                            kc2Var2 = kc2Var;
                        }
                        i3 |= i18;
                    } else {
                        kc2Var2 = kc2Var;
                    }
                    i10 = i2 & Uuid.SIZE_BITS;
                    if (i10 != 0) {
                        i12 = i3 | 12582912;
                    } else {
                        i11 = i3;
                        if ((i & 12582912) == 0) {
                            if (kk0Var2.h(hs2Var)) {
                                i13 = 8388608;
                            } else {
                                i13 = 4194304;
                            }
                            i12 = i11 | i13;
                        } else {
                            i12 = i11;
                        }
                    }
                    i14 = i2 & FontInfo.NUMBER_OF_CHAR_CODES;
                    if (i14 != 0) {
                        if ((i & 100663296) == 0) {
                            if (kk0Var2.h(gh2Var)) {
                                i15 = 67108864;
                            } else {
                                i15 = 33554432;
                            }
                            i12 |= i15;
                        }
                        if ((i12 & 38347923) == 38347922) {
                            kk0Var2.X();
                            if ((i & 1) != 0) {
                                if (i17 != 0) {
                                    cVar3 = c.i;
                                } else {
                                    cVar3 = cVar2;
                                }
                                if (i4 != 0) {
                                    ne1Var5 = null;
                                }
                                if (i6 != 0) {
                                    ne1Var6 = null;
                                }
                                if (i8 != 0) {
                                    z3 = true;
                                } else {
                                    z3 = z2;
                                }
                                if ((i2 & 64) != 0) {
                                    kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                                    i12 &= -3670017;
                                } else {
                                    kc2VarItemColors = kc2Var2;
                                }
                                if (i10 != 0) {
                                    hs2Var2 = ic2.b;
                                } else {
                                    hs2Var2 = hs2Var;
                                }
                                if (i14 != 0) {
                                    gh2Var2 = null;
                                } else {
                                    gh2Var2 = gh2Var;
                                }
                                z4 = z3;
                                ne1Var7 = ne1Var5;
                                kc2Var3 = kc2VarItemColors;
                                i16 = i12;
                            } else {
                                if (i17 != 0) {
                                    cVar3 = c.i;
                                } else {
                                    cVar3 = cVar2;
                                }
                                if (i4 != 0) {
                                    ne1Var5 = null;
                                }
                                if (i6 != 0) {
                                    ne1Var6 = null;
                                }
                                if (i8 != 0) {
                                    z3 = true;
                                } else {
                                    z3 = z2;
                                }
                                if ((i2 & 64) != 0) {
                                    kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                                    i12 &= -3670017;
                                } else {
                                    kc2VarItemColors = kc2Var2;
                                }
                                if (i10 != 0) {
                                    hs2Var2 = ic2.b;
                                } else {
                                    hs2Var2 = hs2Var;
                                }
                                if (i14 != 0) {
                                    gh2Var2 = null;
                                } else {
                                    gh2Var2 = gh2Var;
                                }
                                z4 = z3;
                                ne1Var7 = ne1Var5;
                                kc2Var3 = kc2VarItemColors;
                                i16 = i12;
                            }
                            ne1 ne1Var115 = ne1Var6;
                            kk0Var2.s();
                            kk0Var = kk0Var2;
                            cd2.DropdownMenuItemContent(ne1Var4, je1Var2, cVar3, ne1Var7, ne1Var115, z4, kc2Var3, hs2Var2, gh2Var2, kk0Var, i16 & 268435454);
                            cVar2 = cVar3;
                            ne1Var8 = ne1Var7;
                            ne1Var9 = ne1Var115;
                            z5 = z4;
                            kc2Var4 = kc2Var3;
                            hs2Var3 = hs2Var2;
                            gh2Var3 = gh2Var2;
                        } else {
                            kk0Var2.X();
                            if ((i & 1) != 0) {
                                if (i17 != 0) {
                                    cVar3 = c.i;
                                } else {
                                    cVar3 = cVar2;
                                }
                                if (i4 != 0) {
                                    ne1Var5 = null;
                                }
                                if (i6 != 0) {
                                    ne1Var6 = null;
                                }
                                if (i8 != 0) {
                                    z3 = true;
                                } else {
                                    z3 = z2;
                                }
                                if ((i2 & 64) != 0) {
                                    kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                                    i12 &= -3670017;
                                } else {
                                    kc2VarItemColors = kc2Var2;
                                }
                                if (i10 != 0) {
                                    hs2Var2 = ic2.b;
                                } else {
                                    hs2Var2 = hs2Var;
                                }
                                if (i14 != 0) {
                                    gh2Var2 = null;
                                } else {
                                    gh2Var2 = gh2Var;
                                }
                                z4 = z3;
                                ne1Var7 = ne1Var5;
                                kc2Var3 = kc2VarItemColors;
                                i16 = i12;
                            } else {
                                if (i17 != 0) {
                                    cVar3 = c.i;
                                } else {
                                    cVar3 = cVar2;
                                }
                                if (i4 != 0) {
                                    ne1Var5 = null;
                                }
                                if (i6 != 0) {
                                    ne1Var6 = null;
                                }
                                if (i8 != 0) {
                                    z3 = true;
                                } else {
                                    z3 = z2;
                                }
                                if ((i2 & 64) != 0) {
                                    kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                                    i12 &= -3670017;
                                } else {
                                    kc2VarItemColors = kc2Var2;
                                }
                                if (i10 != 0) {
                                    hs2Var2 = ic2.b;
                                } else {
                                    hs2Var2 = hs2Var;
                                }
                                if (i14 != 0) {
                                    gh2Var2 = null;
                                } else {
                                    gh2Var2 = gh2Var;
                                }
                                z4 = z3;
                                ne1Var7 = ne1Var5;
                                kc2Var3 = kc2VarItemColors;
                                i16 = i12;
                            }
                            ne1 ne1Var116 = ne1Var6;
                            kk0Var2.s();
                            kk0Var = kk0Var2;
                            cd2.DropdownMenuItemContent(ne1Var4, je1Var2, cVar3, ne1Var7, ne1Var116, z4, kc2Var3, hs2Var2, gh2Var2, kk0Var, i16 & 268435454);
                            cVar2 = cVar3;
                            ne1Var8 = ne1Var7;
                            ne1Var9 = ne1Var116;
                            z5 = z4;
                            kc2Var4 = kc2Var3;
                            hs2Var3 = hs2Var2;
                            gh2Var3 = gh2Var2;
                        }
                        w33VarV = kk0Var.v();
                        if (w33VarV != null) {
                            w33VarV.updateScope(new yb(ne1Var, je1Var, cVar2, ne1Var8, ne1Var9, z5, kc2Var4, hs2Var3, gh2Var3, i, i2));
                        }
                    }
                    i12 |= 100663296;
                    if ((i12 & 38347923) == 38347922) {
                        kk0Var2.X();
                        if ((i & 1) != 0) {
                            if (i17 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i4 != 0) {
                                ne1Var5 = null;
                            }
                            if (i6 != 0) {
                                ne1Var6 = null;
                            }
                            if (i8 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if ((i2 & 64) != 0) {
                                kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                                i12 &= -3670017;
                            } else {
                                kc2VarItemColors = kc2Var2;
                            }
                            if (i10 != 0) {
                                hs2Var2 = ic2.b;
                            } else {
                                hs2Var2 = hs2Var;
                            }
                            if (i14 != 0) {
                                gh2Var2 = null;
                            } else {
                                gh2Var2 = gh2Var;
                            }
                            z4 = z3;
                            ne1Var7 = ne1Var5;
                            kc2Var3 = kc2VarItemColors;
                            i16 = i12;
                        } else {
                            if (i17 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i4 != 0) {
                                ne1Var5 = null;
                            }
                            if (i6 != 0) {
                                ne1Var6 = null;
                            }
                            if (i8 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if ((i2 & 64) != 0) {
                                kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                                i12 &= -3670017;
                            } else {
                                kc2VarItemColors = kc2Var2;
                            }
                            if (i10 != 0) {
                                hs2Var2 = ic2.b;
                            } else {
                                hs2Var2 = hs2Var;
                            }
                            if (i14 != 0) {
                                gh2Var2 = null;
                            } else {
                                gh2Var2 = gh2Var;
                            }
                            z4 = z3;
                            ne1Var7 = ne1Var5;
                            kc2Var3 = kc2VarItemColors;
                            i16 = i12;
                        }
                        ne1 ne1Var117 = ne1Var6;
                        kk0Var2.s();
                        kk0Var = kk0Var2;
                        cd2.DropdownMenuItemContent(ne1Var4, je1Var2, cVar3, ne1Var7, ne1Var117, z4, kc2Var3, hs2Var2, gh2Var2, kk0Var, i16 & 268435454);
                        cVar2 = cVar3;
                        ne1Var8 = ne1Var7;
                        ne1Var9 = ne1Var117;
                        z5 = z4;
                        kc2Var4 = kc2Var3;
                        hs2Var3 = hs2Var2;
                        gh2Var3 = gh2Var2;
                    } else {
                        kk0Var2.X();
                        if ((i & 1) != 0) {
                            if (i17 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i4 != 0) {
                                ne1Var5 = null;
                            }
                            if (i6 != 0) {
                                ne1Var6 = null;
                            }
                            if (i8 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if ((i2 & 64) != 0) {
                                kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                                i12 &= -3670017;
                            } else {
                                kc2VarItemColors = kc2Var2;
                            }
                            if (i10 != 0) {
                                hs2Var2 = ic2.b;
                            } else {
                                hs2Var2 = hs2Var;
                            }
                            if (i14 != 0) {
                                gh2Var2 = null;
                            } else {
                                gh2Var2 = gh2Var;
                            }
                            z4 = z3;
                            ne1Var7 = ne1Var5;
                            kc2Var3 = kc2VarItemColors;
                            i16 = i12;
                        } else {
                            if (i17 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i4 != 0) {
                                ne1Var5 = null;
                            }
                            if (i6 != 0) {
                                ne1Var6 = null;
                            }
                            if (i8 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if ((i2 & 64) != 0) {
                                kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                                i12 &= -3670017;
                            } else {
                                kc2VarItemColors = kc2Var2;
                            }
                            if (i10 != 0) {
                                hs2Var2 = ic2.b;
                            } else {
                                hs2Var2 = hs2Var;
                            }
                            if (i14 != 0) {
                                gh2Var2 = null;
                            } else {
                                gh2Var2 = gh2Var;
                            }
                            z4 = z3;
                            ne1Var7 = ne1Var5;
                            kc2Var3 = kc2VarItemColors;
                            i16 = i12;
                        }
                        ne1 ne1Var118 = ne1Var6;
                        kk0Var2.s();
                        kk0Var = kk0Var2;
                        cd2.DropdownMenuItemContent(ne1Var4, je1Var2, cVar3, ne1Var7, ne1Var118, z4, kc2Var3, hs2Var2, gh2Var2, kk0Var, i16 & 268435454);
                        cVar2 = cVar3;
                        ne1Var8 = ne1Var7;
                        ne1Var9 = ne1Var118;
                        z5 = z4;
                        kc2Var4 = kc2Var3;
                        hs2Var3 = hs2Var2;
                        gh2Var3 = gh2Var2;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new yb(ne1Var, je1Var, cVar2, ne1Var8, ne1Var9, z5, kc2Var4, hs2Var3, gh2Var3, i, i2));
                    }
                }
                i3 |= 196608;
                z2 = z;
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        kc2Var2 = kc2Var;
                        if (kk0Var2.h(kc2Var2)) {
                        }
                        i3 |= i18;
                    } else {
                        kc2Var2 = kc2Var;
                    }
                    i3 |= i18;
                } else {
                    kc2Var2 = kc2Var;
                }
                i10 = i2 & Uuid.SIZE_BITS;
                if (i10 != 0) {
                    i12 = i3 | 12582912;
                } else {
                    i11 = i3;
                    if ((i & 12582912) == 0) {
                        if (kk0Var2.h(hs2Var)) {
                            i13 = 8388608;
                        } else {
                            i13 = 4194304;
                        }
                        i12 = i11 | i13;
                    } else {
                        i12 = i11;
                    }
                }
                i14 = i2 & FontInfo.NUMBER_OF_CHAR_CODES;
                if (i14 != 0) {
                    if ((i & 100663296) == 0) {
                        if (kk0Var2.h(gh2Var)) {
                            i15 = 67108864;
                        } else {
                            i15 = 33554432;
                        }
                        i12 |= i15;
                    }
                    if ((i12 & 38347923) == 38347922) {
                        kk0Var2.X();
                        if ((i & 1) != 0) {
                            if (i17 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i4 != 0) {
                                ne1Var5 = null;
                            }
                            if (i6 != 0) {
                                ne1Var6 = null;
                            }
                            if (i8 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if ((i2 & 64) != 0) {
                                kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                                i12 &= -3670017;
                            } else {
                                kc2VarItemColors = kc2Var2;
                            }
                            if (i10 != 0) {
                                hs2Var2 = ic2.b;
                            } else {
                                hs2Var2 = hs2Var;
                            }
                            if (i14 != 0) {
                                gh2Var2 = null;
                            } else {
                                gh2Var2 = gh2Var;
                            }
                            z4 = z3;
                            ne1Var7 = ne1Var5;
                            kc2Var3 = kc2VarItemColors;
                            i16 = i12;
                        } else {
                            if (i17 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i4 != 0) {
                                ne1Var5 = null;
                            }
                            if (i6 != 0) {
                                ne1Var6 = null;
                            }
                            if (i8 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if ((i2 & 64) != 0) {
                                kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                                i12 &= -3670017;
                            } else {
                                kc2VarItemColors = kc2Var2;
                            }
                            if (i10 != 0) {
                                hs2Var2 = ic2.b;
                            } else {
                                hs2Var2 = hs2Var;
                            }
                            if (i14 != 0) {
                                gh2Var2 = null;
                            } else {
                                gh2Var2 = gh2Var;
                            }
                            z4 = z3;
                            ne1Var7 = ne1Var5;
                            kc2Var3 = kc2VarItemColors;
                            i16 = i12;
                        }
                        ne1 ne1Var119 = ne1Var6;
                        kk0Var2.s();
                        kk0Var = kk0Var2;
                        cd2.DropdownMenuItemContent(ne1Var4, je1Var2, cVar3, ne1Var7, ne1Var119, z4, kc2Var3, hs2Var2, gh2Var2, kk0Var, i16 & 268435454);
                        cVar2 = cVar3;
                        ne1Var8 = ne1Var7;
                        ne1Var9 = ne1Var119;
                        z5 = z4;
                        kc2Var4 = kc2Var3;
                        hs2Var3 = hs2Var2;
                        gh2Var3 = gh2Var2;
                    } else {
                        kk0Var2.X();
                        if ((i & 1) != 0) {
                            if (i17 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i4 != 0) {
                                ne1Var5 = null;
                            }
                            if (i6 != 0) {
                                ne1Var6 = null;
                            }
                            if (i8 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if ((i2 & 64) != 0) {
                                kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                                i12 &= -3670017;
                            } else {
                                kc2VarItemColors = kc2Var2;
                            }
                            if (i10 != 0) {
                                hs2Var2 = ic2.b;
                            } else {
                                hs2Var2 = hs2Var;
                            }
                            if (i14 != 0) {
                                gh2Var2 = null;
                            } else {
                                gh2Var2 = gh2Var;
                            }
                            z4 = z3;
                            ne1Var7 = ne1Var5;
                            kc2Var3 = kc2VarItemColors;
                            i16 = i12;
                        } else {
                            if (i17 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i4 != 0) {
                                ne1Var5 = null;
                            }
                            if (i6 != 0) {
                                ne1Var6 = null;
                            }
                            if (i8 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if ((i2 & 64) != 0) {
                                kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                                i12 &= -3670017;
                            } else {
                                kc2VarItemColors = kc2Var2;
                            }
                            if (i10 != 0) {
                                hs2Var2 = ic2.b;
                            } else {
                                hs2Var2 = hs2Var;
                            }
                            if (i14 != 0) {
                                gh2Var2 = null;
                            } else {
                                gh2Var2 = gh2Var;
                            }
                            z4 = z3;
                            ne1Var7 = ne1Var5;
                            kc2Var3 = kc2VarItemColors;
                            i16 = i12;
                        }
                        ne1 ne1Var1110 = ne1Var6;
                        kk0Var2.s();
                        kk0Var = kk0Var2;
                        cd2.DropdownMenuItemContent(ne1Var4, je1Var2, cVar3, ne1Var7, ne1Var1110, z4, kc2Var3, hs2Var2, gh2Var2, kk0Var, i16 & 268435454);
                        cVar2 = cVar3;
                        ne1Var8 = ne1Var7;
                        ne1Var9 = ne1Var1110;
                        z5 = z4;
                        kc2Var4 = kc2Var3;
                        hs2Var3 = hs2Var2;
                        gh2Var3 = gh2Var2;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new yb(ne1Var, je1Var, cVar2, ne1Var8, ne1Var9, z5, kc2Var4, hs2Var3, gh2Var3, i, i2));
                    }
                }
                i12 |= 100663296;
                if ((i12 & 38347923) == 38347922) {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i17 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            ne1Var5 = null;
                        }
                        if (i6 != 0) {
                            ne1Var6 = null;
                        }
                        if (i8 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if ((i2 & 64) != 0) {
                            kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                            i12 &= -3670017;
                        } else {
                            kc2VarItemColors = kc2Var2;
                        }
                        if (i10 != 0) {
                            hs2Var2 = ic2.b;
                        } else {
                            hs2Var2 = hs2Var;
                        }
                        if (i14 != 0) {
                            gh2Var2 = null;
                        } else {
                            gh2Var2 = gh2Var;
                        }
                        z4 = z3;
                        ne1Var7 = ne1Var5;
                        kc2Var3 = kc2VarItemColors;
                        i16 = i12;
                    } else {
                        if (i17 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            ne1Var5 = null;
                        }
                        if (i6 != 0) {
                            ne1Var6 = null;
                        }
                        if (i8 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if ((i2 & 64) != 0) {
                            kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                            i12 &= -3670017;
                        } else {
                            kc2VarItemColors = kc2Var2;
                        }
                        if (i10 != 0) {
                            hs2Var2 = ic2.b;
                        } else {
                            hs2Var2 = hs2Var;
                        }
                        if (i14 != 0) {
                            gh2Var2 = null;
                        } else {
                            gh2Var2 = gh2Var;
                        }
                        z4 = z3;
                        ne1Var7 = ne1Var5;
                        kc2Var3 = kc2VarItemColors;
                        i16 = i12;
                    }
                    ne1 ne1Var1111 = ne1Var6;
                    kk0Var2.s();
                    kk0Var = kk0Var2;
                    cd2.DropdownMenuItemContent(ne1Var4, je1Var2, cVar3, ne1Var7, ne1Var1111, z4, kc2Var3, hs2Var2, gh2Var2, kk0Var, i16 & 268435454);
                    cVar2 = cVar3;
                    ne1Var8 = ne1Var7;
                    ne1Var9 = ne1Var1111;
                    z5 = z4;
                    kc2Var4 = kc2Var3;
                    hs2Var3 = hs2Var2;
                    gh2Var3 = gh2Var2;
                } else {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i17 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            ne1Var5 = null;
                        }
                        if (i6 != 0) {
                            ne1Var6 = null;
                        }
                        if (i8 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if ((i2 & 64) != 0) {
                            kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                            i12 &= -3670017;
                        } else {
                            kc2VarItemColors = kc2Var2;
                        }
                        if (i10 != 0) {
                            hs2Var2 = ic2.b;
                        } else {
                            hs2Var2 = hs2Var;
                        }
                        if (i14 != 0) {
                            gh2Var2 = null;
                        } else {
                            gh2Var2 = gh2Var;
                        }
                        z4 = z3;
                        ne1Var7 = ne1Var5;
                        kc2Var3 = kc2VarItemColors;
                        i16 = i12;
                    } else {
                        if (i17 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            ne1Var5 = null;
                        }
                        if (i6 != 0) {
                            ne1Var6 = null;
                        }
                        if (i8 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if ((i2 & 64) != 0) {
                            kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                            i12 &= -3670017;
                        } else {
                            kc2VarItemColors = kc2Var2;
                        }
                        if (i10 != 0) {
                            hs2Var2 = ic2.b;
                        } else {
                            hs2Var2 = hs2Var;
                        }
                        if (i14 != 0) {
                            gh2Var2 = null;
                        } else {
                            gh2Var2 = gh2Var;
                        }
                        z4 = z3;
                        ne1Var7 = ne1Var5;
                        kc2Var3 = kc2VarItemColors;
                        i16 = i12;
                    }
                    ne1 ne1Var1112 = ne1Var6;
                    kk0Var2.s();
                    kk0Var = kk0Var2;
                    cd2.DropdownMenuItemContent(ne1Var4, je1Var2, cVar3, ne1Var7, ne1Var1112, z4, kc2Var3, hs2Var2, gh2Var2, kk0Var, i16 & 268435454);
                    cVar2 = cVar3;
                    ne1Var8 = ne1Var7;
                    ne1Var9 = ne1Var1112;
                    z5 = z4;
                    kc2Var4 = kc2Var3;
                    hs2Var3 = hs2Var2;
                    gh2Var3 = gh2Var2;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new yb(ne1Var, je1Var, cVar2, ne1Var8, ne1Var9, z5, kc2Var4, hs2Var3, gh2Var3, i, i2));
                }
            }
            i3 |= 24576;
            ne1Var6 = ne1Var3;
            i8 = i2 & 32;
            if (i8 != 0) {
                if ((196608 & i) == 0) {
                    z2 = z;
                    if (kk0Var2.i(z2)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        kc2Var2 = kc2Var;
                        if (kk0Var2.h(kc2Var2)) {
                        }
                        i3 |= i18;
                    } else {
                        kc2Var2 = kc2Var;
                    }
                    i3 |= i18;
                } else {
                    kc2Var2 = kc2Var;
                }
                i10 = i2 & Uuid.SIZE_BITS;
                if (i10 != 0) {
                    i12 = i3 | 12582912;
                } else {
                    i11 = i3;
                    if ((i & 12582912) == 0) {
                        if (kk0Var2.h(hs2Var)) {
                            i13 = 8388608;
                        } else {
                            i13 = 4194304;
                        }
                        i12 = i11 | i13;
                    } else {
                        i12 = i11;
                    }
                }
                i14 = i2 & FontInfo.NUMBER_OF_CHAR_CODES;
                if (i14 != 0) {
                    if ((i & 100663296) == 0) {
                        if (kk0Var2.h(gh2Var)) {
                            i15 = 67108864;
                        } else {
                            i15 = 33554432;
                        }
                        i12 |= i15;
                    }
                    if ((i12 & 38347923) == 38347922) {
                        kk0Var2.X();
                        if ((i & 1) != 0) {
                            if (i17 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i4 != 0) {
                                ne1Var5 = null;
                            }
                            if (i6 != 0) {
                                ne1Var6 = null;
                            }
                            if (i8 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if ((i2 & 64) != 0) {
                                kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                                i12 &= -3670017;
                            } else {
                                kc2VarItemColors = kc2Var2;
                            }
                            if (i10 != 0) {
                                hs2Var2 = ic2.b;
                            } else {
                                hs2Var2 = hs2Var;
                            }
                            if (i14 != 0) {
                                gh2Var2 = null;
                            } else {
                                gh2Var2 = gh2Var;
                            }
                            z4 = z3;
                            ne1Var7 = ne1Var5;
                            kc2Var3 = kc2VarItemColors;
                            i16 = i12;
                        } else {
                            if (i17 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i4 != 0) {
                                ne1Var5 = null;
                            }
                            if (i6 != 0) {
                                ne1Var6 = null;
                            }
                            if (i8 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if ((i2 & 64) != 0) {
                                kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                                i12 &= -3670017;
                            } else {
                                kc2VarItemColors = kc2Var2;
                            }
                            if (i10 != 0) {
                                hs2Var2 = ic2.b;
                            } else {
                                hs2Var2 = hs2Var;
                            }
                            if (i14 != 0) {
                                gh2Var2 = null;
                            } else {
                                gh2Var2 = gh2Var;
                            }
                            z4 = z3;
                            ne1Var7 = ne1Var5;
                            kc2Var3 = kc2VarItemColors;
                            i16 = i12;
                        }
                        ne1 ne1Var1113 = ne1Var6;
                        kk0Var2.s();
                        kk0Var = kk0Var2;
                        cd2.DropdownMenuItemContent(ne1Var4, je1Var2, cVar3, ne1Var7, ne1Var1113, z4, kc2Var3, hs2Var2, gh2Var2, kk0Var, i16 & 268435454);
                        cVar2 = cVar3;
                        ne1Var8 = ne1Var7;
                        ne1Var9 = ne1Var1113;
                        z5 = z4;
                        kc2Var4 = kc2Var3;
                        hs2Var3 = hs2Var2;
                        gh2Var3 = gh2Var2;
                    } else {
                        kk0Var2.X();
                        if ((i & 1) != 0) {
                            if (i17 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i4 != 0) {
                                ne1Var5 = null;
                            }
                            if (i6 != 0) {
                                ne1Var6 = null;
                            }
                            if (i8 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if ((i2 & 64) != 0) {
                                kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                                i12 &= -3670017;
                            } else {
                                kc2VarItemColors = kc2Var2;
                            }
                            if (i10 != 0) {
                                hs2Var2 = ic2.b;
                            } else {
                                hs2Var2 = hs2Var;
                            }
                            if (i14 != 0) {
                                gh2Var2 = null;
                            } else {
                                gh2Var2 = gh2Var;
                            }
                            z4 = z3;
                            ne1Var7 = ne1Var5;
                            kc2Var3 = kc2VarItemColors;
                            i16 = i12;
                        } else {
                            if (i17 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i4 != 0) {
                                ne1Var5 = null;
                            }
                            if (i6 != 0) {
                                ne1Var6 = null;
                            }
                            if (i8 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if ((i2 & 64) != 0) {
                                kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                                i12 &= -3670017;
                            } else {
                                kc2VarItemColors = kc2Var2;
                            }
                            if (i10 != 0) {
                                hs2Var2 = ic2.b;
                            } else {
                                hs2Var2 = hs2Var;
                            }
                            if (i14 != 0) {
                                gh2Var2 = null;
                            } else {
                                gh2Var2 = gh2Var;
                            }
                            z4 = z3;
                            ne1Var7 = ne1Var5;
                            kc2Var3 = kc2VarItemColors;
                            i16 = i12;
                        }
                        ne1 ne1Var1114 = ne1Var6;
                        kk0Var2.s();
                        kk0Var = kk0Var2;
                        cd2.DropdownMenuItemContent(ne1Var4, je1Var2, cVar3, ne1Var7, ne1Var1114, z4, kc2Var3, hs2Var2, gh2Var2, kk0Var, i16 & 268435454);
                        cVar2 = cVar3;
                        ne1Var8 = ne1Var7;
                        ne1Var9 = ne1Var1114;
                        z5 = z4;
                        kc2Var4 = kc2Var3;
                        hs2Var3 = hs2Var2;
                        gh2Var3 = gh2Var2;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new yb(ne1Var, je1Var, cVar2, ne1Var8, ne1Var9, z5, kc2Var4, hs2Var3, gh2Var3, i, i2));
                    }
                }
                i12 |= 100663296;
                if ((i12 & 38347923) == 38347922) {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i17 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            ne1Var5 = null;
                        }
                        if (i6 != 0) {
                            ne1Var6 = null;
                        }
                        if (i8 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if ((i2 & 64) != 0) {
                            kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                            i12 &= -3670017;
                        } else {
                            kc2VarItemColors = kc2Var2;
                        }
                        if (i10 != 0) {
                            hs2Var2 = ic2.b;
                        } else {
                            hs2Var2 = hs2Var;
                        }
                        if (i14 != 0) {
                            gh2Var2 = null;
                        } else {
                            gh2Var2 = gh2Var;
                        }
                        z4 = z3;
                        ne1Var7 = ne1Var5;
                        kc2Var3 = kc2VarItemColors;
                        i16 = i12;
                    } else {
                        if (i17 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            ne1Var5 = null;
                        }
                        if (i6 != 0) {
                            ne1Var6 = null;
                        }
                        if (i8 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if ((i2 & 64) != 0) {
                            kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                            i12 &= -3670017;
                        } else {
                            kc2VarItemColors = kc2Var2;
                        }
                        if (i10 != 0) {
                            hs2Var2 = ic2.b;
                        } else {
                            hs2Var2 = hs2Var;
                        }
                        if (i14 != 0) {
                            gh2Var2 = null;
                        } else {
                            gh2Var2 = gh2Var;
                        }
                        z4 = z3;
                        ne1Var7 = ne1Var5;
                        kc2Var3 = kc2VarItemColors;
                        i16 = i12;
                    }
                    ne1 ne1Var1115 = ne1Var6;
                    kk0Var2.s();
                    kk0Var = kk0Var2;
                    cd2.DropdownMenuItemContent(ne1Var4, je1Var2, cVar3, ne1Var7, ne1Var1115, z4, kc2Var3, hs2Var2, gh2Var2, kk0Var, i16 & 268435454);
                    cVar2 = cVar3;
                    ne1Var8 = ne1Var7;
                    ne1Var9 = ne1Var1115;
                    z5 = z4;
                    kc2Var4 = kc2Var3;
                    hs2Var3 = hs2Var2;
                    gh2Var3 = gh2Var2;
                } else {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i17 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            ne1Var5 = null;
                        }
                        if (i6 != 0) {
                            ne1Var6 = null;
                        }
                        if (i8 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if ((i2 & 64) != 0) {
                            kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                            i12 &= -3670017;
                        } else {
                            kc2VarItemColors = kc2Var2;
                        }
                        if (i10 != 0) {
                            hs2Var2 = ic2.b;
                        } else {
                            hs2Var2 = hs2Var;
                        }
                        if (i14 != 0) {
                            gh2Var2 = null;
                        } else {
                            gh2Var2 = gh2Var;
                        }
                        z4 = z3;
                        ne1Var7 = ne1Var5;
                        kc2Var3 = kc2VarItemColors;
                        i16 = i12;
                    } else {
                        if (i17 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            ne1Var5 = null;
                        }
                        if (i6 != 0) {
                            ne1Var6 = null;
                        }
                        if (i8 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if ((i2 & 64) != 0) {
                            kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                            i12 &= -3670017;
                        } else {
                            kc2VarItemColors = kc2Var2;
                        }
                        if (i10 != 0) {
                            hs2Var2 = ic2.b;
                        } else {
                            hs2Var2 = hs2Var;
                        }
                        if (i14 != 0) {
                            gh2Var2 = null;
                        } else {
                            gh2Var2 = gh2Var;
                        }
                        z4 = z3;
                        ne1Var7 = ne1Var5;
                        kc2Var3 = kc2VarItemColors;
                        i16 = i12;
                    }
                    ne1 ne1Var1116 = ne1Var6;
                    kk0Var2.s();
                    kk0Var = kk0Var2;
                    cd2.DropdownMenuItemContent(ne1Var4, je1Var2, cVar3, ne1Var7, ne1Var1116, z4, kc2Var3, hs2Var2, gh2Var2, kk0Var, i16 & 268435454);
                    cVar2 = cVar3;
                    ne1Var8 = ne1Var7;
                    ne1Var9 = ne1Var1116;
                    z5 = z4;
                    kc2Var4 = kc2Var3;
                    hs2Var3 = hs2Var2;
                    gh2Var3 = gh2Var2;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new yb(ne1Var, je1Var, cVar2, ne1Var8, ne1Var9, z5, kc2Var4, hs2Var3, gh2Var3, i, i2));
                }
            }
            i3 |= 196608;
            z2 = z;
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    kc2Var2 = kc2Var;
                    if (kk0Var2.h(kc2Var2)) {
                    }
                    i3 |= i18;
                } else {
                    kc2Var2 = kc2Var;
                }
                i3 |= i18;
            } else {
                kc2Var2 = kc2Var;
            }
            i10 = i2 & Uuid.SIZE_BITS;
            if (i10 != 0) {
                i12 = i3 | 12582912;
            } else {
                i11 = i3;
                if ((i & 12582912) == 0) {
                    if (kk0Var2.h(hs2Var)) {
                        i13 = 8388608;
                    } else {
                        i13 = 4194304;
                    }
                    i12 = i11 | i13;
                } else {
                    i12 = i11;
                }
            }
            i14 = i2 & FontInfo.NUMBER_OF_CHAR_CODES;
            if (i14 != 0) {
                if ((i & 100663296) == 0) {
                    if (kk0Var2.h(gh2Var)) {
                        i15 = 67108864;
                    } else {
                        i15 = 33554432;
                    }
                    i12 |= i15;
                }
                if ((i12 & 38347923) == 38347922) {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i17 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            ne1Var5 = null;
                        }
                        if (i6 != 0) {
                            ne1Var6 = null;
                        }
                        if (i8 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if ((i2 & 64) != 0) {
                            kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                            i12 &= -3670017;
                        } else {
                            kc2VarItemColors = kc2Var2;
                        }
                        if (i10 != 0) {
                            hs2Var2 = ic2.b;
                        } else {
                            hs2Var2 = hs2Var;
                        }
                        if (i14 != 0) {
                            gh2Var2 = null;
                        } else {
                            gh2Var2 = gh2Var;
                        }
                        z4 = z3;
                        ne1Var7 = ne1Var5;
                        kc2Var3 = kc2VarItemColors;
                        i16 = i12;
                    } else {
                        if (i17 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            ne1Var5 = null;
                        }
                        if (i6 != 0) {
                            ne1Var6 = null;
                        }
                        if (i8 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if ((i2 & 64) != 0) {
                            kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                            i12 &= -3670017;
                        } else {
                            kc2VarItemColors = kc2Var2;
                        }
                        if (i10 != 0) {
                            hs2Var2 = ic2.b;
                        } else {
                            hs2Var2 = hs2Var;
                        }
                        if (i14 != 0) {
                            gh2Var2 = null;
                        } else {
                            gh2Var2 = gh2Var;
                        }
                        z4 = z3;
                        ne1Var7 = ne1Var5;
                        kc2Var3 = kc2VarItemColors;
                        i16 = i12;
                    }
                    ne1 ne1Var1117 = ne1Var6;
                    kk0Var2.s();
                    kk0Var = kk0Var2;
                    cd2.DropdownMenuItemContent(ne1Var4, je1Var2, cVar3, ne1Var7, ne1Var1117, z4, kc2Var3, hs2Var2, gh2Var2, kk0Var, i16 & 268435454);
                    cVar2 = cVar3;
                    ne1Var8 = ne1Var7;
                    ne1Var9 = ne1Var1117;
                    z5 = z4;
                    kc2Var4 = kc2Var3;
                    hs2Var3 = hs2Var2;
                    gh2Var3 = gh2Var2;
                } else {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i17 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            ne1Var5 = null;
                        }
                        if (i6 != 0) {
                            ne1Var6 = null;
                        }
                        if (i8 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if ((i2 & 64) != 0) {
                            kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                            i12 &= -3670017;
                        } else {
                            kc2VarItemColors = kc2Var2;
                        }
                        if (i10 != 0) {
                            hs2Var2 = ic2.b;
                        } else {
                            hs2Var2 = hs2Var;
                        }
                        if (i14 != 0) {
                            gh2Var2 = null;
                        } else {
                            gh2Var2 = gh2Var;
                        }
                        z4 = z3;
                        ne1Var7 = ne1Var5;
                        kc2Var3 = kc2VarItemColors;
                        i16 = i12;
                    } else {
                        if (i17 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            ne1Var5 = null;
                        }
                        if (i6 != 0) {
                            ne1Var6 = null;
                        }
                        if (i8 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if ((i2 & 64) != 0) {
                            kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                            i12 &= -3670017;
                        } else {
                            kc2VarItemColors = kc2Var2;
                        }
                        if (i10 != 0) {
                            hs2Var2 = ic2.b;
                        } else {
                            hs2Var2 = hs2Var;
                        }
                        if (i14 != 0) {
                            gh2Var2 = null;
                        } else {
                            gh2Var2 = gh2Var;
                        }
                        z4 = z3;
                        ne1Var7 = ne1Var5;
                        kc2Var3 = kc2VarItemColors;
                        i16 = i12;
                    }
                    ne1 ne1Var1118 = ne1Var6;
                    kk0Var2.s();
                    kk0Var = kk0Var2;
                    cd2.DropdownMenuItemContent(ne1Var4, je1Var2, cVar3, ne1Var7, ne1Var1118, z4, kc2Var3, hs2Var2, gh2Var2, kk0Var, i16 & 268435454);
                    cVar2 = cVar3;
                    ne1Var8 = ne1Var7;
                    ne1Var9 = ne1Var1118;
                    z5 = z4;
                    kc2Var4 = kc2Var3;
                    hs2Var3 = hs2Var2;
                    gh2Var3 = gh2Var2;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new yb(ne1Var, je1Var, cVar2, ne1Var8, ne1Var9, z5, kc2Var4, hs2Var3, gh2Var3, i, i2));
                }
            }
            i12 |= 100663296;
            if ((i12 & 38347923) == 38347922) {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i17 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        ne1Var5 = null;
                    }
                    if (i6 != 0) {
                        ne1Var6 = null;
                    }
                    if (i8 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if ((i2 & 64) != 0) {
                        kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                        i12 &= -3670017;
                    } else {
                        kc2VarItemColors = kc2Var2;
                    }
                    if (i10 != 0) {
                        hs2Var2 = ic2.b;
                    } else {
                        hs2Var2 = hs2Var;
                    }
                    if (i14 != 0) {
                        gh2Var2 = null;
                    } else {
                        gh2Var2 = gh2Var;
                    }
                    z4 = z3;
                    ne1Var7 = ne1Var5;
                    kc2Var3 = kc2VarItemColors;
                    i16 = i12;
                } else {
                    if (i17 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        ne1Var5 = null;
                    }
                    if (i6 != 0) {
                        ne1Var6 = null;
                    }
                    if (i8 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if ((i2 & 64) != 0) {
                        kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                        i12 &= -3670017;
                    } else {
                        kc2VarItemColors = kc2Var2;
                    }
                    if (i10 != 0) {
                        hs2Var2 = ic2.b;
                    } else {
                        hs2Var2 = hs2Var;
                    }
                    if (i14 != 0) {
                        gh2Var2 = null;
                    } else {
                        gh2Var2 = gh2Var;
                    }
                    z4 = z3;
                    ne1Var7 = ne1Var5;
                    kc2Var3 = kc2VarItemColors;
                    i16 = i12;
                }
                ne1 ne1Var1119 = ne1Var6;
                kk0Var2.s();
                kk0Var = kk0Var2;
                cd2.DropdownMenuItemContent(ne1Var4, je1Var2, cVar3, ne1Var7, ne1Var1119, z4, kc2Var3, hs2Var2, gh2Var2, kk0Var, i16 & 268435454);
                cVar2 = cVar3;
                ne1Var8 = ne1Var7;
                ne1Var9 = ne1Var1119;
                z5 = z4;
                kc2Var4 = kc2Var3;
                hs2Var3 = hs2Var2;
                gh2Var3 = gh2Var2;
            } else {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i17 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        ne1Var5 = null;
                    }
                    if (i6 != 0) {
                        ne1Var6 = null;
                    }
                    if (i8 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if ((i2 & 64) != 0) {
                        kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                        i12 &= -3670017;
                    } else {
                        kc2VarItemColors = kc2Var2;
                    }
                    if (i10 != 0) {
                        hs2Var2 = ic2.b;
                    } else {
                        hs2Var2 = hs2Var;
                    }
                    if (i14 != 0) {
                        gh2Var2 = null;
                    } else {
                        gh2Var2 = gh2Var;
                    }
                    z4 = z3;
                    ne1Var7 = ne1Var5;
                    kc2Var3 = kc2VarItemColors;
                    i16 = i12;
                } else {
                    if (i17 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        ne1Var5 = null;
                    }
                    if (i6 != 0) {
                        ne1Var6 = null;
                    }
                    if (i8 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if ((i2 & 64) != 0) {
                        kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                        i12 &= -3670017;
                    } else {
                        kc2VarItemColors = kc2Var2;
                    }
                    if (i10 != 0) {
                        hs2Var2 = ic2.b;
                    } else {
                        hs2Var2 = hs2Var;
                    }
                    if (i14 != 0) {
                        gh2Var2 = null;
                    } else {
                        gh2Var2 = gh2Var;
                    }
                    z4 = z3;
                    ne1Var7 = ne1Var5;
                    kc2Var3 = kc2VarItemColors;
                    i16 = i12;
                }
                ne1 ne1Var11110 = ne1Var6;
                kk0Var2.s();
                kk0Var = kk0Var2;
                cd2.DropdownMenuItemContent(ne1Var4, je1Var2, cVar3, ne1Var7, ne1Var11110, z4, kc2Var3, hs2Var2, gh2Var2, kk0Var, i16 & 268435454);
                cVar2 = cVar3;
                ne1Var8 = ne1Var7;
                ne1Var9 = ne1Var11110;
                z5 = z4;
                kc2Var4 = kc2Var3;
                hs2Var3 = hs2Var2;
                gh2Var3 = gh2Var2;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new yb(ne1Var, je1Var, cVar2, ne1Var8, ne1Var9, z5, kc2Var4, hs2Var3, gh2Var3, i, i2));
            }
        }
        i3 |= 384;
        cVar2 = cVar;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                ne1Var5 = ne1Var2;
                if (kk0Var2.j(ne1Var5)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    ne1Var6 = ne1Var3;
                    if (kk0Var2.j(ne1Var6)) {
                        i7 = 16384;
                    } else {
                        i7 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 32;
                if (i8 != 0) {
                    if ((196608 & i) == 0) {
                        z2 = z;
                        if (kk0Var2.i(z2)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    }
                    if ((1572864 & i) == 0) {
                        if ((i2 & 64) == 0) {
                            kc2Var2 = kc2Var;
                            if (kk0Var2.h(kc2Var2)) {
                            }
                            i3 |= i18;
                        } else {
                            kc2Var2 = kc2Var;
                        }
                        i3 |= i18;
                    } else {
                        kc2Var2 = kc2Var;
                    }
                    i10 = i2 & Uuid.SIZE_BITS;
                    if (i10 != 0) {
                        i12 = i3 | 12582912;
                    } else {
                        i11 = i3;
                        if ((i & 12582912) == 0) {
                            if (kk0Var2.h(hs2Var)) {
                                i13 = 8388608;
                            } else {
                                i13 = 4194304;
                            }
                            i12 = i11 | i13;
                        } else {
                            i12 = i11;
                        }
                    }
                    i14 = i2 & FontInfo.NUMBER_OF_CHAR_CODES;
                    if (i14 != 0) {
                        if ((i & 100663296) == 0) {
                            if (kk0Var2.h(gh2Var)) {
                                i15 = 67108864;
                            } else {
                                i15 = 33554432;
                            }
                            i12 |= i15;
                        }
                        if ((i12 & 38347923) == 38347922) {
                            kk0Var2.X();
                            if ((i & 1) != 0) {
                                if (i17 != 0) {
                                    cVar3 = c.i;
                                } else {
                                    cVar3 = cVar2;
                                }
                                if (i4 != 0) {
                                    ne1Var5 = null;
                                }
                                if (i6 != 0) {
                                    ne1Var6 = null;
                                }
                                if (i8 != 0) {
                                    z3 = true;
                                } else {
                                    z3 = z2;
                                }
                                if ((i2 & 64) != 0) {
                                    kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                                    i12 &= -3670017;
                                } else {
                                    kc2VarItemColors = kc2Var2;
                                }
                                if (i10 != 0) {
                                    hs2Var2 = ic2.b;
                                } else {
                                    hs2Var2 = hs2Var;
                                }
                                if (i14 != 0) {
                                    gh2Var2 = null;
                                } else {
                                    gh2Var2 = gh2Var;
                                }
                                z4 = z3;
                                ne1Var7 = ne1Var5;
                                kc2Var3 = kc2VarItemColors;
                                i16 = i12;
                            } else {
                                if (i17 != 0) {
                                    cVar3 = c.i;
                                } else {
                                    cVar3 = cVar2;
                                }
                                if (i4 != 0) {
                                    ne1Var5 = null;
                                }
                                if (i6 != 0) {
                                    ne1Var6 = null;
                                }
                                if (i8 != 0) {
                                    z3 = true;
                                } else {
                                    z3 = z2;
                                }
                                if ((i2 & 64) != 0) {
                                    kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                                    i12 &= -3670017;
                                } else {
                                    kc2VarItemColors = kc2Var2;
                                }
                                if (i10 != 0) {
                                    hs2Var2 = ic2.b;
                                } else {
                                    hs2Var2 = hs2Var;
                                }
                                if (i14 != 0) {
                                    gh2Var2 = null;
                                } else {
                                    gh2Var2 = gh2Var;
                                }
                                z4 = z3;
                                ne1Var7 = ne1Var5;
                                kc2Var3 = kc2VarItemColors;
                                i16 = i12;
                            }
                            ne1 ne1Var11111 = ne1Var6;
                            kk0Var2.s();
                            kk0Var = kk0Var2;
                            cd2.DropdownMenuItemContent(ne1Var4, je1Var2, cVar3, ne1Var7, ne1Var11111, z4, kc2Var3, hs2Var2, gh2Var2, kk0Var, i16 & 268435454);
                            cVar2 = cVar3;
                            ne1Var8 = ne1Var7;
                            ne1Var9 = ne1Var11111;
                            z5 = z4;
                            kc2Var4 = kc2Var3;
                            hs2Var3 = hs2Var2;
                            gh2Var3 = gh2Var2;
                        } else {
                            kk0Var2.X();
                            if ((i & 1) != 0) {
                                if (i17 != 0) {
                                    cVar3 = c.i;
                                } else {
                                    cVar3 = cVar2;
                                }
                                if (i4 != 0) {
                                    ne1Var5 = null;
                                }
                                if (i6 != 0) {
                                    ne1Var6 = null;
                                }
                                if (i8 != 0) {
                                    z3 = true;
                                } else {
                                    z3 = z2;
                                }
                                if ((i2 & 64) != 0) {
                                    kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                                    i12 &= -3670017;
                                } else {
                                    kc2VarItemColors = kc2Var2;
                                }
                                if (i10 != 0) {
                                    hs2Var2 = ic2.b;
                                } else {
                                    hs2Var2 = hs2Var;
                                }
                                if (i14 != 0) {
                                    gh2Var2 = null;
                                } else {
                                    gh2Var2 = gh2Var;
                                }
                                z4 = z3;
                                ne1Var7 = ne1Var5;
                                kc2Var3 = kc2VarItemColors;
                                i16 = i12;
                            } else {
                                if (i17 != 0) {
                                    cVar3 = c.i;
                                } else {
                                    cVar3 = cVar2;
                                }
                                if (i4 != 0) {
                                    ne1Var5 = null;
                                }
                                if (i6 != 0) {
                                    ne1Var6 = null;
                                }
                                if (i8 != 0) {
                                    z3 = true;
                                } else {
                                    z3 = z2;
                                }
                                if ((i2 & 64) != 0) {
                                    kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                                    i12 &= -3670017;
                                } else {
                                    kc2VarItemColors = kc2Var2;
                                }
                                if (i10 != 0) {
                                    hs2Var2 = ic2.b;
                                } else {
                                    hs2Var2 = hs2Var;
                                }
                                if (i14 != 0) {
                                    gh2Var2 = null;
                                } else {
                                    gh2Var2 = gh2Var;
                                }
                                z4 = z3;
                                ne1Var7 = ne1Var5;
                                kc2Var3 = kc2VarItemColors;
                                i16 = i12;
                            }
                            ne1 ne1Var11112 = ne1Var6;
                            kk0Var2.s();
                            kk0Var = kk0Var2;
                            cd2.DropdownMenuItemContent(ne1Var4, je1Var2, cVar3, ne1Var7, ne1Var11112, z4, kc2Var3, hs2Var2, gh2Var2, kk0Var, i16 & 268435454);
                            cVar2 = cVar3;
                            ne1Var8 = ne1Var7;
                            ne1Var9 = ne1Var11112;
                            z5 = z4;
                            kc2Var4 = kc2Var3;
                            hs2Var3 = hs2Var2;
                            gh2Var3 = gh2Var2;
                        }
                        w33VarV = kk0Var.v();
                        if (w33VarV != null) {
                            w33VarV.updateScope(new yb(ne1Var, je1Var, cVar2, ne1Var8, ne1Var9, z5, kc2Var4, hs2Var3, gh2Var3, i, i2));
                        }
                    }
                    i12 |= 100663296;
                    if ((i12 & 38347923) == 38347922) {
                        kk0Var2.X();
                        if ((i & 1) != 0) {
                            if (i17 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i4 != 0) {
                                ne1Var5 = null;
                            }
                            if (i6 != 0) {
                                ne1Var6 = null;
                            }
                            if (i8 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if ((i2 & 64) != 0) {
                                kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                                i12 &= -3670017;
                            } else {
                                kc2VarItemColors = kc2Var2;
                            }
                            if (i10 != 0) {
                                hs2Var2 = ic2.b;
                            } else {
                                hs2Var2 = hs2Var;
                            }
                            if (i14 != 0) {
                                gh2Var2 = null;
                            } else {
                                gh2Var2 = gh2Var;
                            }
                            z4 = z3;
                            ne1Var7 = ne1Var5;
                            kc2Var3 = kc2VarItemColors;
                            i16 = i12;
                        } else {
                            if (i17 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i4 != 0) {
                                ne1Var5 = null;
                            }
                            if (i6 != 0) {
                                ne1Var6 = null;
                            }
                            if (i8 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if ((i2 & 64) != 0) {
                                kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                                i12 &= -3670017;
                            } else {
                                kc2VarItemColors = kc2Var2;
                            }
                            if (i10 != 0) {
                                hs2Var2 = ic2.b;
                            } else {
                                hs2Var2 = hs2Var;
                            }
                            if (i14 != 0) {
                                gh2Var2 = null;
                            } else {
                                gh2Var2 = gh2Var;
                            }
                            z4 = z3;
                            ne1Var7 = ne1Var5;
                            kc2Var3 = kc2VarItemColors;
                            i16 = i12;
                        }
                        ne1 ne1Var11113 = ne1Var6;
                        kk0Var2.s();
                        kk0Var = kk0Var2;
                        cd2.DropdownMenuItemContent(ne1Var4, je1Var2, cVar3, ne1Var7, ne1Var11113, z4, kc2Var3, hs2Var2, gh2Var2, kk0Var, i16 & 268435454);
                        cVar2 = cVar3;
                        ne1Var8 = ne1Var7;
                        ne1Var9 = ne1Var11113;
                        z5 = z4;
                        kc2Var4 = kc2Var3;
                        hs2Var3 = hs2Var2;
                        gh2Var3 = gh2Var2;
                    } else {
                        kk0Var2.X();
                        if ((i & 1) != 0) {
                            if (i17 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i4 != 0) {
                                ne1Var5 = null;
                            }
                            if (i6 != 0) {
                                ne1Var6 = null;
                            }
                            if (i8 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if ((i2 & 64) != 0) {
                                kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                                i12 &= -3670017;
                            } else {
                                kc2VarItemColors = kc2Var2;
                            }
                            if (i10 != 0) {
                                hs2Var2 = ic2.b;
                            } else {
                                hs2Var2 = hs2Var;
                            }
                            if (i14 != 0) {
                                gh2Var2 = null;
                            } else {
                                gh2Var2 = gh2Var;
                            }
                            z4 = z3;
                            ne1Var7 = ne1Var5;
                            kc2Var3 = kc2VarItemColors;
                            i16 = i12;
                        } else {
                            if (i17 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i4 != 0) {
                                ne1Var5 = null;
                            }
                            if (i6 != 0) {
                                ne1Var6 = null;
                            }
                            if (i8 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if ((i2 & 64) != 0) {
                                kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                                i12 &= -3670017;
                            } else {
                                kc2VarItemColors = kc2Var2;
                            }
                            if (i10 != 0) {
                                hs2Var2 = ic2.b;
                            } else {
                                hs2Var2 = hs2Var;
                            }
                            if (i14 != 0) {
                                gh2Var2 = null;
                            } else {
                                gh2Var2 = gh2Var;
                            }
                            z4 = z3;
                            ne1Var7 = ne1Var5;
                            kc2Var3 = kc2VarItemColors;
                            i16 = i12;
                        }
                        ne1 ne1Var11114 = ne1Var6;
                        kk0Var2.s();
                        kk0Var = kk0Var2;
                        cd2.DropdownMenuItemContent(ne1Var4, je1Var2, cVar3, ne1Var7, ne1Var11114, z4, kc2Var3, hs2Var2, gh2Var2, kk0Var, i16 & 268435454);
                        cVar2 = cVar3;
                        ne1Var8 = ne1Var7;
                        ne1Var9 = ne1Var11114;
                        z5 = z4;
                        kc2Var4 = kc2Var3;
                        hs2Var3 = hs2Var2;
                        gh2Var3 = gh2Var2;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new yb(ne1Var, je1Var, cVar2, ne1Var8, ne1Var9, z5, kc2Var4, hs2Var3, gh2Var3, i, i2));
                    }
                }
                i3 |= 196608;
                z2 = z;
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        kc2Var2 = kc2Var;
                        if (kk0Var2.h(kc2Var2)) {
                        }
                        i3 |= i18;
                    } else {
                        kc2Var2 = kc2Var;
                    }
                    i3 |= i18;
                } else {
                    kc2Var2 = kc2Var;
                }
                i10 = i2 & Uuid.SIZE_BITS;
                if (i10 != 0) {
                    i12 = i3 | 12582912;
                } else {
                    i11 = i3;
                    if ((i & 12582912) == 0) {
                        if (kk0Var2.h(hs2Var)) {
                            i13 = 8388608;
                        } else {
                            i13 = 4194304;
                        }
                        i12 = i11 | i13;
                    } else {
                        i12 = i11;
                    }
                }
                i14 = i2 & FontInfo.NUMBER_OF_CHAR_CODES;
                if (i14 != 0) {
                    if ((i & 100663296) == 0) {
                        if (kk0Var2.h(gh2Var)) {
                            i15 = 67108864;
                        } else {
                            i15 = 33554432;
                        }
                        i12 |= i15;
                    }
                    if ((i12 & 38347923) == 38347922) {
                        kk0Var2.X();
                        if ((i & 1) != 0) {
                            if (i17 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i4 != 0) {
                                ne1Var5 = null;
                            }
                            if (i6 != 0) {
                                ne1Var6 = null;
                            }
                            if (i8 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if ((i2 & 64) != 0) {
                                kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                                i12 &= -3670017;
                            } else {
                                kc2VarItemColors = kc2Var2;
                            }
                            if (i10 != 0) {
                                hs2Var2 = ic2.b;
                            } else {
                                hs2Var2 = hs2Var;
                            }
                            if (i14 != 0) {
                                gh2Var2 = null;
                            } else {
                                gh2Var2 = gh2Var;
                            }
                            z4 = z3;
                            ne1Var7 = ne1Var5;
                            kc2Var3 = kc2VarItemColors;
                            i16 = i12;
                        } else {
                            if (i17 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i4 != 0) {
                                ne1Var5 = null;
                            }
                            if (i6 != 0) {
                                ne1Var6 = null;
                            }
                            if (i8 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if ((i2 & 64) != 0) {
                                kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                                i12 &= -3670017;
                            } else {
                                kc2VarItemColors = kc2Var2;
                            }
                            if (i10 != 0) {
                                hs2Var2 = ic2.b;
                            } else {
                                hs2Var2 = hs2Var;
                            }
                            if (i14 != 0) {
                                gh2Var2 = null;
                            } else {
                                gh2Var2 = gh2Var;
                            }
                            z4 = z3;
                            ne1Var7 = ne1Var5;
                            kc2Var3 = kc2VarItemColors;
                            i16 = i12;
                        }
                        ne1 ne1Var11115 = ne1Var6;
                        kk0Var2.s();
                        kk0Var = kk0Var2;
                        cd2.DropdownMenuItemContent(ne1Var4, je1Var2, cVar3, ne1Var7, ne1Var11115, z4, kc2Var3, hs2Var2, gh2Var2, kk0Var, i16 & 268435454);
                        cVar2 = cVar3;
                        ne1Var8 = ne1Var7;
                        ne1Var9 = ne1Var11115;
                        z5 = z4;
                        kc2Var4 = kc2Var3;
                        hs2Var3 = hs2Var2;
                        gh2Var3 = gh2Var2;
                    } else {
                        kk0Var2.X();
                        if ((i & 1) != 0) {
                            if (i17 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i4 != 0) {
                                ne1Var5 = null;
                            }
                            if (i6 != 0) {
                                ne1Var6 = null;
                            }
                            if (i8 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if ((i2 & 64) != 0) {
                                kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                                i12 &= -3670017;
                            } else {
                                kc2VarItemColors = kc2Var2;
                            }
                            if (i10 != 0) {
                                hs2Var2 = ic2.b;
                            } else {
                                hs2Var2 = hs2Var;
                            }
                            if (i14 != 0) {
                                gh2Var2 = null;
                            } else {
                                gh2Var2 = gh2Var;
                            }
                            z4 = z3;
                            ne1Var7 = ne1Var5;
                            kc2Var3 = kc2VarItemColors;
                            i16 = i12;
                        } else {
                            if (i17 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i4 != 0) {
                                ne1Var5 = null;
                            }
                            if (i6 != 0) {
                                ne1Var6 = null;
                            }
                            if (i8 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if ((i2 & 64) != 0) {
                                kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                                i12 &= -3670017;
                            } else {
                                kc2VarItemColors = kc2Var2;
                            }
                            if (i10 != 0) {
                                hs2Var2 = ic2.b;
                            } else {
                                hs2Var2 = hs2Var;
                            }
                            if (i14 != 0) {
                                gh2Var2 = null;
                            } else {
                                gh2Var2 = gh2Var;
                            }
                            z4 = z3;
                            ne1Var7 = ne1Var5;
                            kc2Var3 = kc2VarItemColors;
                            i16 = i12;
                        }
                        ne1 ne1Var11116 = ne1Var6;
                        kk0Var2.s();
                        kk0Var = kk0Var2;
                        cd2.DropdownMenuItemContent(ne1Var4, je1Var2, cVar3, ne1Var7, ne1Var11116, z4, kc2Var3, hs2Var2, gh2Var2, kk0Var, i16 & 268435454);
                        cVar2 = cVar3;
                        ne1Var8 = ne1Var7;
                        ne1Var9 = ne1Var11116;
                        z5 = z4;
                        kc2Var4 = kc2Var3;
                        hs2Var3 = hs2Var2;
                        gh2Var3 = gh2Var2;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new yb(ne1Var, je1Var, cVar2, ne1Var8, ne1Var9, z5, kc2Var4, hs2Var3, gh2Var3, i, i2));
                    }
                }
                i12 |= 100663296;
                if ((i12 & 38347923) == 38347922) {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i17 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            ne1Var5 = null;
                        }
                        if (i6 != 0) {
                            ne1Var6 = null;
                        }
                        if (i8 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if ((i2 & 64) != 0) {
                            kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                            i12 &= -3670017;
                        } else {
                            kc2VarItemColors = kc2Var2;
                        }
                        if (i10 != 0) {
                            hs2Var2 = ic2.b;
                        } else {
                            hs2Var2 = hs2Var;
                        }
                        if (i14 != 0) {
                            gh2Var2 = null;
                        } else {
                            gh2Var2 = gh2Var;
                        }
                        z4 = z3;
                        ne1Var7 = ne1Var5;
                        kc2Var3 = kc2VarItemColors;
                        i16 = i12;
                    } else {
                        if (i17 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            ne1Var5 = null;
                        }
                        if (i6 != 0) {
                            ne1Var6 = null;
                        }
                        if (i8 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if ((i2 & 64) != 0) {
                            kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                            i12 &= -3670017;
                        } else {
                            kc2VarItemColors = kc2Var2;
                        }
                        if (i10 != 0) {
                            hs2Var2 = ic2.b;
                        } else {
                            hs2Var2 = hs2Var;
                        }
                        if (i14 != 0) {
                            gh2Var2 = null;
                        } else {
                            gh2Var2 = gh2Var;
                        }
                        z4 = z3;
                        ne1Var7 = ne1Var5;
                        kc2Var3 = kc2VarItemColors;
                        i16 = i12;
                    }
                    ne1 ne1Var11117 = ne1Var6;
                    kk0Var2.s();
                    kk0Var = kk0Var2;
                    cd2.DropdownMenuItemContent(ne1Var4, je1Var2, cVar3, ne1Var7, ne1Var11117, z4, kc2Var3, hs2Var2, gh2Var2, kk0Var, i16 & 268435454);
                    cVar2 = cVar3;
                    ne1Var8 = ne1Var7;
                    ne1Var9 = ne1Var11117;
                    z5 = z4;
                    kc2Var4 = kc2Var3;
                    hs2Var3 = hs2Var2;
                    gh2Var3 = gh2Var2;
                } else {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i17 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            ne1Var5 = null;
                        }
                        if (i6 != 0) {
                            ne1Var6 = null;
                        }
                        if (i8 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if ((i2 & 64) != 0) {
                            kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                            i12 &= -3670017;
                        } else {
                            kc2VarItemColors = kc2Var2;
                        }
                        if (i10 != 0) {
                            hs2Var2 = ic2.b;
                        } else {
                            hs2Var2 = hs2Var;
                        }
                        if (i14 != 0) {
                            gh2Var2 = null;
                        } else {
                            gh2Var2 = gh2Var;
                        }
                        z4 = z3;
                        ne1Var7 = ne1Var5;
                        kc2Var3 = kc2VarItemColors;
                        i16 = i12;
                    } else {
                        if (i17 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            ne1Var5 = null;
                        }
                        if (i6 != 0) {
                            ne1Var6 = null;
                        }
                        if (i8 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if ((i2 & 64) != 0) {
                            kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                            i12 &= -3670017;
                        } else {
                            kc2VarItemColors = kc2Var2;
                        }
                        if (i10 != 0) {
                            hs2Var2 = ic2.b;
                        } else {
                            hs2Var2 = hs2Var;
                        }
                        if (i14 != 0) {
                            gh2Var2 = null;
                        } else {
                            gh2Var2 = gh2Var;
                        }
                        z4 = z3;
                        ne1Var7 = ne1Var5;
                        kc2Var3 = kc2VarItemColors;
                        i16 = i12;
                    }
                    ne1 ne1Var11118 = ne1Var6;
                    kk0Var2.s();
                    kk0Var = kk0Var2;
                    cd2.DropdownMenuItemContent(ne1Var4, je1Var2, cVar3, ne1Var7, ne1Var11118, z4, kc2Var3, hs2Var2, gh2Var2, kk0Var, i16 & 268435454);
                    cVar2 = cVar3;
                    ne1Var8 = ne1Var7;
                    ne1Var9 = ne1Var11118;
                    z5 = z4;
                    kc2Var4 = kc2Var3;
                    hs2Var3 = hs2Var2;
                    gh2Var3 = gh2Var2;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new yb(ne1Var, je1Var, cVar2, ne1Var8, ne1Var9, z5, kc2Var4, hs2Var3, gh2Var3, i, i2));
                }
            }
            i3 |= 24576;
            ne1Var6 = ne1Var3;
            i8 = i2 & 32;
            if (i8 != 0) {
                if ((196608 & i) == 0) {
                    z2 = z;
                    if (kk0Var2.i(z2)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        kc2Var2 = kc2Var;
                        if (kk0Var2.h(kc2Var2)) {
                        }
                        i3 |= i18;
                    } else {
                        kc2Var2 = kc2Var;
                    }
                    i3 |= i18;
                } else {
                    kc2Var2 = kc2Var;
                }
                i10 = i2 & Uuid.SIZE_BITS;
                if (i10 != 0) {
                    i12 = i3 | 12582912;
                } else {
                    i11 = i3;
                    if ((i & 12582912) == 0) {
                        if (kk0Var2.h(hs2Var)) {
                            i13 = 8388608;
                        } else {
                            i13 = 4194304;
                        }
                        i12 = i11 | i13;
                    } else {
                        i12 = i11;
                    }
                }
                i14 = i2 & FontInfo.NUMBER_OF_CHAR_CODES;
                if (i14 != 0) {
                    if ((i & 100663296) == 0) {
                        if (kk0Var2.h(gh2Var)) {
                            i15 = 67108864;
                        } else {
                            i15 = 33554432;
                        }
                        i12 |= i15;
                    }
                    if ((i12 & 38347923) == 38347922) {
                        kk0Var2.X();
                        if ((i & 1) != 0) {
                            if (i17 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i4 != 0) {
                                ne1Var5 = null;
                            }
                            if (i6 != 0) {
                                ne1Var6 = null;
                            }
                            if (i8 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if ((i2 & 64) != 0) {
                                kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                                i12 &= -3670017;
                            } else {
                                kc2VarItemColors = kc2Var2;
                            }
                            if (i10 != 0) {
                                hs2Var2 = ic2.b;
                            } else {
                                hs2Var2 = hs2Var;
                            }
                            if (i14 != 0) {
                                gh2Var2 = null;
                            } else {
                                gh2Var2 = gh2Var;
                            }
                            z4 = z3;
                            ne1Var7 = ne1Var5;
                            kc2Var3 = kc2VarItemColors;
                            i16 = i12;
                        } else {
                            if (i17 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i4 != 0) {
                                ne1Var5 = null;
                            }
                            if (i6 != 0) {
                                ne1Var6 = null;
                            }
                            if (i8 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if ((i2 & 64) != 0) {
                                kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                                i12 &= -3670017;
                            } else {
                                kc2VarItemColors = kc2Var2;
                            }
                            if (i10 != 0) {
                                hs2Var2 = ic2.b;
                            } else {
                                hs2Var2 = hs2Var;
                            }
                            if (i14 != 0) {
                                gh2Var2 = null;
                            } else {
                                gh2Var2 = gh2Var;
                            }
                            z4 = z3;
                            ne1Var7 = ne1Var5;
                            kc2Var3 = kc2VarItemColors;
                            i16 = i12;
                        }
                        ne1 ne1Var11119 = ne1Var6;
                        kk0Var2.s();
                        kk0Var = kk0Var2;
                        cd2.DropdownMenuItemContent(ne1Var4, je1Var2, cVar3, ne1Var7, ne1Var11119, z4, kc2Var3, hs2Var2, gh2Var2, kk0Var, i16 & 268435454);
                        cVar2 = cVar3;
                        ne1Var8 = ne1Var7;
                        ne1Var9 = ne1Var11119;
                        z5 = z4;
                        kc2Var4 = kc2Var3;
                        hs2Var3 = hs2Var2;
                        gh2Var3 = gh2Var2;
                    } else {
                        kk0Var2.X();
                        if ((i & 1) != 0) {
                            if (i17 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i4 != 0) {
                                ne1Var5 = null;
                            }
                            if (i6 != 0) {
                                ne1Var6 = null;
                            }
                            if (i8 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if ((i2 & 64) != 0) {
                                kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                                i12 &= -3670017;
                            } else {
                                kc2VarItemColors = kc2Var2;
                            }
                            if (i10 != 0) {
                                hs2Var2 = ic2.b;
                            } else {
                                hs2Var2 = hs2Var;
                            }
                            if (i14 != 0) {
                                gh2Var2 = null;
                            } else {
                                gh2Var2 = gh2Var;
                            }
                            z4 = z3;
                            ne1Var7 = ne1Var5;
                            kc2Var3 = kc2VarItemColors;
                            i16 = i12;
                        } else {
                            if (i17 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i4 != 0) {
                                ne1Var5 = null;
                            }
                            if (i6 != 0) {
                                ne1Var6 = null;
                            }
                            if (i8 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if ((i2 & 64) != 0) {
                                kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                                i12 &= -3670017;
                            } else {
                                kc2VarItemColors = kc2Var2;
                            }
                            if (i10 != 0) {
                                hs2Var2 = ic2.b;
                            } else {
                                hs2Var2 = hs2Var;
                            }
                            if (i14 != 0) {
                                gh2Var2 = null;
                            } else {
                                gh2Var2 = gh2Var;
                            }
                            z4 = z3;
                            ne1Var7 = ne1Var5;
                            kc2Var3 = kc2VarItemColors;
                            i16 = i12;
                        }
                        ne1 ne1Var111110 = ne1Var6;
                        kk0Var2.s();
                        kk0Var = kk0Var2;
                        cd2.DropdownMenuItemContent(ne1Var4, je1Var2, cVar3, ne1Var7, ne1Var111110, z4, kc2Var3, hs2Var2, gh2Var2, kk0Var, i16 & 268435454);
                        cVar2 = cVar3;
                        ne1Var8 = ne1Var7;
                        ne1Var9 = ne1Var111110;
                        z5 = z4;
                        kc2Var4 = kc2Var3;
                        hs2Var3 = hs2Var2;
                        gh2Var3 = gh2Var2;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new yb(ne1Var, je1Var, cVar2, ne1Var8, ne1Var9, z5, kc2Var4, hs2Var3, gh2Var3, i, i2));
                    }
                }
                i12 |= 100663296;
                if ((i12 & 38347923) == 38347922) {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i17 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            ne1Var5 = null;
                        }
                        if (i6 != 0) {
                            ne1Var6 = null;
                        }
                        if (i8 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if ((i2 & 64) != 0) {
                            kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                            i12 &= -3670017;
                        } else {
                            kc2VarItemColors = kc2Var2;
                        }
                        if (i10 != 0) {
                            hs2Var2 = ic2.b;
                        } else {
                            hs2Var2 = hs2Var;
                        }
                        if (i14 != 0) {
                            gh2Var2 = null;
                        } else {
                            gh2Var2 = gh2Var;
                        }
                        z4 = z3;
                        ne1Var7 = ne1Var5;
                        kc2Var3 = kc2VarItemColors;
                        i16 = i12;
                    } else {
                        if (i17 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            ne1Var5 = null;
                        }
                        if (i6 != 0) {
                            ne1Var6 = null;
                        }
                        if (i8 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if ((i2 & 64) != 0) {
                            kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                            i12 &= -3670017;
                        } else {
                            kc2VarItemColors = kc2Var2;
                        }
                        if (i10 != 0) {
                            hs2Var2 = ic2.b;
                        } else {
                            hs2Var2 = hs2Var;
                        }
                        if (i14 != 0) {
                            gh2Var2 = null;
                        } else {
                            gh2Var2 = gh2Var;
                        }
                        z4 = z3;
                        ne1Var7 = ne1Var5;
                        kc2Var3 = kc2VarItemColors;
                        i16 = i12;
                    }
                    ne1 ne1Var111111 = ne1Var6;
                    kk0Var2.s();
                    kk0Var = kk0Var2;
                    cd2.DropdownMenuItemContent(ne1Var4, je1Var2, cVar3, ne1Var7, ne1Var111111, z4, kc2Var3, hs2Var2, gh2Var2, kk0Var, i16 & 268435454);
                    cVar2 = cVar3;
                    ne1Var8 = ne1Var7;
                    ne1Var9 = ne1Var111111;
                    z5 = z4;
                    kc2Var4 = kc2Var3;
                    hs2Var3 = hs2Var2;
                    gh2Var3 = gh2Var2;
                } else {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i17 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            ne1Var5 = null;
                        }
                        if (i6 != 0) {
                            ne1Var6 = null;
                        }
                        if (i8 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if ((i2 & 64) != 0) {
                            kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                            i12 &= -3670017;
                        } else {
                            kc2VarItemColors = kc2Var2;
                        }
                        if (i10 != 0) {
                            hs2Var2 = ic2.b;
                        } else {
                            hs2Var2 = hs2Var;
                        }
                        if (i14 != 0) {
                            gh2Var2 = null;
                        } else {
                            gh2Var2 = gh2Var;
                        }
                        z4 = z3;
                        ne1Var7 = ne1Var5;
                        kc2Var3 = kc2VarItemColors;
                        i16 = i12;
                    } else {
                        if (i17 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            ne1Var5 = null;
                        }
                        if (i6 != 0) {
                            ne1Var6 = null;
                        }
                        if (i8 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if ((i2 & 64) != 0) {
                            kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                            i12 &= -3670017;
                        } else {
                            kc2VarItemColors = kc2Var2;
                        }
                        if (i10 != 0) {
                            hs2Var2 = ic2.b;
                        } else {
                            hs2Var2 = hs2Var;
                        }
                        if (i14 != 0) {
                            gh2Var2 = null;
                        } else {
                            gh2Var2 = gh2Var;
                        }
                        z4 = z3;
                        ne1Var7 = ne1Var5;
                        kc2Var3 = kc2VarItemColors;
                        i16 = i12;
                    }
                    ne1 ne1Var111112 = ne1Var6;
                    kk0Var2.s();
                    kk0Var = kk0Var2;
                    cd2.DropdownMenuItemContent(ne1Var4, je1Var2, cVar3, ne1Var7, ne1Var111112, z4, kc2Var3, hs2Var2, gh2Var2, kk0Var, i16 & 268435454);
                    cVar2 = cVar3;
                    ne1Var8 = ne1Var7;
                    ne1Var9 = ne1Var111112;
                    z5 = z4;
                    kc2Var4 = kc2Var3;
                    hs2Var3 = hs2Var2;
                    gh2Var3 = gh2Var2;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new yb(ne1Var, je1Var, cVar2, ne1Var8, ne1Var9, z5, kc2Var4, hs2Var3, gh2Var3, i, i2));
                }
            }
            i3 |= 196608;
            z2 = z;
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    kc2Var2 = kc2Var;
                    if (kk0Var2.h(kc2Var2)) {
                    }
                    i3 |= i18;
                } else {
                    kc2Var2 = kc2Var;
                }
                i3 |= i18;
            } else {
                kc2Var2 = kc2Var;
            }
            i10 = i2 & Uuid.SIZE_BITS;
            if (i10 != 0) {
                i12 = i3 | 12582912;
            } else {
                i11 = i3;
                if ((i & 12582912) == 0) {
                    if (kk0Var2.h(hs2Var)) {
                        i13 = 8388608;
                    } else {
                        i13 = 4194304;
                    }
                    i12 = i11 | i13;
                } else {
                    i12 = i11;
                }
            }
            i14 = i2 & FontInfo.NUMBER_OF_CHAR_CODES;
            if (i14 != 0) {
                if ((i & 100663296) == 0) {
                    if (kk0Var2.h(gh2Var)) {
                        i15 = 67108864;
                    } else {
                        i15 = 33554432;
                    }
                    i12 |= i15;
                }
                if ((i12 & 38347923) == 38347922) {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i17 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            ne1Var5 = null;
                        }
                        if (i6 != 0) {
                            ne1Var6 = null;
                        }
                        if (i8 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if ((i2 & 64) != 0) {
                            kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                            i12 &= -3670017;
                        } else {
                            kc2VarItemColors = kc2Var2;
                        }
                        if (i10 != 0) {
                            hs2Var2 = ic2.b;
                        } else {
                            hs2Var2 = hs2Var;
                        }
                        if (i14 != 0) {
                            gh2Var2 = null;
                        } else {
                            gh2Var2 = gh2Var;
                        }
                        z4 = z3;
                        ne1Var7 = ne1Var5;
                        kc2Var3 = kc2VarItemColors;
                        i16 = i12;
                    } else {
                        if (i17 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            ne1Var5 = null;
                        }
                        if (i6 != 0) {
                            ne1Var6 = null;
                        }
                        if (i8 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if ((i2 & 64) != 0) {
                            kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                            i12 &= -3670017;
                        } else {
                            kc2VarItemColors = kc2Var2;
                        }
                        if (i10 != 0) {
                            hs2Var2 = ic2.b;
                        } else {
                            hs2Var2 = hs2Var;
                        }
                        if (i14 != 0) {
                            gh2Var2 = null;
                        } else {
                            gh2Var2 = gh2Var;
                        }
                        z4 = z3;
                        ne1Var7 = ne1Var5;
                        kc2Var3 = kc2VarItemColors;
                        i16 = i12;
                    }
                    ne1 ne1Var111113 = ne1Var6;
                    kk0Var2.s();
                    kk0Var = kk0Var2;
                    cd2.DropdownMenuItemContent(ne1Var4, je1Var2, cVar3, ne1Var7, ne1Var111113, z4, kc2Var3, hs2Var2, gh2Var2, kk0Var, i16 & 268435454);
                    cVar2 = cVar3;
                    ne1Var8 = ne1Var7;
                    ne1Var9 = ne1Var111113;
                    z5 = z4;
                    kc2Var4 = kc2Var3;
                    hs2Var3 = hs2Var2;
                    gh2Var3 = gh2Var2;
                } else {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i17 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            ne1Var5 = null;
                        }
                        if (i6 != 0) {
                            ne1Var6 = null;
                        }
                        if (i8 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if ((i2 & 64) != 0) {
                            kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                            i12 &= -3670017;
                        } else {
                            kc2VarItemColors = kc2Var2;
                        }
                        if (i10 != 0) {
                            hs2Var2 = ic2.b;
                        } else {
                            hs2Var2 = hs2Var;
                        }
                        if (i14 != 0) {
                            gh2Var2 = null;
                        } else {
                            gh2Var2 = gh2Var;
                        }
                        z4 = z3;
                        ne1Var7 = ne1Var5;
                        kc2Var3 = kc2VarItemColors;
                        i16 = i12;
                    } else {
                        if (i17 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            ne1Var5 = null;
                        }
                        if (i6 != 0) {
                            ne1Var6 = null;
                        }
                        if (i8 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if ((i2 & 64) != 0) {
                            kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                            i12 &= -3670017;
                        } else {
                            kc2VarItemColors = kc2Var2;
                        }
                        if (i10 != 0) {
                            hs2Var2 = ic2.b;
                        } else {
                            hs2Var2 = hs2Var;
                        }
                        if (i14 != 0) {
                            gh2Var2 = null;
                        } else {
                            gh2Var2 = gh2Var;
                        }
                        z4 = z3;
                        ne1Var7 = ne1Var5;
                        kc2Var3 = kc2VarItemColors;
                        i16 = i12;
                    }
                    ne1 ne1Var111114 = ne1Var6;
                    kk0Var2.s();
                    kk0Var = kk0Var2;
                    cd2.DropdownMenuItemContent(ne1Var4, je1Var2, cVar3, ne1Var7, ne1Var111114, z4, kc2Var3, hs2Var2, gh2Var2, kk0Var, i16 & 268435454);
                    cVar2 = cVar3;
                    ne1Var8 = ne1Var7;
                    ne1Var9 = ne1Var111114;
                    z5 = z4;
                    kc2Var4 = kc2Var3;
                    hs2Var3 = hs2Var2;
                    gh2Var3 = gh2Var2;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new yb(ne1Var, je1Var, cVar2, ne1Var8, ne1Var9, z5, kc2Var4, hs2Var3, gh2Var3, i, i2));
                }
            }
            i12 |= 100663296;
            if ((i12 & 38347923) == 38347922) {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i17 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        ne1Var5 = null;
                    }
                    if (i6 != 0) {
                        ne1Var6 = null;
                    }
                    if (i8 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if ((i2 & 64) != 0) {
                        kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                        i12 &= -3670017;
                    } else {
                        kc2VarItemColors = kc2Var2;
                    }
                    if (i10 != 0) {
                        hs2Var2 = ic2.b;
                    } else {
                        hs2Var2 = hs2Var;
                    }
                    if (i14 != 0) {
                        gh2Var2 = null;
                    } else {
                        gh2Var2 = gh2Var;
                    }
                    z4 = z3;
                    ne1Var7 = ne1Var5;
                    kc2Var3 = kc2VarItemColors;
                    i16 = i12;
                } else {
                    if (i17 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        ne1Var5 = null;
                    }
                    if (i6 != 0) {
                        ne1Var6 = null;
                    }
                    if (i8 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if ((i2 & 64) != 0) {
                        kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                        i12 &= -3670017;
                    } else {
                        kc2VarItemColors = kc2Var2;
                    }
                    if (i10 != 0) {
                        hs2Var2 = ic2.b;
                    } else {
                        hs2Var2 = hs2Var;
                    }
                    if (i14 != 0) {
                        gh2Var2 = null;
                    } else {
                        gh2Var2 = gh2Var;
                    }
                    z4 = z3;
                    ne1Var7 = ne1Var5;
                    kc2Var3 = kc2VarItemColors;
                    i16 = i12;
                }
                ne1 ne1Var111115 = ne1Var6;
                kk0Var2.s();
                kk0Var = kk0Var2;
                cd2.DropdownMenuItemContent(ne1Var4, je1Var2, cVar3, ne1Var7, ne1Var111115, z4, kc2Var3, hs2Var2, gh2Var2, kk0Var, i16 & 268435454);
                cVar2 = cVar3;
                ne1Var8 = ne1Var7;
                ne1Var9 = ne1Var111115;
                z5 = z4;
                kc2Var4 = kc2Var3;
                hs2Var3 = hs2Var2;
                gh2Var3 = gh2Var2;
            } else {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i17 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        ne1Var5 = null;
                    }
                    if (i6 != 0) {
                        ne1Var6 = null;
                    }
                    if (i8 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if ((i2 & 64) != 0) {
                        kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                        i12 &= -3670017;
                    } else {
                        kc2VarItemColors = kc2Var2;
                    }
                    if (i10 != 0) {
                        hs2Var2 = ic2.b;
                    } else {
                        hs2Var2 = hs2Var;
                    }
                    if (i14 != 0) {
                        gh2Var2 = null;
                    } else {
                        gh2Var2 = gh2Var;
                    }
                    z4 = z3;
                    ne1Var7 = ne1Var5;
                    kc2Var3 = kc2VarItemColors;
                    i16 = i12;
                } else {
                    if (i17 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        ne1Var5 = null;
                    }
                    if (i6 != 0) {
                        ne1Var6 = null;
                    }
                    if (i8 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if ((i2 & 64) != 0) {
                        kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                        i12 &= -3670017;
                    } else {
                        kc2VarItemColors = kc2Var2;
                    }
                    if (i10 != 0) {
                        hs2Var2 = ic2.b;
                    } else {
                        hs2Var2 = hs2Var;
                    }
                    if (i14 != 0) {
                        gh2Var2 = null;
                    } else {
                        gh2Var2 = gh2Var;
                    }
                    z4 = z3;
                    ne1Var7 = ne1Var5;
                    kc2Var3 = kc2VarItemColors;
                    i16 = i12;
                }
                ne1 ne1Var111116 = ne1Var6;
                kk0Var2.s();
                kk0Var = kk0Var2;
                cd2.DropdownMenuItemContent(ne1Var4, je1Var2, cVar3, ne1Var7, ne1Var111116, z4, kc2Var3, hs2Var2, gh2Var2, kk0Var, i16 & 268435454);
                cVar2 = cVar3;
                ne1Var8 = ne1Var7;
                ne1Var9 = ne1Var111116;
                z5 = z4;
                kc2Var4 = kc2Var3;
                hs2Var3 = hs2Var2;
                gh2Var3 = gh2Var2;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new yb(ne1Var, je1Var, cVar2, ne1Var8, ne1Var9, z5, kc2Var4, hs2Var3, gh2Var3, i, i2));
            }
        }
        i3 |= 3072;
        ne1Var5 = ne1Var2;
        i6 = i2 & 16;
        if (i6 != 0) {
            if ((i & 24576) == 0) {
                ne1Var6 = ne1Var3;
                if (kk0Var2.j(ne1Var6)) {
                    i7 = 16384;
                } else {
                    i7 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                }
                i3 |= i7;
            }
            i8 = i2 & 32;
            if (i8 != 0) {
                if ((196608 & i) == 0) {
                    z2 = z;
                    if (kk0Var2.i(z2)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        kc2Var2 = kc2Var;
                        if (kk0Var2.h(kc2Var2)) {
                        }
                        i3 |= i18;
                    } else {
                        kc2Var2 = kc2Var;
                    }
                    i3 |= i18;
                } else {
                    kc2Var2 = kc2Var;
                }
                i10 = i2 & Uuid.SIZE_BITS;
                if (i10 != 0) {
                    i12 = i3 | 12582912;
                } else {
                    i11 = i3;
                    if ((i & 12582912) == 0) {
                        if (kk0Var2.h(hs2Var)) {
                            i13 = 8388608;
                        } else {
                            i13 = 4194304;
                        }
                        i12 = i11 | i13;
                    } else {
                        i12 = i11;
                    }
                }
                i14 = i2 & FontInfo.NUMBER_OF_CHAR_CODES;
                if (i14 != 0) {
                    if ((i & 100663296) == 0) {
                        if (kk0Var2.h(gh2Var)) {
                            i15 = 67108864;
                        } else {
                            i15 = 33554432;
                        }
                        i12 |= i15;
                    }
                    if ((i12 & 38347923) == 38347922) {
                        kk0Var2.X();
                        if ((i & 1) != 0) {
                            if (i17 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i4 != 0) {
                                ne1Var5 = null;
                            }
                            if (i6 != 0) {
                                ne1Var6 = null;
                            }
                            if (i8 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if ((i2 & 64) != 0) {
                                kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                                i12 &= -3670017;
                            } else {
                                kc2VarItemColors = kc2Var2;
                            }
                            if (i10 != 0) {
                                hs2Var2 = ic2.b;
                            } else {
                                hs2Var2 = hs2Var;
                            }
                            if (i14 != 0) {
                                gh2Var2 = null;
                            } else {
                                gh2Var2 = gh2Var;
                            }
                            z4 = z3;
                            ne1Var7 = ne1Var5;
                            kc2Var3 = kc2VarItemColors;
                            i16 = i12;
                        } else {
                            if (i17 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i4 != 0) {
                                ne1Var5 = null;
                            }
                            if (i6 != 0) {
                                ne1Var6 = null;
                            }
                            if (i8 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if ((i2 & 64) != 0) {
                                kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                                i12 &= -3670017;
                            } else {
                                kc2VarItemColors = kc2Var2;
                            }
                            if (i10 != 0) {
                                hs2Var2 = ic2.b;
                            } else {
                                hs2Var2 = hs2Var;
                            }
                            if (i14 != 0) {
                                gh2Var2 = null;
                            } else {
                                gh2Var2 = gh2Var;
                            }
                            z4 = z3;
                            ne1Var7 = ne1Var5;
                            kc2Var3 = kc2VarItemColors;
                            i16 = i12;
                        }
                        ne1 ne1Var111117 = ne1Var6;
                        kk0Var2.s();
                        kk0Var = kk0Var2;
                        cd2.DropdownMenuItemContent(ne1Var4, je1Var2, cVar3, ne1Var7, ne1Var111117, z4, kc2Var3, hs2Var2, gh2Var2, kk0Var, i16 & 268435454);
                        cVar2 = cVar3;
                        ne1Var8 = ne1Var7;
                        ne1Var9 = ne1Var111117;
                        z5 = z4;
                        kc2Var4 = kc2Var3;
                        hs2Var3 = hs2Var2;
                        gh2Var3 = gh2Var2;
                    } else {
                        kk0Var2.X();
                        if ((i & 1) != 0) {
                            if (i17 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i4 != 0) {
                                ne1Var5 = null;
                            }
                            if (i6 != 0) {
                                ne1Var6 = null;
                            }
                            if (i8 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if ((i2 & 64) != 0) {
                                kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                                i12 &= -3670017;
                            } else {
                                kc2VarItemColors = kc2Var2;
                            }
                            if (i10 != 0) {
                                hs2Var2 = ic2.b;
                            } else {
                                hs2Var2 = hs2Var;
                            }
                            if (i14 != 0) {
                                gh2Var2 = null;
                            } else {
                                gh2Var2 = gh2Var;
                            }
                            z4 = z3;
                            ne1Var7 = ne1Var5;
                            kc2Var3 = kc2VarItemColors;
                            i16 = i12;
                        } else {
                            if (i17 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i4 != 0) {
                                ne1Var5 = null;
                            }
                            if (i6 != 0) {
                                ne1Var6 = null;
                            }
                            if (i8 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if ((i2 & 64) != 0) {
                                kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                                i12 &= -3670017;
                            } else {
                                kc2VarItemColors = kc2Var2;
                            }
                            if (i10 != 0) {
                                hs2Var2 = ic2.b;
                            } else {
                                hs2Var2 = hs2Var;
                            }
                            if (i14 != 0) {
                                gh2Var2 = null;
                            } else {
                                gh2Var2 = gh2Var;
                            }
                            z4 = z3;
                            ne1Var7 = ne1Var5;
                            kc2Var3 = kc2VarItemColors;
                            i16 = i12;
                        }
                        ne1 ne1Var111118 = ne1Var6;
                        kk0Var2.s();
                        kk0Var = kk0Var2;
                        cd2.DropdownMenuItemContent(ne1Var4, je1Var2, cVar3, ne1Var7, ne1Var111118, z4, kc2Var3, hs2Var2, gh2Var2, kk0Var, i16 & 268435454);
                        cVar2 = cVar3;
                        ne1Var8 = ne1Var7;
                        ne1Var9 = ne1Var111118;
                        z5 = z4;
                        kc2Var4 = kc2Var3;
                        hs2Var3 = hs2Var2;
                        gh2Var3 = gh2Var2;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new yb(ne1Var, je1Var, cVar2, ne1Var8, ne1Var9, z5, kc2Var4, hs2Var3, gh2Var3, i, i2));
                    }
                }
                i12 |= 100663296;
                if ((i12 & 38347923) == 38347922) {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i17 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            ne1Var5 = null;
                        }
                        if (i6 != 0) {
                            ne1Var6 = null;
                        }
                        if (i8 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if ((i2 & 64) != 0) {
                            kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                            i12 &= -3670017;
                        } else {
                            kc2VarItemColors = kc2Var2;
                        }
                        if (i10 != 0) {
                            hs2Var2 = ic2.b;
                        } else {
                            hs2Var2 = hs2Var;
                        }
                        if (i14 != 0) {
                            gh2Var2 = null;
                        } else {
                            gh2Var2 = gh2Var;
                        }
                        z4 = z3;
                        ne1Var7 = ne1Var5;
                        kc2Var3 = kc2VarItemColors;
                        i16 = i12;
                    } else {
                        if (i17 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            ne1Var5 = null;
                        }
                        if (i6 != 0) {
                            ne1Var6 = null;
                        }
                        if (i8 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if ((i2 & 64) != 0) {
                            kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                            i12 &= -3670017;
                        } else {
                            kc2VarItemColors = kc2Var2;
                        }
                        if (i10 != 0) {
                            hs2Var2 = ic2.b;
                        } else {
                            hs2Var2 = hs2Var;
                        }
                        if (i14 != 0) {
                            gh2Var2 = null;
                        } else {
                            gh2Var2 = gh2Var;
                        }
                        z4 = z3;
                        ne1Var7 = ne1Var5;
                        kc2Var3 = kc2VarItemColors;
                        i16 = i12;
                    }
                    ne1 ne1Var111119 = ne1Var6;
                    kk0Var2.s();
                    kk0Var = kk0Var2;
                    cd2.DropdownMenuItemContent(ne1Var4, je1Var2, cVar3, ne1Var7, ne1Var111119, z4, kc2Var3, hs2Var2, gh2Var2, kk0Var, i16 & 268435454);
                    cVar2 = cVar3;
                    ne1Var8 = ne1Var7;
                    ne1Var9 = ne1Var111119;
                    z5 = z4;
                    kc2Var4 = kc2Var3;
                    hs2Var3 = hs2Var2;
                    gh2Var3 = gh2Var2;
                } else {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i17 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            ne1Var5 = null;
                        }
                        if (i6 != 0) {
                            ne1Var6 = null;
                        }
                        if (i8 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if ((i2 & 64) != 0) {
                            kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                            i12 &= -3670017;
                        } else {
                            kc2VarItemColors = kc2Var2;
                        }
                        if (i10 != 0) {
                            hs2Var2 = ic2.b;
                        } else {
                            hs2Var2 = hs2Var;
                        }
                        if (i14 != 0) {
                            gh2Var2 = null;
                        } else {
                            gh2Var2 = gh2Var;
                        }
                        z4 = z3;
                        ne1Var7 = ne1Var5;
                        kc2Var3 = kc2VarItemColors;
                        i16 = i12;
                    } else {
                        if (i17 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            ne1Var5 = null;
                        }
                        if (i6 != 0) {
                            ne1Var6 = null;
                        }
                        if (i8 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if ((i2 & 64) != 0) {
                            kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                            i12 &= -3670017;
                        } else {
                            kc2VarItemColors = kc2Var2;
                        }
                        if (i10 != 0) {
                            hs2Var2 = ic2.b;
                        } else {
                            hs2Var2 = hs2Var;
                        }
                        if (i14 != 0) {
                            gh2Var2 = null;
                        } else {
                            gh2Var2 = gh2Var;
                        }
                        z4 = z3;
                        ne1Var7 = ne1Var5;
                        kc2Var3 = kc2VarItemColors;
                        i16 = i12;
                    }
                    ne1 ne1Var1111110 = ne1Var6;
                    kk0Var2.s();
                    kk0Var = kk0Var2;
                    cd2.DropdownMenuItemContent(ne1Var4, je1Var2, cVar3, ne1Var7, ne1Var1111110, z4, kc2Var3, hs2Var2, gh2Var2, kk0Var, i16 & 268435454);
                    cVar2 = cVar3;
                    ne1Var8 = ne1Var7;
                    ne1Var9 = ne1Var1111110;
                    z5 = z4;
                    kc2Var4 = kc2Var3;
                    hs2Var3 = hs2Var2;
                    gh2Var3 = gh2Var2;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new yb(ne1Var, je1Var, cVar2, ne1Var8, ne1Var9, z5, kc2Var4, hs2Var3, gh2Var3, i, i2));
                }
            }
            i3 |= 196608;
            z2 = z;
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    kc2Var2 = kc2Var;
                    if (kk0Var2.h(kc2Var2)) {
                    }
                    i3 |= i18;
                } else {
                    kc2Var2 = kc2Var;
                }
                i3 |= i18;
            } else {
                kc2Var2 = kc2Var;
            }
            i10 = i2 & Uuid.SIZE_BITS;
            if (i10 != 0) {
                i12 = i3 | 12582912;
            } else {
                i11 = i3;
                if ((i & 12582912) == 0) {
                    if (kk0Var2.h(hs2Var)) {
                        i13 = 8388608;
                    } else {
                        i13 = 4194304;
                    }
                    i12 = i11 | i13;
                } else {
                    i12 = i11;
                }
            }
            i14 = i2 & FontInfo.NUMBER_OF_CHAR_CODES;
            if (i14 != 0) {
                if ((i & 100663296) == 0) {
                    if (kk0Var2.h(gh2Var)) {
                        i15 = 67108864;
                    } else {
                        i15 = 33554432;
                    }
                    i12 |= i15;
                }
                if ((i12 & 38347923) == 38347922) {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i17 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            ne1Var5 = null;
                        }
                        if (i6 != 0) {
                            ne1Var6 = null;
                        }
                        if (i8 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if ((i2 & 64) != 0) {
                            kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                            i12 &= -3670017;
                        } else {
                            kc2VarItemColors = kc2Var2;
                        }
                        if (i10 != 0) {
                            hs2Var2 = ic2.b;
                        } else {
                            hs2Var2 = hs2Var;
                        }
                        if (i14 != 0) {
                            gh2Var2 = null;
                        } else {
                            gh2Var2 = gh2Var;
                        }
                        z4 = z3;
                        ne1Var7 = ne1Var5;
                        kc2Var3 = kc2VarItemColors;
                        i16 = i12;
                    } else {
                        if (i17 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            ne1Var5 = null;
                        }
                        if (i6 != 0) {
                            ne1Var6 = null;
                        }
                        if (i8 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if ((i2 & 64) != 0) {
                            kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                            i12 &= -3670017;
                        } else {
                            kc2VarItemColors = kc2Var2;
                        }
                        if (i10 != 0) {
                            hs2Var2 = ic2.b;
                        } else {
                            hs2Var2 = hs2Var;
                        }
                        if (i14 != 0) {
                            gh2Var2 = null;
                        } else {
                            gh2Var2 = gh2Var;
                        }
                        z4 = z3;
                        ne1Var7 = ne1Var5;
                        kc2Var3 = kc2VarItemColors;
                        i16 = i12;
                    }
                    ne1 ne1Var1111111 = ne1Var6;
                    kk0Var2.s();
                    kk0Var = kk0Var2;
                    cd2.DropdownMenuItemContent(ne1Var4, je1Var2, cVar3, ne1Var7, ne1Var1111111, z4, kc2Var3, hs2Var2, gh2Var2, kk0Var, i16 & 268435454);
                    cVar2 = cVar3;
                    ne1Var8 = ne1Var7;
                    ne1Var9 = ne1Var1111111;
                    z5 = z4;
                    kc2Var4 = kc2Var3;
                    hs2Var3 = hs2Var2;
                    gh2Var3 = gh2Var2;
                } else {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i17 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            ne1Var5 = null;
                        }
                        if (i6 != 0) {
                            ne1Var6 = null;
                        }
                        if (i8 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if ((i2 & 64) != 0) {
                            kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                            i12 &= -3670017;
                        } else {
                            kc2VarItemColors = kc2Var2;
                        }
                        if (i10 != 0) {
                            hs2Var2 = ic2.b;
                        } else {
                            hs2Var2 = hs2Var;
                        }
                        if (i14 != 0) {
                            gh2Var2 = null;
                        } else {
                            gh2Var2 = gh2Var;
                        }
                        z4 = z3;
                        ne1Var7 = ne1Var5;
                        kc2Var3 = kc2VarItemColors;
                        i16 = i12;
                    } else {
                        if (i17 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            ne1Var5 = null;
                        }
                        if (i6 != 0) {
                            ne1Var6 = null;
                        }
                        if (i8 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if ((i2 & 64) != 0) {
                            kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                            i12 &= -3670017;
                        } else {
                            kc2VarItemColors = kc2Var2;
                        }
                        if (i10 != 0) {
                            hs2Var2 = ic2.b;
                        } else {
                            hs2Var2 = hs2Var;
                        }
                        if (i14 != 0) {
                            gh2Var2 = null;
                        } else {
                            gh2Var2 = gh2Var;
                        }
                        z4 = z3;
                        ne1Var7 = ne1Var5;
                        kc2Var3 = kc2VarItemColors;
                        i16 = i12;
                    }
                    ne1 ne1Var1111112 = ne1Var6;
                    kk0Var2.s();
                    kk0Var = kk0Var2;
                    cd2.DropdownMenuItemContent(ne1Var4, je1Var2, cVar3, ne1Var7, ne1Var1111112, z4, kc2Var3, hs2Var2, gh2Var2, kk0Var, i16 & 268435454);
                    cVar2 = cVar3;
                    ne1Var8 = ne1Var7;
                    ne1Var9 = ne1Var1111112;
                    z5 = z4;
                    kc2Var4 = kc2Var3;
                    hs2Var3 = hs2Var2;
                    gh2Var3 = gh2Var2;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new yb(ne1Var, je1Var, cVar2, ne1Var8, ne1Var9, z5, kc2Var4, hs2Var3, gh2Var3, i, i2));
                }
            }
            i12 |= 100663296;
            if ((i12 & 38347923) == 38347922) {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i17 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        ne1Var5 = null;
                    }
                    if (i6 != 0) {
                        ne1Var6 = null;
                    }
                    if (i8 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if ((i2 & 64) != 0) {
                        kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                        i12 &= -3670017;
                    } else {
                        kc2VarItemColors = kc2Var2;
                    }
                    if (i10 != 0) {
                        hs2Var2 = ic2.b;
                    } else {
                        hs2Var2 = hs2Var;
                    }
                    if (i14 != 0) {
                        gh2Var2 = null;
                    } else {
                        gh2Var2 = gh2Var;
                    }
                    z4 = z3;
                    ne1Var7 = ne1Var5;
                    kc2Var3 = kc2VarItemColors;
                    i16 = i12;
                } else {
                    if (i17 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        ne1Var5 = null;
                    }
                    if (i6 != 0) {
                        ne1Var6 = null;
                    }
                    if (i8 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if ((i2 & 64) != 0) {
                        kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                        i12 &= -3670017;
                    } else {
                        kc2VarItemColors = kc2Var2;
                    }
                    if (i10 != 0) {
                        hs2Var2 = ic2.b;
                    } else {
                        hs2Var2 = hs2Var;
                    }
                    if (i14 != 0) {
                        gh2Var2 = null;
                    } else {
                        gh2Var2 = gh2Var;
                    }
                    z4 = z3;
                    ne1Var7 = ne1Var5;
                    kc2Var3 = kc2VarItemColors;
                    i16 = i12;
                }
                ne1 ne1Var1111113 = ne1Var6;
                kk0Var2.s();
                kk0Var = kk0Var2;
                cd2.DropdownMenuItemContent(ne1Var4, je1Var2, cVar3, ne1Var7, ne1Var1111113, z4, kc2Var3, hs2Var2, gh2Var2, kk0Var, i16 & 268435454);
                cVar2 = cVar3;
                ne1Var8 = ne1Var7;
                ne1Var9 = ne1Var1111113;
                z5 = z4;
                kc2Var4 = kc2Var3;
                hs2Var3 = hs2Var2;
                gh2Var3 = gh2Var2;
            } else {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i17 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        ne1Var5 = null;
                    }
                    if (i6 != 0) {
                        ne1Var6 = null;
                    }
                    if (i8 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if ((i2 & 64) != 0) {
                        kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                        i12 &= -3670017;
                    } else {
                        kc2VarItemColors = kc2Var2;
                    }
                    if (i10 != 0) {
                        hs2Var2 = ic2.b;
                    } else {
                        hs2Var2 = hs2Var;
                    }
                    if (i14 != 0) {
                        gh2Var2 = null;
                    } else {
                        gh2Var2 = gh2Var;
                    }
                    z4 = z3;
                    ne1Var7 = ne1Var5;
                    kc2Var3 = kc2VarItemColors;
                    i16 = i12;
                } else {
                    if (i17 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        ne1Var5 = null;
                    }
                    if (i6 != 0) {
                        ne1Var6 = null;
                    }
                    if (i8 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if ((i2 & 64) != 0) {
                        kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                        i12 &= -3670017;
                    } else {
                        kc2VarItemColors = kc2Var2;
                    }
                    if (i10 != 0) {
                        hs2Var2 = ic2.b;
                    } else {
                        hs2Var2 = hs2Var;
                    }
                    if (i14 != 0) {
                        gh2Var2 = null;
                    } else {
                        gh2Var2 = gh2Var;
                    }
                    z4 = z3;
                    ne1Var7 = ne1Var5;
                    kc2Var3 = kc2VarItemColors;
                    i16 = i12;
                }
                ne1 ne1Var1111114 = ne1Var6;
                kk0Var2.s();
                kk0Var = kk0Var2;
                cd2.DropdownMenuItemContent(ne1Var4, je1Var2, cVar3, ne1Var7, ne1Var1111114, z4, kc2Var3, hs2Var2, gh2Var2, kk0Var, i16 & 268435454);
                cVar2 = cVar3;
                ne1Var8 = ne1Var7;
                ne1Var9 = ne1Var1111114;
                z5 = z4;
                kc2Var4 = kc2Var3;
                hs2Var3 = hs2Var2;
                gh2Var3 = gh2Var2;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new yb(ne1Var, je1Var, cVar2, ne1Var8, ne1Var9, z5, kc2Var4, hs2Var3, gh2Var3, i, i2));
            }
        }
        i3 |= 24576;
        ne1Var6 = ne1Var3;
        i8 = i2 & 32;
        if (i8 != 0) {
            if ((196608 & i) == 0) {
                z2 = z;
                if (kk0Var2.i(z2)) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i3 |= i9;
            }
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    kc2Var2 = kc2Var;
                    if (kk0Var2.h(kc2Var2)) {
                    }
                    i3 |= i18;
                } else {
                    kc2Var2 = kc2Var;
                }
                i3 |= i18;
            } else {
                kc2Var2 = kc2Var;
            }
            i10 = i2 & Uuid.SIZE_BITS;
            if (i10 != 0) {
                i12 = i3 | 12582912;
            } else {
                i11 = i3;
                if ((i & 12582912) == 0) {
                    if (kk0Var2.h(hs2Var)) {
                        i13 = 8388608;
                    } else {
                        i13 = 4194304;
                    }
                    i12 = i11 | i13;
                } else {
                    i12 = i11;
                }
            }
            i14 = i2 & FontInfo.NUMBER_OF_CHAR_CODES;
            if (i14 != 0) {
                if ((i & 100663296) == 0) {
                    if (kk0Var2.h(gh2Var)) {
                        i15 = 67108864;
                    } else {
                        i15 = 33554432;
                    }
                    i12 |= i15;
                }
                if ((i12 & 38347923) == 38347922) {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i17 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            ne1Var5 = null;
                        }
                        if (i6 != 0) {
                            ne1Var6 = null;
                        }
                        if (i8 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if ((i2 & 64) != 0) {
                            kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                            i12 &= -3670017;
                        } else {
                            kc2VarItemColors = kc2Var2;
                        }
                        if (i10 != 0) {
                            hs2Var2 = ic2.b;
                        } else {
                            hs2Var2 = hs2Var;
                        }
                        if (i14 != 0) {
                            gh2Var2 = null;
                        } else {
                            gh2Var2 = gh2Var;
                        }
                        z4 = z3;
                        ne1Var7 = ne1Var5;
                        kc2Var3 = kc2VarItemColors;
                        i16 = i12;
                    } else {
                        if (i17 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            ne1Var5 = null;
                        }
                        if (i6 != 0) {
                            ne1Var6 = null;
                        }
                        if (i8 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if ((i2 & 64) != 0) {
                            kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                            i12 &= -3670017;
                        } else {
                            kc2VarItemColors = kc2Var2;
                        }
                        if (i10 != 0) {
                            hs2Var2 = ic2.b;
                        } else {
                            hs2Var2 = hs2Var;
                        }
                        if (i14 != 0) {
                            gh2Var2 = null;
                        } else {
                            gh2Var2 = gh2Var;
                        }
                        z4 = z3;
                        ne1Var7 = ne1Var5;
                        kc2Var3 = kc2VarItemColors;
                        i16 = i12;
                    }
                    ne1 ne1Var1111115 = ne1Var6;
                    kk0Var2.s();
                    kk0Var = kk0Var2;
                    cd2.DropdownMenuItemContent(ne1Var4, je1Var2, cVar3, ne1Var7, ne1Var1111115, z4, kc2Var3, hs2Var2, gh2Var2, kk0Var, i16 & 268435454);
                    cVar2 = cVar3;
                    ne1Var8 = ne1Var7;
                    ne1Var9 = ne1Var1111115;
                    z5 = z4;
                    kc2Var4 = kc2Var3;
                    hs2Var3 = hs2Var2;
                    gh2Var3 = gh2Var2;
                } else {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i17 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            ne1Var5 = null;
                        }
                        if (i6 != 0) {
                            ne1Var6 = null;
                        }
                        if (i8 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if ((i2 & 64) != 0) {
                            kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                            i12 &= -3670017;
                        } else {
                            kc2VarItemColors = kc2Var2;
                        }
                        if (i10 != 0) {
                            hs2Var2 = ic2.b;
                        } else {
                            hs2Var2 = hs2Var;
                        }
                        if (i14 != 0) {
                            gh2Var2 = null;
                        } else {
                            gh2Var2 = gh2Var;
                        }
                        z4 = z3;
                        ne1Var7 = ne1Var5;
                        kc2Var3 = kc2VarItemColors;
                        i16 = i12;
                    } else {
                        if (i17 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            ne1Var5 = null;
                        }
                        if (i6 != 0) {
                            ne1Var6 = null;
                        }
                        if (i8 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if ((i2 & 64) != 0) {
                            kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                            i12 &= -3670017;
                        } else {
                            kc2VarItemColors = kc2Var2;
                        }
                        if (i10 != 0) {
                            hs2Var2 = ic2.b;
                        } else {
                            hs2Var2 = hs2Var;
                        }
                        if (i14 != 0) {
                            gh2Var2 = null;
                        } else {
                            gh2Var2 = gh2Var;
                        }
                        z4 = z3;
                        ne1Var7 = ne1Var5;
                        kc2Var3 = kc2VarItemColors;
                        i16 = i12;
                    }
                    ne1 ne1Var1111116 = ne1Var6;
                    kk0Var2.s();
                    kk0Var = kk0Var2;
                    cd2.DropdownMenuItemContent(ne1Var4, je1Var2, cVar3, ne1Var7, ne1Var1111116, z4, kc2Var3, hs2Var2, gh2Var2, kk0Var, i16 & 268435454);
                    cVar2 = cVar3;
                    ne1Var8 = ne1Var7;
                    ne1Var9 = ne1Var1111116;
                    z5 = z4;
                    kc2Var4 = kc2Var3;
                    hs2Var3 = hs2Var2;
                    gh2Var3 = gh2Var2;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new yb(ne1Var, je1Var, cVar2, ne1Var8, ne1Var9, z5, kc2Var4, hs2Var3, gh2Var3, i, i2));
                }
            }
            i12 |= 100663296;
            if ((i12 & 38347923) == 38347922) {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i17 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        ne1Var5 = null;
                    }
                    if (i6 != 0) {
                        ne1Var6 = null;
                    }
                    if (i8 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if ((i2 & 64) != 0) {
                        kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                        i12 &= -3670017;
                    } else {
                        kc2VarItemColors = kc2Var2;
                    }
                    if (i10 != 0) {
                        hs2Var2 = ic2.b;
                    } else {
                        hs2Var2 = hs2Var;
                    }
                    if (i14 != 0) {
                        gh2Var2 = null;
                    } else {
                        gh2Var2 = gh2Var;
                    }
                    z4 = z3;
                    ne1Var7 = ne1Var5;
                    kc2Var3 = kc2VarItemColors;
                    i16 = i12;
                } else {
                    if (i17 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        ne1Var5 = null;
                    }
                    if (i6 != 0) {
                        ne1Var6 = null;
                    }
                    if (i8 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if ((i2 & 64) != 0) {
                        kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                        i12 &= -3670017;
                    } else {
                        kc2VarItemColors = kc2Var2;
                    }
                    if (i10 != 0) {
                        hs2Var2 = ic2.b;
                    } else {
                        hs2Var2 = hs2Var;
                    }
                    if (i14 != 0) {
                        gh2Var2 = null;
                    } else {
                        gh2Var2 = gh2Var;
                    }
                    z4 = z3;
                    ne1Var7 = ne1Var5;
                    kc2Var3 = kc2VarItemColors;
                    i16 = i12;
                }
                ne1 ne1Var1111117 = ne1Var6;
                kk0Var2.s();
                kk0Var = kk0Var2;
                cd2.DropdownMenuItemContent(ne1Var4, je1Var2, cVar3, ne1Var7, ne1Var1111117, z4, kc2Var3, hs2Var2, gh2Var2, kk0Var, i16 & 268435454);
                cVar2 = cVar3;
                ne1Var8 = ne1Var7;
                ne1Var9 = ne1Var1111117;
                z5 = z4;
                kc2Var4 = kc2Var3;
                hs2Var3 = hs2Var2;
                gh2Var3 = gh2Var2;
            } else {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i17 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        ne1Var5 = null;
                    }
                    if (i6 != 0) {
                        ne1Var6 = null;
                    }
                    if (i8 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if ((i2 & 64) != 0) {
                        kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                        i12 &= -3670017;
                    } else {
                        kc2VarItemColors = kc2Var2;
                    }
                    if (i10 != 0) {
                        hs2Var2 = ic2.b;
                    } else {
                        hs2Var2 = hs2Var;
                    }
                    if (i14 != 0) {
                        gh2Var2 = null;
                    } else {
                        gh2Var2 = gh2Var;
                    }
                    z4 = z3;
                    ne1Var7 = ne1Var5;
                    kc2Var3 = kc2VarItemColors;
                    i16 = i12;
                } else {
                    if (i17 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        ne1Var5 = null;
                    }
                    if (i6 != 0) {
                        ne1Var6 = null;
                    }
                    if (i8 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if ((i2 & 64) != 0) {
                        kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                        i12 &= -3670017;
                    } else {
                        kc2VarItemColors = kc2Var2;
                    }
                    if (i10 != 0) {
                        hs2Var2 = ic2.b;
                    } else {
                        hs2Var2 = hs2Var;
                    }
                    if (i14 != 0) {
                        gh2Var2 = null;
                    } else {
                        gh2Var2 = gh2Var;
                    }
                    z4 = z3;
                    ne1Var7 = ne1Var5;
                    kc2Var3 = kc2VarItemColors;
                    i16 = i12;
                }
                ne1 ne1Var1111118 = ne1Var6;
                kk0Var2.s();
                kk0Var = kk0Var2;
                cd2.DropdownMenuItemContent(ne1Var4, je1Var2, cVar3, ne1Var7, ne1Var1111118, z4, kc2Var3, hs2Var2, gh2Var2, kk0Var, i16 & 268435454);
                cVar2 = cVar3;
                ne1Var8 = ne1Var7;
                ne1Var9 = ne1Var1111118;
                z5 = z4;
                kc2Var4 = kc2Var3;
                hs2Var3 = hs2Var2;
                gh2Var3 = gh2Var2;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new yb(ne1Var, je1Var, cVar2, ne1Var8, ne1Var9, z5, kc2Var4, hs2Var3, gh2Var3, i, i2));
            }
        }
        i3 |= 196608;
        z2 = z;
        if ((1572864 & i) == 0) {
            if ((i2 & 64) == 0) {
                kc2Var2 = kc2Var;
                if (kk0Var2.h(kc2Var2)) {
                }
                i3 |= i18;
            } else {
                kc2Var2 = kc2Var;
            }
            i3 |= i18;
        } else {
            kc2Var2 = kc2Var;
        }
        i10 = i2 & Uuid.SIZE_BITS;
        if (i10 != 0) {
            i12 = i3 | 12582912;
        } else {
            i11 = i3;
            if ((i & 12582912) == 0) {
                if (kk0Var2.h(hs2Var)) {
                    i13 = 8388608;
                } else {
                    i13 = 4194304;
                }
                i12 = i11 | i13;
            } else {
                i12 = i11;
            }
        }
        i14 = i2 & FontInfo.NUMBER_OF_CHAR_CODES;
        if (i14 != 0) {
            if ((i & 100663296) == 0) {
                if (kk0Var2.h(gh2Var)) {
                    i15 = 67108864;
                } else {
                    i15 = 33554432;
                }
                i12 |= i15;
            }
            if ((i12 & 38347923) == 38347922) {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i17 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        ne1Var5 = null;
                    }
                    if (i6 != 0) {
                        ne1Var6 = null;
                    }
                    if (i8 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if ((i2 & 64) != 0) {
                        kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                        i12 &= -3670017;
                    } else {
                        kc2VarItemColors = kc2Var2;
                    }
                    if (i10 != 0) {
                        hs2Var2 = ic2.b;
                    } else {
                        hs2Var2 = hs2Var;
                    }
                    if (i14 != 0) {
                        gh2Var2 = null;
                    } else {
                        gh2Var2 = gh2Var;
                    }
                    z4 = z3;
                    ne1Var7 = ne1Var5;
                    kc2Var3 = kc2VarItemColors;
                    i16 = i12;
                } else {
                    if (i17 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        ne1Var5 = null;
                    }
                    if (i6 != 0) {
                        ne1Var6 = null;
                    }
                    if (i8 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if ((i2 & 64) != 0) {
                        kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                        i12 &= -3670017;
                    } else {
                        kc2VarItemColors = kc2Var2;
                    }
                    if (i10 != 0) {
                        hs2Var2 = ic2.b;
                    } else {
                        hs2Var2 = hs2Var;
                    }
                    if (i14 != 0) {
                        gh2Var2 = null;
                    } else {
                        gh2Var2 = gh2Var;
                    }
                    z4 = z3;
                    ne1Var7 = ne1Var5;
                    kc2Var3 = kc2VarItemColors;
                    i16 = i12;
                }
                ne1 ne1Var1111119 = ne1Var6;
                kk0Var2.s();
                kk0Var = kk0Var2;
                cd2.DropdownMenuItemContent(ne1Var4, je1Var2, cVar3, ne1Var7, ne1Var1111119, z4, kc2Var3, hs2Var2, gh2Var2, kk0Var, i16 & 268435454);
                cVar2 = cVar3;
                ne1Var8 = ne1Var7;
                ne1Var9 = ne1Var1111119;
                z5 = z4;
                kc2Var4 = kc2Var3;
                hs2Var3 = hs2Var2;
                gh2Var3 = gh2Var2;
            } else {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i17 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        ne1Var5 = null;
                    }
                    if (i6 != 0) {
                        ne1Var6 = null;
                    }
                    if (i8 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if ((i2 & 64) != 0) {
                        kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                        i12 &= -3670017;
                    } else {
                        kc2VarItemColors = kc2Var2;
                    }
                    if (i10 != 0) {
                        hs2Var2 = ic2.b;
                    } else {
                        hs2Var2 = hs2Var;
                    }
                    if (i14 != 0) {
                        gh2Var2 = null;
                    } else {
                        gh2Var2 = gh2Var;
                    }
                    z4 = z3;
                    ne1Var7 = ne1Var5;
                    kc2Var3 = kc2VarItemColors;
                    i16 = i12;
                } else {
                    if (i17 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        ne1Var5 = null;
                    }
                    if (i6 != 0) {
                        ne1Var6 = null;
                    }
                    if (i8 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if ((i2 & 64) != 0) {
                        kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                        i12 &= -3670017;
                    } else {
                        kc2VarItemColors = kc2Var2;
                    }
                    if (i10 != 0) {
                        hs2Var2 = ic2.b;
                    } else {
                        hs2Var2 = hs2Var;
                    }
                    if (i14 != 0) {
                        gh2Var2 = null;
                    } else {
                        gh2Var2 = gh2Var;
                    }
                    z4 = z3;
                    ne1Var7 = ne1Var5;
                    kc2Var3 = kc2VarItemColors;
                    i16 = i12;
                }
                ne1 ne1Var11111110 = ne1Var6;
                kk0Var2.s();
                kk0Var = kk0Var2;
                cd2.DropdownMenuItemContent(ne1Var4, je1Var2, cVar3, ne1Var7, ne1Var11111110, z4, kc2Var3, hs2Var2, gh2Var2, kk0Var, i16 & 268435454);
                cVar2 = cVar3;
                ne1Var8 = ne1Var7;
                ne1Var9 = ne1Var11111110;
                z5 = z4;
                kc2Var4 = kc2Var3;
                hs2Var3 = hs2Var2;
                gh2Var3 = gh2Var2;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new yb(ne1Var, je1Var, cVar2, ne1Var8, ne1Var9, z5, kc2Var4, hs2Var3, gh2Var3, i, i2));
            }
        }
        i12 |= 100663296;
        if ((i12 & 38347923) == 38347922) {
            kk0Var2.X();
            if ((i & 1) != 0) {
                if (i17 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if (i4 != 0) {
                    ne1Var5 = null;
                }
                if (i6 != 0) {
                    ne1Var6 = null;
                }
                if (i8 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if ((i2 & 64) != 0) {
                    kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                    i12 &= -3670017;
                } else {
                    kc2VarItemColors = kc2Var2;
                }
                if (i10 != 0) {
                    hs2Var2 = ic2.b;
                } else {
                    hs2Var2 = hs2Var;
                }
                if (i14 != 0) {
                    gh2Var2 = null;
                } else {
                    gh2Var2 = gh2Var;
                }
                z4 = z3;
                ne1Var7 = ne1Var5;
                kc2Var3 = kc2VarItemColors;
                i16 = i12;
            } else {
                if (i17 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if (i4 != 0) {
                    ne1Var5 = null;
                }
                if (i6 != 0) {
                    ne1Var6 = null;
                }
                if (i8 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if ((i2 & 64) != 0) {
                    kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                    i12 &= -3670017;
                } else {
                    kc2VarItemColors = kc2Var2;
                }
                if (i10 != 0) {
                    hs2Var2 = ic2.b;
                } else {
                    hs2Var2 = hs2Var;
                }
                if (i14 != 0) {
                    gh2Var2 = null;
                } else {
                    gh2Var2 = gh2Var;
                }
                z4 = z3;
                ne1Var7 = ne1Var5;
                kc2Var3 = kc2VarItemColors;
                i16 = i12;
            }
            ne1 ne1Var11111111 = ne1Var6;
            kk0Var2.s();
            kk0Var = kk0Var2;
            cd2.DropdownMenuItemContent(ne1Var4, je1Var2, cVar3, ne1Var7, ne1Var11111111, z4, kc2Var3, hs2Var2, gh2Var2, kk0Var, i16 & 268435454);
            cVar2 = cVar3;
            ne1Var8 = ne1Var7;
            ne1Var9 = ne1Var11111111;
            z5 = z4;
            kc2Var4 = kc2Var3;
            hs2Var3 = hs2Var2;
            gh2Var3 = gh2Var2;
        } else {
            kk0Var2.X();
            if ((i & 1) != 0) {
                if (i17 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if (i4 != 0) {
                    ne1Var5 = null;
                }
                if (i6 != 0) {
                    ne1Var6 = null;
                }
                if (i8 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if ((i2 & 64) != 0) {
                    kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                    i12 &= -3670017;
                } else {
                    kc2VarItemColors = kc2Var2;
                }
                if (i10 != 0) {
                    hs2Var2 = ic2.b;
                } else {
                    hs2Var2 = hs2Var;
                }
                if (i14 != 0) {
                    gh2Var2 = null;
                } else {
                    gh2Var2 = gh2Var;
                }
                z4 = z3;
                ne1Var7 = ne1Var5;
                kc2Var3 = kc2VarItemColors;
                i16 = i12;
            } else {
                if (i17 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if (i4 != 0) {
                    ne1Var5 = null;
                }
                if (i6 != 0) {
                    ne1Var6 = null;
                }
                if (i8 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if ((i2 & 64) != 0) {
                    kc2VarItemColors = ic2.a.itemColors(kk0Var2, 6);
                    i12 &= -3670017;
                } else {
                    kc2VarItemColors = kc2Var2;
                }
                if (i10 != 0) {
                    hs2Var2 = ic2.b;
                } else {
                    hs2Var2 = hs2Var;
                }
                if (i14 != 0) {
                    gh2Var2 = null;
                } else {
                    gh2Var2 = gh2Var;
                }
                z4 = z3;
                ne1Var7 = ne1Var5;
                kc2Var3 = kc2VarItemColors;
                i16 = i12;
            }
            ne1 ne1Var11111112 = ne1Var6;
            kk0Var2.s();
            kk0Var = kk0Var2;
            cd2.DropdownMenuItemContent(ne1Var4, je1Var2, cVar3, ne1Var7, ne1Var11111112, z4, kc2Var3, hs2Var2, gh2Var2, kk0Var, i16 & 268435454);
            cVar2 = cVar3;
            ne1Var8 = ne1Var7;
            ne1Var9 = ne1Var11111112;
            z5 = z4;
            kc2Var4 = kc2Var3;
            hs2Var3 = hs2Var2;
            gh2Var3 = gh2Var2;
        }
        w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new yb(ne1Var, je1Var, cVar2, ne1Var8, ne1Var9, z5, kc2Var4, hs2Var3, gh2Var3, i, i2));
        }
    }
}
